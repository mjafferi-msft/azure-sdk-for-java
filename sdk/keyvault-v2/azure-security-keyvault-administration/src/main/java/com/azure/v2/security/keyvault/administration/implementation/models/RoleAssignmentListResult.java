// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.v2.security.keyvault.administration.implementation.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Role assignment list operation result.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class RoleAssignmentListResult implements JsonSerializable<RoleAssignmentListResult> {

    /*
     * Role assignment list.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private List<RoleAssignment> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String nextLink;

    /**
     * Creates an instance of RoleAssignmentListResult class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private RoleAssignmentListResult() {
    }

    /**
     * Get the value property: Role assignment list.
     *
     * @return the value value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public List<RoleAssignment> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleAssignmentListResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleAssignmentListResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleAssignmentListResult.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static RoleAssignmentListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleAssignmentListResult deserializedRoleAssignmentListResult = new RoleAssignmentListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("value".equals(fieldName)) {
                    List<RoleAssignment> value = reader.readArray(reader1 -> RoleAssignment.fromJson(reader1));
                    deserializedRoleAssignmentListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedRoleAssignmentListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRoleAssignmentListResult;
        });
    }
}
