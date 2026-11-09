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
SIEMP-java-web
/
SIEMP-java-web-8
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
SIEMP-java-web

SIEMP-java-web-8


EC DES

In progress


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 09/11/2026, 10:28:26
Pool:
Release-Linux
·
Agent: cadsvaprlx068.intra.caixa.gov.br
10m 8s

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
43s

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
<1s

Terraform init
·
succeeded
32s

Terraform validate
·
succeeded
<1s

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
19s

Definir size como executado
·
succeeded
36s

Cadastrar Servidor no Satellite
·
succeeded
9s

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
3s

Permissionamento LDAP
·
succeeded
20s

Configurando JBoss
·
succeeded
4s

Configurando Stack de Monitoração
·
succeeded
45s

Configurando Logrotate
·
succeeded
8s

Configurando o Apache
·
succeeded
17s

Deploy Secure Files [JBOSS]
·
succeeded
5s

Deploy Config no JBOSS
·
succeeded
24s

Deploy Pacote no JBOSS
·
succeeded
21s

Check Deployments [JBOSS]
5m 2s
FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).

Atualizando versão no PortalIF
·
pending

Resumo da release
·
pending
Select a release pipeline to view its releases

14 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Showing 4 deployments

Row 3

Collapsed

Expanded

Row 2

Collapsed

Showing 4 deployments

Expanded

Row 3

Collapsed

Showing 3 deployments

Showing 3 deployments

Row 2

Row 2




^C
[p585600@caddeapllx2864 ~]$ sudo find /opt/jboss-eap /tmp /home -iname "*framework*.jar" 2>/dev/null
/opt/jboss-eap/modules/system/layers/base/org/jboss/narayana/txframework/main/txframework-5.11.3.Final-redhat-00001.jar
/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.10.CP/org/jboss/narayana/txframework/main/txframework-5.11.4.Final-redhat-00001.jar
/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.14.CP/org/jboss/narayana/txframework/main/txframework-5.11.4.Final-redhat-00001.jar
/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.18.CP/org/jboss/narayana/txframework/main/txframework-5.11.4.Final-redhat-00001.jar
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$

