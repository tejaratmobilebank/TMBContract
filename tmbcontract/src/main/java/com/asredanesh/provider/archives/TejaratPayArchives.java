package com.asredanesh.provider.archives;

/**
 * @author f.keramat
 */

public class TejaratPayArchives extends ArchiveTable {
    /**
     * transfer archive's table name
     */
    public static final String TABLE_NAME = "ArchiveTejaratPay";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * name of store
     */
    public static final String COLUMN_STORE_NAME = "storeName";

    /**
     * no public constructor since this is a utility class
     */
    private TejaratPayArchives() {
    }
}
