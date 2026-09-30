Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\p585600> cd C:\temp\siccr; tar -xf <modulo>.jar -C x
No linha:1 caractere:27
+ cd C:\temp\siccr; tar -xf <modulo>.jar -C x
+                           ~
Operador '<' reservado para uso futuro.
    + CategoryInfo          : ParserError: (:) [], ParentContainsErrorRecordException
    + FullyQualifiedErrorId : RedirectionNotSupported

PS C:\Users\p585600> $c = Get-ChildItem x -Recurse -Filter *.class | Select-Object -First 1
PS C:\Users\p585600> $b = [IO.File]::ReadAllBytes($c.FullName); $b[6]*256 + $b[7]
Exceção ao chamar "ReadAllBytes" com "1" argumento(s): "Nome de caminho vazio não é válido."
No linha:1 caractere:1
+ $b = [IO.File]::ReadAllBytes($c.FullName); $b[6]*256 + $b[7]
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : NotSpecified: (:) [], MethodInvocationException
    + FullyQualifiedErrorId : ArgumentException

Não é possível indexar em uma matriz nula.
No linha:1 caractere:44
+ $b = [IO.File]::ReadAllBytes($c.FullName); $b[6]*256 + $b[7]
+                                            ~~~~~~~~~~~~~~~~~
    + CategoryInfo          : InvalidOperation: (:) [], RuntimeException
    + FullyQualifiedErrorId : NullArray

PS C:\Users\p585600> cd C:\temp\siccr
PS C:\temp\siccr> Get-Content META-INF\MANIFEST.MF
Manifest-Version: 1.0
Archiver-Version: Plexus Archiver
Built-By: c161779
Created-By: Apache Maven 3.9.9
Build-Jdk: 1.8.0_131
Dependencies: deployment.wmq.jmsra.rar,org.joda.time,org.codehaus.jack
 son.jackson-mapper-asl,deployment.framework.jar

PS C:\temp\siccr> Get-Content META-INF\maven\br.gov.caixa.ccr.parametros\sifec-ccr-parametros\pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
        <modelVersion>4.0.0</modelVersion>

        <parent>
                <groupId>br.gov.caixa.ccr.parametros</groupId>
                <artifactId>ccr-parametros-parent</artifactId>
                <version>${tributo.version}</version>
                <relativePath>../pom.xml</relativePath>
        </parent>

        <artifactId>sifec-ccr-parametros</artifactId>
        <packaging>ear</packaging>

        <dependencies>

                <dependency>
                        <groupId>br.gov.caixa.arqref</groupId>
                        <artifactId>arqref-services</artifactId>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa.ccr.parametros</groupId>
                        <artifactId>ccr-parametros-ejb</artifactId>
                        <type>ejb</type>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa.ccr.parametros</groupId>
                        <artifactId>ccr-parametros-web</artifactId>
                        <type>war</type>
                </dependency>

                <dependency>
                        <groupId>br.gov.caixa.ccr.parametros</groupId>
                        <artifactId>ccr-parametros-api</artifactId>
                        <type>war</type>
                </dependency>

                <!-- <dependency>
                        <groupId>br.gov.caixa.sifec.security.sso</groupId>
                        <artifactId>sifec-security-sso</artifactId>
                </dependency> -->

                <dependency>
                        <groupId>org.keycloak</groupId>
                        <artifactId>keycloak-admin-client</artifactId>
                </dependency>

        </dependencies>

        <build>
                <finalName>${project.artifactId}</finalName>
                <plugins>
                        <plugin>
                                <groupId>org.apache.maven.plugins</groupId>
                                <artifactId>maven-ear-plugin</artifactId>
                                <version>${ear.plugin.version}</version>
                                <configuration>
                                        <version>6</version>
                                        <defaultLibBundleDir>lib</defaultLibBundleDir>
                                        <modules>
                                                <ejbModule>
                                                        <groupId>br.gov.caixa.ccr.parametros</groupId>
                                                        <artifactId>ccr-parametros-ejb</artifactId>
                                                        <uri>ccr-parametros-ejb.jar</uri>
                                                </ejbModule>
                                                <webModule>
                                                        <groupId>br.gov.caixa.ccr.parametros</groupId>
                                                        <artifactId>ccr-parametros-web</artifactId>
                                                        <uri>ccr-parametros-web.war</uri>
                                                </webModule>
                                                <webModule>
                                                        <groupId>br.gov.caixa.ccr.parametros</groupId>
                                                        <artifactId>ccr-parametros-api</artifactId>
                                                        <uri>ccr-parametros-api.war</uri>
                                                </webModule>
                                        </modules>
                                        <archive>
                                                <manifestEntries>
                                                        <Dependencies>
                                                                deployment.wmq.jmsra.rar,org.joda.time,org.codehaus.jackson.jackson-mapper-asl,deployment.framework.jar
                                                        </Dependencies>
                                                </manifestEntries>
                                        </archive>
                                </configuration>
                        </plugin>
                        <plugin>
                                <groupId>org.codehaus.mojo</groupId>
                                <artifactId>animal-sniffer-maven-plugin</artifactId>
                                <configuration>
                                        <signature>
                                                <groupId>org.codehaus.mojo.signature</groupId>
                                                <artifactId>java16</artifactId>
                                                <version>1.0</version>
                                        </signature>
                                </configuration>
                                <executions>
                                        <execution>
                                                <id>animal-sniffer</id>
                                                <phase>verify</phase>
                                                <goals>
                                                        <goal>check</goal>
                                                </goals>
                                        </execution>
                                </executions>
                        </plugin>
                </plugins>
        </build>

