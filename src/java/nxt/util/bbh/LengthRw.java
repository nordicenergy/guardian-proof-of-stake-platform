/*
 * Copyright © 2020-2020 The Nordic Energy Core Developers
 *
 * See the LICENSE.txt file at the top-level directory of this distribution
 * for licensing information.
 *
 * Unless otherwise agreed in a custom licensing agreement with Nordic Energy.,
 * no part of this software, including this file, may be copied, modified,
 * propagated, or distributed except according to the terms contained in the
 * LICENSE.txt file.
 *
 * Removal or modification of this copyright notice is prohibited.
 *
 */

package nxt.util.bbh;

import nxt.NxtException;
import nxt.util.Convert;

import java.nio.ByteBuffer;

public interface LengthRw {
    int getSize();

    int readFromBuffer(ByteBuffer buffer) throws NxtException.NotValidException;

    void writeToBuffer(ByteBuffer buffer, int length);

    boolean validate(int length);

    static StringLengthRw maxStringLen(int maxCharLength) {
        LengthRw lengthRw = LengthRwPrimitiveType.getByMaxLength(Convert.getMaxStringSize(maxCharLength));
        return new StringLengthRw(lengthRw, maxCharLength);
    }
}
