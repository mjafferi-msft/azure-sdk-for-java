// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.FormatReadSettings;
import com.azure.resourcemanager.datafactory.models.GetMetadataActivity;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GetMetadataActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GetMetadataActivity model = BinaryData.fromString(
            "{\"type\":\"GetMetadata\",\"typeProperties\":{\"dataset\":{\"referenceName\":\"qwvwfombcgr\",\"parameters\":{\"qtydfyctkr\":\"datanrco\",\"wrhoma\":\"dataagxzmrxxmgzslnnc\"}},\"fieldList\":[\"dataiwupooneoqyetfxy\"],\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"dataqvkdpnqcup\",\"disableMetricsCollection\":\"datar\",\"\":{\"vsqmzee\":\"datafekcue\"}},\"formatSettings\":{\"type\":\"FormatReadSettings\",\"\":{\"y\":\"datav\"}}},\"linkedServiceName\":{\"referenceName\":\"ifnmccfgkb\",\"parameters\":{\"sdcmgmvatnf\":\"datamnam\",\"vaap\":\"datahyrh\",\"uj\":\"datagyyufhcfeggy\"}},\"policy\":{\"timeout\":\"datavazqsbrqspvl\",\"retry\":\"dataxvuju\",\"retryIntervalInSeconds\":1606585230,\"secureInput\":false,\"secureOutput\":false,\"\":{\"ayoaskullqweo\":\"datainjc\",\"ngymbzawdwtzx\":\"datab\",\"pwvhiaxkm\":\"databqzplzyjktc\",\"fhlwgka\":\"dataitczuscqobujfx\"}},\"name\":\"xp\",\"description\":\"mbdhccmjo\",\"state\":\"Active\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"swfbqycubm\",\"dependencyConditions\":[\"Completed\",\"Completed\"],\"\":{\"lkxwchslbiptsf\":\"dataewd\",\"unjegomegma\":\"datacwaobuimfda\"}}],\"userProperties\":[{\"name\":\"eablknqnqqcgi\",\"value\":\"dataffdeogm\"}],\"\":{\"po\":\"dataopjlgtcswqxeva\",\"gn\":\"datamxtcnmocskpgn\",\"dezm\":\"dataguqfnhmmvedj\"}}")
            .toObject(GetMetadataActivity.class);
        Assertions.assertEquals("xp", model.name());
        Assertions.assertEquals("mbdhccmjo", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("swfbqycubm", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("eablknqnqqcgi", model.userProperties().get(0).name());
        Assertions.assertEquals("ifnmccfgkb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1606585230, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("qwvwfombcgr", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GetMetadataActivity model = new GetMetadataActivity().withName("xp").withDescription("mbdhccmjo")
            .withState(ActivityState.ACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("swfbqycubm")
                .withDependencyConditions(Arrays.asList(DependencyCondition.COMPLETED, DependencyCondition.COMPLETED))
                .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("eablknqnqqcgi").withValue("dataffdeogm")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ifnmccfgkb")
                .withParameters(mapOf("sdcmgmvatnf", "datamnam", "vaap", "datahyrh", "uj", "datagyyufhcfeggy")))
            .withPolicy(new ActivityPolicy().withTimeout("datavazqsbrqspvl").withRetry("dataxvuju")
                .withRetryIntervalInSeconds(1606585230).withSecureInput(false).withSecureOutput(false)
                .withAdditionalProperties(mapOf()))
            .withDataset(new DatasetReference().withReferenceName("qwvwfombcgr")
                .withParameters(mapOf("qtydfyctkr", "datanrco", "wrhoma", "dataagxzmrxxmgzslnnc")))
            .withFieldList(Arrays.asList("dataiwupooneoqyetfxy"))
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("dataqvkdpnqcup")
                .withDisableMetricsCollection("datar").withAdditionalProperties(mapOf("type", "StoreReadSettings")))
            .withFormatSettings(new FormatReadSettings().withAdditionalProperties(mapOf("type", "FormatReadSettings")));
        model = BinaryData.fromObject(model).toObject(GetMetadataActivity.class);
        Assertions.assertEquals("xp", model.name());
        Assertions.assertEquals("mbdhccmjo", model.description());
        Assertions.assertEquals(ActivityState.ACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("swfbqycubm", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("eablknqnqqcgi", model.userProperties().get(0).name());
        Assertions.assertEquals("ifnmccfgkb", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1606585230, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("qwvwfombcgr", model.dataset().referenceName());
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
