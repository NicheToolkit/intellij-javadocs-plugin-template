package io.github.nichetoolkit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.nichetoolkit.rest.RestKey;

import java.util.Optional;

/**
 * <code>TheEnumExample</code>
 * <p>The type the enum example enumeration.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see io.github.nichetoolkit.rest.RestKey
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>The the enum example enumeration has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public enum TheEnumExample implements RestKey<String> {
    /**
     * <code>CASE1</code>
     * <p>The case 1 the enum example field.</p>
     */
    CASE1("case1"),
    /**
     * <code>CASE2</code>
     * <p>The case 2 the enum example field.</p>
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
     * <code>TheEnumExample</code>
     * <p>Instantiates a new the enum example.</p>
     * @param key {@link java.lang.String} <p>The key parameter is <code>String</code> type.</p>
     * @see java.lang.String
     */
    TheEnumExample(String key) {
        this.key = key;
    }

    @JsonValue
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * <code>parseKey</code>
     * <p>The key method.</p>
     * @param key {@link java.lang.String} <p>The key parameter is <code>String</code> type.</p>
     * @return {@link io.github.nichetoolkit.example.TheEnumExample} <p>The key return object is <code>TheEnumExample</code> type.</p>
     * @see java.lang.String
     * @see com.fasterxml.jackson.annotation.JsonCreator
     */
    @JsonCreator
    public static TheEnumExample parseKey(String key) {
        TheEnumExample enumExample = RestKey.parseKey(TheEnumExample.class, key);
        return Optional.ofNullable(enumExample).orElse(CASE1);
    }

}
