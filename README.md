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
All pipelines

SIEMP

SIEMP-java-web
Predefined variables
Filter by keywords
Scope


CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259

http_context_additional
http_context_default
siemp_java_web

http_sso
no
produto_nome_vm
Jboss
produto_versao_vm
7.4
sistema_ambiente
des
sistema_ambiente
tqs
sistema_ambiente
hmp
sistema_ambiente
prd
sistema_ambiente
prd
sistema_nome
siemp-java-web
SITE
ctc_nprd
SITE
ctc_npcn
SITE
dtc_pcn
tf_var_template_name
eap74-openjdk17-apache24-rhel93-v012
UNIDADE
vm_destroy_before_create

vm_servers_recreate

Showing filters 1 through 2



2026-11-06T18:25:18.0716547Z ##[section]Starting: Valida Variáveis Obrigatórias
2026-11-06T18:25:18.0720919Z ==============================================================================
2026-11-06T18:25:18.0721009Z Task         : Bash
2026-11-06T18:25:18.0721050Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-06T18:25:18.0721111Z Version      : 3.227.0
2026-11-06T18:25:18.0721203Z Author       : Microsoft Corporation
2026-11-06T18:25:18.0721251Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-06T18:25:18.0721319Z ==============================================================================
2026-11-06T18:25:19.1153892Z Generating script.
2026-11-06T18:25:19.1166526Z ========================== Starting Command Output ===========================
2026-11-06T18:25:19.1174138Z [command]/bin/bash /opt/ads-agent/_work/_temp/45887e39-f2a4-4c1c-82e4-9500a1d534ea.sh
2026-11-06T18:25:19.1221648Z As Seguinte variáveis são de preenchimento obrigatório. Por favor preencher
2026-11-06T18:25:19.1221926Z         - CGC_UNIDADE_DES
2026-11-06T18:25:19.1222051Z 	  	 - CGC_UNIDADE_OPS
2026-11-06T18:25:19.1222181Z 	  	 - sistema_nome
2026-11-06T18:25:19.1222311Z 		 - http_context_default
2026-11-06T18:25:19.1242182Z ##[error]Bash exited with code '1'.
2026-11-06T18:25:19.1271947Z ##[section]Finishing: Valida Variáveis Obrigatórias



http_context_default ESSA ADIOCNEI AGFOIRA
ele quebra em variael que ja tem aqui
