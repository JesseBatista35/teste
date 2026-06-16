esse step é o mesmo que quebra e ´passou usando a mesma branch e isso foi a 5 dias atrás.

olhei a master nao teve alteração nesses dias:



Skip to main content
Azure DevOps
projetos
/
Infraestrutura
/
Repos
/
Files
/

esteira-jboss-vm-v2
Search


Infraestrutura

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
esteira-jboss-vm-v2

group_vars
inventory
library
roles
validadores
.gitignore
.vault.sh
ansible.cfg
hsi.yml
LICENSE
README.md
requirements.txt
restart_jboss.yml
secure-files.yml
site.yml
stack_apache.yml
stack_batch.yml
stack_controlm.yml
stack_custom.yml
stack_deployments_custom.yml
stack_disable_unit_jboss.yml
stack_hosts.yml
stack_jboss_handlers.yml
stack_jboss.yml
stack_ldap.yml
stack_modules_custom.yml
stack_monitoracao.yml
stack_tsm.yml
stack_vm.yml
stop_jboss.yml
summary.j2

master

/
stack_vm.yml
stack_vm.yml

Edit

Contents
History
Compare
Blame


You updated fix/teste-cesti Just now
Create a pull request

Updated stack_vm.yml
5399aa1b
Jailson Martins Alves
6 de dez. de 2024 at 12:57
edit
72292
Updated stack_vm.yml
3bc42edb
Jailson Martins Alves
6 de dez. de 2024 at 12:44
edit
72292
succeeded
Updated stack_vm.yml
9cdd75af
Jailson Martins Alves
22 de nov. de 2024 at 11:25
edit
71078
Updated stack_vm.yml
a2fa311d
Jailson Martins Alves
22 de nov. de 2024 at 11:12
edit
71078
succeeded
Updated stack_vm.yml
96c1657a
Jailson Martins Alves
22 de nov. de 2024 at 11:04
edit
71078
failed
Updated stack_vm.yml
36611f83
Jailson Martins Alves
22 de nov. de 2024 at 11:02
edit
71078
failed
Updated stack_vm.yml
d143c42c
Jailson Martins Alves
22 de nov. de 2024 at 11:00
edit
71078
Updated stack_vm.yml
d254a48a
Jailson Martins Alves
22 de nov. de 2024 at 10:12
edit
71078
Updated stack_vm.yml
c0942cdb
Jailson Martins Alves
21 de nov. de 2024 at 15:28
edit
71078
failed
Updated stack_vm.yml
519f4865
Jailson Martins Alves
21 de nov. de 2024 at 15:21
edit
71078
Ajuste para verificar se DNS já foi criado
1ea4c005
Rafael Soares
21 de mai. de 2024 at 10:30
edit
51814
succeeded
Padronização do código fonte
cbc30d02
Rafael Augusto Soares
27 de set. de 2023 at 10:42
edit
33593
failed
Padronização do código fonte
15b6987e
Rafael Augusto Soares
27 de set. de 2023 at 10:36
edit
33593
succeeded
Cannot edit in read-only editor
Finished loading items

Finished loading items

Collapsed

Showing 43 items.

Finished loading items

Expanded

Collapsed

Showing 43 items.

Finished loading items

Expanded

Collapsed

Showing 43 items.

Finished loading items

Expanded

Collapsed



