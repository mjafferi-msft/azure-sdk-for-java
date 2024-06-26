// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Creator resource properties. */
@Fluent
public final class CreatorProperties {
    /*
     * The state of the resource provisioning, terminal states: Succeeded, Failed, Canceled
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The storage units to be allocated. Integer values from 1 to 100, inclusive.
     */
    @JsonProperty(value = "storageUnits", required = true)
    private int storageUnits;

    /** Creates an instance of CreatorProperties class. */
    public CreatorProperties() {
    }

    /**
     * Get the provisioningState property: The state of the resource provisioning, terminal states: Succeeded, Failed,
     * Canceled.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the storageUnits property: The storage units to be allocated. Integer values from 1 to 100, inclusive.
     *
     * @return the storageUnits value.
     */
    public int storageUnits() {
        return this.storageUnits;
    }

    /**
     * Set the storageUnits property: The storage units to be allocated. Integer values from 1 to 100, inclusive.
     *
     * @param storageUnits the storageUnits value to set.
     * @return the CreatorProperties object itself.
     */
    public CreatorProperties withStorageUnits(int storageUnits) {
        this.storageUnits = storageUnits;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
