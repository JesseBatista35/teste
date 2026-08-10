Ação: Verificar a execução de releases no projeto siacc-tela-branca estão falhando. No log não é apresentado nada.

2026-08-10T10:40:53.1768377Z ##[section]Starting: Check Deployments [JBOSS]
2026-08-10T10:40:53.1771289Z ==============================================================================
2026-08-10T10:40:53.1771368Z Task         : Bash
2026-08-10T10:40:53.1771411Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-10T10:40:53.1771483Z Version      : 3.227.0
2026-08-10T10:40:53.1771525Z Author       : Microsoft Corporation
2026-08-10T10:40:53.1771576Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-10T10:40:53.1771655Z ==============================================================================
2026-08-10T10:40:53.3124870Z Generating script.
2026-08-10T10:40:53.3132782Z Script contents:
2026-08-10T10:40:53.3133330Z ansible-playbook /opt/ads-agent/_work/r945/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=siacc-tela-branca -e site=ctc_nprd
2026-08-10T10:40:53.3136894Z ========================== Starting Command Output ===========================
2026-08-10T10:40:53.3143764Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a65baa09-079f-42ce-9082-7c6c73f34de7.sh
2026-08-10T10:40:53.5946879Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-08-10T10:40:53.5947118Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-08-10T10:40:53.5947561Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-08-10T10:40:53.5947712Z setting deprecation_warnings=False in ansible.cfg.
2026-08-10T10:40:54.2572326Z [WARNING]: Found variable using reserved name: when
2026-08-10T10:40:54.2843802Z 
2026-08-10T10:40:54.2844243Z PLAY [local] *******************************************************************
2026-08-10T10:40:54.2844332Z 
2026-08-10T10:40:54.2844457Z PLAY [Configurando o DNS] ******************************************************
2026-08-10T10:40:54.2844534Z 
2026-08-10T10:40:54.2844660Z PLAY [local] *******************************************************************
2026-08-10T10:40:54.2844833Z 
2026-08-10T10:40:54.2845251Z PLAY [Verificando serviços] ****************************************************
2026-08-10T10:40:54.2845326Z 
2026-08-10T10:40:54.2845510Z PLAY [Configuração LDAP] *******************************************************
2026-08-10T10:40:54.2845582Z 
2026-08-10T10:40:54.2845702Z PLAY [jboss] *******************************************************************
2026-08-10T10:40:54.2845769Z 
2026-08-10T10:40:54.2845891Z PLAY [Stack Jboss] *************************************************************
2026-08-10T10:40:54.2846151Z Monday 10 August 2026  07:40:54 -0300 (0:00:00.137)       0:00:00.137 ********* 
2026-08-10T10:40:55.0030921Z [WARNING]: Distribution rhel 9.3 on host caddeapllx2725.agil.nprd.caixa.gov.br
2026-08-10T10:40:55.0031320Z should use /usr/bin/python3, but is using /usr/bin/python for backward
2026-08-10T10:40:55.0031562Z compatibility with prior Ansible releases. See
2026-08-10T10:40:55.0031776Z https://docs.ansible.com/ansible-
2026-08-10T10:40:55.0032044Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-08-10T10:40:55.1124453Z 
2026-08-10T10:40:55.1125400Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-10T10:40:55.1125565Z ok: [caddeapllx2725.agil.nprd.caixa.gov.br]
2026-08-10T10:40:55.1125622Z 
2026-08-10T10:40:55.1125746Z PLAY [jboss] *******************************************************************
2026-08-10T10:40:55.1125818Z 
2026-08-10T10:40:55.1125941Z PLAY [jboss] *******************************************************************
2026-08-10T10:40:55.1126009Z 
2026-08-10T10:40:55.1126156Z PLAY [jboss] *******************************************************************
2026-08-10T10:40:55.1126225Z 
2026-08-10T10:40:55.1126350Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-10T10:40:55.1126429Z 
2026-08-10T10:40:55.1126541Z PLAY [Copiando modules adicionais] *********************************************
2026-08-10T10:40:55.1126974Z 
2026-08-10T10:40:55.1127096Z PLAY [jboss] *******************************************************************
2026-08-10T10:40:55.1127160Z 
2026-08-10T10:40:55.1127278Z PLAY [jboss] *******************************************************************
2026-08-10T10:40:55.1127345Z 
2026-08-10T10:40:55.1127463Z PLAY [jboss] *******************************************************************
2026-08-10T10:40:55.1127733Z Monday 10 August 2026  07:40:55 -0300 (0:00:00.828)       0:00:00.965 ********* 
2026-08-10T10:40:55.4514059Z 
2026-08-10T10:40:55.4514926Z TASK [Wait for Jboss Management port] ******************************************
2026-08-10T10:40:55.4515236Z ok: [caddeapllx2725.agil.nprd.caixa.gov.br]
2026-08-10T10:40:55.4515895Z Monday 10 August 2026  07:40:55 -0300 (0:00:00.338)       0:00:01.304 ********* 
2026-08-10T10:40:56.0714482Z 
2026-08-10T10:40:56.0715281Z TASK [Check if Jboss is Running] ***********************************************
2026-08-10T10:40:56.0715441Z ok: [caddeapllx2725.agil.nprd.caixa.gov.br]
2026-08-10T10:40:56.0715934Z Monday 10 August 2026  07:40:56 -0300 (0:00:00.620)       0:00:01.924 ********* 
2026-08-10T10:40:56.5617022Z 
2026-08-10T10:40:56.5617558Z TASK [Check Deployment details looking for status OK] **************************
2026-08-10T10:40:56.5617726Z ok: [caddeapllx2725.agil.nprd.caixa.gov.br]
2026-08-10T10:40:56.5618196Z Monday 10 August 2026  07:40:56 -0300 (0:00:00.490)       0:00:02.414 ********* 
2026-08-10T10:40:56.8919305Z 
2026-08-10T10:40:56.8920140Z TASK [Procura pacotes deployados com falha] ************************************
2026-08-10T10:40:56.8920620Z ok: [caddeapllx2725.agil.nprd.caixa.gov.br]
2026-08-10T10:40:56.8921087Z Monday 10 August 2026  07:40:56 -0300 (0:00:00.329)       0:00:02.744 ********* 
2026-08-10T10:40:56.9240485Z 
2026-08-10T10:40:56.9240998Z TASK [Valida se existe pacotes com falha] **************************************
2026-08-10T10:40:56.9241158Z fatal: [caddeapllx2725.agil.nprd.caixa.gov.br]: FAILED! => {
2026-08-10T10:40:56.9241345Z     "assertion": "files_failed.matched == 0",
2026-08-10T10:40:56.9241459Z     "changed": false,
2026-08-10T10:40:56.9241567Z     "evaluated_to": false,
2026-08-10T10:40:56.9241688Z     "msg": "Foram encontrados deployments com falha"
2026-08-10T10:40:56.9241795Z }
2026-08-10T10:40:56.9241827Z 
2026-08-10T10:40:56.9241951Z PLAY RECAP *********************************************************************
2026-08-10T10:40:56.9242133Z caddeapllx2725.agil.nprd.caixa.gov.br : ok=5    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-08-10T10:40:56.9242221Z 
2026-08-10T10:40:56.9242337Z Playbook run took 0 days, 0 hours, 0 minutes, 2 seconds
2026-08-10T10:40:56.9242785Z Monday 10 August 2026  07:40:56 -0300 (0:00:00.032)       0:00:02.777 ********* 
2026-08-10T10:40:56.9242956Z =============================================================================== 
2026-08-10T10:40:56.9243179Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.83s
2026-08-10T10:40:56.9243409Z Check if Jboss is Running ----------------------------------------------- 0.62s
2026-08-10T10:40:56.9243624Z Check Deployment details looking for status OK -------------------------- 0.49s
2026-08-10T10:40:56.9243841Z Wait for Jboss Management port ------------------------------------------ 0.34s
2026-08-10T10:40:56.9244057Z Procura pacotes deployados com falha ------------------------------------ 0.33s
2026-08-10T10:40:56.9244273Z Valida se existe pacotes com falha -------------------------------------- 0.03s
2026-08-10T10:40:57.0126928Z ##[error]Bash exited with code '2'.
2026-08-10T10:40:57.0173950Z ##[section]Finishing: Check Deployments [JBOSS]




