// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.webpubsub.WebPubSubManager;
import com.azure.resourcemanager.webpubsub.models.AclAction;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentityType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubResource;
import com.azure.resourcemanager.webpubsub.models.WebPubSubSkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WebPubSubsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"dtbnnha\",\"tier\":\"Standard\",\"size\":\"rkvcikhnvpa\",\"family\":\"gxqquezik\",\"capacity\":2021225461},\"properties\":{\"provisioningState\":\"Running\",\"externalIP\":\"lla\",\"hostName\":\"elwuipi\",\"publicPort\":1198418421,\"serverPort\":1148951623,\"version\":\"ivgvvcna\",\"privateEndpointConnections\":[],\"sharedPrivateLinkResources\":[],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"ueedndrdvs\",\"liveTraceConfiguration\":{\"enabled\":\"qqtch\",\"categories\":[]},\"resourceLogConfiguration\":{\"categories\":[]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"privateEndpoints\":[]},\"publicNetworkAccess\":\"ygdvwv\",\"disableLocalAuth\":true,\"disableAadAuth\":true},\"identity\":{\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{},\"principalId\":\"udxepxgyqagv\",\"tenantId\":\"mnpkukghimdblxg\"},\"location\":\"mfnjh\",\"tags\":{\"oqreyfkzikfjawn\":\"wmszkk\"},\"id\":\"a\",\"name\":\"vxwc\",\"type\":\"elpcirelsfeaenwa\"}]}";

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

        WebPubSubManager manager =
            WebPubSubManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WebPubSubResource> response = manager.webPubSubs().list(Context.NONE);

        Assertions.assertEquals("mfnjh", response.iterator().next().location());
        Assertions.assertEquals("wmszkk", response.iterator().next().tags().get("oqreyfkzikfjawn"));
        Assertions.assertEquals("dtbnnha", response.iterator().next().sku().name());
        Assertions.assertEquals(WebPubSubSkuTier.STANDARD, response.iterator().next().sku().tier());
        Assertions.assertEquals(2021225461, response.iterator().next().sku().capacity());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals(false, response.iterator().next().tls().clientCertEnabled());
        Assertions.assertEquals("qqtch", response.iterator().next().liveTraceConfiguration().enabled());
        Assertions.assertEquals(AclAction.DENY, response.iterator().next().networkACLs().defaultAction());
        Assertions.assertEquals("ygdvwv", response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals(true, response.iterator().next().disableLocalAuth());
        Assertions.assertEquals(true, response.iterator().next().disableAadAuth());
    }
}