// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SapInstances.
 */
public interface SapInstances {
    /**
     * Lists the SAP Instance resources for the given SAP Migration discovery site resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapDiscoverySiteName The name of the discovery site resource for SAP Migration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SAPInstance list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SapInstance> listBySapDiscoverySite(String resourceGroupName, String sapDiscoverySiteName);

    /**
     * Lists the SAP Instance resources for the given SAP Migration discovery site resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapDiscoverySiteName The name of the discovery site resource for SAP Migration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a SAPInstance list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SapInstance> listBySapDiscoverySite(String resourceGroupName, String sapDiscoverySiteName,
        Context context);

    /**
     * Gets the SAP Instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapDiscoverySiteName The name of the discovery site resource for SAP Migration.
     * @param sapInstanceName The name of SAP Instance resource for SAP Migration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Instance resource along with {@link Response}.
     */
    Response<SapInstance> getWithResponse(String resourceGroupName, String sapDiscoverySiteName, String sapInstanceName,
        Context context);

    /**
     * Gets the SAP Instance resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapDiscoverySiteName The name of the discovery site resource for SAP Migration.
     * @param sapInstanceName The name of SAP Instance resource for SAP Migration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Instance resource.
     */
    SapInstance get(String resourceGroupName, String sapDiscoverySiteName, String sapInstanceName);

    /**
     * Deletes the SAP Instance resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete operation on
     * this resource by end user will return a Bad Request error. You can delete the parent resource, which is the SAP
     * Migration discovery site resource, using the delete operation on it.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapDiscoverySiteName The name of the discovery site resource for SAP Migration.
     * @param sapInstanceName The name of SAP Instance resource for SAP Migration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String sapDiscoverySiteName, String sapInstanceName);

    /**
     * Deletes the SAP Instance resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete operation on
     * this resource by end user will return a Bad Request error. You can delete the parent resource, which is the SAP
     * Migration discovery site resource, using the delete operation on it.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapDiscoverySiteName The name of the discovery site resource for SAP Migration.
     * @param sapInstanceName The name of SAP Instance resource for SAP Migration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String sapDiscoverySiteName, String sapInstanceName, Context context);

    /**
     * Gets the SAP Instance resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Instance resource along with {@link Response}.
     */
    SapInstance getById(String id);

    /**
     * Gets the SAP Instance resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Instance resource along with {@link Response}.
     */
    Response<SapInstance> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the SAP Instance resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete operation on
     * this resource by end user will return a Bad Request error. You can delete the parent resource, which is the SAP
     * Migration discovery site resource, using the delete operation on it.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the SAP Instance resource. &lt;br&gt;&lt;br&gt;This will be used by service only. Delete operation on
     * this resource by end user will return a Bad Request error. You can delete the parent resource, which is the SAP
     * Migration discovery site resource, using the delete operation on it.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SapInstance resource.
     * 
     * @param name resource name.
     * @return the first stage of the new SapInstance definition.
     */
    SapInstance.DefinitionStages.Blank define(String name);
}
