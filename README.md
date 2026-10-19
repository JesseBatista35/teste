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
SIGSJ-intranet
/
SIGSJ-intranet-4
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
SIGSJ-intranet

SIGSJ-intranet-4
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
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
CI_NAME
7366CLU-OKD4-PRODUTOS
OKD_API_PRODUTOS
api.produtos4.caixa:6443
OKD_REGISTRY_PRODUTOS
default-route-openshift-image-registry.apps.produtos4.caixa
OKD_TOKEN_PRODUTOS
********
OKD_URL_SUFFIX_PRODUTOS
api.produtos4.caixa:6443
OKD_USER_SERVICE_PRODUTOS
ads-sa
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
SONAR_URL
http://sonar.produtos.caixa
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
DIR_LOGS
/opt/ads-agent/esteira-logs
GRAYLOG_PASSWORD
********
GRAYLOG_USERNAME
API_CLIENT
REPOSITORY_LOGS
https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
INFRAFACIL
infradevops-novoportal-backend-prd.apps.produtos4.caixa
TERRAFORM_ESX_PASSWORD
********
TERRAFORM_ESX_USERNAME
s736660
TF_HTTPS_NO_PROXY
10.122.144.168,10.122.144.195,10.122.144.130,10.221.144.17,*.caixa,*.intra.caixa.gov.br,cadsvgerap030-1.intra.caixa.gov.br,cadsvgerap027-1.intra.caixa.gov.br,cadsvgerap028-1.intra.caixa.gov.br,cert-api.access.redhat.com,cadsvgerap107-1.intra.caixa.gov.br
TF_HTTPS_PROXY
http://proxynuvem.caixa:80
arm_access_key
********
ANSIBLE_JBOSS_VM_VERSION_3 (11)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
ANSIBLE_CONFIG
$(HOME_ADS_AGENT)/$(DIR_ANSIBLE)/ansible.cfg
ANSIBLE_INVENTORY_ANY_UNPARSED_IS_FAILED
True
ANSIBLE_VAULT
********
DIR_ANSIBLE
esteira-jboss-vm-v2
HOME_ADS_AGENT
$(System.DefaultWorkingDirectory)
NO_PROXY
10.122.144.168,10.122.144.195,10.122.144.130,10.221.144.17,devops.caixa,cadsvgerap004-1.intra.caixa.gov.br,cadsvgerap028-1.intra.caixa.gov.br,infradevops-novoportal-backend-prd.apps.produtos4.caixa,infradevops-ads-api-prd.apps.produtos4.caixa,infradevops-db-api-prd.apps.produtos4.caixa,cadsvgerap027-1.intra.caixa.gov.br
REPO_ESTEIRA_JBOSS_VM
https://devops.caixa/projetos/Infraestrutura/_git/esteira-jboss-vm-v2
REPO_ESTEIRA_JBOSS_VM_BRANCH
master
REPO_ESTEIRA_TERRAFORM
https://devops.caixa/projetos/Infraestrutura/_git/esteira-vm-release-terraform
REPO_ESTEIRA_TERRAFORM_BRANCH
main
TOKEN_INFRAFACIL_MUDANCA
********
Compartilhamentos (4)
Scopes: Release
ID_ALOCAIP
C&t@d02
PW_ALOCAIP
********
PW_ISILON
********
USR_ISILON
s736651@corp.caixa.gov.br
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
TERRAFORM_CLUSTER
CTC_NPRDXF2488HV7_NPRD
TERRAFORM_DATACENTER
NPRD
TERRAFORM_DATASTORE
CTCHWNPRDC011_0259
TERRAFORM_ESX_NETWORK
tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0
TERRAFORM_ESX_NETWORK_BCK
tn-NPRD|NPRD_BKP-ap|VL3697-ep
TERRAFORM_ESX_NETWORK_BCK_1
tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep
TERRAFORM_ESX_PASSWORD
********
TERRAFORM_ESX_USERNAME
s736660
TERRAFORM_ESX_VCENTER_SERVER
10.122.144.195
TERRAFORM_NET_ADAPTER_TYPE
vmxnet3
TERRAFORM_VM_DNS
["10.116.193.77", "10.116.193.78"]
TERRAFORM_VM_DOMAIN
agil.nprd.caixa.gov.br
TERRAFORM_VM_IPNETMASK
19
TERRAFORM_VM_IPNETMASK_BCK
19
TERRAFORM_VM_IPNETMASK_BCK_1
16
TERRAFORM_VSPHERE_FOLDER
/vm
TERRAFORM_VSPHERE_POOL
/Resources/RP_TERRAFORM_NPRD
SIGSJ-INTRANET-DES (2)
Grupo de variáveis de SIGSJ-INTRANET-DES
Scopes: EC DES
INIT
Criado via api
_ENV.URL_STATICS
www.teste.com
SIGSJ-INTRANET-TQS (1)
Grupo de variáveis de SIGSJ-INTRANET-TQS
Scopes: EC TQS
INIT
Criado via api
SIGSJ-INTRANET-HMP (1)
Grupo de variáveis de SIGSJ-INTRANET-HMP
Scopes: EC HMP
INIT
Criado via api
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (17)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
TERRAFORM_CLUSTER
CTC_PRDXF2488HV7_NPCN
TERRAFORM_DATACENTER
DC_NPCN_CTC
TERRAFORM_DATASTORE
CTCHW3005_00034
TERRAFORM_ESX_NETWORK
tn-NPCN-CTC|APLICACAO|VL1187-ep
TERRAFORM_ESX_NETWORK_BCK
tn-BACKUP|BACKUP-CTC-ap|VL0020-ep
TERRAFORM_ESX_NETWORK_BCK_1
tn-BACKUP|BACKUP-PROD-ap|BACKUP-PROD-ep
TERRAFORM_ESX_PASSWORD
********
TERRAFORM_ESX_USERNAME
s736660
TERRAFORM_ESX_VCENTER_SERVER
cadsvgerap027-1.intra.caixa.gov.br
TERRAFORM_NET_ADAPTER_TYPE
vmxnet3
TERRAFORM_VM_DNS
["10.121.128.203", "10.121.128.204"]
TERRAFORM_VM_DOMAIN
agil.caixa.gov.br
TERRAFORM_VM_IPNETMASK
19
TERRAFORM_VM_IPNETMASK_BCK
20
TERRAFORM_VM_IPNETMASK_BCK_1
21
TERRAFORM_VSPHERE_FOLDER
/vm
TERRAFORM_VSPHERE_POOL
/Resources/RP_ESTEIRAS_AGEIS_NPCN_CTC_V7
SIGSJ-INTRANET-PRD (1)
Grupo de variáveis de SIGSJ-INTRANET-PRD
Scopes: EC PRD CTC,EC PRD DTC
INIT
Criado via api
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
TERRAFORM_CLUSTER
DTC_PRDHW2488HV5_CANAIS
TERRAFORM_DATACENTER
DTC
TERRAFORM_DATASTORE
DTCHW3008_0000
TERRAFORM_ESX_NETWORK
tn-PCN-DTC|INTERNET-ap|VL2162-ep
TERRAFORM_ESX_NETWORK_BCK
PortGroup_Backup_10.223.32.0_VLAN62_Private
TERRAFORM_ESX_PASSWORD
********
TERRAFORM_ESX_USERNAME
s736660
TERRAFORM_ESX_VCENTER_SERVER
10.221.144.17
TERRAFORM_NET_ADAPTER_TYPE
vmxnet3
TERRAFORM_VM_DNS
["10.222.144.12", "10.222.144.13"]
TERRAFORM_VM_DOMAIN
agil.caixa.gov.br
TERRAFORM_VM_IPNETMASK
23
TERRAFORM_VM_IPNETMASK_BCK
20
TERRAFORM_VSPHERE_FOLDER
/vm/
TERRAFORM_VSPHERE_POOL
/Resources/RP_ESTEIRAS_CANAIS_DTC
Showing filters 1 through 2

