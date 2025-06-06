// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for ApiGateway List.
 */
public final class ApiGatewayListSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementListGatewaysBySubscription.json
     */
    /**
     * Sample code: ApiManagementListGatewaysBySubscription.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementListGatewaysBySubscription(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiGateways().list(com.azure.core.util.Context.NONE);
    }
}
