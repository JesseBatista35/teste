<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.gov.caixa.siemp</groupId>
	<artifactId>siemp</artifactId>
	<version>14.37.0.6</version>
	<packaging>pom</packaging>
	<name>siemp application</name>

	<modules>
		<module>siemp-web</module>
		<module>siemp-ear</module>
	</modules>

	<properties>

		<siemp.version>14.37.0.6</siemp.version>

		<maven.build.timestamp.format>dd/MM/yyyy</maven.build.timestamp.format>
		<dev.build.timestamp>${maven.build.timestamp}</dev.build.timestamp>

		<!-- Java 17 is the common compilation baseline for all Java modules. -->
		<maven.compiler.release>17</maven.compiler.release>

		<!-- Libs IBM -->
		<jmqi.version>1.0</jmqi.version>
		<msg-cliente-jms-detail.version>1.0</msg-cliente-jms-detail.version>

		<!-- Java 17 is the common compilation baseline for all Java modules. -->
		<!--<maven.compiler.release>17</maven.compiler.release>-->
		<!-- [WARNING] Using platform encoding (UTF-8 actually) to copy filtered
			resources, i.e. build is platform dependent! -->
		<!-- Preserve the legacy source/resource encoding during the JDK migration. -->
		<project.build.sourceEncoding>Cp1252</project.build.sourceEncoding>

		<!-- JBoss dependency versions -->
		<jboss.as.plugin.version>7.3.Final</jboss.as.plugin.version>

		<!-- Define the version of JBoss' Java EE 6 APIs and Tools we want to import. -->
		<jboss.bom.version>1.0.4.Final</jboss.bom.version>
		<!-- Alternatively, comment out the above line, and un-comment the line
			below to use version 1.0.2.Final-redhat-1 which is a release certified to
			work with JBoss EAP 6. It requires you have access to the JBoss EAP 6 maven
			repository. -->
		<!-- <jboss.bom.version>1.0.2.Final-redhat-1</jboss.bom.version>> -->
		<!-- other plugin versions -->
		<!--<compiler.plugin.version>2.3.2</compiler.plugin.version>
		<war.plugin.version>2.1.1</war.plugin.version>
		<ear.plugin.version>2.6</ear.plugin.version>-->
		<compiler.plugin.version>3.11.0</compiler.plugin.version>
		<resources.plugin.version>3.3.1</resources.plugin.version>
		<war.plugin.version>3.4.0</war.plugin.version>
		<ear.plugin.version>3.3.0</ear.plugin.version>
		<!-- maven-compiler-plugin -->

		<maven.compiler.target>17</maven.compiler.target>
		<maven.compiler.source>17</maven.compiler.source>
	</properties>

	<dependencyManagement>
		<dependencies>

			<!-- Define the version of the WAR so that we don't need to repeat ourselves
				in every module -->
			<dependency>
				<groupId>br.gov.caixa.siemp</groupId>
				<artifactId>siemp-web</artifactId>
				<version>${siemp.version}</version>
				<type>war</type>
				<scope>compile</scope>
			</dependency>

			<!-- JBoss distributes a complete set of Java EE 6 APIs including a Bill
				of Materials (BOM). A BOM specifies the versions of a "stack" (or a collection)
				of artifacts. We use this here so that we always get the correct versions
				of artifacts. Here we use the jboss-javaee-6.0-with-tools stack (you can
				read this as the JBoss stack of the Java EE 6 APIs, with some extras tools
				for your project, such as Arquillian for testing) and the jboss-javaee-6.0-with-hibernate
				stack you can read this as the JBoss stack of the Java EE 6 APIs, with extras
				from the Hibernate family of projects) -->
			<dependency>
				<groupId>org.jboss.bom</groupId>
				<artifactId>jboss-javaee-6.0-with-tools</artifactId>
				<version>${jboss.bom.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
			<dependency>
				<groupId>org.jboss.bom</groupId>
				<artifactId>jboss-javaee-6.0-with-hibernate</artifactId>
				<version>${jboss.bom.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>

		</dependencies>
	</dependencyManagement>

	<build>
		<pluginManagement>
			<plugins>
				<plugin>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>${compiler.plugin.version}</version>
					<configuration>
						<release>${maven.compiler.release}</release>
						<encoding>${project.build.sourceEncoding}</encoding>
					</configuration>
				</plugin>
				<!-- The JBoss AS plugin deploys your ear to a local JBoss AS container -->
				<!-- Due to Maven's lack of intelligence with EARs we need to configure
					the jboss-as maven plugin to skip deployment for all modules. We then enable
					it specifically in the ear module. -->
				<plugin>
					<groupId>org.jboss.as.plugins</groupId>
					<artifactId>jboss-as-maven-plugin</artifactId>
					<version>${jboss.as.plugin.version}</version>
					<inherited>true</inherited>
					<configuration>
						<skip>true</skip>
					</configuration>
				</plugin>
				<!-- <plugin> <groupId>org.apache.maven.plugins</groupId> <artifactId>maven-release-plugin</artifactId>
					<version>2.2.2</version> <configuration> <tagBase>http://bsbsrvsvncaixa/caixa/emprestimo/sifec/tags/fontes</tagBase>
					</configuration> </plugin> -->
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-resources-plugin</artifactId>
					<version>${resources.plugin.version}</version>
					<configuration>
							<encoding>${project.build.sourceEncoding}</encoding>
        			</configuration>
				</plugin>
			</plugins>
		</pluginManagement>
	</build>

	<profiles>
		<!-- O módulo de modernização é opcional e permanece fora do reactor
		     legado. Ative-o somente quando a pasta estiver disponível. -->
		<profile>
			<id>quarkus</id>
			<modules>
				<module>siemp-quarkus</module>
			</modules>
		</profile>
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

SIEMP-java-web
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
SIEMP-java-web

siemp-ear
src
pom.xml
siemp-quarkus
pom.xml
siemp-web
src
pom.xml
relatorioPosicaoDivida.java
.gitignore
pom.xml

develop

/
pom.xml
pom.xml

Edit

Contents
History
Compare
Blame

5152535455565758596061626364656667686970717273747576777879808182838485868788899091929394
		<!--<maven.compiler.release>17</maven.compiler.release>-->
		<!-- [WARNING] Using platform encoding (UTF-8 actually) to copy filtered
			resources, i.e. build is platform dependent! -->
		<!-- Preserve the legacy source/resource encoding during the JDK migration. -->
		<project.build.sourceEncoding>Cp1252</project.build.sourceEncoding>

		<!-- JBoss dependency versions -->
		<jboss.as.plugin.version>7.3.Final</jboss.as.plugin.version>

		<!-- Define the version of JBoss' Java EE 6 APIs and Tools we want to import. -->

Find

No results
No results found
Expanded

Collapsed
