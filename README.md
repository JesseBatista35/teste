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
	<artifactId>gec-ejb</artifactId>
	<packaging>ejb</packaging>
	<name>GEC EJB module</name>

	<scm>
		<developerConnection>
			scm:svn:http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-ejb</developerConnection>
		<connection>
			scm:svn:http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-ejb</connection>
		<url>
			http://10.61.1.149/caixa/emprestimo/sigec_port/trunk/03-Implementacao/Fontes/gec/gec-ejb</url>
	</scm>

	<dependencies>

		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-xml</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-azure</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.sigec</groupId>
			<artifactId>gec-common</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.spec.javax.ejb</groupId>
			<artifactId>jboss-ejb-api_3.1_spec</artifactId>
			<version>1.0.2.Final</version>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>javax.enterprise</groupId>
			<artifactId>cdi-api</artifactId>
			<version>1.1</version>
			<scope>provided</scope>
		</dependency>
		
		<!-- Depend?ncias de teste -->
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

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-inline</artifactId>
			<version>5.2.0</version>
			<scope>test</scope>
		</dependency>

		<!-- JAXB runtime para testes locais sem servidor -->
		<dependency>
			<groupId>org.glassfish.jaxb</groupId>
			<artifactId>jaxb-runtime</artifactId>
			<scope>test</scope>
		</dependency>

		<!-- RESTEasy dependencies -->
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-jaxrs</artifactId>
		</dependency>
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-client</artifactId>
		</dependency>
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-jackson2-provider</artifactId>
		</dependency>
		<dependency>
			<groupId>org.jboss.resteasy</groupId>
			<artifactId>resteasy-multipart-provider</artifactId>
		</dependency>

		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<scope>compile</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.arquillian.junit</groupId>
			<artifactId>arquillian-junit-container</artifactId>
			<version>1.4.0.Final</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.jboss.arquillian.protocol</groupId>
			<artifactId>arquillian-protocol-servlet</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-services</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa</groupId>
			<artifactId>framework</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
			<groupId>com.ibm.mq</groupId>
			<artifactId>jmqi</artifactId>
		</dependency>

		<dependency>
			<groupId>br.gov.caixa.arqref</groupId>
			<artifactId>arqref-core</artifactId>
			<exclusions>
				<exclusion>
					<groupId>org.hibernate</groupId>
					<artifactId>hibernate</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>commons-codec</groupId>
			<artifactId>commons-codec</artifactId>
		</dependency>

		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
		</dependency>

		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
		</dependency>

		<dependency>
			<groupId>org.apache.velocity</groupId>
			<artifactId>velocity-engine-core</artifactId>
			<version>2.3</version>
		</dependency>
		<dependency>
			<groupId>org.apache.velocity</groupId>
			<artifactId>velocity-tools</artifactId>
			<version>2.0</version>
			<exclusions>
				<exclusion>
					<groupId>javax.servlet</groupId>
					<artifactId>servlet-api</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.1</version>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.1</version>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.1</version>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
		</dependency>

		<dependency>
			<groupId>com.squareup.okhttp3</groupId>
			<artifactId>okhttp</artifactId>
			<exclusions>
				<exclusion>
					<groupId>org.jetbrains.kotlin</groupId>
					<artifactId>kotlin-stdlib-jdk7</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
		</dependency>

		<dependency>
			<groupId>org.hibernate.javax.persistence</groupId>
			<artifactId>hibernate-jpa-2.1-api</artifactId>
			<scope>provided</scope>
		</dependency>

		<dependency>
				<groupId>com.fasterxml.jackson.core</groupId>
				<artifactId>jackson-annotations</artifactId>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.core</groupId>
				<artifactId>jackson-core</artifactId>
			</dependency>

			<dependency>
				<groupId>com.fasterxml.jackson.core</groupId>
				<artifactId>jackson-databind</artifactId>
			</dependency>
			
			<dependency>
				<groupId>com.fasterxml.jackson.dataformat</groupId>
				<artifactId>jackson-dataformat-yaml</artifactId>
			</dependency>
			
			<dependency>
			    <groupId>com.fasterxml.jackson.dataformat</groupId>
			    <artifactId>jackson-dataformat-xml</artifactId>
			</dependency>
			
			<dependency>
			    <groupId>com.fasterxml.jackson.datatype</groupId>
			    <artifactId>jackson-datatype-jsr310</artifactId>
			</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.jaxrs</groupId>
			<artifactId>jackson-jaxrs-json-provider</artifactId>
			<scope>provided</scope>
		</dependency>

	</dependencies>

	<build>
		<resources>
			<!-- Arquivos de texto: filtering ativo para substituir ${...} -->
			<resource>
				<directory>src/main/resources</directory>
				<filtering>true</filtering>
				<excludes>
					<!-- Arquivos bin?rios: n?o podem ter filtering (MalformedInputException) -->
					<exclude>**/*.7z</exclude>
					<exclude>**/*.zip</exclude>
					<exclude>**/*.jar</exclude>
					<exclude>**/*.png</exclude>
					<exclude>**/*.jpg</exclude>
					<exclude>**/*.jpeg</exclude>
					<exclude>**/*.gif</exclude>
					<exclude>**/*.pdf</exclude>
					<exclude>**/*.xls</exclude>
					<exclude>**/*.xlsx</exclude>
					<exclude>**/*.doc</exclude>
					<exclude>**/*.docx</exclude>
				</excludes>
			</resource>
			<!-- Arquivos bin?rios: copiados sem filtering -->
			<resource>
				<directory>src/main/resources</directory>
				<filtering>false</filtering>
				<includes>
					<include>**/*.7z</include>
					<include>**/*.zip</include>
					<include>**/*.jar</include>
					<include>**/*.png</include>
					<include>**/*.jpg</include>
					<include>**/*.jpeg</include>
					<include>**/*.gif</include>
					<include>**/*.pdf</include>
					<include>**/*.xls</include>
					<include>**/*.xlsx</include>
					<include>**/*.doc</include>
					<include>**/*.docx</include>
				</includes>
			</resource>
		</resources>

		<plugins>
			<plugin>
				<artifactId>maven-ejb-plugin</artifactId>
				<version>${ejb.plugin.version}</version>
				<configuration>
					<ejbVersion>3.1</ejbVersion>
				</configuration>
			</plugin>
		</plugins>
	</build>

	<profiles>

		<profile>
			<id>arquillian-jbossas-managed</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<dependencies>
				<dependency>
					<groupId>org.jboss.spec</groupId>
					<artifactId>jboss-javaee-6.0</artifactId>
					<version>1.0.0.Final</version>
					<type>pom</type>
					<scope>provided</scope>
				</dependency>
				<dependency>
					<groupId>org.jboss.as</groupId>
					<artifactId>jboss-as-arquillian-container-managed</artifactId>
					<version>7.1.3.Final</version>
					<scope>test</scope>
				</dependency>
				<dependency>
					<groupId>org.jboss.arquillian.protocol</groupId>
					<artifactId>arquillian-protocol-servlet</artifactId>
					<version>1.4.0.Final</version>
					<scope>test</scope>
				</dependency>
			</dependencies>

			<build>
				<plugins>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-ejb-plugin</artifactId>
						<version>${ejb.plugin.version}</version>
					</plugin>
				</plugins>
			</build>
		</profile>

		<profile>
			<!-- An optional Arquillian testing profile that executes tests in a
			remote 
				JBoss AS instance -->
			<!-- Run with: mvn clean test -Parq-jbossas-remote -->
			<id>arq-jbossas-remote</id>
			<dependencies>
				<dependency>
					<groupId>org.jboss.as</groupId>
					<artifactId>jboss-as-arquillian-container-remote</artifactId>
					<scope>test</scope>
				</dependency>
			</dependencies>
		</profile>
	</profiles>

