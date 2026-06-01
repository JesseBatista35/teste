esta mos rodando a build e ela fica horas e horas e nao passa desse jobs:


recurepra versão pom.


antes dele tem isso:

Jobs
 Agent job 1
Initialize job
Checkout SIAGT-batimento@develop to s
Bash Script
Localização do Repositório
Validação da VEC
Obtendo branch do Sonar
Maven
Recupera Versão no POM


ciramos esse basjhh scricp:



- bash: |
    set -x
    echo "===== DEBUG INICIO ====="

    echo "USER:"
    whoami

    echo "PWD:"
    pwd

    echo "LIST DIR:"
    ls -la

    echo "JAVA:"
    java -version

    echo "MAVEN:"
    mvn -version

    echo "TESTE POM:"
    head -n 20 pom.xml

    echo "TESTE DNS NEXUS:"
    nslookup $(echo $NEXUS_URL_MAVEN_RELEASE | awk -F/ '{print $3}') || true

    echo "TESTE CURL NEXUS:"
    curl -I -m 10 $NEXUS_URL_MAVEN_RELEASE || true

    echo "TESTE MAVEN (SEM BUILD):"
    mvn -B -q help:evaluate -Dexpression=project.version -DforceStdout

    echo "===== DEBUG FIM ====="



	e o resultado é esse:


	Starting: Bash Script
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/ba597360-80fa-4503-9d50-c864a9b9b033.sh
/opt/ads-agent/_work/_temp/ba597360-80fa-4503-9d50-c864a9b9b033.sh: line 1: -: command not found
===== DEBUG INICIO =====
USER:
root
PWD:
/opt/ads-agent/_work/46/s
LIST DIR:
total 52
drwxr-xr-x.  6 root root   175 jun  1 12:10 .
drwxr-xr-x.  6 root root    52 jun  1 12:10 ..
-rw-r--r--.  1 root root    75 jun  1 11:33 .dockerignore
-rw-r--r--.  1 root root   209 jun  1 11:33 .editorconfig
drwxr-xr-x.  8 root root   162 jun  1 12:10 .git
-rw-r--r--.  1 root root   423 jun  1 11:33 .gitignore
drwxr-xr-x.  3 root root    21 jun  1 11:33 .mvn
-rw-r--r--.  1 root root 11790 jun  1 11:33 mvnw
-rw-r--r--.  1 root root  8292 jun  1 11:33 mvnw.cmd
-rw-r--r--.  1 root root  7178 jun  1 12:10 pom.xml
-rw-r--r--.  1 root root  2826 jun  1 11:33 README.md
drwxr-xr-x.  4 root root    30 jun  1 11:33 src
drwxr-xr-x. 12 root root  4096 jun  1 11:55 target
JAVA:
openjdk version "1.8.0_372"
OpenJDK Runtime Environment (build 1.8.0_372-b07)
OpenJDK 64-Bit Server VM (build 25.372-b07, mixed mode)
MAVEN:
Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
Maven home: /opt/apache-maven/apache-maven-3.8.5
Java version: 1.8.0_372, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-1.8.0/jre



porem mesmo assim continua o erro:


o pom do xml do repo ta assim:

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>br.gov.caixa.siagt</groupId>
    <artifactId>batimento</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <packaging>quarkus</packaging>

    <properties>
        <compiler-plugin.version>3.15.0</compiler-plugin.version>
        <maven.compiler.release>21</maven.compiler.release>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
        <quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
        <quarkus.platform.version>3.36.0</quarkus.platform.version>
        <skipITs>true</skipITs>
        <surefire-plugin.version>3.5.4</surefire-plugin.version>
        <lombok.version>1.18.46</lombok.version>
        <sonar-maven-plugin.version>5.7.0.6970</sonar-maven-plugin.version>
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
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-micrometer-registry-prometheus</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-validator</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-openapi</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jacoco</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-agroal</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-health</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-arc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.jboss.logmanager</groupId>
            <artifactId>log4j2-jboss-logmanager</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-junit</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.12</version>
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
                <groupId>${quarkus.platform.group-id}</groupId>
                <artifactId>quarkus-maven-plugin</artifactId>
                <version>${quarkus.platform.version}</version>
                <extensions>true</extensions>
            </plugin>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>${compiler-plugin.version}</version>
                <configuration>
                    <parameters>true</parameters>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>${surefire-plugin.version}</version>
                <configuration>
                    <argLine>@{argLine}</argLine>
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
                    </execution>
                </executions>
                <configuration>
                    <argLine>@{argLine}</argLine>
                    <systemPropertyVariables>
                        <native.image.path>${project.build.directory}/${project.build.finalName}-runner
                        </native.image.path>
                        <java.util.logging.manager>org.jboss.logmanager.LogManager</java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>
                </configuration>
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
                <quarkus.package.jar.enabled>false</quarkus.package.jar.enabled>
                <skipITs>false</skipITs>
                <quarkus.native.enabled>true</quarkus.native.enabled>
            </properties>
        </profile>
    </profiles>
</project>

