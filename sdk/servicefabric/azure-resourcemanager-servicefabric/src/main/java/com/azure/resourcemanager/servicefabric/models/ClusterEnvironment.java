// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Cluster operating system, the default will be Windows.
 */
public final class ClusterEnvironment extends ExpandableStringEnum<ClusterEnvironment> {
    /**
     * Static value Windows for ClusterEnvironment.
     */
    public static final ClusterEnvironment WINDOWS = fromString("Windows");

    /**
     * Static value Linux for ClusterEnvironment.
     */
    public static final ClusterEnvironment LINUX = fromString("Linux");

    /**
     * Creates a new instance of ClusterEnvironment value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterEnvironment() {
    }

    /**
     * Creates or finds a ClusterEnvironment from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterEnvironment.
     */
    public static ClusterEnvironment fromString(String name) {
        return fromString(name, ClusterEnvironment.class);
    }

    /**
     * Gets known ClusterEnvironment values.
     * 
     * @return known ClusterEnvironment values.
     */
    public static Collection<ClusterEnvironment> values() {
        return values(ClusterEnvironment.class);
    }
}
