Criação solicitada por:REQ000095661629 Qual o tipo de serviço?: Ajustar ambiente ou parametrização de software


Qual o tipo de serviço?*:	Ajustar ambiente ou parametrização de software
Informar o Ambiente:*:	DES
Nome do serviço ou sistema:*:	SIMIL-precificacao-rotinas-batch
Janela de atendimento:*:	30/10/2026 12:33:00
Prazo final da janela de atendimento:*:	30/10/2026 17:33:00
Haverá previsão de indisponibilidade durante a execução do serviço:*:	Não
Contato do responsável pela validação do ambiente após alteração:*:	C161214 -> iury.mota@caixa.gov.br
Descrição da solicitação:*:	Gostaria de solicitar a validação da configuração do agente do control-M  BR DES - Negocial para a aplicação SIMIL-precificacao-rotinas-batch.
Link do projeto no DevOps: https://devops.caixa/projetos/Caixa/_git/SIMIL-precificacao-rotinas-batch
Informar formas de contato:*:	Teams ou e-mail: C161214 -> iury.mota@caixa.gov.br



2026-10-15T15:32:45.9345225Z ##[section]Starting: Configura Control-M
2026-10-15T15:32:45.9348812Z ==============================================================================
2026-10-15T15:32:45.9348940Z Task         : Bash
2026-10-15T15:32:45.9349004Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-15T15:32:45.9349109Z Version      : 3.227.0
2026-10-15T15:32:45.9349178Z Author       : Microsoft Corporation
2026-10-15T15:32:45.9349247Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-15T15:32:45.9349372Z ==============================================================================
2026-10-15T15:32:46.1308465Z Generating script.
2026-10-15T15:32:46.1309268Z ========================== Starting Command Output ===========================
2026-10-15T15:32:46.1310582Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/8819458c-c522-4edf-b45f-e2ed87e820d7.sh
2026-10-15T15:32:46.3358940Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-10-15T15:32:46.3359243Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-10-15T15:32:46.3359781Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-10-15T15:32:46.3359944Z setting deprecation_warnings=False in ansible.cfg.
2026-10-15T15:32:46.9460034Z [WARNING]: Found variable using reserved name: when
2026-10-15T15:32:47.0006025Z 
2026-10-15T15:32:47.0006511Z PLAY [local] *******************************************************************
2026-10-15T15:32:47.0006588Z 
2026-10-15T15:32:47.0006730Z PLAY [Configurando o DNS] ******************************************************
2026-10-15T15:32:47.0006799Z 
2026-10-15T15:32:47.0006919Z PLAY [local] *******************************************************************
2026-10-15T15:32:47.0006987Z 
2026-10-15T15:32:47.0007396Z PLAY [Verificando serviços] ****************************************************
2026-10-15T15:32:47.0007468Z 
2026-10-15T15:32:47.0007650Z PLAY [Configuração LDAP] *******************************************************
2026-10-15T15:32:47.0007749Z 
2026-10-15T15:32:47.0007860Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:47.0007932Z 
2026-10-15T15:32:47.0008046Z PLAY [Stack Jboss] *************************************************************
2026-10-15T15:32:47.0008130Z 
2026-10-15T15:32:47.0008238Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:47.0008310Z 
2026-10-15T15:32:47.0008451Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:47.0008744Z Thursday 15 October 2026  12:32:46 -0300 (0:00:00.158)       0:00:00.158 ****** 
2026-10-15T15:32:47.3008237Z [WARNING]: Distribution rhel 9.3 on host caddeapllx2501.agil.nprd.caixa.gov.br
2026-10-15T15:32:47.3008598Z should use /usr/bin/python3, but is using /usr/bin/python for backward
2026-10-15T15:32:47.3008736Z compatibility with prior Ansible releases. See
2026-10-15T15:32:47.3008855Z https://docs.ansible.com/ansible-
2026-10-15T15:32:47.3009012Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-10-15T15:32:47.3038390Z 
2026-10-15T15:32:47.3039065Z TASK [nfs : Verifica se o arquivo nfs_config.json existe] **********************
2026-10-15T15:32:47.3040092Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br -> localhost]
2026-10-15T15:32:47.3040365Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.303)       0:00:00.462 ****** 
2026-10-15T15:32:47.3348182Z 
2026-10-15T15:32:47.3348606Z TASK [nfs : include_tasks] *****************************************************
2026-10-15T15:32:47.3349085Z included: /opt/ads-agent/_work/r794/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2501.agil.nprd.caixa.gov.br
2026-10-15T15:32:47.3349370Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.030)       0:00:00.493 ****** 
2026-10-15T15:32:47.3701128Z 
2026-10-15T15:32:47.3701710Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-15T15:32:47.3702080Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:47.3702331Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.035)       0:00:00.528 ****** 
2026-10-15T15:32:47.7134587Z 
2026-10-15T15:32:47.7135421Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-15T15:32:47.7135671Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br -> localhost]
2026-10-15T15:32:47.7135914Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.342)       0:00:00.871 ****** 
2026-10-15T15:32:47.7474933Z 
2026-10-15T15:32:47.7475407Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-15T15:32:47.7475602Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br] => {
2026-10-15T15:32:47.7475742Z     "nfs_vars_json": {
2026-10-15T15:32:47.7475843Z         "changed": false,
2026-10-15T15:32:47.7476238Z         "cmd": "cat /opt/ads-agent/_work/r794/a/nfs_config.json",
2026-10-15T15:32:47.7476381Z         "delta": "0:00:00.005644",
2026-10-15T15:32:47.7476653Z         "end": "2026-10-15 12:32:47.683546",
2026-10-15T15:32:47.7476768Z         "failed": false,
2026-10-15T15:32:47.7476854Z         "msg": "",
2026-10-15T15:32:47.7476943Z         "rc": 0,
2026-10-15T15:32:47.7477099Z         "start": "2026-10-15 12:32:47.677902",
2026-10-15T15:32:47.7477213Z         "stderr": "",
2026-10-15T15:32:47.7477314Z         "stderr_lines": [],
2026-10-15T15:32:47.7477410Z         "stdout": "[]",
2026-10-15T15:32:47.7477502Z         "stdout_lines": [
2026-10-15T15:32:47.7477584Z             "[]"
2026-10-15T15:32:47.7477667Z         ],
2026-10-15T15:32:47.7477755Z         "warnings": [
2026-10-15T15:32:47.7478162Z             "Distribution rhel 9.3 on host caddeapllx2501.agil.nprd.caixa.gov.br should use /usr/bin/python3, but is using /usr/bin/python for backward compatibility with prior Ansible releases. See https://docs.ansible.com/ansible-core/2.14/reference_appendices/interpreter_discovery.html for more information"
2026-10-15T15:32:47.7478399Z         ]
2026-10-15T15:32:47.7478475Z     }
2026-10-15T15:32:47.7478557Z }
2026-10-15T15:32:47.7478756Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.034)       0:00:00.906 ****** 
2026-10-15T15:32:47.7856061Z 
2026-10-15T15:32:47.7857049Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-15T15:32:47.7857315Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:47.7857715Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.037)       0:00:00.943 ****** 
2026-10-15T15:32:47.8143334Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.028)       0:00:00.972 ****** 
2026-10-15T15:32:47.8430188Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.028)       0:00:01.001 ****** 
2026-10-15T15:32:47.8719298Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.028)       0:00:01.030 ****** 
2026-10-15T15:32:47.9000598Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.027)       0:00:01.058 ****** 
2026-10-15T15:32:47.9274555Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.027)       0:00:01.086 ****** 
2026-10-15T15:32:47.9541857Z Thursday 15 October 2026  12:32:47 -0300 (0:00:00.026)       0:00:01.112 ****** 
2026-10-15T15:32:48.0963838Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-10-15T15:32:48.0968002Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-10-15T15:32:48.1090502Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-10-15T15:32:48.1213221Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-10-15T15:32:48.1538279Z 
2026-10-15T15:32:48.1538582Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:48.1538673Z 
2026-10-15T15:32:48.1538843Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-15T15:32:48.1538912Z 
2026-10-15T15:32:48.1539031Z PLAY [Copiando modules adicionais] *********************************************
2026-10-15T15:32:48.1539100Z 
2026-10-15T15:32:48.1539216Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:48.1539697Z 
2026-10-15T15:32:48.1539823Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:48.1539891Z 
2026-10-15T15:32:48.1540009Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:48.1540081Z 
2026-10-15T15:32:48.1540197Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:48.1540261Z 
2026-10-15T15:32:48.1540374Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:48.1540436Z 
2026-10-15T15:32:48.1540551Z PLAY [local] *******************************************************************
2026-10-15T15:32:48.1540613Z 
2026-10-15T15:32:48.1540730Z PLAY [instance_restart] ********************************************************
2026-10-15T15:32:48.1540856Z skipping: no hosts matched
2026-10-15T15:32:48.1540899Z 
2026-10-15T15:32:48.1541017Z PLAY [machine_reboot] **********************************************************
2026-10-15T15:32:48.1541135Z skipping: no hosts matched
2026-10-15T15:32:48.1541181Z 
2026-10-15T15:32:48.1541287Z PLAY [local] *******************************************************************
2026-10-15T15:32:48.1541362Z 
2026-10-15T15:32:48.1541468Z PLAY [instance_stop] ***********************************************************
2026-10-15T15:32:48.1541592Z skipping: no hosts matched
2026-10-15T15:32:48.1541631Z 
2026-10-15T15:32:48.1541743Z PLAY [machine_reboot] **********************************************************
2026-10-15T15:32:48.1541865Z skipping: no hosts matched
2026-10-15T15:32:48.1541907Z 
2026-10-15T15:32:48.1542020Z PLAY [local] *******************************************************************
2026-10-15T15:32:48.1542083Z 
2026-10-15T15:32:48.1542197Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-10-15T15:32:48.1542317Z skipping: no hosts matched
2026-10-15T15:32:48.1542360Z 
2026-10-15T15:32:48.1542473Z PLAY [local] *******************************************************************
2026-10-15T15:32:48.1542534Z 
2026-10-15T15:32:48.1542647Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-10-15T15:32:48.1542769Z skipping: no hosts matched
2026-10-15T15:32:48.1542811Z 
2026-10-15T15:32:48.1542925Z PLAY [Configura TSM] ***********************************************************
2026-10-15T15:32:48.1542988Z 
2026-10-15T15:32:48.1543099Z PLAY [jboss] *******************************************************************
2026-10-15T15:32:48.1543639Z Thursday 15 October 2026  12:32:48 -0300 (0:00:00.199)       0:00:01.312 ****** 
2026-10-15T15:32:48.1903137Z 
2026-10-15T15:32:48.1903724Z TASK [Cria variável build_repository_name] *************************************
2026-10-15T15:32:48.1903924Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:48.1904166Z Thursday 15 October 2026  12:32:48 -0300 (0:00:00.036)       0:00:01.348 ****** 
2026-10-15T15:32:48.2271955Z 
2026-10-15T15:32:48.2272439Z TASK [Buscando diretorio de config] ********************************************
2026-10-15T15:32:48.2272600Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:48.2273064Z Thursday 15 October 2026  12:32:48 -0300 (0:00:00.036)       0:00:01.385 ****** 
2026-10-15T15:32:48.6349710Z 
2026-10-15T15:32:48.6350500Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-10-15T15:32:48.6350825Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r794/a/_SIMIL-precificacao-rotinas-batch-config)
2026-10-15T15:32:48.6351142Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br -> localhost] => (item=/opt/ads-agent/_work/r794/a/_SIMIL-precificacao-rotinas-batch-config/so)
2026-10-15T15:32:48.6351433Z Thursday 15 October 2026  12:32:48 -0300 (0:00:00.407)       0:00:01.793 ****** 
2026-10-15T15:32:49.0910151Z 
2026-10-15T15:32:49.0910674Z TASK [Altera arquivo /etc/hosts] ***********************************************
2026-10-15T15:32:49.0912871Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br] => (item={'changed': False, 'stat': {'exists': True, 'path': '/opt/ads-agent/_work/r794/a/_SIMIL-precificacao-rotinas-batch-config/etc/hosts-des', 'mode': '0644', 'isdir': False, 'ischr': False, 'isblk': False, 'isreg': True, 'isfifo': False, 'islnk': False, 'issock': False, 'uid': 0, 'gid': 0, 'size': 60, 'inode': 120850978, 'dev': 251, 'nlink': 1, 'atime': 1792078342.613847, 'mtime': 1792078214.9420815, 'ctime': 1792078214.9420815, 'wusr': True, 'rusr': True, 'xusr': False, 'wgrp': False, 'rgrp': True, 'xgrp': False, 'woth': False, 'roth': True, 'xoth': False, 'isuid': False, 'isgid': False, 'blocks': 8, 'block_size': 4096, 'device_type': 0, 'readable': True, 'writeable': True, 'executable': False, 'pw_name': 'root', 'gr_name': 'root', 'checksum': '1f09616d110ac500a52afa608636b27a6508008b', 'mimetype': 'unknown', 'charset': 'unknown', 'version': None, 'attributes': [], 'attr_flags': ''}, 'invocation': {'module_args': {'path': '/opt/ads-agent/_work/r794/a/_SIMIL-precificacao-rotinas-batch-config/etc/hosts-des', 'follow': False, 'get_md5': False, 'get_checksum': True, 'get_mime': True, 'get_attributes': True, 'checksum_algorithm': 'sha1'}}, 'failed': False, 'item': '/opt/ads-agent/_work/r794/a/_SIMIL-precificacao-rotinas-batch-config', 'ansible_loop_var': 'item'})
2026-10-15T15:32:49.0913585Z 
2026-10-15T15:32:49.0913778Z PLAY [Configura Control-M] *****************************************************
2026-10-15T15:32:49.0914025Z Thursday 15 October 2026  12:32:49 -0300 (0:00:00.456)       0:00:02.249 ****** 
2026-10-15T15:32:49.9912639Z 
2026-10-15T15:32:49.9913104Z TASK [Gathering Facts] *********************************************************
2026-10-15T15:32:49.9913298Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:49.9913786Z Thursday 15 October 2026  12:32:49 -0300 (0:00:00.900)       0:00:03.149 ****** 
2026-10-15T15:32:50.2289491Z 
2026-10-15T15:32:50.2290061Z TASK [stat] ********************************************************************
2026-10-15T15:32:50.2290231Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:50.2290706Z Thursday 15 October 2026  12:32:50 -0300 (0:00:00.237)       0:00:03.387 ****** 
2026-10-15T15:32:50.2710328Z 
2026-10-15T15:32:50.2710829Z TASK [assert] ******************************************************************
2026-10-15T15:32:50.2710996Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br] => {
2026-10-15T15:32:50.2711121Z     "changed": false,
2026-10-15T15:32:50.2711229Z     "msg": "All assertions passed"
2026-10-15T15:32:50.2711323Z }
2026-10-15T15:32:50.2711741Z Thursday 15 October 2026  12:32:50 -0300 (0:00:00.042)       0:00:03.429 ****** 
2026-10-15T15:32:50.3227989Z 
2026-10-15T15:32:50.3228796Z TASK [control_m : Cria variável ansible] ***************************************
2026-10-15T15:32:50.3228987Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:50.3229237Z Thursday 15 October 2026  12:32:50 -0300 (0:00:00.051)       0:00:03.481 ****** 
2026-10-15T15:32:51.0464446Z 
2026-10-15T15:32:51.0464909Z TASK [control_m : Copiando arquivo de certificado] *****************************
2026-10-15T15:32:51.0465106Z changed: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:51.0465579Z Thursday 15 October 2026  12:32:51 -0300 (0:00:00.723)       0:00:04.205 ****** 
2026-10-15T15:32:51.3117207Z 
2026-10-15T15:32:51.3117984Z TASK [control_m : Executando add-user.sh] **************************************
2026-10-15T15:32:51.3118144Z changed: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:51.3118400Z Thursday 15 October 2026  12:32:51 -0300 (0:00:00.265)       0:00:04.470 ****** 
2026-10-15T15:32:51.6522297Z 
2026-10-15T15:32:51.6523054Z TASK [control_m : Removendo add-user.sh] ***************************************
2026-10-15T15:32:51.6523257Z changed: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:51.6523516Z Thursday 15 October 2026  12:32:51 -0300 (0:00:00.340)       0:00:04.810 ****** 
2026-10-15T15:32:51.9328068Z 
2026-10-15T15:32:51.9329278Z TASK [control_m : Criacao diretorio /producao/carga] ***************************
2026-10-15T15:32:51.9329910Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:51.9330480Z Thursday 15 October 2026  12:32:51 -0300 (0:00:00.279)       0:00:05.090 ****** 
2026-10-15T15:32:52.1915434Z 
2026-10-15T15:32:52.1915909Z TASK [control_m : Criacao diretorio /producao/suporte] *************************
2026-10-15T15:32:52.1916068Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:52.1916543Z Thursday 15 October 2026  12:32:52 -0300 (0:00:00.259)       0:00:05.350 ****** 
2026-10-15T15:32:52.7463306Z 
2026-10-15T15:32:52.7463787Z TASK [control_m : Garante bash_profile] ****************************************
2026-10-15T15:32:52.7463977Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:52.7464466Z Thursday 15 October 2026  12:32:52 -0300 (0:00:00.554)       0:00:05.904 ****** 
2026-10-15T15:32:52.9921331Z 
2026-10-15T15:32:52.9922143Z TASK [control_m : Cria Diretório de Scripts] ***********************************
2026-10-15T15:32:52.9922327Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:52.9922575Z Thursday 15 October 2026  12:32:52 -0300 (0:00:00.245)       0:00:06.150 ****** 
2026-10-15T15:32:55.9195898Z 
2026-10-15T15:32:55.9196909Z TASK [control_m : Copia Scripts] ***********************************************
2026-10-15T15:32:55.9197258Z changed: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:55.9197913Z Thursday 15 October 2026  12:32:55 -0300 (0:00:02.926)       0:00:09.076 ****** 
2026-10-15T15:32:56.1855547Z 
2026-10-15T15:32:56.1856128Z TASK [control_m : Verifica se o arquivo /producao//configuration/custom.sh existe] ***
2026-10-15T15:32:56.1856282Z ok: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:56.1856762Z Thursday 15 October 2026  12:32:56 -0300 (0:00:00.267)       0:00:09.343 ****** 
2026-10-15T15:32:56.4342157Z 
2026-10-15T15:32:56.4342888Z TASK [control_m : Executa shell customizada] ***********************************
2026-10-15T15:32:56.4343183Z changed: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:56.4343857Z Thursday 15 October 2026  12:32:56 -0300 (0:00:00.248)       0:00:09.592 ****** 
2026-10-15T15:32:57.0737301Z 
2026-10-15T15:32:57.0738310Z TASK [control_m : Configuração Control-M] **************************************
2026-10-15T15:32:57.0738667Z changed: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:32:57.0739454Z Thursday 15 October 2026  12:32:57 -0300 (0:00:00.639)       0:00:10.232 ****** 
2026-10-15T15:33:03.8280281Z 
2026-10-15T15:33:03.8281090Z TASK [control_m : Restart ControlM] ********************************************
2026-10-15T15:33:03.8281511Z changed: [caddeapllx2501.agil.nprd.caixa.gov.br]
2026-10-15T15:33:03.8281588Z 
2026-10-15T15:33:03.8281706Z PLAY [jboss] *******************************************************************
2026-10-15T15:33:03.8281786Z 
2026-10-15T15:33:03.8282240Z PLAY [jboss] *******************************************************************
2026-10-15T15:33:03.8282382Z 
2026-10-15T15:33:03.8282501Z PLAY [jboss] *******************************************************************
2026-10-15T15:33:03.8282581Z 
2026-10-15T15:33:03.8282720Z PLAY [jboss] *******************************************************************
2026-10-15T15:33:03.8283034Z 
2026-10-15T15:33:03.8283148Z PLAY [localhost] ***************************************************************
2026-10-15T15:33:03.8283227Z 
2026-10-15T15:33:03.8283335Z PLAY [jboss] *******************************************************************
2026-10-15T15:33:03.8283412Z 
2026-10-15T15:33:03.8283525Z PLAY [jboss] *******************************************************************
2026-10-15T15:33:03.8283591Z 
2026-10-15T15:33:03.8283705Z PLAY [jboss] *******************************************************************
2026-10-15T15:33:03.8283768Z 
2026-10-15T15:33:03.8283883Z PLAY RECAP *********************************************************************
2026-10-15T15:33:03.8284049Z caddeapllx2501.agil.nprd.caixa.gov.br : ok=26   changed=7    unreachable=0    failed=0    skipped=7    rescued=0    ignored=0   
2026-10-15T15:33:03.8284232Z 
2026-10-15T15:33:03.8284331Z Playbook run took 0 days, 0 hours, 0 minutes, 16 seconds
2026-10-15T15:33:03.8284792Z Thursday 15 October 2026  12:33:03 -0300 (0:00:06.754)       0:00:16.986 ****** 
2026-10-15T15:33:03.8284957Z =============================================================================== 
2026-10-15T15:33:03.8285169Z control_m : Restart ControlM -------------------------------------------- 6.75s
2026-10-15T15:33:03.8285373Z control_m : Copia Scripts ----------------------------------------------- 2.93s
2026-10-15T15:33:03.8285587Z Gathering Facts --------------------------------------------------------- 0.90s
2026-10-15T15:33:03.8285800Z control_m : Copiando arquivo de certificado ----------------------------- 0.72s
2026-10-15T15:33:03.8286021Z control_m : Configuração Control-M -------------------------------------- 0.64s
2026-10-15T15:33:03.8286227Z control_m : Garante bash_profile ---------------------------------------- 0.55s
2026-10-15T15:33:03.8286443Z Altera arquivo /etc/hosts ----------------------------------------------- 0.46s
2026-10-15T15:33:03.8286658Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.41s
2026-10-15T15:33:03.8286875Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.34s
2026-10-15T15:33:03.8287088Z control_m : Removendo add-user.sh --------------------------------------- 0.34s
2026-10-15T15:33:03.8287295Z nfs : Verifica se o arquivo nfs_config.json existe ---------------------- 0.30s
2026-10-15T15:33:03.8287504Z control_m : Criacao diretorio /producao/carga --------------------------- 0.28s
2026-10-15T15:33:03.8287724Z control_m : Verifica se o arquivo /producao//configuration/custom.sh existe --- 0.27s
2026-10-15T15:33:03.8287943Z control_m : Executando add-user.sh -------------------------------------- 0.27s
2026-10-15T15:33:03.8288146Z control_m : Criacao diretorio /producao/suporte ------------------------- 0.26s
2026-10-15T15:33:03.8288361Z control_m : Executa shell customizada ----------------------------------- 0.25s
2026-10-15T15:33:03.8288571Z control_m : Cria Diretório de Scripts ----------------------------------- 0.25s
2026-10-15T15:33:03.8288778Z stat -------------------------------------------------------------------- 0.24s
2026-10-15T15:33:03.8288983Z nfs : include_tasks ----------------------------------------------------- 0.20s
2026-10-15T15:33:03.8289195Z control_m : Cria variável ansible --------------------------------------- 0.05s
2026-10-15T15:33:03.8983624Z ##[section]Finishing: Configura Control-M



Connection to 10.116.88.28 closed.
[p585600@cadsvitrlx100 ~]$ ssh 10.116.200.250
The authenticity of host '10.116.200.250 (10.116.200.250)' can't be established.
ED25519 key fingerprint is SHA256:WfqbnuXNodnCpUmGJZtcyIOGp+R6OTtp3mE60ho7V8I.
This host key is known by the following other names/addresses:
    ~/.ssh/known_hosts:188: 10.116.200.237
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '10.116.200.250' (ED25519) to the list of known hosts.
p585600@10.116.200.250's password:
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$
[p585600@caddeapllx2501 ~]$



eu nao entei o que ele precisa
