Voce mudou alguma coisa quebrou no mavem agora

2026-10-02T13:28:15.0997486Z ##[section]Starting: Maven
2026-10-02T13:28:15.1005580Z ==============================================================================
2026-10-02T13:28:15.1005917Z Task         : Maven
2026-10-02T13:28:15.1006026Z Description  : Build, test, and deploy with Apache Maven
2026-10-02T13:28:15.1006096Z Version      : 3.225.0
2026-10-02T13:28:15.1006144Z Author       : Microsoft Corporation
2026-10-02T13:28:15.1006251Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-10-02T13:28:15.1006460Z ==============================================================================
2026-10-02T13:28:15.7838121Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-10-02T13:28:15.8990326Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-10-02T13:28:15.8991110Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-10-02T13:28:15.8991398Z Java version: 21.0.5, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-21.0.5
2026-10-02T13:28:15.8991580Z Default locale: pt_BR, platform encoding: UTF-8
2026-10-02T13:28:15.8991938Z OS name: "linux", version: "5.18.5-100.fc35.x86_64", arch: "amd64", family: "unix"
2026-10-02T13:28:15.9151241Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/35/s/pom.xml clean package -U
2026-10-02T13:28:16.7161591Z [INFO] Scanning for projects...
2026-10-02T13:28:17.9648703Z [INFO] 
2026-10-02T13:28:17.9649505Z [INFO] ------------< br.gov.caixa.siapo:siapo-movimentacao-micro >-------------
2026-10-02T13:28:17.9650045Z [INFO] Building siapo-movimentacao-micro 1.0.0-SNAPSHOT
2026-10-02T13:28:17.9650309Z [INFO] --------------------------------[ jar ]---------------------------------
2026-10-02T13:28:18.1073970Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-failsafe-plugin/3.5.2/maven-failsafe-plugin-3.5.2.pom
2026-10-02T13:28:18.1572313Z Progress (1): 4.1/11 kB
2026-10-02T13:28:18.1575682Z Progress (1): 7.7/11 kB
2026-10-02T13:28:18.1631326Z Progress (1): 11 kB    
2026-10-02T13:28:18.1631780Z                    
2026-10-02T13:28:18.1632668Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-failsafe-plugin/3.5.2/maven-failsafe-plugin-3.5.2.pom (11 kB at 196 kB/s)
2026-10-02T13:28:18.1824648Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire/3.5.2/surefire-3.5.2.pom
2026-10-02T13:28:18.1871227Z Progress (1): 3.7/20 kB
2026-10-02T13:28:18.1873515Z Progress (1): 7.7/20 kB
2026-10-02T13:28:18.1877170Z Progress (1): 12/20 kB 
2026-10-02T13:28:18.1883973Z Progress (1): 16/20 kB
2026-10-02T13:28:18.1884097Z Progress (1): 20/20 kB
2026-10-02T13:28:18.1921010Z Progress (1): 20 kB   
2026-10-02T13:28:18.1921389Z                    
2026-10-02T13:28:18.1922234Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire/3.5.2/surefire-3.5.2.pom (20 kB at 2.0 MB/s)
2026-10-02T13:28:18.2072076Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-failsafe-plugin/3.5.2/maven-failsafe-plugin-3.5.2.jar
2026-10-02T13:28:18.2140296Z Progress (1): 4.1/57 kB
2026-10-02T13:28:18.2143769Z Progress (1): 7.7/57 kB
2026-10-02T13:28:18.2148127Z Progress (1): 12/57 kB 
2026-10-02T13:28:18.2151964Z Progress (1): 16/57 kB
2026-10-02T13:28:18.2154324Z Progress (1): 20/57 kB
2026-10-02T13:28:18.2159160Z Progress (1): 24/57 kB
2026-10-02T13:28:18.2161471Z Progress (1): 28/57 kB
2026-10-02T13:28:18.2164250Z Progress (1): 32/57 kB
2026-10-02T13:28:18.2168025Z Progress (1): 36/57 kB
2026-10-02T13:28:18.2171099Z Progress (1): 41/57 kB
2026-10-02T13:28:18.2174598Z Progress (1): 45/57 kB
2026-10-02T13:28:18.2178088Z Progress (1): 49/57 kB
2026-10-02T13:28:18.2182224Z Progress (1): 53/57 kB
2026-10-02T13:28:18.2184187Z Progress (1): 57/57 kB
2026-10-02T13:28:18.2221114Z Progress (1): 57 kB   
2026-10-02T13:28:18.2221335Z                    
2026-10-02T13:28:18.2222240Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-failsafe-plugin/3.5.2/maven-failsafe-plugin-3.5.2.jar (57 kB at 3.8 MB/s)
2026-10-02T13:28:18.2576800Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.5.2/maven-surefire-plugin-3.5.2.pom
2026-10-02T13:28:18.2621397Z Progress (1): 4.1/5.7 kB
2026-10-02T13:28:18.2654000Z Progress (1): 5.7 kB    
2026-10-02T13:28:18.2654495Z                     
2026-10-02T13:28:18.2655135Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.5.2/maven-surefire-plugin-3.5.2.pom (5.7 kB at 633 kB/s)
2026-10-02T13:28:18.2771543Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.5.2/maven-surefire-plugin-3.5.2.jar
2026-10-02T13:28:18.2814382Z Progress (1): 4.1/46 kB
2026-10-02T13:28:18.2818357Z Progress (1): 7.7/46 kB
2026-10-02T13:28:18.2818695Z Progress (1): 12/46 kB 
2026-10-02T13:28:18.2820723Z Progress (1): 16/46 kB
2026-10-02T13:28:18.2822269Z Progress (1): 20/46 kB
2026-10-02T13:28:18.2823982Z Progress (1): 24/46 kB
2026-10-02T13:28:18.2826405Z Progress (1): 28/46 kB
2026-10-02T13:28:18.2828182Z Progress (1): 32/46 kB
2026-10-02T13:28:18.2832817Z Progress (1): 36/46 kB
2026-10-02T13:28:18.2833558Z Progress (1): 41/46 kB
2026-10-02T13:28:18.2834779Z Progress (1): 45/46 kB
2026-10-02T13:28:18.2874149Z Progress (1): 46 kB   
2026-10-02T13:28:18.2874400Z                    
2026-10-02T13:28:18.2875156Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/plugins/maven-surefire-plugin/3.5.2/maven-surefire-plugin-3.5.2.jar (46 kB at 4.2 MB/s)
2026-10-02T13:28:18.7236931Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer/3.15.3/quarkus-micrometer-3.15.3.pom
2026-10-02T13:28:18.7389027Z Progress (1): 4.1/6.3 kB
2026-10-02T13:28:18.7464127Z Progress (1): 6.3 kB    
2026-10-02T13:28:18.7464440Z                     
2026-10-02T13:28:18.7465442Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer/3.15.3/quarkus-micrometer-3.15.3.pom (6.3 kB at 261 kB/s)
2026-10-02T13:28:18.7595900Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer-parent/3.15.3/quarkus-micrometer-parent-3.15.3.pom
2026-10-02T13:28:18.7799886Z Progress (1): 1.3 kB
2026-10-02T13:28:18.7800256Z                     
2026-10-02T13:28:18.7801246Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer-parent/3.15.3/quarkus-micrometer-parent-3.15.3.pom (1.3 kB at 64 kB/s)
2026-10-02T13:28:18.7963612Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.13.5/micrometer-core-1.13.5.pom
2026-10-02T13:28:18.8042287Z Progress (1): 3.7/11 kB
2026-10-02T13:28:18.8042803Z Progress (1): 7.7/11 kB
2026-10-02T13:28:18.8118688Z Progress (1): 11 kB    
2026-10-02T13:28:18.8119209Z                    
2026-10-02T13:28:18.8120080Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.13.5/micrometer-core-1.13.5.pom (11 kB at 666 kB/s)
2026-10-02T13:28:18.8294177Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.13.5/micrometer-commons-1.13.5.pom
2026-10-02T13:28:18.8464757Z Progress (1): 3.4 kB
2026-10-02T13:28:18.8465033Z                     
2026-10-02T13:28:18.8465682Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.13.5/micrometer-commons-1.13.5.pom (3.4 kB at 190 kB/s)
2026-10-02T13:28:18.8576395Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.13.5/micrometer-observation-1.13.5.pom
2026-10-02T13:28:18.8878838Z Progress (1): 3.8 kB
2026-10-02T13:28:18.8879133Z                     
2026-10-02T13:28:18.8880234Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.13.5/micrometer-observation-1.13.5.pom (3.8 kB at 128 kB/s)
2026-10-02T13:28:18.9057123Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache/3.15.3/quarkus-hibernate-orm-panache-3.15.3.pom
2026-10-02T13:28:18.9165594Z Progress (1): 3.5 kB
2026-10-02T13:28:18.9165796Z                     
2026-10-02T13:28:18.9166529Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache/3.15.3/quarkus-hibernate-orm-panache-3.15.3.pom (3.5 kB at 205 kB/s)
2026-10-02T13:28:18.9276350Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-parent/3.15.3/quarkus-hibernate-orm-panache-parent-3.15.3.pom
2026-10-02T13:28:18.9415587Z Progress (1): 761 B
2026-10-02T13:28:18.9416198Z                    
2026-10-02T13:28:18.9416826Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-parent/3.15.3/quarkus-hibernate-orm-panache-parent-3.15.3.pom (761 B at 51 kB/s)
2026-10-02T13:28:18.9526070Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-parent/3.15.3/quarkus-panache-parent-3.15.3.pom
2026-10-02T13:28:18.9635855Z Progress (1): 1.5 kB
2026-10-02T13:28:18.9636040Z                     
2026-10-02T13:28:18.9636790Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-parent/3.15.3/quarkus-panache-parent-3.15.3.pom (1.5 kB at 107 kB/s)
2026-10-02T13:28:18.9753362Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm/3.15.3/quarkus-hibernate-orm-3.15.3.pom
2026-10-02T13:28:18.9821346Z Progress (1): 4.1/7.3 kB
2026-10-02T13:28:18.9878514Z Progress (1): 7.3 kB    
2026-10-02T13:28:18.9878845Z                     
2026-10-02T13:28:18.9879477Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm/3.15.3/quarkus-hibernate-orm-3.15.3.pom (7.3 kB at 563 kB/s)
2026-10-02T13:28:18.9956503Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-parent/3.15.3/quarkus-hibernate-orm-parent-3.15.3.pom
2026-10-02T13:28:19.0041561Z Progress (1): 4.1/6.7 kB
2026-10-02T13:28:19.0114848Z Progress (1): 6.7 kB    
2026-10-02T13:28:19.0115116Z                     
2026-10-02T13:28:19.0115760Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-parent/3.15.3/quarkus-hibernate-orm-parent-3.15.3.pom (6.7 kB at 416 kB/s)
2026-10-02T13:28:19.0221571Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal/3.15.3/quarkus-agroal-3.15.3.pom
2026-10-02T13:28:19.0285327Z Progress (1): 4.1/4.2 kB
2026-10-02T13:28:19.0341698Z Progress (1): 4.2 kB    
2026-10-02T13:28:19.0342422Z                     
2026-10-02T13:28:19.0342981Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal/3.15.3/quarkus-agroal-3.15.3.pom (4.2 kB at 347 kB/s)
2026-10-02T13:28:19.0428860Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-parent/3.15.3/quarkus-agroal-parent-3.15.3.pom
2026-10-02T13:28:19.0554390Z Progress (1): 763 B
2026-10-02T13:28:19.0555385Z                    
2026-10-02T13:28:19.0556208Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-parent/3.15.3/quarkus-agroal-parent-3.15.3.pom (763 B at 59 kB/s)
2026-10-02T13:28:19.0652641Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource/3.15.3/quarkus-datasource-3.15.3.pom
2026-10-02T13:28:19.0794869Z Progress (1): 2.4 kB
2026-10-02T13:28:19.0795200Z                     
2026-10-02T13:28:19.0795924Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource/3.15.3/quarkus-datasource-3.15.3.pom (2.4 kB at 160 kB/s)
2026-10-02T13:28:19.0880640Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-parent/3.15.3/quarkus-datasource-parent-3.15.3.pom
2026-10-02T13:28:19.0973631Z Progress (1): 814 B
2026-10-02T13:28:19.0974180Z                    
2026-10-02T13:28:19.0975109Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-parent/3.15.3/quarkus-datasource-parent-3.15.3.pom (814 B at 81 kB/s)
2026-10-02T13:28:19.1099309Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-common/3.15.3/quarkus-datasource-common-3.15.3.pom
2026-10-02T13:28:19.1273642Z Progress (1): 1.1 kB
2026-10-02T13:28:19.1274013Z                     
2026-10-02T13:28:19.1274806Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-common/3.15.3/quarkus-datasource-common-3.15.3.pom (1.1 kB at 61 kB/s)
2026-10-02T13:28:19.1379967Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta/3.15.3/quarkus-narayana-jta-3.15.3.pom
2026-10-02T13:28:19.1449015Z Progress (1): 4.1/5.9 kB
2026-10-02T13:28:19.1504156Z Progress (1): 5.9 kB    
2026-10-02T13:28:19.1504364Z                     
2026-10-02T13:28:19.1504995Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta/3.15.3/quarkus-narayana-jta-3.15.3.pom (5.9 kB at 450 kB/s)
2026-10-02T13:28:19.1620096Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta-parent/3.15.3/quarkus-narayana-jta-parent-3.15.3.pom
2026-10-02T13:28:19.1767600Z Progress (1): 746 B
2026-10-02T13:28:19.1768057Z                    
2026-10-02T13:28:19.1768642Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta-parent/3.15.3/quarkus-narayana-jta-parent-3.15.3.pom (746 B at 50 kB/s)
2026-10-02T13:28:19.1931739Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-transaction-annotations/3.15.3/quarkus-transaction-annotations-3.15.3.pom
2026-10-02T13:28:19.2066174Z Progress (1): 778 B
2026-10-02T13:28:19.2066500Z                    
2026-10-02T13:28:19.2067231Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-transaction-annotations/3.15.3/quarkus-transaction-annotations-3.15.3.pom (778 B at 56 kB/s)
2026-10-02T13:28:19.2191720Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-transaction-annotations-parent/3.15.3/quarkus-transaction-annotations-parent-3.15.3.pom
2026-10-02T13:28:19.2313094Z Progress (1): 732 B
2026-10-02T13:28:19.2313382Z                    
2026-10-02T13:28:19.2314198Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-transaction-annotations-parent/3.15.3/quarkus-transaction-annotations-parent-3.15.3.pom (732 B at 56 kB/s)
2026-10-02T13:28:19.2841353Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-core/6.6.3.Final/hibernate-core-6.6.3.Final.pom
2026-10-02T13:28:19.2900298Z Progress (1): 4.1/5.8 kB
2026-10-02T13:28:19.2956796Z Progress (1): 5.8 kB    
2026-10-02T13:28:19.2956983Z                     
2026-10-02T13:28:19.2957534Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-core/6.6.3.Final/hibernate-core-6.6.3.Final.pom (5.8 kB at 480 kB/s)
2026-10-02T13:28:19.3226311Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-graalvm/6.6.3.Final/hibernate-graalvm-6.6.3.Final.pom
2026-10-02T13:28:19.3429353Z Progress (1): 2.3 kB
2026-10-02T13:28:19.3429734Z                     
2026-10-02T13:28:19.3430348Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-graalvm/6.6.3.Final/hibernate-graalvm-6.6.3.Final.pom (2.3 kB at 117 kB/s)
2026-10-02T13:28:19.3511952Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine/3.15.3/quarkus-caffeine-3.15.3.pom
2026-10-02T13:28:19.3668658Z Progress (1): 2.1 kB
2026-10-02T13:28:19.3668973Z                     
2026-10-02T13:28:19.3669633Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine/3.15.3/quarkus-caffeine-3.15.3.pom (2.1 kB at 134 kB/s)
2026-10-02T13:28:19.3868648Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine-parent/3.15.3/quarkus-caffeine-parent-3.15.3.pom
2026-10-02T13:28:19.3996285Z Progress (1): 740 B
2026-10-02T13:28:19.3996539Z                    
2026-10-02T13:28:19.3997264Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine-parent/3.15.3/quarkus-caffeine-parent-3.15.3.pom (740 B at 35 kB/s)
2026-10-02T13:28:19.4186455Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common/3.15.3/quarkus-hibernate-orm-panache-common-3.15.3.pom
2026-10-02T13:28:19.4421402Z Progress (1): 1.4 kB
2026-10-02T13:28:19.4421603Z                     
2026-10-02T13:28:19.4422191Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common/3.15.3/quarkus-hibernate-orm-panache-common-3.15.3.pom (1.4 kB at 62 kB/s)
2026-10-02T13:28:19.4494680Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common-parent/3.15.3/quarkus-hibernate-orm-panache-common-parent-3.15.3.pom
2026-10-02T13:28:19.4627382Z Progress (1): 777 B
2026-10-02T13:28:19.4627549Z                    
2026-10-02T13:28:19.4628140Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common-parent/3.15.3/quarkus-hibernate-orm-panache-common-parent-3.15.3.pom (777 B at 56 kB/s)
2026-10-02T13:28:19.4735171Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common/3.15.3/quarkus-panache-hibernate-common-3.15.3.pom
2026-10-02T13:28:19.4881085Z Progress (1): 2.1 kB
2026-10-02T13:28:19.4881409Z                     
2026-10-02T13:28:19.4882090Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common/3.15.3/quarkus-panache-hibernate-common-3.15.3.pom (2.1 kB at 147 kB/s)
2026-10-02T13:28:19.4968200Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common-parent/3.15.3/quarkus-panache-hibernate-common-parent-3.15.3.pom
2026-10-02T13:28:19.5136416Z Progress (1): 766 B
2026-10-02T13:28:19.5136691Z                    
2026-10-02T13:28:19.5137249Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common-parent/3.15.3/quarkus-panache-hibernate-common-parent-3.15.3.pom (766 B at 45 kB/s)
2026-10-02T13:28:19.5250542Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common/3.15.3/quarkus-panache-common-3.15.3.pom
2026-10-02T13:28:19.5351303Z Progress (1): 1.4 kB
2026-10-02T13:28:19.5351492Z                     
2026-10-02T13:28:19.5352014Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common/3.15.3/quarkus-panache-common-3.15.3.pom (1.4 kB at 145 kB/s)
2026-10-02T13:28:19.5424683Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common-parent/3.15.3/quarkus-panache-common-parent-3.15.3.pom
2026-10-02T13:28:19.5531768Z Progress (1): 744 B
2026-10-02T13:28:19.5531929Z                    
2026-10-02T13:28:19.5532541Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common-parent/3.15.3/quarkus-panache-common-parent-3.15.3.pom (744 B at 68 kB/s)
2026-10-02T13:28:19.5668180Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql/3.15.3/quarkus-jdbc-mssql-3.15.3.pom
2026-10-02T13:28:19.5785218Z Progress (1): 3.1 kB
2026-10-02T13:28:19.5785498Z                     
2026-10-02T13:28:19.5786049Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql/3.15.3/quarkus-jdbc-mssql-3.15.3.pom (3.1 kB at 261 kB/s)
2026-10-02T13:28:19.5911977Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql-parent/3.15.3/quarkus-jdbc-mssql-parent-3.15.3.pom
2026-10-02T13:28:19.6042570Z Progress (1): 692 B
2026-10-02T13:28:19.6042846Z                    
2026-10-02T13:28:19.6043812Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql-parent/3.15.3/quarkus-jdbc-mssql-parent-3.15.3.pom (692 B at 49 kB/s)
2026-10-02T13:28:19.6120449Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-parent/3.15.3/quarkus-jdbc-parent-3.15.3.pom
2026-10-02T13:28:19.6279897Z Progress (1): 953 B
2026-10-02T13:28:19.6280102Z                    
2026-10-02T13:28:19.6280622Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-parent/3.15.3/quarkus-jdbc-parent-3.15.3.pom (953 B at 60 kB/s)
2026-10-02T13:28:19.6398410Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/microsoft/sqlserver/mssql-jdbc/12.8.1.jre11/mssql-jdbc-12.8.1.jre11.pom
2026-10-02T13:28:19.6436943Z Progress (1): 4.1/21 kB
2026-10-02T13:28:19.6438860Z Progress (1): 7.7/21 kB
2026-10-02T13:28:19.6441145Z Progress (1): 12/21 kB 
2026-10-02T13:28:19.6442512Z Progress (1): 16/21 kB
2026-10-02T13:28:19.6443782Z Progress (1): 20/21 kB
2026-10-02T13:28:19.6477598Z Progress (1): 21 kB   
2026-10-02T13:28:19.6497186Z                    
2026-10-02T13:28:19.6498465Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/microsoft/sqlserver/mssql-jdbc/12.8.1.jre11/mssql-jdbc-12.8.1.jre11.pom (21 kB at 2.6 MB/s)
2026-10-02T13:28:19.6652275Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway/3.15.3/quarkus-flyway-3.15.3.pom
2026-10-02T13:28:19.6827072Z Progress (1): 3.5 kB
2026-10-02T13:28:19.6827415Z                     
2026-10-02T13:28:19.6828001Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway/3.15.3/quarkus-flyway-3.15.3.pom (3.5 kB at 157 kB/s)
2026-10-02T13:28:19.6914945Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-parent/3.15.3/quarkus-flyway-parent-3.15.3.pom
2026-10-02T13:28:19.7046670Z Progress (1): 735 B
2026-10-02T13:28:19.7046867Z                    
2026-10-02T13:28:19.7047472Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-parent/3.15.3/quarkus-flyway-parent-3.15.3.pom (735 B at 57 kB/s)
2026-10-02T13:28:19.7160159Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-core/10.17.3/flyway-core-10.17.3.pom
2026-10-02T13:28:19.7248813Z Progress (1): 4.1/5.6 kB
2026-10-02T13:28:19.7309285Z Progress (1): 5.6 kB    
2026-10-02T13:28:19.7311345Z                     
2026-10-02T13:28:19.7312726Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-core/10.17.3/flyway-core-10.17.3.pom (5.6 kB at 352 kB/s)
2026-10-02T13:28:19.7370701Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-parent/10.17.3/flyway-parent-10.17.3.pom
2026-10-02T13:28:19.7523571Z Progress (1): 4.1/35 kB
2026-10-02T13:28:19.7523784Z Progress (1): 8.2/35 kB
2026-10-02T13:28:19.7524688Z Progress (1): 12/35 kB 
2026-10-02T13:28:19.7525980Z Progress (1): 16/35 kB
2026-10-02T13:28:19.7527396Z Progress (1): 20/35 kB
2026-10-02T13:28:19.7528278Z Progress (1): 25/35 kB
2026-10-02T13:28:19.7529344Z Progress (1): 29/35 kB
2026-10-02T13:28:19.7530432Z Progress (1): 33/35 kB
2026-10-02T13:28:19.7616245Z Progress (1): 35 kB   
2026-10-02T13:28:19.7616551Z                    
2026-10-02T13:28:19.7617138Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-parent/10.17.3/flyway-parent-10.17.3.pom (35 kB at 1.4 MB/s)
2026-10-02T13:28:19.7692987Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-toml/2.17.2/jackson-dataformat-toml-2.17.2.pom
2026-10-02T13:28:19.7830736Z Progress (1): 3.5 kB
2026-10-02T13:28:19.7831009Z                     
2026-10-02T13:28:19.7831867Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-toml/2.17.2/jackson-dataformat-toml-2.17.2.pom (3.5 kB at 268 kB/s)
2026-10-02T13:28:19.8339833Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-deployment/3.15.3/quarkus-arc-deployment-3.15.3.pom
2026-10-02T13:28:19.8463122Z Progress (1): 3.1 kB
2026-10-02T13:28:19.8463341Z                     
2026-10-02T13:28:19.8464155Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-deployment/3.15.3/quarkus-arc-deployment-3.15.3.pom (3.1 kB at 237 kB/s)
2026-10-02T13:28:19.8619987Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-spi/3.15.3/quarkus-smallrye-context-propagation-spi-3.15.3.pom
2026-10-02T13:28:19.8725791Z Progress (1): 1.0 kB
2026-10-02T13:28:19.8725970Z                     
2026-10-02T13:28:19.8726643Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-spi/3.15.3/quarkus-smallrye-context-propagation-spi-3.15.3.pom (1.0 kB at 95 kB/s)
2026-10-02T13:28:19.8852194Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-spi/3.15.3/quarkus-vertx-http-dev-ui-spi-3.15.3.pom
2026-10-02T13:28:19.9098478Z Progress (1): 805 B
2026-10-02T13:28:19.9098882Z                    
2026-10-02T13:28:19.9099678Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-spi/3.15.3/quarkus-vertx-http-dev-ui-spi-3.15.3.pom (805 B at 67 kB/s)
2026-10-02T13:28:19.9258212Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/arc/arc-processor/3.15.3/arc-processor-3.15.3.pom
2026-10-02T13:28:19.9461812Z Progress (1): 1.9 kB
2026-10-02T13:28:19.9462135Z                     
2026-10-02T13:28:19.9462846Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/arc/arc-processor/3.15.3/arc-processor-3.15.3.pom (1.9 kB at 95 kB/s)
2026-10-02T13:28:19.9536130Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-test-supplement/3.15.3/quarkus-arc-test-supplement-3.15.3.pom
2026-10-02T13:28:19.9679025Z Progress (1): 833 B
2026-10-02T13:28:19.9679311Z                    
2026-10-02T13:28:19.9680124Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-test-supplement/3.15.3/quarkus-arc-test-supplement-3.15.3.pom (833 B at 60 kB/s)
2026-10-02T13:28:20.0378557Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer/3.15.3/quarkus-micrometer-3.15.3.jar
2026-10-02T13:28:20.0379310Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.13.5/micrometer-core-1.13.5.jar
2026-10-02T13:28:20.0379703Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.13.5/micrometer-commons-1.13.5.jar
2026-10-02T13:28:20.0380478Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.13.5/micrometer-observation-1.13.5.jar
2026-10-02T13:28:20.0385336Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache/3.15.3/quarkus-hibernate-orm-panache-3.15.3.jar
2026-10-02T13:28:20.0486472Z Progress (1): 4.1/30 kB
2026-10-02T13:28:20.0486704Z Progress (2): 4.1/30 kB | 4.1/227 kB
2026-10-02T13:28:20.0486918Z Progress (3): 4.1/30 kB | 4.1/227 kB | 4.1/48 kB
2026-10-02T13:28:20.0487310Z Progress (3): 4.1/30 kB | 7.7/227 kB | 4.1/48 kB
2026-10-02T13:28:20.0493075Z Progress (3): 7.7/30 kB | 7.7/227 kB | 4.1/48 kB
2026-10-02T13:28:20.0493495Z Progress (4): 7.7/30 kB | 7.7/227 kB | 4.1/48 kB | 4.1/72 kB
2026-10-02T13:28:20.0495949Z Progress (4): 7.7/30 kB | 7.7/227 kB | 7.7/48 kB | 4.1/72 kB
2026-10-02T13:28:20.0496261Z Progress (4): 7.7/30 kB | 7.7/227 kB | 7.7/48 kB | 6.4/72 kB
2026-10-02T13:28:20.0501739Z Progress (4): 12/30 kB | 7.7/227 kB | 7.7/48 kB | 6.4/72 kB 
2026-10-02T13:28:20.0504091Z Progress (4): 12/30 kB | 12/227 kB | 7.7/48 kB | 6.4/72 kB 
2026-10-02T13:28:20.0507039Z Progress (5): 12/30 kB | 12/227 kB | 7.7/48 kB | 6.4/72 kB | 7.7/863 kB
2026-10-02T13:28:20.0509327Z Progress (5): 16/30 kB | 12/227 kB | 7.7/48 kB | 6.4/72 kB | 7.7/863 kB
2026-10-02T13:28:20.0512807Z Progress (5): 16/30 kB | 12/227 kB | 7.7/48 kB | 10/72 kB | 7.7/863 kB 
2026-10-02T13:28:20.0515241Z Progress (5): 16/30 kB | 12/227 kB | 12/48 kB | 10/72 kB | 7.7/863 kB 
2026-10-02T13:28:20.0517918Z Progress (5): 16/30 kB | 12/227 kB | 12/48 kB | 15/72 kB | 7.7/863 kB
2026-10-02T13:28:20.0519710Z Progress (5): 20/30 kB | 12/227 kB | 12/48 kB | 15/72 kB | 7.7/863 kB
2026-10-02T13:28:20.0522028Z Progress (5): 20/30 kB | 12/227 kB | 12/48 kB | 15/72 kB | 16/863 kB 
2026-10-02T13:28:20.0524727Z Progress (5): 20/30 kB | 16/227 kB | 12/48 kB | 15/72 kB | 16/863 kB
2026-10-02T13:28:20.0529077Z Progress (5): 20/30 kB | 16/227 kB | 12/48 kB | 15/72 kB | 24/863 kB
2026-10-02T13:28:20.0531718Z Progress (5): 24/30 kB | 16/227 kB | 12/48 kB | 15/72 kB | 24/863 kB
2026-10-02T13:28:20.0535762Z Progress (5): 24/30 kB | 16/227 kB | 12/48 kB | 19/72 kB | 24/863 kB
2026-10-02T13:28:20.0537137Z Progress (5): 24/30 kB | 16/227 kB | 16/48 kB | 19/72 kB | 24/863 kB
2026-10-02T13:28:20.0538733Z Progress (5): 24/30 kB | 16/227 kB | 16/48 kB | 23/72 kB | 24/863 kB
2026-10-02T13:28:20.0541007Z Progress (5): 28/30 kB | 16/227 kB | 16/48 kB | 23/72 kB | 24/863 kB
2026-10-02T13:28:20.0544043Z Progress (5): 28/30 kB | 16/227 kB | 16/48 kB | 23/72 kB | 32/863 kB
2026-10-02T13:28:20.0546531Z Progress (5): 28/30 kB | 20/227 kB | 16/48 kB | 23/72 kB | 32/863 kB
2026-10-02T13:28:20.0548223Z Progress (5): 28/30 kB | 20/227 kB | 16/48 kB | 23/72 kB | 40/863 kB
2026-10-02T13:28:20.0554284Z Progress (5): 30 kB | 20/227 kB | 16/48 kB | 23/72 kB | 40/863 kB   
2026-10-02T13:28:20.0554479Z Progress (5): 30 kB | 20/227 kB | 16/48 kB | 27/72 kB | 40/863 kB
2026-10-02T13:28:20.0555589Z Progress (5): 30 kB | 20/227 kB | 20/48 kB | 27/72 kB | 40/863 kB
2026-10-02T13:28:20.0557391Z Progress (5): 30 kB | 20/227 kB | 20/48 kB | 31/72 kB | 40/863 kB
2026-10-02T13:28:20.0560096Z Progress (5): 30 kB | 20/227 kB | 20/48 kB | 31/72 kB | 49/863 kB
2026-10-02T13:28:20.0562083Z Progress (5): 30 kB | 24/227 kB | 20/48 kB | 31/72 kB | 49/863 kB
2026-10-02T13:28:20.0563427Z Progress (5): 30 kB | 24/227 kB | 20/48 kB | 31/72 kB | 57/863 kB
2026-10-02T13:28:20.0565008Z Progress (5): 30 kB | 24/227 kB | 20/48 kB | 35/72 kB | 57/863 kB
2026-10-02T13:28:20.0566339Z Progress (5): 30 kB | 24/227 kB | 24/48 kB | 35/72 kB | 57/863 kB
2026-10-02T13:28:20.0567667Z Progress (5): 30 kB | 24/227 kB | 24/48 kB | 39/72 kB | 57/863 kB
2026-10-02T13:28:20.0569692Z Progress (5): 30 kB | 24/227 kB | 24/48 kB | 39/72 kB | 65/863 kB
2026-10-02T13:28:20.0570978Z Progress (5): 30 kB | 28/227 kB | 24/48 kB | 39/72 kB | 65/863 kB
2026-10-02T13:28:20.0572476Z Progress (5): 30 kB | 28/227 kB | 24/48 kB | 39/72 kB | 73/863 kB
2026-10-02T13:28:20.0573648Z Progress (5): 30 kB | 28/227 kB | 24/48 kB | 43/72 kB | 73/863 kB
2026-10-02T13:28:20.0575809Z Progress (5): 30 kB | 28/227 kB | 28/48 kB | 43/72 kB | 73/863 kB
2026-10-02T13:28:20.0576748Z Progress (5): 30 kB | 28/227 kB | 28/48 kB | 47/72 kB | 73/863 kB
2026-10-02T13:28:20.0578640Z Progress (5): 30 kB | 28/227 kB | 28/48 kB | 47/72 kB | 81/863 kB
2026-10-02T13:28:20.0580635Z Progress (5): 30 kB | 32/227 kB | 28/48 kB | 47/72 kB | 81/863 kB
2026-10-02T13:28:20.0581999Z Progress (5): 30 kB | 32/227 kB | 28/48 kB | 47/72 kB | 90/863 kB
2026-10-02T13:28:20.0583201Z Progress (5): 30 kB | 32/227 kB | 28/48 kB | 51/72 kB | 90/863 kB
2026-10-02T13:28:20.0584268Z Progress (5): 30 kB | 32/227 kB | 28/48 kB | 51/72 kB | 98/863 kB
2026-10-02T13:28:20.0585690Z Progress (5): 30 kB | 32/227 kB | 32/48 kB | 51/72 kB | 98/863 kB
2026-10-02T13:28:20.0586877Z Progress (5): 30 kB | 32/227 kB | 32/48 kB | 51/72 kB | 106/863 kB
2026-10-02T13:28:20.0590009Z Progress (5): 30 kB | 32/227 kB | 32/48 kB | 56/72 kB | 106/863 kB
2026-10-02T13:28:20.0599354Z Progress (5): 30 kB | 36/227 kB | 32/48 kB | 56/72 kB | 106/863 kB
2026-10-02T13:28:20.0599678Z Progress (5): 30 kB | 36/227 kB | 32/48 kB | 60/72 kB | 106/863 kB
2026-10-02T13:28:20.0599982Z Progress (5): 30 kB | 36/227 kB | 32/48 kB | 60/72 kB | 114/863 kB
2026-10-02T13:28:20.0600322Z Progress (5): 30 kB | 36/227 kB | 36/48 kB | 60/72 kB | 114/863 kB
2026-10-02T13:28:20.0600613Z Progress (5): 30 kB | 36/227 kB | 36/48 kB | 64/72 kB | 114/863 kB
2026-10-02T13:28:20.0607467Z Progress (5): 30 kB | 40/227 kB | 36/48 kB | 64/72 kB | 114/863 kB
2026-10-02T13:28:20.0607847Z                                                                   
2026-10-02T13:28:20.0608448Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache/3.15.3/quarkus-hibernate-orm-panache-3.15.3.jar (30 kB at 1.3 MB/s)
2026-10-02T13:28:20.0608703Z Progress (4): 40/227 kB | 36/48 kB | 68/72 kB | 114/863 kB
2026-10-02T13:28:20.0609775Z Progress (4): 40/227 kB | 41/48 kB | 68/72 kB | 114/863 kB
2026-10-02T13:28:20.0611846Z Progress (4): 40/227 kB | 41/48 kB | 72 kB | 114/863 kB   
2026-10-02T13:28:20.0613494Z Progress (4): 45/227 kB | 41/48 kB | 72 kB | 114/863 kB
2026-10-02T13:28:20.0613780Z Progress (4): 45/227 kB | 41/48 kB | 72 kB | 122/863 kB
2026-10-02T13:28:20.0614019Z                                                        
2026-10-02T13:28:20.0614763Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm/3.15.3/quarkus-hibernate-orm-3.15.3.jar
2026-10-02T13:28:20.0616165Z Progress (4): 49/227 kB | 41/48 kB | 72 kB | 122/863 kB
2026-10-02T13:28:20.0617011Z Progress (4): 49/227 kB | 45/48 kB | 72 kB | 122/863 kB
2026-10-02T13:28:20.0617860Z Progress (4): 53/227 kB | 45/48 kB | 72 kB | 122/863 kB
2026-10-02T13:28:20.0619212Z Progress (4): 53/227 kB | 45/48 kB | 72 kB | 131/863 kB
2026-10-02T13:28:20.0620143Z Progress (4): 53/227 kB | 48 kB | 72 kB | 131/863 kB   
2026-10-02T13:28:20.0621421Z Progress (4): 57/227 kB | 48 kB | 72 kB | 131/863 kB
2026-10-02T13:28:20.0626837Z Progress (4): 61/227 kB | 48 kB | 72 kB | 131/863 kB
2026-10-02T13:28:20.0633102Z Progress (4): 61/227 kB | 48 kB | 72 kB | 139/863 kB
2026-10-02T13:28:20.0633312Z Progress (4): 65/227 kB | 48 kB | 72 kB | 139/863 kB
2026-10-02T13:28:20.0633437Z Progress (4): 65/227 kB | 48 kB | 72 kB | 147/863 kB
2026-10-02T13:28:20.0633594Z Progress (4): 69/227 kB | 48 kB | 72 kB | 147/863 kB
2026-10-02T13:28:20.0633899Z Progress (4): 69/227 kB | 48 kB | 72 kB | 155/863 kB
2026-10-02T13:28:20.0634065Z Progress (4): 73/227 kB | 48 kB | 72 kB | 155/863 kB
2026-10-02T13:28:20.0634329Z Progress (4): 73/227 kB | 48 kB | 72 kB | 163/863 kB
2026-10-02T13:28:20.0634488Z Progress (4): 73/227 kB | 48 kB | 72 kB | 172/863 kB
2026-10-02T13:28:20.0639485Z Progress (4): 77/227 kB | 48 kB | 72 kB | 172/863 kB
2026-10-02T13:28:20.0639814Z Progress (4): 77/227 kB | 48 kB | 72 kB | 180/863 kB
2026-10-02T13:28:20.0639985Z Progress (4): 81/227 kB | 48 kB | 72 kB | 180/863 kB
2026-10-02T13:28:20.0640141Z Progress (4): 81/227 kB | 48 kB | 72 kB | 188/863 kB
2026-10-02T13:28:20.0642164Z Progress (4): 86/227 kB | 48 kB | 72 kB | 188/863 kB
2026-10-02T13:28:20.0642467Z Progress (4): 86/227 kB | 48 kB | 72 kB | 196/863 kB
2026-10-02T13:28:20.0643132Z Progress (4): 90/227 kB | 48 kB | 72 kB | 196/863 kB
2026-10-02T13:28:20.0650219Z Progress (4): 90/227 kB | 48 kB | 72 kB | 204/863 kB
2026-10-02T13:28:20.0650376Z Progress (4): 94/227 kB | 48 kB | 72 kB | 204/863 kB
2026-10-02T13:28:20.0650761Z Progress (4): 94/227 kB | 48 kB | 72 kB | 213/863 kB
2026-10-02T13:28:20.0650960Z Progress (4): 98/227 kB | 48 kB | 72 kB | 213/863 kB
2026-10-02T13:28:20.0651112Z Progress (4): 98/227 kB | 48 kB | 72 kB | 221/863 kB
2026-10-02T13:28:20.0651267Z Progress (4): 102/227 kB | 48 kB | 72 kB | 221/863 kB
2026-10-02T13:28:20.0651546Z                                                      
2026-10-02T13:28:20.0652161Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-observation/1.13.5/micrometer-observation-1.13.5.jar (72 kB at 2.7 MB/s)
2026-10-02T13:28:20.0655010Z Progress (3): 106/227 kB | 48 kB | 221/863 kB
2026-10-02T13:28:20.0655279Z Progress (3): 110/227 kB | 48 kB | 221/863 kB
2026-10-02T13:28:20.0655468Z Progress (3): 110/227 kB | 48 kB | 229/863 kB
2026-10-02T13:28:20.0655687Z Progress (3): 114/227 kB | 48 kB | 229/863 kB
2026-10-02T13:28:20.0655827Z                                              
2026-10-02T13:28:20.0656316Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-core/6.6.3.Final/hibernate-core-6.6.3.Final.jar
2026-10-02T13:28:20.0656932Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-commons/1.13.5/micrometer-commons-1.13.5.jar (48 kB at 1.7 MB/s)
2026-10-02T13:28:20.0658210Z Progress (2): 118/227 kB | 229/863 kB
2026-10-02T13:28:20.0658771Z Progress (2): 122/227 kB | 229/863 kB
2026-10-02T13:28:20.0658938Z Progress (2): 122/227 kB | 237/863 kB
2026-10-02T13:28:20.0659089Z Progress (2): 127/227 kB | 237/863 kB
2026-10-02T13:28:20.0659229Z                                      
2026-10-02T13:28:20.0659778Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-graalvm/6.6.3.Final/hibernate-graalvm-6.6.3.Final.jar
2026-10-02T13:28:20.0667643Z Progress (2): 131/227 kB | 237/863 kB
2026-10-02T13:28:20.0667884Z Progress (2): 131/227 kB | 245/863 kB
2026-10-02T13:28:20.0668041Z Progress (2): 131/227 kB | 253/863 kB
2026-10-02T13:28:20.0668193Z Progress (2): 135/227 kB | 253/863 kB
2026-10-02T13:28:20.0675964Z Progress (2): 139/227 kB | 253/863 kB
2026-10-02T13:28:20.0676135Z Progress (2): 143/227 kB | 253/863 kB
2026-10-02T13:28:20.0676285Z Progress (2): 143/227 kB | 262/863 kB
2026-10-02T13:28:20.0676429Z Progress (2): 147/227 kB | 262/863 kB
2026-10-02T13:28:20.0676750Z Progress (2): 151/227 kB | 262/863 kB
2026-10-02T13:28:20.0677925Z Progress (2): 155/227 kB | 262/863 kB
2026-10-02T13:28:20.0678192Z Progress (2): 159/227 kB | 262/863 kB
2026-10-02T13:28:20.0678510Z Progress (2): 159/227 kB | 270/863 kB
2026-10-02T13:28:20.0699363Z Progress (2): 163/227 kB | 270/863 kB
2026-10-02T13:28:20.0699555Z Progress (2): 167/227 kB | 270/863 kB
2026-10-02T13:28:20.0699671Z Progress (2): 167/227 kB | 278/863 kB
2026-10-02T13:28:20.0708385Z Progress (2): 172/227 kB | 278/863 kB
2026-10-02T13:28:20.0708856Z Progress (2): 176/227 kB | 278/863 kB
2026-10-02T13:28:20.0709064Z Progress (2): 176/227 kB | 286/863 kB
2026-10-02T13:28:20.0709423Z Progress (2): 180/227 kB | 286/863 kB
2026-10-02T13:28:20.0709688Z Progress (2): 180/227 kB | 294/863 kB
2026-10-02T13:28:20.0710003Z Progress (2): 184/227 kB | 294/863 kB
2026-10-02T13:28:20.0710247Z Progress (2): 184/227 kB | 303/863 kB
2026-10-02T13:28:20.0710473Z Progress (2): 188/227 kB | 303/863 kB
2026-10-02T13:28:20.0710702Z Progress (2): 188/227 kB | 311/863 kB
2026-10-02T13:28:20.0710963Z Progress (3): 188/227 kB | 311/863 kB | 3.6/4.6 kB
2026-10-02T13:28:20.0744062Z Progress (3): 188/227 kB | 311/863 kB | 4.6 kB    
2026-10-02T13:28:20.0745056Z Progress (4): 188/227 kB | 311/863 kB | 4.6 kB | 4.1/272 kB
2026-10-02T13:28:20.0745307Z Progress (4): 192/227 kB | 311/863 kB | 4.6 kB | 4.1/272 kB
2026-10-02T13:28:20.0745461Z Progress (4): 192/227 kB | 319/863 kB | 4.6 kB | 4.1/272 kB
2026-10-02T13:28:20.0745631Z Progress (4): 196/227 kB | 319/863 kB | 4.6 kB | 4.1/272 kB
2026-10-02T13:28:20.0745812Z Progress (4): 196/227 kB | 319/863 kB | 4.6 kB | 8.2/272 kB
2026-10-02T13:28:20.0746180Z Progress (4): 200/227 kB | 319/863 kB | 4.6 kB | 8.2/272 kB
2026-10-02T13:28:20.0746345Z Progress (4): 200/227 kB | 327/863 kB | 4.6 kB | 8.2/272 kB
2026-10-02T13:28:20.0746526Z Progress (4): 200/227 kB | 327/863 kB | 4.6 kB | 12/272 kB 
2026-10-02T13:28:20.0788183Z Progress (4): 204/227 kB | 327/863 kB | 4.6 kB | 12/272 kB
2026-10-02T13:28:20.0789229Z Progress (4): 204/227 kB | 327/863 kB | 4.6 kB | 16/272 kB
2026-10-02T13:28:20.0789543Z Progress (4): 204/227 kB | 335/863 kB | 4.6 kB | 16/272 kB
2026-10-02T13:28:20.0789792Z Progress (4): 208/227 kB | 335/863 kB | 4.6 kB | 16/272 kB
2026-10-02T13:28:20.0790147Z Progress (4): 208/227 kB | 335/863 kB | 4.6 kB | 20/272 kB
2026-10-02T13:28:20.0790837Z Progress (4): 213/227 kB | 335/863 kB | 4.6 kB | 20/272 kB
2026-10-02T13:28:20.0791118Z Progress (4): 213/227 kB | 335/863 kB | 4.6 kB | 25/272 kB
2026-10-02T13:28:20.0791390Z Progress (4): 213/227 kB | 344/863 kB | 4.6 kB | 25/272 kB
2026-10-02T13:28:20.0791679Z Progress (4): 217/227 kB | 344/863 kB | 4.6 kB | 25/272 kB
2026-10-02T13:28:20.0792109Z Progress (4): 217/227 kB | 344/863 kB | 4.6 kB | 29/272 kB
2026-10-02T13:28:20.0792552Z Progress (4): 221/227 kB | 344/863 kB | 4.6 kB | 29/272 kB
2026-10-02T13:28:20.0797169Z Progress (4): 221/227 kB | 344/863 kB | 4.6 kB | 33/272 kB
2026-10-02T13:28:20.0800465Z Progress (4): 225/227 kB | 344/863 kB | 4.6 kB | 33/272 kB
2026-10-02T13:28:20.0801164Z Progress (4): 225/227 kB | 352/863 kB | 4.6 kB | 33/272 kB
2026-10-02T13:28:20.0801908Z Progress (4): 225/227 kB | 352/863 kB | 4.6 kB | 37/272 kB
2026-10-02T13:28:20.0835677Z Progress (4): 227 kB | 352/863 kB | 4.6 kB | 37/272 kB    
2026-10-02T13:28:20.0836054Z Progress (4): 227 kB | 352/863 kB | 4.6 kB | 41/272 kB
2026-10-02T13:28:20.0836228Z Progress (4): 227 kB | 360/863 kB | 4.6 kB | 41/272 kB
2026-10-02T13:28:20.0836395Z Progress (4): 227 kB | 360/863 kB | 4.6 kB | 45/272 kB
2026-10-02T13:28:20.0836564Z Progress (4): 227 kB | 368/863 kB | 4.6 kB | 45/272 kB
2026-10-02T13:28:20.0836741Z Progress (5): 227 kB | 368/863 kB | 4.6 kB | 45/272 kB | 0.1/12 MB
2026-10-02T13:28:20.0836922Z Progress (5): 227 kB | 368/863 kB | 4.6 kB | 49/272 kB | 0.1/12 MB
2026-10-02T13:28:20.0837083Z Progress (5): 227 kB | 376/863 kB | 4.6 kB | 49/272 kB | 0.1/12 MB
2026-10-02T13:28:20.0837266Z Progress (5): 227 kB | 376/863 kB | 4.6 kB | 53/272 kB | 0.1/12 MB
2026-10-02T13:28:20.0837398Z Progress (5): 227 kB | 385/863 kB | 4.6 kB | 53/272 kB | 0.1/12 MB
2026-10-02T13:28:20.0837569Z Progress (5): 227 kB | 385/863 kB | 4.6 kB | 57/272 kB | 0.1/12 MB
2026-10-02T13:28:20.0875650Z Progress (5): 227 kB | 393/863 kB | 4.6 kB | 57/272 kB | 0.1/12 MB
2026-10-02T13:28:20.0875958Z Progress (5): 227 kB | 393/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1025849Z Progress (5): 227 kB | 401/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1026374Z Progress (5): 227 kB | 409/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1027529Z Progress (5): 227 kB | 417/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1027826Z Progress (5): 227 kB | 426/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1028303Z Progress (5): 227 kB | 434/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1028665Z Progress (5): 227 kB | 442/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1029008Z Progress (5): 227 kB | 450/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1029305Z Progress (5): 227 kB | 458/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1029634Z Progress (5): 227 kB | 466/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1029867Z Progress (5): 227 kB | 475/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1030139Z Progress (5): 227 kB | 483/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1030458Z Progress (5): 227 kB | 491/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1030758Z Progress (5): 227 kB | 499/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1031035Z Progress (5): 227 kB | 507/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1031432Z Progress (5): 227 kB | 516/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1031711Z Progress (5): 227 kB | 524/863 kB | 4.6 kB | 61/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1031934Z                                                                   
2026-10-02T13:28:20.1032747Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer/3.15.3/quarkus-micrometer-3.15.3.jar (227 kB at 4.3 MB/s)
2026-10-02T13:28:20.1033389Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine/3.15.3/quarkus-caffeine-3.15.3.jar
2026-10-02T13:28:20.1033784Z Progress (4): 524/863 kB | 4.6 kB | 66/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1033982Z                                                          
2026-10-02T13:28:20.1034624Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-graalvm/6.6.3.Final/hibernate-graalvm-6.6.3.Final.jar (4.6 kB at 78 kB/s)
2026-10-02T13:28:20.1035345Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common/3.15.3/quarkus-hibernate-orm-panache-common-3.15.3.jar
2026-10-02T13:28:20.1035745Z Progress (3): 532/863 kB | 66/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1036019Z Progress (3): 532/863 kB | 70/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1036275Z Progress (3): 532/863 kB | 74/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1036532Z Progress (3): 540/863 kB | 74/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1036786Z Progress (3): 540/863 kB | 78/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1037054Z Progress (3): 540/863 kB | 82/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1037306Z Progress (3): 548/863 kB | 82/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1037566Z Progress (3): 548/863 kB | 86/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1039172Z Progress (3): 548/863 kB | 90/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1040862Z Progress (3): 557/863 kB | 90/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1047308Z Progress (3): 557/863 kB | 94/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1047646Z Progress (3): 557/863 kB | 94/272 kB | 0.1/12 MB
2026-10-02T13:28:20.1047921Z Progress (4): 557/863 kB | 94/272 kB | 0.1/12 MB | 4.1/9.9 kB
2026-10-02T13:28:20.1051234Z Progress (4): 557/863 kB | 98/272 kB | 0.1/12 MB | 4.1/9.9 kB
2026-10-02T13:28:20.1058072Z Progress (4): 565/863 kB | 98/272 kB | 0.1/12 MB | 4.1/9.9 kB
2026-10-02T13:28:20.1058635Z Progress (4): 565/863 kB | 102/272 kB | 0.1/12 MB | 4.1/9.9 kB
2026-10-02T13:28:20.1066857Z Progress (4): 565/863 kB | 102/272 kB | 0.1/12 MB | 7.7/9.9 kB
2026-10-02T13:28:20.1067366Z Progress (4): 565/863 kB | 102/272 kB | 0.1/12 MB | 9.9 kB    
2026-10-02T13:28:20.1070334Z Progress (4): 565/863 kB | 106/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1075139Z Progress (4): 573/863 kB | 106/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1084271Z Progress (4): 573/863 kB | 111/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1084680Z Progress (4): 581/863 kB | 111/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1094098Z Progress (4): 581/863 kB | 115/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1101389Z Progress (4): 581/863 kB | 119/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1103048Z Progress (4): 589/863 kB | 119/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1113128Z Progress (4): 589/863 kB | 123/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1118657Z Progress (4): 589/863 kB | 127/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1119335Z Progress (4): 598/863 kB | 127/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1130514Z Progress (4): 598/863 kB | 131/272 kB | 0.1/12 MB | 9.9 kB
2026-10-02T13:28:20.1130841Z Progress (5): 598/863 kB | 131/272 kB | 0.1/12 MB | 9.9 kB | 4.1/30 kB
2026-10-02T13:28:20.1135011Z Progress (5): 598/863 kB | 135/272 kB | 0.1/12 MB | 9.9 kB | 4.1/30 kB
2026-10-02T13:28:20.1139260Z Progress (5): 606/863 kB | 135/272 kB | 0.1/12 MB | 9.9 kB | 4.1/30 kB
2026-10-02T13:28:20.1139558Z Progress (5): 606/863 kB | 135/272 kB | 0.1/12 MB | 9.9 kB | 7.7/30 kB
2026-10-02T13:28:20.1151332Z Progress (5): 606/863 kB | 139/272 kB | 0.1/12 MB | 9.9 kB | 7.7/30 kB
2026-10-02T13:28:20.1151790Z Progress (5): 606/863 kB | 143/272 kB | 0.1/12 MB | 9.9 kB | 7.7/30 kB
2026-10-02T13:28:20.1152970Z Progress (5): 606/863 kB | 143/272 kB | 0.1/12 MB | 9.9 kB | 12/30 kB 
2026-10-02T13:28:20.1153443Z                                                                      
2026-10-02T13:28:20.1154361Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine/3.15.3/quarkus-caffeine-3.15.3.jar (9.9 kB at 129 kB/s)
2026-10-02T13:28:20.1155268Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common/3.15.3/quarkus-panache-hibernate-common-3.15.3.jar
2026-10-02T13:28:20.1187034Z Progress (4): 614/863 kB | 143/272 kB | 0.1/12 MB | 12/30 kB
2026-10-02T13:28:20.1187328Z Progress (4): 614/863 kB | 147/272 kB | 0.1/12 MB | 12/30 kB
2026-10-02T13:28:20.1187515Z Progress (4): 614/863 kB | 147/272 kB | 0.1/12 MB | 16/30 kB
2026-10-02T13:28:20.1187718Z Progress (4): 614/863 kB | 152/272 kB | 0.1/12 MB | 16/30 kB
2026-10-02T13:28:20.1187922Z Progress (4): 614/863 kB | 152/272 kB | 0.1/12 MB | 20/30 kB
2026-10-02T13:28:20.1188181Z Progress (4): 614/863 kB | 152/272 kB | 0.2/12 MB | 20/30 kB
2026-10-02T13:28:20.1188352Z Progress (4): 622/863 kB | 152/272 kB | 0.2/12 MB | 20/30 kB
2026-10-02T13:28:20.1188530Z Progress (4): 622/863 kB | 152/272 kB | 0.2/12 MB | 24/30 kB
2026-10-02T13:28:20.1188697Z Progress (4): 622/863 kB | 156/272 kB | 0.2/12 MB | 24/30 kB
2026-10-02T13:28:20.1188826Z Progress (4): 622/863 kB | 156/272 kB | 0.2/12 MB | 28/30 kB
2026-10-02T13:28:20.1188990Z Progress (4): 630/863 kB | 156/272 kB | 0.2/12 MB | 28/30 kB
2026-10-02T13:28:20.1189158Z Progress (4): 630/863 kB | 160/272 kB | 0.2/12 MB | 28/30 kB
2026-10-02T13:28:20.1189336Z Progress (4): 630/863 kB | 160/272 kB | 0.2/12 MB | 30 kB   
2026-10-02T13:28:20.1189498Z Progress (4): 639/863 kB | 160/272 kB | 0.2/12 MB | 30 kB
2026-10-02T13:28:20.1189685Z Progress (4): 639/863 kB | 164/272 kB | 0.2/12 MB | 30 kB
2026-10-02T13:28:20.1189858Z Progress (4): 639/863 kB | 168/272 kB | 0.2/12 MB | 30 kB
2026-10-02T13:28:20.1190017Z Progress (4): 647/863 kB | 168/272 kB | 0.2/12 MB | 30 kB
2026-10-02T13:28:20.1190175Z Progress (4): 647/863 kB | 168/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1190330Z Progress (4): 655/863 kB | 168/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1190458Z Progress (4): 655/863 kB | 172/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1190622Z Progress (4): 663/863 kB | 172/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1190782Z Progress (4): 663/863 kB | 176/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1190936Z Progress (4): 663/863 kB | 180/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1191111Z Progress (4): 671/863 kB | 180/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1191462Z Progress (4): 671/863 kB | 184/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1191729Z Progress (4): 679/863 kB | 184/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1191952Z Progress (4): 679/863 kB | 184/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1192185Z Progress (4): 679/863 kB | 188/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1192366Z Progress (4): 688/863 kB | 188/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1192524Z Progress (4): 688/863 kB | 193/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1192685Z Progress (4): 696/863 kB | 193/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1192837Z Progress (4): 696/863 kB | 197/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1193024Z Progress (4): 704/863 kB | 197/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1193183Z Progress (4): 704/863 kB | 201/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1193337Z Progress (4): 712/863 kB | 201/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1193492Z Progress (4): 712/863 kB | 205/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1193647Z Progress (4): 720/863 kB | 205/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1193855Z Progress (4): 720/863 kB | 209/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1194019Z Progress (4): 729/863 kB | 209/272 kB | 0.3/12 MB | 30 kB
2026-10-02T13:28:20.1194177Z Progress (4): 729/863 kB | 209/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1194673Z Progress (4): 737/863 kB | 209/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1195355Z Progress (4): 737/863 kB | 213/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1195668Z Progress (4): 745/863 kB | 213/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1196095Z Progress (4): 745/863 kB | 217/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1196481Z Progress (4): 753/863 kB | 217/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1197760Z Progress (4): 753/863 kB | 221/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1198627Z Progress (4): 753/863 kB | 225/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1198802Z Progress (4): 761/863 kB | 225/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1199086Z Progress (4): 761/863 kB | 229/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1199421Z Progress (4): 770/863 kB | 229/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1200238Z Progress (4): 770/863 kB | 233/272 kB | 0.4/12 MB | 30 kB
2026-10-02T13:28:20.1200586Z Progress (4): 770/863 kB | 233/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1201518Z Progress (4): 778/863 kB | 233/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1201946Z Progress (4): 778/863 kB | 238/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1202276Z Progress (4): 786/863 kB | 238/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1203077Z Progress (4): 786/863 kB | 242/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1203453Z Progress (4): 786/863 kB | 246/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1203832Z Progress (4): 794/863 kB | 246/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1204678Z Progress (4): 794/863 kB | 250/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1205041Z Progress (4): 802/863 kB | 250/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1205842Z Progress (4): 802/863 kB | 254/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1206363Z Progress (4): 811/863 kB | 254/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1206869Z Progress (4): 811/863 kB | 254/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1207193Z Progress (4): 819/863 kB | 254/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1207709Z Progress (4): 819/863 kB | 258/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1208516Z Progress (4): 827/863 kB | 258/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1208989Z Progress (4): 827/863 kB | 262/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1209349Z Progress (4): 835/863 kB | 262/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1210032Z Progress (4): 835/863 kB | 266/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1210459Z Progress (4): 835/863 kB | 270/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1211072Z Progress (4): 843/863 kB | 270/272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1211485Z Progress (4): 843/863 kB | 272 kB | 0.5/12 MB | 30 kB    
2026-10-02T13:28:20.1212999Z Progress (4): 852/863 kB | 272 kB | 0.5/12 MB | 30 kB
2026-10-02T13:28:20.1213243Z Progress (4): 852/863 kB | 272 kB | 0.6/12 MB | 30 kB
2026-10-02T13:28:20.1214683Z Progress (4): 860/863 kB | 272 kB | 0.6/12 MB | 30 kB
2026-10-02T13:28:20.1218083Z Progress (4): 863 kB | 272 kB | 0.6/12 MB | 30 kB    
2026-10-02T13:28:20.1223583Z Progress (4): 863 kB | 272 kB | 0.7/12 MB | 30 kB
2026-10-02T13:28:20.1230385Z Progress (4): 863 kB | 272 kB | 0.7/12 MB | 30 kB
2026-10-02T13:28:20.1230862Z Progress (4): 863 kB | 272 kB | 0.8/12 MB | 30 kB
2026-10-02T13:28:20.1232988Z Progress (5): 863 kB | 272 kB | 0.8/12 MB | 30 kB | 4.1/17 kB
2026-10-02T13:28:20.1234427Z Progress (5): 863 kB | 272 kB | 0.8/12 MB | 30 kB | 7.7/17 kB
2026-10-02T13:28:20.1235273Z Progress (5): 863 kB | 272 kB | 0.8/12 MB | 30 kB | 12/17 kB 
2026-10-02T13:28:20.1236043Z Progress (5): 863 kB | 272 kB | 0.8/12 MB | 30 kB | 12/17 kB
2026-10-02T13:28:20.1239000Z Progress (5): 863 kB | 272 kB | 0.8/12 MB | 30 kB | 16/17 kB
2026-10-02T13:28:20.1239731Z Progress (5): 863 kB | 272 kB | 0.8/12 MB | 30 kB | 17 kB   
2026-10-02T13:28:20.1245982Z Progress (5): 863 kB | 272 kB | 0.9/12 MB | 30 kB | 17 kB
2026-10-02T13:28:20.1249762Z Progress (5): 863 kB | 272 kB | 1.0/12 MB | 30 kB | 17 kB
2026-10-02T13:28:20.1254847Z Progress (5): 863 kB | 272 kB | 1.0/12 MB | 30 kB | 17 kB
2026-10-02T13:28:20.1255953Z Progress (5): 863 kB | 272 kB | 1.1/12 MB | 30 kB | 17 kB
2026-10-02T13:28:20.1256173Z                                                          
2026-10-02T13:28:20.1256782Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common/3.15.3/quarkus-hibernate-orm-panache-common-3.15.3.jar (30 kB at 343 kB/s)
2026-10-02T13:28:20.1257207Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common/3.15.3/quarkus-panache-common-3.15.3.jar
2026-10-02T13:28:20.1262531Z Progress (4): 863 kB | 272 kB | 1.2/12 MB | 17 kB
2026-10-02T13:28:20.1266267Z Progress (4): 863 kB | 272 kB | 1.2/12 MB | 17 kB
2026-10-02T13:28:20.1270429Z Progress (4): 863 kB | 272 kB | 1.3/12 MB | 17 kB
2026-10-02T13:28:20.1277859Z Progress (4): 863 kB | 272 kB | 1.4/12 MB | 17 kB
2026-10-02T13:28:20.1281084Z Progress (4): 863 kB | 272 kB | 1.4/12 MB | 17 kB
2026-10-02T13:28:20.1283718Z Progress (4): 863 kB | 272 kB | 1.5/12 MB | 17 kB
2026-10-02T13:28:20.1288286Z Progress (4): 863 kB | 272 kB | 1.6/12 MB | 17 kB
2026-10-02T13:28:20.1292067Z Progress (4): 863 kB | 272 kB | 1.6/12 MB | 17 kB
2026-10-02T13:28:20.1297186Z Progress (4): 863 kB | 272 kB | 1.7/12 MB | 17 kB
2026-10-02T13:28:20.1302037Z Progress (4): 863 kB | 272 kB | 1.8/12 MB | 17 kB
2026-10-02T13:28:20.1302371Z Progress (4): 863 kB | 272 kB | 1.8/12 MB | 17 kB
2026-10-02T13:28:20.1303116Z                                                  
2026-10-02T13:28:20.1303622Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm/3.15.3/quarkus-hibernate-orm-3.15.3.jar (272 kB at 3.0 MB/s)
2026-10-02T13:28:20.1304045Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql/3.15.3/quarkus-jdbc-mssql-3.15.3.jar
2026-10-02T13:28:20.1305740Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common/3.15.3/quarkus-panache-hibernate-common-3.15.3.jar (17 kB at 185 kB/s)
2026-10-02T13:28:20.1306127Z Progress (2): 863 kB | 1.9/12 MB
2026-10-02T13:28:20.1306668Z                                 
2026-10-02T13:28:20.1307622Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/micrometer/micrometer-core/1.13.5/micrometer-core-1.13.5.jar (863 kB at 9.3 MB/s)
2026-10-02T13:28:20.1308059Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway/3.15.3/quarkus-flyway-3.15.3.jar
2026-10-02T13:28:20.1308838Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/microsoft/sqlserver/mssql-jdbc/12.8.1.jre11/mssql-jdbc-12.8.1.jre11.jar
2026-10-02T13:28:20.1316240Z Progress (1): 2.0/12 MB
2026-10-02T13:28:20.1319632Z Progress (1): 2.0/12 MB
2026-10-02T13:28:20.1323633Z Progress (1): 2.1/12 MB
2026-10-02T13:28:20.1331297Z Progress (1): 2.2/12 MB
2026-10-02T13:28:20.1336009Z Progress (1): 2.2/12 MB
2026-10-02T13:28:20.1337046Z Progress (1): 2.3/12 MB
2026-10-02T13:28:20.1339458Z Progress (2): 2.3/12 MB | 0/1.5 MB
2026-10-02T13:28:20.1339871Z Progress (2): 2.3/12 MB | 0/1.5 MB
2026-10-02T13:28:20.1340868Z Progress (2): 2.4/12 MB | 0/1.5 MB
2026-10-02T13:28:20.1342401Z Progress (2): 2.4/12 MB | 0/1.5 MB
2026-10-02T13:28:20.1343024Z Progress (2): 2.4/12 MB | 0/1.5 MB
2026-10-02T13:28:20.1343460Z Progress (3): 2.4/12 MB | 0/1.5 MB | 4.1/15 kB
2026-10-02T13:28:20.1343960Z Progress (3): 2.4/12 MB | 0/1.5 MB | 4.1/15 kB
2026-10-02T13:28:20.1345055Z Progress (3): 2.4/12 MB | 0/1.5 MB | 7.7/15 kB
2026-10-02T13:28:20.1346140Z Progress (3): 2.4/12 MB | 0/1.5 MB | 7.7/15 kB
2026-10-02T13:28:20.1346599Z Progress (3): 2.4/12 MB | 0/1.5 MB | 7.7/15 kB
2026-10-02T13:28:20.1347433Z Progress (3): 2.4/12 MB | 0/1.5 MB | 12/15 kB 
2026-10-02T13:28:20.1348216Z Progress (3): 2.4/12 MB | 0/1.5 MB | 15 kB   
2026-10-02T13:28:20.1348778Z Progress (3): 2.4/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1349342Z Progress (3): 2.5/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1350836Z Progress (3): 2.5/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1351537Z Progress (3): 2.5/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1353368Z Progress (3): 2.5/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1353985Z Progress (3): 2.6/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1356311Z Progress (3): 2.6/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1358404Z Progress (3): 2.6/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1358797Z Progress (3): 2.6/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1360473Z Progress (3): 2.6/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1361489Z Progress (3): 2.6/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1362240Z Progress (3): 2.6/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1362991Z Progress (3): 2.7/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1364105Z Progress (3): 2.7/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1365886Z Progress (3): 2.7/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1366730Z Progress (3): 2.7/12 MB | 0.1/1.5 MB | 15 kB
2026-10-02T13:28:20.1367380Z Progress (3): 2.7/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1367873Z Progress (3): 2.7/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1369090Z Progress (3): 2.7/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1370327Z Progress (3): 2.7/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1371634Z Progress (3): 2.7/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1372747Z Progress (3): 2.8/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1374634Z Progress (3): 2.8/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1375787Z Progress (3): 2.8/12 MB | 0.2/1.5 MB | 15 kB
2026-10-02T13:28:20.1376295Z Progress (4): 2.8/12 MB | 0.2/1.5 MB | 15 kB | 4.1/54 kB
2026-10-02T13:28:20.1376866Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 4.1/54 kB
2026-10-02T13:28:20.1378081Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 4.1/54 kB
2026-10-02T13:28:20.1379493Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 7.7/54 kB
2026-10-02T13:28:20.1380208Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 12/54 kB 
2026-10-02T13:28:20.1380649Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 16/54 kB
2026-10-02T13:28:20.1382250Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 16/54 kB
2026-10-02T13:28:20.1382770Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 16/54 kB
2026-10-02T13:28:20.1383361Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 20/54 kB
2026-10-02T13:28:20.1384378Z Progress (4): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 24/54 kB
2026-10-02T13:28:20.1384971Z Progress (5): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 24/54 kB | 4.1/17 kB
2026-10-02T13:28:20.1385597Z Progress (5): 2.9/12 MB | 0.2/1.5 MB | 15 kB | 24/54 kB | 4.1/17 kB
2026-10-02T13:28:20.1386106Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 24/54 kB | 4.1/17 kB
2026-10-02T13:28:20.1386573Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 28/54 kB | 4.1/17 kB
2026-10-02T13:28:20.1387452Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 28/54 kB | 4.1/17 kB
2026-10-02T13:28:20.1388185Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 28/54 kB | 7.7/17 kB
2026-10-02T13:28:20.1388677Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 28/54 kB | 7.7/17 kB
2026-10-02T13:28:20.1389268Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 32/54 kB | 7.7/17 kB
2026-10-02T13:28:20.1389860Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 32/54 kB | 12/17 kB 
2026-10-02T13:28:20.1390359Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 32/54 kB | 12/17 kB
2026-10-02T13:28:20.1391180Z Progress (5): 3.0/12 MB | 0.2/1.5 MB | 15 kB | 32/54 kB | 16/17 kB
2026-10-02T13:28:20.1395847Z Progress (5): 3.1/12 MB | 0.2/1.5 MB | 15 kB | 32/54 kB | 16/17 kB
2026-10-02T13:28:20.1396261Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 32/54 kB | 16/17 kB
2026-10-02T13:28:20.1400744Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 32/54 kB | 17 kB   
2026-10-02T13:28:20.1401082Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 32/54 kB | 17 kB
2026-10-02T13:28:20.1401383Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 32/54 kB | 17 kB
2026-10-02T13:28:20.1402835Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 32/54 kB | 17 kB
2026-10-02T13:28:20.1403768Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 32/54 kB | 17 kB
2026-10-02T13:28:20.1404230Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 36/54 kB | 17 kB
2026-10-02T13:28:20.1406101Z Progress (5): 3.1/12 MB | 0.3/1.5 MB | 15 kB | 36/54 kB | 17 kB
2026-10-02T13:28:20.1406835Z Progress (5): 3.2/12 MB | 0.3/1.5 MB | 15 kB | 36/54 kB | 17 kB
2026-10-02T13:28:20.1407123Z Progress (5): 3.2/12 MB | 0.3/1.5 MB | 15 kB | 36/54 kB | 17 kB
2026-10-02T13:28:20.1407374Z Progress (5): 3.2/12 MB | 0.3/1.5 MB | 15 kB | 40/54 kB | 17 kB
2026-10-02T13:28:20.1407688Z Progress (5): 3.2/12 MB | 0.3/1.5 MB | 15 kB | 44/54 kB | 17 kB
2026-10-02T13:28:20.1408152Z                                                                
2026-10-02T13:28:20.1408989Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common/3.15.3/quarkus-panache-common-3.15.3.jar (15 kB at 145 kB/s)
2026-10-02T13:28:20.1409640Z Progress (4): 3.2/12 MB | 0.3/1.5 MB | 44/54 kB | 17 kB
2026-10-02T13:28:20.1409924Z Progress (4): 3.2/12 MB | 0.3/1.5 MB | 48/54 kB | 17 kB
2026-10-02T13:28:20.1410163Z                                                        
2026-10-02T13:28:20.1410673Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-core/10.17.3/flyway-core-10.17.3.jar
2026-10-02T13:28:20.1411245Z Progress (4): 3.2/12 MB | 0.3/1.5 MB | 52/54 kB | 17 kB
2026-10-02T13:28:20.1411526Z Progress (4): 3.2/12 MB | 0.3/1.5 MB | 52/54 kB | 17 kB
2026-10-02T13:28:20.1411849Z Progress (4): 3.2/12 MB | 0.3/1.5 MB | 54 kB | 17 kB   
2026-10-02T13:28:20.1412723Z Progress (4): 3.3/12 MB | 0.3/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1414824Z Progress (4): 3.3/12 MB | 0.3/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1445710Z Progress (4): 3.3/12 MB | 0.3/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1446492Z Progress (4): 3.3/12 MB | 0.3/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1446814Z Progress (4): 3.3/12 MB | 0.3/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1447063Z Progress (4): 3.3/12 MB | 0.3/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1447604Z Progress (4): 3.3/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1447876Z Progress (4): 3.3/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1448011Z Progress (4): 3.4/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1448177Z Progress (4): 3.4/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1448428Z Progress (4): 3.4/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1448663Z Progress (4): 3.4/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1449133Z Progress (4): 3.4/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1449444Z Progress (4): 3.4/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1449663Z Progress (4): 3.4/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1449925Z Progress (4): 3.5/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1450167Z Progress (4): 3.5/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1450324Z Progress (4): 3.5/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1450601Z Progress (4): 3.5/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1450845Z Progress (4): 3.5/12 MB | 0.4/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1451097Z Progress (4): 3.5/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1451344Z Progress (4): 3.5/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1451582Z Progress (4): 3.5/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1451805Z Progress (4): 3.5/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1452073Z Progress (4): 3.5/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1452320Z Progress (4): 3.6/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1452591Z Progress (4): 3.6/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1452829Z Progress (4): 3.6/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1453064Z Progress (4): 3.6/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1453242Z Progress (4): 3.7/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1453487Z Progress (4): 3.7/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1454296Z Progress (4): 3.7/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1454660Z Progress (4): 3.7/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1455070Z Progress (4): 3.7/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1455623Z Progress (4): 3.7/12 MB | 0.5/1.5 MB | 54 kB | 17 kB
2026-10-02T13:28:20.1455955Z                                                     
2026-10-02T13:28:20.1456525Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql/3.15.3/quarkus-jdbc-mssql-3.15.3.jar (17 kB at 160 kB/s)
2026-10-02T13:28:20.1459131Z Progress (3): 3.7/12 MB | 0.5/1.5 MB | 54 kB
2026-10-02T13:28:20.1459270Z                                             
2026-10-02T13:28:20.1459623Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-toml/2.17.2/jackson-dataformat-toml-2.17.2.jar
2026-10-02T13:28:20.1459869Z Progress (3): 3.7/12 MB | 0.5/1.5 MB | 54 kB
2026-10-02T13:28:20.1460035Z Progress (3): 3.7/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1460295Z Progress (3): 3.8/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1461154Z Progress (3): 3.8/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1461648Z Progress (3): 3.8/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1462500Z Progress (3): 3.8/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1463999Z Progress (3): 3.8/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1464177Z Progress (3): 3.8/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1465235Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1466189Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1467000Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1467720Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1469003Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1469417Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1469845Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1470893Z Progress (3): 3.9/12 MB | 0.6/1.5 MB | 54 kB
2026-10-02T13:28:20.1471809Z Progress (3): 3.9/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1472828Z Progress (3): 3.9/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1473949Z Progress (3): 3.9/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1474078Z Progress (3): 3.9/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1475822Z Progress (3): 4.0/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1476528Z Progress (3): 4.0/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1478110Z Progress (3): 4.0/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1478321Z Progress (3): 4.0/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1479153Z Progress (3): 4.0/12 MB | 0.7/1.5 MB | 54 kB
2026-10-02T13:28:20.1480038Z Progress (4): 4.0/12 MB | 0.7/1.5 MB | 54 kB | 2.3/653 kB
2026-10-02T13:28:20.1481812Z Progress (4): 4.0/12 MB | 0.7/1.5 MB | 54 kB | 2.3/653 kB
2026-10-02T13:28:20.1482007Z Progress (4): 4.1/12 MB | 0.7/1.5 MB | 54 kB | 2.3/653 kB
2026-10-02T13:28:20.1482176Z Progress (4): 4.1/12 MB | 0.7/1.5 MB | 54 kB | 2.3/653 kB
2026-10-02T13:28:20.1482343Z Progress (4): 4.1/12 MB | 0.7/1.5 MB | 54 kB | 6.4/653 kB
2026-10-02T13:28:20.1482865Z Progress (4): 4.1/12 MB | 0.7/1.5 MB | 54 kB | 6.4/653 kB
2026-10-02T13:28:20.1484839Z Progress (4): 4.1/12 MB | 0.7/1.5 MB | 54 kB | 6.4/653 kB
2026-10-02T13:28:20.1485017Z Progress (4): 4.1/12 MB | 0.8/1.5 MB | 54 kB | 6.4/653 kB
2026-10-02T13:28:20.1485344Z                                                          
2026-10-02T13:28:20.1485794Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway/3.15.3/quarkus-flyway-3.15.3.jar (54 kB at 493 kB/s)
2026-10-02T13:28:20.1486101Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 6.4/653 kB
2026-10-02T13:28:20.1486476Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 6.4/653 kB
2026-10-02T13:28:20.1486647Z                                                  
2026-10-02T13:28:20.1487038Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal/3.15.3/quarkus-agroal-3.15.3.jar
2026-10-02T13:28:20.1487310Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 10/653 kB
2026-10-02T13:28:20.1487720Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 10/653 kB
2026-10-02T13:28:20.1488539Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 15/653 kB
2026-10-02T13:28:20.1488755Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 15/653 kB
2026-10-02T13:28:20.1489831Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 19/653 kB
2026-10-02T13:28:20.1490219Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 19/653 kB
2026-10-02T13:28:20.1490711Z Progress (3): 4.1/12 MB | 0.8/1.5 MB | 23/653 kB
2026-10-02T13:28:20.1491039Z Progress (3): 4.2/12 MB | 0.8/1.5 MB | 23/653 kB
2026-10-02T13:28:20.1491439Z Progress (3): 4.2/12 MB | 0.8/1.5 MB | 27/653 kB
2026-10-02T13:28:20.1491750Z Progress (3): 4.2/12 MB | 0.8/1.5 MB | 27/653 kB
2026-10-02T13:28:20.1493314Z Progress (3): 4.2/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1495938Z Progress (3): 4.2/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1496110Z Progress (3): 4.3/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1497607Z Progress (3): 4.3/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1499417Z Progress (3): 4.3/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1500368Z Progress (3): 4.3/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1501105Z Progress (3): 4.3/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1501620Z Progress (3): 4.3/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1501859Z Progress (3): 4.3/12 MB | 0.8/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1503214Z Progress (3): 4.3/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1504139Z Progress (3): 4.3/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1506931Z Progress (3): 4.3/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1507101Z Progress (3): 4.3/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1507267Z Progress (3): 4.3/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1507422Z Progress (3): 4.4/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1510492Z Progress (3): 4.4/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1510704Z Progress (3): 4.4/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1510921Z Progress (3): 4.4/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1511138Z Progress (3): 4.4/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1511406Z Progress (3): 4.5/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1513437Z Progress (3): 4.5/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1513918Z Progress (3): 4.5/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1514982Z Progress (3): 4.5/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1515638Z Progress (3): 4.5/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1515843Z Progress (3): 4.5/12 MB | 0.9/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1516576Z Progress (3): 4.5/12 MB | 1.0/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1517935Z Progress (3): 4.5/12 MB | 1.0/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1519180Z Progress (3): 4.5/12 MB | 1.0/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1519862Z Progress (3): 4.5/12 MB | 1.0/1.5 MB | 31/653 kB
2026-10-02T13:28:20.1520485Z Progress (3): 4.5/12 MB | 1.0/1.5 MB | 35/653 kB
2026-10-02T13:28:20.1520809Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 35/653 kB
2026-10-02T13:28:20.1521304Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 39/653 kB
2026-10-02T13:28:20.1522033Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 39/653 kB
2026-10-02T13:28:20.1522601Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 43/653 kB
2026-10-02T13:28:20.1976627Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 47/653 kB
2026-10-02T13:28:20.1977102Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 51/653 kB
2026-10-02T13:28:20.1977596Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 51/653 kB
2026-10-02T13:28:20.1977729Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 51/653 kB
2026-10-02T13:28:20.1977891Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 56/653 kB
2026-10-02T13:28:20.1978094Z Progress (3): 4.6/12 MB | 1.0/1.5 MB | 56/653 kB
2026-10-02T13:28:20.1978290Z Progress (3): 4.7/12 MB | 1.0/1.5 MB | 56/653 kB
2026-10-02T13:28:20.1978448Z Progress (3): 4.8/12 MB | 1.0/1.5 MB | 56/653 kB
2026-10-02T13:28:20.1978602Z Progress (3): 4.8/12 MB | 1.0/1.5 MB | 56/653 kB
2026-10-02T13:28:20.1978754Z Progress (3): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB
2026-10-02T13:28:20.1978929Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 4.1/56 kB
2026-10-02T13:28:20.1979069Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 8.2/56 kB
2026-10-02T13:28:20.1979263Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 12/56 kB 
2026-10-02T13:28:20.1979445Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 16/56 kB
2026-10-02T13:28:20.1979617Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 20/56 kB
2026-10-02T13:28:20.1979789Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 25/56 kB
2026-10-02T13:28:20.1979955Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 29/56 kB
2026-10-02T13:28:20.1980132Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 33/56 kB
2026-10-02T13:28:20.1980303Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 37/56 kB
2026-10-02T13:28:20.1980480Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 41/56 kB
2026-10-02T13:28:20.1980657Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 45/56 kB
2026-10-02T13:28:20.1980785Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 49/56 kB
2026-10-02T13:28:20.1980948Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 53/56 kB
2026-10-02T13:28:20.1981107Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 56/653 kB | 56 kB   
2026-10-02T13:28:20.1981275Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 60/653 kB | 56 kB
2026-10-02T13:28:20.1981443Z Progress (4): 4.9/12 MB | 1.0/1.5 MB | 60/653 kB | 56 kB
2026-10-02T13:28:20.1981620Z Progress (5): 4.9/12 MB | 1.0/1.5 MB | 60/653 kB | 56 kB | 4.1/53 kB
2026-10-02T13:28:20.1982026Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 60/653 kB | 56 kB | 4.1/53 kB
2026-10-02T13:28:20.1982218Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 60/653 kB | 56 kB | 4.1/53 kB
2026-10-02T13:28:20.1982412Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 64/653 kB | 56 kB | 4.1/53 kB
2026-10-02T13:28:20.1982578Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 64/653 kB | 56 kB | 7.7/53 kB
2026-10-02T13:28:20.1982802Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 68/653 kB | 56 kB | 7.7/53 kB
2026-10-02T13:28:20.1983469Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 68/653 kB | 56 kB | 7.7/53 kB
2026-10-02T13:28:20.1983823Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 72/653 kB | 56 kB | 7.7/53 kB
2026-10-02T13:28:20.1984651Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 72/653 kB | 56 kB | 7.7/53 kB
2026-10-02T13:28:20.1985127Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 72/653 kB | 56 kB | 12/53 kB 
2026-10-02T13:28:20.1986375Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 76/653 kB | 56 kB | 12/53 kB
2026-10-02T13:28:20.1986836Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 76/653 kB | 56 kB | 12/53 kB
2026-10-02T13:28:20.1987284Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 80/653 kB | 56 kB | 12/53 kB
2026-10-02T13:28:20.1988174Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 80/653 kB | 56 kB | 16/53 kB
2026-10-02T13:28:20.1989482Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 84/653 kB | 56 kB | 16/53 kB
2026-10-02T13:28:20.1989839Z Progress (5): 5.0/12 MB | 1.0/1.5 MB | 84/653 kB | 56 kB | 16/53 kB
2026-10-02T13:28:20.1990013Z Progress (5): 5.1/12 MB | 1.0/1.5 MB | 84/653 kB | 56 kB | 16/53 kB
2026-10-02T13:28:20.1991228Z Progress (5): 5.1/12 MB | 1.0/1.5 MB | 84/653 kB | 56 kB | 20/53 kB
2026-10-02T13:28:20.1991545Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 84/653 kB | 56 kB | 20/53 kB
2026-10-02T13:28:20.1991854Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 88/653 kB | 56 kB | 20/53 kB
2026-10-02T13:28:20.1992148Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 88/653 kB | 56 kB | 24/53 kB
2026-10-02T13:28:20.1993072Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 92/653 kB | 56 kB | 24/53 kB
2026-10-02T13:28:20.1993246Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 92/653 kB | 56 kB | 24/53 kB
2026-10-02T13:28:20.1993653Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 92/653 kB | 56 kB | 28/53 kB
2026-10-02T13:28:20.1993993Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 96/653 kB | 56 kB | 28/53 kB
2026-10-02T13:28:20.1994736Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 96/653 kB | 56 kB | 32/53 kB
2026-10-02T13:28:20.1995077Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 101/653 kB | 56 kB | 32/53 kB
2026-10-02T13:28:20.1995602Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 101/653 kB | 56 kB | 32/53 kB
2026-10-02T13:28:20.1996489Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 105/653 kB | 56 kB | 32/53 kB
2026-10-02T13:28:20.1996693Z Progress (5): 5.1/12 MB | 1.1/1.5 MB | 105/653 kB | 56 kB | 36/53 kB
2026-10-02T13:28:20.1997122Z Progress (5): 5.2/12 MB | 1.1/1.5 MB | 105/653 kB | 56 kB | 36/53 kB
2026-10-02T13:28:20.1997783Z Progress (5): 5.2/12 MB | 1.1/1.5 MB | 105/653 kB | 56 kB | 41/53 kB
2026-10-02T13:28:20.1998719Z Progress (5): 5.2/12 MB | 1.1/1.5 MB | 109/653 kB | 56 kB | 41/53 kB
2026-10-02T13:28:20.1999909Z Progress (5): 5.2/12 MB | 1.1/1.5 MB | 113/653 kB | 56 kB | 41/53 kB
2026-10-02T13:28:20.2001221Z Progress (5): 5.2/12 MB | 1.1/1.5 MB | 113/653 kB | 56 kB | 45/53 kB
2026-10-02T13:28:20.2008753Z Progress (5): 5.2/12 MB | 1.1/1.5 MB | 113/653 kB | 56 kB | 45/53 kB
2026-10-02T13:28:20.2009218Z Progress (5): 5.2/12 MB | 1.1/1.5 MB | 113/653 kB | 56 kB | 45/53 kB
2026-10-02T13:28:20.2009394Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 113/653 kB | 56 kB | 45/53 kB
2026-10-02T13:28:20.2009751Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 113/653 kB | 56 kB | 49/53 kB
2026-10-02T13:28:20.2012542Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 113/653 kB | 56 kB | 49/53 kB
2026-10-02T13:28:20.2012720Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 117/653 kB | 56 kB | 49/53 kB
2026-10-02T13:28:20.2012872Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 117/653 kB | 56 kB | 53/53 kB
2026-10-02T13:28:20.2013060Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 117/653 kB | 56 kB | 53/53 kB
2026-10-02T13:28:20.2014005Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 117/653 kB | 56 kB | 53 kB   
2026-10-02T13:28:20.2014916Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 121/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2016508Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 121/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2017472Z Progress (5): 5.3/12 MB | 1.1/1.5 MB | 125/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2017654Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 125/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2018344Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 129/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2019180Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 129/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2020034Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 133/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2020553Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 137/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2021058Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 137/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2021433Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 137/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2022263Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 142/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2022593Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 142/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2023456Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 146/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2027308Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 150/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2027478Z Progress (5): 5.4/12 MB | 1.1/1.5 MB | 150/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2028729Z Progress (5): 5.5/12 MB | 1.1/1.5 MB | 150/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2029378Z Progress (5): 5.5/12 MB | 1.1/1.5 MB | 154/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2030055Z Progress (5): 5.5/12 MB | 1.1/1.5 MB | 154/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2031796Z Progress (5): 5.5/12 MB | 1.1/1.5 MB | 158/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2032195Z Progress (5): 5.5/12 MB | 1.2/1.5 MB | 158/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2035024Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 158/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2035486Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 162/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2035668Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 166/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2035830Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 170/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2036314Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 174/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2036671Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 178/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2037634Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 178/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2038140Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 178/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2038889Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 182/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2039694Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 187/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2040589Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 191/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2041322Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 195/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2041889Z Progress (5): 5.6/12 MB | 1.2/1.5 MB | 195/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2042296Z Progress (5): 5.7/12 MB | 1.2/1.5 MB | 195/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2042902Z Progress (5): 5.7/12 MB | 1.2/1.5 MB | 199/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2043570Z Progress (5): 5.7/12 MB | 1.2/1.5 MB | 203/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2044452Z Progress (5): 5.7/12 MB | 1.2/1.5 MB | 207/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2045625Z Progress (5): 5.7/12 MB | 1.2/1.5 MB | 211/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2045861Z Progress (5): 5.7/12 MB | 1.2/1.5 MB | 211/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2046719Z Progress (5): 5.7/12 MB | 1.2/1.5 MB | 215/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2047171Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 215/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2048055Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 215/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2048680Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 219/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2049127Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 219/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2049935Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 223/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2050552Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 228/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2051204Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 232/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2051659Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 236/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2052452Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 236/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2052847Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 236/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2054166Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 240/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2054722Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 244/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2055302Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 248/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2055723Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 248/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2056468Z Progress (5): 5.8/12 MB | 1.2/1.5 MB | 252/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2056862Z Progress (5): 5.9/12 MB | 1.2/1.5 MB | 252/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2057513Z Progress (5): 5.9/12 MB | 1.2/1.5 MB | 256/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2059550Z Progress (5): 5.9/12 MB | 1.2/1.5 MB | 256/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2060158Z Progress (5): 5.9/12 MB | 1.2/1.5 MB | 256/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2060601Z Progress (5): 5.9/12 MB | 1.2/1.5 MB | 260/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2060999Z Progress (5): 5.9/12 MB | 1.2/1.5 MB | 260/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2061455Z Progress (5): 5.9/12 MB | 1.2/1.5 MB | 264/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2061871Z Progress (5): 6.0/12 MB | 1.2/1.5 MB | 264/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2062493Z Progress (5): 6.0/12 MB | 1.2/1.5 MB | 269/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2063447Z Progress (5): 6.0/12 MB | 1.2/1.5 MB | 269/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2064369Z Progress (5): 6.0/12 MB | 1.2/1.5 MB | 273/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2065152Z Progress (5): 6.0/12 MB | 1.2/1.5 MB | 277/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2065560Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 277/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2066365Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 281/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2066902Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 285/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2067582Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 285/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2068066Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 285/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2068859Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 289/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2071801Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 293/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2072530Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 297/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2072703Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 297/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2072953Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 301/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2073126Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 305/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2073255Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 305/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2073419Z Progress (5): 6.0/12 MB | 1.3/1.5 MB | 309/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2073741Z Progress (5): 6.1/12 MB | 1.3/1.5 MB | 309/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2074672Z Progress (5): 6.1/12 MB | 1.3/1.5 MB | 314/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2074984Z Progress (5): 6.1/12 MB | 1.3/1.5 MB | 314/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2076092Z Progress (5): 6.1/12 MB | 1.3/1.5 MB | 318/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2076884Z Progress (5): 6.1/12 MB | 1.3/1.5 MB | 322/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2077493Z Progress (5): 6.1/12 MB | 1.3/1.5 MB | 322/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2078028Z Progress (5): 6.1/12 MB | 1.3/1.5 MB | 326/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2078517Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 326/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2079269Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 330/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2080124Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 330/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2080685Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 334/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2081123Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 338/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2081572Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 338/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2082349Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 342/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2082763Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 342/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2083164Z Progress (5): 6.2/12 MB | 1.3/1.5 MB | 346/653 kB | 56 kB | 53 kB
2026-10-02T13:28:20.2083626Z                                                                  
2026-10-02T13:28:20.2084226Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/fasterxml/jackson/dataformat/jackson-dataformat-toml/2.17.2/jackson-dataformat-toml-2.17.2.jar (56 kB at 330 kB/s)
2026-10-02T13:28:20.2084675Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 350/653 kB | 53 kB
2026-10-02T13:28:20.2084882Z                                                          
2026-10-02T13:28:20.2085164Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource/3.15.3/quarkus-datasource-3.15.3.jar
2026-10-02T13:28:20.2087202Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 350/653 kB | 53 kB
2026-10-02T13:28:20.2087385Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 350/653 kB | 53 kB
2026-10-02T13:28:20.2087729Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 350/653 kB | 53 kB
2026-10-02T13:28:20.2087898Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 355/653 kB | 53 kB
2026-10-02T13:28:20.2088497Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 355/653 kB | 53 kB
2026-10-02T13:28:20.2089278Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 359/653 kB | 53 kB
2026-10-02T13:28:20.2089872Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 363/653 kB | 53 kB
2026-10-02T13:28:20.2090366Z Progress (4): 6.2/12 MB | 1.3/1.5 MB | 367/653 kB | 53 kB
2026-10-02T13:28:20.2090725Z Progress (4): 6.2/12 MB | 1.4/1.5 MB | 367/653 kB | 53 kB
2026-10-02T13:28:20.2091833Z Progress (4): 6.2/12 MB | 1.4/1.5 MB | 371/653 kB | 53 kB
2026-10-02T13:28:20.2092138Z Progress (4): 6.2/12 MB | 1.4/1.5 MB | 371/653 kB | 53 kB
2026-10-02T13:28:20.2092870Z Progress (4): 6.2/12 MB | 1.4/1.5 MB | 375/653 kB | 53 kB
2026-10-02T13:28:20.2093191Z Progress (4): 6.2/12 MB | 1.4/1.5 MB | 379/653 kB | 53 kB
2026-10-02T13:28:20.2093467Z Progress (4): 6.2/12 MB | 1.4/1.5 MB | 379/653 kB | 53 kB
2026-10-02T13:28:20.2094051Z Progress (4): 6.2/12 MB | 1.4/1.5 MB | 383/653 kB | 53 kB
2026-10-02T13:28:20.2094572Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 383/653 kB | 53 kB
2026-10-02T13:28:20.2095502Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 387/653 kB | 53 kB
2026-10-02T13:28:20.2095815Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 387/653 kB | 53 kB
2026-10-02T13:28:20.2096550Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 391/653 kB | 53 kB
2026-10-02T13:28:20.2097133Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 395/653 kB | 53 kB
2026-10-02T13:28:20.2097480Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 395/653 kB | 53 kB
2026-10-02T13:28:20.2098169Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 400/653 kB | 53 kB
2026-10-02T13:28:20.2098530Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 404/653 kB | 53 kB
2026-10-02T13:28:20.2098800Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 404/653 kB | 53 kB
2026-10-02T13:28:20.2099511Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 408/653 kB | 53 kB
2026-10-02T13:28:20.2100108Z Progress (4): 6.3/12 MB | 1.4/1.5 MB | 412/653 kB | 53 kB
2026-10-02T13:28:20.2100369Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 412/653 kB | 53 kB
2026-10-02T13:28:20.2100847Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 416/653 kB | 53 kB
2026-10-02T13:28:20.2101314Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 416/653 kB | 53 kB
2026-10-02T13:28:20.2106765Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 420/653 kB | 53 kB
2026-10-02T13:28:20.2107572Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 424/653 kB | 53 kB
2026-10-02T13:28:20.2107787Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 424/653 kB | 53 kB
2026-10-02T13:28:20.2107977Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 428/653 kB | 53 kB
2026-10-02T13:28:20.2108104Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 432/653 kB | 53 kB
2026-10-02T13:28:20.2108309Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 432/653 kB | 53 kB
2026-10-02T13:28:20.2108553Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 436/653 kB | 53 kB
2026-10-02T13:28:20.2108839Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 441/653 kB | 53 kB
2026-10-02T13:28:20.2109134Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 441/653 kB | 53 kB
2026-10-02T13:28:20.2109302Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 445/653 kB | 53 kB
2026-10-02T13:28:20.2109461Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 449/653 kB | 53 kB
2026-10-02T13:28:20.2109642Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 449/653 kB | 53 kB
2026-10-02T13:28:20.2109808Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 453/653 kB | 53 kB
2026-10-02T13:28:20.2109932Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 457/653 kB | 53 kB
2026-10-02T13:28:20.2110101Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 457/653 kB | 53 kB
2026-10-02T13:28:20.2110256Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 461/653 kB | 53 kB
2026-10-02T13:28:20.2110414Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 465/653 kB | 53 kB
2026-10-02T13:28:20.2110573Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 465/653 kB | 53 kB
2026-10-02T13:28:20.2110733Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 469/653 kB | 53 kB
2026-10-02T13:28:20.2110891Z Progress (4): 6.4/12 MB | 1.4/1.5 MB | 473/653 kB | 53 kB
2026-10-02T13:28:20.2111106Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 473/653 kB | 53 kB
2026-10-02T13:28:20.2111476Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 477/653 kB | 53 kB
2026-10-02T13:28:20.2111638Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 477/653 kB | 53 kB
2026-10-02T13:28:20.2111760Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 482/653 kB | 53 kB
2026-10-02T13:28:20.2111915Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 482/653 kB | 53 kB
2026-10-02T13:28:20.2112068Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 486/653 kB | 53 kB
2026-10-02T13:28:20.2112238Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 486/653 kB | 53 kB
2026-10-02T13:28:20.2112528Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 490/653 kB | 53 kB
2026-10-02T13:28:20.2112710Z Progress (4): 6.4/12 MB | 1.5/1.5 MB | 494/653 kB | 53 kB
2026-10-02T13:28:20.2112878Z Progress (4): 6.4/12 MB | 1.5 MB | 494/653 kB | 53 kB    
2026-10-02T13:28:20.2113448Z Progress (4): 6.4/12 MB | 1.5 MB | 498/653 kB | 53 kB
2026-10-02T13:28:20.2114018Z Progress (4): 6.4/12 MB | 1.5 MB | 502/653 kB | 53 kB
2026-10-02T13:28:20.2114716Z Progress (4): 6.4/12 MB | 1.5 MB | 506/653 kB | 53 kB
2026-10-02T13:28:20.2115788Z Progress (4): 6.4/12 MB | 1.5 MB | 510/653 kB | 53 kB
2026-10-02T13:28:20.2115967Z Progress (4): 6.4/12 MB | 1.5 MB | 514/653 kB | 53 kB
2026-10-02T13:28:20.2116259Z Progress (4): 6.5/12 MB | 1.5 MB | 514/653 kB | 53 kB
2026-10-02T13:28:20.2116900Z Progress (4): 6.5/12 MB | 1.5 MB | 518/653 kB | 53 kB
2026-10-02T13:28:20.2117524Z Progress (4): 6.5/12 MB | 1.5 MB | 522/653 kB | 53 kB
2026-10-02T13:28:20.2118146Z Progress (4): 6.5/12 MB | 1.5 MB | 527/653 kB | 53 kB
2026-10-02T13:28:20.2118763Z Progress (4): 6.5/12 MB | 1.5 MB | 531/653 kB | 53 kB
2026-10-02T13:28:20.2119394Z Progress (4): 6.5/12 MB | 1.5 MB | 535/653 kB | 53 kB
2026-10-02T13:28:20.2119954Z Progress (4): 6.5/12 MB | 1.5 MB | 539/653 kB | 53 kB
2026-10-02T13:28:20.2120606Z Progress (4): 6.5/12 MB | 1.5 MB | 543/653 kB | 53 kB
2026-10-02T13:28:20.2121025Z Progress (4): 6.5/12 MB | 1.5 MB | 547/653 kB | 53 kB
2026-10-02T13:28:20.2121474Z Progress (4): 6.5/12 MB | 1.5 MB | 547/653 kB | 53 kB
2026-10-02T13:28:20.2122112Z Progress (4): 6.5/12 MB | 1.5 MB | 551/653 kB | 53 kB
2026-10-02T13:28:20.2122740Z Progress (4): 6.5/12 MB | 1.5 MB | 555/653 kB | 53 kB
2026-10-02T13:28:20.2123288Z Progress (4): 6.5/12 MB | 1.5 MB | 559/653 kB | 53 kB
2026-10-02T13:28:20.2123821Z Progress (4): 6.5/12 MB | 1.5 MB | 563/653 kB | 53 kB
2026-10-02T13:28:20.2124379Z Progress (4): 6.5/12 MB | 1.5 MB | 568/653 kB | 53 kB
2026-10-02T13:28:20.2125157Z Progress (4): 6.5/12 MB | 1.5 MB | 572/653 kB | 53 kB
2026-10-02T13:28:20.2125696Z Progress (4): 6.5/12 MB | 1.5 MB | 576/653 kB | 53 kB
2026-10-02T13:28:20.2126028Z Progress (4): 6.5/12 MB | 1.5 MB | 580/653 kB | 53 kB
2026-10-02T13:28:20.2126432Z Progress (4): 6.6/12 MB | 1.5 MB | 580/653 kB | 53 kB
2026-10-02T13:28:20.2126833Z Progress (4): 6.6/12 MB | 1.5 MB | 584/653 kB | 53 kB
2026-10-02T13:28:20.2127379Z Progress (4): 6.6/12 MB | 1.5 MB | 588/653 kB | 53 kB
2026-10-02T13:28:20.2128068Z Progress (4): 6.6/12 MB | 1.5 MB | 592/653 kB | 53 kB
2026-10-02T13:28:20.2128472Z Progress (4): 6.6/12 MB | 1.5 MB | 596/653 kB | 53 kB
2026-10-02T13:28:20.2129004Z Progress (4): 6.6/12 MB | 1.5 MB | 600/653 kB | 53 kB
2026-10-02T13:28:20.2129554Z Progress (4): 6.6/12 MB | 1.5 MB | 604/653 kB | 53 kB
2026-10-02T13:28:20.2130182Z Progress (4): 6.6/12 MB | 1.5 MB | 608/653 kB | 53 kB
2026-10-02T13:28:20.2130817Z Progress (4): 6.6/12 MB | 1.5 MB | 613/653 kB | 53 kB
2026-10-02T13:28:20.2131347Z Progress (4): 6.6/12 MB | 1.5 MB | 617/653 kB | 53 kB
2026-10-02T13:28:20.2131541Z Progress (4): 6.6/12 MB | 1.5 MB | 621/653 kB | 53 kB
2026-10-02T13:28:20.2131765Z Progress (4): 6.7/12 MB | 1.5 MB | 621/653 kB | 53 kB
2026-10-02T13:28:20.2132278Z Progress (4): 6.7/12 MB | 1.5 MB | 625/653 kB | 53 kB
2026-10-02T13:28:20.2132845Z Progress (4): 6.7/12 MB | 1.5 MB | 629/653 kB | 53 kB
2026-10-02T13:28:20.2133418Z Progress (4): 6.7/12 MB | 1.5 MB | 633/653 kB | 53 kB
2026-10-02T13:28:20.2133983Z Progress (4): 6.7/12 MB | 1.5 MB | 637/653 kB | 53 kB
2026-10-02T13:28:20.2134907Z Progress (4): 6.7/12 MB | 1.5 MB | 641/653 kB | 53 kB
2026-10-02T13:28:20.2135430Z Progress (4): 6.7/12 MB | 1.5 MB | 645/653 kB | 53 kB
2026-10-02T13:28:20.2135954Z Progress (4): 6.7/12 MB | 1.5 MB | 649/653 kB | 53 kB
2026-10-02T13:28:20.2136272Z Progress (4): 6.7/12 MB | 1.5 MB | 653 kB | 53 kB    
2026-10-02T13:28:20.2140851Z Progress (4): 6.7/12 MB | 1.5 MB | 653 kB | 53 kB
2026-10-02T13:28:20.2143582Z Progress (4): 6.8/12 MB | 1.5 MB | 653 kB | 53 kB
2026-10-02T13:28:20.2143810Z                                                  
2026-10-02T13:28:20.2144313Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal/3.15.3/quarkus-agroal-3.15.3.jar (53 kB at 300 kB/s)
2026-10-02T13:28:20.2144989Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta/3.15.3/quarkus-narayana-jta-3.15.3.jar
2026-10-02T13:28:20.2147020Z Progress (3): 6.9/12 MB | 1.5 MB | 653 kB
2026-10-02T13:28:20.2147239Z                                          
2026-10-02T13:28:20.2147730Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/microsoft/sqlserver/mssql-jdbc/12.8.1.jre11/mssql-jdbc-12.8.1.jre11.jar (1.5 MB at 8.4 MB/s)
2026-10-02T13:28:20.2148164Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-transaction-annotations/3.15.3/quarkus-transaction-annotations-3.15.3.jar
2026-10-02T13:28:20.2152963Z Progress (2): 6.9/12 MB | 653 kB
2026-10-02T13:28:20.2156970Z Progress (2): 7.0/12 MB | 653 kB
2026-10-02T13:28:20.2165533Z Progress (2): 7.1/12 MB | 653 kB
2026-10-02T13:28:20.2165738Z Progress (3): 7.1/12 MB | 653 kB | 4.1/18 kB
2026-10-02T13:28:20.2165920Z Progress (3): 7.1/12 MB | 653 kB | 4.1/18 kB
2026-10-02T13:28:20.2166079Z Progress (3): 7.1/12 MB | 653 kB | 7.7/18 kB
2026-10-02T13:28:20.2166237Z Progress (3): 7.1/12 MB | 653 kB | 12/18 kB 
2026-10-02T13:28:20.2166397Z Progress (3): 7.1/12 MB | 653 kB | 16/18 kB
2026-10-02T13:28:20.2166567Z Progress (3): 7.1/12 MB | 653 kB | 18 kB   
2026-10-02T13:28:20.2169531Z Progress (3): 7.2/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2173395Z Progress (3): 7.3/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2177727Z Progress (3): 7.3/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2181157Z Progress (3): 7.4/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2184922Z Progress (3): 7.5/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2188997Z Progress (3): 7.5/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2208061Z Progress (3): 7.6/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2208245Z Progress (3): 7.7/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2208415Z Progress (3): 7.7/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2208807Z Progress (3): 7.8/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2209468Z Progress (3): 7.9/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2213344Z Progress (3): 7.9/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2215350Z Progress (3): 8.0/12 MB | 653 kB | 18 kB
2026-10-02T13:28:20.2215549Z                                         
2026-10-02T13:28:20.2216199Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-core/10.17.3/flyway-core-10.17.3.jar (653 kB at 3.6 MB/s)
2026-10-02T13:28:20.2216610Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-common/3.15.3/quarkus-datasource-common-3.15.3.jar
2026-10-02T13:28:20.2220785Z Progress (2): 8.1/12 MB | 18 kB
2026-10-02T13:28:20.2221066Z                                
2026-10-02T13:28:20.2221456Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource/3.15.3/quarkus-datasource-3.15.3.jar (18 kB at 100 kB/s)
2026-10-02T13:28:20.2221684Z Progress (1): 8.1/12 MB
2026-10-02T13:28:20.2221832Z                        
2026-10-02T13:28:20.2222144Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-deployment/3.15.3/quarkus-arc-deployment-3.15.3.jar
2026-10-02T13:28:20.2229899Z Progress (1): 8.2/12 MB
2026-10-02T13:28:20.2233321Z Progress (1): 8.3/12 MB
2026-10-02T13:28:20.2233843Z Progress (1): 8.3/12 MB
2026-10-02T13:28:20.2235038Z Progress (2): 8.3/12 MB | 4.1/87 kB
2026-10-02T13:28:20.2236342Z Progress (2): 8.3/12 MB | 7.7/87 kB
2026-10-02T13:28:20.2236848Z Progress (2): 8.3/12 MB | 12/87 kB 
2026-10-02T13:28:20.2237534Z Progress (2): 8.3/12 MB | 16/87 kB
2026-10-02T13:28:20.2237717Z Progress (2): 8.3/12 MB | 20/87 kB
2026-10-02T13:28:20.2237949Z Progress (2): 8.4/12 MB | 20/87 kB
2026-10-02T13:28:20.2238540Z Progress (2): 8.4/12 MB | 24/87 kB
2026-10-02T13:28:20.2239149Z Progress (2): 8.4/12 MB | 28/87 kB
2026-10-02T13:28:20.2240229Z Progress (2): 8.4/12 MB | 32/87 kB
2026-10-02T13:28:20.2240810Z Progress (2): 8.4/12 MB | 36/87 kB
2026-10-02T13:28:20.2241475Z Progress (2): 8.4/12 MB | 41/87 kB
2026-10-02T13:28:20.2242200Z Progress (2): 8.4/12 MB | 45/87 kB
2026-10-02T13:28:20.2242535Z Progress (2): 8.4/12 MB | 49/87 kB
2026-10-02T13:28:20.2242806Z Progress (2): 8.5/12 MB | 49/87 kB
2026-10-02T13:28:20.2243345Z Progress (2): 8.5/12 MB | 53/87 kB
2026-10-02T13:28:20.2243825Z Progress (2): 8.5/12 MB | 57/87 kB
2026-10-02T13:28:20.2244385Z Progress (2): 8.5/12 MB | 61/87 kB
2026-10-02T13:28:20.2245430Z Progress (2): 8.5/12 MB | 65/87 kB
2026-10-02T13:28:20.2245740Z Progress (2): 8.5/12 MB | 69/87 kB
2026-10-02T13:28:20.2246340Z Progress (2): 8.5/12 MB | 73/87 kB
2026-10-02T13:28:20.2246632Z Progress (2): 8.5/12 MB | 77/87 kB
2026-10-02T13:28:20.2247068Z Progress (2): 8.5/12 MB | 81/87 kB
2026-10-02T13:28:20.2247585Z Progress (2): 8.5/12 MB | 86/87 kB
2026-10-02T13:28:20.2250755Z Progress (2): 8.5/12 MB | 87 kB   
2026-10-02T13:28:20.2255125Z Progress (2): 8.5/12 MB | 87 kB
2026-10-02T13:28:20.2259389Z Progress (2): 8.6/12 MB | 87 kB
2026-10-02T13:28:20.2263509Z Progress (2): 8.6/12 MB | 87 kB
2026-10-02T13:28:20.2267899Z Progress (2): 8.7/12 MB | 87 kB
2026-10-02T13:28:20.2271865Z Progress (2): 8.8/12 MB | 87 kB
2026-10-02T13:28:20.2272212Z Progress (3): 8.8/12 MB | 87 kB | 4.1/7.0 kB
2026-10-02T13:28:20.2272550Z Progress (3): 8.8/12 MB | 87 kB | 4.1/7.0 kB
2026-10-02T13:28:20.2277258Z Progress (3): 8.8/12 MB | 87 kB | 7.0 kB    
2026-10-02T13:28:20.2279387Z Progress (3): 8.9/12 MB | 87 kB | 7.0 kB
2026-10-02T13:28:20.2280131Z Progress (4): 8.9/12 MB | 87 kB | 7.0 kB | 4.1/12 kB
2026-10-02T13:28:20.2280709Z Progress (4): 8.9/12 MB | 87 kB | 7.0 kB | 8.2/12 kB
2026-10-02T13:28:20.2281180Z Progress (4): 8.9/12 MB | 87 kB | 7.0 kB | 12 kB    
2026-10-02T13:28:20.2285792Z Progress (4): 9.0/12 MB | 87 kB | 7.0 kB | 12 kB
2026-10-02T13:28:20.2289552Z Progress (4): 9.0/12 MB | 87 kB | 7.0 kB | 12 kB
2026-10-02T13:28:20.2293980Z Progress (4): 9.1/12 MB | 87 kB | 7.0 kB | 12 kB
2026-10-02T13:28:20.2301477Z Progress (4): 9.2/12 MB | 87 kB | 7.0 kB | 12 kB
2026-10-02T13:28:20.2302037Z Progress (5): 9.2/12 MB | 87 kB | 7.0 kB | 12 kB | 4.1/285 kB
2026-10-02T13:28:20.2302224Z Progress (5): 9.2/12 MB | 87 kB | 7.0 kB | 12 kB | 7.7/285 kB
2026-10-02T13:28:20.2302498Z                                                              
2026-10-02T13:28:20.2302962Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta/3.15.3/quarkus-narayana-jta-3.15.3.jar (87 kB at 454 kB/s)
2026-10-02T13:28:20.2303288Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 12/285 kB
2026-10-02T13:28:20.2303438Z                                                     
2026-10-02T13:28:20.2303787Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-spi/3.15.3/quarkus-smallrye-context-propagation-spi-3.15.3.jar
2026-10-02T13:28:20.2304029Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 16/285 kB
2026-10-02T13:28:20.2304195Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 16/285 kB
2026-10-02T13:28:20.2304352Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 20/285 kB
2026-10-02T13:28:20.2304578Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 24/285 kB
2026-10-02T13:28:20.2304721Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 28/285 kB
2026-10-02T13:28:20.2304956Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 32/285 kB
2026-10-02T13:28:20.2305143Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 36/285 kB
2026-10-02T13:28:20.2305303Z Progress (4): 9.2/12 MB | 7.0 kB | 12 kB | 40/285 kB
2026-10-02T13:28:20.2305462Z Progress (4): 9.3/12 MB | 7.0 kB | 12 kB | 40/285 kB
2026-10-02T13:28:20.2305959Z Progress (4): 9.3/12 MB | 7.0 kB | 12 kB | 45/285 kB
2026-10-02T13:28:20.2307413Z Progress (4): 9.3/12 MB | 7.0 kB | 12 kB | 49/285 kB
2026-10-02T13:28:20.2308293Z Progress (4): 9.3/12 MB | 7.0 kB | 12 kB | 53/285 kB
2026-10-02T13:28:20.2319152Z Progress (4): 9.3/12 MB | 7.0 kB | 12 kB | 57/285 kB
2026-10-02T13:28:20.2319334Z Progress (4): 9.3/12 MB | 7.0 kB | 12 kB | 61/285 kB
2026-10-02T13:28:20.2319593Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 61/285 kB
2026-10-02T13:28:20.2319775Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 65/285 kB
2026-10-02T13:28:20.2319950Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 69/285 kB
2026-10-02T13:28:20.2320143Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 73/285 kB
2026-10-02T13:28:20.2320342Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 77/285 kB
2026-10-02T13:28:20.2320493Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 81/285 kB
2026-10-02T13:28:20.2320613Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 86/285 kB
2026-10-02T13:28:20.2320803Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 86/285 kB
2026-10-02T13:28:20.2321060Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 90/285 kB
2026-10-02T13:28:20.2321328Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 94/285 kB
2026-10-02T13:28:20.2321570Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 98/285 kB
2026-10-02T13:28:20.2321904Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 102/285 kB
2026-10-02T13:28:20.2322217Z Progress (4): 9.4/12 MB | 7.0 kB | 12 kB | 106/285 kB
2026-10-02T13:28:20.2322394Z Progress (4): 9.5/12 MB | 7.0 kB | 12 kB | 106/285 kB
2026-10-02T13:28:20.2322561Z Progress (4): 9.5/12 MB | 7.0 kB | 12 kB | 110/285 kB
2026-10-02T13:28:20.2323001Z Progress (4): 9.5/12 MB | 7.0 kB | 12 kB | 114/285 kB
2026-10-02T13:28:20.2323391Z                                                      
2026-10-02T13:28:20.2324054Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-transaction-annotations/3.15.3/quarkus-transaction-annotations-3.15.3.jar (7.0 kB at 36 kB/s)
2026-10-02T13:28:20.2325316Z Progress (3): 9.5/12 MB | 12 kB | 118/285 kB
2026-10-02T13:28:20.2325560Z Progress (3): 9.5/12 MB | 12 kB | 122/285 kB
2026-10-02T13:28:20.2326231Z Progress (3): 9.6/12 MB | 12 kB | 122/285 kB
2026-10-02T13:28:20.2327123Z Progress (3): 9.6/12 MB | 12 kB | 127/285 kB
2026-10-02T13:28:20.2328055Z Progress (3): 9.6/12 MB | 12 kB | 131/285 kB
2026-10-02T13:28:20.2329099Z Progress (3): 9.6/12 MB | 12 kB | 135/285 kB
2026-10-02T13:28:20.2330286Z Progress (3): 9.6/12 MB | 12 kB | 139/285 kB
2026-10-02T13:28:20.2331223Z Progress (3): 9.6/12 MB | 12 kB | 143/285 kB
2026-10-02T13:28:20.2331566Z Progress (3): 9.6/12 MB | 12 kB | 143/285 kB
2026-10-02T13:28:20.2332194Z Progress (3): 9.6/12 MB | 12 kB | 147/285 kB
2026-10-02T13:28:20.2333049Z Progress (3): 9.6/12 MB | 12 kB | 151/285 kB
2026-10-02T13:28:20.2333806Z Progress (3): 9.6/12 MB | 12 kB | 155/285 kB
2026-10-02T13:28:20.2334712Z Progress (3): 9.6/12 MB | 12 kB | 159/285 kB
2026-10-02T13:28:20.2335587Z Progress (3): 9.6/12 MB | 12 kB | 163/285 kB
2026-10-02T13:28:20.2336499Z Progress (3): 9.6/12 MB | 12 kB | 167/285 kB
2026-10-02T13:28:20.2337003Z Progress (3): 9.6/12 MB | 12 kB | 172/285 kB
2026-10-02T13:28:20.2337618Z Progress (3): 9.6/12 MB | 12 kB | 176/285 kB
2026-10-02T13:28:20.2338009Z Progress (3): 9.6/12 MB | 12 kB | 180/285 kB
2026-10-02T13:28:20.2338456Z Progress (3): 9.6/12 MB | 12 kB | 184/285 kB
2026-10-02T13:28:20.2338920Z Progress (3): 9.6/12 MB | 12 kB | 188/285 kB
2026-10-02T13:28:20.2339395Z Progress (3): 9.6/12 MB | 12 kB | 192/285 kB
2026-10-02T13:28:20.2339846Z Progress (3): 9.6/12 MB | 12 kB | 196/285 kB
2026-10-02T13:28:20.2340365Z Progress (3): 9.6/12 MB | 12 kB | 200/285 kB
2026-10-02T13:28:20.2340874Z Progress (3): 9.6/12 MB | 12 kB | 204/285 kB
2026-10-02T13:28:20.2341344Z Progress (3): 9.6/12 MB | 12 kB | 208/285 kB
2026-10-02T13:28:20.2341872Z Progress (3): 9.6/12 MB | 12 kB | 213/285 kB
2026-10-02T13:28:20.2342314Z Progress (3): 9.6/12 MB | 12 kB | 217/285 kB
2026-10-02T13:28:20.2342770Z Progress (3): 9.6/12 MB | 12 kB | 221/285 kB
2026-10-02T13:28:20.2343258Z Progress (3): 9.6/12 MB | 12 kB | 225/285 kB
2026-10-02T13:28:20.2343758Z Progress (3): 9.6/12 MB | 12 kB | 229/285 kB
2026-10-02T13:28:20.2344238Z Progress (3): 9.6/12 MB | 12 kB | 233/285 kB
2026-10-02T13:28:20.2345109Z Progress (3): 9.6/12 MB | 12 kB | 237/285 kB
2026-10-02T13:28:20.2345647Z Progress (3): 9.6/12 MB | 12 kB | 241/285 kB
2026-10-02T13:28:20.2345989Z Progress (3): 9.6/12 MB | 12 kB | 245/285 kB
2026-10-02T13:28:20.2346412Z                                             
2026-10-02T13:28:20.2346833Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-common/3.15.3/quarkus-datasource-common-3.15.3.jar (12 kB at 60 kB/s)
2026-10-02T13:28:20.2347219Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/arc/arc-processor/3.15.3/arc-processor-3.15.3.jar
2026-10-02T13:28:20.2367666Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-spi/3.15.3/quarkus-vertx-http-dev-ui-spi-3.15.3.jar
2026-10-02T13:28:20.2367930Z Progress (2): 9.6/12 MB | 249/285 kB
2026-10-02T13:28:20.2368088Z Progress (2): 9.7/12 MB | 249/285 kB
2026-10-02T13:28:20.2368261Z Progress (2): 9.7/12 MB | 253/285 kB
2026-10-02T13:28:20.2369476Z Progress (2): 9.7/12 MB | 258/285 kB
2026-10-02T13:28:20.2369702Z Progress (2): 9.7/12 MB | 262/285 kB
2026-10-02T13:28:20.2369927Z Progress (2): 9.7/12 MB | 266/285 kB
2026-10-02T13:28:20.2370154Z Progress (2): 9.7/12 MB | 270/285 kB
2026-10-02T13:28:20.2370379Z Progress (2): 9.7/12 MB | 274/285 kB
2026-10-02T13:28:20.2370736Z Progress (2): 9.7/12 MB | 278/285 kB
2026-10-02T13:28:20.2371105Z Progress (2): 9.7/12 MB | 282/285 kB
2026-10-02T13:28:20.2371566Z Progress (2): 9.7/12 MB | 285 kB    
2026-10-02T13:28:20.2378867Z Progress (2): 9.8/12 MB | 285 kB
2026-10-02T13:28:20.2384384Z Progress (2): 9.8/12 MB | 285 kB
2026-10-02T13:28:20.2387580Z Progress (2): 9.9/12 MB | 285 kB
2026-10-02T13:28:20.2391664Z Progress (2): 10.0/12 MB | 285 kB
2026-10-02T13:28:20.2395858Z Progress (2): 10/12 MB | 285 kB  
2026-10-02T13:28:20.2399105Z Progress (2): 10/12 MB | 285 kB
2026-10-02T13:28:20.2399483Z Progress (3): 10/12 MB | 285 kB | 4.1/7.7 kB
2026-10-02T13:28:20.2400096Z Progress (3): 10/12 MB | 285 kB | 7.7 kB    
2026-10-02T13:28:20.2404966Z Progress (3): 10/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2408916Z Progress (3): 10/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2412735Z Progress (3): 10/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2418383Z Progress (3): 10/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2421049Z Progress (3): 10/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2424755Z Progress (3): 10/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2433323Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2437273Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2441244Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2445960Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2449478Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2453935Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2457368Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2461702Z Progress (3): 11/12 MB | 285 kB | 7.7 kB
2026-10-02T13:28:20.2462047Z                                         
2026-10-02T13:28:20.2462633Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-deployment/3.15.3/quarkus-arc-deployment-3.15.3.jar (285 kB at 1.4 MB/s)
2026-10-02T13:28:20.2463045Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-test-supplement/3.15.3/quarkus-arc-test-supplement-3.15.3.jar
2026-10-02T13:28:20.2466058Z Progress (2): 11/12 MB | 7.7 kB
2026-10-02T13:28:20.2471188Z Progress (2): 11/12 MB | 7.7 kB
2026-10-02T13:28:20.2472518Z Progress (2): 11/12 MB | 7.7 kB
2026-10-02T13:28:20.2473206Z Progress (3): 11/12 MB | 7.7 kB | 4.1/723 kB
2026-10-02T13:28:20.2473484Z Progress (3): 11/12 MB | 7.7 kB | 7.7/723 kB
2026-10-02T13:28:20.2473988Z                                             
2026-10-02T13:28:20.2474475Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-spi/3.15.3/quarkus-smallrye-context-propagation-spi-3.15.3.jar (7.7 kB at 37 kB/s)
2026-10-02T13:28:20.2474933Z Progress (2): 11/12 MB | 12/723 kB
2026-10-02T13:28:20.2476100Z Progress (2): 11/12 MB | 16/723 kB
2026-10-02T13:28:20.2476319Z Progress (2): 11/12 MB | 16/723 kB
2026-10-02T13:28:20.2479740Z Progress (2): 11/12 MB | 20/723 kB
2026-10-02T13:28:20.2479944Z Progress (2): 11/12 MB | 24/723 kB
2026-10-02T13:28:20.2480104Z Progress (2): 11/12 MB | 28/723 kB
2026-10-02T13:28:20.2480255Z Progress (2): 11/12 MB | 32/723 kB
2026-10-02T13:28:20.2480422Z Progress (2): 11/12 MB | 36/723 kB
2026-10-02T13:28:20.2480572Z Progress (2): 11/12 MB | 40/723 kB
2026-10-02T13:28:20.2480884Z Progress (2): 11/12 MB | 45/723 kB
2026-10-02T13:28:20.2482693Z Progress (2): 11/12 MB | 49/723 kB
2026-10-02T13:28:20.2482860Z Progress (2): 11/12 MB | 49/723 kB
2026-10-02T13:28:20.2483034Z Progress (2): 11/12 MB | 53/723 kB
2026-10-02T13:28:20.2483184Z Progress (2): 11/12 MB | 57/723 kB
2026-10-02T13:28:20.2483329Z Progress (2): 11/12 MB | 61/723 kB
2026-10-02T13:28:20.2483870Z Progress (2): 11/12 MB | 65/723 kB
2026-10-02T13:28:20.2484360Z Progress (2): 11/12 MB | 69/723 kB
2026-10-02T13:28:20.2484982Z Progress (2): 11/12 MB | 73/723 kB
2026-10-02T13:28:20.2485871Z Progress (2): 11/12 MB | 77/723 kB
2026-10-02T13:28:20.2486093Z Progress (2): 11/12 MB | 81/723 kB
2026-10-02T13:28:20.2493752Z Progress (2): 11/12 MB | 86/723 kB
2026-10-02T13:28:20.2493921Z Progress (2): 11/12 MB | 86/723 kB
2026-10-02T13:28:20.2494073Z Progress (2): 11/12 MB | 90/723 kB
2026-10-02T13:28:20.2494219Z Progress (2): 11/12 MB | 94/723 kB
2026-10-02T13:28:20.2494367Z Progress (2): 11/12 MB | 98/723 kB
2026-10-02T13:28:20.2494587Z Progress (2): 11/12 MB | 102/723 kB
2026-10-02T13:28:20.2494763Z Progress (2): 11/12 MB | 106/723 kB
2026-10-02T13:28:20.2494907Z Progress (2): 11/12 MB | 110/723 kB
2026-10-02T13:28:20.2495050Z Progress (2): 11/12 MB | 114/723 kB
2026-10-02T13:28:20.2495157Z Progress (2): 11/12 MB | 118/723 kB
2026-10-02T13:28:20.2495312Z Progress (2): 11/12 MB | 122/723 kB
2026-10-02T13:28:20.2495461Z Progress (2): 11/12 MB | 127/723 kB
2026-10-02T13:28:20.2495609Z Progress (2): 11/12 MB | 131/723 kB
2026-10-02T13:28:20.2495750Z Progress (2): 11/12 MB | 131/723 kB
2026-10-02T13:28:20.2495901Z Progress (2): 11/12 MB | 135/723 kB
2026-10-02T13:28:20.2496114Z Progress (2): 11/12 MB | 139/723 kB
2026-10-02T13:28:20.2496403Z Progress (2): 11/12 MB | 143/723 kB
2026-10-02T13:28:20.2496514Z Progress (2): 11/12 MB | 147/723 kB
2026-10-02T13:28:20.2496656Z Progress (2): 11/12 MB | 151/723 kB
2026-10-02T13:28:20.2496819Z Progress (2): 11/12 MB | 155/723 kB
2026-10-02T13:28:20.2496960Z Progress (2): 11/12 MB | 159/723 kB
2026-10-02T13:28:20.2497102Z Progress (2): 11/12 MB | 163/723 kB
2026-10-02T13:28:20.2497266Z Progress (2): 11/12 MB | 167/723 kB
2026-10-02T13:28:20.2497408Z Progress (2): 11/12 MB | 172/723 kB
2026-10-02T13:28:20.2497547Z Progress (2): 11/12 MB | 176/723 kB
2026-10-02T13:28:20.2497863Z Progress (3): 11/12 MB | 176/723 kB | 4.1/32 kB
2026-10-02T13:28:20.2497998Z Progress (3): 12/12 MB | 176/723 kB | 4.1/32 kB
2026-10-02T13:28:20.2498154Z Progress (3): 12/12 MB | 176/723 kB | 7.7/32 kB
2026-10-02T13:28:20.2498327Z Progress (3): 12/12 MB | 180/723 kB | 7.7/32 kB
2026-10-02T13:28:20.2498487Z Progress (3): 12/12 MB | 180/723 kB | 12/32 kB 
2026-10-02T13:28:20.2498655Z Progress (3): 12/12 MB | 184/723 kB | 12/32 kB
2026-10-02T13:28:20.2500843Z Progress (3): 12/12 MB | 184/723 kB | 16/32 kB
2026-10-02T13:28:20.2501130Z Progress (3): 12/12 MB | 188/723 kB | 16/32 kB
2026-10-02T13:28:20.2501286Z Progress (3): 12/12 MB | 188/723 kB | 20/32 kB
2026-10-02T13:28:20.2501440Z Progress (3): 12/12 MB | 192/723 kB | 20/32 kB
2026-10-02T13:28:20.2501563Z Progress (3): 12/12 MB | 192/723 kB | 24/32 kB
2026-10-02T13:28:20.2501757Z Progress (3): 12/12 MB | 196/723 kB | 24/32 kB
2026-10-02T13:28:20.2501909Z Progress (3): 12/12 MB | 196/723 kB | 28/32 kB
2026-10-02T13:28:20.2502090Z Progress (3): 12/12 MB | 200/723 kB | 28/32 kB
2026-10-02T13:28:20.2502255Z Progress (3): 12/12 MB | 200/723 kB | 32 kB   
2026-10-02T13:28:20.2502625Z Progress (3): 12/12 MB | 204/723 kB | 32 kB
2026-10-02T13:28:20.2502792Z Progress (3): 12/12 MB | 204/723 kB | 32 kB
2026-10-02T13:28:20.2504971Z Progress (3): 12/12 MB | 208/723 kB | 32 kB
2026-10-02T13:28:20.2505456Z Progress (3): 12/12 MB | 213/723 kB | 32 kB
2026-10-02T13:28:20.2505821Z Progress (3): 12/12 MB | 217/723 kB | 32 kB
2026-10-02T13:28:20.2506003Z Progress (3): 12/12 MB | 221/723 kB | 32 kB
2026-10-02T13:28:20.2506187Z Progress (3): 12/12 MB | 225/723 kB | 32 kB
2026-10-02T13:28:20.2507650Z Progress (3): 12/12 MB | 229/723 kB | 32 kB
2026-10-02T13:28:20.2512566Z Progress (3): 12/12 MB | 229/723 kB | 32 kB
2026-10-02T13:28:20.2516211Z Progress (3): 12/12 MB | 229/723 kB | 32 kB
2026-10-02T13:28:20.2516911Z Progress (4): 12/12 MB | 229/723 kB | 32 kB | 4.1/8.1 kB
2026-10-02T13:28:20.2518912Z Progress (4): 12/12 MB | 229/723 kB | 32 kB | 7.7/8.1 kB
2026-10-02T13:28:20.2519102Z Progress (4): 12/12 MB | 229/723 kB | 32 kB | 7.7/8.1 kB
2026-10-02T13:28:20.2519391Z Progress (4): 12/12 MB | 229/723 kB | 32 kB | 8.1 kB    
2026-10-02T13:28:20.2519578Z Progress (4): 12/12 MB | 233/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2519900Z Progress (4): 12/12 MB | 237/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2520395Z Progress (4): 12/12 MB | 241/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2520923Z Progress (4): 12/12 MB | 245/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2521297Z Progress (4): 12/12 MB | 249/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2521824Z Progress (4): 12/12 MB | 253/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2522377Z Progress (4): 12/12 MB | 258/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2522931Z Progress (4): 12/12 MB | 262/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2523472Z Progress (4): 12/12 MB | 266/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2524479Z Progress (4): 12/12 MB | 270/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2524874Z Progress (4): 12/12 MB | 270/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2525507Z Progress (4): 12/12 MB | 274/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2525795Z Progress (4): 12/12 MB | 278/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2526314Z Progress (4): 12/12 MB | 282/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2526829Z Progress (4): 12/12 MB | 286/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2527286Z Progress (4): 12/12 MB | 290/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2527845Z Progress (4): 12/12 MB | 294/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2528365Z Progress (4): 12/12 MB | 299/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2529060Z Progress (4): 12/12 MB | 303/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2529590Z Progress (4): 12/12 MB | 307/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2530040Z Progress (4): 12/12 MB | 311/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2530443Z Progress (4): 12/12 MB | 315/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2531138Z Progress (4): 12/12 MB | 319/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2531581Z Progress (4): 12/12 MB | 319/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2532005Z Progress (4): 12/12 MB | 323/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2532511Z Progress (4): 12/12 MB | 327/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2533002Z Progress (4): 12/12 MB | 331/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2533456Z Progress (4): 12/12 MB | 335/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2533955Z Progress (4): 12/12 MB | 340/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2534462Z Progress (4): 12/12 MB | 344/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2535142Z Progress (4): 12/12 MB | 348/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2535627Z Progress (4): 12/12 MB | 352/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2536232Z Progress (4): 12/12 MB | 356/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2536621Z Progress (4): 12/12 MB | 360/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2537059Z Progress (4): 12/12 MB | 364/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2537603Z Progress (4): 12/12 MB | 368/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2538072Z Progress (4): 12/12 MB | 368/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2538488Z Progress (4): 12/12 MB | 372/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2538889Z Progress (4): 12/12 MB | 376/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2539356Z Progress (4): 12/12 MB | 380/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2539804Z Progress (4): 12/12 MB | 385/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2540243Z Progress (4): 12/12 MB | 389/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2540668Z Progress (4): 12/12 MB | 393/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2541103Z Progress (4): 12/12 MB | 397/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2541610Z Progress (4): 12/12 MB | 401/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2542132Z Progress (4): 12/12 MB | 405/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2542571Z Progress (4): 12/12 MB | 409/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2587570Z Progress (4): 12/12 MB | 413/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2587967Z Progress (4): 12 MB | 413/723 kB | 32 kB | 8.1 kB   
2026-10-02T13:28:20.2588757Z Progress (4): 12 MB | 417/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2589018Z Progress (4): 12 MB | 421/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2589192Z Progress (4): 12 MB | 426/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2589353Z Progress (4): 12 MB | 430/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2589522Z Progress (4): 12 MB | 434/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2589653Z Progress (4): 12 MB | 438/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2589808Z Progress (4): 12 MB | 442/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2589987Z Progress (4): 12 MB | 446/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2590136Z Progress (4): 12 MB | 450/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2590283Z Progress (4): 12 MB | 454/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2590444Z Progress (4): 12 MB | 458/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2590605Z Progress (4): 12 MB | 462/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2590755Z Progress (4): 12 MB | 466/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2590872Z Progress (4): 12 MB | 471/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2591024Z Progress (4): 12 MB | 475/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2591175Z Progress (4): 12 MB | 479/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2591377Z Progress (4): 12 MB | 483/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2591699Z Progress (4): 12 MB | 487/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2591855Z Progress (4): 12 MB | 491/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2592092Z Progress (4): 12 MB | 495/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2592244Z Progress (4): 12 MB | 499/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2592397Z Progress (4): 12 MB | 503/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2592515Z Progress (4): 12 MB | 507/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2592668Z Progress (4): 12 MB | 512/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2592820Z Progress (4): 12 MB | 516/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2592996Z Progress (4): 12 MB | 520/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2593143Z Progress (4): 12 MB | 524/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2593304Z Progress (4): 12 MB | 528/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2593450Z Progress (4): 12 MB | 532/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2593600Z Progress (4): 12 MB | 536/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2593717Z Progress (4): 12 MB | 540/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2593920Z Progress (4): 12 MB | 544/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2594068Z Progress (4): 12 MB | 548/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2594220Z Progress (4): 12 MB | 552/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2594389Z Progress (4): 12 MB | 557/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2594688Z Progress (4): 12 MB | 561/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2594848Z Progress (4): 12 MB | 565/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2595002Z Progress (4): 12 MB | 569/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2595153Z Progress (4): 12 MB | 573/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2595273Z Progress (4): 12 MB | 577/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2595431Z Progress (4): 12 MB | 581/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2595586Z Progress (4): 12 MB | 585/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2595739Z Progress (4): 12 MB | 589/723 kB | 32 kB | 8.1 kB
2026-10-02T13:28:20.2595907Z                                                  
2026-10-02T13:28:20.2596498Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-arc-test-supplement/3.15.3/quarkus-arc-test-supplement-3.15.3.jar (8.1 kB at 37 kB/s)
2026-10-02T13:28:20.2596742Z Progress (3): 12 MB | 593/723 kB | 32 kB
2026-10-02T13:28:20.2596898Z Progress (3): 12 MB | 598/723 kB | 32 kB
2026-10-02T13:28:20.2597047Z Progress (3): 12 MB | 602/723 kB | 32 kB
2026-10-02T13:28:20.2597165Z Progress (3): 12 MB | 606/723 kB | 32 kB
2026-10-02T13:28:20.2597312Z Progress (3): 12 MB | 610/723 kB | 32 kB
2026-10-02T13:28:20.2597460Z Progress (3): 12 MB | 614/723 kB | 32 kB
2026-10-02T13:28:20.2597610Z Progress (3): 12 MB | 618/723 kB | 32 kB
2026-10-02T13:28:20.2597791Z Progress (3): 12 MB | 622/723 kB | 32 kB
2026-10-02T13:28:20.2597941Z Progress (3): 12 MB | 626/723 kB | 32 kB
2026-10-02T13:28:20.2598151Z Progress (3): 12 MB | 630/723 kB | 32 kB
2026-10-02T13:28:20.2598321Z Progress (3): 12 MB | 634/723 kB | 32 kB
2026-10-02T13:28:20.2598450Z Progress (3): 12 MB | 639/723 kB | 32 kB
2026-10-02T13:28:20.2598600Z Progress (3): 12 MB | 643/723 kB | 32 kB
2026-10-02T13:28:20.2598769Z Progress (3): 12 MB | 647/723 kB | 32 kB
2026-10-02T13:28:20.2598917Z Progress (3): 12 MB | 651/723 kB | 32 kB
2026-10-02T13:28:20.2599064Z Progress (3): 12 MB | 655/723 kB | 32 kB
2026-10-02T13:28:20.2599241Z Progress (3): 12 MB | 659/723 kB | 32 kB
2026-10-02T13:28:20.2599390Z Progress (3): 12 MB | 663/723 kB | 32 kB
2026-10-02T13:28:20.2599557Z Progress (3): 12 MB | 667/723 kB | 32 kB
2026-10-02T13:28:20.2599674Z Progress (3): 12 MB | 671/723 kB | 32 kB
2026-10-02T13:28:20.2599825Z Progress (3): 12 MB | 675/723 kB | 32 kB
2026-10-02T13:28:20.2599975Z Progress (3): 12 MB | 679/723 kB | 32 kB
2026-10-02T13:28:20.2600122Z Progress (3): 12 MB | 684/723 kB | 32 kB
2026-10-02T13:28:20.2600270Z Progress (3): 12 MB | 688/723 kB | 32 kB
2026-10-02T13:28:20.2600429Z Progress (3): 12 MB | 692/723 kB | 32 kB
2026-10-02T13:28:20.2600635Z Progress (3): 12 MB | 696/723 kB | 32 kB
2026-10-02T13:28:20.2600784Z Progress (3): 12 MB | 700/723 kB | 32 kB
2026-10-02T13:28:20.2600896Z Progress (3): 12 MB | 704/723 kB | 32 kB
2026-10-02T13:28:20.2601041Z Progress (3): 12 MB | 708/723 kB | 32 kB
2026-10-02T13:28:20.2601184Z Progress (3): 12 MB | 712/723 kB | 32 kB
2026-10-02T13:28:20.2601329Z Progress (3): 12 MB | 716/723 kB | 32 kB
2026-10-02T13:28:20.2601474Z Progress (3): 12 MB | 720/723 kB | 32 kB
2026-10-02T13:28:20.2601634Z Progress (3): 12 MB | 723 kB | 32 kB    
2026-10-02T13:28:20.2601770Z                                     
2026-10-02T13:28:20.2602135Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-spi/3.15.3/quarkus-vertx-http-dev-ui-spi-3.15.3.jar (32 kB at 146 kB/s)
2026-10-02T13:28:20.2602565Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/hibernate/orm/hibernate-core/6.6.3.Final/hibernate-core-6.6.3.Final.jar (12 MB at 54 MB/s)
2026-10-02T13:28:20.2634455Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/arc/arc-processor/3.15.3/arc-processor-3.15.3.jar (723 kB at 3.2 MB/s)
2026-10-02T13:28:20.4453601Z [INFO] 
2026-10-02T13:28:20.4454120Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ siapo-movimentacao-micro ---
2026-10-02T13:28:20.4762044Z [INFO] 
2026-10-02T13:28:20.4762755Z [INFO] --- jacoco-maven-plugin:0.8.13:prepare-agent (default) @ siapo-movimentacao-micro ---
2026-10-02T13:28:20.5200562Z [INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.13/org.jacoco.agent-0.8.13-runtime.jar=destfile=/opt/ads-agent/_work/35/s/target/jacoco.exec
2026-10-02T13:28:20.5201337Z [INFO] 
2026-10-02T13:28:20.5201697Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ siapo-movimentacao-micro ---
2026-10-02T13:28:20.5635800Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-10-02T13:28:20.5652691Z [INFO] Copying 1 resource
2026-10-02T13:28:20.5676554Z [INFO] 
2026-10-02T13:28:20.5677265Z [INFO] --- quarkus-maven-plugin:3.15.3:generate-code (default) @ siapo-movimentacao-micro ---
2026-10-02T13:28:20.6126158Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siapo/siapo-movimentacao-micro/1.0.0-SNAPSHOT/maven-metadata.xml
2026-10-02T13:28:21.4724428Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-kotlin/3.15.3/quarkus-rest-kotlin-3.15.3.jar
2026-10-02T13:28:21.5484318Z Progress (1): 4.1/36 kB
2026-10-02T13:28:21.5484823Z Progress (1): 7.7/36 kB
2026-10-02T13:28:21.5485191Z Progress (1): 12/36 kB 
2026-10-02T13:28:21.5485356Z Progress (1): 16/36 kB
2026-10-02T13:28:21.5485469Z Progress (1): 20/36 kB
2026-10-02T13:28:21.5486430Z Progress (1): 24/36 kB
2026-10-02T13:28:21.5486870Z Progress (1): 28/36 kB
2026-10-02T13:28:21.5487115Z Progress (1): 32/36 kB
2026-10-02T13:28:21.5952631Z Progress (1): 36 kB   
2026-10-02T13:28:21.5952929Z                    
2026-10-02T13:28:21.5953667Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-kotlin/3.15.3/quarkus-rest-kotlin-3.15.3.jar (36 kB at 293 kB/s)
2026-10-02T13:28:21.7819909Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql/3.15.3/quarkus-flyway-mssql-3.15.3.jar
2026-10-02T13:28:21.8605571Z Progress (1): 4.1/7.0 kB
2026-10-02T13:28:21.9069184Z Progress (1): 7.0 kB    
2026-10-02T13:28:21.9069515Z                     
2026-10-02T13:28:21.9070106Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql/3.15.3/quarkus-flyway-mssql-3.15.3.jar (7.0 kB at 56 kB/s)
2026-10-02T13:28:21.9273378Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql/3.15.3/quarkus-flyway-mssql-3.15.3.pom
2026-10-02T13:28:22.3927015Z Progress (1): 2.9 kB
2026-10-02T13:28:22.3927355Z                     
2026-10-02T13:28:22.3928115Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql/3.15.3/quarkus-flyway-mssql-3.15.3.pom (2.9 kB at 6.2 kB/s)
2026-10-02T13:28:22.4030258Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql-parent/3.15.3/quarkus-flyway-mssql-parent-3.15.3.pom
2026-10-02T13:28:22.8998266Z Progress (1): 752 B
2026-10-02T13:28:22.8998473Z                    
2026-10-02T13:28:22.8999041Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql-parent/3.15.3/quarkus-flyway-mssql-parent-3.15.3.pom (752 B at 1.5 kB/s)
2026-10-02T13:28:22.9106211Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-sqlserver/10.17.3/flyway-sqlserver-10.17.3.pom
2026-10-02T13:28:23.5853121Z Progress (1): 2.4 kB
2026-10-02T13:28:23.5853630Z                     
2026-10-02T13:28:23.5854221Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-sqlserver/10.17.3/flyway-sqlserver-10.17.3.pom (2.4 kB at 3.5 kB/s)
2026-10-02T13:28:23.6100718Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-sqlserver/10.17.3/flyway-sqlserver-10.17.3.jar
2026-10-02T13:28:24.0611973Z Progress (1): 2.3/53 kB
2026-10-02T13:28:24.0612339Z Progress (1): 6.4/53 kB
2026-10-02T13:28:24.0612491Z Progress (1): 10/53 kB 
2026-10-02T13:28:24.0612630Z Progress (1): 15/53 kB
2026-10-02T13:28:24.0613220Z Progress (1): 19/53 kB
2026-10-02T13:28:24.0613483Z Progress (1): 23/53 kB
2026-10-02T13:28:24.0614643Z Progress (1): 27/53 kB
2026-10-02T13:28:24.0615188Z Progress (1): 31/53 kB
2026-10-02T13:28:24.0615476Z Progress (1): 35/53 kB
2026-10-02T13:28:24.0615726Z Progress (1): 39/53 kB
2026-10-02T13:28:24.0616246Z Progress (1): 43/53 kB
2026-10-02T13:28:24.0616519Z Progress (1): 47/53 kB
2026-10-02T13:28:24.0617276Z Progress (1): 51/53 kB
2026-10-02T13:28:24.4102479Z Progress (1): 53 kB   
2026-10-02T13:28:24.4102968Z                    
2026-10-02T13:28:24.4103566Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/flywaydb/flyway-sqlserver/10.17.3/flyway-sqlserver-10.17.3.jar (53 kB at 66 kB/s)
2026-10-02T13:28:24.4361532Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-deployment/3.15.3/quarkus-rest-deployment-3.15.3.pom
2026-10-02T13:28:24.4459948Z Progress (1): 4.1/5.5 kB
2026-10-02T13:28:24.4559195Z Progress (1): 5.5 kB    
2026-10-02T13:28:24.4559489Z                     
2026-10-02T13:28:24.4560541Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-deployment/3.15.3/quarkus-rest-deployment-3.15.3.pom (5.5 kB at 276 kB/s)
2026-10-02T13:28:25.0355229Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-processor/3.15.3/resteasy-reactive-processor-3.15.3.pom
2026-10-02T13:28:25.0599463Z Progress (1): 2.8 kB
2026-10-02T13:28:25.0599780Z                     
2026-10-02T13:28:25.0600650Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-processor/3.15.3/resteasy-reactive-processor-3.15.3.pom (2.8 kB at 110 kB/s)
2026-10-02T13:28:25.1395101Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-common-processor/3.15.3/resteasy-reactive-common-processor-3.15.3.pom
2026-10-02T13:28:25.1627709Z Progress (1): 2.1 kB
2026-10-02T13:28:25.1628799Z                     
2026-10-02T13:28:25.1629761Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-common-processor/3.15.3/resteasy-reactive-common-processor-3.15.3.pom (2.1 kB at 89 kB/s)
2026-10-02T13:28:25.1750426Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment/3.15.3/quarkus-vertx-http-deployment-3.15.3.pom
2026-10-02T13:28:25.2386334Z Progress (1): 4.1/6.3 kB
2026-10-02T13:28:25.2840780Z Progress (1): 6.3 kB    
2026-10-02T13:28:25.2841133Z                     
2026-10-02T13:28:25.2841741Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment/3.15.3/quarkus-vertx-http-deployment-3.15.3.pom (6.3 kB at 58 kB/s)
2026-10-02T13:28:25.3059122Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment/3.15.3/quarkus-vertx-deployment-3.15.3.pom
2026-10-02T13:28:25.3270514Z Progress (1): 3.5 kB
2026-10-02T13:28:25.3270966Z                     
2026-10-02T13:28:25.3271537Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment/3.15.3/quarkus-vertx-deployment-3.15.3.pom (3.5 kB at 166 kB/s)
2026-10-02T13:28:25.3500906Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-netty-deployment/3.15.3/quarkus-netty-deployment-3.15.3.pom
2026-10-02T13:28:25.3768555Z Progress (1): 2.0 kB
2026-10-02T13:28:25.3769135Z                     
2026-10-02T13:28:25.3770271Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-netty-deployment/3.15.3/quarkus-netty-deployment-3.15.3.pom (2.0 kB at 75 kB/s)
2026-10-02T13:28:25.3866524Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-virtual-threads-deployment/3.15.3/quarkus-virtual-threads-deployment-3.15.3.pom
2026-10-02T13:28:25.4033765Z Progress (1): 2.1 kB
2026-10-02T13:28:25.4033974Z                     
2026-10-02T13:28:25.4034708Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-virtual-threads-deployment/3.15.3/quarkus-virtual-threads-deployment-3.15.3.pom (2.1 kB at 125 kB/s)
2026-10-02T13:28:25.4122154Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-mutiny-deployment/3.15.3/quarkus-mutiny-deployment-3.15.3.pom
2026-10-02T13:28:25.4247125Z Progress (1): 2.2 kB
2026-10-02T13:28:25.4247422Z                     
2026-10-02T13:28:25.4249167Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-mutiny-deployment/3.15.3/quarkus-mutiny-deployment-3.15.3.pom (2.2 kB at 171 kB/s)
2026-10-02T13:28:25.4362902Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-deployment/3.15.3/quarkus-smallrye-context-propagation-deployment-3.15.3.pom
2026-10-02T13:28:25.4542925Z Progress (1): 2.3 kB
2026-10-02T13:28:25.4543199Z                     
2026-10-02T13:28:25.4543819Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-deployment/3.15.3/quarkus-smallrye-context-propagation-deployment-3.15.3.pom (2.3 kB at 121 kB/s)
2026-10-02T13:28:25.4674011Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-spi/3.15.3/quarkus-jackson-spi-3.15.3.pom
2026-10-02T13:28:25.4824477Z Progress (1): 830 B
2026-10-02T13:28:25.4824771Z                    
2026-10-02T13:28:25.4825459Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-spi/3.15.3/quarkus-jackson-spi-3.15.3.pom (830 B at 55 kB/s)
2026-10-02T13:28:25.4927995Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment-spi/3.15.3/quarkus-vertx-deployment-spi-3.15.3.pom
2026-10-02T13:28:25.5228044Z Progress (1): 904 B
2026-10-02T13:28:25.5228397Z                    
2026-10-02T13:28:25.5229011Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment-spi/3.15.3/quarkus-vertx-deployment-spi-3.15.3.pom (904 B at 30 kB/s)
2026-10-02T13:28:25.5337962Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment-spi/3.15.3/quarkus-vertx-http-deployment-spi-3.15.3.pom
2026-10-02T13:28:25.5575103Z Progress (1): 957 B
2026-10-02T13:28:25.5575398Z                    
2026-10-02T13:28:25.5576176Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment-spi/3.15.3/quarkus-vertx-http-deployment-spi-3.15.3.pom (957 B at 40 kB/s)
2026-10-02T13:28:25.5706968Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-tls-registry-deployment/3.15.3/quarkus-tls-registry-deployment-3.15.3.pom
2026-10-02T13:28:25.5876980Z Progress (1): 3.5 kB
2026-10-02T13:28:25.5877193Z                     
2026-10-02T13:28:25.5878006Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-tls-registry-deployment/3.15.3/quarkus-tls-registry-deployment-3.15.3.pom (3.5 kB at 207 kB/s)
2026-10-02T13:28:25.5968297Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-credentials-deployment/3.15.3/quarkus-credentials-deployment-3.15.3.pom
2026-10-02T13:28:25.6163733Z Progress (1): 1.9 kB
2026-10-02T13:28:25.6163948Z                     
2026-10-02T13:28:25.6164802Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-credentials-deployment/3.15.3/quarkus-credentials-deployment-3.15.3.pom (1.9 kB at 95 kB/s)
2026-10-02T13:28:25.6241306Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-spi/3.15.3/quarkus-kubernetes-spi-3.15.3.pom
2026-10-02T13:28:25.6460167Z Progress (1): 1.2 kB
2026-10-02T13:28:25.6460383Z                     
2026-10-02T13:28:25.6461150Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-spi/3.15.3/quarkus-kubernetes-spi-3.15.3.pom (1.2 kB at 55 kB/s)
2026-10-02T13:28:25.6532455Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-parent/3.15.3/quarkus-kubernetes-parent-3.15.3.pom
2026-10-02T13:28:25.6674267Z Progress (1): 834 B
2026-10-02T13:28:25.6675282Z                    
2026-10-02T13:28:25.6676177Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-parent/3.15.3/quarkus-kubernetes-parent-3.15.3.pom (834 B at 56 kB/s)
2026-10-02T13:28:25.6778670Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-security-spi/3.15.3/quarkus-security-spi-3.15.3.pom
2026-10-02T13:28:25.6986079Z Progress (1): 1.7 kB
2026-10-02T13:28:25.6986407Z                     
2026-10-02T13:28:25.6987026Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-security-spi/3.15.3/quarkus-security-spi-3.15.3.pom (1.7 kB at 83 kB/s)
2026-10-02T13:28:25.7139661Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-resources/3.15.3/quarkus-vertx-http-dev-ui-resources-3.15.3.pom
2026-10-02T13:28:25.7229915Z Progress (1): 4.1/5.4 kB
2026-10-02T13:28:25.7312811Z Progress (1): 5.4 kB    
2026-10-02T13:28:25.7313156Z                     
2026-10-02T13:28:25.7313786Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-resources/3.15.3/quarkus-vertx-http-dev-ui-resources-3.15.3.pom (5.4 kB at 301 kB/s)
2026-10-02T13:28:25.7567220Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-server-spi-deployment/3.15.3/quarkus-rest-server-spi-deployment-3.15.3.pom
2026-10-02T13:28:25.7749049Z Progress (1): 954 B
2026-10-02T13:28:25.7749243Z                    
2026-10-02T13:28:25.7750081Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-server-spi-deployment/3.15.3/quarkus-rest-server-spi-deployment-3.15.3.pom (954 B at 53 kB/s)
2026-10-02T13:28:25.7940537Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-spi-deployment/3.15.3/quarkus-rest-spi-deployment-3.15.3.pom
2026-10-02T13:28:25.8164999Z Progress (1): 896 B
2026-10-02T13:28:25.8165314Z                    
2026-10-02T13:28:25.8166074Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-spi-deployment/3.15.3/quarkus-rest-spi-deployment-3.15.3.pom (896 B at 39 kB/s)
2026-10-02T13:28:25.8279148Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jaxrs-spi-deployment/3.15.3/quarkus-jaxrs-spi-deployment-3.15.3.pom
2026-10-02T13:28:25.8512124Z Progress (1): 774 B
2026-10-02T13:28:25.8512440Z                    
2026-10-02T13:28:25.8513122Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jaxrs-spi-deployment/3.15.3/quarkus-jaxrs-spi-deployment-3.15.3.pom (774 B at 34 kB/s)
2026-10-02T13:28:25.8569998Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jaxrs-spi-parent/3.15.3/quarkus-jaxrs-spi-parent-3.15.3.pom
2026-10-02T13:28:25.8730386Z Progress (1): 718 B
2026-10-02T13:28:25.8730760Z                    
2026-10-02T13:28:25.8731310Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jaxrs-spi-parent/3.15.3/quarkus-jaxrs-spi-parent-3.15.3.pom (718 B at 45 kB/s)
2026-10-02T13:28:25.8821107Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jsonp-deployment/3.15.3/quarkus-jsonp-deployment-3.15.3.pom
2026-10-02T13:28:25.8965781Z Progress (1): 1.7 kB
2026-10-02T13:28:25.8966013Z                     
2026-10-02T13:28:25.8966571Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jsonp-deployment/3.15.3/quarkus-jsonp-deployment-3.15.3.pom (1.7 kB at 116 kB/s)
2026-10-02T13:28:25.9047328Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-common-deployment/3.15.3/quarkus-rest-common-deployment-3.15.3.pom
2026-10-02T13:28:25.9181977Z Progress (1): 3.9 kB
2026-10-02T13:28:25.9182156Z                     
2026-10-02T13:28:25.9183106Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-common-deployment/3.15.3/quarkus-rest-common-deployment-3.15.3.pom (3.9 kB at 304 kB/s)
2026-10-02T13:28:25.9333936Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-deployment/3.15.3/quarkus-rest-jackson-deployment-3.15.3.pom
2026-10-02T13:28:25.9502228Z Progress (1): 3.0 kB
2026-10-02T13:28:25.9502621Z                     
2026-10-02T13:28:25.9503437Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-deployment/3.15.3/quarkus-rest-jackson-deployment-3.15.3.pom (3.0 kB at 177 kB/s)
2026-10-02T13:28:25.9675783Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-common-deployment/3.15.3/quarkus-rest-jackson-common-deployment-3.15.3.pom
2026-10-02T13:28:25.9895510Z Progress (1): 1.9 kB
2026-10-02T13:28:25.9895838Z                     
2026-10-02T13:28:25.9896491Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-common-deployment/3.15.3/quarkus-rest-jackson-common-deployment-3.15.3.pom (1.9 kB at 89 kB/s)
2026-10-02T13:28:26.0032499Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-deployment/3.15.3/quarkus-jackson-deployment-3.15.3.pom
2026-10-02T13:28:26.0175304Z Progress (1): 2.5 kB
2026-10-02T13:28:26.0175813Z                     
2026-10-02T13:28:26.0176667Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-deployment/3.15.3/quarkus-jackson-deployment-3.15.3.pom (2.5 kB at 168 kB/s)
2026-10-02T13:28:26.0307592Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-deployment/3.15.3/quarkus-smallrye-health-deployment-3.15.3.pom
2026-10-02T13:28:26.0505881Z Progress (1): 3.6 kB
2026-10-02T13:28:26.0506218Z                     
2026-10-02T13:28:26.0506837Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-deployment/3.15.3/quarkus-smallrye-health-deployment-3.15.3.pom (3.6 kB at 179 kB/s)
2026-10-02T13:28:26.0719891Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-spi/3.15.3/quarkus-smallrye-health-spi-3.15.3.pom
2026-10-02T13:28:26.0929015Z Progress (1): 770 B
2026-10-02T13:28:26.0929475Z                    
2026-10-02T13:28:26.0930560Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-spi/3.15.3/quarkus-smallrye-health-spi-3.15.3.pom (770 B at 37 kB/s)
2026-10-02T13:28:26.1011868Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-openapi-spi/3.15.3/quarkus-smallrye-openapi-spi-3.15.3.pom
2026-10-02T13:28:26.1202790Z Progress (1): 928 B
2026-10-02T13:28:26.1203086Z                    
2026-10-02T13:28:26.1203831Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-openapi-spi/3.15.3/quarkus-smallrye-openapi-spi-3.15.3.pom (928 B at 46 kB/s)
2026-10-02T13:28:26.1401336Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer-deployment/3.15.3/quarkus-micrometer-deployment-3.15.3.pom
2026-10-02T13:28:26.1967603Z Progress (1): 4.1/7.0 kB
2026-10-02T13:28:26.2601651Z Progress (1): 7.0 kB    
2026-10-02T13:28:26.2601858Z                     
2026-10-02T13:28:26.2602487Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer-deployment/3.15.3/quarkus-micrometer-deployment-3.15.3.pom (7.0 kB at 58 kB/s)
2026-10-02T13:28:26.2736204Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-resteasy-common-spi/3.15.3/quarkus-resteasy-common-spi-3.15.3.pom
2026-10-02T13:28:26.2857400Z Progress (1): 779 B
2026-10-02T13:28:26.2857714Z                    
2026-10-02T13:28:26.2858289Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-resteasy-common-spi/3.15.3/quarkus-resteasy-common-spi-3.15.3.pom (779 B at 65 kB/s)
2026-10-02T13:28:26.2976428Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-resteasy-common-parent/3.15.3/quarkus-resteasy-common-parent-3.15.3.pom
2026-10-02T13:28:26.3150095Z Progress (1): 801 B
2026-10-02T13:28:26.3150314Z                    
2026-10-02T13:28:26.3150900Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-resteasy-common-parent/3.15.3/quarkus-resteasy-common-parent-3.15.3.pom (801 B at 47 kB/s)
2026-10-02T13:28:26.3280169Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-undertow-spi/3.15.3/quarkus-undertow-spi-3.15.3.pom
2026-10-02T13:28:26.4415983Z Progress (1): 2.3 kB
2026-10-02T13:28:26.4416287Z                     
2026-10-02T13:28:26.4416992Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-undertow-spi/3.15.3/quarkus-undertow-spi-3.15.3.pom (2.3 kB at 20 kB/s)
2026-10-02T13:28:26.4498078Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-http-parent/3.15.3/quarkus-http-parent-3.15.3.pom
2026-10-02T13:28:26.5689515Z Progress (1): 764 B
2026-10-02T13:28:26.5690057Z                    
2026-10-02T13:28:26.5690666Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-http-parent/3.15.3/quarkus-http-parent-3.15.3.pom (764 B at 6.4 kB/s)
2026-10-02T13:28:26.6023639Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-deployment/3.15.3/quarkus-hibernate-orm-panache-deployment-3.15.3.pom
2026-10-02T13:28:26.7098662Z Progress (1): 3.7 kB
2026-10-02T13:28:26.7099151Z                     
2026-10-02T13:28:26.7100021Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-deployment/3.15.3/quarkus-hibernate-orm-panache-deployment-3.15.3.pom (3.7 kB at 34 kB/s)
2026-10-02T13:28:26.7231506Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common-deployment/3.15.3/quarkus-hibernate-orm-panache-common-deployment-3.15.3.pom
2026-10-02T13:28:26.8308874Z Progress (1): 2.4 kB
2026-10-02T13:28:26.8309316Z                     
2026-10-02T13:28:26.8309961Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common-deployment/3.15.3/quarkus-hibernate-orm-panache-common-deployment-3.15.3.pom (2.4 kB at 22 kB/s)
2026-10-02T13:28:26.8421833Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common-deployment/3.15.3/quarkus-panache-common-deployment-3.15.3.pom
2026-10-02T13:28:26.9468730Z Progress (1): 1.5 kB
2026-10-02T13:28:26.9468933Z                     
2026-10-02T13:28:26.9469554Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common-deployment/3.15.3/quarkus-panache-common-deployment-3.15.3.pom (1.5 kB at 14 kB/s)
2026-10-02T13:28:26.9614328Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment/3.15.3/quarkus-hibernate-orm-deployment-3.15.3.pom
2026-10-02T13:28:27.0219947Z Progress (1): 4.1/6.7 kB
2026-10-02T13:28:27.0736459Z Progress (1): 6.7 kB    
2026-10-02T13:28:27.0736795Z                     
2026-10-02T13:28:27.0737800Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment/3.15.3/quarkus-hibernate-orm-deployment-3.15.3.pom (6.7 kB at 59 kB/s)
2026-10-02T13:28:27.0991134Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment-spi/3.15.3/quarkus-hibernate-orm-deployment-spi-3.15.3.pom
2026-10-02T13:28:27.2033443Z Progress (1): 788 B
2026-10-02T13:28:27.2033636Z                    
2026-10-02T13:28:27.2034262Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment-spi/3.15.3/quarkus-hibernate-orm-deployment-spi-3.15.3.pom (788 B at 7.5 kB/s)
2026-10-02T13:28:27.2123785Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta-deployment/3.15.3/quarkus-narayana-jta-deployment-3.15.3.pom
2026-10-02T13:28:27.3121145Z Progress (1): 2.5 kB
2026-10-02T13:28:27.3121806Z                     
2026-10-02T13:28:27.3123070Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta-deployment/3.15.3/quarkus-narayana-jta-deployment-3.15.3.pom (2.5 kB at 25 kB/s)
2026-10-02T13:28:27.3199735Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-spi/3.15.3/quarkus-agroal-spi-3.15.3.pom
2026-10-02T13:28:27.4238750Z Progress (1): 1.1 kB
2026-10-02T13:28:27.4238957Z                     
2026-10-02T13:28:27.4239699Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-spi/3.15.3/quarkus-agroal-spi-3.15.3.pom (1.1 kB at 11 kB/s)
2026-10-02T13:28:27.4327373Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-deployment/3.15.3/quarkus-agroal-deployment-3.15.3.pom
2026-10-02T13:28:27.4921352Z Progress (1): 4.1/4.3 kB
2026-10-02T13:28:27.5432105Z Progress (1): 4.3 kB    
2026-10-02T13:28:27.5432317Z                     
2026-10-02T13:28:27.5432936Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-deployment/3.15.3/quarkus-agroal-deployment-3.15.3.pom (4.3 kB at 39 kB/s)
2026-10-02T13:28:27.5549857Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment/3.15.3/quarkus-datasource-deployment-3.15.3.pom
2026-10-02T13:28:27.6635255Z Progress (1): 2.7 kB
2026-10-02T13:28:27.6635933Z                     
2026-10-02T13:28:27.6636784Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment/3.15.3/quarkus-datasource-deployment-3.15.3.pom (2.7 kB at 25 kB/s)
2026-10-02T13:28:27.6770087Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment-spi/3.15.3/quarkus-datasource-deployment-spi-3.15.3.pom
2026-10-02T13:28:27.8057011Z Progress (1): 1.1 kB
2026-10-02T13:28:27.8057266Z                     
2026-10-02T13:28:27.8057900Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment-spi/3.15.3/quarkus-datasource-deployment-spi-3.15.3.pom (1.1 kB at 8.3 kB/s)
2026-10-02T13:28:27.8190779Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-service-binding-spi/3.15.3/quarkus-kubernetes-service-binding-spi-3.15.3.pom
2026-10-02T13:28:27.9229167Z Progress (1): 914 B
2026-10-02T13:28:27.9229344Z                    
2026-10-02T13:28:27.9230150Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-service-binding-spi/3.15.3/quarkus-kubernetes-service-binding-spi-3.15.3.pom (914 B at 8.8 kB/s)
2026-10-02T13:28:27.9308927Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-service-binding-parent/3.15.3/quarkus-kubernetes-service-binding-parent-3.15.3.pom
2026-10-02T13:28:28.0436984Z Progress (1): 805 B
2026-10-02T13:28:28.0437198Z                    
2026-10-02T13:28:28.0437827Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-service-binding-parent/3.15.3/quarkus-kubernetes-service-binding-parent-3.15.3.pom (805 B at 7.1 kB/s)
2026-10-02T13:28:28.0551112Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-deployment/3.15.3/quarkus-devservices-deployment-3.15.3.pom
2026-10-02T13:28:28.1608222Z Progress (1): 1.9 kB
2026-10-02T13:28:28.1608538Z                     
2026-10-02T13:28:28.1609259Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-deployment/3.15.3/quarkus-devservices-deployment-3.15.3.pom (1.9 kB at 18 kB/s)
2026-10-02T13:28:28.1690682Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-parent/3.15.3/quarkus-devservices-parent-3.15.3.pom
2026-10-02T13:28:28.2710295Z Progress (1): 1.2 kB
2026-10-02T13:28:28.2710502Z                     
2026-10-02T13:28:28.2711063Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-parent/3.15.3/quarkus-devservices-parent-3.15.3.pom (1.2 kB at 11 kB/s)
2026-10-02T13:28:28.2806904Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-common/3.15.3/quarkus-devservices-common-3.15.3.pom
2026-10-02T13:28:28.3893874Z Progress (1): 2.0 kB
2026-10-02T13:28:28.3894058Z                     
2026-10-02T13:28:28.3894796Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-common/3.15.3/quarkus-devservices-common-3.15.3.pom (2.0 kB at 18 kB/s)
2026-10-02T13:28:28.4040761Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine-deployment/3.15.3/quarkus-caffeine-deployment-3.15.3.pom
2026-10-02T13:28:28.5113899Z Progress (1): 1.9 kB
2026-10-02T13:28:28.5114259Z                     
2026-10-02T13:28:28.5114957Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine-deployment/3.15.3/quarkus-caffeine-deployment-3.15.3.pom (1.9 kB at 18 kB/s)
2026-10-02T13:28:28.5220861Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common-deployment/3.15.3/quarkus-panache-hibernate-common-deployment-3.15.3.pom
2026-10-02T13:28:28.6394607Z Progress (1): 2.4 kB
2026-10-02T13:28:28.6394885Z                     
2026-10-02T13:28:28.6395671Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common-deployment/3.15.3/quarkus-panache-hibernate-common-deployment-3.15.3.pom (2.4 kB at 20 kB/s)
2026-10-02T13:28:28.6533169Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql-deployment/3.15.3/quarkus-jdbc-mssql-deployment-3.15.3.pom
2026-10-02T13:28:28.7347635Z Progress (1): 3.7/4.4 kB
2026-10-02T13:28:28.7936447Z Progress (1): 4.4 kB    
2026-10-02T13:28:28.7936636Z                     
2026-10-02T13:28:28.7937607Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql-deployment/3.15.3/quarkus-jdbc-mssql-deployment-3.15.3.pom (4.4 kB at 31 kB/s)
2026-10-02T13:28:28.8081237Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-mssql/3.15.3/quarkus-devservices-mssql-3.15.3.pom
2026-10-02T13:28:28.9526873Z Progress (1): 2.8 kB
2026-10-02T13:28:28.9527474Z                     
2026-10-02T13:28:28.9528117Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-mssql/3.15.3/quarkus-devservices-mssql-3.15.3.pom (2.8 kB at 19 kB/s)
2026-10-02T13:28:28.9617269Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/testcontainers/mssqlserver/1.20.1/mssqlserver-1.20.1.pom
2026-10-02T13:28:28.9944183Z Progress (1): 1.5 kB
2026-10-02T13:28:28.9944962Z                     
2026-10-02T13:28:28.9945579Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/testcontainers/mssqlserver/1.20.1/mssqlserver-1.20.1.pom (1.5 kB at 46 kB/s)
2026-10-02T13:28:29.0075588Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-deployment/3.15.3/quarkus-flyway-deployment-3.15.3.pom
2026-10-02T13:28:29.1242943Z Progress (1): 3.6 kB
2026-10-02T13:28:29.1243163Z                     
2026-10-02T13:28:29.1244407Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-deployment/3.15.3/quarkus-flyway-deployment-3.15.3.pom (3.6 kB at 31 kB/s)
2026-10-02T13:28:29.1400651Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql-deployment/3.15.3/quarkus-flyway-mssql-deployment-3.15.3.pom
2026-10-02T13:28:29.7729423Z Progress (1): 1.9 kB
2026-10-02T13:28:29.7729627Z                     
2026-10-02T13:28:29.7730246Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql-deployment/3.15.3/quarkus-flyway-mssql-deployment-3.15.3.pom (1.9 kB at 3.0 kB/s)
2026-10-02T13:28:29.8166072Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-common-processor/3.15.3/resteasy-reactive-common-processor-3.15.3.jar
2026-10-02T13:28:29.8285320Z Progress (1): 4.1/127 kB
2026-10-02T13:28:29.8285774Z Progress (1): 7.7/127 kB
2026-10-02T13:28:29.8286456Z Progress (1): 12/127 kB 
2026-10-02T13:28:29.8286576Z Progress (1): 16/127 kB
2026-10-02T13:28:29.8286722Z Progress (1): 20/127 kB
2026-10-02T13:28:29.8286862Z Progress (1): 24/127 kB
2026-10-02T13:28:29.8287001Z Progress (1): 28/127 kB
2026-10-02T13:28:29.8287156Z Progress (1): 32/127 kB
2026-10-02T13:28:29.8287306Z Progress (1): 36/127 kB
2026-10-02T13:28:29.8287439Z Progress (1): 40/127 kB
2026-10-02T13:28:29.8287539Z Progress (1): 43/127 kB
2026-10-02T13:28:29.8287673Z Progress (1): 46/127 kB
2026-10-02T13:28:29.8287835Z Progress (1): 50/127 kB
2026-10-02T13:28:29.8288891Z Progress (1): 54/127 kB
2026-10-02T13:28:29.8289042Z Progress (1): 58/127 kB
2026-10-02T13:28:29.8289443Z Progress (1): 61/127 kB
2026-10-02T13:28:29.8289802Z Progress (1): 65/127 kB
2026-10-02T13:28:29.8290285Z Progress (1): 69/127 kB
2026-10-02T13:28:29.8290673Z Progress (1): 73/127 kB
2026-10-02T13:28:29.8291193Z Progress (1): 77/127 kB
2026-10-02T13:28:29.8291490Z Progress (1): 82/127 kB
2026-10-02T13:28:29.8291859Z Progress (1): 86/127 kB
2026-10-02T13:28:29.8292194Z Progress (1): 90/127 kB
2026-10-02T13:28:29.8292550Z Progress (1): 94/127 kB
2026-10-02T13:28:29.8298901Z Progress (1): 98/127 kB
2026-10-02T13:28:29.8299168Z Progress (1): 101/127 kB
2026-10-02T13:28:29.8299592Z Progress (1): 105/127 kB
2026-10-02T13:28:29.8300010Z Progress (1): 109/127 kB
2026-10-02T13:28:29.8300432Z Progress (1): 113/127 kB
2026-10-02T13:28:29.8301051Z Progress (1): 117/127 kB
2026-10-02T13:28:29.8301194Z Progress (1): 122/127 kB
2026-10-02T13:28:29.8301723Z Progress (1): 126/127 kB
2026-10-02T13:28:29.8368878Z Progress (1): 127 kB    
2026-10-02T13:28:29.8369151Z                     
2026-10-02T13:28:29.8369784Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-common-processor/3.15.3/resteasy-reactive-common-processor-3.15.3.jar (127 kB at 6.4 MB/s)
2026-10-02T13:28:29.8460080Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-processor/3.15.3/resteasy-reactive-processor-3.15.3.jar
2026-10-02T13:28:29.8541495Z Progress (1): 4.1/152 kB
2026-10-02T13:28:29.8542138Z Progress (1): 7.7/152 kB
2026-10-02T13:28:29.8542436Z Progress (1): 12/152 kB 
2026-10-02T13:28:29.8542583Z Progress (1): 16/152 kB
2026-10-02T13:28:29.8542730Z Progress (1): 20/152 kB
2026-10-02T13:28:29.8542868Z Progress (1): 24/152 kB
2026-10-02T13:28:29.8543005Z Progress (1): 28/152 kB
2026-10-02T13:28:29.8576637Z Progress (1): 32/152 kB
2026-10-02T13:28:29.8576948Z Progress (1): 36/152 kB
2026-10-02T13:28:29.8577640Z Progress (1): 40/152 kB
2026-10-02T13:28:29.8578122Z Progress (1): 45/152 kB
2026-10-02T13:28:29.8578271Z Progress (1): 49/152 kB
2026-10-02T13:28:29.8578409Z Progress (1): 53/152 kB
2026-10-02T13:28:29.8578649Z Progress (1): 57/152 kB
2026-10-02T13:28:29.8579025Z Progress (1): 61/152 kB
2026-10-02T13:28:29.8579713Z Progress (1): 65/152 kB
2026-10-02T13:28:29.8580520Z Progress (1): 69/152 kB
2026-10-02T13:28:29.8580666Z Progress (1): 73/152 kB
2026-10-02T13:28:29.8580781Z Progress (1): 77/152 kB
2026-10-02T13:28:29.8581299Z Progress (1): 81/152 kB
2026-10-02T13:28:29.8581444Z Progress (1): 86/152 kB
2026-10-02T13:28:29.8581798Z Progress (1): 90/152 kB
2026-10-02T13:28:29.8582007Z Progress (1): 94/152 kB
2026-10-02T13:28:29.8582210Z Progress (1): 98/152 kB
2026-10-02T13:28:29.8582390Z Progress (1): 102/152 kB
2026-10-02T13:28:29.8582603Z Progress (1): 106/152 kB
2026-10-02T13:28:29.8582829Z Progress (1): 110/152 kB
2026-10-02T13:28:29.8583145Z Progress (1): 114/152 kB
2026-10-02T13:28:29.8583481Z Progress (1): 118/152 kB
2026-10-02T13:28:29.8583772Z Progress (1): 122/152 kB
2026-10-02T13:28:29.8584141Z Progress (1): 127/152 kB
2026-10-02T13:28:29.8584389Z Progress (1): 131/152 kB
2026-10-02T13:28:29.8584756Z Progress (1): 135/152 kB
2026-10-02T13:28:29.8585302Z Progress (1): 139/152 kB
2026-10-02T13:28:29.8585693Z Progress (1): 143/152 kB
2026-10-02T13:28:29.8586181Z Progress (1): 147/152 kB
2026-10-02T13:28:29.8586510Z Progress (1): 151/152 kB
2026-10-02T13:28:29.8632935Z Progress (1): 152 kB    
2026-10-02T13:28:29.8633248Z                     
2026-10-02T13:28:29.8634089Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/resteasy/reactive/resteasy-reactive-processor/3.15.3/resteasy-reactive-processor-3.15.3.jar (152 kB at 8.5 MB/s)
2026-10-02T13:28:29.8706771Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-netty-deployment/3.15.3/quarkus-netty-deployment-3.15.3.jar
2026-10-02T13:28:29.9007029Z Progress (1): 4.1/20 kB
2026-10-02T13:28:29.9007411Z Progress (1): 7.7/20 kB
2026-10-02T13:28:29.9007778Z Progress (1): 12/20 kB 
2026-10-02T13:28:29.9007939Z Progress (1): 16/20 kB
2026-10-02T13:28:29.9008078Z Progress (1): 20/20 kB
2026-10-02T13:28:29.9086247Z Progress (1): 20 kB   
2026-10-02T13:28:29.9086486Z                    
2026-10-02T13:28:29.9087288Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-netty-deployment/3.15.3/quarkus-netty-deployment-3.15.3.jar (20 kB at 536 kB/s)
2026-10-02T13:28:29.9142813Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-spi/3.15.3/quarkus-jackson-spi-3.15.3.jar
2026-10-02T13:28:29.9310954Z Progress (1): 4.1/10.0 kB
2026-10-02T13:28:29.9311303Z Progress (1): 7.7/10.0 kB
2026-10-02T13:28:29.9376248Z Progress (1): 10.0 kB    
2026-10-02T13:28:29.9376521Z                      
2026-10-02T13:28:29.9377079Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-spi/3.15.3/quarkus-jackson-spi-3.15.3.jar (10.0 kB at 433 kB/s)
2026-10-02T13:28:29.9471622Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment-spi/3.15.3/quarkus-vertx-deployment-spi-3.15.3.jar
2026-10-02T13:28:29.9550862Z Progress (1): 4.1/7.4 kB
2026-10-02T13:28:29.9551088Z Progress (1): 6.4/7.4 kB
2026-10-02T13:28:29.9643878Z Progress (1): 7.4 kB    
2026-10-02T13:28:29.9644205Z                     
2026-10-02T13:28:29.9645209Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment-spi/3.15.3/quarkus-vertx-deployment-spi-3.15.3.jar (7.4 kB at 409 kB/s)
2026-10-02T13:28:29.9705988Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment/3.15.3/quarkus-vertx-deployment-3.15.3.jar
2026-10-02T13:28:29.9831507Z Progress (1): 4.1/47 kB
2026-10-02T13:28:29.9831678Z Progress (1): 7.7/47 kB
2026-10-02T13:28:29.9832231Z Progress (1): 12/47 kB 
2026-10-02T13:28:29.9832508Z Progress (1): 16/47 kB
2026-10-02T13:28:29.9832674Z Progress (1): 20/47 kB
2026-10-02T13:28:29.9832812Z Progress (1): 24/47 kB
2026-10-02T13:28:29.9833112Z Progress (1): 28/47 kB
2026-10-02T13:28:29.9833251Z Progress (1): 32/47 kB
2026-10-02T13:28:29.9833406Z Progress (1): 36/47 kB
2026-10-02T13:28:29.9833512Z Progress (1): 41/47 kB
2026-10-02T13:28:29.9833673Z Progress (1): 45/47 kB
2026-10-02T13:28:29.9926516Z Progress (1): 47 kB   
2026-10-02T13:28:29.9926803Z                    
2026-10-02T13:28:29.9927394Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-deployment/3.15.3/quarkus-vertx-deployment-3.15.3.jar (47 kB at 2.2 MB/s)
2026-10-02T13:28:30.0000332Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment-spi/3.15.3/quarkus-vertx-http-deployment-spi-3.15.3.jar
2026-10-02T13:28:30.0074653Z Progress (1): 2.3/18 kB
2026-10-02T13:28:30.0075198Z Progress (1): 6.4/18 kB
2026-10-02T13:28:30.0075349Z Progress (1): 10/18 kB 
2026-10-02T13:28:30.0075486Z Progress (1): 15/18 kB
2026-10-02T13:28:30.0138532Z Progress (1): 18 kB   
2026-10-02T13:28:30.0138971Z                    
2026-10-02T13:28:30.0139877Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment-spi/3.15.3/quarkus-vertx-http-deployment-spi-3.15.3.jar (18 kB at 1.3 MB/s)
2026-10-02T13:28:30.0209444Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-deployment/3.15.3/quarkus-smallrye-context-propagation-deployment-3.15.3.jar
2026-10-02T13:28:30.0295389Z Progress (1): 4.1/21 kB
2026-10-02T13:28:30.0295650Z Progress (1): 7.7/21 kB
2026-10-02T13:28:30.0295798Z Progress (1): 12/21 kB 
2026-10-02T13:28:30.0296091Z Progress (1): 16/21 kB
2026-10-02T13:28:30.0296233Z Progress (1): 20/21 kB
2026-10-02T13:28:30.0388653Z Progress (1): 21 kB   
2026-10-02T13:28:30.0388897Z                    
2026-10-02T13:28:30.0389697Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-context-propagation-deployment/3.15.3/quarkus-smallrye-context-propagation-deployment-3.15.3.jar (21 kB at 1.2 MB/s)
2026-10-02T13:28:30.0471710Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-mutiny-deployment/3.15.3/quarkus-mutiny-deployment-3.15.3.jar
2026-10-02T13:28:30.0541036Z Progress (1): 4.1/8.2 kB
2026-10-02T13:28:30.0541233Z Progress (1): 6.4/8.2 kB
2026-10-02T13:28:30.0656614Z Progress (1): 8.2 kB    
2026-10-02T13:28:30.0657308Z                     
2026-10-02T13:28:30.0658156Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-mutiny-deployment/3.15.3/quarkus-mutiny-deployment-3.15.3.jar (8.2 kB at 434 kB/s)
2026-10-02T13:28:30.0757873Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-tls-registry-deployment/3.15.3/quarkus-tls-registry-deployment-3.15.3.jar
2026-10-02T13:28:30.0856566Z Progress (1): 4.1/12 kB
2026-10-02T13:28:30.0856944Z Progress (1): 7.7/12 kB
2026-10-02T13:28:30.0857093Z Progress (1): 12/12 kB 
2026-10-02T13:28:30.0949259Z Progress (1): 12 kB   
2026-10-02T13:28:30.0949732Z                    
2026-10-02T13:28:30.0950364Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-tls-registry-deployment/3.15.3/quarkus-tls-registry-deployment-3.15.3.jar (12 kB at 634 kB/s)
2026-10-02T13:28:30.1021989Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-credentials-deployment/3.15.3/quarkus-credentials-deployment-3.15.3.jar
2026-10-02T13:28:30.1080353Z Progress (1): 4.1/7.3 kB
2026-10-02T13:28:30.1080555Z Progress (1): 6.4/7.3 kB
2026-10-02T13:28:30.1139851Z Progress (1): 7.3 kB    
2026-10-02T13:28:30.1140064Z                     
2026-10-02T13:28:30.1140671Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-credentials-deployment/3.15.3/quarkus-credentials-deployment-3.15.3.jar (7.3 kB at 609 kB/s)
2026-10-02T13:28:30.1223610Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-spi/3.15.3/quarkus-kubernetes-spi-3.15.3.jar
2026-10-02T13:28:30.1317532Z Progress (1): 4.1/40 kB
2026-10-02T13:28:30.1317732Z Progress (1): 6.4/40 kB
2026-10-02T13:28:30.1317839Z Progress (1): 10/40 kB 
2026-10-02T13:28:30.1318709Z Progress (1): 15/40 kB
2026-10-02T13:28:30.1319260Z Progress (1): 19/40 kB
2026-10-02T13:28:30.1319552Z Progress (1): 23/40 kB
2026-10-02T13:28:30.1319721Z Progress (1): 27/40 kB
2026-10-02T13:28:30.1319868Z Progress (1): 31/40 kB
2026-10-02T13:28:30.1320155Z Progress (1): 35/40 kB
2026-10-02T13:28:30.1320289Z Progress (1): 39/40 kB
2026-10-02T13:28:30.1395022Z Progress (1): 40 kB   
2026-10-02T13:28:30.1395180Z                    
2026-10-02T13:28:30.1395768Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-spi/3.15.3/quarkus-kubernetes-spi-3.15.3.jar (40 kB at 2.2 MB/s)
2026-10-02T13:28:30.1477084Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-resources/3.15.3/quarkus-vertx-http-dev-ui-resources-3.15.3.jar
2026-10-02T13:28:30.1721394Z Progress (1): 5.0/884 kB
2026-10-02T13:28:30.1721787Z Progress (1): 13/884 kB 
2026-10-02T13:28:30.1722108Z Progress (1): 21/884 kB
2026-10-02T13:28:30.1722273Z Progress (1): 30/884 kB
2026-10-02T13:28:30.1722564Z Progress (1): 38/884 kB
2026-10-02T13:28:30.1723148Z Progress (1): 46/884 kB
2026-10-02T13:28:30.1724123Z Progress (1): 54/884 kB
2026-10-02T13:28:30.1724692Z Progress (1): 62/884 kB
2026-10-02T13:28:30.1725968Z Progress (1): 71/884 kB
2026-10-02T13:28:30.1726300Z Progress (1): 79/884 kB
2026-10-02T13:28:30.1730109Z Progress (1): 87/884 kB
2026-10-02T13:28:30.1750352Z Progress (1): 95/884 kB
2026-10-02T13:28:30.1782613Z Progress (1): 101/884 kB
2026-10-02T13:28:30.1783974Z Progress (1): 109/884 kB
2026-10-02T13:28:30.1784302Z Progress (1): 117/884 kB
2026-10-02T13:28:30.1784643Z Progress (1): 126/884 kB
2026-10-02T13:28:30.1785056Z Progress (1): 134/884 kB
2026-10-02T13:28:30.1785312Z Progress (1): 142/884 kB
2026-10-02T13:28:30.1785549Z Progress (1): 150/884 kB
2026-10-02T13:28:30.1786253Z Progress (1): 158/884 kB
2026-10-02T13:28:30.1786593Z Progress (1): 167/884 kB
2026-10-02T13:28:30.1786833Z Progress (1): 175/884 kB
2026-10-02T13:28:30.1787085Z Progress (1): 183/884 kB
2026-10-02T13:28:30.1794708Z Progress (1): 191/884 kB
2026-10-02T13:28:30.1795102Z Progress (1): 199/884 kB
2026-10-02T13:28:30.1795412Z Progress (1): 208/884 kB
2026-10-02T13:28:30.1795696Z Progress (1): 216/884 kB
2026-10-02T13:28:30.1796315Z Progress (1): 224/884 kB
2026-10-02T13:28:30.1796631Z Progress (1): 232/884 kB
2026-10-02T13:28:30.1796782Z Progress (1): 240/884 kB
2026-10-02T13:28:30.1796887Z Progress (1): 248/884 kB
2026-10-02T13:28:30.1797029Z Progress (1): 257/884 kB
2026-10-02T13:28:30.1797170Z Progress (1): 265/884 kB
2026-10-02T13:28:30.1797310Z Progress (1): 273/884 kB
2026-10-02T13:28:30.1797450Z Progress (1): 281/884 kB
2026-10-02T13:28:30.1797750Z Progress (1): 289/884 kB
2026-10-02T13:28:30.1797903Z Progress (1): 298/884 kB
2026-10-02T13:28:30.1798005Z Progress (1): 306/884 kB
2026-10-02T13:28:30.1798171Z Progress (1): 314/884 kB
2026-10-02T13:28:30.1798307Z Progress (1): 322/884 kB
2026-10-02T13:28:30.1798445Z Progress (1): 330/884 kB
2026-10-02T13:28:30.1833428Z Progress (1): 335/884 kB
2026-10-02T13:28:30.1833828Z Progress (1): 343/884 kB
2026-10-02T13:28:30.1834086Z Progress (1): 351/884 kB
2026-10-02T13:28:30.1834325Z Progress (1): 359/884 kB
2026-10-02T13:28:30.1834625Z Progress (1): 368/884 kB
2026-10-02T13:28:30.1834825Z Progress (1): 376/884 kB
2026-10-02T13:28:30.1835362Z Progress (1): 384/884 kB
2026-10-02T13:28:30.1835726Z Progress (1): 392/884 kB
2026-10-02T13:28:30.1836108Z Progress (1): 400/884 kB
2026-10-02T13:28:30.1836327Z Progress (1): 409/884 kB
2026-10-02T13:28:30.1836537Z Progress (1): 417/884 kB
2026-10-02T13:28:30.1836760Z Progress (1): 425/884 kB
2026-10-02T13:28:30.1836992Z Progress (1): 433/884 kB
2026-10-02T13:28:30.1837172Z Progress (1): 441/884 kB
2026-10-02T13:28:30.1837415Z Progress (1): 450/884 kB
2026-10-02T13:28:30.1837672Z Progress (1): 458/884 kB
2026-10-02T13:28:30.1837902Z Progress (1): 466/884 kB
2026-10-02T13:28:30.1838138Z Progress (1): 474/884 kB
2026-10-02T13:28:30.1838362Z Progress (1): 482/884 kB
2026-10-02T13:28:30.1838596Z Progress (1): 490/884 kB
2026-10-02T13:28:30.1839031Z Progress (1): 499/884 kB
2026-10-02T13:28:30.1839223Z Progress (1): 507/884 kB
2026-10-02T13:28:30.1839455Z Progress (1): 515/884 kB
2026-10-02T13:28:30.1839905Z Progress (1): 523/884 kB
2026-10-02T13:28:30.1848229Z Progress (1): 531/884 kB
2026-10-02T13:28:30.1848523Z Progress (1): 540/884 kB
2026-10-02T13:28:30.1848775Z Progress (1): 548/884 kB
2026-10-02T13:28:30.1849014Z Progress (1): 556/884 kB
2026-10-02T13:28:30.1849350Z Progress (1): 564/884 kB
2026-10-02T13:28:30.1849570Z Progress (1): 572/884 kB
2026-10-02T13:28:30.1849734Z Progress (1): 581/884 kB
2026-10-02T13:28:30.1849942Z Progress (1): 589/884 kB
2026-10-02T13:28:30.1850163Z Progress (1): 597/884 kB
2026-10-02T13:28:30.1850741Z Progress (1): 605/884 kB
2026-10-02T13:28:30.1850992Z Progress (1): 613/884 kB
2026-10-02T13:28:30.1851216Z Progress (1): 622/884 kB
2026-10-02T13:28:30.1851438Z Progress (1): 630/884 kB
2026-10-02T13:28:30.1851614Z Progress (1): 638/884 kB
2026-10-02T13:28:30.1851827Z Progress (1): 646/884 kB
2026-10-02T13:28:30.1852043Z Progress (1): 654/884 kB
2026-10-02T13:28:30.1852261Z Progress (1): 663/884 kB
2026-10-02T13:28:30.1852478Z Progress (1): 671/884 kB
2026-10-02T13:28:30.1852737Z Progress (1): 679/884 kB
2026-10-02T13:28:30.1853409Z Progress (1): 687/884 kB
2026-10-02T13:28:30.1853631Z Progress (1): 695/884 kB
2026-10-02T13:28:30.1853818Z Progress (1): 703/884 kB
2026-10-02T13:28:30.1854034Z Progress (1): 712/884 kB
2026-10-02T13:28:30.1854253Z Progress (1): 720/884 kB
2026-10-02T13:28:30.1854458Z Progress (1): 728/884 kB
2026-10-02T13:28:30.1854776Z Progress (1): 736/884 kB
2026-10-02T13:28:30.1855002Z Progress (1): 744/884 kB
2026-10-02T13:28:30.1861948Z Progress (1): 753/884 kB
2026-10-02T13:28:30.1862326Z Progress (1): 761/884 kB
2026-10-02T13:28:30.1863323Z Progress (1): 769/884 kB
2026-10-02T13:28:30.1863672Z Progress (1): 777/884 kB
2026-10-02T13:28:30.1863909Z Progress (1): 785/884 kB
2026-10-02T13:28:30.1864330Z Progress (1): 794/884 kB
2026-10-02T13:28:30.1865078Z Progress (1): 802/884 kB
2026-10-02T13:28:30.1865612Z Progress (1): 810/884 kB
2026-10-02T13:28:30.1866350Z Progress (1): 818/884 kB
2026-10-02T13:28:30.1866868Z Progress (1): 826/884 kB
2026-10-02T13:28:30.1867325Z Progress (1): 835/884 kB
2026-10-02T13:28:30.1871158Z Progress (1): 843/884 kB
2026-10-02T13:28:30.1871551Z Progress (1): 851/884 kB
2026-10-02T13:28:30.1871780Z Progress (1): 859/884 kB
2026-10-02T13:28:30.1871956Z Progress (1): 867/884 kB
2026-10-02T13:28:30.1872184Z Progress (1): 876/884 kB
2026-10-02T13:28:30.1872431Z Progress (1): 884/884 kB
2026-10-02T13:28:30.2055516Z Progress (1): 884 kB    
2026-10-02T13:28:30.2055989Z                     
2026-10-02T13:28:30.2056620Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-dev-ui-resources/3.15.3/quarkus-vertx-http-dev-ui-resources-3.15.3.jar (884 kB at 16 MB/s)
2026-10-02T13:28:30.2116736Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment/3.15.3/quarkus-vertx-http-deployment-3.15.3.jar
2026-10-02T13:28:30.2255295Z Progress (1): 4.1/239 kB
2026-10-02T13:28:30.2255941Z Progress (1): 7.7/239 kB
2026-10-02T13:28:30.2256123Z Progress (1): 12/239 kB 
2026-10-02T13:28:30.2256267Z Progress (1): 16/239 kB
2026-10-02T13:28:30.2257123Z Progress (1): 20/239 kB
2026-10-02T13:28:30.2257426Z Progress (1): 24/239 kB
2026-10-02T13:28:30.2257531Z Progress (1): 28/239 kB
2026-10-02T13:28:30.2258130Z Progress (1): 32/239 kB
2026-10-02T13:28:30.2258275Z Progress (1): 36/239 kB
2026-10-02T13:28:30.2258410Z Progress (1): 40/239 kB
2026-10-02T13:28:30.2259155Z Progress (1): 45/239 kB
2026-10-02T13:28:30.2259301Z Progress (1): 49/239 kB
2026-10-02T13:28:30.2259453Z Progress (1): 53/239 kB
2026-10-02T13:28:30.2260179Z Progress (1): 57/239 kB
2026-10-02T13:28:30.2260361Z Progress (1): 61/239 kB
2026-10-02T13:28:30.2260460Z Progress (1): 65/239 kB
2026-10-02T13:28:30.2261280Z Progress (1): 69/239 kB
2026-10-02T13:28:30.2261456Z Progress (1): 73/239 kB
2026-10-02T13:28:30.2261595Z Progress (1): 77/239 kB
2026-10-02T13:28:30.2262195Z Progress (1): 81/239 kB
2026-10-02T13:28:30.2262553Z Progress (1): 86/239 kB
2026-10-02T13:28:30.2262782Z Progress (1): 90/239 kB
2026-10-02T13:28:30.2262960Z Progress (1): 94/239 kB
2026-10-02T13:28:30.2312325Z Progress (1): 98/239 kB
2026-10-02T13:28:30.2313383Z Progress (1): 102/239 kB
2026-10-02T13:28:30.2314162Z Progress (1): 106/239 kB
2026-10-02T13:28:30.2314362Z Progress (1): 110/239 kB
2026-10-02T13:28:30.2314783Z Progress (1): 114/239 kB
2026-10-02T13:28:30.2315766Z Progress (1): 118/239 kB
2026-10-02T13:28:30.2316546Z Progress (1): 122/239 kB
2026-10-02T13:28:30.2316693Z Progress (1): 127/239 kB
2026-10-02T13:28:30.2316884Z Progress (1): 131/239 kB
2026-10-02T13:28:30.2317360Z Progress (1): 135/239 kB
2026-10-02T13:28:30.2317493Z Progress (1): 139/239 kB
2026-10-02T13:28:30.2318098Z Progress (1): 143/239 kB
2026-10-02T13:28:30.2318240Z Progress (1): 147/239 kB
2026-10-02T13:28:30.2318767Z Progress (1): 151/239 kB
2026-10-02T13:28:30.2319032Z Progress (1): 155/239 kB
2026-10-02T13:28:30.2319139Z Progress (1): 159/239 kB
2026-10-02T13:28:30.2319617Z Progress (1): 163/239 kB
2026-10-02T13:28:30.2319759Z Progress (1): 167/239 kB
2026-10-02T13:28:30.2320548Z Progress (1): 172/239 kB
2026-10-02T13:28:30.2320693Z Progress (1): 176/239 kB
2026-10-02T13:28:30.2320825Z Progress (1): 180/239 kB
2026-10-02T13:28:30.2321529Z Progress (1): 184/239 kB
2026-10-02T13:28:30.2321669Z Progress (1): 188/239 kB
2026-10-02T13:28:30.2321800Z Progress (1): 192/239 kB
2026-10-02T13:28:30.2322636Z Progress (1): 196/239 kB
2026-10-02T13:28:30.2322742Z Progress (1): 200/239 kB
2026-10-02T13:28:30.2322889Z Progress (1): 204/239 kB
2026-10-02T13:28:30.2323050Z Progress (1): 208/239 kB
2026-10-02T13:28:30.2323795Z Progress (1): 213/239 kB
2026-10-02T13:28:30.2324153Z Progress (1): 217/239 kB
2026-10-02T13:28:30.2324286Z Progress (1): 221/239 kB
2026-10-02T13:28:30.2324420Z Progress (1): 225/239 kB
2026-10-02T13:28:30.2325121Z Progress (1): 229/239 kB
2026-10-02T13:28:30.2325227Z Progress (1): 233/239 kB
2026-10-02T13:28:30.2325360Z Progress (1): 237/239 kB
2026-10-02T13:28:30.2436492Z Progress (1): 239 kB    
2026-10-02T13:28:30.2436764Z                     
2026-10-02T13:28:30.2437349Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-vertx-http-deployment/3.15.3/quarkus-vertx-http-deployment-3.15.3.jar (239 kB at 7.5 MB/s)
2026-10-02T13:28:30.2555957Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-server-spi-deployment/3.15.3/quarkus-rest-server-spi-deployment-3.15.3.jar
2026-10-02T13:28:30.2617669Z Progress (1): 4.1/14 kB
2026-10-02T13:28:30.2617879Z Progress (1): 7.7/14 kB
2026-10-02T13:28:30.2618046Z Progress (1): 12/14 kB 
2026-10-02T13:28:30.2732828Z Progress (1): 14 kB   
2026-10-02T13:28:30.2733219Z                    
2026-10-02T13:28:30.2733837Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-server-spi-deployment/3.15.3/quarkus-rest-server-spi-deployment-3.15.3.jar (14 kB at 772 kB/s)
2026-10-02T13:28:30.2805654Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jaxrs-spi-deployment/3.15.3/quarkus-jaxrs-spi-deployment-3.15.3.jar
2026-10-02T13:28:30.2888285Z Progress (1): 4.1/7.3 kB
2026-10-02T13:28:30.3046589Z Progress (1): 7.3 kB    
2026-10-02T13:28:30.3047045Z                     
2026-10-02T13:28:30.3047803Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jaxrs-spi-deployment/3.15.3/quarkus-jaxrs-spi-deployment-3.15.3.jar (7.3 kB at 349 kB/s)
2026-10-02T13:28:30.3224748Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-security-spi/3.15.3/quarkus-security-spi-3.15.3.jar
2026-10-02T13:28:30.3355765Z Progress (1): 4.1/14 kB
2026-10-02T13:28:30.3356335Z Progress (1): 7.7/14 kB
2026-10-02T13:28:30.3356484Z Progress (1): 12/14 kB 
2026-10-02T13:28:30.3427080Z Progress (1): 14 kB   
2026-10-02T13:28:30.3427273Z                    
2026-10-02T13:28:30.3427916Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-security-spi/3.15.3/quarkus-security-spi-3.15.3.jar (14 kB at 684 kB/s)
2026-10-02T13:28:30.3489736Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jsonp-deployment/3.15.3/quarkus-jsonp-deployment-3.15.3.jar
2026-10-02T13:28:30.3542681Z Progress (1): 4.1/7.7 kB
2026-10-02T13:28:30.3621440Z Progress (1): 7.7 kB    
2026-10-02T13:28:30.3621586Z                     
2026-10-02T13:28:30.3622301Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jsonp-deployment/3.15.3/quarkus-jsonp-deployment-3.15.3.jar (7.7 kB at 594 kB/s)
2026-10-02T13:28:30.3691871Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-common-deployment/3.15.3/quarkus-rest-common-deployment-3.15.3.jar
2026-10-02T13:28:30.3812423Z Progress (1): 4.1/37 kB
2026-10-02T13:28:30.3812833Z Progress (1): 7.7/37 kB
2026-10-02T13:28:30.3813167Z Progress (1): 12/37 kB 
2026-10-02T13:28:30.3813766Z Progress (1): 16/37 kB
2026-10-02T13:28:30.3822309Z Progress (1): 20/37 kB
2026-10-02T13:28:30.3822660Z Progress (1): 24/37 kB
2026-10-02T13:28:30.3822803Z Progress (1): 28/37 kB
2026-10-02T13:28:30.3822938Z Progress (1): 32/37 kB
2026-10-02T13:28:30.3823078Z Progress (1): 36/37 kB
2026-10-02T13:28:30.3909835Z Progress (1): 37 kB   
2026-10-02T13:28:30.3910214Z                    
2026-10-02T13:28:30.3910908Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-common-deployment/3.15.3/quarkus-rest-common-deployment-3.15.3.jar (37 kB at 1.7 MB/s)
2026-10-02T13:28:30.4059687Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-virtual-threads-deployment/3.15.3/quarkus-virtual-threads-deployment-3.15.3.jar
2026-10-02T13:28:30.4143592Z Progress (1): 4.1/8.5 kB
2026-10-02T13:28:30.4144190Z Progress (1): 7.7/8.5 kB
2026-10-02T13:28:30.4254283Z Progress (1): 8.5 kB    
2026-10-02T13:28:30.4254668Z                     
2026-10-02T13:28:30.4255307Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-virtual-threads-deployment/3.15.3/quarkus-virtual-threads-deployment-3.15.3.jar (8.5 kB at 426 kB/s)
2026-10-02T13:28:30.4346374Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-deployment/3.15.3/quarkus-rest-deployment-3.15.3.jar
2026-10-02T13:28:30.4465477Z Progress (1): 4.1/140 kB
2026-10-02T13:28:30.4465822Z Progress (1): 7.7/140 kB
2026-10-02T13:28:30.4465992Z Progress (1): 12/140 kB 
2026-10-02T13:28:30.4466322Z Progress (1): 16/140 kB
2026-10-02T13:28:30.4466468Z Progress (1): 20/140 kB
2026-10-02T13:28:30.4466609Z Progress (1): 24/140 kB
2026-10-02T13:28:30.4466751Z Progress (1): 28/140 kB
2026-10-02T13:28:30.4467645Z Progress (1): 32/140 kB
2026-10-02T13:28:30.4469491Z Progress (1): 36/140 kB
2026-10-02T13:28:30.4469904Z Progress (1): 40/140 kB
2026-10-02T13:28:30.4470159Z Progress (1): 44/140 kB
2026-10-02T13:28:30.4470319Z Progress (1): 48/140 kB
2026-10-02T13:28:30.4470656Z Progress (1): 52/140 kB
2026-10-02T13:28:30.4470804Z Progress (1): 56/140 kB
2026-10-02T13:28:30.4470943Z Progress (1): 60/140 kB
2026-10-02T13:28:30.4471077Z Progress (1): 64/140 kB
2026-10-02T13:28:30.4471570Z Progress (1): 68/140 kB
2026-10-02T13:28:30.4471918Z Progress (1): 72/140 kB
2026-10-02T13:28:30.4472070Z Progress (1): 76/140 kB
2026-10-02T13:28:30.4472913Z Progress (1): 81/140 kB
2026-10-02T13:28:30.4473061Z Progress (1): 85/140 kB
2026-10-02T13:28:30.4473601Z Progress (1): 89/140 kB
2026-10-02T13:28:30.4473743Z Progress (1): 93/140 kB
2026-10-02T13:28:30.4474172Z Progress (1): 97/140 kB
2026-10-02T13:28:30.4474279Z Progress (1): 101/140 kB
2026-10-02T13:28:30.4474665Z Progress (1): 105/140 kB
2026-10-02T13:28:30.4475189Z Progress (1): 109/140 kB
2026-10-02T13:28:30.4475623Z Progress (1): 113/140 kB
2026-10-02T13:28:30.4475948Z Progress (1): 117/140 kB
2026-10-02T13:28:30.4476300Z Progress (1): 122/140 kB
2026-10-02T13:28:30.4476615Z Progress (1): 126/140 kB
2026-10-02T13:28:30.4477373Z Progress (1): 130/140 kB
2026-10-02T13:28:30.4477517Z Progress (1): 134/140 kB
2026-10-02T13:28:30.4477986Z Progress (1): 138/140 kB
2026-10-02T13:28:30.4595225Z Progress (1): 140 kB    
2026-10-02T13:28:30.4595397Z                     
2026-10-02T13:28:30.4595970Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-deployment/3.15.3/quarkus-rest-deployment-3.15.3.jar (140 kB at 5.6 MB/s)
2026-10-02T13:28:30.4668023Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-deployment/3.15.3/quarkus-jackson-deployment-3.15.3.jar
2026-10-02T13:28:30.4790450Z Progress (1): 4.1/19 kB
2026-10-02T13:28:30.4790651Z Progress (1): 7.7/19 kB
2026-10-02T13:28:30.4790756Z Progress (1): 12/19 kB 
2026-10-02T13:28:30.4790925Z Progress (1): 16/19 kB
2026-10-02T13:28:30.4897931Z Progress (1): 19 kB   
2026-10-02T13:28:30.4898197Z                    
2026-10-02T13:28:30.4898802Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jackson-deployment/3.15.3/quarkus-jackson-deployment-3.15.3.jar (19 kB at 846 kB/s)
2026-10-02T13:28:30.5024912Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-common-deployment/3.15.3/quarkus-rest-jackson-common-deployment-3.15.3.jar
2026-10-02T13:28:30.5126504Z Progress (1): 4.1/7.9 kB
2026-10-02T13:28:30.5126881Z Progress (1): 7.7/7.9 kB
2026-10-02T13:28:30.5216342Z Progress (1): 7.9 kB    
2026-10-02T13:28:30.5216543Z                     
2026-10-02T13:28:30.5217589Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-common-deployment/3.15.3/quarkus-rest-jackson-common-deployment-3.15.3.jar (7.9 kB at 394 kB/s)
2026-10-02T13:28:30.5383435Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-deployment/3.15.3/quarkus-rest-jackson-deployment-3.15.3.jar
2026-10-02T13:28:30.5507509Z Progress (1): 4.1/41 kB
2026-10-02T13:28:30.5507896Z Progress (1): 7.7/41 kB
2026-10-02T13:28:30.5508004Z Progress (1): 12/41 kB 
2026-10-02T13:28:30.5508152Z Progress (1): 16/41 kB
2026-10-02T13:28:30.5508291Z Progress (1): 20/41 kB
2026-10-02T13:28:30.5508431Z Progress (1): 24/41 kB
2026-10-02T13:28:30.5508565Z Progress (1): 28/41 kB
2026-10-02T13:28:30.5508701Z Progress (1): 32/41 kB
2026-10-02T13:28:30.5508852Z Progress (1): 36/41 kB
2026-10-02T13:28:30.5510787Z Progress (1): 41/41 kB
2026-10-02T13:28:30.5559614Z Progress (1): 41 kB   
2026-10-02T13:28:30.5560029Z                    
2026-10-02T13:28:30.5561153Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-jackson-deployment/3.15.3/quarkus-rest-jackson-deployment-3.15.3.jar (41 kB at 2.3 MB/s)
2026-10-02T13:28:30.5717761Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-spi/3.15.3/quarkus-smallrye-health-spi-3.15.3.jar
2026-10-02T13:28:30.5825444Z Progress (1): 4.1/7.6 kB
2026-10-02T13:28:30.5901525Z Progress (1): 7.6 kB    
2026-10-02T13:28:30.5901693Z                     
2026-10-02T13:28:30.5902267Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-spi/3.15.3/quarkus-smallrye-health-spi-3.15.3.jar (7.6 kB at 421 kB/s)
2026-10-02T13:28:30.5991813Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-openapi-spi/3.15.3/quarkus-smallrye-openapi-spi-3.15.3.jar
2026-10-02T13:28:30.6085718Z Progress (1): 4.1/8.7 kB
2026-10-02T13:28:30.6086017Z Progress (1): 7.7/8.7 kB
2026-10-02T13:28:30.6286044Z Progress (1): 8.7 kB    
2026-10-02T13:28:30.6286328Z                     
2026-10-02T13:28:30.6286925Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-openapi-spi/3.15.3/quarkus-smallrye-openapi-spi-3.15.3.jar (8.7 kB at 291 kB/s)
2026-10-02T13:28:30.6391197Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-deployment/3.15.3/quarkus-smallrye-health-deployment-3.15.3.jar
2026-10-02T13:28:30.6491107Z Progress (1): 4.1/33 kB
2026-10-02T13:28:30.6491472Z Progress (1): 7.7/33 kB
2026-10-02T13:28:30.6491896Z Progress (1): 12/33 kB 
2026-10-02T13:28:30.6492062Z Progress (1): 16/33 kB
2026-10-02T13:28:30.6492167Z Progress (1): 20/33 kB
2026-10-02T13:28:30.6492564Z Progress (1): 24/33 kB
2026-10-02T13:28:30.6492705Z Progress (1): 28/33 kB
2026-10-02T13:28:30.6492867Z Progress (1): 32/33 kB
2026-10-02T13:28:30.6554857Z Progress (1): 33 kB   
2026-10-02T13:28:30.6555056Z                    
2026-10-02T13:28:30.6555871Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-smallrye-health-deployment/3.15.3/quarkus-smallrye-health-deployment-3.15.3.jar (33 kB at 1.9 MB/s)
2026-10-02T13:28:30.6738463Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-resteasy-common-spi/3.15.3/quarkus-resteasy-common-spi-3.15.3.jar
2026-10-02T13:28:30.6839189Z Progress (1): 4.1/13 kB
2026-10-02T13:28:30.6839538Z Progress (1): 7.7/13 kB
2026-10-02T13:28:30.6841062Z Progress (1): 12/13 kB 
2026-10-02T13:28:30.6916491Z Progress (1): 13 kB   
2026-10-02T13:28:30.6916771Z                    
2026-10-02T13:28:30.6917377Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-resteasy-common-spi/3.15.3/quarkus-resteasy-common-spi-3.15.3.jar (13 kB at 729 kB/s)
2026-10-02T13:28:30.6994650Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-spi-deployment/3.15.3/quarkus-rest-spi-deployment-3.15.3.jar
2026-10-02T13:28:30.7075248Z Progress (1): 4.1/32 kB
2026-10-02T13:28:30.7075517Z Progress (1): 7.7/32 kB
2026-10-02T13:28:30.7075667Z Progress (1): 12/32 kB 
2026-10-02T13:28:30.7075807Z Progress (1): 16/32 kB
2026-10-02T13:28:30.7076473Z Progress (1): 20/32 kB
2026-10-02T13:28:30.7076643Z Progress (1): 24/32 kB
2026-10-02T13:28:30.7076744Z Progress (1): 28/32 kB
2026-10-02T13:28:30.7076889Z Progress (1): 32/32 kB
2026-10-02T13:28:30.7137417Z Progress (1): 32 kB   
2026-10-02T13:28:30.7137836Z                    
2026-10-02T13:28:30.7138399Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-rest-spi-deployment/3.15.3/quarkus-rest-spi-deployment-3.15.3.jar (32 kB at 2.3 MB/s)
2026-10-02T13:28:30.7287139Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-undertow-spi/3.15.3/quarkus-undertow-spi-3.15.3.jar
2026-10-02T13:28:30.7796832Z Progress (1): 4.1/27 kB
2026-10-02T13:28:30.7797047Z Progress (1): 7.7/27 kB
2026-10-02T13:28:30.7797196Z Progress (1): 12/27 kB 
2026-10-02T13:28:30.7797299Z Progress (1): 16/27 kB
2026-10-02T13:28:30.7797560Z Progress (1): 20/27 kB
2026-10-02T13:28:30.7797701Z Progress (1): 24/27 kB
2026-10-02T13:28:30.8385705Z Progress (1): 27 kB   
2026-10-02T13:28:30.8386078Z                    
2026-10-02T13:28:30.8548849Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-undertow-spi/3.15.3/quarkus-undertow-spi-3.15.3.jar (27 kB at 249 kB/s)
2026-10-02T13:28:30.8549331Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer-deployment/3.15.3/quarkus-micrometer-deployment-3.15.3.jar
2026-10-02T13:28:30.9281714Z Progress (1): 4.1/75 kB
2026-10-02T13:28:30.9282248Z Progress (1): 7.7/75 kB
2026-10-02T13:28:30.9283039Z Progress (1): 12/75 kB 
2026-10-02T13:28:30.9283390Z Progress (1): 16/75 kB
2026-10-02T13:28:30.9283535Z Progress (1): 20/75 kB
2026-10-02T13:28:30.9283681Z Progress (1): 24/75 kB
2026-10-02T13:28:30.9283782Z Progress (1): 28/75 kB
2026-10-02T13:28:30.9283925Z Progress (1): 32/75 kB
2026-10-02T13:28:30.9284062Z Progress (1): 36/75 kB
2026-10-02T13:28:30.9286868Z Progress (1): 41/75 kB
2026-10-02T13:28:30.9287149Z Progress (1): 45/75 kB
2026-10-02T13:28:30.9287548Z Progress (1): 49/75 kB
2026-10-02T13:28:30.9287768Z Progress (1): 53/75 kB
2026-10-02T13:28:30.9287974Z Progress (1): 57/75 kB
2026-10-02T13:28:30.9288125Z Progress (1): 61/75 kB
2026-10-02T13:28:30.9288323Z Progress (1): 65/75 kB
2026-10-02T13:28:30.9288530Z Progress (1): 69/75 kB
2026-10-02T13:28:30.9288736Z Progress (1): 73/75 kB
2026-10-02T13:28:30.9918363Z Progress (1): 75 kB   
2026-10-02T13:28:30.9921171Z                    
2026-10-02T13:28:30.9921909Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-micrometer-deployment/3.15.3/quarkus-micrometer-deployment-3.15.3.jar (75 kB at 550 kB/s)
2026-10-02T13:28:30.9985576Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common-deployment/3.15.3/quarkus-panache-common-deployment-3.15.3.jar
2026-10-02T13:28:31.0501457Z Progress (1): 4.1/64 kB
2026-10-02T13:28:31.0502006Z Progress (1): 7.7/64 kB
2026-10-02T13:28:31.0502759Z Progress (1): 12/64 kB 
2026-10-02T13:28:31.0502945Z Progress (1): 16/64 kB
2026-10-02T13:28:31.0503086Z Progress (1): 20/64 kB
2026-10-02T13:28:31.0503243Z Progress (1): 24/64 kB
2026-10-02T13:28:31.0503346Z Progress (1): 28/64 kB
2026-10-02T13:28:31.0503481Z Progress (1): 32/64 kB
2026-10-02T13:28:31.0503620Z Progress (1): 36/64 kB
2026-10-02T13:28:31.0503755Z Progress (1): 41/64 kB
2026-10-02T13:28:31.0503912Z Progress (1): 45/64 kB
2026-10-02T13:28:31.0504082Z Progress (1): 49/64 kB
2026-10-02T13:28:31.0504217Z Progress (1): 53/64 kB
2026-10-02T13:28:31.0505046Z Progress (1): 57/64 kB
2026-10-02T13:28:31.0505583Z Progress (1): 61/64 kB
2026-10-02T13:28:31.0997994Z Progress (1): 64 kB   
2026-10-02T13:28:31.0998182Z                    
2026-10-02T13:28:31.0999161Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-common-deployment/3.15.3/quarkus-panache-common-deployment-3.15.3.jar (64 kB at 632 kB/s)
2026-10-02T13:28:31.1049072Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment-spi/3.15.3/quarkus-hibernate-orm-deployment-spi-3.15.3.jar
2026-10-02T13:28:31.1524353Z Progress (1): 4.1/9.1 kB
2026-10-02T13:28:31.1524782Z Progress (1): 7.7/9.1 kB
2026-10-02T13:28:31.2026748Z Progress (1): 9.1 kB    
2026-10-02T13:28:31.2027150Z                     
2026-10-02T13:28:31.2027826Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment-spi/3.15.3/quarkus-hibernate-orm-deployment-spi-3.15.3.jar (9.1 kB at 92 kB/s)
2026-10-02T13:28:31.2346908Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine-deployment/3.15.3/quarkus-caffeine-deployment-3.15.3.jar
2026-10-02T13:28:31.2885821Z Progress (1): 4.1/15 kB
2026-10-02T13:28:31.2886047Z Progress (1): 7.7/15 kB
2026-10-02T13:28:31.2886187Z Progress (1): 12/15 kB 
2026-10-02T13:28:31.3337285Z Progress (1): 15 kB   
2026-10-02T13:28:31.3337461Z                    
2026-10-02T13:28:31.3338062Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-caffeine-deployment/3.15.3/quarkus-caffeine-deployment-3.15.3.jar (15 kB at 149 kB/s)
2026-10-02T13:28:31.3527758Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment/3.15.3/quarkus-hibernate-orm-deployment-3.15.3.jar
2026-10-02T13:28:31.4165088Z Progress (1): 2.3/150 kB
2026-10-02T13:28:31.4165810Z Progress (1): 6.4/150 kB
2026-10-02T13:28:31.4166357Z Progress (1): 10/150 kB 
2026-10-02T13:28:31.4166923Z Progress (1): 15/150 kB
2026-10-02T13:28:31.4167208Z Progress (1): 19/150 kB
2026-10-02T13:28:31.4167354Z Progress (1): 23/150 kB
2026-10-02T13:28:31.4167502Z Progress (1): 27/150 kB
2026-10-02T13:28:31.4167637Z Progress (1): 31/150 kB
2026-10-02T13:28:31.4167773Z Progress (1): 35/150 kB
2026-10-02T13:28:31.4167914Z Progress (1): 39/150 kB
2026-10-02T13:28:31.4168018Z Progress (1): 43/150 kB
2026-10-02T13:28:31.4168472Z Progress (1): 47/150 kB
2026-10-02T13:28:31.4169087Z Progress (1): 51/150 kB
2026-10-02T13:28:31.4169840Z Progress (1): 56/150 kB
2026-10-02T13:28:31.4169998Z Progress (1): 60/150 kB
2026-10-02T13:28:31.4170100Z Progress (1): 64/150 kB
2026-10-02T13:28:31.4170957Z Progress (1): 68/150 kB
2026-10-02T13:28:31.4171134Z Progress (1): 72/150 kB
2026-10-02T13:28:31.4171370Z Progress (1): 76/150 kB
2026-10-02T13:28:31.4171742Z Progress (1): 80/150 kB
2026-10-02T13:28:31.4172353Z Progress (1): 84/150 kB
2026-10-02T13:28:31.4172655Z Progress (1): 88/150 kB
2026-10-02T13:28:31.4173237Z Progress (1): 92/150 kB
2026-10-02T13:28:31.4173985Z Progress (1): 96/150 kB
2026-10-02T13:28:31.4174129Z Progress (1): 101/150 kB
2026-10-02T13:28:31.4174753Z Progress (1): 105/150 kB
2026-10-02T13:28:31.4174978Z Progress (1): 109/150 kB
2026-10-02T13:28:31.4175864Z Progress (1): 113/150 kB
2026-10-02T13:28:31.4176036Z Progress (1): 117/150 kB
2026-10-02T13:28:31.4176766Z Progress (1): 121/150 kB
2026-10-02T13:28:31.4177331Z Progress (1): 125/150 kB
2026-10-02T13:28:31.4177515Z Progress (1): 129/150 kB
2026-10-02T13:28:31.4177652Z Progress (1): 133/150 kB
2026-10-02T13:28:31.4177799Z Progress (1): 137/150 kB
2026-10-02T13:28:31.4177905Z Progress (1): 142/150 kB
2026-10-02T13:28:31.4178046Z Progress (1): 146/150 kB
2026-10-02T13:28:31.4178421Z Progress (1): 150/150 kB
2026-10-02T13:28:31.4720234Z Progress (1): 150 kB    
2026-10-02T13:28:31.4720465Z                     
2026-10-02T13:28:31.4721084Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-deployment/3.15.3/quarkus-hibernate-orm-deployment-3.15.3.jar (150 kB at 1.3 MB/s)
2026-10-02T13:28:31.4794166Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common-deployment/3.15.3/quarkus-hibernate-orm-panache-common-deployment-3.15.3.jar
2026-10-02T13:28:31.5323124Z Progress (1): 4.1/11 kB
2026-10-02T13:28:31.5323334Z Progress (1): 7.7/11 kB
2026-10-02T13:28:31.5773964Z Progress (1): 11 kB    
2026-10-02T13:28:31.5774180Z                    
2026-10-02T13:28:31.5774862Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-common-deployment/3.15.3/quarkus-hibernate-orm-panache-common-deployment-3.15.3.jar (11 kB at 113 kB/s)
2026-10-02T13:28:31.5903777Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common-deployment/3.15.3/quarkus-panache-hibernate-common-deployment-3.15.3.jar
2026-10-02T13:28:31.6381273Z Progress (1): 4.1/16 kB
2026-10-02T13:28:31.6381447Z Progress (1): 7.7/16 kB
2026-10-02T13:28:31.6381591Z Progress (1): 12/16 kB 
2026-10-02T13:28:31.6901142Z Progress (1): 16 kB   
2026-10-02T13:28:31.6901621Z                    
2026-10-02T13:28:31.6902254Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-panache-hibernate-common-deployment/3.15.3/quarkus-panache-hibernate-common-deployment-3.15.3.jar (16 kB at 155 kB/s)
2026-10-02T13:28:31.7017118Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-deployment/3.15.3/quarkus-hibernate-orm-panache-deployment-3.15.3.jar
2026-10-02T13:28:31.7511814Z Progress (1): 4.1/17 kB
2026-10-02T13:28:31.7512028Z Progress (1): 7.7/17 kB
2026-10-02T13:28:31.7512193Z Progress (1): 12/17 kB 
2026-10-02T13:28:31.7512330Z Progress (1): 16/17 kB
2026-10-02T13:28:31.7985324Z Progress (1): 17 kB   
2026-10-02T13:28:31.7985499Z                    
2026-10-02T13:28:31.7986291Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-hibernate-orm-panache-deployment/3.15.3/quarkus-hibernate-orm-panache-deployment-3.15.3.jar (17 kB at 176 kB/s)
2026-10-02T13:28:31.8059249Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-spi/3.15.3/quarkus-agroal-spi-3.15.3.jar
2026-10-02T13:28:31.8667180Z Progress (1): 4.1/9.8 kB
2026-10-02T13:28:31.8667543Z Progress (1): 7.7/9.8 kB
2026-10-02T13:28:31.9192032Z Progress (1): 9.8 kB    
2026-10-02T13:28:31.9192355Z                     
2026-10-02T13:28:31.9192954Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-spi/3.15.3/quarkus-agroal-spi-3.15.3.jar (9.8 kB at 87 kB/s)
2026-10-02T13:28:31.9305757Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment-spi/3.15.3/quarkus-datasource-deployment-spi-3.15.3.jar
2026-10-02T13:28:31.9775566Z Progress (1): 4.1/23 kB
2026-10-02T13:28:31.9776080Z Progress (1): 7.7/23 kB
2026-10-02T13:28:31.9776227Z Progress (1): 12/23 kB 
2026-10-02T13:28:31.9776369Z Progress (1): 16/23 kB
2026-10-02T13:28:31.9776515Z Progress (1): 20/23 kB
2026-10-02T13:28:32.0275132Z Progress (1): 23 kB   
2026-10-02T13:28:32.0275307Z                    
2026-10-02T13:28:32.0275928Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment-spi/3.15.3/quarkus-datasource-deployment-spi-3.15.3.jar (23 kB at 226 kB/s)
2026-10-02T13:28:32.0334918Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql-deployment/3.15.3/quarkus-flyway-mssql-deployment-3.15.3.jar
2026-10-02T13:28:32.2754440Z Progress (1): 4.1/6.3 kB
2026-10-02T13:28:32.5212302Z Progress (1): 6.3 kB    
2026-10-02T13:28:32.5212894Z                     
2026-10-02T13:28:32.5213804Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-mssql-deployment/3.15.3/quarkus-flyway-mssql-deployment-3.15.3.jar (6.3 kB at 13 kB/s)
2026-10-02T13:28:32.5284718Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/testcontainers/mssqlserver/1.20.1/mssqlserver-1.20.1.jar
2026-10-02T13:28:32.5336509Z Progress (1): 4.1/8.5 kB
2026-10-02T13:28:32.5336684Z Progress (1): 8.2/8.5 kB
2026-10-02T13:28:32.5401201Z Progress (1): 8.5 kB    
2026-10-02T13:28:32.5401357Z                     
2026-10-02T13:28:32.5401770Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/testcontainers/mssqlserver/1.20.1/mssqlserver-1.20.1.jar (8.5 kB at 710 kB/s)
2026-10-02T13:28:32.5465218Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-common/3.15.3/quarkus-devservices-common-3.15.3.jar
2026-10-02T13:28:32.5922702Z Progress (1): 4.1/17 kB
2026-10-02T13:28:32.5923228Z Progress (1): 6.4/17 kB
2026-10-02T13:28:32.5923384Z Progress (1): 10/17 kB 
2026-10-02T13:28:32.5923523Z Progress (1): 15/17 kB
2026-10-02T13:28:32.6361875Z Progress (1): 17 kB   
2026-10-02T13:28:32.6362083Z                    
2026-10-02T13:28:32.6362689Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-common/3.15.3/quarkus-devservices-common-3.15.3.jar (17 kB at 192 kB/s)
2026-10-02T13:28:32.6437180Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-mssql/3.15.3/quarkus-devservices-mssql-3.15.3.jar
2026-10-02T13:28:32.7112365Z Progress (1): 4.1/13 kB
2026-10-02T13:28:32.7112776Z Progress (1): 8.2/13 kB
2026-10-02T13:28:32.7112882Z Progress (1): 12/13 kB 
2026-10-02T13:28:32.7537246Z Progress (1): 13 kB   
2026-10-02T13:28:32.7537602Z                    
2026-10-02T13:28:32.7538218Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-mssql/3.15.3/quarkus-devservices-mssql-3.15.3.jar (13 kB at 120 kB/s)
2026-10-02T13:28:32.7656042Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql-deployment/3.15.3/quarkus-jdbc-mssql-deployment-3.15.3.jar
2026-10-02T13:28:32.8291647Z Progress (1): 4.1/10 kB
2026-10-02T13:28:32.8291826Z Progress (1): 7.7/10 kB
2026-10-02T13:28:32.8830107Z Progress (1): 10 kB    
2026-10-02T13:28:32.8830416Z                    
2026-10-02T13:28:32.8831073Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-jdbc-mssql-deployment/3.15.3/quarkus-jdbc-mssql-deployment-3.15.3.jar (10 kB at 87 kB/s)
2026-10-02T13:28:32.8880755Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-service-binding-spi/3.15.3/quarkus-kubernetes-service-binding-spi-3.15.3.jar
2026-10-02T13:28:32.9315550Z Progress (1): 4.1/8.7 kB
2026-10-02T13:28:32.9318074Z Progress (1): 7.7/8.7 kB
2026-10-02T13:28:32.9765783Z Progress (1): 8.7 kB    
2026-10-02T13:28:32.9765997Z                     
2026-10-02T13:28:32.9766652Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-kubernetes-service-binding-spi/3.15.3/quarkus-kubernetes-service-binding-spi-3.15.3.jar (8.7 kB at 99 kB/s)
2026-10-02T13:28:32.9867901Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-deployment/3.15.3/quarkus-devservices-deployment-3.15.3.jar
2026-10-02T13:28:33.0346504Z Progress (1): 4.1/23 kB
2026-10-02T13:28:33.0346722Z Progress (1): 7.7/23 kB
2026-10-02T13:28:33.0346890Z Progress (1): 12/23 kB 
2026-10-02T13:28:33.0347027Z Progress (1): 16/23 kB
2026-10-02T13:28:33.0347214Z Progress (1): 20/23 kB
2026-10-02T13:28:33.0738636Z Progress (1): 23 kB   
2026-10-02T13:28:33.0739241Z                    
2026-10-02T13:28:33.0740561Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-devservices-deployment/3.15.3/quarkus-devservices-deployment-3.15.3.jar (23 kB at 257 kB/s)
2026-10-02T13:28:33.0866410Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment/3.15.3/quarkus-datasource-deployment-3.15.3.jar
2026-10-02T13:28:33.1295364Z Progress (1): 4.1/23 kB
2026-10-02T13:28:33.1296165Z Progress (1): 8.2/23 kB
2026-10-02T13:28:33.1296414Z Progress (1): 12/23 kB 
2026-10-02T13:28:33.1296567Z Progress (1): 16/23 kB
2026-10-02T13:28:33.1296674Z Progress (1): 20/23 kB
2026-10-02T13:28:33.1687577Z Progress (1): 23 kB   
2026-10-02T13:28:33.1796031Z                    
2026-10-02T13:28:33.1860360Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-datasource-deployment/3.15.3/quarkus-datasource-deployment-3.15.3.jar (23 kB at 277 kB/s)
2026-10-02T13:28:33.1860963Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta-deployment/3.15.3/quarkus-narayana-jta-deployment-3.15.3.jar
2026-10-02T13:28:33.3934368Z Progress (1): 4.1/16 kB
2026-10-02T13:28:33.3934873Z Progress (1): 7.7/16 kB
2026-10-02T13:28:33.3935022Z Progress (1): 12/16 kB 
2026-10-02T13:28:33.3935263Z Progress (1): 16/16 kB
2026-10-02T13:28:33.4442746Z Progress (1): 16 kB   
2026-10-02T13:28:33.4442916Z                    
2026-10-02T13:28:33.4443852Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-narayana-jta-deployment/3.15.3/quarkus-narayana-jta-deployment-3.15.3.jar (16 kB at 63 kB/s)
2026-10-02T13:28:33.4504968Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-deployment/3.15.3/quarkus-agroal-deployment-3.15.3.jar
2026-10-02T13:28:33.5077342Z Progress (1): 4.1/20 kB
2026-10-02T13:28:33.5077916Z Progress (1): 7.7/20 kB
2026-10-02T13:28:33.5078128Z Progress (1): 12/20 kB 
2026-10-02T13:28:33.5078280Z Progress (1): 16/20 kB
2026-10-02T13:28:33.5581154Z Progress (1): 20 kB   
2026-10-02T13:28:33.5686352Z                    
2026-10-02T13:28:33.5796959Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-agroal-deployment/3.15.3/quarkus-agroal-deployment-3.15.3.jar (20 kB at 183 kB/s)
2026-10-02T13:28:33.5907016Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-deployment/3.15.3/quarkus-flyway-deployment-3.15.3.jar
2026-10-02T13:28:33.6203965Z Progress (1): 4.1/27 kB
2026-10-02T13:28:33.6204269Z Progress (1): 7.7/27 kB
2026-10-02T13:28:33.6204456Z Progress (1): 12/27 kB 
2026-10-02T13:28:33.6204714Z Progress (1): 16/27 kB
2026-10-02T13:28:33.6204856Z Progress (1): 20/27 kB
2026-10-02T13:28:33.6204962Z Progress (1): 24/27 kB
2026-10-02T13:28:33.6642669Z Progress (1): 27 kB   
2026-10-02T13:28:33.6643054Z                    
2026-10-02T13:28:33.6644657Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/quarkus-flyway-deployment/3.15.3/quarkus-flyway-deployment-3.15.3.jar (27 kB at 282 kB/s)
2026-10-02T13:28:33.6730482Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/platform/quarkus-bom-quarkus-platform-properties/3.15.3/quarkus-bom-quarkus-platform-properties-3.15.3.properties
2026-10-02T13:28:33.6877978Z Progress (1): 743 B
2026-10-02T13:28:33.6878295Z                    
2026-10-02T13:28:33.6878933Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/quarkus/platform/quarkus-bom-quarkus-platform-properties/3.15.3/quarkus-bom-quarkus-platform-properties-3.15.3.properties (743 B at 50 kB/s)
2026-10-02T13:28:34.1202295Z [INFO] 
2026-10-02T13:28:34.1203201Z [INFO] --- maven-compiler-plugin:3.14.0:compile (default-compile) @ siapo-movimentacao-micro ---
2026-10-02T13:28:34.1844855Z [INFO] Recompiling the module because of changed dependency.
2026-10-02T13:28:34.1900294Z [INFO] Compiling 10 source files with javac [debug parameters release 21] to target/classes
2026-10-02T13:28:34.8873805Z [INFO] 
2026-10-02T13:28:34.8874398Z [INFO] --- quarkus-maven-plugin:3.15.3:generate-code-tests (default) @ siapo-movimentacao-micro ---
2026-10-02T13:28:35.8457298Z [INFO] 
2026-10-02T13:28:35.8457879Z [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ siapo-movimentacao-micro ---
2026-10-02T13:28:35.8484660Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-10-02T13:28:35.8485159Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/35/s/src/test/resources
2026-10-02T13:28:35.8485291Z [INFO] 
2026-10-02T13:28:35.8485566Z [INFO] --- maven-compiler-plugin:3.14.0:testCompile (default-testCompile) @ siapo-movimentacao-micro ---
2026-10-02T13:28:35.8518733Z [INFO] No sources to compile
2026-10-02T13:28:35.8519018Z [INFO] 
2026-10-02T13:28:35.8519409Z [INFO] --- maven-surefire-plugin:3.5.2:test (default-test) @ siapo-movimentacao-micro ---
2026-10-02T13:28:35.8546493Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.5.2/surefire-api-3.5.2.pom
2026-10-02T13:28:35.8632182Z Progress (1): 3.5 kB
2026-10-02T13:28:35.8633021Z                     
2026-10-02T13:28:35.8633608Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.5.2/surefire-api-3.5.2.pom (3.5 kB at 392 kB/s)
2026-10-02T13:28:35.9054017Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.5.2/surefire-logger-api-3.5.2.pom
2026-10-02T13:28:35.9119782Z Progress (1): 3.3 kB
2026-10-02T13:28:35.9119974Z                     
2026-10-02T13:28:35.9120413Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.5.2/surefire-logger-api-3.5.2.pom (3.3 kB at 466 kB/s)
2026-10-02T13:28:35.9219470Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.5.2/surefire-shared-utils-3.5.2.pom
2026-10-02T13:28:35.9252043Z Progress (1): 4.1/4.7 kB
2026-10-02T13:28:35.9279714Z Progress (1): 4.7 kB    
2026-10-02T13:28:35.9280142Z                     
2026-10-02T13:28:35.9280772Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.5.2/surefire-shared-utils-3.5.2.pom (4.7 kB at 782 kB/s)
2026-10-02T13:28:35.9381914Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.5.2/surefire-extensions-api-3.5.2.pom
2026-10-02T13:28:35.9451364Z Progress (1): 3.5 kB
2026-10-02T13:28:35.9452144Z                     
2026-10-02T13:28:35.9452786Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.5.2/surefire-extensions-api-3.5.2.pom (3.5 kB at 503 kB/s)
2026-10-02T13:28:35.9668139Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.5.2/maven-surefire-common-3.5.2.pom
2026-10-02T13:28:35.9668437Z Progress (1): 4.1/7.8 kB
2026-10-02T13:28:35.9668753Z Progress (1): 7.7/7.8 kB
2026-10-02T13:28:35.9677652Z Progress (1): 7.8 kB    
2026-10-02T13:28:35.9677960Z                     
2026-10-02T13:28:35.9678320Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.5.2/maven-surefire-common-3.5.2.pom (7.8 kB at 1.1 MB/s)
2026-10-02T13:28:35.9743560Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.5.2/surefire-booter-3.5.2.pom
2026-10-02T13:28:35.9775352Z Progress (1): 4.1/4.8 kB
2026-10-02T13:28:35.9803408Z Progress (1): 4.8 kB    
2026-10-02T13:28:35.9803789Z                     
2026-10-02T13:28:35.9805063Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.5.2/surefire-booter-3.5.2.pom (4.8 kB at 805 kB/s)
2026-10-02T13:28:35.9905162Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.5.2/surefire-extensions-spi-3.5.2.pom
2026-10-02T13:28:35.9960018Z Progress (1): 1.8 kB
2026-10-02T13:28:35.9960516Z                     
2026-10-02T13:28:35.9961020Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.5.2/surefire-extensions-spi-3.5.2.pom (1.8 kB at 352 kB/s)
2026-10-02T13:28:36.0218087Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.3.0/plexus-java-1.3.0.pom
2026-10-02T13:28:36.0218560Z Progress (1): 4.1/14 kB
2026-10-02T13:28:36.0218961Z Progress (1): 7.7/14 kB
2026-10-02T13:28:36.0219228Z Progress (1): 12/14 kB 
2026-10-02T13:28:36.0219403Z Progress (1): 14 kB   
2026-10-02T13:28:36.0219617Z                    
2026-10-02T13:28:36.0220127Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.3.0/plexus-java-1.3.0.pom (14 kB at 2.3 MB/s)
2026-10-02T13:28:36.0327010Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.1.0/qdox-2.1.0.pom
2026-10-02T13:28:36.0327624Z Progress (1): 4.1/18 kB
2026-10-02T13:28:36.0328147Z Progress (1): 7.7/18 kB
2026-10-02T13:28:36.0328407Z Progress (1): 12/18 kB 
2026-10-02T13:28:36.0328552Z Progress (1): 16/18 kB
2026-10-02T13:28:36.0328846Z Progress (1): 18 kB   
2026-10-02T13:28:36.0329022Z                    
2026-10-02T13:28:36.0329748Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.1.0/qdox-2.1.0.pom (18 kB at 2.2 MB/s)
2026-10-02T13:28:36.0438257Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.5.2/surefire-api-3.5.2.jar
2026-10-02T13:28:36.0438852Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.5.2/surefire-logger-api-3.5.2.jar
2026-10-02T13:28:36.0439471Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.5.2/surefire-shared-utils-3.5.2.jar
2026-10-02T13:28:36.0439933Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.5.2/surefire-extensions-api-3.5.2.jar
2026-10-02T13:28:36.0440360Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.5.2/maven-surefire-common-3.5.2.jar
2026-10-02T13:28:36.0458312Z Progress (1): 4.1/171 kB
2026-10-02T13:28:36.0528733Z Progress (1): 7.7/171 kB
2026-10-02T13:28:36.0566465Z Progress (1): 12/171 kB 
2026-10-02T13:28:36.0571592Z Progress (1): 16/171 kB
2026-10-02T13:28:36.0579273Z Progress (1): 20/171 kB
2026-10-02T13:28:36.0579738Z Progress (1): 24/171 kB
2026-10-02T13:28:36.0580103Z Progress (1): 28/171 kB
2026-10-02T13:28:36.0580666Z Progress (1): 32/171 kB
2026-10-02T13:28:36.0581211Z Progress (1): 36/171 kB
2026-10-02T13:28:36.0581656Z Progress (1): 40/171 kB
2026-10-02T13:28:36.0581886Z Progress (1): 45/171 kB
2026-10-02T13:28:36.0582144Z Progress (1): 49/171 kB
2026-10-02T13:28:36.0582370Z Progress (1): 53/171 kB
2026-10-02T13:28:36.0582546Z Progress (1): 57/171 kB
2026-10-02T13:28:36.0582766Z Progress (1): 61/171 kB
2026-10-02T13:28:36.0582979Z Progress (1): 65/171 kB
2026-10-02T13:28:36.0583199Z Progress (1): 69/171 kB
2026-10-02T13:28:36.0583419Z Progress (1): 73/171 kB
2026-10-02T13:28:36.0583677Z Progress (1): 76/171 kB
2026-10-02T13:28:36.0584060Z Progress (1): 80/171 kB
2026-10-02T13:28:36.0584240Z Progress (1): 84/171 kB
2026-10-02T13:28:36.0584789Z Progress (1): 87/171 kB
2026-10-02T13:28:36.0585017Z Progress (1): 91/171 kB
2026-10-02T13:28:36.0585237Z Progress (1): 95/171 kB
2026-10-02T13:28:36.0585458Z Progress (1): 99/171 kB
2026-10-02T13:28:36.0585690Z Progress (2): 99/171 kB | 4.1/14 kB
2026-10-02T13:28:36.0585934Z Progress (2): 103/171 kB | 4.1/14 kB
2026-10-02T13:28:36.0586242Z Progress (2): 103/171 kB | 7.7/14 kB
2026-10-02T13:28:36.0586441Z Progress (2): 108/171 kB | 7.7/14 kB
2026-10-02T13:28:36.0586677Z Progress (2): 108/171 kB | 12/14 kB 
2026-10-02T13:28:36.0586921Z Progress (2): 112/171 kB | 12/14 kB
2026-10-02T13:28:36.0587145Z Progress (2): 116/171 kB | 12/14 kB
2026-10-02T13:28:36.0587400Z Progress (3): 116/171 kB | 12/14 kB | 4.1/311 kB
2026-10-02T13:28:36.0587670Z Progress (3): 120/171 kB | 12/14 kB | 4.1/311 kB
2026-10-02T13:28:36.0587938Z Progress (3): 124/171 kB | 12/14 kB | 4.1/311 kB
2026-10-02T13:28:36.0588213Z Progress (3): 124/171 kB | 12/14 kB | 8.2/311 kB
2026-10-02T13:28:36.0588431Z Progress (3): 128/171 kB | 12/14 kB | 8.2/311 kB
2026-10-02T13:28:36.0616507Z Progress (3): 128/171 kB | 12/14 kB | 12/311 kB 
2026-10-02T13:28:36.0617468Z Progress (4): 128/171 kB | 12/14 kB | 12/311 kB | 4.1/26 kB
2026-10-02T13:28:36.0617881Z Progress (4): 128/171 kB | 12/14 kB | 16/311 kB | 4.1/26 kB
2026-10-02T13:28:36.0618184Z Progress (4): 128/171 kB | 12/14 kB | 16/311 kB | 7.7/26 kB
2026-10-02T13:28:36.0618657Z Progress (4): 128/171 kB | 14 kB | 16/311 kB | 7.7/26 kB   
2026-10-02T13:28:36.0619228Z Progress (4): 128/171 kB | 14 kB | 16/311 kB | 12/26 kB 
2026-10-02T13:28:36.0619542Z Progress (4): 128/171 kB | 14 kB | 16/311 kB | 16/26 kB
2026-10-02T13:28:36.0619820Z Progress (4): 128/171 kB | 14 kB | 20/311 kB | 16/26 kB
2026-10-02T13:28:36.0632915Z Progress (4): 128/171 kB | 14 kB | 20/311 kB | 20/26 kB
2026-10-02T13:28:36.0633463Z Progress (5): 128/171 kB | 14 kB | 20/311 kB | 20/26 kB | 0/2.8 MB
2026-10-02T13:28:36.0633825Z Progress (5): 128/171 kB | 14 kB | 24/311 kB | 20/26 kB | 0/2.8 MB
2026-10-02T13:28:36.0634134Z Progress (5): 128/171 kB | 14 kB | 24/311 kB | 24/26 kB | 0/2.8 MB
2026-10-02T13:28:36.0634668Z Progress (5): 128/171 kB | 14 kB | 28/311 kB | 24/26 kB | 0/2.8 MB
2026-10-02T13:28:36.0634943Z Progress (5): 128/171 kB | 14 kB | 32/311 kB | 24/26 kB | 0/2.8 MB
2026-10-02T13:28:36.0635270Z Progress (5): 128/171 kB | 14 kB | 36/311 kB | 24/26 kB | 0/2.8 MB
2026-10-02T13:28:36.0635555Z Progress (5): 128/171 kB | 14 kB | 36/311 kB | 26 kB | 0/2.8 MB   
2026-10-02T13:28:36.0635833Z Progress (5): 128/171 kB | 14 kB | 41/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0636101Z Progress (5): 132/171 kB | 14 kB | 41/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0636331Z Progress (5): 132/171 kB | 14 kB | 45/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0636602Z Progress (5): 136/171 kB | 14 kB | 45/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0636875Z Progress (5): 136/171 kB | 14 kB | 49/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0637390Z Progress (5): 140/171 kB | 14 kB | 49/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0637689Z Progress (5): 140/171 kB | 14 kB | 53/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0637968Z Progress (5): 144/171 kB | 14 kB | 53/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0638230Z Progress (5): 144/171 kB | 14 kB | 57/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0638483Z Progress (5): 149/171 kB | 14 kB | 57/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0638751Z Progress (5): 149/171 kB | 14 kB | 61/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0639026Z Progress (5): 149/171 kB | 14 kB | 65/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0639249Z Progress (5): 149/171 kB | 14 kB | 69/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0639497Z Progress (5): 149/171 kB | 14 kB | 69/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0639813Z Progress (5): 153/171 kB | 14 kB | 69/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0640086Z Progress (5): 153/171 kB | 14 kB | 73/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0640364Z Progress (5): 157/171 kB | 14 kB | 73/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0640720Z Progress (5): 157/171 kB | 14 kB | 77/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0640987Z Progress (5): 161/171 kB | 14 kB | 77/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0641249Z Progress (5): 161/171 kB | 14 kB | 81/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0641514Z Progress (5): 161/171 kB | 14 kB | 86/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0641736Z Progress (5): 161/171 kB | 14 kB | 86/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0642002Z Progress (5): 161/171 kB | 14 kB | 90/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0642301Z Progress (5): 161/171 kB | 14 kB | 94/311 kB | 26 kB | 0/2.8 MB
2026-10-02T13:28:36.0642577Z Progress (5): 161/171 kB | 14 kB | 94/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0642856Z Progress (5): 161/171 kB | 14 kB | 94/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0643126Z Progress (5): 161/171 kB | 14 kB | 94/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0643899Z Progress (5): 165/171 kB | 14 kB | 94/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0644193Z Progress (5): 165/171 kB | 14 kB | 98/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0644455Z Progress (5): 169/171 kB | 14 kB | 98/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0644784Z Progress (5): 171 kB | 14 kB | 98/311 kB | 26 kB | 0.1/2.8 MB    
2026-10-02T13:28:36.0645085Z Progress (5): 171 kB | 14 kB | 102/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0645418Z Progress (5): 171 kB | 14 kB | 106/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0645686Z Progress (5): 171 kB | 14 kB | 110/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0645956Z Progress (5): 171 kB | 14 kB | 114/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0646232Z Progress (5): 171 kB | 14 kB | 118/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0646507Z Progress (5): 171 kB | 14 kB | 122/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0646770Z Progress (5): 171 kB | 14 kB | 127/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0647044Z Progress (5): 171 kB | 14 kB | 127/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0647276Z Progress (5): 171 kB | 14 kB | 131/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0647544Z Progress (5): 171 kB | 14 kB | 131/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0647846Z Progress (5): 171 kB | 14 kB | 131/311 kB | 26 kB | 0.1/2.8 MB
2026-10-02T13:28:36.0648097Z Progress (5): 171 kB | 14 kB | 131/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0648360Z Progress (5): 171 kB | 14 kB | 135/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0648622Z Progress (5): 171 kB | 14 kB | 135/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0648899Z Progress (5): 171 kB | 14 kB | 139/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0649170Z Progress (5): 171 kB | 14 kB | 143/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0649440Z Progress (5): 171 kB | 14 kB | 143/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0649660Z Progress (5): 171 kB | 14 kB | 147/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0650126Z Progress (5): 171 kB | 14 kB | 151/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0650576Z Progress (5): 171 kB | 14 kB | 155/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0650799Z Progress (5): 171 kB | 14 kB | 159/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0651063Z Progress (5): 171 kB | 14 kB | 163/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0651338Z Progress (5): 171 kB | 14 kB | 168/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0651602Z Progress (5): 171 kB | 14 kB | 172/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0651878Z Progress (5): 171 kB | 14 kB | 176/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0652150Z Progress (5): 171 kB | 14 kB | 180/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0652422Z Progress (5): 171 kB | 14 kB | 184/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0652722Z Progress (5): 171 kB | 14 kB | 188/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0652972Z Progress (5): 171 kB | 14 kB | 192/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0653192Z Progress (5): 171 kB | 14 kB | 196/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0653548Z Progress (5): 171 kB | 14 kB | 200/311 kB | 26 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0653775Z                                                               
2026-10-02T13:28:36.0654786Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-api/3.5.2/surefire-extensions-api-3.5.2.jar (26 kB at 2.9 MB/s)
2026-10-02T13:28:36.0655582Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.5.2/surefire-booter-3.5.2.jar
2026-10-02T13:28:36.0655954Z Progress (4): 171 kB | 14 kB | 200/311 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0656197Z                                                       
2026-10-02T13:28:36.0656799Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-logger-api/3.5.2/surefire-logger-api-3.5.2.jar (14 kB at 1.5 MB/s)
2026-10-02T13:28:36.0657500Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.5.2/surefire-extensions-spi-3.5.2.jar
2026-10-02T13:28:36.0657835Z Progress (3): 171 kB | 204/311 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0658110Z Progress (3): 171 kB | 204/311 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0658349Z Progress (3): 171 kB | 208/311 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0658522Z Progress (3): 171 kB | 213/311 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0658742Z Progress (3): 171 kB | 213/311 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0658951Z Progress (3): 171 kB | 217/311 kB | 0.2/2.8 MB
2026-10-02T13:28:36.0659160Z Progress (3): 171 kB | 217/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0659415Z Progress (3): 171 kB | 221/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0659638Z Progress (3): 171 kB | 225/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0659861Z Progress (3): 171 kB | 225/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0660050Z                                               
2026-10-02T13:28:36.0660506Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-api/3.5.2/surefire-api-3.5.2.jar (171 kB at 16 MB/s)
2026-10-02T13:28:36.0661080Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.3.0/plexus-java-1.3.0.jar
2026-10-02T13:28:36.0661452Z Progress (2): 229/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0661696Z Progress (2): 229/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0661938Z Progress (2): 233/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0662218Z Progress (2): 237/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0662463Z Progress (2): 241/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0662717Z Progress (2): 241/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0662954Z Progress (2): 245/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0663195Z Progress (2): 249/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0663391Z Progress (2): 249/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0663752Z Progress (2): 254/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0663997Z Progress (2): 258/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0664256Z Progress (2): 258/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0664639Z Progress (2): 262/311 kB | 0.3/2.8 MB
2026-10-02T13:28:36.0664914Z Progress (2): 262/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0665158Z Progress (2): 266/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0665398Z Progress (2): 270/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0665593Z Progress (2): 270/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0665835Z Progress (2): 274/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0666079Z Progress (2): 278/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0666315Z Progress (2): 278/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0666560Z Progress (2): 282/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0666846Z Progress (2): 286/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0667192Z Progress (2): 286/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0667396Z Progress (2): 290/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0667641Z Progress (2): 294/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0667883Z Progress (2): 299/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0668231Z Progress (2): 303/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0668464Z Progress (2): 307/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0668698Z Progress (2): 307/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0668947Z Progress (2): 311/311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0669183Z Progress (2): 311 kB | 0.4/2.8 MB    
2026-10-02T13:28:36.0669352Z Progress (2): 311 kB | 0.4/2.8 MB
2026-10-02T13:28:36.0669609Z Progress (2): 311 kB | 0.5/2.8 MB
2026-10-02T13:28:36.0669852Z Progress (2): 311 kB | 0.5/2.8 MB
2026-10-02T13:28:36.0670099Z Progress (2): 311 kB | 0.5/2.8 MB
2026-10-02T13:28:36.0670344Z Progress (2): 311 kB | 0.5/2.8 MB
2026-10-02T13:28:36.0670598Z Progress (2): 311 kB | 0.5/2.8 MB
2026-10-02T13:28:36.0728503Z Progress (2): 311 kB | 0.5/2.8 MB
2026-10-02T13:28:36.0728731Z Progress (2): 311 kB | 0.6/2.8 MB
2026-10-02T13:28:36.0728961Z Progress (2): 311 kB | 0.6/2.8 MB
2026-10-02T13:28:36.0729145Z Progress (2): 311 kB | 0.6/2.8 MB
2026-10-02T13:28:36.0729298Z Progress (2): 311 kB | 0.6/2.8 MB
2026-10-02T13:28:36.0729490Z Progress (2): 311 kB | 0.6/2.8 MB
2026-10-02T13:28:36.0729633Z Progress (2): 311 kB | 0.6/2.8 MB
2026-10-02T13:28:36.0729774Z Progress (2): 311 kB | 0.6/2.8 MB
2026-10-02T13:28:36.0729880Z Progress (2): 311 kB | 0.7/2.8 MB
2026-10-02T13:28:36.0730047Z Progress (2): 311 kB | 0.7/2.8 MB
2026-10-02T13:28:36.0730186Z Progress (2): 311 kB | 0.7/2.8 MB
2026-10-02T13:28:36.0730340Z Progress (2): 311 kB | 0.7/2.8 MB
2026-10-02T13:28:36.0730480Z Progress (2): 311 kB | 0.7/2.8 MB
2026-10-02T13:28:36.0730623Z Progress (2): 311 kB | 0.7/2.8 MB
2026-10-02T13:28:36.0730762Z Progress (2): 311 kB | 0.8/2.8 MB
2026-10-02T13:28:36.0730908Z Progress (2): 311 kB | 0.8/2.8 MB
2026-10-02T13:28:36.0731014Z Progress (2): 311 kB | 0.8/2.8 MB
2026-10-02T13:28:36.0731419Z Progress (2): 311 kB | 0.8/2.8 MB
2026-10-02T13:28:36.0731561Z Progress (2): 311 kB | 0.8/2.8 MB
2026-10-02T13:28:36.0731705Z Progress (2): 311 kB | 0.8/2.8 MB
2026-10-02T13:28:36.0732060Z Progress (3): 311 kB | 0.8/2.8 MB | 4.1/57 kB
2026-10-02T13:28:36.0732238Z Progress (3): 311 kB | 0.9/2.8 MB | 4.1/57 kB
2026-10-02T13:28:36.0732390Z Progress (3): 311 kB | 0.9/2.8 MB | 7.7/57 kB
2026-10-02T13:28:36.0732703Z Progress (3): 311 kB | 0.9/2.8 MB | 7.7/57 kB
2026-10-02T13:28:36.0732832Z Progress (3): 311 kB | 0.9/2.8 MB | 12/57 kB 
2026-10-02T13:28:36.0733012Z Progress (3): 311 kB | 0.9/2.8 MB | 16/57 kB
2026-10-02T13:28:36.0733168Z Progress (3): 311 kB | 0.9/2.8 MB | 20/57 kB
2026-10-02T13:28:36.0733321Z Progress (3): 311 kB | 0.9/2.8 MB | 20/57 kB
2026-10-02T13:28:36.0733507Z Progress (3): 311 kB | 0.9/2.8 MB | 24/57 kB
2026-10-02T13:28:36.0733663Z Progress (3): 311 kB | 0.9/2.8 MB | 28/57 kB
2026-10-02T13:28:36.0733815Z Progress (3): 311 kB | 0.9/2.8 MB | 28/57 kB
2026-10-02T13:28:36.0733972Z Progress (4): 311 kB | 0.9/2.8 MB | 28/57 kB | 4.1/118 kB
2026-10-02T13:28:36.0734108Z Progress (4): 311 kB | 0.9/2.8 MB | 28/57 kB | 4.1/118 kB
2026-10-02T13:28:36.0734471Z Progress (4): 311 kB | 0.9/2.8 MB | 32/57 kB | 4.1/118 kB
2026-10-02T13:28:36.0734761Z Progress (4): 311 kB | 0.9/2.8 MB | 32/57 kB | 7.7/118 kB
2026-10-02T13:28:36.0734922Z Progress (4): 311 kB | 0.9/2.8 MB | 32/57 kB | 7.7/118 kB
2026-10-02T13:28:36.0735095Z Progress (4): 311 kB | 0.9/2.8 MB | 36/57 kB | 7.7/118 kB
2026-10-02T13:28:36.0735258Z Progress (4): 311 kB | 0.9/2.8 MB | 36/57 kB | 12/118 kB 
2026-10-02T13:28:36.0735425Z Progress (4): 311 kB | 0.9/2.8 MB | 41/57 kB | 12/118 kB
2026-10-02T13:28:36.0735592Z Progress (4): 311 kB | 1.0/2.8 MB | 41/57 kB | 12/118 kB
2026-10-02T13:28:36.0735759Z Progress (4): 311 kB | 1.0/2.8 MB | 45/57 kB | 12/118 kB
2026-10-02T13:28:36.0735889Z Progress (4): 311 kB | 1.0/2.8 MB | 49/57 kB | 12/118 kB
2026-10-02T13:28:36.0736073Z Progress (4): 311 kB | 1.0/2.8 MB | 49/57 kB | 16/118 kB
2026-10-02T13:28:36.0736234Z Progress (4): 311 kB | 1.0/2.8 MB | 49/57 kB | 16/118 kB
2026-10-02T13:28:36.0736408Z Progress (4): 311 kB | 1.0/2.8 MB | 53/57 kB | 16/118 kB
2026-10-02T13:28:36.0736567Z Progress (4): 311 kB | 1.0/2.8 MB | 53/57 kB | 20/118 kB
2026-10-02T13:28:36.0736858Z Progress (4): 311 kB | 1.0/2.8 MB | 53/57 kB | 20/118 kB
2026-10-02T13:28:36.0737056Z Progress (4): 311 kB | 1.0/2.8 MB | 53/57 kB | 24/118 kB
2026-10-02T13:28:36.0737433Z Progress (4): 311 kB | 1.0/2.8 MB | 57/57 kB | 24/118 kB
2026-10-02T13:28:36.0737665Z Progress (4): 311 kB | 1.0/2.8 MB | 57/57 kB | 28/118 kB
2026-10-02T13:28:36.0737791Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 28/118 kB   
2026-10-02T13:28:36.0737950Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 32/118 kB
2026-10-02T13:28:36.0738130Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 32/118 kB
2026-10-02T13:28:36.0738293Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 36/118 kB
2026-10-02T13:28:36.0738469Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 40/118 kB
2026-10-02T13:28:36.0738628Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 45/118 kB
2026-10-02T13:28:36.0738786Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 45/118 kB
2026-10-02T13:28:36.0739083Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 49/118 kB
2026-10-02T13:28:36.0739249Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 53/118 kB
2026-10-02T13:28:36.0739374Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 57/118 kB
2026-10-02T13:28:36.0739541Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 61/118 kB
2026-10-02T13:28:36.0739696Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 65/118 kB
2026-10-02T13:28:36.0739881Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 69/118 kB
2026-10-02T13:28:36.0740035Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 73/118 kB
2026-10-02T13:28:36.0740189Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 77/118 kB
2026-10-02T13:28:36.0740339Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 81/118 kB
2026-10-02T13:28:36.0740490Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 86/118 kB
2026-10-02T13:28:36.0740609Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 90/118 kB
2026-10-02T13:28:36.0740767Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 94/118 kB
2026-10-02T13:28:36.0740935Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 94/118 kB
2026-10-02T13:28:36.0741113Z Progress (4): 311 kB | 1.0/2.8 MB | 57 kB | 98/118 kB
2026-10-02T13:28:36.0741272Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 98/118 kB
2026-10-02T13:28:36.0741430Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 98/118 kB
2026-10-02T13:28:36.0741722Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 98/118 kB
2026-10-02T13:28:36.0741884Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 98/118 kB
2026-10-02T13:28:36.0742040Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 102/118 kB
2026-10-02T13:28:36.0742169Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 106/118 kB
2026-10-02T13:28:36.0742344Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 106/118 kB
2026-10-02T13:28:36.0742505Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 110/118 kB
2026-10-02T13:28:36.0742683Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 114/118 kB
2026-10-02T13:28:36.0742842Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 114/118 kB
2026-10-02T13:28:36.0743069Z Progress (4): 311 kB | 1.1/2.8 MB | 57 kB | 118 kB    
2026-10-02T13:28:36.0743947Z Progress (4): 311 kB | 1.2/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0744206Z Progress (4): 311 kB | 1.2/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0744453Z Progress (4): 311 kB | 1.2/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0744757Z Progress (4): 311 kB | 1.2/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0744914Z Progress (4): 311 kB | 1.2/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0745102Z Progress (4): 311 kB | 1.2/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0745254Z Progress (4): 311 kB | 1.3/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0745372Z Progress (4): 311 kB | 1.3/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0745520Z Progress (4): 311 kB | 1.3/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0745675Z Progress (4): 311 kB | 1.3/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0745828Z Progress (4): 311 kB | 1.3/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0745987Z Progress (4): 311 kB | 1.3/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0746141Z Progress (4): 311 kB | 1.4/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0746296Z Progress (4): 311 kB | 1.4/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0746560Z Progress (4): 311 kB | 1.4/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0746709Z Progress (4): 311 kB | 1.4/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0746824Z Progress (4): 311 kB | 1.4/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0746974Z Progress (4): 311 kB | 1.4/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0747131Z Progress (4): 311 kB | 1.5/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0747296Z Progress (4): 311 kB | 1.5/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0747446Z Progress (4): 311 kB | 1.5/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0747595Z Progress (4): 311 kB | 1.5/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0747745Z Progress (4): 311 kB | 1.5/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0747932Z Progress (4): 311 kB | 1.5/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0748049Z Progress (4): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0748258Z Progress (4): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0748484Z Progress (4): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0748692Z Progress (4): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB
2026-10-02T13:28:36.0748857Z Progress (5): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB | 4.1/8.2 kB
2026-10-02T13:28:36.0749026Z Progress (5): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB | 4.1/8.2 kB
2026-10-02T13:28:36.0749190Z Progress (5): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB | 7.7/8.2 kB
2026-10-02T13:28:36.0749419Z Progress (5): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB | 7.7/8.2 kB
2026-10-02T13:28:36.0749607Z Progress (5): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB | 8.2 kB    
2026-10-02T13:28:36.0749739Z Progress (5): 311 kB | 1.6/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0749909Z Progress (5): 311 kB | 1.7/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0750077Z Progress (5): 311 kB | 1.7/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0750253Z Progress (5): 311 kB | 1.7/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0750417Z Progress (5): 311 kB | 1.7/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0750580Z Progress (5): 311 kB | 1.7/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0750736Z Progress (5): 311 kB | 1.7/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0750892Z Progress (5): 311 kB | 1.8/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0751068Z Progress (5): 311 kB | 1.8/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0751193Z Progress (5): 311 kB | 1.8/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0751351Z Progress (5): 311 kB | 1.8/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0751524Z Progress (5): 311 kB | 1.8/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0751686Z Progress (5): 311 kB | 1.8/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0751849Z Progress (5): 311 kB | 1.9/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0752013Z Progress (5): 311 kB | 1.9/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0752225Z Progress (5): 311 kB | 1.9/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0752381Z Progress (5): 311 kB | 1.9/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0752556Z Progress (5): 311 kB | 1.9/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0752679Z Progress (5): 311 kB | 1.9/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0752852Z Progress (5): 311 kB | 2.0/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0753010Z Progress (5): 311 kB | 2.0/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0753170Z Progress (5): 311 kB | 2.0/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0753326Z Progress (5): 311 kB | 2.0/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0753482Z Progress (5): 311 kB | 2.0/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0753638Z Progress (5): 311 kB | 2.0/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0753793Z Progress (5): 311 kB | 2.1/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0753969Z Progress (5): 311 kB | 2.1/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0754096Z Progress (5): 311 kB | 2.1/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0754297Z Progress (5): 311 kB | 2.1/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0754462Z Progress (5): 311 kB | 2.1/2.8 MB | 57 kB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0754687Z                                                            
2026-10-02T13:28:36.0755265Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/codehaus/plexus/plexus-java/1.3.0/plexus-java-1.3.0.jar (57 kB at 2.3 MB/s)
2026-10-02T13:28:36.0755496Z Progress (4): 311 kB | 2.1/2.8 MB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0755647Z                                                    
2026-10-02T13:28:36.0756050Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.1.0/qdox-2.1.0.jar
2026-10-02T13:28:36.0756304Z Progress (4): 311 kB | 2.2/2.8 MB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0756543Z Progress (4): 311 kB | 2.2/2.8 MB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0756730Z Progress (4): 311 kB | 2.2/2.8 MB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0756957Z Progress (4): 311 kB | 2.2/2.8 MB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0757170Z Progress (4): 311 kB | 2.2/2.8 MB | 118 kB | 8.2 kB
2026-10-02T13:28:36.0757350Z                                                    
2026-10-02T13:28:36.0757786Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-booter/3.5.2/surefire-booter-3.5.2.jar (118 kB at 4.7 MB/s)
2026-10-02T13:28:36.0766116Z Progress (3): 311 kB | 2.2/2.8 MB | 8.2 kB
2026-10-02T13:28:36.0766300Z Progress (3): 311 kB | 2.3/2.8 MB | 8.2 kB
2026-10-02T13:28:36.0766469Z Progress (3): 311 kB | 2.3/2.8 MB | 8.2 kB
2026-10-02T13:28:36.0766612Z                                           
2026-10-02T13:28:36.0767057Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/maven-surefire-common/3.5.2/maven-surefire-common-3.5.2.jar (311 kB at 12 MB/s)
2026-10-02T13:28:36.0767296Z Progress (2): 2.3/2.8 MB | 8.2 kB
2026-10-02T13:28:36.0767444Z                                  
2026-10-02T13:28:36.0767787Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-extensions-spi/3.5.2/surefire-extensions-spi-3.5.2.jar (8.2 kB at 315 kB/s)
2026-10-02T13:28:36.0768048Z Progress (1): 2.3/2.8 MB
2026-10-02T13:28:36.0768237Z Progress (1): 2.3/2.8 MB
2026-10-02T13:28:36.0768414Z Progress (1): 2.3/2.8 MB
2026-10-02T13:28:36.0768583Z Progress (1): 2.4/2.8 MB
2026-10-02T13:28:36.0768782Z Progress (1): 2.4/2.8 MB
2026-10-02T13:28:36.0768951Z Progress (1): 2.4/2.8 MB
2026-10-02T13:28:36.0769122Z Progress (1): 2.4/2.8 MB
2026-10-02T13:28:36.0769259Z Progress (1): 2.4/2.8 MB
2026-10-02T13:28:36.0769396Z Progress (1): 2.4/2.8 MB
2026-10-02T13:28:36.0769608Z Progress (1): 2.5/2.8 MB
2026-10-02T13:28:36.0769787Z Progress (1): 2.5/2.8 MB
2026-10-02T13:28:36.0769921Z Progress (1): 2.5/2.8 MB
2026-10-02T13:28:36.0770144Z Progress (1): 2.5/2.8 MB
2026-10-02T13:28:36.0770281Z Progress (1): 2.5/2.8 MB
2026-10-02T13:28:36.0770418Z Progress (1): 2.5/2.8 MB
2026-10-02T13:28:36.0770569Z Progress (1): 2.6/2.8 MB
2026-10-02T13:28:36.0770706Z Progress (1): 2.6/2.8 MB
2026-10-02T13:28:36.0770842Z Progress (1): 2.6/2.8 MB
2026-10-02T13:28:36.0771068Z Progress (1): 2.6/2.8 MB
2026-10-02T13:28:36.0771212Z Progress (1): 2.6/2.8 MB
2026-10-02T13:28:36.0771311Z Progress (1): 2.6/2.8 MB
2026-10-02T13:28:36.0771445Z Progress (1): 2.6/2.8 MB
2026-10-02T13:28:36.0771587Z Progress (2): 2.6/2.8 MB | 4.1/348 kB
2026-10-02T13:28:36.0771740Z Progress (2): 2.7/2.8 MB | 4.1/348 kB
2026-10-02T13:28:36.0771889Z Progress (2): 2.7/2.8 MB | 7.7/348 kB
2026-10-02T13:28:36.0772034Z Progress (2): 2.7/2.8 MB | 7.7/348 kB
2026-10-02T13:28:36.0772187Z Progress (2): 2.7/2.8 MB | 12/348 kB 
2026-10-02T13:28:36.0772364Z Progress (2): 2.7/2.8 MB | 16/348 kB
2026-10-02T13:28:36.0772572Z Progress (2): 2.7/2.8 MB | 16/348 kB
2026-10-02T13:28:36.0772723Z Progress (2): 2.7/2.8 MB | 20/348 kB
2026-10-02T13:28:36.0772937Z Progress (2): 2.7/2.8 MB | 24/348 kB
2026-10-02T13:28:36.0773160Z Progress (2): 2.7/2.8 MB | 24/348 kB
2026-10-02T13:28:36.0773305Z Progress (2): 2.7/2.8 MB | 28/348 kB
2026-10-02T13:28:36.0773446Z Progress (2): 2.7/2.8 MB | 32/348 kB
2026-10-02T13:28:36.0773590Z Progress (2): 2.7/2.8 MB | 32/348 kB
2026-10-02T13:28:36.0773696Z Progress (2): 2.7/2.8 MB | 36/348 kB
2026-10-02T13:28:36.0773850Z Progress (2): 2.7/2.8 MB | 40/348 kB
2026-10-02T13:28:36.0774017Z Progress (2): 2.7/2.8 MB | 40/348 kB
2026-10-02T13:28:36.0774159Z Progress (2): 2.7/2.8 MB | 45/348 kB
2026-10-02T13:28:36.0774301Z Progress (2): 2.7/2.8 MB | 49/348 kB
2026-10-02T13:28:36.0774614Z Progress (2): 2.8/2.8 MB | 49/348 kB
2026-10-02T13:28:36.0774782Z Progress (2): 2.8/2.8 MB | 53/348 kB
2026-10-02T13:28:36.0774928Z Progress (2): 2.8/2.8 MB | 53/348 kB
2026-10-02T13:28:36.0775035Z Progress (2): 2.8/2.8 MB | 57/348 kB
2026-10-02T13:28:36.0775195Z Progress (2): 2.8/2.8 MB | 61/348 kB
2026-10-02T13:28:36.0775346Z Progress (2): 2.8/2.8 MB | 61/348 kB
2026-10-02T13:28:36.0775514Z Progress (2): 2.8/2.8 MB | 65/348 kB
2026-10-02T13:28:36.0775659Z Progress (2): 2.8/2.8 MB | 69/348 kB
2026-10-02T13:28:36.0775799Z Progress (2): 2.8/2.8 MB | 69/348 kB
2026-10-02T13:28:36.0775974Z Progress (2): 2.8/2.8 MB | 73/348 kB
2026-10-02T13:28:36.0776149Z Progress (2): 2.8 MB | 73/348 kB    
2026-10-02T13:28:36.0776259Z Progress (2): 2.8 MB | 77/348 kB
2026-10-02T13:28:36.0776402Z Progress (2): 2.8 MB | 81/348 kB
2026-10-02T13:28:36.0776554Z Progress (2): 2.8 MB | 86/348 kB
2026-10-02T13:28:36.0776697Z Progress (2): 2.8 MB | 90/348 kB
2026-10-02T13:28:36.0776853Z Progress (2): 2.8 MB | 94/348 kB
2026-10-02T13:28:36.0776993Z Progress (2): 2.8 MB | 98/348 kB
2026-10-02T13:28:36.0777136Z Progress (2): 2.8 MB | 102/348 kB
2026-10-02T13:28:36.0777245Z Progress (2): 2.8 MB | 106/348 kB
2026-10-02T13:28:36.0777388Z Progress (2): 2.8 MB | 110/348 kB
2026-10-02T13:28:36.0777531Z Progress (2): 2.8 MB | 113/348 kB
2026-10-02T13:28:36.0777687Z Progress (2): 2.8 MB | 118/348 kB
2026-10-02T13:28:36.0777832Z Progress (2): 2.8 MB | 122/348 kB
2026-10-02T13:28:36.0777972Z Progress (2): 2.8 MB | 126/348 kB
2026-10-02T13:28:36.0778261Z Progress (2): 2.8 MB | 130/348 kB
2026-10-02T13:28:36.0778403Z Progress (2): 2.8 MB | 134/348 kB
2026-10-02T13:28:36.0778511Z Progress (2): 2.8 MB | 138/348 kB
2026-10-02T13:28:36.0778651Z Progress (2): 2.8 MB | 142/348 kB
2026-10-02T13:28:36.0778793Z Progress (2): 2.8 MB | 146/348 kB
2026-10-02T13:28:36.0778933Z Progress (2): 2.8 MB | 150/348 kB
2026-10-02T13:28:36.0779114Z Progress (2): 2.8 MB | 154/348 kB
2026-10-02T13:28:36.0779390Z Progress (2): 2.8 MB | 159/348 kB
2026-10-02T13:28:36.0779550Z Progress (2): 2.8 MB | 163/348 kB
2026-10-02T13:28:36.0779689Z Progress (2): 2.8 MB | 167/348 kB
2026-10-02T13:28:36.0779793Z Progress (2): 2.8 MB | 171/348 kB
2026-10-02T13:28:36.0779932Z Progress (2): 2.8 MB | 175/348 kB
2026-10-02T13:28:36.0780895Z Progress (2): 2.8 MB | 179/348 kB
2026-10-02T13:28:36.0781149Z Progress (2): 2.8 MB | 183/348 kB
2026-10-02T13:28:36.0781347Z Progress (2): 2.8 MB | 187/348 kB
2026-10-02T13:28:36.0781550Z Progress (2): 2.8 MB | 191/348 kB
2026-10-02T13:28:36.0781809Z Progress (2): 2.8 MB | 195/348 kB
2026-10-02T13:28:36.0781919Z Progress (2): 2.8 MB | 199/348 kB
2026-10-02T13:28:36.0782077Z Progress (2): 2.8 MB | 204/348 kB
2026-10-02T13:28:36.0782285Z Progress (2): 2.8 MB | 208/348 kB
2026-10-02T13:28:36.0782428Z Progress (2): 2.8 MB | 212/348 kB
2026-10-02T13:28:36.0782564Z Progress (2): 2.8 MB | 216/348 kB
2026-10-02T13:28:36.0782711Z Progress (2): 2.8 MB | 220/348 kB
2026-10-02T13:28:36.0782855Z Progress (2): 2.8 MB | 224/348 kB
2026-10-02T13:28:36.0782992Z Progress (2): 2.8 MB | 228/348 kB
2026-10-02T13:28:36.0783105Z Progress (2): 2.8 MB | 232/348 kB
2026-10-02T13:28:36.0783320Z Progress (2): 2.8 MB | 236/348 kB
2026-10-02T13:28:36.0783518Z Progress (2): 2.8 MB | 240/348 kB
2026-10-02T13:28:36.0783692Z Progress (2): 2.8 MB | 245/348 kB
2026-10-02T13:28:36.0783851Z Progress (2): 2.8 MB | 249/348 kB
2026-10-02T13:28:36.0784063Z Progress (2): 2.8 MB | 253/348 kB
2026-10-02T13:28:36.0784259Z Progress (2): 2.8 MB | 257/348 kB
2026-10-02T13:28:36.0784400Z Progress (2): 2.8 MB | 261/348 kB
2026-10-02T13:28:36.0784577Z Progress (2): 2.8 MB | 265/348 kB
2026-10-02T13:28:36.0784729Z Progress (2): 2.8 MB | 269/348 kB
2026-10-02T13:28:36.0784887Z Progress (2): 2.8 MB | 273/348 kB
2026-10-02T13:28:36.0785029Z Progress (2): 2.8 MB | 277/348 kB
2026-10-02T13:28:36.0785212Z Progress (2): 2.8 MB | 281/348 kB
2026-10-02T13:28:36.0785363Z Progress (2): 2.8 MB | 286/348 kB
2026-10-02T13:28:36.0785502Z Progress (2): 2.8 MB | 290/348 kB
2026-10-02T13:28:36.0785640Z Progress (2): 2.8 MB | 294/348 kB
2026-10-02T13:28:36.0785788Z Progress (2): 2.8 MB | 298/348 kB
2026-10-02T13:28:36.0785961Z Progress (2): 2.8 MB | 302/348 kB
2026-10-02T13:28:36.0786099Z Progress (2): 2.8 MB | 306/348 kB
2026-10-02T13:28:36.0786252Z Progress (2): 2.8 MB | 310/348 kB
2026-10-02T13:28:36.0786390Z Progress (2): 2.8 MB | 314/348 kB
2026-10-02T13:28:36.0786529Z Progress (2): 2.8 MB | 318/348 kB
2026-10-02T13:28:36.0786674Z Progress (2): 2.8 MB | 322/348 kB
2026-10-02T13:28:36.0786810Z Progress (2): 2.8 MB | 326/348 kB
2026-10-02T13:28:36.0786914Z Progress (2): 2.8 MB | 331/348 kB
2026-10-02T13:28:36.0787052Z Progress (2): 2.8 MB | 335/348 kB
2026-10-02T13:28:36.0787187Z Progress (2): 2.8 MB | 339/348 kB
2026-10-02T13:28:36.0787354Z Progress (2): 2.8 MB | 343/348 kB
2026-10-02T13:28:36.0787564Z Progress (2): 2.8 MB | 347/348 kB
2026-10-02T13:28:36.0787701Z Progress (2): 2.8 MB | 348 kB    
2026-10-02T13:28:36.0787893Z                              
2026-10-02T13:28:36.0788356Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/org/apache/maven/surefire/surefire-shared-utils/3.5.2/surefire-shared-utils-3.5.2.jar (2.8 MB at 81 MB/s)
2026-10-02T13:28:36.0788756Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/com/thoughtworks/qdox/qdox/2.1.0/qdox-2.1.0.jar (348 kB at 9.7 MB/s)
2026-10-02T13:28:36.2154489Z [INFO] No tests to run.
2026-10-02T13:28:36.2203063Z [INFO] 
2026-10-02T13:28:36.2209207Z [INFO] --- jacoco-maven-plugin:0.8.13:report (report) @ siapo-movimentacao-micro ---
2026-10-02T13:28:36.2226500Z [INFO] Skipping JaCoCo execution due to missing execution data file.
2026-10-02T13:28:36.2226791Z [INFO] 
2026-10-02T13:28:36.2227171Z [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ siapo-movimentacao-micro ---
2026-10-02T13:28:36.2895783Z [INFO] Building jar: /opt/ads-agent/_work/35/s/target/siapo-movimentacao-micro-1.0.0-SNAPSHOT.jar
2026-10-02T13:28:36.2988107Z [INFO] 
2026-10-02T13:28:36.2988633Z [INFO] --- quarkus-maven-plugin:3.15.3:build (default) @ siapo-movimentacao-micro ---
2026-10-02T13:28:38.2627386Z [INFO] ------------------------------------------------------------------------
2026-10-02T13:28:38.2627915Z [INFO] BUILD FAILURE
2026-10-02T13:28:38.2628310Z [INFO] ------------------------------------------------------------------------
2026-10-02T13:28:38.2636949Z [INFO] Total time:  21.563 s
2026-10-02T13:28:38.2638648Z [INFO] Finished at: 2026-10-02T10:28:38-03:00
2026-10-02T13:28:38.2639074Z [INFO] ------------------------------------------------------------------------
2026-10-02T13:28:38.2663456Z [ERROR] Failed to execute goal io.quarkus.platform:quarkus-maven-plugin:3.15.3:build (default) on project siapo-movimentacao-micro: Failed to build quarkus application: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
2026-10-02T13:28:38.2664046Z [ERROR] 	[error]: Build step io.quarkus.arc.deployment.ArcProcessor#validate threw an exception: jakarta.enterprise.inject.spi.DeploymentException: jakarta.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type br.gov.caixa.siapo.movimentacao.application.ProcessamentoSisfinService and qualifiers [@Default]
2026-10-02T13:28:38.2664442Z [ERROR] 	- injection target: br.gov.caixa.siapo.movimentacao.api.ProcessamentoResource#sisfinService
2026-10-02T13:28:38.2668102Z [ERROR] 	- declared on CLASS bean [types=[java.lang.Object, br.gov.caixa.siapo.movimentacao.api.ProcessamentoResource], qualifiers=[@Default, @Any], target=br.gov.caixa.siapo.movimentacao.api.ProcessamentoResource]
2026-10-02T13:28:38.2668598Z [ERROR] 	The following classes match by type, but have been skipped during discovery:
2026-10-02T13:28:38.2668907Z [ERROR] 	- br.gov.caixa.siapo.movimentacao.application.ProcessamentoSisfinService has no bean defining annotation (scope, stereotype, etc.)
2026-10-02T13:28:38.2669089Z [ERROR] 
2026-10-02T13:28:38.2669182Z [ERROR] 
2026-10-02T13:28:38.2669372Z [ERROR] 	at io.quarkus.arc.processor.BeanDeployment.processErrors(BeanDeployment.java:1551)
2026-10-02T13:28:38.2669616Z [ERROR] 	at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:338)
2026-10-02T13:28:38.2669837Z [ERROR] 	at io.quarkus.arc.processor.BeanProcessor.initialize(BeanProcessor.java:167)
2026-10-02T13:28:38.2670054Z [ERROR] 	at io.quarkus.arc.deployment.ArcProcessor.validate(ArcProcessor.java:490)
2026-10-02T13:28:38.2670307Z [ERROR] 	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:733)
2026-10-02T13:28:38.2670533Z [ERROR] 	at io.quarkus.deployment.ExtensionLoader$3.execute(ExtensionLoader.java:856)
2026-10-02T13:28:38.2670749Z [ERROR] 	at io.quarkus.builder.BuildContext.run(BuildContext.java:256)
2026-10-02T13:28:38.2670966Z [ERROR] 	at org.jboss.threads.ContextHandler$1.runWith(ContextHandler.java:18)
2026-10-02T13:28:38.2671194Z [ERROR] 	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2516)
2026-10-02T13:28:38.2671441Z [ERROR] 	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2495)
2026-10-02T13:28:38.2671639Z [ERROR] 	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1521)
2026-10-02T13:28:38.2671849Z [ERROR] 	at java.base/java.lang.Thread.run(Thread.java:1583)
2026-10-02T13:28:38.2672049Z [ERROR] 	at org.jboss.threads.JBossThread.run(JBossThread.java:483)
2026-10-02T13:28:38.2672498Z [ERROR] Caused by: jakarta.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type br.gov.caixa.siapo.movimentacao.application.ProcessamentoSisfinService and qualifiers [@Default]
2026-10-02T13:28:38.2672861Z [ERROR] 	- injection target: br.gov.caixa.siapo.movimentacao.api.ProcessamentoResource#sisfinService
2026-10-02T13:28:38.2673242Z [ERROR] 	- declared on CLASS bean [types=[java.lang.Object, br.gov.caixa.siapo.movimentacao.api.ProcessamentoResource], qualifiers=[@Default, @Any], target=br.gov.caixa.siapo.movimentacao.api.ProcessamentoResource]
2026-10-02T13:28:38.2673496Z [ERROR] 	The following classes match by type, but have been skipped during discovery:
2026-10-02T13:28:38.2673814Z [ERROR] 	- br.gov.caixa.siapo.movimentacao.application.ProcessamentoSisfinService has no bean defining annotation (scope, stereotype, etc.)
2026-10-02T13:28:38.2673996Z [ERROR] 
2026-10-02T13:28:38.2674121Z [ERROR] 
2026-10-02T13:28:38.2674292Z [ERROR] 	at io.quarkus.arc.processor.Beans.resolveInjectionPoint(Beans.java:545)
2026-10-02T13:28:38.2674745Z [ERROR] 	at io.quarkus.arc.processor.BeanInfo.init(BeanInfo.java:677)
2026-10-02T13:28:38.2674990Z [ERROR] 	at io.quarkus.arc.processor.BeanDeployment.init(BeanDeployment.java:323)
2026-10-02T13:28:38.2675163Z [ERROR] 	... 11 more
2026-10-02T13:28:38.2675341Z [ERROR] -> [Help 1]
2026-10-02T13:28:38.2675481Z [ERROR] 
2026-10-02T13:28:38.2675706Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-10-02T13:28:38.2675951Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-10-02T13:28:38.2676105Z [ERROR] 
2026-10-02T13:28:38.2676275Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-10-02T13:28:38.2676447Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
2026-10-02T13:28:38.3352939Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-10-02T13:28:38.3353298Z Could not retrieve code analysis results - Maven run failed.
2026-10-02T13:28:38.3381525Z ##[error]Build failed.
2026-10-02T13:28:38.3459512Z ##[section]Finishing: Maven