</project>
PS C:\temp\siccr> mkdir x -Force; tar -xf ccr-parametros-ejb.jar -C x


    Diretório: C:\temp\siccr


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----        30/09/2026     14:40                x


PS C:\temp\siccr> $c = Get-ChildItem x -Recurse -Filter *.class | Select-Object -First 1
PS C:\temp\siccr> $b = [IO.File]::ReadAllBytes($c.FullName); $b[6]*256 + $b[7]
52
PS C:\temp\siccr> Get-ChildItem x -Recurse -Filter persistence.xml | Get-Content
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
          http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
        version="2.0">

        <persistence-unit name="default" transaction-type="JTA">
                <!--
                <jta-data-source>java:/jdbc/OracleSiccrDSTQS</jta-data-source>
                -->
                <jta-data-source>java:/jdbc/OracleSiccrTributarioDS</jta-data-source>

                <shared-cache-mode>ENABLE_SELECTIVE</shared-cache-mode>

                <exclude-unlisted-classes>false</exclude-unlisted-classes>

                <mapping-file>META-INF/sql/produtoSistema.xml</mapping-file>
                <mapping-file>META-INF/sql/modalidade.xml</mapping-file>
                <mapping-file>META-INF/sql/parametroProdutoDominio.xml</mapping-file>
                <mapping-file>META-INF/sql/parametroProdutoAtualizacao.xml</mapping-file>
                <mapping-file>META-INF/sql/indicadorPercentual.xml</mapping-file>
                <mapping-file>META-INF/sql/controleExecucao.xml</mapping-file>
                <mapping-file>META-INF/sql/sistema.xml</mapping-file>
                <mapping-file>META-INF/sql/especieTomador.xml</mapping-file>
                <mapping-file>META-INF/sql/especieOperacaoCredito.xml</mapping-file>
                <mapping-file>META-INF/sql/aliquotaIof.xml</mapping-file>
                <mapping-file>META-INF/sql/assinaturaFiscal.xml</mapping-file>
                <mapping-file>META-INF/sql/parametroEspecieTomador.xml</mapping-file>
                <mapping-file>META-INF/sql/parametroTomador.xml</mapping-file>
                <mapping-file>META-INF/sql/parametroNaturezaJuridica.xml</mapping-file>
                <mapping-file>META-INF/sql/parametroEspecieCnae.xml</mapping-file>
                <mapping-file>META-INF/sql/feriado.xml</mapping-file>
                <mapping-file>META-INF/sql/naturezaJuridica.xml</mapping-file>
                <mapping-file>META-INF/sql/cnae.xml</mapping-file>
                <mapping-file>META-INF/sql/contrato.xml</mapping-file>
                <mapping-file>META-INF/sql/unidade.xml</mapping-file>
                <mapping-file>META-INF/sql/assinaturaEspecieOperacaoCredito.xml</mapping-file>
                <mapping-file>META-INF/sql/parcelaContrato.xml</mapping-file>
                <mapping-file>META-INF/sql/indicadorEconomico.xml</mapping-file>
                <mapping-file>META-INF/sql/rotativo.xml</mapping-file>
                <mapping-file>META-INF/sql/aliquotaOperacaoIof.xml</mapping-file>

                <properties>
                        <property name="hibernate.dialect" value="org.hibernate.dialect.Oracle10gDialect" />
                        <property name="hibernate.default_schema" value="CCR" />
                        <property name="hibernate.jdbc.batch_size" value="30" />
                        <property name="hibernate.default_batch_fetch_size" value="30" />
                        <property name="hibernate.show_sql" value="true" />
                        <property name="hibernate.use_sql_comments" value="true" />
                        <property name="hibernate.format_sql" value="true" />
                        <property name="hibernate.connection.isolation" value="1" />
                        <property name="hibernate.connection.autocommit" value="false" />
                        <property name="hibernate.type" value="trace"/>


                        <!-- Cache -->
                        <property name="hibernate.cache.use_second_level_cache" value="true" />
                        <property name="hibernate.cache.use_query_cache" value = "true" />
                        <property name="hibernate.cache.region.factory_class" value="org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory" />
                        <property name="hibernate.javax.cache.uri" value="ehcache.xml" />
                        <property name="hibernate.javax.cache.provider" value="net.sf.ehcache.hibernate.EhCacheProvider" />

                </properties>
        </persistence-unit>
