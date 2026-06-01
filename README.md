DOCKEFILE.JVM

####
# This Dockerfile is used in order to build a container that runs the Quarkus application in JVM mode
#
# Before building the container image run:
#
# ./mvnw package
#
# Then, build the image with:
#
# docker build -f src/main/docker/Dockerfile.jvm -t quarkus/sisgf-backend-jvm .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 quarkus/sisgf-backend-jvm
#
# If you want to include the debug port into your docker image
# you will have to expose the debug port (default 5005) like this :  EXPOSE 8080 5050
#
# Then run the container using :
#
# docker run -i --rm -p 8080:8080 -p 5005:5005 -e JAVA_ENABLE_DEBUG="true" quarkus/sisgf-backend-jvm
#
###
FROM registry.access.redhat.com/ubi8/ubi-minimal:8.3 

ARG JAVA_PACKAGE=java-11-openjdk-headless
ARG RUN_JAVA_VERSION=1.3.8
ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'
# Install java and the run-java script
# Also set up permissions for user `1001`
RUN microdnf install curl ca-certificates ${JAVA_PACKAGE} \
    && microdnf update \
    && microdnf clean all \
    && mkdir /deployments \
    && chown 1001 /deployments \
    && chmod "g+rwX" /deployments \
    && chown 1001:root /deployments \
    && curl https://repo1.maven.org/maven2/io/fabric8/run-java-sh/${RUN_JAVA_VERSION}/run-java-sh-${RUN_JAVA_VERSION}-sh.sh -o /deployments/run-java.sh \
    && chown 1001 /deployments/run-java.sh \
    && chmod 540 /deployments/run-java.sh \
    && echo "securerandom.source=file:/dev/urandom" >> /etc/alternatives/jre/lib/security/java.security

