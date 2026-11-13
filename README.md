<img width="1643" height="836" alt="image" src="https://github.com/user-attachments/assets/eebbaad3-81ee-44e2-8446-4017141438df" />


Starting: Publica no Nexus
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/e947335a-8bd0-4703-87e1-ca3f1f8d6224.sh
VEC true
=== Info do pacote ===
groupid= br.gov.caixa.siifx.caixinhas
artifact= core-starter
version= 0.0.182.1
=========================================================
/opt/ads-agent/_work/_temp/e947335a-8bd0-4703-87e1-ca3f1f8d6224.sh: line 28: library: command not found
-Dversion.app=0.0.182.1 -DgroupId=br.gov.caixa.siifx.caixinhas -DartifactId=core-starter -Dversion=0.0.182.1 -Dpackaging=jar -Dfile=batch-platform/core-starter/target/core-starter.jar -DrepositoryId=NEXUS_INTERNO -DgeneratePom=true -Durl=http://binario.caixa:8081/repository/releases
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy-file (default-cli) @ standalone-pom ---
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/core-starter/0.0.182.1/core-starter-0.0.182.1.jar
Progress (1): 4.1/61 kB
Progress (1): 8.2/61 kB
Progress (1): 12/61 kB 
Progress (1): 16/61 kB
Progress (1): 20/61 kB
Progress (1): 25/61 kB
Progress (1): 29/61 kB
Progress (1): 33/61 kB
Progress (1): 37/61 kB
Progress (1): 41/61 kB
Progress (1): 45/61 kB
Progress (1): 49/61 kB
Progress (1): 53/61 kB


