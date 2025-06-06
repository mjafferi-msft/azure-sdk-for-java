// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

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
import com.azure.resourcemanager.network.fluent.VpnSiteLinksClient;
import com.azure.resourcemanager.network.fluent.models.VpnSiteLinkInner;
import com.azure.resourcemanager.network.models.ListVpnSiteLinksResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VpnSiteLinksClient.
 */
public final class VpnSiteLinksClientImpl implements VpnSiteLinksClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VpnSiteLinksService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnSiteLinksClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    VpnSiteLinksClientImpl(NetworkManagementClientImpl client) {
        this.service
            = RestProxy.create(VpnSiteLinksService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientVpnSiteLinks to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface VpnSiteLinksService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}/vpnSiteLinks/{vpnSiteLinkName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VpnSiteLinkInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName,
            @PathParam("vpnSiteLinkName") String vpnSiteLinkName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnSites/{vpnSiteName}/vpnSiteLinks")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListVpnSiteLinksResult>> listByVpnSite(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnSiteName") String vpnSiteName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ListVpnSiteLinksResult>> listByVpnSiteNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Retrieves the details of a VPN site link.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLink Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VpnSiteLinkInner>> getWithResponseAsync(String resourceGroupName, String vpnSiteName,
        String vpnSiteLinkName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vpnSiteName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vpnSiteName is required and cannot be null."));
        }
        if (vpnSiteLinkName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter vpnSiteLinkName is required and cannot be null."));
        }
        final String apiVersion = "2024-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, vpnSiteName, vpnSiteLinkName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the details of a VPN site link.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLink Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VpnSiteLinkInner>> getWithResponseAsync(String resourceGroupName, String vpnSiteName,
        String vpnSiteLinkName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vpnSiteName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vpnSiteName is required and cannot be null."));
        }
        if (vpnSiteLinkName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter vpnSiteLinkName is required and cannot be null."));
        }
        final String apiVersion = "2024-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName,
            vpnSiteLinkName, apiVersion, accept, context);
    }

    /**
     * Retrieves the details of a VPN site link.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLink Resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnSiteLinkInner> getAsync(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName) {
        return getWithResponseAsync(resourceGroupName, vpnSiteName, vpnSiteLinkName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves the details of a VPN site link.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLink Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VpnSiteLinkInner> getWithResponse(String resourceGroupName, String vpnSiteName,
        String vpnSiteLinkName, Context context) {
        return getWithResponseAsync(resourceGroupName, vpnSiteName, vpnSiteLinkName, context).block();
    }

    /**
     * Retrieves the details of a VPN site link.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLink Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnSiteLinkInner get(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName) {
        return getWithResponse(resourceGroupName, vpnSiteName, vpnSiteLinkName, Context.NONE).getValue();
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VpnSiteLinkInner>> listByVpnSiteSinglePageAsync(String resourceGroupName,
        String vpnSiteName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vpnSiteName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vpnSiteName is required and cannot be null."));
        }
        final String apiVersion = "2024-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByVpnSite(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, vpnSiteName, apiVersion, accept, context))
            .<PagedResponse<VpnSiteLinkInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VpnSiteLinkInner>> listByVpnSiteSinglePageAsync(String resourceGroupName,
        String vpnSiteName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vpnSiteName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vpnSiteName is required and cannot be null."));
        }
        final String apiVersion = "2024-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByVpnSite(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, vpnSiteName,
                apiVersion, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnSiteLinkInner> listByVpnSiteAsync(String resourceGroupName, String vpnSiteName) {
        return new PagedFlux<>(() -> listByVpnSiteSinglePageAsync(resourceGroupName, vpnSiteName),
            nextLink -> listByVpnSiteNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<VpnSiteLinkInner> listByVpnSiteAsync(String resourceGroupName, String vpnSiteName,
        Context context) {
        return new PagedFlux<>(() -> listByVpnSiteSinglePageAsync(resourceGroupName, vpnSiteName, context),
            nextLink -> listByVpnSiteNextSinglePageAsync(nextLink, context));
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnSiteLinkInner> listByVpnSite(String resourceGroupName, String vpnSiteName) {
        return new PagedIterable<>(listByVpnSiteAsync(resourceGroupName, vpnSiteName));
    }

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     * 
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnSiteLinkInner> listByVpnSite(String resourceGroupName, String vpnSiteName,
        Context context) {
        return new PagedIterable<>(listByVpnSiteAsync(resourceGroupName, vpnSiteName, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VpnSiteLinkInner>> listByVpnSiteNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByVpnSiteNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<VpnSiteLinkInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks along with {@link PagedResponse} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<VpnSiteLinkInner>> listByVpnSiteNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByVpnSiteNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
