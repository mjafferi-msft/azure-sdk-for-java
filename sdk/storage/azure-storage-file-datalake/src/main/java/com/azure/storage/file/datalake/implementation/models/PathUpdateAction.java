// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for PathUpdateAction. */
public enum PathUpdateAction {
    /** Enum value append. */
    APPEND("append"),

    /** Enum value flush. */
    FLUSH("flush"),

    /** Enum value setProperties. */
    SET_PROPERTIES("setProperties"),

    /** Enum value setAccessControl. */
    SET_ACCESS_CONTROL("setAccessControl"),

    /** Enum value setAccessControlRecursive. */
    SET_ACCESS_CONTROL_RECURSIVE("setAccessControlRecursive");

    /** The actual serialized value for a PathUpdateAction instance. */
    private final String value;

    PathUpdateAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PathUpdateAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PathUpdateAction object, or null if unable to parse.
     */
    @JsonCreator
    public static PathUpdateAction fromString(String value) {
        if (value == null) {
            return null;
        }
        PathUpdateAction[] items = PathUpdateAction.values();
        for (PathUpdateAction item : items) {
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
