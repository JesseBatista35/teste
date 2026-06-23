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

SIGPD-backend
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
SIGPD-backend

.jpb
api
batch
core
ear
lib
.gitignore
pom.xml
README.md
RESUMO_FLUXOS_DECLARACAO.txt

release/sp58-ronaldo

/
pom.xml
pom.xml

Edit

Contents
History
Compare
Blame


Ajusta POM version
71c779fa
f710695
21 de mai. at 11:33
edit
mudar versao
a887e227
f710695
14 de jan. at 16:26
edit
failed

retrona pom
ad9fd016
f710695
14 de jan. at 14:47
edit
Ajuste versionapp no pom
de4a84dc
f710695
14 de jan. at 10:11
edit
succeeded
WIP
8b5d9b1b
f710695
8 de dez. de 2025 at 10:04
edit
sonar.coverage.exclusions src/test/java/br/gov/caixa/**/*
c2cd3257
f756415
1 de out. de 2024 at 09:59
edit
Habilitar Testes unitários
071d08a8
f756415
9 de ago. de 2024 at 08:17
edit
Versão anterior está com vulnerabilidades públicas.
ed0a2e74
f756415
23 de nov. de 2023 at 16:50
edit
[FIX] Ajustes do SONAR para a aplicação voltar a funcionar após os MERGES dos '45 dias'
20199f9c
CesarDraw
17 de jul. de 2023 at 08:49
edit
[Merge] Primeiro Merge da develop com a versão de TQS
398a0533
CesarDraw
25 de abr. de 2023 at 17:47
edit
Ajuste no pom
609c1a2c
f643399
19 de abr. de 2023 at 18:06
edit
[SONAR] Ajustes - 03
c33f98e1
CesarDraw
17 de mar. de 2023 at 11:04
edit
[SONAR] Ajustes - 02
7dce5aca
CesarDraw
17 de mar. de 2023 at 11:00
edit
Showing 102 items.

Finished loading items

Expanded

Searching...

Showing 7 filtered items.

Showing 7 filtered items.

Collapsed

ultima alteração foi  21 de maio 


atualmente ele ta assim:

