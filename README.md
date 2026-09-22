umount /SWIFT
mount -a
mount | grep SWIFT

NFS_ENDPOINT_ISILON = /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
NFS_MOUNT_POINT_ISILON = /SWIFT


SIEXC-web-aplicacao-config



é nessa library aqui né 


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
SIEXC-web-aplicacao
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
SIEXC

SIEXC-web-aplicacao
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
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
Compartilhamentos (4)
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
SIEXC-web-aplicacao-des (61)

Scopes: EC DES
DB_HOST
10.116.92.41
DB_HOST_ORA
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/ORAD71NG
DB_NAME
excdb002
DB_PASS
${VAULT::SIEXC-web-aplicacao-des::DB_PASS::1}
DB_PASS_ORA
${VAULT::SIEXC-web-aplicacao-des::DB_PASS_ORA::1}
DB_PORT
5104
DB_USER
${VAULT::SIEXC-web-aplicacao-des::DB_USER::1}
DB_USER_ORA
${VAULT::SIEXC-web-aplicacao-des::DB_USER_ORA::1}
JVM_HEAP_MAX
2548m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
1024m
JVM_METASPACE_MIN
256m
MQ_CONNECTION_FACTORY_POOL_CHANNEL
BRD1.SVRCONN
MQ_CONNECTION_FACTORY_POOL_HOSTNAME
10.192.228.145
MQ_CONNECTION_FACTORY_POOL_PORT
1414
MQ_CONNECTION_FACTORY_POOL_QUEUE_MANAGER
BRD1
MQ_CONNECTION_FACTORY_POOL_USERNAME
SEXCS01D
MQ_NSGD_CHANNEL
SIEXC.SRVCONN
MQ_NSGD_HOSTNAME
10.192.224.63
MQ_NSGD_PASSWORD
undefined
MQ_NSGD_PORT
1420
MQ_NSGD_QUEUE_MANAGER
QSQA
MQ_NSGD_USERNAME
SEXCMQQ1
MQ_SICLI_CHANNEL
SIEXC.SVRCONN
MQ_SICLI_HOSTNAME
10.192.224.66
MQ_SICLI_PORT
1420
MQ_SICLI_QUEUE_MANAGER
QSDA
MQ_SICLI_USERNAME
SEXCS01D
MQ_SIINT_CHANNEL
SIEXC.SRVCONN
MQ_SIINT_HOSTNAME
10.192.224.66
MQ_SIINT_PORT
1420
MQ_SIINT_QUEUE_MANAGER
QSDA
MQ_SIINT_RESPOSTA_CHANNEL
SIEXC.SRVCONN
MQ_SIINT_RESPOSTA_HOSTNAME
10.192.224.66
MQ_SIINT_RESPOSTA_PORT
1420
MQ_SIINT_RESPOSTA_QUEUE_MANAGER
QSDA
MQ_SIINT_RESPOSTA_USERNAME
SEXCS01D
MQ_SIINT_USERNAME
SEXCS01D
MQ_SIRIC_CHANNEL
SIEXC.SRVCONN
MQ_SIRIC_HOSTNAME
10.192.224.66
MQ_SIRIC_PORT
1420
MQ_SIRIC_QUEUE_MANAGER
QSDA
MQ_SIRIC_USERNAME
SEXCS01D
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC
NFS_ENDPOINT_ISILON_2
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF
NFS_ENDPOINT_ISILON_3
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC
NFS_ENDPOINT_VM
192.168.227.59:/export/sigdb/sicql
NFS_ENDPOINT_VM_2
192.168.227.59:/export/sigdb/sitec
NFS_ENDPOINT_VM_3
192.168.227.59:/export/sicql_bovespa
NFS_ENDPOINT_VM_4
192.168.227.59:/export/upload_prd
NFS_MOUNT_POINT_ISILON
/integracoes/SIEXC
NFS_MOUNT_POINT_ISILON_2
/integracoes/SIISF
NFS_MOUNT_POINT_ISILON_3
/integracoes/SIAPC
NFS_MOUNT_POINT_VM
/opt/sigdb
NFS_MOUNT_POINT_VM_2
/opt/sigdb/sitec
NFS_MOUNT_POINT_VM_3
/opt/jboss/bovespa
NFS_MOUNT_POINT_VM_4
/upload
SISTEMA_AMBIENTE
des
URL_GESTOR
https://siexc-web-aplicacao.esteiras.des.caixa/swifter-webapp
USER_ID
${VAULT::SIEXC-web-aplicacao-des::USER-ID::1}
USER_SECRET
${VAULT::SIEXC-web-aplicacao-des::SECRET::1}
SIEXC-web-aplicacao-tqs (53)
Scopes: EC TQS
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (17)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2

