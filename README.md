Starting:  Define as variáveis de ambiente
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/6622d7bc-8330-4dfc-b8e7-f0bf343f6344.sh
/opt/ads-agent/_work/_temp/6622d7bc-8330-4dfc-b8e7-f0bf343f6344.sh: line 4: export: `jboss.deploy.dir=target': not a valid identifier
/opt/ads-agent/_work/_temp/6622d7bc-8330-4dfc-b8e7-f0bf343f6344.sh: line 5: export: `project.file=./ear/target/sigpd-ear.ear': not a valid identifier
/opt/ads-agent/_work/_temp/6622d7bc-8330-4dfc-b8e7-f0bf343f6344.sh: line 6: export: `project.extension=ear': not a valid identifier
/opt/ads-agent/_work/_temp/6622d7bc-8330-4dfc-b8e7-f0bf343f6344.sh: line 7: export: `project.release=false': not a valid identifier
  Variáveis definidas:
  jboss.deploy.dir = .deploy.dir
  project.file = .file
  project.extension = .extension
  project.release = .release
Finishing:  Define as variáveis de ambiente



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
/usr/bin/bash /opt/ads-agent/_work/_temp/aac3f911-7611-4921-9a8a-39bf2fdfe227.sh
VEC false
=== Info do pacote ===
groupid= br.gov.caixa.sigpd
artifact= sigpd-ear
version= 3.4.2.10-SNAPSHOT
=========================================================
/opt/ads-agent/_work/_temp/aac3f911-7611-4921-9a8a-39bf2fdfe227.sh: line 28: library: comando não encontrado
/opt/ads-agent/_work/_temp/aac3f911-7611-4921-9a8a-39bf2fdfe227.sh: line 38: ./ear/${jboss.deploy.dir}/sigpd-ear.ear: substituição incorreta
Async Command Start: Update Build Number
Update build number to 3.4.2.10-SNAPSHOT for build 754628
Async Command End: Update Build Number
Finishing: Publica no Nexus


mesmo assim error.. ah quer saber cansei.. amanha retomamos
