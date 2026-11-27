Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
SICAP-webhook
/
2.1.0.3
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings

Jobs in run #2.1.0.3
Login Cluster

View raw log

Starting: Login Cluster
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/work_ads/_temp/34958e11-1bc4-41b2-bb54-65b17ae7825b.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ oc login api.produtos4.caixa:6443 --insecure-skip-tls-verify=true --token=***
Finishing: Login Cluster
Collapsed

Row 3. Clickable

Expanded

Row 3. Clickable

Collapsed

Showing 29 filtered items.

Showing 29 filtered items.

Row 2. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 29 filtered items.

Showing 25 filtered items.

Row 2. Clickable

Row 2. Clickable

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 29 filtered items.

Showing 25 filtered items.

Row 11. Clickable

Row 2. Clickable



essa nao passoa porque qual adifrença



Login Cluster

View raw log

Starting: Login Cluster
==============================================================================
Task         : Bash
Description  : Run a Bash script on macOS, Linux, or Windows
Version      : 3.227.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
==============================================================================
Generating script.
========================== Starting Command Output ===========================
/usr/bin/bash /opt/ads-agent/_work/_temp/fc8a72df-1f7e-425c-a906-32e5269116bf.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ oc login api.produtos4.caixa:6443 --insecure-skip-tls-verify=true --token=***
error: Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
##[error]Bash exited with code '1'.
Finishing: Login Cluster
