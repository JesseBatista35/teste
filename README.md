Analisar 

ERRO NO BUILD ESTEIRA SIEXC

Link esteira do SIEXC:
https://devops.caixa/projetos/Caixa/_git/SIEXC-web-aplicacao-config

Adicionei os endpoint e mount points dos NFS anexados à library de DES do SIEXC e o build falhou. Por favor realizar a montagem adequada e rodar o build com sucesso

Log do erro em anexo
Documento com instruções das montagens que foram adicionadas em anexo. Favor não remover nenhum ponto de montagem do SIEXC.

Link da release com erro:
https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=502739&environmentId=2335617&itemType=VariableGroups&_a=release-environment-logs


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
ANSIBLE_JBOSS_VM_VERSION_3 (7)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
Compartilhamentos (4)
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (15)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
SIEXC-web-aplicacao-des (27)

Scopes: EC DES
DB_HOST
10.116.92.41
DB_HOST_ORA
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/ORAD71NG
DB_NAME
excdb002
DB_PASS
pwsexcbd02
DB_PASS_ORA
pswexc01$
DB_PORT
5104
DB_USER
sexcbd02
DB_USER_ORA
SEXCBD01
JVM_HEAP_MAX
2548m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
1024m
JVM_METASPACE_MIN
256m
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC
NFS_ENDPOINT_ISILON_2
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF
NFS_ENDPOINT_ISILON_3
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC
NFS_ENDPOINT_ISILON_4
10.116.88.160:/export/sigdb/sicql
NFS_ENDPOINT_ISILON_5
10.116.88.160:/export/sigdb/sitec
NFS_ENDPOINT_ISILON_6
10.116.88.160:/export/sicql_bovespa
NFS_ENDPOINT_ISILON_7
10.116.88.160:/export/upload_prd
NFS_MOUNT_POINT_ISILON
/integracoes/SIEXC
NFS_MOUNT_POINT_ISILON_2
/integracoes/SIISF
NFS_MOUNT_POINT_ISILON_3
/integracoes/SIAPC
NFS_MOUNT_POINT_ISILON_4
/opt/sigdb
NFS_MOUNT_POINT_ISILON_5
/opt/sigdb/sitec
NFS_MOUNT_POINT_ISILON_6
/opt/jboss/bovespa
NFS_MOUNT_POINT_ISILON_7
/upload
URL_GESTOR
https://siexc-web-aplicacao.esteiras.des.caixa/swifter-webapp
SIEXC-web-aplicacao-tqs (19)
Scopes: EC TQS
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (15)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
Row 2. Clickable

Showing 5 filtered items.

Get started and run this pipeline for the first time!

1 pipelines found

Row 2

Row 2

Row 2

Showing filters 1 through 2




