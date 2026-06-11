2026-06-11T18:43:44.6320047Z ##[section]Starting: Deploy Config no JBOSS
2026-06-11T18:43:44.6323572Z ==============================================================================
2026-06-11T18:43:44.6323660Z Task         : Bash
2026-06-11T18:43:44.6323711Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-11T18:43:44.6323790Z Version      : 3.227.0
2026-06-11T18:43:44.6323841Z Author       : Microsoft Corporation
2026-06-11T18:43:44.6323897Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-11T18:43:44.6323984Z ==============================================================================
2026-06-11T18:43:44.9575835Z Generating script.
2026-06-11T18:43:44.9588767Z ========================== Starting Command Output ===========================
2026-06-11T18:43:44.9595850Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5775c41c-51ac-4240-8d3f-0c23306bf7e2.sh
2026-06-11T18:43:44.9682534Z /opt/ads-agent/_work/_temp/5775c41c-51ac-4240-8d3f-0c23306bf7e2.sh: line 2: quantidade_vm: command not found
2026-06-11T18:43:44.9702197Z /opt/ads-agent/_work/_temp/5775c41c-51ac-4240-8d3f-0c23306bf7e2.sh: line 2: USE_WMQ: command not found
2026-06-11T18:43:45.2483446Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-06-11T18:43:45.2483715Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-06-11T18:43:45.2484260Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-06-11T18:43:45.2484424Z setting deprecation_warnings=False in ansible.cfg.
2026-06-11T18:43:45.8551555Z [WARNING]: Found variable using reserved name: when
2026-06-11T18:43:45.8793245Z 
2026-06-11T18:43:45.8793726Z PLAY [local] *******************************************************************
2026-06-11T18:43:45.8793847Z 
2026-06-11T18:43:45.8793997Z PLAY [Configurando o DNS] ******************************************************
2026-06-11T18:43:45.8794084Z 
2026-06-11T18:43:45.8794234Z PLAY [local] *******************************************************************
2026-06-11T18:43:45.8794316Z 
2026-06-11T18:43:45.8794811Z PLAY [Verificando serviços] ****************************************************
2026-06-11T18:43:45.8794890Z 
2026-06-11T18:43:45.8795103Z PLAY [Configuração LDAP] *******************************************************
2026-06-11T18:43:45.8795194Z 
2026-06-11T18:43:45.8795340Z PLAY [jboss] *******************************************************************
2026-06-11T18:43:45.8795407Z 
2026-06-11T18:43:45.8795547Z PLAY [Stack Jboss] *************************************************************
2026-06-11T18:43:45.8795841Z Thursday 11 June 2026  15:43:45 -0300 (0:00:00.126)       0:00:00.126 ********* 
2026-06-11T18:43:46.2660544Z 
2026-06-11T18:43:46.2661440Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-11T18:43:46.2661635Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:46.2661722Z 
2026-06-11T18:43:46.2661869Z PLAY [jboss] *******************************************************************
2026-06-11T18:43:46.2662180Z Thursday 11 June 2026  15:43:46 -0300 (0:00:00.386)       0:00:00.513 ********* 
2026-06-11T18:43:46.4913385Z [WARNING]: Distribution rhel 9.3 on host caddeapllx2540.agil.nprd.caixa.gov.br
2026-06-11T18:43:46.4913647Z should use /usr/bin/python3, but is using /usr/bin/python for backward
2026-06-11T18:43:46.4913813Z compatibility with prior Ansible releases. See
2026-06-11T18:43:46.4913962Z https://docs.ansible.com/ansible-
2026-06-11T18:43:46.4914226Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-06-11T18:43:46.4944784Z 
2026-06-11T18:43:46.4945338Z TASK [nfs : Verifica se o arquivo nfs_config.json existe] **********************
2026-06-11T18:43:46.4945878Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T18:43:46.4946171Z Thursday 11 June 2026  15:43:46 -0300 (0:00:00.228)       0:00:00.741 ********* 
2026-06-11T18:43:46.5262964Z 
2026-06-11T18:43:46.5263530Z TASK [nfs : include_tasks] *****************************************************
2026-06-11T18:43:46.5264349Z included: /opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2540.agil.nprd.caixa.gov.br
2026-06-11T18:43:46.5264725Z Thursday 11 June 2026  15:43:46 -0300 (0:00:00.031)       0:00:00.773 ********* 
2026-06-11T18:43:46.5617729Z 
2026-06-11T18:43:46.5618536Z TASK [nfs : Criar variáveis] ***************************************************
2026-06-11T18:43:46.5618727Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:46.5619013Z Thursday 11 June 2026  15:43:46 -0300 (0:00:00.035)       0:00:00.808 ********* 
2026-06-11T18:43:46.9035652Z 
2026-06-11T18:43:46.9036475Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-06-11T18:43:46.9036729Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T18:43:46.9037054Z Thursday 11 June 2026  15:43:46 -0300 (0:00:00.341)       0:00:01.150 ********* 
2026-06-11T18:43:46.9366619Z 
2026-06-11T18:43:46.9367282Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-06-11T18:43:46.9367529Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br] => {
2026-06-11T18:43:46.9367676Z     "nfs_vars_json": {
2026-06-11T18:43:46.9367830Z         "changed": false,
2026-06-11T18:43:46.9368158Z         "cmd": "cat /opt/ads-agent/_work/r684/a/nfs_config.json",
2026-06-11T18:43:46.9368319Z         "delta": "0:00:00.005458",
2026-06-11T18:43:46.9368646Z         "end": "2026-06-11 15:43:46.877190",
2026-06-11T18:43:46.9368781Z         "failed": false,
2026-06-11T18:43:46.9369194Z         "msg": "",
2026-06-11T18:43:46.9369639Z         "rc": 0,
2026-06-11T18:43:46.9369938Z         "start": "2026-06-11 15:43:46.871732",
2026-06-11T18:43:46.9370074Z         "stderr": "",
2026-06-11T18:43:46.9370199Z         "stderr_lines": [],
2026-06-11T18:43:46.9370320Z         "stdout": "[]",
2026-06-11T18:43:46.9370441Z         "stdout_lines": [
2026-06-11T18:43:46.9370568Z             "[]"
2026-06-11T18:43:46.9370670Z         ],
2026-06-11T18:43:46.9370782Z         "warnings": [
2026-06-11T18:43:46.9371204Z             "Distribution rhel 9.3 on host caddeapllx2540.agil.nprd.caixa.gov.br should use /usr/bin/python3, but is using /usr/bin/python for backward compatibility with prior Ansible releases. See https://docs.ansible.com/ansible-core/2.14/reference_appendices/interpreter_discovery.html for more information"
2026-06-11T18:43:46.9371474Z         ]
2026-06-11T18:43:46.9371577Z     }
2026-06-11T18:43:46.9371665Z }
2026-06-11T18:43:46.9371890Z Thursday 11 June 2026  15:43:46 -0300 (0:00:00.033)       0:00:01.183 ********* 
2026-06-11T18:43:46.9739611Z 
2026-06-11T18:43:46.9740132Z TASK [nfs : Criar variáveis] ***************************************************
2026-06-11T18:43:46.9740317Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:46.9740567Z Thursday 11 June 2026  15:43:46 -0300 (0:00:00.037)       0:00:01.221 ********* 
2026-06-11T18:43:47.0014836Z Thursday 11 June 2026  15:43:47 -0300 (0:00:00.027)       0:00:01.248 ********* 
2026-06-11T18:43:47.0281502Z Thursday 11 June 2026  15:43:47 -0300 (0:00:00.026)       0:00:01.275 ********* 
2026-06-11T18:43:47.0547226Z Thursday 11 June 2026  15:43:47 -0300 (0:00:00.026)       0:00:01.301 ********* 
2026-06-11T18:43:47.0811984Z Thursday 11 June 2026  15:43:47 -0300 (0:00:00.026)       0:00:01.328 ********* 
2026-06-11T18:43:47.1077760Z Thursday 11 June 2026  15:43:47 -0300 (0:00:00.026)       0:00:01.354 ********* 
2026-06-11T18:43:47.1344567Z Thursday 11 June 2026  15:43:47 -0300 (0:00:00.026)       0:00:01.381 ********* 
2026-06-11T18:43:47.1881524Z 
2026-06-11T18:43:47.1881969Z PLAY [jboss] *******************************************************************
2026-06-11T18:43:47.1882103Z 
2026-06-11T18:43:47.1882256Z PLAY [jboss] *******************************************************************
2026-06-11T18:43:47.1882690Z Thursday 11 June 2026  15:43:47 -0300 (0:00:00.053)       0:00:01.435 ********* 
2026-06-11T18:43:48.1722083Z 
2026-06-11T18:43:48.1722668Z TASK [Gathering Facts] *********************************************************
2026-06-11T18:43:48.1723140Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:48.1723677Z Thursday 11 June 2026  15:43:48 -0300 (0:00:00.983)       0:00:02.419 ********* 
2026-06-11T18:43:49.5028655Z 
2026-06-11T18:43:49.5029472Z TASK [Gerando fatos de servicos] ***********************************************
2026-06-11T18:43:49.5029920Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:49.5030991Z Thursday 11 June 2026  15:43:49 -0300 (0:00:01.330)       0:00:03.749 ********* 
2026-06-11T18:43:49.5517474Z 
2026-06-11T18:43:49.5517978Z TASK [Gerando lista de units jboss] ********************************************
2026-06-11T18:43:49.5518160Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:49.5518640Z Thursday 11 June 2026  15:43:49 -0300 (0:00:00.048)       0:00:03.798 ********* 
2026-06-11T18:43:49.5879534Z Thursday 11 June 2026  15:43:49 -0300 (0:00:00.036)       0:00:03.834 ********* 
2026-06-11T18:43:49.6767782Z 
2026-06-11T18:43:49.6768362Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-11T18:43:49.6769003Z Thursday 11 June 2026  15:43:49 -0300 (0:00:00.089)       0:00:03.923 ********* 
2026-06-11T18:43:49.7196218Z 
2026-06-11T18:43:49.7196672Z TASK [Cria variável build_repository_name] *************************************
2026-06-11T18:43:49.7196856Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:49.7197100Z Thursday 11 June 2026  15:43:49 -0300 (0:00:00.042)       0:00:03.966 ********* 
2026-06-11T18:43:49.7570987Z 
2026-06-11T18:43:49.7571604Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T18:43:49.7572047Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:49.7572799Z Thursday 11 June 2026  15:43:49 -0300 (0:00:00.037)       0:00:04.004 ********* 
2026-06-11T18:43:49.7970411Z 
2026-06-11T18:43:49.7971053Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T18:43:49.7971249Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:49.7971755Z Thursday 11 June 2026  15:43:49 -0300 (0:00:00.040)       0:00:04.044 ********* 
2026-06-11T18:43:50.3401508Z 
2026-06-11T18:43:50.3402060Z TASK [Create a symbolic link] **************************************************
2026-06-11T18:43:50.3402727Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T18:43:50.3403067Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T18:43:50.3403395Z Thursday 11 June 2026  15:43:50 -0300 (0:00:00.543)       0:00:04.587 ********* 
2026-06-11T18:43:50.7492413Z 
2026-06-11T18:43:50.7492980Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-11T18:43:50.7493557Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T18:43:50.7493903Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T18:43:50.7494207Z Thursday 11 June 2026  15:43:50 -0300 (0:00:00.408)       0:00:04.996 ********* 
2026-06-11T18:43:50.8368486Z 
2026-06-11T18:43:50.8368941Z TASK [Criando artefatos] *******************************************************
2026-06-11T18:43:50.8370639Z included: /opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx2540.agil.nprd.caixa.gov.br => (item={'changed': False, 'stat': {'exists': True, 'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-deployments', 'mode': '0644', 'isdir': False, 'ischr': False, 'isblk': False, 'isreg': True, 'isfifo': False, 'islnk': False, 'issock': False, 'uid': 0, 'gid': 0, 'size': 166, 'inode': 30813376, 'dev': 189, 'nlink': 1, 'atime': 1781203373.9868202, 'mtime': 1781203373.9868202, 'ctime': 1781203373.9868202, 'wusr': True, 'rusr': True, 'xusr': False, 'wgrp': False, 'rgrp': True, 'xgrp': False, 'woth': False, 'roth': True, 'xoth': False, 'isuid': False, 'isgid': False, 'blocks': 8, 'block_size': 4096, 'device_type': 0, 'readable': True, 'writeable': True, 'executable': False, 'pw_name': 'root', 'gr_name': 'root', 'checksum': '378ee59a21ec06f69f132a814fff71ad845b6dfb', 'mimetype': 'unknown', 'charset': 'unknown', 'version': None, 'attributes': [], 'attr_flags': ''}, 'invocation': {'module_args': {'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-deployments', 'follow': False, 'get_md5': False, 'get_checksum': True, 'get_mime': True, 'get_attributes': True, 'checksum_algorithm': 'sha1'}}, 'failed': False, 'item': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss', 'ansible_loop_var': 'item'})
2026-06-11T18:43:50.8371993Z Thursday 11 June 2026  15:43:50 -0300 (0:00:00.087)       0:00:05.083 ********* 
2026-06-11T18:43:51.1781915Z 
2026-06-11T18:43:51.1782487Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-06-11T18:43:51.1782971Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T18:43:51.1783264Z Thursday 11 June 2026  15:43:51 -0300 (0:00:00.341)       0:00:05.425 ********* 
2026-06-11T18:43:51.1937178Z [WARNING]: TASK: Mostra artefatos: The loop variable 'item' is already in use.
2026-06-11T18:43:51.1937379Z You should set the `loop_var` value in the `loop_control` option for the task
2026-06-11T18:43:51.1937568Z to something else to avoid variable collisions and unexpected behavior.
2026-06-11T18:43:51.2395993Z 
2026-06-11T18:43:51.2396793Z TASK [Mostra artefatos] ********************************************************
2026-06-11T18:43:51.2397308Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.ibm.mq', 'artifact_id': 'wmq.jmsra', 'version': '9.0.4.0', 'extension': 'rar'}) => {
2026-06-11T18:43:51.2397590Z     "msg": "Artefato: wmq.jmsra - versao 9.0.4.0"
2026-06-11T18:43:51.2397726Z }
2026-06-11T18:43:51.2398067Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.jcics', 'artifact_id': 'framework', 'version': '3.0.0', 'extension': 'jar'}) => {
2026-06-11T18:43:51.2398323Z     "msg": "Artefato: framework - versao 3.0.0"
2026-06-11T18:43:51.2398575Z }
2026-06-11T18:43:51.2398899Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.microsoft.azure', 'artifact_id': 'applicationinsights-agent', 'version': '3.3.1', 'extension': 'jar'}) => {
2026-06-11T18:43:51.2399177Z     "msg": "Artefato: applicationinsights-agent - versao 3.3.1"
2026-06-11T18:43:51.2399311Z }
2026-06-11T18:43:51.2399553Z Thursday 11 June 2026  15:43:51 -0300 (0:00:00.061)       0:00:05.486 ********* 
2026-06-11T18:43:53.4145983Z 
2026-06-11T18:43:53.4146632Z TASK [maven_artifact] **********************************************************
2026-06-11T18:43:53.4147314Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.ibm.mq', 'artifact_id': 'wmq.jmsra', 'version': '9.0.4.0', 'extension': 'rar'})
2026-06-11T18:43:53.4147714Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.jcics', 'artifact_id': 'framework', 'version': '3.0.0', 'extension': 'jar'})
2026-06-11T18:43:53.4148110Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.microsoft.azure', 'artifact_id': 'applicationinsights-agent', 'version': '3.3.1', 'extension': 'jar'})
2026-06-11T18:43:53.4148559Z Thursday 11 June 2026  15:43:53 -0300 (0:00:02.174)       0:00:07.661 ********* 
2026-06-11T18:43:54.8405620Z 
2026-06-11T18:43:54.8406285Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-06-11T18:43:54.8406517Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:54.8407112Z Thursday 11 June 2026  15:43:54 -0300 (0:00:01.426)       0:00:09.087 ********* 
2026-06-11T18:43:54.9117991Z 
2026-06-11T18:43:54.9118762Z PLAY [Copiando modules adicionais] *********************************************
2026-06-11T18:43:54.9119306Z Thursday 11 June 2026  15:43:54 -0300 (0:00:00.071)       0:00:09.159 ********* 
2026-06-11T18:43:54.9550533Z 
2026-06-11T18:43:54.9551278Z TASK [Cria variável build_repository_name] *************************************
2026-06-11T18:43:54.9551467Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:54.9551751Z Thursday 11 June 2026  15:43:54 -0300 (0:00:00.043)       0:00:09.202 ********* 
2026-06-11T18:43:54.9916441Z 
2026-06-11T18:43:54.9916929Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T18:43:54.9917127Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:54.9917512Z Thursday 11 June 2026  15:43:54 -0300 (0:00:00.036)       0:00:09.238 ********* 
2026-06-11T18:43:55.0309379Z 
2026-06-11T18:43:55.0309812Z TASK [Buscando diretorio de config] ********************************************
2026-06-11T18:43:55.0310063Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:55.0310527Z Thursday 11 June 2026  15:43:55 -0300 (0:00:00.039)       0:00:09.278 ********* 
2026-06-11T18:43:55.4528582Z 
2026-06-11T18:43:55.4529153Z TASK [Create a directory] ******************************************************
2026-06-11T18:43:55.4529726Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T18:43:55.4530062Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T18:43:55.4530377Z Thursday 11 June 2026  15:43:55 -0300 (0:00:00.421)       0:00:09.699 ********* 
2026-06-11T18:43:55.8810023Z 
2026-06-11T18:43:55.8810552Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-11T18:43:55.8811180Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config)
2026-06-11T18:43:55.8811533Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss)
2026-06-11T18:43:55.8811848Z Thursday 11 June 2026  15:43:55 -0300 (0:00:00.428)       0:00:10.128 ********* 
2026-06-11T18:43:55.9422032Z 
2026-06-11T18:43:55.9422444Z TASK [Criando artefatos modules] ***********************************************
2026-06-11T18:43:55.9424142Z included: /opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx2540.agil.nprd.caixa.gov.br => (item={'changed': False, 'stat': {'exists': True, 'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-modules-custom', 'mode': '0644', 'isdir': False, 'ischr': False, 'isblk': False, 'isreg': True, 'isfifo': False, 'islnk': False, 'issock': False, 'uid': 0, 'gid': 0, 'size': 435, 'inode': 30813377, 'dev': 189, 'nlink': 1, 'atime': 1781203373.9868202, 'mtime': 1781203373.9868202, 'ctime': 1781203373.9868202, 'wusr': True, 'rusr': True, 'xusr': False, 'wgrp': False, 'rgrp': True, 'xgrp': False, 'woth': False, 'roth': True, 'xoth': False, 'isuid': False, 'isgid': False, 'blocks': 8, 'block_size': 4096, 'device_type': 0, 'readable': True, 'writeable': True, 'executable': False, 'pw_name': 'root', 'gr_name': 'root', 'checksum': '390e34173a0b08f53e5f71ec36e34a349e1e13af', 'mimetype': 'unknown', 'charset': 'unknown', 'version': None, 'attributes': [], 'attr_flags': ''}, 'invocation': {'module_args': {'path': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss/jboss-modules-custom', 'follow': False, 'get_md5': False, 'get_checksum': True, 'get_mime': True, 'get_attributes': True, 'checksum_algorithm': 'sha1'}}, 'failed': False, 'item': '/opt/ads-agent/_work/r684/a/_SICMU-intranet-update-config/jboss', 'ansible_loop_var': 'item'})
2026-06-11T18:43:55.9425136Z Thursday 11 June 2026  15:43:55 -0300 (0:00:00.061)       0:00:10.189 ********* 
2026-06-11T18:43:56.1809714Z 
2026-06-11T18:43:56.1810300Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-06-11T18:43:56.1811030Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-06-11T18:43:56.1811323Z Thursday 11 June 2026  15:43:56 -0300 (0:00:00.238)       0:00:10.427 ********* 
2026-06-11T18:43:56.1969241Z [WARNING]: TASK: Mostra lista de artefatos: The loop variable 'item' is already
2026-06-11T18:43:56.1969684Z in use. You should set the `loop_var` value in the `loop_control` option for
2026-06-11T18:43:56.1970245Z the task to something else to avoid variable collisions and unexpected
2026-06-11T18:43:56.1970465Z behavior.
2026-06-11T18:43:56.3495307Z 
2026-06-11T18:43:56.3495932Z TASK [Mostra lista de artefatos] ***********************************************
2026-06-11T18:43:56.3496535Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa', 'artifact_id': 'framework', 'version': '2.0.1', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3496856Z     "msg": "Artefato: framework - versao 2.0.1"
2026-06-11T18:43:56.3496994Z }
2026-06-11T18:43:56.3497267Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.psc', 'artifact_id': 'jconnector', 'version': '2.10', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3497523Z     "msg": "Artefato: jconnector - versao 2.10"
2026-06-11T18:43:56.3497647Z }
2026-06-11T18:43:56.3497934Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.primefaces', 'artifact_id': 'primefaces', 'version': '4.0', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3498182Z     "msg": "Artefato: primefaces - versao 4.0"
2026-06-11T18:43:56.3498304Z }
2026-06-11T18:43:56.3498764Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.apache.poi', 'artifact_id': 'poi', 'version': '3.9', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3499017Z     "msg": "Artefato: poi - versao 3.9"
2026-06-11T18:43:56.3499138Z }
2026-06-11T18:43:56.3499412Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.apache.poi', 'artifact_id': 'poi', 'version': '3.11', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3499654Z     "msg": "Artefato: poi - versao 3.11"
2026-06-11T18:43:56.3499776Z }
2026-06-11T18:43:56.3500038Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.sisgr', 'artifact_id': 'sisgr', 'version': '1.2', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3500276Z     "msg": "Artefato: sisgr - versao 1.2"
2026-06-11T18:43:56.3500391Z }
2026-06-11T18:43:56.3500657Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.lowagie', 'artifact_id': 'itext', 'version': '2.1.0', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3500892Z     "msg": "Artefato: itext - versao 2.1.0"
2026-06-11T18:43:56.3501012Z }
2026-06-11T18:43:56.3501282Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jfree', 'artifact_id': 'jcommon', 'version': '1.0.15', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3501528Z     "msg": "Artefato: jcommon - versao 1.0.15"
2026-06-11T18:43:56.3501651Z }
2026-06-11T18:43:56.3501922Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jfree', 'artifact_id': 'jfreechart', 'version': '1.0.9', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3502163Z     "msg": "Artefato: jfreechart - versao 1.0.9"
2026-06-11T18:43:56.3502283Z }
2026-06-11T18:43:56.3502565Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jasperreports', 'artifact_id': 'jasperreports', 'version': '3.5.3', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3502814Z     "msg": "Artefato: jasperreports - versao 3.5.3"
2026-06-11T18:43:56.3502919Z }
2026-06-11T18:43:56.3503205Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'apache.commons.fileupload', 'artifact_id': 'fileupload', 'version': '1.3', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3503747Z     "msg": "Artefato: fileupload - versao 1.3"
2026-06-11T18:43:56.3503869Z }
2026-06-11T18:43:56.3504403Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'commons-digester', 'artifact_id': 'commons-digester', 'version': '2.1', 'extension': 'jar'}) => {
2026-06-11T18:43:56.3504683Z     "msg": "Artefato: commons-digester - versao 2.1"
2026-06-11T18:43:56.3504809Z }
2026-06-11T18:43:56.3505056Z Thursday 11 June 2026  15:43:56 -0300 (0:00:00.168)       0:00:10.596 ********* 
2026-06-11T18:43:56.6685985Z [WARNING]: Skipped '/tmp/src/' path due to this access issue: '/tmp/src/' is
2026-06-11T18:43:56.6686226Z not a directory
2026-06-11T18:43:56.6798337Z 
2026-06-11T18:43:56.6798799Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-06-11T18:43:56.6798989Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-06-11T18:43:56.6799271Z Thursday 11 June 2026  15:43:56 -0300 (0:00:00.330)       0:00:10.927 ********* 
2026-06-11T18:43:56.7046462Z [WARNING]: conditional statements should not include jinja2 templating
2026-06-11T18:43:56.7046763Z delimiters such as {{ }} or {% %}. Found: '{{ inner_item.artifact_id }}-{{
2026-06-11T18:43:56.7047006Z inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in
2026-06-11T18:43:56.7047242Z files_found.files | map(attribute='path') | map('basename') | list
2026-06-11T18:43:56.7091466Z 
2026-06-11T18:43:56.7091646Z TASK [maven_artifact] **********************************************************
2026-06-11T18:43:56.7092477Z fatal: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]: FAILED! => {"msg": "The conditional check ''{{ inner_item.artifact_id }}-{{ inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in files_found.files | map(attribute='path') | map('basename') | list' failed. The error was: Conditional is marked as unsafe, and cannot be evaluated.\n\nThe error appears to be in '/opt/ads-agent/_work/r684/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml': line 23, column 3, but may\nbe elsewhere in the file depending on the exact syntax problem.\n\nThe offending line appears to be:\n\n\n- maven_artifact:\n  ^ here\n"}
2026-06-11T18:43:56.7092924Z 
2026-06-11T18:43:56.7093071Z PLAY RECAP *********************************************************************
2026-06-11T18:43:56.7093276Z caddeapllx2540.agil.nprd.caixa.gov.br : ok=29   changed=3    unreachable=0    failed=1    skipped=10   rescued=0    ignored=0   
2026-06-11T18:43:56.7093372Z 
2026-06-11T18:43:56.7093497Z Playbook run took 0 days, 0 hours, 0 minutes, 10 seconds
2026-06-11T18:43:56.7093759Z Thursday 11 June 2026  15:43:56 -0300 (0:00:00.029)       0:00:10.956 ********* 
2026-06-11T18:43:56.7093950Z =============================================================================== 
2026-06-11T18:43:56.7094192Z maven_artifact ---------------------------------------------------------- 2.17s
2026-06-11T18:43:56.7094432Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 1.43s
2026-06-11T18:43:56.7094677Z Gerando fatos de servicos ----------------------------------------------- 1.33s
2026-06-11T18:43:56.7094916Z Gathering Facts --------------------------------------------------------- 0.98s
2026-06-11T18:43:56.7095157Z Create a symbolic link -------------------------------------------------- 0.54s
2026-06-11T18:43:56.7095393Z Verifica se o arquivo  existe ------------------------------------------- 0.43s
2026-06-11T18:43:56.7095608Z Create a directory ------------------------------------------------------ 0.42s
2026-06-11T18:43:56.7095842Z Verifica se o arquivo  existe ------------------------------------------- 0.41s
2026-06-11T18:43:56.7096081Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.39s
2026-06-11T18:43:56.7096316Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.34s
2026-06-11T18:43:56.7096554Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.34s
2026-06-11T18:43:56.7096788Z Listar arquivos no diretório baixados anteriormente --------------------- 0.33s
2026-06-11T18:43:56.7097367Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.24s
2026-06-11T18:43:56.7097601Z nfs : Verifica se o arquivo nfs_config.json existe ---------------------- 0.23s
2026-06-11T18:43:56.7097835Z Mostra lista de artefatos ----------------------------------------------- 0.17s
2026-06-11T18:43:56.7098070Z Stop e Disable service jboss -------------------------------------------- 0.09s
2026-06-11T18:43:56.7098310Z Criando artefatos ------------------------------------------------------- 0.09s
2026-06-11T18:43:56.7098671Z Sem artefatos de deployments -------------------------------------------- 0.07s
2026-06-11T18:43:56.7098911Z Mostra artefatos -------------------------------------------------------- 0.06s
2026-06-11T18:43:56.7099141Z Criando artefatos modules ----------------------------------------------- 0.06s
2026-06-11T18:43:56.7812868Z ##[error]Bash exited with code '2'.
2026-06-11T18:43:56.7821606Z ##[section]Finishing: Deploy Config no JBOSS
