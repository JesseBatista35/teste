<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

	<modelVersion>4.0.0</modelVersion>

	<parent>
		<groupId>br.gov.caixa.dict</groupId>
		<artifactId>simpi-dict</artifactId>
		<version>${revision}</version>
	</parent>

	<artifactId>simpi-dict-ejb</artifactId>
	<name>simpi-dict-ejb</name>
	<packaging>ejb</packaging>

	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
		<swagger-annotations.version>1.5.21</swagger-annotations.version>
		<failOnMissingWebXml>false</failOnMissingWebXml>
		<openapi-generator.version>4.0.0</openapi-generator.version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<package.mpi.dict>br.gov.caixa.mpi.dict</package.mpi.dict>
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
			<version>3.11.2.Final</version>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.jaxrs</groupId>
			<artifactId>jackson-jaxrs-xml-provider</artifactId>
			<version>2.9.6</version>
		</dependency>
        
        <dependency>
            <groupId>org.jdom</groupId>
            <artifactId>jdom</artifactId>
            <version>2.0.2</version>
        </dependency>
        
		<dependency>
			<groupId>br.gov.caixa.dict</groupId>
			<artifactId>simpi-dict-api-model</artifactId>
			<version>2.24.0.0</version>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sispi</groupId>
			<artifactId>sispi-dict-dto-bacen</artifactId>
			<version>1.1.0.0</version>
		</dependency>

		<dependency>
			<groupId>io.swagger</groupId>
			<artifactId>swagger-jaxrs</artifactId>
			<version>${swagger-annotations.version}</version>
			<exclusions>
				<exclusion>
					<groupId>javax.ws.rs</groupId>
					<artifactId>jsr311-api</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>javax</groupId>
			<artifactId>javaee-api</artifactId>
			<version>8.0</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
			<version>3.3.0</version>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>${version.lombok}</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>io.github.openfeign</groupId>
			<artifactId>feign-jaxb</artifactId>
			<version>${version.feign}</version>
		</dependency>

		<dependency>
			<groupId>io.github.openfeign</groupId>
			<artifactId>feign-slf4j</artifactId>
			<version>${version.feign}</version>
		</dependency>
		
		<dependency>
		    <groupId>io.github.openfeign</groupId>
		    <artifactId>feign-httpclient</artifactId>
		    <version>${version.feign}</version>
		</dependency>

	  	<dependency>
			<groupId>io.dinamonetworks.sdk</groupId>
            <artifactId>dinamo-hsm</artifactId>
            <version>4.10.2</version>
		</dependency>
		
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.5</version>
		</dependency>
		
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.0.12.Final</version>
			<exclusions>
			    <exclusion>
			        <groupId>dom4j</groupId>
			        <artifactId>dom4j</artifactId>
			    </exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>org.json</groupId>
			<artifactId>json</artifactId>
			<version>20200518</version>
		</dependency>
	
		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
			<version>4.5.6</version>
		</dependency>

		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
			<version>1.7.5</version>
		</dependency>


		<!-- Test -->
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-inline</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-junit-jupiter</artifactId>
			<scope>test</scope>
		</dependency>



		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.1</version>
			<scope>test</scope>
		</dependency>


		<dependency>
			<groupId>javax.activation</groupId>
			<artifactId>activation</artifactId>
			<version>1.1.1</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.glassfish.jaxb</groupId>
			<artifactId>jaxb-runtime</artifactId>
			<version>2.3.8</version>
			<scope>test</scope>
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
