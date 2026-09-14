Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIINP-nucleo
/
SIINP-nucleo-20260914.1120-1.84.2.8-SNAPSHOT(5)
Search








SIINP-nucleo

SIINP-nucleo-20260914.1120-1.84.2.8-SNAPSHOT(5)
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
Started: 14/09/2026, 14:39:56
Pool:
Release-Linux
·
Agent: cadsvaprlx072.intra.caixa.gov.br

7m 26s

Initialize job
·
succeeded
1s

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

Recuperando nome do repositório
·
succeeded
2s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
1s

Recupera VEC
·
succeeded
3s

VEC - Aferição
·
succeeded
1 warning
<1s

Login OpenShift
·
succeeded
1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
2s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
1s

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


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
1s

Create BT Secret
·
succeeded
1s

Create BT Shared Volume
·
succeeded

1s

Create BT Sidecar
·
succeeded
1s

Create Secret Check Script
·
succeeded
2s

Create Secret Check
·
succeeded
1s

Create BT App Mount Volume
·
succeeded
1s

Criando arquivo PV
·
succeeded
<1s

Criando Persistente Volume
·
succeeded
1s

Criando arquivo PVC
·
succeeded
<1s

Criando Persistente Volume Claim
·
succeeded
1s

Verificando se o Volume foi configurado corretamente.
·
succeeded
1s

Configurando DeploymentConfig para utilizar o Volume Criado
·
succeeded
1s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
1s

Vinculando Secrets
·
succeeded
1s

Adicionando Multiplas Secrets
·
succeeded
3s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
22s

Concedendo Acesso OKD
·
succeeded
1s

Verificando IP de Saída
·
succeeded
1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
1 error
6m 7s
The task has timed out.

Logs da Aplicação
·
succeeded
2s

Resumo da Release
·
skipped


Coletando dados da imagem
·
skipped


Atualizando versão no PortalIF
·
skipped


Realizando Logout OKD
·
succeeded
<1s

Finalize Job
·
succeeded
<1s
