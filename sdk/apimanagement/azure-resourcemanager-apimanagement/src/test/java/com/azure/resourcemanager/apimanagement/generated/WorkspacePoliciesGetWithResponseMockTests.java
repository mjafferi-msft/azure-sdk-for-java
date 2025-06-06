// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.PolicyContentFormat;
import com.azure.resourcemanager.apimanagement.models.PolicyContract;
import com.azure.resourcemanager.apimanagement.models.PolicyExportFormat;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkspacePoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"value\":\"hlheayodrvwnq\",\"format\":\"rawxml-link\"},\"id\":\"yofftxzovbhqe\",\"name\":\"sslfxej\",\"type\":\"ocsgigsabtxnd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PolicyContract response = manager.workspacePolicies()
            .getWithResponse("ekc", "mjqqauftghmtbu", "kcnkghkr", PolicyIdName.POLICY, PolicyExportFormat.RAWXML,
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("hlheayodrvwnq", response.value());
        Assertions.assertEquals(PolicyContentFormat.RAWXML_LINK, response.format());
    }
}
