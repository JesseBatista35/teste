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
SIPGE-webhook
/
SIPGE-webhook-20260916.1211-1.0.0-SNAPSHOT(1)
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
SIPGE-webhook

SIPGE-webhook-20260916.1211-1.0.0-SNAPSHOT(1)


EC DES

Failed


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 16/09/2026, 12:14:47
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-l8nrh

6m 44s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

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
<1s

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
1 warning
<1s

Login OpenShift
·
succeeded
<1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
<1s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
<1s

Atualizando Variáveis de Ambiente
·
succeeded
1s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
<1s

Create BT Secret
·
succeeded
<1s

Create BT Shared Volume
·
succeeded
<1s

Create BT Sidecar
·
succeeded
<1s

Create Secret Check Script
·
succeeded
<1s

Create Secret Check
·
succeeded
<1s

Create BT App Mount Volume
·
succeeded
<1s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
<1s

Vinculando Secrets
·
succeeded

<1s

Adicionando Multiplas Secrets
·
succeeded
1s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
20s

Concedendo Acesso OKD
·
succeeded
<1s

Verificando IP de Saída
·
succeeded
<1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
<1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
1 error
6m 7s
The task has timed out.

Logs da Aplicação
·
succeeded
<1s

Resumo da Release
·
skipped


Coletando dados da imagem
·
skipped


Atualizando versão no PortalIF
·
skipped


Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
Collapsed

Collapsed

Expanded

Collapsed

1 pipelines found

Row 2

Row 2

Row 2

Row 2

679 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

