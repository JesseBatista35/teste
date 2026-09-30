1. Details

Name: SIFEC-CCR-EAP7-JDK8
Description: REQ000146318691 - Cenário 1: JBoss EAP 7 mantendo Java 8

2. Add applications: upload do SIFEC-CCR.ear.

3. Set transformation target: selecione só o card Application server migration → JBoss EAP 7.

Select packages: deixe o padrão, mas confira se br.gov.caixa está marcado. Libs de terceiros (hibernate, jackson etc.) podem ficar de fora, senão o relatório incha e demora.

4. Advanced → Options: se houver campo source, informe eap6 (ou java-ee). O resto pode ficar como está.

5. Review → Save and run.

Depois repita tudo para o cenário 2:

Name: SIFEC-CCR-EAP7-JDK17
Targets: JBoss EAP 7 + OpenJDK 17. Se o card OpenJDK tiver seletor de versão, escolha 17.

Opcional, enquanto roda: veja o que muda entre os dois EARs, porque isso já adianta a análise da REQ de parâmetros:

powershell
cd $env:USERPROFILE\Downloads
Compare-Object (tar -tf SIFEC-CCR.ear) (tar -tf sifec-ccr-parametros.ear)
Packages
antlr
br
com
edu
freemarker
io
javassist
javax
jersey
META-INF
net
org



28 items
Included packages


antlr

br

com.auth0

com.beust

com.ctc

com.fasterxml

com.github

com.itextpdf

com.keypoint

com.nimbusds

com.opencsv

edu

io

javassist

jersey

META-INF

net.jcip

net.minidev

org.aopalliance

org.glassfish

org.htmlcleaner

org.jdom2

org.jvnet

org.mapstruct

org.objectweb

org.reflections

org.yaml


<img width="1615" height="732" alt="image" src="https://github.com/user-attachments/assets/662e1d35-4cbf-446a-bdd4-bca6866791bc" />



PS C:\Users\p585600\Downloads> cd $env:USERPROFILE\Downloads
PS C:\Users\p585600\Downloads> Compare-Object (tar -tf SIFEC-CCR.ear) (tar -tf sifec-ccr-parametros.ear)

