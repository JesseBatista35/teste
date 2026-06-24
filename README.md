À CESTI multiplataforma, A/C Jesse Mouta Pereira,

Após criação dos VIP's, e atualização destes no DNS, o sistema (chamada por URL https://sicmu-intranet-update.esteiras.des.caixa/sicmu) passou a cair por time-out, com a msg:

" .......  O servidor sicmu-intranet-update.esteiras.des.caixa demorou muito para responder. Este site pode estar temporariamente indisponível ou sobrecarregado. Tente novamente daqui a pouco. Se você não conseguir carregar nenhuma página, verifique a conexão de rede do computador.
    Se a rede ou o computador estiver protegido por um firewall ou proxy, verifique se o Firefox está autorizado a acessar a web....."

Atenciosamente,
Marcelo Lucindo de Souza
Consultor de TI - CESOA


rodei uma nova build eel ta quebrando no 

2026-06-24T19:14:05.8574671Z ##[section]Starting: Deploy Config no JBOSS
2026-06-24T19:14:05.8577765Z ==============================================================================
2026-06-24T19:14:05.8577841Z Task         : Bash
2026-06-24T19:14:05.8577884Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-24T19:14:05.8577958Z Version      : 3.227.0
2026-06-24T19:14:05.8578000Z Author       : Microsoft Corporation
2026-06-24T19:14:05.8578051Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-24T19:14:05.8578145Z ==============================================================================
2026-06-24T19:14:05.9789631Z Generating script.
2026-06-24T19:14:05.9800479Z ========================== Starting Command Output ===========================
2026-06-24T19:14:05.9807384Z [command]/bin/bash /opt/ads-agent/_work/_temp/29e0ceb1-6920-47ff-bebf-85522e33c1c7.sh
2026-06-24T19:14:05.9894185Z /opt/ads-agent/_work/_temp/29e0ceb1-6920-47ff-bebf-85522e33c1c7.sh: line 2: quantidade_vm: comando não encontrado
2026-06-24T19:14:05.9908230Z /opt/ads-agent/_work/_temp/29e0ceb1-6920-47ff-bebf-85522e33c1c7.sh: line 2: USE_WMQ: comando não encontrado
2026-06-24T19:14:08.1733502Z 
2026-06-24T19:14:08.1733980Z PLAY [local] *******************************************************************
2026-06-24T19:14:08.2048141Z 
2026-06-24T19:14:08.2048680Z PLAY [Configurando o DNS] ******************************************************
2026-06-24T19:14:08.4280334Z 
2026-06-24T19:14:08.4280865Z PLAY [local] *******************************************************************
2026-06-24T19:14:08.4319493Z 
2026-06-24T19:14:08.4320240Z PLAY [Verificando serviços] ****************************************************
2026-06-24T19:14:08.4418692Z 
2026-06-24T19:14:08.4419545Z PLAY [Configuração LDAP] *******************************************************
2026-06-24T19:14:08.4458457Z [WARNING]: Found variable using reserved name: when
2026-06-24T19:14:08.4464430Z 
2026-06-24T19:14:08.4464592Z PLAY [jboss] *******************************************************************
2026-06-24T19:14:08.4556695Z 
2026-06-24T19:14:08.4557348Z PLAY [Stack Jboss] *************************************************************
2026-06-24T19:14:08.4812283Z Wednesday 24 June 2026  16:14:08 -0300 (0:00:00.369)       0:00:00.369 ******** 
2026-06-24T19:14:08.9839934Z 
2026-06-24T19:14:08.9840706Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-24T19:14:08.9840879Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:08.9870900Z 
2026-06-24T19:14:08.9871457Z PLAY [jboss] *******************************************************************
2026-06-24T19:14:08.9949286Z Wednesday 24 June 2026  16:14:08 -0300 (0:00:00.513)       0:00:00.883 ******** 
2026-06-24T19:14:09.3929082Z 
2026-06-24T19:14:09.3930050Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-06-24T19:14:09.3930271Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:09.3966424Z Wednesday 24 June 2026  16:14:09 -0300 (0:00:00.401)       0:00:01.285 ******** 
2026-06-24T19:14:09.4472710Z included: /opt/ads-agent/_work/r18561/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2484.agil.nprd.caixa.gov.br
2026-06-24T19:14:09.4520284Z Wednesday 24 June 2026  16:14:09 -0300 (0:00:00.055)       0:00:01.340 ******** 
2026-06-24T19:14:09.5125568Z 
2026-06-24T19:14:09.5126305Z TASK [nfs : Criar variáveis] ***************************************************
2026-06-24T19:14:09.5126480Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:09.5177679Z Wednesday 24 June 2026  16:14:09 -0300 (0:00:00.065)       0:00:01.406 ******** 
2026-06-24T19:14:10.0247807Z 
2026-06-24T19:14:10.0248498Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-06-24T19:14:10.0248724Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:10.0284065Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.510)       0:00:01.917 ******** 
2026-06-24T19:14:10.0986380Z 
2026-06-24T19:14:10.0987384Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-06-24T19:14:10.0988112Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => {
2026-06-24T19:14:10.0988260Z     "nfs_vars_json": {
2026-06-24T19:14:10.0988409Z         "changed": false, 
2026-06-24T19:14:10.0988741Z         "cmd": "cat /opt/ads-agent/_work/r18561/a/nfs_config.json", 
2026-06-24T19:14:10.0988902Z         "delta": "0:00:00.006623", 
2026-06-24T19:14:10.0989076Z         "end": "2026-06-24 16:14:10.004445", 
2026-06-24T19:14:10.0989220Z         "failed": false, 
2026-06-24T19:14:10.0989328Z         "rc": 0, 
2026-06-24T19:14:10.0989505Z         "start": "2026-06-24 16:14:09.997822", 
2026-06-24T19:14:10.0989629Z         "stderr": "", 
2026-06-24T19:14:10.0989742Z         "stderr_lines": [], 
2026-06-24T19:14:10.0989854Z         "stdout": "[]", 
2026-06-24T19:14:10.0989954Z         "stdout_lines": [
2026-06-24T19:14:10.0990059Z             "[]"
2026-06-24T19:14:10.0990154Z         ]
2026-06-24T19:14:10.0990251Z     }
2026-06-24T19:14:10.0990351Z }
2026-06-24T19:14:10.1025450Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.074)       0:00:01.991 ******** 
2026-06-24T19:14:10.1661067Z 
2026-06-24T19:14:10.1661777Z TASK [nfs : Criar variáveis] ***************************************************
2026-06-24T19:14:10.1661947Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:10.1711749Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.068)       0:00:02.060 ******** 
2026-06-24T19:14:10.2188056Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.047)       0:00:02.107 ******** 
2026-06-24T19:14:10.2645968Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.045)       0:00:02.153 ******** 
2026-06-24T19:14:10.3093546Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.044)       0:00:02.198 ******** 
2026-06-24T19:14:10.3542427Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.044)       0:00:02.242 ******** 
2026-06-24T19:14:10.3999894Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.045)       0:00:02.288 ******** 
2026-06-24T19:14:10.4463595Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.046)       0:00:02.335 ******** 
2026-06-24T19:14:10.4960798Z 
2026-06-24T19:14:10.4961735Z PLAY [jboss] *******************************************************************
2026-06-24T19:14:10.5016347Z 
2026-06-24T19:14:10.5016860Z PLAY [jboss] *******************************************************************
2026-06-24T19:14:10.5061043Z Wednesday 24 June 2026  16:14:10 -0300 (0:00:00.059)       0:00:02.394 ******** 
2026-06-24T19:14:11.4912355Z 
2026-06-24T19:14:11.4913051Z TASK [Gathering Facts] *********************************************************
2026-06-24T19:14:11.4913225Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:11.5088892Z Wednesday 24 June 2026  16:14:11 -0300 (0:00:01.002)       0:00:03.397 ******** 
2026-06-24T19:14:12.9185945Z 
2026-06-24T19:14:12.9186565Z TASK [Gerando fatos de servicos] ***********************************************
2026-06-24T19:14:12.9186741Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:12.9482011Z Wednesday 24 June 2026  16:14:12 -0300 (0:00:01.439)       0:00:04.836 ******** 
2026-06-24T19:14:13.0099914Z 
2026-06-24T19:14:13.0100465Z TASK [Gerando lista de units jboss] ********************************************
2026-06-24T19:14:13.0100632Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:13.0356082Z Wednesday 24 June 2026  16:14:13 -0300 (0:00:00.087)       0:00:04.924 ******** 
2026-06-24T19:14:13.1014895Z Wednesday 24 June 2026  16:14:13 -0300 (0:00:00.065)       0:00:04.990 ******** 
2026-06-24T19:14:13.1154255Z 
2026-06-24T19:14:13.1154562Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-24T19:14:13.1429054Z Wednesday 24 June 2026  16:14:13 -0300 (0:00:00.041)       0:00:05.031 ******** 
2026-06-24T19:14:13.2047353Z 
2026-06-24T19:14:13.2048086Z TASK [Cria variável build_repository_name] *************************************
2026-06-24T19:14:13.2048271Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:13.2284192Z Wednesday 24 June 2026  16:14:13 -0300 (0:00:00.085)       0:00:05.117 ******** 
2026-06-24T19:14:13.2857881Z 
2026-06-24T19:14:13.2858438Z TASK [Buscando diretorio de config] ********************************************
2026-06-24T19:14:13.2858606Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:13.3098993Z Wednesday 24 June 2026  16:14:13 -0300 (0:00:00.081)       0:00:05.198 ******** 
2026-06-24T19:14:13.3671928Z 
2026-06-24T19:14:13.3672899Z TASK [Buscando diretorio de config] ********************************************
2026-06-24T19:14:13.3673538Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:13.3997530Z Wednesday 24 June 2026  16:14:13 -0300 (0:00:00.089)       0:00:05.288 ******** 
2026-06-24T19:14:13.9908977Z 
2026-06-24T19:14:13.9909510Z TASK [Create a symbolic link] **************************************************
2026-06-24T19:14:13.9909948Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config)
2026-06-24T19:14:14.3121086Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config/jboss)
2026-06-24T19:14:14.3419967Z Wednesday 24 June 2026  16:14:14 -0300 (0:00:00.942)       0:00:06.230 ******** 
2026-06-24T19:14:14.7058960Z 
2026-06-24T19:14:14.7059508Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-24T19:14:14.7059965Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config)
2026-06-24T19:14:15.0260870Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config/jboss)
2026-06-24T19:14:15.0550453Z Wednesday 24 June 2026  16:14:15 -0300 (0:00:00.712)       0:00:06.943 ******** 
2026-06-24T19:14:15.1480750Z included: /opt/ads-agent/_work/r18561/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx2484.agil.nprd.caixa.gov.br
2026-06-24T19:14:15.1763406Z Wednesday 24 June 2026  16:14:15 -0300 (0:00:00.121)       0:00:07.065 ******** 
2026-06-24T19:14:15.6902041Z 
2026-06-24T19:14:15.6903025Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-06-24T19:14:15.6903270Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:15.7231752Z Wednesday 24 June 2026  16:14:15 -0300 (0:00:00.546)       0:00:07.611 ******** 
2026-06-24T19:14:15.7325852Z [WARNING]: The loop variable 'item' is already in use. You should set the
2026-06-24T19:14:15.7326764Z `loop_var` value in the `loop_control` option for the task to something else to
2026-06-24T19:14:15.7327287Z avoid variable collisions and unexpected behavior.
2026-06-24T19:14:15.7711578Z 
2026-06-24T19:14:15.7712236Z TASK [Mostra artefatos] ********************************************************
2026-06-24T19:14:15.7713407Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'9.0.4.0', u'group_id': u'com.ibm.mq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'}) => {
2026-06-24T19:14:15.7713721Z     "msg": "Artefato: wmq.jmsra - versao 9.0.4.0"
2026-06-24T19:14:15.7713903Z }
2026-06-24T19:14:15.8024701Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'}) => {
2026-06-24T19:14:15.8025105Z     "msg": "Artefato: framework - versao 3.0.0"
2026-06-24T19:14:15.8025214Z }
2026-06-24T19:14:15.8338011Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'}) => {
2026-06-24T19:14:15.8338432Z     "msg": "Artefato: applicationinsights-agent - versao 3.3.1"
2026-06-24T19:14:15.8338561Z }
2026-06-24T19:14:15.8657379Z Wednesday 24 June 2026  16:14:15 -0300 (0:00:00.142)       0:00:07.754 ******** 
2026-06-24T19:14:16.7895139Z 
2026-06-24T19:14:16.7895667Z TASK [maven_artifact] **********************************************************
2026-06-24T19:14:16.7896647Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'9.0.4.0', u'group_id': u'com.ibm.mq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'})
2026-06-24T19:14:17.2148747Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'})
2026-06-24T19:14:17.8564368Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'})
2026-06-24T19:14:17.8815053Z Wednesday 24 June 2026  16:14:17 -0300 (0:00:02.015)       0:00:09.770 ******** 
2026-06-24T19:14:19.3333222Z 
2026-06-24T19:14:19.3333706Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-06-24T19:14:19.3333875Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:19.3587276Z Wednesday 24 June 2026  16:14:19 -0300 (0:00:01.477)       0:00:11.247 ******** 
2026-06-24T19:14:19.4057232Z 
2026-06-24T19:14:19.4058161Z PLAY [Copiando modules adicionais] *********************************************
2026-06-24T19:14:19.4355369Z Wednesday 24 June 2026  16:14:19 -0300 (0:00:00.076)       0:00:11.324 ******** 
2026-06-24T19:14:19.4928202Z 
2026-06-24T19:14:19.4929384Z TASK [Cria variável build_repository_name] *************************************
2026-06-24T19:14:19.4930046Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:19.5180482Z Wednesday 24 June 2026  16:14:19 -0300 (0:00:00.082)       0:00:11.406 ******** 
2026-06-24T19:14:19.5763878Z 
2026-06-24T19:14:19.5764874Z TASK [Buscando diretorio de config] ********************************************
2026-06-24T19:14:19.5765262Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:19.6023753Z Wednesday 24 June 2026  16:14:19 -0300 (0:00:00.084)       0:00:11.491 ******** 
2026-06-24T19:14:19.6598422Z 
2026-06-24T19:14:19.6598968Z TASK [Buscando diretorio de config] ********************************************
2026-06-24T19:14:19.6600558Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:19.6937283Z Wednesday 24 June 2026  16:14:19 -0300 (0:00:00.091)       0:00:11.582 ******** 
2026-06-24T19:14:20.0684802Z 
2026-06-24T19:14:20.0685420Z TASK [Create a directory] ******************************************************
2026-06-24T19:14:20.0685859Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config)
2026-06-24T19:14:20.3914302Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config/jboss)
2026-06-24T19:14:20.4214955Z Wednesday 24 June 2026  16:14:20 -0300 (0:00:00.727)       0:00:12.310 ******** 
2026-06-24T19:14:20.7829698Z 
2026-06-24T19:14:20.7830644Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-24T19:14:20.7831117Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config)
2026-06-24T19:14:21.1078830Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r18561/a/_SICMU-intranet-update-config/jboss)
2026-06-24T19:14:21.1339509Z Wednesday 24 June 2026  16:14:21 -0300 (0:00:00.712)       0:00:13.022 ******** 
2026-06-24T19:14:21.2349249Z included: /opt/ads-agent/_work/r18561/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx2484.agil.nprd.caixa.gov.br
2026-06-24T19:14:21.2624804Z Wednesday 24 June 2026  16:14:21 -0300 (0:00:00.128)       0:00:13.151 ******** 
2026-06-24T19:14:21.6243417Z 
2026-06-24T19:14:21.6244367Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-06-24T19:14:21.6244581Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:21.6576044Z Wednesday 24 June 2026  16:14:21 -0300 (0:00:00.394)       0:00:13.546 ******** 
2026-06-24T19:14:21.6686368Z [WARNING]: The loop variable 'item' is already in use. You should set the
2026-06-24T19:14:21.6687153Z `loop_var` value in the `loop_control` option for the task to something else to
2026-06-24T19:14:21.6687331Z avoid variable collisions and unexpected behavior.
2026-06-24T19:14:21.7074990Z 
2026-06-24T19:14:21.7075547Z TASK [Mostra lista de artefatos] ***********************************************
2026-06-24T19:14:21.7076023Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'2.0.1', u'group_id': u'br.gov.caixa', u'extension': u'jar', u'artifact_id': u'framework'}) => {
2026-06-24T19:14:21.7076298Z     "msg": "Artefato: framework - versao 2.0.1"
2026-06-24T19:14:21.7076420Z }
2026-06-24T19:14:21.7386508Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'2.10', u'group_id': u'br.gov.caixa.psc', u'extension': u'jar', u'artifact_id': u'jconnector'}) => {
2026-06-24T19:14:21.7386823Z     "msg": "Artefato: jconnector - versao 2.10"
2026-06-24T19:14:21.7386949Z }
2026-06-24T19:14:21.7698009Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'4.0', u'group_id': u'org.primefaces', u'extension': u'jar', u'artifact_id': u'primefaces'}) => {
2026-06-24T19:14:21.7699053Z     "msg": "Artefato: primefaces - versao 4.0"
2026-06-24T19:14:21.7699632Z }
2026-06-24T19:14:21.8020191Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'3.9', u'group_id': u'org.apache.poi', u'extension': u'jar', u'artifact_id': u'poi'}) => {
2026-06-24T19:14:21.8020784Z     "msg": "Artefato: poi - versao 3.9"
2026-06-24T19:14:21.8021411Z }
2026-06-24T19:14:21.8332067Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'3.11', u'group_id': u'org.apache.poi', u'extension': u'jar', u'artifact_id': u'poi'}) => {
2026-06-24T19:14:21.8332864Z     "msg": "Artefato: poi - versao 3.11"
2026-06-24T19:14:21.8332980Z }
2026-06-24T19:14:21.8664597Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'1.2', u'group_id': u'br.gov.caixa.sisgr', u'extension': u'jar', u'artifact_id': u'sisgr'}) => {
2026-06-24T19:14:21.8664964Z     "msg": "Artefato: sisgr - versao 1.2"
2026-06-24T19:14:21.8665103Z }
2026-06-24T19:14:21.8973300Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'2.1.0', u'group_id': u'com.lowagie', u'extension': u'jar', u'artifact_id': u'itext'}) => {
2026-06-24T19:14:21.8973836Z     "msg": "Artefato: itext - versao 2.1.0"
2026-06-24T19:14:21.8974403Z }
2026-06-24T19:14:21.9281219Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.15', u'group_id': u'jfree', u'extension': u'jar', u'artifact_id': u'jcommon'}) => {
2026-06-24T19:14:21.9281599Z     "msg": "Artefato: jcommon - versao 1.0.15"
2026-06-24T19:14:21.9282691Z }
2026-06-24T19:14:21.9578436Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.9', u'group_id': u'jfree', u'extension': u'jar', u'artifact_id': u'jfreechart'}) => {
2026-06-24T19:14:21.9578982Z     "msg": "Artefato: jfreechart - versao 1.0.9"
2026-06-24T19:14:21.9579524Z }
2026-06-24T19:14:21.9994308Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'3.5.3', u'group_id': u'jasperreports', u'extension': u'jar', u'artifact_id': u'jasperreports'}) => {
2026-06-24T19:14:21.9994878Z     "msg": "Artefato: jasperreports - versao 3.5.3"
2026-06-24T19:14:21.9995094Z }
2026-06-24T19:14:22.0337733Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'1.3', u'group_id': u'apache.commons.fileupload', u'extension': u'jar', u'artifact_id': u'fileupload'}) => {
2026-06-24T19:14:22.0338222Z     "msg": "Artefato: fileupload - versao 1.3"
2026-06-24T19:14:22.0338410Z }
2026-06-24T19:14:22.0650881Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br] => (item={u'version': u'2.1', u'group_id': u'commons-digester', u'extension': u'jar', u'artifact_id': u'commons-digester'}) => {
2026-06-24T19:14:22.0651328Z     "msg": "Artefato: commons-digester - versao 2.1"
2026-06-24T19:14:22.0651491Z }
2026-06-24T19:14:22.1011981Z Wednesday 24 June 2026  16:14:22 -0300 (0:00:00.443)       0:00:13.989 ******** 
2026-06-24T19:14:22.5646811Z 
2026-06-24T19:14:22.5648228Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-06-24T19:14:22.5649212Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:22.6046154Z Wednesday 24 June 2026  16:14:22 -0300 (0:00:00.503)       0:00:14.493 ******** 
2026-06-24T19:14:23.0647964Z Wednesday 24 June 2026  16:14:23 -0300 (0:00:00.460)       0:00:14.953 ******** 
2026-06-24T19:14:26.4316476Z 
2026-06-24T19:14:26.4317538Z TASK [Verifica se o arquivo jboss-modules-custom tem conteudo] *****************
2026-06-24T19:14:26.4318162Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:26.4584271Z Wednesday 24 June 2026  16:14:26 -0300 (0:00:03.393)       0:00:18.347 ******** 
2026-06-24T19:14:29.6278495Z 
2026-06-24T19:14:29.6279536Z TASK [Copiando artefatos (Modules) para o(s) servidor(es) Jboss] ***************
2026-06-24T19:14:29.6279912Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:29.6570023Z Wednesday 24 June 2026  16:14:29 -0300 (0:00:03.198)       0:00:21.545 ******** 
2026-06-24T19:14:33.2545389Z 
2026-06-24T19:14:33.2546238Z TASK [Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss] *******
2026-06-24T19:14:33.2546414Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:33.2796339Z Wednesday 24 June 2026  16:14:33 -0300 (0:00:03.622)       0:00:25.168 ******** 
2026-06-24T19:14:36.1521271Z 
2026-06-24T19:14:36.1522290Z TASK [Executando o jboss-custom.cli] *******************************************
2026-06-24T19:14:36.1523077Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:36.1936511Z Wednesday 24 June 2026  16:14:36 -0300 (0:00:02.914)       0:00:28.082 ******** 
2026-06-24T19:14:37.4303599Z 
2026-06-24T19:14:37.4304456Z TASK [Encontrar todos os arquivos module.xml] **********************************
2026-06-24T19:14:37.4304935Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:37.6432922Z Wednesday 24 June 2026  16:14:37 -0300 (0:00:01.449)       0:00:29.531 ******** 
2026-06-24T19:14:38.5018327Z 
2026-06-24T19:14:38.5019253Z TASK [Filtrar arquivos dentro da pasta system na raiz] *************************
2026-06-24T19:14:38.5019474Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:38.6606660Z Wednesday 24 June 2026  16:14:38 -0300 (0:00:01.017)       0:00:30.549 ******** 
2026-06-24T19:14:38.8823644Z 
2026-06-24T19:14:38.8824566Z TASK [Filtrar arquivos fora da pasta system na raiz] ***************************
2026-06-24T19:14:38.8824781Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:38.9101376Z Wednesday 24 June 2026  16:14:38 -0300 (0:00:00.249)       0:00:30.798 ******** 
2026-06-24T19:14:38.9520530Z Wednesday 24 June 2026  16:14:38 -0300 (0:00:00.041)       0:00:30.840 ******** 
2026-06-24T19:14:38.9994900Z 
2026-06-24T19:14:38.9995418Z PLAY [jboss] *******************************************************************
2026-06-24T19:14:39.0276778Z Wednesday 24 June 2026  16:14:39 -0300 (0:00:00.075)       0:00:30.916 ******** 
2026-06-24T19:14:39.1019026Z 
2026-06-24T19:14:39.1020326Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-24T19:14:39.1020568Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:39.1299807Z Wednesday 24 June 2026  16:14:39 -0300 (0:00:00.102)       0:00:31.018 ******** 
2026-06-24T19:14:39.1883529Z 
2026-06-24T19:14:39.1884631Z TASK [Cria variável build_repository_name_tfs] *********************************
2026-06-24T19:14:39.1884875Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:39.2146463Z Wednesday 24 June 2026  16:14:39 -0300 (0:00:00.084)       0:00:31.103 ******** 
2026-06-24T19:14:39.2764277Z 
2026-06-24T19:14:39.2764814Z TASK [Buscando diretorio de config] ********************************************
2026-06-24T19:14:39.2764978Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-06-24T19:14:39.3049436Z Wednesday 24 June 2026  16:14:39 -0300 (0:00:00.090)       0:00:31.193 ******** 
2026-06-24T19:14:44.9069312Z 
2026-06-24T19:14:44.9069908Z TASK [Copy common_start.sh] ****************************************************
2026-06-24T19:14:44.9071235Z fatal: [caddeapllx2484.agil.nprd.caixa.gov.br]: FAILED! => {"msg": "Failed to get information on remote file (/opt/jboss-eap/bin/common_start.sh): sudo: ldap_sasl_bind_s(): Can't contact LDAP server\n\nPresumimos que você recebeu as instruções de sempre do administrador\nde sistema local. Basicamente, resume-se a estas três coisas:\n\n    #1) Respeite a privacidade dos outros.\n    #2) Pense antes de digitar.\n    #3) Com grandes poderes vêm grandes responsabilidades.\n\nsudo: nenhum tty presente e nenhum programa de askpass especificado\n"}
2026-06-24T19:14:44.9082951Z 
2026-06-24T19:14:44.9083314Z PLAY RECAP *********************************************************************
2026-06-24T19:14:44.9083540Z caddeapllx2484.agil.nprd.caixa.gov.br : ok=39   changed=4    unreachable=0    failed=1    skipped=13   rescued=0    ignored=0   
2026-06-24T19:14:44.9083645Z 
2026-06-24T19:14:44.9083966Z Wednesday 24 June 2026  16:14:44 -0300 (0:00:05.602)       0:00:36.796 ******** 
2026-06-24T19:14:44.9084169Z =============================================================================== 
2026-06-24T19:14:44.9084417Z Copy common_start.sh ---------------------------------------------------- 5.60s
2026-06-24T19:14:44.9084642Z Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss ------- 3.62s
2026-06-24T19:14:44.9084876Z Verifica se o arquivo jboss-modules-custom tem conteudo ----------------- 3.39s
2026-06-24T19:14:44.9085107Z Copiando artefatos (Modules) para o(s) servidor(es) Jboss --------------- 3.20s
2026-06-24T19:14:44.9085536Z Executando o jboss-custom.cli ------------------------------------------- 2.91s
2026-06-24T19:14:44.9085889Z maven_artifact ---------------------------------------------------------- 2.02s
2026-06-24T19:14:44.9086131Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 1.48s
2026-06-24T19:14:44.9086363Z Encontrar todos os arquivos module.xml ---------------------------------- 1.45s
2026-06-24T19:14:44.9086593Z Gerando fatos de servicos ----------------------------------------------- 1.44s
2026-06-24T19:14:44.9086826Z Filtrar arquivos dentro da pasta system na raiz ------------------------- 1.02s
2026-06-24T19:14:44.9087051Z Gathering Facts --------------------------------------------------------- 1.00s
2026-06-24T19:14:44.9087266Z Create a symbolic link -------------------------------------------------- 0.94s
2026-06-24T19:14:44.9087490Z Create a directory ------------------------------------------------------ 0.73s
2026-06-24T19:14:44.9087717Z Verifica se o arquivo  existe ------------------------------------------- 0.71s
2026-06-24T19:14:44.9087941Z Verifica se o arquivo  existe ------------------------------------------- 0.71s
2026-06-24T19:14:44.9088172Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.55s
2026-06-24T19:14:44.9088405Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.51s
2026-06-24T19:14:44.9088629Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.51s
2026-06-24T19:14:44.9088858Z Listar arquivos no diretório baixados anteriormente --------------------- 0.50s
2026-06-24T19:14:44.9089086Z maven_artifact ---------------------------------------------------------- 0.46s
2026-06-24T19:14:44.9089244Z Playbook run took 0 days, 0 hours, 0 minutes, 36 seconds
2026-06-24T19:14:45.0068943Z ##[error]Bash exited with code '2'.
2026-06-24T19:14:45.0071463Z ##[section]Finishing: Deploy Config no JBOSS



p585600@10.116.200.228's password:
Last login: Tue Jun 16 11:31:53 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


estou logado no servidor.
