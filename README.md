

^C
[p585600@caddeapllx2864 ~]$ hostname -i
10.116.202.54
[p585600@caddeapllx2864 ~]$ sudo tail -f /logs/jboss/jboss-eap/standalone/siemp-java-web/server.log | grep -E "WFLYSRV0010|WFLYSRV0025|WFLYSRV0026|WFLYCTL0013|WFLYCTL0412|ERROR|framework|modcluster"
[sudo] senha para p585600:
service jboss.module.spec.service."deployment.framework.jar".main (faltam) dependentes: [service jboss.module.resolve.phase."deployment.siemp-ear.ear.siemp-web.war".main.1, service jboss.module.resolve.phase."deployment.siemp-ear.ear".main.1]
2026-11-09 09:56:18,033 ERROR [org.jboss.as] (Controller Boot Thread) WFLYSRV0026: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado (com erros) em 6713ms - Iniciado(s) 363 de serviços 611 (6 serviços falharam ou tinham dependências ausentes, os serviços 361 estão lentos, passivos ou sob demanda)




Ele disse que tem que ajsutar o pkm deles agora que vai dar certo

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>br.gov.caixa.siemp</groupId>
	<artifactId>siemp</artifactId>
	<version>14.37.0.6</version>
	<packaging>pom</packaging>
	<name>siemp application</name>

	<modules>
		<module>siemp-web</module>
		<module>siemp-ear</module>
	</modules>

	<properties>

		<siemp.version>14.37.0.6</siemp.version> 
		
        <maven.build.timestamp.format>dd/MM/yyyy</maven.build.timestamp.format>
        <dev.build.timestamp>${maven.build.timestamp}</dev.build.timestamp>
		
		<!-- Java 17 is the common compilation baseline for all Java modules. -->
		<maven.compiler.release>17</maven.compiler.release>

		<!-- Libs IBM -->
		<jmqi.version>1.0</jmqi.version>
		<msg-cliente-jms-detail.version>1.0</msg-cliente-jms-detail.version>

		<!-- [WARNING] Using platform encoding (UTF-8 actually) to copy filtered
			resources, i.e. build is platform dependent! -->
		<!-- Preserve the legacy source/resource encoding during the JDK migration. -->
		<project.build.sourceEncoding>Cp1252</project.build.sourceEncoding>

		<!-- JBoss dependency versions -->
		<jboss.as.plugin.version>7.3.Final</jboss.as.plugin.version>

		<!-- Define the version of JBoss' Java EE 6 APIs and Tools we want to import. -->
		<jboss.bom.version>1.0.4.Final</jboss.bom.version>
		<!-- Alternatively, comment out the above line, and un-comment the line
			below to use version 1.0.2.Final-redhat-1 which is a release certified to
			work with JBoss EAP 6. It requires you have access to the JBoss EAP 6 maven
			repository. -->
		<!-- <jboss.bom.version>1.0.2.Final-redhat-1</jboss.bom.version>> -->
		<!-- other plugin versions -->
		<compiler.plugin.version>3.11.0</compiler.plugin.version>
		<resources.plugin.version>3.3.1</resources.plugin.version>
		<war.plugin.version>3.4.0</war.plugin.version>
		<ear.plugin.version>3.3.0</ear.plugin.version>
	</properties>

	<dependencyManagement>
		<dependencies>

			<!-- Define the version of the WAR so that we don't need to repeat ourselves
				in every module -->
			<dependency>
				<groupId>br.gov.caixa.siemp</groupId>
				<artifactId>siemp-web</artifactId>
				<version>${siemp.version}</version>
				<type>war</type>
				<scope>compile</scope>
			</dependency>

			<!-- JBoss distributes a complete set of Java EE 6 APIs including a Bill
				of Materials (BOM). A BOM specifies the versions of a "stack" (or a collection)
				of artifacts. We use this here so that we always get the correct versions
				of artifacts. Here we use the jboss-javaee-6.0-with-tools stack (you can
				read this as the JBoss stack of the Java EE 6 APIs, with some extras tools
				for your project, such as Arquillian for testing) and the jboss-javaee-6.0-with-hibernate
				stack you can read this as the JBoss stack of the Java EE 6 APIs, with extras
				from the Hibernate family of projects) -->
			<dependency>
				<groupId>org.jboss.bom</groupId>
				<artifactId>jboss-javaee-6.0-with-tools</artifactId>
				<version>${jboss.bom.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
			<dependency>
				<groupId>org.jboss.bom</groupId>
				<artifactId>jboss-javaee-6.0-with-hibernate</artifactId>
				<version>${jboss.bom.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>

		</dependencies>
	</dependencyManagement>

	<build>
		<pluginManagement>
			<plugins>
				<plugin>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>${compiler.plugin.version}</version>
					<configuration>
						<release>${maven.compiler.release}</release>
						<encoding>${project.build.sourceEncoding}</encoding>
					</configuration>
				</plugin>
				<!-- The JBoss AS plugin deploys your ear to a local JBoss AS container -->
				<!-- Due to Maven's lack of intelligence with EARs we need to configure
					the jboss-as maven plugin to skip deployment for all modules. We then enable
					it specifically in the ear module. -->
				<plugin>
					<groupId>org.jboss.as.plugins</groupId>
					<artifactId>jboss-as-maven-plugin</artifactId>
					<version>${jboss.as.plugin.version}</version>
					<inherited>true</inherited>
					<configuration>
						<skip>true</skip>
					</configuration>
				</plugin>
				<!-- <plugin> <groupId>org.apache.maven.plugins</groupId> <artifactId>maven-release-plugin</artifactId>
					<version>2.2.2</version> <configuration> <tagBase>http://bsbsrvsvncaixa/caixa/emprestimo/sifec/tags/fontes</tagBase>
					</configuration> </plugin> -->
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-resources-plugin</artifactId>
					<version>${resources.plugin.version}</version>
					<configuration>
							<encoding>${project.build.sourceEncoding}</encoding>
        			</configuration>
				</plugin>
			</plugins>
		</pluginManagement>
	</build>

	<profiles>
		<!-- O módulo de modernização é opcional e permanece fora do reactor
		     legado. Ative-o somente quando a pasta estiver disponível. -->
		<profile>
			<id>quarkus</id>
			<modules>
				<module>siemp-quarkus</module>
			</modules>
		</profile>
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
