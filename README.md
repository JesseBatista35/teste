me ajuda a resolver esse problema aqui.

em tqs no azure devops no deplosu esta quebrando nesse step:

2026-06-15T14:03:53.3756916Z ##[section]Starting: Login OpenShift
2026-06-15T14:03:53.3759791Z ==============================================================================
2026-06-15T14:03:53.3759903Z Task         : Bash
2026-06-15T14:03:53.3759962Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-15T14:03:53.3760081Z Version      : 3.227.0
2026-06-15T14:03:53.3760137Z Author       : Microsoft Corporation
2026-06-15T14:03:53.3760188Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-15T14:03:53.3760272Z ==============================================================================
2026-06-15T14:03:54.2588549Z Generating script.
2026-06-15T14:03:54.2598794Z ========================== Starting Command Output ===========================
2026-06-15T14:03:54.2606114Z [command]/bin/bash /opt/ads-agent/_work/_temp/6df9356a-14b2-4368-bbc9-2315b0483b04.sh
2026-06-15T14:03:54.2651796Z NPRD - des, tqs ou hmp
2026-06-15T14:03:54.2655037Z /opt/ads-agent/_work/_temp/6df9356a-14b2-4368-bbc9-2315b0483b04.sh: line 20: OKD_API: comando não encontrado
2026-06-15T14:03:54.2693681Z ##[error]Bash exited with code '127'.
2026-06-15T14:03:54.2701544Z ##[section]Finishing: Login OpenShift



porem em des passa:

2026-06-09T12:45:42.3516430Z ##[section]Starting: Login OpenShift
2026-06-09T12:45:42.3519399Z ==============================================================================
2026-06-09T12:45:42.3519478Z Task         : Bash
2026-06-09T12:45:42.3519546Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-09T12:45:42.3519611Z Version      : 3.227.0
2026-06-09T12:45:42.3519693Z Author       : Microsoft Corporation
2026-06-09T12:45:42.3519745Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-09T12:45:42.3519818Z ==============================================================================
2026-06-09T12:45:43.2423943Z Generating script.
2026-06-09T12:45:43.2434151Z ========================== Starting Command Output ===========================
2026-06-09T12:45:43.2442886Z [command]/bin/bash /opt/ads-agent/_work/_temp/139f45b4-5629-4bdc-85a2-56936abf5d20.sh
2026-06-09T12:45:43.2491155Z OKD4 NPRD - des, tqs ou hmp
2026-06-09T12:45:43.6149230Z ##[section]Finishing: Login OpenShift



--


esta usando o memso agente.  me ajdua aindetifcar e corrgir esse problema
