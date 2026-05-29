SIOFG_DES/SIFUG_DATASOURCE_02,SIOFG_DES/SIFUG_DATASOURCE_15,SIOFG_DES/SIFUG_XMQD1,SIOFG_DES/SIFUG_BT_APIKEY,SIOFG_DES/CLISERFUG_SSO_INTER


aplication.propertis





#PORTA
quarkus.http.port=8898

#CONFIG CORS
quarkus.http.cors=true
#quarkus.http.cors.origins=http://siopm-frontend-des-esteiras.nprd2.caixa
#quarkus.http.cors.origins=https://login.des.caixa/auth/realms/intranet

#SSO-Keycloak
#quarkus.oidc.auth-server-url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
#quarkus.oidc.client-id=cli-ser-fug
#quarkus.oidc.credentials.secret=c606765c-2dee-4d91-a5f2-34eb4e2fee43



#########################################################################################################
#                                       DATABASE e CRUD exemplo	            							#
#########################################################################################################
#           Antes de iniciar ... comentar as linhas abaixo e deletar todas classes ClientXXX            # 
#                                                                                                       #
												
#																										
#########################################################################################################

#BD: DB2
db2.schema=FUG

quarkus.datasource.db2.jdbc.driver=com.ibm.db2.jcc.DB2Driver
quarkus.datasource.db2.db-kind=db2
quarkus.datasource.db2.username=${DATASOURCE_DB2_USERNAME}
quarkus.datasource.db2.password=${DATASOURCE_DB2_PASSWORD}
quarkus.datasource.db2.jdbc.url=${DATASOURCE_DB2_JDBC_URL}

#BD: IDMS CONSULTA
#quarkus.datasource.consulta.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
#quarkus.datasource.consulta.db-kind=consulta
#quarkus.datasource.consulta.jdbc.url=${DATASOURCE_CONSULTA_JDBC_URL}
#quarkus.datasource.consulta.username=${DATASOURCE_CONSULTA_USERNAME}
#quarkus.datasource.consulta.password=${DATASOURCE_CONSULTA_PASSWORD}

#BD: IDMS CONSULTA PEF
quarkus.datasource.consultapef.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
quarkus.datasource.consultapef.db-kind=consultapef
quarkus.datasource.consultapef.jdbc.url=${DATASOURCE_CONSULTAPEF_JDBC_URL}
quarkus.datasource.consultapef.username=${DATASOURCE_CONSULTAPEF_USERNAME}
quarkus.datasource.consultapef.password=${DATASOURCE_CONSULTAPEF_PASSWORD}

chave.publica.sso.internet=${KEY_TOKEN_INTERNET}
chave.publica.sso.intranet=${KEY_TOKEN_INTRANET}
chave.token.caixatem=${KEY_TOKEN_CAIXA_TEM}


idms.codigo.dialogo=${KEY_CODIGO_IDMS_DIALOGO}
idms.sureg=${KEY_IDMS_SUREG}
#idms.alias.base=${KEY_IDMS_ALIAS_BASE}

####################################### TEST MOCKITO/JUNIT###############################################

%test.chave.token.caixatem=MOCK_TOKEN_CAIXA_TEM
%test.chave.publica.sso.internet=MOCK_TOKEN_SSO_INTRANET
%test.chave.publica.sso.intranet=MOCK_TOKEN_SSO_INTERNET

quarkus.http.test-port=8083
quarkus.http.test-ssl-port=8446

%test.quarkus.datasource.consultapef.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
%test.quarkus.datasource.consultapef.db-kind=consultaPefIdms
%test.quarkus.datasource.consultapef.jdbc.url=MOCK_URL
%test.quarkus.datasource.consultapef.username=MOCK_USER_NAME
%test.quarkus.datasource.consultapef.password=${DATASOURCE_CONSULTAPEF_PASSWORD}

%test.quarkus.datasource.db2.jdbc.driver=com.ibm.db2.jcc.DB2Driver
%test.quarkus.datasource.db2.db-kind=db2
%test.quarkus.datasource.db2.jdbc.url=MOCK_URL
%test.quarkus.datasource.db2.username=MOCK_USER_NAME
%test.quarkus.datasource.db2.password=${DATASOURCE_DB2_PASSWORD}

%test.quarkus.datasource.consulta.jdbc.driver=ca.idms.jdbc.IdmsJdbcDriver
%test.quarkus.datasource.consulta.db-kind=consultaIdms
%test.quarkus.datasource.consulta.jdbc.url==MOCK_URL
%test.quarkus.datasource.consulta.username=MOCK_USER_NAME
%test.quarkus.datasource.consulta.password=${DATASOURCE_CONSULTA_PASSWORD}
%test.quarkus.log.level=ERROR

%test.idms.codigo.dialogo=515
%test.idms.sureg=TA
%test.idms.alias.base=PEF


#######################################FIM ################################################################


#########################################################################################################

# Swagger-ui
quarkus.swagger-ui.path=/swagger-ui
quarkus.swagger-ui.always-include=true
quarkus.swagger-ui.enable=true
quarkus.swagger-ui.theme=material
#original, feeling-blue, flattop, material, monokai, muted, newspaper, outline

