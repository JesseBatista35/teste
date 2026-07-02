Avaliar O Max (desenvolvedor fsw) faz um deploy. Na esteira devops o deploy ocorre normalmente.

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=495507&environmentId=2303735

Quando ele vai na aplicação quando abre a versão que aparece é outra.

 https://sisme-vm.esteiras.des.caixa/sisme_intranet

porque isso acontece?

temos problemas de apontamento de DNS? VIP? Nginx?.

Atenciosamente.

Box Plataforma de Moradia.

   Este problema está causando grande transtorno nas entregas da sprint corrente. 
   Esta req será utilizada para justificar os problemas técnicos relacionados a indisponibilidade do ambiente.



   <img width="1179" height="561" alt="Captura+de+tela+2026-07-02+121242" src="https://github.com/user-attachments/assets/7949e437-553f-4003-99c3-d73b72fa3f1b" />

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
/bin/bash /opt/ads-agent/_work/_temp/bfc925b4-95cf-4a4c-836a-d794ae3ff34e.sh
Entrando no diretório: /opt/ads-agent/_work/9195/s
Arquivos encontrados: total 72
drwxr-xr-x 13 sadscp01 sadscp01  4096 Jul  2 09:12 .
drwxr-xr-x  8 sadscp01 sadscp01    81 Jul  2 09:11 ..
-rw-r--r--  1 sadscp01 sadscp01  2186 Fev  3 10:08 AberturaSprint-SISME.sh
-rw-r--r--  1 sadscp01 sadscp01   540 Fev  3 10:08 azure-pipelines.yml
-rw-r--r--  1 sadscp01 sadscp01   245 Fev  3 10:08 CONTRIBUTING.md
drwxr-xr-x  3 sadscp01 sadscp01    17 Mar 25 15:14 DOCS
-rw-r--r--  1 sadscp01 sadscp01  4310 Fev  3 10:08 EntregarVersao-SISME.sh
drwxr-xr-x  8 sadscp01 sadscp01   181 Jul  2 09:11 .git
-rw-r--r--  1 sadscp01 sadscp01   542 Fev  3 10:08 .gitignore
drwxr-xr-x  3 sadscp01 sadscp01    45 Fev  3 10:08 .gitlab
-rw-r--r--  1 sadscp01 sadscp01  9279 Fev  3 10:08 .gitlab-ci.yml
-rw-r--r--  1 sadscp01 sadscp01  2948 Jun  2 09:24 keystore.jks
-rw-r--r--  1 sadscp01 sadscp01 22120 Jun 24 15:23 pom.xml
-rw-r--r--  1 sadscp01 sadscp01  1649 Fev  3 10:08 readme.md
drwxr-xr-x  3 sadscp01 sadscp01    70 Jun 24 15:27 .scannerwork
drwxr-xr-x  4 sadscp01 sadscp01    64 Jul  2 09:12 sisme-api
drwxr-xr-x  3 sadscp01 sadscp01    53 Jul  2 09:14 sisme-ear
drwxr-xr-x  6 sadscp01 sadscp01    96 Jul  2 09:12 sisme-ejb
drwxr-xr-x  4 sadscp01 sadscp01    64 Jul  2 09:15 sisme-itests
drwxr-xr-x  4 sadscp01 sadscp01    65 Fev  3 10:08 sisme-selenium
drwxr-xr-x  6 sadscp01 sadscp01   176 Jul  2 09:13 sisme-web
drwxr-xr-x  4 sadscp01 sadscp01    67 Jul  2 09:12 target
Encontrado o arquivo: ./sisme-ear/target/sisme-ear.ear\n
Diretório do projeto: ./sisme-ear/target
Conteúdo do diretório: total 81224
drwxr-xr-x 6 sadscp01 sadscp01      159 Jul  2 09:15 .
drwxr-xr-x 3 sadscp01 sadscp01       53 Jul  2 09:14 ..






==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/127a0e79-42cc-4046-96da-ec20479ccd93.sh
; cli configs
metrics-registry = "http://binario.caixa:8081/repository/npm-all/"
scope = ""
user-agent = "npm/6.13.4 node/v10.18.0 linux x64"

