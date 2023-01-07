// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reverse replication input properties. */
@Fluent
public final class ReverseReplicationInputProperties {
    /*
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /*
     * Provider specific reverse replication input.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ReverseReplicationProviderSpecificInput providerSpecificDetails;

    /** Creates an instance of ReverseReplicationInputProperties class. */
    public ReverseReplicationInputProperties() {
    }

    /**
     * Get the failoverDirection property: Failover direction.
     *
     * @return the failoverDirection value.
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set the failoverDirection property: Failover direction.
     *
     * @param failoverDirection the failoverDirection value to set.
     * @return the ReverseReplicationInputProperties object itself.
     */
    public ReverseReplicationInputProperties withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: Provider specific reverse replication input.
     *
     * @return the providerSpecificDetails value.
     */
    public ReverseReplicationProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: Provider specific reverse replication input.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the ReverseReplicationInputProperties object itself.
     */
    public ReverseReplicationInputProperties withProviderSpecificDetails(
        ReverseReplicationProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }
}