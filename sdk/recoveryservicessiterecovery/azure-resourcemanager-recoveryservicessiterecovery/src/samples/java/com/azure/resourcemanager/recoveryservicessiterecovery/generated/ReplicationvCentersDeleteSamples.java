// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationvCenters Delete. */
public final class ReplicationvCentersDeleteSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationvCenters_Delete.json
     */
    /**
     * Sample code: Remove vCenter operation.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void removeVCenterOperation(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationvCenters().delete("MadhaviVault", "MadhaviVRG", "MadhaviFabric", "esx-78", Context.NONE);
    }
}