
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
    * @deprecated <p>the ${element.name} interface has be deprecated.</p>\n
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
                <#assign presentableName = trim(rawType.presentableText)> 
                <#assign canonicalName = trim(rawType.canonicalText)> 
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>the generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !classSees?contains(canonicalName)> 
                    <#assign classSees = classSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>the parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n  
<#-- the interface extends class types-->
<#if element.extendsListTypes?has_content>
    <#list element.extendsListTypes as extendType>
        <#assign canonicalName = trim(extendType.rawType().canonicalText)>        
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
    * @deprecated <p>the ${element.name} enumeration has be deprecated.</p>\n
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
        <#assign canonicalName = trim(implementType.rawType().canonicalText)>
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
    * @deprecated <p>the ${element.name} class has be deprecated.</p>\n
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
                <#assign presentableName = trim(rawType.presentableText)> 
                <#assign canonicalName = trim(rawType.canonicalText)> 
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>the generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !classSees?contains(canonicalName)> 
                    <#assign classSees = classSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>the parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n  
<#-- the class extends class types-->
<#if element.extendsListTypes?has_content>
    <#list element.extendsListTypes as extendType>
        <#assign canonicalName = trim(extendType.rawType().canonicalText)>        
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
        <#assign canonicalName = trim(implementType.rawType().canonicalText)>
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
    * @deprecated <p>the ${element.name} class has be deprecated.</p>\n
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
                <#assign presentableName = trim(rawType.presentableText)> 
                <#assign canonicalName = trim(rawType.canonicalText)> 
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>the generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !classSees?contains(canonicalName)> 
                    <#assign classSees = classSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>the parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n  
<#-- the class extends class types-->
<#if element.extendsListTypes?has_content>
    <#list element.extendsListTypes as extendType>
        <#assign canonicalName = trim(extendType.rawType().canonicalText)>        
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
        <#assign canonicalName = trim(implementType.rawType().canonicalText)>
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
 * Instantiates a new ${name?lower_case}.\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>the ${element.name} method has be deprecated.</p>\n
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
        <#assign presentableName = trim(parameterType.presentableText)>
        <#assign canonicalName = trim(parameterType.canonicalText)>         
        * @param ${parameter.name} 
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>the ${paramNames[parameter.name]} parameter is <code>${presentableName}</code> type.</p> \n
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
         <p>the ${exceptionNames[referenceName]} is <code>${referenceName}</code> type.</p> \n
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
 * <p>the ${partName?lower_case} getter method.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>the ${element.name} method has be deprecated.</p>\n
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
                <#assign presentableName = trim(rawType.presentableText)> 
                <#assign canonicalName = trim(rawType.canonicalText)>  
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>the generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !methodSees?contains(canonicalName)> 
                    <#assign methodSees = methodSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>the parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the method parameters --> 
<#if element.parameterList.parameters?has_content>
    <#list element.parameterList.parameters as parameter>
        <#assign parameterType = parameter.type>
        <#assign presentableName = trim(parameterType.presentableText)>
        <#assign canonicalName = trim(parameterType.canonicalText)>         
        * @param ${parameter.name}  
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>the ${paramNames[parameter.name]} parameter is <code>${presentableName}</code> type.</p> \n
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
    <#assign presentableName = trim(returnType.presentableText)>
    <#assign canonicalName = trim(returnType.canonicalText)>
    * @return 
    <#if canonicalName?contains(".")>
        {@link ${canonicalName}}
    <#else> 
        ${canonicalName}
    </#if>
     <p>the ${partName} return object is <code>${presentableName}</code> type.</p> \n
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
         <p>the ${exceptionNames[referenceName]} is <code>${referenceName}</code> type.</p> \n
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
 * <p>the ${partName?lower_case} setter method.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>the ${element.name} method has be deprecated.</p>\n
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
                <#assign presentableName = trim(rawType.presentableText)> 
                <#assign canonicalName = trim(rawType.canonicalText)>  
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>the generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !methodSees?contains(canonicalName)> 
                    <#assign methodSees = methodSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>the parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the method parameters --> 