<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<name>SIGPD</name>

	<groupId>br.gov.caixa.sigpd</groupId>
	<artifactId>sigpd</artifactId>
	<version>3.4.2.10</version>
	<packaging>pom</packaging>

	<modules>
		<module>ear</module>
		<module>core</module>
		<module>api</module>
		<module>batch</module>
	</modules>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<maven.compiler.target>${java.version}</maven.compiler.target>
		<maven.compiler.source>${java.version}</maven.compiler.source>
		<maven.build.timestamp.format>dd/MM/yyyy HH:mm::ss</maven.build.timestamp.format>
		<dev.build.timestamp>${maven.build.timestamp}</dev.build.timestamp>

		<java.version>1.8</java.version>
		<jee.version>7.0</jee.version>
		<lombok.version>1.18.10</lombok.version>
		<swagger.version>1.6.1</swagger.version>
		<oracle.version>12.2.0.1</oracle.version>
		<junit.version>4.12</junit.version>
		<mockito.version>3.1.0</mockito.version>
		<hamcrest.version>2.2</hamcrest.version>
		<powermock.version>2.0.7</powermock.version>
		<glassfish.embedded.version>3.1</glassfish.embedded.version>
		<hibernate.version>6.0.2.Final</hibernate.version>
		<jackson.version>2.13.3</jackson.version>
		<jackson.datatype>2.6.0</jackson.datatype>
		<jboss.resteasy>3.0.16.Final</jboss.resteasy>
		<apache.commons.lang>3.11</apache.commons.lang>
		<version.weld-junit>4.0.0.Final</version.weld-junit>
		<graalvm.version>20.2.0</graalvm.version>

		<maven.compiler.plugin.version>3.8.1</maven.compiler.plugin.version>
		<maven.ear.plugin.version>3.0.2</maven.ear.plugin.version>
		<maven.ejb.plugin.version>3.2.1</maven.ejb.plugin.version>
		<maven.surefire.plugin.version>2.16</maven.surefire.plugin.version>
		<maven.war.plugin.version>2.5</maven.war.plugin.version>

		<sonar.coverage.exclusions>
			src/main/java/br/gov/caixa/sigpd/api/commons/**/*,
			src/main/java/br/gov/caixa/sigpd/api/controllers/**/*,
			src/main/java/br/gov/caixa/sigpd/api/hipoteses/repositories/**/*,
			src/main/java/br/gov/caixa/sigpd/api/possibilidades/repositories/**,
			src/main/java/br/gov/caixa/sigpd/api/finalidades/repositories/**,
			src/main/java/br/gov/caixa/sigpd/api/trilhaauditoria/repositories/**,
			src/main/java/br/gov/caixa/sigpd/api/possibilidades/bloqueios/repositories/**/*,
			src/main/java/br/gov/caixa/sigpd/api/possibilidades/consentimentos/repositories/**/*,
			src/main/java/br/gov/caixa/sigpd/api/tiposdado/repositories/**,
			src/main/java/br/gov/caixa/sigpd/api/mensageria/**/*,
			src/main/java/br/gov/caixa/sigpd/api/infraestrutura/seguranca/**/*,
			src/main/java/br/gov/caixa/sigpd/core/**/*,
			src/main/java/br/gov/caixa/sigpd/api/ApplicationApi.java,
			src/test/java/br/gov/caixa/**/*
		</sonar.coverage.exclusions>
	</properties>

	<dependencyManagement>
		<dependencies>

			<dependency>
				<groupId>br.gov.caixa.sigpd.core</groupId>
				<artifactId>sigpd-core</artifactId>
				<version>${project.version}</version>
				<type>jar</type>
				<scope>compile</scope>
			</dependency>

			<dependency>
				<groupId>br.gov.caixa.sigpd.api</groupId>
				<artifactId>sigpd-api</artifactId>
				<version>${project.version}</version>
				<type>war</type>
				<scope>compile</scope>
			</dependency>

			<dependency>
				<groupId>br.gov.caixa.sigpd.batch</groupId>
				<artifactId>sigpd-batch</artifactId>
				<version>${project.version}</version>
				<type>ejb</type>
			</dependency>

			<dependency>
				<groupId>javax</groupId>
				<artifactId>javaee-api</artifactId>
				<version>${jee.version}</version>
				<scope>provided</scope>
			</dependency>

			<dependency>
				<groupId>org.apache.commons</groupId>
				<artifactId>commons-lang3</artifactId>
				<version>${apache.commons.lang}</version>
			</dependency>

			<dependency>
				<groupId>org.projectlombok</groupId>
				<artifactId>lombok</artifactId>
				<version>${lombok.version}</version>
				<scope>provided</scope>
			</dependency>

			<dependency>
				<groupId>io.swagger</groupId>
				<artifactId>swagger-core</artifactId>
				<version>${swagger.version}</version>
				<scope>compile</scope>
			</dependency>

			<dependency>
				<groupId>io.xlate</groupId>
				<artifactId>property-inject</artifactId>
				<version>1.0.5</version>
			</dependency>

			<dependency>
				<groupId>com.auth0</groupId>
				<artifactId>java-jwt</artifactId>
				<version>3.3.0</version>
			</dependency>
			
			<dependency>
				<groupId>org.json</groupId>
				<artifactId>json</artifactId>
				<version>20231013</version>
			</dependency>

			<dependency>
				<groupId>io.swagger</groupId>
				<artifactId>swagger-jaxrs</artifactId>
				<version>${swagger.version}</version>
				<exclusions>
					<exclusion>
						<groupId>javax.ws.rs</groupId>
						<artifactId>jsr311-api</artifactId>
					</exclusion>
				</exclusions>
			</dependency>

			<dependency>
				<groupId>io.swagger</groupId>
				<artifactId>swagger-annotations</artifactId>
				<version>${swagger.version}</version>
			</dependency>

			<dependency>
				<groupId>org.hibernate</groupId>
				<artifactId>hibernate-validator</artifactId>
				<version>${hibernate.version}</version>
				<scope>compile</scope>
			</dependency>

			<dependency>
				<groupId>org.hibernate</groupId>
				<artifactId>hibernate-core</artifactId>
				<version>${hibernate.version}</version>
				<scope>compile</scope>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.core</groupId>
				<artifactId>jackson-databind</artifactId>
				<version>${jackson.version}</version>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.core</groupId>
				<artifactId>jackson-core</artifactId>
				<version>${jackson.version}</version>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.core</groupId>
				<artifactId>jackson-annotations</artifactId>
				<version>${jackson.version}</version>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.datatype</groupId>
				<artifactId>jackson-datatype-hibernate4</artifactId>
				<version>${jackson.version}</version>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.jaxrs</groupId>
				<artifactId>jackson-jaxrs-json-provider</artifactId>
				<version>${jackson.version}</version>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.datatype</groupId>
				<artifactId>jackson-datatype-jsr310</artifactId>
				<version>${jackson.datatype}</version>
			</dependency>

			<dependency>
				<groupId>org.jboss.resteasy</groupId>
				<artifactId>resteasy-client</artifactId>
				<version>${jboss.resteasy}</version>
				<scope>provided</scope>
			</dependency>

			<dependency>
				<groupId>org.jboss.resteasy</groupId>
				<artifactId>resteasy-jaxrs</artifactId>
				<version>${jboss.resteasy}</version>
				<scope>provided</scope>
			</dependency>

			<dependency>
				<groupId>org.jboss.resteasy</groupId>
				<artifactId>resteasy-multipart-provider</artifactId>
				<version>${jboss.resteasy}</version>
				<scope>provided</scope>
			</dependency>
			
			<!-- Testes Unitários -->
			<dependency>
				<groupId>junit</groupId>
				<artifactId>junit</artifactId>
				<version>${junit.version}</version>
				<scope>test</scope>
			</dependency>

			<dependency>
				<groupId>org.mockito</groupId>
				<artifactId>mockito-core</artifactId>
				<version>${mockito.version}</version>
				<scope>test</scope>
			</dependency>

			<dependency>
				<groupId>org.hamcrest</groupId>
				<artifactId>hamcrest</artifactId>
				<version>${hamcrest.version}</version>
				<scope>test</scope>
			</dependency>

			<dependency>
				<groupId>org.glassfish.extras</groupId>
				<artifactId>glassfish-embedded-all</artifactId>
				<version>${glassfish.embedded.version}</version>
				<scope>test</scope>
			</dependency>

			<dependency>
				<groupId>org.powermock</groupId>
				<artifactId>powermock-api-mockito2</artifactId>
				<version>${powermock.version}</version>
				<scope>test</scope>
			</dependency>

			<dependency>
				<groupId>org.powermock</groupId>
				<artifactId>powermock-module-junit4</artifactId>
				<version>${powermock.version}</version>
				<scope>test</scope>
			</dependency>
			
		</dependencies>
	</dependencyManagement>

	<profiles>
		<profile>
			<id>default</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<build>
				<plugins>
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
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-surefire-plugin</artifactId>
						<version>2.16</version>
						<configuration>
							<skipTests>false</skipTests>
						</configuration>
					</plugin>
				</plugins>
			</build>
		</profile>
	</profiles>

</project>
