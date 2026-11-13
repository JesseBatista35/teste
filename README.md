2026-11-13T18:46:02.6490046Z ##[section]Starting: Maven
2026-11-13T18:46:02.6498436Z ==============================================================================
2026-11-13T18:46:02.6498608Z Task         : Maven
2026-11-13T18:46:02.6498680Z Description  : Build, test, and deploy with Apache Maven
2026-11-13T18:46:02.6498776Z Version      : 4.225.0
2026-11-13T18:46:02.6498910Z Author       : Microsoft Corporation
2026-11-13T18:46:02.6498993Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-13T18:46:02.6499106Z ==============================================================================
2026-11-13T18:46:03.3288229Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-13T18:46:03.4435081Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-13T18:46:03.4436360Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-13T18:46:03.4436752Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-13T18:46:03.4436942Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-13T18:46:03.4437445Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-13T18:46:03.4543948Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/50/s/pom.xml clean package -Dversion.app= -DskipTests=true -U -Ponline
2026-11-13T18:46:04.2019686Z [INFO] Scanning for projects...
2026-11-13T18:46:04.2725645Z [WARNING] 
2026-11-13T18:46:04.2727252Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec-xml:jar:5.0.0-online-SNAPSHOT
2026-11-13T18:46:04.2727859Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/50/s/pom.xml, line 8, column 11
2026-11-13T18:46:04.2728163Z [WARNING] 
2026-11-13T18:46:04.2728462Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec:pom:5.0.0-online-SNAPSHOT
2026-11-13T18:46:04.2728841Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/50/s/pom.xml, line 8, column 11
2026-11-13T18:46:04.2729075Z [WARNING] 
2026-11-13T18:46:04.2729254Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-11-13T18:46:04.2729384Z [WARNING] 
2026-11-13T18:46:04.2729776Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-11-13T18:46:04.2730056Z [WARNING] 
2026-11-13T18:46:04.2764055Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:46:04.2770653Z [INFO] Reactor Build Order:
2026-11-13T18:46:04.2770852Z [INFO] 
2026-11-13T18:46:04.2771099Z [INFO] SIGEC-PORTABILIDADE                                                [pom]
2026-11-13T18:46:04.2773091Z [INFO] GEC XML module                                                     [jar]
2026-11-13T18:46:04.2773805Z [INFO] GEC Azure module                                                   [jar]
2026-11-13T18:46:04.2774466Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas               [jar]
2026-11-13T18:46:04.2774653Z [INFO] GEC EJB module                                                     [ejb]
2026-11-13T18:46:04.2774958Z [INFO] GEC Web module                                                     [war]
2026-11-13T18:46:04.2775154Z [INFO] SIGEC PORTABILIDADE                                                [war]
2026-11-13T18:46:04.2775313Z [INFO] GEC EAR module                                                     [ear]
2026-11-13T18:46:04.2831992Z [INFO] 
2026-11-13T18:46:04.2833265Z [INFO] -----------------------< br.gov.caixa.sigec:gec >-----------------------
2026-11-13T18:46:04.2833596Z [INFO] Building SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT                 [1/8]
2026-11-13T18:46:04.2833807Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-13T18:46:04.3048307Z [INFO] 
2026-11-13T18:46:04.3051044Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec ---
2026-11-13T18:46:04.3492837Z [INFO] 
2026-11-13T18:46:04.3493840Z [INFO] ---------------------< br.gov.caixa.sigec:gec-xml >---------------------
2026-11-13T18:46:04.3494602Z [INFO] Building GEC XML module 5.0.0-online-SNAPSHOT                      [2/8]
2026-11-13T18:46:04.3494868Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:46:05.1168998Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/arqref/arqref-web/3.1.0.1/arqref-web-3.1.0.1.pom
2026-11-13T18:46:05.6425359Z [WARNING] The POM for br.gov.caixa.arqref:arqref-web:jar:3.1.0.1 is missing, no dependency information available
2026-11-13T18:46:05.6499611Z [INFO] 
2026-11-13T18:46:05.6500353Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-xml ---
2026-11-13T18:46:05.6517331Z [INFO] 
2026-11-13T18:46:05.6517805Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-xml ---
2026-11-13T18:46:05.7120178Z [INFO] Copying 524 resources from src/main/resources to target/classes
2026-11-13T18:46:05.7557941Z [INFO] 
2026-11-13T18:46:05.7558708Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-xml ---
2026-11-13T18:46:05.9631608Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:46:05.9764750Z [INFO] Compiling 2368 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:46:11.9350241Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:46:11.9350711Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:46:11.9351021Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:46:11.9462046Z    - with linked exception:
2026-11-13T18:46:11.9462599Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-13T18:46:11.9463670Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:46:11.9464246Z [WARNING] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9464787Z [WARNING] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9518388Z ##[warning] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(52,51): warning :  /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9532005Z ##[warning] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(75,60): warning :  /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9535469Z ##[warning] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(76,53): warning :  /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9539815Z ##[warning] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(77,51): warning :  /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9540999Z [WARNING] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9541721Z [WARNING] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9543163Z [WARNING] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9543731Z [WARNING] /opt/ads-agent/_work/50/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:11.9544041Z [INFO] 
2026-11-13T18:46:11.9544404Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-xml ---
2026-11-13T18:46:11.9544847Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/50/s/gec-xml/src/test/resources
2026-11-13T18:46:11.9545013Z [INFO] 
2026-11-13T18:46:11.9545362Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-xml ---
2026-11-13T18:46:11.9545625Z [INFO] No sources to compile
2026-11-13T18:46:11.9545835Z [INFO] 
2026-11-13T18:46:11.9546171Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-xml ---
2026-11-13T18:46:12.2527344Z [INFO] Tests are skipped.
2026-11-13T18:46:12.2527691Z [INFO] 
2026-11-13T18:46:12.2528271Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-xml ---
2026-11-13T18:46:12.6663484Z [INFO] Building jar: /opt/ads-agent/_work/50/s/gec-xml/target/gec-xml-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:46:13.1198119Z [INFO] 
2026-11-13T18:46:13.1198810Z [INFO] --------------------< br.gov.caixa.sigec:gec-azure >--------------------
2026-11-13T18:46:13.1199098Z [INFO] Building GEC Azure module 5.0.0-online-SNAPSHOT                    [3/8]
2026-11-13T18:46:13.1199351Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:46:14.3568677Z [INFO] 
2026-11-13T18:46:14.3569306Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-azure ---
2026-11-13T18:46:14.3575217Z [INFO] 
2026-11-13T18:46:14.3576126Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-azure ---
2026-11-13T18:46:14.3590218Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/50/s/gec-azure/src/main/resources
2026-11-13T18:46:14.3590615Z [INFO] 
2026-11-13T18:46:14.3592486Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-azure ---
2026-11-13T18:46:14.3640836Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:46:14.3644752Z [INFO] Compiling 3 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:46:14.8846565Z [INFO] 
2026-11-13T18:46:14.8847199Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-azure ---
2026-11-13T18:46:14.8867128Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/50/s/gec-azure/src/test/resources
2026-11-13T18:46:14.8867335Z [INFO] 
2026-11-13T18:46:14.8868432Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-azure ---
2026-11-13T18:46:14.8896166Z [INFO] No sources to compile
2026-11-13T18:46:14.8896342Z [INFO] 
2026-11-13T18:46:14.8896822Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-azure ---
2026-11-13T18:46:14.8916564Z [INFO] Tests are skipped.
2026-11-13T18:46:14.8917134Z [INFO] 
2026-11-13T18:46:14.8917662Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-azure ---
2026-11-13T18:46:14.8941158Z [INFO] Building jar: /opt/ads-agent/_work/50/s/gec-azure/target/gec-azure-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:46:14.8957073Z [INFO] 
2026-11-13T18:46:14.8957483Z [INFO] -------------------< br.gov.caixa.sigec:gec-common >--------------------
2026-11-13T18:46:14.8957743Z [INFO] Building GEC Common module - DTOs e Interfaces Compartilhadas 5.0.0-online-SNAPSHOT [4/8]
2026-11-13T18:46:14.8958233Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:46:14.9357071Z [INFO] 
2026-11-13T18:46:14.9357902Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-common ---
2026-11-13T18:46:14.9369333Z [INFO] 
2026-11-13T18:46:14.9369810Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-common ---
2026-11-13T18:46:14.9380161Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/50/s/gec-common/src/main/resources
2026-11-13T18:46:14.9380356Z [INFO] 
2026-11-13T18:46:14.9381975Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-common ---
2026-11-13T18:46:14.9415286Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:46:14.9417131Z [INFO] Compiling 4 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:46:15.4856215Z [INFO] 
2026-11-13T18:46:15.4857160Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-common ---
2026-11-13T18:46:15.4872707Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/50/s/gec-common/src/test/resources
2026-11-13T18:46:15.4873186Z [INFO] 
2026-11-13T18:46:15.4873604Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-common ---
2026-11-13T18:46:15.4902326Z [INFO] No sources to compile
2026-11-13T18:46:15.4902537Z [INFO] 
2026-11-13T18:46:15.4902977Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-common ---
2026-11-13T18:46:15.4935663Z [INFO] Tests are skipped.
2026-11-13T18:46:15.4936937Z [INFO] 
2026-11-13T18:46:15.4937487Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-common ---
2026-11-13T18:46:15.4989196Z [INFO] Building jar: /opt/ads-agent/_work/50/s/gec-common/target/gec-common-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:46:15.5026718Z [INFO] 
2026-11-13T18:46:15.5027464Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ejb >---------------------
2026-11-13T18:46:15.5027898Z [INFO] Building GEC EJB module 5.0.0-online-SNAPSHOT                      [5/8]
2026-11-13T18:46:15.5028241Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-11-13T18:46:18.7882628Z [INFO] 
2026-11-13T18:46:18.7883248Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ejb ---
2026-11-13T18:46:18.7889798Z [INFO] 
2026-11-13T18:46:18.7890908Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ejb ---
2026-11-13T18:46:18.7912458Z [INFO] Copying 11 resources from src/main/resources to target/classes
2026-11-13T18:46:18.8572907Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-13T18:46:18.8573798Z [INFO] 
2026-11-13T18:46:18.8574363Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-ejb ---
2026-11-13T18:46:18.9122584Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:46:18.9148887Z [INFO] Compiling 1571 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:46:33.5326146Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:46:33.5327090Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:46:33.5327387Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:46:33.5327627Z    - with linked exception:
2026-11-13T18:46:33.5327796Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-13T18:46:33.5328118Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:46:33.5328648Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-13T18:46:33.5329630Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:46:33.5333636Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java(12,1): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:46:33.5338499Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(65,9): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-13T18:46:33.5343150Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(69,9): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-13T18:46:33.5347397Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(45,31): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5350333Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(111,39): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5354281Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java(72,10): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-13T18:46:33.5358378Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1228,101): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5362198Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1237,129): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5366567Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1241,135): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5370984Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1245,143): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5374910Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1249,142): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5377646Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1253,129): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5380314Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1546,24): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5382590Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1562,24): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5385411Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(729,62): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5388905Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(2957,81): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5391797Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(3152,77): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5394326Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(4057,39): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5396555Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(555,29): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5399128Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(595,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5401937Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(624,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5404249Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(325,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5406656Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(341,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5409903Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java(580,59): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5412641Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(435,29): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5415011Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(474,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5417628Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(503,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5420314Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(309,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5421355Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:46:33.5421874Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-13T18:46:33.5422238Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-13T18:46:33.5422629Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5423008Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5423359Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-13T18:46:33.5423579Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:46:33.5423928Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5424364Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5424750Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5425629Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5426018Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5426405Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5426789Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5427172Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5427586Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5428042Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5428492Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5428899Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5429311Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5429853Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5430270Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5430675Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5431089Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5431518Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5432331Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5432738Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5433103Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5433561Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5435695Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(336,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5438626Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java(435,59): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5441374Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(422,29): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5444200Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(454,75): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5446389Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(472,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5449098Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(310,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5451656Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(337,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5453885Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java(455,59): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5456414Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(434,29): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5459236Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(473,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5461927Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(502,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5465466Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(317,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5467083Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5467813Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5468582Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5469281Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5470177Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5470748Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5471345Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5472004Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5472624Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5473078Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5473681Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5474693Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5478935Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(333,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5483877Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java(571,59): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5484912Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5485382Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5488430Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(192,29): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5492035Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(231,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5495966Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(260,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5500107Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(325,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5501322Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5502002Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5502639Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5503262Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5506900Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(342,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5510644Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java(632,59): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5514548Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(417,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5518747Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(447,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5522853Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(442,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5526194Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(470,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5529912Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java(460,59): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5534380Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(8,49): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5537946Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(9,47): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5541681Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(10,49): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-13T18:46:33.5545760Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(11,51): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5549691Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(457,29): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5553046Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(503,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5556913Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(550,40): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5559972Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java(362,48): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5562830Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java(445,24): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5563748Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5564188Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5564607Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5565156Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5565565Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5566027Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5566619Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5567143Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5567524Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5567894Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-13T18:46:33.5568296Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:46:33.5568724Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5569668Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5570089Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5570498Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5570906Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5573143Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java(513,24): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5576237Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(320,88): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5578634Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(545,58): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5581331Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(99,27): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-13T18:46:33.5583760Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(222,27): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-13T18:46:33.5586836Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java(89,58): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5590958Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(477,48): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5593279Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(521,48): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5595839Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(479,48): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5598287Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(517,48): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5600972Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(488,48): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5603314Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(526,48): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5605835Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(39,37): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5608674Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(40,37): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5611397Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(113,66): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5613574Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(114,66): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5615878Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(147,71): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5618244Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(149,41): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5620934Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(346,58): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5623309Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(347,58): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5625944Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(348,63): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5628367Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(350,33): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5630998Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(656,43): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5633309Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(657,43): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5635681Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(48,61): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5637880Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(61,66): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5641396Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(98,61): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5644213Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(134,61): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5646498Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(138,68): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5648916Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(143,43): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5652402Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(144,45): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5654810Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(145,51): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5657167Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java(710,55): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5659697Z ##[warning] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java(109,43): warning :  /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5660595Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5661072Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5661502Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5661911Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-13T18:46:33.5662194Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:46:33.5662524Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-13T18:46:33.5662762Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:46:33.5663640Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5664086Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5664542Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5665055Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5665512Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5665952Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5666379Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:46:33.5666812Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5667236Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5667734Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5668165Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5668583Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5669015Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5669432Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5670184Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5671079Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5671496Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5671912Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5672325Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5672740Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5673181Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5673595Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5674026Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5674452Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5674957Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5675377Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5675843Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5676230Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5676651Z [WARNING] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:46:33.5677040Z [INFO] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Some input files use or override a deprecated API.
2026-11-13T18:46:33.5677438Z [INFO] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Recompile with -Xlint:deprecation for details.
2026-11-13T18:46:33.5677828Z [INFO] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-13T18:46:33.5678473Z [INFO] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Some input files use unchecked or unsafe operations.
2026-11-13T18:46:33.5678839Z [INFO] /opt/ads-agent/_work/50/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Recompile with -Xlint:unchecked for details.
2026-11-13T18:46:33.5679029Z [INFO] 
2026-11-13T18:46:33.5679269Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-ejb ---
2026-11-13T18:46:33.5679622Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/50/s/gec-ejb/src/test/resources
2026-11-13T18:46:33.5679806Z [INFO] 
2026-11-13T18:46:33.5680048Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-ejb ---
2026-11-13T18:46:33.5680242Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:46:33.5680462Z [INFO] Compiling 7 source files with javac [debug parameters release 17] to target/test-classes
2026-11-13T18:46:34.0890630Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:46:34.0891365Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:46:34.0891661Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:46:34.0906759Z    - with linked exception:
2026-11-13T18:46:34.0906998Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-13T18:46:34.0907360Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:46:34.0907715Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.jboss.logging.processor.apt.LoggingToolsProcessor' less than -source '17'
2026-11-13T18:46:34.0908385Z [INFO] 
2026-11-13T18:46:34.0908697Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-ejb ---
2026-11-13T18:46:34.0910629Z [INFO] Tests are skipped.
2026-11-13T18:46:34.0911488Z [INFO] 
2026-11-13T18:46:34.0912455Z [INFO] --- maven-ejb-plugin:3.0.1:ejb (default-ejb) @ gec-ejb ---
2026-11-13T18:46:34.2643292Z [INFO] Building EJB gec-ejb-5.0.0-online-SNAPSHOT with EJB version 3.1
2026-11-13T18:46:34.4244738Z [INFO] Building jar: /opt/ads-agent/_work/50/s/gec-ejb/target/gec-ejb-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:46:34.5323878Z [INFO] 
2026-11-13T18:46:34.5324575Z [INFO] ---------------------< br.gov.caixa.sigec:gec-web >---------------------
2026-11-13T18:46:34.5325105Z [INFO] Building GEC Web module 5.0.0-online-SNAPSHOT                      [6/8]
2026-11-13T18:46:34.5325436Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-13T18:46:34.5607161Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/servlet/servlet-api/4.0.1/servlet-api-4.0.1.pom
2026-11-13T18:46:35.1163034Z [WARNING] The POM for javax.servlet:servlet-api:jar:4.0.1 is missing, no dependency information available
2026-11-13T18:46:35.3494128Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/servlet/servlet-api/4.0.1/servlet-api-4.0.1.jar
2026-11-13T18:46:35.7414718Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:46:35.7419418Z [INFO] Reactor Summary for SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT:
2026-11-13T18:46:35.7419854Z [INFO] 
2026-11-13T18:46:35.7420140Z [INFO] SIGEC-PORTABILIDADE ................................ SUCCESS [  0.066 s]
2026-11-13T18:46:35.7420364Z [INFO] GEC XML module ..................................... SUCCESS [  8.771 s]
2026-11-13T18:46:35.7420557Z [INFO] GEC Azure module ................................... SUCCESS [  1.776 s]
2026-11-13T18:46:35.7420769Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas SUCCESS [  0.607 s]
2026-11-13T18:46:35.7421235Z [INFO] GEC EJB module ..................................... SUCCESS [ 19.029 s]
2026-11-13T18:46:35.7421429Z [INFO] GEC Web module ..................................... FAILURE [  1.209 s]
2026-11-13T18:46:35.7421677Z [INFO] SIGEC PORTABILIDADE ................................ SKIPPED
2026-11-13T18:46:35.7421867Z [INFO] GEC EAR module ..................................... SKIPPED
2026-11-13T18:46:35.7422108Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:46:35.7422272Z [INFO] BUILD FAILURE
2026-11-13T18:46:35.7422496Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:46:35.7422631Z [INFO] Total time:  31.555 s
2026-11-13T18:46:35.7428029Z [INFO] Finished at: 2026-11-13T15:46:35-03:00
2026-11-13T18:46:35.7428894Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:46:35.7429433Z [ERROR] Failed to execute goal on project gec-web: Could not resolve dependencies for project br.gov.caixa.sigec:gec-web:war:5.0.0-online-SNAPSHOT: Could not find artifact javax.servlet:servlet-api:jar:4.0.1 in Nexus Caixa (http://binario.caixa:8081/repository/caixa-group-br) -> [Help 1]
2026-11-13T18:46:35.7429911Z [ERROR] 
2026-11-13T18:46:35.7430171Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-11-13T18:46:35.7430427Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-11-13T18:46:35.7430573Z [ERROR] 
2026-11-13T18:46:35.7430741Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-11-13T18:46:35.7430952Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException
2026-11-13T18:46:35.7431080Z [ERROR] 
2026-11-13T18:46:35.7431260Z [ERROR] After correcting the problems, you can resume the build with the command
2026-11-13T18:46:35.7431494Z [ERROR]   mvn <args> -rf :gec-web
2026-11-13T18:46:35.9687136Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-11-13T18:46:35.9687583Z Could not retrieve code analysis results - Maven run failed.
2026-11-13T18:46:35.9689830Z ##[error]Build failed.
2026-11-13T18:46:35.9816838Z ##[section]Finishing: Maven
