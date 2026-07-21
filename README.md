<img width="1876" height="933" alt="image" src="https://github.com/user-attachments/assets/c9af39c6-96e2-4f1a-9d44-fcc979a1eb93" />




#H2
#server.port=8083
#spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_ON_EXIT=FALSE
#spring.datasource.driverClassName=org.h2.Driver
#spring.datasource.username=sa
#spring.datasource.password=password
#spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
#spring.jpa.defer-datasource-initialization=true
#spring.datasource.data=classpath:Carga06RSATB014.sql,classpath:Carga01RSATB003.sql,classpath:Carga07RSATB015.sql,classpath:Carga04RSATB006.sql,classpath:Carga05RSATB007.sql,classpath:CargaTabela44.sql
#spring.h2.console.enabled=true
#spring.jpa.defer-datasource-initialization=true 

#Oracle
spring.datasource.url=__URL_BANCO__
spring.datasource.username=__DBUSER__
spring.datasource.password=__DB_PASS__
#spring.datasource.schema=RSA
#spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.batch.initialize-schema=always
spring.jpa.properties.hibernate.format_sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.Oracle12cDialect
spring.jpa.properties.hibernate.default_schema=RSA
spring.datasource.driver.class=oracle.jdbc.driver.OracleDriver

#Mapeamento Arquivos de entrada e saida
diretorio.destino=__URL_SIRSA__
arquivo.origem=${diretorio.destino}/APC.MZ.BFD2.M2212.J79MZS.SIRSA.DRSAC
arquivo.destino=${diretorio.destino}/drsac.xml
arquivo.nao.validados=${diretorio.destino}/nao_validados_sicli.txt
arquivo.erro.bacen=${diretorio.destino}/erro_bacen.txt
arquivo.leiaute=/producao/rotina/RSADB001/rst/leiaute.xsd
diretorio.processado=__URL_SIRSA__/processado/

#API
sso.url=__SSO_URL__
api.cadastro.url=__API_URL__
cli.ser=__CLISER__
cli.secret=__CLISECRET__
cli.credential=__CLICREDENTIAL__

api.key=__API_KEY_SIRSA__

api.siico.url=__API_URL_SIICO__
api.siico.privada.url=__API_URL_PRIVADA_SIICO__
api.siico.publica.url=__API_URL_PUBLICA_SIICO__
api.siico.key=__API_KEY_SIICO__

#SpringBatch - Configurações adicionais
spring.batch.jdbc.table-prefix=RSA.RSA_BCH_
spring.batch.job.enabled=true

#Variaveis para teste API 
api.siico.produto=__API_PRODUTO_SIICO__
api.siico.empregado=__API_EMPREGADO_SIICO__
api.sicli.cliente=__API_CLIENTE_SICLI__




# Introduction 
Projeto SIRSA Batch Config desenvolvido pela FSW Spread em 2022

# Build and Test
Este projeto é usado em tempo de pipeline de release pelo projeto SIRSA Batch

- VM ambiente DES: caddeapllx1369.agil.nprd.caixa.gov.br 

Observações:
- toda pasta ou arquivo dentro de /scripts_ctm sobe para a pasta /producao na VM
- qualquer outra pasta ou arquivo sobem para a pasta /opt/batch/config
- arquivo caixa-truststore.jks contempla os certificados necessários para a execução do pacote sirsa-batch.jar via linha de comando    

# Contribute
- ValidadorMDR: https://www.bcb.gov.br/estabilidadefinanceira/validador_xml_info





<img width="1886" height="915" alt="image" src="https://github.com/user-attachments/assets/0b4d01b8-85fe-4695-b986-601014b43c99" />







<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.6.7</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>

	<groupId>br.gov.caixa</groupId>
	<artifactId>sirsa-batch</artifactId>
	<version>1.08.02-Release</version>
	<name>spring-batch-main</name>
	<description>SIRSA Spring Batch</description>

	<properties>
		<java.version>11</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.0</version>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-batch</artifactId>
		</dependency>
		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-mail</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.batch</groupId>
			<artifactId>spring-batch-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>com.oracle.database.jdbc</groupId>
			<artifactId>ojdbc8</artifactId>
			<scope>runtime</scope>
		</dependency>

		<!-- Dependências ValidadorMdr do BACEN -->

		<dependency>
			<groupId>br.gov.bcb</groupId>
			<artifactId>ValidadorMdr</artifactId>
			<version>1.3</version>			
		</dependency>

		<dependency>
			<groupId>br.gov.bcb</groupId>
			<artifactId>bc_excecoes</artifactId>
			<version>1.3</version>			
		</dependency>	

		<dependency>
			<groupId>xerces</groupId>
			<artifactId>xercesImpl</artifactId>
			<version>2.9.0</version>			
		</dependency>

		<dependency>
			<groupId>jcifs</groupId>
			<artifactId>jcifs</artifactId>
			<version>1.3.17</version>			
		</dependency>

		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.14</version>			
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		
		<dependency>
    		<groupId>org.apache.poi</groupId>
    		<artifactId>poi-ooxml</artifactId>
    		<version>4.1.0</version>
		</dependency>
		
	</dependencies>
	
	<repositories>
		<repository>
			<id>nexus</id>
			<name>Nexus Caixa</name>
			<url>http://binario.caixa:8081/#browse/search/maven</url>
		</repository>
	</repositories>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

