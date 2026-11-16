2026-11-04T13:22:49.3476832Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-11-04T13:22:49.3479851Z ==============================================================================
2026-11-04T13:22:49.3479934Z Task         : Bash
2026-11-04T13:22:49.3479993Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-04T13:22:49.3480062Z Version      : 3.227.0
2026-11-04T13:22:49.3480109Z Author       : Microsoft Corporation
2026-11-04T13:22:49.3480173Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-04T13:22:49.3480279Z ==============================================================================
2026-11-04T13:22:50.3662186Z Generating script.
2026-11-04T13:22:50.3673059Z ========================== Starting Command Output ===========================
2026-11-04T13:22:50.3680279Z [command]/bin/bash /opt/ads-agent/_work/_temp/98316afc-0a9d-4edb-8268-16d27c2d6b5b.sh
2026-11-04T13:22:50.3756821Z /opt/ads-agent/_work/_temp/98316afc-0a9d-4edb-8268-16d27c2d6b5b.sh: line 4: tf_var_quant: comando não encontrado
2026-11-04T13:22:52.6716878Z 
2026-11-04T13:22:52.6717427Z PLAY [local] *******************************************************************
2026-11-04T13:22:52.6960203Z Wednesday 04 November 2026  10:22:52 -0300 (0:00:00.087)       0:00:00.087 **** 
2026-11-04T13:23:19.8933263Z 
2026-11-04T13:23:19.8936881Z TASK [Gathering Facts] *********************************************************
2026-11-04T13:23:19.8937089Z ok: [127.0.0.1]
2026-11-04T13:23:19.9256865Z Wednesday 04 November 2026  10:23:19 -0300 (0:00:27.229)       0:00:27.317 **** 
2026-11-04T13:23:20.0093363Z Wednesday 04 November 2026  10:23:20 -0300 (0:00:00.083)       0:00:27.400 **** 
2026-11-04T13:23:20.0869656Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r18163/a
2026-11-04T13:23:20.0870255Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-11-04T13:23:20.0870977Z duplicate dict key (include_tasks). Using last defined value only.
2026-11-04T13:23:20.0983936Z included: /opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-11-04T13:23:20.1247226Z Wednesday 04 November 2026  10:23:20 -0300 (0:00:00.115)       0:00:27.516 **** 
2026-11-04T13:23:20.2003984Z 
2026-11-04T13:23:20.2004717Z TASK [vm : Cria variável build_repository_name] ********************************
2026-11-04T13:23:20.2004878Z ok: [127.0.0.1]
2026-11-04T13:23:20.2240363Z Wednesday 04 November 2026  10:23:20 -0300 (0:00:00.099)       0:00:27.615 **** 
2026-11-04T13:23:21.0706103Z 
2026-11-04T13:23:21.0707023Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-11-04T13:23:21.0707249Z ok: [127.0.0.1]
2026-11-04T13:23:21.0946444Z Wednesday 04 November 2026  10:23:21 -0300 (0:00:00.870)       0:00:28.485 **** 
2026-11-04T13:23:22.7895471Z 
2026-11-04T13:23:22.7896724Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-11-04T13:23:22.7897100Z changed: [127.0.0.1]
2026-11-04T13:23:22.8121556Z Wednesday 04 November 2026  10:23:22 -0300 (0:00:01.717)       0:00:30.203 **** 
2026-11-04T13:23:22.8802712Z 
2026-11-04T13:23:22.8803260Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-11-04T13:23:22.8803432Z ok: [127.0.0.1] => {
2026-11-04T13:23:22.8803549Z     "msg": [
2026-11-04T13:23:22.8803681Z         "Iniciando registro do template VMTX...", 
2026-11-04T13:23:22.8803812Z         "vCenter: 10.122.144.195", 
2026-11-04T13:23:22.8804146Z         "Template: eap74-openjdk8-apache24-rhel93-v015", 
2026-11-04T13:23:22.8808869Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] eap74-openjdk8-apache24-rhel93-v015/eap74-openjdk8-apache24-rhel93-v015.vmtx", 
2026-11-04T13:23:22.8809369Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-11-04T13:23:22.8809646Z         "Template 'eap74-openjdk8-apache24-rhel93-v015' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-11-04T13:23:22.8809826Z         "Operacao concluida com sucesso."
2026-11-04T13:23:22.8809939Z     ]
2026-11-04T13:23:22.8810107Z }
2026-11-04T13:23:22.9027186Z Wednesday 04 November 2026  10:23:22 -0300 (0:00:00.090)       0:00:30.294 **** 
2026-11-04T13:23:22.9728856Z 
2026-11-04T13:23:22.9729608Z TASK [vm : Cria variável ansible] **********************************************
2026-11-04T13:23:22.9729771Z ok: [127.0.0.1]
2026-11-04T13:23:22.9958527Z Wednesday 04 November 2026  10:23:22 -0300 (0:00:00.093)       0:00:30.387 **** 
2026-11-04T13:23:23.4765371Z 
2026-11-04T13:23:23.4766084Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-11-04T13:23:23.4766994Z ok: [127.0.0.1]
2026-11-04T13:23:23.5012457Z Wednesday 04 November 2026  10:23:23 -0300 (0:00:00.505)       0:00:30.892 **** 
2026-11-04T13:23:23.8035425Z 
2026-11-04T13:23:23.8036491Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-11-04T13:23:23.8036665Z ok: [127.0.0.1]
2026-11-04T13:23:23.8266294Z Wednesday 04 November 2026  10:23:23 -0300 (0:00:00.325)       0:00:31.217 **** 
2026-11-04T13:23:23.8953588Z Wednesday 04 November 2026  10:23:23 -0300 (0:00:00.068)       0:00:31.286 **** 
2026-11-04T13:23:23.9800727Z Wednesday 04 November 2026  10:23:23 -0300 (0:00:00.084)       0:00:31.371 **** 
2026-11-04T13:23:24.0246895Z 
2026-11-04T13:23:24.0247437Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-11-04T13:23:24.0247593Z ok: [127.0.0.1]
2026-11-04T13:23:24.0468570Z Wednesday 04 November 2026  10:23:24 -0300 (0:00:00.066)       0:00:31.438 **** 
2026-11-04T13:23:24.1208435Z included: /opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-11-04T13:23:24.1492614Z Wednesday 04 November 2026  10:23:24 -0300 (0:00:00.102)       0:00:31.540 **** 
2026-11-04T13:23:24.2094740Z included: /opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-11-04T13:23:24.2390262Z Wednesday 04 November 2026  10:23:24 -0300 (0:00:00.089)       0:00:31.630 **** 
2026-11-04T13:23:24.8894230Z 
2026-11-04T13:23:24.8895278Z TASK [vm : Consultar API] ******************************************************
2026-11-04T13:23:24.8895559Z ok: [127.0.0.1]
2026-11-04T13:23:24.9144910Z Wednesday 04 November 2026  10:23:24 -0300 (0:00:00.675)       0:00:32.305 **** 
2026-11-04T13:23:24.9570450Z 
2026-11-04T13:23:24.9571002Z TASK [vm : Parse JSON] *********************************************************
2026-11-04T13:23:24.9571160Z ok: [127.0.0.1]
2026-11-04T13:23:24.9810502Z Wednesday 04 November 2026  10:23:24 -0300 (0:00:00.066)       0:00:32.372 **** 
2026-11-04T13:23:25.0467775Z included: /opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-11-04T13:23:25.0778193Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.096)       0:00:32.469 **** 
2026-11-04T13:23:25.4738937Z 
2026-11-04T13:23:25.4739497Z TASK [vm : Consultar API] ******************************************************
2026-11-04T13:23:25.4739658Z ok: [127.0.0.1]
2026-11-04T13:23:25.4993297Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.421)       0:00:32.890 **** 
2026-11-04T13:23:25.5452338Z 
2026-11-04T13:23:25.5452972Z TASK [vm : Parse JSON] *********************************************************
2026-11-04T13:23:25.5453199Z ok: [127.0.0.1]
2026-11-04T13:23:25.5677724Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.068)       0:00:32.959 **** 
2026-11-04T13:23:25.6303318Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.062)       0:00:33.021 **** 
2026-11-04T13:23:25.6772678Z 
2026-11-04T13:23:25.6773541Z TASK [vm : Exibir size servidores.] ********************************************
2026-11-04T13:23:25.6776184Z ok: [127.0.0.1] => {
2026-11-04T13:23:25.6776777Z     "api_data.dados.0": {
2026-11-04T13:23:25.6777296Z         "ambiente": "tqs", 
2026-11-04T13:23:25.6777474Z         "cluster": "CTC_NPRDXF2488HV7_NPRD", 
2026-11-04T13:23:25.6777607Z         "cluster_principal": "", 
2026-11-04T13:23:25.6777754Z         "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD", 
2026-11-04T13:23:25.6778127Z         "cpu": 2, 
2026-11-04T13:23:25.6778243Z         "datacenter": "NPRD", 
2026-11-04T13:23:25.6778370Z         "datastore": "CTCHWNPRDPC03_0047", 
2026-11-04T13:23:25.6779070Z         "detalhe_imagem": "{\"jbcs_httpd\":\"apache-2.4.57-SP6-RHEL8-terraform\",\"jboss\":\"jboss-eap-7.4.18-terraform\",\"java\":\"java-1.8\",\"htop\":\"htop-3.3.0-1.el9.x86_64\",\"filebeat\":\"filebeat-7.7.0-x86_64\",\"jmx_exporter\":\"jmx_exporter-terraform\",\"apache_exporter\":\"apache_exporter-terraform\",\"node_exporter\":\"node_exporter-1.3.1.linux-amd64.tar\",\"jboss_db2_module\":\"db2jcc4_module\"}", 
2026-11-04T13:23:25.6781992Z         "disco_log": 2, 
2026-11-04T13:23:25.6782177Z         "disco_opt": 10, 
2026-11-04T13:23:25.6782315Z         "domain": "agil.nprd.caixa.gov.br", 
2026-11-04T13:23:25.6782650Z         "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0", 
2026-11-04T13:23:25.6782867Z         "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep", 
2026-11-04T13:23:25.6783101Z         "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep", 
2026-11-04T13:23:25.6783257Z         "esx_vcenter_server": "10.122.144.195", 
2026-11-04T13:23:25.6783384Z         "farm": null, 
2026-11-04T13:23:25.6783494Z         "id": 61729, 
2026-11-04T13:23:25.6783690Z         "inclusao": "2026-09-30 09:16:41", 
2026-11-04T13:23:25.6783825Z         "info_framework": null, 
2026-11-04T13:23:25.6783943Z         "info_linguagem": null, 
2026-11-04T13:23:25.6784061Z         "info_tecnologia": null, 
2026-11-04T13:23:25.6784177Z         "info_versao": null, 
2026-11-04T13:23:25.6784298Z         "ipbackup": "192.168.243.37", 
2026-11-04T13:23:25.6784426Z         "jboss_apache_status": "ativado", 
2026-11-04T13:23:25.6784546Z         "memoria": 4, 
2026-11-04T13:23:25.6784664Z         "net_adapter_type": "vmxnet3", 
2026-11-04T13:23:25.6784857Z         "nome_imagem": "eap74-openjdk8-apache24-rhel93-v015", 
2026-11-04T13:23:25.6785269Z         "objeto_origem": "SIGPF-VENDAS_TQS_SERVIDOR", 
2026-11-04T13:23:25.6785409Z         "plataforma": "vm", 
2026-11-04T13:23:25.6785520Z         "produto": "jboss", 
2026-11-04T13:23:25.6785659Z         "recursos_max_id": null, 
2026-11-04T13:23:25.6785815Z         "servidores_json": [
2026-11-04T13:23:25.6785920Z             {
2026-11-04T13:23:25.6786028Z                 "ip": "10.116.202.20", 
2026-11-04T13:23:25.6786151Z                 "jboss_apache_status": "ativado", 
2026-11-04T13:23:25.6786289Z                 "nome": "caddeapllx2818.agil.nprd.caixa.gov.br"
2026-11-04T13:23:25.6786409Z             }
2026-11-04T13:23:25.6786673Z         ], 
2026-11-04T13:23:25.6786830Z         "sistema": "sigpf-vendas", 
2026-11-04T13:23:25.6786956Z         "site": "ctc_nprd", 
2026-11-04T13:23:25.6787074Z         "solicitacoes_id": null, 
2026-11-04T13:23:25.6787194Z         "status": "ativado", 
2026-11-04T13:23:25.6787307Z         "terraform": true, 
2026-11-04T13:23:25.6787422Z         "versao_imagem": "015", 
2026-11-04T13:23:25.6787553Z         "versao_plataforma": "7.1", 
2026-11-04T13:23:25.6787672Z         "vm_dns": [
2026-11-04T13:23:25.6787780Z             "10.116.193.77", 
2026-11-04T13:23:25.6787888Z             "10.116.193.78"
2026-11-04T13:23:25.6787991Z         ], 
2026-11-04T13:23:25.6788096Z         "vm_ipnetmask": 19, 
2026-11-04T13:23:25.6788208Z         "vm_ipnetmask_bck": 19, 
2026-11-04T13:23:25.6788326Z         "vm_ipnetmask_bck_01": 16, 
2026-11-04T13:23:25.6788444Z         "vsphere_folder": "/vm", 
2026-11-04T13:23:25.6788570Z         "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-11-04T13:23:25.6788682Z     }
2026-11-04T13:23:25.6788773Z }
2026-11-04T13:23:25.7001401Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.069)       0:00:33.091 **** 
2026-11-04T13:23:25.7632516Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.062)       0:00:33.154 **** 
2026-11-04T13:23:25.8098372Z 
2026-11-04T13:23:25.8098917Z TASK [vm : Set size] ***********************************************************
2026-11-04T13:23:25.8099075Z ok: [127.0.0.1]
2026-11-04T13:23:25.8333354Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.070)       0:00:33.224 **** 
2026-11-04T13:23:25.8771309Z 
2026-11-04T13:23:25.8772209Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-11-04T13:23:25.8772447Z ok: [127.0.0.1]
2026-11-04T13:23:25.9002771Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.066)       0:00:33.291 **** 
2026-11-04T13:23:25.9431049Z 
2026-11-04T13:23:25.9431983Z TASK [vm : debug] **************************************************************
2026-11-04T13:23:25.9432371Z ok: [127.0.0.1] => {
2026-11-04T13:23:25.9432719Z     "template_name": "eap74-openjdk8-apache24-rhel93-v015"
2026-11-04T13:23:25.9432886Z }
2026-11-04T13:23:25.9658692Z Wednesday 04 November 2026  10:23:25 -0300 (0:00:00.065)       0:00:33.357 **** 
2026-11-04T13:23:26.0089568Z 
2026-11-04T13:23:26.0090410Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-11-04T13:23:26.0090593Z ok: [127.0.0.1]
2026-11-04T13:23:26.0350330Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.069)       0:00:33.426 **** 
2026-11-04T13:23:26.0985369Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.063)       0:00:33.489 **** 
2026-11-04T13:23:26.5276808Z 
2026-11-04T13:23:26.5277321Z TASK [vm : Run Invetory All] ***************************************************
2026-11-04T13:23:26.5277489Z changed: [127.0.0.1]
2026-11-04T13:23:26.5527904Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.454)       0:00:33.944 **** 
2026-11-04T13:23:26.5982696Z 
2026-11-04T13:23:26.5983214Z TASK [vm : Parse JSON output] **************************************************
2026-11-04T13:23:26.5983376Z ok: [127.0.0.1]
2026-11-04T13:23:26.6216520Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.068)       0:00:34.013 **** 
2026-11-04T13:23:26.6696210Z 
2026-11-04T13:23:26.6697212Z TASK [vm : Count the number of hosts] ******************************************
2026-11-04T13:23:26.6697435Z ok: [127.0.0.1]
2026-11-04T13:23:26.6921532Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.070)       0:00:34.083 **** 
2026-11-04T13:23:26.7632590Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.071)       0:00:34.154 **** 
2026-11-04T13:23:26.8285562Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.065)       0:00:34.219 **** 
2026-11-04T13:23:26.8712390Z 
2026-11-04T13:23:26.8712917Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-11-04T13:23:26.8713135Z ok: [127.0.0.1] => {
2026-11-04T13:23:26.8713249Z     "msg": [
2026-11-04T13:23:26.8713405Z         "num_hosts: 1"
2026-11-04T13:23:26.8713576Z     ]
2026-11-04T13:23:26.8713735Z }
2026-11-04T13:23:26.8940281Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.065)       0:00:34.285 **** 
2026-11-04T13:23:26.9581781Z Wednesday 04 November 2026  10:23:26 -0300 (0:00:00.064)       0:00:34.349 **** 
2026-11-04T13:23:27.0263789Z Wednesday 04 November 2026  10:23:27 -0300 (0:00:00.068)       0:00:34.417 **** 
2026-11-04T13:23:27.0884926Z included: /opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-11-04T13:23:27.1231188Z Wednesday 04 November 2026  10:23:27 -0300 (0:00:00.096)       0:00:34.514 **** 
2026-11-04T13:23:27.1855392Z included: /opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-11-04T13:23:27.2121341Z Wednesday 04 November 2026  10:23:27 -0300 (0:00:00.088)       0:00:34.603 **** 
2026-11-04T13:23:27.2985852Z 
2026-11-04T13:23:27.2986623Z TASK [vm : Criar variáveis] ****************************************************
2026-11-04T13:23:27.2986789Z ok: [127.0.0.1]
2026-11-04T13:23:27.3420804Z Wednesday 04 November 2026  10:23:27 -0300 (0:00:00.129)       0:00:34.733 **** 
2026-11-04T13:23:27.6266663Z 
2026-11-04T13:23:27.6267453Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-11-04T13:23:27.6267679Z ok: [127.0.0.1]
2026-11-04T13:23:27.6529916Z Wednesday 04 November 2026  10:23:27 -0300 (0:00:00.310)       0:00:35.044 **** 
2026-11-04T13:23:27.6961166Z 
2026-11-04T13:23:27.6961972Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-11-04T13:23:27.6962971Z ok: [127.0.0.1] => {
2026-11-04T13:23:27.6963617Z     "nfs_vars_json": {
2026-11-04T13:23:27.6963789Z         "changed": false, 
2026-11-04T13:23:27.6964137Z         "cmd": "cat /opt/ads-agent/_work/r18163/a/nfs_config.json", 
2026-11-04T13:23:27.6964359Z         "delta": "0:00:00.003722", 
2026-11-04T13:23:27.6964638Z         "end": "2026-11-04 10:23:27.611648", 
2026-11-04T13:23:27.6964769Z         "failed": false, 
2026-11-04T13:23:27.6964878Z         "rc": 0, 
2026-11-04T13:23:27.6965150Z         "start": "2026-11-04 10:23:27.607926", 
2026-11-04T13:23:27.6965311Z         "stderr": "", 
2026-11-04T13:23:27.6965420Z         "stderr_lines": [], 
2026-11-04T13:23:27.6965605Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sigpf\"}]", 
2026-11-04T13:23:27.6965798Z         "stdout_lines": [
2026-11-04T13:23:27.6965973Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sigpf\"}]"
2026-11-04T13:23:27.6966137Z         ]
2026-11-04T13:23:27.6966234Z     }
2026-11-04T13:23:27.6966329Z }
2026-11-04T13:23:27.7194472Z Wednesday 04 November 2026  10:23:27 -0300 (0:00:00.066)       0:00:35.110 **** 
2026-11-04T13:23:27.7659474Z 
2026-11-04T13:23:27.7660401Z TASK [vm : Criar variáveis] ****************************************************
2026-11-04T13:23:27.7660627Z ok: [127.0.0.1]
2026-11-04T13:23:27.7887486Z Wednesday 04 November 2026  10:23:27 -0300 (0:00:00.069)       0:00:35.180 **** 
2026-11-04T13:23:28.3913105Z 
2026-11-04T13:23:28.3913630Z TASK [vm : execute create_ip_bck script] ***************************************
2026-11-04T13:23:28.3913799Z changed: [127.0.0.1]
2026-11-04T13:23:28.4166025Z Wednesday 04 November 2026  10:23:28 -0300 (0:00:00.627)       0:00:35.807 **** 
2026-11-04T13:23:28.4622199Z 
2026-11-04T13:23:28.4622820Z TASK [vm : ansible.builtin.debug] **********************************************
2026-11-04T13:23:28.4625845Z ok: [127.0.0.1] => {
2026-11-04T13:23:28.4626407Z     "changed": false, 
2026-11-04T13:23:28.4626575Z     "msg": {
2026-11-04T13:23:28.4626696Z         "changed": true, 
2026-11-04T13:23:28.4626810Z         "cmd": [
2026-11-04T13:23:28.4626937Z             "python", 
2026-11-04T13:23:28.4627283Z             "/opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-11-04T13:23:28.4627438Z             "create_ip_bck", 
2026-11-04T13:23:28.4627616Z             "sigpf-vendas", 
2026-11-04T13:23:28.4627730Z             "tqs", 
2026-11-04T13:23:28.4627955Z             "ctc_nprd", 
2026-11-04T13:23:28.4628167Z             "/opt/ads-agent/_work/r18163/a/esteira-jboss-vm-v2", 
2026-11-04T13:23:28.4628301Z             "C&t@d02", 
2026-11-04T13:23:28.4628490Z             "***", 
2026-11-04T13:23:28.4628616Z             "s736651@corp.caixa.gov.br", 
2026-11-04T13:23:28.4628740Z             "***", 
2026-11-04T13:23:28.4628914Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sigpf\"}]"
2026-11-04T13:23:28.4629083Z         ], 
2026-11-04T13:23:28.4629223Z         "delta": "0:00:00.306587", 
2026-11-04T13:23:28.4629407Z         "end": "2026-11-04 10:23:28.374851", 
2026-11-04T13:23:28.4629539Z         "failed": false, 
2026-11-04T13:23:28.4629652Z         "rc": 0, 
2026-11-04T13:23:28.4629834Z         "start": "2026-11-04 10:23:28.068264", 
2026-11-04T13:23:28.4630226Z         "stderr": "", 
2026-11-04T13:23:28.4630339Z         "stderr_lines": [], 
2026-11-04T13:23:28.4633754Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/apl/sigpf', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nNFS ENDPOINT: {u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON': u'/apl/sigpf'}\nVariaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET'), (u'NFS_MOUNT_POINT_ISILON', u'/apl/sigpf'))]\nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET/apl/sigpfISILONnfsctcnprd.ctc.caixatqs\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-09-30 09:16:41', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': u'015', u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 61729, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'jboss_apache_status': u'ativado', u'ip': u'10.116.202.20', u'nome': u'caddeapllx2818.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': u'eap74-openjdk8-apache24-rhel93-v015', u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIGPF-VENDAS_TQS_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': 16, u'sistema': u'sigpf-vendas', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'tqs', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.243.37', u'plataforma': u'vm', u'detalhe_imagem': u'{\"jbcs_httpd\":\"apache-2.4.57-SP6-RHEL8-terraform\",\"jboss\":\"jboss-eap-7.4.18-terraform\",\"java\":\"java-1.8\",\"htop\":\"htop-3.3.0-1.el9.x86_64\",\"filebeat\":\"filebeat-7.7.0-x86_64\",\"jmx_exporter\":\"jmx_exporter-terraform\",\"apache_exporter\":\"apache_exporter-terraform\",\"node_exporter\":\"node_exporter-1.3.1.linux-amd64.tar\",\"jboss_db2_module\":\"db2jcc4_module\"}', u'cpu': 2}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET /apl/sigpf                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-11-04T13:23:28.4635709Z         "stdout_lines": [
2026-11-04T13:23:28.4636004Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/apl/sigpf', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET'}]", 
2026-11-04T13:23:28.4636203Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-11-04T13:23:28.4636583Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-11-04T13:23:28.4637026Z             "NFS ENDPOINT: {u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON': u'/apl/sigpf'}", 
2026-11-04T13:23:28.4637417Z             "Variaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET'), (u'NFS_MOUNT_POINT_ISILON', u'/apl/sigpf'))]", 
2026-11-04T13:23:28.4637756Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET/apl/sigpfISILONnfsctcnprd.ctc.caixatqs", 
2026-11-04T13:23:28.4640041Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-09-30 09:16:41', u'disco_opt': 10, u'domain': u'agil.nprd.caixa.gov.br', u'vsphere_pool': u'/Resources/RP_TERRAFORM_NPRD', u'versao_imagem': u'015', u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': u'CTCHWNPRDPC03_0047', u'info_framework': None, u'id': 61729, u'esx_network_bck': u'tn-NPRD|NPRD_BKP-ap|VL3697-ep', u'esx_network': u'tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0', u'esx_vcenter_server': u'10.122.144.195', u'servidores_json': [{u'jboss_apache_status': u'ativado', u'ip': u'10.116.202.20', u'nome': u'caddeapllx2818.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': 19, u'produto': u'jboss', u'vm_dns': [u'10.116.193.77', u'10.116.193.78'], u'jboss_apache_status': u'ativado', u'nome_imagem': u'eap74-openjdk8-apache24-rhel93-v015', u'cluster_principal': u'', u'esx_network_bck_01': u'tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep', u'vm_ipnetmask_bck': 19, u'objeto_origem': u'SIGPF-VENDAS_TQS_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': 16, u'sistema': u'sigpf-vendas', u'net_adapter_type': u'vmxnet3', u'cluster_terraform': u'CTC_NPRDXF2488HV7_NPRD', u'ambiente': u'tqs', u'datacenter': u'NPRD', u'vsphere_folder': u'/vm', u'info_tecnologia': None, u'cluster': u'CTC_NPRDXF2488HV7_NPRD', u'disco_log': 2, u'ipbackup': u'192.168.243.37', u'plataforma': u'vm', u'detalhe_imagem': u'{\"jbcs_httpd\":\"apache-2.4.57-SP6-RHEL8-terraform\",\"jboss\":\"jboss-eap-7.4.18-terraform\",\"java\":\"java-1.8\",\"htop\":\"htop-3.3.0-1.el9.x86_64\",\"filebeat\":\"filebeat-7.7.0-x86_64\",\"jmx_exporter\":\"jmx_exporter-terraform\",\"apache_exporter\":\"apache_exporter-terraform\",\"node_exporter\":\"node_exporter-1.3.1.linux-amd64.tar\",\"jboss_db2_module\":\"db2jcc4_module\"}', u'cpu': 2}]", 
2026-11-04T13:23:28.4641271Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SIGPF_INTERNET /apl/sigpf                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-11-04T13:23:28.4641519Z         ]
2026-11-04T13:23:28.4641625Z     }
2026-11-04T13:23:28.4641721Z }
2026-11-04T13:23:28.4881126Z Wednesday 04 November 2026  10:23:28 -0300 (0:00:00.071)       0:00:35.879 **** 
2026-11-04T13:23:28.9112853Z 
2026-11-04T13:23:28.9113363Z TASK [vm : Run Invetory All] ***************************************************
2026-11-04T13:23:28.9113520Z changed: [127.0.0.1]
2026-11-04T13:23:28.9360408Z Wednesday 04 November 2026  10:23:28 -0300 (0:00:00.447)       0:00:36.327 **** 
2026-11-04T13:23:28.9800068Z 
2026-11-04T13:23:28.9800583Z TASK [vm : Parse JSON output] **************************************************
2026-11-04T13:23:28.9800753Z ok: [127.0.0.1]
2026-11-04T13:23:29.0037216Z Wednesday 04 November 2026  10:23:29 -0300 (0:00:00.067)       0:00:36.395 **** 
2026-11-04T13:23:29.0476587Z 
2026-11-04T13:23:29.0477568Z TASK [vm : Debug parsed_output] ************************************************
2026-11-04T13:23:29.0482698Z ok: [127.0.0.1] => {
2026-11-04T13:23:29.0483225Z     "msg": [
2026-11-04T13:23:29.0483586Z         {
2026-11-04T13:23:29.0483783Z             "_meta": {
2026-11-04T13:23:29.0483908Z                 "hostvars": {
2026-11-04T13:23:29.0484097Z                     "caddeapllx2818.agil.nprd.caixa.gov.br": {
2026-11-04T13:23:29.0484934Z                         "ambiente": "tqs", 
2026-11-04T13:23:29.0485212Z                         "ansible_host": "10.116.202.20", 
2026-11-04T13:23:29.0485355Z                         "cluster": "CTC_NPRDXF2488HV7_NPRD", 
2026-11-04T13:23:29.0485486Z                         "cluster_principal": "", 
2026-11-04T13:23:29.0485696Z                         "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD", 
2026-11-04T13:23:29.0485826Z                         "cpu": 2, 
2026-11-04T13:23:29.0485945Z                         "datacenter": "NPRD", 
2026-11-04T13:23:29.0486078Z                         "datastore": "CTCHWNPRDPC03_0047", 
2026-11-04T13:23:29.0486739Z                         "detalhe_imagem": "{\"jbcs_httpd\":\"apache-2.4.57-SP6-RHEL8-terraform\",\"jboss\":\"jboss-eap-7.4.18-terraform\",\"java\":\"java-1.8\",\"htop\":\"htop-3.3.0-1.el9.x86_64\",\"filebeat\":\"filebeat-7.7.0-x86_64\",\"jmx_exporter\":\"jmx_exporter-terraform\",\"apache_exporter\":\"apache_exporter-terraform\",\"node_exporter\":\"node_exporter-1.3.1.linux-amd64.tar\",\"jboss_db2_module\":\"db2jcc4_module\"}", 
2026-11-04T13:23:29.0487133Z                         "disco_log": 2, 
2026-11-04T13:23:29.0487253Z                         "disco_opt": 10, 
2026-11-04T13:23:29.0487380Z                         "domain": "agil.nprd.caixa.gov.br", 
2026-11-04T13:23:29.0487615Z                         "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0", 
2026-11-04T13:23:29.0487837Z                         "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep", 
2026-11-04T13:23:29.0488224Z                         "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep", 
2026-11-04T13:23:29.0488456Z                         "esx_vcenter_server": "10.122.144.195", 
2026-11-04T13:23:29.0488614Z                         "farm": null, 
2026-11-04T13:23:29.0488727Z                         "id": 61729, 
2026-11-04T13:23:29.0488933Z                         "inclusao": "2026-09-30 09:16:41", 
2026-11-04T13:23:29.0489112Z                         "info_framework": null, 
2026-11-04T13:23:29.0489281Z                         "info_linguagem": null, 
2026-11-04T13:23:29.0489404Z                         "info_tecnologia": null, 
2026-11-04T13:23:29.0489523Z                         "info_versao": null, 
2026-11-04T13:23:29.0489650Z                         "ipbackup": "192.168.243.37", 
2026-11-04T13:23:29.0489783Z                         "jboss_apache_status": "ativado", 
2026-11-04T13:23:29.0489906Z                         "memoria": 4, 
2026-11-04T13:23:29.0490027Z                         "net_adapter_type": "vmxnet3", 
2026-11-04T13:23:29.0490239Z                         "nome_imagem": "eap74-openjdk8-apache24-rhel93-v015", 
2026-11-04T13:23:29.0490444Z                         "objeto_origem": "SIGPF-VENDAS_TQS_SERVIDOR", 
2026-11-04T13:23:29.0490574Z                         "plataforma": "vm", 
2026-11-04T13:23:29.0490693Z                         "produto": "jboss", 
2026-11-04T13:23:29.0490812Z                         "recursos_max_id": null, 
2026-11-04T13:23:29.0490989Z                         "sistema": "sigpf-vendas", 
2026-11-04T13:23:29.0491126Z                         "site": "ctc_nprd", 
2026-11-04T13:23:29.0491303Z                         "solicitacoes_id": null, 
2026-11-04T13:23:29.0491440Z                         "status": "ativado", 
2026-11-04T13:23:29.0491555Z                         "terraform": true, 
2026-11-04T13:23:29.0491673Z                         "versao_imagem": "015", 
2026-11-04T13:23:29.0491793Z                         "versao_plataforma": "7.1", 
2026-11-04T13:23:29.0491914Z                         "vm_dns": [
2026-11-04T13:23:29.0492105Z                             "10.116.193.77", 
2026-11-04T13:23:29.0492233Z                             "10.116.193.78"
2026-11-04T13:23:29.0492342Z                         ], 
2026-11-04T13:23:29.0492452Z                         "vm_ipnetmask": 19, 
2026-11-04T13:23:29.0492569Z                         "vm_ipnetmask_bck": 19, 
2026-11-04T13:23:29.0492748Z                         "vm_ipnetmask_bck_01": 16, 
2026-11-04T13:23:29.0492997Z                         "vsphere_folder": "/vm", 
2026-11-04T13:23:29.0493129Z                         "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-11-04T13:23:29.0493249Z                     }
2026-11-04T13:23:29.0493349Z                 }
2026-11-04T13:23:29.0493492Z             }, 
2026-11-04T13:23:29.0493597Z             "ctc_nprd": {
2026-11-04T13:23:29.0493712Z                 "children": [
2026-11-04T13:23:29.0493820Z                     "jboss"
2026-11-04T13:23:29.0493921Z                 ], 
2026-11-04T13:23:29.0494024Z                 "vars": {}
2026-11-04T13:23:29.0494124Z             }, 
2026-11-04T13:23:29.0494228Z             "jboss": {
2026-11-04T13:23:29.0494335Z                 "hosts": [
2026-11-04T13:23:29.0494483Z                     "caddeapllx2818.agil.nprd.caixa.gov.br"
2026-11-04T13:23:29.0494658Z                 ], 
2026-11-04T13:23:29.0494763Z                 "vars": {}
2026-11-04T13:23:29.0494863Z             }, 
2026-11-04T13:23:29.0495090Z             "local": {
2026-11-04T13:23:29.0495204Z                 "hosts": [
2026-11-04T13:23:29.0495309Z                     "127.0.0.1"
2026-11-04T13:23:29.0495411Z                 ], 
2026-11-04T13:23:29.0495517Z                 "vars": {
2026-11-04T13:23:29.0495630Z                     "ansible_connection": "local"
2026-11-04T13:23:29.0495744Z                 }
2026-11-04T13:23:29.0495841Z             }, 
2026-11-04T13:23:29.0495941Z             "tqs": {
2026-11-04T13:23:29.0496049Z                 "children": [
2026-11-04T13:23:29.0496157Z                     "local", 
2026-11-04T13:23:29.0496264Z                     "ctc_nprd"
2026-11-04T13:23:29.0496367Z                 ], 
2026-11-04T13:23:29.0496469Z                 "vars": {}
2026-11-04T13:23:29.0496567Z             }
2026-11-04T13:23:29.0496661Z         }
2026-11-04T13:23:29.0496757Z     ]
2026-11-04T13:23:29.0496888Z }
2026-11-04T13:23:29.0714435Z Wednesday 04 November 2026  10:23:29 -0300 (0:00:00.067)       0:00:36.462 **** 
2026-11-04T13:23:29.1198797Z 
2026-11-04T13:23:29.1199555Z TASK [vm : Verificando os ambientes] *******************************************
2026-11-04T13:23:29.1199879Z ok: [127.0.0.1] => {
2026-11-04T13:23:29.1200521Z     "msg": [
2026-11-04T13:23:29.1200877Z         "Ambiente existentes! Servidores: caddeapllx2818.agil.nprd.caixa.gov.br"
2026-11-04T13:23:29.1201052Z     ]
2026-11-04T13:23:29.1201154Z }
2026-11-04T13:23:29.1428816Z Wednesday 04 November 2026  10:23:29 -0300 (0:00:00.071)       0:00:36.534 **** 
2026-11-04T13:23:29.2159502Z 
2026-11-04T13:23:29.2160040Z TASK [vm : Recuperar ip] *******************************************************
2026-11-04T13:23:29.2163079Z ok: [127.0.0.1] => (item=caddeapllx2818.agil.nprd.caixa.gov.br)
2026-11-04T13:23:29.2390054Z Wednesday 04 November 2026  10:23:29 -0300 (0:00:00.096)       0:00:36.630 **** 
2026-11-04T13:23:29.3146948Z Wednesday 04 November 2026  10:23:29 -0300 (0:00:00.075)       0:00:36.705 **** 
2026-11-04T13:23:29.3622859Z 
2026-11-04T13:23:29.3623850Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-11-04T13:23:29.3624326Z ok: [127.0.0.1] => {
2026-11-04T13:23:29.3624797Z     "msg": [
2026-11-04T13:23:29.3625292Z         "Servidores: \\\"caddeapllx2818.agil.nprd.caixa.gov.br\\\"", 
2026-11-04T13:23:29.3625457Z         "IPs: \\\"10.116.202.20\\\"", 
2026-11-04T13:23:29.3625629Z         "Gateways: \\\"10.116.192.1\\\"", 
2026-11-04T13:23:29.3625761Z         "IPs Backup: \\\"192.168.243.37\\\"", 
2026-11-04T13:23:29.3625953Z         "Servidores (OBJ): \\\"caddeapllx2818.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.202.20\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.243.37\\\"}"
2026-11-04T13:23:29.3626126Z     ]
2026-11-04T13:23:29.3626220Z }
2026-11-04T13:23:29.3857934Z Wednesday 04 November 2026  10:23:29 -0300 (0:00:00.071)       0:00:36.777 **** 
2026-11-04T13:23:30.2544039Z 
2026-11-04T13:23:30.2545224Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-11-04T13:23:30.2545741Z changed: [127.0.0.1]
2026-11-04T13:23:30.2590303Z 
2026-11-04T13:23:30.2590658Z PLAY [Configurando o DNS] ******************************************************
2026-11-04T13:23:30.4721084Z Wednesday 04 November 2026  10:23:30 -0300 (0:00:01.086)       0:00:37.863 **** 
2026-11-04T13:23:30.6197981Z 
2026-11-04T13:23:30.6198963Z TASK [Consultar DNS] ***********************************************************
2026-11-04T13:23:30.6199285Z changed: [10.116.193.77] => (item=caddeapllx2818.agil.nprd.caixa.gov.br)
2026-11-04T13:23:30.6240371Z Wednesday 04 November 2026  10:23:30 -0300 (0:00:00.152)       0:00:38.015 **** 
2026-11-04T13:23:30.6888635Z 
2026-11-04T13:23:30.6889498Z TASK [Verificar se o domínio resolve para um IP] *******************************
2026-11-04T13:23:30.6890478Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-11-04 10:23:30.605657', u'stdout': u'10.116.202.20', u'item': u'caddeapllx2818.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2818.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.010033', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2818.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.202.20'], u'start': u'2026-11-04 10:23:30.595624'}) => {
2026-11-04T13:23:30.6891420Z     "msg": "O domínio caddeapllx2818.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.202.20']"
2026-11-04T13:23:30.6891651Z }
2026-11-04T13:23:30.6933549Z Wednesday 04 November 2026  10:23:30 -0300 (0:00:00.069)       0:00:38.084 **** 
2026-11-04T13:23:30.7417937Z Wednesday 04 November 2026  10:23:30 -0300 (0:00:00.048)       0:00:38.133 **** 
2026-11-04T13:23:30.7906654Z Wednesday 04 November 2026  10:23:30 -0300 (0:00:00.048)       0:00:38.181 **** 
2026-11-04T13:23:30.8563712Z 
2026-11-04T13:23:30.8564364Z TASK [Set created DNS] *********************************************************
2026-11-04T13:23:30.8566364Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-11-04 10:23:30.605657', u'stdout': u'10.116.202.20', u'item': u'caddeapllx2818.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2818.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.010033', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2818.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.202.20'], u'start': u'2026-11-04 10:23:30.595624'})
2026-11-04T13:23:30.8604373Z Wednesday 04 November 2026  10:23:30 -0300 (0:00:00.070)       0:00:38.251 **** 
2026-11-04T13:23:30.9225109Z 
2026-11-04T13:23:30.9225707Z PLAY [local] *******************************************************************
2026-11-04T13:23:30.9258500Z 
2026-11-04T13:23:30.9259446Z PLAY [Verificando serviços] ****************************************************
2026-11-04T13:23:30.9345960Z 
2026-11-04T13:23:30.9347124Z PLAY [Configuração LDAP] *******************************************************
2026-11-04T13:23:30.9376735Z [WARNING]: Found variable using reserved name: when
2026-11-04T13:23:30.9380924Z 
2026-11-04T13:23:30.9381547Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9471061Z 
2026-11-04T13:23:30.9472032Z PLAY [Stack Jboss] *************************************************************
2026-11-04T13:23:30.9500653Z 
2026-11-04T13:23:30.9501027Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9541666Z 
2026-11-04T13:23:30.9542304Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9581576Z 
2026-11-04T13:23:30.9581901Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9612475Z 
2026-11-04T13:23:30.9613717Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-04T13:23:30.9641319Z 
2026-11-04T13:23:30.9641655Z PLAY [Copiando modules adicionais] *********************************************
2026-11-04T13:23:30.9665639Z 
2026-11-04T13:23:30.9666068Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9711993Z 
2026-11-04T13:23:30.9712538Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9739404Z 
2026-11-04T13:23:30.9739804Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9773634Z 
2026-11-04T13:23:30.9774204Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9800776Z 
2026-11-04T13:23:30.9801067Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:30.9824460Z 
2026-11-04T13:23:30.9824729Z PLAY [local] *******************************************************************
2026-11-04T13:23:30.9850823Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-04T13:23:30.9854642Z 
2026-11-04T13:23:30.9855136Z PLAY [instance_restart] ********************************************************
2026-11-04T13:23:30.9855571Z skipping: no hosts matched
2026-11-04T13:23:30.9858309Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-04T13:23:30.9861013Z 
2026-11-04T13:23:30.9861268Z PLAY [machine_reboot] **********************************************************
2026-11-04T13:23:30.9861443Z skipping: no hosts matched
2026-11-04T13:23:30.9867972Z 
2026-11-04T13:23:30.9868279Z PLAY [local] *******************************************************************
2026-11-04T13:23:30.9893887Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-04T13:23:30.9896007Z 
2026-11-04T13:23:30.9896398Z PLAY [instance_stop] ***********************************************************
2026-11-04T13:23:30.9896890Z skipping: no hosts matched
2026-11-04T13:23:30.9899766Z 
2026-11-04T13:23:30.9900208Z PLAY [machine_reboot] **********************************************************
2026-11-04T13:23:30.9900616Z skipping: no hosts matched
2026-11-04T13:23:30.9906355Z 
2026-11-04T13:23:30.9906628Z PLAY [local] *******************************************************************
2026-11-04T13:23:30.9931716Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-04T13:23:30.9934259Z 
2026-11-04T13:23:30.9934422Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-04T13:23:30.9934843Z skipping: no hosts matched
2026-11-04T13:23:30.9940858Z 
2026-11-04T13:23:30.9941116Z PLAY [local] *******************************************************************
2026-11-04T13:23:30.9966935Z 
2026-11-04T13:23:30.9967169Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-04T13:23:30.9967337Z skipping: no hosts matched
2026-11-04T13:23:30.9974834Z 
2026-11-04T13:23:30.9975076Z PLAY [Configura TSM] ***********************************************************
2026-11-04T13:23:31.0005128Z 
2026-11-04T13:23:31.0005768Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0033767Z 
2026-11-04T13:23:31.0034413Z PLAY [Configura Control-M] *****************************************************
2026-11-04T13:23:31.0068555Z 
2026-11-04T13:23:31.0069008Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0113385Z 
2026-11-04T13:23:31.0113931Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0154145Z 
2026-11-04T13:23:31.0154616Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0177234Z 
2026-11-04T13:23:31.0177556Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0212554Z 
2026-11-04T13:23:31.0212892Z PLAY [localhost] ***************************************************************
2026-11-04T13:23:31.0237271Z 
2026-11-04T13:23:31.0237695Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0310667Z 
2026-11-04T13:23:31.0311253Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0348393Z 
2026-11-04T13:23:31.0348696Z PLAY [jboss] *******************************************************************
2026-11-04T13:23:31.0383995Z 
2026-11-04T13:23:31.0384692Z PLAY RECAP *********************************************************************
2026-11-04T13:23:31.0384910Z 10.116.193.77              : ok=3    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-11-04T13:23:31.0385700Z 10.116.193.78              : ok=0    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-11-04T13:23:31.0386038Z 127.0.0.1                  : ok=41   changed=5    unreachable=0    failed=0    skipped=10   rescued=0    ignored=0   
2026-11-04T13:23:31.0386181Z 
2026-11-04T13:23:31.0387084Z Wednesday 04 November 2026  10:23:31 -0300 (0:00:00.178)       0:00:38.430 **** 
2026-11-04T13:23:31.0387409Z =============================================================================== 
2026-11-04T13:23:31.0387756Z Gathering Facts -------------------------------------------------------- 27.23s
2026-11-04T13:23:31.0388006Z vm : Executar script para marcar VM como template ----------------------- 1.72s
2026-11-04T13:23:31.0388258Z vm : Criando arquivo para exportar as variáveis ------------------------- 1.09s
2026-11-04T13:23:31.0388552Z vm : Instalar dependências Python para vCenter -------------------------- 0.87s
2026-11-04T13:23:31.0388783Z vm : Consultar API ------------------------------------------------------ 0.68s
2026-11-04T13:23:31.0389127Z vm : execute create_ip_bck script --------------------------------------- 0.63s
2026-11-04T13:23:31.0389382Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.51s
2026-11-04T13:23:31.0389609Z vm : Run Invetory All --------------------------------------------------- 0.45s
2026-11-04T13:23:31.0389834Z vm : Run Invetory All --------------------------------------------------- 0.45s
2026-11-04T13:23:31.0390060Z vm : Consultar API ------------------------------------------------------ 0.42s
2026-11-04T13:23:31.0390285Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.33s
2026-11-04T13:23:31.0390523Z vm : Coletar variáveis de ambiente -------------------------------------- 0.31s
2026-11-04T13:23:31.0390778Z include_role : dns ------------------------------------------------------ 0.18s
2026-11-04T13:23:31.0391011Z Consultar DNS ----------------------------------------------------------- 0.15s
2026-11-04T13:23:31.0391231Z vm : Criar variáveis ---------------------------------------------------- 0.13s
2026-11-04T13:23:31.0391456Z vm : include_tasks ------------------------------------------------------ 0.12s
2026-11-04T13:23:31.0391796Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-11-04T13:23:31.0392050Z vm : Cria variável build_repository_name -------------------------------- 0.10s
2026-11-04T13:23:31.0392267Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-11-04T13:23:31.0392482Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-11-04T13:23:31.0392637Z Playbook run took 0 days, 0 hours, 0 minutes, 38 seconds
2026-11-04T13:23:31.1057999Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)






