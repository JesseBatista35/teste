segue pom:


<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>br.gov.cef.sisme</groupId>
	<version>2.93.3.0</version>
    <artifactId>sisme-parent</artifactId>
    <packaging>pom</packaging>
    <name>${project.artifactId}</name>
    <description>Sistema de Monitoramento de Empreendimento</description>

    <parent>
        <groupId>com.unisys.br</groupId>
        <artifactId>unisys-parent</artifactId>
        <version>1.1.3</version>
    </parent>

    <properties>
        <jsf.version>2.1.4</jsf.version>
        <mycontainer.version>1.4.0</mycontainer.version>
        <amsfw.version>1.0.60</amsfw.version>
        <siico.version>1.2.0</siico.version>
        <fabrica-web.version>1.0.4</fabrica-web.version>
        <!-- SONAR -->
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <sonar.exclusions>
            **/src/main/webapp/**,
        </sonar.exclusions>
        <sonar.cpd.exclusions>
            **/br/gov/cef/sisme/domain/**
        </sonar.cpd.exclusions>
        <!-- The destination file for the code coverage report has to be set to
            the same value in the parent pom and in each module pom. Then JaCoCo will
            add up information in the same report, so that, it will give the cross-module
            code coverage. -->
        <m2e.apt.activation>jdt_apt</m2e.apt.activation>
        <lombok.version>1.18.24</lombok.version>
        <lombok-mapstruct-binding.version>0.2.0</lombok-mapstruct-binding.version>
    </properties>

    <modules>
        <module>sisme-api</module>
        <module>sisme-ejb</module>
        <module>sisme-ear</module>
        <module>sisme-web</module>
        <module>sisme-itests</module>
    </modules>

    <dependencies>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>5.6.15.Final</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-envers</artifactId>
            <version>5.6.15.Final</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-annotations</artifactId>
            <version>3.5.6-Final</version>
        </dependency>
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest</artifactId>
            <version>2.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest-library</artifactId>
            <version>2.1</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit-addons</groupId>
            <artifactId>junit-addons</artifactId>
            <version>1.4</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.easymock</groupId>
            <artifactId>easymock</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>jsr250-api</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.powermock</groupId>
            <artifactId>powermock-module-junit4</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.powermock</groupId>
            <artifactId>powermock-api-mockito</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.powermock</groupId>
            <artifactId>powermock-module-javaagent</artifactId>
        </dependency>
        <dependency>
            <groupId>org.powermock</groupId>
            <artifactId>powermock-module-junit4-rule-agent</artifactId>
        </dependency>
        <dependency>
            <groupId>org.javassist</groupId>
            <artifactId>javassist</artifactId>
            <version>3.24.1-GA</version>
        </dependency>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.5</version>
        </dependency>
        <dependency>
            <groupId>commons-collections</groupId>
            <artifactId>commons-collections</artifactId>
            <version>3.2.2.redhat-2</version>
        </dependency>
        <dependency>
            <groupId>com.github.ffpojo</groupId>
            <artifactId>util</artifactId>
            <version>1.0</version>
        </dependency>
        <dependency>
            <groupId>com.github.ffpojo</groupId>
            <artifactId>ffpojo</artifactId>
            <version>1.0</version>
        </dependency>
        <dependency>
            <groupId>org.infinispan</groupId>
            <artifactId>infinispan-core</artifactId>
            <version>8.1.8.Final-redhat-1</version>
        </dependency>
    </dependencies>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <version>${lombok.version}</version>
                <scope>provided</scope>
            </dependency>
            <dependency>
                <groupId>javax</groupId>
                <artifactId>javaee-api</artifactId>
                <version>6.0</version>
            </dependency>
            <dependency>
                <groupId>org.jboss.spec</groupId>
                <artifactId>jboss-javaee-6.0</artifactId>
                <version>3.0.2.Final</version>
                <scope>import</scope>
                <type>pom</type>
            </dependency>
            <dependency>
                <groupId>org.jboss.ejb3</groupId>
                <artifactId>jboss-ejb3-ext-api</artifactId>
                <version>2.0.0</version>
            </dependency>
            <dependency>
                <groupId>javax.servlet.jsp</groupId>
                <artifactId>jsp-api</artifactId>
                <version>2.1</version>
            </dependency>
            <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>servlet-api</artifactId>
                <version>2.5</version>
            </dependency>
            <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>jstl</artifactId>
                <version>1.2</version>
            </dependency>
            <dependency>
                <groupId>commons-lang</groupId>
                <artifactId>commons-lang</artifactId>
                <version>2.3</version>
            </dependency>
            <dependency>
                <groupId>commons-logging</groupId>
                <artifactId>commons-logging</artifactId>
                <version>1.1.1</version>
            </dependency>
            <dependency>
                <groupId>com.unisys.br.utils</groupId>
                <artifactId>jsf-utils</artifactId>
                <version>1.1.0-SNAPSHOT</version>
            </dependency>

            <dependency>
                <groupId>net.sf.ehcache</groupId>
                <artifactId>ehcache</artifactId>
                <version>1.6.0</version>
            </dependency>
            <dependency>
                <groupId>commons-beanutils</groupId>
                <artifactId>commons-beanutils</artifactId>
                <version>1.8.0</version>
            </dependency>
            <dependency>
                <groupId>log4j</groupId>
                <artifactId>log4j</artifactId>
                <version>1.2.14</version>
            </dependency>
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.8.2</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>org.easymock</groupId>
                <artifactId>easymock</artifactId>
                <version>3.0</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-api</artifactId>
                <version>1.6.1</version>
                <scope>provided</scope>
            </dependency>
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-log4j12</artifactId>
                <version>1.6.1</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>javax.annotation</groupId>
                <artifactId>jsr250-api</artifactId>
                <version>1.0</version>
                <scope>provided</scope>
            </dependency>
            <dependency>
                <groupId>com.sun.faces</groupId>
                <artifactId>jsf-api</artifactId>
                <version>${jsf.version}</version>
                <scope>provided</scope>
            </dependency>
            <dependency>
                <groupId>com.sun.faces</groupId>
                <artifactId>jsf-impl</artifactId>
                <version>${jsf.version}</version>
                <scope>provided</scope>
            </dependency>
            <dependency>
                <groupId>org.chartistjsf</groupId>
                <artifactId>ChartistJSF</artifactId>
                <version>2.1</version>
            </dependency>
            <dependency>
                <groupId>org.primefaces</groupId>
                <artifactId>primefaces</artifactId>
                <version>6.0</version>
                <scope>provided</scope>
            </dependency>
            <dependency>
                <groupId>br.gov.cef.siico</groupId>
                <artifactId>siico-api</artifactId>
                <version>${siico.version}</version>
            </dependency>
            <dependency>
                <groupId>br.gov.cef.siico</groupId>
                <artifactId>siico-ejb</artifactId>
                <version>${siico.version}</version>
                <type>ejb</type>
            </dependency>
            <dependency>
                <groupId>com.unisys.br.amsfw</groupId>
                <artifactId>amsfw-ejb</artifactId>
                <version>${amsfw.version}</version>
                <type>ejb</type>
            </dependency>
            <dependency>
                <groupId>com.unisys.br.amsfw</groupId>
                <artifactId>amsfw-ejb</artifactId>
                <version>${amsfw.version}</version>
            </dependency>
            <dependency>
                <groupId>com.unisys.br.amsfw</groupId>
                <artifactId>amsfw-api</artifactId>
                <version>${amsfw.version}</version>
            </dependency>
            <dependency>
                <groupId>com.unisys.br.fabrica</groupId>
                <artifactId>fabrica-web</artifactId>
                <version>${fabrica-web.version}</version>
            </dependency>
            <dependency>
                <groupId>com.unisys.br.amsfw</groupId>
                <artifactId>amsfw-web</artifactId>
                <version>${amsfw.version}</version>
            </dependency>
            <dependency>
                <groupId>com.unisys.br.amsfw</groupId>
                <artifactId>amsfw-itests</artifactId>
                <version>${amsfw.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.data</groupId>
                <artifactId>spring-data-jpa</artifactId>
                <version>1.11.8.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>org.apache.commons</groupId>
                <artifactId>commons-lang3</artifactId>
                <version>3.5</version>
            </dependency>
            <dependency>
                <groupId>org.powermock</groupId>
                <artifactId>powermock-module-junit4</artifactId>
                <version>1.7.4</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>org.powermock</groupId>
                <artifactId>powermock-api-mockito</artifactId>
                <version>1.7.4</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>org.powermock</groupId>
                <artifactId>powermock-module-javaagent</artifactId>
                <version>1.7.0</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>org.powermock</groupId>
                <artifactId>powermock-module-junit4-rule-agent</artifactId>
                <version>1.7.0</version>
                <scope>test</scope>
            </dependency>
            <dependency>
                <groupId>org.mapstruct</groupId>
                <artifactId>mapstruct</artifactId>
                <version>1.4.1.Final</version>
            </dependency>
            <!-- https://mvnrepository.com/artifact/org.codehaus.plexus/plexus-archiver -->
            <dependency>
                <groupId>org.codehaus.plexus</groupId>
                <artifactId>plexus-archiver</artifactId>
                <version>4.9.2</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
    <build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.codehaus.mojo</groupId>
                    <artifactId>build-helper-maven-plugin</artifactId>
                    <executions>
                        <execution>
                            <phase>generate-sources</phase>
                            <goals>
                                <goal>add-source</goal>
                            </goals>
                            <configuration>
                                <sources>
                                    <source>${project.build.directory}/generated-sources</source>
                                </sources>
                            </configuration>
                        </execution>
                    </executions>
                </plugin>
                <plugin>
                    <groupId>org.bsc.maven</groupId>
                    <artifactId>maven-processor-plugin</artifactId>
                    <version>2.2.3</version>
                    <configuration>
                        <defaultOutputDirectory>
                            ${project.build.directory}/generated-sources
                        </defaultOutputDirectory>
                        <processors>
                            <processor>org.mapstruct.ap.MappingProcessor</processor>
                        </processors>
                    </configuration>
                    <executions>
                        <execution>
                            <id>process</id>
                            <phase>generate-sources</phase>
                            <goals>
                                <goal>process</goal>
                            </goals>
                        </execution>
                    </executions>
                    <dependencies>
                        <dependency>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>1.4.1.Final</version>
                        </dependency>
                    </dependencies>
                </plugin>
            </plugins>
        </pluginManagement>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.7.5.201505241946</version>
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
                <artifactId>maven-ejb-plugin</artifactId>
                <version>3.2.1</version>
                <configuration>
                    <ejbVersion>3.1</ejbVersion>
                    <archive>
                        <manifest>
                            <addClasspath>true</addClasspath>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <optimize>true</optimize>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.mapstruct</groupId>
                            <artifactId>mapstruct-processor</artifactId>
                            <version>1.4.1.Final</version>
                        </path>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                            <version>${lombok.version}</version>
                        </path>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok-mapstruct-binding</artifactId>
                            <version>${lombok-mapstruct-binding.version}</version>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
            <plugin>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M1</version>
                <configuration>
                    <systemPropertyVariables>
                        <arquillian.launch>jboss</arquillian.launch>
                    </systemPropertyVariables>
                    <excludes>
                        <exclude>**/*ITTest.java</exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

    <profiles>
        <profile>
            <id>binarios-caixa-repository</id>
            <activation>
                <activeByDefault>false</activeByDefault>
            </activation>
            <distributionManagement>
                <repository>
                    <id>binarios-caixa-repository</id>
                    <url>http://binario.caixa:8081/repository/caixa-group-br/</url>
                </repository>
                <snapshotRepository>
                    <id>binarios-caixa-repository</id>
                    <url>http://binario.caixa:8081/repository/snapshots/</url>
                </snapshotRepository>
            </distributionManagement>
        </profile>
        <profile>
            <id>internet_dev</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <war.name>sisme_internet</war.name>
                <deploy.config.name>internet</deploy.config.name>
            </properties>
            <distributionManagement>
                <repository>
                    <id>binarios-caixa-repository</id>
                    <url>http://binario.caixa:8081/repository/caixa-group-br/</url>
                </repository>
                <snapshotRepository>
                    <id>binarios-caixa-repository</id>
                    <url>http://binario.caixa:8081/repository/snapshots/</url>
                </snapshotRepository>
            </distributionManagement>
        </profile>
        <profile>
            <id>intranet_dev</id>
            <activation>
                <activeByDefault>false</activeByDefault>
            </activation>
            <properties>
                <war.name>sisme_intranet</war.name>
                <deploy.config.name>intranet</deploy.config.name>
            </properties>
            <distributionManagement>
                <repository>
                    <id>binarios-caixa-repository</id>
                    <url>http://binario.caixa:8081/repository/caixa-group-br/</url>
                </repository>
                <snapshotRepository>
                    <id>binarios-caixa-repository</id>
                    <url>http://binario.caixa:8081/repository/snapshots/</url>
                </snapshotRepository>
            </distributionManagement>
        </profile>
    </profiles>

