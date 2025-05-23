// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Configuration for defining the transfer of data.
 */
@Fluent
public final class TransferConfiguration implements JsonSerializable<TransferConfiguration> {
    /*
     * Type of the configuration for transfer.
     */
    private TransferConfigurationType transferConfigurationType;

    /*
     * Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is
     * given as TransferUsingFilter.
     */
    private TransferConfigurationTransferFilterDetails transferFilterDetails;

    /*
     * Map of filter type and the details to transfer all data. This field is required only if the
     * TransferConfigurationType is given as TransferAll
     */
    private TransferConfigurationTransferAllDetails transferAllDetails;

    /**
     * Creates an instance of TransferConfiguration class.
     */
    public TransferConfiguration() {
    }

    /**
     * Get the transferConfigurationType property: Type of the configuration for transfer.
     * 
     * @return the transferConfigurationType value.
     */
    public TransferConfigurationType transferConfigurationType() {
        return this.transferConfigurationType;
    }

    /**
     * Set the transferConfigurationType property: Type of the configuration for transfer.
     * 
     * @param transferConfigurationType the transferConfigurationType value to set.
     * @return the TransferConfiguration object itself.
     */
    public TransferConfiguration withTransferConfigurationType(TransferConfigurationType transferConfigurationType) {
        this.transferConfigurationType = transferConfigurationType;
        return this;
    }

    /**
     * Get the transferFilterDetails property: Map of filter type and the details to filter. This field is required only
     * if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     * @return the transferFilterDetails value.
     */
    public TransferConfigurationTransferFilterDetails transferFilterDetails() {
        return this.transferFilterDetails;
    }

    /**
     * Set the transferFilterDetails property: Map of filter type and the details to filter. This field is required only
     * if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     * @param transferFilterDetails the transferFilterDetails value to set.
     * @return the TransferConfiguration object itself.
     */
    public TransferConfiguration
        withTransferFilterDetails(TransferConfigurationTransferFilterDetails transferFilterDetails) {
        this.transferFilterDetails = transferFilterDetails;
        return this;
    }

    /**
     * Get the transferAllDetails property: Map of filter type and the details to transfer all data. This field is
     * required only if the TransferConfigurationType is given as TransferAll.
     * 
     * @return the transferAllDetails value.
     */
    public TransferConfigurationTransferAllDetails transferAllDetails() {
        return this.transferAllDetails;
    }

    /**
     * Set the transferAllDetails property: Map of filter type and the details to transfer all data. This field is
     * required only if the TransferConfigurationType is given as TransferAll.
     * 
     * @param transferAllDetails the transferAllDetails value to set.
     * @return the TransferConfiguration object itself.
     */
    public TransferConfiguration withTransferAllDetails(TransferConfigurationTransferAllDetails transferAllDetails) {
        this.transferAllDetails = transferAllDetails;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (transferConfigurationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property transferConfigurationType in model TransferConfiguration"));
        }
        if (transferFilterDetails() != null) {
            transferFilterDetails().validate();
        }
        if (transferAllDetails() != null) {
            transferAllDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TransferConfiguration.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("transferConfigurationType",
            this.transferConfigurationType == null ? null : this.transferConfigurationType.toString());
        jsonWriter.writeJsonField("transferFilterDetails", this.transferFilterDetails);
        jsonWriter.writeJsonField("transferAllDetails", this.transferAllDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TransferConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TransferConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TransferConfiguration.
     */
    public static TransferConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TransferConfiguration deserializedTransferConfiguration = new TransferConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("transferConfigurationType".equals(fieldName)) {
                    deserializedTransferConfiguration.transferConfigurationType
                        = TransferConfigurationType.fromString(reader.getString());
                } else if ("transferFilterDetails".equals(fieldName)) {
                    deserializedTransferConfiguration.transferFilterDetails
                        = TransferConfigurationTransferFilterDetails.fromJson(reader);
                } else if ("transferAllDetails".equals(fieldName)) {
                    deserializedTransferConfiguration.transferAllDetails
                        = TransferConfigurationTransferAllDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTransferConfiguration;
        });
    }
}
