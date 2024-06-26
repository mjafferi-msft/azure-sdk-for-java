// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.serializer;

import com.azure.core.implementation.TypeUtil;
import com.azure.core.util.logging.ClientLogger;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class represents a generic Java type, retaining information about generics.
 *
 * <p>
 * <strong>Code sample</strong>
 * </p>
 *
 * <!-- src_embed com.azure.core.util.serializer.constructor -->
 * <pre>
 * &#47;&#47; Construct a TypeReference&lt;T&gt; for a Java generic type.
 * &#47;&#47; This pattern should only be used for generic types, for classes use the createInstance factory method.
 * TypeReference&lt;Map&lt;String, Object&gt;&gt; typeReference = new TypeReference&lt;Map&lt;String, Object&gt;&gt;&#40;&#41; &#123; &#125;;
 * </pre>
 * <!-- end com.azure.core.util.serializer.constructor -->
 *
 * <!-- src_embed com.azure.core.util.serializer.createInstance#class -->
 * <pre>
 * &#47;&#47; Construct a TypeReference&lt;T&gt; for a Java class.
 * &#47;&#47; This pattern should only be used for non-generic classes when possible, use the constructor for generic
 * &#47;&#47; class when possible.
 * TypeReference&lt;Integer&gt; typeReference = TypeReference.createInstance&#40;int.class&#41;;
 * </pre>
 * <!-- end com.azure.core.util.serializer.createInstance#class -->
 *
 * @param <T> The type being represented.
 */
public abstract class TypeReference<T> {
    private static final ClientLogger LOGGER = new ClientLogger(TypeReference.class);
    private static final String MISSING_TYPE = "Type constructed without type information.";

    private static final Map<Class<?>, TypeReference<?>> CACHE = new ConcurrentHashMap<>();

    private final Type javaType;
    private final Class<T> clazz;

    /**
     * Constructs a new {@link TypeReference} which maintains generic information.
     *
     * @throws IllegalArgumentException If the reference is constructed without type information.
     */
    @SuppressWarnings("unchecked")
    public TypeReference() {
        Type superClass = this.getClass().getGenericSuperclass();
        if (superClass instanceof Class) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(MISSING_TYPE));
        } else {
            this.javaType = ((ParameterizedType) superClass).getActualTypeArguments()[0];
        }
        this.clazz = (Class<T>) TypeUtil.getRawClass(javaType);
    }

    private TypeReference(Class<T> clazz) {
        this.javaType = clazz;
        this.clazz = clazz;
    }

    /**
     * Returns the {@link Type} representing {@code T}.
     *
     * @return The {@link Type} representing {@code T}.
     */
    public Type getJavaType() {
        return javaType;
    }

    /**
     * Creates and instance of {@link TypeReference} which maintains the generic {@code T} of the passed {@link Class}.
     * <p>
     * This method will cache the instance of {@link TypeReference} using the passed {@link Class} as the key. This is
     * meant to be used with non-generic types such as primitive object types and POJOs, not {@code Map<String, Object>}
     * or {@code List<Integer>} parameterized types.
     *
     * @param clazz {@link Class} that contains generic information used to create the {@link TypeReference}.
     * @param <T> The generic type.
     * @return Either the cached or new instance of {@link TypeReference}.
     */
    @SuppressWarnings("unchecked")
    public static <T> TypeReference<T> createInstance(Class<T> clazz) {
        /*
         * When computing the TypeReference if the key is absent ignore the parameter from the compute function. The
         * compute function wildcards to T type which causes the type system to breakdown.
         */
        return (TypeReference<T>) CACHE.computeIfAbsent(clazz, c -> new TypeReference<T>(clazz) {
        });
    }

    /**
     * Returns the {@link Class} representing instance of the {@link TypeReference} created.
     *
     * @return The {@link Class} representing instance of the {@link TypeReference} created
     * using the {@link TypeReference#createInstance(Class)}, otherwise returns {@code null}.
     */
    public Class<T> getJavaClass() {
        return this.clazz;
    }
}