</project>


gec-ejb/src/test/java/br/gov/caixa/sigec/api/simtr/validator/FileSizeValidatorTest.java



package br.gov.caixa.sigec.api.simtr.validator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Testes unitários para a classe FileSizeValidator
 */
public class FileSizeValidatorTest {
    
    @Test
    public void testGetPdfSizeLimit() {
        assertEquals(1024 * 1024, FileSizeValidator.getPdfSizeLimit());
    }
    
    @Test
    public void testGetAudioSizeLimit() {
        assertEquals(5 * 1024 * 1024, FileSizeValidator.getAudioSizeLimit());
    }
    
    @Test
    public void testIsPdfSizeExceeded() {
        assertTrue(FileSizeValidator.isPdfSizeExceeded(2 * 1024 * 1024)); // 2MB > 1MB
        assertFalse(FileSizeValidator.isPdfSizeExceeded(512 * 1024)); // 512KB < 1MB
        assertFalse(FileSizeValidator.isPdfSizeExceeded(1024 * 1024)); // 1MB = 1MB
    }
    
    @Test
    public void testIsAudioSizeExceeded() {
        assertTrue(FileSizeValidator.isAudioSizeExceeded(6 * 1024 * 1024)); // 6MB > 5MB
        assertFalse(FileSizeValidator.isAudioSizeExceeded(4 * 1024 * 1024)); // 4MB < 5MB
        assertFalse(FileSizeValidator.isAudioSizeExceeded(5 * 1024 * 1024)); // 5MB = 5MB
    }
    
    @Test
    public void testFormatSizeInMB() {
        assertEquals("1,00 MB", FileSizeValidator.formatSizeInMB(1024 * 1024));
        assertEquals("2,50 MB", FileSizeValidator.formatSizeInMB((long)(2.5 * 1024 * 1024)));
        assertEquals("0,50 MB", FileSizeValidator.formatSizeInMB(512 * 1024));
    }
    
    @Test
    public void testIsFileSizeValid() {
        // Teste para PDF
        assertTrue(FileSizeValidator.isFileSizeValid(512 * 1024, "application/pdf")); // 512KB < 1MB
        assertFalse(FileSizeValidator.isFileSizeValid(2 * 1024 * 1024, "application/pdf")); // 2MB > 1MB
        
        // Teste para áudio
        assertTrue(FileSizeValidator.isFileSizeValid(4 * 1024 * 1024, "audio/mp3")); // 4MB < 5MB
        assertFalse(FileSizeValidator.isFileSizeValid(6 * 1024 * 1024, "audio/wav")); // 6MB > 5MB
        
        // Teste para tipo não conhecido (deve permitir)
        assertTrue(FileSizeValidator.isFileSizeValid(10 * 1024 * 1024, "application/unknown"));
    }
}


