// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.administration.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.utils.CoreUtils;

/**
 * The {@link KeyVaultSetting} model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class KeyVaultSetting {
    private static final ClientLogger LOGGER = new ClientLogger(KeyVaultSetting.class);

    private final String name;
    private final Object value;
    private final KeyVaultSettingType type;

    /**
     * Creates a new {@link KeyVaultSetting setting}  with the with the specified details.
     *
     * @param name The name of the {@link KeyVaultSetting setting}.
     * @param value The value of the {@link KeyVaultSetting setting}.
     */
    public KeyVaultSetting(String name, boolean value) {
        if (CoreUtils.isNullOrEmpty(name)) {
            throw LOGGER
                .logThrowableAsError(new IllegalArgumentException("The 'name' parameter cannot be null or empty"));
        }

        this.name = name;
        this.value = value;
        this.type = KeyVaultSettingType.BOOLEAN;
    }

    /**
     * Gets the name of the {@link KeyVaultSetting}.
     *
     * @return The name of the {@link KeyVaultSetting}.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the value of the {@link KeyVaultSetting} as a {@code boolean}.
     *
     * @return The value of the {@link KeyVaultSetting} as a {@code boolean}.
     */
    public boolean asBoolean() {
        if (type != KeyVaultSettingType.BOOLEAN) {
            throw LOGGER.logThrowableAsError(new UnsupportedOperationException(
                String.format("Cannot get setting value as %s from setting value of " + "type %s",
                    KeyVaultSettingType.BOOLEAN, this.getType())));
        }

        return (Boolean) this.value;
    }

    /**
     * Get the type of the {@link KeyVaultSetting}'s value.
     *
     * @return The type of the {@link KeyVaultSetting}'s value.
     */
    public KeyVaultSettingType getType() {
        return this.type;
    }
}
