2026-11-16T15:29:39.5058633Z ##[section]Starting: Maven
2026-11-16T15:29:39.5062883Z ==============================================================================
2026-11-16T15:29:39.5062967Z Task         : Maven
2026-11-16T15:29:39.5063014Z Description  : Build, test, and deploy with Apache Maven
2026-11-16T15:29:39.5063085Z Version      : 4.225.0
2026-11-16T15:29:39.5063131Z Author       : Microsoft Corporation
2026-11-16T15:29:39.5063186Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-16T15:29:39.5063264Z ==============================================================================
2026-11-16T15:29:40.0633785Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-16T15:29:40.1616989Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-16T15:29:40.1617501Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-16T15:29:40.1617871Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-16T15:29:40.1618061Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-16T15:29:40.1618378Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-16T15:29:40.1693606Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/6/s/pom.xml clean package -Dversion.app= -DskipTests=true -U -Ponline
2026-11-16T15:29:40.7855701Z [INFO] Scanning for projects...
2026-11-16T15:29:40.8458462Z [WARNING] 
2026-11-16T15:29:40.8460523Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec-xml:jar:5.0.0-online-SNAPSHOT
2026-11-16T15:29:40.8460922Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/6/s/pom.xml, line 8, column 11
2026-11-16T15:29:40.8461434Z [WARNING] 
2026-11-16T15:29:40.8461699Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec:pom:5.0.0-online-SNAPSHOT
2026-11-16T15:29:40.8462219Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/6/s/pom.xml, line 8, column 11
2026-11-16T15:29:40.8462449Z [WARNING] 
2026-11-16T15:29:40.8462616Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-11-16T15:29:40.8462934Z [WARNING] 
2026-11-16T15:29:40.8463110Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-11-16T15:29:40.8463275Z [WARNING] 
2026-11-16T15:29:40.8490220Z [INFO] ------------------------------------------------------------------------
2026-11-16T15:29:40.8490422Z [INFO] Reactor Build Order:
2026-11-16T15:29:40.8490714Z [INFO] 
2026-11-16T15:29:40.8498723Z [INFO] SIGEC-PORTABILIDADE                                                [pom]
2026-11-16T15:29:40.8498994Z [INFO] GEC XML module                                                     [jar]
2026-11-16T15:29:40.8499745Z [INFO] GEC Azure module                                                   [jar]
2026-11-16T15:29:40.8499995Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas               [jar]
2026-11-16T15:29:40.8500168Z [INFO] GEC EJB module                                                     [ejb]
2026-11-16T15:29:40.8500323Z [INFO] GEC Web module                                                     [war]
2026-11-16T15:29:40.8500471Z [INFO] SIGEC PORTABILIDADE                                                [war]
2026-11-16T15:29:40.8501131Z [INFO] GEC EAR module                                                     [ear]
2026-11-16T15:29:40.8538742Z [INFO] 
2026-11-16T15:29:40.8539409Z [INFO] -----------------------< br.gov.caixa.sigec:gec >-----------------------
2026-11-16T15:29:40.8539761Z [INFO] Building SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT                 [1/8]
2026-11-16T15:29:40.8539985Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-16T15:29:40.8726614Z [INFO] 
2026-11-16T15:29:40.8727328Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec ---
2026-11-16T15:29:40.9085588Z [INFO] 
2026-11-16T15:29:40.9086126Z [INFO] ---------------------< br.gov.caixa.sigec:gec-xml >---------------------
2026-11-16T15:29:40.9086409Z [INFO] Building GEC XML module 5.0.0-online-SNAPSHOT                      [2/8]
2026-11-16T15:29:40.9086647Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T15:29:42.3340657Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/arqref/arqref-web/3.1.0.1/arqref-web-3.1.0.1.pom
2026-11-16T15:29:42.8348884Z [WARNING] The POM for br.gov.caixa.arqref:arqref-web:jar:3.1.0.1 is missing, no dependency information available
2026-11-16T15:29:42.8554452Z [INFO] 
2026-11-16T15:29:42.8555005Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-xml ---
2026-11-16T15:29:42.8574546Z [INFO] 
2026-11-16T15:29:42.8575388Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-xml ---
2026-11-16T15:29:42.9809120Z [INFO] Copying 524 resources from src/main/resources to target/classes
2026-11-16T15:29:43.0221404Z [INFO] 
2026-11-16T15:29:43.0221960Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-xml ---
2026-11-16T15:29:43.1504202Z [INFO] Recompiling the module because of changed source code.
2026-11-16T15:29:43.1605457Z [INFO] Compiling 2368 source files with javac [debug parameters release 17] to target/classes
2026-11-16T15:29:48.8676839Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T15:29:48.8677196Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T15:29:48.8677480Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T15:29:48.8677927Z    - with linked exception:
2026-11-16T15:29:48.8678105Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-16T15:29:48.8720638Z ##[warning] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(50,59): warning :  /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8728632Z ##[warning] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(51,53): warning :  /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8730838Z ##[warning] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(52,51): warning :  /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8733327Z ##[warning] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(75,60): warning :  /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8735469Z ##[warning] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(76,53): warning :  /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8737511Z ##[warning] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(77,51): warning :  /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8738432Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T15:29:48.8738960Z [WARNING] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8739356Z [WARNING] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8739752Z [WARNING] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8740141Z [WARNING] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8740526Z [WARNING] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8740905Z [WARNING] /opt/ads-agent/_work/6/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:29:48.8741185Z [INFO] 
2026-11-16T15:29:48.8741464Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-xml ---
2026-11-16T15:29:48.8741744Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-xml/src/test/resources
2026-11-16T15:29:48.8741967Z [INFO] 
2026-11-16T15:29:48.8742212Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-xml ---
2026-11-16T15:29:48.8758371Z [INFO] No sources to compile
2026-11-16T15:29:48.8758529Z [INFO] 
2026-11-16T15:29:48.8759025Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-xml ---
2026-11-16T15:29:48.9673296Z [INFO] Tests are skipped.
2026-11-16T15:29:48.9674117Z [INFO] 
2026-11-16T15:29:48.9674830Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-xml ---
2026-11-16T15:29:49.2621793Z [INFO] Building jar: /opt/ads-agent/_work/6/s/gec-xml/target/gec-xml-5.0.0-online-SNAPSHOT.jar
2026-11-16T15:29:49.6244437Z [INFO] 
2026-11-16T15:29:49.6244974Z [INFO] --------------------< br.gov.caixa.sigec:gec-azure >--------------------
2026-11-16T15:29:49.6245251Z [INFO] Building GEC Azure module 5.0.0-online-SNAPSHOT                    [3/8]
2026-11-16T15:29:49.6245499Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T15:29:51.8695213Z [INFO] 
2026-11-16T15:29:51.8695831Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-azure ---
2026-11-16T15:29:51.8702828Z [INFO] 
2026-11-16T15:29:51.8703139Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-azure ---
2026-11-16T15:29:51.8713865Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-azure/src/main/resources
2026-11-16T15:29:51.8714291Z [INFO] 
2026-11-16T15:29:51.8714652Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-azure ---
2026-11-16T15:29:51.8764247Z [INFO] Recompiling the module because of changed source code.
2026-11-16T15:29:51.8770910Z [INFO] Compiling 3 source files with javac [debug parameters release 17] to target/classes
2026-11-16T15:29:53.7591806Z [INFO] 
2026-11-16T15:29:53.7594102Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-azure ---
2026-11-16T15:29:53.7606218Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-azure/src/test/resources
2026-11-16T15:29:53.7606564Z [INFO] 
2026-11-16T15:29:53.7607392Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-azure ---
2026-11-16T15:29:53.7625830Z [INFO] No sources to compile
2026-11-16T15:29:53.7626060Z [INFO] 
2026-11-16T15:29:53.7626876Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-azure ---
2026-11-16T15:29:53.7645348Z [INFO] Tests are skipped.
2026-11-16T15:29:53.7645575Z [INFO] 
2026-11-16T15:29:53.7646296Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-azure ---
2026-11-16T15:29:53.7668374Z [INFO] Building jar: /opt/ads-agent/_work/6/s/gec-azure/target/gec-azure-5.0.0-online-SNAPSHOT.jar
2026-11-16T15:29:53.7686064Z [INFO] 
2026-11-16T15:29:53.7686493Z [INFO] -------------------< br.gov.caixa.sigec:gec-common >--------------------
2026-11-16T15:29:53.7687399Z [INFO] Building GEC Common module - DTOs e Interfaces Compartilhadas 5.0.0-online-SNAPSHOT [4/8]
2026-11-16T15:29:53.7688222Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T15:29:53.7747135Z [INFO] 
2026-11-16T15:29:53.7747495Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-common ---
2026-11-16T15:29:53.7751972Z [INFO] 
2026-11-16T15:29:53.7752419Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-common ---
2026-11-16T15:29:53.7760810Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-common/src/main/resources
2026-11-16T15:29:53.7761572Z [INFO] 
2026-11-16T15:29:53.7762360Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-common ---
2026-11-16T15:29:53.7787162Z [INFO] Recompiling the module because of changed source code.
2026-11-16T15:29:53.7790301Z [INFO] Compiling 4 source files with javac [debug parameters release 17] to target/classes
2026-11-16T15:29:54.2285309Z [INFO] 
2026-11-16T15:29:54.2286298Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-common ---
2026-11-16T15:29:54.2296301Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-common/src/test/resources
2026-11-16T15:29:54.2296957Z [INFO] 
2026-11-16T15:29:54.2297475Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-common ---
2026-11-16T15:29:54.2313561Z [INFO] No sources to compile
2026-11-16T15:29:54.2313799Z [INFO] 
2026-11-16T15:29:54.2314587Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-common ---
2026-11-16T15:29:54.2333938Z [INFO] Tests are skipped.
2026-11-16T15:29:54.2334144Z [INFO] 
2026-11-16T15:29:54.2335071Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-common ---
2026-11-16T15:29:54.2361792Z [INFO] Building jar: /opt/ads-agent/_work/6/s/gec-common/target/gec-common-5.0.0-online-SNAPSHOT.jar
2026-11-16T15:29:54.2389064Z [INFO] 
2026-11-16T15:29:54.2389521Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ejb >---------------------
2026-11-16T15:29:54.2389761Z [INFO] Building GEC EJB module 5.0.0-online-SNAPSHOT                      [5/8]
2026-11-16T15:29:54.2390021Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-11-16T15:30:03.2435484Z [INFO] 
2026-11-16T15:30:03.2436405Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ejb ---
2026-11-16T15:30:03.2444902Z [INFO] 
2026-11-16T15:30:03.2445791Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ejb ---
2026-11-16T15:30:03.2465954Z [INFO] Copying 11 resources from src/main/resources to target/classes
2026-11-16T15:30:03.3069200Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-16T15:30:03.3070316Z [INFO] 
2026-11-16T15:30:03.3073696Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-ejb ---
2026-11-16T15:30:03.3488826Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T15:30:03.3503099Z [INFO] Compiling 1571 source files with javac [debug parameters release 17] to target/classes
2026-11-16T15:30:18.3395109Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T15:30:18.3395544Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T15:30:18.3395824Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T15:30:18.3396026Z    - with linked exception:
2026-11-16T15:30:18.3396466Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T15:30:18.3396772Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T15:30:18.3397279Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-16T15:30:18.3397891Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:18.3398361Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-16T15:30:18.3398740Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-16T15:30:18.3399246Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:18.3399777Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3400144Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3400474Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-16T15:30:18.3400677Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T15:30:18.3401112Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T15:30:18.3401506Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T15:30:18.3401982Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3402363Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3402727Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3403098Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T15:30:18.3403465Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3403830Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3404283Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3404691Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3405084Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3405466Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3408701Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(555,29): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3411292Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(595,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3414016Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(624,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3416015Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(325,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3418056Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(341,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3420118Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java(580,59): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3422227Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(435,29): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3424224Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(474,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3426173Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(503,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3428151Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(309,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3430068Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(336,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3432220Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java(435,59): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3434191Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(422,29): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3436127Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(454,75): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3438088Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(472,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3440098Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(310,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3442128Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(337,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3444130Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java(455,59): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3446090Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(434,29): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3448041Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(473,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3450013Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(502,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3452064Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(317,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3454020Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(333,40): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3455959Z ##[warning] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java(571,59): warning :  /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3456669Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3457123Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3457528Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3457926Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3458313Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3458705Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3459183Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3459575Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3459959Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3460339Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3460719Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3461571Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3461976Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3462361Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3462749Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3463133Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3463519Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3463908Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3464292Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3464727Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3465111Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3465490Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3465868Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3466258Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3466645Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3467029Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3467407Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3467786Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3468162Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3468589Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3468972Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3469352Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3469732Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3470113Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3470499Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3470865Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3471308Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3471663Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-16T15:30:18.3472031Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T15:30:18.3472410Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3472793Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3473176Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3473558Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3473945Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3474335Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3474739Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3475147Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3475578Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-16T15:30:18.3475790Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T15:30:18.3476111Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-16T15:30:18.3476325Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T15:30:18.3476689Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3477119Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3477541Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3477956Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3478405Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3478819Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3479231Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:18.3479636Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3480041Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3480455Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3480871Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3481325Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3481736Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3482176Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3482574Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3482953Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3483345Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3483745Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3484135Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3485597Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3486129Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3486528Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3486937Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3487341Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3487747Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3488151Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3488558Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3488961Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3489364Z [WARNING] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T15:30:18.3489733Z [INFO] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Some input files use or override a deprecated API.
2026-11-16T15:30:18.3490149Z [INFO] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Recompile with -Xlint:deprecation for details.
2026-11-16T15:30:18.3490525Z [INFO] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-16T15:30:18.3490889Z [INFO] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Some input files use unchecked or unsafe operations.
2026-11-16T15:30:18.3491353Z [INFO] /opt/ads-agent/_work/6/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Recompile with -Xlint:unchecked for details.
2026-11-16T15:30:18.3491533Z [INFO] 
2026-11-16T15:30:18.3491755Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-ejb ---
2026-11-16T15:30:18.3492029Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-ejb/src/test/resources
2026-11-16T15:30:18.3492154Z [INFO] 
2026-11-16T15:30:18.3492375Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-ejb ---
2026-11-16T15:30:18.3492570Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T15:30:18.3492809Z [INFO] Compiling 7 source files with javac [debug parameters release 17] to target/test-classes
2026-11-16T15:30:21.7417275Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T15:30:21.7417564Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T15:30:21.7419109Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T15:30:21.7419561Z    - with linked exception:
2026-11-16T15:30:21.7419730Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T15:30:21.7420048Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T15:30:21.7420388Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.jboss.logging.processor.apt.LoggingToolsProcessor' less than -source '17'
2026-11-16T15:30:21.7420556Z [INFO] 
2026-11-16T15:30:21.7420787Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-ejb ---
2026-11-16T15:30:21.7469627Z [INFO] Tests are skipped.
2026-11-16T15:30:21.7469807Z [INFO] 
2026-11-16T15:30:21.7470129Z [INFO] --- maven-ejb-plugin:3.0.1:ejb (default-ejb) @ gec-ejb ---
2026-11-16T15:30:22.6321246Z [INFO] Building EJB gec-ejb-5.0.0-online-SNAPSHOT with EJB version 3.1
2026-11-16T15:30:22.7367260Z [INFO] Building jar: /opt/ads-agent/_work/6/s/gec-ejb/target/gec-ejb-5.0.0-online-SNAPSHOT.jar
2026-11-16T15:30:22.8433326Z [INFO] 
2026-11-16T15:30:22.8433842Z [INFO] ---------------------< br.gov.caixa.sigec:gec-web >---------------------
2026-11-16T15:30:22.8434128Z [INFO] Building GEC Web module 5.0.0-online-SNAPSHOT                      [6/8]
2026-11-16T15:30:22.8434365Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-16T15:30:23.6520548Z [INFO] 
2026-11-16T15:30:23.6521201Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-web ---
2026-11-16T15:30:23.6525753Z [INFO] 
2026-11-16T15:30:23.6526458Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (jacoco-prepare-agent) @ gec-web ---
2026-11-16T15:30:23.6763716Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/6/s/gec-web/target/jacoco.exec
2026-11-16T15:30:23.6763987Z [INFO] 
2026-11-16T15:30:23.6764236Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-web ---
2026-11-16T15:30:23.6776774Z [INFO] Copying 2 resources from src/main/resources to target/classes
2026-11-16T15:30:23.6833765Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-16T15:30:23.6834285Z [INFO] 
2026-11-16T15:30:23.6834988Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-web ---
2026-11-16T15:30:23.6886235Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T15:30:23.6890293Z [INFO] Compiling 124 source files with javac [debug parameters release 17] to target/classes
2026-11-16T15:30:26.2765800Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T15:30:26.2766116Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T15:30:26.2766405Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T15:30:26.2766612Z    - with linked exception:
2026-11-16T15:30:26.2766773Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-16T15:30:26.2767093Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T15:30:26.2770031Z ##[warning] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java(121,47): warning :  /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:26.2775231Z ##[warning] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(140,17): warning :  /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-16T15:30:26.2777345Z ##[warning] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(151,17): warning :  /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-16T15:30:26.2780805Z ##[warning] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(162,17): warning :  /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-16T15:30:26.2781685Z [WARNING] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:26.2782060Z [WARNING] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-16T15:30:26.2782411Z [WARNING] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-16T15:30:26.2782745Z [WARNING] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-16T15:30:26.2783083Z [INFO] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Some input files use or override a deprecated API.
2026-11-16T15:30:26.2783428Z [INFO] /opt/ads-agent/_work/6/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Recompile with -Xlint:deprecation for details.
2026-11-16T15:30:26.2783599Z [INFO] 
2026-11-16T15:30:26.2783810Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-web ---
2026-11-16T15:30:26.2790832Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-web/src/test/resources
2026-11-16T15:30:26.2791194Z [INFO] 
2026-11-16T15:30:26.2791422Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-web ---
2026-11-16T15:30:26.2820052Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T15:30:26.2821992Z [INFO] Compiling 1 source file with javac [debug parameters release 17] to target/test-classes
2026-11-16T15:30:26.4499662Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T15:30:26.4500004Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T15:30:26.4500280Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T15:30:26.4500505Z    - with linked exception:
2026-11-16T15:30:26.4500666Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-16T15:30:26.4500970Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T15:30:26.4501258Z [INFO] 
2026-11-16T15:30:26.4501534Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-web ---
2026-11-16T15:30:26.4724267Z [INFO] Using auto detected provider org.apache.maven.surefire.junit4.JUnit4Provider
2026-11-16T15:30:26.4836407Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit4/3.2.5/surefire-junit4-3.2.5.pom
2026-11-16T15:30:26.5226651Z Progress (1): 3.0 kB
2026-11-16T15:30:26.5226933Z                     
2026-11-16T15:30:26.5227435Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit4/3.2.5/surefire-junit4-3.2.5.pom (3.0 kB at 78 kB/s)
2026-11-16T15:30:26.5262701Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit4/3.2.5/common-junit4-3.2.5.pom
2026-11-16T15:30:26.5475616Z Progress (1): 3.1 kB
2026-11-16T15:30:26.5476162Z                     
2026-11-16T15:30:26.5476756Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit4/3.2.5/common-junit4-3.2.5.pom (3.1 kB at 149 kB/s)
2026-11-16T15:30:26.5502206Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit3/3.2.5/common-junit3-3.2.5.pom
2026-11-16T15:30:26.5679069Z Progress (1): 2.8 kB
2026-11-16T15:30:26.5679405Z                     
2026-11-16T15:30:26.5679897Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit3/3.2.5/common-junit3-3.2.5.pom (2.8 kB at 163 kB/s)
2026-11-16T15:30:26.5730730Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit4/3.2.5/surefire-junit4-3.2.5.jar
2026-11-16T15:30:26.5731420Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit4/3.2.5/common-junit4-3.2.5.jar
2026-11-16T15:30:26.5740250Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit3/3.2.5/common-junit3-3.2.5.jar
2026-11-16T15:30:26.5818696Z Progress (1): 4.1/26 kB
2026-11-16T15:30:26.5828863Z Progress (2): 4.1/26 kB | 4.1/12 kB
2026-11-16T15:30:26.5831857Z Progress (3): 4.1/26 kB | 4.1/12 kB | 4.1/18 kB
2026-11-16T15:30:26.5834648Z Progress (3): 4.1/26 kB | 8.2/12 kB | 4.1/18 kB
2026-11-16T15:30:26.5837507Z Progress (3): 8.2/26 kB | 8.2/12 kB | 4.1/18 kB
2026-11-16T15:30:26.5840218Z Progress (3): 8.2/26 kB | 12 kB | 4.1/18 kB    
2026-11-16T15:30:26.5842835Z Progress (3): 8.2/26 kB | 12 kB | 8.2/18 kB
2026-11-16T15:30:26.5845256Z Progress (3): 12/26 kB | 12 kB | 8.2/18 kB 
2026-11-16T15:30:26.5847764Z Progress (3): 12/26 kB | 12 kB | 12/18 kB 
2026-11-16T15:30:26.5850237Z Progress (3): 16/26 kB | 12 kB | 12/18 kB
2026-11-16T15:30:26.5852976Z Progress (3): 16/26 kB | 12 kB | 16/18 kB
2026-11-16T15:30:26.5855423Z Progress (3): 20/26 kB | 12 kB | 16/18 kB
2026-11-16T15:30:26.5857606Z Progress (3): 20/26 kB | 12 kB | 18 kB   
2026-11-16T15:30:26.5860904Z Progress (3): 25/26 kB | 12 kB | 18 kB
2026-11-16T15:30:26.5937552Z Progress (3): 26 kB | 12 kB | 18 kB   
2026-11-16T15:30:26.5937734Z                                    
2026-11-16T15:30:26.5938213Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit3/3.2.5/common-junit3-3.2.5.jar (12 kB at 567 kB/s)
2026-11-16T15:30:26.5948989Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit4/3.2.5/surefire-junit4-3.2.5.jar (18 kB at 810 kB/s)
2026-11-16T15:30:26.5952953Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-junit4/3.2.5/common-junit4-3.2.5.jar (26 kB at 1.1 MB/s)
2026-11-16T15:30:26.6057165Z [INFO] 
2026-11-16T15:30:26.6057554Z [INFO] -------------------------------------------------------
2026-11-16T15:30:26.6057699Z [INFO]  T E S T S
2026-11-16T15:30:26.6057891Z [INFO] -------------------------------------------------------
2026-11-16T15:30:26.9988374Z [INFO] Running br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-16T15:30:27.4053638Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-11-16T15:30:29.1038678Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.094 s -- in br.gov.caixa.sigec.rest.dev.ProcessadorDevRestTest
2026-11-16T15:30:29.1462635Z [INFO] 
2026-11-16T15:30:29.1463234Z [INFO] Results:
2026-11-16T15:30:29.1463433Z [INFO] 
2026-11-16T15:30:29.1463702Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
2026-11-16T15:30:29.1463928Z [INFO] 
2026-11-16T15:30:29.1490440Z [INFO] 
2026-11-16T15:30:29.1491798Z [INFO] --- jacoco-maven-plugin:0.8.12:report (jacoco-report) @ gec-web ---
2026-11-16T15:30:29.1532561Z [INFO] Loading execution data file /opt/ads-agent/_work/6/s/gec-web/target/jacoco.exec
2026-11-16T15:30:29.2886827Z [INFO] Analyzed bundle 'GEC Web module' with 123 classes
2026-11-16T15:30:29.5563353Z [INFO] 
2026-11-16T15:30:29.5564480Z [INFO] --- maven-war-plugin:3.4.0:war (default-war) @ gec-web ---
2026-11-16T15:30:30.0634376Z [INFO] Packaging webapp
2026-11-16T15:30:30.0641723Z [INFO] Assembling webapp [gec-web] in [/opt/ads-agent/_work/6/s/gec-web/target/gec-web-5.0.0-online-SNAPSHOT]
2026-11-16T15:30:30.0684901Z [INFO] Processing war project
2026-11-16T15:30:30.0685637Z [INFO] Copying webapp webResources [/opt/ads-agent/_work/6/s/gec-web/src/main/webapp] to [/opt/ads-agent/_work/6/s/gec-web/target/gec-web-5.0.0-online-SNAPSHOT]
2026-11-16T15:30:30.1036466Z [INFO] Copying webapp resources [/opt/ads-agent/_work/6/s/gec-web/src/main/webapp]
2026-11-16T15:30:30.9827554Z [INFO] Building war: /opt/ads-agent/_work/6/s/gec-web/target/gec-web-5.0.0-online-SNAPSHOT.war
2026-11-16T15:30:31.3839829Z [INFO] 
2026-11-16T15:30:31.3840399Z [INFO] ---------------------< br.gov.caixa.sigec:gec-api >---------------------
2026-11-16T15:30:31.3840667Z [INFO] Building SIGEC PORTABILIDADE 5.0.0-online-SNAPSHOT                 [7/8]
2026-11-16T15:30:31.3840907Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-16T15:30:31.9596805Z [INFO] 
2026-11-16T15:30:31.9597493Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-api ---
2026-11-16T15:30:31.9602810Z [INFO] 
2026-11-16T15:30:31.9603234Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-api ---
2026-11-16T15:30:31.9615639Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-16T15:30:31.9627244Z [INFO] Copying 36 resources from src/main/webapp to target/classes
2026-11-16T15:30:40.5841442Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-16T15:30:40.5842142Z [INFO] 
2026-11-16T15:30:40.5842392Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-api ---
2026-11-16T15:30:40.5908582Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T15:30:40.5915378Z [INFO] Compiling 133 source files with javac [debug parameters release 17] to target/classes
2026-11-16T15:30:42.5585703Z ##[warning] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV3.java(90,1): warning :  /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV3.java:[90,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:42.5588452Z ##[warning] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV2.java(85,1): warning :  /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV2.java:[85,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:42.5590760Z ##[warning] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PessoasFisicasCreditoConsignadoRestV3.java(45,1): warning :  /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PessoasFisicasCreditoConsignadoRestV3.java:[45,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:42.5591505Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5591684Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T15:30:42.5591845Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5592024Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5592452Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T15:30:42.5592686Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T15:30:42.5592960Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T15:30:42.5593155Z    - with linked exception:
2026-11-16T15:30:42.5593304Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T15:30:42.5593606Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T15:30:42.5594115Z [WARNING] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV3.java:[90,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:42.5594700Z [WARNING] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV2.java:[85,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:42.5595386Z [WARNING] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PessoasFisicasCreditoConsignadoRestV3.java:[45,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T15:30:42.5595672Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5595846Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T15:30:42.5596018Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5597940Z ##[warning] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java(404,63): warning :  /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[404,63] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:42.5599932Z ##[warning] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java(414,71): warning :  /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[414,71] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:42.5600400Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5600560Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5600727Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T15:30:42.5600938Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5601170Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5601341Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5601507Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T15:30:42.5601676Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5601850Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5602017Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5602182Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T15:30:42.5602349Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5602506Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T15:30:42.5602867Z [WARNING] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[404,63] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:42.5603272Z [WARNING] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[414,71] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T15:30:42.5603604Z [INFO] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/JaxRsActivator.java: Some input files use or override a deprecated API.
2026-11-16T15:30:42.5603933Z [INFO] /opt/ads-agent/_work/6/s/gec-api/src/main/java/br/gov/caixa/api/JaxRsActivator.java: Recompile with -Xlint:deprecation for details.
2026-11-16T15:30:42.5604098Z [INFO] 
2026-11-16T15:30:42.5604323Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-api ---
2026-11-16T15:30:42.5604585Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-api/src/test/resources
2026-11-16T15:30:42.5604723Z [INFO] 
2026-11-16T15:30:42.5604978Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-api ---
2026-11-16T15:30:42.5616561Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T15:30:42.5618703Z [INFO] Compiling 1 source file with javac [debug parameters release 17] to target/test-classes
2026-11-16T15:30:42.8832060Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T15:30:42.8832400Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T15:30:42.8832671Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T15:30:42.8832890Z    - with linked exception:
2026-11-16T15:30:42.8833062Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T15:30:42.8833374Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T15:30:42.8833554Z [INFO] 
2026-11-16T15:30:42.8833780Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-api ---
2026-11-16T15:30:42.8846506Z [INFO] Tests are skipped.
2026-11-16T15:30:42.8847007Z [INFO] 
2026-11-16T15:30:42.8854703Z [INFO] --- maven-war-plugin:3.4.0:war (default-war) @ gec-api ---
2026-11-16T15:30:42.8854869Z [INFO] Packaging webapp
2026-11-16T15:30:42.8855231Z [INFO] Assembling webapp [gec-api] in [/opt/ads-agent/_work/6/s/gec-api/target/gec-api]
2026-11-16T15:30:42.8859355Z [INFO] Processing war project
2026-11-16T15:30:42.8860041Z [INFO] Copying webapp resources [/opt/ads-agent/_work/6/s/gec-api/src/main/webapp]
2026-11-16T15:30:42.9916225Z [INFO] Building war: /opt/ads-agent/_work/6/s/gec-api/target/gec-api.war
2026-11-16T15:30:43.9803823Z [INFO] 
2026-11-16T15:30:43.9804417Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ear >---------------------
2026-11-16T15:30:43.9804666Z [INFO] Building GEC EAR module 5.0.0-online-SNAPSHOT                      [8/8]
2026-11-16T15:30:43.9804927Z [INFO] --------------------------------[ ear ]---------------------------------
2026-11-16T15:30:44.0806920Z [INFO] 
2026-11-16T15:30:44.0807498Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ear ---
2026-11-16T15:30:44.0811217Z [INFO] 
2026-11-16T15:30:44.3047995Z [INFO] --- maven-ear-plugin:3.3.0:generate-application-xml (default-generate-application-xml) @ gec-ear ---
2026-11-16T15:30:44.3048284Z [INFO] Generating application.xml
2026-11-16T15:30:44.3091632Z [INFO] 
2026-11-16T15:30:44.3091872Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ear ---
2026-11-16T15:30:44.3100396Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/6/s/gec-ear/src/main/resources
2026-11-16T15:30:44.3100966Z [INFO] 
2026-11-16T15:30:44.3101269Z [INFO] --- maven-ear-plugin:3.3.0:ear (default-ear) @ gec-ear ---
2026-11-16T15:30:44.3173791Z [INFO] Copying artifact [ejb:br.gov.caixa.sigec:gec-ejb:5.0.0-online-SNAPSHOT] to [gec-ejb.jar]
2026-11-16T15:30:44.3438877Z [INFO] Copying artifact [war:br.gov.caixa.sigec:gec-web:5.0.0-online-SNAPSHOT] to [gec-web.war]
2026-11-16T15:30:44.3501356Z [INFO] Copying artifact [war:br.gov.caixa.sigec:gec-api:5.0.0-online-SNAPSHOT] to [gec-api.war]
2026-11-16T15:30:44.3641226Z [INFO] Copying artifact [jar:br.gov.caixa.sigec:gec-azure:5.0.0-online-SNAPSHOT] to [lib/br.gov.caixa.sigec-gec-azure-5.0.0-online-SNAPSHOT.jar]
2026-11-16T15:30:44.3641796Z [INFO] Copying artifact [jar:br.gov.caixa.sigec:gec-common:5.0.0-online-SNAPSHOT] to [lib/br.gov.caixa.sigec-gec-common-5.0.0-online-SNAPSHOT.jar]
2026-11-16T15:30:44.3667074Z [INFO] Copying artifact [jar:br.gov.caixa.arqref:arqref-core:3.7.2.2] to [lib/br.gov.caixa.arqref-arqref-core-3.7.2.2.jar]
2026-11-16T15:30:44.3669125Z [INFO] Copying artifact [jar:net.sf.jasperreports:jasperreports:6.6.0] to [lib/net.sf.jasperreports-jasperreports-6.6.0.jar]
2026-11-16T15:30:44.3701245Z [INFO] Copying artifact [jar:com.github.librepdf:openpdf:1.3.43] to [lib/com.github.librepdf-openpdf-1.3.43.jar]
2026-11-16T15:30:44.3713864Z [INFO] Copying artifact [jar:org.apache.velocity:velocity-engine-core:2.3] to [lib/org.apache.velocity-velocity-engine-core-2.3.jar]
2026-11-16T15:30:44.3718420Z [INFO] Copying artifact [jar:org.apache.velocity:velocity-tools:2.0] to [lib/org.apache.velocity-velocity-tools-2.0.jar]
2026-11-16T15:30:44.3721841Z [INFO] Copying artifact [jar:commons-chain:commons-chain:1.1] to [lib/commons-chain-commons-chain-1.1.jar]
2026-11-16T15:30:44.3723433Z [INFO] Copying artifact [jar:commons-validator:commons-validator:1.3.1] to [lib/commons-validator-commons-validator-1.3.1.jar]
2026-11-16T15:30:44.3725151Z [INFO] Copying artifact [jar:oro:oro:2.0.8] to [lib/oro-oro-2.0.8.jar]
2026-11-16T15:30:44.3726346Z [INFO] Copying artifact [jar:sslext:sslext:1.2-0] to [lib/sslext-sslext-1.2-0.jar]
2026-11-16T15:30:44.3727514Z [INFO] Copying artifact [jar:org.apache.struts:struts-core:1.3.8] to [lib/org.apache.struts-struts-core-1.3.8.jar]
2026-11-16T15:30:44.3730722Z [INFO] Copying artifact [jar:antlr:antlr:2.7.2] to [lib/antlr-antlr-2.7.2.jar]
2026-11-16T15:30:44.3734715Z [INFO] Copying artifact [jar:org.apache.struts:struts-taglib:1.3.8] to [lib/org.apache.struts-struts-taglib-1.3.8.jar]
2026-11-16T15:30:44.3737517Z [INFO] Copying artifact [jar:org.apache.struts:struts-tiles:1.3.8] to [lib/org.apache.struts-struts-tiles-1.3.8.jar]
2026-11-16T15:30:44.3739714Z [INFO] Copying artifact [jar:org.apache.velocity:velocity:1.6.2] to [lib/org.apache.velocity-velocity-1.6.2.jar]
2026-11-16T15:30:44.3743570Z [INFO] Copying artifact [jar:commons-lang:commons-lang:2.4] to [lib/commons-lang-commons-lang-2.4.jar]
2026-11-16T15:30:44.3746710Z [INFO] Copying artifact [jar:io.jsonwebtoken:jjwt-api:0.11.1] to [lib/io.jsonwebtoken-jjwt-api-0.11.1.jar]
2026-11-16T15:30:44.3748252Z [INFO] Copying artifact [jar:io.jsonwebtoken:jjwt-impl:0.11.1] to [lib/io.jsonwebtoken-jjwt-impl-0.11.1.jar]
2026-11-16T15:30:44.3749521Z [INFO] Copying artifact [jar:io.jsonwebtoken:jjwt-jackson:0.11.1] to [lib/io.jsonwebtoken-jjwt-jackson-0.11.1.jar]
2026-11-16T15:30:44.3750650Z [INFO] Copying artifact [jar:com.auth0:java-jwt:4.4.0] to [lib/com.auth0-java-jwt-4.4.0.jar]
2026-11-16T15:30:44.3752943Z [INFO] Copying artifact [jar:com.fasterxml.jackson.core:jackson-annotations:2.15.4] to [lib/com.fasterxml.jackson.core-jackson-annotations-2.15.4.jar]
2026-11-16T15:30:44.3754390Z [INFO] Copying artifact [jar:com.fasterxml.jackson.core:jackson-core:2.15.4] to [lib/com.fasterxml.jackson.core-jackson-core-2.15.4.jar]
2026-11-16T15:30:44.3758863Z [INFO] Copying artifact [jar:com.fasterxml.jackson.core:jackson-databind:2.15.4] to [lib/com.fasterxml.jackson.core-jackson-databind-2.15.4.jar]
2026-11-16T15:30:44.3768902Z [INFO] Copying artifact [jar:com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.15.4] to [lib/com.fasterxml.jackson.dataformat-jackson-dataformat-yaml-2.15.4.jar]
2026-11-16T15:30:44.3770817Z [INFO] Copying artifact [jar:com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.15.4] to [lib/com.fasterxml.jackson.dataformat-jackson-dataformat-xml-2.15.4.jar]
2026-11-16T15:30:44.3772520Z [INFO] Copying artifact [jar:org.codehaus.woodstox:stax2-api:4.2.1] to [lib/org.codehaus.woodstox-stax2-api-4.2.1.jar]
2026-11-16T15:30:44.3775008Z [INFO] Copying artifact [jar:com.fasterxml.woodstox:woodstox-core:6.5.1] to [lib/com.fasterxml.woodstox-woodstox-core-6.5.1.jar]
2026-11-16T15:30:44.3784891Z [INFO] Copying artifact [jar:com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.15.4] to [lib/com.fasterxml.jackson.datatype-jackson-datatype-jsr310-2.15.4.jar]
2026-11-16T15:30:44.3787352Z [INFO] Copying artifact [jar:br.gov.caixa.sigec:gec-xml:5.0.0-online-SNAPSHOT] to [lib/br.gov.caixa.sigec-gec-xml-5.0.0-online-SNAPSHOT.jar]
2026-11-16T15:30:44.3879885Z [INFO] Copying artifact [jar:com.azure:azure-messaging-servicebus:7.15.0] to [lib/com.azure-azure-messaging-servicebus-7.15.0.jar]
2026-11-16T15:30:44.3906180Z [INFO] Copying artifact [jar:com.azure:azure-core:1.45.1] to [lib/com.azure-azure-core-1.45.1.jar]
2026-11-16T15:30:44.3932253Z [INFO] Copying artifact [jar:io.projectreactor:reactor-core:3.4.34] to [lib/io.projectreactor-reactor-core-3.4.34.jar]
2026-11-16T15:30:44.3988534Z [INFO] Copying artifact [jar:org.reactivestreams:reactive-streams:1.0.4] to [lib/org.reactivestreams-reactive-streams-1.0.4.jar]
2026-11-16T15:30:44.3990033Z [INFO] Copying artifact [jar:com.azure:azure-core-amqp:2.9.0] to [lib/com.azure-azure-core-amqp-2.9.0.jar]
2026-11-16T15:30:44.4007574Z [INFO] Copying artifact [jar:com.microsoft.azure:qpid-proton-j-extensions:1.2.4] to [lib/com.microsoft.azure-qpid-proton-j-extensions-1.2.4.jar]
2026-11-16T15:30:44.4017167Z [INFO] Copying artifact [jar:org.apache.qpid:proton-j:0.33.8] to [lib/org.apache.qpid-proton-j-0.33.8.jar]
2026-11-16T15:30:44.4044171Z [INFO] Copying artifact [jar:com.azure:azure-core-http-netty:1.13.11] to [lib/com.azure-azure-core-http-netty-1.13.11.jar]
2026-11-16T15:30:44.4055135Z [INFO] Copying artifact [jar:io.netty:netty-handler:4.1.101.Final] to [lib/io.netty-netty-handler-4.1.101.Final.jar]
2026-11-16T15:30:44.4085588Z [INFO] Copying artifact [jar:io.netty:netty-resolver:4.1.101.Final] to [lib/io.netty-netty-resolver-4.1.101.Final.jar]
2026-11-16T15:30:44.4094062Z [INFO] Copying artifact [jar:io.netty:netty-transport:4.1.101.Final] to [lib/io.netty-netty-transport-4.1.101.Final.jar]
2026-11-16T15:30:44.4114747Z [INFO] Copying artifact [jar:io.netty:netty-handler-proxy:4.1.101.Final] to [lib/io.netty-netty-handler-proxy-4.1.101.Final.jar]
2026-11-16T15:30:44.4122332Z [INFO] Copying artifact [jar:io.netty:netty-codec-socks:4.1.101.Final] to [lib/io.netty-netty-codec-socks-4.1.101.Final.jar]
2026-11-16T15:30:44.4131987Z [INFO] Copying artifact [jar:io.netty:netty-buffer:4.1.101.Final] to [lib/io.netty-netty-buffer-4.1.101.Final.jar]
2026-11-16T15:30:44.4145012Z [INFO] Copying artifact [jar:io.netty:netty-codec:4.1.101.Final] to [lib/io.netty-netty-codec-4.1.101.Final.jar]
2026-11-16T15:30:44.4166485Z [INFO] Copying artifact [jar:io.netty:netty-codec-http:4.1.101.Final] to [lib/io.netty-netty-codec-http-4.1.101.Final.jar]
2026-11-16T15:30:44.4190883Z [INFO] Copying artifact [jar:io.netty:netty-codec-http2:4.1.101.Final] to [lib/io.netty-netty-codec-http2-4.1.101.Final.jar]
2026-11-16T15:30:44.4211897Z [INFO] Copying artifact [jar:io.netty:netty-transport-native-unix-common:4.1.101.Final] to [lib/io.netty-netty-transport-native-unix-common-4.1.101.Final.jar]
2026-11-16T15:30:44.4220348Z [INFO] Copying artifact [jar:io.netty:netty-transport-native-epoll:linux-x86_64:4.1.101.Final] to [lib/io.netty-netty-transport-native-epoll-4.1.101.Final-linux-x86_64.jar]
2026-11-16T15:30:44.4224978Z [INFO] Copying artifact [jar:io.netty:netty-transport-classes-epoll:4.1.101.Final] to [lib/io.netty-netty-transport-classes-epoll-4.1.101.Final.jar]
2026-11-16T15:30:44.4234152Z [INFO] Copying artifact [jar:io.netty:netty-transport-native-kqueue:osx-x86_64:4.1.101.Final] to [lib/io.netty-netty-transport-native-kqueue-4.1.101.Final-osx-x86_64.jar]
2026-11-16T15:30:44.4240082Z [INFO] Copying artifact [jar:io.netty:netty-transport-classes-kqueue:4.1.101.Final] to [lib/io.netty-netty-transport-classes-kqueue-4.1.101.Final.jar]
2026-11-16T15:30:44.4249526Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final.jar]
2026-11-16T15:30:44.4250259Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-classes:2.0.62.Final] to [lib/io.netty-netty-tcnative-classes-2.0.62.Final.jar]
2026-11-16T15:30:44.4255668Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:linux-x86_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-linux-x86_64.jar]
2026-11-16T15:30:44.4293839Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:linux-aarch_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-linux-aarch_64.jar]
2026-11-16T15:30:44.4648342Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:osx-x86_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-osx-x86_64.jar]
2026-11-16T15:30:44.4683987Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:osx-aarch_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-osx-aarch_64.jar]
2026-11-16T15:30:44.4719045Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:windows-x86_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-windows-x86_64.jar]
2026-11-16T15:30:44.4754507Z [INFO] Copying artifact [jar:io.projectreactor.netty:reactor-netty-http:1.0.39] to [lib/io.projectreactor.netty-reactor-netty-http-1.0.39.jar]
2026-11-16T15:30:44.4774214Z [INFO] Copying artifact [jar:io.netty:netty-resolver-dns:4.1.101.Final] to [lib/io.netty-netty-resolver-dns-4.1.101.Final.jar]
2026-11-16T15:30:44.4831141Z [INFO] Copying artifact [jar:io.netty:netty-codec-dns:4.1.101.Final] to [lib/io.netty-netty-codec-dns-4.1.101.Final.jar]
2026-11-16T15:30:44.4845901Z [INFO] Copying artifact [jar:io.netty:netty-resolver-dns-native-macos:osx-x86_64:4.1.101.Final] to [lib/io.netty-netty-resolver-dns-native-macos-4.1.101.Final-osx-x86_64.jar]
2026-11-16T15:30:44.4847705Z [INFO] Copying artifact [jar:io.netty:netty-resolver-dns-classes-macos:4.1.101.Final] to [lib/io.netty-netty-resolver-dns-classes-macos-4.1.101.Final.jar]
2026-11-16T15:30:44.4849113Z [INFO] Copying artifact [jar:io.projectreactor.netty:reactor-netty-core:1.0.39] to [lib/io.projectreactor.netty-reactor-netty-core-1.0.39.jar]
2026-11-16T15:30:44.4873772Z [INFO] Copying artifact [jar:io.netty:netty-common:4.1.101.Final] to [lib/io.netty-netty-common-4.1.101.Final.jar]
2026-11-16T15:30:44.4899223Z [INFO] Copying artifact [jar:com.azure:azure-identity:1.13.3] to [lib/com.azure-azure-identity-1.13.3.jar]
2026-11-16T15:30:44.4912735Z [INFO] Copying artifact [jar:com.azure:azure-json:1.3.0] to [lib/com.azure-azure-json-1.3.0.jar]
2026-11-16T15:30:44.4929423Z [INFO] Copying artifact [jar:com.microsoft.azure:msal4j:1.17.1] to [lib/com.microsoft.azure-msal4j-1.17.1.jar]
2026-11-16T15:30:44.4950356Z [INFO] Copying artifact [jar:com.nimbusds:oauth2-oidc-sdk:11.18] to [lib/com.nimbusds-oauth2-oidc-sdk-11.18.jar]
2026-11-16T15:30:44.4981530Z [INFO] Copying artifact [jar:com.github.stephenc.jcip:jcip-annotations:1.0-1] to [lib/com.github.stephenc.jcip-jcip-annotations-1.0-1.jar]
2026-11-16T15:30:44.4982772Z [INFO] Copying artifact [jar:com.nimbusds:content-type:2.3] to [lib/com.nimbusds-content-type-2.3.jar]
2026-11-16T15:30:44.4983866Z [INFO] Copying artifact [jar:com.nimbusds:lang-tag:1.7] to [lib/com.nimbusds-lang-tag-1.7.jar]
2026-11-16T15:30:44.4989746Z [INFO] Copying artifact [jar:com.nimbusds:nimbus-jose-jwt:9.40] to [lib/com.nimbusds-nimbus-jose-jwt-9.40.jar]
2026-11-16T15:30:44.5019571Z [INFO] Copying artifact [jar:net.minidev:json-smart:2.5.0] to [lib/net.minidev-json-smart-2.5.0.jar]
2026-11-16T15:30:44.5022408Z [INFO] Copying artifact [jar:net.minidev:accessors-smart:2.5.0] to [lib/net.minidev-accessors-smart-2.5.0.jar]
2026-11-16T15:30:44.5023528Z [INFO] Copying artifact [jar:org.ow2.asm:asm:9.3] to [lib/org.ow2.asm-asm-9.3.jar]
2026-11-16T15:30:44.5032888Z [INFO] Copying artifact [jar:com.microsoft.azure:msal4j-persistence-extension:1.3.0] to [lib/com.microsoft.azure-msal4j-persistence-extension-1.3.0.jar]
2026-11-16T15:30:44.5040041Z [INFO] Copying artifact [jar:net.java.dev.jna:jna:5.13.0] to [lib/net.java.dev.jna-jna-5.13.0.jar]
2026-11-16T15:30:44.5089687Z [INFO] Copying artifact [jar:net.java.dev.jna:jna-platform:5.6.0] to [lib/net.java.dev.jna-jna-platform-5.6.0.jar]
2026-11-16T15:30:44.5154215Z [INFO] Copying artifact [jar:com.google.code.gson:gson:2.10.1] to [lib/com.google.code.gson-gson-2.10.1.jar]
2026-11-16T15:30:44.5162259Z [INFO] Copying artifact [jar:org.jboss.shrinkwrap:shrinkwrap-api:1.0.1] to [lib/org.jboss.shrinkwrap-shrinkwrap-api-1.0.1.jar]
2026-11-16T15:30:44.5163847Z [INFO] Copying artifact [jar:org.freemarker:freemarker:2.3.23] to [lib/org.freemarker-freemarker-2.3.23.jar]
2026-11-16T15:30:44.5173948Z [INFO] Copying artifact [jar:javax.mail:mail:1.4.7] to [lib/javax.mail-mail-1.4.7.jar]
2026-11-16T15:30:44.5178377Z [INFO] Copying artifact [jar:javax.activation:activation:1.1] to [lib/javax.activation-activation-1.1.jar]
2026-11-16T15:30:44.5180023Z [INFO] Copying artifact [jar:commons-beanutils:commons-beanutils:1.9.2] to [lib/commons-beanutils-commons-beanutils-1.9.2.jar]
2026-11-16T15:30:44.5187583Z [INFO] Copying artifact [jar:org.yaml:snakeyaml:2.2] to [lib/org.yaml-snakeyaml-2.2.jar]
2026-11-16T15:30:44.5190509Z [INFO] Copying artifact [jar:org.slf4j:slf4j-api:2.0.9] to [lib/org.slf4j-slf4j-api-2.0.9.jar]
2026-11-16T15:30:44.5191937Z [INFO] Copying artifact [jar:com.squareup.okhttp3:okhttp:4.10.0] to [lib/com.squareup.okhttp3-okhttp-4.10.0.jar]
2026-11-16T15:30:44.5198939Z [INFO] Copying artifact [jar:com.squareup.okio:okio-jvm:3.0.0] to [lib/com.squareup.okio-okio-jvm-3.0.0.jar]
2026-11-16T15:30:44.5200760Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31] to [lib/org.jetbrains.kotlin-kotlin-stdlib-jdk8-1.5.31.jar]
2026-11-16T15:30:44.5202103Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.31] to [lib/org.jetbrains.kotlin-kotlin-stdlib-jdk7-1.5.31.jar]
2026-11-16T15:30:44.5247556Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31] to [lib/org.jetbrains.kotlin-kotlin-stdlib-common-1.5.31.jar]
2026-11-16T15:30:44.5249841Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib:1.6.20] to [lib/org.jetbrains.kotlin-kotlin-stdlib-1.6.20.jar]
2026-11-16T15:30:44.5259461Z [INFO] Copying artifact [jar:org.jetbrains:annotations:13.0] to [lib/org.jetbrains-annotations-13.0.jar]
2026-11-16T15:30:44.5260621Z [INFO] Copying artifact [jar:commons-digester:commons-digester:2.1] to [lib/commons-digester-commons-digester-2.1.jar]
2026-11-16T15:30:44.5294632Z [INFO] Copying artifact [jar:commons-logging:commons-logging:1.1.1] to [lib/commons-logging-commons-logging-1.1.1.jar]
2026-11-16T15:30:44.5295381Z [INFO] Copying artifact [jar:org.jfree:jcommon:1.0.23] to [lib/org.jfree-jcommon-1.0.23.jar]
2026-11-16T15:30:44.5382155Z [INFO] Copying artifact [jar:com.ibm.icu:icu4j:57.1] to [lib/com.ibm.icu-icu4j-57.1.jar]
2026-11-16T15:30:44.5437485Z [INFO] Copy ear sources to /opt/ads-agent/_work/6/s/gec-ear/target/gec-ear-5.0.0-online-SNAPSHOT
2026-11-16T15:30:44.5496935Z [INFO] Building ear: /opt/ads-agent/_work/6/s/gec-ear/target/gec-ear-5.0.0-online-SNAPSHOT.ear
2026-11-16T15:30:45.5875194Z [INFO] ------------------------------------------------------------------------
2026-11-16T15:30:45.5875535Z [INFO] Reactor Summary for SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT:
2026-11-16T15:30:45.5875678Z [INFO] 
2026-11-16T15:30:45.5875885Z [INFO] SIGEC-PORTABILIDADE ................................ SUCCESS [  0.055 s]
2026-11-16T15:30:45.5876102Z [INFO] GEC XML module ..................................... SUCCESS [  8.715 s]
2026-11-16T15:30:45.5876253Z [INFO] GEC Azure module ................................... SUCCESS [  4.145 s]
2026-11-16T15:30:45.5876487Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas SUCCESS [  0.470 s]
2026-11-16T15:30:45.5876671Z [INFO] GEC EJB module ..................................... SUCCESS [ 28.604 s]
2026-11-16T15:30:45.5876830Z [INFO] GEC Web module ..................................... SUCCESS [  8.541 s]
2026-11-16T15:30:45.5876990Z [INFO] SIGEC PORTABILIDADE ................................ SUCCESS [ 12.596 s]
2026-11-16T15:30:45.5877151Z [INFO] GEC EAR module ..................................... SUCCESS [  1.607 s]
2026-11-16T15:30:45.5877375Z [INFO] ------------------------------------------------------------------------
2026-11-16T15:30:45.5877514Z [INFO] BUILD SUCCESS
2026-11-16T15:30:45.5877722Z [INFO] ------------------------------------------------------------------------
2026-11-16T15:30:45.5877890Z [INFO] Total time:  01:04 min
2026-11-16T15:30:45.5878069Z [INFO] Finished at: 2026-11-16T12:30:45-03:00
2026-11-16T15:30:45.5878300Z [INFO] ------------------------------------------------------------------------
2026-11-16T15:30:45.7188980Z ##[section]Finishing: Maven
