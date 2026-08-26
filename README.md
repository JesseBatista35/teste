2026-08-26T12:44:55.6367943Z ##[section]Starting: Check Deployments [JBOSS]
2026-08-26T12:44:55.6370667Z ==============================================================================
2026-08-26T12:44:55.6370763Z Task         : Bash
2026-08-26T12:44:55.6370807Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-26T12:44:55.6370868Z Version      : 3.227.0
2026-08-26T12:44:55.6370921Z Author       : Microsoft Corporation
2026-08-26T12:44:55.6370972Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-26T12:44:55.6371045Z ==============================================================================
2026-08-26T12:44:56.3380152Z Generating script.
2026-08-26T12:44:56.3388583Z Script contents:
2026-08-26T12:44:56.3389237Z ansible-playbook /opt/ads-agent/_work/r3750/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sicmu-intranet-update -e site=ctc_nprd
2026-08-26T12:44:56.3394508Z ========================== Starting Command Output ===========================
2026-08-26T12:44:56.3402428Z [command]/bin/bash /opt/ads-agent/_work/_temp/289acbe5-7d61-433d-b030-43a99592aa30.sh
2026-08-26T12:44:58.2854067Z 
2026-08-26T12:44:58.2854610Z PLAY [local] *******************************************************************
2026-08-26T12:44:58.3115518Z 
2026-08-26T12:44:58.3115987Z PLAY [Configurando o DNS] ******************************************************
2026-08-26T12:44:58.4700823Z 
2026-08-26T12:44:58.4701751Z PLAY [local] *******************************************************************
2026-08-26T12:44:58.4736905Z 
2026-08-26T12:44:58.4737809Z PLAY [Verificando serviços] ****************************************************
2026-08-26T12:44:58.4826539Z 
2026-08-26T12:44:58.4826997Z PLAY [Configuração LDAP] *******************************************************
2026-08-26T12:44:58.4859408Z [WARNING]: Found variable using reserved name: when
2026-08-26T12:44:58.4863769Z 
2026-08-26T12:44:58.4864461Z PLAY [jboss] *******************************************************************
2026-08-26T12:44:58.4947961Z 
2026-08-26T12:44:58.4948775Z PLAY [Stack Jboss] *************************************************************
2026-08-26T12:44:58.5182181Z Wednesday 26 August 2026  09:44:58 -0300 (0:00:00.291)       0:00:00.291 ****** 
2026-08-26T12:44:59.1772184Z 
2026-08-26T12:44:59.1773236Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-26T12:44:59.1773648Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-26T12:44:59.1797185Z 
2026-08-26T12:44:59.1797858Z PLAY [jboss] *******************************************************************
2026-08-26T12:44:59.1840861Z 
2026-08-26T12:44:59.1841228Z PLAY [jboss] *******************************************************************
2026-08-26T12:44:59.1894164Z 
2026-08-26T12:44:59.1894566Z PLAY [jboss] *******************************************************************
2026-08-26T12:44:59.1917424Z 
2026-08-26T12:44:59.1917733Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-26T12:44:59.1944914Z 
2026-08-26T12:44:59.1945117Z PLAY [Copiando modules adicionais] *********************************************
2026-08-26T12:44:59.1971827Z 
2026-08-26T12:44:59.1972385Z PLAY [jboss] *******************************************************************
2026-08-26T12:44:59.2005340Z 
2026-08-26T12:44:59.2005760Z PLAY [jboss] *******************************************************************
2026-08-26T12:44:59.2030275Z 
2026-08-26T12:44:59.2030628Z PLAY [jboss] *******************************************************************
2026-08-26T12:44:59.2071410Z Wednesday 26 August 2026  09:44:59 -0300 (0:00:00.689)       0:00:00.981 ****** 
2026-08-26T12:44:59.6438891Z 
2026-08-26T12:44:59.6439452Z TASK [Wait for Jboss Management port] ******************************************
2026-08-26T12:44:59.6439633Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-26T12:44:59.6467438Z Wednesday 26 August 2026  09:44:59 -0300 (0:00:00.439)       0:00:01.420 ****** 
2026-08-26T12:45:00.2635362Z 
2026-08-26T12:45:00.2636011Z TASK [Check if Jboss is Running] ***********************************************
2026-08-26T12:45:00.2636296Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-26T12:45:00.2665653Z Wednesday 26 August 2026  09:45:00 -0300 (0:00:00.619)       0:00:02.040 ****** 
2026-08-26T12:45:00.6706375Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-08-26T12:45:06.0069855Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-08-26T12:45:11.3468525Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-08-26T12:45:16.6832475Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-08-26T12:45:22.0362884Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-08-26T12:45:27.3762606Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-08-26T12:45:32.7394008Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-08-26T12:45:38.0766473Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-08-26T12:45:43.4187807Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-08-26T12:45:48.7615766Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-08-26T12:45:54.1055660Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-08-26T12:45:59.4421414Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-08-26T12:46:04.8166524Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-08-26T12:46:10.1636308Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-08-26T12:46:15.4974925Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-08-26T12:46:20.8398702Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-08-26T12:46:26.1758554Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-08-26T12:46:31.5009615Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-08-26T12:46:36.8405796Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-08-26T12:46:42.1876730Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-08-26T12:46:47.5232334Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-08-26T12:46:52.8566418Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-08-26T12:46:58.1958783Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-08-26T12:47:03.5633704Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-08-26T12:47:08.8841438Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-08-26T12:47:14.2199827Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-08-26T12:47:19.5486863Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-08-26T12:47:24.8766012Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-08-26T12:47:30.2265190Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-08-26T12:47:35.5598794Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-08-26T12:47:40.8973011Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-08-26T12:47:46.2220979Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-08-26T12:47:51.5510841Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-08-26T12:47:56.8869856Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-08-26T12:48:02.2497177Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-08-26T12:48:07.5747394Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-08-26T12:48:12.9014401Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-08-26T12:48:18.2319364Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-08-26T12:48:23.5689063Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-08-26T12:48:28.9060279Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-08-26T12:48:34.2662188Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-08-26T12:48:39.6211799Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-08-26T12:48:44.9492088Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-08-26T12:48:50.2696483Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-08-26T12:48:55.5978157Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-08-26T12:49:00.9445842Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-08-26T12:49:06.3023245Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-08-26T12:49:11.6286257Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-08-26T12:49:16.9541822Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-08-26T12:49:22.2920145Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-08-26T12:49:27.6329894Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-08-26T12:49:32.9723213Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-08-26T12:49:38.3227648Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-08-26T12:49:43.6602917Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-08-26T12:49:48.9993751Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-08-26T12:49:54.3430614Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-08-26T12:49:59.6796919Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-08-26T12:50:05.0237549Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-08-26T12:50:10.3596910Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-08-26T12:50:15.6871557Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-08-26T12:50:21.0294733Z 
2026-08-26T12:50:21.0295341Z TASK [Check Deployment details looking for status OK] **************************
2026-08-26T12:50:21.0312967Z fatal: [caddeapllx2484.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"SICMU-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"aPNc7NpR8gRh+fYbN77Mgnx4rko=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1787748291959, \"enabled-timestamp\" : \"2026-08-26 09:44:51,959 BRT\", \"managed\" : true, \"name\" : \"SICMU-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"SICMU-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"SICMU-web.war\" : null, \"SICMU-ejb.jar\" : null}, \"subsystem\" : null}, \"applicationinsights-agent.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"iqsIwVxO/dCj+3G2mrUuZNq78as=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1787748292202, \"enabled-timestamp\" : \"2026-08-26 09:44:52,202 BRT\", \"managed\" : true, \"name\" : \"applicationinsights-agent.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"applicationinsights-agent.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}, \"framework.jar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"MAMr7yGDXfOSD7TPIBw4G5Rg2iQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1787748292022, \"enabled-timestamp\" : \"2026-08-26 09:44:52,022 BRT\", \"managed\" : true, \"name\" : \"framework.jar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"framework.jar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"ejb3\" : null, \"logging\" : null}}, \"wmq.jmsra.rar\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"5302NdAsJml1JkN8WaVfW5qaIe4=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1787748292020, \"enabled-timestamp\" : \"2026-08-26 09:44:52,020 BRT\", \"managed\" : true, \"name\" : \"wmq.jmsra.rar\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"wmq.jmsra.rar\", \"status\" : \"OK\", \"subdeployment\" : null, \"subsystem\" : {\"logging\" : null}}}}", "content_encoding": "identity", "content_length": "2157", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Wed, 26 Aug 2026 12:50:20 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"SICMU-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "aPNc7NpR8gRh+fYbN77Mgnx4rko="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1787748291959, "enabled-timestamp": "2026-08-26 09:44:51,959 BRT", "managed": true, "name": "SICMU-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "SICMU-ear.ear", "status": "FAILED", "subdeployment": {"SICMU-ejb.jar": null, "SICMU-web.war": null}, "subsystem": null}, "applicationinsights-agent.jar": {"content": [{"hash": {"BYTES_VALUE": "iqsIwVxO/dCj+3G2mrUuZNq78as="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1787748292202, "enabled-timestamp": "2026-08-26 09:44:52,202 BRT", "managed": true, "name": "applicationinsights-agent.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "applicationinsights-agent.jar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}, "framework.jar": {"content": [{"hash": {"BYTES_VALUE": "MAMr7yGDXfOSD7TPIBw4G5Rg2iQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1787748292022, "enabled-timestamp": "2026-08-26 09:44:52,022 BRT", "managed": true, "name": "framework.jar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "framework.jar", "status": "OK", "subdeployment": null, "subsystem": {"ejb3": null, "logging": null}}, "wmq.jmsra.rar": {"content": [{"hash": {"BYTES_VALUE": "5302NdAsJml1JkN8WaVfW5qaIe4="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1787748292020, "enabled-timestamp": "2026-08-26 09:44:52,020 BRT", "managed": true, "name": "wmq.jmsra.rar", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "wmq.jmsra.rar", "status": "OK", "subdeployment": null, "subsystem": {"logging": null}}}}, "msg": "OK (2157 bytes)", "redirected": false, "status": 200, "url": "http://10.116.200.228:9990/management/", "x_frame_options": "SAMEORIGIN"}
2026-08-26T12:50:21.0347458Z Wednesday 26 August 2026  09:50:21 -0300 (0:05:20.768)       0:05:22.808 ****** 
2026-08-26T12:50:28.8995437Z 
2026-08-26T12:50:28.8996093Z TASK [systemd] *****************************************************************
2026-08-26T12:50:28.8996396Z changed: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-26T12:50:28.9028802Z Wednesday 26 August 2026  09:50:28 -0300 (0:00:07.866)       0:05:30.675 ****** 
2026-08-26T12:50:29.3036471Z 
2026-08-26T12:50:29.3037143Z TASK [Wait for Jboss Management port] ******************************************
2026-08-26T12:50:29.3037455Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-26T12:50:29.3065443Z Wednesday 26 August 2026  09:50:29 -0300 (0:00:00.404)       0:05:31.080 ****** 
2026-08-26T12:50:37.6351311Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-08-26T12:50:49.9847337Z 
2026-08-26T12:50:49.9848194Z TASK [Check if Jboss is Running] ***********************************************
2026-08-26T12:50:49.9848452Z ok: [caddeapllx2484.agil.nprd.caixa.gov.br]
2026-08-26T12:50:49.9875201Z Wednesday 26 August 2026  09:50:49 -0300 (0:00:20.681)       0:05:51.761 ****** 
2026-08-26T12:50:50.4102730Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-08-26T12:50:55.7492759Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-08-26T12:51:01.0946165Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-08-26T12:51:06.4990393Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-08-26T12:51:11.8295609Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-08-26T12:51:19.2419340Z 
2026-08-26T12:51:19.2419851Z TASK [Check Deployment details looking for status OK] **************************
2026-08-26T12:51:19.2420409Z fatal: [caddeapllx2484.agil.nprd.caixa.gov.br]: FAILED! => {"msg": "The conditional check ''FAILED' not in is_ok.json | json_query(query)' failed. The error was: Error in jmespath.search in json_query filter plugin:\n'dict object' has no attribute 'json'"}
2026-08-26T12:51:19.2426053Z 
2026-08-26T12:51:19.2426495Z PLAY RECAP *********************************************************************
2026-08-26T12:51:19.2426780Z caddeapllx2484.agil.nprd.caixa.gov.br : ok=6    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-08-26T12:51:19.2426933Z 
2026-08-26T12:51:19.2429044Z Wednesday 26 August 2026  09:51:19 -0300 (0:00:29.255)       0:06:21.016 ****** 
2026-08-26T12:51:19.2429444Z =============================================================================== 
2026-08-26T12:51:19.2430009Z Check Deployment details looking for status OK ------------------------ 320.77s
2026-08-26T12:51:19.2430349Z Check Deployment details looking for status OK ------------------------- 29.26s
2026-08-26T12:51:19.2430651Z Check if Jboss is Running ---------------------------------------------- 20.68s
2026-08-26T12:51:19.2431342Z systemd ----------------------------------------------------------------- 7.87s
2026-08-26T12:51:19.2431630Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.69s
2026-08-26T12:51:19.2432195Z Check if Jboss is Running ----------------------------------------------- 0.62s
2026-08-26T12:51:19.2432425Z Wait for Jboss Management port ------------------------------------------ 0.44s
2026-08-26T12:51:19.2432646Z Wait for Jboss Management port ------------------------------------------ 0.40s
2026-08-26T12:51:19.2432803Z Playbook run took 0 days, 0 hours, 6 minutes, 20 seconds
2026-08-26T12:51:19.3017854Z ##[error]Bash exited with code '2'.
2026-08-26T12:51:19.3044164Z ##[section]Finishing: Check Deployments [JBOSS]


deploy falhou



**[root@caddeapllx2484 verificacao_sicmu2]# ps -ef | grep java | grep -v grep
jboss    23678 23542 24 09:50 ?        00:00:20 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
[root@caddeapllx2484 verificacao_sicmu2]# systemctl status jboss-eap-standalone.service
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
   Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; vendor preset: disabled)
   Active: active (running) since Qua 2026-08-26 09:50:28 -03; 1min 21s ago
  Process: 23465 ExecStop=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh stop (code=exited, status=0/SUCCESS)
  Process: 23524 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
 Main PID: 23539 (runuser)
    Tasks: 90
   Memory: 1.1G
   CGroup: /system.slice/jboss-eap-standalone.service
           ├─23539 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -...
           ├─23542 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-...
           └─23678 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRo...

Ago 26 09:50:22 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Stopped JBoss EAP Systemctl - STANDALONE.
Ago 26 09:50:22 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
Ago 26 09:50:22 caddeapllx2484.agil.nprd.caixa.gov.br runuser[23529]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 26 09:50:22 caddeapllx2484.agil.nprd.caixa.gov.br runuser[23529]: pam_unix(runuser:session): session closed for user jboss
Ago 26 09:50:22 caddeapllx2484.agil.nprd.caixa.gov.br runuser[23534]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 26 09:50:22 caddeapllx2484.agil.nprd.caixa.gov.br runuser[23539]: pam_unix(runuser:session): session opened for user jboss by (uid=0)
Ago 26 09:50:28 caddeapllx2484.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
Ago 26 09:50:28 caddeapllx2484.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[23524]: Starting JBoss EAP: [  OK  ]
[root@caddeapllx2484 verificacao_sicmu2]# ps -ef | grep java
jboss    23678 23542 21 09:50 ?        00:00:20 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
root     24623  5354  0 09:52 pts/1    00:00:00 grep --color=auto java
[root@caddeapllx2484 verificacao_sicmu2]#
**
