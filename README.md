2026-10-23T12:12:17.7901655Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-23T12:12:17.7904726Z ==============================================================================
2026-10-23T12:12:17.7904801Z Task         : Bash
2026-10-23T12:12:17.7904850Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-23T12:12:17.7904910Z Version      : 3.227.0
2026-10-23T12:12:17.7904954Z Author       : Microsoft Corporation
2026-10-23T12:12:17.7905011Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-23T12:12:17.7905179Z ==============================================================================
2026-10-23T12:12:17.9077043Z Generating script.
2026-10-23T12:12:17.9088371Z Script contents:
2026-10-23T12:12:17.9088873Z ansible-playbook /opt/ads-agent/_work/r19317/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-intranet -e site=ctc_nprd
2026-10-23T12:12:17.9092327Z ========================== Starting Command Output ===========================
2026-10-23T12:12:17.9099875Z [command]/bin/bash /opt/ads-agent/_work/_temp/f3bb27d8-685a-46a8-9065-8f88d646234f.sh
2026-10-23T12:12:20.1789392Z 
2026-10-23T12:12:20.1789976Z PLAY [local] *******************************************************************
2026-10-23T12:12:20.2091737Z 
2026-10-23T12:12:20.2092496Z PLAY [Configurando o DNS] ******************************************************
2026-10-23T12:12:20.4053856Z 
2026-10-23T12:12:20.4054767Z PLAY [local] *******************************************************************
2026-10-23T12:12:20.4089810Z 
2026-10-23T12:12:20.4090749Z PLAY [Verificando serviços] ****************************************************
2026-10-23T12:12:20.4183058Z 
2026-10-23T12:12:20.4183461Z PLAY [Configuração LDAP] *******************************************************
2026-10-23T12:12:20.4218078Z [WARNING]: Found variable using reserved name: when
2026-10-23T12:12:20.4222889Z 
2026-10-23T12:12:20.4223034Z PLAY [jboss] *******************************************************************
2026-10-23T12:12:20.4311957Z 
2026-10-23T12:12:20.4312707Z PLAY [Stack Jboss] *************************************************************
2026-10-23T12:12:20.4553958Z Friday 23 October 2026  09:12:20 -0300 (0:00:00.337)       0:00:00.337 ******** 
2026-10-23T12:12:20.9793181Z 
2026-10-23T12:12:20.9794247Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-23T12:12:20.9794514Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-23T12:12:20.9794774Z caddeapllx955.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-23T12:12:20.9794927Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-23T12:12:20.9795091Z releases. A future Ansible release will default to using the discovered 
2026-10-23T12:12:20.9795370Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-23T12:12:20.9795542Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-23T12:12:20.9795713Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-23T12:12:20.9795863Z setting deprecation_warnings=False in ansible.cfg.
2026-10-23T12:12:20.9797604Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-23T12:12:20.9822013Z 
2026-10-23T12:12:20.9822654Z PLAY [jboss] *******************************************************************
2026-10-23T12:12:20.9865794Z 
2026-10-23T12:12:20.9866115Z PLAY [jboss] *******************************************************************
2026-10-23T12:12:20.9906822Z 
2026-10-23T12:12:20.9907983Z PLAY [jboss] *******************************************************************
2026-10-23T12:12:20.9932596Z 
2026-10-23T12:12:20.9932739Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-23T12:12:20.9958793Z 
2026-10-23T12:12:20.9958977Z PLAY [Copiando modules adicionais] *********************************************
2026-10-23T12:12:20.9988074Z 
2026-10-23T12:12:20.9988232Z PLAY [jboss] *******************************************************************
2026-10-23T12:12:21.0024460Z 
2026-10-23T12:12:21.0025006Z PLAY [jboss] *******************************************************************
2026-10-23T12:12:21.0057900Z 
2026-10-23T12:12:21.0058219Z PLAY [jboss] *******************************************************************
2026-10-23T12:12:21.0112620Z Friday 23 October 2026  09:12:21 -0300 (0:00:00.555)       0:00:00.893 ******** 
2026-10-23T12:12:21.3866167Z 
2026-10-23T12:12:21.3866951Z TASK [Wait for Jboss Management port] ******************************************
2026-10-23T12:12:21.3867116Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-23T12:12:21.3901930Z Friday 23 October 2026  09:12:21 -0300 (0:00:00.378)       0:00:01.272 ******** 
2026-10-23T12:12:22.0377624Z 
2026-10-23T12:12:22.0378372Z TASK [Check if Jboss is Running] ***********************************************
2026-10-23T12:12:22.0378572Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-23T12:12:22.0411596Z Friday 23 October 2026  09:12:22 -0300 (0:00:00.650)       0:00:01.923 ******** 
2026-10-23T12:12:22.4926776Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-23T12:12:27.8833103Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-23T12:12:33.2655439Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-23T12:12:38.6424876Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-23T12:12:44.0123253Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-23T12:12:49.3819926Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-23T12:12:54.7693965Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-23T12:13:00.1437302Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-23T12:13:05.5083451Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-23T12:13:10.8894463Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-23T12:13:16.2615189Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-23T12:13:21.6282136Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-23T12:13:26.9990472Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-23T12:13:32.3651278Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-23T12:13:37.7319000Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-23T12:13:43.1050539Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-23T12:13:48.4809023Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-23T12:13:53.8506383Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-23T12:13:59.2457837Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-23T12:14:04.6097380Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-23T12:14:09.9775721Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-23T12:14:15.3547677Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-23T12:14:20.7210949Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-23T12:14:26.0906871Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-23T12:14:31.4683548Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-23T12:14:36.8371785Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-23T12:14:42.2007731Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-23T12:14:47.5790854Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-23T12:14:52.9494094Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-23T12:14:58.3243105Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-23T12:15:03.7062798Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-23T12:15:09.0838578Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-23T12:15:14.4572662Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-23T12:15:19.8353848Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-23T12:15:25.2062656Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-23T12:15:30.5735330Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-23T12:15:35.9564513Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-23T12:15:41.3299618Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-23T12:15:46.6987884Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-23T12:15:52.0781410Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-23T12:15:57.4487795Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-23T12:16:02.8143991Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-23T12:16:08.1946383Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-23T12:16:13.5627595Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-23T12:16:18.9271050Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-23T12:16:24.3121505Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-23T12:16:29.6799657Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-23T12:16:35.0445602Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-23T12:16:40.4377682Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-23T12:16:45.8055787Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-23T12:16:51.1746127Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-23T12:16:56.5499636Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-23T12:17:01.9117430Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-23T12:17:07.2812436Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-23T12:17:12.6573516Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-23T12:17:18.1430205Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-23T12:17:23.5120428Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-23T12:17:28.8865083Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-23T12:17:34.2931819Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-23T12:17:39.6571931Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-23T12:17:45.0584894Z 
2026-10-23T12:17:45.0585939Z TASK [Check Deployment details looking for status OK] **************************
2026-10-23T12:17:45.0591487Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"sigsj_intranet-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"nUqDUIz6aM+X2DUs+NFf5HdZwlw=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792757533599, \"enabled-timestamp\" : \"2026-10-23 09:12:13,599 BRT\", \"managed\" : true, \"name\" : \"sigsj_intranet-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"sigsj_intranet-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"sigsj_intranet.war\" : null, \"sigsjintrastatic.war\" : null}, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "629", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Fri, 23 Oct 2026 12:17:44 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"sigsj_intranet-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "nUqDUIz6aM+X2DUs+NFf5HdZwlw="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792757533599, "enabled-timestamp": "2026-10-23 09:12:13,599 BRT", "managed": true, "name": "sigsj_intranet-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "sigsj_intranet-ear.ear", "status": "FAILED", "subdeployment": {"sigsj_intranet.war": null, "sigsjintrastatic.war": null}, "subsystem": {"logging": null}}}}, "msg": "OK (629 bytes)", "redirected": false, "status": 200, "url": "http://10.116.194.179:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-23T12:17:45.0625815Z Friday 23 October 2026  09:17:45 -0300 (0:05:23.021)       0:05:24.944 ******** 
2026-10-23T12:17:52.8232217Z 
2026-10-23T12:17:52.8233103Z TASK [systemd] *****************************************************************
2026-10-23T12:17:52.8233336Z changed: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-23T12:17:52.8280013Z Friday 23 October 2026  09:17:52 -0300 (0:00:07.765)       0:05:32.709 ******** 
2026-10-23T12:17:53.1420401Z 
2026-10-23T12:17:53.1421303Z TASK [Wait for Jboss Management port] ******************************************
2026-10-23T12:17:53.1421549Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-23T12:17:53.1457310Z Friday 23 October 2026  09:17:53 -0300 (0:00:00.317)       0:05:33.027 ******** 
2026-10-23T12:17:53.7887156Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-10-23T12:17:59.1753186Z 
2026-10-23T12:17:59.1754036Z TASK [Check if Jboss is Running] ***********************************************
2026-10-23T12:17:59.1754367Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-23T12:17:59.1790852Z Friday 23 October 2026  09:17:59 -0300 (0:00:06.033)       0:05:39.061 ******** 
2026-10-23T12:17:59.6086451Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-23T12:18:04.9964933Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-23T12:18:10.3684806Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-23T12:18:15.7438722Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-23T12:18:21.1186488Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-23T12:18:26.4951793Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-23T12:18:31.8689208Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-23T12:18:37.2571670Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-23T12:18:42.6257968Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-23T12:18:47.9931914Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-23T12:18:53.3679834Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-23T12:18:58.7376068Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-23T12:19:04.1102902Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-23T12:19:09.4888828Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-23T12:19:14.8628415Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-23T12:19:20.2289470Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-23T12:19:25.6071464Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-23T12:19:30.9697802Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-23T12:19:36.3411107Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-23T12:19:41.7229018Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-23T12:19:47.0908739Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-23T12:19:52.4553658Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-23T12:19:57.8374421Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-23T12:20:03.2057632Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-23T12:20:08.5770976Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-23T12:20:13.9568708Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-23T12:20:19.3218711Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-23T12:20:24.6960331Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-23T12:20:30.0764535Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-23T12:20:35.4519958Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-23T12:20:40.8271177Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-23T12:20:46.1996230Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-23T12:20:51.5702793Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-23T12:20:56.9380576Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-23T12:21:02.3133668Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-23T12:21:07.6754878Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-23T12:21:13.0456202Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-23T12:21:18.4231718Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-23T12:21:23.7955947Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-23T12:21:29.1613677Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-23T12:21:34.5432898Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-23T12:21:39.9129741Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-23T12:21:45.2832530Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-23T12:21:50.6666544Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-23T12:21:56.0423106Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-23T12:22:01.4050224Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-23T12:22:06.7723355Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-23T12:22:12.1388101Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-23T12:22:17.5052262Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-23T12:22:22.8830779Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-23T12:22:28.2482715Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-23T12:22:33.6240500Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-23T12:22:39.0064892Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-23T12:22:44.3728975Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-23T12:22:49.7394209Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-23T12:22:55.1180533Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-23T12:23:00.4949107Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-23T12:23:05.8650287Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-23T12:23:11.2440728Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-23T12:23:16.6184538Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-23T12:23:21.9996852Z 
2026-10-23T12:23:21.9997948Z TASK [Check Deployment details looking for status OK] **************************
2026-10-23T12:23:22.0004246Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"sigsj_intranet-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"nUqDUIz6aM+X2DUs+NFf5HdZwlw=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792757868909, \"enabled-timestamp\" : \"2026-10-23 09:17:48,909 BRT\", \"managed\" : true, \"name\" : \"sigsj_intranet-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"sigsj_intranet-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"sigsj_intranet.war\" : null, \"sigsjintrastatic.war\" : null}, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "629", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Fri, 23 Oct 2026 12:23:21 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"sigsj_intranet-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "nUqDUIz6aM+X2DUs+NFf5HdZwlw="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792757868909, "enabled-timestamp": "2026-10-23 09:17:48,909 BRT", "managed": true, "name": "sigsj_intranet-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "sigsj_intranet-ear.ear", "status": "FAILED", "subdeployment": {"sigsj_intranet.war": null, "sigsjintrastatic.war": null}, "subsystem": {"logging": null}}}}, "msg": "OK (629 bytes)", "redirected": false, "status": 200, "url": "http://10.116.194.179:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-23T12:23:22.0016686Z 
2026-10-23T12:23:22.0017015Z PLAY RECAP *********************************************************************
2026-10-23T12:23:22.0020177Z caddeapllx955.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-23T12:23:22.0020673Z 
2026-10-23T12:23:22.0021306Z Friday 23 October 2026  09:23:22 -0300 (0:05:22.822)       0:11:01.883 ******** 
2026-10-23T12:23:22.0021530Z =============================================================================== 
2026-10-23T12:23:22.0022139Z Check Deployment details looking for status OK ------------------------ 323.02s
2026-10-23T12:23:22.0023382Z Check Deployment details looking for status OK ------------------------ 322.82s
2026-10-23T12:23:22.0023708Z systemd ----------------------------------------------------------------- 7.77s
2026-10-23T12:23:22.0023962Z Check if Jboss is Running ----------------------------------------------- 6.03s
2026-10-23T12:23:22.0024176Z Check if Jboss is Running ----------------------------------------------- 0.65s
2026-10-23T12:23:22.0026490Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.56s
2026-10-23T12:23:22.0026797Z Wait for Jboss Management port ------------------------------------------ 0.38s
2026-10-23T12:23:22.0027092Z Wait for Jboss Management port ------------------------------------------ 0.32s
2026-10-23T12:23:22.0027307Z Playbook run took 0 days, 0 hours, 11 minutes, 1 seconds
2026-10-23T12:23:22.0757518Z ##[error]Bash exited with code '2'.
2026-10-23T12:23:22.0782968Z ##[section]Finishing: Check Deployments [JBOSS]
