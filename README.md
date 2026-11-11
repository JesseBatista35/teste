O caminho mais curto, uns 2 minutos:

1. Restaurar o agente agora (como root)

sed -i -E 's/^(CTMSHOST[[:space:]]+).*/\1cxextrlx038/; s/^(CTMPERMHOSTS[[:space:]]+).*/\1cxextrlx038/' /opt/ctmage/ctm/data/CONFIG.dat
systemctl restart controlm_agent.service
ag_ping

2. Corrigir a release

Em Releases > SIMIL-precificacao-rotinas-batch > Edit > Variables > Pipeline variables, apague CTMSHOST e CTMPERMHOSTS (ou troque por cxextrlx038) e salve. Não precisa rodar a release de novo agora.



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
SIMIL-precificacao-rotinas-batch
/
SIMIL-precificacao-rotinas-batch-20
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
SIMIL-precificacao-rotinas-batch

SIMIL-precificacao-rotinas-batch-20
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
Predefined variables
Filter by keywords
Release (+1)


AGCMNDATA
7016
ATCMNDATA
7015
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
CTMPERMHOSTS
ctm.caixa
CTMPERMHOSTS
crjdeaprlx038,crjdeaprlx039
CTMSHOST
crjdeaprlx038
http_context_additional
http_context_default
/controlm
http_sso
no
produto_nome_vm
Jboss EAP
produto_versao_vm
7.1
sistema_ambiente
des
sistema_nome
simil-precificacao-rotinas-batch
SITE
ctc_nprd
tf_var_template_name
controlm9p-openjdk17-rhel93-v038
Select a release pipeline to view its releases

295 pipelines found

Select a release pipeline to view its releases

15 pipelines found

Select a release pipeline to view its releases

12 pipelines found

Select a release pipeline to view its releases

8 pipelines found

Row 9

Row 2

Showing filters 1 through 2

Showing filters 1 through 2



o que é mlhor trocar ou apagar