2026-11-13T15:11:50.6000263Z ##[section]Starting: Publica no Nexus
2026-11-13T15:11:50.6003691Z ==============================================================================
2026-11-13T15:11:50.6003773Z Task         : Bash
2026-11-13T15:11:50.6003821Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-13T15:11:50.6003948Z Version      : 3.227.0
2026-11-13T15:11:50.6004019Z Author       : Microsoft Corporation
2026-11-13T15:11:50.6004094Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-13T15:11:50.6004184Z ==============================================================================
2026-11-13T15:11:50.7343361Z Generating script.
2026-11-13T15:11:50.7357552Z ========================== Starting Command Output ===========================
2026-11-13T15:11:50.7365282Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/f22ab2a7-a7d3-44c6-8bb5-c19693506ad4.sh
2026-11-13T15:11:50.7423499Z VEC true
2026-11-13T15:11:50.7424887Z ##[section]=== Info do pacote ===
2026-11-13T15:11:50.7425103Z ##[section]groupid= br.gov.caixa.siifx.caixinhas
2026-11-13T15:11:50.7425374Z ##[section]artifact= mod-caixinhas
2026-11-13T15:11:50.7425507Z ##[section]version= 0.0.182.1
2026-11-13T15:11:50.7425632Z =========================================================
2026-11-13T15:11:50.7425906Z /opt/ads-agent/_work/_temp/f22ab2a7-a7d3-44c6-8bb5-c19693506ad4.sh: line 28: library: command not found
2026-11-13T15:11:50.7429638Z -Dversion.app=0.0.182.1 -DgroupId=br.gov.caixa.siifx.caixinhas -DartifactId=mod-caixinhas -Dversion=0.0.182.1 -Dpackaging=jar -Dfile=mod-caixinhas/target/mod-caixinhas.jar -DrepositoryId=NEXUS_INTERNO -DgeneratePom=true -Durl=http://binario.caixa:8081/repository/releases
2026-11-13T15:11:51.4774733Z [INFO] Scanning for projects...
2026-11-13T15:11:51.5541101Z [INFO] 
2026-11-13T15:11:51.5542159Z [INFO] ------------------< org.apache.maven:standalone-pom >-------------------
2026-11-13T15:11:51.5542490Z [INFO] Building Maven Stub Project (No POM) 1
2026-11-13T15:11:51.5543393Z [INFO] --------------------------------[ pom ]---------------------------------
2026-11-13T15:11:51.5571623Z [INFO] 
2026-11-13T15:11:51.5572134Z [INFO] --- maven-deploy-plugin:2.7:deploy-file (default-cli) @ standalone-pom ---
2026-11-13T15:11:51.7628850Z Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/mod-caixinhas/0.0.182.1/mod-caixinhas-0.0.182.1.jar
2026-11-13T15:11:51.8172246Z Progress (1): 4.1/118 kB
2026-11-13T15:11:51.8172429Z Progress (1): 8.2/118 kB
2026-11-13T15:11:51.8172555Z Progress (1): 12/118 kB 
2026-11-13T15:11:51.8172713Z Progress (1): 16/118 kB
2026-11-13T15:11:51.8172892Z Progress (1): 20/118 kB
2026-11-13T15:11:51.8173526Z Progress (1): 25/118 kB
2026-11-13T15:11:51.8174634Z Progress (1): 29/118 kB
2026-11-13T15:11:51.8176444Z Progress (1): 33/118 kB
2026-11-13T15:11:51.8177728Z Progress (1): 37/118 kB
2026-11-13T15:11:51.8177851Z Progress (1): 41/118 kB
2026-11-13T15:11:51.8178635Z Progress (1): 45/118 kB
2026-11-13T15:11:51.8179541Z Progress (1): 49/118 kB
2026-11-13T15:11:51.8180651Z Progress (1): 53/118 kB
2026-11-13T15:11:51.8181958Z Progress (1): 57/118 kB
2026-11-13T15:11:51.8182968Z Progress (1): 61/118 kB
2026-11-13T15:11:51.8184022Z Progress (1): 66/118 kB
2026-11-13T15:11:51.8185298Z Progress (1): 70/118 kB
2026-11-13T15:11:51.8186606Z Progress (1): 74/118 kB
2026-11-13T15:11:51.8187580Z Progress (1): 78/118 kB
2026-11-13T15:11:51.8188632Z Progress (1): 82/118 kB
2026-11-13T15:11:51.8189992Z Progress (1): 86/118 kB
2026-11-13T15:11:51.8191036Z Progress (1): 90/118 kB
2026-11-13T15:11:51.8192692Z Progress (1): 94/118 kB
2026-11-13T15:11:51.8193408Z Progress (1): 98/118 kB
2026-11-13T15:11:51.8194523Z Progress (1): 102/118 kB
2026-11-13T15:11:51.8195593Z Progress (1): 106/118 kB
2026-11-13T15:11:51.8196672Z Progress (1): 111/118 kB
2026-11-13T15:11:51.8197589Z Progress (1): 115/118 kB
2026-11-13T15:11:51.8678612Z Progress (1): 118 kB    
2026-11-13T15:11:51.8678866Z                     
2026-11-13T15:11:51.8680508Z Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/mod-caixinhas/0.0.182.1/mod-caixinhas-0.0.182.1.jar (118 kB at 1.1 MB/s)
2026-11-13T15:11:51.8681189Z Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/mod-caixinhas/0.0.182.1/mod-caixinhas-0.0.182.1.pom
2026-11-13T15:11:51.9033336Z Progress (1): 419 B
2026-11-13T15:11:51.9033517Z                    
2026-11-13T15:11:51.9034056Z Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/mod-caixinhas/0.0.182.1/mod-caixinhas-0.0.182.1.pom (419 B at 12 kB/s)
2026-11-13T15:11:51.9063223Z Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/mod-caixinhas/maven-metadata.xml
2026-11-13T15:11:52.0379808Z Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/mod-caixinhas/maven-metadata.xml
2026-11-13T15:11:52.0899274Z Progress (1): 329 B
2026-11-13T15:11:52.0899495Z                    
2026-11-13T15:11:52.0900052Z Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/mod-caixinhas/maven-metadata.xml (329 B at 6.3 kB/s)
2026-11-13T15:11:52.0903027Z [INFO] ------------------------------------------------------------------------
2026-11-13T15:11:52.0903186Z [INFO] BUILD SUCCESS
2026-11-13T15:11:52.0903990Z [INFO] ------------------------------------------------------------------------
2026-11-13T15:11:52.0915364Z [INFO] Total time:  0.627 s
2026-11-13T15:11:52.0918178Z [INFO] Finished at: 2026-11-13T12:11:52-03:00
2026-11-13T15:11:52.0918753Z [INFO] ------------------------------------------------------------------------
2026-11-13T15:11:52.1106938Z ##[section]Finishing: Publica no Nexus


Starting: Publica no Nexus
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/9034ce18-1de0-4642-ad8d-c167b93ca721.sh
VEC true
=== Info do pacote ===
groupid= br.gov.caixa.siifx.caixinhas
artifact= siifx-caixinhas-batch
version= 0.0.182.1
=========================================================
/opt/ads-agent/_work/_temp/9034ce18-1de0-4642-ad8d-c167b93ca721.sh: line 28: library: command not found
-Dversion.app=0.0.182.1 -DgroupId=br.gov.caixa.siifx.caixinhas -DartifactId=siifx-caixinhas-batch -Dversion=0.0.182.1 -Dpackaging=jar -Dfile=batch-launcher/target/siifx-caixinhas-batch.jar -DrepositoryId=NEXUS_INTERNO -DgeneratePom=true -Durl=http://binario.caixa:8081/repository/releases
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy-file (default-cli) @ standalone-pom ---
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/siifx/caixinhas/siifx-caixinhas-batch/0.0.182.1/siifx-caixinhas-batch-0.0.182.1.jar
Progress (1): 0.4/45 MB
Progress (1): 0.9/45 MB
Progress (1): 1.3/45 MB
Progress (1): 1.8/45 MB
Progress (1): 2.2/45 MB
Progress (1): 2.7/45 MB
Progress (1): 3.1/45 MB
Progress (1): 3.6/45 MB
Progress (1): 4.0/45 MB
Progress (1): 4.5/45 MB
Progress (1): 4.9/45 MB
Progress (1): 5.4/45 MB
Progress (1): 5.8/45 MB

