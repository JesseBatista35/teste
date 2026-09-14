2026-09-14T19:41:41.9851606Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-09-14T19:41:41.9854737Z ==============================================================================
2026-09-14T19:41:41.9854819Z Task         : Bash
2026-09-14T19:41:41.9854864Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-14T19:41:41.9854939Z Version      : 3.227.0
2026-09-14T19:41:41.9854987Z Author       : Microsoft Corporation
2026-09-14T19:41:41.9855049Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-14T19:41:41.9855126Z ==============================================================================
2026-09-14T19:41:42.7124538Z Generating script.
2026-09-14T19:41:42.7134624Z ========================== Starting Command Output ===========================
2026-09-14T19:41:42.7145686Z [command]/bin/bash /opt/ads-agent/_work/_temp/0ed2ffb7-9fa7-44c8-aa6a-2acb2585f85e.sh
2026-09-14T19:41:42.7250173Z /opt/ads-agent/_work/_temp/0ed2ffb7-9fa7-44c8-aa6a-2acb2585f85e.sh: line 4: tf_var_quant: comando não encontrado
2026-09-14T19:41:43.3941969Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r15347/a/esteira-jboss-
2026-09-14T19:41:43.3942535Z vm-v2/inventory/inventory_portal.py with script plugin: Invalid empty host name
2026-09-14T19:41:43.3943068Z provided:
2026-09-14T19:41:43.3943426Z [WARNING]:  * Failed to parse /opt/ads-agent/_work/r15347/a/esteira-jboss-
2026-09-14T19:41:43.3943666Z vm-v2/inventory/inventory_portal.py with ini plugin: /opt/ads-
2026-09-14T19:41:43.3943928Z agent/_work/r15347/a/esteira-jboss-vm-v2/inventory/inventory_portal.py:2:
2026-09-14T19:41:43.3944099Z Expected key=value host variable assignment, got: os
2026-09-14T19:41:43.3944384Z ERROR! Completely failed to parse inventory source /opt/ads-agent/_work/r15347/a/esteira-jboss-vm-v2/inventory/inventory_portal.py
2026-09-14T19:41:43.5606813Z 
2026-09-14T19:41:43.5607599Z {
2026-09-14T19:41:43.5608196Z     "_meta": {
2026-09-14T19:41:43.5608357Z         "hostvars": {
2026-09-14T19:41:43.5608465Z             "": {
2026-09-14T19:41:43.5608584Z                 "ambiente": "des",
2026-09-14T19:41:43.5608705Z                 "ansible_host": "",
2026-09-14T19:41:43.5608830Z                 "cluster": "CTC_NPRDXF2488HV7_NPRD",
2026-09-14T19:41:43.5608964Z                 "cluster_principal": "",
2026-09-14T19:41:43.5610628Z                 "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD",
2026-09-14T19:41:43.5610757Z                 "cpu": 4,
2026-09-14T19:41:43.5610876Z                 "datacenter": "NPRD",
2026-09-14T19:41:43.5611002Z                 "datastore": "CTCHWNPRDPC03_0047",
2026-09-14T19:41:43.5611127Z                 "detalhe_imagem": null,
2026-09-14T19:41:43.5611240Z                 "disco_log": 2,
2026-09-14T19:41:43.5611346Z                 "disco_opt": 10,
2026-09-14T19:41:43.5611466Z                 "domain": "agil.nprd.caixa.gov.br",
2026-09-14T19:41:43.5611804Z                 "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0",
2026-09-14T19:41:43.5612023Z                 "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep",
2026-09-14T19:41:43.5612257Z                 "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep",
2026-09-14T19:41:43.5612406Z                 "esx_vcenter_server": "10.122.144.195",
2026-09-14T19:41:43.5612524Z                 "farm": null,
2026-09-14T19:41:43.5612629Z                 "id": 61599,
2026-09-14T19:41:43.5612810Z                 "inclusao": "2026-09-02 14:45:22",
2026-09-14T19:41:43.5612937Z                 "info_framework": null,
2026-09-14T19:41:43.5613053Z                 "info_linguagem": null,
2026-09-14T19:41:43.5613168Z                 "info_tecnologia": null,
2026-09-14T19:41:43.5613282Z                 "info_versao": null,
2026-09-14T19:41:43.5613390Z                 "ipbackup": null,
2026-09-14T19:41:43.5613509Z                 "jboss_apache_status": "ativado",
2026-09-14T19:41:43.5613629Z                 "memoria": 8,
2026-09-14T19:41:43.5613747Z                 "net_adapter_type": "vmxnet3",
2026-09-14T19:41:43.5613866Z                 "nome_imagem": null,
2026-09-14T19:41:43.5614318Z                 "objeto_origem": null,
2026-09-14T19:41:43.5614436Z                 "plataforma": "vm",
2026-09-14T19:41:43.5614546Z                 "produto": "jboss",
2026-09-14T19:41:43.5614657Z                 "recursos_max_id": null,
2026-09-14T19:41:43.5614828Z                 "sistema": "siifx-batch-vm",
2026-09-14T19:41:43.5614945Z                 "site": "ctc_nprd",
2026-09-14T19:41:43.5615060Z                 "solicitacoes_id": null,
2026-09-14T19:41:43.5615175Z                 "status": "ativado",
2026-09-14T19:41:43.5615369Z                 "terraform": true,
2026-09-14T19:41:43.5615484Z                 "versao_imagem": null,
2026-09-14T19:41:43.5615605Z                 "versao_plataforma": null,
2026-09-14T19:41:43.5615714Z                 "vm_dns": [
2026-09-14T19:41:43.5615907Z                     "10.116.193.77",
2026-09-14T19:41:43.5616018Z                     "10.116.193.78"
2026-09-14T19:41:43.5616119Z                 ],
2026-09-14T19:41:43.5616229Z                 "vm_ipnetmask": 19,
2026-09-14T19:41:43.5616344Z                 "vm_ipnetmask_bck": 19,
2026-09-14T19:41:43.5616466Z                 "vm_ipnetmask_bck_01": 16,
2026-09-14T19:41:43.5616587Z                 "vsphere_folder": "/vm",
2026-09-14T19:41:43.5616715Z                 "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-09-14T19:41:43.5616831Z             },
2026-09-14T19:41:43.5616949Z             "caddeapllx1214.agil.nprd.caixa.gov.br": {
2026-09-14T19:41:43.5617079Z                 "ambiente": "des",
2026-09-14T19:41:43.5617196Z                 "ansible_host": "10.116.195.38",
2026-09-14T19:41:43.5617321Z                 "cluster": "CTC_NPRDXF2488HV7_NPRD",
2026-09-14T19:41:43.5617442Z                 "cluster_principal": "",
2026-09-14T19:41:43.5617565Z                 "cluster_terraform": "CTC_NPRDXF2488HV7_NPRD",
2026-09-14T19:41:43.5617691Z                 "cpu": 4,
2026-09-14T19:41:43.5617798Z                 "datacenter": "NPRD",
2026-09-14T19:41:43.5617912Z                 "datastore": "CTCHWNPRDPC03_0047",
2026-09-14T19:41:43.5618032Z                 "detalhe_imagem": null,
2026-09-14T19:41:43.5618149Z                 "disco_log": 2,
2026-09-14T19:41:43.5618256Z                 "disco_opt": 10,
2026-09-14T19:41:43.5618372Z                 "domain": "agil.nprd.caixa.gov.br",
2026-09-14T19:41:43.5618590Z                 "esx_network": "tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0",
2026-09-14T19:41:43.5618807Z                 "esx_network_bck": "tn-NPRD|NPRD_BKP-ap|VL3697-ep",
2026-09-14T19:41:43.5619021Z                 "esx_network_bck_01": "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep",
2026-09-14T19:41:43.5619244Z                 "esx_vcenter_server": "10.122.144.195",
2026-09-14T19:41:43.5619371Z                 "farm": null,
2026-09-14T19:41:43.5619478Z                 "id": 2128,
2026-09-14T19:41:43.5619657Z                 "inclusao": "2021-12-10 15:47:02",
2026-09-14T19:41:43.5619781Z                 "info_framework": null,
2026-09-14T19:41:43.5619900Z                 "info_linguagem": null,
2026-09-14T19:41:43.5620024Z                 "info_tecnologia": null,
2026-09-14T19:41:43.5620139Z                 "info_versao": null,
2026-09-14T19:41:43.5620262Z                 "ipbackup": "192.168.231.137,10.188.254.113",
2026-09-14T19:41:43.5620393Z                 "jboss_apache_status": "ativado",
2026-09-14T19:41:43.5620509Z                 "memoria": 8,
2026-09-14T19:41:43.5620623Z                 "net_adapter_type": "vmxnet3",
2026-09-14T19:41:43.5620740Z                 "nome_imagem": null,
2026-09-14T19:41:43.5620911Z                 "objeto_origem": "SIIFX-CONTROLM_DES__SERVIDOR",
2026-09-14T19:41:43.5621036Z                 "plataforma": "vm",
2026-09-14T19:41:43.5621152Z                 "produto": "jboss",
2026-09-14T19:41:43.5621263Z                 "recursos_max_id": null,
2026-09-14T19:41:43.5621427Z                 "sistema": "siifx-batch-vm",
2026-09-14T19:41:43.5621547Z                 "site": "ctc_nprd",
2026-09-14T19:41:43.5621660Z                 "solicitacoes_id": 4924,
2026-09-14T19:41:43.5621849Z                 "status": "ativado",
2026-09-14T19:41:43.5621961Z                 "terraform": true,
2026-09-14T19:41:43.5622073Z                 "versao_imagem": null,
2026-09-14T19:41:43.5622191Z                 "versao_plataforma": "1.0",
2026-09-14T19:41:43.5622304Z                 "vm_dns": [
2026-09-14T19:41:43.5622410Z                     "10.116.193.77",
2026-09-14T19:41:43.5622517Z                     "10.116.193.78"
2026-09-14T19:41:43.5622617Z                 ],
2026-09-14T19:41:43.5622721Z                 "vm_ipnetmask": 19,
2026-09-14T19:41:43.5624204Z                 "vm_ipnetmask_bck": 19,
2026-09-14T19:41:43.5624335Z                 "vm_ipnetmask_bck_01": 16,
2026-09-14T19:41:43.5624492Z                 "vsphere_folder": "/vm",
2026-09-14T19:41:43.5624621Z                 "vsphere_pool": "/Resources/RP_TERRAFORM_NPRD"
2026-09-14T19:41:43.5624800Z             }
2026-09-14T19:41:43.5624900Z         }
2026-09-14T19:41:43.5624997Z     },
2026-09-14T19:41:43.5625103Z     "ctc_nprd": {
2026-09-14T19:41:43.5625210Z         "children": [
2026-09-14T19:41:43.5625316Z             "jboss"
2026-09-14T19:41:43.5625412Z         ],
2026-09-14T19:41:43.5625512Z         "vars": {}
2026-09-14T19:41:43.5625603Z     },
2026-09-14T19:41:43.5625691Z     "des": {
2026-09-14T19:41:43.5625791Z         "children": [
2026-09-14T19:41:43.5625894Z             "local",
2026-09-14T19:41:43.5625995Z             "ctc_nprd"
2026-09-14T19:41:43.5626090Z         ],
2026-09-14T19:41:43.5626186Z         "vars": {}
2026-09-14T19:41:43.5626276Z     },
2026-09-14T19:41:43.5626373Z     "jboss": {
2026-09-14T19:41:43.5626471Z         "hosts": [
2026-09-14T19:41:43.5626567Z             "",
2026-09-14T19:41:43.5626684Z             "caddeapllx1214.agil.nprd.caixa.gov.br"
2026-09-14T19:41:43.5626804Z         ],
2026-09-14T19:41:43.5626902Z         "vars": {}
2026-09-14T19:41:43.5626994Z     },
2026-09-14T19:41:43.5627090Z     "local": {
2026-09-14T19:41:43.5627179Z         "hosts": [
2026-09-14T19:41:43.5627280Z             "127.0.0.1"
2026-09-14T19:41:43.5627377Z         ],
2026-09-14T19:41:43.5627474Z         "vars": {
2026-09-14T19:41:43.5627582Z             "ansible_connection": "local"
2026-09-14T19:41:43.5627687Z         }
2026-09-14T19:41:43.5627775Z     }
2026-09-14T19:41:43.5627865Z }
2026-09-14T19:41:43.5757415Z ##[error]Bash exited with code '1'.
2026-09-14T19:41:43.5760857Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)


caddeapllx2798.agil.nprd.caixa.gov.br


10.116.202.9
