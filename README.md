-sh-4.2$ systemctl status jboss
Unit jboss.service could not be found.
-sh-4.2$ ps aux | grep jboss
root      21402  0.0  0.0 146424  1292 ?        S    13:48   0:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss/jboss-eap/bin/standalone.sh                -b 10.116.194.156                -bmanagement 10.116.194.156                -bprivate 10.116.194.156                                                -Dhttp.modcluster.proxy1=10.116.223.231                                 -Dhttp.modcluster.proxy2=10.116.223.232                                 -Djboss_modcluster_proxy_list="caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666"                -Djboss_modcluster_balancer=sigpd-backend                -Djboss.cluster.tcp.initial_hosts=10.116.194.156[7600]                -Djboss.node.name=caddeapllx929                -Djboss.tx.node.id=caddeapllx929                -u 230.0.0.4                                -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigpd-backend -c standalone-full-ha.xml
jboss     21405  0.0  0.0 113188  1324 ?        Ss   13:48   0:00 /bin/sh /opt/jboss/jboss-eap/bin/standalone.sh -b 10.116.194.156 -bmanagement 10.116.194.156 -bprivate 10.116.194.156 -Dhttp.modcluster.proxy1=10.116.223.231 -Dhttp.modcluster.proxy2=10.116.223.232 -Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666 -Djboss_modcluster_balancer=sigpd-backend -Djboss.cluster.tcp.initial_hosts=10.116.194.156[7600] -Djboss.node.name=caddeapllx929 -Djboss.tx.node.id=caddeapllx929 -u 230.0.0.4 -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigpd-backend -c standalone-full-ha.xml
jboss     21594  0.9 39.8 4253412 1539884 ?     Sl   13:48   2:35 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigpd-backend/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword= -Djboss.modules.policy-permissions=true -Djava.awt.headless=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/jboss/jboss-eap/standalone/deployments/applicationinsights-agent.jar -Dapplicationinsights.configuration.file=/opt/jboss/jboss-eap/standalone/configuration/applicationinsights.json -Dcom.ibm.msg.client.commonservices.log.outputName=/logs/jboss/jboss-eap/standalone/sigpd-backend/mqjms.log -Djava.net.useSystemProxies=false -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dhttps.protocols=[TLSv1.2,TLSv1.3] -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigpd-backend/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -b 10.116.194.156 -bmanagement 10.116.194.156 -bprivate 10.116.194.156 -Dhttp.modcluster.proxy1=10.116.223.231 -Dhttp.modcluster.proxy2=10.116.223.232 -Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666 -Djboss_modcluster_balancer=sigpd-backend -Djboss.cluster.tcp.initial_hosts=10.116.194.156[7600] -Djboss.node.name=caddeapllx929 -Djboss.tx.node.id=caddeapllx929 -u 230.0.0.4 -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigpd-backend -c standalone-full-ha.xml
p585600   57826  0.0  0.0 112736   968 pts/1    S+   18:36   0:00 grep --color=auto jboss
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ telnet caddeapllx135.extra.caixa.gov.br 6666telnet caddeapllx135.extra.caixa.gov.br 6666
Usage: telnet [-4] [-6] [-8] [-E] [-L] [-S tos] [-a] [-c] [-d] [-e char] [-l user]
        [-n tracefile] [-b hostalias ] [-r]
 [host-name [port]]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


essa release é do dia 01 ela nao deu problema:


