2026-11-06T13:44:17.3408387Z ##[section]Starting: Alterando Valores placeholders nos arquivos de config
2026-11-06T13:44:17.3412833Z ==============================================================================
2026-11-06T13:44:17.3413005Z Task         : Replace Tokens
2026-11-06T13:44:17.3413051Z Description  : Replace tokens in files
2026-11-06T13:44:17.3413114Z Version      : 3.3.1
2026-11-06T13:44:17.3413154Z Author       : Guillaume Rouchon
2026-11-06T13:44:17.3413206Z Help         : v3.3.1 - [More Information](https://github.com/qetza/vsts-replacetokens-task#readme)
2026-11-06T13:44:17.3413295Z ==============================================================================
2026-11-06T13:44:17.9889747Z replacing tokens in: /opt/ads-agent/_work/r12572/a/_SIGSJ-boleto-config/jboss/standalone-full-ha.xml
2026-11-06T13:44:18.0145489Z replacing tokens in: /opt/ads-agent/_work/r12572/a/_SIGSJ-boleto-config/httpd/httpd.conf
2026-11-06T13:44:18.0152609Z replacing tokens in: /opt/ads-agent/_work/r12572/a/_SIGSJ-boleto-config/httpd/vhost.conf
2026-11-06T13:44:18.0158499Z replacing tokens in: /opt/ads-agent/_work/r12572/a/_SIGSJ-boleto-config/jboss/standalone.conf
2026-11-06T13:44:18.0188075Z ##[error]  variable not found: JVM_HEAP_MIN
2026-11-06T13:44:18.0190484Z ##[error]  variable not found: JVM_HEAP_MAX
2026-11-06T13:44:18.0192228Z ##[error]  variable not found: JVM_METASPACE_MIN
2026-11-06T13:44:18.0193845Z ##[error]  variable not found: JVM_METASPACE_MAX
2026-11-06T13:44:18.0195883Z ##[error]  variable not found: PASSWORD_TRUSTSTORE
2026-11-06T13:44:18.0198439Z ##[error]  variable not found: URL_APM_SERVER
2026-11-06T13:44:18.0693215Z ##[section]Finishing: Alterando Valores placeholders nos arquivos de config



Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGSJ-boleto
Search








All pipelines

SIGSJ

SIGSJ-boleto
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
ANSIBLE_JBOSS_VM_VERSION_3 (11)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
SIGSJ-BOLETO-DES (9)
Grupo de variáveis de SIGSJ-BOLETO-DES
Scopes: EC DES
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
PASSWORD_TRUSTSTORE
changeit
URL_APM_SERVER
https://sigsj-frontend-des.apps.nprd.caixa/
sistema_nome
sigsj-boleto
SIGSJ-BOLETO-TQS (1)
Grupo de variáveis de SIGSJ-BOLETO-TQS
Scopes: EC TQS
INIT
Criado via api
SIGSJ-BOLETO-HMP (1)
Grupo de variáveis de SIGSJ-BOLETO-HMP
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
14
TERRAFORM_VSPHERE_FOLDER
/vm
TERRAFORM_VSPHERE_POOL
/Resources/RP_ESTEIRAS_AGEIS_NPCN_CTC_V7
SIGSJ-BOLETO-PRD (1)
Grupo de variáveis de SIGSJ-BOLETO-PRD
Scopes: EC PRD CTC,EC PRD DTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
Expanded

Collapsed

Expanded

Row 3

Collapsed

Row 2

2 pipelines found

Row 3

Row 2

Showing filters 1 through 2

70 pipelines found

Select a release pipeline to view its releases

62 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2




ta sem as varaiveis ali qual que devo colocar copiar igual DES
