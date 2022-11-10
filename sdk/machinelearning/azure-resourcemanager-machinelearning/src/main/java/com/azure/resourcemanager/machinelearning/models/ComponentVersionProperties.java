// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Definition of a component version: defines resources that span component types. */
@Fluent
public final class ComponentVersionProperties extends AssetBase {
    /*
     * Defines Component definition details.
     * <see href="https://docs.microsoft.com/en-us/azure/machine-learning/reference-yaml-component-command" />
     */
    @JsonProperty(value = "componentSpec")
    private Object componentSpec;

    /** Creates an instance of ComponentVersionProperties class. */
    public ComponentVersionProperties() {
    }

    /**
     * Get the componentSpec property: Defines Component definition details. &lt;see
     * href="https://docs.microsoft.com/en-us/azure/machine-learning/reference-yaml-component-command" /&gt;.
     *
     * @return the componentSpec value.
     */
    public Object componentSpec() {
        return this.componentSpec;
    }

    /**
     * Set the componentSpec property: Defines Component definition details. &lt;see
     * href="https://docs.microsoft.com/en-us/azure/machine-learning/reference-yaml-component-command" /&gt;.
     *
     * @param componentSpec the componentSpec value to set.
     * @return the ComponentVersionProperties object itself.
     */
    public ComponentVersionProperties withComponentSpec(Object componentSpec) {
        this.componentSpec = componentSpec;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentVersionProperties withIsAnonymous(Boolean isAnonymous) {
        super.withIsAnonymous(isAnonymous);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentVersionProperties withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentVersionProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentVersionProperties withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ComponentVersionProperties withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}