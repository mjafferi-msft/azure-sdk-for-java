// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties specific to Endpoints.
 */
@Fluent
public final class EndpointProperties implements JsonSerializable<EndpointProperties> {
    /*
     * Unique identifier for the entity
     */
    private String entityId;

    /*
     * Name of the resource
     */
    private String entityName;

    /*
     * Timestamp indicating when the entity was created
     */
    private String createdAt;

    /*
     * Provisioning state of the resource.
     */
    private ResourceProvisioningState provisioningState;

    /*
     * Additional attributes for the entity
     */
    private List<Attributes> attributes;

    /*
     * The ID of the project this endpoint belongs to
     */
    private String projectId;

    /*
     * The ID of the branch this endpoint belongs to
     */
    private String branchId;

    /*
     * The type of the endpoint
     */
    private EndpointType endpointType;

    /**
     * Creates an instance of EndpointProperties class.
     */
    public EndpointProperties() {
    }

    /**
     * Get the entityId property: Unique identifier for the entity.
     * 
     * @return the entityId value.
     */
    public String entityId() {
        return this.entityId;
    }

    /**
     * Get the entityName property: Name of the resource.
     * 
     * @return the entityName value.
     */
    public String entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName property: Name of the resource.
     * 
     * @param entityName the entityName value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get the createdAt property: Timestamp indicating when the entity was created.
     * 
     * @return the createdAt value.
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the attributes property: Additional attributes for the entity.
     * 
     * @return the attributes value.
     */
    public List<Attributes> attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: Additional attributes for the entity.
     * 
     * @param attributes the attributes value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the projectId property: The ID of the project this endpoint belongs to.
     * 
     * @return the projectId value.
     */
    public String projectId() {
        return this.projectId;
    }

    /**
     * Set the projectId property: The ID of the project this endpoint belongs to.
     * 
     * @param projectId the projectId value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get the branchId property: The ID of the branch this endpoint belongs to.
     * 
     * @return the branchId value.
     */
    public String branchId() {
        return this.branchId;
    }

    /**
     * Set the branchId property: The ID of the branch this endpoint belongs to.
     * 
     * @param branchId the branchId value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }

    /**
     * Get the endpointType property: The type of the endpoint.
     * 
     * @return the endpointType value.
     */
    public EndpointType endpointType() {
        return this.endpointType;
    }

    /**
     * Set the endpointType property: The type of the endpoint.
     * 
     * @param endpointType the endpointType value to set.
     * @return the EndpointProperties object itself.
     */
    public EndpointProperties withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attributes() != null) {
            attributes().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("entityName", this.entityName);
        jsonWriter.writeArrayField("attributes", this.attributes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("projectId", this.projectId);
        jsonWriter.writeStringField("branchId", this.branchId);
        jsonWriter.writeStringField("endpointType", this.endpointType == null ? null : this.endpointType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EndpointProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EndpointProperties.
     */
    public static EndpointProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointProperties deserializedEndpointProperties = new EndpointProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("entityId".equals(fieldName)) {
                    deserializedEndpointProperties.entityId = reader.getString();
                } else if ("entityName".equals(fieldName)) {
                    deserializedEndpointProperties.entityName = reader.getString();
                } else if ("createdAt".equals(fieldName)) {
                    deserializedEndpointProperties.createdAt = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedEndpointProperties.provisioningState
                        = ResourceProvisioningState.fromString(reader.getString());
                } else if ("attributes".equals(fieldName)) {
                    List<Attributes> attributes = reader.readArray(reader1 -> Attributes.fromJson(reader1));
                    deserializedEndpointProperties.attributes = attributes;
                } else if ("projectId".equals(fieldName)) {
                    deserializedEndpointProperties.projectId = reader.getString();
                } else if ("branchId".equals(fieldName)) {
                    deserializedEndpointProperties.branchId = reader.getString();
                } else if ("endpointType".equals(fieldName)) {
                    deserializedEndpointProperties.endpointType = EndpointType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointProperties;
        });
    }
}
