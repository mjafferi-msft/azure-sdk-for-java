// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Current TCP connectivity information from the App Service Environment to a single endpoint.
 */
@Fluent
public final class EndpointDetail implements JsonSerializable<EndpointDetail> {
    /*
     * An IP Address that Domain Name currently resolves to.
     */
    private String ipAddress;

    /*
     * The port an endpoint is connected to.
     */
    private Integer port;

    /*
     * The time in milliseconds it takes for a TCP connection to be created from the App Service Environment to this
     * IpAddress at this Port.
     */
    private Double latency;

    /*
     * Whether it is possible to create a TCP connection from the App Service Environment to this IpAddress at this
     * Port.
     */
    private Boolean isAccessible;

    /**
     * Creates an instance of EndpointDetail class.
     */
    public EndpointDetail() {
    }

    /**
     * Get the ipAddress property: An IP Address that Domain Name currently resolves to.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: An IP Address that Domain Name currently resolves to.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the port property: The port an endpoint is connected to.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port an endpoint is connected to.
     * 
     * @param port the port value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the latency property: The time in milliseconds it takes for a TCP connection to be created from the App
     * Service Environment to this IpAddress at this Port.
     * 
     * @return the latency value.
     */
    public Double latency() {
        return this.latency;
    }

    /**
     * Set the latency property: The time in milliseconds it takes for a TCP connection to be created from the App
     * Service Environment to this IpAddress at this Port.
     * 
     * @param latency the latency value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withLatency(Double latency) {
        this.latency = latency;
        return this;
    }

    /**
     * Get the isAccessible property: Whether it is possible to create a TCP connection from the App Service Environment
     * to this IpAddress at this Port.
     * 
     * @return the isAccessible value.
     */
    public Boolean isAccessible() {
        return this.isAccessible;
    }

    /**
     * Set the isAccessible property: Whether it is possible to create a TCP connection from the App Service Environment
     * to this IpAddress at this Port.
     * 
     * @param isAccessible the isAccessible value to set.
     * @return the EndpointDetail object itself.
     */
    public EndpointDetail withIsAccessible(Boolean isAccessible) {
        this.isAccessible = isAccessible;
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
        jsonWriter.writeStringField("ipAddress", this.ipAddress);
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeNumberField("latency", this.latency);
        jsonWriter.writeBooleanField("isAccessible", this.isAccessible);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EndpointDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EndpointDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EndpointDetail.
     */
    public static EndpointDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EndpointDetail deserializedEndpointDetail = new EndpointDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ipAddress".equals(fieldName)) {
                    deserializedEndpointDetail.ipAddress = reader.getString();
                } else if ("port".equals(fieldName)) {
                    deserializedEndpointDetail.port = reader.getNullable(JsonReader::getInt);
                } else if ("latency".equals(fieldName)) {
                    deserializedEndpointDetail.latency = reader.getNullable(JsonReader::getDouble);
                } else if ("isAccessible".equals(fieldName)) {
                    deserializedEndpointDetail.isAccessible = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEndpointDetail;
        });
    }
}
