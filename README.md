2026-11-13T18:58:37.0578495Z ##[section]Starting: Maven
2026-11-13T18:58:37.0583581Z ==============================================================================
2026-11-13T18:58:37.0583665Z Task         : Maven
2026-11-13T18:58:37.0583745Z Description  : Build, test, and deploy with Apache Maven
2026-11-13T18:58:37.0583809Z Version      : 4.225.0
2026-11-13T18:58:37.0583855Z Author       : Microsoft Corporation
2026-11-13T18:58:37.0583942Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-11-13T18:58:37.0584013Z ==============================================================================
2026-11-13T18:58:37.6133187Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-11-13T18:58:37.7149545Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-11-13T18:58:37.7150089Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-11-13T18:58:37.7150338Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-11-13T18:58:37.7150516Z Default locale: pt_BR, platform encoding: UTF-8
2026-11-13T18:58:37.7150957Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-11-13T18:58:37.7325963Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/21/s/pom.xml clean package -Dversion.app= -DskipTests=true -U -Ponline
2026-11-13T18:58:38.3794095Z [INFO] Scanning for projects...
2026-11-13T18:58:38.4389784Z [WARNING] 
2026-11-13T18:58:38.4391637Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec-xml:jar:5.0.0-online-SNAPSHOT
2026-11-13T18:58:38.4392340Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/21/s/pom.xml, line 8, column 11
2026-11-13T18:58:38.4392550Z [WARNING] 
2026-11-13T18:58:38.4392842Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.sigec:gec:pom:5.0.0-online-SNAPSHOT
2026-11-13T18:58:38.4393217Z [WARNING] 'version' contains an expression but should be a constant. @ br.gov.caixa.sigec:gec:${sigec.version}, /opt/ads-agent/_work/21/s/pom.xml, line 8, column 11
2026-11-13T18:58:38.4393456Z [WARNING] 
2026-11-13T18:58:38.4393628Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-11-13T18:58:38.4393928Z [WARNING] 
2026-11-13T18:58:38.4394099Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-11-13T18:58:38.4394236Z [WARNING] 
2026-11-13T18:58:38.4423120Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:58:38.4423435Z [INFO] Reactor Build Order:
2026-11-13T18:58:38.4423572Z [INFO] 
2026-11-13T18:58:38.4430888Z [INFO] SIGEC-PORTABILIDADE                                                [pom]
2026-11-13T18:58:38.4431206Z [INFO] GEC XML module                                                     [jar]
2026-11-13T18:58:38.4431600Z [INFO] GEC Azure module                                                   [jar]
2026-11-13T18:58:38.4431999Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas               [jar]
2026-11-13T18:58:38.4432282Z [INFO] GEC EJB module                                                     [ejb]
2026-11-13T18:58:38.4432536Z [INFO] GEC Web module                                                     [war]
2026-11-13T18:58:38.4432803Z [INFO] SIGEC PORTABILIDADE                                                [war]
2026-11-13T18:58:38.4433052Z [INFO] GEC EAR module                                                     [ear]
2026-11-13T18:58:38.4470583Z [INFO] 
2026-11-13T18:58:38.4471638Z [INFO] -----------------------< br.gov.caixa.sigec:gec >-----------------------
2026-11-13T18:58:38.4472127Z [INFO] Building SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT                 [1/8]
2026-11-13T18:58:38.4472383Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-13T18:58:38.4682324Z [INFO] 
2026-11-13T18:58:38.4683682Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec ---
2026-11-13T18:58:38.5052496Z [INFO] 
2026-11-13T18:58:38.5053354Z [INFO] ---------------------< br.gov.caixa.sigec:gec-xml >---------------------
2026-11-13T18:58:38.5053797Z [INFO] Building GEC XML module 5.0.0-online-SNAPSHOT                      [2/8]
2026-11-13T18:58:38.5054198Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:58:39.1783971Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/arqref/arqref-web/3.1.0.1/arqref-web-3.1.0.1.pom
2026-11-13T18:58:40.3845690Z [WARNING] The POM for br.gov.caixa.arqref:arqref-web:jar:3.1.0.1 is missing, no dependency information available
2026-11-13T18:58:40.4051286Z [INFO] 
2026-11-13T18:58:40.4051895Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-xml ---
2026-11-13T18:58:40.4067669Z [INFO] 
2026-11-13T18:58:40.4067932Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-xml ---
2026-11-13T18:58:40.4768457Z [INFO] Copying 524 resources from src/main/resources to target/classes
2026-11-13T18:58:40.5140043Z [INFO] 
2026-11-13T18:58:40.5140702Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-xml ---
2026-11-13T18:58:40.6469965Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:58:40.6576024Z [INFO] Compiling 2368 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:58:45.9929852Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:58:45.9930413Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:58:45.9930707Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:58:45.9930934Z    - with linked exception:
2026-11-13T18:58:45.9931159Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-13T18:58:45.9931490Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:58:45.9931873Z [WARNING] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[50,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9975069Z ##[warning] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(51,53): warning :  /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9983261Z ##[warning] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(52,51): warning :  /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9986088Z ##[warning] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(75,60): warning :  /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9988963Z ##[warning] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(76,53): warning :  /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9991556Z ##[warning] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java(77,51): warning :  /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9992451Z [WARNING] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[51,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9992859Z [WARNING] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[52,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9993267Z [WARNING] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[75,60] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9993670Z [WARNING] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[76,53] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9994065Z [WARNING] /opt/ads-agent/_work/21/s/gec-xml/src/main/java/br/gov/caixa/sigec/util/DataAdaptador.java:[77,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:58:45.9994292Z [INFO] 
2026-11-13T18:58:45.9994553Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-xml ---
2026-11-13T18:58:45.9994832Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/21/s/gec-xml/src/test/resources
2026-11-13T18:58:45.9994986Z [INFO] 
2026-11-13T18:58:45.9995189Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-xml ---
2026-11-13T18:58:45.9997075Z [INFO] No sources to compile
2026-11-13T18:58:45.9997351Z [INFO] 
2026-11-13T18:58:45.9997755Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-xml ---
2026-11-13T18:58:46.1184909Z [INFO] Tests are skipped.
2026-11-13T18:58:46.1185927Z [INFO] 
2026-11-13T18:58:46.1186374Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-xml ---
2026-11-13T18:58:46.4339744Z [INFO] Building jar: /opt/ads-agent/_work/21/s/gec-xml/target/gec-xml-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:58:46.7936083Z [INFO] 
2026-11-13T18:58:46.7937020Z [INFO] --------------------< br.gov.caixa.sigec:gec-azure >--------------------
2026-11-13T18:58:46.7939109Z [INFO] Building GEC Azure module 5.0.0-online-SNAPSHOT                    [3/8]
2026-11-13T18:58:46.7939728Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:58:47.7319714Z [INFO] 
2026-11-13T18:58:47.7320573Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-azure ---
2026-11-13T18:58:47.7325738Z [INFO] 
2026-11-13T18:58:47.7326942Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-azure ---
2026-11-13T18:58:47.7335469Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/21/s/gec-azure/src/main/resources
2026-11-13T18:58:47.7335932Z [INFO] 
2026-11-13T18:58:47.7336935Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-azure ---
2026-11-13T18:58:47.7377131Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:58:47.7380736Z [INFO] Compiling 3 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:58:48.4219895Z [INFO] 
2026-11-13T18:58:48.4220607Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-azure ---
2026-11-13T18:58:48.4234403Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/21/s/gec-azure/src/test/resources
2026-11-13T18:58:48.4234900Z [INFO] 
2026-11-13T18:58:48.4235271Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-azure ---
2026-11-13T18:58:48.4254472Z [INFO] No sources to compile
2026-11-13T18:58:48.4254650Z [INFO] 
2026-11-13T18:58:48.4254993Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-azure ---
2026-11-13T18:58:48.4273262Z [INFO] Tests are skipped.
2026-11-13T18:58:48.4273958Z [INFO] 
2026-11-13T18:58:48.4274644Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-azure ---
2026-11-13T18:58:48.4294371Z [INFO] Building jar: /opt/ads-agent/_work/21/s/gec-azure/target/gec-azure-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:58:48.4308955Z [INFO] 
2026-11-13T18:58:48.4309445Z [INFO] -------------------< br.gov.caixa.sigec:gec-common >--------------------
2026-11-13T18:58:48.4309763Z [INFO] Building GEC Common module - DTOs e Interfaces Compartilhadas 5.0.0-online-SNAPSHOT [4/8]
2026-11-13T18:58:48.4310030Z [INFO] --------------------------------[ jar ]---------------------------------
2026-11-13T18:58:48.4551421Z [INFO] 
2026-11-13T18:58:48.4553477Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-common ---
2026-11-13T18:58:48.4558811Z [INFO] 
2026-11-13T18:58:48.4559066Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-common ---
2026-11-13T18:58:48.4565849Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/21/s/gec-common/src/main/resources
2026-11-13T18:58:48.4566389Z [INFO] 
2026-11-13T18:58:48.4566634Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-common ---
2026-11-13T18:58:48.4616478Z [INFO] Recompiling the module because of changed source code.
2026-11-13T18:58:48.4617011Z [INFO] Compiling 4 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:58:49.3774378Z [INFO] 
2026-11-13T18:58:49.3775311Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-common ---
2026-11-13T18:58:49.3775782Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/21/s/gec-common/src/test/resources
2026-11-13T18:58:49.3776276Z [INFO] 
2026-11-13T18:58:49.3777427Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-common ---
2026-11-13T18:58:49.3781581Z [INFO] No sources to compile
2026-11-13T18:58:49.3781934Z [INFO] 
2026-11-13T18:58:49.3782267Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-common ---
2026-11-13T18:58:49.3795660Z [INFO] Tests are skipped.
2026-11-13T18:58:49.3795853Z [INFO] 
2026-11-13T18:58:49.3796084Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ gec-common ---
2026-11-13T18:58:49.3815649Z [INFO] Building jar: /opt/ads-agent/_work/21/s/gec-common/target/gec-common-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:58:49.3841909Z [INFO] 
2026-11-13T18:58:49.3842415Z [INFO] ---------------------< br.gov.caixa.sigec:gec-ejb >---------------------
2026-11-13T18:58:49.3842683Z [INFO] Building GEC EJB module 5.0.0-online-SNAPSHOT                      [5/8]
2026-11-13T18:58:49.3842979Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-11-13T18:58:52.7409382Z [INFO] 
2026-11-13T18:58:52.7409964Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-ejb ---
2026-11-13T18:58:52.7415987Z [INFO] 
2026-11-13T18:58:52.7416211Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-ejb ---
2026-11-13T18:58:52.7436255Z [INFO] Copying 11 resources from src/main/resources to target/classes
2026-11-13T18:58:52.8160287Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-11-13T18:58:52.8160792Z [INFO] 
2026-11-13T18:58:52.8161320Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-ejb ---
2026-11-13T18:58:52.8490362Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:58:52.8491100Z [INFO] Compiling 1571 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:59:05.9638716Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:59:05.9639256Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:59:05.9639716Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:59:05.9640374Z    - with linked exception:
2026-11-13T18:59:05.9640690Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-13T18:59:05.9646186Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java(30,59): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-13T18:59:05.9649420Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java(15,1): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:59:05.9653154Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java(12,1): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:59:05.9655601Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(65,9): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-13T18:59:05.9674689Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java(69,9): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-13T18:59:05.9679106Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(45,31): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9682330Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java(111,39): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9684597Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java(72,10): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-13T18:59:05.9686831Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1228,101): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9690316Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1237,129): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9692633Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1241,135): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9695421Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1245,143): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9697818Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1249,142): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9700472Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1253,129): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9703577Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1546,24): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9706280Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java(1562,24): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9708619Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(729,62): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9711826Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(2957,81): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9714065Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(3152,77): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9716799Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java(4057,39): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9719181Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(555,29): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9720070Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:59:05.9720625Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/dominio/HistoricoPosicaoSubsidioIofComplementar.java:[30,59] @Builder will ignore the initializing expression entirely. If you want the initializing expression to serve as default, add @Builder.Default. If it is not supposed to be settable during building, make the field final.
2026-11-13T18:59:05.9721209Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/exception/NucleaException.java:[15,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:59:05.9721911Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/simtr/filter/FiltroDocumentoSimtr.java:[12,1] Generating equals/hashCode implementation but without a call to superclass, even though this class does not extend java.lang.Object. If this is intentional, add '@EqualsAndHashCode(callSuper=false)' to your type.
2026-11-13T18:59:05.9722364Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[65,9] Not generating getType(): A method with that name already exists
2026-11-13T18:59:05.9722929Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/api/nuclea/AbstractNucleaAPI.java:[69,9] Not generating getConversorJack(): A method with that name already exists
2026-11-13T18:59:05.9723324Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[45,31] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9723700Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/Pager.java:[111,39] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9724047Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/mdb/PagamentoTedListenerBean.java:[72,10] unreachable catch clause
2026-11-13T18:59:05.9724273Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:59:05.9724668Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1228,101] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9725292Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1237,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9725696Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1241,135] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9727353Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1245,143] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9727750Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1249,142] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9728134Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1253,129] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9728516Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1546,24] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9728898Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NegocioUtil.java:[1562,24] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9729302Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[729,62] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9729745Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[2957,81] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9730174Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[3152,77] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9730579Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ManterPortabilidadeBean.java:[4057,39] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9731068Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[555,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9733877Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(595,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9736513Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java(624,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9738848Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(325,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9741640Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java(341,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9744414Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java(580,59): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9747364Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(435,29): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9749594Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(474,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9752173Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java(503,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9754902Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(309,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9757530Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java(336,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9760520Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java(435,59): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9763411Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(422,29): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9766118Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(454,75): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9768971Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java(472,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9771174Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(310,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9773730Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java(337,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9776320Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java(455,59): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9779117Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(434,29): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9781343Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(473,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9784035Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java(502,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9786789Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(317,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9789738Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java(333,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9792258Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java(571,59): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9794948Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(192,29): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9797180Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(231,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9801075Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java(260,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9803286Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(325,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9805958Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java(342,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9808396Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java(632,59): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9811236Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(417,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9813566Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java(447,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9815849Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(442,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9818187Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java(470,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9821066Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java(460,59): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9823356Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(8,49): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9826143Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(9,47): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9828423Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(10,49): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-13T18:59:05.9831139Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java(11,51): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9833820Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(457,29): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9836164Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(503,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9838531Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java(550,40): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9840825Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java(362,48): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9843534Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java(445,24): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9846200Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java(513,24): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9848601Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(320,88): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9851379Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java(545,58): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9854072Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(99,27): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-13T18:59:05.9856390Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java(222,27): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-13T18:59:05.9858773Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java(89,58): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9861621Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(477,48): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9864329Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java(521,48): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9866765Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(479,48): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9869307Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java(517,48): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9872522Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(488,48): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9875241Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java(526,48): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9877592Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(39,37): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9880616Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java(40,37): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9883039Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(113,66): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9885631Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(114,66): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9888287Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(147,71): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9890766Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(149,41): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9893125Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(346,58): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9896025Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(347,58): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9898415Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(348,63): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9901155Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(350,33): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9902033Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[595,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9902600Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC101Bean.java:[624,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9903286Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9904477Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC103Bean.java:[341,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9904900Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC104Bean.java:[580,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9905346Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[435,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9905749Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[474,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9906153Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC301Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9906557Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[309,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9907093Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC303Bean.java:[336,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9907510Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC304Bean.java:[435,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9907923Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[422,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9908321Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[454,75] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9908734Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC401Bean.java:[472,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9909132Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[310,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9909530Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC403Bean.java:[337,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9909938Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC404Bean.java:[455,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9910356Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[434,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9911384Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[473,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9911860Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC601Bean.java:[502,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9912254Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[317,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9912670Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC603Bean.java:[333,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9913080Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC604Bean.java:[571,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9913482Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[192,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9913880Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[231,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9914281Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC701Bean.java:[260,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9914706Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[325,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9915100Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC703Bean.java:[342,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9915503Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC704Bean.java:[632,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9915917Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[417,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9916314Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC801Bean.java:[447,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9916709Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[442,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9917181Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC803Bean.java:[470,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9917755Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorACTC804Bean.java:[460,59] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9918137Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[8,49] Integer(int) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9918511Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[9,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9918885Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[10,49] Float(double) in java.lang.Float has been deprecated and marked for removal
2026-11-13T18:59:05.9919327Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/util/NumeroUtil.java:[11,51] Double(double) in java.lang.Double has been deprecated and marked for removal
2026-11-13T18:59:05.9919730Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[457,29] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9920131Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[503,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9920541Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS101Bean.java:[550,40] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9920936Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorAPCS103Bean.java:[362,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9921341Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC001Bean.java:[445,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9921754Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/ProcessadorARCC002Bean.java:[513,24] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9922293Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[320,88] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9922727Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaBean.java:[545,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9923112Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[99,27] unreachable catch clause
2026-11-13T18:59:05.9923307Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:59:05.9923651Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallNCRBean.java:[222,27] unreachable catch clause
2026-11-13T18:59:05.9924655Z   thrown type com.fasterxml.jackson.core.JsonProcessingException has already been caught
2026-11-13T18:59:05.9925123Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/TransferenciaEletronicaLegacyCallOPFBean.java:[89,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9925645Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[477,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9926092Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS201Bean.java:[521,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9926532Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[479,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9927115Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS203Bean.java:[517,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9927622Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[488,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9928062Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/negocio/processador/contestacao/ProcessadorAPCS301Bean.java:[526,48] Long(java.lang.String) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:05.9928491Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[39,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9928910Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOLogArquivoCemocJPA.java:[40,37] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9929341Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[113,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9929765Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[114,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9930184Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[147,71] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9930657Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[149,41] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9931094Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[346,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9931963Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[347,58] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9932386Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[348,63] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9932801Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[350,33] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9935581Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(656,43): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9938193Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java(657,43): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9940572Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(48,61): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9943148Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(61,66): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9945346Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(98,61): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9948313Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(134,61): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9950550Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(138,68): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9953135Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(143,43): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9955339Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(144,45): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9958349Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java(145,51): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9961576Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java(710,55): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9963981Z ##[warning] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java(109,43): warning :  /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9964770Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[656,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9965201Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoRCOJPA.java:[657,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9965629Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[48,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9966117Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[61,66] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9966540Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[98,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9967195Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[134,61] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9967651Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[138,68] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9968084Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[143,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9968504Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[144,45] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9968979Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOMovimentoSinafJPA.java:[145,51] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9970017Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOPortabilidadeJPA.java:[710,55] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9970448Z [WARNING] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java:[109,43] Integer(java.lang.String) in java.lang.Integer has been deprecated and marked for removal
2026-11-13T18:59:05.9970829Z [INFO] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Some input files use or override a deprecated API.
2026-11-13T18:59:05.9971230Z [INFO] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/portabilidade/config/DB2390DialectCustom.java: Recompile with -Xlint:deprecation for details.
2026-11-13T18:59:05.9971631Z [INFO] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOTEDHabitacaoJPA.java: Some input files additionally use or override a deprecated API that is marked for removal.
2026-11-13T18:59:05.9972008Z [INFO] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Some input files use unchecked or unsafe operations.
2026-11-13T18:59:05.9972376Z [INFO] /opt/ads-agent/_work/21/s/gec-ejb/src/main/java/br/gov/caixa/sigec/persistencia/jpa/DAOAutorizacaoCanalJPA.java: Recompile with -Xlint:unchecked for details.
2026-11-13T18:59:05.9972581Z [INFO] 
2026-11-13T18:59:05.9972823Z [INFO] --- maven-resources-plugin:3.3.1:testResources (default-testResources) @ gec-ejb ---
2026-11-13T18:59:05.9973103Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/21/s/gec-ejb/src/test/resources
2026-11-13T18:59:05.9973228Z [INFO] 
2026-11-13T18:59:05.9973459Z [INFO] --- maven-compiler-plugin:3.13.0:testCompile (default-testCompile) @ gec-ejb ---
2026-11-13T18:59:05.9973669Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:59:05.9973926Z [INFO] Compiling 7 source files with javac [debug parameters release 17] to target/test-classes
2026-11-13T18:59:06.7564523Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:59:06.7565017Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:59:06.7565617Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:59:06.7565835Z    - with linked exception:
2026-11-13T18:59:06.7566015Z   [java.lang.ClassNotFoundException: com.sun.xml.bind.v2.ContextFactory]
2026-11-13T18:59:06.7566341Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:59:06.7566696Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.jboss.logging.processor.apt.LoggingToolsProcessor' less than -source '17'
2026-11-13T18:59:06.7566974Z [INFO] 
2026-11-13T18:59:06.7567200Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ gec-ejb ---
2026-11-13T18:59:06.7585228Z [INFO] Tests are skipped.
2026-11-13T18:59:06.7589537Z [INFO] 
2026-11-13T18:59:06.7589837Z [INFO] --- maven-ejb-plugin:3.0.1:ejb (default-ejb) @ gec-ejb ---
2026-11-13T18:59:06.9554935Z [INFO] Building EJB gec-ejb-5.0.0-online-SNAPSHOT with EJB version 3.1
2026-11-13T18:59:07.0486662Z [INFO] Building jar: /opt/ads-agent/_work/21/s/gec-ejb/target/gec-ejb-5.0.0-online-SNAPSHOT.jar
2026-11-13T18:59:07.1543648Z [INFO] 
2026-11-13T18:59:07.1544191Z [INFO] ---------------------< br.gov.caixa.sigec:gec-web >---------------------
2026-11-13T18:59:07.1544481Z [INFO] Building GEC Web module 5.0.0-online-SNAPSHOT                      [6/8]
2026-11-13T18:59:07.1544733Z [INFO] --------------------------------[ war ]---------------------------------
2026-11-13T18:59:07.3202309Z [INFO] 
2026-11-13T18:59:07.3203093Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ gec-web ---
2026-11-13T18:59:07.3208078Z [INFO] 
2026-11-13T18:59:07.3208541Z [INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ gec-web ---
2026-11-13T18:59:07.3218845Z [INFO] Copying 2 resources from src/main/resources to target/classes
2026-11-13T18:59:07.3274396Z [INFO] The encoding used to copy filtered properties files have not been set. This means that the same encoding will be used to copy filtered properties files as when copying other filtered resources. This might not be what you want! Run your build with --debug to see which files might be affected. Read more at https://maven.apache.org/plugins/maven-resources-plugin/examples/filtering-properties-files.html
2026-11-13T18:59:07.3274756Z [INFO] 
2026-11-13T18:59:07.3275022Z [INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ gec-web ---
2026-11-13T18:59:07.3317185Z [INFO] Recompiling the module because of changed dependency.
2026-11-13T18:59:07.3320242Z [INFO] Compiling 124 source files with javac [debug parameters release 17] to target/classes
2026-11-13T18:59:08.6330060Z [INFO] Hibernate JPA 2 Static-Metamodel Generator 1.2.0.Final
2026-11-13T18:59:08.6330465Z [INFO] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Some input files use or override a deprecated API.
2026-11-13T18:59:08.6330869Z [INFO] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/util/ExportaArquivoUtil.java: Recompile with -Xlint:deprecation for details.
2026-11-13T18:59:08.6331314Z [INFO] -------------------------------------------------------------
2026-11-13T18:59:08.6334249Z ##[warning] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java(121,47): warning :  /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:08.6337975Z ##[warning] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(140,17): warning :  /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:59:08.6340157Z ##[warning] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(151,17): warning :  /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:59:08.6342370Z ##[warning] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java(162,17): warning :  /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:59:08.6342818Z [WARNING] COMPILATION WARNING : 
2026-11-13T18:59:08.6343082Z [INFO] -------------------------------------------------------------
2026-11-13T18:59:08.6343338Z [WARNING] Error unmarshalling /META-INF/persistence.xml with exception :
2026-11-13T18:59:08.6343632Z    javax.xml.bind.JAXBException: Implementation of JAXB-API has not been found on module path or classpath.
2026-11-13T18:59:08.6344494Z    - with linked exception:
2026-11-13T18:59:08.6344670Z   [java.lang.ClassNotFoundException: com.sun.xml.internal.bind.v2.ContextFactory]
2026-11-13T18:59:08.6344989Z [WARNING] Supported source version 'RELEASE_6' from annotation processor 'org.hibernate.validator.ap.ConstraintValidationProcessor' less than -source '17'
2026-11-13T18:59:08.6345394Z [WARNING] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/negocio/MovimentoSinafBean.java:[121,47] Long(long) in java.lang.Long has been deprecated and marked for removal
2026-11-13T18:59:08.6345781Z [WARNING] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[140,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:59:08.6346232Z [WARNING] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[151,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:59:08.6346607Z [WARNING] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/GlobalRest.java:[162,17] attempt to synchronize on an instance of a value-based class
2026-11-13T18:59:08.6346802Z [INFO] 6 warnings 
2026-11-13T18:59:08.6347100Z [INFO] -------------------------------------------------------------
2026-11-13T18:59:08.6347308Z [INFO] -------------------------------------------------------------
2026-11-13T18:59:08.6347463Z [ERROR] COMPILATION ERROR : 
2026-11-13T18:59:08.6347680Z [INFO] -------------------------------------------------------------
2026-11-13T18:59:08.6348009Z [ERROR] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-13T18:59:08.6348210Z   symbol:   method listarMensagensEnvioFilaNCR()
2026-11-13T18:59:08.6348415Z   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:59:08.6350431Z ##[error] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(291,53): error :  /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-13T18:59:08.6351102Z [ERROR] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-13T18:59:08.6351960Z   symbol:   method publicarMensagemEnvioFilaNCR(br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO)
2026-11-13T18:59:08.6352208Z   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:59:08.6352391Z [INFO] 2 errors 
2026-11-13T18:59:08.6352607Z [INFO] -------------------------------------------------------------
2026-11-13T18:59:08.6352857Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:59:08.6353099Z [INFO] Reactor Summary for SIGEC-PORTABILIDADE 5.0.0-online-SNAPSHOT:
2026-11-13T18:59:08.6353247Z [INFO] 
2026-11-13T18:59:08.6353477Z [INFO] SIGEC-PORTABILIDADE ................................ SUCCESS [  0.058 s]
2026-11-13T18:59:08.6353710Z [INFO] GEC XML module ..................................... SUCCESS [  8.289 s]
2026-11-13T18:59:08.6353859Z [INFO] GEC Azure module ................................... SUCCESS [  1.637 s]
2026-11-13T18:59:08.6354115Z [INFO] GEC Common module - DTOs e Interfaces Compartilhadas SUCCESS [  0.954 s]
2026-11-13T18:59:08.6354300Z [INFO] GEC EJB module ..................................... SUCCESS [ 17.769 s]
2026-11-13T18:59:08.6354480Z [INFO] GEC Web module ..................................... FAILURE [  1.479 s]
2026-11-13T18:59:08.6354673Z [INFO] SIGEC PORTABILIDADE ................................ SKIPPED
2026-11-13T18:59:08.6354868Z [INFO] GEC EAR module ..................................... SKIPPED
2026-11-13T18:59:08.6355118Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:59:08.6355278Z [INFO] BUILD FAILURE
2026-11-13T18:59:08.6355517Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:59:08.6355683Z [INFO] Total time:  30.268 s
2026-11-13T18:59:08.6355907Z [INFO] Finished at: 2026-11-13T15:59:08-03:00
2026-11-13T18:59:08.6356113Z [INFO] ------------------------------------------------------------------------
2026-11-13T18:59:08.6357315Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project gec-web: Compilation failure: Compilation failure: 
2026-11-13T18:59:08.6361188Z ##[error] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(174,53): error :  /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-13T18:59:08.6362059Z [ERROR] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[174,53] cannot find symbol
2026-11-13T18:59:08.6364283Z ##[error] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java(291,53): error :  /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-13T18:59:08.6364787Z [ERROR]   symbol:   method listarMensagensEnvioFilaNCR()
2026-11-13T18:59:08.6365008Z [ERROR]   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:59:08.6365341Z [ERROR] /opt/ads-agent/_work/21/s/gec-web/src/main/java/br/gov/caixa/sigec/rest/dev/ProcessadorDevRest.java:[291,53] cannot find symbol
2026-11-13T18:59:08.6365583Z [ERROR]   symbol:   method publicarMensagemEnvioFilaNCR(br.gov.caixa.azure.servicebus.dto.DadosGECTedDTO)
2026-11-13T18:59:08.6365810Z [ERROR]   location: variable transferenciaEletronicaLegacyCallNCR of type br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCR
2026-11-13T18:59:08.6365996Z [ERROR] -> [Help 1]
2026-11-13T18:59:08.6366124Z [ERROR] 
2026-11-13T18:59:08.6366349Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-11-13T18:59:08.6366595Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-11-13T18:59:08.6366754Z [ERROR] 
2026-11-13T18:59:08.6367009Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-11-13T18:59:08.6367656Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
2026-11-13T18:59:08.6367831Z [ERROR] 
2026-11-13T18:59:08.6367953Z [ERROR] After correcting the problems, you can resume the build with the command
2026-11-13T18:59:08.6368185Z [ERROR]   mvn <args> -rf :gec-web
2026-11-13T18:59:08.7888137Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-11-13T18:59:08.7888463Z Could not retrieve code analysis results - Maven run failed.
2026-11-13T18:59:08.7891432Z ##[error]Build failed.
2026-11-13T18:59:08.7953176Z ##[section]Finishing: Maven
