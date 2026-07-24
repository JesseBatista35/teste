<project xmlns="http://maven.apache.org/POM/4.0.0"	
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"	
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>br.gov.caixa.siacc.pix.suporte</groupId>
  <artifactId>SIACC-pixautomatico-mq-suporte</artifactId>
  <version>1.0.18-SNAPSHOT</version>
  <properties>
		<compiler-plugin.version>3.12.1</compiler-plugin.version>
		<maven.compiler.release>17</maven.compiler.release>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
		<quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
		<quarkus.platform.version>3.8.3</quarkus.platform.version>
		<skipITs>true</skipITs>
		<surefire-plugin.version>3.2.5</surefire-plugin.version>
		<timestamp>${maven.build.timestamp}</timestamp>
		<platform-version>${quarkus.platform.version}</platform-version>
		<applicationinsights-agent.version>3.4.15</applicationinsights-agent.version>
	</properties>
	
<!--	<repositories>
		<repository>
			<id>snapshots</id>
			<url>http://binario.caixa:8081/repository/snapshots/</url>
			<snapshots>
			<enabled>true</enabled>
			</snapshots>
			<releases>
			<enabled>false</enabled>
			</releases>
		</repository>
	</repositories>	-->
	
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
		<dependency>
			<groupId>br.gov.caixa.siacc.pix.suporte</groupId>
			<artifactId>SIACC-pixautomatico-api-suporte</artifactId>			
			<version>1.0.179-SNAPSHOT</version>
		</dependency>
		
<!--		<dependency>
			<groupId>br.gov.caixa.siacc.pix.suporte</groupId>
			<artifactId>SIACC-pixautomatico-db-suporte</artifactId>			   
			   <version>[1.0.153-SNAPSHOT,1.1.0-SNAPSHOT)</version>  usar sempre a ultima revisao 1.0.x 
		</dependency>-->

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-inline</artifactId>
			<version>5.2.0</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-panache-mock</artifactId>
			<scope>test</scope>
		</dependency>	
		
		<dependency>
		    <groupId>io.quarkus</groupId>
		    <artifactId>quarkus-smallrye-reactive-messaging</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.apache.activemq</groupId>
			<artifactId>artemis-server</artifactId>
			<!-- <version>2.32.0</version> para jdk 17 -->
			<version>2.32.0</version>
		</dependency>
		
		<dependency>
		    <groupId>io.quarkiverse.artemis</groupId>
		    <artifactId>quarkus-artemis-jms</artifactId>
		    <!-- <version>3.2.1</version> para jdk 17 -->
		    <version>3.1.4</version> <!--  ultima para JDK 11 -->
		</dependency>	
		
		<dependency>
			<groupId>io.smallrye.reactive</groupId>
			<artifactId>smallrye-reactive-messaging-jms</artifactId>
			<!-- <version>4.20.0</version> -->
		</dependency>
		
		 <dependency>
		    <groupId>io.smallrye.reactive</groupId>
		    <artifactId>smallrye-reactive-messaging-jackson</artifactId>
		    <!-- <version>4.20.0</version> -->
		</dependency>
		
		<dependency>
            <groupId>com.ibm.mq</groupId>
            <artifactId>com.ibm.mq.jakarta.client</artifactId>
            <version>9.3.4.1</version>
        </dependency>
        
        <dependency>
            <groupId>org.messaginghub</groupId>
            <artifactId>pooled-jms</artifactId>
            <version>3.1.5</version>
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
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-jar-plugin</artifactId>
				<version>3.1.0</version>
				<configuration>
					<archive>
						<manifest>
							<addClasspath>false</addClasspath>
							<addDefaultImplementationEntries>true</addDefaultImplementationEntries>
							<addDefaultSpecificationEntries>false</addDefaultSpecificationEntries>
						</manifest>
						<manifestEntries>
							<Artifact-Id>${project.artifactId}</Artifact-Id>
							<Build-Time>${maven.build.timestamp}</Build-Time>
							<Platform-Version>${platform-version}</Platform-Version>
						</manifestEntries>
					</archive>
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
								<native.image.path>${project.build.directory}/${project.build.finalName}-runner</native.image.path>
								<java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
								<maven.home>${maven.home}</maven.home>
							</systemPropertyVariables>
						</configuration>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<artifactId>maven-dependency-plugin</artifactId>
				<version>3.6.0</version>
				<executions>
					<execution>
						<id>copy-agent</id>
						<phase>package</phase>
						<goals>
							<goal>copy</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<artifactItems>
						<artifactItem>
							<groupId>com.microsoft.azure</groupId>
							<artifactId>applicationinsights-agent</artifactId>
							<version>${applicationinsights-agent.version}</version>
							<outputDirectory>${project.build.directory}/agent</outputDirectory>
							<destFileName>applicationinsights-agent.jar</destFileName>
						</artifactItem>
					</artifactItems>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.sonarsource.scanner.maven</groupId>
				<artifactId>sonar-maven-plugin</artifactId>
				<version>3.9.0.2155</version>
			</plugin>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.8</version>
				<configuration>
					<append>true</append>
  					<systemPropertyVariables>
				        <jacoco-agent.destfile>target/jacoco.exec</jacoco-agent.destfile>
				    </systemPropertyVariables>					
<!--			        <excludes>
			            <exclude>**/*</exclude>
			        </excludes>					
-->				</configuration>
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
