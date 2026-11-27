bom dia Thiago Jeferson de Sousa Silva e Jesse Mouta Pereira Batista. 
 
Conseguem me auxiliar nesse ponto, pois não tenha visibilidade do log. Não é normal demorar muito nesse fase, sendo assim, gostaria de saber o que estava acontecendo. 
 
 
a contagem de retrying deveria está ocorrendo, e não é o que vemos na imagem acima.
 
veja que já tem 15min que essa task está em execução.



 2026-11-27T15:00:26.2189584Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-27T15:00:26.2192779Z ==============================================================================
2026-11-27T15:00:26.2192854Z Task         : Bash
2026-11-27T15:00:26.2192986Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-27T15:00:26.2193046Z Version      : 3.227.0
2026-11-27T15:00:26.2193089Z Author       : Microsoft Corporation
2026-11-27T15:00:26.2193148Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-27T15:00:26.2193216Z ==============================================================================
2026-11-27T15:00:27.1662754Z Generating script.
2026-11-27T15:00:27.1674446Z Script contents:
2026-11-27T15:00:27.1675179Z ansible-playbook /opt/ads-agent/_work/r16480/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigec-portabilidade-batch -e site=ctc_nprd
2026-11-27T15:00:27.1678859Z ========================== Starting Command Output ===========================
2026-11-27T15:00:27.1687519Z [command]/bin/bash /opt/ads-agent/_work/_temp/eedd5bc0-86a2-41fd-a9ad-1e78aa1846a4.sh
2026-11-27T15:00:29.5238647Z 
2026-11-27T15:00:29.5239099Z PLAY [local] *******************************************************************
2026-11-27T15:00:29.5558111Z 
2026-11-27T15:00:29.5558591Z PLAY [Configurando o DNS] ******************************************************
2026-11-27T15:00:29.7570256Z 
2026-11-27T15:00:29.7570744Z PLAY [local] *******************************************************************
2026-11-27T15:00:29.7605735Z 
2026-11-27T15:00:29.7606690Z PLAY [Verificando serviços] ****************************************************
2026-11-27T15:00:29.7706157Z 
2026-11-27T15:00:29.7706724Z PLAY [Configuração LDAP] *******************************************************
2026-11-27T15:00:29.7754346Z [WARNING]: Found variable using reserved name: when
2026-11-27T15:00:29.7758270Z 
2026-11-27T15:00:29.7758534Z PLAY [jboss] *******************************************************************
2026-11-27T15:00:29.8150995Z 
2026-11-27T15:00:29.8151478Z PLAY [Stack Jboss] *************************************************************
2026-11-27T15:00:29.8399915Z Friday 27 November 2026  12:00:29 -0300 (0:00:00.381)       0:00:00.381 ******* 
2026-11-27T15:00:30.4702077Z 
2026-11-27T15:00:30.4702916Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-27T15:00:30.4703711Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-27T15:00:30.4703940Z caddeapllx2884.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-27T15:00:30.4704121Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-27T15:00:30.4704276Z releases. A future Ansible release will default to using the discovered 
2026-11-27T15:00:30.4704434Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-27T15:00:30.4704589Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-27T15:00:30.4704756Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-27T15:00:30.4704894Z setting deprecation_warnings=False in ansible.cfg.
2026-11-27T15:00:30.4706588Z ok: [caddeapllx2884.agil.nprd.caixa.gov.br]
2026-11-27T15:00:30.4740886Z 
2026-11-27T15:00:30.4741631Z PLAY [jboss] *******************************************************************
2026-11-27T15:00:30.4796245Z 
2026-11-27T15:00:30.4796609Z PLAY [jboss] *******************************************************************
2026-11-27T15:00:30.4844022Z 
2026-11-27T15:00:30.4844595Z PLAY [jboss] *******************************************************************
2026-11-27T15:00:30.4868366Z 
2026-11-27T15:00:30.4868758Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-27T15:00:30.4901526Z 
2026-11-27T15:00:30.4903568Z PLAY [Copiando modules adicionais] *********************************************
2026-11-27T15:00:30.4929263Z 
2026-11-27T15:00:30.4929989Z PLAY [jboss] *******************************************************************
2026-11-27T15:00:30.4967366Z 
2026-11-27T15:00:30.4967876Z PLAY [jboss] *******************************************************************
2026-11-27T15:00:30.4999469Z 
2026-11-27T15:00:30.4999924Z PLAY [jboss] *******************************************************************
2026-11-27T15:00:30.5045338Z Friday 27 November 2026  12:00:30 -0300 (0:00:00.664)       0:00:01.046 ******* 
2026-11-27T15:00:30.9666709Z 
2026-11-27T15:00:30.9667607Z TASK [Wait for Jboss Management port] ******************************************
2026-11-27T15:00:30.9667860Z ok: [caddeapllx2884.agil.nprd.caixa.gov.br]
2026-11-27T15:00:30.9703932Z Friday 27 November 2026  12:00:30 -0300 (0:00:00.465)       0:00:01.511 ******* 
2026-11-27T15:00:31.8214747Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-27T15:00:37.4340618Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-11-27T15:00:43.0352556Z 
2026-11-27T15:00:43.0353065Z TASK [Check if Jboss is Running] ***********************************************
2026-11-27T15:00:43.0353228Z ok: [caddeapllx2884.agil.nprd.caixa.gov.br]
2026-11-27T15:00:43.0390171Z Friday 27 November 2026  12:00:43 -0300 (0:00:12.068)       0:00:13.580 ******* 
2026-11-27T15:00:43.5774335Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-27T15:00:49.0875006Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-27T15:00:54.5663757Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-27T15:00:59.9859967Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-27T15:01:05.3980368Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-27T15:01:10.8427318Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-27T15:01:16.2527410Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-27T15:01:21.6651918Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-27T15:01:27.0648623Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-27T15:01:32.4734412Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-27T15:01:37.8946011Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-27T15:01:43.3159083Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-27T15:01:48.7700554Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-27T15:01:54.2028565Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-27T15:01:59.6016112Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-27T15:02:05.0191418Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-27T15:02:10.4475222Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-27T15:02:15.8665260Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-27T15:02:21.2907009Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-27T15:02:26.7219488Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-27T15:02:32.1385116Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-27T15:02:37.5583960Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-27T15:02:42.9658770Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-27T15:02:48.3738206Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-27T15:02:53.7809761Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-27T15:02:59.2045965Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-27T15:03:04.6152204Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-27T15:03:10.0196867Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-27T15:03:15.4312141Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-27T15:03:20.8427446Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-27T15:03:26.2487823Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-27T15:03:31.6602269Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-27T15:03:37.0640647Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-27T15:03:42.4708423Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-27T15:03:47.8970198Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-27T15:03:53.3118772Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-27T15:03:58.7224056Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-27T15:04:04.1627022Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-27T15:04:09.5694509Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-27T15:04:14.9826415Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-27T15:04:20.4062702Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-27T15:04:25.8091975Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-27T15:04:31.2233322Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-27T15:04:36.6646086Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-27T15:04:42.0696202Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-27T15:04:47.4829730Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-27T15:04:52.9064197Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-27T15:04:58.3130490Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-27T15:05:03.7266321Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-27T15:05:09.1822030Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-27T15:05:14.5979276Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-27T15:05:20.0099362Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-27T15:05:25.4446129Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-27T15:05:30.8633904Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-27T15:05:36.2736583Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-27T15:05:41.7004414Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-27T15:05:47.0990888Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-27T15:05:52.5130797Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-27T15:05:57.9436364Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-27T15:06:03.3573024Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-27T15:06:08.7671325Z 
2026-11-27T15:06:08.7672580Z TASK [Check Deployment details looking for status OK] **************************
2026-11-27T15:06:08.7687114Z fatal: [caddeapllx2884.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791623391, \"enabled-timestamp\" : \"2026-11-27 12:00:23,391 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791623388, \"enabled-timestamp\" : \"2026-11-27 12:00:23,388 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"zhEvHy2Hzwas9ZPkBWK0BnlTk6g=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791623376, \"enabled-timestamp\" : \"2026-11-27 12:00:23,376 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-api.war\" : null, \"gec-batch.jar\" : null}, \"subsystem\" : {\"jpa\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791623430, \"enabled-timestamp\" : \"2026-11-27 12:00:23,430 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2169", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Fri, 27 Nov 2026 15:06:08 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791623391, "enabled-timestamp": "2026-11-27 12:00:23,391 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791623388, "enabled-timestamp": "2026-11-27 12:00:23,388 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "zhEvHy2Hzwas9ZPkBWK0BnlTk6g="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791623376, "enabled-timestamp": "2026-11-27 12:00:23,376 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-batch.jar": null, "gec-ejb.jar": null}, "subsystem": {"jpa": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791623430, "enabled-timestamp": "2026-11-27 12:00:23,430 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2169 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.70:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-27T15:06:08.7728871Z Friday 27 November 2026  12:06:08 -0300 (0:05:25.733)       0:05:39.314 ******* 
2026-11-27T15:06:16.6493006Z 
2026-11-27T15:06:16.6493499Z TASK [systemd] *****************************************************************
2026-11-27T15:06:16.6493774Z changed: [caddeapllx2884.agil.nprd.caixa.gov.br]
2026-11-27T15:06:16.6535260Z Friday 27 November 2026  12:06:16 -0300 (0:00:07.880)       0:05:47.195 ******* 
2026-11-27T15:06:16.9931580Z 
2026-11-27T15:06:16.9932051Z TASK [Wait for Jboss Management port] ******************************************
2026-11-27T15:06:16.9932211Z ok: [caddeapllx2884.agil.nprd.caixa.gov.br]
2026-11-27T15:06:16.9966078Z Friday 27 November 2026  12:06:16 -0300 (0:00:00.343)       0:05:47.538 ******* 
2026-11-27T15:06:17.7752502Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-27T15:06:23.2309995Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-11-27T15:06:28.7219127Z FAILED - RETRYING: Check if Jboss is Running (118 retries left).
2026-11-27T15:06:34.1835707Z 
2026-11-27T15:06:34.1836568Z TASK [Check if Jboss is Running] ***********************************************
2026-11-27T15:06:34.1836818Z ok: [caddeapllx2884.agil.nprd.caixa.gov.br]
2026-11-27T15:06:34.1869519Z Friday 27 November 2026  12:06:34 -0300 (0:00:17.190)       0:06:04.728 ******* 
2026-11-27T15:06:34.7002720Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-27T15:06:40.2290649Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-27T15:06:45.6405952Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-27T15:06:51.0761650Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-27T15:06:56.4812190Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-27T15:07:01.8943784Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-27T15:07:07.3423212Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-27T15:07:12.7555674Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-27T15:07:18.1749565Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-27T15:07:23.6031168Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-27T15:07:29.0094913Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-27T15:07:34.4210921Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-27T15:07:39.8351542Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-27T15:07:45.2665569Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-27T15:07:50.6807609Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-27T15:07:56.1064252Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-27T15:08:01.5106904Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-27T15:08:06.9221228Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-27T15:08:12.3452130Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-27T15:08:17.7548314Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-27T15:08:23.1617750Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-27T15:08:28.5894120Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-27T15:08:34.0034743Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-27T15:08:39.4039560Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-27T15:08:44.8339555Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-27T15:08:50.2443433Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-27T15:08:55.6511542Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-27T15:09:01.0901754Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-27T15:09:06.5277356Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-27T15:09:11.9793872Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-27T15:09:17.4120560Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-27T15:09:22.8167863Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-27T15:09:28.2179865Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-27T15:09:33.6458069Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-27T15:09:39.0600782Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-27T15:09:44.4669639Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-27T15:09:49.9001716Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-27T15:09:55.3079448Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-27T15:10:00.7183451Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-27T15:10:06.1538813Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-27T15:10:11.5668276Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-27T15:10:16.9732861Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-27T15:10:22.6858291Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-27T15:10:28.1496713Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-27T15:10:33.6029582Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-27T15:10:39.0780181Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-27T15:10:44.5583007Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-27T15:10:49.9746815Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-27T15:10:55.4082928Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-27T15:11:00.8840290Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-27T15:11:06.3217906Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-27T15:11:11.7606574Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-27T15:11:17.1789176Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-27T15:11:22.5964692Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-27T15:11:28.0500483Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-27T15:11:33.4447901Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-27T15:11:38.8517132Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-27T15:11:44.2652544Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-27T15:11:49.6726830Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-27T15:11:55.0725541Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-27T15:12:00.5309199Z 
2026-11-27T15:12:00.5309714Z TASK [Check Deployment details looking for status OK] **************************
2026-11-27T15:12:00.5324422Z fatal: [caddeapllx2884.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791973088, \"enabled-timestamp\" : \"2026-11-27 12:06:13,088 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791973084, \"enabled-timestamp\" : \"2026-11-27 12:06:13,084 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"zhEvHy2Hzwas9ZPkBWK0BnlTk6g=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791973073, \"enabled-timestamp\" : \"2026-11-27 12:06:13,073 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-api.war\" : null, \"gec-batch.jar\" : null}, \"subsystem\" : {\"jpa\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795791973130, \"enabled-timestamp\" : \"2026-11-27 12:06:13,130 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2169", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Fri, 27 Nov 2026 15:12:00 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791973088, "enabled-timestamp": "2026-11-27 12:06:13,088 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791973084, "enabled-timestamp": "2026-11-27 12:06:13,084 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "zhEvHy2Hzwas9ZPkBWK0BnlTk6g="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791973073, "enabled-timestamp": "2026-11-27 12:06:13,073 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-batch.jar": null, "gec-ejb.jar": null}, "subsystem": {"jpa": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795791973130, "enabled-timestamp": "2026-11-27 12:06:13,130 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2169 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.70:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-27T15:12:00.5342039Z 
2026-11-27T15:12:00.5342690Z PLAY RECAP *********************************************************************
2026-11-27T15:12:00.5342935Z caddeapllx2884.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-11-27T15:12:00.5343032Z 
2026-11-27T15:12:00.5343976Z Friday 27 November 2026  12:12:00 -0300 (0:05:26.347)       0:11:31.075 ******* 
2026-11-27T15:12:00.5344158Z =============================================================================== 
2026-11-27T15:12:00.5345445Z Check Deployment details looking for status OK ------------------------ 326.35s
2026-11-27T15:12:00.5346016Z Check Deployment details looking for status OK ------------------------ 325.73s
2026-11-27T15:12:00.5346287Z Check if Jboss is Running ---------------------------------------------- 17.19s
2026-11-27T15:12:00.5346540Z Check if Jboss is Running ---------------------------------------------- 12.07s
2026-11-27T15:12:00.5349483Z systemd ----------------------------------------------------------------- 7.88s
2026-11-27T15:12:00.5349763Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.66s
2026-11-27T15:12:00.5350009Z Wait for Jboss Management port ------------------------------------------ 0.47s
2026-11-27T15:12:00.5350225Z Wait for Jboss Management port ------------------------------------------ 0.34s
2026-11-27T15:12:00.5350403Z Playbook run took 0 days, 0 hours, 11 minutes, 31 seconds
2026-11-27T15:12:00.6088220Z ##[error]Bash exited with code '2'.
2026-11-27T15:12:00.6123693Z ##[section]Finishing: Check Deployments [JBOSS]





Last login: Wed Nov 25 17:11:06 2026 from 10.122.150.31
[p585600@caddeapllx2884 ~]$
[p585600@caddeapllx2884 ~]$
[p585600@caddeapllx2884 ~]$
[p585600@caddeapllx2884 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# ps -ef | grep jboss
root     1502497       1  0 12:06 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch -c standalone-full-ha.xml
jboss    1502500 1502497  0 12:06 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch -c standalone-full-ha.xml
jboss    1502674 1502500  7 12:06 ?        00:00:59 java -D[Standalone] -server -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -XX:+UseG1GC -XX:+ExplicitGCInvokesConcurrent -XX:MaxGCPauseMillis=500 -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch -c standalone-full-ha.xml
root     1510690 1510664  0 12:19 pts/2    00:00:00 grep --color=auto jboss
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]#
[root@caddeapllx2884 p585600]# cd /logs/jboss/jboss-eap/standalone/
[root@caddeapllx2884 standalone]# ls -la
total 4
drwxr-xr-x 3 jboss jboss   39 nov 17 11:08 .
drwxr-xr-x 3 jboss jboss   24 nov 17 11:08 ..
drwxr-xr-x 2 jboss jboss 4096 nov 27 12:06 sigec-portabilidade-batch
[root@caddeapllx2884 standalone]#
[root@caddeapllx2884 standalone]#
[root@caddeapllx2884 standalone]# cd /logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log
bash: cd: /logs/jboss/jboss-eap/standalone/sigec-portabilidade-batch/server.log: Não é um diretório
[root@caddeapllx2884 standalone]#
[root@caddeapllx2884 standalone]#
[root@caddeapllx2884 standalone]# tail -100f server.log
tail: não foi possível abrir 'server.log' para leitura: Arquivo ou diretório inexistente
tail: nenhum aquivo restante
[root@caddeapllx2884 standalone]#
