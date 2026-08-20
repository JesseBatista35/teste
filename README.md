
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$
[p585600@caddeapllx1992 ~]$ tail -f /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log
2026-08-20 13:06:00,637 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-08-20 13:06:00,637 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0008: Undertow HTTPS ouvinte https está suspendendo
2026-08-20 13:06:00,637 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-08-20 13:06:00,637 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida ojdbc17.jar (runtime-name: ojdbc17.jar) em 239ms
2026-08-20 13:06:00,638 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0007: Undertow HTTPS ouvinte https interrompido, estava vinculado a 0.0.0.0:8443
2026-08-20 13:06:00,768 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 100) AMQ221002: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [8c98d7d4-094e-11ee-abda-00505682f3d2] stopped, uptime 53 minutes
2026-08-20 13:06:00,768 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-08-20 13:06:00,769 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-08-20 13:06:00,769 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-08-20 13:06:00,773 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 371ms
^C
[p585600@caddeapllx1992 ~]$ tail -f /logs/jboss/jboss-eap/standalone/siatd-intranet-vm/server.log
2026-08-20 13:06:00,637 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-08-20 13:06:00,637 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0008: Undertow HTTPS ouvinte https está suspendendo
2026-08-20 13:06:00,637 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-08-20 13:06:00,637 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida ojdbc17.jar (runtime-name: ojdbc17.jar) em 239ms
2026-08-20 13:06:00,638 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0007: Undertow HTTPS ouvinte https interrompido, estava vinculado a 0.0.0.0:8443
2026-08-20 13:06:00,768 INFO  [org.apache.activemq.artemis.core.server] (ServerService Thread Pool -- 100) AMQ221002: Apache ActiveMQ Artemis Message Broker version 2.16.0.redhat-00052 [8c98d7d4-094e-11ee-abda-00505682f3d2] stopped, uptime 53 minutes
2026-08-20 13:06:00,768 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-08-20 13:06:00,769 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-08-20 13:06:00,769 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-08-20 13:06:00,773 INFO  [org.jboss.as] (MSC service thread 1-3) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 371ms
^C
[p585600@caddeapllx1992 ~]$ ps -ef | grep java
p585600   198741  187842  0 13:53 pts/0    00:00:00 grep --color=auto java
[p585600@caddeapllx1992 ~]$


