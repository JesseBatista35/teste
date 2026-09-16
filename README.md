2026-09-15T21:09:42.8755208Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-09-15T21:09:42.8758123Z ==============================================================================
2026-09-15T21:09:42.8758264Z Task         : Bash
2026-09-15T21:09:42.8758312Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-15T21:09:42.8758386Z Version      : 3.227.0
2026-09-15T21:09:42.8758435Z Author       : Microsoft Corporation
2026-09-15T21:09:42.8758497Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-15T21:09:42.8758572Z ==============================================================================
2026-09-15T21:09:43.8975813Z Generating script.
2026-09-15T21:09:43.8985815Z ========================== Starting Command Output ===========================
2026-09-15T21:09:43.8993005Z [command]/bin/bash /opt/ads-agent/_work/_temp/1243fee9-d2d4-4968-ab91-c3857695acbb.sh
2026-09-15T21:09:45.8517047Z 
2026-09-15T21:09:45.8517673Z PLAY [local] *******************************************************************
2026-09-15T21:09:45.8748230Z Tuesday 15 September 2026  18:09:45 -0300 (0:00:00.081)       0:00:00.081 ***** 
2026-09-15T21:10:12.0737872Z 
2026-09-15T21:10:12.0738397Z TASK [Gathering Facts] *********************************************************
2026-09-15T21:10:12.0739210Z ok: [127.0.0.1]
2026-09-15T21:10:12.1052559Z Tuesday 15 September 2026  18:10:12 -0300 (0:00:26.230)       0:00:26.312 ***** 
2026-09-15T21:10:12.1841330Z Tuesday 15 September 2026  18:10:12 -0300 (0:00:00.078)       0:00:26.391 ***** 
2026-09-15T21:10:12.2552395Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r11884/a
2026-09-15T21:10:12.2552920Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-09-15T21:10:12.2553520Z duplicate dict key (include_tasks). Using last defined value only.
2026-09-15T21:10:12.2654503Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-09-15T21:10:12.2899751Z Tuesday 15 September 2026  18:10:12 -0300 (0:00:00.105)       0:00:26.497 ***** 
2026-09-15T21:10:12.3578230Z 
2026-09-15T21:10:12.3578916Z TASK [vm : Cria variável build_repository_name] ********************************
2026-09-15T21:10:12.3579110Z ok: [127.0.0.1]
2026-09-15T21:10:12.3888421Z Tuesday 15 September 2026  18:10:12 -0300 (0:00:00.098)       0:00:26.595 ***** 
2026-09-15T21:10:13.1287882Z 
2026-09-15T21:10:13.1288848Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-09-15T21:10:13.1289232Z ok: [127.0.0.1]
2026-09-15T21:10:13.1618625Z Tuesday 15 September 2026  18:10:13 -0300 (0:00:00.773)       0:00:27.368 ***** 
2026-09-15T21:10:22.1217567Z 
2026-09-15T21:10:22.1218419Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-09-15T21:10:22.1218647Z changed: [127.0.0.1]
2026-09-15T21:10:22.1452501Z Tuesday 15 September 2026  18:10:22 -0300 (0:00:08.982)       0:00:36.351 ***** 
2026-09-15T21:10:22.2211677Z 
2026-09-15T21:10:22.2212195Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-09-15T21:10:22.2212419Z ok: [127.0.0.1] => {
2026-09-15T21:10:22.2212556Z     "msg": [
2026-09-15T21:10:22.2212689Z         "Iniciando registro do template VMTX...", 
2026-09-15T21:10:22.2214438Z         "vCenter: 10.122.144.195", 
2026-09-15T21:10:22.2214892Z         "Template: controlm9p-openjdk17-rhel93-v006_CLONE", 
2026-09-15T21:10:22.2216322Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] controlm9p-openjdk17-rhel93-v006_CLONE/controlm9p-openjdk17-rhel93-v006_CLONE.vmtx", 
2026-09-15T21:10:22.2217605Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-09-15T21:10:22.2219124Z         "Template 'controlm9p-openjdk17-rhel93-v006_CLONE' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-09-15T21:10:22.2219668Z         "Operacao concluida com sucesso."
2026-09-15T21:10:22.2219886Z     ]
2026-09-15T21:10:22.2220092Z }
2026-09-15T21:10:22.2462985Z Tuesday 15 September 2026  18:10:22 -0300 (0:00:00.101)       0:00:36.453 ***** 
2026-09-15T21:10:22.3237826Z 
2026-09-15T21:10:22.3239160Z TASK [vm : Cria variável ansible] **********************************************
2026-09-15T21:10:22.3239882Z ok: [127.0.0.1]
2026-09-15T21:10:22.3470987Z Tuesday 15 September 2026  18:10:22 -0300 (0:00:00.100)       0:00:36.553 ***** 
2026-09-15T21:10:22.8549146Z 
2026-09-15T21:10:22.8550106Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-09-15T21:10:22.8550282Z ok: [127.0.0.1]
2026-09-15T21:10:22.8798255Z Tuesday 15 September 2026  18:10:22 -0300 (0:00:00.532)       0:00:37.086 ***** 
2026-09-15T21:10:23.2112277Z 
2026-09-15T21:10:23.2113123Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-09-15T21:10:23.2113296Z ok: [127.0.0.1]
2026-09-15T21:10:23.2371413Z Tuesday 15 September 2026  18:10:23 -0300 (0:00:00.357)       0:00:37.443 ***** 
2026-09-15T21:10:23.3032251Z Tuesday 15 September 2026  18:10:23 -0300 (0:00:00.065)       0:00:37.509 ***** 
2026-09-15T21:10:23.3980779Z Tuesday 15 September 2026  18:10:23 -0300 (0:00:00.094)       0:00:37.604 ***** 
2026-09-15T21:10:23.4444825Z 
2026-09-15T21:10:23.4445888Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-09-15T21:10:23.4446222Z ok: [127.0.0.1]
2026-09-15T21:10:23.4682597Z Tuesday 15 September 2026  18:10:23 -0300 (0:00:00.070)       0:00:37.675 ***** 
2026-09-15T21:10:23.5468748Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-09-15T21:10:23.5772779Z Tuesday 15 September 2026  18:10:23 -0300 (0:00:00.108)       0:00:37.784 ***** 
2026-09-15T21:10:23.6420017Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-09-15T21:10:23.6750414Z Tuesday 15 September 2026  18:10:23 -0300 (0:00:00.097)       0:00:37.881 ***** 
2026-09-15T21:10:24.3311584Z 
2026-09-15T21:10:24.3312546Z TASK [vm : Consultar API] ******************************************************
2026-09-15T21:10:24.3312876Z ok: [127.0.0.1]
2026-09-15T21:10:24.3568963Z Tuesday 15 September 2026  18:10:24 -0300 (0:00:00.681)       0:00:38.563 ***** 
2026-09-15T21:10:24.4028713Z 
2026-09-15T21:10:24.4029452Z TASK [vm : Parse JSON] *********************************************************
2026-09-15T21:10:24.4029613Z ok: [127.0.0.1]
2026-09-15T21:10:24.4265726Z Tuesday 15 September 2026  18:10:24 -0300 (0:00:00.069)       0:00:38.633 ***** 
2026-09-15T21:10:24.4958049Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-09-15T21:10:24.5294715Z Tuesday 15 September 2026  18:10:24 -0300 (0:00:00.102)       0:00:38.736 ***** 
2026-09-15T21:10:24.9482736Z 
2026-09-15T21:10:24.9483735Z TASK [vm : Consultar API] ******************************************************
2026-09-15T21:10:24.9484129Z ok: [127.0.0.1]
2026-09-15T21:10:24.9744603Z Tuesday 15 September 2026  18:10:24 -0300 (0:00:00.445)       0:00:39.181 ***** 
2026-09-15T21:10:25.0438747Z 
2026-09-15T21:10:25.0440062Z TASK [vm : Parse JSON] *********************************************************
2026-09-15T21:10:25.0440385Z ok: [127.0.0.1]
2026-09-15T21:10:25.0680187Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.093)       0:00:39.274 ***** 
2026-09-15T21:10:25.1384505Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.070)       0:00:39.345 ***** 
2026-09-15T21:10:25.2047996Z 
2026-09-15T21:10:25.2048698Z TASK [vm : Exibir size servidores.] ********************************************
2026-09-15T21:10:25.2051582Z ok: [127.0.0.1] => {
2026-09-15T21:10:25.2051840Z     "api_data.dados.0": {
2026-09-15T21:10:25.2051998Z         "ambiente": "des", 
2026-09-15T21:10:25.2052134Z         "cluster": "CTC_NPRDXF2488HV7_NPRD", 
2026-09-15T21:10:25.2054088Z         "cluster_principal": "", 
2026-09-15T21:10:25.2054694Z         "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD", 
2026-09-15T21:10:25.2054992Z         "cpu": 4, 
2026-09-15T21:10:25.2055184Z         "datacenter": "NPRD", 
2026-09-15T21:10:25.2055889Z         "datastore": "CTCHWNPRDPC03_0047", 
2026-09-15T21:10:25.2056100Z         "detalhe_imagem": null, 
2026-09-15T21:10:25.2056409Z         "disco_log": 2, 
2026-09-15T21:10:25.2056688Z         "disco_opt": 10, 
2026-09-15T21:10:25.2056929Z         "domain": "agil.nprd.caixa.gov.br", 
2026-09-15T21:10:25.2057496Z         "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0", 
2026-09-15T21:10:25.2057829Z         "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep", 
2026-09-15T21:10:25.2058163Z         "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep", 
2026-09-15T21:10:25.2058405Z         "esx_vcenter_server": "10.122.144.195", 
2026-09-15T21:10:25.2058602Z         "farm": null, 
2026-09-15T21:10:25.2058777Z         "id": 2128, 
2026-09-15T21:10:25.2059058Z         "inclusao": "2021-12-10 15:47:02", 
2026-09-15T21:10:25.2059275Z         "info_framework": null, 
2026-09-15T21:10:25.2059468Z         "info_linguagem": null, 
2026-09-15T21:10:25.2059659Z         "info_tecnologia": null, 
2026-09-15T21:10:25.2059854Z         "info_versao": null, 
2026-09-15T21:10:25.2060042Z         "ipbackup": "192.168.241.249", 
2026-09-15T21:10:25.2060254Z         "jboss_apache_status": "ativado", 
2026-09-15T21:10:25.2060445Z         "memoria": 8, 
2026-09-15T21:10:25.2060635Z         "net_adapter_type": "vmxnet3", 
2026-09-15T21:10:25.2060831Z         "nome_imagem": null, 
2026-09-15T21:10:25.2061104Z         "objeto_origem": "SIIFX-CONTROLM_DES__SERVIDOR", 
2026-09-15T21:10:25.2061318Z         "plataforma": "vm", 
2026-09-15T21:10:25.2061501Z         "produto": "jboss", 
2026-09-15T21:10:25.2061686Z         "recursos_max_id": null, 
2026-09-15T21:10:25.2061875Z         "servidores_json": [
2026-09-15T21:10:25.2062043Z             {
2026-09-15T21:10:25.2062213Z                 "ip": "10.116.202.9", 
2026-09-15T21:10:25.2062433Z                 "nome": "caddeapllx2798.agil.nprd.caixa.gov.br"
2026-09-15T21:10:25.2062640Z             }
2026-09-15T21:10:25.2062796Z         ], 
2026-09-15T21:10:25.2063035Z         "sistema": "siifx-batch-vm", 
2026-09-15T21:10:25.2063227Z         "site": "ctc_nprd", 
2026-09-15T21:10:25.2063418Z         "solicitacoes_id": 4924, 
2026-09-15T21:10:25.2063613Z         "status": "ativado", 
2026-09-15T21:10:25.2063787Z         "terraform": true, 
2026-09-15T21:10:25.2063978Z         "versao_imagem": null, 
2026-09-15T21:10:25.2064171Z         "versao_plataforma": "1.0", 
2026-09-15T21:10:25.2064360Z         "vm_dns": [
2026-09-15T21:10:25.2064535Z             "10.116.193.77", 
2026-09-15T21:10:25.2064714Z             "10.116.193.78"
2026-09-15T21:10:25.2064878Z         ], 
2026-09-15T21:10:25.2065053Z         "vm_ipnetmask": 19, 
2026-09-15T21:10:25.2065240Z         "vm_ipnetmask_bck": 19, 
2026-09-15T21:10:25.2065443Z         "vm_ipnetmask_bck_01": 16, 
2026-09-15T21:10:25.2065637Z         "vsphere_folder": "/vm", 
2026-09-15T21:10:25.2065847Z         "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-09-15T21:10:25.2066033Z     }
2026-09-15T21:10:25.2066178Z }
2026-09-15T21:10:25.2308410Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.092)       0:00:39.437 ***** 
2026-09-15T21:10:25.2968749Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.065)       0:00:39.503 ***** 
2026-09-15T21:10:25.3479733Z 
2026-09-15T21:10:25.3481046Z TASK [vm : Set size] ***********************************************************
2026-09-15T21:10:25.3481390Z ok: [127.0.0.1]
2026-09-15T21:10:25.3709482Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.074)       0:00:39.577 ***** 
2026-09-15T21:10:25.4176675Z 
2026-09-15T21:10:25.4178083Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-09-15T21:10:25.4178295Z ok: [127.0.0.1]
2026-09-15T21:10:25.4414316Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.070)       0:00:39.648 ***** 
2026-09-15T21:10:25.4870799Z 
2026-09-15T21:10:25.4871733Z TASK [vm : debug] **************************************************************
2026-09-15T21:10:25.4872067Z ok: [127.0.0.1] => {
2026-09-15T21:10:25.4872942Z     "template_name": "controlm9p-openjdk17-rhel93-v006_CLONE"
2026-09-15T21:10:25.4873548Z }
2026-09-15T21:10:25.5111837Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.069)       0:00:39.717 ***** 
2026-09-15T21:10:25.5587865Z 
2026-09-15T21:10:25.5590375Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-09-15T21:10:25.5590773Z ok: [127.0.0.1]
2026-09-15T21:10:25.5808749Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.070)       0:00:39.787 ***** 
2026-09-15T21:10:25.6479901Z Tuesday 15 September 2026  18:10:25 -0300 (0:00:00.067)       0:00:39.854 ***** 
2026-09-15T21:10:26.1202212Z 
2026-09-15T21:10:26.1203230Z TASK [vm : Run Invetory All] ***************************************************
2026-09-15T21:10:26.1203573Z changed: [127.0.0.1]
2026-09-15T21:10:26.1445327Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.496)       0:00:40.351 ***** 
2026-09-15T21:10:26.1952951Z 
2026-09-15T21:10:26.1953816Z TASK [vm : Parse JSON output] **************************************************
2026-09-15T21:10:26.1954144Z ok: [127.0.0.1]
2026-09-15T21:10:26.2197276Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.075)       0:00:40.426 ***** 
2026-09-15T21:10:26.2659187Z 
2026-09-15T21:10:26.2659847Z TASK [vm : Count the number of hosts] ******************************************
2026-09-15T21:10:26.2660015Z ok: [127.0.0.1]
2026-09-15T21:10:26.2897998Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.070)       0:00:40.496 ***** 
2026-09-15T21:10:26.3580985Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.067)       0:00:40.564 ***** 
2026-09-15T21:10:26.4240978Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.066)       0:00:40.630 ***** 
2026-09-15T21:10:26.4694954Z 
2026-09-15T21:10:26.4695862Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-09-15T21:10:26.4696124Z ok: [127.0.0.1] => {
2026-09-15T21:10:26.4696300Z     "msg": [
2026-09-15T21:10:26.4696470Z         "num_hosts: 1"
2026-09-15T21:10:26.4696749Z     ]
2026-09-15T21:10:26.4696931Z }
2026-09-15T21:10:26.4959628Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.072)       0:00:40.702 ***** 
2026-09-15T21:10:26.5654159Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.069)       0:00:40.771 ***** 
2026-09-15T21:10:26.6382375Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.072)       0:00:40.844 ***** 
2026-09-15T21:10:26.7053225Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-09-15T21:10:26.7418291Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.103)       0:00:40.948 ***** 
2026-09-15T21:10:26.8091243Z included: /opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-09-15T21:10:26.8318716Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.089)       0:00:41.038 ***** 
2026-09-15T21:10:26.8801495Z 
2026-09-15T21:10:26.8802906Z TASK [vm : Criar variáveis] ****************************************************
2026-09-15T21:10:26.8803118Z ok: [127.0.0.1]
2026-09-15T21:10:26.9279293Z Tuesday 15 September 2026  18:10:26 -0300 (0:00:00.095)       0:00:41.134 ***** 
2026-09-15T21:10:27.2566143Z 
2026-09-15T21:10:27.2567200Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-09-15T21:10:27.2567387Z ok: [127.0.0.1]
2026-09-15T21:10:27.2865449Z Tuesday 15 September 2026  18:10:27 -0300 (0:00:00.358)       0:00:41.493 ***** 
2026-09-15T21:10:27.3410196Z 
2026-09-15T21:10:27.3411198Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-09-15T21:10:27.3411546Z ok: [127.0.0.1] => {
2026-09-15T21:10:27.3411885Z     "nfs_vars_json": {
2026-09-15T21:10:27.3412153Z         "changed": false, 
2026-09-15T21:10:27.3413260Z         "cmd": "cat /opt/ads-agent/_work/r11884/a/nfs_config.json", 
2026-09-15T21:10:27.3413531Z         "delta": "0:00:00.003679", 
2026-09-15T21:10:27.3413738Z         "end": "2026-09-15 18:10:27.236693", 
2026-09-15T21:10:27.3413876Z         "failed": false, 
2026-09-15T21:10:27.3414433Z         "rc": 0, 
2026-09-15T21:10:27.3414616Z         "start": "2026-09-15 18:10:27.233014", 
2026-09-15T21:10:27.3414849Z         "stderr": "", 
2026-09-15T21:10:27.3414969Z         "stderr_lines": [], 
2026-09-15T21:10:27.3415660Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]", 
2026-09-15T21:10:27.3416066Z         "stdout_lines": [
2026-09-15T21:10:27.3416846Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-15T21:10:27.3417194Z         ]
2026-09-15T21:10:27.3417296Z     }
2026-09-15T21:10:27.3417395Z }
2026-09-15T21:10:27.3657050Z Tuesday 15 September 2026  18:10:27 -0300 (0:00:00.079)       0:00:41.572 ***** 
2026-09-15T21:10:27.4288889Z 
2026-09-15T21:10:27.4289864Z TASK [vm : Criar variáveis] ****************************************************
2026-09-15T21:10:27.4290044Z ok: [127.0.0.1]
2026-09-15T21:10:27.4541906Z Tuesday 15 September 2026  18:10:27 -0300 (0:00:00.088)       0:00:41.661 ***** 
2026-09-15T21:10:28.2726961Z 
2026-09-15T21:10:28.2727924Z TASK [vm : execute create_ip_bck script] ***************************************
2026-09-15T21:10:28.2728394Z changed: [127.0.0.1]
2026-09-15T21:10:28.2982839Z Tuesday 15 September 2026  18:10:28 -0300 (0:00:00.844)       0:00:42.505 ***** 
2026-09-15T21:10:28.3507296Z 
2026-09-15T21:10:28.3508148Z TASK [vm : ansible.builtin.debug] **********************************************
2026-09-15T21:10:28.3515670Z ok: [127.0.0.1] => {
2026-09-15T21:10:28.3517208Z     "changed": false, 
2026-09-15T21:10:28.3518356Z     "msg": {
2026-09-15T21:10:28.3518646Z         "changed": true, 
2026-09-15T21:10:28.3518942Z         "cmd": [
2026-09-15T21:10:28.3520281Z             "python", 
2026-09-15T21:10:28.3520748Z             "/opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-09-15T21:10:28.3522301Z             "create_ip_bck", 
2026-09-15T21:10:28.3523626Z             "siifx-batch-vm", 
2026-09-15T21:10:28.3524083Z             "des", 
2026-09-15T21:10:28.3524594Z             "ctc_nprd", 
2026-09-15T21:10:28.3524964Z             "/opt/ads-agent/_work/r11884/a/esteira-jboss-vm-v2", 
2026-09-15T21:10:28.3525140Z             "C&t@d02", 
2026-09-15T21:10:28.3525352Z             "***", 
2026-09-15T21:10:28.3525480Z             "s736651@corp.caixa.gov.br", 
2026-09-15T21:10:28.3525611Z             "***", 
2026-09-15T21:10:28.3526322Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_3\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF\",\"NFS_MOUNT_POINT_ISILON_3\": \"/SIIFX_SIISF\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"},{\"NFS_ENDPOINT_ISILON_4\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA\",\"NFS_MOUNT_POINT_ISILON_4\": \"/SIIFX_SIGMS\"}]"
2026-09-15T21:10:28.3526834Z         ], 
2026-09-15T21:10:28.3527418Z         "delta": "0:00:00.508031", 
2026-09-15T21:10:28.3527661Z         "end": "2026-09-15 18:10:28.251107", 
2026-09-15T21:10:28.3527891Z         "failed": false, 
2026-09-15T21:10:28.3528008Z         "rc": 0, 
2026-09-15T21:10:28.3528187Z         "start": "2026-09-15 18:10:27.743076", 
2026-09-15T21:10:28.3528313Z         "stderr": "", 
2026-09-15T21:10:28.3528422Z         "stderr_lines": [], 
2026-09-15T21:10:28.3537722Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nNFS ENDPOINT: {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS', u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_MOUNT_POINT_ISILON': u'/SIIFX'}\nVariaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'), (u'NFS_MOUNT_POINT_ISILON', u'/SIIFX')), ((u'NFS_ENDPOINT_ISILON_2', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'), (u'NFS_MOUNT_POINT_ISILON_2', u'/SIIFX_B2B')), ((u'NFS_ENDPOINT_ISILON_3', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'), (u'NFS_MOUNT_POINT_ISILON_3', u'/SIIFX_SIISF')), ((u'NFS_ENDPOINT_ISILON_4', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA'), (u'NFS_MOUNT_POINT_ISILON_4', u'/SIIFX_SIGMS'))]\nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH/SIIFXISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX/SIIFX_B2BISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                \nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF/SIIFX_SIISFISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                \nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA/SIIFX_SIGMSISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-15T21:10:28.3542812Z         "stdout_lines": [
2026-09-15T21:10:28.3543523Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}, {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS'}]", 
2026-09-15T21:10:28.3544084Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-09-15T21:10:28.3544479Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-09-15T21:10:28.3545296Z             "NFS ENDPOINT: {u'NFS_ENDPOINT_ISILON_4': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA', u'NFS_ENDPOINT_ISILON_3': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON_4': u'/SIIFX_SIGMS', u'NFS_MOUNT_POINT_ISILON_3': u'/SIIFX_SIISF', u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_MOUNT_POINT_ISILON': u'/SIIFX'}", 
2026-09-15T21:10:28.3546252Z             "Variaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'), (u'NFS_MOUNT_POINT_ISILON', u'/SIIFX')), ((u'NFS_ENDPOINT_ISILON_2', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'), (u'NFS_MOUNT_POINT_ISILON_2', u'/SIIFX_B2B')), ((u'NFS_ENDPOINT_ISILON_3', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF'), (u'NFS_MOUNT_POINT_ISILON_3', u'/SIIFX_SIISF')), ((u'NFS_ENDPOINT_ISILON_4', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA'), (u'NFS_MOUNT_POINT_ISILON_4', u'/SIIFX_SIGMS'))]", 
2026-09-15T21:10:28.3546916Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH/SIIFXISILONnfsctcnprd.ctc.caixades", 
2026-09-15T21:10:28.3548622Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-15T21:10:28.3549617Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-15T21:10:28.3549838Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX/SIIFX_B2BISILONnfsctcnprd.ctc.caixades", 
2026-09-15T21:10:28.3551548Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-15T21:10:28.3552445Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-15T21:10:28.3552662Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF/SIIFX_SIISFISILONnfsctcnprd.ctc.caixades", 
2026-09-15T21:10:28.3554479Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-15T21:10:28.3555329Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIISF /SIIFX_SIISF                        ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-09-15T21:10:28.3555546Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA/SIIFX_SIGMSISILONnfsctcnprd.ctc.caixades", 
2026-09-15T21:10:28.3557293Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2021-12-10 15:47:02', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 2128, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'ip': u'10.116.202.9', u'nome': u'caddeapllx2798.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIIFX-CONTROLM_DES__SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': 4924, u'memoria': 8, u'farm': None, u'versao_plataforma': u'1.0', u'vm_ipnetmask_bck_01': 16, u'sistema': u'siifx-batch-vm', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'des', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.241.249', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 4}]", 
2026-09-15T21:10:28.3558124Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIGMS_ESTEIRA /SIIFX_SIGMS                        ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-09-15T21:10:28.3558281Z         ]
2026-09-15T21:10:28.3558385Z     }
2026-09-15T21:10:28.3558492Z }
2026-09-15T21:10:28.3751238Z Tuesday 15 September 2026  18:10:28 -0300 (0:00:00.076)       0:00:42.581 ***** 
2026-09-15T21:10:28.8271196Z 
2026-09-15T21:10:28.8272758Z TASK [vm : Run Invetory All] ***************************************************
2026-09-15T21:10:28.8273801Z changed: [127.0.0.1]
2026-09-15T21:10:28.8508860Z Tuesday 15 September 2026  18:10:28 -0300 (0:00:00.475)       0:00:43.057 ***** 
2026-09-15T21:10:28.9048871Z 
2026-09-15T21:10:28.9050220Z TASK [vm : Parse JSON output] **************************************************
2026-09-15T21:10:28.9050927Z ok: [127.0.0.1]
2026-09-15T21:10:28.9285171Z Tuesday 15 September 2026  18:10:28 -0300 (0:00:00.077)       0:00:43.135 ***** 
2026-09-15T21:10:28.9747642Z 
2026-09-15T21:10:28.9748650Z TASK [vm : Debug parsed_output] ************************************************
2026-09-15T21:10:28.9753691Z ok: [127.0.0.1] => {
2026-09-15T21:10:28.9754867Z     "msg": [
2026-09-15T21:10:28.9755306Z         {
2026-09-15T21:10:28.9755644Z             "_meta": {
2026-09-15T21:10:28.9755880Z                 "hostvars": {
2026-09-15T21:10:28.9756189Z                     "caddeapllx2798.agil.nprd.caixa.gov.br": {
2026-09-15T21:10:28.9756459Z                         "ambiente": "des", 
2026-09-15T21:10:28.9756784Z                         "ansible_host": "10.116.202.9", 
2026-09-15T21:10:28.9757138Z                         "cluster": "CTC_NPRDXF2488HV7_NPRD", 
2026-09-15T21:10:28.9757403Z                         "cluster_principal": "", 
2026-09-15T21:10:28.9757636Z                         "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD", 
2026-09-15T21:10:28.9758040Z                         "cpu": 4, 
2026-09-15T21:10:28.9758469Z                         "datacenter": "NPRD", 
2026-09-15T21:10:28.9759247Z                         "datastore": "CTCHWNPRDPC03_0047", 
2026-09-15T21:10:28.9759479Z                         "detalhe_imagem": null, 
2026-09-15T21:10:28.9759610Z                         "disco_log": 2, 
2026-09-15T21:10:28.9759736Z                         "disco_opt": 10, 
2026-09-15T21:10:28.9759873Z                         "domain": "agil.nprd.caixa.gov.br", 
2026-09-15T21:10:28.9760304Z                         "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0", 
2026-09-15T21:10:28.9760551Z                         "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep", 
2026-09-15T21:10:28.9760796Z                         "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep", 
2026-09-15T21:10:28.9761078Z                         "esx_vcenter_server": "10.122.144.195", 
2026-09-15T21:10:28.9761214Z                         "farm": null, 
2026-09-15T21:10:28.9761333Z                         "id": 2128, 
2026-09-15T21:10:28.9761540Z                         "inclusao": "2021-12-10 15:47:02", 
2026-09-15T21:10:28.9761682Z                         "info_framework": null, 
2026-09-15T21:10:28.9761811Z                         "info_linguagem": null, 
2026-09-15T21:10:28.9761942Z                         "info_tecnologia": null, 
2026-09-15T21:10:28.9762073Z                         "info_versao": null, 
2026-09-15T21:10:28.9762202Z                         "ipbackup": "192.168.241.249", 
2026-09-15T21:10:28.9762338Z                         "jboss_apache_status": "ativado", 
2026-09-15T21:10:28.9762589Z                         "memoria": 8, 
2026-09-15T21:10:28.9762748Z                         "net_adapter_type": "vmxnet3", 
2026-09-15T21:10:28.9762878Z                         "nome_imagem": null, 
2026-09-15T21:10:28.9763082Z                         "objeto_origem": "SIIFX-CONTROLM_DES__SERVIDOR", 
2026-09-15T21:10:28.9763226Z                         "plataforma": "vm", 
2026-09-15T21:10:28.9763351Z                         "produto": "jboss", 
2026-09-15T21:10:28.9763480Z                         "recursos_max_id": null, 
2026-09-15T21:10:28.9763736Z                         "sistema": "siifx-batch-vm", 
2026-09-15T21:10:28.9763911Z                         "site": "ctc_nprd", 
2026-09-15T21:10:28.9764089Z                         "solicitacoes_id": 4924, 
2026-09-15T21:10:28.9764249Z                         "status": "ativado", 
2026-09-15T21:10:28.9764434Z                         "terraform": true, 
2026-09-15T21:10:28.9764593Z                         "versao_imagem": null, 
2026-09-15T21:10:28.9765067Z                         "versao_plataforma": "1.0", 
2026-09-15T21:10:28.9765268Z                         "vm_dns": [
2026-09-15T21:10:28.9765389Z                             "10.116.193.77", 
2026-09-15T21:10:28.9765508Z                             "10.116.193.78"
2026-09-15T21:10:28.9765622Z                         ], 
2026-09-15T21:10:28.9765742Z                         "vm_ipnetmask": 19, 
2026-09-15T21:10:28.9765868Z                         "vm_ipnetmask_bck": 19, 
2026-09-15T21:10:28.9766001Z                         "vm_ipnetmask_bck_01": 16, 
2026-09-15T21:10:28.9766131Z                         "vsphere_folder": "/vm", 
2026-09-15T21:10:28.9766264Z                         "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-09-15T21:10:28.9766393Z                     }
2026-09-15T21:10:28.9766496Z                 }
2026-09-15T21:10:28.9766679Z             }, 
2026-09-15T21:10:28.9766788Z             "ctc_nprd": {
2026-09-15T21:10:28.9766910Z                 "children": [
2026-09-15T21:10:28.9767083Z                     "jboss"
2026-09-15T21:10:28.9767189Z                 ], 
2026-09-15T21:10:28.9767362Z                 "vars": {}
2026-09-15T21:10:28.9767470Z             }, 
2026-09-15T21:10:28.9767577Z             "des": {
2026-09-15T21:10:28.9767686Z                 "children": [
2026-09-15T21:10:28.9767796Z                     "local", 
2026-09-15T21:10:28.9767907Z                     "ctc_nprd"
2026-09-15T21:10:28.9768012Z                 ], 
2026-09-15T21:10:28.9768119Z                 "vars": {}
2026-09-15T21:10:28.9768224Z             }, 
2026-09-15T21:10:28.9768333Z             "jboss": {
2026-09-15T21:10:28.9768443Z                 "hosts": [
2026-09-15T21:10:28.9768554Z                     "caddeapllx2798.agil.nprd.caixa.gov.br"
2026-09-15T21:10:28.9768678Z                 ], 
2026-09-15T21:10:28.9768781Z                 "vars": {}
2026-09-15T21:10:28.9768888Z             }, 
2026-09-15T21:10:28.9768993Z             "local": {
2026-09-15T21:10:28.9769104Z                 "hosts": [
2026-09-15T21:10:28.9769214Z                     "127.0.0.1"
2026-09-15T21:10:28.9769322Z                 ], 
2026-09-15T21:10:28.9769428Z                 "vars": {
2026-09-15T21:10:28.9769549Z                     "ansible_connection": "local"
2026-09-15T21:10:28.9769662Z                 }
2026-09-15T21:10:28.9769766Z             }
2026-09-15T21:10:28.9769866Z         }
2026-09-15T21:10:28.9769965Z     ]
2026-09-15T21:10:28.9770062Z }
2026-09-15T21:10:28.9997961Z Tuesday 15 September 2026  18:10:28 -0300 (0:00:00.071)       0:00:43.206 ***** 
2026-09-15T21:10:29.0642286Z 
2026-09-15T21:10:29.0642974Z TASK [vm : Verificando os ambientes] *******************************************
2026-09-15T21:10:29.0643142Z ok: [127.0.0.1] => {
2026-09-15T21:10:29.0643270Z     "msg": [
2026-09-15T21:10:29.0643413Z         "Ambiente existentes! Servidores: caddeapllx2798.agil.nprd.caixa.gov.br"
2026-09-15T21:10:29.0643556Z     ]
2026-09-15T21:10:29.0643675Z }
2026-09-15T21:10:29.0875814Z Tuesday 15 September 2026  18:10:29 -0300 (0:00:00.087)       0:00:43.294 ***** 
2026-09-15T21:10:29.1691122Z 
2026-09-15T21:10:29.1691889Z TASK [vm : Recuperar ip] *******************************************************
2026-09-15T21:10:29.1692087Z ok: [127.0.0.1] => (item=caddeapllx2798.agil.nprd.caixa.gov.br)
2026-09-15T21:10:29.1934251Z Tuesday 15 September 2026  18:10:29 -0300 (0:00:00.105)       0:00:43.400 ***** 
2026-09-15T21:10:29.2748055Z Tuesday 15 September 2026  18:10:29 -0300 (0:00:00.081)       0:00:43.481 ***** 
2026-09-15T21:10:29.3280994Z 
2026-09-15T21:10:29.3281714Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-09-15T21:10:29.3281900Z ok: [127.0.0.1] => {
2026-09-15T21:10:29.3282055Z     "msg": [
2026-09-15T21:10:29.3282233Z         "Servidores: \\\"caddeapllx2798.agil.nprd.caixa.gov.br\\\"", 
2026-09-15T21:10:29.3282376Z         "IPs: \\\"10.116.202.9\\\"", 
2026-09-15T21:10:29.3282516Z         "Gateways: \\\"10.116.192.1\\\"", 
2026-09-15T21:10:29.3283064Z         "IPs Backup: \\\"192.168.241.249\\\"", 
2026-09-15T21:10:29.3283275Z         "Servidores (OBJ): \\\"caddeapllx2798.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.202.9\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.241.249\\\"}"
2026-09-15T21:10:29.3283549Z     ]
2026-09-15T21:10:29.3283648Z }
2026-09-15T21:10:29.3504231Z Tuesday 15 September 2026  18:10:29 -0300 (0:00:00.075)       0:00:43.557 ***** 
2026-09-15T21:10:30.2833786Z 
2026-09-15T21:10:30.2835414Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-09-15T21:10:30.2836014Z changed: [127.0.0.1]
2026-09-15T21:10:30.2892261Z 
2026-09-15T21:10:30.2892754Z PLAY [Configurando o DNS] ******************************************************
2026-09-15T21:10:30.5230790Z Tuesday 15 September 2026  18:10:30 -0300 (0:00:01.172)       0:00:44.729 ***** 
2026-09-15T21:10:30.6759799Z 
2026-09-15T21:10:30.6760961Z TASK [Consultar DNS] ***********************************************************
2026-09-15T21:10:30.6761591Z changed: [10.116.193.77] => (item=caddeapllx2798.agil.nprd.caixa.gov.br)
2026-09-15T21:10:30.6794749Z Tuesday 15 September 2026  18:10:30 -0300 (0:00:00.156)       0:00:44.886 ***** 
2026-09-15T21:10:30.7453012Z 
2026-09-15T21:10:30.7454224Z TASK [Verificar se o domínio resolve para um IP] *******************************
2026-09-15T21:10:30.7457172Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-09-15 18:10:30.659608', u'stdout': u'10.116.202.9', u'item': u'caddeapllx2798.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2798.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.011151', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2798.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.202.9'], u'start': u'2026-09-15 18:10:30.648457'}) => {
2026-09-15T21:10:30.7458030Z     "msg": "O domínio caddeapllx2798.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.202.9']"
2026-09-15T21:10:30.7458398Z }
2026-09-15T21:10:30.7496033Z Tuesday 15 September 2026  18:10:30 -0300 (0:00:00.070)       0:00:44.956 ***** 
2026-09-15T21:10:30.8041345Z Tuesday 15 September 2026  18:10:30 -0300 (0:00:00.054)       0:00:45.010 ***** 
2026-09-15T21:10:30.8592190Z Tuesday 15 September 2026  18:10:30 -0300 (0:00:00.054)       0:00:45.065 ***** 
2026-09-15T21:10:30.9297725Z 
2026-09-15T21:10:30.9298862Z TASK [Set created DNS] *********************************************************
2026-09-15T21:10:30.9300152Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-09-15 18:10:30.659608', u'stdout': u'10.116.202.9', u'item': u'caddeapllx2798.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2798.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.011151', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2798.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.202.9'], u'start': u'2026-09-15 18:10:30.648457'})
2026-09-15T21:10:30.9342049Z Tuesday 15 September 2026  18:10:30 -0300 (0:00:00.075)       0:00:45.141 ***** 
2026-09-15T21:10:31.0006145Z 
2026-09-15T21:10:31.0007016Z PLAY [local] *******************************************************************
2026-09-15T21:10:31.0046385Z 
2026-09-15T21:10:31.0047525Z PLAY [Verificando serviços] ****************************************************
2026-09-15T21:10:31.0143467Z 
2026-09-15T21:10:31.0144655Z PLAY [Configuração LDAP] *******************************************************
2026-09-15T21:10:31.0368299Z [WARNING]: Found variable using reserved name: when
2026-09-15T21:10:31.0371535Z 
2026-09-15T21:10:31.0371770Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0463304Z 
2026-09-15T21:10:31.0463758Z PLAY [Stack Jboss] *************************************************************
2026-09-15T21:10:31.0493712Z 
2026-09-15T21:10:31.0494013Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0544425Z 
2026-09-15T21:10:31.0545143Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0586406Z 
2026-09-15T21:10:31.0587231Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0613197Z 
2026-09-15T21:10:31.0613808Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-15T21:10:31.0644265Z 
2026-09-15T21:10:31.0644672Z PLAY [Copiando modules adicionais] *********************************************
2026-09-15T21:10:31.0672862Z 
2026-09-15T21:10:31.0673208Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0712669Z 
2026-09-15T21:10:31.0713127Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0740122Z 
2026-09-15T21:10:31.0740425Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0772746Z 
2026-09-15T21:10:31.0773153Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0812079Z 
2026-09-15T21:10:31.0813079Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.0836302Z 
2026-09-15T21:10:31.0837565Z PLAY [local] *******************************************************************
2026-09-15T21:10:31.0864780Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-15T21:10:31.0867765Z 
2026-09-15T21:10:31.0868340Z PLAY [instance_restart] ********************************************************
2026-09-15T21:10:31.0868581Z skipping: no hosts matched
2026-09-15T21:10:31.0871136Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-15T21:10:31.0874256Z 
2026-09-15T21:10:31.0874504Z PLAY [machine_reboot] **********************************************************
2026-09-15T21:10:31.0874663Z skipping: no hosts matched
2026-09-15T21:10:31.0880810Z 
2026-09-15T21:10:31.0881264Z PLAY [local] *******************************************************************
2026-09-15T21:10:31.0905839Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-15T21:10:31.0908775Z 
2026-09-15T21:10:31.0909288Z PLAY [instance_stop] ***********************************************************
2026-09-15T21:10:31.0909503Z skipping: no hosts matched
2026-09-15T21:10:31.0912402Z 
2026-09-15T21:10:31.0912713Z PLAY [machine_reboot] **********************************************************
2026-09-15T21:10:31.0912875Z skipping: no hosts matched
2026-09-15T21:10:31.0920047Z 
2026-09-15T21:10:31.0920302Z PLAY [local] *******************************************************************
2026-09-15T21:10:31.0945483Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-09-15T21:10:31.0949068Z 
2026-09-15T21:10:31.0949377Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-09-15T21:10:31.0949539Z skipping: no hosts matched
2026-09-15T21:10:31.0955343Z 
2026-09-15T21:10:31.0955765Z PLAY [local] *******************************************************************
2026-09-15T21:10:31.0977663Z 
2026-09-15T21:10:31.0977831Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-09-15T21:10:31.0978014Z skipping: no hosts matched
2026-09-15T21:10:31.0988066Z 
2026-09-15T21:10:31.0988275Z PLAY [Configura TSM] ***********************************************************
2026-09-15T21:10:31.1013887Z 
2026-09-15T21:10:31.1014188Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1042841Z 
2026-09-15T21:10:31.1043453Z PLAY [Configura Control-M] *****************************************************
2026-09-15T21:10:31.1076932Z 
2026-09-15T21:10:31.1077293Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1121686Z 
2026-09-15T21:10:31.1122316Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1164111Z 
2026-09-15T21:10:31.1164487Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1188340Z 
2026-09-15T21:10:31.1188853Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1217231Z 
2026-09-15T21:10:31.1217511Z PLAY [localhost] ***************************************************************
2026-09-15T21:10:31.1242667Z 
2026-09-15T21:10:31.1243028Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1286921Z 
2026-09-15T21:10:31.1287338Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1328108Z 
2026-09-15T21:10:31.1328545Z PLAY [jboss] *******************************************************************
2026-09-15T21:10:31.1368724Z 
2026-09-15T21:10:31.1369483Z PLAY RECAP *********************************************************************
2026-09-15T21:10:31.1369795Z 10.116.193.77              : ok=3    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-09-15T21:10:31.1370139Z 10.116.193.78              : ok=0    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-09-15T21:10:31.1371271Z 127.0.0.1                  : ok=41   changed=5    unreachable=0    failed=0    skipped=10   rescued=0    ignored=0   
2026-09-15T21:10:31.1371400Z 
2026-09-15T21:10:31.1371873Z Tuesday 15 September 2026  18:10:31 -0300 (0:00:00.203)       0:00:45.344 ***** 
2026-09-15T21:10:31.1372085Z =============================================================================== 
2026-09-15T21:10:31.1372466Z Gathering Facts -------------------------------------------------------- 26.23s
2026-09-15T21:10:31.1372721Z vm : Executar script para marcar VM como template ----------------------- 8.98s
2026-09-15T21:10:31.1372979Z vm : Criando arquivo para exportar as variáveis ------------------------- 1.17s
2026-09-15T21:10:31.1373229Z vm : execute create_ip_bck script --------------------------------------- 0.84s
2026-09-15T21:10:31.1373472Z vm : Instalar dependências Python para vCenter -------------------------- 0.77s
2026-09-15T21:10:31.1373708Z vm : Consultar API ------------------------------------------------------ 0.68s
2026-09-15T21:10:31.1373953Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.53s
2026-09-15T21:10:31.1374185Z vm : Run Invetory All --------------------------------------------------- 0.50s
2026-09-15T21:10:31.1374434Z vm : Run Invetory All --------------------------------------------------- 0.48s
2026-09-15T21:10:31.1374664Z vm : Consultar API ------------------------------------------------------ 0.45s
2026-09-15T21:10:31.1374899Z vm : Coletar variáveis de ambiente -------------------------------------- 0.36s
2026-09-15T21:10:31.1375128Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.36s
2026-09-15T21:10:31.1375358Z include_role : dns ------------------------------------------------------ 0.20s
2026-09-15T21:10:31.1375581Z Consultar DNS ----------------------------------------------------------- 0.16s
2026-09-15T21:10:31.1375804Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-09-15T21:10:31.1376023Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-09-15T21:10:31.1376252Z vm : Recuperar ip ------------------------------------------------------- 0.11s
2026-09-15T21:10:31.1376920Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-09-15T21:10:31.1377244Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-09-15T21:10:31.1377946Z vm : Exibir resultado do script vCenter --------------------------------- 0.10s
2026-09-15T21:10:31.1378209Z Playbook run took 0 days, 0 hours, 0 minutes, 45 seconds
2026-09-15T21:10:31.2540307Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
