package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;

/**
 * <code>TheInterfaceExample</code>
 * <p>The type the interface example interface.</p>
 * @param <I> {@link java.lang.Object} <p>The parameter can be of any type.</p>
 * @param <E> {@link io.github.nichetoolkit.example.TheInterfaceExample} <p>The generic parameter is <code>TheInterfaceExample</code> type.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see java.io.Serializable
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>The the interface example interface has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public interface TheInterfaceExample<I,E extends TheInterfaceExample<I,E>> extends Serializable {
    /**
     * <code>INTERFACE_FIELD_EXAMPLE</code>
     * {@link java.lang.String} <p>The constant <code>INTERFACE_FIELD_EXAMPLE</code> field.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonIgnore
     */
    @JsonIgnore
    String INTERFACE_FIELD_EXAMPLE = "INTERFACE_FIELD_EXAMPLE";

    /**
     * <code>getInterfaceField</code>
     * <p>The interface field getter method.</p>
     * @return {@link java.lang.String} <p>The interface field return object is <code>String</code> type.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonValue
     * @see org.springframework.lang.NonNull
     */
    @JsonValue
    @NonNull
    String getInterfaceField();

    /**
     * <code>setInterfaceField</code>
     * <p>The interface field setter method.</p>
     * @param interfaceField {@link java.lang.String} <p>The interface field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see com.fasterxml.jackson.annotation.JsonCreator
     */
    @JsonCreator
    void setInterfaceField(@NonNull String interfaceField);

    /**
     * <code>theMethodExample</code>
     * <p>The method example method.</p>
     * @param param1 {@link java.lang.Integer} <p>The param 1 parameter is <code>Integer</code> type.</p>
     * @param param2 {@link java.lang.String} <p>The param 2 parameter is <code>String</code> type.</p>
     * @param param3 {@link java.lang.String} <p>The param 3 parameter is <code>String</code> type.</p>
     * @return {@link java.lang.String} <p>The method example return object is <code>String</code> type.</p>
     * @throws RestException {@link io.github.nichetoolkit.rest.RestException} <p>The rest exception is <code>RestException</code> type.</p>
     * @see java.lang.Integer
     * @see org.springframework.lang.Nullable
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see io.github.nichetoolkit.rest.RestException
     */
    @NonNull
    default String[] theMethodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
        return new String[0];
    }

    /**
     * <code>theVoidMethodExample</code>
     * <p>The void method example method.</p>
     * @param param1 {@link java.lang.Integer} <p>The param 1 parameter is <code>Integer</code> type.</p>
     * @param params {@link java.lang.String} <p>The params parameter is <code>String</code> type.</p>
     * @throws RestException {@link io.github.nichetoolkit.rest.RestException} <p>The rest exception is <code>RestException</code> type.</p>
     * @see java.lang.Integer
     * @see org.springframework.lang.Nullable
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see java.lang.Deprecated
     * @see io.github.nichetoolkit.rest.RestException
     * @deprecated <p>The the void method example method has be deprecated.</p>
     */
    @Deprecated
    default void theVoidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {}

    /**
     * <code>theMethodExample</code>
     * <p>The method example method.</p>
     * @param param1 {@link java.lang.Integer} <p>The param 1 parameter is <code>Integer</code> type.</p>
     * @param params int <p>The params parameter is <code>int</code> type.</p>
     * @return int <p>The method example return object is <code>int</code> type.</p>
     * @throws RestException {@link io.github.nichetoolkit.rest.RestException} <p>The rest exception is <code>RestException</code> type.</p>
     * @see java.lang.Integer
     * @see org.springframework.lang.Nullable
     * @see org.springframework.lang.NonNull
     * @see io.github.nichetoolkit.rest.RestException
     */
    @NonNull
    default int[] theMethodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
        return new int[0];
    }

}
