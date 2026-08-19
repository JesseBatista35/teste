<?xml version="1.0" encoding="UTF-8"?>
<project>
    <modelVersion>4.0.0</modelVersion> 
    
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.7</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    
    <groupId>br.gov.caixa</groupId>
    <description>Projeto backend Caixa - gestão usuário</description>
    <name>Gestão usuário - Backend</name>
    
    <artifactId>SIPNC-gestaousuario-backend</artifactId>
    <packaging>jar</packaging>
    <version>1.x.0.1</version>
    
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        
        <failOnMissingwebXml>false</failOnMissingwebXml>
        
        <java.version>17</java.version>
        <maven.compiler.source>${java.version}</maven.compiler.source>
        <maven.compiler.target>${java.version}</maven.compiler.target>
        <maven.compiler.release>${java.version}</maven.compiler.release>
        
        <tomcat.scope>compile</tomcat.scope>
        <spring-cloud.version>2021.0.1</spring-cloud.version>
        <checkstyle-maven-plugin.version>3.6.0</checkstyle-maven-plugin.version>

        <start-class>br.gov.caixa.sipnc.gestaousuario.RunApplication</start-class>
    </properties>

    <dependencies> 
		
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>${tomcat.scope}</scope>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.apache.tomcat</groupId>
                    <artifactId>tomcat-jdbc</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
        
        <dependency>
            <groupId>io.github.openfeign</groupId>
            <artifactId>feign-jackson</artifactId>
        </dependency>
        
        <dependency>
            <groupId>io.github.openfeign</groupId>
            <artifactId>feign-okhttp</artifactId>
        </dependency>
        
        <dependency>
            <groupId>io.github.openfeign</groupId>
            <artifactId>feign-httpclient</artifactId>
        </dependency>
        
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <scope>provided</scope>
        </dependency>
        
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-ui</artifactId>
            <version>1.6.6</version>
        </dependency>
        
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <scope>test</scope>
        </dependency>
        
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-inline</artifactId>
            <scope>test</scope>
        </dependency>
        
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-collections4</artifactId>
        </dependency>
        
        <dependency>
            <groupId>net.sf.jasperreports</groupId>
            <artifactId>jasperreports</artifactId>
            <version>6.20.0</version>
        </dependency>

        <dependency>
            <groupId>br.gov.caixa.sipnc</groupId>
            <artifactId>sipnc-fonts</artifactId>
            <version>0.0.0-rc35</version>
        </dependency>

        <dependency>
            <groupId>com.microsoft.azure</groupId>
            <artifactId>applicationinsights-runtime-attach</artifactId>
            <version>3.4.13</version>
        </dependency>

        <dependency>
            <groupId>org.apache.pdfbox</groupId>
            <artifactId>pdfbox</artifactId>
            <version>2.0.27</version>
        </dependency>

        <dependency>
            <groupId>br.gov.caixa.sipnc</groupId>
            <artifactId>SIPNC-infra-componentes</artifactId>
            <version>1.28.0.1</version>
        </dependency>
        
    </dependencies>
    
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <repositories>
        <repository>
            <id>caixa-repo-nexus-releases</id>
            <url>http://binario.caixa:8081/repository/releases</url>
        </repository>

        <repository>
            <id>caixa-repo-nexus-snapshots</id>
            <url>http://binario.caixa:8081/repository/snapshots</url>
        </repository>

        <repository>
            <id>caixa-repo-nexus-maven-central</id>
            <url>http://binario.caixa:8081/repository/maven-central</url>
        </repository>

        <repository>
            <id>caixa-repo-nexus-jCenter</id>
            <url>http://binario.caixa:8081/repository/jCenter</url>
        </repository>

        <repository>
            <id>caixa-repo-nexus-caixa-group-br</id>
            <url>http://binario.caixa:8081/repository/caixa-group-br</url>
        </repository>
    </repositories>

    <pluginRepositories>
        <pluginRepository>
            <id>caixa-repo-nexus-releases</id>
            <url>http://binario.caixa:8081/repository/releases</url>
        </pluginRepository>
        <pluginRepository>
            <id>caixa-repo-nexus-snapshots</id>
            <url>http://binario.caixa:8081/repository/snapshots</url>
        </pluginRepository>

        <pluginRepository>
            <id>caixa-repo-nexus-maven-central</id>
            <url>http://binario.caixa:8081/repository/maven-central</url>
        </pluginRepository>

        <pluginRepository>
            <id>caixa-repo-nexus-jCenter</id>
            <url>http://binario.caixa:8081/repository/jCenter</url>
        </pluginRepository>

        <pluginRepository>
            <id>caixa-repo-nexus-caixa-group-br</id>
            <url>http://binario.caixa:8081/repository/caixa-group-br</url>
        </pluginRepository>
    </pluginRepositories>

    <build>
        <finalName>${project.artifactId}</finalName>

        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-resources-plugin</artifactId>
                <configuration>
                    <propertiesEncoding>UTF-8</propertiesEncoding>
                    <escapeString>\</escapeString>
                    <nonFilteredFileExtensions>
                        <nonFilteredFileExtension>pdf</nonFilteredFileExtension>
                        <nonFilteredFileExtension>jrxml</nonFilteredFileExtension>
                        <nonFilteredFileExtension>jasper</nonFilteredFileExtension>
                        <nonFilteredFileExtension>jpg</nonFilteredFileExtension>
                        <nonFilteredFileExtension>jpeg</nonFilteredFileExtension>
                        <nonFilteredFileExtension>png</nonFilteredFileExtension>
                    </nonFilteredFileExtensions>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <release>${java.version}</release>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <configuration>
                    <forkedProcessExitTimeoutInSeconds>300</forkedProcessExitTimeoutInSeconds>
                    <useSystemClassLoader>false</useSystemClassLoader>
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
                <version>0.8.12</version>
                <configuration>
                    <append>true</append>
                    <excludes>
                        <exclude>**/model/**/*</exclude>
                        <exclude>**/utils/**/*</exclude>
                        <exclude>**/config/**/*</exclude>
                        <exclude>**/definitions/**/*</exclude>
                        <exclude>**/parsers/**/*</exclude>
                    </excludes>
                </configuration>
                <executions>
                    <execution>
                        <id>default-prepare-agent</id>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>post-unit-test</id>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-checkstyle-plugin</artifactId>
                <version>${checkstyle-maven-plugin.version}</version>
                <configuration>
                    <configLocation>src/main/resources/checkstyle.xml</configLocation>
                </configuration>
                <executions>
                    <execution>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>check</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>

        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/test/resources</directory>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/main/resources-non-filter</directory>
                <filtering>false</filtering>
            </resource>
        </resources>
    </build>

