// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.defendereasm.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.defendereasm.models.ResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Label details. */
@Fluent
public class LabelResourceInner extends ProxyResource {
    /*
     * Label properties
     */
    @JsonProperty(value = "properties")
    private LabelResourceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of LabelResourceInner class. */
    public LabelResourceInner() {
    }

    /**
     * Get the innerProperties property: Label properties.
     *
     * @return the innerProperties value.
     */
    private LabelResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the displayName property: Label display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Label display name.
     *
     * @param displayName the displayName value to set.
     * @return the LabelResourceInner object itself.
     */
    public LabelResourceInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabelResourceProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the color property: Label color.
     *
     * @return the color value.
     */
    public String color() {
        return this.innerProperties() == null ? null : this.innerProperties().color();
    }

    /**
     * Set the color property: Label color.
     *
     * @param color the color value to set.
     * @return the LabelResourceInner object itself.
     */
    public LabelResourceInner withColor(String color) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabelResourceProperties();
        }
        this.innerProperties().withColor(color);
        return this;
    }

    /**
     * Get the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public ResourceState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
