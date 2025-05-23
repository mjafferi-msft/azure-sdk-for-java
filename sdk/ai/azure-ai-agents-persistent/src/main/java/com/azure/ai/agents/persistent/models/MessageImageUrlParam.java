// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines how an external image URL is referenced when creating an image-URL block.
 */
@Fluent
public final class MessageImageUrlParam implements JsonSerializable<MessageImageUrlParam> {

    /*
     * The publicly accessible URL of the external image.
     */
    @Generated
    private final String url;

    /*
     * Optional detail level for the image (auto, low, or high). Defaults to 'auto' if not specified.
     */
    @Generated
    private ImageDetailLevel detail;

    /**
     * Creates an instance of MessageImageUrlParam class.
     *
     * @param url the url value to set.
     */
    @Generated
    public MessageImageUrlParam(String url) {
        this.url = url;
    }

    /**
     * Get the url property: The publicly accessible URL of the external image.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the detail property: Optional detail level for the image (auto, low, or high). Defaults to 'auto' if not
     * specified.
     *
     * @return the detail value.
     */
    @Generated
    public ImageDetailLevel getDetail() {
        return this.detail;
    }

    /**
     * Set the detail property: Optional detail level for the image (auto, low, or high). Defaults to 'auto' if not
     * specified.
     *
     * @param detail the detail value to set.
     * @return the MessageImageUrlParam object itself.
     */
    @Generated
    public MessageImageUrlParam setDetail(ImageDetailLevel detail) {
        this.detail = detail;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("url", this.url);
        jsonWriter.writeStringField("detail", this.detail == null ? null : this.detail.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageImageUrlParam from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageImageUrlParam if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageImageUrlParam.
     */
    @Generated
    public static MessageImageUrlParam fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String url = null;
            ImageDetailLevel detail = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("url".equals(fieldName)) {
                    url = reader.getString();
                } else if ("detail".equals(fieldName)) {
                    detail = ImageDetailLevel.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            MessageImageUrlParam deserializedMessageImageUrlParam = new MessageImageUrlParam(url);
            deserializedMessageImageUrlParam.detail = detail;
            return deserializedMessageImageUrlParam;
        });
    }
}
