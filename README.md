Initialize job

View raw log

Starting: Initialize job
Agent name: 'cadsvaprlx018.intra.caixa.gov.br'
Agent machine name: 'cadsvaprlx018'
Current agent version: '3.225.2'
Agent running as: 'sadscp01'
Prepare build directory.
Set build variables.
Download all required tasks.
Checking job knob settings.
Finished checking job knob settings.
Start tracking orphan processes.
Finishing: Initialize job


Checkout SIGPD-backend@release/sp58-ronaldo to s

View raw log

Starting: Checkout SIGPD-backend@release/sp58-ronaldo to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Syncing repository: SIGPD-backend (Git)
git version
git version 2.22.1
git config --get remote.origin.url
git config gc.auto 0
git config --get-all http.https://devops.caixa/projetos/Caixa/_git/SIGPD-backend.extraheader
git config --get-all http.extraheader
git config --get-regexp .*extraheader
git config --get-all http.proxy
git config http.version HTTP/1.1
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin
remote: Azure Repos        
remote: 
remote: Found 3 objects to send. (14 ms)        
From https://devops.caixa/projetos/Caixa/_git/SIGPD-backend
   1ab02872..90944c81  release/sp58-ronaldo -> origin/release/sp58-ronaldo
git -c http.extraheader="AUTHORIZATION: bearer ***" -c http.sslVerify=false fetch --force --tags --prune --prune-tags --progress --no-recurse-submodules origin  +90944c816dd7dfb13195a56567fe51b1869e459e
From https://devops.caixa/projetos/Caixa/_git/SIGPD-backend
 * branch              90944c816dd7dfb13195a56567fe51b1869e459e -> FETCH_HEAD
git checkout --progress --force 90944c816dd7dfb13195a56567fe51b1869e459e
Previous HEAD position was 1ab02872 ajuste dto trilha consentimento
HEAD is now at 90944c81 Updated pom.xml
Finishing: Checkout SIGPD-backend@release/sp58-ronaldo to s

Localização do Repositório

View raw log

Starting: Localização do Repositório
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/92b3affc-8800-429e-b1d2-b9a270ffa85a.sh
É um repositório do Devops.Caixa
Nome do repositório: SIGPD-backend
Finishing: Localização do Repositório

Starting: Obtendo branch do Sonar
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/08e95aad-d338-4874-a6af-587e1dd6b232.sh
Build originada de uma BRANCH.
Branch que será informada para o SONAR: sp58-ronaldo 
Finishing: Obtendo branch do Sonar


Configurando Registry NPM

View raw log

Starting: Configurando Registry NPM
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/d93f5419-db29-4704-be62-92e9b2015b10.sh
; cli configs
metrics-registry = "http://binario.caixa:8081/repository/npm-all/"
scope = ""
user-agent = "npm/6.13.4 node/v10.18.0 linux x64"

; userconfig /home/sadscp01/.npmrc
//binario.caixa:8081/repository/:username = "pipeline-agil"
email = "pipeline-agil@mail.caixa"
https://binario.caixa:8081/repository/npm-all/ = ""
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
; cwd = /opt/ads-agent/_work/11454/s
; HOME = /home/sadscp01
; "npm config ls -l" to show all defaults.

Finishing: Configurando Registry NPM

