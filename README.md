atuamente estacom mechemo no sipes-api-scpc

o pom dele ta assim




<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>br.gov.caixa</groupId>
    <artifactId>sipes-api-scpc</artifactId>
    <version>1.0.0.0</version>
    <packaging>quarkus</packaging>

    <properties>
        <compiler-plugin.version>3.27.2</compiler-plugin.version>
        <maven.compiler.release>21</maven.compiler.release>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <quarkus.platform.artifact-id>quarkus-bom</quarkus.platform.artifact-id>
        <quarkus.platform.group-id>io.quarkus.platform</quarkus.platform.group-id>
        <quarkus.platform.version>3.33.2.1</quarkus.platform.version>
        <skipITs>true</skipITs>
        <surefire-plugin.version>3.5.4</surefire-plugin.version>
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
            <artifactId>quarkus-messaging</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client-jackson</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest-client</artifactId>
        </dependency>
        <dependency>
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-jacoco</artifactId>
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
            <groupId>io.quarkus</groupId>
            <artifactId>quarkus-rest</artifactId>
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
                        <native.image.path>${project.build.directory}/${project.build.finalName}-runner</native.image.path>
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



esse aqui do SIIFX-caixinhas-api-aplicacao. 

TA ASSIM e passou na build



<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>
    <groupId>br.gov.caixa.siifx</groupId>
    <artifactId>caixinhas</artifactId>
    <version>1.0.2.0</version>

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

        <!-- Telemetria App Insights -->
        <dependency>
            <groupId>com.microsoft.azure</groupId>
            <artifactId>applicationinsights-agent</artifactId>
            <version>3.7.1</version>
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

        <!-- FAKER -->

        <dependency>
            <groupId>com.github.javafaker</groupId>
            <artifactId>javafaker</artifactId>
            <version>1.0.2</version>
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
                        <phase>prepare-package</phase>
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



achei esse texto quai em que corrgimos isso nao sei se é o mesmo caso


Resumo da demanda — Build SIAGT-batimento travando Problema: O build do SIAGT-batimento ficava horas travado no step "Recupera Versão no POM", sem concluir e sem erro. Causa raiz: O pom.xml estava configurado com o Quarkus 3.36.0, versão lançada poucos dias antes e ainda não espelhada no Nexus interno (Nexus Caixa). Como o artefato não estava disponível no repositório, o Maven ficava indefinidamente tentando resolver a dependência, causando o travamento. Correções aplicadas no pom.xml:
Versão do Quarkus alterada de 3.36.0 para 3.27.2 (LTS, já disponível no Nexus e em uso por outros módulos do SIAGT). ajustado de quarkus para jar (o tipo quarkus não é reconhecido nessa versão). Dependência de teste corrigida de quarkus-junit para quarkus-junit5. Adicionado o bloco (goals build, generate-code, generate-code-tests) no quarkus-maven-plugin, necessário para gerar o pacote executável target/quarkus-app/, exigido pelo step "Copiando Artefatos para StagingDirectory".
Resultado: Build concluído com sucesso, 100% dos testes passando, tempo de execução ~1min. Recomendação: Não utilizar versões do Quarkus recém-lançadas que ainda não estejam espelhadas no Nexus interno. Manter alinhamento com a versão LTS adotada pelos demais módulos (atualmente 3.27.2); ao precisar atualizar, solicitar previamente o espelhamento da versão à equipe responsável pelo Nexus.
