Starting: Criando Image Tag - Build.BuildNumber
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/2711425c-01de-44da-950c-99e780dca9cb.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ buildconfig=sisou-sac-okd
+ oc tag build-images-ads/sisou-sac-okd:latest build-images-ads/sisou-sac-okd:2.0.0.3-SAC-SNAPSHOT
Tag build-images-ads/sisou-sac-okd:2.0.0.3-SAC-SNAPSHOT set to build-images-ads/sisou-sac-okd@sha256:b357ab0eeb8ed8888761100760c0bb33465b31466db26c4b8b920e078aef9332.
Finishing: Criando Image Tag - Build.BuildNumber



Copiando S2I para StagingDirectory

View raw log

Starting: Copiando S2I para StagingDirectory
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/44c0f899-217f-46f9-ad90-5ce3d1c95d9b.sh
Artefato que será enviado para Imagem Docker: ./ear/target/sisou-2.0.0.3-sac.ear
'./ear/target/sisou-2.0.0.3-sac.ear' -> '/opt/ads-agent/_work/98/a/sisou-2.0.0.3-sac.ear'
renamed '/opt/ads-agent/_work/98/a/sisou-2.0.0.3-sac.ear' -> '/opt/ads-agent/_work/98/a/sisou-sac-okd.ear'
Finishing: Copiando S2I para StagingDirectory


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
/usr/bin/bash /opt/ads-agent/_work/_temp/139c089c-1ff3-482b-b447-7d4caac7f70d.sh
Entrando no diretório: /opt/ads-agent/_work/98/s
Arquivos encontrados: total 52
drwxr-xr-x. 7 root root   146 jun  2 12:49 .
drwxr-xr-x. 7 root root    67 jun  2 12:49 ..
drwxr-xr-x. 4 root root    64 jun  2 12:52 api
drwxr-xr-x. 5 root root    62 jun  2 12:50 core
drwxr-xr-x. 4 root root    46 jun  2 12:53 ear
drwxr-xr-x. 8 root root   162 jun  2 12:49 .git
-rw-r--r--. 1 root root  1230 jun  2 12:49 .gitignore
drwxr-xr-x. 4 root root    64 jun  2 12:49 libs
-rw-r--r--. 1 root root 20240 jun  2 12:49 pom.xml
-rw-r--r--. 1 root root 23633 jun  2 12:49 README.md
-rw-r--r--. 1 root root  1436 jun  2 12:49 sonar-project.properties
Encontrado o arquivo: ./ear/target/sisou-2.0.0.3-sac.ear\n
Diretório do projeto: ./ear/target
Conteúdo do diretório: total 88088
drwxr-xr-x. 4 root root      105 jun  2 12:53 .
drwxr-xr-x. 4 root root       46 jun  2 12:53 ..
-rw-r--r--. 1 root root      369 jun  2 12:53 application.xml
drwxr-xr-x. 2 root root       28 jun  2 12:53 maven-archiver
drwxr-xr-x. 4 root root       54 jun  2 12:53 sisou-2.0.0.3-sac
-rw-r--r--. 1 root root 90194861 jun  2 12:53 sisou-2.0.0.3-sac.ear
Arquivo POM: ./ear/target/maven-archiver/pom.properties
br.gov.caixa.bsb.sisou:sisou:ear:2.0.0.3-sac
Finishing: Recupera versão projeto (groupId:artifactId:type:version)

