ps aux | grep jboss-eap | grep -i standalone


cat /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A 3 "java:jboss/datasources/simpg"


ls -la /opt/jboss-eap/standalone/deployments/ | grep postgresql



[root@caddeapllx1945 opt]# ps aux | grep jboss-eap | grep -i standalone
[root@caddeapllx1945 opt]# cat /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml | grep -A 3 "java:jboss/datasources/simpg"
        <property name="simpg.jndi" value="java:jboss/datasources/simpg"/>
        <property name="simpg.horario_mail" value="14:30"/>
        <property name="simpg.mail.jndi" value="java:jboss/mail/expresso"/>
        <property name="simpg.imp.apf.jndi" value="java:jboss/datasource/simpgimp"/>
--
                <datasource jta="false" jndi-name="java:jboss/datasources/simpg" pool-name="simpg-ds" enabled="true" use-ccm="false">
                    <connection-url>jdbc:postgresql://sbrdedadlx0001.extra.caixa.gov.br:5101/mpgdb001</connection-url>
                    <driver>postgresql</driver>
                    <security>
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]# ls -la /opt/jboss-eap/standalone/deployments/ | grep postgresql
-rw-r--r-- 1 jboss jboss  1098916 jun 16 11:47 postgresql.jar
-rw-r--r-- 1 jboss jboss       57 jun 16 11:51 postgresql.jar.failed
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#



lembraod que 01/06 ele passou. essa aplicação ja funionava.

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
SIMPG-monolito
/
SIMPG-monolito-179
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
SIMPG-monolito

SIMPG-monolito-179
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
Started: 01/06/2026, 11:39:20
Pool:
Release-Linux
·
Agent: cadsvaprlx068.intra.caixa.gov.br

6m 12s

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

Recupera VEC
·
succeeded
<1s

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
1m 46s

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
6s

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
<1s

Terraform apply
·
succeeded
29s

Definir size como executado
·
succeeded
15s

Cadastrar Servidor no Satellite
·
succeeded
10s

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
<1s

Recupera Pacote
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
19s

Configurando JBoss
·
succeeded
5s

Configurando Logrotate
·
succeeded
9s

Configurando o Apache
·
succeeded
21s

Deploy Secure Files [JBOSS]
·
succeeded
5s

Deploy Config no JBOSS
·
succeeded
1m 8s

Deploy Pacote no JBOSS
·
succeeded
8s

Check Deployments [JBOSS]
·
succeeded
5s

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
View detailed logs
Row 22



cuidado para nao lascar com minha cvida

