
# The IDEA Javadoc Plugin Template

Intellij-Javadocs: https://tsergey.github.io/intellij-javadocs/

Intellij-Javadocs Wiki: https://github.com/tsergey/intellij-javadocs/wiki

## About Javadoc API Link

Javadoc-Templates: https://github.com/TSergey/intellij-javadocs/wiki/Javadoc-templates

Freemarker-Library v2.3.23: http://freemarker.incubator.apache.org/docs/ref_builtins.html

Intellij-Community Psi-Api Source:  https://github.com/JetBrains/intellij-community/tree/master/java/java-psi-api


## Javadoc Plugin Jar/Xml Uses

>1、 use `intellij-javadocs.jar` replace `C:\Users\user\AppData\Roaming\JetBrains\IntelliJIdea2024.x\plugins\intellij-javadocs\lib\intellij-javadocs-x.x.x.jar` to set all project default config
>
>2、 use `intellij-javadocs.xml` replace `\projectPath\.idea\intellij-javadocs-x.x.x.xml` to set the project config


## Javadoc Plugin Settings Keymap

<!-- 接口 检测模板 -->

### Keymap Settings Notes

> set keymap use `ctrl`+`alt`+`/` replace `shift`+`ctrl`+`alt`+`G` to generate javadocs for all elements
> 
> set keymap use `ctrl`+`alt`+`\` replace `shift`+`ctrl`+`alt`+`Z` to remove javadocs for all elements
>


## Javadoc Plugin Examples

### Interface Example

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
public interface TheInterfaceExample<I,E extends TheInterfaceExample<I,E>> extends Serializable {
    @JsonIgnore
    String INTERFACE_FIELD_EXAMPLE = "INTERFACE_FIELD_EXAMPLE";

    @JsonValue
    @NonNull
    String getInterfaceField();

    @JsonCreator
    void setInterfaceField(@NonNull String interfaceField);

    @NonNull
    default String[] theMethodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
        return new String[0];
    }

    @Deprecated
    default void theVoidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {}

    @NonNull
    default int[] theMethodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
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

```

### Enum Example

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
public enum TheEnumExample implements RestKey<String> {
    CASE1("case1"),
    CASE2("case2"),
    ;

    @JsonIgnore
    private static final String ENUM_FIELD_EXAMPLE = "ENUM_FIELD_EXAMPLE";
    
    private final String key;

    TheEnumExample(String key) {
        this.key = key;
    }

    @JsonValue
    @Override
    public String getKey() {
        return this.key;
    }

