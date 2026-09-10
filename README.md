<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.1.5</version> <!-- Versão estável do Spring Boot -->
        <relativePath /> <!-- lookup parent from repository -->
    </parent>

    <groupId>br.gov.caixa</groupId>
    <artifactId>siccp</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>siccp</name>
    <description>Back-end SICCP Sistema Caixa</description>

    <properties>
        <java.version>17</java.version>

        <!-- ================================================ -->
        <!-- SONAR - Propriedades de análise -->
        <!-- ================================================ -->
        <sonar.projectKey>SICCP-BACK</sonar.projectKey>
        <sonar.projectName>SICCP-BACK</sonar.projectName>
        <sonar.language>java</sonar.language>
        <sonar.java.source>17</sonar.java.source>
        <sonar.sourceEncoding>UTF-8</sonar.sourceEncoding>
        <sonar.sources>src/main/java</sonar.sources>
        <sonar.tests>src/test/java</sonar.tests>

        <!-- Caminho do relatório JaCoCo que o Sonar vai ler -->
        <sonar.coverage.jacoco.xmlReportPaths>
            ${project.basedir}/target/site/jacoco/jacoco.xml
        </sonar.coverage.jacoco.xmlReportPaths>

        <!-- Exclusões de cobertura (classes sem lógica testável) -->
        <sonar.coverage.exclusions>
            **/*Application.java,
            **/*SecurityConfig.java
        </sonar.coverage.exclusions>

        <!-- Exclusões gerais da análise Sonar -->
        <sonar.exclusions>
            **/*Application.java,
            **/*SecurityConfig.java
        </sonar.exclusions>
    </properties>

    <dependencies>
        <!-- Spring Boot Starter Web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- Spring Security -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-client</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
        </dependency>

        <!-- Lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>

        <!-- Spring Boot DevTools -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>

        <!-- DB2 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
        <dependency>
            <groupId>com.ibm.db2</groupId>
            <artifactId>jcc</artifactId>
            <version>11.5.8.0</version>
        </dependency>

        <!-- Testes -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Maven Compiler Plugin -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>${java.version}</source>
                    <target>${java.version}</target>
                </configuration>
            </plugin>

            <!-- Spring Boot Maven Plugin -->
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>

            <!-- ============================================ -->
            <!-- SUREFIRE - Runner dos testes unitários -->
            <!-- OBRIGATÓRIO para o JaCoCo injetar o agente -->
            <!-- ============================================ -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version>
                <configuration>
                    <!-- surefireArgLine é preenchido pelo JaCoCo prepare-agent -->
                    <argLine>${surefireArgLine}</argLine>
                    <includes>
                        <include>**/*Test.java</include>
                        <include>**/*Tests.java</include>
                    </includes>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <!-- ================================================== -->
    <!-- PROFILE SONAR-COVERAGE -->
    <!-- Idêntico ao padrão do projeto SICID que funciona -->
    <!-- ================================================== -->
    <profiles>
        <profile>
            <id>sonar-coverage</id>
            <activation>
                <!-- Perfil ativado automaticamente durante os builds -->
                <activeByDefault>true</activeByDefault>
            </activation>
            <build>
                <plugins>
                    <plugin>
                        <groupId>org.jacoco</groupId>
                        <artifactId>jacoco-maven-plugin</artifactId>
                        <version>0.8.10</version>
                        <executions>

                            <!-- 1) Prepara o agente JaCoCo ANTES dos testes -->
                            <execution>
                                <id>jacoco-initialize</id>
                                <goals>
                                    <goal>prepare-agent</goal>
                                </goals>
                                <configuration>
                                    <!-- Injeta o agente como argumento do Surefire -->
                                    <propertyName>surefireArgLine</propertyName>
                                </configuration>
                            </execution>

                            <!-- 2) Gera o relatório XML APÓS os testes -->
                            <execution>
                                <id>jacoco-site</id>
                                <phase>package</phase>
                                <goals>
                                    <goal>report</goal>
                                </goals>
                                <configuration>
                                    <outputDirectory>
                                        ${project.basedir}/target/site/jacoco
                                    </outputDirectory>
                                </configuration>
                            </execution>

                        </executions>
                    </plugin>
                </plugins>
            </build>
        </profile>
    </profiles>

</project>

# ===============================
# CONFIGURACOES BASE DA APLICACAO
# ===============================
spring.application.name=siccp
# O profile ativo sera definido por variavel de ambiente
# injetada pelo Azure DevOps ou pelo .bat local.
# Valor padrao caso nenhuma variavel seja definida: local
spring.profiles.active=${SPRING_PROFILES_ACTIVE:des}
# ===============================
# JPA - CONFIGURACOEES COMUNS
# ===============================
spring.jpa.open-in-view=false


# ===============================
# SERVIDOR - PROD
# ===============================
server.port=8080
server.forward-headers-strategy=framework

# ===============================
# BANCO DE DADOS - DB2 PROD
# ===============================
spring.datasource.url=${DB_URL:jdbc:db2://10.192.225.76:2905/DBD0}
spring.datasource.username=${DB_USER}
spring.datasource.password=${PASS_DB}

spring.datasource.driver-class-name=com.ibm.db2.jcc.DB2Driver

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.DB2Dialect
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false

# ===============================
# LOGS - PROD minimo necessario
# ===============================
logging.level.org.hibernate.SQL=ERROR
logging.level.org.springframework.jdbc.core=ERROR

# ===============================
# KEYCLOAK - PROD
# BACKEND APENAS VALIDA JWT
# ===============================
spring.security.oauth2.resourceserver.jwt.issuer-uri=https://login.des.caixa/auth/realms/intranet
spring.security.oauth2.resourceserver.jwt.jwk-set-uri=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs

# ===============================
# CONFIGURACOES DE SSL
# ===============================
spring.jvm.arguments=${_ENV.JAVA_OPTIONS_APPEND}



<img width="1133" height="801" alt="image" src="https://github.com/user-attachments/assets/6f5bf3aa-5202-4813-b953-962dd402e74f" />


<img width="1757" height="844" alt="image" src="https://github.com/user-attachments/assets/f8a02040-89a2-4dcc-ba0e-6dfdd31ab5ff" />


ele usa taks de spriong boot

mais tem imagem de quarkus

<img width="1558" height="731" alt="image" src="https://github.com/user-attachments/assets/4372d27b-9bca-4667-b65f-887d75b43391" />



