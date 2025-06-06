// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.carbonoptimization.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response for available date range of carbon emission data.
 */
@Immutable
public final class CarbonEmissionDataAvailableDateRangeInner
    implements JsonSerializable<CarbonEmissionDataAvailableDateRangeInner> {
    /*
     * Start date parameter, format is yyyy-MM-dd
     */
    private String startDate;

    /*
     * End date parameter, format is yyyy-MM-dd
     */
    private String endDate;

    /**
     * Creates an instance of CarbonEmissionDataAvailableDateRangeInner class.
     */
    private CarbonEmissionDataAvailableDateRangeInner() {
    }

    /**
     * Get the startDate property: Start date parameter, format is yyyy-MM-dd.
     * 
     * @return the startDate value.
     */
    public String startDate() {
        return this.startDate;
    }

    /**
     * Get the endDate property: End date parameter, format is yyyy-MM-dd.
     * 
     * @return the endDate value.
     */
    public String endDate() {
        return this.endDate;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startDate() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property startDate in model CarbonEmissionDataAvailableDateRangeInner"));
        }
        if (endDate() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endDate in model CarbonEmissionDataAvailableDateRangeInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CarbonEmissionDataAvailableDateRangeInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startDate", this.startDate);
        jsonWriter.writeStringField("endDate", this.endDate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CarbonEmissionDataAvailableDateRangeInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CarbonEmissionDataAvailableDateRangeInner if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CarbonEmissionDataAvailableDateRangeInner.
     */
    public static CarbonEmissionDataAvailableDateRangeInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CarbonEmissionDataAvailableDateRangeInner deserializedCarbonEmissionDataAvailableDateRangeInner
                = new CarbonEmissionDataAvailableDateRangeInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startDate".equals(fieldName)) {
                    deserializedCarbonEmissionDataAvailableDateRangeInner.startDate = reader.getString();
                } else if ("endDate".equals(fieldName)) {
                    deserializedCarbonEmissionDataAvailableDateRangeInner.endDate = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCarbonEmissionDataAvailableDateRangeInner;
        });
    }
}
