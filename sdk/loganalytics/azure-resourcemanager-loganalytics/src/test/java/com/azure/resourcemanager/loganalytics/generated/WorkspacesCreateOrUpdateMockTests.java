// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.models.CapacityReservationLevel;
import com.azure.resourcemanager.loganalytics.models.Identity;
import com.azure.resourcemanager.loganalytics.models.IdentityType;
import com.azure.resourcemanager.loganalytics.models.PublicNetworkAccessType;
import com.azure.resourcemanager.loganalytics.models.UserIdentityProperties;
import com.azure.resourcemanager.loganalytics.models.Workspace;
import com.azure.resourcemanager.loganalytics.models.WorkspaceCapping;
import com.azure.resourcemanager.loganalytics.models.WorkspaceFeatures;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSku;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSkuNameEnum;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkspacesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"customerId\":\"ldtve\",\"sku\":{\"name\":\"Premium\",\"capacityReservationLevel\":100,\"lastSkuUpdate\":\"hzjkn\"},\"retentionInDays\":1633027384,\"workspaceCapping\":{\"dailyQuotaGb\":61.251523393969165,\"quotaNextResetTime\":\"pnrupzaamrdi\",\"dataIngestionStatus\":\"OverQuota\"},\"createdDate\":\"kidswys\",\"modifiedDate\":\"ruffgllukk\",\"publicNetworkAccessForIngestion\":\"Disabled\",\"publicNetworkAccessForQuery\":\"Enabled\",\"forceCmkForQuery\":false,\"privateLinkScopedResources\":[{\"resourceId\":\"vmblcouqe\",\"scopeId\":\"hbcdsziry\"},{\"resourceId\":\"ndo\",\"scopeId\":\"mbltoo\"},{\"resourceId\":\"kfqlwx\",\"scopeId\":\"ykalsyga\"}],\"features\":{\"enableDataExport\":true,\"immediatePurgeDataOn30Days\":true,\"enableLogAccessUsingOnlyResourcePermissions\":false,\"clusterResourceId\":\"jksibjg\",\"disableLocalAuth\":true,\"\":{\"pinbmhwbjijkgqxn\":\"dataahmrnadzyqegxyi\",\"znj\":\"datambk\",\"cwkdtaaw\":\"dataujvaannggi\",\"mqkra\":\"datawfekaumrrqmb\"}},\"defaultDataCollectionRuleResourceId\":\"nxwbjsidbirkfp\"},\"identity\":{\"principalId\":\"kd\",\"tenantId\":\"gewi\",\"type\":\"None\",\"userAssignedIdentities\":{\"o\":{\"principalId\":\"bguzozky\",\"clientId\":\"nfnzhhh\"},\"pyc\":{\"principalId\":\"ffjkutycyarnroo\",\"clientId\":\"uabzoghkt\"},\"zptwrlohap\":{\"principalId\":\"coe\",\"clientId\":\"nhzqrottjzcfy\"},\"xpjb\":{\"principalId\":\"nfszpyglqdhmrjz\",\"clientId\":\"l\"}}},\"systemData\":{\"createdBy\":\"sjoqcjenkyhfqzvs\",\"createdByType\":\"Application\",\"createdAt\":\"2021-08-22T03:48:47Z\",\"lastModifiedBy\":\"l\",\"lastModifiedByType\":\"ManagedIdentity\",\"lastModifiedAt\":\"2021-04-25T15:23:25Z\"},\"etag\":\"jhhhqxu\",\"location\":\"yvca\",\"tags\":{\"vbsizusjszlbscm\":\"v\"},\"id\":\"lzijiufehgmvflnw\",\"name\":\"v\",\"type\":\"kxrerlniylylyfwx\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LogAnalyticsManager manager = LogAnalyticsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Workspace response = manager.workspaces()
            .define("jxl")
            .withRegion("wsdrnpxqwodif")
            .withExistingResourceGroup("ecmslclbl")
            .withTags(mapOf("wibvjogj", "cjrmmua"))
            .withIdentity(new Identity().withType(IdentityType.NONE)
                .withUserAssignedIdentities(mapOf("efgwbmqjc", new UserIdentityProperties())))
            .withEtag("jcmmzrrscub")
            .withSku(new WorkspaceSku().withName(WorkspaceSkuNameEnum.STANDARD)
                .withCapacityReservationLevel(CapacityReservationLevel.TWO_ZERO_ZERO_ZERO))
            .withRetentionInDays(1106041304)
            .withWorkspaceCapping(new WorkspaceCapping().withDailyQuotaGb(17.1701428900364D))
            .withPublicNetworkAccessForIngestion(PublicNetworkAccessType.ENABLED)
            .withPublicNetworkAccessForQuery(PublicNetworkAccessType.ENABLED)
            .withForceCmkForQuery(false)
            .withFeatures(new WorkspaceFeatures().withEnableDataExport(true)
                .withImmediatePurgeDataOn30Days(true)
                .withEnableLogAccessUsingOnlyResourcePermissions(false)
                .withClusterResourceId("d")
                .withDisableLocalAuth(true)
                .withAdditionalProperties(mapOf()))
            .withDefaultDataCollectionRuleResourceId("ulrtywikdmh")
            .create();

        Assertions.assertEquals("yvca", response.location());
        Assertions.assertEquals("v", response.tags().get("vbsizusjszlbscm"));
        Assertions.assertEquals(IdentityType.NONE, response.identity().type());
        Assertions.assertEquals("jhhhqxu", response.etag());
        Assertions.assertEquals(WorkspaceSkuNameEnum.PREMIUM, response.sku().name());
        Assertions.assertEquals(CapacityReservationLevel.ONE_ZERO_ZERO, response.sku().capacityReservationLevel());
        Assertions.assertEquals(1633027384, response.retentionInDays());
        Assertions.assertEquals(61.251523393969165D, response.workspaceCapping().dailyQuotaGb());
        Assertions.assertEquals(PublicNetworkAccessType.DISABLED, response.publicNetworkAccessForIngestion());
        Assertions.assertEquals(PublicNetworkAccessType.ENABLED, response.publicNetworkAccessForQuery());
        Assertions.assertEquals(false, response.forceCmkForQuery());
        Assertions.assertEquals(true, response.features().enableDataExport());
        Assertions.assertEquals(true, response.features().immediatePurgeDataOn30Days());
        Assertions.assertEquals(false, response.features().enableLogAccessUsingOnlyResourcePermissions());
        Assertions.assertEquals("jksibjg", response.features().clusterResourceId());
        Assertions.assertEquals(true, response.features().disableLocalAuth());
        Assertions.assertEquals("nxwbjsidbirkfp", response.defaultDataCollectionRuleResourceId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