InputObject                                                                    SideIndicator
-----------                                                                    -------------
META-INF/maven/br.gov.caixa.ccr.parametros/                                    =>
META-INF/maven/br.gov.caixa.ccr.parametros/sifec-ccr-parametros/               =>
ccr-parametros-web.war                                                         =>
lib/hibernate-jpa-2.0-api-1.0.1.Final.jar                                      =>
lib/jackson-core-2.1.4.jar                                                     =>
lib/jasperreports-6.5.1.jar                                                    =>
lib/slf4j-api-1.6.4.jar                                                        =>
lib/antlr-2.7.7.jar                                                            =>
lib/hibernate-commons-annotations-4.0.1.Final.jar                              =>
lib/hibernate-validator-4.2.0.Final.jar                                        =>
lib/javassist-3.15.0-GA.jar                                                    =>
lib/jcommon-1.0.23.jar                                                         =>
lib/jfreechart-1.0.19.jar                                                      =>
lib/lucene-queryparser-4.5.1.jar                                               =>
lib/olap4j-0.9.7.309-JS-3.jar                                                  =>
lib/stax-api-1.0-2.jar                                                         =>
lib/validation-api-1.0.0.GA.jar                                                =>
ccr-parametros-ejb.jar                                                         =>
lib/ehcache-2.10.4.jar                                                         =>
lib/stax-1.2.0.jar                                                             =>
lib/arqref-business-2.2.4.jar                                                  =>
lib/commons-collections-3.2.2.jar                                              =>
lib/commons-logging-1.1.1.jar                                                  =>
lib/dom4j-1.6.1.jar                                                            =>
lib/hibernate-core-4.1.1.Final.jar                                             =>
lib/keycloak-common-3.2.1.Final.jar                                            =>
lib/lucene-analyzers-common-4.5.1.jar                                          =>
lib/mapstruct-1.2.0.Final.jar                                                  =>
ccr-parametros-api.war                                                         =>
lib/arqref-core-3.6.0.2.jar                                                    =>
lib/commons-collections4-4.1.jar                                               =>
lib/commons-lang-2.6.jar                                                       =>
lib/ehcache-core-2.4.3.jar                                                     =>
lib/jakarta-regexp-1.4.jar                                                     =>
lib/xml-apis-1.0.b2.jar                                                        =>
META-INF/maven/br.gov.caixa.ccr.parametros/sifec-ccr-parametros/pom.xml        =>
META-INF/maven/br.gov.caixa.ccr.parametros/sifec-ccr-parametros/pom.properties =>
lib/arqref-services-3.11.1.jar                                                 =>
lib/core-3.2.1.jar                                                             =>
lib/hibernate-jpamodelgen-1.2.0.Final.jar                                      =>
lib/icu4j-57.1.jar                                                             =>
lib/bcpkix-jdk15on-1.52.jar                                                    =>
lib/hibernate-ehcache-4.1.1.Final.jar                                          =>
lib/jackson-databind-2.1.4.jar                                                 =>
lib/jboss-logging-3.1.0.GA.jar                                                 =>
lib/keycloak-admin-client-3.2.1.Final.jar                                      =>
lib/keycloak-core-3.2.1.Final.jar                                              =>
lib/lucene-queries-4.5.1.jar                                                   =>
lib/lucene-sandbox-4.5.1.jar                                                   =>
lib/castor-core-1.3.3.jar                                                      =>
lib/bcprov-jdk15on-1.52.jar                                                    =>
lib/jackson-annotations-2.1.4.jar                                              =>
lib/cache-api-1.1.0.redhat-1.jar                                               =>
lib/commons-beanutils-1.9.3.jar                                                =>
lib/commons-digester-2.1.jar                                                   =>
lib/ecj-4.4.2.jar                                                              =>
lib/jasperreports-fonts-4.0.0.jar                                              =>
lib/lucene-core-4.5.1.jar                                                      =>
lib/stax-api-1.0.1.jar                                                         =>
lib/castor-xml-1.3.3.jar                                                       =>
lib/commons-lang3-3.7.jar                                                      =>
lib/hibernate-validator-annotation-processor-4.2.0.Final.jar                   =>
lib/itext-2.1.7.js6.jar                                                        =>
lib/javax.inject-1.jar                                                         =>
lib/jboss-transaction-api_1.1_spec-1.0.1.Final.jar                             =>
ccr-api.war                                                                    <=
ccr-ejb.jar                                                                    <=
ccr-web.war                                                                    <=
lib/accessors-smart.jar                                                        <=
lib/activation.jar                                                             <=
lib/annotations.jar                                                            <=
lib/antlr.jar                                                                  <=
lib/aopalliance-repackaged.jar                                                 <=
lib/arqref-business.jar                                                        <=
lib/arqref-core.jar                                                            <=
lib/arqref-services.jar                                                        <=
lib/arqref-web.jar                                                             <=
lib/asm.jar                                                                    <=
lib/b3-rest.jar                                                                <=
lib/commons-beanutils.jar                                                      <=
lib/commons-codec.jar                                                          <=
lib/commons-collections.jar                                                    <=
lib/commons-digester.jar                                                       <=
lib/commons-imaging.jar                                                        <=
lib/commons-io.jar                                                             <=
lib/commons-lang3.jar                                                          <=
lib/commons-logging.jar                                                        <=
lib/componente-calculo.jar                                                     <=
lib/conexoes-rest.jar                                                          <=
lib/conta-deposito-rest.jar                                                    <=
lib/convenente-dataprev-leilao-rest.jar                                        <=
lib/convenente-dataprev-rest.jar                                               <=
lib/convenente-dataprev2-rest.jar                                              <=
lib/convenente-serpro-soap.jar                                                 <=
lib/core.jar                                                                   <=
lib/cvp-rest.jar                                                               <=
lib/dom4j.jar                                                                  <=
lib/dozer.jar                                                                  <=
lib/excecao.jar                                                                <=
lib/fontbox.jar                                                                <=
lib/framework.jar                                                              <=
lib/freemarker.jar                                                             <=
lib/gson.jar                                                                   <=
lib/guava.jar                                                                  <=
lib/hibernate-commons-annotations.jar                                          <=
lib/hibernate-core.jar                                                         <=
lib/hibernate-entitymanager.jar                                                <=
lib/hibernate-jpa-2.0-api.jar                                                  <=
lib/hibernate-jpamodelgen.jar                                                  <=
lib/hibernate-validator-annotation-processor.jar                               <=
lib/hibernate-validator.jar                                                    <=
lib/hibernate.jar                                                              <=
lib/hk2-api.jar                                                                <=
lib/hk2-locator.jar                                                            <=
lib/hk2-utils.jar                                                              <=
lib/httpclient.jar                                                             <=
lib/httpcore.jar                                                               <=
lib/informacoes-corporativas-rest.jar                                          <=
lib/itext-pdfa.jar                                                             <=
lib/itext-xtra.jar                                                             <=
lib/itext.jar                                                                  <=
lib/itextpdf.jar                                                               <=
lib/jackson-annotations.jar                                                    <=
lib/jackson-core-asl.jar                                                       <=
lib/jackson-core.jar                                                           <=
lib/jackson-databind.jar                                                       <=
lib/jackson-dataformat-xml.jar                                                 <=
lib/jackson-dataformat-yaml.jar                                                <=
lib/jackson-datatype-joda.jar                                                  <=
lib/jackson-mapper-asl.jar                                                     <=
lib/jackson-module-jaxb-annotations.jar                                        <=
lib/jai-imageio-core.jar                                                       <=
lib/jasperreports.jar                                                          <=
lib/javase.jar                                                                 <=
lib/javassist.jar                                                              <=
lib/javax.annotation-api.jar                                                   <=
lib/javax.inject.jar                                                           <=
lib/javax.ws.rs-api.jar                                                        <=
lib/jboss-logging.jar                                                          <=
lib/jboss-transaction-api_1.1_spec.jar                                         <=
lib/jcip-annotations.jar                                                       <=
lib/jcl-over-slf4j.jar                                                         <=
lib/jcommander.jar                                                             <=
lib/jcommon.jar                                                                <=
lib/jdtcore.jar                                                                <=
lib/jersey-client.jar                                                          <=
lib/jersey-common.jar                                                          <=
lib/jersey-core.jar                                                            <=
lib/jersey-guava.jar                                                           <=
lib/jersey-media-multipart.jar                                                 <=
lib/jfreechart.jar                                                             <=
lib/jjwt.jar                                                                   <=
lib/joda-time.jar                                                              <=
lib/json-smart.jar                                                             <=
lib/jsr311-api.jar                                                             <=
lib/mail.jar                                                                   <=
lib/mapstruct.jar                                                              <=
lib/mimepull.jar                                                               <=
lib/nimbus-jose-jwt.jar                                                        <=
lib/osgi-resource-locator.jar                                                  <=
lib/pdfbox.jar                                                                 <=
lib/pre-processador-calculo.jar                                                <=
lib/reflections.jar                                                            <=
lib/seguranca-sso.jar                                                          <=
lib/shrinkwrap-api.jar                                                         <=
lib/siccr-entities.jar                                                         <=
lib/sicdt-rest.jar                                                             <=
lib/sicli-rest.jar                                                             <=
lib/sigec-portabilidade-rest.jar                                               <=
lib/siiso.jar                                                                  <=
lib/simtr-rest.jar                                                             <=
lib/sipes-rest.jar                                                             <=
lib/sisgh-rest.jar                                                             <=
lib/slf4j-api.jar                                                              <=
lib/snakeyaml.jar                                                              <=
lib/srcc-rest.jar                                                              <=
lib/stax2-api.jar                                                              <=
lib/swagger-annotations.jar                                                    <=
lib/swagger-core.jar                                                           <=
lib/swagger-jaxrs.jar                                                          <=
lib/swagger-models.jar                                                         <=
lib/validation-api.jar                                                         <=
lib/woodstox-core.jar                                                          <=
lib/xml-apis.jar                                                               <=
lib/xmlworker.jar                                                              <=
META-INF/maven/br.gov.caixa.ccr/                                               <=
META-INF/maven/br.gov.caixa.ccr/sifec-ccr/                                     <=
META-INF/maven/br.gov.caixa.ccr/sifec-ccr/pom.xml                              <=
META-INF/maven/br.gov.caixa.ccr/sifec-ccr/pom.properties                       <=


PS C:\Users\p585600\Downloads>
