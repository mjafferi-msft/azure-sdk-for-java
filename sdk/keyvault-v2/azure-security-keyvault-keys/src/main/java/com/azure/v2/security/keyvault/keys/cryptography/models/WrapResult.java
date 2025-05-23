// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.keys.cryptography.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

import static io.clientcore.core.utils.CoreUtils.arrayCopy;

/**
 * Represents the details of wrap operation result.
 */
@Metadata(properties = MetadataProperties.IMMUTABLE)
public final class WrapResult {
    /**
     * The encrypted key content
     */
    private final byte[] encryptedKey;

    /**
     * The identifier of the key used for the encryption operation.
     */
    private final String keyId;

    /**
     * The key wrap algorithm used to wrap the key content.
     */
    private final KeyWrapAlgorithm algorithm;

    /**
     * Creates the instance of KeyWrapResult holding the key wrap operation response details.
     * @param encryptedKey The unwrapped key content.
     * @param algorithm The algorithm used to wrap the key content.
     * @param keyId The identifier of the key usd for the key wrap operation.
     */
    public WrapResult(byte[] encryptedKey, KeyWrapAlgorithm algorithm, String keyId) {
        this.encryptedKey = arrayCopy(encryptedKey);
        this.keyId = keyId;
        this.algorithm = algorithm;
    }

    /**
     * Get the encrypted key content.
     * @return The encrypted key.
     */
    public byte[] getEncryptedKey() {
        return arrayCopy(encryptedKey);
    }

    /**
     * Get the key wrap algorithm used to wrap the key content.
     * @return The key wrap algorithm.
     */
    public KeyWrapAlgorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Get the identifier of the key used to do encryption
     * @return the key identifier
     */
    public String getKeyId() {
        return keyId;
    }
}
