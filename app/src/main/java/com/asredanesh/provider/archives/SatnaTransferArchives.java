package com.asredanesh.provider.archives;

/**
 * Satna transfer archives table name and columns and action type
 */
public final class SatnaTransferArchives extends ArchiveTable {

    /**
     * satna archive's table name
     */
    public static final String TABLE_NAME = "archivesSatnaTransfer";

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
    private SatnaTransferArchives() {
    }
}
