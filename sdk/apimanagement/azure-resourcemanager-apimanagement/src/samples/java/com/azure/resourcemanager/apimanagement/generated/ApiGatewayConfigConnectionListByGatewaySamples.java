// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for ApiGatewayConfigConnection ListByGateway.
 */
public final class ApiGatewayConfigConnectionListByGatewaySamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementListGatewayConfigConnection.json
     */
    /**
     * Sample code: ApiManagementListGatewayConfigConnection.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementListGatewayConfigConnection(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiGatewayConfigConnections().listByGateway("rg1", "standard-gw-1", com.azure.core.util.Context.NONE);
    }
}
