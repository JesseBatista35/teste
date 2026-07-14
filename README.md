#!/bin/bash
# Corrige o formato da variável Enviroment removendo os "-e" (sintaxe docker, incompatível com oc set env)
RAW="$(Enviroment)"
FIXED=$(echo "$RAW" | sed 's/-e //g')

echo "Valor original: $RAW"
echo "Valor corrigido: $FIXED"

echo "##vso[task.setvariable variable=Enviroment;]$FIXED"


2026-07-14T19:13:02.9876101Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-07-14T19:13:02.9879259Z ==============================================================================
2026-07-14T19:13:02.9879359Z Task         : Bash
2026-07-14T19:13:02.9879405Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-14T19:13:02.9879471Z Version      : 3.227.0
2026-07-14T19:13:02.9879529Z Author       : Microsoft Corporation
2026-07-14T19:13:02.9879582Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-14T19:13:02.9879664Z ==============================================================================
2026-07-14T19:13:03.1184896Z Generating script.
2026-07-14T19:13:03.1198290Z ========================== Starting Command Output ===========================
2026-07-14T19:13:03.1207432Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/0f454c4c-3499-4c53-98cf-d0ab29d8f654.sh
2026-07-14T19:13:03.1258800Z Nova APP: false
2026-07-14T19:13:03.2214538Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T19:13:03.3015111Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-14T19:13:03.3434501Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-07-14T19:13:03.3435318Z See 'oc set env -h' for help and examples
2026-07-14T19:13:03.3483796Z ##[error]Bash exited with code '1'.
2026-07-14T19:13:03.3520198Z ##[section]Finishing: Atualizando Variáveis de Ambiente
