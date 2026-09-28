
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]# sudo -u vcxservice touch /sipcs/vcx/teste_svc && sudo -u vcxproxyservice touch /sipcs/vcx/teste_proxy && ls -l /sipcs/vcx && rm -f /sipcs/vcx/teste_*
Creating home directory for vcxservice.
Creating home directory for vcxproxyservice.
total 48
-rw-r--r-- 1 vcxproxyservice vcxservice 0 set 28 14:32 teste_proxy
-rw-r--r-- 1 vcxservice      vcxservice 0 set 28 14:32 teste_svc
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#
[root@caddeapllx2462 p585600]#




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
SIPCS-vcx-visa-credito-NAO-EXECUTAR
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
SIPCS

SIPCS-vcx-visa-credito-NAO-EXECUTAR
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
ANSIBLE_JBOSS_VM_VERSION_3 (11)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes

Scopes: Release
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
SIPCS-vcx-visa-prerequisites-des (3)
Scopes: EC DES
INSTALL_JDK
Y
INSTALL_NODE
Y
INSTALL_POSTGRESQL
N
SIPCS-vcx-visa-installer-des (23)
Scopes: EC DES
ACCOUNT_UTILITY
2
ADMIN_MAIL
cesob272@caixa.gov.br
APPLICATION_KEY
5U26D-XYRT3-67EV0-056E8-A60A1-B2BF6
EMAIL_COMMUNICATION
Y
FIRST_NAME
vcx_credito
FOLDER_NAME_CERT
cert
HTTPS_CERTIFICATE
1
LAST_NAME
admin
PASSWORD_USER_VCX
********
POSTGRESQL_VCX_DATABASE
vcxdb001
POSTGRESQL_VCX_PASSWORD
********
POSTGRESQL_VCX_PORT
5116
POSTGRESQL_VCX_SCHEMA
public
POSTGRESQL_VCX_USER
svcxdb02
POSTGRESQ_VCX_HOST
sbrdedadlx0001.extra.caixa.gov.br
PROXY_SERVICE_PORT
3000
SERVICE_PORT
8000
SSL_TLS_MODE
disable
TWO_STEPS
Y
TYPE_INSTALL
install
VCX_BASE_PATH
Y
VCX_PROXY_SERVICE_USER
vcxproxyservice
VCX_SERVICE_USER
vcxservice
SIPCS-VCX-VISA-CREDITO-NFS-DES (2)
Scopes: EC DES
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIPCS
NFS_MOUNT_POINT_ISILON
/opt/app/vcx/datafiles
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
|Manage variable groups
Expanded

Collapsed

Collapsed

Row 2

[Variable group deleted]

List item selected

Row 2

List item selected

1 pipelines found

Row 2

Showing filters 1 through 2

679 pipelines found

Select a release pipeline to view its releases

85 pipelines found

Select a release pipeline to view its releases

85 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Row 2

Showing filters 1 through 2



ele ta na esteira. tem que fzaz algo aqui?

