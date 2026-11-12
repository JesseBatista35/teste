
p585600@10.116.202.45's password:
Last login: Thu Nov 12 15:59:47 2026 from 10.122.150.31
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ ps -ef | grep jboss
root      928549       1  0 nov10 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-internet -c standalone-full-ha.xml
jboss     928552  928549  0 nov10 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-internet -c standalone-full-ha.xml
jboss     928746  928552  0 nov10 ?        00:07:03 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-internet/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigsj-internet -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigsj-internet-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-internet/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-internet -c standalone-full-ha.xml
p585600  1113083 1112302  0 16:38 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# systemctl status jboss
Unit jboss.service could not be found.
[root@caddeapllx2854 p585600]# systemctl status .bash
.bash_history  .bash_logout   .bash_profile  .bashrc
[root@caddeapllx2854 p585600]# systemctl status .bash
.bash_history  .bash_logout   .bash_profile  .bashrc
[root@caddeapllx2854 p585600]# systemctl status .bash
.bash_history  .bash_logout   .bash_profile  .bashrc
[root@caddeapllx2854 p585600]# systemctl status jboss
Unit jboss.service could not be found.
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# ls -la /opt/jboss-eap/standalone/configuration/custom.sh
ls: não foi possível acessar '/opt/jboss-eap/standalone/configuration/custom.sh': Arquivo ou diretório inexistente
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#





