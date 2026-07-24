2026-07-24T01:41:20.0394832Z ##[section]Starting: Verificando se o Volume foi configurado corretamente.
2026-07-24T01:41:20.0398185Z ==============================================================================
2026-07-24T01:41:20.0398282Z Task         : Bash
2026-07-24T01:41:20.0398418Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:41:20.0398483Z Version      : 3.227.0
2026-07-24T01:41:20.0398755Z Author       : Microsoft Corporation
2026-07-24T01:41:20.0398808Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:41:20.0398888Z ==============================================================================
2026-07-24T01:41:20.9272645Z Generating script.
2026-07-24T01:41:20.9285530Z ========================== Starting Command Output ===========================
2026-07-24T01:41:20.9303325Z [command]/bin/bash /opt/ads-agent/_work/_temp/edca4dbc-d809-4b56-a3a9-aa602c83fce7.sh
2026-07-24T01:41:21.1716028Z O volume foi configurado com sucesso
2026-07-24T01:41:21.1770848Z ##[section]Finishing: Verificando se o Volume foi configurado corretamente.



2026-07-24T01:41:21.1789162Z ##[section]Starting: Configurando DeploymentConfig para utilizar o Volume Criado
2026-07-24T01:41:21.1792502Z ==============================================================================
2026-07-24T01:41:21.1792588Z Task         : Bash
2026-07-24T01:41:21.1792631Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-24T01:41:21.1792693Z Version      : 3.227.0
2026-07-24T01:41:21.1792744Z Author       : Microsoft Corporation
2026-07-24T01:41:21.1792794Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-24T01:41:21.1792863Z ==============================================================================
2026-07-24T01:41:21.9255910Z Generating script.
2026-07-24T01:41:21.9267975Z ========================== Starting Command Output ===========================
2026-07-24T01:41:21.9286053Z [command]/bin/bash /opt/ads-agent/_work/_temp/7f3bb106-408f-4571-a375-7090abe02fe2.sh
2026-07-24T01:41:22.1982921Z warning: volume "sisns-backend-data-tqs" did not previously exist and was not overriden. A new volume with this name has been created instead.deploymentconfig.apps.openshift.io/sisns-backend-tqs volume updated
2026-07-24T01:41:22.2065847Z ##[section]Finishing: Configurando DeploymentConfig para utilizar o Volume Criado





Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISNS-backend
/
SISNS-backend-3.0.0.5(5)
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
SISNS-backend

SISNS-backend-3.0.0.5(5)


EC TQS

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 23/07/2026, 22:40:50
Pool:
Release-Linux
·
Agent: cadsvaprlx072.intra.caixa.gov.br

2m 35s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
1s

Cria Streams Graylog
·
succeeded
2s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
1s

Login OpenShift
·
succeeded
1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
2s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
1s

Atualizando Variáveis de Ambiente
·
succeeded
5s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Criando arquivo PV
·
succeeded
1s

Criando Persistente Volume
·
succeeded
<1s

Criando arquivo PVC
·
succeeded
<1s

Criando Persistente Volume Claim
·
succeeded
1s

Verificando se o Volume foi configurado corretamente.
·
succeeded
1s

Configurando DeploymentConfig para utilizar o Volume Criado
·
succeeded
1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
1s

Create BT Secret
·
succeeded
1s

Create BT Shared Volume
·
succeeded
1s

Create BT Sidecar
·
succeeded
1s

Create Secret Check Script
·
succeeded
1s

Create Secret Check
·
succeeded
1s

Create BT App Mount Volume
·
succeeded
2s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
1s

Criando Secrets
·
succeeded
1s

Vinculando Secrets
·
succeeded
1s

Adicionando Multiplas Secrets
·
succeeded
2s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
22s

Concedendo Acesso OKD
·
succeeded
1s

Verificando IP de Saída
·
succeeded
1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
succeeded
43s

Logs da Aplicação
·
succeeded
1s

Resumo da Release
·
succeeded
1s

Coletando dados da imagem
·
succeeded
28s

Atualizando versão no PortalIF
·
succeeded
1s

Realizando Logout OKD
·
succeeded
1s

Finalize Job
·
succeeded
<1s
Select a release pipeline to view its releases

4 pipelines found

Showing filters 1 through 2

Showing 17 deployments

EC TQSDeploy release

EC TQSDeploy release

Showing filters 1 through 1

Showing filters 1 through 1

Showing 19 deployments

Row 2

EC TQSDeploy release

Expanded

Row 3

Collapsed

Row 2

Row 2

Expanded

Row 3

Collapsed

Row 2

