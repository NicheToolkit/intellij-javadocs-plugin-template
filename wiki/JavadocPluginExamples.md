# Interface Example

-  Code

```java
package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public interface InterfaceExample<I,E extends InterfaceExample<I,E>> extends Serializable {
    @JsonIgnore
    String INTERFACE_FIELD_EXAMPLE = "INTERFACE_FIELD_EXAMPLE";

    @JsonValue
    @NonNull
    String getInterfaceField();

    @JsonCreator
    void setInterfaceField(@NonNull String interfaceField);

    @NonNull
    default String[] methodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
        return new String[0];
    }

    @Deprecated
    default void voidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {}

    @NonNull
    default int[] methodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
        return new int[0];
    }

}
```


-  Doc

```java
package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;

/**
 * <code>InterfaceExample</code>
 * <p>The interface example interface.</p>
 * @param <I> {@link java.lang.Object} <p>The parameter can be of any type.</p>
 * @param <E> {@link io.github.nichetoolkit.example.InterfaceExample} <p>The generic parameter is <code>InterfaceExample</code> type.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see java.io.Serializable
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>The interface example interface has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public interface InterfaceExample<I,E extends InterfaceExample<I,E>> extends Serializable {
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
     * <p>The get interface field getter method.</p>
     * @return {@link java.lang.String} <p>The get interface field return object is <code>String</code> type.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonValue
     * @see org.springframework.lang.NonNull
     */
    @JsonValue
    @NonNull
    String getInterfaceField();

    /**
     * <code>setInterfaceField</code>
     * <p>The set interface field setter method.</p>
     * @param interfaceField {@link java.lang.String} <p>The interface field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     * @see org.springframework.lang.NonNull
     * @see com.fasterxml.jackson.annotation.JsonCreator
     */
    @JsonCreator
    void setInterfaceField(@NonNull String interfaceField);

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
    default String[] methodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
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
    default void voidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {}

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
    default int[] methodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
        return new int[0];
    }

}
```

# Enum Example

-  Code

```java
package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestKey;

import java.util.Optional;

@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public enum EnumExample implements RestKey<String> {
    CASE1("case1"),
    CASE2("case2"),
    ;

    @JsonIgnore
    private static final String ENUM_FIELD_EXAMPLE = "ENUM_FIELD_EXAMPLE";

    private final String key;

    EnumExample(String key) {
        this.key = key;
    }

    @JsonValue
    @Override
    public String getKey() {
        return this.key;
    }

    @JsonCreator
    public static EnumExample parseKey(String key) {
        EnumExample enumExample = RestKey.parseKey(EnumExample.class, key);
        return Optional.ofNullable(enumExample).orElse(CASE1);
    }

}
```

-  doc

```java
package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestKey;

import java.util.Optional;

/**
 * <code>EnumExample</code>
 * <p>The enum example enumeration.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see io.github.nichetoolkit.rest.RestKey
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>The enum example enumeration has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public enum EnumExample implements RestKey<String> {
    /**
     * <code>CASE1</code>
     * <p>The case 1 enum example field.</p>
     */
    CASE1("case1"),
    /**
     * <code>CASE2</code>
     * <p>The case 2 enum example field.</p>
     */
    CASE2("case2"),
    ;

    /**
     * <code>ENUM_FIELD_EXAMPLE</code>
     * {@link java.lang.String} <p>The constant <code>ENUM_FIELD_EXAMPLE</code> field.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonIgnore
     */
    @JsonIgnore
    private static final String ENUM_FIELD_EXAMPLE = "ENUM_FIELD_EXAMPLE";

    /**
     * <code>key</code>
     * {@link java.lang.String} <p>The <code>key</code> field.</p>
     * @see java.lang.String
     */
    private final String key;

    /**
     * <code>EnumExample</code>
     * <p>Instantiates a new enum example.</p>
     * @param key {@link java.lang.String} <p>The key parameter is <code>String</code> type.</p>
     * @see java.lang.String
     */
    EnumExample(String key) {
        this.key = key;
    }

    @JsonValue
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * <code>parseKey</code>
     * <p>The parse key method.</p>
     * @param key {@link java.lang.String} <p>The key parameter is <code>String</code> type.</p>
     * @return {@link io.github.nichetoolkit.example.EnumExample} <p>The parse key return object is <code>EnumExample</code> type.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonCreator
     */
    @JsonCreator
    public static EnumExample parseKey(String key) {
        EnumExample enumExample = RestKey.parseKey(EnumExample.class, key);
        return Optional.ofNullable(enumExample).orElse(CASE1);
    }

}
```

# Class Example

-  Code

```java
package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestException;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;

@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public class ClassExample<I, E extends ClassExample<I, E>> implements Serializable {
    @JsonIgnore
    public static final String CLASS_FIELD_EXAMPLE = "CLASS_FIELD_EXAMPLE";

    private String classField;

    public ClassExample() {
    }

    public ClassExample(String classField) {
        this.classField = classField;
    }

    @JsonValue
    @NonNull
    public String getClassField() {
        return this.classField;
    }

    @JsonCreator
    public void setClassField(@NonNull String classField) {
        this.classField = classField;
    }

    @NonNull
    public String[] methodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
        return new String[0];
    }

    @Deprecated
    public void voidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {
    }

    @NonNull
    public int[] methodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
        return new int[0];
    }

}
```

-  doc

```java
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
```
