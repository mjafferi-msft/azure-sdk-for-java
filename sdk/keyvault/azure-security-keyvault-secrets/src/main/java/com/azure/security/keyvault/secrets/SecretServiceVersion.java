// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.security.keyvault.secrets;

import com.azure.core.util.ServiceVersion;

/**
 * The versions of Azure Key Vault Secrets supported by this client library.
 */
public enum SecretServiceVersion implements ServiceVersion {

    /**
     * Service version {@code 7.0}.
     */
    V7_0("7.0"),
    /**
     * Service version {@code 7.1}.
     */
    V7_1("7.1"),
    /**
     * Service version {@code 7.2}.
     */
    V7_2("7.2"),
    /**
     * Service version {@code 7.3}.
     */
    V7_3("7.3"),
    /**
     * Service version {@code 7.4}.
     */
    V7_4("7.4"),
    /**
     * Service version {@code 7.5}.
     */
    V7_5("7.5"),
    /**
     * Service version {@code 7.6-preview.2}.
     */
    V7_6_PREVIEW_2("7.6-preview.2");

    private final String version;

    SecretServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link SecretServiceVersion}.
     */
    public static SecretServiceVersion getLatest() {
        return V7_6_PREVIEW_2;
    }
}
