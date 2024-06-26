// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.HealthStatus;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PanoramaStatus;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ReadOnlyProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Firewall Status.
 */
@Immutable
public final class FirewallStatusResourceInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties", required = true)
    private FirewallStatusProperty innerProperties = new FirewallStatusProperty();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of FirewallStatusResourceInner class.
     */
    public FirewallStatusResourceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private FirewallStatusProperty innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the isPanoramaManaged property: Panorama Managed: Default is False. Default will be CloudSec managed.
     * 
     * @return the isPanoramaManaged value.
     */
    public BooleanEnum isPanoramaManaged() {
        return this.innerProperties() == null ? null : this.innerProperties().isPanoramaManaged();
    }

    /**
     * Get the healthStatus property: Current status of the Firewall.
     * 
     * @return the healthStatus value.
     */
    public HealthStatus healthStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().healthStatus();
    }

    /**
     * Get the healthReason property: Detail description of current health of the Firewall.
     * 
     * @return the healthReason value.
     */
    public String healthReason() {
        return this.innerProperties() == null ? null : this.innerProperties().healthReason();
    }

    /**
     * Get the panoramaStatus property: Panorama Status.
     * 
     * @return the panoramaStatus value.
     */
    public PanoramaStatus panoramaStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().panoramaStatus();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ReadOnlyProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model FirewallStatusResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FirewallStatusResourceInner.class);
}
