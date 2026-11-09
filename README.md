Crie a branch cetis e substitua o siemp-ear/pom.xml pelo arquivo que te mandei.
Rode o build. Se falhar com Could not find artifact br.gov.caixa:framework:jar:2.0.1, o jar não está no Nexus que a esteira usa, e aí precisamos publicá-lo ou pedir o link ao Denilson.
Confira o .ear gerado: tar -tf siemp.ear | findstr /i framework deve mostrar lib/framework-2.0.1.jar.
Deploy pela esteira e log no 2864:
sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|WFLYCTL0013|ERROR|ClassNotFound|NoClassDefFound"



<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<parent>
		<artifactId>siemp</artifactId>
		<groupId>br.gov.caixa.siemp</groupId>
		<version>14.37.0.6</version>
	</parent>

	<artifactId>siemp-ear</artifactId>
	<packaging>ear</packaging>

	<name>SIEMP EAR module</name>

	<dependencies>
		<!-- Depend on the ejb module and war so that we can package them -->
		<dependency>
			<groupId>br.gov.caixa.siemp</groupId>
			<artifactId>siemp-web</artifactId>
			<type>war</type>
		</dependency>

		<!-- JBoss EAP 7.4: o framework passa a ser empacotado no lib/ do EAR
			(antes era fornecido pelo servidor como deployment "framework.jar").
			No siemp-web o framework continua com scope provided. -->
		<dependency>
			<groupId>br.gov.caixa</groupId>
			<artifactId>framework</artifactId>
			<version>2.0.1</version>
			<type>jar</type>
		</dependency>
	</dependencies>

	<build>
		<finalName>siemp</finalName>
		<resources>
			<resource>
				<directory>src/main/application/META-INF</directory>
				<filtering>true</filtering>
				<includes>
					<include>**/*.xml</include>
				</includes>
			</resource>
		</resources>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-ear-plugin</artifactId>
				<version>${ear.plugin.version}</version>
				<configuration>
					<!-- Tell Maven we are using Java EE 6 -->
					<version>6</version>
					<!-- Use Java EE ear libraries as needed. Java EE ear libraries are
						in easy way to package any libraries needed in the ear, and automatically
						have any modules (EJB-JARs and WARs) use them -->
					<defaultLibBundleDir>lib</defaultLibBundleDir>
					<modules>
						<webModule>
							<groupId>br.gov.caixa.siemp</groupId>
							<artifactId>siemp-web</artifactId>
							<uri>siemp-web.war</uri>
							<contextRoot>/siemp</contextRoot>
						</webModule>
						<jarModule>
							<groupId>br.gov.caixa</groupId>
							<artifactId>framework</artifactId>
							<bundleDir>lib</bundleDir>
						</jarModule>
					</modules>
					<!-- JBoss EAP 7.4: removida a entrada "Dependencies: deployment.framework.jar"
						do MANIFEST.MF, pois o framework agora vai dentro do EAR (lib/). -->
				</configuration>
			</plugin>
			<!-- The JBoss AS plugin deploys your ear to a local JBoss AS container -->
			<!-- Due to Maven's lack of intelligence with EARs we need to configure
				the jboss-as maven plugin to skip deployment for all modules. We then enable
				it specifically in the ear module. -->
			<plugin>
				<groupId>org.jboss.as.plugins</groupId>
				<artifactId>jboss-as-maven-plugin</artifactId>
				<configuration>
					<skip>false</skip>
				</configuration>
			</plugin>
		</plugins>
	</build>

	<profiles>
		<profile>
			<id>fabrica</id>
			<distributionManagement>
				<repository>
					<id>releases</id>
					<url>http://10.61.1.208:8081/nexus/content/repositories/releases</url>
				</repository>
				<snapshotRepository>
					<id>snapshots</id>
					<url>http://10.61.1.208:8081/nexus/content/repositories/snapshots</url>
				</snapshotRepository>
			</distributionManagement>
		</profile>
	</profiles>

</project>
