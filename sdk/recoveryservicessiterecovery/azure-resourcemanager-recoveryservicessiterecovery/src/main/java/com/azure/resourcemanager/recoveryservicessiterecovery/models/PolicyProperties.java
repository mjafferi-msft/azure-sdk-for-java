// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Protection profile custom data details.
 */
@Fluent
public final class PolicyProperties implements JsonSerializable<PolicyProperties> {
    /*
     * The FriendlyName.
     */
    private String friendlyName;

    /*
     * The ReplicationChannelSetting.
     */
    private PolicyProviderSpecificDetails providerSpecificDetails;

    /**
     * Creates an instance of PolicyProperties class.
     */
    public PolicyProperties() {
    }

    /**
     * Get the friendlyName property: The FriendlyName.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The FriendlyName.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the PolicyProperties object itself.
     */
    public PolicyProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The ReplicationChannelSetting.
     * 
     * @return the providerSpecificDetails value.
     */
    public PolicyProviderSpecificDetails providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The ReplicationChannelSetting.
     * 
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the PolicyProperties object itself.
     */
    public PolicyProperties withProviderSpecificDetails(PolicyProviderSpecificDetails providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() != null) {
            providerSpecificDetails().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        jsonWriter.writeJsonField("providerSpecificDetails", this.providerSpecificDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicyProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PolicyProperties.
     */
    public static PolicyProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyProperties deserializedPolicyProperties = new PolicyProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("friendlyName".equals(fieldName)) {
                    deserializedPolicyProperties.friendlyName = reader.getString();
                } else if ("providerSpecificDetails".equals(fieldName)) {
                    deserializedPolicyProperties.providerSpecificDetails
                        = PolicyProviderSpecificDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyProperties;
        });
    }
}
