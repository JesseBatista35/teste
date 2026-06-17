2026-06-17T19:17:28.3238723Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-17T19:17:28.3242334Z ==============================================================================
2026-06-17T19:17:28.3242430Z Task         : Bash
2026-06-17T19:17:28.3242473Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-17T19:17:28.3242537Z Version      : 3.227.0
2026-06-17T19:17:28.3242588Z Author       : Microsoft Corporation
2026-06-17T19:17:28.3242639Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-17T19:17:28.3242711Z ==============================================================================
2026-06-17T19:17:28.4598895Z Generating script.
2026-06-17T19:17:28.4612405Z ========================== Starting Command Output ===========================
2026-06-17T19:17:28.4622018Z [command]/bin/bash /opt/ads-agent/_work/_temp/7e2e0d9a-6870-4365-a327-25bd15e1d44f.sh
2026-06-17T19:17:28.4699879Z /opt/ads-agent/_work/_temp/7e2e0d9a-6870-4365-a327-25bd15e1d44f.sh: line 4: tf_var_quant: comando não encontrado
2026-06-17T19:17:29.4654106Z 
2026-06-17T19:17:29.4654671Z PLAY [local] *******************************************************************
2026-06-17T19:17:29.4757197Z Wednesday 17 June 2026  16:17:29 -0300 (0:00:00.012)       0:00:00.012 ******** 
2026-06-17T19:17:31.2982606Z 
2026-06-17T19:17:31.2983268Z TASK [Gathering Facts] *********************************************************
2026-06-17T19:17:31.2984982Z fatal: [127.0.0.1]: FAILED! => {"ansible_facts": {}, "changed": false, "failed_modules": {"ansible.legacy.setup": {"ansible_facts": {"discovered_interpreter_python": "/usr/bin/python"}, "failed": true, "module_stderr": "\nPresumimos que você recebeu as instruções de sempre do administrador\nde sistema local. Basicamente, resume-se a estas três coisas:\n\n    #1) Respeite a privacidade dos outros.\n    #2) Pense antes de digitar.\n    #3) Com grandes poderes vêm grandes responsabilidades.\n\nsudo: nenhum tty presente e nenhum programa de askpass especificado\n", "module_stdout": "", "msg": "MODULE FAILURE\nSee stdout/stderr for the exact error", "rc": 1}}, "msg": "The following modules failed to execute: ansible.legacy.setup\n"}
2026-06-17T19:17:31.2993607Z 
2026-06-17T19:17:31.2993968Z PLAY RECAP *********************************************************************
2026-06-17T19:17:31.2994229Z 127.0.0.1                  : ok=0    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-06-17T19:17:31.2994344Z 
2026-06-17T19:17:31.2994514Z Playbook run took 0 days, 0 hours, 0 minutes, 1 seconds
2026-06-17T19:17:31.2994947Z Wednesday 17 June 2026  16:17:31 -0300 (0:00:01.824)       0:00:01.836 ******** 
2026-06-17T19:17:31.2995169Z =============================================================================== 
2026-06-17T19:17:31.2995500Z Gathering Facts --------------------------------------------------------- 1.82s
2026-06-17T19:17:31.5521188Z 
2026-06-17T19:17:31.5521788Z {
2026-06-17T19:17:31.5521971Z     "_meta": {
2026-06-17T19:17:31.5522184Z         "hostvars": {
2026-06-17T19:17:31.5522379Z             "caddeapllx2598.agil.nprd.caixa.gov.br": {
2026-06-17T19:17:31.5522681Z                 "ambiente": "tqs",
2026-06-17T19:17:31.5522840Z                 "ansible_host": "10.116.201.157",
2026-06-17T19:17:31.5523008Z                 "cluster": null,
2026-06-17T19:17:31.5523175Z                 "cluster_principal": null,
2026-06-17T19:17:31.5523349Z                 "cluster_terraform": null,
2026-06-17T19:17:31.5523504Z                 "cpu": 2,
2026-06-17T19:17:31.5523650Z                 "datacenter": null,
2026-06-17T19:17:31.5523811Z                 "datastore": null,
2026-06-17T19:17:31.5523975Z                 "detalhe_imagem": null,
2026-06-17T19:17:31.5524135Z                 "disco_log": 2,
2026-06-17T19:17:31.5524295Z                 "disco_opt": 10,
2026-06-17T19:17:31.5524437Z                 "domain": null,
2026-06-17T19:17:31.5524595Z                 "esx_network": null,
2026-06-17T19:17:31.5524755Z                 "esx_network_bck": null,
2026-06-17T19:17:31.5525300Z                 "esx_vcenter_server": null,
2026-06-17T19:17:31.5525408Z                 "farm": null,
2026-06-17T19:17:31.5525496Z                 "id": 13421,
2026-06-17T19:17:31.5525819Z                 "inclusao": "2026-06-17 15:35:38",
2026-06-17T19:17:31.5525947Z                 "info_framework": null,
2026-06-17T19:17:31.5526058Z                 "info_linguagem": null,
2026-06-17T19:17:31.5526178Z                 "info_tecnologia": null,
2026-06-17T19:17:31.5526327Z                 "info_versao": null,
2026-06-17T19:17:31.5526483Z                 "ipbackup": "",
2026-06-17T19:17:31.5526598Z                 "jboss_apache_status": "ativado",
2026-06-17T19:17:31.5526708Z                 "memoria": 4,
2026-06-17T19:17:31.5526814Z                 "net_adapter_type": null,
2026-06-17T19:17:31.5527320Z                 "nome_imagem": null,
2026-06-17T19:17:31.5527510Z                 "objeto_origem": "ECAPT-BANCARIO_TQS_SERVIDOR",
2026-06-17T19:17:31.5527639Z                 "plataforma": "vm",
2026-06-17T19:17:31.5527748Z                 "produto": "jboss",
2026-06-17T19:17:31.5527853Z                 "recursos_max_id": null,
2026-06-17T19:17:31.5528043Z                 "sistema": "ecapt-bancario",
2026-06-17T19:17:31.5528145Z                 "site": "ctc_nprd",
2026-06-17T19:17:31.5528251Z                 "solicitacoes_id": null,
2026-06-17T19:17:31.5528359Z                 "status": "ativado",
2026-06-17T19:17:31.5528465Z                 "terraform": true,
2026-06-17T19:17:31.5528605Z                 "versao_imagem": null,
2026-06-17T19:17:31.5528742Z                 "versao_plataforma": "7.1",
2026-06-17T19:17:31.5528895Z                 "vm_dns": null,
2026-06-17T19:17:31.5529047Z                 "vm_ipnetmask": null,
2026-06-17T19:17:31.5529315Z                 "vm_ipnetmask_bck": null,
2026-06-17T19:17:31.5529468Z                 "vsphere_folder": null,
2026-06-17T19:17:31.5529600Z                 "vsphere_pool": null
2026-06-17T19:17:31.5529733Z             }
2026-06-17T19:17:31.5529853Z         }
2026-06-17T19:17:31.5529967Z     },
2026-06-17T19:17:31.5530096Z     "ctc_nprd": {
2026-06-17T19:17:31.5530228Z         "children": [
2026-06-17T19:17:31.5530374Z             "jboss"
2026-06-17T19:17:31.5530490Z         ],
2026-06-17T19:17:31.5530583Z         "vars": {}
2026-06-17T19:17:31.5530661Z     },
2026-06-17T19:17:31.5530752Z     "jboss": {
2026-06-17T19:17:31.5530845Z         "hosts": [
2026-06-17T19:17:31.5530955Z             "caddeapllx2598.agil.nprd.caixa.gov.br"
2026-06-17T19:17:31.5531061Z         ],
2026-06-17T19:17:31.5531141Z         "vars": {}
2026-06-17T19:17:31.5531229Z     },
2026-06-17T19:17:31.5531318Z     "local": {
2026-06-17T19:17:31.5531409Z         "hosts": [
2026-06-17T19:17:31.5531502Z             "127.0.0.1"
2026-06-17T19:17:31.5531587Z         ],
2026-06-17T19:17:31.5531680Z         "vars": {
2026-06-17T19:17:31.5531785Z             "ansible_connection": "local"
2026-06-17T19:17:31.5531881Z         }
2026-06-17T19:17:31.5531964Z     },
2026-06-17T19:17:31.5532045Z     "tqs": {
2026-06-17T19:17:31.5532137Z         "children": [
2026-06-17T19:17:31.5532230Z             "local",
2026-06-17T19:17:31.5532323Z             "ctc_nprd"
2026-06-17T19:17:31.5532403Z         ],
2026-06-17T19:17:31.5532491Z         "vars": {}
2026-06-17T19:17:31.5532578Z     }
2026-06-17T19:17:31.5532661Z }
2026-06-17T19:17:31.5715309Z ##[error]Bash exited with code '1'.
2026-06-17T19:17:31.5720246Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
