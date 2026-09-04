Ao suporte solicitamos analisar error no deploy no estágio de TQS
Release: SICMU-intranet-update-125

fatal: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]: FAILED! => {"msg": "The conditional check ''{{ inner_item.artifact_id }}-{{ inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in files_found.files | map(attribute='path') | map('basename') | list' failed. The error was: Conditional is marked as unsafe, and cannot be evaluated.\n\nThe error appears to be in '/opt/ads-agent/_work/r791/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml': line 23, column 3, but may\nbe elsewhere in the file depending on the exact syntax problem.\n\nThe offending line appears to be:\n\n\n- maven_artifact:\n  ^ here\n"}


2026-09-04T12:34:54.1629133Z ##[section]Starting: Deploy Config no JBOSS
2026-09-04T12:34:54.1633224Z ==============================================================================
2026-09-04T12:34:54.1633352Z Task         : Bash
2026-09-04T12:34:54.1633399Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-04T12:34:54.1633464Z Version      : 3.227.0
2026-09-04T12:34:54.1633556Z Author       : Microsoft Corporation
2026-09-04T12:34:54.1633613Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-04T12:34:54.1633691Z ==============================================================================
2026-09-04T12:34:54.3237767Z Generating script.
2026-09-04T12:34:54.3251191Z ========================== Starting Command Output ===========================
2026-09-04T12:34:54.3259687Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b184684f-76e3-498b-809d-efa2d67a5529.sh
2026-09-04T12:34:54.3361669Z /opt/ads-agent/_work/_temp/b184684f-76e3-498b-809d-efa2d67a5529.sh: line 2: quantidade_vm: command not found
2026-09-04T12:34:54.3384116Z /opt/ads-agent/_work/_temp/b184684f-76e3-498b-809d-efa2d67a5529.sh: line 2: USE_WMQ: command not found
2026-09-04T12:34:54.6890927Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-09-04T12:34:54.6893486Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-09-04T12:34:54.6894592Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-09-04T12:34:54.6894914Z setting deprecation_warnings=False in ansible.cfg.
2026-09-04T12:34:55.4218826Z [WARNING]: Found variable using reserved name: when
2026-09-04T12:34:55.4484097Z 
2026-09-04T12:34:55.4484716Z PLAY [local] *******************************************************************
2026-09-04T12:34:55.4484836Z 
2026-09-04T12:34:55.4485028Z PLAY [Configurando o DNS] ******************************************************
2026-09-04T12:34:55.4485153Z 
2026-09-04T12:34:55.4485349Z PLAY [local] *******************************************************************
2026-09-04T12:34:55.4485444Z 
2026-09-04T12:34:55.4486032Z PLAY [Verificando serviços] ****************************************************
2026-09-04T12:34:55.4486108Z 
2026-09-04T12:34:55.4486340Z PLAY [Configuração LDAP] *******************************************************
2026-09-04T12:34:55.4486457Z 
2026-09-04T12:34:55.4486582Z PLAY [jboss] *******************************************************************
2026-09-04T12:34:55.4486696Z 
2026-09-04T12:34:55.4486860Z PLAY [Stack Jboss] *************************************************************
2026-09-04T12:34:55.4487196Z Friday 04 September 2026  09:34:55 -0300 (0:00:00.138)       0:00:00.138 ****** 
2026-09-04T12:34:55.8633990Z 
2026-09-04T12:34:55.8635226Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-09-04T12:34:55.8635540Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:34:55.8635613Z 
2026-09-04T12:34:55.8635788Z PLAY [jboss] *******************************************************************
2026-09-04T12:34:55.8636146Z Friday 04 September 2026  09:34:55 -0300 (0:00:00.415)       0:00:00.553 ****** 
2026-09-04T12:34:56.1470379Z [WARNING]: Distribution rhel 9.3 on host caddeapllx2540.agil.nprd.caixa.gov.br
2026-09-04T12:34:56.1470796Z should use /usr/bin/python3, but is using /usr/bin/python for backward
2026-09-04T12:34:56.1470996Z compatibility with prior Ansible releases. See
2026-09-04T12:34:56.1471178Z https://docs.ansible.com/ansible-
2026-09-04T12:34:56.1471374Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-09-04T12:34:56.1534468Z 
2026-09-04T12:34:56.1535206Z TASK [nfs : Verifica se o arquivo nfs_config.json existe] **********************
2026-09-04T12:34:56.1537204Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-09-04T12:34:56.1537903Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.289)       0:00:00.843 ****** 
2026-09-04T12:34:56.1944371Z 
2026-09-04T12:34:56.1945344Z TASK [nfs : include_tasks] *****************************************************
2026-09-04T12:34:56.1946886Z included: /opt/ads-agent/_work/r791/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2540.agil.nprd.caixa.gov.br
2026-09-04T12:34:56.1947561Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.040)       0:00:00.884 ****** 
2026-09-04T12:34:56.2416512Z 
2026-09-04T12:34:56.2417868Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-04T12:34:56.2418100Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:34:56.2418422Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.047)       0:00:00.931 ****** 
2026-09-04T12:34:56.7214056Z 
2026-09-04T12:34:56.7215647Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-09-04T12:34:56.7216178Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-09-04T12:34:56.7216706Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.479)       0:00:01.411 ****** 
2026-09-04T12:34:56.7698851Z 
2026-09-04T12:34:56.7699794Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-09-04T12:34:56.7700086Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br] => {
2026-09-04T12:34:56.7700294Z     "nfs_vars_json": {
2026-09-04T12:34:56.7700486Z         "changed": false,
2026-09-04T12:34:56.7700984Z         "cmd": "cat /opt/ads-agent/_work/r791/a/nfs_config.json",
2026-09-04T12:34:56.7701224Z         "delta": "0:00:00.006885",
2026-09-04T12:34:56.7701486Z         "end": "2026-09-04 09:34:56.668212",
2026-09-04T12:34:56.7701683Z         "failed": false,
2026-09-04T12:34:56.7701858Z         "msg": "",
2026-09-04T12:34:56.7701958Z         "rc": 0,
2026-09-04T12:34:56.7702213Z         "start": "2026-09-04 09:34:56.661327",
2026-09-04T12:34:56.7702420Z         "stderr": "",
2026-09-04T12:34:56.7702606Z         "stderr_lines": [],
2026-09-04T12:34:56.7702784Z         "stdout": "[]",
2026-09-04T12:34:56.7702967Z         "stdout_lines": [
2026-09-04T12:34:56.7703135Z             "[]"
2026-09-04T12:34:56.7703302Z         ],
2026-09-04T12:34:56.7703472Z         "warnings": [
2026-09-04T12:34:56.7703911Z             "Distribution rhel 9.3 on host caddeapllx2540.agil.nprd.caixa.gov.br should use /usr/bin/python3, but is using /usr/bin/python for backward compatibility with prior Ansible releases. See https://docs.ansible.com/ansible-core/2.14/reference_appendices/interpreter_discovery.html for more information"
2026-09-04T12:34:56.7704316Z         ]
2026-09-04T12:34:56.7704406Z     }
2026-09-04T12:34:56.7704565Z }
2026-09-04T12:34:56.7704846Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.048)       0:00:01.460 ****** 
2026-09-04T12:34:56.8274555Z 
2026-09-04T12:34:56.8275876Z TASK [nfs : Criar variáveis] ***************************************************
2026-09-04T12:34:56.8276350Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:34:56.8276731Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.057)       0:00:01.517 ****** 
2026-09-04T12:34:56.8626379Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.034)       0:00:01.552 ****** 
2026-09-04T12:34:56.8988859Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.036)       0:00:01.588 ****** 
2026-09-04T12:34:56.9341269Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.035)       0:00:01.624 ****** 
2026-09-04T12:34:56.9768420Z Friday 04 September 2026  09:34:56 -0300 (0:00:00.042)       0:00:01.666 ****** 
2026-09-04T12:34:57.0120419Z Friday 04 September 2026  09:34:57 -0300 (0:00:00.035)       0:00:01.702 ****** 
2026-09-04T12:34:57.0488744Z Friday 04 September 2026  09:34:57 -0300 (0:00:00.036)       0:00:01.738 ****** 
2026-09-04T12:34:57.1215596Z 
2026-09-04T12:34:57.1216522Z PLAY [jboss] *******************************************************************
2026-09-04T12:34:57.1216603Z 
2026-09-04T12:34:57.1217229Z PLAY [jboss] *******************************************************************
2026-09-04T12:34:57.1217996Z Friday 04 September 2026  09:34:57 -0300 (0:00:00.072)       0:00:01.811 ****** 
2026-09-04T12:34:58.2950108Z 
2026-09-04T12:34:58.2951156Z TASK [Gathering Facts] *********************************************************
2026-09-04T12:34:58.2952128Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:34:58.2952987Z Friday 04 September 2026  09:34:58 -0300 (0:00:01.173)       0:00:02.984 ****** 
2026-09-04T12:34:59.7260103Z 
2026-09-04T12:34:59.7260959Z TASK [Gerando fatos de servicos] ***********************************************
2026-09-04T12:34:59.7261177Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:34:59.7261832Z Friday 04 September 2026  09:34:59 -0300 (0:00:01.431)       0:00:04.416 ****** 
2026-09-04T12:34:59.7888367Z 
2026-09-04T12:34:59.7889288Z TASK [Gerando lista de units jboss] ********************************************
2026-09-04T12:34:59.7889512Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:34:59.7890325Z Friday 04 September 2026  09:34:59 -0300 (0:00:00.062)       0:00:04.478 ****** 
2026-09-04T12:34:59.8261540Z Friday 04 September 2026  09:34:59 -0300 (0:00:00.037)       0:00:04.516 ****** 
2026-09-04T12:34:59.9378403Z 
2026-09-04T12:34:59.9379252Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-04T12:34:59.9379930Z Friday 04 September 2026  09:34:59 -0300 (0:00:00.111)       0:00:04.627 ****** 
2026-09-04T12:34:59.9947419Z 
2026-09-04T12:34:59.9948582Z TASK [Cria variável build_repository_name] *************************************
2026-09-04T12:34:59.9948817Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:34:59.9949138Z Friday 04 September 2026  09:34:59 -0300 (0:00:00.057)       0:00:04.685 ****** 
2026-09-04T12:35:00.0419119Z 
2026-09-04T12:35:00.0419942Z TASK [Buscando diretorio de config] ********************************************
2026-09-04T12:35:00.0420169Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:35:00.0420852Z Friday 04 September 2026  09:35:00 -0300 (0:00:00.047)       0:00:04.732 ****** 
2026-09-04T12:35:00.0896552Z 
2026-09-04T12:35:00.0897584Z TASK [Buscando diretorio de config] ********************************************
2026-09-04T12:35:00.0897851Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:35:00.0898500Z Friday 04 September 2026  09:35:00 -0300 (0:00:00.047)       0:00:04.780 ****** 
2026-09-04T12:35:00.7308438Z 
2026-09-04T12:35:00.7310353Z TASK [Create a symbolic link] **************************************************
2026-09-04T12:35:00.7311208Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config)
2026-09-04T12:35:00.7311617Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss)
2026-09-04T12:35:00.7312066Z Friday 04 September 2026  09:35:00 -0300 (0:00:00.641)       0:00:05.421 ****** 
2026-09-04T12:35:01.2540731Z 
2026-09-04T12:35:01.2541538Z TASK [Verifica se o arquivo  existe] *******************************************
2026-09-04T12:35:01.2543781Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config)
2026-09-04T12:35:01.2545103Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss)
2026-09-04T12:35:01.2545575Z Friday 04 September 2026  09:35:01 -0300 (0:00:00.523)       0:00:05.944 ****** 
2026-09-04T12:35:01.3512758Z 
2026-09-04T12:35:01.3513748Z TASK [Criando artefatos] *******************************************************
2026-09-04T12:35:01.3515842Z included: /opt/ads-agent/_work/r791/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx2540.agil.nprd.caixa.gov.br => (item={'changed': False, 'stat': {'exists': True, 'path': '/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss/jboss-deployments', 'mode': '0644', 'isdir': False, 'ischr': False, 'isblk': False, 'isreg': True, 'isfifo': False, 'islnk': False, 'issock': False, 'uid': 0, 'gid': 0, 'size': 166, 'inode': 75511217, 'dev': 168, 'nlink': 1, 'atime': 1788525241.718594, 'mtime': 1788525241.718594, 'ctime': 1788525241.718594, 'wusr': True, 'rusr': True, 'xusr': False, 'wgrp': False, 'rgrp': True, 'xgrp': False, 'woth': False, 'roth': True, 'xoth': False, 'isuid': False, 'isgid': False, 'blocks': 8, 'block_size': 4096, 'device_type': 0, 'readable': True, 'writeable': True, 'executable': False, 'pw_name': 'root', 'gr_name': 'root', 'checksum': '378ee59a21ec06f69f132a814fff71ad845b6dfb', 'mimetype': 'unknown', 'charset': 'unknown', 'version': None, 'attributes': [], 'attr_flags': ''}, 'invocation': {'module_args': {'path': '/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss/jboss-deployments', 'follow': False, 'get_md5': False, 'get_checksum': True, 'get_mime': True, 'get_attributes': True, 'checksum_algorithm': 'sha1'}}, 'failed': False, 'item': '/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss', 'ansible_loop_var': 'item'})
2026-09-04T12:35:01.3517707Z Friday 04 September 2026  09:35:01 -0300 (0:00:00.096)       0:00:06.041 ****** 
2026-09-04T12:35:01.8833263Z 
2026-09-04T12:35:01.8834246Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-09-04T12:35:01.8834807Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-09-04T12:35:01.8835164Z Friday 04 September 2026  09:35:01 -0300 (0:00:00.532)       0:00:06.573 ****** 
2026-09-04T12:35:01.9017536Z [WARNING]: TASK: Mostra artefatos: The loop variable 'item' is already in use.
2026-09-04T12:35:01.9018024Z You should set the `loop_var` value in the `loop_control` option for the task
2026-09-04T12:35:01.9018316Z to something else to avoid variable collisions and unexpected behavior.
2026-09-04T12:35:01.9532880Z 
2026-09-04T12:35:01.9533992Z TASK [Mostra artefatos] ********************************************************
2026-09-04T12:35:01.9535163Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.ibm.mq', 'artifact_id': 'wmq.jmsra', 'version': '9.0.4.0', 'extension': 'rar'}) => {
2026-09-04T12:35:01.9535693Z     "msg": "Artefato: wmq.jmsra - versao 9.0.4.0"
2026-09-04T12:35:01.9536099Z }
2026-09-04T12:35:01.9536495Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.jcics', 'artifact_id': 'framework', 'version': '3.0.0', 'extension': 'jar'}) => {
2026-09-04T12:35:01.9536815Z     "msg": "Artefato: framework - versao 3.0.0"
2026-09-04T12:35:01.9536919Z }
2026-09-04T12:35:01.9537461Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.microsoft.azure', 'artifact_id': 'applicationinsights-agent', 'version': '3.3.1', 'extension': 'jar'}) => {
2026-09-04T12:35:01.9537818Z     "msg": "Artefato: applicationinsights-agent - versao 3.3.1"
2026-09-04T12:35:01.9538013Z }
2026-09-04T12:35:01.9538323Z Friday 04 September 2026  09:35:01 -0300 (0:00:00.069)       0:00:06.643 ****** 
2026-09-04T12:35:03.8260878Z 
2026-09-04T12:35:03.8261907Z TASK [maven_artifact] **********************************************************
2026-09-04T12:35:03.8263944Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.ibm.mq', 'artifact_id': 'wmq.jmsra', 'version': '9.0.4.0', 'extension': 'rar'})
2026-09-04T12:35:03.8264497Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.jcics', 'artifact_id': 'framework', 'version': '3.0.0', 'extension': 'jar'})
2026-09-04T12:35:03.8264932Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.microsoft.azure', 'artifact_id': 'applicationinsights-agent', 'version': '3.3.1', 'extension': 'jar'})
2026-09-04T12:35:03.8265317Z Friday 04 September 2026  09:35:03 -0300 (0:00:01.872)       0:00:08.516 ****** 
2026-09-04T12:35:05.3729912Z 
2026-09-04T12:35:05.3730893Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-09-04T12:35:05.3731534Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:35:05.3732116Z Friday 04 September 2026  09:35:05 -0300 (0:00:01.546)       0:00:10.063 ****** 
2026-09-04T12:35:05.4561178Z 
2026-09-04T12:35:05.4562869Z PLAY [Copiando modules adicionais] *********************************************
2026-09-04T12:35:05.4563721Z Friday 04 September 2026  09:35:05 -0300 (0:00:00.083)       0:00:10.146 ****** 
2026-09-04T12:35:05.5157758Z 
2026-09-04T12:35:05.5159408Z TASK [Cria variável build_repository_name] *************************************
2026-09-04T12:35:05.5159797Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:35:05.5160125Z Friday 04 September 2026  09:35:05 -0300 (0:00:00.059)       0:00:10.206 ****** 
2026-09-04T12:35:05.5582830Z 
2026-09-04T12:35:05.5583661Z TASK [Buscando diretorio de config] ********************************************
2026-09-04T12:35:05.5584107Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:35:05.5584744Z Friday 04 September 2026  09:35:05 -0300 (0:00:00.042)       0:00:10.248 ****** 
2026-09-04T12:35:05.6020514Z 
2026-09-04T12:35:05.6021325Z TASK [Buscando diretorio de config] ********************************************
2026-09-04T12:35:05.6021544Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:35:05.6022221Z Friday 04 September 2026  09:35:05 -0300 (0:00:00.044)       0:00:10.292 ****** 
2026-09-04T12:35:06.1188171Z 
2026-09-04T12:35:06.1189015Z TASK [Create a directory] ******************************************************
2026-09-04T12:35:06.1189648Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config)
2026-09-04T12:35:06.1190083Z changed: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss)
2026-09-04T12:35:06.1190466Z Friday 04 September 2026  09:35:06 -0300 (0:00:00.516)       0:00:10.809 ****** 
2026-09-04T12:35:06.5779492Z 
2026-09-04T12:35:06.5780872Z TASK [Verifica se o arquivo  existe] *******************************************
2026-09-04T12:35:06.5781727Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config)
2026-09-04T12:35:06.5782372Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss)
2026-09-04T12:35:06.5782858Z Friday 04 September 2026  09:35:06 -0300 (0:00:00.459)       0:00:11.268 ****** 
2026-09-04T12:35:06.6505878Z 
2026-09-04T12:35:06.6506809Z TASK [Criando artefatos modules] ***********************************************
2026-09-04T12:35:06.6509211Z included: /opt/ads-agent/_work/r791/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx2540.agil.nprd.caixa.gov.br => (item={'changed': False, 'stat': {'exists': True, 'path': '/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss/jboss-modules-custom', 'mode': '0644', 'isdir': False, 'ischr': False, 'isblk': False, 'isreg': True, 'isfifo': False, 'islnk': False, 'issock': False, 'uid': 0, 'gid': 0, 'size': 435, 'inode': 75511218, 'dev': 168, 'nlink': 1, 'atime': 1788525241.718594, 'mtime': 1788525241.718594, 'ctime': 1788525241.718594, 'wusr': True, 'rusr': True, 'xusr': False, 'wgrp': False, 'rgrp': True, 'xgrp': False, 'woth': False, 'roth': True, 'xoth': False, 'isuid': False, 'isgid': False, 'blocks': 8, 'block_size': 4096, 'device_type': 0, 'readable': True, 'writeable': True, 'executable': False, 'pw_name': 'root', 'gr_name': 'root', 'checksum': '390e34173a0b08f53e5f71ec36e34a349e1e13af', 'mimetype': 'unknown', 'charset': 'unknown', 'version': None, 'attributes': [], 'attr_flags': ''}, 'invocation': {'module_args': {'path': '/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss/jboss-modules-custom', 'follow': False, 'get_md5': False, 'get_checksum': True, 'get_mime': True, 'get_attributes': True, 'checksum_algorithm': 'sha1'}}, 'failed': False, 'item': '/opt/ads-agent/_work/r791/a/_SICMU-intranet-update-config/jboss', 'ansible_loop_var': 'item'})
2026-09-04T12:35:06.6510821Z Friday 04 September 2026  09:35:06 -0300 (0:00:00.072)       0:00:11.340 ****** 
2026-09-04T12:35:06.9631980Z 
2026-09-04T12:35:06.9632924Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-09-04T12:35:06.9633917Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]
2026-09-04T12:35:06.9634273Z Friday 04 September 2026  09:35:06 -0300 (0:00:00.312)       0:00:11.653 ****** 
2026-09-04T12:35:06.9825558Z [WARNING]: TASK: Mostra lista de artefatos: The loop variable 'item' is already
2026-09-04T12:35:06.9825888Z in use. You should set the `loop_var` value in the `loop_control` option for
2026-09-04T12:35:06.9826133Z the task to something else to avoid variable collisions and unexpected
2026-09-04T12:35:06.9826343Z behavior.
2026-09-04T12:35:07.1505997Z 
2026-09-04T12:35:07.1506755Z TASK [Mostra lista de artefatos] ***********************************************
2026-09-04T12:35:07.1507633Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa', 'artifact_id': 'framework', 'version': '2.0.1', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1507938Z     "msg": "Artefato: framework - versao 2.0.1"
2026-09-04T12:35:07.1508107Z }
2026-09-04T12:35:07.1508437Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.psc', 'artifact_id': 'jconnector', 'version': '2.10', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1508717Z     "msg": "Artefato: jconnector - versao 2.10"
2026-09-04T12:35:07.1508858Z }
2026-09-04T12:35:07.1509122Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.primefaces', 'artifact_id': 'primefaces', 'version': '4.0', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1509821Z     "msg": "Artefato: primefaces - versao 4.0"
2026-09-04T12:35:07.1509964Z }
2026-09-04T12:35:07.1510275Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.apache.poi', 'artifact_id': 'poi', 'version': '3.9', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1510551Z     "msg": "Artefato: poi - versao 3.9"
2026-09-04T12:35:07.1510700Z }
2026-09-04T12:35:07.1511005Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'org.apache.poi', 'artifact_id': 'poi', 'version': '3.11', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1511585Z     "msg": "Artefato: poi - versao 3.11"
2026-09-04T12:35:07.1511749Z }
2026-09-04T12:35:07.1512058Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'br.gov.caixa.sisgr', 'artifact_id': 'sisgr', 'version': '1.2', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1512328Z     "msg": "Artefato: sisgr - versao 1.2"
2026-09-04T12:35:07.1512468Z }
2026-09-04T12:35:07.1512768Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'com.lowagie', 'artifact_id': 'itext', 'version': '2.1.0', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1513045Z     "msg": "Artefato: itext - versao 2.1.0"
2026-09-04T12:35:07.1513146Z }
2026-09-04T12:35:07.1513442Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jfree', 'artifact_id': 'jcommon', 'version': '1.0.15', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1513709Z     "msg": "Artefato: jcommon - versao 1.0.15"
2026-09-04T12:35:07.1513855Z }
2026-09-04T12:35:07.1514156Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jfree', 'artifact_id': 'jfreechart', 'version': '1.0.9', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1514467Z     "msg": "Artefato: jfreechart - versao 1.0.9"
2026-09-04T12:35:07.1514616Z }
2026-09-04T12:35:07.1514924Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'jasperreports', 'artifact_id': 'jasperreports', 'version': '3.5.3', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1515203Z     "msg": "Artefato: jasperreports - versao 3.5.3"
2026-09-04T12:35:07.1515346Z }
2026-09-04T12:35:07.1515666Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'apache.commons.fileupload', 'artifact_id': 'fileupload', 'version': '1.3', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1516387Z     "msg": "Artefato: fileupload - versao 1.3"
2026-09-04T12:35:07.1516533Z }
2026-09-04T12:35:07.1516957Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost] => (item={'group_id': 'commons-digester', 'artifact_id': 'commons-digester', 'version': '2.1', 'extension': 'jar'}) => {
2026-09-04T12:35:07.1517234Z     "msg": "Artefato: commons-digester - versao 2.1"
2026-09-04T12:35:07.1517460Z }
2026-09-04T12:35:07.1517744Z Friday 04 September 2026  09:35:07 -0300 (0:00:00.187)       0:00:11.840 ****** 
2026-09-04T12:35:07.5160865Z [WARNING]: Skipped '/tmp/src/' path due to this access issue: '/tmp/src/' is
2026-09-04T12:35:07.5161409Z not a directory
2026-09-04T12:35:07.5301882Z 
2026-09-04T12:35:07.5303003Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-09-04T12:35:07.5303342Z ok: [caddeapllx2540.agil.nprd.caixa.gov.br]
2026-09-04T12:35:07.5303704Z Friday 04 September 2026  09:35:07 -0300 (0:00:00.379)       0:00:12.220 ****** 
2026-09-04T12:35:07.5593806Z [WARNING]: conditional statements should not include jinja2 templating
2026-09-04T12:35:07.5594760Z delimiters such as {{ }} or {% %}. Found: '{{ inner_item.artifact_id }}-{{
2026-09-04T12:35:07.5595082Z inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in
2026-09-04T12:35:07.5595405Z files_found.files | map(attribute='path') | map('basename') | list
2026-09-04T12:35:07.5652509Z 
2026-09-04T12:35:07.5652689Z TASK [maven_artifact] **********************************************************
2026-09-04T12:35:07.5653790Z fatal: [caddeapllx2540.agil.nprd.caixa.gov.br -> localhost]: FAILED! => {"msg": "The conditional check ''{{ inner_item.artifact_id }}-{{ inner_item.version }}.{{ inner_item.extension|default('jar',true) }}' not in files_found.files | map(attribute='path') | map('basename') | list' failed. The error was: Conditional is marked as unsafe, and cannot be evaluated.\n\nThe error appears to be in '/opt/ads-agent/_work/r791/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml': line 23, column 3, but may\nbe elsewhere in the file depending on the exact syntax problem.\n\nThe offending line appears to be:\n\n\n- maven_artifact:\n  ^ here\n"}
2026-09-04T12:35:07.5654271Z 
2026-09-04T12:35:07.5654456Z PLAY RECAP *********************************************************************
2026-09-04T12:35:07.5654700Z caddeapllx2540.agil.nprd.caixa.gov.br : ok=29   changed=3    unreachable=0    failed=1    skipped=10   rescued=0    ignored=0   
2026-09-04T12:35:07.5654793Z 
2026-09-04T12:35:07.5654958Z Playbook run took 0 days, 0 hours, 0 minutes, 12 seconds
2026-09-04T12:35:07.5655277Z Friday 04 September 2026  09:35:07 -0300 (0:00:00.035)       0:00:12.255 ****** 
2026-09-04T12:35:07.5655499Z =============================================================================== 
2026-09-04T12:35:07.5655772Z maven_artifact ---------------------------------------------------------- 1.87s
2026-09-04T12:35:07.5656043Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 1.55s
2026-09-04T12:35:07.5656310Z Gerando fatos de servicos ----------------------------------------------- 1.43s
2026-09-04T12:35:07.5656583Z Gathering Facts --------------------------------------------------------- 1.17s
2026-09-04T12:35:07.5656842Z Create a symbolic link -------------------------------------------------- 0.64s
2026-09-04T12:35:07.5657108Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.53s
2026-09-04T12:35:07.5657473Z Verifica se o arquivo  existe ------------------------------------------- 0.52s
2026-09-04T12:35:07.5657738Z Create a directory ------------------------------------------------------ 0.52s
2026-09-04T12:35:07.5658016Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.48s
2026-09-04T12:35:07.5658278Z Verifica se o arquivo  existe ------------------------------------------- 0.46s
2026-09-04T12:35:07.5658828Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.42s
2026-09-04T12:35:07.5659094Z Listar arquivos no diretório baixados anteriormente --------------------- 0.38s
2026-09-04T12:35:07.5659466Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.31s
2026-09-04T12:35:07.5659725Z nfs : Verifica se o arquivo nfs_config.json existe ---------------------- 0.29s
2026-09-04T12:35:07.5659987Z Mostra lista de artefatos ----------------------------------------------- 0.19s
2026-09-04T12:35:07.5660255Z Stop e Disable service jboss -------------------------------------------- 0.11s
2026-09-04T12:35:07.5660747Z Criando artefatos ------------------------------------------------------- 0.10s
2026-09-04T12:35:07.5661015Z Sem artefatos de deployments -------------------------------------------- 0.08s
2026-09-04T12:35:07.5661271Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-09-04T12:35:07.5661533Z Criando artefatos modules ----------------------------------------------- 0.07s
2026-09-04T12:35:07.7269055Z ##[error]Bash exited with code '2'.
2026-09-04T12:35:07.7313409Z ##[section]Finishing: Deploy Config no JBOSS





-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
root     11016     1  0 Jun29 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    11019 11016  0 Jun29 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    11155 11019  0 Jun29 ?        05:10:49 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
p585600  30681 30629  0 11:23 pts/0    00:00:00 grep --color=auto jboss
-sh-4.2$ ps -ef | grep java
jboss    11155 11019  0 Jun29 ?        05:10:49 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
p585600  30686 30629  0 11:23 pts/0    00:00:00 grep --color=auto java
-sh-4.2$ ps -ef | grep sicmu
root     11016     1  0 Jun29 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    11019 11016  0 Jun29 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    11155 11019  0 Jun29 ?        05:10:49 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
p585600  30691 30629  0 11:23 pts/0    00:00:00 grep --color=auto sicmu
-sh-4.2$
