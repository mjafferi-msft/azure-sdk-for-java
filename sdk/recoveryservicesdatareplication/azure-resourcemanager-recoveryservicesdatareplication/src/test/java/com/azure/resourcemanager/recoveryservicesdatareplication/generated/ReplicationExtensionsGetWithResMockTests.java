// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ReplicationExtensionModel;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReplicationExtensionsGetWithResMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Failed\",\"customProperties\":{\"instanceType\":\"ReplicationExtensionModelCustomProperties\"}},\"systemData\":{\"createdBy\":\"bqinjipnwjfu\",\"createdByType\":\"lafcbahh\",\"createdAt\":\"2021-05-18T22:00:53Z\",\"lastModifiedBy\":\"foiyjwpfilk\",\"lastModifiedByType\":\"kholvd\",\"lastModifiedAt\":\"2021-01-29T05:35:31Z\"},\"id\":\"iauogphuartv\",\"name\":\"iukyefchnmna\",\"type\":\"mnxhkxjqirwrweo\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesDataReplicationManager manager = RecoveryServicesDataReplicationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ReplicationExtensionModel response = manager.replicationExtensions()
            .getWithResponse("kmqp", "o", "hlfbcgwgc", com.azure.core.util.Context.NONE)
            .getValue();

    }
}
