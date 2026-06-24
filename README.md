acho que o problema ta aqui nessa linha:  drwxr-xr-x 2 sadscp01 sadscp01   27 Jun 23 17:41 ${jboss.deploy.dir}

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
/bin/bash /opt/ads-agent/_work/_temp/c9fe3bfb-f942-4407-aa49-0f79d5e4375b.sh
total 4,0K
drwxr-xr-x 2 sadscp01 sadscp01   27 Jun 23 17:41 ${jboss.deploy.dir}
-rw-r--r-- 1 sadscp01 sadscp01 1,5K Jun 23 17:41 pom.xml
drwxr-xr-x 4 sadscp01 sadscp01   89 Jun 24 09:42 target
Finishing: Bash Script



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
/bin/bash /opt/ads-agent/_work/_temp/e084d32a-928f-452a-8982-a20310618b60.sh
VEC false
=== Info do pacote ===
groupid= br.gov.caixa.sigpd
artifact= sigpd-ear
version= 3.4.2.10-SNAPSHOT
=========================================================
/opt/ads-agent/_work/_temp/e084d32a-928f-452a-8982-a20310618b60.sh: line 38: ./ear/${jboss.deploy.dir}/sigpd-ear.ear: substituição incorreta
Async Command Start: Update Build Number
Update build number to 3.4.2.10-SNAPSHOT for build 754977
Async Command End: Update Build Number
Finishing: Publica no Nexus
