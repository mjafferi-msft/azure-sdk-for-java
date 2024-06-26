// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The properties associated with a Stream Analytics cluster.
 */
@Immutable
public final class ClusterProperties {
    /*
     * The date this cluster was created.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * Unique identifier for the cluster.
     */
    @JsonProperty(value = "clusterId", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterId;

    /*
     * The status of the cluster provisioning. The three terminal states are: Succeeded, Failed and Canceled
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterProvisioningState provisioningState;

    /*
     * Represents the number of streaming units currently being used on the cluster.
     */
    @JsonProperty(value = "capacityAllocated", access = JsonProperty.Access.WRITE_ONLY)
    private Integer capacityAllocated;

    /*
     * Represents the sum of the SUs of all streaming jobs associated with the cluster. If all of the jobs were
     * running, this would be the capacity allocated.
     */
    @JsonProperty(value = "capacityAssigned", access = JsonProperty.Access.WRITE_ONLY)
    private Integer capacityAssigned;

    /**
     * Creates an instance of ClusterProperties class.
     */
    public ClusterProperties() {
    }

    /**
     * Get the createdDate property: The date this cluster was created.
     * 
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the clusterId property: Unique identifier for the cluster.
     * 
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Get the provisioningState property: The status of the cluster provisioning. The three terminal states are:
     * Succeeded, Failed and Canceled.
     * 
     * @return the provisioningState value.
     */
    public ClusterProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the capacityAllocated property: Represents the number of streaming units currently being used on the
     * cluster.
     * 
     * @return the capacityAllocated value.
     */
    public Integer capacityAllocated() {
        return this.capacityAllocated;
    }

    /**
     * Get the capacityAssigned property: Represents the sum of the SUs of all streaming jobs associated with the
     * cluster. If all of the jobs were running, this would be the capacity allocated.
     * 
     * @return the capacityAssigned value.
     */
    public Integer capacityAssigned() {
        return this.capacityAssigned;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
