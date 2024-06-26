// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.fluent.models.MaintenanceConfigurationProperties;
import com.azure.resourcemanager.maintenance.models.InputLinuxParameters;
import com.azure.resourcemanager.maintenance.models.InputPatchConfiguration;
import com.azure.resourcemanager.maintenance.models.InputWindowsParameters;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.RebootOptions;
import com.azure.resourcemanager.maintenance.models.Visibility;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MaintenanceConfigurationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MaintenanceConfigurationProperties model =
            BinaryData
                .fromString(
                    "{\"namespace\":\"qsqsy\",\"extensionProperties\":{\"ppofmxaxcfjpgdd\":\"bfkgukdkex\",\"zxibqeoj\":\"ocjjxhvpmouexh\"},\"maintenanceScope\":\"Resource\",\"maintenanceWindow\":{\"startDateTime\":\"vddntwn\",\"expirationDateTime\":\"icbtwnpzao\",\"duration\":\"uhrhcffcyddgl\",\"timeZone\":\"t\",\"recurEvery\":\"qkwpyeicxmqc\"},\"visibility\":\"Custom\",\"installPatches\":{\"rebootSetting\":\"Never\",\"windowsParameters\":{\"kbNumbersToExclude\":[\"uigdtopbobjog\",\"m\",\"w\"],\"kbNumbersToInclude\":[\"a\"],\"classificationsToInclude\":[\"z\",\"yvvtpgvdfgio\"],\"excludeKbsRequiringReboot\":true},\"linuxParameters\":{\"packageNameMasksToExclude\":[\"qxlngx\",\"efgugnxk\"],\"packageNameMasksToInclude\":[\"qmi\",\"tthzrvqd\"],\"classificationsToInclude\":[\"hjybigehoqfbo\"]}}}")
                .toObject(MaintenanceConfigurationProperties.class);
        Assertions.assertEquals("qsqsy", model.namespace());
        Assertions.assertEquals("bfkgukdkex", model.extensionProperties().get("ppofmxaxcfjpgdd"));
        Assertions.assertEquals(MaintenanceScope.RESOURCE, model.maintenanceScope());
        Assertions.assertEquals(Visibility.CUSTOM, model.visibility());
        Assertions.assertEquals(RebootOptions.NEVER, model.installPatches().rebootSetting());
        Assertions
            .assertEquals("uigdtopbobjog", model.installPatches().windowsParameters().kbNumbersToExclude().get(0));
        Assertions.assertEquals("a", model.installPatches().windowsParameters().kbNumbersToInclude().get(0));
        Assertions.assertEquals("z", model.installPatches().windowsParameters().classificationsToInclude().get(0));
        Assertions.assertEquals(true, model.installPatches().windowsParameters().excludeKbsRequiringReboot());
        Assertions.assertEquals("qxlngx", model.installPatches().linuxParameters().packageNameMasksToExclude().get(0));
        Assertions.assertEquals("qmi", model.installPatches().linuxParameters().packageNameMasksToInclude().get(0));
        Assertions
            .assertEquals("hjybigehoqfbo", model.installPatches().linuxParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("vddntwn", model.startDateTime());
        Assertions.assertEquals("icbtwnpzao", model.expirationDateTime());
        Assertions.assertEquals("uhrhcffcyddgl", model.duration());
        Assertions.assertEquals("t", model.timeZone());
        Assertions.assertEquals("qkwpyeicxmqc", model.recurEvery());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MaintenanceConfigurationProperties model =
            new MaintenanceConfigurationProperties()
                .withNamespace("qsqsy")
                .withExtensionProperties(mapOf("ppofmxaxcfjpgdd", "bfkgukdkex", "zxibqeoj", "ocjjxhvpmouexh"))
                .withMaintenanceScope(MaintenanceScope.RESOURCE)
                .withVisibility(Visibility.CUSTOM)
                .withInstallPatches(
                    new InputPatchConfiguration()
                        .withRebootSetting(RebootOptions.NEVER)
                        .withWindowsParameters(
                            new InputWindowsParameters()
                                .withKbNumbersToExclude(Arrays.asList("uigdtopbobjog", "m", "w"))
                                .withKbNumbersToInclude(Arrays.asList("a"))
                                .withClassificationsToInclude(Arrays.asList("z", "yvvtpgvdfgio"))
                                .withExcludeKbsRequiringReboot(true))
                        .withLinuxParameters(
                            new InputLinuxParameters()
                                .withPackageNameMasksToExclude(Arrays.asList("qxlngx", "efgugnxk"))
                                .withPackageNameMasksToInclude(Arrays.asList("qmi", "tthzrvqd"))
                                .withClassificationsToInclude(Arrays.asList("hjybigehoqfbo"))))
                .withStartDateTime("vddntwn")
                .withExpirationDateTime("icbtwnpzao")
                .withDuration("uhrhcffcyddgl")
                .withTimeZone("t")
                .withRecurEvery("qkwpyeicxmqc");
        model = BinaryData.fromObject(model).toObject(MaintenanceConfigurationProperties.class);
        Assertions.assertEquals("qsqsy", model.namespace());
        Assertions.assertEquals("bfkgukdkex", model.extensionProperties().get("ppofmxaxcfjpgdd"));
        Assertions.assertEquals(MaintenanceScope.RESOURCE, model.maintenanceScope());
        Assertions.assertEquals(Visibility.CUSTOM, model.visibility());
        Assertions.assertEquals(RebootOptions.NEVER, model.installPatches().rebootSetting());
        Assertions
            .assertEquals("uigdtopbobjog", model.installPatches().windowsParameters().kbNumbersToExclude().get(0));
        Assertions.assertEquals("a", model.installPatches().windowsParameters().kbNumbersToInclude().get(0));
        Assertions.assertEquals("z", model.installPatches().windowsParameters().classificationsToInclude().get(0));
        Assertions.assertEquals(true, model.installPatches().windowsParameters().excludeKbsRequiringReboot());
        Assertions.assertEquals("qxlngx", model.installPatches().linuxParameters().packageNameMasksToExclude().get(0));
        Assertions.assertEquals("qmi", model.installPatches().linuxParameters().packageNameMasksToInclude().get(0));
        Assertions
            .assertEquals("hjybigehoqfbo", model.installPatches().linuxParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("vddntwn", model.startDateTime());
        Assertions.assertEquals("icbtwnpzao", model.expirationDateTime());
        Assertions.assertEquals("uhrhcffcyddgl", model.duration());
        Assertions.assertEquals("t", model.timeZone());
        Assertions.assertEquals("qkwpyeicxmqc", model.recurEvery());
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
