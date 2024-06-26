// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.trafficmanager.models.Region;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing the properties of the Geographic hierarchy used with the Geographic traffic routing method. */
@Fluent
public final class GeographicHierarchyProperties {
    /*
     * The region at the root of the hierarchy from all the regions in the hierarchy can be retrieved.
     */
    @JsonProperty(value = "geographicHierarchy")
    private Region geographicHierarchy;

    /** Creates an instance of GeographicHierarchyProperties class. */
    public GeographicHierarchyProperties() {
    }

    /**
     * Get the geographicHierarchy property: The region at the root of the hierarchy from all the regions in the
     * hierarchy can be retrieved.
     *
     * @return the geographicHierarchy value.
     */
    public Region geographicHierarchy() {
        return this.geographicHierarchy;
    }

    /**
     * Set the geographicHierarchy property: The region at the root of the hierarchy from all the regions in the
     * hierarchy can be retrieved.
     *
     * @param geographicHierarchy the geographicHierarchy value to set.
     * @return the GeographicHierarchyProperties object itself.
     */
    public GeographicHierarchyProperties withGeographicHierarchy(Region geographicHierarchy) {
        this.geographicHierarchy = geographicHierarchy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (geographicHierarchy() != null) {
            geographicHierarchy().validate();
        }
    }
}
