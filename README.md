Fazer ajuste 


À CESTI multiplataforma, A/C Jesse Mouta Pereira,

Após ajustes nas variáveis, o deploy em TQS na pipeline sicmu-intranet-update passou a apresentar erro em outro ponto... na parte de "Deploy Config" ... ver Release SICMU-intranet-update-86

Grato!


ERRO: 

2026-06-11T16:26:20.0951199Z ##[section]Starting: Deploy Config no JBOSS
2026-06-11T16:26:20.0954128Z ==============================================================================
2026-06-11T16:26:20.0954216Z Task         : Bash
2026-06-11T16:26:20.0954261Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-11T16:26:20.0954325Z Version      : 3.227.0
2026-06-11T16:26:20.0954378Z Author       : Microsoft Corporation
2026-06-11T16:26:20.0954430Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-11T16:26:20.0954508Z ==============================================================================
2026-06-11T16:26:20.2234734Z Generating script.
2026-06-11T16:26:20.2245475Z ========================== Starting Command Output ===========================
2026-06-11T16:26:20.2252476Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/20e5d04f-e2be-4ebe-84ed-d17920fc7cb3.sh
2026-06-11T16:26:20.2334654Z /opt/ads-agent/_work/_temp/20e5d04f-e2be-4ebe-84ed-d17920fc7cb3.sh: line 2: quantidade_vm: command not found
2026-06-11T16:26:20.2354517Z /opt/ads-agent/_work/_temp/20e5d04f-e2be-4ebe-84ed-d17920fc7cb3.sh: line 2: USE_WMQ: command not found
2026-06-11T16:26:20.4959832Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-06-11T16:26:20.4960089Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-06-11T16:26:20.4960573Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-06-11T16:26:20.4960737Z setting deprecation_warnings=False in ansible.cfg.
2026-06-11T16:26:21.0971846Z [WARNING]: Found variable using reserved name: when
2026-06-11T16:26:21.1208225Z 
2026-06-11T16:26:21.1208934Z PLAY [local] *******************************************************************
2026-06-11T16:26:21.1209052Z 
2026-06-11T16:26:21.1209195Z PLAY [Configurando o DNS] ******************************************************
2026-06-11T16:26:21.1209269Z 
2026-06-11T16:26:21.1209402Z PLAY [local] *******************************************************************
2026-06-11T16:26:21.1209510Z 
2026-06-11T16:26:21.1209943Z PLAY [Verificando serviços] ****************************************************
2026-06-11T16:26:21.1210027Z 
2026-06-11T16:26:21.1210220Z PLAY [Configuração LDAP] *******************************************************
2026-06-11T16:26:21.1210293Z 
2026-06-11T16:26:21.1210424Z PLAY [jboss] *******************************************************************
2026-06-11T16:26:21.1210493Z 
2026-06-11T16:26:21.1210625Z PLAY [Stack Jboss] *************************************************************
2026-06-11T16:26:21.1210897Z Thursday 11 June 2026  13:26:21 -0300 (0:00:00.125)       0:00:00.125 ********* 
2026-06-11T16:26:21.5133142Z 
2026-06-11T16:26:21.5133826Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-11T16:26:21.5134004Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:21.5134063Z 
2026-06-11T16:26:21.5134198Z PLAY [jboss] *******************************************************************
2026-06-11T16:26:21.5134654Z Thursday 11 June 2026  13:26:21 -0300 (0:00:00.392)       0:00:00.518 ********* 
2026-06-11T16:26:21.7422333Z [WARNING]: Distribution rhel 9.3 on host caddeapllx2540.agil.nprd.caixa.gov.br
2026-06-11T16:26:21.7422582Z should use /usr/bin/python3, but is using /usr/bin/python for backward
2026-06-11T16:26:21.7422735Z compatibility with prior Ansible releases. See
2026-06-11T16:26:21.7422872Z https://docs.ansible.com/ansible-
2026-06-11T16:26:21.7423024Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-06-11T16:26:21.7454658Z 
2026-06-11T16:26:21.7454848Z TASK [nfs : Verifica se o arquivo nfs_config.json existe] **********************
2026-06-11T16:26:21.7455474Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T16:26:21.7455738Z Thursday 11 June 2026  13:26:21 -0300 (0:00:00.231)       0:00:00.750 ********* 
2026-06-11T16:26:21.7771489Z 
2026-06-11T16:26:21.7772233Z TASK [nfs : include_tasks] *****************************************************
2026-06-11T16:26:21.7773052Z included: /opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2540.agil.nprd.caixa.gov.br
2026-06-11T16:26:21.7773360Z Thursday 11 June 2026  13:26:21 -0300 (0:00:00.031)       0:00:00.782 ********* 
2026-06-11T16:26:21.8125319Z 
2026-06-11T16:26:21.8126668Z TASK [nfs : Criar variáveis] ***************************************************
2026-06-11T16:26:21.8126883Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:21.8127133Z Thursday 11 June 2026  13:26:21 -0300 (0:00:00.035)       0:00:00.817 ********* 
2026-06-11T16:26:22.1491406Z 
2026-06-11T16:26:22.1492523Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-06-11T16:26:22.1492997Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T16:26:22.1493924Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.336)       0:00:01.153 ********* 
2026-06-11T16:26:22.1821105Z 
2026-06-11T16:26:22.1821822Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-06-11T16:26:22.1822022Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br] => {
2026-06-11T16:26:22.1822155Z     "nfs_vars_json": {
2026-06-11T16:26:22.1822294Z         "changed": false,
2026-06-11T16:26:22.1822635Z         "cmd": "cat /opt/ads-agent/_work/r684/a/nfs_config.json",
2026-06-11T16:26:22.1822780Z         "delta": "0:00:00.005548",
2026-06-11T16:26:22.1822967Z         "end": "2026-06-11 13:26:22.122734",
2026-06-11T16:26:22.1823098Z         "failed": false,
2026-06-11T16:26:22.1823204Z         "msg": "",
2026-06-11T16:26:22.1823310Z         "rc": 0,
2026-06-11T16:26:22.1823488Z         "start": "2026-06-11 13:26:22.117186",
2026-06-11T16:26:22.1823613Z         "stderr": "",
2026-06-11T16:26:22.1823723Z         "stderr_lines": [],
2026-06-11T16:26:22.1823830Z         "stdout": "[]",
2026-06-11T16:26:22.1823929Z         "stdout_lines": [
2026-06-11T16:26:22.1824033Z             "[]"
2026-06-11T16:26:22.1824130Z         ],
2026-06-11T16:26:22.1824248Z         "warnings": [
2026-06-11T16:26:22.1824672Z             "Distribution rhel 9.3 on host caddeapllx2540.agil.nprd.caixa.gov.br should use /usr/bin/python3, but is using /usr/bin/python for backward compatibility with prior Ansible releases. See https://docs.ansible.com/ansible-core/2.14/reference_appendices/interpreter_discovery.html for more information"
2026-06-11T16:26:22.1824931Z         ]
2026-06-11T16:26:22.1825023Z     }
2026-06-11T16:26:22.1825114Z }
2026-06-11T16:26:22.1825326Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.033)       0:00:01.187 ********* 
2026-06-11T16:26:22.2185830Z 
2026-06-11T16:26:22.2186366Z TASK [nfs : Criar variáveis] ***************************************************
2026-06-11T16:26:22.2186543Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:22.2186788Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.036)       0:00:01.223 ********* 
2026-06-11T16:26:22.2455774Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.026)       0:00:01.250 ********* 
2026-06-11T16:26:22.2725342Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.027)       0:00:01.277 ********* 
2026-06-11T16:26:22.2983902Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.025)       0:00:01.303 ********* 
2026-06-11T16:26:22.3241386Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.025)       0:00:01.329 ********* 
2026-06-11T16:26:22.3497668Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.025)       0:00:01.354 ********* 
2026-06-11T16:26:22.3760993Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.026)       0:00:01.381 ********* 
2026-06-11T16:26:22.4297816Z 
2026-06-11T16:26:22.4298369Z PLAY [jboss] *******************************************************************
2026-06-11T16:26:22.4298694Z 
2026-06-11T16:26:22.4298993Z PLAY [jboss] *******************************************************************
2026-06-11T16:26:22.4299431Z Thursday 11 June 2026  13:26:22 -0300 (0:00:00.053)       0:00:01.434 ********* 
2026-06-11T16:26:23.4194429Z 
2026-06-11T16:26:23.4195015Z TASK [Gathering Facts] *********************************************************
2026-06-11T16:26:23.4197530Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:23.4198060Z Thursday 11 June 2026  13:26:23 -0300 (0:00:00.989)       0:00:02.424 ********* 
2026-06-11T16:26:24.7942739Z 
2026-06-11T16:26:24.7943297Z TASK [Gerando fatos de servicos] ***********************************************
2026-06-11T16:26:24.7943463Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:24.7943971Z Thursday 11 June 2026  13:26:24 -0300 (0:00:01.375)       0:00:03.799 ********* 
2026-06-11T16:26:24.8397705Z 
2026-06-11T16:26:24.8397897Z TASK [Gerando lista de units jboss] ********************************************
2026-06-11T16:26:24.8398056Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:24.8398305Z Thursday 11 June 2026  13:26:24 -0300 (0:00:00.045)       0:00:03.844 ********* 
2026-06-11T16:26:24.8730081Z Thursday 11 June 2026  13:26:24 -0300 (0:00:00.032)       0:00:03.877 ********* 
2026-06-11T16:26:24.9745062Z 
2026-06-11T16:26:24.9745551Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-11T16:26:24.9746020Z Thursday 11 June 2026  13:26:24 -0300 (0:00:00.101)       0:00:03.979 ********* 
2026-06-11T16:26:25.0189657Z 
2026-06-11T16:26:25.0190521Z TASK [Cria variável build_repository_name] *************************************
2026-06-11T16:26:25.0190697Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:25.0190962Z Thursday 11 June 2026  13:26:25 -0300 (0:00:00.044)       0:00:04.023 ********* 
2026-06-11T16:26:25.0581885Z 
2026-06-11T16:26:25.0582334Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T16:26:25.0582502Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:25.0582921Z Thursday 11 June 2026  13:26:25 -0300 (0:00:00.039)       0:00:04.063 ********* 
2026-06-11T16:26:25.0984559Z 
2026-06-11T16:26:25.0985066Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T16:26:25.0985290Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:25.0985710Z Thursday 11 June 2026  13:26:25 -0300 (0:00:00.040)       0:00:04.103 ********* 
2026-06-11T16:26:25.6116779Z 
2026-06-11T16:26:25.6117354Z TASK [Create a symbolic link] **************************************************
2026-06-11T16:26:25.6117887Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T16:26:25.6118223Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T16:26:25.6118617Z Thursday 11 June 2026  13:26:25 -0300 (0:00:00.513)       0:00:04.616 ********* 
2026-06-11T16:26:26.0140946Z 
2026-06-11T16:26:26.0141527Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-11T16:26:26.0142075Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T16:26:26.0142683Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T16:26:26.0143070Z Thursday 11 June 2026  13:26:26 -0300 (0:00:00.402)       0:00:05.019 ********* 
2026-06-11T16:26:26.1046598Z 
2026-06-11T16:26:26.1047250Z TASK [Criando artefatos] *******************************************************
2026-06-11T16:26:26.1049149Z included: /opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx2540.agil.nprd.caixa.gov.br => (item={'changed': False, 'stat': {'exists': True, 'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-deployments', 'mode': '0644', 'isdir': False, 'ischr': False, 'isblk': False, 'isreg': True, 'isfifo': False, 'islnk': False, 'issock': False, 'uid': 0, 'gid': 0, 'size': 166, 'inode': 77831203, 'dev': 189, 'nlink': 1, 'atime': 1781195130.3821352, 'mtime': 1781195130.3821352, 'ctime': 1781195130.3821352, 'wusr': True, 'rusr': True, 'xusr': False, 'wgrp': False, 'rgrp': True, 'xgrp': False, 'woth': False, 'roth': True, 'xoth': False, 'isuid': False, 'isgid': False, 'blocks': 8, 'block_size': 4096, 'device_type': 0, 'readable': True, 'writeable': True, 'executable': False, 'pw_name': 'root', 'gr_name': 'root', 'checksum': '378ee59a21ec06f69f132a814fff71ad845b6dfb', 'mimetype': 'unknown', 'charset': 'unknown', 'version': None, 'attributes': [], 'attr_flags': ''}, 'invocation': {'module_args': {'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-deployments', 'follow': False, 'get_md5': False, 'get_checksum': True, 'get_mime': True, 'get_attributes': True, 'checksum_algorithm': 'sha1'}}, 'failed': False, 'item': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss', 'ansible_loop_var': 'item'})
2026-06-11T16:26:26.1050443Z Thursday 11 June 2026  13:26:26 -0300 (0:00:00.090)       0:00:05.109 ********* 
2026-06-11T16:26:26.4489885Z 
2026-06-11T16:26:26.4490235Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-06-11T16:26:26.4490698Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T16:26:26.4490963Z Thursday 11 June 2026  13:26:26 -0300 (0:00:00.344)       0:00:05.454 ********* 
2026-06-11T16:26:26.4647394Z [WARNING]: TASK: Mostra artefatos: The loop variable 'item' is already in use.
2026-06-11T16:26:26.4647622Z You should set the `loop_var` value in the `loop_control` option for the task
2026-06-11T16:26:26.4647790Z to something else to avoid variable collisions and unexpected behavior.
2026-06-11T16:26:26.5114128Z 
2026-06-11T16:26:26.5114475Z TASK [Mostra artefatos] ********************************************************
2026-06-11T16:26:26.5114921Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.ibm.mq', 'artifact_id': 'wmq.jmsra', 'version': '9.0.4.0', 'extension': 'rar'}) => {
2026-06-11T16:26:26.5115189Z     "msg": "Artefato: wmq.jmsra - versao 9.0.4.0"
2026-06-11T16:26:26.5115328Z }
2026-06-11T16:26:26.5115628Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.jcics', 'artifact_id': 'framework', 'version': '3.0.0', 'extension': 'jar'}) => {
2026-06-11T16:26:26.5115870Z     "msg": "Artefato: framework - versao 3.0.0"
2026-06-11T16:26:26.5115983Z }
2026-06-11T16:26:26.5116277Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.microsoft.azure', 'artifact_id': 'applicationinsights-agent', 'version': '3.3.1', 'extension': 'jar'}) => {
2026-06-11T16:26:26.5116544Z     "msg": "Artefato: applicationinsights-agent - versao 3.3.1"
2026-06-11T16:26:26.5116665Z }
2026-06-11T16:26:26.5116886Z Thursday 11 June 2026  13:26:26 -0300 (0:00:00.062)       0:00:05.516 ********* 
2026-06-11T16:26:28.1336123Z 
2026-06-11T16:26:28.1337125Z TASK [maven_artifact] **********************************************************
2026-06-11T16:26:28.1337734Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.ibm.mq', 'artifact_id': 'wmq.jmsra', 'version': '9.0.4.0', 'extension': 'rar'})
2026-06-11T16:26:28.1338349Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.jcics', 'artifact_id': 'framework', 'version': '3.0.0', 'extension': 'jar'})
2026-06-11T16:26:28.1338863Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.microsoft.azure', 'artifact_id': 'applicationinsights-agent', 'version': '3.3.1', 'extension': 'jar'})
2026-06-11T16:26:28.1339205Z Thursday 11 June 2026  13:26:28 -0300 (0:00:01.622)       0:00:07.138 ********* 
2026-06-11T16:26:29.5343125Z 
2026-06-11T16:26:29.5344137Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-06-11T16:26:29.5344373Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:29.5344884Z Thursday 11 June 2026  13:26:29 -0300 (0:00:01.400)       0:00:08.539 ********* 
2026-06-11T16:26:29.6055240Z 
2026-06-11T16:26:29.6056424Z PLAY [Copiando modules adicionais] *********************************************
2026-06-11T16:26:29.6057061Z Thursday 11 June 2026  13:26:29 -0300 (0:00:00.071)       0:00:08.610 ********* 
2026-06-11T16:26:29.6467158Z 
2026-06-11T16:26:29.6467938Z TASK [Cria variável build_repository_name] *************************************
2026-06-11T16:26:29.6468277Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:29.6469052Z Thursday 11 June 2026  13:26:29 -0300 (0:00:00.041)       0:00:08.651 ********* 
2026-06-11T16:26:29.6875112Z 
2026-06-11T16:26:29.6876080Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T16:26:29.6876286Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:29.6876799Z Thursday 11 June 2026  13:26:29 -0300 (0:00:00.040)       0:00:08.692 ********* 
2026-06-11T16:26:29.7286228Z 
2026-06-11T16:26:29.7286742Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T16:26:29.7286941Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:29.7287412Z Thursday 11 June 2026  13:26:29 -0300 (0:00:00.041)       0:00:08.733 ********* 
2026-06-11T16:26:30.1564712Z 
2026-06-11T16:26:30.1565805Z TASK [Create a directory] ******************************************************
2026-06-11T16:26:30.1566404Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T16:26:30.1566739Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T16:26:30.1567057Z Thursday 11 June 2026  13:26:30 -0300 (0:00:00.427)       0:00:09.161 ********* 
2026-06-11T16:26:30.5659458Z 
2026-06-11T16:26:30.5660395Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-11T16:26:30.5660963Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T16:26:30.5661317Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T16:26:30.5661627Z Thursday 11 June 2026  13:26:30 -0300 (0:00:00.409)       0:00:09.570 ********* 
2026-06-11T16:26:30.6327136Z 
2026-06-11T16:26:30.6328159Z TASK [Criando artefatos modules] ***********************************************
2026-06-11T16:26:30.6330058Z included: /opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx2540.agil.nprd.caixa.gov.br => (item={'changed': False, 'stat': {'exists': True, 'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-modules-custom', 'mode': '0644', 'isdir': False, 'ischr': False, 'isblk': False, 'isreg': True, 'isfifo': False, 'islnk': False, 'issock': False, 'uid': 0, 'gid': 0, 'size': 435, 'inode': 77831218, 'dev': 189, 'nlink': 1, 'atime': 1781195130.3821352, 'mtime': 1781195130.3821352, 'ctime': 1781195130.3821352, 'wusr': True, 'rusr': True, 'xusr': False, 'wgrp': False, 'rgrp': True, 'xgrp': False, 'woth': False, 'roth': True, 'xoth': False, 'isuid': False, 'isgid': False, 'blocks': 8, 'block_size': 4096, 'device_type': 0, 'readable': True, 'writeable': True, 'executable': False, 'pw_name': 'root', 'gr_name': 'root', 'checksum': '390e34173a0b08f53e5f71ec36e34a349e1e13af', 'mimetype': 'unknown', 'charset': 'unknown', 'version': None, 'attributes': [], 'attr_flags': ''}, 'invocation': {'module_args': {'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-modules-custom', 'follow': False, 'get_md5': False, 'get_checksum': True, 'get_mime': True, 'get_attributes': True, 'checksum_algorithm': 'sha1'}}, 'failed': False, 'item': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss', 'ansible_loop_var': 'item'})
2026-06-11T16:26:30.6331304Z Thursday 11 June 2026  13:26:30 -0300 (0:00:00.066)       0:00:09.637 ********* 
2026-06-11T16:26:30.8763978Z 
2026-06-11T16:26:30.8764917Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-06-11T16:26:30.8765775Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T16:26:30.8766053Z Thursday 11 June 2026  13:26:30 -0300 (0:00:00.243)       0:00:09.881 ********* 
2026-06-11T16:26:30.8933936Z [WARNING]: TASK: Mostra lista de artefatos: The loop variable 'item' is already
2026-06-11T16:26:30.8934396Z in use. You should set the `loop_var` value in the `loop_control` option for
2026-06-11T16:26:30.8934800Z the task to something else to avoid variable collisions and unexpected
2026-06-11T16:26:30.8934982Z behavior.
2026-06-11T16:26:31.0470885Z 
2026-06-11T16:26:31.0471741Z TASK [Mostra lista de artefatos] ***********************************************
2026-06-11T16:26:31.0472381Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa', 'artifact_id': 'framework', 'version': '2.0.1', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0472631Z     "msg": "Artefato: framework - versao 2.0.1"
2026-06-11T16:26:31.0472775Z }
2026-06-11T16:26:31.0473092Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.psc', 'artifact_id': 'jconnector', 'version': '2.10', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0473334Z     "msg": "Artefato: jconnector - versao 2.10"
2026-06-11T16:26:31.0473445Z }
2026-06-11T16:26:31.0473717Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.primefaces', 'artifact_id': 'primefaces', 'version': '4.0', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0473954Z     "msg": "Artefato: primefaces - versao 4.0"
2026-06-11T16:26:31.0474063Z }
2026-06-11T16:26:31.0474323Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.apache.poi', 'artifact_id': 'poi', 'version': '3.9', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0474559Z     "msg": "Artefato: poi - versao 3.9"
2026-06-11T16:26:31.0474666Z }
2026-06-11T16:26:31.0474930Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.apache.poi', 'artifact_id': 'poi', 'version': '3.11', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0475162Z     "msg": "Artefato: poi - versao 3.11"
2026-06-11T16:26:31.0475271Z }
2026-06-11T16:26:31.0475536Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.sisgr', 'artifact_id': 'sisgr', 'version': '1.2', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0475762Z     "msg": "Artefato: sisgr - versao 1.2"
2026-06-11T16:26:31.0475866Z }
2026-06-11T16:26:31.0476130Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.lowagie', 'artifact_id': 'itext', 'version': '2.1.0', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0476352Z     "msg": "Artefato: itext - versao 2.1.0"
2026-06-11T16:26:31.0476459Z }
2026-06-11T16:26:31.0476718Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jfree', 'artifact_id': 'jcommon', 'version': '1.0.15', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0477201Z     "msg": "Artefato: jcommon - versao 1.0.15"
2026-06-11T16:26:31.0477303Z }
2026-06-11T16:26:31.0477562Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jfree', 'artifact_id': 'jfreechart', 'version': '1.0.9', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0477792Z     "msg": "Artefato: jfreechart - versao 1.0.9"
2026-06-11T16:26:31.0477901Z }
2026-06-11T16:26:31.0478176Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jasperreports', 'artifact_id': 'jasperreports', 'version': '3.5.3', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0478553Z     "msg": "Artefato: jasperreports - versao 3.5.3"
2026-06-11T16:26:31.0478679Z }
2026-06-11T16:26:31.0478970Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'apache.commons.fileupload', 'artifact_id': 'fileupload', 'version': '1.3', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0479218Z     "msg": "Artefato: fileupload - versao 1.3"
2026-06-11T16:26:31.0479330Z }
2026-06-11T16:26:31.0479703Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'commons-digester', 'artifact_id': 'commons-digester', 'version': '2.1', 'extension': 'jar'}) => {
2026-06-11T16:26:31.0479944Z     "msg": "Artefato: commons-digester - versao 2.1"
2026-06-11T16:26:31.0480049Z }
2026-06-11T16:26:31.0480274Z Thursday 11 June 2026  13:26:31 -0300 (0:00:00.170)       0:00:10.051 ********* 
2026-06-11T16:26:31.3632189Z [WARNING]: Skipped '/tmp/src/' path due to this access issue: '/tmp/src/' is
2026-06-11T16:26:31.3632679Z not a directory
2026-06-11T16:26:31.3745799Z 
2026-06-11T16:26:31.3746779Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-06-11T16:26:31.3747020Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T16:26:31.3747286Z Thursday 11 June 2026  13:26:31 -0300 (0:00:00.327)       0:00:10.379 ********* 
2026-06-11T16:26:31.4032136Z [WARNING]: conditional statements should not include jinja2 templating
2026-06-11T16:26:31.4032653Z delimiters such as {{ }} or {% %}. Found: '{{ inner_item.artifact_id }}-{{
2026-06-11T16:26:31.4032884Z inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in
2026-06-11T16:26:31.4033103Z files_found.files | map(attribute='path') | map('basename') | list
2026-06-11T16:26:31.4079084Z 
2026-06-11T16:26:31.4079768Z TASK [maven_artifact] **********************************************************
2026-06-11T16:26:31.4080743Z fatal: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]: FAILED! => {"msg": "The conditional check ''{{ inner_item.artifact_id }}-{{ inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in files_found.files | map(attribute='path') | map('basename') | list' failed. The error was: Conditional is marked as unsafe, and cannot be evaluated.\n\nThe error appears to be in '/opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml': line 23, column 3, but may\nbe elsewhere in the file depending on the exact syntax problem.\n\nThe offending line appears to be:\n\n\n- maven_artifact:\n  ^ here\n"}
2026-06-11T16:26:31.4081183Z 
2026-06-11T16:26:31.4081325Z PLAY RECAP *********************************************************************
2026-06-11T16:26:31.4081516Z caddeapllx2540.agil.nprd.caixa.gov.br : ok=29   changed=3    unreachable=0    failed=1    skipped=10   rescued=0    ignored=0   
2026-06-11T16:26:31.4081605Z 
2026-06-11T16:26:31.4081730Z Playbook run took 0 days, 0 hours, 0 minutes, 10 seconds
2026-06-11T16:26:31.4082055Z Thursday 11 June 2026  13:26:31 -0300 (0:00:00.033)       0:00:10.413 ********* 
2026-06-11T16:26:31.4082244Z =============================================================================== 
2026-06-11T16:26:31.4082474Z maven_artifact ---------------------------------------------------------- 1.62s
2026-06-11T16:26:31.4082703Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 1.40s
2026-06-11T16:26:31.4082921Z Gerando fatos de servicos ----------------------------------------------- 1.38s
2026-06-11T16:26:31.4086177Z Gathering Facts --------------------------------------------------------- 0.99s
2026-06-11T16:26:31.4086411Z Create a symbolic link -------------------------------------------------- 0.51s
2026-06-11T16:26:31.4086634Z Create a directory ------------------------------------------------------ 0.43s
2026-06-11T16:26:31.4086859Z Verifica se o arquivo  existe ------------------------------------------- 0.41s
2026-06-11T16:26:31.4087082Z Verifica se o arquivo  existe ------------------------------------------- 0.40s
2026-06-11T16:26:31.4087317Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.39s
2026-06-11T16:26:31.4087538Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.34s
2026-06-11T16:26:31.4087762Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.34s
2026-06-11T16:26:31.4087987Z Listar arquivos no diretório baixados anteriormente --------------------- 0.33s
2026-06-11T16:26:31.4088338Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.24s
2026-06-11T16:26:31.4088688Z nfs : Verifica se o arquivo nfs_config.json existe ---------------------- 0.23s
2026-06-11T16:26:31.4088911Z Mostra lista de artefatos ----------------------------------------------- 0.17s
2026-06-11T16:26:31.4089126Z Stop e Disable service jboss -------------------------------------------- 0.10s
2026-06-11T16:26:31.4089349Z Criando artefatos ------------------------------------------------------- 0.09s
2026-06-11T16:26:31.4089569Z Sem artefatos de deployments -------------------------------------------- 0.07s
2026-06-11T16:26:31.4089790Z Criando artefatos modules ----------------------------------------------- 0.07s
2026-06-11T16:26:31.4090013Z Mostra artefatos -------------------------------------------------------- 0.06s
2026-06-11T16:26:31.4816851Z ##[error]Bash exited with code '2'.
2026-06-11T16:26:31.4829891Z ##[section]Finishing: Deploy Config no JBOSS