Jorge boa tarde, por favor verificar o problema reportado pelo Lucas Oliveira Nadier nessa mensagem. É um atendimento para o ADDR SIGPF nesse caso não precisamos de REQ/WO. 
Oi, Patrícia, boa tarde! O Claudio Monteiro me orientou a falar contigo para ver se o Jorge Milis consegue nos ajudar, porque o Claudio não está mais online hoje.
 
O problema: a URL de TQS do SIGPF-vendas ([https://sigpf\-vendas.esteiras.tqs.caixa/sigpf\_internet](https://sigpf-vendas.esteiras.tqs.caixa/sigpf_internet)) está caindo na página "Ops!!!! parece que você acessou uma URL que não está disponível" do DevOps CAIXA, e o VIP responde 403. Na VM de TQS (caddeapllx2818) o Apache e o JBoss respondem 302 normalmente para o login, então a aplicação está de pé.
 
No log da release de 04/11 (passo "Resumo da release"), o deploy do pacote sigpf-ear-1.0.0.2.ear passou, mas o curl deu timeout e terminou com a mensagem "Ocorreu um erro ao atualizar a url da aplicação na API InfraDevops". Parece que a URL de TQS não ficou registrada na InfraDevops.
 
Vocês conseguem verificar se a URL sigpf-vendas.esteiras.tqs.caixa está registrada na InfraDevops e, se não estiver, registrar? 
 
Obrigado!
 
 
Boa tarde pessoal
 
esse é ambiente novo?
 
Boa tarde! É sim!
 
Ele é um ambiente criado pra migrar o sigpf-internet 
 
pelo erro é porque falta a configuração do VIP exclusivo para ele
 
deixa eu só confirmar qual vip ele está apontando 
 
é isso mesmo, ele está apontando para o VIP compartilhado, precisa solicitar o VIP exclusivo
 
vou tem enviar o passo a passo da wiki
 
Solicitar a criação de VIP exclusivo - Overview
 
Muito obrigado pessoal!
 
Disponha
 
Patricia Vourakis Barbosa Braga adicionou Jesse Mouta Pereira Batista ao chat e compartilhou todo o histórico de chats.



 me ajuda a criar esse vip igua lestamos fazneo para o sigsj
