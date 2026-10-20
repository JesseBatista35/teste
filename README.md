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
SIGSJ

SIGSJ-intranet
Predefined variables
Filter by keywords
Scope


CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
http_context_additional
s

http_context_default
sigsj
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
sigsj-intranet
SITE
ctc_nprd
SITE
ctc_npcn
SITE
dtc_pcn
tf_var_quant
1
tf_var_template_name
eap74-openjdk8-apache24-rhel93-v015
UNIDADE
BR
vm_destroy_before_create

vm_servers_recreate

Row 2

Row 4

Row 2

Select a release pipeline to view its releases

6 pipelines found

Row 3

Row 2

68 pipelines found

Select a release pipeline to view its releases

60 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Row 4

Showing filters 1 through 2






2026-10-19T21:24:06.4831307Z ##[section]Starting: Alterando Valores placeholders nos arquivos de config
2026-10-19T21:24:06.4834838Z ==============================================================================
2026-10-19T21:24:06.4834933Z Task         : Replace Tokens
2026-10-19T21:24:06.4834982Z Description  : Replace tokens in files
2026-10-19T21:24:06.4835045Z Version      : 3.3.1
2026-10-19T21:24:06.4835089Z Author       : Guillaume Rouchon
2026-10-19T21:24:06.4835378Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-10-19T21:24:06.4835477Z ==============================================================================
2026-10-19T21:24:06.6731129Z replacing tokens in: /opt/ads-agent/_work/r19317/a/_SIGSJ-intranet-config/jboss/standalone-full-ha.xml
2026-10-19T21:24:06.6936284Z replacing tokens in: /opt/ads-agent/_work/r19317/a/_SIGSJ-intranet-config/jboss/standalone.conf
2026-10-19T21:24:06.6945990Z ##[error]  variable not found: JVM_HEAP_MIN
2026-10-19T21:24:06.6948511Z ##[error]  variable not found: JVM_HEAP_MAX
2026-10-19T21:24:06.6950431Z ##[error]  variable not found: JVM_METASPACE_MIN
2026-10-19T21:24:06.6952217Z ##[error]  variable not found: JVM_METASPACE_MAX
2026-10-19T21:24:06.6954785Z ##[error]  variable not found: PASSWORD_TRUSTSTORE
2026-10-19T21:24:06.6957518Z ##[error]  variable not found: URL_APM_SERVER
2026-10-19T21:24:06.7388531Z ##[section]Finishing: Alterando Valores placeholders nos arquivos de config


agrao sao varaives que estao fantando


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
SIGSJ-intranet-12
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
SIGSJ-intranet-12
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
AZPAT
********
AZUSER
s736639
BT_API_URL
https://sicsn.caixa/BeyondTrust/api/public/v3
BT_SECRETS_PATH
********
FORTIFY_API
https://novocodigoseguro.caixa/ssc/api/v1
FORTIFY_APITOKEN
********
FORTIFY_PASS
********
FORTIFY_USER
admin
OKD_KAFKA
api.kafka-nprd.caixa:6443
OKD_TOKEN_KAFKA
********
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
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
Row 2

Row 4

Row 2

6 pipelines found

Row 3

Row 2

68 pipelines found

Select a release pipeline to view its releases

60 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Select a release pipeline to view its releases

6 pipelines found

Row 4

Showing filters 1 through 2

Row 2

Showing filters 1 through 2

