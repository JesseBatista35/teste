P
sidsc-storybook-v20-des-5-hw4gb
Running


[26/Nov/2026:22:54:57 -0300] 127.0.0.1 - - - _ to: -: GET /stub_status HTTP/1.1 upstream_response_time - msec 1795744497.923 request_time 0.000 200 97 - NGINX-Prometheus-Exporter/v -
[26/Nov/2026:22:55:14 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1795744514.325 request_time 0.000 200 8375 - kube-probe/1.25 -
[26/Nov/2026:22:55:24 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1795744524.325 request_time 0.000 200 8375 - kube-probe/1.25 -
[26/Nov/2026:22:55:24 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1795744524.325 request_time 0.000 200 8375 - kube-probe/1.25 -
[26/Nov/2026:22:55:34 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1795744534.325 request_time 0.000 200 8375 - kube-probe/1.25 -
[26/Nov/2026:22:55:34 -0300] 25.2.40.1 - - - _ to: -: GET / HTTP/1.1 upstream_response_time - msec 1795744534.325 request_time 0.000 200 8375 - kube-probe/1.25 -


passou

P
sidsc-storybook-v20-des-5-hw4gb
Running
2/2	0	
ReplicationController
RC
sidsc-storybook-v20-des-5
33,5 MiB	-	
26 de nov. de 2026, 22:54

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
SIDSC-storybook-v20
/
SIDSC-storybook-v20-1.0.0-SNAPSHOT(5)
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
SIDSC-storybook-v20

SIDSC-storybook-v20-1.0.0-SNAPSHOT(5)
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
Started: 26/11/2026, 22:54:07
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-l8nrh

1m 30s

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
2s

Recupera Pacote
·
succeeded
4s

Recuperando nome do repositório
·
succeeded
2s

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
2s

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
37s

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
9s

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
Showing 6 deployments

Row 5

Collapsed

Expanded

Row 4

Collapsed

Expanded

Row 3

Collapsed

Showing 1 deployments

Row 2

Row 2

