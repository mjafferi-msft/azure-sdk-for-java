// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object that includes all the content for single compliance result. */
@Immutable
public final class ComplianceReportItem {
    /*
     * The category name.
     */
    @JsonProperty(value = "categoryName", access = JsonProperty.Access.WRITE_ONLY)
    private String categoryName;

    /*
     * The control Id - e.g. "1".
     */
    @JsonProperty(value = "controlId", access = JsonProperty.Access.WRITE_ONLY)
    private String controlId;

    /*
     * The control name.
     */
    @JsonProperty(value = "controlName", access = JsonProperty.Access.WRITE_ONLY)
    private String controlName;

    /*
     * The control type.
     */
    @JsonProperty(value = "controlType", access = JsonProperty.Access.WRITE_ONLY)
    private ControlType controlType;

    /*
     * The compliance result's status.
     */
    @JsonProperty(value = "complianceState", access = JsonProperty.Access.WRITE_ONLY)
    private ComplianceState complianceState;

    /*
     * The compliance result mapped policy Id.
     */
    @JsonProperty(value = "policyId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyId;

    /*
     * The policy's display name.
     */
    @JsonProperty(value = "policyDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String policyDisplayName;

    /*
     * The policy's detail description.
     */
    @JsonProperty(value = "policyDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String policyDescription;

    /*
     * The compliance result mapped subscription Id.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The compliance result mapped resource group.
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * The compliance result mapped resource type.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * The compliance result mapped resource Id - e.g.
     * "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Compute"
         + "/virtualMachines/vm1".
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * The compliance result last changed date - e.g. "2022-10-24T02:55:16.3274379Z". For unavailable date, set it as
     * "N/A".
     */
    @JsonProperty(value = "statusChangeDate", access = JsonProperty.Access.WRITE_ONLY)
    private String statusChangeDate;

    /** Creates an instance of ComplianceReportItem class. */
    public ComplianceReportItem() {
    }

    /**
     * Get the categoryName property: The category name.
     *
     * @return the categoryName value.
     */
    public String categoryName() {
        return this.categoryName;
    }

    /**
     * Get the controlId property: The control Id - e.g. "1".
     *
     * @return the controlId value.
     */
    public String controlId() {
        return this.controlId;
    }

    /**
     * Get the controlName property: The control name.
     *
     * @return the controlName value.
     */
    public String controlName() {
        return this.controlName;
    }

    /**
     * Get the controlType property: The control type.
     *
     * @return the controlType value.
     */
    public ControlType controlType() {
        return this.controlType;
    }

    /**
     * Get the complianceState property: The compliance result's status.
     *
     * @return the complianceState value.
     */
    public ComplianceState complianceState() {
        return this.complianceState;
    }

    /**
     * Get the policyId property: The compliance result mapped policy Id.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Get the policyDisplayName property: The policy's display name.
     *
     * @return the policyDisplayName value.
     */
    public String policyDisplayName() {
        return this.policyDisplayName;
    }

    /**
     * Get the policyDescription property: The policy's detail description.
     *
     * @return the policyDescription value.
     */
    public String policyDescription() {
        return this.policyDescription;
    }

    /**
     * Get the subscriptionId property: The compliance result mapped subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the resourceGroup property: The compliance result mapped resource group.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the resourceType property: The compliance result mapped resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the resourceId property: The compliance result mapped resource Id - e.g.
     * "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Compute"
         + "/virtualMachines/vm1".
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the statusChangeDate property: The compliance result last changed date - e.g. "2022-10-24T02:55:16.3274379Z".
     * For unavailable date, set it as "N/A".
     *
     * @return the statusChangeDate value.
     */
    public String statusChangeDate() {
        return this.statusChangeDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
