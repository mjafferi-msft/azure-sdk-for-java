// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Buckets List.
 */
public final class BucketsListSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/preview/2025-01-01-preview/examples/Buckets_List.json
     */
    /**
     * Sample code: Buckets_List.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void bucketsList(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.buckets().list("myRG", "account1", "pool1", "volume1", com.azure.core.util.Context.NONE);
    }
}
