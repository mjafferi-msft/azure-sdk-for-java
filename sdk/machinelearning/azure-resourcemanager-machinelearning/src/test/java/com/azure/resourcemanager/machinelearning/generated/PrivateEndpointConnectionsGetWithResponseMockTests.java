// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointConnection;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"privateEndpoint\":{\"id\":\"wzlzklasl\",\"subnetArmId\":\"ciz\"},\"privateLinkServiceConnectionState\":{\"status\":\"Timeout\",\"description\":\"arwp\",\"actionsRequired\":\"saudoejtighsx\"},\"provisioningState\":\"Creating\"},\"identity\":{\"principalId\":\"f0d05010-dc6b-4342-ab89-3bac5448c571\",\"tenantId\":\"eb7548dd-c113-43c3-8b12-421c51033deb\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"ahovuuw\",\"tags\":{\"jnhj\":\"e\",\"fbbcngkegxcypxbb\":\"oti\",\"qlf\":\"etwilyrzoxpd\"},\"sku\":{\"name\":\"lqownkiua\",\"tier\":\"Free\",\"size\":\"ahwkxjjm\",\"family\":\"nlmsoo\",\"capacity\":1046371938},\"id\":\"ecdh\",\"name\":\"yswcrptveajczx\",\"type\":\"lgsrgkrfizrpywlp\"}";

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

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response =
            manager
                .privateEndpointConnections()
                .getWithResponse("bkbdhlltqstqkqs", "gxiynecovagzk", "eubanlxunpqcc", Context.NONE)
                .getValue();

        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("ahovuuw", response.location());
        Assertions.assertEquals("e", response.tags().get("jnhj"));
        Assertions.assertEquals("lqownkiua", response.sku().name());
        Assertions.assertEquals(SkuTier.FREE, response.sku().tier());
        Assertions.assertEquals("ahwkxjjm", response.sku().size());
        Assertions.assertEquals("nlmsoo", response.sku().family());
        Assertions.assertEquals(1046371938, response.sku().capacity());
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.TIMEOUT, response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("arwp", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("saudoejtighsx", response.privateLinkServiceConnectionState().actionsRequired());
    }
}