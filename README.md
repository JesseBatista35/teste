troquei o agent

2026-07-21T12:25:20.0909312Z ##[section]Starting: Criando novo Projeto
2026-07-21T12:25:20.0912690Z ==============================================================================
2026-07-21T12:25:20.0912767Z Task         : Bash
2026-07-21T12:25:20.0912843Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T12:25:20.0912907Z Version      : 3.227.0
2026-07-21T12:25:20.0912949Z Author       : Microsoft Corporation
2026-07-21T12:25:20.0913024Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T12:25:20.0913094Z ==============================================================================
2026-07-21T12:25:20.2126157Z Generating script.
2026-07-21T12:25:20.2138771Z ========================== Starting Command Output ===========================
2026-07-21T12:25:20.2146191Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8e9f148d-a9d2-40fc-a3e4-6c3a861e6e66.sh
2026-07-21T12:25:21.1001030Z NAME        DISPLAY NAME   STATUS
2026-07-21T12:25:21.1001707Z sigfa-des                  Active
2026-07-21T12:25:21.2392452Z namespace/sigfa-des not labeled
2026-07-21T12:25:21.4398068Z namespace/sigfa-des not labeled
2026-07-21T12:25:21.5885255Z namespace/sigfa-des not labeled
2026-07-21T12:25:21.7256683Z netnamespace.network.openshift.io/sigfa-des not labeled
2026-07-21T12:25:21.7338683Z ##[section]Finishing: Criando novo Projeto



2026-07-21T12:25:21.7402917Z ##[section]Starting: Criando nova APP
2026-07-21T12:25:21.7406030Z ==============================================================================
2026-07-21T12:25:21.7406226Z Task         : Bash
2026-07-21T12:25:21.7406272Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T12:25:21.7406346Z Version      : 3.227.0
2026-07-21T12:25:21.7406388Z Author       : Microsoft Corporation
2026-07-21T12:25:21.7406437Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T12:25:21.7406504Z ==============================================================================
2026-07-21T12:25:21.8543943Z Generating script.
2026-07-21T12:25:21.8555230Z ========================== Starting Command Output ===========================
2026-07-21T12:25:21.8568199Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/41f55cfc-cd0e-4e11-8895-2a80d62a1a1f.sh
2026-07-21T12:25:21.8679024Z OKD4 NPRD - des, tqs ou hmp
2026-07-21T12:25:21.9686659Z oc v3.11.0+0cbc58b
2026-07-21T12:25:21.9687275Z kubernetes v1.11.0+d4cacc0
2026-07-21T12:25:21.9688560Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-21T12:25:21.9800074Z 
2026-07-21T12:25:21.9800875Z Server https://api.nprd.caixa:6443
2026-07-21T12:25:21.9803413Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-21T12:25:22.1599950Z Essa aplicação já está criada.
2026-07-21T12:25:22.3050051Z deploymentconfig.apps.openshift.io/sigfa-api-saldo-consolidado-des not patched
2026-07-21T12:25:22.4353599Z scc "anyuid" added to groups: ["system:serviceaccounts:sigfa-des"]
2026-07-21T12:25:22.4435462Z ##[section]Finishing: Criando nova APP

2026-07-21T12:25:22.4454257Z ##[section]Starting: Atualizando Variáveis de Ambiente
2026-07-21T12:25:22.4457490Z ==============================================================================
2026-07-21T12:25:22.4457619Z Task         : Bash
2026-07-21T12:25:22.4457675Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-21T12:25:22.4457782Z Version      : 3.227.0
2026-07-21T12:25:22.4457836Z Author       : Microsoft Corporation
2026-07-21T12:25:22.4457897Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-21T12:25:22.4458022Z ==============================================================================
2026-07-21T12:25:22.5622348Z Generating script.
2026-07-21T12:25:22.5634303Z ========================== Starting Command Output ===========================
2026-07-21T12:25:22.5642351Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5a8cdae7-6ade-4422-9249-520517ff81ed.sh
2026-07-21T12:25:22.5689084Z Nova APP: false
2026-07-21T12:25:22.9703846Z error: one or more resources must be specified as <resource> <name> or <resource>/<name>
2026-07-21T12:25:22.9704899Z See 'oc set env -h' for help and examples.
2026-07-21T12:25:22.9769005Z ##[error]Bash exited with code '1'.
2026-07-21T12:25:22.9780630Z ##[section]Finishing: Atualizando Variáveis de Ambiente


