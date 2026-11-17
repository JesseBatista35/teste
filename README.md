2026-11-17T15:32:58.4051699Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-17T15:32:58.4056810Z ==============================================================================
2026-11-17T15:32:58.4056963Z Task         : Bash
2026-11-17T15:32:58.4057035Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-17T15:32:58.4057141Z Version      : 3.227.0
2026-11-17T15:32:58.4057224Z Author       : Microsoft Corporation
2026-11-17T15:32:58.4057302Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-17T15:32:58.4057441Z ==============================================================================
2026-11-17T15:32:58.5579455Z Generating script.
2026-11-17T15:32:58.5589045Z Script contents:
2026-11-17T15:32:58.5589882Z ansible-playbook /opt/ads-agent/_work/r19645/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigec-portabilidade -e site=ctc_nprd
2026-11-17T15:32:58.5593600Z ========================== Starting Command Output ===========================
2026-11-17T15:32:58.5601770Z [command]/bin/bash /opt/ads-agent/_work/_temp/e2d8dd22-2d3e-4f8f-8c13-389246a3881a.sh
2026-11-17T15:33:01.0485248Z 
2026-11-17T15:33:01.0485899Z PLAY [local] *******************************************************************
2026-11-17T15:33:01.0808994Z 
2026-11-17T15:33:01.0809606Z PLAY [Configurando o DNS] ******************************************************
2026-11-17T15:33:01.3481582Z 
2026-11-17T15:33:01.3482255Z PLAY [local] *******************************************************************
2026-11-17T15:33:01.3521538Z 
2026-11-17T15:33:01.3522412Z PLAY [Verificando serviços] ****************************************************
2026-11-17T15:33:01.3624736Z 
2026-11-17T15:33:01.3625524Z PLAY [Configuração LDAP] *******************************************************
2026-11-17T15:33:01.3676127Z [WARNING]: Found variable using reserved name: when
2026-11-17T15:33:01.3683948Z 
2026-11-17T15:33:01.3684402Z PLAY [jboss] *******************************************************************
2026-11-17T15:33:01.4265182Z 
2026-11-17T15:33:01.4265934Z PLAY [Stack Jboss] *************************************************************
2026-11-17T15:33:01.4521149Z Tuesday 17 November 2026  12:33:01 -0300 (0:00:00.467)       0:00:00.467 ****** 
2026-11-17T15:33:02.1069106Z 
2026-11-17T15:33:02.1072550Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-17T15:33:02.1072739Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-17T15:33:02.1072990Z caddeapllx2871.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-17T15:33:02.1073160Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-17T15:33:02.1073334Z releases. A future Ansible release will default to using the discovered 
2026-11-17T15:33:02.1073496Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-17T15:33:02.1073659Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-17T15:33:02.1073827Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-17T15:33:02.1073958Z setting deprecation_warnings=False in ansible.cfg.
2026-11-17T15:33:02.1074087Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T15:33:02.1120585Z 
2026-11-17T15:33:02.1120935Z PLAY [jboss] *******************************************************************
2026-11-17T15:33:02.1176236Z 
2026-11-17T15:33:02.1176667Z PLAY [jboss] *******************************************************************
2026-11-17T15:33:02.1225564Z 
2026-11-17T15:33:02.1225794Z PLAY [jboss] *******************************************************************
2026-11-17T15:33:02.1250511Z 
2026-11-17T15:33:02.1250671Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-17T15:33:02.1279436Z 
2026-11-17T15:33:02.1279589Z PLAY [Copiando modules adicionais] *********************************************
2026-11-17T15:33:02.1308776Z 
2026-11-17T15:33:02.1309326Z PLAY [jboss] *******************************************************************
2026-11-17T15:33:02.1346751Z 
2026-11-17T15:33:02.1346934Z PLAY [jboss] *******************************************************************
2026-11-17T15:33:02.1380999Z 
2026-11-17T15:33:02.1381355Z PLAY [jboss] *******************************************************************
2026-11-17T15:33:02.1430070Z Tuesday 17 November 2026  12:33:02 -0300 (0:00:00.690)       0:00:01.158 ****** 
2026-11-17T15:33:02.7037030Z 
2026-11-17T15:33:02.7037772Z TASK [Wait for Jboss Management port] ******************************************
2026-11-17T15:33:02.7037948Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T15:33:02.7076868Z Tuesday 17 November 2026  12:33:02 -0300 (0:00:00.564)       0:00:01.723 ****** 
2026-11-17T15:33:03.8944172Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-17T15:33:09.5657788Z 
2026-11-17T15:33:09.5658708Z TASK [Check if Jboss is Running] ***********************************************
2026-11-17T15:33:09.5659024Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T15:33:09.5698100Z Tuesday 17 November 2026  12:33:09 -0300 (0:00:06.862)       0:00:08.585 ****** 
2026-11-17T15:33:10.1917034Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-17T15:33:15.7949257Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-17T15:33:21.4717876Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-17T15:33:26.9153820Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-17T15:33:32.3693487Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-17T15:33:37.8016171Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-17T15:33:43.2319150Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-17T15:33:48.6557844Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-17T15:33:54.0949066Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-17T15:33:59.5281009Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-17T15:34:04.9439308Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-17T15:34:10.3777398Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-17T15:34:15.8241118Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-17T15:34:21.2468787Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-17T15:34:26.6734391Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-17T15:34:32.0831031Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-17T15:34:37.5023795Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-17T15:34:42.9189508Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-17T15:34:48.3366506Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-17T15:34:53.7742221Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-17T15:34:59.1940368Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-17T15:35:04.6084079Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-17T15:35:10.0185808Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-17T15:35:15.4448910Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-17T15:35:20.8585610Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-17T15:35:26.2744551Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-17T15:35:31.6989322Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-17T15:35:37.1114224Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-17T15:35:42.5285079Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-17T15:35:47.9414881Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-17T15:35:53.3443642Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-17T15:35:58.7507913Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-17T15:36:04.1735388Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-17T15:36:09.5870602Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-17T15:36:14.9980618Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-17T15:36:20.4163307Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-17T15:36:25.8276492Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-17T15:36:31.2303065Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-17T15:36:36.6513577Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-17T15:36:42.0543266Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-17T15:36:47.5040717Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-17T15:36:52.9252293Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-17T15:36:58.3408695Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-17T15:37:03.7547644Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-17T15:37:09.1734333Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-17T15:37:14.5894476Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-17T15:37:19.9982022Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-17T15:37:25.4072135Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-17T15:37:30.8115517Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-17T15:37:36.2192225Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-17T15:37:41.6446528Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-17T15:37:47.0479731Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-17T15:37:52.4593387Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-17T15:37:57.8649194Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-17T15:38:03.2885593Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-17T15:38:08.6990301Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-17T15:38:14.1177374Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-17T15:38:19.5259066Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-17T15:38:24.9386716Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-17T15:38:30.3634463Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-17T15:38:35.7779273Z 
2026-11-17T15:38:35.7779760Z TASK [Check Deployment details looking for status OK] **************************
2026-11-17T15:38:35.7794700Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929577535, \"enabled-timestamp\" : \"2026-11-17 12:32:57,535 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929577537, \"enabled-timestamp\" : \"2026-11-17 12:32:57,537 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"SWV3C0t3pEvj2x/8Sqqe8AkQse8=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929577503, \"enabled-timestamp\" : \"2026-11-17 12:32:57,503 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-web.war\" : null, \"gec-api.war\" : null}, \"subsystem\" : null}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929577558, \"enabled-timestamp\" : \"2026-11-17 12:32:57,558 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2139", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Tue, 17 Nov 2026 15:38:35 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929577535, "enabled-timestamp": "2026-11-17 12:32:57,535 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929577537, "enabled-timestamp": "2026-11-17 12:32:57,537 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "SWV3C0t3pEvj2x/8Sqqe8AkQse8="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929577503, "enabled-timestamp": "2026-11-17 12:32:57,503 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-ejb.jar": null, "gec-web.war": null}, "subsystem": null}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929577558, "enabled-timestamp": "2026-11-17 12:32:57,558 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2139 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.61:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-17T15:38:35.7837737Z Tuesday 17 November 2026  12:38:35 -0300 (0:05:26.213)       0:05:34.799 ****** 
2026-11-17T15:38:48.7649487Z 
2026-11-17T15:38:48.7650355Z TASK [systemd] *****************************************************************
2026-11-17T15:38:48.7650585Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T15:38:48.7691316Z Tuesday 17 November 2026  12:38:48 -0300 (0:00:12.985)       0:05:47.784 ****** 
2026-11-17T15:38:49.0879678Z 
2026-11-17T15:38:49.0880160Z TASK [Wait for Jboss Management port] ******************************************
2026-11-17T15:38:49.0882652Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T15:38:49.0915705Z Tuesday 17 November 2026  12:38:49 -0300 (0:00:00.322)       0:05:48.107 ****** 
2026-11-17T15:38:49.8125151Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-17T15:38:55.4393589Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-11-17T15:39:00.9227077Z 
2026-11-17T15:39:00.9227602Z TASK [Check if Jboss is Running] ***********************************************
2026-11-17T15:39:00.9227761Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-17T15:39:00.9280633Z Tuesday 17 November 2026  12:39:00 -0300 (0:00:11.836)       0:05:59.943 ****** 
2026-11-17T15:39:01.4881489Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-17T15:39:07.0404443Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-17T15:39:12.4841244Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-17T15:39:17.8987912Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-17T15:39:23.3208308Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-17T15:39:28.7461520Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-17T15:39:34.1611695Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-17T15:39:39.5801758Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-17T15:39:44.9889583Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-17T15:39:50.4064863Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-17T15:39:55.8222993Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-17T15:40:01.2442917Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-17T15:40:06.6603474Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-17T15:40:12.0735791Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-17T15:40:17.4849456Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-17T15:40:22.9905892Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-17T15:40:28.4153266Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-17T15:40:33.8300641Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-17T15:40:39.2474012Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-17T15:40:44.6763292Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-17T15:40:50.0940778Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-17T15:40:55.5064772Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-17T15:41:00.9301186Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-17T15:41:06.3524747Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-17T15:41:11.8455524Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-17T15:41:17.2628041Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-17T15:41:22.6745556Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-17T15:41:28.0844398Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-17T15:41:33.5114582Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-17T15:41:38.9171488Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-17T15:41:44.3246678Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-17T15:41:49.7742682Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-17T15:41:55.1767743Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-17T15:42:00.5967931Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-17T15:42:06.0382202Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-17T15:42:11.4491777Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-17T15:42:16.8630828Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-17T15:42:22.2968762Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-17T15:42:27.7023223Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-17T15:42:33.1183348Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-17T15:42:38.5310221Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-17T15:42:43.9526889Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-17T15:42:49.3595638Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-17T15:42:54.7803702Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-17T15:43:00.1874023Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-17T15:43:05.5924318Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-17T15:43:11.0080823Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-17T15:43:16.4145705Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-17T15:43:21.8294123Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-17T15:43:27.2834634Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-17T15:43:32.6950742Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-17T15:43:38.1208995Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-17T15:43:43.5977689Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-17T15:43:49.0055713Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-17T15:43:54.4135519Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-17T15:43:59.8384582Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-17T15:44:05.2493635Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-17T15:44:10.6626998Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-17T15:44:16.0885435Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-17T15:44:21.4924561Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-17T15:44:26.9062280Z 
2026-11-17T15:44:26.9062987Z TASK [Check Deployment details looking for status OK] **************************
2026-11-17T15:44:26.9076707Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929926272, \"enabled-timestamp\" : \"2026-11-17 12:38:46,272 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929926274, \"enabled-timestamp\" : \"2026-11-17 12:38:46,274 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"SWV3C0t3pEvj2x/8Sqqe8AkQse8=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929926261, \"enabled-timestamp\" : \"2026-11-17 12:38:46,261 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-web.war\" : null, \"gec-api.war\" : null}, \"subsystem\" : null}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1794929926291, \"enabled-timestamp\" : \"2026-11-17 12:38:46,291 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2139", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Tue, 17 Nov 2026 15:44:26 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929926272, "enabled-timestamp": "2026-11-17 12:38:46,272 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929926274, "enabled-timestamp": "2026-11-17 12:38:46,274 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "SWV3C0t3pEvj2x/8Sqqe8AkQse8="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929926261, "enabled-timestamp": "2026-11-17 12:38:46,261 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-ejb.jar": null, "gec-web.war": null}, "subsystem": null}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1794929926291, "enabled-timestamp": "2026-11-17 12:38:46,291 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2139 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.61:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-17T15:44:26.9120694Z 
2026-11-17T15:44:26.9122579Z PLAY RECAP *********************************************************************
2026-11-17T15:44:26.9122759Z caddeapllx2871.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-11-17T15:44:26.9122862Z 
2026-11-17T15:44:26.9125802Z Tuesday 17 November 2026  12:44:26 -0300 (0:05:25.984)       0:11:25.927 ****** 
2026-11-17T15:44:26.9126035Z =============================================================================== 
2026-11-17T15:44:26.9126259Z Check Deployment details looking for status OK ------------------------ 326.21s
2026-11-17T15:44:26.9126477Z Check Deployment details looking for status OK ------------------------ 325.98s
2026-11-17T15:44:26.9126684Z systemd ---------------------------------------------------------------- 12.99s
2026-11-17T15:44:26.9128116Z Check if Jboss is Running ---------------------------------------------- 11.84s
2026-11-17T15:44:26.9131534Z Check if Jboss is Running ----------------------------------------------- 6.86s
2026-11-17T15:44:26.9132704Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.69s
2026-11-17T15:44:26.9133041Z Wait for Jboss Management port ------------------------------------------ 0.56s
2026-11-17T15:44:26.9133366Z Wait for Jboss Management port ------------------------------------------ 0.32s
2026-11-17T15:44:26.9133540Z Playbook run took 0 days, 0 hours, 11 minutes, 25 seconds
2026-11-17T15:44:26.9826377Z ##[error]Bash exited with code '2'.
2026-11-17T15:44:26.9858001Z ##[section]Finishing: Check Deployments [JBOSS]
