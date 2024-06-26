// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Additional properties of the product. */
@Fluent
public final class ProductProperties {
    /*
     * The version.
     */
    @JsonProperty(value = "version")
    private String version;

    /** Creates an instance of ProductProperties class. */
    public ProductProperties() {
    }

    /**
     * Get the version property: The version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version.
     *
     * @param version the version value to set.
     * @return the ProductProperties object itself.
     */
    public ProductProperties withVersion(String version) {
        this.version = version;
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
