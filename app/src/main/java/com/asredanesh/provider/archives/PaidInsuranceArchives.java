package com.asredanesh.provider.archives;

/**
 * Paid insurance archives table name and columns and action type
 */
public final class PaidInsuranceArchives extends ArchiveTable {

    /**
     * payed insurance archives's table name
     */
    public static final String TABLE_NAME = "archivesPayInsurance";
    /**
     * control code
     */
    public static final String COLUMN_INSURANCE_CONTROL_CODE = "insuranceControlCode";
    /**
     * description
     */
    public static final String COLUMN_DESCRIPTION = "description";


    /**
     * no public constructor since this is a utility class
     */
    private PaidInsuranceArchives() {
    }
}