    @JsonCreator
    public static TheEnumExample parseKey(String key) {
        TheEnumExample enumExample = RestKey.parseKey(TheEnumExample.class, key);
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

```

### Class Example

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
public class TheClassExample<I, E extends TheClassExample<I, E>> implements Serializable {
    @JsonIgnore
    public static final String CLASS_FIELD_EXAMPLE = "CLASS_FIELD_EXAMPLE";

    private String classField;

    public TheClassExample() {
    }

    public TheClassExample(String classField) {
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
    public String[] theMethodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
        return new String[0];
    }

    @Deprecated
    public void theVoidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {
    }

    @NonNull
    public int[] theMethodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
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
 * <code>TheClassExample</code>
 * <p>The type the class example class.</p>
 * @param <I> {@link java.lang.Object} <p>The parameter can be of any type.</p>
 * @param <E> {@link io.github.nichetoolkit.example.TheClassExample} <p>The generic parameter is <code>TheClassExample</code> type.</p>
 * @author Cyan (snow22314@outlook.com)
 * @see java.io.Serializable
 * @see java.lang.Deprecated
 * @see java.lang.SuppressWarnings
 * @since Jdk1.8
 * @deprecated <p>The the class example class has be deprecated.</p>
 */
@Deprecated
@SuppressWarnings({"UnnecessaryParentheses", "unused"})
public class TheClassExample<I, E extends TheClassExample<I, E>> implements Serializable {
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
     * <code>TheClassExample</code>
     * <p>Instantiates a new the class example.</p>
     */
    public TheClassExample() {
    }

    /**
     * <code>TheClassExample</code>
     * <p>Instantiates a new the class example.</p>
     * @param classField {@link java.lang.String} <p>The class field parameter is <code>String</code> type.</p>
     * @see java.lang.String
     */
    public TheClassExample(String classField) {
        this.classField = classField;
    }

    /**
     * <code>getClassField</code>
     * <p>The class field getter method.</p>
     * @return {@link java.lang.String} <p>The class field return object is <code>String</code> type.</p>
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
     * <p>The class field setter method.</p>
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
    public String[] theMethodExample(@Nullable Integer param1, @NonNull String param2, @NonNull String param3) throws RestException {
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
    public void theVoidMethodExample(@Nullable Integer param1, @NonNull String... params) throws RestException {
    }

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
    public int[] theMethodExample(@Nullable Integer param1, @NonNull int... params) throws RestException {
        return new int[0];
    }

}

```

## Javadoc Plugin Settings Templates

### Class Level

<!-- 接口 检测模板 -->
#### Interface Template

- Regexp
```regexp
^.*(public|protected|private)*.+interface\s+\w+.*
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>The type ${name?lower_case} interface.</p>\n
 * \n
 <#-- the interface deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} interface has be deprecated.</p>\n
</#if> 
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the class see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign classSees = trim(element.qualifiedName)> 
 * \n
<#-- the interface generic parameter types -->
<#if element.typeParameters?has_content>
    <#list element.typeParameters as parameter>
        * @param <${parameter.name}> 
        <#if parameter.extendsListTypes?has_content>
            <#list parameter.extendsListTypes as extendType>
                <#assign rawType = extendType.rawType()> 
                <#assign presentableName = trim(rawType.getPresentableText(false))> 
                <#assign canonicalName = trim(rawType.getCanonicalText(false))> 
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>The generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !classSees?contains(canonicalName)> 
                    <#assign classSees = classSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>The parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n  
<#-- the interface extends class types-->
<#if element.extendsListTypes?has_content>
    <#list element.extendsListTypes as extendType>
        <#assign canonicalName = trim(extendType.rawType().getCanonicalText(false))>        
        <#if !classSees?contains(canonicalName)> 
            <#assign classSees = classSees + canonicalName>                  
            * @see ${canonicalName} \n
        </#if>
    </#list>    
</#if>
 * \n
<#-- the interface annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>        
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !classSees?contains(qualifiedName)> 
            <#assign classSees = classSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
 * \n 
 * @author Cyan (snow22314@outlook.com) \n
 * @since Jdk1.8 \n
 */
```

<!-- 枚举 检测模板 -->
#### Enum Template

- Regexp
```regexp
^.*(public|protected|private)*.+enum\s+\w+.*
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>The type ${name?lower_case} enumeration.</p>\n
 * \n
 <#-- the enumeration deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} enumeration has be deprecated.</p>\n
</#if>
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the class see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign classSees = trim(element.qualifiedName)> 
 * \n
<#-- the enumeration implements interface types-->
<#if element.implementsListTypes?has_content>
    <#list element.implementsListTypes as implementType>
        <#assign canonicalName = trim(implementType.rawType().getCanonicalText(false))>
        <#if !classSees?contains(canonicalName)> 
            <#assign classSees = classSees + canonicalName>                  
            * @see ${canonicalName} \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the enumeration annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>        
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !classSees?contains(qualifiedName)> 
            <#assign classSees = classSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
 * \n 
 * @author Cyan (snow22314@outlook.com) \n
 * @since Jdk1.8 \n
 */
```

<!-- 类检测模板 -->
#### Class Template

- Regexp
```regexp
^.*(public|protected|private)*.+class\s+\w+.*
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>The type ${name?lower_case} class.</p>\n
 * \n
 <#-- the class deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} class has be deprecated.</p>\n
</#if> 
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the class see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign classSees = trim(element.qualifiedName)> 
 * \n
<#-- the class generic parameter types -->
<#if element.typeParameters?has_content>
    <#list element.typeParameters as parameter>
        * @param <${parameter.name}> 
        <#if parameter.extendsListTypes?has_content>
            <#list parameter.extendsListTypes as extendType>
                <#assign rawType = extendType.rawType()> 
                <#assign presentableName = trim(rawType.getPresentableText(false))> 
                <#assign canonicalName = trim(rawType.getCanonicalText(false))> 
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>The generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !classSees?contains(canonicalName)> 
                    <#assign classSees = classSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>The parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n  
<#-- the class extends class types-->
<#if element.extendsListTypes?has_content>
    <#list element.extendsListTypes as extendType>
        <#assign canonicalName = trim(extendType.rawType().getCanonicalText(false))>        
        <#if !classSees?contains(canonicalName)> 
            <#assign classSees = classSees + canonicalName>                  
            * @see ${canonicalName} \n
        </#if>
    </#list>    
</#if>
 * \n
<#-- the class implements interface types-->
<#if element.implementsListTypes?has_content>
    <#list element.implementsListTypes as implementType>
        <#assign canonicalName = trim(implementType.rawType().getCanonicalText(false))>
        <#if !classSees?contains(canonicalName)> 
            <#assign classSees = classSees + canonicalName>                  
            * @see ${canonicalName} \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the class annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>        
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !classSees?contains(qualifiedName)> 
            <#assign classSees = classSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
 * \n 
 * @author Cyan (snow22314@outlook.com) \n
 * @since Jdk1.8 \n
 */
```

<!-- 其他检测模板 -->
#### Other Template

- Regexp
```regexp
.+
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 <#if element.isInterface()>
    * <p>The type ${name?lower_case} interface.</p>\n
 <#elseif element.isEnum()>
    * <p>The type ${name?lower_case} enumeration.</p>\n
 <#else>
 * <p>The type ${name?lower_case}.</p>\n
 </#if>
 * \n
 <#-- the class deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} class has be deprecated.</p>\n
</#if> 
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the class see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign classSees = trim(element.qualifiedName)> 
 * \n
<#-- the class generic parameter types -->
<#if element.typeParameters?has_content>
    <#list element.typeParameters as parameter>
        * @param <${parameter.name}> 
        <#if parameter.extendsListTypes?has_content>
            <#list parameter.extendsListTypes as extendType>
                <#assign rawType = extendType.rawType()> 
                <#assign presentableName = trim(rawType.getPresentableText(false))> 
                <#assign canonicalName = trim(rawType.getCanonicalText(false))> 
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>The generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !classSees?contains(canonicalName)> 
                    <#assign classSees = classSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>The parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n  
<#-- the class extends class types-->
<#if element.extendsListTypes?has_content>
    <#list element.extendsListTypes as extendType>
        <#assign canonicalName = trim(extendType.rawType().getCanonicalText(false))>        
        <#if !classSees?contains(canonicalName)> 
            <#assign classSees = classSees + canonicalName>                  
            * @see ${canonicalName} \n
        </#if>
    </#list>    
</#if>
 * \n
<#-- the class implements interface types-->
<#if element.implementsListTypes?has_content>
    <#list element.implementsListTypes as implementType>
        <#assign canonicalName = trim(implementType.rawType().getCanonicalText(false))>
        <#if !classSees?contains(canonicalName)> 
            <#assign classSees = classSees + canonicalName>                  
            * @see ${canonicalName} \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the class annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>        
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !classSees?contains(qualifiedName)> 
            <#assign classSees = classSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
 * \n 
 * @author Cyan (snow22314@outlook.com) \n
 * @since Jdk1.8 \n
 */
```

### Constructor Level

- Regexp
```regexp
.+
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>Instantiates a new ${name?lower_case}.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} method has be deprecated.</p>\n
</#if>
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the method see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign methodSees = trim(element.parent.qualifiedName)> 
 * \n
<#-- the method parameters --> 
<#if element.parameterList.parameters?has_content>
    <#list element.parameterList.parameters as parameter>
        <#assign parameterType = parameter.type>
        <#assign presentableName = trim(parameterType.getPresentableText(false))>
        <#assign canonicalName = trim(parameterType.getCanonicalText(false))>         
        * @param ${parameter.name} 
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>The ${paramNames[parameter.name]?lower_case} parameter is <code>${presentableName}</code> type.</p> \n
        <#if !methodSees?contains(canonicalName)> 
            <#assign methodSees = methodSees + canonicalName>
            <#if canonicalName?contains(".")>
                * @see ${canonicalName}  \n 
            </#if>
        </#if>
        <#-- the parameter annotation types -->
        <#if parameter.getAnnotations()?has_content>
            <#list parameter.getAnnotations() as annotation>
                <#assign qualifiedName = trim(annotation.qualifiedName)> 
                <#if !methodSees?contains(qualifiedName)> 
                    <#assign methodSees = methodSees + qualifiedName>        
                    * @see ${qualifiedName} \n
                </#if>
            </#list>
        </#if>
    </#list>
</#if>
 * \n
<#-- the method annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
* \n
<#-- the method throws exceptions -->
<#if element.throwsList.referenceElements?has_content> 
    <#list element.throwsList.referenceElements as exception>
        <#assign referenceName = trim(exception.referenceName)>
        <#assign qualifiedName = trim(exception.qualifiedName)>         
        * @throws ${referenceName}  
        <#if qualifiedName?contains(".")>
            {@link ${qualifiedName}}
        <#else> 
            ${qualifiedName}
        </#if>
         <p>The ${exceptionNames[referenceName]?lower_case} is <code>${referenceName}</code> type.</p> \n
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>   
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```

### Method Level

<!-- getter方法检测模板 -->
#### Getters Template

- Regexp
```regexp
^.*(public|protected|private)*\s*.*(\w(\s*<.+>)*)+\s+get\w+\s*\(.*\).+
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>The ${partName?lower_case} getter method.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} method has be deprecated.</p>\n
</#if>
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the method see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign methodSees = trim(element.parent.qualifiedName)> 
 * \n
<#-- the method generic type parameters --> 
<#if element.typeParameters?has_content>
    <#list element.typeParameters as parameter>
        * @param <${parameter.name}> 
        <#if parameter.extendsListTypes?has_content>
            <#list parameter.extendsListTypes as extendType>
                <#assign rawType = extendType.rawType()> 
                <#assign presentableName = trim(rawType.getPresentableText(false))> 
                <#assign canonicalName = trim(rawType.getCanonicalText(false))>  
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>The generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !methodSees?contains(canonicalName)> 
                    <#assign methodSees = methodSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>The parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the method parameters --> 
<#if element.parameterList.parameters?has_content>
    <#list element.parameterList.parameters as parameter>
        <#assign parameterType = parameter.type>
        <#assign presentableName = trim(parameterType.getPresentableText(false))>
        <#assign canonicalName = trim(parameterType.getCanonicalText(false))>         
        * @param ${parameter.name}  
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>The ${paramNames[parameter.name]?lower_case} parameter is <code>${presentableName}</code> type.</p> \n
        <#if !methodSees?contains(canonicalName)> 
            <#assign methodSees = methodSees + canonicalName>
            <#if canonicalName?contains(".")>
                * @see ${canonicalName}  \n 
            </#if>
        </#if>
        <#-- the parameter annotation types -->
        <#if parameter.getAnnotations()?has_content>
            <#list parameter.getAnnotations() as annotation>
                <#assign qualifiedName = trim(annotation.qualifiedName)> 
                <#if !methodSees?contains(qualifiedName)> 
                    <#assign methodSees = methodSees + qualifiedName>        
                    * @see ${qualifiedName} \n
                </#if>
            </#list>
        </#if>
    </#list>
</#if>
 * \n
<#-- the method return type -->
<#if isNotVoid>
    <#assign returnType = element.returnType> 
    <#assign presentableName = trim(returnType.getPresentableText(false))>
    <#assign canonicalName = trim(returnType.getCanonicalText(false))>
    * @return 
    <#if canonicalName?contains(".")>
        {@link ${canonicalName}}
    <#else> 
        ${canonicalName}
    </#if>
     <p>The ${partName?lower_case} return object is <code>${presentableName}</code> type.</p> \n
    <#if !methodSees?contains(canonicalName)> 
        <#assign methodSees = methodSees + canonicalName>  
        <#if canonicalName?contains(".")>
            * @see ${canonicalName} \n
        </#if>
    </#if>
</#if>
 * \n
<#-- the method annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
* \n
<#-- the method throws exceptions -->
<#if element.throwsList.referenceElements?has_content> 
    <#list element.throwsList.referenceElements as exception>
        <#assign referenceName = trim(exception.referenceName)>
        <#assign qualifiedName = trim(exception.qualifiedName)>         
        * @throws ${referenceName}                 
        <#if qualifiedName?contains(".")>
            {@link ${qualifiedName}}
        <#else> 
            ${qualifiedName}
        </#if>
         <p>The ${exceptionNames[referenceName]?lower_case} is <code>${referenceName}</code> type.</p> \n
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>   
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```

<!-- setter方法检测模板 -->
#### Setters Template

- Regexp
```regexp
^.*(public|protected|private)*\s*.*(void|\w(\s*<.+>)*)+\s+set\w+\s*\(.*\).+
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>The ${partName?lower_case} setter method.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} method has be deprecated.</p>\n
</#if>
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the method see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign methodSees = trim(element.parent.qualifiedName)> 
 * \n
<#-- the method generic type parameters --> 
<#if element.typeParameters?has_content>
    <#list element.typeParameters as parameter>
        * @param <${parameter.name}> 
        <#if parameter.extendsListTypes?has_content>
            <#list parameter.extendsListTypes as extendType>
                <#assign rawType = extendType.rawType()> 
                <#assign presentableName = trim(rawType.getPresentableText(false))> 
                <#assign canonicalName = trim(rawType.getCanonicalText(false))>  
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>The generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !methodSees?contains(canonicalName)> 
                    <#assign methodSees = methodSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>The parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the method parameters --> 
<#if element.parameterList.parameters?has_content>
    <#list element.parameterList.parameters as parameter>
        <#assign parameterType = parameter.type>
        <#assign presentableName = trim(parameterType.getPresentableText(false))>
        <#assign canonicalName = trim(parameterType.getCanonicalText(false))>         
        * @param ${parameter.name} 
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>The ${paramNames[parameter.name]?lower_case} parameter is <code>${presentableName}</code> type.</p> \n
        <#if !methodSees?contains(canonicalName)> 
            <#assign methodSees = methodSees + canonicalName>
            <#if canonicalName?contains(".")>
                * @see ${canonicalName}  \n 
            </#if>
        </#if>
        <#-- the parameter annotation types -->
        <#if parameter.getAnnotations()?has_content>
            <#list parameter.getAnnotations() as annotation>
                <#assign qualifiedName = trim(annotation.qualifiedName)> 
                <#if !methodSees?contains(qualifiedName)> 
                    <#assign methodSees = methodSees + qualifiedName>        
                    * @see ${qualifiedName} \n
                </#if>
            </#list>
        </#if>
    </#list>
</#if>
 * \n
<#-- the method return type -->
<#if isNotVoid>
    <#assign returnType = element.returnType> 
    <#assign presentableName = trim(returnType.getPresentableText(false))>
    <#assign canonicalName = trim(returnType.getCanonicalText(false))>
    * @return 
    <#if canonicalName?contains(".")>
        {@link ${canonicalName}}
    <#else> 
        ${canonicalName}
    </#if>
     <p>The ${partName?lower_case} return object is <code>${presentableName}</code> type.</p> \n
    <#if !methodSees?contains(canonicalName)> 
        <#assign methodSees = methodSees + canonicalName>  
        <#if canonicalName?contains(".")>
            * @see ${canonicalName} \n
        </#if>
    </#if>
</#if>
 * \n
<#-- the method annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
* \n
<#-- the method throws exceptions -->
<#if element.throwsList.referenceElements?has_content> 
    <#list element.throwsList.referenceElements as exception>
        <#assign referenceName = trim(exception.referenceName)>
        <#assign qualifiedName = trim(exception.qualifiedName)>         
        * @throws ${referenceName} 
        <#if qualifiedName?contains(".")>
            {@link ${qualifiedName}}
        <#else> 
            ${qualifiedName}
        </#if>
         <p>The ${exceptionNames[referenceName]?lower_case} is <code>${referenceName}</code> type.</p> \n
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>   
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```

<!-- main方法检测模板 -->
#### Main Template

- Regexp
```regexp
^.*((public\s+static)|(static\s+public))\s+void\s+main\s*\(\s*String\s*(\[\s*\]|\.\.\.)\s+\w+\s*\).+
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>The entry point of application.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} method has be deprecated.</p>\n
</#if>
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the method see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign methodSees = trim(element.parent.qualifiedName)> 
 * \n
<#-- the method parameters -->
<#if element.parameterList.parameters?has_content>
    * @param ${element.parameterList.parameters[0].name} {@link java.lang.String} <p>The input arguments.</p>\n
    * @see java.lang.String  \n 
</#if>   
 * \n
<#-- the method annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
* \n
<#-- the method throws exceptions -->
<#if element.throwsList.referenceElements?has_content> 
    <#list element.throwsList.referenceElements as exception>
        <#assign referenceName = trim(exception.referenceName)>
        <#assign qualifiedName = trim(exception.qualifiedName)>         
        * @throws ${referenceName} 
        <#if qualifiedName?contains(".")>
            {@link ${qualifiedName}}
        <#else> 
            ${qualifiedName}
        </#if>
         <p>The ${exceptionNames[referenceName]?lower_case} is <code>${referenceName}</code> type.</p> \n
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>   
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```


<!-- other方法检测模板 -->
#### Other Template

- Regexp
```regexp
.+
```
- Template
```java
/**\n
 * <code>${element.name}</code>\n
 * <p>The ${partName?lower_case} method.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>The ${name?lower_case} method has be deprecated.</p>\n
</#if>
 * \n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the method see global variable --> 
<#-- the value of default is the method parent class qualified name --> 
<#assign methodSees = trim(element.parent.qualifiedName)> 
 * \n
<#-- the method generic type parameters --> 
<#if element.typeParameters?has_content>
    <#list element.typeParameters as parameter>
        * @param <${parameter.name}> 
        <#if parameter.extendsListTypes?has_content>
            <#list parameter.extendsListTypes as extendType>
                <#assign rawType = extendType.rawType()>
                <#assign presentableName = trim(rawType.getPresentableText(false))>
                <#assign canonicalName = trim(rawType.getCanonicalText(false))>  
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>The generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !methodSees?contains(canonicalName)> 
                    <#assign methodSees = methodSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>The parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the method parameters --> 
<#if element.parameterList.parameters?has_content>
    <#list element.parameterList.parameters as parameter>
        <#assign parameterType = parameter.type>
        <#assign presentableName = trim(parameterType.getPresentableText(false))>
        <#assign canonicalName = trim(parameterType.getCanonicalText(false))>         
        * @param ${parameter.name} 
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>The ${paramNames[parameter.name]?lower_case} parameter is <code>${presentableName}</code> type.</p> \n
        <#if !methodSees?contains(canonicalName)> 
            <#assign methodSees = methodSees + canonicalName>
            <#if canonicalName?contains(".")>
                * @see ${canonicalName}  \n 
            </#if>
        </#if>
        <#-- the parameter annotation types -->
        <#if parameter.getAnnotations()?has_content>
            <#list parameter.getAnnotations() as annotation>
                <#assign qualifiedName = trim(annotation.qualifiedName)> 
                <#if !methodSees?contains(qualifiedName)> 
                    <#assign methodSees = methodSees + qualifiedName>        
                    * @see ${qualifiedName} \n
                </#if>
            </#list>
        </#if>
    </#list>
</#if>
 * \n
<#-- the method return type -->
<#if isNotVoid>
    <#assign returnType = element.returnType> 
    <#assign presentableName = trim(returnType.getPresentableText(false))>
    <#assign canonicalName = trim(returnType.getCanonicalText(false))>
    * @return 
    <#if canonicalName?contains(".")>
        {@link ${canonicalName}}
    <#else> 
        ${canonicalName}
    </#if>
     <p>The ${partName?lower_case} return object is <code>${presentableName}</code> type.</p> \n
    <#if !methodSees?contains(canonicalName)> 
        <#assign methodSees = methodSees + canonicalName>  
        <#if canonicalName?contains(".")>
            * @see ${canonicalName} \n
        </#if>
    </#if>
</#if>
 * \n
<#-- the method annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>            
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
* \n
<#-- the method throws exceptions -->
<#if element.throwsList.referenceElements?has_content> 
    <#list element.throwsList.referenceElements as exception>
        <#assign referenceName = trim(exception.referenceName)>
        <#assign qualifiedName = trim(exception.qualifiedName)>         
        * @throws ${referenceName} 
        <#if qualifiedName?contains(".")>
            {@link ${qualifiedName}}
        <#else> 
            ${qualifiedName}
        </#if>
         <p>The ${exceptionNames[referenceName]?lower_case} is <code>${referenceName}</code> type.</p> \n
        <#if !methodSees?contains(qualifiedName)> 
            <#assign methodSees = methodSees + qualifiedName>   
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```

### Field Level

<!-- static字段检测模板 -->
#### Static Template

- Regexp
```regexp
^.*(public|protected|private)*.+static.*(\w\s\w)+.+
```
- Template
```java
/**\n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the field see global variable --> 
<#-- the value of default is the field parent class qualified name --> 
<#assign fieldSees = trim(element.parent.qualifiedName)> 
 * \n
<#assign fieldType = element.type> 
<#assign canonicalName = trim(fieldType.getCanonicalText(false))>
 * <code>${element.name}</code>\n
<#if canonicalName?contains(".")>
    * {@link ${canonicalName}} <p>The constant <code>${element.name}</code> field.</p>\n
<#else> 
    * <p>The constant <code>${element.name}</code> field.</p>\n
</#if>
 * \n
 <#-- the field deprecated annotation --> 
<#if element.isDeprecated()>
    * @deprecated <p>The <code>${element.name}</code> field has be deprecated.</p>\n
</#if>
 * \n 
<#-- the field type --> 
<#if !fieldSees?contains(canonicalName)> 
    <#assign fieldSees = fieldSees + canonicalName>
    <#if canonicalName?contains(".")>
        * @see ${canonicalName}  \n 
    </#if>
</#if>          
 * \n
<#-- the field annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !fieldSees?contains(qualifiedName)> 
            <#assign fieldSees = fieldSees + qualifiedName>        
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```


<!-- 字段检测模板 -->
#### Interface Field Template

- Regexp
```regexp
^.*(public|protected|private)*.*(\w\s\w)+.+
```
- Template
```java
/**\n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the field see global variable --> 
<#-- the value of default is the field parent class qualified name --> 
<#assign fieldSees = trim(element.parent.qualifiedName)> 
 * \n
<#assign fieldType = element.type> 
<#assign canonicalName = trim(fieldType.getCanonicalText(false))>
 * <code>${element.name}</code>\n
<#if element.parent.isInterface()>
    <#if canonicalName?contains(".")>
        * {@link ${canonicalName}} <p>The constant <code>${element.name}</code> field.</p>\n
    <#else> 
        * <p>The constant <code>${element.name}</code> field.</p>\n
    </#if>
 <#else>
    <#if canonicalName?contains(".")>
        * {@link ${canonicalName}} <p>The <code>${element.name}</code> field.</p>\n
    <#else> 
        * <p>The <code>${element.name}</code> field.</p>\n
    </#if>
 </#if>
 * \n
 <#-- the field deprecated annotation --> 
<#if element.isDeprecated()>
    * @deprecated <p>The <code>${element.name}</code> field has be deprecated.</p>\n
</#if>
 * \n 
<#-- the field type --> 
<#if !fieldSees?contains(canonicalName)> 
    <#assign fieldSees = fieldSees + canonicalName>
    <#if canonicalName?contains(".")>
        * @see ${canonicalName}  \n 
    </#if>
</#if>          
 * \n
<#-- the field annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !fieldSees?contains(qualifiedName)> 
            <#assign fieldSees = fieldSees + qualifiedName>        
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```


<!-- 字段检测模板 -->
#### Enum Field Template

- Regexp
```regexp
.+
```
- Template
```java
/**\n
<#-- the trim function is to trim the string of name --> 
<#function trim name>
    <#if name?contains("<")>
        <#return name?keep_before("<")>
    <#elseif name?contains("[")>
        <#return name?keep_before("[")>
    <#elseif name?contains("...")>
        <#return name?keep_before("...")>    
    <#else>
        <#return name>
    </#if>
</#function>
 * \n
<#-- the field see global variable --> 
<#-- the value of default is the field parent class qualified name --> 
<#assign fieldSees = trim(element.parent.qualifiedName)> 
 * \n
<#assign fieldType = element.type> 
<#assign canonicalName = trim(fieldType.getCanonicalText(false))>
 * <code>${element.name}</code>\n
 <#if element.parent.isInterface()>
    <#if canonicalName?contains(".")>
        * {@link ${canonicalName}} <p>The constant <code>${element.name}</code> field.</p>\n
    <#else> 
        * <p>The constant <code>${element.name}</code> field.</p>\n
    </#if> 
 <#elseif element.parent.isEnum()>
    * <p>The ${name?lower_case} ${typeName?lower_case} field.</p>\n
 <#else>
    * <p>The ${name?lower_case} field.</p>\n 
 </#if>
 * \n
 <#-- the field deprecated annotation --> 
<#if element.isDeprecated()>
    * @deprecated <p>The <code>${element.name}</code> field has be deprecated.</p>\n
</#if>
 * \n
<#-- the field type --> 
<#if !fieldSees?contains(canonicalName)> 
    <#assign fieldSees = fieldSees + canonicalName>
    <#if canonicalName?contains(".")>
        * @see ${canonicalName}  \n 
    </#if>
</#if>          
 * \n
<#-- the field annotation types -->
<#if element.getAnnotations()?has_content>
    <#list element.getAnnotations() as annotation>
        <#assign qualifiedName = trim(annotation.qualifiedName)> 
        <#if !fieldSees?contains(qualifiedName)> 
            <#assign fieldSees = fieldSees + qualifiedName>        
            * @see ${qualifiedName} \n
        </#if>
    </#list>
</#if>
*/
```