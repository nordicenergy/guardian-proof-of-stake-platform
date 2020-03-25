# The Guardian - Proof of Stake Consensus Protocol (idea)

### Guardian is an open source multichain platform and proof-of-stake consensus protocol to preventing pandemics and global catastrophe.


### Free the globe from pandemic

We have to save the world. Peoples is dying in front of our eyes. And without community, there is no humanity. If we want to breathe, we need t healthier environment, trees, clean air, energy, water, electricity, better recycling and plastic waste, If we want nature around us, we have to maintain the “circle of life”. If there is no habitat for animals to live in, it affects not only them – it affects us! Fires, floods , hurricanes, droughts, air pollution, human-to-human diseases and viruses – and the list goes on, very long and expands day by day. In each of these cases, nature shows us clearly that it doesn’t need people. However, people need nature, community and will always need it.

We do not yet know whether the final toll will be measured in thousands or hundreds of thousands. For all our advances in medicine, humanity remains much more vulnerable to pandemics than we would like to believe. To understand our vulnerability, and to determine what steps must be taken to end it, it is useful to ask about the very worst-case scenarios. Just how bad could a pandemic be? This is why we need worst-case thinking to prevent pandemics.


# Business and Platform Developments



## Features of Guardian Blockchain

- One parent chain with multiple child chains

- Only the parent chain token (GRD) is used in the proof-of-stake consensus, and thus provides security for all side chains.

- side (child) chain tokens example: Nordic Energy, Green Ventures, and PowerChain tokens can be used as transactional units of value only.

### Transaction fees: 

- On each chain transaction fees are paid in the Guardian native token (coin) of that chain. End users do not need to own Guardian (GRD) tokens. 

- A business can sponsor the transaction fees for specific child chain or transaction type by running a custom bundler, in which case end users do need to pay fees at all.

### Main Features: 

- All these features are also present in Guardian, and are available on each side chain.

- A Side chain can optionally be restricted not to enable some features.

- The parent chain supports a limited subset of features, as it is intended to be used for consensus establishing only and not for everyday transactions.

### Accounts:

The same mapping of passphrases to account numbers is used as in GRD. Accounts are global across all side chains, and an account can have balances in each of the existing side chain coins, as well as in Guardian.

### Holdings: 

- Each blockchain has its own coin. Assets and multi-currencies can be issued on any side chain, and are available for trading globally.

- Assets or multiple currencies can optionally be restricted* to some side chains only.

### Trading:

Assets and multiple currencies can be traded on any child chain, with price denominated in the corresponding side chain coin.

### Exchange:

Coin Exchange, allows trading of side chain coins to each other, and also to the parent blockchain native coin Guardian (GRD).


### Dividends:

Asset dividends can be paid in any of the side chain coins, by simply issuing the payment transaction on the corresponding chain.


### Asset Quantity:

A transaction type has been added, allowing the asset issuer to create new shares, in order to perform stock split or capital increase our corporate actions and additional projects.

### Asset Properties:

The Asset Properties feature allows assets to be tagged with arbitrary name/value metadata.


### Crowdfunding:

Crowdfunding feature is available on all child chains, and on each side chain the funds are collected in the corresponding coin. Reserve and claim transactions must happen on the side chain the currency was issued on.

### Suffling:

On each side chain, shuffling of the corresponding coin, or any Asset or Multi-Currency, is supported. Shuffling-as-a-Service is provided by an automated Standby Shuffling add-on.

### Aliases:

Alias names are unique within each side chain only.

### Multi-Currencies:

Currency codes and names are unique within a side chain only.

### Pruning:

- Pruning and retrieving of all prunable data is available as in GDR.

- In addition, the child chain transactions themselves are designed to be prunable and will not need to be stored permanently or re-downloaded by every new node. The actual pruning of transactions will be implemented later.

### Transaction Identifiers:

The 64-bit transaction IDs are no longer guaranteed to be globally unique for side chains. 256-bit transaction hashes (sha256 digests) are used instead as transaction identifiers.

### Blockchain Generation:

- The same forging algorithm is used as in GRD, dependent on Guardian account balances only.

### Bundling:

- A process, "bundling", is used to group side chain transactions into a parent chain transaction ("side chain block"), which is then included in the parent chain.

- Any account can play the role of a bundler. The bundling process also performs the exchange of fees paid by users in side chain tokens into Guardian (GRD) coin fees accepted by the block forgers.

### Phasing:

Same voting models as in GRD, but phasing is possible on side chains only. Approval transactions can be on a different child chain from the phased transaction, and the by-transaction voting model also supports linking to a transaction hash on a different side chain.

### Composite Phasing:

The new "Smart Phasing" feature allows the conditions for the execution of a phased transaction to be combined using AND, OR, and NOT Boolean operators, in a composite voting model. In this way declarative smart contracts can be built on top of the already available voting model primitives.

### By-Property Voting Model:

A "by-property" voting model has been added, making the execution of a phased transaction conditional on its sender account having a specified property set. This can be combined with the new Asset Control feature, to allow only authorized or KYC-verified accounts to transact with some asset.

### Account Control:

Same as in Guardian, but accounts under phasing-only restriction cannot submit transactions on the parent chain, as those cannot be phased.

### Asset Control:

The asset issuer can impose a phasing-only restriction on all transactions affecting the asset. This allows enforcing shareholder agreements that require shareholder approval, or board of directors approval, on all transactions with company shares.

### Side Chain Control:

Side Chain Control can be used to make a Side chain permissioned, with configurable user authorization levels, allowing the chain administrators to grant or revoke transaction privileges to the users of such permissioned Side chain.

### Secret Sharing

The Guardian platform support the use of Secret Sharing for splitting an account passphrase into several pieces, and reconstructing it from only a few of those pieces.

