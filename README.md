<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>br.gov.caixa.med</groupId>
    <artifactId>simpi-med</artifactId>
    <version>1.0.0-SNAPSHOT</version>

    <properties>
        <compiler-plugin.version>3.13.0</compiler-plugin.version>
        <maven.compiler.release>21</maven.compiler.release>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>

        <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
        <quarkus.platform.group-id>com.redhat.quarkus.platform</quarkus.platform.group-id>
        <quarkus.platform.version>3.15.5.redhat-00002</quarkus.platform.version>

        <skipITs>true</skipITs>
        <surefire-plugin.version>3.3.1</surefire-plugin.version>
        <jacoco.version>0.8.10</jacoco.version>
        <mapstruct.version>1.5.5.Final</mapstruct.version>
        <lombok.version>1.18.38</lombok.version>
        <versao.pix.framework>1.6.0.0</versao.pix.framework>
        <versao.simpi.commons>3.1.1.0</versao.simpi.commons>
        <versao.dinamo.hsm>4.21.1</versao.dinamo.hsm>
    </properties>

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
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-jaxb</artifactId>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jaxb</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client-jaxb</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-validator</artifactId>
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
            <artifactId>quarkus-smallrye-metrics</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-fault-tolerance</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-orm</artifactId>
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
            <artifactId>quarkus-jsonb</artifactId>
        </dependency>
        <dependency>
            <groupId>org.jdom</groupId>
            <artifactId>jdom2</artifactId>
            <version>2.0.6</version>
        </dependency>

        <dependency>
            <groupId>com.auth0</groupId>
            <artifactId>java-jwt</artifactId>
            <version>3.3.0</version>
        </dependency>

        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>${mapstruct.version}</version>
        </dependency>
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct-processor</artifactId>
            <version>${mapstruct.version}</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
        </dependency>

        <!-- Source: https://mvnrepository.com/artifact/org.json/json -->
        <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20260522</version>
        </dependency>

        <dependency>
            <groupId>io.smallrye.config</groupId>
            <artifactId>smallrye-config-source-file-system</artifactId>
            <version>3.13.2</version>
        </dependency>
        <dependency>
            <groupId>br.gov.caixa.pix.framework</groupId>
            <artifactId>problem-details</artifactId>
            <version>${versao.pix.framework}</version>
        </dependency>
        <dependency>
            <groupId>br.gov.caixa.pix.framework</groupId>
            <artifactId>validacao-token</artifactId>
            <version>${versao.pix.framework}</version>
        </dependency>
        <dependency>
            <groupId>br.gov.caixa.pix.framework</groupId>
            <artifactId>correlation-id</artifactId>
            <version>${versao.pix.framework}</version>
        </dependency>
        <dependency>
            <groupId>br.gov.caixa.simpi</groupId>
            <artifactId>simpi-commons</artifactId>
            <version>${versao.simpi.commons}</version>
        </dependency>
        <dependency>
            <groupId>io.dinamonetworks.sdk</groupId>
            <artifactId>dinamo-hsm</artifactId>
            <version>${versao.dinamo.hsm}</version>
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
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-junit5-mockito</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-junit5-component</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.tngtech.archunit</groupId>
            <artifactId>archunit-junit5</artifactId>
            <version>1.3.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>br.gov.caixa.arch</groupId>
            <artifactId>sispi-pix-arch</artifactId>
            <version>[1.0,)</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <repositories>
        <repository>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
            <id>redhat</id>
            <url>https://maven.repository.redhat.com/ga</url>
        </repository>
        <repository>
            <id>snapshots</id>
            <url>http://binario.caixa:8081/repository/snapshots/</url>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
            <releases>
                <enabled>false</enabled>
            </releases>
        </repository>
    </repositories>

    <pluginRepositories>
        <pluginRepository>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
            <id>redhat</id>
            <url>https://maven.repository.redhat.com/ga</url>
        </pluginRepository>
    </pluginRepositories>

    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.jacoco</groupId>
                    <artifactId>jacoco-maven-plugin</artifactId>
                    <version>${jacoco.version}</version>
                </plugin>
            </plugins>
        </pluginManagement>
        <plugins>
            <plugin>
                <groupId>org.codehaus.gmavenplus</groupId>
                <artifactId>gmavenplus-plugin</artifactId>
                <version>3.0.2</version>
                <dependencies>
                    <!-- Groovy é obrigatório como dependência explícita do gmavenplus -->
                    <dependency>
                        <groupId>org.codehaus.groovy</groupId>
                        <artifactId>groovy-all</artifactId>
                        <version>3.0.19</version>
                        <type>pom</type>
                        <scope>runtime</scope>
                    </dependency>
                </dependencies>
                <executions>
                    <execution>
                        <id>gerar-docs</id>
                        <!-- Não vinculado a nenhuma fase: executar explicitamente -->
                        <phase>none</phase>
                        <goals>
                            <goal>execute</goal>
                        </goals>
                        <configuration>
                            <scripts>
                                <script>file:///${project.basedir}/docs/gerar-docs.groovy</script>
                            </scripts>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
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
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>${compiler-plugin.version}</version>
                <configuration>
                    <compilerArgs>
                        <arg>-parameters</arg>
                    </compilerArgs>
                    <parameters>true</parameters>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>${lombok.version}</version>
                        </path>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>${mapstruct.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>${surefire-plugin.version}</version>
                <configuration>
                    <systemPropertyVariables>
                        <java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>
                </configuration>
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
                    <systemPropertyVariables>
                        <native.image.path>${project.build.directory}/${project.build.finalName}-runner</native.image.path>
                        <java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>check</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>check</goal>
                        </goals>
                        <configuration>
                            <rules>
                                <rule>
                                    <element>BUNDLE</element>
                                    <limits>
                                        <limit>
                                            <counter>LINE</counter>
                                            <value>COVEREDRATIO</value>
                                            <minimum>0.80</minimum>
                                        </limit>
                                        <limit>
                                            <counter>BRANCH</counter>
                                            <value>COVEREDRATIO</value>
                                            <minimum>0.70</minimum>
                                        </limit>
                                    </limits>
                                    <excludes>
                                        <exclude>br/gov/caixa/med/simpi/*/swagger/*</exclude>
                                        <exclude>br/gov/caixa/med/simpi/*/dto/*</exclude>
                                        <exclude>br/gov/caixa/med/simpi/errodetail/*</exclude>
                                    </excludes>
                                </rule>
                            </rules>
                        </configuration>
                    </execution>
                </executions>
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
                <skipITs>false</skipITs>
                <quarkus.native.enabled>true</quarkus.native.enabled>
            </properties>
        </profile>
    </profiles>
</project>






## CORS
quarkus.http.cors=true
quarkus.http.cors.origins=http://localhost:4200,http://localhost:8080
quarkus.http.cors.methods=GET,PUT,POST,PATCH,DELETE,OPTIONS
quarkus.http.cors.headers=accept,authorization,content-type,x-requested-with
quarkus.http.cors.exposed-headers=Content-Disposition
quarkus.http.cors.access-control-max-age=24H
quarkus.http.cors.access-control-allow-credentials=true

## Datasource DEV
quarkus.datasource.db-kind=oracle
quarkus.datasource.jdbc.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
quarkus.datasource.jdbc.driver=oracle.jdbc.driver.OracleDriver
quarkus.datasource.username=spi
quarkus.datasource.password=spi
quarkus.datasource.health.enabled=false

## Hibernate ORM
quarkus.hibernate-orm.database.default-schema=SPI
quarkus.hibernate-orm.packages=br.gov.caixa.med.simpi
quarkus.hibernate-orm.log.sql=false

## Operacao
quarkus.smallrye-health.ui.always-include=true
quarkus.smallrye-openapi.path=/swagger
quarkus.smallrye-openapi.security-scheme=jwt
quarkus.http.test-port=8888
quarkus.http.port=8080

## OpenAPI
mp.openapi.extensions.smallrye.info.title=SIMPI-med
mp.openapi.extensions.smallrye.info.version=1.0.0
mp.openapi.extensions.smallrye.info.description=Mecanismo Especial de Devolucao (MED 2.0)
mp.openapi.extensions.smallrye.info.contact.email=pix@caixa.com.br
mp.openapi.extensions.smallrye.info.contact.url=https://pix.caixa.gov.br

## Log com correlacao
quarkus.console.color=false
quarkus.log.console.format=%d{HH:mm:ss} %-5p  [CORRELATION-ID - %X{correlation-id}] [%c{2.}] (%t) [SIMPI][MED] %s%e%n

## Validacao token JWT (dev)
PIX.FRAMEWORK.VALIDACAO_TOKEN.SSO.URL=https://login.des.caixa/auth/realms/intranet
PIX.FRAMEWORK.VALIDACAO_TOKEN.SSO.EMISSOR=https://login.des.caixa/auth/realms/intranet
PIX.FRAMEWORK.VALIDACAO_TOKEN.VALIDACAO_GLOBAL=false

## Integracao BACEN via RestClient
BACEN_MED_URL=http://localhost:8090
BACEN_MED_V2_URL=${BACEN_MED_URL}



BACEN_MED_KEYSTORE_PATH=
BACEN_MED_KEYSTORE_PASSWORD=
BACEN_MED_TRUSTSTORE_PATH=
BACEN_MED_TRUSTSTORE_PASSWORD=


BACEN_MED_MAX_CONNECTIONS=50
quarkus.rest-client.connection-pool-size=${BACEN_MED_MAX_CONNECTIONS}

BACEN_XML_SIGN_ENABLED=false
HSM.HOSTNAME=
HSM.USER.ID=
HSM.PASSWORD=
HSM.PRIVATE.KEY.NAME=
CERT_ASSINATURA_ISSUER_NAME=
CERT_ASSINATURA_SERIAL_NUMBER=

## Outras configuracoes
database.checkconnection.query=select 1 from dual
ISPB_CAIXA=00360305

## Silencia logs do Hibernate
quarkus.log.category."org.hibernate".level=OFF
quarkus.log.category."org.hibernate.orm.boot".level=OFF
quarkus.log.category."org.hibernate.orm".level=OFF


## CORS
quarkus.http.cors=true
quarkus.http.cors.origins=http://localhost:4200,http://localhost:8080
quarkus.http.cors.methods=GET,PUT,POST,PATCH,DELETE,OPTIONS
quarkus.http.cors.headers=accept,authorization,content-type,x-requested-with
quarkus.http.cors.exposed-headers=Content-Disposition
quarkus.http.cors.access-control-max-age=24H
quarkus.http.cors.access-control-allow-credentials=true

## Operacao
quarkus.smallrye-health.ui.always-include=true
quarkus.smallrye-openapi.path=/swagger
quarkus.smallrye-openapi.security-scheme=jwt
quarkus.http.test-port=8888
quarkus.http.port=8080

## OpenAPI
mp.openapi.extensions.smallrye.info.title=SIMPI-med
mp.openapi.extensions.smallrye.info.version=1.0.0
mp.openapi.extensions.smallrye.info.description=Mecanismo Especial de Devolucao (MED 2.0)
mp.openapi.extensions.smallrye.info.contact.email=pix@caixa.com.br
mp.openapi.extensions.smallrye.info.contact.url=https://pix.caixa.gov.br

## Log com correlacao
quarkus.console.color=false
quarkus.log.console.format=%d{HH:mm:ss} %-5p  [CORRELATION-ID - %X{correlation-id}] [%c{2.}] (%t) [SIMPI][MED] %s%e%n

## Validacao token JWT
PIX.FRAMEWORK.VALIDACAO_TOKEN.SSO.URL=
PIX.FRAMEWORK.VALIDACAO_TOKEN.SSO.EMISSOR=
PIX.FRAMEWORK.VALIDACAO_TOKEN.VALIDACAO_GLOBAL=true

## Integracao BACEN via RestClient
BACEN_V2_URL=
BACEN_MED_MAX_CONNECTIONS=50

quarkus.rest-client.bacen-v2.url=${BACEN_V2_URL}
quarkus.rest-client.bacen-v2.connect-timeout=5000
quarkus.rest-client.bacen-v2.read-timeout=5000
quarkus.rest-client.bacen-v2.connection-pool-size=${BACEN_MED_MAX_CONNECTIONS}
quarkus.rest-client.bacen-v2.connection-ttl=60
quarkus.rest-client.bacen-v2.tls-configuration-name=bacen-mtls

# HSM e CERTIFICADO
dict.hsm.hostname=${HSM_HOSTNAME}
dict.hsm.user-id=${HSM_USER_ID}
dict.hsm.password=${HSM_PASSWORD}
dict.hsm.private-key-name=${HSM_PRIVATE_KEY_NAME}
dict.certificado.assinatura.issuer-name=${CER_ASSINATURA_ISSUER_NAME}
dict.certificado.assinatura.serial-number=${CER_ASSINATURA_SERIAL_NUMBER}

################################################################################
# TLS REGISTRY - BACEN mTLS COM JKS
################################################################################
quarkus.tls.bacen-mtls.key-store.jks.path=${MED_KEYSTORE_PATH}
quarkus.tls.bacen-mtls.key-store.jks.password=${MED_KEYSTORE_PASSWORD}
quarkus.tls.bacen-mtls.trust-store.jks.path=${MED_TRUSTSTORE_PATH}
quarkus.tls.bacen-mtls.trust-store.jks.password=${MED_TRUSTSTORE_PASSWORD}
quarkus.tls.bacen-mtls.protocols=TLSv1.2

# Assinatura XML/HSM
HSM_HOSTNAME=teste
HSM_USER_ID=testse
HSM_PASSWORD=test
HSM_PRIVATE_KEY_NAME=testes
CER_ASSINATURA_ISSUER_NAME=teste
CER_ASSINATURA_SERIAL_NUMBER=testes

MED_KEYSTORE_PATH=/deployments/simpi-des-keystore-092025.jks
MED_KEYSTORE_PASSWORD='${SIMPI_KSPIX_01}'
MED_TRUSTSTORE_PATH=src/main/resources/keystore-local.jks
MED_TRUSTSTORE_PASSWORD=teste

## Outras configuracoes
database.checkconnection.query=select 1 from dual
ISPB_CAIXA=00360305

simpi.med.http.socket-timeout-sso=5000
simpi.med.http.conn-timeout-sso=3000

# Scheduler: meia-noite todos os dias
simpi.security.public-key.cron=0 0 0 * * ?


## Silencia logs do Hibernate
quarkus.log.category."org.hibernate".level=OFF
quarkus.log.category."org.hibernate.orm.boot".level=OFF
quarkus.log.category."org.hibernate.orm".level=OFF