</project>





exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms512m -Xmx512m -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sipnc-gestaousuario-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sipnc-gestaousuario-backend -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/SIPNC-gestaousuario-backend.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-08-19 10:29:34.796-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 7.76 s)
2026-08-19 10:29:34.800-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-08-19 10:29:37.814-03:00 WARN  c.m.a.a.i.p.PerformanceMonitoringService - INITIALISING JFR PROFILING SUBSYSTEM THIS FEATURE IS IN BETA

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.7)

2026-08-19 10:29:39,408 INFO  br.gov.caixa.sipnc.gestaousuario.RunApplication : Starting RunApplication v1.x.0.1 using Java 17.0.7 on sipnc-gestaousuario-backend-des-53-vvnzz with PID 8 (/deployments/SIPNC-gestaousuario-backend.jar started by 1001 in /deployments)
2026-08-19 10:29:39,414 INFO  br.gov.caixa.sipnc.gestaousuario.RunApplication : The following 1 profile is active: "production"
2026-08-19 10:29:43,521 INFO  org.springframework.cloud.context.scope.GenericScope : BeanFactory id=c9e878e6-7b0a-3b1d-b28e-34b8b798acfa
2026-08-19 10:29:45,502 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat initialized with port(s): 8080 (http)
2026-08-19 10:29:45,525 INFO  org.apache.catalina.core.StandardService : Starting service [Tomcat]
2026-08-19 10:29:45,525 INFO  org.apache.catalina.core.StandardEngine : Starting Servlet engine: [Apache Tomcat/9.0.70]
2026-08-19 10:29:45,705 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring embedded WebApplicationContext
2026-08-19 10:29:45,705 INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 6177 ms
2026-08-19 10:29:46,094 INFO  io.micrometer.core.instrument.push.PushMeterRegistry : publishing metrics for AzureMonitorMeterRegistry every 1m
2026-08-19 10:29:47,412 WARN  org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'tokenInternetRequisicaoService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
2026-08-19 10:29:47,496 INFO  org.apache.catalina.core.StandardService : Stopping service [Tomcat]
2026-08-19 10:29:47,535 INFO  org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2026-08-19 10:29:47,617 ERROR org.springframework.boot.SpringApplication : Application run failed
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'tokenInternetRequisicaoService': Injection of autowired dependencies failed; nested exception is java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:405)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:955)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583)
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1303)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1292)
	at br.gov.caixa.sipnc.gestaousuario.RunApplication.main(RunApplication.java:25)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:108)
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:58)
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65)
Caused by: java.lang.IllegalArgumentException: Could not resolve placeholder 'CLISERPNC_SSO_LOGINX' in value "${CLISERPNC_SSO_LOGINX}"
	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:180)
	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:168)
	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126)
	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239)
	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210)
	at org.springframework.core.env.AbstractPropertyResolver.resolveNestedPlaceholders(AbstractPropertyResolver.java:230)
	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:79)
	at org.springframework.boot.context.properties.source.ConfigurationPropertySourcesPropertyResolver.getProperty(ConfigurationPropertySourcesPropertyResolver.java:60)
	at org.springframework.core.env.AbstractEnvironment.getProperty(AbstractEnvironment.java:594)
	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:153)
	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer$1.getProperty(PropertySourcesPlaceholderConfigurer.java:149)
	at org.springframework.core.env.PropertySourcesPropertyResolver.getProperty(PropertySourcesPropertyResolver.java:85)
	at org.springframework.core.env.PropertySourcesPropertyResolver.getPropertyAsRawString(PropertySourcesPropertyResolver.java:74)
	at org.springframework.util.PropertyPlaceholderHelper.parseStringValue(PropertyPlaceholderHelper.java:153)
	at org.springframework.util.PropertyPlaceholderHelper.replacePlaceholders(PropertyPlaceholderHelper.java:126)
	at org.springframework.core.env.AbstractPropertyResolver.doResolvePlaceholders(AbstractPropertyResolver.java:239)
	at org.springframework.core.env.AbstractPropertyResolver.resolveRequiredPlaceholders(AbstractPropertyResolver.java:210)
	at org.springframework.context.support.PropertySourcesPlaceholderConfigurer.lambda$processProperties$0(PropertySourcesPlaceholderConfigurer.java:191)
	at org.springframework.beans.factory.support.AbstractBeanFactory.resolveEmbeddedValue(AbstractBeanFactory.java:936)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1332)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399)
	... 25 common frames omitted




