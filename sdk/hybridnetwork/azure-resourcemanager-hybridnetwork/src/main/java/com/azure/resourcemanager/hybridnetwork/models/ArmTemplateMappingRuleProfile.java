// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Template mapping rule profile.
 */
@Fluent
public final class ArmTemplateMappingRuleProfile implements JsonSerializable<ArmTemplateMappingRuleProfile> {
    /*
     * List of template parameters.
     */
    private String templateParameters;

    /**
     * Creates an instance of ArmTemplateMappingRuleProfile class.
     */
    public ArmTemplateMappingRuleProfile() {
    }

    /**
     * Get the templateParameters property: List of template parameters.
     * 
     * @return the templateParameters value.
     */
    public String templateParameters() {
        return this.templateParameters;
    }

    /**
     * Set the templateParameters property: List of template parameters.
     * 
     * @param templateParameters the templateParameters value to set.
     * @return the ArmTemplateMappingRuleProfile object itself.
     */
    public ArmTemplateMappingRuleProfile withTemplateParameters(String templateParameters) {
        this.templateParameters = templateParameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("templateParameters", this.templateParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArmTemplateMappingRuleProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArmTemplateMappingRuleProfile if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArmTemplateMappingRuleProfile.
     */
    public static ArmTemplateMappingRuleProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArmTemplateMappingRuleProfile deserializedArmTemplateMappingRuleProfile
                = new ArmTemplateMappingRuleProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("templateParameters".equals(fieldName)) {
                    deserializedArmTemplateMappingRuleProfile.templateParameters = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArmTemplateMappingRuleProfile;
        });
    }
}
