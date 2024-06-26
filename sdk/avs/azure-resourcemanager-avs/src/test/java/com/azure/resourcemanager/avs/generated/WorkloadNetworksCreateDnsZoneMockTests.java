// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsZone;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksCreateDnsZoneMockTests {
    @Test
    public void testCreateDnsZone() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"displayName\":\"yo\",\"domain\":[\"rouuxvnsasbcry\",\"o\",\"izrxklob\",\"xnazpmkml\"],\"dnsServerIps\":[\"vfxzopjh\",\"zxlioh\",\"d\",\"dtfgxqbawpcbb\"],\"sourceIp\":\"qcy\",\"dnsServices\":3888945371660163872,\"provisioningState\":\"Succeeded\",\"revision\":1167026751673523681},\"id\":\"icdhz\",\"name\":\"dyb\",\"type\":\"wgbdvibidmhmwffp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        AvsManager manager =
            AvsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        WorkloadNetworkDnsZone response =
            manager
                .workloadNetworks()
                .defineDnsZone("minqcym")
                .withExistingPrivateCloud("yfedevjbo", "lcqxypokk")
                .withDisplayName("gn")
                .withDomain(Arrays.asList("x", "wuninv"))
                .withDnsServerIps(Arrays.asList("chaqdtvqec", "qct"))
                .withSourceIp("xdtddmflhuytxzv")
                .withDnsServices(3117767040904980283L)
                .withRevision(6355503721954410956L)
                .create();

        Assertions.assertEquals("yo", response.displayName());
        Assertions.assertEquals("rouuxvnsasbcry", response.domain().get(0));
        Assertions.assertEquals("vfxzopjh", response.dnsServerIps().get(0));
        Assertions.assertEquals("qcy", response.sourceIp());
        Assertions.assertEquals(3888945371660163872L, response.dnsServices());
        Assertions.assertEquals(1167026751673523681L, response.revision());
    }
}
