// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.resourcemanager.maps.fluent.models.OperationDetailInner;

/**
 * An immutable client-side representation of OperationDetail.
 */
public interface OperationDetail {
    /**
     * Gets the name property: Name of the operation.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: Indicates whether the operation is a data action.
     * 
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: Display of the operation.
     * 
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the origin property: Origin of the operation.
     * 
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the serviceSpecification property: One property of operation, include metric specifications.
     * 
     * @return the serviceSpecification value.
     */
    ServiceSpecification serviceSpecification();

    /**
     * Gets the inner com.azure.resourcemanager.maps.fluent.models.OperationDetailInner object.
     * 
     * @return the inner object.
     */
    OperationDetailInner innerModel();
}