2026-11-12T19:37:50.5851890Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-12T19:37:50.5855269Z ==============================================================================
2026-11-12T19:37:50.5855347Z Task         : Bash
2026-11-12T19:37:50.5855388Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-12T19:37:50.5855462Z Version      : 3.227.0
2026-11-12T19:37:50.5855504Z Author       : Microsoft Corporation
2026-11-12T19:37:50.5855552Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-12T19:37:50.5855632Z ==============================================================================
2026-11-12T19:37:51.3696887Z Generating script.
2026-11-12T19:37:51.3705134Z Script contents:
2026-11-12T19:37:51.3705611Z ansible-playbook /opt/ads-agent/_work/r12482/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-internet -e site=ctc_nprd
2026-11-12T19:37:51.3708746Z ========================== Starting Command Output ===========================
2026-11-12T19:37:51.3716394Z [command]/bin/bash /opt/ads-agent/_work/_temp/3e31da3a-6624-4a11-8a5e-17e067733213.sh
2026-11-12T19:37:53.6529013Z 
2026-11-12T19:37:53.6529483Z PLAY [local] *******************************************************************
2026-11-12T19:37:53.6828177Z 
2026-11-12T19:37:53.6828806Z PLAY [Configurando o DNS] ******************************************************
2026-11-12T19:37:53.8752811Z 
2026-11-12T19:37:53.8753343Z PLAY [local] *******************************************************************
2026-11-12T19:37:53.8786712Z 
2026-11-12T19:37:53.8787541Z PLAY [Verificando serviços] ****************************************************
2026-11-12T19:37:53.8879658Z 
2026-11-12T19:37:53.8880244Z PLAY [Configuração LDAP] *******************************************************
2026-11-12T19:37:53.8926893Z [WARNING]: Found variable using reserved name: when
2026-11-12T19:37:53.8930994Z 
2026-11-12T19:37:53.8931351Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:53.9322361Z 
2026-11-12T19:37:53.9322921Z PLAY [Stack Jboss] *************************************************************
2026-11-12T19:37:53.9554691Z Thursday 12 November 2026  16:37:53 -0300 (0:00:00.364)       0:00:00.364 ***** 
2026-11-12T19:37:54.4196418Z 
2026-11-12T19:37:54.4197340Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-12T19:37:54.4197764Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-12T19:37:54.4198026Z caddeapllx2854.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-12T19:37:54.4198201Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-12T19:37:54.4198350Z releases. A future Ansible release will default to using the discovered 
2026-11-12T19:37:54.4198513Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-12T19:37:54.4198671Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-12T19:37:54.4199015Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-12T19:37:54.4199170Z setting deprecation_warnings=False in ansible.cfg.
2026-11-12T19:37:54.4201377Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:54.4226518Z 
2026-11-12T19:37:54.4226862Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:54.4276263Z 
2026-11-12T19:37:54.4277047Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:54.4319818Z 
2026-11-12T19:37:54.4320191Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:54.4346267Z 
2026-11-12T19:37:54.4346555Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-12T19:37:54.4372461Z 
2026-11-12T19:37:54.4373197Z PLAY [Copiando modules adicionais] *********************************************
2026-11-12T19:37:54.4399538Z 
2026-11-12T19:37:54.4399787Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:54.4432876Z 
2026-11-12T19:37:54.4433694Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:54.4462161Z 
2026-11-12T19:37:54.4462507Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:54.4506167Z Thursday 12 November 2026  16:37:54 -0300 (0:00:00.495)       0:00:00.859 ***** 
2026-11-12T19:37:54.8301331Z 
2026-11-12T19:37:54.8302502Z TASK [Wait for Jboss Management port] ******************************************
2026-11-12T19:37:54.8302754Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:54.8330730Z Thursday 12 November 2026  16:37:54 -0300 (0:00:00.382)       0:00:01.241 ***** 
2026-11-12T19:37:55.4279131Z 
2026-11-12T19:37:55.4279501Z TASK [Check if Jboss is Running] ***********************************************
2026-11-12T19:37:55.4280421Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:55.4310616Z Thursday 12 November 2026  16:37:55 -0300 (0:00:00.598)       0:00:01.840 ***** 
2026-11-12T19:37:55.8585641Z 
2026-11-12T19:37:55.8586154Z TASK [Check Deployment details looking for status OK] **************************
2026-11-12T19:37:55.8586321Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:55.8619887Z Thursday 12 November 2026  16:37:55 -0300 (0:00:00.430)       0:00:02.270 ***** 
2026-11-12T19:37:56.2212511Z 
2026-11-12T19:37:56.2213157Z TASK [Procura pacotes com falha ou undeployed] *********************************
2026-11-12T19:37:56.2213325Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:56.2240106Z Thursday 12 November 2026  16:37:56 -0300 (0:00:00.362)       0:00:02.633 ***** 
2026-11-12T19:37:56.2818742Z 
2026-11-12T19:37:56.2819239Z TASK [Valida deployments] ******************************************************
2026-11-12T19:37:56.2819411Z ok: [caddeapllx2854.agil.nprd.caixa.gov.br] => {
2026-11-12T19:37:56.2819565Z     "changed": false, 
2026-11-12T19:37:56.2819767Z     "msg": "All assertions passed"
2026-11-12T19:37:56.2819869Z }
2026-11-12T19:37:56.2841251Z Thursday 12 November 2026  16:37:56 -0300 (0:00:00.060)       0:00:02.693 ***** 
2026-11-12T19:37:56.9478603Z 
2026-11-12T19:37:56.9479260Z TASK [Sobe o Apache (httpd-eap) somente apos JBoss validado com sucesso] *******
2026-11-12T19:37:56.9479437Z changed: [caddeapllx2854.agil.nprd.caixa.gov.br]
2026-11-12T19:37:56.9514975Z 
2026-11-12T19:37:56.9515213Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9544483Z 
2026-11-12T19:37:56.9545056Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9573154Z 
2026-11-12T19:37:56.9573540Z PLAY [local] *******************************************************************
2026-11-12T19:37:56.9596099Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-12T19:37:56.9598689Z 
2026-11-12T19:37:56.9599045Z PLAY [instance_restart] ********************************************************
2026-11-12T19:37:56.9599412Z skipping: no hosts matched
2026-11-12T19:37:56.9601755Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-12T19:37:56.9606635Z 
2026-11-12T19:37:56.9607031Z PLAY [machine_reboot] **********************************************************
2026-11-12T19:37:56.9607188Z skipping: no hosts matched
2026-11-12T19:37:56.9613070Z 
2026-11-12T19:37:56.9613344Z PLAY [local] *******************************************************************
2026-11-12T19:37:56.9637693Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-12T19:37:56.9639441Z 
2026-11-12T19:37:56.9639576Z PLAY [instance_stop] ***********************************************************
2026-11-12T19:37:56.9640180Z skipping: no hosts matched
2026-11-12T19:37:56.9643405Z 
2026-11-12T19:37:56.9643696Z PLAY [machine_reboot] **********************************************************
2026-11-12T19:37:56.9643854Z skipping: no hosts matched
2026-11-12T19:37:56.9652482Z 
2026-11-12T19:37:56.9652719Z PLAY [local] *******************************************************************
2026-11-12T19:37:56.9673418Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-12T19:37:56.9676072Z 
2026-11-12T19:37:56.9676343Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-12T19:37:56.9676504Z skipping: no hosts matched
2026-11-12T19:37:56.9682060Z 
2026-11-12T19:37:56.9682410Z PLAY [local] *******************************************************************
2026-11-12T19:37:56.9706983Z 
2026-11-12T19:37:56.9707455Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-12T19:37:56.9707601Z skipping: no hosts matched
2026-11-12T19:37:56.9713638Z 
2026-11-12T19:37:56.9714161Z PLAY [Configura TSM] ***********************************************************
2026-11-12T19:37:56.9743959Z 
2026-11-12T19:37:56.9744236Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9769289Z 
2026-11-12T19:37:56.9769915Z PLAY [Configura Control-M] *****************************************************
2026-11-12T19:37:56.9804136Z 
2026-11-12T19:37:56.9804448Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9844387Z 
2026-11-12T19:37:56.9844674Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9889612Z 
2026-11-12T19:37:56.9890010Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9933411Z 
2026-11-12T19:37:56.9933765Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9966096Z 
2026-11-12T19:37:56.9966460Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:56.9995835Z 
2026-11-12T19:37:56.9996141Z PLAY [localhost] ***************************************************************
2026-11-12T19:37:57.0025613Z 
2026-11-12T19:37:57.0025945Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:57.0083070Z 
2026-11-12T19:37:57.0083468Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:57.0122178Z 
2026-11-12T19:37:57.0123079Z PLAY [jboss] *******************************************************************
2026-11-12T19:37:57.0156371Z 
2026-11-12T19:37:57.0156755Z PLAY RECAP *********************************************************************
2026-11-12T19:37:57.0156982Z caddeapllx2854.agil.nprd.caixa.gov.br : ok=7    changed=1    unreachable=0    failed=0    skipped=0    rescued=0    ignored=0   
2026-11-12T19:37:57.0157071Z 
2026-11-12T19:37:57.0157734Z Thursday 12 November 2026  16:37:57 -0300 (0:00:00.731)       0:00:03.424 ***** 
2026-11-12T19:37:57.0157969Z =============================================================================== 
2026-11-12T19:37:57.0158209Z Sobe o Apache (httpd-eap) somente apos JBoss validado com sucesso ------- 0.73s
2026-11-12T19:37:57.0158465Z Check if Jboss is Running ----------------------------------------------- 0.60s
2026-11-12T19:37:57.0158694Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.50s
2026-11-12T19:37:57.0158914Z Check Deployment details looking for status OK -------------------------- 0.43s
2026-11-12T19:37:57.0159130Z Wait for Jboss Management port ------------------------------------------ 0.38s
2026-11-12T19:37:57.0159350Z Procura pacotes com falha ou undeployed --------------------------------- 0.36s
2026-11-12T19:37:57.0159577Z Valida deployments ------------------------------------------------------ 0.06s
2026-11-12T19:37:57.0159719Z Playbook run took 0 days, 0 hours, 0 minutes, 3 seconds
2026-11-12T19:37:57.0782963Z ##[section]Finishing: Check Deployments [JBOSS]




como nao teve mudanlça so no repo de config ele nao ta pegando 
