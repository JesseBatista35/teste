2026-10-07T14:24:19.5166775Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-10-07T14:24:19.5170576Z ==============================================================================
2026-10-07T14:24:19.5170656Z Task         : Bash
2026-10-07T14:24:19.5170745Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-07T14:24:19.5170809Z Version      : 3.227.0
2026-10-07T14:24:19.5170854Z Author       : Microsoft Corporation
2026-10-07T14:24:19.5170948Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-07T14:24:19.5171022Z ==============================================================================
2026-10-07T14:24:20.3479928Z Generating script.
2026-10-07T14:24:20.3489968Z ========================== Starting Command Output ===========================
2026-10-07T14:24:20.3499411Z [command]/bin/bash /opt/ads-agent/_work/_temp/d5705c15-fefa-4d30-bac6-9063f3d6c2e4.sh
2026-10-07T14:24:20.3574905Z /opt/ads-agent/_work/_temp/d5705c15-fefa-4d30-bac6-9063f3d6c2e4.sh: line 4: tf_var_quant: comando não encontrado
2026-10-07T14:24:22.4464234Z 
2026-10-07T14:24:22.4464977Z PLAY [local] *******************************************************************
2026-10-07T14:24:22.4716670Z Wednesday 07 October 2026  11:24:22 -0300 (0:00:00.084)       0:00:00.084 ***** 
2026-10-07T14:24:44.7644052Z 
2026-10-07T14:24:44.7644693Z TASK [Gathering Facts] *********************************************************
2026-10-07T14:24:44.7645420Z ok: [127.0.0.1]
2026-10-07T14:24:44.7951532Z Wednesday 07 October 2026  11:24:44 -0300 (0:00:22.323)       0:00:22.408 ***** 
2026-10-07T14:24:44.8776989Z Wednesday 07 October 2026  11:24:44 -0300 (0:00:00.082)       0:00:22.490 ***** 
2026-10-07T14:24:44.9523126Z [WARNING]: While constructing a mapping from /opt/ads-agent/_work/r15760/a
2026-10-07T14:24:44.9523432Z /esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71, column 3, found a
2026-10-07T14:24:44.9525026Z duplicate dict key (include_tasks). Using last defined value only.
2026-10-07T14:24:44.9630583Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-10-07T14:24:44.9888308Z Wednesday 07 October 2026  11:24:44 -0300 (0:00:00.111)       0:00:22.601 ***** 
2026-10-07T14:24:45.0599805Z 
2026-10-07T14:24:45.0600469Z TASK [vm : Cria variável build_repository_name] ********************************
2026-10-07T14:24:45.0600634Z ok: [127.0.0.1]
2026-10-07T14:24:45.0826981Z Wednesday 07 October 2026  11:24:45 -0300 (0:00:00.093)       0:00:22.695 ***** 
2026-10-07T14:24:45.9362326Z 
2026-10-07T14:24:45.9363024Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-10-07T14:24:45.9363214Z ok: [127.0.0.1]
2026-10-07T14:24:45.9589296Z Wednesday 07 October 2026  11:24:45 -0300 (0:00:00.876)       0:00:23.572 ***** 
2026-10-07T14:24:48.4603100Z 
2026-10-07T14:24:48.4603885Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-10-07T14:24:48.4604304Z changed: [127.0.0.1]
2026-10-07T14:24:48.4823205Z Wednesday 07 October 2026  11:24:48 -0300 (0:00:02.523)       0:00:26.095 ***** 
2026-10-07T14:24:48.5524884Z 
2026-10-07T14:24:48.5525603Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-10-07T14:24:48.5529214Z ok: [127.0.0.1] => {
2026-10-07T14:24:48.5529478Z     "msg": [
2026-10-07T14:24:48.5530138Z         "Iniciando registro do template VMTX...", 
2026-10-07T14:24:48.5530351Z         "vCenter: 10.122.144.195", 
2026-10-07T14:24:48.5530652Z         "Template: controlm9p-openjdk17-rhel93-v040", 
2026-10-07T14:24:48.5530916Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] controlm9p-openjdk17-rhel93-v040/controlm9p-openjdk17-rhel93-v040.vmtx", 
2026-10-07T14:24:48.5531357Z         "Datastore: TEMPLATE_TERRAFORM_NFS", 
2026-10-07T14:24:48.5531617Z         "Template 'controlm9p-openjdk17-rhel93-v040' ja existe e esta registrado. Nenhuma acao necessaria.", 
2026-10-07T14:24:48.5531777Z         "Operacao concluida com sucesso."
2026-10-07T14:24:48.5531873Z     ]
2026-10-07T14:24:48.5532066Z }
2026-10-07T14:24:48.5759443Z Wednesday 07 October 2026  11:24:48 -0300 (0:00:00.093)       0:00:26.189 ***** 
2026-10-07T14:24:48.6475915Z 
2026-10-07T14:24:48.6477096Z TASK [vm : Cria variável ansible] **********************************************
2026-10-07T14:24:48.6477333Z ok: [127.0.0.1]
2026-10-07T14:24:48.6707278Z Wednesday 07 October 2026  11:24:48 -0300 (0:00:00.094)       0:00:26.283 ***** 
2026-10-07T14:24:49.1525196Z 
2026-10-07T14:24:49.1525852Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-10-07T14:24:49.1526047Z ok: [127.0.0.1]
2026-10-07T14:24:49.1753569Z Wednesday 07 October 2026  11:24:49 -0300 (0:00:00.504)       0:00:26.788 ***** 
2026-10-07T14:24:49.5030702Z 
2026-10-07T14:24:49.5033560Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-10-07T14:24:49.5034019Z ok: [127.0.0.1]
2026-10-07T14:24:49.5265081Z Wednesday 07 October 2026  11:24:49 -0300 (0:00:00.351)       0:00:27.139 ***** 
2026-10-07T14:24:49.5873137Z Wednesday 07 October 2026  11:24:49 -0300 (0:00:00.060)       0:00:27.200 ***** 
2026-10-07T14:24:49.6723450Z Wednesday 07 October 2026  11:24:49 -0300 (0:00:00.085)       0:00:27.285 ***** 
2026-10-07T14:24:49.7170553Z 
2026-10-07T14:24:49.7171240Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-10-07T14:24:49.7171933Z ok: [127.0.0.1]
2026-10-07T14:24:49.7400816Z Wednesday 07 October 2026  11:24:49 -0300 (0:00:00.067)       0:00:27.353 ***** 
2026-10-07T14:24:49.8152066Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-10-07T14:24:49.8440811Z Wednesday 07 October 2026  11:24:49 -0300 (0:00:00.103)       0:00:27.457 ***** 
2026-10-07T14:24:49.9062392Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-10-07T14:24:49.9370751Z Wednesday 07 October 2026  11:24:49 -0300 (0:00:00.092)       0:00:27.550 ***** 
2026-10-07T14:24:50.5472130Z 
2026-10-07T14:24:50.5472870Z TASK [vm : Consultar API] ******************************************************
2026-10-07T14:24:50.5473287Z ok: [127.0.0.1]
2026-10-07T14:24:50.5674333Z Wednesday 07 October 2026  11:24:50 -0300 (0:00:00.630)       0:00:28.180 ***** 
2026-10-07T14:24:50.6103869Z 
2026-10-07T14:24:50.6104573Z TASK [vm : Parse JSON] *********************************************************
2026-10-07T14:24:50.6104992Z ok: [127.0.0.1]
2026-10-07T14:24:50.6328877Z Wednesday 07 October 2026  11:24:50 -0300 (0:00:00.065)       0:00:28.246 ***** 
2026-10-07T14:24:50.6991128Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-10-07T14:24:50.7297148Z Wednesday 07 October 2026  11:24:50 -0300 (0:00:00.096)       0:00:28.342 ***** 
2026-10-07T14:24:51.1717870Z 
2026-10-07T14:24:51.1718891Z TASK [vm : Consultar API] ******************************************************
2026-10-07T14:24:51.1719082Z ok: [127.0.0.1]
2026-10-07T14:24:51.1955102Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.465)       0:00:28.808 ***** 
2026-10-07T14:24:51.2393758Z 
2026-10-07T14:24:51.2394380Z TASK [vm : Parse JSON] *********************************************************
2026-10-07T14:24:51.2394785Z ok: [127.0.0.1]
2026-10-07T14:24:51.2632479Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.067)       0:00:28.876 ***** 
2026-10-07T14:24:51.3252417Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.061)       0:00:28.938 ***** 
2026-10-07T14:24:51.3710125Z 
2026-10-07T14:24:51.3710636Z TASK [vm : Exibir size servidores.] ********************************************
2026-10-07T14:24:51.3714198Z ok: [127.0.0.1] => {
2026-10-07T14:24:51.3714320Z     "api_data.dados.0": {
2026-10-07T14:24:51.3714793Z         "ambiente": "tqs", 
2026-10-07T14:24:51.3714955Z         "cluster": null, 
2026-10-07T14:24:51.3723060Z         "cluster_principal": null, 
2026-10-07T14:24:51.3723685Z         "cluster_terraform": null, 
2026-10-07T14:24:51.3723839Z         "cpu": 2, 
2026-10-07T14:24:51.3724155Z         "datacenter": null, 
2026-10-07T14:24:51.3724277Z         "datastore": null, 
2026-10-07T14:24:51.3724383Z         "detalhe_imagem": null, 
2026-10-07T14:24:51.3729834Z         "disco_log": 2, 
2026-10-07T14:24:51.3730063Z         "disco_opt": 10, 
2026-10-07T14:24:51.3730305Z         "domain": null, 
2026-10-07T14:24:51.3730457Z         "esx_network": null, 
2026-10-07T14:24:51.3730575Z         "esx_network_bck": null, 
2026-10-07T14:24:51.3730687Z         "esx_network_bck_01": null, 
2026-10-07T14:24:51.3731532Z         "esx_vcenter_server": null, 
2026-10-07T14:24:51.3731657Z         "farm": null, 
2026-10-07T14:24:51.3731763Z         "id": 61501, 
2026-10-07T14:24:51.3732082Z         "inclusao": "2026-08-18 08:59:36", 
2026-10-07T14:24:51.3732216Z         "info_framework": null, 
2026-10-07T14:24:51.3732319Z         "info_linguagem": null, 
2026-10-07T14:24:51.3735625Z         "info_tecnologia": null, 
2026-10-07T14:24:51.3735765Z         "info_versao": null, 
2026-10-07T14:24:51.3735957Z         "ipbackup": "192.168.243.7", 
2026-10-07T14:24:51.3736094Z         "jboss_apache_status": "ativado", 
2026-10-07T14:24:51.3736216Z         "memoria": 4, 
2026-10-07T14:24:51.3736336Z         "net_adapter_type": null, 
2026-10-07T14:24:51.3736439Z         "nome_imagem": null, 
2026-10-07T14:24:51.3756351Z         "objeto_origem": "SISME-ROTINAS_TQS_SERVIDOR", 
2026-10-07T14:24:51.3756508Z         "plataforma": "vm", 
2026-10-07T14:24:51.3756635Z         "produto": "jboss", 
2026-10-07T14:24:51.3756749Z         "recursos_max_id": null, 
2026-10-07T14:24:51.3756867Z         "servidores_json": [
2026-10-07T14:24:51.3756966Z             {
2026-10-07T14:24:51.3757077Z                 "ip": "10.116.201.252", 
2026-10-07T14:24:51.3757207Z                 "nome": "caddeapllx2781.agil.nprd.caixa.gov.br"
2026-10-07T14:24:51.3757325Z             }
2026-10-07T14:24:51.3757414Z         ], 
2026-10-07T14:24:51.3757559Z         "sistema": "sisme-rotinas", 
2026-10-07T14:24:51.3757673Z         "site": "ctc_nprd", 
2026-10-07T14:24:51.3757793Z         "solicitacoes_id": null, 
2026-10-07T14:24:51.3757903Z         "status": "ativado", 
2026-10-07T14:24:51.3758015Z         "terraform": true, 
2026-10-07T14:24:51.3758127Z         "versao_imagem": null, 
2026-10-07T14:24:51.3758231Z         "versao_plataforma": "7.1", 
2026-10-07T14:24:51.3758340Z         "vm_dns": null, 
2026-10-07T14:24:51.3758448Z         "vm_ipnetmask": null, 
2026-10-07T14:24:51.3758565Z         "vm_ipnetmask_bck": null, 
2026-10-07T14:24:51.3758683Z         "vm_ipnetmask_bck_01": null, 
2026-10-07T14:24:51.3758789Z         "vsphere_folder": null, 
2026-10-07T14:24:51.3758901Z         "vsphere_pool": null
2026-10-07T14:24:51.3758995Z     }
2026-10-07T14:24:51.3759082Z }
2026-10-07T14:24:51.3950506Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.069)       0:00:29.007 ***** 
2026-10-07T14:24:51.4570672Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.062)       0:00:29.070 ***** 
2026-10-07T14:24:51.5050155Z 
2026-10-07T14:24:51.5051222Z TASK [vm : Set size] ***********************************************************
2026-10-07T14:24:51.5051439Z ok: [127.0.0.1]
2026-10-07T14:24:51.5283299Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.071)       0:00:29.141 ***** 
2026-10-07T14:24:51.5734213Z 
2026-10-07T14:24:51.5734905Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-10-07T14:24:51.5735504Z ok: [127.0.0.1]
2026-10-07T14:24:51.5964268Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.068)       0:00:29.209 ***** 
2026-10-07T14:24:51.6376122Z 
2026-10-07T14:24:51.6376664Z TASK [vm : debug] **************************************************************
2026-10-07T14:24:51.6378019Z ok: [127.0.0.1] => {
2026-10-07T14:24:51.6378368Z     "template_name": "controlm9p-openjdk17-rhel93-v040"
2026-10-07T14:24:51.6378486Z }
2026-10-07T14:24:51.6623692Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.065)       0:00:29.275 ***** 
2026-10-07T14:24:51.7049046Z 
2026-10-07T14:24:51.7050240Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-10-07T14:24:51.7050722Z ok: [127.0.0.1]
2026-10-07T14:24:51.7277623Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.065)       0:00:29.341 ***** 
2026-10-07T14:24:51.7921262Z Wednesday 07 October 2026  11:24:51 -0300 (0:00:00.064)       0:00:29.405 ***** 
2026-10-07T14:24:52.2467112Z 
2026-10-07T14:24:52.2467614Z TASK [vm : Run Invetory All] ***************************************************
2026-10-07T14:24:52.2467752Z changed: [127.0.0.1]
2026-10-07T14:24:52.2700844Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.477)       0:00:29.883 ***** 
2026-10-07T14:24:52.3147332Z 
2026-10-07T14:24:52.3148202Z TASK [vm : Parse JSON output] **************************************************
2026-10-07T14:24:52.3148390Z ok: [127.0.0.1]
2026-10-07T14:24:52.3381524Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.068)       0:00:29.951 ***** 
2026-10-07T14:24:52.3825204Z 
2026-10-07T14:24:52.3825934Z TASK [vm : Count the number of hosts] ******************************************
2026-10-07T14:24:52.3826138Z ok: [127.0.0.1]
2026-10-07T14:24:52.4056347Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.067)       0:00:30.018 ***** 
2026-10-07T14:24:52.4699394Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.064)       0:00:30.083 ***** 
2026-10-07T14:24:52.5342986Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.064)       0:00:30.147 ***** 
2026-10-07T14:24:52.5753889Z 
2026-10-07T14:24:52.5754533Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-10-07T14:24:52.5755188Z ok: [127.0.0.1] => {
2026-10-07T14:24:52.5755343Z     "msg": [
2026-10-07T14:24:52.5755454Z         "num_hosts: 1"
2026-10-07T14:24:52.5755553Z     ]
2026-10-07T14:24:52.5755646Z }
2026-10-07T14:24:52.5987372Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.064)       0:00:30.211 ***** 
2026-10-07T14:24:52.6627550Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.063)       0:00:30.275 ***** 
2026-10-07T14:24:52.7301436Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.067)       0:00:30.343 ***** 
2026-10-07T14:24:52.7939255Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-10-07T14:24:52.8284752Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.098)       0:00:30.441 ***** 
2026-10-07T14:24:52.8944439Z included: /opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-10-07T14:24:52.9544806Z Wednesday 07 October 2026  11:24:52 -0300 (0:00:00.125)       0:00:30.567 ***** 
2026-10-07T14:24:53.0001775Z 
2026-10-07T14:24:53.0002446Z TASK [vm : Criar variáveis] ****************************************************
2026-10-07T14:24:53.0003029Z ok: [127.0.0.1]
2026-10-07T14:24:53.0442818Z Wednesday 07 October 2026  11:24:53 -0300 (0:00:00.089)       0:00:30.657 ***** 
2026-10-07T14:24:53.3654881Z 
2026-10-07T14:24:53.3655543Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-10-07T14:24:53.3883302Z ok: [127.0.0.1]
2026-10-07T14:24:53.3883694Z Wednesday 07 October 2026  11:24:53 -0300 (0:00:00.344)       0:00:31.001 ***** 
2026-10-07T14:24:53.4321536Z 
2026-10-07T14:24:53.4322455Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-10-07T14:24:53.4325272Z ok: [127.0.0.1] => {
2026-10-07T14:24:53.4325613Z     "nfs_vars_json": {
2026-10-07T14:24:53.4328707Z         "changed": false, 
2026-10-07T14:24:53.4329420Z         "cmd": "cat /opt/ads-agent/_work/r15760/a/nfs_config.json", 
2026-10-07T14:24:53.4329707Z         "delta": "0:00:00.005820", 
2026-10-07T14:24:53.4330397Z         "end": "2026-10-07 11:24:53.346979", 
2026-10-07T14:24:53.4330718Z         "failed": false, 
2026-10-07T14:24:53.4330975Z         "rc": 0, 
2026-10-07T14:24:53.4346698Z         "start": "2026-10-07 11:24:53.341159", 
2026-10-07T14:24:53.4347019Z         "stderr": "", 
2026-10-07T14:24:53.4347403Z         "stderr_lines": [], 
2026-10-07T14:24:53.4348137Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]", 
2026-10-07T14:24:53.4348712Z         "stdout_lines": [
2026-10-07T14:24:53.4348887Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-07T14:24:53.4349044Z         ]
2026-10-07T14:24:53.4349214Z     }
2026-10-07T14:24:53.4349307Z }
2026-10-07T14:24:53.4555682Z Wednesday 07 October 2026  11:24:53 -0300 (0:00:00.067)       0:00:31.068 ***** 
2026-10-07T14:24:53.5026596Z 
2026-10-07T14:24:53.5027554Z TASK [vm : Criar variáveis] ****************************************************
2026-10-07T14:24:53.5028142Z ok: [127.0.0.1]
2026-10-07T14:24:53.5261214Z Wednesday 07 October 2026  11:24:53 -0300 (0:00:00.070)       0:00:31.139 ***** 
2026-10-07T14:24:54.1351599Z 
2026-10-07T14:24:54.1352693Z TASK [vm : execute create_ip_bck script] ***************************************
2026-10-07T14:24:54.1352910Z changed: [127.0.0.1]
2026-10-07T14:24:54.1570870Z Wednesday 07 October 2026  11:24:54 -0300 (0:00:00.630)       0:00:31.770 ***** 
2026-10-07T14:24:54.2034264Z 
2026-10-07T14:24:54.2034980Z TASK [vm : ansible.builtin.debug] **********************************************
2026-10-07T14:24:54.2038758Z ok: [127.0.0.1] => {
2026-10-07T14:24:54.2039021Z     "changed": false, 
2026-10-07T14:24:54.2039525Z     "msg": {
2026-10-07T14:24:54.2040195Z         "changed": true, 
2026-10-07T14:24:54.2040374Z         "cmd": [
2026-10-07T14:24:54.2040484Z             "python", 
2026-10-07T14:24:54.2040850Z             "/opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-07T14:24:54.2040998Z             "create_ip_bck", 
2026-10-07T14:24:54.2041133Z             "sisme-rotinas", 
2026-10-07T14:24:54.2041233Z             "tqs", 
2026-10-07T14:24:54.2041332Z             "ctc_nprd", 
2026-10-07T14:24:54.2041529Z             "/opt/ads-agent/_work/r15760/a/esteira-jboss-vm-v2", 
2026-10-07T14:24:54.2041668Z             "C&t@d02", 
2026-10-07T14:24:54.2041943Z             "***", 
2026-10-07T14:24:54.2042072Z             "s736651@corp.caixa.gov.br", 
2026-10-07T14:24:54.2042185Z             "***", 
2026-10-07T14:24:54.2042352Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW\",\"NFS_MOUNT_POINT_ISILON\": \"/sisme_fgw\"}]"
2026-10-07T14:24:54.2042513Z         ], 
2026-10-07T14:24:54.2042644Z         "delta": "0:00:00.288995", 
2026-10-07T14:24:54.2042824Z         "end": "2026-10-07 11:24:54.117605", 
2026-10-07T14:24:54.2042950Z         "failed": false, 
2026-10-07T14:24:54.2043044Z         "rc": 0, 
2026-10-07T14:24:54.2043212Z         "start": "2026-10-07 11:24:53.828610", 
2026-10-07T14:24:54.2043363Z         "stderr": "", 
2026-10-07T14:24:54.2043470Z         "stderr_lines": [], 
2026-10-07T14:24:54.2045813Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nNFS ENDPOINT: {u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw'}\nVariaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'), (u'NFS_MOUNT_POINT_ISILON', u'/sisme_fgw'))]\nVariaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW/sisme_fgwISILONnfsctcnprd.ctc.caixatqs\nDados da Consulta AzureDevops:[{u'inclusao': u'2026-08-18 08:59:36', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61501, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.201.252', u'nome': u'caddeapllx2781.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': u'SISME-ROTINAS_TQS_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': None, u'sistema': u'sisme-rotinas', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'tqs', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.243.7', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 2}]\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-07T14:24:54.2047392Z         "stdout_lines": [
2026-10-07T14:24:54.2047673Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'}]", 
2026-10-07T14:24:54.2047869Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-07T14:24:54.2048227Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-07T14:24:54.2048615Z             "NFS ENDPOINT: {u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'} | NFS MOUNTPOINTS: {u'NFS_MOUNT_POINT_ISILON': u'/sisme_fgw'}", 
2026-10-07T14:24:54.2048995Z             "Variaveis combinadas[((u'NFS_ENDPOINT_ISILON', u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW'), (u'NFS_MOUNT_POINT_ISILON', u'/sisme_fgw'))]", 
2026-10-07T14:24:54.2049294Z             "Variaveis que chegam /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW/sisme_fgwISILONnfsctcnprd.ctc.caixatqs", 
2026-10-07T14:24:54.2050717Z             "Dados da Consulta AzureDevops:[{u'inclusao': u'2026-08-18 08:59:36', u'disco_opt': 10, u'domain': None, u'vsphere_pool': None, u'versao_imagem': None, u'site': u'ctc_nprd', u'terraform': True, u'info_versao': None, u'datastore': None, u'info_framework': None, u'id': 61501, u'esx_network_bck': None, u'esx_network': None, u'esx_vcenter_server': None, u'servidores_json': [{u'ip': u'10.116.201.252', u'nome': u'caddeapllx2781.agil.nprd.caixa.gov.br'}], u'info_linguagem': None, u'vm_ipnetmask': None, u'produto': u'jboss', u'vm_dns': None, u'jboss_apache_status': u'ativado', u'nome_imagem': None, u'cluster_principal': None, u'esx_network_bck_01': None, u'vm_ipnetmask_bck': None, u'objeto_origem': u'SISME-ROTINAS_TQS_SERVIDOR', u'status': u'ativado', u'recursos_max_id': None, u'solicitacoes_id': None, u'memoria': 4, u'farm': None, u'versao_plataforma': u'7.1', u'vm_ipnetmask_bck_01': None, u'sistema': u'sisme-rotinas', u'net_adapter_type': None, u'cluster_terraform': None, u'ambiente': u'tqs', u'datacenter': None, u'vsphere_folder': None, u'info_tecnologia': None, u'cluster': None, u'disco_log': 2, u'ipbackup': u'192.168.243.7', u'plataforma': u'vm', u'detalhe_imagem': None, u'cpu': 2}]", 
2026-10-07T14:24:54.2051512Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW /sisme_fgw                          ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-07T14:24:54.2051738Z         ]
2026-10-07T14:24:54.2051828Z     }
2026-10-07T14:24:54.2051915Z }
2026-10-07T14:24:54.2272409Z Wednesday 07 October 2026  11:24:54 -0300 (0:00:00.070)       0:00:31.840 ***** 
2026-10-07T14:24:54.6706766Z 
2026-10-07T14:24:54.6707269Z TASK [vm : Run Invetory All] ***************************************************
2026-10-07T14:24:54.6707657Z changed: [127.0.0.1]
2026-10-07T14:24:54.6940027Z Wednesday 07 October 2026  11:24:54 -0300 (0:00:00.466)       0:00:32.307 ***** 
2026-10-07T14:24:54.7393440Z 
2026-10-07T14:24:54.7394191Z TASK [vm : Parse JSON output] **************************************************
2026-10-07T14:24:54.7394864Z ok: [127.0.0.1]
2026-10-07T14:24:54.7622501Z Wednesday 07 October 2026  11:24:54 -0300 (0:00:00.068)       0:00:32.375 ***** 
2026-10-07T14:24:54.8079820Z 
2026-10-07T14:24:54.8080391Z TASK [vm : Debug parsed_output] ************************************************
2026-10-07T14:24:54.8080590Z ok: [127.0.0.1] => {
2026-10-07T14:24:54.8080686Z     "msg": [
2026-10-07T14:24:54.8080781Z         {
2026-10-07T14:24:54.8080884Z             "_meta": {
2026-10-07T14:24:54.8081038Z                 "hostvars": {
2026-10-07T14:24:54.8081157Z                     "caddeapllx2781.agil.nprd.caixa.gov.br": {
2026-10-07T14:24:54.8081280Z                         "ambiente": "tqs", 
2026-10-07T14:24:54.8081398Z                         "ansible_host": "10.116.201.252", 
2026-10-07T14:24:54.8081510Z                         "cluster": null, 
2026-10-07T14:24:54.8081639Z                         "cluster_principal": null, 
2026-10-07T14:24:54.8081757Z                         "cluster_terraform": null, 
2026-10-07T14:24:54.8081861Z                         "cpu": 2, 
2026-10-07T14:24:54.8081968Z                         "datacenter": null, 
2026-10-07T14:24:54.8082080Z                         "datastore": null, 
2026-10-07T14:24:54.8082181Z                         "detalhe_imagem": null, 
2026-10-07T14:24:54.8082296Z                         "disco_log": 2, 
2026-10-07T14:24:54.8082402Z                         "disco_opt": 10, 
2026-10-07T14:24:54.8082508Z                         "domain": null, 
2026-10-07T14:24:54.8082615Z                         "esx_network": null, 
2026-10-07T14:24:54.8082728Z                         "esx_network_bck": null, 
2026-10-07T14:24:54.8082834Z                         "esx_network_bck_01": null, 
2026-10-07T14:24:54.8082951Z                         "esx_vcenter_server": null, 
2026-10-07T14:24:54.8083060Z                         "farm": null, 
2026-10-07T14:24:54.8083165Z                         "id": 61501, 
2026-10-07T14:24:54.8083473Z                         "inclusao": "2026-08-18 08:59:36", 
2026-10-07T14:24:54.8083601Z                         "info_framework": null, 
2026-10-07T14:24:54.8083703Z                         "info_linguagem": null, 
2026-10-07T14:24:54.8083814Z                         "info_tecnologia": null, 
2026-10-07T14:24:54.8083931Z                         "info_versao": null, 
2026-10-07T14:24:54.8084042Z                         "ipbackup": "192.168.243.7", 
2026-10-07T14:24:54.8084163Z                         "jboss_apache_status": "ativado", 
2026-10-07T14:24:54.8084277Z                         "memoria": 4, 
2026-10-07T14:24:54.8084379Z                         "net_adapter_type": null, 
2026-10-07T14:24:54.8084491Z                         "nome_imagem": null, 
2026-10-07T14:24:54.8084672Z                         "objeto_origem": "SISME-ROTINAS_TQS_SERVIDOR", 
2026-10-07T14:24:54.8084794Z                         "plataforma": "vm", 
2026-10-07T14:24:54.8085179Z                         "produto": "jboss", 
2026-10-07T14:24:54.8085294Z                         "recursos_max_id": null, 
2026-10-07T14:24:54.8085459Z                         "sistema": "sisme-rotinas", 
2026-10-07T14:24:54.8085574Z                         "site": "ctc_nprd", 
2026-10-07T14:24:54.8085824Z                         "solicitacoes_id": null, 
2026-10-07T14:24:54.8086037Z                         "status": "ativado", 
2026-10-07T14:24:54.8086146Z                         "terraform": true, 
2026-10-07T14:24:54.8086260Z                         "versao_imagem": null, 
2026-10-07T14:24:54.8086370Z                         "versao_plataforma": "7.1", 
2026-10-07T14:24:54.8086482Z                         "vm_dns": null, 
2026-10-07T14:24:54.8086592Z                         "vm_ipnetmask": null, 
2026-10-07T14:24:54.8086712Z                         "vm_ipnetmask_bck": null, 
2026-10-07T14:24:54.8086830Z                         "vm_ipnetmask_bck_01": null, 
2026-10-07T14:24:54.8086952Z                         "vsphere_folder": null, 
2026-10-07T14:24:54.8087052Z                         "vsphere_pool": null
2026-10-07T14:24:54.8087153Z                     }
2026-10-07T14:24:54.8087248Z                 }
2026-10-07T14:24:54.8087337Z             }, 
2026-10-07T14:24:54.8087436Z             "ctc_nprd": {
2026-10-07T14:24:54.8087539Z                 "children": [
2026-10-07T14:24:54.8087633Z                     "jboss"
2026-10-07T14:24:54.8087730Z                 ], 
2026-10-07T14:24:54.8087829Z                 "vars": {}
2026-10-07T14:24:54.8087924Z             }, 
2026-10-07T14:24:54.8088020Z             "jboss": {
2026-10-07T14:24:54.8088112Z                 "hosts": [
2026-10-07T14:24:54.8088229Z                     "caddeapllx2781.agil.nprd.caixa.gov.br"
2026-10-07T14:24:54.8088341Z                 ], 
2026-10-07T14:24:54.8088439Z                 "vars": {}
2026-10-07T14:24:54.8088534Z             }, 
2026-10-07T14:24:54.8088629Z             "local": {
2026-10-07T14:24:54.8088720Z                 "hosts": [
2026-10-07T14:24:54.8088821Z                     "127.0.0.1"
2026-10-07T14:24:54.8088918Z                 ], 
2026-10-07T14:24:54.8089012Z                 "vars": {
2026-10-07T14:24:54.8089243Z                     "ansible_connection": "local"
2026-10-07T14:24:54.8089350Z                 }
2026-10-07T14:24:54.8089440Z             }, 
2026-10-07T14:24:54.8089536Z             "tqs": {
2026-10-07T14:24:54.8089634Z                 "children": [
2026-10-07T14:24:54.8089733Z                     "local", 
2026-10-07T14:24:54.8089829Z                     "ctc_nprd"
2026-10-07T14:24:54.8089913Z                 ], 
2026-10-07T14:24:54.8090009Z                 "vars": {}
2026-10-07T14:24:54.8090099Z             }
2026-10-07T14:24:54.8090185Z         }
2026-10-07T14:24:54.8090270Z     ]
2026-10-07T14:24:54.8090352Z }
2026-10-07T14:24:54.8309502Z Wednesday 07 October 2026  11:24:54 -0300 (0:00:00.068)       0:00:32.444 ***** 
2026-10-07T14:24:54.8801639Z 
2026-10-07T14:24:54.8802085Z TASK [vm : Verificando os ambientes] *******************************************
2026-10-07T14:24:54.8802273Z ok: [127.0.0.1] => {
2026-10-07T14:24:54.8802386Z     "msg": [
2026-10-07T14:24:54.8804999Z         "Ambiente existentes! Servidores: caddeapllx2781.agil.nprd.caixa.gov.br"
2026-10-07T14:24:54.8805414Z     ]
2026-10-07T14:24:54.8805756Z }
2026-10-07T14:24:54.9023997Z Wednesday 07 October 2026  11:24:54 -0300 (0:00:00.071)       0:00:32.515 ***** 
2026-10-07T14:24:54.9742278Z 
2026-10-07T14:24:54.9743021Z TASK [vm : Recuperar ip] *******************************************************
2026-10-07T14:24:54.9743620Z ok: [127.0.0.1] => (item=caddeapllx2781.agil.nprd.caixa.gov.br)
2026-10-07T14:24:54.9969007Z Wednesday 07 October 2026  11:24:54 -0300 (0:00:00.094)       0:00:32.610 ***** 
2026-10-07T14:24:55.0747660Z Wednesday 07 October 2026  11:24:55 -0300 (0:00:00.077)       0:00:32.687 ***** 
2026-10-07T14:24:55.1233071Z 
2026-10-07T14:24:55.1233519Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-10-07T14:24:55.1234123Z ok: [127.0.0.1] => {
2026-10-07T14:24:55.1234229Z     "msg": [
2026-10-07T14:24:55.1234402Z         "Servidores: \\\"caddeapllx2781.agil.nprd.caixa.gov.br\\\"", 
2026-10-07T14:24:55.1234547Z         "IPs: \\\"10.116.201.252\\\"", 
2026-10-07T14:24:55.1238560Z         "Gateways: \\\"10.116.192.1\\\"", 
2026-10-07T14:24:55.1238980Z         "IPs Backup: \\\"192.168.243.7\\\"", 
2026-10-07T14:24:55.1239755Z         "Servidores (OBJ): \\\"caddeapllx2781.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.201.252\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"192.168.243.7\\\"}"
2026-10-07T14:24:55.1240044Z     ]
2026-10-07T14:24:55.1240333Z }
2026-10-07T14:24:55.1464648Z Wednesday 07 October 2026  11:24:55 -0300 (0:00:00.071)       0:00:32.759 ***** 
2026-10-07T14:24:56.0357404Z 
2026-10-07T14:24:56.0358301Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-10-07T14:24:56.0358528Z changed: [127.0.0.1]
2026-10-07T14:24:56.0414966Z 
2026-10-07T14:24:56.0415526Z PLAY [Configurando o DNS] ******************************************************
2026-10-07T14:24:56.2531312Z Wednesday 07 October 2026  11:24:56 -0300 (0:00:01.106)       0:00:33.866 ***** 
2026-10-07T14:24:56.4040844Z 
2026-10-07T14:24:56.4041655Z TASK [Consultar DNS] ***********************************************************
2026-10-07T14:24:56.4042104Z changed: [10.116.193.77] => (item=caddeapllx2781.agil.nprd.caixa.gov.br)
2026-10-07T14:24:56.4081416Z Wednesday 07 October 2026  11:24:56 -0300 (0:00:00.155)       0:00:34.021 ***** 
2026-10-07T14:24:56.4702089Z 
2026-10-07T14:24:56.4702756Z TASK [Verificar se o domínio resolve para um IP] *******************************
2026-10-07T14:24:56.4711777Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-10-07 11:24:56.388218', u'stdout': u'10.116.201.252', u'item': u'caddeapllx2781.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2781.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.014261', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2781.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.201.252'], u'start': u'2026-10-07 11:24:56.373957'}) => {
2026-10-07T14:24:56.4729994Z     "msg": "O domínio caddeapllx2781.agil.nprd.caixa.gov.br resolve para os seguintes endereços IP: [u'10.116.201.252']"
2026-10-07T14:24:56.4730164Z }
2026-10-07T14:24:56.4760866Z Wednesday 07 October 2026  11:24:56 -0300 (0:00:00.067)       0:00:34.088 ***** 
2026-10-07T14:24:56.5251647Z Wednesday 07 October 2026  11:24:56 -0300 (0:00:00.049)       0:00:34.138 ***** 
2026-10-07T14:24:56.5767089Z Wednesday 07 October 2026  11:24:56 -0300 (0:00:00.051)       0:00:34.189 ***** 
2026-10-07T14:24:56.6422064Z 
2026-10-07T14:24:56.6422855Z TASK [Set created DNS] *********************************************************
2026-10-07T14:24:56.6424399Z ok: [10.116.193.77] => (item={u'stderr_lines': [], u'ansible_loop_var': u'item', u'end': u'2026-10-07 11:24:56.388218', u'stdout': u'10.116.201.252', u'item': u'caddeapllx2781.agil.nprd.caixa.gov.br', u'changed': True, u'rc': 0, u'failed': False, u'cmd': [u'dig', u'+short', u'caddeapllx2781.agil.nprd.caixa.gov.br', u'+timeout=5'], u'stderr': u'', u'delta': u'0:00:00.014261', u'invocation': {u'module_args': {u'creates': None, u'executable': None, u'_uses_shell': False, u'strip_empty_ends': True, u'_raw_params': u'dig +short "caddeapllx2781.agil.nprd.caixa.gov.br" +timeout=5', u'removes': None, u'argv': None, u'warn': True, u'chdir': None, u'stdin_add_newline': True, u'stdin': None}}, u'stdout_lines': [u'10.116.201.252'], u'start': u'2026-10-07 11:24:56.373957'})
2026-10-07T14:24:56.6465137Z Wednesday 07 October 2026  11:24:56 -0300 (0:00:00.069)       0:00:34.259 ***** 
2026-10-07T14:24:56.7092076Z 
2026-10-07T14:24:56.7092587Z PLAY [local] *******************************************************************
2026-10-07T14:24:56.7125340Z 
2026-10-07T14:24:56.7126179Z PLAY [Verificando serviços] ****************************************************
2026-10-07T14:24:56.7213119Z 
2026-10-07T14:24:56.7213853Z PLAY [Configuração LDAP] *******************************************************
2026-10-07T14:24:56.7241167Z [WARNING]: Found variable using reserved name: when
2026-10-07T14:24:56.7249325Z 
2026-10-07T14:24:56.7250054Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7334729Z 
2026-10-07T14:24:56.7335141Z PLAY [Stack Jboss] *************************************************************
2026-10-07T14:24:56.7361480Z 
2026-10-07T14:24:56.7361691Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7403450Z 
2026-10-07T14:24:56.7403704Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7448836Z 
2026-10-07T14:24:56.7449075Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7475317Z 
2026-10-07T14:24:56.7475503Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-07T14:24:56.7500495Z 
2026-10-07T14:24:56.7500723Z PLAY [Copiando modules adicionais] *********************************************
2026-10-07T14:24:56.7530253Z 
2026-10-07T14:24:56.7530622Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7566233Z 
2026-10-07T14:24:56.7566494Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7597007Z 
2026-10-07T14:24:56.7597179Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7631506Z 
2026-10-07T14:24:56.7631802Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7656534Z 
2026-10-07T14:24:56.7657073Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7684126Z 
2026-10-07T14:24:56.7684557Z PLAY [local] *******************************************************************
2026-10-07T14:24:56.7706769Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-10-07T14:24:56.7709902Z 
2026-10-07T14:24:56.7710114Z PLAY [instance_restart] ********************************************************
2026-10-07T14:24:56.7710262Z skipping: no hosts matched
2026-10-07T14:24:56.7712850Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-10-07T14:24:56.7716026Z 
2026-10-07T14:24:56.7716281Z PLAY [machine_reboot] **********************************************************
2026-10-07T14:24:56.7716424Z skipping: no hosts matched
2026-10-07T14:24:56.7724869Z 
2026-10-07T14:24:56.7725065Z PLAY [local] *******************************************************************
2026-10-07T14:24:56.7749302Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-10-07T14:24:56.7752229Z 
2026-10-07T14:24:56.7752494Z PLAY [instance_stop] ***********************************************************
2026-10-07T14:24:56.7755849Z skipping: no hosts matched
2026-10-07T14:24:56.7755912Z 
2026-10-07T14:24:56.7756040Z PLAY [machine_reboot] **********************************************************
2026-10-07T14:24:56.7756174Z skipping: no hosts matched
2026-10-07T14:24:56.7764372Z 
2026-10-07T14:24:56.7764687Z PLAY [local] *******************************************************************
2026-10-07T14:24:56.7787718Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-10-07T14:24:56.7790822Z 
2026-10-07T14:24:56.7791009Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-10-07T14:24:56.7791171Z skipping: no hosts matched
2026-10-07T14:24:56.7797238Z 
2026-10-07T14:24:56.7797503Z PLAY [local] *******************************************************************
2026-10-07T14:24:56.7821581Z 
2026-10-07T14:24:56.7821821Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-10-07T14:24:56.7821964Z skipping: no hosts matched
2026-10-07T14:24:56.7828455Z 
2026-10-07T14:24:56.7828727Z PLAY [Configura TSM] ***********************************************************
2026-10-07T14:24:56.7856424Z 
2026-10-07T14:24:56.7856725Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7885967Z 
2026-10-07T14:24:56.7886621Z PLAY [Configura Control-M] *****************************************************
2026-10-07T14:24:56.7924603Z 
2026-10-07T14:24:56.7925172Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.7974424Z 
2026-10-07T14:24:56.7974749Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.8014276Z 
2026-10-07T14:24:56.8014705Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.8038399Z 
2026-10-07T14:24:56.8038892Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.8068458Z 
2026-10-07T14:24:56.8068840Z PLAY [localhost] ***************************************************************
2026-10-07T14:24:56.8093931Z 
2026-10-07T14:24:56.8094415Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.8136191Z 
2026-10-07T14:24:56.8136600Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.8176719Z 
2026-10-07T14:24:56.8177021Z PLAY [jboss] *******************************************************************
2026-10-07T14:24:56.8207877Z 
2026-10-07T14:24:56.8208195Z PLAY RECAP *********************************************************************
2026-10-07T14:24:56.8208366Z 10.116.193.77              : ok=3    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=0   
2026-10-07T14:24:56.8208552Z 10.116.193.78              : ok=0    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
2026-10-07T14:24:56.8208724Z 127.0.0.1                  : ok=41   changed=5    unreachable=0    failed=0    skipped=10   rescued=0    ignored=0   
2026-10-07T14:24:56.8208805Z 
2026-10-07T14:24:56.8209211Z Wednesday 07 October 2026  11:24:56 -0300 (0:00:00.174)       0:00:34.434 ***** 
2026-10-07T14:24:56.8209400Z =============================================================================== 
2026-10-07T14:24:56.8213885Z Gathering Facts -------------------------------------------------------- 22.32s
2026-10-07T14:24:56.8214383Z vm : Executar script para marcar VM como template ----------------------- 2.52s
2026-10-07T14:24:56.8215042Z vm : Criando arquivo para exportar as variáveis ------------------------- 1.11s
2026-10-07T14:24:56.8215305Z vm : Instalar dependências Python para vCenter -------------------------- 0.88s
2026-10-07T14:24:56.8215561Z vm : execute create_ip_bck script --------------------------------------- 0.63s
2026-10-07T14:24:56.8215824Z vm : Consultar API ------------------------------------------------------ 0.63s
2026-10-07T14:24:56.8216065Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.50s
2026-10-07T14:24:56.8217051Z vm : Run Invetory All --------------------------------------------------- 0.48s
2026-10-07T14:24:56.8217281Z vm : Run Invetory All --------------------------------------------------- 0.47s
2026-10-07T14:24:56.8217502Z vm : Consultar API ------------------------------------------------------ 0.47s
2026-10-07T14:24:56.8217716Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.35s
2026-10-07T14:24:56.8217936Z vm : Coletar variáveis de ambiente -------------------------------------- 0.34s
2026-10-07T14:24:56.8219056Z include_role : dns ------------------------------------------------------ 0.17s
2026-10-07T14:24:56.8219685Z Consultar DNS ----------------------------------------------------------- 0.16s
2026-10-07T14:24:56.8220105Z vm : include_tasks ------------------------------------------------------ 0.13s
2026-10-07T14:24:56.8220462Z vm : include_tasks ------------------------------------------------------ 0.11s
2026-10-07T14:24:56.8220983Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-10-07T14:24:56.8221473Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-10-07T14:24:56.8221705Z vm : include_tasks ------------------------------------------------------ 0.10s
2026-10-07T14:24:56.8221949Z vm : Cria variável ansible ---------------------------------------------- 0.09s
2026-10-07T14:24:56.8222119Z Playbook run took 0 days, 0 hours, 0 minutes, 34 seconds
2026-10-07T14:24:56.8934150Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
