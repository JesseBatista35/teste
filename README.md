estou com esse erro no azuredevops


Deploy em des

nesse step


2026-06-16T20:34:08.8511884Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-16T20:34:08.8515848Z ==============================================================================
2026-06-16T20:34:08.8515993Z Task         : Bash
2026-06-16T20:34:08.8516039Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-16T20:34:08.8516142Z Version      : 3.227.0
2026-06-16T20:34:08.8516190Z Author       : Microsoft Corporation
2026-06-16T20:34:08.8516242Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-16T20:34:08.8516363Z ==============================================================================
2026-06-16T20:34:09.0041759Z Generating script.
2026-06-16T20:34:09.0054144Z ========================== Starting Command Output ===========================
2026-06-16T20:34:09.0063404Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/535f1fb4-9146-4820-a4cc-3540589966de.sh
2026-06-16T20:34:09.0149312Z /opt/ads-agent/_work/_temp/535f1fb4-9146-4820-a4cc-3540589966de.sh: line 4: tf_var_quant: command not found
2026-06-16T20:34:09.2872178Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-06-16T20:34:09.2872427Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-06-16T20:34:09.2872990Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-06-16T20:34:09.2873189Z setting deprecation_warnings=False in ansible.cfg.
2026-06-16T20:34:09.8589310Z 
2026-06-16T20:34:09.8590050Z PLAY [local] *******************************************************************
2026-06-16T20:34:09.8590597Z Tuesday 16 June 2026  17:34:09 -0300 (0:00:00.010)       0:00:00.010 ********** 
2026-06-16T20:34:10.6741955Z [WARNING]: Distribution rhel 9.3 on host 127.0.0.1 should use /usr/bin/python3,
2026-06-16T20:34:10.6742226Z but is using /usr/bin/python for backward compatibility with prior Ansible
2026-06-16T20:34:10.6743609Z releases. See https://docs.ansible.com/ansible-
2026-06-16T20:34:10.6744101Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-06-16T20:34:10.6932615Z 
2026-06-16T20:34:10.6933620Z TASK [Gathering Facts] *********************************************************
2026-06-16T20:34:10.6933966Z ok: [127.0.0.1]
2026-06-16T20:34:10.6935232Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.834)       0:00:00.844 ********** 
2026-06-16T20:34:10.7273044Z 
2026-06-16T20:34:10.7273680Z TASK [include_role : vm] *******************************************************
2026-06-16T20:34:10.7543973Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.033)       0:00:00.878 ********** 
2026-06-16T20:34:10.7544245Z [WARNING]: While constructing a mapping from /opt/ads-
2026-06-16T20:34:10.7544467Z agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71,
2026-06-16T20:34:10.7544675Z column 3, found a duplicate dict key (include_tasks). Using last defined value
2026-06-16T20:34:10.7544843Z only.
2026-06-16T20:34:10.7692241Z 
2026-06-16T20:34:10.7692813Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:10.7693361Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-06-16T20:34:10.7693867Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.041)       0:00:00.920 ********** 
2026-06-16T20:34:10.8072562Z 
2026-06-16T20:34:10.8073773Z TASK [vm : Cria variável build_repository_name] ********************************
2026-06-16T20:34:10.8074250Z ok: [127.0.0.1]
2026-06-16T20:34:10.8075296Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.038)       0:00:00.958 ********** 
2026-06-16T20:34:11.6406089Z 
2026-06-16T20:34:11.6407423Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-06-16T20:34:11.6407795Z ok: [127.0.0.1]
2026-06-16T20:34:11.6408041Z Tuesday 16 June 2026  17:34:11 -0300 (0:00:00.833)       0:00:01.791 ********** 
2026-06-16T20:34:12.0039849Z 
2026-06-16T20:34:12.0040477Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-06-16T20:34:12.0043219Z fatal: [127.0.0.1]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py"], "delta": "0:00:00.042801", "end": "2026-06-16 17:34:11.973699", "msg": "non-zero return code", "rc": 1, "start": "2026-06-16 17:34:11.930898", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py\", line 6, in <module>\n    from pyVim.connect import SmartConnect, Disconnect\n  File \"/usr/local/lib/python3.9/site-packages/pyVim/connect.py\", line 23, in <module>\n    from pyVmomi.five import PY3, HTTPConnection, HTTPSConnection\n  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/__init__.py\", line 14, in <module>\n    from . import _init_utils  # noqa: E402\n  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/_init_utils.py\", line 8, in <module>\n    raise Exception(msg)\nException: Python 3.10 or newer is required (found 3.9)", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py\", line 6, in <module>", "    from pyVim.connect import SmartConnect, Disconnect", "  File \"/usr/local/lib/python3.9/site-packages/pyVim/connect.py\", line 23, in <module>", "    from pyVmomi.five import PY3, HTTPConnection, HTTPSConnection", "  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/__init__.py\", line 14, in <module>", "    from . import _init_utils  # noqa: E402", "  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/_init_utils.py\", line 8, in <module>", "    raise Exception(msg)", "Exception: Python 3.10 or newer is required (found 3.9)"], "stdout": "", "stdout_lines": []}
2026-06-16T20:34:12.0044287Z ...ignoring
2026-06-16T20:34:12.0044523Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.363)       0:00:02.155 ********** 
2026-06-16T20:34:12.0425977Z 
2026-06-16T20:34:12.0427054Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-06-16T20:34:12.0427272Z ok: [127.0.0.1] => {
2026-06-16T20:34:12.0427617Z     "msg": []
2026-06-16T20:34:12.0427746Z }
2026-06-16T20:34:12.0428243Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.039)       0:00:02.194 ********** 
2026-06-16T20:34:12.0875292Z 
2026-06-16T20:34:12.0876202Z TASK [vm : Cria variável ansible] **********************************************
2026-06-16T20:34:12.0876400Z ok: [127.0.0.1]
2026-06-16T20:34:12.0876962Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.044)       0:00:02.238 ********** 
2026-06-16T20:34:12.3817783Z [WARNING]: Skipped '/opt/ads-agent/_work/r183/a/_SIFOF-batch-config/ansible/'
2026-06-16T20:34:12.3818126Z path due to this access issue: '/opt/ads-agent/_work/r183/a/_SIFOF-batch-
2026-06-16T20:34:12.3818346Z config/ansible/' is not a directory
2026-06-16T20:34:12.3883200Z 
2026-06-16T20:34:12.3883813Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-16T20:34:12.3884071Z ok: [127.0.0.1]
2026-06-16T20:34:12.3884479Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.301)       0:00:02.539 ********** 
2026-06-16T20:34:12.5922170Z 
2026-06-16T20:34:12.5923204Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-16T20:34:12.5923396Z ok: [127.0.0.1]
2026-06-16T20:34:12.5923632Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.203)       0:00:02.743 ********** 
2026-06-16T20:34:12.6088634Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.016)       0:00:02.760 ********** 
2026-06-16T20:34:12.6358026Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.026)       0:00:02.787 ********** 
2026-06-16T20:34:12.6701985Z 
2026-06-16T20:34:12.6702471Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-06-16T20:34:12.6702841Z ok: [127.0.0.1]
2026-06-16T20:34:12.6703346Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.034)       0:00:02.821 ********** 
2026-06-16T20:34:12.7213141Z 
2026-06-16T20:34:12.7213716Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:12.7214733Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-06-16T20:34:12.7215071Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.050)       0:00:02.872 ********** 
2026-06-16T20:34:12.7671841Z 
2026-06-16T20:34:12.7672319Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:12.7672937Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-06-16T20:34:12.7673265Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.046)       0:00:02.918 ********** 
2026-06-16T20:34:13.2466594Z 
2026-06-16T20:34:13.2467233Z TASK [vm : Consultar API] ******************************************************
2026-06-16T20:34:13.2467375Z ok: [127.0.0.1]
2026-06-16T20:34:13.2467899Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.479)       0:00:03.398 ********** 
2026-06-16T20:34:13.2806596Z 
2026-06-16T20:34:13.2807242Z TASK [vm : Parse JSON] *********************************************************
2026-06-16T20:34:13.2807405Z ok: [127.0.0.1]
2026-06-16T20:34:13.2807906Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.033)       0:00:03.431 ********** 
2026-06-16T20:34:13.3261585Z 
2026-06-16T20:34:13.3262083Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:13.3262851Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-06-16T20:34:13.3263381Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.045)       0:00:03.477 ********** 
2026-06-16T20:34:13.6625526Z 
2026-06-16T20:34:13.6626513Z TASK [vm : Consultar API] ******************************************************
2026-06-16T20:34:13.6626820Z ok: [127.0.0.1]
2026-06-16T20:34:13.6627335Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.336)       0:00:03.813 ********** 
2026-06-16T20:34:13.6958564Z 
2026-06-16T20:34:13.6959659Z TASK [vm : Parse JSON] *********************************************************
2026-06-16T20:34:13.6960246Z ok: [127.0.0.1]
2026-06-16T20:34:13.6961189Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.033)       0:00:03.847 ********** 
2026-06-16T20:34:13.7277526Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.031)       0:00:03.878 ********** 
2026-06-16T20:34:13.7671763Z 
2026-06-16T20:34:13.7672246Z TASK [vm : Exibir size servidores.] ********************************************
2026-06-16T20:34:13.7672388Z ok: [127.0.0.1] => {
2026-06-16T20:34:13.7672544Z     "api_data.dados.0": {
2026-06-16T20:34:13.7672835Z         "ambiente": "des",
2026-06-16T20:34:13.7672980Z         "cluster": null,
2026-06-16T20:34:13.7673297Z         "cluster_principal": null,
2026-06-16T20:34:13.7673449Z         "cluster_terraform": null,
2026-06-16T20:34:13.7673548Z         "cpu": 2,
2026-06-16T20:34:13.7673685Z         "datacenter": null,
2026-06-16T20:34:13.7673827Z         "datastore": null,
2026-06-16T20:34:13.7673970Z         "detalhe_imagem": null,
2026-06-16T20:34:13.7674129Z         "disco_log": 2,
2026-06-16T20:34:13.7674227Z         "disco_opt": 10,
2026-06-16T20:34:13.7674384Z         "domain": null,
2026-06-16T20:34:13.7674527Z         "esx_network": null,
2026-06-16T20:34:13.7674694Z         "esx_network_bck": null,
2026-06-16T20:34:13.7674840Z         "esx_vcenter_server": null,
2026-06-16T20:34:13.7674976Z         "farm": null,
2026-06-16T20:34:13.7675074Z         "id": 13352,
2026-06-16T20:34:13.7675438Z         "inclusao": "2026-06-05 18:02:45",
2026-06-16T20:34:13.7675596Z         "info_framework": null,
2026-06-16T20:34:13.7675750Z         "info_linguagem": null,
2026-06-16T20:34:13.7675893Z         "info_tecnologia": null,
2026-06-16T20:34:13.7675995Z         "info_versao": null,
2026-06-16T20:34:13.7676143Z         "ipbackup": "192.168.242.148",
2026-06-16T20:34:13.7676317Z         "jboss_apache_status": "ativado",
2026-06-16T20:34:13.7676465Z         "memoria": 4,
2026-06-16T20:34:13.7676605Z         "net_adapter_type": null,
2026-06-16T20:34:13.7676745Z         "nome_imagem": null,
2026-06-16T20:34:13.7677183Z         "objeto_origem": "SIFOF-BATCH_DES_SERVIDOR",
2026-06-16T20:34:13.7677350Z         "plataforma": "vm",
2026-06-16T20:34:13.7677490Z         "produto": "jboss",
2026-06-16T20:34:13.7677629Z         "recursos_max_id": null,
2026-06-16T20:34:13.7677764Z         "servidores_json": [
2026-06-16T20:34:13.7677909Z             {
2026-06-16T20:34:13.7678009Z                 "ip": "10.116.201.148",
2026-06-16T20:34:13.7678161Z                 "jboss_apache_status": "ativado",
2026-06-16T20:34:13.7678327Z                 "nome": "caddeapllx2538.agil.nprd.caixa.gov.br"
2026-06-16T20:34:13.7678475Z             }
2026-06-16T20:34:13.7678606Z         ],
2026-06-16T20:34:13.7678752Z         "sistema": "sifof-batch",
2026-06-16T20:34:13.7678906Z         "site": "ctc_nprd",
2026-06-16T20:34:13.7679047Z         "solicitacoes_id": null,
2026-06-16T20:34:13.7679186Z         "status": "ativado",
2026-06-16T20:34:13.7679347Z         "terraform": true,
2026-06-16T20:34:13.7679484Z         "versao_imagem": null,
2026-06-16T20:34:13.7679594Z         "versao_plataforma": "7.1",
2026-06-16T20:34:13.7679741Z         "vm_dns": null,
2026-06-16T20:34:13.7679889Z         "vm_ipnetmask": null,
2026-06-16T20:34:13.7680029Z         "vm_ipnetmask_bck": null,
2026-06-16T20:34:13.7680167Z         "vsphere_folder": null,
2026-06-16T20:34:13.7680303Z         "vsphere_pool": null
2026-06-16T20:34:13.7680394Z     }
2026-06-16T20:34:13.7680512Z }
2026-06-16T20:34:13.7680769Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.039)       0:00:03.918 ********** 
2026-06-16T20:34:13.7987953Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.031)       0:00:03.950 ********** 
2026-06-16T20:34:13.8404450Z 
2026-06-16T20:34:13.8405090Z TASK [vm : Set size] ***********************************************************
2026-06-16T20:34:13.8405323Z ok: [127.0.0.1]
2026-06-16T20:34:13.8405821Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.041)       0:00:03.991 ********** 
2026-06-16T20:34:13.8735571Z 
2026-06-16T20:34:13.8736556Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-06-16T20:34:13.8737023Z ok: [127.0.0.1]
2026-06-16T20:34:13.8737360Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.033)       0:00:04.024 ********** 
2026-06-16T20:34:13.9046079Z 
2026-06-16T20:34:13.9047871Z TASK [vm : debug] **************************************************************
2026-06-16T20:34:13.9048060Z ok: [127.0.0.1] => {
2026-06-16T20:34:13.9048547Z     "template_name": "controlm-openjdk11-rhel79-v019"
2026-06-16T20:34:13.9048658Z }
2026-06-16T20:34:13.9048932Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.031)       0:00:04.055 ********** 
2026-06-16T20:34:13.9415602Z 
2026-06-16T20:34:13.9416367Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-06-16T20:34:13.9416666Z ok: [127.0.0.1]
2026-06-16T20:34:13.9416950Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.036)       0:00:04.092 ********** 
2026-06-16T20:34:13.9770800Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.035)       0:00:04.128 ********** 
2026-06-16T20:34:14.3163508Z 
2026-06-16T20:34:14.3164355Z TASK [vm : Run Invetory All] ***************************************************
2026-06-16T20:34:14.3164749Z changed: [127.0.0.1]
2026-06-16T20:34:14.3165666Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.339)       0:00:04.467 ********** 
2026-06-16T20:34:14.3510472Z 
2026-06-16T20:34:14.3511328Z TASK [vm : Parse JSON output] **************************************************
2026-06-16T20:34:14.3511639Z ok: [127.0.0.1]
2026-06-16T20:34:14.3512300Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.034)       0:00:04.502 ********** 
2026-06-16T20:34:14.3907379Z 
2026-06-16T20:34:14.3909673Z TASK [vm : Count the number of hosts] ******************************************
2026-06-16T20:34:14.3909991Z ok: [127.0.0.1]
2026-06-16T20:34:14.3910608Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.039)       0:00:04.542 ********** 
2026-06-16T20:34:14.4276862Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.036)       0:00:04.578 ********** 
2026-06-16T20:34:14.4614304Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.033)       0:00:04.612 ********** 
2026-06-16T20:34:14.4966745Z 
2026-06-16T20:34:14.4967255Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-06-16T20:34:14.4967539Z ok: [127.0.0.1] => {
2026-06-16T20:34:14.4967847Z     "msg": [
2026-06-16T20:34:14.4967986Z         "num_hosts: 1"
2026-06-16T20:34:14.4968115Z     ]
2026-06-16T20:34:14.4968237Z }
2026-06-16T20:34:14.4968666Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.035)       0:00:04.648 ********** 
2026-06-16T20:34:14.5346470Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.037)       0:00:04.686 ********** 
2026-06-16T20:34:14.5764465Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.041)       0:00:04.727 ********** 
2026-06-16T20:34:14.6215996Z 
2026-06-16T20:34:14.6217161Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:14.6217785Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-06-16T20:34:14.6218148Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.045)       0:00:04.773 ********** 
2026-06-16T20:34:14.6597919Z 
2026-06-16T20:34:14.6598783Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:14.6599423Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-06-16T20:34:14.6599744Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.038)       0:00:04.811 ********** 
2026-06-16T20:34:14.7007530Z 
2026-06-16T20:34:14.7009170Z TASK [vm : Criar variáveis] ****************************************************
2026-06-16T20:34:14.7009489Z ok: [127.0.0.1]
2026-06-16T20:34:14.7009852Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.040)       0:00:04.852 ********** 
2026-06-16T20:34:14.9280052Z 
2026-06-16T20:34:14.9281190Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-06-16T20:34:14.9281618Z ok: [127.0.0.1 -> localhost]
2026-06-16T20:34:14.9281931Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.227)       0:00:05.079 ********** 
2026-06-16T20:34:14.9607816Z 
2026-06-16T20:34:14.9609188Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-06-16T20:34:14.9609465Z ok: [127.0.0.1] => {
2026-06-16T20:34:14.9609698Z     "nfs_vars_json": {
2026-06-16T20:34:14.9609921Z         "changed": false,
2026-06-16T20:34:14.9610507Z         "cmd": "cat /opt/ads-agent/_work/r183/a/nfs_config.json",
2026-06-16T20:34:14.9610847Z         "delta": "0:00:00.005721",
2026-06-16T20:34:14.9611227Z         "end": "2026-06-16 17:34:14.894181",
2026-06-16T20:34:14.9611424Z         "failed": false,
2026-06-16T20:34:14.9611637Z         "msg": "",
2026-06-16T20:34:14.9611916Z         "rc": 0,
2026-06-16T20:34:14.9612233Z         "start": "2026-06-16 17:34:14.888460",
2026-06-16T20:34:14.9612466Z         "stderr": "",
2026-06-16T20:34:14.9612682Z         "stderr_lines": [],
2026-06-16T20:34:14.9613123Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sifof\"}]",
2026-06-16T20:34:14.9613609Z         "stdout_lines": [
2026-06-16T20:34:14.9613937Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sifof\"}]"
2026-06-16T20:34:14.9614227Z         ]
2026-06-16T20:34:14.9614407Z     }
2026-06-16T20:34:14.9614591Z }
2026-06-16T20:34:14.9614951Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.032)       0:00:05.112 ********** 
2026-06-16T20:34:14.9971525Z 
2026-06-16T20:34:14.9972665Z TASK [vm : Criar variáveis] ****************************************************
2026-06-16T20:34:14.9973107Z ok: [127.0.0.1]
2026-06-16T20:34:14.9974194Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.036)       0:00:05.148 ********** 
2026-06-16T20:34:15.3247731Z 
2026-06-16T20:34:15.3254474Z TASK [vm : execute create_ip_bck script] ***************************************
2026-06-16T20:34:15.3257387Z fatal: [127.0.0.1]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", "create_ip_bck", "sifof-batch", "des", "ctc_nprd", "/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2", "C&t@d02", "***", "s736651@corp.caixa.gov.br", "***", "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sifof\"}]"], "delta": "0:00:00.103381", "end": "2026-06-16 17:34:15.286511", "msg": "non-zero return code", "rc": 1, "start": "2026-06-16 17:34:15.183130", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 12, in <module>\n    import isi_sdk_8_1_1 as isilon\nModuleNotFoundError: No module named 'isi_sdk_8_1_1'", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 12, in <module>", "    import isi_sdk_8_1_1 as isilon", "ModuleNotFoundError: No module named 'isi_sdk_8_1_1'"], "stdout": "", "stdout_lines": []}
2026-06-16T20:34:15.3258533Z 
2026-06-16T20:34:15.3258811Z PLAY RECAP *********************************************************************
2026-06-16T20:34:15.3259149Z 127.0.0.1                  : ok=32   changed=2    unreachable=0    failed=1    skipped=9    rescued=0    ignored=1   
2026-06-16T20:34:15.3259281Z 
2026-06-16T20:34:15.3259537Z Playbook run took 0 days, 0 hours, 0 minutes, 5 seconds
2026-06-16T20:34:15.3260061Z Tuesday 16 June 2026  17:34:15 -0300 (0:00:00.327)       0:00:05.476 ********** 
2026-06-16T20:34:15.3260397Z =============================================================================== 
2026-06-16T20:34:15.3260814Z Gathering Facts --------------------------------------------------------- 0.83s
2026-06-16T20:34:15.3261239Z vm : Instalar dependências Python para vCenter -------------------------- 0.83s
2026-06-16T20:34:15.3261601Z vm : Consultar API ------------------------------------------------------ 0.48s
2026-06-16T20:34:15.3262180Z vm : Executar script para marcar VM como template ----------------------- 0.36s
2026-06-16T20:34:15.3262594Z vm : Run Invetory All --------------------------------------------------- 0.34s
2026-06-16T20:34:15.3263169Z vm : Consultar API ------------------------------------------------------ 0.34s
2026-06-16T20:34:15.3263575Z vm : execute create_ip_bck script --------------------------------------- 0.33s
2026-06-16T20:34:15.3263984Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.30s
2026-06-16T20:34:15.3264405Z vm : Coletar variáveis de ambiente -------------------------------------- 0.23s
2026-06-16T20:34:15.3264779Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.20s
2026-06-16T20:34:15.3265181Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3265592Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3266042Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3266463Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3266867Z vm : Cria variável ansible ---------------------------------------------- 0.04s
2026-06-16T20:34:15.3267269Z vm : include_tasks ------------------------------------------------------ 0.04s
2026-06-16T20:34:15.3267627Z vm : include_tasks ------------------------------------------------------ 0.04s
2026-06-16T20:34:15.3268029Z vm : Set size ----------------------------------------------------------- 0.04s
2026-06-16T20:34:15.3268492Z vm : Criar variáveis ---------------------------------------------------- 0.04s
2026-06-16T20:34:15.3268901Z vm : Count the number of hosts ------------------------------------------ 0.04s
2026-06-16T20:34:15.5235888Z 
2026-06-16T20:34:15.5236436Z {
2026-06-16T20:34:15.5236774Z     "_meta": {
2026-06-16T20:34:15.5237259Z         "hostvars": {
2026-06-16T20:34:15.5237425Z             "caddeapllx2538.agil.nprd.caixa.gov.br": {
2026-06-16T20:34:15.5237618Z                 "ambiente": "des",
2026-06-16T20:34:15.5237733Z                 "ansible_host": "10.116.201.148",
2026-06-16T20:34:15.5238147Z                 "cluster": null,
2026-06-16T20:34:15.5238300Z                 "cluster_principal": null,
2026-06-16T20:34:15.5238699Z                 "cluster_terraform": null,
2026-06-16T20:34:15.5239136Z                 "cpu": 2,
2026-06-16T20:34:15.5239256Z                 "datacenter": null,
2026-06-16T20:34:15.5239433Z                 "datastore": null,
2026-06-16T20:34:15.5239574Z                 "detalhe_imagem": null,
2026-06-16T20:34:15.5239717Z                 "disco_log": 2,
2026-06-16T20:34:15.5240014Z                 "disco_opt": 10,
2026-06-16T20:34:15.5240157Z                 "domain": null,
2026-06-16T20:34:15.5240299Z                 "esx_network": null,
2026-06-16T20:34:15.5240409Z                 "esx_network_bck": null,
2026-06-16T20:34:15.5240632Z                 "esx_vcenter_server": null,
2026-06-16T20:34:15.5240880Z                 "farm": null,
2026-06-16T20:34:15.5241014Z                 "id": 13352,
2026-06-16T20:34:15.5241453Z                 "inclusao": "2026-06-05 18:02:45",
2026-06-16T20:34:15.5241622Z                 "info_framework": null,
2026-06-16T20:34:15.5241732Z                 "info_linguagem": null,
2026-06-16T20:34:15.5241875Z                 "info_tecnologia": null,
2026-06-16T20:34:15.5242020Z                 "info_versao": null,
2026-06-16T20:34:15.5242192Z                 "ipbackup": "192.168.242.148",
2026-06-16T20:34:15.5242343Z                 "jboss_apache_status": "ativado",
2026-06-16T20:34:15.5242483Z                 "memoria": 4,
2026-06-16T20:34:15.5242589Z                 "net_adapter_type": null,
2026-06-16T20:34:15.5242824Z                 "nome_imagem": null,
2026-06-16T20:34:15.5243043Z                 "objeto_origem": "SIFOF-BATCH_DES_SERVIDOR",
2026-06-16T20:34:15.5243218Z                 "plataforma": "vm",
2026-06-16T20:34:15.5243381Z                 "produto": "jboss",
2026-06-16T20:34:15.5243583Z                 "recursos_max_id": null,
2026-06-16T20:34:15.5243864Z                 "sistema": "sifof-batch",
2026-06-16T20:34:15.5244011Z                 "site": "ctc_nprd",
2026-06-16T20:34:15.5244160Z                 "solicitacoes_id": null,
2026-06-16T20:34:15.5244301Z                 "status": "ativado",
2026-06-16T20:34:15.5244438Z                 "terraform": true,
2026-06-16T20:34:15.5244545Z                 "versao_imagem": null,
2026-06-16T20:34:15.5244708Z                 "versao_plataforma": "7.1",
2026-06-16T20:34:15.5244869Z                 "vm_dns": null,
2026-06-16T20:34:15.5245008Z                 "vm_ipnetmask": null,
2026-06-16T20:34:15.5245152Z                 "vm_ipnetmask_bck": null,
2026-06-16T20:34:15.5245312Z                 "vsphere_folder": null,
2026-06-16T20:34:15.5245451Z                 "vsphere_pool": null
2026-06-16T20:34:15.5245547Z             }
2026-06-16T20:34:15.5245668Z         }
2026-06-16T20:34:15.5245798Z     },
2026-06-16T20:34:15.5245924Z     "ctc_nprd": {
2026-06-16T20:34:15.5246069Z         "children": [
2026-06-16T20:34:15.5246163Z             "jboss"
2026-06-16T20:34:15.5246281Z         ],
2026-06-16T20:34:15.5246406Z         "vars": {}
2026-06-16T20:34:15.5246521Z     },
2026-06-16T20:34:15.5246637Z     "des": {
2026-06-16T20:34:15.5246731Z         "children": [
2026-06-16T20:34:15.5246857Z             "local",
2026-06-16T20:34:15.5246991Z             "ctc_nprd"
2026-06-16T20:34:15.5247111Z         ],
2026-06-16T20:34:15.5247248Z         "vars": {}
2026-06-16T20:34:15.5247365Z     },
2026-06-16T20:34:15.5247452Z     "jboss": {
2026-06-16T20:34:15.5247575Z         "hosts": [
2026-06-16T20:34:15.5247722Z             "caddeapllx2538.agil.nprd.caixa.gov.br"
2026-06-16T20:34:15.5247861Z         ],
2026-06-16T20:34:15.5247991Z         "vars": {}
2026-06-16T20:34:15.5248073Z     },
2026-06-16T20:34:15.5248193Z     "local": {
2026-06-16T20:34:15.5248369Z         "hosts": [
2026-06-16T20:34:15.5248518Z             "127.0.0.1"
2026-06-16T20:34:15.5248710Z         ],
2026-06-16T20:34:15.5248798Z         "vars": {
2026-06-16T20:34:15.5248938Z             "ansible_connection": "local"
2026-06-16T20:34:15.5249068Z         }
2026-06-16T20:34:15.5249207Z     }
2026-06-16T20:34:15.5249324Z }
2026-06-16T20:34:15.5374693Z ##[error]Bash exited with code '1'.
2026-06-16T20:34:15.5389146Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)



