14 de janeiro estava assim:

<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<name>SIGPD</name>

	<groupId>br.gov.caixa.sigpd</groupId>
	<artifactId>sigpd</artifactId>
	<version>1.8.1-SNAPSHOT</version>
	<packaging>pom</packaging>

	<modules>
		<module>ear</module>
		<module>core</module>
		<module>api</module>
		<module>batch</module>
	</modules>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<maven.compiler.target>${java.version}</maven.compiler.target>
		<maven.compiler.source>${java.version}</maven.compiler.source>
		<maven.build.timestamp.format>dd/MM/yyyy HH:mm::ss</maven.build.timestamp.format>
		<dev.build.timestamp>${maven.build.timestamp}</dev.build.timestamp>

		<java.version>1.8</java.version>
		<jee.version>7.0</jee.version>
		<lombok.version>1.18.10</lombok.version>
		<swagger.version>1.6.1</swagger.version>
		<oracle.version>12.2.0.1</oracle.version>
		<junit.version>4.12</junit.version>
		<mockito.version>3.1.0</mockito.version>
		<hamcrest.version>2.2</hamcrest.version>
		<powermock.version>2.0.7</powermock.version>
		<glassfish.embedded.version>3.1</glassfish.embedded.version>
		<hibernate.version>6.0.2.Final</hibernate.version>
		<jackson.version>2.13.3</jackson.version>
		<jackson.datatype>2.6.0</jackson.datatype>
		<jboss.resteasy>3.0.16.Final</jboss.resteasy>
		<apache.commons.lang>3.11</apache.commons.lang>
		<version.weld-junit>4.0.0.Final</version.weld-junit>
		<graalvm.version>20.2.0</graalvm.version>


    hoje ta assim:


    <?xml version="1.0" encoding="UTF-8" standalone="no"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<name>SIGPD</name>

	<groupId>br.gov.caixa.sigpd</groupId>
	<artifactId>sigpd</artifactId>
	<version>3.4.2.10</version>
	<packaging>pom</packaging>

	<modules>
		<module>ear</module>
		<module>core</module>
		<module>api</module>
		<module>batch</module>
	</modules>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<maven.compiler.target>${java.version}</maven.compiler.target>
		<maven.compiler.source>${java.version}</maven.compiler.source>
		<maven.build.timestamp.format>dd/MM/yyyy HH:mm::ss</maven.build.timestamp.format>
		<dev.build.timestamp>${maven.build.timestamp}</dev.build.timestamp>

		<java.version>1.8</java.version>
		<jee.version>7.0</jee.version>
		<lombok.version>1.18.10</lombok.version>
		<swagger.version>1.6.1</swagger.version>
		<oracle.version>12.2.0.1</oracle.version>
		<junit.version>4.12</junit.version>
		<mockito.version>3.1.0</mockito.version>
		<hamcrest.version>2.2</hamcrest.version>
		<powermock.version>2.0.7</powermock.version>
		<glassfish.embedded.version>3.1</glassfish.embedded.version>
		<hibernate.version>6.0.2.Final</hibernate.version>
