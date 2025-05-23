// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/**
 * Samples for Volumes Delete.
 */
public final class VolumesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2024-10-01-preview/examples/
     * Volumes_Delete.json
     */
    /**
     * Sample code: Delete volume.
     * 
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void deleteVolume(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.volumes().delete("resourceGroupName", "volumeName", com.azure.core.util.Context.NONE);
    }
}
