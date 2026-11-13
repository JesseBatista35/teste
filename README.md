2026-11-12T13:44:44.6953788Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-11-12T13:44:44.6956815Z ==============================================================================
2026-11-12T13:44:44.6956906Z Task         : Bash
2026-11-12T13:44:44.6957037Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-12T13:44:44.6957103Z Version      : 3.227.0
2026-11-12T13:44:44.6957159Z Author       : Microsoft Corporation
2026-11-12T13:44:44.6957210Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-12T13:44:44.6957284Z ==============================================================================
2026-11-12T13:44:45.6476496Z Generating script.
2026-11-12T13:44:45.6487102Z ========================== Starting Command Output ===========================
2026-11-12T13:44:45.6494144Z [command]/bin/bash /opt/ads-agent/_work/_temp/79a194c7-6f74-47ce-bbc5-39c927ad5a85.sh
2026-11-12T13:44:45.6562759Z /opt/ads-agent/_work/_temp/79a194c7-6f74-47ce-bbc5-39c927ad5a85.sh: line 4: tf_var_quant: comando não encontrado
2026-11-12T13:44:47.7482314Z 
2026-11-12T13:44:47.7482813Z PLAY [local] *******************************************************************
2026-11-12T13:44:47.7718247Z Thursday 12 November 2026  10:44:47 -0300 (0:00:00.082)       0:00:00.082 ***** 
2026-11-12T13:45:16.2066910Z 
2026-11-12T13:45:16.2068572Z TASK [Gathering Facts] *********************************************************
2026-11-12T13:45:16.2068791Z ok: [127.0.0.1]
2026-11-12T13:45:16.2382771Z Thursday 12 November 2026  10:45:16 -0300 (0:00:28.466)       0:00:28.548 ***** 
2026-11-12T13:45:16.3171539Z Thursday 12 November 2026  10:45:16 -0300 (0:00:00.078)       0:00:28.627 ***** 
2026-11-12T13:45:16.3884665Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r6294/a
2026-11-12T13:45:16.3884980Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-11-12T13:45:16.3885155Z duplicate dict key (include_tasks). Using last defined value only.
2026-11-12T13:45:16.4001893Z included: /opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-11-12T13:45:16.4243472Z Thursday 12 November 2026  10:45:16 -0300 (0:00:00.107)       0:00:28.735 ***** 
2026-11-12T13:45:16.4934825Z 
2026-11-12T13:45:16.4935340Z TASK [vm : Cria variável build_repository_name] ********************************
2026-11-12T13:45:16.4935503Z ok: [127.0.0.1]
2026-11-12T13:45:16.5154482Z Thursday 12 November 2026  10:45:16 -0300 (0:00:00.091)       0:00:28.826 ***** 
2026-11-12T13:45:17.2721031Z 
2026-11-12T13:45:17.2721757Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-11-12T13:45:17.2721917Z ok: [127.0.0.1]
2026-11-12T13:45:17.2944892Z Thursday 12 November 2026  10:45:17 -0300 (0:00:00.778)       0:00:29.605 ***** 
2026-11-12T13:45:55.4833478Z 
2026-11-12T13:45:55.4833989Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-11-12T13:45:55.4834157Z changed: [127.0.0.1]
2026-11-12T13:45:55.5063515Z Thursday 12 November 2026  10:45:55 -0300 (0:00:38.211)       0:01:07.816 ***** 
2026-11-12T13:45:55.5723896Z 
2026-11-12T13:45:55.5724660Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-11-12T13:45:55.5724904Z ok: [127.0.0.1] => {
2026-11-12T13:45:55.5725094Z     "msg": [
2026-11-12T13:45:55.5725229Z         "Iniciando registro do template VMTX...", 
2026-11-12T13:45:55.5725362Z         "vCenter: 10.122.144.195", 
2026-11-12T13:45:55.5725685Z         "Template: controlm-21.300-AG-DATA-openjdk21-rhel93-v003", 
2026-11-12T13:45:55.5725994Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] controlm-21.300-AG-DATA-openjdk21-rhel93-v003/controlm-21.300-AG-DATA-openjdk21-rhel93-v003.vmtx", 
2026-11-12T13:45:55.5726181Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-11-12T13:45:55.5726867Z         "Template 'controlm-21.300-AG-DATA-openjdk21-rhel93-v003' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-11-12T13:45:55.5727046Z         "Operacao concluida com sucesso."
2026-11-12T13:45:55.5727373Z     ]
2026-11-12T13:45:55.5727472Z }
2026-11-12T13:45:55.5945854Z Thursday 12 November 2026  10:45:55 -0300 (0:00:00.088)       0:01:07.905 ***** 
2026-11-12T13:45:55.6620284Z 
2026-11-12T13:45:55.6620961Z TASK [vm : Cria variável ansible] **********************************************
2026-11-12T13:45:55.6621129Z ok: [127.0.0.1]
2026-11-12T13:45:55.6838527Z Thursday 12 November 2026  10:45:55 -0300 (0:00:00.089)       0:01:07.994 ***** 
2026-11-12T13:45:56.1190264Z 
2026-11-12T13:45:56.1190973Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-11-12T13:45:56.1191141Z ok: [127.0.0.1]
2026-11-12T13:45:56.1409709Z Thursday 12 November 2026  10:45:56 -0300 (0:00:00.457)       0:01:08.451 ***** 
2026-11-12T13:45:56.4221285Z 
2026-11-12T13:45:56.4221983Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-11-12T13:45:56.4222145Z ok: [127.0.0.1]
2026-11-12T13:45:56.4443666Z Thursday 12 November 2026  10:45:56 -0300 (0:00:00.303)       0:01:08.754 ***** 
2026-11-12T13:45:56.5030724Z Thursday 12 November 2026  10:45:56 -0300 (0:00:00.058)       0:01:08.813 ***** 
2026-11-12T13:45:56.5845331Z Thursday 12 November 2026  10:45:56 -0300 (0:00:00.081)       0:01:08.895 ***** 
2026-11-12T13:45:56.6258414Z 
2026-11-12T13:45:56.6259122Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-11-12T13:45:56.6259344Z ok: [127.0.0.1]
2026-11-12T13:45:56.6473010Z Thursday 12 November 2026  10:45:56 -0300 (0:00:00.062)       0:01:08.958 ***** 
2026-11-12T13:45:56.7185732Z included: /opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-11-12T13:45:56.7471988Z Thursday 12 November 2026  10:45:56 -0300 (0:00:00.099)       0:01:09.057 ***** 
2026-11-12T13:45:56.8045490Z included: /opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-11-12T13:45:56.8333586Z Thursday 12 November 2026  10:45:56 -0300 (0:00:00.086)       0:01:09.144 ***** 
2026-11-12T13:45:57.3708968Z 
2026-11-12T13:45:57.3709470Z TASK [vm : Consultar API] ******************************************************
2026-11-12T13:45:57.3709621Z ok: [127.0.0.1]
2026-11-12T13:45:57.3932130Z Thursday 12 November 2026  10:45:57 -0300 (0:00:00.559)       0:01:09.703 ***** 
2026-11-12T13:45:57.4333753Z 
2026-11-12T13:45:57.4334475Z TASK [vm : Parse JSON] *********************************************************
2026-11-12T13:45:57.4334717Z ok: [127.0.0.1]
2026-11-12T13:45:57.4551528Z Thursday 12 November 2026  10:45:57 -0300 (0:00:00.061)       0:01:09.765 ***** 
2026-11-12T13:45:57.5159798Z included: /opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-11-12T13:45:57.5763687Z Thursday 12 November 2026  10:45:57 -0300 (0:00:00.121)       0:01:09.886 ***** 
2026-11-12T13:45:57.9493190Z 
2026-11-12T13:45:57.9493688Z TASK [vm : Consultar API] ******************************************************
2026-11-12T13:45:57.9493859Z ok: [127.0.0.1]
2026-11-12T13:45:57.9722307Z Thursday 12 November 2026  10:45:57 -0300 (0:00:00.395)       0:01:10.282 ***** 
2026-11-12T13:45:58.0140597Z 
2026-11-12T13:45:58.0141359Z TASK [vm : Parse JSON] *********************************************************
2026-11-12T13:45:58.0141603Z ok: [127.0.0.1]
2026-11-12T13:45:58.0358491Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.063)       0:01:10.346 ***** 
2026-11-12T13:45:58.0944872Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.058)       0:01:10.405 ***** 
2026-11-12T13:45:58.1378604Z 
2026-11-12T13:45:58.1379220Z TASK [vm : Exibir size servidores.] ********************************************
2026-11-12T13:45:58.1382204Z ok: [127.0.0.1] => {
2026-11-12T13:45:58.1382337Z     "api_data.dados.0": {
2026-11-12T13:45:58.1382464Z         "ambiente": "des", 
2026-11-12T13:45:58.1382589Z         "cluster": null, 
2026-11-12T13:45:58.1382711Z         "cluster_principal": null, 
2026-11-12T13:45:58.1382835Z         "cluster_terraform": null, 
2026-11-12T13:45:58.1383233Z         "cpu": 2, 
2026-11-12T13:45:58.1383350Z         "datacenter": null, 
2026-11-12T13:45:58.1383475Z         "datastore": null, 
2026-11-12T13:45:58.1383593Z         "detalhe_imagem": null, 
2026-11-12T13:45:58.1383780Z         "disco_log": 2, 
2026-11-12T13:45:58.1385184Z         "disco_opt": 10, 
2026-11-12T13:45:58.1385375Z         "domain": null, 
2026-11-12T13:45:58.1385499Z         "esx_network": null, 
2026-11-12T13:45:58.1385624Z         "esx_network_bck": null, 
2026-11-12T13:45:58.1385749Z         "esx_network_bck_01": null, 
2026-11-12T13:45:58.1385873Z         "esx_vcenter_server": null, 
2026-11-12T13:45:58.1385985Z         "farm": null, 
2026-11-12T13:45:58.1386097Z         "id": 13493, 
2026-11-12T13:45:58.1386369Z         "inclusao": "2026-06-25 11:44:29", 
2026-11-12T13:45:58.1386504Z         "info_framework": null, 
2026-11-12T13:45:58.1386614Z         "info_linguagem": null, 
2026-11-12T13:45:58.1386828Z         "info_tecnologia": null, 
2026-11-12T13:45:58.1386948Z         "info_versao": null, 
2026-11-12T13:45:58.1387066Z         "ipbackup": "192.168.242.175", 
2026-11-12T13:45:58.1387190Z         "jboss_apache_status": "ativado", 
2026-11-12T13:45:58.1387311Z         "memoria": 4, 
2026-11-12T13:45:58.1387425Z         "net_adapter_type": null, 
2026-11-12T13:45:58.1387547Z         "nome_imagem": null, 
2026-11-12T13:45:58.1387729Z         "objeto_origem": "SIIFX-CAIXINHAS-BATCH_DES_SERVIDOR", 
2026-11-12T13:45:58.1387862Z         "plataforma": "vm", 
2026-11-12T13:45:58.1387976Z         "produto": "jboss", 
2026-11-12T13:45:58.1388092Z         "recursos_max_id": null, 
2026-11-12T13:45:58.1388209Z         "servidores_json": [
2026-11-12T13:45:58.1388314Z             {
2026-11-12T13:45:58.1388414Z                 "ip": "10.116.201.173", 
2026-11-12T13:45:58.1388539Z                 "jboss_apache_status": "ativado", 
2026-11-12T13:45:58.1388679Z                 "nome": "caddeapllx2695.agil.nprd.caixa.gov.br"
2026-11-12T13:45:58.1388798Z             }
2026-11-12T13:45:58.1388897Z         ], 
2026-11-12T13:45:58.1389157Z         "sistema": "siifx-caixinhas-batch", 
2026-11-12T13:45:58.1389287Z         "site": "ctc_nprd", 
2026-11-12T13:45:58.1389403Z         "solicitacoes_id": null, 
2026-11-12T13:45:58.1389524Z         "status": "ativado", 
2026-11-12T13:45:58.1389634Z         "terraform": true, 
2026-11-12T13:45:58.1389749Z         "versao_imagem": null, 
2026-11-12T13:45:58.1389869Z         "versao_plataforma": "7.1", 
2026-11-12T13:45:58.1389976Z         "vm_dns": null, 
2026-11-12T13:45:58.1390091Z         "vm_ipnetmask": null, 
2026-11-12T13:45:58.1390496Z         "vm_ipnetmask_bck": null, 
2026-11-12T13:45:58.1390619Z         "vm_ipnetmask_bck_01": null, 
2026-11-12T13:45:58.1390742Z         "vsphere_folder": null, 
2026-11-12T13:45:58.1390857Z         "vsphere_pool": null
2026-11-12T13:45:58.1390957Z     }
2026-11-12T13:45:58.1391053Z }
2026-11-12T13:45:58.1600294Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.065)       0:01:10.470 ***** 
2026-11-12T13:45:58.2197025Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.059)       0:01:10.530 ***** 
2026-11-12T13:45:58.2639680Z 
2026-11-12T13:45:58.2640623Z TASK [vm : Set size] ***********************************************************
2026-11-12T13:45:58.2640846Z ok: [127.0.0.1]
2026-11-12T13:45:58.2855575Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.066)       0:01:10.596 ***** 
2026-11-12T13:45:58.3279874Z 
2026-11-12T13:45:58.3280503Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-11-12T13:45:58.3280699Z ok: [127.0.0.1]
2026-11-12T13:45:58.3497237Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.064)       0:01:10.660 ***** 
2026-11-12T13:45:58.3890315Z 
2026-11-12T13:45:58.3890924Z TASK [vm : debug] **************************************************************
2026-11-12T13:45:58.3891318Z ok: [127.0.0.1] => {
2026-11-12T13:45:58.3891831Z     "template_name": "controlm-21.300-AG-DATA-openjdk21-rhel93-v003"
2026-11-12T13:45:58.3891974Z }
2026-11-12T13:45:58.4105235Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.060)       0:01:10.721 ***** 
2026-11-12T13:45:58.4501775Z 
2026-11-12T13:45:58.4502373Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-11-12T13:45:58.4502802Z ok: [127.0.0.1]
2026-11-12T13:45:58.4717940Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.061)       0:01:10.782 ***** 
2026-11-12T13:45:58.5319075Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.059)       0:01:10.842 ***** 
2026-11-12T13:45:58.9191498Z 
2026-11-12T13:45:58.9192052Z TASK [vm : Run Invetory All] ***************************************************
2026-11-12T13:45:58.9192216Z changed: [127.0.0.1]
2026-11-12T13:45:58.9419704Z Thursday 12 November 2026  10:45:58 -0300 (0:00:00.410)       0:01:11.252 ***** 
2026-11-12T13:45:58.9839860Z 
2026-11-12T13:45:58.9840863Z TASK [vm : Parse JSON output] **************************************************
2026-11-12T13:45:58.9841078Z ok: [127.0.0.1]
2026-11-12T13:45:59.0087420Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.066)       0:01:11.319 ***** 
2026-11-12T13:45:59.0504850Z 
2026-11-12T13:45:59.0505283Z TASK [vm : Count the number of hosts] ******************************************
2026-11-12T13:45:59.0505465Z ok: [127.0.0.1]
2026-11-12T13:45:59.0722688Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.063)       0:01:11.382 ***** 
2026-11-12T13:45:59.1349783Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.062)       0:01:11.445 ***** 
2026-11-12T13:45:59.1962809Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.061)       0:01:11.506 ***** 
2026-11-12T13:45:59.2363764Z 
2026-11-12T13:45:59.2364418Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-11-12T13:45:59.2364620Z ok: [127.0.0.1] => {
2026-11-12T13:45:59.2364732Z     "msg": [
2026-11-12T13:45:59.2364835Z         "num_hosts: 1"
2026-11-12T13:45:59.2364944Z     ]
2026-11-12T13:45:59.2365043Z }
2026-11-12T13:45:59.2581614Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.061)       0:01:11.568 ***** 
2026-11-12T13:45:59.3184513Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.060)       0:01:11.629 ***** 
2026-11-12T13:45:59.3815619Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.063)       0:01:11.692 ***** 
2026-11-12T13:45:59.4406158Z included: /opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-11-12T13:45:59.4745034Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.092)       0:01:11.785 ***** 
2026-11-12T13:45:59.5367884Z included: /opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-11-12T13:45:59.5604629Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.085)       0:01:11.871 ***** 
2026-11-12T13:45:59.6047071Z 
2026-11-12T13:45:59.6047624Z TASK [vm : Criar variáveis] ****************************************************
2026-11-12T13:45:59.6047785Z ok: [127.0.0.1]
2026-11-12T13:45:59.6477190Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.087)       0:01:11.958 ***** 
2026-11-12T13:45:59.9115882Z 
2026-11-12T13:45:59.9116583Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-11-12T13:45:59.9116741Z ok: [127.0.0.1]
2026-11-12T13:45:59.9342390Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.286)       0:01:12.244 ***** 
2026-11-12T13:45:59.9749069Z 
2026-11-12T13:45:59.9749881Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-11-12T13:45:59.9751286Z ok: [127.0.0.1] => {
2026-11-12T13:45:59.9751421Z     "nfs_vars_json": {
2026-11-12T13:45:59.9751542Z         "changed": false, 
2026-11-12T13:45:59.9751838Z         "cmd": "cat /opt/ads-agent/_work/r6294/a/nfs_config.json", 
2026-11-12T13:45:59.9752012Z         "delta": "0:00:00.002886", 
2026-11-12T13:45:59.9752200Z         "end": "2026-11-12 10:45:59.897791", 
2026-11-12T13:45:59.9752328Z         "failed": false, 
2026-11-12T13:45:59.9752438Z         "rc": 0, 
2026-11-12T13:45:59.9752608Z         "start": "2026-11-12 10:45:59.894905", 
2026-11-12T13:45:59.9752963Z         "stderr": "", 
2026-11-12T13:45:59.9753077Z         "stderr_lines": [], 
2026-11-12T13:45:59.9753517Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"}]", 
2026-11-12T13:45:59.9753939Z         "stdout_lines": [
2026-11-12T13:45:59.9754369Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"}]"
2026-11-12T13:45:59.9754595Z         ]
2026-11-12T13:45:59.9754692Z     }
2026-11-12T13:45:59.9754792Z }
2026-11-12T13:45:59.9971832Z Thursday 12 November 2026  10:45:59 -0300 (0:00:00.062)       0:01:12.307 ***** 
2026-11-12T13:46:00.0407021Z 
2026-11-12T13:46:00.0407886Z TASK [vm : Criar variáveis] ****************************************************
2026-11-12T13:46:00.0408111Z ok: [127.0.0.1]
2026-11-12T13:46:00.0623478Z Thursday 12 November 2026  10:46:00 -0300 (0:00:00.065)       0:01:12.373 ***** 
2026-11-12T13:46:00.6655935Z 
2026-11-12T13:46:00.6656417Z TASK [vm : execute create_ip_bck script] ***************************************
2026-11-12T13:46:00.6656575Z changed: [127.0.0.1]
2026-11-12T13:46:00.6874366Z Thursday 12 November 2026  10:46:00 -0300 (0:00:00.625)       0:01:12.998 ***** 
2026-11-12T13:46:00.7308040Z 
2026-11-12T13:46:00.7308380Z TASK [vm : ansible.builtin.debug] **********************************************
2026-11-12T13:46:00.7312144Z ok: [127.0.0.1] => {
2026-11-12T13:46:00.7312273Z     "changed": false, 
2026-11-12T13:46:00.7312411Z     "msg": {
2026-11-12T13:46:00.7312529Z         "changed": true, 
2026-11-12T13:46:00.7312658Z         "cmd": [
2026-11-12T13:46:00.7312787Z             "python", 
2026-11-12T13:46:00.7313093Z             "/opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-11-12T13:46:00.7313234Z             "create_ip_bck", 
2026-11-12T13:46:00.7313401Z             "siifx-caixinhas-batch", 
2026-11-12T13:46:00.7313516Z             "des", 
2026-11-12T13:46:00.7313620Z             "ctc_nprd", 
2026-11-12T13:46:00.7313806Z             "/opt/ads-agent/_work/r6294/a/esteira-jboss-vm-v2", 
2026-11-12T13:46:00.7314335Z             "C&t@d02", 
2026-11-12T13:46:00.7315008Z             "***", 
2026-11-12T13:46:00.7315142Z             "s736651@corp.caixa.gov.br", 
2026-11-12T13:46:00.7315285Z             "***", 
2026-11-12T13:46:00.7315786Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH\",\"NFS_MOUNT_POINT_ISILON\": \"/SIIFX\"},{\"NFS_ENDPOINT_ISILON_2\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX\",\"NFS_MOUNT_POINT_ISILON_2\": \"/SIIFX_B2B\"}]"
2026-11-12T13:46:00.7316054Z         ], 
2026-11-12T13:46:00.7316178Z         "delta": "0:00:00.315580", 
2026-11-12T13:46:00.7316368Z         "end": "2026-11-12 10:46:00.650969", 
2026-11-12T13:46:00.7316503Z         "failed": false, 
2026-11-12T13:46:00.7316617Z         "rc": 0, 
2026-11-12T13:46:00.7316806Z         "start": "2026-11-12 10:46:00.335389", 
2026-11-12T13:46:00.7316932Z         "stderr": "", 
2026-11-12T13:46:00.7317043Z         "stderr_lines": [], 
2026-11-12T13:46:00.7321663Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nNFS ENDPOINT: {u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_MOUNT_POINT_ISILON': u'/SIIFX'}\nVariaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'), (u'NFS_MOUNT_POINT_ISILON', u'/SIIFX')), ((u'NFS_ENDPOINT_ISILON_2', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'), (u'NFS_MOUNT_POINT_ISILON_2', u'/SIIFX_B2B'))]\nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH/SIIFXISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-06-25 11:44:29', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 13493, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'jboss_apache_status': u'ativado', u'ip': u'10.116.201.173', u'nome': u'caddeapllx2695.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': u'SIIFX-CAIXINHAS-BATCH_DES_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-caixinhas-batch', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.242.175', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 2}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                \nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX/SIIFX_B2BISILONnfsctcnprd.ctc.caixades\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-06-25 11:44:29', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 13493, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'jboss_apache_status': u'ativado', u'ip': u'10.116.201.173', u'nome': u'caddeapllx2695.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': u'SIIFX-CAIXINHAS-BATCH_DES_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-caixinhas-batch', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.242.175', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 2}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-11-12T13:46:00.7324059Z         "stdout_lines": [
2026-11-12T13:46:00.7324522Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'}, {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'}]", 
2026-11-12T13:46:00.7324818Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-11-12T13:46:00.7325179Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-11-12T13:46:00.7325697Z             "NFS ENDPOINT: {u'NFS_ENDPOINT_ISILON_2': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON_2': u'/SIIFX_B2B', u'NFS_MOUNT_POINT_ISILON': u'/SIIFX'}", 
2026-11-12T13:46:00.7326261Z             "Variaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH'), (u'NFS_MOUNT_POINT_ISILON', u'/SIIFX')), ((u'NFS_ENDPOINT_ISILON_2', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX'), (u'NFS_MOUNT_POINT_ISILON_2', u'/SIIFX_B2B'))]", 
2026-11-12T13:46:00.7326637Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH/SIIFXISILONnfsctcnprd.ctc.caixades", 
2026-11-12T13:46:00.7328031Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-06-25 11:44:29', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 13493, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'jboss_apache_status': u'ativado', u'ip': u'10.116.201.173', u'nome': u'caddeapllx2695.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': u'SIIFX-CAIXINHAS-BATCH_DES_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-caixinhas-batch', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.242.175', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 2}]", 
2026-11-12T13:46:00.7329040Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIIFX-BATCH /SIIFX                              ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-11-12T13:46:00.7329269Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX/SIIFX_B2BISILONnfsctcnprd.ctc.caixades", 
2026-11-12T13:46:00.7330746Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-06-25 11:44:29', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 13493, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'jboss_apache_status': u'ativado', u'ip': u'10.116.201.173', u'nome': u'caddeapllx2695.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': u'SIIFX-CAIXINHAS-BATCH_DES_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': None, u'sistema': u'siifx-caixinhas-batch', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'des', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.242.175', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 2}]", 
2026-11-12T13:46:00.7331495Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTIRJ/NPRD/B2B/SIIFX /SIIFX_B2B                          ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-11-12T13:46:00.7331649Z         ]
2026-11-12T13:46:00.7331745Z     }
2026-11-12T13:46:00.7331841Z }
2026-11-12T13:46:00.7530011Z Thursday 12 November 2026  10:46:00 -0300 (0:00:00.065)       0:01:13.063 ***** 
2026-11-12T13:46:01.1395840Z 
2026-11-12T13:46:01.1396335Z TASK [vm : Run Invetory All] ***************************************************
2026-11-12T13:46:01.1396518Z changed: [127.0.0.1]
2026-11-12T13:46:01.1642898Z Thursday 12 November 2026  10:46:01 -0300 (0:00:00.411)       0:01:13.474 ***** 
2026-11-12T13:46:01.2065629Z 
2026-11-12T13:46:01.2066023Z TASK [vm : Parse JSON output] **************************************************
2026-11-12T13:46:01.2066184Z ok: [127.0.0.1]
2026-11-12T13:46:01.2286347Z Thursday 12 November 2026  10:46:01 -0300 (0:00:00.064)       0:01:13.539 ***** 
2026-11-12T13:46:01.2691329Z 
2026-11-12T13:46:01.2691948Z TASK [vm : Debug parsed_output] ************************************************
2026-11-12T13:46:01.2696216Z ok: [127.0.0.1] => {
2026-11-12T13:46:01.2696462Z     "msg": [
2026-11-12T13:46:01.2696578Z         {
2026-11-12T13:46:01.2696689Z             "_meta": {
2026-11-12T13:46:01.2697766Z                 "hostvars": {
2026-11-12T13:46:01.2698915Z                     "caddeapllx2695.agil.nprd.caixa.gov.br": {
2026-11-12T13:46:01.2700055Z                         "ambiente": "des", 
2026-11-12T13:46:01.2700971Z                         "ansible_host": "10.116.201.173", 
2026-11-12T13:46:01.2701282Z                         "cluster": null, 
2026-11-12T13:46:01.2701499Z                         "cluster_principal": null, 
2026-11-12T13:46:01.2701632Z                         "cluster_terraform": null, 
2026-11-12T13:46:01.2701745Z                         "cpu": 2, 
2026-11-12T13:46:01.2701873Z                         "datacenter": null, 
2026-11-12T13:46:01.2701995Z                         "datastore": null, 
2026-11-12T13:46:01.2702117Z                         "detalhe_imagem": null, 
2026-11-12T13:46:01.2702234Z                         "disco_log": 2, 
2026-11-12T13:46:01.2702337Z                         "disco_opt": 10, 
2026-11-12T13:46:01.2702450Z                         "domain": null, 
2026-11-12T13:46:01.2702568Z                         "esx_network": null, 
2026-11-12T13:46:01.2702685Z                         "esx_network_bck": null, 
2026-11-12T13:46:01.2702907Z                         "esx_network_bck_01": null, 
2026-11-12T13:46:01.2703056Z                         "esx_vcenter_server": null, 
2026-11-12T13:46:01.2703173Z                         "farm": null, 
2026-11-12T13:46:01.2703283Z                         "id": 13493, 
2026-11-12T13:46:01.2703505Z                         "inclusao": "2026-06-25 11:44:29", 
2026-11-12T13:46:01.2703638Z                         "info_framework": null, 
2026-11-12T13:46:01.2703756Z                         "info_linguagem": null, 
2026-11-12T13:46:01.2703876Z                         "info_tecnologia": null, 
2026-11-12T13:46:01.2703996Z                         "info_versao": null, 
2026-11-12T13:46:01.2704116Z                         "ipbackup": "192.168.242.175", 
2026-11-12T13:46:01.2704244Z                         "jboss_apache_status": "ativado", 
2026-11-12T13:46:01.2704609Z                         "memoria": 4, 
2026-11-12T13:46:01.2704718Z                         "net_adapter_type": null, 
2026-11-12T13:46:01.2704839Z                         "nome_imagem": null, 
2026-11-12T13:46:01.2705112Z                         "objeto_origem": "SIIFX-CAIXINHAS-BATCH_DES_SERVIDOR", 
2026-11-12T13:46:01.2705246Z                         "plataforma": "vm", 
2026-11-12T13:46:01.2705363Z                         "produto": "jboss", 
2026-11-12T13:46:01.2705480Z                         "recursos_max_id": null, 
2026-11-12T13:46:01.2705659Z                         "sistema": "siifx-caixinhas-batch", 
2026-11-12T13:46:01.2705784Z                         "site": "ctc_nprd", 
2026-11-12T13:46:01.2705903Z                         "solicitacoes_id": null, 
2026-11-12T13:46:01.2706020Z                         "status": "ativado", 
2026-11-12T13:46:01.2706138Z                         "terraform": true, 
2026-11-12T13:46:01.2706258Z                         "versao_imagem": null, 
2026-11-12T13:46:01.2706380Z                         "versao_plataforma": "7.1", 
2026-11-12T13:46:01.2706497Z                         "vm_dns": null, 
2026-11-12T13:46:01.2706602Z                         "vm_ipnetmask": null, 
2026-11-12T13:46:01.2706719Z                         "vm_ipnetmask_bck": null, 
2026-11-12T13:46:01.2706842Z                         "vm_ipnetmask_bck_01": null, 
2026-11-12T13:46:01.2706963Z                         "vsphere_folder": null, 
2026-11-12T13:46:01.2707078Z                         "vsphere_pool": null
2026-11-12T13:46:01.2707184Z                     }
2026-11-12T13:46:01.2707283Z                 }
2026-11-12T13:46:01.2707382Z             }, 
2026-11-12T13:46:01.2707484Z             "ctc_nprd": {
2026-11-12T13:46:01.2707592Z                 "children": [
2026-11-12T13:46:01.2707701Z                     "jboss"
2026-11-12T13:46:01.2707802Z                 ], 
2026-11-12T13:46:01.2707895Z                 "vars": {}
2026-11-12T13:46:01.2707997Z             }, 
2026-11-12T13:46:01.2708101Z             "des": {
2026-11-12T13:46:01.2708214Z                 "children": [
2026-11-12T13:46:01.2708315Z                     "local", 
2026-11-12T13:46:01.2708416Z                     "ctc_nprd"
2026-11-12T13:46:01.2708516Z                 ], 
2026-11-12T13:46:01.2708617Z                 "vars": {}
2026-11-12T13:46:01.2708713Z             }, 
2026-11-12T13:46:01.2708811Z             "jboss": {
2026-11-12T13:46:01.2708916Z                 "hosts": [
2026-11-12T13:46:01.2709037Z                     "caddeapllx2695.agil.nprd.caixa.gov.br"
2026-11-12T13:46:01.2709145Z                 ], 
2026-11-12T13:46:01.2709242Z                 "vars": {}
2026-11-12T13:46:01.2709340Z             }, 
2026-11-12T13:46:01.2709439Z             "local": {
2026-11-12T13:46:01.2709542Z                 "hosts": [
2026-11-12T13:46:01.2709648Z                     "127.0.0.1"
2026-11-12T13:46:01.2709744Z                 ], 
2026-11-12T13:46:01.2709842Z                 "vars": {
2026-11-12T13:46:01.2709958Z                     "ansible_connection": "local"
2026-11-12T13:46:01.2710065Z                 }
2026-11-12T13:46:01.2710255Z             }
2026-11-12T13:46:01.2710347Z         }
2026-11-12T13:46:01.2710441Z     ]
2026-11-12T13:46:01.2710533Z }
2026-11-12T13:46:01.2919622Z Thursday 12 November 2026  10:46:01 -0300 (0:00:00.063)       0:01:13.602 ***** 
2026-11-12T13:46:01.3352870Z 
2026-11-12T13:46:01.3353320Z TASK [vm : Verificando os ambientes] *******************************************
2026-11-12T13:46:01.3353604Z ok: [127.0.0.1] => {
2026-11-12T13:46:01.3353721Z     "msg": [
2026-11-12T13:46:01.3353853Z         "Ambiente existentes! Servidores: caddeapllx2695.agil.nprd.caixa.gov.br"
2026-11-12T13:46:01.3353986Z     ]
2026-11-12T13:46:01.3354082Z }
2026-11-12T13:46:01.3575205Z Thursday 12 November 2026  10:46:01 -0300 (0:00:00.065)       0:01:13.668 ***** 
2026-11-12T13:46:01.4242111Z 
2026-11-12T13:46:01.4242483Z TASK [vm : Recuperar ip] *******************************************************
2026-11-12T13:46:01.4242948Z ok: [127.0.0.1] => (item=caddeapllx2695.agil.nprd.caixa.gov.br)
2026-11-12T13:46:01.4460607Z Thursday 12 November 2026  10:46:01 -0300 (0:00:00.088)       0:01:13.756 ***** 
2026-11-12T13:46:01.5173205Z Thursday 12 November 2026  10:46:01 -0300 (0:00:00.071)       0:01:13.827 ***** 
2026-11-12T13:46:01.5614836Z 
2026-11-12T13:46:01.5615466Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-11-12T13:46:01.5616415Z ok: [127.0.0.1] => {
2026-11-12T13:46:01.5616726Z     "msg": [
2026-11-12T13:46:01.5616889Z         "Servidores: \\\"caddeapllx2695.agil.nprd.caixa.gov.br\\\"", 
2026-11-12T13:46:01.5617045Z         "IPs: \\\"10.116.201.173\\\"", 
2026-11-12T13:46:01.5617170Z         "Gateways: \\\"10.116.192.1\\\"", 
2026-11-12T13:46:01.5617305Z         "IPs Backup: \\\"192.168.242.175\\\"", 
2026-11-12T13:46:01.5617493Z         "Servidores (OBJ): \\\"caddeapllx2695.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.201.173\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.242.175\\\"}"
2026-11-12T13:46:01.5617676Z     ]
2026-11-12T13:46:01.5617765Z }
2026-11-12T13:46:01.5845051Z Thursday 12 November 2026  10:46:01 -0300 (0:00:00.067)       0:01:13.895 ***** 
2026-11-12T13:46:02.3713251Z 
2026-11-12T13:46:02.3714002Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-11-12T13:46:02.3714164Z changed: [127.0.0.1]
2026-11-12T13:46:02.3758707Z 
2026-11-12T13:46:02.3759280Z PLAY [Configurando o DNS] ******************************************************
2026-11-12T13:46:02.5778992Z Thursday 12 November 2026  10:46:02 -0300 (0:00:00.993)       0:01:14.888 ***** 
2026-11-12T13:46:02.7136186Z 
2026-11-12T13:46:02.7136644Z TASK [Consultar DNS] ***********************************************************
2026-11-12T13:46:02.7136841Z changed: [10.116.193.77] => (item=caddeapllx2695.agil.nprd.caixa.gov.br)
2026-11-12T13:46:02.7166289Z Thursday 12 November 2026  10:46:02 -0300 (0:00:00.138)       0:01:15.027 ***** 
2026-11-12T13:46:02.7753258Z 
2026-11-12T13:46:02.7753885Z TASK [Verificar se o domínio resolve para um IP] *******************************
2026-11-12T13:46:02.7754955Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-11-12 10:46:02.701325', u'stdout': u'10.116.201.173', u'item': u'caddeapllx2695.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2695.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.010424', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2695.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.201.173'], u'start': u'2026-11-12 10:46:02.690901'}) => {
2026-11-12T13:46:02.7755635Z     "msg": "O domínio caddeapllx2695.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.201.173']"
2026-11-12T13:46:02.7755797Z }
2026-11-12T13:46:02.7788436Z Thursday 12 November 2026  10:46:02 -0300 (0:00:00.062)       0:01:15.089 ***** 
2026-11-12T13:46:02.8243695Z Thursday 12 November 2026  10:46:02 -0300 (0:00:00.045)       0:01:15.135 ***** 
2026-11-12T13:46:02.8685044Z Thursday 12 November 2026  10:46:02 -0300 (0:00:00.044)       0:01:15.179 ***** 
2026-11-12T13:46:02.9283425Z 
2026-11-12T13:46:02.9284327Z TASK [Set created DNS] *********************************************************
2026-11-12T13:46:02.9285882Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-11-12 10:46:02.701325', u'stdout': u'10.116.201.173', u'item': u'caddeapllx2695.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2695.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.010424', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2695.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.201.173'], u'start': u'2026-11-12 10:46:02.690901'})
2026-11-12T13:46:02.9317989Z Thursday 12 November 2026  10:46:02 -0300 (0:00:00.063)       0:01:15.242 ***** 
2026-11-12T13:46:02.9870784Z 
2026-11-12T13:46:02.9871140Z PLAY [local] *******************************************************************
2026-11-12T13:46:02.9910372Z 
2026-11-12T13:46:02.9910762Z PLAY [Verificando serviços] ****************************************************
2026-11-12T13:46:02.9991446Z 
2026-11-12T13:46:02.9992020Z PLAY [Configuração LDAP] *******************************************************
2026-11-12T13:46:03.0019965Z [WARNING]: Found variable using reserved name: when
2026-11-12T13:46:03.0025366Z 
2026-11-12T13:46:03.0025585Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0099656Z 
2026-11-12T13:46:03.0100291Z PLAY [Stack Jboss] *************************************************************
2026-11-12T13:46:03.0126197Z 
2026-11-12T13:46:03.0126459Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0163192Z 
2026-11-12T13:46:03.0163430Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0201016Z 
2026-11-12T13:46:03.0201170Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0225094Z 
2026-11-12T13:46:03.0225575Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-12T13:46:03.0251524Z 
2026-11-12T13:46:03.0251732Z PLAY [Copiando modules adicionais] *********************************************
2026-11-12T13:46:03.0276033Z 
2026-11-12T13:46:03.0276318Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0310743Z 
2026-11-12T13:46:03.0311008Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0337038Z 
2026-11-12T13:46:03.0337256Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0372770Z 
2026-11-12T13:46:03.0373002Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0398073Z 
2026-11-12T13:46:03.0398321Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0421164Z 
2026-11-12T13:46:03.0421398Z PLAY [local] *******************************************************************
2026-11-12T13:46:03.0444346Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-12T13:46:03.0447123Z 
2026-11-12T13:46:03.0447351Z PLAY [instance_restart] ********************************************************
2026-11-12T13:46:03.0447500Z skipping: no hosts matched
2026-11-12T13:46:03.0450274Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-12T13:46:03.0452807Z 
2026-11-12T13:46:03.0453085Z PLAY [machine_reboot] **********************************************************
2026-11-12T13:46:03.0453249Z skipping: no hosts matched
2026-11-12T13:46:03.0458826Z 
2026-11-12T13:46:03.0459043Z PLAY [local] *******************************************************************
2026-11-12T13:46:03.0482016Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-12T13:46:03.0484647Z 
2026-11-12T13:46:03.0484851Z PLAY [instance_stop] ***********************************************************
2026-11-12T13:46:03.0485006Z skipping: no hosts matched
2026-11-12T13:46:03.0487939Z 
2026-11-12T13:46:03.0488157Z PLAY [machine_reboot] **********************************************************
2026-11-12T13:46:03.0488304Z skipping: no hosts matched
2026-11-12T13:46:03.0493936Z 
2026-11-12T13:46:03.0494152Z PLAY [local] *******************************************************************
2026-11-12T13:46:03.0516355Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-12T13:46:03.0519007Z 
2026-11-12T13:46:03.0519222Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-12T13:46:03.0519365Z skipping: no hosts matched
2026-11-12T13:46:03.0525174Z 
2026-11-12T13:46:03.0525405Z PLAY [local] *******************************************************************
2026-11-12T13:46:03.0545031Z 
2026-11-12T13:46:03.0545234Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-12T13:46:03.0545377Z skipping: no hosts matched
2026-11-12T13:46:03.0553929Z 
2026-11-12T13:46:03.0554173Z PLAY [Configura TSM] ***********************************************************
2026-11-12T13:46:03.0578084Z 
2026-11-12T13:46:03.0578342Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0603434Z 
2026-11-12T13:46:03.0603751Z PLAY [Configura Control-M] *****************************************************
2026-11-12T13:46:03.0636125Z 
2026-11-12T13:46:03.0636396Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0675337Z 
2026-11-12T13:46:03.0675608Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0718510Z 
2026-11-12T13:46:03.0718780Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0756993Z 
2026-11-12T13:46:03.0757256Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0779146Z 
2026-11-12T13:46:03.0779384Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0806665Z 
2026-11-12T13:46:03.0806898Z PLAY [localhost] ***************************************************************
2026-11-12T13:46:03.0830009Z 
2026-11-12T13:46:03.0830324Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0888687Z 
2026-11-12T13:46:03.0889004Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0925206Z 
2026-11-12T13:46:03.0925400Z PLAY [jboss] *******************************************************************
2026-11-12T13:46:03.0958370Z 
2026-11-12T13:46:03.0958677Z PLAY RECAP *********************************************************************
2026-11-12T13:46:03.0958866Z 10.116.193.77              : ok=3    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-11-12T13:46:03.0959051Z 10.116.193.78              : ok=0    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-11-12T13:46:03.0959229Z 127.0.0.1                  : ok=41   changed=5    unreachable=0    failed=0    skipped=10   rescued=0    ignored=0   
2026-11-12T13:46:03.0959304Z 
2026-11-12T13:46:03.0960022Z Thursday 12 November 2026  10:46:03 -0300 (0:00:00.164)       0:01:15.406 ***** 
2026-11-12T13:46:03.0960296Z =============================================================================== 
2026-11-12T13:46:03.0961674Z vm : Executar script para marcar VM como template ---------------------- 38.21s
2026-11-12T13:46:03.0961916Z Gathering Facts -------------------------------------------------------- 28.47s
2026-11-12T13:46:03.0962156Z vm : Criando arquivo para exportar as variáveis ------------------------- 0.99s
2026-11-12T13:46:03.0962392Z vm : Instalar dependências Python para vCenter -------------------------- 0.78s
2026-11-12T13:46:03.0963612Z vm : execute create_ip_bck script --------------------------------------- 0.63s
2026-11-12T13:46:03.0963977Z vm : Consultar API ------------------------------------------------------ 0.56s
2026-11-12T13:46:03.0964213Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.46s
2026-11-12T13:46:03.0964442Z vm : Run Invetory All --------------------------------------------------- 0.41s
2026-11-12T13:46:03.0964888Z vm : Run Invetory All --------------------------------------------------- 0.41s
2026-11-12T13:46:03.0965115Z vm : Consultar API ------------------------------------------------------ 0.40s
2026-11-12T13:46:03.0965460Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.30s
2026-11-12T13:46:03.0965688Z vm : Coletar variáveis de ambiente -------------------------------------- 0.29s
2026-11-12T13:46:03.0965923Z include_role : dns ------------------------------------------------------ 0.16s
2026-11-12T13:46:03.0966146Z Consultar DNS ----------------------------------------------------------- 0.14s
2026-11-12T13:46:03.0966372Z vm : include_tasks ------------------------------------------------------ 0.12s
2026-11-12T13:46:03.0966583Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-11-12T13:46:03.0966814Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-11-12T13:46:03.0967039Z vm : include_tasks ------------------------------------------------------ 0.09s
2026-11-12T13:46:03.0967268Z vm : Cria variável build_repository_name -------------------------------- 0.09s
2026-11-12T13:46:03.0967492Z vm : Cria variável ansible ---------------------------------------------- 0.09s
2026-11-12T13:46:03.0967656Z Playbook run took 0 days, 0 hours, 1 minutes, 15 seconds
2026-11-12T13:46:03.1540092Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)


ele cirou um V, mova talves seja por isso
