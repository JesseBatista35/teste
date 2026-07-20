<img width="1833" height="920" alt="image" src="https://github.com/user-attachments/assets/8b0688ce-8e55-4590-a02b-e68df41e153c" />


qual dessesse

2026-07-20T20:17:45.3947180Z ##[section]Starting: Login OpenShift
2026-07-20T20:17:45.3950052Z ==============================================================================
2026-07-20T20:17:45.3950134Z Task         : Bash
2026-07-20T20:17:45.3950186Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-20T20:17:45.3950258Z Version      : 3.227.0
2026-07-20T20:17:45.3950300Z Author       : Microsoft Corporation
2026-07-20T20:17:45.3950349Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-20T20:17:45.3950426Z ==============================================================================
2026-07-20T20:17:46.0368815Z Generating script.
2026-07-20T20:17:46.0379605Z ========================== Starting Command Output ===========================
2026-07-20T20:17:46.0387035Z [command]/bin/bash /opt/ads-agent/_work/_temp/cb83a1f5-e31f-4993-88dd-c27a00913be5.sh
2026-07-20T20:17:46.0432964Z OKD4 NPRD - des, tqs ou hmp
2026-07-20T20:17:46.4938556Z ##[section]Finishing: Login OpenShift



2026-07-20T20:17:49.7896328Z ##[section]Starting: Criando nova APP
2026-07-20T20:17:49.7899412Z ==============================================================================
2026-07-20T20:17:49.7899509Z Task         : Bash
2026-07-20T20:17:49.7899558Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-20T20:17:49.7899623Z Version      : 3.227.0
2026-07-20T20:17:49.7899683Z Author       : Microsoft Corporation
2026-07-20T20:17:49.7899739Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-20T20:17:49.7899808Z ==============================================================================
2026-07-20T20:17:50.8571766Z Generating script.
2026-07-20T20:17:50.8580555Z ========================== Starting Command Output ===========================
2026-07-20T20:17:50.8587680Z [command]/bin/bash /opt/ads-agent/_work/_temp/89fd9753-59fa-4c81-9fe6-20a8a47911b9.sh
2026-07-20T20:17:50.8691209Z OKD4 NPRD - des, tqs ou hmp
2026-07-20T20:17:51.0123262Z oc v3.11.0+0cbc58b
2026-07-20T20:17:51.0124083Z kubernetes v1.11.0+d4cacc0
2026-07-20T20:17:51.0124587Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-20T20:17:51.0204055Z 
2026-07-20T20:17:51.0204623Z Server https://api.nprd.caixa:6443
2026-07-20T20:17:51.0205057Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-20T20:17:51.4415281Z Essa aplicação já está criada.
2026-07-20T20:17:51.6970688Z deploymentconfig.apps.openshift.io/sigfa-api-saldo-consolidado-des not patched
2026-07-20T20:17:51.8647255Z scc "anyuid" added to groups: ["system:serviceaccounts:sigfa-des"]
2026-07-20T20:17:51.8726583Z ##[section]Finishing: Criando nova APP


2026-07-20T20:17:47.4780173Z ##[section]Starting: Criando novo Projeto
2026-07-20T20:17:47.4783168Z ==============================================================================
2026-07-20T20:17:47.4783251Z Task         : Bash
2026-07-20T20:17:47.4783292Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-20T20:17:47.4783364Z Version      : 3.227.0
2026-07-20T20:17:47.4783406Z Author       : Microsoft Corporation
2026-07-20T20:17:47.4783455Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-20T20:17:47.4783536Z ==============================================================================
2026-07-20T20:17:47.8785333Z Generating script.
2026-07-20T20:17:47.8795442Z ========================== Starting Command Output ===========================
2026-07-20T20:17:47.8802461Z [command]/bin/bash /opt/ads-agent/_work/_temp/35b75009-4689-4bd0-817f-66c5afdcb72c.sh
2026-07-20T20:17:48.7941044Z NAME        DISPLAY NAME   STATUS
2026-07-20T20:17:48.7941529Z sigfa-des                  Active
2026-07-20T20:17:49.0246156Z namespace/sigfa-des not labeled
2026-07-20T20:17:49.2909415Z namespace/sigfa-des not labeled
2026-07-20T20:17:49.5236004Z namespace/sigfa-des not labeled
2026-07-20T20:17:49.7750139Z netnamespace.network.openshift.io/sigfa-des not labeled
2026-07-20T20:17:49.7833547Z ##[section]Finishing: Criando novo Projeto