ja estou logado no servidor



[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$ ps -ef | grep jboss
root      859788       1  0 ago07 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
jboss     859791  859788  0 ago07 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
jboss     859957  859791  0 ago07 ?        00:04:59 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siacc-tela-branca/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siacc-tela-branca/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
p585600  1180568 1180528  0 10:44 pts/0    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2725 ~]$ ps -ef | grep java
jboss     859957  859791  0 ago07 ?        00:04:59 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/siacc-tela-branca/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Dhttp.nonProxyHosts=localhost|127.0.0.1|*.caixa|*.caixa.gov.br -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siacc-tela-branca/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siacc-tela-branca -c standalone-full-ha.xml
p585600  1180582 1180528  0 10:44 pts/0    00:00:00 grep --color=auto java
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$
[p585600@caddeapllx2725 ~]$ cd /opt/jboss-eap/standalone/
configuration/ data/          deployments/   lib/           log/           tmp/
[p585600@caddeapllx2725 ~]$ cd /opt/jboss-eap/standalone/
configuration/ data/          deployments/   lib/           log/           tmp/
[p585600@caddeapllx2725 ~]$ cd /opt/jboss-eap/standalone/deployments/
applicationinsights-agent.jar         README.txt                            siacc-ear.ear.failed
applicationinsights-agent.jar.failed  siacc-ear.ear
[p585600@caddeapllx2725 ~]$ cd /opt/jboss-eap/standalone/deployments/



