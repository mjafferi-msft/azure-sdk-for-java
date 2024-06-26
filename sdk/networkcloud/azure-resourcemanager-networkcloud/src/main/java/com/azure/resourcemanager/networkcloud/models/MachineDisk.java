// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Disk represents the properties of the disk. */
@Immutable
public final class MachineDisk {
    /*
     * The maximum amount of storage in GB.
     */
    @JsonProperty(value = "capacityGB", access = JsonProperty.Access.WRITE_ONLY)
    private Long capacityGB;

    /*
     * The connection type of the rack SKU resource.
     */
    @JsonProperty(value = "connection", access = JsonProperty.Access.WRITE_ONLY)
    private MachineSkuDiskConnectionType connection;

    /*
     * The disk type of rack SKU resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private DiskType type;

    /** Creates an instance of MachineDisk class. */
    public MachineDisk() {
    }

    /**
     * Get the capacityGB property: The maximum amount of storage in GB.
     *
     * @return the capacityGB value.
     */
    public Long capacityGB() {
        return this.capacityGB;
    }

    /**
     * Get the connection property: The connection type of the rack SKU resource.
     *
     * @return the connection value.
     */
    public MachineSkuDiskConnectionType connection() {
        return this.connection;
    }

    /**
     * Get the type property: The disk type of rack SKU resource.
     *
     * @return the type value.
     */
    public DiskType type() {
        return this.type;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
