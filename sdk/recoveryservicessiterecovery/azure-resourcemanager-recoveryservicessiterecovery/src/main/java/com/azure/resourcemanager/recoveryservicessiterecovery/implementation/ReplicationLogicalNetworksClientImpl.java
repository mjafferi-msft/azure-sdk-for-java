// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationLogicalNetworksClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.LogicalNetworkInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.LogicalNetworkCollection;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ReplicationLogicalNetworksClient. */
public final class ReplicationLogicalNetworksClientImpl implements ReplicationLogicalNetworksClient {
    /** The proxy service used to perform REST calls. */
    private final ReplicationLogicalNetworksService service;

    /** The service client containing this operation class. */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ReplicationLogicalNetworksClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ReplicationLogicalNetworksClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ReplicationLogicalNetworksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientReplicationLogicalNetworks to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    public interface ReplicationLogicalNetworksService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationLogicalNetworks")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LogicalNetworkCollection>> listByReplicationFabrics(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationLogicalNetworks"
                + "/{logicalNetworkName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LogicalNetworkInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("resourceName") String resourceName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("logicalNetworkName") String logicalNetworkName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LogicalNetworkCollection>> listByReplicationFabricsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogicalNetworkInner>> listByReplicationFabricsSinglePageAsync(
        String resourceName, String resourceGroupName, String fabricName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByReplicationFabrics(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            accept,
                            context))
            .<PagedResponse<LogicalNetworkInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogicalNetworkInner>> listByReplicationFabricsSinglePageAsync(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByReplicationFabrics(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LogicalNetworkInner> listByReplicationFabricsAsync(
        String resourceName, String resourceGroupName, String fabricName) {
        return new PagedFlux<>(
            () -> listByReplicationFabricsSinglePageAsync(resourceName, resourceGroupName, fabricName),
            nextLink -> listByReplicationFabricsNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LogicalNetworkInner> listByReplicationFabricsAsync(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        return new PagedFlux<>(
            () -> listByReplicationFabricsSinglePageAsync(resourceName, resourceGroupName, fabricName, context),
            nextLink -> listByReplicationFabricsNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogicalNetworkInner> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName) {
        return new PagedIterable<>(listByReplicationFabricsAsync(resourceName, resourceGroupName, fabricName));
    }

    /**
     * Gets the list of logical networks under a fabric.
     *
     * <p>Lists all the logical networks of the Azure Site Recovery fabric.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogicalNetworkInner> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        return new PagedIterable<>(listByReplicationFabricsAsync(resourceName, resourceGroupName, fabricName, context));
    }

    /**
     * Gets a logical network with specified server id and logical network name.
     *
     * <p>Gets the details of a logical network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a logical network along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LogicalNetworkInner>> getWithResponseAsync(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (logicalNetworkName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter logicalNetworkName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            logicalNetworkName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a logical network with specified server id and logical network name.
     *
     * <p>Gets the details of a logical network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a logical network along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LogicalNetworkInner>> getWithResponseAsync(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (logicalNetworkName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter logicalNetworkName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                resourceName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                logicalNetworkName,
                accept,
                context);
    }

    /**
     * Gets a logical network with specified server id and logical network name.
     *
     * <p>Gets the details of a logical network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a logical network on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LogicalNetworkInner> getAsync(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName) {
        return getWithResponseAsync(resourceName, resourceGroupName, fabricName, logicalNetworkName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a logical network with specified server id and logical network name.
     *
     * <p>Gets the details of a logical network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a logical network along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LogicalNetworkInner> getWithResponse(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName, Context context) {
        return getWithResponseAsync(resourceName, resourceGroupName, fabricName, logicalNetworkName, context).block();
    }

    /**
     * Gets a logical network with specified server id and logical network name.
     *
     * <p>Gets the details of a logical network.
     *
     * @param resourceName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Server Id.
     * @param logicalNetworkName Logical network name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a logical network.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LogicalNetworkInner get(
        String resourceName, String resourceGroupName, String fabricName, String logicalNetworkName) {
        return getWithResponse(resourceName, resourceGroupName, fabricName, logicalNetworkName, Context.NONE)
            .getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogicalNetworkInner>> listByReplicationFabricsNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.listByReplicationFabricsNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<LogicalNetworkInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of logical networks along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogicalNetworkInner>> listByReplicationFabricsNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByReplicationFabricsNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}