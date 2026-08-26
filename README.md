<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <!-- Sem <parent>: usamos spring-boot-dependencies como BOM (mais adequado para libs) -->

    <groupId>br.gov.caixa.siaci</groupId>
    <artifactId>lib-integracao-core-java-parent</artifactId>
    <version>0.1.2</version>
    <packaging>pom</packaging>
    <name>lib-integracao-core-java (parent)</name>
    <description>Parent POM da lib-integracao-core-java</description>

    <properties>
        <!-- Encoding -->
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>

        <!-- Java -->
        <maven.compiler.release>21</maven.compiler.release>

        <!-- Versões das dependências principais -->
        <spring-boot.version>3.5.3</spring-boot.version>
        <spring-cloud.version>2025.0.0</spring-cloud.version>
        <lombok.version>1.18.34</lombok.version>
        <springdoc.version>2.3.0</springdoc.version>
        <jacoco.version>0.8.12</jacoco.version>

        <!-- Versões dos plugins -->
        <maven-compiler-plugin.version>3.14.0</maven-compiler-plugin.version>
        <maven-source-plugin.version>3.3.1</maven-source-plugin.version>
        <maven-surefire-plugin.version>3.5.3</maven-surefire-plugin.version>
        <maven-shade-plugin.version>3.5.3</maven-shade-plugin.version>
    </properties>

    <modules>
        <module>lib-integracao-core-java-autorizacao</module>
        <module>lib-integracao-core-java-comunicacao</module>
        <module>lib-integracao-core-java-resolver</module>
        <module>lib-integracao-core-java-bom</module>
    </modules>

    <distributionManagement>
        <repository>
            <id>github</id>
            <name>GitHub Packages</name>
            <url>https://maven.pkg.github.com/caixagithub/siaci-lib-integracao-core-java</url>
        </repository>
    </distributionManagement>

    <dependencyManagement>
        <dependencies>
            <!-- Spring Boot BOM (substitui a herança de spring-boot-starter-parent) -->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>${spring-boot.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>

            <!-- Spring Cloud BOM -->
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>

            <!-- Módulos internos -->
            <dependency>
                <groupId>br.gov.caixa.siaci</groupId>
                <artifactId>lib-integracao-core-java-autorizacao</artifactId>
                <version>${project.version}</version>
            </dependency>
            <dependency>
                <groupId>br.gov.caixa.siaci</groupId>
                <artifactId>lib-integracao-core-java-comunicacao</artifactId>
                <version>${project.version}</version>
            </dependency>
            <dependency>
                <groupId>br.gov.caixa.siaci</groupId>
                <artifactId>lib-integracao-core-java-resolver</artifactId>
                <version>${project.version}</version>
            </dependency>
            <!-- <dependency>
                <groupId>javax.resource</groupId>
                <artifactId>jrac</artifactId>
                <version>17.0</version>
            </dependency> -->

            <!-- Terceiros com versão fixa -->
            <dependency>
                <groupId>org.springdoc</groupId>
                <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
                <version>${springdoc.version}</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <pluginManagement>
            <plugins>
                <!-- Compiler + processamento de anotações (Lombok) -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>${maven-compiler-plugin.version}</version>
                    <configuration>
                        <annotationProcessorPaths>
                            <path>
                                <groupId>org.projectlombok</groupId>
                                <artifactId>lombok</artifactId>
                                <version>${lombok.version}</version>
                            </path>

                            <path>
                                <groupId>org.hibernate.orm</groupId>
                                <artifactId>hibernate-jpamodelgen</artifactId>
                                <version>${hibernate.version}</version>
                            </path>
                        </annotationProcessorPaths>
                    </configuration>
                </plugin>

                <!-- Publica sources junto com o jar -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-source-plugin</artifactId>
                    <version>${maven-source-plugin.version}</version>
                    <executions>
                        <execution>
                            <id>attach-sources</id>
                            <goals>
                                <goal>jar-no-fork</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>

                <!-- Testes -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>${maven-surefire-plugin.version}</version>
                </plugin>

                <!-- Shade: só define versão aqui. A execução fica no módulo comunicacao -->
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-shade-plugin</artifactId>
                    <version>${maven-shade-plugin.version}</version>
                </plugin>

                <plugin>
                    <groupId>org.jacoco</groupId>
                    <artifactId>jacoco-maven-plugin</artifactId>
                    <version>${jacoco.version}</version>
                    <executions>
                        <!-- Prepara o agente que instrumenta as classes durante os testes -->
                        <execution>
                            <id>prepare-agent</id>
                            <goals>
                                <goal>prepare-agent</goal>
                            </goals>
                        </execution>
                        <!-- Gera o relatório HTML/XML/CSV por módulo após os testes -->
                        <execution>
                            <id>report</id>
                            <phase>test</phase>
                            <goals>
                                <goal>report</goal>
                            </goals>
                        </execution>
                    </executions>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
</project>
