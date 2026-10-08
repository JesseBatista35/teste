Tratar erro de deploy na pipeline do módulo SIGFA-batch	
Solicito que solucionem o erro de deploy na pipeline do módulo SIGFA-batch. 


O que você deseja?*:	Suporte ao ambiente de aplicação nas esteiras DevOps
Qual o nome do Sistema?*:	SIGFA
Qual o ambiente*:	TQS
Selecione a sua Comunidade*:	Câmbio, Investimentos e Merc. Capitais
Formas de contato*:	Teams: c159434
Descrição da necessidade*:	Bom dia!
Solicito que solucionem o erro de deploy na pipeline do módulo SIGFA-batch. Recentemente foi habilitada a etapa "configurando stack de monitoramento" nesta pipeline, que é a etapa que está dando erro no deploy.

O anexo 1 mostra a etapa desabilitada em um deploy anterior bem-sucedido, enquanto o anexo 2 mostra o erro nos deploys atuais de DES e TQS.

Segue Link da pipeline para análise:
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=537457


<img width="1361" height="272" alt="image" src="https://github.com/user-attachments/assets/d61cfb1a-93e0-4629-827f-0b379dd3b6d5" />


SO RODASMO UM NOVO DEPLOY. 

EM SALA COM EQUIPE DO SIGFA, FOMOS QUESTINADO SE DER PROBLEMA EM PRODUÇÃO, PASSAMOA A ORIENTAÇÃO QUE FOI CONFIGURADO EM UMA TASK GROUP ENTAO NAO VAI FALAHAR ELA VAI PASSAR
OUTRO PONTO E QUE EM PRODUÇÃO NOA VI ES STEPE DE MONITORAÇÃO, MAIS VALE DEIXAR CLARO NE REQ UQE ELES PORECISA VERIIFCAR COM A EQUIPE DE INFRAESTRUTURA, SABE TIRANDO O NOSSO DA RETA PARA DEPOIS ANO FAREL FUNADL FALOU QUE NA OIA FUNCIONAR


Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGFA-batch
/
SIGFA-batch-1592
Search








SIGFA-batch

SIGFA-batch-1592


EC PRD

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 20/07/2026, 17:12:08
Pool:
Release-Linux
·
Agent: cadsvaprlx070.intra.caixa.gov.br

3m 47s

Initialize job
·
succeeded
1s

Pre-job: Download secure file
·
succeeded
1s

Pre-job: Download secure file - jboss.keystore
·
succeeded
1s

Download Artifacts
·
succeeded
1 warning
1s

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
<1s

Alterando Valores placeholders nos arquivos de config
·
succeeded
1s

Valida XML JBOSS
·
succeeded

1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
1s

Cria Streams Graylog
·
succeeded
1s

Criando as VMs
·
succeeded
40s

Configurando DNS
·
succeeded
12s

Configura Control-M
·
succeeded
20s

Permissionamento LDAP
·
succeeded
3s

Configurando JBoss
·
succeeded
9s

Configurando Logrotate
·
succeeded
3s

Configurando Autenticação LDAP
·
succeeded
5s

Configurando o Apache
·
succeeded
7s

Deploy Secure Files [JBOSS]
·
succeeded
7s

Deploy Config no JBOSS
·
succeeded
34s

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
<1s

Resumo da release
·
succeeded
50s

Finalize Job
·
succeeded
<1s
Showing filters 1 through 2

EC TQSDeploy release

1 pipelines found

1 pipelines found

Showing filters 1 through 2

1 pipelines found

Showing filters 1 through 2

Showing 17 deployments

EC TQSDeploy release

Expanded

Row 3

Collapsed

Row 2

5 pipelines found

Row 2

Row 2

Row 20

Row 2

Collapsed

Expanded

