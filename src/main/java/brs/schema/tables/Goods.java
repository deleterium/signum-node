/*
 * This file is generated by jOOQ.
 */
package brs.schema.tables;


import brs.schema.Db;
import brs.schema.Indexes;
import brs.schema.Keys;
import brs.schema.tables.records.GoodsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Goods extends TableImpl<GoodsRecord> {

    private static final long serialVersionUID = -123898066;

    /**
     * The reference instance of <code>DB.goods</code>
     */
    public static final Goods GOODS = new Goods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GoodsRecord> getRecordType() {
        return GoodsRecord.class;
    }

    /**
     * The column <code>DB.goods.db_id</code>.
     */
    public final TableField<GoodsRecord, Long> DB_ID = createField(DSL.name("db_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>DB.goods.id</code>.
     */
    public final TableField<GoodsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.goods.seller_id</code>.
     */
    public final TableField<GoodsRecord, Long> SELLER_ID = createField(DSL.name("seller_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.goods.name</code>.
     */
    public final TableField<GoodsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>DB.goods.description</code>.
     */
    public final TableField<GoodsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>DB.goods.tags</code>.
     */
    public final TableField<GoodsRecord, String> TAGS = createField(DSL.name("tags"), org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>DB.goods.timestamp</code>.
     */
    public final TableField<GoodsRecord, Integer> TIMESTAMP = createField(DSL.name("timestamp"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.goods.quantity</code>.
     */
    public final TableField<GoodsRecord, Integer> QUANTITY = createField(DSL.name("quantity"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.goods.price</code>.
     */
    public final TableField<GoodsRecord, Long> PRICE = createField(DSL.name("price"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.goods.delisted</code>.
     */
    public final TableField<GoodsRecord, Boolean> DELISTED = createField(DSL.name("delisted"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>DB.goods.height</code>.
     */
    public final TableField<GoodsRecord, Integer> HEIGHT = createField(DSL.name("height"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.goods.latest</code>.
     */
    public final TableField<GoodsRecord, Boolean> LATEST = createField(DSL.name("latest"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>DB.goods</code> table reference
     */
    public Goods() {
        this(DSL.name("goods"), null);
    }

    /**
     * Create an aliased <code>DB.goods</code> table reference
     */
    public Goods(String alias) {
        this(DSL.name(alias), GOODS);
    }

    /**
     * Create an aliased <code>DB.goods</code> table reference
     */
    public Goods(Name alias) {
        this(alias, GOODS);
    }

    private Goods(Name alias, Table<GoodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Goods(Name alias, Table<GoodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Goods(Table<O> child, ForeignKey<O, GoodsRecord> key) {
        super(child, key, GOODS);
    }

    @Override
    public Schema getSchema() {
        return Db.DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GOODS_GOODS_ID_HEIGHT_IDX, Indexes.GOODS_GOODS_SELLER_ID_NAME_IDX, Indexes.GOODS_GOODS_TIMESTAMP_IDX, Indexes.GOODS_PRIMARY);
    }

    @Override
    public Identity<GoodsRecord, Long> getIdentity() {
        return Keys.IDENTITY_GOODS;
    }

    @Override
    public UniqueKey<GoodsRecord> getPrimaryKey() {
        return Keys.KEY_GOODS_PRIMARY;
    }

    @Override
    public List<UniqueKey<GoodsRecord>> getKeys() {
        return Arrays.<UniqueKey<GoodsRecord>>asList(Keys.KEY_GOODS_PRIMARY, Keys.KEY_GOODS_GOODS_ID_HEIGHT_IDX);
    }

    @Override
    public Goods as(String alias) {
        return new Goods(DSL.name(alias), this);
    }

    @Override
    public Goods as(Name alias) {
        return new Goods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Goods rename(String name) {
        return new Goods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Goods rename(Name name) {
        return new Goods(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, String, String, String, Integer, Integer, Long, Boolean, Integer, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
