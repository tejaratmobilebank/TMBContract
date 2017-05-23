package com.asredanesh.provider.archives;

/**
 * Withdrawal archives table name and columns and action type
 */
public final class WithdrawalArchives extends ArchiveTable {

    /**
     * withdrawal archive's table name
     */
    public static final String TABLE_NAME = "archivesWithdrawal";

    /**
     * the gateway used to withdrawal
     */
    public static final String COLUMN_THROUGH = "Through";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * no public constructor since this is a utility class
     */
    private WithdrawalArchives() {
    }
}
