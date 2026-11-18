2026-11-18T13:13:43.3395243Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-18T13:13:43.3398355Z ==============================================================================
2026-11-18T13:13:43.3398442Z Task         : Bash
2026-11-18T13:13:43.3398482Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-18T13:13:43.3398552Z Version      : 3.227.0
2026-11-18T13:13:43.3398593Z Author       : Microsoft Corporation
2026-11-18T13:13:43.3398642Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-18T13:13:43.3398710Z ==============================================================================
2026-11-18T13:13:43.4719526Z Generating script.
2026-11-18T13:13:43.4727865Z Script contents:
2026-11-18T13:13:43.4728347Z ansible-playbook /opt/ads-agent/_work/r19645/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigec-portabilidade -e site=ctc_nprd
2026-11-18T13:13:43.4731035Z ========================== Starting Command Output ===========================
2026-11-18T13:13:43.4745596Z [command]/bin/bash /opt/ads-agent/_work/_temp/855d5ef2-73a6-439e-babc-2c938a65c48a.sh
2026-11-18T13:13:45.7396042Z 
2026-11-18T13:13:45.7396495Z PLAY [local] *******************************************************************
2026-11-18T13:13:45.7680017Z 
2026-11-18T13:13:45.7680487Z PLAY [Configurando o DNS] ******************************************************
2026-11-18T13:13:46.0075914Z 
2026-11-18T13:13:46.0076504Z PLAY [local] *******************************************************************
2026-11-18T13:13:46.0111496Z 
2026-11-18T13:13:46.0112031Z PLAY [Verificando serviços] ****************************************************
2026-11-18T13:13:46.0208565Z 
2026-11-18T13:13:46.0209426Z PLAY [Configuração LDAP] *******************************************************
2026-11-18T13:13:46.0254562Z [WARNING]: Found variable using reserved name: when
2026-11-18T13:13:46.0258906Z 
2026-11-18T13:13:46.0259391Z PLAY [jboss] *******************************************************************
2026-11-18T13:13:46.0655479Z 
2026-11-18T13:13:46.0655974Z PLAY [Stack Jboss] *************************************************************
2026-11-18T13:13:46.0890153Z Wednesday 18 November 2026  10:13:46 -0300 (0:00:00.415)       0:00:00.415 **** 
2026-11-18T13:13:46.9973434Z 
2026-11-18T13:13:46.9974180Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-18T13:13:46.9976726Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-18T13:13:46.9976960Z caddeapllx2871.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-18T13:13:46.9977127Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-18T13:13:46.9977571Z releases. A future Ansible release will default to using the discovered 
2026-11-18T13:13:46.9977744Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-18T13:13:46.9977905Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-18T13:13:46.9978065Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-18T13:13:46.9978203Z setting deprecation_warnings=False in ansible.cfg.
2026-11-18T13:13:46.9978339Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-18T13:13:47.0005880Z 
2026-11-18T13:13:47.0006049Z PLAY [jboss] *******************************************************************
2026-11-18T13:13:47.0059957Z 
2026-11-18T13:13:47.0060338Z PLAY [jboss] *******************************************************************
2026-11-18T13:13:47.0104496Z 
2026-11-18T13:13:47.0104678Z PLAY [jboss] *******************************************************************
2026-11-18T13:13:47.0128514Z 
2026-11-18T13:13:47.0128685Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-18T13:13:47.0156998Z 
2026-11-18T13:13:47.0157408Z PLAY [Copiando modules adicionais] *********************************************
2026-11-18T13:13:47.0183116Z 
2026-11-18T13:13:47.0183540Z PLAY [jboss] *******************************************************************
2026-11-18T13:13:47.0220602Z 
2026-11-18T13:13:47.0220764Z PLAY [jboss] *******************************************************************
2026-11-18T13:13:47.0252106Z 
2026-11-18T13:13:47.0252556Z PLAY [jboss] *******************************************************************
2026-11-18T13:13:47.0300420Z Wednesday 18 November 2026  10:13:47 -0300 (0:00:00.941)       0:00:01.356 **** 
2026-11-18T13:13:47.4548575Z 
2026-11-18T13:13:47.4549102Z TASK [Wait for Jboss Management port] ******************************************
2026-11-18T13:13:47.4549259Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-18T13:13:47.4587423Z Wednesday 18 November 2026  10:13:47 -0300 (0:00:00.428)       0:00:01.785 **** 
2026-11-18T13:13:48.5018805Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-18T13:13:53.9792473Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-11-18T13:13:59.5406591Z FAILED - RETRYING: Check if Jboss is Running (118 retries left).
2026-11-18T13:14:05.1824942Z 
2026-11-18T13:14:05.1825735Z TASK [Check if Jboss is Running] ***********************************************
2026-11-18T13:14:05.1825973Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-18T13:14:05.1860494Z Wednesday 18 November 2026  10:14:05 -0300 (0:00:17.727)       0:00:19.512 **** 
2026-11-18T13:14:05.7378042Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-18T13:14:11.2384544Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-18T13:14:16.7244528Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-18T13:14:22.1525572Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-18T13:14:27.5718559Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-18T13:14:32.9743202Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-18T13:14:38.3873879Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-18T13:14:43.8005710Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-18T13:14:49.2070212Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-18T13:14:54.6216805Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-18T13:15:00.0306136Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-18T13:15:05.4475942Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-18T13:15:10.8686825Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-18T13:15:16.2844287Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-18T13:15:21.7036952Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-18T13:15:27.1233085Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-18T13:15:32.5294405Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-18T13:15:37.9313932Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-18T13:15:43.3533829Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-18T13:15:48.7623805Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-18T13:15:54.1719683Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-18T13:15:59.5875552Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-18T13:16:04.9941782Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-18T13:16:10.4138801Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-18T13:16:15.8874495Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-18T13:16:21.2939941Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-18T13:16:26.6951993Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-18T13:16:32.1212091Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-18T13:16:37.5350179Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-18T13:16:42.9382554Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-18T13:16:48.3536924Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-18T13:16:53.7541865Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-18T13:16:59.1532253Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-18T13:17:04.5879364Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-18T13:17:10.0001124Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-18T13:17:15.4056481Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-18T13:17:20.8306266Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-18T13:17:26.2397894Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-18T13:17:31.6549324Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-18T13:17:37.0896114Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-18T13:17:42.5462530Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-18T13:17:47.9442604Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-18T13:17:53.3982832Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-18T13:17:58.8062689Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-18T13:18:04.2128734Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-18T13:18:09.6446489Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-18T13:18:15.0568605Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-18T13:18:20.4702556Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-18T13:18:25.8841956Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-18T13:18:31.2878272Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-18T13:18:36.7074457Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-18T13:18:42.1430181Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-18T13:18:47.5502050Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-18T13:18:52.9599469Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-18T13:18:58.3958684Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-18T13:19:03.8103241Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-18T13:19:09.2196936Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-18T13:19:14.6296011Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-18T13:19:20.0296546Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-18T13:19:25.4334230Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-18T13:19:30.8622927Z 
2026-11-18T13:19:30.8623572Z TASK [Check Deployment details looking for status OK] **************************
2026-11-18T13:19:30.8639982Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007621603, \"enabled-timestamp\" : \"2026-11-18 10:13:41,603 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007621605, \"enabled-timestamp\" : \"2026-11-18 10:13:41,605 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vWUKMXuRF/LJTLkFSvnwWgFNs/U=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007621588, \"enabled-timestamp\" : \"2026-11-18 10:13:41,588 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-web.war\" : null, \"gec-api.war\" : null}, \"subsystem\" : {\"jpa\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007621636, \"enabled-timestamp\" : \"2026-11-18 10:13:41,636 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2167", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Wed, 18 Nov 2026 13:19:30 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007621603, "enabled-timestamp": "2026-11-18 10:13:41,603 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007621605, "enabled-timestamp": "2026-11-18 10:13:41,605 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "vWUKMXuRF/LJTLkFSvnwWgFNs/U="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007621588, "enabled-timestamp": "2026-11-18 10:13:41,588 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-ejb.jar": null, "gec-web.war": null}, "subsystem": {"jpa": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007621636, "enabled-timestamp": "2026-11-18 10:13:41,636 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2167 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.61:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-18T13:19:30.8672657Z Wednesday 18 November 2026  10:19:30 -0300 (0:05:25.681)       0:05:45.193 **** 
2026-11-18T13:19:43.7495448Z 
2026-11-18T13:19:43.7495997Z TASK [systemd] *****************************************************************
2026-11-18T13:19:43.7496287Z changed: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-18T13:19:43.7539369Z Wednesday 18 November 2026  10:19:43 -0300 (0:00:12.886)       0:05:58.080 **** 
2026-11-18T13:19:44.0948319Z 
2026-11-18T13:19:44.0949197Z TASK [Wait for Jboss Management port] ******************************************
2026-11-18T13:19:44.0949501Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-18T13:19:44.0986635Z Wednesday 18 November 2026  10:19:44 -0300 (0:00:00.344)       0:05:58.425 **** 
2026-11-18T13:19:44.8336478Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-11-18T13:19:50.3438788Z FAILED - RETRYING: Check if Jboss is Running (119 retries left).
2026-11-18T13:19:55.8621754Z FAILED - RETRYING: Check if Jboss is Running (118 retries left).
2026-11-18T13:20:01.3974966Z FAILED - RETRYING: Check if Jboss is Running (117 retries left).
2026-11-18T13:20:06.9703986Z 
2026-11-18T13:20:06.9704801Z TASK [Check if Jboss is Running] ***********************************************
2026-11-18T13:20:06.9705453Z ok: [caddeapllx2871.agil.nprd.caixa.gov.br]
2026-11-18T13:20:06.9741997Z Wednesday 18 November 2026  10:20:06 -0300 (0:00:22.875)       0:06:21.300 **** 
2026-11-18T13:20:07.4754305Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-11-18T13:20:13.0313547Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-11-18T13:20:18.7754238Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-11-18T13:20:24.2118727Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-11-18T13:20:29.6158954Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-11-18T13:20:35.0247106Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-11-18T13:20:40.4512889Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-11-18T13:20:45.8601928Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-11-18T13:20:51.2639245Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-11-18T13:20:56.6879228Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-11-18T13:21:02.0994614Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-11-18T13:21:07.5083262Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-11-18T13:21:12.9271797Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-11-18T13:21:18.3321832Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-11-18T13:21:23.7533772Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-11-18T13:21:29.1797307Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-11-18T13:21:34.5833773Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-11-18T13:21:39.9916923Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-11-18T13:21:45.4157430Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-11-18T13:21:50.8188128Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-11-18T13:21:56.2341899Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-11-18T13:22:01.7566695Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-11-18T13:22:07.1607126Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-11-18T13:22:12.5634883Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-11-18T13:22:17.9748137Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-11-18T13:22:23.3792237Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-11-18T13:22:28.7818093Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-11-18T13:22:34.1998468Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-11-18T13:22:39.6020503Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-11-18T13:22:45.0135295Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-11-18T13:22:50.4180582Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-11-18T13:22:55.8227148Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-11-18T13:23:01.2322115Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-11-18T13:23:06.6524691Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-11-18T13:23:12.0707608Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-11-18T13:23:17.4743539Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-11-18T13:23:22.8897240Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-11-18T13:23:28.2940384Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-11-18T13:23:33.7101223Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-11-18T13:23:39.1467513Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-11-18T13:23:44.5545851Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-11-18T13:23:49.9604097Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-11-18T13:23:55.3928716Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-11-18T13:24:00.8127586Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-11-18T13:24:06.2232482Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-11-18T13:24:11.6551368Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-11-18T13:24:17.0593716Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-11-18T13:24:22.4822469Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-11-18T13:24:27.8929194Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-11-18T13:24:33.3064403Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-11-18T13:24:38.7166049Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-11-18T13:24:44.1427184Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-11-18T13:24:49.5491828Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-11-18T13:24:54.9678409Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-11-18T13:25:00.3983301Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-11-18T13:25:05.8083528Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-11-18T13:25:11.2139539Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-11-18T13:25:16.6294288Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-11-18T13:25:22.0341761Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-11-18T13:25:27.4588551Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-11-18T13:25:32.8701743Z 
2026-11-18T13:25:32.8702244Z TASK [Check Deployment details looking for status OK] **************************
2026-11-18T13:25:32.8717226Z fatal: [caddeapllx2871.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vuKkYCoel4WZTF3fgsMVP2THD8c=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007981925, \"enabled-timestamp\" : \"2026-11-18 10:19:41,925 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"framework_sisgd.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"Z9UlzW70terHffMDKn6c/WSO9Ck=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007981927, \"enabled-timestamp\" : \"2026-11-18 10:19:41,927 BRT\", \"managed\" : true, \"name\" : \"framework_sisgd.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework_sisgd.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"gec-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"vWUKMXuRF/LJTLkFSvnwWgFNs/U=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007981909, \"enabled-timestamp\" : \"2026-11-18 10:19:41,909 BRT\", \"managed\" : true, \"name\" : \"gec-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"gec-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"gec-ejb.jar\" : null, \"gec-web.war\" : null, \"gec-api.war\" : null}, \"subsystem\" : {\"jpa\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1795007981955, \"enabled-timestamp\" : \"2026-11-18 10:19:41,955 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2167", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Wed, 18 Nov 2026 13:25:32 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"framework.jar": {"content": [{"hash": {"BYTES_VALUE": "vuKkYCoel4WZTF3fgsMVP2THD8c="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007981925, "enabled-timestamp": "2026-11-18 10:19:41,925 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "framework_sisgd.jar": {"content": [{"hash": {"BYTES_VALUE": "Z9UlzW70terHffMDKn6c/WSO9Ck="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007981927, "enabled-timestamp": "2026-11-18 10:19:41,927 BRT", "managed": true, "name": "framework_sisgd.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework_sisgd.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "gec-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "vWUKMXuRF/LJTLkFSvnwWgFNs/U="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007981909, "enabled-timestamp": "2026-11-18 10:19:41,909 BRT", "managed": true, "name": "gec-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "gec-ear.ear", "status": "FAILED", "subdeployment": {"gec-api.war": null, "gec-ejb.jar": null, "gec-web.war": null}, "subsystem": {"jpa": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1795007981955, "enabled-timestamp": "2026-11-18 10:19:41,955 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2167 bytes)", "redirected": false, "status": 200, "url": "http://10.116.202.61:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-11-18T13:25:32.8734555Z 
2026-11-18T13:25:32.8734709Z PLAY RECAP *********************************************************************
2026-11-18T13:25:32.8737234Z caddeapllx2871.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-11-18T13:25:32.8737658Z 
2026-11-18T13:25:32.8738167Z Wednesday 18 November 2026  10:25:32 -0300 (0:05:25.899)       0:11:47.200 **** 
2026-11-18T13:25:32.8738356Z =============================================================================== 
2026-11-18T13:25:32.8739126Z Check Deployment details looking for status OK ------------------------ 325.90s
2026-11-18T13:25:32.8739402Z Check Deployment details looking for status OK ------------------------ 325.68s
2026-11-18T13:25:32.8739618Z Check if Jboss is Running ---------------------------------------------- 22.88s
2026-11-18T13:25:32.8739835Z Check if Jboss is Running ---------------------------------------------- 17.73s
2026-11-18T13:25:32.8740035Z systemd ---------------------------------------------------------------- 12.89s
2026-11-18T13:25:32.8740263Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.94s
2026-11-18T13:25:32.8741393Z Wait for Jboss Management port ------------------------------------------ 0.43s
2026-11-18T13:25:32.8741658Z Wait for Jboss Management port ------------------------------------------ 0.34s
2026-11-18T13:25:32.8741807Z Playbook run took 0 days, 0 hours, 11 minutes, 47 seconds
2026-11-18T13:25:32.9317141Z ##[error]Bash exited with code '2'.
2026-11-18T13:25:32.9352648Z ##[section]Finishing: Check Deployments [JBOSS]