</project>


<?xml version="1.0" encoding="UTF-8"?>
<!-- <web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee" -->
<!-- 	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" -->
<!-- 	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"> -->
<web-app xmlns="http://java.sun.com/xml/ns/javaee"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
      version="3.0">

	<display-name>Deployer Web JSF</display-name>

	<module-name>sisme</module-name>
	<context-param>
		<param-name>javax.faces.DEFAULT_SUFFIX</param-name>
		<param-value>.xhtml</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>
		<param-value>true</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.PROJECT_STAGE</param-name>
		<param-value>Development</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.SEPARATOR_CHAR</param-name>
		<param-value>-</param-value>
	</context-param>
	<context-param>
		<description>State saving method: 'client' or 'server' (=default). See JSF Specification 2.5.2</description>
		<param-name>javax.faces.STATE_SAVING_METHOD</param-name>
		<param-value>client</param-value>
	</context-param>
	<context-param>
		<param-name>javax.servlet.jsp.jstl.fmt.localizationContext</param-name>
		<param-value>resources.application</param-value>
	</context-param>
	<context-param>
		<param-name>primefaces.THEME</param-name>
		<param-value>none</param-value>
	</context-param>
	<context-param>
		<param-name>javax.faces.INTERPRET_EMPTY_STRING_SUBMITTED_VALUES_AS_NULL</param-name>
		<param-value>true</param-value>
	</context-param>
	<listener>
		<listener-class>com.sun.faces.config.ConfigureListener</listener-class>
	</listener>

	<servlet>
		<servlet-name>Faces Servlet</servlet-name>
		<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet>
		<servlet-name>image</servlet-name>
		<servlet-class>net.sf.jasperreports.j2ee.servlets.ImageServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>image</servlet-name>
		<url-pattern>/report/image</url-pattern>
	</servlet-mapping>
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>*.xhtml</url-pattern>
		<url-pattern>*.cef</url-pattern>
	</servlet-mapping>
	<filter>
		<filter-name>KeycloakFilter</filter-name>
		<filter-class>br.gov.cef.gitecbh.sso.filter.SSOLoginFilter</filter-class>
		<init-param>
			<param-name>ERROR_PAGE</param-name>
			<param-value>/error.html</param-value>
		</init-param>
		<init-param>
			<param-name>SUFFIX_CEF</param-name>
			<param-value>.xhtml,.cef</param-value>
		</init-param>
		<init-param>
			<param-name>INDEX_PAGE</param-name>
			<param-value>/pages/inicial/telaInicial.cef</param-value>
		</init-param>
	</filter>
	<filter-mapping>
		<filter-name>KeycloakFilter</filter-name>
		<url-pattern>*.cef</url-pattern>
		<url-pattern>*.js</url-pattern>
		<url-pattern>*.css</url-pattern>
		<url-pattern>*.ico</url-pattern>
		<url-pattern>*.xhtml</url-pattern>
	</filter-mapping>
	<filter>
	  <filter-name>PrimeFaces FileUpload Filter</filter-name>
	  <filter-class>
	  	org.primefaces.webapp.filter.FileUploadFilter
	  </filter-class>
	</filter>
	<filter-mapping>
		<filter-name>PrimeFaces FileUpload Filter</filter-name>
		<servlet-name>Faces Servlet</servlet-name>
	</filter-mapping>

	<!-- Identifica o projeto -->
	<context-param>
		<param-name>project.id</param-name>
		<param-value>sisme</param-value>
	</context-param>

	<!-- Restricao de seguranca -->
	<security-constraint>
		<display-name>HTTPS Constraint</display-name>
		<web-resource-collection>
			<web-resource-name>Login Page HTTPS</web-resource-name>
			<url-pattern>*.cef</url-pattern>
			<url-pattern>*.js</url-pattern>
			<url-pattern>*.css</url-pattern>
			<url-pattern>*.ico</url-pattern>
			<url-pattern>*.xhtml</url-pattern>
		</web-resource-collection>
		<auth-constraint>
            <role-name>*</role-name>
        </auth-constraint>
        <user-data-constraint>
            <transport-guarantee>CONFIDENTIAL</transport-guarantee>
        </user-data-constraint>
	</security-constraint>

	<!-- Pagina de Exemplo -->
	<security-constraint>
	    <web-resource-collection>
	      <web-resource-name>Página restrita para usuarios que podem acessar a pagina de Exemplo</web-resource-name>
	      <url-pattern>/pages/exemplo/pesquisarPaginaExemplo.xhtml</url-pattern>
	    </web-resource-collection>
	    <auth-constraint>
	      <role-name>acessar_novo_projeto</role-name>
	    </auth-constraint>
  	</security-constraint>

  	<login-config>
		<auth-method>KEYCLOAK</auth-method>
	</login-config>

	<!-- Tratamento de erro de acesso a paginas restritas -->
	<error-page>
		<error-code>403</error-code>
		<location>/error.html</location>
	</error-page>
	<error-page>
    	<error-code>400</error-code>
    	<location>/error.html</location>
	</error-page>
	<error-page>
    	<error-code>504</error-code>
    	<location>/error.html</location>
	</error-page>

	<!-- Definindo timeout de 30 minutos -->
	<session-config>
		<session-timeout>30</session-timeout>
	</session-config>
	<error-page>
		<exception-type>javax.faces.application.ViewExpiredException</exception-type>
		<location>/login.xhtml</location>
	</error-page>

	<welcome-file-list>
		<welcome-file>index.html</welcome-file>
	</welcome-file-list>


	<!-- System roles -->
	<security-role>
		<role-name>*</role-name>
	</security-role>

