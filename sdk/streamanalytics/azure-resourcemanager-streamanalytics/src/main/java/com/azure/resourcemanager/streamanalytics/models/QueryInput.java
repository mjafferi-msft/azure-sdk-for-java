// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An input for the query compilation.
 */
@Fluent
public final class QueryInput {
    /*
     * The name of the input.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of the input, can be Stream or Reference.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of QueryInput class.
     */
    public QueryInput() {
    }

    /**
     * Get the name property: The name of the input.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the input.
     * 
     * @param name the name value to set.
     * @return the QueryInput object itself.
     */
    public QueryInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the input, can be Stream or Reference.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the input, can be Stream or Reference.
     * 
     * @param type the type value to set.
     * @return the QueryInput object itself.
     */
    public QueryInput withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model QueryInput"));
        }
        if (type() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property type in model QueryInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QueryInput.class);
}