2026-07-20T14:31:12.6854144Z ##[debug]Evaluating condition for step: 'Deploy Config no JBOSS'
2026-07-20T14:31:12.6854574Z ##[debug]Evaluating: succeeded()
2026-07-20T14:31:12.6854729Z ##[debug]Evaluating succeeded:
2026-07-20T14:31:12.6854976Z ##[debug]=> True
2026-07-20T14:31:12.6855173Z ##[debug]Result: True
2026-07-20T14:31:12.6855376Z ##[section]Starting: Deploy Config no JBOSS
2026-07-20T14:31:12.6858338Z ==============================================================================
2026-07-20T14:31:12.6858419Z Task         : Bash
2026-07-20T14:31:12.6858463Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-20T14:31:12.6858525Z Version      : 3.227.0
2026-07-20T14:31:12.6858578Z Author       : Microsoft Corporation
2026-07-20T14:31:12.6858628Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-20T14:31:12.6858709Z ==============================================================================
2026-07-20T14:31:13.5768258Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-07-20T14:31:13.6493372Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-07-20T14:31:13.6500993Z ##[debug]loading inputs and endpoints
2026-07-20T14:31:13.6504228Z ##[debug]loading INPUT_TARGETTYPE
2026-07-20T14:31:13.6512148Z ##[debug]loading INPUT_FILEPATH
2026-07-20T14:31:13.6520316Z ##[debug]loading INPUT_SCRIPT
2026-07-20T14:31:13.6520767Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-07-20T14:31:13.6521081Z ##[debug]loading INPUT_FAILONSTDERR
2026-07-20T14:31:13.6521411Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-07-20T14:31:13.6521760Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-07-20T14:31:13.6522128Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-07-20T14:31:13.6523257Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-07-20T14:31:13.6524866Z ##[debug]loading SECRET_PW_ISILON
2026-07-20T14:31:13.6526333Z ##[debug]loading SECRET_FORTIFY_PASS
2026-07-20T14:31:13.6528195Z ##[debug]loading SECRET_TOKEN_CRQ
2026-07-20T14:31:13.6531057Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-07-20T14:31:13.6531570Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-07-20T14:31:13.6532338Z ##[debug]loading SECRET_PW_ALOCAIP
2026-07-20T14:31:13.6532964Z ##[debug]loading SECRET_AZPAT
2026-07-20T14:31:13.6533598Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-07-20T14:31:13.6534131Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-07-20T14:31:13.6534706Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-07-20T14:31:13.6535953Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-07-20T14:31:13.6536488Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-07-20T14:31:13.6537119Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-07-20T14:31:13.6538326Z ##[debug]loaded 22
2026-07-20T14:31:13.6542942Z ##[debug]Agent.ProxyUrl=undefined
2026-07-20T14:31:13.6543199Z ##[debug]Agent.CAInfo=undefined
2026-07-20T14:31:13.6543427Z ##[debug]Agent.ClientCert=undefined
2026-07-20T14:31:13.6543747Z ##[debug]Agent.SkipCertValidation=True
2026-07-20T14:31:13.6559182Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-20T14:31:13.6561237Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-07-20T14:31:13.6561526Z ##[debug]system.culture=en-US
2026-07-20T14:31:13.6570735Z ##[debug]failOnStderr=false
2026-07-20T14:31:13.6581018Z ##[debug]workingDirectory=/opt/ads-agent/_work/r12350/a
2026-07-20T14:31:13.6581315Z ##[debug]check path : /opt/ads-agent/_work/r12350/a
2026-07-20T14:31:13.6581554Z ##[debug]targetType=inline
2026-07-20T14:31:13.6581791Z ##[debug]bashEnvValue=undefined
2026-07-20T14:31:13.6582468Z ##[debug]script=REPO=$(echo _SIEXC-web-aplicacao | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/site.yml --tags git_conf -e sistema_ambiente=des -e sistema_nome=siexc-web-aplicacao -e default_working_directory_tfs=/opt/ads-agent/_work/r12350/a -e build_repository_name_tfs=$REPO -e quantidade_vm=$(quantidade_vm) -e package_path=/opt/ads-agent/_work/r12350/a/binario/`basename http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.10/siexc-web-aplicacao-1.1.10.ear` -e use_wmq=$(USE_WMQ) -e jks_file=/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks -e site=ctc_nprd -e url_deploy="`echo "http://binario.caixa:8081/repository/thirdparty/br/com/caixa/siexc/siexc-web-aplicacao/1.1.10/siexc-web-aplicacao-1.1.10.ear" | tr -d "\'"`"
2026-07-20T14:31:13.6583255Z Generating script.
2026-07-20T14:31:13.6584260Z ##[debug]which 'bash'
2026-07-20T14:31:13.6590247Z ##[debug]found: '/bin/bash'
2026-07-20T14:31:13.6591000Z ##[debug]Agent.Version=3.225.2
2026-07-20T14:31:13.6591456Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-07-20T14:31:13.6591723Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-07-20T14:31:13.6593347Z ========================== Starting Command Output ===========================
2026-07-20T14:31:13.6594425Z ##[debug]which '/bin/bash'
2026-07-20T14:31:13.6595082Z ##[debug]found: '/bin/bash'
2026-07-20T14:31:13.6595837Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/9acea63b-7d57-4c17-aece-912515928933.sh
2026-07-20T14:31:13.6598384Z ##[debug]exec tool: /bin/bash
2026-07-20T14:31:13.6598606Z ##[debug]arguments:
2026-07-20T14:31:13.6598860Z ##[debug]   /opt/ads-agent/_work/_temp/9acea63b-7d57-4c17-aece-912515928933.sh
2026-07-20T14:31:13.6600766Z [command]/bin/bash /opt/ads-agent/_work/_temp/9acea63b-7d57-4c17-aece-912515928933.sh
2026-07-20T14:31:13.6689023Z /opt/ads-agent/_work/_temp/9acea63b-7d57-4c17-aece-912515928933.sh: line 2: quantidade_vm: comando não encontrado
2026-07-20T14:31:13.6704138Z /opt/ads-agent/_work/_temp/9acea63b-7d57-4c17-aece-912515928933.sh: line 2: USE_WMQ: comando não encontrado
2026-07-20T14:31:15.9037755Z 
2026-07-20T14:31:15.9038363Z PLAY [local] *******************************************************************
2026-07-20T14:31:15.9338659Z 
2026-07-20T14:31:15.9339258Z PLAY [Configurando o DNS] ******************************************************
2026-07-20T14:31:16.1312287Z 
2026-07-20T14:31:16.1312793Z PLAY [local] *******************************************************************
2026-07-20T14:31:16.1347712Z 
2026-07-20T14:31:16.1348266Z PLAY [Verificando serviços] ****************************************************
2026-07-20T14:31:16.1432113Z 
2026-07-20T14:31:16.1433126Z PLAY [Configuração LDAP] *******************************************************
2026-07-20T14:31:16.1463667Z [WARNING]: Found variable using reserved name: when
2026-07-20T14:31:16.1470154Z 
2026-07-20T14:31:16.1470309Z PLAY [jboss] *******************************************************************
2026-07-20T14:31:16.1564303Z 
2026-07-20T14:31:16.1564888Z PLAY [Stack Jboss] *************************************************************
2026-07-20T14:31:16.1831967Z Monday 20 July 2026  11:31:16 -0300 (0:00:00.348)       0:00:00.348 *********** 
2026-07-20T14:31:16.6989634Z 
2026-07-20T14:31:16.6990711Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-07-20T14:31:16.6990953Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T14:31:16.6991323Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-07-20T14:31:16.6991642Z caddeapllx2193.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-07-20T14:31:16.6991830Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-07-20T14:31:16.6992009Z releases. A future Ansible release will default to using the discovered 
2026-07-20T14:31:16.6992171Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-07-20T14:31:16.6992334Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-07-20T14:31:16.6992493Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-07-20T14:31:16.6992640Z setting deprecation_warnings=False in ansible.cfg.
2026-07-20T14:31:16.7000327Z 
2026-07-20T14:31:16.7000496Z PLAY [jboss] *******************************************************************
2026-07-20T14:31:16.7076240Z Monday 20 July 2026  11:31:16 -0300 (0:00:00.524)       0:00:00.873 *********** 
2026-07-20T14:31:17.0738697Z 
2026-07-20T14:31:17.0739329Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-07-20T14:31:17.0739497Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T14:31:17.0781694Z Monday 20 July 2026  11:31:17 -0300 (0:00:00.370)       0:00:01.243 *********** 
2026-07-20T14:31:17.1271658Z included: /opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2193.agil.nprd.caixa.gov.br
2026-07-20T14:31:17.1323671Z Monday 20 July 2026  11:31:17 -0300 (0:00:00.053)       0:00:01.297 *********** 
2026-07-20T14:31:17.1916276Z 
2026-07-20T14:31:17.1917258Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-20T14:31:17.1917470Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T14:31:17.1970854Z Monday 20 July 2026  11:31:17 -0300 (0:00:00.064)       0:00:01.362 *********** 
2026-07-20T14:31:17.6672281Z 
2026-07-20T14:31:17.6672935Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-07-20T14:31:17.6673127Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T14:31:17.6711947Z Monday 20 July 2026  11:31:17 -0300 (0:00:00.474)       0:00:01.836 *********** 
2026-07-20T14:31:17.7301529Z 
2026-07-20T14:31:17.7302472Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-07-20T14:31:17.7306165Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br] => {
2026-07-20T14:31:17.7306307Z     "nfs_vars_json": {
2026-07-20T14:31:17.7306434Z         "changed": false, 
2026-07-20T14:31:17.7306758Z         "cmd": "cat /opt/ads-agent/_work/r12350/a/nfs_config.json", 
2026-07-20T14:31:17.7306912Z         "delta": "0:00:00.006320", 
2026-07-20T14:31:17.7307089Z         "end": "2026-07-20 11:31:17.649840", 
2026-07-20T14:31:17.7307209Z         "failed": false, 
2026-07-20T14:31:17.7307310Z         "rc": 0, 
2026-07-20T14:31:17.7307516Z         "start": "2026-07-20 11:31:17.643520", 
2026-07-20T14:31:17.7307668Z         "stderr": "", 
2026-07-20T14:31:17.7307784Z         "stderr_lines": [], 
2026-07-20T14:31:17.7308291Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_5\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_ISILON_5\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_ISILON_4\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_ISILON_4\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON_7\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT_ISILON_7\": \"/upload\"},{\"NFS_ENDPOINT_ISILON_6\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_ISILON_6\": \"/opt/jboss/bovespa\"}]", 
2026-07-20T14:31:17.7309082Z         "stdout_lines": [
2026-07-20T14:31:17.7309664Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_5\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_ISILON_5\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_ISILON_4\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_ISILON_4\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON_7\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT_ISILON_7\": \"/upload\"},{\"NFS_ENDPOINT_ISILON_6\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_ISILON_6\": \"/opt/jboss/bovespa\"}]"
2026-07-20T14:31:17.7310224Z         ]
2026-07-20T14:31:17.7310319Z     }
2026-07-20T14:31:17.7310403Z }
2026-07-20T14:31:17.7342745Z Monday 20 July 2026  11:31:17 -0300 (0:00:00.063)       0:00:01.899 *********** 
2026-07-20T14:31:17.7956120Z 
2026-07-20T14:31:17.7956869Z TASK [nfs : Criar variáveis] ***************************************************
2026-07-20T14:31:17.7957119Z ok: [caddeapllx2193.agil.nprd.caixa.gov.br]
2026-07-20T14:31:17.8008309Z Monday 20 July 2026  11:31:17 -0300 (0:00:00.066)       0:00:01.966 *********** 
2026-07-20T14:31:23.9203126Z 
2026-07-20T14:31:23.9203921Z TASK [nfs : execute montagem script] *******************************************
2026-07-20T14:31:23.9213258Z fatal: [caddeapllx2193.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", "montagem", "siexc-web-aplicacao", "des", "ctc_nprd", "/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2", "C&t@d02", "***", "s736651@corp.caixa.gov.br", "***", "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\",\"NFS_MOUNT_POINT_ISILON\": \"/integracoes/SIEXC\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\",\"NFS_MOUNT_POINT_ISILON_3\": \"/integracoes/SIAPC\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_2\": \"/integracoes/SIISF\"},{\"NFS_ENDPOINT_ISILON_5\": \"10.116.88.160:/export/sigdb/sitec\",\"NFS_MOUNT_POINT_ISILON_5\": \"/opt/sigdb/sitec\"},{\"NFS_ENDPOINT_ISILON_4\": \"10.116.88.160:/export/sigdb/sicql\",\"NFS_MOUNT_POINT_ISILON_4\": \"/opt/sigdb\"},{\"NFS_ENDPOINT_ISILON_7\": \"10.116.88.160:/export/upload_prd\",\"NFS_MOUNT_POINT_ISILON_7\": \"/upload\"},{\"NFS_ENDPOINT_ISILON_6\": \"10.116.88.160:/export/sicql_bovespa\",\"NFS_MOUNT_POINT_ISILON_6\": \"/opt/jboss/bovespa\"}]"], "delta": "0:00:05.762951", "end": "2026-07-20 11:31:23.902406", "msg": "non-zero return code", "rc": 1, "start": "2026-07-20 11:31:18.139455", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 465, in <module>\n    mount(nfs_endpoints,nfs_mount_points)\n  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 328, in mount\n    configuracao_nfs, nfs_id = getConfiguracao(zona, endpoint)\n  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 384, in getConfiguracao\n    nfs_export_id = getExportId(zone,path)\n  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 381, in getExportId\n    return api_response_id.exports[0].id\nIndexError: list index out of range", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 465, in <module>", "    mount(nfs_endpoints,nfs_mount_points)", "  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 328, in mount", "    configuracao_nfs, nfs_id = getConfiguracao(zona, endpoint)", "  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 384, in getConfiguracao", "    nfs_export_id = getExportId(zone,path)", "  File \"/opt/ads-agent/_work/r12350/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 381, in getExportId", "    return api_response_id.exports[0].id", "IndexError: list index out of range"], "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_ISILON_5': u'10.116.88.160:/export/sigdb/sitec', u'NFS_MOUNT_POINT_ISILON_5': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_ISILON_4': u'10.116.88.160:/export/sigdb/sicql', u'NFS_MOUNT_POINT_ISILON_4': u'/opt/sigdb'}, {u'NFS_ENDPOINT_ISILON_7': u'10.116.88.160:/export/upload_prd', u'NFS_MOUNT_POINT_ISILON_7': u'/upload'}, {u'NFS_ENDPOINT_ISILON_6': u'10.116.88.160:/export/sicql_bovespa', u'NFS_MOUNT_POINT_ISILON_6': u'/opt/jboss/bovespa'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIAPC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/integracoes/SIAPC\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIAPC                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/upload\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIISF                  ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfs_path=/integracoes/SIISF\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIISF                  ISILON                              nfsctcnprd.ctc.caixa                des                                \n10.116.88.160                       /export/sigdb/sicql                 /integracoes/SIEXC                  ISILON                              10.116.88.160                       des                                ", "stdout_lines": ["[{u'NFS_MOUNT_POINT_ISILON': u'/integracoes/SIEXC', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/integracoes/SIAPC', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/integracoes/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_ENDPOINT_ISILON_5': u'10.116.88.160:/export/sigdb/sitec', u'NFS_MOUNT_POINT_ISILON_5': u'/opt/sigdb/sitec'}, {u'NFS_ENDPOINT_ISILON_4': u'10.116.88.160:/export/sigdb/sicql', u'NFS_MOUNT_POINT_ISILON_4': u'/opt/sigdb'}, {u'NFS_ENDPOINT_ISILON_7': u'10.116.88.160:/export/upload_prd', u'NFS_MOUNT_POINT_ISILON_7': u'/upload'}, {u'NFS_ENDPOINT_ISILON_6': u'10.116.88.160:/export/sicql_bovespa', u'NFS_MOUNT_POINT_ISILON_6': u'/opt/jboss/bovespa'}]", "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIAPC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/integracoes/SIAPC", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC /integracoes/SIAPC                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/upload", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /upload                             ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIISF                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "nfs_path=/integracoes/SIISF", "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC", "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIAPC /integracoes/SIISF                  ISILON                              nfsctcnprd.ctc.caixa                des                                ", "10.116.88.160                       /export/sigdb/sicql                 /integracoes/SIEXC                  ISILON                              10.116.88.160                       des                                "]}
2026-07-20T14:31:23.9217228Z 
2026-07-20T14:31:23.9217392Z PLAY RECAP *********************************************************************
2026-07-20T14:31:23.9217577Z caddeapllx2193.agil.nprd.caixa.gov.br : ok=7    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-07-20T14:31:23.9217668Z 
2026-07-20T14:31:23.9217895Z Monday 20 July 2026  11:31:23 -0300 (0:00:06.120)       0:00:08.086 *********** 
2026-07-20T14:31:23.9218070Z =============================================================================== 
2026-07-20T14:31:23.9218295Z nfs : execute montagem script ------------------------------------------- 6.12s
2026-07-20T14:31:23.9218579Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.52s
2026-07-20T14:31:23.9218888Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.47s
2026-07-20T14:31:23.9219731Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.37s
2026-07-20T14:31:23.9219963Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-07-20T14:31:23.9220180Z nfs : Criar variáveis --------------------------------------------------- 0.06s
2026-07-20T14:31:23.9220402Z nfs : Exibir resultado em JSON ------------------------------------------ 0.06s
2026-07-20T14:31:23.9220624Z nfs : include_tasks ----------------------------------------------------- 0.05s
2026-07-20T14:31:23.9220777Z Playbook run took 0 days, 0 hours, 0 minutes, 8 seconds
2026-07-20T14:31:23.9804264Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-07-20T14:31:23.9809884Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-07-20T14:31:23.9851529Z ##[error]Bash exited with code '2'.
2026-07-20T14:31:23.9852046Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-07-20T14:31:23.9852480Z ##[debug]task result: Failed
2026-07-20T14:31:23.9853656Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-07-20T14:31:23.9854625Z ##[section]Finishing: Deploy Config no JBOSS



Warning: Permanently added '10.116.199.181' (ED25519) to the list of known hosts.
p585600@10.116.199.181's password:
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$ ps -ef | grep jboss
root      578967       1  0 jul16 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao -c standalone-full-ha.xml
jboss     578970  578967  0 jul16 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao -c standalone-full-ha.xml
jboss     579200  578970  0 jul16 ?        00:54:59 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms4G -Xmx4G -XX:MetaspaceSize=512M -XX:MaxMetaspaceSize=1G -Djava.net.preferIPv4Stack=true -Duser.language=pt -Duser.country=BR -Duser.timezone=GMT -Dsinqia.azure.tenantId=Teste_tenantId -Dsinqia.azure.clientId=Teste_clientId -Dsinqia.azure.clientSecret=Teste_clientSecret -Dsinqia.azure.redirectUriSignIn=Teste_redirectUriSignIn -Dsinqia.azure.authorityUrl=Teste_authorityUrl -Dsinqia.azure.proxyUrl=Teste_proxyUrl -Dsinqia.azure.proxyPort=Teste_proxyPort -Dsinqia.azure.scope=openid,profile,email,offline_access -Xms4G -Xmx4G -XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=1G -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Dcom.ibm.msg.client.commonservices.log.outputName=/opt/jboss-eap/standalone/log/mqjms.log -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siexc-web-aplicacao -c standalone-full-ha.xml
p585600   663521  663492  0 14:25 pts/0    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$


