// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vault retention policy for AzureFileShare.
 */
@Fluent
public final class VaultRetentionPolicy {
    /*
     * Base class for retention policy.
     */
    @JsonProperty(value = "vaultRetention", required = true)
    private RetentionPolicy vaultRetention;

    /*
     * The snapshotRetentionInDays property.
     */
    @JsonProperty(value = "snapshotRetentionInDays", required = true)
    private int snapshotRetentionInDays;

    /**
     * Creates an instance of VaultRetentionPolicy class.
     */
    public VaultRetentionPolicy() {
    }

    /**
     * Get the vaultRetention property: Base class for retention policy.
     * 
     * @return the vaultRetention value.
     */
    public RetentionPolicy vaultRetention() {
        return this.vaultRetention;
    }

    /**
     * Set the vaultRetention property: Base class for retention policy.
     * 
     * @param vaultRetention the vaultRetention value to set.
     * @return the VaultRetentionPolicy object itself.
     */
    public VaultRetentionPolicy withVaultRetention(RetentionPolicy vaultRetention) {
        this.vaultRetention = vaultRetention;
        return this;
    }

    /**
     * Get the snapshotRetentionInDays property: The snapshotRetentionInDays property.
     * 
     * @return the snapshotRetentionInDays value.
     */
    public int snapshotRetentionInDays() {
        return this.snapshotRetentionInDays;
    }

    /**
     * Set the snapshotRetentionInDays property: The snapshotRetentionInDays property.
     * 
     * @param snapshotRetentionInDays the snapshotRetentionInDays value to set.
     * @return the VaultRetentionPolicy object itself.
     */
    public VaultRetentionPolicy withSnapshotRetentionInDays(int snapshotRetentionInDays) {
        this.snapshotRetentionInDays = snapshotRetentionInDays;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vaultRetention() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property vaultRetention in model VaultRetentionPolicy"));
        } else {
            vaultRetention().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VaultRetentionPolicy.class);
}
