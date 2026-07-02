ok vamos verificar se é o mesmo pacote de deploy


Recupera versão projeto (groupId:artifactId:type:version)

View raw log

Starting: Recupera versão projeto (groupId:artifactId:type:version)
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/24ffe8d9-c251-42ef-a99c-ce9e3ca9ee89.sh
Entrando no diretório: /opt/ads-agent/_work/7868/s
Arquivos encontrados: total 8
drwxr-xr-x 4 sadscp01 sadscp01  65 Jun 24 15:55 .
drwxr-xr-x 7 sadscp01 sadscp01  67 Jun 24 15:55 ..
drwxr-xr-x 8 sadscp01 sadscp01 162 Jun 24 15:55 .git
-rw-r--r-- 1 sadscp01 sadscp01 209 Jun 24 15:55 .project
drwxr-xr-x 6 sadscp01 sadscp01 105 Jun 24 15:55 SICMU
-rw-r--r-- 1 sadscp01 sadscp01  79 Jun 24 15:55 SUPORTE.md
Encontrado o arquivo: ./SICMU/SICMU-ear/target/SICMU-ear.ear\n
Diretório do projeto: ./SICMU/SICMU-ear/target
Conteúdo do diretório: total 22072
drwxr-xr-x 4 sadscp01 sadscp01       89 Jun 24 15:55 .
drwxr-xr-x 5 sadscp01 sadscp01       97 Jun 24 15:55 ..
-rw-r--r-- 1 sadscp01 sadscp01      549 Jun 24 15:55 application.xml
drwxr-xr-x 2 sadscp01 sadscp01       28 Jun 24 15:55 maven-archiver
drwxr-xr-x 4 sadscp01 sadscp01       75 Jun 24 15:55 SICMU-ear
-rw-r--r-- 1 sadscp01 sadscp01 22593596 Jun 24 15:55 SICMU-ear.ear
Arquivo POM: ./SICMU/SICMU-ear/target/maven-archiver/pom.properties
br.gov.caixa:SICMU-ear:ear:0.0.1-SNAPSHOT
Finishing: Recupera versão projeto (groupId:artifactId:type:version)




Progress (1): 1.1/23 MB
Progress (1): 1.4/23 MB
Progress (1): 1.6/23 MB
Progress (1): 1.8/23 MB
Progress (1): 2.0/23 MB
Progress (1): 2.3/23 MB
Progress (1): 2.5/23 MB
Progress (1): 2.7/23 MB
Progress (1): 2.9/23 MB
Progress (1): 3.2/23 MB
Progress (1): 3.4/23 MB
Progress (1): 3.6/23 MB
Progress (1): 3.8/23 MB
Progress (1): 4.1/23 MB
Progress (1): 4.3/23 MB
Progress (1): 4.5/23 MB
Progress (1): 4.7/23 MB
Progress (1): 5.0/23 MB
Progress (1): 5.2/23 MB
Progress (1): 5.4/23 MB
Progress (1): 5.6/23 MB
Progress (1): 5.9/23 MB
Progress (1): 6.1/23 MB
Progress (1): 6.3/23 MB
Progress (1): 6.5/23 MB
Progress (1): 6.8/23 MB
Progress (1): 7.0/23 MB
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/SICMU-ear/01.05.05.004/SICMU-ear-01.05.05.004.ear (23 MB at 29 MB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/SICMU-ear/01.05.05.004/SICMU-ear-01.05.05.004.pom
Progress (1): 431 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/SICMU-ear/01.05.05.004/SICMU-ear-01.05.05.004.pom (431 B at 14 kB/s)
Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/SICMU-ear/maven-metadata.xml
Progress (1): 348 B
                   
Downloaded from NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/SICMU-ear/maven-metadata.xml (348 B at 8.7 kB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/SICMU-ear/maven-metadata.xml
Progress (1): 386 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/releases/br/gov/caixa/SICMU-ear/maven-metadata.xml (386 B at 6.5 kB/s)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.457 s
[INFO] Finished at: 2026-06-24T15:57:59-03:00
[INFO] ------------------------------------------------------------------------
Finishing: Publica no Nexus


