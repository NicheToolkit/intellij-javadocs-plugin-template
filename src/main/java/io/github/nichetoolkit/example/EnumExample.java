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
