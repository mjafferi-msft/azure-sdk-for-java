// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Terms of service contract properties. */
@Fluent
public final class PortalConfigTermsOfServiceProperties {
    /*
     * A terms of service text.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * Ask user for consent to the terms of service.
     */
    @JsonProperty(value = "requireConsent")
    private Boolean requireConsent;

    /** Creates an instance of PortalConfigTermsOfServiceProperties class. */
    public PortalConfigTermsOfServiceProperties() {
    }

    /**
     * Get the text property: A terms of service text.
     *
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: A terms of service text.
     *
     * @param text the text value to set.
     * @return the PortalConfigTermsOfServiceProperties object itself.
     */
    public PortalConfigTermsOfServiceProperties withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the requireConsent property: Ask user for consent to the terms of service.
     *
     * @return the requireConsent value.
     */
    public Boolean requireConsent() {
        return this.requireConsent;
    }

    /**
     * Set the requireConsent property: Ask user for consent to the terms of service.
     *
     * @param requireConsent the requireConsent value to set.
     * @return the PortalConfigTermsOfServiceProperties object itself.
     */
    public PortalConfigTermsOfServiceProperties withRequireConsent(Boolean requireConsent) {
        this.requireConsent = requireConsent;
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
