<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.16</version>
        <relativePath /> <!-- lookup parent from repository -->
    </parent>
    <groupId>br.gov.caixa.sijur</groupId>
    <artifactId>SIJUR-middleware-backend-v2</artifactId>
    <version>2.0.0</version>
    <name>SIJUR-middleware-backend-v2</name>
    <description>Projeto SIJUR Middleware Versão 2.0</description>

    <properties>
        <jacoco-maven-plugin-artifactId>jacoco-maven-plugin</jacoco-maven-plugin-artifactId>
        <java.version>21</java.version>
        <spring-cloud.version>2025.0.3</spring-cloud.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-ldap</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.8.16</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
      	<dependency>
			<groupId>br.com.caixa.sijur</groupId>
			<artifactId>SIJUR-componentes</artifactId>
			<version>1.0.29</version>
		</dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.microsoft.sqlserver</groupId>
            <artifactId>mssql-jdbc</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>net.logstash.logback</groupId>
            <artifactId>logstash-logback-encoder</artifactId>
            <version>8.1</version>
        </dependency>

        <dependency>
            <groupId>org.modelmapper</groupId>
            <artifactId>modelmapper</artifactId>
            <version>3.2.6</version>
        </dependency>

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
        </dependency>

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-csv</artifactId>
            <version>1.14.1</version>
        </dependency>

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-collections4</artifactId>
            <version>4.5.0</version>
        </dependency>

        <dependency>
            <groupId>commons-codec</groupId>
            <artifactId>commons-codec</artifactId>
            <version>1.22.0</version><!--$NO-MVN-MAN-VER$-->
        </dependency>

        <dependency>
            <groupId>org.keycloak</groupId>
            <artifactId>keycloak-admin-client</artifactId>
            <version>26.0.9</version>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-inline</artifactId>
            <version>3.12.4</version>
            <scope>test</scope>
        </dependency>

		<dependency>
		  <groupId>br.com.caixa.sijur</groupId>
		  <artifactId>SIJUR-componentes</artifactId>
		  <version>1.0.25-SNAPSHOT</version>
		</dependency>
    </dependencies>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <finalName>${project.artifactId}</finalName>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.15</version>
                <executions>

                    <!-- Inicializa o agente -->
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>

                    <!-- Gera o relatório -->
                    <execution>
                        <id>post-unit-test</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>

                </executions>
                <configuration>
                    <append>true</append>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <executions>
                    <execution>
                        <id>default-compile</id>
                        <phase>compile</phase>
                        <goals>
                            <goal>compile</goal>
                        </goals>
                        <configuration>
                            <annotationProcessorPaths>
                                <path>
                                    <groupId>org.projectlombok</groupId>
                                    <artifactId>lombok</artifactId>
                                </path>
                                <path>
                                    <groupId>org.springframework.boot</groupId>
                                    <artifactId>
                                        spring-boot-configuration-processor</artifactId>
                                </path>
                            </annotationProcessorPaths>
                        </configuration>
                    </execution>
                    <execution>
                        <id>default-testCompile</id>
                        <phase>test-compile</phase>
                        <goals>
                            <goal>testCompile</goal>
                        </goals>
                        <configuration>
                            <annotationProcessorPaths>
                                <path>
                                    <groupId>org.projectlombok</groupId>
                                    <artifactId>lombok</artifactId>
                                </path>
                            </annotationProcessorPaths>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.5.6</version><!--$NO-MVN-MAN-VER$-->
                <configuration>
                    <properties>
                        <property>
                            <name>usedefaultlisteners</name>
                            <value>false</value> <!-- disabling default listeners
                            is optional -->
                        </property>
                    </properties>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.sonarsource.scanner.maven</groupId>
                <artifactId>sonar-maven-plugin</artifactId>
                <version>5.2.0.4988</version>
            </plugin>
        </plugins>
    </build>

</project>

application-des.yaml


server:
    port: 8080
    servlet:
        context-path: /SIJUR-middleware-backend-v2

#API Expediente config
#api.expediente.base.url=http://localhost:8080/SIJUR-api-expediente
api:
    expediente:
        client-id: cli-ser-jur
        base:
            url: https://sijur-api-expediente-des.apps.nprd.caixa/sijur-api-expediente        
        
spring:
  application:
    name: SIJUR-middleware-backend-v2
  mvc:
    pathmatch:
      matching-strategy: ANT_PATH_MATCHER  
  datasource:
    url: jdbc:sqlserver://caddedadnt027.extra.caixa.gov.br:20100;databaseName=JURDB001;encrypt=true;trustServerCertificate=true
    username: USR_SIJUR
    password: MB7EFP2
    driver-class-name: com.microsoft.sqlserver.jdbc.SQLServerDriver
    sijur:
      url: jdbc:sqlserver://caddedadnt027.extra.caixa.gov.br:20100;databaseName=SIJUR;encrypt=true;trustServerCertificate=true;sendStringParametersAsUnicode=false
      username: USR_SIJUR
      password: MB7EFP2
      driver-class-name: com.microsoft.sqlserver.jdbc.SQLServerDriver
  jpa:
    hibernate:
      ddl-auto: none
    show-sql: true
    properties:
      hibernate:
        "[hibernate.format_sql]": true
        "[jdbc.batch_size]": 10000
        "[order_inserts]": true
        "[order_updates]": true
        
  ldap:
    urls: ldap://Cxextrux071.desenvolvimento.extracaixa:1489
    base: o=caixa
    username: 
    password: 
  
sso:
  intranet:
    issuer-uri: https://login.des.caixa/auth/realms/intranet
    client-id: cli-ser-jur
    realm: intranet
  internet:
    issuer-uri: https://logindes.caixa.gov.br/auth/realms/internet
    client-id: cli-web-jur
    realm: internet

logging:
  level:
    DEBUG: DEBUG
    "[org.hibernate.SQL]": DEBUG
    ROOT: INFO      
  file:
    name: ${PATH_DESTINO:/sijur}/logs/SIJUR-middleware-backend-v2.log
  logback:
    rollingpolicy:
      max-file-size: 10MB
      max-history: 30
      file-name-pattern: ${PATH_DESTINO:/sijur}/logs/SIJUR-middleware-backend-v2-%d{yyyy-MM-dd_HH-mm}.%i.log
      total-size-cap: 500MB
 
management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus,loggers,logfile,env,beans,threaddump,heapdump
  endpoint:
    health:
      show-details: always
      probes:
        enabled: true
  health:
    livenessstate:
      enabled: true
    readinessstate:
      enabled: true
     
springdoc:
  show-actuator: true
        


        Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIJUR-middleware-backend-v2
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIJUR-middleware-backend-v2

.mvn
src
main
java
resources
META-INF
application-des.yaml
application.yaml
messages_pt_BR.properties
test
.gitattributes
.gitignore
mvnw
mvnw.cmd
pom.xml
README.md

2.0.0.56

/
src
/
main
/
resources
/
application-des.yaml
application-des.yaml

Edit

Contents
History
Compare
Blame

1234567891011121314151617181920212223242526272829303132333435363738394041424344
server:
    port: 8080
    servlet:
        context-path: /SIJUR-middleware-backend-v2

#API Expediente config
#api.expediente.base.url=http://localhost:8080/SIJUR-api-expediente
api:
    expediente:
        client-id: cli-ser-jur
…  health:
    livenessstate:
      enabled: true
    readinessstate:
      enabled: true
     
springdoc:
  show-actuator: true
        
        
