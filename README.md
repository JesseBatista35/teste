<img width="1740" height="797" alt="image" src="https://github.com/user-attachments/assets/f9d14cc0-14de-445e-8602-a26c601a722d" />


2026-11-16T14:16:36.5725678Z ##[section]Starting: Maven
2026-11-16T14:16:36.5731210Z ==============================================================================
2026-11-16T14:16:36.5731302Z Task         : Maven
2026-11-16T14:16:36.5731389Z Description  : Build, test, and deploy with Apache Maven
2026-11-16T14:16:36.5731458Z Version      : 4.225.0
2026-11-16T14:16:36.5731506Z Author       : Microsoft Corporation
2026-11-16T14:16:36.5731598Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-16T14:16:36.5731676Z ==============================================================================
2026-11-16T14:16:37.1112844Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-16T14:16:37.2071660Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-16T14:16:37.2072292Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-16T14:16:37.2072552Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-16T14:16:37.2072840Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-16T14:16:37.2073260Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-16T14:16:37.2242384Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/9/s/pom.xml clean package -Dversion.app= -DskipTests=true -U -Ponline
2026-11-16T14:16:37.8317764Z [INFO] Scanning for projects...
2026-11-16T14:16:37.8898457Z [WARNING] 
2026-11-16T14:16:37.8900382Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec-xml:jar:5.0.0-online-SNAPSHOT
2026-11-16T14:16:37.8900876Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/9/s/pom.xml, line 8, column 11
2026-11-16T14:16:37.8901097Z [WARNING] 
2026-11-16T14:16:37.8901412Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec:pom:5.0.0-online-SNAPSHOT
2026-11-16T14:16:37.8901798Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/9/s/pom.xml, line 8, column 11
2026-11-16T14:16:37.8902018Z [WARNING] 
2026-11-16T14:16:37.8902322Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-11-16T14:16:37.8902461Z [WARNING] 
2026-11-16T14:16:37.8902721Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-11-16T14:16:37.8902903Z [WARNING] 
2026-11-16T14:16:37.8932601Z [INFO] ------------------------------------------------------------------------
2026-11-16T14:16:37.8933006Z [INFO] Reactor Build Order:
2026-11-16T14:16:37.8933857Z [INFO] 
2026-11-16T14:16:37.8940966Z [INFO] SIGEC-PORTABILIDADE                                                [pom]
2026-11-16T14:16:37.8941677Z [INFO] GEC XML module                                                     [jar]
2026-11-16T14:16:37.8941886Z [INFO] GEC Azure module                                                   [jar]
2026-11-16T14:16:37.8942449Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas               [jar]
2026-11-16T14:16:37.8942628Z [INFO] GEC EJB module                                                     [ejb]
2026-11-16T14:16:37.8942857Z [INFO] GEC Web module                                                     [war]
2026-11-16T14:16:37.8942985Z [INFO] SIGEC PORTABILIDADE                                                [war]
2026-11-16T14:16:37.8943230Z [INFO] GEC EAR module                                                     [ear]
2026-11-16T14:16:37.8978081Z [INFO] 
2026-11-16T14:16:37.8978457Z [INFO] -----------------------< br.gov.caixa.sigec:gec >-----------------------
2026-11-16T14:16:37.8978961Z [INFO] Building SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT                 [1/8]
2026-11-16T14:16:37.8979318Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-16T14:16:37.9177000Z [INFO] 
2026-11-16T14:16:37.9177878Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec ---
2026-11-16T14:16:37.9533913Z [INFO] 
2026-11-16T14:16:37.9534477Z [INFO] ---------------------< br.gov.caixa.sigec:gec-xml >---------------------
2026-11-16T14:16:37.9534880Z [INFO] Building GEC XML module 5.0.0-online-SNAPSHOT                      [2/8]
2026-11-16T14:16:37.9535207Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T14:16:38.4414787Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/arqref/arqref-web/3.1.0.1/arqref-web-3.1.0.1.pom
2026-11-16T14:16:38.6200267Z [WARNING] The POM for br.gov.caixa.arqref:arqref-web:jar:3.1.0.1 is missing, no dependency information available
2026-11-16T14:16:38.6271686Z [INFO] 
2026-11-16T14:16:38.6272407Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-xml ---
2026-11-16T14:16:38.6287910Z [INFO] Deleting /opt/ads-agent/_work/9/s/gec-xml/target
2026-11-16T14:16:39.1694296Z [INFO] 
2026-11-16T14:16:39.1695283Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-xml ---
2026-11-16T14:16:39.2242915Z [INFO] Copying 524 resources from src/main/resources to target/classes
2026-11-16T14:16:39.2597562Z [INFO] 
2026-11-16T14:16:39.2598125Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-xml ---
2026-11-16T14:16:39.4172254Z [INFO] Recompiling the module because of changed source code.
2026-11-16T14:16:39.4270859Z [INFO] Compiling 2368 source files with javac [debug parameters release 17] to target/classes
2026-11-16T14:16:44.9405464Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T14:16:44.9446820Z ##[warning] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(50,59): warning :  /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9454685Z ##[warning] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(51,53): warning :  /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9457257Z ##[warning] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(52,51): warning :  /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9459910Z ##[warning] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(75,60): warning :  /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9460549Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T14:16:44.9460833Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T14:16:44.9461045Z    - with linked exception:
2026-11-16T14:16:44.9461223Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-16T14:16:44.9461571Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T14:16:44.9461969Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9462377Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9463044Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9463571Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9465581Z ##[warning] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(76,53): warning :  /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9467733Z ##[warning] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(77,51): warning :  /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9468349Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9468751Z [WARNING] /opt/ads-agent/_work/9/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:16:44.9468951Z [INFO] 
2026-11-16T14:16:44.9469220Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-xml ---
2026-11-16T14:16:44.9469512Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-xml/src/test/resources
2026-11-16T14:16:44.9469702Z [INFO] 
2026-11-16T14:16:44.9469939Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-xml ---
2026-11-16T14:16:44.9470481Z [INFO] No sources to compile
2026-11-16T14:16:44.9470961Z [INFO] 
2026-11-16T14:16:44.9471212Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-xml ---
2026-11-16T14:16:45.0593767Z [INFO] Tests are skipped.
2026-11-16T14:16:45.0594053Z [INFO] 
2026-11-16T14:16:45.0594499Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-xml ---
2026-11-16T14:16:45.3534329Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-xml/target/gec-xml-5.0.0-online-SNAPSHOT.jar
2026-11-16T14:16:45.7242913Z [INFO] 
2026-11-16T14:16:45.7243431Z [INFO] --------------------< br.gov.caixa.sigec:gec-azure >--------------------
2026-11-16T14:16:45.7243960Z [INFO] Building GEC Azure module 5.0.0-online-SNAPSHOT                    [3/8]
2026-11-16T14:16:45.7244217Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T14:16:46.6974843Z [INFO] 
2026-11-16T14:16:46.6975413Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-azure ---
2026-11-16T14:16:46.7017139Z [INFO] Deleting /opt/ads-agent/_work/9/s/gec-azure/target
2026-11-16T14:16:46.7055658Z [INFO] 
2026-11-16T14:16:46.7056277Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-azure ---
2026-11-16T14:16:46.7056586Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-azure/src/main/resources
2026-11-16T14:16:46.7056757Z [INFO] 
2026-11-16T14:16:46.7057007Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-azure ---
2026-11-16T14:16:46.7090014Z [INFO] Recompiling the module because of changed source code.
2026-11-16T14:16:46.7093798Z [INFO] Compiling 3 source files with javac [debug parameters release 17] to target/classes
2026-11-16T14:16:47.3448986Z [INFO] 
2026-11-16T14:16:47.3449651Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-azure ---
2026-11-16T14:16:47.3450138Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-azure/src/test/resources
2026-11-16T14:16:47.3450311Z [INFO] 
2026-11-16T14:16:47.3450555Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-azure ---
2026-11-16T14:16:47.3553695Z [INFO] No sources to compile
2026-11-16T14:16:47.3553863Z [INFO] 
2026-11-16T14:16:47.3554144Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-azure ---
2026-11-16T14:16:47.3554328Z [INFO] Tests are skipped.
2026-11-16T14:16:47.3554465Z [INFO] 
2026-11-16T14:16:47.3554659Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-azure ---
2026-11-16T14:16:47.3555018Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-azure/target/gec-azure-5.0.0-online-SNAPSHOT.jar
2026-11-16T14:16:47.3555199Z [INFO] 
2026-11-16T14:16:47.3555427Z [INFO] -------------------< br.gov.caixa.sigec:gec-common >--------------------
2026-11-16T14:16:47.3555707Z [INFO] Building GEC Common module - DTOs e Interfaces Compartilhadas 5.0.0-online-SNAPSHOT [4/8]
2026-11-16T14:16:47.3555963Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-16T14:16:47.3774062Z [INFO] 
2026-11-16T14:16:47.3813940Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-common ---
2026-11-16T14:16:47.3814268Z [INFO] Deleting /opt/ads-agent/_work/9/s/gec-common/target
2026-11-16T14:16:47.3895492Z [INFO] 
2026-11-16T14:16:47.3895933Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-common ---
2026-11-16T14:16:47.3904752Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-common/src/main/resources
2026-11-16T14:16:47.3904991Z [INFO] 
2026-11-16T14:16:47.3905252Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-common ---
2026-11-16T14:16:47.3932414Z [INFO] Recompiling the module because of changed source code.
2026-11-16T14:16:47.3932969Z [INFO] Compiling 4 source files with javac [debug parameters release 17] to target/classes
2026-11-16T14:16:47.7907758Z [INFO] 
2026-11-16T14:16:47.7908334Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-common ---
2026-11-16T14:16:47.7921760Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-common/src/test/resources
2026-11-16T14:16:47.7921991Z [INFO] 
2026-11-16T14:16:47.7922251Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-common ---
2026-11-16T14:16:47.7939694Z [INFO] No sources to compile
2026-11-16T14:16:47.7939835Z [INFO] 
2026-11-16T14:16:47.7940195Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-common ---
2026-11-16T14:16:47.7946323Z [INFO] Tests are skipped.
2026-11-16T14:16:47.7946936Z [INFO] 
2026-11-16T14:16:47.7947307Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-common ---
2026-11-16T14:16:47.7967437Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-common/target/gec-common-5.0.0-online-SNAPSHOT.jar
2026-11-16T14:16:47.8003170Z [INFO] 
2026-11-16T14:16:47.8003570Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ejb >---------------------
2026-11-16T14:16:47.8003848Z [INFO] Building GEC EJB module 5.0.0-online-SNAPSHOT                      [5/8]
2026-11-16T14:16:47.8004194Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-11-16T14:16:49.4386991Z [INFO] 
2026-11-16T14:16:49.4388544Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ejb ---
2026-11-16T14:16:49.4391114Z [INFO] Deleting /opt/ads-agent/_work/9/s/gec-ejb/target
2026-11-16T14:16:49.6930621Z [INFO] 
2026-11-16T14:16:49.6931197Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ejb ---
2026-11-16T14:16:49.6948442Z [INFO] Copying 11 resources from src/main/resources to target/classes
2026-11-16T14:16:49.7531365Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-16T14:16:49.7532611Z [INFO] 
2026-11-16T14:16:49.7533762Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-ejb ---
2026-11-16T14:16:49.7971603Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T14:16:49.7985834Z [INFO] Compiling 1571 source files with javac [debug parameters release 17] to target/classes
2026-11-16T14:17:04.0014822Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T14:17:04.0015426Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T14:17:04.0015729Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T14:17:04.0016025Z    - with linked exception:
2026-11-16T14:17:04.0016204Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T14:17:04.0016531Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T14:17:04.0020136Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java(30,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-16T14:17:04.0025994Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java(12,1): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:04.0028593Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java(15,1): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:04.0030949Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(65,9): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-16T14:17:04.0033405Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(69,9): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-16T14:17:04.0035900Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(45,31): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0038209Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(111,39): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0040397Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java(72,10): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-16T14:17:04.0042937Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1228,101): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0045441Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1237,129): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0047801Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1241,135): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0050162Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1245,143): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0052417Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1249,142): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0054823Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1253,129): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0057685Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1546,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0059932Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1562,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0062226Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(729,62): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0063384Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-16T14:17:04.0063980Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:04.0064602Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:04.0065080Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-16T14:17:04.0065477Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-16T14:17:04.0065917Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0066291Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0066678Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-16T14:17:04.0066904Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T14:17:04.0067265Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0067678Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0068072Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0068462Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0068854Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0069236Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0069624Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0070002Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0070413Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0072773Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(2957,81): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0075204Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(3152,77): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0077460Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(4057,39): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0079737Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(555,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0082011Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(595,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0084686Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(624,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0087048Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(325,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0089371Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(341,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0091659Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java(580,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0094044Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(435,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0096264Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(474,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0098483Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(503,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0100885Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(309,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0103214Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(336,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0105602Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java(435,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0107776Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(422,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0110431Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(454,75): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0112730Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(472,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0114993Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(310,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0117248Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(337,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0119472Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java(455,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0121664Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(434,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0124053Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(473,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0126437Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(502,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0128736Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(317,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0130993Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(333,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0133345Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java(571,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0135681Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(192,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0137992Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(231,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0140366Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(260,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0142626Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(325,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0144966Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(342,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0147218Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java(632,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0149578Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(417,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0155822Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(447,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0158062Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(442,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0160495Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(470,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0163428Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java(460,59): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0165896Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(8,49): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0168904Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(9,47): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0171107Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(10,49): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-16T14:17:04.0174293Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(11,51): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0177262Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(457,29): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0179509Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(503,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0181890Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(550,40): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0184269Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java(362,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0187158Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java(445,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0189884Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java(513,24): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0192529Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(320,88): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0195092Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(545,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0197464Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(99,27): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-16T14:17:04.0199780Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(222,27): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-16T14:17:04.0202905Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java(89,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0205283Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(477,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0207835Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(521,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0210190Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(479,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0212571Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(517,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0215995Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(488,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0218412Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(526,48): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0220812Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(39,37): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0223509Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(40,37): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0225928Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(113,66): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0228577Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(114,66): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0231108Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(147,71): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0233981Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(149,41): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0236209Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(346,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0238852Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(347,58): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0241316Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(348,63): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0243984Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(350,33): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0246421Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(656,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0248648Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(657,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0251371Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(48,61): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0254162Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(61,66): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0256560Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(98,61): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0258873Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(134,61): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0261281Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(138,68): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0262107Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0262522Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0263016Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0263437Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0263915Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0264474Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0264885Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0265295Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0265726Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0266143Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0266604Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0267015Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0267435Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0267841Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0268258Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0268669Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0269089Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0269497Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0269899Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0270318Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0271330Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0271740Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0272177Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0272578Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0273137Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0273546Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0273957Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0274378Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0274826Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0275227Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0275627Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0276023Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0276449Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0276855Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0277262Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0278095Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0278497Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0278905Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0279291Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0279703Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0280096Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-16T14:17:04.0280494Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-16T14:17:04.0280908Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0281317Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0281724Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0282129Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0282572Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0283107Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0283552Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0283990Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0284521Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-16T14:17:04.0284754Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T14:17:04.0285091Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-16T14:17:04.0285315Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-16T14:17:04.0285715Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0286168Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0286608Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0287062Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0287551Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0287993Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0288426Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:04.0288850Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0289280Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0289710Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0290195Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0290650Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0291510Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0291928Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0292351Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0292855Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0293289Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0293710Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0294155Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0294574Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0295033Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0295450Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0295878Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0296300Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0298762Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(143,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0301418Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(144,45): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0303907Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(145,51): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0306337Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java(710,55): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0308955Z ##[warning] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java(109,43): warning :  /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0309711Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0310148Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0310580Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0311017Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0311450Z [WARNING] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-16T14:17:04.0311875Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Some input files use or override a deprecated API.
2026-11-16T14:17:04.0312268Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Recompile with -Xlint:deprecation for details.
2026-11-16T14:17:04.0312869Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-16T14:17:04.0313283Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Some input files use unchecked or unsafe operations.
2026-11-16T14:17:04.0313650Z [INFO] /opt/ads-agent/_work/9/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Recompile with -Xlint:unchecked for details.
2026-11-16T14:17:04.0313847Z [INFO] 
2026-11-16T14:17:04.0314092Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-ejb ---
2026-11-16T14:17:04.0314372Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-ejb/src/test/resources
2026-11-16T14:17:04.0314614Z [INFO] 
2026-11-16T14:17:04.0314921Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-ejb ---
2026-11-16T14:17:04.0315192Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T14:17:04.0315476Z [INFO] Compiling 7 source files with javac [debug parameters release 17] to target/test-classes
2026-11-16T14:17:04.5099630Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T14:17:04.5099953Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T14:17:04.5100240Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T14:17:04.5100495Z    - with linked exception:
2026-11-16T14:17:04.5100636Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T14:17:04.5100992Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T14:17:04.5101349Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.jboss.logging.processor.apt.LoggingToolsProcessor' less than -source '17'
2026-11-16T14:17:04.5101561Z [INFO] 
2026-11-16T14:17:04.5101949Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-ejb ---
2026-11-16T14:17:04.5117123Z [INFO] Tests are skipped.
2026-11-16T14:17:04.5117552Z [INFO] 
2026-11-16T14:17:04.5117933Z [INFO] --- maven-ejb-plugin:3.0.1:ejb (default-ejb) @ gec-ejb ---
2026-11-16T14:17:04.8208670Z [INFO] Building EJB gec-ejb-5.0.0-online-SNAPSHOT with EJB version 3.1
2026-11-16T14:17:04.9192464Z [INFO] Building jar: /opt/ads-agent/_work/9/s/gec-ejb/target/gec-ejb-5.0.0-online-SNAPSHOT.jar
2026-11-16T14:17:05.0491800Z [INFO] 
2026-11-16T14:17:05.0492773Z [INFO] ---------------------< br.gov.caixa.sigec:gec-web >---------------------
2026-11-16T14:17:05.0493223Z [INFO] Building GEC Web module 5.0.0-online-SNAPSHOT                      [6/8]
2026-11-16T14:17:05.0493471Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-16T14:17:05.1669949Z [INFO] 
2026-11-16T14:17:05.1670636Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-web ---
2026-11-16T14:17:05.1673601Z [INFO] Deleting /opt/ads-agent/_work/9/s/gec-web/target
2026-11-16T14:17:05.1700224Z [INFO] 
2026-11-16T14:17:05.1700769Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (jacoco-prepare-agent) @ gec-web ---
2026-11-16T14:17:05.1917540Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9/s/gec-web/target/jacoco.exec
2026-11-16T14:17:05.1918030Z [INFO] 
2026-11-16T14:17:05.1918443Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-web ---
2026-11-16T14:17:05.1929757Z [INFO] Copying 2 resources from src/main/resources to target/classes
2026-11-16T14:17:05.1983648Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-16T14:17:05.1984034Z [INFO] 
2026-11-16T14:17:05.1984296Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-web ---
2026-11-16T14:17:05.2033550Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T14:17:05.2036946Z [INFO] Compiling 124 source files with javac [debug parameters release 17] to target/classes
2026-11-16T14:17:05.9761425Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T14:17:05.9765944Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java(121,47): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:05.9768594Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(140,17): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-16T14:17:05.9770937Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(151,17): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-16T14:17:05.9773690Z ##[warning] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(162,17): warning :  /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-16T14:17:05.9774349Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T14:17:05.9774639Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T14:17:05.9774821Z    - with linked exception:
2026-11-16T14:17:05.9774998Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-16T14:17:05.9775326Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T14:17:05.9775720Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:05.9776098Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-16T14:17:05.9776492Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-16T14:17:05.9776986Z [WARNING] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-16T14:17:05.9777339Z [INFO] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Some input files use or override a deprecated API.
2026-11-16T14:17:05.9777710Z [INFO] /opt/ads-agent/_work/9/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Recompile with -Xlint:deprecation for details.
2026-11-16T14:17:05.9777982Z [INFO] 
2026-11-16T14:17:05.9778236Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-web ---
2026-11-16T14:17:05.9778517Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-web/src/test/resources
2026-11-16T14:17:05.9778675Z [INFO] 
2026-11-16T14:17:05.9778937Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-web ---
2026-11-16T14:17:05.9784776Z [INFO] No sources to compile
2026-11-16T14:17:05.9784911Z [INFO] 
2026-11-16T14:17:05.9785152Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-web ---
2026-11-16T14:17:05.9894079Z [INFO] No tests to run.
2026-11-16T14:17:05.9932074Z [INFO] 
2026-11-16T14:17:05.9932423Z [INFO] --- jacoco-maven-plugin:0.8.12:report (jacoco-report) @ gec-web ---
2026-11-16T14:17:05.9946686Z [INFO] Skipping JaCoCo execution due to missing execution data file.
2026-11-16T14:17:05.9947970Z [INFO] 
2026-11-16T14:17:05.9948224Z [INFO] --- maven-war-plugin:3.4.0:war (default-war) @ gec-web ---
2026-11-16T14:17:06.1590872Z [INFO] Packaging webapp
2026-11-16T14:17:06.1613804Z [INFO] Assembling webapp [gec-web] in [/opt/ads-agent/_work/9/s/gec-web/target/gec-web-5.0.0-online-SNAPSHOT]
2026-11-16T14:17:06.1646395Z [INFO] Processing war project
2026-11-16T14:17:06.1647966Z [INFO] Copying webapp webResources [/opt/ads-agent/_work/9/s/gec-web/src/main/webapp] to [/opt/ads-agent/_work/9/s/gec-web/target/gec-web-5.0.0-online-SNAPSHOT]
2026-11-16T14:17:06.1957122Z [INFO] Copying webapp resources [/opt/ads-agent/_work/9/s/gec-web/src/main/webapp]
2026-11-16T14:17:07.0992797Z [INFO] Building war: /opt/ads-agent/_work/9/s/gec-web/target/gec-web-5.0.0-online-SNAPSHOT.war
2026-11-16T14:17:07.5020732Z [INFO] 
2026-11-16T14:17:07.5021292Z [INFO] ---------------------< br.gov.caixa.sigec:gec-api >---------------------
2026-11-16T14:17:07.5022551Z [INFO] Building SIGEC PORTABILIDADE 5.0.0-online-SNAPSHOT                 [7/8]
2026-11-16T14:17:07.5022891Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-16T14:17:07.7205753Z [INFO] 
2026-11-16T14:17:07.7207589Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-api ---
2026-11-16T14:17:07.7209509Z [INFO] 
2026-11-16T14:17:07.7209846Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-api ---
2026-11-16T14:17:07.7228314Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-16T14:17:07.7238978Z [INFO] Copying 36 resources from src/main/webapp to target/classes
2026-11-16T14:17:15.9310866Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-16T14:17:15.9311287Z [INFO] 
2026-11-16T14:17:15.9311578Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-api ---
2026-11-16T14:17:15.9369810Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T14:17:15.9377734Z [INFO] Compiling 133 source files with javac [debug parameters release 17] to target/classes
2026-11-16T14:17:17.2800521Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2800893Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T14:17:17.2801194Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2801535Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2802173Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T14:17:17.2802529Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T14:17:17.2803053Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T14:17:17.2803588Z    - with linked exception:
2026-11-16T14:17:17.2803840Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T14:17:17.2804431Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T14:17:17.2811366Z ##[warning] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV3.java(90,1): warning :  /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV3.java:[90,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:17.2814526Z ##[warning] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV2.java(85,1): warning :  /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV2.java:[85,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:17.2817369Z ##[warning] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PessoasFisicasCreditoConsignadoRestV3.java(45,1): warning :  /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PessoasFisicasCreditoConsignadoRestV3.java:[45,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:17.2820532Z ##[warning] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java(404,63): warning :  /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[404,63] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:17.2822984Z ##[warning] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java(414,71): warning :  /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[414,71] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:17.2823959Z [WARNING] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV3.java:[90,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:17.2824576Z [WARNING] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRestV2.java:[85,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:17.2825212Z [WARNING] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PessoasFisicasCreditoConsignadoRestV3.java:[45,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-16T14:17:17.2825551Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2825754Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T14:17:17.2826020Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2826225Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2827001Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2827192Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T14:17:17.2827388Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2827584Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2827794Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2827950Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T14:17:17.2828146Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2828339Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2828538Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2828729Z   reason: class file for org.hibernate.annotations.LazyCollectionOption not found
2026-11-16T14:17:17.2828915Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2829154Z [WARNING] unknown enum constant org.hibernate.annotations.LazyCollectionOption.FALSE
2026-11-16T14:17:17.2829540Z [WARNING] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[404,63] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:17.2829998Z [WARNING] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/portabilidade/PortabilidadeCreditoConsignadoBaseRest.java:[414,71] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-16T14:17:17.2830364Z [INFO] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/JaxRsActivator.java: Some input files use or override a deprecated API.
2026-11-16T14:17:17.2830731Z [INFO] /opt/ads-agent/_work/9/s/gec-api/src/main/java/br/gov/caixa/api/JaxRsActivator.java: Recompile with -Xlint:deprecation for details.
2026-11-16T14:17:17.2831208Z [INFO] 
2026-11-16T14:17:17.2831463Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-api ---
2026-11-16T14:17:17.2831742Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-api/src/test/resources
2026-11-16T14:17:17.2831907Z [INFO] 
2026-11-16T14:17:17.2832153Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-api ---
2026-11-16T14:17:17.2832448Z [INFO] Recompiling the module because of changed dependency.
2026-11-16T14:17:17.2832839Z [INFO] Compiling 1 source file with javac [debug parameters release 17] to target/test-classes
2026-11-16T14:17:17.5288055Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-16T14:17:17.5288388Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-16T14:17:17.5288684Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-16T14:17:17.5288913Z    - with linked exception:
2026-11-16T14:17:17.5289109Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-16T14:17:17.5289459Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-16T14:17:17.5289700Z [INFO] 
2026-11-16T14:17:17.5289941Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-api ---
2026-11-16T14:17:17.5303370Z [INFO] Tests are skipped.
2026-11-16T14:17:17.5303934Z [INFO] 
2026-11-16T14:17:17.5304141Z [INFO] --- maven-war-plugin:3.4.0:war (default-war) @ gec-api ---
2026-11-16T14:17:17.5311182Z [INFO] Packaging webapp
2026-11-16T14:17:17.5312387Z [INFO] Assembling webapp [gec-api] in [/opt/ads-agent/_work/9/s/gec-api/target/gec-api]
2026-11-16T14:17:17.5315841Z [INFO] Processing war project
2026-11-16T14:17:17.5316707Z [INFO] Copying webapp resources [/opt/ads-agent/_work/9/s/gec-api/src/main/webapp]
2026-11-16T14:17:17.6897689Z [INFO] Building war: /opt/ads-agent/_work/9/s/gec-api/target/gec-api.war
2026-11-16T14:17:18.6681582Z [INFO] 
2026-11-16T14:17:18.6682304Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ear >---------------------
2026-11-16T14:17:18.6682898Z [INFO] Building GEC EAR module 5.0.0-online-SNAPSHOT                      [8/8]
2026-11-16T14:17:18.6683258Z [INFO] --------------------------------[ ear ]---------------------------------
2026-11-16T14:17:18.7401981Z [INFO] 
2026-11-16T14:17:18.7402920Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ear ---
2026-11-16T14:17:18.7405951Z [INFO] 
2026-11-16T14:17:18.7406451Z [INFO] --- maven-ear-plugin:3.3.0:generate-application-xml (default-generate-application-xml) @ gec-ear ---
2026-11-16T14:17:18.8441232Z [INFO] Generating application.xml
2026-11-16T14:17:18.8534687Z [INFO] 
2026-11-16T14:17:18.8535372Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ear ---
2026-11-16T14:17:18.8542589Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9/s/gec-ear/src/main/resources
2026-11-16T14:17:18.8543124Z [INFO] 
2026-11-16T14:17:18.8543383Z [INFO] --- maven-ear-plugin:3.3.0:ear (default-ear) @ gec-ear ---
2026-11-16T14:17:18.8615400Z [INFO] Copying artifact [ejb:br.gov.caixa.sigec:gec-ejb:5.0.0-online-SNAPSHOT] to [gec-ejb.jar]
2026-11-16T14:17:18.8886478Z [INFO] Copying artifact [war:br.gov.caixa.sigec:gec-web:5.0.0-online-SNAPSHOT] to [gec-web.war]
2026-11-16T14:17:18.8947445Z [INFO] Copying artifact [war:br.gov.caixa.sigec:gec-api:5.0.0-online-SNAPSHOT] to [gec-api.war]
2026-11-16T14:17:18.9090176Z [INFO] Copying artifact [jar:br.gov.caixa.sigec:gec-azure:5.0.0-online-SNAPSHOT] to [lib/br.gov.caixa.sigec-gec-azure-5.0.0-online-SNAPSHOT.jar]
2026-11-16T14:17:18.9091357Z [INFO] Copying artifact [jar:br.gov.caixa.sigec:gec-common:5.0.0-online-SNAPSHOT] to [lib/br.gov.caixa.sigec-gec-common-5.0.0-online-SNAPSHOT.jar]
2026-11-16T14:17:18.9092802Z [INFO] Copying artifact [jar:br.gov.caixa.arqref:arqref-core:3.7.2.2] to [lib/br.gov.caixa.arqref-arqref-core-3.7.2.2.jar]
2026-11-16T14:17:18.9095731Z [INFO] Copying artifact [jar:net.sf.jasperreports:jasperreports:6.6.0] to [lib/net.sf.jasperreports-jasperreports-6.6.0.jar]
2026-11-16T14:17:18.9148493Z [INFO] Copying artifact [jar:com.github.librepdf:openpdf:1.3.43] to [lib/com.github.librepdf-openpdf-1.3.43.jar]
2026-11-16T14:17:19.0233447Z [INFO] Copying artifact [jar:org.apache.velocity:velocity-engine-core:2.3] to [lib/org.apache.velocity-velocity-engine-core-2.3.jar]
2026-11-16T14:17:19.0258498Z [INFO] Copying artifact [jar:org.apache.velocity:velocity-tools:2.0] to [lib/org.apache.velocity-velocity-tools-2.0.jar]
2026-11-16T14:17:19.0340386Z [INFO] Copying artifact [jar:commons-chain:commons-chain:1.1] to [lib/commons-chain-commons-chain-1.1.jar]
2026-11-16T14:17:19.0435678Z [INFO] Copying artifact [jar:commons-validator:commons-validator:1.3.1] to [lib/commons-validator-commons-validator-1.3.1.jar]
2026-11-16T14:17:19.0437557Z [INFO] Copying artifact [jar:oro:oro:2.0.8] to [lib/oro-oro-2.0.8.jar]
2026-11-16T14:17:19.0466372Z [INFO] Copying artifact [jar:sslext:sslext:1.2-0] to [lib/sslext-sslext-1.2-0.jar]
2026-11-16T14:17:19.0467844Z [INFO] Copying artifact [jar:org.apache.struts:struts-core:1.3.8] to [lib/org.apache.struts-struts-core-1.3.8.jar]
2026-11-16T14:17:19.0615248Z [INFO] Copying artifact [jar:antlr:antlr:2.7.2] to [lib/antlr-antlr-2.7.2.jar]
2026-11-16T14:17:19.0618867Z [INFO] Copying artifact [jar:org.apache.struts:struts-taglib:1.3.8] to [lib/org.apache.struts-struts-taglib-1.3.8.jar]
2026-11-16T14:17:19.0631052Z [INFO] Copying artifact [jar:org.apache.struts:struts-tiles:1.3.8] to [lib/org.apache.struts-struts-tiles-1.3.8.jar]
2026-11-16T14:17:19.0641216Z [INFO] Copying artifact [jar:org.apache.velocity:velocity:1.6.2] to [lib/org.apache.velocity-velocity-1.6.2.jar]
2026-11-16T14:17:19.0733794Z [INFO] Copying artifact [jar:commons-lang:commons-lang:2.4] to [lib/commons-lang-commons-lang-2.4.jar]
2026-11-16T14:17:19.0735844Z [INFO] Copying artifact [jar:io.jsonwebtoken:jjwt-api:0.11.1] to [lib/io.jsonwebtoken-jjwt-api-0.11.1.jar]
2026-11-16T14:17:19.0737623Z [INFO] Copying artifact [jar:io.jsonwebtoken:jjwt-impl:0.11.1] to [lib/io.jsonwebtoken-jjwt-impl-0.11.1.jar]
2026-11-16T14:17:19.0738942Z [INFO] Copying artifact [jar:io.jsonwebtoken:jjwt-jackson:0.11.1] to [lib/io.jsonwebtoken-jjwt-jackson-0.11.1.jar]
2026-11-16T14:17:19.0740091Z [INFO] Copying artifact [jar:com.auth0:java-jwt:4.4.0] to [lib/com.auth0-java-jwt-4.4.0.jar]
2026-11-16T14:17:19.0742041Z [INFO] Copying artifact [jar:com.fasterxml.jackson.core:jackson-annotations:2.15.4] to [lib/com.fasterxml.jackson.core-jackson-annotations-2.15.4.jar]
2026-11-16T14:17:19.0743555Z [INFO] Copying artifact [jar:com.fasterxml.jackson.core:jackson-core:2.15.4] to [lib/com.fasterxml.jackson.core-jackson-core-2.15.4.jar]
2026-11-16T14:17:19.0748383Z [INFO] Copying artifact [jar:com.fasterxml.jackson.core:jackson-databind:2.15.4] to [lib/com.fasterxml.jackson.core-jackson-databind-2.15.4.jar]
2026-11-16T14:17:19.0757753Z [INFO] Copying artifact [jar:com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.15.4] to [lib/com.fasterxml.jackson.dataformat-jackson-dataformat-yaml-2.15.4.jar]
2026-11-16T14:17:19.0759651Z [INFO] Copying artifact [jar:com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.15.4] to [lib/com.fasterxml.jackson.dataformat-jackson-dataformat-xml-2.15.4.jar]
2026-11-16T14:17:19.0761595Z [INFO] Copying artifact [jar:org.codehaus.woodstox:stax2-api:4.2.1] to [lib/org.codehaus.woodstox-stax2-api-4.2.1.jar]
2026-11-16T14:17:19.0763799Z [INFO] Copying artifact [jar:com.fasterxml.woodstox:woodstox-core:6.5.1] to [lib/com.fasterxml.woodstox-woodstox-core-6.5.1.jar]
2026-11-16T14:17:19.0772994Z [INFO] Copying artifact [jar:com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.15.4] to [lib/com.fasterxml.jackson.datatype-jackson-datatype-jsr310-2.15.4.jar]
2026-11-16T14:17:19.0775025Z [INFO] Copying artifact [jar:br.gov.caixa.sigec:gec-xml:5.0.0-online-SNAPSHOT] to [lib/br.gov.caixa.sigec-gec-xml-5.0.0-online-SNAPSHOT.jar]
2026-11-16T14:17:19.0794410Z [INFO] Copying artifact [jar:com.azure:azure-messaging-servicebus:7.15.0] to [lib/com.azure-azure-messaging-servicebus-7.15.0.jar]
2026-11-16T14:17:19.0798468Z [INFO] Copying artifact [jar:com.azure:azure-core:1.45.1] to [lib/com.azure-azure-core-1.45.1.jar]
2026-11-16T14:17:19.0804186Z [INFO] Copying artifact [jar:io.projectreactor:reactor-core:3.4.34] to [lib/io.projectreactor-reactor-core-3.4.34.jar]
2026-11-16T14:17:19.0813979Z [INFO] Copying artifact [jar:org.reactivestreams:reactive-streams:1.0.4] to [lib/org.reactivestreams-reactive-streams-1.0.4.jar]
2026-11-16T14:17:19.0814839Z [INFO] Copying artifact [jar:com.azure:azure-core-amqp:2.9.0] to [lib/com.azure-azure-core-amqp-2.9.0.jar]
2026-11-16T14:17:19.0818346Z [INFO] Copying artifact [jar:com.microsoft.azure:qpid-proton-j-extensions:1.2.4] to [lib/com.microsoft.azure-qpid-proton-j-extensions-1.2.4.jar]
2026-11-16T14:17:19.0835709Z [INFO] Copying artifact [jar:org.apache.qpid:proton-j:0.33.8] to [lib/org.apache.qpid-proton-j-0.33.8.jar]
2026-11-16T14:17:19.0972530Z [INFO] Copying artifact [jar:com.azure:azure-core-http-netty:1.13.11] to [lib/com.azure-azure-core-http-netty-1.13.11.jar]
2026-11-16T14:17:19.0974574Z [INFO] Copying artifact [jar:io.netty:netty-handler:4.1.101.Final] to [lib/io.netty-netty-handler-4.1.101.Final.jar]
2026-11-16T14:17:19.0978252Z [INFO] Copying artifact [jar:io.netty:netty-resolver:4.1.101.Final] to [lib/io.netty-netty-resolver-4.1.101.Final.jar]
2026-11-16T14:17:19.0979527Z [INFO] Copying artifact [jar:io.netty:netty-transport:4.1.101.Final] to [lib/io.netty-netty-transport-4.1.101.Final.jar]
2026-11-16T14:17:19.0983360Z [INFO] Copying artifact [jar:io.netty:netty-handler-proxy:4.1.101.Final] to [lib/io.netty-netty-handler-proxy-4.1.101.Final.jar]
2026-11-16T14:17:19.0984736Z [INFO] Copying artifact [jar:io.netty:netty-codec-socks:4.1.101.Final] to [lib/io.netty-netty-codec-socks-4.1.101.Final.jar]
2026-11-16T14:17:19.0987283Z [INFO] Copying artifact [jar:io.netty:netty-buffer:4.1.101.Final] to [lib/io.netty-netty-buffer-4.1.101.Final.jar]
2026-11-16T14:17:19.0989108Z [INFO] Copying artifact [jar:io.netty:netty-codec:4.1.101.Final] to [lib/io.netty-netty-codec-4.1.101.Final.jar]
2026-11-16T14:17:19.0992071Z [INFO] Copying artifact [jar:io.netty:netty-codec-http:4.1.101.Final] to [lib/io.netty-netty-codec-http-4.1.101.Final.jar]
2026-11-16T14:17:19.0996735Z [INFO] Copying artifact [jar:io.netty:netty-codec-http2:4.1.101.Final] to [lib/io.netty-netty-codec-http2-4.1.101.Final.jar]
2026-11-16T14:17:19.1000508Z [INFO] Copying artifact [jar:io.netty:netty-transport-native-unix-common:4.1.101.Final] to [lib/io.netty-netty-transport-native-unix-common-4.1.101.Final.jar]
2026-11-16T14:17:19.1001991Z [INFO] Copying artifact [jar:io.netty:netty-transport-native-epoll:linux-x86_64:4.1.101.Final] to [lib/io.netty-netty-transport-native-epoll-4.1.101.Final-linux-x86_64.jar]
2026-11-16T14:17:19.1003214Z [INFO] Copying artifact [jar:io.netty:netty-transport-classes-epoll:4.1.101.Final] to [lib/io.netty-netty-transport-classes-epoll-4.1.101.Final.jar]
2026-11-16T14:17:19.1005219Z [INFO] Copying artifact [jar:io.netty:netty-transport-native-kqueue:osx-x86_64:4.1.101.Final] to [lib/io.netty-netty-transport-native-kqueue-4.1.101.Final-osx-x86_64.jar]
2026-11-16T14:17:19.1006453Z [INFO] Copying artifact [jar:io.netty:netty-transport-classes-kqueue:4.1.101.Final] to [lib/io.netty-netty-transport-classes-kqueue-4.1.101.Final.jar]
2026-11-16T14:17:19.1007794Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final.jar]
2026-11-16T14:17:19.1008851Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-classes:2.0.62.Final] to [lib/io.netty-netty-tcnative-classes-2.0.62.Final.jar]
2026-11-16T14:17:19.1010182Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:linux-x86_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-linux-x86_64.jar]
2026-11-16T14:17:19.1017707Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:linux-aarch_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-linux-aarch_64.jar]
2026-11-16T14:17:19.1024875Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:osx-x86_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-osx-x86_64.jar]
2026-11-16T14:17:19.1032018Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:osx-aarch_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-osx-aarch_64.jar]
2026-11-16T14:17:19.1040259Z [INFO] Copying artifact [jar:io.netty:netty-tcnative-boringssl-static:windows-x86_64:2.0.62.Final] to [lib/io.netty-netty-tcnative-boringssl-static-2.0.62.Final-windows-x86_64.jar]
2026-11-16T14:17:19.1047493Z [INFO] Copying artifact [jar:io.projectreactor.netty:reactor-netty-http:1.0.39] to [lib/io.projectreactor.netty-reactor-netty-http-1.0.39.jar]
2026-11-16T14:17:19.1075208Z [INFO] Copying artifact [jar:io.netty:netty-resolver-dns:4.1.101.Final] to [lib/io.netty-netty-resolver-dns-4.1.101.Final.jar]
2026-11-16T14:17:19.1077754Z [INFO] Copying artifact [jar:io.netty:netty-codec-dns:4.1.101.Final] to [lib/io.netty-netty-codec-dns-4.1.101.Final.jar]
2026-11-16T14:17:19.1079507Z [INFO] Copying artifact [jar:io.netty:netty-resolver-dns-native-macos:osx-x86_64:4.1.101.Final] to [lib/io.netty-netty-resolver-dns-native-macos-4.1.101.Final-osx-x86_64.jar]
2026-11-16T14:17:19.1080683Z [INFO] Copying artifact [jar:io.netty:netty-resolver-dns-classes-macos:4.1.101.Final] to [lib/io.netty-netty-resolver-dns-classes-macos-4.1.101.Final.jar]
2026-11-16T14:17:19.1082147Z [INFO] Copying artifact [jar:io.projectreactor.netty:reactor-netty-core:1.0.39] to [lib/io.projectreactor.netty-reactor-netty-core-1.0.39.jar]
2026-11-16T14:17:19.1216192Z [INFO] Copying artifact [jar:io.netty:netty-common:4.1.101.Final] to [lib/io.netty-netty-common-4.1.101.Final.jar]
2026-11-16T14:17:19.1220838Z [INFO] Copying artifact [jar:com.azure:azure-identity:1.13.3] to [lib/com.azure-azure-identity-1.13.3.jar]
2026-11-16T14:17:19.1223738Z [INFO] Copying artifact [jar:com.azure:azure-json:1.3.0] to [lib/com.azure-azure-json-1.3.0.jar]
2026-11-16T14:17:19.1226317Z [INFO] Copying artifact [jar:com.microsoft.azure:msal4j:1.17.1] to [lib/com.microsoft.azure-msal4j-1.17.1.jar]
2026-11-16T14:17:19.1244520Z [INFO] Copying artifact [jar:com.nimbusds:oauth2-oidc-sdk:11.18] to [lib/com.nimbusds-oauth2-oidc-sdk-11.18.jar]
2026-11-16T14:17:19.1250465Z [INFO] Copying artifact [jar:com.github.stephenc.jcip:jcip-annotations:1.0-1] to [lib/com.github.stephenc.jcip-jcip-annotations-1.0-1.jar]
2026-11-16T14:17:19.1251594Z [INFO] Copying artifact [jar:com.nimbusds:content-type:2.3] to [lib/com.nimbusds-content-type-2.3.jar]
2026-11-16T14:17:19.1252825Z [INFO] Copying artifact [jar:com.nimbusds:lang-tag:1.7] to [lib/com.nimbusds-lang-tag-1.7.jar]
2026-11-16T14:17:19.1253982Z [INFO] Copying artifact [jar:com.nimbusds:nimbus-jose-jwt:9.40] to [lib/com.nimbusds-nimbus-jose-jwt-9.40.jar]
2026-11-16T14:17:19.1259446Z [INFO] Copying artifact [jar:net.minidev:json-smart:2.5.0] to [lib/net.minidev-json-smart-2.5.0.jar]
2026-11-16T14:17:19.1271699Z [INFO] Copying artifact [jar:net.minidev:accessors-smart:2.5.0] to [lib/net.minidev-accessors-smart-2.5.0.jar]
2026-11-16T14:17:19.1279179Z [INFO] Copying artifact [jar:org.ow2.asm:asm:9.3] to [lib/org.ow2.asm-asm-9.3.jar]
2026-11-16T14:17:19.1308113Z [INFO] Copying artifact [jar:com.microsoft.azure:msal4j-persistence-extension:1.3.0] to [lib/com.microsoft.azure-msal4j-persistence-extension-1.3.0.jar]
2026-11-16T14:17:19.1339751Z [INFO] Copying artifact [jar:net.java.dev.jna:jna:5.13.0] to [lib/net.java.dev.jna-jna-5.13.0.jar]
2026-11-16T14:17:19.1402741Z [INFO] Copying artifact [jar:net.java.dev.jna:jna-platform:5.6.0] to [lib/net.java.dev.jna-jna-platform-5.6.0.jar]
2026-11-16T14:17:19.1472361Z [INFO] Copying artifact [jar:com.google.code.gson:gson:2.10.1] to [lib/com.google.code.gson-gson-2.10.1.jar]
2026-11-16T14:17:19.1481619Z [INFO] Copying artifact [jar:org.jboss.shrinkwrap:shrinkwrap-api:1.0.1] to [lib/org.jboss.shrinkwrap-shrinkwrap-api-1.0.1.jar]
2026-11-16T14:17:19.1483368Z [INFO] Copying artifact [jar:org.freemarker:freemarker:2.3.23] to [lib/org.freemarker-freemarker-2.3.23.jar]
2026-11-16T14:17:19.1491265Z [INFO] Copying artifact [jar:javax.mail:mail:1.4.7] to [lib/javax.mail-mail-1.4.7.jar]
2026-11-16T14:17:19.1495219Z [INFO] Copying artifact [jar:javax.activation:activation:1.1] to [lib/javax.activation-activation-1.1.jar]
2026-11-16T14:17:19.1496907Z [INFO] Copying artifact [jar:commons-beanutils:commons-beanutils:1.9.2] to [lib/commons-beanutils-commons-beanutils-1.9.2.jar]
2026-11-16T14:17:19.1499558Z [INFO] Copying artifact [jar:org.yaml:snakeyaml:2.2] to [lib/org.yaml-snakeyaml-2.2.jar]
2026-11-16T14:17:19.1502537Z [INFO] Copying artifact [jar:org.slf4j:slf4j-api:2.0.9] to [lib/org.slf4j-slf4j-api-2.0.9.jar]
2026-11-16T14:17:19.1503883Z [INFO] Copying artifact [jar:com.squareup.okhttp3:okhttp:4.10.0] to [lib/com.squareup.okhttp3-okhttp-4.10.0.jar]
2026-11-16T14:17:19.1654186Z [INFO] Copying artifact [jar:com.squareup.okio:okio-jvm:3.0.0] to [lib/com.squareup.okio-okio-jvm-3.0.0.jar]
2026-11-16T14:17:19.1726934Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.31] to [lib/org.jetbrains.kotlin-kotlin-stdlib-jdk8-1.5.31.jar]
2026-11-16T14:17:19.1735242Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.31] to [lib/org.jetbrains.kotlin-kotlin-stdlib-jdk7-1.5.31.jar]
2026-11-16T14:17:19.1775827Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib-common:1.5.31] to [lib/org.jetbrains.kotlin-kotlin-stdlib-common-1.5.31.jar]
2026-11-16T14:17:19.1824605Z [INFO] Copying artifact [jar:org.jetbrains.kotlin:kotlin-stdlib:1.6.20] to [lib/org.jetbrains.kotlin-kotlin-stdlib-1.6.20.jar]
2026-11-16T14:17:19.1919355Z [INFO] Copying artifact [jar:org.jetbrains:annotations:13.0] to [lib/org.jetbrains-annotations-13.0.jar]
2026-11-16T14:17:19.1926099Z [INFO] Copying artifact [jar:commons-digester:commons-digester:2.1] to [lib/commons-digester-commons-digester-2.1.jar]
2026-11-16T14:17:19.1941158Z [INFO] Copying artifact [jar:commons-logging:commons-logging:1.1.1] to [lib/commons-logging-commons-logging-1.1.1.jar]
2026-11-16T14:17:19.1942994Z [INFO] Copying artifact [jar:org.jfree:jcommon:1.0.23] to [lib/org.jfree-jcommon-1.0.23.jar]
2026-11-16T14:17:19.1967184Z [INFO] Copying artifact [jar:com.ibm.icu:icu4j:57.1] to [lib/com.ibm.icu-icu4j-57.1.jar]
2026-11-16T14:17:19.2994923Z [INFO] Copy ear sources to /opt/ads-agent/_work/9/s/gec-ear/target/gec-ear-5.0.0-online-SNAPSHOT
2026-11-16T14:17:19.3053996Z [INFO] Building ear: /opt/ads-agent/_work/9/s/gec-ear/target/gec-ear-5.0.0-online-SNAPSHOT.ear
2026-11-16T14:17:20.3686943Z [INFO] ------------------------------------------------------------------------
2026-11-16T14:17:20.3687293Z [INFO] Reactor Summary for SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT:
2026-11-16T14:17:20.3687452Z [INFO] 
2026-11-16T14:17:20.3687681Z [INFO] SIGEC-PORTABILIDADE ................................ SUCCESS [  0.055 s]
2026-11-16T14:17:20.3688352Z [INFO] GEC XML module ..................................... SUCCESS [  7.769 s]
2026-11-16T14:17:20.3688815Z [INFO] GEC Azure module ................................... SUCCESS [  1.629 s]
2026-11-16T14:17:20.3689351Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas SUCCESS [  0.448 s]
2026-11-16T14:17:20.3689918Z [INFO] GEC EJB module ..................................... SUCCESS [ 17.249 s]
2026-11-16T14:17:20.3690507Z [INFO] GEC Web module ..................................... SUCCESS [  2.453 s]
2026-11-16T14:17:20.3691402Z [INFO] SIGEC PORTABILIDADE ................................ SUCCESS [ 11.166 s]
2026-11-16T14:17:20.3692203Z [INFO] GEC EAR module ..................................... SUCCESS [  1.700 s]
2026-11-16T14:17:20.3692467Z [INFO] ------------------------------------------------------------------------
2026-11-16T14:17:20.3692634Z [INFO] BUILD SUCCESS
2026-11-16T14:17:20.3692939Z [INFO] ------------------------------------------------------------------------
2026-11-16T14:17:20.3693235Z [INFO] Total time:  42.550 s
2026-11-16T14:17:20.3694913Z [INFO] Finished at: 2026-11-16T11:17:20-03:00
2026-11-16T14:17:20.3695177Z [INFO] ------------------------------------------------------------------------
2026-11-16T14:17:20.5515836Z ##[section]Finishing: Maven



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

SIGEC

SIGEC-portabilidade

Tasks

Variables

Triggers

Options

History
Predefined variables
system.collectionId
7b4c9d5c-b041-4798-8dcb-fb11786a173b
system.debug
false

system.definitionId
6648
system.teamProject
Caixa
version.app

Showing 12 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 12 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 12 filtered items.

Get started and run this pipeline for the first time!


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

SIGEC

SIGEC-portabilidade

Tasks

Variables

Triggers

Options

History
Predefined variables
BUILD_VARIABLES (60)
Variáveis disponíveis para todas as builds.
ANSIBLE_INVENTORY
$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/hosts
ANSIBLE_VAULT
********
AZPAT
********
AZUSER
s736639
DIR_ANSIBLE
esteira-qa
DOTNET_TESTARGS
--configuration Release --collect "code coverage"
FORTIFY_API
https://novocodigoseguro.caixa/ssc/api/v1
FORTIFY_APITOKEN
********
FORTIFY_BUILD_FILE
.
FORTIFY_CI_TOKEN
********
FORTIFY_CLIENT_AUTH_TOKEN
********
FORTIFY_PASS
********
FORTIFY_POOL_COMPLEX_NOVO
55e6b358-710a-4c3d-ad15-4a3ec96c3dca
FORTIFY_POOL_DIAMOND_NOVO
9fa96d5a-3b13-4ecb-8639-e2ec97d1b4e9
FORTIFY_POOL_GOLD_NOVO
1a3e11fe-719a-475a-905b-e61b743e550d
FORTIFY_POOL_MONOLITO_NOVO
7c2e05fb-2f1d-4045-ac12-69c806df50be
FORTIFY_POOL_SILVER_NOVO
794601f7-da27-467b-a734-06f92c4d63aa
FORTIFY_REGEX
'(?:\*\/)?(\d{1,3}\.\d{1,3}\.\d{1,3})'
FORTIFY_REGISTRY_PASSWORD
********
FORTIFY_REGISTRY_USERNAME
ads-sa
FORTIFY_SENSOR_VERSION
24.4
FORTIFY_TOKEN
********
FORTIFY_UPTOKEN
********
FORTIFY_URL
https://sast.caixa/ssc
FORTIFY_URL_CONTROLLER
http://sast.caixa/scancentral-ctrl
FORTIFY_USER
admin
GITHUB_PAT
********
HOME_ADS_AGENT
/opt/ads-agent
KEYSTORE_PWD
********
KEYSTORE_SECUREFILEPATH
/etc/pki/ca-trust/source/anchors/keystore-ssc24.jks
NEXUS_REPOSITORY_ID
NEXUS_INTERNO
NEXUS_URL_ANGULAR_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/angular
NEXUS_URL_ANGULAR_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/angular
NEXUS_URL_ASP_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/asp
NEXUS_URL_ASP_SNAPHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/asp
NEXUS_URL_CAIXA_GROUP
http://binario.caixa:8081/repository/caixa-group-br/
NEXUS_URL_DOTNET_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/dotnet
NEXUS_URL_DOTNET_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/dotnet
NEXUS_URL_MAVEN_RELEASE
http://binario.caixa:8081/repository/releases
NEXUS_URL_MAVEN_SNAPSHOT
http://binario.caixa:8081/repository/snapshots
NEXUS_URL_NODE_INTERNAL_RELEASE
http://binario.caixa:8081/repository/npm-internal
NEXUS_URL_NODE_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/node
NEXUS_URL_NODE_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/node
NEXUS_URL_NPM_RELEASE
http://binario.caixa:8081/repository/caixa-npm-releases/
NEXUS_URL_NPM_SNAPSHOT
http://binario.caixa:8081/repository/caixa-npm-snapshots/
NEXUS_URL_PHP_RELEASE
http://binario.caixa:8081/repository/caixa-php-releases
NEXUS_URL_PHP_SNAPSHOT
http://binario.caixa:8081/repository/caixa-php-snapshots
NEXUS_URL_RAW_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases
NEXUS_URL_RAW_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots
NEXUS_URL_ZCONBT_RELEASE
http://binario.caixa:8081/repository/caixa-raw-releases/zconbt
NEXUS_URL_ZCONBT_SNAPSHOT
http://binario.caixa:8081/repository/caixa-raw-snapshots/zconbt
NODE_EXTRA_CA_CERTS
/etc/pki/ca-trust/source/anchors/AC-V4.cer
SCANCENTRAL_URL
http://scancentral.apps.produtos4.caixa/scancentral-ctrl
SSC_URL
https://novocodigoseguro.caixa/ssc
ScanCentral.ClientToken
********
ScanCentral.SscCiToken
********
fortify_disable
false
nexus_interno_pass
********
nexus_interno_user
pipeline-agil
sonar_disable
false
SONAR_VARIABLES - ESTEIRA (8)
Variáveis do SONAR disponíveis para todas as builds.
SONAR_JAVA_BINARIES
.
SONAR_JAVA_COVERAGEPLUGIN
jacoco
SONAR_JAVA_LIBRARIES
.
SONAR_LOGIN
ads-sa
SONAR_PASSWORD
********
SONAR_PROPERTIES
-Dproject.settings=NONE -Dsonar.branch.name=$(sonar_branch) -Dsonar.java.binaries=$(SONAR_JAVA_BINARIES) -Dsonar.java.coveragePlugin=$(SONAR_JAVA_COVERAGEPLUGIN) -Dsonar.java.libraries=$(SONAR_JAVA_LIBRARIES) -Dsonar.coverage.jacoco.xmlReportPaths=`find . -path '*jacoco.xml' | sed 's/.*/&/' | tr '\n' ','` -Dsonar.junit.reportPaths=`find . -type d -name 'surefire-reports' | sed 's/.*/&/' | tr '\n' ','` -X
SONAR_URL
http://sonar-esteira.apps.produtos4.caixa
_SECRET.SONAR_PASSWORD
SONAR_PASSWORD
SAST_FORTIFY_COMUNIDADE_CREDITO_COMERCIAL (4)
WO0000076688772
FORTIFY_COMUNIDADE
CRÉDITO COMERCIAL
FORTIFY_FILTERSET_GUARDRAIL
32142c2d-3f7f-4863-a1bf-9b1e2f34d2ed
FORTIFY_LDAP_GROUP
SAST_Credito,SAST_Credito_Fabrica
FORTIFY_SENSOR_POOL
3bc7860a-0df2-40da-8133-81850b28adba
|Manage variable groups
Showing 12 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 12 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 12 filtered items.

Get started and run this pipeline for the first time!


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

SIGEC

SIGEC-portabilidade

Tasks

Variables

Triggers

Options

History
Java-Build
Task version
5.*
Display name
Java-Build
AZPAT
$(AZPAT)
FORTIFY_API
$(FORTIFY_API)
FORTIFY_APITOKEN
$(FORTIFY_APITOKEN)
FORTIFY_BUILD
$(FORTIFY_BUILD)
FORTIFY_CI_TOKEN
$(FORTIFY_CI_TOKEN)
FORTIFY_CLIENT_AUTH_TOKEN
$(FORTIFY_CLIENT_AUTH_TOKEN)
fortify_disable
$(fortify_disable)
FORTIFY_FPR_NAME
$(FORTIFY_FPR_NAME)
FORTIFY_NEW_VERSION
$(FORTIFY_NEW_VERSION)
FORTIFY_PASS
$(FORTIFY_PASS)
FORTIFY_POOL_GOLD_NOVO
$(FORTIFY_POOL_GOLD_NOVO)
FORTIFY_POOL_SILVER_NOVO
$(FORTIFY_POOL_SILVER_NOVO)
FORTIFY_REGEX
$(FORTIFY_REGEX)
FORTIFY_SENSOR_POOL
$(FORTIFY_SENSOR_POOL)
FORTIFY_UPTOKEN
$(FORTIFY_UPTOKEN)
FORTIFY_URL
$(FORTIFY_URL)
FORTIFY_URL_CONTROLLER
$(FORTIFY_URL_CONTROLLER)
FORTIFY_USER
$(FORTIFY_USER)
FORTIFY_VERSION_BUILD
$(FORTIFY_VERSION_BUILD)
GradleVersion
$(GradleVersion)
JAVA_VERSION
open-jdk-17.0.8
KEYSTORE_SECUREFILEPATH
$(KEYSTORE_SECUREFILEPATH)
lista_versao
$(lista_versao)
MAVEN_VERSION
3.8.5
MVN_GOAL
clean package -Dversion.app=$(version.app) -DskipTests=true -U  -Ponline
nexus_interno_pass
$(nexus_interno_pass)
nexus_interno_user
$(nexus_interno_user)
NEXUS_REPOSITORY_ID
$(NEXUS_REPOSITORY_ID)
NEXUS_URL_RELEASE
$(NEXUS_URL_MAVEN_RELEASE)
NEXUS_URL_SNAPSHOT
$(NEXUS_URL_MAVEN_SNAPSHOT)
NEXUS_URL_SNAPSHOT_ALIAS
SNAPSHOT
NODE_EXTRA_CA_CERTS
$(NODE_EXTRA_CA_CERTS)
p_language
$(p_language)
POM_PATH
pom.xml
project.extension
$(project.extension)
project.file
$(project.file)
project.group
$(project.group)
project.name
$(project.name)
project.release
$(project.release)
project.version
$(project.version)
REPOSITORIO
$(REPOSITORIO)
SCANCENTRAL_URL
$(SCANCENTRAL_URL)
SONAR_LOGIN
$(SONAR_LOGIN)
SONAR_PASSWORD
$(SONAR_PASSWORD)
SONAR_PROPERTIES
$(SONAR_PROPERTIES)
SONAR_URL
$(SONAR_URL)
token
$(token)
token_id
$(token_id)
valida.vec
$(valida.vec)
version.app
$(version.app)
versionApp
$(versionApp)
Control Options
Output Variables
Showing 12 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Showing 12 filtered items.

Get started and run this pipeline for the first time!

Row 2. Clickable

Row 2. Clickable

Showing 12 filtered items.

Get started and run this pipeline for the first time!

