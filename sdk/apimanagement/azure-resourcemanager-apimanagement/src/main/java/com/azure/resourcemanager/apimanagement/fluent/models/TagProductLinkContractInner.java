// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Tag-product link details.
 */
@Fluent
public final class TagProductLinkContractInner extends ProxyResource {
    /*
     * Tag-API link entity contract properties.
     */
    private TagProductLinkContractProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of TagProductLinkContractInner class.
     */
    public TagProductLinkContractInner() {
    }

    /**
     * Get the innerProperties property: Tag-API link entity contract properties.
     * 
     * @return the innerProperties value.
     */
    private TagProductLinkContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the productId property: Full resource Id of a product.
     * 
     * @return the productId value.
     */
    public String productId() {
        return this.innerProperties() == null ? null : this.innerProperties().productId();
    }

    /**
     * Set the productId property: Full resource Id of a product.
     * 
     * @param productId the productId value to set.
     * @return the TagProductLinkContractInner object itself.
     */
    public TagProductLinkContractInner withProductId(String productId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TagProductLinkContractProperties();
        }
        this.innerProperties().withProductId(productId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagProductLinkContractInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagProductLinkContractInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TagProductLinkContractInner.
     */
    public static TagProductLinkContractInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagProductLinkContractInner deserializedTagProductLinkContractInner = new TagProductLinkContractInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedTagProductLinkContractInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedTagProductLinkContractInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedTagProductLinkContractInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedTagProductLinkContractInner.innerProperties
                        = TagProductLinkContractProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagProductLinkContractInner;
        });
    }
}