ME AJUDA A VERIFICAR: 

ELE ACBOU DE MIE INFORMA ISSO NO TEMAS DO DE DES:

Jesse Mouta Pereira Batista,
 
Pode ver um outro detalhe também?
 
Consultando o resumo da release que deployou certo em DES, me parece que está publicando em URL com pequeno erro:
 
 
Está escrito "updade" ao invés de "update" nas URL com HTTPS
 
Tanto é que a URL que seria a certa, está abrindo a tela abaixo:


Caixa
DevOps CAIXA





Olá,

Seja bem vindo ao DevOps CAIXA.



Ops!!!!... parece que você acessou uma URL que não está disponível.



Confere lá no Azure DevOps Server se essa URL tá certa no seu processo de release.

Tudo certinho lá? fala com o SAI/Suporte que vamos te ajudar, ok? :)
Caixa Econômica FederalPolítica de PrivacidadeTermos de UsoMapa do Site


2026-06-11T14:08:38.0850390Z APP Publicada nas URL: 
2026-06-11T14:08:38.0852897Z   - http://sicmu-intranet-update.esteiras.des.caixa,https://sicmu-intranet-updade.esteiras.des.caixa/
2026-06-11T14:08:38.0873740Z   - http://sicmu-intranet-update.esteiras.des.caixa,https://sicmu-intranet-updade.esteiras.des.caixa/sicmu
2026-06-11T14:08:38.0885382Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-06-11T14:08:38.0885610Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-06-11T14:08:38.0885678Z 
2026-06-11T14:08:39.1025037Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-11T14:08:40.1040029Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-11T14:08:41.0900209Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-11T14:08:41.0900515Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-11T14:08:41.0900692Z Warning: Transient problem: timeout Will retry in 1 seconds. 5 retries left.

