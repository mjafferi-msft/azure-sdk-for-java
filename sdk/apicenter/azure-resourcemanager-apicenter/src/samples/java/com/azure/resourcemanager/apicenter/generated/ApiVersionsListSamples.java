// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/**
 * Samples for ApiVersions List.
 */
public final class ApiVersionsListSamples {
    /*
     * x-ms-original-file:
     * specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/ApiVersions_List.json
     */
    /**
     * Sample code: ApiVersions_ListByApi.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void apiVersionsListByApi(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.apiVersions()
            .list("contoso-resources", "contoso", "default", "echo-api", null, com.azure.core.util.Context.NONE);
    }
}
