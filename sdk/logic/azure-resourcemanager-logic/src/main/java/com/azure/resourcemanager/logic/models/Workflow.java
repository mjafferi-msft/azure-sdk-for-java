// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.WorkflowInner;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An immutable client-side representation of Workflow.
 */
public interface Workflow {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Managed service identity properties.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the provisioningState property: Gets the provisioning state.
     * 
     * @return the provisioningState value.
     */
    WorkflowProvisioningState provisioningState();

    /**
     * Gets the createdTime property: Gets the created time.
     * 
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the changedTime property: Gets the changed time.
     * 
     * @return the changedTime value.
     */
    OffsetDateTime changedTime();

    /**
     * Gets the state property: The state.
     * 
     * @return the state value.
     */
    WorkflowState state();

    /**
     * Gets the version property: Gets the version.
     * 
     * @return the version value.
     */
    String version();

    /**
     * Gets the accessEndpoint property: Gets the access endpoint.
     * 
     * @return the accessEndpoint value.
     */
    String accessEndpoint();

    /**
     * Gets the endpointsConfiguration property: The endpoints configuration.
     * 
     * @return the endpointsConfiguration value.
     */
    FlowEndpointsConfiguration endpointsConfiguration();

    /**
     * Gets the accessControl property: The access control configuration.
     * 
     * @return the accessControl value.
     */
    FlowAccessControlConfiguration accessControl();

    /**
     * Gets the sku property: The sku.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the integrationAccount property: The integration account.
     * 
     * @return the integrationAccount value.
     */
    ResourceReference integrationAccount();

    /**
     * Gets the integrationServiceEnvironment property: The integration service environment.
     * 
     * @return the integrationServiceEnvironment value.
     */
    ResourceReference integrationServiceEnvironment();

    /**
     * Gets the definition property: The definition.
     * 
     * @return the definition value.
     */
    Object definition();

    /**
     * Gets the parameters property: The parameters.
     * 
     * @return the parameters value.
     */
    Map<String, WorkflowParameter> parameters();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.logic.fluent.models.WorkflowInner object.
     * 
     * @return the inner object.
     */
    WorkflowInner innerModel();

    /**
     * The entirety of the Workflow definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The Workflow definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Workflow definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the Workflow definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the Workflow definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The resource group name.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the Workflow definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity,
            DefinitionStages.WithState, DefinitionStages.WithEndpointsConfiguration, DefinitionStages.WithAccessControl,
            DefinitionStages.WithIntegrationAccount, DefinitionStages.WithIntegrationServiceEnvironment,
            DefinitionStages.WithDefinition, DefinitionStages.WithParameters {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Workflow create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Workflow create(Context context);
        }

        /**
         * The stage of the Workflow definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Workflow definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity properties..
             * 
             * @param identity Managed service identity properties.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the Workflow definition allowing to specify state.
         */
        interface WithState {
            /**
             * Specifies the state property: The state..
             * 
             * @param state The state.
             * @return the next definition stage.
             */
            WithCreate withState(WorkflowState state);
        }

