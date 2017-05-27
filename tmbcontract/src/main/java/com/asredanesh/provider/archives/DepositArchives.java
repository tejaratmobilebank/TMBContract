package com.asredanesh.provider.archives;

/**
 * Deposit archives table name and columns and action type
 */
public final class DepositArchives extends ArchiveTable {

    /**
     * deposit archive's table name
     */
    public static final String TABLE_NAME = "archivesDeposit";
    /**
     * through which gateway
     */
    public static final String COLUMN_THROUGH = "Through";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * no public constructor since this is a utility class
     */
    private DepositArchives() {
    }
}
