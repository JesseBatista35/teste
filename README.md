ESSE IP DE BAKCU ELE ESTA DUBLPKLCIADE ESTAMO QUERNEOD COLCOAR UM NOVO MAIS NAO SABEMMOS SE EXCLOLHE VSAN OU VMOTION

<img width="1215" height="824" alt="image" src="https://github.com/user-attachments/assets/605a4ae9-51c3-4cc8-819d-3ecb4964b03b" />


2026-08-12T19:22:07.1908734Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-08-12T19:22:07.1911606Z ==============================================================================
2026-08-12T19:22:07.1911691Z Task         : Bash
2026-08-12T19:22:07.1911734Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-12T19:22:07.1911809Z Version      : 3.227.0
2026-08-12T19:22:07.1911850Z Author       : Microsoft Corporation
2026-08-12T19:22:07.1911899Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-12T19:22:07.1911974Z ==============================================================================
2026-08-12T19:22:08.1372969Z Generating script.
2026-08-12T19:22:08.1383285Z ========================== Starting Command Output ===========================
2026-08-12T19:22:08.1397620Z [command]/bin/bash /opt/ads-agent/_work/_temp/b767e260-d183-4794-b310-29e0ccbc90df.sh
2026-08-12T19:22:08.1442700Z ++ echo _SIOPI-ws
2026-08-12T19:22:08.1444346Z ++ sed s/_//
2026-08-12T19:22:08.1456798Z + REPO=SIOPI-ws
2026-08-12T19:22:08.1457408Z + ansible-playbook /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/site.yml --tags vm,dns --skip-tags jboss -e sistema_ambiente=des -e sistema_nome=siopi-ws-tge-3 -e site=ctc_nprd -e quantidade_vm=1 -e centralizadora_operacoes=7259 -e centralizadora_desenvolvimento=7390 -e default_working_directory_tfs=/opt/ads-agent/_work/r17133/a -e build_repository_name_tfs=SIOPI-ws
2026-08-12T19:22:10.2471677Z 
2026-08-12T19:22:10.2472210Z PLAY [local] *******************************************************************
2026-08-12T19:22:10.2709626Z Wednesday 12 August 2026  16:22:10 -0300 (0:00:00.087)       0:00:00.087 ****** 
2026-08-12T19:22:33.7719733Z 
2026-08-12T19:22:33.7720354Z TASK [Gathering Facts] *********************************************************
2026-08-12T19:22:33.7720503Z ok: [127.0.0.1]
2026-08-12T19:22:33.8036972Z Wednesday 12 August 2026  16:22:33 -0300 (0:00:23.532)       0:00:23.620 ****** 
2026-08-12T19:22:33.8858416Z Wednesday 12 August 2026  16:22:33 -0300 (0:00:00.082)       0:00:23.702 ****** 
2026-08-12T19:22:33.9603280Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r17133/a
2026-08-12T19:22:33.9603850Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-08-12T19:22:33.9604566Z duplicate dict key (include_tasks). Using last defined value only.
2026-08-12T19:22:33.9709230Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-08-12T19:22:33.9948444Z Wednesday 12 August 2026  16:22:33 -0300 (0:00:00.109)       0:00:23.811 ****** 
2026-08-12T19:22:34.0629659Z 
2026-08-12T19:22:34.0630577Z TASK [vm : Cria variável build_repository_name] ********************************
2026-08-12T19:22:34.0630733Z ok: [127.0.0.1]
2026-08-12T19:22:34.0845351Z Wednesday 12 August 2026  16:22:34 -0300 (0:00:00.089)       0:00:23.901 ****** 
2026-08-12T19:22:34.8927258Z 
2026-08-12T19:22:34.8948500Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-08-12T19:22:34.8948837Z ok: [127.0.0.1]
2026-08-12T19:22:34.9153612Z Wednesday 12 August 2026  16:22:34 -0300 (0:00:00.830)       0:00:24.731 ****** 
2026-08-12T19:22:39.5683058Z 
2026-08-12T19:22:39.5683524Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-08-12T19:22:39.5683680Z changed: [127.0.0.1]
2026-08-12T19:22:39.5927070Z Wednesday 12 August 2026  16:22:39 -0300 (0:00:04.677)       0:00:29.409 ****** 
2026-08-12T19:22:39.6607359Z 
2026-08-12T19:22:39.6607871Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-08-12T19:22:39.6608072Z ok: [127.0.0.1] => {
2026-08-12T19:22:39.6608179Z     "msg": [
2026-08-12T19:22:39.6608297Z         "Iniciando registro do template VMTX...", 
2026-08-12T19:22:39.6608410Z         "vCenter: 10.122.144.195", 
2026-08-12T19:22:39.6608739Z         "Template: eap74-openjdk8-apache24-rhel79-v021_CLONE", 
2026-08-12T19:22:39.6609019Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] eap74-openjdk8-apache24-rhel79-v021_CLONE/eap74-openjdk8-apache24-rhel79-v021_CLONE.vmtx", 
2026-08-12T19:22:39.6609495Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-08-12T19:22:39.6609624Z         "Erro ocorrido: (vim.fault.InvalidLogin) {", 
2026-08-12T19:22:39.6609751Z         "   dynamicType = <unset>,", 
2026-08-12T19:22:39.6609873Z         "   dynamicProperty = (vmodl.DynamicProperty) [],", 
2026-08-12T19:22:39.6610102Z         "   msg = 'Cannot complete login due to an incorrect user name or password.',", 
2026-08-12T19:22:39.6610240Z         "   faultCause = <unset>,", 
2026-08-12T19:22:39.6610371Z         "   faultMessage = (vmodl.LocalizableMessage) []", 
2026-08-12T19:22:39.6610486Z         "}", 
2026-08-12T19:22:39.6610582Z         "Operacao falhou."
2026-08-12T19:22:39.6610678Z     ]
2026-08-12T19:22:39.6610766Z }
2026-08-12T19:22:39.6844094Z Wednesday 12 August 2026  16:22:39 -0300 (0:00:00.091)       0:00:29.501 ****** 
2026-08-12T19:22:39.7532019Z 
2026-08-12T19:22:39.7532757Z TASK [vm : Cria variável ansible] **********************************************
2026-08-12T19:22:39.7532922Z ok: [127.0.0.1]
2026-08-12T19:22:39.7777588Z Wednesday 12 August 2026  16:22:39 -0300 (0:00:00.093)       0:00:29.594 ****** 
2026-08-12T19:22:40.2257412Z 
2026-08-12T19:22:40.2258158Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-08-12T19:22:40.2258303Z ok: [127.0.0.1]
2026-08-12T19:22:40.2467170Z Wednesday 12 August 2026  16:22:40 -0300 (0:00:00.468)       0:00:30.063 ****** 
2026-08-12T19:22:40.5486790Z 
2026-08-12T19:22:40.5487923Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-08-12T19:22:40.5488085Z ok: [127.0.0.1]
2026-08-12T19:22:40.5709036Z Wednesday 12 August 2026  16:22:40 -0300 (0:00:00.324)       0:00:30.387 ****** 
2026-08-12T19:22:40.6310810Z Wednesday 12 August 2026  16:22:40 -0300 (0:00:00.059)       0:00:30.447 ****** 
2026-08-12T19:22:40.7146251Z Wednesday 12 August 2026  16:22:40 -0300 (0:00:00.083)       0:00:30.531 ****** 
2026-08-12T19:22:40.7592709Z 
2026-08-12T19:22:40.7593750Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-08-12T19:22:40.7594070Z ok: [127.0.0.1]
2026-08-12T19:22:40.7823194Z Wednesday 12 August 2026  16:22:40 -0300 (0:00:00.067)       0:00:30.598 ****** 
2026-08-12T19:22:40.8601349Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-08-12T19:22:40.8880295Z Wednesday 12 August 2026  16:22:40 -0300 (0:00:00.105)       0:00:30.704 ****** 
2026-08-12T19:22:40.9511011Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-08-12T19:22:40.9805821Z Wednesday 12 August 2026  16:22:40 -0300 (0:00:00.092)       0:00:30.797 ****** 
2026-08-12T19:22:41.5470707Z 
2026-08-12T19:22:41.5471449Z TASK [vm : Consultar API] ******************************************************
2026-08-12T19:22:41.5471749Z ok: [127.0.0.1]
2026-08-12T19:22:41.5701000Z Wednesday 12 August 2026  16:22:41 -0300 (0:00:00.589)       0:00:31.386 ****** 
2026-08-12T19:22:41.6111962Z 
2026-08-12T19:22:41.6112705Z TASK [vm : Parse JSON] *********************************************************
2026-08-12T19:22:41.6113244Z ok: [127.0.0.1]
2026-08-12T19:22:41.6340909Z Wednesday 12 August 2026  16:22:41 -0300 (0:00:00.063)       0:00:31.450 ****** 
2026-08-12T19:22:41.6990952Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-08-12T19:22:41.7304356Z Wednesday 12 August 2026  16:22:41 -0300 (0:00:00.096)       0:00:31.546 ****** 
2026-08-12T19:22:42.2141671Z 
2026-08-12T19:22:42.2142461Z TASK [vm : Consultar API] ******************************************************
2026-08-12T19:22:42.2143080Z ok: [127.0.0.1]
2026-08-12T19:22:42.2373065Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.507)       0:00:32.054 ****** 
2026-08-12T19:22:42.2871150Z 
2026-08-12T19:22:42.2871881Z TASK [vm : Parse JSON] *********************************************************
2026-08-12T19:22:42.2872993Z ok: [127.0.0.1]
2026-08-12T19:22:42.3097012Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.072)       0:00:32.126 ****** 
2026-08-12T19:22:42.3727659Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.063)       0:00:32.189 ****** 
2026-08-12T19:22:42.4243734Z 
2026-08-12T19:22:42.4244346Z TASK [vm : Exibir size servidores.] ********************************************
2026-08-12T19:22:42.4246820Z ok: [127.0.0.1] => {
2026-08-12T19:22:42.4247462Z     "api_data.dados.0": {
2026-08-12T19:22:42.4247672Z         "ambiente": "des", 
2026-08-12T19:22:42.4247815Z         "cluster": null, 
2026-08-12T19:22:42.4247975Z         "cluster_principal": null, 
2026-08-12T19:22:42.4248121Z         "cluster_terraform": null, 
2026-08-12T19:22:42.4248270Z         "cpu": 2, 
2026-08-12T19:22:42.4248378Z         "datacenter": null, 
2026-08-12T19:22:42.4248496Z         "datastore": null, 
2026-08-12T19:22:42.4248602Z         "detalhe_imagem": null, 
2026-08-12T19:22:42.4248725Z         "disco_log": 2, 
2026-08-12T19:22:42.4248835Z         "disco_opt": 10, 
2026-08-12T19:22:42.4248940Z         "domain": null, 
2026-08-12T19:22:42.4249046Z         "esx_network": null, 
2026-08-12T19:22:42.4249147Z         "esx_network_bck": null, 
2026-08-12T19:22:42.4249257Z         "esx_vcenter_server": null, 
2026-08-12T19:22:42.4249365Z         "farm": null, 
2026-08-12T19:22:42.4249466Z         "id": 13316, 
2026-08-12T19:22:42.4249778Z         "inclusao": "2026-06-01 09:22:29", 
2026-08-12T19:22:42.4249892Z         "info_framework": null, 
2026-08-12T19:22:42.4250219Z         "info_linguagem": null, 
2026-08-12T19:22:42.4250331Z         "info_tecnologia": null, 
2026-08-12T19:22:42.4250441Z         "info_versao": null, 
2026-08-12T19:22:42.4250555Z         "ipbackup": "192.168.242.142", 
2026-08-12T19:22:42.4250664Z         "jboss_apache_status": "ativado", 
2026-08-12T19:22:42.4250774Z         "memoria": 4, 
2026-08-12T19:22:42.4250882Z         "net_adapter_type": null, 
2026-08-12T19:22:42.4250997Z         "nome_imagem": null, 
2026-08-12T19:22:42.4251173Z         "objeto_origem": "SIOPI-WS-TGE-3_DES_SERVIDOR", 
2026-08-12T19:22:42.4251289Z         "plataforma": "vm", 
2026-08-12T19:22:42.4251401Z         "produto": "jboss", 
2026-08-12T19:22:42.4251510Z         "recursos_max_id": null, 
2026-08-12T19:22:42.4251619Z         "servidores_json": [
2026-08-12T19:22:42.4251720Z             {
2026-08-12T19:22:42.4251814Z                 "ip": "10.116.201.144", 
2026-08-12T19:22:42.4251933Z                 "jboss_apache_status": "ativado", 
2026-08-12T19:22:42.4252064Z                 "nome": "caddeapllx2529.agil.nprd.caixa.gov.br"
2026-08-12T19:22:42.4252177Z             }
2026-08-12T19:22:42.4252268Z         ], 
2026-08-12T19:22:42.4252404Z         "sistema": "siopi-ws-tge-3", 
2026-08-12T19:22:42.4252515Z         "site": "ctc_nprd", 
2026-08-12T19:22:42.4252622Z         "solicitacoes_id": null, 
2026-08-12T19:22:42.4252731Z         "status": "ativado", 
2026-08-12T19:22:42.4252838Z         "terraform": true, 
2026-08-12T19:22:42.4252943Z         "versao_imagem": null, 
2026-08-12T19:22:42.4253054Z         "versao_plataforma": "7.1", 
2026-08-12T19:22:42.4253166Z         "vm_dns": null, 
2026-08-12T19:22:42.4253271Z         "vm_ipnetmask": null, 
2026-08-12T19:22:42.4253371Z         "vm_ipnetmask_bck": null, 
2026-08-12T19:22:42.4253481Z         "vsphere_folder": null, 
2026-08-12T19:22:42.4253590Z         "vsphere_pool": null
2026-08-12T19:22:42.4253684Z     }
2026-08-12T19:22:42.4253777Z }
2026-08-12T19:22:42.4480821Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.075)       0:00:32.264 ****** 
2026-08-12T19:22:42.5089507Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.060)       0:00:32.325 ****** 
2026-08-12T19:22:42.5565083Z 
2026-08-12T19:22:42.5565702Z TASK [vm : Set size] ***********************************************************
2026-08-12T19:22:42.5565901Z ok: [127.0.0.1]
2026-08-12T19:22:42.5784011Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.069)       0:00:32.394 ****** 
2026-08-12T19:22:42.6218298Z 
2026-08-12T19:22:42.6219023Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-08-12T19:22:42.6219344Z ok: [127.0.0.1]
2026-08-12T19:22:42.6431124Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.064)       0:00:32.459 ****** 
2026-08-12T19:22:42.6835005Z 
2026-08-12T19:22:42.6835529Z TASK [vm : debug] **************************************************************
2026-08-12T19:22:42.6835681Z ok: [127.0.0.1] => {
2026-08-12T19:22:42.6836023Z     "template_name": "eap74-openjdk8-apache24-rhel79-v021_CLONE"
2026-08-12T19:22:42.6838862Z }
2026-08-12T19:22:42.7055149Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.062)       0:00:32.522 ****** 
2026-08-12T19:22:42.7490643Z 
2026-08-12T19:22:42.7491373Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-08-12T19:22:42.7491524Z ok: [127.0.0.1]
2026-08-12T19:22:42.7709723Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.065)       0:00:32.587 ****** 
2026-08-12T19:22:42.8357236Z Wednesday 12 August 2026  16:22:42 -0300 (0:00:00.064)       0:00:32.652 ****** 
2026-08-12T19:22:43.2421504Z 
2026-08-12T19:22:43.2421954Z TASK [vm : Run Invetory All] ***************************************************
2026-08-12T19:22:43.2422134Z changed: [127.0.0.1]
2026-08-12T19:22:43.2694435Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.433)       0:00:33.086 ****** 
2026-08-12T19:22:43.3141000Z 
2026-08-12T19:22:43.3141523Z TASK [vm : Parse JSON output] **************************************************
2026-08-12T19:22:43.3141672Z ok: [127.0.0.1]
2026-08-12T19:22:43.3369815Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.067)       0:00:33.153 ****** 
2026-08-12T19:22:43.3866800Z 
2026-08-12T19:22:43.3867319Z TASK [vm : Count the number of hosts] ******************************************
2026-08-12T19:22:43.3867465Z ok: [127.0.0.1]
2026-08-12T19:22:43.4087566Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.071)       0:00:33.225 ****** 
2026-08-12T19:22:43.4703548Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.061)       0:00:33.286 ****** 
2026-08-12T19:22:43.5361868Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.065)       0:00:33.352 ****** 
2026-08-12T19:22:43.5757717Z 
2026-08-12T19:22:43.5758647Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-08-12T19:22:43.5758840Z ok: [127.0.0.1] => {
2026-08-12T19:22:43.5758939Z     "msg": [
2026-08-12T19:22:43.5759045Z         "num_hosts: 1"
2026-08-12T19:22:43.5759279Z     ]
2026-08-12T19:22:43.5760216Z }
2026-08-12T19:22:43.5983096Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.062)       0:00:33.414 ****** 
2026-08-12T19:22:43.6622710Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.063)       0:00:33.478 ****** 
2026-08-12T19:22:43.7284255Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.066)       0:00:33.545 ****** 
2026-08-12T19:22:43.7898022Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-08-12T19:22:43.8236276Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.095)       0:00:33.640 ****** 
2026-08-12T19:22:43.8871133Z included: /opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-08-12T19:22:43.9111817Z Wednesday 12 August 2026  16:22:43 -0300 (0:00:00.087)       0:00:33.727 ****** 
2026-08-12T19:22:43.9577978Z 
2026-08-12T19:22:43.9579026Z TASK [vm : Criar variáveis] ****************************************************
2026-08-12T19:22:43.9579251Z ok: [127.0.0.1]
2026-08-12T19:22:44.0398687Z Wednesday 12 August 2026  16:22:44 -0300 (0:00:00.128)       0:00:33.856 ****** 
2026-08-12T19:22:44.3306832Z 
2026-08-12T19:22:44.3307752Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-08-12T19:22:44.3308038Z ok: [127.0.0.1]
2026-08-12T19:22:44.3719357Z Wednesday 12 August 2026  16:22:44 -0300 (0:00:00.332)       0:00:34.188 ****** 
2026-08-12T19:22:44.4138942Z 
2026-08-12T19:22:44.4139789Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-08-12T19:22:44.4141232Z ok: [127.0.0.1] => {
2026-08-12T19:22:44.4141921Z     "nfs_vars_json": {
2026-08-12T19:22:44.4142132Z         "changed": false, 
2026-08-12T19:22:44.4142467Z         "cmd": "cat /opt/ads-agent/_work/r17133/a/nfs_config.json", 
2026-08-12T19:22:44.4142643Z         "delta": "0:00:00.003147", 
2026-08-12T19:22:44.4142811Z         "end": "2026-08-12 16:22:44.313914", 
2026-08-12T19:22:44.4142932Z         "failed": false, 
2026-08-12T19:22:44.4143038Z         "rc": 0, 
2026-08-12T19:22:44.4143200Z         "start": "2026-08-12 16:22:44.310767", 
2026-08-12T19:22:44.4143341Z         "stderr": "", 
2026-08-12T19:22:44.4143436Z         "stderr_lines": [], 
2026-08-12T19:22:44.4143612Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]", 
2026-08-12T19:22:44.4143784Z         "stdout_lines": [
2026-08-12T19:22:44.4143946Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]"
2026-08-12T19:22:44.4144101Z         ]
2026-08-12T19:22:44.4144195Z     }
2026-08-12T19:22:44.4144276Z }
2026-08-12T19:22:44.4364711Z Wednesday 12 August 2026  16:22:44 -0300 (0:00:00.064)       0:00:34.253 ****** 
2026-08-12T19:22:44.4809101Z 
2026-08-12T19:22:44.4809776Z TASK [vm : Criar variáveis] ****************************************************
2026-08-12T19:22:44.4809958Z ok: [127.0.0.1]
2026-08-12T19:22:44.5038245Z Wednesday 12 August 2026  16:22:44 -0300 (0:00:00.067)       0:00:34.320 ****** 
2026-08-12T19:22:45.0940511Z 
2026-08-12T19:22:45.0941018Z TASK [vm : execute create_ip_bck script] ***************************************
2026-08-12T19:22:45.0944990Z changed: [127.0.0.1]
2026-08-12T19:22:45.1214585Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.617)       0:00:34.938 ****** 
2026-08-12T19:22:45.1661113Z 
2026-08-12T19:22:45.1661793Z TASK [vm : ansible.builtin.debug] **********************************************
2026-08-12T19:22:45.1666132Z ok: [127.0.0.1] => {
2026-08-12T19:22:45.1666702Z     "changed": false, 
2026-08-12T19:22:45.1666889Z     "msg": {
2026-08-12T19:22:45.1667000Z         "changed": true, 
2026-08-12T19:22:45.1667095Z         "cmd": [
2026-08-12T19:22:45.1667225Z             "python", 
2026-08-12T19:22:45.1667567Z             "/opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-08-12T19:22:45.1667707Z             "create_ip_bck", 
2026-08-12T19:22:45.1667855Z             "siopi-ws-tge-3", 
2026-08-12T19:22:45.1667971Z             "des", 
2026-08-12T19:22:45.1668064Z             "ctc_nprd", 
2026-08-12T19:22:45.1668243Z             "/opt/ads-agent/_work/r17133/a/esteira-jboss-vm-v2", 
2026-08-12T19:22:45.1668367Z             "C&t@d02", 
2026-08-12T19:22:45.1668471Z             "@ut0m@c@0!", 
2026-08-12T19:22:45.1668585Z             "s736651@corp.caixa.gov.br", 
2026-08-12T19:22:45.1668689Z             "8As4jL6Q", 
2026-08-12T19:22:45.1668861Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI\",\"NFS_MOUNT_POINT_ISILON\": \"/opt/sistemas\"}]"
2026-08-12T19:22:45.1669037Z         ], 
2026-08-12T19:22:45.1669163Z         "delta": "0:00:00.298613", 
2026-08-12T19:22:45.1669337Z         "end": "2026-08-12 16:22:45.079084", 
2026-08-12T19:22:45.1669447Z         "failed": false, 
2026-08-12T19:22:45.1669546Z         "rc": 0, 
2026-08-12T19:22:45.1669709Z         "start": "2026-08-12 16:22:44.780471", 
2026-08-12T19:22:45.1669833Z         "stderr": "", 
2026-08-12T19:22:45.1669936Z         "stderr_lines": [], 
2026-08-12T19:22:45.1671124Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nNFS ENDPOINT: {u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas'}\nVariaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'), (u'NFS_MOUNT_POINT_ISILON', u'/opt/sistemas'))]\nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI/opt/sistemasISILONnfsctcnprd.ctc.caixades\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                ", 
2026-08-12T19:22:45.1672016Z         "stdout_lines": [
2026-08-12T19:22:45.1672282Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'}]", 
2026-08-12T19:22:45.1672471Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-08-12T19:22:45.1672823Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-08-12T19:22:45.1673716Z             "NFS ENDPOINT: {u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON': u'/opt/sistemas'}", 
2026-08-12T19:22:45.1674115Z             "Variaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI'), (u'NFS_MOUNT_POINT_ISILON', u'/opt/sistemas'))]", 
2026-08-12T19:22:45.1674338Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI/opt/sistemasISILONnfsctcnprd.ctc.caixades", 
2026-08-12T19:22:45.1674543Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SIOPI /opt/sistemas                       ISILON                              nfsctcnprd.ctc.caixa                des                                "
2026-08-12T19:22:45.1675076Z         ]
2026-08-12T19:22:45.1675182Z     }
2026-08-12T19:22:45.1675263Z }
2026-08-12T19:22:45.1894433Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.067)       0:00:35.006 ****** 
2026-08-12T19:22:45.5903513Z 
2026-08-12T19:22:45.5904063Z TASK [vm : Run Invetory All] ***************************************************
2026-08-12T19:22:45.5904202Z changed: [127.0.0.1]
2026-08-12T19:22:45.6134734Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.424)       0:00:35.430 ****** 
2026-08-12T19:22:45.6565308Z 
2026-08-12T19:22:45.6565773Z TASK [vm : Parse JSON output] **************************************************
2026-08-12T19:22:45.6565975Z ok: [127.0.0.1]
2026-08-12T19:22:45.6786907Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.065)       0:00:35.495 ****** 
2026-08-12T19:22:45.7223534Z 
2026-08-12T19:22:45.7224235Z TASK [vm : Debug parsed_output] ************************************************
2026-08-12T19:22:45.7228257Z ok: [127.0.0.1] => {
2026-08-12T19:22:45.7228514Z     "msg": [
2026-08-12T19:22:45.7229212Z         {
2026-08-12T19:22:45.7229367Z             "_meta": {
2026-08-12T19:22:45.7229497Z                 "hostvars": {
2026-08-12T19:22:45.7229623Z                     "caddeapllx2529.agil.nprd.caixa.gov.br": {
2026-08-12T19:22:45.7229750Z                         "ambiente": "des", 
2026-08-12T19:22:45.7229870Z                         "ansible_host": "10.116.201.144", 
2026-08-12T19:22:45.7229986Z                         "cluster": null, 
2026-08-12T19:22:45.7230276Z                         "cluster_principal": null, 
2026-08-12T19:22:45.7230665Z                         "cluster_terraform": null, 
2026-08-12T19:22:45.7230774Z                         "cpu": 2, 
2026-08-12T19:22:45.7230882Z                         "datacenter": null, 
2026-08-12T19:22:45.7230998Z                         "datastore": null, 
2026-08-12T19:22:45.7231108Z                         "detalhe_imagem": null, 
2026-08-12T19:22:45.7231741Z                         "disco_log": 2, 
2026-08-12T19:22:45.7231853Z                         "disco_opt": 10, 
2026-08-12T19:22:45.7231959Z                         "domain": null, 
2026-08-12T19:22:45.7232075Z                         "esx_network": null, 
2026-08-12T19:22:45.7233356Z                         "esx_network_bck": null, 
2026-08-12T19:22:45.7233551Z                         "esx_vcenter_server": null, 
2026-08-12T19:22:45.7234686Z                         "farm": null, 
2026-08-12T19:22:45.7234981Z                         "id": 13316, 
2026-08-12T19:22:45.7236391Z                         "inclusao": "2026-06-01 09:22:29", 
2026-08-12T19:22:45.7237550Z                         "info_framework": null, 
2026-08-12T19:22:45.7238677Z                         "info_linguagem": null, 
2026-08-12T19:22:45.7239697Z                         "info_tecnologia": null, 
2026-08-12T19:22:45.7239913Z                         "info_versao": null, 
2026-08-12T19:22:45.7240132Z                         "ipbackup": "192.168.242.142", 
2026-08-12T19:22:45.7240357Z                         "jboss_apache_status": "ativado", 
2026-08-12T19:22:45.7240569Z                         "memoria": 4, 
2026-08-12T19:22:45.7241011Z                         "net_adapter_type": null, 
2026-08-12T19:22:45.7241451Z                         "nome_imagem": null, 
2026-08-12T19:22:45.7241831Z                         "objeto_origem": "SIOPI-WS-TGE-3_DES_SERVIDOR", 
2026-08-12T19:22:45.7241986Z                         "plataforma": "vm", 
2026-08-12T19:22:45.7242091Z                         "produto": "jboss", 
2026-08-12T19:22:45.7242208Z                         "recursos_max_id": null, 
2026-08-12T19:22:45.7242386Z                         "sistema": "siopi-ws-tge-3", 
2026-08-12T19:22:45.7242502Z                         "site": "ctc_nprd", 
2026-08-12T19:22:45.7242616Z                         "solicitacoes_id": null, 
2026-08-12T19:22:45.7242718Z                         "status": "ativado", 
2026-08-12T19:22:45.7242831Z                         "terraform": true, 
2026-08-12T19:22:45.7242945Z                         "versao_imagem": null, 
2026-08-12T19:22:45.7243060Z                         "versao_plataforma": "7.1", 
2026-08-12T19:22:45.7243182Z                         "vm_dns": null, 
2026-08-12T19:22:45.7243282Z                         "vm_ipnetmask": null, 
2026-08-12T19:22:45.7243395Z                         "vm_ipnetmask_bck": null, 
2026-08-12T19:22:45.7243508Z                         "vsphere_folder": null, 
2026-08-12T19:22:45.7243641Z                         "vsphere_pool": null
2026-08-12T19:22:45.7243770Z                     }
2026-08-12T19:22:45.7243883Z                 }
2026-08-12T19:22:45.7243985Z             }, 
2026-08-12T19:22:45.7244124Z             "ctc_nprd": {
2026-08-12T19:22:45.7244283Z                 "children": [
2026-08-12T19:22:45.7244389Z                     "jboss"
2026-08-12T19:22:45.7244479Z                 ], 
2026-08-12T19:22:45.7244578Z                 "vars": {}
2026-08-12T19:22:45.7244674Z             }, 
2026-08-12T19:22:45.7245831Z             "des": {
2026-08-12T19:22:45.7245982Z                 "children": [
2026-08-12T19:22:45.7246091Z                     "local", 
2026-08-12T19:22:45.7246205Z                     "ctc_nprd"
2026-08-12T19:22:45.7246314Z                 ], 
2026-08-12T19:22:45.7246416Z                 "vars": {}
2026-08-12T19:22:45.7246517Z             }, 
2026-08-12T19:22:45.7246615Z             "jboss": {
2026-08-12T19:22:45.7246717Z                 "hosts": [
2026-08-12T19:22:45.7246824Z                     "caddeapllx2529.agil.nprd.caixa.gov.br"
2026-08-12T19:22:45.7246936Z                 ], 
2026-08-12T19:22:45.7247169Z                 "vars": {}
2026-08-12T19:22:45.7247267Z             }, 
2026-08-12T19:22:45.7247366Z             "local": {
2026-08-12T19:22:45.7247457Z                 "hosts": [
2026-08-12T19:22:45.7247558Z                     "127.0.0.1"
2026-08-12T19:22:45.7247653Z                 ], 
2026-08-12T19:22:45.7247749Z                 "vars": {
2026-08-12T19:22:45.7247856Z                     "ansible_connection": "local"
2026-08-12T19:22:45.7247951Z                 }
2026-08-12T19:22:45.7248043Z             }
2026-08-12T19:22:45.7248134Z         }
2026-08-12T19:22:45.7248225Z     ]
2026-08-12T19:22:45.7248306Z }
2026-08-12T19:22:45.7459228Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.067)       0:00:35.562 ****** 
2026-08-12T19:22:45.7933962Z 
2026-08-12T19:22:45.7934642Z TASK [vm : Verificando os ambientes] *******************************************
2026-08-12T19:22:45.7935102Z ok: [127.0.0.1] => {
2026-08-12T19:22:45.7935669Z     "msg": [
2026-08-12T19:22:45.7935889Z         "Ambiente existentes! Servidores: caddeapllx2529.agil.nprd.caixa.gov.br"
2026-08-12T19:22:45.7936038Z     ]
2026-08-12T19:22:45.7936133Z }
2026-08-12T19:22:45.8169088Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.070)       0:00:35.633 ****** 
2026-08-12T19:22:45.8959670Z 
2026-08-12T19:22:45.8960284Z TASK [vm : Recuperar ip] *******************************************************
2026-08-12T19:22:45.8960506Z ok: [127.0.0.1] => (item=caddeapllx2529.agil.nprd.caixa.gov.br)
2026-08-12T19:22:45.9191299Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.102)       0:00:35.735 ****** 
2026-08-12T19:22:45.9948729Z Wednesday 12 August 2026  16:22:45 -0300 (0:00:00.075)       0:00:35.811 ****** 
2026-08-12T19:22:46.0438399Z 
2026-08-12T19:22:46.0439078Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-08-12T19:22:46.0439300Z ok: [127.0.0.1] => {
2026-08-12T19:22:46.0439432Z     "msg": [
2026-08-12T19:22:46.0439607Z         "Servidores: \\\"caddeapllx2529.agil.nprd.caixa.gov.br\\\"", 
2026-08-12T19:22:46.0439842Z         "IPs: \\\"10.116.201.144\\\"", 
2026-08-12T19:22:46.0440018Z         "Gateways: \\\"10.116.192.1\\\"", 
2026-08-12T19:22:46.0440199Z         "IPs Backup: \\\"192.168.242.142\\\"", 
2026-08-12T19:22:46.0440451Z         "Servidores (OBJ): \\\"caddeapllx2529.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.201.144\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.242.142\\\"}"
2026-08-12T19:22:46.0440691Z     ]
2026-08-12T19:22:46.0440828Z }
2026-08-12T19:22:46.0656998Z Wednesday 12 August 2026  16:22:46 -0300 (0:00:00.070)       0:00:35.882 ****** 
2026-08-12T19:22:46.8877873Z 
2026-08-12T19:22:46.8878864Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-08-12T19:22:46.8879210Z changed: [127.0.0.1]
2026-08-12T19:22:46.8933855Z 
2026-08-12T19:22:46.8935240Z PLAY [Configurando o DNS] ******************************************************
2026-08-12T19:22:47.1175971Z Wednesday 12 August 2026  16:22:47 -0300 (0:00:01.051)       0:00:36.934 ****** 
2026-08-12T19:22:47.2577937Z 
2026-08-12T19:22:47.2578778Z TASK [Consultar DNS] ***********************************************************
2026-08-12T19:22:47.2579321Z changed: [10.116.193.77] => (item=caddeapllx2529.agil.nprd.caixa.gov.br)
2026-08-12T19:22:47.2619328Z Wednesday 12 August 2026  16:22:47 -0300 (0:00:00.144)       0:00:37.078 ****** 
2026-08-12T19:22:47.3238574Z 
2026-08-12T19:22:47.3239709Z TASK [Verificar se o domínio resolve para um IP] *******************************
2026-08-12T19:22:47.3240691Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-08-12 16:22:47.244145', u'stdout': u'10.116.201.144', u'item': u'caddeapllx2529.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2529.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.010541', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2529.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.201.144'], u'start': u'2026-08-12 16:22:47.233604'}) => {
2026-08-12T19:22:47.3241749Z     "msg": "O domínio caddeapllx2529.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.201.144']"
2026-08-12T19:22:47.3241897Z }
2026-08-12T19:22:47.3273893Z Wednesday 12 August 2026  16:22:47 -0300 (0:00:00.065)       0:00:37.144 ****** 
2026-08-12T19:22:47.3761655Z Wednesday 12 August 2026  16:22:47 -0300 (0:00:00.048)       0:00:37.192 ****** 
2026-08-12T19:22:47.4240511Z Wednesday 12 August 2026  16:22:47 -0300 (0:00:00.048)       0:00:37.240 ****** 
2026-08-12T19:22:47.4852913Z 
2026-08-12T19:22:47.4853765Z TASK [Set created DNS] *********************************************************
2026-08-12T19:22:47.4854941Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-08-12 16:22:47.244145', u'stdout': u'10.116.201.144', u'item': u'caddeapllx2529.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2529.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.010541', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2529.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.201.144'], u'start': u'2026-08-12 16:22:47.233604'})
2026-08-12T19:22:47.4891118Z Wednesday 12 August 2026  16:22:47 -0300 (0:00:00.065)       0:00:37.305 ****** 
2026-08-12T19:22:47.5472792Z 
2026-08-12T19:22:47.5473424Z PLAY [local] *******************************************************************
2026-08-12T19:22:47.5507703Z 
2026-08-12T19:22:47.5508321Z PLAY [Verificando serviços] ****************************************************
2026-08-12T19:22:47.5580635Z 
2026-08-12T19:22:47.5581168Z PLAY [Configuração LDAP] *******************************************************
2026-08-12T19:22:47.5607366Z [WARNING]: Found variable using reserved name: when
2026-08-12T19:22:47.5615073Z 
2026-08-12T19:22:47.5615271Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5699457Z 
2026-08-12T19:22:47.5699708Z PLAY [Stack Jboss] *************************************************************
2026-08-12T19:22:47.5723849Z 
2026-08-12T19:22:47.5724053Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5763307Z 
2026-08-12T19:22:47.5763695Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5800939Z 
2026-08-12T19:22:47.5801191Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5826729Z 
2026-08-12T19:22:47.5827027Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-12T19:22:47.5850517Z 
2026-08-12T19:22:47.5851002Z PLAY [Copiando modules adicionais] *********************************************
2026-08-12T19:22:47.5878185Z 
2026-08-12T19:22:47.5878445Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5911815Z 
2026-08-12T19:22:47.5912131Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5940375Z 
2026-08-12T19:22:47.5940691Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5968658Z 
2026-08-12T19:22:47.5968863Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.5995154Z 
2026-08-12T19:22:47.5995500Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6021891Z 
2026-08-12T19:22:47.6022829Z PLAY [local] *******************************************************************
2026-08-12T19:22:47.6047223Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-08-12T19:22:47.6048944Z 
2026-08-12T19:22:47.6049229Z PLAY [instance_restart] ********************************************************
2026-08-12T19:22:47.6049379Z skipping: no hosts matched
2026-08-12T19:22:47.6051986Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-08-12T19:22:47.6054312Z 
2026-08-12T19:22:47.6054470Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:22:47.6054844Z skipping: no hosts matched
2026-08-12T19:22:47.6061107Z 
2026-08-12T19:22:47.6061352Z PLAY [local] *******************************************************************
2026-08-12T19:22:47.6087155Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-08-12T19:22:47.6089261Z 
2026-08-12T19:22:47.6089569Z PLAY [instance_stop] ***********************************************************
2026-08-12T19:22:47.6089731Z skipping: no hosts matched
2026-08-12T19:22:47.6092611Z 
2026-08-12T19:22:47.6093172Z PLAY [machine_reboot] **********************************************************
2026-08-12T19:22:47.6093385Z skipping: no hosts matched
2026-08-12T19:22:47.6098761Z 
2026-08-12T19:22:47.6098989Z PLAY [local] *******************************************************************
2026-08-12T19:22:47.6123248Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-08-12T19:22:47.6126243Z 
2026-08-12T19:22:47.6126517Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-08-12T19:22:47.6126676Z skipping: no hosts matched
2026-08-12T19:22:47.6132408Z 
2026-08-12T19:22:47.6132662Z PLAY [local] *******************************************************************
2026-08-12T19:22:47.6153808Z 
2026-08-12T19:22:47.6154045Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-08-12T19:22:47.6154244Z skipping: no hosts matched
2026-08-12T19:22:47.6168523Z 
2026-08-12T19:22:47.6168917Z PLAY [Configura TSM] ***********************************************************
2026-08-12T19:22:47.6193531Z 
2026-08-12T19:22:47.6193801Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6219228Z 
2026-08-12T19:22:47.6219598Z PLAY [Configura Control-M] *****************************************************
2026-08-12T19:22:47.6255006Z 
2026-08-12T19:22:47.6255309Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6295352Z 
2026-08-12T19:22:47.6295539Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6334238Z 
2026-08-12T19:22:47.6334927Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6357109Z 
2026-08-12T19:22:47.6357704Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6386133Z 
2026-08-12T19:22:47.6386422Z PLAY [localhost] ***************************************************************
2026-08-12T19:22:47.6408922Z 
2026-08-12T19:22:47.6409239Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6450579Z 
2026-08-12T19:22:47.6450960Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6491403Z 
2026-08-12T19:22:47.6492211Z PLAY [jboss] *******************************************************************
2026-08-12T19:22:47.6520443Z 
2026-08-12T19:22:47.6520642Z PLAY RECAP *********************************************************************
2026-08-12T19:22:47.6520900Z 10.116.193.77              : ok=3    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-08-12T19:22:47.6521080Z 10.116.193.78              : ok=0    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-08-12T19:22:47.6521573Z 127.0.0.1                  : ok=41   changed=5    unreachable=0    failed=0    skipped=10   rescued=0    ignored=0   
2026-08-12T19:22:47.6521642Z 
2026-08-12T19:22:47.6522253Z Wednesday 12 August 2026  16:22:47 -0300 (0:00:00.163)       0:00:37.469 ****** 
2026-08-12T19:22:47.6522430Z =============================================================================== 
2026-08-12T19:22:47.6526058Z Gathering Facts -------------------------------------------------------- 23.53s
2026-08-12T19:22:47.6526358Z vm : Executar script para marcar VM como template ----------------------- 4.68s
2026-08-12T19:22:47.6526632Z vm : Criando arquivo para exportar as variáveis ------------------------- 1.05s
2026-08-12T19:22:47.6526861Z vm : Instalar dependências Python para vCenter -------------------------- 0.83s
2026-08-12T19:22:47.6527081Z vm : execute create_ip_bck script --------------------------------------- 0.62s
2026-08-12T19:22:47.6527290Z vm : Consultar API ------------------------------------------------------ 0.59s
2026-08-12T19:22:47.6527522Z vm : Consultar API ------------------------------------------------------ 0.51s
2026-08-12T19:22:47.6527741Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.47s
2026-08-12T19:22:47.6527957Z vm : Run Invetory All --------------------------------------------------- 0.43s
2026-08-12T19:22:47.6528168Z vm : Run Invetory All --------------------------------------------------- 0.42s
2026-08-12T19:22:47.6528386Z vm : Coletar variáveis de ambiente -------------------------------------- 0.33s
2026-08-12T19:22:47.6528782Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.32s
2026-08-12T19:22:47.6529000Z include_role : dns ------------------------------------------------------ 0.16s
2026-08-12T19:22:47.6529220Z Consultar DNS ----------------------------------------------------------- 0.14s
2026-08-12T19:22:47.6529438Z vm : Criar variáveis ---------------------------------------------------- 0.13s
2026-08-12T19:22:47.6529659Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-08-12T19:22:47.6529875Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-08-12T19:22:47.6530081Z vm : Recuperar ip ------------------------------------------------------- 0.10s
2026-08-12T19:22:47.6530300Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-08-12T19:22:47.6530513Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-08-12T19:22:47.6530662Z Playbook run took 0 days, 0 hours, 0 minutes, 37 seconds
2026-08-12T19:22:47.7203778Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
