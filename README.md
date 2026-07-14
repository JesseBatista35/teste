<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

	<modelVersion>4.0.0</modelVersion>

	<groupId>br.gov.caixa.dict</groupId>
	<artifactId>simpi-dict</artifactId>
	<version>${revision}</version>
	<packaging>pom</packaging>

	<modules>
		<module>simpi-dict-ear</module>
		<module>simpi-dict-ejb</module>
		<module>simpi-dict-war</module>
	</modules>

	<properties>
		<revision>1.0.0-SNAPSHOT</revision>
		<java.version>1.8</java.version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

		<!-- other plugin versions -->
		<version.ear.plugin>2.6</version.ear.plugin>
		<version.ejb.plugin>2.4</version.ejb.plugin>
		<version.war.plugin>2.1.1</version.war.plugin>

		<!-- maven-compiler-plugin -->
		<maven.compiler.target>1.8</maven.compiler.target>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.encoding>UTF-8</maven.compiler.encoding>

		<version.feign>9.5.1</version.feign>
		<version.lombok>1.18.28</version.lombok>

		<version.junit>5.10.3</version.junit>
		<version.mockito>3.12.4</version.mockito>

		<version.jacoco.plugin>0.8.12</version.jacoco.plugin>
		<version.surefire.plugin>2.22.2</version.surefire.plugin>

		<version.simpi.commons>1.9.0.0-SNAPSHOT</version.simpi.commons>
	</properties>


	<dependencyManagement>
		<dependencies>

			<dependency>
				<groupId>br.gov.caixa.dict</groupId>
				<artifactId>simpi-dict-ejb</artifactId>
				<version>${project.version}</version>
			</dependency>

			<dependency>
				<groupId>br.gov.caixa.dict</groupId>
				<artifactId>simpi-dict-war</artifactId>
				<version>${project.version}</version>
			</dependency>

			<!-- Test -->
			<dependency>
				<groupId>org.junit.jupiter</groupId>
				<artifactId>junit-jupiter</artifactId>
				<version>${version.junit}</version>
				<scope>test</scope>
			</dependency>

			<dependency>
				<groupId>org.mockito</groupId>
				<artifactId>mockito-inline</artifactId>
				<version>${version.mockito}</version>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>org.mockito</groupId>
				<artifactId>mockito-junit-jupiter</artifactId>
				<version>${version.mockito}</version>
				<scope>test</scope>
			</dependency>

		</dependencies>
	</dependencyManagement>

	<build>
		<pluginManagement>
			<plugins>
				<plugin>
					<groupId>org.jacoco</groupId>
					<artifactId>jacoco-maven-plugin</artifactId>
					<version>${version.jacoco.plugin}</version>
				</plugin>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>${version.surefire.plugin}</version>
				</plugin>
			</plugins>
		</pluginManagement>
		<plugins>
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
				</executions>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
