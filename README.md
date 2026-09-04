<img width="1663" height="907" alt="image" src="https://github.com/user-attachments/assets/89443e08-9100-462d-a9e0-59199a0b2156" />


nao da pra mecher aqui



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
/usr/bin/bash /opt/ads-agent/_work/_temp/80156bdc-f274-434e-80b7-bda5ed518082.sh
false
-----------------------------------------
Dados do pacote: -DgroupId=br.gov.caixa.api -DartifactId=caixa-api-siacm_audit -Dversion=2.3.0.56-SNAPSHOT -Dpackaging=jar Dfile=target/caixa-api-siacm_audit-2.3.0.56.jar -Durl=http://binario.caixa:8081/repository/snapshots
mvn deploy:deploy-file -DgroupId=br.gov.caixa.api -DartifactId=caixa-api-siacm_audit -Dversion=2.3.0.56-SNAPSHOT -Dpackaging=jar -Dfile=target/caixa-api-siacm_audit-2.3.0.56.jar -DrepositoryId=NEXUS_INTERNO -DgeneratePom=true -Durl=http://binario.caixa:8081/repository/snapshots
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------< br.gov.caixa.api:caixa-api-siacm_audit >---------------
[INFO] Building Caixa API SIACM Auditoria 2.3.0.56
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy-file (default-cli) @ caixa-api-siacm_audit ---
Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/api/caixa-api-siacm_audit/2.3.0.56-SNAPSHOT/maven-metadata.xml
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/api/caixa-api-siacm_audit/2.3.0.56-SNAPSHOT/caixa-api-siacm_audit-2.3.0.56-20260903.201553-1.jar
Progress (1): 4.1/55 kB
Progress (1): 8.2/55 kB
Progress (1): 12/55 kB 
Progress (1): 16/55 kB
Progress (1): 20/55 kB
Progress (1): 25/55 kB
Progress (1): 29/55 kB
Progress (1): 33/55 kB
Progress (1): 37/55 kB
Progress (1): 41/55 kB
Progress (1): 45/55 kB
Progress (1): 49/55 kB
Progress (1): 53/55 kB
Progress (1): 55 kB   
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/api/caixa-api-siacm_audit/2.3.0.56-SNAPSHOT/caixa-api-siacm_audit-2.3.0.56-20260903.201553-1.jar (55 kB at 1.2 MB/s)
