na buld que rdei hoje:


Publica no Nexus

View raw log

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
/bin/bash /opt/ads-agent/_work/_temp/26121a59-99d9-41f9-a8ea-d91dca4c8ac3.sh
VEC false
=== Info do pacote ===
groupid= br.gov.caixa.sigpd
artifact= sigpd-ear
version= 3.4.2.10-SNAPSHOT
=========================================================
/opt/ads-agent/_work/_temp/26121a59-99d9-41f9-a8ea-d91dca4c8ac3.sh: line 28: library: comando não encontrado
/opt/ads-agent/_work/_temp/26121a59-99d9-41f9-a8ea-d91dca4c8ac3.sh: line 38: ./ear/${jboss.deploy.dir}/sigpd-ear.ear: substituição incorreta
Async Command Start: Update Build Number
Update build number to 3.4.2.10-SNAPSHOT for build 754517
Async Command End: Update Build Number
Finishing: Publica no Nexus





peguei uma build antiga aqui 

Publica no Nexus

View raw log

[INFO] SIGPD: API Module                                                  [war]
[INFO] SIGPD: BATCH Module                                                [ejb]
[INFO] SIGPD: EAR Module                                                  [ear]
[INFO] 
[INFO] ----------------------< br.gov.caixa.sigpd:sigpd >----------------------
[INFO] Building SIGPD 1.9.0.1-SNAPSHOT                                    [1/5]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy-file (default-cli) @ sigpd ---
Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/maven-metadata.xml
Progress (1): 786 B
                   
Downloaded from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/maven-metadata.xml (786 B at 8.4 kB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/sigpd-ear-1.9.0.1-20260621.141545-97.ear
Progress (1): 0.5/107 MB
Progress (1): 1.0/107 MB
Progress (1): 1.6/107 MB
Progress (1): 2.1/107 MB
Progress (1): 2.6/107 MB
Progress (1): 3.1/107 MB
Progress (1): 3.7/107 MB
Progress (1): 4.2/107 MB
Progress (1): 4.7/107 MB
Progress (1): 5.2/107 MB
Progress (1): 5.8/107 MB
Progress (1): 6.3/107 MB
Progress (1): 6.8/107 MB
Progress (1): 7.3/107 MB
Progress (1): 7.9/107 MB
Progress (1): 8.4/107 MB
Progress (1): 8.9/107 MB
Progress (1): 9.4/107 MB
Progress (1): 10.0/107 MB
Progress (1): 10/107 MB  
Progress (1): 11/107 MB
Progress (1): 12/107 MB
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/sigpd-ear-1.9.0.1-20260621.141545-97.pom
Progress (1): 441 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/sigpd-ear-1.9.0.1-20260621.141545-97.pom (441 B at 21 kB/s)
Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/maven-metadata.xml
Progress (1): 371 B
                   
Downloaded from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/maven-metadata.xml (371 B at 29 kB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/maven-metadata.xml
Progress (1): 786 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/maven-metadata.xml (786 B at 22 kB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/maven-metadata.xml
Progress (1): 371 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/maven-metadata.xml (371 B at 9.0 kB/s)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for SIGPD 1.9.0.1-SNAPSHOT:
[INFO] 
[INFO] SIGPD .............................................. SUCCESS [  3.422 s]
[INFO] SIGPD: CORE Module ................................. SKIPPED
[INFO] SIGPD: API Module .................................. SKIPPED
[INFO] SIGPD: BATCH Module ................................ SKIPPED
[INFO] SIGPD: EAR Module .................................. SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.560 s
[INFO] Finished at: 2026-06-21T11:15:49-03:00
[INFO] ------------------------------------------------------------------------
Async Command Start: Update Build Number
Update build number to 1.9.0.1-SNAPSHOT for build 751853
Async Command End: Update Build Number
Finishing: Publica no Nexus
