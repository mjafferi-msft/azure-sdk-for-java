// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservicefleet.models.AutoUpgradeNodeImageSelection;
import com.azure.resourcemanager.containerservicefleet.models.AutoUpgradeProfileProvisioningState;
import com.azure.resourcemanager.containerservicefleet.models.AutoUpgradeProfileStatus;
import com.azure.resourcemanager.containerservicefleet.models.UpgradeChannel;
import java.io.IOException;

/**
 * The AutoUpgradeProfile resource.
 */
@Fluent
public final class AutoUpgradeProfileInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private AutoUpgradeProfileProperties innerProperties;

    /*
     * If eTag is provided in the response body, it may also be provided as a header per the normal etag convention.
     * Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity
     * tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section
     * 14.27) header fields.
     */
    private String etag;

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
     * Creates an instance of AutoUpgradeProfileInner class.
     */
    public AutoUpgradeProfileInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private AutoUpgradeProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: If eTag is provided in the response body, it may also be provided as a header per the
     * normal etag convention. Entity tags are used for comparing two or more entities from the same requested resource.
     * HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26),
     * and If-Range (section 14.27) header fields.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
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
     * Get the provisioningState property: The provisioning state of the AutoUpgradeProfile resource.
     * 
     * @return the provisioningState value.
     */
    public AutoUpgradeProfileProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the updateStrategyId property: The resource id of the UpdateStrategy resource to reference. If not specified,
     * the auto upgrade will run on all clusters which are members of the fleet.
     * 
     * @return the updateStrategyId value.
     */
    public String updateStrategyId() {
        return this.innerProperties() == null ? null : this.innerProperties().updateStrategyId();
    }

    /**
     * Set the updateStrategyId property: The resource id of the UpdateStrategy resource to reference. If not specified,
     * the auto upgrade will run on all clusters which are members of the fleet.
     * 
     * @param updateStrategyId the updateStrategyId value to set.
     * @return the AutoUpgradeProfileInner object itself.
     */
    public AutoUpgradeProfileInner withUpdateStrategyId(String updateStrategyId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoUpgradeProfileProperties();
        }
        this.innerProperties().withUpdateStrategyId(updateStrategyId);
        return this;
    }

    /**
     * Get the channel property: Configures how auto-upgrade will be run.
     * 
     * @return the channel value.
     */
    public UpgradeChannel channel() {
        return this.innerProperties() == null ? null : this.innerProperties().channel();
    }

    /**
     * Set the channel property: Configures how auto-upgrade will be run.
     * 
     * @param channel the channel value to set.
     * @return the AutoUpgradeProfileInner object itself.
     */
    public AutoUpgradeProfileInner withChannel(UpgradeChannel channel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoUpgradeProfileProperties();
        }
        this.innerProperties().withChannel(channel);
        return this;
    }

    /**
     * Get the nodeImageSelection property: The node image upgrade to be applied to the target clusters in auto upgrade.
     * 
     * @return the nodeImageSelection value.
     */
    public AutoUpgradeNodeImageSelection nodeImageSelection() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeImageSelection();
    }

    /**
     * Set the nodeImageSelection property: The node image upgrade to be applied to the target clusters in auto upgrade.
     * 
     * @param nodeImageSelection the nodeImageSelection value to set.
     * @return the AutoUpgradeProfileInner object itself.
     */
    public AutoUpgradeProfileInner withNodeImageSelection(AutoUpgradeNodeImageSelection nodeImageSelection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoUpgradeProfileProperties();
        }
        this.innerProperties().withNodeImageSelection(nodeImageSelection);
        return this;
    }

    /**
     * Get the disabled property: If set to False: the auto upgrade has effect - target managed clusters will be
     * upgraded on schedule.
     * If set to True: the auto upgrade has no effect - no upgrade will be run on the target managed clusters.
     * This is a boolean and not an enum because enabled/disabled are all available states of the auto upgrade profile.
     * By default, this is set to False.
     * 
     * @return the disabled value.
     */
    public Boolean disabled() {
        return this.innerProperties() == null ? null : this.innerProperties().disabled();
    }

    /**
     * Set the disabled property: If set to False: the auto upgrade has effect - target managed clusters will be
     * upgraded on schedule.
     * If set to True: the auto upgrade has no effect - no upgrade will be run on the target managed clusters.
     * This is a boolean and not an enum because enabled/disabled are all available states of the auto upgrade profile.
     * By default, this is set to False.
     * 
     * @param disabled the disabled value to set.
     * @return the AutoUpgradeProfileInner object itself.
     */
    public AutoUpgradeProfileInner withDisabled(Boolean disabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoUpgradeProfileProperties();
        }
        this.innerProperties().withDisabled(disabled);
        return this;
    }

    /**
     * Get the autoUpgradeProfileStatus property: The status of the auto upgrade profile.
     * 
     * @return the autoUpgradeProfileStatus value.
     */
    public AutoUpgradeProfileStatus autoUpgradeProfileStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().autoUpgradeProfileStatus();
    }

    /**
     * Set the autoUpgradeProfileStatus property: The status of the auto upgrade profile.
     * 
     * @param autoUpgradeProfileStatus the autoUpgradeProfileStatus value to set.
     * @return the AutoUpgradeProfileInner object itself.
     */
    public AutoUpgradeProfileInner withAutoUpgradeProfileStatus(AutoUpgradeProfileStatus autoUpgradeProfileStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AutoUpgradeProfileProperties();
        }
        this.innerProperties().withAutoUpgradeProfileStatus(autoUpgradeProfileStatus);
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
     * Reads an instance of AutoUpgradeProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AutoUpgradeProfileInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AutoUpgradeProfileInner.
     */
    public static AutoUpgradeProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AutoUpgradeProfileInner deserializedAutoUpgradeProfileInner = new AutoUpgradeProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAutoUpgradeProfileInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedAutoUpgradeProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedAutoUpgradeProfileInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedAutoUpgradeProfileInner.innerProperties = AutoUpgradeProfileProperties.fromJson(reader);
                } else if ("eTag".equals(fieldName)) {
                    deserializedAutoUpgradeProfileInner.etag = reader.getString();
                } else if ("systemData".equals(fieldName)) {
                    deserializedAutoUpgradeProfileInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAutoUpgradeProfileInner;
        });
    }
}
