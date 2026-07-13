2026-07-13T19:41:55.7434862Z ##[section]Starting: Bash Script
2026-07-13T19:41:55.7438688Z ==============================================================================
2026-07-13T19:41:55.7438772Z Task         : Bash
2026-07-13T19:41:55.7438816Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-13T19:41:55.7438915Z Version      : 3.227.0
2026-07-13T19:41:55.7438962Z Author       : Microsoft Corporation
2026-07-13T19:41:55.7439063Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-13T19:41:55.7439140Z ==============================================================================
2026-07-13T19:41:56.2814737Z Generating script.
2026-07-13T19:41:56.2825715Z ========================== Starting Command Output ===========================
2026-07-13T19:41:56.2833362Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/61e556eb-4757-452e-a41f-173b3bb6cc87.sh
2026-07-13T19:41:56.2886464Z ===== HEXDUMP DAS VARIAVEIS (checando espaços/quebras ocultas) =====
2026-07-13T19:41:56.2893274Z /opt/ads-agent/_work/_temp/61e556eb-4757-452e-a41f-173b3bb6cc87.sh: line 3: xxd: command not found
2026-07-13T19:41:56.2913665Z /opt/ads-agent/_work/_temp/61e556eb-4757-452e-a41f-173b3bb6cc87.sh: line 4: xxd: command not found
2026-07-13T19:41:56.2928639Z ======================================================================
2026-07-13T19:41:56.2928726Z 
2026-07-13T19:41:56.2928852Z ===== EXECUTANDO O COMANDO REAL (com trace) =====
2026-07-13T19:41:56.2929904Z + oc set env deploymentconfig simpi-med-des -n simpi-des --list -c simpi-med-des
2026-07-13T19:41:56.4338685Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-13T19:41:56.4360532Z # deploymentconfigs/simpi-med-des, container simpi-med-des
2026-07-13T19:41:56.4360934Z TZ=America/Sao_Paulo
2026-07-13T19:41:56.4397545Z + set +x
2026-07-13T19:41:56.4409147Z ==================================================
2026-07-13T19:41:56.4459837Z ##[section]Finishing: Bash Script


2026-07-13T19:41:57.3816723Z ##[section]Starting: Criando nova APP
2026-07-13T19:41:57.3819799Z ==============================================================================
2026-07-13T19:41:57.3819973Z Task         : Bash
2026-07-13T19:41:57.3820016Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-13T19:41:57.3820092Z Version      : 3.227.0
2026-07-13T19:41:57.3820137Z Author       : Microsoft Corporation
2026-07-13T19:41:57.3820187Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-13T19:41:57.3820270Z ==============================================================================
2026-07-13T19:41:57.5107847Z Generating script.
2026-07-13T19:41:57.5118488Z ========================== Starting Command Output ===========================
2026-07-13T19:41:57.5125752Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/6d037043-fefd-4b04-99a9-bb9f20731dcf.sh
2026-07-13T19:41:57.5296565Z OCP NPRD - des, tqs ou hmp
2026-07-13T19:41:57.5298263Z /opt/ads-agent/_work/_temp/6d037043-fefd-4b04-99a9-bb9f20731dcf.sh: line 58: [-e: command not found
2026-07-13T19:41:57.5887999Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-07-13T19:41:57.5888278Z Server Version: 4.15.59
2026-07-13T19:41:57.5888401Z Kubernetes Version: v1.28.15+d227d65
2026-07-13T19:41:57.6842662Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-13T19:41:57.7013732Z Essa aplicação já está criada.
2026-07-13T19:41:57.7666436Z Warning: apps.openshift.io/v1 DeploymentConfig is deprecated in v4.14+, unavailable in v4.10000+
2026-07-13T19:41:57.7804523Z deploymentconfig.apps.openshift.io/simpi-med-des patched (no change)
2026-07-13T19:41:57.8654397Z clusterrole.rbac.authorization.k8s.io/system:openshift:scc:anyuid added: "system:serviceaccounts:simpi-des"
2026-07-13T19:41:57.8735819Z ##[section]Finishing: Criando nova APP
