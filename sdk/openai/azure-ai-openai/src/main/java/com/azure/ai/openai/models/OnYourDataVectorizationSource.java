// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An abstract representation of a vectorization source for Azure OpenAI On Your Data with vector search.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = OnYourDataVectorizationSource.class,
    visible = true)
@JsonTypeName("OnYourDataVectorizationSource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "endpoint", value = OnYourDataEndpointVectorizationSource.class),
    @JsonSubTypes.Type(name = "deployment_name", value = OnYourDataDeploymentNameVectorizationSource.class),
    @JsonSubTypes.Type(name = "model_id", value = OnYourDataModelIdVectorizationSource.class) })
@Immutable
public class OnYourDataVectorizationSource {

    /**
     * Creates an instance of OnYourDataVectorizationSource class.
     */
    @Generated
    public OnYourDataVectorizationSource() {
        this.type = OnYourDataVectorizationSourceType.fromString("OnYourDataVectorizationSource");
    }

    /*
     * The type of vectorization source to use.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "type")
    private OnYourDataVectorizationSourceType type;

    /**
     * Get the type property: The type of vectorization source to use.
     *
     * @return the type value.
     */
    @Generated
    public OnYourDataVectorizationSourceType getType() {
        return this.type;
    }
}
