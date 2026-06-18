eleza coloquei a variavel.. ele passou preom continua dando erro no ansible


2026-06-18T12:55:17.0960205Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-18T12:55:17.0963416Z ==============================================================================
2026-06-18T12:55:17.0963507Z Task         : Bash
2026-06-18T12:55:17.0963552Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-18T12:55:17.0963615Z Version      : 3.227.0
2026-06-18T12:55:17.0963670Z Author       : Microsoft Corporation
2026-06-18T12:55:17.0963723Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-18T12:55:17.0963797Z ==============================================================================
2026-06-18T12:55:17.2288380Z Generating script.
2026-06-18T12:55:17.2304047Z ========================== Starting Command Output ===========================
2026-06-18T12:55:17.2311246Z [command]/bin/bash /opt/ads-agent/_work/_temp/cf5ba96f-185c-4ecd-95c2-e6097332808b.sh
2026-06-18T12:55:18.6831453Z 
2026-06-18T12:55:18.6832226Z PLAY [local] *******************************************************************
2026-06-18T12:55:18.7085784Z Thursday 18 June 2026  09:55:18 -0300 (0:00:00.028)       0:00:00.028 ********* 
2026-06-18T12:55:21.2093735Z 
2026-06-18T12:55:21.2094244Z TASK [Gathering Facts] *********************************************************
2026-06-18T12:55:21.2096130Z fatal: [127.0.0.1]: FAILED! => {"ansible_facts": {}, "changed": false, "failed_modules": {"ansible.legacy.setup": {"ansible_facts": {"discovered_interpreter_python": "/usr/bin/python"}, "failed": true, "module_stderr": "\nPresumimos que você recebeu as instruções de sempre do administrador\nde sistema local. Basicamente, resume-se a estas três coisas:\n\n    #1) Respeite a privacidade dos outros.\n    #2) Pense antes de digitar.\n    #3) Com grandes poderes vêm grandes responsabilidades.\n\nsudo: nenhum tty presente e nenhum programa de askpass especificado\n", "module_stdout": "", "msg": "MODULE FAILURE\nSee stdout/stderr for the exact error", "rc": 1}}, "msg": "The following modules failed to execute: ansible.legacy.setup\n"}
2026-06-18T12:55:21.2104768Z 
2026-06-18T12:55:21.2104948Z PLAY RECAP *********************************************************************
2026-06-18T12:55:21.2107746Z 127.0.0.1                  : ok=0    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-06-18T12:55:21.2107823Z 
2026-06-18T12:55:21.2107957Z Playbook run took 0 days, 0 hours, 0 minutes, 2 seconds
2026-06-18T12:55:21.2108247Z Thursday 18 June 2026  09:55:21 -0300 (0:00:02.502)       0:00:02.531 ********* 
2026-06-18T12:55:21.2108434Z =============================================================================== 
2026-06-18T12:55:21.2108662Z Gathering Facts --------------------------------------------------------- 2.50s
2026-06-18T12:55:21.4352177Z 
2026-06-18T12:55:21.4352542Z {
2026-06-18T12:55:21.4352645Z     "_meta": {
2026-06-18T12:55:21.4352747Z         "hostvars": {
2026-06-18T12:55:21.4352862Z             "caddeapllx2598.agil.nprd.caixa.gov.br": {
2026-06-18T12:55:21.4352988Z                 "ambiente": "tqs",
2026-06-18T12:55:21.4353116Z                 "ansible_host": "10.116.201.157",
2026-06-18T12:55:21.4354317Z                 "cluster": null,
2026-06-18T12:55:21.4354480Z                 "cluster_principal": null,
2026-06-18T12:55:21.4354591Z                 "cluster_terraform": null,
2026-06-18T12:55:21.4354692Z                 "cpu": 2,
2026-06-18T12:55:21.4354806Z                 "datacenter": null,
2026-06-18T12:55:21.4355332Z                 "datastore": null,
2026-06-18T12:55:21.4355448Z                 "detalhe_imagem": null,
2026-06-18T12:55:21.4355554Z                 "disco_log": 2,
2026-06-18T12:55:21.4355663Z                 "disco_opt": 10,
2026-06-18T12:55:21.4355760Z                 "domain": null,
2026-06-18T12:55:21.4355860Z                 "esx_network": null,
2026-06-18T12:55:21.4355955Z                 "esx_network_bck": null,
2026-06-18T12:55:21.4356062Z                 "esx_vcenter_server": null,
2026-06-18T12:55:21.4356164Z                 "farm": null,
2026-06-18T12:55:21.4356548Z                 "id": 13421,
2026-06-18T12:55:21.4357059Z                 "inclusao": "2026-06-17 15:35:38",
2026-06-18T12:55:21.4357189Z                 "info_framework": null,
2026-06-18T12:55:21.4357297Z                 "info_linguagem": null,
2026-06-18T12:55:21.4357403Z                 "info_tecnologia": null,
2026-06-18T12:55:21.4357509Z                 "info_versao": null,
2026-06-18T12:55:21.4357597Z                 "ipbackup": "",
2026-06-18T12:55:21.4357707Z                 "jboss_apache_status": "ativado",
2026-06-18T12:55:21.4357812Z                 "memoria": 4,
2026-06-18T12:55:21.4357913Z                 "net_adapter_type": null,
2026-06-18T12:55:21.4358021Z                 "nome_imagem": null,
2026-06-18T12:55:21.4358227Z                 "objeto_origem": "ECAPT-BANCARIO_TQS_SERVIDOR",
2026-06-18T12:55:21.4358337Z                 "plataforma": "vm",
2026-06-18T12:55:21.4358439Z                 "produto": "jboss",
2026-06-18T12:55:21.4358540Z                 "recursos_max_id": null,
2026-06-18T12:55:21.4358698Z                 "sistema": "ecapt-bancario",
2026-06-18T12:55:21.4358795Z                 "site": "ctc_nprd",
2026-06-18T12:55:21.4358898Z                 "solicitacoes_id": null,
2026-06-18T12:55:21.4359000Z                 "status": "ativado",
2026-06-18T12:55:21.4359098Z                 "terraform": true,
2026-06-18T12:55:21.4359201Z                 "versao_imagem": null,
2026-06-18T12:55:21.4359301Z                 "versao_plataforma": "7.1",
2026-06-18T12:55:21.4359405Z                 "vm_dns": null,
2026-06-18T12:55:21.4359502Z                 "vm_ipnetmask": null,
2026-06-18T12:55:21.4359606Z                 "vm_ipnetmask_bck": null,
2026-06-18T12:55:21.4359706Z                 "vsphere_folder": null,
2026-06-18T12:55:21.4359810Z                 "vsphere_pool": null
2026-06-18T12:55:21.4359897Z             }
2026-06-18T12:55:21.4359979Z         }
2026-06-18T12:55:21.4360061Z     },
2026-06-18T12:55:21.4360141Z     "ctc_nprd": {
2026-06-18T12:55:21.4360237Z         "children": [
2026-06-18T12:55:21.4360330Z             "jboss"
2026-06-18T12:55:21.4360415Z         ],
2026-06-18T12:55:21.4360494Z         "vars": {}
2026-06-18T12:55:21.4360576Z     },
2026-06-18T12:55:21.4360660Z     "jboss": {
2026-06-18T12:55:21.4360748Z         "hosts": [
2026-06-18T12:55:21.4360842Z             "caddeapllx2598.agil.nprd.caixa.gov.br"
2026-06-18T12:55:21.4360943Z         ],
2026-06-18T12:55:21.4361027Z         "vars": {}
2026-06-18T12:55:21.4361109Z     },
2026-06-18T12:55:21.4361186Z     "local": {
2026-06-18T12:55:21.4361276Z         "hosts": [
2026-06-18T12:55:21.4361364Z             "127.0.0.1"
2026-06-18T12:55:21.4361451Z         ],
2026-06-18T12:55:21.4361536Z         "vars": {
2026-06-18T12:55:21.4361627Z             "ansible_connection": "local"
2026-06-18T12:55:21.4361721Z         }
2026-06-18T12:55:21.4361798Z     },
2026-06-18T12:55:21.4361879Z     "tqs": {
2026-06-18T12:55:21.4361960Z         "children": [
2026-06-18T12:55:21.4362054Z             "local",
2026-06-18T12:55:21.4362149Z             "ctc_nprd"
2026-06-18T12:55:21.4362237Z         ],
2026-06-18T12:55:21.4362316Z         "vars": {}
2026-06-18T12:55:21.4362398Z     }
2026-06-18T12:55:21.4362477Z }
2026-06-18T12:55:21.4506478Z ##[error]Bash exited with code '1'.
2026-06-18T12:55:21.4509283Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
