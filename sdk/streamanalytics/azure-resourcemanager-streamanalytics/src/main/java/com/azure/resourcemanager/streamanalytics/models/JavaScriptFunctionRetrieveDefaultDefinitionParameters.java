// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.JavaScriptFunctionBindingRetrievalProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The parameters needed to retrieve the default function definition for a JavaScript function.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "bindingType")
@JsonTypeName("Microsoft.StreamAnalytics/JavascriptUdf")
@Fluent
public final class JavaScriptFunctionRetrieveDefaultDefinitionParameters
    extends FunctionRetrieveDefaultDefinitionParameters {
    /*
     * The binding retrieval properties associated with a JavaScript function.
     */
    @JsonProperty(value = "bindingRetrievalProperties")
    private JavaScriptFunctionBindingRetrievalProperties innerBindingRetrievalProperties;

    /**
     * Creates an instance of JavaScriptFunctionRetrieveDefaultDefinitionParameters class.
     */
    public JavaScriptFunctionRetrieveDefaultDefinitionParameters() {
    }

    /**
     * Get the innerBindingRetrievalProperties property: The binding retrieval properties associated with a JavaScript
     * function.
     * 
     * @return the innerBindingRetrievalProperties value.
     */
    private JavaScriptFunctionBindingRetrievalProperties innerBindingRetrievalProperties() {
        return this.innerBindingRetrievalProperties;
    }

    /**
     * Get the script property: The JavaScript code containing a single function definition. For example: 'function (x,
     * y) { return x + y; }'.
     * 
     * @return the script value.
     */
    public String script() {
        return this.innerBindingRetrievalProperties() == null ? null : this.innerBindingRetrievalProperties().script();
    }

    /**
     * Set the script property: The JavaScript code containing a single function definition. For example: 'function (x,
     * y) { return x + y; }'.
     * 
     * @param script the script value to set.
     * @return the JavaScriptFunctionRetrieveDefaultDefinitionParameters object itself.
     */
    public JavaScriptFunctionRetrieveDefaultDefinitionParameters withScript(String script) {
        if (this.innerBindingRetrievalProperties() == null) {
            this.innerBindingRetrievalProperties = new JavaScriptFunctionBindingRetrievalProperties();
        }
        this.innerBindingRetrievalProperties().withScript(script);
        return this;
    }

    /**
     * Get the udfType property: The function type.
     * 
     * @return the udfType value.
     */
    public UdfType udfType() {
        return this.innerBindingRetrievalProperties() == null ? null : this.innerBindingRetrievalProperties().udfType();
    }

    /**
     * Set the udfType property: The function type.
     * 
     * @param udfType the udfType value to set.
     * @return the JavaScriptFunctionRetrieveDefaultDefinitionParameters object itself.
     */
    public JavaScriptFunctionRetrieveDefaultDefinitionParameters withUdfType(UdfType udfType) {
        if (this.innerBindingRetrievalProperties() == null) {
            this.innerBindingRetrievalProperties = new JavaScriptFunctionBindingRetrievalProperties();
        }
        this.innerBindingRetrievalProperties().withUdfType(udfType);
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
        if (innerBindingRetrievalProperties() != null) {
            innerBindingRetrievalProperties().validate();
        }
    }
}
