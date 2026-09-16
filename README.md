eu crei aqui no infrafacil outra vm com outro host  masi o log é esse


<img width="1600" height="378" alt="image" src="https://github.com/user-attachments/assets/01c3dbd4-856e-458b-800c-c47ca87693b1" />



2026-09-16T13:51:24.5365530Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-09-16T13:51:24.5368464Z ==============================================================================
2026-09-16T13:51:24.5368550Z Task         : Bash
2026-09-16T13:51:24.5368599Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-16T13:51:24.5368675Z Version      : 3.227.0
2026-09-16T13:51:24.5368725Z Author       : Microsoft Corporation
2026-09-16T13:51:24.5368791Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-16T13:51:24.5368866Z ==============================================================================
2026-09-16T13:51:25.4672681Z Generating script.
2026-09-16T13:51:25.4682677Z ========================== Starting Command Output ===========================
2026-09-16T13:51:25.4689445Z [command]/bin/bash /opt/ads-agent/_work/_temp/f4b20d5f-441f-4c46-a9a3-479771a27fec.sh
2026-09-16T13:51:27.4318093Z 
2026-09-16T13:51:27.4318532Z PLAY [local] *******************************************************************
2026-09-16T13:51:27.4547818Z Wednesday 16 September 2026  10:51:27 -0300 (0:00:00.081)       0:00:00.081 *** 
2026-09-16T13:51:55.1757813Z 
2026-09-16T13:51:55.1761234Z TASK [Gathering Facts] *********************************************************
2026-09-16T13:51:55.1762206Z ok: [127.0.0.1]
2026-09-16T13:51:55.2075828Z Wednesday 16 September 2026  10:51:55 -0300 (0:00:27.752)       0:00:27.834 *** 
2026-09-16T13:51:55.2905694Z Wednesday 16 September 2026  10:51:55 -0300 (0:00:00.083)       0:00:27.917 *** 
2026-09-16T13:51:55.3678234Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r11884/a
2026-09-16T13:51:55.3678537Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-09-16T13:51:55.3678726Z duplicate dict key (include_tasks). Using last defined value only.
2026-09-16T13:51:55.3791056Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-09-16T13:51:55.4047995Z Wednesday 16 September 2026  10:51:55 -0300 (0:00:00.114)       0:00:28.031 *** 
2026-09-16T13:51:55.4824674Z 
2026-09-16T13:51:55.4826315Z TASK [vm : Cria variável build_repository_name] ********************************
2026-09-16T13:51:55.4826780Z ok: [127.0.0.1]
2026-09-16T13:51:55.5050187Z Wednesday 16 September 2026  10:51:55 -0300 (0:00:00.100)       0:00:28.132 *** 
2026-09-16T13:51:56.3653967Z 
2026-09-16T13:51:56.3654801Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-09-16T13:51:56.3654986Z ok: [127.0.0.1]
2026-09-16T13:51:56.3905039Z Wednesday 16 September 2026  10:51:56 -0300 (0:00:00.885)       0:00:29.017 *** 
2026-09-16T13:52:09.1969499Z 
2026-09-16T13:52:09.1970494Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-09-16T13:52:09.1970942Z changed: [127.0.0.1]
2026-09-16T13:52:09.2335147Z Wednesday 16 September 2026  10:52:09 -0300 (0:00:12.842)       0:00:41.860 *** 
2026-09-16T13:52:09.3099984Z 
2026-09-16T13:52:09.3100917Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-09-16T13:52:09.3101361Z ok: [127.0.0.1] => {
2026-09-16T13:52:09.3101689Z     "msg": [
2026-09-16T13:52:09.3102443Z         "Iniciando registro do template VMTX...", 
2026-09-16T13:52:09.3102754Z         "vCenter: 10.122.144.195", 
2026-09-16T13:52:09.3103160Z         "Template: controlm9p-openjdk17-rhel93-v006_CLONE", 
2026-09-16T13:52:09.3103459Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] controlm9p-openjdk17-rhel93-v006_CLONE/controlm9p-openjdk17-rhel93-v006_CLONE.vmtx", 
2026-09-16T13:52:09.3103646Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-09-16T13:52:09.3103904Z         "Template 'controlm9p-openjdk17-rhel93-v006_CLONE' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-09-16T13:52:09.3104072Z         "Operacao concluida com sucesso."
2026-09-16T13:52:09.3104185Z     ]
2026-09-16T13:52:09.3104291Z }
2026-09-16T13:52:09.3327256Z Wednesday 16 September 2026  10:52:09 -0300 (0:00:00.099)       0:00:41.959 *** 
2026-09-16T13:52:09.4061052Z 
2026-09-16T13:52:09.4062278Z TASK [vm : Cria variável ansible] **********************************************
2026-09-16T13:52:09.4062743Z ok: [127.0.0.1]
2026-09-16T13:52:09.4305095Z Wednesday 16 September 2026  10:52:09 -0300 (0:00:00.097)       0:00:42.057 *** 
2026-09-16T13:52:09.9321675Z 
2026-09-16T13:52:09.9323172Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-09-16T13:52:09.9323675Z ok: [127.0.0.1]
2026-09-16T13:52:09.9563750Z Wednesday 16 September 2026  10:52:09 -0300 (0:00:00.525)       0:00:42.583 *** 
2026-09-16T13:52:10.2994585Z 
2026-09-16T13:52:10.2995899Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-09-16T13:52:10.2996338Z ok: [127.0.0.1]
2026-09-16T13:52:10.3230827Z Wednesday 16 September 2026  10:52:10 -0300 (0:00:00.366)       0:00:42.949 *** 
2026-09-16T13:52:10.3921002Z Wednesday 16 September 2026  10:52:10 -0300 (0:00:00.068)       0:00:43.018 *** 
2026-09-16T13:52:10.4914150Z Wednesday 16 September 2026  10:52:10 -0300 (0:00:00.099)       0:00:43.118 *** 
2026-09-16T13:52:10.5458789Z 
2026-09-16T13:52:10.5459804Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-09-16T13:52:10.5460426Z ok: [127.0.0.1]
2026-09-16T13:52:10.5690974Z Wednesday 16 September 2026  10:52:10 -0300 (0:00:00.077)       0:00:43.195 *** 
2026-09-16T13:52:10.6445006Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-09-16T13:52:10.6740170Z Wednesday 16 September 2026  10:52:10 -0300 (0:00:00.104)       0:00:43.300 *** 
2026-09-16T13:52:10.7388008Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-09-16T13:52:10.7717520Z Wednesday 16 September 2026  10:52:10 -0300 (0:00:00.097)       0:00:43.398 *** 
2026-09-16T13:52:11.4510634Z 
2026-09-16T13:52:11.4511671Z TASK [vm : Consultar API] ******************************************************
2026-09-16T13:52:11.4512294Z ok: [127.0.0.1]
2026-09-16T13:52:11.4827151Z Wednesday 16 September 2026  10:52:11 -0300 (0:00:00.710)       0:00:44.109 *** 
2026-09-16T13:52:11.5281967Z 
2026-09-16T13:52:11.5282966Z TASK [vm : Parse JSON] *********************************************************
2026-09-16T13:52:11.5283295Z ok: [127.0.0.1]
2026-09-16T13:52:11.5517129Z Wednesday 16 September 2026  10:52:11 -0300 (0:00:00.068)       0:00:44.178 *** 
2026-09-16T13:52:11.6232539Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-09-16T13:52:11.6566783Z Wednesday 16 September 2026  10:52:11 -0300 (0:00:00.105)       0:00:44.283 *** 
2026-09-16T13:52:12.0708108Z 
2026-09-16T13:52:12.0708784Z TASK [vm : Consultar API] ******************************************************
2026-09-16T13:52:12.0708952Z ok: [127.0.0.1]
2026-09-16T13:52:12.0958949Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.439)       0:00:44.722 *** 
2026-09-16T13:52:12.1457444Z 
2026-09-16T13:52:12.1458319Z TASK [vm : Parse JSON] *********************************************************
2026-09-16T13:52:12.1458492Z ok: [127.0.0.1]
2026-09-16T13:52:12.1692848Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.073)       0:00:44.796 *** 
2026-09-16T13:52:12.2501607Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.080)       0:00:44.876 *** 
2026-09-16T13:52:12.2990541Z 
2026-09-16T13:52:12.2991476Z TASK [vm : Exibir size servidores.] ********************************************
2026-09-16T13:52:12.2991949Z ok: [127.0.0.1] => {
2026-09-16T13:52:12.2992507Z     "api_data.dados.0": {
2026-09-16T13:52:12.2992720Z         "ambiente": "des", 
2026-09-16T13:52:12.2992847Z         "cluster": null, 
2026-09-16T13:52:12.2992979Z         "cluster_principal": null, 
2026-09-16T13:52:12.2998032Z         "cluster_terraform": null, 
2026-09-16T13:52:12.2998213Z         "cpu": 4, 
2026-09-16T13:52:12.2998343Z         "datacenter": null, 
2026-09-16T13:52:12.2998494Z         "datastore": null, 
2026-09-16T13:52:12.3001381Z         "detalhe_imagem": null, 
2026-09-16T13:52:12.3001694Z         "disco_log": 2, 
2026-09-16T13:52:12.3001873Z         "disco_opt": 10, 
2026-09-16T13:52:12.3002049Z         "domain": null, 
2026-09-16T13:52:12.3002231Z         "esx_network": null, 
2026-09-16T13:52:12.3002406Z         "esx_network_bck": null, 
2026-09-16T13:52:12.3002597Z         "esx_network_bck_01": null, 
2026-09-16T13:52:12.3002789Z         "esx_vcenter_server": null, 
2026-09-16T13:52:12.3002961Z         "farm": null, 
2026-09-16T13:52:12.3003103Z         "id": 61675, 
2026-09-16T13:52:12.3003542Z         "inclusao": "2026-09-16 10:49:35", 
2026-09-16T13:52:12.3005249Z         "info_framework": null, 
2026-09-16T13:52:12.3005426Z         "info_linguagem": null, 
2026-09-16T13:52:12.3005550Z         "info_tecnologia": null, 
2026-09-16T13:52:12.3005670Z         "info_versao": null, 
2026-09-16T13:52:12.3005807Z         "ipbackup": "192.168.213.137,10.188.254.113", 
2026-09-16T13:52:12.3005959Z         "jboss_apache_status": "ativado", 
2026-09-16T13:52:12.3006090Z         "memoria": 8, 
2026-09-16T13:52:12.3006211Z         "net_adapter_type": null, 
2026-09-16T13:52:12.3006337Z         "nome_imagem": null, 
2026-09-16T13:52:12.3006457Z         "objeto_origem": null, 
2026-09-16T13:52:12.3006580Z         "plataforma": "vm", 
2026-09-16T13:52:12.3006826Z         "produto": "jboss", 
2026-09-16T13:52:12.3006947Z         "recursos_max_id": null, 
2026-09-16T13:52:12.3007067Z         "servidores_json": [
2026-09-16T13:52:12.3007182Z             {
2026-09-16T13:52:12.3007336Z                 "ip": "10.116.195.38", 
2026-09-16T13:52:12.3007477Z                 "nome": "caddeapllx1214.agil.nprd.caixa.gov.br"
2026-09-16T13:52:12.3007604Z             }
2026-09-16T13:52:12.3007701Z         ], 
2026-09-16T13:52:12.3007884Z         "sistema": "siifx-batch-vm", 
2026-09-16T13:52:12.3008041Z         "site": "ctc_nprd", 
2026-09-16T13:52:12.3008217Z         "solicitacoes_id": null, 
2026-09-16T13:52:12.3008524Z         "status": "ativado", 
2026-09-16T13:52:12.3008651Z         "terraform": true, 
2026-09-16T13:52:12.3008774Z         "versao_imagem": null, 
2026-09-16T13:52:12.3008904Z         "versao_plataforma": "1.0", 
2026-09-16T13:52:12.3009030Z         "vm_dns": null, 
2026-09-16T13:52:12.3009176Z         "vm_ipnetmask": null, 
2026-09-16T13:52:12.3009354Z         "vm_ipnetmask_bck": null, 
2026-09-16T13:52:12.3009481Z         "vm_ipnetmask_bck_01": null, 
2026-09-16T13:52:12.3009606Z         "vsphere_folder": null, 
2026-09-16T13:52:12.3009713Z         "vsphere_pool": null
2026-09-16T13:52:12.3009819Z     }
2026-09-16T13:52:12.3009915Z }
2026-09-16T13:52:12.3242763Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.074)       0:00:44.951 *** 
2026-09-16T13:52:12.3930494Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.068)       0:00:45.019 *** 
2026-09-16T13:52:12.4440520Z 
2026-09-16T13:52:12.4441503Z TASK [vm : Set size] ***********************************************************
2026-09-16T13:52:12.4442009Z ok: [127.0.0.1]
2026-09-16T13:52:12.4680089Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.075)       0:00:45.094 *** 
2026-09-16T13:52:12.5148146Z 
2026-09-16T13:52:12.5149339Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-09-16T13:52:12.5149677Z ok: [127.0.0.1]
2026-09-16T13:52:12.5383855Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.070)       0:00:45.165 *** 
2026-09-16T13:52:12.5828935Z 
2026-09-16T13:52:12.5829982Z TASK [vm : debug] **************************************************************
2026-09-16T13:52:12.5830577Z ok: [127.0.0.1] => {
2026-09-16T13:52:12.5831108Z     "template_name": "controlm9p-openjdk17-rhel93-v006_CLONE"
2026-09-16T13:52:12.5831419Z }
2026-09-16T13:52:12.6065902Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.068)       0:00:45.233 *** 
2026-09-16T13:52:12.6521067Z 
2026-09-16T13:52:12.6522294Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-09-16T13:52:12.6522759Z ok: [127.0.0.1]
2026-09-16T13:52:12.6756908Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.069)       0:00:45.302 *** 
2026-09-16T13:52:12.7474573Z Wednesday 16 September 2026  10:52:12 -0300 (0:00:00.071)       0:00:45.374 *** 
2026-09-16T13:52:13.2935581Z 
2026-09-16T13:52:13.2936748Z TASK [vm : Run Invetory All] ***************************************************
2026-09-16T13:52:13.2937858Z changed: [127.0.0.1]
2026-09-16T13:52:13.3192405Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.571)       0:00:45.946 *** 
2026-09-16T13:52:13.3859717Z 
2026-09-16T13:52:13.3860424Z TASK [vm : Parse JSON output] **************************************************
2026-09-16T13:52:13.3861867Z ok: [127.0.0.1]
2026-09-16T13:52:13.4107938Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.091)       0:00:46.037 *** 
2026-09-16T13:52:13.4580441Z 
2026-09-16T13:52:13.4581139Z TASK [vm : Count the number of hosts] ******************************************
2026-09-16T13:52:13.4581361Z ok: [127.0.0.1]
2026-09-16T13:52:13.4826528Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.071)       0:00:46.109 *** 
2026-09-16T13:52:13.5487788Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.066)       0:00:46.175 *** 
2026-09-16T13:52:13.6153978Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.066)       0:00:46.242 *** 
2026-09-16T13:52:13.6598560Z 
2026-09-16T13:52:13.6599261Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-09-16T13:52:13.6599434Z ok: [127.0.0.1] => {
2026-09-16T13:52:13.6599569Z     "msg": [
2026-09-16T13:52:13.6599693Z         "num_hosts: 2"
2026-09-16T13:52:13.6599814Z     ]
2026-09-16T13:52:13.6599926Z }
2026-09-16T13:52:13.6829781Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.067)       0:00:46.309 *** 
2026-09-16T13:52:13.7503024Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.067)       0:00:46.377 *** 
2026-09-16T13:52:13.8240737Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.073)       0:00:46.450 *** 
2026-09-16T13:52:13.8908772Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-09-16T13:52:13.9309936Z Wednesday 16 September 2026  10:52:13 -0300 (0:00:00.107)       0:00:46.557 *** 
2026-09-16T13:52:13.9973502Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-09-16T13:52:14.0233937Z Wednesday 16 September 2026  10:52:14 -0300 (0:00:00.092)       0:00:46.650 *** 
2026-09-16T13:52:14.0720817Z 
2026-09-16T13:52:14.0721751Z TASK [vm : Criar variáveis] ****************************************************
2026-09-16T13:52:14.0721924Z ok: [127.0.0.1]
2026-09-16T13:52:14.1169967Z Wednesday 16 September 2026  10:52:14 -0300 (0:00:00.093)       0:00:46.743 *** 
2026-09-16T13:52:14.4257779Z 
2026-09-16T13:52:14.4258506Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-09-16T13:52:14.4258683Z ok: [127.0.0.1]
2026-09-16T13:52:14.4498193Z Wednesday 16 September 2026  10:52:14 -0300 (0:00:00.332)       0:00:47.076 *** 
2026-09-16T13:52:14.4947881Z 
2026-09-16T13:52:14.4948820Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-09-16T13:52:14.4950053Z ok: [127.0.0.1] => {
2026-09-16T13:52:14.4950221Z     "nfs_vars_json": {
2026-09-16T13:52:14.4950356Z         "changed": false, 
2026-09-16T13:52:14.4950966Z         "cmd": "cat /opt/ads-agent/_work/r11884/a/nfs_config.json", 
2026-09-16T13:52:14.4951169Z         "delta": "0:00:00.003469", 
2026-09-16T13:52:14.4951371Z         "end": "2026-09-16 10:52:14.407063", 
2026-09-16T13:52:14.4951512Z         "failed": false, 
2026-09-16T13:52:14.4951629Z         "rc": 0, 
2026-09-16T13:52:14.4951809Z         "start": "2026-09-16 10:52:14.403594", 
2026-09-16T13:52:14.4951945Z         "stderr": "", 
2026-09-16T13:52:14.4952067Z         "stderr_lines": [], 
2026-09-16T13:52:14.4952764Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-16T13:52:14.4953489Z         "stdout_lines": [
2026-09-16T13:52:14.4954177Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T13:52:14.4954542Z         ]
2026-09-16T13:52:14.4954646Z     }
2026-09-16T13:52:14.4954734Z }
2026-09-16T13:52:14.5200430Z Wednesday 16 September 2026  10:52:14 -0300 (0:00:00.070)       0:00:47.146 *** 
2026-09-16T13:52:14.5712087Z 
2026-09-16T13:52:14.5713456Z TASK [vm : Criar variáveis] ****************************************************
2026-09-16T13:52:14.5714641Z ok: [127.0.0.1]
2026-09-16T13:52:14.5964081Z Wednesday 16 September 2026  10:52:14 -0300 (0:00:00.076)       0:00:47.223 *** 
2026-09-16T13:52:15.3915397Z 
2026-09-16T13:52:15.3916442Z TASK [vm : execute create_ip_bck script] ***************************************
2026-09-16T13:52:15.3918410Z changed: [127.0.0.1]
2026-09-16T13:52:15.4261473Z Wednesday 16 September 2026  10:52:15 -0300 (0:00:00.829)       0:00:48.052 *** 
2026-09-16T13:52:15.4791467Z 
2026-09-16T13:52:15.4792335Z TASK [vm : ansible.builtin.debug] **********************************************
2026-09-16T13:52:15.4802751Z ok: [127.0.0.1] => {
2026-09-16T13:52:15.4803387Z     "changed": false, 
2026-09-16T13:52:15.4803569Z     "msg": {
2026-09-16T13:52:15.4803679Z         "changed": true, 
2026-09-16T13:52:15.4803802Z         "cmd": [
2026-09-16T13:52:15.4803915Z             "python", 
2026-09-16T13:52:15.4804345Z             "/opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-16T13:52:15.4804890Z             "create_ip_bck", 
2026-09-16T13:52:15.4805156Z             "siifx-batch-vm", 
2026-09-16T13:52:15.4805277Z             "des", 
2026-09-16T13:52:15.4805392Z             "ctc_nprd", 
2026-09-16T13:52:15.4805600Z             "/opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2", 
2026-09-16T13:52:15.4806044Z             "C&t@d02", 
2026-09-16T13:52:15.4806282Z             "***", 
2026-09-16T13:52:15.4806435Z             "s736651@corp.caixa.gov.br", 
2026-09-16T13:52:15.4806669Z             "***", 
2026-09-16T13:52:15.4807410Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-16T13:52:15.4807805Z         ], 
2026-09-16T13:52:15.4807954Z         "delta": "0:00:00.487752", 
2026-09-16T13:52:15.4808152Z         "end": "2026-09-16 10:52:15.370343", 
2026-09-16T13:52:15.4808287Z         "failed": false, 
2026-09-16T13:52:15.4808403Z         "rc": 0, 
2026-09-16T13:52:15.4808588Z         "start": "2026-09-16 10:52:14.882591", 
2026-09-16T13:52:15.4808720Z         "stderr": "", 
2026-09-16T13:52:15.4809209Z         "stderr_lines": [], 
2026-09-16T13:52:15.4824802Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nNFS ENDPOINT: {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS', u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_MOUNT_POINT_ISILON': u'/SIIFX'}\nVariaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'), (u'NFS_MOUNT_POINT_ISILON', u'/SIIFX')), ((u'NFS_ENDPOINT_ISILON_2', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'), (u'NFS_MOUNT_POINT_ISILON_2', u'/SIIFX_B2B')), ((u'NFS_ENDPOINT_ISILON_3', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'), (u'NFS_MOUNT_POINT_ISILON_3', u'/SIIFX_SIISF')), ((u'NFS_ENDPOINT_ISILON_4', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA'), (u'NFS_MOUNT_POINT_ISILON_4', u'/SIIFX_SIGMS'))]\nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH/SIIFXISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX/SIIFX_B2BISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF/SIIFX_SIISFISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA/SIIFX_SIGMSISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T13:52:15.4832273Z         "stdout_lines": [
2026-09-16T13:52:15.4833031Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-16T13:52:15.4833447Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-16T13:52:15.4833819Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-16T13:52:15.4834639Z             "NFS ENDPOINT: {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS', u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_MOUNT_POINT_ISILON': u'/SIIFX'}", 
2026-09-16T13:52:15.4835639Z             "Variaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'), (u'NFS_MOUNT_POINT_ISILON', u'/SIIFX')), ((u'NFS_ENDPOINT_ISILON_2', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'), (u'NFS_MOUNT_POINT_ISILON_2', u'/SIIFX_B2B')), ((u'NFS_ENDPOINT_ISILON_3', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'), (u'NFS_MOUNT_POINT_ISILON_3', u'/SIIFX_SIISF')), ((u'NFS_ENDPOINT_ISILON_4', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA'), (u'NFS_MOUNT_POINT_ISILON_4', u'/SIIFX_SIGMS'))]", 
2026-09-16T13:52:15.4836196Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH/SIIFXISILONnfsctcnprd.ctc.caixades", 
2026-09-16T13:52:15.4839069Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-16T13:52:15.4840756Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T13:52:15.4840978Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX/SIIFX_B2BISILONnfsctcnprd.ctc.caixades", 
2026-09-16T13:52:15.4843926Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-16T13:52:15.4845462Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T13:52:15.4845677Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF/SIIFX_SIISFISILONnfsctcnprd.ctc.caixades", 
2026-09-16T13:52:15.4848551Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-16T13:52:15.4850026Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-16T13:52:15.4850238Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA/SIIFX_SIGMSISILONnfsctcnprd.ctc.caixades", 
2026-09-16T13:52:15.4853096Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-09-16 10:49:35', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61675, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.195.38', u'nome': u'caddeapllx1214.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': None, u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-batch-vm', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.213.137,10.188.254.113', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}, {u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-16T13:52:15.4854772Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-16T13:52:15.4854977Z         ]
2026-09-16T13:52:15.4855084Z     }
2026-09-16T13:52:15.4855188Z }
2026-09-16T13:52:15.5053804Z Wednesday 16 September 2026  10:52:15 -0300 (0:00:00.079)       0:00:48.132 *** 
2026-09-16T13:52:15.9382627Z 
2026-09-16T13:52:15.9383286Z TASK [vm : Run Invetory All] ***************************************************
2026-09-16T13:52:15.9384307Z changed: [127.0.0.1]
2026-09-16T13:52:15.9628404Z Wednesday 16 September 2026  10:52:15 -0300 (0:00:00.457)       0:00:48.589 *** 
2026-09-16T13:52:16.0153932Z 
2026-09-16T13:52:16.0155094Z TASK [vm : Parse JSON output] **************************************************
2026-09-16T13:52:16.0155928Z ok: [127.0.0.1]
2026-09-16T13:52:16.0403562Z Wednesday 16 September 2026  10:52:16 -0300 (0:00:00.077)       0:00:48.667 *** 
2026-09-16T13:52:16.0920140Z 
2026-09-16T13:52:16.0921127Z TASK [vm : Debug parsed_output] ************************************************
2026-09-16T13:52:16.0929300Z ok: [127.0.0.1] => {
2026-09-16T13:52:16.0929467Z     "msg": [
2026-09-16T13:52:16.0929596Z         {
2026-09-16T13:52:16.0929703Z             "_meta": {
2026-09-16T13:52:16.0929878Z                 "hostvars": {
2026-09-16T13:52:16.0930040Z                     "caddeapllx1214.agil.nprd.caixa.gov.br": {
2026-09-16T13:52:16.0930176Z                         "ambiente": "des", 
2026-09-16T13:52:16.0930311Z                         "ansible_host": "10.116.195.38", 
2026-09-16T13:52:16.0931447Z                         "cluster": null, 
2026-09-16T13:52:16.0931663Z                         "cluster_principal": null, 
2026-09-16T13:52:16.0932191Z                         "cluster_terraform": null, 
2026-09-16T13:52:16.0932330Z                         "cpu": 4, 
2026-09-16T13:52:16.0932470Z                         "datacenter": null, 
2026-09-16T13:52:16.0932598Z                         "datastore": null, 
2026-09-16T13:52:16.0932737Z                         "detalhe_imagem": null, 
2026-09-16T13:52:16.0932863Z                         "disco_log": 2, 
2026-09-16T13:52:16.0932993Z                         "disco_opt": 10, 
2026-09-16T13:52:16.0933133Z                         "domain": null, 
2026-09-16T13:52:16.0933260Z                         "esx_network": null, 
2026-09-16T13:52:16.0933384Z                         "esx_network_bck": null, 
2026-09-16T13:52:16.0933513Z                         "esx_network_bck_01": null, 
2026-09-16T13:52:16.0933646Z                         "esx_vcenter_server": null, 
2026-09-16T13:52:16.0933766Z                         "farm": null, 
2026-09-16T13:52:16.0933884Z                         "id": 61675, 
2026-09-16T13:52:16.0934271Z                         "inclusao": "2026-09-16 10:49:35", 
2026-09-16T13:52:16.0934415Z                         "info_framework": null, 
2026-09-16T13:52:16.0934545Z                         "info_linguagem": null, 
2026-09-16T13:52:16.0934675Z                         "info_tecnologia": null, 
2026-09-16T13:52:16.0934808Z                         "info_versao": null, 
2026-09-16T13:52:16.0934942Z                         "ipbackup": "192.168.213.137,10.188.254.113", 
2026-09-16T13:52:16.0935090Z                         "jboss_apache_status": "ativado", 
2026-09-16T13:52:16.0935223Z                         "memoria": 8, 
2026-09-16T13:52:16.0935347Z                         "net_adapter_type": null, 
2026-09-16T13:52:16.0935474Z                         "nome_imagem": null, 
2026-09-16T13:52:16.0935599Z                         "objeto_origem": null, 
2026-09-16T13:52:16.0935723Z                         "plataforma": "vm", 
2026-09-16T13:52:16.0935846Z                         "produto": "jboss", 
2026-09-16T13:52:16.0936077Z                         "recursos_max_id": null, 
2026-09-16T13:52:16.0936255Z                         "sistema": "siifx-batch-vm", 
2026-09-16T13:52:16.0936384Z                         "site": "ctc_nprd", 
2026-09-16T13:52:16.0936508Z                         "solicitacoes_id": null, 
2026-09-16T13:52:16.0936767Z                         "status": "ativado", 
2026-09-16T13:52:16.0936896Z                         "terraform": true, 
2026-09-16T13:52:16.0937019Z                         "versao_imagem": null, 
2026-09-16T13:52:16.0937137Z                         "versao_plataforma": "1.0", 
2026-09-16T13:52:16.0937271Z                         "vm_dns": null, 
2026-09-16T13:52:16.0937397Z                         "vm_ipnetmask": null, 
2026-09-16T13:52:16.0937530Z                         "vm_ipnetmask_bck": null, 
2026-09-16T13:52:16.0937661Z                         "vm_ipnetmask_bck_01": null, 
2026-09-16T13:52:16.0937792Z                         "vsphere_folder": null, 
2026-09-16T13:52:16.0937922Z                         "vsphere_pool": null
2026-09-16T13:52:16.0938037Z                     }, 
2026-09-16T13:52:16.0938168Z                     "caddeapllx2798.agil.nprd.caixa.gov.br": {
2026-09-16T13:52:16.0938307Z                         "ambiente": "des", 
2026-09-16T13:52:16.0938435Z                         "ansible_host": "10.116.202.9", 
2026-09-16T13:52:16.0938574Z                         "cluster": "CTC_NPRDXF2488HV7_NPRD", 
2026-09-16T13:52:16.0938703Z                         "cluster_principal": "", 
2026-09-16T13:52:16.0938837Z                         "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD", 
2026-09-16T13:52:16.0938972Z                         "cpu": 4, 
2026-09-16T13:52:16.0939098Z                         "datacenter": "NPRD", 
2026-09-16T13:52:16.0939227Z                         "datastore": "CTCHWNPRDPC03_0047", 
2026-09-16T13:52:16.0939361Z                         "detalhe_imagem": null, 
2026-09-16T13:52:16.0939536Z                         "disco_log": 2, 
2026-09-16T13:52:16.0939656Z                         "disco_opt": 10, 
2026-09-16T13:52:16.0939786Z                         "domain": "agil.nprd.caixa.gov.br", 
2026-09-16T13:52:16.0940011Z                         "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0", 
2026-09-16T13:52:16.0940284Z                         "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep", 
2026-09-16T13:52:16.0940515Z                         "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep", 
2026-09-16T13:52:16.0940671Z                         "esx_vcenter_server": "10.122.144.195", 
2026-09-16T13:52:16.0940801Z                         "farm": null, 
2026-09-16T13:52:16.0940918Z                         "id": 2128, 
2026-09-16T13:52:16.0941105Z                         "inclusao": "2021-12-10 15:47:02", 
2026-09-16T13:52:16.0941245Z                         "info_framework": null, 
2026-09-16T13:52:16.0941359Z                         "info_linguagem": null, 
2026-09-16T13:52:16.0941480Z                         "info_tecnologia": null, 
2026-09-16T13:52:16.0941602Z                         "info_versao": null, 
2026-09-16T13:52:16.0941728Z                         "ipbackup": "192.168.241.249", 
2026-09-16T13:52:16.0941864Z                         "jboss_apache_status": "ativado", 
2026-09-16T13:52:16.0941986Z                         "memoria": 8, 
2026-09-16T13:52:16.0942108Z                         "net_adapter_type": "vmxnet3", 
2026-09-16T13:52:16.0942234Z                         "nome_imagem": null, 
2026-09-16T13:52:16.0942430Z                         "objeto_origem": "SIIFX-CONTROLM_DES__SERVIDOR", 
2026-09-16T13:52:16.0942564Z                         "plataforma": "vm", 
2026-09-16T13:52:16.0942685Z                         "produto": "jboss", 
2026-09-16T13:52:16.0942809Z                         "recursos_max_id": null, 
2026-09-16T13:52:16.0942982Z                         "sistema": "siifx-batch-vm", 
2026-09-16T13:52:16.0943108Z                         "site": "ctc_nprd", 
2026-09-16T13:52:16.0943230Z                         "solicitacoes_id": 4924, 
2026-09-16T13:52:16.0943405Z                         "status": "ativado", 
2026-09-16T13:52:16.0943523Z                         "terraform": true, 
2026-09-16T13:52:16.0943645Z                         "versao_imagem": null, 
2026-09-16T13:52:16.0943773Z                         "versao_plataforma": "1.0", 
2026-09-16T13:52:16.0943896Z                         "vm_dns": [
2026-09-16T13:52:16.0944000Z                             "10.116.193.77", 
2026-09-16T13:52:16.0944116Z                             "10.116.193.78"
2026-09-16T13:52:16.0944226Z                         ], 
2026-09-16T13:52:16.0944341Z                         "vm_ipnetmask": 19, 
2026-09-16T13:52:16.0944465Z                         "vm_ipnetmask_bck": 19, 
2026-09-16T13:52:16.0944590Z                         "vm_ipnetmask_bck_01": 16, 
2026-09-16T13:52:16.0944713Z                         "vsphere_folder": "/vm", 
2026-09-16T13:52:16.0944848Z                         "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-09-16T13:52:16.0944976Z                     }
2026-09-16T13:52:16.0945076Z                 }
2026-09-16T13:52:16.0945175Z             }, 
2026-09-16T13:52:16.0945284Z             "ctc_nprd": {
2026-09-16T13:52:16.0945399Z                 "children": [
2026-09-16T13:52:16.0945508Z                     "jboss"
2026-09-16T13:52:16.0945614Z                 ], 
2026-09-16T13:52:16.0945721Z                 "vars": {}
2026-09-16T13:52:16.0945827Z             }, 
2026-09-16T13:52:16.0945919Z             "des": {
2026-09-16T13:52:16.0946027Z                 "children": [
2026-09-16T13:52:16.0946137Z                     "local", 
2026-09-16T13:52:16.0946248Z                     "ctc_nprd"
2026-09-16T13:52:16.0946354Z                 ], 
2026-09-16T13:52:16.0946459Z                 "vars": {}
2026-09-16T13:52:16.0946561Z             }, 
2026-09-16T13:52:16.0946824Z             "jboss": {
2026-09-16T13:52:16.0946989Z                 "hosts": [
2026-09-16T13:52:16.0947778Z                     "caddeapllx1214.agil.nprd.caixa.gov.br", 
2026-09-16T13:52:16.0947949Z                     "caddeapllx2798.agil.nprd.caixa.gov.br"
2026-09-16T13:52:16.0948072Z                 ], 
2026-09-16T13:52:16.0948180Z                 "vars": {}
2026-09-16T13:52:16.0948286Z             }, 
2026-09-16T13:52:16.0948397Z             "local": {
2026-09-16T13:52:16.0948508Z                 "hosts": [
2026-09-16T13:52:16.0948608Z                     "127.0.0.1"
2026-09-16T13:52:16.0948717Z                 ], 
2026-09-16T13:52:16.0948823Z                 "vars": {
2026-09-16T13:52:16.0948943Z                     "ansible_connection": "local"
2026-09-16T13:52:16.0949058Z                 }
2026-09-16T13:52:16.0949160Z             }
2026-09-16T13:52:16.0949260Z         }
2026-09-16T13:52:16.0949360Z     ]
2026-09-16T13:52:16.0949460Z }
2026-09-16T13:52:16.1165665Z Wednesday 16 September 2026  10:52:16 -0300 (0:00:00.076)       0:00:48.743 *** 
2026-09-16T13:52:16.1671691Z 
2026-09-16T13:52:16.1673151Z TASK [vm : Verificando os ambientes] *******************************************
2026-09-16T13:52:16.1673660Z ok: [127.0.0.1] => {
2026-09-16T13:52:16.1673838Z     "msg": [
2026-09-16T13:52:16.1674119Z         "Ambiente existentes! Servidores: caddeapllx1214.agil.nprd.caixa.gov.br, caddeapllx2798.agil.nprd.caixa.gov.br"
2026-09-16T13:52:16.1674825Z     ]
2026-09-16T13:52:16.1674980Z }
2026-09-16T13:52:16.1943906Z Wednesday 16 September 2026  10:52:16 -0300 (0:00:00.077)       0:00:48.821 *** 
2026-09-16T13:52:16.2898840Z 
2026-09-16T13:52:16.2899844Z TASK [vm : Recuperar ip] *******************************************************
2026-09-16T13:52:16.2900506Z ok: [127.0.0.1] => (item=caddeapllx1214.agil.nprd.caixa.gov.br)
2026-09-16T13:52:16.3178688Z ok: [127.0.0.1] => (item=caddeapllx2798.agil.nprd.caixa.gov.br)
2026-09-16T13:52:16.3431208Z Wednesday 16 September 2026  10:52:16 -0300 (0:00:00.148)       0:00:48.969 *** 
2026-09-16T13:52:16.4363842Z Wednesday 16 September 2026  10:52:16 -0300 (0:00:00.093)       0:00:49.063 *** 
2026-09-16T13:52:16.4888061Z 
2026-09-16T13:52:16.4889626Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-09-16T13:52:16.4890140Z ok: [127.0.0.1] => {
2026-09-16T13:52:16.4890885Z     "msg": [
2026-09-16T13:52:16.4891145Z         "Servidores: \\\"caddeapllx1214.agil.nprd.caixa.gov.br\\\", \\\"caddeapllx2798.agil.nprd.caixa.gov.br\\\"", 
2026-09-16T13:52:16.4891332Z         "IPs: \\\"10.116.195.38\\\", \\\"10.116.202.9\\\"", 
2026-09-16T13:52:16.4891505Z         "Gateways: \\\"10.116.192.1\\\", \\\"10.116.192.1\\\"", 
2026-09-16T13:52:16.4891673Z         "IPs Backup: \\\"192.168.213.137,10.188.254.113\\\", \\\"192.168.241.249\\\"", 
2026-09-16T13:52:16.4891971Z         "Servidores (OBJ): \\\"caddeapllx1214.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.195.38\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.213.137,10.188.254.113\\\"}, \\\"caddeapllx2798.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.202.9\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.241.249\\\"}"
2026-09-16T13:52:16.4892405Z     ]
2026-09-16T13:52:16.4892504Z }
2026-09-16T13:52:16.5159297Z Wednesday 16 September 2026  10:52:16 -0300 (0:00:00.079)       0:00:49.142 *** 
2026-09-16T13:52:17.4410633Z 
2026-09-16T13:52:17.4411920Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-09-16T13:52:17.4412345Z changed: [127.0.0.1]
2026-09-16T13:52:17.4482060Z 
2026-09-16T13:52:17.4482604Z PLAY [Configurando o DNS] ******************************************************
2026-09-16T13:52:17.6845791Z Wednesday 16 September 2026  10:52:17 -0300 (0:00:01.168)       0:00:50.311 *** 
2026-09-16T13:52:17.8428004Z 
2026-09-16T13:52:17.8429211Z TASK [Consultar DNS] ***********************************************************
2026-09-16T13:52:17.8429560Z changed: [10.116.193.77] => (item=caddeapllx1214.agil.nprd.caixa.gov.br)
2026-09-16T13:52:17.9810538Z changed: [10.116.193.77] => (item=caddeapllx2798.agil.nprd.caixa.gov.br)
2026-09-16T13:52:17.9869894Z Wednesday 16 September 2026  10:52:17 -0300 (0:00:00.302)       0:00:50.614 *** 
2026-09-16T13:52:18.0582043Z 
2026-09-16T13:52:18.0583085Z TASK [Verificar se o domínio resolve para um IP] *******************************
2026-09-16T13:52:18.0584171Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-09-16 10:52:17.826101', u'stdout': u'10.116.195.38', u'item': u'caddeapllx1214.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx1214.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.012148', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx1214.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.195.38'], u'start': u'2026-09-16 10:52:17.813953'}) => {
2026-09-16T13:52:18.0584917Z     "msg": "O domínio caddeapllx1214.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.195.38']"
2026-09-16T13:52:18.0585081Z }
2026-09-16T13:52:18.0773100Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-09-16 10:52:17.965018', u'stdout': u'10.116.202.9', u'item': u'caddeapllx2798.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2798.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.011851', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2798.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.202.9'], u'start': u'2026-09-16 10:52:17.953167'}) => {
2026-09-16T13:52:18.0773983Z     "msg": "O domínio caddeapllx2798.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.202.9']"
2026-09-16T13:52:18.0774498Z }
2026-09-16T13:52:18.0821236Z Wednesday 16 September 2026  10:52:18 -0300 (0:00:00.095)       0:00:50.709 *** 
2026-09-16T13:52:18.1403808Z Wednesday 16 September 2026  10:52:18 -0300 (0:00:00.057)       0:00:50.767 *** 
2026-09-16T13:52:18.1980544Z Wednesday 16 September 2026  10:52:18 -0300 (0:00:00.057)       0:00:50.824 *** 
2026-09-16T13:52:18.2857047Z 
2026-09-16T13:52:18.2857874Z TASK [Set created DNS] *********************************************************
2026-09-16T13:52:18.2859551Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-09-16 10:52:17.826101', u'stdout': u'10.116.195.38', u'item': u'caddeapllx1214.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx1214.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.012148', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx1214.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.195.38'], u'start': u'2026-09-16 10:52:17.813953'})
2026-09-16T13:52:18.3075757Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-09-16 10:52:17.965018', u'stdout': u'10.116.202.9', u'item': u'caddeapllx2798.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2798.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.011851', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2798.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.202.9'], u'start': u'2026-09-16 10:52:17.953167'})
2026-09-16T13:52:18.3134463Z Wednesday 16 September 2026  10:52:18 -0300 (0:00:00.115)       0:00:50.940 *** 
2026-09-16T13:52:18.4034689Z 
2026-09-16T13:52:18.4035346Z PLAY [local] *******************************************************************
2026-09-16T13:52:18.4074401Z 
2026-09-16T13:52:18.4074849Z PLAY [Verificando serviços] ****************************************************
2026-09-16T13:52:18.4163554Z 
2026-09-16T13:52:18.4163870Z PLAY [Configuração LDAP] *******************************************************
2026-09-16T13:52:18.4194719Z [WARNING]: Found variable using reserved name: when
2026-09-16T13:52:18.4200307Z 
2026-09-16T13:52:18.4200481Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4291000Z 
2026-09-16T13:52:18.4291693Z PLAY [Stack Jboss] *************************************************************
2026-09-16T13:52:18.4323133Z 
2026-09-16T13:52:18.4323727Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4366179Z 
2026-09-16T13:52:18.4366535Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4410028Z 
2026-09-16T13:52:18.4410371Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4438984Z 
2026-09-16T13:52:18.4439650Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-16T13:52:18.4469258Z 
2026-09-16T13:52:18.4469870Z PLAY [Copiando modules adicionais] *********************************************
2026-09-16T13:52:18.4497497Z 
2026-09-16T13:52:18.4497806Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4535196Z 
2026-09-16T13:52:18.4535655Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4564629Z 
2026-09-16T13:52:18.4565396Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4599114Z 
2026-09-16T13:52:18.4599558Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4631058Z 
2026-09-16T13:52:18.4631468Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4660127Z 
2026-09-16T13:52:18.4660706Z PLAY [local] *******************************************************************
2026-09-16T13:52:18.4688703Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-16T13:52:18.4691515Z 
2026-09-16T13:52:18.4691844Z PLAY [instance_restart] ********************************************************
2026-09-16T13:52:18.4692017Z skipping: no hosts matched
2026-09-16T13:52:18.4694472Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-16T13:52:18.4697387Z 
2026-09-16T13:52:18.4697800Z PLAY [machine_reboot] **********************************************************
2026-09-16T13:52:18.4697991Z skipping: no hosts matched
2026-09-16T13:52:18.4704059Z 
2026-09-16T13:52:18.4704318Z PLAY [local] *******************************************************************
2026-09-16T13:52:18.4729998Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-16T13:52:18.4732908Z 
2026-09-16T13:52:18.4733256Z PLAY [instance_stop] ***********************************************************
2026-09-16T13:52:18.4733445Z skipping: no hosts matched
2026-09-16T13:52:18.4735986Z 
2026-09-16T13:52:18.4736440Z PLAY [machine_reboot] **********************************************************
2026-09-16T13:52:18.4736964Z skipping: no hosts matched
2026-09-16T13:52:18.4742432Z 
2026-09-16T13:52:18.4742711Z PLAY [local] *******************************************************************
2026-09-16T13:52:18.4777523Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-09-16T13:52:18.4780286Z 
2026-09-16T13:52:18.4780530Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-09-16T13:52:18.4780700Z skipping: no hosts matched
2026-09-16T13:52:18.4787309Z 
2026-09-16T13:52:18.4787568Z PLAY [local] *******************************************************************
2026-09-16T13:52:18.4809135Z 
2026-09-16T13:52:18.4809578Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-09-16T13:52:18.4810000Z skipping: no hosts matched
2026-09-16T13:52:18.4818152Z 
2026-09-16T13:52:18.4818423Z PLAY [Configura TSM] ***********************************************************
2026-09-16T13:52:18.4845728Z 
2026-09-16T13:52:18.4846037Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4878758Z 
2026-09-16T13:52:18.4879341Z PLAY [Configura Control-M] *****************************************************
2026-09-16T13:52:18.4915618Z 
2026-09-16T13:52:18.4917489Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.4963796Z 
2026-09-16T13:52:18.4964438Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.5010850Z 
2026-09-16T13:52:18.5011400Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.5036828Z 
2026-09-16T13:52:18.5037322Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.5067164Z 
2026-09-16T13:52:18.5067516Z PLAY [localhost] ***************************************************************
2026-09-16T13:52:18.5092412Z 
2026-09-16T13:52:18.5092720Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.5138232Z 
2026-09-16T13:52:18.5138629Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.5180719Z 
2026-09-16T13:52:18.5181042Z PLAY [jboss] *******************************************************************
2026-09-16T13:52:18.5215709Z 
2026-09-16T13:52:18.5215982Z PLAY RECAP *********************************************************************
2026-09-16T13:52:18.5216188Z 10.116.193.77              : ok=3    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-09-16T13:52:18.5216384Z 10.116.193.78              : ok=0    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-09-16T13:52:18.5216577Z 127.0.0.1                  : ok=41   changed=5    unreachable=0    failed=0    skipped=10   rescued=0    ignored=0   
2026-09-16T13:52:18.5216770Z 
2026-09-16T13:52:18.5219023Z Wednesday 16 September 2026  10:52:18 -0300 (0:00:00.208)       0:00:51.149 *** 
2026-09-16T13:52:18.5219381Z =============================================================================== 
2026-09-16T13:52:18.5222156Z Gathering Facts -------------------------------------------------------- 27.75s
2026-09-16T13:52:18.5222639Z vm : Executar script para marcar VM como template ---------------------- 12.84s
2026-09-16T13:52:18.5223075Z vm : Criando arquivo para exportar as variáveis ------------------------- 1.17s
2026-09-16T13:52:18.5223479Z vm : Instalar dependências Python para vCenter -------------------------- 0.89s
2026-09-16T13:52:18.5223869Z vm : execute create_ip_bck script --------------------------------------- 0.83s
2026-09-16T13:52:18.5224252Z vm : Consultar API ------------------------------------------------------ 0.71s
2026-09-16T13:52:18.5224644Z vm : Run Invetory All --------------------------------------------------- 0.57s
2026-09-16T13:52:18.5225029Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.53s
2026-09-16T13:52:18.5225416Z vm : Run Invetory All --------------------------------------------------- 0.46s
2026-09-16T13:52:18.5225780Z vm : Consultar API ------------------------------------------------------ 0.44s
2026-09-16T13:52:18.5226164Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.37s
2026-09-16T13:52:18.5226908Z vm : Coletar variáveis de ambiente -------------------------------------- 0.33s
2026-09-16T13:52:18.5227296Z Consultar DNS ----------------------------------------------------------- 0.30s
2026-09-16T13:52:18.5227681Z include_role : dns ------------------------------------------------------ 0.21s
2026-09-16T13:52:18.5228069Z vm : Recuperar ip ------------------------------------------------------- 0.15s
2026-09-16T13:52:18.5228442Z Set created DNS --------------------------------------------------------- 0.12s
2026-09-16T13:52:18.5228826Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-09-16T13:52:18.5229207Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-09-16T13:52:18.5229586Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-09-16T13:52:18.5229956Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-09-16T13:52:18.5230250Z Playbook run took 0 days, 0 hours, 0 minutes, 51 seconds
2026-09-16T13:52:18.6414360Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)






