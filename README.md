estou com esse erro aqui:


2026-05-22T13:17:04.4135850Z ##[section]Starting: Check Deployments [JBOSS]
2026-05-22T13:17:04.4139511Z ==============================================================================
2026-05-22T13:17:04.4139592Z Task         : Bash
2026-05-22T13:17:04.4139638Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-05-22T13:17:04.4139720Z Version      : 3.227.0
2026-05-22T13:17:04.4139838Z Author       : Microsoft Corporation
2026-05-22T13:17:04.4139892Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-05-22T13:17:04.4139982Z ==============================================================================
2026-05-22T13:17:04.5408187Z Generating script.
2026-05-22T13:17:04.5416258Z Script contents:
2026-05-22T13:17:04.5416893Z ansible-playbook /opt/ads-agent/_work/r18111/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sicmu-intranet-update -e site=ctc_nprd
2026-05-22T13:17:04.5420177Z ========================== Starting Command Output ===========================
2026-05-22T13:17:04.5427713Z [command]/bin/bash /opt/ads-agent/_work/_temp/549625f8-38c3-46c4-a499-38d600066973.sh
2026-05-22T13:17:06.7375393Z 
2026-05-22T13:17:06.7376132Z PLAY [local] *******************************************************************
2026-05-22T13:17:06.7677412Z 
2026-05-22T13:17:06.7677856Z PLAY [Configurando o DNS] ******************************************************
2026-05-22T13:17:06.9940504Z 
2026-05-22T13:17:06.9941110Z PLAY [local] *******************************************************************
2026-05-22T13:17:06.9982266Z 
2026-05-22T13:17:06.9983428Z PLAY [Verificando serviços] ****************************************************
2026-05-22T13:17:07.0072930Z 
2026-05-22T13:17:07.0073713Z PLAY [Configuração LDAP] *******************************************************
2026-05-22T13:17:07.0106602Z [WARNING]: Found variable using reserved name: when
2026-05-22T13:17:07.0112871Z 
2026-05-22T13:17:07.0113313Z PLAY [jboss] *******************************************************************
2026-05-22T13:17:07.0203178Z 
2026-05-22T13:17:07.0203794Z PLAY [Stack Jboss] *************************************************************
2026-05-22T13:17:07.0459929Z Friday 22 May 2026  10:17:07 -0300 (0:00:00.370)       0:00:00.370 ************ 
2026-05-22T13:17:07.5675857Z 
2026-05-22T13:17:07.5676789Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-05-22T13:17:07.5676968Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-05-22T13:17:07.5696866Z 
2026-05-22T13:17:07.5697028Z PLAY [jboss] *******************************************************************
2026-05-22T13:17:07.5741637Z 
2026-05-22T13:17:07.5741835Z PLAY [jboss] *******************************************************************
2026-05-22T13:17:07.5789102Z 
2026-05-22T13:17:07.5789506Z PLAY [jboss] *******************************************************************
2026-05-22T13:17:07.5815079Z 
2026-05-22T13:17:07.5815288Z PLAY [Copiando deployments adicionais] *****************************************
2026-05-22T13:17:07.5845189Z 
2026-05-22T13:17:07.5845486Z PLAY [Copiando modules adicionais] *********************************************
2026-05-22T13:17:07.5873310Z 
2026-05-22T13:17:07.5874022Z PLAY [jboss] *******************************************************************
2026-05-22T13:17:07.5908536Z 
2026-05-22T13:17:07.5909034Z PLAY [jboss] *******************************************************************
2026-05-22T13:17:07.5934930Z 
2026-05-22T13:17:07.5935475Z PLAY [jboss] *******************************************************************
2026-05-22T13:17:07.5980093Z Friday 22 May 2026  10:17:07 -0300 (0:00:00.552)       0:00:00.922 ************ 
2026-05-22T13:17:08.0246922Z 
2026-05-22T13:17:08.0247641Z TASK [Wait for Jboss Management port] ******************************************
2026-05-22T13:17:08.0247814Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-05-22T13:17:08.0278777Z Friday 22 May 2026  10:17:08 -0300 (0:00:00.429)       0:00:01.352 ************ 
2026-05-22T13:17:08.6641729Z 
2026-05-22T13:17:08.6642411Z TASK [Check if Jboss is Running] ***********************************************
2026-05-22T13:17:08.6642657Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-05-22T13:17:08.6679141Z Friday 22 May 2026  10:17:08 -0300 (0:00:00.640)       0:00:01.992 ************ 
2026-05-22T13:17:09.0949433Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-05-22T13:17:14.4435888Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-05-22T13:17:19.7905998Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-05-22T13:17:25.1262253Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-05-22T13:17:30.4584480Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-05-22T13:17:35.7989598Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-05-22T13:17:41.1417168Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-05-22T13:17:46.4694460Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-05-22T13:17:51.7994852Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-05-22T13:17:57.1223162Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-05-22T13:18:02.4668553Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-05-22T13:18:07.8116850Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-05-22T13:18:13.1570441Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-05-22T13:18:18.4845092Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-05-22T13:18:23.8174275Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-05-22T13:18:29.1524438Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-05-22T13:18:34.4740291Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-05-22T13:18:39.7946892Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-05-22T13:18:45.1251906Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-05-22T13:18:50.4530400Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-05-22T13:18:55.7899991Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-05-22T13:19:01.1284071Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-05-22T13:19:06.4777471Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-05-22T13:19:11.8224596Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-05-22T13:19:17.1523642Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-05-22T13:19:22.5046380Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-05-22T13:19:27.8466816Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-05-22T13:19:33.1663651Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-05-22T13:19:38.4903440Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-05-22T13:19:43.8189651Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-05-22T13:19:49.1456366Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-05-22T13:19:54.4779920Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-05-22T13:19:59.8100581Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-05-22T13:20:05.1575747Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-05-22T13:20:10.4928885Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-05-22T13:20:15.8498050Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-05-22T13:20:21.1836137Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-05-22T13:20:26.5491849Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-05-22T13:20:31.8817185Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-05-22T13:20:37.2355862Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-05-22T13:20:42.5802627Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-05-22T13:20:47.9177676Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-05-22T13:20:53.2619098Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-05-22T13:20:58.5988694Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-05-22T13:21:03.9790366Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-05-22T13:21:09.3044547Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-05-22T13:21:14.6295575Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-05-22T13:21:19.9743332Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-05-22T13:21:25.2997705Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-05-22T13:21:30.6327080Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-05-22T13:21:35.9596492Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-05-22T13:21:41.3209984Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-05-22T13:21:46.6611429Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-05-22T13:21:52.0159071Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-05-22T13:21:57.3563960Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-05-22T13:22:02.7425816Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-05-22T13:22:08.0788449Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-05-22T13:22:13.4066679Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-05-22T13:22:18.7397295Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-05-22T13:22:24.0888593Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-05-22T13:22:29.4196500Z 
2026-05-22T13:22:29.4197506Z TASK [Check Deployment details looking for status OK] **************************
2026-05-22T13:22:29.4217636Z fatal: [caddeapllx2484.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"SICMU-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"r7Ph/bK88LRqN5OUmTbpbkhVe1c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779455820583, \"enabled-timestamp\" : \"2026-05-22 10:17:00,583 BRT\", \"managed\" : true, \"name\" : \"SICMU-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"SICMU-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"SICMU-web.war\" : null, \"SICMU-ejb.jar\" : null}, \"subsystem\" : {\"logging\" : null}}, \"applicationinsights-agent.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"iqsIwVxO/dCj+3G2mrUuZNq78as=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779455820797, \"enabled-timestamp\" : \"2026-05-22 10:17:00,797 BRT\", \"managed\" : true, \"name\" : \"applicationinsights-agent.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"applicationinsights-agent.jar\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"MAMr7yGDXfOSD7TPIBw4G5Rg2iQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779455820642, \"enabled-timestamp\" : \"2026-05-22 10:17:00,642 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779455820640, \"enabled-timestamp\" : \"2026-05-22 10:17:00,640 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2183", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Fri, 22 May 2026 13:22:29 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"SICMU-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "r7Ph/bK88LRqN5OUmTbpbkhVe1c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779455820583, "enabled-timestamp": "2026-05-22 10:17:00,583 BRT", "managed": true, "name": "SICMU-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "SICMU-ear.ear", "status": "FAILED", "subdeployment": {"SICMU-ejb.jar": null, "SICMU-web.war": null}, "subsystem": {"logging": null}}, "applicationinsights-agent.jar": {"content": [{"hash": {"BYTES_VALUE": "iqsIwVxO/dCj+3G2mrUuZNq78as="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779455820797, "enabled-timestamp": "2026-05-22 10:17:00,797 BRT", "managed": true, "name": "applicationinsights-agent.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "applicationinsights-agent.jar", "status": "FAILED", "subdeployment": null, "subsystem": {"logging": null}}, "framework.jar": {"content": [{"hash": {"BYTES_VALUE": "MAMr7yGDXfOSD7TPIBw4G5Rg2iQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779455820642, "enabled-timestamp": "2026-05-22 10:17:00,642 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "FAILED", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779455820640, "enabled-timestamp": "2026-05-22 10:17:00,640 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "FAILED", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2183 bytes)", "redirected": false, "status": 200, "url": "http://10.116.200.228:9990/management/", "x_frame_options": "SAMEORIGIN"}
2026-05-22T13:22:29.4275754Z Friday 22 May 2026  10:22:29 -0300 (0:05:20.759)       0:05:22.752 ************ 
2026-05-22T13:22:37.2612168Z 
2026-05-22T13:22:37.2613748Z TASK [systemd] *****************************************************************
2026-05-22T13:22:37.2614100Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-05-22T13:22:37.2655688Z Friday 22 May 2026  10:22:37 -0300 (0:00:07.837)       0:05:30.590 ************ 
2026-05-22T13:22:37.6883239Z 
2026-05-22T13:22:37.6884432Z TASK [Wait for Jboss Management port] ******************************************
2026-05-22T13:22:37.6884733Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-05-22T13:22:37.6922907Z Friday 22 May 2026  10:22:37 -0300 (0:00:00.426)       0:05:31.016 ************ 
2026-05-22T13:22:38.7073726Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-05-22T13:22:44.0656119Z 
2026-05-22T13:22:44.0657209Z TASK [Check if Jboss is Running] ***********************************************
2026-05-22T13:22:44.0657625Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-05-22T13:22:44.0694707Z Friday 22 May 2026  10:22:44 -0300 (0:00:06.377)       0:05:37.393 ************ 
2026-05-22T13:22:44.5119867Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-05-22T13:22:49.8402027Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-05-22T13:22:55.1809459Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-05-22T13:23:00.5306818Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-05-22T13:23:05.8754038Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-05-22T13:23:11.2157619Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-05-22T13:23:16.5434823Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-05-22T13:23:21.8885714Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-05-22T13:23:27.2447733Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-05-22T13:23:32.5666831Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-05-22T13:23:37.8954666Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-05-22T13:23:43.2543879Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-05-22T13:23:48.5876641Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-05-22T13:23:53.9327545Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-05-22T13:23:59.2647956Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-05-22T13:24:04.6313663Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-05-22T13:24:09.9896447Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-05-22T13:24:15.3474592Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-05-22T13:24:20.6773194Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-05-22T13:24:26.0154631Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-05-22T13:24:31.3519148Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-05-22T13:24:36.6790976Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-05-22T13:24:41.9980993Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-05-22T13:24:47.3267307Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-05-22T13:24:52.6541577Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-05-22T13:24:57.9843086Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-05-22T13:25:03.3293656Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-05-22T13:25:08.6588531Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-05-22T13:25:13.9902890Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-05-22T13:25:19.3416343Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-05-22T13:25:24.6676257Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-05-22T13:25:30.0054684Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-05-22T13:25:35.3179124Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-05-22T13:25:40.6487108Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-05-22T13:25:45.9851845Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-05-22T13:25:51.3218230Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-05-22T13:25:56.6643133Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-05-22T13:26:02.0160713Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-05-22T13:26:07.3472355Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-05-22T13:26:12.6912112Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-05-22T13:26:18.0256202Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-05-22T13:26:23.3444634Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-05-22T13:26:28.6904447Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-05-22T13:26:34.0200215Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-05-22T13:26:39.3446026Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-05-22T13:26:44.6701737Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-05-22T13:26:50.2165786Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-05-22T13:26:55.5415250Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-05-22T13:27:00.8877476Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-05-22T13:27:06.2101746Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-05-22T13:27:11.5467487Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-05-22T13:27:16.8725132Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-05-22T13:27:22.2276920Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-05-22T13:27:27.5568110Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-05-22T13:27:32.8768142Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-05-22T13:27:38.2207826Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-05-22T13:27:43.5586182Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-05-22T13:27:48.8785527Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-05-22T13:27:54.2165677Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-05-22T13:27:59.5490565Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-05-22T13:28:04.8895529Z 
2026-05-22T13:28:04.8896786Z TASK [Check Deployment details looking for status OK] **************************
2026-05-22T13:28:04.8911134Z fatal: [caddeapllx2484.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"SICMU-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"r7Ph/bK88LRqN5OUmTbpbkhVe1c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779456153605, \"enabled-timestamp\" : \"2026-05-22 10:22:33,605 BRT\", \"managed\" : true, \"name\" : \"SICMU-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"SICMU-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"SICMU-web.war\" : null, \"SICMU-ejb.jar\" : null}, \"subsystem\" : {\"logging\" : null}}, \"applicationinsights-agent.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"iqsIwVxO/dCj+3G2mrUuZNq78as=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779456153821, \"enabled-timestamp\" : \"2026-05-22 10:22:33,821 BRT\", \"managed\" : true, \"name\" : \"applicationinsights-agent.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"applicationinsights-agent.jar\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"MAMr7yGDXfOSD7TPIBw4G5Rg2iQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779456153665, \"enabled-timestamp\" : \"2026-05-22 10:22:33,665 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1779456153661, \"enabled-timestamp\" : \"2026-05-22 10:22:33,661 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2183", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Fri, 22 May 2026 13:28:04 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"SICMU-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "r7Ph/bK88LRqN5OUmTbpbkhVe1c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779456153605, "enabled-timestamp": "2026-05-22 10:22:33,605 BRT", "managed": true, "name": "SICMU-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "SICMU-ear.ear", "status": "FAILED", "subdeployment": {"SICMU-ejb.jar": null, "SICMU-web.war": null}, "subsystem": {"logging": null}}, "applicationinsights-agent.jar": {"content": [{"hash": {"BYTES_VALUE": "iqsIwVxO/dCj+3G2mrUuZNq78as="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779456153821, "enabled-timestamp": "2026-05-22 10:22:33,821 BRT", "managed": true, "name": "applicationinsights-agent.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "applicationinsights-agent.jar", "status": "FAILED", "subdeployment": null, "subsystem": {"logging": null}}, "framework.jar": {"content": [{"hash": {"BYTES_VALUE": "MAMr7yGDXfOSD7TPIBw4G5Rg2iQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779456153665, "enabled-timestamp": "2026-05-22 10:22:33,665 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "FAILED", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1779456153661, "enabled-timestamp": "2026-05-22 10:22:33,661 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "FAILED", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2183 bytes)", "redirected": false, "status": 200, "url": "http://10.116.200.228:9990/management/", "x_frame_options": "SAMEORIGIN"}
2026-05-22T13:28:04.8931547Z 
2026-05-22T13:28:04.8933212Z PLAY RECAP *********************************************************************
2026-05-22T13:28:04.8933617Z caddeapllx2484.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-05-22T13:28:04.8933784Z 
2026-05-22T13:28:04.8935303Z Friday 22 May 2026  10:28:04 -0300 (0:05:20.823)       0:10:58.217 ************ 
2026-05-22T13:28:04.8935548Z =============================================================================== 
2026-05-22T13:28:04.8935789Z Check Deployment details looking for status OK ------------------------ 320.82s
2026-05-22T13:28:04.8936046Z Check Deployment details looking for status OK ------------------------ 320.76s
2026-05-22T13:28:04.8936334Z systemd ----------------------------------------------------------------- 7.84s
2026-05-22T13:28:04.8936816Z Check if Jboss is Running ----------------------------------------------- 6.38s
2026-05-22T13:28:04.8943818Z Check if Jboss is Running ----------------------------------------------- 0.64s
2026-05-22T13:28:04.8944408Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.55s
2026-05-22T13:28:04.8944723Z Wait for Jboss Management port ------------------------------------------ 0.43s
2026-05-22T13:28:04.8944948Z Wait for Jboss Management port ------------------------------------------ 0.43s
2026-05-22T13:28:04.8945109Z Playbook run took 0 days, 0 hours, 10 minutes, 58 seconds
2026-05-22T13:28:04.9668616Z ##[error]Bash exited with code '2'.
2026-05-22T13:28:04.9694888Z ##[section]Finishing: Check Deployments [JBOSS]




p585600@10.116.200.228's password:
Creating home directory for p585600.
-sh-4.2$


ja estou logadno na maquina me ajuda a verificar porque o jboss nao ta suvindo e a palicação nao fica online:




