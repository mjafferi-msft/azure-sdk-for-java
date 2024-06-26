// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkServiceDesignVersionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of network service design versions.
 */
@Fluent
public final class NetworkServiceDesignVersionListResult {
    /*
     * A list of network service design versions.
     */
    @JsonProperty(value = "value")
    private List<NetworkServiceDesignVersionInner> value;

    /*
     * The URI to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of NetworkServiceDesignVersionListResult class.
     */
    public NetworkServiceDesignVersionListResult() {
    }

    /**
     * Get the value property: A list of network service design versions.
     * 
     * @return the value value.
     */
    public List<NetworkServiceDesignVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of network service design versions.
     * 
     * @param value the value value to set.
     * @return the NetworkServiceDesignVersionListResult object itself.
     */
    public NetworkServiceDesignVersionListResult withValue(List<NetworkServiceDesignVersionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
