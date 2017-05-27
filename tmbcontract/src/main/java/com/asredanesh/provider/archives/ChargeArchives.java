package com.asredanesh.provider.archives;

/**
 * Charge archives table name and columns and action type
 */
public final class ChargeArchives extends ArchiveTable {

    /**
     * charge archive's table name
     */
    public static final String TABLE_NAME = "archivesCharge";

    /**
     * operator name
     */
    public static final String COLUMN_OPERATOR = "Operator";
    /**
     * charge code
     */
    public static final String COLUMN_CHARGE_CODE = "ChargeCode";
    /**
     * charge serial
     */
    public static final String COLUMN_CHARGE_SERIAL = "ChargeSerial";
    /**
     * mobile number
     */
    public static final String COLUMN_MOBILE_NO = "mobileNo";

    /**
     * no public constructor since this is a utility class
     */
    private ChargeArchives() {
    }
}
