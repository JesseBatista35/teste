2026-07-21T12:50:59.2064326Z ##[section]Starting: Bash Script
2026-07-21T12:50:59.2068629Z ==============================================================================
2026-07-21T12:50:59.2068744Z Task         : Bash
2026-07-21T12:50:59.2068817Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T12:50:59.2069030Z Version      : 3.227.0
2026-07-21T12:50:59.2069092Z Author       : Microsoft Corporation
2026-07-21T12:50:59.2069174Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T12:50:59.2069271Z ==============================================================================
2026-07-21T12:50:59.3819676Z Generating script.
2026-07-21T12:50:59.3830544Z Script contents:
2026-07-21T12:50:59.3830789Z echo "DEBUG >> KIND_DEPLOY=[deploymentconfig] RESOURCE_APP=[$(resource_app)] PROJETO=[$(PROJETO)] AMBIENTE=[des]"
2026-07-21T12:50:59.3835026Z ========================== Starting Command Output ===========================
2026-07-21T12:50:59.3842535Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/1f8cd5b5-efb2-4fe1-a7df-16345caa17fa.sh
2026-07-21T12:50:59.3907734Z /opt/ads-agent/_work/_temp/1f8cd5b5-efb2-4fe1-a7df-16345caa17fa.sh: line 1: resource_app: comando não encontrado
2026-07-21T12:50:59.3910238Z /opt/ads-agent/_work/_temp/1f8cd5b5-efb2-4fe1-a7df-16345caa17fa.sh: line 1: PROJETO: comando não encontrado
2026-07-21T12:50:59.3910888Z DEBUG >> KIND_DEPLOY=[deploymentconfig] RESOURCE_APP=[] PROJETO=[] AMBIENTE=[des]
2026-07-21T12:50:59.3967718Z ##[section]Finishing: Bash Script
