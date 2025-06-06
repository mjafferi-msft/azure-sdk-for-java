// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.PrivateLinkHubsClient;
import com.azure.resourcemanager.synapse.fluent.models.PrivateLinkHubInner;
import com.azure.resourcemanager.synapse.models.PrivateLinkHub;
import com.azure.resourcemanager.synapse.models.PrivateLinkHubs;

public final class PrivateLinkHubsImpl implements PrivateLinkHubs {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkHubsImpl.class);

    private final PrivateLinkHubsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public PrivateLinkHubsImpl(PrivateLinkHubsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkHub> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PrivateLinkHubInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkHubImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkHub> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PrivateLinkHubInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkHubImpl(inner1, this.manager()));
    }

    public Response<PrivateLinkHub> getByResourceGroupWithResponse(String resourceGroupName, String privateLinkHubName,
        Context context) {
        Response<PrivateLinkHubInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, privateLinkHubName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PrivateLinkHubImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkHub getByResourceGroup(String resourceGroupName, String privateLinkHubName) {
        PrivateLinkHubInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, privateLinkHubName);
        if (inner != null) {
            return new PrivateLinkHubImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String privateLinkHubName) {
        this.serviceClient().delete(resourceGroupName, privateLinkHubName);
    }

    public void delete(String resourceGroupName, String privateLinkHubName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateLinkHubName, context);
    }

    public PagedIterable<PrivateLinkHub> list() {
        PagedIterable<PrivateLinkHubInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkHubImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkHub> list(Context context) {
        PagedIterable<PrivateLinkHubInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new PrivateLinkHubImpl(inner1, this.manager()));
    }

    public PrivateLinkHub getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateLinkHubName = ResourceManagerUtils.getValueFromIdByName(id, "privateLinkHubs");
        if (privateLinkHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateLinkHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, privateLinkHubName, Context.NONE).getValue();
    }

    public Response<PrivateLinkHub> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateLinkHubName = ResourceManagerUtils.getValueFromIdByName(id, "privateLinkHubs");
        if (privateLinkHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateLinkHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, privateLinkHubName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateLinkHubName = ResourceManagerUtils.getValueFromIdByName(id, "privateLinkHubs");
        if (privateLinkHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateLinkHubs'.", id)));
        }
        this.delete(resourceGroupName, privateLinkHubName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateLinkHubName = ResourceManagerUtils.getValueFromIdByName(id, "privateLinkHubs");
        if (privateLinkHubName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'privateLinkHubs'.", id)));
        }
        this.delete(resourceGroupName, privateLinkHubName, context);
    }

    private PrivateLinkHubsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public PrivateLinkHubImpl define(String name) {
        return new PrivateLinkHubImpl(name, this.manager());
    }
}