2026-06-11T15:09:27.2759867Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-11T15:09:27.2763273Z ==============================================================================
2026-06-11T15:09:27.2763358Z Task         : Bash
2026-06-11T15:09:27.2763403Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-11T15:09:27.2763480Z Version      : 3.227.0
2026-06-11T15:09:27.2763525Z Author       : Microsoft Corporation
2026-06-11T15:09:27.2763576Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-11T15:09:27.2763662Z ==============================================================================
2026-06-11T15:09:28.1999792Z Generating script.
2026-06-11T15:09:28.2013244Z ========================== Starting Command Output ===========================
2026-06-11T15:09:28.2023651Z [command]/bin/bash /opt/ads-agent/_work/_temp/b36942aa-e746-4aaf-a681-74e3564cb9ad.sh
2026-06-11T15:09:30.3467481Z 
2026-06-11T15:09:30.3479268Z PLAY [local] *******************************************************************
2026-06-11T15:09:30.3727327Z Thursday 11 June 2026  12:09:30 -0300 (0:00:00.089)       0:00:00.089 ********* 
2026-06-11T15:09:58.1154251Z 
2026-06-11T15:09:58.1154902Z TASK [Gathering Facts] *********************************************************
2026-06-11T15:09:58.1160835Z ok: [127.0.0.1]
2026-06-11T15:09:58.1468989Z Thursday 11 June 2026  12:09:58 -0300 (0:00:27.774)       0:00:27.863 ********* 
2026-06-11T15:09:58.2316412Z Thursday 11 June 2026  12:09:58 -0300 (0:00:00.084)       0:00:27.948 ********* 
2026-06-11T15:09:58.3120020Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r14102/a
2026-06-11T15:09:58.3120375Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-06-11T15:09:58.3120552Z duplicate dict key (include_tasks). Using last defined value only.
2026-06-11T15:09:58.3233438Z included: /opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-06-11T15:09:58.3496049Z Thursday 11 June 2026  12:09:58 -0300 (0:00:00.118)       0:00:28.066 ********* 
2026-06-11T15:09:58.4228173Z 
2026-06-11T15:09:58.4229557Z TASK [vm : Cria variável build_repository_name] ********************************
2026-06-11T15:09:58.4229806Z ok: [127.0.0.1]
2026-06-11T15:09:58.4459508Z Thursday 11 June 2026  12:09:58 -0300 (0:00:00.096)       0:00:28.163 ********* 
2026-06-11T15:09:59.3259077Z 
2026-06-11T15:09:59.3259844Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-06-11T15:09:59.3260008Z ok: [127.0.0.1]
2026-06-11T15:09:59.3477556Z Thursday 11 June 2026  12:09:59 -0300 (0:00:00.901)       0:00:29.064 ********* 
2026-06-11T15:10:06.9309296Z 
2026-06-11T15:10:06.9310270Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-06-11T15:10:06.9310540Z changed: [127.0.0.1]
2026-06-11T15:10:06.9550677Z Thursday 11 June 2026  12:10:06 -0300 (0:00:07.607)       0:00:36.672 ********* 
2026-06-11T15:10:07.0291057Z 
2026-06-11T15:10:07.0291742Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-06-11T15:10:07.0291928Z ok: [127.0.0.1] => {
2026-06-11T15:10:07.0294153Z     "msg": [
2026-06-11T15:10:07.0294563Z         "Iniciando registro do template VMTX...", 
2026-06-11T15:10:07.0294920Z         "vCenter: 10.122.144.195", 
2026-06-11T15:10:07.0295244Z         "Template: eap74-openjdk8-apache24-rhel79-v018", 
2026-06-11T15:10:07.0296422Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] eap74-openjdk8-apache24-rhel79-v018/eap74-openjdk8-apache24-rhel79-v018.vmtx", 
2026-06-11T15:10:07.0297008Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-06-11T15:10:07.0297357Z         "Template 'eap74-openjdk8-apache24-rhel79-v018' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-06-11T15:10:07.0297529Z         "Operacao concluida com sucesso."
2026-06-11T15:10:07.0297654Z     ]
2026-06-11T15:10:07.0300780Z }
2026-06-11T15:10:07.0537017Z Thursday 11 June 2026  12:10:07 -0300 (0:00:00.098)       0:00:36.770 ********* 
2026-06-11T15:10:07.1259001Z 
2026-06-11T15:10:07.1259739Z TASK [vm : Cria variável ansible] **********************************************
2026-06-11T15:10:07.1259901Z ok: [127.0.0.1]
2026-06-11T15:10:07.1501213Z Thursday 11 June 2026  12:10:07 -0300 (0:00:00.096)       0:00:36.867 ********* 
2026-06-11T15:10:07.6534980Z 
2026-06-11T15:10:07.6535556Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-11T15:10:07.6535718Z ok: [127.0.0.1]
2026-06-11T15:10:07.6756355Z Thursday 11 June 2026  12:10:07 -0300 (0:00:00.525)       0:00:37.392 ********* 
2026-06-11T15:10:08.0137046Z 
2026-06-11T15:10:08.0138528Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-11T15:10:08.0138816Z ok: [127.0.0.1]
2026-06-11T15:10:08.0378264Z Thursday 11 June 2026  12:10:08 -0300 (0:00:00.362)       0:00:37.754 ********* 
2026-06-11T15:10:08.1124009Z Thursday 11 June 2026  12:10:08 -0300 (0:00:00.074)       0:00:37.829 ********* 
2026-06-11T15:10:08.2016202Z Thursday 11 June 2026  12:10:08 -0300 (0:00:00.089)       0:00:37.918 ********* 
2026-06-11T15:10:08.2488165Z 
2026-06-11T15:10:08.2488801Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-06-11T15:10:08.2490396Z ok: [127.0.0.1]
2026-06-11T15:10:08.2721332Z Thursday 11 June 2026  12:10:08 -0300 (0:00:00.070)       0:00:37.989 ********* 
2026-06-11T15:10:08.3478683Z included: /opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-06-11T15:10:08.3771169Z Thursday 11 June 2026  12:10:08 -0300 (0:00:00.104)       0:00:38.094 ********* 
2026-06-11T15:10:08.4410193Z included: /opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-06-11T15:10:08.4726898Z Thursday 11 June 2026  12:10:08 -0300 (0:00:00.095)       0:00:38.189 ********* 
2026-06-11T15:10:09.1292952Z 
2026-06-11T15:10:09.1293421Z TASK [vm : Consultar API] ******************************************************
2026-06-11T15:10:09.1293884Z ok: [127.0.0.1]
2026-06-11T15:10:09.1660248Z Thursday 11 June 2026  12:10:09 -0300 (0:00:00.693)       0:00:38.883 ********* 
2026-06-11T15:10:09.2224458Z 
2026-06-11T15:10:09.2224981Z TASK [vm : Parse JSON] *********************************************************
2026-06-11T15:10:09.2225116Z ok: [127.0.0.1]
2026-06-11T15:10:09.2463598Z Thursday 11 June 2026  12:10:09 -0300 (0:00:00.080)       0:00:38.963 ********* 
2026-06-11T15:10:09.3141094Z included: /opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-06-11T15:10:09.3473527Z Thursday 11 June 2026  12:10:09 -0300 (0:00:00.100)       0:00:39.064 ********* 
2026-06-11T15:10:09.8466707Z 
2026-06-11T15:10:09.8467231Z TASK [vm : Consultar API] ******************************************************
2026-06-11T15:10:09.8467681Z ok: [127.0.0.1]
2026-06-11T15:10:09.8715441Z Thursday 11 June 2026  12:10:09 -0300 (0:00:00.524)       0:00:39.588 ********* 
2026-06-11T15:10:09.9188602Z 
2026-06-11T15:10:09.9189574Z TASK [vm : Parse JSON] *********************************************************
2026-06-11T15:10:09.9189771Z ok: [127.0.0.1]
2026-06-11T15:10:09.9432639Z Thursday 11 June 2026  12:10:09 -0300 (0:00:00.071)       0:00:39.660 ********* 
2026-06-11T15:10:10.0085969Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.065)       0:00:39.725 ********* 
2026-06-11T15:10:10.0554445Z 
2026-06-11T15:10:10.0555434Z TASK [vm : Exibir size servidores.] ********************************************
2026-06-11T15:10:10.0559491Z ok: [127.0.0.1] => {
2026-06-11T15:10:10.0559831Z     "api_data.dados.0": {
2026-06-11T15:10:10.0560342Z         "ambiente": "des", 
2026-06-11T15:10:10.0560520Z         "cluster": "CTC_NPRDXF2488HV7_NPRD", 
2026-06-11T15:10:10.0562112Z         "cluster_principal": "", 
2026-06-11T15:10:10.0563253Z         "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD", 
2026-06-11T15:10:10.0565232Z         "cpu": 2, 
2026-06-11T15:10:10.0567170Z         "datacenter": "NPRD", 
2026-06-11T15:10:10.0569241Z         "datastore": "CTCHWNPRDPC03_0047", 
2026-06-11T15:10:10.0572263Z         "detalhe_imagem": "{\"filebeat\":\"filebeat-7.7.0-x86_64\",\"java\":\"java-1.8.0-openjdk-headless-1.8.0.262.b10-1.el7.x86_64\",\"apache_exporter\":\"apache_exporter-terraform\",\"rhel_satellite_media\":\"InstallMedia-rhel-server-7.9-x86_64\",\"zabbix_agent\":\"zabbix-agent-4.2.1-1.el7.x86_64\",\"jboss\":\"jboss-eap-7.4.8-terraform.tar\",\"node_exporter\":\"node_exporter-1.3.1.linux-amd64.tar\",\"metricbeat\":\"metricbeat-8.2.2-x86_64\",\"htop\":\"htop-2.2.0-3.el7.x86_64\",\"jbcs_httpd\":\"jbcs-httpd24-httpd-2.4.37-SP6-RHEL7-x86_64.tar\",\"jmx_exporter\":\"jmx_exporter-terraform\",\"jboss_keycloack_addons\":\"add-ons-3.4.3\",\"jboss_db2_module\":\"db2jcc4_module\"}", 
2026-06-11T15:10:10.0573488Z         "disco_log": 2, 
2026-06-11T15:10:10.0573748Z         "disco_opt": 10, 
2026-06-11T15:10:10.0574024Z         "domain": "agil.nprd.caixa.gov.br", 
2026-06-11T15:10:10.0574415Z         "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0", 
2026-06-11T15:10:10.0574772Z         "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep", 
2026-06-11T15:10:10.0575054Z         "esx_vcenter_server": "10.122.144.195", 
2026-06-11T15:10:10.0575316Z         "farm": null, 
2026-06-11T15:10:10.0575564Z         "id": 3542, 
2026-06-11T15:10:10.0575895Z         "inclusao": "2023-04-18 15:01:21", 
2026-06-11T15:10:10.0576167Z         "info_framework": null, 
2026-06-11T15:10:10.0576426Z         "info_linguagem": null, 
2026-06-11T15:10:10.0576673Z         "info_tecnologia": null, 
2026-06-11T15:10:10.0576979Z         "info_versao": null, 
2026-06-11T15:10:10.0577193Z         "ipbackup": "192.168.224.148", 
2026-06-11T15:10:10.0577333Z         "jboss_apache_status": "ativado", 
2026-06-11T15:10:10.0577462Z         "memoria": 4, 
2026-06-11T15:10:10.0577627Z         "net_adapter_type": "vmxnet3", 
2026-06-11T15:10:10.0578120Z         "nome_imagem": "eap74-openjdk8-apache24-rhel79-v018", 
2026-06-11T15:10:10.0578268Z         "objeto_origem": "SISME_DES_SERVIDOR", 
2026-06-11T15:10:10.0578475Z         "plataforma": "vm", 
2026-06-11T15:10:10.0578591Z         "produto": "jboss", 
2026-06-11T15:10:10.0578703Z         "recursos_max_id": null, 
2026-06-11T15:10:10.0578816Z         "servidores_json": [
2026-06-11T15:10:10.0582191Z             {
2026-06-11T15:10:10.0582558Z                 "ip": "10.116.196.184", 
2026-06-11T15:10:10.0582709Z                 "nome": "caddeapllx1441.agil.nprd.caixa.gov.br"
2026-06-11T15:10:10.0582890Z             }
2026-06-11T15:10:10.0582994Z         ], 
2026-06-11T15:10:10.0583194Z         "sistema": "sisme", 
2026-06-11T15:10:10.0583335Z         "site": "ctc_nprd", 
2026-06-11T15:10:10.0583443Z         "solicitacoes_id": 2220, 
2026-06-11T15:10:10.0583556Z         "status": "ativado", 
2026-06-11T15:10:10.0583667Z         "terraform": true, 
2026-06-11T15:10:10.0583786Z         "versao_imagem": "018", 
2026-06-11T15:10:10.0583902Z         "versao_plataforma": "7.1", 
2026-06-11T15:10:10.0584013Z         "vm_dns": [
2026-06-11T15:10:10.0584120Z             "10.116.193.77", 
2026-06-11T15:10:10.0584227Z             "10.116.193.78"
2026-06-11T15:10:10.0584318Z         ], 
2026-06-11T15:10:10.0584420Z         "vm_ipnetmask": 19, 
2026-06-11T15:10:10.0584531Z         "vm_ipnetmask_bck": 19, 
2026-06-11T15:10:10.0584642Z         "vsphere_folder": "/vm", 
2026-06-11T15:10:10.0584766Z         "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-06-11T15:10:10.0584878Z     }
2026-06-11T15:10:10.0584969Z }
2026-06-11T15:10:10.0804330Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.071)       0:00:39.797 ********* 
2026-06-11T15:10:10.1528929Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.072)       0:00:39.869 ********* 
2026-06-11T15:10:10.2041214Z 
2026-06-11T15:10:10.2042082Z TASK [vm : Set size] ***********************************************************
2026-06-11T15:10:10.2042474Z ok: [127.0.0.1]
2026-06-11T15:10:10.2297650Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.076)       0:00:39.946 ********* 
2026-06-11T15:10:10.2769226Z 
2026-06-11T15:10:10.2770700Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-06-11T15:10:10.2771342Z ok: [127.0.0.1]
2026-06-11T15:10:10.3012192Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.071)       0:00:40.018 ********* 
2026-06-11T15:10:10.3444652Z 
2026-06-11T15:10:10.3445567Z TASK [vm : debug] **************************************************************
2026-06-11T15:10:10.3445803Z ok: [127.0.0.1] => {
2026-06-11T15:10:10.3446128Z     "template_name": "eap74-openjdk8-apache24-rhel79-v018"
2026-06-11T15:10:10.3446262Z }
2026-06-11T15:10:10.3680115Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.066)       0:00:40.084 ********* 
2026-06-11T15:10:10.4123870Z 
2026-06-11T15:10:10.4124982Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-06-11T15:10:10.4125259Z ok: [127.0.0.1]
2026-06-11T15:10:10.4361968Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.068)       0:00:40.153 ********* 
2026-06-11T15:10:10.5019918Z Thursday 11 June 2026  12:10:10 -0300 (0:00:00.065)       0:00:40.218 ********* 
2026-06-11T15:10:10.9896797Z 
2026-06-11T15:10:10.9897585Z TASK [vm : Run Invetory All] ***************************************************
2026-06-11T15:10:10.9897974Z changed: [127.0.0.1]
2026-06-11T15:10:11.0164091Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.514)       0:00:40.733 ********* 
2026-06-11T15:10:11.0631169Z 
2026-06-11T15:10:11.0631957Z TASK [vm : Parse JSON output] **************************************************
2026-06-11T15:10:11.0632375Z ok: [127.0.0.1]
2026-06-11T15:10:11.0877857Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.071)       0:00:40.804 ********* 
2026-06-11T15:10:11.1409855Z 
2026-06-11T15:10:11.1410864Z TASK [vm : Count the number of hosts] ******************************************
2026-06-11T15:10:11.1411095Z ok: [127.0.0.1]
2026-06-11T15:10:11.1640491Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.076)       0:00:40.881 ********* 
2026-06-11T15:10:11.2337399Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.069)       0:00:40.950 ********* 
2026-06-11T15:10:11.2996261Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.065)       0:00:41.016 ********* 
2026-06-11T15:10:11.3428222Z 
2026-06-11T15:10:11.3429418Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-06-11T15:10:11.3429648Z ok: [127.0.0.1] => {
2026-06-11T15:10:11.3429760Z     "msg": [
2026-06-11T15:10:11.3429866Z         "num_hosts: 1"
2026-06-11T15:10:11.3429972Z     ]
2026-06-11T15:10:11.3432670Z }
2026-06-11T15:10:11.3662029Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.066)       0:00:41.083 ********* 
2026-06-11T15:10:11.4328172Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.066)       0:00:41.149 ********* 
2026-06-11T15:10:11.5032817Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.070)       0:00:41.220 ********* 
2026-06-11T15:10:11.5669812Z included: /opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-06-11T15:10:11.6123004Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.108)       0:00:41.329 ********* 
2026-06-11T15:10:11.6785783Z included: /opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-06-11T15:10:11.7043697Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.092)       0:00:41.421 ********* 
2026-06-11T15:10:11.7540781Z 
2026-06-11T15:10:11.7541946Z TASK [vm : Criar variáveis] ****************************************************
2026-06-11T15:10:11.7542420Z ok: [127.0.0.1]
2026-06-11T15:10:11.8287409Z Thursday 11 June 2026  12:10:11 -0300 (0:00:00.124)       0:00:41.545 ********* 
2026-06-11T15:10:12.1613083Z 
2026-06-11T15:10:12.1613908Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-06-11T15:10:12.1614882Z ok: [127.0.0.1]
2026-06-11T15:10:12.2010557Z Thursday 11 June 2026  12:10:12 -0300 (0:00:00.372)       0:00:41.918 ********* 
2026-06-11T15:10:12.2470661Z 
2026-06-11T15:10:12.2471343Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-06-11T15:10:12.2474266Z ok: [127.0.0.1] => {
2026-06-11T15:10:12.2475068Z     "nfs_vars_json": {
2026-06-11T15:10:12.2475229Z         "changed": false, 
2026-06-11T15:10:12.2475561Z         "cmd": "cat /opt/ads-agent/_work/r14102/a/nfs_config.json", 
2026-06-11T15:10:12.2475725Z         "delta": "0:00:00.006150", 
2026-06-11T15:10:12.2475903Z         "end": "2026-06-11 12:10:12.141269", 
2026-06-11T15:10:12.2476024Z         "failed": false, 
2026-06-11T15:10:12.2476142Z         "rc": 0, 
2026-06-11T15:10:12.2476321Z         "start": "2026-06-11 12:10:12.135119", 
2026-06-11T15:10:12.2476446Z         "stderr": "", 
2026-06-11T15:10:12.2476553Z         "stderr_lines": [], 
2026-06-11T15:10:12.2476792Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME\",\"NFS_MOUNT_POINT_ISILON\": \"/SISME\"},{\"NFS_ENDPOINT_ISILON_1\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_1\": \"/NFS/PARCEIROS/SISME\"}]", 
2026-06-11T15:10:12.2477057Z         "stdout_lines": [
2026-06-11T15:10:12.2477283Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME\",\"NFS_MOUNT_POINT_ISILON\": \"/SISME\"},{\"NFS_ENDPOINT_ISILON_1\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_1\": \"/NFS/PARCEIROS/SISME\"}]"
2026-06-11T15:10:12.2477493Z         ]
2026-06-11T15:10:12.2477583Z     }
2026-06-11T15:10:12.2477673Z }
2026-06-11T15:10:12.2726827Z Thursday 11 June 2026  12:10:12 -0300 (0:00:00.071)       0:00:41.989 ********* 
2026-06-11T15:10:12.3219840Z 
2026-06-11T15:10:12.3220988Z TASK [vm : Criar variáveis] ****************************************************
2026-06-11T15:10:12.3221192Z ok: [127.0.0.1]
2026-06-11T15:10:12.3456984Z Thursday 11 June 2026  12:10:12 -0300 (0:00:00.073)       0:00:42.062 ********* 
2026-06-11T15:10:13.0744684Z 
2026-06-11T15:10:13.0745666Z TASK [vm : execute create_ip_bck script] ***************************************
2026-06-11T15:10:13.0745914Z changed: [127.0.0.1]
2026-06-11T15:10:13.0977837Z Thursday 11 June 2026  12:10:13 -0300 (0:00:00.752)       0:00:42.814 ********* 
2026-06-11T15:10:13.1470656Z 
2026-06-11T15:10:13.1471535Z TASK [vm : ansible.builtin.debug] **********************************************
2026-06-11T15:10:13.1471777Z ok: [127.0.0.1] => {
2026-06-11T15:10:13.1471890Z     "changed": false, 
2026-06-11T15:10:13.1471998Z     "msg": {
2026-06-11T15:10:13.1472127Z         "changed": true, 
2026-06-11T15:10:13.1472233Z         "cmd": [
2026-06-11T15:10:13.1472334Z             "python", 
2026-06-11T15:10:13.1472742Z             "/opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-06-11T15:10:13.1472950Z             "create_ip_bck", 
2026-06-11T15:10:13.1474588Z             "sisme", 
2026-06-11T15:10:13.1475080Z             "des", 
2026-06-11T15:10:13.1475228Z             "ctc_nprd", 
2026-06-11T15:10:13.1475499Z             "/opt/ads-agent/_work/r14102/a/esteira-jboss-vm-v2", 
2026-06-11T15:10:13.1475667Z             "C&t@d02", 
2026-06-11T15:10:13.1475846Z             "***", 
2026-06-11T15:10:13.1475963Z             "s736651@corp.caixa.gov.br", 
2026-06-11T15:10:13.1476117Z             "***", 
2026-06-11T15:10:13.1476353Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME\",\"NFS_MOUNT_POINT_ISILON\": \"/SISME\"},{\"NFS_ENDPOINT_ISILON_1\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON_1\": \"/NFS/PARCEIROS/SISME\"}]"
2026-06-11T15:10:13.1476631Z         ], 
2026-06-11T15:10:13.1476760Z         "delta": "0:00:00.397235", 
2026-06-11T15:10:13.1476948Z         "end": "2026-06-11 12:10:13.052431", 
2026-06-11T15:10:13.1477076Z         "failed": false, 
2026-06-11T15:10:13.1477193Z         "rc": 0, 
2026-06-11T15:10:13.1477368Z         "start": "2026-06-11 12:10:12.655196", 
2026-06-11T15:10:13.1477493Z         "stderr": "", 
2026-06-11T15:10:13.1477856Z         "stderr_lines": [], 
2026-06-11T15:10:13.1479098Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SISME', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME'}, {u'NFS_ENDPOINT_ISILON_1': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW', u'NFS_MOUNT_POINT_ISILON_1': u'/NFS/PARCEIROS/SISME'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME /SISME                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /NFS/PARCEIROS/SISME                ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-06-11T15:10:13.1479611Z         "stdout_lines": [
2026-06-11T15:10:13.1480034Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SISME', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME'}, {u'NFS_ENDPOINT_ISILON_1': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW', u'NFS_MOUNT_POINT_ISILON_1': u'/NFS/PARCEIROS/SISME'}]", 
2026-06-11T15:10:13.1480349Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-06-11T15:10:13.1480810Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-06-11T15:10:13.1481058Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME /SISME                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-06-11T15:10:13.1481270Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /NFS/PARCEIROS/SISME                ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-06-11T15:10:13.1481422Z         ]
2026-06-11T15:10:13.1481519Z     }
2026-06-11T15:10:13.1481613Z }
2026-06-11T15:10:13.1707203Z Thursday 11 June 2026  12:10:13 -0300 (0:00:00.072)       0:00:42.887 ********* 
2026-06-11T15:10:13.6608813Z 
2026-06-11T15:10:13.6609616Z TASK [vm : Run Invetory All] ***************************************************
2026-06-11T15:10:13.6610296Z changed: [127.0.0.1]
2026-06-11T15:10:13.6849269Z Thursday 11 June 2026  12:10:13 -0300 (0:00:00.514)       0:00:43.401 ********* 
2026-06-11T15:10:13.7303488Z 
2026-06-11T15:10:13.7304378Z TASK [vm : Parse JSON output] **************************************************
2026-06-11T15:10:13.7304608Z ok: [127.0.0.1]
2026-06-11T15:10:13.7546723Z Thursday 11 June 2026  12:10:13 -0300 (0:00:00.069)       0:00:43.471 ********* 
2026-06-11T15:10:13.8009593Z 
2026-06-11T15:10:13.8010053Z TASK [vm : Debug parsed_output] ************************************************
2026-06-11T15:10:13.8015955Z ok: [127.0.0.1] => {
2026-06-11T15:10:13.8016111Z     "msg": [
2026-06-11T15:10:13.8016276Z         {
2026-06-11T15:10:13.8016453Z             "_meta": {
2026-06-11T15:10:13.8016578Z                 "hostvars": {
2026-06-11T15:10:13.8016757Z                     "caddeapllx1441.agil.nprd.caixa.gov.br": {
2026-06-11T15:10:13.8016894Z                         "ambiente": "des", 
2026-06-11T15:10:13.8017017Z                         "ansible_host": "10.116.196.184", 
2026-06-11T15:10:13.8017433Z                         "cluster": "CTC_NPRDXF2488HV7_NPRD", 
2026-06-11T15:10:13.8017564Z                         "cluster_principal": "", 
2026-06-11T15:10:13.8017700Z                         "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD", 
2026-06-11T15:10:13.8017828Z                         "cpu": 2, 
2026-06-11T15:10:13.8018006Z                         "datacenter": "NPRD", 
2026-06-11T15:10:13.8018142Z                         "datastore": "CTCHWNPRDPC03_0047", 
2026-06-11T15:10:13.8020469Z                         "detalhe_imagem": "{\"filebeat\":\"filebeat-7.7.0-x86_64\",\"java\":\"java-1.8.0-openjdk-headless-1.8.0.262.b10-1.el7.x86_64\",\"apache_exporter\":\"apache_exporter-terraform\",\"rhel_satellite_media\":\"InstallMedia-rhel-server-7.9-x86_64\",\"zabbix_agent\":\"zabbix-agent-4.2.1-1.el7.x86_64\",\"jboss\":\"jboss-eap-7.4.8-terraform.tar\",\"node_exporter\":\"node_exporter-1.3.1.linux-amd64.tar\",\"metricbeat\":\"metricbeat-8.2.2-x86_64\",\"htop\":\"htop-2.2.0-3.el7.x86_64\",\"jbcs_httpd\":\"jbcs-httpd24-httpd-2.4.37-SP6-RHEL7-x86_64.tar\",\"jmx_exporter\":\"jmx_exporter-terraform\",\"jboss_keycloack_addons\":\"add-ons-3.4.3\",\"jboss_db2_module\":\"db2jcc4_module\"}", 
2026-06-11T15:10:13.8021241Z                         "disco_log": 2, 
2026-06-11T15:10:13.8021347Z                         "disco_opt": 10, 
2026-06-11T15:10:13.8021470Z                         "domain": "agil.nprd.caixa.gov.br", 
2026-06-11T15:10:13.8021707Z                         "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0", 
2026-06-11T15:10:13.8021925Z                         "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep", 
2026-06-11T15:10:13.8022064Z                         "esx_vcenter_server": "10.122.144.195", 
2026-06-11T15:10:13.8022186Z                         "farm": null, 
2026-06-11T15:10:13.8022417Z                         "id": 3542, 
2026-06-11T15:10:13.8022619Z                         "inclusao": "2023-04-18 15:01:21", 
2026-06-11T15:10:13.8022756Z                         "info_framework": null, 
2026-06-11T15:10:13.8022873Z                         "info_linguagem": null, 
2026-06-11T15:10:13.8022991Z                         "info_tecnologia": null, 
2026-06-11T15:10:13.8023112Z                         "info_versao": null, 
2026-06-11T15:10:13.8023230Z                         "ipbackup": "192.168.224.148", 
2026-06-11T15:10:13.8023358Z                         "jboss_apache_status": "ativado", 
2026-06-11T15:10:13.8023477Z                         "memoria": 4, 
2026-06-11T15:10:13.8023583Z                         "net_adapter_type": "vmxnet3", 
2026-06-11T15:10:13.8023783Z                         "nome_imagem": "eap74-openjdk8-apache24-rhel79-v018", 
2026-06-11T15:10:13.8023925Z                         "objeto_origem": "SISME_DES_SERVIDOR", 
2026-06-11T15:10:13.8024049Z                         "plataforma": "vm", 
2026-06-11T15:10:13.8024162Z                         "produto": "jboss", 
2026-06-11T15:10:13.8024278Z                         "recursos_max_id": null, 
2026-06-11T15:10:13.8024391Z                         "sistema": "sisme", 
2026-06-11T15:10:13.8024502Z                         "site": "ctc_nprd", 
2026-06-11T15:10:13.8024614Z                         "solicitacoes_id": 2220, 
2026-06-11T15:10:13.8024728Z                         "status": "ativado", 
2026-06-11T15:10:13.8024838Z                         "terraform": true, 
2026-06-11T15:10:13.8024954Z                         "versao_imagem": "018", 
2026-06-11T15:10:13.8025070Z                         "versao_plataforma": "7.1", 
2026-06-11T15:10:13.8025181Z                         "vm_dns": [
2026-06-11T15:10:13.8025276Z                             "10.116.193.77", 
2026-06-11T15:10:13.8025384Z                             "10.116.193.78"
2026-06-11T15:10:13.8025485Z                         ], 
2026-06-11T15:10:13.8025592Z                         "vm_ipnetmask": 19, 
2026-06-11T15:10:13.8025708Z                         "vm_ipnetmask_bck": 19, 
2026-06-11T15:10:13.8025822Z                         "vsphere_folder": "/vm", 
2026-06-11T15:10:13.8026015Z                         "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-06-11T15:10:13.8026129Z                     }
2026-06-11T15:10:13.8026221Z                 }
2026-06-11T15:10:13.8026314Z             }, 
2026-06-11T15:10:13.8026413Z             "ctc_nprd": {
2026-06-11T15:10:13.8026519Z                 "children": [
2026-06-11T15:10:13.8026613Z                     "jboss"
2026-06-11T15:10:13.8026711Z                 ], 
2026-06-11T15:10:13.8026808Z                 "vars": {}
2026-06-11T15:10:13.8026901Z             }, 
2026-06-11T15:10:13.8026997Z             "des": {
2026-06-11T15:10:13.8027173Z                 "children": [
2026-06-11T15:10:13.8027283Z                     "local", 
2026-06-11T15:10:13.8027381Z                     "ctc_nprd"
2026-06-11T15:10:13.8027481Z                 ], 
2026-06-11T15:10:13.8027577Z                 "vars": {}
2026-06-11T15:10:13.8027672Z             }, 
2026-06-11T15:10:13.8027759Z             "jboss": {
2026-06-11T15:10:13.8027861Z                 "hosts": [
2026-06-11T15:10:13.8027980Z                     "caddeapllx1441.agil.nprd.caixa.gov.br"
2026-06-11T15:10:13.8028092Z                 ], 
2026-06-11T15:10:13.8028185Z                 "vars": {}
2026-06-11T15:10:13.8028278Z             }, 
2026-06-11T15:10:13.8028578Z             "local": {
2026-06-11T15:10:13.8028735Z                 "hosts": [
2026-06-11T15:10:13.8028898Z                     "127.0.0.1"
2026-06-11T15:10:13.8029033Z                 ], 
2026-06-11T15:10:13.8029132Z                 "vars": {
2026-06-11T15:10:13.8029242Z                     "ansible_connection": "local"
2026-06-11T15:10:13.8029339Z                 }
2026-06-11T15:10:13.8029433Z             }
2026-06-11T15:10:13.8029523Z         }
2026-06-11T15:10:13.8029613Z     ]
2026-06-11T15:10:13.8029771Z }
2026-06-11T15:10:13.8250912Z Thursday 11 June 2026  12:10:13 -0300 (0:00:00.070)       0:00:43.542 ********* 
2026-06-11T15:10:13.8723469Z 
2026-06-11T15:10:13.8724538Z TASK [vm : Verificando os ambientes] *******************************************
2026-06-11T15:10:13.8724769Z ok: [127.0.0.1] => {
2026-06-11T15:10:13.8725428Z     "msg": [
2026-06-11T15:10:13.8725601Z         "Ambiente existentes! Servidores: caddeapllx1441.agil.nprd.caixa.gov.br"
2026-06-11T15:10:13.8725734Z     ]
2026-06-11T15:10:13.8725850Z }
2026-06-11T15:10:13.8961308Z Thursday 11 June 2026  12:10:13 -0300 (0:00:00.071)       0:00:43.613 ********* 
2026-06-11T15:10:13.9729337Z 
2026-06-11T15:10:13.9730240Z TASK [vm : Recuperar ip] *******************************************************
2026-06-11T15:10:13.9730480Z ok: [127.0.0.1] => (item=caddeapllx1441.agil.nprd.caixa.gov.br)
2026-06-11T15:10:13.9968614Z Thursday 11 June 2026  12:10:13 -0300 (0:00:00.100)       0:00:43.713 ********* 
2026-06-11T15:10:14.0747231Z Thursday 11 June 2026  12:10:14 -0300 (0:00:00.077)       0:00:43.791 ********* 
2026-06-11T15:10:14.1255473Z 
2026-06-11T15:10:14.1256214Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-06-11T15:10:14.1256672Z ok: [127.0.0.1] => {
2026-06-11T15:10:14.1258548Z     "msg": [
2026-06-11T15:10:14.1258785Z         "Servidores: \\\"caddeapllx1441.agil.nprd.caixa.gov.br\\\"", 
2026-06-11T15:10:14.1259016Z         "IPs: \\\"10.116.196.184\\\"", 
2026-06-11T15:10:14.1259313Z         "Gateways: \\\"10.116.192.1\\\"", 
2026-06-11T15:10:14.1259615Z         "IPs Backup: \\\"192.168.224.148\\\"", 
2026-06-11T15:10:14.1259953Z         "Servidores (OBJ): \\\"caddeapllx1441.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.196.184\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.224.148\\\"}"
2026-06-11T15:10:14.1260292Z     ]
2026-06-11T15:10:14.1260544Z }
2026-06-11T15:10:14.1474366Z Thursday 11 June 2026  12:10:14 -0300 (0:00:00.072)       0:00:43.864 ********* 
2026-06-11T15:10:15.0752453Z 
2026-06-11T15:10:15.0753242Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-06-11T15:10:15.0753519Z changed: [127.0.0.1]
2026-06-11T15:10:15.0829862Z 
2026-06-11T15:10:15.0830380Z PLAY [Configurando o DNS] ******************************************************
2026-06-11T15:10:15.3121402Z Thursday 11 June 2026  12:10:15 -0300 (0:00:01.164)       0:00:45.028 ********* 
2026-06-11T15:10:15.4730819Z 
2026-06-11T15:10:15.4731514Z TASK [Consultar DNS] ***********************************************************
2026-06-11T15:10:15.4731785Z changed: [10.116.193.77] => (item=caddeapllx1441.agil.nprd.caixa.gov.br)
2026-06-11T15:10:15.4767799Z Thursday 11 June 2026  12:10:15 -0300 (0:00:00.165)       0:00:45.193 ********* 
2026-06-11T15:10:15.5407628Z 
2026-06-11T15:10:15.5408695Z TASK [Verificar se o domínio resolve para um IP] *******************************
2026-06-11T15:10:15.5410195Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-06-11 12:10:15.456402', u'stdout': u'10.116.196.184', u'item': u'caddeapllx1441.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx1441.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.018318', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx1441.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.196.184'], u'start': u'2026-06-11 12:10:15.438084'}) => {
2026-06-11T15:10:15.5411220Z     "msg": "O domínio caddeapllx1441.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.196.184']"
2026-06-11T15:10:15.5411460Z }
2026-06-11T15:10:15.5456548Z Thursday 11 June 2026  12:10:15 -0300 (0:00:00.068)       0:00:45.262 ********* 
2026-06-11T15:10:15.5957687Z Thursday 11 June 2026  12:10:15 -0300 (0:00:00.049)       0:00:45.312 ********* 
2026-06-11T15:10:15.6459135Z Thursday 11 June 2026  12:10:15 -0300 (0:00:00.050)       0:00:45.362 ********* 
2026-06-11T15:10:15.7091620Z 
2026-06-11T15:10:15.7092323Z TASK [Set created DNS] *********************************************************
2026-06-11T15:10:15.7093601Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-06-11 12:10:15.456402', u'stdout': u'10.116.196.184', u'item': u'caddeapllx1441.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx1441.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.018318', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx1441.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.196.184'], u'start': u'2026-06-11 12:10:15.438084'})
2026-06-11T15:10:15.7139035Z Thursday 11 June 2026  12:10:15 -0300 (0:00:00.068)       0:00:45.431 ********* 
2026-06-11T15:10:15.7774341Z 
2026-06-11T15:10:15.7774857Z PLAY [local] *******************************************************************
2026-06-11T15:10:15.7811837Z 
2026-06-11T15:10:15.7812630Z PLAY [Verificando serviços] ****************************************************
2026-06-11T15:10:15.7895099Z 
2026-06-11T15:10:15.7895971Z PLAY [Configuração LDAP] *******************************************************
2026-06-11T15:10:15.7925216Z [WARNING]: Found variable using reserved name: when
2026-06-11T15:10:15.7931229Z 
2026-06-11T15:10:15.7931662Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8017448Z 
2026-06-11T15:10:15.8018649Z PLAY [Stack Jboss] *************************************************************
2026-06-11T15:10:15.8044064Z 
2026-06-11T15:10:15.8044606Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8083685Z 
2026-06-11T15:10:15.8084440Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8125867Z 
2026-06-11T15:10:15.8126300Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8151332Z 
2026-06-11T15:10:15.8151779Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-11T15:10:15.8179884Z 
2026-06-11T15:10:15.8180322Z PLAY [Copiando modules adicionais] *********************************************
2026-06-11T15:10:15.8207491Z 
2026-06-11T15:10:15.8208205Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8254833Z 
2026-06-11T15:10:15.8255348Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8280987Z 
2026-06-11T15:10:15.8281425Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8314174Z 
2026-06-11T15:10:15.8314585Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8343888Z 
2026-06-11T15:10:15.8344447Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8371696Z 
2026-06-11T15:10:15.8372130Z PLAY [local] *******************************************************************
2026-06-11T15:10:15.8396790Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-06-11T15:10:15.8400006Z 
2026-06-11T15:10:15.8400421Z PLAY [instance_restart] ********************************************************
2026-06-11T15:10:15.8400970Z skipping: no hosts matched
2026-06-11T15:10:15.8402797Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-06-11T15:10:15.8405842Z 
2026-06-11T15:10:15.8406279Z PLAY [machine_reboot] **********************************************************
2026-06-11T15:10:15.8406816Z skipping: no hosts matched
2026-06-11T15:10:15.8412496Z 
2026-06-11T15:10:15.8412921Z PLAY [local] *******************************************************************
2026-06-11T15:10:15.8437598Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-06-11T15:10:15.8440445Z 
2026-06-11T15:10:15.8440890Z PLAY [instance_stop] ***********************************************************
2026-06-11T15:10:15.8441365Z skipping: no hosts matched
2026-06-11T15:10:15.8443911Z 
2026-06-11T15:10:15.8444322Z PLAY [machine_reboot] **********************************************************
2026-06-11T15:10:15.8444622Z skipping: no hosts matched
2026-06-11T15:10:15.8450760Z 
2026-06-11T15:10:15.8451215Z PLAY [Configura TSM] ***********************************************************
2026-06-11T15:10:15.8479450Z 
2026-06-11T15:10:15.8480025Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8506576Z 
2026-06-11T15:10:15.8507331Z PLAY [Configura Control-M] *****************************************************
2026-06-11T15:10:15.8542115Z 
2026-06-11T15:10:15.8542544Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8584219Z 
2026-06-11T15:10:15.8584456Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8625888Z 
2026-06-11T15:10:15.8626212Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8648406Z 
2026-06-11T15:10:15.8648686Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8679896Z 
2026-06-11T15:10:15.8680140Z PLAY [localhost] ***************************************************************
2026-06-11T15:10:15.8705879Z 
2026-06-11T15:10:15.8706241Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8749308Z 
2026-06-11T15:10:15.8749613Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8785387Z 
2026-06-11T15:10:15.8785977Z PLAY [jboss] *******************************************************************
2026-06-11T15:10:15.8823075Z 
2026-06-11T15:10:15.8823585Z PLAY RECAP *********************************************************************
2026-06-11T15:10:15.8823867Z 10.116.193.77              : ok=3    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-06-11T15:10:15.8824055Z 10.116.193.78              : ok=0    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-06-11T15:10:15.8824241Z 127.0.0.1                  : ok=41   changed=5    unreachable=0    failed=0    skipped=10   rescued=0    ignored=0   
2026-06-11T15:10:15.8824317Z 
2026-06-11T15:10:15.8824698Z Thursday 11 June 2026  12:10:15 -0300 (0:00:00.168)       0:00:45.599 ********* 
2026-06-11T15:10:15.8825078Z =============================================================================== 
2026-06-11T15:10:15.8830699Z Gathering Facts -------------------------------------------------------- 27.77s
2026-06-11T15:10:15.8831382Z vm : Executar script para marcar VM como template ----------------------- 7.61s
2026-06-11T15:10:15.8831649Z vm : Criando arquivo para exportar as variáveis ------------------------- 1.16s
2026-06-11T15:10:15.8831894Z vm : Instalar dependências Python para vCenter -------------------------- 0.90s
2026-06-11T15:10:15.8836150Z vm : execute create_ip_bck script --------------------------------------- 0.75s
2026-06-11T15:10:15.8844771Z vm : Consultar API ------------------------------------------------------ 0.69s
2026-06-11T15:10:15.8847265Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.53s
2026-06-11T15:10:15.8849626Z vm : Consultar API ------------------------------------------------------ 0.52s
2026-06-11T15:10:15.8851696Z vm : Run Invetory All --------------------------------------------------- 0.51s
2026-06-11T15:10:15.8854198Z vm : Run Invetory All --------------------------------------------------- 0.51s
2026-06-11T15:10:15.8856451Z vm : Coletar variáveis de ambiente -------------------------------------- 0.37s
2026-06-11T15:10:15.8859174Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.36s
2026-06-11T15:10:15.8861300Z include_role : dns ------------------------------------------------------ 0.17s
2026-06-11T15:10:15.8863367Z Consultar DNS ----------------------------------------------------------- 0.17s
2026-06-11T15:10:15.8865420Z vm : Criar variáveis ---------------------------------------------------- 0.12s
2026-06-11T15:10:15.8867774Z vm : include_tasks ------------------------------------------------------ 0.12s
2026-06-11T15:10:15.8869942Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-06-11T15:10:15.8871289Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-06-11T15:10:15.8871697Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-06-11T15:10:15.8872130Z vm : Recuperar ip ------------------------------------------------------- 0.10s
2026-06-11T15:10:15.8872429Z Playbook run took 0 days, 0 hours, 0 minutes, 45 seconds
2026-06-11T15:10:15.9519817Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
