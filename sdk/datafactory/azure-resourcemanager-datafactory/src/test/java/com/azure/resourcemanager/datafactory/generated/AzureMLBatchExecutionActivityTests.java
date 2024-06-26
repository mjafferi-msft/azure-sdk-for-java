// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.AzureMLBatchExecutionActivity;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLBatchExecutionActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLBatchExecutionActivity model = BinaryData.fromString(
            "{\"type\":\"AzureMLBatchExecution\",\"typeProperties\":{\"globalParameters\":{\"qqkh\":\"datajthluoyrq\",\"dwsentrcdzyvxwnm\":\"datapws\",\"wpqvdduvxmrbb\":\"dataumd\",\"dtywzrnxiktoki\":\"dataliwfbgkyon\"},\"webServiceOutputs\":{\"lxogimihxyxe\":{\"filePath\":\"datamdadfygj\",\"linkedServiceName\":{\"referenceName\":\"cfprioabqxwid\",\"parameters\":{\"xtsywrmmhaxmo\":\"dataonnolrs\",\"armnseigoalxwuqu\":\"datauotexlpqydgfzet\",\"ghs\":\"datazrskdovgkpqzzrx\"}}}},\"webServiceInputs\":{\"zco\":{\"filePath\":\"datawixdcytd\",\"linkedServiceName\":{\"referenceName\":\"am\",\"parameters\":{\"zlbcamdzoauvwjkg\":\"datab\"}}},\"pgkwtpzbsytwthv\":{\"filePath\":\"datawcnnzacqludq\",\"linkedServiceName\":{\"referenceName\":\"aqxztywzaq\",\"parameters\":{\"lzpowse\":\"datatstmyfebbt\"}}},\"oeky\":{\"filePath\":\"datadtsvgyzmafqsn\",\"linkedServiceName\":{\"referenceName\":\"u\",\"parameters\":{\"qyhr\":\"databyvwejyyngw\"}}},\"veyngzj\":{\"filePath\":\"datanvxco\",\"linkedServiceName\":{\"referenceName\":\"pdgnsmhrpzbyudko\",\"parameters\":{\"d\":\"datajaaocjlwcouwcrex\",\"iukvmzxr\":\"datamkzb\"}}}}},\"linkedServiceName\":{\"referenceName\":\"bk\",\"parameters\":{\"cqhlfqimjlde\":\"datahguvqghueh\"}},\"policy\":{\"timeout\":\"dataqnforujfluomaltv\",\"retry\":\"dataudhtdapkdahy\",\"retryIntervalInSeconds\":1087656358,\"secureInput\":true,\"secureOutput\":false,\"\":{\"xuibyfylh\":\"datagyqrmteicl\",\"uqylmlunquvl\":\"datawqp\"}},\"name\":\"al\",\"description\":\"uztlxfgy\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Failed\",\"dependsOn\":[{\"activity\":\"dacskulfqcxz\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Skipped\",\"Succeeded\"],\"\":{\"euwfmrckatnjik\":\"datavsgrcrknnru\",\"ieoth\":\"datazhtovs\",\"smavtn\":\"datawokprvpkdkds\"}},{\"activity\":\"gfmtximnpcghcfud\",\"dependencyConditions\":[\"Skipped\",\"Skipped\",\"Succeeded\",\"Completed\"],\"\":{\"erukuoeyyxcdwl\":\"datargerybdiajeeah\",\"xyitezfoekax\":\"datakglahd\"}}],\"userProperties\":[{\"name\":\"tfzaqnoq\",\"value\":\"datafyofohu\"},{\"name\":\"pfxkj\",\"value\":\"datahgwgsbaewkkq\"},{\"name\":\"kuzifsguolfkupmw\",\"value\":\"datazsirhp\"},{\"name\":\"gqdz\",\"value\":\"datadrcj\"}],\"\":{\"liphcpu\":\"databs\",\"e\":\"datadbzxidqqeslnaox\",\"fzyxamyjhp\":\"datautrlzzztg\",\"ily\":\"datazuvsjblqmddtp\"}}")
            .toObject(AzureMLBatchExecutionActivity.class);
        Assertions.assertEquals("al", model.name());
        Assertions.assertEquals("uztlxfgy", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("dacskulfqcxz", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("tfzaqnoq", model.userProperties().get(0).name());
        Assertions.assertEquals("bk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1087656358, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("cfprioabqxwid",
            model.webServiceOutputs().get("lxogimihxyxe").linkedServiceName().referenceName());
        Assertions.assertEquals("am", model.webServiceInputs().get("zco").linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLBatchExecutionActivity model = new AzureMLBatchExecutionActivity().withName("al")
            .withDescription("uztlxfgy").withState(ActivityState.INACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.FAILED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("dacskulfqcxz")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.COMPLETED,
                        DependencyCondition.SKIPPED, DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("gfmtximnpcghcfud")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SKIPPED, DependencyCondition.SKIPPED,
                        DependencyCondition.SUCCEEDED, DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("tfzaqnoq").withValue("datafyofohu"),
                new UserProperty().withName("pfxkj").withValue("datahgwgsbaewkkq"),
                new UserProperty().withName("kuzifsguolfkupmw").withValue("datazsirhp"),
                new UserProperty().withName("gqdz").withValue("datadrcj")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("bk")
                .withParameters(mapOf("cqhlfqimjlde", "datahguvqghueh")))
            .withPolicy(new ActivityPolicy().withTimeout("dataqnforujfluomaltv").withRetry("dataudhtdapkdahy")
                .withRetryIntervalInSeconds(1087656358).withSecureInput(true).withSecureOutput(false)
                .withAdditionalProperties(mapOf()))
            .withGlobalParameters(mapOf("qqkh", "datajthluoyrq", "dwsentrcdzyvxwnm", "datapws", "wpqvdduvxmrbb",
                "dataumd", "dtywzrnxiktoki", "dataliwfbgkyon"))
            .withWebServiceOutputs(mapOf("lxogimihxyxe",
                new AzureMLWebServiceFile().withFilePath("datamdadfygj")
                    .withLinkedServiceName(new LinkedServiceReference().withReferenceName("cfprioabqxwid")
                        .withParameters(mapOf("xtsywrmmhaxmo", "dataonnolrs", "armnseigoalxwuqu", "datauotexlpqydgfzet",
                            "ghs", "datazrskdovgkpqzzrx")))))
            .withWebServiceInputs(
                mapOf("zco",
                    new AzureMLWebServiceFile().withFilePath("datawixdcytd")
                        .withLinkedServiceName(new LinkedServiceReference()
                            .withReferenceName("am").withParameters(mapOf("zlbcamdzoauvwjkg", "datab"))),
                    "pgkwtpzbsytwthv",
                    new AzureMLWebServiceFile().withFilePath("datawcnnzacqludq")
                        .withLinkedServiceName(new LinkedServiceReference()
                            .withReferenceName("aqxztywzaq").withParameters(mapOf("lzpowse", "datatstmyfebbt"))),
                    "oeky",
                    new AzureMLWebServiceFile().withFilePath("datadtsvgyzmafqsn")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("u")
                            .withParameters(mapOf("qyhr", "databyvwejyyngw"))),
                    "veyngzj",
                    new AzureMLWebServiceFile().withFilePath("datanvxco")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("pdgnsmhrpzbyudko")
                            .withParameters(mapOf("d", "datajaaocjlwcouwcrex", "iukvmzxr", "datamkzb")))));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivity.class);
        Assertions.assertEquals("al", model.name());
        Assertions.assertEquals("uztlxfgy", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.FAILED, model.onInactiveMarkAs());
        Assertions.assertEquals("dacskulfqcxz", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("tfzaqnoq", model.userProperties().get(0).name());
        Assertions.assertEquals("bk", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1087656358, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(true, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
        Assertions.assertEquals("cfprioabqxwid",
            model.webServiceOutputs().get("lxogimihxyxe").linkedServiceName().referenceName());
        Assertions.assertEquals("am", model.webServiceInputs().get("zco").linkedServiceName().referenceName());
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
