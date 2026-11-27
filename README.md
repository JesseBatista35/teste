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
/usr/bin/bash /opt/ads-agent/work_ads/_temp/9704b1d6-13b4-4190-8efa-0b0e369f500a.sh
+ echo okd4_nprd
+ egrep -q '^(okd4|ocp)'
+ oc login api.produtos4.caixa:6443 --insecure-skip-tls-verify=true --token=***
error: Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
##[error]Bash exited with code '1'.
Finishing: Login Cluster


essa dauqi rodou com agetne setado la a outro que te manei eu rodei sem o agent setado

achei qe o b.o era o agente

no caso o cadsvaprlx373.intra.caixa.gov.br
