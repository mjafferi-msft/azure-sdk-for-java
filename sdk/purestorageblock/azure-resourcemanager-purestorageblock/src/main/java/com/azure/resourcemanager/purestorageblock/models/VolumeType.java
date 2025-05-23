// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.purestorageblock.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specify which control plane handles the lifecycle of the volume.
 */
public final class VolumeType extends ExpandableStringEnum<VolumeType> {
    /**
     * AVS/VMware.
     */
    public static final VolumeType AVS = fromString("avs");

    /**
     * Creates a new instance of VolumeType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VolumeType() {
    }

    /**
     * Creates or finds a VolumeType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VolumeType.
     */
    public static VolumeType fromString(String name) {
        return fromString(name, VolumeType.class);
    }

    /**
     * Gets known VolumeType values.
     * 
     * @return known VolumeType values.
     */
    public static Collection<VolumeType> values() {
        return values(VolumeType.class);
    }
}
