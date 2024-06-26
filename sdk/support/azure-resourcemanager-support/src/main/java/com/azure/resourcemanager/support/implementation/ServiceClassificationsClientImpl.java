// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.support.fluent.ServiceClassificationsClient;
import com.azure.resourcemanager.support.fluent.models.ServiceClassificationOutputInner;
import com.azure.resourcemanager.support.models.ServiceClassificationRequest;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ServiceClassificationsClient.
 */
public final class ServiceClassificationsClientImpl implements ServiceClassificationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ServiceClassificationsService service;

    /**
     * The service client containing this operation class.
     */
    private final MicrosoftSupportImpl client;

    /**
     * Initializes an instance of ServiceClassificationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ServiceClassificationsClientImpl(MicrosoftSupportImpl client) {
        this.service = RestProxy.create(ServiceClassificationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftSupportServiceClassifications to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftSupportServ")
    public interface ServiceClassificationsService {
        @Headers({ "Content-Type: application/json" })
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Support/classifyServices")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServiceClassificationOutputInner>> classifyServices(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ServiceClassificationRequest serviceClassificationRequest,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Classify the list of right Azure services.
     * 
     * @param serviceClassificationRequest Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the service classification API along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServiceClassificationOutputInner>>
        classifyServicesWithResponseAsync(ServiceClassificationRequest serviceClassificationRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (serviceClassificationRequest == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter serviceClassificationRequest is required and cannot be null."));
        } else {
            serviceClassificationRequest.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.classifyServices(this.client.getEndpoint(), this.client.getSubscriptionId(),
                this.client.getApiVersion(), serviceClassificationRequest, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Classify the list of right Azure services.
     * 
     * @param serviceClassificationRequest Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the service classification API along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ServiceClassificationOutputInner>>
        classifyServicesWithResponseAsync(ServiceClassificationRequest serviceClassificationRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (serviceClassificationRequest == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter serviceClassificationRequest is required and cannot be null."));
        } else {
            serviceClassificationRequest.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.classifyServices(this.client.getEndpoint(), this.client.getSubscriptionId(),
            this.client.getApiVersion(), serviceClassificationRequest, accept, context);
    }

    /**
     * Classify the list of right Azure services.
     * 
     * @param serviceClassificationRequest Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the service classification API on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ServiceClassificationOutputInner>
        classifyServicesAsync(ServiceClassificationRequest serviceClassificationRequest) {
        return classifyServicesWithResponseAsync(serviceClassificationRequest)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Classify the list of right Azure services.
     * 
     * @param serviceClassificationRequest Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the service classification API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ServiceClassificationOutputInner>
        classifyServicesWithResponse(ServiceClassificationRequest serviceClassificationRequest, Context context) {
        return classifyServicesWithResponseAsync(serviceClassificationRequest, context).block();
    }

    /**
     * Classify the list of right Azure services.
     * 
     * @param serviceClassificationRequest Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the service classification API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServiceClassificationOutputInner
        classifyServices(ServiceClassificationRequest serviceClassificationRequest) {
        return classifyServicesWithResponse(serviceClassificationRequest, Context.NONE).getValue();
    }
}
