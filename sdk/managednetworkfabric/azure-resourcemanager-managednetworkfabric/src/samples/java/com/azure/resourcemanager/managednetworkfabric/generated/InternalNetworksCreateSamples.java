// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.Extension;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesBgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.IsMonitoringEnabled;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborAddress;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
import java.util.Arrays;

/**
 * Samples for InternalNetworks Create.
 */
public final class InternalNetworksCreateSamples {
    /*
     * x-ms-original-file:
     * specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/
     * InternalNetworks_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: InternalNetworks_Create_MaximumSet_Gen.
     * 
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void internalNetworksCreateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager.internalNetworks()
            .define("example-internalnetwork")
            .withExistingL3IsolationDomain("example-rg", "example-l3domain")
            .withVlanId(755)
            .withBgpConfiguration(new InternalNetworkPropertiesBgpConfiguration().withAnnotation("annotation")
                .withBfdConfiguration(new BfdConfiguration().withIntervalInMilliSeconds(300).withMultiplier(5))
                .withDefaultRouteOriginate(BooleanEnumProperty.TRUE)
                .withAllowAS(10)
                .withAllowASOverride(AllowASOverride.ENABLE)
                .withPeerAsn(61234L)
                .withIpv4ListenRangePrefixes(Arrays.asList("10.1.0.0/25"))
                .withIpv6ListenRangePrefixes(Arrays.asList("2fff::/66"))
                .withIpv4NeighborAddress(Arrays.asList(new NeighborAddress().withAddress("10.1.0.0")))
                .withIpv6NeighborAddress(Arrays.asList(new NeighborAddress().withAddress("2fff::"))))
            .withStaticRouteConfiguration(new InternalNetworkPropertiesStaticRouteConfiguration()
                .withBfdConfiguration(new BfdConfiguration().withIntervalInMilliSeconds(300).withMultiplier(15))
                .withIpv4Routes(Arrays
                    .asList(new StaticRouteProperties().withPrefix("jffgck").withNextHop(Arrays.asList("10.0.0.1"))))
                .withIpv6Routes(Arrays
                    .asList(new StaticRouteProperties().withPrefix("2fff::/64").withNextHop(Arrays.asList("3ffe::1"))))
                .withExtension(Extension.NO_EXTENSION))
            .withMtu(1500)
            .withConnectedIPv4Subnets(
                Arrays.asList(new ConnectedSubnet().withAnnotation("annotation").withPrefix("10.0.0.0/24")))
            .withConnectedIPv6Subnets(
                Arrays.asList(new ConnectedSubnet().withAnnotation("annotation").withPrefix("3FFE:FFFF:0:CD30::a0/29")))
            .withImportRoutePolicyId(
                "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName")
            .withExportRoutePolicyId(
                "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName")
            .withImportRoutePolicy(new ImportRoutePolicy().withImportIpv4RoutePolicyId(
                "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName")
                .withImportIpv6RoutePolicyId(
                    "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName"))
            .withExportRoutePolicy(new ExportRoutePolicy().withExportIpv4RoutePolicyId(
                "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName")
                .withExportIpv6RoutePolicyId(
                    "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/routePolicies/routePolicyName"))
            .withIngressAclId(
                "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/accessControlLists/example-acl")
            .withEgressAclId(
                "/subscriptions/1234ABCD-0A1B-1234-5678-123456ABCDEF/resourceGroups/example-rg/providers/Microsoft.ManagedNetworkFabric/accessControlLists/example-acl")
            .withIsMonitoringEnabled(IsMonitoringEnabled.TRUE)
            .withExtension(Extension.NO_EXTENSION)
            .withAnnotation("annotation")
            .create();
    }
}
