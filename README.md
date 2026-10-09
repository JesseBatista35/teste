
-sh-4.2$
-sh-4.2$ oc exec $P -- /opt/jboss/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=siatcDS:test-connection-in-pool"
{
    "outcome" => "failed",
    "failure-description" => "WFLYJCA0040: failed to invoke operation: WFLYJCA0047: Connection is not valid",
    "rolled-back" => true
}
command terminated with exit code 1
-sh-4.2$
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>br.gov.caixa</groupId>
	<artifactId>loginunico</artifactId>
	<version>2.0.0.0</version>
	<packaging>war</packaging>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<maven.compiler.target>1.8</maven.compiler.target>
		<maven.compiler.source>1.8</maven.compiler.source>
		<rewrite.version>3.4.1.Final</rewrite.version>
	</properties>

	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.jboss.spec</groupId>
				<artifactId>jboss-javaee-all-7.0</artifactId>
				<version>1.0.4.Final</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
	<dependencies>
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>
		<dependency>
			<groupId>javax.enterprise</groupId>
			<artifactId>cdi-api</artifactId>
			<scope>compile</scope>
		</dependency>
		<dependency>
			<groupId>org.jboss.spec.javax.servlet</groupId>
			<artifactId>jboss-servlet-api_3.1_spec</artifactId>
			<scope>compile</scope>
		</dependency>
		<dependency>
			<groupId>org.jboss.spec.javax.ws.rs</groupId>
			<artifactId>jboss-jaxrs-api_2.0_spec</artifactId>
			<scope>compile</scope>
		</dependency>
		<dependency>
			<groupId>org.jboss.spec.javax.faces</groupId>
			<artifactId>jboss-jsf-api_2.2_spec</artifactId>
			<scope>compile</scope>
		</dependency>
		<dependency>
			<groupId>org.jboss.spec.javax.annotation</groupId>
			<artifactId>jboss-annotations-api_1.2_spec</artifactId>
			<scope>compile</scope>
		</dependency>

		<!-- Import the RichFaces core library -->
		<dependency>
			<groupId>org.richfaces</groupId>
			<artifactId>richfaces</artifactId>
			<version>4.5.9.Final</version>
		</dependency>

		<dependency>
			<groupId>org.ocpsoft.rewrite</groupId>
			<artifactId>rewrite-servlet</artifactId>
			<version>${rewrite.version}</version><!--$NO-MVN-MAN-VER$ -->
		</dependency>
		<dependency>
			<groupId>org.ocpsoft.rewrite</groupId>
			<artifactId>rewrite-integration-faces</artifactId>
			<version>${rewrite.version}</version>
		</dependency>
		<dependency>
			<groupId>org.ocpsoft.rewrite</groupId>
			<artifactId>rewrite-config-prettyfaces</artifactId>
			<version>${rewrite.version}</version>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa</groupId>
			<artifactId>jaas-module</artifactId>
			<version>1.0.0</version>
		</dependency>

		<dependency>
			<groupId>com.indra</groupId>
			<artifactId>indra-mainframe</artifactId>
			<version>1.0.8</version>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>2.6</version>
				<configuration>
					<archive>
						<manifest>
							<addDefaultImplementationEntries>true</addDefaultImplementationEntries>
						</manifest>
					</archive>
				</configuration>
			</plugin>
		</plugins>
	</build>

	<profiles>
		<profile>
			<id>indra</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<distributionManagement>
				<repository>
					<id>releases</id>
					<url>http://nexus.sispcs.web:8081/nexus/content/repositories/releases</url>
				</repository>
				<snapshotRepository>
					<id>snapshots</id>
					<url>http://nexus.sispcs.web:8081/nexus/content/repositories/snapshots</url>
				</snapshotRepository>
			</distributionManagement>
		</profile>
		<profile>
			<id>artefatos.pedes.caixa</id>
			<activation>
				<activeByDefault>false</activeByDefault>
			</activation>
			<distributionManagement>
				<repository>
					<id>artefatos.pedes.caixa</id>
					<url>http://artefatos.pedes.caixa/nexus/content/repositories/releases</url>
				</repository>
				<snapshotRepository>
					<id>artefatos.pedes.caixa</id>
					<url>http://artefatos.pedes.caixa/nexus/content/repositories/snapshots</url>
				</snapshotRepository>
			</distributionManagement>
		</profile>
		<profile>
			<id>source-doc</id>
			<build>
				<plugins>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-source-plugin</artifactId>
						<executions>
							<execution>
								<id>attach-sources</id>
								<goals>
									<goal>jar</goal>
								</goals>
							</execution>
						</executions>
					</plugin>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-javadoc-plugin</artifactId>
						<executions>
							<execution>
								<id>attach-javadocs</id>
								<goals>
									<goal>jar</goal>
								</goals>
							</execution>
						</executions>
					</plugin>
				</plugins>
			</build>
		</profile>
	</profiles>
</project>
