Starting: Maven
==============================================================================
Task         : Maven
Description  : Build, test, and deploy with Apache Maven
Version      : 3.225.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
==============================================================================
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
Maven home: /opt/apache-maven/apache-maven-3.8.5
Java version: 21.0.5, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-21.0.5
Default locale: pt_BR, platform encoding: UTF-8
OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/47/s/pom.xml clean package -U
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------< br.gov.br:simtx.arrecadacoes.barra >-----------------
[INFO] Building simtx.arrecadacoes.barra 1.0.0-SNAPSHOT
[INFO] ------------------------------[ quarkus ]-------------------------------
[WARNING] The artifact io.quarkus:quarkus-junit5:jar:3.33.2 has been relocated to io.quarkus:quarkus-junit:jar:3.33.2: Update the artifactId in your project build file. Refer to https://github.com/quarkusio/quarkus/wiki/Migration-Guide-3.31 for more information.
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ simtx.arrecadacoes.barra ---
[INFO] Deleting /opt/ads-agent/_work/47/s/target
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.14:prepare-agent (prepare-jacoco-agent) @ simtx.arrecadacoes.barra ---
[INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.14/org.jacoco.agent-0.8.14-runtime.jar=destfile=/opt/ads-agent/_work/47/s/target/jacoco.exec --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-exports=java.base/jdk.internal.module=ALL-UNNAMED
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ simtx.arrecadacoes.barra ---
[INFO] Copying 2 resources from src/main/resources to target/classes
[INFO] 
[INFO] --- quarkus-maven-plugin:3.33.2.SP1-redhat-00001:generate-code (default-generate-code) @ simtx.arrecadacoes.barra ---
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/br/simtx.arrecadacoes.barra/1.0.0-SNAPSHOT/maven-metadata.xml
[INFO] [io.quarkiverse.cxf.deployment.codegen.Wsdl2JavaCodeGen] wsdl2java processed 0 WSDL files under src/main/resources
[INFO] 
[INFO] --- quarkus-maven-plugin:3.33.2.SP1-redhat-00001:generate-code (default) @ simtx.arrecadacoes.barra ---
[INFO] [io.quarkiverse.cxf.deployment.codegen.Wsdl2JavaCodeGen] wsdl2java processed 0 WSDL files under src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.15.0:compile (default-compile) @ simtx.arrecadacoes.barra ---
[INFO] Recompiling the module because of changed source code.



o pom do xml ta assim:


<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>br.gov.br</groupId>
    <artifactId>simtx.arrecadacoes.barra</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <packaging>quarkus</packaging>

    <properties>
        <compiler-plugin.version>3.15.0</compiler-plugin.version>
        <jacoco-maven-plugin.version>0.8.14</jacoco-maven-plugin.version>
        <maven.compiler.release>21</maven.compiler.release>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
        <quarkus.platform.group-id>com.redhat.quarkus.platform</quarkus.platform.group-id>
        <quarkus.platform.version>3.33.2.SP1-redhat-00001</quarkus.platform.version>
        <skipITs>true</skipITs>
        <surefire-plugin.version>3.5.6</surefire-plugin.version>
        <lombok.version>1.18.46</lombok.version>
        <applicationinsights-agent.version>3.7.8</applicationinsights-agent.version>
        <SIMTX-lib-processos-assinatura-multipla.version>1.4.0.0</SIMTX-lib-processos-assinatura-multipla.version>
        <simtx-lib-core.version>0.0.0.98</simtx-lib-core.version>
    </properties>

    <repositories>
        <repository>
            <id>red-hat-enterprise-maven-repository</id>
            <url>https://maven.repository.redhat.com/ga/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
    <pluginRepositories>
        <pluginRepository>
            <id>red-hat-enterprise-maven-repository</id>
            <url>https://maven.repository.redhat.com/ga/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </pluginRepository>
    </pluginRepositories>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>${quarkus.platform.group-id}</groupId>
                <artifactId>${quarkus.platform.artifact-id}</artifactId>
                <version>${quarkus.platform.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <dependencies>
        <dependency>
            <groupId>br.gov.caixa.simtx.lib.core</groupId>
            <artifactId>SIMTX-lib-core</artifactId>
            <version>${simtx-lib-core.version}</version>
        </dependency>
        <dependency>
            <groupId>br.gov.caixa.simtx.lib.assinaturamultipla</groupId>
            <artifactId>SIMTX-lib-processos-assinatura-multipla</artifactId>
            <version>${SIMTX-lib-processos-assinatura-multipla.version}</version>
        </dependency>
        <dependency>
            <groupId>com.microsoft.azure</groupId>
            <artifactId>applicationinsights-agent</artifactId>
            <version>${applicationinsights-agent.version}</version>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-context-propagation</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-cache</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-jwt</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-openapi</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-health</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-fault-tolerance</artifactId>
        </dependency>
        <dependency>
            <groupId>org.jboss.slf4j</groupId>
            <artifactId>slf4j-jboss-logmanager</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-oidc-client</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-validator</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client-oidc-filter</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-oidc</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-orm-panache</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jdbc-oracle</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-arc</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-orm</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-messaging</artifactId>
        </dependency>
        <dependency>
            <groupId>io.smallrye.reactive</groupId>
            <artifactId>smallrye-reactive-messaging-jms</artifactId>
        </dependency>
        <dependency>
            <groupId>io.smallrye.reactive</groupId>
            <artifactId>smallrye-reactive-messaging-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>com.ibm.mq</groupId>
            <artifactId>com.ibm.mq.jakarta.client</artifactId>
            <version>9.4.5.0</version>
        </dependency>
        <dependency>
            <groupId>org.messaginghub</groupId>
            <artifactId>pooled-jms</artifactId>
            <version>3.1.7.redhat-00001</version>
        </dependency>
        <dependency>
            <groupId>io.smallrye.config</groupId>
            <artifactId>smallrye-config-source-file-system</artifactId>
            <version>3.13.4.redhat-00001</version>
        </dependency>
        <dependency>
            <groupId>io.quarkiverse.cxf</groupId>
            <artifactId>quarkus-cxf-rt-features-metrics</artifactId>
            <version>3.33.8</version>
        </dependency>
        <dependency>
            <groupId>io.quarkiverse.openapi.generator</groupId>
            <artifactId>quarkus-openapi-generator</artifactId>
            <version>2.20.0</version>
        </dependency>
        <dependency>
            <groupId>io.quarkiverse.openapi.generator</groupId>
            <artifactId>quarkus-openapi-generator-oidc</artifactId>
            <version>2.20.0</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jdbc-h2</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-test-h2</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jacoco</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-junit5</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest</artifactId>
            <version>3.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.instancio</groupId>
            <artifactId>instancio-junit</artifactId>
            <version>5.6.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>${quarkus.platform.group-id}</groupId>
                <artifactId>quarkus-maven-plugin</artifactId>
                <version>${quarkus.platform.version}</version>
                <extensions>true</extensions>
                <executions>
                    <execution>
                        <goals>
                            <goal>build</goal>
                            <goal>generate-code</goal>
                            <goal>generate-code-tests</goal>
                            <goal>native-image-agent</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>${compiler-plugin.version}</version>
                <configuration>
                    <parameters>true</parameters>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>${lombok.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>${surefire-plugin.version}</version>
                <configuration>
                    <argLine>@{argLine} --add-opens java.base/java.lang=ALL-UNNAMED</argLine>
                    <systemPropertyVariables>
                        <java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>${jacoco-maven-plugin.version}</version>
                <executions>
                    <execution>
                        <id>prepare-jacoco-agent</id>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>generate-jacoco-report</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                        <configuration>
                            <outputDirectory>${project.build.directory}/jacoco-report</outputDirectory>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>${surefire-plugin.version}</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>integration-test</goal>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <argLine>@{argLine} --add-opens java.base/java.lang=ALL-UNNAMED</argLine>
                    <systemPropertyVariables>
                        <native.image.path>${project.build.directory}/${project.build.finalName}-runner</native.image.path>
                        <java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <profiles>
        <profile>
            <id>native</id>
            <activation>
                <property>
                    <name>native</name>
                </property>
            </activation>
            <properties>
                <quarkus.package.jar.enabled>false</quarkus.package.jar.enabled>
                <skipITs>false</skipITs>
                <quarkus.native.enabled>true</quarkus.native.enabled>
            </properties>
        </profile>
        <profile>
            <id>local</id>
            <dependencies>
                <dependency>
                    <groupId>io.quarkus</groupId>
                    <artifactId>quarkus-jdbc-h2</artifactId>
                    <scope>compile</scope>
                </dependency>
                <dependency>
                    <groupId>io.quarkus</groupId>
                    <artifactId>quarkus-test-h2</artifactId>
                    <scope>compile</scope>
                </dependency>
            </dependencies>
            <properties>
                <quarkus.profile>local</quarkus.profile>
            </properties>
        </profile>
    </profiles>
</project>


application.properties ta assim:


# LOGGING
quarkus.log.console.format=%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n
quarkus.log.console.level=${LOG_LEVEL:DEBUG}
quarkus.log.category."br.gov.caixa.simtx".level=${LOG_LEVEL:DEBUG}

# BANNER
quarkus.banner.path=banner.txt

# API DOCUMENTATION
quarkus.smallrye-openapi.store-schema-directory=target/openapi
mp.openapi.extensions.smallrye.openapi=3.0.3

# DATABASE
quarkus.datasource.db-kind=${DB}
quarkus.datasource.jdbc.url=${DB_URL}
quarkus.datasource.username=${DB_USER}
quarkus.datasource.password=${PASS_DB}
quarkus.hibernate-orm.database.default-schema=${DB_SCHEMA}

# CACHE - HIBERNATE 2ND LEVEL
quarkus.hibernate-orm.cache."br.gov.caixa.simtx.comum.transacional.persistence.entity.Mtxtb006MensagemEntity".expiration.max-idle=${DB_CACHE_TABELA_MTXTB006_MENSAGEM_TIME}
quarkus.hibernate-orm.cache."br.gov.caixa.simtx.comum.transacional.persistence.entity.Mtxtb001ServicoEntity".expiration.max-idle=${DB_CACHE_TABELA_MTXTB001_SERVICO_TIME}
quarkus.hibernate-orm.cache."br.gov.caixa.simtx.comum.transacional.persistence.entity.Mtxtb023ParametroEntity".expiration.max-idle=${DB_CACHE_TABELA_MTXTB023_PARAMETRO_SISTEMA_TIME}
quarkus.hibernate-orm.cache."br.gov.caixa.simtx.comum.transacional.persistence.entity.Mtxtb013PrmtoSrvcoCanalEntity".expiration.max-idle=${DB_CACHE_TABELA_MTXTB013_PRMTO_SRVCO_CANAL_TIME}
quarkus.cache.caffeine.servico-cache.expire-after-write=${CACHE_CAFFEINE_MAX_EXPIRATION}

simtx.clock.timezone=America/Sao_Paulo




e uma build nova nunc asubiu a pipiline accho que tem probele no repositori deles


