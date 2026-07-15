<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>br.gov.caixa.siifx</groupId>
    <artifactId>caixinha</artifactId>
    <version>1.0.0.0</version>
    <packaging>quarkus</packaging>

    <properties>
        <compiler-plugin.version>3.15.0</compiler-plugin.version>
        <maven.compiler.release>21</maven.compiler.release>

        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>

        <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
        <quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
        <quarkus.platform.version>3.33.2.1</quarkus.platform.version>

        <mapstruct.version>1.6.3</mapstruct.version>
        <lombok.version>1.18.38</lombok.version>

        <skipITs>true</skipITs>
        <surefire-plugin.version>3.5.4</surefire-plugin.version>

        <sonar.coverage.jacoco.xmlReportPaths>
            ${project.build.directory}/site/jacoco/jacoco.xml
        </sonar.coverage.jacoco.xmlReportPaths>

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

    <repositories>
        <repository>
            <id>caixa-group</id>
            <url>http://binario.caixa:8081/repository/caixa-group/</url>
        </repository>
    </repositories>

    <dependencies>

        <!-- Lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
            <scope>provided</scope>
        </dependency>

        <!-- REST -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest</artifactId>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-jackson</artifactId>
        </dependency>

        <!-- OpenAPI -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-openapi</artifactId>
        </dependency>

        <!-- CDI -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-arc</artifactId>
        </dependency>

        <!-- Validation -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-validator</artifactId>
        </dependency>

        <!-- Persistence -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-hibernate-orm-panache</artifactId>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jdbc-oracle</artifactId>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jdbc-h2</artifactId>
        </dependency>

        <!-- Security -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-oidc</artifactId>
        </dependency>

        <!-- REST CLIENT -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client</artifactId>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client-jackson</artifactId>
        </dependency>

        <!-- Cache -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-cache</artifactId>
        </dependency>

        <!-- Health -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-health</artifactId>
        </dependency>

        <!-- Metrics -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-micrometer-registry-prometheus</artifactId>
        </dependency>

        <!-- Fault Tolerance -->
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-smallrye-fault-tolerance</artifactId>
        </dependency>

        <!-- Config Source -->
        <dependency>
            <groupId>io.smallrye.config</groupId>
            <artifactId>smallrye-config-source-file-system</artifactId>
            <version>2.4.2</version>
        </dependency>

        <!-- MapStruct -->
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>${mapstruct.version}</version>
        </dependency>

        <!-- Lombok MapStruct -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok-mapstruct-binding</artifactId>
            <version>0.2.0</version>
            <scope>provided</scope>
        </dependency>

        <!-- TESTES -->

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-junit5</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jacoco</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-junit5-mockito</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-test-security</artifactId>
            <scope>test</scope>
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

                    <parameters>true</parameters>

                    <annotationProcessorPaths>

                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>${mapstruct.version}</version>
                        </path>

                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>${lombok.version}</version>
                        </path>

                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok-mapstruct-binding</artifactId>
                            <version>0.2.0</version>
                        </path>

                    </annotationProcessorPaths>

                </configuration>
            </plugin>

            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>${surefire-plugin.version}</version>

                <configuration>
                    <argLine>@{argLine}</argLine>

                    <systemPropertyVariables>
                        <java.util.logging.manager>
                            org.jboss.logmanager.LogManager
                        </java.util.logging.manager>
                        <maven.home>${maven.home}</maven.home>
                    </systemPropertyVariables>

                </configuration>
            </plugin>

            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.13</version>

                <executions>

                    <execution>
                        <id>prepare-agent</id>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>

                    <execution>
                        <id>report</id>
                        <phase>verify</phase>
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
                    </execution>
                </executions>

                <configuration>

                    <argLine>@{argLine}</argLine>

                    <systemPropertyVariables>

                        <native.image.path>
                            ${project.build.directory}/${project.build.finalName}-runner
                        </native.image.path>

                        <java.util.logging.manager>
                            org.jboss.logmanager.LogManager
                        </java.util.logging.manager>

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


<img width="1884" height="926" alt="image" src="https://github.com/user-attachments/assets/1f192e78-dea5-4eaa-b4cd-0b21c9b09316" />


ogress (1): 53 kB   
                   
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-cache-dev/3.33.2.1/quarkus-cache-dev-3.33.2.1.jar
Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-cache-deployment/3.33.2.1/quarkus-cache-deployment-3.33.2.1.jar (53 kB at 3.6 MB/s)
Progress (1): 7.7/9.2 kB
Progress (1): 9.2 kB    
                    
Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-cache-dev/3.33.2.1/quarkus-cache-dev-3.33.2.1.jar (9.2 kB at 540 kB/s)
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-cache-deployment-spi/3.33.2.1/quarkus-cache-deployment-spi-3.33.2.1.jar
Progress (1): 7.7/8.4 kB
Progress (1): 8.4 kB    
                    
Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine-deployment/3.33.2.1/quarkus-caffeine-deployment-3.33.2.1.jar
F

<img width="1852" height="970" alt="image" src="https://github.com/user-attachments/assets/3cb9c78b-2b0e-492b-a5b2-cec1c3c38e20" />


