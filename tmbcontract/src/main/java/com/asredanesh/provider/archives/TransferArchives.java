package com.asredanesh.provider.archives;

/**
 * Transfer archives table name and columns and action type
 */
public final class TransferArchives extends ArchiveTable {
    /**
     * transfer archive's table name
     */
    public static final String TABLE_NAME = "archivesTransfer";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * the destination account or card of transfer
     */
    public static final String COLUMN_DEST = "Dest";
    /**
     * the destination name of transfer
     */
    public static final String COLUMN_DEST_NAME = "DestName";


    /**
     * no public constructor since this is a utility class
     */
    private TransferArchives() {
    }
}
