// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.v2.security.keyvault.administration.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import io.clientcore.core.utils.ExpandableEnum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * The role definition type.
 */
public final class KeyVaultRoleDefinitionType
    implements ExpandableEnum<String>, JsonSerializable<KeyVaultRoleDefinitionType> {
    private static final Map<String, KeyVaultRoleDefinitionType> VALUES = new ConcurrentHashMap<>();

    private static final Function<String, KeyVaultRoleDefinitionType> NEW_INSTANCE = KeyVaultRoleDefinitionType::new;

    /**
     * Microsoft-defined role definitions.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static final KeyVaultRoleDefinitionType MICROSOFT_AUTHORIZATION_ROLE_DEFINITIONS
        = fromValue("Microsoft.Authorization/roleDefinitions");

    private final String value;

    private KeyVaultRoleDefinitionType(String value) {
        this.value = value;
    }

    /**
     * Creates or finds a KeyVaultRoleDefinitionType.
     * 
     * @param value a value to look for.
     * @return the corresponding KeyVaultRoleDefinitionType.
     * @throws IllegalArgumentException if value is null.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static KeyVaultRoleDefinitionType fromValue(String value) {
        if (value == null) {
            throw new IllegalArgumentException("'value' cannot be null.");
        }
        return VALUES.computeIfAbsent(value, NEW_INSTANCE);
    }

    /**
     * Gets known KeyVaultRoleDefinitionType values.
     * 
     * @return Known KeyVaultRoleDefinitionType values.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static Collection<KeyVaultRoleDefinitionType> values() {
        return new ArrayList<>(VALUES.values());
    }

    /**
     * Gets the value of the KeyVaultRoleDefinitionType instance.
     * 
     * @return the value of the KeyVaultRoleDefinitionType instance.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeString(getValue());
    }

    /**
     * Reads an instance of KeyVaultRoleDefinitionType from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KeyVaultRoleDefinitionType if the JsonReader was pointing to an instance of it, or null if
     * the JsonReader was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KeyVaultRoleDefinitionType.
     * @throws IllegalStateException If unexpected JSON token is found.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static KeyVaultRoleDefinitionType fromJson(JsonReader jsonReader) throws IOException {
        JsonToken nextToken = jsonReader.nextToken();
        if (nextToken == JsonToken.NULL) {
            return null;
        }
        if (nextToken != JsonToken.STRING) {
            throw new IllegalStateException(
                String.format("Unexpected JSON token for %s deserialization: %s", JsonToken.STRING, nextToken));
        }
        return KeyVaultRoleDefinitionType.fromValue(jsonReader.getString());
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public String toString() {
        return Objects.toString(this.value);
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}
