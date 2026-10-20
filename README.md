Verificar erro quesEsta dando na pipeline do SIBDO de DES, conforme REQ.
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=543372&environmentId=2524971

Durante o deploy da release do SIBDO em DES, o JBoss sobe normalmente (porta 9990 disponível), porém o deploy do sibdo.war permanece com status FAILED.

No server.log foi identificado: 
WFLYJCA0115:
O módulo para o driver [org.postgresql]
ou uma das suas dependências está faltando:
[org.postgresql]

Os datasources
java:jboss/datasources/sibdo-ds
java:jboss/datasources/siico-ds

Solicito validar a instalação/disponibilização do módulo JDBC PostgreSQL (org.postgresql) no servidor:
caddeapllx2835.agil.nprd.caixa.gov.br

Favor encaminhar o server.log referente à última tentativa de deploy da release SIBDO-web-13, após as alterações realizadas no standalone-full-ha.xml, abrangendo o período do deploy ocorrido em 20/10/2026.

O objetivo é identificar a causa do:
sibdo.war
status = FAILED



2026-10-20T15:02:03.4647303Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-20T15:02:03.4650212Z ==============================================================================
2026-10-20T15:02:03.4650293Z Task         : Bash
2026-10-20T15:02:03.4650333Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-20T15:02:03.4650393Z Version      : 3.227.0
2026-10-20T15:02:03.4650443Z Author       : Microsoft Corporation
2026-10-20T15:02:03.4650489Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-20T15:02:03.4650557Z ==============================================================================
2026-10-20T15:02:04.2815554Z Generating script.
2026-10-20T15:02:04.2823927Z Script contents:
2026-10-20T15:02:04.2824480Z ansible-playbook /opt/ads-agent/_work/r17970/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sibdo-web -e site=ctc_nprd
2026-10-20T15:02:04.2827236Z ========================== Starting Command Output ===========================
2026-10-20T15:02:04.2834604Z [command]/bin/bash /opt/ads-agent/_work/_temp/2a1fe7f4-839d-4888-9c87-8600dd31f497.sh
2026-10-20T15:02:06.4400923Z 
2026-10-20T15:02:06.4401780Z PLAY [local] *******************************************************************
2026-10-20T15:02:06.4679825Z 
2026-10-20T15:02:06.4680309Z PLAY [Configurando o DNS] ******************************************************
2026-10-20T15:02:06.6535838Z 
2026-10-20T15:02:06.6536349Z PLAY [local] *******************************************************************
2026-10-20T15:02:06.6565835Z 
2026-10-20T15:02:06.6566210Z PLAY [Verificando serviços] ****************************************************
2026-10-20T15:02:06.6650931Z 
2026-10-20T15:02:06.6651768Z PLAY [Configuração LDAP] *******************************************************
2026-10-20T15:02:06.6685864Z [WARNING]: Found variable using reserved name: when
2026-10-20T15:02:06.6690393Z 
2026-10-20T15:02:06.6690538Z PLAY [jboss] *******************************************************************
2026-10-20T15:02:06.6776648Z 
2026-10-20T15:02:06.6777017Z PLAY [Stack Jboss] *************************************************************
2026-10-20T15:02:06.7006173Z Tuesday 20 October 2026  12:02:06 -0300 (0:00:00.321)       0:00:00.321 ******* 
2026-10-20T15:02:07.2030211Z 
2026-10-20T15:02:07.2032916Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-20T15:02:07.2033127Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-20T15:02:07.2033387Z caddeapllx2835.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-20T15:02:07.2033646Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-20T15:02:07.2033887Z releases. A future Ansible release will default to using the discovered 
2026-10-20T15:02:07.2034077Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-20T15:02:07.2034931Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-20T15:02:07.2035603Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-20T15:02:07.2035849Z setting deprecation_warnings=False in ansible.cfg.
2026-10-20T15:02:07.2036063Z ok: [caddeapllx2835.agil.nprd.caixa.gov.br]
2026-10-20T15:02:07.2054318Z 
2026-10-20T15:02:07.2054712Z PLAY [jboss] *******************************************************************
2026-10-20T15:02:07.2095779Z 
2026-10-20T15:02:07.2096122Z PLAY [jboss] *******************************************************************
2026-10-20T15:02:07.2133675Z 
2026-10-20T15:02:07.2133965Z PLAY [jboss] *******************************************************************
2026-10-20T15:02:07.2156611Z 
2026-10-20T15:02:07.2156762Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-20T15:02:07.2183805Z 
2026-10-20T15:02:07.2184286Z PLAY [Copiando modules adicionais] *********************************************
2026-10-20T15:02:07.2211988Z 
2026-10-20T15:02:07.2212423Z PLAY [jboss] *******************************************************************
2026-10-20T15:02:07.2245293Z 
2026-10-20T15:02:07.2245643Z PLAY [jboss] *******************************************************************
2026-10-20T15:02:07.2274030Z 
2026-10-20T15:02:07.2274291Z PLAY [jboss] *******************************************************************
2026-10-20T15:02:07.2311908Z Tuesday 20 October 2026  12:02:07 -0300 (0:00:00.530)       0:00:00.852 ******* 
2026-10-20T15:02:07.5917587Z 
2026-10-20T15:02:07.5918098Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T15:02:07.5918299Z ok: [caddeapllx2835.agil.nprd.caixa.gov.br]
2026-10-20T15:02:07.5947096Z Tuesday 20 October 2026  12:02:07 -0300 (0:00:00.363)       0:00:01.216 ******* 
2026-10-20T15:02:08.2170592Z 
2026-10-20T15:02:08.2171099Z TASK [Check if Jboss is Running] ***********************************************
2026-10-20T15:02:08.2171267Z ok: [caddeapllx2835.agil.nprd.caixa.gov.br]
2026-10-20T15:02:08.2199288Z Tuesday 20 October 2026  12:02:08 -0300 (0:00:00.625)       0:00:01.841 ******* 
2026-10-20T15:02:08.6571640Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-20T15:02:14.0404221Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-20T15:02:19.4414042Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-20T15:02:24.8151056Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-20T15:02:30.2001524Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-20T15:02:35.5698602Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-20T15:02:40.9424877Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-20T15:02:46.3276256Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-20T15:02:51.6902640Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-20T15:02:57.0644962Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-20T15:03:02.4591750Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-20T15:03:07.8312102Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-20T15:03:13.2035988Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-20T15:03:18.5913706Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-20T15:03:23.9694936Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-20T15:03:29.3429963Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-20T15:03:34.7202258Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-20T15:03:40.0886403Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-20T15:03:45.4525789Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-20T15:03:50.8260748Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-20T15:03:56.1910220Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-20T15:04:01.5461177Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-20T15:04:06.9238594Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-20T15:04:12.2908180Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-20T15:04:17.6619073Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-20T15:04:23.0222055Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-20T15:04:28.3893665Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-20T15:04:33.7516877Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-20T15:04:39.1159071Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-20T15:04:44.4744282Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-20T15:04:49.8308412Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-20T15:04:55.2004056Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-20T15:05:00.5600423Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-20T15:05:05.9269052Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-20T15:05:11.3170002Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-20T15:05:16.6765900Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-20T15:05:22.0385970Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-20T15:05:27.4148941Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-20T15:05:32.7878968Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-20T15:05:38.1466027Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-20T15:05:43.5218046Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-20T15:05:48.8819153Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-20T15:05:54.2458142Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-20T15:05:59.6149269Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-20T15:06:04.9799464Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-20T15:06:10.3385414Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-20T15:06:15.7065630Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-20T15:06:21.0630731Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-20T15:06:26.4224661Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-20T15:06:31.7889191Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-20T15:06:37.1476988Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-20T15:06:42.5106398Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-20T15:06:47.8815186Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-20T15:06:53.2508349Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-20T15:06:58.6092830Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-20T15:07:03.9790943Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-20T15:07:09.3502660Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-20T15:07:14.7136441Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-20T15:07:20.0829206Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-20T15:07:25.4491963Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-20T15:07:30.8180221Z 
2026-10-20T15:07:30.8180736Z TASK [Check Deployment details looking for status OK] **************************
2026-10-20T15:07:30.8186173Z fatal: [caddeapllx2835.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"sibdo.war\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"k1U50KOT1ckR2JOY8fBLSzWb9gY=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792508511224, \"enabled-timestamp\" : \"2026-10-20 12:01:51,224 BRT\", \"managed\" : true, \"name\" : \"sibdo.war\", \"owner\" : {\"subsystem\" : \"deployment-scanner\", \"scanner\" : \"default\"}, \"persistent\" : false, \"runtime-name\" : \"sibdo.war\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"undertow\" : null, \"logging\" : null}}}}", "content_encoding": "identity", "content_length": "546", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Tue, 20 Oct 2026 15:07:30 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"sibdo.war": {"content": [{"hash": {"BYTES_VALUE": "k1U50KOT1ckR2JOY8fBLSzWb9gY="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792508511224, "enabled-timestamp": "2026-10-20 12:01:51,224 BRT", "managed": true, "name": "sibdo.war", "owner": {"scanner": "default", "subsystem": "deployment-scanner"}, "persistent": false, "runtime-name": "sibdo.war", "status": "FAILED", "subdeployment": null, "subsystem": {"logging": null, "undertow": null}}}}, "msg": "OK (546 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.37:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-20T15:07:30.8221015Z Tuesday 20 October 2026  12:07:30 -0300 (0:05:22.602)       0:05:24.443 ******* 
2026-10-20T15:07:43.6214613Z 
2026-10-20T15:07:43.6215400Z TASK [systemd] *****************************************************************
2026-10-20T15:07:43.6217859Z changed: [caddeapllx2835.agil.nprd.caixa.gov.br]
2026-10-20T15:07:43.6251748Z Tuesday 20 October 2026  12:07:43 -0300 (0:00:12.803)       0:05:37.246 ******* 
2026-10-20T15:07:43.9362340Z 
2026-10-20T15:07:43.9362966Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T15:07:43.9389650Z ok: [caddeapllx2835.agil.nprd.caixa.gov.br]
2026-10-20T15:07:43.9390049Z Tuesday 20 October 2026  12:07:43 -0300 (0:00:00.313)       0:05:37.560 ******* 
2026-10-20T15:07:44.5291936Z 
2026-10-20T15:07:44.5292431Z TASK [Check if Jboss is Running] ***********************************************
2026-10-20T15:07:44.5292582Z ok: [caddeapllx2835.agil.nprd.caixa.gov.br]
2026-10-20T15:07:44.5321724Z Tuesday 20 October 2026  12:07:44 -0300 (0:00:00.593)       0:05:38.153 ******* 
2026-10-20T15:07:44.9991702Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-20T15:07:50.3666538Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-20T15:07:55.7288810Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-20T15:08:01.1086204Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-20T15:08:06.4750504Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-20T15:08:11.8471178Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-20T15:08:17.2180294Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-20T15:08:22.5799996Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-20T15:08:27.9456443Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-20T15:08:33.3177303Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-20T15:08:38.7068320Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-20T15:08:44.0790134Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-20T15:08:49.4535373Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-20T15:08:54.8189692Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-20T15:09:00.1809303Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-20T15:09:05.5672569Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-20T15:09:10.9245604Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-20T15:09:16.2815901Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-20T15:09:21.6587875Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-20T15:09:27.0322431Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-20T15:09:32.3936995Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-20T15:09:37.7749316Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-20T15:09:43.1420238Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-20T15:09:48.5091137Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-20T15:09:53.8766340Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-20T15:09:59.2338265Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-20T15:10:04.6033584Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-20T15:10:09.9775813Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-20T15:10:15.3494238Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-20T15:10:20.7156242Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-20T15:10:26.0927236Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-20T15:10:31.4652120Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-20T15:10:36.8322257Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-20T15:10:42.2069997Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-20T15:10:47.5741253Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-20T15:10:52.9369767Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-20T15:10:58.3097194Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-20T15:11:03.6793129Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-20T15:11:09.0415269Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-20T15:11:14.4152008Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-20T15:11:19.7816277Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-20T15:11:25.1532962Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-20T15:11:30.5298921Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-20T15:11:35.9101367Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-20T15:11:41.2746709Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-20T15:11:46.6457586Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-20T15:11:52.0071398Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-20T15:11:57.3747088Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-20T15:12:02.7524171Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-20T15:12:08.1167263Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-20T15:12:13.4837667Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-20T15:12:18.8629770Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-20T15:12:24.2340701Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-20T15:12:29.6032304Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-20T15:12:34.9706398Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-20T15:12:40.3384472Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-20T15:12:45.7003138Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-20T15:12:51.0793738Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-20T15:12:56.4379685Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-20T15:13:01.8062817Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-20T15:13:07.1827201Z 
2026-10-20T15:13:07.1827856Z TASK [Check Deployment details looking for status OK] **************************
2026-10-20T15:13:07.1832767Z fatal: [caddeapllx2835.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"sibdo.war\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"k1U50KOT1ckR2JOY8fBLSzWb9gY=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792508860161, \"enabled-timestamp\" : \"2026-10-20 12:07:40,161 BRT\", \"managed\" : true, \"name\" : \"sibdo.war\", \"owner\" : {\"subsystem\" : \"deployment-scanner\", \"scanner\" : \"default\"}, \"persistent\" : false, \"runtime-name\" : \"sibdo.war\", \"status\" : \"FAILED\", \"subdeployment\" : null, \"subsystem\" : {\"undertow\" : null, \"logging\" : null}}}}", "content_encoding": "identity", "content_length": "546", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Tue, 20 Oct 2026 15:13:07 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"sibdo.war": {"content": [{"hash": {"BYTES_VALUE": "k1U50KOT1ckR2JOY8fBLSzWb9gY="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792508860161, "enabled-timestamp": "2026-10-20 12:07:40,161 BRT", "managed": true, "name": "sibdo.war", "owner": {"scanner": "default", "subsystem": "deployment-scanner"}, "persistent": false, "runtime-name": "sibdo.war", "status": "FAILED", "subdeployment": null, "subsystem": {"logging": null, "undertow": null}}}}, "msg": "OK (546 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.37:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-20T15:13:07.1845531Z 
2026-10-20T15:13:07.1845679Z PLAY RECAP *********************************************************************
2026-10-20T15:13:07.1848375Z caddeapllx2835.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-20T15:13:07.1848686Z 
2026-10-20T15:13:07.1849002Z Tuesday 20 October 2026  12:13:07 -0300 (0:05:22.652)       0:11:00.806 ******* 
2026-10-20T15:13:07.1849169Z =============================================================================== 
2026-10-20T15:13:07.1849389Z Check Deployment details looking for status OK ------------------------ 322.65s
2026-10-20T15:13:07.1850664Z Check Deployment details looking for status OK ------------------------ 322.60s
2026-10-20T15:13:07.1850967Z systemd ---------------------------------------------------------------- 12.80s
2026-10-20T15:13:07.1851201Z Check if Jboss is Running ----------------------------------------------- 0.63s
2026-10-20T15:13:07.1851596Z Check if Jboss is Running ----------------------------------------------- 0.59s
2026-10-20T15:13:07.1851820Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.53s
2026-10-20T15:13:07.1852043Z Wait for Jboss Management port ------------------------------------------ 0.36s
2026-10-20T15:13:07.1852241Z Wait for Jboss Management port ------------------------------------------ 0.31s
2026-10-20T15:13:07.1852382Z Playbook run took 0 days, 0 hours, 11 minutes, 0 seconds
2026-10-20T15:13:07.2379963Z ##[error]Bash exited with code '2'.
2026-10-20T15:13:07.2413001Z ##[section]Finishing: Check Deployments [JBOSS]




o amigo analsita disse isso

Identificada falha na inicialização dos datasources sibdo-ds e siico-ds. O arquivo standalone-full-ha.xml referencia o driver PostgreSQL (module="org.postgresql"), porém não foi localizado o módulo JDBC PostgreSQL no JBoss nem qualquer artefato postgresql*.jar no servidor ou no deployment da aplicação. O boot falha devido à ausência do serviço jboss.jdbc-driver.postgresql. Necessário obter/restaurar o driver JDBC PostgreSQL (JAR e module.xml) utilizado pela aplicação para conclusão da configuração do ambiente.


e falou que pra madnar pra infra faz sentido?
