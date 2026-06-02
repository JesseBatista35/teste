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
