Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\WINDOWS\System32> cd $env:USERPROFILE\Downloads
PS C:\Users\p585600\Downloads> tar -tf sifec-ccr-parametros.ear
META-INF/MANIFEST.MF
META-INF/
lib/
META-INF/maven/
META-INF/maven/br.gov.caixa.ccr.parametros/
META-INF/maven/br.gov.caixa.ccr.parametros/sifec-ccr-parametros/
ccr-parametros-web.war
lib/hibernate-jpa-2.0-api-1.0.1.Final.jar
lib/jackson-core-2.1.4.jar
lib/jasperreports-6.5.1.jar
lib/slf4j-api-1.6.4.jar
lib/antlr-2.7.7.jar
lib/hibernate-commons-annotations-4.0.1.Final.jar
lib/hibernate-validator-4.2.0.Final.jar
lib/javassist-3.15.0-GA.jar
lib/jcommon-1.0.23.jar
lib/jfreechart-1.0.19.jar
lib/lucene-queryparser-4.5.1.jar
lib/olap4j-0.9.7.309-JS-3.jar
lib/stax-api-1.0-2.jar
lib/validation-api-1.0.0.GA.jar
ccr-parametros-ejb.jar
lib/ehcache-2.10.4.jar
lib/stax-1.2.0.jar
META-INF/application.xml
META-INF/jboss-deployment-structure.xml
lib/arqref-business-2.2.4.jar
lib/commons-collections-3.2.2.jar
lib/commons-logging-1.1.1.jar
lib/dom4j-1.6.1.jar
lib/hibernate-core-4.1.1.Final.jar
lib/keycloak-common-3.2.1.Final.jar
lib/lucene-analyzers-common-4.5.1.jar
lib/mapstruct-1.2.0.Final.jar
ccr-parametros-api.war
lib/arqref-core-3.6.0.2.jar
lib/commons-collections4-4.1.jar
lib/commons-lang-2.6.jar
lib/ehcache-core-2.4.3.jar
lib/jakarta-regexp-1.4.jar
lib/xml-apis-1.0.b2.jar
META-INF/maven/br.gov.caixa.ccr.parametros/sifec-ccr-parametros/pom.xml
META-INF/maven/br.gov.caixa.ccr.parametros/sifec-ccr-parametros/pom.properties
lib/arqref-services-3.11.1.jar
lib/core-3.2.1.jar
lib/hibernate-jpamodelgen-1.2.0.Final.jar
lib/icu4j-57.1.jar
lib/bcpkix-jdk15on-1.52.jar
lib/hibernate-ehcache-4.1.1.Final.jar
lib/jackson-databind-2.1.4.jar
lib/jboss-logging-3.1.0.GA.jar
lib/keycloak-admin-client-3.2.1.Final.jar
lib/keycloak-core-3.2.1.Final.jar
lib/lucene-queries-4.5.1.jar
lib/lucene-sandbox-4.5.1.jar
lib/castor-core-1.3.3.jar
lib/bcprov-jdk15on-1.52.jar
lib/jackson-annotations-2.1.4.jar
lib/cache-api-1.1.0.redhat-1.jar
lib/commons-beanutils-1.9.3.jar
lib/commons-digester-2.1.jar
lib/ecj-4.4.2.jar
lib/jasperreports-fonts-4.0.0.jar
lib/lucene-core-4.5.1.jar
lib/stax-api-1.0.1.jar
lib/castor-xml-1.3.3.jar
lib/commons-lang3-3.7.jar
lib/hibernate-validator-annotation-processor-4.2.0.Final.jar
lib/itext-2.1.7.js6.jar
lib/javax.inject-1.jar
lib/jboss-transaction-api_1.1_spec-1.0.1.Final.jar
PS C:\Users\p585600\Downloads> mkdir C:\temp\siccr -Force; tar -xf sifec-ccr-parametros.ear -C C:\temp\siccr


    Diretório: C:\temp


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----        30/09/2026     14:36                siccr


