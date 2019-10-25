/*
 * This file is generated by jOOQ.
 */
package brs.schema.tables.records;


import brs.schema.tables.Account;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class AccountRecord extends UpdatableRecordImpl<AccountRecord> implements Record12<Long, Long, Integer, byte[], Integer, Long, Long, Long, String, String, Integer, Boolean> {

    private static final long serialVersionUID = -2126336236;

    /**
     * Setter for <code>DB.account.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB.account.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB.account.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>DB.account.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>DB.account.creation_height</code>.
     */
    public void setCreationHeight(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>DB.account.creation_height</code>.
     */
    public Integer getCreationHeight() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>DB.account.public_key</code>.
     */
    public void setPublicKey(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>DB.account.public_key</code>.
     */
    public byte[] getPublicKey() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>DB.account.key_height</code>.
     */
    public void setKeyHeight(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>DB.account.key_height</code>.
     */
    public Integer getKeyHeight() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB.account.balance</code>.
     */
    public void setBalance(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>DB.account.balance</code>.
     */
    public Long getBalance() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>DB.account.unconfirmed_balance</code>.
     */
    public void setUnconfirmedBalance(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>DB.account.unconfirmed_balance</code>.
     */
    public Long getUnconfirmedBalance() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>DB.account.forged_balance</code>.
     */
    public void setForgedBalance(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>DB.account.forged_balance</code>.
     */
    public Long getForgedBalance() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>DB.account.name</code>.
     */
    public void setName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>DB.account.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB.account.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>DB.account.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB.account.height</code>.
     */
    public void setHeight(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>DB.account.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>DB.account.latest</code>.
     */
    public void setLatest(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>DB.account.latest</code>.
     */
    public Boolean getLatest() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Integer, byte[], Integer, Long, Long, Long, String, String, Integer, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, Integer, byte[], Integer, Long, Long, Long, String, String, Integer, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Account.ACCOUNT.DB_ID;
    }

    @Override
    public Field<Long> field2() {
        return Account.ACCOUNT.ID;
    }

    @Override
    public Field<Integer> field3() {
        return Account.ACCOUNT.CREATION_HEIGHT;
    }

    @Override
    public Field<byte[]> field4() {
        return Account.ACCOUNT.PUBLIC_KEY;
    }

    @Override
    public Field<Integer> field5() {
        return Account.ACCOUNT.KEY_HEIGHT;
    }

    @Override
    public Field<Long> field6() {
        return Account.ACCOUNT.BALANCE;
    }

    @Override
    public Field<Long> field7() {
        return Account.ACCOUNT.UNCONFIRMED_BALANCE;
    }

    @Override
    public Field<Long> field8() {
        return Account.ACCOUNT.FORGED_BALANCE;
    }

    @Override
    public Field<String> field9() {
        return Account.ACCOUNT.NAME;
    }

    @Override
    public Field<String> field10() {
        return Account.ACCOUNT.DESCRIPTION;
    }

    @Override
    public Field<Integer> field11() {
        return Account.ACCOUNT.HEIGHT;
    }

    @Override
    public Field<Boolean> field12() {
        return Account.ACCOUNT.LATEST;
    }

    @Override
    public Long component1() {
        return getDbId();
    }

    @Override
    public Long component2() {
        return getId();
    }

    @Override
    public Integer component3() {
        return getCreationHeight();
    }

    @Override
    public byte[] component4() {
        return getPublicKey();
    }

    @Override
    public Integer component5() {
        return getKeyHeight();
    }

    @Override
    public Long component6() {
        return getBalance();
    }

    @Override
    public Long component7() {
        return getUnconfirmedBalance();
    }

    @Override
    public Long component8() {
        return getForgedBalance();
    }

    @Override
    public String component9() {
        return getName();
    }

    @Override
    public String component10() {
        return getDescription();
    }

    @Override
    public Integer component11() {
        return getHeight();
    }

    @Override
    public Boolean component12() {
        return getLatest();
    }

    @Override
    public Long value1() {
        return getDbId();
    }

    @Override
    public Long value2() {
        return getId();
    }

    @Override
    public Integer value3() {
        return getCreationHeight();
    }

    @Override
    public byte[] value4() {
        return getPublicKey();
    }

    @Override
    public Integer value5() {
        return getKeyHeight();
    }

    @Override
    public Long value6() {
        return getBalance();
    }

    @Override
    public Long value7() {
        return getUnconfirmedBalance();
    }

    @Override
    public Long value8() {
        return getForgedBalance();
    }

    @Override
    public String value9() {
        return getName();
    }

    @Override
    public String value10() {
        return getDescription();
    }

    @Override
    public Integer value11() {
        return getHeight();
    }

    @Override
    public Boolean value12() {
        return getLatest();
    }

    @Override
    public AccountRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    @Override
    public AccountRecord value2(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AccountRecord value3(Integer value) {
        setCreationHeight(value);
        return this;
    }

    @Override
    public AccountRecord value4(byte... value) {
        setPublicKey(value);
        return this;
    }

    @Override
    public AccountRecord value5(Integer value) {
        setKeyHeight(value);
        return this;
    }

    @Override
    public AccountRecord value6(Long value) {
        setBalance(value);
        return this;
    }

    @Override
    public AccountRecord value7(Long value) {
        setUnconfirmedBalance(value);
        return this;
    }

    @Override
    public AccountRecord value8(Long value) {
        setForgedBalance(value);
        return this;
    }

    @Override
    public AccountRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public AccountRecord value10(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public AccountRecord value11(Integer value) {
        setHeight(value);
        return this;
    }

    @Override
    public AccountRecord value12(Boolean value) {
        setLatest(value);
        return this;
    }

    @Override
    public AccountRecord values(Long value1, Long value2, Integer value3, byte[] value4, Integer value5, Long value6, Long value7, Long value8, String value9, String value10, Integer value11, Boolean value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountRecord
     */
    public AccountRecord() {
        super(Account.ACCOUNT);
    }

    /**
     * Create a detached, initialised AccountRecord
     */
    public AccountRecord(Long dbId, Long id, Integer creationHeight, byte[] publicKey, Integer keyHeight, Long balance, Long unconfirmedBalance, Long forgedBalance, String name, String description, Integer height, Boolean latest) {
        super(Account.ACCOUNT);

        set(0, dbId);
        set(1, id);
        set(2, creationHeight);
        set(3, publicKey);
        set(4, keyHeight);
        set(5, balance);
        set(6, unconfirmedBalance);
        set(7, forgedBalance);
        set(8, name);
        set(9, description);
        set(10, height);
        set(11, latest);
    }
}
