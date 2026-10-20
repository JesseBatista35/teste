2026-10-20T13:04:05.5263016Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-20T13:04:05.5267429Z ==============================================================================
2026-10-20T13:04:05.5267584Z Task         : Bash
2026-10-20T13:04:05.5267652Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-20T13:04:05.5267760Z Version      : 3.227.0
2026-10-20T13:04:05.5267826Z Author       : Microsoft Corporation
2026-10-20T13:04:05.5267907Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-20T13:04:05.5268017Z ==============================================================================
2026-10-20T13:04:05.6557428Z Generating script.
2026-10-20T13:04:05.6566682Z Script contents:
2026-10-20T13:04:05.6567216Z ansible-playbook /opt/ads-agent/_work/r19318/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-boleto -e site=ctc_nprd
2026-10-20T13:04:05.6569943Z ========================== Starting Command Output ===========================
2026-10-20T13:04:05.6577205Z [command]/bin/bash /opt/ads-agent/_work/_temp/296892af-bb24-4eb5-b867-58f72b003b7a.sh
2026-10-20T13:04:07.9526725Z 
2026-10-20T13:04:07.9527573Z PLAY [local] *******************************************************************
2026-10-20T13:04:07.9833847Z 
2026-10-20T13:04:07.9834477Z PLAY [Configurando o DNS] ******************************************************
2026-10-20T13:04:08.2144770Z 
2026-10-20T13:04:08.2145913Z PLAY [local] *******************************************************************
2026-10-20T13:04:08.2181619Z 
2026-10-20T13:04:08.2182352Z PLAY [Verificando serviços] ****************************************************
2026-10-20T13:04:08.2274479Z 
2026-10-20T13:04:08.2275085Z PLAY [Configuração LDAP] *******************************************************
2026-10-20T13:04:08.2308912Z [WARNING]: Found variable using reserved name: when
2026-10-20T13:04:08.2314217Z 
2026-10-20T13:04:08.2314358Z PLAY [jboss] *******************************************************************
2026-10-20T13:04:08.2407789Z 
2026-10-20T13:04:08.2408403Z PLAY [Stack Jboss] *************************************************************
2026-10-20T13:04:08.2661790Z Tuesday 20 October 2026  10:04:08 -0300 (0:00:00.377)       0:00:00.377 ******* 
2026-10-20T13:04:08.7703579Z 
2026-10-20T13:04:08.7705487Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-20T13:04:08.7708415Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-20T13:04:08.7708718Z caddeapllx2557.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-20T13:04:08.7708949Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-20T13:04:08.7709152Z releases. A future Ansible release will default to using the discovered 
2026-10-20T13:04:08.7709371Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-20T13:04:08.7709584Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-20T13:04:08.7713043Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-20T13:04:08.7713309Z setting deprecation_warnings=False in ansible.cfg.
2026-10-20T13:04:08.7713466Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T13:04:08.7741760Z 
2026-10-20T13:04:08.7742266Z PLAY [jboss] *******************************************************************
2026-10-20T13:04:08.7789013Z 
2026-10-20T13:04:08.7789558Z PLAY [jboss] *******************************************************************
2026-10-20T13:04:08.7830864Z 
2026-10-20T13:04:08.7831150Z PLAY [jboss] *******************************************************************
2026-10-20T13:04:08.7857678Z 
2026-10-20T13:04:08.7858034Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-20T13:04:08.7892750Z 
2026-10-20T13:04:08.7893283Z PLAY [Copiando modules adicionais] *********************************************
2026-10-20T13:04:08.7928240Z 
2026-10-20T13:04:08.7928930Z PLAY [jboss] *******************************************************************
2026-10-20T13:04:08.7967098Z 
2026-10-20T13:04:08.7967620Z PLAY [jboss] *******************************************************************
2026-10-20T13:04:08.7996720Z 
2026-10-20T13:04:08.7997000Z PLAY [jboss] *******************************************************************
2026-10-20T13:04:08.8041302Z Tuesday 20 October 2026  10:04:08 -0300 (0:00:00.538)       0:00:00.915 ******* 
2026-10-20T13:04:09.1780048Z 
2026-10-20T13:04:09.1780718Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T13:04:09.1780920Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T13:04:09.1814771Z Tuesday 20 October 2026  10:04:09 -0300 (0:00:00.377)       0:00:01.293 ******* 
2026-10-20T13:04:09.8567547Z 
2026-10-20T13:04:09.8568391Z TASK [Check if Jboss is Running] ***********************************************
2026-10-20T13:04:09.8569309Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T13:04:09.8609732Z Tuesday 20 October 2026  10:04:09 -0300 (0:00:00.679)       0:00:01.972 ******* 
2026-10-20T13:04:10.2980872Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-20T13:04:15.6711509Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-20T13:04:21.0400231Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-20T13:04:26.4114156Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-20T13:04:31.7923710Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-20T13:04:37.1588792Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-20T13:04:42.5238221Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-20T13:04:47.8997421Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-20T13:04:53.2692644Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-20T13:04:58.6366953Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-20T13:05:04.0192139Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-20T13:05:09.3872759Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-20T13:05:14.7595587Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-20T13:05:20.1467581Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-20T13:05:25.5159605Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-20T13:05:30.8821508Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-20T13:05:36.2558977Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-20T13:05:41.6255957Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-20T13:05:47.0083775Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-20T13:05:52.3971754Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-20T13:05:57.7702634Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-20T13:06:03.1459930Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-20T13:06:08.5298964Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-20T13:06:13.8951148Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-20T13:06:19.2617084Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-20T13:06:24.6422203Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-20T13:06:30.0181032Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-20T13:06:35.3882211Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-20T13:06:40.7624684Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-20T13:06:46.1354243Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-20T13:06:51.5108682Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-20T13:06:56.8881579Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-20T13:07:02.2596079Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-20T13:07:07.6225665Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-20T13:07:12.9922680Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-20T13:07:18.3544935Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-20T13:07:23.7226658Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-20T13:07:29.0980735Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-20T13:07:34.4616050Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-20T13:07:39.8297935Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-20T13:07:45.2137683Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-20T13:07:50.5809037Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-20T13:07:55.9461050Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-20T13:08:01.3201811Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-20T13:08:06.6834672Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-20T13:08:12.0496649Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-20T13:08:17.4256688Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-20T13:08:22.7920228Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-20T13:08:28.1539246Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-20T13:08:33.5324377Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-20T13:08:38.8929208Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-20T13:08:44.2535069Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-20T13:08:49.6395306Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-20T13:08:55.0012680Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-20T13:09:00.3635851Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-20T13:09:05.7651824Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-20T13:09:11.1271630Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-20T13:09:16.4884465Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-20T13:09:21.8793200Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-20T13:09:27.2443302Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-20T13:09:32.6116478Z 
2026-10-20T13:09:32.6116999Z TASK [Check Deployment details looking for status OK] **************************
2026-10-20T13:09:32.6123473Z fatal: [caddeapllx2557.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"boletoService-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"X38w/tfh1zWKGxN4weA3puw/djQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792501433728, \"enabled-timestamp\" : \"2026-10-20 10:03:53,728 BRT\", \"managed\" : true, \"name\" : \"boletoService-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"boletoService-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"boletoService-war-2.0.2.8.war\" : null}, \"subsystem\" : null}}}", "content_encoding": "identity", "content_length": "592", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Tue, 20 Oct 2026 13:09:32 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"boletoService-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "X38w/tfh1zWKGxN4weA3puw/djQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792501433728, "enabled-timestamp": "2026-10-20 10:03:53,728 BRT", "managed": true, "name": "boletoService-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "boletoService-ear.ear", "status": "FAILED", "subdeployment": {"boletoService-war-2.0.2.8.war": null}, "subsystem": null}}}, "msg": "OK (592 bytes)", "redirected": false, "status": 200, "url": "http://10.116.201.25:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-20T13:09:32.6156225Z Tuesday 20 October 2026  10:09:32 -0300 (0:05:22.754)       0:05:24.727 ******* 
2026-10-20T13:09:45.4456555Z 
2026-10-20T13:09:45.4457163Z TASK [systemd] *****************************************************************
2026-10-20T13:09:45.4461091Z changed: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T13:09:45.4502432Z Tuesday 20 October 2026  10:09:45 -0300 (0:00:12.834)       0:05:37.561 ******* 
2026-10-20T13:09:45.7980751Z 
2026-10-20T13:09:45.7981449Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T13:09:45.7982153Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T13:09:45.8017472Z Tuesday 20 October 2026  10:09:45 -0300 (0:00:00.351)       0:05:37.913 ******* 
2026-10-20T13:09:46.4832617Z 
2026-10-20T13:09:46.4833530Z TASK [Check if Jboss is Running] ***********************************************
2026-10-20T13:09:46.4833770Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T13:09:46.4870752Z Tuesday 20 October 2026  10:09:46 -0300 (0:00:00.685)       0:05:38.598 ******* 
2026-10-20T13:09:46.9729816Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-20T13:09:52.3913729Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-20T13:09:57.7569466Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-20T13:10:03.1333082Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-20T13:10:08.5031720Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-20T13:10:13.8697890Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-20T13:10:19.2607538Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-20T13:10:24.6354383Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-20T13:10:30.0006069Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-20T13:10:35.3812154Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-20T13:10:40.7527762Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-20T13:10:46.1289341Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-20T13:10:51.5008170Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-20T13:10:56.8670925Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-20T13:11:02.2382003Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-20T13:11:07.6347015Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-20T13:11:13.0067718Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-20T13:11:18.3732283Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-20T13:11:23.7535919Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-20T13:11:29.1269341Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-20T13:11:34.4912484Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-20T13:11:39.8725178Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-20T13:11:45.2463157Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-20T13:11:50.6162420Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-20T13:11:55.9912397Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-20T13:12:01.3622098Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-20T13:12:06.7263337Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-20T13:12:12.1049197Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-20T13:12:17.4730603Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-20T13:12:22.8360961Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-20T13:12:28.2133873Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-20T13:12:33.5820944Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-20T13:12:38.9469474Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-20T13:12:44.3223544Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-20T13:12:49.6875140Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-20T13:12:55.0526166Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-20T13:13:00.4310410Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-20T13:13:05.7968700Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-20T13:13:11.1665551Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-20T13:13:16.5504612Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-20T13:13:21.9198919Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-20T13:13:27.2869918Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-20T13:13:32.6647417Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-20T13:13:38.0312351Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-20T13:13:43.3969251Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-20T13:13:48.7702244Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-20T13:13:54.1344792Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-20T13:13:59.4989129Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-20T13:14:04.8926685Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-20T13:14:10.2609669Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-20T13:14:15.6244434Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-20T13:14:20.9974879Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-20T13:14:26.3649443Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-20T13:14:31.7319383Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-20T13:14:37.1176634Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-20T13:14:42.4849573Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-20T13:14:47.8508722Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-20T13:14:53.2288591Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-20T13:14:58.5940967Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-20T13:15:03.9583913Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-20T13:15:09.3321620Z 
2026-10-20T13:15:09.3322407Z TASK [Check Deployment details looking for status OK] **************************
2026-10-20T13:15:09.3327785Z fatal: [caddeapllx2557.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"boletoService-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"X38w/tfh1zWKGxN4weA3puw/djQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792501783023, \"enabled-timestamp\" : \"2026-10-20 10:09:43,023 BRT\", \"managed\" : true, \"name\" : \"boletoService-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"boletoService-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"boletoService-war-2.0.2.8.war\" : null}, \"subsystem\" : null}}}", "content_encoding": "identity", "content_length": "592", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Tue, 20 Oct 2026 13:15:09 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"boletoService-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "X38w/tfh1zWKGxN4weA3puw/djQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792501783023, "enabled-timestamp": "2026-10-20 10:09:43,023 BRT", "managed": true, "name": "boletoService-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "boletoService-ear.ear", "status": "FAILED", "subdeployment": {"boletoService-war-2.0.2.8.war": null}, "subsystem": null}}}, "msg": "OK (592 bytes)", "redirected": false, "status": 200, "url": "http://10.116.201.25:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-20T13:15:09.3340996Z 
2026-10-20T13:15:09.3341243Z PLAY RECAP *********************************************************************
2026-10-20T13:15:09.3343414Z caddeapllx2557.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-20T13:15:09.3344350Z 
2026-10-20T13:15:09.3344901Z Tuesday 20 October 2026  10:15:09 -0300 (0:05:22.847)       0:11:01.446 ******* 
2026-10-20T13:15:09.3345091Z =============================================================================== 
2026-10-20T13:15:09.3345940Z Check Deployment details looking for status OK ------------------------ 322.85s
2026-10-20T13:15:09.3346739Z Check Deployment details looking for status OK ------------------------ 322.75s
2026-10-20T13:15:09.3347024Z systemd ---------------------------------------------------------------- 12.83s
2026-10-20T13:15:09.3347610Z Check if Jboss is Running ----------------------------------------------- 0.69s
2026-10-20T13:15:09.3347832Z Check if Jboss is Running ----------------------------------------------- 0.68s
2026-10-20T13:15:09.3349590Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.54s
2026-10-20T13:15:09.3349868Z Wait for Jboss Management port ------------------------------------------ 0.38s
2026-10-20T13:15:09.3350089Z Wait for Jboss Management port ------------------------------------------ 0.35s
2026-10-20T13:15:09.3350240Z Playbook run took 0 days, 0 hours, 11 minutes, 1 seconds
2026-10-20T13:15:09.4026351Z ##[error]Bash exited with code '2'.
2026-10-20T13:15:09.4052476Z ##[section]Finishing: Check Deployments [JBOSS]
