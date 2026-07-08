2026-07-08T17:09:31.7698504Z ##[section]Starting: Configurando o Apache
2026-07-08T17:09:31.7702736Z ==============================================================================
2026-07-08T17:09:31.7702859Z Task         : Bash
2026-07-08T17:09:31.7702907Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-08T17:09:31.7702971Z Version      : 3.227.0
2026-07-08T17:09:31.7703024Z Author       : Microsoft Corporation
2026-07-08T17:09:31.7703075Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-08T17:09:31.7703153Z ==============================================================================
2026-07-08T17:09:32.6365166Z Generating script.
2026-07-08T17:09:32.6380846Z ========================== Starting Command Output ===========================
2026-07-08T17:09:32.6388736Z [command]/bin/bash /opt/ads-agent/_work/_temp/049c1c02-0053-429c-9db3-bbe750fa205b.sh
2026-07-08T17:09:32.6458955Z Variáveis de ambiente que terminam com 'secureFiles':
2026-07-08T17:09:32.6459504Z /opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks,/opt/ads-agent/_work/_temp/caixa-truststore-acteste-nprd.jks
2026-07-08T17:09:32.6481288Z /opt/ads-agent/_work/_temp/049c1c02-0053-429c-9db3-bbe750fa205b.sh: line 22: quantidade_vm: comando não encontrado
2026-07-08T17:09:32.6485028Z /opt/ads-agent/_work/_temp/049c1c02-0053-429c-9db3-bbe750fa205b.sh: line 22: apache_local: comando não encontrado
2026-07-08T17:09:34.9327105Z 
2026-07-08T17:09:34.9327780Z PLAY [local] *******************************************************************
2026-07-08T17:09:34.9634954Z 
2026-07-08T17:09:34.9635486Z PLAY [Configurando o DNS] ******************************************************
2026-07-08T17:09:35.1679137Z 
2026-07-08T17:09:35.1679683Z PLAY [local] *******************************************************************
2026-07-08T17:09:35.1715451Z 
2026-07-08T17:09:35.1716156Z PLAY [Verificando serviços] ****************************************************
2026-07-08T17:09:35.1800869Z 
2026-07-08T17:09:35.1801517Z PLAY [Configuração LDAP] *******************************************************
2026-07-08T17:09:35.1835788Z [WARNING]: Found variable using reserved name: when
2026-07-08T17:09:35.1839673Z 
2026-07-08T17:09:35.1840200Z PLAY [jboss] *******************************************************************
2026-07-08T17:09:35.2162298Z Wednesday 08 July 2026  14:09:35 -0300 (0:00:00.355)       0:00:00.355 ******** 
2026-07-08T17:09:35.2889960Z 
2026-07-08T17:09:35.2890442Z TASK [Sobrescrevendo groups vars] **********************************************
2026-07-08T17:09:35.2890677Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:35.2919226Z Wednesday 08 July 2026  14:09:35 -0300 (0:00:00.075)       0:00:00.431 ******** 
2026-07-08T17:09:35.3502322Z 
2026-07-08T17:09:35.3503735Z TASK [apache : Cria variável build_repository_name] ****************************
2026-07-08T17:09:35.3503978Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:35.3528261Z Wednesday 08 July 2026  14:09:35 -0300 (0:00:00.060)       0:00:00.492 ******** 
2026-07-08T17:09:35.4083231Z 
2026-07-08T17:09:35.4083791Z TASK [apache : Buscando diretorio de config] ***********************************
2026-07-08T17:09:35.4083956Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:35.4121020Z Wednesday 08 July 2026  14:09:35 -0300 (0:00:00.059)       0:00:00.551 ******** 
2026-07-08T17:09:35.9232139Z 
2026-07-08T17:09:35.9232887Z TASK [apache : Ansible Create directory /opt/httpd/conf.d/old if not exists] ***
2026-07-08T17:09:35.9234589Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-07-08T17:09:35.9235239Z caddeapllx2577.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-07-08T17:09:35.9235548Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-07-08T17:09:35.9235854Z releases. A future Ansible release will default to using the discovered 
2026-07-08T17:09:35.9236135Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-07-08T17:09:35.9236755Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-07-08T17:09:35.9237045Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-07-08T17:09:35.9237304Z setting deprecation_warnings=False in ansible.cfg.
2026-07-08T17:09:35.9237550Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:35.9265993Z Wednesday 08 July 2026  14:09:35 -0300 (0:00:00.514)       0:00:01.066 ******** 
2026-07-08T17:09:36.2939670Z 
2026-07-08T17:09:36.2940441Z TASK [apache : Listar arquivos da pasta conf.d] ********************************
2026-07-08T17:09:36.2940817Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:36.2970091Z Wednesday 08 July 2026  14:09:36 -0300 (0:00:00.370)       0:00:01.436 ******** 
2026-07-08T17:09:36.3531688Z Wednesday 08 July 2026  14:09:36 -0300 (0:00:00.055)       0:00:01.492 ******** 
2026-07-08T17:09:36.6084569Z 
2026-07-08T17:09:36.6085876Z TASK [apache : Ansible Create directory /opt/httpd/htdocs/httpd_eap_esteiraagil if not exists] ***
2026-07-08T17:09:36.6086205Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:36.6120351Z Wednesday 08 July 2026  14:09:36 -0300 (0:00:00.259)       0:00:01.751 ******** 
2026-07-08T17:09:37.6498622Z 
2026-07-08T17:09:37.6499690Z TASK [apache : Unarchiving Artifacts [HTDOCS]] *********************************
2026-07-08T17:09:37.6500266Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:37.6537748Z Wednesday 08 July 2026  14:09:37 -0300 (0:00:01.041)       0:00:02.793 ******** 
2026-07-08T17:09:38.0918073Z 
2026-07-08T17:09:38.0918834Z TASK [apache : Allow new incoming SYN packets on TCP port 80 (HTTP)] ***********
2026-07-08T17:09:38.0919410Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:38.0941123Z Wednesday 08 July 2026  14:09:38 -0300 (0:00:00.440)       0:00:03.233 ******** 
2026-07-08T17:09:38.3428711Z 
2026-07-08T17:09:38.3429711Z TASK [apache : Allow new incoming SYN packets on TCP port 443 (HTTPS)] *********
2026-07-08T17:09:38.3430708Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:38.3469680Z Wednesday 08 July 2026  14:09:38 -0300 (0:00:00.252)       0:00:03.486 ******** 
2026-07-08T17:09:38.5928142Z 
2026-07-08T17:09:38.5929179Z TASK [Cria pasta para monitoração customizada do apache caso não exista] *******
2026-07-08T17:09:38.5930253Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:38.5960290Z Wednesday 08 July 2026  14:09:38 -0300 (0:00:00.249)       0:00:03.735 ******** 
2026-07-08T17:09:39.4228295Z 
2026-07-08T17:09:39.4229096Z TASK [apache : Create config file httpd.conf] **********************************
2026-07-08T17:09:39.4229875Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:39.4255652Z Wednesday 08 July 2026  14:09:39 -0300 (0:00:00.829)       0:00:04.565 ******** 
2026-07-08T17:09:39.6677448Z 
2026-07-08T17:09:39.6678473Z TASK [apache : Extrai linhas entre strings que começam com "# mandatory LogFormat"] ***
2026-07-08T17:09:39.6678662Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:39.6705302Z Wednesday 08 July 2026  14:09:39 -0300 (0:00:00.245)       0:00:04.810 ******** 
2026-07-08T17:09:40.3111765Z 
2026-07-08T17:09:40.3112643Z TASK [apache : Deploy Virtual Host] ********************************************
2026-07-08T17:09:40.3113192Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:40.3149248Z Wednesday 08 July 2026  14:09:40 -0300 (0:00:00.644)       0:00:05.454 ******** 
2026-07-08T17:09:40.9508136Z 
2026-07-08T17:09:40.9509006Z TASK [apache : Apache | Create file] *******************************************
2026-07-08T17:09:40.9509487Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:40.9537622Z Wednesday 08 July 2026  14:09:40 -0300 (0:00:00.639)       0:00:06.093 ******** 
2026-07-08T17:09:42.4809276Z 
2026-07-08T17:09:42.4810349Z TASK [Apache | Start apache] ***************************************************
2026-07-08T17:09:42.4810665Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:42.4926417Z Wednesday 08 July 2026  14:09:42 -0300 (0:00:01.538)       0:00:07.632 ******** 
2026-07-08T17:09:42.8384017Z 
2026-07-08T17:09:42.8384716Z TASK [apache : Get httpd.conf status] ******************************************
2026-07-08T17:09:42.8385405Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config)
2026-07-08T17:09:43.1504054Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd)
2026-07-08T17:09:43.1589272Z Wednesday 08 July 2026  14:09:43 -0300 (0:00:00.666)       0:00:08.298 ******** 
2026-07-08T17:09:43.4967290Z 
2026-07-08T17:09:43.4968063Z TASK [apache : Get vhost.conf status] ******************************************
2026-07-08T17:09:43.4968702Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config)
2026-07-08T17:09:43.7976356Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd)
2026-07-08T17:09:43.8039776Z Wednesday 08 July 2026  14:09:43 -0300 (0:00:00.645)       0:00:08.943 ******** 
2026-07-08T17:09:44.1417570Z 
2026-07-08T17:09:44.1418862Z TASK [apache : Get httpd-des.conf status] **************************************
2026-07-08T17:09:44.1419411Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config)
2026-07-08T17:09:44.4448521Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd)
2026-07-08T17:09:44.4518094Z Wednesday 08 July 2026  14:09:44 -0300 (0:00:00.647)       0:00:09.591 ******** 
2026-07-08T17:09:44.8048463Z 
2026-07-08T17:09:44.8049237Z TASK [apache : Get vhost-des.conf status] **************************************
2026-07-08T17:09:44.8049953Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config)
2026-07-08T17:09:45.1107362Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd)
2026-07-08T17:09:45.1194560Z Wednesday 08 July 2026  14:09:45 -0300 (0:00:00.667)       0:00:10.258 ******** 
2026-07-08T17:09:45.4969156Z 
2026-07-08T17:09:45.4970025Z TASK [apache : Get 00-mpm.conf status] *****************************************
2026-07-08T17:09:45.4970412Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config)
2026-07-08T17:09:45.7915554Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd)
2026-07-08T17:09:45.7986536Z Wednesday 08 July 2026  14:09:45 -0300 (0:00:00.679)       0:00:10.938 ******** 
2026-07-08T17:09:46.1685430Z 
2026-07-08T17:09:46.1686292Z TASK [apache : Get 00-proxy.conf status] ***************************************
2026-07-08T17:09:46.1686613Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config)
2026-07-08T17:09:46.4944055Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd)
2026-07-08T17:09:46.4986711Z Wednesday 08 July 2026  14:09:46 -0300 (0:00:00.700)       0:00:11.638 ******** 
2026-07-08T17:09:47.1709745Z 
2026-07-08T17:09:47.1710312Z TASK [apache : Copiando arquivo httpd.conf] ************************************
2026-07-08T17:09:47.1712446Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=[{u'failed': False, u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1783530527.6069424, u'block_size': 4096, u'inode': 293603742, u'isgid': False, u'size': 28035, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744072990020633', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 56, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/httpd.conf', u'xusr': False, u'atime': 1783530527.6069424, u'isdir': False, u'ctime': 1783530527.6069424, u'isblk': False, u'checksum': u'39b0bb47ae97212ca5197ecae367452df59376e7', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/httpd.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}, {u'failed': False, u'stat': {u'exists': False}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd-des.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}])
2026-07-08T17:09:47.6758352Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=[{u'failed': False, u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1783530527.6069424, u'block_size': 4096, u'inode': 293603742, u'isgid': False, u'size': 28035, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744072990020633', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 56, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/httpd.conf', u'xusr': False, u'atime': 1783530527.6069424, u'isdir': False, u'ctime': 1783530527.6069424, u'isblk': False, u'checksum': u'39b0bb47ae97212ca5197ecae367452df59376e7', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/httpd.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}, {u'failed': False, u'stat': {u'exists': False}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/httpd-des.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}])
2026-07-08T17:09:47.6855951Z Wednesday 08 July 2026  14:09:47 -0300 (0:00:01.186)       0:00:12.825 ******** 
2026-07-08T17:09:48.3349196Z 
2026-07-08T17:09:48.3349780Z TASK [apache : Copiando arquivo vhost.conf] ************************************
2026-07-08T17:09:48.3351940Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=[{u'failed': False, u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1783530527.6079423, u'block_size': 4096, u'inode': 293610087, u'isgid': False, u'size': 1805, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744072758553182', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/vhost.conf', u'xusr': False, u'atime': 1783530527.6069424, u'isdir': False, u'ctime': 1783530527.6079423, u'isblk': False, u'checksum': u'e8c74fd6e76c5fa6ef8fbe4aac2599f93ad88d92', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/vhost.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}, {u'failed': False, u'stat': {u'exists': False}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/vhost-des.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}])
2026-07-08T17:09:48.8365071Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=[{u'failed': False, u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1783530527.6079423, u'block_size': 4096, u'inode': 293610087, u'isgid': False, u'size': 1805, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744072758553182', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/vhost.conf', u'xusr': False, u'atime': 1783530527.6069424, u'isdir': False, u'ctime': 1783530527.6079423, u'isblk': False, u'checksum': u'e8c74fd6e76c5fa6ef8fbe4aac2599f93ad88d92', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/vhost.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}, {u'failed': False, u'stat': {u'exists': False}, u'ansible_loop_var': u'item', u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd', u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/vhost-des.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False}])
2026-07-08T17:09:48.8494967Z Wednesday 08 July 2026  14:09:48 -0300 (0:00:01.163)       0:00:13.988 ******** 
2026-07-08T17:09:48.9108680Z Wednesday 08 July 2026  14:09:48 -0300 (0:00:00.061)       0:00:14.050 ******** 
2026-07-08T17:09:49.1562258Z 
2026-07-08T17:09:49.1563152Z TASK [apache : Verifica se existe uma linha que começa com LogFormat no arquivo de destino] ***
2026-07-08T17:09:49.1563400Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:49.1592264Z Wednesday 08 July 2026  14:09:49 -0300 (0:00:00.248)       0:00:14.298 ******** 
2026-07-08T17:09:49.4051155Z 
2026-07-08T17:09:49.4051945Z TASK [apache : Verifica se existe uma linha igual] *****************************
2026-07-08T17:09:49.4056728Z fatal: [caddeapllx2577.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["grep", "-q", "SetEnvIf", "Request_URI", "\\.png$|\\.gif$|\\.jpg$|\\.js$|\\.css$|\\.ico$|\\/fonts\\/", "is_exclude", "LogFormat", "{ \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SIARG\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }", "monitoracao", "/opt/httpd/conf/httpd.conf"], "delta": "0:00:00.002418", "end": "2026-07-08 14:09:49.388161", "msg": "non-zero return code", "rc": 2, "start": "2026-07-08 14:09:49.385743", "stderr": "grep: Request_URI: Arquivo ou diretório inexistente\ngrep: \\.png$|\\.gif$|\\.jpg$|\\.js$|\\.css$|\\.ico$|\\/fonts\\/: Arquivo ou diretório inexistente\ngrep: is_exclude: Arquivo ou diretório inexistente\ngrep: LogFormat: Arquivo ou diretório inexistente\ngrep: { \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SIARG\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }: Nome de arquivo muito longo\ngrep: monitoracao: Arquivo ou diretório inexistente", "stderr_lines": ["grep: Request_URI: Arquivo ou diretório inexistente", "grep: \\.png$|\\.gif$|\\.jpg$|\\.js$|\\.css$|\\.ico$|\\/fonts\\/: Arquivo ou diretório inexistente", "grep: is_exclude: Arquivo ou diretório inexistente", "grep: LogFormat: Arquivo ou diretório inexistente", "grep: { \"requestTime\":\"%{%Y-%m-%d %T}t.%{msec_frac}t %{%z}t\", \"sigla\":\"SIARG\", \"responseTime\":\"%D\", \"filename\":\"%f\", \"forwardedIP\":\"%{X-Forwarded-For}i\", \"remoteIP\":\"%h\", \"virtualHost\":\"%V\", \"request\":\"%U\", \"query\":\"%q\", \"method\":\"%m\", \"status\":\"%>s\", \"userAgent\":\"%{User-agent}i\", \"referer\":\"%{Referer}i\", \"bytesResponse\":\"%B\" }: Nome de arquivo muito longo", "grep: monitoracao: Arquivo ou diretório inexistente"], "stdout": "", "stdout_lines": []}
2026-07-08T17:09:49.4058336Z ...ignoring
2026-07-08T17:09:49.4089256Z Wednesday 08 July 2026  14:09:49 -0300 (0:00:00.249)       0:00:14.548 ******** 
2026-07-08T17:09:49.8648266Z 
2026-07-08T17:09:49.8649220Z TASK [apache : Adiciona bloco de texto após a última ocorrência de LogFormat se encontrado] ***
2026-07-08T17:09:49.8649536Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:49.8676565Z Wednesday 08 July 2026  14:09:49 -0300 (0:00:00.458)       0:00:15.007 ******** 
2026-07-08T17:09:49.9145084Z Wednesday 08 July 2026  14:09:49 -0300 (0:00:00.046)       0:00:15.054 ******** 
2026-07-08T17:09:49.9734661Z Wednesday 08 July 2026  14:09:49 -0300 (0:00:00.059)       0:00:15.113 ******** 
2026-07-08T17:09:50.5965936Z 
2026-07-08T17:09:50.5968383Z TASK [apache : Copiando arquivo 00-mpm.conf] ***********************************
2026-07-08T17:09:50.5968865Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:50.5998433Z Wednesday 08 July 2026  14:09:50 -0300 (0:00:00.626)       0:00:15.739 ******** 
2026-07-08T17:09:51.1691526Z 
2026-07-08T17:09:51.1692640Z TASK [apache : Copiando arquivo 00-mpm.conf do repo] ***************************
2026-07-08T17:09:51.1694920Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1783530527.6059425, u'block_size': 4096, u'inode': 293610085, u'isgid': False, u'size': 1552, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'1646116732', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/00-mpm.conf', u'xusr': False, u'atime': 1783530527.6059425, u'isdir': False, u'ctime': 1783530527.6059425, u'isblk': False, u'checksum': u'3748b1548ab361c54d642df5cadbb094a8915459', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r16673/a/_SIARG-interno-config/httpd/00-mpm.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-07-08T17:09:51.1778412Z Wednesday 08 July 2026  14:09:51 -0300 (0:00:00.577)       0:00:16.317 ******** 
2026-07-08T17:09:51.2362144Z Wednesday 08 July 2026  14:09:51 -0300 (0:00:00.058)       0:00:16.375 ******** 
2026-07-08T17:09:51.5826402Z 
2026-07-08T17:09:51.5826965Z TASK [apache : Check directory configuration exists] ***************************
2026-07-08T17:09:51.5827157Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:51.5867973Z Wednesday 08 July 2026  14:09:51 -0300 (0:00:00.350)       0:00:16.726 ******** 
2026-07-08T17:09:51.8324270Z 
2026-07-08T17:09:51.8324916Z TASK [apache : ensures /opt/httpd/configuration dir exists] ********************
2026-07-08T17:09:51.8325111Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:51.8364136Z Wednesday 08 July 2026  14:09:51 -0300 (0:00:00.249)       0:00:16.976 ******** 
2026-07-08T17:09:51.8849504Z Wednesday 08 July 2026  14:09:51 -0300 (0:00:00.048)       0:00:17.024 ******** 
2026-07-08T17:09:52.6927981Z 
2026-07-08T17:09:52.6928652Z TASK [apache : Copiando arquivos de secure file] *******************************
2026-07-08T17:09:52.6929219Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=caixa-truststore-acteste-nprd.jks)
2026-07-08T17:09:53.3907304Z ok: [caddeapllx2577.agil.nprd.caixa.gov.br] => (item=caixa-truststore-acteste-nprd.jks)
2026-07-08T17:09:53.3908111Z Wednesday 08 July 2026  14:09:53 -0300 (0:00:01.503)       0:00:18.527 ******** 
2026-07-08T17:09:53.7715701Z 
2026-07-08T17:09:53.7716628Z RUNNING HANDLER [apache : reload systemctl] ************************************
2026-07-08T17:09:53.7716848Z changed: [caddeapllx2577.agil.nprd.caixa.gov.br]
2026-07-08T17:09:53.7720787Z Wednesday 08 July 2026  14:09:53 -0300 (0:00:00.384)       0:00:18.911 ******** 
2026-07-08T17:09:54.2105273Z 
2026-07-08T17:09:54.2105972Z RUNNING HANDLER [apache : Reload Apache] ***************************************
2026-07-08T17:09:54.2107197Z fatal: [caddeapllx2577.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Unable to restart service httpd-eap: Job for httpd-eap.service failed because the control process exited with error code.\nSee \"systemctl status httpd-eap.service\" and \"journalctl -xeu httpd-eap.service\" for details.\n"}
2026-07-08T17:09:54.2108148Z 
2026-07-08T17:09:54.2108376Z NO MORE HOSTS LEFT *************************************************************
2026-07-08T17:09:54.2112156Z 
2026-07-08T17:09:54.2113133Z PLAY RECAP *********************************************************************
2026-07-08T17:09:54.2113616Z caddeapllx2577.agil.nprd.caixa.gov.br : ok=32   changed=20   unreachable=0    failed=1    skipped=6    rescued=0    ignored=1   
2026-07-08T17:09:54.2113786Z 
2026-07-08T17:09:54.2114388Z Wednesday 08 July 2026  14:09:54 -0300 (0:00:00.439)       0:00:19.351 ******** 
2026-07-08T17:09:54.2114699Z =============================================================================== 
2026-07-08T17:09:54.2115947Z Apache | Start apache --------------------------------------------------- 1.54s
2026-07-08T17:09:54.2116314Z apache : Copiando arquivos de secure file ------------------------------- 1.50s
2026-07-08T17:09:54.2116659Z apache : Copiando arquivo httpd.conf ------------------------------------ 1.19s
2026-07-08T17:09:54.2116969Z apache : Copiando arquivo vhost.conf ------------------------------------ 1.16s
2026-07-08T17:09:54.2117437Z apache : Unarchiving Artifacts [HTDOCS] --------------------------------- 1.04s
2026-07-08T17:09:54.2117812Z apache : Create config file httpd.conf ---------------------------------- 0.83s
2026-07-08T17:09:54.2118177Z apache : Get 00-proxy.conf status --------------------------------------- 0.70s
2026-07-08T17:09:54.2118530Z apache : Get 00-mpm.conf status ----------------------------------------- 0.68s
2026-07-08T17:09:54.2119193Z apache : Get vhost-des.conf status -------------------------------------- 0.67s
2026-07-08T17:09:54.2119735Z apache : Get httpd.conf status ------------------------------------------ 0.67s
2026-07-08T17:09:54.2120087Z apache : Get httpd-des.conf status -------------------------------------- 0.65s
2026-07-08T17:09:54.2120560Z apache : Get vhost.conf status ------------------------------------------ 0.65s
2026-07-08T17:09:54.2120919Z apache : Deploy Virtual Host -------------------------------------------- 0.64s
2026-07-08T17:09:54.2121270Z apache : Apache | Create file ------------------------------------------- 0.64s
2026-07-08T17:09:54.2121621Z apache : Copiando arquivo 00-mpm.conf ----------------------------------- 0.63s
2026-07-08T17:09:54.2121982Z apache : Copiando arquivo 00-mpm.conf do repo --------------------------- 0.58s
2026-07-08T17:09:54.2122337Z apache : Ansible Create directory /opt/httpd/conf.d/old if not exists --- 0.51s
2026-07-08T17:09:54.2122751Z apache : Adiciona bloco de texto após a última ocorrência de LogFormat se encontrado --- 0.46s
2026-07-08T17:09:54.2123113Z apache : Allow new incoming SYN packets on TCP port 80 (HTTP) ----------- 0.44s
2026-07-08T17:09:54.2123476Z apache : Reload Apache -------------------------------------------------- 0.44s
2026-07-08T17:09:54.2123762Z Playbook run took 0 days, 0 hours, 0 minutes, 19 seconds
2026-07-08T17:09:54.2857647Z ##[section]Finishing: Configurando o Apache