PS C:\Users\p585600\Downloads> Get-Content C:\temp\siccr\META-INF\application.xml
<?xml version="1.0" encoding="UTF-8"?>
<application xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_6.xsd" version="6">
  <display-name>sifec-ccr-parametros</display-name>
  <module>
    <ejb>ccr-parametros-ejb.jar</ejb>
  </module>
  <module>
    <web>
      <web-uri>ccr-parametros-web.war</web-uri>
      <context-root>/ccr-parametros-web</context-root>
    </web>
  </module>
  <module>
    <web>
      <web-uri>ccr-parametros-api.war</web-uri>
      <context-root>/ccr-parametros-api</context-root>
    </web>
  </module>
  <library-directory>lib</library-directory>
</application>
PS C:\Users\p585600\Downloads> Get-ChildItem C:\temp\siccr -Recurse -Include *.jar,*.war | Select-Object Name, Length

Name                                                       Length
----                                                       ------
antlr-2.7.7.jar                                            445288
arqref-business-2.2.4.jar                                   80019
arqref-core-3.6.0.2.jar                                    186686
arqref-services-3.11.1.jar                                 795499
bcpkix-jdk15on-1.52.jar                                    622849
bcprov-jdk15on-1.52.jar                                   2902942
cache-api-1.1.0.redhat-1.jar                                52874
castor-core-1.3.3.jar                                       49513
castor-xml-1.3.3.jar                                       872827
commons-beanutils-1.9.3.jar                                246174
commons-collections-3.2.2.jar                              588337
commons-collections4-4.1.jar                               751238
commons-digester-2.1.jar                                   196768
commons-lang-2.6.jar                                       284220
commons-lang3-3.7.jar                                      499634
commons-logging-1.1.1.jar                                   60686
core-3.2.1.jar                                             544403
dom4j-1.6.1.jar                                            313898
ecj-4.4.2.jar                                             2310271
ehcache-2.10.4.jar                                        8911940
ehcache-core-2.4.3.jar                                    1006424
hibernate-commons-annotations-4.0.1.Final.jar               81271
hibernate-core-4.1.1.Final.jar                            4381748
hibernate-ehcache-4.1.1.Final.jar                          136606
hibernate-jpa-2.0-api-1.0.1.Final.jar                      102661
hibernate-jpamodelgen-1.2.0.Final.jar                      163197
hibernate-validator-4.2.0.Final.jar                        366592
hibernate-validator-annotation-processor-4.2.0.Final.jar    58360
icu4j-57.1.jar                                           11289823
itext-2.1.7.js6.jar                                       1131479
jackson-annotations-2.1.4.jar                               34476
jackson-core-2.1.4.jar                                     206866
jackson-databind-2.1.4.jar                                 926562
jakarta-regexp-1.4.jar                                      28576
jasperreports-6.5.1.jar                                   5498542
jasperreports-fonts-4.0.0.jar                             2480052
javassist-3.15.0-GA.jar                                    648253
javax.inject-1.jar                                           2497
jboss-logging-3.1.0.GA.jar                                  60768
jboss-transaction-api_1.1_spec-1.0.1.Final.jar              25215
jcommon-1.0.23.jar                                         330246
jfreechart-1.0.19.jar                                     1565065
keycloak-admin-client-3.2.1.Final.jar                       56817
keycloak-common-3.2.1.Final.jar                            131271
keycloak-core-3.2.1.Final.jar                              218911
lucene-analyzers-common-4.5.1.jar                         1586103
lucene-core-4.5.1.jar                                     2297477
lucene-queries-4.5.1.jar                                   205195
lucene-queryparser-4.5.1.jar                               384884
lucene-sandbox-4.5.1.jar                                    45578
mapstruct-1.2.0.Final.jar                                   20720
olap4j-0.9.7.309-JS-3.jar                                  445343
slf4j-api-1.6.4.jar                                         25962
stax-1.2.0.jar                                             179346
stax-api-1.0-2.jar                                          23346
stax-api-1.0.1.jar                                          26514
validation-api-1.0.0.GA.jar                                 47433
xml-apis-1.0.b2.jar                                        109318
ccr-parametros-api.war                                   16539617
ccr-parametros-ejb.jar                                    1459107
ccr-parametros-web.war                                    2061725


