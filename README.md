Starting: Nexus responde -No agent
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
Script contents:
curl  -I -m 15 "$NEXUS_URL_MAVEN_RELEASE"  | | echo "NEXUS NAO REPONDE"
========================== Starting Command Output ===========================
/bin/bash /opt/ads-agent/_work/_temp/922297c2-5219-4fdc-a794-66712a146657.sh
/opt/ads-agent/_work/_temp/922297c2-5219-4fdc-a794-66712a146657.sh: line 1: erro de sintaxe próximo do `token' não esperado `|'
/opt/ads-agent/_work/_temp/922297c2-5219-4fdc-a794-66712a146657.sh: line 1: `curl  -I -m 15 "$NEXUS_URL_MAVEN_RELEASE"  | | echo "NEXUS NAO REPONDE"'
##[error]Bash exited with code '2'.
Finishing: Nexus responde -No agent
