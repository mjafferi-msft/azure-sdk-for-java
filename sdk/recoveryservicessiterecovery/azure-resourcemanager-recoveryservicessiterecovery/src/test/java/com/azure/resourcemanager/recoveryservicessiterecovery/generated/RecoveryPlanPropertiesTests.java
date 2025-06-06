// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CurrentScenarioDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PossibleOperationsDirections;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanAction;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanActionDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanGroup;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanGroupType;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProtectedItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProviderSpecificDetails;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItemOperation;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPlanPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPlanProperties model = BinaryData.fromString(
            "{\"friendlyName\":\"rpcjttbstvjeaqnr\",\"primaryFabricId\":\"vfkoxml\",\"primaryFabricFriendlyName\":\"ktuidvrm\",\"recoveryFabricId\":\"lpdwwexymzvlazi\",\"recoveryFabricFriendlyName\":\"hpwvqsgnyyuu\",\"failoverDeploymentModel\":\"vensrpm\",\"replicationProviders\":[\"vpkpatlb\",\"jp\",\"gsksrfhf\",\"olmk\"],\"allowedOperations\":[\"xwcdomm\",\"vfqawzfgbrttuiac\",\"kiexhajlfnthiq\"],\"lastPlannedFailoverTime\":\"2021-01-02T12:53:58Z\",\"lastUnplannedFailoverTime\":\"2021-07-02T21:58:03Z\",\"lastTestFailoverTime\":\"2021-06-24T14:07:57Z\",\"currentScenario\":{\"scenarioName\":\"b\",\"jobId\":\"n\",\"startTime\":\"2021-04-05T20:55:30Z\"},\"currentScenarioStatus\":\"txkyctwwgzwxjlm\",\"currentScenarioStatusDescription\":\"vogygzyvneez\",\"groups\":[{\"groupType\":\"Boot\",\"replicationProtectedItems\":[{\"id\":\"oqqtl\",\"virtualMachineId\":\"hzbkrkjj\"},{\"id\":\"vfqnvhnqoewdo\",\"virtualMachineId\":\"yetesy\"},{\"id\":\"idbz\",\"virtualMachineId\":\"hqtfbovn\"}],\"startGroupActions\":[{\"actionName\":\"bwetnjuhpsp\",\"failoverTypes\":[\"ChangePit\",\"CancelFailover\"],\"failoverDirections\":[\"PrimaryToRecovery\",\"RecoveryToPrimary\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"ia\",\"failoverTypes\":[\"SwitchProtection\",\"CancelFailover\",\"Failback\"],\"failoverDirections\":[\"RecoveryToPrimary\",\"PrimaryToRecovery\",\"PrimaryToRecovery\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}],\"endGroupActions\":[{\"actionName\":\"ohtuovmaonur\",\"failoverTypes\":[\"RepairReplication\"],\"failoverDirections\":[\"RecoveryToPrimary\",\"RecoveryToPrimary\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"ihpvecmslclblyj\",\"failoverTypes\":[\"UnplannedFailover\"],\"failoverDirections\":[\"RecoveryToPrimary\",\"PrimaryToRecovery\",\"PrimaryToRecovery\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"scvsfxigctm\",\"failoverTypes\":[\"RepairReplication\"],\"failoverDirections\":[\"RecoveryToPrimary\",\"RecoveryToPrimary\",\"PrimaryToRecovery\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}},{\"actionName\":\"zqccydrtce\",\"failoverTypes\":[\"SwitchProtection\",\"Commit\",\"ChangePit\"],\"failoverDirections\":[\"RecoveryToPrimary\"],\"customDetails\":{\"instanceType\":\"RecoveryPlanActionDetails\"}}]}],\"providerSpecificDetails\":[{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"},{\"instanceType\":\"RecoveryPlanProviderSpecificDetails\"}]}")
            .toObject(RecoveryPlanProperties.class);
        Assertions.assertEquals("rpcjttbstvjeaqnr", model.friendlyName());
        Assertions.assertEquals("vfkoxml", model.primaryFabricId());
        Assertions.assertEquals("ktuidvrm", model.primaryFabricFriendlyName());
        Assertions.assertEquals("lpdwwexymzvlazi", model.recoveryFabricId());
        Assertions.assertEquals("hpwvqsgnyyuu", model.recoveryFabricFriendlyName());
        Assertions.assertEquals("vensrpm", model.failoverDeploymentModel());
        Assertions.assertEquals("vpkpatlb", model.replicationProviders().get(0));
        Assertions.assertEquals("xwcdomm", model.allowedOperations().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-02T12:53:58Z"), model.lastPlannedFailoverTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T21:58:03Z"), model.lastUnplannedFailoverTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-24T14:07:57Z"), model.lastTestFailoverTime());
        Assertions.assertEquals("b", model.currentScenario().scenarioName());
        Assertions.assertEquals("n", model.currentScenario().jobId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-05T20:55:30Z"), model.currentScenario().startTime());
        Assertions.assertEquals("txkyctwwgzwxjlm", model.currentScenarioStatus());
        Assertions.assertEquals("vogygzyvneez", model.currentScenarioStatusDescription());
        Assertions.assertEquals(RecoveryPlanGroupType.BOOT, model.groups().get(0).groupType());
        Assertions.assertEquals("oqqtl", model.groups().get(0).replicationProtectedItems().get(0).id());
        Assertions.assertEquals("hzbkrkjj",
            model.groups().get(0).replicationProtectedItems().get(0).virtualMachineId());
        Assertions.assertEquals("bwetnjuhpsp", model.groups().get(0).startGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.CHANGE_PIT,
            model.groups().get(0).startGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.PRIMARY_TO_RECOVERY,
            model.groups().get(0).startGroupActions().get(0).failoverDirections().get(0));
        Assertions.assertEquals("ohtuovmaonur", model.groups().get(0).endGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.REPAIR_REPLICATION,
            model.groups().get(0).endGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.groups().get(0).endGroupActions().get(0).failoverDirections().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPlanProperties model
            = new RecoveryPlanProperties().withFriendlyName("rpcjttbstvjeaqnr")
                .withPrimaryFabricId("vfkoxml")
                .withPrimaryFabricFriendlyName("ktuidvrm")
                .withRecoveryFabricId("lpdwwexymzvlazi")
                .withRecoveryFabricFriendlyName("hpwvqsgnyyuu")
                .withFailoverDeploymentModel("vensrpm")
                .withReplicationProviders(Arrays.asList("vpkpatlb", "jp", "gsksrfhf", "olmk"))
                .withAllowedOperations(Arrays.asList("xwcdomm", "vfqawzfgbrttuiac", "kiexhajlfnthiq"))
                .withLastPlannedFailoverTime(OffsetDateTime.parse("2021-01-02T12:53:58Z"))
                .withLastUnplannedFailoverTime(OffsetDateTime.parse("2021-07-02T21:58:03Z"))
                .withLastTestFailoverTime(OffsetDateTime.parse("2021-06-24T14:07:57Z"))
                .withCurrentScenario(new CurrentScenarioDetails().withScenarioName("b")
                    .withJobId("n")
                    .withStartTime(OffsetDateTime.parse("2021-04-05T20:55:30Z")))
                .withCurrentScenarioStatus("txkyctwwgzwxjlm")
                .withCurrentScenarioStatusDescription("vogygzyvneez")
                .withGroups(
                    Arrays.asList(new RecoveryPlanGroup().withGroupType(RecoveryPlanGroupType.BOOT)
                        .withReplicationProtectedItems(Arrays.asList(
                            new RecoveryPlanProtectedItem().withId("oqqtl").withVirtualMachineId("hzbkrkjj"),
                            new RecoveryPlanProtectedItem().withId("vfqnvhnqoewdo").withVirtualMachineId("yetesy"),
                            new RecoveryPlanProtectedItem().withId("idbz").withVirtualMachineId("hqtfbovn")))
                        .withStartGroupActions(Arrays.asList(
                            new RecoveryPlanAction().withActionName("bwetnjuhpsp")
                                .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.CHANGE_PIT,
                                    ReplicationProtectedItemOperation.CANCEL_FAILOVER))
                                .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.PRIMARY_TO_RECOVERY,
                                    PossibleOperationsDirections.RECOVERY_TO_PRIMARY))
                                .withCustomDetails(new RecoveryPlanActionDetails()),
                            new RecoveryPlanAction()
                                .withActionName("ia")
                                .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.SWITCH_PROTECTION,
                                    ReplicationProtectedItemOperation.CANCEL_FAILOVER,
                                    ReplicationProtectedItemOperation.FAILBACK))
                                .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                                    PossibleOperationsDirections.PRIMARY_TO_RECOVERY,
                                    PossibleOperationsDirections.PRIMARY_TO_RECOVERY))
                                .withCustomDetails(new RecoveryPlanActionDetails())))
                        .withEndGroupActions(Arrays.asList(
                            new RecoveryPlanAction().withActionName("ohtuovmaonur")
                                .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.REPAIR_REPLICATION))
                                .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                                    PossibleOperationsDirections.RECOVERY_TO_PRIMARY))
                                .withCustomDetails(new RecoveryPlanActionDetails()),
                            new RecoveryPlanAction().withActionName("ihpvecmslclblyj")
                                .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.UNPLANNED_FAILOVER))
                                .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                                    PossibleOperationsDirections.PRIMARY_TO_RECOVERY,
                                    PossibleOperationsDirections.PRIMARY_TO_RECOVERY))
                                .withCustomDetails(new RecoveryPlanActionDetails()),
                            new RecoveryPlanAction().withActionName("scvsfxigctm")
                                .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.REPAIR_REPLICATION))
                                .withFailoverDirections(Arrays.asList(
                                    PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                                    PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
                                    PossibleOperationsDirections.PRIMARY_TO_RECOVERY))
                                .withCustomDetails(new RecoveryPlanActionDetails()),
                            new RecoveryPlanAction().withActionName("zqccydrtce")
                                .withFailoverTypes(Arrays.asList(ReplicationProtectedItemOperation.SWITCH_PROTECTION,
                                    ReplicationProtectedItemOperation.COMMIT,
                                    ReplicationProtectedItemOperation.CHANGE_PIT))
                                .withFailoverDirections(Arrays.asList(PossibleOperationsDirections.RECOVERY_TO_PRIMARY))
                                .withCustomDetails(new RecoveryPlanActionDetails())))))
                .withProviderSpecificDetails(
                    Arrays.asList(new RecoveryPlanProviderSpecificDetails(), new RecoveryPlanProviderSpecificDetails(),
                        new RecoveryPlanProviderSpecificDetails(), new RecoveryPlanProviderSpecificDetails()));
        model = BinaryData.fromObject(model).toObject(RecoveryPlanProperties.class);
        Assertions.assertEquals("rpcjttbstvjeaqnr", model.friendlyName());
        Assertions.assertEquals("vfkoxml", model.primaryFabricId());
        Assertions.assertEquals("ktuidvrm", model.primaryFabricFriendlyName());
        Assertions.assertEquals("lpdwwexymzvlazi", model.recoveryFabricId());
        Assertions.assertEquals("hpwvqsgnyyuu", model.recoveryFabricFriendlyName());
        Assertions.assertEquals("vensrpm", model.failoverDeploymentModel());
        Assertions.assertEquals("vpkpatlb", model.replicationProviders().get(0));
        Assertions.assertEquals("xwcdomm", model.allowedOperations().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-02T12:53:58Z"), model.lastPlannedFailoverTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-02T21:58:03Z"), model.lastUnplannedFailoverTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-24T14:07:57Z"), model.lastTestFailoverTime());
        Assertions.assertEquals("b", model.currentScenario().scenarioName());
        Assertions.assertEquals("n", model.currentScenario().jobId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-05T20:55:30Z"), model.currentScenario().startTime());
        Assertions.assertEquals("txkyctwwgzwxjlm", model.currentScenarioStatus());
        Assertions.assertEquals("vogygzyvneez", model.currentScenarioStatusDescription());
        Assertions.assertEquals(RecoveryPlanGroupType.BOOT, model.groups().get(0).groupType());
        Assertions.assertEquals("oqqtl", model.groups().get(0).replicationProtectedItems().get(0).id());
        Assertions.assertEquals("hzbkrkjj",
            model.groups().get(0).replicationProtectedItems().get(0).virtualMachineId());
        Assertions.assertEquals("bwetnjuhpsp", model.groups().get(0).startGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.CHANGE_PIT,
            model.groups().get(0).startGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.PRIMARY_TO_RECOVERY,
            model.groups().get(0).startGroupActions().get(0).failoverDirections().get(0));
        Assertions.assertEquals("ohtuovmaonur", model.groups().get(0).endGroupActions().get(0).actionName());
        Assertions.assertEquals(ReplicationProtectedItemOperation.REPAIR_REPLICATION,
            model.groups().get(0).endGroupActions().get(0).failoverTypes().get(0));
        Assertions.assertEquals(PossibleOperationsDirections.RECOVERY_TO_PRIMARY,
            model.groups().get(0).endGroupActions().get(0).failoverDirections().get(0));
    }
}
