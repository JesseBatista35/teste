Solicitamos a atualização do certificado do logindes no jks da pipeline SILCE-farm-c.



temos essa configuraçao ja colcoamro ele em dolows secure file, porem quando execultmaos a release ele nao ta levando o arquivo pr jboss - 


no repo de config tem isso 




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
SILCE-farm-c
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
All pipelines

SILCE

SILCE-farm-c
Download secure file
Task version
1.*
Display name
Download secure file
Secure File
silce_2026.jks
Retry Count
8
Socket Timeout
Control Options
Output Variables
45 pipelines found

Select a release pipeline to view its releases

22 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 2


jboss
jboss-custom.cli
jboss-deployments
jboss-modules-custom
standalone-full-ha.xml
standalone.conf
README.md

nao teria que ter o qrquivo aqui tambem





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
SILCE-farm-c
/
SILCE-rest-105
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
SILCE-farm-c

SILCE-rest-105
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
Started: 01/07/2026, 16:30:33
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-rjttk

14m 9s

Initialize job
·
succeeded
<1s

Pre-job: Download secure file
·
succeeded
<1s

Pre-job: Download secure file
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
1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Recupera VEC
·
succeeded
<1s

VEC - Aferição
·
succeeded
<1s

Exportar variáveis NFS
·
succeeded
<1s

Exportar variáveis Infrafácil
·
succeeded
<1s

Alocando o IP (AlocaIP e Infradevops)
·
succeeded
1m 54s

Exporta as variáveis para o Terraform
·
succeeded
<1s

Replace tokens in **/*.tfvars.json **/*.tf
·
succeeded
<1s

Remove caracteres
·
succeeded
<1s

Install Terraform 1.3.5
·
succeeded
3s

Terraform init
·
succeeded
8s

Terraform validate
·
succeeded
1s

Terraform workspace
·
succeeded
<1s

Terraform destroy
·
succeeded
4m 41s

Terraform apply
·
succeeded
4m 6s

Definir size como executado
·
succeeded
10s

Cadastrar Servidor no Satellite
·
succeeded
6s

Valida Variáveis Obrigatórias
·
succeeded
<1s

Recuperando URL Pacote Nexus
·
succeeded
<1s

Recupera Pacote
·
succeeded
<1s

Recuperando nome do repositório
·
succeeded
<1s

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

Valida XML JBOSS
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

Permissionamento LDAP
·
succeeded
16s

Configurando JBoss
·
succeeded
4s

Configurando Logrotate
·
succeeded
7s

Configurando o Apache
·
succeeded
38s

Deploy Secure Files [JBOSS]
·
succeeded
5s

Deploy Config no JBOSS
·
succeeded
35s

Deploy Pacote no JBOSS
·
succeeded
6s

Check Deployments [JBOSS]
·
succeeded
3s

Atualizando versão no PortalIF
·
succeeded
<1s

Resumo da release
·
succeeded
49s

Finalize Job
·
succeeded
<1s
