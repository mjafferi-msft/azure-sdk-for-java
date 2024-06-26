// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Describes the type of ARM deployment to be performed on the resource. */
public enum DeploymentMode {
    /** Enum value Incremental. */
    INCREMENTAL("Incremental"),

    /** Enum value Complete. */
    COMPLETE("Complete");

    /** The actual serialized value for a DeploymentMode instance. */
    private final String value;

    DeploymentMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DeploymentMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DeploymentMode object, or null if unable to parse.
     */
    @JsonCreator
    public static DeploymentMode fromString(String value) {
        if (value == null) {
            return null;
        }
        DeploymentMode[] items = DeploymentMode.values();
        for (DeploymentMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
