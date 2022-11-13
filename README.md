# Demo openApi generator mvn plugin

Little project to experience openApi generator maven plugin with specific configuration  
swagger annotations v3, springdoc, generating interface only and DTos + 1 provided DTO class  

### Run
```
mvn clean compile
```

Generated resources under target/generated-sources/openapi/src/gen/  

### Used config
```xml
<plugin>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-generator-maven-plugin</artifactId>
    <version>6.0.1</version>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <inputSpec>${project.basedir}/src/main/resources/petstore.yaml</inputSpec>
                <generatorName>spring</generatorName>
                <apiPackage>com.generated.api</apiPackage>
                <modelPackage>com.generated.model</modelPackage>
                <configOptions>
                    <library>spring-boot</library>
                    <oas3>true</oas3>
                    <sourceFolder>src/gen/java/</sourceFolder>
                    <useSpringfox>false</useSpringfox>
                    <interfaceOnly>true</interfaceOnly>
                    <skipDefaultInterface>true</skipDefaultInterface>
                </configOptions>
                <schemaMappings>
                    <schemaMapping>User=com.example.model.User</schemaMapping>
                </schemaMappings>
            </configuration>
        </execution>
    </executions>
</plugin>
```