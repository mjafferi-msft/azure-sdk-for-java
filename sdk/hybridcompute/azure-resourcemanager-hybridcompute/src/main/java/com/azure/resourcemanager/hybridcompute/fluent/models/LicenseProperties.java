// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.models.LicenseDetails;
import com.azure.resourcemanager.hybridcompute.models.LicenseType;
import com.azure.resourcemanager.hybridcompute.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a License Profile. */
@Fluent
public final class LicenseProperties {
    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Describes the tenant id.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The type of the license resource.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /*
     * Describes the properties of a License.
     */
    @JsonProperty(value = "licenseDetails")
    private LicenseDetails licenseDetails;

    /** Creates an instance of LicenseProperties class. */
    public LicenseProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the tenantId property: Describes the tenant id.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Describes the tenant id.
     *
     * @param tenantId the tenantId value to set.
     * @return the LicenseProperties object itself.
     */
    public LicenseProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the licenseType property: The type of the license resource.
     *
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The type of the license resource.
     *
     * @param licenseType the licenseType value to set.
     * @return the LicenseProperties object itself.
     */
    public LicenseProperties withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the licenseDetails property: Describes the properties of a License.
     *
     * @return the licenseDetails value.
     */
    public LicenseDetails licenseDetails() {
        return this.licenseDetails;
    }

    /**
     * Set the licenseDetails property: Describes the properties of a License.
     *
     * @param licenseDetails the licenseDetails value to set.
     * @return the LicenseProperties object itself.
     */
    public LicenseProperties withLicenseDetails(LicenseDetails licenseDetails) {
        this.licenseDetails = licenseDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (licenseDetails() != null) {
            licenseDetails().validate();
        }
    }
}
