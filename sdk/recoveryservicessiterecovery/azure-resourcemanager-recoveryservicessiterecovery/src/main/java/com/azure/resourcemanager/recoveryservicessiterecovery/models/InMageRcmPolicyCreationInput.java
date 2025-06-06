// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * InMageRcm policy creation input.
 */
@Fluent
public final class InMageRcmPolicyCreationInput extends PolicyProviderSpecificInput {
    /*
     * The class type.
     */
    private String instanceType = "InMageRcm";

    /*
     * The duration in minutes until which the recovery points need to be stored.
     */
    private Integer recoveryPointHistoryInMinutes;

    /*
     * The crash consistent snapshot frequency (in minutes).
     */
    private Integer crashConsistentFrequencyInMinutes;

    /*
     * The app consistent snapshot frequency (in minutes).
     */
    private Integer appConsistentFrequencyInMinutes;

    /*
     * A value indicating whether multi-VM sync has to be enabled.
     */
    private String enableMultiVmSync;

    /**
     * Creates an instance of InMageRcmPolicyCreationInput class.
     */
    public InMageRcmPolicyCreationInput() {
    }

    /**
     * Get the instanceType property: The class type.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the recoveryPointHistoryInMinutes property: The duration in minutes until which the recovery points need to
     * be stored.
     * 
     * @return the recoveryPointHistoryInMinutes value.
     */
    public Integer recoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes;
    }

    /**
     * Set the recoveryPointHistoryInMinutes property: The duration in minutes until which the recovery points need to
     * be stored.
     * 
     * @param recoveryPointHistoryInMinutes the recoveryPointHistoryInMinutes value to set.
     * @return the InMageRcmPolicyCreationInput object itself.
     */
    public InMageRcmPolicyCreationInput withRecoveryPointHistoryInMinutes(Integer recoveryPointHistoryInMinutes) {
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency (in minutes).
     * 
     * @return the crashConsistentFrequencyInMinutes value.
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency (in minutes).
     * 
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set.
     * @return the InMageRcmPolicyCreationInput object itself.
     */
    public InMageRcmPolicyCreationInput
        withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency (in minutes).
     * 
     * @return the appConsistentFrequencyInMinutes value.
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency (in minutes).
     * 
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set.
     * @return the InMageRcmPolicyCreationInput object itself.
     */
    public InMageRcmPolicyCreationInput withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the enableMultiVmSync property: A value indicating whether multi-VM sync has to be enabled.
     * 
     * @return the enableMultiVmSync value.
     */
    public String enableMultiVmSync() {
        return this.enableMultiVmSync;
    }

    /**
     * Set the enableMultiVmSync property: A value indicating whether multi-VM sync has to be enabled.
     * 
     * @param enableMultiVmSync the enableMultiVmSync value to set.
     * @return the InMageRcmPolicyCreationInput object itself.
     */
    public InMageRcmPolicyCreationInput withEnableMultiVmSync(String enableMultiVmSync) {
        this.enableMultiVmSync = enableMultiVmSync;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceType", this.instanceType);
        jsonWriter.writeNumberField("recoveryPointHistoryInMinutes", this.recoveryPointHistoryInMinutes);
        jsonWriter.writeNumberField("crashConsistentFrequencyInMinutes", this.crashConsistentFrequencyInMinutes);
        jsonWriter.writeNumberField("appConsistentFrequencyInMinutes", this.appConsistentFrequencyInMinutes);
        jsonWriter.writeStringField("enableMultiVmSync", this.enableMultiVmSync);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InMageRcmPolicyCreationInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InMageRcmPolicyCreationInput if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InMageRcmPolicyCreationInput.
     */
    public static InMageRcmPolicyCreationInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InMageRcmPolicyCreationInput deserializedInMageRcmPolicyCreationInput = new InMageRcmPolicyCreationInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedInMageRcmPolicyCreationInput.instanceType = reader.getString();
                } else if ("recoveryPointHistoryInMinutes".equals(fieldName)) {
                    deserializedInMageRcmPolicyCreationInput.recoveryPointHistoryInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("crashConsistentFrequencyInMinutes".equals(fieldName)) {
                    deserializedInMageRcmPolicyCreationInput.crashConsistentFrequencyInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("appConsistentFrequencyInMinutes".equals(fieldName)) {
                    deserializedInMageRcmPolicyCreationInput.appConsistentFrequencyInMinutes
                        = reader.getNullable(JsonReader::getInt);
                } else if ("enableMultiVmSync".equals(fieldName)) {
                    deserializedInMageRcmPolicyCreationInput.enableMultiVmSync = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInMageRcmPolicyCreationInput;
        });
    }
}