2026-06-09T23:04:32.4073275Z ##[section]Starting: Deploy Config no JBOSS
2026-06-09T23:04:32.4076523Z ==============================================================================
2026-06-09T23:04:32.4076601Z Task         : Bash
2026-06-09T23:04:32.4076644Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-09T23:04:32.4076715Z Version      : 3.227.0
2026-06-09T23:04:32.4076757Z Author       : Microsoft Corporation
2026-06-09T23:04:32.4076883Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-09T23:04:32.4076962Z ==============================================================================
2026-06-09T23:04:33.3426998Z Generating script.
2026-06-09T23:04:33.3437876Z ========================== Starting Command Output ===========================
2026-06-09T23:04:33.3446650Z [command]/bin/bash /opt/ads-agent/_work/_temp/a4233b47-6e63-40c6-acaa-baa3a16da71d.sh
2026-06-09T23:04:33.3541032Z /opt/ads-agent/_work/_temp/a4233b47-6e63-40c6-acaa-baa3a16da71d.sh: line 2: site: comando não encontrado
2026-06-09T23:04:35.4256354Z 
2026-06-09T23:04:35.4256902Z PLAY [local] *******************************************************************
2026-06-09T23:04:35.4795749Z 
2026-06-09T23:04:35.4796259Z PLAY [Configurando o DNS] ******************************************************
2026-06-09T23:04:35.6448915Z 
2026-06-09T23:04:35.6449847Z PLAY [local] *******************************************************************
2026-06-09T23:04:35.6477793Z 
2026-06-09T23:04:35.6478505Z PLAY [Verificando serviços] ****************************************************
2026-06-09T23:04:35.6560199Z 
2026-06-09T23:04:35.6560751Z PLAY [Configuração LDAP] *******************************************************
2026-06-09T23:04:35.6626855Z 
2026-06-09T23:04:35.6627142Z PLAY [apache_des] **************************************************************
2026-06-09T23:04:35.6661986Z 
2026-06-09T23:04:35.6662271Z PLAY [jboss] *******************************************************************
2026-06-09T23:04:35.6727342Z Tuesday 09 June 2026  20:04:35 -0300 (0:00:00.329)       0:00:00.329 ********** 
2026-06-09T23:04:35.7192413Z Tuesday 09 June 2026  20:04:35 -0300 (0:00:00.045)       0:00:00.375 ********** 
2026-06-09T23:04:35.7622111Z Tuesday 09 June 2026  20:04:35 -0300 (0:00:00.043)       0:00:00.418 ********** 
2026-06-09T23:04:35.8058130Z Tuesday 09 June 2026  20:04:35 -0300 (0:00:00.043)       0:00:00.462 ********** 
2026-06-09T23:04:35.8532045Z 
2026-06-09T23:04:35.8532801Z PLAY [Instalando stack Jboss] **************************************************
2026-06-09T23:04:35.8653413Z Tuesday 09 June 2026  20:04:35 -0300 (0:00:00.059)       0:00:00.521 ********** 
2026-06-09T23:04:36.3574908Z 
2026-06-09T23:04:36.3576165Z TASK [Verificando o java versão esta instalado: 1.8.0_221] *********************
2026-06-09T23:04:36.3576408Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:36.3600592Z Tuesday 09 June 2026  20:04:36 -0300 (0:00:00.494)       0:00:01.016 ********** 
2026-06-09T23:04:36.8284013Z 
2026-06-09T23:04:36.8285109Z TASK [Verificando a versão do Java] ********************************************
2026-06-09T23:04:36.8285510Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:36.8323478Z Tuesday 09 June 2026  20:04:36 -0300 (0:00:00.472)       0:00:01.488 ********** 
2026-06-09T23:04:36.8886069Z Tuesday 09 June 2026  20:04:36 -0300 (0:00:00.056)       0:00:01.544 ********** 
2026-06-09T23:04:37.1369681Z 
2026-06-09T23:04:37.1370680Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-09T23:04:37.1370953Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:37.1407086Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.252)       0:00:01.797 ********** 
2026-06-09T23:04:37.2033046Z 
2026-06-09T23:04:37.2033740Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-09T23:04:37.2033955Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:37.2062431Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.065)       0:00:01.862 ********** 
2026-06-09T23:04:37.2522580Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.045)       0:00:01.908 ********** 
2026-06-09T23:04:37.2958395Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.043)       0:00:01.952 ********** 
2026-06-09T23:04:37.3401581Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.044)       0:00:01.996 ********** 
2026-06-09T23:04:37.3840317Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.043)       0:00:02.040 ********** 
2026-06-09T23:04:37.4312858Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.047)       0:00:02.087 ********** 
2026-06-09T23:04:37.4758915Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.044)       0:00:02.132 ********** 
2026-06-09T23:04:37.5221078Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.046)       0:00:02.178 ********** 
2026-06-09T23:04:37.5649879Z 
2026-06-09T23:04:37.5650698Z PLAY [jboss] *******************************************************************
2026-06-09T23:04:37.5689286Z Tuesday 09 June 2026  20:04:37 -0300 (0:00:00.046)       0:00:02.225 ********** 
2026-06-09T23:04:39.0478667Z 
2026-06-09T23:04:39.0479553Z TASK [Gathering Facts] *********************************************************
2026-06-09T23:04:39.0479780Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:39.0659683Z Tuesday 09 June 2026  20:04:39 -0300 (0:00:01.496)       0:00:03.722 ********** 
2026-06-09T23:04:40.0509549Z 
2026-06-09T23:04:40.0510139Z TASK [Gerando fatos de servicos] ***********************************************
2026-06-09T23:04:40.0510319Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:40.0832038Z Tuesday 09 June 2026  20:04:40 -0300 (0:00:01.017)       0:00:04.739 ********** 
2026-06-09T23:04:40.1475516Z 
2026-06-09T23:04:40.1476340Z TASK [Gerando lista de units jboss] ********************************************
2026-06-09T23:04:40.1476775Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:40.1748669Z Tuesday 09 June 2026  20:04:40 -0300 (0:00:00.091)       0:00:04.831 ********** 
2026-06-09T23:04:40.2410980Z Tuesday 09 June 2026  20:04:40 -0300 (0:00:00.066)       0:00:04.897 ********** 
2026-06-09T23:04:40.2547820Z 
2026-06-09T23:04:40.2548740Z PLAY [jboss] *******************************************************************
2026-06-09T23:04:40.2818990Z Tuesday 09 June 2026  20:04:40 -0300 (0:00:00.040)       0:00:04.938 ********** 
2026-06-09T23:04:40.3426823Z 
2026-06-09T23:04:40.3428175Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-09T23:04:40.3428669Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:40.3686489Z Tuesday 09 June 2026  20:04:40 -0300 (0:00:00.086)       0:00:05.024 ********** 
2026-06-09T23:04:41.1006256Z 
2026-06-09T23:04:41.1007021Z TASK [Copy template script] ****************************************************
2026-06-09T23:04:41.1007440Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:41.1270368Z Tuesday 09 June 2026  20:04:41 -0300 (0:00:00.758)       0:00:05.783 ********** 
2026-06-09T23:04:41.6703312Z 
2026-06-09T23:04:41.6704563Z TASK [JBoss systemd wrapper for sysvinit script mode domain] *******************
2026-06-09T23:04:41.6704861Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:41.6947916Z Tuesday 09 June 2026  20:04:41 -0300 (0:00:00.567)       0:00:06.350 ********** 
2026-06-09T23:04:42.4215672Z 
2026-06-09T23:04:42.4216555Z TASK [Realiza copia do arquivo de Trust Store] *********************************
2026-06-09T23:04:42.4216800Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:42.4466887Z Tuesday 09 June 2026  20:04:42 -0300 (0:00:00.751)       0:00:07.102 ********** 
2026-06-09T23:04:42.5260517Z Tuesday 09 June 2026  20:04:42 -0300 (0:00:00.079)       0:00:07.182 ********** 
2026-06-09T23:04:42.6045136Z Tuesday 09 June 2026  20:04:42 -0300 (0:00:00.078)       0:00:07.260 ********** 
2026-06-09T23:04:42.9795815Z 
2026-06-09T23:04:42.9796810Z TASK [Check directory configuration exists] ************************************
2026-06-09T23:04:42.9797003Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:43.0052900Z Tuesday 09 June 2026  20:04:43 -0300 (0:00:00.400)       0:00:07.661 ********** 
2026-06-09T23:04:48.3919785Z 
2026-06-09T23:04:48.3920646Z TASK [Copiando arquivos para jboss.server.config.dir] **************************
2026-06-09T23:04:48.3920894Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:48.4160244Z Tuesday 09 June 2026  20:04:48 -0300 (0:00:05.410)       0:00:13.072 ********** 
2026-06-09T23:04:48.9430173Z 
2026-06-09T23:04:48.9430850Z TASK [Copiando arquivo standalone-full-ha.xml] *********************************
2026-06-09T23:04:48.9431011Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:48.9689018Z Tuesday 09 June 2026  20:04:48 -0300 (0:00:00.552)       0:00:13.625 ********** 
2026-06-09T23:04:49.4948229Z 
2026-06-09T23:04:49.4949595Z TASK [Copiando arquivo standalone.conf] ****************************************
2026-06-09T23:04:49.4949800Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:49.5220136Z Tuesday 09 June 2026  20:04:49 -0300 (0:00:00.553)       0:00:14.178 ********** 
2026-06-09T23:04:49.6056093Z Tuesday 09 June 2026  20:04:49 -0300 (0:00:00.083)       0:00:14.261 ********** 
2026-06-09T23:04:49.6413019Z [WARNING]: conditional statements should not include jinja2 templating
2026-06-09T23:04:49.6413463Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-06-09T23:04:49.6413631Z default('false', true) | bool }}
2026-06-09T23:04:49.6511793Z 
2026-06-09T23:04:49.6512514Z PLAY [jboss] *******************************************************************
2026-06-09T23:04:49.6541593Z 
2026-06-09T23:04:49.6541919Z PLAY [local] *******************************************************************
2026-06-09T23:04:49.6565978Z 
2026-06-09T23:04:49.6566444Z PLAY [jboss] *******************************************************************
2026-06-09T23:04:49.6591688Z 
2026-06-09T23:04:49.6592110Z PLAY [jboss] *******************************************************************
2026-06-09T23:04:49.6624597Z 
2026-06-09T23:04:49.6625063Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-09T23:04:49.6885210Z Tuesday 09 June 2026  20:04:49 -0300 (0:00:00.082)       0:00:14.344 ********** 
2026-06-09T23:04:49.7457215Z 
2026-06-09T23:04:49.7457789Z TASK [Buscando diretorio de config] ********************************************
2026-06-09T23:04:49.7457959Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:49.7707035Z Tuesday 09 June 2026  20:04:49 -0300 (0:00:00.082)       0:00:14.427 ********** 
2026-06-09T23:04:49.8279672Z 
2026-06-09T23:04:49.8280209Z TASK [Buscando diretorio de config] ********************************************
2026-06-09T23:04:49.8280377Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:49.8546956Z Tuesday 09 June 2026  20:04:49 -0300 (0:00:00.084)       0:00:14.511 ********** 
2026-06-09T23:04:50.2139513Z 
2026-06-09T23:04:50.2140439Z TASK [Create a symbolic link] **************************************************
2026-06-09T23:04:50.2140643Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:50.2414419Z Tuesday 09 June 2026  20:04:50 -0300 (0:00:00.386)       0:00:14.897 ********** 
2026-06-09T23:04:50.5980083Z 
2026-06-09T23:04:50.5980947Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-09T23:04:50.5981146Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:50.6250177Z Tuesday 09 June 2026  20:04:50 -0300 (0:00:00.383)       0:00:15.281 ********** 
2026-06-09T23:04:51.1132487Z 
2026-06-09T23:04:51.1133278Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-06-09T23:04:51.1133921Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:51.1424335Z Tuesday 09 June 2026  20:04:51 -0300 (0:00:00.517)       0:00:15.798 ********** 
2026-06-09T23:04:51.1906855Z 
2026-06-09T23:04:51.1907413Z TASK [Teste] *******************************************************************
2026-06-09T23:04:51.1907869Z ok: [caddeapllx929.agil.nprd.caixa.gov.br] => (item={u'version': u'9.0.4.0', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'}) => {
2026-06-09T23:04:51.1908522Z     "msg": "Artefato: wmq.jmsra - versao 9.0.4.0"
2026-06-09T23:04:51.1909172Z }
2026-06-09T23:04:51.2224154Z ok: [caddeapllx929.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'}) => {
2026-06-09T23:04:51.2238973Z     "msg": "Artefato: applicationinsights-agent - versao 3.3.1"
2026-06-09T23:04:51.2239098Z }
2026-06-09T23:04:51.2524658Z Tuesday 09 June 2026  20:04:51 -0300 (0:00:00.109)       0:00:15.908 ********** 
2026-06-09T23:04:51.9372246Z 
2026-06-09T23:04:51.9372702Z TASK [maven_artifact] **********************************************************
2026-06-09T23:04:51.9373160Z changed: [caddeapllx929.agil.nprd.caixa.gov.br] => (item={u'version': u'9.0.4.0', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'})
2026-06-09T23:04:52.5273946Z changed: [caddeapllx929.agil.nprd.caixa.gov.br] => (item={u'version': u'3.3.1', u'group_id': u'com.microsoft.azure', u'extension': u'jar', u'artifact_id': u'applicationinsights-agent'})
2026-06-09T23:04:52.5543122Z Tuesday 09 June 2026  20:04:52 -0300 (0:00:01.302)       0:00:17.210 ********** 
2026-06-09T23:04:53.6732192Z 
2026-06-09T23:04:53.6732645Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-06-09T23:04:53.6732873Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:53.6990551Z Tuesday 09 June 2026  20:04:53 -0300 (0:00:01.144)       0:00:18.355 ********** 
2026-06-09T23:04:53.7446688Z 
2026-06-09T23:04:53.7447462Z PLAY [Copiando modules adicionais] *********************************************
2026-06-09T23:04:53.7712118Z Tuesday 09 June 2026  20:04:53 -0300 (0:00:00.072)       0:00:18.427 ********** 
2026-06-09T23:04:53.8271833Z 
2026-06-09T23:04:53.8272599Z TASK [Buscando diretorio de config] ********************************************
2026-06-09T23:04:53.8272991Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:53.8519265Z Tuesday 09 June 2026  20:04:53 -0300 (0:00:00.080)       0:00:18.508 ********** 
2026-06-09T23:04:53.9078273Z 
2026-06-09T23:04:53.9079337Z TASK [Buscando diretorio de config] ********************************************
2026-06-09T23:04:53.9079650Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:53.9364400Z Tuesday 09 June 2026  20:04:53 -0300 (0:00:00.084)       0:00:18.592 ********** 
2026-06-09T23:04:54.3360100Z 
2026-06-09T23:04:54.3361238Z TASK [Create a directory] ******************************************************
2026-06-09T23:04:54.3361405Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:54.3633419Z Tuesday 09 June 2026  20:04:54 -0300 (0:00:00.426)       0:00:19.019 ********** 
2026-06-09T23:04:54.7063808Z 
2026-06-09T23:04:54.7064597Z TASK [Verifica se o arquivo  existe] *******************************************
2026-06-09T23:04:54.7065006Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:54.7331162Z Tuesday 09 June 2026  20:04:54 -0300 (0:00:00.369)       0:00:19.389 ********** 
2026-06-09T23:04:54.8031963Z Tuesday 09 June 2026  20:04:54 -0300 (0:00:00.070)       0:00:19.459 ********** 
2026-06-09T23:04:54.8741855Z Tuesday 09 June 2026  20:04:54 -0300 (0:00:00.071)       0:00:19.530 ********** 
2026-06-09T23:04:54.9419029Z Tuesday 09 June 2026  20:04:54 -0300 (0:00:00.067)       0:00:19.598 ********** 
2026-06-09T23:04:55.0156126Z Tuesday 09 June 2026  20:04:55 -0300 (0:00:00.073)       0:00:19.671 ********** 
2026-06-09T23:04:55.0907628Z Tuesday 09 June 2026  20:04:55 -0300 (0:00:00.075)       0:00:19.747 ********** 
2026-06-09T23:04:55.1640519Z Tuesday 09 June 2026  20:04:55 -0300 (0:00:00.073)       0:00:19.820 ********** 
2026-06-09T23:04:55.2061969Z 
2026-06-09T23:04:55.2062449Z PLAY [local] *******************************************************************
2026-06-09T23:04:55.2093460Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-06-09T23:04:55.2096995Z 
2026-06-09T23:04:55.2097599Z PLAY [instance_restart] ********************************************************
2026-06-09T23:04:55.2097903Z skipping: no hosts matched
2026-06-09T23:04:55.2099941Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-06-09T23:04:55.2102842Z 
2026-06-09T23:04:55.2103107Z PLAY [machine_reboot] **********************************************************
2026-06-09T23:04:55.2103615Z skipping: no hosts matched
2026-06-09T23:04:55.2113675Z 
2026-06-09T23:04:55.2113954Z PLAY [local] *******************************************************************
2026-06-09T23:04:55.2141895Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-06-09T23:04:55.2146463Z 
2026-06-09T23:04:55.2146677Z PLAY [instance_stop] ***********************************************************
2026-06-09T23:04:55.2146904Z skipping: no hosts matched
2026-06-09T23:04:55.2154137Z 
2026-06-09T23:04:55.2154726Z PLAY [machine_reboot] **********************************************************
2026-06-09T23:04:55.2155147Z skipping: no hosts matched
2026-06-09T23:04:55.2162352Z 
2026-06-09T23:04:55.2162750Z PLAY [Configura TSM] ***********************************************************
2026-06-09T23:04:55.2190462Z 
2026-06-09T23:04:55.2191050Z PLAY [Configura Control-M] *****************************************************
2026-06-09T23:04:55.2232605Z 
2026-06-09T23:04:55.2233167Z PLAY RECAP *********************************************************************
2026-06-09T23:04:55.2233638Z caddeapllx929.agil.nprd.caixa.gov.br : ok=27   changed=4    unreachable=0    failed=0    skipped=27   rescued=0    ignored=0   
2026-06-09T23:04:55.2233782Z 
2026-06-09T23:04:55.2234101Z Tuesday 09 June 2026  20:04:55 -0300 (0:00:00.059)       0:00:19.879 ********** 
2026-06-09T23:04:55.2234282Z =============================================================================== 
2026-06-09T23:04:55.2237641Z Copiando arquivos para jboss.server.config.dir -------------------------- 5.41s
2026-06-09T23:04:55.2238204Z Gathering Facts --------------------------------------------------------- 1.50s
2026-06-09T23:04:55.2238539Z maven_artifact ---------------------------------------------------------- 1.30s
2026-06-09T23:04:55.2238770Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 1.14s
2026-06-09T23:04:55.2238996Z Gerando fatos de servicos ----------------------------------------------- 1.02s
2026-06-09T23:04:55.2239232Z Copy template script ---------------------------------------------------- 0.76s
2026-06-09T23:04:55.2239446Z Realiza copia do arquivo de Trust Store --------------------------------- 0.75s
2026-06-09T23:04:55.2239666Z JBoss systemd wrapper for sysvinit script mode domain ------------------- 0.57s
2026-06-09T23:04:55.2239883Z Copiando arquivo standalone.conf ---------------------------------------- 0.55s
2026-06-09T23:04:55.2240103Z Copiando arquivo standalone-full-ha.xml --------------------------------- 0.55s
2026-06-09T23:04:55.2240322Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.52s
2026-06-09T23:04:55.2240559Z Verificando o java versão esta instalado: 1.8.0_221 --------------------- 0.49s
2026-06-09T23:04:55.2240766Z Verificando a versão do Java -------------------------------------------- 0.47s
2026-06-09T23:04:55.2240979Z Create a directory ------------------------------------------------------ 0.43s
2026-06-09T23:04:55.2241194Z Check directory configuration exists ------------------------------------ 0.40s
2026-06-09T23:04:55.2241417Z Create a symbolic link -------------------------------------------------- 0.39s
2026-06-09T23:04:55.2241630Z Verifica se o arquivo  existe ------------------------------------------- 0.38s
2026-06-09T23:04:55.2241838Z Verifica se o arquivo  existe ------------------------------------------- 0.37s
2026-06-09T23:04:55.2242038Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.25s
2026-06-09T23:04:55.2242251Z Teste ------------------------------------------------------------------- 0.11s
2026-06-09T23:04:55.2242676Z Playbook run took 0 days, 0 hours, 0 minutes, 19 seconds
2026-06-09T23:04:55.2987131Z ##[section]Finishing: Deploy Config no JBOSS



2026-06-09T23:04:55.3005122Z ##[section]Starting: Deploy Pacote no JBOSS
2026-06-09T23:04:55.3008522Z ==============================================================================
2026-06-09T23:04:55.3008612Z Task         : Bash
2026-06-09T23:04:55.3008754Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-09T23:04:55.3008813Z Version      : 3.227.0
2026-06-09T23:04:55.3008869Z Author       : Microsoft Corporation
2026-06-09T23:04:55.3008916Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-09T23:04:55.3008985Z ==============================================================================
2026-06-09T23:04:56.0743454Z Generating script.
2026-06-09T23:04:56.0753405Z Script contents:
2026-06-09T23:04:56.0754540Z ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags deploy -e sistema_ambiente=des -e quantidade_vm=1 -e url_deploy="`echo "http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/sigpd-ear-1.9.0.1-20260609.225812-90.ear" | tr -d "\'"`" -e package_path=/opt/ads-agent/_work/r14099/a/binario/`basename http://binario.caixa:8081/repository/snapshots/br/gov/caixa/sigpd/sigpd-ear/1.9.0.1-SNAPSHOT/sigpd-ear-1.9.0.1-20260609.225812-90.ear` -e package_hash=$(HASH_BUILD) -e http_context_default=sigpd-api/v1/health-check/live -e site=$(site)
2026-06-09T23:04:56.0757552Z ========================== Starting Command Output ===========================
2026-06-09T23:04:56.0774861Z [command]/bin/bash /opt/ads-agent/_work/_temp/04cb795b-c60a-488e-a7d7-8841ec65446e.sh
2026-06-09T23:04:56.0861261Z /opt/ads-agent/_work/_temp/04cb795b-c60a-488e-a7d7-8841ec65446e.sh: line 1: HASH_BUILD: comando não encontrado
2026-06-09T23:04:56.0865773Z /opt/ads-agent/_work/_temp/04cb795b-c60a-488e-a7d7-8841ec65446e.sh: line 1: site: comando não encontrado
2026-06-09T23:04:58.1062169Z 
2026-06-09T23:04:58.1062674Z PLAY [local] *******************************************************************
2026-06-09T23:04:58.1587232Z 
2026-06-09T23:04:58.1588230Z PLAY [Configurando o DNS] ******************************************************
2026-06-09T23:04:58.3195712Z 
2026-06-09T23:04:58.3196152Z PLAY [local] *******************************************************************
2026-06-09T23:04:58.3225751Z 
2026-06-09T23:04:58.3226567Z PLAY [Verificando serviços] ****************************************************
2026-06-09T23:04:58.3307580Z 
2026-06-09T23:04:58.3308630Z PLAY [Configuração LDAP] *******************************************************
2026-06-09T23:04:58.3372006Z 
2026-06-09T23:04:58.3372810Z PLAY [apache_des] **************************************************************
2026-06-09T23:04:58.3407566Z 
2026-06-09T23:04:58.3408203Z PLAY [jboss] *******************************************************************
2026-06-09T23:04:58.3434675Z 
2026-06-09T23:04:58.3435076Z PLAY [Instalando stack Jboss] **************************************************
2026-06-09T23:04:58.3563377Z Tuesday 09 June 2026  20:04:58 -0300 (0:00:00.309)       0:00:00.309 ********** 
2026-06-09T23:04:58.8501592Z 
2026-06-09T23:04:58.8502593Z TASK [Verificando o java versão esta instalado: 1.8.0_221] *********************
2026-06-09T23:04:58.8502997Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:58.8526594Z Tuesday 09 June 2026  20:04:58 -0300 (0:00:00.496)       0:00:00.805 ********** 
2026-06-09T23:04:59.3211406Z 
2026-06-09T23:04:59.3212107Z TASK [Verificando a versão do Java] ********************************************
2026-06-09T23:04:59.3212264Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:59.3240731Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.471)       0:00:01.277 ********** 
2026-06-09T23:04:59.3798711Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.055)       0:00:01.332 ********** 
2026-06-09T23:04:59.6540798Z 
2026-06-09T23:04:59.6541912Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-09T23:04:59.6542139Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:59.6574914Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.277)       0:00:01.610 ********** 
2026-06-09T23:04:59.7200707Z 
2026-06-09T23:04:59.7201600Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-09T23:04:59.7202370Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:04:59.7234183Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.065)       0:00:01.676 ********** 
2026-06-09T23:04:59.7676736Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.044)       0:00:01.720 ********** 
2026-06-09T23:04:59.8205796Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.052)       0:00:01.773 ********** 
2026-06-09T23:04:59.8687076Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.045)       0:00:01.819 ********** 
2026-06-09T23:04:59.9190656Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.052)       0:00:01.872 ********** 
2026-06-09T23:04:59.9645430Z Tuesday 09 June 2026  20:04:59 -0300 (0:00:00.045)       0:00:01.917 ********** 
2026-06-09T23:05:00.0107433Z Tuesday 09 June 2026  20:05:00 -0300 (0:00:00.046)       0:00:01.963 ********** 
2026-06-09T23:05:00.0698734Z Tuesday 09 June 2026  20:05:00 -0300 (0:00:00.059)       0:00:02.022 ********** 
2026-06-09T23:05:00.1128895Z 
2026-06-09T23:05:00.1129679Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:00.1157982Z 
2026-06-09T23:05:00.1158655Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:00.1191145Z 
2026-06-09T23:05:00.1191667Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:00.1236369Z Tuesday 09 June 2026  20:05:00 -0300 (0:00:00.054)       0:00:02.076 ********** 
2026-06-09T23:05:01.6159588Z 
2026-06-09T23:05:01.6160176Z TASK [Gathering Facts] *********************************************************
2026-06-09T23:05:01.6160350Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:01.6335097Z Tuesday 09 June 2026  20:05:01 -0300 (0:00:01.509)       0:00:03.586 ********** 
2026-06-09T23:05:01.6949973Z 
2026-06-09T23:05:01.6951061Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-09T23:05:01.6951596Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:01.7074870Z Tuesday 09 June 2026  20:05:01 -0300 (0:00:00.073)       0:00:03.660 ********** 
2026-06-09T23:05:02.3021356Z 
2026-06-09T23:05:02.3022239Z TASK [Garante que o Jboss esteja startado] *************************************
2026-06-09T23:05:02.3022437Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:02.3244907Z Tuesday 09 June 2026  20:05:02 -0300 (0:00:00.616)       0:00:04.277 ********** 
2026-06-09T23:05:02.8769323Z 
2026-06-09T23:05:02.8770044Z TASK [Verifica o se package existe] ********************************************
2026-06-09T23:05:02.8770547Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:02.8920434Z Tuesday 09 June 2026  20:05:02 -0300 (0:00:00.567)       0:00:04.845 ********** 
2026-06-09T23:05:08.1716436Z 
2026-06-09T23:05:08.1717399Z TASK [Deploy do pacote Local] **************************************************
2026-06-09T23:05:08.1717794Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:08.1725208Z Tuesday 09 June 2026  20:05:08 -0300 (0:00:05.280)       0:00:10.125 ********** 
2026-06-09T23:05:20.6560532Z 
2026-06-09T23:05:20.6561162Z RUNNING HANDLER [Restart Jboss] ************************************************
2026-06-09T23:05:20.6561377Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:20.6591322Z 
2026-06-09T23:05:20.6591953Z PLAY [local] *******************************************************************
2026-06-09T23:05:20.6617278Z 
2026-06-09T23:05:20.6617701Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:20.6643865Z 
2026-06-09T23:05:20.6644314Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:20.6672439Z 
2026-06-09T23:05:20.6672902Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-09T23:05:20.6705790Z 
2026-06-09T23:05:20.6706866Z PLAY [Copiando modules adicionais] *********************************************
2026-06-09T23:05:20.6740286Z 
2026-06-09T23:05:20.6740749Z PLAY [local] *******************************************************************
2026-06-09T23:05:20.6768863Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-06-09T23:05:20.6770621Z 
2026-06-09T23:05:20.6770844Z PLAY [instance_restart] ********************************************************
2026-06-09T23:05:20.6770990Z skipping: no hosts matched
2026-06-09T23:05:20.6773592Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-06-09T23:05:20.6778997Z 
2026-06-09T23:05:20.6779269Z PLAY [machine_reboot] **********************************************************
2026-06-09T23:05:20.6779420Z skipping: no hosts matched
2026-06-09T23:05:20.6786460Z 
2026-06-09T23:05:20.6786639Z PLAY [local] *******************************************************************
2026-06-09T23:05:20.6813178Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-06-09T23:05:20.6815093Z 
2026-06-09T23:05:20.6815280Z PLAY [instance_stop] ***********************************************************
2026-06-09T23:05:20.6815439Z skipping: no hosts matched
2026-06-09T23:05:20.6818889Z 
2026-06-09T23:05:20.6819220Z PLAY [machine_reboot] **********************************************************
2026-06-09T23:05:20.6819369Z skipping: no hosts matched
2026-06-09T23:05:20.6828656Z 
2026-06-09T23:05:20.6828852Z PLAY [Configura TSM] ***********************************************************
2026-06-09T23:05:20.6859024Z 
2026-06-09T23:05:20.6859640Z PLAY [Configura Control-M] *****************************************************
2026-06-09T23:05:20.6883414Z 
2026-06-09T23:05:20.6886423Z PLAY RECAP *********************************************************************
2026-06-09T23:05:20.6886820Z caddeapllx929.agil.nprd.caixa.gov.br : ok=10   changed=3    unreachable=0    failed=0    skipped=9    rescued=0    ignored=0   
2026-06-09T23:05:20.6886925Z 
2026-06-09T23:05:20.6887277Z Tuesday 09 June 2026  20:05:20 -0300 (0:00:12.515)       0:00:22.641 ********** 
2026-06-09T23:05:20.6887449Z =============================================================================== 
2026-06-09T23:05:20.6887682Z Restart Jboss ---------------------------------------------------------- 12.52s
2026-06-09T23:05:20.6887909Z Deploy do pacote Local -------------------------------------------------- 5.28s
2026-06-09T23:05:20.6888272Z Gathering Facts --------------------------------------------------------- 1.51s
2026-06-09T23:05:20.6888600Z Garante que o Jboss esteja startado ------------------------------------- 0.62s
2026-06-09T23:05:20.6888823Z Verifica o se package existe -------------------------------------------- 0.57s
2026-06-09T23:05:20.6889053Z Verificando o java versão esta instalado: 1.8.0_221 --------------------- 0.50s
2026-06-09T23:05:20.6889266Z Verificando a versão do Java -------------------------------------------- 0.47s
2026-06-09T23:05:20.6889492Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.28s
2026-06-09T23:05:20.6889705Z Setando a versão do Jboss ----------------------------------------------- 0.07s
2026-06-09T23:05:20.6889920Z Setando a versão do Jboss ----------------------------------------------- 0.07s
2026-06-09T23:05:20.6890134Z jboss : Domain | Set service name --------------------------------------- 0.06s
2026-06-09T23:05:20.6890347Z java : include ---------------------------------------------------------- 0.06s
2026-06-09T23:05:20.6890550Z jboss : Copy template script -------------------------------------------- 0.05s
2026-06-09T23:05:20.6890846Z Determine variable jboss_domain_instance HC ----------------------------- 0.05s
2026-06-09T23:05:20.6891103Z jboss : Set file config to use domain.xml subsystem management ---------- 0.05s
2026-06-09T23:05:20.6891322Z jboss : Standalone | Set service name ----------------------------------- 0.05s
2026-06-09T23:05:20.6891538Z Determine variable jboss_domain_instance standalone --------------------- 0.05s
2026-06-09T23:05:20.6892031Z jboss : Update domain.xml to use LDAP ----------------------------------- 0.05s
2026-06-09T23:05:20.6892236Z Determine variable jboss_domain_instance DC ----------------------------- 0.04s
2026-06-09T23:05:20.6892491Z Playbook run took 0 days, 0 hours, 0 minutes, 22 seconds
2026-06-09T23:05:20.7568819Z ##[section]Finishing: Deploy Pacote no JBOSS



