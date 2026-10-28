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
SIGSJ-intranet
/
SIGSJ-intranet-38
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
SIGSJ-intranet

SIGSJ-intranet-38
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
Started: 28/10/2026, 16:53:03
Pool:
Release-Linux
·
Agent: cadsvaprlx070.intra.caixa.gov.br

5m 20s

Initialize job
·
succeeded
1s

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
1s

VEC - Aferição
·
succeeded
1 warning
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
37s

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
1s

Install Terraform 1.3.5
·
succeeded
<1s

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
1s

Terraform destroy
·
succeeded
<1s

Terraform apply
·
succeeded
16s

Definir size como executado
·
succeeded
14s

Cadastrar Servidor no Satellite
·
succeeded
10s

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
1s

Alterando Valores placeholders nos arquivos de config
·
succeeded
1s

Valida XML JBOSS
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

Permissionamento LDAP
·
succeeded
19s

Configurando JBoss
·
succeeded
5s

Configurando Stack de Monitoração
·
succeeded
44s

Configurando Logrotate
·
succeeded
8s

Configurando o Apache
·
succeeded
19s

Deploy Secure Files [JBOSS]
·
succeeded
5s

Deploy Config no JBOSS
·
succeeded
33s

Deploy Pacote no JBOSS
·
succeeded
8s

Check Deployments [JBOSS]
·
succeeded
6s

Atualizando versão no PortalIF
·
succeeded
1s

Resumo da release
·
succeeded
49s

Finalize Job
·
succeeded
<1s
View detailed logs
Collapsed

Expanded

371 pipelines found

Select a release pipeline to view its releases

62 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Row 4

Row 2




