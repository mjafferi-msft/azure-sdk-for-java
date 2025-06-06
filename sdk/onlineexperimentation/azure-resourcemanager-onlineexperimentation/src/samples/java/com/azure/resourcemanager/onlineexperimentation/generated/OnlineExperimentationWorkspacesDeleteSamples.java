// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.onlineexperimentation.generated;

/**
 * Samples for OnlineExperimentationWorkspaces Delete.
 */
public final class OnlineExperimentationWorkspacesDeleteSamples {
    /*
     * x-ms-original-file: 2025-05-31-preview/OnlineExperimentationWorkspaces_Delete.json
     */
    /**
     * Sample code: Delete an Online Experimentation Workspace.
     * 
     * @param manager Entry point to OnlineExperimentationManager.
     */
    public static void deleteAnOnlineExperimentationWorkspace(
        com.azure.resourcemanager.onlineexperimentation.OnlineExperimentationManager manager) {
        manager.onlineExperimentationWorkspaces().delete("res9871", "expworkspace3", com.azure.core.util.Context.NONE);
    }
}