</web-app>




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

SISME
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
SISME

SISME_antepenultimo.xml
SISME_antes_sso.xml
SISME_cas.xml
SISME_pre_mpas.xml
SISME.xml
src
main
java
resources
br
gov
cef

sisme
entidades.properties
global_en_US.properties
global_pt_BR.properties
icones.properties
label_pt_BR.properties
mensagens_pt_BR.properties
menu_teste.properties
menu.properties
META-INF
infinispan_config.xml
webapp
caixa
pages
templates
WEB-INF
config
logo
relatorios
beans.xml
faces-config.xml
jboss-web.xml

hotfix/24869017_mint_ausencia_contrato

/
sisme-web
/
src
/
main
/
resources
/
br
/
gov
/
cef
/
sisme
sisme

New

Contents
History

entidades.properties
10 de nov. de 2017
939b1cd4
criacao entidades repository e controlller clista contrato [skip ci] soutoors
global_en_US.properties
15 de jan. de 2018
5264f6c6
Inicio da implantação US Ver Lista de Contratos PaulaJod
global_pt_BR.properties
28 de jan.
ffd61e10
24639505 - Merge da versao 2.90.1.0 do alm para o devops e correcao de bug co... f911719
icones.properties
10 de nov. de 2017
939b1cd4
criacao entidades repository e controlller clista contrato [skip ci] soutoors
label_pt_BR.properties
24 de nov. de 2025
21f4c62a
24361199 - Incluir Subtítulo Fábio Santos
mensagens_pt_BR.properties
5 de jun.
fe9277f2
Merge remote-tracking branch 'origin/branch-from-2.93.2.0' into bugfix/249153... f533960
menu_teste.properties
10 de nov. de 2017
939b1cd4
criacao entidades repository e controlller clista contrato [skip ci] soutoors
menu.properties
2 de jan.
a3000f4d
24520366 - Implementação da funcionalidade da API SIAC. lindenberg.roseno
Showing 55 items.

Finished loading items

Expanded

Searching...

Showing 2 filtered items.

Collapsed

Showing 2 filtered items.

