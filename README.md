2026-07-13T19:45:39.6155545Z ##[section]Starting: Bash Script
2026-07-13T19:45:39.6159079Z ==============================================================================
2026-07-13T19:45:39.6159158Z Task         : Bash
2026-07-13T19:45:39.6159235Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-13T19:45:39.6159308Z Version      : 3.227.0
2026-07-13T19:45:39.6159353Z Author       : Microsoft Corporation
2026-07-13T19:45:39.6159456Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-13T19:45:39.6159530Z ==============================================================================
2026-07-13T19:45:40.1018080Z Generating script.
2026-07-13T19:45:40.1029009Z ========================== Starting Command Output ===========================
2026-07-13T19:45:40.1036012Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/619dbc8e-7729-4e11-9757-3a1091985d51.sh
2026-07-13T19:45:40.1092212Z ===== TESTANDO BLOCO 3 (overwrite) =====
2026-07-13T19:45:40.1098734Z /opt/ads-agent/_work/_temp/619dbc8e-7729-4e11-9757-3a1091985d51.sh: line 3: Enviroment: command not found
2026-07-13T19:45:40.1099365Z Enviroment (raw) = []
2026-07-13T19:45:40.1100613Z 
2026-07-13T19:45:40.1100956Z Comando que seria montado:
2026-07-13T19:45:40.1103544Z /opt/ads-agent/_work/_temp/619dbc8e-7729-4e11-9757-3a1091985d51.sh: line 6: Enviroment: command not found
2026-07-13T19:45:40.1104406Z oc set env  deploymentconfig "simpi-med-des" -c "simpi-med-des" --overwrite=true -n simpi-des
2026-07-13T19:45:40.1104521Z 
2026-07-13T19:45:40.1105005Z + [[ -n $(Enviroment) ]]
2026-07-13T19:45:40.1108944Z ++ Enviroment
2026-07-13T19:45:40.1110543Z /opt/ads-agent/_work/_temp/619dbc8e-7729-4e11-9757-3a1091985d51.sh: line 10: Enviroment: command not found
2026-07-13T19:45:40.1111961Z + oc set env deploymentconfig simpi-med-des -c simpi-med-des --overwrite=true -n simpi-des
2026-07-13T19:45:40.2317481Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-13T19:45:40.2443544Z error: at least one environment variable must be provided
2026-07-13T19:45:40.2496794Z + set +x
2026-07-13T19:45:40.2497181Z ==========================================
2026-07-13T19:45:40.2553557Z ##[section]Finishing: Bash Script
