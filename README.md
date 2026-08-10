<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

	<modelVersion>4.0.0</modelVersion>

	<parent>
		<artifactId>sispi-dict-batch-polling</artifactId>
		<groupId>br.gov.caixa.dict</groupId>
		<version>${revision}</version>
	</parent>

	<artifactId>sispi-dict-batch-polling-ejb</artifactId>
	<name>sispi-dict-batch-polling-ejb</name>
	<packaging>ejb</packaging>

	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
		<failOnMissingWebXml>false</failOnMissingWebXml>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>


	<repositories>
		<repository>
			<id>snapshots</id>
			<url>
				http://binario.caixa:8081/repository/snapshots/
			</url>
			<snapshots>
				<enabled>true</enabled>
			</snapshots>
			<releases>
				<enabled>false</enabled>
			</releases>
		</repository>
	</repositories>


	<dependencies>
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-client</artifactId>
			<scope>provided</scope>
			<version>${resteasy.version}</version>
		</dependency>

		<dependency>
			<groupId>com.microsoft.azure</groupId>
			<artifactId>azure-servicebus</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.dict</groupId>
			<artifactId>simpi-dict-api-model</artifactId>
			<version>2.26.0.0</version>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sispi</groupId>
			<artifactId>sispi-integracao</artifactId>
			<version>2.8.0</version>
		</dependency>

		<dependency>
			<groupId>javax</groupId>
			<artifactId>javaee-api</artifactId>
			<version>8.0</version>
		</dependency>

		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.7.25</version>
		</dependency>

	   <dependency>
	       <groupId>org.slf4j</groupId>
	       <artifactId>slf4j-log4j12</artifactId>
	       <version>1.7.5</version>
	   </dependency>

		<dependency>
			<groupId>io.github.openfeign</groupId>
			<artifactId>feign-okhttp</artifactId>
			<version>${version.feign}</version>
		</dependency>

		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
			<version>4.5.6</version>
		</dependency>

		<dependency>
			<groupId>io.github.openfeign</groupId>
			<artifactId>feign-gson</artifactId>
			<version>${version.feign}</version>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>${version.lombok}</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.0.12.Final</version>
		</dependency>

		<dependency>
			<groupId>io.swagger</groupId>
			<artifactId>swagger-jaxrs</artifactId>
			<version>1.5.7</version>
		</dependency>

		<dependency>
			<groupId>io.xlate</groupId>
			<artifactId>property-inject</artifactId>
			<version>1.0.5</version>
		</dependency>

		<dependency>
			<groupId>org.json</groupId>
			<artifactId>json</artifactId>
			<version>20190722</version>
		</dependency>

		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.5</version>
		</dependency>

		<dependency>
			<groupId>commons-codec</groupId>
			<artifactId>commons-codec</artifactId>
			<version>1.14</version>
		</dependency>

		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
			<version>3.3.0</version>
		</dependency>

		<!-- Test -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-all</artifactId>
			<version>1.10.19</version>
			<scope>test</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-annotations</artifactId>
			<version>2.9.9</version>
		</dependency>

		<dependency>
			<groupId>org.jboss.ejb3</groupId>
			<artifactId>jboss-ejb3-ext-api</artifactId>
			<version>2.2.0.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-multipart-provider</artifactId>
			<version>2.3.6.Final</version>
		</dependency>

		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-jaxrs</artifactId>
			<version>1.9.13</version>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.9.9</version>
		</dependency>

		<dependency>
			<groupId>org.infinispan</groupId>
			<artifactId>infinispan-client-hotrod</artifactId>
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
	</dependencies>



	<build>
		<finalName>${project.artifactId}</finalName>

		<plugins>
			<plugin>
				<artifactId>maven-ejb-plugin</artifactId>
				<version>${version.ejb.plugin}</version>
				<configuration>
					<!-- Tell Maven we are using EJB 3.1 -->
					<ejbVersion>3.1</ejbVersion>
					<archive>
						<manifest>
							<addClasspath>true</addClasspath>
						</manifest>
					</archive>
				</configuration>
			</plugin>

		</plugins>

	</build>


</project>


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

SISPI-dict-batch-polling
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
SISPI-dict-batch-polling

sispi-dict-batch-ear
pom.xml
sispi-dict-batch-ejb
src
main
test
java
br
gov
caixa
spi
dict
component
convert
ejb
enums
factory
integracao
mapper
mdb
scheduler
sibar
util
v2
resources
META-INF

data-dict.sql
persistence.xml
pom.xml
sispi-dict-batch-war
src
.gitignore

1.46.31.00

/
sispi-dict-batch-ejb
/
src
/
test
/
java
/
br
/
gov
/
caixa
/
spi
/
dict
dict

New

Contents
History

component
23 de fev.
8feca793
ref#2435928: Teste unitário: BuscaReivindicacaoBacenComponent, CidsEjb, Confi... c160706
convert
12 de jun.
2cf86ccb
[RTC-24818918] - ajuste sonar Vinicius Vitor das Neves Silva
ejb
quinta-feira
209bee3d
Merge branch 'master' into feature/RTC-24904647-24904532-MED-manual-v8.2 Leandro Khalel Pimentel dos Santos
enums
10 de dez. de 2025
760df989
RTC[24500123] Ajuste teste enum politicas Renan Rodrigues Lacerda
factory
16 de mai. de 2023
c0f45e1e
wip #20753670: PoliticaLimitacaoFactoryTest Mario Henrique Rodrigues Lopes
integracao
25 de mai.
a538816a
[RTC-24746609]: Removendo lançamento de exception no envio da NI do sistema d... f535116
mapper
1 de abr.
a583683a
[RTC-24746609]:Testes unitários e adicionando uma propriedade para poder igno... f535116

mdb
12 de fev.
a17a43e2
ref#2435928: Teste unitário: ArquivoReconciliacaoEjb, FechamentoSolicitacaoDe... c160706
scheduler
15 de jul.
24b6199d
[STRY00033197] desativa polling manual relatos V1 Leandro Khalel Pimentel dos Santos
sibar
6 de fev.
5f5baa0b
ref#2435928: Teste unitário: CanalComunicacaoEjb, HistoricoChaveEjb, SibarEjb c160706
util
26 de mar.
a648ef9d
wip #24709435: validação de nomes pix c161485
v2
27 de mai.
27d71fe8
Ajustes testes Renan Rodrigues Lacerda

