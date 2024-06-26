// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reports the state and behavior of dependent services. */
@Fluent
public final class ServiceStatuses {
    /*
     * The state of the extension service on the Arc-enabled machine.
     */
    @JsonProperty(value = "extensionService")
    private ServiceStatus extensionService;

    /*
     * The state of the guest configuration service on the Arc-enabled machine.
     */
    @JsonProperty(value = "guestConfigurationService")
    private ServiceStatus guestConfigurationService;

    /** Creates an instance of ServiceStatuses class. */
    public ServiceStatuses() {
    }

    /**
     * Get the extensionService property: The state of the extension service on the Arc-enabled machine.
     *
     * @return the extensionService value.
     */
    public ServiceStatus extensionService() {
        return this.extensionService;
    }

    /**
     * Set the extensionService property: The state of the extension service on the Arc-enabled machine.
     *
     * @param extensionService the extensionService value to set.
     * @return the ServiceStatuses object itself.
     */
    public ServiceStatuses withExtensionService(ServiceStatus extensionService) {
        this.extensionService = extensionService;
        return this;
    }

    /**
     * Get the guestConfigurationService property: The state of the guest configuration service on the Arc-enabled
     * machine.
     *
     * @return the guestConfigurationService value.
     */
    public ServiceStatus guestConfigurationService() {
        return this.guestConfigurationService;
    }

    /**
     * Set the guestConfigurationService property: The state of the guest configuration service on the Arc-enabled
     * machine.
     *
     * @param guestConfigurationService the guestConfigurationService value to set.
     * @return the ServiceStatuses object itself.
     */
    public ServiceStatuses withGuestConfigurationService(ServiceStatus guestConfigurationService) {
        this.guestConfigurationService = guestConfigurationService;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensionService() != null) {
            extensionService().validate();
        }
        if (guestConfigurationService() != null) {
            guestConfigurationService().validate();
        }
    }
}