2026-06-09T23:05:20.7587044Z ##[section]Starting: Check Deployments [JBOSS]
2026-06-09T23:05:20.7590487Z ==============================================================================
2026-06-09T23:05:20.7590582Z Task         : Bash
2026-06-09T23:05:20.7590627Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-09T23:05:20.7590693Z Version      : 3.227.0
2026-06-09T23:05:20.7590749Z Author       : Microsoft Corporation
2026-06-09T23:05:20.7590798Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-09T23:05:20.7590867Z ==============================================================================
2026-06-09T23:05:21.5998862Z Generating script.
2026-06-09T23:05:21.6006663Z Script contents:
2026-06-09T23:05:21.6007231Z ansible-playbook /opt/ads-agent/esteira-jboss-vm/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigpd-backend -e site=$(site)
2026-06-09T23:05:21.6010016Z ========================== Starting Command Output ===========================
2026-06-09T23:05:21.6017658Z [command]/bin/bash /opt/ads-agent/_work/_temp/e6842646-5d4a-4078-bcdf-e06ec097b552.sh
2026-06-09T23:05:21.6073221Z /opt/ads-agent/_work/_temp/e6842646-5d4a-4078-bcdf-e06ec097b552.sh: line 1: site: comando não encontrado
2026-06-09T23:05:23.5833120Z 
2026-06-09T23:05:23.5833600Z PLAY [local] *******************************************************************
2026-06-09T23:05:23.6381244Z 
2026-06-09T23:05:23.6381976Z PLAY [Configurando o DNS] ******************************************************
2026-06-09T23:05:23.8019344Z 
2026-06-09T23:05:23.8019899Z PLAY [local] *******************************************************************
2026-06-09T23:05:23.8062501Z 
2026-06-09T23:05:23.8062942Z PLAY [Verificando serviços] ****************************************************
2026-06-09T23:05:23.8175954Z 
2026-06-09T23:05:23.8176462Z PLAY [Configuração LDAP] *******************************************************
2026-06-09T23:05:23.8239889Z 
2026-06-09T23:05:23.8240181Z PLAY [apache_des] **************************************************************
2026-06-09T23:05:23.8274222Z 
2026-06-09T23:05:23.8274470Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:23.8301277Z 
2026-06-09T23:05:23.8301893Z PLAY [Instalando stack Jboss] **************************************************
2026-06-09T23:05:23.8427989Z Tuesday 09 June 2026  20:05:23 -0300 (0:00:00.319)       0:00:00.319 ********** 
2026-06-09T23:05:24.3764454Z 
2026-06-09T23:05:24.3765168Z TASK [Verificando o java versão esta instalado: 1.8.0_221] *********************
2026-06-09T23:05:24.3765340Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:24.3800094Z Tuesday 09 June 2026  20:05:24 -0300 (0:00:00.537)       0:00:00.857 ********** 
2026-06-09T23:05:24.8343277Z 
2026-06-09T23:05:24.8344088Z TASK [Verificando a versão do Java] ********************************************
2026-06-09T23:05:24.8344255Z changed: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:24.8371878Z Tuesday 09 June 2026  20:05:24 -0300 (0:00:00.456)       0:00:01.314 ********** 
2026-06-09T23:05:24.8912546Z Tuesday 09 June 2026  20:05:24 -0300 (0:00:00.053)       0:00:01.368 ********** 
2026-06-09T23:05:25.1777233Z 
2026-06-09T23:05:25.1789809Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-06-09T23:05:25.1790220Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:25.1806641Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.289)       0:00:01.657 ********** 
2026-06-09T23:05:25.2436174Z 
2026-06-09T23:05:25.2437330Z TASK [Setando a versão do Jboss] ***********************************************
2026-06-09T23:05:25.2437537Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:25.2469369Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.066)       0:00:01.723 ********** 
2026-06-09T23:05:25.2906853Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.043)       0:00:01.767 ********** 
2026-06-09T23:05:25.3358203Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.045)       0:00:01.812 ********** 
2026-06-09T23:05:25.3798124Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.043)       0:00:01.856 ********** 
2026-06-09T23:05:25.4237707Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.043)       0:00:01.900 ********** 
2026-06-09T23:05:25.4684202Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.044)       0:00:01.945 ********** 
2026-06-09T23:05:25.5129562Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.044)       0:00:01.989 ********** 
2026-06-09T23:05:25.5575655Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.044)       0:00:02.034 ********** 
2026-06-09T23:05:25.6032287Z 
2026-06-09T23:05:25.6033112Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:25.6062042Z 
2026-06-09T23:05:25.6062500Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:25.6101471Z 
2026-06-09T23:05:25.6101992Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:25.6126050Z 
2026-06-09T23:05:25.6126307Z PLAY [local] *******************************************************************
2026-06-09T23:05:25.6152216Z 
2026-06-09T23:05:25.6152580Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:25.6178589Z 
2026-06-09T23:05:25.6178979Z PLAY [jboss] *******************************************************************
2026-06-09T23:05:25.6223237Z Tuesday 09 June 2026  20:05:25 -0300 (0:00:00.064)       0:00:02.099 ********** 
2026-06-09T23:05:52.0642906Z 
2026-06-09T23:05:52.0643951Z TASK [Wait for Jboss Management port] ******************************************
2026-06-09T23:05:52.0644297Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:05:52.0652897Z Tuesday 09 June 2026  20:05:52 -0300 (0:00:26.442)       0:00:28.542 ********** 
2026-06-09T23:05:53.7080561Z FAILED - RETRYING: Check if Jboss is Running (18 retries left).
2026-06-09T23:05:59.4481042Z FAILED - RETRYING: Check if Jboss is Running (17 retries left).
2026-06-09T23:06:05.0448986Z FAILED - RETRYING: Check if Jboss is Running (16 retries left).
2026-06-09T23:06:10.4057155Z 
2026-06-09T23:06:10.4058219Z TASK [Check if Jboss is Running] ***********************************************
2026-06-09T23:06:10.4058623Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:06:10.4092094Z Tuesday 09 June 2026  20:06:10 -0300 (0:00:18.343)       0:00:46.886 ********** 
2026-06-09T23:06:10.7830271Z 
2026-06-09T23:06:10.7830762Z TASK [Check Deployment details looking for status OK] **************************
2026-06-09T23:06:10.7830921Z ok: [caddeapllx929.agil.nprd.caixa.gov.br]
2026-06-09T23:06:10.7865095Z 
2026-06-09T23:06:10.7865432Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-09T23:06:10.7901251Z 
2026-06-09T23:06:10.7901532Z PLAY [Copiando modules adicionais] *********************************************
2026-06-09T23:06:10.7931061Z 
2026-06-09T23:06:10.7931338Z PLAY [local] *******************************************************************
2026-06-09T23:06:10.7962578Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-06-09T23:06:10.7965780Z 
2026-06-09T23:06:10.7965936Z PLAY [instance_restart] ********************************************************
2026-06-09T23:06:10.7966072Z skipping: no hosts matched
2026-06-09T23:06:10.7969328Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-06-09T23:06:10.7972129Z 
2026-06-09T23:06:10.7972331Z PLAY [machine_reboot] **********************************************************
2026-06-09T23:06:10.7972479Z skipping: no hosts matched
2026-06-09T23:06:10.7978811Z 
2026-06-09T23:06:10.7979027Z PLAY [local] *******************************************************************
2026-06-09T23:06:10.8004813Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-06-09T23:06:10.8007246Z 
2026-06-09T23:06:10.8011119Z PLAY [instance_stop] ***********************************************************
2026-06-09T23:06:10.8011326Z skipping: no hosts matched
2026-06-09T23:06:10.8011784Z 
2026-06-09T23:06:10.8012035Z PLAY [machine_reboot] **********************************************************
2026-06-09T23:06:10.8012188Z skipping: no hosts matched
2026-06-09T23:06:10.8018045Z 
2026-06-09T23:06:10.8018469Z PLAY [Configura TSM] ***********************************************************
2026-06-09T23:06:10.8049074Z 
2026-06-09T23:06:10.8049927Z PLAY [Configura Control-M] *****************************************************
2026-06-09T23:06:10.8069440Z 
2026-06-09T23:06:10.8070073Z PLAY RECAP *********************************************************************
2026-06-09T23:06:10.8070606Z caddeapllx929.agil.nprd.caixa.gov.br : ok=7    changed=1    unreachable=0    failed=0    skipped=9    rescued=0    ignored=0   
2026-06-09T23:06:10.8070718Z 
2026-06-09T23:06:10.8073817Z Tuesday 09 June 2026  20:06:10 -0300 (0:00:00.397)       0:00:47.284 ********** 
2026-06-09T23:06:10.8074082Z =============================================================================== 
2026-06-09T23:06:10.8074347Z Wait for Jboss Management port ----------------------------------------- 26.44s
2026-06-09T23:06:10.8074810Z Check if Jboss is Running ---------------------------------------------- 18.34s
2026-06-09T23:06:10.8075699Z Verificando o java versão esta instalado: 1.8.0_221 --------------------- 0.54s
2026-06-09T23:06:10.8075984Z Verificando a versão do Java -------------------------------------------- 0.46s
2026-06-09T23:06:10.8076197Z Check Deployment details looking for status OK -------------------------- 0.40s
2026-06-09T23:06:10.8076418Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.29s
2026-06-09T23:06:10.8076635Z Setando a versão do Jboss ----------------------------------------------- 0.07s
2026-06-09T23:06:10.8076863Z jboss : Copy template script -------------------------------------------- 0.06s
2026-06-09T23:06:10.8077078Z java : include ---------------------------------------------------------- 0.05s
2026-06-09T23:06:10.8077301Z Determine variable jboss_domain_instance HC ----------------------------- 0.05s
2026-06-09T23:06:10.8077507Z jboss : Standalone | Set service name ----------------------------------- 0.04s
2026-06-09T23:06:10.8077755Z jboss : Update domain.xml to use LDAP ----------------------------------- 0.04s
2026-06-09T23:06:10.8077981Z jboss : Domain | Set service name --------------------------------------- 0.04s
2026-06-09T23:06:10.8078195Z Determine variable jboss_domain_instance standalone --------------------- 0.04s
2026-06-09T23:06:10.8078565Z jboss : Set file config to use domain.xml subsystem management ---------- 0.04s
2026-06-09T23:06:10.8078823Z Determine variable jboss_domain_instance DC ----------------------------- 0.04s
2026-06-09T23:06:10.8078964Z Playbook run took 0 days, 0 hours, 0 minutes, 47 seconds
2026-06-09T23:06:10.8731324Z ##[section]Finishing: Check Deployments [JBOSS]


