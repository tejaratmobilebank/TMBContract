package com.asredanesh.provider;

import android.net.Uri;

import com.asredanesh.provider.archives.TransferArchives;

/**
 * The contract between the Tejarat Mobile Bank's provider and applications. Contains
 * builder for generating uri for querying provider
 *
 * @author f.keramat
 * @version 1.0
 */
public class Contract {

    /**
     * scheme for TMB's content provider
     */
    private static final String scheme = "content";
    /**
     * authority for TMB's content provider
     */
    private static final String AUTHORITY = "com.ada.budget.secureContentProvider";

    /**
     * all archives path for uri
     */
    private static final String ALL_ARCHIVES_PATH = "allArchives";

    /**
     * @return uri for getting all archives at once
     */
    public static Uri getAllTransationsUri() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(scheme);
        builder.authority(AUTHORITY);
        //must be set as the last path
        builder.appendPath(ALL_ARCHIVES_PATH);
        return builder.build();
    }

    /**
     * Helper class for building uri of Tejarat Mobile Bank application's content provider.
     * In order to use content provider the table name must be set.
     */
    public static class UriBuilder {
        private Uri.Builder builder;
        private String tableName;
        private String id;

        /**
         * Constructs a new Builder with the scheme and authority of TMB's content provider
         */
        public UriBuilder() {
            builder = new Uri.Builder();
            builder.scheme(scheme);
            builder.authority(AUTHORITY);
        }

        /**
         * sets table name
         *
         * @param tableName you should use one of the defined table name
         *                  for example {@link TransferArchives#TABLE_NAME}
         * @return this builder instance
         */
        public UriBuilder setTable(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * sets id of the row in table
         *
         * @param id the row id in the table
         * @return this builder instance
         */
        public UriBuilder setId(int id) {
            this.id = String.valueOf(id);
            return this;
        }

        /**
         * equal to {@link #setId(int)}
         */
        public UriBuilder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * builds and returns the uri required to querying TMB's content provider
         */
        public Uri build() {
            if (tableName == null)
                throw new UnsupportedOperationException("An URI must have a table name.");
            builder.appendPath(tableName);

            if (id != null)
                builder.appendPath(id);
            return builder.build();
        }
    }

    /**
     * Helper class containing fields name in incoming intents
     */
    public static class Intents {

        /**
         * the caller name of intent
         */
        public static final String EXTRA_CALLER = "caller";
        /**
         * table name of transaction
         */
        public static final String EXTRA_TABLE_NAME = "table name";
        /**
         * id of transaction in table
         */
        public static final String EXTRA_ID = "id";
    }
}