</persistence>
PS C:\temp\siccr> tar -tf ccr-parametros-api.war | Select-String "WEB-INF/lib"

WEB-INF/lib/
WEB-INF/lib/commons-beanutils-1.9.4.jar
WEB-INF/lib/cucumber-java-7.0.0.jar
WEB-INF/lib/jackson-core-2.8.4.jar
WEB-INF/lib/jackson-jaxrs-json-provider-2.5.4.redhat-1.jar
WEB-INF/lib/commons-logging-1.2.jar
WEB-INF/lib/cucumber-core-7.0.0.jar
WEB-INF/lib/cucumber-plugin-7.0.0.jar
WEB-INF/lib/jsr311-api-1.1.1.jar
WEB-INF/lib/apiguardian-api-1.1.2.jar
WEB-INF/lib/commons-collections-3.2.2.jar
WEB-INF/lib/cucumber-gherkin-7.0.0.jar
WEB-INF/lib/cucumber-gherkin-messages-7.0.0.jar
WEB-INF/lib/cucumber-spring-7.0.0.jar
WEB-INF/lib/messages-17.1.1.jar
WEB-INF/lib/stax2-api-3.1.4.jar
WEB-INF/lib/swagger-jaxrs-1.5.7.jar
WEB-INF/lib/tag-expressions-4.0.2.jar
WEB-INF/lib/java-jwt-3.19.1.jar
WEB-INF/lib/javassist-3.15.0-GA.jar
WEB-INF/lib/joda-time-1.6.2.jar
WEB-INF/lib/jwks-rsa-0.21.1.jar
WEB-INF/lib/annotations-2.0.1.jar
WEB-INF/lib/commons-lang3-3.7.jar
WEB-INF/lib/cucumber-expressions-13.0.1.jar
WEB-INF/lib/cucumber-junit-7.0.0.jar
WEB-INF/lib/swagger-models-1.5.7.jar
WEB-INF/lib/snakeyaml-1.12.jar
WEB-INF/lib/swagger-annotations-1.5.7.jar
WEB-INF/lib/gson-2.8.5.jar
WEB-INF/lib/html-formatter-17.0.0.jar
WEB-INF/lib/jackson-annotations-2.8.4.jar
WEB-INF/lib/jackson-dataformat-xml-2.4.5.jar
WEB-INF/lib/jackson-dataformat-yaml-2.4.5.jar
WEB-INF/lib/jackson-jaxrs-base-2.5.4.redhat-1.jar
WEB-INF/lib/create-meta-6.0.1.jar
WEB-INF/lib/docstring-7.0.0.jar
WEB-INF/lib/swagger-core-1.5.7.jar
WEB-INF/lib/validation-api-1.0.0.GA.jar
WEB-INF/lib/datatable-7.0.0.jar
WEB-INF/lib/guava-18.0.jar
WEB-INF/lib/jackson-databind-2.8.4.jar
WEB-INF/lib/jackson-datatype-joda-2.4.5.jar
WEB-INF/lib/jackson-module-jaxb-annotations-2.5.4.jar
WEB-INF/lib/reflections-0.9.10.jar
WEB-INF/lib/seguranca-sso-inside-1.0.0.jar
WEB-INF/lib/slf4j-api-1.6.4.jar


PS C:\temp\siccr>
