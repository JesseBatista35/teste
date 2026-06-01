Bash Script

View raw log
Starting: Bash Script
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/a51e4490-46a7-4463-b7e6-40803a314510.sh
==== conteudo de target/ ====
total 436
drwxr-xr-x. 12 root root   4096 jun  1 15:18 .
drwxr-xr-x.  6 root root    175 jun  1 15:18 ..
-rw-r--r--.  1 root root   4238 jun  1 15:18 batimento-1.0.0-SNAPSHOT.jar
drwxr-xr-x.  3 root root     46 jun  1 15:18 classes
drwxr-xr-x.  3 root root     25 jun  1 15:18 generated-sources
drwxr-xr-x.  3 root root     30 jun  1 15:18 generated-test-sources
-rw-r--r--.  1 root root 422729 jun  1 15:18 jacoco.exec
-rw-r--r--.  1 root root   4424 jun  1 15:18 jacoco-quarkus.exec
drwxr-xr-x.  4 root root    148 jun  1 15:18 jacoco-report
drwxr-xr-x.  2 root root     28 jun  1 15:18 maven-archiver
drwxr-xr-x.  3 root root     35 jun  1 15:18 maven-status
drwxr-xr-x.  3 root root     23 jun  1 15:18 quarkus
drwxr-xr-x.  3 root root     20 jun  1 15:18 site
drwxr-xr-x.  2 root root    131 jun  1 15:18 surefire-reports
drwxr-xr-x.  3 root root     16 jun  1 15:18 test-classes
==== target/quarkus-app/ ====
NAO EXISTE quarkus-app
Finishing: Bash Script


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
/usr/bin/bash /opt/ads-agent/_work/_temp/4358a9a1-e4ad-41ea-bb4a-7be47c1ac8d7.sh
É um repositório do Devops.Caixa
Nome do repositório: SIAGT-batimento
Finishing: Localização do Repositório

Validação da VEC

View raw log
Starting: Validação da VEC
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/d397c4e4-833e-482d-955c-dc827bc026be.sh
branch/tag: develop
##[warning] -------------------- ATENÇÃO --------------------
##[warning] Foi definido conforme CE GEQTI 011/2024 que a partir de 03/2025 apenas compilações oriundas de tag dentro do padrão estabelecido no PPDS poderão ser implantadas em TQS/HMP/PRD.
##[warning] Para mais informações acesse as urls:
##[warning] https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC
##[warning] https://caixa.sharepoint.com/sites/PPDS/SitePages/GCM_Diretrizes_Padrao_Baseline.aspx ou consulte a GEQTI04
-------------------------------------------------
refs/heads/develop
##[warning]Foi selecionada para compilação uma branch. Esteja ciente de que este pacote poderá ser implantado somente em ambiente DES.
Valida VEC: false
------------------------------------------------- 
ps: Essa regra se aplica somente a projetos que possuem infra criada na esteira devops.
Finishing: Validação da VEC


[INFO] Deleting /opt/ads-agent/_work/21/s/target
[INFO] 
[INFO] --- jacoco:0.8.12:prepare-agent (default) @ batimento ---
[INFO] argLine set to -javaagent:/opt/ads-agent/cache-tools/.m2/repository/org/jacoco/org.jacoco.agent/0.8.12/org.jacoco.agent-0.8.12-runtime.jar=destfile=/opt/ads-agent/_work/21/s/target/jacoco.exec,append=true
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ batimento ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ batimento ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 2 source files with javac [debug parameters release 21] to target/classes
[INFO] Annotation processing is enabled because one or more processors were found
  on the class path. A future release of javac may disable annotation processing
  unless at least one processor is specified by name (-processor), or a search
  path is specified (--processor-path, --processor-module-path), or annotation
  processing is enabled explicitly (-proc:only, -proc:full).
  Use -Xlint:-options to suppress this message.
  Use -proc:none to disable annotation processing.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ batimento ---
[INFO] skip non existing resourceDirectory /opt/ads-agent/_work/21/s/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ batimento ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 2 source files with javac [debug parameters release 21] to target/test-classes
[INFO] Annotation processing is enabled because one or more processors were found
  on the class path. A future release of javac may disable annotation processing
  unless at least one processor is specified by name (-processor), or a search
  path is specified (--processor-path, --processor-module-path), or annotation
  processing is enabled explicitly (-proc:only, -proc:full).
  Use -Xlint:-options to suppress this message.
  Use -proc:none to disable annotation processing.
[INFO] 
[INFO] --- surefire:3.5.4:test (default-test) @ batimento ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
2026-06-01 15:29:52,060 WARN  [io.qua.agr.dep.AgroalProcessor] (build-61) The Agroal dependency is present but no JDBC datasources have been defined.



Update tbuild

View raw log
Starting: Update tbuild
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/b600c392-9b79-4ece-9841-f8ee5c55eda7.sh
Finishing: Update tbuild


Copiando Artefatos para StagingDirectory

View raw log
Starting: Copiando Artefatos para StagingDirectory
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/5a718bcd-a03c-4c54-b7f1-9b6abcbf3bf5.sh
Não foi possivel determinar o pacote executável do Quarkus
##[error]Bash exited with code '1'.
Finishing: Copiando Artefatos para StagingDirectory
