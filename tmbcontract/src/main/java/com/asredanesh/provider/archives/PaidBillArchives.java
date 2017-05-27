package com.asredanesh.provider.archives;

/**
 * Paid bill archives table name and columns and action type
 */
public final class PaidBillArchives extends ArchiveTable {

    /**
     * payed bill archives's table name
     */
    public static final String TABLE_NAME = "archivesPayBill";

    /**
     * bill id
     */
    public static final String COLUMN_BILL_ID = "BillId";
    /**
     * payment id
     */
    public static final String COLUMN_PAY_ID = "PayId";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * no public constructor since this is a utility class
     */
    private PaidBillArchives() {
    }
}
