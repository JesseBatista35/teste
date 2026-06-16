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
SIMPG-monolito-199
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
SIMPG-monolito-199
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
Started: 16/06/2026, 11:17:45
Pool:
Release-Linux
·
Agent: cadsvaprlx068.intra.caixa.gov.br

37m 4s

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
1s

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
<1s

Terraform workspace
·
succeeded
<1s

Terraform destroy
·
succeeded
15m 13s

Terraform apply
·
succeeded
9m 32s

Definir size como executado
·
succeeded
16s

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
2s

Permissionamento LDAP
·
succeeded
25s

Configurando JBoss
·
succeeded
4s

Configurando Logrotate
·
succeeded
8s

Configurando o Apache
·
succeeded
20s

Deploy Secure Files [JBOSS]
·
succeeded
4s

Deploy Config no JBOSS
·
succeeded
1m 29s

Deploy Pacote no JBOSS
·
succeeded
21s

Check Deployments [JBOSS]
·
1 error
6m 51s
Bash exited with code '2'.

Atualizando versão no PortalIF
·
skipped


Resumo da release
·
skipped


Finalize Job
·
succeeded
<1s


qual setp voce quer ver?

resultado dos comandos:



[p585600@cadsvitrlx100 ~]$ ssh 10.116.198.209
The authenticity of host '10.116.198.209 (10.116.198.209)' can't be established.
ED25519 key fingerprint is SHA256:ckieBH7GxIbHNMu2UYU+gHkcVMZZe3MDfbTyZ4Y7wik.
This host key is known by the following other names/addresses:
    ~/.ssh/known_hosts:13: 10.116.198.52
    ~/.ssh/known_hosts:50: 10.116.198.17
    ~/.ssh/known_hosts:52: 10.116.198.236
    ~/.ssh/known_hosts:54: 10.116.201.81
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.198.209' (ED25519) to the list of known hosts.
p585600@10.116.198.209's password:
[p585600@caddeapllx1945 ~]$
[p585600@caddeapllx1945 ~]$
[p585600@caddeapllx1945 ~]$
[p585600@caddeapllx1945 ~]$
[p585600@caddeapllx1945 ~]$
[p585600@caddeapllx1945 ~]$ sudo su

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]# find / -name "*postgresql*" -type f 2>/dev/null | head -20
/opt/jboss-eap/standalone/deployments/postgresql.jar
/opt/jboss-eap/standalone/deployments/postgresql.jar.failed
/opt/jboss-eap/modules/system/layers/base/org/postgresql/main/postgresql-42.7.7.jar
/tmp/src/postgresql-42.7.7.jar
/usr/lib/firewalld/services/postgresql.xml
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]# ls -la /opt/wildfly/modules/org/postgresql/
ls: não foi possível acessar '/opt/wildfly/modules/org/postgresql/': Arquivo ou diretório inexistente
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]# cat /opt/wildfly/standalone/configuration/standalone.xml | grep -A 5 -B 5 "postgresql"
cat: /opt/wildfly/standalone/configuration/standalone.xml: Arquivo ou diretório inexistente
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
[root@caddeapllx1945 p585600]#