        /**
         * The stage of the Workflow definition allowing to specify endpointsConfiguration.
         */
        interface WithEndpointsConfiguration {
            /**
             * Specifies the endpointsConfiguration property: The endpoints configuration..
             * 
             * @param endpointsConfiguration The endpoints configuration.
             * @return the next definition stage.
             */
            WithCreate withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration);
        }

        /**
         * The stage of the Workflow definition allowing to specify accessControl.
         */
        interface WithAccessControl {
            /**
             * Specifies the accessControl property: The access control configuration..
             * 
             * @param accessControl The access control configuration.
             * @return the next definition stage.
             */
            WithCreate withAccessControl(FlowAccessControlConfiguration accessControl);
        }

        /**
         * The stage of the Workflow definition allowing to specify integrationAccount.
         */
        interface WithIntegrationAccount {
            /**
             * Specifies the integrationAccount property: The integration account..
             * 
             * @param integrationAccount The integration account.
             * @return the next definition stage.
             */
            WithCreate withIntegrationAccount(ResourceReference integrationAccount);
        }

        /**
         * The stage of the Workflow definition allowing to specify integrationServiceEnvironment.
         */
        interface WithIntegrationServiceEnvironment {
            /**
             * Specifies the integrationServiceEnvironment property: The integration service environment..
             * 
             * @param integrationServiceEnvironment The integration service environment.
             * @return the next definition stage.
             */
            WithCreate withIntegrationServiceEnvironment(ResourceReference integrationServiceEnvironment);
        }

        /**
         * The stage of the Workflow definition allowing to specify definition.
         */
        interface WithDefinition {
            /**
             * Specifies the definition property: The definition..
             * 
             * @param definition The definition.
             * @return the next definition stage.
             */
            WithCreate withDefinition(Object definition);
        }

        /**
         * The stage of the Workflow definition allowing to specify parameters.
         */
        interface WithParameters {
            /**
             * Specifies the parameters property: The parameters..
             * 
             * @param parameters The parameters.
             * @return the next definition stage.
             */
            WithCreate withParameters(Map<String, WorkflowParameter> parameters);
        }
    }

    /**
     * Begins update for the Workflow resource.
     * 
     * @return the stage of resource update.
     */
    Workflow.Update update();

    /**
     * The template for Workflow update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithState,
        UpdateStages.WithEndpointsConfiguration, UpdateStages.WithAccessControl, UpdateStages.WithIntegrationAccount,
        UpdateStages.WithIntegrationServiceEnvironment, UpdateStages.WithDefinition, UpdateStages.WithParameters {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Workflow apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Workflow apply(Context context);
    }

    /**
     * The Workflow update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Workflow update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the Workflow update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed service identity properties..
             * 
             * @param identity Managed service identity properties.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the Workflow update allowing to specify state.
         */
        interface WithState {
            /**
             * Specifies the state property: The state..
             * 
             * @param state The state.
             * @return the next definition stage.
             */
            Update withState(WorkflowState state);
        }

        /**
         * The stage of the Workflow update allowing to specify endpointsConfiguration.
         */
        interface WithEndpointsConfiguration {
            /**
             * Specifies the endpointsConfiguration property: The endpoints configuration..
             * 
             * @param endpointsConfiguration The endpoints configuration.
             * @return the next definition stage.
             */
            Update withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration);
        }

        /**
         * The stage of the Workflow update allowing to specify accessControl.
         */
        interface WithAccessControl {
            /**
             * Specifies the accessControl property: The access control configuration..
             * 
             * @param accessControl The access control configuration.
             * @return the next definition stage.
             */
            Update withAccessControl(FlowAccessControlConfiguration accessControl);
        }

        /**
         * The stage of the Workflow update allowing to specify integrationAccount.
         */
        interface WithIntegrationAccount {
            /**
             * Specifies the integrationAccount property: The integration account..
             * 
             * @param integrationAccount The integration account.
             * @return the next definition stage.
             */
            Update withIntegrationAccount(ResourceReference integrationAccount);
        }

        /**
         * The stage of the Workflow update allowing to specify integrationServiceEnvironment.
         */
        interface WithIntegrationServiceEnvironment {
            /**
             * Specifies the integrationServiceEnvironment property: The integration service environment..
             * 
             * @param integrationServiceEnvironment The integration service environment.
             * @return the next definition stage.
             */
            Update withIntegrationServiceEnvironment(ResourceReference integrationServiceEnvironment);
        }

        /**
         * The stage of the Workflow update allowing to specify definition.
         */
        interface WithDefinition {
            /**
             * Specifies the definition property: The definition..
             * 
             * @param definition The definition.
             * @return the next definition stage.
             */
            Update withDefinition(Object definition);
        }

        /**
         * The stage of the Workflow update allowing to specify parameters.
         */
        interface WithParameters {
            /**
             * Specifies the parameters property: The parameters..
             * 
             * @param parameters The parameters.
             * @return the next definition stage.
             */
            Update withParameters(Map<String, WorkflowParameter> parameters);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Workflow refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Workflow refresh(Context context);

    /**
     * Disables a workflow.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> disableWithResponse(Context context);

    /**
     * Disables a workflow.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disable();

    /**
     * Enables a workflow.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> enableWithResponse(Context context);

    /**
     * Enables a workflow.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enable();

    /**
     * Generates the upgraded definition for a workflow.
     * 
     * @param parameters Parameters for generating an upgraded definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object along with {@link Response}.
     */
    Response<Object> generateUpgradedDefinitionWithResponse(GenerateUpgradedDefinitionParameters parameters,
        Context context);

    /**
     * Generates the upgraded definition for a workflow.
     * 
     * @param parameters Parameters for generating an upgraded definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    Object generateUpgradedDefinition(GenerateUpgradedDefinitionParameters parameters);

    /**
     * Get the workflow callback Url.
     * 
     * @param listCallbackUrl Which callback url to list.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow callback Url along with {@link Response}.
     */
    Response<WorkflowTriggerCallbackUrl> listCallbackUrlWithResponse(GetCallbackUrlParameters listCallbackUrl,
        Context context);

    /**
     * Get the workflow callback Url.
     * 
     * @param listCallbackUrl Which callback url to list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the workflow callback Url.
     */
    WorkflowTriggerCallbackUrl listCallbackUrl(GetCallbackUrlParameters listCallbackUrl);

    /**
     * Gets an OpenAPI definition for the workflow.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an OpenAPI definition for the workflow along with {@link Response}.
     */
    Response<Object> listSwaggerWithResponse(Context context);

    /**
     * Gets an OpenAPI definition for the workflow.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an OpenAPI definition for the workflow.
     */
    Object listSwagger();

    /**
     * Moves an existing workflow.
     * 
     * @param move The workflow to move.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void move(WorkflowReference move);

    /**
     * Moves an existing workflow.
     * 
     * @param move The workflow to move.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void move(WorkflowReference move, Context context);

    /**
     * Regenerates the callback URL access key for request triggers.
     * 
     * @param keyType The access key type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> regenerateAccessKeyWithResponse(RegenerateActionParameter keyType, Context context);

    /**
     * Regenerates the callback URL access key for request triggers.
     * 
     * @param keyType The access key type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void regenerateAccessKey(RegenerateActionParameter keyType);

    /**
     * Validates the workflow.
     * 
     * @param validate The workflow.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> validateByResourceGroupWithResponse(WorkflowInner validate, Context context);

    /**
     * Validates the workflow.
     * 
     * @param validate The workflow.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateByResourceGroup(WorkflowInner validate);
}
