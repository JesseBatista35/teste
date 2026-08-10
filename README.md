gerar pom.properties

View raw log

Starting: gerar pom.properties
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/5fee8d46-9ba5-4d0f-b85f-a0a8640d803f.sh
pom.properties gerado:
groupId=br.gov.caixa
artifactId=sipes-api-scpc
version=1.0.0.0
Finishing: gerar pom.properties



ele ate passa, mais fica na task recuperando versão e nao vai mais de 3min rodando



Recupera Versão no POM

View raw log

Starting: Recupera Versão no POM
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/54c93fb7-8f35-49f2-a70c-6acfd10f4b8a.sh
##[error]The Operation will be canceled. The next steps may not contain expected logs.
##[error]Bash exited with code 'null'.
##[error]The operation was canceled.
Finishing: Recupera Versão no POM