2026-08-20T16:06:36.2154699Z ##[section]Starting: Check Deployments [JBOSS]
2026-08-20T16:06:36.2157984Z ==============================================================================
2026-08-20T16:06:36.2158080Z Task         : Bash
2026-08-20T16:06:36.2158131Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-20T16:06:36.2158202Z Version      : 3.227.0
2026-08-20T16:06:36.2158262Z Author       : Microsoft Corporation
2026-08-20T16:06:36.2158319Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-20T16:06:36.2158411Z ==============================================================================
2026-08-20T16:06:37.0425276Z Generating script.
2026-08-20T16:06:37.0433776Z Script contents:
2026-08-20T16:06:37.0434384Z ansible-playbook /opt/ads-agent/_work/r15086/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=siatd-intranet-vm -e site=ctc_nprd
2026-08-20T16:06:37.0437647Z ========================== Starting Command Output ===========================
2026-08-20T16:06:37.0449943Z [command]/bin/bash /opt/ads-agent/_work/_temp/412f4b77-e7c2-490f-9a2e-082f55a9f9fe.sh
2026-08-20T16:06:39.2451475Z 
2026-08-20T16:06:39.2452062Z PLAY [local] *******************************************************************
2026-08-20T16:06:39.2738031Z 
2026-08-20T16:06:39.2738531Z PLAY [Configurando o DNS] ******************************************************
2026-08-20T16:06:39.4924786Z 
2026-08-20T16:06:39.4925358Z PLAY [local] *******************************************************************
2026-08-20T16:06:39.4962333Z 
2026-08-20T16:06:39.4962936Z PLAY [Verificando serviços] ****************************************************
2026-08-20T16:06:39.5047381Z 
2026-08-20T16:06:39.5048480Z PLAY [Configuração LDAP] *******************************************************
2026-08-20T16:06:39.5079426Z [WARNING]: Found variable using reserved name: when
2026-08-20T16:06:39.5086582Z 
2026-08-20T16:06:39.5086752Z PLAY [jboss] *******************************************************************
2026-08-20T16:06:39.5175228Z 
2026-08-20T16:06:39.5175646Z PLAY [Stack Jboss] *************************************************************
2026-08-20T16:06:39.5429056Z Thursday 20 August 2026  13:06:39 -0300 (0:00:00.358)       0:00:00.358 ******* 
2026-08-20T16:06:40.0632339Z 
2026-08-20T16:06:40.0633443Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-08-20T16:06:40.0634089Z ok: [caddeapllx1992.agil.nprd.caixa.gov.br]
2026-08-20T16:06:40.0634288Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-08-20T16:06:40.0634629Z caddeapllx1992.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-08-20T16:06:40.0634848Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-08-20T16:06:40.0635570Z releases. A future Ansible release will default to using the discovered 
2026-08-20T16:06:40.0636182Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-08-20T16:06:40.0636424Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-08-20T16:06:40.0636603Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-08-20T16:06:40.0636774Z setting deprecation_warnings=False in ansible.cfg.
2026-08-20T16:06:40.0649318Z 
2026-08-20T16:06:40.0649599Z PLAY [jboss] *******************************************************************
2026-08-20T16:06:40.0695022Z 
2026-08-20T16:06:40.0695249Z PLAY [jboss] *******************************************************************
2026-08-20T16:06:40.0733399Z 
2026-08-20T16:06:40.0733619Z PLAY [jboss] *******************************************************************
2026-08-20T16:06:40.0757691Z 
2026-08-20T16:06:40.0758088Z PLAY [Copiando deployments adicionais] *****************************************
2026-08-20T16:06:40.0784833Z 
2026-08-20T16:06:40.0785267Z PLAY [Copiando modules adicionais] *********************************************
2026-08-20T16:06:40.0813228Z 
2026-08-20T16:06:40.0813560Z PLAY [jboss] *******************************************************************
2026-08-20T16:06:40.0847485Z 
2026-08-20T16:06:40.0847775Z PLAY [jboss] *******************************************************************
2026-08-20T16:06:40.0876787Z 
2026-08-20T16:06:40.0877143Z PLAY [jboss] *******************************************************************
2026-08-20T16:06:40.0918271Z Thursday 20 August 2026  13:06:40 -0300 (0:00:00.549)       0:00:00.907 ******* 
2026-08-20T16:10:00.7072752Z 
2026-08-20T16:10:00.7074094Z TASK [Wait for Jboss Management port] ******************************************
2026-08-20T16:10:00.7074905Z fatal: [caddeapllx1992.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.198.244:9990"}
2026-08-20T16:10:00.7118555Z Thursday 20 August 2026  13:10:00 -0300 (0:03:20.619)       0:03:21.527 ******* 
2026-08-20T16:10:07.4983256Z 
2026-08-20T16:10:07.4984464Z TASK [systemd] *****************************************************************
2026-08-20T16:10:07.4984797Z changed: [caddeapllx1992.agil.nprd.caixa.gov.br]
2026-08-20T16:10:07.5038065Z Thursday 20 August 2026  13:10:07 -0300 (0:00:06.791)       0:03:28.319 ******* 
2026-08-20T16:13:28.0057938Z 
2026-08-20T16:13:28.0067971Z TASK [Wait for Jboss Management port] ******************************************
2026-08-20T16:13:28.0074231Z fatal: [caddeapllx1992.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.198.244:9990"}
2026-08-20T16:13:28.0074728Z 
2026-08-20T16:13:28.0086752Z PLAY RECAP *********************************************************************
2026-08-20T16:13:28.0087186Z caddeapllx1992.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-08-20T16:13:28.0087303Z 
2026-08-20T16:13:28.0087711Z Thursday 20 August 2026  13:13:28 -0300 (0:03:20.502)       0:06:48.821 ******* 
2026-08-20T16:13:28.0087986Z =============================================================================== 
2026-08-20T16:13:28.0088268Z Wait for Jboss Management port ---------------------------------------- 200.62s
2026-08-20T16:13:28.0088508Z Wait for Jboss Management port ---------------------------------------- 200.50s
2026-08-20T16:13:28.0088749Z systemd ----------------------------------------------------------------- 6.79s
2026-08-20T16:13:28.0089281Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.55s
2026-08-20T16:13:28.0089784Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-08-20T16:13:28.1066205Z ##[error]Bash exited with code '2'.
2026-08-20T16:13:28.1078686Z ##[section]Finishing: Check Deployments [JBOSS]