PS C:\Users\p585600\Downloads>


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

PS C:\Users\p585600>


<img width="1412" height="348" alt="image" src="https://github.com/user-attachments/assets/bfeeae34-caf7-4553-852f-38f4a66480da" />


<?xml version="1.0" encoding="UTF-8"?>
<application xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_6.xsd" version="6">
  <display-name>sifec-ccr-parametros</display-name>
  <module>
    <ejb>ccr-parametros-ejb.jar</ejb>
  </module>
  <module>
    <web>
      <web-uri>ccr-parametros-web.war</web-uri>
      <context-root>/ccr-parametros-web</context-root>
    </web>
  </module>
  <module>
    <web>
      <web-uri>ccr-parametros-api.war</web-uri>
      <context-root>/ccr-parametros-api</context-root>
    </web>
  </module>
  <library-directory>lib</library-directory>
</application>


<jboss-deployment-structure>
  <ear-subdeployments-isolated>false</ear-subdeployments-isolated>
  <deployment>
    <resources>
      <resource-root path="ccr-parametros-ejb.jar" />
    </resources>
    <dependencies>
      <module name="org.codehaus.jackson.jackson-mapper-asl" />
      <module name="org.joda.time" />
    </dependencies>
  </deployment>
  <sub-deployment name="ccr-parametros-web.war"></sub-deployment>
</jboss-deployment-structure>




hibernate-jpa-2.0-api-1.0.1.Final.jar
jackson-core-2.1.4.jar
jasperreports-6.5.1.jar
slf4j-api-1.6.4.jar
antlr-2.7.7.jar
hibernate-commons-annotations-4.0.1.Final.jar
hibernate-validator-4.2.0.Final.jar
javassist-3.15.0-GA.jar
jcommon-1.0.23.jar
jfreechart-1.0.19.jar
lucene-queryparser-4.5.1.jar
olap4j-0.9.7.309-JS-3.jar
stax-api-1.0-2.jar
validation-api-1.0.0.GA.jar
ehcache-2.10.4.jar
stax-1.2.0.jar
arqref-business-2.2.4.jar
commons-collections-3.2.2.jar
commons-logging-1.1.1.jar
dom4j-1.6.1.jar
hibernate-core-4.1.1.Final.jar
keycloak-common-3.2.1.Final.jar
lucene-analyzers-common-4.5.1.jar
mapstruct-1.2.0.Final.jar
arqref-core-3.6.0.2.jar
commons-collections4-4.1.jar
commons-lang-2.6.jar
ehcache-core-2.4.3.jar
jakarta-regexp-1.4.jar
xml-apis-1.0.b2.jar
arqref-services-3.11.1.jar
core-3.2.1.jar
hibernate-jpamodelgen-1.2.0.Final.jar
icu4j-57.1.jar
bcpkix-jdk15on-1.52.jar
hibernate-ehcache-4.1.1.Final.jar
jackson-databind-2.1.4.jar
jboss-logging-3.1.0.GA.jar
keycloak-admin-client-3.2.1.Final.jar
keycloak-core-3.2.1.Final.jar
lucene-queries-4.5.1.jar
lucene-sandbox-4.5.1.jar
castor-core-1.3.3.jar
bcprov-jdk15on-1.52.jar
jackson-annotations-2.1.4.jar
cache-api-1.1.0.redhat-1.jar
commons-beanutils-1.9.3.jar
commons-digester-2.1.jar
ecj-4.4.2.jar
jasperreports-fonts-4.0.0.jar
lucene-core-4.5.1.jar
stax-api-1.0.1.jar
castor-xml-1.3.3.jar
commons-lang3-3.7.jar
hibernate-validator-annotation-processor-4.2.0.Final.jar
itext-2.1.7.js6.jar
javax.inject-1.jar
jboss-transaction-api_1.1_spec-1.0.1.Final.jar
