package com.asredanesh.provider.archives;

/**
 * Accounts flows table name and columns
 *
 * @author f.keramat
 */

public class FlowArchives extends ArchiveTable {

    /**
     * charge archive's table name
     */
    public static final String TABLE_NAME = "Flow";

    /**
     * balance of account
     */
    public static final String COLUMN_BALANCE = "balance";

    /**
     *
     */
    public static final String COLUMN_DEBIT_CREDIT = "DebitCredit";
    public static final String COLUMN_RESPONSE_DATETIME = "ResponseDT";

    /**
     * no public constructor since this is a utility class
     */
    private FlowArchives() {
    }
}
