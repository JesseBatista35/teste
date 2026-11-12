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
SIGSJ-internet
/
SIGSJ-internet-32
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
SIGSJ-internet

SIGSJ-internet-32
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
Started: 12/11/2026, 16:32:18
Pool:
Release-Linux
·
Agent: cadsvaprlx071.intra.caixa.gov.br

5m 40s

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
2s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Recupera VEC
·
succeeded
2s

VEC - Aferição
·
succeeded
1 warning
<1s

Exportar variáveis NFS
·
succeeded
1s

Exportar variáveis Infrafácil
·
succeeded
1s

Alocando o IP (AlocaIP e Infradevops)
·
succeeded
12s

Exporta as variáveis para o Terraform
·
succeeded
1s

Replace tokens in **/*.tfvars.json **/*.tf
·
succeeded
1s

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
9s

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
1s

Terraform apply
·
succeeded

1m 47s

Definir size como executado
·
succeeded
21s

Cadastrar Servidor no Satellite
·
succeeded
9s

Valida Variáveis Obrigatórias
·
succeeded
1s

Recuperando URL Pacote Nexus
·
succeeded
1s

Recupera Pacote
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

Corrigindo Codificação Arquivos dos2unix
·
succeeded
<1s

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
3s

Permissionamento LDAP
·
succeeded
18s

Configurando JBoss
·
succeeded
5s

Configurando Stack de Monitoração
·
succeeded
43s

Configurando Logrotate
·
succeeded
9s

Configurando o Apache
·
succeeded
20s

Deploy Secure Files [JBOSS]
·
succeeded
6s

Deploy Config no JBOSS
·
succeeded
25s

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
1s

Finalize Job
·
succeeded
<1s
Showing 26 deployments

EC DESDeploy release

4.635 pipelines found

Select a release pipeline to view its releases

70 pipelines found

Select a release pipeline to view its releases

62 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Showing 26 deployments

Row 2

Row 2

Row 2

Expanded

Row 5

Collapsed

Row 5

Row 2

Row 2

Row 2