; userconfig /home/sadscp01/.npmrc
//binario.caixa:8081/repository/:username = "pipeline-agil"
//binario.caixa:8081/repository/npm-all/:username = "pipeline-agil"
always-auth = true
email = "pipeline-agil@mail.caixa"
puppeteer_skip_chromium_download = true
registry = "http://binario.caixa:8081/repository/npm-all/"
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"
strict-ssl = false

; globalconfig /usr/etc/npmrc
always-auth = true
cache = "/opt/ads-agent/.npm"
email = "pipeline-agil@mail.caixa"
sass_binary_site = "http://binario.caixa:8081/repository/node-sass/"

; node bin location = /usr/bin/node
; cwd = /opt/ads-agent/_work/9195/s
; HOME = /home/sadscp01
; "npm config ls -l" to show all defaults.

Finishing: Configurando Registry NPM




[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] sisme-parent                                                       [pom]
[INFO] ${sisme.parent}                                                    [jar]
[INFO] sisme-ejb                                                          [ejb]
[INFO] sisme-web                                                          [war]
[INFO] sisme-ear                                                          [ear]
[INFO] sisme-itests                                                       [jar]
[INFO] 
[INFO] -------------------< br.gov.cef.sisme:sisme-parent >--------------------
[INFO] Building sisme-parent 2.93.3.0                                     [1/6]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-deploy-plugin:2.7:deploy-file (default-cli) @ sisme-parent ---
Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/maven-metadata.xml
Progress (1): 784 B
                   
Downloaded from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/maven-metadata.xml (784 B at 12 kB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/sisme-ear-2.93.3.0-20260702.121814-6.ear
Progress (1): 0.5/83 MB
Progress (1): 1.0/83 MB
Progress (1): 1.6/83 MB
Progress (1): 2.1/83 MB
Progress (1): 2.6/83 MB
Progress (1): 3.1/83 MB
Progress (1): 3.7/83 MB
Progress (1): 4.2/83 MB
Progress (1): 4.7/83 MB
Progress (1): 5.2/83 MB
Progress (1): 5.8/83 MB
Progress (1): 6.3/83 MB
Progress (1): 6.8/83 MB
Progress (1): 7.3/83 MB
Progress (1): 7.9/83 MB
Progress (1): 8.4/83 MB
Progress (1): 8.9/83 MB
Progress (1): 9.4/83 MB
Progress (1): 10.0/83 MB
Progress (1): 10/83 MB  

Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/sisme-ear-2.93.3.0-20260702.121814-6.ear (83 MB at 38 MB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/sisme-ear-2.93.3.0-20260702.121814-6.pom
Progress (1): 440 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/sisme-ear-2.93.3.0-20260702.121814-6.pom (440 B at 16 kB/s)
Downloading from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/maven-metadata.xml
Progress (1): 434 B
                   
Downloaded from NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/maven-metadata.xml (434 B at 3.1 kB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/maven-metadata.xml
Progress (1): 784 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/2.93.3.0-SNAPSHOT/maven-metadata.xml (784 B at 16 kB/s)
Uploading to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/maven-metadata.xml
Progress (1): 413 B
                   
Uploaded to NEXUS_INTERNO: http://binario.caixa:8081/repository/snapshots/br/gov/cef/sisme/sisme-ear/maven-metadata.xml (413 B at 7.4 kB/s)
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for sisme-parent 2.93.3.0:
[INFO] 
[INFO] sisme-parent ....................................... SUCCESS [  2.856 s]
[INFO] ${sisme.parent} .................................... SKIPPED
[INFO] sisme-ejb .......................................... SKIPPED
[INFO] sisme-web .......................................... SKIPPED
[INFO] sisme-ear .......................................... SKIPPED
[INFO] sisme-itests ....................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.135 s
[INFO] Finished at: 2026-07-02T09:18:17-03:00
[INFO] ------------------------------------------------------------------------
Async Command Start: Update Build Number
Update build number to 2.93.3.0-SNAPSHOT for build 761868
Async Command End: Update Build Number
Finishing: Publica no Nexus
