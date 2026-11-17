<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="https://maven.apache.org/POM/4.0.0"
	xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<artifactId>gec</artifactId>
		<groupId>br.gov.caixa.sigec</groupId>
		<version>${sigec.version}</version>
	</parent>
	<artifactId>gec-web</artifactId>
	<name>GEC Web module</name>
	<packaging>war</packaging>

	<scm>
		<developerConnection>scm:svn:http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-web</developerConnection>
		<connection>scm:svn:http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-web</connection>
		<url>http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-web</url>
	</scm>

	<properties>
		<!-- Padrao vazio: o JaCoCo (prepare-agent) preenche; o Surefire usa @{argLine} -->
		<argLine></argLine>
		<!-- Relatorio de cobertura lido pelo Sonar (este modulo) -->
		<sonar.coverage.jacoco.xmlReportPaths>${project.build.directory}/site/jacoco/jacoco.xml</sonar.coverage.jacoco.xmlReportPaths>
	</properties>

	<dependencies>

		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-ejb</artifactId>
			<type>ejb</type>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-xml</artifactId>
			<type>jar</type>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-services</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-core</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.annotation</groupId>
			<artifactId>jboss-annotations-api_1.1_spec</artifactId>
			<version>1.0.1.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-jaxrs</artifactId>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-jaxb-provider</artifactId>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-multipart-provider</artifactId>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
			<groupId>net.sf.scannotation</groupId>
			<artifactId>scannotation</artifactId>
			<version>1.0.2</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.enterprise</groupId>
			<artifactId>cdi-api</artifactId>
			<version>1.1</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>${servlet.version}</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sifec.componentes.seguranca.sso</groupId>
			<artifactId>seguranca-sso</artifactId>
			<version>1.1.1</version>
		</dependency>

		<dependency>
			<groupId>org.keycloak</groupId>
			<artifactId>keycloak-core</artifactId>
			<version>7.0.1</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.keycloak</groupId>
			<artifactId>keycloak-adapter-core</artifactId>
			<version>7.0.1</version>
			<scope>provided</scope>
		</dependency>
		
		<dependency>
            <groupId>org.keycloak</groupId>
            <artifactId>keycloak-adapter-spi</artifactId>
			<version>7.0.1</version>
			<scope>provided</scope>
        </dependency>

		<dependency>
			<groupId>org.hibernate.javax.persistence</groupId>
			<artifactId>hibernate-jpa-2.1-api</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Relatorios: JasperReports/OpenPDF sao fornecidos pelo lib/ do EAR online (gec-ear, profile online).
			Scope provided evita duplicar no WEB-INF/lib (LinkageError/ClassCastException). -->
		<dependency>
			<groupId>net.sf.jasperreports</groupId>
			<artifactId>jasperreports</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>com.github.librepdf</groupId>
			<artifactId>openpdf</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Apache POI (XSSF) usado por ExportaArquivoUtil; gerenciado como provided no pom pai -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
		</dependency>

		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
		</dependency>


		<dependency>
    		<groupId>javax</groupId>
    		<artifactId>javaee-api</artifactId>
    		<version>8.0.1</version>
    		<scope>provided</scope>
		</dependency>


		<!-- Testes unitarios (mesmas versoes ja usadas no gec-ejb) -->
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.13.2</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-core</artifactId>
			<scope>test</scope>
		</dependency>

	</dependencies>

	<build>
		<resources>
			<resource>
				<directory>src/main/resources</directory>
				<filtering>true</filtering>
			</resource>
		</resources>
		<plugins>
			<plugin>
				<artifactId>maven-war-plugin</artifactId>
				<version>${war.plugin.version}</version>
				<configuration>
					<failOnMissingWebXml>false</failOnMissingWebXml>
					<webResources>
						<resource>
							<directory>src/main/webapp</directory>
							<filtering>true</filtering>
							<includes>
								<include>index.html</include>
							</includes>
						</resource>
					</webResources>
				</configuration>
			</plugin>

			<!-- Cobertura: o gate de qualidade exige cobertura no codigo novo.
			     Executa os testes deste modulo mesmo com -DskipTests=true vindo do pipeline
			     (valor explicito na configuracao do plugin prevalece sobre a propriedade -D). -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<configuration>
					<skipTests>false</skipTests>
					<argLine>
						@{argLine}
						--add-opens java.base/java.lang=ALL-UNNAMED
						--add-opens java.base/java.io=ALL-UNNAMED
						--add-opens java.base/java.lang.reflect=ALL-UNNAMED
						--add-opens java.base/java.util=ALL-UNNAMED
						--add-opens java.base/java.util.concurrent=ALL-UNNAMED
					</argLine>
				</configuration>
			</plugin>

			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.12</version>
				<executions>
					<execution>
						<id>jacoco-prepare-agent</id>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>jacoco-report</id>
						<phase>test</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>

</project>





        <deployment>
                <resources>
                        <resource-root path="gec-ejb.jar" />
                </resources>
                <exclusions>
                        <module name="cef" />
                </exclusions>
                <dependencies>
                        <module name="deployment.framework.jar" />
                        <module name="deployment.framework_sisgd.jar" />
                        <!-- module name="org.jboss.ejb-client" / -->
                </dependencies>

        </deployment>
        <sub-deployment name="gec-web.war">
                <!-- This corresponds to the module for a web deployment -->
                <!-- it can use all the same tags as the <deployment> entry above <dependencies>
                        <module name="deployment.emp-ear.ear.emp-ejb-0.0.1-SNAPSHOT.jar" /> </dependencies> -->
        </sub-deployment>
        <sub-deployment name="gec-api.war">
                <exclusions>
                        <module name="cef" />
                </exclusions>
                <dependencies>
                        <module name="deployment.framework.jar" />
                        <module name="deployment.framework_sisgd.jar" />
                </dependencies>
        </sub-deployment>
</jboss-deployment-structure>
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# unzip -p gec-ear.ear gec-web.war 2>/dev/null > /tmp/gec-web.war && unzip -l /tmp/gec-web.war | grep -iE "jboss-deployment-structure|jboss-web.xml|WEB-INF/lib/.*(sisgd|framework)"
      105  11-16-2026 15:02   WEB-INF/jboss-web.xml
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# unzip -l /tmp/gec-web.war | grep -i arqref
   235509  11-16-2026 15:03   WEB-INF/lib/arqref-core-3.7.2.2.jar
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# mkdir -p /tmp/dsfix/META-INF && cd /tmp/dsfix
[root@caddeapllx2871 dsfix]#
[root@caddeapllx2871 dsfix]#
[root@caddeapllx2871 dsfix]# unzip -p /opt/jboss-eap/standalone/deployments/gec-ear.ear META-INF/jboss-deployment-structure.xml > META-INF/jboss-deployment-structure.xml
[root@caddeapllx2871 dsfix]#
[root@caddeapllx2871 dsfix]#
[root@caddeapllx2871 dsfix]#
[root@caddeapllx2871 dsfix]#

