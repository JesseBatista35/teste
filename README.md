
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$ ps -ef | grep jboss
root       54424       1  0 nov06 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siemp-java-web -c standalone-full-ha.xml
jboss      54427   54424  0 nov06 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siemp-java-web -c standalone-full-ha.xml
jboss      54685   54427  0 nov06 ?        00:06:36 java -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/siemp-java-web/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=siemp-java-web -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=siemp-java-web-des-esteiras --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/siemp-java-web/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/siemp-java-web -c standalone-full-ha.xml
p585600   295334  295307  0 09:19 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$
[p585600@caddeapllx2864 ~]$



2026-11-06T18:53:38.2249950Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-06T18:53:38.2253474Z ==============================================================================
2026-11-06T18:53:38.2253561Z Task         : Bash
2026-11-06T18:53:38.2253602Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-06T18:53:38.2253676Z Version      : 3.227.0
2026-11-06T18:53:38.2253719Z Author       : Microsoft Corporation
2026-11-06T18:53:38.2253768Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-06T18:53:38.2253853Z ==============================================================================
2026-11-06T18:53:39.2499713Z Generating script.
2026-11-06T18:53:39.2508131Z Script contents:
2026-11-06T18:53:39.2508729Z ansible-playbook /opt/ads-agent/_work/r13692/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=siemp-java-web -e site=ctc_nprd
2026-11-06T18:53:39.2512031Z ========================== Starting Command Output ===========================
2026-11-06T18:53:39.2519366Z [command]/bin/bash /opt/ads-agent/_work/_temp/801db782-0c32-4817-b7fc-5551802bf82f.sh
2026-11-06T18:53:41.6471801Z 
2026-11-06T18:53:41.6472360Z PLAY [local] *******************************************************************
2026-11-06T18:53:41.6782738Z 
2026-11-06T18:53:41.6783673Z PLAY [Configurando o DNS] ******************************************************
2026-11-06T18:53:41.8735003Z 
2026-11-06T18:53:41.8735554Z PLAY [local] *******************************************************************
2026-11-06T18:53:41.8772172Z 
2026-11-06T18:53:41.8772784Z PLAY [Verificando serviços] ****************************************************
2026-11-06T18:53:41.8867748Z 
2026-11-06T18:53:41.8868499Z PLAY [Configuração LDAP] *******************************************************
2026-11-06T18:53:41.8903893Z [WARNING]: Found variable using reserved name: when
2026-11-06T18:53:41.8909428Z 
2026-11-06T18:53:41.8909681Z PLAY [jboss] *******************************************************************
2026-11-06T18:53:41.9000341Z 
2026-11-06T18:53:41.9001016Z PLAY [Stack Jboss] *************************************************************
2026-11-06T18:53:41.9257293Z Friday 06 November 2026  15:53:41 -0300 (0:00:00.341)       0:00:00.341 ******* 
2026-11-06T18:53:42.4473103Z 
2026-11-06T18:53:42.4473946Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-06T18:53:42.4474135Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-06T18:53:42.4474446Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-06T18:53:42.4474685Z caddeapllx2864.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-06T18:53:42.4474858Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-06T18:53:42.4475024Z releases. A future Ansible release will default to using the discovered 
2026-11-06T18:53:42.4475191Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-06T18:53:42.4475373Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-06T18:53:42.4475541Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-06T18:53:42.4475702Z setting deprecation_warnings=False in ansible.cfg.
2026-11-06T18:53:42.4494307Z 
2026-11-06T18:53:42.4494533Z PLAY [jboss] *******************************************************************
2026-11-06T18:53:42.4543773Z 
2026-11-06T18:53:42.4544166Z PLAY [jboss] *******************************************************************
2026-11-06T18:53:42.4584658Z 
2026-11-06T18:53:42.4585217Z PLAY [jboss] *******************************************************************
2026-11-06T18:53:42.4611397Z 
2026-11-06T18:53:42.4612016Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-06T18:53:42.4636835Z 
2026-11-06T18:53:42.4637032Z PLAY [Copiando modules adicionais] *********************************************
2026-11-06T18:53:42.4664845Z 
2026-11-06T18:53:42.4665286Z PLAY [jboss] *******************************************************************
2026-11-06T18:53:42.4699994Z 
2026-11-06T18:53:42.4700171Z PLAY [jboss] *******************************************************************
2026-11-06T18:53:42.4729325Z 
2026-11-06T18:53:42.4729671Z PLAY [jboss] *******************************************************************
2026-11-06T18:53:42.4774990Z Friday 06 November 2026  15:53:42 -0300 (0:00:00.551)       0:00:00.892 ******* 
2026-11-06T18:57:03.0881022Z 
2026-11-06T18:57:03.0881760Z TASK [Wait for Jboss Management port] ******************************************
2026-11-06T18:57:03.0919441Z fatal: [caddeapllx2864.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.202.54:9990"}
2026-11-06T18:57:03.0919963Z Friday 06 November 2026  15:57:03 -0300 (0:03:20.614)       0:03:21.507 ******* 
2026-11-06T18:57:09.8964376Z 
2026-11-06T18:57:09.8964982Z TASK [systemd] *****************************************************************
2026-11-06T18:57:09.8965174Z changed: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-06T18:57:09.9020179Z Friday 06 November 2026  15:57:09 -0300 (0:00:06.810)       0:03:28.317 ******* 
2026-11-06T19:00:30.3965787Z 
2026-11-06T19:00:30.3966458Z TASK [Wait for Jboss Management port] ******************************************
2026-11-06T19:00:30.3967938Z fatal: [caddeapllx2864.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.202.54:9990"}
2026-11-06T19:00:30.3974893Z 
2026-11-06T19:00:30.3975301Z PLAY RECAP *********************************************************************
2026-11-06T19:00:30.3975491Z caddeapllx2864.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-11-06T19:00:30.3975596Z 
2026-11-06T19:00:30.3976637Z Friday 06 November 2026  16:00:30 -0300 (0:03:20.495)       0:06:48.813 ******* 
2026-11-06T19:00:30.3976830Z =============================================================================== 
2026-11-06T19:00:30.3977390Z Wait for Jboss Management port ---------------------------------------- 200.61s
2026-11-06T19:00:30.3977671Z Wait for Jboss Management port ---------------------------------------- 200.50s
2026-11-06T19:00:30.3977896Z systemd ----------------------------------------------------------------- 6.81s
2026-11-06T19:00:30.3978152Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.55s
2026-11-06T19:00:30.3978304Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-11-06T19:00:30.4788081Z ##[error]Bash exited with code '2'.
2026-11-06T19:00:30.4815536Z ##[section]Finishing: Check Deployments [JBOSS]




Etnao mais esse SIEMP ESTA NA ESTEIRAS ESSE AEUI E O SERVIDOR DELE NO SEI SE TEM RELAÇAO COM 471
