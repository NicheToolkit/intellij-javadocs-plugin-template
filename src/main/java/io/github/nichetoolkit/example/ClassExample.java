package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;

/**
 * <code>ClassExample</code>
 * <p>The class example class.</p>
 * @param <I> {@link java.lang.Object} <p>The parameter can be of any type.</p>
 * @param <E> {@link io.github.nichetoolkit.example.ClassExample} <p>The generic parameter is <code>ClassExample</code> type.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see java.io.Serializable
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>The class example class has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public class ClassExample<I, E extends ClassExample<I, E>> implements Serializable {
    /**
     * <code>CLASS_FIELD_EXAMPLE</code>
     * {@link java.lang.String} <p>The constant <code>CLASS_FIELD_EXAMPLE</code> field.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonIgnore
     */
    @JsonIgnore
    public static final String CLASS_FIELD_EXAMPLE = "CLASS_FIELD_EXAMPLE";

    /**
     * <code>classField</code>
     * {@link java.lang.String} <p>The <code>classField</code> field.</p>
     * @see java.lang.String
     */
    private String classField;

    /**
     * <code>ClassExample</code>
     * <p>Instantiates a new class example.</p>
     */
    public ClassExample() {
    }

    /**
     * <code>ClassExample</code>
     * <p>Instantiates a new class example.</p>
     * @param classField {@link java.lang.String} <p>The class field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     */
    public ClassExample(String classField) {
        this.classField = classField;
    }

    /**
     * <code>getClassField</code>
     * <p>The get class field getter method.</p>
     * @return {@link java.lang.String} <p>The get class field return object is <code>String</code> type.</p>
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
     * <p>The set class field setter method.</p>
     * @param classField {@link java.lang.String} <p>The class field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see com.fasterxml.jackson.annotation.JsonCreator
     */
    @JsonCreator
    public void setClassField(@NonNull String classField) {
        this.classField = classField;
    }

    /**
     * <code>methodExample</code>
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
    public String[] methodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
        return new String[0];
    }

    /**
     * <code>voidMethodExample</code>
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
     * @deprecated <p>The void method example method has be deprecated.</p>
     */
    @Deprecated
    public void voidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {
    }

    /**
     * <code>methodExample</code>
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
    public int[] methodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
        return new int[0];
    }

}
