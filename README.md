2026-11-12T19:37:16.2227475Z ##[section]Starting: Deploy Config no JBOSS
2026-11-12T19:37:16.2230431Z ==============================================================================
2026-11-12T19:37:16.2230504Z Task         : Bash
2026-11-12T19:37:16.2230562Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-12T19:37:16.2230639Z Version      : 3.227.0
2026-11-12T19:37:16.2230680Z Author       : Microsoft Corporation
2026-11-12T19:37:16.2230734Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-12T19:37:16.2230803Z ==============================================================================
2026-11-12T19:37:17.1731502Z Generating script.
2026-11-12T19:37:17.1742494Z ========================== Starting Command Output ===========================
2026-11-12T19:37:17.1750543Z [command]/bin/bash /opt/ads-agent/_work/_temp/2b01fcfc-801e-41dd-9c26-e5fc2d59d990.sh
2026-11-12T19:37:17.1823255Z /opt/ads-agent/_work/_temp/2b01fcfc-801e-41dd-9c26-e5fc2d59d990.sh: line 2: quantidade_vm: comando não encontrado
2026-11-12T19:37:17.1834469Z /opt/ads-agent/_work/_temp/2b01fcfc-801e-41dd-9c26-e5fc2d59d990.sh: line 2: USE_WMQ: comando não encontrado
2026-11-12T19:37:19.4060829Z 
2026-11-12T19:37:19.4061324Z PLAY [local] *******************************************************************
2026-11-12T19:37:19.4362879Z 
2026-11-12T19:37:19.4363369Z PLAY [Configurando o DNS] ******************************************************
2026-11-12T19:37:19.6193064Z 
2026-11-12T19:37:19.6193542Z PLAY [local] *******************************************************************
2026-11-12T19:37:19.6229823Z 
2026-11-12T19:37:19.6230795Z PLAY [Verificando serviços] ****************************************************
2026-11-12T19:37:19.6318407Z 
2026-11-12T19:37:19.6318985Z PLAY [Configuração LDAP] *******************************************************
2026-11-12T19:37:19.6361634Z [WARNING]: Found variable using reserved name: when
2026-11-12T19:37:19.6367594Z 
2026-11-12T19:37:19.6368121Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:19.6770284Z 
2026-11-12T19:37:19.6770794Z PLAY [Stack Jboss] *************************************************************
2026-11-12T19:37:19.6999574Z Thursday 12 November 2026  16:37:19 -0300 (0:00:00.357)       0:00:00.357 ***** 
2026-11-12T19:37:20.1961071Z 
2026-11-12T19:37:20.1962385Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-12T19:37:20.1964209Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-12T19:37:20.1964594Z caddeapllx2854.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-12T19:37:20.1964866Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-12T19:37:20.1965132Z releases. A future Ansible release will default to using the discovered 
2026-11-12T19:37:20.1965406Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-12T19:37:20.1966208Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-12T19:37:20.1966508Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-12T19:37:20.1966759Z setting deprecation_warnings=False in ansible.cfg.
2026-11-12T19:37:20.1966935Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:20.1993185Z 
2026-11-12T19:37:20.1993658Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:20.2060375Z Thursday 12 November 2026  16:37:20 -0300 (0:00:00.506)       0:00:00.863 ***** 
2026-11-12T19:37:20.5277958Z 
2026-11-12T19:37:20.5278475Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-12T19:37:20.5278630Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:20.5309476Z Thursday 12 November 2026  16:37:20 -0300 (0:00:00.324)       0:00:01.188 ***** 
2026-11-12T19:37:20.5766795Z included: /opt/ads-agent/_work/r12482/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2854.agil.nprd.caixa.gov.br
2026-11-12T19:37:20.5814428Z Thursday 12 November 2026  16:37:20 -0300 (0:00:00.050)       0:00:01.239 ***** 
2026-11-12T19:37:20.6382607Z 
2026-11-12T19:37:20.6383679Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-12T19:37:20.6383917Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:20.6426356Z Thursday 12 November 2026  16:37:20 -0300 (0:00:00.061)       0:00:01.300 ***** 
2026-11-12T19:37:21.1004898Z 
2026-11-12T19:37:21.1005735Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-12T19:37:21.1006239Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:21.1037357Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.460)       0:00:01.761 ***** 
2026-11-12T19:37:21.1503088Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.046)       0:00:01.808 ***** 
2026-11-12T19:37:21.2113496Z 
2026-11-12T19:37:21.2114438Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-12T19:37:21.2114846Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:21.2158364Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.065)       0:00:01.873 ***** 
2026-11-12T19:37:21.2586280Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.042)       0:00:01.916 ***** 
2026-11-12T19:37:21.3029409Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.044)       0:00:01.960 ***** 
2026-11-12T19:37:21.3458879Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.042)       0:00:02.003 ***** 
2026-11-12T19:37:21.3889699Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.043)       0:00:02.046 ***** 
2026-11-12T19:37:21.4327514Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.043)       0:00:02.090 ***** 
2026-11-12T19:37:21.4761037Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.043)       0:00:02.133 ***** 
2026-11-12T19:37:21.5186467Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.042)       0:00:02.176 ***** 
2026-11-12T19:37:21.5603435Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.041)       0:00:02.218 ***** 
2026-11-12T19:37:21.6039717Z 
2026-11-12T19:37:21.6040225Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:21.6094556Z 
2026-11-12T19:37:21.6094859Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:21.6134250Z Thursday 12 November 2026  16:37:21 -0300 (0:00:00.053)       0:00:02.271 ***** 
2026-11-12T19:37:22.4821440Z 
2026-11-12T19:37:22.4821946Z TASK [Gathering Facts] *********************************************************
2026-11-12T19:37:22.4822761Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:22.4988951Z Thursday 12 November 2026  16:37:22 -0300 (0:00:00.885)       0:00:03.156 ***** 
2026-11-12T19:37:23.8927165Z 
2026-11-12T19:37:23.8928153Z TASK [Gerando fatos de servicos] ***********************************************
2026-11-12T19:37:23.8928520Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:23.9255791Z Thursday 12 November 2026  16:37:23 -0300 (0:00:01.426)       0:00:04.583 ***** 
2026-11-12T19:37:24.0123163Z 
2026-11-12T19:37:24.0123675Z TASK [Gerando lista de units jboss] ********************************************
2026-11-12T19:37:24.0123842Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:24.0374912Z Thursday 12 November 2026  16:37:24 -0300 (0:00:00.111)       0:00:04.695 ***** 
2026-11-12T19:37:24.1024198Z Thursday 12 November 2026  16:37:24 -0300 (0:00:00.064)       0:00:04.759 ***** 
2026-11-12T19:37:24.1136518Z 
2026-11-12T19:37:24.1137338Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-12T19:37:24.1422927Z Thursday 12 November 2026  16:37:24 -0300 (0:00:00.040)       0:00:04.800 ***** 
2026-11-12T19:37:24.1977774Z 
2026-11-12T19:37:24.1978535Z TASK [Cria variável build_repository_name] *************************************
2026-11-12T19:37:24.1978710Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:24.2239516Z Thursday 12 November 2026  16:37:24 -0300 (0:00:00.081)       0:00:04.881 ***** 
2026-11-12T19:37:24.2827817Z 
2026-11-12T19:37:24.2828333Z TASK [Buscando diretorio de config] ********************************************
2026-11-12T19:37:24.2828499Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:24.3088119Z Thursday 12 November 2026  16:37:24 -0300 (0:00:00.084)       0:00:04.966 ***** 
2026-11-12T19:37:24.3644749Z 
2026-11-12T19:37:24.3645529Z TASK [Buscando diretorio de config] ********************************************
2026-11-12T19:37:24.3645684Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:24.3966257Z Thursday 12 November 2026  16:37:24 -0300 (0:00:00.087)       0:00:05.054 ***** 
2026-11-12T19:37:24.9070728Z 
2026-11-12T19:37:24.9071336Z TASK [Create a symbolic link] **************************************************
2026-11-12T19:37:24.9072990Z changed: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:25.1875638Z changed: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:25.2174776Z Thursday 12 November 2026  16:37:25 -0300 (0:00:00.820)       0:00:05.875 ***** 
2026-11-12T19:37:25.5639637Z 
2026-11-12T19:37:25.5640142Z TASK [Verifica se o arquivo  existe] *******************************************
2026-11-12T19:37:25.5640552Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:25.8516127Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:25.8784261Z Thursday 12 November 2026  16:37:25 -0300 (0:00:00.660)       0:00:06.536 ***** 
2026-11-12T19:37:25.9694702Z included: /opt/ads-agent/_work/r12482/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx2854.agil.nprd.caixa.gov.br
2026-11-12T19:37:26.0083321Z Thursday 12 November 2026  16:37:26 -0300 (0:00:00.129)       0:00:06.666 ***** 
2026-11-12T19:37:26.4911305Z 
2026-11-12T19:37:26.4911858Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-11-12T19:37:26.4912112Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:26.5229325Z Thursday 12 November 2026  16:37:26 -0300 (0:00:00.514)       0:00:07.180 ***** 
2026-11-12T19:37:26.5308096Z [WARNING]: The loop variable 'item' is already in use. You should set the
2026-11-12T19:37:26.5308361Z `loop_var` value in the `loop_control` option for the task to something else to
2026-11-12T19:37:26.5308518Z avoid variable collisions and unexpected behavior.
2026-11-12T19:37:26.5704664Z 
2026-11-12T19:37:26.5705301Z TASK [Mostra artefatos] ********************************************************
2026-11-12T19:37:26.5705990Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item={u'version': u'23.26.0.0.0', u'group_id': u'com.oracle.database.jdbc', u'extension': u'jar', u'artifact_id': u'ojdbc8'}) => {
2026-11-12T19:37:26.5706691Z     "msg": "Artefato: ojdbc8 - versao 23.26.0.0.0"
2026-11-12T19:37:26.5706881Z }
2026-11-12T19:37:26.5997960Z Thursday 12 November 2026  16:37:26 -0300 (0:00:00.076)       0:00:07.257 ***** 
2026-11-12T19:37:27.2515092Z 
2026-11-12T19:37:27.2515538Z TASK [maven_artifact] **********************************************************
2026-11-12T19:37:27.2516015Z changed: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item={u'version': u'23.26.0.0.0', u'group_id': u'com.oracle.database.jdbc', u'extension': u'jar', u'artifact_id': u'ojdbc8'})
2026-11-12T19:37:27.2834757Z Thursday 12 November 2026  16:37:27 -0300 (0:00:00.683)       0:00:07.941 ***** 
2026-11-12T19:37:27.8454847Z 
2026-11-12T19:37:27.8455383Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-11-12T19:37:27.8455904Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:27.8733403Z Thursday 12 November 2026  16:37:27 -0300 (0:00:00.589)       0:00:08.531 ***** 
2026-11-12T19:37:27.9152617Z 
2026-11-12T19:37:27.9153888Z PLAY [Copiando modules adicionais] *********************************************
2026-11-12T19:37:27.9421298Z Thursday 12 November 2026  16:37:27 -0300 (0:00:00.068)       0:00:08.599 ***** 
2026-11-12T19:37:27.9993214Z 
2026-11-12T19:37:27.9993864Z TASK [Cria variável build_repository_name] *************************************
2026-11-12T19:37:27.9994078Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:28.0258103Z Thursday 12 November 2026  16:37:28 -0300 (0:00:00.083)       0:00:08.683 ***** 
2026-11-12T19:37:28.0814132Z 
2026-11-12T19:37:28.0814653Z TASK [Buscando diretorio de config] ********************************************
2026-11-12T19:37:28.0814817Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:28.1072846Z Thursday 12 November 2026  16:37:28 -0300 (0:00:00.081)       0:00:08.764 ***** 
2026-11-12T19:37:28.1603421Z 
2026-11-12T19:37:28.1603887Z TASK [Buscando diretorio de config] ********************************************
2026-11-12T19:37:28.1604041Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:28.1906699Z Thursday 12 November 2026  16:37:28 -0300 (0:00:00.083)       0:00:08.848 ***** 
2026-11-12T19:37:28.5265347Z 
2026-11-12T19:37:28.5265879Z TASK [Create a directory] ******************************************************
2026-11-12T19:37:28.5266285Z changed: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:28.8090456Z changed: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:28.8443171Z Thursday 12 November 2026  16:37:28 -0300 (0:00:00.653)       0:00:09.502 ***** 
2026-11-12T19:37:29.1702348Z 
2026-11-12T19:37:29.1702886Z TASK [Verifica se o arquivo  existe] *******************************************
2026-11-12T19:37:29.1703324Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:29.4603862Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:29.4885564Z Thursday 12 November 2026  16:37:29 -0300 (0:00:00.644)       0:00:10.146 ***** 
2026-11-12T19:37:29.5861816Z included: /opt/ads-agent/_work/r12482/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx2854.agil.nprd.caixa.gov.br
2026-11-12T19:37:29.6140333Z Thursday 12 November 2026  16:37:29 -0300 (0:00:00.125)       0:00:10.271 ***** 
2026-11-12T19:37:29.9250268Z 
2026-11-12T19:37:29.9250933Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-11-12T19:37:29.9251291Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:29.9692700Z Thursday 12 November 2026  16:37:29 -0300 (0:00:00.355)       0:00:10.627 ***** 
2026-11-12T19:37:30.0075781Z Thursday 12 November 2026  16:37:30 -0300 (0:00:00.038)       0:00:10.665 ***** 
2026-11-12T19:37:30.4228921Z 
2026-11-12T19:37:30.4229615Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-11-12T19:37:30.4230069Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:30.4503270Z Thursday 12 November 2026  16:37:30 -0300 (0:00:00.442)       0:00:11.108 ***** 
2026-11-12T19:37:30.4868558Z Thursday 12 November 2026  16:37:30 -0300 (0:00:00.036)       0:00:11.144 ***** 
2026-11-12T19:37:30.8110974Z 
2026-11-12T19:37:30.8111833Z TASK [Verifica se o arquivo jboss-modules-custom tem conteudo] *****************
2026-11-12T19:37:30.8112129Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:30.8367992Z Thursday 12 November 2026  16:37:30 -0300 (0:00:00.349)       0:00:11.494 ***** 
2026-11-12T19:37:31.0114214Z 
2026-11-12T19:37:31.0114758Z TASK [Copiando artefatos (Modules) para o(s) servidor(es) Jboss] ***************
2026-11-12T19:37:31.0114918Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:31.0393459Z Thursday 12 November 2026  16:37:31 -0300 (0:00:00.202)       0:00:11.697 ***** 
2026-11-12T19:37:31.5987239Z 
2026-11-12T19:37:31.5987971Z TASK [Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss] *******
2026-11-12T19:37:31.5988433Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:31.6238270Z Thursday 12 November 2026  16:37:31 -0300 (0:00:00.584)       0:00:12.281 ***** 
2026-11-12T19:37:31.6919720Z Thursday 12 November 2026  16:37:31 -0300 (0:00:00.068)       0:00:12.349 ***** 
2026-11-12T19:37:31.7594625Z Thursday 12 November 2026  16:37:31 -0300 (0:00:00.067)       0:00:12.417 ***** 
2026-11-12T19:37:31.8310614Z Thursday 12 November 2026  16:37:31 -0300 (0:00:00.071)       0:00:12.488 ***** 
2026-11-12T19:37:31.8996958Z Thursday 12 November 2026  16:37:31 -0300 (0:00:00.068)       0:00:12.557 ***** 
2026-11-12T19:37:31.9715803Z Thursday 12 November 2026  16:37:31 -0300 (0:00:00.071)       0:00:12.629 ***** 
2026-11-12T19:37:32.0283702Z 
2026-11-12T19:37:32.0284246Z TASK [Sem modules adicionais] **************************************************
2026-11-12T19:37:32.0284478Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => {
2026-11-12T19:37:32.0284627Z     "msg": "Sem modules adicional"
2026-11-12T19:37:32.0284738Z }
2026-11-12T19:37:32.0305373Z 
2026-11-12T19:37:32.0305892Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:32.0576425Z Thursday 12 November 2026  16:37:32 -0300 (0:00:00.086)       0:00:12.715 ***** 
2026-11-12T19:37:32.1177805Z 
2026-11-12T19:37:32.1178477Z TASK [Setando a versão do Jboss] ***********************************************
2026-11-12T19:37:32.1178643Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:32.1433715Z Thursday 12 November 2026  16:37:32 -0300 (0:00:00.085)       0:00:12.801 ***** 
2026-11-12T19:37:32.2059836Z 
2026-11-12T19:37:32.2060533Z TASK [Cria variável build_repository_name_tfs] *********************************
2026-11-12T19:37:32.2060749Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:32.2320688Z Thursday 12 November 2026  16:37:32 -0300 (0:00:00.088)       0:00:12.889 ***** 
2026-11-12T19:37:32.2879467Z 
2026-11-12T19:37:32.2880059Z TASK [Buscando diretorio de config] ********************************************
2026-11-12T19:37:32.2880310Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:32.3149485Z Thursday 12 November 2026  16:37:32 -0300 (0:00:00.082)       0:00:12.972 ***** 
2026-11-12T19:37:32.8770477Z 
2026-11-12T19:37:32.8771410Z TASK [Copy common_start.sh] ****************************************************
2026-11-12T19:37:32.9031943Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:32.9032773Z Thursday 12 November 2026  16:37:32 -0300 (0:00:00.588)       0:00:13.560 ***** 
2026-11-12T19:37:33.4608098Z 
2026-11-12T19:37:33.4608625Z TASK [Copy template script] ****************************************************
2026-11-12T19:37:33.4608783Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:33.4868811Z Thursday 12 November 2026  16:37:33 -0300 (0:00:00.583)       0:00:14.144 ***** 
2026-11-12T19:37:34.0484895Z 
2026-11-12T19:37:34.0485418Z TASK [JBoss systemd wrapper for sysvinit script mode domain] *******************
2026-11-12T19:37:34.0485935Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:34.0821200Z Thursday 12 November 2026  16:37:34 -0300 (0:00:00.595)       0:00:14.739 ***** 
2026-11-12T19:37:34.8228999Z 
2026-11-12T19:37:34.8229742Z TASK [Realiza copia do arquivo de Trust Store] *********************************
2026-11-12T19:37:34.8230006Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:34.8508855Z Thursday 12 November 2026  16:37:34 -0300 (0:00:00.768)       0:00:15.508 ***** 
2026-11-12T19:37:34.9208511Z Thursday 12 November 2026  16:37:34 -0300 (0:00:00.069)       0:00:15.578 ***** 
2026-11-12T19:37:35.0096145Z Thursday 12 November 2026  16:37:35 -0300 (0:00:00.088)       0:00:15.667 ***** 
2026-11-12T19:37:35.3404819Z 
2026-11-12T19:37:35.3405328Z TASK [Check directory configuration exists] ************************************
2026-11-12T19:37:35.3405815Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:35.6075045Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:35.6345363Z Thursday 12 November 2026  16:37:35 -0300 (0:00:00.624)       0:00:16.292 ***** 
2026-11-12T19:37:35.7139588Z Thursday 12 November 2026  16:37:35 -0300 (0:00:00.079)       0:00:16.371 ***** 
2026-11-12T19:37:36.0341450Z 
2026-11-12T19:37:36.0342354Z TASK [Get standalone-full-ha.xml status] ***************************************
2026-11-12T19:37:36.0342645Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:36.3178585Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:36.3470794Z Thursday 12 November 2026  16:37:36 -0300 (0:00:00.633)       0:00:17.004 ***** 
2026-11-12T19:37:36.9326540Z 
2026-11-12T19:37:36.9327191Z TASK [Copiando arquivo standalone-full-ha.xml] *********************************
2026-11-12T19:37:36.9328800Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1794512127.4709096, u'block_size': 4096, u'inode': 16785415, u'isgid': False, u'size': 34370, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073168191887', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'application/xml', u'blocks': 72, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss/standalone-full-ha.xml', u'xusr': False, u'atime': 1794512128.3758976, u'isdir': False, u'ctime': 1794512127.4709096, u'isblk': False, u'checksum': u'3e95c68e37ef8c6213ee1cb92080cd8d23b6ec92', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss/standalone-full-ha.xml', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-11-12T19:37:36.9641781Z Thursday 12 November 2026  16:37:36 -0300 (0:00:00.617)       0:00:17.621 ***** 
2026-11-12T19:37:37.2976153Z 
2026-11-12T19:37:37.2976912Z TASK [Get standalone-ha.xml status] ********************************************
2026-11-12T19:37:37.2977247Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:37.5628751Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:37.5904078Z Thursday 12 November 2026  16:37:37 -0300 (0:00:00.626)       0:00:18.248 ***** 
2026-11-12T19:37:37.6706347Z Thursday 12 November 2026  16:37:37 -0300 (0:00:00.080)       0:00:18.328 ***** 
2026-11-12T19:37:38.0088040Z 
2026-11-12T19:37:38.0088736Z TASK [Get standalone.xml status] ***********************************************
2026-11-12T19:37:38.0089318Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:38.2780369Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:38.3106066Z Thursday 12 November 2026  16:37:38 -0300 (0:00:00.640)       0:00:18.968 ***** 
2026-11-12T19:37:38.3929962Z Thursday 12 November 2026  16:37:38 -0300 (0:00:00.082)       0:00:19.050 ***** 
2026-11-12T19:37:38.7068970Z 
2026-11-12T19:37:38.7069559Z TASK [Get standalone.conf status] **********************************************
2026-11-12T19:37:38.7069965Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:38.9925703Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss)
2026-11-12T19:37:39.0225055Z Thursday 12 November 2026  16:37:39 -0300 (0:00:00.629)       0:00:19.680 ***** 
2026-11-12T19:37:39.5881154Z 
2026-11-12T19:37:39.5882195Z TASK [Copiando arquivo standalone.conf] ****************************************
2026-11-12T19:37:39.5883921Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1794512127.4899094, u'block_size': 4096, u'inode': 16785416, u'isgid': False, u'size': 4033, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073707693634', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss/standalone.conf', u'xusr': False, u'atime': 1794512127.4889095, u'isdir': False, u'ctime': 1794512127.4899094, u'isblk': False, u'checksum': u'0c29b96f9732ab083476a585396ec6d88b6e6866', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/jboss/standalone.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-11-12T19:37:39.6188677Z Thursday 12 November 2026  16:37:39 -0300 (0:00:00.596)       0:00:20.276 ***** 
2026-11-12T19:37:40.2523430Z 
2026-11-12T19:37:40.2523953Z TASK [Restart Zabbix] **********************************************************
2026-11-12T19:37:40.2524399Z fatal: [caddeapllx2854.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Could not find the requested service zabbix-agent: host"}
2026-11-12T19:37:40.2525741Z ...ignoring
2026-11-12T19:37:40.2779507Z Thursday 12 November 2026  16:37:40 -0300 (0:00:00.659)       0:00:20.935 ***** 
2026-11-12T19:37:40.3438309Z Thursday 12 November 2026  16:37:40 -0300 (0:00:00.065)       0:00:21.001 ***** 
2026-11-12T19:37:40.3776498Z [WARNING]: conditional statements should not include jinja2 templating
2026-11-12T19:37:40.3776929Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-11-12T19:37:40.3777106Z default('false', true) | bool }}
2026-11-12T19:37:40.3873767Z 
2026-11-12T19:37:40.3874403Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:40.3905111Z 
2026-11-12T19:37:40.3905684Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:40.3936787Z 
2026-11-12T19:37:40.3937329Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:40.4198466Z Thursday 12 November 2026  16:37:40 -0300 (0:00:00.075)       0:00:21.077 ***** 
2026-11-12T19:37:40.4753462Z 
2026-11-12T19:37:40.4754302Z TASK [Cria variável build_repository_name] *************************************
2026-11-12T19:37:40.4754547Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:40.5009716Z Thursday 12 November 2026  16:37:40 -0300 (0:00:00.081)       0:00:21.158 ***** 
2026-11-12T19:37:40.5561386Z 
2026-11-12T19:37:40.5561888Z TASK [Buscando diretorio de config] ********************************************
2026-11-12T19:37:40.5562250Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:40.5867720Z Thursday 12 November 2026  16:37:40 -0300 (0:00:00.085)       0:00:21.244 ***** 
2026-11-12T19:37:40.9219299Z 
2026-11-12T19:37:40.9220016Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-11-12T19:37:40.9220561Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config)
2026-11-12T19:37:41.1926246Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r12482/a/_SIGSJ-internet-config/so)
2026-11-12T19:37:41.2185795Z Thursday 12 November 2026  16:37:41 -0300 (0:00:00.631)       0:00:21.876 ***** 
2026-11-12T19:37:41.2700842Z 
2026-11-12T19:37:41.2701353Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:41.2981721Z Thursday 12 November 2026  16:37:41 -0300 (0:00:00.079)       0:00:21.955 ***** 
2026-11-12T19:37:41.5402476Z 
2026-11-12T19:37:41.5403420Z TASK [Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom.sh existe] ***
2026-11-12T19:37:41.5404804Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:41.5693332Z Thursday 12 November 2026  16:37:41 -0300 (0:00:00.270)       0:00:22.226 ***** 
2026-11-12T19:37:41.6434938Z Thursday 12 November 2026  16:37:41 -0300 (0:00:00.074)       0:00:22.301 ***** 
2026-11-12T19:37:41.8920247Z 
2026-11-12T19:37:41.8920769Z TASK [Verifica se o arquivo /opt/batch/config/configuration/custom.sh existe] ***
2026-11-12T19:37:41.8920927Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:41.9169309Z Thursday 12 November 2026  16:37:41 -0300 (0:00:00.273)       0:00:22.574 ***** 
2026-11-12T19:37:41.9580181Z 
2026-11-12T19:37:41.9580969Z PLAY [local] *******************************************************************
2026-11-12T19:37:41.9604837Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-12T19:37:41.9607451Z 
2026-11-12T19:37:41.9607595Z PLAY [instance_restart] ********************************************************
2026-11-12T19:37:41.9607879Z skipping: no hosts matched
2026-11-12T19:37:41.9611226Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-12T19:37:41.9614563Z 
2026-11-12T19:37:41.9615055Z PLAY [machine_reboot] **********************************************************
2026-11-12T19:37:41.9615371Z skipping: no hosts matched
2026-11-12T19:37:41.9624475Z 
2026-11-12T19:37:41.9624780Z PLAY [local] *******************************************************************
2026-11-12T19:37:41.9646462Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-12T19:37:41.9649313Z 
2026-11-12T19:37:41.9649578Z PLAY [instance_stop] ***********************************************************
2026-11-12T19:37:41.9649739Z skipping: no hosts matched
2026-11-12T19:37:41.9653066Z 
2026-11-12T19:37:41.9653202Z PLAY [machine_reboot] **********************************************************
2026-11-12T19:37:41.9653615Z skipping: no hosts matched
2026-11-12T19:37:41.9660907Z 
2026-11-12T19:37:41.9661230Z PLAY [local] *******************************************************************
2026-11-12T19:37:41.9684212Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-12T19:37:41.9686695Z 
2026-11-12T19:37:41.9686915Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-12T19:37:41.9687143Z skipping: no hosts matched
2026-11-12T19:37:41.9693082Z 
2026-11-12T19:37:41.9693379Z PLAY [local] *******************************************************************
2026-11-12T19:37:41.9716966Z 
2026-11-12T19:37:41.9717612Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-12T19:37:41.9717782Z skipping: no hosts matched
2026-11-12T19:37:41.9724073Z 
2026-11-12T19:37:41.9724252Z PLAY [Configura TSM] ***********************************************************
2026-11-12T19:37:41.9749934Z 
2026-11-12T19:37:41.9751383Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:41.9778926Z 
2026-11-12T19:37:41.9779391Z PLAY [Configura Control-M] *****************************************************
2026-11-12T19:37:41.9814287Z 
2026-11-12T19:37:41.9814551Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:41.9854949Z 
2026-11-12T19:37:41.9855536Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:41.9901033Z 
2026-11-12T19:37:41.9901606Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:41.9940978Z 
2026-11-12T19:37:41.9941371Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:41.9965140Z 
2026-11-12T19:37:41.9965474Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:41.9993758Z 
2026-11-12T19:37:41.9993915Z PLAY [localhost] ***************************************************************
2026-11-12T19:37:42.0023355Z 
2026-11-12T19:37:42.0023703Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:42.0084887Z 
2026-11-12T19:37:42.0085217Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:42.0131155Z 
2026-11-12T19:37:42.0131349Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:42.0166662Z 
2026-11-12T19:37:42.0167033Z PLAY RECAP *********************************************************************
2026-11-12T19:37:42.0167238Z caddeapllx2854.agil.nprd.caixa.gov.br : ok=51   changed=3    unreachable=0    failed=0    skipped=30   rescued=0    ignored=1   
2026-11-12T19:37:42.0167326Z 
2026-11-12T19:37:42.0167692Z Thursday 12 November 2026  16:37:42 -0300 (0:00:00.100)       0:00:22.674 ***** 
2026-11-12T19:37:42.0167874Z =============================================================================== 
2026-11-12T19:37:42.0170148Z Gerando fatos de servicos ----------------------------------------------- 1.43s
2026-11-12T19:37:42.0170390Z Gathering Facts --------------------------------------------------------- 0.89s
2026-11-12T19:37:42.0170625Z Create a symbolic link -------------------------------------------------- 0.82s
2026-11-12T19:37:42.0170853Z Realiza copia do arquivo de Trust Store --------------------------------- 0.77s
2026-11-12T19:37:42.0171078Z maven_artifact ---------------------------------------------------------- 0.68s
2026-11-12T19:37:42.0171299Z Verifica se o arquivo  existe ------------------------------------------- 0.66s
2026-11-12T19:37:42.0171513Z Restart Zabbix ---------------------------------------------------------- 0.66s
2026-11-12T19:37:42.0171741Z Create a directory ------------------------------------------------------ 0.65s
2026-11-12T19:37:42.0172073Z Verifica se o arquivo  existe ------------------------------------------- 0.64s
2026-11-12T19:37:42.0172299Z Get standalone.xml status ----------------------------------------------- 0.64s
2026-11-12T19:37:42.0172522Z Get standalone-full-ha.xml status --------------------------------------- 0.63s
2026-11-12T19:37:42.0172748Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.63s
2026-11-12T19:37:42.0173253Z Get standalone.conf status ---------------------------------------------- 0.63s
2026-11-12T19:37:42.0173610Z Get standalone-ha.xml status -------------------------------------------- 0.63s
2026-11-12T19:37:42.0173829Z Check directory configuration exists ------------------------------------ 0.62s
2026-11-12T19:37:42.0174040Z Copiando arquivo standalone-full-ha.xml --------------------------------- 0.62s
2026-11-12T19:37:42.0174260Z Copiando arquivo standalone.conf ---------------------------------------- 0.60s
2026-11-12T19:37:42.0174476Z JBoss systemd wrapper for sysvinit script mode domain ------------------- 0.60s
2026-11-12T19:37:42.0174692Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 0.59s
2026-11-12T19:37:42.0174912Z Copy common_start.sh ---------------------------------------------------- 0.59s
2026-11-12T19:37:42.0175055Z Playbook run took 0 days, 0 hours, 0 minutes, 22 seconds
2026-11-12T19:37:42.0922535Z ##[section]Finishing: Deploy Config no JBOSS