# LOG
quarkus.log.level=${LEVEL_LOG_APP}
quarkus.log.console.enable=true
quarkus.log.file.enable=true
quarkus.log.category."io.quarkus.smallrye".level=INFO
quarkus.log.category."io.quarkus".level=INFO


############################
#### API MANAGER CONFIG ####
############################

# Caixa API Manager
#api.manager.url=https://api.des.caixa:8443/
api.manager.key=l7cf7839a6152c496da545ec6d05789810

#############################
#### INTERFACES EXTERNAS ####
#############################

# SIISO
#siiso-api.url=${SIISO_URL}
#siiso-api.manager.url=${api.manager.url}informacoes-sociais/
#siiso-api/mp-rest/url=${siiso-api.manager.url:${siiso-api.url}}
#siiso-api/mp-rest/scope=javax.inject.Singleton
#%dev.siiso-api/mp-rest/trustStore=${truststore.file}
#%dev.siiso-api/mp-rest/trustStorePassword=${truststore.password}
#%dev.siiso-api/mp-rest/trustStoreFileType=JKS
quarkus.smallrye-jwt.enabled=false
#quarkus.resteasy.path=/
#mp.jwt.verify.issuer=https://logindes.caixa.gov.br/auth/realms/internet

#############################
#### IBM MQ ####
#############################

quarkus.siofg.ibm.mq.host=${DATASOURCE_MQ_HOST}
quarkus.siofg.ibm.mq.port=${DATASOURCE_MQ_PORT}
quarkus.siofg.ibm.mq.qmgr=${DATASOURCE_MQ_QMGR}
quarkus.siofg.ibm.mq.channel=${DATASOURCE_MQ_CHANNEL}
quarkus.siofg.ibm.mq.user=${DATASOURCE_MQ_USERNAME}
quarkus.siofg.ibm.mq.password=${QUARKUS_SIOFG_IBM_MQ_PASSWORD}

# Habilita o uso do smallrye-reactive-messaging-jms no Quarkus
quarkus.index-dependency.smallrye-jms.group-id=io.smallrye.reactive
quarkus.index-dependency.smallrye-jms.artifact-id=smallrye-reactive-messaging-jms

mp.messaging.incoming.LISTA_CONTA.connector=smallrye-jms
mp.messaging.incoming.LISTA_CONTA.destination-type=queue
mp.messaging.incoming.LISTA_CONTA_OPTANTE.connector=smallrye-jms
mp.messaging.incoming.LISTA_CONTA_OPTANTE.destination-type=queue
mp.messaging.incoming.LISTA_CONTA_EXTRATO.connector=smallrye-jms
mp.messaging.incoming.LISTA_CONTA_EXTRATO.destination-type=queue
mp.messaging.incoming.LISTA_DADOS_CONTRATO.connector=smallrye-jms
mp.messaging.incoming.LISTA_DADOS_CONTRATO.destination-type=queue
#mp.messaging.incoming.CONSULTA_MORADIA.connector=smallrye-jms
#mp.messaging.incoming.CONSULTA_MORADIA.destination-type=queue

# Configuracao dos nomes da filas
mp.messaging.incoming.LISTA_CONTA.destination=${MQ_DESTINATION_LISTA_CONTA}
mp.messaging.incoming.LISTA_CONTA_OPTANTE.destination=${MQ_DESTINATION_LISTA_CONTA_OPTANTE}
mp.messaging.incoming.LISTA_CONTA_EXTRATO.destination=${MQ_DESTINATION_LISTA_CONTA_EXTRATO}
#mp.messaging.incoming.CONSULTA_MORADIA.destination=${MQ_DESTINATION_CONSULTA_MORADIA}
mp.messaging.incoming.LISTA_DADOS_CONTRATO.destination=${MQ_DESTINATION_DADOS_CONTRATO}

# Configuracao do ConnectionFactory que sera usado por cada Canal
mp.messaging.incoming.LISTA_CONTA_OPTANTE.connection-factory-name=${MQ_CONNECTION_FACTORY_NAME}
mp.messaging.incoming.LISTA_CONTA_EXTRATO.connection-factory-name=${MQ_CONNECTION_FACTORY_NAME}
#mp.messaging.incoming.CONSULTA_MORADIA.connection-factory-name=${MQ_CONNECTION_FACTORY_NAME}










pom;xml