<#if element.parameterList.parameters?has_content>
    <#list element.parameterList.parameters as parameter>
        <#assign parameterType = parameter.type>
        <#assign presentableName = trim(parameterType.presentableText)>
        <#assign canonicalName = trim(parameterType.canonicalText)>         
        * @param ${parameter.name} 
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>the ${paramNames[parameter.name]} parameter is <code>${presentableName}</code> type.</p> \n
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
    <#assign presentableName = trim(returnType.presentableText)>
    <#assign canonicalName = trim(returnType.canonicalText)>
    * @return 
    <#if canonicalName?contains(".")>
        {@link ${canonicalName}}
    <#else> 
        ${canonicalName}
    </#if>
     <p>the ${partName} return object is <code>${presentableName}</code> type.</p> \n
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
         <p>the ${exceptionNames[referenceName]} is <code>${referenceName}</code> type.</p> \n
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
    * @deprecated <p>the ${element.name} method has be deprecated.</p>\n
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
    * @param ${element.parameterList.parameters[0].name} {@link java.lang.String} <p>the input arguments.<p>\n
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
         <p>the ${exceptionNames[referenceName]} is <code>${referenceName}</code> type.</p> \n
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
 * <p>the ${partName?lower_case} method.</p>\n
 * \n
 <#-- the method deprecated annotation --> 
 <#if element.isDeprecated()>
    * @deprecated <p>the ${element.name} method has be deprecated.</p>\n
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
                <#assign presentableName = trim(rawType.presentableText)>
                <#assign canonicalName = trim(rawType.canonicalText)>  
                <#if canonicalName?contains(".")>
                    {@link ${canonicalName}}
                <#else> 
                    ${canonicalName}
                </#if>
                 <p>the generic parameter is <code>${presentableName}</code> type.</p> \n
                <#if !methodSees?contains(canonicalName)> 
                    <#assign methodSees = methodSees + canonicalName>
                    * @see ${canonicalName}  \n 
                </#if>
            </#list>
        <#else>
            {@link java.lang.Object} <p>the parameter can be of any type.</p> \n
        </#if>
    </#list>
</#if>
 * \n
<#-- the method parameters --> 
<#if element.parameterList.parameters?has_content>
    <#list element.parameterList.parameters as parameter>
        <#assign parameterType = parameter.type>
        <#assign presentableName = trim(parameterType.presentableText)>
        <#assign canonicalName = trim(parameterType.canonicalText)>         
        * @param ${parameter.name} 
        <#if canonicalName?contains(".")>
            {@link ${canonicalName}}
        <#else> 
            ${canonicalName}
        </#if>
         <p>the ${paramNames[parameter.name]} parameter is <code>${presentableName}</code> type.</p> \n
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
    <#assign presentableName = trim(returnType.presentableText)>
    <#assign canonicalName = trim(returnType.canonicalText)>
    * @return 
    <#if canonicalName?contains(".")>
        {@link ${canonicalName}}
    <#else> 
        ${canonicalName}
    </#if>
     <p>the ${partName} return object is <code>${presentableName}</code> type.</p> \n
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
         <p>the ${exceptionNames[referenceName]} is <code>${referenceName}</code> type.</p> \n
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
<#assign canonicalName = trim(fieldType.canonicalText)>
 * <code>${element.name}</code>\n
<#if canonicalName?contains(".")>
    * {@link ${canonicalName}} <p>the constant <code>${element.name}</code> field.</p>\n
<#else> 
    * <p>the constant <code>${element.name}</code> field.</p>\n
</#if>
 * \n
 <#-- the field deprecated annotation --> 
<#if element.isDeprecated()>
    * @deprecated <p>the <code>${element.name}</code> field has be deprecated.</p>\n
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
<#assign canonicalName = trim(fieldType.canonicalText)>
 * <code>${element.name}</code>\n
<#if element.parent.isInterface()>
    <#if canonicalName?contains(".")>
        * {@link ${canonicalName}} <p>the constant <code>${element.name}</code> field.</p>\n
    <#else> 
        * <p>the constant <code>${element.name}</code> field.</p>\n
    </#if>
 <#else>
    <#if canonicalName?contains(".")>
        * {@link ${canonicalName}} <p>the <code>${element.name}</code> field.</p>\n
    <#else> 
        * <p>the <code>${element.name}</code> field.</p>\n
    </#if>
 </#if>
 * \n
 <#-- the field deprecated annotation --> 
<#if element.isDeprecated()>
    * @deprecated <p>the <code>${element.name}</code> field has be deprecated.</p>\n
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
<#assign canonicalName = trim(fieldType.canonicalText)>
 * <code>${element.name}</code>\n
 <#if element.parent.isInterface()>
    <#if canonicalName?contains(".")>
        * {@link ${canonicalName}} <p>the constant <code>${element.name}</code> field.</p>\n
    <#else> 
        * <p>the constant <code>${element.name}</code> field.</p>\n
    </#if> 
 <#elseif element.parent.isEnum()>
    * <p>the ${name} ${typeName} field.</p>\n
 <#else>
    * <p>the ${name} field.</p>\n 
 </#if>
 * \n
 <#-- the field deprecated annotation --> 
<#if element.isDeprecated()>
    * @deprecated <p>the <code>${element.name}</code> field has be deprecated.</p>\n
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