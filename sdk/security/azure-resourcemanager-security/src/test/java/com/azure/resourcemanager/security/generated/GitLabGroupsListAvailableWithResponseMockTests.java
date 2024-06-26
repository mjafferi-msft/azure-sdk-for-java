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
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitLabGroupListResponse;
import com.azure.resourcemanager.security.models.OnboardingState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class GitLabGroupsListAvailableWithResponseMockTests {
    @Test
    public void testListAvailableWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"fofhoajjyls\",\"provisioningStatusUpdateTimeUtc\":\"2021-07-15T13:18:02Z\",\"provisioningState\":\"Succeeded\",\"fullyQualifiedName\":\"fzvlqquyhbce\",\"fullyQualifiedFriendlyName\":\"ogirrpw\",\"url\":\"tvuxeu\",\"onboardingState\":\"Onboarded\"},\"id\":\"ssijuaxxfd\",\"name\":\"ypkcpwsrqnn\",\"type\":\"ju\"},{\"properties\":{\"provisioningStatusMessage\":\"xcltj\",\"provisioningStatusUpdateTimeUtc\":\"2020-12-20T20:52:33Z\",\"provisioningState\":\"DeletionSuccess\",\"fullyQualifiedName\":\"qak\",\"fullyQualifiedFriendlyName\":\"ihxv\",\"url\":\"cwwfopxp\",\"onboardingState\":\"NotApplicable\"},\"id\":\"nsbubwhzqqgugwlu\",\"name\":\"ahtqmmk\",\"type\":\"hwq\"},{\"properties\":{\"provisioningStatusMessage\":\"ba\",\"provisioningStatusUpdateTimeUtc\":\"2021-08-27T16:53:34Z\",\"provisioningState\":\"Canceled\",\"fullyQualifiedName\":\"phujeucosvk\",\"fullyQualifiedFriendlyName\":\"ergv\",\"url\":\"a\",\"onboardingState\":\"Onboarded\"},\"id\":\"pyillg\",\"name\":\"ueez\",\"type\":\"pffbuq\"}],\"nextLink\":\"nvmcgmbgzyojf\"}";

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

        GitLabGroupListResponse response = manager.gitLabGroups()
            .listAvailableWithResponse("ek", "fffyshdawjlmlcuf", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(DevOpsProvisioningState.SUCCEEDED,
            response.value().get(0).properties().provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED, response.value().get(0).properties().onboardingState());
        Assertions.assertEquals("nvmcgmbgzyojf", response.nextLink());
    }
}