2026-06-09T23:06:11.6876115Z ##[section]Starting: Resumo da release
2026-06-09T23:06:11.6879218Z ==============================================================================
2026-06-09T23:06:11.6879295Z Task         : Bash
2026-06-09T23:06:11.6879338Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-09T23:06:11.6879409Z Version      : 3.227.0
2026-06-09T23:06:11.6879451Z Author       : Microsoft Corporation
2026-06-09T23:06:11.6879501Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-09T23:06:11.6879577Z ==============================================================================
2026-06-09T23:06:12.4724977Z Generating script.
2026-06-09T23:06:12.4736125Z ========================== Starting Command Output ===========================
2026-06-09T23:06:12.4742463Z [command]/bin/bash /opt/ads-agent/_work/_temp/6519ecb5-d5aa-4801-a2b6-de9193e3ce8f.sh
2026-06-09T23:06:12.4835394Z Foi realizado o deploy do pacote sigpd-ear-1.9.0.1-20260609.225812-90.ear no ambiente DES
2026-06-09T23:06:12.4836909Z APP Publicada nas URL: 
2026-06-09T23:06:12.4837293Z   - http://sigpd-backend.esteiras.des.caixa/
2026-06-09T23:06:12.4837945Z   - http://sigpd-backend.esteiras.des.caixa/sigpd-api/v1/health-check/live
2026-06-09T23:06:12.4878987Z   % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
2026-06-09T23:06:12.4879325Z                                  Dload  Upload   Total   Spent    Left  Speed
2026-06-09T23:06:12.4879581Z 
2026-06-09T23:06:13.4945482Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-09T23:06:14.4960742Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-09T23:06:15.4888652Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-09T23:06:15.4890484Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-09T23:06:15.4890729Z Warning: Transient problem: timeout Will retry in 1 seconds. 5 retries left.
2026-06-09T23:06:16.4902302Z 
2026-06-09T23:06:17.4925783Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-09T23:06:18.4936592Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-09T23:06:19.4915158Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-09T23:06:19.4915499Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-09T23:06:19.4915670Z Warning: Transient problem: timeout Will retry in 2 seconds. 4 retries left.
2026-06-09T23:06:21.4934401Z 
2026-06-09T23:06:22.4953536Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-09T23:06:23.4965009Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-09T23:06:24.4947529Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-09T23:06:24.4948649Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-09T23:06:24.4949395Z Warning: Transient problem: timeout Will retry in 4 seconds. 3 retries left.
2026-06-09T23:06:28.4983953Z 
2026-06-09T23:06:29.5007855Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-09T23:06:30.5019793Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-09T23:06:31.4999174Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-09T23:06:31.4999758Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-09T23:06:31.4999927Z Warning: Transient problem: timeout Will retry in 8 seconds. 2 retries left.
2026-06-09T23:06:39.5082383Z 
2026-06-09T23:06:40.5105677Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-09T23:06:41.5116299Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-09T23:06:42.5099030Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-09T23:06:42.5099845Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-09T23:06:42.5100082Z Warning: Transient problem: timeout Will retry in 16 seconds. 1 retries left.
2026-06-09T23:06:58.5147543Z 
2026-06-09T23:06:59.5163290Z   0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
2026-06-09T23:07:00.5175413Z   0     0    0     0    0     0      0      0 --:--:--  0:00:01 --:--:--     0
2026-06-09T23:07:01.5158024Z   0     0    0     0    0     0      0      0 --:--:--  0:00:02 --:--:--     0
2026-06-09T23:07:01.5158488Z   0     0    0     0    0     0      0      0 --:--:--  0:00:03 --:--:--     0
2026-06-09T23:07:01.5158651Z curl: (28) Connection timed out after 3001 milliseconds
2026-06-09T23:07:01.5189838Z Ocorreu um erro ao atualizar a url da aplicação na API InfraDevops
2026-06-09T23:07:01.5190093Z 000
2026-06-09T23:07:01.5244352Z ##[section]Finishing: Resumo da release




