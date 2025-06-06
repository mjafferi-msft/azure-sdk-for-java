// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for WorkspaceGroupUser Delete.
 */
public final class WorkspaceGroupUserDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementDeleteWorkspaceGroupUser.json
     */
    /**
     * Sample code: ApiManagementDeleteWorkspaceGroupUser.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementDeleteWorkspaceGroupUser(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.workspaceGroupUsers()
            .deleteWithResponse("rg1", "apimService1", "wks1", "templategroup", "59307d350af58404d8a26300",
                com.azure.core.util.Context.NONE);
    }
}