aquie rodou com agent de linuzx-okd4



tireit o agente deixei so de linux


e passou

2026-06-16T20:34:08.8511884Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-16T20:34:08.8515848Z ==============================================================================
2026-06-16T20:34:08.8515993Z Task         : Bash
2026-06-16T20:34:08.8516039Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-16T20:34:08.8516142Z Version      : 3.227.0
2026-06-16T20:34:08.8516190Z Author       : Microsoft Corporation
2026-06-16T20:34:08.8516242Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-16T20:34:08.8516363Z ==============================================================================
2026-06-16T20:34:09.0041759Z Generating script.
2026-06-16T20:34:09.0054144Z ========================== Starting Command Output ===========================
2026-06-16T20:34:09.0063404Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/535f1fb4-9146-4820-a4cc-3540589966de.sh
2026-06-16T20:34:09.0149312Z /opt/ads-agent/_work/_temp/535f1fb4-9146-4820-a4cc-3540589966de.sh: line 4: tf_var_quant: command not found
2026-06-16T20:34:09.2872178Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-06-16T20:34:09.2872427Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-06-16T20:34:09.2872990Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-06-16T20:34:09.2873189Z setting deprecation_warnings=False in ansible.cfg.
2026-06-16T20:34:09.8589310Z 
2026-06-16T20:34:09.8590050Z PLAY [local] *******************************************************************
2026-06-16T20:34:09.8590597Z Tuesday 16 June 2026  17:34:09 -0300 (0:00:00.010)       0:00:00.010 ********** 
2026-06-16T20:34:10.6741955Z [WARNING]: Distribution rhel 9.3 on host 127.0.0.1 should use /usr/bin/python3,
2026-06-16T20:34:10.6742226Z but is using /usr/bin/python for backward compatibility with prior Ansible
2026-06-16T20:34:10.6743609Z releases. See https://docs.ansible.com/ansible-
2026-06-16T20:34:10.6744101Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-06-16T20:34:10.6932615Z 
2026-06-16T20:34:10.6933620Z TASK [Gathering Facts] *********************************************************
2026-06-16T20:34:10.6933966Z ok: [127.0.0.1]
2026-06-16T20:34:10.6935232Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.834)       0:00:00.844 ********** 
2026-06-16T20:34:10.7273044Z 
2026-06-16T20:34:10.7273680Z TASK [include_role : vm] *******************************************************
2026-06-16T20:34:10.7543973Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.033)       0:00:00.878 ********** 
2026-06-16T20:34:10.7544245Z [WARNING]: While constructing a mapping from /opt/ads-
2026-06-16T20:34:10.7544467Z agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71,
2026-06-16T20:34:10.7544675Z column 3, found a duplicate dict key (include_tasks). Using last defined value
2026-06-16T20:34:10.7544843Z only.
2026-06-16T20:34:10.7692241Z 
2026-06-16T20:34:10.7692813Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:10.7693361Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-06-16T20:34:10.7693867Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.041)       0:00:00.920 ********** 
2026-06-16T20:34:10.8072562Z 
2026-06-16T20:34:10.8073773Z TASK [vm : Cria variável build_repository_name] ********************************
2026-06-16T20:34:10.8074250Z ok: [127.0.0.1]
2026-06-16T20:34:10.8075296Z Tuesday 16 June 2026  17:34:10 -0300 (0:00:00.038)       0:00:00.958 ********** 
2026-06-16T20:34:11.6406089Z 
2026-06-16T20:34:11.6407423Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-06-16T20:34:11.6407795Z ok: [127.0.0.1]
2026-06-16T20:34:11.6408041Z Tuesday 16 June 2026  17:34:11 -0300 (0:00:00.833)       0:00:01.791 ********** 
2026-06-16T20:34:12.0039849Z 
2026-06-16T20:34:12.0040477Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-06-16T20:34:12.0043219Z fatal: [127.0.0.1]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py"], "delta": "0:00:00.042801", "end": "2026-06-16 17:34:11.973699", "msg": "non-zero return code", "rc": 1, "start": "2026-06-16 17:34:11.930898", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py\", line 6, in <module>\n    from pyVim.connect import SmartConnect, Disconnect\n  File \"/usr/local/lib/python3.9/site-packages/pyVim/connect.py\", line 23, in <module>\n    from pyVmomi.five import PY3, HTTPConnection, HTTPSConnection\n  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/__init__.py\", line 14, in <module>\n    from . import _init_utils  # noqa: E402\n  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/_init_utils.py\", line 8, in <module>\n    raise Exception(msg)\nException: Python 3.10 or newer is required (found 3.9)", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/files/vcenter-mark-as-template.py\", line 6, in <module>", "    from pyVim.connect import SmartConnect, Disconnect", "  File \"/usr/local/lib/python3.9/site-packages/pyVim/connect.py\", line 23, in <module>", "    from pyVmomi.five import PY3, HTTPConnection, HTTPSConnection", "  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/__init__.py\", line 14, in <module>", "    from . import _init_utils  # noqa: E402", "  File \"/usr/local/lib/python3.9/site-packages/pyVmomi/_init_utils.py\", line 8, in <module>", "    raise Exception(msg)", "Exception: Python 3.10 or newer is required (found 3.9)"], "stdout": "", "stdout_lines": []}
2026-06-16T20:34:12.0044287Z ...ignoring
2026-06-16T20:34:12.0044523Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.363)       0:00:02.155 ********** 
2026-06-16T20:34:12.0425977Z 
2026-06-16T20:34:12.0427054Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-06-16T20:34:12.0427272Z ok: [127.0.0.1] => {
2026-06-16T20:34:12.0427617Z     "msg": []
2026-06-16T20:34:12.0427746Z }
2026-06-16T20:34:12.0428243Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.039)       0:00:02.194 ********** 
2026-06-16T20:34:12.0875292Z 
2026-06-16T20:34:12.0876202Z TASK [vm : Cria variável ansible] **********************************************
2026-06-16T20:34:12.0876400Z ok: [127.0.0.1]
2026-06-16T20:34:12.0876962Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.044)       0:00:02.238 ********** 
2026-06-16T20:34:12.3817783Z [WARNING]: Skipped '/opt/ads-agent/_work/r183/a/_SIFOF-batch-config/ansible/'
2026-06-16T20:34:12.3818126Z path due to this access issue: '/opt/ads-agent/_work/r183/a/_SIFOF-batch-
2026-06-16T20:34:12.3818346Z config/ansible/' is not a directory
2026-06-16T20:34:12.3883200Z 
2026-06-16T20:34:12.3883813Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-16T20:34:12.3884071Z ok: [127.0.0.1]
2026-06-16T20:34:12.3884479Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.301)       0:00:02.539 ********** 
2026-06-16T20:34:12.5922170Z 
2026-06-16T20:34:12.5923204Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-16T20:34:12.5923396Z ok: [127.0.0.1]
2026-06-16T20:34:12.5923632Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.203)       0:00:02.743 ********** 
2026-06-16T20:34:12.6088634Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.016)       0:00:02.760 ********** 
2026-06-16T20:34:12.6358026Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.026)       0:00:02.787 ********** 
2026-06-16T20:34:12.6701985Z 
2026-06-16T20:34:12.6702471Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-06-16T20:34:12.6702841Z ok: [127.0.0.1]
2026-06-16T20:34:12.6703346Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.034)       0:00:02.821 ********** 
2026-06-16T20:34:12.7213141Z 
2026-06-16T20:34:12.7213716Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:12.7214733Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-06-16T20:34:12.7215071Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.050)       0:00:02.872 ********** 
2026-06-16T20:34:12.7671841Z 
2026-06-16T20:34:12.7672319Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:12.7672937Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-06-16T20:34:12.7673265Z Tuesday 16 June 2026  17:34:12 -0300 (0:00:00.046)       0:00:02.918 ********** 
2026-06-16T20:34:13.2466594Z 
2026-06-16T20:34:13.2467233Z TASK [vm : Consultar API] ******************************************************
2026-06-16T20:34:13.2467375Z ok: [127.0.0.1]
2026-06-16T20:34:13.2467899Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.479)       0:00:03.398 ********** 
2026-06-16T20:34:13.2806596Z 
2026-06-16T20:34:13.2807242Z TASK [vm : Parse JSON] *********************************************************
2026-06-16T20:34:13.2807405Z ok: [127.0.0.1]
2026-06-16T20:34:13.2807906Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.033)       0:00:03.431 ********** 
2026-06-16T20:34:13.3261585Z 
2026-06-16T20:34:13.3262083Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:13.3262851Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-06-16T20:34:13.3263381Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.045)       0:00:03.477 ********** 
2026-06-16T20:34:13.6625526Z 
2026-06-16T20:34:13.6626513Z TASK [vm : Consultar API] ******************************************************
2026-06-16T20:34:13.6626820Z ok: [127.0.0.1]
2026-06-16T20:34:13.6627335Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.336)       0:00:03.813 ********** 
2026-06-16T20:34:13.6958564Z 
2026-06-16T20:34:13.6959659Z TASK [vm : Parse JSON] *********************************************************
2026-06-16T20:34:13.6960246Z ok: [127.0.0.1]
2026-06-16T20:34:13.6961189Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.033)       0:00:03.847 ********** 
2026-06-16T20:34:13.7277526Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.031)       0:00:03.878 ********** 
2026-06-16T20:34:13.7671763Z 
2026-06-16T20:34:13.7672246Z TASK [vm : Exibir size servidores.] ********************************************
2026-06-16T20:34:13.7672388Z ok: [127.0.0.1] => {
2026-06-16T20:34:13.7672544Z     "api_data.dados.0": {
2026-06-16T20:34:13.7672835Z         "ambiente": "des",
2026-06-16T20:34:13.7672980Z         "cluster": null,
2026-06-16T20:34:13.7673297Z         "cluster_principal": null,
2026-06-16T20:34:13.7673449Z         "cluster_terraform": null,
2026-06-16T20:34:13.7673548Z         "cpu": 2,
2026-06-16T20:34:13.7673685Z         "datacenter": null,
2026-06-16T20:34:13.7673827Z         "datastore": null,
2026-06-16T20:34:13.7673970Z         "detalhe_imagem": null,
2026-06-16T20:34:13.7674129Z         "disco_log": 2,
2026-06-16T20:34:13.7674227Z         "disco_opt": 10,
2026-06-16T20:34:13.7674384Z         "domain": null,
2026-06-16T20:34:13.7674527Z         "esx_network": null,
2026-06-16T20:34:13.7674694Z         "esx_network_bck": null,
2026-06-16T20:34:13.7674840Z         "esx_vcenter_server": null,
2026-06-16T20:34:13.7674976Z         "farm": null,
2026-06-16T20:34:13.7675074Z         "id": 13352,
2026-06-16T20:34:13.7675438Z         "inclusao": "2026-06-05 18:02:45",
2026-06-16T20:34:13.7675596Z         "info_framework": null,
2026-06-16T20:34:13.7675750Z         "info_linguagem": null,
2026-06-16T20:34:13.7675893Z         "info_tecnologia": null,
2026-06-16T20:34:13.7675995Z         "info_versao": null,
2026-06-16T20:34:13.7676143Z         "ipbackup": "192.168.242.148",
2026-06-16T20:34:13.7676317Z         "jboss_apache_status": "ativado",
2026-06-16T20:34:13.7676465Z         "memoria": 4,
2026-06-16T20:34:13.7676605Z         "net_adapter_type": null,
2026-06-16T20:34:13.7676745Z         "nome_imagem": null,
2026-06-16T20:34:13.7677183Z         "objeto_origem": "SIFOF-BATCH_DES_SERVIDOR",
2026-06-16T20:34:13.7677350Z         "plataforma": "vm",
2026-06-16T20:34:13.7677490Z         "produto": "jboss",
2026-06-16T20:34:13.7677629Z         "recursos_max_id": null,
2026-06-16T20:34:13.7677764Z         "servidores_json": [
2026-06-16T20:34:13.7677909Z             {
2026-06-16T20:34:13.7678009Z                 "ip": "10.116.201.148",
2026-06-16T20:34:13.7678161Z                 "jboss_apache_status": "ativado",
2026-06-16T20:34:13.7678327Z                 "nome": "caddeapllx2538.agil.nprd.caixa.gov.br"
2026-06-16T20:34:13.7678475Z             }
2026-06-16T20:34:13.7678606Z         ],
2026-06-16T20:34:13.7678752Z         "sistema": "sifof-batch",
2026-06-16T20:34:13.7678906Z         "site": "ctc_nprd",
2026-06-16T20:34:13.7679047Z         "solicitacoes_id": null,
2026-06-16T20:34:13.7679186Z         "status": "ativado",
2026-06-16T20:34:13.7679347Z         "terraform": true,
2026-06-16T20:34:13.7679484Z         "versao_imagem": null,
2026-06-16T20:34:13.7679594Z         "versao_plataforma": "7.1",
2026-06-16T20:34:13.7679741Z         "vm_dns": null,
2026-06-16T20:34:13.7679889Z         "vm_ipnetmask": null,
2026-06-16T20:34:13.7680029Z         "vm_ipnetmask_bck": null,
2026-06-16T20:34:13.7680167Z         "vsphere_folder": null,
2026-06-16T20:34:13.7680303Z         "vsphere_pool": null
2026-06-16T20:34:13.7680394Z     }
2026-06-16T20:34:13.7680512Z }
2026-06-16T20:34:13.7680769Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.039)       0:00:03.918 ********** 
2026-06-16T20:34:13.7987953Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.031)       0:00:03.950 ********** 
2026-06-16T20:34:13.8404450Z 
2026-06-16T20:34:13.8405090Z TASK [vm : Set size] ***********************************************************
2026-06-16T20:34:13.8405323Z ok: [127.0.0.1]
2026-06-16T20:34:13.8405821Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.041)       0:00:03.991 ********** 
2026-06-16T20:34:13.8735571Z 
2026-06-16T20:34:13.8736556Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-06-16T20:34:13.8737023Z ok: [127.0.0.1]
2026-06-16T20:34:13.8737360Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.033)       0:00:04.024 ********** 
2026-06-16T20:34:13.9046079Z 
2026-06-16T20:34:13.9047871Z TASK [vm : debug] **************************************************************
2026-06-16T20:34:13.9048060Z ok: [127.0.0.1] => {
2026-06-16T20:34:13.9048547Z     "template_name": "controlm-openjdk11-rhel79-v019"
2026-06-16T20:34:13.9048658Z }
2026-06-16T20:34:13.9048932Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.031)       0:00:04.055 ********** 
2026-06-16T20:34:13.9415602Z 
2026-06-16T20:34:13.9416367Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-06-16T20:34:13.9416666Z ok: [127.0.0.1]
2026-06-16T20:34:13.9416950Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.036)       0:00:04.092 ********** 
2026-06-16T20:34:13.9770800Z Tuesday 16 June 2026  17:34:13 -0300 (0:00:00.035)       0:00:04.128 ********** 
2026-06-16T20:34:14.3163508Z 
2026-06-16T20:34:14.3164355Z TASK [vm : Run Invetory All] ***************************************************
2026-06-16T20:34:14.3164749Z changed: [127.0.0.1]
2026-06-16T20:34:14.3165666Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.339)       0:00:04.467 ********** 
2026-06-16T20:34:14.3510472Z 
2026-06-16T20:34:14.3511328Z TASK [vm : Parse JSON output] **************************************************
2026-06-16T20:34:14.3511639Z ok: [127.0.0.1]
2026-06-16T20:34:14.3512300Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.034)       0:00:04.502 ********** 
2026-06-16T20:34:14.3907379Z 
2026-06-16T20:34:14.3909673Z TASK [vm : Count the number of hosts] ******************************************
2026-06-16T20:34:14.3909991Z ok: [127.0.0.1]
2026-06-16T20:34:14.3910608Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.039)       0:00:04.542 ********** 
2026-06-16T20:34:14.4276862Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.036)       0:00:04.578 ********** 
2026-06-16T20:34:14.4614304Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.033)       0:00:04.612 ********** 
2026-06-16T20:34:14.4966745Z 
2026-06-16T20:34:14.4967255Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-06-16T20:34:14.4967539Z ok: [127.0.0.1] => {
2026-06-16T20:34:14.4967847Z     "msg": [
2026-06-16T20:34:14.4967986Z         "num_hosts: 1"
2026-06-16T20:34:14.4968115Z     ]
2026-06-16T20:34:14.4968237Z }
2026-06-16T20:34:14.4968666Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.035)       0:00:04.648 ********** 
2026-06-16T20:34:14.5346470Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.037)       0:00:04.686 ********** 
2026-06-16T20:34:14.5764465Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.041)       0:00:04.727 ********** 
2026-06-16T20:34:14.6215996Z 
2026-06-16T20:34:14.6217161Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:14.6217785Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-06-16T20:34:14.6218148Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.045)       0:00:04.773 ********** 
2026-06-16T20:34:14.6597919Z 
2026-06-16T20:34:14.6598783Z TASK [vm : include_tasks] ******************************************************
2026-06-16T20:34:14.6599423Z included: /opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-06-16T20:34:14.6599744Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.038)       0:00:04.811 ********** 
2026-06-16T20:34:14.7007530Z 
2026-06-16T20:34:14.7009170Z TASK [vm : Criar variáveis] ****************************************************
2026-06-16T20:34:14.7009489Z ok: [127.0.0.1]
2026-06-16T20:34:14.7009852Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.040)       0:00:04.852 ********** 
2026-06-16T20:34:14.9280052Z 
2026-06-16T20:34:14.9281190Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-06-16T20:34:14.9281618Z ok: [127.0.0.1 -> localhost]
2026-06-16T20:34:14.9281931Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.227)       0:00:05.079 ********** 
2026-06-16T20:34:14.9607816Z 
2026-06-16T20:34:14.9609188Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-06-16T20:34:14.9609465Z ok: [127.0.0.1] => {
2026-06-16T20:34:14.9609698Z     "nfs_vars_json": {
2026-06-16T20:34:14.9609921Z         "changed": false,
2026-06-16T20:34:14.9610507Z         "cmd": "cat /opt/ads-agent/_work/r183/a/nfs_config.json",
2026-06-16T20:34:14.9610847Z         "delta": "0:00:00.005721",
2026-06-16T20:34:14.9611227Z         "end": "2026-06-16 17:34:14.894181",
2026-06-16T20:34:14.9611424Z         "failed": false,
2026-06-16T20:34:14.9611637Z         "msg": "",
2026-06-16T20:34:14.9611916Z         "rc": 0,
2026-06-16T20:34:14.9612233Z         "start": "2026-06-16 17:34:14.888460",
2026-06-16T20:34:14.9612466Z         "stderr": "",
2026-06-16T20:34:14.9612682Z         "stderr_lines": [],
2026-06-16T20:34:14.9613123Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sifof\"}]",
2026-06-16T20:34:14.9613609Z         "stdout_lines": [
2026-06-16T20:34:14.9613937Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sifof\"}]"
2026-06-16T20:34:14.9614227Z         ]
2026-06-16T20:34:14.9614407Z     }
2026-06-16T20:34:14.9614591Z }
2026-06-16T20:34:14.9614951Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.032)       0:00:05.112 ********** 
2026-06-16T20:34:14.9971525Z 
2026-06-16T20:34:14.9972665Z TASK [vm : Criar variáveis] ****************************************************
2026-06-16T20:34:14.9973107Z ok: [127.0.0.1]
2026-06-16T20:34:14.9974194Z Tuesday 16 June 2026  17:34:14 -0300 (0:00:00.036)       0:00:05.148 ********** 
2026-06-16T20:34:15.3247731Z 
2026-06-16T20:34:15.3254474Z TASK [vm : execute create_ip_bck script] ***************************************
2026-06-16T20:34:15.3257387Z fatal: [127.0.0.1]: FAILED! => {"changed": true, "cmd": ["python", "/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", "create_ip_bck", "sifof-batch", "des", "ctc_nprd", "/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2", "C&t@d02", "***", "s736651@corp.caixa.gov.br", "***", "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CESTI/SIFOF\",\"NFS_MOUNT_POINT_ISILON\": \"/apl/sifof\"}]"], "delta": "0:00:00.103381", "end": "2026-06-16 17:34:15.286511", "msg": "non-zero return code", "rc": 1, "start": "2026-06-16 17:34:15.183130", "stderr": "Traceback (most recent call last):\n  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 12, in <module>\n    import isi_sdk_8_1_1 as isilon\nModuleNotFoundError: No module named 'isi_sdk_8_1_1'", "stderr_lines": ["Traceback (most recent call last):", "  File \"/opt/ads-agent/_work/r183/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py\", line 12, in <module>", "    import isi_sdk_8_1_1 as isilon", "ModuleNotFoundError: No module named 'isi_sdk_8_1_1'"], "stdout": "", "stdout_lines": []}
2026-06-16T20:34:15.3258533Z 
2026-06-16T20:34:15.3258811Z PLAY RECAP *********************************************************************
2026-06-16T20:34:15.3259149Z 127.0.0.1                  : ok=32   changed=2    unreachable=0    failed=1    skipped=9    rescued=0    ignored=1   
2026-06-16T20:34:15.3259281Z 
2026-06-16T20:34:15.3259537Z Playbook run took 0 days, 0 hours, 0 minutes, 5 seconds
2026-06-16T20:34:15.3260061Z Tuesday 16 June 2026  17:34:15 -0300 (0:00:00.327)       0:00:05.476 ********** 
2026-06-16T20:34:15.3260397Z =============================================================================== 
2026-06-16T20:34:15.3260814Z Gathering Facts --------------------------------------------------------- 0.83s
2026-06-16T20:34:15.3261239Z vm : Instalar dependências Python para vCenter -------------------------- 0.83s
2026-06-16T20:34:15.3261601Z vm : Consultar API ------------------------------------------------------ 0.48s
2026-06-16T20:34:15.3262180Z vm : Executar script para marcar VM como template ----------------------- 0.36s
2026-06-16T20:34:15.3262594Z vm : Run Invetory All --------------------------------------------------- 0.34s
2026-06-16T20:34:15.3263169Z vm : Consultar API ------------------------------------------------------ 0.34s
2026-06-16T20:34:15.3263575Z vm : execute create_ip_bck script --------------------------------------- 0.33s
2026-06-16T20:34:15.3263984Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.30s
2026-06-16T20:34:15.3264405Z vm : Coletar variáveis de ambiente -------------------------------------- 0.23s
2026-06-16T20:34:15.3264779Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.20s
2026-06-16T20:34:15.3265181Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3265592Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3266042Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3266463Z vm : include_tasks ------------------------------------------------------ 0.05s
2026-06-16T20:34:15.3266867Z vm : Cria variável ansible ---------------------------------------------- 0.04s
2026-06-16T20:34:15.3267269Z vm : include_tasks ------------------------------------------------------ 0.04s
2026-06-16T20:34:15.3267627Z vm : include_tasks ------------------------------------------------------ 0.04s
2026-06-16T20:34:15.3268029Z vm : Set size ----------------------------------------------------------- 0.04s
2026-06-16T20:34:15.3268492Z vm : Criar variáveis ---------------------------------------------------- 0.04s
2026-06-16T20:34:15.3268901Z vm : Count the number of hosts ------------------------------------------ 0.04s
2026-06-16T20:34:15.5235888Z 
2026-06-16T20:34:15.5236436Z {
2026-06-16T20:34:15.5236774Z     "_meta": {
2026-06-16T20:34:15.5237259Z         "hostvars": {
2026-06-16T20:34:15.5237425Z             "caddeapllx2538.agil.nprd.caixa.gov.br": {
2026-06-16T20:34:15.5237618Z                 "ambiente": "des",
2026-06-16T20:34:15.5237733Z                 "ansible_host": "10.116.201.148",
2026-06-16T20:34:15.5238147Z                 "cluster": null,
2026-06-16T20:34:15.5238300Z                 "cluster_principal": null,
2026-06-16T20:34:15.5238699Z                 "cluster_terraform": null,
2026-06-16T20:34:15.5239136Z                 "cpu": 2,
2026-06-16T20:34:15.5239256Z                 "datacenter": null,
2026-06-16T20:34:15.5239433Z                 "datastore": null,
2026-06-16T20:34:15.5239574Z                 "detalhe_imagem": null,
2026-06-16T20:34:15.5239717Z                 "disco_log": 2,
2026-06-16T20:34:15.5240014Z                 "disco_opt": 10,
2026-06-16T20:34:15.5240157Z                 "domain": null,
2026-06-16T20:34:15.5240299Z                 "esx_network": null,
2026-06-16T20:34:15.5240409Z                 "esx_network_bck": null,
2026-06-16T20:34:15.5240632Z                 "esx_vcenter_server": null,
2026-06-16T20:34:15.5240880Z                 "farm": null,
2026-06-16T20:34:15.5241014Z                 "id": 13352,
2026-06-16T20:34:15.5241453Z                 "inclusao": "2026-06-05 18:02:45",
2026-06-16T20:34:15.5241622Z                 "info_framework": null,
2026-06-16T20:34:15.5241732Z                 "info_linguagem": null,
2026-06-16T20:34:15.5241875Z                 "info_tecnologia": null,
2026-06-16T20:34:15.5242020Z                 "info_versao": null,
2026-06-16T20:34:15.5242192Z                 "ipbackup": "192.168.242.148",
2026-06-16T20:34:15.5242343Z                 "jboss_apache_status": "ativado",
2026-06-16T20:34:15.5242483Z                 "memoria": 4,
2026-06-16T20:34:15.5242589Z                 "net_adapter_type": null,
2026-06-16T20:34:15.5242824Z                 "nome_imagem": null,
2026-06-16T20:34:15.5243043Z                 "objeto_origem": "SIFOF-BATCH_DES_SERVIDOR",
2026-06-16T20:34:15.5243218Z                 "plataforma": "vm",
2026-06-16T20:34:15.5243381Z                 "produto": "jboss",
2026-06-16T20:34:15.5243583Z                 "recursos_max_id": null,
2026-06-16T20:34:15.5243864Z                 "sistema": "sifof-batch",
2026-06-16T20:34:15.5244011Z                 "site": "ctc_nprd",
2026-06-16T20:34:15.5244160Z                 "solicitacoes_id": null,
2026-06-16T20:34:15.5244301Z                 "status": "ativado",
2026-06-16T20:34:15.5244438Z                 "terraform": true,
2026-06-16T20:34:15.5244545Z                 "versao_imagem": null,
2026-06-16T20:34:15.5244708Z                 "versao_plataforma": "7.1",
2026-06-16T20:34:15.5244869Z                 "vm_dns": null,
2026-06-16T20:34:15.5245008Z                 "vm_ipnetmask": null,
2026-06-16T20:34:15.5245152Z                 "vm_ipnetmask_bck": null,
2026-06-16T20:34:15.5245312Z                 "vsphere_folder": null,
2026-06-16T20:34:15.5245451Z                 "vsphere_pool": null
2026-06-16T20:34:15.5245547Z             }
2026-06-16T20:34:15.5245668Z         }
2026-06-16T20:34:15.5245798Z     },
2026-06-16T20:34:15.5245924Z     "ctc_nprd": {
2026-06-16T20:34:15.5246069Z         "children": [
2026-06-16T20:34:15.5246163Z             "jboss"
2026-06-16T20:34:15.5246281Z         ],
2026-06-16T20:34:15.5246406Z         "vars": {}
2026-06-16T20:34:15.5246521Z     },
2026-06-16T20:34:15.5246637Z     "des": {
2026-06-16T20:34:15.5246731Z         "children": [
2026-06-16T20:34:15.5246857Z             "local",
2026-06-16T20:34:15.5246991Z             "ctc_nprd"
2026-06-16T20:34:15.5247111Z         ],
2026-06-16T20:34:15.5247248Z         "vars": {}
2026-06-16T20:34:15.5247365Z     },
2026-06-16T20:34:15.5247452Z     "jboss": {
2026-06-16T20:34:15.5247575Z         "hosts": [
2026-06-16T20:34:15.5247722Z             "caddeapllx2538.agil.nprd.caixa.gov.br"
2026-06-16T20:34:15.5247861Z         ],
2026-06-16T20:34:15.5247991Z         "vars": {}
2026-06-16T20:34:15.5248073Z     },
2026-06-16T20:34:15.5248193Z     "local": {
2026-06-16T20:34:15.5248369Z         "hosts": [
2026-06-16T20:34:15.5248518Z             "127.0.0.1"
2026-06-16T20:34:15.5248710Z         ],
2026-06-16T20:34:15.5248798Z         "vars": {
2026-06-16T20:34:15.5248938Z             "ansible_connection": "local"
2026-06-16T20:34:15.5249068Z         }
2026-06-16T20:34:15.5249207Z     }
2026-06-16T20:34:15.5249324Z }
2026-06-16T20:34:15.5374693Z ##[error]Bash exited with code '1'.
2026-06-16T20:34:15.5389146Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)


me aqjuda a enterder porque que passou com ooutro agente me explica, para fechar aw.o

