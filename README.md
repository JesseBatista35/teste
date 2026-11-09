<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<parent>
		<artifactId>siemp</artifactId>
		<groupId>br.gov.caixa.siemp</groupId>
		<version>14.37.0.6</version>
	</parent>

	<artifactId>siemp-ear</artifactId>
	<packaging>ear</packaging>

	<name>SIEMP EAR module</name>

	<dependencies>
		<!-- Depend on the ejb module and war so that we can package them -->
		<dependency>
			<groupId>br.gov.caixa.siemp</groupId>
			<artifactId>siemp-web</artifactId>
			<type>war</type>
		</dependency>
	</dependencies>

	<build>
		<finalName>siemp</finalName>
		<resources>
			<resource>
				<directory>src/main/application/META-INF</directory>
				<filtering>true</filtering>
				<includes>
					<include>**/*.xml</include>
				</includes>
			</resource>
		</resources>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-ear-plugin</artifactId>
				<version>${ear.plugin.version}</version>
				<configuration>
					<!-- Tell Maven we are using Java EE 6 -->
					<version>6</version>
					<!-- Use Java EE ear libraries as needed. Java EE ear libraries are 
						in easy way to package any libraries needed in the ear, and automatically 
						have any modules (EJB-JARs and WARs) use them -->
					<defaultLibBundleDir>lib</defaultLibBundleDir>
					<modules>
						<webModule>
							<groupId>br.gov.caixa.siemp</groupId>
							<artifactId>siemp-web</artifactId>
							<uri>siemp-web.war</uri>
							<contextRoot>/siemp</contextRoot>
						</webModule>
					</modules>
					<archive>
						<manifestEntries>
							<Dependencies>
								deployment.framework.jar
							</Dependencies>
						</manifestEntries>
					</archive>
				</configuration>
			</plugin>
			<!-- The JBoss AS plugin deploys your ear to a local JBoss AS container -->
			<!-- Due to Maven's lack of intelligence with EARs we need to configure 
				the jboss-as maven plugin to skip deployment for all modules. We then enable 
				it specifically in the ear module. -->
			<plugin>
				<groupId>org.jboss.as.plugins</groupId>
				<artifactId>jboss-as-maven-plugin</artifactId>
				<configuration>
					<skip>false</skip>
				</configuration>
			</plugin>
		</plugins>
	</build>

	<profiles>
		<profile>
			<id>fabrica</id>
			<distributionManagement>
				<repository>
					<id>releases</id>
					<url>http://10.61.1.208:8081/nexus/content/repositories/releases</url>
				</repository>
				<snapshotRepository>
					<id>snapshots</id>
					<url>http://10.61.1.208:8081/nexus/content/repositories/snapshots</url>
				</snapshotRepository>
			</distributionManagement>
		</profile>
	</profiles>

</project>
