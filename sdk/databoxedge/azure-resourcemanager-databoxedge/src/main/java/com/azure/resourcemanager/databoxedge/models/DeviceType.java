// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of the Data Box Edge/Gateway device.
 */
public final class DeviceType extends ExpandableStringEnum<DeviceType> {
    /**
     * Static value DataBoxEdgeDevice for DeviceType.
     */
    public static final DeviceType DATA_BOX_EDGE_DEVICE = fromString("DataBoxEdgeDevice");

    /**
     * Creates a new instance of DeviceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeviceType() {
    }

    /**
     * Creates or finds a DeviceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeviceType.
     */
    public static DeviceType fromString(String name) {
        return fromString(name, DeviceType.class);
    }

    /**
     * Gets known DeviceType values.
     * 
     * @return known DeviceType values.
     */
    public static Collection<DeviceType> values() {
        return values(DeviceType.class);
    }
}
