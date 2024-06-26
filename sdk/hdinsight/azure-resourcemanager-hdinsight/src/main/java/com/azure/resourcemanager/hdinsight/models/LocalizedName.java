// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details about the localizable name of a type of usage. */
@Fluent
public final class LocalizedName {
    /*
     * The name of the used resource.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The localized name of the used resource.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /** Creates an instance of LocalizedName class. */
    public LocalizedName() {
    }

    /**
     * Get the value property: The name of the used resource.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The name of the used resource.
     *
     * @param value the value value to set.
     * @return the LocalizedName object itself.
     */
    public LocalizedName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: The localized name of the used resource.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: The localized name of the used resource.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the LocalizedName object itself.
     */
    public LocalizedName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