2026-09-16T14:03:07.0266327Z ##[section]Starting: Configura Control-M
2026-09-16T14:03:07.0269333Z ==============================================================================
2026-09-16T14:03:07.0269420Z Task         : Bash
2026-09-16T14:03:07.0269467Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-16T14:03:07.0269547Z Version      : 3.227.0
2026-09-16T14:03:07.0269597Z Author       : Microsoft Corporation
2026-09-16T14:03:07.0269663Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-16T14:03:07.0269749Z ==============================================================================
2026-09-16T14:03:07.6332918Z Generating script.
2026-09-16T14:03:07.6344923Z ========================== Starting Command Output ===========================
2026-09-16T14:03:07.6353387Z [command]/bin/bash /opt/ads-agent/_work/_temp/4ce2fa26-6bd7-4794-9064-c5b785560df4.sh
2026-09-16T14:03:08.2714448Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r11884/a/esteira-jboss-
2026-09-16T14:03:08.2715125Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-09-16T14:03:08.2716372Z /ads-agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-09-16T14:03:08.2716779Z had an execution error:
2026-09-16T14:03:08.2717158Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r11884/a/esteira-jboss-
2026-09-16T14:03:08.2717610Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-09-16T14:03:08.2718464Z agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-09-16T14:03:08.2718721Z Expected key=value host variable assignment, got: os
2026-09-16T14:03:08.2719014Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-09-16T14:03:08.2914020Z ##[error]Bash exited with code '1'.
2026-09-16T14:03:08.2922167Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-09-16T14:03:09.3698473Z Generating script.
2026-09-16T14:03:09.3708369Z ========================== Starting Command Output ===========================
2026-09-16T14:03:09.3715118Z [command]/bin/bash /opt/ads-agent/_work/_temp/b3c2f262-3096-41fd-ba6c-3c6b012dd8dc.sh
2026-09-16T14:03:10.0133752Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r11884/a/esteira-jboss-
2026-09-16T14:03:10.0134127Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-09-16T14:03:10.0134375Z /ads-agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-09-16T14:03:10.0134564Z had an execution error:
2026-09-16T14:03:10.0134777Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r11884/a/esteira-jboss-
2026-09-16T14:03:10.0134994Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-09-16T14:03:10.0135244Z agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-09-16T14:03:10.0135413Z Expected key=value host variable assignment, got: os
2026-09-16T14:03:10.0135704Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-09-16T14:03:10.0308599Z ##[error]Bash exited with code '1'.
2026-09-16T14:03:10.0334520Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-09-16T14:03:14.1126712Z Generating script.
2026-09-16T14:03:14.1138465Z ========================== Starting Command Output ===========================
2026-09-16T14:03:14.1146858Z [command]/bin/bash /opt/ads-agent/_work/_temp/a06c7879-dd5e-4ff9-8a5c-876284f8daf4.sh
2026-09-16T14:03:14.7434183Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r11884/a/esteira-jboss-
2026-09-16T14:03:14.7434508Z vm-v2/inventory/inventory_portal.py with script plugin: Inventory script (/opt
2026-09-16T14:03:14.7434752Z /ads-agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py)
2026-09-16T14:03:14.7434928Z had an execution error:
2026-09-16T14:03:14.7435139Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r11884/a/esteira-jboss-
2026-09-16T14:03:14.7435595Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-09-16T14:03:14.7435848Z agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-09-16T14:03:14.7436025Z Expected key=value host variable assignment, got: os
2026-09-16T14:03:14.7436308Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-09-16T14:03:14.7628359Z ##[error]Bash exited with code '1'.
2026-09-16T14:03:14.7640060Z ##[section]Finishing: Configura Control-M
