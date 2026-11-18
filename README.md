2026-11-18T13:46:27.1601382Z ##[section]Starting: Maven
2026-11-18T13:46:27.1612116Z ==============================================================================
2026-11-18T13:46:27.1612289Z Task         : Maven
2026-11-18T13:46:27.1612374Z Description  : Build, test, and deploy with Apache Maven
2026-11-18T13:46:27.1612527Z Version      : 4.225.0
2026-11-18T13:46:27.1612618Z Author       : Microsoft Corporation
2026-11-18T13:46:27.1612717Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-18T13:46:27.1612837Z ==============================================================================
2026-11-18T13:46:28.0673879Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-18T13:46:28.4430024Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-18T13:46:28.4431095Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-18T13:46:28.4431667Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-18T13:46:28.4431906Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-18T13:46:28.4432338Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-18T13:46:28.4544488Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/2/s/pom.xml clean package -Dversion.app= -DskipTests=true -U -Ponline
2026-11-18T13:46:29.2973730Z [INFO] Scanning for projects...
2026-11-18T13:46:29.3814883Z [WARNING] 
2026-11-18T13:46:29.3816363Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec-xml:jar:5.0.0-online-SNAPSHOT
2026-11-18T13:46:29.3816905Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/2/s/pom.xml, line 8, column 11
2026-11-18T13:46:29.3817225Z [WARNING] 
2026-11-18T13:46:29.3817720Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec:pom:5.0.0-online-SNAPSHOT
2026-11-18T13:46:29.3818101Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/2/s/pom.xml, line 8, column 11
2026-11-18T13:46:29.3818950Z [WARNING] 
2026-11-18T13:46:29.3819184Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-11-18T13:46:29.3819658Z [WARNING] 
2026-11-18T13:46:29.3820284Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-11-18T13:46:29.3820565Z [WARNING] 
2026-11-18T13:46:29.3866589Z [INFO] ------------------------------------------------------------------------
2026-11-18T13:46:29.3866990Z [INFO] Reactor Build Order:
2026-11-18T13:46:29.3867185Z [INFO] 
2026-11-18T13:46:29.3871539Z [INFO] SIGEC-PORTABILIDADE                                                [pom]
2026-11-18T13:46:29.3873573Z [INFO] GEC XML module                                                     [jar]
2026-11-18T13:46:29.3873705Z [INFO] GEC Azure module                                                   [jar]
2026-11-18T13:46:29.3873998Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas               [jar]
2026-11-18T13:46:29.3874323Z [INFO] GEC EJB module                                                     [ejb]
2026-11-18T13:46:29.3874479Z [INFO] GEC Web module                                                     [war]
2026-11-18T13:46:29.3874637Z [INFO] SIGEC PORTABILIDADE                                                [war]
2026-11-18T13:46:29.3874793Z [INFO] GEC EAR module                                                     [ear]
2026-11-18T13:46:29.3934427Z [INFO] 
2026-11-18T13:46:29.3935094Z [INFO] -----------------------< br.gov.caixa.sigec:gec >-----------------------
2026-11-18T13:46:29.3935391Z [INFO] Building SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT                 [1/8]
2026-11-18T13:46:29.3935633Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-18T13:46:29.4229263Z [INFO] 
2026-11-18T13:46:29.4230617Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec ---
2026-11-18T13:46:29.4808094Z [INFO] 
2026-11-18T13:46:29.4809143Z [INFO] ---------------------< br.gov.caixa.sigec:gec-xml >---------------------
2026-11-18T13:46:29.4809689Z [INFO] Building GEC XML module 5.0.0-online-SNAPSHOT                      [2/8]
2026-11-18T13:46:29.4809971Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-18T13:46:30.8030820Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/arqref/arqref-web/3.1.0.1/arqref-web-3.1.0.1.pom
2026-11-18T13:46:31.3325154Z [WARNING] The POM for br.gov.caixa.arqref:arqref-web:jar:3.1.0.1 is missing, no dependency information available
2026-11-18T13:46:31.3878791Z [INFO] 
2026-11-18T13:46:31.3879695Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-xml ---
2026-11-18T13:46:31.3880234Z [INFO] 
2026-11-18T13:46:31.3880486Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-xml ---
2026-11-18T13:46:31.5322627Z [INFO] Copying 524 resources from src/main/resources to target/classes
2026-11-18T13:46:31.9862081Z [INFO] 
2026-11-18T13:46:31.9863114Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-xml ---
2026-11-18T13:46:32.1890237Z [INFO] Recompiling the module because of changed source code.
2026-11-18T13:46:32.2024887Z [INFO] Compiling 2368 source files with javac [debug parameters release 17] to target/classes
2026-11-18T13:46:39.6622114Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-18T13:46:39.6671559Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-18T13:46:39.6671988Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-18T13:46:39.6672224Z    - with linked exception:
2026-11-18T13:46:39.6672482Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-18T13:46:39.6728584Z ##[warning] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(50,59): warning :  /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6740378Z ##[warning] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(51,53): warning :  /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6743190Z ##[warning] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(52,51): warning :  /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6745523Z ##[warning] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(75,60): warning :  /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6747732Z ##[warning] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(76,53): warning :  /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6750067Z ##[warning] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(77,51): warning :  /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6751076Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-18T13:46:39.6752151Z [WARNING] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6752715Z [WARNING] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6753302Z [WARNING] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6753984Z [WARNING] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6754556Z [WARNING] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6754953Z [WARNING] /opt/ads-agent/_work/2/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:46:39.6755156Z [INFO] 
2026-11-18T13:46:39.6755444Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-xml ---
2026-11-18T13:46:39.6755729Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/2/s/gec-xml/src/test/resources
2026-11-18T13:46:39.6755851Z [INFO] 
2026-11-18T13:46:39.6756181Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-xml ---
2026-11-18T13:46:39.6883722Z [INFO] No sources to compile
2026-11-18T13:46:39.6884846Z [INFO] 
2026-11-18T13:46:39.6885513Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-xml ---
2026-11-18T13:46:39.8912802Z [INFO] Tests are skipped.
2026-11-18T13:46:39.8913055Z [INFO] 
2026-11-18T13:46:39.8913754Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-xml ---
2026-11-18T13:46:40.2827372Z [INFO] Building jar: /opt/ads-agent/_work/2/s/gec-xml/target/gec-xml-5.0.0-online-SNAPSHOT.jar
2026-11-18T13:46:40.7369224Z [INFO] 
2026-11-18T13:46:40.7370359Z [INFO] --------------------< br.gov.caixa.sigec:gec-azure >--------------------
2026-11-18T13:46:40.7370649Z [INFO] Building GEC Azure module 5.0.0-online-SNAPSHOT                    [3/8]
2026-11-18T13:46:40.7370898Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-18T13:46:43.1676840Z [INFO] 
2026-11-18T13:46:43.1677902Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-azure ---
2026-11-18T13:46:43.1684081Z [INFO] 
2026-11-18T13:46:43.1684396Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-azure ---
2026-11-18T13:46:43.1697313Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/2/s/gec-azure/src/main/resources
2026-11-18T13:46:43.1697849Z [INFO] 
2026-11-18T13:46:43.1698347Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-azure ---
2026-11-18T13:46:43.1760764Z [INFO] Recompiling the module because of changed source code.
2026-11-18T13:46:43.1767743Z [INFO] Compiling 3 source files with javac [debug parameters release 17] to target/classes
2026-11-18T13:46:44.6308054Z [INFO] 
2026-11-18T13:46:44.6309022Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-azure ---
2026-11-18T13:46:44.6325222Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/2/s/gec-azure/src/test/resources
2026-11-18T13:46:44.6325445Z [INFO] 
2026-11-18T13:46:44.6325933Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-azure ---
2026-11-18T13:46:44.6349315Z [INFO] No sources to compile
2026-11-18T13:46:44.6349899Z [INFO] 
2026-11-18T13:46:44.6350642Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-azure ---
2026-11-18T13:46:44.6370140Z [INFO] Tests are skipped.
2026-11-18T13:46:44.6370586Z [INFO] 
2026-11-18T13:46:44.6371484Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-azure ---
2026-11-18T13:46:44.6396759Z [INFO] Building jar: /opt/ads-agent/_work/2/s/gec-azure/target/gec-azure-5.0.0-online-SNAPSHOT.jar
2026-11-18T13:46:44.6414344Z [INFO] 
2026-11-18T13:46:44.6414678Z [INFO] -------------------< br.gov.caixa.sigec:gec-common >--------------------
2026-11-18T13:46:44.6414969Z [INFO] Building GEC Common module - DTOs e Interfaces Compartilhadas 5.0.0-online-SNAPSHOT [4/8]
2026-11-18T13:46:44.6415200Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-18T13:46:44.6932528Z [INFO] 
2026-11-18T13:46:44.6933669Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-common ---
2026-11-18T13:46:44.6936959Z [INFO] 
2026-11-18T13:46:44.6937855Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-common ---
2026-11-18T13:46:44.6947273Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/2/s/gec-common/src/main/resources
2026-11-18T13:46:44.6947763Z [INFO] 
2026-11-18T13:46:44.6948156Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-common ---
2026-11-18T13:46:44.6978251Z [INFO] Recompiling the module because of changed source code.
2026-11-18T13:46:44.6983110Z [INFO] Compiling 4 source files with javac [debug parameters release 17] to target/classes
2026-11-18T13:46:45.2763396Z [INFO] 
2026-11-18T13:46:45.2764124Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-common ---
2026-11-18T13:46:45.2777219Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/2/s/gec-common/src/test/resources
2026-11-18T13:46:45.2777629Z [INFO] 
2026-11-18T13:46:45.2778731Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-common ---
2026-11-18T13:46:45.2798656Z [INFO] No sources to compile
2026-11-18T13:46:45.2799051Z [INFO] 
2026-11-18T13:46:45.2799457Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-common ---
2026-11-18T13:46:45.2819150Z [INFO] Tests are skipped.
2026-11-18T13:46:45.2819459Z [INFO] 
2026-11-18T13:46:45.2819871Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-common ---
2026-11-18T13:46:45.2849277Z [INFO] Building jar: /opt/ads-agent/_work/2/s/gec-common/target/gec-common-5.0.0-online-SNAPSHOT.jar
2026-11-18T13:46:45.2877574Z [INFO] 
2026-11-18T13:46:45.2878022Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ejb >---------------------
2026-11-18T13:46:45.2878314Z [INFO] Building GEC EJB module 5.0.0-online-SNAPSHOT                      [5/8]
2026-11-18T13:46:45.2878701Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-11-18T13:46:51.6601848Z [INFO] 
2026-11-18T13:46:51.6602725Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ejb ---
2026-11-18T13:46:51.6608001Z [INFO] 
2026-11-18T13:46:51.6608305Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ejb ---
2026-11-18T13:46:51.6634706Z [INFO] Copying 11 resources from src/main/resources to target/classes
2026-11-18T13:46:51.8201178Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-18T13:46:51.8203089Z [INFO] 
2026-11-18T13:46:51.8205336Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-ejb ---
2026-11-18T13:46:51.8646334Z [INFO] Recompiling the module because of changed dependency.
2026-11-18T13:46:51.8665631Z [INFO] Compiling 1571 source files with javac [debug parameters release 17] to target/classes
2026-11-18T13:47:08.4693359Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-18T13:47:08.4694028Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-18T13:47:08.4694497Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-18T13:47:08.4694816Z    - with linked exception:
2026-11-18T13:47:08.4697157Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-18T13:47:08.4753012Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java(30,59): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-18T13:47:08.4758057Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java(15,1): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-18T13:47:08.4762898Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(65,9): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-18T13:47:08.4770784Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(69,9): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-18T13:47:08.4773942Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java(12,1): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-18T13:47:08.4776377Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(45,31): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4778776Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(111,39): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4781441Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java(72,10): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-18T13:47:08.4783735Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1228,101): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.4785989Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1237,129): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.4788349Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1241,135): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4790886Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1245,143): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4793076Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1249,142): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4795417Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1253,129): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.4797829Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1546,24): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4800526Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1562,24): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4802813Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(729,62): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4805242Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(2957,81): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4809715Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(3152,77): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4812046Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(4057,39): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4815212Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(555,29): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4817623Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(595,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4820044Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(624,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4821128Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-18T13:47:08.4821612Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-18T13:47:08.4822247Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-18T13:47:08.4822760Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-18T13:47:08.4823177Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-18T13:47:08.4823724Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-18T13:47:08.4824183Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4824565Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4824877Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-18T13:47:08.4825105Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-18T13:47:08.4825467Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.4825864Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.4826372Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4826783Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4827181Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4827577Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.4827972Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4828413Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4828834Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4829266Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4829774Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4830327Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4830959Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4831521Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4831944Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4834513Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(325,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4837090Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(341,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4839662Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java(580,59): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4842040Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(435,29): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4844443Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(474,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4846768Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(503,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4849466Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(309,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4852102Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(336,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4854762Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java(435,59): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4857269Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(422,29): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4859748Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(454,75): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4863584Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(472,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4866746Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(310,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4869057Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(337,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4871606Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java(455,59): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4874499Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(434,29): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4878684Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(473,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4883266Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(502,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4887614Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(317,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4892060Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(333,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4896575Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java(571,59): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4899828Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(192,29): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4902280Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(231,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4904839Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(260,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4907463Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(325,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4910116Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(342,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4913170Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java(632,59): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4917308Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(417,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4921401Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(447,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4925453Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(442,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4929942Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(470,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4934705Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java(460,59): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4937574Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(8,49): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4939996Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(9,47): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4942246Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(10,49): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-18T13:47:08.4944498Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(11,51): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.4947028Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(457,29): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4949293Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(503,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4951760Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(550,40): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4954013Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java(362,48): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4956258Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java(445,24): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4958781Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java(513,24): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4961306Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(320,88): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4963852Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(545,58): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4966243Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(99,27): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-18T13:47:08.4968446Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(222,27): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-18T13:47:08.4971493Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java(89,58): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4973855Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(477,48): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4976449Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(521,48): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4978912Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(479,48): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4981264Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(517,48): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4983588Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(488,48): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4985937Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(526,48): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.4988184Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(39,37): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4990555Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(40,37): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4992934Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(113,66): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4995177Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(114,66): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4997452Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(147,71): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.4999915Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(149,41): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5002121Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(346,58): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5004337Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(347,58): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5006517Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(348,63): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5008713Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(350,33): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5011066Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(656,43): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5013554Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(657,43): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5015830Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(48,61): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5018109Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(61,66): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5020400Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(98,61): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5022668Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(134,61): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5024875Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(138,68): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5027255Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(143,43): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5029406Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(144,45): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5031720Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(145,51): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5033986Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java(710,55): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5036234Z ##[warning] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java(109,43): warning :  /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5037234Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5037694Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5038125Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5038535Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5038952Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5039354Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5039908Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5040308Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5040714Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5041119Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5041559Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5041960Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5042317Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5042741Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5043149Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5043611Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5044007Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5044407Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5044802Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5045223Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5045633Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5046070Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5046468Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5046865Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5047263Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5047665Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5048072Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5048476Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5048873Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5049291Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5049740Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5050149Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5050542Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5050960Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5051336Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-18T13:47:08.5051716Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-18T13:47:08.5052122Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5052586Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5052987Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5053387Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5053791Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5054260Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5054678Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5055115Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5055512Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-18T13:47:08.5055706Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-18T13:47:08.5056054Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-18T13:47:08.5056286Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-18T13:47:08.5056674Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5057114Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5057548Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5058066Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5058504Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5058935Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5059388Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:08.5059911Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5060340Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5060766Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5061210Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5061630Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5062063Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5062482Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5062914Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5063333Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5063755Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5064186Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5064600Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5065017Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5065493Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5065909Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5066343Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5066862Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5067356Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5067792Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5068210Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5068628Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5069050Z [WARNING] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-18T13:47:08.5069429Z [INFO] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Some input files use or override a deprecated API.
2026-11-18T13:47:08.5069898Z [INFO] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Recompile with -Xlint:deprecation for details.
2026-11-18T13:47:08.5070466Z [INFO] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-18T13:47:08.5070939Z [INFO] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Some input files use unchecked or unsafe operations.
2026-11-18T13:47:08.5071348Z [INFO] /opt/ads-agent/_work/2/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Recompile with -Xlint:unchecked for details.
2026-11-18T13:47:08.5071561Z [INFO] 
2026-11-18T13:47:08.5071815Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-ejb ---
2026-11-18T13:47:08.5072103Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/2/s/gec-ejb/src/test/resources
2026-11-18T13:47:08.5072272Z [INFO] 
2026-11-18T13:47:08.5072507Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-ejb ---
2026-11-18T13:47:08.5072736Z [INFO] Recompiling the module because of changed dependency.
2026-11-18T13:47:08.5073010Z [INFO] Compiling 7 source files with javac [debug parameters release 17] to target/test-classes
2026-11-18T13:47:10.4890347Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-18T13:47:10.4891069Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-18T13:47:10.4891448Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-18T13:47:10.4891757Z    - with linked exception:
2026-11-18T13:47:10.4891968Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-18T13:47:10.4892430Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-18T13:47:10.4892771Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.jboss.logging.processor.apt.LoggingToolsProcessor' less than -source '17'
2026-11-18T13:47:10.4892941Z [INFO] 
2026-11-18T13:47:10.4893176Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-ejb ---
2026-11-18T13:47:10.4915890Z [INFO] Tests are skipped.
2026-11-18T13:47:10.4916566Z [INFO] 
2026-11-18T13:47:10.4917175Z [INFO] --- maven-ejb-plugin:3.0.1:ejb (default-ejb) @ gec-ejb ---
2026-11-18T13:47:11.1247063Z [INFO] Building EJB gec-ejb-5.0.0-online-SNAPSHOT with EJB version 3.1
2026-11-18T13:47:11.2402600Z [INFO] Building jar: /opt/ads-agent/_work/2/s/gec-ejb/target/gec-ejb-5.0.0-online-SNAPSHOT.jar
2026-11-18T13:47:11.4123112Z [INFO] 
2026-11-18T13:47:11.4123771Z [INFO] ---------------------< br.gov.caixa.sigec:gec-web >---------------------
2026-11-18T13:47:11.4124034Z [INFO] Building GEC Web module 5.0.0-online-SNAPSHOT                      [6/8]
2026-11-18T13:47:11.4124259Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-18T13:47:11.7747830Z [INFO] 
2026-11-18T13:47:11.7748736Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-web ---
2026-11-18T13:47:11.7753360Z [INFO] 
2026-11-18T13:47:11.7754436Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (jacoco-prepare-agent) @ gec-web ---
2026-11-18T13:47:11.8146143Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/2/s/gec-web/target/jacoco.exec
2026-11-18T13:47:11.8146477Z [INFO] 
2026-11-18T13:47:11.8146734Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-web ---
2026-11-18T13:47:11.8159578Z [INFO] Copying 2 resources from src/main/resources to target/classes
2026-11-18T13:47:11.8239947Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-18T13:47:11.8240599Z [INFO] 
2026-11-18T13:47:11.8241004Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-web ---
2026-11-18T13:47:11.8291245Z [INFO] Recompiling the module because of changed dependency.
2026-11-18T13:47:11.8292235Z [INFO] Compiling 124 source files with javac [debug parameters release 17] to target/classes
2026-11-18T13:47:12.6711597Z [INFO] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Some input files use or override a deprecated API.
2026-11-18T13:47:12.6712266Z [INFO] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Recompile with -Xlint:deprecation for details.
2026-11-18T13:47:12.6712657Z [INFO] -------------------------------------------------------------
2026-11-18T13:47:12.6758340Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java(121,47): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:12.6762288Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(140,17): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-18T13:47:12.6765514Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(151,17): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-18T13:47:12.6767364Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(162,17): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-18T13:47:12.6770318Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(44,24): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[44,24] cannot access br.gov.caixa.sigec.rest.dev.ProcessadorDevRest
2026-11-18T13:47:12.6772654Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(32,8): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[32,8] class ProcessadorDevRestTest is public, should be declared in a file named ProcessadorDevRestTest.java
2026-11-18T13:47:12.6774589Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(3,24): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,24] package org.junit does not exist
2026-11-18T13:47:12.6776388Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(3,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,1] static import only from classes and interfaces
2026-11-18T13:47:12.6778162Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(4,24): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,24] package org.junit does not exist
2026-11-18T13:47:12.6780700Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(4,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,1] static import only from classes and interfaces
2026-11-18T13:47:12.6782583Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(5,24): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,24] package org.junit does not exist
2026-11-18T13:47:12.6784347Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(5,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,1] static import only from classes and interfaces
2026-11-18T13:47:12.6786112Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(6,26): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,26] package org.mockito does not exist
2026-11-18T13:47:12.6787883Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(6,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,1] static import only from classes and interfaces
2026-11-18T13:47:12.6790515Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(7,26): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,26] package org.mockito does not exist
2026-11-18T13:47:12.6792611Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(7,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,1] static import only from classes and interfaces
2026-11-18T13:47:12.6794392Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(8,26): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,26] package org.mockito does not exist
2026-11-18T13:47:12.6796535Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(8,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,1] static import only from classes and interfaces
2026-11-18T13:47:12.6798820Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(9,26): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,26] package org.mockito does not exist
2026-11-18T13:47:12.6800847Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(9,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,1] static import only from classes and interfaces
2026-11-18T13:47:12.6802680Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(10,26): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,26] package org.mockito does not exist
2026-11-18T13:47:12.6804495Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(10,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,1] static import only from classes and interfaces
2026-11-18T13:47:12.6806271Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(11,26): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,26] package org.mockito does not exist
2026-11-18T13:47:12.6808100Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(11,1): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,1] static import only from classes and interfaces
2026-11-18T13:47:12.6810579Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(19,17): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[19,17] package org.junit does not exist
2026-11-18T13:47:12.6812826Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(20,17): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[20,17] package org.junit does not exist
2026-11-18T13:47:12.6815013Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(21,19): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[21,19] package org.mockito does not exist
2026-11-18T13:47:12.6816887Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(22,19): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[22,19] package org.mockito does not exist
2026-11-18T13:47:12.6819123Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(34,10): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[34,10] cannot find symbol
2026-11-18T13:47:12.6821396Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(57,10): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[57,10] cannot find symbol
2026-11-18T13:47:12.6823394Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(68,10): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[68,10] cannot find symbol
2026-11-18T13:47:12.6825387Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(89,10): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[89,10] cannot find symbol
2026-11-18T13:47:12.6828106Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(110,10): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[110,10] cannot find symbol
2026-11-18T13:47:12.6830632Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(46,82): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[46,82] cannot find symbol
2026-11-18T13:47:12.6832462Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(47,17): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[47,17] cannot find symbol
2026-11-18T13:47:12.6834367Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(62,58): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[62,58] cannot find symbol
2026-11-18T13:47:12.6836607Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(65,17): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[65,17] cannot find symbol
2026-11-18T13:47:12.6838349Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(71,77): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[71,77] cannot find symbol
2026-11-18T13:47:12.6840449Z ##[warning] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(72,43): warning :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[72,43] cannot find symbol
2026-11-18T13:47:12.6840846Z [WARNING] COMPILATION WARNING : 
2026-11-18T13:47:12.6841340Z [INFO] -------------------------------------------------------------
2026-11-18T13:47:12.6841716Z [WARNING] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-18T13:47:12.6842219Z [WARNING] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-18T13:47:12.6842710Z [WARNING] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-18T13:47:12.6843202Z [WARNING] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-18T13:47:12.6843521Z [INFO] 4 warnings 
2026-11-18T13:47:12.6843725Z [INFO] -------------------------------------------------------------
2026-11-18T13:47:12.6843925Z [INFO] -------------------------------------------------------------
2026-11-18T13:47:12.6844063Z [ERROR] COMPILATION ERROR : 
2026-11-18T13:47:12.6844258Z [INFO] -------------------------------------------------------------
2026-11-18T13:47:12.6844568Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[44,24] cannot access br.gov.caixa.sigec.rest.dev.ProcessadorDevRest
2026-11-18T13:47:12.6844866Z   bad source file: /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java
2026-11-18T13:47:12.6845050Z     file does not contain class br.gov.caixa.sigec.rest.dev.ProcessadorDevRest
2026-11-18T13:47:12.6845374Z     Please remove or make sure it appears in the correct subdirectory of the sourcepath.
2026-11-18T13:47:12.6845850Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[32,8] class ProcessadorDevRestTest is public, should be declared in a file named ProcessadorDevRestTest.java
2026-11-18T13:47:12.6846195Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,24] package org.junit does not exist
2026-11-18T13:47:12.6846576Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,1] static import only from classes and interfaces
2026-11-18T13:47:12.6846907Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,24] package org.junit does not exist
2026-11-18T13:47:12.6847234Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,1] static import only from classes and interfaces
2026-11-18T13:47:12.6847544Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,24] package org.junit does not exist
2026-11-18T13:47:12.6847862Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,1] static import only from classes and interfaces
2026-11-18T13:47:12.6848176Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,26] package org.mockito does not exist
2026-11-18T13:47:12.6848489Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,1] static import only from classes and interfaces
2026-11-18T13:47:12.6848801Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,26] package org.mockito does not exist
2026-11-18T13:47:12.6849116Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,1] static import only from classes and interfaces
2026-11-18T13:47:12.6849426Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,26] package org.mockito does not exist
2026-11-18T13:47:12.6849877Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,1] static import only from classes and interfaces
2026-11-18T13:47:12.6850188Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,26] package org.mockito does not exist
2026-11-18T13:47:12.6850506Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,1] static import only from classes and interfaces
2026-11-18T13:47:12.6850818Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,26] package org.mockito does not exist
2026-11-18T13:47:12.6851139Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,1] static import only from classes and interfaces
2026-11-18T13:47:12.6851512Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,26] package org.mockito does not exist
2026-11-18T13:47:12.6851817Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,1] static import only from classes and interfaces
2026-11-18T13:47:12.6852134Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[19,17] package org.junit does not exist
2026-11-18T13:47:12.6852437Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[20,17] package org.junit does not exist
2026-11-18T13:47:12.6852741Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[21,19] package org.mockito does not exist
2026-11-18T13:47:12.6853092Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[22,19] package org.mockito does not exist
2026-11-18T13:47:12.6853396Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[34,10] cannot find symbol
2026-11-18T13:47:12.6853563Z   symbol:   class BeforeClass
2026-11-18T13:47:12.6853707Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6853976Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[57,10] cannot find symbol
2026-11-18T13:47:12.6854135Z   symbol:   class Test
2026-11-18T13:47:12.6854257Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6854517Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[68,10] cannot find symbol
2026-11-18T13:47:12.6854675Z   symbol:   class Test
2026-11-18T13:47:12.6854808Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6855067Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[89,10] cannot find symbol
2026-11-18T13:47:12.6855221Z   symbol:   class Test
2026-11-18T13:47:12.6855353Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6855622Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[110,10] cannot find symbol
2026-11-18T13:47:12.6855777Z   symbol:   class Test
2026-11-18T13:47:12.6855899Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6856160Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[46,82] cannot find symbol
2026-11-18T13:47:12.6856349Z   symbol:   method mock(java.lang.Class<javax.enterprise.inject.Instance>)
2026-11-18T13:47:12.6856506Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6856763Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[47,17] cannot find symbol
2026-11-18T13:47:12.6856954Z   symbol:   method when(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.6857119Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6857376Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[62,58] cannot find symbol
2026-11-18T13:47:12.6857650Z   symbol:   method assertThrows(java.lang.Class<java.lang.UnsupportedOperationException>,()->rest.e[...]vio"))
2026-11-18T13:47:12.6857809Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6858070Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[65,17] cannot find symbol
2026-11-18T13:47:12.6858234Z   symbol:   method assertTrue(boolean)
2026-11-18T13:47:12.6858415Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6858677Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[71,77] cannot find symbol
2026-11-18T13:47:12.6858841Z   symbol:   variable RETURNS_SELF
2026-11-18T13:47:12.6858979Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6859242Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[72,43] cannot find symbol
2026-11-18T13:47:12.6859406Z   symbol:   method mock(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.6859681Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6859947Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[73,17] cannot find symbol
2026-11-18T13:47:12.6860166Z   symbol:   method when(javax.ws.rs.core.Response)
2026-11-18T13:47:12.6860315Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6860576Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[75,22] cannot find symbol
2026-11-18T13:47:12.6860736Z   symbol:   class MockedStatic
2026-11-18T13:47:12.6860874Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6861131Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[75,56] cannot find symbol
2026-11-18T13:47:12.6861298Z   symbol:   method mockStatic(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.6861455Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6861714Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[80,25] cannot find symbol
2026-11-18T13:47:12.6861903Z   symbol:   method assertSame(javax.ws.rs.core.Response,javax.ws.rs.core.Response)
2026-11-18T13:47:12.6862069Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6862330Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[84,23] cannot find symbol
2026-11-18T13:47:12.6862493Z   symbol:   class ArgumentCaptor
2026-11-18T13:47:12.6862635Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6862877Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[84,54] cannot find symbol
2026-11-18T13:47:12.6863039Z   symbol:   variable ArgumentCaptor
2026-11-18T13:47:12.6863183Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6863442Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[85,17] cannot find symbol
2026-11-18T13:47:12.6863625Z   symbol:   method verify(javax.ws.rs.core.Response.ResponseBuilder)
2026-11-18T13:47:12.6863780Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6864039Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[91,66] cannot find symbol
2026-11-18T13:47:12.6864235Z   symbol:   method mock(java.lang.Class<br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR>)
2026-11-18T13:47:12.6864407Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6864649Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[93,77] cannot find symbol
2026-11-18T13:47:12.6864809Z   symbol:   variable RETURNS_SELF
2026-11-18T13:47:12.6864949Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6865209Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[94,43] cannot find symbol
2026-11-18T13:47:12.6865505Z   symbol:   method mock(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.6865728Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6865996Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[95,17] cannot find symbol
2026-11-18T13:47:12.6866169Z   symbol:   method when(javax.ws.rs.core.Response)
2026-11-18T13:47:12.6866318Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6866564Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[97,22] cannot find symbol
2026-11-18T13:47:12.6866725Z   symbol:   class MockedStatic
2026-11-18T13:47:12.6866865Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6867156Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[97,56] cannot find symbol
2026-11-18T13:47:12.6867340Z   symbol:   method mockStatic(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.6867495Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6867751Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[98,57] cannot find symbol
2026-11-18T13:47:12.6867909Z   symbol:   method any()
2026-11-18T13:47:12.6868028Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6868290Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[105,17] cannot find symbol
2026-11-18T13:47:12.6868481Z   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.6868651Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6868917Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[106,17] cannot find symbol
2026-11-18T13:47:12.6869112Z   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.6869273Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6869595Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[107,17] cannot find symbol
2026-11-18T13:47:12.6869798Z   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.6869967Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6870218Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[112,66] cannot find symbol
2026-11-18T13:47:12.6870415Z   symbol:   method mock(java.lang.Class<br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR>)
2026-11-18T13:47:12.6870588Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6870852Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[114,77] cannot find symbol
2026-11-18T13:47:12.6871012Z   symbol:   variable RETURNS_SELF
2026-11-18T13:47:12.6871150Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6871406Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[115,43] cannot find symbol
2026-11-18T13:47:12.6871587Z   symbol:   method mock(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.6871808Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6872173Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[116,17] cannot find symbol
2026-11-18T13:47:12.6872386Z   symbol:   method when(javax.ws.rs.core.Response)
2026-11-18T13:47:12.6872534Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6872859Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[118,22] cannot find symbol
2026-11-18T13:47:12.6873016Z   symbol:   class MockedStatic
2026-11-18T13:47:12.6873153Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6873413Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[118,56] cannot find symbol
2026-11-18T13:47:12.6873592Z   symbol:   method mockStatic(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.6873732Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6873988Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[119,57] cannot find symbol
2026-11-18T13:47:12.6874186Z   symbol:   method any()
2026-11-18T13:47:12.6874321Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6874581Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[124,17] cannot find symbol
2026-11-18T13:47:12.6874779Z   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.6874944Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6875203Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[124,47] cannot find symbol
2026-11-18T13:47:12.6875388Z   symbol:   method any(java.lang.Class<br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO>)
2026-11-18T13:47:12.6875536Z   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.6875661Z [INFO] 61 errors 
2026-11-18T13:47:12.6875851Z [INFO] -------------------------------------------------------------
2026-11-18T13:47:12.6876091Z [INFO] ------------------------------------------------------------------------
2026-11-18T13:47:12.6876422Z [INFO] Reactor Summary for SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT:
2026-11-18T13:47:12.6876599Z [INFO] 
2026-11-18T13:47:12.6876899Z [INFO] SIGEC-PORTABILIDADE ................................ SUCCESS [  0.087 s]
2026-11-18T13:47:12.6877123Z [INFO] GEC XML module ..................................... SUCCESS [ 11.256 s]
2026-11-18T13:47:12.6877382Z [INFO] GEC Azure module ................................... SUCCESS [  3.905 s]
2026-11-18T13:47:12.6877713Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas SUCCESS [  0.646 s]
2026-11-18T13:47:12.6877980Z [INFO] GEC EJB module ..................................... SUCCESS [ 26.124 s]
2026-11-18T13:47:12.6878225Z [INFO] GEC Web module ..................................... FAILURE [  1.260 s]
2026-11-18T13:47:12.6878495Z [INFO] SIGEC PORTABILIDADE ................................ SKIPPED
2026-11-18T13:47:12.6878759Z [INFO] GEC EAR module ..................................... SKIPPED
2026-11-18T13:47:12.6879122Z [INFO] ------------------------------------------------------------------------
2026-11-18T13:47:12.6879367Z [INFO] BUILD FAILURE
2026-11-18T13:47:12.6879812Z [INFO] ------------------------------------------------------------------------
2026-11-18T13:47:12.6880062Z [INFO] Total time:  43.396 s
2026-11-18T13:47:12.6880402Z [INFO] Finished at: 2026-11-18T10:47:12-03:00
2026-11-18T13:47:12.6880765Z [INFO] ------------------------------------------------------------------------
2026-11-18T13:47:12.6884925Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(44,24): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[44,24] cannot access br.gov.caixa.sigec.rest.dev.ProcessadorDevRest
2026-11-18T13:47:12.6888398Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(32,8): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[32,8] class ProcessadorDevRestTest is public, should be declared in a file named ProcessadorDevRestTest.java
2026-11-18T13:47:12.6891705Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(3,24): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,24] package org.junit does not exist
2026-11-18T13:47:12.6894786Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(3,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,1] static import only from classes and interfaces
2026-11-18T13:47:12.6897806Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(4,24): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,24] package org.junit does not exist
2026-11-18T13:47:12.6901027Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(4,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,1] static import only from classes and interfaces
2026-11-18T13:47:12.6904037Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(5,24): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,24] package org.junit does not exist
2026-11-18T13:47:12.6907084Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(5,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,1] static import only from classes and interfaces
2026-11-18T13:47:12.6910258Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(6,26): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,26] package org.mockito does not exist
2026-11-18T13:47:12.6913385Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(6,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,1] static import only from classes and interfaces
2026-11-18T13:47:12.6916404Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(7,26): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,26] package org.mockito does not exist
2026-11-18T13:47:12.6919587Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(7,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,1] static import only from classes and interfaces
2026-11-18T13:47:12.6922713Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(8,26): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,26] package org.mockito does not exist
2026-11-18T13:47:12.6925754Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(8,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,1] static import only from classes and interfaces
2026-11-18T13:47:12.6928779Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(9,26): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,26] package org.mockito does not exist
2026-11-18T13:47:12.6931933Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(9,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,1] static import only from classes and interfaces
2026-11-18T13:47:12.6935053Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(10,26): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,26] package org.mockito does not exist
2026-11-18T13:47:12.6938144Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(10,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,1] static import only from classes and interfaces
2026-11-18T13:47:12.6941753Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(11,26): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,26] package org.mockito does not exist
2026-11-18T13:47:12.6944903Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(11,1): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,1] static import only from classes and interfaces
2026-11-18T13:47:12.6948041Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(19,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[19,17] package org.junit does not exist
2026-11-18T13:47:12.6951178Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(20,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[20,17] package org.junit does not exist
2026-11-18T13:47:12.6954199Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(21,19): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[21,19] package org.mockito does not exist
2026-11-18T13:47:12.6956950Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(22,19): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[22,19] package org.mockito does not exist
2026-11-18T13:47:12.6960066Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(34,10): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[34,10] cannot find symbol
2026-11-18T13:47:12.6963113Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(57,10): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[57,10] cannot find symbol
2026-11-18T13:47:12.6966091Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(68,10): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[68,10] cannot find symbol
2026-11-18T13:47:12.6969068Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(89,10): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[89,10] cannot find symbol
2026-11-18T13:47:12.6972220Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(110,10): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[110,10] cannot find symbol
2026-11-18T13:47:12.6975226Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(46,82): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[46,82] cannot find symbol
2026-11-18T13:47:12.6978430Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(47,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[47,17] cannot find symbol
2026-11-18T13:47:12.6981548Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(62,58): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[62,58] cannot find symbol
2026-11-18T13:47:12.6984560Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(65,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[65,17] cannot find symbol
2026-11-18T13:47:12.6987661Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(71,77): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[71,77] cannot find symbol
2026-11-18T13:47:12.6990786Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(72,43): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[72,43] cannot find symbol
2026-11-18T13:47:12.6993763Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(73,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[73,17] cannot find symbol
2026-11-18T13:47:12.6996744Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(75,22): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[75,22] cannot find symbol
2026-11-18T13:47:12.6999780Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(75,56): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[75,56] cannot find symbol
2026-11-18T13:47:12.7001198Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project gec-web: Compilation failure: Compilation failure: 
2026-11-18T13:47:12.7001833Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[44,24] cannot access br.gov.caixa.sigec.rest.dev.ProcessadorDevRest
2026-11-18T13:47:12.7002348Z [ERROR]   bad source file: /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java
2026-11-18T13:47:12.7002662Z [ERROR]     file does not contain class br.gov.caixa.sigec.rest.dev.ProcessadorDevRest
2026-11-18T13:47:12.7002957Z [ERROR]     Please remove or make sure it appears in the correct subdirectory of the sourcepath.
2026-11-18T13:47:12.7003547Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[32,8] class ProcessadorDevRestTest is public, should be declared in a file named ProcessadorDevRestTest.java
2026-11-18T13:47:12.7004128Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,24] package org.junit does not exist
2026-11-18T13:47:12.7004674Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[3,1] static import only from classes and interfaces
2026-11-18T13:47:12.7005197Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,24] package org.junit does not exist
2026-11-18T13:47:12.7005736Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[4,1] static import only from classes and interfaces
2026-11-18T13:47:12.7006341Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,24] package org.junit does not exist
2026-11-18T13:47:12.7006950Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[5,1] static import only from classes and interfaces
2026-11-18T13:47:12.7007477Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,26] package org.mockito does not exist
2026-11-18T13:47:12.7008011Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[6,1] static import only from classes and interfaces
2026-11-18T13:47:12.7008606Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,26] package org.mockito does not exist
2026-11-18T13:47:12.7009130Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[7,1] static import only from classes and interfaces
2026-11-18T13:47:12.7009722Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,26] package org.mockito does not exist
2026-11-18T13:47:12.7010250Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[8,1] static import only from classes and interfaces
2026-11-18T13:47:12.7010772Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,26] package org.mockito does not exist
2026-11-18T13:47:12.7011304Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[9,1] static import only from classes and interfaces
2026-11-18T13:47:12.7011824Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,26] package org.mockito does not exist
2026-11-18T13:47:12.7012395Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[10,1] static import only from classes and interfaces
2026-11-18T13:47:12.7012929Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,26] package org.mockito does not exist
2026-11-18T13:47:12.7013466Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[11,1] static import only from classes and interfaces
2026-11-18T13:47:12.7013989Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[19,17] package org.junit does not exist
2026-11-18T13:47:12.7014496Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[20,17] package org.junit does not exist
2026-11-18T13:47:12.7015015Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[21,19] package org.mockito does not exist
2026-11-18T13:47:12.7015524Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[22,19] package org.mockito does not exist
2026-11-18T13:47:12.7016012Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[34,10] cannot find symbol
2026-11-18T13:47:12.7016294Z [ERROR]   symbol:   class BeforeClass
2026-11-18T13:47:12.7016538Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7016973Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[57,10] cannot find symbol
2026-11-18T13:47:12.7017247Z [ERROR]   symbol:   class Test
2026-11-18T13:47:12.7017489Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7026383Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[68,10] cannot find symbol
2026-11-18T13:47:12.7026669Z [ERROR]   symbol:   class Test
2026-11-18T13:47:12.7026906Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7027357Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[89,10] cannot find symbol
2026-11-18T13:47:12.7027629Z [ERROR]   symbol:   class Test
2026-11-18T13:47:12.7027849Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7028302Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[110,10] cannot find symbol
2026-11-18T13:47:12.7028574Z [ERROR]   symbol:   class Test
2026-11-18T13:47:12.7028943Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7029387Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[46,82] cannot find symbol
2026-11-18T13:47:12.7029732Z [ERROR]   symbol:   method mock(java.lang.Class<javax.enterprise.inject.Instance>)
2026-11-18T13:47:12.7029987Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7030339Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[47,17] cannot find symbol
2026-11-18T13:47:12.7030617Z [ERROR]   symbol:   method when(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.7030849Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7031207Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[62,58] cannot find symbol
2026-11-18T13:47:12.7031606Z [ERROR]   symbol:   method assertThrows(java.lang.Class<java.lang.UnsupportedOperationException>,()->rest.e[...]vio"))
2026-11-18T13:47:12.7031881Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7032284Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[65,17] cannot find symbol
2026-11-18T13:47:12.7032465Z [ERROR]   symbol:   method assertTrue(boolean)
2026-11-18T13:47:12.7032608Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7032869Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[71,77] cannot find symbol
2026-11-18T13:47:12.7033035Z [ERROR]   symbol:   variable RETURNS_SELF
2026-11-18T13:47:12.7033169Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7033428Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[72,43] cannot find symbol
2026-11-18T13:47:12.7033610Z [ERROR]   symbol:   method mock(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.7033773Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7034041Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[73,17] cannot find symbol
2026-11-18T13:47:12.7034208Z [ERROR]   symbol:   method when(javax.ws.rs.core.Response)
2026-11-18T13:47:12.7034355Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7034610Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[75,22] cannot find symbol
2026-11-18T13:47:12.7034771Z [ERROR]   symbol:   class MockedStatic
2026-11-18T13:47:12.7034900Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7035157Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[75,56] cannot find symbol
2026-11-18T13:47:12.7035460Z [ERROR]   symbol:   method mockStatic(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.7037755Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(80,25): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[80,25] cannot find symbol
2026-11-18T13:47:12.7039822Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(84,23): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[84,23] cannot find symbol
2026-11-18T13:47:12.7041836Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(84,54): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[84,54] cannot find symbol
2026-11-18T13:47:12.7043719Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(85,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[85,17] cannot find symbol
2026-11-18T13:47:12.7045455Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(91,66): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[91,66] cannot find symbol
2026-11-18T13:47:12.7047208Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(93,77): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[93,77] cannot find symbol
2026-11-18T13:47:12.7048957Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(94,43): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[94,43] cannot find symbol
2026-11-18T13:47:12.7196090Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(95,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[95,17] cannot find symbol
2026-11-18T13:47:12.7199715Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(97,22): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[97,22] cannot find symbol
2026-11-18T13:47:12.7202218Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(97,56): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[97,56] cannot find symbol
2026-11-18T13:47:12.7204587Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(98,57): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[98,57] cannot find symbol
2026-11-18T13:47:12.7206902Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(105,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[105,17] cannot find symbol
2026-11-18T13:47:12.7209226Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(106,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[106,17] cannot find symbol
2026-11-18T13:47:12.7211756Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(107,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[107,17] cannot find symbol
2026-11-18T13:47:12.7214246Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(112,66): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[112,66] cannot find symbol
2026-11-18T13:47:12.7216783Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(114,77): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[114,77] cannot find symbol
2026-11-18T13:47:12.7219172Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(115,43): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[115,43] cannot find symbol
2026-11-18T13:47:12.7221769Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(116,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[116,17] cannot find symbol
2026-11-18T13:47:12.7224234Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(118,22): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[118,22] cannot find symbol
2026-11-18T13:47:12.7226500Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(118,56): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[118,56] cannot find symbol
2026-11-18T13:47:12.7228945Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(119,57): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[119,57] cannot find symbol
2026-11-18T13:47:12.7231426Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(124,17): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[124,17] cannot find symbol
2026-11-18T13:47:12.7233909Z ##[error] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(124,47): error :  /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[124,47] cannot find symbol
2026-11-18T13:47:12.7234493Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7235187Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[80,25] cannot find symbol
2026-11-18T13:47:12.7235443Z [ERROR]   symbol:   method assertSame(javax.ws.rs.core.Response,javax.ws.rs.core.Response)
2026-11-18T13:47:12.7235668Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7236013Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[84,23] cannot find symbol
2026-11-18T13:47:12.7236234Z [ERROR]   symbol:   class ArgumentCaptor
2026-11-18T13:47:12.7236418Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7236768Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[84,54] cannot find symbol
2026-11-18T13:47:12.7236962Z [ERROR]   symbol:   variable ArgumentCaptor
2026-11-18T13:47:12.7237151Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7237483Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[85,17] cannot find symbol
2026-11-18T13:47:12.7237715Z [ERROR]   symbol:   method verify(javax.ws.rs.core.Response.ResponseBuilder)
2026-11-18T13:47:12.7237926Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7238271Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[91,66] cannot find symbol
2026-11-18T13:47:12.7238635Z [ERROR]   symbol:   method mock(java.lang.Class<br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR>)
2026-11-18T13:47:12.7238858Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7239193Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[93,77] cannot find symbol
2026-11-18T13:47:12.7239408Z [ERROR]   symbol:   variable RETURNS_SELF
2026-11-18T13:47:12.7239679Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7240017Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[94,43] cannot find symbol
2026-11-18T13:47:12.7240331Z [ERROR]   symbol:   method mock(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.7240529Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7240867Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[95,17] cannot find symbol
2026-11-18T13:47:12.7241089Z [ERROR]   symbol:   method when(javax.ws.rs.core.Response)
2026-11-18T13:47:12.7241280Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7241618Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[97,22] cannot find symbol
2026-11-18T13:47:12.7241812Z [ERROR]   symbol:   class MockedStatic
2026-11-18T13:47:12.7242025Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7242359Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[97,56] cannot find symbol
2026-11-18T13:47:12.7242732Z [ERROR]   symbol:   method mockStatic(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.7242957Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7243296Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[98,57] cannot find symbol
2026-11-18T13:47:12.7243506Z [ERROR]   symbol:   method any()
2026-11-18T13:47:12.7243705Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7244055Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[105,17] cannot find symbol
2026-11-18T13:47:12.7244288Z [ERROR]   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.7244506Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7244846Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[106,17] cannot find symbol
2026-11-18T13:47:12.7245092Z [ERROR]   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.7245318Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7245655Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[107,17] cannot find symbol
2026-11-18T13:47:12.7245915Z [ERROR]   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.7246141Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7246474Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[112,66] cannot find symbol
2026-11-18T13:47:12.7246744Z [ERROR]   symbol:   method mock(java.lang.Class<br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR>)
2026-11-18T13:47:12.7246949Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7247385Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[114,77] cannot find symbol
2026-11-18T13:47:12.7247590Z [ERROR]   symbol:   variable RETURNS_SELF
2026-11-18T13:47:12.7247774Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7248104Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[115,43] cannot find symbol
2026-11-18T13:47:12.7248332Z [ERROR]   symbol:   method mock(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.7248525Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7248842Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[116,17] cannot find symbol
2026-11-18T13:47:12.7249117Z [ERROR]   symbol:   method when(javax.ws.rs.core.Response)
2026-11-18T13:47:12.7249299Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7249718Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[118,22] cannot find symbol
2026-11-18T13:47:12.7249931Z [ERROR]   symbol:   class MockedStatic
2026-11-18T13:47:12.7250130Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7250464Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[118,56] cannot find symbol
2026-11-18T13:47:12.7250691Z [ERROR]   symbol:   method mockStatic(java.lang.Class<javax.ws.rs.core.Response>)
2026-11-18T13:47:12.7250882Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7251197Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[119,57] cannot find symbol
2026-11-18T13:47:12.7251406Z [ERROR]   symbol:   method any()
2026-11-18T13:47:12.7251563Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7251882Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[124,17] cannot find symbol
2026-11-18T13:47:12.7252151Z [ERROR]   symbol:   method verify(br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR)
2026-11-18T13:47:12.7252364Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7252689Z [ERROR] /opt/ads-agent/_work/2/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[124,47] cannot find symbol
2026-11-18T13:47:12.7252924Z [ERROR]   symbol:   method any(java.lang.Class<br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO>)
2026-11-18T13:47:12.7253139Z [ERROR]   location: class br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-18T13:47:12.7253342Z [ERROR] -> [Help 1]
2026-11-18T13:47:12.7253455Z [ERROR] 
2026-11-18T13:47:12.7253703Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-11-18T13:47:12.7253981Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-11-18T13:47:12.7254136Z [ERROR] 
2026-11-18T13:47:12.7254317Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-11-18T13:47:12.7254536Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-11-18T13:47:12.7254704Z [ERROR] 
2026-11-18T13:47:12.7254882Z [ERROR] After correcting the problems, you can resume the build with the command
2026-11-18T13:47:12.7255126Z [ERROR]   mvn <args> -rf :gec-web
2026-11-18T13:47:12.9045357Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-11-18T13:47:12.9045852Z Could not retrieve code analysis results - Maven run failed.
2026-11-18T13:47:12.9049049Z ##[error]Build failed.
2026-11-18T13:47:12.9218058Z ##[section]Finishing: Maven
