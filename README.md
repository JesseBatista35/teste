
Como parte de uma solução para corrigir um erro na pilha criptográfica da esteira, recentemente fizemos um upgrade do java 8 para o java 11. 

Testando essa solução, a release, na fase de check deployments dá erro. 

Favor verificar o que pode estar acontecendo.

Esteira Devops: 
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=497931&environmentId=2314534


2026-07-08T17:39:42.0820010Z ##[section]Starting: Check Deployments [JBOSS]
2026-07-08T17:39:42.0822680Z ==============================================================================
2026-07-08T17:39:42.0822767Z Task         : Bash
2026-07-08T17:39:42.0822809Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-08T17:39:42.0822876Z Version      : 3.227.0
2026-07-08T17:39:42.0822917Z Author       : Microsoft Corporation
2026-07-08T17:39:42.0822971Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-08T17:39:42.0823038Z ==============================================================================
2026-07-08T17:39:42.9710119Z Generating script.
2026-07-08T17:39:42.9718104Z Script contents:
2026-07-08T17:39:42.9718655Z ansible-playbook /opt/ads-agent/_work/r1906/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=siamc-dev-internet -e site=ctc_nprd
2026-07-08T17:39:42.9721053Z ========================== Starting Command Output ===========================
2026-07-08T17:39:42.9727992Z [command]/bin/bash /opt/ads-agent/_work/_temp/222c80ba-ad88-4d00-8d15-5a1b5406ef44.sh
2026-07-08T17:39:44.9398609Z 
2026-07-08T17:39:44.9399408Z PLAY [local] *******************************************************************
2026-07-08T17:39:44.9658692Z 
2026-07-08T17:39:44.9659102Z PLAY [Configurando o DNS] ******************************************************
2026-07-08T17:39:45.1435661Z 
2026-07-08T17:39:45.1436208Z PLAY [local] *******************************************************************
2026-07-08T17:39:45.1466612Z 
2026-07-08T17:39:45.1467312Z PLAY [Verificando serviços] ****************************************************
2026-07-08T17:39:45.1548926Z 
2026-07-08T17:39:45.1550395Z PLAY [Configuração LDAP] *******************************************************
2026-07-08T17:39:45.1581951Z [WARNING]: Found variable using reserved name: when
2026-07-08T17:39:45.1587114Z 
2026-07-08T17:39:45.1588337Z PLAY [jboss] *******************************************************************
2026-07-08T17:39:45.1670339Z 
2026-07-08T17:39:45.1671655Z PLAY [Stack Jboss] *************************************************************
2026-07-08T17:39:45.1903485Z Wednesday 08 July 2026  14:39:45 -0300 (0:00:00.309)       0:00:00.310 ******** 
2026-07-08T17:39:45.6634682Z 
2026-07-08T17:39:45.6635978Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-07-08T17:39:45.6636466Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-08T17:39:45.6656112Z 
2026-07-08T17:39:45.6656305Z PLAY [jboss] *******************************************************************
2026-07-08T17:39:45.6698146Z 
2026-07-08T17:39:45.6699452Z PLAY [jboss] *******************************************************************
2026-07-08T17:39:45.6736313Z 
2026-07-08T17:39:45.6737496Z PLAY [jboss] *******************************************************************
2026-07-08T17:39:45.6761830Z 
2026-07-08T17:39:45.6762400Z PLAY [Copiando deployments adicionais] *****************************************
2026-07-08T17:39:45.6786787Z 
2026-07-08T17:39:45.6787089Z PLAY [Copiando modules adicionais] *********************************************
2026-07-08T17:39:45.6813288Z 
2026-07-08T17:39:45.6814443Z PLAY [jboss] *******************************************************************
2026-07-08T17:39:45.6845054Z 
2026-07-08T17:39:45.6846203Z PLAY [jboss] *******************************************************************
2026-07-08T17:39:45.6871685Z 
2026-07-08T17:39:45.6872835Z PLAY [jboss] *******************************************************************
2026-07-08T17:39:45.6909893Z Wednesday 08 July 2026  14:39:45 -0300 (0:00:00.500)       0:00:00.810 ******** 
2026-07-08T17:39:46.0557753Z 
2026-07-08T17:39:46.0558275Z TASK [Wait for Jboss Management port] ******************************************
2026-07-08T17:39:46.0558431Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-08T17:39:46.0585927Z Wednesday 08 July 2026  14:39:46 -0300 (0:00:00.367)       0:00:01.178 ******** 
2026-07-08T17:39:46.5667229Z 
2026-07-08T17:39:46.5667725Z TASK [Check if Jboss is Running] ***********************************************
2026-07-08T17:39:46.5667882Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-08T17:39:46.5688870Z Wednesday 08 July 2026  14:39:46 -0300 (0:00:00.510)       0:00:01.688 ******** 
2026-07-08T17:39:46.9384959Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-07-08T17:39:52.2656315Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-07-08T17:39:57.5767624Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-07-08T17:40:02.9171764Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-07-08T17:40:08.2444998Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-07-08T17:40:13.5585480Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-07-08T17:40:18.8741614Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-07-08T17:40:24.1884586Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-07-08T17:40:29.5039506Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-07-08T17:40:34.8166338Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-07-08T17:40:40.1295585Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-07-08T17:40:45.4507063Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-07-08T17:40:50.7694346Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-07-08T17:40:56.1008320Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-07-08T17:41:01.4144400Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-07-08T17:41:06.7287341Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-07-08T17:41:12.0575621Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-07-08T17:41:17.3754007Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-07-08T17:41:22.6873251Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-07-08T17:41:28.0028769Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-07-08T17:41:33.3319631Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-07-08T17:41:38.6408497Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-07-08T17:41:43.9607604Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-07-08T17:41:49.2918840Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-07-08T17:41:54.6106195Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-07-08T17:41:59.9212413Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-07-08T17:42:05.2487046Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-07-08T17:42:10.5626100Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-07-08T17:42:15.8659536Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-07-08T17:42:21.1803759Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-07-08T17:42:26.4922521Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-07-08T17:42:31.8093468Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-07-08T17:42:37.1206232Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-07-08T17:42:42.4431666Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-07-08T17:42:47.7521300Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-07-08T17:42:53.0675067Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-07-08T17:42:58.3756317Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-07-08T17:43:03.6967434Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-07-08T17:43:09.0093156Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-07-08T17:43:14.3161522Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-07-08T17:43:19.6246045Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-07-08T17:43:24.9368277Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-07-08T17:43:30.2586696Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-07-08T17:43:35.5732055Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-07-08T17:43:40.8836827Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-07-08T17:43:46.2117416Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-07-08T17:43:51.5288166Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-07-08T17:43:56.8402695Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-07-08T17:44:02.1825187Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-07-08T17:44:07.5086561Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-07-08T17:44:12.8339112Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-07-08T17:44:18.1482624Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-07-08T17:44:23.4634143Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-07-08T17:44:28.7737267Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-07-08T17:44:34.0918076Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-07-08T17:44:39.4093447Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-07-08T17:44:44.7189895Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-07-08T17:44:50.0377777Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-07-08T17:44:55.3499517Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-07-08T17:45:00.6631433Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-07-08T17:45:05.9889962Z 
2026-07-08T17:45:05.9890640Z TASK [Check Deployment details looking for status OK] **************************
2026-07-08T17:45:05.9895990Z fatal: [caddeapllx2620.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"siamc-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"mauqAt2HKNk1y3lS3iKjIolv4AI=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1783531586188, \"enabled-timestamp\" : \"2026-07-08 14:26:26,188 BRT\", \"managed\" : true, \"name\" : \"siamc-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"siamc-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"siamc-web-3.0.0-SNAPSHOT.war\" : null}, \"subsystem\" : null}}}", "content_encoding": "identity", "content_length": "567", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Wed, 08 Jul 2026 17:45:05 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"siamc-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "mauqAt2HKNk1y3lS3iKjIolv4AI="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1783531586188, "enabled-timestamp": "2026-07-08 14:26:26,188 BRT", "managed": true, "name": "siamc-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "siamc-ear.ear", "status": "FAILED", "subdeployment": {"siamc-web-3.0.0-SNAPSHOT.war": null}, "subsystem": null}}}, "msg": "OK (567 bytes)", "redirected": false, "status": 200, "url": "http://10.116.201.81:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-07-08T17:45:05.9923497Z Wednesday 08 July 2026  14:45:05 -0300 (0:05:19.423)       0:05:21.112 ******** 
2026-07-08T17:45:13.7572794Z 
2026-07-08T17:45:13.7573478Z TASK [systemd] *****************************************************************
2026-07-08T17:45:13.7575978Z changed: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-08T17:45:13.7603103Z Wednesday 08 July 2026  14:45:13 -0300 (0:00:07.767)       0:05:28.880 ******** 
2026-07-08T17:45:14.1757699Z 
2026-07-08T17:45:14.1758289Z TASK [Wait for Jboss Management port] ******************************************
2026-07-08T17:45:14.1758792Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-08T17:45:14.1783067Z Wednesday 08 July 2026  14:45:14 -0300 (0:00:00.417)       0:05:29.298 ******** 
2026-07-08T17:45:14.9357325Z 
2026-07-08T17:45:14.9357823Z TASK [Check if Jboss is Running] ***********************************************
2026-07-08T17:45:14.9358011Z ok: [caddeapllx2620.agil.nprd.caixa.gov.br]
2026-07-08T17:45:14.9381514Z Wednesday 08 July 2026  14:45:14 -0300 (0:00:00.759)       0:05:30.057 ******** 
2026-07-08T17:45:15.5239045Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-07-08T17:45:20.8341937Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-07-08T17:45:26.1507637Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-07-08T17:45:31.4684291Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-07-08T17:45:36.7716183Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-07-08T17:45:42.0901568Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-07-08T17:45:47.4061376Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-07-08T17:45:52.7199126Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-07-08T17:45:58.0412297Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-07-08T17:46:03.3968201Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-07-08T17:46:08.7147046Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-07-08T17:46:14.0510690Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-07-08T17:46:19.3650256Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-07-08T17:46:24.6768187Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-07-08T17:46:29.9973419Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-07-08T17:46:35.3098624Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-07-08T17:46:40.6244789Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-07-08T17:46:45.9369675Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-07-08T17:46:51.2593225Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-07-08T17:46:56.5715343Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-07-08T17:47:01.9324328Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-07-08T17:47:07.2613780Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-07-08T17:47:12.5769892Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-07-08T17:47:17.8869443Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-07-08T17:47:23.2250882Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-07-08T17:47:28.5465983Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-07-08T17:47:33.8724465Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-07-08T17:47:39.1931727Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-07-08T17:47:44.5222098Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-07-08T17:47:49.8357973Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-07-08T17:47:55.1411380Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-07-08T17:48:00.4619249Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-07-08T17:48:05.7767941Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-07-08T17:48:11.0858236Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-07-08T17:48:16.3965003Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-07-08T17:48:21.7180527Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-07-08T17:48:27.0324413Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-07-08T17:48:32.3496776Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-07-08T17:48:37.6800601Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-07-08T17:48:42.9937807Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-07-08T17:48:48.3167450Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-07-08T17:48:53.6300685Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-07-08T17:48:58.9457951Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-07-08T17:49:04.2683639Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-07-08T17:49:09.5800671Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-07-08T17:49:14.8947030Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-07-08T17:49:20.2246054Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-07-08T17:49:25.5363224Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-07-08T17:49:30.8648524Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-07-08T17:49:36.1877764Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-07-08T17:49:41.5025858Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-07-08T17:49:46.8213734Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-07-08T17:49:52.1399337Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-07-08T17:49:57.4687868Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-07-08T17:50:02.8028241Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-07-08T17:50:08.1188581Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-07-08T17:50:13.4458537Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-07-08T17:50:18.7583491Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-07-08T17:50:24.0709933Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-07-08T17:50:29.3825150Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-07-08T17:50:34.7067136Z 
2026-07-08T17:50:34.7067906Z TASK [Check Deployment details looking for status OK] **************************
2026-07-08T17:50:34.7072715Z fatal: [caddeapllx2620.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"siamc-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"mauqAt2HKNk1y3lS3iKjIolv4AI=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1783532710007, \"enabled-timestamp\" : \"2026-07-08 14:45:10,007 BRT\", \"managed\" : true, \"name\" : \"siamc-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"siamc-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"siamc-web-3.0.0-SNAPSHOT.war\" : null}, \"subsystem\" : null}}}", "content_encoding": "identity", "content_length": "567", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Wed, 08 Jul 2026 17:50:34 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"siamc-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "mauqAt2HKNk1y3lS3iKjIolv4AI="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1783532710007, "enabled-timestamp": "2026-07-08 14:45:10,007 BRT", "managed": true, "name": "siamc-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "siamc-ear.ear", "status": "FAILED", "subdeployment": {"siamc-web-3.0.0-SNAPSHOT.war": null}, "subsystem": null}}}, "msg": "OK (567 bytes)", "redirected": false, "status": 200, "url": "http://10.116.201.81:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-07-08T17:50:34.7084755Z 
2026-07-08T17:50:34.7085223Z PLAY RECAP *********************************************************************
2026-07-08T17:50:34.7087163Z caddeapllx2620.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-07-08T17:50:34.7087546Z 
2026-07-08T17:50:34.7088095Z Wednesday 08 July 2026  14:50:34 -0300 (0:05:19.770)       0:10:49.828 ******** 
2026-07-08T17:50:34.7088270Z =============================================================================== 
2026-07-08T17:50:34.7088483Z Check Deployment details looking for status OK ------------------------ 319.77s
2026-07-08T17:50:34.7088707Z Check Deployment details looking for status OK ------------------------ 319.42s
2026-07-08T17:50:34.7088934Z systemd ----------------------------------------------------------------- 7.77s
2026-07-08T17:50:34.7089147Z Check if Jboss is Running ----------------------------------------------- 0.76s
2026-07-08T17:50:34.7089353Z Check if Jboss is Running ----------------------------------------------- 0.51s
2026-07-08T17:50:34.7089572Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.50s
2026-07-08T17:50:34.7089785Z Wait for Jboss Management port ------------------------------------------ 0.42s
2026-07-08T17:50:34.7089997Z Wait for Jboss Management port ------------------------------------------ 0.37s
2026-07-08T17:50:34.7090138Z Playbook run took 0 days, 0 hours, 10 minutes, 49 seconds
2026-07-08T17:50:34.7668017Z ##[error]Bash exited with code '2'.
2026-07-08T17:50:34.7684267Z ##[section]Finishing: Check Deployments [JBOSS]



