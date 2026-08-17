olicitação:*:	Incluir certificado mTLS no ambiente devops na aplicação SISGH-LINK
Informar formas de contato:*:	pelo teams
F552874
F590912
C093691



<img width="1222" height="492" alt="image" src="https://github.com/user-attachments/assets/25476ee0-eb15-45e0-812c-dc6bdd813bcc" />


Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SISGH-link-okd4
/
SISGH-link-20260814.1247-9.4.0.20-SNAPSHOT(1)
Search








SISGH-link-okd4

SISGH-link-20260814.1247-9.4.0.20-SNAPSHOT(1)
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
Started: 14/08/2026, 12:49:58
Pool:
Release-Linux-OKD4
·
Agent: azp-ads-agent-release-5cd876f98-4fmdt

2m 0s

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

Download Artifacts
·
succeeded
1 warning

<1s

Exportando as variáveis do arquivo Trust Store
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
3s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
<1s

Vinculando Secrets
·
succeeded
<1s

Adicionando Multiplas Secrets
·
succeeded
1s

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
1m 17s

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
4s

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
Collapsed

Select a release pipeline to view its releases

672 pipelines found

Select a release pipeline to view its releases

9 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Row 7

Row 2

Row 2

2 pipelines found

Row 3

Row 2

Row 3

Row 2

Row 3

Row 2

Showing filters 1 through 2

