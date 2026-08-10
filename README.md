<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

	<modelVersion>4.0.0</modelVersion>

	<groupId>br.gov.caixa.dict</groupId>
	<artifactId>sispi-dict-batch-polling</artifactId>
	<version>${revision}</version>
	<packaging>pom</packaging>

	<modules>
		<module>sispi-dict-batch-ear</module>
		<module>sispi-dict-batch-ejb</module>
		<module>sispi-dict-batch-war</module>
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
		<version.lombok>1.18.12</version.lombok>
		<resteasy.version>3.11.2.Final</resteasy.version>
		<mapstruct.version>1.5.5.Final</mapstruct.version>

		<version.infinispan>12.1.7.Final-redhat-00001</version.infinispan>
		
	</properties>

	<dependencyManagement>
		<dependencies>

			<dependency>
				<groupId>br.gov.caixa.dict</groupId>
				<artifactId>sispi-dict-batch-polling-ejb</artifactId>
				<version>${project.version}</version>
			</dependency>

			<dependency>
				<groupId>br.gov.caixa.dict</groupId>
				<artifactId>sispi-dict-batch-polling-war</artifactId>
				<version>${project.version}</version>
			</dependency>

			<dependency>
				<groupId>org.infinispan</groupId>
				<artifactId>infinispan-bom</artifactId>
				<version>${version.infinispan}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>

			<dependency>
				<groupId>com.microsoft.azure</groupId>
				<artifactId>azure-servicebus</artifactId>
				<version>3.6.7</version>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<build>
		<plugins>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<executions>
					<execution>
						<id>agent-for-ut</id>
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
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<compilerArgs>
						<arg>-parameters</arg>
					</compilerArgs>
					<annotationProcessorPaths>
						<path>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
							<version>${version.lombok}</version>
						</path>
						<path>
							<groupId>org.mapstruct</groupId>
							<artifactId>mapstruct-processor</artifactId>
							<version>${mapstruct.version}</version>
						</path>
					</annotationProcessorPaths>
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
sispi-dict-batch-ejb
sispi-dict-batch-war
.0.current
.gitignore
compile.bat
jboss-deployments
pom.xml
readme.md

1.46.31.00

/
pom.xml
pom.xml

Edit

Contents
History
Compare
Blame

1234567891011121314151617181920212223242526272829303132333435363738394041424344
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">

	<modelVersion>4.0.0</modelVersion>

	<groupId>br.gov.caixa.dict</groupId>
	<artifactId>sispi-dict-batch-polling</artifactId>
	<version>${revision}</version>
…						</path>
					</annotationProcessorPaths>
				</configuration>
			</plugin>

		</plugins>
	</build>

</project>

