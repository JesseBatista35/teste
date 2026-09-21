Módulo: SIIFX-caixinhas-batch


Solicito a correção do pipeline para que o Maven execute os 3 reactors configurados para o projeto. Observei nos logs do Maven está executando somente o primeiro batch-platform/pom.xml.

Deve-se executar os reactors na sequência:

1) batch-platform/pom.xml
2) mod-caixinhas/pom.xml
3) batch-launcher/pom.xml


eles pediram isso mais a pipilene nao ta com erro no mavem olha o log:


2026-09-21T13:23:57.3943558Z ##[section]Starting: Maven
2026-09-21T13:23:57.3948783Z ==============================================================================
2026-09-21T13:23:57.3948865Z Task         : Maven
2026-09-21T13:23:57.3948949Z Description  : Build, test, and deploy with Apache Maven
2026-09-21T13:23:57.3949011Z Version      : 4.225.0
2026-09-21T13:23:57.3949062Z Author       : Microsoft Corporation
2026-09-21T13:23:57.3949148Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-09-21T13:23:57.3949216Z ==============================================================================
2026-09-21T13:23:57.9506007Z [command]/opt/apache-maven/apache-maven-3.9.9/bin/mvn -version
2026-09-21T13:23:58.0655794Z Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
2026-09-21T13:23:58.0656366Z Maven home: /opt/apache-maven/apache-maven-3.9.9
2026-09-21T13:23:58.0656615Z Java version: 21.0.5, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-21.0.5
2026-09-21T13:23:58.0656796Z Default locale: pt_BR, platform encoding: UTF-8
2026-09-21T13:23:58.0657093Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-09-21T13:23:58.0860801Z [command]/opt/apache-maven/apache-maven-3.9.9/bin/mvn -f /opt/ads-agent/_work/4/s/batch-platform/pom.xml clean install -Dversion.app=1.0-SNAPSHOT
2026-09-21T13:23:58.9464051Z [INFO] Scanning for projects...
2026-09-21T13:23:59.1251263Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-dependencies/3.5.16/spring-boot-dependencies-3.5.16.pom
2026-09-21T13:23:59.3112804Z Progress (1): 7.7/97 kB
2026-09-21T13:23:59.3131510Z Progress (1): 41/97 kB 
2026-09-21T13:23:59.3147536Z Progress (1): 73/97 kB
2026-09-21T13:23:59.3492315Z Progress (1): 97 kB   
2026-09-21T13:23:59.3493189Z                    
2026-09-21T13:23:59.3493763Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-dependencies/3.5.16/spring-boot-dependencies-3.5.16.pom (97 kB at 427 kB/s)
2026-09-21T13:23:59.3740585Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/activemq/activemq-bom/6.1.8/activemq-bom-6.1.8.pom
2026-09-21T13:23:59.4082647Z Progress (1): 7.7/7.9 kB
2026-09-21T13:23:59.4395749Z Progress (1): 7.9 kB    
2026-09-21T13:23:59.4395991Z                     
2026-09-21T13:23:59.4396525Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/activemq/activemq-bom/6.1.8/activemq-bom-6.1.8.pom (7.9 kB at 119 kB/s)
2026-09-21T13:23:59.4480330Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/activemq/artemis-bom/2.40.0/artemis-bom-2.40.0.pom
2026-09-21T13:23:59.4763432Z Progress (1): 7.7/9.6 kB
2026-09-21T13:23:59.5203702Z Progress (1): 9.6 kB    
2026-09-21T13:23:59.5204075Z                     
2026-09-21T13:23:59.5204643Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/activemq/artemis-bom/2.40.0/artemis-bom-2.40.0.pom (9.6 kB at 132 kB/s)
2026-09-21T13:23:59.5671482Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/activemq/artemis-project/2.40.0/artemis-project-2.40.0.pom
2026-09-21T13:23:59.6278701Z Progress (1): 7.7/56 kB
2026-09-21T13:23:59.6279609Z Progress (1): 41/56 kB 
2026-09-21T13:23:59.8423100Z Progress (1): 56 kB   
2026-09-21T13:23:59.8423400Z                    
2026-09-21T13:23:59.8424056Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/activemq/artemis-project/2.40.0/artemis-project-2.40.0.pom (56 kB at 204 kB/s)
2026-09-21T13:23:59.8516648Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/33/apache-33.pom
2026-09-21T13:23:59.8665311Z Progress (1): 5.0/24 kB
2026-09-21T13:23:59.8711404Z Progress (1): 24 kB    
2026-09-21T13:23:59.8712146Z                    
2026-09-21T13:23:59.8712907Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/33/apache-33.pom (24 kB at 1.2 MB/s)
2026-09-21T13:23:59.8817752Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/assertj/assertj-bom/3.27.7/assertj-bom-3.27.7.pom
2026-09-21T13:23:59.9326862Z Progress (1): 3.3 kB
2026-09-21T13:23:59.9327623Z                     
2026-09-21T13:23:59.9328340Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/assertj/assertj-bom/3.27.7/assertj-bom-3.27.7.pom (3.3 kB at 65 kB/s)
2026-09-21T13:23:59.9791051Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/zipkin/reporter2/zipkin-reporter-bom/3.5.3/zipkin-reporter-bom-3.5.3.pom
2026-09-21T13:24:00.0175245Z Progress (1): 5.0/6.1 kB
2026-09-21T13:24:00.0565757Z Progress (1): 6.1 kB    
2026-09-21T13:24:00.1011436Z                     
2026-09-21T13:24:00.1012112Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/zipkin/reporter2/zipkin-reporter-bom/3.5.3/zipkin-reporter-bom-3.5.3.pom (6.1 kB at 78 kB/s)
2026-09-21T13:24:00.1012465Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/zipkin/brave/brave-bom/6.1.0/brave-bom-6.1.0.pom
2026-09-21T13:24:00.1276962Z Progress (1): 7.7/11 kB
2026-09-21T13:24:00.1667348Z Progress (1): 11 kB    
2026-09-21T13:24:00.1667639Z                    
2026-09-21T13:24:00.1668208Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/zipkin/brave/brave-bom/6.1.0/brave-bom-6.1.0.pom (11 kB at 166 kB/s)
2026-09-21T13:24:00.1745044Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/cassandra/java-driver-bom/4.19.3/java-driver-bom-4.19.3.pom
2026-09-21T13:24:00.2114605Z Progress (1): 5.5 kB
2026-09-21T13:24:00.2114848Z                     
2026-09-21T13:24:00.2115664Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/cassandra/java-driver-bom/4.19.3/java-driver-bom-4.19.3.pom (5.5 kB at 147 kB/s)
2026-09-21T13:24:00.2190237Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/glassfish/jaxb/jaxb-bom/4.0.9/jaxb-bom-4.0.9.pom
2026-09-21T13:24:00.2346383Z Progress (1): 7.7/13 kB
2026-09-21T13:24:00.2694286Z Progress (1): 13 kB    
2026-09-21T13:24:00.2694497Z                    
2026-09-21T13:24:00.2695042Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/glassfish/jaxb/jaxb-bom/4.0.9/jaxb-bom-4.0.9.pom (13 kB at 251 kB/s)
2026-09-21T13:24:00.2764714Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/ee4j/project/2.0.4/project-2.0.4.pom
2026-09-21T13:24:00.2801980Z Progress (1): 7.7/27 kB
2026-09-21T13:24:00.2838765Z Progress (1): 27 kB    
2026-09-21T13:24:00.2839678Z                    
2026-09-21T13:24:00.2840562Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/ee4j/project/2.0.4/project-2.0.4.pom (27 kB at 3.9 MB/s)
2026-09-21T13:24:00.2927581Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/groovy/groovy-bom/4.0.32/groovy-bom-4.0.32.pom
2026-09-21T13:24:00.3448189Z Progress (1): 7.7/27 kB
2026-09-21T13:24:00.3783715Z Progress (1): 27 kB    
2026-09-21T13:24:00.3784135Z                    
2026-09-21T13:24:00.3784916Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/groovy/groovy-bom/4.0.32/groovy-bom-4.0.32.pom (27 kB at 317 kB/s)
2026-09-21T13:24:00.3868042Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/infinispan/infinispan-bom/15.2.6.Final/infinispan-bom-15.2.6.Final.pom
2026-09-21T13:24:00.4033163Z Progress (1): 7.7/17 kB
2026-09-21T13:24:00.4122098Z Progress (1): 17 kB    
2026-09-21T13:24:00.4123083Z                    
2026-09-21T13:24:00.4124389Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/infinispan/infinispan-bom/15.2.6.Final/infinispan-bom-15.2.6.Final.pom (17 kB at 670 kB/s)
2026-09-21T13:24:00.4185257Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/infinispan/infinispan-build-configuration-parent/15.2.6.Final/infinispan-build-configuration-parent-15.2.6.Final.pom
2026-09-21T13:24:00.4300365Z Progress (1): 7.7/17 kB
2026-09-21T13:24:00.4358900Z Progress (1): 17 kB    
2026-09-21T13:24:00.4359266Z                    
2026-09-21T13:24:00.4360073Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/infinispan/infinispan-build-configuration-parent/15.2.6.Final/infinispan-build-configuration-parent-15.2.6.Final.pom (17 kB at 1.0 MB/s)
2026-09-21T13:24:00.4436737Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-bom/2.21.4/jackson-bom-2.21.4.pom
2026-09-21T13:24:00.4476923Z Progress (1): 7.7/20 kB
2026-09-21T13:24:00.4516557Z Progress (1): 20 kB    
2026-09-21T13:24:00.4517047Z                    
2026-09-21T13:24:00.4517950Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-bom/2.21.4/jackson-bom-2.21.4.pom (20 kB at 2.5 MB/s)
2026-09-21T13:24:00.4582319Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-parent/2.21/jackson-parent-2.21.pom
2026-09-21T13:24:00.4649087Z Progress (1): 6.9 kB
2026-09-21T13:24:00.4649874Z                     
2026-09-21T13:24:00.4713869Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-parent/2.21/jackson-parent-2.21.pom (6.9 kB at 983 kB/s)
2026-09-21T13:24:00.4714277Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/oss-parent/75/oss-parent-75.pom
2026-09-21T13:24:00.4745444Z Progress (1): 7.7/24 kB
2026-09-21T13:24:00.4781852Z Progress (1): 24 kB    
2026-09-21T13:24:00.4782777Z                    
2026-09-21T13:24:00.4783302Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/oss-parent/75/oss-parent-75.pom (24 kB at 3.4 MB/s)
2026-09-21T13:24:00.5074854Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/glassfish/jersey/jersey-bom/3.1.11/jersey-bom-3.1.11.pom
2026-09-21T13:24:00.5176066Z Progress (1): 7.7/21 kB
2026-09-21T13:24:00.5245929Z Progress (1): 21 kB    
2026-09-21T13:24:00.5246237Z                    
2026-09-21T13:24:00.5247196Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/glassfish/jersey/jersey-bom/3.1.11/jersey-bom-3.1.11.pom (21 kB at 1.2 MB/s)
2026-09-21T13:24:00.5314053Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/ee4j/project/1.0.9/project-1.0.9.pom
2026-09-21T13:24:00.5343083Z Progress (1): 7.7/16 kB
2026-09-21T13:24:00.5378170Z Progress (1): 16 kB    
2026-09-21T13:24:00.5379226Z                    
2026-09-21T13:24:00.5379653Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/ee4j/project/1.0.9/project-1.0.9.pom (16 kB at 2.3 MB/s)
2026-09-21T13:24:00.5448840Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0.36/jetty-ee10-bom-12.0.36.pom
2026-09-21T13:24:00.5517063Z Progress (1): 7.7/9.6 kB
2026-09-21T13:24:00.5601182Z Progress (1): 9.6 kB    
2026-09-21T13:24:00.5601335Z                     
2026-09-21T13:24:00.5602003Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0.36/jetty-ee10-bom-12.0.36.pom (9.6 kB at 639 kB/s)
2026-09-21T13:24:00.5664789Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/jetty/jetty-bom/12.0.36/jetty-bom-12.0.36.pom
2026-09-21T13:24:00.5717298Z Progress (1): 2.3/15 kB
2026-09-21T13:24:00.5801451Z Progress (1): 15 kB    
2026-09-21T13:24:00.5802030Z                    
2026-09-21T13:24:00.5802681Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/jetty/jetty-bom/12.0.36/jetty-bom-12.0.36.pom (15 kB at 1.0 MB/s)
2026-09-21T13:24:00.5867122Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.12.2/junit-bom-5.12.2.pom
2026-09-21T13:24:00.5935243Z Progress (1): 5.6 kB
2026-09-21T13:24:00.5935849Z                     
2026-09-21T13:24:00.5936320Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.12.2/junit-bom-5.12.2.pom (5.6 kB at 807 kB/s)
2026-09-21T13:24:00.6048026Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlin/kotlin-bom/1.9.25/kotlin-bom-1.9.25.pom
2026-09-21T13:24:00.6154078Z Progress (1): 3.7/9.1 kB
2026-09-21T13:24:00.6274122Z Progress (1): 9.1 kB    
2026-09-21T13:24:00.6274580Z                     
2026-09-21T13:24:00.6275108Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlin/kotlin-bom/1.9.25/kotlin-bom-1.9.25.pom (9.1 kB at 397 kB/s)
2026-09-21T13:24:00.6337826Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.8.1/kotlinx-coroutines-bom-1.8.1.pom
2026-09-21T13:24:00.6517653Z Progress (1): 4.3 kB
2026-09-21T13:24:00.6517929Z                     
2026-09-21T13:24:00.6518554Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.8.1/kotlinx-coroutines-bom-1.8.1.pom (4.3 kB at 238 kB/s)
2026-09-21T13:24:00.6583766Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlinx/kotlinx-serialization-bom/1.6.3/kotlinx-serialization-bom-1.6.3.pom
2026-09-21T13:24:00.6756230Z Progress (1): 3.7 kB
2026-09-21T13:24:00.6756639Z                     
2026-09-21T13:24:00.6757223Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlinx/kotlinx-serialization-bom/1.6.3/kotlinx-serialization-bom-1.6.3.pom (3.7 kB at 216 kB/s)
2026-09-21T13:24:00.6817970Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-bom/2.24.3/log4j-bom-2.24.3.pom
2026-09-21T13:24:00.6844536Z Progress (1): 7.7/12 kB
2026-09-21T13:24:00.6880937Z Progress (1): 12 kB    
2026-09-21T13:24:00.6881627Z                    
2026-09-21T13:24:00.6905279Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-bom/2.24.3/log4j-bom-2.24.3.pom (12 kB at 1.8 MB/s)
2026-09-21T13:24:00.6953943Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/logging-parent/11.3.0/logging-parent-11.3.0.pom
2026-09-21T13:24:00.6976895Z Progress (1): 6.4/53 kB
2026-09-21T13:24:00.6977215Z Progress (1): 26/53 kB 
2026-09-21T13:24:00.6977955Z Progress (1): 49/53 kB
2026-09-21T13:24:00.7011216Z Progress (1): 53 kB   
2026-09-21T13:24:00.7012004Z                    
2026-09-21T13:24:00.7012518Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/logging-parent/11.3.0/logging-parent-11.3.0.pom (53 kB at 6.7 MB/s)
2026-09-21T13:24:00.7322896Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-bom/1.15.12/micrometer-bom-1.15.12.pom
2026-09-21T13:24:00.7394676Z Progress (1): 7.7/8.6 kB
2026-09-21T13:24:00.7475818Z Progress (1): 8.6 kB    
2026-09-21T13:24:00.7476387Z                     
2026-09-21T13:24:00.7477173Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-bom/1.15.12/micrometer-bom-1.15.12.pom (8.6 kB at 538 kB/s)
2026-09-21T13:24:00.7546882Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-bom/5.17.0/mockito-bom-5.17.0.pom
2026-09-21T13:24:00.7731843Z Progress (1): 3.0 kB
2026-09-21T13:24:00.7732125Z                     
2026-09-21T13:24:00.7732859Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-bom/5.17.0/mockito-bom-5.17.0.pom (3.0 kB at 156 kB/s)
2026-09-21T13:24:00.7800650Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mongodb/mongodb-driver-bom/5.5.2/mongodb-driver-bom-5.5.2.pom
2026-09-21T13:24:00.7955804Z Progress (1): 4.2 kB
2026-09-21T13:24:00.7956158Z                     
2026-09-21T13:24:00.7956578Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mongodb/mongodb-driver-bom/5.5.2/mongodb-driver-bom-5.5.2.pom (4.2 kB at 260 kB/s)
2026-09-21T13:24:00.8017995Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/netty/netty-bom/4.1.135.Final/netty-bom-4.1.135.Final.pom
2026-09-21T13:24:00.8046079Z Progress (1): 2.3/15 kB
2026-09-21T13:24:00.8078352Z Progress (1): 15 kB    
2026-09-21T13:24:00.8078652Z                    
2026-09-21T13:24:00.8079132Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/netty/netty-bom/4.1.135.Final/netty-bom-4.1.135.Final.pom (15 kB at 2.5 MB/s)
2026-09-21T13:24:00.8157980Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/opentelemetry-bom/1.49.0/opentelemetry-bom-1.49.0.pom
2026-09-21T13:24:00.8357697Z Progress (1): 5.9 kB
2026-09-21T13:24:00.8358270Z                     
2026-09-21T13:24:00.8359971Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/opentelemetry-bom/1.49.0/opentelemetry-bom-1.49.0.pom (5.9 kB at 294 kB/s)
2026-09-21T13:24:00.8436113Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-bom/1.3.10/prometheus-metrics-bom-1.3.10.pom
2026-09-21T13:24:00.8519146Z Progress (1): 5.0/5.8 kB
2026-09-21T13:24:00.8593642Z Progress (1): 5.8 kB    
2026-09-21T13:24:00.8594031Z                     
2026-09-21T13:24:00.8594710Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-bom/1.3.10/prometheus-metrics-bom-1.3.10.pom (5.8 kB at 365 kB/s)
2026-09-21T13:24:00.8823567Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/client_java_parent/1.3.10/client_java_parent-1.3.10.pom
2026-09-21T13:24:00.9016178Z Progress (1): 4.4 kB
2026-09-21T13:24:00.9016585Z                     
2026-09-21T13:24:00.9017214Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/client_java_parent/1.3.10/client_java_parent-1.3.10.pom (4.4 kB at 229 kB/s)
2026-09-21T13:24:00.9082276Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/simpleclient_bom/0.16.0/simpleclient_bom-0.16.0.pom
2026-09-21T13:24:00.9156178Z Progress (1): 2.3/6.0 kB
2026-09-21T13:24:00.9202758Z Progress (1): 6.0 kB    
2026-09-21T13:24:00.9203006Z                     
2026-09-21T13:24:00.9203891Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/simpleclient_bom/0.16.0/simpleclient_bom-0.16.0.pom (6.0 kB at 463 kB/s)
2026-09-21T13:24:00.9437460Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/parent/0.16.0/parent-0.16.0.pom
2026-09-21T13:24:00.9470609Z Progress (1): 0.9/13 kB
2026-09-21T13:24:00.9500198Z Progress (1): 13 kB    
2026-09-21T13:24:00.9500359Z                    
2026-09-21T13:24:00.9500767Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/parent/0.16.0/parent-0.16.0.pom (13 kB at 2.1 MB/s)
2026-09-21T13:24:00.9567661Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/pulsar/pulsar-bom/4.0.11/pulsar-bom-4.0.11.pom
2026-09-21T13:24:00.9864323Z Progress (1): 7.7/25 kB
2026-09-21T13:24:01.0025825Z Progress (1): 25 kB    
2026-09-21T13:24:01.0026311Z                    
2026-09-21T13:24:01.0027657Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/pulsar/pulsar-bom/4.0.11/pulsar-bom-4.0.11.pom (25 kB at 548 kB/s)
2026-09-21T13:24:01.0089621Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/35/apache-35.pom
2026-09-21T13:24:01.0118637Z Progress (1): 0.9/24 kB
2026-09-21T13:24:01.0150932Z Progress (1): 24 kB    
2026-09-21T13:24:01.0151225Z                    
2026-09-21T13:24:01.0152919Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/35/apache-35.pom (24 kB at 3.5 MB/s)
2026-09-21T13:24:01.0220916Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/pulsar/pulsar-client-reactive-bom/0.6.0/pulsar-client-reactive-bom-0.6.0.pom
2026-09-21T13:24:01.0347698Z Progress (1): 2.3/2.8 kB
2026-09-21T13:24:01.0439005Z Progress (1): 2.8 kB    
2026-09-21T13:24:01.0439619Z                     
2026-09-21T13:24:01.0440241Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/pulsar/pulsar-client-reactive-bom/0.6.0/pulsar-client-reactive-bom-0.6.0.pom (2.8 kB at 128 kB/s)
2026-09-21T13:24:01.0505131Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/querydsl/querydsl-bom/5.1.0/querydsl-bom-5.1.0.pom
2026-09-21T13:24:01.0577822Z Progress (1): 6.4/7.2 kB
2026-09-21T13:24:01.0669498Z Progress (1): 7.2 kB    
2026-09-21T13:24:01.0670376Z                     
2026-09-21T13:24:01.0671115Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/querydsl/querydsl-bom/5.1.0/querydsl-bom-5.1.0.pom (7.2 kB at 447 kB/s)
2026-09-21T13:24:01.0747062Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/projectreactor/reactor-bom/2024.0.18/reactor-bom-2024.0.18.pom
2026-09-21T13:24:01.0956142Z Progress (1): 4.8 kB
2026-09-21T13:24:01.0956911Z                     
2026-09-21T13:24:01.0957521Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/projectreactor/reactor-bom/2024.0.18/reactor-bom-2024.0.18.pom (4.8 kB at 227 kB/s)
2026-09-21T13:24:01.1205289Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/rest-assured/rest-assured-bom/5.5.7/rest-assured-bom-5.5.7.pom
2026-09-21T13:24:01.1321641Z Progress (1): 4.7 kB
2026-09-21T13:24:01.1321895Z                     
2026-09-21T13:24:01.1322834Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/rest-assured/rest-assured-bom/5.5.7/rest-assured-bom-5.5.7.pom (4.7 kB at 391 kB/s)
2026-09-21T13:24:01.1384655Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/rsocket/rsocket-bom/1.1.5/rsocket-bom-1.1.5.pom
2026-09-21T13:24:01.1508809Z Progress (1): 2.4 kB
2026-09-21T13:24:01.1509094Z                     
2026-09-21T13:24:01.1509778Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/rsocket/rsocket-bom/1.1.5/rsocket-bom-1.1.5.pom (2.4 kB at 198 kB/s)
2026-09-21T13:24:01.1712665Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/seleniumhq/selenium/selenium-bom/4.31.0/selenium-bom-4.31.0.pom
2026-09-21T13:24:01.1859269Z Progress (1): 5.8 kB
2026-09-21T13:24:01.1859551Z                     
2026-09-21T13:24:01.1860223Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/seleniumhq/selenium/selenium-bom/4.31.0/selenium-bom-4.31.0.pom (5.8 kB at 389 kB/s)
2026-09-21T13:24:01.1924181Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/amqp/spring-amqp-bom/3.2.12/spring-amqp-bom-3.2.12.pom
2026-09-21T13:24:01.2030306Z Progress (1): 3.9 kB
2026-09-21T13:24:01.2030494Z                     
2026-09-21T13:24:01.2031489Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/amqp/spring-amqp-bom/3.2.12/spring-amqp-bom-3.2.12.pom (3.9 kB at 389 kB/s)
2026-09-21T13:24:01.2089085Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-bom/5.2.6/spring-batch-bom-5.2.6.pom
2026-09-21T13:24:01.2211203Z Progress (1): 3.2 kB
2026-09-21T13:24:01.2211440Z                     
2026-09-21T13:24:01.2211953Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-bom/5.2.6/spring-batch-bom-5.2.6.pom (3.2 kB at 270 kB/s)
2026-09-21T13:24:01.2274383Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/spring-data-bom/2025.0.13/spring-data-bom-2025.0.13.pom
2026-09-21T13:24:01.2489113Z Progress (1): 5.5 kB
2026-09-21T13:24:01.2489372Z                     
2026-09-21T13:24:01.2490350Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/spring-data-bom/2025.0.13/spring-data-bom-2025.0.13.pom (5.5 kB at 263 kB/s)
2026-09-21T13:24:01.2555170Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-framework-bom/6.2.19/spring-framework-bom-6.2.19.pom
2026-09-21T13:24:01.2710398Z Progress (1): 5.8 kB
2026-09-21T13:24:01.2710670Z                     
2026-09-21T13:24:01.2711588Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-framework-bom/6.2.19/spring-framework-bom-6.2.19.pom (5.8 kB at 389 kB/s)
2026-09-21T13:24:01.2775995Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/integration/spring-integration-bom/6.5.10/spring-integration-bom-6.5.10.pom
2026-09-21T13:24:01.2832628Z Progress (1): 7.7/10 kB
2026-09-21T13:24:01.2891687Z Progress (1): 10 kB    
2026-09-21T13:24:01.2891908Z                    
2026-09-21T13:24:01.2892398Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/integration/spring-integration-bom/6.5.10/spring-integration-bom-6.5.10.pom (10 kB at 858 kB/s)
2026-09-21T13:24:01.2961642Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/pulsar/spring-pulsar-bom/1.2.18/spring-pulsar-bom-1.2.18.pom
2026-09-21T13:24:01.3065214Z Progress (1): 2.9 kB
2026-09-21T13:24:01.3065457Z                     
2026-09-21T13:24:01.3065899Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/pulsar/spring-pulsar-bom/1.2.18/spring-pulsar-bom-1.2.18.pom (2.9 kB at 266 kB/s)
2026-09-21T13:24:01.3146022Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/restdocs/spring-restdocs-bom/3.0.6/spring-restdocs-bom-3.0.6.pom
2026-09-21T13:24:01.3318291Z Progress (1): 2.6 kB
2026-09-21T13:24:01.3318478Z                     
2026-09-21T13:24:01.3318963Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/restdocs/spring-restdocs-bom/3.0.6/spring-restdocs-bom-3.0.6.pom (2.6 kB at 152 kB/s)
2026-09-21T13:24:01.3385332Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/security/spring-security-bom/6.5.11/spring-security-bom-6.5.11.pom
2026-09-21T13:24:01.3584500Z Progress (1): 5.3 kB
2026-09-21T13:24:01.3584844Z                     
2026-09-21T13:24:01.3585551Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/security/spring-security-bom/6.5.11/spring-security-bom-6.5.11.pom (5.3 kB at 268 kB/s)
2026-09-21T13:24:01.3991669Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/session/spring-session-bom/3.5.7/spring-session-bom-3.5.7.pom
2026-09-21T13:24:01.4093964Z Progress (1): 2.9 kB
2026-09-21T13:24:01.4094350Z                     
2026-09-21T13:24:01.4094923Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/session/spring-session-bom/3.5.7/spring-session-bom-3.5.7.pom (2.9 kB at 263 kB/s)
2026-09-21T13:24:01.4151031Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/ws/spring-ws-bom/4.1.4/spring-ws-bom-4.1.4.pom
2026-09-21T13:24:01.4286161Z Progress (1): 2.3 kB
2026-09-21T13:24:01.4286299Z                     
2026-09-21T13:24:01.4286764Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/ws/spring-ws-bom/4.1.4/spring-ws-bom-4.1.4.pom (2.3 kB at 165 kB/s)
2026-09-21T13:24:01.4349871Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/testcontainers/testcontainers-bom/1.21.4/testcontainers-bom-1.21.4.pom
2026-09-21T13:24:01.4376717Z Progress (1): 7.7/12 kB
2026-09-21T13:24:01.4406283Z Progress (1): 12 kB    
2026-09-21T13:24:01.4406454Z                    
2026-09-21T13:24:01.4406859Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/testcontainers/testcontainers-bom/1.21.4/testcontainers-bom-1.21.4.pom (12 kB at 1.9 MB/s)
2026-09-21T13:24:01.4832697Z [INFO] ------------------------------------------------------------------------
2026-09-21T13:24:01.4833171Z [INFO] Reactor Build Order:
2026-09-21T13:24:01.4833309Z [INFO] 
2026-09-21T13:24:01.4838548Z [INFO] batch-platform                                                     [pom]
2026-09-21T13:24:01.4839129Z [INFO] platform-bom                                                       [pom]
2026-09-21T13:24:01.4839313Z [INFO] core-starter                                                       [jar]
2026-09-21T13:24:01.4839548Z [INFO] io-starter                                                         [jar]
2026-09-21T13:24:01.4908139Z [INFO] 
2026-09-21T13:24:01.4908718Z [INFO] ------------< br.gov.caixa.siifx.caixinhas:batch-platform >-------------
2026-09-21T13:24:01.4908983Z [INFO] Building batch-platform 1.0-SNAPSHOT                               [1/4]
2026-09-21T13:24:01.4909391Z [INFO]   from pom.xml
2026-09-21T13:24:01.4909656Z [INFO] --------------------------------[ pom ]---------------------------------
2026-09-21T13:24:01.4940969Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-enforcer-plugin/3.5.0/maven-enforcer-plugin-3.5.0.pom
2026-09-21T13:24:01.5009417Z Progress (1): 7.7/8.1 kB
2026-09-21T13:24:01.5072631Z Progress (1): 8.1 kB    
2026-09-21T13:24:01.5072847Z                     
2026-09-21T13:24:01.5073386Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-enforcer-plugin/3.5.0/maven-enforcer-plugin-3.5.0.pom (8.1 kB at 582 kB/s)
2026-09-21T13:24:01.5164389Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer/3.5.0/enforcer-3.5.0.pom
2026-09-21T13:24:01.5248146Z Progress (1): 7.7/9.3 kB
2026-09-21T13:24:01.5294418Z Progress (1): 9.3 kB    
2026-09-21T13:24:01.5298921Z                     
2026-09-21T13:24:01.5299475Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer/3.5.0/enforcer-3.5.0.pom (9.3 kB at 712 kB/s)
2026-09-21T13:24:01.5359763Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/42/maven-parent-42.pom
2026-09-21T13:24:01.5391648Z Progress (1): 7.7/50 kB
2026-09-21T13:24:01.5391883Z Progress (1): 41/50 kB 
2026-09-21T13:24:01.5426460Z Progress (1): 50 kB   
2026-09-21T13:24:01.5426591Z                    
2026-09-21T13:24:01.5427018Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/42/maven-parent-42.pom (50 kB at 7.2 MB/s)
2026-09-21T13:24:01.5604529Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-enforcer-plugin/3.5.0/maven-enforcer-plugin-3.5.0.jar
2026-09-21T13:24:01.5748891Z Progress (1): 7.7/39 kB
2026-09-21T13:24:01.5840510Z Progress (1): 39 kB    
2026-09-21T13:24:01.5840961Z                    
2026-09-21T13:24:01.5841549Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-enforcer-plugin/3.5.0/maven-enforcer-plugin-3.5.0.jar (39 kB at 1.7 MB/s)
2026-09-21T13:24:01.5942677Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.pom
2026-09-21T13:24:01.5978420Z Progress (1): 2.3/5.3 kB
2026-09-21T13:24:01.6015449Z Progress (1): 5.3 kB    
2026-09-21T13:24:01.6018459Z                     
2026-09-21T13:24:01.6019821Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.pom (5.3 kB at 664 kB/s)
2026-09-21T13:24:01.6076995Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/35/maven-plugins-35.pom
2026-09-21T13:24:01.6113659Z Progress (1): 7.7/9.9 kB
2026-09-21T13:24:01.6148753Z Progress (1): 9.9 kB    
2026-09-21T13:24:01.6149404Z                     
2026-09-21T13:24:01.6149920Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/35/maven-plugins-35.pom (9.9 kB at 1.4 MB/s)
2026-09-21T13:24:01.6209148Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/35/maven-parent-35.pom
2026-09-21T13:24:01.6243088Z Progress (1): 7.7/45 kB
2026-09-21T13:24:01.6243258Z Progress (1): 41/45 kB 
2026-09-21T13:24:01.6277876Z Progress (1): 45 kB   
2026-09-21T13:24:01.6278343Z                    
2026-09-21T13:24:01.6278883Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/35/maven-parent-35.pom (45 kB at 6.5 MB/s)
2026-09-21T13:24:01.6346355Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/25/apache-25.pom
2026-09-21T13:24:01.6389038Z Progress (1): 0.9/21 kB
2026-09-21T13:24:01.6428972Z Progress (1): 21 kB    
2026-09-21T13:24:01.6429446Z                    
2026-09-21T13:24:01.6429760Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/25/apache-25.pom (21 kB at 2.6 MB/s)
2026-09-21T13:24:01.6508885Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.jar
2026-09-21T13:24:01.6559887Z Progress (1): 7.7/36 kB
2026-09-21T13:24:01.6601967Z Progress (1): 36 kB    
2026-09-21T13:24:01.6602108Z                    
2026-09-21T13:24:01.6602912Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-clean-plugin/3.2.0/maven-clean-plugin-3.2.0.jar (36 kB at 3.6 MB/s)
2026-09-21T13:24:01.6697315Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-install-plugin/3.1.2/maven-install-plugin-3.1.2.pom
2026-09-21T13:24:01.6773109Z Progress (1): 0.9/8.5 kB
2026-09-21T13:24:01.6813212Z Progress (1): 8.5 kB    
2026-09-21T13:24:01.6813686Z                     
2026-09-21T13:24:01.6814330Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-install-plugin/3.1.2/maven-install-plugin-3.1.2.pom (8.5 kB at 707 kB/s)
2026-09-21T13:24:01.6878779Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom
2026-09-21T13:24:01.7085010Z Progress (1): 7.7 kB
2026-09-21T13:24:01.7085816Z                     
2026-09-21T13:24:01.7086704Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom (7.7 kB at 366 kB/s)
2026-09-21T13:24:01.7791974Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-install-plugin/3.1.2/maven-install-plugin-3.1.2.jar
2026-09-21T13:24:01.7882075Z Progress (1): 7.7/32 kB
2026-09-21T13:24:01.7959322Z Progress (1): 32 kB    
2026-09-21T13:24:01.7960344Z                    
2026-09-21T13:24:01.7961159Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-install-plugin/3.1.2/maven-install-plugin-3.1.2.jar (32 kB at 1.9 MB/s)
2026-09-21T13:24:01.8159817Z [INFO] 
2026-09-21T13:24:01.8160294Z [INFO] --- clean:3.2.0:clean (default-clean) @ batch-platform ---
2026-09-21T13:24:01.8250398Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom
2026-09-21T13:24:01.8333649Z Progress (1): 5.8 kB
2026-09-21T13:24:01.8334148Z                     
2026-09-21T13:24:01.8334925Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.pom (5.8 kB at 648 kB/s)
2026-09-21T13:24:01.8391302Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom
2026-09-21T13:24:01.8460193Z Progress (1): 5.1 kB
2026-09-21T13:24:01.8460374Z                     
2026-09-21T13:24:01.8461249Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom (5.1 kB at 728 kB/s)
2026-09-21T13:24:01.8682925Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/34/maven-parent-34.pom
2026-09-21T13:24:01.8717469Z Progress (1): 3.7/43 kB
2026-09-21T13:24:01.8717635Z Progress (1): 36/43 kB 
2026-09-21T13:24:01.8752300Z Progress (1): 43 kB   
2026-09-21T13:24:01.8752531Z                    
2026-09-21T13:24:01.8752968Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/34/maven-parent-34.pom (43 kB at 6.1 MB/s)
2026-09-21T13:24:01.8823170Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/23/apache-23.pom
2026-09-21T13:24:01.8851461Z Progress (1): 7.7/18 kB
2026-09-21T13:24:01.8884522Z Progress (1): 18 kB    
2026-09-21T13:24:01.8884786Z                    
2026-09-21T13:24:01.8885136Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/23/apache-23.pom (18 kB at 2.6 MB/s)
2026-09-21T13:24:01.8969001Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.6/commons-io-2.6.pom
2026-09-21T13:24:01.8996137Z Progress (1): 7.7/14 kB
2026-09-21T13:24:01.9026071Z Progress (1): 14 kB    
2026-09-21T13:24:01.9026426Z                    
2026-09-21T13:24:01.9026794Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.6/commons-io-2.6.pom (14 kB at 2.4 MB/s)
2026-09-21T13:24:01.9090429Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/42/commons-parent-42.pom
2026-09-21T13:24:01.9120915Z Progress (1): 3.7/68 kB
2026-09-21T13:24:01.9121374Z Progress (1): 36/68 kB 
2026-09-21T13:24:01.9156458Z Progress (1): 68 kB   
2026-09-21T13:24:01.9156581Z                    
2026-09-21T13:24:01.9156980Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/42/commons-parent-42.pom (68 kB at 9.7 MB/s)
2026-09-21T13:24:01.9485001Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar
2026-09-21T13:24:01.9523718Z Progress (1): 0.9/153 kB
2026-09-21T13:24:01.9524037Z Progress (1): 34/153 kB 
2026-09-21T13:24:01.9525281Z Progress (1): 66/153 kB
2026-09-21T13:24:01.9525864Z Progress (1): 99/153 kB
2026-09-21T13:24:01.9530926Z Progress (1): 124/153 kB
2026-09-21T13:24:01.9531132Z Progress (1): 125/153 kB
2026-09-21T13:24:01.9532098Z Progress (1): 130/153 kB
2026-09-21T13:24:01.9532801Z Progress (1): 131/153 kB
2026-09-21T13:24:01.9533171Z Progress (1): 138/153 kB
2026-09-21T13:24:01.9533751Z Progress (1): 142/153 kB
2026-09-21T13:24:01.9570930Z Progress (1): 153 kB    
2026-09-21T13:24:01.9571472Z                     
2026-09-21T13:24:01.9572076Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar (153 kB at 17 MB/s)
2026-09-21T13:24:01.9581316Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.6/commons-io-2.6.jar
2026-09-21T13:24:01.9621865Z Progress (1): 0.9/215 kB
2026-09-21T13:24:01.9622746Z Progress (1): 33/215 kB 
2026-09-21T13:24:01.9623620Z Progress (1): 66/215 kB
2026-09-21T13:24:01.9625712Z Progress (1): 98/215 kB
2026-09-21T13:24:01.9626087Z Progress (1): 131/215 kB
2026-09-21T13:24:01.9627590Z Progress (1): 135/215 kB
2026-09-21T13:24:01.9629175Z Progress (1): 142/215 kB
2026-09-21T13:24:01.9629679Z Progress (1): 154/215 kB
2026-09-21T13:24:01.9629830Z Progress (1): 157/215 kB
2026-09-21T13:24:01.9629973Z Progress (1): 158/215 kB
2026-09-21T13:24:01.9630432Z Progress (1): 160/215 kB
2026-09-21T13:24:01.9630754Z Progress (1): 167/215 kB
2026-09-21T13:24:01.9631874Z Progress (1): 180/215 kB
2026-09-21T13:24:01.9632092Z Progress (1): 198/215 kB
2026-09-21T13:24:01.9632275Z Progress (1): 204/215 kB
2026-09-21T13:24:01.9672601Z Progress (1): 215 kB    
2026-09-21T13:24:01.9673221Z                     
2026-09-21T13:24:01.9673885Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.6/commons-io-2.6.jar (215 kB at 21 MB/s)
2026-09-21T13:24:02.0093228Z [INFO] 
2026-09-21T13:24:02.0093984Z [INFO] --- enforcer:3.5.0:enforce (enforce-rules) @ batch-platform ---
2026-09-21T13:24:02.0152022Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom
2026-09-21T13:24:02.0186714Z Progress (1): 7.7/7.8 kB
2026-09-21T13:24:02.0220457Z Progress (1): 7.8 kB    
2026-09-21T13:24:02.0220625Z                     
2026-09-21T13:24:02.0221000Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom (7.8 kB at 1.1 MB/s)
2026-09-21T13:24:02.0280497Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/17/plexus-17.pom
2026-09-21T13:24:02.0313339Z Progress (1): 7.7/28 kB
2026-09-21T13:24:02.0346823Z Progress (1): 28 kB    
2026-09-21T13:24:02.0347164Z                    
2026-09-21T13:24:02.0347670Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/17/plexus-17.pom (28 kB at 4.0 MB/s)
2026-09-21T13:24:02.0414807Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.pom
2026-09-21T13:24:02.0507531Z Progress (1): 3.7 kB
2026-09-21T13:24:02.0507979Z                     
2026-09-21T13:24:02.0508705Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.pom (3.7 kB at 415 kB/s)
2026-09-21T13:24:02.0907507Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/13/plexus-13.pom
2026-09-21T13:24:02.0997804Z Progress (1): 7.7/27 kB
2026-09-21T13:24:02.1036499Z Progress (1): 27 kB    
2026-09-21T13:24:02.1036670Z                    
2026-09-21T13:24:02.1037111Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/13/plexus-13.pom (27 kB at 2.1 MB/s)
2026-09-21T13:24:02.1115630Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-api/3.5.0/enforcer-api-3.5.0.pom
2026-09-21T13:24:02.1246118Z Progress (1): 3.8 kB
2026-09-21T13:24:02.1246399Z                     
2026-09-21T13:24:02.1247059Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-api/3.5.0/enforcer-api-3.5.0.pom (3.8 kB at 288 kB/s)
2026-09-21T13:24:02.1322571Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-rules/3.5.0/enforcer-rules-3.5.0.pom
2026-09-21T13:24:02.1495789Z Progress (1): 3.7/5.4 kB
2026-09-21T13:24:02.1558177Z Progress (1): 5.4 kB    
2026-09-21T13:24:02.1558855Z                     
2026-09-21T13:24:02.1559316Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-rules/3.5.0/enforcer-rules-3.5.0.pom (5.4 kB at 233 kB/s)
2026-09-21T13:24:02.1753781Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.pom
2026-09-21T13:24:02.1810212Z Progress (1): 2.8 kB
2026-09-21T13:24:02.1810426Z                     
2026-09-21T13:24:02.1810864Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.pom (2.8 kB at 561 kB/s)
2026-09-21T13:24:02.1865127Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver/1.4.1/maven-resolver-1.4.1.pom
2026-09-21T13:24:02.1914122Z Progress (1): 0.9/18 kB
2026-09-21T13:24:02.1944334Z Progress (1): 18 kB    
2026-09-21T13:24:02.1944710Z                    
2026-09-21T13:24:02.1945388Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver/1.4.1/maven-resolver-1.4.1.pom (18 kB at 2.3 MB/s)
2026-09-21T13:24:02.2051511Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.pom
2026-09-21T13:24:02.2115328Z Progress (1): 2.6 kB
2026-09-21T13:24:02.2115651Z                     
2026-09-21T13:24:02.2116591Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-api/1.4.1/maven-resolver-api-1.4.1.pom (2.6 kB at 375 kB/s)
2026-09-21T13:24:02.2264581Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.17.0/commons-codec-1.17.0.pom
2026-09-21T13:24:02.2354297Z Progress (1): 7.7/18 kB
2026-09-21T13:24:02.2395356Z Progress (1): 18 kB    
2026-09-21T13:24:02.2395980Z                    
2026-09-21T13:24:02.2396463Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.17.0/commons-codec-1.17.0.pom (18 kB at 1.4 MB/s)
2026-09-21T13:24:02.2452000Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/69/commons-parent-69.pom
2026-09-21T13:24:02.2487016Z Progress (1): 7.7/77 kB
2026-09-21T13:24:02.2487992Z Progress (1): 41/77 kB 
2026-09-21T13:24:02.2488162Z Progress (1): 73/77 kB
2026-09-21T13:24:02.2522123Z Progress (1): 77 kB   
2026-09-21T13:24:02.2522571Z                    
2026-09-21T13:24:02.2523222Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/69/commons-parent-69.pom (77 kB at 9.6 MB/s)
2026-09-21T13:24:02.2615557Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom
2026-09-21T13:24:02.2651581Z Progress (1): 7.7/20 kB
2026-09-21T13:24:02.2686483Z Progress (1): 20 kB    
2026-09-21T13:24:02.2686621Z                    
2026-09-21T13:24:02.2687163Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom (20 kB at 2.8 MB/s)
2026-09-21T13:24:02.2879982Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache-extras/beanshell/bsh/2.0b6/bsh-2.0b6.pom
2026-09-21T13:24:02.2947648Z Progress (1): 5.0 kB
2026-09-21T13:24:02.2948061Z                     
2026-09-21T13:24:02.2948507Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache-extras/beanshell/bsh/2.0b6/bsh-2.0b6.pom (5.0 kB at 713 kB/s)
2026-09-21T13:24:02.3025497Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar
2026-09-21T13:24:02.3055326Z Progress (1): 7.7/193 kB
2026-09-21T13:24:02.3056370Z Progress (1): 40/193 kB 
2026-09-21T13:24:02.3058030Z Progress (1): 73/193 kB
2026-09-21T13:24:02.3058959Z Progress (1): 105/193 kB
2026-09-21T13:24:02.3059758Z Progress (1): 138/193 kB
2026-09-21T13:24:02.3062578Z Progress (1): 158/193 kB
2026-09-21T13:24:02.3062720Z Progress (1): 160/193 kB
2026-09-21T13:24:02.3062927Z Progress (1): 161/193 kB
2026-09-21T13:24:02.3063461Z Progress (1): 169/193 kB
2026-09-21T13:24:02.3063640Z Progress (1): 180/193 kB
2026-09-21T13:24:02.3101773Z Progress (1): 193 kB    
2026-09-21T13:24:02.3102092Z                     
2026-09-21T13:24:02.3102638Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar (193 kB at 24 MB/s)
2026-09-21T13:24:02.3106995Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.jar
2026-09-21T13:24:02.3112373Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-api/3.5.0/enforcer-api-3.5.0.jar
2026-09-21T13:24:02.3114716Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-rules/3.5.0/enforcer-rules-3.5.0.jar
2026-09-21T13:24:02.3115821Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar
2026-09-21T13:24:02.3117520Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.jar
2026-09-21T13:24:02.3141269Z Progress (1): 0.9/93 kB
2026-09-21T13:24:02.3142678Z Progress (1): 34/93 kB 
2026-09-21T13:24:02.3143512Z Progress (1): 66/93 kB
2026-09-21T13:24:02.3154476Z Progress (1): 93 kB   
2026-09-21T13:24:02.3155160Z Progress (2): 93 kB | 0.9/658 kB
2026-09-21T13:24:02.3156634Z Progress (2): 93 kB | 13/658 kB 
2026-09-21T13:24:02.3159467Z Progress (3): 93 kB | 13/658 kB | 5.0/168 kB
2026-09-21T13:24:02.3159813Z Progress (3): 93 kB | 13/658 kB | 13/168 kB 
2026-09-21T13:24:02.3159986Z Progress (3): 93 kB | 13/658 kB | 15/168 kB
2026-09-21T13:24:02.3161468Z Progress (3): 93 kB | 13/658 kB | 16/168 kB
2026-09-21T13:24:02.3165991Z Progress (3): 93 kB | 16/658 kB | 16/168 kB
2026-09-21T13:24:02.3166689Z Progress (3): 93 kB | 16/658 kB | 21/168 kB
2026-09-21T13:24:02.3166922Z Progress (3): 93 kB | 16/658 kB | 39/168 kB
2026-09-21T13:24:02.3167102Z Progress (3): 93 kB | 19/658 kB | 39/168 kB
2026-09-21T13:24:02.3167287Z Progress (3): 93 kB | 19/658 kB | 41/168 kB
2026-09-21T13:24:02.3167518Z Progress (3): 93 kB | 27/658 kB | 41/168 kB
2026-09-21T13:24:02.3167630Z Progress (3): 93 kB | 41/658 kB | 41/168 kB
2026-09-21T13:24:02.3167796Z Progress (3): 93 kB | 42/658 kB | 41/168 kB
2026-09-21T13:24:02.3167942Z Progress (3): 93 kB | 45/658 kB | 41/168 kB
2026-09-21T13:24:02.3168258Z Progress (3): 93 kB | 45/658 kB | 42/168 kB
2026-09-21T13:24:02.3168699Z Progress (3): 93 kB | 45/658 kB | 43/168 kB
2026-09-21T13:24:02.3170770Z Progress (3): 93 kB | 45/658 kB | 76/168 kB
2026-09-21T13:24:02.3171160Z Progress (3): 93 kB | 45/658 kB | 95/168 kB
2026-09-21T13:24:02.3171410Z Progress (3): 93 kB | 46/658 kB | 95/168 kB
2026-09-21T13:24:02.3171642Z Progress (3): 93 kB | 57/658 kB | 95/168 kB
2026-09-21T13:24:02.3172300Z Progress (3): 93 kB | 67/658 kB | 95/168 kB
2026-09-21T13:24:02.3172611Z Progress (3): 93 kB | 71/658 kB | 95/168 kB
2026-09-21T13:24:02.3173226Z Progress (3): 93 kB | 73/658 kB | 95/168 kB
2026-09-21T13:24:02.3176619Z Progress (3): 93 kB | 76/658 kB | 95/168 kB
2026-09-21T13:24:02.3176905Z Progress (3): 93 kB | 78/658 kB | 95/168 kB
2026-09-21T13:24:02.3177242Z Progress (3): 93 kB | 80/658 kB | 95/168 kB
2026-09-21T13:24:02.3177891Z Progress (3): 93 kB | 86/658 kB | 95/168 kB
2026-09-21T13:24:02.3178489Z Progress (3): 93 kB | 91/658 kB | 95/168 kB
2026-09-21T13:24:02.3178896Z Progress (3): 93 kB | 93/658 kB | 95/168 kB
2026-09-21T13:24:02.3179301Z Progress (3): 93 kB | 95/658 kB | 95/168 kB
2026-09-21T13:24:02.3179652Z Progress (3): 93 kB | 95/658 kB | 97/168 kB
2026-09-21T13:24:02.3180229Z Progress (3): 93 kB | 104/658 kB | 97/168 kB
2026-09-21T13:24:02.3180671Z Progress (3): 93 kB | 104/658 kB | 104/168 kB
2026-09-21T13:24:02.3180905Z Progress (3): 93 kB | 106/658 kB | 104/168 kB
2026-09-21T13:24:02.3181326Z Progress (3): 93 kB | 108/658 kB | 104/168 kB
2026-09-21T13:24:02.3181806Z Progress (3): 93 kB | 109/658 kB | 104/168 kB
2026-09-21T13:24:02.3182034Z Progress (3): 93 kB | 110/658 kB | 104/168 kB
2026-09-21T13:24:02.3182420Z Progress (3): 93 kB | 112/658 kB | 104/168 kB
2026-09-21T13:24:02.3182756Z Progress (3): 93 kB | 112/658 kB | 128/168 kB
2026-09-21T13:24:02.3183146Z Progress (3): 93 kB | 121/658 kB | 128/168 kB
2026-09-21T13:24:02.3183692Z Progress (3): 93 kB | 121/658 kB | 153/168 kB
2026-09-21T13:24:02.3184180Z Progress (3): 93 kB | 121/658 kB | 155/168 kB
2026-09-21T13:24:02.3184674Z Progress (3): 93 kB | 121/658 kB | 161/168 kB
2026-09-21T13:24:02.3184928Z Progress (3): 93 kB | 121/658 kB | 168 kB    
2026-09-21T13:24:02.3185185Z                                          
2026-09-21T13:24:02.3185710Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.jar (93 kB at 12 MB/s)
2026-09-21T13:24:02.3185948Z Progress (2): 128/658 kB | 168 kB
2026-09-21T13:24:02.3186102Z                                  
2026-09-21T13:24:02.3186351Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.17.0/commons-codec-1.17.0.jar
2026-09-21T13:24:02.3186959Z Progress (2): 139/658 kB | 168 kB
2026-09-21T13:24:02.3187767Z Progress (2): 145/658 kB | 168 kB
2026-09-21T13:24:02.3190810Z Progress (2): 155/658 kB | 168 kB
2026-09-21T13:24:02.3190969Z Progress (2): 157/658 kB | 168 kB
2026-09-21T13:24:02.3191503Z Progress (2): 161/658 kB | 168 kB
2026-09-21T13:24:02.3191675Z Progress (2): 168/658 kB | 168 kB
2026-09-21T13:24:02.3192028Z Progress (2): 173/658 kB | 168 kB
2026-09-21T13:24:02.3194611Z Progress (2): 177/658 kB | 168 kB
2026-09-21T13:24:02.3198335Z Progress (2): 192/658 kB | 168 kB
2026-09-21T13:24:02.3198792Z Progress (2): 197/658 kB | 168 kB
2026-09-21T13:24:02.3204599Z Progress (2): 202/658 kB | 168 kB
2026-09-21T13:24:02.3204749Z Progress (2): 214/658 kB | 168 kB
2026-09-21T13:24:02.3204892Z Progress (3): 214/658 kB | 168 kB | 0.9/15 kB
2026-09-21T13:24:02.3205053Z Progress (3): 214/658 kB | 168 kB | 13/15 kB 
2026-09-21T13:24:02.3205255Z Progress (3): 216/658 kB | 168 kB | 13/15 kB
2026-09-21T13:24:02.3205371Z Progress (3): 223/658 kB | 168 kB | 13/15 kB
2026-09-21T13:24:02.3205519Z Progress (3): 232/658 kB | 168 kB | 13/15 kB
2026-09-21T13:24:02.3205678Z Progress (3): 232/658 kB | 168 kB | 15 kB   
2026-09-21T13:24:02.3205823Z Progress (3): 242/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3206405Z Progress (3): 244/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3206641Z Progress (3): 250/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3207860Z Progress (3): 253/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3207977Z Progress (3): 254/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3208421Z Progress (3): 255/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3209807Z Progress (3): 257/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3210300Z Progress (3): 262/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3210414Z Progress (3): 264/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3210560Z Progress (3): 270/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3210896Z Progress (3): 272/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3211213Z Progress (3): 275/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3219765Z Progress (3): 283/658 kB | 168 kB | 15 kB
2026-09-21T13:24:02.3220123Z Progress (4): 283/658 kB | 168 kB | 15 kB | 3.6/373 kB
2026-09-21T13:24:02.3220454Z Progress (4): 284/658 kB | 168 kB | 15 kB | 3.6/373 kB
2026-09-21T13:24:02.3220650Z Progress (4): 288/658 kB | 168 kB | 15 kB | 3.6/373 kB
2026-09-21T13:24:02.3220771Z Progress (4): 288/658 kB | 168 kB | 15 kB | 34/373 kB 
2026-09-21T13:24:02.3220928Z Progress (4): 305/658 kB | 168 kB | 15 kB | 34/373 kB
2026-09-21T13:24:02.3221084Z Progress (4): 313/658 kB | 168 kB | 15 kB | 34/373 kB
2026-09-21T13:24:02.3221239Z Progress (4): 313/658 kB | 168 kB | 15 kB | 61/373 kB
2026-09-21T13:24:02.3221390Z Progress (4): 313/658 kB | 168 kB | 15 kB | 68/373 kB
2026-09-21T13:24:02.3221500Z                                                      
2026-09-21T13:24:02.3221872Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.4.1/maven-resolver-util-1.4.1.jar (168 kB at 17 MB/s)
2026-09-21T13:24:02.3222116Z Progress (3): 313/658 kB | 15 kB | 70/373 kB
2026-09-21T13:24:02.3222268Z Progress (3): 313/658 kB | 15 kB | 71/373 kB
2026-09-21T13:24:02.3222417Z                                             
2026-09-21T13:24:02.3222654Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar
2026-09-21T13:24:02.3222857Z Progress (3): 313/658 kB | 15 kB | 72/373 kB
2026-09-21T13:24:02.3223007Z Progress (3): 313/658 kB | 15 kB | 79/373 kB
2026-09-21T13:24:02.3223151Z Progress (3): 313/658 kB | 15 kB | 83/373 kB
2026-09-21T13:24:02.3223291Z Progress (3): 320/658 kB | 15 kB | 83/373 kB
2026-09-21T13:24:02.3223398Z Progress (3): 320/658 kB | 15 kB | 89/373 kB
2026-09-21T13:24:02.3223604Z Progress (3): 325/658 kB | 15 kB | 89/373 kB
2026-09-21T13:24:02.3223753Z Progress (3): 325/658 kB | 15 kB | 90/373 kB
2026-09-21T13:24:02.3224025Z Progress (3): 336/658 kB | 15 kB | 90/373 kB
2026-09-21T13:24:02.3224226Z Progress (3): 348/658 kB | 15 kB | 90/373 kB
2026-09-21T13:24:02.3224348Z Progress (3): 348/658 kB | 15 kB | 123/373 kB
2026-09-21T13:24:02.3224525Z Progress (3): 348/658 kB | 15 kB | 127/373 kB
2026-09-21T13:24:02.3224982Z Progress (3): 348/658 kB | 15 kB | 129/373 kB
2026-09-21T13:24:02.3225449Z Progress (3): 348/658 kB | 15 kB | 133/373 kB
2026-09-21T13:24:02.3225721Z Progress (3): 348/658 kB | 15 kB | 134/373 kB
2026-09-21T13:24:02.3226419Z Progress (3): 348/658 kB | 15 kB | 139/373 kB
2026-09-21T13:24:02.3226592Z Progress (3): 359/658 kB | 15 kB | 139/373 kB
2026-09-21T13:24:02.3227037Z Progress (3): 359/658 kB | 15 kB | 149/373 kB
2026-09-21T13:24:02.3227432Z Progress (3): 359/658 kB | 15 kB | 152/373 kB
2026-09-21T13:24:02.3227851Z Progress (3): 365/658 kB | 15 kB | 152/373 kB
2026-09-21T13:24:02.3228169Z Progress (3): 365/658 kB | 15 kB | 155/373 kB
2026-09-21T13:24:02.3228823Z Progress (3): 365/658 kB | 15 kB | 160/373 kB
2026-09-21T13:24:02.3228983Z Progress (3): 365/658 kB | 15 kB | 172/373 kB
2026-09-21T13:24:02.3229431Z Progress (3): 366/658 kB | 15 kB | 172/373 kB
2026-09-21T13:24:02.3229781Z Progress (3): 370/658 kB | 15 kB | 172/373 kB
2026-09-21T13:24:02.3230151Z Progress (3): 370/658 kB | 15 kB | 190/373 kB
2026-09-21T13:24:02.3230415Z Progress (3): 376/658 kB | 15 kB | 190/373 kB
2026-09-21T13:24:02.3230695Z Progress (3): 376/658 kB | 15 kB | 197/373 kB
2026-09-21T13:24:02.3232014Z Progress (3): 378/658 kB | 15 kB | 197/373 kB
2026-09-21T13:24:02.3232211Z Progress (3): 378/658 kB | 15 kB | 198/373 kB
2026-09-21T13:24:02.3232364Z Progress (3): 394/658 kB | 15 kB | 198/373 kB
2026-09-21T13:24:02.3232656Z Progress (3): 395/658 kB | 15 kB | 198/373 kB
2026-09-21T13:24:02.3234090Z Progress (3): 400/658 kB | 15 kB | 198/373 kB
2026-09-21T13:24:02.3234262Z Progress (3): 409/658 kB | 15 kB | 198/373 kB
2026-09-21T13:24:02.3234475Z Progress (3): 410/658 kB | 15 kB | 198/373 kB
2026-09-21T13:24:02.3234611Z Progress (3): 411/658 kB | 15 kB | 198/373 kB
2026-09-21T13:24:02.3234922Z Progress (3): 411/658 kB | 15 kB | 222/373 kB
2026-09-21T13:24:02.3235086Z Progress (3): 411/658 kB | 15 kB | 223/373 kB
2026-09-21T13:24:02.3235229Z Progress (3): 411/658 kB | 15 kB | 226/373 kB
2026-09-21T13:24:02.3241320Z Progress (3): 411/658 kB | 15 kB | 230/373 kB
2026-09-21T13:24:02.3241521Z Progress (3): 411/658 kB | 15 kB | 242/373 kB
2026-09-21T13:24:02.3241671Z Progress (3): 411/658 kB | 15 kB | 243/373 kB
2026-09-21T13:24:02.3241814Z Progress (3): 411/658 kB | 15 kB | 258/373 kB
2026-09-21T13:24:02.3241924Z Progress (3): 411/658 kB | 15 kB | 264/373 kB
2026-09-21T13:24:02.3242069Z Progress (3): 411/658 kB | 15 kB | 269/373 kB
2026-09-21T13:24:02.3242218Z Progress (3): 422/658 kB | 15 kB | 269/373 kB
2026-09-21T13:24:02.3242444Z Progress (3): 422/658 kB | 15 kB | 271/373 kB
2026-09-21T13:24:02.3242595Z Progress (3): 425/658 kB | 15 kB | 271/373 kB
2026-09-21T13:24:02.3242703Z Progress (3): 425/658 kB | 15 kB | 272/373 kB
2026-09-21T13:24:02.3242861Z Progress (3): 425/658 kB | 15 kB | 284/373 kB
2026-09-21T13:24:02.3243008Z Progress (3): 425/658 kB | 15 kB | 286/373 kB
2026-09-21T13:24:02.3243150Z Progress (3): 441/658 kB | 15 kB | 286/373 kB
2026-09-21T13:24:02.3243259Z Progress (3): 441/658 kB | 15 kB | 295/373 kB
2026-09-21T13:24:02.3243406Z Progress (3): 448/658 kB | 15 kB | 295/373 kB
2026-09-21T13:24:02.3243563Z Progress (3): 454/658 kB | 15 kB | 295/373 kB
2026-09-21T13:24:02.3248440Z Progress (3): 461/658 kB | 15 kB | 295/373 kB
2026-09-21T13:24:02.3248701Z Progress (4): 461/658 kB | 15 kB | 295/373 kB | 6.4/509 kB
2026-09-21T13:24:02.3248875Z Progress (5): 461/658 kB | 15 kB | 295/373 kB | 6.4/509 kB | 6.4/147 kB
2026-09-21T13:24:02.3249016Z Progress (5): 461/658 kB | 15 kB | 295/373 kB | 6.4/509 kB | 13/147 kB 
2026-09-21T13:24:02.3249183Z Progress (5): 461/658 kB | 15 kB | 295/373 kB | 39/509 kB | 13/147 kB 
2026-09-21T13:24:02.3249354Z Progress (5): 461/658 kB | 15 kB | 320/373 kB | 39/509 kB | 13/147 kB
2026-09-21T13:24:02.3249523Z Progress (5): 463/658 kB | 15 kB | 320/373 kB | 39/509 kB | 13/147 kB
2026-09-21T13:24:02.3249700Z Progress (5): 463/658 kB | 15 kB | 323/373 kB | 39/509 kB | 13/147 kB
2026-09-21T13:24:02.3249827Z Progress (5): 463/658 kB | 15 kB | 323/373 kB | 72/509 kB | 13/147 kB
2026-09-21T13:24:02.3250012Z Progress (5): 463/658 kB | 15 kB | 335/373 kB | 72/509 kB | 13/147 kB
2026-09-21T13:24:02.3250189Z Progress (5): 477/658 kB | 15 kB | 335/373 kB | 72/509 kB | 13/147 kB
2026-09-21T13:24:02.3250372Z Progress (5): 477/658 kB | 15 kB | 338/373 kB | 72/509 kB | 13/147 kB
2026-09-21T13:24:02.3250531Z Progress (5): 477/658 kB | 15 kB | 346/373 kB | 72/509 kB | 13/147 kB
2026-09-21T13:24:02.3250658Z Progress (5): 477/658 kB | 15 kB | 346/373 kB | 105/509 kB | 13/147 kB
2026-09-21T13:24:02.3250824Z Progress (5): 477/658 kB | 15 kB | 346/373 kB | 105/509 kB | 15/147 kB
2026-09-21T13:24:02.3250990Z Progress (5): 477/658 kB | 15 kB | 346/373 kB | 137/509 kB | 15/147 kB
2026-09-21T13:24:02.3251151Z Progress (5): 477/658 kB | 15 kB | 373 kB | 137/509 kB | 15/147 kB    
2026-09-21T13:24:02.3251518Z Progress (5): 477/658 kB | 15 kB | 373 kB | 137/509 kB | 16/147 kB
2026-09-21T13:24:02.3251988Z Progress (5): 477/658 kB | 15 kB | 373 kB | 149/509 kB | 16/147 kB
2026-09-21T13:24:02.3252138Z Progress (5): 477/658 kB | 15 kB | 373 kB | 156/509 kB | 16/147 kB
2026-09-21T13:24:02.3255186Z Progress (5): 477/658 kB | 15 kB | 373 kB | 156/509 kB | 41/147 kB
2026-09-21T13:24:02.3255365Z Progress (5): 480/658 kB | 15 kB | 373 kB | 156/509 kB | 41/147 kB
2026-09-21T13:24:02.3255805Z Progress (5): 488/658 kB | 15 kB | 373 kB | 156/509 kB | 41/147 kB
2026-09-21T13:24:02.3257311Z Progress (5): 502/658 kB | 15 kB | 373 kB | 156/509 kB | 41/147 kB
2026-09-21T13:24:02.3257526Z Progress (5): 502/658 kB | 15 kB | 373 kB | 157/509 kB | 41/147 kB
2026-09-21T13:24:02.3257768Z Progress (5): 502/658 kB | 15 kB | 373 kB | 158/509 kB | 41/147 kB
2026-09-21T13:24:02.3258105Z Progress (5): 517/658 kB | 15 kB | 373 kB | 158/509 kB | 41/147 kB
2026-09-21T13:24:02.3258275Z                                                                   
2026-09-21T13:24:02.3258770Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-api/3.5.0/enforcer-api-3.5.0.jar (15 kB at 969 kB/s)
2026-09-21T13:24:02.3259203Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache-extras/beanshell/bsh/2.0b6/bsh-2.0b6.jar
2026-09-21T13:24:02.3259430Z Progress (4): 517/658 kB | 373 kB | 186/509 kB | 41/147 kB
2026-09-21T13:24:02.3259591Z Progress (4): 517/658 kB | 373 kB | 186/509 kB | 45/147 kB
2026-09-21T13:24:02.3259716Z Progress (4): 517/658 kB | 373 kB | 186/509 kB | 52/147 kB
2026-09-21T13:24:02.3259902Z Progress (4): 517/658 kB | 373 kB | 209/509 kB | 52/147 kB
2026-09-21T13:24:02.3260088Z Progress (4): 518/658 kB | 373 kB | 209/509 kB | 52/147 kB
2026-09-21T13:24:02.3262759Z Progress (4): 518/658 kB | 373 kB | 242/509 kB | 52/147 kB
2026-09-21T13:24:02.3262928Z Progress (4): 518/658 kB | 373 kB | 262/509 kB | 52/147 kB
2026-09-21T13:24:02.3263055Z Progress (4): 518/658 kB | 373 kB | 267/509 kB | 52/147 kB
2026-09-21T13:24:02.3263247Z Progress (4): 518/658 kB | 373 kB | 267/509 kB | 76/147 kB
2026-09-21T13:24:02.3263619Z Progress (4): 541/658 kB | 373 kB | 267/509 kB | 76/147 kB
2026-09-21T13:24:02.3264062Z Progress (4): 548/658 kB | 373 kB | 267/509 kB | 76/147 kB
2026-09-21T13:24:02.3264440Z Progress (4): 548/658 kB | 373 kB | 267/509 kB | 89/147 kB
2026-09-21T13:24:02.3264790Z Progress (4): 548/658 kB | 373 kB | 299/509 kB | 89/147 kB
2026-09-21T13:24:02.3264958Z Progress (4): 548/658 kB | 373 kB | 313/509 kB | 89/147 kB
2026-09-21T13:24:02.3266554Z Progress (4): 548/658 kB | 373 kB | 317/509 kB | 89/147 kB
2026-09-21T13:24:02.3266720Z Progress (4): 548/658 kB | 373 kB | 317/509 kB | 90/147 kB
2026-09-21T13:24:02.3266888Z Progress (4): 571/658 kB | 373 kB | 317/509 kB | 90/147 kB
2026-09-21T13:24:02.3267100Z Progress (4): 571/658 kB | 373 kB | 317/509 kB | 98/147 kB
2026-09-21T13:24:02.3269984Z Progress (4): 571/658 kB | 373 kB | 318/509 kB | 98/147 kB
2026-09-21T13:24:02.3270114Z Progress (4): 571/658 kB | 373 kB | 325/509 kB | 98/147 kB
2026-09-21T13:24:02.3270348Z Progress (4): 573/658 kB | 373 kB | 325/509 kB | 98/147 kB
2026-09-21T13:24:02.3270516Z Progress (4): 573/658 kB | 373 kB | 332/509 kB | 98/147 kB
2026-09-21T13:24:02.3270748Z Progress (4): 581/658 kB | 373 kB | 332/509 kB | 98/147 kB
2026-09-21T13:24:02.3271090Z Progress (4): 581/658 kB | 373 kB | 342/509 kB | 98/147 kB
2026-09-21T13:24:02.3271248Z Progress (4): 588/658 kB | 373 kB | 342/509 kB | 98/147 kB
2026-09-21T13:24:02.3271445Z Progress (4): 588/658 kB | 373 kB | 350/509 kB | 98/147 kB
2026-09-21T13:24:02.3271652Z Progress (4): 604/658 kB | 373 kB | 350/509 kB | 98/147 kB
2026-09-21T13:24:02.3271882Z Progress (4): 604/658 kB | 373 kB | 370/509 kB | 98/147 kB
2026-09-21T13:24:02.3272081Z Progress (4): 604/658 kB | 373 kB | 379/509 kB | 98/147 kB
2026-09-21T13:24:02.3272323Z Progress (4): 604/658 kB | 373 kB | 390/509 kB | 98/147 kB
2026-09-21T13:24:02.3272523Z Progress (4): 604/658 kB | 373 kB | 399/509 kB | 98/147 kB
2026-09-21T13:24:02.3272794Z Progress (4): 604/658 kB | 373 kB | 402/509 kB | 98/147 kB
2026-09-21T13:24:02.3272950Z Progress (4): 604/658 kB | 373 kB | 405/509 kB | 98/147 kB
2026-09-21T13:24:02.3273208Z Progress (4): 604/658 kB | 373 kB | 407/509 kB | 98/147 kB
2026-09-21T13:24:02.3273443Z Progress (4): 604/658 kB | 373 kB | 410/509 kB | 98/147 kB
2026-09-21T13:24:02.3275840Z Progress (4): 604/658 kB | 373 kB | 433/509 kB | 98/147 kB
2026-09-21T13:24:02.3276015Z Progress (4): 604/658 kB | 373 kB | 450/509 kB | 98/147 kB
2026-09-21T13:24:02.3276245Z Progress (4): 611/658 kB | 373 kB | 450/509 kB | 98/147 kB
2026-09-21T13:24:02.3276570Z Progress (4): 611/658 kB | 373 kB | 465/509 kB | 98/147 kB
2026-09-21T13:24:02.3276927Z Progress (4): 630/658 kB | 373 kB | 465/509 kB | 98/147 kB
2026-09-21T13:24:02.3277221Z Progress (4): 630/658 kB | 373 kB | 477/509 kB | 98/147 kB
2026-09-21T13:24:02.3277573Z Progress (4): 630/658 kB | 373 kB | 484/509 kB | 98/147 kB
2026-09-21T13:24:02.3278017Z Progress (4): 630/658 kB | 373 kB | 494/509 kB | 98/147 kB
2026-09-21T13:24:02.3278399Z Progress (4): 630/658 kB | 373 kB | 498/509 kB | 98/147 kB
2026-09-21T13:24:02.3286021Z Progress (4): 630/658 kB | 373 kB | 509 kB | 98/147 kB    
2026-09-21T13:24:02.3286186Z Progress (4): 658 kB | 373 kB | 509 kB | 98/147 kB    
2026-09-21T13:24:02.3286442Z                                                   
2026-09-21T13:24:02.3286804Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.17.0/commons-codec-1.17.0.jar (373 kB at 22 MB/s)
2026-09-21T13:24:02.3293323Z Progress (3): 658 kB | 509 kB | 101/147 kB
2026-09-21T13:24:02.3293478Z Progress (3): 658 kB | 509 kB | 131/147 kB
2026-09-21T13:24:02.3300547Z Progress (3): 658 kB | 509 kB | 147 kB    
2026-09-21T13:24:02.3301799Z Progress (4): 658 kB | 509 kB | 147 kB | 0.9/389 kB
2026-09-21T13:24:02.3301966Z Progress (4): 658 kB | 509 kB | 147 kB | 28/389 kB 
2026-09-21T13:24:02.3310617Z Progress (4): 658 kB | 509 kB | 147 kB | 33/389 kB
2026-09-21T13:24:02.3310765Z                                                   
2026-09-21T13:24:02.3311106Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.jar (658 kB at 33 MB/s)
2026-09-21T13:24:02.3311442Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar (509 kB at 25 MB/s)
2026-09-21T13:24:02.3341242Z Progress (2): 147 kB | 38/389 kB
2026-09-21T13:24:02.3341992Z Progress (2): 147 kB | 41/389 kB
2026-09-21T13:24:02.3343083Z Progress (2): 147 kB | 70/389 kB
2026-09-21T13:24:02.3369121Z Progress (2): 147 kB | 96/389 kB
2026-09-21T13:24:02.3373069Z Progress (2): 147 kB | 107/389 kB
2026-09-21T13:24:02.3373388Z Progress (2): 147 kB | 112/389 kB
2026-09-21T13:24:02.3373590Z Progress (2): 147 kB | 123/389 kB
2026-09-21T13:24:02.3373858Z Progress (2): 147 kB | 128/389 kB
2026-09-21T13:24:02.3376371Z Progress (2): 147 kB | 130/389 kB
2026-09-21T13:24:02.3376671Z Progress (2): 147 kB | 131/389 kB
2026-09-21T13:24:02.3376869Z Progress (2): 147 kB | 134/389 kB
2026-09-21T13:24:02.3377037Z Progress (2): 147 kB | 139/389 kB
2026-09-21T13:24:02.3379123Z Progress (2): 147 kB | 144/389 kB
2026-09-21T13:24:02.3379398Z Progress (2): 147 kB | 145/389 kB
2026-09-21T13:24:02.3379730Z Progress (2): 147 kB | 150/389 kB
2026-09-21T13:24:02.3380632Z Progress (2): 147 kB | 157/389 kB
2026-09-21T13:24:02.3388706Z Progress (2): 147 kB | 167/389 kB
2026-09-21T13:24:02.3388880Z                                  
2026-09-21T13:24:02.3389241Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/enforcer/enforcer-rules/3.5.0/enforcer-rules-3.5.0.jar (147 kB at 5.5 MB/s)
2026-09-21T13:24:02.3404163Z Progress (1): 172/389 kB
2026-09-21T13:24:02.3405416Z Progress (1): 205/389 kB
2026-09-21T13:24:02.3405819Z Progress (1): 228/389 kB
2026-09-21T13:24:02.3432363Z Progress (1): 241/389 kB
2026-09-21T13:24:02.3432733Z Progress (1): 242/389 kB
2026-09-21T13:24:02.3432961Z Progress (1): 252/389 kB
2026-09-21T13:24:02.3433193Z Progress (1): 273/389 kB
2026-09-21T13:24:02.3434160Z Progress (1): 276/389 kB
2026-09-21T13:24:02.3435688Z Progress (1): 286/389 kB
2026-09-21T13:24:02.3436079Z Progress (1): 297/389 kB
2026-09-21T13:24:02.3436488Z Progress (1): 308/389 kB
2026-09-21T13:24:02.3445827Z Progress (1): 319/389 kB
2026-09-21T13:24:02.3446066Z Progress (1): 325/389 kB
2026-09-21T13:24:02.3447667Z Progress (1): 339/389 kB
2026-09-21T13:24:02.3447906Z Progress (1): 361/389 kB
2026-09-21T13:24:02.3448186Z Progress (1): 377/389 kB
2026-09-21T13:24:02.3492910Z Progress (1): 389 kB    
2026-09-21T13:24:02.3493300Z                     
2026-09-21T13:24:02.3494020Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache-extras/beanshell/bsh/2.0b6/bsh-2.0b6.jar (389 kB at 10 MB/s)
2026-09-21T13:24:02.4721144Z [INFO] Rule 0: org.apache.maven.enforcer.rules.version.RequireJavaVersion passed
2026-09-21T13:24:02.4723246Z [INFO] Rule 1: org.apache.maven.enforcer.rules.BanDuplicatePomDependencyVersions passed
2026-09-21T13:24:02.4777319Z [INFO] Rule 2: org.apache.maven.enforcer.rules.dependency.RequireUpperBoundDeps passed
2026-09-21T13:24:02.4778940Z [INFO] 
2026-09-21T13:24:02.4779675Z [INFO] --- install:3.1.2:install (default-install) @ batch-platform ---
2026-09-21T13:24:02.4827510Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.9.18/maven-resolver-util-1.9.18.pom
2026-09-21T13:24:02.4904051Z Progress (1): 2.9 kB
2026-09-21T13:24:02.4904240Z                     
2026-09-21T13:24:02.4904697Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.9.18/maven-resolver-util-1.9.18.pom (2.9 kB at 357 kB/s)
2026-09-21T13:24:02.4958034Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver/1.9.18/maven-resolver-1.9.18.pom
2026-09-21T13:24:02.4984988Z Progress (1): 6.4/22 kB
2026-09-21T13:24:02.5018774Z Progress (1): 22 kB    
2026-09-21T13:24:02.5018933Z                    
2026-09-21T13:24:02.5019315Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver/1.9.18/maven-resolver-1.9.18.pom (22 kB at 3.7 MB/s)
2026-09-21T13:24:02.5080216Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/41/maven-parent-41.pom
2026-09-21T13:24:02.5115819Z Progress (1): 3.7/50 kB
2026-09-21T13:24:02.5116408Z Progress (1): 36/50 kB 
2026-09-21T13:24:02.5147279Z Progress (1): 50 kB   
2026-09-21T13:24:02.5147659Z                    
2026-09-21T13:24:02.5148144Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/41/maven-parent-41.pom (50 kB at 7.1 MB/s)
2026-09-21T13:24:02.5597663Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-api/1.9.18/maven-resolver-api-1.9.18.pom
2026-09-21T13:24:02.5658838Z Progress (1): 2.7 kB
2026-09-21T13:24:02.5659047Z                     
2026-09-21T13:24:02.5659473Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-api/1.9.18/maven-resolver-api-1.9.18.pom (2.7 kB at 446 kB/s)
2026-09-21T13:24:02.5733740Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.9.18/maven-resolver-util-1.9.18.jar
2026-09-21T13:24:02.5763147Z Progress (1): 7.7/196 kB
2026-09-21T13:24:02.5763969Z Progress (1): 40/196 kB 
2026-09-21T13:24:02.5764161Z Progress (1): 73/196 kB
2026-09-21T13:24:02.5767917Z Progress (1): 83/196 kB
2026-09-21T13:24:02.5768077Z Progress (1): 85/196 kB
2026-09-21T13:24:02.5769054Z Progress (1): 87/196 kB
2026-09-21T13:24:02.5769946Z Progress (1): 101/196 kB
2026-09-21T13:24:02.5770529Z Progress (1): 134/196 kB
2026-09-21T13:24:02.5771083Z Progress (1): 153/196 kB
2026-09-21T13:24:02.5775701Z Progress (1): 172/196 kB
2026-09-21T13:24:02.5778233Z Progress (1): 181/196 kB
2026-09-21T13:24:02.5778497Z Progress (1): 186/196 kB
2026-09-21T13:24:02.5807537Z Progress (1): 196 kB    
2026-09-21T13:24:02.5807898Z                     
2026-09-21T13:24:02.5808334Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-util/1.9.18/maven-resolver-util-1.9.18.jar (196 kB at 28 MB/s)
2026-09-21T13:24:02.5815958Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-api/1.9.18/maven-resolver-api-1.9.18.jar
2026-09-21T13:24:02.5848135Z Progress (1): 7.7/157 kB
2026-09-21T13:24:02.5849691Z Progress (1): 40/157 kB 
2026-09-21T13:24:02.5849808Z Progress (1): 73/157 kB
2026-09-21T13:24:02.5853131Z Progress (1): 94/157 kB
2026-09-21T13:24:02.5854022Z Progress (1): 96/157 kB
2026-09-21T13:24:02.5861012Z Progress (1): 97/157 kB
2026-09-21T13:24:02.5861220Z Progress (1): 130/157 kB
2026-09-21T13:24:02.5893342Z Progress (1): 157 kB    
2026-09-21T13:24:02.5893761Z                     
2026-09-21T13:24:02.5894424Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/resolver/maven-resolver-api/1.9.18/maven-resolver-api-1.9.18.jar (157 kB at 17 MB/s)
2026-09-21T13:24:02.6106119Z [INFO] Installing /opt/ads-agent/_work/4/s/batch-platform/pom.xml to /opt/ads-agent/cache-tools/.m2/repository/br/gov/caixa/siifx/caixinhas/batch-platform/1.0-SNAPSHOT/batch-platform-1.0-SNAPSHOT.pom
2026-09-21T13:24:02.6155723Z [INFO] 
2026-09-21T13:24:02.6156551Z [INFO] -------------< br.gov.caixa.siifx.caixinhas:platform-bom >--------------
2026-09-21T13:24:02.6156816Z [INFO] Building platform-bom 1.0-SNAPSHOT                                 [2/4]
2026-09-21T13:24:02.6156983Z [INFO]   from platform-bom/pom.xml
2026-09-21T13:24:02.6157223Z [INFO] --------------------------------[ pom ]---------------------------------
2026-09-21T13:24:02.6186240Z [INFO] 
2026-09-21T13:24:02.6186540Z [INFO] --- clean:3.2.0:clean (default-clean) @ platform-bom ---
2026-09-21T13:24:02.6196017Z [INFO] 
2026-09-21T13:24:02.6196207Z [INFO] --- enforcer:3.5.0:enforce (enforce-rules) @ platform-bom ---
2026-09-21T13:24:02.6213481Z [INFO] Rule 1: org.apache.maven.enforcer.rules.BanDuplicatePomDependencyVersions passed
2026-09-21T13:24:02.6235728Z [INFO] Rule 2: org.apache.maven.enforcer.rules.dependency.RequireUpperBoundDeps passed
2026-09-21T13:24:02.6236069Z [INFO] 
2026-09-21T13:24:02.6237506Z [INFO] --- install:3.1.2:install (default-install) @ platform-bom ---
2026-09-21T13:24:02.6244572Z [INFO] Installing /opt/ads-agent/_work/4/s/batch-platform/platform-bom/pom.xml to /opt/ads-agent/cache-tools/.m2/repository/br/gov/caixa/siifx/caixinhas/platform-bom/1.0-SNAPSHOT/platform-bom-1.0-SNAPSHOT.pom
2026-09-21T13:24:02.6269887Z [INFO] 
2026-09-21T13:24:02.6270128Z [INFO] -------------< br.gov.caixa.siifx.caixinhas:core-starter >--------------
2026-09-21T13:24:02.6270390Z [INFO] Building core-starter 1.0-SNAPSHOT                                 [3/4]
2026-09-21T13:24:02.6270590Z [INFO]   from core-starter/pom.xml
2026-09-21T13:24:02.6271976Z [INFO] --------------------------------[ jar ]---------------------------------
2026-09-21T13:24:02.6281384Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/jacoco-maven-plugin/0.8.12/jacoco-maven-plugin-0.8.12.pom
2026-09-21T13:24:02.6324046Z Progress (1): 2.3/4.2 kB
2026-09-21T13:24:02.6362990Z Progress (1): 4.2 kB    
2026-09-21T13:24:02.6363492Z                     
2026-09-21T13:24:02.6364054Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/jacoco-maven-plugin/0.8.12/jacoco-maven-plugin-0.8.12.pom (4.2 kB at 470 kB/s)
2026-09-21T13:24:02.6824433Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.build/0.8.12/org.jacoco.build-0.8.12.pom
2026-09-21T13:24:02.6864024Z Progress (1): 7.7/43 kB
2026-09-21T13:24:02.6864209Z Progress (1): 41/43 kB 
2026-09-21T13:24:02.6900361Z Progress (1): 43 kB   
2026-09-21T13:24:02.6901357Z                    
2026-09-21T13:24:02.6901858Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.build/0.8.12/org.jacoco.build-0.8.12.pom (43 kB at 6.1 MB/s)
2026-09-21T13:24:02.7308932Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-bom/9.7/asm-bom-9.7.pom
2026-09-21T13:24:02.7383173Z Progress (1): 3.3 kB
2026-09-21T13:24:02.7383308Z                     
2026-09-21T13:24:02.7383717Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-bom/9.7/asm-bom-9.7.pom (3.3 kB at 407 kB/s)
2026-09-21T13:24:02.7597543Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/jacoco-maven-plugin/0.8.12/jacoco-maven-plugin-0.8.12.jar
2026-09-21T13:24:02.7632978Z Progress (1): 0.9/57 kB
2026-09-21T13:24:02.7635414Z Progress (1): 34/57 kB 
2026-09-21T13:24:02.7670332Z Progress (1): 57 kB   
2026-09-21T13:24:02.7670452Z                    
2026-09-21T13:24:02.7670885Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/jacoco-maven-plugin/0.8.12/jacoco-maven-plugin-0.8.12.jar (57 kB at 8.2 MB/s)
2026-09-21T13:24:02.7756321Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom
2026-09-21T13:24:02.7781442Z Progress (1): 7.7/8.2 kB
2026-09-21T13:24:02.7815368Z Progress (1): 8.2 kB    
2026-09-21T13:24:02.7815547Z                     
2026-09-21T13:24:02.7816017Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom (8.2 kB at 1.2 MB/s)
2026-09-21T13:24:02.7869281Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom
2026-09-21T13:24:02.7897814Z Progress (1): 2.3/8.1 kB
2026-09-21T13:24:02.7926557Z Progress (1): 8.1 kB    
2026-09-21T13:24:02.7926784Z                     
2026-09-21T13:24:02.7927233Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom (8.1 kB at 1.3 MB/s)
2026-09-21T13:24:02.7990477Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/39/maven-parent-39.pom
2026-09-21T13:24:02.8014229Z Progress (1): 2.3/48 kB
2026-09-21T13:24:02.8014347Z Progress (1): 35/48 kB 
2026-09-21T13:24:02.8042047Z Progress (1): 48 kB   
2026-09-21T13:24:02.8042239Z                    
2026-09-21T13:24:02.8042727Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/39/maven-parent-39.pom (48 kB at 8.0 MB/s)
2026-09-21T13:24:02.8304831Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar
2026-09-21T13:24:02.8347178Z Progress (1): 7.7/31 kB
2026-09-21T13:24:02.8410821Z Progress (1): 31 kB    
2026-09-21T13:24:02.8411470Z                    
2026-09-21T13:24:02.8411942Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar (31 kB at 3.1 MB/s)
2026-09-21T13:24:02.8475607Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.pom
2026-09-21T13:24:02.8552207Z Progress (1): 7.7/10 kB
2026-09-21T13:24:02.8607827Z Progress (1): 10 kB    
2026-09-21T13:24:02.8608049Z                    
2026-09-21T13:24:02.8608469Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.pom (10 kB at 803 kB/s)
2026-09-21T13:24:02.8663788Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/41/maven-plugins-41.pom
2026-09-21T13:24:02.8780837Z Progress (1): 7.4 kB
2026-09-21T13:24:02.8781065Z                     
2026-09-21T13:24:02.8781503Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-plugins/41/maven-plugins-41.pom (7.4 kB at 613 kB/s)
2026-09-21T13:24:02.8855906Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.jar
2026-09-21T13:24:02.8943142Z Progress (1): 0.9/83 kB
2026-09-21T13:24:02.8955791Z Progress (1): 33/83 kB 
2026-09-21T13:24:02.8956100Z Progress (1): 34/83 kB
2026-09-21T13:24:02.8957955Z Progress (1): 44/83 kB
2026-09-21T13:24:02.8958096Z Progress (1): 49/83 kB
2026-09-21T13:24:02.8958195Z Progress (1): 51/83 kB
2026-09-21T13:24:02.8958325Z Progress (1): 55/83 kB
2026-09-21T13:24:02.8958468Z Progress (1): 60/83 kB
2026-09-21T13:24:02.8958593Z Progress (1): 64/83 kB
2026-09-21T13:24:02.9104874Z Progress (1): 83 kB   
2026-09-21T13:24:02.9105016Z                    
2026-09-21T13:24:02.9105594Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.jar (83 kB at 3.3 MB/s)
2026-09-21T13:24:02.9184327Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.pom
2026-09-21T13:24:02.9246008Z Progress (1): 5.3 kB
2026-09-21T13:24:02.9246192Z                     
2026-09-21T13:24:02.9246628Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.pom (5.3 kB at 886 kB/s)
2026-09-21T13:24:02.9304132Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire/3.2.5/surefire-3.2.5.pom
2026-09-21T13:24:02.9327885Z Progress (1): 5.0/22 kB
2026-09-21T13:24:02.9355892Z Progress (1): 22 kB    
2026-09-21T13:24:02.9356185Z                    
2026-09-21T13:24:02.9356609Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire/3.2.5/surefire-3.2.5.pom (22 kB at 4.4 MB/s)
2026-09-21T13:24:02.9625497Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.jar
2026-09-21T13:24:02.9655294Z Progress (1): 7.7/45 kB
2026-09-21T13:24:02.9655481Z Progress (1): 41/45 kB 
2026-09-21T13:24:02.9732360Z Progress (1): 45 kB   
2026-09-21T13:24:02.9732497Z                    
2026-09-21T13:24:02.9732987Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.jar (45 kB at 4.1 MB/s)
2026-09-21T13:24:02.9817035Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.pom
2026-09-21T13:24:02.9865408Z Progress (1): 2.3/7.8 kB
2026-09-21T13:24:02.9936518Z Progress (1): 7.8 kB    
2026-09-21T13:24:02.9936756Z                     
2026-09-21T13:24:02.9937308Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.pom (7.8 kB at 651 kB/s)
2026-09-21T13:24:03.0364084Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.jar
2026-09-21T13:24:03.0469788Z Progress (1): 7.7/34 kB
2026-09-21T13:24:03.0530722Z Progress (1): 34 kB    
2026-09-21T13:24:03.0531098Z                    
2026-09-21T13:24:03.0531958Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-jar-plugin/3.4.1/maven-jar-plugin-3.4.1.jar (34 kB at 2.0 MB/s)
2026-09-21T13:24:03.0635289Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-autoconfigure/3.5.16/spring-boot-autoconfigure-3.5.16.pom
2026-09-21T13:24:03.0739649Z Progress (1): 2.1 kB
2026-09-21T13:24:03.0739872Z                     
2026-09-21T13:24:03.0740596Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-autoconfigure/3.5.16/spring-boot-autoconfigure-3.5.16.pom (2.1 kB at 206 kB/s)
2026-09-21T13:24:03.0931808Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot/3.5.16/spring-boot-3.5.16.pom
2026-09-21T13:24:03.1030547Z Progress (1): 2.2 kB
2026-09-21T13:24:03.1030979Z                     
2026-09-21T13:24:03.1031538Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot/3.5.16/spring-boot-3.5.16.pom (2.2 kB at 220 kB/s)
2026-09-21T13:24:03.1091110Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-core/6.2.19/spring-core-6.2.19.pom
2026-09-21T13:24:03.1165333Z Progress (1): 2.0 kB
2026-09-21T13:24:03.1165534Z                     
2026-09-21T13:24:03.1165922Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-core/6.2.19/spring-core-6.2.19.pom (2.0 kB at 253 kB/s)
2026-09-21T13:24:03.1551365Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jcl/6.2.19/spring-jcl-6.2.19.pom
2026-09-21T13:24:03.1665917Z Progress (1): 1.8 kB
2026-09-21T13:24:03.1666134Z                     
2026-09-21T13:24:03.1666549Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jcl/6.2.19/spring-jcl-6.2.19.pom (1.8 kB at 154 kB/s)
2026-09-21T13:24:03.1720742Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-context/6.2.19/spring-context-6.2.19.pom
2026-09-21T13:24:03.1759475Z Progress (1): 2.3/2.8 kB
2026-09-21T13:24:03.1805584Z Progress (1): 2.8 kB    
2026-09-21T13:24:03.1805928Z                     
2026-09-21T13:24:03.1806223Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-context/6.2.19/spring-context-6.2.19.pom (2.8 kB at 309 kB/s)
2026-09-21T13:24:03.2030553Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-aop/6.2.19/spring-aop-6.2.19.pom
2026-09-21T13:24:03.2132293Z Progress (1): 2.2 kB
2026-09-21T13:24:03.2132545Z                     
2026-09-21T13:24:03.2133190Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-aop/6.2.19/spring-aop-6.2.19.pom (2.2 kB at 221 kB/s)
2026-09-21T13:24:03.2316184Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-beans/6.2.19/spring-beans-6.2.19.pom
2026-09-21T13:24:03.2393572Z Progress (1): 0.9/2.0 kB
2026-09-21T13:24:03.2502151Z Progress (1): 2.0 kB    
2026-09-21T13:24:03.2502260Z                     
2026-09-21T13:24:03.2503366Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-beans/6.2.19/spring-beans-6.2.19.pom (2.0 kB at 102 kB/s)
2026-09-21T13:24:03.2586847Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-expression/6.2.19/spring-expression-6.2.19.pom
2026-09-21T13:24:03.2630765Z Progress (1): 0.9/2.1 kB
2026-09-21T13:24:03.2685076Z Progress (1): 2.1 kB    
2026-09-21T13:24:03.2685256Z                     
2026-09-21T13:24:03.2685678Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-expression/6.2.19/spring-expression-6.2.19.pom (2.1 kB at 208 kB/s)
2026-09-21T13:24:03.2742918Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.15.12/micrometer-observation-1.15.12.pom
2026-09-21T13:24:03.2857846Z Progress (1): 3.8 kB
2026-09-21T13:24:03.2858117Z                     
2026-09-21T13:24:03.2858579Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.15.12/micrometer-observation-1.15.12.pom (3.8 kB at 320 kB/s)
2026-09-21T13:24:03.2920864Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.15.12/micrometer-commons-1.15.12.pom
2026-09-21T13:24:03.3005466Z Progress (1): 3.4 kB
2026-09-21T13:24:03.3005813Z                     
2026-09-21T13:24:03.3007066Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.15.12/micrometer-commons-1.15.12.pom (3.4 kB at 379 kB/s)
2026-09-21T13:24:03.3061865Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-configuration-processor/3.5.16/spring-boot-configuration-processor-3.5.16.pom
2026-09-21T13:24:03.3114479Z Progress (1): 0.9/1.9 kB
2026-09-21T13:24:03.3167280Z Progress (1): 1.9 kB    
2026-09-21T13:24:03.3167753Z                     
2026-09-21T13:24:03.3168434Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-configuration-processor/3.5.16/spring-boot-configuration-processor-3.5.16.pom (1.9 kB at 171 kB/s)
2026-09-21T13:24:03.3219231Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-batch/3.5.16/spring-boot-starter-batch-3.5.16.pom
2026-09-21T13:24:03.3279607Z Progress (1): 0.9/2.5 kB
2026-09-21T13:24:03.3334601Z Progress (1): 2.5 kB    
2026-09-21T13:24:03.3334731Z                     
2026-09-21T13:24:03.3335174Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-batch/3.5.16/spring-boot-starter-batch-3.5.16.pom (2.5 kB at 206 kB/s)
2026-09-21T13:24:03.3397209Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter/3.5.16/spring-boot-starter-3.5.16.pom
2026-09-21T13:24:03.3449667Z Progress (1): 0.9/3.0 kB
2026-09-21T13:24:03.3512937Z Progress (1): 3.0 kB    
2026-09-21T13:24:03.3513212Z                     
2026-09-21T13:24:03.3513737Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter/3.5.16/spring-boot-starter-3.5.16.pom (3.0 kB at 254 kB/s)
2026-09-21T13:24:03.3578272Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-logging/3.5.16/spring-boot-starter-logging-3.5.16.pom
2026-09-21T13:24:03.3637310Z Progress (1): 0.9/2.5 kB
2026-09-21T13:24:03.3682381Z Progress (1): 2.5 kB    
2026-09-21T13:24:03.3682603Z                     
2026-09-21T13:24:03.3683131Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-logging/3.5.16/spring-boot-starter-logging-3.5.16.pom (2.5 kB at 224 kB/s)
2026-09-21T13:24:03.3740908Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.pom
2026-09-21T13:24:03.3784869Z Progress (1): 5.0/16 kB
2026-09-21T13:24:03.3851530Z Progress (1): 16 kB    
2026-09-21T13:24:03.3852241Z                    
2026-09-21T13:24:03.3852612Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.pom (16 kB at 1.3 MB/s)
2026-09-21T13:24:03.3919607Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-parent/1.5.34/logback-parent-1.5.34.pom
2026-09-21T13:24:03.4154209Z Progress (1): 7.7/20 kB
2026-09-21T13:24:03.4213557Z Progress (1): 20 kB    
2026-09-21T13:24:03.4213719Z                    
2026-09-21T13:24:03.4214480Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-parent/1.5.34/logback-parent-1.5.34.pom (20 kB at 667 kB/s)
2026-09-21T13:24:03.4286369Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.pom
2026-09-21T13:24:03.4371284Z Progress (1): 0.9/9.4 kB
2026-09-21T13:24:03.4419448Z Progress (1): 9.4 kB    
2026-09-21T13:24:03.4419617Z                     
2026-09-21T13:24:03.4420052Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.pom (9.4 kB at 725 kB/s)
2026-09-21T13:24:03.4595846Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.pom
2026-09-21T13:24:03.4747259Z Progress (1): 2.8 kB
2026-09-21T13:24:03.4747514Z                     
2026-09-21T13:24:03.4748035Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.pom (2.8 kB at 188 kB/s)
2026-09-21T13:24:03.4954389Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-parent/2.0.18/slf4j-parent-2.0.18.pom
2026-09-21T13:24:03.5001022Z Progress (1): 0.9/13 kB
2026-09-21T13:24:03.5041841Z Progress (1): 13 kB    
2026-09-21T13:24:03.5041989Z                    
2026-09-21T13:24:03.5042858Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-parent/2.0.18/slf4j-parent-2.0.18.pom (13 kB at 1.5 MB/s)
2026-09-21T13:24:03.5094202Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-bom/2.0.18/slf4j-bom-2.0.18.pom
2026-09-21T13:24:03.5157653Z Progress (1): 5.0/7.9 kB
2026-09-21T13:24:03.5230741Z Progress (1): 7.9 kB    
2026-09-21T13:24:03.5231550Z                     
2026-09-21T13:24:03.5232007Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-bom/2.0.18/slf4j-bom-2.0.18.pom (7.9 kB at 562 kB/s)
2026-09-21T13:24:03.5306846Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-to-slf4j/2.24.3/log4j-to-slf4j-2.24.3.pom
2026-09-21T13:24:03.5367040Z Progress (1): 3.7/5.0 kB
2026-09-21T13:24:03.5413712Z Progress (1): 5.0 kB    
2026-09-21T13:24:03.5414153Z                     
2026-09-21T13:24:03.5414623Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-to-slf4j/2.24.3/log4j-to-slf4j-2.24.3.pom (5.0 kB at 458 kB/s)
2026-09-21T13:24:03.5474530Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j/2.24.3/log4j-2.24.3.pom
2026-09-21T13:24:03.5500546Z Progress (1): 0.9/35 kB
2026-09-21T13:24:03.5500665Z Progress (1): 34/35 kB 
2026-09-21T13:24:03.5536160Z Progress (1): 35 kB   
2026-09-21T13:24:03.5536656Z                    
2026-09-21T13:24:03.5537202Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j/2.24.3/log4j-2.24.3.pom (35 kB at 5.8 MB/s)
2026-09-21T13:24:03.5630714Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/groovy/groovy-bom/4.0.22/groovy-bom-4.0.22.pom
2026-09-21T13:24:03.5660825Z Progress (1): 2.3/27 kB
2026-09-21T13:24:03.5691457Z Progress (1): 27 kB    
2026-09-21T13:24:03.5691795Z                    
2026-09-21T13:24:03.5692284Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/groovy/groovy-bom/4.0.22/groovy-bom-4.0.22.pom (27 kB at 3.9 MB/s)
2026-09-21T13:24:03.5749935Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-bom/2.17.2/jackson-bom-2.17.2.pom
2026-09-21T13:24:03.5783903Z Progress (1): 7.7/19 kB
2026-09-21T13:24:03.5817778Z Progress (1): 19 kB    
2026-09-21T13:24:03.5817947Z                    
2026-09-21T13:24:03.5820429Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-bom/2.17.2/jackson-bom-2.17.2.pom (19 kB at 2.7 MB/s)
2026-09-21T13:24:03.5877581Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-parent/2.17/jackson-parent-2.17.pom
2026-09-21T13:24:03.5904850Z Progress (1): 5.0/6.5 kB
2026-09-21T13:24:03.5934155Z Progress (1): 6.5 kB    
2026-09-21T13:24:03.5934330Z                     
2026-09-21T13:24:03.5934771Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-parent/2.17/jackson-parent-2.17.pom (6.5 kB at 1.1 MB/s)
2026-09-21T13:24:03.5983558Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/oss-parent/58/oss-parent-58.pom
2026-09-21T13:24:03.6007595Z Progress (1): 6.4/24 kB
2026-09-21T13:24:03.6035891Z Progress (1): 24 kB    
2026-09-21T13:24:03.6036033Z                    
2026-09-21T13:24:03.6036337Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/oss-parent/58/oss-parent-58.pom (24 kB at 4.7 MB/s)
2026-09-21T13:24:03.6125773Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.10.3/junit-bom-5.10.3.pom
2026-09-21T13:24:03.6177634Z Progress (1): 5.6 kB
2026-09-21T13:24:03.6177800Z                     
2026-09-21T13:24:03.6178181Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.10.3/junit-bom-5.10.3.pom (5.6 kB at 1.1 MB/s)
2026-09-21T13:24:03.6235006Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-framework-bom/5.3.39/spring-framework-bom-5.3.39.pom
2026-09-21T13:24:03.6256354Z Progress (1): 0.9/5.7 kB
2026-09-21T13:24:03.6283599Z Progress (1): 5.7 kB    
2026-09-21T13:24:03.6284073Z                     
2026-09-21T13:24:03.6284593Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-framework-bom/5.3.39/spring-framework-bom-5.3.39.pom (5.7 kB at 1.1 MB/s)
2026-09-21T13:24:03.6534879Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-api/2.24.3/log4j-api-2.24.3.pom
2026-09-21T13:24:03.6611857Z Progress (1): 4.4 kB
2026-09-21T13:24:03.6612066Z                     
2026-09-21T13:24:03.6612483Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-api/2.24.3/log4j-api-2.24.3.pom (4.4 kB at 551 kB/s)
2026-09-21T13:24:03.6696156Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.pom
2026-09-21T13:24:03.6822573Z Progress (1): 1.1 kB
2026-09-21T13:24:03.6822753Z                     
2026-09-21T13:24:03.6824502Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.pom (1.1 kB at 84 kB/s)
2026-09-21T13:24:03.6885647Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.pom
2026-09-21T13:24:03.6910272Z Progress (1): 7.7/16 kB
2026-09-21T13:24:03.6936119Z Progress (1): 16 kB    
2026-09-21T13:24:03.6936226Z                    
2026-09-21T13:24:03.6936646Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.pom (16 kB at 3.2 MB/s)
2026-09-21T13:24:03.7001630Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/yaml/snakeyaml/2.5/snakeyaml-2.5.pom
2026-09-21T13:24:03.7026762Z Progress (1): 2.3/21 kB
2026-09-21T13:24:03.7027382Z Progress (1): 19/21 kB 
2026-09-21T13:24:03.7028079Z Progress (1): 20/21 kB
2026-09-21T13:24:03.7064281Z Progress (1): 21 kB   
2026-09-21T13:24:03.7064540Z                    
2026-09-21T13:24:03.7065277Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/yaml/snakeyaml/2.5/snakeyaml-2.5.pom (21 kB at 3.0 MB/s)
2026-09-21T13:24:03.7123997Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-jdbc/3.5.16/spring-boot-starter-jdbc-3.5.16.pom
2026-09-21T13:24:03.7222236Z Progress (1): 2.3/2.5 kB
2026-09-21T13:24:03.7282370Z Progress (1): 2.5 kB    
2026-09-21T13:24:03.7282494Z                     
2026-09-21T13:24:03.7282970Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-jdbc/3.5.16/spring-boot-starter-jdbc-3.5.16.pom (2.5 kB at 153 kB/s)
2026-09-21T13:24:03.7340153Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/zaxxer/HikariCP/6.3.3/HikariCP-6.3.3.pom
2026-09-21T13:24:03.7420571Z Progress (1): 7.7/29 kB
2026-09-21T13:24:03.7468251Z Progress (1): 29 kB    
2026-09-21T13:24:03.7468620Z                    
2026-09-21T13:24:03.7469146Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/zaxxer/HikariCP/6.3.3/HikariCP-6.3.3.pom (29 kB at 2.2 MB/s)
2026-09-21T13:24:03.7540582Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jdbc/6.2.19/spring-jdbc-6.2.19.pom
2026-09-21T13:24:03.7664474Z Progress (1): 2.4 kB
2026-09-21T13:24:03.7664606Z                     
2026-09-21T13:24:03.7665034Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jdbc/6.2.19/spring-jdbc-6.2.19.pom (2.4 kB at 184 kB/s)
2026-09-21T13:24:03.7721176Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-tx/6.2.19/spring-tx-6.2.19.pom
2026-09-21T13:24:03.7952277Z Progress (1): 2.2 kB
2026-09-21T13:24:03.7952566Z                     
2026-09-21T13:24:03.7953037Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-tx/6.2.19/spring-tx-6.2.19.pom (2.2 kB at 93 kB/s)
2026-09-21T13:24:03.8010690Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-core/5.2.6/spring-batch-core-5.2.6.pom
2026-09-21T13:24:03.8384338Z Progress (1): 6.9 kB
2026-09-21T13:24:03.8384627Z                     
2026-09-21T13:24:03.8385173Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-core/5.2.6/spring-batch-core-5.2.6.pom (6.9 kB at 180 kB/s)
2026-09-21T13:24:03.8439815Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-infrastructure/5.2.6/spring-batch-infrastructure-5.2.6.pom
2026-09-21T13:24:03.8727437Z Progress (1): 7.7/10 kB
2026-09-21T13:24:03.9096820Z Progress (1): 10 kB    
2026-09-21T13:24:03.9096987Z                    
2026-09-21T13:24:03.9097583Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-infrastructure/5.2.6/spring-batch-infrastructure-5.2.6.pom (10 kB at 158 kB/s)
2026-09-21T13:24:03.9153556Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/retry/spring-retry/2.0.13/spring-retry-2.0.13.pom
2026-09-21T13:24:03.9752122Z Progress (1): 2.5 kB
2026-09-21T13:24:03.9752414Z                     
2026-09-21T13:24:03.9752990Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/retry/spring-retry/2.0.13/spring-retry-2.0.13.pom (2.5 kB at 42 kB/s)
2026-09-21T13:24:03.9814824Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.15.12/micrometer-core-1.15.12.pom
2026-09-21T13:24:04.0200712Z Progress (1): 7.7/11 kB
2026-09-21T13:24:04.0446951Z Progress (1): 11 kB    
2026-09-21T13:24:04.0447225Z                    
2026-09-21T13:24:04.0447800Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.15.12/micrometer-core-1.15.12.pom (11 kB at 174 kB/s)
2026-09-21T13:24:04.0510158Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hdrhistogram/HdrHistogram/2.2.2/HdrHistogram-2.2.2.pom
2026-09-21T13:24:04.0544239Z Progress (1): 7.7/13 kB
2026-09-21T13:24:04.0577438Z Progress (1): 13 kB    
2026-09-21T13:24:04.0577597Z                    
2026-09-21T13:24:04.0578014Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hdrhistogram/HdrHistogram/2.2.2/HdrHistogram-2.2.2.pom (13 kB at 1.8 MB/s)
2026-09-21T13:24:04.0646962Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.pom
2026-09-21T13:24:04.0672271Z Progress (1): 0.9/7.2 kB
2026-09-21T13:24:04.0705509Z Progress (1): 7.2 kB    
2026-09-21T13:24:04.0705609Z                     
2026-09-21T13:24:04.0706057Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.pom (7.2 kB at 1.2 MB/s)
2026-09-21T13:24:04.1062998Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/spring-data-commons/3.5.13/spring-data-commons-3.5.13.pom
2026-09-21T13:24:04.1493590Z Progress (1): 5.0/10 kB
2026-09-21T13:24:04.1845523Z Progress (1): 10 kB    
2026-09-21T13:24:04.1845726Z                    
2026-09-21T13:24:04.1846275Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/spring-data-commons/3.5.13/spring-data-commons-3.5.13.pom (10 kB at 128 kB/s)
2026-09-21T13:24:04.1900848Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/build/spring-data-parent/3.5.13/spring-data-parent-3.5.13.pom
2026-09-21T13:24:04.2534782Z Progress (1): 7.7/44 kB
2026-09-21T13:24:04.2535076Z Progress (1): 41/44 kB 
2026-09-21T13:24:04.3049666Z Progress (1): 44 kB   
2026-09-21T13:24:04.3050128Z                    
2026-09-21T13:24:04.3050716Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/build/spring-data-parent/3.5.13/spring-data-parent-3.5.13.pom (44 kB at 383 kB/s)
2026-09-21T13:24:04.3119400Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/build/spring-data-build/3.5.13/spring-data-build-3.5.13.pom
2026-09-21T13:24:05.5962938Z Progress (1): 7.2 kB
2026-09-21T13:24:05.5963269Z                     
2026-09-21T13:24:05.5963981Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/build/spring-data-build/3.5.13/spring-data-build-3.5.13.pom (7.2 kB at 5.6 kB/s)
2026-09-21T13:24:05.6024776Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-tracing-bom/1.5.12/micrometer-tracing-bom-1.5.12.pom
2026-09-21T13:24:05.6655087Z Progress (1): 4.4 kB
2026-09-21T13:24:05.6655299Z                     
2026-09-21T13:24:05.6655841Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-tracing-bom/1.5.12/micrometer-tracing-bom-1.5.12.pom (4.4 kB at 70 kB/s)
2026-09-21T13:24:05.6715013Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.9.0/kotlinx-coroutines-bom-1.9.0.pom
2026-09-21T13:24:05.6789867Z Progress (1): 0.9/4.3 kB
2026-09-21T13:24:05.6832258Z Progress (1): 4.3 kB    
2026-09-21T13:24:05.6832435Z                     
2026-09-21T13:24:05.6832910Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.9.0/kotlinx-coroutines-bom-1.9.0.pom (4.3 kB at 358 kB/s)
2026-09-21T13:24:05.7097989Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-bom/2.19.4/jackson-bom-2.19.4.pom
2026-09-21T13:24:05.7163167Z Progress (1): 0.9/20 kB
2026-09-21T13:24:05.7164107Z Progress (1): 13/20 kB 
2026-09-21T13:24:05.7164812Z Progress (1): 16/20 kB
2026-09-21T13:24:05.7168054Z Progress (1): 19/20 kB
2026-09-21T13:24:05.7168249Z Progress (1): 20/20 kB
2026-09-21T13:24:05.7209561Z Progress (1): 20 kB   
2026-09-21T13:24:05.7209917Z                    
2026-09-21T13:24:05.7210682Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-bom/2.19.4/jackson-bom-2.19.4.pom (20 kB at 1.8 MB/s)
2026-09-21T13:24:05.7265544Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-parent/2.19.3/jackson-parent-2.19.3.pom
2026-09-21T13:24:05.7406539Z Progress (1): 7.2 kB
2026-09-21T13:24:05.7406789Z                     
2026-09-21T13:24:05.7407235Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-parent/2.19.3/jackson-parent-2.19.3.pom (7.2 kB at 513 kB/s)
2026-09-21T13:24:05.7473451Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/oss-parent/69/oss-parent-69.pom
2026-09-21T13:24:05.7505853Z Progress (1): 7.7/24 kB
2026-09-21T13:24:05.7506238Z Progress (1): 17/24 kB 
2026-09-21T13:24:05.7509084Z Progress (1): 19/24 kB
2026-09-21T13:24:05.7509247Z Progress (1): 21/24 kB
2026-09-21T13:24:05.7543539Z Progress (1): 24 kB   
2026-09-21T13:24:05.7547373Z                    
2026-09-21T13:24:05.7547842Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/oss-parent/69/oss-parent-69.pom (24 kB at 3.4 MB/s)
2026-09-21T13:24:05.7741500Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-actuator/3.5.16/spring-boot-starter-actuator-3.5.16.pom
2026-09-21T13:24:05.7853792Z Progress (1): 2.8 kB
2026-09-21T13:24:05.7854112Z                     
2026-09-21T13:24:05.7854573Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-actuator/3.5.16/spring-boot-starter-actuator-3.5.16.pom (2.8 kB at 231 kB/s)
2026-09-21T13:24:05.8100789Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator-autoconfigure/3.5.16/spring-boot-actuator-autoconfigure-3.5.16.pom
2026-09-21T13:24:05.8215359Z Progress (1): 2.9 kB
2026-09-21T13:24:05.8215490Z                     
2026-09-21T13:24:05.8216382Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator-autoconfigure/3.5.16/spring-boot-actuator-autoconfigure-3.5.16.pom (2.9 kB at 241 kB/s)
2026-09-21T13:24:05.8334192Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator/3.5.16/spring-boot-actuator-3.5.16.pom
2026-09-21T13:24:05.8445501Z Progress (1): 2.0 kB
2026-09-21T13:24:05.8445841Z                     
2026-09-21T13:24:05.8446400Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator/3.5.16/spring-boot-actuator-3.5.16.pom (2.0 kB at 186 kB/s)
2026-09-21T13:24:05.8779178Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-databind/2.21.4/jackson-databind-2.21.4.pom
2026-09-21T13:24:05.8844866Z Progress (1): 0.9/23 kB
2026-09-21T13:24:05.8885598Z Progress (1): 23 kB    
2026-09-21T13:24:05.8886425Z                    
2026-09-21T13:24:05.8886964Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-databind/2.21.4/jackson-databind-2.21.4.pom (23 kB at 2.1 MB/s)
2026-09-21T13:24:05.8955669Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-base/2.21.4/jackson-base-2.21.4.pom
2026-09-21T13:24:05.8998528Z Progress (1): 2.3/13 kB
2026-09-21T13:24:05.9026022Z Progress (1): 13 kB    
2026-09-21T13:24:05.9026181Z                    
2026-09-21T13:24:05.9026618Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/jackson-base/2.21.4/jackson-base-2.21.4.pom (13 kB at 1.9 MB/s)
2026-09-21T13:24:05.9185858Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.14.1/junit-bom-5.14.1.pom
2026-09-21T13:24:05.9210091Z Progress (1): 0.9/5.7 kB
2026-09-21T13:24:05.9236171Z Progress (1): 5.7 kB    
2026-09-21T13:24:05.9236276Z                     
2026-09-21T13:24:05.9237050Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.14.1/junit-bom-5.14.1.pom (5.7 kB at 1.1 MB/s)
2026-09-21T13:24:05.9295813Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.pom
2026-09-21T13:24:05.9320799Z Progress (1): 0.9/7.4 kB
2026-09-21T13:24:05.9346533Z Progress (1): 7.4 kB    
2026-09-21T13:24:05.9346896Z                     
2026-09-21T13:24:05.9347659Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.pom (7.4 kB at 1.5 MB/s)
2026-09-21T13:24:05.9413438Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-core/2.21.4/jackson-core-2.21.4.pom
2026-09-21T13:24:05.9459758Z Progress (1): 5.0/9.7 kB
2026-09-21T13:24:05.9532591Z Progress (1): 9.7 kB    
2026-09-21T13:24:05.9532787Z                     
2026-09-21T13:24:05.9533224Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-core/2.21.4/jackson-core-2.21.4.pom (9.7 kB at 809 kB/s)
2026-09-21T13:24:05.9959491Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.21.4/jackson-datatype-jsr310-2.21.4.pom
2026-09-21T13:24:06.0061016Z Progress (1): 5.3 kB
2026-09-21T13:24:06.0061142Z                     
2026-09-21T13:24:06.0061533Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.21.4/jackson-datatype-jsr310-2.21.4.pom (5.3 kB at 535 kB/s)
2026-09-21T13:24:06.0483868Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/module/jackson-modules-java8/2.21.4/jackson-modules-java8-2.21.4.pom
2026-09-21T13:24:06.0619821Z Progress (1): 3.1 kB
2026-09-21T13:24:06.0620058Z                     
2026-09-21T13:24:06.0620469Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/module/jackson-modules-java8/2.21.4/jackson-modules-java8-2.21.4.pom (3.1 kB at 219 kB/s)
2026-09-21T13:24:06.0883628Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-jakarta9/1.15.12/micrometer-jakarta9-1.15.12.pom
2026-09-21T13:24:06.0992786Z Progress (1): 3.8 kB
2026-09-21T13:24:06.0992932Z                     
2026-09-21T13:24:06.0993443Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-jakarta9/1.15.12/micrometer-jakarta9-1.15.12.pom (3.8 kB at 315 kB/s)
2026-09-21T13:24:06.1084518Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.pom
2026-09-21T13:24:06.1114685Z Progress (1): 7.7/11 kB
2026-09-21T13:24:06.1145390Z Progress (1): 11 kB    
2026-09-21T13:24:06.1145624Z                    
2026-09-21T13:24:06.1146371Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.pom (11 kB at 1.8 MB/s)
2026-09-21T13:24:06.1610299Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/ee4j/project/1.0.6/project-1.0.6.pom
2026-09-21T13:24:06.1645510Z Progress (1): 7.7/13 kB
2026-09-21T13:24:06.1674424Z Progress (1): 13 kB    
2026-09-21T13:24:06.1674926Z                    
2026-09-21T13:24:06.1675387Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/ee4j/project/1.0.6/project-1.0.6.pom (13 kB at 1.9 MB/s)
2026-09-21T13:24:06.1756368Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-registry-prometheus/1.15.12/micrometer-registry-prometheus-1.15.12.pom
2026-09-21T13:24:06.1802630Z Progress (1): 0.9/4.3 kB
2026-09-21T13:24:06.1847693Z Progress (1): 4.3 kB    
2026-09-21T13:24:06.1847819Z                     
2026-09-21T13:24:06.1848301Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-registry-prometheus/1.15.12/micrometer-registry-prometheus-1.15.12.pom (4.3 kB at 473 kB/s)
2026-09-21T13:24:06.1923107Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-core/1.3.10/prometheus-metrics-core-1.3.10.pom
2026-09-21T13:24:06.1971605Z Progress (1): 0.9/1.7 kB
2026-09-21T13:24:06.2053033Z Progress (1): 1.7 kB    
2026-09-21T13:24:06.2053210Z                     
2026-09-21T13:24:06.2053639Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-core/1.3.10/prometheus-metrics-core-1.3.10.pom (1.7 kB at 124 kB/s)
2026-09-21T13:24:06.2105012Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/client_java/1.3.10/client_java-1.3.10.pom
2026-09-21T13:24:06.2159134Z Progress (1): 6.4/16 kB
2026-09-21T13:24:06.2217058Z Progress (1): 16 kB    
2026-09-21T13:24:06.2217484Z                    
2026-09-21T13:24:06.2217961Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/client_java/1.3.10/client_java-1.3.10.pom (16 kB at 1.4 MB/s)
2026-09-21T13:24:06.2468116Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.13.3/junit-bom-5.13.3.pom
2026-09-21T13:24:06.2539545Z Progress (1): 0.9/5.7 kB
2026-09-21T13:24:06.2610063Z Progress (1): 5.7 kB    
2026-09-21T13:24:06.2610295Z                     
2026-09-21T13:24:06.2611342Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.13.3/junit-bom-5.13.3.pom (5.7 kB at 405 kB/s)
2026-09-21T13:24:06.3066851Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/instrumentation/opentelemetry-instrumentation-bom-alpha/2.16.0-alpha/opentelemetry-instrumentation-bom-alpha-2.16.0-alpha.pom
2026-09-21T13:24:06.3156041Z Progress (1): 0.9/83 kB
2026-09-21T13:24:06.3156720Z Progress (1): 34/83 kB 
2026-09-21T13:24:06.3156987Z Progress (1): 53/83 kB
2026-09-21T13:24:06.3158555Z Progress (1): 58/83 kB
2026-09-21T13:24:06.3159044Z Progress (1): 65/83 kB
2026-09-21T13:24:06.3159385Z Progress (1): 67/83 kB
2026-09-21T13:24:06.3159723Z Progress (1): 68/83 kB
2026-09-21T13:24:06.3159824Z Progress (1): 71/83 kB
2026-09-21T13:24:06.3159963Z Progress (1): 82/83 kB
2026-09-21T13:24:06.3226412Z Progress (1): 83 kB   
2026-09-21T13:24:06.3226811Z                    
2026-09-21T13:24:06.3227679Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/instrumentation/opentelemetry-instrumentation-bom-alpha/2.16.0-alpha/opentelemetry-instrumentation-bom-alpha-2.16.0-alpha.pom (83 kB at 5.2 MB/s)
2026-09-21T13:24:06.3435965Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/opentelemetry-bom/1.50.0/opentelemetry-bom-1.50.0.pom
2026-09-21T13:24:06.3541123Z Progress (1): 5.9 kB
2026-09-21T13:24:06.3541258Z                     
2026-09-21T13:24:06.3541731Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/opentelemetry-bom/1.50.0/opentelemetry-bom-1.50.0.pom (5.9 kB at 587 kB/s)
2026-09-21T13:24:06.3598189Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/opentelemetry-bom-alpha/1.50.0-alpha/opentelemetry-bom-alpha-1.50.0-alpha.pom
2026-09-21T13:24:06.3695027Z Progress (1): 2.7 kB
2026-09-21T13:24:06.3695507Z                     
2026-09-21T13:24:06.3696033Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/opentelemetry-bom-alpha/1.50.0-alpha/opentelemetry-bom-alpha-1.50.0-alpha.pom (2.7 kB at 268 kB/s)
2026-09-21T13:24:06.3749082Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/instrumentation/opentelemetry-instrumentation-bom/2.16.0/opentelemetry-instrumentation-bom-2.16.0.pom
2026-09-21T13:24:06.3860387Z Progress (1): 3.3 kB
2026-09-21T13:24:06.3860624Z                     
2026-09-21T13:24:06.3861126Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/opentelemetry/instrumentation/opentelemetry-instrumentation-bom/2.16.0/opentelemetry-instrumentation-bom-2.16.0.pom (3.3 kB at 296 kB/s)
2026-09-21T13:24:06.3935674Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-model/1.3.10/prometheus-metrics-model-1.3.10.pom
2026-09-21T13:24:06.4002792Z Progress (1): 773 B
2026-09-21T13:24:06.4002914Z                    
2026-09-21T13:24:06.4003344Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-model/1.3.10/prometheus-metrics-model-1.3.10.pom (773 B at 110 kB/s)
2026-09-21T13:24:06.4072548Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-config/1.3.10/prometheus-metrics-config-1.3.10.pom
2026-09-21T13:24:06.4167358Z Progress (1): 772 B
2026-09-21T13:24:06.4167778Z                    
2026-09-21T13:24:06.4168250Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-config/1.3.10/prometheus-metrics-config-1.3.10.pom (772 B at 77 kB/s)
2026-09-21T13:24:06.4232212Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-tracer-common/1.3.10/prometheus-metrics-tracer-common-1.3.10.pom
2026-09-21T13:24:06.4308631Z Progress (1): 824 B
2026-09-21T13:24:06.4308876Z                    
2026-09-21T13:24:06.4309665Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-tracer-common/1.3.10/prometheus-metrics-tracer-common-1.3.10.pom (824 B at 103 kB/s)
2026-09-21T13:24:06.4382529Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-tracer/1.3.10/prometheus-metrics-tracer-1.3.10.pom
2026-09-21T13:24:06.4458850Z Progress (1): 1.3 kB
2026-09-21T13:24:06.4459116Z                     
2026-09-21T13:24:06.4459562Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-tracer/1.3.10/prometheus-metrics-tracer-1.3.10.pom (1.3 kB at 162 kB/s)
2026-09-21T13:24:06.4537903Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-formats/1.3.10/prometheus-metrics-exposition-formats-1.3.10.pom
2026-09-21T13:24:06.4561796Z Progress (1): 2.3/6.1 kB
2026-09-21T13:24:06.4613017Z Progress (1): 6.1 kB    
2026-09-21T13:24:06.4613188Z                     
2026-09-21T13:24:06.4614128Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-formats/1.3.10/prometheus-metrics-exposition-formats-1.3.10.pom (6.1 kB at 672 kB/s)
2026-09-21T13:24:06.5019665Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-textformats/1.3.10/prometheus-metrics-exposition-textformats-1.3.10.pom
2026-09-21T13:24:06.5133913Z Progress (1): 1.6 kB
2026-09-21T13:24:06.5134156Z                     
2026-09-21T13:24:06.5134653Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-textformats/1.3.10/prometheus-metrics-exposition-textformats-1.3.10.pom (1.6 kB at 130 kB/s)
2026-09-21T13:24:06.5197398Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-pushgateway/1.3.10/prometheus-metrics-exporter-pushgateway-1.3.10.pom
2026-09-21T13:24:06.5302436Z Progress (1): 1.4 kB
2026-09-21T13:24:06.5302624Z                     
2026-09-21T13:24:06.5303083Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-pushgateway/1.3.10/prometheus-metrics-exporter-pushgateway-1.3.10.pom (1.4 kB at 129 kB/s)
2026-09-21T13:24:06.5371624Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-common/1.3.10/prometheus-metrics-exporter-common-1.3.10.pom
2026-09-21T13:24:06.5476660Z Progress (1): 1.4 kB
2026-09-21T13:24:06.5476888Z                     
2026-09-21T13:24:06.5477474Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-common/1.3.10/prometheus-metrics-exporter-common-1.3.10.pom (1.4 kB at 130 kB/s)
2026-09-21T13:24:06.5684575Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/logstash/logback/logstash-logback-encoder/7.4/logstash-logback-encoder-7.4.pom
2026-09-21T13:24:06.5764396Z Progress (1): 5.2 kB
2026-09-21T13:24:06.5765161Z                     
2026-09-21T13:24:06.5765624Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/logstash/logback/logstash-logback-encoder/7.4/logstash-logback-encoder-7.4.pom (5.2 kB at 648 kB/s)
2026-09-21T13:24:06.6013379Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/oracle/database/jdbc/ojdbc11/23.5.0.24.07/ojdbc11-23.5.0.24.07.pom
2026-09-21T13:24:06.6137070Z Progress (1): 1.4 kB
2026-09-21T13:24:06.6137575Z                     
2026-09-21T13:24:06.6138549Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/oracle/database/jdbc/ojdbc11/23.5.0.24.07/ojdbc11-23.5.0.24.07.pom (1.4 kB at 111 kB/s)
2026-09-21T13:24:06.6191684Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-yaml/2.21.4/jackson-dataformat-yaml-2.21.4.pom
2026-09-21T13:24:06.6301203Z Progress (1): 3.0 kB
2026-09-21T13:24:06.6301367Z                     
2026-09-21T13:24:06.6301850Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-yaml/2.21.4/jackson-dataformat-yaml-2.21.4.pom (3.0 kB at 270 kB/s)
2026-09-21T13:24:06.6350091Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformats-text/2.21.4/jackson-dataformats-text-2.21.4.pom
2026-09-21T13:24:06.6454398Z Progress (1): 3.5 kB
2026-09-21T13:24:06.6454610Z                     
2026-09-21T13:24:06.6455060Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformats-text/2.21.4/jackson-dataformats-text-2.21.4.pom (3.5 kB at 316 kB/s)
2026-09-21T13:24:06.6539500Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/projectlombok/lombok/1.18.46/lombok-1.18.46.pom
2026-09-21T13:24:06.6616080Z Progress (1): 1.5 kB
2026-09-21T13:24:06.6616215Z                     
2026-09-21T13:24:06.6616641Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/projectlombok/lombok/1.18.46/lombok-1.18.46.pom (1.5 kB at 165 kB/s)
2026-09-21T13:24:06.6668298Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-test/3.5.16/spring-boot-starter-test-3.5.16.pom
2026-09-21T13:24:06.6720372Z Progress (1): 0.9/4.9 kB
2026-09-21T13:24:06.6779929Z Progress (1): 4.9 kB    
2026-09-21T13:24:06.6780145Z                     
2026-09-21T13:24:06.6780612Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-test/3.5.16/spring-boot-starter-test-3.5.16.pom (4.9 kB at 444 kB/s)
2026-09-21T13:24:06.6845048Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test/3.5.16/spring-boot-test-3.5.16.pom
2026-09-21T13:24:06.6894184Z Progress (1): 0.9/2.2 kB
2026-09-21T13:24:06.6934453Z Progress (1): 2.2 kB    
2026-09-21T13:24:06.6935047Z                     
2026-09-21T13:24:06.6935745Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test/3.5.16/spring-boot-test-3.5.16.pom (2.2 kB at 246 kB/s)
2026-09-21T13:24:06.6989339Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-test/6.2.19/spring-test-6.2.19.pom
2026-09-21T13:24:06.7028800Z Progress (1): 0.9/2.1 kB
2026-09-21T13:24:06.7067367Z Progress (1): 2.1 kB    
2026-09-21T13:24:06.7067540Z                     
2026-09-21T13:24:06.7067917Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-test/6.2.19/spring-test-6.2.19.pom (2.1 kB at 258 kB/s)
2026-09-21T13:24:06.7130273Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test-autoconfigure/3.5.16/spring-boot-test-autoconfigure-3.5.16.pom
2026-09-21T13:24:06.7239394Z Progress (1): 2.5 kB
2026-09-21T13:24:06.7239549Z                     
2026-09-21T13:24:06.7239912Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test-autoconfigure/3.5.16/spring-boot-test-autoconfigure-3.5.16.pom (2.5 kB at 225 kB/s)
2026-09-21T13:24:06.7292021Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.pom
2026-09-21T13:24:06.7331440Z Progress (1): 0.9/1.9 kB
2026-09-21T13:24:06.7356199Z Progress (1): 1.9 kB    
2026-09-21T13:24:06.7417827Z                     
2026-09-21T13:24:06.7418216Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.pom (1.9 kB at 274 kB/s)
2026-09-21T13:24:06.7418529Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/json-smart/2.5.2/json-smart-2.5.2.pom
2026-09-21T13:24:06.7517243Z Progress (1): 0.9/10 kB
2026-09-21T13:24:06.7566024Z Progress (1): 10 kB    
2026-09-21T13:24:06.7566643Z                    
2026-09-21T13:24:06.7567268Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/json-smart/2.5.2/json-smart-2.5.2.pom (10 kB at 679 kB/s)
2026-09-21T13:24:06.7621819Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/accessors-smart/2.5.2/accessors-smart-2.5.2.pom
2026-09-21T13:24:06.7688279Z Progress (1): 3.7/12 kB
2026-09-21T13:24:06.7732513Z Progress (1): 12 kB    
2026-09-21T13:24:06.7732757Z                    
2026-09-21T13:24:06.7733185Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/accessors-smart/2.5.2/accessors-smart-2.5.2.pom (12 kB at 988 kB/s)
2026-09-21T13:24:06.7932238Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7.1/asm-9.7.1.pom
2026-09-21T13:24:06.7988324Z Progress (1): 2.4 kB
2026-09-21T13:24:06.7988441Z                     
2026-09-21T13:24:06.7988947Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7.1/asm-9.7.1.pom (2.4 kB at 395 kB/s)
2026-09-21T13:24:06.8044441Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.pom
2026-09-21T13:24:06.8072411Z Progress (1): 7.7/13 kB
2026-09-21T13:24:06.8130190Z Progress (1): 13 kB    
2026-09-21T13:24:06.8130353Z                    
2026-09-21T13:24:06.8130663Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.pom (13 kB at 1.6 MB/s)
2026-09-21T13:24:06.8188628Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/xml/bind/jakarta.xml.bind-api-parent/4.0.5/jakarta.xml.bind-api-parent-4.0.5.pom
2026-09-21T13:24:06.8212896Z Progress (1): 0.9/9.1 kB
2026-09-21T13:24:06.8239406Z Progress (1): 9.1 kB    
2026-09-21T13:24:06.8239685Z                     
2026-09-21T13:24:06.8240058Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/xml/bind/jakarta.xml.bind-api-parent/4.0.5/jakarta.xml.bind-api-parent-4.0.5.pom (9.1 kB at 1.8 MB/s)
2026-09-21T13:24:06.8295020Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.pom
2026-09-21T13:24:06.8324764Z Progress (1): 7.7/19 kB
2026-09-21T13:24:06.8365575Z Progress (1): 19 kB    
2026-09-21T13:24:06.8365963Z                    
2026-09-21T13:24:06.8366487Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.pom (19 kB at 2.6 MB/s)
2026-09-21T13:24:06.8434246Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.pom
2026-09-21T13:24:06.8480834Z Progress (1): 2.3/3.8 kB
2026-09-21T13:24:06.8509750Z Progress (1): 3.8 kB    
2026-09-21T13:24:06.8509914Z                     
2026-09-21T13:24:06.8510255Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.pom (3.8 kB at 543 kB/s)
2026-09-21T13:24:06.8711734Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy/1.17.8/byte-buddy-1.17.8.pom
2026-09-21T13:24:06.8765151Z Progress (1): 0.9/19 kB
2026-09-21T13:24:06.8795115Z Progress (1): 19 kB    
2026-09-21T13:24:06.8795313Z                    
2026-09-21T13:24:06.8796264Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy/1.17.8/byte-buddy-1.17.8.pom (19 kB at 2.2 MB/s)
2026-09-21T13:24:06.8847013Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy-parent/1.17.8/byte-buddy-parent-1.17.8.pom
2026-09-21T13:24:06.8878156Z Progress (1): 7.7/66 kB
2026-09-21T13:24:06.8878423Z Progress (1): 41/66 kB 
2026-09-21T13:24:06.8907970Z Progress (1): 66 kB   
2026-09-21T13:24:06.8908278Z                    
2026-09-21T13:24:06.8908652Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy-parent/1.17.8/byte-buddy-parent-1.17.8.pom (66 kB at 11 MB/s)
2026-09-21T13:24:06.8999353Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.pom
2026-09-21T13:24:06.9091594Z Progress (1): 3.5 kB
2026-09-21T13:24:06.9092489Z                     
2026-09-21T13:24:06.9092923Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.pom (3.5 kB at 355 kB/s)
2026-09-21T13:24:06.9142567Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/awaitility/awaitility-parent/4.2.2/awaitility-parent-4.2.2.pom
2026-09-21T13:24:06.9189120Z Progress (1): 0.9/11 kB
2026-09-21T13:24:06.9245934Z Progress (1): 11 kB    
2026-09-21T13:24:06.9246121Z                    
2026-09-21T13:24:06.9246567Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/awaitility/awaitility-parent/4.2.2/awaitility-parent-4.2.2.pom (11 kB at 1.1 MB/s)
2026-09-21T13:24:06.9320950Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hamcrest/hamcrest/3.0/hamcrest-3.0.pom
2026-09-21T13:24:06.9434844Z Progress (1): 1.6 kB
2026-09-21T13:24:06.9435087Z                     
2026-09-21T13:24:06.9435665Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hamcrest/hamcrest/3.0/hamcrest-3.0.pom (1.6 kB at 135 kB/s)
2026-09-21T13:24:06.9491696Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter/5.12.2/junit-jupiter-5.12.2.pom
2026-09-21T13:24:06.9613590Z Progress (1): 3.2 kB
2026-09-21T13:24:06.9613755Z                     
2026-09-21T13:24:06.9614226Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter/5.12.2/junit-jupiter-5.12.2.pom (3.2 kB at 247 kB/s)
2026-09-21T13:24:06.9668103Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-api/5.12.2/junit-jupiter-api-5.12.2.pom
2026-09-21T13:24:06.9731370Z Progress (1): 2.3/3.2 kB
2026-09-21T13:24:06.9794705Z Progress (1): 3.2 kB    
2026-09-21T13:24:06.9794882Z                     
2026-09-21T13:24:06.9795297Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-api/5.12.2/junit-jupiter-api-5.12.2.pom (3.2 kB at 245 kB/s)
2026-09-21T13:24:06.9851998Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.pom
2026-09-21T13:24:06.9901428Z Progress (1): 2.0 kB
2026-09-21T13:24:06.9901639Z                     
2026-09-21T13:24:06.9902165Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.pom (2.0 kB at 339 kB/s)
2026-09-21T13:24:06.9957406Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.12.2/junit-platform-commons-1.12.2.pom
2026-09-21T13:24:07.0039331Z Progress (1): 2.8 kB
2026-09-21T13:24:07.0039567Z                     
2026-09-21T13:24:07.0040038Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.12.2/junit-platform-commons-1.12.2.pom (2.8 kB at 354 kB/s)
2026-09-21T13:24:07.0094148Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.pom
2026-09-21T13:24:07.0147734Z Progress (1): 1.5 kB
2026-09-21T13:24:07.0147923Z                     
2026-09-21T13:24:07.0148316Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.pom (1.5 kB at 305 kB/s)
2026-09-21T13:24:07.0210205Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-params/5.12.2/junit-jupiter-params-5.12.2.pom
2026-09-21T13:24:07.0292942Z Progress (1): 3.0 kB
2026-09-21T13:24:07.0293169Z                     
2026-09-21T13:24:07.0293588Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-params/5.12.2/junit-jupiter-params-5.12.2.pom (3.0 kB at 334 kB/s)
2026-09-21T13:24:07.0374167Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-engine/5.12.2/junit-jupiter-engine-5.12.2.pom
2026-09-21T13:24:07.0452619Z Progress (1): 3.2 kB
2026-09-21T13:24:07.0452738Z                     
2026-09-21T13:24:07.0453132Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-engine/5.12.2/junit-jupiter-engine-5.12.2.pom (3.2 kB at 400 kB/s)
2026-09-21T13:24:07.0517579Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.12.2/junit-platform-engine-1.12.2.pom
2026-09-21T13:24:07.0634462Z Progress (1): 3.2 kB
2026-09-21T13:24:07.0634705Z                     
2026-09-21T13:24:07.0635186Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.12.2/junit-platform-engine-1.12.2.pom (3.2 kB at 267 kB/s)
2026-09-21T13:24:07.0694949Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-core/5.17.0/mockito-core-5.17.0.pom
2026-09-21T13:24:07.0751145Z Progress (1): 2.3/2.5 kB
2026-09-21T13:24:07.0776956Z Progress (1): 2.5 kB    
2026-09-21T13:24:07.0777391Z                     
2026-09-21T13:24:07.0778219Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-core/5.17.0/mockito-core-5.17.0.pom (2.5 kB at 309 kB/s)
2026-09-21T13:24:07.0833103Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy-agent/1.17.8/byte-buddy-agent-1.17.8.pom
2026-09-21T13:24:07.0858365Z Progress (1): 0.9/14 kB
2026-09-21T13:24:07.0882836Z Progress (1): 14 kB    
2026-09-21T13:24:07.0883070Z                    
2026-09-21T13:24:07.0883453Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy-agent/1.17.8/byte-buddy-agent-1.17.8.pom (14 kB at 2.9 MB/s)
2026-09-21T13:24:07.0944288Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/objenesis/objenesis/3.3/objenesis-3.3.pom
2026-09-21T13:24:07.0989128Z Progress (1): 3.0 kB
2026-09-21T13:24:07.0989287Z                     
2026-09-21T13:24:07.0989599Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/objenesis/objenesis/3.3/objenesis-3.3.pom (3.0 kB at 752 kB/s)
2026-09-21T13:24:07.1034848Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/objenesis/objenesis-parent/3.3/objenesis-parent-3.3.pom
2026-09-21T13:24:07.1058993Z Progress (1): 2.3/19 kB
2026-09-21T13:24:07.1079597Z Progress (1): 19 kB    
2026-09-21T13:24:07.1079728Z                    
2026-09-21T13:24:07.1080059Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/objenesis/objenesis-parent/3.3/objenesis-parent-3.3.pom (19 kB at 4.8 MB/s)
2026-09-21T13:24:07.1134938Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-junit-jupiter/5.17.0/mockito-junit-jupiter-5.17.0.pom
2026-09-21T13:24:07.1217193Z Progress (1): 2.3 kB
2026-09-21T13:24:07.1217565Z                     
2026-09-21T13:24:07.1218054Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-junit-jupiter/5.17.0/mockito-junit-jupiter-5.17.0.pom (2.3 kB at 286 kB/s)
2026-09-21T13:24:07.1273984Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.pom
2026-09-21T13:24:07.1369012Z Progress (1): 7.0 kB
2026-09-21T13:24:07.1369194Z                     
2026-09-21T13:24:07.1369565Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.pom (7.0 kB at 776 kB/s)
2026-09-21T13:24:07.1422800Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.pom
2026-09-21T13:24:07.1449151Z Progress (1): 0.9/2.8 kB
2026-09-21T13:24:07.1476892Z Progress (1): 2.8 kB    
2026-09-21T13:24:07.1477164Z                     
2026-09-21T13:24:07.1477562Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.pom (2.8 kB at 557 kB/s)
2026-09-21T13:24:07.1534566Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/xmlunit/xmlunit-core/2.10.4/xmlunit-core-2.10.4.pom
2026-09-21T13:24:07.1629260Z Progress (1): 2.8 kB
2026-09-21T13:24:07.1629660Z                     
2026-09-21T13:24:07.1630078Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/xmlunit/xmlunit-core/2.10.4/xmlunit-core-2.10.4.pom (2.8 kB at 311 kB/s)
2026-09-21T13:24:07.1891084Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/xmlunit/xmlunit-parent/2.10.4/xmlunit-parent-2.10.4.pom
2026-09-21T13:24:07.1981204Z Progress (1): 3.7/23 kB
2026-09-21T13:24:07.2029152Z Progress (1): 23 kB    
2026-09-21T13:24:07.2029289Z                    
2026-09-21T13:24:07.2029868Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/xmlunit/xmlunit-parent/2.10.4/xmlunit-parent-2.10.4.pom (23 kB at 1.7 MB/s)
2026-09-21T13:24:07.2086165Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-test/5.2.6/spring-batch-test-5.2.6.pom
2026-09-21T13:24:07.2121732Z Progress (1): 3.7/4.0 kB
2026-09-21T13:24:07.2153958Z Progress (1): 4.0 kB    
2026-09-21T13:24:07.2154266Z                     
2026-09-21T13:24:07.2154824Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-test/5.2.6/spring-batch-test-5.2.6.pom (4.0 kB at 572 kB/s)
2026-09-21T13:24:07.2227674Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/h2database/h2/2.3.232/h2-2.3.232.pom
2026-09-21T13:24:07.2308810Z Progress (1): 1.1 kB
2026-09-21T13:24:07.2309092Z                     
2026-09-21T13:24:07.2309465Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/h2database/h2/2.3.232/h2-2.3.232.pom (1.1 kB at 142 kB/s)
2026-09-21T13:24:07.2656345Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-autoconfigure/3.5.16/spring-boot-autoconfigure-3.5.16.jar
2026-09-21T13:24:07.2749940Z Progress (1): 0/2.1 MB
2026-09-21T13:24:07.2750403Z Progress (1): 0/2.1 MB
2026-09-21T13:24:07.2750640Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.2750785Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.2751260Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.2753075Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.2753227Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.2785216Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.2785352Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.2786378Z Progress (1): 0.2/2.1 MB
2026-09-21T13:24:07.2787080Z Progress (1): 0.2/2.1 MB
2026-09-21T13:24:07.2789956Z Progress (1): 0.2/2.1 MB
2026-09-21T13:24:07.2790744Z Progress (1): 0.2/2.1 MB
2026-09-21T13:24:07.2790991Z Progress (1): 0.2/2.1 MB
2026-09-21T13:24:07.2791948Z Progress (1): 0.2/2.1 MB
2026-09-21T13:24:07.2793174Z Progress (1): 0.2/2.1 MB
2026-09-21T13:24:07.2794245Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2796212Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2798167Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2798420Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2798569Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2798902Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2799053Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2799185Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2799283Z Progress (1): 0.3/2.1 MB
2026-09-21T13:24:07.2799417Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2800187Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2800419Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2800555Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2801271Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2802883Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2803050Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2803180Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2803312Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2803422Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2804435Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2804637Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2804821Z Progress (1): 0.4/2.1 MB
2026-09-21T13:24:07.2806773Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2807477Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2807782Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2807919Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2810213Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2810345Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2810923Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2811592Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2811763Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2812581Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2812714Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2812808Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2816995Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2817183Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2817432Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2817857Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2817988Z Progress (1): 0.5/2.1 MB
2026-09-21T13:24:07.2818086Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2818284Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2818432Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2818563Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2818663Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2818894Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2820459Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2820785Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2822258Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2870612Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2870997Z Progress (1): 0.6/2.1 MB
2026-09-21T13:24:07.2872282Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2872521Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2874012Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2874219Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2874672Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2874817Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2875307Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2875466Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2877320Z Progress (1): 0.7/2.1 MB
2026-09-21T13:24:07.2877904Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2879443Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2879584Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2879696Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2879847Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2880298Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2891890Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2892004Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2892154Z Progress (1): 0.8/2.1 MB
2026-09-21T13:24:07.2892731Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2892870Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2892966Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2893096Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2893222Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2893352Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2893541Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2893646Z Progress (1): 0.9/2.1 MB
2026-09-21T13:24:07.2893785Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2893988Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894150Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894247Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894375Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894508Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894646Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894770Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894862Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2894987Z Progress (1): 1.0/2.1 MB
2026-09-21T13:24:07.2895125Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2895247Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2895342Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2895488Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2895611Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2895860Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2896069Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2896562Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2897259Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2897404Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2899761Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2902993Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2903238Z Progress (1): 1.1/2.1 MB
2026-09-21T13:24:07.2903382Z Progress (1): 1.2/2.1 MB
2026-09-21T13:24:07.2904600Z Progress (1): 1.2/2.1 MB
2026-09-21T13:24:07.2904701Z Progress (1): 1.2/2.1 MB
2026-09-21T13:24:07.2904838Z Progress (1): 1.2/2.1 MB
2026-09-21T13:24:07.2906293Z Progress (1): 1.2/2.1 MB
2026-09-21T13:24:07.2907556Z Progress (1): 1.2/2.1 MB
2026-09-21T13:24:07.2908400Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2910040Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2910379Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2914382Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2914854Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2915289Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2917613Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2918485Z Progress (1): 1.3/2.1 MB
2026-09-21T13:24:07.2919380Z Progress (1): 1.4/2.1 MB
2026-09-21T13:24:07.2920392Z Progress (1): 1.4/2.1 MB
2026-09-21T13:24:07.2920608Z Progress (1): 1.4/2.1 MB
2026-09-21T13:24:07.2922563Z Progress (1): 1.4/2.1 MB
2026-09-21T13:24:07.2923733Z Progress (1): 1.4/2.1 MB
2026-09-21T13:24:07.2924366Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2924512Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2924665Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2924806Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2925694Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2927206Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2928632Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2930024Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2931421Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2932788Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2943577Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2945227Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2946740Z Progress (1): 1.5/2.1 MB
2026-09-21T13:24:07.2948242Z Progress (1): 1.6/2.1 MB
2026-09-21T13:24:07.2949656Z Progress (1): 1.6/2.1 MB
2026-09-21T13:24:07.2951056Z Progress (1): 1.6/2.1 MB
2026-09-21T13:24:07.2952513Z Progress (1): 1.6/2.1 MB
2026-09-21T13:24:07.2954036Z Progress (1): 1.6/2.1 MB
2026-09-21T13:24:07.2955521Z Progress (1): 1.6/2.1 MB
2026-09-21T13:24:07.2956937Z Progress (1): 1.7/2.1 MB
2026-09-21T13:24:07.2958393Z Progress (1): 1.7/2.1 MB
2026-09-21T13:24:07.2959886Z Progress (1): 1.7/2.1 MB
2026-09-21T13:24:07.2961495Z Progress (1): 1.7/2.1 MB
2026-09-21T13:24:07.2962984Z Progress (1): 1.7/2.1 MB
2026-09-21T13:24:07.2964592Z Progress (1): 1.8/2.1 MB
2026-09-21T13:24:07.2966007Z Progress (1): 1.8/2.1 MB
2026-09-21T13:24:07.2967560Z Progress (1): 1.8/2.1 MB
2026-09-21T13:24:07.2969214Z Progress (1): 1.8/2.1 MB
2026-09-21T13:24:07.2969588Z Progress (1): 1.8/2.1 MB
2026-09-21T13:24:07.2969951Z Progress (1): 1.9/2.1 MB
2026-09-21T13:24:07.2970195Z Progress (1): 1.9/2.1 MB
2026-09-21T13:24:07.2970501Z Progress (1): 1.9/2.1 MB
2026-09-21T13:24:07.2970651Z Progress (1): 1.9/2.1 MB
2026-09-21T13:24:07.2970749Z Progress (1): 2.0/2.1 MB
2026-09-21T13:24:07.2970879Z Progress (1): 2.0/2.1 MB
2026-09-21T13:24:07.2971155Z Progress (1): 2.0/2.1 MB
2026-09-21T13:24:07.2972625Z Progress (1): 2.0/2.1 MB
2026-09-21T13:24:07.2972881Z Progress (1): 2.1/2.1 MB
2026-09-21T13:24:07.3030452Z Progress (1): 2.1 MB    
2026-09-21T13:24:07.3030595Z                     
2026-09-21T13:24:07.3031284Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-autoconfigure/3.5.16/spring-boot-autoconfigure-3.5.16.jar (2.1 MB at 56 MB/s)
2026-09-21T13:24:07.3034605Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot/3.5.16/spring-boot-3.5.16.jar
2026-09-21T13:24:07.3036184Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-context/6.2.19/spring-context-6.2.19.jar
2026-09-21T13:24:07.3036930Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-expression/6.2.19/spring-expression-6.2.19.jar
2026-09-21T13:24:07.3038882Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-configuration-processor/3.5.16/spring-boot-configuration-processor-3.5.16.jar
2026-09-21T13:24:07.3042396Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-batch/3.5.16/spring-boot-starter-batch-3.5.16.jar
2026-09-21T13:24:07.3102156Z Progress (1): 4.7 kB
2026-09-21T13:24:07.3102274Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3104661Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3105152Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3105304Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3105442Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3106137Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3106441Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3107824Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3108096Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3110159Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3115319Z Progress (2): 4.7 kB | 0/1.9 MB
2026-09-21T13:24:07.3115657Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3115977Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3116125Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3116228Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3116376Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3116512Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3116644Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3116743Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3118253Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3124546Z Progress (2): 4.7 kB | 0.1/1.9 MB
2026-09-21T13:24:07.3124780Z Progress (3): 4.7 kB | 0.1/1.9 MB | 2.3/321 kB
2026-09-21T13:24:07.3125613Z Progress (3): 4.7 kB | 0.1/1.9 MB | 35/321 kB 
2026-09-21T13:24:07.3126180Z Progress (4): 4.7 kB | 0.1/1.9 MB | 35/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3126315Z Progress (4): 4.7 kB | 0.1/1.9 MB | 68/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3126483Z Progress (4): 4.7 kB | 0.1/1.9 MB | 68/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3126661Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3126825Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3155531Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3155686Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3155851Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0/1.4 MB
2026-09-21T13:24:07.3156107Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3158717Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3159266Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3159703Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3159846Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3187117Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3187527Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3187828Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3190228Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3191597Z Progress (4): 4.7 kB | 0.1/1.9 MB | 98/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3191729Z Progress (4): 4.7 kB | 0.1/1.9 MB | 105/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3192025Z Progress (4): 4.7 kB | 0.1/1.9 MB | 105/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3192317Z Progress (4): 4.7 kB | 0.1/1.9 MB | 122/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3192576Z Progress (4): 4.7 kB | 0.2/1.9 MB | 122/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3193465Z Progress (4): 4.7 kB | 0.2/1.9 MB | 127/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3198577Z Progress (4): 4.7 kB | 0.2/1.9 MB | 127/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3200366Z Progress (4): 4.7 kB | 0.2/1.9 MB | 127/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3200786Z Progress (4): 4.7 kB | 0.2/1.9 MB | 132/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3200961Z Progress (4): 4.7 kB | 0.2/1.9 MB | 160/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3201328Z Progress (4): 4.7 kB | 0.2/1.9 MB | 160/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3201499Z Progress (4): 4.7 kB | 0.2/1.9 MB | 160/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3201658Z Progress (4): 4.7 kB | 0.3/1.9 MB | 160/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3201818Z Progress (4): 4.7 kB | 0.3/1.9 MB | 190/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3202166Z Progress (4): 4.7 kB | 0.3/1.9 MB | 190/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3202303Z Progress (4): 4.7 kB | 0.3/1.9 MB | 194/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3202474Z Progress (4): 4.7 kB | 0.3/1.9 MB | 199/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3202630Z Progress (4): 4.7 kB | 0.3/1.9 MB | 205/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3203654Z Progress (4): 4.7 kB | 0.3/1.9 MB | 209/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3204055Z Progress (4): 4.7 kB | 0.3/1.9 MB | 209/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3204188Z Progress (4): 4.7 kB | 0.3/1.9 MB | 209/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3204554Z Progress (4): 4.7 kB | 0.3/1.9 MB | 209/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3204884Z Progress (4): 4.7 kB | 0.3/1.9 MB | 209/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3205046Z Progress (4): 4.7 kB | 0.3/1.9 MB | 209/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3205440Z Progress (4): 4.7 kB | 0.4/1.9 MB | 209/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3205560Z Progress (4): 4.7 kB | 0.4/1.9 MB | 242/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3205713Z Progress (4): 4.7 kB | 0.4/1.9 MB | 242/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3205867Z Progress (4): 4.7 kB | 0.4/1.9 MB | 274/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3206204Z Progress (4): 4.7 kB | 0.4/1.9 MB | 281/321 kB | 0.1/1.4 MB
2026-09-21T13:24:07.3206389Z Progress (5): 4.7 kB | 0.4/1.9 MB | 281/321 kB | 0.1/1.4 MB | 7.7/136 kB
2026-09-21T13:24:07.3206529Z Progress (5): 4.7 kB | 0.4/1.9 MB | 285/321 kB | 0.1/1.4 MB | 7.7/136 kB
2026-09-21T13:24:07.3206705Z Progress (5): 4.7 kB | 0.4/1.9 MB | 285/321 kB | 0.1/1.4 MB | 16/136 kB 
2026-09-21T13:24:07.3207293Z Progress (5): 4.7 kB | 0.4/1.9 MB | 285/321 kB | 0.1/1.4 MB | 19/136 kB
2026-09-21T13:24:07.3207659Z Progress (5): 4.7 kB | 0.4/1.9 MB | 318/321 kB | 0.1/1.4 MB | 19/136 kB
2026-09-21T13:24:07.3207841Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 19/136 kB    
2026-09-21T13:24:07.3207979Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 24/136 kB
2026-09-21T13:24:07.3208145Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 27/136 kB
2026-09-21T13:24:07.3208312Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 41/136 kB
2026-09-21T13:24:07.3208492Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 42/136 kB
2026-09-21T13:24:07.3208654Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 43/136 kB
2026-09-21T13:24:07.3214766Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 46/136 kB
2026-09-21T13:24:07.3215047Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 46/136 kB
2026-09-21T13:24:07.3215208Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 46/136 kB
2026-09-21T13:24:07.3215392Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 46/136 kB
2026-09-21T13:24:07.3215683Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 58/136 kB
2026-09-21T13:24:07.3215907Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 60/136 kB
2026-09-21T13:24:07.3216074Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 60/136 kB
2026-09-21T13:24:07.3216198Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 62/136 kB
2026-09-21T13:24:07.3216477Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 78/136 kB
2026-09-21T13:24:07.3217034Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 78/136 kB
2026-09-21T13:24:07.3217182Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.1/1.4 MB | 93/136 kB
2026-09-21T13:24:07.3219090Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 93/136 kB
2026-09-21T13:24:07.3219356Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 94/136 kB
2026-09-21T13:24:07.3219708Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 98/136 kB
2026-09-21T13:24:07.3220018Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 98/136 kB
2026-09-21T13:24:07.3220197Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 99/136 kB
2026-09-21T13:24:07.3221565Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 99/136 kB
2026-09-21T13:24:07.3222954Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 109/136 kB
2026-09-21T13:24:07.3223090Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 109/136 kB
2026-09-21T13:24:07.3223263Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 135/136 kB
2026-09-21T13:24:07.3223512Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 136 kB    
2026-09-21T13:24:07.3223964Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3228796Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3228977Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3229115Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3229281Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3229503Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3230705Z Progress (5): 4.7 kB | 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3230950Z                                                                 
2026-09-21T13:24:07.3231571Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-batch/3.5.16/spring-boot-starter-batch-3.5.16.jar (4.7 kB at 250 kB/s)
2026-09-21T13:24:07.3231817Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3232004Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3232126Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3232283Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3232430Z                                                        
2026-09-21T13:24:07.3232761Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter/3.5.16/spring-boot-starter-3.5.16.jar
2026-09-21T13:24:07.3232978Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3233101Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3233254Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3233406Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3233562Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3234086Z Progress (4): 0.4/1.9 MB | 321 kB | 0.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3234360Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3234480Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3235299Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3235467Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3235620Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3235798Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3236519Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3236639Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3237436Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3237640Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3237860Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3238678Z Progress (4): 0.4/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3238836Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3239112Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3239304Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3240848Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3241063Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3242022Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3242833Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3243147Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3243717Z Progress (4): 0.5/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3244114Z Progress (4): 0.6/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3244452Z Progress (4): 0.6/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3245121Z Progress (4): 0.6/1.9 MB | 321 kB | 0.4/1.4 MB | 136 kB
2026-09-21T13:24:07.3245279Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3246074Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3246285Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3246523Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3246689Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3246841Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3247796Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3249309Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3250666Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3251909Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3252068Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3252607Z Progress (4): 0.6/1.9 MB | 321 kB | 0.5/1.4 MB | 136 kB
2026-09-21T13:24:07.3253988Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3254112Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3254646Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3254994Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3256280Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3256442Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3256657Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3267994Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3268168Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3269449Z Progress (4): 0.6/1.9 MB | 321 kB | 0.6/1.4 MB | 136 kB
2026-09-21T13:24:07.3269769Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3271033Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3271612Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3271933Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3272808Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3274005Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3274216Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3276082Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3276862Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3277285Z Progress (4): 0.6/1.9 MB | 321 kB | 0.7/1.4 MB | 136 kB
2026-09-21T13:24:07.3277759Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3278563Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3278767Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3279875Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3280779Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3281754Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3282940Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3283495Z Progress (4): 0.6/1.9 MB | 321 kB | 0.8/1.4 MB | 136 kB
2026-09-21T13:24:07.3283942Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3285078Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3286099Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3286684Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3293494Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3293688Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3294728Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3295046Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3295356Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3295700Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3295880Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3296457Z Progress (4): 0.6/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3296762Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3297128Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3297442Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3297680Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3298062Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3298264Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3298503Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3300165Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3302140Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3303244Z Progress (4): 0.7/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3303562Z Progress (4): 0.8/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3304030Z Progress (4): 0.8/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3304439Z Progress (4): 0.8/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3305167Z Progress (4): 0.8/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3305838Z Progress (4): 0.8/1.9 MB | 321 kB | 0.9/1.4 MB | 136 kB
2026-09-21T13:24:07.3306197Z Progress (4): 0.8/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3306707Z Progress (4): 0.8/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3306901Z Progress (4): 0.8/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3307175Z Progress (4): 0.8/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3308162Z Progress (4): 0.8/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3308477Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3308600Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3309476Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3309701Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3314820Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3315044Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3315213Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3315327Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3316021Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3316272Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3316449Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3316585Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3316827Z Progress (4): 0.9/1.9 MB | 321 kB | 1.0/1.4 MB | 136 kB
2026-09-21T13:24:07.3316983Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3317225Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3317609Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3317817Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3318021Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3318265Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3318443Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3318664Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3318846Z Progress (4): 0.9/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3319427Z Progress (4): 1.0/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3319806Z Progress (4): 1.0/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3320004Z Progress (4): 1.0/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3320177Z Progress (4): 1.0/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3320335Z Progress (4): 1.0/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3321032Z Progress (4): 1.0/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3321781Z Progress (4): 1.0/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3322000Z Progress (4): 1.1/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3322507Z Progress (4): 1.1/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3322739Z Progress (4): 1.1/1.9 MB | 321 kB | 1.1/1.4 MB | 136 kB
2026-09-21T13:24:07.3322894Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3334379Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3334736Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3334945Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3335299Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3335501Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3335655Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3335776Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3336007Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3336162Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3336388Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3336561Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3336677Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3336826Z Progress (4): 1.1/1.9 MB | 321 kB | 1.2/1.4 MB | 136 kB
2026-09-21T13:24:07.3336987Z Progress (4): 1.1/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3337188Z Progress (4): 1.1/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3337382Z Progress (4): 1.1/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3337624Z Progress (4): 1.1/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3337842Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3337999Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3338149Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3338263Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3338434Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3338593Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3338753Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3338902Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3339047Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3339163Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3339313Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3339461Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3339605Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3339826Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3339993Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3340152Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3340298Z Progress (4): 1.2/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3340529Z Progress (4): 1.3/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3340641Z Progress (4): 1.3/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3340792Z Progress (4): 1.3/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3343120Z Progress (4): 1.3/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB
2026-09-21T13:24:07.3343345Z Progress (5): 1.3/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB | 0.9/4.8 kB
2026-09-21T13:24:07.3350487Z Progress (5): 1.3/1.9 MB | 321 kB | 1.3/1.4 MB | 136 kB | 4.8 kB    
2026-09-21T13:24:07.3350933Z Progress (5): 1.3/1.9 MB | 321 kB | 1.4 MB | 136 kB | 4.8 kB    
2026-09-21T13:24:07.3351045Z                                                             
2026-09-21T13:24:07.3351621Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-expression/6.2.19/spring-expression-6.2.19.jar (321 kB at 10 MB/s)
2026-09-21T13:24:07.3352027Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-logging/3.5.16/spring-boot-starter-logging-3.5.16.jar
2026-09-21T13:24:07.3352492Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-configuration-processor/3.5.16/spring-boot-configuration-processor-3.5.16.jar (136 kB at 4.2 MB/s)
2026-09-21T13:24:07.3352929Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.jar
2026-09-21T13:24:07.3353138Z Progress (3): 1.3/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3353286Z Progress (3): 1.3/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3353405Z Progress (3): 1.4/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3353565Z Progress (3): 1.4/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3354138Z Progress (3): 1.4/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3355229Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3355428Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3355538Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3356838Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3356986Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3357242Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3357449Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3358143Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3358717Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3359111Z Progress (3): 1.5/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3359373Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3359844Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3360024Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3360135Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3361084Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3362075Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3362898Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3363253Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3363469Z Progress (3): 1.6/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3363621Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3363765Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3364377Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3366683Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3366837Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3366994Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3367951Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3368610Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3369136Z Progress (3): 1.7/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3370092Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3370809Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3370957Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3371106Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3371416Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3371726Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3372229Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3372526Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3372638Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3373084Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3373284Z Progress (3): 1.8/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3373798Z Progress (3): 1.9/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3374924Z Progress (3): 1.9/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3375157Z Progress (3): 1.9/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3375694Z Progress (3): 1.9/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3376058Z Progress (3): 1.9/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3376968Z Progress (3): 1.9/1.9 MB | 1.4 MB | 4.8 kB
2026-09-21T13:24:07.3390110Z Progress (3): 1.9 MB | 1.4 MB | 4.8 kB    
2026-09-21T13:24:07.3390394Z Progress (4): 1.9 MB | 1.4 MB | 4.8 kB | 3.6/4.8 kB
2026-09-21T13:24:07.3391314Z Progress (4): 1.9 MB | 1.4 MB | 4.8 kB | 4.8 kB    
2026-09-21T13:24:07.3391477Z                                                
2026-09-21T13:24:07.3391979Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter/3.5.16/spring-boot-starter-3.5.16.jar (4.8 kB at 132 kB/s)
2026-09-21T13:24:07.3392348Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.jar
2026-09-21T13:24:07.3416697Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-context/6.2.19/spring-context-6.2.19.jar (1.4 MB at 36 MB/s)
2026-09-21T13:24:07.3417129Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot/3.5.16/spring-boot-3.5.16.jar (1.9 MB at 49 MB/s)
2026-09-21T13:24:07.3417501Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-to-slf4j/2.24.3/log4j-to-slf4j-2.24.3.jar
2026-09-21T13:24:07.3417824Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-api/2.24.3/log4j-api-2.24.3.jar
2026-09-21T13:24:07.3419512Z Progress (2): 4.8 kB | 0.9/287 kB
2026-09-21T13:24:07.3426852Z Progress (2): 4.8 kB | 13/287 kB 
2026-09-21T13:24:07.3427256Z Progress (2): 4.8 kB | 16/287 kB
2026-09-21T13:24:07.3427407Z Progress (2): 4.8 kB | 26/287 kB
2026-09-21T13:24:07.3427521Z Progress (2): 4.8 kB | 36/287 kB
2026-09-21T13:24:07.3428027Z Progress (2): 4.8 kB | 41/287 kB
2026-09-21T13:24:07.3428168Z                                 
2026-09-21T13:24:07.3428617Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-logging/3.5.16/spring-boot-starter-logging-3.5.16.jar (4.8 kB at 122 kB/s)
2026-09-21T13:24:07.3429006Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.jar
2026-09-21T13:24:07.3429512Z Progress (1): 42/287 kB
2026-09-21T13:24:07.3429750Z Progress (1): 53/287 kB
2026-09-21T13:24:07.3430971Z Progress (1): 58/287 kB
2026-09-21T13:24:07.3431115Z Progress (1): 60/287 kB
2026-09-21T13:24:07.3431328Z Progress (1): 64/287 kB
2026-09-21T13:24:07.3431492Z Progress (1): 65/287 kB
2026-09-21T13:24:07.3432079Z Progress (1): 78/287 kB
2026-09-21T13:24:07.3433326Z Progress (1): 95/287 kB
2026-09-21T13:24:07.3433491Z Progress (1): 97/287 kB
2026-09-21T13:24:07.3440679Z Progress (1): 98/287 kB
2026-09-21T13:24:07.3442265Z Progress (2): 98/287 kB | 5.0/349 kB
2026-09-21T13:24:07.3442463Z Progress (2): 98/287 kB | 38/349 kB 
2026-09-21T13:24:07.3442621Z Progress (2): 98/287 kB | 38/349 kB
2026-09-21T13:24:07.3442726Z Progress (2): 98/287 kB | 40/349 kB
2026-09-21T13:24:07.3445484Z Progress (2): 98/287 kB | 41/349 kB
2026-09-21T13:24:07.3445643Z Progress (2): 98/287 kB | 61/349 kB
2026-09-21T13:24:07.3445788Z Progress (2): 104/287 kB | 61/349 kB
2026-09-21T13:24:07.3445930Z Progress (2): 104/287 kB | 94/349 kB
2026-09-21T13:24:07.3446037Z Progress (2): 112/287 kB | 94/349 kB
2026-09-21T13:24:07.3446232Z Progress (2): 116/287 kB | 94/349 kB
2026-09-21T13:24:07.3446396Z Progress (2): 116/287 kB | 127/349 kB
2026-09-21T13:24:07.3446554Z Progress (2): 117/287 kB | 127/349 kB
2026-09-21T13:24:07.3446706Z Progress (2): 117/287 kB | 134/349 kB
2026-09-21T13:24:07.3446815Z Progress (2): 117/287 kB | 137/349 kB
2026-09-21T13:24:07.3446960Z Progress (2): 117/287 kB | 143/349 kB
2026-09-21T13:24:07.3447099Z Progress (2): 117/287 kB | 146/349 kB
2026-09-21T13:24:07.3447244Z Progress (2): 128/287 kB | 146/349 kB
2026-09-21T13:24:07.3447419Z Progress (2): 128/287 kB | 156/349 kB
2026-09-21T13:24:07.3447635Z Progress (2): 137/287 kB | 156/349 kB
2026-09-21T13:24:07.3447796Z Progress (2): 137/287 kB | 164/349 kB
2026-09-21T13:24:07.3447955Z Progress (2): 137/287 kB | 169/349 kB
2026-09-21T13:24:07.3448100Z Progress (2): 137/287 kB | 175/349 kB
2026-09-21T13:24:07.3448872Z Progress (2): 152/287 kB | 175/349 kB
2026-09-21T13:24:07.3449245Z Progress (2): 152/287 kB | 184/349 kB
2026-09-21T13:24:07.3449565Z Progress (2): 152/287 kB | 194/349 kB
2026-09-21T13:24:07.3449717Z Progress (2): 158/287 kB | 194/349 kB
2026-09-21T13:24:07.3450281Z Progress (2): 158/287 kB | 197/349 kB
2026-09-21T13:24:07.3450550Z Progress (2): 158/287 kB | 198/349 kB
2026-09-21T13:24:07.3451066Z Progress (2): 187/287 kB | 198/349 kB
2026-09-21T13:24:07.3451523Z Progress (2): 187/287 kB | 213/349 kB
2026-09-21T13:24:07.3452028Z Progress (2): 187/287 kB | 223/349 kB
2026-09-21T13:24:07.3452187Z Progress (2): 212/287 kB | 223/349 kB
2026-09-21T13:24:07.3452631Z Progress (2): 212/287 kB | 241/349 kB
2026-09-21T13:24:07.3454054Z Progress (2): 212/287 kB | 257/349 kB
2026-09-21T13:24:07.3454790Z Progress (2): 212/287 kB | 290/349 kB
2026-09-21T13:24:07.3455056Z Progress (2): 212/287 kB | 310/349 kB
2026-09-21T13:24:07.3455199Z Progress (2): 214/287 kB | 310/349 kB
2026-09-21T13:24:07.3455308Z Progress (2): 221/287 kB | 310/349 kB
2026-09-21T13:24:07.3456945Z Progress (2): 221/287 kB | 320/349 kB
2026-09-21T13:24:07.3458612Z Progress (2): 249/287 kB | 320/349 kB
2026-09-21T13:24:07.3458787Z Progress (2): 276/287 kB | 320/349 kB
2026-09-21T13:24:07.3458930Z Progress (2): 277/287 kB | 320/349 kB
2026-09-21T13:24:07.3459067Z Progress (2): 283/287 kB | 320/349 kB
2026-09-21T13:24:07.3459169Z Progress (2): 283/287 kB | 338/349 kB
2026-09-21T13:24:07.3459313Z Progress (2): 287 kB | 338/349 kB    
2026-09-21T13:24:07.3459746Z Progress (2): 287 kB | 349 kB    
2026-09-21T13:24:07.3462085Z Progress (3): 287 kB | 349 kB | 7.7/645 kB
2026-09-21T13:24:07.3464004Z Progress (3): 287 kB | 349 kB | 40/645 kB 
2026-09-21T13:24:07.3466449Z Progress (3): 287 kB | 349 kB | 73/645 kB
2026-09-21T13:24:07.3474654Z Progress (3): 287 kB | 349 kB | 98/645 kB
2026-09-21T13:24:07.3474822Z Progress (4): 287 kB | 349 kB | 98/645 kB | 5.0/6.3 kB
2026-09-21T13:24:07.3480644Z Progress (4): 287 kB | 349 kB | 98/645 kB | 6.3 kB    
2026-09-21T13:24:07.3483917Z Progress (4): 287 kB | 349 kB | 100/645 kB | 6.3 kB
2026-09-21T13:24:07.3484683Z Progress (4): 287 kB | 349 kB | 132/645 kB | 6.3 kB
2026-09-21T13:24:07.3487501Z Progress (4): 287 kB | 349 kB | 154/645 kB | 6.3 kB
2026-09-21T13:24:07.3487746Z Progress (4): 287 kB | 349 kB | 156/645 kB | 6.3 kB
2026-09-21T13:24:07.3487914Z Progress (4): 287 kB | 349 kB | 163/645 kB | 6.3 kB
2026-09-21T13:24:07.3488198Z                                                    
2026-09-21T13:24:07.3488728Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-api/2.24.3/log4j-api-2.24.3.jar (349 kB at 7.7 MB/s)
2026-09-21T13:24:07.3489116Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar
2026-09-21T13:24:07.3489331Z Progress (3): 287 kB | 167/645 kB | 6.3 kB
2026-09-21T13:24:07.3489445Z Progress (3): 287 kB | 183/645 kB | 6.3 kB
2026-09-21T13:24:07.3489608Z Progress (3): 287 kB | 184/645 kB | 6.3 kB
2026-09-21T13:24:07.3490333Z Progress (3): 287 kB | 186/645 kB | 6.3 kB
2026-09-21T13:24:07.3491351Z Progress (3): 287 kB | 189/645 kB | 6.3 kB
2026-09-21T13:24:07.3491619Z Progress (3): 287 kB | 210/645 kB | 6.3 kB
2026-09-21T13:24:07.3493270Z Progress (3): 287 kB | 213/645 kB | 6.3 kB
2026-09-21T13:24:07.3494382Z Progress (3): 287 kB | 216/645 kB | 6.3 kB
2026-09-21T13:24:07.3494537Z Progress (3): 287 kB | 219/645 kB | 6.3 kB
2026-09-21T13:24:07.3495051Z Progress (3): 287 kB | 230/645 kB | 6.3 kB
2026-09-21T13:24:07.3496781Z Progress (3): 287 kB | 231/645 kB | 6.3 kB
2026-09-21T13:24:07.3498601Z Progress (3): 287 kB | 232/645 kB | 6.3 kB
2026-09-21T13:24:07.3499024Z Progress (4): 287 kB | 232/645 kB | 6.3 kB | 0.9/24 kB
2026-09-21T13:24:07.3499299Z Progress (4): 287 kB | 232/645 kB | 6.3 kB | 21/24 kB 
2026-09-21T13:24:07.3508811Z Progress (4): 287 kB | 232/645 kB | 6.3 kB | 24 kB   
2026-09-21T13:24:07.3509420Z Progress (4): 287 kB | 265/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3510485Z Progress (4): 287 kB | 283/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3510740Z Progress (5): 287 kB | 283/645 kB | 6.3 kB | 24 kB | 0.9/26 kB
2026-09-21T13:24:07.3510959Z Progress (5): 287 kB | 287/645 kB | 6.3 kB | 24 kB | 0.9/26 kB
2026-09-21T13:24:07.3511802Z Progress (5): 287 kB | 308/645 kB | 6.3 kB | 24 kB | 0.9/26 kB
2026-09-21T13:24:07.3511968Z Progress (5): 287 kB | 308/645 kB | 6.3 kB | 24 kB | 26 kB    
2026-09-21T13:24:07.3512133Z Progress (5): 287 kB | 331/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3520976Z Progress (5): 287 kB | 335/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3521183Z Progress (5): 287 kB | 338/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3521307Z Progress (5): 287 kB | 347/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3522171Z Progress (5): 287 kB | 349/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3523524Z Progress (5): 287 kB | 351/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3523694Z Progress (5): 287 kB | 373/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3528762Z Progress (5): 287 kB | 398/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3530534Z Progress (5): 287 kB | 431/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3530703Z Progress (5): 287 kB | 463/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3533484Z Progress (5): 287 kB | 468/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3533704Z Progress (5): 287 kB | 470/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3539837Z Progress (5): 287 kB | 476/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3540053Z Progress (5): 287 kB | 492/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3540443Z Progress (5): 287 kB | 513/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3540622Z Progress (5): 287 kB | 529/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3540867Z Progress (5): 287 kB | 540/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3541067Z Progress (5): 287 kB | 544/645 kB | 6.3 kB | 24 kB | 26 kB
2026-09-21T13:24:07.3541277Z                                                           
2026-09-21T13:24:07.3541753Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar (26 kB at 523 kB/s)
2026-09-21T13:24:07.3542179Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-core/5.2.6/spring-batch-core-5.2.6.jar
2026-09-21T13:24:07.3542888Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-classic/1.5.34/logback-classic-1.5.34.jar (287 kB at 5.7 MB/s)
2026-09-21T13:24:07.3544828Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-infrastructure/5.2.6/spring-batch-infrastructure-5.2.6.jar
2026-09-21T13:24:07.3545128Z Progress (3): 546/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3545354Z Progress (3): 552/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3545527Z Progress (3): 563/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3545698Z Progress (3): 573/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3545908Z Progress (3): 580/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3546053Z Progress (3): 613/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3546222Z Progress (3): 622/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3552476Z Progress (3): 624/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3552646Z Progress (3): 628/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3552795Z Progress (3): 630/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3553024Z Progress (3): 640/645 kB | 6.3 kB | 24 kB
2026-09-21T13:24:07.3553177Z Progress (3): 645 kB | 6.3 kB | 24 kB    
2026-09-21T13:24:07.3553331Z                                      
2026-09-21T13:24:07.3553666Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/jul-to-slf4j/2.0.18/jul-to-slf4j-2.0.18.jar (6.3 kB at 122 kB/s)
2026-09-21T13:24:07.3554130Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-aop/6.2.19/spring-aop-6.2.19.jar
2026-09-21T13:24:07.3564351Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/logging/log4j/log4j-to-slf4j/2.24.3/log4j-to-slf4j-2.24.3.jar (24 kB at 450 kB/s)
2026-09-21T13:24:07.3564857Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-beans/6.2.19/spring-beans-6.2.19.jar
2026-09-21T13:24:07.3603264Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/ch/qos/logback/logback-core/1.5.34/logback-core-1.5.34.jar (645 kB at 11 MB/s)
2026-09-21T13:24:07.3603704Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-tx/6.2.19/spring-tx-6.2.19.jar
2026-09-21T13:24:07.3604978Z Progress (1): 0.9/537 kB
2026-09-21T13:24:07.3605135Z Progress (1): 33/537 kB 
2026-09-21T13:24:07.3611802Z Progress (1): 38/537 kB
2026-09-21T13:24:07.3611973Z Progress (1): 66/537 kB
2026-09-21T13:24:07.3612110Z Progress (1): 82/537 kB
2026-09-21T13:24:07.3639492Z Progress (1): 98/537 kB
2026-09-21T13:24:07.3639699Z Progress (1): 104/537 kB
2026-09-21T13:24:07.3639805Z Progress (1): 113/537 kB
2026-09-21T13:24:07.3641375Z Progress (1): 123/537 kB
2026-09-21T13:24:07.3642309Z Progress (1): 126/537 kB
2026-09-21T13:24:07.3643011Z Progress (1): 131/537 kB
2026-09-21T13:24:07.3646100Z Progress (1): 137/537 kB
2026-09-21T13:24:07.3646722Z Progress (1): 169/537 kB
2026-09-21T13:24:07.3647576Z Progress (1): 202/537 kB
2026-09-21T13:24:07.3647789Z Progress (1): 235/537 kB
2026-09-21T13:24:07.3650359Z Progress (1): 239/537 kB
2026-09-21T13:24:07.3650508Z Progress (1): 240/537 kB
2026-09-21T13:24:07.3650613Z Progress (2): 240/537 kB | 7.7/718 kB
2026-09-21T13:24:07.3651137Z Progress (2): 246/537 kB | 7.7/718 kB
2026-09-21T13:24:07.3652815Z Progress (2): 246/537 kB | 40/718 kB 
2026-09-21T13:24:07.3653037Z Progress (2): 251/537 kB | 40/718 kB
2026-09-21T13:24:07.3653181Z Progress (2): 251/537 kB | 73/718 kB
2026-09-21T13:24:07.3653283Z Progress (2): 261/537 kB | 73/718 kB
2026-09-21T13:24:07.3654973Z Progress (2): 268/537 kB | 73/718 kB
2026-09-21T13:24:07.3655220Z Progress (2): 268/537 kB | 98/718 kB
2026-09-21T13:24:07.3655555Z Progress (2): 300/537 kB | 98/718 kB
2026-09-21T13:24:07.3656593Z Progress (2): 333/537 kB | 98/718 kB
2026-09-21T13:24:07.3687986Z Progress (2): 360/537 kB | 98/718 kB
2026-09-21T13:24:07.3696740Z Progress (2): 362/537 kB | 98/718 kB
2026-09-21T13:24:07.3696999Z Progress (3): 362/537 kB | 98/718 kB | 0.9/892 kB
2026-09-21T13:24:07.3697207Z Progress (3): 362/537 kB | 98/718 kB | 34/892 kB 
2026-09-21T13:24:07.3697427Z Progress (3): 362/537 kB | 98/718 kB | 66/892 kB
2026-09-21T13:24:07.3697634Z Progress (4): 362/537 kB | 98/718 kB | 66/892 kB | 0.9/420 kB
2026-09-21T13:24:07.3697763Z Progress (4): 362/537 kB | 98/718 kB | 98/892 kB | 0.9/420 kB
2026-09-21T13:24:07.3697922Z Progress (4): 362/537 kB | 98/718 kB | 98/892 kB | 34/420 kB 
2026-09-21T13:24:07.3698080Z Progress (4): 362/537 kB | 98/718 kB | 98/892 kB | 66/420 kB
2026-09-21T13:24:07.3698241Z Progress (4): 395/537 kB | 98/718 kB | 98/892 kB | 66/420 kB
2026-09-21T13:24:07.3698462Z Progress (4): 395/537 kB | 98/718 kB | 98/892 kB | 98/420 kB
2026-09-21T13:24:07.3698585Z Progress (4): 427/537 kB | 98/718 kB | 98/892 kB | 98/420 kB
2026-09-21T13:24:07.3698767Z Progress (4): 460/537 kB | 98/718 kB | 98/892 kB | 98/420 kB
2026-09-21T13:24:07.3698934Z Progress (4): 493/537 kB | 98/718 kB | 98/892 kB | 98/420 kB
2026-09-21T13:24:07.3699104Z Progress (4): 526/537 kB | 98/718 kB | 98/892 kB | 98/420 kB
2026-09-21T13:24:07.3726456Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 98/420 kB    
2026-09-21T13:24:07.3726594Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 104/420 kB
2026-09-21T13:24:07.3727679Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 112/420 kB
2026-09-21T13:24:07.3727845Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 115/420 kB
2026-09-21T13:24:07.3728001Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 116/420 kB
2026-09-21T13:24:07.3730136Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 120/420 kB
2026-09-21T13:24:07.3731336Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 149/420 kB
2026-09-21T13:24:07.3732343Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 182/420 kB
2026-09-21T13:24:07.3732498Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 214/420 kB
2026-09-21T13:24:07.3734693Z Progress (4): 537 kB | 98/718 kB | 98/892 kB | 225/420 kB
2026-09-21T13:24:07.3735062Z Progress (4): 537 kB | 98/718 kB | 100/892 kB | 225/420 kB
2026-09-21T13:24:07.3735274Z Progress (4): 537 kB | 98/718 kB | 113/892 kB | 225/420 kB
2026-09-21T13:24:07.3735440Z Progress (4): 537 kB | 98/718 kB | 115/892 kB | 225/420 kB
2026-09-21T13:24:07.3735565Z Progress (4): 537 kB | 98/718 kB | 120/892 kB | 225/420 kB
2026-09-21T13:24:07.3735897Z Progress (4): 537 kB | 98/718 kB | 122/892 kB | 225/420 kB
2026-09-21T13:24:07.3736794Z Progress (4): 537 kB | 102/718 kB | 122/892 kB | 225/420 kB
2026-09-21T13:24:07.3748571Z Progress (4): 537 kB | 104/718 kB | 122/892 kB | 225/420 kB
2026-09-21T13:24:07.3748891Z Progress (4): 537 kB | 117/718 kB | 122/892 kB | 225/420 kB
2026-09-21T13:24:07.3749136Z Progress (4): 537 kB | 117/718 kB | 135/892 kB | 225/420 kB
2026-09-21T13:24:07.3749352Z Progress (4): 537 kB | 124/718 kB | 135/892 kB | 225/420 kB
2026-09-21T13:24:07.3749568Z Progress (4): 537 kB | 124/718 kB | 139/892 kB | 225/420 kB
2026-09-21T13:24:07.3749781Z Progress (4): 537 kB | 131/718 kB | 139/892 kB | 225/420 kB
2026-09-21T13:24:07.3749991Z Progress (4): 537 kB | 131/718 kB | 152/892 kB | 225/420 kB
2026-09-21T13:24:07.3750257Z Progress (4): 537 kB | 146/718 kB | 152/892 kB | 225/420 kB
2026-09-21T13:24:07.3750418Z Progress (4): 537 kB | 146/718 kB | 152/892 kB | 238/420 kB
2026-09-21T13:24:07.3750646Z Progress (4): 537 kB | 146/718 kB | 153/892 kB | 238/420 kB
2026-09-21T13:24:07.3750850Z Progress (4): 537 kB | 157/718 kB | 153/892 kB | 238/420 kB
2026-09-21T13:24:07.3751050Z Progress (4): 537 kB | 157/718 kB | 154/892 kB | 238/420 kB
2026-09-21T13:24:07.3751212Z Progress (4): 537 kB | 163/718 kB | 154/892 kB | 238/420 kB
2026-09-21T13:24:07.3751417Z Progress (4): 537 kB | 168/718 kB | 154/892 kB | 238/420 kB
2026-09-21T13:24:07.3751621Z Progress (4): 537 kB | 168/718 kB | 173/892 kB | 238/420 kB
2026-09-21T13:24:07.3751829Z Progress (4): 537 kB | 172/718 kB | 173/892 kB | 238/420 kB
2026-09-21T13:24:07.3752028Z Progress (4): 537 kB | 172/718 kB | 176/892 kB | 238/420 kB
2026-09-21T13:24:07.3752322Z Progress (4): 537 kB | 179/718 kB | 176/892 kB | 238/420 kB
2026-09-21T13:24:07.3752557Z Progress (4): 537 kB | 179/718 kB | 176/892 kB | 270/420 kB
2026-09-21T13:24:07.3752756Z Progress (4): 537 kB | 179/718 kB | 197/892 kB | 270/420 kB
2026-09-21T13:24:07.3752971Z Progress (4): 537 kB | 184/718 kB | 197/892 kB | 270/420 kB
2026-09-21T13:24:07.3753134Z Progress (4): 537 kB | 184/718 kB | 198/892 kB | 270/420 kB
2026-09-21T13:24:07.3753253Z Progress (4): 537 kB | 190/718 kB | 198/892 kB | 270/420 kB
2026-09-21T13:24:07.3753407Z Progress (4): 537 kB | 195/718 kB | 198/892 kB | 270/420 kB
2026-09-21T13:24:07.3753559Z Progress (4): 537 kB | 195/718 kB | 229/892 kB | 270/420 kB
2026-09-21T13:24:07.3753763Z Progress (4): 537 kB | 213/718 kB | 229/892 kB | 270/420 kB
2026-09-21T13:24:07.3754038Z Progress (4): 537 kB | 223/718 kB | 229/892 kB | 270/420 kB
2026-09-21T13:24:07.3754159Z Progress (4): 537 kB | 223/718 kB | 229/892 kB | 279/420 kB
2026-09-21T13:24:07.3754330Z Progress (4): 537 kB | 223/718 kB | 261/892 kB | 279/420 kB
2026-09-21T13:24:07.3754488Z Progress (4): 537 kB | 247/718 kB | 261/892 kB | 279/420 kB
2026-09-21T13:24:07.3754644Z Progress (4): 537 kB | 247/718 kB | 294/892 kB | 279/420 kB
2026-09-21T13:24:07.3754794Z Progress (4): 537 kB | 273/718 kB | 294/892 kB | 279/420 kB
2026-09-21T13:24:07.3754912Z Progress (4): 537 kB | 273/718 kB | 294/892 kB | 311/420 kB
2026-09-21T13:24:07.3755091Z Progress (4): 537 kB | 288/718 kB | 294/892 kB | 311/420 kB
2026-09-21T13:24:07.3755241Z Progress (4): 537 kB | 288/718 kB | 326/892 kB | 311/420 kB
2026-09-21T13:24:07.3755402Z Progress (4): 537 kB | 295/718 kB | 326/892 kB | 311/420 kB
2026-09-21T13:24:07.3755557Z Progress (4): 537 kB | 295/718 kB | 326/892 kB | 344/420 kB
2026-09-21T13:24:07.3755674Z Progress (4): 537 kB | 309/718 kB | 326/892 kB | 344/420 kB
2026-09-21T13:24:07.3755836Z Progress (4): 537 kB | 309/718 kB | 359/892 kB | 344/420 kB
2026-09-21T13:24:07.3755984Z Progress (4): 537 kB | 309/718 kB | 359/892 kB | 360/420 kB
2026-09-21T13:24:07.3756136Z Progress (4): 537 kB | 309/718 kB | 360/892 kB | 360/420 kB
2026-09-21T13:24:07.3756288Z Progress (4): 537 kB | 311/718 kB | 360/892 kB | 360/420 kB
2026-09-21T13:24:07.3756407Z Progress (4): 537 kB | 313/718 kB | 360/892 kB | 360/420 kB
2026-09-21T13:24:07.3756557Z Progress (4): 537 kB | 333/718 kB | 360/892 kB | 360/420 kB
2026-09-21T13:24:07.3756712Z Progress (4): 537 kB | 337/718 kB | 360/892 kB | 360/420 kB
2026-09-21T13:24:07.3756874Z Progress (4): 537 kB | 350/718 kB | 360/892 kB | 360/420 kB
2026-09-21T13:24:07.3757063Z Progress (4): 537 kB | 350/718 kB | 360/892 kB | 371/420 kB
2026-09-21T13:24:07.3757179Z Progress (4): 537 kB | 360/718 kB | 360/892 kB | 371/420 kB
2026-09-21T13:24:07.3757345Z Progress (4): 537 kB | 360/718 kB | 360/892 kB | 404/420 kB
2026-09-21T13:24:07.3761544Z Progress (4): 537 kB | 360/718 kB | 360/892 kB | 420 kB    
2026-09-21T13:24:07.3761723Z Progress (4): 537 kB | 360/718 kB | 362/892 kB | 420 kB
2026-09-21T13:24:07.3761887Z Progress (5): 537 kB | 360/718 kB | 362/892 kB | 420 kB | 0.9/290 kB
2026-09-21T13:24:07.3762096Z Progress (5): 537 kB | 360/718 kB | 382/892 kB | 420 kB | 0.9/290 kB
2026-09-21T13:24:07.3762277Z Progress (5): 537 kB | 360/718 kB | 382/892 kB | 420 kB | 17/290 kB 
2026-09-21T13:24:07.3762442Z Progress (5): 537 kB | 360/718 kB | 393/892 kB | 420 kB | 17/290 kB
2026-09-21T13:24:07.3762604Z Progress (5): 537 kB | 360/718 kB | 393/892 kB | 420 kB | 20/290 kB
2026-09-21T13:24:07.3762759Z Progress (5): 537 kB | 360/718 kB | 406/892 kB | 420 kB | 20/290 kB
2026-09-21T13:24:07.3762881Z Progress (5): 537 kB | 360/718 kB | 406/892 kB | 420 kB | 33/290 kB
2026-09-21T13:24:07.3763130Z Progress (5): 537 kB | 360/718 kB | 422/892 kB | 420 kB | 33/290 kB
2026-09-21T13:24:07.3763302Z Progress (5): 537 kB | 360/718 kB | 426/892 kB | 420 kB | 33/290 kB
2026-09-21T13:24:07.3763492Z Progress (5): 537 kB | 360/718 kB | 426/892 kB | 420 kB | 66/290 kB
2026-09-21T13:24:07.3764861Z Progress (5): 537 kB | 360/718 kB | 426/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3765226Z Progress (5): 537 kB | 363/718 kB | 426/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3765426Z Progress (5): 537 kB | 367/718 kB | 426/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3765612Z Progress (5): 537 kB | 377/718 kB | 426/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3765934Z Progress (5): 537 kB | 377/718 kB | 459/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3766162Z Progress (5): 537 kB | 392/718 kB | 459/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3767117Z Progress (5): 537 kB | 396/718 kB | 459/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3767357Z Progress (5): 537 kB | 396/718 kB | 492/892 kB | 420 kB | 82/290 kB
2026-09-21T13:24:07.3767577Z Progress (5): 537 kB | 396/718 kB | 492/892 kB | 420 kB | 89/290 kB
2026-09-21T13:24:07.3767745Z Progress (5): 537 kB | 411/718 kB | 492/892 kB | 420 kB | 89/290 kB
2026-09-21T13:24:07.3767912Z Progress (5): 537 kB | 411/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3768620Z Progress (5): 537 kB | 425/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3768788Z Progress (5): 537 kB | 426/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3770646Z Progress (5): 537 kB | 427/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3770949Z Progress (5): 537 kB | 429/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3771091Z Progress (5): 537 kB | 444/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3771698Z Progress (5): 537 kB | 455/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3771872Z Progress (5): 537 kB | 474/718 kB | 492/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3772038Z Progress (5): 537 kB | 474/718 kB | 496/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3772242Z Progress (5): 537 kB | 483/718 kB | 496/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3772403Z Progress (5): 537 kB | 483/718 kB | 497/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3777927Z Progress (5): 537 kB | 492/718 kB | 497/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3778099Z Progress (5): 537 kB | 509/718 kB | 497/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3778285Z Progress (5): 537 kB | 509/718 kB | 520/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3778474Z Progress (5): 537 kB | 542/718 kB | 520/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3778631Z Progress (5): 537 kB | 542/718 kB | 528/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3778751Z Progress (5): 537 kB | 542/718 kB | 550/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3778905Z Progress (5): 537 kB | 575/718 kB | 550/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3779060Z Progress (5): 537 kB | 575/718 kB | 572/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3779265Z Progress (5): 537 kB | 608/718 kB | 572/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3779420Z Progress (5): 537 kB | 608/718 kB | 591/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3779585Z Progress (5): 537 kB | 623/718 kB | 591/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3779690Z                                                                    
2026-09-21T13:24:07.3780233Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-infrastructure/5.2.6/spring-batch-infrastructure-5.2.6.jar (537 kB at 7.3 MB/s)
2026-09-21T13:24:07.3780647Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/spring-data-commons/3.5.13/spring-data-commons-3.5.13.jar
2026-09-21T13:24:07.3780870Z Progress (4): 623/718 kB | 608/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3781030Z Progress (4): 623/718 kB | 609/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3781155Z Progress (4): 623/718 kB | 617/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3781629Z Progress (4): 623/718 kB | 623/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3782213Z Progress (4): 623/718 kB | 624/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3782377Z Progress (4): 623/718 kB | 628/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3784152Z Progress (4): 625/718 kB | 628/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3784437Z Progress (4): 625/718 kB | 632/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3785411Z Progress (4): 625/718 kB | 636/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3785535Z Progress (4): 657/718 kB | 636/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3786026Z Progress (4): 657/718 kB | 654/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3786584Z Progress (4): 657/718 kB | 687/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3786939Z Progress (4): 689/718 kB | 687/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3787498Z Progress (4): 689/718 kB | 714/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3787711Z Progress (4): 689/718 kB | 725/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3788722Z Progress (4): 718 kB | 725/892 kB | 420 kB | 98/290 kB    
2026-09-21T13:24:07.3789486Z Progress (4): 718 kB | 754/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3789850Z Progress (4): 718 kB | 755/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3790032Z Progress (4): 718 kB | 758/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3790589Z Progress (4): 718 kB | 759/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3790899Z Progress (4): 718 kB | 763/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3791665Z Progress (4): 718 kB | 771/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3792338Z Progress (4): 718 kB | 786/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3792715Z Progress (4): 718 kB | 797/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3793624Z Progress (4): 718 kB | 817/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3793778Z Progress (4): 718 kB | 823/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3794029Z Progress (4): 718 kB | 833/892 kB | 420 kB | 98/290 kB
2026-09-21T13:24:07.3794160Z Progress (4): 718 kB | 833/892 kB | 420 kB | 100/290 kB
2026-09-21T13:24:07.3794335Z Progress (4): 718 kB | 844/892 kB | 420 kB | 100/290 kB
2026-09-21T13:24:07.3794558Z Progress (4): 718 kB | 845/892 kB | 420 kB | 100/290 kB
2026-09-21T13:24:07.3795363Z Progress (4): 718 kB | 845/892 kB | 420 kB | 101/290 kB
2026-09-21T13:24:07.3795522Z Progress (4): 718 kB | 856/892 kB | 420 kB | 101/290 kB
2026-09-21T13:24:07.3796740Z Progress (4): 718 kB | 860/892 kB | 420 kB | 101/290 kB
2026-09-21T13:24:07.3797049Z Progress (4): 718 kB | 883/892 kB | 420 kB | 101/290 kB
2026-09-21T13:24:07.3798049Z Progress (4): 718 kB | 892 kB | 420 kB | 101/290 kB    
2026-09-21T13:24:07.3799014Z Progress (4): 718 kB | 892 kB | 420 kB | 134/290 kB
2026-09-21T13:24:07.3799544Z Progress (4): 718 kB | 892 kB | 420 kB | 167/290 kB
2026-09-21T13:24:07.3806094Z Progress (4): 718 kB | 892 kB | 420 kB | 186/290 kB
2026-09-21T13:24:07.3806273Z Progress (4): 718 kB | 892 kB | 420 kB | 189/290 kB
2026-09-21T13:24:07.3809200Z Progress (4): 718 kB | 892 kB | 420 kB | 199/290 kB
2026-09-21T13:24:07.3809355Z Progress (4): 718 kB | 892 kB | 420 kB | 232/290 kB
2026-09-21T13:24:07.3809471Z Progress (4): 718 kB | 892 kB | 420 kB | 265/290 kB
2026-09-21T13:24:07.3810600Z Progress (4): 718 kB | 892 kB | 420 kB | 277/290 kB
2026-09-21T13:24:07.3810763Z Progress (4): 718 kB | 892 kB | 420 kB | 279/290 kB
2026-09-21T13:24:07.3810942Z Progress (4): 718 kB | 892 kB | 420 kB | 286/290 kB
2026-09-21T13:24:07.3814831Z Progress (4): 718 kB | 892 kB | 420 kB | 290 kB    
2026-09-21T13:24:07.3814970Z                                                
2026-09-21T13:24:07.3815446Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-aop/6.2.19/spring-aop-6.2.19.jar (420 kB at 5.4 MB/s)
2026-09-21T13:24:07.3816065Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-jdbc/3.5.16/spring-boot-starter-jdbc-3.5.16.jar
2026-09-21T13:24:07.3845337Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-core/5.2.6/spring-batch-core-5.2.6.jar (718 kB at 8.9 MB/s)
2026-09-21T13:24:07.3845735Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/zaxxer/HikariCP/6.3.3/HikariCP-6.3.3.jar
2026-09-21T13:24:07.3851899Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-beans/6.2.19/spring-beans-6.2.19.jar (892 kB at 11 MB/s)
2026-09-21T13:24:07.3855966Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.jar
2026-09-21T13:24:07.3881053Z Progress (2): 290 kB | 0/1.5 MB
2026-09-21T13:24:07.3882542Z Progress (2): 290 kB | 0/1.5 MB
2026-09-21T13:24:07.3882651Z Progress (2): 290 kB | 0.1/1.5 MB
2026-09-21T13:24:07.3894550Z Progress (2): 290 kB | 0.1/1.5 MB
2026-09-21T13:24:07.3894848Z                                  
2026-09-21T13:24:07.3895303Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-tx/6.2.19/spring-tx-6.2.19.jar (290 kB at 3.4 MB/s)
2026-09-21T13:24:07.3895710Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jdbc/6.2.19/spring-jdbc-6.2.19.jar
2026-09-21T13:24:07.3906706Z Progress (1): 0.1/1.5 MB
2026-09-21T13:24:07.3911432Z Progress (1): 0.1/1.5 MB
2026-09-21T13:24:07.3911590Z Progress (2): 0.1/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3911779Z Progress (2): 0.1/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3911921Z Progress (2): 0.1/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3912022Z Progress (2): 0.2/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3912165Z Progress (2): 0.2/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3912311Z Progress (2): 0.2/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3913715Z Progress (2): 0.2/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3917541Z Progress (2): 0.2/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3917767Z Progress (2): 0.2/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3917873Z Progress (2): 0.3/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3918844Z Progress (2): 0.3/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3920414Z Progress (2): 0.3/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3920961Z Progress (2): 0.3/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3922198Z Progress (2): 0.3/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3923203Z Progress (2): 0.3/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3923895Z Progress (2): 0.4/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3924131Z Progress (2): 0.4/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3924370Z Progress (2): 0.4/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3925050Z Progress (2): 0.4/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3926385Z Progress (2): 0.4/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3926757Z Progress (2): 0.4/1.5 MB | 4.8 kB
2026-09-21T13:24:07.3926907Z Progress (3): 0.4/1.5 MB | 4.8 kB | 5.0/172 kB
2026-09-21T13:24:07.3927218Z Progress (3): 0.4/1.5 MB | 4.8 kB | 5.0/172 kB
2026-09-21T13:24:07.3927375Z Progress (3): 0.4/1.5 MB | 4.8 kB | 33/172 kB 
2026-09-21T13:24:07.3928300Z Progress (3): 0.4/1.5 MB | 4.8 kB | 33/172 kB
2026-09-21T13:24:07.3928458Z Progress (3): 0.4/1.5 MB | 4.8 kB | 33/172 kB
2026-09-21T13:24:07.3928701Z Progress (3): 0.4/1.5 MB | 4.8 kB | 34/172 kB
2026-09-21T13:24:07.3928866Z Progress (3): 0.5/1.5 MB | 4.8 kB | 34/172 kB
2026-09-21T13:24:07.3929079Z Progress (3): 0.5/1.5 MB | 4.8 kB | 42/172 kB
2026-09-21T13:24:07.3929194Z Progress (3): 0.5/1.5 MB | 4.8 kB | 45/172 kB
2026-09-21T13:24:07.3930155Z Progress (3): 0.5/1.5 MB | 4.8 kB | 49/172 kB
2026-09-21T13:24:07.3930306Z Progress (3): 0.5/1.5 MB | 4.8 kB | 60/172 kB
2026-09-21T13:24:07.3930506Z Progress (3): 0.5/1.5 MB | 4.8 kB | 61/172 kB
2026-09-21T13:24:07.3931294Z Progress (3): 0.5/1.5 MB | 4.8 kB | 66/172 kB
2026-09-21T13:24:07.3932404Z Progress (3): 0.5/1.5 MB | 4.8 kB | 78/172 kB
2026-09-21T13:24:07.3933339Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3934499Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3935210Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3935360Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3935948Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3936447Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3936582Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3938432Z Progress (3): 0.5/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3938983Z Progress (3): 0.6/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3939930Z Progress (3): 0.6/1.5 MB | 4.8 kB | 98/172 kB
2026-09-21T13:24:07.3940982Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 3.6/70 kB
2026-09-21T13:24:07.3941455Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 27/70 kB 
2026-09-21T13:24:07.3943775Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 45/70 kB
2026-09-21T13:24:07.3944068Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 45/70 kB
2026-09-21T13:24:07.3944232Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 45/70 kB
2026-09-21T13:24:07.3944439Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 70 kB   
2026-09-21T13:24:07.3944597Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 70 kB
2026-09-21T13:24:07.3944718Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 70 kB
2026-09-21T13:24:07.3944874Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 70 kB
2026-09-21T13:24:07.3947287Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 70 kB
2026-09-21T13:24:07.3947445Z Progress (4): 0.6/1.5 MB | 4.8 kB | 98/172 kB | 70 kB
2026-09-21T13:24:07.3947657Z Progress (4): 0.6/1.5 MB | 4.8 kB | 112/172 kB | 70 kB
2026-09-21T13:24:07.3947785Z Progress (4): 0.6/1.5 MB | 4.8 kB | 119/172 kB | 70 kB
2026-09-21T13:24:07.3947963Z Progress (4): 0.6/1.5 MB | 4.8 kB | 122/172 kB | 70 kB
2026-09-21T13:24:07.3948115Z Progress (4): 0.6/1.5 MB | 4.8 kB | 123/172 kB | 70 kB
2026-09-21T13:24:07.3948268Z Progress (4): 0.6/1.5 MB | 4.8 kB | 127/172 kB | 70 kB
2026-09-21T13:24:07.3948424Z Progress (4): 0.6/1.5 MB | 4.8 kB | 127/172 kB | 70 kB
2026-09-21T13:24:07.3948543Z Progress (4): 0.6/1.5 MB | 4.8 kB | 134/172 kB | 70 kB
2026-09-21T13:24:07.3949324Z Progress (4): 0.6/1.5 MB | 4.8 kB | 142/172 kB | 70 kB
2026-09-21T13:24:07.3949491Z Progress (4): 0.6/1.5 MB | 4.8 kB | 146/172 kB | 70 kB
2026-09-21T13:24:07.3949656Z Progress (4): 0.7/1.5 MB | 4.8 kB | 146/172 kB | 70 kB
2026-09-21T13:24:07.3949804Z Progress (4): 0.7/1.5 MB | 4.8 kB | 150/172 kB | 70 kB
2026-09-21T13:24:07.3950194Z Progress (4): 0.7/1.5 MB | 4.8 kB | 153/172 kB | 70 kB
2026-09-21T13:24:07.3950619Z Progress (4): 0.7/1.5 MB | 4.8 kB | 158/172 kB | 70 kB
2026-09-21T13:24:07.3950798Z Progress (4): 0.7/1.5 MB | 4.8 kB | 164/172 kB | 70 kB
2026-09-21T13:24:07.3951014Z Progress (4): 0.7/1.5 MB | 4.8 kB | 169/172 kB | 70 kB
2026-09-21T13:24:07.3951204Z Progress (4): 0.7/1.5 MB | 4.8 kB | 172 kB | 70 kB    
2026-09-21T13:24:07.3952660Z Progress (4): 0.7/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3967872Z Progress (4): 0.7/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3968062Z Progress (4): 0.8/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3968285Z Progress (4): 0.8/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3968481Z Progress (4): 0.8/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3968750Z Progress (4): 0.8/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3968897Z Progress (4): 0.8/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3969013Z Progress (4): 0.9/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3969177Z Progress (4): 0.9/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3969358Z Progress (4): 0.9/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3969512Z Progress (4): 0.9/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3969709Z Progress (4): 0.9/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3969908Z Progress (4): 1.0/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3971009Z Progress (4): 1.0/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3971844Z Progress (4): 1.0/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3974815Z Progress (4): 1.1/1.5 MB | 4.8 kB | 172 kB | 70 kB
2026-09-21T13:24:07.3974971Z                                                   
2026-09-21T13:24:07.3975416Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-jdbc/3.5.16/spring-boot-starter-jdbc-3.5.16.jar (4.8 kB at 51 kB/s)
2026-09-21T13:24:07.3976079Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-actuator/3.5.16/spring-boot-starter-actuator-3.5.16.jar
2026-09-21T13:24:07.3982582Z Progress (3): 1.1/1.5 MB | 172 kB | 70 kB
2026-09-21T13:24:07.3982844Z Progress (3): 1.1/1.5 MB | 172 kB | 70 kB
2026-09-21T13:24:07.3983032Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 7.7/476 kB
2026-09-21T13:24:07.3983255Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 40/476 kB 
2026-09-21T13:24:07.3983381Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 40/476 kB
2026-09-21T13:24:07.3983649Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 40/476 kB
2026-09-21T13:24:07.3984111Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 73/476 kB
2026-09-21T13:24:07.3984268Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 73/476 kB
2026-09-21T13:24:07.3984420Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 73/476 kB
2026-09-21T13:24:07.3984539Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 96/476 kB
2026-09-21T13:24:07.3984694Z Progress (4): 1.1/1.5 MB | 172 kB | 70 kB | 96/476 kB
2026-09-21T13:24:07.3984848Z Progress (4): 1.2/1.5 MB | 172 kB | 70 kB | 96/476 kB
2026-09-21T13:24:07.3985005Z Progress (4): 1.2/1.5 MB | 172 kB | 70 kB | 97/476 kB
2026-09-21T13:24:07.3985170Z Progress (4): 1.2/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3985306Z Progress (4): 1.2/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3985516Z Progress (4): 1.2/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3987058Z Progress (4): 1.2/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3987263Z Progress (4): 1.2/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3987427Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3987636Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3987759Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3987956Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3988111Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3989241Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3989583Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3989713Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3989957Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3990120Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3990334Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3991434Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 98/476 kB
2026-09-21T13:24:07.3991634Z Progress (4): 1.3/1.5 MB | 172 kB | 70 kB | 100/476 kB
2026-09-21T13:24:07.3991784Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 100/476 kB
2026-09-21T13:24:07.3992010Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 100/476 kB
2026-09-21T13:24:07.3992196Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 100/476 kB
2026-09-21T13:24:07.3992419Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 100/476 kB
2026-09-21T13:24:07.3992615Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 101/476 kB
2026-09-21T13:24:07.3992923Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 101/476 kB
2026-09-21T13:24:07.3993219Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 101/476 kB
2026-09-21T13:24:07.3993732Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 101/476 kB
2026-09-21T13:24:07.3993989Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 101/476 kB
2026-09-21T13:24:07.3994227Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 132/476 kB
2026-09-21T13:24:07.3994481Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 132/476 kB
2026-09-21T13:24:07.3994802Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 132/476 kB
2026-09-21T13:24:07.3995422Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 132/476 kB
2026-09-21T13:24:07.3995780Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 132/476 kB
2026-09-21T13:24:07.3996786Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 153/476 kB
2026-09-21T13:24:07.3997005Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 153/476 kB
2026-09-21T13:24:07.3999199Z Progress (4): 1.4/1.5 MB | 172 kB | 70 kB | 186/476 kB
2026-09-21T13:24:07.3999356Z Progress (4): 1.5/1.5 MB | 172 kB | 70 kB | 186/476 kB
2026-09-21T13:24:07.3999510Z Progress (4): 1.5/1.5 MB | 172 kB | 70 kB | 201/476 kB
2026-09-21T13:24:07.3999631Z Progress (4): 1.5/1.5 MB | 172 kB | 70 kB | 201/476 kB
2026-09-21T13:24:07.3999783Z Progress (4): 1.5/1.5 MB | 172 kB | 70 kB | 201/476 kB
2026-09-21T13:24:07.3999990Z Progress (4): 1.5/1.5 MB | 172 kB | 70 kB | 227/476 kB
2026-09-21T13:24:07.4000155Z Progress (4): 1.5 MB | 172 kB | 70 kB | 227/476 kB    
2026-09-21T13:24:07.4000306Z Progress (4): 1.5 MB | 172 kB | 70 kB | 236/476 kB
2026-09-21T13:24:07.4002952Z Progress (4): 1.5 MB | 172 kB | 70 kB | 242/476 kB
2026-09-21T13:24:07.4003297Z Progress (4): 1.5 MB | 172 kB | 70 kB | 243/476 kB
2026-09-21T13:24:07.4005713Z Progress (4): 1.5 MB | 172 kB | 70 kB | 250/476 kB
2026-09-21T13:24:07.4006159Z Progress (4): 1.5 MB | 172 kB | 70 kB | 255/476 kB
2026-09-21T13:24:07.4008645Z Progress (4): 1.5 MB | 172 kB | 70 kB | 273/476 kB
2026-09-21T13:24:07.4008800Z Progress (4): 1.5 MB | 172 kB | 70 kB | 305/476 kB
2026-09-21T13:24:07.4008913Z Progress (4): 1.5 MB | 172 kB | 70 kB | 337/476 kB
2026-09-21T13:24:07.4010025Z Progress (4): 1.5 MB | 172 kB | 70 kB | 344/476 kB
2026-09-21T13:24:07.4010834Z Progress (4): 1.5 MB | 172 kB | 70 kB | 347/476 kB
2026-09-21T13:24:07.4011173Z Progress (4): 1.5 MB | 172 kB | 70 kB | 353/476 kB
2026-09-21T13:24:07.4012194Z Progress (4): 1.5 MB | 172 kB | 70 kB | 357/476 kB
2026-09-21T13:24:07.4012591Z Progress (4): 1.5 MB | 172 kB | 70 kB | 370/476 kB
2026-09-21T13:24:07.4013532Z Progress (4): 1.5 MB | 172 kB | 70 kB | 387/476 kB
2026-09-21T13:24:07.4020154Z Progress (4): 1.5 MB | 172 kB | 70 kB | 405/476 kB
2026-09-21T13:24:07.4020367Z Progress (4): 1.5 MB | 172 kB | 70 kB | 418/476 kB
2026-09-21T13:24:07.4020553Z Progress (4): 1.5 MB | 172 kB | 70 kB | 421/476 kB
2026-09-21T13:24:07.4020792Z Progress (4): 1.5 MB | 172 kB | 70 kB | 422/476 kB
2026-09-21T13:24:07.4020905Z Progress (4): 1.5 MB | 172 kB | 70 kB | 429/476 kB
2026-09-21T13:24:07.4021053Z Progress (4): 1.5 MB | 172 kB | 70 kB | 448/476 kB
2026-09-21T13:24:07.4021202Z Progress (4): 1.5 MB | 172 kB | 70 kB | 462/476 kB
2026-09-21T13:24:07.4021348Z Progress (4): 1.5 MB | 172 kB | 70 kB | 476 kB    
2026-09-21T13:24:07.4021479Z                                               
2026-09-21T13:24:07.4021875Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/2.0.18/slf4j-api-2.0.18.jar (70 kB at 721 kB/s)
2026-09-21T13:24:07.4022282Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator-autoconfigure/3.5.16/spring-boot-actuator-autoconfigure-3.5.16.jar
2026-09-21T13:24:07.4024686Z Progress (4): 1.5 MB | 172 kB | 476 kB | 2.3/4.8 kB
2026-09-21T13:24:07.4043481Z Progress (4): 1.5 MB | 172 kB | 476 kB | 4.8 kB    
2026-09-21T13:24:07.4043700Z                                                
2026-09-21T13:24:07.4044256Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/zaxxer/HikariCP/6.3.3/HikariCP-6.3.3.jar (172 kB at 1.7 MB/s)
2026-09-21T13:24:07.4044719Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator/3.5.16/spring-boot-actuator-3.5.16.jar
2026-09-21T13:24:07.4059119Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/data/spring-data-commons/3.5.13/spring-data-commons-3.5.13.jar (1.5 MB at 15 MB/s)
2026-09-21T13:24:07.4059554Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.21.4/jackson-datatype-jsr310-2.21.4.jar
2026-09-21T13:24:07.4072065Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jdbc/6.2.19/spring-jdbc-6.2.19.jar (476 kB at 4.6 MB/s)
2026-09-21T13:24:07.4072845Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.15.12/micrometer-observation-1.15.12.jar
2026-09-21T13:24:07.4090412Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-actuator/3.5.16/spring-boot-starter-actuator-3.5.16.jar (4.8 kB at 46 kB/s)
2026-09-21T13:24:07.4091383Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.15.12/micrometer-commons-1.15.12.jar
2026-09-21T13:24:07.4092172Z Progress (1): 7.7/843 kB
2026-09-21T13:24:07.4093265Z Progress (1): 40/843 kB 
2026-09-21T13:24:07.4093717Z Progress (1): 73/843 kB
2026-09-21T13:24:07.4096513Z Progress (1): 98/843 kB
2026-09-21T13:24:07.4096665Z Progress (1): 101/843 kB
2026-09-21T13:24:07.4097252Z Progress (1): 107/843 kB
2026-09-21T13:24:07.4099140Z Progress (1): 113/843 kB
2026-09-21T13:24:07.4099624Z Progress (1): 116/843 kB
2026-09-21T13:24:07.4099768Z Progress (1): 123/843 kB
2026-09-21T13:24:07.4099911Z Progress (1): 124/843 kB
2026-09-21T13:24:07.4100522Z Progress (1): 139/843 kB
2026-09-21T13:24:07.4100659Z Progress (1): 145/843 kB
2026-09-21T13:24:07.4100836Z Progress (1): 157/843 kB
2026-09-21T13:24:07.4101168Z Progress (1): 165/843 kB
2026-09-21T13:24:07.4101684Z Progress (1): 172/843 kB
2026-09-21T13:24:07.4103487Z Progress (1): 178/843 kB
2026-09-21T13:24:07.4104018Z Progress (1): 201/843 kB
2026-09-21T13:24:07.4104276Z Progress (1): 216/843 kB
2026-09-21T13:24:07.4104386Z Progress (1): 221/843 kB
2026-09-21T13:24:07.4104667Z Progress (1): 234/843 kB
2026-09-21T13:24:07.4109566Z Progress (1): 236/843 kB
2026-09-21T13:24:07.4110259Z Progress (1): 239/843 kB
2026-09-21T13:24:07.4110400Z Progress (1): 246/843 kB
2026-09-21T13:24:07.4110497Z Progress (1): 251/843 kB
2026-09-21T13:24:07.4111090Z Progress (1): 254/843 kB
2026-09-21T13:24:07.4111245Z Progress (1): 261/843 kB
2026-09-21T13:24:07.4111884Z Progress (1): 276/843 kB
2026-09-21T13:24:07.4112115Z Progress (1): 282/843 kB
2026-09-21T13:24:07.4112837Z Progress (1): 297/843 kB
2026-09-21T13:24:07.4112982Z Progress (1): 301/843 kB
2026-09-21T13:24:07.4113112Z Progress (1): 314/843 kB
2026-09-21T13:24:07.4114917Z Progress (1): 323/843 kB
2026-09-21T13:24:07.4115073Z Progress (1): 334/843 kB
2026-09-21T13:24:07.4115168Z Progress (1): 336/843 kB
2026-09-21T13:24:07.4116072Z Progress (1): 344/843 kB
2026-09-21T13:24:07.4121924Z Progress (1): 360/843 kB
2026-09-21T13:24:07.4122131Z Progress (1): 363/843 kB
2026-09-21T13:24:07.4129633Z Progress (1): 366/843 kB
2026-09-21T13:24:07.4129783Z Progress (1): 371/843 kB
2026-09-21T13:24:07.4129933Z Progress (1): 374/843 kB
2026-09-21T13:24:07.4130078Z Progress (1): 380/843 kB
2026-09-21T13:24:07.4130211Z Progress (1): 382/843 kB
2026-09-21T13:24:07.4130312Z Progress (1): 389/843 kB
2026-09-21T13:24:07.4130488Z Progress (1): 391/843 kB
2026-09-21T13:24:07.4130629Z Progress (1): 404/843 kB
2026-09-21T13:24:07.4130759Z Progress (1): 416/843 kB
2026-09-21T13:24:07.4130888Z Progress (1): 423/843 kB
2026-09-21T13:24:07.4130983Z Progress (1): 430/843 kB
2026-09-21T13:24:07.4136316Z Progress (1): 434/843 kB
2026-09-21T13:24:07.4136467Z Progress (1): 464/843 kB
2026-09-21T13:24:07.4136596Z Progress (1): 497/843 kB
2026-09-21T13:24:07.4136690Z Progress (1): 526/843 kB
2026-09-21T13:24:07.4136889Z Progress (1): 552/843 kB
2026-09-21T13:24:07.4137022Z Progress (1): 561/843 kB
2026-09-21T13:24:07.4137146Z Progress (1): 565/843 kB
2026-09-21T13:24:07.4138471Z Progress (1): 568/843 kB
2026-09-21T13:24:07.4140557Z Progress (1): 571/843 kB
2026-09-21T13:24:07.4140831Z Progress (1): 586/843 kB
2026-09-21T13:24:07.4140968Z Progress (1): 608/843 kB
2026-09-21T13:24:07.4161855Z Progress (1): 623/843 kB
2026-09-21T13:24:07.4162758Z Progress (2): 623/843 kB | 5.0/708 kB
2026-09-21T13:24:07.4163686Z Progress (2): 623/843 kB | 38/708 kB 
2026-09-21T13:24:07.4164576Z Progress (2): 623/843 kB | 71/708 kB
2026-09-21T13:24:07.4192943Z Progress (2): 623/843 kB | 98/708 kB
2026-09-21T13:24:07.4193288Z Progress (3): 623/843 kB | 98/708 kB | 5.0/137 kB
2026-09-21T13:24:07.4193458Z Progress (3): 623/843 kB | 98/708 kB | 31/137 kB 
2026-09-21T13:24:07.4193744Z Progress (3): 623/843 kB | 98/708 kB | 36/137 kB
2026-09-21T13:24:07.4194039Z Progress (3): 655/843 kB | 98/708 kB | 36/137 kB
2026-09-21T13:24:07.4194275Z Progress (3): 655/843 kB | 98/708 kB | 53/137 kB
2026-09-21T13:24:07.4194512Z Progress (3): 688/843 kB | 98/708 kB | 53/137 kB
2026-09-21T13:24:07.4194671Z Progress (3): 688/843 kB | 98/708 kB | 66/137 kB
2026-09-21T13:24:07.4194865Z Progress (3): 710/843 kB | 98/708 kB | 66/137 kB
2026-09-21T13:24:07.4194982Z Progress (3): 717/843 kB | 98/708 kB | 66/137 kB
2026-09-21T13:24:07.4195212Z Progress (3): 717/843 kB | 98/708 kB | 98/137 kB
2026-09-21T13:24:07.4195371Z Progress (4): 717/843 kB | 98/708 kB | 98/137 kB | 7.7/76 kB
2026-09-21T13:24:07.4195542Z Progress (4): 717/843 kB | 98/708 kB | 131/137 kB | 7.7/76 kB
2026-09-21T13:24:07.4195748Z Progress (4): 717/843 kB | 98/708 kB | 137 kB | 7.7/76 kB    
2026-09-21T13:24:07.4195875Z Progress (4): 717/843 kB | 98/708 kB | 137 kB | 41/76 kB 
2026-09-21T13:24:07.4196048Z Progress (4): 750/843 kB | 98/708 kB | 137 kB | 41/76 kB
2026-09-21T13:24:07.4196202Z Progress (4): 750/843 kB | 98/708 kB | 137 kB | 73/76 kB
2026-09-21T13:24:07.4196357Z Progress (4): 750/843 kB | 98/708 kB | 137 kB | 76 kB   
2026-09-21T13:24:07.4196509Z Progress (4): 782/843 kB | 98/708 kB | 137 kB | 76 kB
2026-09-21T13:24:07.4196629Z Progress (4): 815/843 kB | 98/708 kB | 137 kB | 76 kB
2026-09-21T13:24:07.4200451Z Progress (4): 834/843 kB | 98/708 kB | 137 kB | 76 kB
2026-09-21T13:24:07.4233478Z Progress (4): 843 kB | 98/708 kB | 137 kB | 76 kB    
2026-09-21T13:24:07.4233746Z Progress (5): 843 kB | 98/708 kB | 137 kB | 76 kB | 7.7/49 kB
2026-09-21T13:24:07.4233967Z Progress (5): 843 kB | 98/708 kB | 137 kB | 76 kB | 41/49 kB 
2026-09-21T13:24:07.4275111Z Progress (5): 843 kB | 98/708 kB | 137 kB | 76 kB | 49 kB   
2026-09-21T13:24:07.4275222Z                                                          
2026-09-21T13:24:07.4275744Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator-autoconfigure/3.5.16/spring-boot-actuator-autoconfigure-3.5.16.jar (843 kB at 6.9 MB/s)
2026-09-21T13:24:07.4276152Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-jakarta9/1.15.12/micrometer-jakarta9-1.15.12.jar
2026-09-21T13:24:07.4300720Z Progress (4): 100/708 kB | 137 kB | 76 kB | 49 kB
2026-09-21T13:24:07.4300973Z Progress (4): 132/708 kB | 137 kB | 76 kB | 49 kB
2026-09-21T13:24:07.4301121Z                                                  
2026-09-21T13:24:07.4301562Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.21.4/jackson-datatype-jsr310-2.21.4.jar (137 kB at 1.1 MB/s)
2026-09-21T13:24:07.4302043Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/retry/spring-retry/2.0.13/spring-retry-2.0.13.jar
2026-09-21T13:24:07.4302256Z Progress (3): 165/708 kB | 76 kB | 49 kB
2026-09-21T13:24:07.4302417Z                                         
2026-09-21T13:24:07.4302741Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.15.12/micrometer-observation-1.15.12.jar (76 kB at 610 kB/s)
2026-09-21T13:24:07.4303134Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.jar
2026-09-21T13:24:07.4312118Z Progress (2): 198/708 kB | 49 kB
2026-09-21T13:24:07.4317286Z Progress (2): 231/708 kB | 49 kB
2026-09-21T13:24:07.4317469Z Progress (2): 264/708 kB | 49 kB
2026-09-21T13:24:07.4317709Z Progress (2): 296/708 kB | 49 kB
2026-09-21T13:24:07.4317838Z                                 
2026-09-21T13:24:07.4318226Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.15.12/micrometer-commons-1.15.12.jar (49 kB at 390 kB/s)
2026-09-21T13:24:07.4318766Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-databind/2.21.4/jackson-databind-2.21.4.jar
2026-09-21T13:24:07.4318996Z Progress (1): 329/708 kB
2026-09-21T13:24:07.4319136Z Progress (1): 362/708 kB
2026-09-21T13:24:07.4319271Z Progress (1): 395/708 kB
2026-09-21T13:24:07.4319403Z Progress (1): 427/708 kB
2026-09-21T13:24:07.4319501Z Progress (1): 440/708 kB
2026-09-21T13:24:07.4319632Z Progress (1): 458/708 kB
2026-09-21T13:24:07.4319787Z Progress (1): 462/708 kB
2026-09-21T13:24:07.4319968Z Progress (1): 466/708 kB
2026-09-21T13:24:07.4320065Z Progress (1): 475/708 kB
2026-09-21T13:24:07.4320214Z Progress (1): 478/708 kB
2026-09-21T13:24:07.4320345Z Progress (1): 492/708 kB
2026-09-21T13:24:07.4320479Z Progress (1): 504/708 kB
2026-09-21T13:24:07.4320608Z Progress (1): 508/708 kB
2026-09-21T13:24:07.4320702Z Progress (1): 511/708 kB
2026-09-21T13:24:07.4320833Z Progress (1): 533/708 kB
2026-09-21T13:24:07.4320957Z Progress (1): 566/708 kB
2026-09-21T13:24:07.4321099Z Progress (1): 598/708 kB
2026-09-21T13:24:07.4321192Z Progress (1): 612/708 kB
2026-09-21T13:24:07.4321410Z Progress (1): 625/708 kB
2026-09-21T13:24:07.4321758Z Progress (1): 657/708 kB
2026-09-21T13:24:07.4325604Z Progress (1): 661/708 kB
2026-09-21T13:24:07.4325851Z Progress (1): 666/708 kB
2026-09-21T13:24:07.4325991Z Progress (1): 679/708 kB
2026-09-21T13:24:07.4326121Z Progress (1): 687/708 kB
2026-09-21T13:24:07.4326220Z Progress (1): 701/708 kB
2026-09-21T13:24:07.4326353Z Progress (1): 703/708 kB
2026-09-21T13:24:07.4336848Z Progress (1): 708 kB    
2026-09-21T13:24:07.4337238Z Progress (2): 708 kB | 2.3/93 kB
2026-09-21T13:24:07.4337482Z Progress (2): 708 kB | 24/93 kB 
2026-09-21T13:24:07.4337591Z Progress (2): 708 kB | 48/93 kB
2026-09-21T13:24:07.4337751Z Progress (2): 708 kB | 59/93 kB
2026-09-21T13:24:07.4338233Z Progress (2): 708 kB | 63/93 kB
2026-09-21T13:24:07.4338387Z Progress (2): 708 kB | 66/93 kB
2026-09-21T13:24:07.4339327Z Progress (2): 708 kB | 75/93 kB
2026-09-21T13:24:07.4339430Z Progress (2): 708 kB | 92/93 kB
2026-09-21T13:24:07.4346753Z Progress (2): 708 kB | 93 kB   
2026-09-21T13:24:07.4347042Z Progress (3): 708 kB | 93 kB | 2.3/33 kB
2026-09-21T13:24:07.4361503Z Progress (3): 708 kB | 93 kB | 33 kB    
2026-09-21T13:24:07.4361746Z                                     
2026-09-21T13:24:07.4362153Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-actuator/3.5.16/spring-boot-actuator-3.5.16.jar (708 kB at 5.4 MB/s)
2026-09-21T13:24:07.4362560Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.jar
2026-09-21T13:24:07.4367258Z Progress (3): 93 kB | 33 kB | 7.7/161 kB
2026-09-21T13:24:07.4367408Z                                         
2026-09-21T13:24:07.4367745Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.jar (93 kB at 707 kB/s)
2026-09-21T13:24:07.4368117Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-core/2.21.4/jackson-core-2.21.4.jar
2026-09-21T13:24:07.4369527Z Progress (2): 33 kB | 40/161 kB
2026-09-21T13:24:07.4370066Z Progress (2): 33 kB | 73/161 kB
2026-09-21T13:24:07.4387414Z Progress (2): 33 kB | 98/161 kB
2026-09-21T13:24:07.4387599Z Progress (3): 33 kB | 98/161 kB | 0.9/82 kB
2026-09-21T13:24:07.4387752Z Progress (3): 33 kB | 98/161 kB | 6.4/82 kB
2026-09-21T13:24:07.4390190Z Progress (3): 33 kB | 98/161 kB | 12/82 kB 
2026-09-21T13:24:07.4391247Z Progress (3): 33 kB | 98/161 kB | 33/82 kB
2026-09-21T13:24:07.4391706Z Progress (3): 33 kB | 98/161 kB | 66/82 kB
2026-09-21T13:24:07.4392107Z Progress (3): 33 kB | 98/161 kB | 82 kB   
2026-09-21T13:24:07.4393688Z Progress (3): 33 kB | 113/161 kB | 82 kB
2026-09-21T13:24:07.4394119Z Progress (3): 33 kB | 146/161 kB | 82 kB
2026-09-21T13:24:07.4394356Z Progress (3): 33 kB | 161 kB | 82 kB    
2026-09-21T13:24:07.4397326Z Progress (4): 33 kB | 161 kB | 82 kB | 0/1.7 MB
2026-09-21T13:24:07.4397494Z Progress (4): 33 kB | 161 kB | 82 kB | 0/1.7 MB
2026-09-21T13:24:07.4397651Z Progress (4): 33 kB | 161 kB | 82 kB | 0.1/1.7 MB
2026-09-21T13:24:07.4410101Z Progress (4): 33 kB | 161 kB | 82 kB | 0.1/1.7 MB
2026-09-21T13:24:07.4410296Z                                                  
2026-09-21T13:24:07.4410722Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-jakarta9/1.15.12/micrometer-jakarta9-1.15.12.jar (33 kB at 241 kB/s)
2026-09-21T13:24:07.4411214Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-registry-prometheus/1.15.12/micrometer-registry-prometheus-1.15.12.jar
2026-09-21T13:24:07.4420668Z Progress (3): 161 kB | 82 kB | 0.1/1.7 MB
2026-09-21T13:24:07.4420900Z                                          
2026-09-21T13:24:07.4421335Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.jar (82 kB at 595 kB/s)
2026-09-21T13:24:07.4421705Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.15.12/micrometer-core-1.15.12.jar
2026-09-21T13:24:07.4422808Z Progress (2): 161 kB | 0.1/1.7 MB
2026-09-21T13:24:07.4423303Z Progress (2): 161 kB | 0.1/1.7 MB
2026-09-21T13:24:07.4424242Z Progress (2): 161 kB | 0.1/1.7 MB
2026-09-21T13:24:07.4425415Z Progress (2): 161 kB | 0.1/1.7 MB
2026-09-21T13:24:07.4426765Z Progress (2): 161 kB | 0.2/1.7 MB
2026-09-21T13:24:07.4427783Z Progress (2): 161 kB | 0.2/1.7 MB
2026-09-21T13:24:07.4427928Z Progress (2): 161 kB | 0.2/1.7 MB
2026-09-21T13:24:07.4441380Z Progress (2): 161 kB | 0.2/1.7 MB
2026-09-21T13:24:07.4441625Z Progress (2): 161 kB | 0.2/1.7 MB
2026-09-21T13:24:07.4446470Z Progress (2): 161 kB | 0.2/1.7 MB
2026-09-21T13:24:07.4446612Z Progress (2): 161 kB | 0.3/1.7 MB
2026-09-21T13:24:07.4446757Z Progress (2): 161 kB | 0.3/1.7 MB
2026-09-21T13:24:07.4446900Z Progress (2): 161 kB | 0.3/1.7 MB
2026-09-21T13:24:07.4447040Z Progress (2): 161 kB | 0.3/1.7 MB
2026-09-21T13:24:07.4447553Z Progress (2): 161 kB | 0.3/1.7 MB
2026-09-21T13:24:07.4456391Z Progress (2): 161 kB | 0.3/1.7 MB
2026-09-21T13:24:07.4456745Z Progress (2): 161 kB | 0.4/1.7 MB
2026-09-21T13:24:07.4456887Z Progress (2): 161 kB | 0.4/1.7 MB
2026-09-21T13:24:07.4457027Z Progress (2): 161 kB | 0.4/1.7 MB
2026-09-21T13:24:07.4457171Z Progress (2): 161 kB | 0.5/1.7 MB
2026-09-21T13:24:07.4457273Z Progress (2): 161 kB | 0.5/1.7 MB
2026-09-21T13:24:07.4457406Z Progress (2): 161 kB | 0.5/1.7 MB
2026-09-21T13:24:07.4458201Z Progress (2): 161 kB | 0.6/1.7 MB
2026-09-21T13:24:07.4458881Z Progress (2): 161 kB | 0.6/1.7 MB
2026-09-21T13:24:07.4465912Z Progress (2): 161 kB | 0.6/1.7 MB
2026-09-21T13:24:07.4466984Z Progress (3): 161 kB | 0.6/1.7 MB | 3.6/594 kB
2026-09-21T13:24:07.4478180Z Progress (3): 161 kB | 0.6/1.7 MB | 33/594 kB 
2026-09-21T13:24:07.4478393Z                                              
2026-09-21T13:24:07.4478818Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/retry/spring-retry/2.0.13/spring-retry-2.0.13.jar (161 kB at 1.1 MB/s)
2026-09-21T13:24:07.4479204Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hdrhistogram/HdrHistogram/2.2.2/HdrHistogram-2.2.2.jar
2026-09-21T13:24:07.4480610Z Progress (2): 0.6/1.7 MB | 36/594 kB
2026-09-21T13:24:07.4480738Z Progress (2): 0.6/1.7 MB | 41/594 kB
2026-09-21T13:24:07.4481568Z Progress (2): 0.6/1.7 MB | 42/594 kB
2026-09-21T13:24:07.4481765Z Progress (2): 0.6/1.7 MB | 68/594 kB
2026-09-21T13:24:07.4481911Z Progress (2): 0.6/1.7 MB | 76/594 kB
2026-09-21T13:24:07.4482128Z Progress (2): 0.6/1.7 MB | 79/594 kB
2026-09-21T13:24:07.4500041Z Progress (2): 0.6/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4500233Z Progress (2): 0.6/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4500382Z Progress (2): 0.6/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4501696Z Progress (2): 0.6/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4502497Z Progress (2): 0.7/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4502642Z Progress (2): 0.7/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4502908Z Progress (2): 0.7/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4503936Z Progress (2): 0.7/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4505286Z Progress (2): 0.7/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4506524Z Progress (2): 0.7/1.7 MB | 98/594 kB
2026-09-21T13:24:07.4506740Z Progress (3): 0.7/1.7 MB | 98/594 kB | 2.3/177 kB
2026-09-21T13:24:07.4507717Z Progress (3): 0.7/1.7 MB | 98/594 kB | 2.3/177 kB
2026-09-21T13:24:07.4508129Z Progress (3): 0.7/1.7 MB | 98/594 kB | 35/177 kB 
2026-09-21T13:24:07.4508559Z Progress (3): 0.7/1.7 MB | 98/594 kB | 48/177 kB
2026-09-21T13:24:07.4508725Z Progress (3): 0.8/1.7 MB | 98/594 kB | 48/177 kB
2026-09-21T13:24:07.4509602Z Progress (3): 0.8/1.7 MB | 98/594 kB | 51/177 kB
2026-09-21T13:24:07.4510519Z Progress (3): 0.8/1.7 MB | 98/594 kB | 66/177 kB
2026-09-21T13:24:07.4511344Z Progress (3): 0.8/1.7 MB | 98/594 kB | 66/177 kB
2026-09-21T13:24:07.4512642Z Progress (3): 0.8/1.7 MB | 98/594 kB | 98/177 kB
2026-09-21T13:24:07.4512943Z Progress (3): 0.8/1.7 MB | 98/594 kB | 98/177 kB
2026-09-21T13:24:07.4513094Z Progress (3): 0.8/1.7 MB | 98/594 kB | 112/177 kB
2026-09-21T13:24:07.4513244Z Progress (3): 0.8/1.7 MB | 98/594 kB | 116/177 kB
2026-09-21T13:24:07.4513357Z Progress (3): 0.8/1.7 MB | 98/594 kB | 131/177 kB
2026-09-21T13:24:07.4513507Z Progress (3): 0.8/1.7 MB | 98/594 kB | 131/177 kB
2026-09-21T13:24:07.4513658Z Progress (3): 0.8/1.7 MB | 102/594 kB | 131/177 kB
2026-09-21T13:24:07.4514176Z Progress (3): 0.8/1.7 MB | 102/594 kB | 138/177 kB
2026-09-21T13:24:07.4523233Z Progress (3): 0.8/1.7 MB | 102/594 kB | 171/177 kB
2026-09-21T13:24:07.4523622Z Progress (3): 0.8/1.7 MB | 102/594 kB | 177 kB    
2026-09-21T13:24:07.4523763Z Progress (3): 0.8/1.7 MB | 135/594 kB | 177 kB
2026-09-21T13:24:07.4524007Z Progress (3): 0.9/1.7 MB | 135/594 kB | 177 kB
2026-09-21T13:24:07.4524169Z Progress (3): 0.9/1.7 MB | 135/594 kB | 177 kB
2026-09-21T13:24:07.4524316Z Progress (3): 0.9/1.7 MB | 168/594 kB | 177 kB
2026-09-21T13:24:07.4524440Z Progress (4): 0.9/1.7 MB | 168/594 kB | 177 kB | 0.9/42 kB
2026-09-21T13:24:07.4525136Z Progress (4): 0.9/1.7 MB | 201/594 kB | 177 kB | 0.9/42 kB
2026-09-21T13:24:07.4525318Z Progress (4): 0.9/1.7 MB | 229/594 kB | 177 kB | 0.9/42 kB
2026-09-21T13:24:07.4525479Z Progress (4): 0.9/1.7 MB | 229/594 kB | 177 kB | 34/42 kB 
2026-09-21T13:24:07.4525687Z Progress (4): 0.9/1.7 MB | 229/594 kB | 177 kB | 42 kB   
2026-09-21T13:24:07.4525874Z Progress (4): 0.9/1.7 MB | 262/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4525996Z Progress (4): 0.9/1.7 MB | 295/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4526147Z Progress (4): 0.9/1.7 MB | 303/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4526302Z Progress (4): 0.9/1.7 MB | 328/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4526454Z Progress (4): 0.9/1.7 MB | 330/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4526604Z Progress (4): 0.9/1.7 MB | 333/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4526718Z Progress (4): 0.9/1.7 MB | 337/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4526869Z Progress (4): 0.9/1.7 MB | 339/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4534611Z Progress (4): 0.9/1.7 MB | 360/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4535573Z Progress (4): 0.9/1.7 MB | 360/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4537069Z Progress (4): 0.9/1.7 MB | 360/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4537387Z Progress (4): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB
2026-09-21T13:24:07.4537658Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 7.7/867 kB
2026-09-21T13:24:07.4538381Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 7.7/867 kB
2026-09-21T13:24:07.4538640Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 7.7/867 kB
2026-09-21T13:24:07.4539649Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 40/867 kB 
2026-09-21T13:24:07.4539821Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 40/867 kB
2026-09-21T13:24:07.4540766Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 73/867 kB
2026-09-21T13:24:07.4541061Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 98/867 kB
2026-09-21T13:24:07.4542667Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 98/867 kB
2026-09-21T13:24:07.4543880Z Progress (5): 1.0/1.7 MB | 360/594 kB | 177 kB | 42 kB | 98/867 kB
2026-09-21T13:24:07.4544969Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 98/867 kB
2026-09-21T13:24:07.4546034Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 98/867 kB
2026-09-21T13:24:07.4546456Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 98/867 kB
2026-09-21T13:24:07.4549107Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 98/867 kB
2026-09-21T13:24:07.4549279Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 101/867 kB
2026-09-21T13:24:07.4549585Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 105/867 kB
2026-09-21T13:24:07.4550821Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 113/867 kB
2026-09-21T13:24:07.4551381Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 116/867 kB
2026-09-21T13:24:07.4553422Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 128/867 kB
2026-09-21T13:24:07.4553569Z Progress (5): 1.1/1.7 MB | 360/594 kB | 177 kB | 42 kB | 142/867 kB
2026-09-21T13:24:07.4553715Z                                                                    
2026-09-21T13:24:07.4554236Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hdrhistogram/HdrHistogram/2.2.2/HdrHistogram-2.2.2.jar (177 kB at 1.2 MB/s)
2026-09-21T13:24:07.4554621Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar
2026-09-21T13:24:07.4554876Z Progress (4): 1.1/1.7 MB | 360/594 kB | 42 kB | 154/867 kB
2026-09-21T13:24:07.4555040Z Progress (4): 1.1/1.7 MB | 360/594 kB | 42 kB | 161/867 kB
2026-09-21T13:24:07.4555164Z Progress (4): 1.1/1.7 MB | 366/594 kB | 42 kB | 161/867 kB
2026-09-21T13:24:07.4555856Z Progress (4): 1.1/1.7 MB | 370/594 kB | 42 kB | 161/867 kB
2026-09-21T13:24:07.4556711Z Progress (4): 1.1/1.7 MB | 391/594 kB | 42 kB | 161/867 kB
2026-09-21T13:24:07.4556980Z Progress (4): 1.1/1.7 MB | 423/594 kB | 42 kB | 161/867 kB
2026-09-21T13:24:07.4558317Z Progress (4): 1.1/1.7 MB | 436/594 kB | 42 kB | 161/867 kB
2026-09-21T13:24:07.4559357Z Progress (4): 1.1/1.7 MB | 436/594 kB | 42 kB | 194/867 kB
2026-09-21T13:24:07.4560757Z Progress (4): 1.1/1.7 MB | 436/594 kB | 42 kB | 205/867 kB
2026-09-21T13:24:07.4561037Z Progress (4): 1.1/1.7 MB | 459/594 kB | 42 kB | 205/867 kB
2026-09-21T13:24:07.4561721Z Progress (4): 1.1/1.7 MB | 459/594 kB | 42 kB | 229/867 kB
2026-09-21T13:24:07.4562701Z Progress (4): 1.1/1.7 MB | 492/594 kB | 42 kB | 229/867 kB
2026-09-21T13:24:07.4564367Z Progress (4): 1.1/1.7 MB | 524/594 kB | 42 kB | 229/867 kB
2026-09-21T13:24:07.4565000Z Progress (4): 1.1/1.7 MB | 557/594 kB | 42 kB | 229/867 kB
2026-09-21T13:24:07.4565352Z Progress (4): 1.1/1.7 MB | 590/594 kB | 42 kB | 229/867 kB
2026-09-21T13:24:07.4566750Z Progress (4): 1.1/1.7 MB | 594 kB | 42 kB | 229/867 kB    
2026-09-21T13:24:07.4567631Z Progress (4): 1.1/1.7 MB | 594 kB | 42 kB | 229/867 kB
2026-09-21T13:24:07.4568508Z Progress (4): 1.1/1.7 MB | 594 kB | 42 kB | 238/867 kB
2026-09-21T13:24:07.4568693Z Progress (4): 1.1/1.7 MB | 594 kB | 42 kB | 257/867 kB
2026-09-21T13:24:07.4569253Z Progress (4): 1.1/1.7 MB | 594 kB | 42 kB | 264/867 kB
2026-09-21T13:24:07.4570823Z Progress (4): 1.1/1.7 MB | 594 kB | 42 kB | 279/867 kB
2026-09-21T13:24:07.4571155Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 279/867 kB
2026-09-21T13:24:07.4571974Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 279/867 kB
2026-09-21T13:24:07.4572133Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 311/867 kB
2026-09-21T13:24:07.4573408Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 311/867 kB
2026-09-21T13:24:07.4573764Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 344/867 kB
2026-09-21T13:24:07.4574440Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 344/867 kB
2026-09-21T13:24:07.4574667Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4575857Z Progress (4): 1.2/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4576920Z Progress (4): 1.3/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4577703Z Progress (4): 1.3/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4577888Z Progress (4): 1.3/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4578236Z Progress (4): 1.3/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4579776Z Progress (4): 1.3/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4580611Z Progress (4): 1.4/1.7 MB | 594 kB | 42 kB | 360/867 kB
2026-09-21T13:24:07.4582962Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 360/867 kB | 2.3/30 kB
2026-09-21T13:24:07.4583281Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 360/867 kB | 2.3/30 kB
2026-09-21T13:24:07.4583463Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 360/867 kB | 30 kB    
2026-09-21T13:24:07.4583598Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 360/867 kB | 30 kB
2026-09-21T13:24:07.4584476Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 360/867 kB | 30 kB
2026-09-21T13:24:07.4585567Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 393/867 kB | 30 kB
2026-09-21T13:24:07.4586519Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 426/867 kB | 30 kB
2026-09-21T13:24:07.4587554Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 459/867 kB | 30 kB
2026-09-21T13:24:07.4588477Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 492/867 kB | 30 kB
2026-09-21T13:24:07.4590641Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 511/867 kB | 30 kB
2026-09-21T13:24:07.4590768Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 513/867 kB | 30 kB
2026-09-21T13:24:07.4591286Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 515/867 kB | 30 kB
2026-09-21T13:24:07.4592723Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 523/867 kB | 30 kB
2026-09-21T13:24:07.4593064Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 556/867 kB | 30 kB
2026-09-21T13:24:07.4594007Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 564/867 kB | 30 kB
2026-09-21T13:24:07.4594766Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 575/867 kB | 30 kB
2026-09-21T13:24:07.4594957Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 575/867 kB | 30 kB
2026-09-21T13:24:07.4595119Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 604/867 kB | 30 kB
2026-09-21T13:24:07.4595538Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 606/867 kB | 30 kB
2026-09-21T13:24:07.4595699Z Progress (5): 1.4/1.7 MB | 594 kB | 42 kB | 617/867 kB | 30 kB
2026-09-21T13:24:07.4597125Z Progress (5): 1.5/1.7 MB | 594 kB | 42 kB | 617/867 kB | 30 kB
2026-09-21T13:24:07.4597743Z Progress (5): 1.5/1.7 MB | 594 kB | 42 kB | 617/867 kB | 30 kB
2026-09-21T13:24:07.4597922Z Progress (5): 1.5/1.7 MB | 594 kB | 42 kB | 649/867 kB | 30 kB
2026-09-21T13:24:07.4599198Z Progress (5): 1.5/1.7 MB | 594 kB | 42 kB | 649/867 kB | 30 kB
2026-09-21T13:24:07.4600232Z Progress (5): 1.5/1.7 MB | 594 kB | 42 kB | 668/867 kB | 30 kB
2026-09-21T13:24:07.4600478Z Progress (5): 1.5/1.7 MB | 594 kB | 42 kB | 668/867 kB | 30 kB
2026-09-21T13:24:07.4600649Z Progress (5): 1.5/1.7 MB | 594 kB | 42 kB | 701/867 kB | 30 kB
2026-09-21T13:24:07.4600810Z Progress (5): 1.6/1.7 MB | 594 kB | 42 kB | 701/867 kB | 30 kB
2026-09-21T13:24:07.4601215Z Progress (5): 1.6/1.7 MB | 594 kB | 42 kB | 701/867 kB | 30 kB
2026-09-21T13:24:07.4601386Z Progress (5): 1.6/1.7 MB | 594 kB | 42 kB | 722/867 kB | 30 kB
2026-09-21T13:24:07.4601547Z Progress (5): 1.6/1.7 MB | 594 kB | 42 kB | 722/867 kB | 30 kB
2026-09-21T13:24:07.4602750Z Progress (5): 1.6/1.7 MB | 594 kB | 42 kB | 722/867 kB | 30 kB
2026-09-21T13:24:07.4604036Z Progress (5): 1.6/1.7 MB | 594 kB | 42 kB | 733/867 kB | 30 kB
2026-09-21T13:24:07.4604353Z                                                               
2026-09-21T13:24:07.4604781Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-registry-prometheus/1.15.12/micrometer-registry-prometheus-1.15.12.jar (42 kB at 272 kB/s)
2026-09-21T13:24:07.4605845Z Progress (4): 1.6/1.7 MB | 594 kB | 733/867 kB | 30 kB
2026-09-21T13:24:07.4606010Z Progress (4): 1.6/1.7 MB | 594 kB | 754/867 kB | 30 kB
2026-09-21T13:24:07.4606153Z                                                       
2026-09-21T13:24:07.4606474Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-core/1.3.10/prometheus-metrics-core-1.3.10.jar
2026-09-21T13:24:07.4606691Z Progress (4): 1.6/1.7 MB | 594 kB | 754/867 kB | 30 kB
2026-09-21T13:24:07.4606872Z Progress (4): 1.6/1.7 MB | 594 kB | 755/867 kB | 30 kB
2026-09-21T13:24:07.4607077Z Progress (4): 1.7/1.7 MB | 594 kB | 755/867 kB | 30 kB
2026-09-21T13:24:07.4607248Z Progress (4): 1.7/1.7 MB | 594 kB | 755/867 kB | 30 kB
2026-09-21T13:24:07.4607420Z Progress (4): 1.7/1.7 MB | 594 kB | 755/867 kB | 30 kB
2026-09-21T13:24:07.4607575Z Progress (4): 1.7/1.7 MB | 594 kB | 769/867 kB | 30 kB
2026-09-21T13:24:07.4607689Z Progress (4): 1.7/1.7 MB | 594 kB | 771/867 kB | 30 kB
2026-09-21T13:24:07.4607845Z Progress (4): 1.7 MB | 594 kB | 771/867 kB | 30 kB    
2026-09-21T13:24:07.4607996Z Progress (4): 1.7 MB | 594 kB | 774/867 kB | 30 kB
2026-09-21T13:24:07.4608433Z Progress (4): 1.7 MB | 594 kB | 786/867 kB | 30 kB
2026-09-21T13:24:07.4608768Z Progress (4): 1.7 MB | 594 kB | 800/867 kB | 30 kB
2026-09-21T13:24:07.4608927Z Progress (4): 1.7 MB | 594 kB | 810/867 kB | 30 kB
2026-09-21T13:24:07.4609486Z Progress (4): 1.7 MB | 594 kB | 812/867 kB | 30 kB
2026-09-21T13:24:07.4610667Z Progress (4): 1.7 MB | 594 kB | 827/867 kB | 30 kB
2026-09-21T13:24:07.4611480Z Progress (4): 1.7 MB | 594 kB | 833/867 kB | 30 kB
2026-09-21T13:24:07.4611845Z Progress (4): 1.7 MB | 594 kB | 858/867 kB | 30 kB
2026-09-21T13:24:07.4612004Z Progress (4): 1.7 MB | 594 kB | 867 kB | 30 kB    
2026-09-21T13:24:07.4612117Z                                               
2026-09-21T13:24:07.4612484Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar (30 kB at 190 kB/s)
2026-09-21T13:24:07.4612867Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-model/1.3.10/prometheus-metrics-model-1.3.10.jar
2026-09-21T13:24:07.4640736Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-core/2.21.4/jackson-core-2.21.4.jar (594 kB at 3.7 MB/s)
2026-09-21T13:24:07.4641168Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-config/1.3.10/prometheus-metrics-config-1.3.10.jar
2026-09-21T13:24:07.4668064Z Progress (3): 1.7 MB | 867 kB | 7.7/96 kB
2026-09-21T13:24:07.4671463Z Progress (3): 1.7 MB | 867 kB | 33/96 kB 
2026-09-21T13:24:07.4671651Z                                         
2026-09-21T13:24:07.4672054Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/core/jackson-databind/2.21.4/jackson-databind-2.21.4.jar (1.7 MB at 10 MB/s)
2026-09-21T13:24:07.4672779Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-tracer-common/1.3.10/prometheus-metrics-tracer-common-1.3.10.jar
2026-09-21T13:24:07.4673067Z Progress (2): 867 kB | 34/96 kB
2026-09-21T13:24:07.4673366Z Progress (2): 867 kB | 36/96 kB
2026-09-21T13:24:07.4673747Z Progress (2): 867 kB | 40/96 kB
2026-09-21T13:24:07.4674814Z Progress (2): 867 kB | 45/96 kB
2026-09-21T13:24:07.4675155Z Progress (2): 867 kB | 56/96 kB
2026-09-21T13:24:07.4678035Z Progress (2): 867 kB | 68/96 kB
2026-09-21T13:24:07.4678280Z Progress (2): 867 kB | 76/96 kB
2026-09-21T13:24:07.4678416Z                                
2026-09-21T13:24:07.4678816Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.15.12/micrometer-core-1.15.12.jar (867 kB at 5.3 MB/s)
2026-09-21T13:24:07.4679474Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-formats/1.3.10/prometheus-metrics-exposition-formats-1.3.10.jar
2026-09-21T13:24:07.4679694Z Progress (1): 83/96 kB
2026-09-21T13:24:07.4679793Z Progress (1): 93/96 kB
2026-09-21T13:24:07.4695199Z Progress (1): 96 kB   
2026-09-21T13:24:07.4695865Z Progress (2): 96 kB | 5.0/91 kB
2026-09-21T13:24:07.4697112Z Progress (2): 96 kB | 38/91 kB 
2026-09-21T13:24:07.4697780Z Progress (2): 96 kB | 71/91 kB
2026-09-21T13:24:07.4705373Z Progress (2): 96 kB | 91 kB   
2026-09-21T13:24:07.4706656Z Progress (3): 96 kB | 91 kB | 7.7/33 kB
2026-09-21T13:24:07.4723760Z Progress (3): 96 kB | 91 kB | 33 kB    
2026-09-21T13:24:07.4724299Z Progress (4): 96 kB | 91 kB | 33 kB | 2.3/3.3 kB
2026-09-21T13:24:07.4726215Z Progress (4): 96 kB | 91 kB | 33 kB | 3.3 kB    
2026-09-21T13:24:07.4726399Z                                             
2026-09-21T13:24:07.4726794Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-core/1.3.10/prometheus-metrics-core-1.3.10.jar (96 kB at 573 kB/s)
2026-09-21T13:24:07.4727222Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-textformats/1.3.10/prometheus-metrics-exposition-textformats-1.3.10.jar
2026-09-21T13:24:07.4762747Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-model/1.3.10/prometheus-metrics-model-1.3.10.jar (91 kB at 529 kB/s)
2026-09-21T13:24:07.4763278Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-pushgateway/1.3.10/prometheus-metrics-exporter-pushgateway-1.3.10.jar
2026-09-21T13:24:07.4770044Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-config/1.3.10/prometheus-metrics-config-1.3.10.jar (33 kB at 194 kB/s)
2026-09-21T13:24:07.4770576Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-common/1.3.10/prometheus-metrics-exporter-common-1.3.10.jar
2026-09-21T13:24:07.4784545Z Progress (2): 3.3 kB | 0/2.1 MB
2026-09-21T13:24:07.4784704Z                                
2026-09-21T13:24:07.4785037Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-tracer-common/1.3.10/prometheus-metrics-tracer-common-1.3.10.jar (3.3 kB at 19 kB/s)
2026-09-21T13:24:07.4785311Z Progress (1): 0/2.1 MB
2026-09-21T13:24:07.4785518Z                       
2026-09-21T13:24:07.4785823Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/logstash/logback/logstash-logback-encoder/7.4/logstash-logback-encoder-7.4.jar
2026-09-21T13:24:07.4792001Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.4806786Z Progress (1): 0.1/2.1 MB
2026-09-21T13:24:07.4807425Z Progress (2): 0.1/2.1 MB | 3.6/23 kB
2026-09-21T13:24:07.4812750Z Progress (2): 0.1/2.1 MB | 23 kB    
2026-09-21T13:24:07.4812869Z Progress (2): 0.1/2.1 MB | 23 kB
2026-09-21T13:24:07.4813034Z Progress (2): 0.1/2.1 MB | 23 kB
2026-09-21T13:24:07.4813226Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4814217Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4816086Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4816240Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4816898Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4817794Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4818346Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4830883Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4831086Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4832926Z Progress (2): 0.2/2.1 MB | 23 kB
2026-09-21T13:24:07.4833712Z Progress (2): 0.3/2.1 MB | 23 kB
2026-09-21T13:24:07.4835102Z Progress (2): 0.3/2.1 MB | 23 kB
2026-09-21T13:24:07.4836149Z Progress (2): 0.3/2.1 MB | 23 kB
2026-09-21T13:24:07.4844459Z Progress (2): 0.3/2.1 MB | 23 kB
2026-09-21T13:24:07.4844617Z Progress (2): 0.4/2.1 MB | 23 kB
2026-09-21T13:24:07.4844891Z Progress (2): 0.4/2.1 MB | 23 kB
2026-09-21T13:24:07.4845030Z Progress (2): 0.4/2.1 MB | 23 kB
2026-09-21T13:24:07.4845161Z Progress (2): 0.4/2.1 MB | 23 kB
2026-09-21T13:24:07.4845261Z Progress (2): 0.4/2.1 MB | 23 kB
2026-09-21T13:24:07.4845417Z Progress (3): 0.4/2.1 MB | 23 kB | 6.4/16 kB
2026-09-21T13:24:07.4845569Z Progress (3): 0.4/2.1 MB | 23 kB | 6.4/16 kB
2026-09-21T13:24:07.4845715Z Progress (3): 0.4/2.1 MB | 23 kB | 16 kB    
2026-09-21T13:24:07.4845917Z Progress (3): 0.4/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4846061Z Progress (3): 0.4/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4846200Z Progress (3): 0.4/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4847701Z Progress (3): 0.4/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4847918Z Progress (3): 0.5/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4850595Z Progress (3): 0.5/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4850776Z Progress (3): 0.5/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4850915Z Progress (3): 0.5/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4851085Z Progress (3): 0.5/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4851718Z Progress (3): 0.6/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4852343Z Progress (3): 0.6/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4852493Z Progress (3): 0.6/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4862693Z Progress (3): 0.6/2.1 MB | 23 kB | 16 kB
2026-09-21T13:24:07.4862986Z Progress (4): 0.6/2.1 MB | 23 kB | 16 kB | 7.7/10 kB
2026-09-21T13:24:07.4863156Z Progress (4): 0.6/2.1 MB | 23 kB | 16 kB | 10 kB    
2026-09-21T13:24:07.4863305Z                                                 
2026-09-21T13:24:07.4863795Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-textformats/1.3.10/prometheus-metrics-exposition-textformats-1.3.10.jar (23 kB at 129 kB/s)
2026-09-21T13:24:07.4864305Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/oracle/database/jdbc/ojdbc11/23.5.0.24.07/ojdbc11-23.5.0.24.07.jar
2026-09-21T13:24:07.4864514Z Progress (3): 0.6/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4865384Z Progress (3): 0.6/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4865559Z Progress (3): 0.7/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4865696Z Progress (3): 0.7/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4866254Z Progress (3): 0.7/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4868169Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4868412Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4868570Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4869111Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4869229Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4869561Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4870330Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4870498Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4870845Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4872424Z Progress (3): 0.8/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4872759Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4873074Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4873313Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4873945Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4874094Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4874442Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4875229Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4875338Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4876090Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4876240Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4876902Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4881507Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4881655Z Progress (3): 0.9/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4881760Z Progress (3): 1.0/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4882569Z Progress (3): 1.0/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4882716Z Progress (3): 1.0/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4883752Z Progress (3): 1.0/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4884564Z Progress (3): 1.0/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4884875Z Progress (3): 1.0/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4885197Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4886082Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4886721Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4887077Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4887217Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4888436Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4889413Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4889719Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4890492Z Progress (3): 1.1/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4890818Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4891111Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4891927Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4893909Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4894645Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4895781Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4896142Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4896900Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4897196Z Progress (3): 1.2/2.1 MB | 16 kB | 10 kB
2026-09-21T13:24:07.4897706Z Progress (4): 1.2/2.1 MB | 16 kB | 10 kB | 3.6/436 kB
2026-09-21T13:24:07.4897885Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 3.6/436 kB
2026-09-21T13:24:07.4898207Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 3.6/436 kB
2026-09-21T13:24:07.4899349Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 26/436 kB 
2026-09-21T13:24:07.4899752Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 52/436 kB
2026-09-21T13:24:07.4900478Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 68/436 kB
2026-09-21T13:24:07.4901194Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 86/436 kB
2026-09-21T13:24:07.4912328Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4912546Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4912806Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4913032Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4913155Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4917116Z Progress (4): 1.3/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4917405Z Progress (4): 1.4/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4917641Z Progress (4): 1.4/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4919916Z Progress (4): 1.4/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4920062Z Progress (4): 1.4/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4920276Z Progress (4): 1.4/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4921933Z Progress (4): 1.4/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4923397Z Progress (4): 1.4/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4924699Z Progress (4): 1.5/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4926113Z Progress (4): 1.5/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4940659Z Progress (4): 1.5/2.1 MB | 16 kB | 10 kB | 98/436 kB
2026-09-21T13:24:07.4940806Z                                                     
2026-09-21T13:24:07.4941395Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-pushgateway/1.3.10/prometheus-metrics-exporter-pushgateway-1.3.10.jar (16 kB at 83 kB/s)
2026-09-21T13:24:07.4941825Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-yaml/2.21.4/jackson-dataformat-yaml-2.21.4.jar
2026-09-21T13:24:07.5006156Z Progress (3): 1.5/2.1 MB | 10 kB | 98/436 kB
2026-09-21T13:24:07.5012087Z Progress (3): 1.6/2.1 MB | 10 kB | 98/436 kB
2026-09-21T13:24:07.5012368Z Progress (3): 1.6/2.1 MB | 10 kB | 100/436 kB
2026-09-21T13:24:07.5012523Z Progress (3): 1.6/2.1 MB | 10 kB | 100/436 kB
2026-09-21T13:24:07.5012636Z Progress (3): 1.6/2.1 MB | 10 kB | 101/436 kB
2026-09-21T13:24:07.5012785Z Progress (3): 1.6/2.1 MB | 10 kB | 101/436 kB
2026-09-21T13:24:07.5012933Z Progress (3): 1.6/2.1 MB | 10 kB | 105/436 kB
2026-09-21T13:24:07.5013240Z Progress (3): 1.6/2.1 MB | 10 kB | 116/436 kB
2026-09-21T13:24:07.5013382Z Progress (3): 1.7/2.1 MB | 10 kB | 116/436 kB
2026-09-21T13:24:07.5013499Z Progress (3): 1.7/2.1 MB | 10 kB | 145/436 kB
2026-09-21T13:24:07.5013647Z Progress (3): 1.7/2.1 MB | 10 kB | 145/436 kB
2026-09-21T13:24:07.5013957Z Progress (3): 1.7/2.1 MB | 10 kB | 154/436 kB
2026-09-21T13:24:07.5014121Z Progress (3): 1.7/2.1 MB | 10 kB | 169/436 kB
2026-09-21T13:24:07.5014251Z                                              
2026-09-21T13:24:07.5014661Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exporter-common/1.3.10/prometheus-metrics-exporter-common-1.3.10.jar (10 kB at 52 kB/s)
2026-09-21T13:24:07.5015031Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/yaml/snakeyaml/2.5/snakeyaml-2.5.jar
2026-09-21T13:24:07.5021352Z Progress (2): 1.7/2.1 MB | 176/436 kB
2026-09-21T13:24:07.5021708Z Progress (2): 1.7/2.1 MB | 202/436 kB
2026-09-21T13:24:07.5021900Z Progress (2): 1.7/2.1 MB | 229/436 kB
2026-09-21T13:24:07.5022070Z Progress (2): 1.7/2.1 MB | 262/436 kB
2026-09-21T13:24:07.5022221Z Progress (2): 1.7/2.1 MB | 295/436 kB
2026-09-21T13:24:07.5022543Z Progress (2): 1.7/2.1 MB | 326/436 kB
2026-09-21T13:24:07.5022845Z Progress (2): 1.7/2.1 MB | 326/436 kB
2026-09-21T13:24:07.5023020Z Progress (2): 1.7/2.1 MB | 352/436 kB
2026-09-21T13:24:07.5023216Z Progress (2): 1.7/2.1 MB | 360/436 kB
2026-09-21T13:24:07.5023469Z Progress (2): 1.7/2.1 MB | 360/436 kB
2026-09-21T13:24:07.5027589Z Progress (2): 1.8/2.1 MB | 360/436 kB
2026-09-21T13:24:07.5056333Z Progress (2): 1.8/2.1 MB | 360/436 kB
2026-09-21T13:24:07.5056766Z Progress (3): 1.8/2.1 MB | 360/436 kB | 7.7/340 kB
2026-09-21T13:24:07.5056961Z Progress (3): 1.8/2.1 MB | 360/436 kB | 7.7/340 kB
2026-09-21T13:24:07.5057114Z Progress (3): 1.8/2.1 MB | 360/436 kB | 40/340 kB 
2026-09-21T13:24:07.5057248Z Progress (3): 1.8/2.1 MB | 360/436 kB | 40/340 kB
2026-09-21T13:24:07.5057405Z Progress (3): 1.8/2.1 MB | 360/436 kB | 40/340 kB
2026-09-21T13:24:07.5057567Z Progress (3): 1.8/2.1 MB | 360/436 kB | 40/340 kB
2026-09-21T13:24:07.5057733Z Progress (3): 1.8/2.1 MB | 360/436 kB | 73/340 kB
2026-09-21T13:24:07.5057884Z Progress (3): 1.8/2.1 MB | 360/436 kB | 81/340 kB
2026-09-21T13:24:07.5057999Z Progress (3): 1.8/2.1 MB | 360/436 kB | 81/340 kB
2026-09-21T13:24:07.5058952Z Progress (3): 1.8/2.1 MB | 360/436 kB | 102/340 kB
2026-09-21T13:24:07.5059112Z Progress (3): 1.8/2.1 MB | 360/436 kB | 126/340 kB
2026-09-21T13:24:07.5059284Z Progress (3): 1.8/2.1 MB | 360/436 kB | 131/340 kB
2026-09-21T13:24:07.5059432Z Progress (3): 1.8/2.1 MB | 360/436 kB | 131/340 kB
2026-09-21T13:24:07.5059547Z Progress (3): 1.8/2.1 MB | 360/436 kB | 147/340 kB
2026-09-21T13:24:07.5060113Z Progress (3): 1.8/2.1 MB | 360/436 kB | 149/340 kB
2026-09-21T13:24:07.5060281Z Progress (3): 1.9/2.1 MB | 360/436 kB | 149/340 kB
2026-09-21T13:24:07.5061034Z Progress (3): 1.9/2.1 MB | 360/436 kB | 163/340 kB
2026-09-21T13:24:07.5061217Z Progress (3): 1.9/2.1 MB | 360/436 kB | 163/340 kB
2026-09-21T13:24:07.5061362Z Progress (3): 1.9/2.1 MB | 360/436 kB | 168/340 kB
2026-09-21T13:24:07.5061601Z Progress (3): 1.9/2.1 MB | 360/436 kB | 168/340 kB
2026-09-21T13:24:07.5061751Z Progress (3): 1.9/2.1 MB | 360/436 kB | 168/340 kB
2026-09-21T13:24:07.5061898Z Progress (3): 1.9/2.1 MB | 360/436 kB | 180/340 kB
2026-09-21T13:24:07.5062152Z Progress (3): 1.9/2.1 MB | 360/436 kB | 184/340 kB
2026-09-21T13:24:07.5062449Z Progress (3): 1.9/2.1 MB | 360/436 kB | 184/340 kB
2026-09-21T13:24:07.5062564Z Progress (3): 1.9/2.1 MB | 360/436 kB | 184/340 kB
2026-09-21T13:24:07.5063536Z Progress (3): 1.9/2.1 MB | 360/436 kB | 195/340 kB
2026-09-21T13:24:07.5063689Z Progress (3): 1.9/2.1 MB | 360/436 kB | 195/340 kB
2026-09-21T13:24:07.5063942Z Progress (3): 1.9/2.1 MB | 360/436 kB | 206/340 kB
2026-09-21T13:24:07.5064259Z Progress (3): 1.9/2.1 MB | 360/436 kB | 208/340 kB
2026-09-21T13:24:07.5064373Z Progress (3): 1.9/2.1 MB | 360/436 kB | 223/340 kB
2026-09-21T13:24:07.5066276Z Progress (3): 1.9/2.1 MB | 360/436 kB | 223/340 kB
2026-09-21T13:24:07.5066483Z Progress (3): 1.9/2.1 MB | 360/436 kB | 223/340 kB
2026-09-21T13:24:07.5066648Z Progress (3): 1.9/2.1 MB | 360/436 kB | 244/340 kB
2026-09-21T13:24:07.5066792Z Progress (3): 1.9/2.1 MB | 366/436 kB | 244/340 kB
2026-09-21T13:24:07.5066906Z Progress (3): 1.9/2.1 MB | 366/436 kB | 246/340 kB
2026-09-21T13:24:07.5067052Z Progress (3): 1.9/2.1 MB | 367/436 kB | 246/340 kB
2026-09-21T13:24:07.5067204Z Progress (3): 2.0/2.1 MB | 367/436 kB | 246/340 kB
2026-09-21T13:24:07.5067377Z Progress (3): 2.0/2.1 MB | 367/436 kB | 246/340 kB
2026-09-21T13:24:07.5067529Z Progress (3): 2.0/2.1 MB | 367/436 kB | 246/340 kB
2026-09-21T13:24:07.5067643Z Progress (3): 2.0/2.1 MB | 367/436 kB | 257/340 kB
2026-09-21T13:24:07.5067904Z Progress (3): 2.0/2.1 MB | 367/436 kB | 257/340 kB
2026-09-21T13:24:07.5068090Z Progress (3): 2.0/2.1 MB | 367/436 kB | 257/340 kB
2026-09-21T13:24:07.5073319Z Progress (3): 2.0/2.1 MB | 367/436 kB | 270/340 kB
2026-09-21T13:24:07.5073616Z Progress (3): 2.0/2.1 MB | 367/436 kB | 270/340 kB
2026-09-21T13:24:07.5073769Z Progress (3): 2.0/2.1 MB | 367/436 kB | 270/340 kB
2026-09-21T13:24:07.5073981Z Progress (3): 2.0/2.1 MB | 388/436 kB | 270/340 kB
2026-09-21T13:24:07.5074135Z Progress (3): 2.0/2.1 MB | 388/436 kB | 270/340 kB
2026-09-21T13:24:07.5074296Z Progress (4): 2.0/2.1 MB | 388/436 kB | 270/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5074521Z Progress (4): 2.0/2.1 MB | 388/436 kB | 270/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5074698Z Progress (4): 2.0/2.1 MB | 388/436 kB | 270/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5074824Z Progress (4): 2.0/2.1 MB | 416/436 kB | 270/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5074996Z Progress (4): 2.0/2.1 MB | 416/436 kB | 270/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5075175Z Progress (4): 2.0/2.1 MB | 416/436 kB | 270/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5075330Z Progress (4): 2.0/2.1 MB | 431/436 kB | 270/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5075487Z Progress (4): 2.0/2.1 MB | 431/436 kB | 284/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5075611Z Progress (4): 2.0/2.1 MB | 436 kB | 284/340 kB | 0/7.2 MB    
2026-09-21T13:24:07.5075767Z Progress (4): 2.1/2.1 MB | 436 kB | 284/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5075926Z Progress (4): 2.1/2.1 MB | 436 kB | 284/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5076082Z Progress (4): 2.1/2.1 MB | 436 kB | 284/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5076245Z Progress (4): 2.1/2.1 MB | 436 kB | 284/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5076363Z Progress (4): 2.1/2.1 MB | 436 kB | 294/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5076524Z Progress (4): 2.1/2.1 MB | 436 kB | 296/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5076781Z Progress (4): 2.1/2.1 MB | 436 kB | 296/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5076936Z Progress (4): 2.1/2.1 MB | 436 kB | 299/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5077082Z Progress (4): 2.1/2.1 MB | 436 kB | 309/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5077199Z Progress (4): 2.1/2.1 MB | 436 kB | 309/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5077350Z Progress (4): 2.1/2.1 MB | 436 kB | 309/340 kB | 0/7.2 MB
2026-09-21T13:24:07.5077507Z Progress (4): 2.1/2.1 MB | 436 kB | 309/340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5077666Z Progress (4): 2.1 MB | 436 kB | 309/340 kB | 0.1/7.2 MB    
2026-09-21T13:24:07.5077831Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB    
2026-09-21T13:24:07.5078078Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5078232Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5078395Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5078545Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5078693Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5078848Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5090867Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5091051Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5091205Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5091409Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5091559Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.1/7.2 MB
2026-09-21T13:24:07.5091754Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB
2026-09-21T13:24:07.5091901Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB
2026-09-21T13:24:07.5092022Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB
2026-09-21T13:24:07.5092172Z Progress (4): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB
2026-09-21T13:24:07.5092377Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB | 7.7/61 kB
2026-09-21T13:24:07.5092540Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB | 7.7/61 kB
2026-09-21T13:24:07.5092698Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB | 7.7/61 kB
2026-09-21T13:24:07.5092822Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.2/7.2 MB | 41/61 kB 
2026-09-21T13:24:07.5092983Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.3/7.2 MB | 41/61 kB
2026-09-21T13:24:07.5093155Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.3/7.2 MB | 61 kB   
2026-09-21T13:24:07.5093311Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.3/7.2 MB | 61 kB
2026-09-21T13:24:07.5093471Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.3/7.2 MB | 61 kB
2026-09-21T13:24:07.5097076Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.4/7.2 MB | 61 kB
2026-09-21T13:24:07.5097205Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.4/7.2 MB | 61 kB
2026-09-21T13:24:07.5097945Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.4/7.2 MB | 61 kB
2026-09-21T13:24:07.5100043Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.4/7.2 MB | 61 kB
2026-09-21T13:24:07.5101100Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.4/7.2 MB | 61 kB
2026-09-21T13:24:07.5102118Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.4/7.2 MB | 61 kB
2026-09-21T13:24:07.5102674Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.5/7.2 MB | 61 kB
2026-09-21T13:24:07.5103784Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.5/7.2 MB | 61 kB
2026-09-21T13:24:07.5106886Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.5/7.2 MB | 61 kB
2026-09-21T13:24:07.5107063Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.5/7.2 MB | 61 kB
2026-09-21T13:24:07.5107778Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.5/7.2 MB | 61 kB
2026-09-21T13:24:07.5108425Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.5/7.2 MB | 61 kB
2026-09-21T13:24:07.5109104Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.5/7.2 MB | 61 kB
2026-09-21T13:24:07.5109232Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5110361Z Progress (5): 2.1 MB | 436 kB | 340 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5110511Z                                                            
2026-09-21T13:24:07.5110985Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/yaml/snakeyaml/2.5/snakeyaml-2.5.jar (340 kB at 1.7 MB/s)
2026-09-21T13:24:07.5111329Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/projectlombok/lombok/1.18.46/lombok-1.18.46.jar
2026-09-21T13:24:07.5112179Z Progress (4): 2.1 MB | 436 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5112307Z Progress (4): 2.1 MB | 436 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5112464Z Progress (4): 2.1 MB | 436 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5140298Z Progress (4): 2.1 MB | 436 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5140631Z Progress (4): 2.1 MB | 436 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5140928Z Progress (4): 2.1 MB | 436 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5141047Z Progress (4): 2.1 MB | 436 kB | 0.6/7.2 MB | 61 kB
2026-09-21T13:24:07.5141195Z Progress (4): 2.1 MB | 436 kB | 0.7/7.2 MB | 61 kB
2026-09-21T13:24:07.5142355Z Progress (4): 2.1 MB | 436 kB | 0.7/7.2 MB | 61 kB
2026-09-21T13:24:07.5150704Z Progress (4): 2.1 MB | 436 kB | 0.7/7.2 MB | 61 kB
2026-09-21T13:24:07.5150904Z Progress (4): 2.1 MB | 436 kB | 0.7/7.2 MB | 61 kB
2026-09-21T13:24:07.5151064Z Progress (4): 2.1 MB | 436 kB | 0.7/7.2 MB | 61 kB
2026-09-21T13:24:07.5151175Z Progress (4): 2.1 MB | 436 kB | 0.7/7.2 MB | 61 kB
2026-09-21T13:24:07.5151351Z Progress (4): 2.1 MB | 436 kB | 0.7/7.2 MB | 61 kB
2026-09-21T13:24:07.5151559Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5151703Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5151852Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5151964Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5152114Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5152269Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5152412Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5152519Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5152662Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5152837Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5152982Z Progress (4): 2.1 MB | 436 kB | 0.8/7.2 MB | 61 kB
2026-09-21T13:24:07.5153122Z Progress (4): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB
2026-09-21T13:24:07.5159299Z Progress (4): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB
2026-09-21T13:24:07.5159516Z Progress (4): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB
2026-09-21T13:24:07.5163332Z Progress (5): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB | 0/2.0 MB
2026-09-21T13:24:07.5163674Z Progress (5): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB | 0/2.0 MB
2026-09-21T13:24:07.5167383Z Progress (5): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB | 0/2.0 MB
2026-09-21T13:24:07.5167587Z Progress (5): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB | 0/2.0 MB
2026-09-21T13:24:07.5167837Z Progress (5): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB | 0/2.0 MB
2026-09-21T13:24:07.5167994Z Progress (5): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB | 0/2.0 MB
2026-09-21T13:24:07.5168232Z Progress (5): 2.1 MB | 436 kB | 0.9/7.2 MB | 61 kB | 0.1/2.0 MB
2026-09-21T13:24:07.5168377Z                                                                
2026-09-21T13:24:07.5168817Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/prometheus/prometheus-metrics-exposition-formats/1.3.10/prometheus-metrics-exposition-formats-1.3.10.jar (2.1 MB at 9.9 MB/s)
2026-09-21T13:24:07.5169120Z Progress (4): 436 kB | 0.9/7.2 MB | 61 kB | 0.1/2.0 MB
2026-09-21T13:24:07.5169267Z                                                       
2026-09-21T13:24:07.5169620Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-test/3.5.16/spring-boot-starter-test-3.5.16.jar
2026-09-21T13:24:07.5169854Z Progress (4): 436 kB | 0.9/7.2 MB | 61 kB | 0.1/2.0 MB
2026-09-21T13:24:07.5170036Z Progress (4): 436 kB | 0.9/7.2 MB | 61 kB | 0.1/2.0 MB
2026-09-21T13:24:07.5170152Z Progress (4): 436 kB | 0.9/7.2 MB | 61 kB | 0.1/2.0 MB
2026-09-21T13:24:07.5170287Z                                                       
2026-09-21T13:24:07.5170611Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/logstash/logback/logstash-logback-encoder/7.4/logstash-logback-encoder-7.4.jar (436 kB at 2.1 MB/s)
2026-09-21T13:24:07.5170990Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test/3.5.16/spring-boot-test-3.5.16.jar
2026-09-21T13:24:07.5171228Z Progress (3): 0.9/7.2 MB | 61 kB | 0.1/2.0 MB
2026-09-21T13:24:07.5171386Z Progress (3): 0.9/7.2 MB | 61 kB | 0.1/2.0 MB
2026-09-21T13:24:07.5171620Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5173362Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5173553Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5173700Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5173921Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5174040Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5175336Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5175484Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5175625Z Progress (3): 0.9/7.2 MB | 61 kB | 0.2/2.0 MB
2026-09-21T13:24:07.5176162Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5176333Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5177716Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5178337Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5178678Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5179194Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5180171Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5180331Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5180662Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5181027Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5181328Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5181833Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5182348Z Progress (3): 0.9/7.2 MB | 61 kB | 0.3/2.0 MB
2026-09-21T13:24:07.5182723Z Progress (3): 0.9/7.2 MB | 61 kB | 0.4/2.0 MB
2026-09-21T13:24:07.5183891Z Progress (3): 0.9/7.2 MB | 61 kB | 0.4/2.0 MB
2026-09-21T13:24:07.5184064Z Progress (3): 0.9/7.2 MB | 61 kB | 0.4/2.0 MB
2026-09-21T13:24:07.5184193Z                                              
2026-09-21T13:24:07.5184514Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-yaml/2.21.4/jackson-dataformat-yaml-2.21.4.jar (61 kB at 283 kB/s)
2026-09-21T13:24:07.5184747Z Progress (2): 0.9/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5184893Z Progress (2): 0.9/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5185031Z                                      
2026-09-21T13:24:07.5185348Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test-autoconfigure/3.5.16/spring-boot-test-autoconfigure-3.5.16.jar
2026-09-21T13:24:07.5185621Z Progress (2): 1.0/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5185779Z Progress (2): 1.0/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5186191Z Progress (2): 1.0/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5189611Z Progress (2): 1.0/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5189808Z Progress (2): 1.0/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5190613Z Progress (2): 1.0/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5190870Z Progress (2): 1.0/7.2 MB | 0.4/2.0 MB
2026-09-21T13:24:07.5191702Z Progress (2): 1.0/7.2 MB | 0.5/2.0 MB
2026-09-21T13:24:07.5192038Z Progress (2): 1.1/7.2 MB | 0.5/2.0 MB
2026-09-21T13:24:07.5192665Z Progress (2): 1.1/7.2 MB | 0.5/2.0 MB
2026-09-21T13:24:07.5193033Z Progress (2): 1.1/7.2 MB | 0.5/2.0 MB
2026-09-21T13:24:07.5193506Z Progress (2): 1.1/7.2 MB | 0.5/2.0 MB
2026-09-21T13:24:07.5194121Z Progress (2): 1.1/7.2 MB | 0.5/2.0 MB
2026-09-21T13:24:07.5194281Z Progress (2): 1.1/7.2 MB | 0.5/2.0 MB
2026-09-21T13:24:07.5194803Z Progress (2): 1.1/7.2 MB | 0.6/2.0 MB
2026-09-21T13:24:07.5197550Z Progress (2): 1.1/7.2 MB | 0.6/2.0 MB
2026-09-21T13:24:07.5197860Z Progress (2): 1.1/7.2 MB | 0.6/2.0 MB
2026-09-21T13:24:07.5198789Z Progress (2): 1.1/7.2 MB | 0.6/2.0 MB
2026-09-21T13:24:07.5199266Z Progress (2): 1.1/7.2 MB | 0.6/2.0 MB
2026-09-21T13:24:07.5199820Z Progress (2): 1.1/7.2 MB | 0.6/2.0 MB
2026-09-21T13:24:07.5201412Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5201585Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5202037Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5202347Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5203252Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5203511Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5203977Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5205419Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5206391Z Progress (2): 1.1/7.2 MB | 0.7/2.0 MB
2026-09-21T13:24:07.5207415Z Progress (2): 1.1/7.2 MB | 0.8/2.0 MB
2026-09-21T13:24:07.5208411Z Progress (2): 1.1/7.2 MB | 0.8/2.0 MB
2026-09-21T13:24:07.5208682Z Progress (2): 1.1/7.2 MB | 0.8/2.0 MB
2026-09-21T13:24:07.5211444Z Progress (2): 1.1/7.2 MB | 0.8/2.0 MB
2026-09-21T13:24:07.5212272Z Progress (2): 1.1/7.2 MB | 0.8/2.0 MB
2026-09-21T13:24:07.5213413Z Progress (2): 1.1/7.2 MB | 0.9/2.0 MB
2026-09-21T13:24:07.5214428Z Progress (2): 1.1/7.2 MB | 0.9/2.0 MB
2026-09-21T13:24:07.5214818Z Progress (2): 1.1/7.2 MB | 0.9/2.0 MB
2026-09-21T13:24:07.5215001Z Progress (2): 1.1/7.2 MB | 0.9/2.0 MB
2026-09-21T13:24:07.5216076Z Progress (2): 1.1/7.2 MB | 0.9/2.0 MB
2026-09-21T13:24:07.5216338Z Progress (2): 1.1/7.2 MB | 1.0/2.0 MB
2026-09-21T13:24:07.5217349Z Progress (2): 1.1/7.2 MB | 1.0/2.0 MB
2026-09-21T13:24:07.5218119Z Progress (2): 1.1/7.2 MB | 1.0/2.0 MB
2026-09-21T13:24:07.5218384Z Progress (2): 1.1/7.2 MB | 1.0/2.0 MB
2026-09-21T13:24:07.5218820Z Progress (2): 1.1/7.2 MB | 1.0/2.0 MB
2026-09-21T13:24:07.5219861Z Progress (2): 1.1/7.2 MB | 1.0/2.0 MB
2026-09-21T13:24:07.5220322Z Progress (2): 1.1/7.2 MB | 1.0/2.0 MB
2026-09-21T13:24:07.5221409Z Progress (2): 1.1/7.2 MB | 1.1/2.0 MB
2026-09-21T13:24:07.5222108Z Progress (2): 1.1/7.2 MB | 1.1/2.0 MB
2026-09-21T13:24:07.5222272Z Progress (2): 1.1/7.2 MB | 1.1/2.0 MB
2026-09-21T13:24:07.5223287Z Progress (2): 1.1/7.2 MB | 1.1/2.0 MB
2026-09-21T13:24:07.5224449Z Progress (2): 1.1/7.2 MB | 1.1/2.0 MB
2026-09-21T13:24:07.5225955Z Progress (2): 1.1/7.2 MB | 1.1/2.0 MB
2026-09-21T13:24:07.5226983Z Progress (2): 1.1/7.2 MB | 1.2/2.0 MB
2026-09-21T13:24:07.5227099Z Progress (2): 1.1/7.2 MB | 1.2/2.0 MB
2026-09-21T13:24:07.5228257Z Progress (2): 1.1/7.2 MB | 1.2/2.0 MB
2026-09-21T13:24:07.5228453Z Progress (2): 1.1/7.2 MB | 1.2/2.0 MB
2026-09-21T13:24:07.5230448Z Progress (2): 1.1/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5230712Z Progress (2): 1.1/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5230874Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5231010Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5231147Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5231403Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5231551Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5232406Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5232738Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5232884Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5233111Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5233306Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5233957Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5234118Z Progress (2): 1.2/7.2 MB | 1.3/2.0 MB
2026-09-21T13:24:07.5234301Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5234812Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5235168Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5235319Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5235523Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5236314Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5236515Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5236670Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5236811Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5237124Z Progress (2): 1.2/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5237235Z Progress (2): 1.3/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5237537Z Progress (2): 1.3/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5238536Z Progress (2): 1.3/7.2 MB | 1.4/2.0 MB
2026-09-21T13:24:07.5238701Z Progress (3): 1.3/7.2 MB | 1.4/2.0 MB | 3.6/4.8 kB
2026-09-21T13:24:07.5238912Z Progress (3): 1.3/7.2 MB | 1.5/2.0 MB | 3.6/4.8 kB
2026-09-21T13:24:07.5240255Z Progress (3): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB    
2026-09-21T13:24:07.5240431Z Progress (3): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB
2026-09-21T13:24:07.5240579Z Progress (3): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB
2026-09-21T13:24:07.5240725Z Progress (3): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB
2026-09-21T13:24:07.5246349Z Progress (3): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB
2026-09-21T13:24:07.5246464Z Progress (3): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB
2026-09-21T13:24:07.5246655Z Progress (4): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB | 7.7/258 kB
2026-09-21T13:24:07.5246818Z Progress (4): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB | 7.7/258 kB
2026-09-21T13:24:07.5247086Z Progress (4): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB | 36/258 kB 
2026-09-21T13:24:07.5247247Z Progress (4): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5247371Z Progress (4): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5247529Z Progress (4): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5247686Z Progress (4): 1.3/7.2 MB | 1.5/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5247893Z Progress (4): 1.3/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5248052Z Progress (4): 1.3/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5248171Z Progress (4): 1.3/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5248340Z Progress (4): 1.4/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5248494Z Progress (4): 1.4/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5248659Z Progress (4): 1.4/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5248862Z Progress (4): 1.4/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5249005Z Progress (4): 1.4/7.2 MB | 1.6/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5249162Z Progress (4): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 36/258 kB
2026-09-21T13:24:07.5249317Z Progress (4): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 66/258 kB
2026-09-21T13:24:07.5250203Z Progress (4): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 66/258 kB
2026-09-21T13:24:07.5250614Z Progress (4): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 66/258 kB
2026-09-21T13:24:07.5250863Z Progress (4): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 66/258 kB
2026-09-21T13:24:07.5251106Z Progress (4): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 92/258 kB
2026-09-21T13:24:07.5251280Z Progress (4): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 98/258 kB
2026-09-21T13:24:07.5251447Z Progress (5): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 98/258 kB | 0.9/230 kB
2026-09-21T13:24:07.5252171Z Progress (5): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 98/258 kB | 0.9/230 kB
2026-09-21T13:24:07.5252364Z Progress (5): 1.4/7.2 MB | 1.7/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB 
2026-09-21T13:24:07.5253138Z Progress (5): 1.4/7.2 MB | 1.8/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB
2026-09-21T13:24:07.5254317Z Progress (5): 1.4/7.2 MB | 1.8/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB
2026-09-21T13:24:07.5256233Z Progress (5): 1.4/7.2 MB | 1.8/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB
2026-09-21T13:24:07.5256411Z Progress (5): 1.4/7.2 MB | 1.8/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB
2026-09-21T13:24:07.5257298Z Progress (5): 1.4/7.2 MB | 1.9/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB
2026-09-21T13:24:07.5258283Z Progress (5): 1.4/7.2 MB | 1.9/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB
2026-09-21T13:24:07.5259092Z Progress (5): 1.4/7.2 MB | 1.9/2.0 MB | 4.8 kB | 98/258 kB | 33/230 kB
2026-09-21T13:24:07.5259615Z Progress (5): 1.4/7.2 MB | 1.9/2.0 MB | 4.8 kB | 98/258 kB | 40/230 kB
2026-09-21T13:24:07.5259794Z Progress (5): 1.4/7.2 MB | 1.9/2.0 MB | 4.8 kB | 98/258 kB | 40/230 kB
2026-09-21T13:24:07.5259973Z Progress (5): 1.4/7.2 MB | 1.9/2.0 MB | 4.8 kB | 98/258 kB | 46/230 kB
2026-09-21T13:24:07.5260141Z Progress (5): 1.4/7.2 MB | 1.9/2.0 MB | 4.8 kB | 98/258 kB | 46/230 kB
2026-09-21T13:24:07.5260440Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 98/258 kB | 46/230 kB
2026-09-21T13:24:07.5260659Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 98/258 kB | 60/230 kB
2026-09-21T13:24:07.5261330Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 98/258 kB | 60/230 kB
2026-09-21T13:24:07.5263095Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 98/258 kB | 66/230 kB
2026-09-21T13:24:07.5263271Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 126/258 kB | 66/230 kB
2026-09-21T13:24:07.5263437Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 126/258 kB | 98/230 kB
2026-09-21T13:24:07.5263569Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 127/258 kB | 98/230 kB
2026-09-21T13:24:07.5263756Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 127/258 kB | 98/230 kB
2026-09-21T13:24:07.5264597Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 127/258 kB | 98/230 kB
2026-09-21T13:24:07.5265136Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 131/258 kB | 98/230 kB
2026-09-21T13:24:07.5265541Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 131/258 kB | 98/230 kB
2026-09-21T13:24:07.5266123Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 164/258 kB | 98/230 kB
2026-09-21T13:24:07.5266362Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 164/258 kB | 98/230 kB
2026-09-21T13:24:07.5266495Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 164/258 kB | 98/230 kB
2026-09-21T13:24:07.5266800Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 197/258 kB | 98/230 kB
2026-09-21T13:24:07.5267656Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 197/258 kB | 98/230 kB
2026-09-21T13:24:07.5267825Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 229/258 kB | 98/230 kB
2026-09-21T13:24:07.5268344Z Progress (5): 1.4/7.2 MB | 2.0/2.0 MB | 4.8 kB | 229/258 kB | 98/230 kB
2026-09-21T13:24:07.5268516Z Progress (5): 1.4/7.2 MB | 2.0 MB | 4.8 kB | 229/258 kB | 98/230 kB    
2026-09-21T13:24:07.5278369Z Progress (5): 1.4/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 98/230 kB    
2026-09-21T13:24:07.5278852Z Progress (5): 1.4/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 98/230 kB
2026-09-21T13:24:07.5279499Z Progress (5): 1.4/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 98/230 kB
2026-09-21T13:24:07.5279662Z Progress (5): 1.4/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 98/230 kB
2026-09-21T13:24:07.5280167Z Progress (5): 1.4/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 107/230 kB
2026-09-21T13:24:07.5280364Z Progress (5): 1.5/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 107/230 kB
2026-09-21T13:24:07.5281434Z Progress (5): 1.5/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 126/230 kB
2026-09-21T13:24:07.5283130Z Progress (5): 1.5/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 137/230 kB
2026-09-21T13:24:07.5283405Z Progress (5): 1.5/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 137/230 kB
2026-09-21T13:24:07.5284069Z Progress (5): 1.5/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 168/230 kB
2026-09-21T13:24:07.5284317Z Progress (5): 1.5/7.2 MB | 2.0 MB | 4.8 kB | 258 kB | 168/230 kB
2026-09-21T13:24:07.5284477Z                                                                 
2026-09-21T13:24:07.5284910Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-starter-test/3.5.16/spring-boot-starter-test-3.5.16.jar (4.8 kB at 21 kB/s)
2026-09-21T13:24:07.5285294Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.jar
2026-09-21T13:24:07.5285596Z Progress (4): 1.5/7.2 MB | 2.0 MB | 258 kB | 189/230 kB
2026-09-21T13:24:07.5286148Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 189/230 kB
2026-09-21T13:24:07.5286434Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 221/230 kB
2026-09-21T13:24:07.5286674Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 221/230 kB
2026-09-21T13:24:07.5286854Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 230 kB    
2026-09-21T13:24:07.5287040Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5294503Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5294718Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5294876Z Progress (4): 1.6/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5294993Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5295149Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5295473Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5295625Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5295773Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5295885Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5296121Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5296270Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5296416Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5296529Z Progress (4): 1.7/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5296751Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5296970Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5297171Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5297347Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5297514Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5297703Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5300533Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5300696Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5300988Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5301163Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5301495Z Progress (4): 1.8/7.2 MB | 2.0 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5301648Z                                                    
2026-09-21T13:24:07.5302039Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/projectlombok/lombok/1.18.46/lombok-1.18.46.jar (2.0 MB at 9.1 MB/s)
2026-09-21T13:24:07.5302426Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.jar
2026-09-21T13:24:07.5302645Z Progress (3): 1.8/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5302793Z Progress (3): 1.8/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5303228Z Progress (3): 1.9/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5303377Z Progress (3): 1.9/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5304571Z Progress (3): 1.9/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5304741Z Progress (3): 1.9/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5306861Z Progress (3): 1.9/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5307188Z Progress (3): 1.9/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5307806Z Progress (3): 1.9/7.2 MB | 258 kB | 230 kB
2026-09-21T13:24:07.5307931Z Progress (4): 1.9/7.2 MB | 258 kB | 230 kB | 7.7/277 kB
2026-09-21T13:24:07.5309075Z Progress (4): 1.9/7.2 MB | 258 kB | 230 kB | 7.7/277 kB
2026-09-21T13:24:07.5309279Z Progress (4): 1.9/7.2 MB | 258 kB | 230 kB | 40/277 kB 
2026-09-21T13:24:07.5311012Z Progress (4): 1.9/7.2 MB | 258 kB | 230 kB | 53/277 kB
2026-09-21T13:24:07.5311951Z Progress (4): 2.0/7.2 MB | 258 kB | 230 kB | 53/277 kB
2026-09-21T13:24:07.5312110Z Progress (4): 2.0/7.2 MB | 258 kB | 230 kB | 86/277 kB
2026-09-21T13:24:07.5312981Z Progress (4): 2.0/7.2 MB | 258 kB | 230 kB | 86/277 kB
2026-09-21T13:24:07.5313747Z Progress (4): 2.0/7.2 MB | 258 kB | 230 kB | 86/277 kB
2026-09-21T13:24:07.5313977Z Progress (4): 2.0/7.2 MB | 258 kB | 230 kB | 119/277 kB
2026-09-21T13:24:07.5315104Z Progress (4): 2.1/7.2 MB | 258 kB | 230 kB | 119/277 kB
2026-09-21T13:24:07.5316697Z Progress (4): 2.1/7.2 MB | 258 kB | 230 kB | 152/277 kB
2026-09-21T13:24:07.5317680Z Progress (4): 2.1/7.2 MB | 258 kB | 230 kB | 184/277 kB
2026-09-21T13:24:07.5318478Z Progress (4): 2.1/7.2 MB | 258 kB | 230 kB | 217/277 kB
2026-09-21T13:24:07.5319230Z Progress (4): 2.1/7.2 MB | 258 kB | 230 kB | 250/277 kB
2026-09-21T13:24:07.5325452Z Progress (4): 2.1/7.2 MB | 258 kB | 230 kB | 277 kB    
2026-09-21T13:24:07.5325605Z                                                    
2026-09-21T13:24:07.5325976Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test/3.5.16/spring-boot-test-3.5.16.jar (258 kB at 1.1 MB/s)
2026-09-21T13:24:07.5326565Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.jar
2026-09-21T13:24:07.5329143Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 5.0/131 kB
2026-09-21T13:24:07.5330668Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 38/131 kB 
2026-09-21T13:24:07.5334404Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 71/131 kB
2026-09-21T13:24:07.5334594Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 103/131 kB
2026-09-21T13:24:07.5343738Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB    
2026-09-21T13:24:07.5344013Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5345046Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5345176Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5345630Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5345906Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5346625Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5347967Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5350877Z Progress (4): 2.1/7.2 MB | 230 kB | 277 kB | 131 kB
2026-09-21T13:24:07.5351099Z                                                    
2026-09-21T13:24:07.5351536Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.jar (277 kB at 1.2 MB/s)
2026-09-21T13:24:07.5351756Z Progress (3): 2.2/7.2 MB | 230 kB | 131 kB
2026-09-21T13:24:07.5351894Z                                           
2026-09-21T13:24:07.5352141Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/json-smart/2.5.2/json-smart-2.5.2.jar
2026-09-21T13:24:07.5352349Z Progress (4): 2.2/7.2 MB | 230 kB | 131 kB | 7.7/67 kB
2026-09-21T13:24:07.5352514Z Progress (4): 2.2/7.2 MB | 230 kB | 131 kB | 7.7/67 kB
2026-09-21T13:24:07.5352770Z Progress (4): 2.2/7.2 MB | 230 kB | 131 kB | 41/67 kB 
2026-09-21T13:24:07.5352920Z Progress (4): 2.2/7.2 MB | 230 kB | 131 kB | 41/67 kB
2026-09-21T13:24:07.5353042Z Progress (4): 2.2/7.2 MB | 230 kB | 131 kB | 41/67 kB
2026-09-21T13:24:07.5353200Z Progress (4): 2.2/7.2 MB | 230 kB | 131 kB | 67 kB   
2026-09-21T13:24:07.5353356Z Progress (4): 2.3/7.2 MB | 230 kB | 131 kB | 67 kB
2026-09-21T13:24:07.5353511Z Progress (4): 2.3/7.2 MB | 230 kB | 131 kB | 67 kB
2026-09-21T13:24:07.5358683Z Progress (4): 2.3/7.2 MB | 230 kB | 131 kB | 67 kB
2026-09-21T13:24:07.5359045Z Progress (4): 2.3/7.2 MB | 230 kB | 131 kB | 67 kB
2026-09-21T13:24:07.5359667Z                                                   
2026-09-21T13:24:07.5360184Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/boot/spring-boot-test-autoconfigure/3.5.16/spring-boot-test-autoconfigure-3.5.16.jar (230 kB at 996 kB/s)
2026-09-21T13:24:07.5360703Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/accessors-smart/2.5.2/accessors-smart-2.5.2.jar
2026-09-21T13:24:07.5361159Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.jar (131 kB at 568 kB/s)
2026-09-21T13:24:07.5361861Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7.1/asm-9.7.1.jar
2026-09-21T13:24:07.5362471Z Progress (2): 2.3/7.2 MB | 67 kB
2026-09-21T13:24:07.5368496Z Progress (2): 2.3/7.2 MB | 67 kB
2026-09-21T13:24:07.5368659Z Progress (2): 2.3/7.2 MB | 67 kB
2026-09-21T13:24:07.5369067Z Progress (2): 2.3/7.2 MB | 67 kB
2026-09-21T13:24:07.5369252Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5369634Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5369737Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5378788Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5379075Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5379499Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5379738Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5379885Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5380045Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5380179Z Progress (2): 2.4/7.2 MB | 67 kB
2026-09-21T13:24:07.5380280Z Progress (2): 2.5/7.2 MB | 67 kB
2026-09-21T13:24:07.5380441Z Progress (2): 2.5/7.2 MB | 67 kB
2026-09-21T13:24:07.5380659Z Progress (2): 2.5/7.2 MB | 67 kB
2026-09-21T13:24:07.5380787Z                                 
2026-09-21T13:24:07.5381347Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.jar (67 kB at 289 kB/s)
2026-09-21T13:24:07.5381763Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.jar
2026-09-21T13:24:07.5381963Z Progress (1): 2.5/7.2 MB
2026-09-21T13:24:07.5382099Z Progress (1): 2.5/7.2 MB
2026-09-21T13:24:07.5382231Z Progress (1): 2.6/7.2 MB
2026-09-21T13:24:07.5382373Z Progress (1): 2.6/7.2 MB
2026-09-21T13:24:07.5382476Z Progress (1): 2.6/7.2 MB
2026-09-21T13:24:07.5382607Z Progress (1): 2.6/7.2 MB
2026-09-21T13:24:07.5382760Z Progress (1): 2.6/7.2 MB
2026-09-21T13:24:07.5382891Z Progress (1): 2.6/7.2 MB
2026-09-21T13:24:07.5382985Z Progress (1): 2.7/7.2 MB
2026-09-21T13:24:07.5383238Z Progress (2): 2.7/7.2 MB | 7.7/126 kB
2026-09-21T13:24:07.5383395Z Progress (2): 2.7/7.2 MB | 7.7/126 kB
2026-09-21T13:24:07.5383672Z Progress (2): 2.7/7.2 MB | 19/126 kB 
2026-09-21T13:24:07.5384031Z Progress (2): 2.7/7.2 MB | 19/126 kB
2026-09-21T13:24:07.5385940Z Progress (2): 2.7/7.2 MB | 36/126 kB
2026-09-21T13:24:07.5386094Z Progress (2): 2.7/7.2 MB | 36/126 kB
2026-09-21T13:24:07.5386270Z Progress (2): 2.7/7.2 MB | 46/126 kB
2026-09-21T13:24:07.5386375Z Progress (2): 2.7/7.2 MB | 46/126 kB
2026-09-21T13:24:07.5386520Z Progress (2): 2.7/7.2 MB | 48/126 kB
2026-09-21T13:24:07.5386659Z Progress (2): 2.7/7.2 MB | 48/126 kB
2026-09-21T13:24:07.5387716Z Progress (2): 2.7/7.2 MB | 66/126 kB
2026-09-21T13:24:07.5387911Z Progress (2): 2.8/7.2 MB | 66/126 kB
2026-09-21T13:24:07.5388050Z Progress (2): 2.8/7.2 MB | 98/126 kB
2026-09-21T13:24:07.5388160Z Progress (2): 2.8/7.2 MB | 116/126 kB
2026-09-21T13:24:07.5388562Z Progress (2): 2.8/7.2 MB | 116/126 kB
2026-09-21T13:24:07.5388725Z Progress (2): 2.8/7.2 MB | 126 kB    
2026-09-21T13:24:07.5389766Z Progress (2): 2.8/7.2 MB | 126 kB
2026-09-21T13:24:07.5390876Z Progress (2): 2.8/7.2 MB | 126 kB
2026-09-21T13:24:07.5391298Z Progress (2): 2.8/7.2 MB | 126 kB
2026-09-21T13:24:07.5391483Z Progress (2): 2.8/7.2 MB | 126 kB
2026-09-21T13:24:07.5392664Z Progress (2): 2.8/7.2 MB | 126 kB
2026-09-21T13:24:07.5393045Z Progress (2): 2.8/7.2 MB | 126 kB
2026-09-21T13:24:07.5393546Z Progress (2): 2.9/7.2 MB | 126 kB
2026-09-21T13:24:07.5394014Z Progress (2): 2.9/7.2 MB | 126 kB
2026-09-21T13:24:07.5395087Z Progress (2): 2.9/7.2 MB | 126 kB
2026-09-21T13:24:07.5395422Z Progress (2): 2.9/7.2 MB | 126 kB
2026-09-21T13:24:07.5396489Z Progress (2): 2.9/7.2 MB | 126 kB
2026-09-21T13:24:07.5397535Z Progress (2): 2.9/7.2 MB | 126 kB
2026-09-21T13:24:07.5398172Z Progress (2): 3.0/7.2 MB | 126 kB
2026-09-21T13:24:07.5398358Z Progress (2): 3.0/7.2 MB | 126 kB
2026-09-21T13:24:07.5399935Z Progress (2): 3.0/7.2 MB | 126 kB
2026-09-21T13:24:07.5400684Z Progress (2): 3.0/7.2 MB | 126 kB
2026-09-21T13:24:07.5401590Z Progress (2): 3.0/7.2 MB | 126 kB
2026-09-21T13:24:07.5404492Z Progress (2): 3.1/7.2 MB | 126 kB
2026-09-21T13:24:07.5404635Z Progress (2): 3.1/7.2 MB | 126 kB
2026-09-21T13:24:07.5404864Z Progress (2): 3.1/7.2 MB | 126 kB
2026-09-21T13:24:07.5408193Z Progress (2): 3.1/7.2 MB | 126 kB
2026-09-21T13:24:07.5408305Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5408461Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5408615Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5408912Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5409059Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5411423Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5412493Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5414101Z Progress (3): 3.1/7.2 MB | 126 kB | 0/1.4 MB
2026-09-21T13:24:07.5415058Z Progress (3): 3.1/7.2 MB | 126 kB | 0.1/1.4 MB
2026-09-21T13:24:07.5415389Z Progress (3): 3.1/7.2 MB | 126 kB | 0.1/1.4 MB
2026-09-21T13:24:07.5415623Z Progress (3): 3.1/7.2 MB | 126 kB | 0.1/1.4 MB
2026-09-21T13:24:07.5415993Z                                               
2026-09-21T13:24:07.5416575Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7.1/asm-9.7.1.jar (126 kB at 532 kB/s)
2026-09-21T13:24:07.5416942Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy/1.17.8/byte-buddy-1.17.8.jar
2026-09-21T13:24:07.5417155Z Progress (2): 3.1/7.2 MB | 0.1/1.4 MB
2026-09-21T13:24:07.5418378Z Progress (2): 3.1/7.2 MB | 0.1/1.4 MB
2026-09-21T13:24:07.5419252Z Progress (2): 3.1/7.2 MB | 0.1/1.4 MB
2026-09-21T13:24:07.5419614Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5426977Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5427108Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5427258Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5427487Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5427698Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5427895Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5428016Z Progress (2): 3.1/7.2 MB | 0.2/1.4 MB
2026-09-21T13:24:07.5428168Z Progress (2): 3.1/7.2 MB | 0.3/1.4 MB
2026-09-21T13:24:07.5428345Z Progress (2): 3.1/7.2 MB | 0.3/1.4 MB
2026-09-21T13:24:07.5428485Z Progress (2): 3.1/7.2 MB | 0.3/1.4 MB
2026-09-21T13:24:07.5428595Z Progress (3): 3.1/7.2 MB | 0.3/1.4 MB | 3.6/30 kB
2026-09-21T13:24:07.5428753Z Progress (3): 3.1/7.2 MB | 0.3/1.4 MB | 3.6/30 kB
2026-09-21T13:24:07.5428897Z Progress (3): 3.1/7.2 MB | 0.3/1.4 MB | 3.6/30 kB
2026-09-21T13:24:07.5429050Z Progress (3): 3.1/7.2 MB | 0.3/1.4 MB | 3.6/30 kB
2026-09-21T13:24:07.5429197Z Progress (3): 3.1/7.2 MB | 0.3/1.4 MB | 3.6/30 kB
2026-09-21T13:24:07.5429311Z Progress (3): 3.1/7.2 MB | 0.3/1.4 MB | 30 kB    
2026-09-21T13:24:07.5429466Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5429623Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5429782Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5429924Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5430035Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5430182Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5430324Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5430464Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5433402Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5433516Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5433659Z Progress (3): 3.2/7.2 MB | 0.3/1.4 MB | 30 kB
2026-09-21T13:24:07.5433929Z Progress (3): 3.2/7.2 MB | 0.4/1.4 MB | 30 kB
2026-09-21T13:24:07.5434108Z Progress (3): 3.2/7.2 MB | 0.4/1.4 MB | 30 kB
2026-09-21T13:24:07.5434257Z Progress (4): 3.2/7.2 MB | 0.4/1.4 MB | 30 kB | 0.9/122 kB
2026-09-21T13:24:07.5434384Z Progress (4): 3.2/7.2 MB | 0.4/1.4 MB | 30 kB | 0.9/122 kB
2026-09-21T13:24:07.5434548Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 0.9/122 kB
2026-09-21T13:24:07.5434707Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 33/122 kB 
2026-09-21T13:24:07.5434868Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 33/122 kB
2026-09-21T13:24:07.5435020Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 33/122 kB
2026-09-21T13:24:07.5435165Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 33/122 kB
2026-09-21T13:24:07.5438660Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 33/122 kB
2026-09-21T13:24:07.5438901Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 33/122 kB
2026-09-21T13:24:07.5444918Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 33/122 kB
2026-09-21T13:24:07.5445071Z Progress (4): 3.3/7.2 MB | 0.4/1.4 MB | 30 kB | 45/122 kB
2026-09-21T13:24:07.5445190Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 45/122 kB
2026-09-21T13:24:07.5445340Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 45/122 kB
2026-09-21T13:24:07.5445491Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 64/122 kB
2026-09-21T13:24:07.5445645Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 64/122 kB
2026-09-21T13:24:07.5445808Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 66/122 kB
2026-09-21T13:24:07.5445976Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 66/122 kB
2026-09-21T13:24:07.5446124Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 66/122 kB
2026-09-21T13:24:07.5446274Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 66/122 kB
2026-09-21T13:24:07.5446443Z Progress (4): 3.3/7.2 MB | 0.5/1.4 MB | 30 kB | 66/122 kB
2026-09-21T13:24:07.5446599Z Progress (4): 3.4/7.2 MB | 0.5/1.4 MB | 30 kB | 66/122 kB
2026-09-21T13:24:07.5446715Z Progress (4): 3.4/7.2 MB | 0.5/1.4 MB | 30 kB | 98/122 kB
2026-09-21T13:24:07.5446862Z Progress (4): 3.4/7.2 MB | 0.5/1.4 MB | 30 kB | 98/122 kB
2026-09-21T13:24:07.5447015Z Progress (4): 3.4/7.2 MB | 0.6/1.4 MB | 30 kB | 98/122 kB
2026-09-21T13:24:07.5447179Z Progress (4): 3.4/7.2 MB | 0.6/1.4 MB | 30 kB | 122 kB   
2026-09-21T13:24:07.5447373Z Progress (4): 3.4/7.2 MB | 0.6/1.4 MB | 30 kB | 122 kB
2026-09-21T13:24:07.5447566Z Progress (4): 3.4/7.2 MB | 0.6/1.4 MB | 30 kB | 122 kB
2026-09-21T13:24:07.5447810Z Progress (4): 3.4/7.2 MB | 0.6/1.4 MB | 30 kB | 122 kB
2026-09-21T13:24:07.5448798Z Progress (4): 3.4/7.2 MB | 0.6/1.4 MB | 30 kB | 122 kB
2026-09-21T13:24:07.5448970Z Progress (5): 3.4/7.2 MB | 0.6/1.4 MB | 30 kB | 122 kB | 0/9.0 MB
2026-09-21T13:24:07.5449136Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0/9.0 MB
2026-09-21T13:24:07.5449265Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0/9.0 MB
2026-09-21T13:24:07.5449424Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0/9.0 MB
2026-09-21T13:24:07.5449582Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0/9.0 MB
2026-09-21T13:24:07.5449755Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0/9.0 MB
2026-09-21T13:24:07.5450835Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0/9.0 MB
2026-09-21T13:24:07.5451001Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5451131Z Progress (5): 3.4/7.2 MB | 0.7/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5451323Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5451492Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5451658Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5451810Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5451936Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5452109Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5452934Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5453097Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.1/9.0 MB
2026-09-21T13:24:07.5454029Z Progress (5): 3.4/7.2 MB | 0.8/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5454321Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5454870Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5455036Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5455768Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5456023Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5457588Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5459207Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5459334Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5460188Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.2/9.0 MB
2026-09-21T13:24:07.5460358Z Progress (5): 3.4/7.2 MB | 0.9/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5460540Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5460702Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5460830Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5461052Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5461838Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5462008Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5462194Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5462713Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.3/9.0 MB
2026-09-21T13:24:07.5463238Z Progress (5): 3.4/7.2 MB | 1.0/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5464466Z Progress (5): 3.4/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5464658Z Progress (5): 3.4/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5464829Z Progress (5): 3.4/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5465320Z Progress (5): 3.4/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5465465Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5465633Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5465798Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5470390Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5470609Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5470831Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5470958Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5471120Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5471281Z Progress (5): 3.5/7.2 MB | 1.1/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5471440Z Progress (5): 3.5/7.2 MB | 1.2/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5471600Z Progress (5): 3.5/7.2 MB | 1.2/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5471727Z Progress (5): 3.5/7.2 MB | 1.2/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5471886Z Progress (5): 3.5/7.2 MB | 1.2/1.4 MB | 30 kB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5472029Z                                                                    
2026-09-21T13:24:07.5472492Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/accessors-smart/2.5.2/accessors-smart-2.5.2.jar (30 kB at 125 kB/s)
2026-09-21T13:24:07.5472844Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.jar
2026-09-21T13:24:07.5473051Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5473178Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.4/9.0 MB
2026-09-21T13:24:07.5473338Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5473506Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5473661Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5473887Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5474018Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5474191Z Progress (4): 3.5/7.2 MB | 1.2/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5474475Z Progress (4): 3.5/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5474626Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5475704Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5475832Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5475988Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5476149Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5476305Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5476533Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.5/9.0 MB
2026-09-21T13:24:07.5476650Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5476804Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5476979Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5477183Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5477334Z Progress (4): 3.6/7.2 MB | 1.3/1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5477452Z Progress (4): 3.6/7.2 MB | 1.4/1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5477797Z Progress (4): 3.6/7.2 MB | 1.4/1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5477956Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.6/9.0 MB    
2026-09-21T13:24:07.5478128Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5481341Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5481507Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5482025Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.6/9.0 MB
2026-09-21T13:24:07.5482466Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.7/9.0 MB
2026-09-21T13:24:07.5483450Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.7/9.0 MB
2026-09-21T13:24:07.5484548Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.7/9.0 MB
2026-09-21T13:24:07.5484694Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.7/9.0 MB
2026-09-21T13:24:07.5485605Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.7/9.0 MB
2026-09-21T13:24:07.5486384Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.7/9.0 MB
2026-09-21T13:24:07.5487429Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.8/9.0 MB
2026-09-21T13:24:07.5487990Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.8/9.0 MB
2026-09-21T13:24:07.5488177Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.8/9.0 MB
2026-09-21T13:24:07.5488916Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.8/9.0 MB
2026-09-21T13:24:07.5489161Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.8/9.0 MB
2026-09-21T13:24:07.5489898Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.8/9.0 MB
2026-09-21T13:24:07.5490054Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5490877Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5491583Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5492684Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5492928Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5494671Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5495262Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5496003Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5496174Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 0.9/9.0 MB
2026-09-21T13:24:07.5497217Z Progress (4): 3.6/7.2 MB | 1.4 MB | 122 kB | 1.0/9.0 MB
2026-09-21T13:24:07.5497800Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.0/9.0 MB
2026-09-21T13:24:07.5499087Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.0/9.0 MB
2026-09-21T13:24:07.5499249Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.0/9.0 MB
2026-09-21T13:24:07.5499847Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.0/9.0 MB
2026-09-21T13:24:07.5500402Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5500639Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5500834Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5501108Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5501811Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5508428Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5508595Z Progress (4): 3.7/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5508726Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5508883Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5509109Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5509262Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5509437Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.1/9.0 MB
2026-09-21T13:24:07.5509553Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5509705Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5509859Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5510010Z Progress (4): 3.8/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5510157Z Progress (4): 3.9/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5510270Z Progress (4): 3.9/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5510419Z Progress (4): 3.9/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5510638Z Progress (4): 3.9/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5510798Z Progress (4): 3.9/7.2 MB | 1.4 MB | 122 kB | 1.2/9.0 MB
2026-09-21T13:24:07.5510955Z                                                        
2026-09-21T13:24:07.5511329Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/minidev/json-smart/2.5.2/json-smart-2.5.2.jar (122 kB at 497 kB/s)
2026-09-21T13:24:07.5511717Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hamcrest/hamcrest/3.0/hamcrest-3.0.jar
2026-09-21T13:24:07.5513677Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/assertj/assertj-core/3.27.7/assertj-core-3.27.7.jar (1.4 MB at 5.7 MB/s)
2026-09-21T13:24:07.5514323Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter/5.12.2/junit-jupiter-5.12.2.jar
2026-09-21T13:24:07.5514539Z Progress (2): 3.9/7.2 MB | 1.2/9.0 MB
2026-09-21T13:24:07.5515404Z Progress (2): 3.9/7.2 MB | 1.3/9.0 MB
2026-09-21T13:24:07.5516092Z Progress (2): 3.9/7.2 MB | 1.3/9.0 MB
2026-09-21T13:24:07.5516838Z Progress (2): 3.9/7.2 MB | 1.3/9.0 MB
2026-09-21T13:24:07.5517104Z Progress (2): 3.9/7.2 MB | 1.3/9.0 MB
2026-09-21T13:24:07.5517250Z Progress (2): 3.9/7.2 MB | 1.3/9.0 MB
2026-09-21T13:24:07.5517419Z Progress (2): 4.0/7.2 MB | 1.3/9.0 MB
2026-09-21T13:24:07.5518396Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5519130Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5519289Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5519712Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5521163Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5521308Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5521483Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5522699Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5522842Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5524600Z Progress (2): 4.0/7.2 MB | 1.4/9.0 MB
2026-09-21T13:24:07.5524921Z Progress (2): 4.0/7.2 MB | 1.5/9.0 MB
2026-09-21T13:24:07.5525138Z Progress (2): 4.0/7.2 MB | 1.5/9.0 MB
2026-09-21T13:24:07.5526972Z Progress (2): 4.0/7.2 MB | 1.5/9.0 MB
2026-09-21T13:24:07.5528064Z Progress (2): 4.0/7.2 MB | 1.5/9.0 MB
2026-09-21T13:24:07.5529033Z Progress (2): 4.0/7.2 MB | 1.5/9.0 MB
2026-09-21T13:24:07.5530108Z Progress (2): 4.0/7.2 MB | 1.6/9.0 MB
2026-09-21T13:24:07.5531107Z Progress (2): 4.0/7.2 MB | 1.6/9.0 MB
2026-09-21T13:24:07.5532151Z Progress (2): 4.0/7.2 MB | 1.6/9.0 MB
2026-09-21T13:24:07.5533065Z Progress (2): 4.0/7.2 MB | 1.7/9.0 MB
2026-09-21T13:24:07.5533511Z Progress (2): 4.0/7.2 MB | 1.7/9.0 MB
2026-09-21T13:24:07.5534778Z Progress (2): 4.0/7.2 MB | 1.7/9.0 MB
2026-09-21T13:24:07.5535004Z Progress (2): 4.0/7.2 MB | 1.7/9.0 MB
2026-09-21T13:24:07.5535140Z Progress (2): 4.0/7.2 MB | 1.7/9.0 MB
2026-09-21T13:24:07.5535887Z Progress (2): 4.0/7.2 MB | 1.7/9.0 MB
2026-09-21T13:24:07.5536255Z Progress (2): 4.0/7.2 MB | 1.7/9.0 MB
2026-09-21T13:24:07.5537108Z Progress (2): 4.0/7.2 MB | 1.8/9.0 MB
2026-09-21T13:24:07.5537759Z Progress (2): 4.0/7.2 MB | 1.8/9.0 MB
2026-09-21T13:24:07.5538369Z Progress (2): 4.0/7.2 MB | 1.8/9.0 MB
2026-09-21T13:24:07.5538895Z Progress (2): 4.0/7.2 MB | 1.8/9.0 MB
2026-09-21T13:24:07.5539479Z Progress (2): 4.0/7.2 MB | 1.8/9.0 MB
2026-09-21T13:24:07.5539859Z Progress (2): 4.0/7.2 MB | 1.8/9.0 MB
2026-09-21T13:24:07.5540836Z Progress (2): 4.0/7.2 MB | 1.8/9.0 MB
2026-09-21T13:24:07.5541823Z Progress (2): 4.0/7.2 MB | 1.9/9.0 MB
2026-09-21T13:24:07.5542257Z Progress (2): 4.0/7.2 MB | 1.9/9.0 MB
2026-09-21T13:24:07.5542594Z Progress (2): 4.0/7.2 MB | 1.9/9.0 MB
2026-09-21T13:24:07.5543112Z Progress (2): 4.0/7.2 MB | 1.9/9.0 MB
2026-09-21T13:24:07.5544246Z Progress (2): 4.0/7.2 MB | 1.9/9.0 MB
2026-09-21T13:24:07.5544406Z Progress (2): 4.0/7.2 MB | 2.0/9.0 MB
2026-09-21T13:24:07.5544549Z Progress (2): 4.0/7.2 MB | 2.0/9.0 MB
2026-09-21T13:24:07.5544921Z Progress (2): 4.0/7.2 MB | 2.0/9.0 MB
2026-09-21T13:24:07.5545075Z Progress (2): 4.0/7.2 MB | 2.0/9.0 MB
2026-09-21T13:24:07.5546330Z Progress (2): 4.0/7.2 MB | 2.0/9.0 MB
2026-09-21T13:24:07.5546838Z Progress (2): 4.0/7.2 MB | 2.0/9.0 MB
2026-09-21T13:24:07.5548233Z Progress (2): 4.0/7.2 MB | 2.0/9.0 MB
2026-09-21T13:24:07.5548391Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5548592Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5549510Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5550803Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5551194Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5552063Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5552325Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5553520Z Progress (2): 4.0/7.2 MB | 2.1/9.0 MB
2026-09-21T13:24:07.5553664Z Progress (2): 4.0/7.2 MB | 2.2/9.0 MB
2026-09-21T13:24:07.5554504Z Progress (2): 4.0/7.2 MB | 2.2/9.0 MB
2026-09-21T13:24:07.5554988Z Progress (2): 4.0/7.2 MB | 2.2/9.0 MB
2026-09-21T13:24:07.5557214Z Progress (2): 4.0/7.2 MB | 2.2/9.0 MB
2026-09-21T13:24:07.5557328Z Progress (2): 4.0/7.2 MB | 2.2/9.0 MB
2026-09-21T13:24:07.5557524Z Progress (2): 4.0/7.2 MB | 2.2/9.0 MB
2026-09-21T13:24:07.5557775Z Progress (2): 4.0/7.2 MB | 2.2/9.0 MB
2026-09-21T13:24:07.5558901Z Progress (2): 4.0/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5559087Z Progress (2): 4.0/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5559193Z Progress (2): 4.0/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5559695Z Progress (2): 4.1/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5560127Z Progress (2): 4.1/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5560683Z Progress (2): 4.1/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5561042Z Progress (2): 4.1/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5561868Z Progress (2): 4.1/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5562107Z Progress (2): 4.2/7.2 MB | 2.3/9.0 MB
2026-09-21T13:24:07.5562255Z Progress (2): 4.2/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5564019Z Progress (2): 4.2/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5564167Z Progress (2): 4.2/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5566810Z Progress (2): 4.2/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5566946Z Progress (2): 4.2/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5567281Z Progress (2): 4.2/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5568160Z Progress (2): 4.2/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5568425Z Progress (2): 4.3/7.2 MB | 2.4/9.0 MB
2026-09-21T13:24:07.5568727Z Progress (2): 4.3/7.2 MB | 2.5/9.0 MB
2026-09-21T13:24:07.5569407Z Progress (2): 4.3/7.2 MB | 2.5/9.0 MB
2026-09-21T13:24:07.5570493Z Progress (2): 4.3/7.2 MB | 2.5/9.0 MB
2026-09-21T13:24:07.5571496Z Progress (2): 4.3/7.2 MB | 2.5/9.0 MB
2026-09-21T13:24:07.5571701Z Progress (2): 4.3/7.2 MB | 2.5/9.0 MB
2026-09-21T13:24:07.5574468Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5574989Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5575208Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5575721Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5576035Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5576361Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5576635Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5577699Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5578501Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5578680Z Progress (2): 4.3/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5579007Z Progress (2): 4.4/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5579879Z Progress (2): 4.4/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5580052Z Progress (2): 4.4/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5580441Z Progress (2): 4.4/7.2 MB | 2.6/9.0 MB
2026-09-21T13:24:07.5580818Z Progress (2): 4.4/7.2 MB | 2.7/9.0 MB
2026-09-21T13:24:07.5580934Z Progress (2): 4.4/7.2 MB | 2.7/9.0 MB
2026-09-21T13:24:07.5581390Z Progress (2): 4.4/7.2 MB | 2.7/9.0 MB
2026-09-21T13:24:07.5582583Z Progress (2): 4.4/7.2 MB | 2.7/9.0 MB
2026-09-21T13:24:07.5584823Z Progress (2): 4.4/7.2 MB | 2.7/9.0 MB
2026-09-21T13:24:07.5584986Z Progress (2): 4.4/7.2 MB | 2.8/9.0 MB
2026-09-21T13:24:07.5585425Z Progress (2): 4.4/7.2 MB | 2.8/9.0 MB
2026-09-21T13:24:07.5585931Z Progress (2): 4.4/7.2 MB | 2.8/9.0 MB
2026-09-21T13:24:07.5586563Z Progress (2): 4.4/7.2 MB | 2.8/9.0 MB
2026-09-21T13:24:07.5587159Z Progress (2): 4.4/7.2 MB | 2.9/9.0 MB
2026-09-21T13:24:07.5588694Z Progress (2): 4.4/7.2 MB | 2.9/9.0 MB
2026-09-21T13:24:07.5589084Z Progress (2): 4.4/7.2 MB | 2.9/9.0 MB
2026-09-21T13:24:07.5590422Z Progress (2): 4.4/7.2 MB | 2.9/9.0 MB
2026-09-21T13:24:07.5591391Z Progress (2): 4.4/7.2 MB | 2.9/9.0 MB
2026-09-21T13:24:07.5591672Z Progress (2): 4.4/7.2 MB | 3.0/9.0 MB
2026-09-21T13:24:07.5592395Z Progress (2): 4.4/7.2 MB | 3.0/9.0 MB
2026-09-21T13:24:07.5592685Z Progress (2): 4.4/7.2 MB | 3.0/9.0 MB
2026-09-21T13:24:07.5593650Z Progress (2): 4.4/7.2 MB | 3.0/9.0 MB
2026-09-21T13:24:07.5594407Z Progress (2): 4.4/7.2 MB | 3.0/9.0 MB
2026-09-21T13:24:07.5594560Z Progress (3): 4.4/7.2 MB | 3.0/9.0 MB | 6.4 kB
2026-09-21T13:24:07.5594708Z Progress (3): 4.4/7.2 MB | 3.0/9.0 MB | 6.4 kB
2026-09-21T13:24:07.5601571Z Progress (3): 4.4/7.2 MB | 3.1/9.0 MB | 6.4 kB
2026-09-21T13:24:07.5601840Z Progress (3): 4.4/7.2 MB | 3.1/9.0 MB | 6.4 kB
2026-09-21T13:24:07.5602651Z Progress (3): 4.4/7.2 MB | 3.1/9.0 MB | 6.4 kB
2026-09-21T13:24:07.5603013Z Progress (4): 4.4/7.2 MB | 3.1/9.0 MB | 6.4 kB | 0.9/97 kB
2026-09-21T13:24:07.5603411Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 0.9/97 kB
2026-09-21T13:24:07.5604041Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 17/97 kB 
2026-09-21T13:24:07.5604210Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 17/97 kB
2026-09-21T13:24:07.5604533Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 32/97 kB
2026-09-21T13:24:07.5605792Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 32/97 kB
2026-09-21T13:24:07.5605962Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 32/97 kB
2026-09-21T13:24:07.5606130Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 59/97 kB
2026-09-21T13:24:07.5606250Z Progress (4): 4.4/7.2 MB | 3.2/9.0 MB | 6.4 kB | 70/97 kB
2026-09-21T13:24:07.5606405Z Progress (4): 4.4/7.2 MB | 3.3/9.0 MB | 6.4 kB | 70/97 kB
2026-09-21T13:24:07.5612841Z Progress (4): 4.5/7.2 MB | 3.3/9.0 MB | 6.4 kB | 70/97 kB
2026-09-21T13:24:07.5613023Z Progress (4): 4.5/7.2 MB | 3.3/9.0 MB | 6.4 kB | 70/97 kB
2026-09-21T13:24:07.5613173Z Progress (4): 4.5/7.2 MB | 3.3/9.0 MB | 6.4 kB | 70/97 kB
2026-09-21T13:24:07.5613288Z Progress (4): 4.5/7.2 MB | 3.3/9.0 MB | 6.4 kB | 97 kB   
2026-09-21T13:24:07.5613439Z Progress (4): 4.5/7.2 MB | 3.3/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5613671Z Progress (4): 4.5/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5613901Z Progress (4): 4.5/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5614056Z Progress (4): 4.5/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5614173Z Progress (4): 4.5/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5614323Z Progress (4): 4.5/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5614471Z Progress (4): 4.6/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5614642Z Progress (4): 4.6/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5614788Z Progress (4): 4.6/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5614952Z Progress (4): 4.6/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5615100Z Progress (4): 4.6/7.2 MB | 3.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5615261Z Progress (4): 4.6/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5615413Z Progress (4): 4.6/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5615904Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5616275Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5617857Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5618159Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5618419Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5618917Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5619082Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5619851Z Progress (4): 4.7/7.2 MB | 3.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5620105Z Progress (4): 4.7/7.2 MB | 3.6/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5621234Z Progress (4): 4.7/7.2 MB | 3.6/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5622034Z Progress (4): 4.7/7.2 MB | 3.6/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5622191Z Progress (4): 4.7/7.2 MB | 3.6/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5622747Z Progress (4): 4.7/7.2 MB | 3.6/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5622956Z Progress (4): 4.7/7.2 MB | 3.6/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5623546Z Progress (4): 4.7/7.2 MB | 3.6/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5624367Z Progress (4): 4.7/7.2 MB | 3.7/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5625042Z Progress (4): 4.7/7.2 MB | 3.7/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5625605Z Progress (4): 4.7/7.2 MB | 3.7/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5626372Z Progress (4): 4.7/7.2 MB | 3.7/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5626566Z Progress (4): 4.7/7.2 MB | 3.7/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5627568Z Progress (4): 4.7/7.2 MB | 3.7/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5629014Z Progress (4): 4.7/7.2 MB | 3.7/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5629246Z Progress (4): 4.7/7.2 MB | 3.8/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5630431Z Progress (4): 4.7/7.2 MB | 3.8/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5633079Z Progress (4): 4.7/7.2 MB | 3.8/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5633251Z Progress (4): 4.7/7.2 MB | 3.8/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5633509Z Progress (4): 4.7/7.2 MB | 3.8/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5633668Z Progress (4): 4.7/7.2 MB | 3.8/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5634907Z Progress (4): 4.7/7.2 MB | 3.8/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5635076Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5636101Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5636756Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5637067Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5637604Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5638206Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5638320Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5638472Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5638676Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5638839Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5639264Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5639422Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5640673Z Progress (4): 4.7/7.2 MB | 3.9/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5641566Z Progress (4): 4.7/7.2 MB | 4.0/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5642067Z Progress (4): 4.7/7.2 MB | 4.0/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5642453Z Progress (4): 4.7/7.2 MB | 4.0/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5643372Z Progress (4): 4.7/7.2 MB | 4.0/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5643688Z Progress (4): 4.7/7.2 MB | 4.0/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5644235Z Progress (4): 4.7/7.2 MB | 4.1/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5644851Z Progress (4): 4.7/7.2 MB | 4.1/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5645241Z Progress (4): 4.7/7.2 MB | 4.1/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5647245Z Progress (4): 4.7/7.2 MB | 4.1/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5648351Z Progress (4): 4.7/7.2 MB | 4.1/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5649253Z Progress (4): 4.7/7.2 MB | 4.2/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5649566Z Progress (4): 4.7/7.2 MB | 4.2/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5650617Z Progress (4): 4.7/7.2 MB | 4.2/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5651176Z Progress (4): 4.7/7.2 MB | 4.2/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5651872Z Progress (4): 4.7/7.2 MB | 4.2/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5652632Z Progress (4): 4.7/7.2 MB | 4.3/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5652902Z Progress (4): 4.7/7.2 MB | 4.3/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5654007Z Progress (4): 4.7/7.2 MB | 4.3/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5654743Z Progress (4): 4.7/7.2 MB | 4.3/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5655350Z Progress (4): 4.7/7.2 MB | 4.3/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5655467Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5656229Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5656564Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5656809Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5663046Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5663235Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5663462Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5663588Z Progress (4): 4.7/7.2 MB | 4.4/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5663754Z Progress (4): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB
2026-09-21T13:24:07.5663987Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 7.7/126 kB
2026-09-21T13:24:07.5664156Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 7.7/126 kB
2026-09-21T13:24:07.5664291Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 7.7/126 kB
2026-09-21T13:24:07.5664452Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 7.7/126 kB
2026-09-21T13:24:07.5664616Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 40/126 kB 
2026-09-21T13:24:07.5664777Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 40/126 kB
2026-09-21T13:24:07.5664935Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 40/126 kB
2026-09-21T13:24:07.5665059Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 73/126 kB
2026-09-21T13:24:07.5665246Z Progress (5): 4.7/7.2 MB | 4.5/9.0 MB | 6.4 kB | 97 kB | 73/126 kB
2026-09-21T13:24:07.5665430Z Progress (5): 4.7/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 73/126 kB
2026-09-21T13:24:07.5665591Z Progress (5): 4.7/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5665748Z Progress (5): 4.7/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5665898Z Progress (5): 4.7/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5666171Z Progress (5): 4.7/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5666348Z Progress (5): 4.8/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5666738Z Progress (5): 4.8/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5667164Z Progress (5): 4.8/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5667490Z Progress (5): 4.8/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5668237Z Progress (5): 4.8/7.2 MB | 4.6/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5668371Z Progress (5): 4.8/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 98/126 kB
2026-09-21T13:24:07.5668583Z Progress (5): 4.8/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB   
2026-09-21T13:24:07.5668748Z Progress (5): 4.8/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5668910Z Progress (5): 4.9/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5669898Z Progress (5): 4.9/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5670225Z Progress (5): 4.9/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5670471Z Progress (5): 4.9/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5671135Z Progress (5): 4.9/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5671356Z Progress (5): 4.9/7.2 MB | 4.7/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5671674Z Progress (5): 4.9/7.2 MB | 4.8/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5675367Z Progress (5): 5.0/7.2 MB | 4.8/9.0 MB | 6.4 kB | 97 kB | 126 kB
2026-09-21T13:24:07.5675517Z                                                                
2026-09-21T13:24:07.5676059Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter/5.12.2/junit-jupiter-5.12.2.jar (6.4 kB at 24 kB/s)
2026-09-21T13:24:07.5676286Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5676428Z                                                       
2026-09-21T13:24:07.5676734Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-api/5.12.2/junit-jupiter-api-5.12.2.jar
2026-09-21T13:24:07.5677016Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5677134Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5677305Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5677461Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5677614Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5677820Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5677977Z Progress (4): 5.0/7.2 MB | 4.8/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5678124Z Progress (4): 5.0/7.2 MB | 4.9/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5678270Z Progress (4): 5.1/7.2 MB | 4.9/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5678424Z Progress (4): 5.1/7.2 MB | 4.9/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5680331Z Progress (4): 5.1/7.2 MB | 4.9/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5680455Z Progress (4): 5.1/7.2 MB | 4.9/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5688453Z Progress (4): 5.1/7.2 MB | 5.0/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5688700Z Progress (4): 5.1/7.2 MB | 5.0/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5688875Z Progress (4): 5.1/7.2 MB | 5.0/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5689030Z Progress (4): 5.1/7.2 MB | 5.1/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5689185Z Progress (4): 5.1/7.2 MB | 5.1/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5689340Z Progress (4): 5.1/7.2 MB | 5.1/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5689464Z Progress (4): 5.1/7.2 MB | 5.1/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5689828Z Progress (4): 5.1/7.2 MB | 5.1/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5689984Z Progress (4): 5.1/7.2 MB | 5.1/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5690133Z Progress (4): 5.1/7.2 MB | 5.1/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5690386Z Progress (4): 5.1/7.2 MB | 5.2/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5690500Z Progress (4): 5.1/7.2 MB | 5.2/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5690647Z Progress (4): 5.1/7.2 MB | 5.2/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5690801Z Progress (4): 5.2/7.2 MB | 5.2/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5690957Z Progress (4): 5.2/7.2 MB | 5.2/9.0 MB | 97 kB | 126 kB
2026-09-21T13:24:07.5691103Z                                                       
2026-09-21T13:24:07.5691507Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.jar (97 kB at 368 kB/s)
2026-09-21T13:24:07.5693112Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar
2026-09-21T13:24:07.5697357Z Progress (3): 5.2/7.2 MB | 5.2/9.0 MB | 126 kB
2026-09-21T13:24:07.5697558Z Progress (3): 5.2/7.2 MB | 5.3/9.0 MB | 126 kB
2026-09-21T13:24:07.5697716Z Progress (3): 5.2/7.2 MB | 5.3/9.0 MB | 126 kB
2026-09-21T13:24:07.5697874Z Progress (3): 5.2/7.2 MB | 5.3/9.0 MB | 126 kB
2026-09-21T13:24:07.5697983Z Progress (3): 5.2/7.2 MB | 5.3/9.0 MB | 126 kB
2026-09-21T13:24:07.5698132Z Progress (3): 5.2/7.2 MB | 5.3/9.0 MB | 126 kB
2026-09-21T13:24:07.5698288Z Progress (3): 5.2/7.2 MB | 5.3/9.0 MB | 126 kB
2026-09-21T13:24:07.5698429Z Progress (3): 5.2/7.2 MB | 5.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5698608Z Progress (3): 5.2/7.2 MB | 5.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5698717Z Progress (3): 5.3/7.2 MB | 5.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5698860Z Progress (3): 5.3/7.2 MB | 5.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5699006Z Progress (3): 5.3/7.2 MB | 5.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5699146Z Progress (3): 5.3/7.2 MB | 5.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5707057Z Progress (3): 5.3/7.2 MB | 5.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5707348Z Progress (3): 5.3/7.2 MB | 5.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5707599Z Progress (3): 5.3/7.2 MB | 5.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5707808Z Progress (3): 5.3/7.2 MB | 5.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5708111Z Progress (3): 5.3/7.2 MB | 5.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5708235Z Progress (3): 5.3/7.2 MB | 5.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5708384Z Progress (3): 5.3/7.2 MB | 5.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5708534Z Progress (3): 5.3/7.2 MB | 5.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5708678Z Progress (3): 5.3/7.2 MB | 5.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5708822Z Progress (3): 5.3/7.2 MB | 5.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5708932Z Progress (3): 5.3/7.2 MB | 5.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5709078Z Progress (3): 5.3/7.2 MB | 5.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5709240Z Progress (3): 5.3/7.2 MB | 5.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5709382Z Progress (3): 5.3/7.2 MB | 5.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5709591Z Progress (3): 5.3/7.2 MB | 5.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5709709Z Progress (3): 5.3/7.2 MB | 5.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5709858Z Progress (3): 5.3/7.2 MB | 5.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5710002Z Progress (3): 5.3/7.2 MB | 5.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5710245Z Progress (3): 5.3/7.2 MB | 5.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5710394Z Progress (3): 5.3/7.2 MB | 5.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5710504Z Progress (3): 5.3/7.2 MB | 5.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5711464Z Progress (3): 5.3/7.2 MB | 5.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5711631Z Progress (3): 5.3/7.2 MB | 5.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5712015Z Progress (3): 5.3/7.2 MB | 5.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5714107Z Progress (3): 5.3/7.2 MB | 5.9/9.0 MB | 126 kB
2026-09-21T13:24:07.5714256Z Progress (3): 5.3/7.2 MB | 5.9/9.0 MB | 126 kB
2026-09-21T13:24:07.5714644Z Progress (3): 5.3/7.2 MB | 5.9/9.0 MB | 126 kB
2026-09-21T13:24:07.5716144Z Progress (3): 5.3/7.2 MB | 5.9/9.0 MB | 126 kB
2026-09-21T13:24:07.5716695Z Progress (3): 5.3/7.2 MB | 6.0/9.0 MB | 126 kB
2026-09-21T13:24:07.5717257Z Progress (3): 5.3/7.2 MB | 6.0/9.0 MB | 126 kB
2026-09-21T13:24:07.5717877Z Progress (3): 5.3/7.2 MB | 6.0/9.0 MB | 126 kB
2026-09-21T13:24:07.5718045Z Progress (4): 5.3/7.2 MB | 6.0/9.0 MB | 126 kB | 7.7/14 kB
2026-09-21T13:24:07.5718214Z Progress (4): 5.3/7.2 MB | 6.0/9.0 MB | 126 kB | 7.7/14 kB
2026-09-21T13:24:07.5718373Z Progress (4): 5.3/7.2 MB | 6.0/9.0 MB | 126 kB | 14 kB    
2026-09-21T13:24:07.5719070Z Progress (4): 5.3/7.2 MB | 6.0/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5719654Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5719934Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5720840Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5721208Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5721718Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5721973Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5722486Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5724682Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5725181Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5726136Z Progress (4): 5.3/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5726262Z Progress (4): 5.4/7.2 MB | 6.1/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5726883Z Progress (4): 5.4/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5727760Z Progress (4): 5.4/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5727919Z Progress (4): 5.4/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5728080Z Progress (4): 5.4/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5729118Z Progress (4): 5.4/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5729611Z Progress (4): 5.4/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5730100Z Progress (4): 5.4/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5730260Z Progress (4): 5.5/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5731094Z Progress (4): 5.5/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5732467Z Progress (4): 5.5/7.2 MB | 6.2/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5733467Z Progress (4): 5.5/7.2 MB | 6.3/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5733643Z Progress (4): 5.5/7.2 MB | 6.3/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5738436Z Progress (4): 5.5/7.2 MB | 6.3/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5738594Z Progress (4): 5.5/7.2 MB | 6.3/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5739280Z Progress (4): 5.5/7.2 MB | 6.3/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5740773Z Progress (4): 5.5/7.2 MB | 6.3/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5742199Z Progress (4): 5.5/7.2 MB | 6.4/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5742625Z Progress (4): 5.5/7.2 MB | 6.4/9.0 MB | 126 kB | 14 kB
2026-09-21T13:24:07.5743026Z                                                       
2026-09-21T13:24:07.5743593Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar (14 kB at 53 kB/s)
2026-09-21T13:24:07.5744054Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.12.2/junit-platform-commons-1.12.2.jar
2026-09-21T13:24:07.5745230Z Progress (3): 5.5/7.2 MB | 6.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5746002Z Progress (3): 5.5/7.2 MB | 6.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5746112Z Progress (3): 5.5/7.2 MB | 6.4/9.0 MB | 126 kB
2026-09-21T13:24:07.5746275Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5746430Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5747233Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5747378Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5747487Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5748075Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5748218Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5749132Z Progress (3): 5.5/7.2 MB | 6.5/9.0 MB | 126 kB
2026-09-21T13:24:07.5749369Z Progress (3): 5.5/7.2 MB | 6.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5750384Z Progress (3): 5.6/7.2 MB | 6.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5750542Z Progress (3): 5.6/7.2 MB | 6.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5750655Z Progress (3): 5.6/7.2 MB | 6.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5751231Z Progress (3): 5.6/7.2 MB | 6.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5751426Z Progress (3): 5.6/7.2 MB | 6.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5752479Z Progress (3): 5.6/7.2 MB | 6.6/9.0 MB | 126 kB
2026-09-21T13:24:07.5752827Z Progress (3): 5.6/7.2 MB | 6.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5753616Z Progress (3): 5.6/7.2 MB | 6.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5753794Z Progress (3): 5.6/7.2 MB | 6.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5754885Z Progress (3): 5.7/7.2 MB | 6.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5755045Z Progress (3): 5.7/7.2 MB | 6.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5755985Z Progress (3): 5.7/7.2 MB | 6.7/9.0 MB | 126 kB
2026-09-21T13:24:07.5756099Z Progress (3): 5.7/7.2 MB | 6.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5756891Z Progress (3): 5.7/7.2 MB | 6.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5758252Z Progress (3): 5.7/7.2 MB | 6.8/9.0 MB | 126 kB
2026-09-21T13:24:07.5758388Z                                               
2026-09-21T13:24:07.5758763Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hamcrest/hamcrest/3.0/hamcrest-3.0.jar (126 kB at 466 kB/s)
2026-09-21T13:24:07.5758964Z Progress (2): 5.7/7.2 MB | 6.8/9.0 MB
2026-09-21T13:24:07.5759064Z                                      
2026-09-21T13:24:07.5759351Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar
2026-09-21T13:24:07.5759566Z Progress (2): 5.7/7.2 MB | 6.9/9.0 MB
2026-09-21T13:24:07.5760620Z Progress (2): 5.7/7.2 MB | 6.9/9.0 MB
2026-09-21T13:24:07.5760769Z Progress (2): 5.7/7.2 MB | 6.9/9.0 MB
2026-09-21T13:24:07.5761035Z Progress (2): 5.7/7.2 MB | 6.9/9.0 MB
2026-09-21T13:24:07.5761865Z Progress (2): 5.7/7.2 MB | 6.9/9.0 MB
2026-09-21T13:24:07.5762478Z Progress (2): 5.7/7.2 MB | 6.9/9.0 MB
2026-09-21T13:24:07.5763646Z Progress (2): 5.7/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5764110Z Progress (2): 5.7/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5764266Z Progress (2): 5.7/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5764613Z Progress (2): 5.7/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5765035Z Progress (2): 5.7/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5765288Z Progress (2): 5.8/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5765732Z Progress (2): 5.8/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5765916Z Progress (2): 5.8/7.2 MB | 7.0/9.0 MB
2026-09-21T13:24:07.5766303Z Progress (2): 5.8/7.2 MB | 7.1/9.0 MB
2026-09-21T13:24:07.5766462Z Progress (2): 5.8/7.2 MB | 7.1/9.0 MB
2026-09-21T13:24:07.5767572Z Progress (2): 5.8/7.2 MB | 7.1/9.0 MB
2026-09-21T13:24:07.5767815Z Progress (2): 5.8/7.2 MB | 7.1/9.0 MB
2026-09-21T13:24:07.5768850Z Progress (2): 5.8/7.2 MB | 7.1/9.0 MB
2026-09-21T13:24:07.5772387Z Progress (2): 5.8/7.2 MB | 7.1/9.0 MB
2026-09-21T13:24:07.5772575Z Progress (2): 5.8/7.2 MB | 7.1/9.0 MB
2026-09-21T13:24:07.5772726Z Progress (2): 5.8/7.2 MB | 7.2/9.0 MB
2026-09-21T13:24:07.5772871Z Progress (2): 5.8/7.2 MB | 7.2/9.0 MB
2026-09-21T13:24:07.5773014Z Progress (2): 5.8/7.2 MB | 7.2/9.0 MB
2026-09-21T13:24:07.5773124Z Progress (2): 5.9/7.2 MB | 7.2/9.0 MB
2026-09-21T13:24:07.5773322Z Progress (3): 5.9/7.2 MB | 7.2/9.0 MB | 7.7/233 kB
2026-09-21T13:24:07.5773491Z Progress (3): 5.9/7.2 MB | 7.2/9.0 MB | 7.7/233 kB
2026-09-21T13:24:07.5775733Z Progress (3): 5.9/7.2 MB | 7.2/9.0 MB | 7.7/233 kB
2026-09-21T13:24:07.5775905Z Progress (3): 5.9/7.2 MB | 7.2/9.0 MB | 7.7/233 kB
2026-09-21T13:24:07.5776432Z Progress (3): 5.9/7.2 MB | 7.2/9.0 MB | 40/233 kB 
2026-09-21T13:24:07.5776594Z Progress (3): 5.9/7.2 MB | 7.3/9.0 MB | 40/233 kB
2026-09-21T13:24:07.5776756Z Progress (3): 5.9/7.2 MB | 7.3/9.0 MB | 73/233 kB
2026-09-21T13:24:07.5777039Z Progress (3): 5.9/7.2 MB | 7.3/9.0 MB | 73/233 kB
2026-09-21T13:24:07.5777190Z Progress (3): 5.9/7.2 MB | 7.3/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5777350Z Progress (3): 5.9/7.2 MB | 7.3/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5777465Z Progress (3): 5.9/7.2 MB | 7.3/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5777615Z Progress (3): 5.9/7.2 MB | 7.3/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5777781Z Progress (3): 6.0/7.2 MB | 7.3/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5778747Z Progress (3): 6.0/7.2 MB | 7.4/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5779873Z Progress (3): 6.0/7.2 MB | 7.4/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5780715Z Progress (3): 6.0/7.2 MB | 7.4/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5780950Z Progress (3): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5781702Z Progress (3): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5781856Z Progress (3): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5782458Z Progress (3): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB
2026-09-21T13:24:07.5782638Z Progress (4): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB | 0.9/6.8 kB
2026-09-21T13:24:07.5782770Z Progress (4): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB | 0.9/6.8 kB
2026-09-21T13:24:07.5782932Z Progress (4): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB | 0.9/6.8 kB
2026-09-21T13:24:07.5784212Z Progress (4): 6.1/7.2 MB | 7.4/9.0 MB | 98/233 kB | 6.8 kB    
2026-09-21T13:24:07.5785043Z Progress (4): 6.1/7.2 MB | 7.5/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5785836Z Progress (4): 6.1/7.2 MB | 7.5/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5786823Z Progress (4): 6.1/7.2 MB | 7.5/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5787734Z Progress (4): 6.1/7.2 MB | 7.6/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5788428Z Progress (4): 6.1/7.2 MB | 7.6/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5790337Z Progress (4): 6.1/7.2 MB | 7.6/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5791107Z Progress (4): 6.1/7.2 MB | 7.6/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5793099Z Progress (4): 6.1/7.2 MB | 7.7/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5794277Z Progress (4): 6.1/7.2 MB | 7.7/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5795231Z Progress (4): 6.1/7.2 MB | 7.7/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5796194Z Progress (4): 6.1/7.2 MB | 7.8/9.0 MB | 98/233 kB | 6.8 kB
2026-09-21T13:24:07.5796393Z Progress (4): 6.1/7.2 MB | 7.8/9.0 MB | 102/233 kB | 6.8 kB
2026-09-21T13:24:07.5796554Z Progress (4): 6.1/7.2 MB | 7.8/9.0 MB | 102/233 kB | 6.8 kB
2026-09-21T13:24:07.5798905Z Progress (4): 6.1/7.2 MB | 7.8/9.0 MB | 104/233 kB | 6.8 kB
2026-09-21T13:24:07.5799093Z Progress (4): 6.1/7.2 MB | 7.8/9.0 MB | 104/233 kB | 6.8 kB
2026-09-21T13:24:07.5799221Z Progress (4): 6.1/7.2 MB | 7.8/9.0 MB | 116/233 kB | 6.8 kB
2026-09-21T13:24:07.5799381Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 116/233 kB | 6.8 kB
2026-09-21T13:24:07.5799579Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 149/233 kB | 6.8 kB
2026-09-21T13:24:07.5799753Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 149/233 kB | 6.8 kB
2026-09-21T13:24:07.5799909Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 149/233 kB | 6.8 kB
2026-09-21T13:24:07.5800032Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 163/233 kB | 6.8 kB
2026-09-21T13:24:07.5800183Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 163/233 kB | 6.8 kB
2026-09-21T13:24:07.5800335Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 163/233 kB | 6.8 kB
2026-09-21T13:24:07.5802693Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 163/233 kB | 6.8 kB
2026-09-21T13:24:07.5802857Z Progress (4): 6.1/7.2 MB | 7.9/9.0 MB | 163/233 kB | 6.8 kB
2026-09-21T13:24:07.5803013Z Progress (4): 6.1/7.2 MB | 8.0/9.0 MB | 163/233 kB | 6.8 kB
2026-09-21T13:24:07.5803133Z Progress (4): 6.1/7.2 MB | 8.0/9.0 MB | 163/233 kB | 6.8 kB
2026-09-21T13:24:07.5803292Z Progress (4): 6.1/7.2 MB | 8.0/9.0 MB | 189/233 kB | 6.8 kB
2026-09-21T13:24:07.5803464Z Progress (4): 6.1/7.2 MB | 8.0/9.0 MB | 189/233 kB | 6.8 kB
2026-09-21T13:24:07.5803619Z Progress (4): 6.1/7.2 MB | 8.0/9.0 MB | 205/233 kB | 6.8 kB
2026-09-21T13:24:07.5803911Z Progress (4): 6.2/7.2 MB | 8.0/9.0 MB | 205/233 kB | 6.8 kB
2026-09-21T13:24:07.5804039Z Progress (4): 6.2/7.2 MB | 8.0/9.0 MB | 205/233 kB | 6.8 kB
2026-09-21T13:24:07.5804207Z Progress (4): 6.2/7.2 MB | 8.0/9.0 MB | 205/233 kB | 6.8 kB
2026-09-21T13:24:07.5804365Z Progress (4): 6.2/7.2 MB | 8.0/9.0 MB | 205/233 kB | 6.8 kB
2026-09-21T13:24:07.5810748Z Progress (4): 6.2/7.2 MB | 8.0/9.0 MB | 205/233 kB | 6.8 kB
2026-09-21T13:24:07.5810918Z Progress (4): 6.2/7.2 MB | 8.0/9.0 MB | 233 kB | 6.8 kB    
2026-09-21T13:24:07.5811089Z Progress (4): 6.2/7.2 MB | 8.1/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5811208Z Progress (4): 6.2/7.2 MB | 8.1/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5811460Z Progress (4): 6.2/7.2 MB | 8.1/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5811619Z Progress (4): 6.3/7.2 MB | 8.1/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5811785Z Progress (4): 6.3/7.2 MB | 8.1/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5811904Z Progress (4): 6.3/7.2 MB | 8.1/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5812056Z Progress (4): 6.3/7.2 MB | 8.1/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5812203Z Progress (4): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5812351Z Progress (4): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5812498Z Progress (4): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5812613Z Progress (4): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5812772Z Progress (4): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5812913Z Progress (4): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB | 6.8 kB
2026-09-21T13:24:07.5813050Z                                                        
2026-09-21T13:24:07.5813552Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar (6.8 kB at 25 kB/s)
2026-09-21T13:24:07.5813772Z Progress (3): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB
2026-09-21T13:24:07.5813945Z Progress (3): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB
2026-09-21T13:24:07.5814081Z                                               
2026-09-21T13:24:07.5814431Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-params/5.12.2/junit-jupiter-params-5.12.2.jar
2026-09-21T13:24:07.5817349Z Progress (3): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB
2026-09-21T13:24:07.5817524Z Progress (3): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB
2026-09-21T13:24:07.5817640Z Progress (3): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB
2026-09-21T13:24:07.5817786Z Progress (3): 6.3/7.2 MB | 8.2/9.0 MB | 233 kB
2026-09-21T13:24:07.5817942Z Progress (3): 6.3/7.2 MB | 8.3/9.0 MB | 233 kB
2026-09-21T13:24:07.5818086Z Progress (3): 6.3/7.2 MB | 8.3/9.0 MB | 233 kB
2026-09-21T13:24:07.5818230Z Progress (3): 6.3/7.2 MB | 8.3/9.0 MB | 233 kB
2026-09-21T13:24:07.5818340Z Progress (3): 6.3/7.2 MB | 8.3/9.0 MB | 233 kB
2026-09-21T13:24:07.5818484Z Progress (3): 6.3/7.2 MB | 8.3/9.0 MB | 233 kB
2026-09-21T13:24:07.5819040Z Progress (3): 6.3/7.2 MB | 8.4/9.0 MB | 233 kB
2026-09-21T13:24:07.5819256Z Progress (3): 6.3/7.2 MB | 8.4/9.0 MB | 233 kB
2026-09-21T13:24:07.5821180Z Progress (3): 6.3/7.2 MB | 8.4/9.0 MB | 233 kB
2026-09-21T13:24:07.5822230Z Progress (3): 6.3/7.2 MB | 8.4/9.0 MB | 233 kB
2026-09-21T13:24:07.5822655Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5823694Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5825644Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5826159Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5826748Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5826900Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5827030Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5827517Z Progress (3): 6.3/7.2 MB | 8.5/9.0 MB | 233 kB
2026-09-21T13:24:07.5827839Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5828650Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5828821Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5829111Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5829415Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5829935Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5831084Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5831234Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5831378Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5831548Z Progress (3): 6.3/7.2 MB | 8.6/9.0 MB | 233 kB
2026-09-21T13:24:07.5831820Z Progress (3): 6.3/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5831934Z Progress (3): 6.3/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5832172Z Progress (3): 6.3/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5833159Z Progress (3): 6.3/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5833488Z Progress (3): 6.3/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5833649Z Progress (3): 6.3/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5834210Z Progress (3): 6.4/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5834922Z Progress (3): 6.4/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5835113Z Progress (3): 6.4/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5835224Z Progress (3): 6.4/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5837892Z Progress (3): 6.4/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5839568Z Progress (3): 6.4/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5839737Z Progress (3): 6.5/7.2 MB | 8.7/9.0 MB | 233 kB
2026-09-21T13:24:07.5839892Z Progress (3): 6.5/7.2 MB | 8.8/9.0 MB | 233 kB
2026-09-21T13:24:07.5840421Z Progress (3): 6.5/7.2 MB | 8.8/9.0 MB | 233 kB
2026-09-21T13:24:07.5840536Z Progress (3): 6.5/7.2 MB | 8.8/9.0 MB | 233 kB
2026-09-21T13:24:07.5840888Z Progress (3): 6.5/7.2 MB | 8.8/9.0 MB | 233 kB
2026-09-21T13:24:07.5842786Z Progress (3): 6.5/7.2 MB | 8.8/9.0 MB | 233 kB
2026-09-21T13:24:07.5843260Z Progress (3): 6.5/7.2 MB | 8.9/9.0 MB | 233 kB
2026-09-21T13:24:07.5843656Z Progress (3): 6.5/7.2 MB | 8.9/9.0 MB | 233 kB
2026-09-21T13:24:07.5845128Z Progress (3): 6.5/7.2 MB | 8.9/9.0 MB | 233 kB
2026-09-21T13:24:07.5845841Z Progress (3): 6.5/7.2 MB | 8.9/9.0 MB | 233 kB
2026-09-21T13:24:07.5846771Z Progress (3): 6.5/7.2 MB | 8.9/9.0 MB | 233 kB
2026-09-21T13:24:07.5847910Z Progress (3): 6.5/7.2 MB | 9.0/9.0 MB | 233 kB
2026-09-21T13:24:07.5849080Z Progress (3): 6.5/7.2 MB | 9.0/9.0 MB | 233 kB
2026-09-21T13:24:07.5849229Z Progress (3): 6.5/7.2 MB | 9.0/9.0 MB | 233 kB
2026-09-21T13:24:07.5875314Z Progress (3): 6.5/7.2 MB | 9.0 MB | 233 kB    
2026-09-21T13:24:07.5875631Z Progress (3): 6.5/7.2 MB | 9.0 MB | 233 kB
2026-09-21T13:24:07.5876102Z                                           
2026-09-21T13:24:07.5876570Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy/1.17.8/byte-buddy-1.17.8.jar (9.0 MB at 32 MB/s)
2026-09-21T13:24:07.5876794Z Progress (2): 6.5/7.2 MB | 233 kB
2026-09-21T13:24:07.5876891Z                                  
2026-09-21T13:24:07.5877202Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-engine/5.12.2/junit-jupiter-engine-5.12.2.jar
2026-09-21T13:24:07.5889489Z Progress (2): 6.6/7.2 MB | 233 kB
2026-09-21T13:24:07.5889705Z Progress (2): 6.6/7.2 MB | 233 kB
2026-09-21T13:24:07.5889934Z Progress (2): 6.6/7.2 MB | 233 kB
2026-09-21T13:24:07.5890085Z Progress (2): 6.7/7.2 MB | 233 kB
2026-09-21T13:24:07.5890195Z Progress (3): 6.7/7.2 MB | 233 kB | 7.7/152 kB
2026-09-21T13:24:07.5890344Z Progress (3): 6.7/7.2 MB | 233 kB | 7.7/152 kB
2026-09-21T13:24:07.5890496Z Progress (3): 6.7/7.2 MB | 233 kB | 7.7/152 kB
2026-09-21T13:24:07.5890657Z Progress (3): 6.7/7.2 MB | 233 kB | 40/152 kB 
2026-09-21T13:24:07.5890758Z                                              
2026-09-21T13:24:07.5891254Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-api/5.12.2/junit-jupiter-api-5.12.2.jar (233 kB at 822 kB/s)
2026-09-21T13:24:07.5891724Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.12.2/junit-platform-engine-1.12.2.jar
2026-09-21T13:24:07.5891934Z Progress (2): 6.8/7.2 MB | 40/152 kB
2026-09-21T13:24:07.5892116Z Progress (2): 6.8/7.2 MB | 73/152 kB
2026-09-21T13:24:07.5892252Z Progress (2): 6.8/7.2 MB | 98/152 kB
2026-09-21T13:24:07.5903518Z Progress (2): 6.8/7.2 MB | 98/152 kB
2026-09-21T13:24:07.5903756Z Progress (2): 6.8/7.2 MB | 102/152 kB
2026-09-21T13:24:07.5903969Z Progress (2): 6.8/7.2 MB | 122/152 kB
2026-09-21T13:24:07.5904602Z Progress (2): 6.8/7.2 MB | 130/152 kB
2026-09-21T13:24:07.5918914Z Progress (2): 6.8/7.2 MB | 152 kB    
2026-09-21T13:24:07.5919057Z Progress (2): 6.8/7.2 MB | 152 kB
2026-09-21T13:24:07.5920037Z Progress (2): 6.8/7.2 MB | 152 kB
2026-09-21T13:24:07.5920999Z Progress (2): 6.8/7.2 MB | 152 kB
2026-09-21T13:24:07.5922218Z Progress (2): 6.9/7.2 MB | 152 kB
2026-09-21T13:24:07.5923191Z Progress (2): 6.9/7.2 MB | 152 kB
2026-09-21T13:24:07.5923993Z Progress (2): 6.9/7.2 MB | 152 kB
2026-09-21T13:24:07.5924451Z Progress (2): 6.9/7.2 MB | 152 kB
2026-09-21T13:24:07.5924598Z Progress (2): 7.0/7.2 MB | 152 kB
2026-09-21T13:24:07.5925161Z Progress (2): 7.0/7.2 MB | 152 kB
2026-09-21T13:24:07.5925301Z Progress (2): 7.0/7.2 MB | 152 kB
2026-09-21T13:24:07.5927371Z Progress (2): 7.0/7.2 MB | 152 kB
2026-09-21T13:24:07.5928129Z Progress (2): 7.0/7.2 MB | 152 kB
2026-09-21T13:24:07.5928357Z Progress (2): 7.0/7.2 MB | 152 kB
2026-09-21T13:24:07.5947681Z Progress (2): 7.0/7.2 MB | 152 kB
2026-09-21T13:24:07.5949044Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.5949489Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.5950405Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.5950646Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.5950787Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.5951040Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.5951563Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.5952110Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.6137932Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.6139278Z Progress (2): 7.1/7.2 MB | 152 kB
2026-09-21T13:24:07.6139389Z Progress (2): 7.2/7.2 MB | 152 kB
2026-09-21T13:24:07.6139561Z Progress (2): 7.2/7.2 MB | 152 kB
2026-09-21T13:24:07.6139701Z Progress (2): 7.2/7.2 MB | 152 kB
2026-09-21T13:24:07.6139865Z Progress (2): 7.2/7.2 MB | 152 kB
2026-09-21T13:24:07.6140001Z Progress (2): 7.2 MB | 152 kB    
2026-09-21T13:24:07.6140107Z Progress (3): 7.2 MB | 152 kB | 3.6/602 kB
2026-09-21T13:24:07.6140260Z Progress (3): 7.2 MB | 152 kB | 36/602 kB 
2026-09-21T13:24:07.6140412Z Progress (3): 7.2 MB | 152 kB | 69/602 kB
2026-09-21T13:24:07.6140690Z Progress (3): 7.2 MB | 152 kB | 98/602 kB
2026-09-21T13:24:07.6140841Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 2.3/256 kB
2026-09-21T13:24:07.6140965Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 33/256 kB 
2026-09-21T13:24:07.6141132Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 40/256 kB
2026-09-21T13:24:07.6141298Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 48/256 kB
2026-09-21T13:24:07.6141457Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 51/256 kB
2026-09-21T13:24:07.6141609Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 66/256 kB
2026-09-21T13:24:07.6141723Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 93/256 kB
2026-09-21T13:24:07.6141872Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 98/256 kB
2026-09-21T13:24:07.6142035Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 102/256 kB
2026-09-21T13:24:07.6142209Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 111/256 kB
2026-09-21T13:24:07.6142328Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 113/256 kB
2026-09-21T13:24:07.6142528Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 126/256 kB
2026-09-21T13:24:07.6142680Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 131/256 kB
2026-09-21T13:24:07.6142833Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 137/256 kB
2026-09-21T13:24:07.6142986Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 143/256 kB
2026-09-21T13:24:07.6143267Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 164/256 kB
2026-09-21T13:24:07.6143416Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 175/256 kB
2026-09-21T13:24:07.6143563Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 208/256 kB
2026-09-21T13:24:07.6143714Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 229/256 kB
2026-09-21T13:24:07.6143965Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 246/256 kB
2026-09-21T13:24:07.6144098Z Progress (4): 7.2 MB | 152 kB | 98/602 kB | 256 kB    
2026-09-21T13:24:07.6144250Z Progress (4): 7.2 MB | 152 kB | 131/602 kB | 256 kB
2026-09-21T13:24:07.6144404Z Progress (4): 7.2 MB | 152 kB | 164/602 kB | 256 kB
2026-09-21T13:24:07.6144621Z Progress (4): 7.2 MB | 152 kB | 197/602 kB | 256 kB
2026-09-21T13:24:07.6144754Z                                                    
2026-09-21T13:24:07.6145355Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.12.2/junit-platform-commons-1.12.2.jar (152 kB at 490 kB/s)
2026-09-21T13:24:07.6145602Z Progress (4): 7.2 MB | 197/602 kB | 256 kB | 7.7/292 kB
2026-09-21T13:24:07.6145748Z                                                        
2026-09-21T13:24:07.6146038Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-core/5.17.0/mockito-core-5.17.0.jar
2026-09-21T13:24:07.6146259Z Progress (4): 7.2 MB | 229/602 kB | 256 kB | 7.7/292 kB
2026-09-21T13:24:07.6146410Z Progress (4): 7.2 MB | 229/602 kB | 256 kB | 40/292 kB 
2026-09-21T13:24:07.6146620Z Progress (4): 7.2 MB | 262/602 kB | 256 kB | 40/292 kB
2026-09-21T13:24:07.6146785Z Progress (4): 7.2 MB | 262/602 kB | 256 kB | 73/292 kB
2026-09-21T13:24:07.6147723Z                                                       
2026-09-21T13:24:07.6148070Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/oracle/database/jdbc/ojdbc11/23.5.0.24.07/ojdbc11-23.5.0.24.07.jar (7.2 MB at 23 MB/s)
2026-09-21T13:24:07.6148297Z Progress (3): 262/602 kB | 256 kB | 106/292 kB
2026-09-21T13:24:07.6148402Z                                               
2026-09-21T13:24:07.6148693Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy-agent/1.17.8/byte-buddy-agent-1.17.8.jar
2026-09-21T13:24:07.6148933Z Progress (3): 295/602 kB | 256 kB | 106/292 kB
2026-09-21T13:24:07.6149081Z Progress (3): 295/602 kB | 256 kB | 139/292 kB
2026-09-21T13:24:07.6149223Z Progress (3): 295/602 kB | 256 kB | 172/292 kB
2026-09-21T13:24:07.6149330Z Progress (3): 328/602 kB | 256 kB | 172/292 kB
2026-09-21T13:24:07.6149480Z Progress (3): 328/602 kB | 256 kB | 204/292 kB
2026-09-21T13:24:07.6149628Z Progress (3): 360/602 kB | 256 kB | 204/292 kB
2026-09-21T13:24:07.6149774Z Progress (3): 360/602 kB | 256 kB | 237/292 kB
2026-09-21T13:24:07.6149914Z Progress (3): 393/602 kB | 256 kB | 237/292 kB
2026-09-21T13:24:07.6150156Z Progress (3): 393/602 kB | 256 kB | 270/292 kB
2026-09-21T13:24:07.6151006Z Progress (3): 393/602 kB | 256 kB | 292 kB    
2026-09-21T13:24:07.6151565Z Progress (3): 426/602 kB | 256 kB | 292 kB
2026-09-21T13:24:07.6152540Z Progress (3): 459/602 kB | 256 kB | 292 kB
2026-09-21T13:24:07.6153457Z Progress (3): 492/602 kB | 256 kB | 292 kB
2026-09-21T13:24:07.6154282Z Progress (3): 524/602 kB | 256 kB | 292 kB
2026-09-21T13:24:07.6155601Z Progress (3): 557/602 kB | 256 kB | 292 kB
2026-09-21T13:24:07.6155753Z Progress (3): 590/602 kB | 256 kB | 292 kB
2026-09-21T13:24:07.6168829Z Progress (3): 602 kB | 256 kB | 292 kB    
2026-09-21T13:24:07.6169775Z Progress (4): 602 kB | 256 kB | 292 kB | 2.3/367 kB
2026-09-21T13:24:07.6170019Z Progress (4): 602 kB | 256 kB | 292 kB | 30/367 kB 
2026-09-21T13:24:07.6170717Z Progress (4): 602 kB | 256 kB | 292 kB | 53/367 kB
2026-09-21T13:24:07.6171197Z Progress (4): 602 kB | 256 kB | 292 kB | 72/367 kB
2026-09-21T13:24:07.6171489Z Progress (4): 602 kB | 256 kB | 292 kB | 75/367 kB
2026-09-21T13:24:07.6172346Z Progress (4): 602 kB | 256 kB | 292 kB | 78/367 kB
2026-09-21T13:24:07.6174790Z Progress (4): 602 kB | 256 kB | 292 kB | 81/367 kB
2026-09-21T13:24:07.6176431Z Progress (4): 602 kB | 256 kB | 292 kB | 113/367 kB
2026-09-21T13:24:07.6177823Z Progress (4): 602 kB | 256 kB | 292 kB | 146/367 kB
2026-09-21T13:24:07.6178930Z Progress (4): 602 kB | 256 kB | 292 kB | 179/367 kB
2026-09-21T13:24:07.6180517Z Progress (4): 602 kB | 256 kB | 292 kB | 212/367 kB
2026-09-21T13:24:07.6181673Z Progress (4): 602 kB | 256 kB | 292 kB | 244/367 kB
2026-09-21T13:24:07.6182660Z Progress (4): 602 kB | 256 kB | 292 kB | 277/367 kB
2026-09-21T13:24:07.6183587Z Progress (4): 602 kB | 256 kB | 292 kB | 310/367 kB
2026-09-21T13:24:07.6184401Z Progress (4): 602 kB | 256 kB | 292 kB | 343/367 kB
2026-09-21T13:24:07.6200271Z Progress (4): 602 kB | 256 kB | 292 kB | 367 kB    
2026-09-21T13:24:07.6200415Z                                                
2026-09-21T13:24:07.6200874Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.12.2/junit-platform-engine-1.12.2.jar (256 kB at 812 kB/s)
2026-09-21T13:24:07.6201233Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/objenesis/objenesis/3.3/objenesis-3.3.jar
2026-09-21T13:24:07.6206620Z Progress (4): 602 kB | 292 kB | 367 kB | 2.3/709 kB
2026-09-21T13:24:07.6207925Z Progress (4): 602 kB | 292 kB | 367 kB | 35/709 kB 
2026-09-21T13:24:07.6208378Z Progress (4): 602 kB | 292 kB | 367 kB | 68/709 kB
2026-09-21T13:24:07.6211983Z Progress (4): 602 kB | 292 kB | 367 kB | 98/709 kB
2026-09-21T13:24:07.6212201Z                                                   
2026-09-21T13:24:07.6212567Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/bytebuddy/byte-buddy-agent/1.17.8/byte-buddy-agent-1.17.8.jar (367 kB at 1.2 MB/s)
2026-09-21T13:24:07.6212953Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-junit-jupiter/5.17.0/mockito-junit-jupiter-5.17.0.jar
2026-09-21T13:24:07.6222108Z Progress (4): 602 kB | 292 kB | 98/709 kB | 3.6/49 kB
2026-09-21T13:24:07.6228027Z Progress (4): 602 kB | 292 kB | 98/709 kB | 28/49 kB 
2026-09-21T13:24:07.6228303Z Progress (4): 602 kB | 292 kB | 109/709 kB | 28/49 kB
2026-09-21T13:24:07.6228435Z Progress (4): 602 kB | 292 kB | 109/709 kB | 42/49 kB
2026-09-21T13:24:07.6228636Z Progress (4): 602 kB | 292 kB | 109/709 kB | 49 kB   
2026-09-21T13:24:07.6228785Z Progress (4): 602 kB | 292 kB | 132/709 kB | 49 kB
2026-09-21T13:24:07.6228952Z Progress (4): 602 kB | 292 kB | 137/709 kB | 49 kB
2026-09-21T13:24:07.6229086Z                                                   
2026-09-21T13:24:07.6229413Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-params/5.12.2/junit-jupiter-params-5.12.2.jar (602 kB at 1.9 MB/s)
2026-09-21T13:24:07.6229772Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.jar
2026-09-21T13:24:07.6229973Z Progress (3): 292 kB | 169/709 kB | 49 kB
2026-09-21T13:24:07.6230119Z Progress (3): 292 kB | 202/709 kB | 49 kB
2026-09-21T13:24:07.6248391Z Progress (3): 292 kB | 229/709 kB | 49 kB
2026-09-21T13:24:07.6248568Z                                          
2026-09-21T13:24:07.6248935Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/objenesis/objenesis/3.3/objenesis-3.3.jar (49 kB at 154 kB/s)
2026-09-21T13:24:07.6249354Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar
2026-09-21T13:24:07.6249994Z Progress (2): 292 kB | 235/709 kB
2026-09-21T13:24:07.6250150Z Progress (2): 292 kB | 253/709 kB
2026-09-21T13:24:07.6251097Z Progress (2): 292 kB | 255/709 kB
2026-09-21T13:24:07.6252887Z Progress (2): 292 kB | 262/709 kB
2026-09-21T13:24:07.6254046Z Progress (2): 292 kB | 295/709 kB
2026-09-21T13:24:07.6255311Z Progress (2): 292 kB | 315/709 kB
2026-09-21T13:24:07.6256177Z Progress (2): 292 kB | 348/709 kB
2026-09-21T13:24:07.6258328Z Progress (2): 292 kB | 360/709 kB
2026-09-21T13:24:07.6258477Z                                  
2026-09-21T13:24:07.6258929Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/jupiter/junit-jupiter-engine/5.12.2/junit-jupiter-engine-5.12.2.jar (292 kB at 910 kB/s)
2026-09-21T13:24:07.6259303Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-core/6.2.19/spring-core-6.2.19.jar
2026-09-21T13:24:07.6268353Z Progress (2): 360/709 kB | 2.3/18 kB
2026-09-21T13:24:07.6268791Z Progress (2): 365/709 kB | 2.3/18 kB
2026-09-21T13:24:07.6269075Z Progress (2): 366/709 kB | 2.3/18 kB
2026-09-21T13:24:07.6269254Z Progress (2): 366/709 kB | 18 kB    
2026-09-21T13:24:07.6270679Z Progress (2): 381/709 kB | 18 kB
2026-09-21T13:24:07.6275106Z Progress (2): 397/709 kB | 18 kB
2026-09-21T13:24:07.6275275Z Progress (2): 430/709 kB | 18 kB
2026-09-21T13:24:07.6275420Z Progress (2): 463/709 kB | 18 kB
2026-09-21T13:24:07.6278047Z Progress (2): 492/709 kB | 18 kB
2026-09-21T13:24:07.6279213Z Progress (2): 496/709 kB | 18 kB
2026-09-21T13:24:07.6281495Z Progress (2): 508/709 kB | 18 kB
2026-09-21T13:24:07.6282689Z Progress (2): 526/709 kB | 18 kB
2026-09-21T13:24:07.6283963Z Progress (2): 558/709 kB | 18 kB
2026-09-21T13:24:07.6284838Z Progress (2): 591/709 kB | 18 kB
2026-09-21T13:24:07.6299644Z Progress (2): 623/709 kB | 18 kB
2026-09-21T13:24:07.6299818Z                                 
2026-09-21T13:24:07.6300268Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar (18 kB at 56 kB/s)
2026-09-21T13:24:07.6300653Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jcl/6.2.19/spring-jcl-6.2.19.jar
2026-09-21T13:24:07.6306087Z Progress (1): 627/709 kB
2026-09-21T13:24:07.6307366Z Progress (1): 644/709 kB
2026-09-21T13:24:07.6307783Z Progress (1): 655/709 kB
2026-09-21T13:24:07.6308549Z Progress (1): 688/709 kB
2026-09-21T13:24:07.6318928Z Progress (1): 709 kB    
2026-09-21T13:24:07.6319103Z Progress (2): 709 kB | 7.7/9.4 kB
2026-09-21T13:24:07.6319213Z Progress (2): 709 kB | 9.4 kB    
2026-09-21T13:24:07.6320203Z Progress (3): 709 kB | 9.4 kB | 2.3/31 kB
2026-09-21T13:24:07.6332973Z Progress (3): 709 kB | 9.4 kB | 31 kB    
2026-09-21T13:24:07.6333120Z                                      
2026-09-21T13:24:07.6333439Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-core/5.17.0/mockito-core-5.17.0.jar (709 kB at 2.2 MB/s)
2026-09-21T13:24:07.6333796Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-test/6.2.19/spring-test-6.2.19.jar
2026-09-21T13:24:07.6352097Z Progress (3): 9.4 kB | 31 kB | 0/2.0 MB
2026-09-21T13:24:07.6352255Z Progress (3): 9.4 kB | 31 kB | 0/2.0 MB
2026-09-21T13:24:07.6353444Z Progress (3): 9.4 kB | 31 kB | 0.1/2.0 MB
2026-09-21T13:24:07.6403471Z Progress (3): 9.4 kB | 31 kB | 0.1/2.0 MB
2026-09-21T13:24:07.6403637Z                                          
2026-09-21T13:24:07.6404081Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/mockito/mockito-junit-jupiter/5.17.0/mockito-junit-jupiter-5.17.0.jar (9.4 kB at 28 kB/s)
2026-09-21T13:24:07.6404454Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/xmlunit/xmlunit-core/2.10.4/xmlunit-core-2.10.4.jar
2026-09-21T13:24:07.6407516Z Progress (2): 31 kB | 0.1/2.0 MB
2026-09-21T13:24:07.6408776Z Progress (2): 31 kB | 0.2/2.0 MB
2026-09-21T13:24:07.6409701Z Progress (2): 31 kB | 0.2/2.0 MB
2026-09-21T13:24:07.6410215Z Progress (2): 31 kB | 0.2/2.0 MB
2026-09-21T13:24:07.6411391Z Progress (2): 31 kB | 0.2/2.0 MB
2026-09-21T13:24:07.6413769Z Progress (2): 31 kB | 0.3/2.0 MB
2026-09-21T13:24:07.6414210Z Progress (2): 31 kB | 0.3/2.0 MB
2026-09-21T13:24:07.6415186Z Progress (2): 31 kB | 0.3/2.0 MB
2026-09-21T13:24:07.6418713Z Progress (2): 31 kB | 0.4/2.0 MB
2026-09-21T13:24:07.6418866Z                                 
2026-09-21T13:24:07.6419226Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.jar (31 kB at 92 kB/s)
2026-09-21T13:24:07.6420064Z Progress (2): 0.4/2.0 MB | 0.9/24 kB
2026-09-21T13:24:07.6420204Z                                     
2026-09-21T13:24:07.6420515Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-test/5.2.6/spring-batch-test-5.2.6.jar
2026-09-21T13:24:07.6444357Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6444564Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6445541Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6446070Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6446971Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6447564Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6448137Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6454550Z Progress (2): 0.4/2.0 MB | 24 kB
2026-09-21T13:24:07.6454703Z Progress (2): 0.5/2.0 MB | 24 kB
2026-09-21T13:24:07.6454848Z Progress (2): 0.5/2.0 MB | 24 kB
2026-09-21T13:24:07.6455082Z Progress (2): 0.5/2.0 MB | 24 kB
2026-09-21T13:24:07.6455218Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6455325Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6455481Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6460697Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6460852Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6461279Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6461670Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6461809Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6462135Z Progress (2): 0.6/2.0 MB | 24 kB
2026-09-21T13:24:07.6462790Z Progress (2): 0.7/2.0 MB | 24 kB
2026-09-21T13:24:07.6463898Z Progress (2): 0.7/2.0 MB | 24 kB
2026-09-21T13:24:07.6464860Z Progress (2): 0.7/2.0 MB | 24 kB
2026-09-21T13:24:07.6466901Z Progress (2): 0.7/2.0 MB | 24 kB
2026-09-21T13:24:07.6468034Z Progress (2): 0.7/2.0 MB | 24 kB
2026-09-21T13:24:07.6468537Z Progress (2): 0.7/2.0 MB | 24 kB
2026-09-21T13:24:07.6469459Z Progress (2): 0.7/2.0 MB | 24 kB
2026-09-21T13:24:07.6470186Z Progress (2): 0.8/2.0 MB | 24 kB
2026-09-21T13:24:07.6470929Z Progress (2): 0.8/2.0 MB | 24 kB
2026-09-21T13:24:07.6471524Z Progress (2): 0.8/2.0 MB | 24 kB
2026-09-21T13:24:07.6472257Z Progress (2): 0.8/2.0 MB | 24 kB
2026-09-21T13:24:07.6473489Z Progress (2): 0.8/2.0 MB | 24 kB
2026-09-21T13:24:07.6474294Z Progress (2): 0.9/2.0 MB | 24 kB
2026-09-21T13:24:07.6475091Z Progress (2): 0.9/2.0 MB | 24 kB
2026-09-21T13:24:07.6489543Z Progress (2): 0.9/2.0 MB | 24 kB
2026-09-21T13:24:07.6490208Z Progress (2): 0.9/2.0 MB | 24 kB
2026-09-21T13:24:07.6491378Z Progress (2): 0.9/2.0 MB | 24 kB
2026-09-21T13:24:07.6493555Z Progress (2): 0.9/2.0 MB | 24 kB
2026-09-21T13:24:07.6498665Z Progress (2): 1.0/2.0 MB | 24 kB
2026-09-21T13:24:07.6498999Z Progress (2): 1.0/2.0 MB | 24 kB
2026-09-21T13:24:07.6499415Z Progress (2): 1.0/2.0 MB | 24 kB
2026-09-21T13:24:07.6499813Z                                 
2026-09-21T13:24:07.6500315Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-jcl/6.2.19/spring-jcl-6.2.19.jar (24 kB at 71 kB/s)
2026-09-21T13:24:07.6500766Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/h2database/h2/2.3.232/h2-2.3.232.jar
2026-09-21T13:24:07.6500986Z Progress (2): 1.0/2.0 MB | 2.3/28 kB
2026-09-21T13:24:07.6501136Z Progress (2): 1.1/2.0 MB | 2.3/28 kB
2026-09-21T13:24:07.6501282Z Progress (2): 1.1/2.0 MB | 28 kB    
2026-09-21T13:24:07.6501383Z Progress (2): 1.1/2.0 MB | 28 kB
2026-09-21T13:24:07.6501541Z Progress (2): 1.1/2.0 MB | 28 kB
2026-09-21T13:24:07.6501677Z Progress (2): 1.1/2.0 MB | 28 kB
2026-09-21T13:24:07.6502578Z Progress (3): 1.1/2.0 MB | 28 kB | 0/1.0 MB
2026-09-21T13:24:07.6503196Z Progress (3): 1.1/2.0 MB | 28 kB | 0/1.0 MB
2026-09-21T13:24:07.6504282Z Progress (3): 1.1/2.0 MB | 28 kB | 0.1/1.0 MB
2026-09-21T13:24:07.6514797Z Progress (3): 1.1/2.0 MB | 28 kB | 0.1/1.0 MB
2026-09-21T13:24:07.6514955Z Progress (3): 1.1/2.0 MB | 28 kB | 0.1/1.0 MB
2026-09-21T13:24:07.6517502Z Progress (3): 1.1/2.0 MB | 28 kB | 0.1/1.0 MB
2026-09-21T13:24:07.6517660Z Progress (3): 1.1/2.0 MB | 28 kB | 0.1/1.0 MB
2026-09-21T13:24:07.6519174Z Progress (3): 1.1/2.0 MB | 28 kB | 0.1/1.0 MB
2026-09-21T13:24:07.6520131Z Progress (3): 1.1/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6521052Z Progress (3): 1.1/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6530998Z Progress (3): 1.1/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6531173Z Progress (3): 1.2/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6531748Z Progress (3): 1.2/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6532211Z Progress (3): 1.2/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6533288Z Progress (3): 1.2/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6535298Z Progress (3): 1.2/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6537190Z Progress (3): 1.2/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6538521Z Progress (3): 1.3/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6539684Z Progress (3): 1.3/2.0 MB | 28 kB | 0.2/1.0 MB
2026-09-21T13:24:07.6540934Z Progress (4): 1.3/2.0 MB | 28 kB | 0.2/1.0 MB | 7.7/178 kB
2026-09-21T13:24:07.6541068Z Progress (4): 1.3/2.0 MB | 28 kB | 0.2/1.0 MB | 7.7/178 kB
2026-09-21T13:24:07.6542101Z Progress (4): 1.3/2.0 MB | 28 kB | 0.2/1.0 MB | 40/178 kB 
2026-09-21T13:24:07.6542269Z Progress (4): 1.3/2.0 MB | 28 kB | 0.2/1.0 MB | 73/178 kB
2026-09-21T13:24:07.6543045Z Progress (4): 1.4/2.0 MB | 28 kB | 0.2/1.0 MB | 73/178 kB
2026-09-21T13:24:07.6543211Z Progress (4): 1.4/2.0 MB | 28 kB | 0.2/1.0 MB | 98/178 kB
2026-09-21T13:24:07.6543587Z Progress (4): 1.4/2.0 MB | 28 kB | 0.2/1.0 MB | 98/178 kB
2026-09-21T13:24:07.6545138Z Progress (4): 1.4/2.0 MB | 28 kB | 0.2/1.0 MB | 98/178 kB
2026-09-21T13:24:07.6547908Z Progress (4): 1.4/2.0 MB | 28 kB | 0.2/1.0 MB | 98/178 kB
2026-09-21T13:24:07.6548818Z Progress (4): 1.4/2.0 MB | 28 kB | 0.2/1.0 MB | 98/178 kB
2026-09-21T13:24:07.6549932Z Progress (4): 1.4/2.0 MB | 28 kB | 0.3/1.0 MB | 98/178 kB
2026-09-21T13:24:07.6550701Z Progress (4): 1.4/2.0 MB | 28 kB | 0.3/1.0 MB | 98/178 kB
2026-09-21T13:24:07.6550857Z Progress (4): 1.4/2.0 MB | 28 kB | 0.3/1.0 MB | 111/178 kB
2026-09-21T13:24:07.6551299Z Progress (4): 1.4/2.0 MB | 28 kB | 0.3/1.0 MB | 111/178 kB
2026-09-21T13:24:07.6551728Z Progress (4): 1.4/2.0 MB | 28 kB | 0.3/1.0 MB | 112/178 kB
2026-09-21T13:24:07.6552320Z Progress (4): 1.4/2.0 MB | 28 kB | 0.3/1.0 MB | 112/178 kB
2026-09-21T13:24:07.6552814Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 112/178 kB
2026-09-21T13:24:07.6553376Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 112/178 kB
2026-09-21T13:24:07.6554551Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 138/178 kB
2026-09-21T13:24:07.6554717Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 171/178 kB
2026-09-21T13:24:07.6555023Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB    
2026-09-21T13:24:07.6556279Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6556444Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6557634Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6563921Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6564106Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6564220Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6564389Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6564544Z Progress (4): 1.4/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6564695Z Progress (4): 1.5/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6564851Z Progress (4): 1.5/2.0 MB | 28 kB | 0.4/1.0 MB | 178 kB
2026-09-21T13:24:07.6564965Z Progress (4): 1.5/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6565247Z Progress (4): 1.5/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6565403Z Progress (4): 1.5/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6565555Z Progress (4): 1.6/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6565733Z Progress (4): 1.6/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6566068Z Progress (4): 1.6/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6567293Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6567810Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6567985Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6568539Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6569034Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6569843Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6571650Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6571976Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6576125Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6577678Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6577873Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6577991Z Progress (4): 1.7/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6578936Z Progress (4): 1.8/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6579100Z Progress (4): 1.8/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6580748Z Progress (4): 1.8/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6581366Z Progress (4): 1.8/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6581551Z Progress (4): 1.8/2.0 MB | 28 kB | 0.5/1.0 MB | 178 kB
2026-09-21T13:24:07.6581652Z                                                       
2026-09-21T13:24:07.6582124Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/batch/spring-batch-test/5.2.6/spring-batch-test-5.2.6.jar (28 kB at 80 kB/s)
2026-09-21T13:24:07.6582357Z Progress (3): 1.8/2.0 MB | 0.6/1.0 MB | 178 kB
2026-09-21T13:24:07.6582821Z Progress (3): 1.9/2.0 MB | 0.6/1.0 MB | 178 kB
2026-09-21T13:24:07.6583628Z Progress (3): 1.9/2.0 MB | 0.6/1.0 MB | 178 kB
2026-09-21T13:24:07.6584645Z Progress (3): 1.9/2.0 MB | 0.6/1.0 MB | 178 kB
2026-09-21T13:24:07.6584761Z Progress (3): 1.9/2.0 MB | 0.6/1.0 MB | 178 kB
2026-09-21T13:24:07.6585659Z Progress (3): 1.9/2.0 MB | 0.6/1.0 MB | 178 kB
2026-09-21T13:24:07.6586469Z Progress (3): 2.0/2.0 MB | 0.6/1.0 MB | 178 kB
2026-09-21T13:24:07.6589393Z Progress (3): 2.0 MB | 0.6/1.0 MB | 178 kB    
2026-09-21T13:24:07.6591064Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0/2.7 MB
2026-09-21T13:24:07.6591718Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0/2.7 MB
2026-09-21T13:24:07.6592914Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.1/2.7 MB
2026-09-21T13:24:07.6601646Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.1/2.7 MB
2026-09-21T13:24:07.6602325Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.1/2.7 MB
2026-09-21T13:24:07.6602500Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.1/2.7 MB
2026-09-21T13:24:07.6602804Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.1/2.7 MB
2026-09-21T13:24:07.6603405Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.1/2.7 MB
2026-09-21T13:24:07.6604268Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.1/2.7 MB
2026-09-21T13:24:07.6605729Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.2/2.7 MB
2026-09-21T13:24:07.6606400Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.2/2.7 MB
2026-09-21T13:24:07.6606717Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.2/2.7 MB
2026-09-21T13:24:07.6607058Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.2/2.7 MB
2026-09-21T13:24:07.6607211Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.2/2.7 MB
2026-09-21T13:24:07.6607792Z Progress (4): 2.0 MB | 0.6/1.0 MB | 178 kB | 0.2/2.7 MB
2026-09-21T13:24:07.6609164Z Progress (4): 2.0 MB | 0.7/1.0 MB | 178 kB | 0.2/2.7 MB
2026-09-21T13:24:07.6609471Z                                                        
2026-09-21T13:24:07.6609973Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/xmlunit/xmlunit-core/2.10.4/xmlunit-core-2.10.4.jar (178 kB at 499 kB/s)
2026-09-21T13:24:07.6611457Z Progress (3): 2.0 MB | 0.7/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6612581Z Progress (3): 2.0 MB | 0.7/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6614265Z Progress (3): 2.0 MB | 0.7/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6616750Z Progress (3): 2.0 MB | 0.7/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6617920Z Progress (3): 2.0 MB | 0.7/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6618593Z Progress (3): 2.0 MB | 0.8/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6619942Z Progress (3): 2.0 MB | 0.8/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6620818Z Progress (3): 2.0 MB | 0.8/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6621572Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6630812Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6631713Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6631875Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6632025Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6632170Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6633562Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.2/2.7 MB
2026-09-21T13:24:07.6633931Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.3/2.7 MB
2026-09-21T13:24:07.6634161Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.3/2.7 MB
2026-09-21T13:24:07.6635031Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.3/2.7 MB
2026-09-21T13:24:07.6635255Z Progress (3): 2.0 MB | 0.9/1.0 MB | 0.3/2.7 MB
2026-09-21T13:24:07.6635428Z Progress (3): 2.0 MB | 1.0/1.0 MB | 0.3/2.7 MB
2026-09-21T13:24:07.6636650Z Progress (3): 2.0 MB | 1.0/1.0 MB | 0.3/2.7 MB
2026-09-21T13:24:07.6636994Z Progress (3): 2.0 MB | 1.0/1.0 MB | 0.4/2.7 MB
2026-09-21T13:24:07.6637743Z Progress (3): 2.0 MB | 1.0/1.0 MB | 0.4/2.7 MB
2026-09-21T13:24:07.6638849Z Progress (3): 2.0 MB | 1.0/1.0 MB | 0.4/2.7 MB
2026-09-21T13:24:07.6639001Z Progress (3): 2.0 MB | 1.0/1.0 MB | 0.4/2.7 MB
2026-09-21T13:24:07.6639112Z Progress (3): 2.0 MB | 1.0/1.0 MB | 0.4/2.7 MB
2026-09-21T13:24:07.6639643Z Progress (3): 2.0 MB | 1.0 MB | 0.4/2.7 MB    
2026-09-21T13:24:07.6640717Z Progress (3): 2.0 MB | 1.0 MB | 0.5/2.7 MB
2026-09-21T13:24:07.6641062Z Progress (3): 2.0 MB | 1.0 MB | 0.5/2.7 MB
2026-09-21T13:24:07.6642537Z Progress (3): 2.0 MB | 1.0 MB | 0.5/2.7 MB
2026-09-21T13:24:07.6642686Z                                           
2026-09-21T13:24:07.6643055Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-core/6.2.19/spring-core-6.2.19.jar (2.0 MB at 5.5 MB/s)
2026-09-21T13:24:07.6643271Z Progress (2): 1.0 MB | 0.5/2.7 MB
2026-09-21T13:24:07.6643413Z Progress (2): 1.0 MB | 0.5/2.7 MB
2026-09-21T13:24:07.6643569Z Progress (2): 1.0 MB | 0.6/2.7 MB
2026-09-21T13:24:07.6643755Z Progress (2): 1.0 MB | 0.6/2.7 MB
2026-09-21T13:24:07.6645598Z Progress (2): 1.0 MB | 0.6/2.7 MB
2026-09-21T13:24:07.6646546Z Progress (2): 1.0 MB | 0.6/2.7 MB
2026-09-21T13:24:07.6684615Z Progress (2): 1.0 MB | 0.6/2.7 MB
2026-09-21T13:24:07.6684856Z                                  
2026-09-21T13:24:07.6685303Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/springframework/spring-test/6.2.19/spring-test-6.2.19.jar (1.0 MB at 2.8 MB/s)
2026-09-21T13:24:07.6698045Z Progress (1): 0.6/2.7 MB
2026-09-21T13:24:07.6698334Z Progress (1): 0.6/2.7 MB
2026-09-21T13:24:07.6699196Z Progress (1): 0.6/2.7 MB
2026-09-21T13:24:07.6699684Z Progress (1): 0.7/2.7 MB
2026-09-21T13:24:07.6700381Z Progress (1): 0.7/2.7 MB
2026-09-21T13:24:07.6701535Z Progress (1): 0.7/2.7 MB
2026-09-21T13:24:07.6702374Z Progress (1): 0.7/2.7 MB
2026-09-21T13:24:07.6703248Z Progress (1): 0.7/2.7 MB
2026-09-21T13:24:07.6704057Z Progress (1): 0.7/2.7 MB
2026-09-21T13:24:07.6705151Z Progress (1): 0.7/2.7 MB
2026-09-21T13:24:07.6707151Z Progress (1): 0.8/2.7 MB
2026-09-21T13:24:07.6708021Z Progress (1): 0.8/2.7 MB
2026-09-21T13:24:07.6709135Z Progress (1): 0.8/2.7 MB
2026-09-21T13:24:07.6710312Z Progress (1): 0.9/2.7 MB
2026-09-21T13:24:07.6711457Z Progress (1): 0.9/2.7 MB
2026-09-21T13:24:07.6712576Z Progress (1): 0.9/2.7 MB
2026-09-21T13:24:07.6713665Z Progress (1): 1.0/2.7 MB
2026-09-21T13:24:07.6714624Z Progress (1): 1.0/2.7 MB
2026-09-21T13:24:07.6725683Z Progress (1): 1.0/2.7 MB
2026-09-21T13:24:07.6725858Z Progress (1): 1.0/2.7 MB
2026-09-21T13:24:07.6726406Z Progress (1): 1.0/2.7 MB
2026-09-21T13:24:07.6727983Z Progress (1): 1.0/2.7 MB
2026-09-21T13:24:07.6728867Z Progress (1): 1.1/2.7 MB
2026-09-21T13:24:07.6729946Z Progress (1): 1.1/2.7 MB
2026-09-21T13:24:07.6730079Z Progress (1): 1.1/2.7 MB
2026-09-21T13:24:07.6736193Z Progress (1): 1.1/2.7 MB
2026-09-21T13:24:07.6738100Z Progress (1): 1.1/2.7 MB
2026-09-21T13:24:07.6738239Z Progress (1): 1.2/2.7 MB
2026-09-21T13:24:07.6740115Z Progress (1): 1.2/2.7 MB
2026-09-21T13:24:07.6740444Z Progress (1): 1.2/2.7 MB
2026-09-21T13:24:07.6743514Z Progress (1): 1.2/2.7 MB
2026-09-21T13:24:07.6744126Z Progress (1): 1.2/2.7 MB
2026-09-21T13:24:07.6745454Z Progress (1): 1.2/2.7 MB
2026-09-21T13:24:07.6745715Z Progress (1): 1.3/2.7 MB
2026-09-21T13:24:07.6746531Z Progress (1): 1.3/2.7 MB
2026-09-21T13:24:07.6748421Z Progress (1): 1.3/2.7 MB
2026-09-21T13:24:07.6748649Z Progress (1): 1.3/2.7 MB
2026-09-21T13:24:07.6749834Z Progress (1): 1.3/2.7 MB
2026-09-21T13:24:07.6751234Z Progress (1): 1.3/2.7 MB
2026-09-21T13:24:07.6752625Z Progress (1): 1.4/2.7 MB
2026-09-21T13:24:07.6752760Z Progress (1): 1.4/2.7 MB
2026-09-21T13:24:07.6772705Z Progress (1): 1.4/2.7 MB
2026-09-21T13:24:07.6773775Z Progress (1): 1.4/2.7 MB
2026-09-21T13:24:07.6774043Z Progress (1): 1.4/2.7 MB
2026-09-21T13:24:07.6777960Z Progress (1): 1.4/2.7 MB
2026-09-21T13:24:07.6779385Z Progress (1): 1.5/2.7 MB
2026-09-21T13:24:07.6779486Z Progress (1): 1.5/2.7 MB
2026-09-21T13:24:07.6781507Z Progress (1): 1.5/2.7 MB
2026-09-21T13:24:07.6783170Z Progress (1): 1.5/2.7 MB
2026-09-21T13:24:07.6784954Z Progress (1): 1.5/2.7 MB
2026-09-21T13:24:07.6786331Z Progress (1): 1.6/2.7 MB
2026-09-21T13:24:07.6786964Z Progress (1): 1.6/2.7 MB
2026-09-21T13:24:07.6788322Z Progress (1): 1.6/2.7 MB
2026-09-21T13:24:07.6788617Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6788830Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6790059Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6790784Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6791458Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6792361Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6794363Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6796204Z Progress (1): 1.7/2.7 MB
2026-09-21T13:24:07.6797149Z Progress (1): 1.8/2.7 MB
2026-09-21T13:24:07.6798017Z Progress (1): 1.8/2.7 MB
2026-09-21T13:24:07.6798914Z Progress (1): 1.8/2.7 MB
2026-09-21T13:24:07.6800031Z Progress (1): 1.9/2.7 MB
2026-09-21T13:24:07.6800473Z Progress (1): 1.9/2.7 MB
2026-09-21T13:24:07.6814936Z Progress (1): 1.9/2.7 MB
2026-09-21T13:24:07.6816948Z Progress (1): 2.0/2.7 MB
2026-09-21T13:24:07.6817721Z Progress (1): 2.0/2.7 MB
2026-09-21T13:24:07.6819006Z Progress (1): 2.0/2.7 MB
2026-09-21T13:24:07.6819989Z Progress (1): 2.0/2.7 MB
2026-09-21T13:24:07.6820395Z Progress (1): 2.0/2.7 MB
2026-09-21T13:24:07.6824171Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6826376Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6826634Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6826863Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6827364Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6827724Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6829046Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6830216Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6831380Z Progress (1): 2.1/2.7 MB
2026-09-21T13:24:07.6831638Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6846110Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6846290Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6846755Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6849771Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6850059Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6851340Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6851884Z Progress (1): 2.2/2.7 MB
2026-09-21T13:24:07.6852855Z Progress (1): 2.3/2.7 MB
2026-09-21T13:24:07.6854121Z Progress (1): 2.3/2.7 MB
2026-09-21T13:24:07.6855622Z Progress (1): 2.3/2.7 MB
2026-09-21T13:24:07.6856743Z Progress (1): 2.3/2.7 MB
2026-09-21T13:24:07.6857711Z Progress (1): 2.4/2.7 MB
2026-09-21T13:24:07.6858041Z Progress (1): 2.4/2.7 MB
2026-09-21T13:24:07.6865096Z Progress (1): 2.4/2.7 MB
2026-09-21T13:24:07.6866250Z Progress (1): 2.4/2.7 MB
2026-09-21T13:24:07.6867223Z Progress (1): 2.5/2.7 MB
2026-09-21T13:24:07.6868086Z Progress (1): 2.5/2.7 MB
2026-09-21T13:24:07.6868981Z Progress (1): 2.5/2.7 MB
2026-09-21T13:24:07.6869896Z Progress (1): 2.6/2.7 MB
2026-09-21T13:24:07.6870813Z Progress (1): 2.6/2.7 MB
2026-09-21T13:24:07.6870977Z Progress (1): 2.6/2.7 MB
2026-09-21T13:24:07.6932545Z Progress (1): 2.7 MB    
2026-09-21T13:24:07.6932829Z                     
2026-09-21T13:24:07.6933422Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/h2database/h2/2.3.232/h2-2.3.232.jar (2.7 MB at 6.8 MB/s)
2026-09-21T13:24:08.3829958Z [INFO] 
2026-09-21T13:24:08.3831023Z [INFO] --- clean:3.2.0:clean (default-clean) @ core-starter ---
2026-09-21T13:24:08.3873453Z [INFO] 
2026-09-21T13:24:08.3874026Z [INFO] --- enforcer:3.5.0:enforce (enforce-rules) @ core-starter ---
2026-09-21T13:24:08.3899119Z [INFO] Rule 1: org.apache.maven.enforcer.rules.BanDuplicatePomDependencyVersions passed
2026-09-21T13:24:08.4072963Z [INFO] Rule 2: org.apache.maven.enforcer.rules.dependency.RequireUpperBoundDeps passed
2026-09-21T13:24:08.4073427Z [INFO] 
2026-09-21T13:24:08.4074429Z [INFO] --- jacoco:0.8.12:prepare-agent (prepare-agent) @ core-starter ---
2026-09-21T13:24:08.4124063Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.pom
2026-09-21T13:24:08.4197236Z Progress (1): 4.1 kB
2026-09-21T13:24:08.4197620Z                     
2026-09-21T13:24:08.4198684Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.pom (4.1 kB at 590 kB/s)
2026-09-21T13:24:08.4268419Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom
2026-09-21T13:24:08.4340873Z Progress (1): 4.5 kB
2026-09-21T13:24:08.4341068Z                     
2026-09-21T13:24:08.4341461Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom (4.5 kB at 641 kB/s)
2026-09-21T13:24:08.4389530Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/36/maven-shared-components-36.pom
2026-09-21T13:24:08.4451132Z Progress (1): 4.9 kB
2026-09-21T13:24:08.4451439Z                     
2026-09-21T13:24:08.4451978Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/36/maven-shared-components-36.pom (4.9 kB at 816 kB/s)
2026-09-21T13:24:08.4631437Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/36/maven-parent-36.pom
2026-09-21T13:24:08.4665394Z Progress (1): 7.7/45 kB
2026-09-21T13:24:08.4665566Z Progress (1): 41/45 kB 
2026-09-21T13:24:08.4666571Z Progress (1): 43/45 kB
2026-09-21T13:24:08.4700264Z Progress (1): 45 kB   
2026-09-21T13:24:08.4700783Z                    
2026-09-21T13:24:08.4701235Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/36/maven-parent-36.pom (45 kB at 6.5 MB/s)
2026-09-21T13:24:08.4757987Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/26/apache-26.pom
2026-09-21T13:24:08.4783091Z Progress (1): 7.7/21 kB
2026-09-21T13:24:08.4783774Z Progress (1): 16/21 kB 
2026-09-21T13:24:08.4810900Z Progress (1): 21 kB   
2026-09-21T13:24:08.4811072Z                    
2026-09-21T13:24:08.4811428Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/26/apache-26.pom (21 kB at 4.1 MB/s)
2026-09-21T13:24:08.4870257Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom
2026-09-21T13:24:08.4923354Z Progress (1): 2.7 kB
2026-09-21T13:24:08.4923578Z                     
2026-09-21T13:24:08.4924083Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom (2.7 kB at 457 kB/s)
2026-09-21T13:24:08.4977870Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom
2026-09-21T13:24:08.5000815Z Progress (1): 7.7/14 kB
2026-09-21T13:24:08.5004904Z Progress (1): 13/14 kB 
2026-09-21T13:24:08.5030571Z Progress (1): 14 kB   
2026-09-21T13:24:08.5030712Z                    
2026-09-21T13:24:08.5031080Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom (14 kB at 2.8 MB/s)
2026-09-21T13:24:08.5087125Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.4.2/plexus-utils-3.4.2.pom
2026-09-21T13:24:08.5119172Z Progress (1): 7.7/8.2 kB
2026-09-21T13:24:08.5151463Z Progress (1): 8.2 kB    
2026-09-21T13:24:08.5151953Z                     
2026-09-21T13:24:08.5152582Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.4.2/plexus-utils-3.4.2.pom (8.2 kB at 1.2 MB/s)
2026-09-21T13:24:08.5200500Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/8/plexus-8.pom
2026-09-21T13:24:08.5228009Z Progress (1): 7.7/25 kB
2026-09-21T13:24:08.5255756Z Progress (1): 25 kB    
2026-09-21T13:24:08.5255867Z                    
2026-09-21T13:24:08.5256200Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/8/plexus-8.pom (25 kB at 4.2 MB/s)
2026-09-21T13:24:08.5332061Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom
2026-09-21T13:24:08.5354883Z Progress (1): 7.7/20 kB
2026-09-21T13:24:08.5355200Z Progress (1): 16/20 kB 
2026-09-21T13:24:08.5390538Z Progress (1): 20 kB   
2026-09-21T13:24:08.5390743Z                    
2026-09-21T13:24:08.5391171Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom (20 kB at 3.9 MB/s)
2026-09-21T13:24:08.5444648Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/52/commons-parent-52.pom
2026-09-21T13:24:08.5470044Z Progress (1): 7.7/79 kB
2026-09-21T13:24:08.5471512Z Progress (1): 41/79 kB 
2026-09-21T13:24:08.5471660Z Progress (1): 73/79 kB
2026-09-21T13:24:08.5510886Z Progress (1): 79 kB   
2026-09-21T13:24:08.5511068Z                    
2026-09-21T13:24:08.5511587Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-parent/52/commons-parent-52.pom (79 kB at 13 MB/s)
2026-09-21T13:24:08.5578181Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom
2026-09-21T13:24:08.5631741Z Progress (1): 5.1 kB
2026-09-21T13:24:08.5632043Z                     
2026-09-21T13:24:08.5632419Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom (5.1 kB at 850 kB/s)
2026-09-21T13:24:08.5741614Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12.pom
2026-09-21T13:24:08.5820720Z Progress (1): 3.5 kB
2026-09-21T13:24:08.5820895Z                     
2026-09-21T13:24:08.5821341Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12.pom (3.5 kB at 438 kB/s)
2026-09-21T13:24:08.5884905Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.core/0.8.12/org.jacoco.core-0.8.12.pom
2026-09-21T13:24:08.5953651Z Progress (1): 2.1 kB
2026-09-21T13:24:08.5953926Z                     
2026-09-21T13:24:08.5954378Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.core/0.8.12/org.jacoco.core-0.8.12.pom (2.1 kB at 298 kB/s)
2026-09-21T13:24:08.6015762Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7/asm-9.7.pom
2026-09-21T13:24:08.6100933Z Progress (1): 2.4 kB
2026-09-21T13:24:08.6101053Z                     
2026-09-21T13:24:08.6101453Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7/asm-9.7.pom (2.4 kB at 296 kB/s)
2026-09-21T13:24:08.6151678Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.pom
2026-09-21T13:24:08.6241552Z Progress (1): 2.8 kB
2026-09-21T13:24:08.6241701Z                     
2026-09-21T13:24:08.6242048Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.pom (2.8 kB at 279 kB/s)
2026-09-21T13:24:08.6295664Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.pom
2026-09-21T13:24:08.6381565Z Progress (1): 2.6 kB
2026-09-21T13:24:08.6381796Z                     
2026-09-21T13:24:08.6382290Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.pom (2.6 kB at 288 kB/s)
2026-09-21T13:24:08.6768893Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.report/0.8.12/org.jacoco.report-0.8.12.pom
2026-09-21T13:24:08.6835189Z Progress (1): 1.9 kB
2026-09-21T13:24:08.6835594Z                     
2026-09-21T13:24:08.6836394Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.report/0.8.12/org.jacoco.report-0.8.12.pom (1.9 kB at 269 kB/s)
2026-09-21T13:24:08.6911483Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.jar
2026-09-21T13:24:08.6937291Z Progress (1): 0.9/247 kB
2026-09-21T13:24:08.6938365Z Progress (1): 34/247 kB 
2026-09-21T13:24:08.6939180Z Progress (1): 66/247 kB
2026-09-21T13:24:08.6939321Z Progress (1): 93/247 kB
2026-09-21T13:24:08.6941175Z Progress (1): 104/247 kB
2026-09-21T13:24:08.6941474Z Progress (1): 134/247 kB
2026-09-21T13:24:08.6942044Z Progress (1): 143/247 kB
2026-09-21T13:24:08.6946895Z Progress (1): 171/247 kB
2026-09-21T13:24:08.6948436Z Progress (1): 187/247 kB
2026-09-21T13:24:08.6948944Z Progress (1): 220/247 kB
2026-09-21T13:24:08.6980219Z Progress (1): 247 kB    
2026-09-21T13:24:08.6980450Z                     
2026-09-21T13:24:08.6980827Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.0.24/plexus-utils-3.0.24.jar (247 kB at 35 MB/s)
2026-09-21T13:24:08.6985182Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.jar
2026-09-21T13:24:08.6989456Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar
2026-09-21T13:24:08.6989838Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar
2026-09-21T13:24:08.6990390Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar
2026-09-21T13:24:08.6990993Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.core/0.8.12/org.jacoco.core-0.8.12.jar
2026-09-21T13:24:08.7011324Z Progress (1): 7.7/36 kB
2026-09-21T13:24:08.7011511Z Progress (1): 13/36 kB 
2026-09-21T13:24:08.7011752Z Progress (1): 31/36 kB
2026-09-21T13:24:08.7014738Z Progress (1): 36 kB   
2026-09-21T13:24:08.7016324Z Progress (2): 36 kB | 0.9/327 kB
2026-09-21T13:24:08.7017109Z Progress (2): 36 kB | 19/327 kB 
2026-09-21T13:24:08.7017463Z Progress (2): 36 kB | 21/327 kB
2026-09-21T13:24:08.7017961Z Progress (3): 36 kB | 21/327 kB | 0.9/210 kB
2026-09-21T13:24:08.7018424Z Progress (3): 36 kB | 24/327 kB | 0.9/210 kB
2026-09-21T13:24:08.7019590Z Progress (3): 36 kB | 24/327 kB | 13/210 kB 
2026-09-21T13:24:08.7020251Z Progress (4): 36 kB | 24/327 kB | 13/210 kB | 2.3/302 kB
2026-09-21T13:24:08.7020416Z Progress (4): 36 kB | 30/327 kB | 13/210 kB | 2.3/302 kB
2026-09-21T13:24:08.7020623Z Progress (4): 36 kB | 30/327 kB | 13/210 kB | 5.0/302 kB
2026-09-21T13:24:08.7022748Z Progress (4): 36 kB | 30/327 kB | 13/210 kB | 13/302 kB 
2026-09-21T13:24:08.7022930Z Progress (4): 36 kB | 30/327 kB | 13/210 kB | 16/302 kB
2026-09-21T13:24:08.7023093Z Progress (4): 36 kB | 38/327 kB | 13/210 kB | 16/302 kB
2026-09-21T13:24:08.7023218Z Progress (5): 36 kB | 38/327 kB | 13/210 kB | 16/302 kB | 3.6/41 kB
2026-09-21T13:24:08.7023449Z Progress (5): 36 kB | 38/327 kB | 13/210 kB | 19/302 kB | 3.6/41 kB
2026-09-21T13:24:08.7023624Z Progress (5): 36 kB | 45/327 kB | 13/210 kB | 19/302 kB | 3.6/41 kB
2026-09-21T13:24:08.7023915Z Progress (5): 36 kB | 47/327 kB | 13/210 kB | 19/302 kB | 3.6/41 kB
2026-09-21T13:24:08.7024100Z Progress (5): 36 kB | 56/327 kB | 13/210 kB | 19/302 kB | 3.6/41 kB
2026-09-21T13:24:08.7024960Z Progress (5): 36 kB | 56/327 kB | 13/210 kB | 19/302 kB | 23/41 kB 
2026-09-21T13:24:08.7025298Z Progress (5): 36 kB | 56/327 kB | 13/210 kB | 20/302 kB | 23/41 kB
2026-09-21T13:24:08.7025489Z Progress (5): 36 kB | 56/327 kB | 13/210 kB | 21/302 kB | 23/41 kB
2026-09-21T13:24:08.7025624Z Progress (5): 36 kB | 56/327 kB | 16/210 kB | 21/302 kB | 23/41 kB
2026-09-21T13:24:08.7025800Z Progress (5): 36 kB | 61/327 kB | 16/210 kB | 21/302 kB | 23/41 kB
2026-09-21T13:24:08.7025971Z Progress (5): 36 kB | 61/327 kB | 28/210 kB | 21/302 kB | 23/41 kB
2026-09-21T13:24:08.7026142Z Progress (5): 36 kB | 61/327 kB | 28/210 kB | 24/302 kB | 23/41 kB
2026-09-21T13:24:08.7026324Z Progress (5): 36 kB | 61/327 kB | 28/210 kB | 27/302 kB | 23/41 kB
2026-09-21T13:24:08.7026489Z Progress (5): 36 kB | 61/327 kB | 35/210 kB | 27/302 kB | 23/41 kB
2026-09-21T13:24:08.7026743Z Progress (5): 36 kB | 61/327 kB | 38/210 kB | 27/302 kB | 23/41 kB
2026-09-21T13:24:08.7026977Z Progress (5): 36 kB | 61/327 kB | 41/210 kB | 27/302 kB | 23/41 kB
2026-09-21T13:24:08.7027148Z Progress (5): 36 kB | 61/327 kB | 41/210 kB | 27/302 kB | 27/41 kB
2026-09-21T13:24:08.7027313Z Progress (5): 36 kB | 61/327 kB | 41/210 kB | 27/302 kB | 30/41 kB
2026-09-21T13:24:08.7027509Z Progress (5): 36 kB | 61/327 kB | 41/210 kB | 27/302 kB | 32/41 kB
2026-09-21T13:24:08.7028930Z Progress (5): 36 kB | 69/327 kB | 41/210 kB | 27/302 kB | 32/41 kB
2026-09-21T13:24:08.7029082Z Progress (5): 36 kB | 72/327 kB | 41/210 kB | 27/302 kB | 32/41 kB
2026-09-21T13:24:08.7029252Z Progress (5): 36 kB | 72/327 kB | 41/210 kB | 41/302 kB | 32/41 kB
2026-09-21T13:24:08.7029454Z Progress (5): 36 kB | 82/327 kB | 41/210 kB | 41/302 kB | 32/41 kB
2026-09-21T13:24:08.7029683Z Progress (5): 36 kB | 82/327 kB | 41/210 kB | 43/302 kB | 32/41 kB
2026-09-21T13:24:08.7029840Z Progress (5): 36 kB | 82/327 kB | 41/210 kB | 45/302 kB | 32/41 kB
2026-09-21T13:24:08.7029971Z Progress (5): 36 kB | 82/327 kB | 41/210 kB | 45/302 kB | 39/41 kB
2026-09-21T13:24:08.7033094Z Progress (5): 36 kB | 83/327 kB | 41/210 kB | 45/302 kB | 39/41 kB
2026-09-21T13:24:08.7033260Z Progress (5): 36 kB | 83/327 kB | 41/210 kB | 45/302 kB | 41 kB   
2026-09-21T13:24:08.7033601Z Progress (5): 36 kB | 83/327 kB | 41/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7033788Z Progress (5): 36 kB | 83/327 kB | 45/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7034018Z Progress (5): 36 kB | 88/327 kB | 45/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7034151Z Progress (5): 36 kB | 93/327 kB | 45/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7034303Z Progress (5): 36 kB | 95/327 kB | 45/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7034540Z Progress (5): 36 kB | 95/327 kB | 53/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7034700Z Progress (5): 36 kB | 98/327 kB | 53/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7034849Z Progress (5): 36 kB | 98/327 kB | 58/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7035021Z Progress (5): 36 kB | 98/327 kB | 60/210 kB | 47/302 kB | 41 kB
2026-09-21T13:24:08.7035185Z Progress (5): 36 kB | 98/327 kB | 60/210 kB | 53/302 kB | 41 kB
2026-09-21T13:24:08.7035337Z Progress (5): 36 kB | 98/327 kB | 60/210 kB | 54/302 kB | 41 kB
2026-09-21T13:24:08.7035494Z Progress (5): 36 kB | 98/327 kB | 64/210 kB | 54/302 kB | 41 kB
2026-09-21T13:24:08.7035705Z Progress (5): 36 kB | 112/327 kB | 64/210 kB | 54/302 kB | 41 kB
2026-09-21T13:24:08.7035834Z Progress (5): 36 kB | 112/327 kB | 64/210 kB | 62/302 kB | 41 kB
2026-09-21T13:24:08.7041849Z Progress (5): 36 kB | 112/327 kB | 64/210 kB | 67/302 kB | 41 kB
2026-09-21T13:24:08.7042189Z Progress (5): 36 kB | 117/327 kB | 64/210 kB | 67/302 kB | 41 kB
2026-09-21T13:24:08.7042373Z Progress (5): 36 kB | 117/327 kB | 64/210 kB | 76/302 kB | 41 kB
2026-09-21T13:24:08.7042533Z Progress (5): 36 kB | 117/327 kB | 68/210 kB | 76/302 kB | 41 kB
2026-09-21T13:24:08.7042747Z Progress (5): 36 kB | 119/327 kB | 68/210 kB | 76/302 kB | 41 kB
2026-09-21T13:24:08.7042884Z Progress (5): 36 kB | 119/327 kB | 68/210 kB | 78/302 kB | 41 kB
2026-09-21T13:24:08.7043063Z Progress (5): 36 kB | 120/327 kB | 68/210 kB | 78/302 kB | 41 kB
2026-09-21T13:24:08.7043222Z Progress (5): 36 kB | 120/327 kB | 68/210 kB | 80/302 kB | 41 kB
2026-09-21T13:24:08.7043384Z Progress (5): 36 kB | 120/327 kB | 76/210 kB | 80/302 kB | 41 kB
2026-09-21T13:24:08.7043559Z Progress (5): 36 kB | 127/327 kB | 76/210 kB | 80/302 kB | 41 kB
2026-09-21T13:24:08.7043682Z Progress (5): 36 kB | 127/327 kB | 80/210 kB | 80/302 kB | 41 kB
2026-09-21T13:24:08.7043954Z Progress (5): 36 kB | 127/327 kB | 83/210 kB | 80/302 kB | 41 kB
2026-09-21T13:24:08.7044116Z Progress (5): 36 kB | 127/327 kB | 86/210 kB | 80/302 kB | 41 kB
2026-09-21T13:24:08.7044272Z Progress (5): 36 kB | 127/327 kB | 86/210 kB | 83/302 kB | 41 kB
2026-09-21T13:24:08.7044426Z Progress (5): 36 kB | 128/327 kB | 86/210 kB | 83/302 kB | 41 kB
2026-09-21T13:24:08.7044545Z Progress (5): 36 kB | 128/327 kB | 86/210 kB | 91/302 kB | 41 kB
2026-09-21T13:24:08.7044716Z Progress (5): 36 kB | 134/327 kB | 86/210 kB | 91/302 kB | 41 kB
2026-09-21T13:24:08.7044869Z Progress (5): 36 kB | 134/327 kB | 90/210 kB | 91/302 kB | 41 kB
2026-09-21T13:24:08.7045027Z Progress (5): 36 kB | 134/327 kB | 95/210 kB | 91/302 kB | 41 kB
2026-09-21T13:24:08.7045197Z Progress (5): 36 kB | 134/327 kB | 95/210 kB | 95/302 kB | 41 kB
2026-09-21T13:24:08.7045326Z Progress (5): 36 kB | 134/327 kB | 95/210 kB | 101/302 kB | 41 kB
2026-09-21T13:24:08.7045480Z                                                                  
2026-09-21T13:24:08.7045909Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.jar (36 kB at 6.1 MB/s)
2026-09-21T13:24:08.7046253Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7/asm-9.7.jar
2026-09-21T13:24:08.7046464Z Progress (4): 136/327 kB | 95/210 kB | 101/302 kB | 41 kB
2026-09-21T13:24:08.7046627Z Progress (4): 149/327 kB | 95/210 kB | 101/302 kB | 41 kB
2026-09-21T13:24:08.7046747Z Progress (4): 153/327 kB | 95/210 kB | 101/302 kB | 41 kB
2026-09-21T13:24:08.7046903Z Progress (4): 153/327 kB | 95/210 kB | 105/302 kB | 41 kB
2026-09-21T13:24:08.7047058Z Progress (4): 153/327 kB | 95/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7047365Z Progress (4): 153/327 kB | 104/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7047495Z Progress (4): 158/327 kB | 104/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7047659Z Progress (4): 158/327 kB | 109/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7047821Z Progress (4): 158/327 kB | 113/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7047995Z Progress (4): 161/327 kB | 113/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7048153Z Progress (4): 161/327 kB | 116/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7048274Z Progress (4): 175/327 kB | 116/210 kB | 112/302 kB | 41 kB
2026-09-21T13:24:08.7048429Z Progress (4): 175/327 kB | 116/210 kB | 117/302 kB | 41 kB
2026-09-21T13:24:08.7048632Z Progress (4): 177/327 kB | 116/210 kB | 117/302 kB | 41 kB
2026-09-21T13:24:08.7048797Z Progress (4): 177/327 kB | 116/210 kB | 125/302 kB | 41 kB
2026-09-21T13:24:08.7048973Z Progress (4): 177/327 kB | 124/210 kB | 125/302 kB | 41 kB
2026-09-21T13:24:08.7049096Z Progress (4): 192/327 kB | 124/210 kB | 125/302 kB | 41 kB
2026-09-21T13:24:08.7049253Z Progress (4): 195/327 kB | 124/210 kB | 125/302 kB | 41 kB
2026-09-21T13:24:08.7049424Z Progress (4): 195/327 kB | 124/210 kB | 131/302 kB | 41 kB
2026-09-21T13:24:08.7049622Z Progress (4): 198/327 kB | 124/210 kB | 131/302 kB | 41 kB
2026-09-21T13:24:08.7049775Z Progress (4): 203/327 kB | 124/210 kB | 131/302 kB | 41 kB
2026-09-21T13:24:08.7049895Z Progress (4): 203/327 kB | 124/210 kB | 142/302 kB | 41 kB
2026-09-21T13:24:08.7050054Z Progress (4): 203/327 kB | 124/210 kB | 153/302 kB | 41 kB
2026-09-21T13:24:08.7050208Z Progress (4): 203/327 kB | 124/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7050364Z Progress (4): 210/327 kB | 124/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7050535Z Progress (4): 212/327 kB | 124/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7050693Z Progress (4): 212/327 kB | 150/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7050893Z Progress (4): 220/327 kB | 150/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7051647Z Progress (4): 221/327 kB | 150/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7051868Z Progress (4): 221/327 kB | 164/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7052220Z Progress (4): 232/327 kB | 164/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7052349Z Progress (4): 232/327 kB | 165/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7053001Z Progress (4): 233/327 kB | 165/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7053973Z Progress (4): 233/327 kB | 180/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7054385Z Progress (4): 233/327 kB | 190/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7055563Z Progress (4): 233/327 kB | 195/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7056722Z Progress (4): 233/327 kB | 201/210 kB | 155/302 kB | 41 kB
2026-09-21T13:24:08.7058126Z Progress (4): 233/327 kB | 201/210 kB | 188/302 kB | 41 kB
2026-09-21T13:24:08.7058428Z Progress (4): 233/327 kB | 201/210 kB | 221/302 kB | 41 kB
2026-09-21T13:24:08.7058666Z                                                           
2026-09-21T13:24:08.7059102Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar (41 kB at 5.9 MB/s)
2026-09-21T13:24:08.7059363Z Progress (3): 233/327 kB | 201/210 kB | 254/302 kB
2026-09-21T13:24:08.7059523Z                                                   
2026-09-21T13:24:08.7060085Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.jar
2026-09-21T13:24:08.7060599Z Progress (3): 233/327 kB | 201/210 kB | 270/302 kB
2026-09-21T13:24:08.7061166Z Progress (3): 233/327 kB | 210 kB | 270/302 kB    
2026-09-21T13:24:08.7068232Z Progress (3): 266/327 kB | 210 kB | 270/302 kB
2026-09-21T13:24:08.7068702Z Progress (3): 299/327 kB | 210 kB | 270/302 kB
2026-09-21T13:24:08.7069015Z Progress (3): 299/327 kB | 210 kB | 296/302 kB
2026-09-21T13:24:08.7069209Z Progress (3): 327 kB | 210 kB | 296/302 kB    
2026-09-21T13:24:08.7069537Z Progress (3): 327 kB | 210 kB | 302 kB    
2026-09-21T13:24:08.7070183Z Progress (4): 327 kB | 210 kB | 302 kB | 7.7/125 kB
2026-09-21T13:24:08.7072932Z Progress (4): 327 kB | 210 kB | 302 kB | 23/125 kB 
2026-09-21T13:24:08.7073203Z Progress (4): 327 kB | 210 kB | 302 kB | 41/125 kB
2026-09-21T13:24:08.7073531Z Progress (4): 327 kB | 210 kB | 302 kB | 51/125 kB
2026-09-21T13:24:08.7073788Z Progress (4): 327 kB | 210 kB | 302 kB | 53/125 kB
2026-09-21T13:24:08.7074585Z Progress (4): 327 kB | 210 kB | 302 kB | 55/125 kB
2026-09-21T13:24:08.7074823Z Progress (4): 327 kB | 210 kB | 302 kB | 56/125 kB
2026-09-21T13:24:08.7074979Z Progress (4): 327 kB | 210 kB | 302 kB | 57/125 kB
2026-09-21T13:24:08.7078949Z Progress (4): 327 kB | 210 kB | 302 kB | 59/125 kB
2026-09-21T13:24:08.7079324Z Progress (4): 327 kB | 210 kB | 302 kB | 75/125 kB
2026-09-21T13:24:08.7079578Z Progress (4): 327 kB | 210 kB | 302 kB | 76/125 kB
2026-09-21T13:24:08.7081958Z Progress (4): 327 kB | 210 kB | 302 kB | 78/125 kB
2026-09-21T13:24:08.7082137Z Progress (4): 327 kB | 210 kB | 302 kB | 83/125 kB
2026-09-21T13:24:08.7082605Z Progress (4): 327 kB | 210 kB | 302 kB | 86/125 kB
2026-09-21T13:24:08.7083515Z Progress (5): 327 kB | 210 kB | 302 kB | 86/125 kB | 0.9/73 kB
2026-09-21T13:24:08.7084557Z Progress (5): 327 kB | 210 kB | 302 kB | 89/125 kB | 0.9/73 kB
2026-09-21T13:24:08.7084684Z Progress (5): 327 kB | 210 kB | 302 kB | 89/125 kB | 34/73 kB 
2026-09-21T13:24:08.7085206Z Progress (5): 327 kB | 210 kB | 302 kB | 93/125 kB | 34/73 kB
2026-09-21T13:24:08.7085790Z Progress (5): 327 kB | 210 kB | 302 kB | 94/125 kB | 34/73 kB
2026-09-21T13:24:08.7086184Z Progress (5): 327 kB | 210 kB | 302 kB | 94/125 kB | 66/73 kB
2026-09-21T13:24:08.7086385Z Progress (5): 327 kB | 210 kB | 302 kB | 94/125 kB | 73 kB   
2026-09-21T13:24:08.7088958Z Progress (5): 327 kB | 210 kB | 302 kB | 116/125 kB | 73 kB
2026-09-21T13:24:08.7093792Z Progress (5): 327 kB | 210 kB | 302 kB | 125 kB | 73 kB    
2026-09-21T13:24:08.7094070Z                                                        
2026-09-21T13:24:08.7094508Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar (327 kB at 30 MB/s)
2026-09-21T13:24:08.7094901Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.jar
2026-09-21T13:24:08.7097313Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar (302 kB at 27 MB/s)
2026-09-21T13:24:08.7097731Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.report/0.8.12/org.jacoco.report-0.8.12.jar
2026-09-21T13:24:08.7098467Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.core/0.8.12/org.jacoco.core-0.8.12.jar (210 kB at 19 MB/s)
2026-09-21T13:24:08.7118532Z Progress (3): 125 kB | 73 kB | 6.4/52 kB
2026-09-21T13:24:08.7118974Z Progress (3): 125 kB | 73 kB | 21/52 kB 
2026-09-21T13:24:08.7120978Z Progress (3): 125 kB | 73 kB | 26/52 kB
2026-09-21T13:24:08.7121160Z                                        
2026-09-21T13:24:08.7121487Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.7/asm-9.7.jar (125 kB at 9.0 MB/s)
2026-09-21T13:24:08.7121782Z Progress (3): 73 kB | 26/52 kB | 0.9/131 kB
2026-09-21T13:24:08.7121936Z Progress (3): 73 kB | 28/52 kB | 0.9/131 kB
2026-09-21T13:24:08.7122082Z Progress (3): 73 kB | 28/52 kB | 6.4/131 kB
2026-09-21T13:24:08.7122280Z Progress (3): 73 kB | 33/52 kB | 6.4/131 kB
2026-09-21T13:24:08.7122392Z Progress (3): 73 kB | 33/52 kB | 16/131 kB 
2026-09-21T13:24:08.7122759Z Progress (3): 73 kB | 33/52 kB | 17/131 kB
2026-09-21T13:24:08.7123015Z Progress (3): 73 kB | 49/52 kB | 17/131 kB
2026-09-21T13:24:08.7124287Z Progress (3): 73 kB | 52 kB | 17/131 kB   
2026-09-21T13:24:08.7124833Z Progress (3): 73 kB | 52 kB | 41/131 kB
2026-09-21T13:24:08.7125091Z Progress (3): 73 kB | 52 kB | 51/131 kB
2026-09-21T13:24:08.7126752Z Progress (3): 73 kB | 52 kB | 57/131 kB
2026-09-21T13:24:08.7126952Z Progress (3): 73 kB | 52 kB | 81/131 kB
2026-09-21T13:24:08.7128066Z Progress (3): 73 kB | 52 kB | 92/131 kB
2026-09-21T13:24:08.7128213Z Progress (3): 73 kB | 52 kB | 111/131 kB
2026-09-21T13:24:08.7128407Z Progress (3): 73 kB | 52 kB | 123/131 kB
2026-09-21T13:24:08.7140805Z Progress (3): 73 kB | 52 kB | 131 kB    
2026-09-21T13:24:08.7140951Z                                     
2026-09-21T13:24:08.7141262Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-commons/9.7/asm-commons-9.7.jar (73 kB at 4.6 MB/s)
2026-09-21T13:24:08.7159867Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm-tree/9.7/asm-tree-9.7.jar (52 kB at 3.1 MB/s)
2026-09-21T13:24:08.7163986Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jacoco/org.jacoco.report/0.8.12/org.jacoco.report-0.8.12.jar (131 kB at 7.3 MB/s)
2026-09-21T13:24:08.7917461Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/4/s/batch-platform/core-starter/target/jacoco.exec
2026-09-21T13:24:08.7918613Z [INFO] 
2026-09-21T13:24:08.7919025Z [INFO] --- resources:3.3.1:resources (default-resources) @ core-starter ---
2026-09-21T13:24:08.7953484Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom
2026-09-21T13:24:08.8009252Z Progress (1): 2.7 kB
2026-09-21T13:24:08.8009564Z                     
2026-09-21T13:24:08.8010073Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom (2.7 kB at 531 kB/s)
2026-09-21T13:24:08.8063585Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom
2026-09-21T13:24:08.8088650Z Progress (1): 7.7/23 kB
2026-09-21T13:24:08.8125195Z Progress (1): 23 kB    
2026-09-21T13:24:08.8125374Z                    
2026-09-21T13:24:08.8125899Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom (23 kB at 3.8 MB/s)
2026-09-21T13:24:08.8182088Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom
2026-09-21T13:24:08.8207824Z Progress (1): 7.7/8.8 kB
2026-09-21T13:24:08.8232555Z Progress (1): 8.8 kB    
2026-09-21T13:24:08.8232754Z                     
2026-09-21T13:24:08.8233139Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom (8.8 kB at 1.5 MB/s)
2026-09-21T13:24:08.8284703Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/10/plexus-10.pom
2026-09-21T13:24:08.8308365Z Progress (1): 7.7/25 kB
2026-09-21T13:24:08.8340631Z Progress (1): 25 kB    
2026-09-21T13:24:08.8340747Z                    
2026-09-21T13:24:08.8341106Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/10/plexus-10.pom (25 kB at 5.1 MB/s)
2026-09-21T13:24:08.8395676Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom
2026-09-21T13:24:08.8427221Z Progress (1): 0.9/6.0 kB
2026-09-21T13:24:08.8459704Z Progress (1): 6.0 kB    
2026-09-21T13:24:08.8459894Z                     
2026-09-21T13:24:08.8460293Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom (6.0 kB at 1.0 MB/s)
2026-09-21T13:24:08.8506291Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom
2026-09-21T13:24:08.8527238Z Progress (1): 0.9/3.2 kB
2026-09-21T13:24:08.8552339Z Progress (1): 3.2 kB    
2026-09-21T13:24:08.8552478Z                     
2026-09-21T13:24:08.8552831Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom (3.2 kB at 644 kB/s)
2026-09-21T13:24:08.8618521Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom
2026-09-21T13:24:08.8709561Z Progress (1): 3.2 kB
2026-09-21T13:24:08.8710030Z                     
2026-09-21T13:24:08.8710504Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom (3.2 kB at 356 kB/s)
2026-09-21T13:24:08.8762069Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/spice/spice-parent/15/spice-parent-15.pom
2026-09-21T13:24:08.8785726Z Progress (1): 0.9/8.4 kB
2026-09-21T13:24:08.8815699Z Progress (1): 8.4 kB    
2026-09-21T13:24:08.8815971Z                     
2026-09-21T13:24:08.8817172Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/spice/spice-parent/15/spice-parent-15.pom (8.4 kB at 1.4 MB/s)
2026-09-21T13:24:08.8874108Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom
2026-09-21T13:24:08.8894355Z Progress (1): 5.0/8.0 kB
2026-09-21T13:24:08.8921547Z Progress (1): 8.0 kB    
2026-09-21T13:24:08.8921655Z                     
2026-09-21T13:24:08.8922019Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom (8.0 kB at 1.6 MB/s)
2026-09-21T13:24:08.8983186Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom
2026-09-21T13:24:08.9014327Z Progress (1): 7.7/31 kB
2026-09-21T13:24:08.9015236Z Progress (1): 21/31 kB 
2026-09-21T13:24:08.9043849Z Progress (1): 31 kB   
2026-09-21T13:24:08.9043963Z                    
2026-09-21T13:24:08.9044315Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom (31 kB at 5.1 MB/s)
2026-09-21T13:24:08.9111132Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom
2026-09-21T13:24:08.9170662Z Progress (1): 5.1 kB
2026-09-21T13:24:08.9170855Z                     
2026-09-21T13:24:08.9171178Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom (5.1 kB at 728 kB/s)
2026-09-21T13:24:08.9231654Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar
2026-09-21T13:24:08.9256294Z Progress (1): 7.7/85 kB
2026-09-21T13:24:08.9257267Z Progress (1): 41/85 kB 
2026-09-21T13:24:08.9258435Z Progress (1): 73/85 kB
2026-09-21T13:24:08.9283512Z Progress (1): 85 kB   
2026-09-21T13:24:08.9283645Z                    
2026-09-21T13:24:08.9284042Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar (85 kB at 14 MB/s)
2026-09-21T13:24:08.9288505Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar
2026-09-21T13:24:08.9288997Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar
2026-09-21T13:24:08.9289676Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
2026-09-21T13:24:08.9290528Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar
2026-09-21T13:24:08.9315746Z Progress (1): 7.7/269 kB
2026-09-21T13:24:08.9316063Z Progress (2): 7.7/269 kB | 7.7/8.5 kB
2026-09-21T13:24:08.9316215Z Progress (2): 7.7/269 kB | 8.5 kB    
2026-09-21T13:24:08.9317016Z Progress (3): 7.7/269 kB | 8.5 kB | 5.0/55 kB
2026-09-21T13:24:08.9317348Z Progress (3): 7.7/269 kB | 8.5 kB | 17/55 kB 
2026-09-21T13:24:08.9317527Z Progress (3): 7.7/269 kB | 8.5 kB | 28/55 kB
2026-09-21T13:24:08.9317813Z Progress (3): 40/269 kB | 8.5 kB | 28/55 kB 
2026-09-21T13:24:08.9318358Z Progress (3): 40/269 kB | 8.5 kB | 55 kB   
2026-09-21T13:24:08.9319264Z Progress (3): 73/269 kB | 8.5 kB | 55 kB
2026-09-21T13:24:08.9322476Z Progress (3): 106/269 kB | 8.5 kB | 55 kB
2026-09-21T13:24:08.9323964Z Progress (3): 139/269 kB | 8.5 kB | 55 kB
2026-09-21T13:24:08.9324334Z Progress (3): 172/269 kB | 8.5 kB | 55 kB
2026-09-21T13:24:08.9325061Z Progress (4): 172/269 kB | 8.5 kB | 55 kB | 7.7/587 kB
2026-09-21T13:24:08.9325450Z Progress (4): 204/269 kB | 8.5 kB | 55 kB | 7.7/587 kB
2026-09-21T13:24:08.9325664Z Progress (4): 204/269 kB | 8.5 kB | 55 kB | 40/587 kB 
2026-09-21T13:24:08.9326642Z Progress (4): 237/269 kB | 8.5 kB | 55 kB | 40/587 kB
2026-09-21T13:24:08.9326806Z Progress (4): 237/269 kB | 8.5 kB | 55 kB | 73/587 kB
2026-09-21T13:24:08.9327802Z Progress (4): 269 kB | 8.5 kB | 55 kB | 73/587 kB    
2026-09-21T13:24:08.9329819Z Progress (4): 269 kB | 8.5 kB | 55 kB | 106/587 kB
2026-09-21T13:24:08.9329989Z Progress (4): 269 kB | 8.5 kB | 55 kB | 134/587 kB
2026-09-21T13:24:08.9330116Z Progress (4): 269 kB | 8.5 kB | 55 kB | 150/587 kB
2026-09-21T13:24:08.9330904Z Progress (4): 269 kB | 8.5 kB | 55 kB | 172/587 kB
2026-09-21T13:24:08.9331689Z Progress (4): 269 kB | 8.5 kB | 55 kB | 184/587 kB
2026-09-21T13:24:08.9332847Z Progress (4): 269 kB | 8.5 kB | 55 kB | 202/587 kB
2026-09-21T13:24:08.9333448Z Progress (4): 269 kB | 8.5 kB | 55 kB | 235/587 kB
2026-09-21T13:24:08.9333602Z Progress (4): 269 kB | 8.5 kB | 55 kB | 256/587 kB
2026-09-21T13:24:08.9334965Z Progress (4): 269 kB | 8.5 kB | 55 kB | 257/587 kB
2026-09-21T13:24:08.9336118Z Progress (4): 269 kB | 8.5 kB | 55 kB | 260/587 kB
2026-09-21T13:24:08.9336676Z Progress (4): 269 kB | 8.5 kB | 55 kB | 292/587 kB
2026-09-21T13:24:08.9337566Z Progress (4): 269 kB | 8.5 kB | 55 kB | 310/587 kB
2026-09-21T13:24:08.9338756Z Progress (4): 269 kB | 8.5 kB | 55 kB | 339/587 kB
2026-09-21T13:24:08.9339454Z Progress (4): 269 kB | 8.5 kB | 55 kB | 360/587 kB
2026-09-21T13:24:08.9339631Z Progress (4): 269 kB | 8.5 kB | 55 kB | 373/587 kB
2026-09-21T13:24:08.9340224Z Progress (4): 269 kB | 8.5 kB | 55 kB | 397/587 kB
2026-09-21T13:24:08.9340630Z Progress (4): 269 kB | 8.5 kB | 55 kB | 416/587 kB
2026-09-21T13:24:08.9342195Z Progress (4): 269 kB | 8.5 kB | 55 kB | 435/587 kB
2026-09-21T13:24:08.9342828Z Progress (4): 269 kB | 8.5 kB | 55 kB | 461/587 kB
2026-09-21T13:24:08.9343157Z Progress (4): 269 kB | 8.5 kB | 55 kB | 480/587 kB
2026-09-21T13:24:08.9343792Z Progress (4): 269 kB | 8.5 kB | 55 kB | 495/587 kB
2026-09-21T13:24:08.9344968Z Progress (4): 269 kB | 8.5 kB | 55 kB | 520/587 kB
2026-09-21T13:24:08.9345391Z Progress (4): 269 kB | 8.5 kB | 55 kB | 548/587 kB
2026-09-21T13:24:08.9345995Z Progress (4): 269 kB | 8.5 kB | 55 kB | 570/587 kB
2026-09-21T13:24:08.9346373Z                                                   
2026-09-21T13:24:08.9346958Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar (55 kB at 9.2 MB/s)
2026-09-21T13:24:08.9347533Z Progress (3): 269 kB | 8.5 kB | 587 kB
2026-09-21T13:24:08.9347678Z                                       
2026-09-21T13:24:08.9347997Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar (8.5 kB at 1.4 MB/s)
2026-09-21T13:24:08.9360657Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar (269 kB at 38 MB/s)
2026-09-21T13:24:08.9378290Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar (587 kB at 65 MB/s)
2026-09-21T13:24:08.9984119Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-09-21T13:24:09.0028563Z [INFO] 
2026-09-21T13:24:09.0029315Z [INFO] --- compiler:3.13.0:compile (default-compile) @ core-starter ---
2026-09-21T13:24:09.0066771Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom
2026-09-21T13:24:09.0133441Z Progress (1): 5.9 kB
2026-09-21T13:24:09.0133890Z                     
2026-09-21T13:24:09.0134334Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom (5.9 kB at 843 kB/s)
2026-09-21T13:24:09.0229178Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.pom
2026-09-21T13:24:09.0327399Z Progress (1): 2.3/4.3 kB
2026-09-21T13:24:09.0360961Z Progress (1): 4.3 kB    
2026-09-21T13:24:09.0361193Z                     
2026-09-21T13:24:09.0361660Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.pom (4.3 kB at 329 kB/s)
2026-09-21T13:24:09.0409477Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-languages/1.2.0/plexus-languages-1.2.0.pom
2026-09-21T13:24:09.0468433Z Progress (1): 3.2 kB
2026-09-21T13:24:09.0468874Z                     
2026-09-21T13:24:09.0469300Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-languages/1.2.0/plexus-languages-1.2.0.pom (3.2 kB at 532 kB/s)
2026-09-21T13:24:09.0514161Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/15/plexus-15.pom
2026-09-21T13:24:09.0549473Z Progress (1): 7.7/28 kB
2026-09-21T13:24:09.0599677Z Progress (1): 28 kB    
2026-09-21T13:24:09.0599794Z                    
2026-09-21T13:24:09.0600211Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/15/plexus-15.pom (28 kB at 3.5 MB/s)
2026-09-21T13:24:09.0670808Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.6/asm-9.6.pom
2026-09-21T13:24:09.0751447Z Progress (1): 2.4 kB
2026-09-21T13:24:09.0751817Z                     
2026-09-21T13:24:09.0752183Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.6/asm-9.6.pom (2.4 kB at 263 kB/s)
2026-09-21T13:24:09.0805334Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.pom
2026-09-21T13:24:09.0843549Z Progress (1): 7.7/17 kB
2026-09-21T13:24:09.0870677Z Progress (1): 17 kB    
2026-09-21T13:24:09.0871219Z                    
2026-09-21T13:24:09.0871796Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.pom (17 kB at 2.9 MB/s)
2026-09-21T13:24:09.0949855Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.pom
2026-09-21T13:24:09.1001983Z Progress (1): 1.4 kB
2026-09-21T13:24:09.1002215Z                     
2026-09-21T13:24:09.1002663Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.pom (1.4 kB at 227 kB/s)
2026-09-21T13:24:09.1051625Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler/2.15.0/plexus-compiler-2.15.0.pom
2026-09-21T13:24:09.1100665Z Progress (1): 7.6 kB
2026-09-21T13:24:09.1100842Z                     
2026-09-21T13:24:09.1101330Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler/2.15.0/plexus-compiler-2.15.0.pom (7.6 kB at 1.5 MB/s)
2026-09-21T13:24:09.1159435Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.pom
2026-09-21T13:24:09.1195918Z Progress (1): 2.3/8.7 kB
2026-09-21T13:24:09.1251407Z Progress (1): 8.7 kB    
2026-09-21T13:24:09.1251966Z                     
2026-09-21T13:24:09.1252536Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.pom (8.7 kB at 866 kB/s)
2026-09-21T13:24:09.1503379Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.pom
2026-09-21T13:24:09.1571102Z Progress (1): 1.3 kB
2026-09-21T13:24:09.1571564Z                     
2026-09-21T13:24:09.1572443Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.pom (1.3 kB at 193 kB/s)
2026-09-21T13:24:09.1630228Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.pom
2026-09-21T13:24:09.1690900Z Progress (1): 1.3 kB
2026-09-21T13:24:09.1691046Z                     
2026-09-21T13:24:09.1691497Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.pom (1.3 kB at 215 kB/s)
2026-09-21T13:24:09.1740222Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compilers/2.15.0/plexus-compilers-2.15.0.pom
2026-09-21T13:24:09.1800825Z Progress (1): 1.6 kB
2026-09-21T13:24:09.1801015Z                     
2026-09-21T13:24:09.1801566Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compilers/2.15.0/plexus-compilers-2.15.0.pom (1.6 kB at 261 kB/s)
2026-09-21T13:24:09.1879302Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar
2026-09-21T13:24:09.1906154Z Progress (1): 7.7/151 kB
2026-09-21T13:24:09.1906724Z Progress (1): 40/151 kB 
2026-09-21T13:24:09.1907451Z Progress (1): 73/151 kB
2026-09-21T13:24:09.1909052Z Progress (1): 86/151 kB
2026-09-21T13:24:09.1909994Z Progress (1): 111/151 kB
2026-09-21T13:24:09.1910294Z Progress (1): 144/151 kB
2026-09-21T13:24:09.1941212Z Progress (1): 151 kB    
2026-09-21T13:24:09.1941485Z                     
2026-09-21T13:24:09.1941907Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar (151 kB at 22 MB/s)
2026-09-21T13:24:09.1945891Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.jar
2026-09-21T13:24:09.1946619Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.6/asm-9.6.jar
2026-09-21T13:24:09.1948674Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.jar
2026-09-21T13:24:09.1953487Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.jar
2026-09-21T13:24:09.1954545Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.jar
2026-09-21T13:24:09.1978156Z Progress (1): 5.2 kB
2026-09-21T13:24:09.1978853Z Progress (2): 5.2 kB | 7.7/58 kB
2026-09-21T13:24:09.1979429Z Progress (2): 5.2 kB | 41/58 kB 
2026-09-21T13:24:09.1983998Z Progress (2): 5.2 kB | 58 kB   
2026-09-21T13:24:09.1984423Z Progress (3): 5.2 kB | 58 kB | 7.7/124 kB
2026-09-21T13:24:09.1984601Z Progress (4): 5.2 kB | 58 kB | 7.7/124 kB | 5.0/29 kB
2026-09-21T13:24:09.1984725Z Progress (4): 5.2 kB | 58 kB | 7.7/124 kB | 21/29 kB 
2026-09-21T13:24:09.1984889Z Progress (4): 5.2 kB | 58 kB | 40/124 kB | 21/29 kB 
2026-09-21T13:24:09.1985395Z Progress (4): 5.2 kB | 58 kB | 40/124 kB | 27/29 kB
2026-09-21T13:24:09.1985733Z Progress (4): 5.2 kB | 58 kB | 40/124 kB | 29 kB   
2026-09-21T13:24:09.1985904Z Progress (4): 5.2 kB | 58 kB | 73/124 kB | 29 kB
2026-09-21T13:24:09.1986025Z Progress (4): 5.2 kB | 58 kB | 106/124 kB | 29 kB
2026-09-21T13:24:09.1986178Z Progress (4): 5.2 kB | 58 kB | 122/124 kB | 29 kB
2026-09-21T13:24:09.1994085Z Progress (4): 5.2 kB | 58 kB | 124 kB | 29 kB    
2026-09-21T13:24:09.1994733Z Progress (5): 5.2 kB | 58 kB | 124 kB | 29 kB | 7.7/334 kB
2026-09-21T13:24:09.2005433Z Progress (5): 5.2 kB | 58 kB | 124 kB | 29 kB | 33/334 kB 
2026-09-21T13:24:09.2005560Z                                                          
2026-09-21T13:24:09.2006001Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.jar (5.2 kB at 872 kB/s)
2026-09-21T13:24:09.2006395Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.jar
2026-09-21T13:24:09.2011705Z Progress (4): 58 kB | 124 kB | 29 kB | 34/334 kB
2026-09-21T13:24:09.2011928Z Progress (4): 58 kB | 124 kB | 29 kB | 36/334 kB
2026-09-21T13:24:09.2012149Z Progress (4): 58 kB | 124 kB | 29 kB | 46/334 kB
2026-09-21T13:24:09.2012264Z Progress (4): 58 kB | 124 kB | 29 kB | 61/334 kB
2026-09-21T13:24:09.2012415Z Progress (4): 58 kB | 124 kB | 29 kB | 74/334 kB
2026-09-21T13:24:09.2012564Z Progress (4): 58 kB | 124 kB | 29 kB | 82/334 kB
2026-09-21T13:24:09.2012700Z                                                 
2026-09-21T13:24:09.2013113Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.jar (29 kB at 4.2 MB/s)
2026-09-21T13:24:09.2013479Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.jar
2026-09-21T13:24:09.2013646Z Progress (3): 58 kB | 124 kB | 93/334 kB
2026-09-21T13:24:09.2013912Z Progress (3): 58 kB | 124 kB | 98/334 kB
2026-09-21T13:24:09.2014066Z                                         
2026-09-21T13:24:09.2014400Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.jar (58 kB at 8.2 MB/s)
2026-09-21T13:24:09.2014615Z Progress (2): 124 kB | 111/334 kB
2026-09-21T13:24:09.2014720Z Progress (2): 124 kB | 112/334 kB
2026-09-21T13:24:09.2014859Z Progress (2): 124 kB | 126/334 kB
2026-09-21T13:24:09.2014999Z                                  
2026-09-21T13:24:09.2015271Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/ow2/asm/asm/9.6/asm-9.6.jar (124 kB at 18 MB/s)
2026-09-21T13:24:09.2016642Z Progress (1): 143/334 kB
2026-09-21T13:24:09.2018091Z Progress (1): 164/334 kB
2026-09-21T13:24:09.2018241Z Progress (1): 178/334 kB
2026-09-21T13:24:09.2019474Z Progress (1): 180/334 kB
2026-09-21T13:24:09.2020697Z Progress (1): 197/334 kB
2026-09-21T13:24:09.2021038Z Progress (1): 209/334 kB
2026-09-21T13:24:09.2021877Z Progress (1): 213/334 kB
2026-09-21T13:24:09.2025159Z Progress (1): 229/334 kB
2026-09-21T13:24:09.2025261Z Progress (1): 231/334 kB
2026-09-21T13:24:09.2029707Z Progress (1): 232/334 kB
2026-09-21T13:24:09.2031662Z Progress (1): 243/334 kB
2026-09-21T13:24:09.2031954Z Progress (1): 244/334 kB
2026-09-21T13:24:09.2032091Z Progress (2): 244/334 kB | 7.7/26 kB
2026-09-21T13:24:09.2032200Z Progress (2): 262/334 kB | 7.7/26 kB
2026-09-21T13:24:09.2032421Z Progress (2): 268/334 kB | 7.7/26 kB
2026-09-21T13:24:09.2032565Z Progress (2): 268/334 kB | 26 kB    
2026-09-21T13:24:09.2032776Z Progress (2): 300/334 kB | 26 kB
2026-09-21T13:24:09.2032918Z Progress (2): 333/334 kB | 26 kB
2026-09-21T13:24:09.2061919Z Progress (2): 334 kB | 26 kB    
2026-09-21T13:24:09.2062148Z                             
2026-09-21T13:24:09.2062587Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.jar (26 kB at 2.3 MB/s)
2026-09-21T13:24:09.2091326Z Progress (2): 334 kB | 7.7/192 kB
2026-09-21T13:24:09.2091510Z Progress (2): 334 kB | 40/192 kB 
2026-09-21T13:24:09.2091740Z Progress (2): 334 kB | 73/192 kB
2026-09-21T13:24:09.2092729Z Progress (2): 334 kB | 83/192 kB
2026-09-21T13:24:09.2092890Z Progress (2): 334 kB | 87/192 kB
2026-09-21T13:24:09.2093050Z Progress (2): 334 kB | 98/192 kB
2026-09-21T13:24:09.2093197Z                                 
2026-09-21T13:24:09.2093590Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.jar (334 kB at 22 MB/s)
2026-09-21T13:24:09.2101648Z Progress (1): 115/192 kB
2026-09-21T13:24:09.2101840Z Progress (1): 130/192 kB
2026-09-21T13:24:09.2101973Z Progress (1): 141/192 kB
2026-09-21T13:24:09.2109484Z Progress (1): 147/192 kB
2026-09-21T13:24:09.2109650Z Progress (1): 164/192 kB
2026-09-21T13:24:09.2161451Z Progress (1): 192 kB    
2026-09-21T13:24:09.2161647Z                     
2026-09-21T13:24:09.2162063Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.jar (192 kB at 8.7 MB/s)
2026-09-21T13:24:09.3026216Z [INFO] Recompiling the module because of changed source code.
2026-09-21T13:24:09.3071518Z [INFO] Compiling 22 source files with javac [debug parameters release 21] to target/classes
2026-09-21T13:24:10.4510837Z [INFO] Annotation processing is enabled because one or more processors were found
2026-09-21T13:24:10.4511348Z   on the class path. A future release of javac may disable annotation processing
2026-09-21T13:24:10.4512107Z   unless at least one processor is specified by name (-processor), or a search
2026-09-21T13:24:10.4512465Z   path is specified (--processor-path, --processor-module-path), or annotation
2026-09-21T13:24:10.4512795Z   processing is enabled explicitly (-proc:only, -proc:full).
2026-09-21T13:24:10.4513128Z   Use -Xlint:-options to suppress this message.
2026-09-21T13:24:10.4513461Z   Use -proc:none to disable annotation processing.
2026-09-21T13:24:10.4513653Z [INFO] 
2026-09-21T13:24:10.4514256Z [INFO] --- resources:3.3.1:testResources (default-testResources) @ core-starter ---
2026-09-21T13:24:10.4559693Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/4/s/batch-platform/core-starter/src/test/resources
2026-09-21T13:24:10.4559953Z [INFO] 
2026-09-21T13:24:10.4560246Z [INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ core-starter ---
2026-09-21T13:24:10.4613354Z [INFO] Recompiling the module because of changed dependency.
2026-09-21T13:24:10.4615985Z [INFO] Compiling 2 source files with javac [debug parameters release 21] to target/test-classes
2026-09-21T13:24:10.7767530Z [INFO] Annotation processing is enabled because one or more processors were found
2026-09-21T13:24:10.7767808Z   on the class path. A future release of javac may disable annotation processing
2026-09-21T13:24:10.7768251Z   unless at least one processor is specified by name (-processor), or a search
2026-09-21T13:24:10.7768640Z   path is specified (--processor-path, --processor-module-path), or annotation
2026-09-21T13:24:10.7768903Z   processing is enabled explicitly (-proc:only, -proc:full).
2026-09-21T13:24:10.7769139Z   Use -Xlint:-options to suppress this message.
2026-09-21T13:24:10.7769532Z   Use -proc:none to disable annotation processing.
2026-09-21T13:24:10.7769641Z [INFO] 
2026-09-21T13:24:10.7769881Z [INFO] --- surefire:3.2.5:test (default-test) @ core-starter ---
2026-09-21T13:24:10.7831910Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom
2026-09-21T13:24:10.7905993Z Progress (1): 6.2 kB
2026-09-21T13:24:10.7906237Z                     
2026-09-21T13:24:10.7906802Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom (6.2 kB at 780 kB/s)
2026-09-21T13:24:10.7973212Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.pom
2026-09-21T13:24:10.7998372Z Progress (1): 0.9/3.5 kB
2026-09-21T13:24:10.8022377Z Progress (1): 3.5 kB    
2026-09-21T13:24:10.8022629Z                     
2026-09-21T13:24:10.8023093Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.pom (3.5 kB at 706 kB/s)
2026-09-21T13:24:10.8093080Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.pom
2026-09-21T13:24:10.8145424Z Progress (1): 3.3 kB
2026-09-21T13:24:10.8145571Z                     
2026-09-21T13:24:10.8146029Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.pom (3.3 kB at 652 kB/s)
2026-09-21T13:24:10.8214217Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.pom
2026-09-21T13:24:10.8266878Z Progress (1): 4.1 kB
2026-09-21T13:24:10.8267143Z                     
2026-09-21T13:24:10.8267602Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.pom (4.1 kB at 812 kB/s)
2026-09-21T13:24:10.8334492Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.pom
2026-09-21T13:24:10.8387641Z Progress (1): 3.3 kB
2026-09-21T13:24:10.8387760Z                     
2026-09-21T13:24:10.8388148Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.pom (3.3 kB at 661 kB/s)
2026-09-21T13:24:10.8463125Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.pom
2026-09-21T13:24:10.8495123Z Progress (1): 3.7/4.5 kB
2026-09-21T13:24:10.8524092Z Progress (1): 4.5 kB    
2026-09-21T13:24:10.8524334Z                     
2026-09-21T13:24:10.8524814Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.pom (4.5 kB at 742 kB/s)
2026-09-21T13:24:10.8797102Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.pom
2026-09-21T13:24:10.8854826Z Progress (1): 1.8 kB
2026-09-21T13:24:10.8855008Z                     
2026-09-21T13:24:10.8855464Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.pom (1.8 kB at 294 kB/s)
2026-09-21T13:24:10.8931624Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.pom
2026-09-21T13:24:10.8981289Z Progress (1): 2.2 kB
2026-09-21T13:24:10.8981525Z                     
2026-09-21T13:24:10.8982098Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.pom (2.2 kB at 366 kB/s)
2026-09-21T13:24:10.9029458Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether/1.0.0.v20140518/aether-1.0.0.v20140518.pom
2026-09-21T13:24:10.9056780Z Progress (1): 2.3/30 kB
2026-09-21T13:24:10.9056963Z Progress (1): 13/30 kB 
2026-09-21T13:24:10.9109847Z Progress (1): 19/30 kB
2026-09-21T13:24:10.9137688Z Progress (1): 30 kB   
2026-09-21T13:24:10.9138156Z                    
2026-09-21T13:24:10.9138890Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether/1.0.0.v20140518/aether-1.0.0.v20140518.pom (30 kB at 2.7 MB/s)
2026-09-21T13:24:10.9196039Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.pom
2026-09-21T13:24:10.9248760Z Progress (1): 1.9 kB
2026-09-21T13:24:10.9249042Z                     
2026-09-21T13:24:10.9249720Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.pom (1.9 kB at 379 kB/s)
2026-09-21T13:24:10.9321423Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.pom
2026-09-21T13:24:10.9370988Z Progress (1): 5.8 kB
2026-09-21T13:24:10.9371128Z                     
2026-09-21T13:24:10.9371676Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.pom (5.8 kB at 1.2 MB/s)
2026-09-21T13:24:10.9438075Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-artifact/3.2.5/maven-artifact-3.2.5.pom
2026-09-21T13:24:10.9485287Z Progress (1): 2.3 kB
2026-09-21T13:24:10.9485744Z                     
2026-09-21T13:24:10.9486284Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-artifact/3.2.5/maven-artifact-3.2.5.pom (2.3 kB at 470 kB/s)
2026-09-21T13:24:10.9558560Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven/3.2.5/maven-3.2.5.pom
2026-09-21T13:24:10.9581107Z Progress (1): 3.7/22 kB
2026-09-21T13:24:10.9604142Z Progress (1): 22 kB    
2026-09-21T13:24:10.9604281Z                    
2026-09-21T13:24:10.9604583Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven/3.2.5/maven-3.2.5.pom (22 kB at 4.5 MB/s)
2026-09-21T13:24:10.9830381Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/25/maven-parent-25.pom
2026-09-21T13:24:10.9864197Z Progress (1): 0.9/37 kB
2026-09-21T13:24:10.9864445Z Progress (1): 34/37 kB 
2026-09-21T13:24:10.9889603Z Progress (1): 37 kB   
2026-09-21T13:24:10.9889767Z                    
2026-09-21T13:24:10.9890133Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-parent/25/maven-parent-25.pom (37 kB at 6.2 MB/s)
2026-09-21T13:24:10.9950363Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/15/apache-15.pom
2026-09-21T13:24:10.9982265Z Progress (1): 5.0/15 kB
2026-09-21T13:24:11.0005993Z Progress (1): 15 kB    
2026-09-21T13:24:11.0006167Z                    
2026-09-21T13:24:11.0007095Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/apache/15/apache-15.pom (15 kB at 2.5 MB/s)
2026-09-21T13:24:11.0069850Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-core/3.2.5/maven-core-3.2.5.pom
2026-09-21T13:24:11.0096922Z Progress (1): 7.7/8.1 kB
2026-09-21T13:24:11.0195163Z Progress (1): 8.1 kB    
2026-09-21T13:24:11.0195360Z                     
2026-09-21T13:24:11.0195785Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-core/3.2.5/maven-core-3.2.5.pom (8.1 kB at 620 kB/s)
2026-09-21T13:24:11.0255449Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-settings/3.2.5/maven-settings-3.2.5.pom
2026-09-21T13:24:11.0307273Z Progress (1): 2.2 kB
2026-09-21T13:24:11.0307464Z                     
2026-09-21T13:24:11.0307819Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-settings/3.2.5/maven-settings-3.2.5.pom (2.2 kB at 434 kB/s)
2026-09-21T13:24:11.0372284Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-settings-builder/3.2.5/maven-settings-builder-3.2.5.pom
2026-09-21T13:24:11.0456848Z Progress (1): 2.6 kB
2026-09-21T13:24:11.0457137Z                     
2026-09-21T13:24:11.0457643Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-settings-builder/3.2.5/maven-settings-builder-3.2.5.pom (2.6 kB at 324 kB/s)
2026-09-21T13:24:11.0518390Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom
2026-09-21T13:24:11.0568853Z Progress (1): 1.5 kB
2026-09-21T13:24:11.0569375Z                     
2026-09-21T13:24:11.0569697Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom (1.5 kB at 308 kB/s)
2026-09-21T13:24:11.0629387Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom
2026-09-21T13:24:11.0681526Z Progress (1): 3.1 kB
2026-09-21T13:24:11.0681799Z                     
2026-09-21T13:24:11.0682208Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom (3.1 kB at 511 kB/s)
2026-09-21T13:24:11.0745459Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom
2026-09-21T13:24:11.0804282Z Progress (1): 815 B
2026-09-21T13:24:11.0804642Z                    
2026-09-21T13:24:11.0805118Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom (815 B at 136 kB/s)
2026-09-21T13:24:11.0849249Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom
2026-09-21T13:24:11.0875575Z Progress (1): 0.9/4.2 kB
2026-09-21T13:24:11.0921710Z Progress (1): 4.2 kB    
2026-09-21T13:24:11.0923519Z                     
2026-09-21T13:24:11.0924198Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom (4.2 kB at 530 kB/s)
2026-09-21T13:24:11.1023463Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-repository-metadata/3.2.5/maven-repository-metadata-3.2.5.pom
2026-09-21T13:24:11.1070233Z Progress (1): 2.2 kB
2026-09-21T13:24:11.1070469Z                     
2026-09-21T13:24:11.1071057Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-repository-metadata/3.2.5/maven-repository-metadata-3.2.5.pom (2.2 kB at 446 kB/s)
2026-09-21T13:24:11.1133580Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-plugin-api/3.2.5/maven-plugin-api-3.2.5.pom
2026-09-21T13:24:11.1184346Z Progress (1): 3.0 kB
2026-09-21T13:24:11.1184505Z                     
2026-09-21T13:24:11.1184842Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-plugin-api/3.2.5/maven-plugin-api-3.2.5.pom (3.0 kB at 605 kB/s)
2026-09-21T13:24:11.1240624Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.pom
2026-09-21T13:24:11.1270138Z Progress (1): 2.3/15 kB
2026-09-21T13:24:11.1296518Z Progress (1): 15 kB    
2026-09-21T13:24:11.1297018Z                    
2026-09-21T13:24:11.1297500Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.pom (15 kB at 2.5 MB/s)
2026-09-21T13:24:11.1877404Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/sisu-plexus/0.9.0.M2/sisu-plexus-0.9.0.M2.pom
2026-09-21T13:24:11.1910512Z Progress (1): 7.7/15 kB
2026-09-21T13:24:11.1940890Z Progress (1): 15 kB    
2026-09-21T13:24:11.1941115Z                    
2026-09-21T13:24:11.1941536Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/sisu-plexus/0.9.0.M2/sisu-plexus-0.9.0.M2.pom (15 kB at 2.1 MB/s)
2026-09-21T13:24:11.2099062Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom
2026-09-21T13:24:11.2129464Z Progress (1): 7.7/13 kB
2026-09-21T13:24:11.2159062Z Progress (1): 13 kB    
2026-09-21T13:24:11.2159474Z                    
2026-09-21T13:24:11.2160099Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom (13 kB at 2.2 MB/s)
2026-09-21T13:24:11.2210735Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/java/jvnet-parent/3/jvnet-parent-3.pom
2026-09-21T13:24:11.2239571Z Progress (1): 3.7/4.8 kB
2026-09-21T13:24:11.2268322Z Progress (1): 4.8 kB    
2026-09-21T13:24:11.2268492Z                     
2026-09-21T13:24:11.2269031Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/net/java/jvnet-parent/3/jvnet-parent-3.pom (4.8 kB at 798 kB/s)
2026-09-21T13:24:11.2324882Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom
2026-09-21T13:24:11.2371244Z Progress (1): 6.3 kB
2026-09-21T13:24:11.2371396Z                     
2026-09-21T13:24:11.2371707Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom (6.3 kB at 1.3 MB/s)
2026-09-21T13:24:11.2565840Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/weld/weld-parent/26/weld-parent-26.pom
2026-09-21T13:24:11.2598183Z Progress (1): 7.7/32 kB
2026-09-21T13:24:11.2627223Z Progress (1): 32 kB    
2026-09-21T13:24:11.2627571Z                    
2026-09-21T13:24:11.2628022Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/jboss/weld/weld-parent/26/weld-parent-26.pom (32 kB at 5.4 MB/s)
2026-09-21T13:24:11.2686911Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.pom
2026-09-21T13:24:11.2709874Z Progress (1): 7.7/17 kB
2026-09-21T13:24:11.2736735Z Progress (1): 17 kB    
2026-09-21T13:24:11.2736908Z                    
2026-09-21T13:24:11.2737336Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.pom (17 kB at 3.5 MB/s)
2026-09-21T13:24:11.2792727Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/sisu-inject/0.9.0.M2/sisu-inject-0.9.0.M2.pom
2026-09-21T13:24:11.2815814Z Progress (1): 3.7/15 kB
2026-09-21T13:24:11.2841288Z Progress (1): 15 kB    
2026-09-21T13:24:11.2841567Z                    
2026-09-21T13:24:11.2842020Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/sisu/sisu-inject/0.9.0.M2/sisu-inject-0.9.0.M2.pom (15 kB at 3.0 MB/s)
2026-09-21T13:24:11.2892955Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom
2026-09-21T13:24:11.2939371Z Progress (1): 750 B
2026-09-21T13:24:11.2939521Z                    
2026-09-21T13:24:11.2939895Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom (750 B at 188 kB/s)
2026-09-21T13:24:11.2991638Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom
2026-09-21T13:24:11.3041428Z Progress (1): 4.8 kB
2026-09-21T13:24:11.3041733Z                     
2026-09-21T13:24:11.3042497Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom (4.8 kB at 801 kB/s)
2026-09-21T13:24:11.3096268Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom
2026-09-21T13:24:11.3120119Z Progress (1): 7.7/7.9 kB
2026-09-21T13:24:11.3142599Z Progress (1): 7.9 kB    
2026-09-21T13:24:11.3142846Z                     
2026-09-21T13:24:11.3143444Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom (7.9 kB at 1.6 MB/s)
2026-09-21T13:24:11.3608250Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-model-builder/3.2.5/maven-model-builder-3.2.5.pom
2026-09-21T13:24:11.3661455Z Progress (1): 3.0 kB
2026-09-21T13:24:11.3661994Z                     
2026-09-21T13:24:11.3662768Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-model-builder/3.2.5/maven-model-builder-3.2.5.pom (3.0 kB at 599 kB/s)
2026-09-21T13:24:11.3879678Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-aether-provider/3.2.5/maven-aether-provider-3.2.5.pom
2026-09-21T13:24:11.3935723Z Progress (1): 4.2 kB
2026-09-21T13:24:11.3935944Z                     
2026-09-21T13:24:11.3936634Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-aether-provider/3.2.5/maven-aether-provider-3.2.5.pom (4.2 kB at 708 kB/s)
2026-09-21T13:24:11.4370252Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-spi/1.0.0.v20140518/aether-spi-1.0.0.v20140518.pom
2026-09-21T13:24:11.4421373Z Progress (1): 2.1 kB
2026-09-21T13:24:11.4421722Z                     
2026-09-21T13:24:11.4422718Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-spi/1.0.0.v20140518/aether-spi-1.0.0.v20140518.pom (2.1 kB at 342 kB/s)
2026-09-21T13:24:11.4614936Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-impl/1.0.0.v20140518/aether-impl-1.0.0.v20140518.pom
2026-09-21T13:24:11.4666340Z Progress (1): 3.5 kB
2026-09-21T13:24:11.4666576Z                     
2026-09-21T13:24:11.4666998Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-impl/1.0.0.v20140518/aether-impl-1.0.0.v20140518.pom (3.5 kB at 695 kB/s)
2026-09-21T13:24:11.4728248Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/sisu/sisu-guice/3.2.3/sisu-guice-3.2.3.pom
2026-09-21T13:24:11.4751120Z Progress (1): 7.7/11 kB
2026-09-21T13:24:11.4773258Z Progress (1): 11 kB    
2026-09-21T13:24:11.4773921Z                    
2026-09-21T13:24:11.4774367Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/sisu/sisu-guice/3.2.3/sisu-guice-3.2.3.pom (11 kB at 2.2 MB/s)
2026-09-21T13:24:11.4823408Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/sisu/inject/guice-parent/3.2.3/guice-parent-3.2.3.pom
2026-09-21T13:24:11.4845389Z Progress (1): 2.3/13 kB
2026-09-21T13:24:11.4870089Z Progress (1): 13 kB    
2026-09-21T13:24:11.4870241Z                    
2026-09-21T13:24:11.4870600Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/sisu/inject/guice-parent/3.2.3/guice-parent-3.2.3.pom (13 kB at 3.4 MB/s)
2026-09-21T13:24:11.4914827Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/forge/forge-parent/38/forge-parent-38.pom
2026-09-21T13:24:11.4937688Z Progress (1): 0.9/19 kB
2026-09-21T13:24:11.4982126Z Progress (1): 19 kB    
2026-09-21T13:24:11.4982550Z                    
2026-09-21T13:24:11.4982992Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/sonatype/forge/forge-parent/38/forge-parent-38.pom (19 kB at 2.7 MB/s)
2026-09-21T13:24:11.5037544Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/aopalliance/aopalliance/1.0/aopalliance-1.0.pom
2026-09-21T13:24:11.5091709Z Progress (1): 363 B
2026-09-21T13:24:11.5091824Z                    
2026-09-21T13:24:11.5092162Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/aopalliance/aopalliance/1.0/aopalliance-1.0.pom (363 B at 60 kB/s)
2026-09-21T13:24:11.5147758Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/guava/guava/16.0.1/guava-16.0.1.pom
2026-09-21T13:24:11.5169845Z Progress (1): 0.9/6.1 kB
2026-09-21T13:24:11.5193666Z Progress (1): 6.1 kB    
2026-09-21T13:24:11.5194038Z                     
2026-09-21T13:24:11.5194350Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/guava/guava/16.0.1/guava-16.0.1.pom (6.1 kB at 1.2 MB/s)
2026-09-21T13:24:11.5244927Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/guava/guava-parent/16.0.1/guava-parent-16.0.1.pom
2026-09-21T13:24:11.5299799Z Progress (1): 7.3 kB
2026-09-21T13:24:11.5300082Z                     
2026-09-21T13:24:11.5300538Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/google/guava/guava-parent/16.0.1/guava-parent-16.0.1.pom (7.3 kB at 1.5 MB/s)
2026-09-21T13:24:11.5353202Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-classworlds/2.5.2/plexus-classworlds-2.5.2.pom
2026-09-21T13:24:11.5404623Z Progress (1): 7.3 kB
2026-09-21T13:24:11.5404843Z                     
2026-09-21T13:24:11.5405381Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-classworlds/2.5.2/plexus-classworlds-2.5.2.pom (7.3 kB at 1.2 MB/s)
2026-09-21T13:24:11.5525675Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.jar
2026-09-21T13:24:11.5548445Z Progress (1): 0.9/308 kB
2026-09-21T13:24:11.5548616Z Progress (1): 34/308 kB 
2026-09-21T13:24:11.5549141Z Progress (1): 43/308 kB
2026-09-21T13:24:11.5549328Z Progress (1): 45/308 kB
2026-09-21T13:24:11.5549560Z Progress (1): 46/308 kB
2026-09-21T13:24:11.5550464Z Progress (1): 47/308 kB
2026-09-21T13:24:11.5550606Z Progress (1): 60/308 kB
2026-09-21T13:24:11.5550891Z Progress (1): 61/308 kB
2026-09-21T13:24:11.5551025Z Progress (1): 62/308 kB
2026-09-21T13:24:11.5551177Z Progress (1): 73/308 kB
2026-09-21T13:24:11.5551524Z Progress (1): 79/308 kB
2026-09-21T13:24:11.5554217Z Progress (1): 87/308 kB
2026-09-21T13:24:11.5554764Z Progress (1): 88/308 kB
2026-09-21T13:24:11.5555174Z Progress (1): 90/308 kB
2026-09-21T13:24:11.5557584Z Progress (1): 98/308 kB
2026-09-21T13:24:11.5557949Z Progress (1): 101/308 kB
2026-09-21T13:24:11.5558498Z Progress (1): 106/308 kB
2026-09-21T13:24:11.5558862Z Progress (1): 119/308 kB
2026-09-21T13:24:11.5560455Z Progress (1): 123/308 kB
2026-09-21T13:24:11.5561267Z Progress (1): 155/308 kB
2026-09-21T13:24:11.5561960Z Progress (1): 186/308 kB
2026-09-21T13:24:11.5562203Z Progress (1): 207/308 kB
2026-09-21T13:24:11.5562884Z Progress (1): 216/308 kB
2026-09-21T13:24:11.5563060Z Progress (1): 229/308 kB
2026-09-21T13:24:11.5563272Z Progress (1): 231/308 kB
2026-09-21T13:24:11.5564583Z Progress (1): 240/308 kB
2026-09-21T13:24:11.5564895Z Progress (1): 258/308 kB
2026-09-21T13:24:11.5574111Z Progress (1): 262/308 kB
2026-09-21T13:24:11.5575125Z Progress (1): 264/308 kB
2026-09-21T13:24:11.5576146Z Progress (1): 269/308 kB
2026-09-21T13:24:11.5576457Z Progress (1): 280/308 kB
2026-09-21T13:24:11.5577178Z Progress (1): 291/308 kB
2026-09-21T13:24:11.5604289Z Progress (1): 308 kB    
2026-09-21T13:24:11.5604504Z                     
2026-09-21T13:24:11.5604972Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.jar (308 kB at 38 MB/s)
2026-09-21T13:24:11.5609127Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.jar
2026-09-21T13:24:11.5609597Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.jar
2026-09-21T13:24:11.5610247Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.jar
2026-09-21T13:24:11.5611072Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.jar
2026-09-21T13:24:11.5611937Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.jar
2026-09-21T13:24:11.5635174Z Progress (1): 0.9/14 kB
2026-09-21T13:24:11.5643663Z Progress (1): 14 kB    
2026-09-21T13:24:11.5644492Z Progress (2): 14 kB | 0.9/171 kB
2026-09-21T13:24:11.5644728Z Progress (2): 14 kB | 13/171 kB 
2026-09-21T13:24:11.5644847Z Progress (2): 14 kB | 16/171 kB
2026-09-21T13:24:11.5645981Z Progress (2): 14 kB | 17/171 kB
2026-09-21T13:24:11.5646135Z Progress (3): 14 kB | 17/171 kB | 2.3/118 kB
2026-09-21T13:24:11.5646295Z Progress (3): 14 kB | 24/171 kB | 2.3/118 kB
2026-09-21T13:24:11.5646454Z Progress (3): 14 kB | 28/171 kB | 2.3/118 kB
2026-09-21T13:24:11.5646571Z Progress (3): 14 kB | 36/171 kB | 2.3/118 kB
2026-09-21T13:24:11.5646727Z Progress (3): 14 kB | 36/171 kB | 13/118 kB 
2026-09-21T13:24:11.5648901Z Progress (3): 14 kB | 41/171 kB | 13/118 kB
2026-09-21T13:24:11.5649082Z Progress (4): 14 kB | 41/171 kB | 13/118 kB | 7.7/26 kB
2026-09-21T13:24:11.5649878Z Progress (5): 14 kB | 41/171 kB | 13/118 kB | 7.7/26 kB | 5.0/8.2 kB
2026-09-21T13:24:11.5650564Z Progress (5): 14 kB | 41/171 kB | 13/118 kB | 7.7/26 kB | 8.2 kB    
2026-09-21T13:24:11.5650777Z Progress (5): 14 kB | 41/171 kB | 35/118 kB | 7.7/26 kB | 8.2 kB
2026-09-21T13:24:11.5650946Z Progress (5): 14 kB | 41/171 kB | 41/118 kB | 7.7/26 kB | 8.2 kB
2026-09-21T13:24:11.5651226Z Progress (5): 14 kB | 42/171 kB | 41/118 kB | 7.7/26 kB | 8.2 kB
2026-09-21T13:24:11.5653734Z Progress (5): 14 kB | 42/171 kB | 41/118 kB | 26 kB | 8.2 kB    
2026-09-21T13:24:11.5654054Z Progress (5): 14 kB | 43/171 kB | 41/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5655441Z Progress (5): 14 kB | 68/171 kB | 41/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5655623Z Progress (5): 14 kB | 68/171 kB | 42/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5655788Z Progress (5): 14 kB | 68/171 kB | 46/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5656143Z Progress (5): 14 kB | 68/171 kB | 50/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5658661Z Progress (5): 14 kB | 95/171 kB | 50/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5658945Z Progress (5): 14 kB | 95/171 kB | 52/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5659168Z Progress (5): 14 kB | 98/171 kB | 52/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5665781Z Progress (5): 14 kB | 98/171 kB | 75/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5665974Z Progress (5): 14 kB | 98/171 kB | 95/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5666140Z Progress (5): 14 kB | 104/171 kB | 95/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5666273Z Progress (5): 14 kB | 117/171 kB | 95/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5666682Z Progress (5): 14 kB | 125/171 kB | 95/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5666892Z                                                              
2026-09-21T13:24:11.5667429Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.jar (14 kB at 2.3 MB/s)
2026-09-21T13:24:11.5667826Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.jar
2026-09-21T13:24:11.5668041Z Progress (4): 125/171 kB | 97/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5668167Z Progress (4): 149/171 kB | 97/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5668340Z Progress (4): 149/171 kB | 101/118 kB | 26 kB | 8.2 kB
2026-09-21T13:24:11.5668498Z Progress (4): 149/171 kB | 118 kB | 26 kB | 8.2 kB    
2026-09-21T13:24:11.5675670Z Progress (4): 171 kB | 118 kB | 26 kB | 8.2 kB    
2026-09-21T13:24:11.5675822Z                                               
2026-09-21T13:24:11.5676130Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.jar (8.2 kB at 1.2 MB/s)
2026-09-21T13:24:11.5676519Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.jar
2026-09-21T13:24:11.5681127Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.jar (26 kB at 3.2 MB/s)
2026-09-21T13:24:11.5681541Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.jar
2026-09-21T13:24:11.5689348Z Progress (3): 171 kB | 118 kB | 5.0/146 kB
2026-09-21T13:24:11.5689917Z Progress (3): 171 kB | 118 kB | 21/146 kB 
2026-09-21T13:24:11.5690193Z Progress (3): 171 kB | 118 kB | 34/146 kB
2026-09-21T13:24:11.5691922Z Progress (3): 171 kB | 118 kB | 41/146 kB
2026-09-21T13:24:11.5692235Z Progress (3): 171 kB | 118 kB | 63/146 kB
2026-09-21T13:24:11.5697288Z Progress (3): 171 kB | 118 kB | 67/146 kB
2026-09-21T13:24:11.5697522Z Progress (3): 171 kB | 118 kB | 100/146 kB
2026-09-21T13:24:11.5697906Z                                           
2026-09-21T13:24:11.5698685Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.jar (118 kB at 13 MB/s)
2026-09-21T13:24:11.5699373Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.15.1/commons-io-2.15.1.jar
2026-09-21T13:24:11.5699746Z Progress (2): 171 kB | 120/146 kB
2026-09-21T13:24:11.5699980Z Progress (2): 171 kB | 146 kB    
2026-09-21T13:24:11.5700170Z Progress (3): 171 kB | 146 kB | 7.7/136 kB
2026-09-21T13:24:11.5700425Z Progress (3): 171 kB | 146 kB | 27/136 kB 
2026-09-21T13:24:11.5700669Z Progress (3): 171 kB | 146 kB | 28/136 kB
2026-09-21T13:24:11.5701030Z Progress (3): 171 kB | 146 kB | 31/136 kB
2026-09-21T13:24:11.5704034Z Progress (3): 171 kB | 146 kB | 49/136 kB
2026-09-21T13:24:11.5704309Z Progress (3): 171 kB | 146 kB | 50/136 kB
2026-09-21T13:24:11.5704739Z Progress (3): 171 kB | 146 kB | 53/136 kB
2026-09-21T13:24:11.5704975Z Progress (3): 171 kB | 146 kB | 76/136 kB
2026-09-21T13:24:11.5705225Z Progress (4): 171 kB | 146 kB | 76/136 kB | 7.7/61 kB
2026-09-21T13:24:11.5706004Z Progress (4): 171 kB | 146 kB | 76/136 kB | 19/61 kB 
2026-09-21T13:24:11.5707755Z Progress (4): 171 kB | 146 kB | 93/136 kB | 19/61 kB
2026-09-21T13:24:11.5708132Z Progress (4): 171 kB | 146 kB | 125/136 kB | 19/61 kB
2026-09-21T13:24:11.5708915Z Progress (4): 171 kB | 146 kB | 130/136 kB | 19/61 kB
2026-09-21T13:24:11.5709260Z Progress (4): 171 kB | 146 kB | 136 kB | 19/61 kB    
2026-09-21T13:24:11.5709636Z Progress (4): 171 kB | 146 kB | 136 kB | 50/61 kB
2026-09-21T13:24:11.5709848Z Progress (4): 171 kB | 146 kB | 136 kB | 57/61 kB
2026-09-21T13:24:11.5716343Z Progress (4): 171 kB | 146 kB | 136 kB | 60/61 kB
2026-09-21T13:24:11.5716636Z Progress (4): 171 kB | 146 kB | 136 kB | 61 kB   
2026-09-21T13:24:11.5716892Z Progress (5): 171 kB | 146 kB | 136 kB | 61 kB | 0.9/501 kB
2026-09-21T13:24:11.5717772Z Progress (5): 171 kB | 146 kB | 136 kB | 61 kB | 33/501 kB 
2026-09-21T13:24:11.5724659Z Progress (5): 171 kB | 146 kB | 136 kB | 61 kB | 34/501 kB
2026-09-21T13:24:11.5724896Z Progress (5): 171 kB | 146 kB | 136 kB | 61 kB | 41/501 kB
2026-09-21T13:24:11.5725144Z Progress (5): 171 kB | 146 kB | 136 kB | 61 kB | 60/501 kB
2026-09-21T13:24:11.5725512Z Progress (5): 171 kB | 146 kB | 136 kB | 61 kB | 79/501 kB
2026-09-21T13:24:11.5725813Z                                                           
2026-09-21T13:24:11.5726267Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.jar (146 kB at 12 MB/s)
2026-09-21T13:24:11.5726682Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.jar
2026-09-21T13:24:11.5730232Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.jar (171 kB at 14 MB/s)
2026-09-21T13:24:11.5732853Z Progress (3): 136 kB | 61 kB | 112/501 kB
2026-09-21T13:24:11.5734129Z Progress (3): 136 kB | 61 kB | 145/501 kB
2026-09-21T13:24:11.5735053Z Progress (3): 136 kB | 61 kB | 178/501 kB
2026-09-21T13:24:11.5736265Z Progress (3): 136 kB | 61 kB | 210/501 kB
2026-09-21T13:24:11.5737356Z Progress (3): 136 kB | 61 kB | 243/501 kB
2026-09-21T13:24:11.5737584Z                                          
2026-09-21T13:24:11.5738241Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.jar (136 kB at 11 MB/s)
2026-09-21T13:24:11.5739197Z Progress (2): 61 kB | 276/501 kB
2026-09-21T13:24:11.5740420Z Progress (2): 61 kB | 309/501 kB
2026-09-21T13:24:11.5741129Z Progress (2): 61 kB | 341/501 kB
2026-09-21T13:24:11.5742836Z Progress (2): 61 kB | 374/501 kB
2026-09-21T13:24:11.5743084Z Progress (2): 61 kB | 407/501 kB
2026-09-21T13:24:11.5743302Z                                 
2026-09-21T13:24:11.5744056Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.jar (61 kB at 4.7 MB/s)
2026-09-21T13:24:11.5744775Z Progress (1): 440/501 kB
2026-09-21T13:24:11.5747999Z Progress (1): 472/501 kB
2026-09-21T13:24:11.5767230Z Progress (1): 501 kB    
2026-09-21T13:24:11.5767690Z Progress (2): 501 kB | 0/2.4 MB
2026-09-21T13:24:11.5768313Z Progress (2): 501 kB | 0/2.4 MB
2026-09-21T13:24:11.5768596Z Progress (2): 501 kB | 0.1/2.4 MB
2026-09-21T13:24:11.5768878Z Progress (2): 501 kB | 0.1/2.4 MB
2026-09-21T13:24:11.5770887Z Progress (2): 501 kB | 0.1/2.4 MB
2026-09-21T13:24:11.5771127Z                                  
2026-09-21T13:24:11.5771782Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-io/commons-io/2.15.1/commons-io-2.15.1.jar (501 kB at 31 MB/s)
2026-09-21T13:24:11.5777205Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5777400Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5777619Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5777839Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5778531Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5779091Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5779469Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5779993Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5780251Z Progress (1): 0.1/2.4 MB
2026-09-21T13:24:11.5780354Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5782234Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5782419Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5783194Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5783328Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5784381Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5785541Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5785810Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5786026Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5786601Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5786831Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5786992Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5787178Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5789543Z Progress (1): 0.2/2.4 MB
2026-09-21T13:24:11.5789992Z Progress (1): 0.3/2.4 MB
2026-09-21T13:24:11.5790355Z Progress (1): 0.3/2.4 MB
2026-09-21T13:24:11.5790729Z Progress (1): 0.3/2.4 MB
2026-09-21T13:24:11.5790828Z Progress (1): 0.3/2.4 MB
2026-09-21T13:24:11.5790965Z Progress (1): 0.3/2.4 MB
2026-09-21T13:24:11.5791329Z Progress (1): 0.3/2.4 MB
2026-09-21T13:24:11.5793311Z Progress (1): 0.3/2.4 MB
2026-09-21T13:24:11.5794177Z Progress (1): 0.4/2.4 MB
2026-09-21T13:24:11.5794636Z Progress (1): 0.4/2.4 MB
2026-09-21T13:24:11.5795590Z Progress (1): 0.4/2.4 MB
2026-09-21T13:24:11.5796229Z Progress (1): 0.4/2.4 MB
2026-09-21T13:24:11.5796732Z Progress (1): 0.5/2.4 MB
2026-09-21T13:24:11.5796952Z Progress (1): 0.5/2.4 MB
2026-09-21T13:24:11.5799921Z Progress (1): 0.5/2.4 MB
2026-09-21T13:24:11.5800204Z Progress (1): 0.5/2.4 MB
2026-09-21T13:24:11.5800509Z Progress (1): 0.5/2.4 MB
2026-09-21T13:24:11.5801531Z Progress (1): 0.6/2.4 MB
2026-09-21T13:24:11.5802658Z Progress (1): 0.6/2.4 MB
2026-09-21T13:24:11.5803483Z Progress (1): 0.6/2.4 MB
2026-09-21T13:24:11.5805050Z Progress (1): 0.7/2.4 MB
2026-09-21T13:24:11.5805231Z Progress (1): 0.7/2.4 MB
2026-09-21T13:24:11.5805722Z Progress (1): 0.7/2.4 MB
2026-09-21T13:24:11.5805946Z Progress (1): 0.7/2.4 MB
2026-09-21T13:24:11.5808118Z Progress (1): 0.7/2.4 MB
2026-09-21T13:24:11.5810347Z Progress (1): 0.7/2.4 MB
2026-09-21T13:24:11.5810529Z Progress (1): 0.8/2.4 MB
2026-09-21T13:24:11.5812347Z Progress (1): 0.8/2.4 MB
2026-09-21T13:24:11.5812972Z Progress (1): 0.8/2.4 MB
2026-09-21T13:24:11.5814500Z Progress (1): 0.9/2.4 MB
2026-09-21T13:24:11.5815285Z Progress (1): 0.9/2.4 MB
2026-09-21T13:24:11.5815858Z Progress (1): 0.9/2.4 MB
2026-09-21T13:24:11.5817053Z Progress (1): 0.9/2.4 MB
2026-09-21T13:24:11.5817533Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5817760Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5819126Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5819786Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5820381Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5821016Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5821164Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5822115Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5823262Z Progress (1): 1.0/2.4 MB
2026-09-21T13:24:11.5823501Z Progress (1): 1.1/2.4 MB
2026-09-21T13:24:11.5823749Z Progress (1): 1.1/2.4 MB
2026-09-21T13:24:11.5825788Z Progress (1): 1.1/2.4 MB
2026-09-21T13:24:11.5826508Z Progress (1): 1.1/2.4 MB
2026-09-21T13:24:11.5827070Z Progress (1): 1.1/2.4 MB
2026-09-21T13:24:11.5827349Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5827703Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5828577Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5829280Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5829502Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5830084Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5830462Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5831111Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5831333Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5831551Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5831972Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5832727Z Progress (1): 1.2/2.4 MB
2026-09-21T13:24:11.5832969Z Progress (1): 1.3/2.4 MB
2026-09-21T13:24:11.5834443Z Progress (1): 1.3/2.4 MB
2026-09-21T13:24:11.5836178Z Progress (1): 1.3/2.4 MB
2026-09-21T13:24:11.5836920Z Progress (1): 1.3/2.4 MB
2026-09-21T13:24:11.5838103Z Progress (1): 1.3/2.4 MB
2026-09-21T13:24:11.5838866Z Progress (1): 1.4/2.4 MB
2026-09-21T13:24:11.5839858Z Progress (1): 1.4/2.4 MB
2026-09-21T13:24:11.5840182Z Progress (1): 1.4/2.4 MB
2026-09-21T13:24:11.5840572Z Progress (1): 1.5/2.4 MB
2026-09-21T13:24:11.5841052Z Progress (1): 1.5/2.4 MB
2026-09-21T13:24:11.5842802Z Progress (1): 1.5/2.4 MB
2026-09-21T13:24:11.5842977Z Progress (1): 1.5/2.4 MB
2026-09-21T13:24:11.5844086Z Progress (1): 1.5/2.4 MB
2026-09-21T13:24:11.5844830Z Progress (1): 1.5/2.4 MB
2026-09-21T13:24:11.5845610Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5846104Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5846279Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5847510Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5847872Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5848901Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5849135Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5849637Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5850453Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5851087Z Progress (1): 1.6/2.4 MB
2026-09-21T13:24:11.5851794Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5852014Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5852363Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5852685Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5853034Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5854076Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5854346Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5855176Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5855424Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5856103Z Progress (1): 1.7/2.4 MB
2026-09-21T13:24:11.5856981Z Progress (1): 1.8/2.4 MB
2026-09-21T13:24:11.5858544Z Progress (1): 1.8/2.4 MB
2026-09-21T13:24:11.5859381Z Progress (1): 1.8/2.4 MB
2026-09-21T13:24:11.5860011Z Progress (1): 1.8/2.4 MB
2026-09-21T13:24:11.5860229Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5861257Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5861483Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5861898Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5862276Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5862746Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5863177Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5864385Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5865225Z Progress (1): 1.9/2.4 MB
2026-09-21T13:24:11.5865560Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5866598Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5867125Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5867357Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5867968Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5868579Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5868793Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5870869Z Progress (1): 2.0/2.4 MB
2026-09-21T13:24:11.5871617Z Progress (1): 2.1/2.4 MB
2026-09-21T13:24:11.5872268Z Progress (1): 2.1/2.4 MB
2026-09-21T13:24:11.5872620Z Progress (1): 2.1/2.4 MB
2026-09-21T13:24:11.5873188Z Progress (1): 2.1/2.4 MB
2026-09-21T13:24:11.5874028Z Progress (1): 2.1/2.4 MB
2026-09-21T13:24:11.5874441Z Progress (1): 2.2/2.4 MB
2026-09-21T13:24:11.5876071Z Progress (1): 2.2/2.4 MB
2026-09-21T13:24:11.5876248Z Progress (1): 2.2/2.4 MB
2026-09-21T13:24:11.5876523Z Progress (1): 2.2/2.4 MB
2026-09-21T13:24:11.5877380Z Progress (1): 2.2/2.4 MB
2026-09-21T13:24:11.5878484Z Progress (1): 2.2/2.4 MB
2026-09-21T13:24:11.5879361Z Progress (1): 2.2/2.4 MB
2026-09-21T13:24:11.5880466Z Progress (1): 2.3/2.4 MB
2026-09-21T13:24:11.5881247Z Progress (1): 2.3/2.4 MB
2026-09-21T13:24:11.5881606Z Progress (1): 2.3/2.4 MB
2026-09-21T13:24:11.5881966Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5882472Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5882647Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5883508Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5883797Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5884486Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5884895Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5885008Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5885597Z Progress (1): 2.4/2.4 MB
2026-09-21T13:24:11.5914505Z Progress (1): 2.4 MB    
2026-09-21T13:24:11.5914768Z                     
2026-09-21T13:24:11.5915604Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.jar (2.4 MB at 81 MB/s)
2026-09-21T13:24:11.7324436Z [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
2026-09-21T13:24:11.7446306Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.pom
2026-09-21T13:24:11.7500604Z Progress (1): 4.7 kB
2026-09-21T13:24:11.7500850Z                     
2026-09-21T13:24:11.7501316Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.pom (4.7 kB at 933 kB/s)
2026-09-21T13:24:11.7553158Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-providers/3.2.5/surefire-providers-3.2.5.pom
2026-09-21T13:24:11.7576094Z Progress (1): 2.3/2.6 kB
2026-09-21T13:24:11.7601104Z Progress (1): 2.6 kB    
2026-09-21T13:24:11.7601354Z                     
2026-09-21T13:24:11.7602053Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-providers/3.2.5/surefire-providers-3.2.5.pom (2.6 kB at 522 kB/s)
2026-09-21T13:24:11.7673243Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.pom
2026-09-21T13:24:11.7724425Z Progress (1): 2.8 kB
2026-09-21T13:24:11.7724579Z                     
2026-09-21T13:24:11.7724925Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.pom (2.8 kB at 563 kB/s)
2026-09-21T13:24:11.7786496Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.pom
2026-09-21T13:24:11.7843590Z Progress (1): 3.0 kB
2026-09-21T13:24:11.7843778Z                     
2026-09-21T13:24:11.7844212Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.pom (3.0 kB at 504 kB/s)
2026-09-21T13:24:11.8040413Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.pom
2026-09-21T13:24:11.8100087Z Progress (1): 3.2 kB
2026-09-21T13:24:11.8100236Z                     
2026-09-21T13:24:11.8100730Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.pom (3.2 kB at 534 kB/s)
2026-09-21T13:24:11.8160445Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom
2026-09-21T13:24:11.8205292Z Progress (1): 1.7 kB
2026-09-21T13:24:11.8205468Z                     
2026-09-21T13:24:11.8205824Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom (1.7 kB at 337 kB/s)
2026-09-21T13:24:11.8254411Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.pom
2026-09-21T13:24:11.8281569Z Progress (1): 2.3/2.8 kB
2026-09-21T13:24:11.8309546Z Progress (1): 2.8 kB    
2026-09-21T13:24:11.8309801Z                     
2026-09-21T13:24:11.8310270Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.pom (2.8 kB at 566 kB/s)
2026-09-21T13:24:11.8368350Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.jar
2026-09-21T13:24:11.8390490Z Progress (1): 0.9/27 kB
2026-09-21T13:24:11.8415801Z Progress (1): 27 kB    
2026-09-21T13:24:11.8416266Z                    
2026-09-21T13:24:11.8417418Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.jar (27 kB at 5.4 MB/s)
2026-09-21T13:24:11.8419358Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.jar
2026-09-21T13:24:11.8419792Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar
2026-09-21T13:24:11.8421859Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar
2026-09-21T13:24:11.8422379Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar
2026-09-21T13:24:11.8424239Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar
2026-09-21T13:24:11.8442509Z Progress (1): 2.3/18 kB
2026-09-21T13:24:11.8447879Z Progress (1): 18 kB    
2026-09-21T13:24:11.8448322Z Progress (2): 18 kB | 0.9/7.7 kB
2026-09-21T13:24:11.8450617Z Progress (2): 18 kB | 7.7 kB    
2026-09-21T13:24:11.8457343Z Progress (3): 18 kB | 7.7 kB | 3.6/189 kB
2026-09-21T13:24:11.8457518Z Progress (3): 18 kB | 7.7 kB | 32/189 kB 
2026-09-21T13:24:11.8457647Z Progress (3): 18 kB | 7.7 kB | 56/189 kB
2026-09-21T13:24:11.8457795Z Progress (3): 18 kB | 7.7 kB | 68/189 kB
2026-09-21T13:24:11.8457947Z Progress (4): 18 kB | 7.7 kB | 68/189 kB | 7.7/103 kB
2026-09-21T13:24:11.8458107Z Progress (4): 18 kB | 7.7 kB | 81/189 kB | 7.7/103 kB
2026-09-21T13:24:11.8458279Z Progress (4): 18 kB | 7.7 kB | 83/189 kB | 7.7/103 kB
2026-09-21T13:24:11.8458396Z Progress (4): 18 kB | 7.7 kB | 83/189 kB | 28/103 kB 
2026-09-21T13:24:11.8458564Z Progress (4): 18 kB | 7.7 kB | 97/189 kB | 28/103 kB
2026-09-21T13:24:11.8458810Z Progress (4): 18 kB | 7.7 kB | 98/189 kB | 28/103 kB
2026-09-21T13:24:11.8458958Z Progress (4): 18 kB | 7.7 kB | 102/189 kB | 28/103 kB
2026-09-21T13:24:11.8459080Z Progress (4): 18 kB | 7.7 kB | 107/189 kB | 28/103 kB
2026-09-21T13:24:11.8459243Z Progress (4): 18 kB | 7.7 kB | 107/189 kB | 42/103 kB
2026-09-21T13:24:11.8459400Z Progress (5): 18 kB | 7.7 kB | 107/189 kB | 42/103 kB | 6.4/169 kB
2026-09-21T13:24:11.8459567Z Progress (5): 18 kB | 7.7 kB | 107/189 kB | 63/103 kB | 6.4/169 kB
2026-09-21T13:24:11.8459737Z Progress (5): 18 kB | 7.7 kB | 108/189 kB | 63/103 kB | 6.4/169 kB
2026-09-21T13:24:11.8459871Z Progress (5): 18 kB | 7.7 kB | 108/189 kB | 76/103 kB | 6.4/169 kB
2026-09-21T13:24:11.8460031Z Progress (5): 18 kB | 7.7 kB | 113/189 kB | 76/103 kB | 6.4/169 kB
2026-09-21T13:24:11.8460201Z Progress (5): 18 kB | 7.7 kB | 113/189 kB | 76/103 kB | 39/169 kB 
2026-09-21T13:24:11.8460383Z Progress (5): 18 kB | 7.7 kB | 113/189 kB | 90/103 kB | 39/169 kB
2026-09-21T13:24:11.8460539Z Progress (5): 18 kB | 7.7 kB | 115/189 kB | 90/103 kB | 39/169 kB
2026-09-21T13:24:11.8460660Z Progress (5): 18 kB | 7.7 kB | 116/189 kB | 90/103 kB | 39/169 kB
2026-09-21T13:24:11.8460848Z Progress (5): 18 kB | 7.7 kB | 116/189 kB | 90/103 kB | 72/169 kB
2026-09-21T13:24:11.8461181Z Progress (5): 18 kB | 7.7 kB | 120/189 kB | 90/103 kB | 72/169 kB
2026-09-21T13:24:11.8465749Z Progress (5): 18 kB | 7.7 kB | 144/189 kB | 90/103 kB | 72/169 kB
2026-09-21T13:24:11.8465984Z Progress (5): 18 kB | 7.7 kB | 152/189 kB | 90/103 kB | 72/169 kB
2026-09-21T13:24:11.8466137Z Progress (5): 18 kB | 7.7 kB | 152/189 kB | 98/103 kB | 72/169 kB
2026-09-21T13:24:11.8466268Z Progress (5): 18 kB | 7.7 kB | 152/189 kB | 103 kB | 72/169 kB   
2026-09-21T13:24:11.8466427Z Progress (5): 18 kB | 7.7 kB | 152/189 kB | 103 kB | 105/169 kB
2026-09-21T13:24:11.8466610Z Progress (5): 18 kB | 7.7 kB | 167/189 kB | 103 kB | 105/169 kB
2026-09-21T13:24:11.8466831Z Progress (5): 18 kB | 7.7 kB | 180/189 kB | 103 kB | 105/169 kB
2026-09-21T13:24:11.8466986Z Progress (5): 18 kB | 7.7 kB | 183/189 kB | 103 kB | 105/169 kB
2026-09-21T13:24:11.8467110Z Progress (5): 18 kB | 7.7 kB | 189 kB | 103 kB | 105/169 kB    
2026-09-21T13:24:11.8467277Z Progress (5): 18 kB | 7.7 kB | 189 kB | 103 kB | 137/169 kB
2026-09-21T13:24:11.8470662Z Progress (5): 18 kB | 7.7 kB | 189 kB | 103 kB | 169 kB    
2026-09-21T13:24:11.8471008Z                                                        
2026-09-21T13:24:11.8471479Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.jar (18 kB at 3.5 MB/s)
2026-09-21T13:24:11.8474220Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar (7.7 kB at 1.3 MB/s)
2026-09-21T13:24:11.8489799Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar (103 kB at 17 MB/s)
2026-09-21T13:24:11.8492308Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar (189 kB at 24 MB/s)
2026-09-21T13:24:11.8494554Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar (169 kB at 21 MB/s)
2026-09-21T13:24:11.8722831Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.12.2/junit-platform-launcher-1.12.2.pom
2026-09-21T13:24:11.8826222Z Progress (1): 3.0 kB
2026-09-21T13:24:11.8826468Z                     
2026-09-21T13:24:11.8826932Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.12.2/junit-platform-launcher-1.12.2.pom (3.0 kB at 275 kB/s)
2026-09-21T13:24:11.8882794Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.12.2/junit-platform-launcher-1.12.2.jar
2026-09-21T13:24:11.8945295Z Progress (1): 2.3/208 kB
2026-09-21T13:24:11.8955869Z Progress (1): 33/208 kB 
2026-09-21T13:24:11.8962584Z Progress (1): 37/208 kB
2026-09-21T13:24:11.8962750Z Progress (1): 42/208 kB
2026-09-21T13:24:11.8962903Z Progress (1): 56/208 kB
2026-09-21T13:24:11.8963033Z Progress (1): 67/208 kB
2026-09-21T13:24:11.8963129Z Progress (1): 76/208 kB
2026-09-21T13:24:11.8963261Z Progress (1): 83/208 kB
2026-09-21T13:24:11.8963451Z Progress (1): 93/208 kB
2026-09-21T13:24:11.8963583Z Progress (1): 96/208 kB
2026-09-21T13:24:11.8963682Z Progress (1): 107/208 kB
2026-09-21T13:24:11.8964016Z Progress (1): 111/208 kB
2026-09-21T13:24:11.8964170Z Progress (1): 119/208 kB
2026-09-21T13:24:11.8964320Z Progress (1): 122/208 kB
2026-09-21T13:24:11.8964447Z Progress (1): 126/208 kB
2026-09-21T13:24:11.8964932Z Progress (1): 127/208 kB
2026-09-21T13:24:11.8965636Z Progress (1): 160/208 kB
2026-09-21T13:24:11.8965794Z Progress (1): 167/208 kB
2026-09-21T13:24:11.8965938Z Progress (1): 171/208 kB
2026-09-21T13:24:11.8967343Z Progress (1): 174/208 kB
2026-09-21T13:24:11.8967481Z Progress (1): 182/208 kB
2026-09-21T13:24:11.9059877Z Progress (1): 208 kB    
2026-09-21T13:24:11.9060066Z                     
2026-09-21T13:24:11.9060597Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/junit/platform/junit-platform-launcher/1.12.2/junit-platform-launcher-1.12.2.jar (208 kB at 12 MB/s)
2026-09-21T13:24:11.9167342Z [INFO] 
2026-09-21T13:24:11.9167713Z [INFO] -------------------------------------------------------
2026-09-21T13:24:11.9167887Z [INFO]  T E S T S
2026-09-21T13:24:11.9168088Z [INFO] -------------------------------------------------------
2026-09-21T13:24:12.6001452Z [INFO] Running br.org.caixa.siifx.caixinhas.batch.core.exit.CalculadoraCodigoSaidaTest
2026-09-21T13:24:12.6744829Z [INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.066 s -- in br.org.caixa.siifx.caixinhas.batch.core.exit.CalculadoraCodigoSaidaTest
2026-09-21T13:24:12.6745164Z [INFO] Running br.org.caixa.siifx.caixinhas.batch.core.validation.OdateJobParametersValidatorTest
2026-09-21T13:24:12.6860113Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 s -- in br.org.caixa.siifx.caixinhas.batch.core.validation.OdateJobParametersValidatorTest
2026-09-21T13:24:12.7065342Z [INFO] 
2026-09-21T13:24:12.7065709Z [INFO] Results:
2026-09-21T13:24:12.7065836Z [INFO] 
2026-09-21T13:24:12.7065996Z [INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
2026-09-21T13:24:12.7066137Z [INFO] 
2026-09-21T13:24:12.7090745Z [INFO] 
2026-09-21T13:24:12.7091347Z [INFO] --- jar:3.4.1:jar (default-jar) @ core-starter ---
2026-09-21T13:24:12.7175860Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom
2026-09-21T13:24:12.7243354Z Progress (1): 2.3/4.4 kB
2026-09-21T13:24:12.7323205Z Progress (1): 4.4 kB    
2026-09-21T13:24:12.7323339Z                     
2026-09-21T13:24:12.7324000Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom (4.4 kB at 292 kB/s)
2026-09-21T13:24:12.7409782Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom
2026-09-21T13:24:12.7484948Z Progress (1): 0.9/3.2 kB
2026-09-21T13:24:12.7541795Z Progress (1): 3.2 kB    
2026-09-21T13:24:12.7541969Z                     
2026-09-21T13:24:12.7542414Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom (3.2 kB at 227 kB/s)
2026-09-21T13:24:12.7604220Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom
2026-09-21T13:24:12.7673298Z Progress (1): 2.3/6.0 kB
2026-09-21T13:24:12.7754897Z Progress (1): 6.0 kB    
2026-09-21T13:24:12.7755123Z                     
2026-09-21T13:24:12.7755566Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom (6.0 kB at 399 kB/s)
2026-09-21T13:24:12.8152473Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom
2026-09-21T13:24:12.8257778Z Progress (1): 3.9 kB
2026-09-21T13:24:12.8257915Z                     
2026-09-21T13:24:12.8258343Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom (3.9 kB at 351 kB/s)
2026-09-21T13:24:12.8307712Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/16/plexus-16.pom
2026-09-21T13:24:12.8334907Z Progress (1): 7.7/28 kB
2026-09-21T13:24:12.8362819Z Progress (1): 28 kB    
2026-09-21T13:24:12.8362976Z                    
2026-09-21T13:24:12.8363336Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus/16/plexus-16.pom (28 kB at 4.6 MB/s)
2026-09-21T13:24:12.8424725Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom
2026-09-21T13:24:12.8519939Z Progress (1): 2.3/22 kB
2026-09-21T13:24:12.8573783Z Progress (1): 22 kB    
2026-09-21T13:24:12.8577258Z                    
2026-09-21T13:24:12.8577668Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom (22 kB at 1.5 MB/s)
2026-09-21T13:24:12.8685951Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom
2026-09-21T13:24:12.8780869Z Progress (1): 7.7/16 kB
2026-09-21T13:24:12.8841845Z Progress (1): 16 kB    
2026-09-21T13:24:12.8842063Z                    
2026-09-21T13:24:12.8842553Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom (16 kB at 980 kB/s)
2026-09-21T13:24:12.8917682Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/iq80/snappy/snappy/0.4/snappy-0.4.pom
2026-09-21T13:24:12.8959535Z Progress (1): 0.9/15 kB
2026-09-21T13:24:12.8997988Z Progress (1): 15 kB    
2026-09-21T13:24:12.8998271Z                    
2026-09-21T13:24:12.8998670Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/iq80/snappy/snappy/0.4/snappy-0.4.pom (15 kB at 1.8 MB/s)
2026-09-21T13:24:12.9053274Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/tukaani/xz/1.9/xz-1.9.pom
2026-09-21T13:24:12.9126445Z Progress (1): 2.0 kB
2026-09-21T13:24:12.9126632Z                     
2026-09-21T13:24:12.9126993Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/tukaani/xz/1.9/xz-1.9.pom (2.0 kB at 292 kB/s)
2026-09-21T13:24:12.9176172Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom
2026-09-21T13:24:12.9241212Z Progress (1): 0.9/2.0 kB
2026-09-21T13:24:12.9291932Z Progress (1): 2.0 kB    
2026-09-21T13:24:12.9292087Z                     
2026-09-21T13:24:12.9292454Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom (2.0 kB at 167 kB/s)
2026-09-21T13:24:12.9751938Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom
2026-09-21T13:24:12.9788693Z Progress (1): 2.3/3.0 kB
2026-09-21T13:24:12.9821023Z Progress (1): 3.0 kB    
2026-09-21T13:24:12.9821579Z                     
2026-09-21T13:24:12.9821989Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom (3.0 kB at 378 kB/s)
2026-09-21T13:24:12.9901557Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar
2026-09-21T13:24:12.9993730Z Progress (1): 0.9/27 kB
2026-09-21T13:24:13.0077629Z Progress (1): 27 kB    
2026-09-21T13:24:13.0077841Z                    
2026-09-21T13:24:13.0078325Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar (27 kB at 1.5 MB/s)
2026-09-21T13:24:13.0082782Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar
2026-09-21T13:24:13.0083181Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.jar
2026-09-21T13:24:13.0087632Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.jar
2026-09-21T13:24:13.0088157Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.jar
2026-09-21T13:24:13.0088545Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.jar
2026-09-21T13:24:13.0120330Z Progress (1): 0.9/86 kB
2026-09-21T13:24:13.0122423Z Progress (1): 34/86 kB 
2026-09-21T13:24:13.0122715Z Progress (1): 56/86 kB
2026-09-21T13:24:13.0123027Z Progress (1): 59/86 kB
2026-09-21T13:24:13.0127824Z Progress (1): 61/86 kB
2026-09-21T13:24:13.0154304Z Progress (1): 86 kB   
2026-09-21T13:24:13.0154609Z                    
2026-09-21T13:24:13.0155092Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar (86 kB at 11 MB/s)
2026-09-21T13:24:13.0155457Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/iq80/snappy/snappy/0.4/snappy-0.4.jar
2026-09-21T13:24:13.0180197Z Progress (1): 2.3/58 kB
2026-09-21T13:24:13.0180380Z Progress (1): 35/58 kB 
2026-09-21T13:24:13.0206120Z Progress (1): 58 kB   
2026-09-21T13:24:13.0206302Z                    
2026-09-21T13:24:13.0206739Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/iq80/snappy/snappy/0.4/snappy-0.4.jar (58 kB at 4.8 MB/s)
2026-09-21T13:24:13.0207271Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/tukaani/xz/1.9/xz-1.9.jar
2026-09-21T13:24:13.0216263Z Progress (1): 2.3/225 kB
2026-09-21T13:24:13.0219568Z Progress (1): 13/225 kB 
2026-09-21T13:24:13.0219829Z Progress (1): 15/225 kB
2026-09-21T13:24:13.0220036Z Progress (1): 16/225 kB
2026-09-21T13:24:13.0220192Z Progress (1): 19/225 kB
2026-09-21T13:24:13.0220396Z Progress (1): 23/225 kB
2026-09-21T13:24:13.0227400Z Progress (1): 41/225 kB
2026-09-21T13:24:13.0227721Z Progress (1): 42/225 kB
2026-09-21T13:24:13.0228177Z Progress (1): 46/225 kB
2026-09-21T13:24:13.0228334Z Progress (1): 61/225 kB
2026-09-21T13:24:13.0228529Z Progress (1): 68/225 kB
2026-09-21T13:24:13.0228731Z Progress (1): 79/225 kB
2026-09-21T13:24:13.0228930Z Progress (1): 82/225 kB
2026-09-21T13:24:13.0229090Z Progress (1): 83/225 kB
2026-09-21T13:24:13.0229284Z Progress (1): 87/225 kB
2026-09-21T13:24:13.0229855Z Progress (1): 95/225 kB
2026-09-21T13:24:13.0230411Z Progress (2): 95/225 kB | 0.9/79 kB
2026-09-21T13:24:13.0230998Z Progress (2): 95/225 kB | 13/79 kB 
2026-09-21T13:24:13.0231538Z Progress (3): 95/225 kB | 13/79 kB | 7.7/116 kB
2026-09-21T13:24:13.0232134Z Progress (3): 97/225 kB | 13/79 kB | 7.7/116 kB
2026-09-21T13:24:13.0232680Z Progress (3): 98/225 kB | 13/79 kB | 7.7/116 kB
2026-09-21T13:24:13.0232832Z Progress (3): 98/225 kB | 13/79 kB | 40/116 kB 
2026-09-21T13:24:13.0233029Z Progress (3): 98/225 kB | 16/79 kB | 40/116 kB
2026-09-21T13:24:13.0234603Z Progress (3): 98/225 kB | 16/79 kB | 73/116 kB
2026-09-21T13:24:13.0234945Z Progress (3): 98/225 kB | 16/79 kB | 106/116 kB
2026-09-21T13:24:13.0236298Z Progress (3): 98/225 kB | 16/79 kB | 116 kB    
2026-09-21T13:24:13.0236450Z Progress (3): 98/225 kB | 17/79 kB | 116 kB
2026-09-21T13:24:13.0236649Z Progress (3): 98/225 kB | 19/79 kB | 116 kB
2026-09-21T13:24:13.0236801Z Progress (3): 98/225 kB | 21/79 kB | 116 kB
2026-09-21T13:24:13.0236917Z Progress (3): 98/225 kB | 38/79 kB | 116 kB
2026-09-21T13:24:13.0241482Z Progress (3): 98/225 kB | 46/79 kB | 116 kB
2026-09-21T13:24:13.0243029Z Progress (4): 98/225 kB | 46/79 kB | 116 kB | 0.9/365 kB
2026-09-21T13:24:13.0243196Z Progress (4): 98/225 kB | 46/79 kB | 116 kB | 13/365 kB 
2026-09-21T13:24:13.0243889Z Progress (4): 98/225 kB | 47/79 kB | 116 kB | 13/365 kB
2026-09-21T13:24:13.0245323Z Progress (4): 98/225 kB | 64/79 kB | 116 kB | 13/365 kB
2026-09-21T13:24:13.0245452Z Progress (4): 98/225 kB | 79 kB | 116 kB | 13/365 kB   
2026-09-21T13:24:13.0245627Z Progress (4): 98/225 kB | 79 kB | 116 kB | 15/365 kB
2026-09-21T13:24:13.0246359Z Progress (4): 98/225 kB | 79 kB | 116 kB | 16/365 kB
2026-09-21T13:24:13.0246519Z Progress (4): 98/225 kB | 79 kB | 116 kB | 23/365 kB
2026-09-21T13:24:13.0247051Z Progress (4): 98/225 kB | 79 kB | 116 kB | 30/365 kB
2026-09-21T13:24:13.0250692Z Progress (4): 98/225 kB | 79 kB | 116 kB | 34/365 kB
2026-09-21T13:24:13.0250847Z Progress (4): 101/225 kB | 79 kB | 116 kB | 34/365 kB
2026-09-21T13:24:13.0251992Z Progress (4): 101/225 kB | 79 kB | 116 kB | 41/365 kB
2026-09-21T13:24:13.0252174Z Progress (5): 101/225 kB | 79 kB | 116 kB | 41/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0255026Z Progress (5): 101/225 kB | 79 kB | 116 kB | 41/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0255194Z Progress (5): 101/225 kB | 79 kB | 116 kB | 41/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0255559Z Progress (5): 134/225 kB | 79 kB | 116 kB | 41/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0255689Z Progress (5): 134/225 kB | 79 kB | 116 kB | 41/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0255886Z Progress (5): 134/225 kB | 79 kB | 116 kB | 41/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0259190Z Progress (5): 167/225 kB | 79 kB | 116 kB | 41/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0259360Z Progress (5): 167/225 kB | 79 kB | 116 kB | 73/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0259520Z Progress (5): 199/225 kB | 79 kB | 116 kB | 73/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0259674Z Progress (5): 199/225 kB | 79 kB | 116 kB | 78/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0259803Z Progress (5): 219/225 kB | 79 kB | 116 kB | 78/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0260015Z Progress (5): 225 kB | 79 kB | 116 kB | 78/365 kB | 0/1.1 MB    
2026-09-21T13:24:13.0260205Z Progress (5): 225 kB | 79 kB | 116 kB | 78/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0260370Z Progress (5): 225 kB | 79 kB | 116 kB | 79/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0260539Z Progress (5): 225 kB | 79 kB | 116 kB | 80/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0260663Z Progress (5): 225 kB | 79 kB | 116 kB | 93/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0260821Z Progress (5): 225 kB | 79 kB | 116 kB | 94/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0265158Z Progress (5): 225 kB | 79 kB | 116 kB | 95/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0265318Z                                                             
2026-09-21T13:24:13.0265826Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/tukaani/xz/1.9/xz-1.9.jar (116 kB at 6.4 MB/s)
2026-09-21T13:24:13.0266045Z Progress (4): 225 kB | 79 kB | 95/365 kB | 0/1.1 MB
2026-09-21T13:24:13.0266209Z                                                    
2026-09-21T13:24:13.0266563Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.jar
2026-09-21T13:24:13.0266742Z Progress (4): 225 kB | 79 kB | 95/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0266980Z Progress (4): 225 kB | 79 kB | 95/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0267141Z Progress (4): 225 kB | 79 kB | 95/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0267294Z Progress (4): 225 kB | 79 kB | 95/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0267449Z Progress (4): 225 kB | 79 kB | 114/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0267572Z Progress (4): 225 kB | 79 kB | 114/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0267724Z Progress (4): 225 kB | 79 kB | 114/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0267877Z Progress (4): 225 kB | 79 kB | 147/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0268046Z Progress (4): 225 kB | 79 kB | 147/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0268209Z Progress (4): 225 kB | 79 kB | 169/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0268322Z Progress (4): 225 kB | 79 kB | 175/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0270229Z Progress (4): 225 kB | 79 kB | 176/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0271216Z Progress (4): 225 kB | 79 kB | 176/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0286583Z Progress (4): 225 kB | 79 kB | 176/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0286749Z Progress (4): 225 kB | 79 kB | 176/365 kB | 0.1/1.1 MB
2026-09-21T13:24:13.0286866Z Progress (4): 225 kB | 79 kB | 176/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0287016Z Progress (4): 225 kB | 79 kB | 209/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0287273Z Progress (4): 225 kB | 79 kB | 209/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0287476Z Progress (4): 225 kB | 79 kB | 233/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0287649Z Progress (4): 225 kB | 79 kB | 233/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0287770Z Progress (4): 225 kB | 79 kB | 233/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0287916Z Progress (4): 225 kB | 79 kB | 233/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0288062Z Progress (4): 225 kB | 79 kB | 233/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0288213Z Progress (4): 225 kB | 79 kB | 233/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0288365Z Progress (4): 225 kB | 79 kB | 266/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0288531Z Progress (4): 225 kB | 79 kB | 299/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0288684Z Progress (4): 225 kB | 79 kB | 299/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0288857Z Progress (4): 225 kB | 79 kB | 299/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0289010Z Progress (4): 225 kB | 79 kB | 332/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0289163Z Progress (4): 225 kB | 79 kB | 365/365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0316663Z Progress (4): 225 kB | 79 kB | 365 kB | 0.2/1.1 MB    
2026-09-21T13:24:13.0316790Z Progress (4): 225 kB | 79 kB | 365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0318932Z Progress (4): 225 kB | 79 kB | 365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0319091Z Progress (4): 225 kB | 79 kB | 365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0319528Z Progress (4): 225 kB | 79 kB | 365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0321699Z Progress (4): 225 kB | 79 kB | 365 kB | 0.2/1.1 MB
2026-09-21T13:24:13.0321973Z Progress (4): 225 kB | 79 kB | 365 kB | 0.3/1.1 MB
2026-09-21T13:24:13.0322135Z Progress (4): 225 kB | 79 kB | 365 kB | 0.3/1.1 MB
2026-09-21T13:24:13.0322451Z Progress (4): 225 kB | 79 kB | 365 kB | 0.3/1.1 MB
2026-09-21T13:24:13.0322630Z Progress (4): 225 kB | 79 kB | 365 kB | 0.3/1.1 MB
2026-09-21T13:24:13.0323161Z Progress (4): 225 kB | 79 kB | 365 kB | 0.3/1.1 MB
2026-09-21T13:24:13.0323310Z                                                   
2026-09-21T13:24:13.0323772Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.jar (225 kB at 9.4 MB/s)
2026-09-21T13:24:13.0326758Z Progress (3): 79 kB | 365 kB | 0.3/1.1 MB
2026-09-21T13:24:13.0327537Z Progress (3): 79 kB | 365 kB | 0.3/1.1 MB
2026-09-21T13:24:13.0328504Z Progress (3): 79 kB | 365 kB | 0.4/1.1 MB
2026-09-21T13:24:13.0329448Z Progress (3): 79 kB | 365 kB | 0.4/1.1 MB
2026-09-21T13:24:13.0330093Z Progress (3): 79 kB | 365 kB | 0.4/1.1 MB
2026-09-21T13:24:13.0331051Z Progress (3): 79 kB | 365 kB | 0.4/1.1 MB
2026-09-21T13:24:13.0333602Z Progress (3): 79 kB | 365 kB | 0.5/1.1 MB
2026-09-21T13:24:13.0334604Z Progress (3): 79 kB | 365 kB | 0.5/1.1 MB
2026-09-21T13:24:13.0337760Z Progress (3): 79 kB | 365 kB | 0.5/1.1 MB
2026-09-21T13:24:13.0337872Z Progress (3): 79 kB | 365 kB | 0.5/1.1 MB
2026-09-21T13:24:13.0338024Z Progress (3): 79 kB | 365 kB | 0.5/1.1 MB
2026-09-21T13:24:13.0339332Z Progress (3): 79 kB | 365 kB | 0.6/1.1 MB
2026-09-21T13:24:13.0339558Z Progress (3): 79 kB | 365 kB | 0.6/1.1 MB
2026-09-21T13:24:13.0339765Z Progress (3): 79 kB | 365 kB | 0.6/1.1 MB
2026-09-21T13:24:13.0339865Z                                          
2026-09-21T13:24:13.0340266Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.jar (79 kB at 3.2 MB/s)
2026-09-21T13:24:13.0342729Z Progress (2): 365 kB | 0.6/1.1 MB
2026-09-21T13:24:13.0343036Z Progress (2): 365 kB | 0.6/1.1 MB
2026-09-21T13:24:13.0344338Z Progress (2): 365 kB | 0.6/1.1 MB
2026-09-21T13:24:13.0345119Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0345469Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0346170Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0346434Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0346882Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0347026Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0347358Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0348579Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0350794Z Progress (2): 365 kB | 0.7/1.1 MB
2026-09-21T13:24:13.0351468Z Progress (2): 365 kB | 0.8/1.1 MB
2026-09-21T13:24:13.0352520Z Progress (2): 365 kB | 0.8/1.1 MB
2026-09-21T13:24:13.0352859Z Progress (2): 365 kB | 0.8/1.1 MB
2026-09-21T13:24:13.0353005Z                                  
2026-09-21T13:24:13.0353378Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.jar (365 kB at 14 MB/s)
2026-09-21T13:24:13.0354750Z Progress (1): 0.9/1.1 MB
2026-09-21T13:24:13.0357168Z Progress (1): 0.9/1.1 MB
2026-09-21T13:24:13.0357719Z Progress (1): 0.9/1.1 MB
2026-09-21T13:24:13.0357855Z Progress (1): 0.9/1.1 MB
2026-09-21T13:24:13.0358903Z Progress (1): 0.9/1.1 MB
2026-09-21T13:24:13.0359474Z Progress (1): 0.9/1.1 MB
2026-09-21T13:24:13.0360115Z Progress (1): 0.9/1.1 MB
2026-09-21T13:24:13.0366536Z Progress (1): 1.0/1.1 MB
2026-09-21T13:24:13.0366674Z Progress (1): 1.0/1.1 MB
2026-09-21T13:24:13.0366881Z Progress (1): 1.0/1.1 MB
2026-09-21T13:24:13.0367015Z Progress (1): 1.0/1.1 MB
2026-09-21T13:24:13.0367144Z Progress (1): 1.0/1.1 MB
2026-09-21T13:24:13.0367240Z Progress (1): 1.0/1.1 MB
2026-09-21T13:24:13.0367398Z Progress (2): 1.0/1.1 MB | 0/6.8 MB
2026-09-21T13:24:13.0367546Z Progress (2): 1.0/1.1 MB | 0/6.8 MB
2026-09-21T13:24:13.0367686Z Progress (2): 1.0/1.1 MB | 0/6.8 MB
2026-09-21T13:24:13.0367824Z Progress (2): 1.1/1.1 MB | 0/6.8 MB
2026-09-21T13:24:13.0367926Z Progress (2): 1.1/1.1 MB | 0/6.8 MB
2026-09-21T13:24:13.0368151Z Progress (2): 1.1 MB | 0/6.8 MB    
2026-09-21T13:24:13.0368316Z Progress (2): 1.1 MB | 0.1/6.8 MB
2026-09-21T13:24:13.0384175Z Progress (2): 1.1 MB | 0.1/6.8 MB
2026-09-21T13:24:13.0384441Z Progress (2): 1.1 MB | 0.1/6.8 MB
2026-09-21T13:24:13.0386000Z Progress (2): 1.1 MB | 0.1/6.8 MB
2026-09-21T13:24:13.0386188Z Progress (2): 1.1 MB | 0.1/6.8 MB
2026-09-21T13:24:13.0386341Z Progress (2): 1.1 MB | 0.1/6.8 MB
2026-09-21T13:24:13.0387919Z Progress (2): 1.1 MB | 0.2/6.8 MB
2026-09-21T13:24:13.0389380Z Progress (2): 1.1 MB | 0.2/6.8 MB
2026-09-21T13:24:13.0394104Z Progress (2): 1.1 MB | 0.2/6.8 MB
2026-09-21T13:24:13.0394641Z Progress (2): 1.1 MB | 0.2/6.8 MB
2026-09-21T13:24:13.0394866Z Progress (2): 1.1 MB | 0.2/6.8 MB
2026-09-21T13:24:13.0394970Z Progress (2): 1.1 MB | 0.3/6.8 MB
2026-09-21T13:24:13.0396574Z Progress (2): 1.1 MB | 0.3/6.8 MB
2026-09-21T13:24:13.0396725Z Progress (2): 1.1 MB | 0.3/6.8 MB
2026-09-21T13:24:13.0397716Z Progress (2): 1.1 MB | 0.4/6.8 MB
2026-09-21T13:24:13.0398810Z Progress (2): 1.1 MB | 0.4/6.8 MB
2026-09-21T13:24:13.0399138Z Progress (2): 1.1 MB | 0.4/6.8 MB
2026-09-21T13:24:13.0399289Z Progress (2): 1.1 MB | 0.4/6.8 MB
2026-09-21T13:24:13.0400959Z Progress (2): 1.1 MB | 0.4/6.8 MB
2026-09-21T13:24:13.0401105Z Progress (2): 1.1 MB | 0.5/6.8 MB
2026-09-21T13:24:13.0401251Z Progress (2): 1.1 MB | 0.5/6.8 MB
2026-09-21T13:24:13.0401365Z Progress (2): 1.1 MB | 0.5/6.8 MB
2026-09-21T13:24:13.0401846Z Progress (2): 1.1 MB | 0.5/6.8 MB
2026-09-21T13:24:13.0427415Z Progress (2): 1.1 MB | 0.5/6.8 MB
2026-09-21T13:24:13.0427565Z Progress (2): 1.1 MB | 0.5/6.8 MB
2026-09-21T13:24:13.0428846Z Progress (2): 1.1 MB | 0.6/6.8 MB
2026-09-21T13:24:13.0428985Z Progress (2): 1.1 MB | 0.6/6.8 MB
2026-09-21T13:24:13.0430237Z Progress (2): 1.1 MB | 0.6/6.8 MB
2026-09-21T13:24:13.0430334Z                                  
2026-09-21T13:24:13.0430835Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.jar (1.1 MB at 32 MB/s)
2026-09-21T13:24:13.0431060Z Progress (1): 0.6/6.8 MB
2026-09-21T13:24:13.0432380Z Progress (1): 0.7/6.8 MB
2026-09-21T13:24:13.0435045Z Progress (1): 0.7/6.8 MB
2026-09-21T13:24:13.0436311Z Progress (1): 0.7/6.8 MB
2026-09-21T13:24:13.0437053Z Progress (1): 0.8/6.8 MB
2026-09-21T13:24:13.0437206Z Progress (1): 0.8/6.8 MB
2026-09-21T13:24:13.0437460Z Progress (1): 0.8/6.8 MB
2026-09-21T13:24:13.0437591Z Progress (1): 0.8/6.8 MB
2026-09-21T13:24:13.0437771Z Progress (1): 0.8/6.8 MB
2026-09-21T13:24:13.0437924Z Progress (1): 0.8/6.8 MB
2026-09-21T13:24:13.0438439Z Progress (1): 0.8/6.8 MB
2026-09-21T13:24:13.0438941Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0439074Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0439366Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0462520Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0462656Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0462752Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0462886Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0463082Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0463791Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0463983Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0464114Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0464382Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0465870Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0466077Z Progress (1): 0.9/6.8 MB
2026-09-21T13:24:13.0466271Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0467084Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0467504Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0467640Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0468075Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0468425Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0469213Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0470453Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0471159Z Progress (1): 1.0/6.8 MB
2026-09-21T13:24:13.0472407Z Progress (1): 1.1/6.8 MB
2026-09-21T13:24:13.0472655Z Progress (1): 1.1/6.8 MB
2026-09-21T13:24:13.0476094Z Progress (1): 1.1/6.8 MB
2026-09-21T13:24:13.0481628Z Progress (1): 1.1/6.8 MB
2026-09-21T13:24:13.0482002Z Progress (1): 1.2/6.8 MB
2026-09-21T13:24:13.0482234Z Progress (1): 1.2/6.8 MB
2026-09-21T13:24:13.0483269Z Progress (1): 1.2/6.8 MB
2026-09-21T13:24:13.0484297Z Progress (1): 1.2/6.8 MB
2026-09-21T13:24:13.0485078Z Progress (1): 1.2/6.8 MB
2026-09-21T13:24:13.0485499Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0485673Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0487382Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0487481Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0488018Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0488156Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0491259Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0491465Z Progress (1): 1.3/6.8 MB
2026-09-21T13:24:13.0491660Z Progress (1): 1.4/6.8 MB
2026-09-21T13:24:13.0492814Z Progress (1): 1.4/6.8 MB
2026-09-21T13:24:13.0493664Z Progress (1): 1.4/6.8 MB
2026-09-21T13:24:13.0493844Z Progress (1): 1.5/6.8 MB
2026-09-21T13:24:13.0495087Z Progress (1): 1.5/6.8 MB
2026-09-21T13:24:13.0495229Z Progress (1): 1.5/6.8 MB
2026-09-21T13:24:13.0496066Z Progress (1): 1.5/6.8 MB
2026-09-21T13:24:13.0497086Z Progress (1): 1.5/6.8 MB
2026-09-21T13:24:13.0498114Z Progress (1): 1.5/6.8 MB
2026-09-21T13:24:13.0498684Z Progress (1): 1.6/6.8 MB
2026-09-21T13:24:13.0500172Z Progress (1): 1.6/6.8 MB
2026-09-21T13:24:13.0501758Z Progress (1): 1.6/6.8 MB
2026-09-21T13:24:13.0502814Z Progress (1): 1.6/6.8 MB
2026-09-21T13:24:13.0503789Z Progress (1): 1.7/6.8 MB
2026-09-21T13:24:13.0503968Z Progress (1): 1.7/6.8 MB
2026-09-21T13:24:13.0505184Z Progress (1): 1.7/6.8 MB
2026-09-21T13:24:13.0507233Z Progress (1): 1.7/6.8 MB
2026-09-21T13:24:13.0507377Z Progress (1): 1.7/6.8 MB
2026-09-21T13:24:13.0508566Z Progress (1): 1.8/6.8 MB
2026-09-21T13:24:13.0511472Z Progress (1): 1.8/6.8 MB
2026-09-21T13:24:13.0511570Z Progress (1): 1.8/6.8 MB
2026-09-21T13:24:13.0511714Z Progress (1): 1.9/6.8 MB
2026-09-21T13:24:13.0512607Z Progress (1): 1.9/6.8 MB
2026-09-21T13:24:13.0513497Z Progress (1): 1.9/6.8 MB
2026-09-21T13:24:13.0514126Z Progress (1): 2.0/6.8 MB
2026-09-21T13:24:13.0514610Z Progress (1): 2.0/6.8 MB
2026-09-21T13:24:13.0516069Z Progress (1): 2.0/6.8 MB
2026-09-21T13:24:13.0517526Z Progress (1): 2.0/6.8 MB
2026-09-21T13:24:13.0518638Z Progress (1): 2.0/6.8 MB
2026-09-21T13:24:13.0519656Z Progress (1): 2.1/6.8 MB
2026-09-21T13:24:13.0520003Z Progress (1): 2.1/6.8 MB
2026-09-21T13:24:13.0521477Z Progress (1): 2.1/6.8 MB
2026-09-21T13:24:13.0522645Z Progress (1): 2.2/6.8 MB
2026-09-21T13:24:13.0523690Z Progress (1): 2.2/6.8 MB
2026-09-21T13:24:13.0524839Z Progress (1): 2.2/6.8 MB
2026-09-21T13:24:13.0525711Z Progress (1): 2.2/6.8 MB
2026-09-21T13:24:13.0526721Z Progress (1): 2.3/6.8 MB
2026-09-21T13:24:13.0527257Z Progress (1): 2.3/6.8 MB
2026-09-21T13:24:13.0537682Z Progress (1): 2.3/6.8 MB
2026-09-21T13:24:13.0538610Z Progress (1): 2.3/6.8 MB
2026-09-21T13:24:13.0539599Z Progress (1): 2.3/6.8 MB
2026-09-21T13:24:13.0540546Z Progress (1): 2.4/6.8 MB
2026-09-21T13:24:13.0543089Z Progress (1): 2.4/6.8 MB
2026-09-21T13:24:13.0543292Z Progress (1): 2.4/6.8 MB
2026-09-21T13:24:13.0543451Z Progress (1): 2.5/6.8 MB
2026-09-21T13:24:13.0543664Z Progress (1): 2.5/6.8 MB
2026-09-21T13:24:13.0543759Z Progress (1): 2.5/6.8 MB
2026-09-21T13:24:13.0543949Z Progress (1): 2.5/6.8 MB
2026-09-21T13:24:13.0545652Z Progress (1): 2.5/6.8 MB
2026-09-21T13:24:13.0546643Z Progress (1): 2.5/6.8 MB
2026-09-21T13:24:13.0547601Z Progress (1): 2.6/6.8 MB
2026-09-21T13:24:13.0548552Z Progress (1): 2.6/6.8 MB
2026-09-21T13:24:13.0549100Z Progress (1): 2.6/6.8 MB
2026-09-21T13:24:13.0550073Z Progress (1): 2.6/6.8 MB
2026-09-21T13:24:13.0550371Z Progress (1): 2.7/6.8 MB
2026-09-21T13:24:13.0550553Z Progress (1): 2.7/6.8 MB
2026-09-21T13:24:13.0551249Z Progress (1): 2.7/6.8 MB
2026-09-21T13:24:13.0552014Z Progress (1): 2.7/6.8 MB
2026-09-21T13:24:13.0552563Z Progress (1): 2.7/6.8 MB
2026-09-21T13:24:13.0553282Z Progress (1): 2.7/6.8 MB
2026-09-21T13:24:13.0554054Z Progress (1): 2.7/6.8 MB
2026-09-21T13:24:13.0554260Z Progress (1): 2.8/6.8 MB
2026-09-21T13:24:13.0556020Z Progress (1): 2.8/6.8 MB
2026-09-21T13:24:13.0557038Z Progress (1): 2.8/6.8 MB
2026-09-21T13:24:13.0557242Z Progress (1): 2.8/6.8 MB
2026-09-21T13:24:13.0557378Z Progress (1): 2.8/6.8 MB
2026-09-21T13:24:13.0559345Z Progress (1): 2.8/6.8 MB
2026-09-21T13:24:13.0560223Z Progress (1): 2.8/6.8 MB
2026-09-21T13:24:13.0560523Z Progress (1): 2.9/6.8 MB
2026-09-21T13:24:13.0561827Z Progress (1): 2.9/6.8 MB
2026-09-21T13:24:13.0562839Z Progress (1): 2.9/6.8 MB
2026-09-21T13:24:13.0563882Z Progress (1): 2.9/6.8 MB
2026-09-21T13:24:13.0564685Z Progress (1): 3.0/6.8 MB
2026-09-21T13:24:13.0565664Z Progress (1): 3.0/6.8 MB
2026-09-21T13:24:13.0566037Z Progress (1): 3.0/6.8 MB
2026-09-21T13:24:13.0566401Z Progress (1): 3.0/6.8 MB
2026-09-21T13:24:13.0567092Z Progress (1): 3.0/6.8 MB
2026-09-21T13:24:13.0567877Z Progress (1): 3.1/6.8 MB
2026-09-21T13:24:13.0568446Z Progress (1): 3.1/6.8 MB
2026-09-21T13:24:13.0568585Z Progress (1): 3.1/6.8 MB
2026-09-21T13:24:13.0569987Z Progress (1): 3.1/6.8 MB
2026-09-21T13:24:13.0570089Z Progress (1): 3.1/6.8 MB
2026-09-21T13:24:13.0570513Z Progress (1): 3.1/6.8 MB
2026-09-21T13:24:13.0572434Z Progress (1): 3.1/6.8 MB
2026-09-21T13:24:13.0574088Z Progress (1): 3.2/6.8 MB
2026-09-21T13:24:13.0574220Z Progress (1): 3.2/6.8 MB
2026-09-21T13:24:13.0574318Z Progress (1): 3.2/6.8 MB
2026-09-21T13:24:13.0575401Z Progress (1): 3.2/6.8 MB
2026-09-21T13:24:13.0577512Z Progress (1): 3.3/6.8 MB
2026-09-21T13:24:13.0577804Z Progress (1): 3.3/6.8 MB
2026-09-21T13:24:13.0577950Z Progress (1): 3.3/6.8 MB
2026-09-21T13:24:13.0578235Z Progress (1): 3.3/6.8 MB
2026-09-21T13:24:13.0579380Z Progress (1): 3.3/6.8 MB
2026-09-21T13:24:13.0579608Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0584274Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0584575Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0585598Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0586507Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0587451Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0588271Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0588664Z Progress (1): 3.4/6.8 MB
2026-09-21T13:24:13.0589858Z Progress (1): 3.5/6.8 MB
2026-09-21T13:24:13.0590414Z Progress (1): 3.5/6.8 MB
2026-09-21T13:24:13.0590516Z Progress (1): 3.5/6.8 MB
2026-09-21T13:24:13.0592637Z Progress (1): 3.5/6.8 MB
2026-09-21T13:24:13.0595068Z Progress (1): 3.5/6.8 MB
2026-09-21T13:24:13.0595208Z Progress (1): 3.5/6.8 MB
2026-09-21T13:24:13.0595483Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0595578Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0595726Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0596140Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0596287Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0596650Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0597597Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0598042Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0615940Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0616108Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0618511Z Progress (1): 3.6/6.8 MB
2026-09-21T13:24:13.0618764Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0619025Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0619123Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0619251Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0619444Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0619579Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0619673Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0620413Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0621500Z Progress (1): 3.7/6.8 MB
2026-09-21T13:24:13.0621665Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0634051Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0634208Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0634305Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0634774Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0634998Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0635715Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0635852Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0635951Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0636680Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0636816Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0638206Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0638342Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0638732Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0639216Z Progress (1): 3.8/6.8 MB
2026-09-21T13:24:13.0639431Z Progress (1): 3.9/6.8 MB
2026-09-21T13:24:13.0643055Z Progress (1): 3.9/6.8 MB
2026-09-21T13:24:13.0643242Z Progress (1): 3.9/6.8 MB
2026-09-21T13:24:13.0643389Z Progress (1): 3.9/6.8 MB
2026-09-21T13:24:13.0643485Z Progress (1): 3.9/6.8 MB
2026-09-21T13:24:13.0644494Z Progress (1): 3.9/6.8 MB
2026-09-21T13:24:13.0645369Z Progress (1): 4.0/6.8 MB
2026-09-21T13:24:13.0647759Z Progress (1): 4.0/6.8 MB
2026-09-21T13:24:13.0656547Z Progress (1): 4.0/6.8 MB
2026-09-21T13:24:13.0656726Z Progress (1): 4.0/6.8 MB
2026-09-21T13:24:13.0656824Z Progress (1): 4.0/6.8 MB
2026-09-21T13:24:13.0658750Z Progress (1): 4.0/6.8 MB
2026-09-21T13:24:13.0659161Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0659592Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0660699Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0663205Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0663394Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0667547Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0667741Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0667966Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0668065Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0668199Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0668346Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0668477Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0668575Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0668708Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0668860Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0669864Z Progress (1): 4.1/6.8 MB
2026-09-21T13:24:13.0669962Z Progress (1): 4.2/6.8 MB
2026-09-21T13:24:13.0670093Z Progress (1): 4.2/6.8 MB
2026-09-21T13:24:13.0670245Z Progress (1): 4.2/6.8 MB
2026-09-21T13:24:13.0670934Z Progress (1): 4.2/6.8 MB
2026-09-21T13:24:13.0671524Z Progress (1): 4.2/6.8 MB
2026-09-21T13:24:13.0672216Z Progress (1): 4.3/6.8 MB
2026-09-21T13:24:13.0672899Z Progress (1): 4.3/6.8 MB
2026-09-21T13:24:13.0673581Z Progress (1): 4.3/6.8 MB
2026-09-21T13:24:13.0673716Z Progress (1): 4.3/6.8 MB
2026-09-21T13:24:13.0674333Z Progress (1): 4.3/6.8 MB
2026-09-21T13:24:13.0677277Z Progress (1): 4.3/6.8 MB
2026-09-21T13:24:13.0677593Z Progress (1): 4.4/6.8 MB
2026-09-21T13:24:13.0678145Z Progress (1): 4.4/6.8 MB
2026-09-21T13:24:13.0679391Z Progress (1): 4.4/6.8 MB
2026-09-21T13:24:13.0680469Z Progress (1): 4.5/6.8 MB
2026-09-21T13:24:13.0681618Z Progress (1): 4.5/6.8 MB
2026-09-21T13:24:13.0682537Z Progress (1): 4.5/6.8 MB
2026-09-21T13:24:13.0683690Z Progress (1): 4.6/6.8 MB
2026-09-21T13:24:13.0684759Z Progress (1): 4.6/6.8 MB
2026-09-21T13:24:13.0684895Z Progress (1): 4.6/6.8 MB
2026-09-21T13:24:13.0686726Z Progress (1): 4.6/6.8 MB
2026-09-21T13:24:13.0687474Z Progress (1): 4.7/6.8 MB
2026-09-21T13:24:13.0688561Z Progress (1): 4.7/6.8 MB
2026-09-21T13:24:13.0689457Z Progress (1): 4.7/6.8 MB
2026-09-21T13:24:13.0690489Z Progress (1): 4.8/6.8 MB
2026-09-21T13:24:13.0691496Z Progress (1): 4.8/6.8 MB
2026-09-21T13:24:13.0691806Z Progress (1): 4.8/6.8 MB
2026-09-21T13:24:13.0693404Z Progress (1): 4.8/6.8 MB
2026-09-21T13:24:13.0694302Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0694730Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0694936Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0696921Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0697020Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0697158Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0697300Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0697431Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0697532Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0697661Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0698024Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0698222Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0699518Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0700673Z Progress (1): 4.9/6.8 MB
2026-09-21T13:24:13.0701657Z Progress (1): 5.0/6.8 MB
2026-09-21T13:24:13.0702501Z Progress (1): 5.0/6.8 MB
2026-09-21T13:24:13.0703381Z Progress (1): 5.0/6.8 MB
2026-09-21T13:24:13.0704260Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0705023Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0705163Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0706394Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0707131Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0707324Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0707884Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0708018Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0709346Z Progress (1): 5.1/6.8 MB
2026-09-21T13:24:13.0709841Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0710361Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0718940Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0719340Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0719575Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0719827Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0720032Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0721064Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0721531Z Progress (1): 5.2/6.8 MB
2026-09-21T13:24:13.0721902Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0722183Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0723335Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0723994Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0724534Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0725531Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0725678Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0725968Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0765893Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0767509Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0767785Z Progress (1): 5.3/6.8 MB
2026-09-21T13:24:13.0768679Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0768780Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0769373Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0769744Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0770375Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0770803Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0770937Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0771294Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0772182Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0772357Z Progress (1): 5.4/6.8 MB
2026-09-21T13:24:13.0772683Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0772981Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0773294Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0773487Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0774108Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0778378Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0778846Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0779074Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0779493Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0780389Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0781351Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0781490Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0781623Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0782111Z Progress (1): 5.5/6.8 MB
2026-09-21T13:24:13.0782210Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0783591Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0784337Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0784719Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0789558Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0790060Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0790193Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0791450Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0792268Z Progress (1): 5.6/6.8 MB
2026-09-21T13:24:13.0793028Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0793923Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0794269Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0794963Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0795061Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0796021Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0797116Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0798035Z Progress (1): 5.7/6.8 MB
2026-09-21T13:24:13.0799109Z Progress (1): 5.8/6.8 MB
2026-09-21T13:24:13.0799921Z Progress (1): 5.8/6.8 MB
2026-09-21T13:24:13.0800911Z Progress (1): 5.8/6.8 MB
2026-09-21T13:24:13.0801049Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0819118Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0819262Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0819733Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0820491Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0820650Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0821084Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0821263Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0822698Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0823433Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0824001Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0824361Z Progress (1): 5.9/6.8 MB
2026-09-21T13:24:13.0825001Z Progress (1): 6.0/6.8 MB
2026-09-21T13:24:13.0826242Z Progress (1): 6.0/6.8 MB
2026-09-21T13:24:13.0827504Z Progress (1): 6.0/6.8 MB
2026-09-21T13:24:13.0828000Z Progress (1): 6.0/6.8 MB
2026-09-21T13:24:13.0829155Z Progress (1): 6.0/6.8 MB
2026-09-21T13:24:13.0830230Z Progress (1): 6.1/6.8 MB
2026-09-21T13:24:13.0831106Z Progress (1): 6.1/6.8 MB
2026-09-21T13:24:13.0851740Z Progress (1): 6.1/6.8 MB
2026-09-21T13:24:13.0851916Z Progress (1): 6.1/6.8 MB
2026-09-21T13:24:13.0852055Z Progress (1): 6.1/6.8 MB
2026-09-21T13:24:13.0853114Z Progress (1): 6.1/6.8 MB
2026-09-21T13:24:13.0853340Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0853913Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0854483Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0855149Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0855631Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0855999Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0856987Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0857212Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0858036Z Progress (1): 6.2/6.8 MB
2026-09-21T13:24:13.0858244Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0858733Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0859231Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0859468Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0859576Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0861387Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0862269Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0863290Z Progress (1): 6.3/6.8 MB
2026-09-21T13:24:13.0864943Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1158834Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1159120Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1159267Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1159399Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1159533Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1160137Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1160809Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1161111Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1163059Z Progress (1): 6.4/6.8 MB
2026-09-21T13:24:13.1164072Z Progress (1): 6.5/6.8 MB
2026-09-21T13:24:13.1165075Z Progress (1): 6.5/6.8 MB
2026-09-21T13:24:13.1166673Z Progress (1): 6.5/6.8 MB
2026-09-21T13:24:13.1167130Z Progress (1): 6.6/6.8 MB
2026-09-21T13:24:13.1168231Z Progress (1): 6.6/6.8 MB
2026-09-21T13:24:13.1168996Z Progress (1): 6.6/6.8 MB
2026-09-21T13:24:13.1305898Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1306250Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1306387Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1306709Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1306811Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1306943Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1307085Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1307213Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1307313Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1307874Z Progress (1): 6.7/6.8 MB
2026-09-21T13:24:13.1308283Z Progress (1): 6.8/6.8 MB
2026-09-21T13:24:13.1308881Z Progress (1): 6.8/6.8 MB
2026-09-21T13:24:13.1607194Z Progress (1): 6.8 MB    
2026-09-21T13:24:13.1607385Z                     
2026-09-21T13:24:13.1607919Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.jar (6.8 MB at 45 MB/s)
2026-09-21T13:24:13.3593483Z [INFO] Building jar: /opt/ads-agent/_work/4/s/batch-platform/core-starter/target/core-starter.jar
2026-09-21T13:24:13.3869558Z [INFO] 
2026-09-21T13:24:13.3870158Z [INFO] --- jacoco:0.8.12:report (report) @ core-starter ---
2026-09-21T13:24:13.3905336Z [INFO] Loading execution data file /opt/ads-agent/_work/4/s/batch-platform/core-starter/target/jacoco.exec
2026-09-21T13:24:13.4577032Z [INFO] Analyzed bundle 'core-starter' with 35 classes
2026-09-21T13:24:13.5064312Z [INFO] 
2026-09-21T13:24:13.5066420Z [INFO] --- install:3.1.2:install (default-install) @ core-starter ---
2026-09-21T13:24:13.5073441Z [INFO] Installing /opt/ads-agent/_work/4/s/batch-platform/core-starter/pom.xml to /opt/ads-agent/cache-tools/.m2/repository/br/gov/caixa/siifx/caixinhas/core-starter/1.0-SNAPSHOT/core-starter-1.0-SNAPSHOT.pom
2026-09-21T13:24:13.5098909Z [INFO] Installing /opt/ads-agent/_work/4/s/batch-platform/core-starter/target/core-starter.jar to /opt/ads-agent/cache-tools/.m2/repository/br/gov/caixa/siifx/caixinhas/core-starter/1.0-SNAPSHOT/core-starter-1.0-SNAPSHOT.jar
2026-09-21T13:24:13.5142267Z [INFO] 
2026-09-21T13:24:13.5142693Z [INFO] --------------< br.gov.caixa.siifx.caixinhas:io-starter >---------------
2026-09-21T13:24:13.5143123Z [INFO] Building io-starter 1.0-SNAPSHOT                                   [4/4]
2026-09-21T13:24:13.5143390Z [INFO]   from io-starter/pom.xml
2026-09-21T13:24:13.5143758Z [INFO] --------------------------------[ jar ]---------------------------------
2026-09-21T13:24:13.5279626Z [INFO] 
2026-09-21T13:24:13.5280098Z [INFO] --- clean:3.2.0:clean (default-clean) @ io-starter ---
2026-09-21T13:24:13.5286083Z [INFO] 
2026-09-21T13:24:13.5286288Z [INFO] --- enforcer:3.5.0:enforce (enforce-rules) @ io-starter ---
2026-09-21T13:24:13.5303520Z [INFO] Rule 1: org.apache.maven.enforcer.rules.BanDuplicatePomDependencyVersions passed
2026-09-21T13:24:13.5346074Z [INFO] Rule 2: org.apache.maven.enforcer.rules.dependency.RequireUpperBoundDeps passed
2026-09-21T13:24:13.5346549Z [INFO] 
2026-09-21T13:24:13.5347055Z [INFO] --- jacoco:0.8.12:prepare-agent (prepare-agent) @ io-starter ---
2026-09-21T13:24:13.5353186Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/4/s/batch-platform/io-starter/target/jacoco.exec
2026-09-21T13:24:13.5353435Z [INFO] 
2026-09-21T13:24:13.5353947Z [INFO] --- resources:3.3.1:resources (default-resources) @ io-starter ---
2026-09-21T13:24:13.5368417Z [INFO] Copying 1 resource from src/main/resources to target/classes
2026-09-21T13:24:13.5371705Z [INFO] 
2026-09-21T13:24:13.5371917Z [INFO] --- compiler:3.13.0:compile (default-compile) @ io-starter ---
2026-09-21T13:24:13.5406755Z [INFO] Recompiling the module because of changed dependency.
2026-09-21T13:24:13.5411340Z [INFO] Compiling 15 source files with javac [debug parameters release 21] to target/classes
2026-09-21T13:24:13.7288018Z [INFO] Annotation processing is enabled because one or more processors were found
2026-09-21T13:24:13.7288279Z   on the class path. A future release of javac may disable annotation processing
2026-09-21T13:24:13.7288736Z   unless at least one processor is specified by name (-processor), or a search
2026-09-21T13:24:13.7289163Z   path is specified (--processor-path, --processor-module-path), or annotation
2026-09-21T13:24:13.7289445Z   processing is enabled explicitly (-proc:only, -proc:full).
2026-09-21T13:24:13.7289671Z   Use -Xlint:-options to suppress this message.
2026-09-21T13:24:13.7289885Z   Use -proc:none to disable annotation processing.
2026-09-21T13:24:13.7290191Z [INFO] 
2026-09-21T13:24:13.7290389Z [INFO] --- resources:3.3.1:testResources (default-testResources) @ io-starter ---
2026-09-21T13:24:13.7301195Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/4/s/batch-platform/io-starter/src/test/resources
2026-09-21T13:24:13.7301640Z [INFO] 
2026-09-21T13:24:13.7301981Z [INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ io-starter ---
2026-09-21T13:24:13.7317886Z [INFO] No sources to compile
2026-09-21T13:24:13.7318403Z [INFO] 
2026-09-21T13:24:13.7318826Z [INFO] --- surefire:3.2.5:test (default-test) @ io-starter ---
2026-09-21T13:24:13.7338751Z [INFO] No tests to run.
2026-09-21T13:24:13.7346258Z [INFO] 
2026-09-21T13:24:13.7346677Z [INFO] --- jar:3.4.1:jar (default-jar) @ io-starter ---
2026-09-21T13:24:13.7389795Z [INFO] Building jar: /opt/ads-agent/_work/4/s/batch-platform/io-starter/target/io-starter.jar
2026-09-21T13:24:13.7484675Z [INFO] 
2026-09-21T13:24:13.7485242Z [INFO] --- jacoco:0.8.12:report (report) @ io-starter ---
2026-09-21T13:24:13.7492751Z [INFO] Skipping JaCoCo execution due to missing execution data file.
2026-09-21T13:24:13.7493000Z [INFO] 
2026-09-21T13:24:13.7493379Z [INFO] --- install:3.1.2:install (default-install) @ io-starter ---
2026-09-21T13:24:13.7498422Z [INFO] Installing /opt/ads-agent/_work/4/s/batch-platform/io-starter/pom.xml to /opt/ads-agent/cache-tools/.m2/repository/br/gov/caixa/siifx/caixinhas/io-starter/1.0-SNAPSHOT/io-starter-1.0-SNAPSHOT.pom
2026-09-21T13:24:13.7516490Z [INFO] Installing /opt/ads-agent/_work/4/s/batch-platform/io-starter/target/io-starter.jar to /opt/ads-agent/cache-tools/.m2/repository/br/gov/caixa/siifx/caixinhas/io-starter/1.0-SNAPSHOT/io-starter-1.0-SNAPSHOT.jar
2026-09-21T13:24:13.7551098Z [INFO] ------------------------------------------------------------------------
2026-09-21T13:24:13.7551511Z [INFO] Reactor Summary for batch-platform 1.0-SNAPSHOT:
2026-09-21T13:24:13.7551684Z [INFO] 
2026-09-21T13:24:13.7552826Z [INFO] batch-platform ..................................... SUCCESS [  1.125 s]
2026-09-21T13:24:13.7553103Z [INFO] platform-bom ....................................... SUCCESS [  0.011 s]
2026-09-21T13:24:13.7553355Z [INFO] core-starter ....................................... SUCCESS [ 10.887 s]
2026-09-21T13:24:13.7553613Z [INFO] io-starter ......................................... SUCCESS [  0.240 s]
2026-09-21T13:24:13.7553925Z [INFO] ------------------------------------------------------------------------
2026-09-21T13:24:13.7554091Z [INFO] BUILD SUCCESS
2026-09-21T13:24:13.7554411Z [INFO] ------------------------------------------------------------------------
2026-09-21T13:24:13.7554740Z [INFO] Total time:  14.826 s
2026-09-21T13:24:13.7555304Z [INFO] Finished at: 2026-09-21T10:24:13-03:00
2026-09-21T13:24:13.7555549Z [INFO] ------------------------------------------------------------------------
2026-09-21T13:24:13.8196613Z ##[section]Finishing: Maven



o err oatual é eesse



Publish Quality Gate Result

View raw log

Starting: Publish Quality Gate Result
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/d9ae130f-5523-47e4-8813-951c728fefa8.sh
QG Script --> Using SonarQube instance http://sonar-esteira.apps.produtos4.caixa
QG Script --> Using SonarQube access login ads-sa
QG Script --> Using task id of AaDEI6qyHMmmDjERuR-X
QG Script --> Status of SonarQube task is PENDING
QG Script --> Status of SonarQube task is SUCCESS
QG Script --> Using analysis id of AaDEI66jKktaWFKjYEkI
QG Script --> Quality Gate status is ERROR
##[error]QG Script --> Ocorrência prevista na TE102 - Não atendimento aos critérios de qualidade
##[error]Bash exited with code '1'.
Finishing: Publish Quality Gate Result


<img width="1518" height="917" alt="image" src="https://github.com/user-attachments/assets/227d4e37-a239-42d2-8a1c-0948d9517c35" />


<img width="1550" height="724" alt="image" src="https://github.com/user-attachments/assets/da5b894f-03ef-4a78-8e10-5c8449da1403" />

