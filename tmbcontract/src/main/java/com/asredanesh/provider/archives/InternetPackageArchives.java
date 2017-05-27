package com.asredanesh.provider.archives;

/**
 * @author f.keramat
 */

public class InternetPackageArchives extends ArchiveTable {
    /**
     * charge archive's table name
     */
    public static final String TABLE_NAME = "ArchiveInternetPackage";

    /**
     * operator name
     */
    public static final String COLUMN_OPERATOR = "Operator";

    /**
     * title of package
     */
    public static final String COLUMN_PACKAGE_TITLE = "PackageTitle";
    /**
     * charged phone number
     */
    public static final String COLUMN_PHONE_NO = "PhoneNumber";
    /**
     * description of package
     */
    public static final String COLUMN_PACKAGE_DESCRIPTION = "PackageDescription";

    /**
     * the additional note which user inserts
     */
    public static final String COLUMN_OPTIONAL_NOTE = "optionalCode";

    /**
     * no public constructor since this is a utility class
     */
    private InternetPackageArchives() {
    }
}