<?xml version="1.0"?>
<project
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd"
	xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.org.caixa</groupId>
	<artifactId>siofg-api</artifactId>
	<version>1.0.0.1</version>
	<properties>
		<compiler-plugin.version>3.11.0</compiler-plugin.version>
		<maven.compiler.release>11</maven.compiler.release>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
		<quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
		<quarkus.platform.version>2.2.1.Final</quarkus.platform.version>

		<skipITs>true</skipITs>
		<surefire-plugin.version>3.0.0</surefire-plugin.version>




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


		<!--MICROPROFILE/dependency Injection CDI 2.0 -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-arc</artifactId>
		</dependency>

		<!-- MICROPROFILE/Document your REST APIs with OpenAPI - comes with Swagger 
			UI -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-openapi</artifactId>
		</dependency>

		<!-- MICROPROFILE/Monitor service health -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-health</artifactId>
		</dependency>

		<!-- REST/endpoint framework implementing JAX-RS and more -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-resteasy</artifactId>
		</dependency>

		<!--REST/JSON-B serialization support for RESTEasy -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-resteasy-jsonb</artifactId>
		</dependency>


		<!-- DATA/Validate object properties (field, getter) and method parameters 
			for your beans (REST, CDI, JPA) -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-hibernate-validator</artifactId>
		</dependency>

		<!--DATA/Pool JDBC database connections (included in Hibernate ORM) -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-agroal</artifactId>
		</dependency>

		<!--DATA/Hibernate ORM REST Data with Panache extension -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-hibernate-orm-rest-data-panache</artifactId>
		</dependency>


		<!--DATA/Connect to the H2 database with JDBC -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-jdbc-h2</artifactId>
		</dependency>

		<!--DATA/Connect to the Microsoft SQL Server database with JDBC <dependency> 
			<groupId>io.quarkus</groupId> <artifactId>quarkus-jdbc-mssql</artifactId> 
			</dependency> -->

		<!--DATA/Connect to the DB2 database via JDBC -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-jdbc-db2</artifactId>
		</dependency>


		<!--DATA/Connect to the IDMS database via JDBC -->
		<dependency>
			<groupId>com.ca.idms</groupId>
			<artifactId>jdbc</artifactId>
			<version>1.0</version>
		</dependency>

		<dependency>
			<groupId>javax.jms</groupId>
			<artifactId>javax.jms-api</artifactId>
			<version>2.0.1</version>
		</dependency>
		<dependency>
			<groupId>com.ibm.mq</groupId>
			<artifactId>com.ibm.mq.allclient</artifactId>
			<version>9.2.0.0</version>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-reactive-messaging</artifactId>
		</dependency>
		<dependency>
			<groupId>io.smallrye.reactive</groupId>
			<artifactId>smallrye-reactive-messaging-jms</artifactId>
			<version>2.0.3</version>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-jwt</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-health</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-openapi</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-resteasy-jsonb</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-metrics</artifactId>
		</dependency>
		
		<!--dependency>
			<groupId>org.hibernate.javax.persistence</groupId>
			<artifactId>hibernate-jpa-2.0-api</artifactId>
			<version>1.0.1.Final</version>
		</dependency-->

		
		<!-- SSO/Verify Bearer access tokens and authenticate users with Authorization 
			Code Flow -->

	<!--		
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-oidc</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-oidc-client</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-oidc-client-filter</artifactId>
		</dependency>
	-->

		<!-- TEST/Quarkus Test Framework JUnit 5 -->
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-junit5</artifactId>
			<scope>test</scope>
		</dependency>

		<!--TEST/Java DSL for easy testing of REST services -->
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
			<scope>test</scope>
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
            <groupId>commons-lang</groupId>
            <artifactId>commons-lang</artifactId>
            <version>2.6</version>
        </dependency>


		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
			<version>3.2.0</version>
		</dependency>


		<dependency>
			<groupId>org.json</groupId>
			<artifactId>json</artifactId>
			<version>20200518</version>
		</dependency>

		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.9.0</version>
		</dependency>

		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<version>3.0</version>
		</dependency>

		<dependency>
			<groupId>com.microsoft.azure</groupId>
			<artifactId>applicationinsights-agent</artifactId>
			<version>3.3.1</version>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.24</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-junit5</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-all</artifactId>
			<version>1.10.19</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.powermock</groupId>
			<artifactId>powermock-module-junit4</artifactId>
			<version>1.6.2</version>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>junit</groupId>
					<artifactId>junit</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>org.powermock</groupId>
			<artifactId>powermock-api-mockito</artifactId>
			<version>1.6.2</version>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.mockito</groupId>
					<artifactId>mockito-all</artifactId>
				</exclusion>
			</exclusions>
		</dependency>


		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa</groupId>
			<artifactId>sifug-core</artifactId>
			<version>01.06.00.002-build</version>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa</groupId>
			<artifactId>sifug-util</artifactId>
			<version>03.03.02.001-correcao</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-jacoco</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.meanbean</groupId>
			<artifactId>meanbean</artifactId>
			<version>2.0.3</version>
			<scope>test</scope>
		</dependency>

		<dependency>

		<groupId>org.jacoco</groupId>
		<artifactId>jacoco-maven-plugin</artifactId>
		<version>0.8.5</version>
		</dependency>

		<dependency>
			<groupId>io.smallrye.config</groupId>
			<artifactId>smallrye-config-source-file-system</artifactId>
			<version>2.4.2</version>
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
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.4</version>
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
								<native.image.path>${project.build.directory}/${project.build.finalName}-runner
								</native.image.path>
								<java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
								<maven.home>${maven.home}</maven.home>
							</systemPropertyVariables>
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
				<quarkus.package.type>native</quarkus.package.type>
			</properties>
		</profile>
	</profiles>
</project>