# Configure the JAVA_OPTIONS, you can add -XshowSettings:vm to also display the heap size.
ENV JAVA_OPTIONS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --chown=1001 target/quarkus-app/lib/ /deployments/lib/
COPY --chown=1001 target/quarkus-app/*.jar /deployments/
COPY --chown=1001 target/quarkus-app/app/ /deployments/app/
COPY --chown=1001 target/quarkus-app/quarkus/ /deployments/quarkus/
COPY --chown=1001 src/main/docker/agents/com.microsoft.azure.applicationinsights-agent-3.3.1.jar /deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar

EXPOSE 8080
USER 1001

RUN echo '#!/bin/bash' > /deployments/export-secrets.sh && \
    echo 'export SISGF_APIKEY=$(cat /usr/src/app/secrets_files/SISGF_DES/SISGF_APIKEY 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SSGFRD01_DB2=$(cat /usr/src/app/secrets_files/SISGF_DES/SSGFRD01_DB2 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SSGFRD02_ORA=$(cat /usr/src/app/secrets_files/SISGF_DES/SSGFRD02_ORA 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export CLISERSGF_SSO_INTRA=$(cat /usr/src/app/secrets_files/SISGF_DES/CLISERSGF_SSO_INTRA 2>/dev/null)' >> /deployments/export-secrets.sh && \
    echo 'export SSGFDR01_SFTP=$(cat /usr/src/app/secrets_files/SISGF_DES/SSGFDR01_SFTP 2>/dev/null)' >> /deployments/export-secrets.sh && \
    chmod +x /deployments/export-secrets.sh

ENTRYPOINT [ "sh", "-c", "/deployments/export-secrets.sh && /deployments/run-java.sh" ]








APLICATION.PROPERTIES


# Quarkus port
quarkus.http.port=8080
quarkus.vertx.cluster.port=7268

# CORS
quarkus.http.cors=true
quarkus.http.cors.headers=Origin, X-Request-Width, Content-Type, Accept, Authorization, Accept-Encoding, Accept-Language, authCode, Connection, Host, Referer, Sec-Fetch-Dest, Sec-Fetch-Mode, Sec-Fetch-Site, User-Agent, Access-Control-Allow-Origin
quarkus.http.cors.origins=${CORS_ORIGINS}
quarkus.http.cors.methods=GET, POST, OPTIONS, PUT, DELETE
quarkus.http.cors.access-control-max-age=1209600

# Swagger
quarkus.smallrye-openapi.path=/swagger
quarkus.swagger-ui.always-include=true

# JWT Configuration
quarkus.smallrye-jwt.enabled=false

# Token duration (7 days in seconds)
jwt.expiration=604800

# OIDC Configuration
#https://quarkus.io/guides/security-authorization
#https://quarkus.io/guides/security-openid-connect
quarkus.oidc.auth-server-url=https://login.des.caixa/auth/realms/intranet
quarkus.oidc.client-id=cli-ser-sgf
quarkus.oidc.credentials.secret=6e580ccf-f80e-4314-84eb-bffe070c05c4
quarkus.oidc.application-type=service
quarkus.oidc.roles.source=accesstoken
quarkus.oidc.token.auto-refresh-interval=18000

# HTTP Configuration
quarkus.http.auth.permission.authenticated.paths=/*
quarkus.http.auth.permission.authenticated.policy=authenticated
quarkus.http.auth.permission.health.paths=/q/*
quarkus.http.auth.permission.health.policy=permit
quarkus.http.auth.permission.health.methods=GET

# HTTP UTF-8
quarkus.http.encoding.default-charset=utf-8
quarkus.http.encoding.force=true

# OIDC Client
quarkus.oidc-client.auth-server-url=${quarkus.oidc.auth-server-url}
quarkus.oidc-client.client-id=${quarkus.oidc.client-id}
quarkus.oidc-client.credentials.secret=${quarkus.oidc.credentials.secret}
quarkus.oidc-client.token-path=/protocol/openid-connect/tokens

# Log Configuration for Debugging Transactions
quarkus.log.category."io.quarkus".level=ERROR
quarkus.log.level=${QUARKUS_LOG_LEVEL}
quarkus.log.category."org.hibernate".level=ERROR
quarkus.log.category."org.hibernate.SQL".min-level=ERROR
quarkus.log.category."org.jboss.res-teasy".level=ERROR
quarkus.log.category."com.arjuna.ats.jta".level=ERROR
quarkus.log.category."io.agroal.narayana".level=ERROR

# SmallRye Config - Ler secrets dos arquivos do BeyondTrust
smallrye.config.source.file.locations=${SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS}

# REST Client Configuration
api.key=${API_KEY}

siico.api.publica.url=https://api.des.caixa:8443/informacoes-corporativas-publicas/
br.gov.caixa.sisgf.api.restclient.informacoescorporativaspublica.InformacoesCorporativaPublicaService/mp-rest/url=${siico.api.publica.url}
br.gov.caixa.sisgf.api.restclient.informacoescorporativaspublica.InformacoesCorporativaPublicaService/mp-rest/scope=jakarta.inject.Singleton

siico.api.privada.url=https://api.des.caixa:8443/informacoes-corporativas-privadas/
br.gov.caixa.sisgf.api.restclient.informacoescorporativasprivada.InformacoesCorporativaPrivadaService/mp-rest/url=${siico.api.privada.url}
br.gov.caixa.sisgf.api.restclient.informacoescorporativasprivada.InformacoesCorporativaPrivadaService/mp-rest/scope=jakarta.inject.Singleton

sinaf.api.evento.url=https://api.des.caixa:8443/sinaf-api-evento
br.gov.caixa.sisgf.api.restclient.sinafapievento.SinafApiEventoService/mp-rest/url=${sinaf.api.evento.url}
br.gov.caixa.sisgf.api.restclient.sinafapievento.SinafApiEventoService/mp-rest/scope=jakarta.inject.Singleton

sisgf.api.url=http://localhost:8060/financeiro-beneficios/faturamento/
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfapi.SISGFApi/mp-rest/url=${sisgf.api.url}
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfapi.SISGFApi/mp-rest/scope=jakarta.inject.Singleton

sisgf.batch.url=http://localhost:8070/financeiro-beneficios/faturamento/
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatch.SISGFBatch/mp-rest/url=${sisgf.batch.url}
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatch.SISGFBatch/mp-rest/scope=jakarta.inject.Singleton

sisgf.batch.unidades.url=http://localhost:8050
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatchunidade.SISGFBatchUnidades/mp-rest/url=${sisgf.batch.unidades.url}
br.gov.caixa.sisgf.api.restclient.sisgf.sisgfbatchunidade.SISGFBatchUnidades/mp-rest/scope=jakarta.inject.Singleton

# Database Configuration for SIICO
db2.siico.url=jdbc:db2://10.216.80.110:448/RJKDB2DSD0
db2.siico.username=${DATASOURCE_DB2_USERNAME}
db2.siico.password=${DATASOURCE_DB2_PASSWORD}
db2.siico.schema=ICO

# Narayana Transaction Manager Configuration
quarkus.transaction-manager.enable-recovery=true
quarkus.transaction-manager.recovery-interval=600
quarkus.transaction-manager.default-timeout=600

# Hibernate XA
quarkus.hibernate-orm.transaction.jta-data-source=java:/jdbc/siico
quarkus.hibernate-orm.transaction.coordinator-strategy=jdbc

# Database Configuration for SIGF (Oracle)
quarkus.datasource.db-kind=oracle
quarkus.datasource.jdbc.driver=oracle.jdbc.driver.OracleDriver
quarkus.datasource.db-version=12.2.0
quarkus.datasource.jdbc.url=jdbc:oracle:thin:@10.116.101.7:1521/ORAD01SC
quarkus.datasource.username=${DATASOURCE_ORACLE_USERNAME}
quarkus.datasource.password=${DATASOURCE_ORACLE_PASSWORD}
quarkus.datasource.xa=true
quarkus.datasource.jdbc.max-size=40
quarkus.datasource.jdbc.xa-datasource-class=oracle.jdbc.xa.client.OracleXADataSource

# Persistence Configuration for SIGF
quarkus.hibernate-orm.dialect=org.hibernate.dialect.OracleDialect
quarkus.hibernate-orm.packages=br.gov.caixa.sisgf.api.domain.model
quarkus.hibernate-orm.log.bind-parameters=true
quarkus.hibernate-orm.log.sql=true
quarkus.hibernate-orm.database.default-schema=SGF
quarkus.hibernate-orm.validate-in-dev-mode=false

# Database Configuration for SIICO (DB2)
quarkus.datasource."siico".db-kind=db2
quarkus.datasource."siico".jdbc.driver=com.ibm.db2.jcc.DB2Driver
quarkus.datasource."siico".jdbc.url=${db2.siico.url}
quarkus.datasource."siico".username=${db2.siico.username}
quarkus.datasource."siico".password=${db2.siico.password}
quarkus.datasource."siico".jdbc.max-size=20
quarkus.datasource."siico".jdbc.min-size=5
quarkus.datasource."siico".xa=true
quarkus.datasource."siico".jdbc.xa-datasource-class=com.ibm.db2.jcc.DB2XADataSource

# Persistence Configuration for SIICO
quarkus.hibernate-orm."siico".dialect=br.gov.caixa.sisgf.api.utils.DB2ZOSDialect
quarkus.hibernate-orm."siico".packages=br.gov.caixa.siico.api.domain.model
quarkus.hibernate-orm."siico".log.bind-parameters=true
quarkus.hibernate-orm."siico".log.sql=true
quarkus.hibernate-orm."siico".database.default-schema=${db2.siico.schema}
quarkus.hibernate-orm."siico".datasource=siico
quarkus.hibernate-orm."siico".validate-in-dev-mode=false

# Configuracao envio de email
quarkus.mailer.auth-methods=mailerDIGEST-MD5 CRAM-SHA256 CRAM-SHA1 CRAM-MD5
quarkus.mailer.from=${MAILER_FROM}
quarkus.mailer.host=${MAILER_HOST}
quarkus.mailer.port=${MAILER_PORT}
quarkus.mailer.ssl=false
destinatarios.email=${MAILER_DESTINATARIOS}
.




POX.XML


<?xml version="1.0" encoding="UTF-8"?>
<project
		xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
https://maven.apache.org/xsd/maven-4.0.0.xsd"
		xmlns="http://maven.apache.org/POM/4.0.0"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.gov.caixa.sisgf.backend</groupId>
	<artifactId>sisgf-backend</artifactId>
	<version>11.01.01.01</version>
	<properties>
		<compiler-plugin.version>3.13.0</compiler-plugin.version>
		<surefire-plugin.version>3.13.0</surefire-plugin.version>
		<quarkus.platform.version>3.13.0</quarkus.platform.version>
		<maven.compiler.release>17</maven.compiler.release>
		<maven.compiler.source>17</maven.compiler.source>
		<maven.compiler.target>17</maven.compiler.target>
		<maven.compiler.parameters>true</maven.compiler.parameters>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<quarkus-plugin.version>3.13.0</quarkus-plugin.version>
		<quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
		<quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
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
		<!-- Database Dependencies -->
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc8</artifactId>
			<version>12.2.0.1</version>
		</dependency>
		<dependency>
			<groupId>com.ibm.db2</groupId>
			<artifactId>jcc</artifactId>
			<version>11.5.6.0</version>
		</dependency>
		<!-- Quarkus Dependencies -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-oidc</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-keycloak-authorization</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-hibernate-orm-panache</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-container-image-docker</artifactId>
		</dependency>
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
			<artifactId>quarkus-rest-client</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-rest-client-jackson</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-spring-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-narayana-jta</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-spring-web</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-spring-security</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-elytron-security-properties-file</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-security-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-health</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-jwt</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-fault-tolerance</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-metrics</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-openapi</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-arc</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-spring-cache</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-spring-di</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-undertow</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-scheduler</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-mailer</artifactId>
		</dependency>
		<!-- Test Dependencies -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-junit5</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-junit5-mockito</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-test-security</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-core</artifactId>
			<version>5.12.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
			<scope>test</scope>
		</dependency>
		<!-- JAXB Dependencies -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-jaxb</artifactId>
		</dependency>
		<dependency>
			<groupId>jakarta.xml.bind</groupId>
			<artifactId>jakarta.xml.bind-api</artifactId>
			<version>3.0.1</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jaxb</groupId>
			<artifactId>jaxb-runtime</artifactId>
			<version>3.0.1</version>
		</dependency>
		<dependency>
			<groupId>jakarta.activation</groupId>
			<artifactId>jakarta.activation-api</artifactId>
			<version>2.0.0</version>
		</dependency>
		<!-- Additional Dependencies -->
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.28</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.modelmapper</groupId>
			<artifactId>modelmapper</artifactId>
			<version>2.3.0</version>
		</dependency>
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.10</version>
		</dependency>
		<dependency>
			<groupId>io.smallrye.config</groupId>
			<artifactId>smallrye-config-source-file-system</artifactId>
			<version>3.13.2</version>
		</dependency>

		<dependency>
			<groupId>org.docx4j</groupId>
			<artifactId>docx4j-core</artifactId>
			<version>11.4.11</version>
			<exclusions>
				<exclusion>
					<groupId>javax.xml.bind</groupId>
					<artifactId>jaxb-api</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<dependency>
			<groupId>org.docx4j</groupId>
			<artifactId>docx4j-JAXB-ReferenceImpl</artifactId>
			<version>11.4.11</version>
		</dependency>
		<dependency>
			<groupId>xerces</groupId>
			<artifactId>xercesImpl</artifactId>
			<version>2.12.0</version>
		</dependency>
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.0.0</version>
		</dependency>
		<dependency>
			<groupId>com.itextpdf</groupId>
			<artifactId>itextpdf</artifactId>
			<version>5.3.4</version>
		</dependency>
		<dependency>
			<groupId>stax</groupId>
			<artifactId>stax</artifactId>
			<version>1.2.0</version>
		</dependency>
		<!-- Application Insights Agent - CORRIGIDO para versão 3.3.1 -->
		<dependency>
			<groupId>com.microsoft.azure</groupId>
			<artifactId>applicationinsights-agent</artifactId>
			<version>3.3.1</version>
		</dependency>
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-csv</artifactId>
			<version>1.10.0</version>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>${quarkus.platform.group-id}</groupId>
				<artifactId>quarkus-maven-plugin</artifactId>
				<version>${quarkus-plugin.version}</version>
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
			</plugin>
			<plugin>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.3.0</version>
				<configuration>
					<systemPropertyVariables>
						<java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
						<quarkus.log.level>DEBUG</quarkus.log.level>
						<maven.home>${maven.home}</maven.home>
					</systemPropertyVariables>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.sonarsource.scanner.maven</groupId>
				<artifactId>sonar-maven-plugin</artifactId>
				<version>3.9.0.2155</version>
			</plugin>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.8</version>
				<configuration>
					<append>true</append>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>post-unit-test</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<!-- Plugin para copiar Application Insights Agent JAR para lib/main/ -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-dependency-plugin</artifactId>
				<version>3.5.0</version>
				<executions>
					<execution>
						<phase>prepare-package</phase>
						<goals>
							<goal>copy</goal>
						</goals>
						<configuration>
							<artifactItems>
								<artifactItem>
									<groupId>com.microsoft.azure</groupId>
									<artifactId>applicationinsights-agent</artifactId>
									<version>3.3.1</version>
									<destFileName>com.microsoft.azure.applicationinsights-agent-3.3.1.jar</destFileName>
									<outputDirectory>${project.build.directory}/quarkus-app/lib/main</outputDirectory>
								</artifactItem>
							</artifactItems>
						</configuration>
					</execution>
				</executions>
			</plugin>
		</plugins>
		<pluginManagement>
			<plugins>
				<!-- This plugin's configuration is used to store Eclipse m2e settings only. It has no influence on the Maven build itself. -->
				<plugin>
					<groupId>org.eclipse.m2e</groupId>
					<artifactId>lifecycle-mapping</artifactId>
					<version>1.0.0</version>
					<configuration>
						<lifecycleMappingMetadata>
							<pluginExecutions>
								<pluginExecution>
									<pluginExecutionFilter>
										<groupId>io.quarkus</groupId>
										<artifactId>quarkus-maven-plugin</artifactId>
										<versionRange>[2.13.2.Final,)</versionRange>
										<goals>
											<goal>build</goal>
											<goal>generate-code</goal>
											<goal>generate-code-tests</goal>
										</goals>
									</pluginExecutionFilter>
									<action>
										<ignore></ignore>
									</action>
								</pluginExecution>
							</pluginExecutions>
						</lifecycleMappingMetadata>
					</configuration>
				</plugin>
			</plugins>
		</pluginManagement>
	</build>
	<profiles>
		<profile>
			<id>native</id>
			<activation>
				<property>
					<name>native</name>
				</property>
			</activation>
			<build>
				<plugins>
					<plugin>
						<artifactId>maven-failsafe-plugin</artifactId>
						<version>${surefire-plugin.version}</version>
						<executions>
							<execution>
								<goals>
									<goal>integration-test</goal>
									<goal>verify</goal>
								</goals>
								<configuration>
									<systemPropertyVariables>
										<native.image.path>${project.build.directory}/${project.build.finalName}-runner</native.image.path>
										<java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
										<maven.home>${maven.home}</maven.home>
									</systemPropertyVariables>
								</configuration>
							</execution>
						</executions>
					</plugin>
				</plugins>
			</build>
		</profile>
	</profiles>
</project>


sO LEMBRESE QUE SAO SISTEMAS DIFERNESTE COM VERSO DIFERENTES NAO VAI MISTURAR AS OCIASA E BAGUNÇAS A MIHNHA VIDA

