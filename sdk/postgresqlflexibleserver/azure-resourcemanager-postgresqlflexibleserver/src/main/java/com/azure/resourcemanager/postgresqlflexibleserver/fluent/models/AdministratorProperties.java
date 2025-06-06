// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PrincipalType;
import java.io.IOException;

/**
 * The properties of an Microsoft Entra Administrator.
 */
@Fluent
public final class AdministratorProperties implements JsonSerializable<AdministratorProperties> {
    /*
     * The principal type used to represent the type of Microsoft Entra Administrator.
     */
    private PrincipalType principalType;

    /*
     * Microsoft Entra Administrator principal name.
     */
    private String principalName;

    /*
     * The objectId of the Microsoft Entra Administrator.
     */
    private String objectId;

    /*
     * The tenantId of the Microsoft Entra Administrator.
     */
    private String tenantId;

    /**
     * Creates an instance of AdministratorProperties class.
     */
    public AdministratorProperties() {
    }

    /**
     * Get the principalType property: The principal type used to represent the type of Microsoft Entra Administrator.
     * 
     * @return the principalType value.
     */
    public PrincipalType principalType() {
        return this.principalType;
    }

    /**
     * Set the principalType property: The principal type used to represent the type of Microsoft Entra Administrator.
     * 
     * @param principalType the principalType value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * Get the principalName property: Microsoft Entra Administrator principal name.
     * 
     * @return the principalName value.
     */
    public String principalName() {
        return this.principalName;
    }

    /**
     * Set the principalName property: Microsoft Entra Administrator principal name.
     * 
     * @param principalName the principalName value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * Get the objectId property: The objectId of the Microsoft Entra Administrator.
     * 
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The objectId of the Microsoft Entra Administrator.
     * 
     * @param objectId the objectId value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the tenantId property: The tenantId of the Microsoft Entra Administrator.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId of the Microsoft Entra Administrator.
     * 
     * @param tenantId the tenantId value to set.
     * @return the AdministratorProperties object itself.
     */
    public AdministratorProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
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
        jsonWriter.writeStringField("principalType", this.principalType == null ? null : this.principalType.toString());
        jsonWriter.writeStringField("principalName", this.principalName);
        jsonWriter.writeStringField("objectId", this.objectId);
        jsonWriter.writeStringField("tenantId", this.tenantId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdministratorProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdministratorProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AdministratorProperties.
     */
    public static AdministratorProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdministratorProperties deserializedAdministratorProperties = new AdministratorProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("principalType".equals(fieldName)) {
                    deserializedAdministratorProperties.principalType = PrincipalType.fromString(reader.getString());
                } else if ("principalName".equals(fieldName)) {
                    deserializedAdministratorProperties.principalName = reader.getString();
                } else if ("objectId".equals(fieldName)) {
                    deserializedAdministratorProperties.objectId = reader.getString();
                } else if ("tenantId".equals(fieldName)) {
                    deserializedAdministratorProperties.tenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdministratorProperties;
        });
    }
}
