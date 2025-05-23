// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.agrifood.models.DetailedInformation;
import java.io.IOException;
import java.util.List;

/**
 * FarmBeats extension resource.
 */
@Immutable
public final class FarmBeatsExtensionInner extends ProxyResource {
    /*
     * FarmBeatsExtension properties.
     */
    private FarmBeatsExtensionProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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
     * Creates an instance of FarmBeatsExtensionInner class.
     */
    public FarmBeatsExtensionInner() {
    }

    /**
     * Get the innerProperties property: FarmBeatsExtension properties.
     * 
     * @return the innerProperties value.
     */
    private FarmBeatsExtensionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the targetResourceType property: Target ResourceType of the farmBeatsExtension.
     * 
     * @return the targetResourceType value.
     */
    public String targetResourceType() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceType();
    }

    /**
     * Get the farmBeatsExtensionId property: FarmBeatsExtension ID.
     * 
     * @return the farmBeatsExtensionId value.
     */
    public String farmBeatsExtensionId() {
        return this.innerProperties() == null ? null : this.innerProperties().farmBeatsExtensionId();
    }

    /**
     * Get the farmBeatsExtensionName property: FarmBeatsExtension name.
     * 
     * @return the farmBeatsExtensionName value.
     */
    public String farmBeatsExtensionName() {
        return this.innerProperties() == null ? null : this.innerProperties().farmBeatsExtensionName();
    }

    /**
     * Get the farmBeatsExtensionVersion property: FarmBeatsExtension version.
     * 
     * @return the farmBeatsExtensionVersion value.
     */
    public String farmBeatsExtensionVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().farmBeatsExtensionVersion();
    }

    /**
     * Get the publisherId property: Publisher ID.
     * 
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.innerProperties() == null ? null : this.innerProperties().publisherId();
    }

    /**
     * Get the description property: Textual description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the extensionCategory property: Category of the extension. e.g. weather/sensor/satellite.
     * 
     * @return the extensionCategory value.
     */
    public String extensionCategory() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionCategory();
    }

    /**
     * Get the extensionAuthLink property: FarmBeatsExtension auth link.
     * 
     * @return the extensionAuthLink value.
     */
    public String extensionAuthLink() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionAuthLink();
    }

    /**
     * Get the extensionApiDocsLink property: FarmBeatsExtension api docs link.
     * 
     * @return the extensionApiDocsLink value.
     */
    public String extensionApiDocsLink() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionApiDocsLink();
    }

    /**
     * Get the detailedInformation property: Detailed information which shows summary of requested data.
     * Used in descriptive get extension metadata call.
     * Information for weather category per api included are apisSupported,
     * customParameters, PlatformParameters and Units supported.
     * 
     * @return the detailedInformation value.
     */
    public List<DetailedInformation> detailedInformation() {
        return this.innerProperties() == null ? null : this.innerProperties().detailedInformation();
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
     * Reads an instance of FarmBeatsExtensionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FarmBeatsExtensionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FarmBeatsExtensionInner.
     */
    public static FarmBeatsExtensionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FarmBeatsExtensionInner deserializedFarmBeatsExtensionInner = new FarmBeatsExtensionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFarmBeatsExtensionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFarmBeatsExtensionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedFarmBeatsExtensionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedFarmBeatsExtensionInner.innerProperties = FarmBeatsExtensionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedFarmBeatsExtensionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFarmBeatsExtensionInner;
        });
    }
}