Starting: Copy Files to: /opt/ads-agent/_work/11454/fortify
==============================================================================
Task         : Copy files
Description  : Copy files from a source folder to a target folder using patterns matching file paths (not folder paths)
Version      : 2.211.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/copy-files
==============================================================================
found 12336 files
Cleaning target folder: /opt/ads-agent/_work/11454/fortify
Copying /opt/ads-agent/_work/11454/s/.git/FETCH_HEAD to /opt/ads-agent/_work/11454/fortify/.git/FETCH_HEAD
Copying /opt/ads-agent/_work/11454/s/.git/HEAD to /opt/ads-agent/_work/11454/fortify/.git/HEAD
Copying /opt/ads-agent/_work/11454/s/.git/config to /opt/ads-agent/_work/11454/fortify/.git/config
Copying /opt/ads-agent/_work/11454/s/.git/description to /opt/ads-agent/_work/11454/fortify/.git/description
Copying /opt/ads-agent/_work/11454/s/.git/hooks/applypatch-msg.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/applypatch-msg.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/commit-msg.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/commit-msg.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/fsmonitor-watchman.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/fsmonitor-watchman.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/post-update.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/post-update.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/pre-applypatch.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/pre-applypatch.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/pre-commit.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/pre-commit.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/pre-push.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/pre-push.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/pre-rebase.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/pre-rebase.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/pre-receive.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/pre-receive.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/prepare-commit-msg.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/prepare-commit-msg.sample
Copying /opt/ads-agent/_work/11454/s/.git/hooks/update.sample to /opt/ads-agent/_work/11454/fortify/.git/hooks/update.sample
Copying /opt/ads-agent/_work/11454/s/.git/index to /opt/ads-agent/_work/11454/fortify/.git/index
.
.
.
.
.
.
.

Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.apache.lucene-lucene-sandbox-4.5.1.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.apache.lucene-lucene-sandbox-4.5.1.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.codehaus.castor-castor-1.2.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.codehaus.castor-castor-1.2.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.glassfish.jaxb-jaxb-core-3.0.2.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.glassfish.jaxb-jaxb-core-3.0.2.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.glassfish.jaxb-jaxb-runtime-3.0.2.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.glassfish.jaxb-jaxb-runtime-3.0.2.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.glassfish.jaxb-txw2-3.0.2.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.glassfish.jaxb-txw2-3.0.2.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.hibernate.common-hibernate-commons-annotations-6.0.1.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.hibernate.common-hibernate-commons-annotations-6.0.1.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.hibernate.orm-hibernate-core-6.0.2.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.hibernate.orm-hibernate-core-6.0.2.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.hibernate.validator-hibernate-validator-6.0.2.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.hibernate.validator-hibernate-validator-6.0.2.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.jberet-jberet-core-2.0.0.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.jberet-jberet-core-2.0.0.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.jberet-jberet-se-2.0.0.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.jberet-jberet-se-2.0.0.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.jberet-jberet-support-1.3.4.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.jberet-jberet-support-1.3.4.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.jboss-jandex-2.4.2.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.jboss-jandex-2.4.2.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.jboss.logging-jboss-logging-3.3.0.Final.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.jboss.logging-jboss-logging-3.3.0.Final.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/org.olap4j-olap4j-0.9.7.309-JS-3.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/org.olap4j-olap4j-0.9.7.309-JS-3.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear/lib/xml-apis-xml-apis-1.3.02.jar to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear/lib/xml-apis-xml-apis-1.3.02.jar
Copying /opt/ads-agent/_work/11454/s/ear/target/sigpd-ear.ear to /opt/ads-agent/_work/11454/fortify/ear/target/sigpd-ear.ear
Copying /opt/ads-agent/_work/11454/s/keystore.jks to /opt/ads-agent/_work/11454/fortify/keystore.jks
Copying /opt/ads-agent/_work/11454/s/lib/vincofw-jasperfont-arial-3.0.0.jar to /opt/ads-agent/_work/11454/fortify/lib/vincofw-jasperfont-arial-3.0.0.jar
Copying /opt/ads-agent/_work/11454/s/pom.xml to /opt/ads-agent/_work/11454/fortify/pom.xml
Finishing: Copy Files to: /opt/ads-agent/_work/11454/fortif

essa tem mais de 12 mil linhas



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
/usr/bin/bash /opt/ads-agent/_work/_temp/7cce8660-1333-49bd-9cb4-a7b87ed3b07d.sh
Entrando no diretório: /opt/ads-agent/_work/11454/s
Arquivos encontrados: total 76
drwxr-xr-x 10 sadscp01 sadscp01   214 Jun 23 19:48 .
drwxr-xr-x  7 sadscp01 sadscp01    67 Jun 23 19:48 ..
drwxr-xr-x  4 sadscp01 sadscp01    64 Jun 23 19:49 api
drwxr-xr-x  4 sadscp01 sadscp01    64 Jun 23 19:49 batch
drwxr-xr-x  4 sadscp01 sadscp01    64 Jun 23 19:49 core
drwxr-xr-x  4 sadscp01 sadscp01    80 Jun 23 19:49 ear
drwxr-xr-x  8 sadscp01 sadscp01   181 Jun 23 19:48 .git
-rw-r--r--  1 sadscp01 sadscp01   185 Jun  1 19:49 .gitignore
drwxr-xr-x  2 sadscp01 sadscp01    35 Jun  1 19:49 .jpb
-rw-r--r--  1 sadscp01 sadscp01  2948 Jun  1 19:51 keystore.jks
drwxr-xr-x  2 sadscp01 sadscp01    48 Jun  1 19:49 lib
-rw-r--r--  1 sadscp01 sadscp01  9427 Jun 23 19:48 pom.xml
-rw-r--r--  1 sadscp01 sadscp01 49129 Jun  1 19:49 README.md
-rw-r--r--  1 sadscp01 sadscp01  6188 Jun 21 11:32 RESUMO_FLUXOS_DECLARACAO.txt
drwxr-xr-x  3 sadscp01 sadscp01    70 Jun 23 19:37 .scannerwork
Encontrado o arquivo: ./ear/${jboss.deploy.dir}/sigpd-ear.ear
./ear/target/sigpd-ear.ear\n
Diretório do projeto: ./ear/${jboss.deploy.dir}
./ear/target
Conteúdo do diretório: ./ear/${jboss.deploy.dir}:
total 105536
drwxr-xr-x 2 sadscp01 sadscp01        27 Jun 21 11:32 .
drwxr-xr-x 4 sadscp01 sadscp01        80 Jun 23 19:49 ..
-rw-r--r-- 1 sadscp01 sadscp01 108066657 Jun 21 11:32 sigpd-ear.ear

./ear/target:
total 106172


Recupera repositório nexus

View raw log

Starting: Recupera repositório nexus
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/63bbfd7d-71f9-48f9-8c73-a68c63183e71.sh
Finishing: Recupera repositório nexus





na run code analiste pe gicange tameb mtem esse erros:


19:50:07.028 DEBUG: readpipe rc=128
19:50:07.028 DEBUG: Exception caught during execution of command '[/usr/bin/git, config, --system, --show-origin, --list, -z]' in '/usr/bin', return code '128', error message 'fatal: unable to read config file '/etc/gitconfig': Arquivo ou diretÃ³rio nÃ£o encontrado


