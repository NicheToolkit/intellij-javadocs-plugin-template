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
 * @param <I> {@link Object} <p>the parameter can be of any type.</p>
 * @param <E> {@link TheInterfaceExample} <p>the generic parameter is <code>TheInterfaceExample</code> type.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see java.io.Serializable
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>the TheInterfaceExample interface has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public interface TheInterfaceExample<I,E extends TheInterfaceExample<I,E>> extends Serializable {
    /**
     * <code>INTERFACE_FIELD_EXAMPLE</code>
     * {@link String} <p>the constant <code>INTERFACE_FIELD_EXAMPLE</code> field.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonIgnore
     */
    @JsonIgnore
    String INTERFACE_FIELD_EXAMPLE = "INTERFACE_FIELD_EXAMPLE";

    /**
     * <code>getInterfaceField</code>
     * <p>the interface field getter method.</p>
     * @return {@link String} <p>the interface field return object is <code>String</code> type.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonValue
     * @see org.springframework.lang.NonNull
     */
    @JsonValue
    @NonNull
    String getInterfaceField();

    /**
     * <code>setInterfaceField</code>
     * <p>the interface field setter method.</p>
     * @param interfaceField {@link String} <p>the interface field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see com.fasterxml.jackson.annotation.JsonCreator
     */
    @JsonCreator
    void setInterfaceField(@NonNull String interfaceField);

    /**
     * <code>theMethodExample</code>
     * <p>the method example method.</p>
     * @param param1 {@link Integer} <p>the param 1 parameter is <code>Integer</code> type.</p>
     * @param param2 {@link String} <p>the param 2 parameter is <code>String</code> type.</p>
     * @param param3 {@link String} <p>the param 3 parameter is <code>String</code> type.</p>
     * @return {@link String} <p>the method example return object is <code>String</code> type.</p>
     * @throws RestException {@link RestException} <p>the rest exception is <code>RestException</code> type.</p>
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
     * <p>the void method example method.</p>
     * @param param1 {@link Integer} <p>the param 1 parameter is <code>Integer</code> type.</p>
     * @param params {@link String} <p>the params parameter is <code>String</code> type.</p>
     * @throws RestException {@link RestException} <p>the rest exception is <code>RestException</code> type.</p>
     * @see java.lang.Integer
     * @see org.springframework.lang.Nullable
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see java.lang.Deprecated
     * @see io.github.nichetoolkit.rest.RestException
     * @deprecated <p>the theVoidMethodExample method has be deprecated.</p>
     */
    @Deprecated
    default void theVoidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {}
}
