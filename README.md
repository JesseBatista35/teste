<project xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.gov.caixa</groupId>
	<artifactId>simpg</artifactId>
	<version>1.15.5</version>
	<packaging>war</packaging>
	<name>SIMPG</name>
	<description>Sistema BD CAIXA WEB</description>

	<properties>
		<maven.compiler.source>17</maven.compiler.source>
		<maven.compiler.target>17</maven.compiler.target>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<sonar.host.url>http://qualidade.pedes.caixa</sonar.host.url>
		<sonar.projectKey>SIMPG</sonar.projectKey>

		<version.arquillian-bom>1.1.11.Final</version.arquillian-bom>

		<sonar.cpd.exclusions>
			**/*entity/**/*,
			**/*entities/**/*,
			**/*vo/**/*
		</sonar.cpd.exclusions>

		<sonar.exclusions>
			**/lib/**/*.js,
			src/main/webapp/html/**/*
			src/main/test/**/*
		</sonar.exclusions>

		<version.surefire.plugin>2.18</version.surefire.plugin>

		<maven.version>3.6.3</maven.version>
	</properties>

	<build>
		<finalName>${project.artifactId}</finalName>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.6.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>

			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>build-helper-maven-plugin</artifactId>
				<version>3.0.0</version>
				<executions>
					<execution>
						<phase>generate-sources</phase>
						<goals>
							<goal>add-source</goal>
						</goals>
						<configuration>
							<sources>
								<source>src/main/src-arq</source>
							</sources>
						</configuration>
					</execution>
				</executions>
			</plugin>

			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>3.2.3</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
					<webResources>
						<webResource>
							<directory>src/main/webapp/</directory>
							<excludes>
								<exclude>html/home.html</exclude>
								<exclude>html/login.html</exclude>
							</excludes>
							<filtering>false</filtering>
						</webResource>
					</webResources>
					<webResources>
						<webResource>
							<directory>src/main/webapp/</directory>
							<includes>
								<include>html/home.html</include>
								<include>html/login.html</include>
							</includes>
							<filtering>true</filtering>
						</webResource>
					</webResources>
				</configuration>
			</plugin>

			<!-- <plugin>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>${version.surefire.plugin}</version>
				<configuration>
					<skip>false</skip>
				</configuration>
			</plugin> -->

			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-release-plugin</artifactId>
				<configuration>
					<autoVersionSubmodules>true</autoVersionSubmodules>
					<tagNameFormat>@{project.version}</tagNameFormat>
					<pushChanges>false</pushChanges>
					<localCheckout>true</localCheckout>
				</configuration>
			</plugin>

		</plugins>

		<resources>
			<resource>
				<directory>src/main/resources</directory>
				<filtering>true</filtering>
				<includes>
					<include>conf/label.properties</include>
				</includes>
			</resource>
			<resource>
				<directory>src/main/resources</directory>
				<filtering>false</filtering>
				<excludes>
					<exclude>conf/label.properties</exclude>
				</excludes>
			</resource>
		</resources>
	</build>

	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.jboss.arquillian</groupId>
				<artifactId>arquillian-bom</artifactId>
				<version>${version.arquillian-bom}</version>
				<scope>import</scope>
				<type>pom</type>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<dependencies>

		<dependency>
			<groupId>commons-codec</groupId>
			<artifactId>commons-codec</artifactId>
			<version>1.6</version>
		</dependency>

		<dependency>
			<groupId>commons-fileupload</groupId>
			<artifactId>commons-fileupload</artifactId>
			<version>1.3.1</version>
		</dependency>

		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.4</version>
		</dependency>

		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.2.4</version>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.9.10</version>
		</dependency>

		<dependency>
			<groupId>com.novell.ldap</groupId>
			<artifactId>jldap</artifactId>
			<version>4.3</version>
		</dependency>

		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa</groupId>
			<artifactId>loginx</artifactId>
			<version>4.1</version>
		</dependency>

		<dependency> 
			<groupId>org.keycloak</groupId> 
				<artifactId>keycloak-core</artifactId> 
				<version>15.0.2</version> 
			<scope>provided</scope> 
		</dependency> 
		<dependency> 
			<groupId>org.keycloak</groupId> 
				<artifactId>keycloak-adapter-core</artifactId> 
				<version>15.0.2</version> 
			<scope>provided</scope> 
		</dependency> 
		<dependency> 
			<groupId>org.keycloak</groupId> 
				<artifactId>keycloak-servlet-filter-adapter</artifactId> 
				<version>15.0.2</version> 
			<scope>provided</scope> 
		</dependency> 

		<dependency>
			<groupId>com.thoughtworks.xstream</groupId>
			<artifactId>xstream</artifactId>
			<version>1.4.4</version>
			<exclusions>
				<exclusion>
					<groupId>xpp3</groupId>
					<artifactId>xpp3_min</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>commons-beanutils</groupId>
			<artifactId>commons-beanutils</artifactId>
			<version>1.8.2</version>
			<exclusions>
				<exclusion>
					<groupId>commons-logging</groupId>
					<artifactId>commons-logging</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>commons-collections</groupId>
			<artifactId>commons-collections</artifactId>
			<version>3.2.1</version>
		</dependency>

		<dependency>
			<groupId>commons-digester</groupId>
			<artifactId>commons-digester</artifactId>
			<version>2.1</version>
			<exclusions>
				<exclusion>
					<groupId>commons-logging</groupId>
					<artifactId>commons-logging</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>org.codehaus.groovy</groupId>
			<artifactId>groovy-all</artifactId>
			<version>2.0.1</version>
		</dependency>

		<dependency>
			<groupId>com.lowagie</groupId>
			<artifactId>itext</artifactId>
			<version>2.1.7.js2</version>
			<exclusions>
				<exclusion>
					<groupId>org.bouncycastle</groupId>
					<artifactId>bctsp-jdk14</artifactId>
				</exclusion>
				<exclusion>
					<groupId>bouncycastle</groupId>
					<artifactId>bcmail-jdk14</artifactId>
				</exclusion>
				<exclusion>
					<groupId>bouncycastle</groupId>
					<artifactId>bcprov-jdk14</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-csv</artifactId>
			<version>1.9.0</version>
		</dependency>


		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>3.14</version>
		</dependency>

		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>3.14</version>
			<exclusions>
				<exclusion>
					<groupId>stax</groupId>
					<artifactId>stax-api</artifactId>
				</exclusion>
				<exclusion>
					<groupId>com.github.virtuald</groupId>
					<artifactId>curvesapi</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>commons-lang</groupId>
			<artifactId>commons-lang</artifactId>
			<version>2.6-redhat-2</version>
		</dependency>


		<dependency>
			<groupId>javax.enterprise</groupId>
			<artifactId>cdi-api</artifactId>
			<version>1.0-SP4</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.inject</groupId>
			<artifactId>javax.inject</artifactId>
			<version>1</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.ejb3</groupId>
			<artifactId>jboss-ejb3-ext-api</artifactId>
			<version>2.0.0</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.ejb</groupId>
			<artifactId>jboss-ejb-api_3.1_spec</artifactId>
			<version>1.0.1.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.el</groupId>
			<artifactId>jboss-el-api_2.2_spec</artifactId>
			<version>1.0.0.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.interceptor</groupId>
			<artifactId>jboss-interceptors-api_1.1_spec</artifactId>
			<version>1.0.0.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.ws.rs</groupId>
			<artifactId>jboss-jaxrs-api_1.1_spec</artifactId>
			<version>1.0.1.Final-redhat-2</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.faces</groupId>
			<artifactId>jboss-jsf-api_2.1_spec</artifactId>
			<version>2.0.1.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.servlet</groupId>
			<artifactId>jboss-servlet-api_3.0_spec</artifactId>
			<version>1.0.0.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.mail</groupId>
			<artifactId>mail</artifactId>
			<version>1.4.4</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.1</version>
		</dependency>

		<dependency>
			<groupId>org.glassfish.jaxb</groupId>
			<artifactId>jaxb-runtime</artifactId>
			<version>2.3.1</version>
		</dependency>

		<dependency>
			<groupId>com.sun.xml.bind</groupId>
			<artifactId>jaxb-core</artifactId>
			<version>2.3.0.1</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.arquillian.junit</groupId>
			<artifactId>arquillian-junit-container</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.arquillian.protocol</groupId>
			<artifactId>arquillian-protocol-servlet</artifactId>
			<scope>test</scope>
		</dependency>


		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-core</artifactId>
			<version>4.0.0</version>
		</dependency>

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-inline</artifactId>
			<version>5.2.0</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>net.java.dev.jna</groupId>
			<artifactId>jna</artifactId>
			<version>5.13.0</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-all</artifactId>
			<version>1.10.18</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.assertj</groupId>
			<artifactId>assertj-core</artifactId>
			<version>3.13.2</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.0.11.Final</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-entitymanager</artifactId>
			<version>5.0.11.Final</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<version>1.4.199</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>com.mpobjects.jasperreports.font</groupId>
			<artifactId>jasperreports-fonts-liberation</artifactId>
			<version>2.1.2</version>
		</dependency>

		<dependency>
			<groupId>net.sf.jasperreports</groupId>
			<artifactId>jasperreports</artifactId>
			<version>6.20.0</version>
		</dependency>
		<dependency>
			<groupId>net.sf.jasperreports</groupId>
			<artifactId>jasperreports-fonts</artifactId>
			<version>6.20.0</version>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<version>42.5.0</version>
		</dependency>
 </dependencies>

	<profiles>
		<profile>
			<id>default</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<build>
				<plugins>
					<plugin>
						<groupId>org.jacoco</groupId>
						<artifactId>jacoco-maven-plugin</artifactId>
						<version>0.8.4</version>
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
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-surefire-plugin</artifactId>
						<version>${version.surefire.plugin}</version>
						<configuration>
							<skipTests>false</skipTests>
						</configuration>
					</plugin>
				</plugins>
			</build>
		</profile>
	</profiles>

</project>



ess