-bash-3.2$ ssh 10.116.201.81
The authenticity of host '10.116.201.81 (10.116.201.81)' can't be established.
RSA key fingerprint is 88:64:f6:e4:5d:d9:fa:82:13:f7:15:23:f8:08:b8:20.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added '10.116.201.81' (RSA) to the list of known hosts.
p585600@10.116.201.81's password:
Creating home directory for p585600.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ cd /opt/jboss-eap/standalone/logs
-sh: cd: /opt/jboss-eap/standalone/logs: Arquivo ou diretório não encontrado
-sh-4.2$ cd /opt/jboss-eap/standalone/
-sh-4.2$ ls -la
total 4
drwxrwxr-x  8 jboss jboss   91 Set 30  2024 .
drwxrwxr-x 14 jboss jboss  296 Out 31  2025 ..
drwxrwxr-x  3 jboss jboss 4096 Jul  8 14:20 configuration
drwxrwxr-x  7 jboss jboss  100 Jun 12  2023 data
drwxrwxr-x  2 jboss jboss   73 Jul  8 17:08 deployments
drwxrwxr-x  3 jboss jboss   17 Jun 12  2023 lib
drwxrwxr-x  2 jboss jboss  122 Jul  8 14:20 log
drwxrwxr-x  5 jboss jboss  133 Jul  8 17:08 tmp
-sh-4.2$ cd log
-sh-4.2$ ls -la
total 16
drwxrwxr-x 2 jboss jboss   122 Jul  8 14:20 .
drwxrwxr-x 8 jboss jboss    91 Set 30  2024 ..
-rwxrwxr-x 1 jboss jboss     0 Set 30  2024 audit.log
-rwxrwxr-x 1 jboss jboss     0 Set 30  2024 backupgc.log.current
-rwxrwxr-x 1 jboss jboss     0 Set 30  2024 gc.log.0.current
-rw-r--r-- 1 jboss jboss 14387 Jul  8 14:20 server.log
-rwxrwxr-x 1 jboss jboss     0 Set 30  2024 server.log.2024-09-30
-sh-4.2$ less server.log
-sh-4.2$ less server.log
ens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siamc-dev-internet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-07-08 14:20:31,570 INFO  [org.wildfly.security] (ServerService Thread Pool -- 29) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-07-08 14:20:32,028 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 11) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-07-08 14:20:32,276 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-07-08 14:20:32,321 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 18) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-07-08 14:20:32,410 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-07-08 14:20:32,435 INFO  [org.xnio] (MSC service thread 1-3) XNIO version 3.8.16.Final-redhat-00001
2026-07-08 14:20:32,450 INFO  [org.xnio.nio] (MSC service thread 1-3) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-07-08 14:20:32,495 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 50) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-07-08 14:20:32,514 INFO  [org.jboss.remoting] (MSC service thread 1-4) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-07-08 14:20:32,516 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 51) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-07-08 14:20:32,551 INFO  [org.jboss.as.connector] (MSC service thread 1-2) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-07-08 14:20:32,579 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 69) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-07-08 14:20:32,572 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 52) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-07-08 14:20:32,596 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 60) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-07-08 14:20:32,597 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 67) WFLYSEC0002: Ativação do Subsistema de Segurança
2026-07-08 14:20:32,603 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 71) WFLYWS0002: Ativação da Extensão WebServices
2026-07-08 14:20:32,615 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 61) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-07-08 14:20:32,639 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 53) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-07-08 14:20:32,642 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 42) WFLYJCA0005: Implantação do driver não compatível-JDBC class org.postgresql.Driver (versão 42.7)
2026-07-08 14:20:32,686 INFO  [org.jboss.as.security] (MSC service thread 1-2) WFLYSEC0001: Versão =5.0.3.Final-redhat-00009 PicketBox atual
2026-07-08 14:20:32,667 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 58) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-07-08 14:20:32,793 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = postgresql
2026-07-08 14:20:32,834 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-1) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-07-08 14:20:32,912 INFO  [org.jboss.as.naming] (MSC service thread 1-3) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-07-08 14:20:32,967 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-3) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/expresso]
2026-07-08 14:20:33,010 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 70) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-07-08 14:20:33,045 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host.
2026-07-08 14:20:33,045 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho.
2026-07-08 14:20:33,151 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-07-08 14:20:33,190 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-1) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-07-08 14:20:33,224 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0012: Servidor default-server foi iniciado.
2026-07-08 14:20:33,240 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) Queuing requests.
2026-07-08 14:20:33,241 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0018: Iniciando host default-host
2026-07-08 14:20:33,326 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0006: UndertowAJP ouvinte ajp escutando em 0.0.0.0:8009
2026-07-08 14:20:33,330 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0006: UndertowHTTP ouvinte default escutando em 0.0.0.0:8080
2026-07-08 14:20:33,359 INFO  [org.jboss.as.ejb3] (MSC service thread 1-3) WFLYEJB0493: Suspensão completa do subsistema de Jakarta Enterprise Beans
2026-07-08 14:20:33,382 ERROR [stderr] (MSC service thread 1-3) jul 08, 2026 2:20:33 PM java.io.ObjectInputFilter$Config lambda$static$0
2026-07-08 14:20:33,383 ERROR [stderr] (MSC service thread 1-3) INFO: Creating serialization filter from maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
2026-07-08 14:20:33,411 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0001: Fonte de dados vinculada[java:/SiamcDS]
2026-07-08 14:20:33,498 INFO  [org.jboss.as.patching] (MSC service thread 1-2) WFLYPAT0050: A ID de patch cumulativo de JBoss EAP é jboss-eap-7.4.18.CP, os patches únicos incluem: none
2026-07-08 14:20:33,566 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-1) WFLYDM0111: Keystore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado. Ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
(END)


