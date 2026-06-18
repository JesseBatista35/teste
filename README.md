2026-06-18T12:14:21.9813877Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-18T12:14:21.9817433Z ==============================================================================
2026-06-18T12:14:21.9817528Z Task         : Bash
2026-06-18T12:14:21.9817578Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-18T12:14:21.9817645Z Version      : 3.227.0
2026-06-18T12:14:21.9817704Z Author       : Microsoft Corporation
2026-06-18T12:14:21.9817759Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-18T12:14:21.9817833Z ==============================================================================
2026-06-18T12:14:22.1427494Z Generating script.
2026-06-18T12:14:22.1439152Z ========================== Starting Command Output ===========================
2026-06-18T12:14:22.1446411Z [command]/bin/bash /opt/ads-agent/_work/_temp/1b478625-f4cd-4d18-9ed7-d4a646e76573.sh
2026-06-18T12:14:22.1530381Z /opt/ads-agent/_work/_temp/1b478625-f4cd-4d18-9ed7-d4a646e76573.sh: line 4: tf_var_quant: comando não encontrado
2026-06-18T12:14:23.7688583Z 
2026-06-18T12:14:23.7689679Z PLAY [local] *******************************************************************
2026-06-18T12:14:23.7874228Z Thursday 18 June 2026  09:14:23 -0300 (0:00:00.021)       0:00:00.021 ********* 
2026-06-18T12:14:25.9792263Z 
2026-06-18T12:14:25.9793235Z TASK [Gathering Facts] *********************************************************
2026-06-18T12:14:25.9794662Z fatal: [127.0.0.1]: FAILED! => {"ansible_facts": {}, "changed": false, "failed_modules": {"ansible.legacy.setup": {"ansible_facts": {"discovered_interpreter_python": "/usr/bin/python"}, "failed": true, "module_stderr": "\nPresumimos que você recebeu as instruções de sempre do administrador\nde sistema local. Basicamente, resume-se a estas três coisas:\n\n    #1) Respeite a privacidade dos outros.\n    #2) Pense antes de digitar.\n    #3) Com grandes poderes vêm grandes responsabilidades.\n\nsudo: nenhum tty presente e nenhum programa de askpass especificado\n", "module_stdout": "", "msg": "MODULE FAILURE\nSee stdout/stderr for the exact error", "rc": 1}}, "msg": "The following modules failed to execute: ansible.legacy.setup\n"}
2026-06-18T12:14:25.9800341Z 
2026-06-18T12:14:25.9800891Z PLAY RECAP *********************************************************************
2026-06-18T12:14:25.9801157Z 127.0.0.1                  : ok=0    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-06-18T12:14:25.9801248Z 
2026-06-18T12:14:25.9801372Z Playbook run took 0 days, 0 hours, 0 minutes, 2 seconds
2026-06-18T12:14:25.9801720Z Thursday 18 June 2026  09:14:25 -0300 (0:00:02.192)       0:00:02.213 ********* 
2026-06-18T12:14:25.9801909Z =============================================================================== 
2026-06-18T12:14:25.9802151Z Gathering Facts --------------------------------------------------------- 2.19s
2026-06-18T12:14:26.1905178Z 
2026-06-18T12:14:26.1905855Z {
2026-06-18T12:14:26.1906026Z     "_meta": {
2026-06-18T12:14:26.1906163Z         "hostvars": {
2026-06-18T12:14:26.1906306Z             "caddeapllx2598.agil.nprd.caixa.gov.br": {
2026-06-18T12:14:26.1906487Z                 "ambiente": "tqs",
2026-06-18T12:14:26.1906621Z                 "ansible_host": "10.116.201.157",
2026-06-18T12:14:26.1907001Z                 "cluster": null,
2026-06-18T12:14:26.1907268Z                 "cluster_principal": null,
2026-06-18T12:14:26.1907449Z                 "cluster_terraform": null,
2026-06-18T12:14:26.1907627Z                 "cpu": 2,
2026-06-18T12:14:26.1907810Z                 "datacenter": null,
2026-06-18T12:14:26.1907985Z                 "datastore": null,
2026-06-18T12:14:26.1908158Z                 "detalhe_imagem": null,
2026-06-18T12:14:26.1908322Z                 "disco_log": 2,
2026-06-18T12:14:26.1908501Z                 "disco_opt": 10,
2026-06-18T12:14:26.1908673Z                 "domain": null,
2026-06-18T12:14:26.1908803Z                 "esx_network": null,
2026-06-18T12:14:26.1908930Z                 "esx_network_bck": null,
2026-06-18T12:14:26.1909328Z                 "esx_vcenter_server": null,
2026-06-18T12:14:26.1909455Z                 "farm": null,
2026-06-18T12:14:26.1909571Z                 "id": 13421,
2026-06-18T12:14:26.1909906Z                 "inclusao": "2026-06-17 15:35:38",
2026-06-18T12:14:26.1910045Z                 "info_framework": null,
2026-06-18T12:14:26.1910163Z                 "info_linguagem": null,
2026-06-18T12:14:26.1910289Z                 "info_tecnologia": null,
2026-06-18T12:14:26.1910411Z                 "info_versao": null,
2026-06-18T12:14:26.1910530Z                 "ipbackup": "",
2026-06-18T12:14:26.1910657Z                 "jboss_apache_status": "ativado",
2026-06-18T12:14:26.1910786Z                 "memoria": 4,
2026-06-18T12:14:26.1910900Z                 "net_adapter_type": null,
2026-06-18T12:14:26.1911027Z                 "nome_imagem": null,
2026-06-18T12:14:26.1911220Z                 "objeto_origem": "ECAPT-BANCARIO_TQS_SERVIDOR",
2026-06-18T12:14:26.1911362Z                 "plataforma": "vm",
2026-06-18T12:14:26.1911488Z                 "produto": "jboss",
2026-06-18T12:14:26.1911600Z                 "recursos_max_id": null,
2026-06-18T12:14:26.1911775Z                 "sistema": "ecapt-bancario",
2026-06-18T12:14:26.1911903Z                 "site": "ctc_nprd",
2026-06-18T12:14:26.1912026Z                 "solicitacoes_id": null,
2026-06-18T12:14:26.1912149Z                 "status": "ativado",
2026-06-18T12:14:26.1912262Z                 "terraform": true,
2026-06-18T12:14:26.1912384Z                 "versao_imagem": null,
2026-06-18T12:14:26.1912510Z                 "versao_plataforma": "7.1",
2026-06-18T12:14:26.1912632Z                 "vm_dns": null,
2026-06-18T12:14:26.1912752Z                 "vm_ipnetmask": null,
2026-06-18T12:14:26.1912869Z                 "vm_ipnetmask_bck": null,
2026-06-18T12:14:26.1912994Z                 "vsphere_folder": null,
2026-06-18T12:14:26.1913115Z                 "vsphere_pool": null
2026-06-18T12:14:26.1913302Z             }
2026-06-18T12:14:26.1913410Z         }
2026-06-18T12:14:26.1913518Z     },
2026-06-18T12:14:26.1913670Z     "ctc_nprd": {
2026-06-18T12:14:26.1913788Z         "children": [
2026-06-18T12:14:26.1913901Z             "jboss"
2026-06-18T12:14:26.1913999Z         ],
2026-06-18T12:14:26.1914106Z         "vars": {}
2026-06-18T12:14:26.1914223Z     },
2026-06-18T12:14:26.1914329Z     "jboss": {
2026-06-18T12:14:26.1914442Z         "hosts": [
2026-06-18T12:14:26.1914560Z             "caddeapllx2598.agil.nprd.caixa.gov.br"
2026-06-18T12:14:26.1914684Z         ],
2026-06-18T12:14:26.1914792Z         "vars": {}
2026-06-18T12:14:26.1914895Z     },
2026-06-18T12:14:26.1914999Z     "local": {
2026-06-18T12:14:26.1915098Z         "hosts": [
2026-06-18T12:14:26.1915206Z             "127.0.0.1"
2026-06-18T12:14:26.1915790Z         ],
2026-06-18T12:14:26.1915957Z         "vars": {
2026-06-18T12:14:26.1916086Z             "ansible_connection": "local"
2026-06-18T12:14:26.1916197Z         }
2026-06-18T12:14:26.1916316Z     },
2026-06-18T12:14:26.1916482Z     "tqs": {
2026-06-18T12:14:26.1916651Z         "children": [
2026-06-18T12:14:26.1916815Z             "local",
2026-06-18T12:14:26.1917060Z             "ctc_nprd"
2026-06-18T12:14:26.1917177Z         ],
2026-06-18T12:14:26.1917288Z         "vars": {}
2026-06-18T12:14:26.1917393Z     }
2026-06-18T12:14:26.1917485Z }
2026-06-18T12:14:26.2083543Z ##[error]Bash exited with code '1'.
2026-06-18T12:14:26.2087259Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)


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
ECAPT-bancario
/
ECAPT-bancario-32
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
ECAPT-bancario

