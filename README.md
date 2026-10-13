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
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
AdapterGroupId
GitName
GitToken
GitUrl
GitUser
LockBranch
true
SonarProjectKey
SonarProjectName
system.debug
true
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
SIEXC-web-aplicacao-des (63)
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
SIEXC.SVRCONN
MQ_SIINT_HOSTNAME
10.192.224.66
MQ_SIINT_PORT
1420
MQ_SIINT_QUEUE_MANAGER
QSDA
MQ_SIINT_RESPOSTA_CHANNEL
SIEXC.SVRCONN
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
SIEXC.SVRCONN
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
NFS_ENDPOINT_ISILON_4
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC
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
NFS_MOUNT_POINT_ISILON_4
/SWIFT
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
DB_HOST
10.116.28.37
DB_HOST_ORA
jdbc:oracle:thin:@cnpexdadvm01-scan5.extra.caixa.gov.br:1521/ORAT71NG
DB_NAME
excdb001
DB_PASS
${VAULT::SIEXC_TQS::DB_PASS::1}
DB_PASS_ORA
${VAULT::SIEXC_TQS::DB_PASS_ORA::1}
DB_PORT
5204
DB_USER
${VAULT::SIEXC_TQS::DB_USER::1}
DB_USER_ORA
${VAULT::SIEXC_TQS::DB_USER_ORA::1}
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
MQ_NSGD_PASSWORD
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
SIEXC.SVRCONN
MQ_SIINT_HOSTNAME
10.192.224.66
MQ_SIINT_PORT
1420
MQ_SIINT_QUEUE_MANAGER
QSDA
MQ_SIINT_RESPOSTA_CHANNEL
SIEXC.SVRCONN
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
SIEXC.SVRCONN
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
NFS_MOUNT_POINT_ISILON
/integracoes/SIEXC
NFS_MOUNT_POINT_ISILON_2
/integracoes/SIISF
NFS_MOUNT_POINT_ISILON_3
/integracoes/SIAPC
SISTEMA_AMBIENTE
tqs
URL_GESTOR
https://siexc-web-aplicacao.esteiras.tqs.caixa/swifter-webapp
USER_ID
${VAULT::SIEXC_TQS::USER-ID::1}
USER_SECRET
${VAULT::SIEXC_TQS::SECRET::1}
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
|Manage variable groups
Expanded

Collapsed

559 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Expanded

Collapsed

Row 2

Row 3

Row 4

Row 3

Row 2

No pipelines match your search

Select a release pipeline to view its releases

No pipelines match your search

Select a release pipeline to view its releases

1 pipelines found

Row 2

Showing filters 1 through 2

# Variable 'modulo' was defined in the Variables tab
# Variable 'version.app' was defined in the Variables tab
# Variable Group 'BUILD_VARIABLES' was defined in the Variables tab
# Variable Group 'SONAR_VARIABLES - ESTEIRA' was defined in the Variables tab
# Variable Group 'SAST_FORTIFY_COMUNIDADE_MERCADO_CAPITAIS' was defined in the Variables tab
resources:
  repositories:
  - repository: self
    type: git
    ref: refs/heads/vm
jobs:
- job: Job_1
  displayName: Agent job 1
  pool:
    name: Build-Linux
  steps:
  - checkout: self
    clean: true
  - task: Bash@3
    displayName: Download binario
    inputs:
      targetType: inline
      script: >-
        url="http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/$(modulo)/$(version.app)/$(modulo)-$(version.app).ear"

        wget $url


        echo "Uploaded to NEXUS_INTERNO: $url"
  - task: CopyFiles@2
    displayName: 'Copy Files to: $(Build.SourcesDirectory)'
    inputs:
      TargetFolder: $(Build.SourcesDirectory)
  - task: Bash@3
    displayName: Recupera projeto
    inputs:
      targetType: inline
      script: >+
        #!/bin/bash


        cd $(Build.SourcesDirectory)



        echo "Entrando no diretório: $(Build.SourcesDirectory)"

        echo "Arquivos encontrados: `ls -la`"


        for extension in ear war jar

        do
            file=`find . -name "*.${extension}"`
        if [ -n "${file}" ]

        then
            PROJECT_FILE="${file}"
            p_extension="${extension}"
            break
        fi

        done


        echo "Encontrado o arquivo: $file\n"



        echo "##vso[task.setvariable variable=project.file;]${PROJECT_FILE}"


...
