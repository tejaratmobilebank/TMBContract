package com.asredanesh.provider.archives;

/**
 * Payment archives table name and columns and action type
 */
public final class PaymentArchives extends ArchiveTable {

    /**
     * payment archive's table name
     */
    public static final String TABLE_NAME = "archivesPayment";
    /**
     * the destination account or card of transfer
     */
    public static final String COLUMN_DEST = "Dest";

    /**
     * the gateway of payment
     */
    public static final String COLUMN_PAYMENT_THROUGH = "PaymentThrough";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * no public constructor since this is a utility class
     */
    private PaymentArchives() {
    }
}
