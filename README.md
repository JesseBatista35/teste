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
SIPBS-batch
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
SIPBS

SIPBS-batch
Predefined variables
Filter by keywords
Scope


AGCMNDATA
7006
ATCMNDATA
7005
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
CTM_AG_JAVA_HOME
/opt/ctmage/bmcjava/bmcjava-V3

CTM_TRACKER_EVENT_PORT
31516
CTMPERMHOSTS
ctm.caixa
CTMPERMHOSTS
crjdeaprlx038,crjdeaprlx039,crjhmaprlx012
CTMPERMHOSTS
crjtqaprlx006,crjtqaprlx007
CTMPERMHOSTS
crjhmaprlx063,crjhmaprlx068
CTMPERMHOSTS
crjsvaprlx011
CTMSHOST
crjdeaprlx038
CTMSHOST
crjtqaprlx006
CTMSHOST
crjhmaprlx063
CTMSHOST
crjsvaprlx011
http_context_additional
sipbs-batch
http_context_default
sipbs-batch
http_sso
no
produto_nome_vm
Control-M
produto_versao_vm
7.1
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
sipbs-batch
SISTEMAAMBIENTE
des
SISTEMAAMBIENTE
tqs
SISTEMAAMBIENTE
prd
SISTEMANOME
sipbs-batch
site
ctc_nprd
site
ctc_nprd
site
ctc_nprd
site
ctc_npcn
site
dtc_pcn
tf_var_num_cpus
1
tf_var_num_mem
2048
tf_var_quant
1
tf_var_template_name
controlm-plugins-v9-19-200-teste-openjdk11-rhel79-v010
tf_var_vm_opt_size
10
UNIDADE
BR
URL_DEPLOY
nexus.com
vm_destroy_before_create

vm_servers_recreate

Expanded

Expanded

Collapsed

Collapsed

3 pipelines found

Row 2

Showing filters 1 through 2

O OUTRO ANALSITA ALI MUDOU PARA V2 E V3 NMAIS DEU PAU CONTINA QUEBRANDO



[root@caddeapllx1572 data]# systemctl status controlm_agent.service
● controlm_agent.service - Control-M Agent
   Loaded: loaded (/etc/systemd/system/controlm_agent.service; enabled; vendor preset: disabled)
   Active: failed (Result: timeout) since Qua 2026-07-22 12:39:53 -03; 20s ago
  Process: 12710 ExecStop=/opt/ctmage/ctm/scripts/rc.agent_user stop (code=exited, status=0/SUCCESS)
  Process: 13032 ExecStart=/opt/ctmage/ctm/scripts/rc.agent_user start (code=killed, signal=TERM)
 
Jul 22 12:38:23 caddeapllx1572.agil.nprd.caixa.gov.br su[13187]: (to ctmagelx) root on none
Jul 22 12:38:23 caddeapllx1572.agil.nprd.caixa.gov.br su[13216]: (to ctmagelx) root on none
Jul 22 12:38:23 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[13032]: Starting the agent as 'root' user
Jul 22 12:38:23 caddeapllx1572.agil.nprd.caixa.gov.br su[13255]: (to ctmagelx) root on none
Jul 22 12:38:23 caddeapllx1572.agil.nprd.caixa.gov.br su[13267]: (to ctmagelx) root on none
Jul 22 12:39:53 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service start operation timed out. Terminating.
Jul 22 12:39:53 caddeapllx1572.agil.nprd.caixa.gov.br rc.agent_user[13032]: Waiting for pid file of process agj to be created..............................
Jul 22 12:39:53 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Failed to start Control-M Agent.
Jul 22 12:39:53 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: Unit controlm_agent.service entered failed state.
Jul 22 12:39:53 caddeapllx1572.agil.nprd.caixa.gov.br systemd[1]: controlm_agent.service failed.
[root@caddeapllx1572 data]#
[root@caddeapllx1572 data]#
[root@caddeapllx1572 data]#
[root@caddeapllx1572 data]#
[root@caddeapllx1572 data]#  grep AG_JAVA_HOME /opt/ctmage/ctm/data/CONFIG.dat
AG_JAVA_HOME                        /opt/ctmage/bmcjava/bmcjava-V2
[root@caddeapllx1572 data]#
