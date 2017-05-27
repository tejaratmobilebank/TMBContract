package com.asredanesh.provider.archives;

/**
 * Paya transfer archives table name and columns and action type
 */
public final class PayaTransferArchives extends ArchiveTable {

    /**
     * paya archive's table name
     */
    public static final String TABLE_NAME = "archivesPayaTransfer";
    /**
     * the destination account or card of transfer
     */
    public static final String COLUMN_DEST = "Dest";
    /**
     * the destination name of transfer
     */
    public static final String COLUMN_DEST_NAME = "DestName";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * no public constructor since this is a utility class
     */
    private PayaTransferArchives() {
    }
}
