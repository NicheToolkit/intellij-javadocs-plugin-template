package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;

/**
 * <code>TheClassExample</code>
 * <p>The type the class example class.</p>
 * @param <I> {@link java.lang.Object} <p>the parameter can be of any type.</p>
 * @param <E> {@link io.github.nichetoolkit.example.TheClassExample} <p>the generic parameter is <code>TheClassExample</code> type.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see java.io.Serializable
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>the TheClassExample class has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public class TheClassExample<I, E extends TheClassExample<I, E>> implements Serializable {
    /**
     * <code>CLASS_FIELD_EXAMPLE</code>
     * {@link java.lang.String} <p>the constant <code>CLASS_FIELD_EXAMPLE</code> field.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonIgnore
     */
    @JsonIgnore
    public static final String CLASS_FIELD_EXAMPLE = "CLASS_FIELD_EXAMPLE";

    private String classField;

    /**
     * <code>TheClassExample</code>
     * Instantiates a new the class example.
     */
    public TheClassExample() {
    }

    /**
     * <code>TheClassExample</code>
     * Instantiates a new the class example.
     * @param classField {@link java.lang.String} <p>the class field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     */
    public TheClassExample(String classField) {
        this.classField = classField;
    }

    /**
     * <code>getClassField</code>
     * <p>the class field getter method.</p>
     * @return {@link java.lang.String} <p>the class field return object is <code>String</code> type.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonValue
     * @see org.springframework.lang.NonNull
     */
    @JsonValue
    @NonNull
    public String getClassField() {
        return this.classField;
    }

    /**
     * <code>setClassField</code>
     * <p>the class field setter method.</p>
     * @param classField {@link java.lang.String} <p>the class field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see com.fasterxml.jackson.annotation.JsonCreator
     */
    @JsonCreator
    public void setClassField(@NonNull String classField) {
        this.classField = classField;
    }

    /**
     * <code>theMethodExample</code>
     * <p>the method example method.</p>
     * @param param1 {@link java.lang.Integer} <p>the param 1 parameter is <code>Integer</code> type.</p>
     * @param param2 {@link java.lang.String} <p>the param 2 parameter is <code>String</code> type.</p>
     * @param param3 {@link java.lang.String} <p>the param 3 parameter is <code>String</code> type.</p>
     * @return {@link java.lang.String} <p>the method example return object is <code>String</code> type.</p>
     * @throws RestException {@link io.github.nichetoolkit.rest.RestException} <p>the rest exception is <code>RestException</code> type.</p>
     * @see java.lang.Integer
     * @see org.springframework.lang.Nullable
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see io.github.nichetoolkit.rest.RestException
     */
    @NonNull
    public String[] theMethodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
        return new String[0];
    }

    /**
     * <code>theVoidMethodExample</code>
     * <p>the void method example method.</p>
     * @param param1 {@link java.lang.Integer} <p>the param 1 parameter is <code>Integer</code> type.</p>
     * @param params {@link java.lang.String} <p>the params parameter is <code>String</code> type.</p>
     * @throws RestException {@link io.github.nichetoolkit.rest.RestException} <p>the rest exception is <code>RestException</code> type.</p>
     * @see java.lang.Integer
     * @see org.springframework.lang.Nullable
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see java.lang.Deprecated
     * @see io.github.nichetoolkit.rest.RestException
     * @deprecated <p>the theVoidMethodExample method has be deprecated.</p>
     */
    @Deprecated
    public void theVoidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {
    }

    /**
     * <code>theMethodExample</code>
     * <p>the method example method.</p>
     * @param param1 {@link java.lang.Integer} <p>the param 1 parameter is <code>Integer</code> type.</p>
     * @param params int <p>the params parameter is <code>int</code> type.</p>
     * @return int <p>the method example return object is <code>int</code> type.</p>
     * @throws RestException {@link io.github.nichetoolkit.rest.RestException} <p>the rest exception is <code>RestException</code> type.</p>
     * @see java.lang.Integer
     * @see org.springframework.lang.Nullable
     * @see org.springframework.lang.NonNull
     * @see io.github.nichetoolkit.rest.RestException
     */
    @NonNull
    public int[] theMethodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
        return new int[0];
    }

}
