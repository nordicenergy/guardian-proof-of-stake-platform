/*
 * Copyright © 2013-2016 The Nxt Core Developers.
 * Copyright © 2016-2019 Jelurida IP B.V.
 *
 * See the LICENSE.txt file at the top-level directory of this distribution
 * for licensing information.
 *
 * Unless otherwise agreed in a custom licensing agreement with Jelurida B.V.,
 * no part of this software, including this file, may be copied, modified,
 * propagated, or distributed except according to the terms contained in the
 * LICENSE.txt file.
 *
 * Removal or modification of this copyright notice is prohibited.
 *
 */

package nxt.http;

import nxt.Nxt;
import nxt.NxtException;
import nxt.ae.AssetExchangeTransactionType;
import nxt.ae.OrderCancellationAttachment;
import nxt.ae.OrderHome;
import nxt.blockchain.ChildChain;
import nxt.blockchain.Transaction;
import nxt.db.DbIterator;
import nxt.util.Filter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

public final class GetBidOrders extends APIServlet.APIRequestHandler {

    static final GetBidOrders instance = new GetBidOrders();

    private GetBidOrders() {
        super(new APITag[] {APITag.AE}, "asset", "firstIndex", "lastIndex", "showExpectedCancellations");
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest req) throws NxtException {

        long assetId = ParameterParser.getUnsignedLong(req, "asset", true);
        int firstIndex = ParameterParser.getFirstIndex(req);
        int lastIndex = ParameterParser.getLastIndex(req);
        boolean showExpectedCancellations = "true".equalsIgnoreCase(req.getParameter("showExpectedCancellations"));
        ChildChain childChain = ParameterParser.getChildChain(req);

        long[] cancellations = null;
        if (showExpectedCancellations) {
            Filter<Transaction> filter = transaction ->
                    transaction.getType() == AssetExchangeTransactionType.BID_ORDER_CANCELLATION
                    && transaction.getChain() == childChain;
            List<? extends Transaction> transactions = Nxt.getBlockchain().getExpectedTransactions(filter);
            cancellations = new long[transactions.size()];
            for (int i = 0; i < transactions.size(); i++) {
                OrderCancellationAttachment attachment = (OrderCancellationAttachment) transactions.get(i).getAttachment();
                cancellations[i] = attachment.getOrderId();
            }
            Arrays.sort(cancellations);
        }

        JSONArray orders = new JSONArray();
        try (DbIterator<OrderHome.Bid> bidOrders = childChain.getOrderHome().getSortedBidOrders(assetId, firstIndex, lastIndex)) {
            while (bidOrders.hasNext()) {
                OrderHome.Bid order = bidOrders.next();
                JSONObject orderJSON = JSONData.bidOrder(order);
                if (showExpectedCancellations && Arrays.binarySearch(cancellations, order.getId()) >= 0) {
                    orderJSON.put("expectedCancellation", Boolean.TRUE);
                }
                orders.add(orderJSON);
            }
        }
        JSONObject response = new JSONObject();
        response.put("bidOrders", orders);
        return response;
    }

}
