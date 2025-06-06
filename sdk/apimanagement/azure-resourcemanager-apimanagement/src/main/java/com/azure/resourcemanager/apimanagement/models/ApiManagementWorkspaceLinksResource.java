// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementWorkspaceLinksResourceInner;
import java.util.List;

/**
 * An immutable client-side representation of ApiManagementWorkspaceLinksResource.
 */
public interface ApiManagementWorkspaceLinksResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: ETag of the resource.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the workspaceId property: The link to the API Management service workspace.
     * 
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the gateways property: The array of linked gateways.
     * 
     * @return the gateways value.
     */
    List<WorkspaceLinksGateway> gateways();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementWorkspaceLinksResourceInner
     * object.
     * 
     * @return the inner object.
     */
    ApiManagementWorkspaceLinksResourceInner innerModel();
}
