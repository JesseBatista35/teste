Peço a configuração de uma imagem com keycloak 10.x.x para a vm.
Esteira Devops:
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=498092&environmentId=2315240


2026-07-13T16:50:33.9384081Z ##[section]Starting: Check Deployments [JBOSS]
2026-07-13T16:50:33.9386976Z ==============================================================================
2026-07-13T16:50:33.9387065Z Task         : Bash
2026-07-13T16:50:33.9387106Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-13T16:50:33.9387165Z Version      : 3.227.0
2026-07-13T16:50:33.9387216Z Author       : Microsoft Corporation
2026-07-13T16:50:33.9387261Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-13T16:50:33.9387329Z ==============================================================================
2026-07-13T16:50:35.0078714Z Generating script.
2026-07-13T16:50:35.0087927Z Script contents:
2026-07-13T16:50:35.0088554Z ansible-playbook /opt/ads-agent/_work/r16857/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=siamc-dev-internet -e site=ctc_nprd
2026-07-13T16:50:35.0090945Z ========================== Starting Command Output ===========================
2026-07-13T16:50:35.0098258Z [command]/bin/bash /opt/ads-agent/_work/_temp/bbc7058f-94f1-419f-8bb3-a28d7164cb1f.sh
2026-07-13T16:50:37.1030303Z 
2026-07-13T16:50:37.1030809Z PLAY [local] *******************************************************************
2026-07-13T16:50:37.1300195Z 
2026-07-13T16:50:37.1300638Z PLAY [Configurando o DNS] ******************************************************
2026-07-13T16:50:37.3516585Z 
2026-07-13T16:50:37.3517283Z PLAY [local] *******************************************************************
2026-07-13T16:50:37.3545943Z 
2026-07-13T16:50:37.3546890Z PLAY [Verificando serviços] ****************************************************
2026-07-13T16:50:37.3628800Z 
2026-07-13T16:50:37.3629660Z PLAY [Configuração LDAP] *******************************************************
2026-07-13T16:50:37.3663597Z [WARNING]: Found variable using reserved name: when
2026-07-13T16:50:37.3667980Z 
2026-07-13T16:50:37.3668274Z PLAY [jboss] *******************************************************************
2026-07-13T16:50:37.3750161Z 
2026-07-13T16:50:37.3750761Z PLAY [Stack Jboss] *************************************************************
2026-07-13T16:50:37.4014088Z Monday 13 July 2026  13:50:37 -0300 (0:00:00.363)       0:00:00.363 *********** 
2026-07-13T16:50:37.9319141Z 
2026-07-13T16:50:37.9320379Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-07-13T16:50:37.9320656Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-13T16:50:37.9342757Z 
2026-07-13T16:50:37.9343113Z PLAY [jboss] *******************************************************************
2026-07-13T16:50:37.9383543Z 
2026-07-13T16:50:37.9383845Z PLAY [jboss] *******************************************************************
2026-07-13T16:50:37.9421893Z 
2026-07-13T16:50:37.9422217Z PLAY [jboss] *******************************************************************
2026-07-13T16:50:37.9447286Z 
2026-07-13T16:50:37.9447887Z PLAY [Copiando deployments adicionais] *****************************************
2026-07-13T16:50:37.9470866Z 
2026-07-13T16:50:37.9471267Z PLAY [Copiando modules adicionais] *********************************************
2026-07-13T16:50:37.9497685Z 
2026-07-13T16:50:37.9497941Z PLAY [jboss] *******************************************************************
2026-07-13T16:50:37.9529355Z 
2026-07-13T16:50:37.9529649Z PLAY [jboss] *******************************************************************
2026-07-13T16:50:37.9556572Z 
2026-07-13T16:50:37.9556892Z PLAY [jboss] *******************************************************************
2026-07-13T16:50:37.9597388Z Monday 13 July 2026  13:50:37 -0300 (0:00:00.558)       0:00:00.922 *********** 
2026-07-13T16:50:38.5567996Z 
2026-07-13T16:50:38.5568730Z TASK [Wait for Jboss Management port] ******************************************
2026-07-13T16:50:38.5569365Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-13T16:50:38.5601971Z Monday 13 July 2026  13:50:38 -0300 (0:00:00.600)       0:00:01.522 *********** 
2026-07-13T16:50:39.4613645Z 
2026-07-13T16:50:39.4614274Z TASK [Check if Jboss is Running] ***********************************************
2026-07-13T16:50:39.4614513Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-13T16:50:39.4646806Z Monday 13 July 2026  13:50:39 -0300 (0:00:00.904)       0:00:02.427 *********** 
2026-07-13T16:50:40.0175960Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-07-13T16:50:45.3678389Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-07-13T16:50:50.7094926Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-07-13T16:50:56.0267203Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-07-13T16:51:01.3986281Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-07-13T16:51:06.7412329Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-07-13T16:51:12.0738618Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-07-13T16:51:17.4179327Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-07-13T16:51:22.7605186Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-07-13T16:51:28.1111618Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-07-13T16:51:33.4328731Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-07-13T16:51:38.7609661Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-07-13T16:51:44.0920365Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-07-13T16:51:49.4351967Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-07-13T16:51:54.7603760Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-07-13T16:52:00.1018268Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-07-13T16:52:05.4381207Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-07-13T16:52:10.7878531Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-07-13T16:52:16.1243448Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-07-13T16:52:21.4578483Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-07-13T16:52:26.7770445Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-07-13T16:52:32.0986148Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-07-13T16:52:37.4213245Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-07-13T16:52:42.7658762Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-07-13T16:52:48.0920603Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-07-13T16:52:53.4383837Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-07-13T16:52:58.7687691Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-07-13T16:53:04.1260834Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-07-13T16:53:09.4631642Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-07-13T16:53:14.7923000Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-07-13T16:53:20.1262155Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-07-13T16:53:25.4701003Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-07-13T16:53:30.8214732Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-07-13T16:53:36.1617627Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-07-13T16:53:41.5001989Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-07-13T16:53:46.8387087Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-07-13T16:53:52.1955964Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-07-13T16:53:57.5336348Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-07-13T16:54:02.8903730Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-07-13T16:54:08.2367468Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-07-13T16:54:13.5724624Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-07-13T16:54:18.8991821Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-07-13T16:54:24.2668714Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-07-13T16:54:29.5832468Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-07-13T16:54:34.9126589Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-07-13T16:54:40.2652136Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-07-13T16:54:45.5859215Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-07-13T16:54:50.9205324Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-07-13T16:54:56.2579855Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-07-13T16:55:01.6244614Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-07-13T16:55:06.9792635Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-07-13T16:55:12.3199577Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-07-13T16:55:17.6707349Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-07-13T16:55:23.0199397Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-07-13T16:55:28.3620459Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-07-13T16:55:33.6826493Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-07-13T16:55:39.0124411Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-07-13T16:55:44.3416099Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-07-13T16:55:49.6665582Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-07-13T16:55:55.0083385Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-07-13T16:56:00.3592837Z 
2026-07-13T16:56:00.3593372Z TASK [Check Deployment details looking for status OK] **************************
2026-07-13T16:56:00.3601879Z fatal: [caddeapllx2620.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"siamc-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"umpZjLWN5bvWMBSnP9DPIYYhIpU=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1783961430134, \"enabled-timestamp\" : \"2026-07-13 13:50:30,134 BRT\", \"managed\" : true, \"name\" : \"siamc-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"siamc-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"siamc-web-3.0.0-SNAPSHOT.war\" : null}, \"subsystem\" : null}}}", "content_encoding": "identity", "content_length": "567", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Mon, 13 Jul 2026 16:56:00 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"siamc-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "umpZjLWN5bvWMBSnP9DPIYYhIpU="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1783961430134, "enabled-timestamp": "2026-07-13 13:50:30,134 BRT", "managed": true, "name": "siamc-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "siamc-ear.ear", "status": "FAILED", "subdeployment": {"siamc-web-3.0.0-SNAPSHOT.war": null}, "subsystem": null}}}, "msg": "OK (567 bytes)", "redirected": false, "status": 200, "url": "http://10.116.201.81:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-07-13T16:56:00.3642243Z Monday 13 July 2026  13:56:00 -0300 (0:05:20.899)       0:05:23.326 *********** 
2026-07-13T16:56:08.2328883Z 
2026-07-13T16:56:08.2329440Z TASK [systemd] *****************************************************************
2026-07-13T16:56:08.2330813Z changed: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-13T16:56:08.2364201Z Monday 13 July 2026  13:56:08 -0300 (0:00:07.872)       0:05:31.199 *********** 
2026-07-13T16:56:08.6682583Z 
2026-07-13T16:56:08.6685352Z TASK [Wait for Jboss Management port] ******************************************
2026-07-13T16:56:08.6686094Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-13T16:56:08.6712316Z Monday 13 July 2026  13:56:08 -0300 (0:00:00.434)       0:05:31.633 *********** 
2026-07-13T16:56:09.4570843Z 
2026-07-13T16:56:09.4572006Z TASK [Check if Jboss is Running] ***********************************************
2026-07-13T16:56:09.4572525Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-13T16:56:09.4605561Z Monday 13 July 2026  13:56:09 -0300 (0:00:00.789)       0:05:32.423 *********** 
2026-07-13T16:56:09.9489982Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-07-13T16:56:15.2776023Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-07-13T16:56:20.6328636Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-07-13T16:56:25.9786717Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-07-13T16:56:31.3528910Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-07-13T16:56:36.6876089Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-07-13T16:56:42.0333146Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-07-13T16:56:47.3638022Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-07-13T16:56:52.7181557Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-07-13T16:56:58.0564003Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-07-13T16:57:03.3877750Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-07-13T16:57:08.7198870Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-07-13T16:57:14.0725838Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-07-13T16:57:19.3963354Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-07-13T16:57:24.7279435Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-07-13T16:57:30.0787685Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-07-13T16:57:35.4258418Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-07-13T16:57:40.7535914Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-07-13T16:57:46.4127459Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-07-13T16:57:51.7478384Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-07-13T16:57:57.0924807Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-07-13T16:58:02.4725911Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-07-13T16:58:07.8401118Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-07-13T16:58:13.1701742Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-07-13T16:58:18.5314647Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-07-13T16:58:23.8828279Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-07-13T16:58:29.2200908Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-07-13T16:58:34.5495701Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-07-13T16:58:39.8751087Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-07-13T16:58:45.2128988Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-07-13T16:58:50.5595079Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-07-13T16:58:55.9184487Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-07-13T16:59:01.2611614Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-07-13T16:59:06.6084652Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-07-13T16:59:11.9415760Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-07-13T16:59:17.2845975Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-07-13T16:59:22.6060165Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-07-13T16:59:27.9343043Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-07-13T16:59:33.2640420Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-07-13T16:59:38.5965920Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-07-13T16:59:43.9388918Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-07-13T16:59:49.2929217Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-07-13T16:59:54.6265513Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-07-13T16:59:59.9534509Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-07-13T17:00:05.3085579Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-07-13T17:00:10.6517170Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-07-13T17:00:16.0001840Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-07-13T17:00:21.3248470Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-07-13T17:00:26.6765435Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-07-13T17:00:32.0251869Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-07-13T17:00:37.3592912Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-07-13T17:00:42.6918796Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-07-13T17:00:48.0335827Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-07-13T17:00:53.3747854Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-07-13T17:00:58.7063518Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-07-13T17:01:04.0587418Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-07-13T17:01:09.4277049Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-07-13T17:01:14.8006872Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-07-13T17:01:20.1296640Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-07-13T17:01:25.4540338Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-07-13T17:01:52.0333445Z 
2026-07-13T17:01:52.0333938Z TASK [Check Deployment details looking for status OK] **************************
2026-07-13T17:01:52.0336672Z fatal: [caddeapllx2620.agil.nprd.caixa.gov.br]: FAILED! => {"msg": "The conditional check ''FAILED' not in is_ok.json | json_query(query)' failed. The error was: Error in jmespath.search in json_query filter plugin:\n'dict object' has no attribute 'json'"}
2026-07-13T17:01:52.0339552Z 
2026-07-13T17:01:52.0339933Z PLAY RECAP *********************************************************************
2026-07-13T17:01:52.0340273Z caddeapllx2620.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-07-13T17:01:52.0340367Z 
2026-07-13T17:01:52.0341125Z Monday 13 July 2026  14:01:52 -0300 (0:05:42.573)       0:11:14.996 *********** 
2026-07-13T17:01:52.0341446Z =============================================================================== 
2026-07-13T17:01:52.0347481Z Check Deployment details looking for status OK ------------------------ 342.57s
2026-07-13T17:01:52.0347956Z Check Deployment details looking for status OK ------------------------ 320.90s
2026-07-13T17:01:52.0348521Z systemd ----------------------------------------------------------------- 7.87s
2026-07-13T17:01:52.0348913Z Check if Jboss is Running ----------------------------------------------- 0.90s
2026-07-13T17:01:52.0349132Z Check if Jboss is Running ----------------------------------------------- 0.79s
2026-07-13T17:01:52.0349378Z Wait for Jboss Management port ------------------------------------------ 0.60s
2026-07-13T17:01:52.0349594Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.56s
2026-07-13T17:01:52.0349813Z Wait for Jboss Management port ------------------------------------------ 0.43s
2026-07-13T17:01:52.0349958Z Playbook run took 0 days, 0 hours, 11 minutes, 14 seconds
2026-07-13T17:01:52.1070401Z ##[error]Bash exited with code '2'.
2026-07-13T17:01:52.1114937Z ##[section]Finishing: Check Deployments [JBOSS]


estou logado no jbos me auda a verificar isso:



Warning: Permanently added '10.116.201.81' (ED25519) to the list of known hosts.
p585600@10.116.201.81's password:
Last login: Wed Jul  8 17:18:04 2026 from dat7261ux0211.coresp.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


