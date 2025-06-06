// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mobilenetwork.models.Platform;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Packet core control plane version properties.
 */
@Fluent
public final class PacketCoreControlPlaneVersionPropertiesFormat
    implements JsonSerializable<PacketCoreControlPlaneVersionPropertiesFormat> {
    /*
     * The provisioning state of the packet core control plane version resource.
     */
    private ProvisioningState provisioningState;

    /*
     * Platform specific packet core control plane version properties.
     */
    private List<Platform> platforms;

    /**
     * Creates an instance of PacketCoreControlPlaneVersionPropertiesFormat class.
     */
    public PacketCoreControlPlaneVersionPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet core control plane version resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the platforms property: Platform specific packet core control plane version properties.
     * 
     * @return the platforms value.
     */
    public List<Platform> platforms() {
        return this.platforms;
    }

    /**
     * Set the platforms property: Platform specific packet core control plane version properties.
     * 
     * @param platforms the platforms value to set.
     * @return the PacketCoreControlPlaneVersionPropertiesFormat object itself.
     */
    public PacketCoreControlPlaneVersionPropertiesFormat withPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (platforms() != null) {
            platforms().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("platforms", this.platforms, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PacketCoreControlPlaneVersionPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PacketCoreControlPlaneVersionPropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PacketCoreControlPlaneVersionPropertiesFormat.
     */
    public static PacketCoreControlPlaneVersionPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PacketCoreControlPlaneVersionPropertiesFormat deserializedPacketCoreControlPlaneVersionPropertiesFormat
                = new PacketCoreControlPlaneVersionPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedPacketCoreControlPlaneVersionPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("platforms".equals(fieldName)) {
                    List<Platform> platforms = reader.readArray(reader1 -> Platform.fromJson(reader1));
                    deserializedPacketCoreControlPlaneVersionPropertiesFormat.platforms = platforms;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPacketCoreControlPlaneVersionPropertiesFormat;
        });
    }
}
