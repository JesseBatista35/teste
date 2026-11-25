
[p585600@caddeapllx2871 ~]$ wc -l /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
977 /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
[p585600@caddeapllx2871 ~]$


2026-11-25T18:31:57.6114348Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-25T18:31:57.6117512Z ==============================================================================
2026-11-25T18:31:57.6117598Z Task         : Bash
2026-11-25T18:31:57.6117640Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-25T18:31:57.6117712Z Version      : 3.227.0
2026-11-25T18:31:57.6117752Z Author       : Microsoft Corporation
2026-11-25T18:31:57.6117798Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-25T18:31:57.6117865Z ==============================================================================
2026-11-25T18:31:58.2542264Z Generating script.
2026-11-25T18:31:58.2550555Z Script contents:
2026-11-25T18:31:58.2551082Z ansible-playbook /opt/ads-agent/_work/r18280/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigec-portabilidade-online -e site=ctc_nprd
2026-11-25T18:31:58.2553731Z ========================== Starting Command Output ===========================
2026-11-25T18:31:58.2568088Z [command]/bin/bash /opt/ads-agent/_work/_temp/0b9240ca-48a8-452f-9efb-b0cf133f4816.sh
2026-11-25T18:32:00.4621781Z 
2026-11-25T18:32:00.4622271Z PLAY [local] *******************************************************************
2026-11-25T18:32:00.4930018Z 
2026-11-25T18:32:00.4930560Z PLAY [Configurando o DNS] ******************************************************
2026-11-25T18:32:00.6868539Z 
2026-11-25T18:32:00.6869029Z PLAY [local] *******************************************************************
2026-11-25T18:32:00.6897497Z 
2026-11-25T18:32:00.6897950Z PLAY [Verificando serviços] ****************************************************
2026-11-25T18:32:00.6985781Z 
2026-11-25T18:32:00.6986428Z PLAY [Configuração LDAP] *******************************************************
2026-11-25T18:32:00.7028283Z [WARNING]: Found variable using reserved name: when
2026-11-25T18:32:00.7031959Z 
2026-11-25T18:32:00.7032106Z PLAY [jboss] *******************************************************************
2026-11-25T18:32:00.7380659Z 
2026-11-25T18:32:00.7381143Z PLAY [Stack Jboss] *************************************************************
2026-11-25T18:32:00.7610554Z Wednesday 25 November 2026  15:32:00 -0300 (0:00:00.360)       0:00:00.360 **** 
2026-11-25T18:32:01.3256547Z 
2026-11-25T18:32:01.3257430Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-25T18:32:01.3257639Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T18:32:01.3257868Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-25T18:32:01.3258181Z caddeapllx2871.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-25T18:32:01.3258417Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-25T18:32:01.3258688Z releases. A future Ansible release will default to using the discovered 
2026-11-25T18:32:01.3258925Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-25T18:32:01.3259187Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-25T18:32:01.3259426Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-25T18:32:01.3259641Z setting deprecation_warnings=False in ansible.cfg.
2026-11-25T18:32:01.3279868Z 
2026-11-25T18:32:01.3280100Z PLAY [jboss] *******************************************************************
2026-11-25T18:32:01.3327631Z 
2026-11-25T18:32:01.3328369Z PLAY [jboss] *******************************************************************
2026-11-25T18:32:01.3371967Z 
2026-11-25T18:32:01.3372469Z PLAY [jboss] *******************************************************************
2026-11-25T18:32:01.3398139Z 
2026-11-25T18:32:01.3398386Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-25T18:32:01.3422258Z 
2026-11-25T18:32:01.3422536Z PLAY [Copiando modules adicionais] *********************************************
2026-11-25T18:32:01.3456059Z 
2026-11-25T18:32:01.3456488Z PLAY [jboss] *******************************************************************
2026-11-25T18:32:01.3489011Z 
2026-11-25T18:32:01.3489332Z PLAY [jboss] *******************************************************************
2026-11-25T18:32:01.3518577Z 
2026-11-25T18:32:01.3519199Z PLAY [jboss] *******************************************************************
2026-11-25T18:32:01.3558200Z Wednesday 25 November 2026  15:32:01 -0300 (0:00:00.594)       0:00:00.955 **** 
2026-11-25T18:32:01.7825890Z 
2026-11-25T18:32:01.7826393Z TASK [Wait for Jboss Management port] ******************************************
2026-11-25T18:32:01.7826557Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T18:32:01.7859424Z Wednesday 25 November 2026  15:32:01 -0300 (0:00:00.430)       0:00:01.385 **** 
2026-11-25T18:32:02.7321555Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-25T18:32:08.2200887Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-11-25T18:32:13.6877867Z FAILED - RETRYING: Check if Jboss is Running (118 retries left).
2026-11-25T18:32:19.2965595Z 
2026-11-25T18:32:19.2966098Z TASK [Check if Jboss is Running] ***********************************************
2026-11-25T18:32:19.2966247Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T18:32:19.2996184Z Wednesday 25 November 2026  15:32:19 -0300 (0:00:17.513)       0:00:18.899 **** 
2026-11-25T18:32:19.7732428Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-25T18:32:25.4769158Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-25T18:32:30.9340025Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-25T18:32:36.3128071Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-25T18:32:41.6789422Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-25T18:32:47.0421396Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-25T18:32:52.4128267Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-25T18:32:57.7767291Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-25T18:33:03.1367105Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-25T18:33:08.5364536Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-25T18:33:13.9062158Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-25T18:33:19.2655347Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-25T18:33:24.6453563Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-25T18:33:30.0127293Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-25T18:33:35.3658445Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-25T18:33:40.7458078Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-25T18:33:46.1090272Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-25T18:33:51.4608382Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-25T18:33:56.8397658Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-25T18:34:02.1995108Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-25T18:34:07.5683616Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-25T18:34:12.9469861Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-25T18:34:18.3042027Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-25T18:34:23.6887819Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-25T18:34:29.0503607Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-25T18:34:34.4054620Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-25T18:34:39.7677084Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-25T18:34:45.1363034Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-25T18:34:50.4913936Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-25T18:34:55.8456284Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-25T18:35:01.2124679Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-25T18:35:06.5701805Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-25T18:35:11.9374208Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-25T18:35:17.3279617Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-25T18:35:22.6925335Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-25T18:35:28.0506770Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-25T18:35:33.4274853Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-25T18:35:38.7835523Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-25T18:35:44.1396570Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-25T18:35:49.5140675Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-25T18:35:54.8681712Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-25T18:36:00.2320869Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-25T18:36:05.6085136Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-25T18:36:10.9695704Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-25T18:36:16.3283598Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-25T18:36:21.6978542Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-25T18:36:27.0735805Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-25T18:36:32.4287623Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-25T18:36:37.8026288Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-25T18:36:43.1570072Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-25T18:36:48.5116700Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-25T18:36:53.8855664Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-25T18:36:59.2420760Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-25T18:37:04.5988964Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-25T18:37:09.9730475Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-25T18:37:15.3310953Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-25T18:37:20.6882738Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-25T18:37:26.0537037Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-25T18:37:31.4307348Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-25T18:37:36.7923227Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-25T18:37:42.1665376Z 
2026-11-25T18:37:42.1665881Z TASK [Check Deployment details looking for status OK] **************************
2026-11-25T18:37:42.1679397Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631514941, \"enabled-timestamp\" : \"2026-11-25 15:31:54,941 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631514944, \"enabled-timestamp\" : \"2026-11-25 15:31:54,944 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"SmRfIRP0YhW4q414ZRX1hk1WbPQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631514929, \"enabled-timestamp\" : \"2026-11-25 15:31:54,929 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-web.war\" : null, \"gec-api.war\" : null}, \"subsystem\" : {\"jpa\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631514974, \"enabled-timestamp\" : \"2026-11-25 15:31:54,974 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2167", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Wed, 25 Nov 2026 18:37:42 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631514941, "enabled-timestamp": "2026-11-25 15:31:54,941 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631514944, "enabled-timestamp": "2026-11-25 15:31:54,944 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "SmRfIRP0YhW4q414ZRX1hk1WbPQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631514929, "enabled-timestamp": "2026-11-25 15:31:54,929 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-ejb.jar": null, "gec-web.war": null}, "subsystem": {"jpa": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631514974, "enabled-timestamp": "2026-11-25 15:31:54,974 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2167 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.61:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-25T18:37:42.1713821Z Wednesday 25 November 2026  15:37:42 -0300 (0:05:22.871)       0:05:41.771 **** 
2026-11-25T18:37:54.9930356Z 
2026-11-25T18:37:54.9931077Z TASK [systemd] *****************************************************************
2026-11-25T18:37:54.9931409Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T18:37:54.9968882Z Wednesday 25 November 2026  15:37:54 -0300 (0:00:12.825)       0:05:54.596 **** 
2026-11-25T18:37:55.2882418Z 
2026-11-25T18:37:55.2882934Z TASK [Wait for Jboss Management port] ******************************************
2026-11-25T18:37:55.2883096Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T18:37:55.2909986Z Wednesday 25 November 2026  15:37:55 -0300 (0:00:00.294)       0:05:54.890 **** 
2026-11-25T18:37:55.9807409Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-25T18:38:01.4617063Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-11-25T18:38:06.9305885Z FAILED - RETRYING: Check if Jboss is Running (118 retries left).
2026-11-25T18:38:12.3853660Z FAILED - RETRYING: Check if Jboss is Running (117 retries left).
2026-11-25T18:38:17.8289010Z 
2026-11-25T18:38:17.8289506Z TASK [Check if Jboss is Running] ***********************************************
2026-11-25T18:38:17.8289658Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-25T18:38:17.8318343Z Wednesday 25 November 2026  15:38:17 -0300 (0:00:22.540)       0:06:17.431 **** 
2026-11-25T18:38:18.2830487Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-25T18:38:23.7407724Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-25T18:38:29.3433734Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-25T18:38:34.7339540Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-25T18:38:40.1226254Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-25T18:38:45.4833888Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-25T18:38:50.8483778Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-25T18:38:56.2024247Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-25T18:39:01.5680808Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-25T18:39:06.9354336Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-25T18:39:12.3048964Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-25T18:39:17.6846657Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-25T18:39:23.0666624Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-25T18:39:28.4521955Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-25T18:39:33.8130688Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-25T18:39:39.1775420Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-25T18:39:44.5331477Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-25T18:39:49.8856913Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-25T18:39:55.2597698Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-25T18:40:00.6281831Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-25T18:40:05.9894699Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-25T18:40:11.3668843Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-25T18:40:16.7269331Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-25T18:40:22.0889188Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-25T18:40:27.4645392Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-25T18:40:32.8209583Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-25T18:40:38.1771263Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-25T18:40:43.5446205Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-25T18:40:48.9067459Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-25T18:40:54.2670240Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-25T18:40:59.6533658Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-25T18:41:05.0191877Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-25T18:41:10.3794898Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-25T18:41:15.7488310Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-25T18:41:21.1066490Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-25T18:41:26.4583789Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-25T18:41:31.8300679Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-25T18:41:37.1929449Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-25T18:41:42.5566242Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-25T18:41:47.9659804Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-25T18:41:53.3203614Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-25T18:41:58.6748558Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-25T18:42:04.0553437Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-25T18:42:09.4071329Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-25T18:42:14.7592974Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-25T18:42:20.1216754Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-25T18:42:25.4723990Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-25T18:42:30.8198099Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-25T18:42:36.1815392Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-25T18:42:41.5305964Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-25T18:42:46.8806389Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-25T18:42:52.2467141Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-25T18:42:57.5993167Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-25T18:43:02.9571473Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-25T18:43:08.3353618Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-25T18:43:13.6898579Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-25T18:43:19.0445447Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-25T18:43:24.4140963Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-25T18:43:29.7682538Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-25T18:43:35.1188293Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-25T18:43:40.4906455Z 
2026-11-25T18:43:40.4906935Z TASK [Check Deployment details looking for status OK] **************************
2026-11-25T18:43:40.4921297Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631873101, \"enabled-timestamp\" : \"2026-11-25 15:37:53,101 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631873104, \"enabled-timestamp\" : \"2026-11-25 15:37:53,104 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"SmRfIRP0YhW4q414ZRX1hk1WbPQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631873076, \"enabled-timestamp\" : \"2026-11-25 15:37:53,076 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-web.war\" : null, \"gec-api.war\" : null}, \"subsystem\" : {\"jpa\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795631873148, \"enabled-timestamp\" : \"2026-11-25 15:37:53,148 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2167", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Wed, 25 Nov 2026 18:43:40 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631873101, "enabled-timestamp": "2026-11-25 15:37:53,101 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631873104, "enabled-timestamp": "2026-11-25 15:37:53,104 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "SmRfIRP0YhW4q414ZRX1hk1WbPQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631873076, "enabled-timestamp": "2026-11-25 15:37:53,076 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-ejb.jar": null, "gec-web.war": null}, "subsystem": {"jpa": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795631873148, "enabled-timestamp": "2026-11-25 15:37:53,148 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2167 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.61:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-25T18:43:40.4937667Z 
2026-11-25T18:43:40.4938221Z PLAY RECAP *********************************************************************
2026-11-25T18:43:40.4938435Z caddeapllx2871.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-11-25T18:43:40.4938537Z 
2026-11-25T18:43:40.4938950Z Wednesday 25 November 2026  15:43:40 -0300 (0:05:22.662)       0:11:40.093 **** 
2026-11-25T18:43:40.4939107Z =============================================================================== 
2026-11-25T18:43:40.4940462Z Check Deployment details looking for status OK ------------------------ 322.87s
2026-11-25T18:43:40.4941389Z Check Deployment details looking for status OK ------------------------ 322.66s
2026-11-25T18:43:40.4941782Z Check if Jboss is Running ---------------------------------------------- 22.54s
2026-11-25T18:43:40.4942130Z Check if Jboss is Running ---------------------------------------------- 17.51s
2026-11-25T18:43:40.4942551Z systemd ---------------------------------------------------------------- 12.83s
2026-11-25T18:43:40.4943167Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.59s
2026-11-25T18:43:40.4943596Z Wait for Jboss Management port ------------------------------------------ 0.43s
2026-11-25T18:43:40.4943911Z Wait for Jboss Management port ------------------------------------------ 0.29s
2026-11-25T18:43:40.4945076Z Playbook run took 0 days, 0 hours, 11 minutes, 40 seconds
2026-11-25T18:43:40.5550681Z ##[error]Bash exited with code '2'.




deu bom ta quebrando agora pro burrrice do fabio deixa que ele se vira para resolver2026-11-25T18:43:40.5609798Z ##[section]Finishing: Check Deployments [JBOSS]

