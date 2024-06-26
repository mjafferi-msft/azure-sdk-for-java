// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;

/** Samples for AzureDevOpsProject Get. */
public final class AzureDevOpsProjectGetSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/AzureDevOpsProjectGet.json
     */
    /**
     * Sample code: AzureDevOpsProject_Get.
     *
     * @param manager Entry point to SecurityDevOpsManager.
     */
    public static void azureDevOpsProjectGet(com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager) {
        manager.azureDevOpsProjects().getWithResponse("westusrg", "testconnector", "myOrg", "myProject", Context.NONE);
    }
}
