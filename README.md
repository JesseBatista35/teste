Bom dia
Jesse Mouta Pereira Batista
Jorge Milis de Almeida Junior
 
Foi necessário criarmos mais uma REQ pedindo ajuda de vocês com o novo ambiente Terraform do sicmu-intranet-update, agora dando erro nos testes em ambiente TQS  (DES está OK)...
 
REQ000147081904 (coloquei aos cuidados seus)
 
Agradeço a atenção !
 
À disposição aqui para qualquer teste ou alinhamento.
 
Bom dia!
Jesse Mouta Pereira Batista
Jorge Milis de Almeida Junior
 
Abri a REQ000147197776 ... pedindo ajuda de vocês... pelo trecho de log, me pareceu haver possibilidade de problema em variável ou da esteira em si ou da library no devops... se puderem dar uma força, vocês já conhecem mais o sicmu-intranet-update,   Obrigado!


  	À CESTI,
A/C
Jesse Mouta Pereira Batista
Jorge Milis de Almeida Junior

Solicitamos revisar as configurações de ambiente de pipeline sicmu-intranet-update PARA O AMBIENTE TQS (DES está normal).
Seguem trechos de erros em graylog, stream SICMU-TQS:

2026-11-17 10:51:12,103 ERROR [br.gov.caixa.sicmu.exception.handler.SicmuExceptionHandler] (default task-14) Ocorreu um erro na aplicação. Código do erro: 3293437666 : com.sun.faces.mgbean.ManagedBeanCreationException: Um erro ocorreu ao realizar a injeção de recurso no bean gerenciado consultaOperacaoHabitacionalBean at com.sun.faces.mgbean.BeanBuilder.invokePostConstruct(BeanBuilder.java:203) at com.sun.faces.mgbean.BeanBuilder.build(BeanBuilder.java:79)

2026-11-17 10:51:12,103 ERROR [br.gov.caixa.sicmu.exception.handler.SicmuExceptionHandler] (default task-14) Ocorreu um erro na aplicação. Código do erro: 3293437666 : com.sun.faces.mgbean.ManagedBeanCreationException: Um erro ocorreu ao realizar a injeção de recurso no bean gerenciado consultaOperacaoHabitacionalBean at com.sun.faces.mgbean.BeanBuilder.invokePostConstruct(BeanBuilder.java:203) at com.sun.faces.mgbean.BeanBuilder.build(BeanBuilder.java:79)

2026-11-17 10:51:12,103 ERROR [br.gov.caixa.sicmu.exception.handler.SicmuExceptionHandler] (default task-14) Ocorreu um erro na aplicação. Código do erro: 3293437666 : com.sun.faces.mgbean.ManagedBeanCreationException: Um erro ocorreu ao realizar a injeção de recurso no bean gerenciado consultaOperacaoHabitacionalBean at com.sun.faces.mgbean.BeanBuilder.invokePostConstruct(BeanBuilder.java:203) at com.sun.faces.mgbean.BeanBuilder.build(BeanBuilder.java:79)


Atenciosamente,

Marcelo Lucindo de Souza
Consultor de TI - CESOA



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
SICMU-intranet-update
/
SICMU-intranet-update-127
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
SICMU-intranet-update

SICMU-intranet-update-127
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
Started: 17/09/2026, 16:27:42
Pool:
Release-Linux
·
Agent: cadsvaprlx069.intra.caixa.gov.br

1m 24s

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
<1s

Exportar variáveis NFS
·
succeeded
<1s

Exportar variáveis Infrafácil
·
succeeded

1s

Alocando o IP (AlocaIP e Infradevops)
·
succeeded
46s

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
1s

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
4 errors
10s
Bash wrote one or more lines to the standard error stream.
Error: POST https://10.122.144.195/rest/com/vmware/cis/session: 401 Unauthorized
  with provider["registry.terraform.io/hashicorp/vsphere"],
  on provider.tf line 15, in provider "vsphere":
  15: provider "vsphere" {
grep: tfplan.json
: Arquivo ou diretório não encontrado

Definir size como executado
·
skipped


Cadastrar Servidor no Satellite
·
skipped


Valida Variáveis Obrigatórias
·
skipped


Recuperando URL Pacote Nexus
·
skipped


Recupera Pacote
·
skipped


Recuperando nome do repositório
·
skipped


Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
skipped


Corrigindo Codificação Arquivos dos2unix
·
skipped


Alterando Valores placeholders nos arquivos de config
·
skipped


Valida XML JBOSS
·
skipped


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
skipped


Cria Streams Graylog
·
skipped


Permissionamento LDAP
·
skipped


Configurando JBoss
·
skipped


Configurando Stack de Monitoração
·
skipped


Configurando Logrotate
·
skipped


Configurando o Apache
·
skipped


Deploy Secure Files [JBOSS]
·
skipped


Deploy Config no JBOSS
·
skipped


Deploy Pacote no JBOSS
·
skipped


Check Deployments [JBOSS]
·
skipped


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
Showing 21 deployments

Row 3

Collapsed

Expanded

Row 3

Collapsed

Row 2

8 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Select a release pipeline to view its releases

2 pipelines found

Row 2

Row 2

1 pipelines found

Row 2

Row 2

