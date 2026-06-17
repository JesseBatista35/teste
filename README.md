2026-06-17T19:04:13.6510683Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-17T19:04:13.6514459Z ==============================================================================
2026-06-17T19:04:13.6514557Z Task         : Bash
2026-06-17T19:04:13.6514615Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-17T19:04:13.6514675Z Version      : 3.227.0
2026-06-17T19:04:13.6514722Z Author       : Microsoft Corporation
2026-06-17T19:04:13.6514787Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-17T19:04:13.6514858Z ==============================================================================
2026-06-17T19:04:13.8083557Z Generating script.
2026-06-17T19:04:13.8100395Z ========================== Starting Command Output ===========================
2026-06-17T19:04:13.8108667Z [command]/bin/bash /opt/ads-agent/_work/_temp/b293794c-6bdd-41b8-804b-9ad0b2d6ef9c.sh
2026-06-17T19:04:13.8186445Z /opt/ads-agent/_work/_temp/b293794c-6bdd-41b8-804b-9ad0b2d6ef9c.sh: line 4: tf_var_quant: comando não encontrado
2026-06-17T19:04:15.9040997Z 
2026-06-17T19:04:15.9042033Z PLAY [local] *******************************************************************
2026-06-17T19:04:15.9285129Z Wednesday 17 June 2026  16:04:15 -0300 (0:00:00.027)       0:00:00.027 ******** 
2026-06-17T19:04:18.7448869Z 
2026-06-17T19:04:18.7449679Z TASK [Gathering Facts] *********************************************************
2026-06-17T19:04:18.7451985Z fatal: [127.0.0.1]: FAILED! => {"ansible_facts": {}, "changed": false, "failed_modules": {"ansible.legacy.setup": {"ansible_facts": {"discovered_interpreter_python": "/usr/bin/python"}, "failed": true, "module_stderr": "\nPresumimos que você recebeu as instruções de sempre do administrador\nde sistema local. Basicamente, resume-se a estas três coisas:\n\n    #1) Respeite a privacidade dos outros.\n    #2) Pense antes de digitar.\n    #3) Com grandes poderes vêm grandes responsabilidades.\n\nsudo: nenhum tty presente e nenhum programa de askpass especificado\n", "module_stdout": "", "msg": "MODULE FAILURE\nSee stdout/stderr for the exact error", "rc": 1}}, "msg": "The following modules failed to execute: ansible.legacy.setup\n"}
2026-06-17T19:04:18.7458146Z 
2026-06-17T19:04:18.7458367Z PLAY RECAP *********************************************************************
2026-06-17T19:04:18.7458993Z 127.0.0.1                  : ok=0    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-06-17T19:04:18.7459117Z 
2026-06-17T19:04:18.7460114Z Playbook run took 0 days, 0 hours, 0 minutes, 2 seconds
2026-06-17T19:04:18.7460493Z Wednesday 17 June 2026  16:04:18 -0300 (0:00:02.817)       0:00:02.845 ******** 
2026-06-17T19:04:18.7460693Z =============================================================================== 
2026-06-17T19:04:18.7460946Z Gathering Facts --------------------------------------------------------- 2.82s
2026-06-17T19:04:19.0079308Z 
2026-06-17T19:04:19.0080026Z {
2026-06-17T19:04:19.0080180Z     "_meta": {
2026-06-17T19:04:19.0080380Z         "hostvars": {
2026-06-17T19:04:19.0080525Z             "caddeapllx2598.agil.nprd.caixa.gov.br": {
2026-06-17T19:04:19.0081098Z                 "ambiente": "tqs",
2026-06-17T19:04:19.0081238Z                 "ansible_host": "10.116.201.157",
2026-06-17T19:04:19.0081484Z                 "cluster": null,
2026-06-17T19:04:19.0081628Z                 "cluster_principal": null,
2026-06-17T19:04:19.0081762Z                 "cluster_terraform": null,
2026-06-17T19:04:19.0081873Z                 "cpu": 2,
2026-06-17T19:04:19.0082060Z                 "datacenter": null,
2026-06-17T19:04:19.0082201Z                 "datastore": null,
2026-06-17T19:04:19.0082332Z                 "detalhe_imagem": null,
2026-06-17T19:04:19.0082478Z                 "disco_log": 2,
2026-06-17T19:04:19.0082643Z                 "disco_opt": 10,
2026-06-17T19:04:19.0082794Z                 "domain": null,
2026-06-17T19:04:19.0082923Z                 "esx_network": null,
2026-06-17T19:04:19.0083053Z                 "esx_network_bck": null,
2026-06-17T19:04:19.0083335Z                 "esx_vcenter_server": null,
2026-06-17T19:04:19.0083450Z                 "farm": null,
2026-06-17T19:04:19.0083577Z                 "id": 13421,
2026-06-17T19:04:19.0083992Z                 "inclusao": "2026-06-17 15:35:38",
2026-06-17T19:04:19.0084139Z                 "info_framework": null,
2026-06-17T19:04:19.0084268Z                 "info_linguagem": null,
2026-06-17T19:04:19.0084384Z                 "info_tecnologia": null,
2026-06-17T19:04:19.0084516Z                 "info_versao": null,
2026-06-17T19:04:19.0084641Z                 "ipbackup": "",
2026-06-17T19:04:19.0084812Z                 "jboss_apache_status": "ativado",
2026-06-17T19:04:19.0084943Z                 "memoria": 4,
2026-06-17T19:04:19.0085079Z                 "net_adapter_type": null,
2026-06-17T19:04:19.0085196Z                 "nome_imagem": null,
2026-06-17T19:04:19.0085397Z                 "objeto_origem": "ECAPT-BANCARIO_TQS_SERVIDOR",
2026-06-17T19:04:19.0085544Z                 "plataforma": "vm",
2026-06-17T19:04:19.0085674Z                 "produto": "jboss",
2026-06-17T19:04:19.0085802Z                 "recursos_max_id": null,
2026-06-17T19:04:19.0085966Z                 "sistema": "ecapt-bancario",
2026-06-17T19:04:19.0086102Z                 "site": "ctc_nprd",
2026-06-17T19:04:19.0086233Z                 "solicitacoes_id": null,
2026-06-17T19:04:19.0086363Z                 "status": "ativado",
2026-06-17T19:04:19.0086492Z                 "terraform": true,
2026-06-17T19:04:19.0086620Z                 "versao_imagem": null,
2026-06-17T19:04:19.0086741Z                 "versao_plataforma": "7.1",
2026-06-17T19:04:19.0086960Z                 "vm_dns": null,
2026-06-17T19:04:19.0087100Z                 "vm_ipnetmask": null,
2026-06-17T19:04:19.0087234Z                 "vm_ipnetmask_bck": null,
2026-06-17T19:04:19.0087366Z                 "vsphere_folder": null,
2026-06-17T19:04:19.0087481Z                 "vsphere_pool": null
2026-06-17T19:04:19.0087597Z             }
2026-06-17T19:04:19.0087713Z         }
2026-06-17T19:04:19.0087821Z     },
2026-06-17T19:04:19.0087922Z     "ctc_nprd": {
2026-06-17T19:04:19.0088045Z         "children": [
2026-06-17T19:04:19.0088167Z             "jboss"
2026-06-17T19:04:19.0088277Z         ],
2026-06-17T19:04:19.0088392Z         "vars": {}
2026-06-17T19:04:19.0088487Z     },
2026-06-17T19:04:19.0088603Z     "jboss": {
2026-06-17T19:04:19.0088719Z         "hosts": [
2026-06-17T19:04:19.0088855Z             "caddeapllx2598.agil.nprd.caixa.gov.br"
2026-06-17T19:04:19.0088988Z         ],
2026-06-17T19:04:19.0089085Z         "vars": {}
2026-06-17T19:04:19.0089194Z     },
2026-06-17T19:04:19.0089307Z     "local": {
2026-06-17T19:04:19.0089425Z         "hosts": [
2026-06-17T19:04:19.0089524Z             "127.0.0.1"
2026-06-17T19:04:19.0089640Z         ],
2026-06-17T19:04:19.0089753Z         "vars": {
2026-06-17T19:04:19.0089879Z             "ansible_connection": "local"
2026-06-17T19:04:19.0090000Z         }
2026-06-17T19:04:19.0090091Z     },
2026-06-17T19:04:19.0090209Z     "tqs": {
2026-06-17T19:04:19.0090330Z         "children": [
2026-06-17T19:04:19.0090448Z             "local",
2026-06-17T19:04:19.0090617Z             "ctc_nprd"
2026-06-17T19:04:19.0090716Z         ],
2026-06-17T19:04:19.0090827Z         "vars": {}
2026-06-17T19:04:19.0090935Z     }
2026-06-17T19:04:19.0091040Z }
2026-06-17T19:04:19.0302224Z ##[error]Bash exited with code '1'.
2026-06-17T19:04:19.0305381Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)





o erro mudou agora é esse

# Variable 'modulo' was defined in the Variables tab
# Variable 'nome_imagem' was defined in the Variables tab
# Variable 'tag_imagem' was defined in the Variables tab
# Variable 'version.app' was defined in the Variables tab
# Variable Group 'BUILD_VARIABLES' was defined in the Variables tab
# Variable Group 'Usuario-Azure-DevOps' was defined in the Variables tab
# Variable Group 'SONAR_VARIABLES - ESTEIRA' was defined in the Variables tab
jobs:
- job: Job_1
  displayName: Agent job 1
  pool:
    name: Build-Linux
  steps:
  - checkout: self
  - task: Bash@3
    displayName: Fake build
    inputs:
      targetType: inline
      script: echo 'pipeline de build executada.'
...
