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
SIEPR-curso-bec3-frontend
/
SIEPR-curso-bec3-frontend-1.0.0-SNAPSHOT(25)
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
SIEPR-curso-bec3-frontend

SIEPR-curso-bec3-frontend-1.0.0-SNAPSHOT(25)
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
Started: 12/11/2026, 11:52:19
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-2s6pl

1m 21s

Initialize job
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
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


Excluindo ConfigMap nginx-conf.d
·
succeeded
<1s

Criando o ConfigMap nginx-conf.d
·
succeeded
<1s

Configurando o ConfigMap nginx-conf.d
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
38s

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
Showing 26 deployments

Row 2

Showing 26 deployments

Row 2

Row 2

Expanded

Row 3

Collapsed

Row 2

Row 2




deu bom essa 1.0.4 é so pára tqs
