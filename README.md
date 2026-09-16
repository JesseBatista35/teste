<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.7.13</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>

	<groupId>br.gov.caixa</groupId>
	<artifactId>monitora</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>monitoramento</name>
	<description>Processo de ajustes SICFD </description>

	<properties>
		<java.version>1.8</java.version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-batch</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-rest</artifactId>
		</dependency>
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc8</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
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
		</plugins>
	</build>
</project>



spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@10.116.101.7:1521/orad01sc
spring.datasource.username=SCFDRD01
spring.datasource.password=${SCFDRD01_ORACLE}

spring.batch.job.enabled=false
logging.level.root=INFO

#Spring Boot cria as tabelas automaticamente utilizadas pelo spring batch ex.BATCH_JOB_INSTANCE
#com o prefixo CFD.CFD
spring.batch.initialize-schema=always
spring.batch.jdbc.table-prefix=CFD.CFD_BCH_

logging.file.name=/logs/batch-delete.log

# Quantidade máxima de registros por execução
batch.qtde-registros=5