as varaiveis estgavama ssim:


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
/
SIGPD-backend-1290
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIGPD-backend

SIGPD-backend-1290


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Usuario-Azure-DevOps (10)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
ANSIBLE_JBOSS_VM_V2 (6)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
Compartilhamentos (4)
Scopes: Release
SIGPD-BACKEND-DES (80)
Grupo de variáveis de Desenvolvimento
Scopes: EC DES
AMBIENTE
des
APPLICATIONINSIGHTS_CONNECTION_STRING
InstrumentationKey=1db83fd9-8b2f-4a25-89d8-8cf25fa9321a;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_ROLE_NAME
SIGPD-DES
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
DB_OCI_CONNECTION_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad01ng
DB_OCI_DRIVER
oracle
DB_OCI_DRIVER_CLASS
oracle.jdbc.OracleDriver
DB_OCI_JNDI_NAME
java:/jdbc/OracleSigpdDS
DB_OCI_MODULE
com.oracle.ojdbc6
DB_OCI_PASSWORD
${VAULT::SIGPD::DB_OCI_PASSWORD::1}
DB_OCI_POOL_NAME
jdbc/OracleSigpdDS
DB_OCI_USER_NAME
SGPDBD02
DEBUG
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
DEVOPS_TEST
OK
ENVIRONMENT
DES
GPD_SSO_CLIENT_SECRET
${VAULT::SIGPD::GPD_SSO_CLIENT_SECRET::1}
HOSTNAME_FILAMQ
10.116.95.99
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
JVM_PATH_TRUSTSTORE
/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
MQ_FILA_BASE_QUEUE_ENTRIES
SIGPD.REQ.SRVCO_LOG
MQ_FILA_BASE_QUEUE_NAME
SIGPD.REQ.SRVCO_LOG
MQ_FILA_CHANNEL
SIGPD.SVRCONN
MQ_FILA_HOSTNAME
10.116.95.99
MQ_FILA_PASSWORD
${VAULT::SIGPD::MQ_FILA_PASSWORD::1}
MQ_FILA_PORT
1414
MQ_FILA_QUEUE_MANAGER
XMQD1
MQ_FILA_TARGET_CLIENT
MQ
MQ_FILA_USERNAME
SGPDDB01
NFS_ENDPOINT_VM
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGPD_DES
NFS_MOUNT_POINT_VM
/sigpd
SIAPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIAPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIAPD_WEB_API_V1_BASEURL
https://siapd2.esteiras.des.caixa/siapd-api/v1/
SIAPD_WEB_API_V2_BASEURL
https://siapd2.esteiras.des.caixa/siapd-api/v2/
SICLI_WEB_API_V1_BASEURL
https://api.des.caixa:8443/cadastro/v1/
SICLI_WEB_API_V2_BASEURL
http://api.des.caixa:8080/cadastro/v2/
SIGPD_APIKEY
${VAULT::SIGPD::SIGPD_APIKEY::1}
SIGPD_LOTE_PROCESSAMENTO_BASEDIR
/SIGPD_LOTE_PROCESSAMENTO/
SIGPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIGPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIICO_PRIVADO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-privadas/v1/
SIICO_PUBLICO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-publicas/v1/
SMTP_HOST
smtptest.correiolivre.caixa
SMTP_PASS
${VAULT::SIGPD::SMTP_PASS::1}
SMTP_PORT
25
SMTP_USR
sgpdbd01
SSO_AUTH_URL_INTERNET
https://logindes.caixa.gov.br/auth
SSO_AUTH_URL_INTRANET
https://login.des.caixa/auth
SSO_BASE_URL_INTERNET
https://logindes.caixa.gov.br
SSO_BASE_URL_INTRANET
https://login.des.caixa
SSO_BEARER_ONLY_INTERNET
TRUE
SSO_BEARER_ONLY_INTRANET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTERNET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTRANET
TRUE
SSO_PUBLIC_CLIENT_INTERNET
TRUE
SSO_PUBLIC_CLIENT_INTRANET
TRUE
SSO_REALM_NAME_INTERNET
internet
SSO_REALM_NAME_INTRANET
intranet
SSO_RESOURCE_NAME_INTERNET
${VAULT::SIGPD::SSO_RESOURCE_NAME_INTERNET::1}
SSO_RESOURCE_NAME_INTRANET
${VAULT::SIGPD::SSO_RESOURCE_NAME_INTRANET::1}
SSO_SECRET_INTERNET
${VAULT::SIGPD::SSO_SECRET_INTERNET::1}
SSO_SECRET_INTRANET
${VAULT::SIGPD::SSO_SECRET_INTRANET::1}
SSO_SECURE_DEPLOYMENT_NAME
sigpd-api.war
SSO_TYPE_OF_SSL_REQUIRED_INTERNET
EXTERNAL
SSO_TYPE_OF_SSL_REQUIRED_INTRANET
EXTERNAL
SSO_WEB_API_TOKEN_SERVICE_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
SSO_WEB_API_TOKEN_SERVICE_INTRANET
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
URL_PROXY
proxydes.caixa
VAULT_ENC_FILE_DIR
/opt/jboss/jboss-eap/modules/security/
VAULT_ITERATION_COUNT
33
VAULT_KEYSTORE_ALIAS
jboss
VAULT_KEYSTORE_PASSWORD
MASK-2mSDTeSjJwj.t3Ogt9K0li
VAULT_KEYSTORE_URL
/opt/jboss/jboss-eap/modules/security/vaultcaixa.keystore
VAULT_SALT
F3d3r4d0
SIGPD-BACKEND-TQS (80)
Grupo de variáveis de Desenvolvimento
Scopes: EC TQS
SIGPD-BACKEND-HMP (42)
Grupo de variáveis de Homologação
Scopes: EC HMP
SIGPD-BACKEND-PRD (73)
Grupo de variáveis de Produção
Scopes: EC PRD
Row 2

Row 3

Row 2

Row 7

Row 18

Showing filters 1 through 2


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
/
SIGPD-backend-1290
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIGPD-backend

SIGPD-backend-1290


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Filter by keywords
Release (+1)


BUILD_VERSION
$(Build.BuildNumber)
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
http_context_additional
http_context_default
sigpd-api/v1/health-check/live
http_sso
no
quantidade_vm
1
sistema_ambiente
des
sistema_nome
sigpd-backend
TemplateRelease
RHEL-7.7-v01_JBoss-7.1-v01
URL_APM_SERVER
https://apm-server-devops.produtos.caixa
URL_DEPLOY
nexus.com
USE_WMQ
no
VERSAO
$(Build.BuildNumber)
Row 2

Row 3

Row 2

Row 7

Row 18

Showing filters 1 through 2

Showing filters 1 through 2


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
/
SIGPD-backend-1290
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIGPD-backend

SIGPD-backend-1290


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Filter by keywords
Release (+1)


BUILD_VERSION
$(Build.BuildNumber)
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
http_context_additional
http_context_default
sigpd-api/v1/health-check/live
http_sso
no
quantidade_vm
1
sistema_ambiente
des
sistema_nome
sigpd-backend
TemplateRelease
RHEL-7.7-v01_JBoss-7.1-v01
URL_APM_SERVER
https://apm-server-devops.produtos.caixa
URL_DEPLOY
nexus.com
USE_WMQ
no
VERSAO
$(Build.BuildNumber)
Row 2

