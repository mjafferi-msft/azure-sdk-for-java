// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

/**
 * Samples for LtrBackupOperations ListByServer.
 */
public final class LtrBackupOperationsListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * LongTermRetentionOperationListByServer.json
     */
    /**
     * Sample code: Sample List of Long Tern Retention Operations by Flexible Server.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void sampleListOfLongTernRetentionOperationsByFlexibleServer(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.ltrBackupOperations()
            .listByServer("rgLongTermRetention", "pgsqlltrtestserver", com.azure.core.util.Context.NONE);
    }
}
