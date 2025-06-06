// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The identity information for retrieving the certificate for the custom domain.
 */
@Fluent
public final class CustomDomainIdentity implements JsonSerializable<CustomDomainIdentity> {
    /*
     * The type of managed identity used. Can be either 'SystemAssigned' or 'UserAssigned'.
     */
    private CustomDomainIdentityType type;

    /*
     * The user identity associated with the resource.
     */
    private String userAssignedIdentity;

    /**
     * Creates an instance of CustomDomainIdentity class.
     */
    public CustomDomainIdentity() {
    }

    /**
     * Get the type property: The type of managed identity used. Can be either 'SystemAssigned' or 'UserAssigned'.
     * 
     * @return the type value.
     */
    public CustomDomainIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of managed identity used. Can be either 'SystemAssigned' or 'UserAssigned'.
     * 
     * @param type the type value to set.
     * @return the CustomDomainIdentity object itself.
     */
    public CustomDomainIdentity withType(CustomDomainIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentity property: The user identity associated with the resource.
     * 
     * @return the userAssignedIdentity value.
     */
    public String userAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    /**
     * Set the userAssignedIdentity property: The user identity associated with the resource.
     * 
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     * @return the CustomDomainIdentity object itself.
     */
    public CustomDomainIdentity withUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("userAssignedIdentity", this.userAssignedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomainIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomainIdentity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomDomainIdentity.
     */
    public static CustomDomainIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomainIdentity deserializedCustomDomainIdentity = new CustomDomainIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedCustomDomainIdentity.type = CustomDomainIdentityType.fromString(reader.getString());
                } else if ("userAssignedIdentity".equals(fieldName)) {
                    deserializedCustomDomainIdentity.userAssignedIdentity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomainIdentity;
        });
    }
}
