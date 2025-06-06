// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservicefleet.fluent.AutoUpgradeProfilesClient;
import com.azure.resourcemanager.containerservicefleet.fluent.models.AutoUpgradeProfileInner;
import com.azure.resourcemanager.containerservicefleet.models.AutoUpgradeProfile;
import com.azure.resourcemanager.containerservicefleet.models.AutoUpgradeProfiles;

public final class AutoUpgradeProfilesImpl implements AutoUpgradeProfiles {
    private static final ClientLogger LOGGER = new ClientLogger(AutoUpgradeProfilesImpl.class);

    private final AutoUpgradeProfilesClient innerClient;

    private final com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager serviceManager;

    public AutoUpgradeProfilesImpl(AutoUpgradeProfilesClient innerClient,
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AutoUpgradeProfile> getWithResponse(String resourceGroupName, String fleetName,
        String autoUpgradeProfileName, Context context) {
        Response<AutoUpgradeProfileInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, fleetName, autoUpgradeProfileName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AutoUpgradeProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AutoUpgradeProfile get(String resourceGroupName, String fleetName, String autoUpgradeProfileName) {
        AutoUpgradeProfileInner inner = this.serviceClient().get(resourceGroupName, fleetName, autoUpgradeProfileName);
        if (inner != null) {
            return new AutoUpgradeProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String fleetName, String autoUpgradeProfileName) {
        this.serviceClient().delete(resourceGroupName, fleetName, autoUpgradeProfileName);
    }

    public void delete(String resourceGroupName, String fleetName, String autoUpgradeProfileName, String ifMatch,
        Context context) {
        this.serviceClient().delete(resourceGroupName, fleetName, autoUpgradeProfileName, ifMatch, context);
    }

    public PagedIterable<AutoUpgradeProfile> listByFleet(String resourceGroupName, String fleetName) {
        PagedIterable<AutoUpgradeProfileInner> inner = this.serviceClient().listByFleet(resourceGroupName, fleetName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AutoUpgradeProfileImpl(inner1, this.manager()));
    }

    public PagedIterable<AutoUpgradeProfile> listByFleet(String resourceGroupName, String fleetName, Context context) {
        PagedIterable<AutoUpgradeProfileInner> inner
            = this.serviceClient().listByFleet(resourceGroupName, fleetName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AutoUpgradeProfileImpl(inner1, this.manager()));
    }

    public AutoUpgradeProfile getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        String autoUpgradeProfileName = ResourceManagerUtils.getValueFromIdByName(id, "autoUpgradeProfiles");
        if (autoUpgradeProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'autoUpgradeProfiles'.", id)));
        }
        return this.getWithResponse(resourceGroupName, fleetName, autoUpgradeProfileName, Context.NONE).getValue();
    }

    public Response<AutoUpgradeProfile> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        String autoUpgradeProfileName = ResourceManagerUtils.getValueFromIdByName(id, "autoUpgradeProfiles");
        if (autoUpgradeProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'autoUpgradeProfiles'.", id)));
        }
        return this.getWithResponse(resourceGroupName, fleetName, autoUpgradeProfileName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        String autoUpgradeProfileName = ResourceManagerUtils.getValueFromIdByName(id, "autoUpgradeProfiles");
        if (autoUpgradeProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'autoUpgradeProfiles'.", id)));
        }
        String localIfMatch = null;
        this.delete(resourceGroupName, fleetName, autoUpgradeProfileName, localIfMatch, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fleetName = ResourceManagerUtils.getValueFromIdByName(id, "fleets");
        if (fleetName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'fleets'.", id)));
        }
        String autoUpgradeProfileName = ResourceManagerUtils.getValueFromIdByName(id, "autoUpgradeProfiles");
        if (autoUpgradeProfileName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'autoUpgradeProfiles'.", id)));
        }
        this.delete(resourceGroupName, fleetName, autoUpgradeProfileName, ifMatch, context);
    }

    private AutoUpgradeProfilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager() {
        return this.serviceManager;
    }

    public AutoUpgradeProfileImpl define(String name) {
        return new AutoUpgradeProfileImpl(name, this.manager());
    }
}