List item selected

List item selected

List item selected

List item selected

Stage deleted

4 pipelines found

Row 2

Row 2

Showing filters 1 through 2






2026-10-19T19:25:48.4249129Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-10-19T19:25:48.4252509Z ==============================================================================
2026-10-19T19:25:48.4252589Z Task         : Bash
2026-10-19T19:25:48.4252631Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-19T19:25:48.4252701Z Version      : 3.227.0
2026-10-19T19:25:48.4252742Z Author       : Microsoft Corporation
2026-10-19T19:25:48.4252790Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-19T19:25:48.4252872Z ==============================================================================
2026-10-19T19:25:49.2401387Z Generating script.
2026-10-19T19:25:49.2411967Z ========================== Starting Command Output ===========================
2026-10-19T19:25:49.2419507Z [command]/bin/bash /opt/ads-agent/_work/_temp/0a018cba-d103-4f29-99f0-d0b3167afdf5.sh
2026-10-19T19:25:49.2497198Z /opt/ads-agent/_work/_temp/0a018cba-d103-4f29-99f0-d0b3167afdf5.sh: line 4: tf_var_quant: comando não encontrado
2026-10-19T19:25:51.4564861Z 
2026-10-19T19:25:51.4565384Z PLAY [local] *******************************************************************
2026-10-19T19:25:51.4822744Z Monday 19 October 2026  16:25:51 -0300 (0:00:00.086)       0:00:00.086 ******** 
2026-10-19T19:26:20.9979427Z 
2026-10-19T19:26:20.9983661Z TASK [Gathering Facts] *********************************************************
2026-10-19T19:26:20.9983976Z ok: [127.0.0.1]
2026-10-19T19:26:21.0309322Z Monday 19 October 2026  16:26:21 -0300 (0:00:29.548)       0:00:29.634 ******** 
2026-10-19T19:26:21.1176356Z Monday 19 October 2026  16:26:21 -0300 (0:00:00.086)       0:00:29.721 ******** 
2026-10-19T19:26:21.1951062Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r16031/a
2026-10-19T19:26:21.1953234Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-10-19T19:26:21.1953463Z duplicate dict key (include_tasks). Using last defined value only.
2026-10-19T19:26:21.2074375Z included: /opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-10-19T19:26:21.2324014Z Monday 19 October 2026  16:26:21 -0300 (0:00:00.114)       0:00:29.836 ******** 
2026-10-19T19:26:21.3056501Z 
2026-10-19T19:26:21.3057209Z TASK [vm : Cria variável build_repository_name] ********************************
2026-10-19T19:26:21.3058567Z ok: [127.0.0.1]
2026-10-19T19:26:21.3295196Z Monday 19 October 2026  16:26:21 -0300 (0:00:00.097)       0:00:29.933 ******** 
2026-10-19T19:26:22.2159318Z 
2026-10-19T19:26:22.2160056Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-10-19T19:26:22.2160366Z ok: [127.0.0.1]
2026-10-19T19:26:22.2398648Z Monday 19 October 2026  16:26:22 -0300 (0:00:00.910)       0:00:30.843 ******** 
2026-10-19T19:26:23.7487464Z 
2026-10-19T19:26:23.7487910Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-10-19T19:26:23.7488107Z changed: [127.0.0.1]
2026-10-19T19:26:23.7726275Z Monday 19 October 2026  16:26:23 -0300 (0:00:01.532)       0:00:32.376 ******** 
2026-10-19T19:26:23.8439690Z 
2026-10-19T19:26:23.8440139Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-10-19T19:26:23.8440338Z ok: [127.0.0.1] => {
2026-10-19T19:26:23.8440441Z     "msg": [
2026-10-19T19:26:23.8440554Z         "Iniciando registro do template VMTX...", 
2026-10-19T19:26:23.8440681Z         "vCenter: 10.122.144.195", 
2026-10-19T19:26:23.8440988Z         "Template: eap74-openjdk8-apache24-rhel93-v015", 
2026-10-19T19:26:23.8441261Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] eap74-openjdk8-apache24-rhel93-v015/eap74-openjdk8-apache24-rhel93-v015.vmtx", 
2026-10-19T19:26:23.8441768Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-10-19T19:26:23.8442698Z         "Template 'eap74-openjdk8-apache24-rhel93-v015' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-10-19T19:26:23.8442862Z         "Operacao concluida com sucesso."
2026-10-19T19:26:23.8442970Z     ]
2026-10-19T19:26:23.8443163Z }
2026-10-19T19:26:23.8674517Z Monday 19 October 2026  16:26:23 -0300 (0:00:00.094)       0:00:32.471 ******** 
2026-10-19T19:26:23.9398210Z 
2026-10-19T19:26:23.9398869Z TASK [vm : Cria variável ansible] **********************************************
2026-10-19T19:26:23.9399063Z ok: [127.0.0.1]
2026-10-19T19:26:23.9647733Z Monday 19 October 2026  16:26:23 -0300 (0:00:00.097)       0:00:32.568 ******** 
2026-10-19T19:26:24.4507025Z 
2026-10-19T19:26:24.4507737Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-10-19T19:26:24.4508520Z ok: [127.0.0.1]
2026-10-19T19:26:24.4746749Z Monday 19 October 2026  16:26:24 -0300 (0:00:00.509)       0:00:33.078 ******** 
2026-10-19T19:26:24.8050835Z 
2026-10-19T19:26:24.8051531Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-10-19T19:26:24.8051678Z ok: [127.0.0.1]
2026-10-19T19:26:24.8307955Z Monday 19 October 2026  16:26:24 -0300 (0:00:00.356)       0:00:33.434 ******** 
2026-10-19T19:26:24.8964259Z Monday 19 October 2026  16:26:24 -0300 (0:00:00.065)       0:00:33.500 ******** 
2026-10-19T19:26:24.9933109Z Monday 19 October 2026  16:26:24 -0300 (0:00:00.096)       0:00:33.597 ******** 
2026-10-19T19:26:25.0404418Z 
2026-10-19T19:26:25.0405010Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-10-19T19:26:25.0405453Z ok: [127.0.0.1]
2026-10-19T19:26:25.0661012Z Monday 19 October 2026  16:26:25 -0300 (0:00:00.072)       0:00:33.670 ******** 
2026-10-19T19:26:25.1424868Z included: /opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-10-19T19:26:25.1725357Z Monday 19 October 2026  16:26:25 -0300 (0:00:00.106)       0:00:33.776 ******** 
2026-10-19T19:26:25.2357220Z included: /opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-10-19T19:26:25.2673308Z Monday 19 October 2026  16:26:25 -0300 (0:00:00.094)       0:00:33.871 ******** 
2026-10-19T19:26:25.9238914Z 
2026-10-19T19:26:25.9239355Z TASK [vm : Consultar API] ******************************************************
2026-10-19T19:26:25.9239544Z ok: [127.0.0.1]
2026-10-19T19:26:25.9485129Z Monday 19 October 2026  16:26:25 -0300 (0:00:00.681)       0:00:34.552 ******** 
2026-10-19T19:26:25.9925248Z 
2026-10-19T19:26:25.9925782Z TASK [vm : Parse JSON] *********************************************************
2026-10-19T19:26:25.9925914Z ok: [127.0.0.1]
2026-10-19T19:26:26.0163270Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.067)       0:00:34.620 ******** 
2026-10-19T19:26:26.0863142Z included: /opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-10-19T19:26:26.1184624Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.102)       0:00:34.722 ******** 
2026-10-19T19:26:26.5550101Z 
2026-10-19T19:26:26.5550535Z TASK [vm : Consultar API] ******************************************************
2026-10-19T19:26:26.5550689Z ok: [127.0.0.1]
2026-10-19T19:26:26.5996080Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.481)       0:00:35.203 ******** 
2026-10-19T19:26:26.6477977Z 
2026-10-19T19:26:26.6478276Z TASK [vm : Parse JSON] *********************************************************
2026-10-19T19:26:26.6478422Z ok: [127.0.0.1]
2026-10-19T19:26:26.6721472Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.072)       0:00:35.276 ******** 
2026-10-19T19:26:26.7386482Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.066)       0:00:35.342 ******** 
2026-10-19T19:26:26.7863884Z 
2026-10-19T19:26:26.7864348Z TASK [vm : Exibir size servidores.] ********************************************
2026-10-19T19:26:26.7867338Z ok: [127.0.0.1] => {
2026-10-19T19:26:26.7867781Z     "api_data.dados.0": {
2026-10-19T19:26:26.7867897Z         "ambiente": "des", 
2026-10-19T19:26:26.7868000Z         "cluster": null, 
2026-10-19T19:26:26.7868110Z         "cluster_principal": null, 
2026-10-19T19:26:26.7868222Z         "cluster_terraform": null, 
2026-10-19T19:26:26.7868312Z         "cpu": 2, 
2026-10-19T19:26:26.7868516Z         "datacenter": null, 
2026-10-19T19:26:26.7869310Z         "datastore": null, 
2026-10-19T19:26:26.7869421Z         "detalhe_imagem": null, 
2026-10-19T19:26:26.7869524Z         "disco_log": 2, 
2026-10-19T19:26:26.7869632Z         "disco_opt": 10, 
2026-10-19T19:26:26.7869732Z         "domain": null, 
2026-10-19T19:26:26.7869822Z         "esx_network": null, 
2026-10-19T19:26:26.7869925Z         "esx_network_bck": null, 
2026-10-19T19:26:26.7870035Z         "esx_network_bck_01": null, 
2026-10-19T19:26:26.7870145Z         "esx_vcenter_server": null, 
2026-10-19T19:26:26.7870250Z         "farm": null, 
2026-10-19T19:26:26.7870348Z         "id": 1763, 
2026-10-19T19:26:26.7870628Z         "inclusao": "2021-07-28 12:12:13", 
2026-10-19T19:26:26.7870751Z         "info_framework": null, 
2026-10-19T19:26:26.7870858Z         "info_linguagem": null, 
2026-10-19T19:26:26.7870962Z         "info_tecnologia": null, 
2026-10-19T19:26:26.7874551Z         "info_versao": null, 
2026-10-19T19:26:26.7874760Z         "ipbackup": null, 
2026-10-19T19:26:26.7874899Z         "jboss_apache_status": "ativado", 
2026-10-19T19:26:26.7875012Z         "memoria": 4, 
2026-10-19T19:26:26.7875112Z         "net_adapter_type": null, 
2026-10-19T19:26:26.7875221Z         "nome_imagem": null, 
2026-10-19T19:26:26.7875465Z         "objeto_origem": "SIGSJ-INTRANET_DES__SERVIDOR", 
2026-10-19T19:26:26.7875588Z         "plataforma": "vm", 
2026-10-19T19:26:26.7875689Z         "produto": "jboss", 
2026-10-19T19:26:26.7875795Z         "recursos_max_id": null, 
2026-10-19T19:26:26.7875891Z         "servidores_json": [
2026-10-19T19:26:26.7875988Z             {
2026-10-19T19:26:26.7876095Z                 "ip": "10.116.194.179", 
2026-10-19T19:26:26.7876216Z                 "nome": "caddeapllx955.agil.nprd.caixa.gov.br"
2026-10-19T19:26:26.7876325Z             }
2026-10-19T19:26:26.7876411Z         ], 
2026-10-19T19:26:26.7876556Z         "sistema": "sigsj-intranet", 
2026-10-19T19:26:26.7876652Z         "site": null, 
2026-10-19T19:26:26.7876759Z         "solicitacoes_id": 1169, 
2026-10-19T19:26:26.7876867Z         "status": "desativado", 
2026-10-19T19:26:26.7876971Z         "terraform": false, 
2026-10-19T19:26:26.7877078Z         "versao_imagem": null, 
2026-10-19T19:26:26.7877188Z         "versao_plataforma": "7.1", 
2026-10-19T19:26:26.7877284Z         "vm_dns": null, 
2026-10-19T19:26:26.7877389Z         "vm_ipnetmask": null, 
2026-10-19T19:26:26.7877494Z         "vm_ipnetmask_bck": null, 
2026-10-19T19:26:26.7877606Z         "vm_ipnetmask_bck_01": null, 
2026-10-19T19:26:26.7877715Z         "vsphere_folder": null, 
2026-10-19T19:26:26.7877821Z         "vsphere_pool": null
2026-10-19T19:26:26.7877911Z     }
2026-10-19T19:26:26.7877985Z }
2026-10-19T19:26:26.8112937Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.072)       0:00:35.415 ******** 
2026-10-19T19:26:26.8759487Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.064)       0:00:35.480 ******** 
2026-10-19T19:26:26.9255963Z 
2026-10-19T19:26:26.9256290Z TASK [vm : Set size] ***********************************************************
2026-10-19T19:26:26.9256809Z ok: [127.0.0.1]
2026-10-19T19:26:26.9507001Z Monday 19 October 2026  16:26:26 -0300 (0:00:00.074)       0:00:35.554 ******** 
2026-10-19T19:26:26.9987585Z 
2026-10-19T19:26:26.9988319Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-10-19T19:26:26.9988472Z ok: [127.0.0.1]
2026-10-19T19:26:27.0235424Z Monday 19 October 2026  16:26:27 -0300 (0:00:00.072)       0:00:35.627 ******** 
2026-10-19T19:26:27.0663347Z 
2026-10-19T19:26:27.0663785Z TASK [vm : debug] **************************************************************
2026-10-19T19:26:27.0664256Z ok: [127.0.0.1] => {
2026-10-19T19:26:27.0664537Z     "template_name": "eap74-openjdk8-apache24-rhel93-v015"
2026-10-19T19:26:27.0664654Z }
2026-10-19T19:26:27.0943532Z Monday 19 October 2026  16:26:27 -0300 (0:00:00.070)       0:00:35.698 ******** 
2026-10-19T19:26:27.1394158Z 
2026-10-19T19:26:27.1394807Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-10-19T19:26:27.1395340Z ok: [127.0.0.1]
2026-10-19T19:26:27.1633038Z Monday 19 October 2026  16:26:27 -0300 (0:00:00.068)       0:00:35.767 ******** 
2026-10-19T19:26:27.2278805Z Monday 19 October 2026  16:26:27 -0300 (0:00:00.064)       0:00:35.831 ******** 
2026-10-19T19:26:27.6704447Z 
2026-10-19T19:26:27.6704873Z TASK [vm : Run Invetory All] ***************************************************
2026-10-19T19:26:27.6709124Z fatal: [127.0.0.1]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py", "--list", "--all", "--sistema=sigsj-intranet", "--ambiente=des", "--site=ctc_nprd", "--farm="], "delta": "0:00:00.139241", "end": "2026-10-19 16:26:27.653652", "msg": "non-zero return code", "rc": 1, "start": "2026-10-19 16:26:27.514411", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 213, in <module>\n    lista_inventario()\n  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 145, in lista_inventario\n    hosts_info()\n  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 103, in hosts_info\n    cria_inventario(lista_membros)\n  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 67, in cria_inventario\n    if membro['produto'].lower() not in dynamic_inventory:\nAttributeError: 'NoneType' object has no attribute 'lower'", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 213, in <module>", "    lista_inventario()", "  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 145, in lista_inventario", "    hosts_info()", "  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 103, in hosts_info", "    cria_inventario(lista_membros)", "  File \"/opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/inventory/inventory_portal.py\", line 67, in cria_inventario", "    if membro['produto'].lower() not in dynamic_inventory:", "AttributeError: 'NoneType' object has no attribute 'lower'"], "stdout": "", "stdout_lines": []}
2026-10-19T19:26:27.6722687Z 
2026-10-19T19:26:27.6723224Z PLAY RECAP *********************************************************************
2026-10-19T19:26:27.6723611Z 127.0.0.1                  : ok=22   changed=1    unreachable=0    failed=1    skipped=5    rescued=0    ignored=0   
2026-10-19T19:26:27.6723703Z 
2026-10-19T19:26:27.6724634Z Monday 19 October 2026  16:26:27 -0300 (0:00:00.444)       0:00:36.276 ******** 
2026-10-19T19:26:27.6724814Z =============================================================================== 
2026-10-19T19:26:27.6728335Z Gathering Facts -------------------------------------------------------- 29.55s
2026-10-19T19:26:27.6728671Z vm : Executar script para marcar VM como template ----------------------- 1.53s
2026-10-19T19:26:27.6728905Z vm : Instalar dependências Python para vCenter -------------------------- 0.91s
2026-10-19T19:26:27.6729148Z vm : Consultar API ------------------------------------------------------ 0.68s
2026-10-19T19:26:27.6729373Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.51s
2026-10-19T19:26:27.6729586Z vm : Consultar API ------------------------------------------------------ 0.48s
2026-10-19T19:26:27.6729807Z vm : Run Invetory All --------------------------------------------------- 0.44s
2026-10-19T19:26:27.6730022Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.36s
2026-10-19T19:26:27.6730500Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-10-19T19:26:27.6730789Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-10-19T19:26:27.6731006Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-10-19T19:26:27.6731320Z vm : Cria variável ansible ---------------------------------------------- 0.10s
2026-10-19T19:26:27.6731538Z vm : Cria variável build_repository_name -------------------------------- 0.10s
2026-10-19T19:26:27.6731769Z vm : Copiar arquivos para o diretório de destino ansible group_vars ----- 0.10s
2026-10-19T19:26:27.6731991Z vm : Exibir resultado do script vCenter --------------------------------- 0.09s
2026-10-19T19:26:27.6732208Z vm : include_tasks ------------------------------------------------------ 0.09s
2026-10-19T19:26:27.6732491Z include_role : vm ------------------------------------------------------- 0.09s
2026-10-19T19:26:27.6732723Z vm : Set size ----------------------------------------------------------- 0.07s
2026-10-19T19:26:27.6732940Z vm : Sobrescrevendo groups vars ctc_nprd -------------------------------- 0.07s
2026-10-19T19:26:27.6733160Z vm : Recuperar variável de ambiente ------------------------------------- 0.07s
2026-10-19T19:26:27.6733314Z Playbook run took 0 days, 0 hours, 0 minutes, 36 seconds
2026-10-19T19:26:27.9035367Z 
2026-10-19T19:26:27.9035851Z {
2026-10-19T19:26:27.9035947Z     "_meta": {
2026-10-19T19:26:27.9036058Z         "hostvars": {}
2026-10-19T19:26:27.9036158Z     },
2026-10-19T19:26:27.9036251Z     "des": {
2026-10-19T19:26:27.9036352Z         "children": [
2026-10-19T19:26:27.9036460Z             "local"
2026-10-19T19:26:27.9036542Z         ],
2026-10-19T19:26:27.9036641Z         "vars": {}
2026-10-19T19:26:27.9036735Z     }
2026-10-19T19:26:27.9036821Z }
2026-10-19T19:26:27.9157529Z ##[error]Bash exited with code '1'.
2026-10-19T19:26:27.9188650Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
