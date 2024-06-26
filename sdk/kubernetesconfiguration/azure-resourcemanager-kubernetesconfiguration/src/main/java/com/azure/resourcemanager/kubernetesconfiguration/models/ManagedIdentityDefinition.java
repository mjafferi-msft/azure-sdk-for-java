// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters to authenticate using a Managed Identity. */
@Fluent
public final class ManagedIdentityDefinition {
    /*
     * The client Id for authenticating a Managed Identity.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /** Creates an instance of ManagedIdentityDefinition class. */
    public ManagedIdentityDefinition() {
    }

    /**
     * Get the clientId property: The client Id for authenticating a Managed Identity.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client Id for authenticating a Managed Identity.
     *
     * @param clientId the clientId value to set.
     * @return the ManagedIdentityDefinition object itself.
     */
    public ManagedIdentityDefinition withClientId(String clientId) {
        this.clientId = clientId;
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
