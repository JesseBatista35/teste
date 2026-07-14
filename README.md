2026-07-14T20:34:33.9295399Z ##[section]Starting: Maven
2026-07-14T20:34:33.9299890Z ==============================================================================
2026-07-14T20:34:33.9299976Z Task         : Maven
2026-07-14T20:34:33.9300033Z Description  : Build, test, and deploy with Apache Maven
2026-07-14T20:34:33.9300094Z Version      : 4.225.0
2026-07-14T20:34:33.9300155Z Author       : Microsoft Corporation
2026-07-14T20:34:33.9300206Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-07-14T20:34:33.9300277Z ==============================================================================
2026-07-14T20:34:34.5273156Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-07-14T20:34:34.6543757Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-07-14T20:34:34.6544377Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-07-14T20:34:34.6544794Z Java version: 1.8.0_221, vendor: Oracle Corporation, runtime: /usr/java/jdk1.8.0_221/jre
2026-07-14T20:34:34.6545192Z Default locale: pt_BR, platform encoding: UTF-8
2026-07-14T20:34:34.6584524Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-07-14T20:34:34.6639263Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/9141/s/pom.xml clean compile install -Drevision=770955
2026-07-14T20:34:35.4639153Z [INFO] Scanning for projects...
2026-07-14T20:34:35.5193264Z [WARNING] 
2026-07-14T20:34:35.5194014Z [WARNING] Some problems were encountered while building the effective model for br.gov.caixa.dict:simpi-dict-ear:ear:770955
2026-07-14T20:34:35.5194710Z [WARNING] 'build.plugins.plugin.version' for org.jboss.as.plugins:jboss-as-maven-plugin is missing. @ br.gov.caixa.dict:simpi-dict-ear:${revision}, /opt/ads-agent/_work/9141/s/simpi-dict-ear/pom.xml, line 49, column 12
2026-07-14T20:34:35.5195116Z [WARNING] 
2026-07-14T20:34:35.5195329Z [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
2026-07-14T20:34:35.5195560Z [WARNING] 
2026-07-14T20:34:35.5195764Z [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
2026-07-14T20:34:35.5196233Z [WARNING] 
2026-07-14T20:34:35.5197685Z [INFO] ------------------------------------------------------------------------
2026-07-14T20:34:35.5197891Z [INFO] Reactor Build Order:
2026-07-14T20:34:35.5198056Z [INFO] 
2026-07-14T20:34:35.5216864Z [INFO] simpi-dict                                                         [pom]
2026-07-14T20:34:35.5217289Z [INFO] simpi-dict-ejb                                                     [ejb]
2026-07-14T20:34:35.5217671Z [INFO] simpi-dict-war                                                     [war]
2026-07-14T20:34:35.5218061Z [INFO] simpi-dict-ear                                                     [ear]
2026-07-14T20:34:35.5306951Z [INFO] 
2026-07-14T20:34:35.5307656Z [INFO] --------------------< br.gov.caixa.dict:simpi-dict >--------------------
2026-07-14T20:34:35.5308080Z [INFO] Building simpi-dict 770955                                         [1/4]
2026-07-14T20:34:35.5308516Z [INFO] --------------------------------[ pom ]---------------------------------
2026-07-14T20:34:35.6165087Z [INFO] 
2026-07-14T20:34:35.6165803Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ simpi-dict ---
2026-07-14T20:34:35.6868148Z [INFO] 
2026-07-14T20:34:35.6868941Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict ---
2026-07-14T20:34:35.9091781Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/target/jacoco.exec
2026-07-14T20:34:35.9092403Z [INFO] 
2026-07-14T20:34:35.9093816Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict ---
2026-07-14T20:34:35.9099310Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/target/jacoco.exec
2026-07-14T20:34:35.9100232Z [INFO] 
2026-07-14T20:34:35.9102219Z [INFO] --- jacoco-maven-plugin:0.8.12:report (report) @ simpi-dict ---
2026-07-14T20:34:35.9123525Z [INFO] Skipping JaCoCo execution due to missing execution data file.
2026-07-14T20:34:35.9124032Z [INFO] 
2026-07-14T20:34:35.9124333Z [INFO] --- maven-install-plugin:2.4:install (default-install) @ simpi-dict ---
2026-07-14T20:34:35.9619072Z [INFO] Installing /opt/ads-agent/_work/9141/s/pom.xml to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/simpi-dict/770955/simpi-dict-770955.pom
2026-07-14T20:34:35.9860767Z [INFO] 
2026-07-14T20:34:35.9861510Z [INFO] ------------------< br.gov.caixa.dict:simpi-dict-ejb >------------------
2026-07-14T20:34:35.9861941Z [INFO] Building simpi-dict-ejb 770955                                     [2/4]
2026-07-14T20:34:35.9862322Z [INFO] --------------------------------[ ejb ]---------------------------------
2026-07-14T20:34:36.7343222Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/dinamonetworks/sdk/dinamo-hsm/4.26.0/dinamo-hsm-4.26.0.pom
2026-07-14T20:34:36.7820274Z Progress (1): 1.2 kB
2026-07-14T20:34:36.7820930Z                     
2026-07-14T20:34:36.7822690Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/dinamonetworks/sdk/dinamo-hsm/4.26.0/dinamo-hsm-4.26.0.pom (1.2 kB at 23 kB/s)
2026-07-14T20:34:36.9359165Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/dinamonetworks/sdk/dinamo-hsm/4.26.0/dinamo-hsm-4.26.0.jar
2026-07-14T20:34:36.9444522Z Progress (1): 0.1/12 MB
2026-07-14T20:34:36.9447985Z Progress (1): 0.1/12 MB
2026-07-14T20:34:36.9453232Z Progress (1): 0.2/12 MB
2026-07-14T20:34:36.9458810Z Progress (1): 0.2/12 MB
2026-07-14T20:34:36.9464354Z Progress (1): 0.3/12 MB
2026-07-14T20:34:36.9538936Z Progress (1): 0.3/12 MB
2026-07-14T20:34:36.9539606Z Progress (1): 0.4/12 MB
2026-07-14T20:34:36.9539967Z Progress (1): 0.5/12 MB
2026-07-14T20:34:36.9540293Z Progress (1): 0.5/12 MB
2026-07-14T20:34:36.9540621Z Progress (1): 0.6/12 MB
2026-07-14T20:34:36.9541118Z Progress (1): 0.6/12 MB
2026-07-14T20:34:36.9541341Z Progress (1): 0.7/12 MB
2026-07-14T20:34:36.9541549Z Progress (1): 0.7/12 MB
2026-07-14T20:34:36.9541797Z Progress (1): 0.8/12 MB
2026-07-14T20:34:36.9542039Z Progress (1): 0.9/12 MB
2026-07-14T20:34:36.9542301Z Progress (1): 0.9/12 MB
2026-07-14T20:34:36.9542544Z Progress (1): 1.0/12 MB
2026-07-14T20:34:36.9542768Z Progress (1): 1.0/12 MB
2026-07-14T20:34:36.9543100Z Progress (1): 1.1/12 MB
2026-07-14T20:34:36.9557186Z Progress (1): 1.2/12 MB
2026-07-14T20:34:36.9557548Z Progress (1): 1.2/12 MB
2026-07-14T20:34:36.9557851Z Progress (1): 1.3/12 MB
2026-07-14T20:34:36.9562442Z Progress (1): 1.3/12 MB
2026-07-14T20:34:36.9568488Z Progress (1): 1.4/12 MB
2026-07-14T20:34:36.9586815Z Progress (1): 1.4/12 MB
2026-07-14T20:34:36.9587118Z Progress (1): 1.5/12 MB
2026-07-14T20:34:36.9595919Z Progress (1): 1.6/12 MB
2026-07-14T20:34:36.9596314Z Progress (1): 1.6/12 MB
2026-07-14T20:34:36.9600165Z Progress (1): 1.7/12 MB
2026-07-14T20:34:36.9605274Z Progress (1): 1.7/12 MB
2026-07-14T20:34:36.9610098Z Progress (1): 1.8/12 MB
2026-07-14T20:34:36.9615406Z Progress (1): 1.8/12 MB
2026-07-14T20:34:36.9620031Z Progress (1): 1.9/12 MB
2026-07-14T20:34:36.9625439Z Progress (1): 2.0/12 MB
2026-07-14T20:34:36.9632995Z Progress (1): 2.0/12 MB
2026-07-14T20:34:36.9640462Z Progress (1): 2.1/12 MB
2026-07-14T20:34:36.9641012Z Progress (1): 2.1/12 MB
2026-07-14T20:34:36.9646036Z Progress (1): 2.2/12 MB
2026-07-14T20:34:36.9650738Z Progress (1): 2.2/12 MB
2026-07-14T20:34:36.9655473Z Progress (1): 2.3/12 MB
2026-07-14T20:34:36.9661470Z Progress (1): 2.4/12 MB
2026-07-14T20:34:36.9665320Z Progress (1): 2.4/12 MB
2026-07-14T20:34:36.9671172Z Progress (1): 2.5/12 MB
2026-07-14T20:34:36.9675855Z Progress (1): 2.5/12 MB
2026-07-14T20:34:36.9690427Z Progress (1): 2.6/12 MB
2026-07-14T20:34:36.9690735Z Progress (1): 2.6/12 MB
2026-07-14T20:34:36.9691161Z Progress (1): 2.7/12 MB
2026-07-14T20:34:36.9694819Z Progress (1): 2.8/12 MB
2026-07-14T20:34:36.9699794Z Progress (1): 2.8/12 MB
2026-07-14T20:34:36.9705188Z Progress (1): 2.9/12 MB
2026-07-14T20:34:36.9709819Z Progress (1): 2.9/12 MB
2026-07-14T20:34:36.9714850Z Progress (1): 3.0/12 MB
2026-07-14T20:34:36.9719797Z Progress (1): 3.0/12 MB
2026-07-14T20:34:36.9725038Z Progress (1): 3.1/12 MB
2026-07-14T20:34:36.9730507Z Progress (1): 3.2/12 MB
2026-07-14T20:34:36.9735695Z Progress (1): 3.2/12 MB
2026-07-14T20:34:36.9741375Z Progress (1): 3.3/12 MB
2026-07-14T20:34:36.9746649Z Progress (1): 3.3/12 MB
2026-07-14T20:34:36.9755111Z Progress (1): 3.4/12 MB
2026-07-14T20:34:36.9760426Z Progress (1): 3.4/12 MB
2026-07-14T20:34:36.9765320Z Progress (1): 3.5/12 MB
2026-07-14T20:34:36.9770762Z Progress (1): 3.6/12 MB
2026-07-14T20:34:36.9775815Z Progress (1): 3.6/12 MB
2026-07-14T20:34:36.9781354Z Progress (1): 3.7/12 MB
2026-07-14T20:34:36.9786106Z Progress (1): 3.7/12 MB
2026-07-14T20:34:36.9791037Z Progress (1): 3.8/12 MB
2026-07-14T20:34:36.9796034Z Progress (1): 3.8/12 MB
2026-07-14T20:34:36.9800954Z Progress (1): 3.9/12 MB
2026-07-14T20:34:36.9806240Z Progress (1): 4.0/12 MB
2026-07-14T20:34:36.9810783Z Progress (1): 4.0/12 MB
2026-07-14T20:34:36.9815522Z Progress (1): 4.1/12 MB
2026-07-14T20:34:36.9823189Z Progress (1): 4.1/12 MB
2026-07-14T20:34:36.9827984Z Progress (1): 4.2/12 MB
2026-07-14T20:34:36.9832827Z Progress (1): 4.2/12 MB
2026-07-14T20:34:36.9838045Z Progress (1): 4.3/12 MB
2026-07-14T20:34:36.9843143Z Progress (1): 4.4/12 MB
2026-07-14T20:34:36.9848368Z Progress (1): 4.4/12 MB
2026-07-14T20:34:36.9853114Z Progress (1): 4.5/12 MB
2026-07-14T20:34:36.9857931Z Progress (1): 4.5/12 MB
2026-07-14T20:34:36.9862842Z Progress (1): 4.6/12 MB
2026-07-14T20:34:36.9965811Z Progress (1): 4.6/12 MB
2026-07-14T20:34:36.9966353Z Progress (1): 4.7/12 MB
2026-07-14T20:34:36.9966909Z Progress (1): 4.8/12 MB
2026-07-14T20:34:36.9967233Z Progress (1): 4.8/12 MB
2026-07-14T20:34:36.9968631Z Progress (1): 4.9/12 MB
2026-07-14T20:34:36.9995548Z Progress (1): 4.9/12 MB
2026-07-14T20:34:36.9996069Z Progress (1): 5.0/12 MB
2026-07-14T20:34:36.9996586Z Progress (1): 5.1/12 MB
2026-07-14T20:34:36.9996938Z Progress (1): 5.1/12 MB
2026-07-14T20:34:36.9997134Z Progress (1): 5.2/12 MB
2026-07-14T20:34:36.9997269Z Progress (1): 5.2/12 MB
2026-07-14T20:34:36.9997388Z Progress (1): 5.3/12 MB
2026-07-14T20:34:36.9997506Z Progress (1): 5.3/12 MB
2026-07-14T20:34:36.9997620Z Progress (1): 5.4/12 MB
2026-07-14T20:34:36.9997733Z Progress (1): 5.5/12 MB
2026-07-14T20:34:36.9997849Z Progress (1): 5.5/12 MB
2026-07-14T20:34:36.9997963Z Progress (1): 5.6/12 MB
2026-07-14T20:34:36.9998077Z Progress (1): 5.6/12 MB
2026-07-14T20:34:36.9998190Z Progress (1): 5.7/12 MB
2026-07-14T20:34:36.9998303Z Progress (1): 5.7/12 MB
2026-07-14T20:34:36.9998419Z Progress (1): 5.8/12 MB
2026-07-14T20:34:36.9998533Z Progress (1): 5.9/12 MB
2026-07-14T20:34:36.9998644Z Progress (1): 5.9/12 MB
2026-07-14T20:34:36.9998782Z Progress (1): 6.0/12 MB
2026-07-14T20:34:36.9998913Z Progress (1): 6.0/12 MB
2026-07-14T20:34:36.9999024Z Progress (1): 6.1/12 MB
2026-07-14T20:34:36.9999148Z Progress (1): 6.1/12 MB
2026-07-14T20:34:36.9999262Z Progress (1): 6.2/12 MB
2026-07-14T20:34:36.9999676Z Progress (1): 6.3/12 MB
2026-07-14T20:34:37.0004941Z Progress (1): 6.3/12 MB
2026-07-14T20:34:37.0009253Z Progress (1): 6.4/12 MB
2026-07-14T20:34:37.0013928Z Progress (1): 6.4/12 MB
2026-07-14T20:34:37.0018647Z Progress (1): 6.5/12 MB
2026-07-14T20:34:37.0023542Z Progress (1): 6.5/12 MB
2026-07-14T20:34:37.0028264Z Progress (1): 6.6/12 MB
2026-07-14T20:34:37.0032876Z Progress (1): 6.7/12 MB
2026-07-14T20:34:37.0037803Z Progress (1): 6.7/12 MB
2026-07-14T20:34:37.0042069Z Progress (1): 6.8/12 MB
2026-07-14T20:34:37.0049774Z Progress (1): 6.8/12 MB
2026-07-14T20:34:37.0055058Z Progress (1): 6.9/12 MB
2026-07-14T20:34:37.0059743Z Progress (1): 6.9/12 MB
2026-07-14T20:34:37.0064763Z Progress (1): 7.0/12 MB
2026-07-14T20:34:37.0070036Z Progress (1): 7.1/12 MB
2026-07-14T20:34:37.0074445Z Progress (1): 7.1/12 MB
2026-07-14T20:34:37.0079562Z Progress (1): 7.2/12 MB
2026-07-14T20:34:37.0084158Z Progress (1): 7.2/12 MB
2026-07-14T20:34:37.0088870Z Progress (1): 7.3/12 MB
2026-07-14T20:34:37.0094103Z Progress (1): 7.3/12 MB
2026-07-14T20:34:37.0097902Z Progress (1): 7.4/12 MB
2026-07-14T20:34:37.0102563Z Progress (1): 7.5/12 MB
2026-07-14T20:34:37.0107640Z Progress (1): 7.5/12 MB
2026-07-14T20:34:37.0112003Z Progress (1): 7.6/12 MB
2026-07-14T20:34:37.0116924Z Progress (1): 7.6/12 MB
2026-07-14T20:34:37.0121573Z Progress (1): 7.7/12 MB
2026-07-14T20:34:37.0126824Z Progress (1): 7.7/12 MB
2026-07-14T20:34:37.0131182Z Progress (1): 7.8/12 MB
2026-07-14T20:34:37.0136395Z Progress (1): 7.9/12 MB
2026-07-14T20:34:37.0140812Z Progress (1): 7.9/12 MB
2026-07-14T20:34:37.0145397Z Progress (1): 8.0/12 MB
2026-07-14T20:34:37.0149913Z Progress (1): 8.0/12 MB
2026-07-14T20:34:37.0154707Z Progress (1): 8.1/12 MB
2026-07-14T20:34:37.0159066Z Progress (1): 8.1/12 MB
2026-07-14T20:34:37.0163890Z Progress (1): 8.2/12 MB
2026-07-14T20:34:37.0168504Z Progress (1): 8.3/12 MB
2026-07-14T20:34:37.0179103Z Progress (1): 8.3/12 MB
2026-07-14T20:34:37.0179414Z Progress (1): 8.4/12 MB
2026-07-14T20:34:37.0183443Z Progress (1): 8.4/12 MB
2026-07-14T20:34:37.0188357Z Progress (1): 8.5/12 MB
2026-07-14T20:34:37.0192942Z Progress (1): 8.5/12 MB
2026-07-14T20:34:37.0197235Z Progress (1): 8.6/12 MB
2026-07-14T20:34:37.0201853Z Progress (1): 8.7/12 MB
2026-07-14T20:34:37.0206655Z Progress (1): 8.7/12 MB
2026-07-14T20:34:37.0211321Z Progress (1): 8.8/12 MB
2026-07-14T20:34:37.0216098Z Progress (1): 8.8/12 MB
2026-07-14T20:34:37.0220527Z Progress (1): 8.9/12 MB
2026-07-14T20:34:37.0225146Z Progress (1): 8.9/12 MB
2026-07-14T20:34:37.0229580Z Progress (1): 9.0/12 MB
2026-07-14T20:34:37.0234326Z Progress (1): 9.1/12 MB
2026-07-14T20:34:37.0238807Z Progress (1): 9.1/12 MB
2026-07-14T20:34:37.0243446Z Progress (1): 9.2/12 MB
2026-07-14T20:34:37.0248187Z Progress (1): 9.2/12 MB
2026-07-14T20:34:37.0252929Z Progress (1): 9.3/12 MB
2026-07-14T20:34:37.0257611Z Progress (1): 9.4/12 MB
2026-07-14T20:34:37.0262575Z Progress (1): 9.4/12 MB
2026-07-14T20:34:37.0267568Z Progress (1): 9.5/12 MB
2026-07-14T20:34:37.0272335Z Progress (1): 9.5/12 MB
2026-07-14T20:34:37.0277324Z Progress (1): 9.6/12 MB
2026-07-14T20:34:37.0281588Z Progress (1): 9.6/12 MB
2026-07-14T20:34:37.0285973Z Progress (1): 9.7/12 MB
2026-07-14T20:34:37.0290544Z Progress (1): 9.8/12 MB
2026-07-14T20:34:37.0295644Z Progress (1): 9.8/12 MB
2026-07-14T20:34:37.0300317Z Progress (1): 9.9/12 MB
2026-07-14T20:34:37.0304781Z Progress (1): 9.9/12 MB
2026-07-14T20:34:37.0309328Z Progress (1): 10.0/12 MB
2026-07-14T20:34:37.0313863Z Progress (1): 10/12 MB  
2026-07-14T20:34:37.0318667Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0322714Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0328297Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0331782Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0336490Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0340868Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0345683Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0350363Z Progress (1): 10/12 MB
2026-07-14T20:34:37.0354897Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0359514Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0367009Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0371945Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0376928Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0381493Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0386897Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0391761Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0396526Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0400998Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0405604Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0410212Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0414728Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0419016Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0423276Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0428045Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0432308Z Progress (1): 11/12 MB
2026-07-14T20:34:37.0436718Z Progress (1): 12/12 MB
2026-07-14T20:34:37.0441090Z Progress (1): 12/12 MB
2026-07-14T20:34:37.0446102Z Progress (1): 12/12 MB
2026-07-14T20:34:37.0449539Z Progress (1): 12/12 MB
2026-07-14T20:34:37.0453908Z Progress (1): 12/12 MB
2026-07-14T20:34:37.0456100Z Progress (1): 12/12 MB
2026-07-14T20:34:37.0491078Z Progress (1): 12 MB   
2026-07-14T20:34:37.0491233Z                    
2026-07-14T20:34:37.0491720Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/io/dinamonetworks/sdk/dinamo-hsm/4.26.0/dinamo-hsm-4.26.0.jar (12 MB at 104 MB/s)
2026-07-14T20:34:37.0758316Z [INFO] 
2026-07-14T20:34:37.0758975Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ simpi-dict-ejb ---
2026-07-14T20:34:37.0777414Z [INFO] 
2026-07-14T20:34:37.0778181Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict-ejb ---
2026-07-14T20:34:37.0787669Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/simpi-dict-ejb/target/jacoco.exec
2026-07-14T20:34:37.0788181Z [INFO] 
2026-07-14T20:34:37.0788804Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ simpi-dict-ejb ---
2026-07-14T20:34:37.1313141Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:37.1352559Z [INFO] Copying 12 resources
2026-07-14T20:34:37.1437807Z [INFO] 
2026-07-14T20:34:37.1438518Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ simpi-dict-ejb ---
2026-07-14T20:34:37.2517969Z [INFO] Changes detected - recompiling the module!
2026-07-14T20:34:37.2542627Z [INFO] Compiling 350 source files to /opt/ads-agent/_work/9141/s/simpi-dict-ejb/target/classes
2026-07-14T20:34:41.7066043Z [WARNING] /opt/ads-agent/_work/9141/s/simpi-dict-ejb/src/main/java/br/gov/caixa/mpi/dict/ejb/InfractionReportEjb.java: Some input files use or override a deprecated API.
2026-07-14T20:34:41.7175983Z [WARNING] /opt/ads-agent/_work/9141/s/simpi-dict-ejb/src/main/java/br/gov/caixa/mpi/dict/ejb/InfractionReportEjb.java: Recompile with -Xlint:deprecation for details.
2026-07-14T20:34:41.7195103Z [INFO] 
2026-07-14T20:34:41.7195638Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict-ejb ---
2026-07-14T20:34:41.7196631Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/simpi-dict-ejb/target/jacoco.exec
2026-07-14T20:34:41.7196995Z [INFO] 
2026-07-14T20:34:41.7197499Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ simpi-dict-ejb ---
2026-07-14T20:34:41.7197913Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:41.7198609Z [INFO] Copying 12 resources
2026-07-14T20:34:41.7198794Z [INFO] 
2026-07-14T20:34:41.7199116Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ simpi-dict-ejb ---
2026-07-14T20:34:41.7268849Z [INFO] Nothing to compile - all classes are up to date
2026-07-14T20:34:41.7269293Z [INFO] 
2026-07-14T20:34:41.7269726Z [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ simpi-dict-ejb ---
2026-07-14T20:34:41.7306699Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:41.7307152Z [INFO] Copying 1 resource
2026-07-14T20:34:41.7307411Z [INFO] 
2026-07-14T20:34:41.7307791Z [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ simpi-dict-ejb ---
2026-07-14T20:34:41.7359621Z [INFO] Changes detected - recompiling the module!
2026-07-14T20:34:41.7425551Z [INFO] Compiling 48 source files to /opt/ads-agent/_work/9141/s/simpi-dict-ejb/target/test-classes
2026-07-14T20:34:42.6333993Z [WARNING] /opt/ads-agent/_work/9141/s/simpi-dict-ejb/src/test/java/br/gov/caixa/mpi/dict/ejb/RefundEjbTest.java: Some input files use or override a deprecated API.
2026-07-14T20:34:42.6334483Z [WARNING] /opt/ads-agent/_work/9141/s/simpi-dict-ejb/src/test/java/br/gov/caixa/mpi/dict/ejb/RefundEjbTest.java: Recompile with -Xlint:deprecation for details.
2026-07-14T20:34:42.6334795Z [INFO] 
2026-07-14T20:34:42.6335548Z [INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ simpi-dict-ejb ---
2026-07-14T20:34:42.9656823Z [INFO] 
2026-07-14T20:34:42.9668648Z [INFO] -------------------------------------------------------
2026-07-14T20:34:42.9673986Z [INFO]  T E S T S
2026-07-14T20:34:42.9674186Z [INFO] -------------------------------------------------------
2026-07-14T20:34:44.0484158Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacadeTest
2026-07-14T20:34:45.6404276Z 2026-07-14 17:34:45 INFO  CriarVinculoDictFacade - Requisicao ao BACEN para criar vinculo realizada em 49 ms. ChaveDto de requisicao: ChaveDto(id=null, tipoChave=CPF, conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=PF, cpf=12345678901, cnpj=null, nome=Nome Cliente, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=01/01/2001 00:00:00, produto=0001, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), chave=12345678901, cidCriacao=null, dataCriacao=null, idRequisicao=null, dataInativacao=null, proprietarioChaveDesde=null, tipoInativacaoChave=null, estatisticaContaBacenDto=null, canal=null, possuiContaFicticia=false, duracaoCache=null, nomeSocial=false) ChaveDto de resposta: ChaveDto(id=null, tipoChave=EVP, conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=PF, cpf=12345678901, cnpj=null, nome=Client Name, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=2026-07-14T17:34:45.567, produto=null, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), chave=valorChave, cidCriacao=null, dataCriacao=2026-07-14T17:34:45.569, idRequisicao=19839be1-49c1-48d9-a015-083d50468953, dataInativacao=null, proprietarioChaveDesde=2026-07-14T17:34:45.569, tipoInativacaoChave=null, estatisticaContaBacenDto=null, canal=null, possuiContaFicticia=false, duracaoCache=null, nomeSocial=false) CreateEntryRequest: class CreateEntryRequest {
2026-07-14T20:34:45.6406252Z     signature: 
2026-07-14T20:34:45.6406844Z     entry: class Entry {
2026-07-14T20:34:45.6407134Z         key: 12345678901
2026-07-14T20:34:45.6407441Z         keyType: CPF
2026-07-14T20:34:45.6407716Z         account: class BrazilianAccount {
2026-07-14T20:34:45.6408090Z             participant: 00360305
2026-07-14T20:34:45.6408473Z             branch: 1234
2026-07-14T20:34:45.6408817Z             accountNumber: 1234567890
2026-07-14T20:34:45.6409163Z             accountType: CACC
2026-07-14T20:34:45.6409571Z             openingDate: 2001-01-01T00:00Z
2026-07-14T20:34:45.6409883Z         }
2026-07-14T20:34:45.6410129Z         owner: class NaturalPerson {
2026-07-14T20:34:45.6410335Z             type: NATURAL_PERSON
2026-07-14T20:34:45.6410618Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.6410947Z             name: Nome Cliente
2026-07-14T20:34:45.6411246Z             tradeName: null
2026-07-14T20:34:45.6411596Z         }
2026-07-14T20:34:45.6413144Z     }
2026-07-14T20:34:45.6413332Z     reason: USER_REQUESTED
2026-07-14T20:34:45.6413659Z     requestId: 19839be1-49c1-48d9-a015-083d50468953
2026-07-14T20:34:45.6413959Z } CreateEntryResponse: class CreateEntryResponse {
2026-07-14T20:34:45.6414207Z     signature: null
2026-07-14T20:34:45.6414470Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.6414817Z         key: valorChave
2026-07-14T20:34:45.6415061Z         keyType: EVP
2026-07-14T20:34:45.6415708Z         account: class BrazilianAccount {
2026-07-14T20:34:45.6415906Z             participant: 00360305
2026-07-14T20:34:45.6416031Z             branch: 1234
2026-07-14T20:34:45.6416158Z             accountNumber: 1234567890
2026-07-14T20:34:45.6416281Z             accountType: CACC
2026-07-14T20:34:45.6416574Z             openingDate: 2026-07-14T17:34:45.567-03:00
2026-07-14T20:34:45.6416947Z         }
2026-07-14T20:34:45.6417063Z         owner: class NaturalPerson {
2026-07-14T20:34:45.6417187Z             type: NATURAL_PERSON
2026-07-14T20:34:45.6417310Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.6417433Z             name: Client Name
2026-07-14T20:34:45.6417557Z             tradeName: Comercial Name
2026-07-14T20:34:45.6417674Z         }
2026-07-14T20:34:45.6417856Z         creationDate: 2026-07-14T17:34:45.569-03:00
2026-07-14T20:34:45.6418070Z         keyOwnershipDate: 2026-07-14T17:34:45.569-03:00
2026-07-14T20:34:45.6418220Z         openClaimCreationDate: null
2026-07-14T20:34:45.6418413Z     }
2026-07-14T20:34:45.6418519Z }
2026-07-14T20:34:45.7085847Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.623 s - in br.gov.caixa.mpi.dict.v2.facade.directory.CriarVinculoDictFacadeTest
2026-07-14T20:34:45.7195600Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.directory.DeletarEntryDictFacadeTest
2026-07-14T20:34:45.8736462Z 2026-07-14 17:34:45 INFO  DeletarEntryDictFacade - Requisicao ao BACEN para excluir vinculo realizada em 1 ms. Chave: 12345678901 DeleteEntryRequest: class DeleteEntryRequest {
2026-07-14T20:34:45.8775449Z     signature: 
2026-07-14T20:34:45.8775928Z     key: 12345678901
2026-07-14T20:34:45.8776234Z     participant: 00360305
2026-07-14T20:34:45.8776540Z     reason: RECONCILIATION
2026-07-14T20:34:45.8776854Z } DeleteEntryResponse: class DeleteEntryResponse {
2026-07-14T20:34:45.8777108Z     signature: null
2026-07-14T20:34:45.8777291Z     key: 12345678901
2026-07-14T20:34:45.8777494Z }
2026-07-14T20:34:45.8778219Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.165 s - in br.gov.caixa.mpi.dict.v2.facade.directory.DeletarEntryDictFacadeTest
2026-07-14T20:34:45.8876197Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.directory.ConsultarEntryDictFacadeTest
2026-07-14T20:34:45.9528530Z 2026-07-14 17:34:45 INFO  ConsultarEntryDictFacade - Requisicao ao BACEN para consultar chave em 22 ms.  Parametros: Chave:  CPF ou CNPJ:  IdEndToEnd:  PiPayerId:  GetEntryResponse: class GetEntryResponse {
2026-07-14T20:34:45.9675695Z     signature: null
2026-07-14T20:34:45.9676016Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.9682696Z         key: valorChave
2026-07-14T20:34:45.9683056Z         keyType: EVP
2026-07-14T20:34:45.9683387Z         account: class BrazilianAccount {
2026-07-14T20:34:45.9683823Z             participant: 00360305
2026-07-14T20:34:45.9684110Z             branch: 1234
2026-07-14T20:34:45.9684379Z             accountNumber: 1234567890
2026-07-14T20:34:45.9684740Z             accountType: CACC
2026-07-14T20:34:45.9685300Z             openingDate: 2026-07-14T17:34:45.888-03:00
2026-07-14T20:34:45.9685502Z         }
2026-07-14T20:34:45.9685676Z         owner: class NaturalPerson {
2026-07-14T20:34:45.9685877Z             type: NATURAL_PERSON
2026-07-14T20:34:45.9686044Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.9686236Z             name: Client Name
2026-07-14T20:34:45.9686427Z             tradeName: Comercial Name
2026-07-14T20:34:45.9686688Z         }
2026-07-14T20:34:45.9687054Z         creationDate: 2026-07-14T17:34:45.888-03:00
2026-07-14T20:34:45.9687462Z         keyOwnershipDate: 2026-07-14T17:34:45.888-03:00
2026-07-14T20:34:45.9687822Z         openClaimCreationDate: 2026-07-14T17:34:45.888-03:00
2026-07-14T20:34:45.9688073Z     }
2026-07-14T20:34:45.9688300Z     ownerStatistics: class PersonStatistics {
2026-07-14T20:34:45.9688526Z         spi: class PersonStatisticsSpi {
2026-07-14T20:34:45.9688968Z             watermark: 2026-07-14T17:34:45.891-03:00
2026-07-14T20:34:45.9689259Z             settlements: class PersonStatisticsSpiSettlements {
2026-07-14T20:34:45.9689519Z                 d90: 1
2026-07-14T20:34:45.9689739Z                 m12: 1
2026-07-14T20:34:45.9689901Z                 m60: 1
2026-07-14T20:34:45.9690127Z             }
2026-07-14T20:34:45.9690281Z         }
2026-07-14T20:34:45.9690459Z         fraudMarkers: class PersonStatisticsFraudMarkers {
2026-07-14T20:34:45.9691058Z             watermark: 2026-07-14T17:34:45.911-03:00
2026-07-14T20:34:45.9715312Z             applicationFrauds: class PersonStatisticsFraudMarkersApplicationFrauds {
2026-07-14T20:34:45.9721393Z                 d90: 1
2026-07-14T20:34:45.9721624Z                 m12: 1
2026-07-14T20:34:45.9721824Z                 m60: 1
2026-07-14T20:34:45.9722023Z             }
2026-07-14T20:34:45.9722215Z             muleAccounts: class PersonStatisticsFraudMarkersMuleAccounts {
2026-07-14T20:34:45.9722402Z                 d90: 1
2026-07-14T20:34:45.9722555Z                 m12: 1
2026-07-14T20:34:45.9722713Z                 m60: 1
2026-07-14T20:34:45.9722863Z             }
2026-07-14T20:34:45.9723050Z             scammerAccounts: class PersonStatisticsFraudMarkersScammerAccounts {
2026-07-14T20:34:45.9723319Z                 d90: 1
2026-07-14T20:34:45.9723614Z                 m12: 1
2026-07-14T20:34:45.9723835Z                 m60: 1
2026-07-14T20:34:45.9724052Z             }
2026-07-14T20:34:45.9724279Z             otherFrauds: class PersonStatisticsFraudMarkersOtherFrauds {
2026-07-14T20:34:45.9724524Z                 d90: 1
2026-07-14T20:34:45.9724808Z                 m12: 1
2026-07-14T20:34:45.9725216Z                 m60: 1
2026-07-14T20:34:45.9725394Z             }
2026-07-14T20:34:45.9725538Z             totalFrauds: class PersonStatisticsFraudMarkersTotalFrauds {
2026-07-14T20:34:45.9725678Z                 d90: 1
2026-07-14T20:34:45.9725788Z                 m12: 1
2026-07-14T20:34:45.9725898Z                 m60: 1
2026-07-14T20:34:45.9726001Z             }
2026-07-14T20:34:45.9726148Z             totalFraudTransactionAmount: class PersonStatisticsFraudMarkersTotalFraudTransactionAmount {
2026-07-14T20:34:45.9726307Z                 d90: 1
2026-07-14T20:34:45.9726409Z                 m12: 1
2026-07-14T20:34:45.9726512Z                 m60: 1
2026-07-14T20:34:45.9726611Z             }
2026-07-14T20:34:45.9726752Z             distinctFraudReporters: class PersonStatisticsFraudMarkersDistinctFraudReporters {
2026-07-14T20:34:45.9727129Z                 d90: 1
2026-07-14T20:34:45.9727230Z                 m12: 1
2026-07-14T20:34:45.9727338Z                 m60: 1
2026-07-14T20:34:45.9727442Z             }
2026-07-14T20:34:45.9727540Z         }
2026-07-14T20:34:45.9727672Z         infractionReports: class PersonStatisticsInfractionReports {
2026-07-14T20:34:45.9727993Z             watermark: 2026-07-14T17:34:45.915-03:00
2026-07-14T20:34:45.9728128Z             openReports: 1
2026-07-14T20:34:45.9728320Z             openReportsDistinctReporters: 1
2026-07-14T20:34:45.9728485Z             rejectedReports: class PersonStatisticsInfractionReportsRejectedReports {
2026-07-14T20:34:45.9728622Z                 d90: 1
2026-07-14T20:34:45.9728729Z                 m12: 1
2026-07-14T20:34:45.9728834Z                 m60: 1
2026-07-14T20:34:45.9728936Z             }
2026-07-14T20:34:45.9729038Z         }
2026-07-14T20:34:45.9729154Z         entries: class PersonStatisticsEntries {
2026-07-14T20:34:45.9729361Z             watermark: 2026-07-14T17:34:45.896-03:00
2026-07-14T20:34:45.9729501Z             registeredAccounts: 1
2026-07-14T20:34:45.9729609Z         }
2026-07-14T20:34:45.9729708Z     }
2026-07-14T20:34:45.9729827Z     keyStatistics: class KeyStatistics {
2026-07-14T20:34:45.9729956Z         spi: class PersonStatisticsSpi {
2026-07-14T20:34:45.9730148Z             watermark: 2026-07-14T17:34:45.891-03:00
2026-07-14T20:34:45.9730302Z             settlements: class PersonStatisticsSpiSettlements {
2026-07-14T20:34:45.9730427Z                 d90: 1
2026-07-14T20:34:45.9730529Z                 m12: 1
2026-07-14T20:34:45.9730632Z                 m60: 1
2026-07-14T20:34:45.9730736Z             }
2026-07-14T20:34:45.9730830Z         }
2026-07-14T20:34:45.9730950Z         fraudMarkers: class PersonStatisticsFraudMarkers {
2026-07-14T20:34:45.9731150Z             watermark: 2026-07-14T17:34:45.911-03:00
2026-07-14T20:34:45.9731307Z             applicationFrauds: class PersonStatisticsFraudMarkersApplicationFrauds {
2026-07-14T20:34:45.9731524Z                 d90: 1
2026-07-14T20:34:45.9731625Z                 m12: 1
2026-07-14T20:34:45.9731725Z                 m60: 1
2026-07-14T20:34:45.9731823Z             }
2026-07-14T20:34:45.9731948Z             muleAccounts: class PersonStatisticsFraudMarkersMuleAccounts {
2026-07-14T20:34:45.9732077Z                 d90: 1
2026-07-14T20:34:45.9732250Z                 m12: 1
2026-07-14T20:34:45.9732352Z                 m60: 1
2026-07-14T20:34:45.9732453Z             }
2026-07-14T20:34:45.9732588Z             scammerAccounts: class PersonStatisticsFraudMarkersScammerAccounts {
2026-07-14T20:34:45.9732720Z                 d90: 1
2026-07-14T20:34:45.9732820Z                 m12: 1
2026-07-14T20:34:45.9732919Z                 m60: 1
2026-07-14T20:34:45.9733020Z             }
2026-07-14T20:34:45.9733148Z             otherFrauds: class PersonStatisticsFraudMarkersOtherFrauds {
2026-07-14T20:34:45.9733278Z                 d90: 1
2026-07-14T20:34:45.9733406Z                 m12: 1
2026-07-14T20:34:45.9733561Z                 m60: 1
2026-07-14T20:34:45.9733677Z             }
2026-07-14T20:34:45.9733803Z             totalFrauds: class PersonStatisticsFraudMarkersTotalFrauds {
2026-07-14T20:34:45.9733926Z                 d90: 1
2026-07-14T20:34:45.9734023Z                 m12: 1
2026-07-14T20:34:45.9734122Z                 m60: 1
2026-07-14T20:34:45.9734217Z             }
2026-07-14T20:34:45.9734363Z             totalFraudTransactionAmount: class PersonStatisticsFraudMarkersTotalFraudTransactionAmount {
2026-07-14T20:34:45.9734504Z                 d90: 1
2026-07-14T20:34:45.9734694Z                 m12: 1
2026-07-14T20:34:45.9734795Z                 m60: 1
2026-07-14T20:34:45.9734893Z             }
2026-07-14T20:34:45.9735029Z             distinctFraudReporters: class PersonStatisticsFraudMarkersDistinctFraudReporters {
2026-07-14T20:34:45.9735170Z                 d90: 1
2026-07-14T20:34:45.9735272Z                 m12: 1
2026-07-14T20:34:45.9735379Z                 m60: 1
2026-07-14T20:34:45.9735591Z             }
2026-07-14T20:34:45.9735699Z         }
2026-07-14T20:34:45.9735833Z         infractionReports: class PersonStatisticsInfractionReports {
2026-07-14T20:34:45.9736046Z             watermark: 2026-07-14T17:34:45.915-03:00
2026-07-14T20:34:45.9736179Z             openReports: 1
2026-07-14T20:34:45.9736305Z             openReportsDistinctReporters: 1
2026-07-14T20:34:45.9736458Z             rejectedReports: class PersonStatisticsInfractionReportsRejectedReports {
2026-07-14T20:34:45.9736601Z                 d90: 1
2026-07-14T20:34:45.9736706Z                 m12: 1
2026-07-14T20:34:45.9736809Z                 m60: 1
2026-07-14T20:34:45.9736909Z             }
2026-07-14T20:34:45.9737005Z         }
2026-07-14T20:34:45.9737124Z         entries: class KeyStatisticsEntries {
2026-07-14T20:34:45.9737321Z             watermark: 2026-07-14T17:34:45.919-03:00
2026-07-14T20:34:45.9737476Z             distinctAccounts: class KeyStatisticsEntriesDistinctAccounts {
2026-07-14T20:34:45.9737609Z                 d90: 1
2026-07-14T20:34:45.9737718Z                 m12: 1
2026-07-14T20:34:45.9737819Z                 m60: 1
2026-07-14T20:34:45.9737917Z             }
2026-07-14T20:34:45.9738013Z         }
2026-07-14T20:34:45.9738107Z     }
2026-07-14T20:34:45.9741867Z } ChaveDto de retorno: ChaveDto(id=null, tipoChave=EVP, conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=PF, cpf=12345678901, cnpj=null, nome=Client Name, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=2026-07-14T17:34:45.888, produto=null, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), chave=valorChave, cidCriacao=null, dataCriacao=2026-07-14T17:34:45.888, idRequisicao=null, dataInativacao=null, proprietarioChaveDesde=2026-07-14T17:34:45.888, tipoInativacaoChave=null, estatisticaContaBacenDto=EstatisticaContaBacenDto(dataRespostaBacen=2026-07-14T17:34:45.92, idCorrelacao=null, estatisticasChave=EstatisticasChaveMarcacoesFraudeDTO(spi=SpiDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.891, numeroLiquidacoes=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1)), marcacoesFraude=MarcacoesFraudeDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.911, applicationFrauds=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), muleAccounts=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), scammerAccounts=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), otherFrauds=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), totalFrauds=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), totalFraudTransactionAmount=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), distinctFraudReporters=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1)), notificacoesInfracao=NotificacoesInfracaoDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.915, relatosNotificacaoAbertos=1, relatosNotificacaoAbertosPorRelatoresDistintos=1, relatosRejeitados=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1)), contasDistintas=ContasDistintasDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.919, contasDistintas=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1))), estatisticasPessoa=EstatisticasPessoaMarcacoesFraudeDTO(spi=SpiDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.891, numeroLiquidacoes=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1)), marcacoesFraude=MarcacoesFraudeDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.911, applicationFrauds=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), muleAccounts=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), scammerAccounts=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), otherFrauds=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), totalFrauds=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), totalFraudTransactionAmount=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1), distinctFraudReporters=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1)), notificacoesInfracao=NotificacoesInfracaoDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.915, relatosNotificacaoAbertos=1, relatosNotificacaoAbertosPorRelatoresDistintos=1, relatosRejeitados=ContadoresEstatisticasDTO(d90=1, m12=1, m60=1)), contasRegistradas=ContasRegistradasDTO(dataHoraUltimoEvento=2026-07-14T17:34:45.896, contasRegistradas=1))), canal=null, possuiContaFicticia=false, duracaoCache=1, nomeSocial=false)
2026-07-14T20:34:45.9744373Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.063 s - in br.gov.caixa.mpi.dict.v2.facade.directory.ConsultarEntryDictFacadeTest
2026-07-14T20:34:45.9744667Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.directory.AtualizarEntryDictFacadeTest
2026-07-14T20:34:45.9745563Z 2026-07-14 17:34:45 INFO  AtualizarEntryDictFacade - Requisicao ao BACEN para atualizar chave realizada em 1 ms. Chave: 12345678901 RequisicaoChaveDto: RequisicaoChaveDto(conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=PF, cpf=12345678901, cnpj=null, nome=Nome Cliente, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=01/01/2001 00:00:00, produto=0001, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), tipoInativacaoChave=USER_REQUESTED) UpdateEntryRequest: class UpdateEntryRequest {
2026-07-14T20:34:45.9746030Z     signature: 
2026-07-14T20:34:45.9746141Z     key: 12345678901
2026-07-14T20:34:45.9746260Z     account: class BrazilianAccount {
2026-07-14T20:34:45.9746383Z         participant: 00360305
2026-07-14T20:34:45.9746497Z         branch: 1234
2026-07-14T20:34:45.9746613Z         accountNumber: 1234567890
2026-07-14T20:34:45.9746729Z         accountType: CACC
2026-07-14T20:34:45.9746901Z         openingDate: 2001-01-01T00:00Z
2026-07-14T20:34:45.9747015Z     }
2026-07-14T20:34:45.9747126Z     reason: USER_REQUESTED
2026-07-14T20:34:45.9747247Z     owner: class NaturalPerson {
2026-07-14T20:34:45.9747370Z         type: NATURAL_PERSON
2026-07-14T20:34:45.9747535Z         taxIdNumber: 12345678901
2026-07-14T20:34:45.9747653Z         name: Nome Cliente
2026-07-14T20:34:45.9747765Z         tradeName: null
2026-07-14T20:34:45.9747870Z     }
2026-07-14T20:34:45.9747992Z } UpdateEntryResponse: class UpdateEntryResponse {
2026-07-14T20:34:45.9748117Z     signature: null
2026-07-14T20:34:45.9748233Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.9748357Z         key: 12345678901
2026-07-14T20:34:45.9748468Z         keyType: EVP
2026-07-14T20:34:45.9748585Z         account: class BrazilianAccount {
2026-07-14T20:34:45.9748706Z             participant: 00360305
2026-07-14T20:34:45.9748820Z             branch: 1234
2026-07-14T20:34:45.9748936Z             accountNumber: 1234567890
2026-07-14T20:34:45.9749058Z             accountType: CACC
2026-07-14T20:34:45.9749247Z             openingDate: 2026-07-14T17:34:45.951-03:00
2026-07-14T20:34:45.9749374Z         }
2026-07-14T20:34:45.9749484Z         owner: class NaturalPerson {
2026-07-14T20:34:45.9749606Z             type: NATURAL_PERSON
2026-07-14T20:34:45.9749728Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.9749850Z             name: Client Name
2026-07-14T20:34:45.9749988Z             tradeName: Comercial Name
2026-07-14T20:34:45.9750093Z         }
2026-07-14T20:34:45.9750267Z         creationDate: 2026-07-14T17:34:45.951-03:00
2026-07-14T20:34:45.9750476Z         keyOwnershipDate: 2026-07-14T17:34:45.951-03:00
2026-07-14T20:34:45.9750616Z         openClaimCreationDate: null
2026-07-14T20:34:45.9750723Z     }
2026-07-14T20:34:45.9750817Z }
2026-07-14T20:34:45.9751677Z 2026-07-14 17:34:45 INFO  AtualizarEntryDictFacade - Requisicao ao BACEN para atualizar chave realizada em 0 ms. Chave: 12345678901 RequisicaoChaveDto: RequisicaoChaveDto(conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=null, cpf=12345678901, cnpj=null, nome=Nome Cliente, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=01/01/2001 00:00:00, produto=0001, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), tipoInativacaoChave=USER_REQUESTED) UpdateEntryRequest: class UpdateEntryRequest {
2026-07-14T20:34:45.9752156Z     signature: 
2026-07-14T20:34:45.9752267Z     key: 12345678901
2026-07-14T20:34:45.9752418Z     account: class BrazilianAccount {
2026-07-14T20:34:45.9752608Z         participant: 00360305
2026-07-14T20:34:45.9752756Z         branch: 1234
2026-07-14T20:34:45.9752871Z         accountNumber: 1234567890
2026-07-14T20:34:45.9752994Z         accountType: CACC
2026-07-14T20:34:45.9753167Z         openingDate: 2001-01-01T00:00Z
2026-07-14T20:34:45.9753285Z     }
2026-07-14T20:34:45.9753525Z     reason: USER_REQUESTED
2026-07-14T20:34:45.9753662Z     owner: null
2026-07-14T20:34:45.9753788Z } UpdateEntryResponse: class UpdateEntryResponse {
2026-07-14T20:34:45.9753918Z     signature: null
2026-07-14T20:34:45.9754035Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.9754153Z         key: 12345678901
2026-07-14T20:34:45.9754264Z         keyType: EVP
2026-07-14T20:34:45.9754442Z         account: class BrazilianAccount {
2026-07-14T20:34:45.9754652Z             participant: 00360305
2026-07-14T20:34:45.9754777Z             branch: 1234
2026-07-14T20:34:45.9754932Z             accountNumber: 1234567890
2026-07-14T20:34:45.9755112Z             accountType: CACC
2026-07-14T20:34:45.9755401Z             openingDate: 2026-07-14T17:34:45.963-03:00
2026-07-14T20:34:45.9755532Z         }
2026-07-14T20:34:45.9755652Z         owner: class NaturalPerson {
2026-07-14T20:34:45.9755773Z             type: NATURAL_PERSON
2026-07-14T20:34:45.9755917Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.9756101Z             name: Client Name
2026-07-14T20:34:45.9756223Z             tradeName: Comercial Name
2026-07-14T20:34:45.9756342Z         }
2026-07-14T20:34:45.9756636Z         creationDate: 2026-07-14T17:34:45.963-03:00
2026-07-14T20:34:45.9756849Z         keyOwnershipDate: 2026-07-14T17:34:45.963-03:00
2026-07-14T20:34:45.9756996Z         openClaimCreationDate: null
2026-07-14T20:34:45.9757103Z     }
2026-07-14T20:34:45.9757198Z }
2026-07-14T20:34:45.9758130Z 2026-07-14 17:34:45 INFO  AtualizarEntryDictFacade - Requisicao ao BACEN para atualizar chave realizada em 0 ms. Chave: 12345678901 RequisicaoChaveDto: RequisicaoChaveDto(conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=PF, cpf=12345678901, cnpj=null, nome=null, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=01/01/2001 00:00:00, produto=0001, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), tipoInativacaoChave=USER_REQUESTED) UpdateEntryRequest: class UpdateEntryRequest {
2026-07-14T20:34:45.9758635Z     signature: 
2026-07-14T20:34:45.9758746Z     key: 12345678901
2026-07-14T20:34:45.9758868Z     account: class BrazilianAccount {
2026-07-14T20:34:45.9758996Z         participant: 00360305
2026-07-14T20:34:45.9759104Z         branch: 1234
2026-07-14T20:34:45.9759217Z         accountNumber: 1234567890
2026-07-14T20:34:45.9759337Z         accountType: CACC
2026-07-14T20:34:45.9759504Z         openingDate: 2001-01-01T00:00Z
2026-07-14T20:34:45.9759614Z     }
2026-07-14T20:34:45.9759725Z     reason: USER_REQUESTED
2026-07-14T20:34:45.9759837Z     owner: null
2026-07-14T20:34:45.9759961Z } UpdateEntryResponse: class UpdateEntryResponse {
2026-07-14T20:34:45.9760085Z     signature: null
2026-07-14T20:34:45.9760203Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.9760317Z         key: 12345678901
2026-07-14T20:34:45.9760423Z         keyType: EVP
2026-07-14T20:34:45.9760539Z         account: class BrazilianAccount {
2026-07-14T20:34:45.9760660Z             participant: 00360305
2026-07-14T20:34:45.9760774Z             branch: 1234
2026-07-14T20:34:45.9760933Z             accountNumber: 1234567890
2026-07-14T20:34:45.9761051Z             accountType: CACC
2026-07-14T20:34:45.9761236Z             openingDate: 2026-07-14T17:34:45.966-03:00
2026-07-14T20:34:45.9761359Z         }
2026-07-14T20:34:45.9761471Z         owner: class NaturalPerson {
2026-07-14T20:34:45.9761592Z             type: NATURAL_PERSON
2026-07-14T20:34:45.9761710Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.9761826Z             name: Client Name
2026-07-14T20:34:45.9761941Z             tradeName: Comercial Name
2026-07-14T20:34:45.9762045Z         }
2026-07-14T20:34:45.9762218Z         creationDate: 2026-07-14T17:34:45.966-03:00
2026-07-14T20:34:45.9762421Z         keyOwnershipDate: 2026-07-14T17:34:45.966-03:00
2026-07-14T20:34:45.9762560Z         openClaimCreationDate: null
2026-07-14T20:34:45.9762673Z     }
2026-07-14T20:34:45.9762770Z }
2026-07-14T20:34:45.9877080Z 2026-07-14 17:34:45 INFO  AtualizarEntryDictFacade - Requisicao ao BACEN para atualizar chave realizada em 0 ms. Chave: 12345678901 RequisicaoChaveDto: RequisicaoChaveDto(conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=PF, cpf=null, cnpj=null, nome=Nome Cliente, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=01/01/2001 00:00:00, produto=0001, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), tipoInativacaoChave=USER_REQUESTED) UpdateEntryRequest: class UpdateEntryRequest {
2026-07-14T20:34:45.9917990Z     signature: 
2026-07-14T20:34:45.9976050Z     key: 12345678901
2026-07-14T20:34:45.9976646Z     account: class BrazilianAccount {
2026-07-14T20:34:45.9977431Z         participant: 00360305
2026-07-14T20:34:45.9977762Z         branch: 1234
2026-07-14T20:34:45.9978529Z         accountNumber: 1234567890
2026-07-14T20:34:45.9979028Z         accountType: CACC
2026-07-14T20:34:45.9979604Z         openingDate: 2001-01-01T00:00Z
2026-07-14T20:34:45.9979921Z     }
2026-07-14T20:34:45.9980155Z     reason: USER_REQUESTED
2026-07-14T20:34:45.9980409Z     owner: null
2026-07-14T20:34:45.9980696Z } UpdateEntryResponse: class UpdateEntryResponse {
2026-07-14T20:34:45.9980975Z     signature: null
2026-07-14T20:34:45.9981255Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.9981551Z         key: 12345678901
2026-07-14T20:34:45.9981836Z         keyType: EVP
2026-07-14T20:34:45.9982125Z         account: class BrazilianAccount {
2026-07-14T20:34:45.9982406Z             participant: 00360305
2026-07-14T20:34:45.9982641Z             branch: 1234
2026-07-14T20:34:45.9982945Z             accountNumber: 1234567890
2026-07-14T20:34:45.9983196Z             accountType: CACC
2026-07-14T20:34:45.9983875Z             openingDate: 2026-07-14T17:34:45.973-03:00
2026-07-14T20:34:45.9984176Z         }
2026-07-14T20:34:45.9984435Z         owner: class NaturalPerson {
2026-07-14T20:34:45.9985141Z             type: NATURAL_PERSON
2026-07-14T20:34:45.9985317Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.9985445Z             name: Client Name
2026-07-14T20:34:45.9985567Z             tradeName: Comercial Name
2026-07-14T20:34:45.9985683Z         }
2026-07-14T20:34:45.9985965Z         creationDate: 2026-07-14T17:34:45.973-03:00
2026-07-14T20:34:45.9986182Z         keyOwnershipDate: 2026-07-14T17:34:45.973-03:00
2026-07-14T20:34:45.9986323Z         openClaimCreationDate: null
2026-07-14T20:34:45.9986433Z     }
2026-07-14T20:34:45.9986533Z }
2026-07-14T20:34:45.9987403Z 2026-07-14 17:34:45 INFO  AtualizarEntryDictFacade - Requisicao ao BACEN para atualizar chave realizada em 1 ms. Chave: 12345678901 RequisicaoChaveDto: RequisicaoChaveDto(conta=ContaDto(id=null, agencia=1234, cliente=ClienteDto(id=null, tipoCliente=PJ, cpf=12345678901, cnpj=null, nome=Nome Cliente, razaoSocial=null, nomeFantasia=null, nomeReceita=null, razaoSocialReceita=null, nomeFantasiaReceita=null), numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=01/01/2001 00:00:00, produto=0001, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), tipoInativacaoChave=USER_REQUESTED) UpdateEntryRequest: class UpdateEntryRequest {
2026-07-14T20:34:45.9988107Z     signature: 
2026-07-14T20:34:45.9988220Z     key: 12345678901
2026-07-14T20:34:45.9988348Z     account: class BrazilianAccount {
2026-07-14T20:34:45.9988476Z         participant: 00360305
2026-07-14T20:34:45.9988594Z         branch: 1234
2026-07-14T20:34:45.9988709Z         accountNumber: 1234567890
2026-07-14T20:34:45.9988829Z         accountType: CACC
2026-07-14T20:34:45.9989000Z         openingDate: 2001-01-01T00:00Z
2026-07-14T20:34:45.9989125Z     }
2026-07-14T20:34:45.9989234Z     reason: USER_REQUESTED
2026-07-14T20:34:45.9989350Z     owner: null
2026-07-14T20:34:45.9989501Z } UpdateEntryResponse: class UpdateEntryResponse {
2026-07-14T20:34:45.9989639Z     signature: null
2026-07-14T20:34:45.9989756Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.9989874Z         key: 12345678901
2026-07-14T20:34:45.9989983Z         keyType: EVP
2026-07-14T20:34:45.9990099Z         account: class BrazilianAccount {
2026-07-14T20:34:45.9990222Z             participant: 00360305
2026-07-14T20:34:45.9990335Z             branch: 1234
2026-07-14T20:34:45.9990453Z             accountNumber: 1234567890
2026-07-14T20:34:45.9990574Z             accountType: CACC
2026-07-14T20:34:45.9990766Z             openingDate: 2026-07-14T17:34:45.975-03:00
2026-07-14T20:34:45.9990890Z         }
2026-07-14T20:34:45.9991037Z         owner: class NaturalPerson {
2026-07-14T20:34:45.9991157Z             type: NATURAL_PERSON
2026-07-14T20:34:45.9991276Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.9991391Z             name: Client Name
2026-07-14T20:34:45.9991505Z             tradeName: Comercial Name
2026-07-14T20:34:45.9991698Z         }
2026-07-14T20:34:45.9991877Z         creationDate: 2026-07-14T17:34:45.975-03:00
2026-07-14T20:34:45.9992087Z         keyOwnershipDate: 2026-07-14T17:34:45.975-03:00
2026-07-14T20:34:45.9992228Z         openClaimCreationDate: null
2026-07-14T20:34:45.9992335Z     }
2026-07-14T20:34:45.9992429Z }
2026-07-14T20:34:45.9993111Z 2026-07-14 17:34:45 INFO  AtualizarEntryDictFacade - Requisicao ao BACEN para atualizar chave realizada em 0 ms. Chave: 12345678901 RequisicaoChaveDto: RequisicaoChaveDto(conta=ContaDto(id=null, agencia=1234, cliente=null, numeroConta=1234567890, tipoConta=CACC, participante=00360305, dataAbertura=01/01/2001 00:00:00, produto=0001, quantidadeChavesAtivasVinculadas=null, tipoSistemaConta=null, tipoAtualizacaoConta=null, dataUltimaSituacao=null, canal=null, contaAnterior=null), tipoInativacaoChave=USER_REQUESTED) UpdateEntryRequest: class UpdateEntryRequest {
2026-07-14T20:34:45.9993520Z     signature: 
2026-07-14T20:34:45.9993663Z     key: 12345678901
2026-07-14T20:34:45.9993789Z     account: class BrazilianAccount {
2026-07-14T20:34:45.9993916Z         participant: 00360305
2026-07-14T20:34:45.9994027Z         branch: 1234
2026-07-14T20:34:45.9994137Z         accountNumber: 1234567890
2026-07-14T20:34:45.9994257Z         accountType: CACC
2026-07-14T20:34:45.9994428Z         openingDate: 2001-01-01T00:00Z
2026-07-14T20:34:45.9994620Z     }
2026-07-14T20:34:45.9994743Z     reason: USER_REQUESTED
2026-07-14T20:34:45.9994857Z     owner: null
2026-07-14T20:34:45.9994982Z } UpdateEntryResponse: class UpdateEntryResponse {
2026-07-14T20:34:45.9995106Z     signature: null
2026-07-14T20:34:45.9995224Z     entry: class ExtendedEntry {
2026-07-14T20:34:45.9995343Z         key: 12345678901
2026-07-14T20:34:45.9995459Z         keyType: EVP
2026-07-14T20:34:45.9995576Z         account: class BrazilianAccount {
2026-07-14T20:34:45.9995705Z             participant: 00360305
2026-07-14T20:34:45.9995824Z             branch: 1234
2026-07-14T20:34:45.9995946Z             accountNumber: 1234567890
2026-07-14T20:34:45.9996115Z             accountType: CACC
2026-07-14T20:34:45.9996317Z             openingDate: 2026-07-14T17:34:45.978-03:00
2026-07-14T20:34:45.9996443Z         }
2026-07-14T20:34:45.9996553Z         owner: class NaturalPerson {
2026-07-14T20:34:45.9996673Z             type: NATURAL_PERSON
2026-07-14T20:34:45.9996799Z             taxIdNumber: 12345678901
2026-07-14T20:34:45.9996917Z             name: Client Name
2026-07-14T20:34:45.9997032Z             tradeName: Comercial Name
2026-07-14T20:34:45.9997136Z         }
2026-07-14T20:34:45.9997314Z         creationDate: 2026-07-14T17:34:45.978-03:00
2026-07-14T20:34:45.9997523Z         keyOwnershipDate: 2026-07-14T17:34:45.978-03:00
2026-07-14T20:34:45.9997662Z         openClaimCreationDate: null
2026-07-14T20:34:45.9997771Z     }
2026-07-14T20:34:45.9997865Z }
2026-07-14T20:34:45.9998137Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.03 s - in br.gov.caixa.mpi.dict.v2.facade.directory.AtualizarEntryDictFacadeTest
2026-07-14T20:34:45.9998358Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryRefundsFacadeTest
2026-07-14T20:34:46.1944994Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryRefundsFacade - [SIMPI-DICT] [ListFundsRecoveryRefunds] Iniciando a consulta de Solicitacoes de Devolucoes de uma Recuperação de Valores no bacen, fundsRecoveryId=ca1b9c01-ff9e-4a58-90ab-d31512e15ce0
2026-07-14T20:34:46.2005447Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryRefundsFacade - [SIMPI-DICT] [ListFundsRecoveryRefunds] Iniciando a consulta de Solicitacoes de Devolucoes de uma Recuperação de Valores no bacen, fundsRecoveryId=ca1b9c01-ff9e-4a58-90ab-d31512e15ce0
2026-07-14T20:34:46.2268712Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryRefundsFacade - [SIMPI-DICT] [ListFundsRecoveryRefunds] Busca da solicitacao de devolucao finalizada em 1 ms. GetRefundResponse: listFundsRecoveryInfractionReportsResponse Participant: 00360305
2026-07-14T20:34:46.2269377Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryRefundsFacade - [SIMPI-DICT] [ListFundsRecoveryRefunds] retorno bacen=[]
2026-07-14T20:34:46.2270249Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.221 s - in br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryRefundsFacadeTest
2026-07-14T20:34:46.2270659Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.RequestRefundFundsRecoveryFacadeTest
2026-07-14T20:34:46.2272199Z 2026-07-14 17:34:46 INFO  RefundFundsRecoveryFacade - [SIMPI-DICT][RefundFundsRecovery] Iniciando solicitação de devolução. FundsRecoveryId: 0d01cadc-aeb2-4102-bdcd-9e3ed6dcf6c2
2026-07-14T20:34:46.2272609Z 2026-07-14 17:34:46 INFO  RefundFundsRecoveryFacade - [SIMPI-DICT][RefundFundsRecovery] Solicitação de devolução finalizada em 0 ms.
2026-07-14T20:34:46.2525829Z 2026-07-14 17:34:46 INFO  RefundFundsRecoveryFacade - [SIMPI-DICT][RefundFundsRecovery] Iniciando solicitação de devolução. FundsRecoveryId: nao-e-um-uuid
2026-07-14T20:34:46.2607980Z 2026-07-14 17:34:46 INFO  RefundFundsRecoveryFacade - [SIMPI-DICT][RefundFundsRecovery] Iniciando solicitação de devolução. FundsRecoveryId: c971a159-5aed-403a-971f-e7d9121f7f74
2026-07-14T20:34:46.2608908Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.033 s - in br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.RequestRefundFundsRecoveryFacadeTest
2026-07-14T20:34:46.2805616Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CancelFundsRecoveryTest
2026-07-14T20:34:46.3086369Z 2026-07-14 17:34:46 INFO  CancelFundsRecoveryFacade - [SIMPI][RECUPERACAO_VALOR][CANCELAR] Requisicao ao BACEN iniciada para o fundsRecoveryId bd14b7f1-637d-455d-8cdc-90a0ca993492
2026-07-14T20:34:46.3102668Z 2026-07-14 17:34:46 INFO  CancelFundsRecoveryFacade - [SIMPI][RECUPERACAO_VALOR][CANCELAR] Requisicao ao BACEN para cancelar a Recuperacao de Valores realizada em 1 ms. fundsRecoveryId: bd14b7f1-637d-455d-8cdc-90a0ca993492 CancelFundsRecoveryResponse: CancelFundsRecoveryXmlResponse(signature=, responseTime=2026-07-14T20:34:46.262Z, correlationId=, fundsRecovery=ExtendedCancelFundsRecoveryXml(flowType=AUTOMATED, rootTransactionId=, situationType=SCAM, reportDetails=, contactInformation=class FundsRecoveryContactInformation {
2026-07-14T20:34:46.3103710Z     email: usuario123!@exemplo.com
2026-07-14T20:34:46.3104280Z     phone: +123456789012345
2026-07-14T20:34:46.3104893Z }, id=bd14b7f1-637d-455d-8cdc-90a0ca993492, status=CANCELLED, reporterParticipant=, creationTime=2026-07-14T20:34:46.262Z, lastModified=2026-07-14T20:34:46.262Z))
2026-07-14T20:34:46.3196228Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 s - in br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CancelFundsRecoveryTest
2026-07-14T20:34:46.3441224Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryInfractionReportsFacadeTest
2026-07-14T20:34:46.4016387Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryInfractionReportsFacade - [SIMPI-DICT] [ListFundsRecoveryInfractionReports] Iniciando a consulta de Relatos de Infracao de uma Recuperacao de Valores no bacen, fundsRecoveryId=ca1b9c01-ff9e-4a58-90ab-d31512e15ce0
2026-07-14T20:34:46.4017020Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryInfractionReportsFacade - [SIMPI-DICT] [ListFundsRecoveryInfractionReports] Busca de Relatos de Infracao finalizada em 0 ms. GetRefundResponse: listFundsRecoveryInfractionReportsResponse Participant: 00360305
2026-07-14T20:34:46.4017430Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryInfractionReportsFacade - [SIMPI-DICT] [ListFundsRecoveryInfractionReports] retorno bacen=[]
2026-07-14T20:34:46.4017859Z 2026-07-14 17:34:46 INFO  ListFundsRecoveryInfractionReportsFacade - [SIMPI-DICT] [ListFundsRecoveryInfractionReports] Iniciando a consulta de Relatos de Infracao de uma Recuperacao de Valores no bacen, fundsRecoveryId=ca1b9c01-ff9e-4a58-90ab-d31512e15ce0
2026-07-14T20:34:46.4018394Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.068 s - in br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.ListFundsRecoveryInfractionReportsFacadeTest
2026-07-14T20:34:46.4019013Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CreateFundsRecoveryFacadeTest
2026-07-14T20:34:46.4500782Z 2026-07-14 17:34:46 INFO  CreateFundsRecoveryFacade - [SIMPI-DICT] Solicitando a criacao da Recupracao de Valores no BACEN. FundsRecoveryRequestDto: FundsRecoveryRequestDto(flowType=AUTOMATED, rootTransactionId=12345678901234567890123456789012, situationType=COERCION, reportDetails=null, contactInformationDto=ContactInformationDto(email=email@teste.com, phone=+5561999999999), trackingGraphParametersDto=TrackingGraphParametersDto(minTransactionAmount=200.0, maxTransactions=10, hopWindow=PT24H, maxHops=5))
2026-07-14T20:34:46.4501983Z 2026-07-14 17:34:46 INFO  CreateFundsRecoveryFacade - [SIMPI-DICT] Solicitando a criacao da Recupracao de Valores no BACEN. FundsRecoveryRequestDto: FundsRecoveryRequestDto(flowType=AUTOMATED, rootTransactionId=12345678901234567890123456789012, situationType=COERCION, reportDetails=null, contactInformationDto=ContactInformationDto(email=email@teste.com, phone=+5561999999999), trackingGraphParametersDto=TrackingGraphParametersDto(minTransactionAmount=200.0, maxTransactions=10, hopWindow=PT24H, maxHops=5))
2026-07-14T20:34:46.4542780Z 2026-07-14 17:34:46 INFO  CreateFundsRecoveryFacade - [SIMPI-DICT] Recuperando a criacao da Recuperacao de Valores no BACEN. FundsRecoveryRequest: fundsRecoveryResponse
2026-07-14T20:34:46.4571278Z 2026-07-14 17:34:46 INFO  CreateFundsRecoveryFacade - Requisicao ao BACEN para criar a Recuperacao de VAlores realizada em 3 ms. RecuperacaoValoresDto de requisicao: FundsRecoveryRequestDto(flowType=AUTOMATED, rootTransactionId=12345678901234567890123456789012, situationType=COERCION, reportDetails=null, contactInformationDto=ContactInformationDto(email=email@teste.com, phone=+5561999999999), trackingGraphParametersDto=TrackingGraphParametersDto(minTransactionAmount=200.0, maxTransactions=10, hopWindow=PT24H, maxHops=5)) CreateFundsRecoveryResponse: fundsRecoveryResponse
2026-07-14T20:34:46.4571921Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.048 s - in br.gov.caixa.mpi.dict.v2.facade.fundsrecovery.CreateFundsRecoveryFacadeTest
2026-07-14T20:34:46.4572408Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacadeTest
2026-07-14T20:34:46.5626181Z 2026-07-14 17:34:46 INFO  ListEventNotificationsFacade - [SIMPI-DICT][EVENT-NOTIFICATIONS] Inicia busca de notificacao de eventos no bacen : {}
2026-07-14T20:34:46.5629799Z 930    [INFO] br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacade - [SIMPI-DICT][EVENT-NOTIFICATIONS] Inicia busca de notificacao de eventos no bacen : {}
2026-07-14T20:34:46.5689477Z 2026-07-14 17:34:46 INFO  ListEventNotificationsFacade - [SIMPI-DICT][EVENT-NOTIFICATIONS] Resposta bacen: Mock for ListEventNotificationsResponse, hashCode: 1228179933
2026-07-14T20:34:46.5705369Z 936    [INFO] br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacade - [SIMPI-DICT][EVENT-NOTIFICATIONS] Resposta bacen: Mock for ListEventNotificationsResponse, hashCode: 1228179933
2026-07-14T20:34:46.5767466Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.116 s - in br.gov.caixa.mpi.dict.v2.facade.eventnotification.ListEventNotificationsFacadeTest
2026-07-14T20:34:46.5768355Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.antifraude.CancelamentoFraudMarkersFacadeTest
2026-07-14T20:34:46.6246448Z 2026-07-14 17:34:46 INFO  CancelamentoFraudMarkersFacade - [SIMPI-DICT][INFRACTION-REPORT] Iniciando o cancelamento de marcacao de fraude. IdMarcacaoFraude=a946d533-7f22-42a5-9a9b-e87cd55c0f4d 
2026-07-14T20:34:46.6247460Z 987    [INFO] br.gov.caixa.mpi.dict.v2.facade.antifraude.CancelamentoFraudMarkersFacade - [SIMPI-DICT][INFRACTION-REPORT] Iniciando o cancelamento de marcacao de fraude. IdMarcacaoFraude=a946d533-7f22-42a5-9a9b-e87cd55c0f4d 
2026-07-14T20:34:46.6248012Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.044 s - in br.gov.caixa.mpi.dict.v2.facade.antifraude.CancelamentoFraudMarkersFacadeTest
2026-07-14T20:34:46.6389259Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.antifraude.ListarMarcacoesFraudeFacadeTest
2026-07-14T20:34:46.6391148Z 2026-07-14 17:34:46 INFO  ListarMarcacoesFraudeFacade - Requisicao ao BACEN para listar marcacoes de fraude realizada em 7 ms. taxIdNumber: 12345678901, key: , limit: 1, pageNumber: 0, itemsPerPage: 1, resposta: ListarMarcacoesFraudeResponseDto(responseTime=2026-07-14T17:34:46.625-03:00, correlationId=corr-123, hasMoreElements=false, total=1, fraudMarkers=[MarcacaoFraudeDto(id=87d2bdf7-d3ee-409d-8673-a4182fc3b8dd, status=REGISTERED, fraudType=null, taxIdNumber=12345678901, key=chave@pix.com.br, reportDetails=QR Code falso identificado, creationTime=2026-07-14T17:34:46.625, lastModified=2026-07-14T17:34:46.625, infractionReport=RelatoInfracaoDto(idFimaFim=null, idCriacao=32d1e6f0-6e9a-401f-b947-4abc9fac568c, razao=null, status=null, situacao=null, reportadoPor=null, participanteDebitado=null, participanteCreditado=null, resultadoAnalise=null, detalheAnalise=null, detalhes=null, dataCriacao=null, dataAlteracao=null, marcacaoFraudeId=null, participanteReportante=null, participanteContraparte=null, usuarioPagador=null, usuarioRecebedor=null, telefone=null, email=null, idRecuperacaoValor=null, valorPrevistoBloqueio=null))])
2026-07-14T20:34:46.6393545Z 1004   [INFO] br.gov.caixa.mpi.dict.v2.facade.antifraude.ListarMarcacoesFraudeFacade - Requisicao ao BACEN para listar marcacoes de fraude realizada em 7 ms. taxIdNumber: 12345678901, key: , limit: 1, pageNumber: 0, itemsPerPage: 1, resposta: ListarMarcacoesFraudeResponseDto(responseTime=2026-07-14T17:34:46.625-03:00, correlationId=corr-123, hasMoreElements=false, total=1, fraudMarkers=[MarcacaoFraudeDto(id=87d2bdf7-d3ee-409d-8673-a4182fc3b8dd, status=REGISTERED, fraudType=null, taxIdNumber=12345678901, key=chave@pix.com.br, reportDetails=QR Code falso identificado, creationTime=2026-07-14T17:34:46.625, lastModified=2026-07-14T17:34:46.625, infractionReport=RelatoInfracaoDto(idFimaFim=null, idCriacao=32d1e6f0-6e9a-401f-b947-4abc9fac568c, razao=null, status=null, situacao=null, reportadoPor=null, participanteDebitado=null, participanteCreditado=null, resultadoAnalise=null, detalheAnalise=null, detalhes=null, dataCriacao=null, dataAlteracao=null, marcacaoFraudeId=null, participanteReportante=null, participanteContraparte=null, usuarioPagador=null, usuarioRecebedor=null, telefone=null, email=null, idRecuperacaoValor=null, valorPrevistoBloqueio=null))])
2026-07-14T20:34:46.6450937Z 2026-07-14 17:34:46 INFO  ListarMarcacoesFraudeFacade - Requisicao ao BACEN para listar marcacoes de fraude realizada em 0 ms. taxIdNumber: 12345678901, key: null, limit: null, pageNumber: null, itemsPerPage: null, resposta: ListarMarcacoesFraudeResponseDto(responseTime=2026-07-14T17:34:46.637-03:00, correlationId=corr-123, hasMoreElements=false, total=1, fraudMarkers=[MarcacaoFraudeDto(id=7b1b31ac-ab6b-480d-a943-3b6306aad4ad, status=REGISTERED, fraudType=null, taxIdNumber=12345678901, key=chave@pix.com.br, reportDetails=QR Code falso identificado, creationTime=2026-07-14T17:34:46.637, lastModified=2026-07-14T17:34:46.637, infractionReport=RelatoInfracaoDto(idFimaFim=null, idCriacao=7147b943-0604-47b4-ac89-bab26fc768b2, razao=null, status=null, situacao=null, reportadoPor=null, participanteDebitado=null, participanteCreditado=null, resultadoAnalise=null, detalheAnalise=null, detalhes=null, dataCriacao=null, dataAlteracao=null, marcacaoFraudeId=null, participanteReportante=null, participanteContraparte=null, usuarioPagador=null, usuarioRecebedor=null, telefone=null, email=null, idRecuperacaoValor=null, valorPrevistoBloqueio=null))])
2026-07-14T20:34:46.6453275Z 1010   [INFO] br.gov.caixa.mpi.dict.v2.facade.antifraude.ListarMarcacoesFraudeFacade - Requisicao ao BACEN para listar marcacoes de fraude realizada em 0 ms. taxIdNumber: 12345678901, key: null, limit: null, pageNumber: null, itemsPerPage: null, resposta: ListarMarcacoesFraudeResponseDto(responseTime=2026-07-14T17:34:46.637-03:00, correlationId=corr-123, hasMoreElements=false, total=1, fraudMarkers=[MarcacaoFraudeDto(id=7b1b31ac-ab6b-480d-a943-3b6306aad4ad, status=REGISTERED, fraudType=null, taxIdNumber=12345678901, key=chave@pix.com.br, reportDetails=QR Code falso identificado, creationTime=2026-07-14T17:34:46.637, lastModified=2026-07-14T17:34:46.637, infractionReport=RelatoInfracaoDto(idFimaFim=null, idCriacao=7147b943-0604-47b4-ac89-bab26fc768b2, razao=null, status=null, situacao=null, reportadoPor=null, participanteDebitado=null, participanteCreditado=null, resultadoAnalise=null, detalheAnalise=null, detalhes=null, dataCriacao=null, dataAlteracao=null, marcacaoFraudeId=null, participanteReportante=null, participanteContraparte=null, usuarioPagador=null, usuarioRecebedor=null, telefone=null, email=null, idRecuperacaoValor=null, valorPrevistoBloqueio=null))])
2026-07-14T20:34:46.6500473Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.016 s - in br.gov.caixa.mpi.dict.v2.facade.antifraude.ListarMarcacoesFraudeFacadeTest
2026-07-14T20:34:46.6501175Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.antifraude.ConsultaMarcacaoFraudeFacadeTest
2026-07-14T20:34:46.6502270Z 2026-07-14 17:34:46 INFO  ConsultaMarcacaoFraudeFacade - Requisicao ao BACEN para consultar marcacao de fraude realizada em 1 ms. fraudMarkerId: 91d65e98-97c0-4b0f-b577-73625da1f9fc resposta ConsultarMarcacaoFraudeResponseDto: ConsultarMarcacaoFraudeResponseDto(correlationId=a9f13566e19f5ca51329479a5bae60c5, responseTime=2026-07-14T17:34:46.647-03:00, fraudMarker=MarcacaoFraudeDto(id=17d72054-4402-49df-ae52-a2699cb54e45, status=CANCELLED, fraudType=APPLICATION_FRAUD, taxIdNumber=12345678901, key=12345678901, reportDetails=details, creationTime=2026-07-14T17:34:46.647, lastModified=2026-07-14T17:34:46.647, infractionReport=null))
2026-07-14T20:34:46.6506391Z 1020   [INFO] br.gov.caixa.mpi.dict.v2.facade.antifraude.ConsultaMarcacaoFraudeFacade - Requisicao ao BACEN para consultar marcacao de fraude realizada em 1 ms. fraudMarkerId: 91d65e98-97c0-4b0f-b577-73625da1f9fc resposta ConsultarMarcacaoFraudeResponseDto: ConsultarMarcacaoFraudeResponseDto(correlationId=a9f13566e19f5ca51329479a5bae60c5, responseTime=2026-07-14T17:34:46.647-03:00, fraudMarker=MarcacaoFraudeDto(id=17d72054-4402-49df-ae52-a2699cb54e45, status=CANCELLED, fraudType=APPLICATION_FRAUD, taxIdNumber=12345678901, key=12345678901, reportDetails=details, creationTime=2026-07-14T17:34:46.647, lastModified=2026-07-14T17:34:46.647, infractionReport=null))
2026-07-14T20:34:46.6520489Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s - in br.gov.caixa.mpi.dict.v2.facade.antifraude.ConsultaMarcacaoFraudeFacadeTest
2026-07-14T20:34:46.6524331Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.antifraude.CriacaoMarcacaoFraudeFacadeTest
2026-07-14T20:34:46.6552285Z 2026-07-14 17:34:46 INFO  CriacaoMarcacaoFraudeFacade - [SIMPI-DICT][INFRACTION-REPORT] Criando marcacao de fraude: a946d533-7f22-42a5-9a9b-e87cd55c0f4dDto: CriarMarcacaoFraudeDto(cpfCnpj=12345678901, chave=12345678901, tipoFraude=APPLICATION_FRAUD, detalhe=null)
2026-07-14T20:34:46.6553088Z 1026   [INFO] br.gov.caixa.mpi.dict.v2.facade.antifraude.CriacaoMarcacaoFraudeFacade - [SIMPI-DICT][INFRACTION-REPORT] Criando marcacao de fraude: a946d533-7f22-42a5-9a9b-e87cd55c0f4dDto: CriarMarcacaoFraudeDto(cpfCnpj=12345678901, chave=12345678901, tipoFraude=APPLICATION_FRAUD, detalhe=null)
2026-07-14T20:34:46.6689979Z 2026-07-14 17:34:46 INFO  CriacaoMarcacaoFraudeFacade - Requisicao ao BACEN para marcar fraude realizada em 2 ms. Dto de requisicao: CriarMarcacaoFraudeDto(cpfCnpj=12345678901, chave=12345678901, tipoFraude=APPLICATION_FRAUD, detalhe=null) Dto de resposta: CriarMarcacaoFraudeRespostaDto(idMarcacaoFraudeBacen=5ad8737c-3fef-463c-9da1-f827b7b10a0a, cpfCnpj=12345678901, chave=12345679801, tipoFraude=MULE_ACCOUNT, detalhe=null, situacao=REGISTERED, correlationId=a9f13566e19f5ca51329479a5bae60c5, dataRespostaBacen=2026-07-14T14:34:46.653, dataMarcacaoFraude=2026-07-14T14:34:46.653, dataAlteracaoFraude=2026-07-14T14:34:46.653, idRequisicao=a946d533-7f22-42a5-9a9b-e87cd55c0f4d) CreateFraudMarkerRequest: class CreateFraudMarkerRequest {
2026-07-14T20:34:46.6691000Z     signature: 
2026-07-14T20:34:46.6691882Z     participant: 00360305
2026-07-14T20:34:46.6692146Z     fraudMarker: class FraudMarker {
2026-07-14T20:34:46.6692383Z         taxIdNumber: 12345678901
2026-07-14T20:34:46.6692627Z         key: 12345678901
2026-07-14T20:34:46.6692856Z         fraudType: APPLICATION_FRAUD
2026-07-14T20:34:46.6693058Z     }
2026-07-14T20:34:46.6693398Z     requestId: a946d533-7f22-42a5-9a9b-e87cd55c0f4d
2026-07-14T20:34:46.6693704Z } CreateFraudMarkerResponse: class CreateFraudMarkerResponse {
2026-07-14T20:34:46.6694005Z     signature: null
2026-07-14T20:34:46.6694351Z     responseTime: 2026-07-14T17:34:46.653-03:00
2026-07-14T20:34:46.6694735Z     correlationId: a9f13566e19f5ca51329479a5bae60c5
2026-07-14T20:34:46.6695432Z     fraudMarker: class ExtendedFraudMarker {
2026-07-14T20:34:46.6695628Z         taxIdNumber: 12345678901
2026-07-14T20:34:46.6695753Z         key: 12345679801
2026-07-14T20:34:46.6695886Z         fraudType: MULE_ACCOUNT
2026-07-14T20:34:46.6696009Z         details: details
2026-07-14T20:34:46.6696274Z         id: 5ad8737c-3fef-463c-9da1-f827b7b10a0a
2026-07-14T20:34:46.6696403Z         status: REGISTERED
2026-07-14T20:34:46.6696610Z         creationTime: 2026-07-14T17:34:46.653-03:00
2026-07-14T20:34:46.6696820Z         lastModified: 2026-07-14T17:34:46.653-03:00
2026-07-14T20:34:46.6697049Z         infractionReport: null
2026-07-14T20:34:46.6697161Z     }
2026-07-14T20:34:46.6697259Z }
2026-07-14T20:34:46.6698228Z 1028   [INFO] br.gov.caixa.mpi.dict.v2.facade.antifraude.CriacaoMarcacaoFraudeFacade - Requisicao ao BACEN para marcar fraude realizada em 2 ms. Dto de requisicao: CriarMarcacaoFraudeDto(cpfCnpj=12345678901, chave=12345678901, tipoFraude=APPLICATION_FRAUD, detalhe=null) Dto de resposta: CriarMarcacaoFraudeRespostaDto(idMarcacaoFraudeBacen=5ad8737c-3fef-463c-9da1-f827b7b10a0a, cpfCnpj=12345678901, chave=12345679801, tipoFraude=MULE_ACCOUNT, detalhe=null, situacao=REGISTERED, correlationId=a9f13566e19f5ca51329479a5bae60c5, dataRespostaBacen=2026-07-14T14:34:46.653, dataMarcacaoFraude=2026-07-14T14:34:46.653, dataAlteracaoFraude=2026-07-14T14:34:46.653, idRequisicao=a946d533-7f22-42a5-9a9b-e87cd55c0f4d) CreateFraudMarkerRequest: class CreateFraudMarkerRequest {
2026-07-14T20:34:46.6698992Z     signature: 
2026-07-14T20:34:46.6699107Z     participant: 00360305
2026-07-14T20:34:46.6699233Z     fraudMarker: class FraudMarker {
2026-07-14T20:34:46.6699358Z         taxIdNumber: 12345678901
2026-07-14T20:34:46.6699478Z         key: 12345678901
2026-07-14T20:34:46.6699600Z         fraudType: APPLICATION_FRAUD
2026-07-14T20:34:46.6699705Z     }
2026-07-14T20:34:46.6699883Z     requestId: a946d533-7f22-42a5-9a9b-e87cd55c0f4d
2026-07-14T20:34:46.6700041Z } CreateFraudMarkerResponse: class CreateFraudMarkerResponse {
2026-07-14T20:34:46.6700173Z     signature: null
2026-07-14T20:34:46.6700357Z     responseTime: 2026-07-14T17:34:46.653-03:00
2026-07-14T20:34:46.6700509Z     correlationId: a9f13566e19f5ca51329479a5bae60c5
2026-07-14T20:34:46.6700648Z     fraudMarker: class ExtendedFraudMarker {
2026-07-14T20:34:46.6700773Z         taxIdNumber: 12345678901
2026-07-14T20:34:46.6700887Z         key: 12345679801
2026-07-14T20:34:46.6701002Z         fraudType: MULE_ACCOUNT
2026-07-14T20:34:46.6701117Z         details: details
2026-07-14T20:34:46.6701290Z         id: 5ad8737c-3fef-463c-9da1-f827b7b10a0a
2026-07-14T20:34:46.6701420Z         status: REGISTERED
2026-07-14T20:34:46.6701609Z         creationTime: 2026-07-14T17:34:46.653-03:00
2026-07-14T20:34:46.6701813Z         lastModified: 2026-07-14T17:34:46.653-03:00
2026-07-14T20:34:46.6701948Z         infractionReport: null
2026-07-14T20:34:46.6702055Z     }
2026-07-14T20:34:46.6702149Z }
2026-07-14T20:34:46.6702434Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in br.gov.caixa.mpi.dict.v2.facade.antifraude.CriacaoMarcacaoFraudeFacadeTest
2026-07-14T20:34:46.6702651Z [INFO] Running br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacadeTest
2026-07-14T20:34:46.7576473Z 2026-07-14 17:34:46 INFO  GetCheckChavesFacade - [SIMPI][DICT][KEY-CHECK][v2] Iniciado a requisicao de chaves na base do Bacen ChavesCheckDto: []
2026-07-14T20:34:46.7577196Z 1121   [INFO] br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacade - [SIMPI][DICT][KEY-CHECK][v2] Iniciado a requisicao de chaves na base do Bacen ChavesCheckDto: []
2026-07-14T20:34:46.7577837Z 2026-07-14 17:34:46 INFO  GetCheckChavesFacade - [SIMPI][DICT][KEY-CHECK][v2] Requisicao de chaves na base do Bacen finalizado em 2, ms. ChavesCheckDto: [class ExtendedKey {
2026-07-14T20:34:46.7578526Z     hasEntry: null
2026-07-14T20:34:46.7578864Z     key: teste@gmail.com
2026-07-14T20:34:46.7579130Z }] MaxAge: null 
2026-07-14T20:34:46.7579779Z 1123   [INFO] br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacade - [SIMPI][DICT][KEY-CHECK][v2] Requisicao de chaves na base do Bacen finalizado em 2, ms. ChavesCheckDto: [class ExtendedKey {
2026-07-14T20:34:46.7580559Z     hasEntry: null
2026-07-14T20:34:46.7580769Z     key: teste@gmail.com
2026-07-14T20:34:46.7580968Z }] MaxAge: null 
2026-07-14T20:34:46.7581417Z 2026-07-14 17:34:46 INFO  GetCheckChavesFacade - [SIMPI][DICT][KEY-CHECK][v2] Verificacao da existencia das chaves finalizada em 2 ms. ChavesCheckDto: ChavesCheckDto(chaves=[ChaveCheckDto(id=null, temChave=null, chave=teste@gmail.com, maxAge=null)]) 
2026-07-14T20:34:46.7581972Z 1124   [INFO] br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacade - [SIMPI][DICT][KEY-CHECK][v2] Verificacao da existencia das chaves finalizada em 2 ms. ChavesCheckDto: ChavesCheckDto(chaves=[ChaveCheckDto(id=null, temChave=null, chave=teste@gmail.com, maxAge=null)]) 
2026-07-14T20:34:46.7582527Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.087 s - in br.gov.caixa.mpi.dict.v2.facade.check.GetCheckChavesFacadeTest
2026-07-14T20:34:46.7582765Z [INFO] Running br.gov.caixa.mpi.dict.ejb.RefundEjbTest
2026-07-14T20:34:46.8326317Z 2026-07-14 17:34:46 INFO  RefundEjb - [SIMPI-DICT] [DEVOLUCOES] Solicitando a criacao da solicitacao a lista de devolucoes
2026-07-14T20:34:46.8327225Z 1194   [INFO] br.gov.caixa.mpi.dict.ejb.RefundEjb - [SIMPI-DICT] [DEVOLUCOES] Solicitando a criacao da solicitacao a lista de devolucoes
2026-07-14T20:34:46.8327746Z 2026-07-14 17:34:46 INFO  DevolucaoFactory - [SIMPI-DICT][MED] Montado o objeto DevolucaoDto a partir do retorno do Bacen. ExtendedRefund: class ExtendedRefund {
2026-07-14T20:34:46.8328102Z     TransactionId: null
2026-07-14T20:34:46.8328382Z     RefundReason: OPERATIONAL_FLAW
2026-07-14T20:34:46.8328828Z     RefundAmount: null
2026-07-14T20:34:46.8329126Z     RefundDetails: null
2026-07-14T20:34:46.8330907Z     Id: 937d3415-5d8c-44bd-9d0e-0c0026376574
2026-07-14T20:34:46.8331089Z     Status: OPEN
2026-07-14T20:34:46.8331260Z     ContestedParticipant: null
2026-07-14T20:34:46.8331435Z     RequestingParticipant: null
2026-07-14T20:34:46.8331663Z     CreationTime: 2026-07-14T20:31:46.822Z
2026-07-14T20:34:46.8331926Z     LastModified: 2026-07-14T20:31:46.822Z
2026-07-14T20:34:46.8332229Z     InfractionReportId: null
2026-07-14T20:34:46.8333199Z     fundsRecoveryId: null
2026-07-14T20:34:46.8333435Z     AnalysisResult: null
2026-07-14T20:34:46.8333762Z     AnalysisDetails: null
2026-07-14T20:34:46.8333947Z     RefundRejectionReason: null
2026-07-14T20:34:46.8334123Z     RefundTransactionId: null
2026-07-14T20:34:46.8334304Z     RefundAccount: null
2026-07-14T20:34:46.8334459Z     MonitorAccount: null
2026-07-14T20:34:46.8334812Z     EffectiveRefundedAmount: null
2026-07-14T20:34:46.8335077Z }
2026-07-14T20:34:46.8335474Z 1195   [INFO] br.gov.caixa.mpi.dict.factory.DevolucaoFactory - [SIMPI-DICT][MED] Montado o objeto DevolucaoDto a partir do retorno do Bacen. ExtendedRefund: class ExtendedRefund {
2026-07-14T20:34:46.8335782Z     TransactionId: null
2026-07-14T20:34:46.8336023Z     RefundReason: OPERATIONAL_FLAW
2026-07-14T20:34:46.8336255Z     RefundAmount: null
2026-07-14T20:34:46.8336478Z     RefundDetails: null
2026-07-14T20:34:46.8336802Z     Id: 937d3415-5d8c-44bd-9d0e-0c0026376574
2026-07-14T20:34:46.8337150Z     Status: OPEN
2026-07-14T20:34:46.8338793Z     ContestedParticipant: null
2026-07-14T20:34:46.8338971Z     RequestingParticipant: null
2026-07-14T20:34:46.8339208Z     CreationTime: 2026-07-14T20:31:46.822Z
2026-07-14T20:34:46.8339451Z     LastModified: 2026-07-14T20:31:46.822Z
2026-07-14T20:34:46.8339636Z     InfractionReportId: null
2026-07-14T20:34:46.8339807Z     fundsRecoveryId: null
2026-07-14T20:34:46.8339979Z     AnalysisResult: null
2026-07-14T20:34:46.8340143Z     AnalysisDetails: null
2026-07-14T20:34:46.8340311Z     RefundRejectionReason: null
2026-07-14T20:34:46.8340479Z     RefundTransactionId: null
2026-07-14T20:34:46.8340642Z     RefundAccount: null
2026-07-14T20:34:46.8340804Z     MonitorAccount: null
2026-07-14T20:34:46.8340977Z     EffectiveRefundedAmount: null
2026-07-14T20:34:46.8341182Z }
2026-07-14T20:34:46.8343549Z 2026-07-14 17:34:46 INFO  RefundEjb - [SIMPI-DICT] [DEVOLUCOES] Requisicao ao BACEN para buscar devolucoes realizada em: 3 ms. QueryParams: {modifiedAfter=2010-08-14T22:15:00Z, modifiedBefore=2022-01-10T14:20:00Z, Participant=00360305, limit=200, includeDetails=false, participantRole=REQUESTING} Devolucoes: [DevolucaoDto(id=null, idTransacao=null, razao=OPERATIONAL_FLAW, valor=0.00, idRelatoInfracao=null, idPagamentoDevolucao=null, detalhes=null, codigoBloqueio=null, valorBloqueio=null, protocoloBacen=937d3415-5d8c-44bd-9d0e-0c0026376574, status=OPEN, pspRequisitante=null, pspContestado=null, dataCriacao=2026-07-14T20:31:46Z, dataAtualizacao=2026-07-14T20:31:46Z, resultadoAnalise=null, detalhesAnalise=null, razaoRejeicao=null, usuarioInclusao=null, usuarioPagador=null, usuarioRecebedor=null, codigoRecuperacaoValores=null, codigoTransacaoDevolucao=null, valorEfetivoDevolvido=null, contaDevolucao=null, monitorarConta=null)]
2026-07-14T20:34:46.8345407Z 1197   [INFO] br.gov.caixa.mpi.dict.ejb.RefundEjb - [SIMPI-DICT] [DEVOLUCOES] Requisicao ao BACEN para buscar devolucoes realizada em: 3 ms. QueryParams: {modifiedAfter=2010-08-14T22:15:00Z, modifiedBefore=2022-01-10T14:20:00Z, Participant=00360305, limit=200, includeDetails=false, participantRole=REQUESTING} Devolucoes: [DevolucaoDto(id=null, idTransacao=null, razao=OPERATIONAL_FLAW, valor=0.00, idRelatoInfracao=null, idPagamentoDevolucao=null, detalhes=null, codigoBloqueio=null, valorBloqueio=null, protocoloBacen=937d3415-5d8c-44bd-9d0e-0c0026376574, status=OPEN, pspRequisitante=null, pspContestado=null, dataCriacao=2026-07-14T20:31:46Z, dataAtualizacao=2026-07-14T20:31:46Z, resultadoAnalise=null, detalhesAnalise=null, razaoRejeicao=null, usuarioInclusao=null, usuarioPagador=null, usuarioRecebedor=null, codigoRecuperacaoValores=null, codigoTransacaoDevolucao=null, valorEfetivoDevolvido=null, contaDevolucao=null, monitorarConta=null)]
2026-07-14T20:34:46.8346423Z 2026-07-14 17:34:46 INFO  RefundEjb - [SIMPI-DICT] [DEVOLUCOES] Foram retornadas 1 devolucoes do Bacen em que a caixa e null possui mais elementos true
2026-07-14T20:34:46.8346866Z 1197   [INFO] br.gov.caixa.mpi.dict.ejb.RefundEjb - [SIMPI-DICT] [DEVOLUCOES] Foram retornadas 1 devolucoes do Bacen em que a caixa e null possui mais elementos true
2026-07-14T20:34:46.8417449Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.074 s - in br.gov.caixa.mpi.dict.ejb.RefundEjbTest
2026-07-14T20:34:46.8418255Z [INFO] Running br.gov.caixa.mpi.dict.ejb.AntifraudEjbTest
2026-07-14T20:34:47.0307848Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.197 s - in br.gov.caixa.mpi.dict.ejb.AntifraudEjbTest
2026-07-14T20:34:47.0386400Z [INFO] Running br.gov.caixa.mpi.dict.ejb.InfractionReportEjbTest
2026-07-14T20:34:47.5629105Z 2026-07-14 17:34:47 INFO  InfractionReportEjb - [OPEN] [INFRACTIONREPORT] xml: class CreateInfractionReportRequest {
2026-07-14T20:34:47.5629714Z     signature: 
2026-07-14T20:34:47.5630025Z     participant: 00360305
2026-07-14T20:34:47.5630312Z     infractionReport: null
2026-07-14T20:34:47.5630580Z }
2026-07-14T20:34:47.5631003Z 1927   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [OPEN] [INFRACTIONREPORT] xml: class CreateInfractionReportRequest {
2026-07-14T20:34:47.5631648Z     signature: 
2026-07-14T20:34:47.5631975Z     participant: 00360305
2026-07-14T20:34:47.5632446Z     infractionReport: null
2026-07-14T20:34:47.5632680Z }
2026-07-14T20:34:47.5633050Z 1927   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [OPEN] [INFRACTIONREPORT] xml: class CreateInfractionReportRequest {
2026-07-14T20:34:47.5633750Z     signature: 
2026-07-14T20:34:47.5633942Z     participant: 00360305
2026-07-14T20:34:47.5634083Z     infractionReport: null
2026-07-14T20:34:47.5634210Z }
2026-07-14T20:34:47.5634699Z 2026-07-14 17:34:47 INFO  InfractionReportEjb - [OPEN] [INFRACTIONREPORT] xml: class CreateInfractionReportRequest {
2026-07-14T20:34:47.5635130Z     signature: 
2026-07-14T20:34:47.5635270Z     participant: null
2026-07-14T20:34:47.5635390Z     infractionReport: null
2026-07-14T20:34:47.5635502Z }
2026-07-14T20:34:47.5635767Z 1931   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [OPEN] [INFRACTIONREPORT] xml: class CreateInfractionReportRequest {
2026-07-14T20:34:47.5635952Z     signature: 
2026-07-14T20:34:47.5636061Z     participant: null
2026-07-14T20:34:47.5636173Z     infractionReport: null
2026-07-14T20:34:47.5636275Z }
2026-07-14T20:34:47.5636524Z 1931   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [OPEN] [INFRACTIONREPORT] xml: class CreateInfractionReportRequest {
2026-07-14T20:34:47.5636671Z     signature: 
2026-07-14T20:34:47.5636778Z     participant: null
2026-07-14T20:34:47.5636887Z     infractionReport: null
2026-07-14T20:34:47.5637007Z }
2026-07-14T20:34:47.5680089Z 2026-07-14 17:34:47 INFO  InfractionReportEjb - [SIMPI-DICT] [INFRACTIONREPORT] retorno bacen null
2026-07-14T20:34:47.5680699Z 1937   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT] [INFRACTIONREPORT] retorno bacen null
2026-07-14T20:34:47.5681182Z 1937   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT] [INFRACTIONREPORT] retorno bacen null
2026-07-14T20:34:47.5702777Z 2026-07-14 17:34:47 INFO  InfractionReportEjb - [SIMPI-DICT][INFRACTION-REPORT] Inciando a requisicao de recebimento do relato de infracao.
2026-07-14T20:34:47.5703360Z 1940   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT][INFRACTION-REPORT] Inciando a requisicao de recebimento do relato de infracao.
2026-07-14T20:34:47.5703927Z 1940   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT][INFRACTION-REPORT] Inciando a requisicao de recebimento do relato de infracao.
2026-07-14T20:34:47.5704429Z 2026-07-14 17:34:47 INFO  InfractionReportEjb - [SIMPI-DICT][INFRACTION-REPORT] Requisicao de recebimento do relato de infracao finalizada em 1 ms.
2026-07-14T20:34:47.5705115Z 1941   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT][INFRACTION-REPORT] Requisicao de recebimento do relato de infracao finalizada em 1 ms.
2026-07-14T20:34:47.5705609Z 1941   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT][INFRACTION-REPORT] Requisicao de recebimento do relato de infracao finalizada em 1 ms.
2026-07-14T20:34:47.5787982Z 2026-07-14 17:34:47 INFO  InfractionReportEjb - [SIMPI-DICT] [InfractionReport] Solicitando Relatos no bacen 
2026-07-14T20:34:47.5788763Z 1949   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT] [InfractionReport] Solicitando Relatos no bacen 
2026-07-14T20:34:47.5789228Z 1949   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT] [InfractionReport] Solicitando Relatos no bacen 
2026-07-14T20:34:47.5789808Z 2026-07-14 17:34:47 INFO  InfractionReportEjb - [SIMPI-DICT] [InfractionReport] Requisicao ao Bacen para buscar relatos realizada em 0 ms. Foram retornados 0 do bacen.  Possui mais elementos: false
2026-07-14T20:34:47.5790930Z 1949   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT] [InfractionReport] Requisicao ao Bacen para buscar relatos realizada em 0 ms. Foram retornados 0 do bacen.  Possui mais elementos: false
2026-07-14T20:34:47.5791698Z 1949   [INFO] br.gov.caixa.mpi.dict.ejb.InfractionReportEjb - [SIMPI-DICT] [InfractionReport] Requisicao ao Bacen para buscar relatos realizada em 0 ms. Foram retornados 0 do bacen.  Possui mais elementos: false
2026-07-14T20:34:47.5858782Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.546 s - in br.gov.caixa.mpi.dict.ejb.InfractionReportEjbTest
2026-07-14T20:34:47.5862884Z [INFO] Running br.gov.caixa.mpi.dict.ejb.hsm.HsmManagerTest
2026-07-14T20:34:47.9739123Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.385 s - in br.gov.caixa.mpi.dict.ejb.hsm.HsmManagerTest
2026-07-14T20:34:47.9739463Z [INFO] Running br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest
2026-07-14T20:34:48.2959404Z 2026-07-14 17:34:48 ERROR KeystoreHolder - [KeystoreHolder] Erro ao obter chave publica: null
2026-07-14T20:34:48.2959949Z java.lang.NullPointerException
2026-07-14T20:34:48.2960305Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.lambda$getPublicKey$0(KeystoreHolder.java:58)
2026-07-14T20:34:48.2960743Z 	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
2026-07-14T20:34:48.2961445Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.getPublicKey(KeystoreHolder.java:54)
2026-07-14T20:34:48.2961735Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest.getPublicKeywithinTtlusesCachedMap(KeystoreHolderTest.java:137)
2026-07-14T20:34:48.2961946Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:48.2962132Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:48.2962342Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:48.2962532Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:48.2962722Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:48.2963089Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:48.2963611Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:48.2963846Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:48.2964134Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:48.2964366Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:48.2964693Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:48.2965348Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:48.2965704Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:48.2965948Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:48.2966176Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:48.2966402Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:48.2966630Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:48.2966861Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:48.2967100Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:48.2967345Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2967644Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:48.2967875Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:48.2968189Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:48.2968462Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:48.2968694Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2968923Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.2969137Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.2969342Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.2969571Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2969792Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.2970010Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.2970195Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.2970419Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.2970673Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.2970902Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2971138Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.2971378Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.2971583Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.2971802Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2972022Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.2972235Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.2972420Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.2972638Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.2972904Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.2973182Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2973422Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.2973629Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.2973837Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.2974061Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2974281Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.2974494Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.2974994Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:48.2975261Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:48.2975499Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:48.2975722Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:48.2975932Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:48.2976159Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:48.2976365Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:48.2976577Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:48.2976799Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:48.2977028Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:48.2977249Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:48.2977465Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:48.2977668Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:48.2977860Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:48.2978277Z 2660   [ERROR] br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder - [KeystoreHolder] Erro ao obter chave publica: null
2026-07-14T20:34:48.2978451Z java.lang.NullPointerException
2026-07-14T20:34:48.2978668Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.lambda$getPublicKey$0(KeystoreHolder.java:58)
2026-07-14T20:34:48.2978880Z 	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
2026-07-14T20:34:48.2979085Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.getPublicKey(KeystoreHolder.java:54)
2026-07-14T20:34:48.2979304Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest.getPublicKeywithinTtlusesCachedMap(KeystoreHolderTest.java:137)
2026-07-14T20:34:48.2979507Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:48.2979685Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:48.2979881Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:48.2980066Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:48.2980247Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:48.2980452Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:48.2980678Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:48.2980919Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:48.2981143Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:48.2981373Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:48.2981631Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:48.2981891Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:48.2982179Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:48.2982418Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:48.2982719Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:48.2982958Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:48.2983191Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:48.2983425Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:48.2983660Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:48.2983905Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2984136Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:48.2984380Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:48.2984679Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:48.2984923Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:48.2985147Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2985372Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.2985586Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.2985833Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.2986052Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2986276Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.2986491Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.2986682Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.2986903Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.2987161Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.2987393Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2987614Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.2987827Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.2988106Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.2988429Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2988672Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.2988890Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.2989075Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.2989332Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.2989599Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.2989837Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2990056Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.2990265Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.2990467Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.2990693Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.2990914Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.2991135Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.2991383Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:48.2991652Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:48.2991883Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:48.2992093Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:48.2992299Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:48.2992536Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:48.2992797Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:48.2993004Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:48.2993223Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:48.2993445Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:48.2993666Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:48.2993878Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:48.2994082Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:48.2994272Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:48.2994634Z 2660   [ERROR] br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder - [KeystoreHolder] Erro ao obter chave publica: null
2026-07-14T20:34:48.2994806Z java.lang.NullPointerException
2026-07-14T20:34:48.2994978Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.lambda$getPublicKey$0(KeystoreHolder.java:58)
2026-07-14T20:34:48.2995184Z 	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
2026-07-14T20:34:48.2995390Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.getPublicKey(KeystoreHolder.java:54)
2026-07-14T20:34:48.2995626Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest.getPublicKeywithinTtlusesCachedMap(KeystoreHolderTest.java:137)
2026-07-14T20:34:48.2995821Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:48.2995995Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:48.2996195Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:48.2996423Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:48.2996612Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:48.2996815Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:48.2997043Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:48.2997274Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:48.2997494Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:48.2997720Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:48.2997997Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:48.2998399Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:48.2998655Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:48.2998891Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:48.2999117Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:48.2999346Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:48.2999585Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:48.2999815Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:48.3000100Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:48.3000337Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3000568Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:48.3000801Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:48.3001031Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:48.3001260Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:48.3001485Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3001727Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3001943Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3002156Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3002373Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3002590Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3002801Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3003007Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3003229Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3003613Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3003861Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3004092Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3004301Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3004519Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3004811Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3005032Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3005245Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3005437Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3005655Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3005907Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3006125Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3006345Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3006549Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3006768Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3006988Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3007243Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3007458Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3007698Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:48.3007963Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:48.3008278Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:48.3008494Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:48.3008708Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:48.3008921Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:48.3009126Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:48.3009324Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:48.3009537Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:48.3009763Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:48.3009987Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:48.3010202Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:48.3010418Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:48.3010668Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:48.3010947Z 2026-07-14 17:34:48 ERROR KeystoreHolder - [KeystoreHolder] Erro ao obter chave publica: null
2026-07-14T20:34:48.3011154Z java.lang.NullPointerException
2026-07-14T20:34:48.3011343Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.lambda$getPublicKey$0(KeystoreHolder.java:58)
2026-07-14T20:34:48.3011563Z 	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
2026-07-14T20:34:48.3011760Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.getPublicKey(KeystoreHolder.java:54)
2026-07-14T20:34:48.3011980Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest.getPublicKeywithinTtlusesCachedMap(KeystoreHolderTest.java:139)
2026-07-14T20:34:48.3012177Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:48.3012358Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:48.3012564Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:48.3012749Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:48.3012930Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:48.3013136Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:48.3013362Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:48.3013594Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:48.3013813Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:48.3014040Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:48.3014294Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:48.3014678Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:48.3014930Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:48.3015171Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:48.3015402Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:48.3015633Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:48.3015864Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:48.3016124Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:48.3016364Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:48.3016610Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3016843Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:48.3017454Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:48.3017690Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:48.3017923Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:48.3018261Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3018504Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3018710Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3018918Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3019143Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3019365Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3019582Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3019770Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3019992Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3020256Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3020477Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3020699Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3020905Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3021166Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3021386Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3021604Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3021916Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3022110Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3022332Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3022580Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3022809Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3023028Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3023235Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3023443Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3023661Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3023877Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3024086Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3024322Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:48.3024695Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:48.3024937Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:48.3025190Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:48.3025396Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:48.3025614Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:48.3025837Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:48.3026033Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:48.3026249Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:48.3026476Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:48.3026701Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:48.3026908Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:48.3027156Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:48.3027348Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:48.3027752Z 2664   [ERROR] br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder - [KeystoreHolder] Erro ao obter chave publica: null
2026-07-14T20:34:48.3027909Z java.lang.NullPointerException
2026-07-14T20:34:48.3028170Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.lambda$getPublicKey$0(KeystoreHolder.java:58)
2026-07-14T20:34:48.3028380Z 	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
2026-07-14T20:34:48.3028579Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.getPublicKey(KeystoreHolder.java:54)
2026-07-14T20:34:48.3028800Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest.getPublicKeywithinTtlusesCachedMap(KeystoreHolderTest.java:139)
2026-07-14T20:34:48.3029050Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:48.3029279Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:48.3029475Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:48.3029656Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:48.3029840Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:48.3030105Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:48.3030339Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:48.3030572Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:48.3030786Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:48.3031012Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:48.3031263Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:48.3031532Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:48.3031786Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:48.3032023Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:48.3032245Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:48.3032467Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:48.3032739Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:48.3032968Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:48.3033203Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:48.3033434Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3033667Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:48.3033902Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:48.3034126Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:48.3034360Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:48.3034677Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3034921Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3035125Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3035344Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3035560Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3035778Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3035993Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3036217Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3036440Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3036698Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3036921Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3037143Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3037346Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3037553Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3037780Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3038041Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3038273Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3038457Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3038672Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3038966Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3039207Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3039428Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3039674Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3039879Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3040095Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3040308Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3040521Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3040758Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:48.3041012Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:48.3041253Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:48.3041466Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:48.3041667Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:48.3041873Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:48.3042076Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:48.3042274Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:48.3042497Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:48.3042721Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:48.3042941Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:48.3043204Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:48.3043399Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:48.3043584Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:48.3043883Z 2664   [ERROR] br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder - [KeystoreHolder] Erro ao obter chave publica: null
2026-07-14T20:34:48.3044040Z java.lang.NullPointerException
2026-07-14T20:34:48.3044210Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.lambda$getPublicKey$0(KeystoreHolder.java:58)
2026-07-14T20:34:48.3044411Z 	at java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1660)
2026-07-14T20:34:48.3044864Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolder.getPublicKey(KeystoreHolder.java:54)
2026-07-14T20:34:48.3045109Z 	at br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest.getPublicKeywithinTtlusesCachedMap(KeystoreHolderTest.java:139)
2026-07-14T20:34:48.3045308Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:48.3045484Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:48.3045682Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:48.3045865Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:48.3046056Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:48.3046259Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:48.3046491Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:48.3046733Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:48.3046999Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:48.3047228Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:48.3047481Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:48.3047739Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:48.3048018Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:48.3048292Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:48.3048522Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:48.3048750Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:48.3048977Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:48.3049203Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:48.3049440Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:48.3049678Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3049909Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:48.3050143Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:48.3050431Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:48.3050659Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:48.3050886Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3051112Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3051330Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3051548Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3051768Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3051987Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3052204Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3052388Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3052609Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3052866Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3053087Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3053307Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3053508Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3053752Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3053981Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3054199Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3054410Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3054657Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:48.3054886Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:48.3055136Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:48.3055360Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3055593Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:48.3055795Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:48.3056002Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:48.3056218Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:48.3056433Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:48.3056645Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:48.3056887Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:48.3057147Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:48.3057425Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:48.3057633Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:48.3057837Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:48.3058109Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:48.3058325Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:48.3058521Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:48.3058808Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:48.3059048Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:48.3059271Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:48.3059485Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:48.3059683Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:48.3059873Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:48.3060213Z [INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.325 s - in br.gov.caixa.mpi.dict.ejb.hsm.KeystoreHolderTest
2026-07-14T20:34:48.3060405Z [INFO] Running br.gov.caixa.mpi.dict.ejb.RequisicaoBacenEjbTest
2026-07-14T20:34:48.3332018Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.032 s - in br.gov.caixa.mpi.dict.ejb.RequisicaoBacenEjbTest
2026-07-14T20:34:48.3400479Z [INFO] Running br.gov.caixa.mpi.dict.ejb.ElementSignEjbTest
2026-07-14T20:34:48.5632536Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.222 s - in br.gov.caixa.mpi.dict.ejb.ElementSignEjbTest
2026-07-14T20:34:48.5815718Z [INFO] Running br.gov.caixa.mpi.dict.ejb.ClaimEjbTest
2026-07-14T20:34:49.0990376Z 2026-07-14 17:34:49 INFO  ClaimEjb - Requisicao ao BACEN para criar reivindicacao realizada em 1 ms. ReivindicacaoDto de requisicao: reivindicacaoDto CreateClaimResponse: createClaimResponse ReivindicacaoDto de resposta: reivindicacaoDto
2026-07-14T20:34:49.0991220Z 3469   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para criar reivindicacao realizada em 1 ms. ReivindicacaoDto de requisicao: reivindicacaoDto CreateClaimResponse: createClaimResponse ReivindicacaoDto de resposta: reivindicacaoDto
2026-07-14T20:34:49.0992121Z 3469   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para criar reivindicacao realizada em 1 ms. ReivindicacaoDto de requisicao: reivindicacaoDto CreateClaimResponse: createClaimResponse ReivindicacaoDto de resposta: reivindicacaoDto
2026-07-14T20:34:49.1035604Z 2026-07-14 17:34:49 INFO  ClaimEjb - [SIMPI-DICT] [Claims] Solicitando reivindicacoes junto ao Bacen.
2026-07-14T20:34:49.1038943Z 3472   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - [SIMPI-DICT] [Claims] Solicitando reivindicacoes junto ao Bacen.
2026-07-14T20:34:49.1039303Z 3472   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - [SIMPI-DICT] [Claims] Solicitando reivindicacoes junto ao Bacen.
2026-07-14T20:34:49.1039671Z 2026-07-14 17:34:49 INFO  ClaimEjb - [SIMPI-DICT] [Claims] Requisicao ao BACEN para buscar reivindicacoes realizada em: 1 ms. Foram encontradas 1  reivindicacoes. 
2026-07-14T20:34:49.1039873Z   Possui mais elementos: false
2026-07-14T20:34:49.1040207Z 3473   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - [SIMPI-DICT] [Claims] Requisicao ao BACEN para buscar reivindicacoes realizada em: 1 ms. Foram encontradas 1  reivindicacoes. 
2026-07-14T20:34:49.1040417Z   Possui mais elementos: false
2026-07-14T20:34:49.1041065Z 3473   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - [SIMPI-DICT] [Claims] Requisicao ao BACEN para buscar reivindicacoes realizada em: 1 ms. Foram encontradas 1  reivindicacoes. 
2026-07-14T20:34:49.1041242Z   Possui mais elementos: false
2026-07-14T20:34:49.1041482Z 2026-07-14 17:34:49 INFO  ClaimEjb - [SIMPI-DICT] [Claims]  QueryParams: {Participant=00360305}
2026-07-14T20:34:49.1041641Z  Reivindicacoes: []
2026-07-14T20:34:49.1041995Z 3474   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - [SIMPI-DICT] [Claims]  QueryParams: {Participant=00360305}
2026-07-14T20:34:49.1042169Z  Reivindicacoes: []
2026-07-14T20:34:49.1042404Z 3474   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - [SIMPI-DICT] [Claims]  QueryParams: {Participant=00360305}
2026-07-14T20:34:49.1042547Z  Reivindicacoes: []
2026-07-14T20:34:49.1066102Z 2026-07-14 17:34:49 INFO  ClaimEjb - Requisicao ao BACEN para marcar que recebeu reivindicacao realizada em 1 ms. ClaimId: 251ff7d1-9e0d-4d26-9400-82aeaf8fef2b AcknowledgeClaimRequest: class AcknowledgeClaimRequest {
2026-07-14T20:34:49.1066395Z     signature: 
2026-07-14T20:34:49.1066594Z     claimId: 251ff7d1-9e0d-4d26-9400-82aeaf8fef2b
2026-07-14T20:34:49.1066729Z     participant: null
2026-07-14T20:34:49.1066856Z } ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1068928Z 3478   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para marcar que recebeu reivindicacao realizada em 1 ms. ClaimId: 251ff7d1-9e0d-4d26-9400-82aeaf8fef2b AcknowledgeClaimRequest: class AcknowledgeClaimRequest {
2026-07-14T20:34:49.1069285Z     signature: 
2026-07-14T20:34:49.1069502Z     claimId: 251ff7d1-9e0d-4d26-9400-82aeaf8fef2b
2026-07-14T20:34:49.1069642Z     participant: null
2026-07-14T20:34:49.1069888Z } ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1070332Z 3478   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para marcar que recebeu reivindicacao realizada em 1 ms. ClaimId: 251ff7d1-9e0d-4d26-9400-82aeaf8fef2b AcknowledgeClaimRequest: class AcknowledgeClaimRequest {
2026-07-14T20:34:49.1070744Z     signature: 
2026-07-14T20:34:49.1071576Z     claimId: 251ff7d1-9e0d-4d26-9400-82aeaf8fef2b
2026-07-14T20:34:49.1071735Z     participant: null
2026-07-14T20:34:49.1071886Z } ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1155884Z 2026-07-14 17:34:49 INFO  ClaimEjb - Requisicao ao BACEN para buscar reivindicacao realizada em 0 ms. ClaimId: bae09448-84ce-413f-9371-192af80ddc43 Participant: null GetClaimResponse: getClaimResponse ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1156799Z 3483   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para buscar reivindicacao realizada em 0 ms. ClaimId: bae09448-84ce-413f-9371-192af80ddc43 Participant: null GetClaimResponse: getClaimResponse ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1157528Z 3483   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para buscar reivindicacao realizada em 0 ms. ClaimId: bae09448-84ce-413f-9371-192af80ddc43 Participant: null GetClaimResponse: getClaimResponse ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1158199Z 2026-07-14 17:34:49 INFO  ClaimEjb - Requisicao ao BACEN para completar reivindicacao realizada em 1 ms. ClaimId: 53253f42-8bb7-4dfd-9830-9d53637eb892 Participant:  CompleteClaimResponse: completeClaimResponse ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1158877Z 3486   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para completar reivindicacao realizada em 1 ms. ClaimId: 53253f42-8bb7-4dfd-9830-9d53637eb892 Participant:  CompleteClaimResponse: completeClaimResponse ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1159542Z 3486   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para completar reivindicacao realizada em 1 ms. ClaimId: 53253f42-8bb7-4dfd-9830-9d53637eb892 Participant:  CompleteClaimResponse: completeClaimResponse ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1266220Z 2026-07-14 17:34:49 INFO  ClaimEjb - Requisicao ao BACEN para cancelar reivindicacao realizada em 1 ms. ReivindicacaoRequestDto: reivindicacaoRequestDto ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1267185Z 3493   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para cancelar reivindicacao realizada em 1 ms. ReivindicacaoRequestDto: reivindicacaoRequestDto ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1267760Z 3493   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para cancelar reivindicacao realizada em 1 ms. ReivindicacaoRequestDto: reivindicacaoRequestDto ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1268347Z 2026-07-14 17:34:49 INFO  ClaimEjb - Requisicao ao BACEN para confirmar reivindicacao realizada em 1 ms. ReivindicacaoRequestDto: reivindicacaoRequestDto ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1269084Z 3496   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para confirmar reivindicacao realizada em 1 ms. ReivindicacaoRequestDto: reivindicacaoRequestDto ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1270185Z 3496   [INFO] br.gov.caixa.mpi.dict.ejb.ClaimEjb - Requisicao ao BACEN para confirmar reivindicacao realizada em 1 ms. ReivindicacaoRequestDto: reivindicacaoRequestDto ReivindicacaoDto: reivindicacaoDto
2026-07-14T20:34:49.1276217Z [INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.559 s - in br.gov.caixa.mpi.dict.ejb.ClaimEjbTest
2026-07-14T20:34:49.1276562Z [INFO] Running br.gov.caixa.mpi.dict.converter.CloseRefundRequestConverterTest
2026-07-14T20:34:49.1317678Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 s - in br.gov.caixa.mpi.dict.converter.CloseRefundRequestConverterTest
2026-07-14T20:34:49.1319163Z [INFO] Running br.gov.caixa.mpi.dict.converter.CancelFraudMarkerConverterTest
2026-07-14T20:34:49.1476093Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.014 s - in br.gov.caixa.mpi.dict.converter.CancelFraudMarkerConverterTest
2026-07-14T20:34:49.1476640Z [INFO] Running br.gov.caixa.mpi.dict.converter.InfractionReportResponseV2Test
2026-07-14T20:34:49.1976191Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.05 s - in br.gov.caixa.mpi.dict.converter.InfractionReportResponseV2Test
2026-07-14T20:34:49.1999096Z [INFO] Running br.gov.caixa.mpi.dict.factory.PolicyFactoryTest
2026-07-14T20:34:49.2022301Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.mpi.dict.factory.PolicyFactoryTest
2026-07-14T20:34:49.2023550Z [INFO] Running br.gov.caixa.mpi.dict.factory.v2.RelatoInfracaoFactoryTest
2026-07-14T20:34:49.2024022Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in br.gov.caixa.mpi.dict.factory.v2.RelatoInfracaoFactoryTest
2026-07-14T20:34:49.2024390Z [INFO] Running br.gov.caixa.mpi.dict.factory.v2.StatisticsFactoryTest
2026-07-14T20:34:49.2399769Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s - in br.gov.caixa.mpi.dict.factory.v2.StatisticsFactoryTest
2026-07-14T20:34:49.2400394Z [INFO] Running br.gov.caixa.mpi.dict.factory.ReivindicacaoFactoryTest
2026-07-14T20:34:49.2456629Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in br.gov.caixa.mpi.dict.factory.ReivindicacaoFactoryTest
2026-07-14T20:34:49.2524378Z [INFO] Running br.gov.caixa.mpi.dict.factory.AntifraudFactoryTest
2026-07-14T20:34:49.2580551Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in br.gov.caixa.mpi.dict.factory.AntifraudFactoryTest
2026-07-14T20:34:49.2585689Z [INFO] Running br.gov.caixa.mpi.dict.factory.ChaveFactoryTest
2026-07-14T20:34:49.2709705Z [INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.023 s - in br.gov.caixa.mpi.dict.factory.ChaveFactoryTest
2026-07-14T20:34:49.2710155Z [INFO] Running br.gov.caixa.mpi.dict.api.model.InfractionReportTest
2026-07-14T20:34:49.2710866Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in br.gov.caixa.mpi.dict.api.model.InfractionReportTest
2026-07-14T20:34:49.2711372Z [INFO] Running br.gov.caixa.mpi.dict.api.model.InfractionDataTest
2026-07-14T20:34:49.2728748Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s - in br.gov.caixa.mpi.dict.api.model.InfractionDataTest
2026-07-14T20:34:49.2731277Z [INFO] Running br.gov.caixa.mpi.dict.api.model.InfractingAccountDataTest
2026-07-14T20:34:49.2731827Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in br.gov.caixa.mpi.dict.api.model.InfractingAccountDataTest
2026-07-14T20:34:49.2733503Z [INFO] Running br.gov.caixa.mpi.dict.api.EncodingUtilsTest
2026-07-14T20:34:49.2811550Z [INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s - in br.gov.caixa.mpi.dict.api.EncodingUtilsTest
2026-07-14T20:34:49.2811953Z [INFO] Running br.gov.caixa.mpi.dict.model.CloseRefundRequestTest
2026-07-14T20:34:49.2988046Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 s - in br.gov.caixa.mpi.dict.model.CloseRefundRequestTest
2026-07-14T20:34:49.2988646Z [INFO] Running br.gov.caixa.mpi.dict.model.GetCidSetFileResponseTest
2026-07-14T20:34:49.3078837Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.007 s - in br.gov.caixa.mpi.dict.model.GetCidSetFileResponseTest
2026-07-14T20:34:49.3079289Z [INFO] Running br.gov.caixa.mpi.dict.model.CloseRefundResponseTest
2026-07-14T20:34:49.3140118Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 s - in br.gov.caixa.mpi.dict.model.CloseRefundResponseTest
2026-07-14T20:34:49.3140548Z [INFO] Running br.gov.caixa.mpi.dict.feign.LoggerFeignTest
2026-07-14T20:34:49.4400721Z 2026-07-14 17:34:49 INFO  LoggerFeign - DirectoryApi#getEntry()
2026-07-14T20:34:49.4401393Z 3810   [INFO] br.gov.caixa.mpi.dict.feign.LoggerFeign - DirectoryApi#getEntry()
2026-07-14T20:34:49.4401822Z 3810   [INFO] br.gov.caixa.mpi.dict.feign.LoggerFeign - DirectoryApi#getEntry()
2026-07-14T20:34:49.4494533Z 2026-07-14 17:34:49 INFO  LoggerFeign - --->DirectoryApi#getEntry() POST http://teste HTTP/1.1
2026-07-14T20:34:49.4495339Z 
2026-07-14T20:34:49.4496778Z <teste>123456</teste> http://teste HTTP/1.1 (21-byte body) {}
2026-07-14T20:34:49.4497927Z 3819   [INFO] br.gov.caixa.mpi.dict.feign.LoggerFeign - --->DirectoryApi#getEntry() POST http://teste HTTP/1.1
2026-07-14T20:34:49.4498125Z 
2026-07-14T20:34:49.4498434Z <teste>123456</teste> http://teste HTTP/1.1 (21-byte body) {}
2026-07-14T20:34:49.4498827Z 3819   [INFO] br.gov.caixa.mpi.dict.feign.LoggerFeign - --->DirectoryApi#getEntry() POST http://teste HTTP/1.1
2026-07-14T20:34:49.4499089Z 
2026-07-14T20:34:49.4499824Z <teste>123456</teste> http://teste HTTP/1.1 (21-byte body) {}
2026-07-14T20:34:49.4503190Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.136 s - in br.gov.caixa.mpi.dict.feign.LoggerFeignTest
2026-07-14T20:34:49.4524918Z [INFO] Running br.gov.caixa.mpi.dict.feign.SegurancaEJBTest
2026-07-14T20:34:49.5256303Z 2026-07-14 17:34:49 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao criar client HTTP. URL: http://localhost:8080, connTimeout: 3000ms, socketTimeout: 5000ms, Causa: falha ao criar builder
2026-07-14T20:34:49.5357715Z java.lang.IllegalStateException: falha ao criar builder
2026-07-14T20:34:49.5384110Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest$FalhaCriacaoClientSegurancaEJB.newResteasyClientBuilder(SegurancaEJBTest.java:847)
2026-07-14T20:34:49.5384393Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:309)
2026-07-14T20:34:49.5384714Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarExcecaoQuandoCriacaoClientFalha$24(SegurancaEJBTest.java:534)
2026-07-14T20:34:49.5403365Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:49.5404003Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:49.5404643Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:49.5405186Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoCriacaoClientFalha(SegurancaEJBTest.java:533)
2026-07-14T20:34:49.5405817Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.5406003Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.5406234Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.5406529Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.5406719Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.5407037Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.5407379Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.5407627Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.5407862Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.5408101Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.5408357Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.5408632Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.5408886Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.5409121Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.5409357Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.5409707Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.5409937Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.5410173Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.5410413Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.5410707Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5411037Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.5411434Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.5411681Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.5412017Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.5412254Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5412491Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5412712Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5412938Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5413170Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5413396Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5413697Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5413890Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.5414124Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.5414389Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.5414711Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5414957Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5415171Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5415400Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5415640Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5415871Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5416248Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5416463Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.5416698Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.5417054Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.5417306Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5417671Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5417971Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5418190Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5418422Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5418639Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5418856Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5419110Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.5419369Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.5419627Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.5419847Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.5420055Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.5420271Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.5420483Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.5420688Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.5420906Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.5421137Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.5421415Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.5421632Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.5421838Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.5422027Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.5422586Z 3885   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao criar client HTTP. URL: http://localhost:8080, connTimeout: 3000ms, socketTimeout: 5000ms, Causa: falha ao criar builder
2026-07-14T20:34:49.5422810Z java.lang.IllegalStateException: falha ao criar builder
2026-07-14T20:34:49.5423018Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest$FalhaCriacaoClientSegurancaEJB.newResteasyClientBuilder(SegurancaEJBTest.java:847)
2026-07-14T20:34:49.5423252Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:309)
2026-07-14T20:34:49.5423499Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarExcecaoQuandoCriacaoClientFalha$24(SegurancaEJBTest.java:534)
2026-07-14T20:34:49.5423727Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:49.5423921Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:49.5424108Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:49.5424317Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoCriacaoClientFalha(SegurancaEJBTest.java:533)
2026-07-14T20:34:49.5424513Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.5424783Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.5424998Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.5425293Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.5425482Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.5425691Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.5425924Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.5426159Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.5426373Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.5426602Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.5426885Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.5427221Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.5427472Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.5427727Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.5427964Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.5428190Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.5428415Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.5428653Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.5428942Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.5429184Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5429420Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.5429659Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.5429882Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.5430113Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.5430341Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5430571Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5430783Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5430987Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5431216Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5431438Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5431655Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5431841Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.5432067Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.5432375Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.5432606Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5432835Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5433042Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5433246Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5433462Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5433684Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5433899Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5434082Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.5434304Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.5434614Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.5434872Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5435098Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5435306Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5435519Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5435780Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5436001Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5436209Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5436447Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.5436699Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.5437014Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.5437240Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.5437449Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.5437660Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.5437936Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.5438147Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.5438359Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.5438595Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.5438816Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.5439030Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.5439284Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.5439479Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.5439892Z 3885   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao criar client HTTP. URL: http://localhost:8080, connTimeout: 3000ms, socketTimeout: 5000ms, Causa: falha ao criar builder
2026-07-14T20:34:49.5440119Z java.lang.IllegalStateException: falha ao criar builder
2026-07-14T20:34:49.5440318Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest$FalhaCriacaoClientSegurancaEJB.newResteasyClientBuilder(SegurancaEJBTest.java:847)
2026-07-14T20:34:49.5440542Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:309)
2026-07-14T20:34:49.5440762Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarExcecaoQuandoCriacaoClientFalha$24(SegurancaEJBTest.java:534)
2026-07-14T20:34:49.5440986Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:49.5441181Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:49.5441366Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:49.5441574Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoCriacaoClientFalha(SegurancaEJBTest.java:533)
2026-07-14T20:34:49.5441769Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.5441944Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.5442142Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.5442342Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.5442527Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.5442735Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.5443006Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.5443233Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.5443458Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.5443692Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.5443943Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.5444204Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.5444451Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.5444760Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.5444987Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.5445217Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.5445441Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.5445673Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.5445918Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.5446157Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5446428Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.5446755Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.5447062Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.5447292Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.5447517Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5447746Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5447957Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5448171Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5448395Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5448613Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5448831Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5449011Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.5449229Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.5449531Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.5449914Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5450197Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5450403Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5450615Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5450843Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5451065Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5451277Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5451462Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.5451683Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.5451938Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.5452157Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5452402Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.5452605Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.5452857Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.5453127Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.5453347Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.5453616Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.5453865Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.5454119Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.5454348Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.5454622Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.5454833Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.5455045Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.5455253Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.5455460Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.5455675Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.5455902Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.5456121Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.5456335Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.5456532Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.5456724Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.5457082Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] A claim 'param' não existe no token
2026-07-14T20:34:49.5457368Z 3890   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] A claim 'param' não existe no token
2026-07-14T20:34:49.5457752Z 3890   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] A claim 'param' não existe no token
2026-07-14T20:34:49.7976797Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Proxy retornou status 503. Tentando busca direta no SSO. URL proxy: http://proxy
2026-07-14T20:34:49.7978368Z 4167   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Proxy retornou status 503. Tentando busca direta no SSO. URL proxy: http://proxy
2026-07-14T20:34:49.7980140Z 4167   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Proxy retornou status 503. Tentando busca direta no SSO. URL proxy: http://proxy
2026-07-14T20:34:49.8029403Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.8029984Z 4171   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.8030385Z 4171   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.8666268Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Proxy retornou status 503. Tentando busca direta no SSO. URL proxy: http://proxy
2026-07-14T20:34:49.8916030Z 4231   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Proxy retornou status 503. Tentando busca direta no SSO. URL proxy: http://proxy
2026-07-14T20:34:49.9015877Z 4231   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Proxy retornou status 503. Tentando busca direta no SSO. URL proxy: http://proxy
2026-07-14T20:34:49.9055640Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do SSO. URL: http://sso, Status: 200
2026-07-14T20:34:49.9056021Z 4231   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do SSO. URL: http://sso, Status: 200
2026-07-14T20:34:49.9056701Z 4231   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do SSO. URL: http://sso, Status: 200
2026-07-14T20:34:49.9057219Z 2026-07-14 17:34:49 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:49.9095125Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:49.9095625Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:49.9096044Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:49.9096394Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:49.9096697Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:49.9097012Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9097259Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9097641Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9097997Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9098244Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:49.9098497Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:49.9098752Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9098980Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9099249Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9099505Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9099745Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:49.9099994Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9100639Z 4242   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:49.9100893Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:49.9101152Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:49.9101384Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:49.9101613Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:49.9101849Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:49.9102081Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9102515Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9102793Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9103059Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9103305Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:49.9103543Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:49.9103795Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9104045Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9104305Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9104643Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9104891Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:49.9105146Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9105478Z 4242   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:49.9105799Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:49.9106012Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:49.9106269Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:49.9106474Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:49.9106712Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:49.9106953Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9107215Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9107472Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9107694Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9108191Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:49.9108600Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:49.9108920Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9109138Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9109390Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9109926Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9110184Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:49.9110409Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9111011Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.9111357Z 4245   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.9111882Z 4245   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.9112291Z 2026-07-14 17:34:49 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao atualizar chaves publicas dos issuers. Verifique a conectividade com o SSO e as propriedades de sistema configuradas. Causa: falha simulada
2026-07-14T20:34:49.9112533Z br.gov.caixa.dict.comum.exceptions.DictException: falha simulada
2026-07-14T20:34:49.9112764Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest$TestableScheduleSegurancaEJB.requestPublicKeyByIssuer(SegurancaEJBTest.java:833)
2026-07-14T20:34:49.9113018Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:49.9113244Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:49.9113477Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:49.9113846Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:49.9114102Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:49.9114342Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveCapturarExcecaoDuranteScheduleUpdatePublicKey(SegurancaEJBTest.java:594)
2026-07-14T20:34:49.9115704Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9116011Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9116304Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9116618Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9116930Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.9117405Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.9117796Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.9118213Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.9118619Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.9119048Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.9119498Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.9120024Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.9120464Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.9120818Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.9121066Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.9121312Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.9121565Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.9121829Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.9122085Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.9122348Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9122704Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.9122965Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.9123213Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.9123466Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.9123719Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9123976Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9124215Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9124446Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9124804Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9125058Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9125298Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9125508Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9125753Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9126047Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9126295Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9126622Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9126872Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9127100Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9127338Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9127573Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9127812Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9128013Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9128253Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9128525Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9128838Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9129216Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9129551Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9129785Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9130041Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9130279Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9130564Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9130823Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.9131100Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.9131350Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.9131585Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.9131808Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.9132038Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.9132262Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.9132481Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.9132717Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.9132958Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.9133195Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.9133425Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.9133641Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.9133854Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9134518Z 4245   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao atualizar chaves publicas dos issuers. Verifique a conectividade com o SSO e as propriedades de sistema configuradas. Causa: falha simulada
2026-07-14T20:34:49.9135021Z br.gov.caixa.dict.comum.exceptions.DictException: falha simulada
2026-07-14T20:34:49.9135247Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest$TestableScheduleSegurancaEJB.requestPublicKeyByIssuer(SegurancaEJBTest.java:833)
2026-07-14T20:34:49.9135500Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:49.9135724Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:49.9135953Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:49.9136183Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:49.9136401Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:49.9136647Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveCapturarExcecaoDuranteScheduleUpdatePublicKey(SegurancaEJBTest.java:594)
2026-07-14T20:34:49.9136870Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9137063Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9137286Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9137487Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9137689Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.9137909Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.9138153Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.9138402Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.9138688Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.9138934Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.9139203Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.9139485Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.9139762Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.9140016Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.9140266Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.9140508Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.9140750Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.9141003Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.9141260Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.9141513Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9141760Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.9142010Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.9142324Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.9142571Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.9142812Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9143054Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9143282Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9143510Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9143751Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9143991Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9144281Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9144673Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9145037Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9145482Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9145877Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9146256Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9146623Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9147127Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9147520Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9147892Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9148268Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9148559Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9148817Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9149098Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9149347Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9149601Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9150659Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9150898Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9151140Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9151374Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9151604Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9151865Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.9152218Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.9152485Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.9152715Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.9152944Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.9153177Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.9153401Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.9153624Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.9153859Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.9154112Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.9154350Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.9154672Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.9154906Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.9155116Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9155581Z 4245   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao atualizar chaves publicas dos issuers. Verifique a conectividade com o SSO e as propriedades de sistema configuradas. Causa: falha simulada
2026-07-14T20:34:49.9155841Z br.gov.caixa.dict.comum.exceptions.DictException: falha simulada
2026-07-14T20:34:49.9156072Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest$TestableScheduleSegurancaEJB.requestPublicKeyByIssuer(SegurancaEJBTest.java:833)
2026-07-14T20:34:49.9156365Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:49.9156600Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:49.9156827Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:49.9157057Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:49.9157276Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:49.9157515Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveCapturarExcecaoDuranteScheduleUpdatePublicKey(SegurancaEJBTest.java:594)
2026-07-14T20:34:49.9157733Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9157929Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9158204Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9158440Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9158639Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.9158858Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.9159172Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.9159504Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.9159899Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.9160289Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.9160804Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.9161093Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.9161362Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.9161635Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.9161887Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.9162131Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.9162377Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.9162629Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.9162894Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.9163155Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9163410Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.9163661Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.9163904Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.9164158Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.9164446Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9165386Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9165634Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9165873Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9166114Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9166370Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9166609Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9166810Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9167058Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9167327Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9167571Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9167813Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9168037Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9168360Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9168608Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9168899Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9169132Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9169332Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9169568Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9169927Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9170178Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9170425Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9170649Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9170879Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9171119Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9171356Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9171593Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9171929Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.9172205Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.9172456Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.9172688Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.9172943Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.9173169Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.9173398Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.9173614Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.9173853Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.9174094Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.9174331Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.9174740Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.9174979Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.9175196Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9175569Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do cache do proxy. URL: http://proxy, Status: 200
2026-07-14T20:34:49.9175909Z 4277   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do cache do proxy. URL: http://proxy, Status: 200
2026-07-14T20:34:49.9176252Z 4277   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do cache do proxy. URL: http://proxy, Status: 200
2026-07-14T20:34:49.9176632Z 2026-07-14 17:34:49 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:49.9176914Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:49.9177131Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveRetornarChaveDoSSOQuandoProxyFalha(SegurancaEJBTest.java:621)
2026-07-14T20:34:49.9177347Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9177545Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9177767Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9177970Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9178243Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.9178482Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.9178738Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.9178994Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.9179236Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.9179482Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.9179757Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.9180039Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.9180311Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.9180572Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.9180860Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.9181217Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.9181567Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.9181872Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.9182137Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.9182404Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9182654Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.9182913Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.9183153Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.9183402Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.9183645Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9183885Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9184113Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9184342Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9184728Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9184984Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9185220Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9185725Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9185971Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9186254Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9186501Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9186755Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9186992Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9187223Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9187468Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9187714Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9187955Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9188199Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9188512Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9188791Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9189072Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9189312Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9189541Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9189876Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9190118Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9190355Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9190587Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9190924Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.9191205Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.9191466Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.9191705Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.9191932Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.9192173Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.9192404Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.9192626Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.9192901Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.9193146Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.9193385Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.9193614Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.9193830Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.9194039Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9194432Z 4278   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:49.9194790Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:49.9195011Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveRetornarChaveDoSSOQuandoProxyFalha(SegurancaEJBTest.java:621)
2026-07-14T20:34:49.9195225Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9195417Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9195633Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9195831Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9196032Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.9196255Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.9196503Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.9196756Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.9197032Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.9197279Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.9197548Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.9197827Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.9198172Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.9198476Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.9198731Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.9198997Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.9199244Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.9199487Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.9199742Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.9199995Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9200244Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.9200538Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.9200788Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.9201178Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.9201520Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9201766Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9201996Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9202221Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9202460Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9202706Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9202946Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9203145Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9203383Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9203657Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9203899Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9204139Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9204364Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9204768Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9205014Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9205253Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9205483Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9205688Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9205925Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9206193Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9206456Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9206729Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9206966Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9207199Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9207439Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9207674Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9207909Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9208173Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.9208483Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.9208742Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.9208978Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.9209202Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.9209430Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.9209653Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.9209867Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.9210100Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.9210345Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.9210580Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.9210819Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.9211041Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.9211250Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9211649Z 4278   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:49.9211878Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:49.9212095Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveRetornarChaveDoSSOQuandoProxyFalha(SegurancaEJBTest.java:621)
2026-07-14T20:34:49.9212378Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:49.9212577Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:49.9212880Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:49.9213085Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:49.9213286Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:49.9213509Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:49.9213755Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:49.9214012Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:49.9214258Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:49.9214507Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:49.9214895Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:49.9215179Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:49.9215447Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:49.9215703Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:49.9215950Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:49.9216244Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:49.9216491Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:49.9216738Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:49.9216995Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:49.9217251Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9217507Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:49.9217768Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:49.9218017Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:49.9218262Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:49.9218505Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9218746Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9218977Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9219209Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9219448Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9219688Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9219965Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9220171Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9220416Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9220687Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9220927Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9221164Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9221386Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9221626Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9221863Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9222093Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9222320Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9222520Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:49.9222756Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:49.9223025Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:49.9223273Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9223554Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:49.9223777Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:49.9224004Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:49.9224246Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:49.9224476Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:49.9224769Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:49.9225027Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:49.9225320Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:49.9225574Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:49.9225812Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:49.9226036Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:49.9226264Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:49.9226489Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:49.9226708Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:49.9226941Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:49.9227313Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:49.9227668Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:49.9228037Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:49.9228363Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:49.9228672Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:49.9229155Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do SSO. URL: http://sso, Status: 200
2026-07-14T20:34:49.9229641Z 4279   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do SSO. URL: http://sso, Status: 200
2026-07-14T20:34:49.9230084Z 4279   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do SSO. URL: http://sso, Status: 200
2026-07-14T20:34:49.9230441Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.9230775Z 4283   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.9231110Z 4283   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:49.9231434Z 2026-07-14 17:34:49 INFO  SegurancaEJB - [SEGURANCA-EJB] Chaves publicas atualizadas com sucesso. Total de issuers carregados: 3
2026-07-14T20:34:49.9231783Z 4283   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chaves publicas atualizadas com sucesso. Total de issuers carregados: 3
2026-07-14T20:34:49.9232121Z 4283   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chaves publicas atualizadas com sucesso. Total de issuers carregados: 3
2026-07-14T20:34:49.9686826Z 2026-07-14 17:34:49 ERROR SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: null
2026-07-14T20:34:49.9687666Z 4330   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: null
2026-07-14T20:34:49.9688256Z 4330   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: null
2026-07-14T20:34:50.2597281Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Issuer nao autorizado: https://test.com
2026-07-14T20:34:50.2597927Z 4630   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Issuer nao autorizado: https://test.com
2026-07-14T20:34:50.2598483Z 4630   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Issuer nao autorizado: https://test.com
2026-07-14T20:34:50.2659706Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.2705075Z java.security.spec.InvalidKeySpecException: java.security.InvalidKeyException: IOException: Detect premature EOF
2026-07-14T20:34:50.2705747Z 	at sun.security.rsa.RSAKeyFactory.engineGeneratePublic(RSAKeyFactory.java:205)
2026-07-14T20:34:50.2706101Z 	at java.security.KeyFactory.generatePublic(KeyFactory.java:334)
2026-07-14T20:34:50.2706513Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:157)
2026-07-14T20:34:50.2707802Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2708167Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2708470Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2708697Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2709088Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:155)
2026-07-14T20:34:50.2709702Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:134)
2026-07-14T20:34:50.2709924Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2710281Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2710540Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2710774Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2711007Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.2711237Z Caused by: java.security.InvalidKeyException: IOException: Detect premature EOF
2026-07-14T20:34:50.2711453Z 	at sun.security.x509.X509Key.decode(X509Key.java:397)
2026-07-14T20:34:50.2711775Z 	at sun.security.x509.X509Key.decode(X509Key.java:402)
2026-07-14T20:34:50.2712025Z 	at sun.security.rsa.RSAPublicKeyImpl.<init>(RSAPublicKeyImpl.java:86)
2026-07-14T20:34:50.2712349Z 	at sun.security.rsa.RSAKeyFactory.generatePublic(RSAKeyFactory.java:298)
2026-07-14T20:34:50.2712664Z 	at sun.security.rsa.RSAKeyFactory.engineGeneratePublic(RSAKeyFactory.java:201)
2026-07-14T20:34:50.2712989Z 	at java.security.KeyFactory.generatePublic(KeyFactory.java:334)
2026-07-14T20:34:50.2713237Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:157)
2026-07-14T20:34:50.2713476Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2713716Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2714024Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2714259Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2714513Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.2714963Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.2715244Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.2715567Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.2715855Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.2716137Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.2716424Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.2716648Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.2716876Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.2717208Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.2717491Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.2717759Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.2718015Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.2718263Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:155)
2026-07-14T20:34:50.2718522Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:134)
2026-07-14T20:34:50.2718745Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2718956Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2719212Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2719490Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2719733Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.2719999Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.2720364Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.2720628Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.2720918Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.2721195Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.2721542Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.2721777Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.2722003Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.2722249Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.2722505Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.2722773Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.2723048Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.2723316Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:50.2723597Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarTokenInvalidoQuandoAlgoritmoFalha$11(SegurancaEJBTest.java:252)
2026-07-14T20:34:50.2723862Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:50.2724158Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:50.2724406Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:50.2724777Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarTokenInvalidoQuandoAlgoritmoFalha(SegurancaEJBTest.java:251)
2026-07-14T20:34:50.2725194Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2725426Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2725695Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2725916Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2726152Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.2726418Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.2726699Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.2727061Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.2727537Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.2728026Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.2728546Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.2728895Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.2729196Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.2729529Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.2729819Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.2730095Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.2730371Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.2730660Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.2730952Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.2731247Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2731534Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.2731818Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.2732148Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.2732432Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.2732751Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2733026Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2733280Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2733539Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2733883Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2734279Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2734704Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2735323Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.2735625Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.2735929Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.2736272Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2736535Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2736774Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2737003Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2737245Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2737495Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2737846Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2738057Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.2738383Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.2738875Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.2739127Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2739387Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2739612Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2739845Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2740083Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2740318Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2740552Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2740816Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.2741095Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.2741349Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.2741583Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.2741805Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.2742037Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.2742259Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.2742544Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.2742782Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.2743029Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.2743278Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.2743507Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.2743728Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.2743893Z 	... 1 more
2026-07-14T20:34:50.2744283Z 4635   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.2744501Z java.security.spec.InvalidKeySpecException: java.security.InvalidKeyException: IOException: Detect premature EOF
2026-07-14T20:34:50.2744815Z 	at sun.security.rsa.RSAKeyFactory.engineGeneratePublic(RSAKeyFactory.java:205)
2026-07-14T20:34:50.2745020Z 	at java.security.KeyFactory.generatePublic(KeyFactory.java:334)
2026-07-14T20:34:50.2745227Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:157)
2026-07-14T20:34:50.2745423Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2745748Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2745968Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2746167Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2746365Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:155)
2026-07-14T20:34:50.2746581Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:134)
2026-07-14T20:34:50.2746785Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2747020Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2747239Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2747447Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2747644Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.2747843Z Caused by: java.security.InvalidKeyException: IOException: Detect premature EOF
2026-07-14T20:34:50.2748038Z 	at sun.security.x509.X509Key.decode(X509Key.java:397)
2026-07-14T20:34:50.2748311Z 	at sun.security.x509.X509Key.decode(X509Key.java:402)
2026-07-14T20:34:50.2748683Z 	at sun.security.rsa.RSAPublicKeyImpl.<init>(RSAPublicKeyImpl.java:86)
2026-07-14T20:34:50.2748913Z 	at sun.security.rsa.RSAKeyFactory.generatePublic(RSAKeyFactory.java:298)
2026-07-14T20:34:50.2749122Z 	at sun.security.rsa.RSAKeyFactory.engineGeneratePublic(RSAKeyFactory.java:201)
2026-07-14T20:34:50.2749331Z 	at java.security.KeyFactory.generatePublic(KeyFactory.java:334)
2026-07-14T20:34:50.2749537Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:157)
2026-07-14T20:34:50.2749735Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2749931Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2750147Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2750348Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2750559Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.2750797Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.2751030Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.2751304Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.2751541Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.2751782Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.2752010Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.2752207Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.2752400Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.2752614Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.2752839Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.2753088Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.2753323Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.2753540Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:155)
2026-07-14T20:34:50.2753754Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:134)
2026-07-14T20:34:50.2753954Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2754148Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2754362Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2754633Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2754855Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.2755094Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.2755365Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.2755595Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.2755832Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.2756069Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.2756294Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.2756491Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.2756681Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.2756891Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.2757125Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.2757367Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.2757613Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.2757835Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:50.2758086Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarTokenInvalidoQuandoAlgoritmoFalha$11(SegurancaEJBTest.java:252)
2026-07-14T20:34:50.2758400Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:50.2758607Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:50.2758811Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:50.2759087Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarTokenInvalidoQuandoAlgoritmoFalha(SegurancaEJBTest.java:251)
2026-07-14T20:34:50.2759308Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2759501Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2759715Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2759916Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2760118Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.2760345Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.2760598Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.2760848Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.2761088Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.2761330Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.2761607Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.2761901Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.2762164Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.2762419Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.2762667Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.2762952Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.2763194Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.2763445Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.2763702Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.2763959Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2764209Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.2764467Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.2765049Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.2765379Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.2765633Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2765909Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2766144Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2766369Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2766612Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2766908Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2767146Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2767348Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.2767594Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.2767872Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.2768135Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2768466Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2768694Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2768925Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2769171Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2769405Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2769634Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2769850Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.2770088Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.2770366Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.2770608Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2770895Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2771117Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2771340Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2771577Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2771813Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2772045Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2772301Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.2772573Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.2772827Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.2773144Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.2773365Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.2773601Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.2773893Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.2774131Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.2774372Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.2774753Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.2774997Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.2775231Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.2775449Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.2775615Z 	... 1 more
2026-07-14T20:34:50.2775917Z 4635   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.2776135Z java.security.spec.InvalidKeySpecException: java.security.InvalidKeyException: IOException: Detect premature EOF
2026-07-14T20:34:50.2776348Z 	at sun.security.rsa.RSAKeyFactory.engineGeneratePublic(RSAKeyFactory.java:205)
2026-07-14T20:34:50.2776552Z 	at java.security.KeyFactory.generatePublic(KeyFactory.java:334)
2026-07-14T20:34:50.2776764Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:157)
2026-07-14T20:34:50.2776968Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2777163Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2777382Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2777579Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2777775Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:155)
2026-07-14T20:34:50.2777999Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:134)
2026-07-14T20:34:50.2778261Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2778461Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2778686Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2778942Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2779134Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.2779376Z Caused by: java.security.InvalidKeyException: IOException: Detect premature EOF
2026-07-14T20:34:50.2779565Z 	at sun.security.x509.X509Key.decode(X509Key.java:397)
2026-07-14T20:34:50.2779746Z 	at sun.security.x509.X509Key.decode(X509Key.java:402)
2026-07-14T20:34:50.2779987Z 	at sun.security.rsa.RSAPublicKeyImpl.<init>(RSAPublicKeyImpl.java:86)
2026-07-14T20:34:50.2780229Z 	at sun.security.rsa.RSAKeyFactory.generatePublic(RSAKeyFactory.java:298)
2026-07-14T20:34:50.2780436Z 	at sun.security.rsa.RSAKeyFactory.engineGeneratePublic(RSAKeyFactory.java:201)
2026-07-14T20:34:50.2780637Z 	at java.security.KeyFactory.generatePublic(KeyFactory.java:334)
2026-07-14T20:34:50.2780840Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:157)
2026-07-14T20:34:50.2781036Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2781226Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2781440Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2781641Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2781851Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.2782095Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.2782327Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.2782558Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.2782794Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.2783093Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.2783323Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.2783535Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.2783728Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.2783943Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.2784166Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.2784405Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.2784714Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.2784945Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.buildAlgorithm(SegurancaEJB.java:155)
2026-07-14T20:34:50.2785166Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:134)
2026-07-14T20:34:50.2785361Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2785556Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2785769Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2785969Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2786176Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.2786412Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.2786640Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.2786875Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.2787146Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.2787385Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.2787614Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.2787812Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.2788012Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.2788284Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.2788512Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.2788746Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.2788985Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.2789205Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:50.2789449Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarTokenInvalidoQuandoAlgoritmoFalha$11(SegurancaEJBTest.java:252)
2026-07-14T20:34:50.2789693Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:50.2789899Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:50.2790103Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:50.2790332Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarTokenInvalidoQuandoAlgoritmoFalha(SegurancaEJBTest.java:251)
2026-07-14T20:34:50.2790546Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2790778Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2790993Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2791197Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2791397Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.2791694Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.2791942Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.2792189Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.2792435Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.2792682Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.2792959Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.2793242Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.2793509Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.2793767Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.2794022Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.2794269Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.2794515Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.2794889Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.2795147Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.2795405Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2795656Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.2795914Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.2796167Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.2796414Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.2796663Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2796904Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2797209Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2797480Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2797734Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2797973Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2798264Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2798514Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.2798756Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.2799057Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.2799344Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2799590Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2799815Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2800041Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2800288Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2800529Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2800830Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2801056Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.2801313Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.2801614Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.2801867Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2802242Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.2802493Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.2802787Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.2803075Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.2803339Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.2803586Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.2803869Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.2804179Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.2804454Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.2804780Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.2805055Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.2805307Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.2805549Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.2805786Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.2806035Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.2806313Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.2806571Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.2806882Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.2807120Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.2807300Z 	... 1 more
2026-07-14T20:34:50.2807690Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.2808216Z 4639   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.2808700Z 4639   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.2809141Z 2026-07-14 17:34:50 INFO  SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do cache do proxy. URL: http://proxy, Status: 200
2026-07-14T20:34:50.2809526Z 4642   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do cache do proxy. URL: http://proxy, Status: 200
2026-07-14T20:34:50.2809890Z 4642   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chave publica recuperada do cache do proxy. URL: http://proxy, Status: 200
2026-07-14T20:34:50.2810193Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.2810415Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:50.2810634Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:50.2810843Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:50.2811059Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:50.2811305Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:50.2811575Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2811786Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2812021Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2812241Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2812462Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:50.2812710Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.2812949Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2813159Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2813392Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2813610Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2813830Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.2814064Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.2814367Z 4644   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.2814658Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:50.2814883Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:50.2815094Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:50.2815291Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:50.2815506Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:50.2815725Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2815986Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2816221Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2816477Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2816697Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:50.2816964Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.2817175Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2817383Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2817618Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2817925Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2818200Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.2818451Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.2818765Z 4644   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.2818987Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:50.2819200Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:50.2819408Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:50.2819601Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:50.2819838Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:50.2820063Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2820280Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2820517Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2820798Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2821020Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:50.2821252Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.2821464Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.2821676Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.2821923Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.2822137Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.2822352Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.2822581Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.2823001Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_CONN_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.2823473Z 4646   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_CONN_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.2823924Z 4646   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_CONN_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.5280861Z 2026-07-14 17:34:50 INFO  SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:50.5281280Z 4898   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:50.5282166Z 4898   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:50.5321503Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.5326873Z 4898   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.5357959Z 4898   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.5358689Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy-intranet, URL SSO: http://issuer-intranet, Causa: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5359292Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5359627Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:331)
2026-07-14T20:34:50.5359845Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5361011Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5361212Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5361415Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5361604Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5361797Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5362651Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.5363272Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5363645Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5363968Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5366195Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5366448Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5366707Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5367118Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5368293Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5368611Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5368897Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5369187Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5369457Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5369712Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5370041Z Caused by: java.lang.NumberFormatException: null
2026-07-14T20:34:50.5370460Z 	at java.lang.Integer.parseInt(Integer.java:542)
2026-07-14T20:34:50.5370665Z 	at java.lang.Integer.parseInt(Integer.java:615)
2026-07-14T20:34:50.5370880Z 	at br.gov.caixa.mpi.dict.util.JBossProperties.getSimpiSocketTimeoutSso(JBossProperties.java:284)
2026-07-14T20:34:50.5371123Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:327)
2026-07-14T20:34:50.5371560Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5371765Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5371975Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5372277Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5372734Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5372953Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5373193Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5373428Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5373653Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5373898Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5374145Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5374379Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5374664Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5374873Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5375093Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5375320Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5375563Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5375801Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5376083Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5376313Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.5376543Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5376746Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5376942Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5377171Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5377373Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5377592Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5377830Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5378064Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5378291Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5378526Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5378768Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5379000Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5379201Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5379401Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5379622Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5379895Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5380130Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5380363Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5380588Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5380809Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5381032Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5381237Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5381428Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5381643Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5381846Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5382061Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5382295Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5382525Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5382751Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5382990Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5383228Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5383459Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5383717Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5383909Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5384123Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5384353Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5384714Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5384969Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5385195Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:210)
2026-07-14T20:34:50.5385442Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveInicializarPublicKeysQuandoMapaVazio$25(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5385711Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:50.5385948Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:50.5386168Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:50.5386403Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveInicializarPublicKeysQuandoMapaVazio(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5386620Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5386818Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5387036Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5387237Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5387440Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5387712Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5387962Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5388213Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5388452Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5388701Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5388972Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5389253Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5389526Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5389798Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5390047Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5390295Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5390540Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5390788Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5391047Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5391305Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5391599Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5391855Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5392098Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5392352Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5392597Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5392843Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5393074Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5393307Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5393560Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5393802Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5394037Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5394240Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5394479Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5394875Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5395123Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5395412Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5395639Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5395860Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5396098Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5396360Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5396715Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5397023Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5397368Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5397657Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5397914Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5398159Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5398384Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5398608Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5398845Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5399078Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5399379Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5399645Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5399925Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5400182Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5400417Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5400649Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5400884Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5401111Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5401334Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5401571Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5401827Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5402072Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5402303Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5402519Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5402685Z 	... 1 more
2026-07-14T20:34:50.5403181Z 4899   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy-intranet, URL SSO: http://issuer-intranet, Causa: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5403669Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5403906Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:331)
2026-07-14T20:34:50.5404129Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5404326Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5404527Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5404860Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5405065Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5405270Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5405494Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.5405722Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5405921Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5406116Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5406346Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5406544Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5406748Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5406973Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5407197Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5407447Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5407644Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5407863Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5408064Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5408261Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5408448Z Caused by: java.lang.NumberFormatException: null
2026-07-14T20:34:50.5408616Z 	at java.lang.Integer.parseInt(Integer.java:542)
2026-07-14T20:34:50.5408793Z 	at java.lang.Integer.parseInt(Integer.java:615)
2026-07-14T20:34:50.5408996Z 	at br.gov.caixa.mpi.dict.util.JBossProperties.getSimpiSocketTimeoutSso(JBossProperties.java:284)
2026-07-14T20:34:50.5409228Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:327)
2026-07-14T20:34:50.5409447Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5409640Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5409831Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5410043Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5410242Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5410452Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5410692Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5410932Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5411175Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5411452Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5411697Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5411930Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5412129Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5412323Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5412536Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5412762Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5413002Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5413240Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5413463Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5413686Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.5413909Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5414109Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5414302Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5414522Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5414791Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5415006Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5415246Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5415521Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5415759Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5416000Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5416241Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5416473Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5416669Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5416865Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5417084Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5417313Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5417554Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5417789Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5418015Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5418240Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5418465Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5418664Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5418858Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5419114Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5419316Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5419583Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5419826Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5420067Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5420367Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5420725Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5421099Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5421442Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5421749Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5421988Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5422203Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5422430Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5422669Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5422906Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5423133Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:210)
2026-07-14T20:34:50.5423377Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveInicializarPublicKeysQuandoMapaVazio$25(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5423687Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:50.5423920Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:50.5424143Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:50.5424380Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveInicializarPublicKeysQuandoMapaVazio(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5424801Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5425024Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5425248Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5425452Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5425660Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5425889Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5426138Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5426397Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5426640Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5426890Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5427164Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5427450Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5427774Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5428033Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5428284Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5428534Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5428781Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5429042Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5429298Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5429561Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5429811Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5430064Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5430311Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5430563Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5430809Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5431053Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5431285Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5431558Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5431797Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5432034Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5432265Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5432468Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5432707Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5432989Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5433237Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5433479Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5433704Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5433937Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5434175Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5434411Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5434751Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5434965Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5435254Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5435526Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5435769Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5436008Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5436230Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5436453Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5436702Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5436939Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5437173Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5437435Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5437708Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5437959Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5438194Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5438416Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5438649Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5438918Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5439135Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5439369Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5439621Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5439857Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5440090Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5440308Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5440473Z 	... 1 more
2026-07-14T20:34:50.5440934Z 4899   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy-intranet, URL SSO: http://issuer-intranet, Causa: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5441372Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5441605Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:331)
2026-07-14T20:34:50.5441826Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5442021Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5442213Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5442428Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5442669Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5442869Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5443093Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.5443325Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5443523Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5443715Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5443932Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5444131Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5444336Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5444611Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5444855Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5445057Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5445263Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5445479Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5445680Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5445879Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5446063Z Caused by: java.lang.NumberFormatException: null
2026-07-14T20:34:50.5446233Z 	at java.lang.Integer.parseInt(Integer.java:542)
2026-07-14T20:34:50.5446410Z 	at java.lang.Integer.parseInt(Integer.java:615)
2026-07-14T20:34:50.5446618Z 	at br.gov.caixa.mpi.dict.util.JBossProperties.getSimpiSocketTimeoutSso(JBossProperties.java:284)
2026-07-14T20:34:50.5446849Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:327)
2026-07-14T20:34:50.5447293Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5447492Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5447690Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5447912Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5448115Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5448333Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5448574Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5448809Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5449043Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5449283Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5449527Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5449764Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5449963Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5450171Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5450388Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5450614Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5450853Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5451151Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5451373Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5451594Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.5451816Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5452016Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5452210Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5452425Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5452624Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5452835Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5453075Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5453310Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5453538Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5453775Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5454023Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5454257Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5454470Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5454774Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5455046Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5455273Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5455511Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5455746Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5455971Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5456192Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5456419Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5456621Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5456828Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5457051Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5457255Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5457469Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5457707Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5457969Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5458205Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5458515Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5458895Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5459204Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5459404Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5459598Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5459811Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5460036Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5460281Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5460518Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5460744Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:210)
2026-07-14T20:34:50.5460993Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveInicializarPublicKeysQuandoMapaVazio$25(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5461249Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:50.5461483Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:50.5461708Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:50.5461942Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveInicializarPublicKeysQuandoMapaVazio(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5462156Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5462352Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5462572Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5462769Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5462977Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5463238Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5463489Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5463753Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5463994Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5464238Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5464513Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5464945Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5465317Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5465582Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5465835Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5466091Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5466341Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5466595Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5466866Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5467177Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5467429Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5467698Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5467948Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5468198Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5468440Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5468689Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5468923Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5469152Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5469395Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5469639Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5469875Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5470080Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5470321Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5470599Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5470879Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5471130Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5471355Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5471598Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5471839Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5472078Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5472308Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5472518Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5472764Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5473041Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5473285Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5473530Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5473760Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5473988Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5474230Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5474516Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5475644Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5475914Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5476207Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5476482Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5476718Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5476945Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5477180Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5477410Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5477683Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5477945Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5478200Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5478453Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5478686Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5478914Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5479084Z 	... 1 more
2026-07-14T20:34:50.5479461Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.5479959Z 4901   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.5480396Z 4901   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao ler propriedade SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Verifique se a variavel esta configurada no JBoss. Causa: null
2026-07-14T20:34:50.5481328Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao atualizar chaves publicas dos issuers. Verifique a conectividade com o SSO e as propriedades de sistema configuradas. Causa: [SEGURANCA-EJB] Falha ao conectar diretamente no SSO. URL: http://issuer-intranet
2026-07-14T20:34:50.5481728Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Falha ao conectar diretamente no SSO. URL: http://issuer-intranet
2026-07-14T20:34:50.5481964Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:267)
2026-07-14T20:34:50.5482194Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:237)
2026-07-14T20:34:50.5482395Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5482593Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5482814Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5483017Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5483228Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5483452Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5483720Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5483956Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5484229Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5484525Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5484900Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5485203Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5485664Z Caused by: br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5485999Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:331)
2026-07-14T20:34:50.5486322Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5486602Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5486888Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5487212Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5487497Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5487814Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5488139Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:264)
2026-07-14T20:34:50.5488384Z 	... 13 more
2026-07-14T20:34:50.5488622Z Caused by: java.lang.NumberFormatException: null
2026-07-14T20:34:50.5488899Z 	at java.lang.Integer.parseInt(Integer.java:542)
2026-07-14T20:34:50.5489168Z 	at java.lang.Integer.parseInt(Integer.java:615)
2026-07-14T20:34:50.5489477Z 	at br.gov.caixa.mpi.dict.util.JBossProperties.getSimpiSocketTimeoutSso(JBossProperties.java:284)
2026-07-14T20:34:50.5489919Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:327)
2026-07-14T20:34:50.5490249Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5490577Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5490872Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5491184Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5491469Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5491810Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5492205Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5492589Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5492992Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5493388Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5493788Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5494179Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5494533Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5495009Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5495392Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5495788Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5496309Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5496707Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5497042Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5497358Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:264)
2026-07-14T20:34:50.5497708Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:237)
2026-07-14T20:34:50.5497932Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5498130Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5498347Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5498553Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5498768Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5499012Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5499263Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5499492Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5499732Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5499979Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5500213Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5500413Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5500614Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5500893Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5501121Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5501360Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5501602Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5501832Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5502062Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5502287Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5502484Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5502682Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5502901Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5503103Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5503314Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5503565Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5503797Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5504028Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5504269Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5528254Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5528766Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5528979Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5529184Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5529411Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5529644Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5529893Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5530133Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5530364Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:210)
2026-07-14T20:34:50.5530621Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveInicializarPublicKeysQuandoMapaVazio$25(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5530876Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:50.5531184Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:50.5531446Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:50.5531685Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveInicializarPublicKeysQuandoMapaVazio(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5531965Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5532165Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5532385Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5532591Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5532960Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5533186Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5533439Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5533693Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5533931Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5534181Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5534456Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5534845Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5535114Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5535370Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5535627Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5536001Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5536359Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5536670Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5536991Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5537251Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5537512Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5537769Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5538014Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5538268Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5538521Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5538766Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5538995Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5539220Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5539464Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5539705Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5539937Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5540144Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5540402Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5540681Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5540962Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5541209Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5541438Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5541663Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5541901Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5542142Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5542375Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5542583Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5542820Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5543084Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5543329Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5543567Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5543792Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5544087Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5544383Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5544749Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5545016Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5545281Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5545561Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5545816Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5546051Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5546278Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5546516Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5546742Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5546959Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5547200Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5547448Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5547689Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5547926Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5548146Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5548379Z 	... 1 more
2026-07-14T20:34:50.5548896Z 4902   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao atualizar chaves publicas dos issuers. Verifique a conectividade com o SSO e as propriedades de sistema configuradas. Causa: [SEGURANCA-EJB] Falha ao conectar diretamente no SSO. URL: http://issuer-intranet
2026-07-14T20:34:50.5549305Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Falha ao conectar diretamente no SSO. URL: http://issuer-intranet
2026-07-14T20:34:50.5549531Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:267)
2026-07-14T20:34:50.5549753Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:237)
2026-07-14T20:34:50.5549948Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5550141Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5550360Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5550640Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5550871Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5551096Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5551319Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5551518Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5551712Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5551931Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5552130Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5552327Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5552698Z Caused by: br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5552948Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:331)
2026-07-14T20:34:50.5553168Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5553365Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5553557Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5553773Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5553973Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5554173Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5554395Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:264)
2026-07-14T20:34:50.5554643Z 	... 13 more
2026-07-14T20:34:50.5554799Z Caused by: java.lang.NumberFormatException: null
2026-07-14T20:34:50.5554970Z 	at java.lang.Integer.parseInt(Integer.java:542)
2026-07-14T20:34:50.5555144Z 	at java.lang.Integer.parseInt(Integer.java:615)
2026-07-14T20:34:50.5555349Z 	at br.gov.caixa.mpi.dict.util.JBossProperties.getSimpiSocketTimeoutSso(JBossProperties.java:284)
2026-07-14T20:34:50.5555581Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:327)
2026-07-14T20:34:50.5555801Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5556020Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5556212Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5556454Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5556697Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5556946Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5557188Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5557420Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5557711Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5557976Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5558218Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5558448Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5558651Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5558846Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5559071Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5559338Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5559582Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5559824Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5560047Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5560270Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:264)
2026-07-14T20:34:50.5560491Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:237)
2026-07-14T20:34:50.5560732Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5560927Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5561145Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5561343Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5561560Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5561802Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5562031Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5562314Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5562571Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5562820Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5563060Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5563265Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5563461Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5563683Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5563907Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5564146Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5564381Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5564700Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5565172Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5565399Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5565594Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5565786Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5566002Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5566201Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5566414Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5566650Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5566882Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5567124Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5567356Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5567592Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5567817Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5568010Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5568201Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5568417Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5568641Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5568917Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5569151Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5569377Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:210)
2026-07-14T20:34:50.5569624Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveInicializarPublicKeysQuandoMapaVazio$25(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5569872Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:50.5570102Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:50.5570323Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:50.5570558Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveInicializarPublicKeysQuandoMapaVazio(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5570778Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5570972Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5571186Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5571396Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5571596Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5571820Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5572064Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5572314Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5572558Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5572836Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5573108Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5573390Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5573655Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5573910Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5574157Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5574406Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5574798Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5575063Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5575348Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5575614Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5575867Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5576123Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5576415Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5576673Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5576920Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5577167Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5577399Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5577631Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5577878Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5578121Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5578364Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5578570Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5578811Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5579093Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5579354Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5579599Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5579825Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5580053Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5580322Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5580562Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5580793Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5581001Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5581244Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5581510Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5581752Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5581998Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5582226Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5582445Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5582683Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5582920Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5583162Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5583424Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5583702Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5584020Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5584252Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5584477Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5584774Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5585003Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5585223Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5585457Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5585706Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5585949Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5586181Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5586404Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5586571Z 	... 1 more
2026-07-14T20:34:50.5587025Z 4902   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao atualizar chaves publicas dos issuers. Verifique a conectividade com o SSO e as propriedades de sistema configuradas. Causa: [SEGURANCA-EJB] Falha ao conectar diretamente no SSO. URL: http://issuer-intranet
2026-07-14T20:34:50.5587443Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Falha ao conectar diretamente no SSO. URL: http://issuer-intranet
2026-07-14T20:34:50.5587671Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:267)
2026-07-14T20:34:50.5587933Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:237)
2026-07-14T20:34:50.5588134Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5588330Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5588545Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5588748Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5588955Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5589179Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5589406Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5589609Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5589808Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5590025Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5590223Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5590417Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5590751Z Caused by: br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] Erro ao ler variavel SIMPI-DICT_HTTP_SOCKET_TIMEOUT_SSO. Causa: null
2026-07-14T20:34:50.5590993Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:331)
2026-07-14T20:34:50.5591212Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5591407Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5591611Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5591864Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5592063Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5592259Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5592476Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:264)
2026-07-14T20:34:50.5592649Z 	... 13 more
2026-07-14T20:34:50.5592800Z Caused by: java.lang.NumberFormatException: null
2026-07-14T20:34:50.5592966Z 	at java.lang.Integer.parseInt(Integer.java:542)
2026-07-14T20:34:50.5593140Z 	at java.lang.Integer.parseInt(Integer.java:615)
2026-07-14T20:34:50.5593346Z 	at br.gov.caixa.mpi.dict.util.JBossProperties.getSimpiSocketTimeoutSso(JBossProperties.java:284)
2026-07-14T20:34:50.5593573Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.obterSocketTimeout(SegurancaEJB.java:327)
2026-07-14T20:34:50.5593794Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:304)
2026-07-14T20:34:50.5593991Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5594183Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5594399Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5594660Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5594882Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5595119Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5595352Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5595581Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5595823Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5596270Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5596503Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5596721Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5596917Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5597136Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5597360Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5597601Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5597841Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5598070Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.5598289Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoSSO(SegurancaEJB.java:264)
2026-07-14T20:34:50.5598513Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:237)
2026-07-14T20:34:50.5598715Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5598911Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5599126Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5599326Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5599539Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5599779Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5600045Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5600273Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5600511Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5600750Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5600995Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5601193Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5601386Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5601600Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5601826Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5602066Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5602302Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5602530Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.5602753Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.atualizarPublicKeys(SegurancaEJB.java:227)
2026-07-14T20:34:50.5602974Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:212)
2026-07-14T20:34:50.5603170Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5603360Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5603575Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5603814Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5604023Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:50.5604261Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:50.5604491Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:50.5604781Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:50.5605018Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:50.5605260Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:50.5605506Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:50.5605706Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:50.5605899Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:50.5606114Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:50.5606341Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:50.5606578Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:50.5606817Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:50.5607045Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.scheduleUpdatePublicKey(SegurancaEJB.java:210)
2026-07-14T20:34:50.5607288Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveInicializarPublicKeysQuandoMapaVazio$25(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5607566Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-14T20:34:50.5607798Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-14T20:34:50.5608017Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-14T20:34:50.5608247Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveInicializarPublicKeysQuandoMapaVazio(SegurancaEJBTest.java:547)
2026-07-14T20:34:50.5608461Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5608653Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5608866Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5609064Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5609263Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5609489Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5609745Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5609996Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5610236Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5610478Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5610749Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5611032Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5611299Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5611583Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5611829Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5612073Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5612320Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5612569Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5612826Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5613085Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5613356Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5613606Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5613851Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5614099Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5614347Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5614649Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5614888Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5615145Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5615389Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5615631Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5615866Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5616072Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5616314Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5616597Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5616842Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5617095Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5617335Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5617568Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5617867Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5618106Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5618337Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5618542Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5618782Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5619093Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5619339Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5619581Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5619809Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5620031Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5620269Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5620504Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5620740Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5621002Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5621286Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5621536Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5621770Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5621994Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5622221Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5622444Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5622703Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5622936Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5623179Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5623418Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5623646Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5623861Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5624028Z 	... 1 more
2026-07-14T20:34:50.5624388Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:50.5624682Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:50.5624910Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoSSORetornaRespostaNula(SegurancaEJBTest.java:656)
2026-07-14T20:34:50.5625128Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5625332Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5625551Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5625811Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5626017Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5626244Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5626491Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5626788Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5627031Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5627278Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5627552Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5627836Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5628103Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5628361Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5628611Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5628857Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5629099Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5629366Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5629632Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5629891Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5630141Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5630443Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5630687Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5630941Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5631187Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5631429Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5631658Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5631882Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5632122Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5632363Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5632598Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5632801Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5633037Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5633326Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5633568Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5633810Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5634071Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5634296Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5634532Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5635142Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5635383Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5635587Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5635827Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5636095Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5636350Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5636596Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5636826Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5637057Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5637313Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5637549Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5637783Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5638103Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5638375Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5638626Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5638859Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5639082Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5639312Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5639535Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5639749Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5639987Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5640231Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5640470Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5640697Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5640914Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5641121Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5641542Z 4910   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:50.5641782Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:50.5642041Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoSSORetornaRespostaNula(SegurancaEJBTest.java:656)
2026-07-14T20:34:50.5642260Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5642455Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5642673Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5642874Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5643075Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5643298Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5643541Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5643795Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5644039Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5644285Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5644612Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5644904Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5645173Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5645442Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5645730Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5645976Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5646222Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5646470Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5646729Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5646984Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5647233Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5647488Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5647790Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5648050Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5648293Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5648538Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5648766Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5648996Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5649247Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5649522Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5649759Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5649962Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5650203Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5650478Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5650719Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5650964Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5651190Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5651417Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5651655Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5651894Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5652125Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5652325Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5652560Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5652832Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5653147Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5653389Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5653613Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5653839Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5654079Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5654315Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5654592Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5654868Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5655152Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5655400Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5655638Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5655859Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5656093Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5656316Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5656535Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5656775Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5657084Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5657322Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5657548Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5657768Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5657973Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5658379Z 4910   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:50.5658612Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:50.5658837Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoSSORetornaRespostaNula(SegurancaEJBTest.java:656)
2026-07-14T20:34:50.5659057Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5659255Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5659471Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5659668Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5659870Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.5660088Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.5660334Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.5660583Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.5660862Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.5661115Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.5661384Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.5661662Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.5661926Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.5662180Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.5662429Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.5662676Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.5662922Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.5663171Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.5663430Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.5663683Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5663933Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.5664188Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.5664466Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.5664803Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.5665059Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5665352Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5665583Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5665811Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5666055Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5666295Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5666536Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5666746Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5666991Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5667265Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5667505Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5667746Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5667970Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5668250Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5668490Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5668737Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5668968Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5669167Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.5669404Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.5669671Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.5669914Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5670161Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.5670385Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.5670609Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.5670846Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.5671081Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.5671314Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.5671578Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.5671888Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.5672200Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.5672527Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.5672797Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.5673030Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.5673266Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.5673486Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.5673725Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.5673974Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.5674211Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.5674443Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.5674725Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.5674942Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5675317Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: []
2026-07-14T20:34:50.5675707Z 4915   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: []
2026-07-14T20:34:50.5676194Z 4915   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: []
2026-07-14T20:34:50.5676512Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Issuer nao autorizado: nao_existe
2026-07-14T20:34:50.5676818Z 4916   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Issuer nao autorizado: nao_existe
2026-07-14T20:34:50.5677133Z 4916   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Issuer nao autorizado: nao_existe
2026-07-14T20:34:50.5677500Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.5677764Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:50.5677974Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:50.5678169Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:50.5678357Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:50.5678562Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:50.5678763Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5678965Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5679195Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5679396Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5679602Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:50.5679822Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.5680026Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5680223Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5680483Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5680683Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5680886Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.5681104Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5681408Z 4922   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.5681618Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:50.5681815Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:50.5682006Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:50.5682181Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:50.5682376Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:50.5682582Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5682773Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5682995Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5683193Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5683389Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:50.5683603Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.5683799Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5683992Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5684209Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5684461Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5684740Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.5684954Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.5685245Z 4922   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:50.5685452Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:50.5685648Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:50.5685842Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:50.5686022Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:50.5686219Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:50.5686411Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5686624Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5686844Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5687047Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5687245Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:50.5687464Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.5687659Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.5687851Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.5688062Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.5688264Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.5688461Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:50.5688672Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.6362726Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: null
2026-07-14T20:34:50.6363219Z 5006   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: null
2026-07-14T20:34:50.6363613Z 5006   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] O client do token não esta autorizado a consumir o serviço. Roles do token: null
2026-07-14T20:34:50.6388249Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] Erro inesperado ao validar token. Tipo da excecao: RuntimeException, Mensagem: inesperado
2026-07-14T20:34:50.6388700Z java.lang.RuntimeException: inesperado
2026-07-14T20:34:50.6389348Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:50.6389640Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validarTokenSSOLocal(SegurancaEJB.java:85)
2026-07-14T20:34:50.6389828Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6390015Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6390219Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6390406Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6390594Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validarTokenSSOLocal(SegurancaEJB.java:81)
2026-07-14T20:34:50.6390931Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarExcecaoQuandoExcecaoInesperada$4(SegurancaEJBTest.java:130)
2026-07-14T20:34:50.6391155Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:50.6391346Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:50.6391823Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:50.6392036Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoExcecaoInesperada(SegurancaEJBTest.java:129)
2026-07-14T20:34:50.6392230Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6392408Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6392609Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6392790Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6392975Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.6393191Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.6393424Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.6393669Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.6393890Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.6394115Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.6394369Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.6394885Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.6395138Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.6395375Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.6395666Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.6395898Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.6396127Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.6396359Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.6396602Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.6396848Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6397096Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.6397335Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.6397562Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.6397796Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.6398026Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6398253Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6398469Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6398681Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6398971Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6399196Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6399410Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6399596Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.6399822Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.6400074Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.6400302Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6400537Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6400749Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6400955Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6401170Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6401385Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6401599Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6401781Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.6402003Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.6402253Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.6402519Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6402739Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6402944Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6403155Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6403375Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6403592Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6403802Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6404062Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.6404325Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.6404613Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.6404839Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.6405049Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.6405264Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.6405474Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.6405674Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.6405926Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.6406154Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.6406377Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.6406592Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.6406793Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.6406987Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.6407392Z 5010   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] Erro inesperado ao validar token. Tipo da excecao: RuntimeException, Mensagem: inesperado
2026-07-14T20:34:50.6407589Z java.lang.RuntimeException: inesperado
2026-07-14T20:34:50.6407764Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:50.6407980Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validarTokenSSOLocal(SegurancaEJB.java:85)
2026-07-14T20:34:50.6408162Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6408336Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6408536Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6408718Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6408901Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validarTokenSSOLocal(SegurancaEJB.java:81)
2026-07-14T20:34:50.6409128Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarExcecaoQuandoExcecaoInesperada$4(SegurancaEJBTest.java:130)
2026-07-14T20:34:50.6409344Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:50.6409536Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:50.6409760Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:50.6409970Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoExcecaoInesperada(SegurancaEJBTest.java:129)
2026-07-14T20:34:50.6410169Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6410345Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6410539Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6410717Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6410894Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.6411097Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.6411329Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.6411561Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.6411802Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.6412039Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.6412287Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.6412553Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.6412804Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.6413083Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.6413313Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.6413540Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.6413763Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.6413991Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.6414230Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.6414462Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6414761Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.6415003Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.6415312Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.6415592Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.6415819Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6416047Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6416260Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6416474Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6416724Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6416941Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6417156Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6417344Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.6417570Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.6417885Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.6418117Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6418353Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6418564Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6418775Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6419000Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6419231Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6419446Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6419638Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.6419864Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.6420157Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.6420388Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6420617Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6420822Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6421025Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6421243Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6421457Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6421669Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6421915Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.6422170Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.6422401Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.6422620Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.6422837Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.6423047Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.6423251Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.6423447Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.6423707Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.6423933Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.6424159Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.6424454Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.6424835Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.6425129Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.6425528Z 5010   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][VALIDAR-TOKEN] Erro inesperado ao validar token. Tipo da excecao: RuntimeException, Mensagem: inesperado
2026-07-14T20:34:50.6425729Z java.lang.RuntimeException: inesperado
2026-07-14T20:34:50.6425901Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:50.6426113Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validarTokenSSOLocal(SegurancaEJB.java:85)
2026-07-14T20:34:50.6426299Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6426476Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6426678Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6426868Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6427052Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validarTokenSSOLocal(SegurancaEJB.java:81)
2026-07-14T20:34:50.6427294Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarExcecaoQuandoExcecaoInesperada$4(SegurancaEJBTest.java:130)
2026-07-14T20:34:50.6427556Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:50.6427752Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:50.6427942Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:50.6428154Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoExcecaoInesperada(SegurancaEJBTest.java:129)
2026-07-14T20:34:50.6428352Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6428527Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6428724Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6428901Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6429078Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:50.6429283Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:50.6429517Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:50.6429752Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:50.6429970Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:50.6430195Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:50.6430444Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:50.6430702Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:50.6430959Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:50.6431230Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:50.6431456Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:50.6431685Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:50.6431908Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:50.6432137Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:50.6432375Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:50.6432608Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6432847Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:50.6433083Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:50.6433309Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:50.6433537Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:50.6433762Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6433989Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6434191Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6434450Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6434739Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6434961Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6435178Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6435367Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.6435591Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.6435844Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.6436070Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6436299Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6436507Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6436717Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6436936Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6437153Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6437368Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6437552Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:50.6437773Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:50.6438076Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:50.6438303Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6438531Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:50.6438734Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:50.6438937Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:50.6439154Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:50.6439369Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:50.6439587Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:50.6439834Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:50.6440094Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:50.6440321Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:50.6440530Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:50.6440731Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:50.6440947Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:50.6441158Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:50.6441390Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:50.6441616Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:50.6441842Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:50.6442064Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:50.6442275Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:50.6442472Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:50.6442663Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.6453095Z 2026-07-14 17:34:50 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: null, URL SSO: null, Causa: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
2026-07-14T20:34:50.6453673Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
2026-07-14T20:34:50.6453984Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:301)
2026-07-14T20:34:50.6454250Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6454508Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6454902Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6455177Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6455456Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.6455707Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.6456017Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.6456196Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6456371Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6456567Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6456749Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6456926Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.6457334Z 5012   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: null, URL SSO: null, Causa: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
2026-07-14T20:34:50.6457678Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
2026-07-14T20:34:50.6457882Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:301)
2026-07-14T20:34:50.6458064Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6458309Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6458587Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6458829Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6459044Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.6459244Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.6459448Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.6459624Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6459874Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6460069Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6460246Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6460417Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.6460827Z 5012   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: null, URL SSO: null, Causa: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
2026-07-14T20:34:50.6461172Z br.gov.caixa.dict.comum.exceptions.DictException: [SEGURANCA-EJB] URL para inicializar client HTTP esta nula ou vazia.
2026-07-14T20:34:50.6461373Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:301)
2026-07-14T20:34:50.6461553Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6461734Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6461933Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6462117Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6462299Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.initializeClient(SegurancaEJB.java:300)
2026-07-14T20:34:50.6462501Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.tentarRecuperarDoProxy(SegurancaEJB.java:247)
2026-07-14T20:34:50.6462710Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.requestPublicKeyByIssuer(SegurancaEJB.java:234)
2026-07-14T20:34:50.6462891Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:50.6463067Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:50.6463261Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:50.6463481Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:50.6463657Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:50.6473558Z 2026-07-14 17:34:50 INFO  SegurancaEJB - [SEGURANCA-EJB] A claim 'param' não existe no token
2026-07-14T20:34:50.6474074Z 5014   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] A claim 'param' não existe no token
2026-07-14T20:34:50.6474527Z 5014   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] A claim 'param' não existe no token
2026-07-14T20:34:50.6475251Z 2026-07-14 17:34:50 INFO  SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:50.6475593Z 5014   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:50.6475916Z 5014   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Iniciando atualizacao das chaves publicas dos issuers configurados.
2026-07-14T20:34:50.6476238Z 2026-07-14 17:34:50 INFO  SegurancaEJB - [SEGURANCA-EJB] Chaves publicas atualizadas com sucesso. Total de issuers carregados: 3
2026-07-14T20:34:50.6476576Z 5014   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chaves publicas atualizadas com sucesso. Total de issuers carregados: 3
2026-07-14T20:34:50.6476904Z 5014   [INFO] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB] Chaves publicas atualizadas com sucesso. Total de issuers carregados: 3
2026-07-14T20:34:51.0055380Z 2026-07-14 17:34:51 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:51.0056249Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:51.0056791Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoSSORetornaNon200(SegurancaEJBTest.java:643)
2026-07-14T20:34:51.0057683Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0058044Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0058856Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0059108Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0059307Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:51.0059521Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:51.0059756Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:51.0060056Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:51.0060283Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:51.0060576Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:51.0060831Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:51.0061125Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:51.0061380Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:51.0061619Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:51.0061846Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:51.0062079Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:51.0062523Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:51.0062758Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:51.0063000Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:51.0063287Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0063636Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:51.0063891Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:51.0064123Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:51.0064362Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:51.0065077Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0065422Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0065664Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0065873Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0066184Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0066406Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0066702Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0066891Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.0067122Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.0067391Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.0067616Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0067844Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0068052Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0068263Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0068498Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0068749Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0068968Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0069177Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.0069398Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.0069655Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.0069881Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0070116Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0070383Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0070598Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0070819Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0071037Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0071249Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0071490Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:51.0071748Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:51.0071989Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:51.0072215Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:51.0072419Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:51.0072628Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:51.0072831Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:51.0073028Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:51.0073246Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:51.0073524Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:51.0073859Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:51.0074072Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:51.0074270Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:51.0074461Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.0075006Z 5375   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:51.0075232Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:51.0075437Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoSSORetornaNon200(SegurancaEJBTest.java:643)
2026-07-14T20:34:51.0075642Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0075823Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0076022Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0076219Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0076409Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:51.0076619Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:51.0076859Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:51.0077095Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:51.0077316Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:51.0077626Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:51.0077881Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:51.0078144Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:51.0078390Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:51.0078628Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:51.0078968Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:51.0079289Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:51.0079526Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:51.0079751Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:51.0080000Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:51.0080261Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0080491Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:51.0080724Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:51.0080950Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:51.0081240Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:51.0081462Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0081687Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0081900Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0082105Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0082325Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0082545Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0082759Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0082951Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.0083171Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.0083498Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.0083808Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0084033Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0084239Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0084443Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0084746Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0085030Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0085242Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0085425Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.0085650Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.0085904Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.0086125Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0086344Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0086554Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0086758Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0086977Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0087193Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0087420Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0087718Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:51.0088056Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:51.0088357Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:51.0088578Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:51.0088788Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:51.0089007Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:51.0089212Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:51.0089408Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:51.0089651Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:51.0089974Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:51.0090308Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:51.0090627Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:51.0090939Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:51.0091219Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.0091798Z 5375   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Nao foi possivel recuperar as chaves publicas do proxy SSO. URL proxy: http://proxy, URL SSO: http://sso, Causa: proxy falhou
2026-07-14T20:34:51.0092170Z br.gov.caixa.dict.comum.exceptions.DictException: proxy falhou
2026-07-14T20:34:51.0092527Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarExcecaoQuandoSSORetornaNon200(SegurancaEJBTest.java:643)
2026-07-14T20:34:51.0092880Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0093175Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0093619Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0093881Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0094186Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:51.0094477Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:51.0094829Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:51.0095067Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:51.0095285Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:51.0095516Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:51.0095780Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:51.0096051Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:51.0096396Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:51.0096675Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:51.0097062Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:51.0097299Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:51.0097625Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:51.0097864Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:51.0098107Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:51.0098349Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0098588Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:51.0098821Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:51.0099052Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:51.0099285Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:51.0099529Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0099761Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0099973Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0100179Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0100400Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0100704Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0101032Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0101332Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.0101974Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.0102242Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.0102547Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0102784Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0102990Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0103197Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0103473Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0103716Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0103947Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0104131Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.0104357Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.0104699Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.0104934Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0105159Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.0105441Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.0105649Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.0105868Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.0106085Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.0106299Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.0106537Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:51.0106791Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:51.0107020Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:51.0107239Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:51.0107442Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:51.0107662Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:51.0107867Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:51.0108062Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:51.0108274Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:51.0108518Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:51.0108736Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:51.0108992Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:51.0109186Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:51.0109372Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.0109765Z 2026-07-14 17:34:51 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao recuperar chave publica do SSO. URL: http://sso, Status: 500, Resposta: Internal Server Error
2026-07-14T20:34:51.0110139Z 5376   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao recuperar chave publica do SSO. URL: http://sso, Status: 500, Resposta: Internal Server Error
2026-07-14T20:34:51.0110509Z 5376   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Falha ao recuperar chave publica do SSO. URL: http://sso, Status: 500, Resposta: Internal Server Error
2026-07-14T20:34:51.0120444Z 2026-07-14 17:34:51 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:51.0120718Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:51.0120914Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:51.0121087Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:51.0121251Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:51.0123557Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:51.0123996Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0124297Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0124843Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0125601Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0126098Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:51.0126385Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:51.0126688Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0127224Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0127512Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0127775Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0128023Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:51.0128289Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.0128697Z 5377   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:51.0128970Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:51.0129209Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:51.0129443Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:51.0129780Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:51.0130275Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:51.0130552Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0130754Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0130982Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0131191Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0131394Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:51.0131617Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:51.0131993Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0132254Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0132475Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0132676Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0132876Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:51.0133090Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.0133436Z 5377   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido.
2026-07-14T20:34:51.0133646Z com.auth0.jwt.exceptions.JWTDecodeException: The token was expected to have 3 parts, but got 1.
2026-07-14T20:34:51.0133843Z 	at com.auth0.jwt.TokenUtils.splitToken(TokenUtils.java:21)
2026-07-14T20:34:51.0134040Z 	at com.auth0.jwt.JWTDecoder.<init>(JWTDecoder.java:27)
2026-07-14T20:34:51.0134221Z 	at com.auth0.jwt.JWT.decode(JWT.java:21)
2026-07-14T20:34:51.0134426Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:198)
2026-07-14T20:34:51.0134795Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0134993Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0135250Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0135457Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0135657Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getClaimsByToken(SegurancaEJB.java:197)
2026-07-14T20:34:51.0135877Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:51.0136083Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.0136442Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.0136772Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.0137086Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.0137422Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.getParamFromToken(SegurancaEJB.java:187)
2026-07-14T20:34:51.0137865Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.2177051Z 2026-07-14 17:34:51 ERROR SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido para o certificado.
2026-07-14T20:34:51.2177833Z com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-07-14T20:34:51.2178244Z 	at com.auth0.jwt.algorithms.RSAAlgorithm.verify(RSAAlgorithm.java:47)
2026-07-14T20:34:51.2179897Z 	at com.auth0.jwt.JWTVerifier.verify(JWTVerifier.java:354)
2026-07-14T20:34:51.2180203Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:138)
2026-07-14T20:34:51.2180604Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.2181300Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.2181605Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.2181798Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.2181996Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:51.2182221Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:51.2182436Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:51.2182648Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:51.2182889Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:51.2183338Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:51.2183552Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:51.2183735Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:51.2183910Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:51.2184107Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:51.2184319Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:51.2184640Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:51.2184873Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:51.2185085Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:51.2185328Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarTokenInvalidoParaCertificadoQuandoAssinaturaNaoConfere$14(SegurancaEJBTest.java:289)
2026-07-14T20:34:51.2185565Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:51.2185760Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:51.2185945Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:51.2186849Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarTokenInvalidoParaCertificadoQuandoAssinaturaNaoConfere(SegurancaEJBTest.java:288)
2026-07-14T20:34:51.2187177Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.2187355Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.2187660Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.2187845Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.2188037Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:51.2188241Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:51.2188472Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:51.2188706Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:51.2188954Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:51.2189275Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:51.2189584Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:51.2189850Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:51.2190098Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:51.2190332Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:51.2190556Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:51.2190780Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:51.2191001Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:51.2191230Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:51.2191531Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:51.2191778Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2192011Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:51.2192243Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:51.2192471Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:51.2192702Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:51.2192932Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2193163Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2193373Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2193582Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2193799Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2194049Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2194266Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2194448Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.2194818Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.2195086Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.2195322Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2195551Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2195899Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2196107Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2196439Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2196667Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2196887Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2197082Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.2197303Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.2197553Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.2197777Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2198000Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2198208Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2198418Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2198680Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2198898Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2199109Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2199345Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:51.2199599Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:51.2199833Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:51.2200044Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:51.2200252Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:51.2200465Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:51.2200679Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:51.2200874Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:51.2201083Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:51.2201309Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:51.2201526Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:51.2201735Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:51.2201961Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:51.2202148Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.2202514Z 5587   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido para o certificado.
2026-07-14T20:34:51.2202836Z com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-07-14T20:34:51.2203040Z 	at com.auth0.jwt.algorithms.RSAAlgorithm.verify(RSAAlgorithm.java:47)
2026-07-14T20:34:51.2203216Z 	at com.auth0.jwt.JWTVerifier.verify(JWTVerifier.java:354)
2026-07-14T20:34:51.2203405Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:138)
2026-07-14T20:34:51.2203582Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.2203766Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.2203971Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.2204150Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.2204339Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:51.2204648Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:51.2204885Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:51.2205096Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:51.2205313Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:51.2205532Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:51.2205780Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:51.2205957Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:51.2206453Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:51.2206679Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:51.2206892Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:51.2207117Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:51.2207342Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:51.2207547Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:51.2207793Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarTokenInvalidoParaCertificadoQuandoAssinaturaNaoConfere$14(SegurancaEJBTest.java:289)
2026-07-14T20:34:51.2208036Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:51.2208225Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:51.2208409Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:51.2208637Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarTokenInvalidoParaCertificadoQuandoAssinaturaNaoConfere(SegurancaEJBTest.java:288)
2026-07-14T20:34:51.2208849Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.2209040Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.2209242Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.2209429Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.2209667Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:51.2209871Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:51.2210096Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:51.2210329Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:51.2210548Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:51.2210769Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:51.2211018Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:51.2211277Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:51.2211523Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:51.2211766Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:51.2211995Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:51.2212223Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:51.2212450Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:51.2212692Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:51.2212932Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:51.2213210Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2213441Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:51.2213674Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:51.2213894Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:51.2214120Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:51.2214343Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2214641Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2214864Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2215072Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2215294Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2215514Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2215734Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2215917Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.2216341Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.2216646Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.2216922Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2217148Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2217359Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2217574Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2217797Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2218015Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2218230Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2218414Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.2218639Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.2218887Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.2219110Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2219336Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2219536Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2219741Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2219974Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2220222Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2220434Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2220680Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:51.2220934Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:51.2221164Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:51.2221374Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:51.2221577Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:51.2221788Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:51.2221995Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:51.2222190Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:51.2222406Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:51.2222630Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:51.2222846Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:51.2223055Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:51.2223250Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:51.2223438Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.2223788Z 5587   [ERROR] br.gov.caixa.mpi.dict.security.SegurancaEJB - [SEGURANCA-EJB][ERRO] Token inválido para o certificado.
2026-07-14T20:34:51.2224101Z com.auth0.jwt.exceptions.SignatureVerificationException: The Token's Signature resulted invalid when verified using the Algorithm: SHA256withRSA
2026-07-14T20:34:51.2224307Z 	at com.auth0.jwt.algorithms.RSAAlgorithm.verify(RSAAlgorithm.java:47)
2026-07-14T20:34:51.2224481Z 	at com.auth0.jwt.JWTVerifier.verify(JWTVerifier.java:354)
2026-07-14T20:34:51.2224738Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:138)
2026-07-14T20:34:51.2224917Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.2225091Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.2225290Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.2225479Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.2225673Z 	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.invoke(ReflectionMemberAccessor.java:48)
2026-07-14T20:34:51.2225891Z 	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
2026-07-14T20:34:51.2226157Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
2026-07-14T20:34:51.2226379Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
2026-07-14T20:34:51.2226600Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
2026-07-14T20:34:51.2226827Z 	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
2026-07-14T20:34:51.2227036Z 	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
2026-07-14T20:34:51.2227222Z 	at org.mockito.Answers.answer(Answers.java:99)
2026-07-14T20:34:51.2227431Z 	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
2026-07-14T20:34:51.2227628Z 	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
2026-07-14T20:34:51.2227830Z 	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
2026-07-14T20:34:51.2228056Z 	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
2026-07-14T20:34:51.2228268Z 	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
2026-07-14T20:34:51.2228469Z 	at br.gov.caixa.mpi.dict.security.SegurancaEJB.validaTokenLocal(SegurancaEJB.java:127)
2026-07-14T20:34:51.2228739Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.lambda$deveLancarTokenInvalidoParaCertificadoQuandoAssinaturaNaoConfere$14(SegurancaEJBTest.java:289)
2026-07-14T20:34:51.2228990Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-14T20:34:51.2229179Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-14T20:34:51.2229363Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-14T20:34:51.2229586Z 	at br.gov.caixa.mpi.dict.feign.SegurancaEJBTest.deveLancarTokenInvalidoParaCertificadoQuandoAssinaturaNaoConfere(SegurancaEJBTest.java:288)
2026-07-14T20:34:51.2229796Z 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-14T20:34:51.2229968Z 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
2026-07-14T20:34:51.2230167Z 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-14T20:34:51.2230344Z 	at java.lang.reflect.Method.invoke(Method.java:498)
2026-07-14T20:34:51.2230530Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-14T20:34:51.2230731Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-14T20:34:51.2231010Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-14T20:34:51.2231240Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-14T20:34:51.2231457Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-14T20:34:51.2231680Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-14T20:34:51.2231942Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-14T20:34:51.2232199Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-14T20:34:51.2232443Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-14T20:34:51.2232678Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-14T20:34:51.2232901Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-14T20:34:51.2233125Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-14T20:34:51.2233351Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-14T20:34:51.2233577Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-14T20:34:51.2233814Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-14T20:34:51.2234050Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2234329Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-14T20:34:51.2234631Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-14T20:34:51.2234868Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-14T20:34:51.2235100Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-14T20:34:51.2235332Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2235561Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2235770Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2235974Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2236198Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2236421Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2236637Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2236823Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.2237048Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.2237300Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.2237522Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2237790Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2237996Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2238282Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2238605Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2238911Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2239143Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2239328Z 	at java.util.ArrayList.forEach(ArrayList.java:1257)
2026-07-14T20:34:51.2239553Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-14T20:34:51.2239815Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-14T20:34:51.2240039Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2240263Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-14T20:34:51.2240467Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-14T20:34:51.2240672Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-14T20:34:51.2240891Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-14T20:34:51.2241104Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-14T20:34:51.2241317Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-14T20:34:51.2241598Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-14T20:34:51.2241851Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-14T20:34:51.2242081Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-14T20:34:51.2242291Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220)
2026-07-14T20:34:51.2242504Z 	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188)
2026-07-14T20:34:51.2242713Z 	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202)
2026-07-14T20:34:51.2242922Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181)
2026-07-14T20:34:51.2243120Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128)
2026-07-14T20:34:51.2243337Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150)
2026-07-14T20:34:51.2243560Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124)
2026-07-14T20:34:51.2243780Z 	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
2026-07-14T20:34:51.2243988Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
2026-07-14T20:34:51.2244193Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
2026-07-14T20:34:51.2244382Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
2026-07-14T20:34:51.2244785Z [INFO] Tests run: 55, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.765 s - in br.gov.caixa.mpi.dict.feign.SegurancaEJBTest
2026-07-14T20:34:51.2245032Z [INFO] Running br.gov.caixa.mpi.dict.feign.ErroDecoderFeignMPITest
2026-07-14T20:34:51.2255637Z 2026-07-14 17:34:51 INFO  ErrorDecoderFeignMPI - [SIMPI-DICT] XML do bacen -> Property: type jsonResponse: 
2026-07-14T20:34:51.2256027Z 5594   [INFO] br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI - [SIMPI-DICT] XML do bacen -> Property: type jsonResponse: 
2026-07-14T20:34:51.2256340Z 5594   [INFO] br.gov.caixa.mpi.dict.feign.ErrorDecoderFeignMPI - [SIMPI-DICT] XML do bacen -> Property: type jsonResponse: 
2026-07-14T20:34:51.2260450Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s - in br.gov.caixa.mpi.dict.feign.ErroDecoderFeignMPITest
2026-07-14T20:34:51.2260743Z [INFO] Running br.gov.caixa.mpi.dict.br.gov.caixa.mpi.dict.v2.api.ApiClientV2NpTest
2026-07-14T20:34:51.3253739Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.098 s - in br.gov.caixa.mpi.dict.br.gov.caixa.mpi.dict.v2.api.ApiClientV2NpTest
2026-07-14T20:34:51.3295513Z [INFO] Running br.gov.caixa.mpi.dict.br.gov.caixa.mpi.dict.v2.api.ApiClientV2Test
2026-07-14T20:34:51.4248073Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.095 s - in br.gov.caixa.mpi.dict.br.gov.caixa.mpi.dict.v2.api.ApiClientV2Test
2026-07-14T20:34:51.4249037Z [INFO] Running br.gov.caixa.mpi.dict.servico.CalculaQuantidadeRateLimitBacenTest
2026-07-14T20:34:51.4298679Z 2026-07-14 17:34:51 ERROR CalculaQuantidadeRateLimitBacen - [ESTATISTICAS] [RATELIMIT-BACEN] quantidade de erros de rate limit BACEN por categoria: {STATISTICS_READ=3}
2026-07-14T20:34:51.4300158Z 5800   [ERROR] br.gov.caixa.mpi.dict.servico.CalculaQuantidadeRateLimitBacen - [ESTATISTICAS] [RATELIMIT-BACEN] quantidade de erros de rate limit BACEN por categoria: {STATISTICS_READ=3}
2026-07-14T20:34:51.4300563Z 5800   [ERROR] br.gov.caixa.mpi.dict.servico.CalculaQuantidadeRateLimitBacen - [ESTATISTICAS] [RATELIMIT-BACEN] quantidade de erros de rate limit BACEN por categoria: {STATISTICS_READ=3}
2026-07-14T20:34:51.4315135Z [INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.006 s - in br.gov.caixa.mpi.dict.servico.CalculaQuantidadeRateLimitBacenTest
2026-07-14T20:34:51.4336907Z [INFO] Running br.gov.caixa.mpi.dict.security.JwtAuthFilterTest
2026-07-14T20:34:51.4343313Z 2026-07-14 17:34:51 ERROR CalculaQuantidadeRateLimitBacen - [ESTATISTICAS] [RATELIMIT-BACEN] quantidade de erros de rate limit BACEN por categoria: {STATISTICS_READ=1}
2026-07-14T20:34:51.4343967Z 5805   [ERROR] br.gov.caixa.mpi.dict.servico.CalculaQuantidadeRateLimitBacen - [ESTATISTICAS] [RATELIMIT-BACEN] quantidade de erros de rate limit BACEN por categoria: {STATISTICS_READ=1}
2026-07-14T20:34:51.4344870Z 5805   [ERROR] br.gov.caixa.mpi.dict.servico.CalculaQuantidadeRateLimitBacen - [ESTATISTICAS] [RATELIMIT-BACEN] quantidade de erros de rate limit BACEN por categoria: {STATISTICS_READ=1}
2026-07-14T20:34:51.6577774Z 2026-07-14 17:34:51 INFO  JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6579288Z 6027   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6580761Z 6027   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6602177Z 2026-07-14 17:34:51 INFO  JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6625034Z 6031   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6625541Z 6031   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6731569Z 2026-07-14 17:34:51 INFO  JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6732201Z 6044   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6732666Z 6044   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6830431Z 2026-07-14 17:34:51 INFO  JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v2
2026-07-14T20:34:51.6831502Z 6046   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v2
2026-07-14T20:34:51.6831837Z 6046   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v2
2026-07-14T20:34:51.6832102Z 2026-07-14 17:34:51 INFO  JwtAuthFilter - [JWT-AUTH-FILTER] Bypass token...
2026-07-14T20:34:51.6832362Z 6046   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] Bypass token...
2026-07-14T20:34:51.6832626Z 6046   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] Bypass token...
2026-07-14T20:34:51.6832887Z 2026-07-14 17:34:51 INFO  JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6833901Z 6048   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6834388Z 6048   [INFO] br.gov.caixa.mpi.dict.security.JwtAuthFilter - [JWT-AUTH-FILTER] versao da api v3
2026-07-14T20:34:51.6836686Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.248 s - in br.gov.caixa.mpi.dict.security.JwtAuthFilterTest
2026-07-14T20:34:52.0707285Z [INFO] 
2026-07-14T20:34:52.0707506Z [INFO] Results:
2026-07-14T20:34:52.0707639Z [INFO] 
2026-07-14T20:34:52.0707790Z [INFO] Tests run: 175, Failures: 0, Errors: 0, Skipped: 0
2026-07-14T20:34:52.0707942Z [INFO] 
2026-07-14T20:34:52.0749131Z [INFO] 
2026-07-14T20:34:52.0749770Z [INFO] --- jacoco-maven-plugin:0.8.12:report (report) @ simpi-dict-ejb ---
2026-07-14T20:34:52.0777336Z [INFO] Loading execution data file /opt/ads-agent/_work/9141/s/simpi-dict-ejb/target/jacoco.exec
2026-07-14T20:34:52.3175946Z [INFO] Analyzed bundle 'simpi-dict-ejb' with 365 classes
2026-07-14T20:34:52.9052594Z [INFO] 
2026-07-14T20:34:52.9065337Z [INFO] --- maven-ejb-plugin:2.4:ejb (default-ejb) @ simpi-dict-ejb ---
2026-07-14T20:34:52.9863189Z [INFO] Building EJB simpi-dict-ejb with EJB version 3.1
2026-07-14T20:34:53.0435546Z [INFO] Building jar: /opt/ads-agent/_work/9141/s/simpi-dict-ejb/target/simpi-dict-ejb.jar
2026-07-14T20:34:53.1181695Z [INFO] 
2026-07-14T20:34:53.1189602Z [INFO] --- maven-install-plugin:2.4:install (default-install) @ simpi-dict-ejb ---
2026-07-14T20:34:53.1217471Z [INFO] Installing /opt/ads-agent/_work/9141/s/simpi-dict-ejb/target/simpi-dict-ejb.jar to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/simpi-dict-ejb/770955/simpi-dict-ejb-770955.jar
2026-07-14T20:34:53.1285822Z [INFO] Installing /opt/ads-agent/_work/9141/s/simpi-dict-ejb/pom.xml to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/simpi-dict-ejb/770955/simpi-dict-ejb-770955.pom
2026-07-14T20:34:53.1317743Z [INFO] 
2026-07-14T20:34:53.1318490Z [INFO] ------------------< br.gov.caixa.dict:simpi-dict-war >------------------
2026-07-14T20:34:53.1319067Z [INFO] Building simpi-dict-war 770955                                     [3/4]
2026-07-14T20:34:53.1319587Z [INFO] --------------------------------[ war ]---------------------------------
2026-07-14T20:34:53.1476491Z [INFO] 
2026-07-14T20:34:53.1477345Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ simpi-dict-war ---
2026-07-14T20:34:53.1485292Z [INFO] 
2026-07-14T20:34:53.1485771Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict-war ---
2026-07-14T20:34:53.1596189Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/simpi-dict-war/target/jacoco.exec
2026-07-14T20:34:53.1596733Z [INFO] 
2026-07-14T20:34:53.1597629Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ simpi-dict-war ---
2026-07-14T20:34:53.1597957Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:53.1598256Z [INFO] Copying 2 resources
2026-07-14T20:34:53.1598591Z [INFO] 
2026-07-14T20:34:53.1598965Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ simpi-dict-war ---
2026-07-14T20:34:53.1599317Z [INFO] Changes detected - recompiling the module!
2026-07-14T20:34:53.1599931Z [INFO] Compiling 15 source files to /opt/ads-agent/_work/9141/s/simpi-dict-war/target/classes
2026-07-14T20:34:53.6376167Z [WARNING] /opt/ads-agent/_work/9141/s/simpi-dict-war/src/main/java/br/gov/caixa/mpi/dict/rest/KeyRest.java: /opt/ads-agent/_work/9141/s/simpi-dict-war/src/main/java/br/gov/caixa/mpi/dict/rest/KeyRest.java uses or overrides a deprecated API.
2026-07-14T20:34:53.6381192Z [WARNING] /opt/ads-agent/_work/9141/s/simpi-dict-war/src/main/java/br/gov/caixa/mpi/dict/rest/KeyRest.java: Recompile with -Xlint:deprecation for details.
2026-07-14T20:34:53.6381616Z [INFO] 
2026-07-14T20:34:53.6382041Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict-war ---
2026-07-14T20:34:53.6382610Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/simpi-dict-war/target/jacoco.exec
2026-07-14T20:34:53.6383042Z [INFO] 
2026-07-14T20:34:53.6385042Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ simpi-dict-war ---
2026-07-14T20:34:53.6385353Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:53.6385604Z [INFO] Copying 2 resources
2026-07-14T20:34:53.6385824Z [INFO] 
2026-07-14T20:34:53.6386219Z [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ simpi-dict-war ---
2026-07-14T20:34:53.6386599Z [INFO] Nothing to compile - all classes are up to date
2026-07-14T20:34:53.6386769Z [INFO] 
2026-07-14T20:34:53.6387067Z [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ simpi-dict-war ---
2026-07-14T20:34:53.6387501Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:53.6387958Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9141/s/simpi-dict-war/src/test/resources
2026-07-14T20:34:53.6388294Z [INFO] 
2026-07-14T20:34:53.6388687Z [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ simpi-dict-war ---
2026-07-14T20:34:53.6423473Z [INFO] No sources to compile
2026-07-14T20:34:53.6424097Z [INFO] 
2026-07-14T20:34:53.6424750Z [INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ simpi-dict-war ---
2026-07-14T20:34:53.6424920Z [INFO] No tests to run.
2026-07-14T20:34:53.6425036Z [INFO] 
2026-07-14T20:34:53.6425250Z [INFO] --- jacoco-maven-plugin:0.8.12:report (report) @ simpi-dict-war ---
2026-07-14T20:34:53.6425425Z [INFO] Skipping JaCoCo execution due to missing execution data file.
2026-07-14T20:34:53.6425567Z [INFO] 
2026-07-14T20:34:53.6425771Z [INFO] --- maven-war-plugin:2.1.1:war (default-war) @ simpi-dict-war ---
2026-07-14T20:34:53.7549933Z [INFO] Packaging webapp
2026-07-14T20:34:53.7616028Z [INFO] Assembling webapp [simpi-dict-war] in [/opt/ads-agent/_work/9141/s/simpi-dict-war/target/simpi-dict-war]
2026-07-14T20:34:53.7675423Z [INFO] Processing war project
2026-07-14T20:34:53.7773355Z [INFO] Copying webapp webResources [/opt/ads-agent/_work/9141/s/simpi-dict-war/src/main/resources] to [/opt/ads-agent/_work/9141/s/simpi-dict-war/target/simpi-dict-war]
2026-07-14T20:34:53.7824755Z [INFO] Copying webapp resources [/opt/ads-agent/_work/9141/s/simpi-dict-war/src/main/webapp]
2026-07-14T20:34:53.8495798Z [INFO] Webapp assembled in [100 msecs]
2026-07-14T20:34:54.0374794Z [INFO] Building war: /opt/ads-agent/_work/9141/s/simpi-dict-war/target/simpi-dict-war.war
2026-07-14T20:34:54.8705961Z [INFO] WEB-INF/web.xml already added, skipping
2026-07-14T20:34:54.8766650Z [INFO] 
2026-07-14T20:34:54.8767511Z [INFO] --- maven-install-plugin:2.4:install (default-install) @ simpi-dict-war ---
2026-07-14T20:34:54.8779486Z [INFO] Installing /opt/ads-agent/_work/9141/s/simpi-dict-war/target/simpi-dict-war.war to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/simpi-dict-war/770955/simpi-dict-war-770955.war
2026-07-14T20:34:54.8974501Z [INFO] Installing /opt/ads-agent/_work/9141/s/simpi-dict-war/pom.xml to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/simpi-dict-war/770955/simpi-dict-war-770955.pom
2026-07-14T20:34:54.9006033Z [INFO] 
2026-07-14T20:34:54.9007404Z [INFO] ------------------< br.gov.caixa.dict:simpi-dict-ear >------------------
2026-07-14T20:34:54.9009001Z [INFO] Building simpi-dict-ear 770955                                     [4/4]
2026-07-14T20:34:54.9009607Z [INFO] --------------------------------[ ear ]---------------------------------
2026-07-14T20:34:54.9268571Z [INFO] 
2026-07-14T20:34:54.9269175Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ simpi-dict-ear ---
2026-07-14T20:34:54.9269370Z [INFO] 
2026-07-14T20:34:54.9269641Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict-ear ---
2026-07-14T20:34:54.9272528Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/simpi-dict-ear/target/jacoco.exec
2026-07-14T20:34:54.9272945Z [INFO] 
2026-07-14T20:34:54.9273690Z [INFO] --- maven-ear-plugin:2.6:generate-application-xml (default-generate-application-xml) @ simpi-dict-ear ---
2026-07-14T20:34:54.9835975Z [INFO] Generating application.xml
2026-07-14T20:34:54.9955558Z [INFO] 
2026-07-14T20:34:54.9957857Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ simpi-dict-ear ---
2026-07-14T20:34:54.9958355Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:54.9958863Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9141/s/simpi-dict-ear/src/main/resources
2026-07-14T20:34:54.9959229Z [INFO] 
2026-07-14T20:34:54.9960058Z [INFO] --- jacoco-maven-plugin:0.8.12:prepare-agent (default) @ simpi-dict-ear ---
2026-07-14T20:34:54.9960589Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/9141/s/simpi-dict-ear/target/jacoco.exec
2026-07-14T20:34:54.9960911Z [INFO] 
2026-07-14T20:34:54.9961247Z [INFO] --- maven-ear-plugin:2.6:generate-application-xml (default-generate-application-xml) @ simpi-dict-ear ---
2026-07-14T20:34:54.9961609Z [INFO] Generating application.xml
2026-07-14T20:34:54.9962220Z [INFO] 
2026-07-14T20:34:54.9963603Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ simpi-dict-ear ---
2026-07-14T20:34:54.9963990Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-14T20:34:54.9964520Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/9141/s/simpi-dict-ear/src/main/resources
2026-07-14T20:34:54.9965248Z [INFO] 
2026-07-14T20:34:54.9965742Z [INFO] --- jacoco-maven-plugin:0.8.12:report (report) @ simpi-dict-ear ---
2026-07-14T20:34:54.9966051Z [INFO] Skipping JaCoCo execution due to missing execution data file.
2026-07-14T20:34:54.9966266Z [INFO] 
2026-07-14T20:34:54.9966590Z [INFO] --- maven-ear-plugin:2.6:ear (default-ear) @ simpi-dict-ear ---
2026-07-14T20:34:54.9969211Z [INFO] Copying artifact[war:br.gov.caixa.dict:simpi-dict-war:770955] to[simpi-dict-war.war]
2026-07-14T20:34:55.0271805Z [INFO] Could not find manifest file: /opt/ads-agent/_work/9141/s/simpi-dict-ear/target/simpi-dict-ear/META-INF/MANIFEST.MF - Generating one
2026-07-14T20:34:55.0886554Z [INFO] Building jar: /opt/ads-agent/_work/9141/s/simpi-dict-ear/target/simpi-dict-ear.ear
2026-07-14T20:34:55.8242362Z [INFO] 
2026-07-14T20:34:55.8243028Z [INFO] --- maven-install-plugin:2.4:install (default-install) @ simpi-dict-ear ---
2026-07-14T20:34:55.8263289Z [INFO] Installing /opt/ads-agent/_work/9141/s/simpi-dict-ear/target/simpi-dict-ear.ear to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/simpi-dict-ear/770955/simpi-dict-ear-770955.ear
2026-07-14T20:34:55.8482507Z [INFO] Installing /opt/ads-agent/_work/9141/s/simpi-dict-ear/pom.xml to /opt/ads-agent/.m2/repository/br/gov/caixa/dict/simpi-dict-ear/770955/simpi-dict-ear-770955.pom
2026-07-14T20:34:55.8527657Z [INFO] ------------------------------------------------------------------------
2026-07-14T20:34:55.8528128Z [INFO] Reactor Summary for simpi-dict 770955:
2026-07-14T20:34:55.8528694Z [INFO] 
2026-07-14T20:34:55.8529056Z [INFO] simpi-dict ......................................... SUCCESS [  0.458 s]
2026-07-14T20:34:55.8529510Z [INFO] simpi-dict-ejb ..................................... SUCCESS [ 17.147 s]
2026-07-14T20:34:55.8529761Z [INFO] simpi-dict-war ..................................... SUCCESS [  1.769 s]
2026-07-14T20:34:55.8529986Z [INFO] simpi-dict-ear ..................................... SUCCESS [  0.951 s]
2026-07-14T20:34:55.8530208Z [INFO] ------------------------------------------------------------------------
2026-07-14T20:34:55.8530362Z [INFO] BUILD SUCCESS
2026-07-14T20:34:55.8530571Z [INFO] ------------------------------------------------------------------------
2026-07-14T20:34:55.8530714Z [INFO] Total time:  20.407 s
2026-07-14T20:34:55.8530917Z [INFO] Finished at: 2026-07-14T17:34:55-03:00
2026-07-14T20:34:55.8531145Z [INFO] ------------------------------------------------------------------------
2026-07-14T20:34:55.9475583Z ##[section]Finishing: Maven