Row 3

Row 2

Row 7

Row 18

Showing filters 1 through 2

Showing filters 1 through 2



atualamente ta assim:

Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
/
SIGPD-backend-1306
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIGPD-backend

SIGPD-backend-1306


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Filter by keywords
Release (+1)


BUILD_VERSION
$(Build.BuildNumber)
CGC_UNIDADE_DES
7390
CGC_UNIDADE_OPS
7259
http_context_additional
http_context_default
sigpd-api/v1/health-check/live
http_sso
no
quantidade_vm
1
sistema_ambiente
des
sistema_nome
sigpd-backend
TemplateRelease
RHEL-7.7-v01_JBoss-7.1-v01
URL_APM_SERVER
https://apm-server-devops.produtos.caixa
URL_DEPLOY
nexus.com
USE_WMQ
no
VERSAO
$(Build.BuildNumber)
Row 2

Row 3

Row 2

Row 7

Row 18

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

Showing filters 1 through 2




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIGPD-backend
/
SIGPD-backend-1306
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
SIGPD-backend

SIGPD-backend-1306


EC DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Predefined variables
Usuario-Azure-DevOps (10)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
ANSIBLE_JBOSS_VM_V2 (6)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
Compartilhamentos (4)
Scopes: Release
SIGPD-BACKEND-DES (80)
Grupo de variáveis de Desenvolvimento
Scopes: EC DES
AMBIENTE
des
APPLICATIONINSIGHTS_CONNECTION_STRING
InstrumentationKey=1db83fd9-8b2f-4a25-89d8-8cf25fa9321a;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
APPLICATIONINSIGHTS_ROLE_NAME
SIGPD-DES
APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
DB_OCI_CONNECTION_URL
jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad01ng
DB_OCI_DRIVER
oracle
DB_OCI_DRIVER_CLASS
oracle.jdbc.OracleDriver
DB_OCI_JNDI_NAME
java:/jdbc/OracleSigpdDS
DB_OCI_MODULE
com.oracle.ojdbc6
DB_OCI_PASSWORD
${VAULT::SIGPD::DB_OCI_PASSWORD::1}
DB_OCI_POOL_NAME
jdbc/OracleSigpdDS
DB_OCI_USER_NAME
SGPDBD02
DEBUG
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
DEVOPS_TEST
OK
ENVIRONMENT
DES
GPD_SSO_CLIENT_SECRET
${VAULT::SIGPD::GPD_SSO_CLIENT_SECRET::1}
HOSTNAME_FILAMQ
10.116.95.99
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
96m
JVM_PASSWORD_TRUSTSTORE
${VAULT::SIGPD::JVM_PASSWORD_TRUSTSTORE::1}
JVM_PATH_TRUSTSTORE
/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
JVM_PROXY_HOST
proxydes.caixa
JVM_PROXY_PORT
80
MQ_FILA_BASE_QUEUE_ENTRIES
SIGPD.REQ.SRVCO_LOG
MQ_FILA_BASE_QUEUE_NAME
SIGPD.REQ.SRVCO_LOG
MQ_FILA_CHANNEL
SIGPD.SVRCONN
MQ_FILA_HOSTNAME
10.116.95.99
MQ_FILA_PASSWORD
${VAULT::SIGPD::MQ_FILA_PASSWORD::1}
MQ_FILA_PORT
1414
MQ_FILA_QUEUE_MANAGER
XMQD1
MQ_FILA_TARGET_CLIENT
MQ
MQ_FILA_USERNAME
SGPDDB01
NFS_ENDPOINT_VM
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIGPD_DES
NFS_MOUNT_POINT_VM
/sigpd
SIAPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIAPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIAPD_WEB_API_V1_BASEURL
https://siapd2.esteiras.des.caixa/siapd-api/v1/
SIAPD_WEB_API_V2_BASEURL
https://siapd2.esteiras.des.caixa/siapd-api/v2/
SICLI_WEB_API_V1_BASEURL
https://api.des.caixa:8443/cadastro/v1/
SICLI_WEB_API_V2_BASEURL
http://api.des.caixa:8080/cadastro/v2/
SIGPD_APIKEY
${VAULT::SIGPD::SIGPD_APIKEY::1}
SIGPD_LOTE_PROCESSAMENTO_BASEDIR
/SIGPD_LOTE_PROCESSAMENTO/
SIGPD_ROTINAS_OPERACIONAIS_APIKEY
${VAULT::SIGPD::SIGPD_ROTINAS_OPERACIONAIS_APIKEY::1}
SIICO_PRIVADO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-privadas/v1/
SIICO_PUBLICO_WEB_API_V1_BASEURL
https://api.des.caixa:8443/informacoes-corporativas-publicas/v1/
SMTP_HOST
smtptest.correiolivre.caixa
SMTP_PASS
${VAULT::SIGPD::SMTP_PASS::1}
SMTP_PORT
25
SMTP_USR
sgpdbd01
SSO_AUTH_URL_INTERNET
https://logindes.caixa.gov.br/auth
SSO_AUTH_URL_INTRANET
https://login.des.caixa/auth
SSO_BASE_URL_INTERNET
https://logindes.caixa.gov.br
SSO_BASE_URL_INTRANET
https://login.des.caixa
SSO_BEARER_ONLY_INTERNET
TRUE
SSO_BEARER_ONLY_INTRANET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTERNET
TRUE
SSO_DISABLE_TRUST_MANAGER_INTRANET
TRUE
SSO_PUBLIC_CLIENT_INTERNET
TRUE
SSO_PUBLIC_CLIENT_INTRANET
TRUE
SSO_REALM_NAME_INTERNET
internet
SSO_REALM_NAME_INTRANET
intranet
SSO_RESOURCE_NAME_INTERNET
${VAULT::SIGPD::SSO_RESOURCE_NAME_INTERNET::1}
SSO_RESOURCE_NAME_INTRANET
${VAULT::SIGPD::SSO_RESOURCE_NAME_INTRANET::1}
SSO_SECRET_INTERNET
${VAULT::SIGPD::SSO_SECRET_INTERNET::1}
SSO_SECRET_INTRANET
${VAULT::SIGPD::SSO_SECRET_INTRANET::1}
SSO_SECURE_DEPLOYMENT_NAME
sigpd-api.war
SSO_TYPE_OF_SSL_REQUIRED_INTERNET
EXTERNAL
SSO_TYPE_OF_SSL_REQUIRED_INTRANET
EXTERNAL
SSO_WEB_API_TOKEN_SERVICE_INTERNET
https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/token
SSO_WEB_API_TOKEN_SERVICE_INTRANET
https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
URL_PROXY
proxydes.caixa
VAULT_ENC_FILE_DIR
/opt/jboss/jboss-eap/modules/security/
VAULT_ITERATION_COUNT
33
VAULT_KEYSTORE_ALIAS
jboss
VAULT_KEYSTORE_PASSWORD
MASK-2mSDTeSjJwj.t3Ogt9K0li
VAULT_KEYSTORE_URL
/opt/jboss/jboss-eap/modules/security/vaultcaixa.keystore
VAULT_SALT
F3d3r4d0
SIGPD-BACKEND-TQS (80)
Grupo de variáveis de Desenvolvimento
Scopes: EC TQS
SIGPD-BACKEND-HMP (42)
Grupo de variáveis de Homologação
Scopes: EC HMP
SIGPD-BACKEND-PRD (73)
Grupo de variáveis de Produção
Scopes: EC PRD
Row 2

Row 3

Row 2

Row 7

Row 18

Showing filters 1 through 2

Showing filters 1 through 2

Showing filters 1 through 2

Row 2

Showing filters 1 through 2



não vi mudança na esteria para que possa dar esse erro voce consegue ver alguma diferença?
