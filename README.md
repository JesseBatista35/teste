####
# This Dockerfile is used in order to build a container that runs the Quarkus application in JVM mode
#
# Before building the container image run:
#
# ./mvnw package
#
# Then, build the image with:
#
# docker build -f src/main/docker/Dockerfile.jvm -t quarkus/simtr-template-api-jvm .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 quarkus/simtr-template-api-jvm
#
# If you want to include the debug port into your docker image
# you will have to expose the debug port (default 5005) like this :  EXPOSE 8080 5005
#
# Then run the container using :
#
# docker run -i --rm -p 8080:8080 quarkus/simtr-template-api-jvm
#
# This image uses the `run-java.sh` script to run the application.
# This scripts computes the command line to execute your Java application, and
# includes memory/GC tuning.
# You can configure the behavior using the following environment properties:
# - JAVA_OPTS: JVM options passed to the `java` command (example: "-verbose:class")
# - JAVA_OPTS_APPEND: User specified Java options to be appended to generated options
#   in JAVA_OPTS (example: "-Dsome.property=foo")
# - JAVA_MAX_MEM_RATIO: Is used when no `-Xmx` option is given in JAVA_OPTS. This is
#   used to calculate a default maximal heap memory based on a containers restriction.
#   If used in a container without any memory constraints for the container then this
#   option has no effect. If there is a memory constraint then `-Xmx` is set to a ratio
#   of the container available memory as set here. The default is `50` which means 50%
#   of the available memory is used as an upper boundary. You can skip this mechanism by
#   setting this value to `0` in which case no `-Xmx` option is added.
# - JAVA_INITIAL_MEM_RATIO: Is used when no `-Xms` option is given in JAVA_OPTS. This
#   is used to calculate a default initial heap memory based on the maximum heap memory.
#   If used in a container without any memory constraints for the container then this
#   option has no effect. If there is a memory constraint then `-Xms` is set to a ratio
#   of the `-Xmx` memory as set here. The default is `25` which means 25% of the `-Xmx`
#   is used as the initial heap size. You can skip this mechanism by setting this value
#   to `0` in which case no `-Xms` option is added (example: "25")
# - JAVA_MAX_INITIAL_MEM: Is used when no `-Xms` option is given in JAVA_OPTS.
#   This is used to calculate the maximum value of the initial heap memory. If used in
#   a container without any memory constraints for the container then this option has
#   no effect. If there is a memory constraint then `-Xms` is limited to the value set
#   here. The default is 4096MB which means the calculated value of `-Xms` never will
#   be greater than 4096MB. The value of this variable is expressed in MB (example: "4096")
# - JAVA_DIAGNOSTICS: Set this to get some diagnostics information to standard output
#   when things are happening. This option, if set to true, will set
#  `-XX:+UnlockDiagnosticVMOptions`. Disabled by default (example: "true").
# - JAVA_DEBUG: If set remote debugging will be switched on. Disabled by default (example:
#    true").
# - JAVA_DEBUG_PORT: Port used for remote debugging. Defaults to 5005 (example: "8787").
# - CONTAINER_CORE_LIMIT: A calculated core limit as described in
#   https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt. (example: "2")
# - CONTAINER_MAX_MEMORY: Memory limit given to the container (example: "1024").
# - GC_MIN_HEAP_FREE_RATIO: Minimum percentage of heap free after GC to avoid expansion.
#   (example: "20")
# - GC_MAX_HEAP_FREE_RATIO: Maximum percentage of heap free after GC to avoid shrinking.
#   (example: "40")
# - GC_TIME_RATIO: Specifies the ratio of the time spent outside the garbage collection.
#   (example: "4")
# - GC_ADAPTIVE_SIZE_POLICY_WEIGHT: The weighting given to the current GC time versus
#   previous GC times. (example: "90")
# - GC_METASPACE_SIZE: The initial metaspace size. (example: "20")
# - GC_MAX_METASPACE_SIZE: The maximum metaspace size. (example: "100")
# - GC_CONTAINER_OPTIONS: Specify Java GC to use. The value of this variable should
#   contain the necessary JRE command-line options to specify the required GC, which
#   will override the default of `-XX:+UseParallelGC` (example: -XX:+UseG1GC).
# - HTTPS_PROXY: The location of the https proxy. (example: "myuser@127.0.0.1:8080")
# - HTTP_PROXY: The location of the http proxy. (example: "myuser@127.0.0.1:8080")
# - NO_PROXY: A comma separated lists of hosts, IP addresses or domains that can be
#   accessed directly. (example: "foo.example.com,bar.example.com")
#
###
FROM image-registry.openshift-image-registry.svc:5000/openshift/ubi8-openjdk-17-runtime:1.12

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'


# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --chown=185 target/quarkus-app/lib/ /deployments/lib/
COPY --chown=185 target/quarkus-app/*.jar /deployments/
COPY --chown=185 target/quarkus-app/app/ /deployments/app/
COPY --chown=185 target/quarkus-app/quarkus/ /deployments/quarkus/

EXPOSE 8080
USER 185
ENV AB_JOLOKIA_OFF=""
ENV JAVA_OPTS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"


-----


legacy


####
# This Dockerfile is used in order to build a container that runs the Quarkus application in JVM mode
#
# Before building the container image run:
#
# ./mvnw package -Dquarkus.package.type=legacy-jar
#
# Then, build the image with:
#
# docker build -f src/main/docker/Dockerfile.legacy-jar -t quarkus/simtr-template-api-legacy-jar .
#
# Then run the container using:
#
# docker run -i --rm -p 8080:8080 quarkus/simtr-template-api-legacy-jar
#
# If you want to include the debug port into your docker image
# you will have to expose the debug port (default 5005) like this :  EXPOSE 8080 5005
#
# Then run the container using :
#
# docker run -i --rm -p 8080:8080 quarkus/simtr-template-api-legacy-jar
#
# This image uses the `run-java.sh` script to run the application.
# This scripts computes the command line to execute your Java application, and
# includes memory/GC tuning.
# You can configure the behavior using the following environment properties:
# - JAVA_OPTS: JVM options passed to the `java` command (example: "-verbose:class")
# - JAVA_OPTS_APPEND: User specified Java options to be appended to generated options
#   in JAVA_OPTS (example: "-Dsome.property=foo")
# - JAVA_MAX_MEM_RATIO: Is used when no `-Xmx` option is given in JAVA_OPTS. This is
#   used to calculate a default maximal heap memory based on a containers restriction.
#   If used in a container without any memory constraints for the container then this
#   option has no effect. If there is a memory constraint then `-Xmx` is set to a ratio
#   of the container available memory as set here. The default is `50` which means 50%
#   of the available memory is used as an upper boundary. You can skip this mechanism by
#   setting this value to `0` in which case no `-Xmx` option is added.
# - JAVA_INITIAL_MEM_RATIO: Is used when no `-Xms` option is given in JAVA_OPTS. This
#   is used to calculate a default initial heap memory based on the maximum heap memory.
#   If used in a container without any memory constraints for the container then this
#   option has no effect. If there is a memory constraint then `-Xms` is set to a ratio
#   of the `-Xmx` memory as set here. The default is `25` which means 25% of the `-Xmx`
#   is used as the initial heap size. You can skip this mechanism by setting this value
#   to `0` in which case no `-Xms` option is added (example: "25")
# - JAVA_MAX_INITIAL_MEM: Is used when no `-Xms` option is given in JAVA_OPTS.
#   This is used to calculate the maximum value of the initial heap memory. If used in
#   a container without any memory constraints for the container then this option has
#   no effect. If there is a memory constraint then `-Xms` is limited to the value set
#   here. The default is 4096MB which means the calculated value of `-Xms` never will
#   be greater than 4096MB. The value of this variable is expressed in MB (example: "4096")
# - JAVA_DIAGNOSTICS: Set this to get some diagnostics information to standard output
#   when things are happening. This option, if set to true, will set
#  `-XX:+UnlockDiagnosticVMOptions`. Disabled by default (example: "true").
# - JAVA_DEBUG: If set remote debugging will be switched on. Disabled by default (example:
#    true").
# - JAVA_DEBUG_PORT: Port used for remote debugging. Defaults to 5005 (example: "8787").
# - CONTAINER_CORE_LIMIT: A calculated core limit as described in
#   https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt. (example: "2")
# - CONTAINER_MAX_MEMORY: Memory limit given to the container (example: "1024").
# - GC_MIN_HEAP_FREE_RATIO: Minimum percentage of heap free after GC to avoid expansion.
#   (example: "20")
# - GC_MAX_HEAP_FREE_RATIO: Maximum percentage of heap free after GC to avoid shrinking.
#   (example: "40")
# - GC_TIME_RATIO: Specifies the ratio of the time spent outside the garbage collection.
#   (example: "4")
# - GC_ADAPTIVE_SIZE_POLICY_WEIGHT: The weighting given to the current GC time versus
#   previous GC times. (example: "90")
# - GC_METASPACE_SIZE: The initial metaspace size. (example: "20")
# - GC_MAX_METASPACE_SIZE: The maximum metaspace size. (example: "100")
# - GC_CONTAINER_OPTIONS: Specify Java GC to use. The value of this variable should
#   contain the necessary JRE command-line options to specify the required GC, which
#   will override the default of `-XX:+UseParallelGC` (example: -XX:+UseG1GC).
# - HTTPS_PROXY: The location of the https proxy. (example: "myuser@127.0.0.1:8080")
# - HTTP_PROXY: The location of the http proxy. (example: "myuser@127.0.0.1:8080")
# - NO_PROXY: A comma separated lists of hosts, IP addresses or domains that can be
#   accessed directly. (example: "foo.example.com,bar.example.com")
#
###
FROM image-registry.openshift-image-registry.svc:5000/openshift/ubi8-openjdk-17-runtime:1.12

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'


COPY target/lib/* /deployments/lib/
COPY target/*-runner.jar /deployments/quarkus-run.jar

EXPOSE 8080
USER 185
ENV AB_JOLOKIA_OFF=""
ENV JAVA_OPTS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"




===================


pom 

<?xml version="1.0"?>
<project
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd"
	xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.gov.caixa.simtr</groupId>
	<artifactId>simtr-batch</artifactId>
	<version>2.6.0.5</version>
	<properties>
		<compiler-plugin.version>3.11.0</compiler-plugin.version>
		<maven.compiler.release>17</maven.compiler.release>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
		<quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
		<quarkus.platform.version>3.2.9.Final</quarkus.platform.version>
		<skipITs>true</skipITs>
		<tests.skip>false</tests.skip>
		<surefire-plugin.version>3.0.0</surefire-plugin.version>
		<lombok.version>1.18.30</lombok.version>
		<mapstruct.version>1.5.5.Final</mapstruct.version>
		<br.gov.caixa.simtr.arquitetura.version>2.15.0.0</br.gov.caixa.simtr.arquitetura.version>
		<br.gov.caixa.simtr.repositorio.version>2.23.0.5</br.gov.caixa.simtr.repositorio.version>
		<br.gov.caixa.simtr.documento.version>2.22.0.11</br.gov.caixa.simtr.documento.version>
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
	       <!-- Azure BOM for client libraries -->
		   <dependency>
		     <groupId>com.azure</groupId>
		     <artifactId>azure-sdk-bom</artifactId>
		     <version>1.2.22</version>
		     <type>pom</type>
		     <scope>import</scope>
		   </dependency>			
		</dependencies>
	</dependencyManagement>
	<dependencies>
		<dependency>
			<groupId>br.gov.caixa.simtr</groupId>
			<artifactId>simtr-arquitetura</artifactId>
			<version>${br.gov.caixa.simtr.arquitetura.version}</version>
		</dependency>
		<dependency>
			<groupId>br.gov.caixa.simtr</groupId>
			<artifactId>simtr-repositorio</artifactId>
			<version>${br.gov.caixa.simtr.repositorio.version}</version>
		</dependency>
		<dependency>
			<groupId>br.gov.caixa.simtr</groupId>
			<artifactId>simtr-documento</artifactId>
			<version>${br.gov.caixa.simtr.documento.version}</version>
		</dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-quartz</artifactId>
        </dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-openapi</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-config-yaml</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-resteasy-reactive-jackson</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-rest-client-reactive-jackson</artifactId>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-oidc</artifactId>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-oidc-client-reactive-filter</artifactId>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-jwt</artifactId>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-arc</artifactId>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>${lombok.version}</version>
		</dependency>
	    <dependency>
	      <groupId>org.mapstruct</groupId>
	      <artifactId>mapstruct</artifactId>
	      <version>${mapstruct.version}</version>
	    </dependency>		
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-narayana-jta</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-hibernate-validator</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-hibernate-orm-panache</artifactId>
		</dependency>
		<!-- substituido com quarkus-jdbc-oracle durante a migracao quarkus 3.2 hibernate 6
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc8</artifactId>
		</dependency>
        -->
		
	    <dependency>
	      <groupId>io.quarkus</groupId>
	      <artifactId>quarkus-jdbc-oracle</artifactId>
	    </dependency>
	           
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-health</artifactId>
		</dependency>

		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-fault-tolerance</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-metrics</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-scheduler</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-cache</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-panache-mock</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-junit5</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-junit5-mockito</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-test-security</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-jacoco</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<scope>test</scope>
		</dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
        </dependency>
		<!--  Azure Service Bus client library for Java -->
		<dependency>
			<groupId>com.azure</groupId>
			<artifactId>azure-messaging-servicebus</artifactId>
		</dependency>
		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
		</dependency>
		<dependency>
			<groupId>io.quarkus</groupId>
			<artifactId>quarkus-smallrye-reactive-messaging</artifactId>
		</dependency>
		<!-- APPLICATION INSIGHTS -->
		<dependency>
			<groupId>com.microsoft.azure</groupId>
			<artifactId>applicationinsights-agent</artifactId>
			<version>3.5.1</version>
		</dependency>
		<!-- APPLICATION INSIGHTS -->
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
				<configuration>
					<jvmArgs>-Dfile.encoding=UTF-8</jvmArgs>
				</configuration>				
			</plugin>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>${compiler-plugin.version}</version>
				<configuration>
					<compilerArgs>
						<arg>-parameters</arg>
					</compilerArgs>

					<annotationProcessorPaths>
						<path>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
							<version>${lombok.version}</version>
						</path>
			            <path>
			                <groupId>org.mapstruct</groupId>
			                <artifactId>mapstruct-processor</artifactId>
			                <version>${mapstruct.version}</version>
			            </path>
					</annotationProcessorPaths>

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
					<skipTests>${tests.skip}</skipTests>
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



----

isso tudo ja ajusado na tag 2.6.0.5 e rodado





