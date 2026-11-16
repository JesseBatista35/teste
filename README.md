2026-11-16T13:14:42.9527683Z ##[section]Starting: Maven
2026-11-16T13:14:42.9535046Z ==============================================================================
2026-11-16T13:14:42.9535137Z Task         : Maven
2026-11-16T13:14:42.9535187Z Description  : Build, test, and deploy with Apache Maven
2026-11-16T13:14:42.9535310Z Version      : 4.225.0
2026-11-16T13:14:42.9535354Z Author       : Microsoft Corporation
2026-11-16T13:14:42.9535675Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-16T13:14:42.9535749Z ==============================================================================
2026-11-16T13:14:43.6266103Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-16T13:14:43.8741076Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-16T13:14:43.8741736Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-16T13:14:43.8741967Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-16T13:14:43.8742209Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-16T13:14:43.8743010Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-16T13:14:43.8957162Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/9/s/pom.xml clean package -Dversion.app= -DskipTests=true -U -Ponline
2026-11-16T13:14:44.6847032Z [INFO] Scanning for projects...
2026-11-16T13:14:44.7645525Z [WARNING] 
2026-11-16T13:14:44.7648455Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec-xml:jar:5.0.0-online-SNAPSHOT
2026-11-16T13:14:44.7648873Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/9/s/pom.xml, line 8, column 11
2026-11-16T13:14:44.7649106Z [WARNING] 
2026-11-16T13:14:44.7649405Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec:pom:5.0.0-online-SNAPSHOT
2026-11-16T13:14:44.7649795Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/9/s/pom.xml, line 8, column 11
2026-11-16T13:14:44.7650143Z [WARNING] 
2026-11-16T13:14:44.7650344Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-11-16T13:14:44.7650872Z [WARNING] 
2026-11-16T13:14:44.7651094Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-11-16T13:14:44.7651272Z [WARNING] 
2026-11-16T13:14:44.7693961Z [INFO] ------------------------------------------------------------------------
2026-11-16T13:14:44.7694284Z [INFO] Reactor Build Order:
2026-11-16T13:14:44.7694430Z [INFO] 
2026-11-16T13:14:44.7701678Z [INFO] SIGEC-PORTABILIDADE                                                [pom]
2026-11-16T13:14:44.7705385Z [INFO] GEC XML module                                                     [jar]
2026-11-16T13:14:44.7705876Z [INFO] GEC Azure module                                                   [jar]
2026-11-16T13:14:44.7706329Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas               [jar]
2026-11-16T13:14:44.7706529Z [INFO] GEC EJB module                                                     [ejb]
2026-11-16T13:14:44.7706696Z [INFO] GEC Web module                                                     [war]
2026-11-16T13:14:44.7706885Z [INFO] SIGEC PORTABILIDADE                                                [war]
2026-11-16T13:14:44.7707036Z [INFO] GEC EAR module                                                     [ear]
2026-11-16T13:14:44.7755123Z [INFO] 
2026-11-16T13:14:44.7755884Z [INFO] -----------------------< br.gov.caixa.sigec:gec >-----------------------
2026-11-16T13:14:44.7756184Z [INFO] Building SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT                 [1/8]
2026-11-16T13:14:44.7756676Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-16T13:14:44.8011357Z [INFO] 
2026-11-16T13:14:44.8012387Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec ---
2026-11-16T13:14:44.8502315Z [INFO] 
2026-11-16T13:14:44.8503462Z [INFO] ---------------------< br.gov.caixa.sigec:gec-xml >---------------------
2026-11-16T13:14:44.8503766Z [INFO] Building GEC XML module 5.0.0-online-SNAPSHOT                      [2/8]
2026-11-16T13:14:44.8504057Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T13:14:45.4739585Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/arqref/arqref-web/3.1.0.1/arqref-web-3.1.0.1.pom
2026-11-16T13:14:45.6035279Z [WARNING] The POM for br.gov.caixa.arqref:arqref-web:jar:3.1.0.1 is missing, no dependency information available
2026-11-16T13:14:45.6120454Z [INFO] 
2026-11-16T13:14:45.6121027Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-xml ---
2026-11-16T13:14:45.6143696Z [INFO] 
2026-11-16T13:14:45.6144135Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-xml ---
2026-11-16T13:14:45.7134115Z [INFO] Copying 524 resources from src/main/resources to target/classes
2026-11-16T13:14:45.7586047Z [INFO] 
2026-11-16T13:14:45.7587075Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-xml ---
2026-11-16T13:14:50.8515436Z [INFO] Recompiling the module because of changed source code.
2026-11-16T13:14:50.8643555Z [INFO] Compiling 2368 source files with javac [debug parameters release 17] to target/classes
2026-11-16T13:14:58.5933934Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T13:14:58.5934323Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T13:14:58.5934715Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T13:14:58.5934906Z    - with linked exception:
2026-11-16T13:14:58.5935102Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-16T13:14:58.5935440Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T13:14:58.5936155Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:14:58.5936904Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:14:58.5937315Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:14:58.5937719Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:14:58.5938123Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:14:58.5938523Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:14:58.5938737Z [INFO] 
2026-11-16T13:14:58.5939015Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-xml ---
2026-11-16T13:14:58.5969627Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-xml/src/test/resources
2026-11-16T13:14:58.5971617Z [INFO] 
2026-11-16T13:14:58.5971894Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-xml ---
2026-11-16T13:14:58.6004432Z [INFO] No sources to compile
2026-11-16T13:14:58.6004880Z [INFO] 
2026-11-16T13:14:58.6005438Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-xml ---
2026-11-16T13:14:58.9329158Z [INFO] Tests are skipped.
2026-11-16T13:14:58.9330018Z [INFO] 
2026-11-16T13:14:58.9331494Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-xml ---
2026-11-16T13:14:59.2490770Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-xml/target/gec-xml-5.0.0-online-SNAPSHOT.jar
2026-11-16T13:14:59.6799478Z [INFO] 
2026-11-16T13:14:59.6800686Z [INFO] --------------------< br.gov.caixa.sigec:gec-azure >--------------------
2026-11-16T13:14:59.6801755Z [INFO] Building GEC Azure module 5.0.0-online-SNAPSHOT                    [3/8]
2026-11-16T13:14:59.6802415Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T13:15:00.3545953Z [INFO] 
2026-11-16T13:15:00.3546639Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-azure ---
2026-11-16T13:15:00.3554899Z [INFO] 
2026-11-16T13:15:00.3555486Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-azure ---
2026-11-16T13:15:00.3568490Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-azure/src/main/resources
2026-11-16T13:15:00.3569388Z [INFO] 
2026-11-16T13:15:00.3569637Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-azure ---
2026-11-16T13:15:00.3619660Z [INFO] Recompiling the module because of changed source code.
2026-11-16T13:15:00.3622465Z [INFO] Compiling 3 source files with javac [debug parameters release 17] to target/classes
2026-11-16T13:15:01.0177246Z [INFO] 
2026-11-16T13:15:01.0178693Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-azure ---
2026-11-16T13:15:01.0199081Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-azure/src/test/resources
2026-11-16T13:15:01.0199590Z [INFO] 
2026-11-16T13:15:01.0201136Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-azure ---
2026-11-16T13:15:01.0380861Z [INFO] No sources to compile
2026-11-16T13:15:01.0381139Z [INFO] 
2026-11-16T13:15:01.0381706Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-azure ---
2026-11-16T13:15:01.0404302Z [INFO] Tests are skipped.
2026-11-16T13:15:01.0406474Z [INFO] 
2026-11-16T13:15:01.0407330Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-azure ---
2026-11-16T13:15:01.0436026Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-azure/target/gec-azure-5.0.0-online-SNAPSHOT.jar
2026-11-16T13:15:01.0454981Z [INFO] 
2026-11-16T13:15:01.0456299Z [INFO] -------------------< br.gov.caixa.sigec:gec-common >--------------------
2026-11-16T13:15:01.0456766Z [INFO] Building GEC Common module - DTOs e Interfaces Compartilhadas 5.0.0-online-SNAPSHOT [4/8]
2026-11-16T13:15:01.0457552Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T13:15:01.0749130Z [INFO] 
2026-11-16T13:15:01.0749978Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-common ---
2026-11-16T13:15:01.0757755Z [INFO] 
2026-11-16T13:15:01.0758249Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-common ---
2026-11-16T13:15:01.0771770Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-common/src/main/resources
2026-11-16T13:15:01.0772240Z [INFO] 
2026-11-16T13:15:01.0772528Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-common ---
2026-11-16T13:15:01.0809504Z [INFO] Recompiling the module because of changed source code.
2026-11-16T13:15:01.0812261Z [INFO] Compiling 4 source files with javac [debug parameters release 17] to target/classes
2026-11-16T13:15:01.6075562Z [INFO] 
2026-11-16T13:15:01.6076723Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-common ---
2026-11-16T13:15:01.6089001Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-common/src/test/resources
2026-11-16T13:15:01.6089776Z [INFO] 
2026-11-16T13:15:01.6090774Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-common ---
2026-11-16T13:15:01.6108864Z [INFO] No sources to compile
2026-11-16T13:15:01.6109196Z [INFO] 
2026-11-16T13:15:01.6109717Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-common ---
2026-11-16T13:15:01.6125717Z [INFO] Tests are skipped.
2026-11-16T13:15:01.6126609Z [INFO] 
2026-11-16T13:15:01.6127508Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-common ---
2026-11-16T13:15:01.6150144Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-common/target/gec-common-5.0.0-online-SNAPSHOT.jar
2026-11-16T13:15:01.6178074Z [INFO] 
2026-11-16T13:15:01.6179379Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ejb >---------------------
2026-11-16T13:15:01.6179833Z [INFO] Building GEC EJB module 5.0.0-online-SNAPSHOT                      [5/8]
2026-11-16T13:15:01.6180206Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-11-16T13:15:04.0679025Z [INFO] 
2026-11-16T13:15:04.0679697Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ejb ---
2026-11-16T13:15:04.0686374Z [INFO] 
2026-11-16T13:15:04.0686794Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ejb ---
2026-11-16T13:15:04.0709695Z [INFO] Copying 11 resources from src/main/resources to target/classes
2026-11-16T13:15:04.1457571Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-16T13:15:04.1459111Z [INFO] 
2026-11-16T13:15:04.1459728Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-ejb ---
2026-11-16T13:15:04.2006213Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T13:15:04.2024382Z [INFO] Compiling 1571 source files with javac [debug parameters release 17] to target/classes
2026-11-16T13:15:23.0196671Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T13:15:23.0197462Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T13:15:23.0197773Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T13:15:23.0198132Z    - with linked exception:
2026-11-16T13:15:23.0198685Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T13:15:23.0199032Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T13:15:23.0199855Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-16T13:15:23.0251346Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(65,9): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-16T13:15:23.0260859Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(69,9): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-16T13:15:23.0263602Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java(12,1): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T13:15:23.0266421Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java(15,1): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T13:15:23.0269001Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(45,31): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0271229Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(111,39): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0273750Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java(72,10): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-16T13:15:23.0276091Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1228,101): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0278386Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1237,129): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0280631Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1241,135): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0282988Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1245,143): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0288005Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1249,142): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0291071Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1253,129): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0293977Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1546,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0296515Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1562,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0298799Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(729,62): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0301742Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(2957,81): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0305474Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(3152,77): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0308727Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(4057,39): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0311765Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(555,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0315339Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(595,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0318124Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(624,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0320616Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(325,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0321762Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-16T13:15:23.0322235Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-16T13:15:23.0322883Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T13:15:23.0323527Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T13:15:23.0323979Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0324432Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0324884Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-16T13:15:23.0325206Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T13:15:23.0325541Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0326014Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0326445Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0326835Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0327237Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0327624Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0328013Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0328396Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0328839Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0329387Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0329804Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0330232Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0330647Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0331062Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0331478Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0332172Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0334927Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(341,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0338451Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java(580,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0341002Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(435,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0343678Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(474,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0346523Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(503,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0349014Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(309,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0351548Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(336,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0354264Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java(435,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0357114Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(422,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0359750Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(454,75): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0363178Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(472,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0365629Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(310,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0368532Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(337,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0371084Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java(455,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0374048Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(434,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0376490Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(473,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0379513Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(502,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0382225Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(317,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0385092Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(333,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0387459Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java(571,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0389952Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(192,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0393400Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(231,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0397639Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(260,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0400547Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(325,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0404336Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(342,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0406640Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java(632,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0410088Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(417,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0413240Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(447,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0416083Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(442,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0419320Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(470,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0422043Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java(460,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0424867Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(8,49): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0427814Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(9,47): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0430185Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(10,49): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-16T13:15:23.0433034Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(11,51): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0435418Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(457,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0438064Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(503,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0440541Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(550,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0443241Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java(362,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0445766Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java(445,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0448766Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java(513,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0451757Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(320,88): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0454889Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(545,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0457196Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(99,27): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-16T13:15:23.0461970Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(222,27): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-16T13:15:23.0465105Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java(89,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0467794Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(477,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0470998Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(521,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0473913Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(479,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0476773Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(517,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0479720Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(488,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0482262Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(526,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0486682Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(39,37): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0489378Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(40,37): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0491912Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(113,66): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0495532Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(114,66): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0498621Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(147,71): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0501018Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(149,41): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0505346Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(346,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0508406Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(347,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0511609Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(348,63): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0515772Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(350,33): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0520897Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(656,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0525386Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(657,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0528420Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(48,61): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0531294Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(61,66): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0534200Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(98,61): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0538211Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(134,61): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0545871Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(138,68): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0550840Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(143,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0556124Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(144,45): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0560755Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(145,51): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0563468Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java(710,55): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0566696Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java(109,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0567915Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0568438Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0568936Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0569452Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0569896Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0570370Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0570841Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0571353Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0571878Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0572507Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0573069Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0573539Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0574069Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0574639Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0575154Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0575632Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0576113Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0576634Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0577232Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0577746Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0578235Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0578705Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0579207Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0579605Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0580004Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0580505Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0580911Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0581309Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0581704Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0582102Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0582508Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0582975Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0583993Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0584524Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-16T13:15:23.0584920Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T13:15:23.0585477Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0585886Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0586283Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0586681Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0587102Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0587534Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0588060Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0588656Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0589203Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-16T13:15:23.0589442Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T13:15:23.0589917Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-16T13:15:23.0590172Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T13:15:23.0591057Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0591587Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0592061Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0592506Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0593107Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0593581Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0594030Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:23.0594607Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0595036Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0595467Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0595918Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0596352Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0596773Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0597198Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0597700Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0599105Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0599614Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0600041Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0600485Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0600909Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0601347Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0601766Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0602205Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0602772Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0603224Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0603644Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0604158Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0604601Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0605026Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T13:15:23.0605411Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Some input files use or override a deprecated API.
2026-11-16T13:15:23.0605797Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Recompile with -Xlint:deprecation for details.
2026-11-16T13:15:23.0606514Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-16T13:15:23.0606904Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Some input files use unchecked or unsafe operations.
2026-11-16T13:15:23.0607268Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Recompile with -Xlint:unchecked for details.
2026-11-16T13:15:23.0607498Z [INFO] 
2026-11-16T13:15:23.0607745Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-ejb ---
2026-11-16T13:15:23.0608024Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-ejb/src/test/resources
2026-11-16T13:15:23.0608150Z [INFO] 
2026-11-16T13:15:23.0608398Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-ejb ---
2026-11-16T13:15:23.0608642Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T13:15:23.0608900Z [INFO] Compiling 7 source files with javac [debug parameters release 17] to target/test-classes
2026-11-16T13:15:23.8830882Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T13:15:23.8831260Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T13:15:23.8835322Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T13:15:23.8835805Z    - with linked exception:
2026-11-16T13:15:23.8835998Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T13:15:23.8836530Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T13:15:23.8837074Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.jboss.logging.processor.apt.LoggingToolsProcessor' less than -source '17'
2026-11-16T13:15:23.8837361Z [INFO] 
2026-11-16T13:15:23.8838041Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-ejb ---
2026-11-16T13:15:23.8858225Z [INFO] Tests are skipped.
2026-11-16T13:15:23.8858468Z [INFO] 
2026-11-16T13:15:24.1580672Z [INFO] --- maven-ejb-plugin:3.0.1:ejb (default-ejb) @ gec-ejb ---
2026-11-16T13:15:24.1581090Z [INFO] Building EJB gec-ejb-5.0.0-online-SNAPSHOT with EJB version 3.1
2026-11-16T13:15:24.3314079Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-ejb/target/gec-ejb-5.0.0-online-SNAPSHOT.jar
2026-11-16T13:15:24.4832035Z [INFO] 
2026-11-16T13:15:24.4832998Z [INFO] ---------------------< br.gov.caixa.sigec:gec-web >---------------------
2026-11-16T13:15:24.4833415Z [INFO] Building GEC Web module 5.0.0-online-SNAPSHOT                      [6/8]
2026-11-16T13:15:24.4833811Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-16T13:15:24.6932267Z [INFO] 
2026-11-16T13:15:24.6933279Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-web ---
2026-11-16T13:15:24.6939837Z [INFO] 
2026-11-16T13:15:24.6940860Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-web ---
2026-11-16T13:15:24.6953328Z [INFO] Copying 2 resources from src/main/resources to target/classes
2026-11-16T13:15:24.7024165Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-16T13:15:24.7024804Z [INFO] 
2026-11-16T13:15:24.7025199Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-web ---
2026-11-16T13:15:24.7084794Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T13:15:24.7085146Z [INFO] Compiling 124 source files with javac [debug parameters release 17] to target/classes
2026-11-16T13:15:25.5019878Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T13:15:25.5020499Z [INFO] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Some input files use or override a deprecated API.
2026-11-16T13:15:25.5021307Z [INFO] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Recompile with -Xlint:deprecation for details.
2026-11-16T13:15:25.5024277Z [INFO] -------------------------------------------------------------
2026-11-16T13:15:25.5029906Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java(121,47): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:25.5034171Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(140,17): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-16T13:15:25.5038007Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(151,17): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-16T13:15:25.5042465Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(162,17): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-16T13:15:25.5045718Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(174,53): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-16T13:15:25.5049046Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(291,53): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-16T13:15:25.5049539Z [WARNING] COMPILATION WARNING : 
2026-11-16T13:15:25.5049980Z [INFO] -------------------------------------------------------------
2026-11-16T13:15:25.5050262Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T13:15:25.5050555Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T13:15:25.5050794Z    - with linked exception:
2026-11-16T13:15:25.5051007Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-16T13:15:25.5051406Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T13:15:25.5051813Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T13:15:25.5052207Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-16T13:15:25.5052599Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-16T13:15:25.5053155Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-16T13:15:25.5053725Z [INFO] 6 warnings 
2026-11-16T13:15:25.5053912Z [INFO] -------------------------------------------------------------
2026-11-16T13:15:25.5054161Z [INFO] -------------------------------------------------------------
2026-11-16T13:15:25.5054354Z [ERROR] COMPILATION ERROR : 
2026-11-16T13:15:25.5054585Z [INFO] -------------------------------------------------------------
2026-11-16T13:15:25.5054897Z [ERROR] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-16T13:15:25.5055107Z   symbol:   method listarMensagensEnvioFilaNCR()
2026-11-16T13:15:25.5055326Z   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-16T13:15:25.5055660Z [ERROR] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-16T13:15:25.5055900Z   symbol:   method publicarMensagemEnvioFilaNCR(br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO)
2026-11-16T13:15:25.5056128Z   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-16T13:15:25.5056342Z [INFO] 2 errors 
2026-11-16T13:15:25.5056524Z [INFO] -------------------------------------------------------------
2026-11-16T13:15:25.5056779Z [INFO] ------------------------------------------------------------------------
2026-11-16T13:15:25.5057031Z [INFO] Reactor Summary for SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT:
2026-11-16T13:15:25.5057235Z [INFO] 
2026-11-16T13:15:25.5057584Z [INFO] SIGEC-PORTABILIDADE ................................ SUCCESS [  0.074 s]
2026-11-16T13:15:25.5058529Z [INFO] GEC XML module ..................................... SUCCESS [ 14.830 s]
2026-11-16T13:15:25.5058734Z [INFO] GEC Azure module ................................... SUCCESS [  1.366 s]
2026-11-16T13:15:25.5059102Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas SUCCESS [  0.572 s]
2026-11-16T13:15:25.5059382Z [INFO] GEC EJB module ..................................... SUCCESS [ 22.865 s]
2026-11-16T13:15:25.5059624Z [INFO] GEC Web module ..................................... FAILURE [  1.020 s]
2026-11-16T13:15:25.5059818Z [INFO] SIGEC PORTABILIDADE ................................ SKIPPED
2026-11-16T13:15:25.5060002Z [INFO] GEC EAR module ..................................... SKIPPED
2026-11-16T13:15:25.5060258Z [INFO] ------------------------------------------------------------------------
2026-11-16T13:15:25.5060440Z [INFO] BUILD FAILURE
2026-11-16T13:15:25.5060675Z [INFO] ------------------------------------------------------------------------
2026-11-16T13:15:25.5060850Z [INFO] Total time:  40.836 s
2026-11-16T13:15:25.5061092Z [INFO] Finished at: 2026-11-16T10:15:25-03:00
2026-11-16T13:15:25.5061366Z [INFO] ------------------------------------------------------------------------
2026-11-16T13:15:25.5064444Z ##[error] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(174,53): error :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-16T13:15:25.5065382Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project gec-web: Compilation failure: Compilation failure: 
2026-11-16T13:15:25.5065761Z [ERROR] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-16T13:15:25.5068583Z ##[error] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(291,53): error :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-16T13:15:25.5069135Z [ERROR]   symbol:   method listarMensagensEnvioFilaNCR()
2026-11-16T13:15:25.5069439Z [ERROR]   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-16T13:15:25.5069785Z [ERROR] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-16T13:15:25.5070021Z [ERROR]   symbol:   method publicarMensagemEnvioFilaNCR(br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO)
2026-11-16T13:15:25.5070212Z [ERROR]   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-16T13:15:25.5070439Z [ERROR] -> [Help 1]
2026-11-16T13:15:25.5070578Z [ERROR] 
2026-11-16T13:15:25.5070835Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-11-16T13:15:25.5071092Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-11-16T13:15:25.5071245Z [ERROR] 
2026-11-16T13:15:25.5071429Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-11-16T13:15:25.5072229Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-11-16T13:15:25.5072399Z [ERROR] 
2026-11-16T13:15:25.5072528Z [ERROR] After correcting the problems, you can resume the build with the command
2026-11-16T13:15:25.5072905Z [ERROR]   mvn <args> -rf :gec-web
2026-11-16T13:15:25.6760748Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-11-16T13:15:25.6761127Z Could not retrieve code analysis results - Maven run failed.
2026-11-16T13:15:25.6764782Z ##[error]Build failed.
2026-11-16T13:15:25.6896830Z ##[section]Finishing: Maven


