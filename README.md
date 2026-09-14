2026-09-14T19:53:07.5088140Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-09-14T19:53:07.5091015Z ==============================================================================
2026-09-14T19:53:07.5091095Z Task         : Bash
2026-09-14T19:53:07.5091144Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-14T19:53:07.5091300Z Version      : 3.227.0
2026-09-14T19:53:07.5091348Z Author       : Microsoft Corporation
2026-09-14T19:53:07.5091409Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-14T19:53:07.5091485Z ==============================================================================
2026-09-14T19:53:08.3515678Z Generating script.
2026-09-14T19:53:08.3530303Z ========================== Starting Command Output ===========================
2026-09-14T19:53:08.3533417Z [command]/bin/bash /opt/ads-agent/_work/_temp/f98d980c-bab7-498f-a20a-c5fb6933bb7a.sh
2026-09-14T19:53:09.0338485Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r5660/a/esteira-jboss-
2026-09-14T19:53:09.0339030Z vm-v2/inventory/inventory_portal.py with script plugin: Invalid empty host name
2026-09-14T19:53:09.0339202Z provided:
2026-09-14T19:53:09.0339596Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r5660/a/esteira-jboss-
2026-09-14T19:53:09.0339848Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-09-14T19:53:09.0340139Z agent/_work/r5660/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-09-14T19:53:09.0340373Z Expected key=value host variable assignment, got: os
2026-09-14T19:53:09.0340684Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r5660/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-09-14T19:53:09.2211929Z 
2026-09-14T19:53:09.2212698Z {
2026-09-14T19:53:09.2213485Z     "_meta": {
2026-09-14T19:53:09.2213646Z         "hostvars": {
2026-09-14T19:53:09.2213757Z             "": {
2026-09-14T19:53:09.2213870Z                 "ambiente": "des",
2026-09-14T19:53:09.2213992Z                 "ansible_host": "",
2026-09-14T19:53:09.2214138Z                 "cluster": "CTC_NPRDXF2488HV7_NPRD",
2026-09-14T19:53:09.2214277Z                 "cluster_principal": "",
2026-09-14T19:53:09.2215355Z                 "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD",
2026-09-14T19:53:09.2217022Z                 "cpu": 4,
2026-09-14T19:53:09.2218880Z                 "datacenter": "NPRD",
2026-09-14T19:53:09.2220550Z                 "datastore": "CTCHWNPRDPC03_0047",
2026-09-14T19:53:09.2222215Z                 "detalhe_imagem": null,
2026-09-14T19:53:09.2224382Z                 "disco_log": 2,
2026-09-14T19:53:09.2226063Z                 "disco_opt": 10,
2026-09-14T19:53:09.2228202Z                 "domain": "agil.nprd.caixa.gov.br",
2026-09-14T19:53:09.2229735Z                 "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0",
2026-09-14T19:53:09.2230228Z                 "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep",
2026-09-14T19:53:09.2230693Z                 "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep",
2026-09-14T19:53:09.2231624Z                 "esx_vcenter_server": "10.122.144.195",
2026-09-14T19:53:09.2231940Z                 "farm": null,
2026-09-14T19:53:09.2232182Z                 "id": 2128,
2026-09-14T19:53:09.2232570Z                 "inclusao": "2021-12-10 15:47:02",
2026-09-14T19:53:09.2232814Z                 "info_framework": null,
2026-09-14T19:53:09.2233067Z                 "info_linguagem": null,
2026-09-14T19:53:09.2233292Z                 "info_tecnologia": null,
2026-09-14T19:53:09.2233519Z                 "info_versao": null,
2026-09-14T19:53:09.2233746Z                 "ipbackup": "",
2026-09-14T19:53:09.2233994Z                 "jboss_apache_status": "ativado",
2026-09-14T19:53:09.2234228Z                 "memoria": 8,
2026-09-14T19:53:09.2234457Z                 "net_adapter_type": "vmxnet3",
2026-09-14T19:53:09.2234711Z                 "nome_imagem": null,
2026-09-14T19:53:09.2235021Z                 "objeto_origem": "SIIFX-CONTROLM_DES__SERVIDOR",
2026-09-14T19:53:09.2235601Z                 "plataforma": "vm",
2026-09-14T19:53:09.2235828Z                 "produto": "jboss",
2026-09-14T19:53:09.2236074Z                 "recursos_max_id": null,
2026-09-14T19:53:09.2236354Z                 "sistema": "siifx-batch-vm",
2026-09-14T19:53:09.2236586Z                 "site": "ctc_nprd",
2026-09-14T19:53:09.2236891Z                 "solicitacoes_id": 4924,
2026-09-14T19:53:09.2237119Z                 "status": "ativado",
2026-09-14T19:53:09.2237340Z                 "terraform": true,
2026-09-14T19:53:09.2237563Z                 "versao_imagem": null,
2026-09-14T19:53:09.2237808Z                 "versao_plataforma": "1.0",
2026-09-14T19:53:09.2238154Z                 "vm_dns": [
2026-09-14T19:53:09.2238378Z                     "10.116.193.77",
2026-09-14T19:53:09.2238598Z                     "10.116.193.78"
2026-09-14T19:53:09.2238827Z                 ],
2026-09-14T19:53:09.2239044Z                 "vm_ipnetmask": 19,
2026-09-14T19:53:09.2239272Z                 "vm_ipnetmask_bck": 19,
2026-09-14T19:53:09.2239506Z                 "vm_ipnetmask_bck_01": 16,
2026-09-14T19:53:09.2239748Z                 "vsphere_folder": "/vm",
2026-09-14T19:53:09.2239982Z                 "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-09-14T19:53:09.2240209Z             }
2026-09-14T19:53:09.2240412Z         }
2026-09-14T19:53:09.2240624Z     },
2026-09-14T19:53:09.2240852Z     "ctc_nprd": {
2026-09-14T19:53:09.2241066Z         "children": [
2026-09-14T19:53:09.2241282Z             "jboss"
2026-09-14T19:53:09.2241490Z         ],
2026-09-14T19:53:09.2241715Z         "vars": {}
2026-09-14T19:53:09.2241921Z     },
2026-09-14T19:53:09.2242126Z     "des": {
2026-09-14T19:53:09.2242338Z         "children": [
2026-09-14T19:53:09.2242563Z             "local",
2026-09-14T19:53:09.2242777Z             "ctc_nprd"
2026-09-14T19:53:09.2242975Z         ],
2026-09-14T19:53:09.2243198Z         "vars": {}
2026-09-14T19:53:09.2243404Z     },
2026-09-14T19:53:09.2243611Z     "jboss": {
2026-09-14T19:53:09.2243820Z         "hosts": [
2026-09-14T19:53:09.2244042Z             ""
2026-09-14T19:53:09.2244244Z         ],
2026-09-14T19:53:09.2244449Z         "vars": {}
2026-09-14T19:53:09.2244664Z     },
2026-09-14T19:53:09.2244871Z     "local": {
2026-09-14T19:53:09.2245075Z         "hosts": [
2026-09-14T19:53:09.2245286Z             "127.0.0.1"
2026-09-14T19:53:09.2245509Z         ],
2026-09-14T19:53:09.2246174Z         "vars": {
2026-09-14T19:53:09.2246420Z             "ansible_connection": "local"
2026-09-14T19:53:09.2246652Z         }
2026-09-14T19:53:09.2246850Z     }
2026-09-14T19:53:09.2247051Z }
2026-09-14T19:53:09.2360060Z ##[error]Bash exited with code '1'.
2026-09-14T19:53:09.2371650Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)
