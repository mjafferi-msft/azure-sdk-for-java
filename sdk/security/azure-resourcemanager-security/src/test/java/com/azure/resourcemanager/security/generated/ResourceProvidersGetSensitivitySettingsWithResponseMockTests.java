// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.GetSensitivitySettingsResponse;
import com.azure.resourcemanager.security.models.MipIntegrationStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ResourceProvidersGetSensitivitySettingsWithResponseMockTests {
    @Test
    public void testGetSensitivitySettingsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"sensitiveInfoTypesIds\":[\"9f6dd242-7819-4452-a6ae-c421bcff0332\",\"f1f0e26d-5449-4ce4-a93e-face334dc019\",\"9a7fcba6-6704-4f4c-8156-c5f60d8da63d\",\"138dd92f-b1cd-4cd1-adfc-597851925c39\"],\"sensitivityThresholdLabelOrder\":2.3277462,\"sensitivityThresholdLabelId\":\"47847299-9941-4f2a-afa8-52ce0e22dd26\",\"mipInformation\":{\"mipIntegrationStatus\":\"Ok\",\"labels\":[{\"name\":\"jfphfxaqjyih\",\"id\":\"3e7fe7b7-7728-464c-ab99-823b35ebbaba\",\"order\":73.2124},{\"name\":\"aos\",\"id\":\"564e5fef-7081-4f51-b972-8deae428450c\",\"order\":18.22784}],\"customInfoTypes\":[{\"name\":\"hp\",\"id\":\"46dd2f7a-c35d-4a0c-b1b3-5da748caaea0\",\"description\":\"weifdyfa\"}],\"builtInInfoTypes\":[{\"name\":\"guwnrdpuzlai\",\"id\":\"d5e26b13-792e-42c0-acf6-5342f433c050\",\"type\":\"jtggybs\"},{\"name\":\"mijxejpd\",\"id\":\"620a70b4-1042-4a07-bf84-a2fdc14be266\",\"type\":\"qwzutiye\"}]}},\"id\":\"rnhhjtvh\",\"name\":\"sznsyovqmqcud\",\"type\":\"toqwrnfc\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        GetSensitivitySettingsResponse response = manager.resourceProviders()
            .getSensitivitySettingsWithResponse(com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(UUID.fromString("9f6dd242-7819-4452-a6ae-c421bcff0332"),
            response.properties().sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(2.3277462F, response.properties().sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("47847299-9941-4f2a-afa8-52ce0e22dd26"),
            response.properties().sensitivityThresholdLabelId());
        Assertions.assertEquals(MipIntegrationStatus.OK, response.properties().mipInformation().mipIntegrationStatus());
        Assertions.assertEquals("jfphfxaqjyih", response.properties().mipInformation().labels().get(0).name());
        Assertions.assertEquals(UUID.fromString("3e7fe7b7-7728-464c-ab99-823b35ebbaba"),
            response.properties().mipInformation().labels().get(0).id());
        Assertions.assertEquals(73.2124F, response.properties().mipInformation().labels().get(0).order());
        Assertions.assertEquals("hp", response.properties().mipInformation().customInfoTypes().get(0).name());
        Assertions.assertEquals(UUID.fromString("46dd2f7a-c35d-4a0c-b1b3-5da748caaea0"),
            response.properties().mipInformation().customInfoTypes().get(0).id());
        Assertions.assertEquals("weifdyfa",
            response.properties().mipInformation().customInfoTypes().get(0).description());
        Assertions.assertEquals("guwnrdpuzlai",
            response.properties().mipInformation().builtInInfoTypes().get(0).name());
        Assertions.assertEquals(UUID.fromString("d5e26b13-792e-42c0-acf6-5342f433c050"),
            response.properties().mipInformation().builtInInfoTypes().get(0).id());
        Assertions.assertEquals("jtggybs", response.properties().mipInformation().builtInInfoTypes().get(0).type());
    }
}
