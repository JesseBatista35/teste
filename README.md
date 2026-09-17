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
SIMCN-backend
/
SIMCN-backend-2.110.9.2-SNAPSHOT(19)
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
SIMCN-backend

SIMCN-backend-2.110.9.2-SNAPSHOT(19)


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 16/09/2026, 14:02:51
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-rjttk

2m 6s

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

Valida Variáveis Obrigatórias
·
succeeded
<1s

Recuperando URL Pacote Nexus
·
succeeded
1s

Recupera Pacote
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

Corrigindo Codificação Arquivos dos2unix
·
succeeded
<1s

Alterando Valores placeholders nos arquivos de config
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
1s

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
<1s

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
<1s

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
<1s

Verificando se o Volume foi configurado corretamente.
·
succeeded
<1s

Configurando DeploymentConfig para utilizar o Volume Criado
·
succeeded
<1s

Excluindo Secret ACcaixav4
·
succeeded
<1s

Criando o Secret ACcaixav4
·
succeeded
<1s

Adicionando Multiplas Secrets
·
succeeded
<1s

Excluindo ConfigMap jboss-config
·
succeeded
<1s

Excluindo ConfigMap java-config
·
succeeded
<1s

Criando o ConfigMap jboss-config
·
succeeded
<1s

Criando o ConfigMap java-config
·
succeeded
<1s

Configurando o ConfigMap jboss-config
·
succeeded
<1s

Configurando o ConfigMap java-config
·
succeeded
<1s

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
succeeded
1m 19s

Logs da Aplicação
·
succeeded
<1s

Resumo da Release
·
succeeded
<1s

Coletando dados da imagem
·
succeeded
5s

Atualizando versão no PortalIF
·
succeeded
<1s

Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
View detailed logs
Task added

Task added

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Row 2








