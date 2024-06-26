// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.TableTemporalType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A database table resource. */
@Fluent
public final class DatabaseTableInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private DatabaseTableProperties innerProperties;

    /** Creates an instance of DatabaseTableInner class. */
    public DatabaseTableInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private DatabaseTableProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the temporalType property: The table temporal type.
     *
     * @return the temporalType value.
     */
    public TableTemporalType temporalType() {
        return this.innerProperties() == null ? null : this.innerProperties().temporalType();
    }

    /**
     * Set the temporalType property: The table temporal type.
     *
     * @param temporalType the temporalType value to set.
     * @return the DatabaseTableInner object itself.
     */
    public DatabaseTableInner withTemporalType(TableTemporalType temporalType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseTableProperties();
        }
        this.innerProperties().withTemporalType(temporalType);
        return this;
    }

    /**
     * Get the memoryOptimized property: Whether or not the table is memory optimized.
     *
     * @return the memoryOptimized value.
     */
    public Boolean memoryOptimized() {
        return this.innerProperties() == null ? null : this.innerProperties().memoryOptimized();
    }

    /**
     * Set the memoryOptimized property: Whether or not the table is memory optimized.
     *
     * @param memoryOptimized the memoryOptimized value to set.
     * @return the DatabaseTableInner object itself.
     */
    public DatabaseTableInner withMemoryOptimized(Boolean memoryOptimized) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DatabaseTableProperties();
        }
        this.innerProperties().withMemoryOptimized(memoryOptimized);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
