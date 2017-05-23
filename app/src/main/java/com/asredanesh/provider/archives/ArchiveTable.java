package com.asredanesh.provider.archives;

/**
 * The Base class for archives table
 * all the columns have string value
 *
 * @author f.keramat
 */
public class ArchiveTable {
    /**
     * the id for the row in the table
     */
    public static final String COLUMN_ID = "Id";
    /**
     * the source for transaction
     */
    public static final String COLUMN_SOURCE = "source";
    /**
     * the amount od transaction
     */
    public static final String COLUMN_AMOUNT = "Amount";
    /**
     * the date and time of transaction .Format of value YYYYmmDDHHMM
     */
    public static final String COLUMN_DATETIME = "DateTime";

    /**
     * the type of transaction
     */
    public static final String COLUMN_ACTION_TYPE = "ActionType";
    /**
     * a brief description of the transaction
     */
    public static final String COLUMN_OVERALL_DESCRIPTION = "OverAllDescription";
}