### Smart Contracts:

Smart Contracts represent a framework for developing a layer of automation on top of the existing Guardian APIs. Smart Contracts do not run on all nodes, only on those who elect to execute them. Being stateless, contracts do not store data on the blockchain and do not manipulate blockchain objects directly, but only submit standard blockchain transactions as a result of their execution.

### Transaction Vouchers:

Users can request a payment by preparing a digitally signed transaction template (voucher), and sending it to the payer off-blockchain. The payer then simply loads the template, verifies the amount and other details, signs and submits the transaction.

### Peer Networking

Completely re-written and optimized based of Ardor blockchain, using native Java sockets and binary messages between peers. Block and transaction propagation has been significantly improved, by exchanging and caching information about currently available blocks and transactions between peers and only propagating the missing data pieces.

### API

#### Mostly unchanged, except:

1. A "chain" parameter has been added to each API that is side chain specific.

2. 64-bit long transaction IDs have been replaced with 256-bit hashes.

3. All prices and rates that were previously defined relative to the smallest indivisible holding amount ("QNT") are now defined relative to a unit of the holding (share).

### Scalability

All side chain transactions will be possible to prune completely, without affecting blockchain security, thus allowing the blockchain size to be kept much smaller. A new node joining the network only needs to download the parent chain transactions, followed by the latest snapshot of the current system state.*


# Technology

Guardian cross-platform based of Ethereum and Nxt blockchains.


### Proof of Stake Consensus

Guardian blockchain is transparent, scalability and implement a pure proof-of-stake consensus protocol. Reliable and energy efficient, with minimal hardware requirements


### Preventing Pandemics

The Guardian consensus platform on assets, research priorities and cross-chain protocols. The right strategy for short-circuiting transmission and preventing future pandemics.


### Community & Donate Platform

Donation platform connects people who can help others in need and those who are in need. When you register to platform you can either provide your help to someone or request help to yourself or to your elder family member. Especially this app aims to help the elderly and other Covid-19 risk groups.

### Crowdsale & Digital Asset Platform

Multiple tokens can be distributed in a variety of ways, and one popular method is holding a crowdsale, like an initial coin offering (ICO) and Security Token Offering (STO). Crowdsales are a way for a company or societies to raise capital for the help crisis or business by creating our own token is ERC-20 standard token that can be purchased with cryptocurrencies like Bitcoin, Ethereum’s native currency. Whenever a crowdsale takes place, a company gets liquid capital in the form of ether that was paid in by investors in exchange for the token. The company is also able to reserve some amount of ERC-20 tokens that were sold in the crowdsale.

In order to participate, an investor must connect to the ethereum blockchain with an account. This account has a wallet address that can store ether, as well as the ERC 20 tokens that are purchased in the crowdsale. The investor must visit a crowdsale website that talks to a smart contract, and this smart contract governs all the rules about how crowdsale works. Whenever an investor purchases tokens on the crowdsale website, they send ether to a smart contract, and smart contract instantly dispensers the tokens that they purchased to their wallet.

### Fundraising platform (consept development)

On GreenVentures platform, we've seen how far a great fundraiser title can go towards fundraising success.

https://greenventures.app


### Blockchain Framework

The Guardian software is designed as a universal framework for the ongoing distributed ledger technology transformation. Its simple but flexible architecture makes blockchain adoption easy, and can be extended to fit any public or private use case.


### Decentralized Asset Exchange

Blockchain to launch a user-friendly and yet fully decentralized asset exchange. Anyone can issue and trade tokens on top of Guardian, and orders are matched and executed directly on the blockchain itself.


### Stability

The Guardian blockchain based of Nxt blockchain technology has been live in production for nearly 6 years with virtually no downtime, no major bugs, and no successful exploits. Millions of multi-token transactions have been conducted reliably, establishing its reputation as one of the most secure platforms in the blockchain industry.


### Token Economies

Nordic Energy´s COVI token and Guardian native token innovations saves lives and human suffering for billions. It helps communities to build healthier environment and Businesses create trust and stability. 


## The Highly Secured Cryptocurrency Wallet

#### User panel:

Guardian app is a complete web wallet that where user can use to buy coin using fiat and cryptocurrency and can withdrawals. The wallet is polished with an interesting color combination with modern design, clean code, and easy to customize very easy to use for all users. It has a variety of features such as the Crypto Wallet, Affiliate System, and many other features in the system.

#### Admin Panel:

Guardian admin dashboard is a complete web wallet that where user can use to buy our coin using fiat and cryptocurrency and can withdrawals. The wallet is polished with an interesting color combination with modern design, clean code, and easy to customize very easy to use for all users. It has a variety of features such as the Crypto Wallet, Affiliate System, and many other features in the system.

### Mobile App

Guardian mobile wallet app is a complete web wallet that our user can use to buy coin using fiat and cryptocurrency and can withdrawals. The wallet is polished with an interesting color combination with modern design, clean code, and easy to customize very easy to use for all users. It has a variety of features such as the Crypto Wallet, Affiliate System, and many other features in the system.


## Developments

By using Green Ventures name for the company?

Here is the additional project to use this project source code to develop Guardian token management dashboard

https://nordicenergy.app


### TODO

1. Blockchain developments, installations and protocol
2. Token economy and development
3. Smart Contracts (ERC20)
4. Project Website
5. Server installation
6. Domain
7. Whitepaper development and technical writings
8. Token/coin functionality
5. Native token
6. Social media and marketing
7. Team and project developments
8. Web developments and graphics desings
9. Brand & Logo
10. Infographics, illustrations
11. Web & Wallet application
12. ICO/STO management & user dashboard
13. Disaster assistance application.