ECAPT-bancario-32


EC TQS

Failed

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

CGC_UNIDADE_DES
7366
CGC_UNIDADE_OPS
7259
http_context_additional
http_context_default
ecapt
http_sso
no
produto_nome_vm
Jboss
produto_versao_vm
8.0
sistema_ambiente
tqs
sistema_nome
ecapt-bancario
SITE
ctc_nprd
tf_var_template_name
eap80-openjdk17-apache24-rhel93-v006
UNIDADE
URL_CUSTOMIZADA
apt-bancario.tqs.caixa
url_deploy
http://binario.caixa:8081/repository/thirdparty/br/gov/caixa/ecapt/$(version_app)/ecapt-$(version_app).war
version_app
1.0.0.1
vm_destroy_before_create
true
vm_servers_recreate
Showing filters 1 through 2


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
ECAPT-bancario
/
ECAPT-bancario-32
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
ECAPT-bancario

ECAPT-bancario-32


EC TQS

Failed


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Usuario-Azure-DevOps (10)
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
TERRAFORM-ESTEIRA-NPRD (15)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
ECAPT-BANCARIO-DES (16)
Scopes: EC DES
ECAPT-BANCARIO-TQS (16)
Scopes: EC TQS
ECAPT-BANCARIO-HMP (16)
Scopes: EC HMP
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (15)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
Showing filters 1 through 2

Expanded

Collapsed
