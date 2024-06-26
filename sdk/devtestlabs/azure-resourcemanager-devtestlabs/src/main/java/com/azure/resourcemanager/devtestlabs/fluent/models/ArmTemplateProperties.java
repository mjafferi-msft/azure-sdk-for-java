// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.devtestlabs.models.ParametersValueFileInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties of an Azure Resource Manager template. */
@Immutable
public final class ArmTemplateProperties {
    /*
     * The display name of the ARM template.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The description of the ARM template.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The publisher of the ARM template.
     */
    @JsonProperty(value = "publisher", access = JsonProperty.Access.WRITE_ONLY)
    private String publisher;

    /*
     * The URI to the icon of the ARM template.
     */
    @JsonProperty(value = "icon", access = JsonProperty.Access.WRITE_ONLY)
    private String icon;

    /*
     * The contents of the ARM template.
     */
    @JsonProperty(value = "contents", access = JsonProperty.Access.WRITE_ONLY)
    private Object contents;

    /*
     * The creation date of the armTemplate.
     */
    @JsonProperty(value = "createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * File name and parameter values information from all azuredeploy.*.parameters.json for the ARM template.
     */
    @JsonProperty(value = "parametersValueFilesInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<ParametersValueFileInfo> parametersValueFilesInfo;

    /*
     * Whether or not ARM template is enabled for use by lab user.
     */
    @JsonProperty(value = "enabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean enabled;

    /** Creates an instance of ArmTemplateProperties class. */
    public ArmTemplateProperties() {
    }

    /**
     * Get the displayName property: The display name of the ARM template.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: The description of the ARM template.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the publisher property: The publisher of the ARM template.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Get the icon property: The URI to the icon of the ARM template.
     *
     * @return the icon value.
     */
    public String icon() {
        return this.icon;
    }

    /**
     * Get the contents property: The contents of the ARM template.
     *
     * @return the contents value.
     */
    public Object contents() {
        return this.contents;
    }

    /**
     * Get the createdDate property: The creation date of the armTemplate.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the parametersValueFilesInfo property: File name and parameter values information from all
     * azuredeploy.*.parameters.json for the ARM template.
     *
     * @return the parametersValueFilesInfo value.
     */
    public List<ParametersValueFileInfo> parametersValueFilesInfo() {
        return this.parametersValueFilesInfo;
    }

    /**
     * Get the enabled property: Whether or not ARM template is enabled for use by lab user.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parametersValueFilesInfo() != null) {
            parametersValueFilesInfo().forEach(e -> e.validate());
        }
    }
}
