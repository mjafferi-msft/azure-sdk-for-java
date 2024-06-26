// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ClusterDeployParameters represents the body of the request to deploy cluster. */
@Fluent
public final class ClusterDeployParameters {
    /*
     * The names of bare metal machines in the cluster that should be skipped during environment validation.
     */
    @JsonProperty(value = "skipValidationsForMachines")
    private List<String> skipValidationsForMachines;

    /** Creates an instance of ClusterDeployParameters class. */
    public ClusterDeployParameters() {
    }

    /**
     * Get the skipValidationsForMachines property: The names of bare metal machines in the cluster that should be
     * skipped during environment validation.
     *
     * @return the skipValidationsForMachines value.
     */
    public List<String> skipValidationsForMachines() {
        return this.skipValidationsForMachines;
    }

    /**
     * Set the skipValidationsForMachines property: The names of bare metal machines in the cluster that should be
     * skipped during environment validation.
     *
     * @param skipValidationsForMachines the skipValidationsForMachines value to set.
     * @return the ClusterDeployParameters object itself.
     */
    public ClusterDeployParameters withSkipValidationsForMachines(List<String> skipValidationsForMachines) {
        this.skipValidationsForMachines = skipValidationsForMachines;
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
