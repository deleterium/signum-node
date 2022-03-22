/*
 * This file is generated by jOOQ.
 */
package brs.schema;


import brs.schema.tables.Account;
import brs.schema.tables.AccountAsset;
import brs.schema.tables.Alias;
import brs.schema.tables.AliasOffer;
import brs.schema.tables.AskOrder;
import brs.schema.tables.Asset;
import brs.schema.tables.AssetTransfer;
import brs.schema.tables.At;
import brs.schema.tables.AtState;
import brs.schema.tables.BidOrder;
import brs.schema.tables.Block;
import brs.schema.tables.Escrow;
import brs.schema.tables.EscrowDecision;
import brs.schema.tables.FlywaySchemaHistory;
import brs.schema.tables.Goods;
import brs.schema.tables.IndirectIncoming;
import brs.schema.tables.Lp;
import brs.schema.tables.LpBalances;
import brs.schema.tables.LpTokens;
import brs.schema.tables.Peer;
import brs.schema.tables.Purchase;
import brs.schema.tables.PurchaseFeedback;
import brs.schema.tables.PurchasePublicFeedback;
import brs.schema.tables.RewardRecipAssign;
import brs.schema.tables.Subscription;
import brs.schema.tables.Trade;
import brs.schema.tables.Transaction;
import brs.schema.tables.UnconfirmedTransaction;


/**
 * Convenience access to all tables in DB.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>DB.account</code>.
     */
    public static final Account ACCOUNT = Account.ACCOUNT;

    /**
     * The table <code>DB.account_asset</code>.
     */
    public static final AccountAsset ACCOUNT_ASSET = AccountAsset.ACCOUNT_ASSET;

    /**
     * The table <code>DB.alias</code>.
     */
    public static final Alias ALIAS = Alias.ALIAS;

    /**
     * The table <code>DB.alias_offer</code>.
     */
    public static final AliasOffer ALIAS_OFFER = AliasOffer.ALIAS_OFFER;

    /**
     * The table <code>DB.ask_order</code>.
     */
    public static final AskOrder ASK_ORDER = AskOrder.ASK_ORDER;

    /**
     * The table <code>DB.asset</code>.
     */
    public static final Asset ASSET = Asset.ASSET;

    /**
     * The table <code>DB.asset_transfer</code>.
     */
    public static final AssetTransfer ASSET_TRANSFER = AssetTransfer.ASSET_TRANSFER;

    /**
     * The table <code>DB.at</code>.
     */
    public static final At AT = At.AT;

    /**
     * The table <code>DB.at_state</code>.
     */
    public static final AtState AT_STATE = AtState.AT_STATE;

    /**
     * The table <code>DB.bid_order</code>.
     */
    public static final BidOrder BID_ORDER = BidOrder.BID_ORDER;

    /**
     * The table <code>DB.block</code>.
     */
    public static final Block BLOCK = Block.BLOCK;

    /**
     * The table <code>DB.escrow</code>.
     */
    public static final Escrow ESCROW = Escrow.ESCROW;

    /**
     * The table <code>DB.escrow_decision</code>.
     */
    public static final EscrowDecision ESCROW_DECISION = EscrowDecision.ESCROW_DECISION;

    /**
     * The table <code>DB.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>DB.goods</code>.
     */
    public static final Goods GOODS = Goods.GOODS;

    /**
     * The table <code>DB.indirect_incoming</code>.
     */
    public static final IndirectIncoming INDIRECT_INCOMING = IndirectIncoming.INDIRECT_INCOMING;

    /**
     * The table <code>DB.lp</code>.
     */
    public static final Lp LP = Lp.LP;

    /**
     * The table <code>DB.lp_balances</code>.
     */
    public static final LpBalances LP_BALANCES = LpBalances.LP_BALANCES;

    /**
     * The table <code>DB.lp_tokens</code>.
     */
    public static final LpTokens LP_TOKENS = LpTokens.LP_TOKENS;

    /**
     * The table <code>DB.peer</code>.
     */
    public static final Peer PEER = Peer.PEER;

    /**
     * The table <code>DB.purchase</code>.
     */
    public static final Purchase PURCHASE = Purchase.PURCHASE;

    /**
     * The table <code>DB.purchase_feedback</code>.
     */
    public static final PurchaseFeedback PURCHASE_FEEDBACK = PurchaseFeedback.PURCHASE_FEEDBACK;

    /**
     * The table <code>DB.purchase_public_feedback</code>.
     */
    public static final PurchasePublicFeedback PURCHASE_PUBLIC_FEEDBACK = PurchasePublicFeedback.PURCHASE_PUBLIC_FEEDBACK;

    /**
     * The table <code>DB.reward_recip_assign</code>.
     */
    public static final RewardRecipAssign REWARD_RECIP_ASSIGN = RewardRecipAssign.REWARD_RECIP_ASSIGN;

    /**
     * The table <code>DB.subscription</code>.
     */
    public static final Subscription SUBSCRIPTION = Subscription.SUBSCRIPTION;

    /**
     * The table <code>DB.trade</code>.
     */
    public static final Trade TRADE = Trade.TRADE;

    /**
     * The table <code>DB.transaction</code>.
     */
    public static final Transaction TRANSACTION = Transaction.TRANSACTION;

    /**
     * The table <code>DB.unconfirmed_transaction</code>.
     */
    public static final UnconfirmedTransaction UNCONFIRMED_TRANSACTION = UnconfirmedTransaction.UNCONFIRMED_TRANSACTION;
}
