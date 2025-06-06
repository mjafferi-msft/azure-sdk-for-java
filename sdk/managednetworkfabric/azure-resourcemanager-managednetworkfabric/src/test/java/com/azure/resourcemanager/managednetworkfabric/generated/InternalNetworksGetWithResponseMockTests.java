// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.Extension;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetwork;
import com.azure.resourcemanager.managednetworkfabric.models.IsMonitoringEnabled;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class InternalNetworksGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"vlanId\":23127857,\"bgpConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"Disabled\",\"intervalInMilliSeconds\":1179284056,\"multiplier\":1230517100},\"defaultRouteOriginate\":\"False\",\"allowAS\":176785876,\"allowASOverride\":\"Disable\",\"fabricASN\":3202778725632733690,\"peerASN\":8191108194055206264,\"ipv4ListenRangePrefixes\":[\"shoxfzzjd\",\"upbusxyugoz\",\"plxzg\"],\"ipv6ListenRangePrefixes\":[\"notiixkkbyg\",\"giq\"],\"ipv4NeighborAddress\":[{\"address\":\"hybbnhttyizonzs\",\"configurationState\":\"DeferredControl\"},{\"address\":\"o\",\"configurationState\":\"Provisioned\"}],\"ipv6NeighborAddress\":[{\"address\":\"z\",\"configurationState\":\"Succeeded\"},{\"address\":\"ciuoxyipdthjfvn\",\"configurationState\":\"Succeeded\"},{\"address\":\"nsputfe\",\"configurationState\":\"Deprovisioned\"},{\"address\":\"nufssjgbfbbachxx\",\"configurationState\":\"Deprovisioned\"}],\"annotation\":\"nfnbphceeivkb\"},\"staticRouteConfiguration\":{\"extension\":\"NoExtension\",\"bfdConfiguration\":{\"administrativeState\":\"RMA\",\"intervalInMilliSeconds\":1354197629,\"multiplier\":2080962665},\"ipv4Routes\":[{\"prefix\":\"pvtwttfsclg\",\"nextHop\":[\"gygn\",\"bfytnhdnihuzzjuz\",\"wgbzdtorbi\",\"nyfzdpxct\"]},{\"prefix\":\"ucrxdtejob\",\"nextHop\":[\"rlwtidcnzal\",\"m\",\"upjhltyl\",\"uudvbgvzlzjsb\"]}],\"ipv6Routes\":[{\"prefix\":\"utzaziydpoknsea\",\"nextHop\":[\"bdqraokd\",\"rluob\"]},{\"prefix\":\"valqwzkny\",\"nextHop\":[\"xysvclfjyclvild\"]}]},\"configurationState\":\"PendingCommit\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"RMA\",\"mtu\":1930619530,\"connectedIPv4Subnets\":[{\"prefix\":\"fqpfildcgb\",\"annotation\":\"uzfbp\"},{\"prefix\":\"cryvidbzdylbvj\",\"annotation\":\"gngwn\"},{\"prefix\":\"jftecgprzsqmp\",\"annotation\":\"cakz\"}],\"connectedIPv6Subnets\":[{\"prefix\":\"haa\",\"annotation\":\"xoyxuuco\"},{\"prefix\":\"usyrux\",\"annotation\":\"hhlhrvmgs\"}],\"importRoutePolicyId\":\"gmnc\",\"exportRoutePolicyId\":\"tpiforomppz\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"qmeu\",\"importIpv6RoutePolicyId\":\"lfcmpuaiugoceqtl\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"jymwiccu\",\"exportIpv6RoutePolicyId\":\"cfunlakgixhqjqh\"},\"ingressAclId\":\"wb\",\"egressAclId\":\"iwtwfgoc\",\"isMonitoringEnabled\":\"False\",\"extension\":\"NoExtension\",\"annotation\":\"nnzu\"},\"id\":\"bkyy\",\"name\":\"syweohlmtsnvon\",\"type\":\"bftswcd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ManagedNetworkFabricManager manager = ManagedNetworkFabricManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        InternalNetwork response = manager.internalNetworks()
            .getWithResponse("syzfeoctrzjw", "zwckzebmbvwdxgyy", "mxqzl", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(23127857, response.vlanId());
        Assertions.assertEquals("nfnbphceeivkb", response.bgpConfiguration().annotation());
        Assertions.assertEquals(1179284056, response.bgpConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1230517100, response.bgpConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, response.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(176785876, response.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.DISABLE, response.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(8191108194055206264L, response.bgpConfiguration().peerAsn());
        Assertions.assertEquals("shoxfzzjd", response.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("notiixkkbyg", response.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("hybbnhttyizonzs", response.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("z", response.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals(1354197629,
            response.staticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(2080962665, response.staticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("pvtwttfsclg", response.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("gygn", response.staticRouteConfiguration().ipv4Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("utzaziydpoknsea", response.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("bdqraokd", response.staticRouteConfiguration().ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals(Extension.NO_EXTENSION, response.staticRouteConfiguration().extension());
        Assertions.assertEquals(1930619530, response.mtu());
        Assertions.assertEquals("uzfbp", response.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("fqpfildcgb", response.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("xoyxuuco", response.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("haa", response.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("gmnc", response.importRoutePolicyId());
        Assertions.assertEquals("tpiforomppz", response.exportRoutePolicyId());
        Assertions.assertEquals("qmeu", response.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("lfcmpuaiugoceqtl", response.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("jymwiccu", response.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("cfunlakgixhqjqh", response.exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("wb", response.ingressAclId());
        Assertions.assertEquals("iwtwfgoc", response.egressAclId());
        Assertions.assertEquals(IsMonitoringEnabled.FALSE, response.isMonitoringEnabled());
        Assertions.assertEquals(Extension.NO_EXTENSION, response.extension());
        Assertions.assertEquals("nnzu", response.annotation());
    }
}
