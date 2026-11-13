2026-11-13T18:51:33.6983773Z ##[section]Starting: Maven
2026-11-13T18:51:33.6989154Z ==============================================================================
2026-11-13T18:51:33.6989240Z Task         : Maven
2026-11-13T18:51:33.6989287Z Description  : Build, test, and deploy with Apache Maven
2026-11-13T18:51:33.6989382Z Version      : 4.225.0
2026-11-13T18:51:33.6989435Z Author       : Microsoft Corporation
2026-11-13T18:51:33.6989486Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-13T18:51:33.6989587Z ==============================================================================
2026-11-13T18:51:35.4501614Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-13T18:51:35.5614275Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-13T18:51:35.5616348Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-13T18:51:35.5616724Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-13T18:51:35.5616906Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-13T18:51:35.5617330Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-13T18:51:35.5691497Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/14/s/pom.xml clean package -Dversion.app= -DskipTests=true -U -Ponline
2026-11-13T18:51:36.2152625Z [INFO] Scanning for projects...
2026-11-13T18:51:36.2761980Z [WARNING] 
2026-11-13T18:51:36.2765502Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec-xml:jar:5.0.0-online-SNAPSHOT
2026-11-13T18:51:36.2766115Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/14/s/pom.xml, line 8, column 11
2026-11-13T18:51:36.2766331Z [WARNING] 
2026-11-13T18:51:36.2766621Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec:pom:5.0.0-online-SNAPSHOT
2026-11-13T18:51:36.2766992Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/14/s/pom.xml, line 8, column 11
2026-11-13T18:51:36.2767226Z [WARNING] 
2026-11-13T18:51:36.2767366Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-11-13T18:51:36.2767554Z [WARNING] 
2026-11-13T18:51:36.2767738Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-11-13T18:51:36.2767901Z [WARNING] 
2026-11-13T18:51:36.2794659Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:51:36.2794878Z [INFO] Reactor Build Order:
2026-11-13T18:51:36.2795010Z [INFO] 
2026-11-13T18:51:36.2804582Z [INFO] SIGEC-PORTABILIDADE                                                [pom]
2026-11-13T18:51:36.2805884Z [INFO] GEC XML module                                                     [jar]
2026-11-13T18:51:36.2806005Z [INFO] GEC Azure module                                                   [jar]
2026-11-13T18:51:36.2806252Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas               [jar]
2026-11-13T18:51:36.2806415Z [INFO] GEC EJB module                                                     [ejb]
2026-11-13T18:51:36.2806559Z [INFO] GEC Web module                                                     [war]
2026-11-13T18:51:36.2806924Z [INFO] SIGEC PORTABILIDADE                                                [war]
2026-11-13T18:51:36.2807470Z [INFO] GEC EAR module                                                     [ear]
2026-11-13T18:51:36.2848503Z [INFO] 
2026-11-13T18:51:36.2849492Z [INFO] -----------------------< br.gov.caixa.sigec:gec >-----------------------
2026-11-13T18:51:36.2849768Z [INFO] Building SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT                 [1/8]
2026-11-13T18:51:36.2850025Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-13T18:51:36.3059721Z [INFO] 
2026-11-13T18:51:36.3060134Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec ---
2026-11-13T18:51:36.3453453Z [INFO] 
2026-11-13T18:51:36.3454143Z [INFO] ---------------------< br.gov.caixa.sigec:gec-xml >---------------------
2026-11-13T18:51:36.3454425Z [INFO] Building GEC XML module 5.0.0-online-SNAPSHOT                      [2/8]
2026-11-13T18:51:36.3454672Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:51:36.8988149Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/arqref/arqref-web/3.1.0.1/arqref-web-3.1.0.1.pom
2026-11-13T18:51:37.8983962Z [WARNING] The POM for br.gov.caixa.arqref:arqref-web:jar:3.1.0.1 is missing, no dependency information available
2026-11-13T18:51:37.9099989Z [INFO] 
2026-11-13T18:51:37.9101612Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-xml ---
2026-11-13T18:51:37.9123593Z [INFO] 
2026-11-13T18:51:37.9124086Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-xml ---
2026-11-13T18:51:37.9771503Z [INFO] Copying 524 resources from src/main/resources to target/classes
2026-11-13T18:51:38.0163464Z [INFO] 
2026-11-13T18:51:38.0166028Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-xml ---
2026-11-13T18:51:38.2128836Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:51:38.2223125Z [INFO] Compiling 2368 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:51:43.6523628Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:51:43.6524031Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:51:43.6524331Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:51:43.6524553Z    - with linked exception:
2026-11-13T18:51:43.6524801Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-13T18:51:43.6525275Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:51:43.6525669Z [WARNING] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6526086Z [WARNING] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6526495Z [WARNING] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6549863Z ##[warning] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(75,60): warning :  /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6553360Z ##[warning] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(76,53): warning :  /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6555661Z ##[warning] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(77,51): warning :  /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6556410Z [WARNING] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6556965Z [WARNING] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6557494Z [WARNING] /opt/ads-agent/_work/14/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:51:43.6557713Z [INFO] 
2026-11-13T18:51:43.6557974Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-xml ---
2026-11-13T18:51:43.6562501Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/14/s/gec-xml/src/test/resources
2026-11-13T18:51:43.6562741Z [INFO] 
2026-11-13T18:51:43.6563159Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-xml ---
2026-11-13T18:51:43.6595429Z [INFO] No sources to compile
2026-11-13T18:51:43.6595623Z [INFO] 
2026-11-13T18:51:43.6595991Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-xml ---
2026-11-13T18:51:43.8288052Z [INFO] Tests are skipped.
2026-11-13T18:51:43.8288480Z [INFO] 
2026-11-13T18:51:43.8288962Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-xml ---
2026-11-13T18:51:44.1425684Z [INFO] Building jar: /opt/ads-agent/_work/14/s/gec-xml/target/gec-xml-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:51:44.5075892Z [INFO] 
2026-11-13T18:51:44.5076512Z [INFO] --------------------< br.gov.caixa.sigec:gec-azure >--------------------
2026-11-13T18:51:44.5076944Z [INFO] Building GEC Azure module 5.0.0-online-SNAPSHOT                    [3/8]
2026-11-13T18:51:44.5077233Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:51:45.3297920Z [INFO] 
2026-11-13T18:51:45.3298539Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-azure ---
2026-11-13T18:51:45.3304995Z [INFO] 
2026-11-13T18:51:45.3305239Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-azure ---
2026-11-13T18:51:45.3315888Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/14/s/gec-azure/src/main/resources
2026-11-13T18:51:45.3316319Z [INFO] 
2026-11-13T18:51:45.3316578Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-azure ---
2026-11-13T18:51:45.3359036Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:51:45.3362073Z [INFO] Compiling 3 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:51:46.0714601Z [INFO] 
2026-11-13T18:51:46.0715180Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-azure ---
2026-11-13T18:51:46.0751707Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/14/s/gec-azure/src/test/resources
2026-11-13T18:51:46.0751868Z [INFO] 
2026-11-13T18:51:46.0752395Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-azure ---
2026-11-13T18:51:46.0752587Z [INFO] No sources to compile
2026-11-13T18:51:46.0752724Z [INFO] 
2026-11-13T18:51:46.0752975Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-azure ---
2026-11-13T18:51:46.0762302Z [INFO] Tests are skipped.
2026-11-13T18:51:46.0762443Z [INFO] 
2026-11-13T18:51:46.0762636Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-azure ---
2026-11-13T18:51:46.0780663Z [INFO] Building jar: /opt/ads-agent/_work/14/s/gec-azure/target/gec-azure-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:51:46.0798200Z [INFO] 
2026-11-13T18:51:46.0798535Z [INFO] -------------------< br.gov.caixa.sigec:gec-common >--------------------
2026-11-13T18:51:46.0798811Z [INFO] Building GEC Common module - DTOs e Interfaces Compartilhadas 5.0.0-online-SNAPSHOT [4/8]
2026-11-13T18:51:46.0799069Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:51:46.1056134Z [INFO] 
2026-11-13T18:51:46.1056972Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-common ---
2026-11-13T18:51:46.1061602Z [INFO] 
2026-11-13T18:51:46.1061869Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-common ---
2026-11-13T18:51:46.1070750Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/14/s/gec-common/src/main/resources
2026-11-13T18:51:46.1096779Z [INFO] 
2026-11-13T18:51:46.1097097Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-common ---
2026-11-13T18:51:46.1100254Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:51:46.1103375Z [INFO] Compiling 4 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:51:46.5900402Z [INFO] 
2026-11-13T18:51:46.5901118Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-common ---
2026-11-13T18:51:46.5910278Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/14/s/gec-common/src/test/resources
2026-11-13T18:51:46.5910506Z [INFO] 
2026-11-13T18:51:46.5910759Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-common ---
2026-11-13T18:51:46.5928684Z [INFO] No sources to compile
2026-11-13T18:51:46.5928945Z [INFO] 
2026-11-13T18:51:46.5930008Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-common ---
2026-11-13T18:51:46.5947648Z [INFO] Tests are skipped.
2026-11-13T18:51:46.5947864Z [INFO] 
2026-11-13T18:51:46.5948212Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-common ---
2026-11-13T18:51:46.5973532Z [INFO] Building jar: /opt/ads-agent/_work/14/s/gec-common/target/gec-common-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:51:46.5999511Z [INFO] 
2026-11-13T18:51:46.5999959Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ejb >---------------------
2026-11-13T18:51:46.6000425Z [INFO] Building GEC EJB module 5.0.0-online-SNAPSHOT                      [5/8]
2026-11-13T18:51:46.6000810Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-11-13T18:51:50.2478738Z [INFO] 
2026-11-13T18:51:50.2480112Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ejb ---
2026-11-13T18:51:50.2480452Z [INFO] 
2026-11-13T18:51:50.2480687Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ejb ---
2026-11-13T18:51:50.2498276Z [INFO] Copying 11 resources from src/main/resources to target/classes
2026-11-13T18:51:50.3140597Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-13T18:51:50.3142301Z [INFO] 
2026-11-13T18:51:50.3142846Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-ejb ---
2026-11-13T18:51:50.3597262Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:51:50.3616599Z [INFO] Compiling 1571 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:52:04.9802664Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:52:04.9803339Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:52:04.9807413Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:52:04.9807882Z    - with linked exception:
2026-11-13T18:52:04.9808053Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-13T18:52:04.9808339Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:52:04.9827217Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java(30,59): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-13T18:52:04.9832258Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java(12,1): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:52:04.9835228Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java(15,1): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:52:04.9838801Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(65,9): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-13T18:52:04.9841142Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(69,9): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-13T18:52:04.9848567Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(45,31): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9850910Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(111,39): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9853588Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java(72,10): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-13T18:52:04.9855986Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1228,101): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:04.9858623Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1237,129): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:04.9860873Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1241,135): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9863154Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1245,143): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9865374Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1249,142): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9867942Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1253,129): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:04.9872692Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1546,24): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9875074Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1562,24): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9877921Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(729,62): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9880225Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(2957,81): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9883705Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(3152,77): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9886056Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(4057,39): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9889118Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(555,29): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9893263Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(595,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9896677Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(624,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9899590Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(325,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9902018Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(341,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9905340Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java(580,59): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9908360Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(435,29): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9911118Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(474,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9914218Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(503,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9916635Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(309,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9918811Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(336,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9921101Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java(435,59): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9924221Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(422,29): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9926421Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(454,75): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9928588Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(472,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9929632Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-13T18:52:04.9930293Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:52:04.9930869Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:52:04.9931393Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-13T18:52:04.9931789Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-13T18:52:04.9932175Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9932692Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9933961Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-13T18:52:04.9934189Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:52:04.9934540Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:04.9934940Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:04.9935301Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9935698Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9936084Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9936458Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:04.9937066Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9937468Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9937869Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9938279Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9938754Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9939162Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9939624Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9940033Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9940461Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9940864Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9941359Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9941771Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9942183Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9942605Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9943005Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9943407Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9943829Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9944236Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9944644Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9945041Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9945439Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9947708Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(310,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9952022Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(337,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9954364Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java(455,59): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9956647Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(434,29): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9959696Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(473,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9962151Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(502,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9964428Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(317,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9966699Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(333,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9969891Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java(571,59): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9972230Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(192,29): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9974879Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(231,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9977203Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(260,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9980016Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(325,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9982376Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(342,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9984577Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java(632,59): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:04.9986895Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(417,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9990109Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(447,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9992430Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(442,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9994962Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(470,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:04.9997917Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java(460,59): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0000058Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(8,49): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0002387Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(9,47): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0004642Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(10,49): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-13T18:52:05.0007739Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(11,51): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:05.0010318Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(457,29): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0012870Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(503,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0015892Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(550,40): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0018105Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java(362,48): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0020341Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java(445,24): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0023113Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java(513,24): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0026178Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(320,88): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0028441Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(545,58): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0030706Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(99,27): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-13T18:52:05.0033921Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(222,27): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-13T18:52:05.0036167Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java(89,58): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0038687Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(477,48): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0041177Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(521,48): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0043550Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(479,48): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0046908Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(517,48): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0049232Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(488,48): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0051741Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(526,48): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0054088Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(39,37): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0057569Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(40,37): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0059798Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(113,66): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0062228Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(114,66): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0064879Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(147,71): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0067130Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(149,41): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0069520Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(346,58): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0071828Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(347,58): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0075341Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(348,63): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0077546Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(350,33): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0079780Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(656,43): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0082189Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(657,43): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0085433Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(48,61): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0087617Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(61,66): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0089879Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(98,61): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0092772Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(134,61): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0095131Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(138,68): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0097558Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(143,43): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0099856Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(144,45): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0102409Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(145,51): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0104630Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java(710,55): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0107632Z ##[warning] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java(109,43): warning :  /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0108493Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0108919Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0109441Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0109849Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0110283Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0110710Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0111447Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0111848Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0112254Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0112654Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0113056Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0113454Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0113916Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0114309Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0114731Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0115134Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0115522Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0115914Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0116308Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0116723Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0117100Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0117474Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0117868Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-13T18:52:05.0118248Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:52:05.0118683Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0119086Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0119456Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0119861Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0120266Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0120675Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0121172Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0121629Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0122017Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-13T18:52:05.0122303Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:52:05.0122641Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-13T18:52:05.0122867Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:52:05.0123255Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0123700Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0124141Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0124593Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0125023Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0126271Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0126771Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:05.0127301Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0127733Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0128157Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0128589Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0129041Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0129509Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0129928Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0130347Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0130758Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0131265Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0131693Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0132113Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0132550Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0132975Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0133394Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0133824Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0134292Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0134715Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0135140Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0135918Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0136360Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0136809Z [WARNING] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:52:05.0137152Z [INFO] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Some input files use or override a deprecated API.
2026-11-13T18:52:05.0137922Z [INFO] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Recompile with -Xlint:deprecation for details.
2026-11-13T18:52:05.0138331Z [INFO] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-13T18:52:05.0138714Z [INFO] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Some input files use unchecked or unsafe operations.
2026-11-13T18:52:05.0139082Z [INFO] /opt/ads-agent/_work/14/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Recompile with -Xlint:unchecked for details.
2026-11-13T18:52:05.0139484Z [INFO] 
2026-11-13T18:52:05.0139741Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-ejb ---
2026-11-13T18:52:05.0140077Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/14/s/gec-ejb/src/test/resources
2026-11-13T18:52:05.0140233Z [INFO] 
2026-11-13T18:52:05.0140476Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-ejb ---
2026-11-13T18:52:05.0140732Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:52:05.0140964Z [INFO] Compiling 7 source files with javac [debug parameters release 17] to target/test-classes
2026-11-13T18:52:07.1631518Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:52:07.1631865Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:52:07.1632152Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:52:07.1632374Z    - with linked exception:
2026-11-13T18:52:07.1632544Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-13T18:52:07.1632866Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:52:07.1633218Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.jboss.logging.processor.apt.LoggingToolsProcessor' less than -source '17'
2026-11-13T18:52:07.1636655Z [INFO] 
2026-11-13T18:52:07.1636971Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-ejb ---
2026-11-13T18:52:07.1656764Z [INFO] Tests are skipped.
2026-11-13T18:52:07.1656956Z [INFO] 
2026-11-13T18:52:07.1657634Z [INFO] --- maven-ejb-plugin:3.0.1:ejb (default-ejb) @ gec-ejb ---
2026-11-13T18:52:07.6467325Z [INFO] Building EJB gec-ejb-5.0.0-online-SNAPSHOT with EJB version 3.1
2026-11-13T18:52:07.7585691Z [INFO] Building jar: /opt/ads-agent/_work/14/s/gec-ejb/target/gec-ejb-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:52:07.8645339Z [INFO] 
2026-11-13T18:52:07.8646258Z [INFO] ---------------------< br.gov.caixa.sigec:gec-web >---------------------
2026-11-13T18:52:07.8646546Z [INFO] Building GEC Web module 5.0.0-online-SNAPSHOT                      [6/8]
2026-11-13T18:52:07.8646820Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-13T18:52:08.1613463Z [INFO] 
2026-11-13T18:52:08.1614408Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-web ---
2026-11-13T18:52:08.1619455Z [INFO] 
2026-11-13T18:52:08.1619805Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-web ---
2026-11-13T18:52:08.1631749Z [INFO] Copying 2 resources from src/main/resources to target/classes
2026-11-13T18:52:08.1746392Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-13T18:52:08.1750829Z [INFO] 
2026-11-13T18:52:08.1751497Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-web ---
2026-11-13T18:52:08.1802283Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:52:08.1806053Z [INFO] Compiling 124 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:52:09.4670464Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:52:09.4670919Z [INFO] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Some input files use or override a deprecated API.
2026-11-13T18:52:09.4672205Z [INFO] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Recompile with -Xlint:deprecation for details.
2026-11-13T18:52:09.4672574Z [INFO] -------------------------------------------------------------
2026-11-13T18:52:09.4672753Z [WARNING] COMPILATION WARNING : 
2026-11-13T18:52:09.4672948Z [INFO] -------------------------------------------------------------
2026-11-13T18:52:09.4673316Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:52:09.4673615Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:52:09.4674001Z    - with linked exception:
2026-11-13T18:52:09.4674180Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-13T18:52:09.4679626Z ##[warning] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java(121,47): warning :  /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:09.4682369Z ##[warning] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(140,17): warning :  /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:52:09.4684798Z ##[warning] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(151,17): warning :  /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:52:09.4688611Z ##[warning] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(162,17): warning :  /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:52:09.4689386Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:52:09.4689803Z [WARNING] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:52:09.4690223Z [WARNING] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:52:09.4690587Z [WARNING] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:52:09.4690965Z [WARNING] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:52:09.4691418Z [INFO] 6 warnings 
2026-11-13T18:52:09.4691643Z [INFO] -------------------------------------------------------------
2026-11-13T18:52:09.4691902Z [INFO] -------------------------------------------------------------
2026-11-13T18:52:09.4692239Z [ERROR] COMPILATION ERROR : 
2026-11-13T18:52:09.4692479Z [INFO] -------------------------------------------------------------
2026-11-13T18:52:09.4692832Z [ERROR] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/UserProfileRest.java:[58,53] method getNumeroIP in class br.gov.caixa.arqrefservices.negocio.UserProfile cannot be applied to given types;
2026-11-13T18:52:09.4693074Z   required: javax.servlet.http.HttpServletRequest
2026-11-13T18:52:09.4693317Z   found:    no arguments
2026-11-13T18:52:09.4693474Z   reason: actual and formal argument lists differ in length
2026-11-13T18:52:09.4693773Z [ERROR] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-13T18:52:09.4693976Z   symbol:   method listarMensagensEnvioFilaNCR()
2026-11-13T18:52:09.4694181Z   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:52:09.4694601Z [ERROR] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-13T18:52:09.4694844Z   symbol:   method publicarMensagemEnvioFilaNCR(br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO)
2026-11-13T18:52:09.4695068Z   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:52:09.4695216Z [INFO] 3 errors 
2026-11-13T18:52:09.4695538Z [INFO] -------------------------------------------------------------
2026-11-13T18:52:09.4695810Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:52:09.4696058Z [INFO] Reactor Summary for SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT:
2026-11-13T18:52:09.4696207Z [INFO] 
2026-11-13T18:52:09.4696426Z [INFO] SIGEC-PORTABILIDADE ................................ SUCCESS [  0.060 s]
2026-11-13T18:52:09.4696648Z [INFO] GEC XML module ..................................... SUCCESS [  8.162 s]
2026-11-13T18:52:09.4696831Z [INFO] GEC Azure module ................................... SUCCESS [  1.572 s]
2026-11-13T18:52:09.4697038Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas SUCCESS [  0.520 s]
2026-11-13T18:52:09.4697222Z [INFO] GEC EJB module ..................................... SUCCESS [ 21.264 s]
2026-11-13T18:52:09.4697472Z [INFO] GEC Web module ..................................... FAILURE [  1.604 s]
2026-11-13T18:52:09.4697648Z [INFO] SIGEC PORTABILIDADE ................................ SKIPPED
2026-11-13T18:52:09.4697828Z [INFO] GEC EAR module ..................................... SKIPPED
2026-11-13T18:52:09.4698091Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:52:09.4698352Z [INFO] BUILD FAILURE
2026-11-13T18:52:09.4698596Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:52:09.4698865Z [INFO] Total time:  33.266 s
2026-11-13T18:52:09.4699112Z [INFO] Finished at: 2026-11-13T15:52:09-03:00
2026-11-13T18:52:09.4699359Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:52:09.4699726Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project gec-web: Compilation failure: Compilation failure: 
2026-11-13T18:52:09.4702212Z ##[error] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/UserProfileRest.java(58,53): error :  /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/UserProfileRest.java:[58,53] method getNumeroIP in class br.gov.caixa.arqrefservices.negocio.UserProfile cannot be applied to given types;
2026-11-13T18:52:09.4704609Z [ERROR] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/UserProfileRest.java:[58,53] method getNumeroIP in class br.gov.caixa.arqrefservices.negocio.UserProfile cannot be applied to given types;
2026-11-13T18:52:09.4704847Z [ERROR]   required: javax.servlet.http.HttpServletRequest
2026-11-13T18:52:09.4704970Z [ERROR]   found:    no arguments
2026-11-13T18:52:09.4705244Z [ERROR]   reason: actual and formal argument lists differ in length
2026-11-13T18:52:09.4707238Z ##[error] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(174,53): error :  /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-13T18:52:09.4709834Z ##[error] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(291,53): error :  /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-13T18:52:09.4710496Z [ERROR] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-13T18:52:09.4710716Z [ERROR]   symbol:   method listarMensagensEnvioFilaNCR()
2026-11-13T18:52:09.4711089Z [ERROR]   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:52:09.4711442Z [ERROR] /opt/ads-agent/_work/14/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-13T18:52:09.4711689Z [ERROR]   symbol:   method publicarMensagemEnvioFilaNCR(br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO)
2026-11-13T18:52:09.4711923Z [ERROR]   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:52:09.4712147Z [ERROR] -> [Help 1]
2026-11-13T18:52:09.4712240Z [ERROR] 
2026-11-13T18:52:09.4712493Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-11-13T18:52:09.4712750Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-11-13T18:52:09.4712986Z [ERROR] 
2026-11-13T18:52:09.4713927Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-11-13T18:52:09.4714129Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-11-13T18:52:09.4714300Z [ERROR] 
2026-11-13T18:52:09.4714457Z [ERROR] After correcting the problems, you can resume the build with the command
2026-11-13T18:52:09.4714716Z [ERROR]   mvn <args> -rf :gec-web
2026-11-13T18:52:09.6256594Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-11-13T18:52:09.6256906Z Could not retrieve code analysis results - Maven run failed.
2026-11-13T18:52:09.6258890Z ##[error]Build failed.
2026-11-13T18:52:09.6323434Z ##[section]Finishing: Maven

quebrou novamente
