passou miseravellll.... valeu valeu valeu;;;




SICMU-intranet-update

SICMU-intranet-update-78
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
Started: 28/05/2026, 20:38:14
Pool:
Release-Linux
·
Agent: cadsvaprlx068.intra.caixa.gov.br

4m 56s

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
42s

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
7s

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
<1s

Terraform apply
·
succeeded
48s

Definir size como executado
·
succeeded
13s

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
18s

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
21s

Deploy Secure Files [JBOSS]
·
succeeded
5s

Deploy Config no JBOSS
·
succeeded
42s

Deploy Pacote no JBOSS
·
succeeded
8s

Check Deployments [JBOSS]
·
succeeded
4s

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
