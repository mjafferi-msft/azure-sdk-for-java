// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securitydevops.fluent.models.GitHubRepoInner;
import com.azure.resourcemanager.securitydevops.models.GitHubRepoListResponse;
import com.azure.resourcemanager.securitydevops.models.GitHubRepoProperties;
import com.azure.resourcemanager.securitydevops.models.ProvisioningState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GitHubRepoListResponseTests {
    @Test
    public void testDeserialize() {
        GitHubRepoListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"accountId\":2704236244531071102,\"repoUrl\":\"znorcj\",\"ownerName\":\"snb\"},\"id\":\"qabnmoc\",\"name\":\"cyshurzafbljjgp\",\"type\":\"toqcjmklja\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"accountId\":8304735873585257815,\"repoUrl\":\"jzyulpk\",\"ownerName\":\"jkrlkhbzhfepg\"},\"id\":\"qex\",\"name\":\"locx\",\"type\":\"c\"}],\"nextLink\":\"ierhhbcsglummaj\"}")
            .toObject(GitHubRepoListResponse.class);
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(2704236244531071102L, model.value().get(0).properties().accountId());
        Assertions.assertEquals("znorcj", model.value().get(0).properties().repoUrl());
        Assertions.assertEquals("snb", model.value().get(0).properties().ownerName());
        Assertions.assertEquals("ierhhbcsglummaj", model.nextLink());
    }

    @Test
    public void testSerialize() {
        GitHubRepoListResponse model = new GitHubRepoListResponse().withValue(Arrays.asList(
            new GitHubRepoInner()
                .withProperties(new GitHubRepoProperties().withProvisioningState(ProvisioningState.SUCCEEDED)
                    .withAccountId(2704236244531071102L)
                    .withRepoUrl("znorcj")
                    .withOwnerName("snb")),
            new GitHubRepoInner()
                .withProperties(new GitHubRepoProperties().withProvisioningState(ProvisioningState.SUCCEEDED)
                    .withAccountId(8304735873585257815L)
                    .withRepoUrl("jzyulpk")
                    .withOwnerName("jkrlkhbzhfepg"))))
            .withNextLink("ierhhbcsglummaj");
        model = BinaryData.fromObject(model).toObject(GitHubRepoListResponse.class);
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(2704236244531071102L, model.value().get(0).properties().accountId());
        Assertions.assertEquals("znorcj", model.value().get(0).properties().repoUrl());
        Assertions.assertEquals("snb", model.value().get(0).properties().ownerName());
        Assertions.assertEquals("ierhhbcsglummaj", model.nextLink());
    }
}
