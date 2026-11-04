2026-11-03T16:27:11.2760551Z ##[section]Starting: Check Deployments [JBOSS]
2026-11-03T16:27:11.2763916Z ==============================================================================
2026-11-03T16:27:11.2764040Z Task         : Bash
2026-11-03T16:27:11.2764104Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-03T16:27:11.2764222Z Version      : 3.227.0
2026-11-03T16:27:11.2764274Z Author       : Microsoft Corporation
2026-11-03T16:27:11.2764319Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-03T16:27:11.2764386Z ==============================================================================
2026-11-03T16:27:11.3932711Z Generating script.
2026-11-03T16:27:11.3940745Z Script contents:
2026-11-03T16:27:11.3941330Z ansible-playbook /opt/ads-agent/_work/r19326/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-boleto -e site=ctc_nprd
2026-11-03T16:27:11.3943992Z ========================== Starting Command Output ===========================
2026-11-03T16:27:11.3972040Z [command]/bin/bash /opt/ads-agent/_work/_temp/c0b8e87d-b204-4ed4-b905-085f2f3d01bb.sh
2026-11-03T16:27:13.6083791Z 
2026-11-03T16:27:13.6084417Z PLAY [local] *******************************************************************
2026-11-03T16:27:13.6377378Z 
2026-11-03T16:27:13.6377873Z PLAY [Configurando o DNS] ******************************************************
2026-11-03T16:27:13.8343293Z 
2026-11-03T16:27:13.8343733Z PLAY [local] *******************************************************************
2026-11-03T16:27:13.8380642Z 
2026-11-03T16:27:13.8381165Z PLAY [Verificando serviços] ****************************************************
2026-11-03T16:27:13.8480156Z 
2026-11-03T16:27:13.8480817Z PLAY [Configuração LDAP] *******************************************************
2026-11-03T16:27:13.8514356Z [WARNING]: Found variable using reserved name: when
2026-11-03T16:27:13.8519480Z 
2026-11-03T16:27:13.8519838Z PLAY [jboss] *******************************************************************
2026-11-03T16:27:13.8606779Z 
2026-11-03T16:27:13.8607491Z PLAY [Stack Jboss] *************************************************************
2026-11-03T16:27:13.8854871Z Tuesday 03 November 2026  13:27:13 -0300 (0:00:00.339)       0:00:00.339 ****** 
2026-11-03T16:27:14.4926378Z 
2026-11-03T16:27:14.4927194Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-03T16:27:14.4927930Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-03T16:27:14.4928495Z caddeapllx2557.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-03T16:27:14.4928839Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-03T16:27:14.4929106Z releases. A future Ansible release will default to using the discovered 
2026-11-03T16:27:14.4929429Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-03T16:27:14.4929765Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-03T16:27:14.4930140Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-03T16:27:14.4930430Z setting deprecation_warnings=False in ansible.cfg.
2026-11-03T16:27:14.4930659Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-11-03T16:27:14.4956056Z 
2026-11-03T16:27:14.4956432Z PLAY [jboss] *******************************************************************
2026-11-03T16:27:14.4996760Z 
2026-11-03T16:27:14.4997464Z PLAY [jboss] *******************************************************************
2026-11-03T16:27:14.5034762Z 
2026-11-03T16:27:14.5035308Z PLAY [jboss] *******************************************************************
2026-11-03T16:27:14.5060462Z 
2026-11-03T16:27:14.5060763Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-03T16:27:14.5088582Z 
2026-11-03T16:27:14.5088723Z PLAY [Copiando modules adicionais] *********************************************
2026-11-03T16:27:14.5113594Z 
2026-11-03T16:27:14.5113923Z PLAY [jboss] *******************************************************************
2026-11-03T16:27:14.5148146Z 
2026-11-03T16:27:14.5148675Z PLAY [jboss] *******************************************************************
2026-11-03T16:27:14.5178223Z 
2026-11-03T16:27:14.5178674Z PLAY [jboss] *******************************************************************
2026-11-03T16:27:14.5221390Z Tuesday 03 November 2026  13:27:14 -0300 (0:00:00.636)       0:00:00.976 ****** 
2026-11-03T16:27:14.9595998Z 
2026-11-03T16:27:14.9596707Z TASK [Wait for Jboss Management port] ******************************************
2026-11-03T16:27:14.9596996Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-11-03T16:27:14.9631481Z Tuesday 03 November 2026  13:27:14 -0300 (0:00:00.440)       0:00:01.417 ****** 
2026-11-03T16:27:15.8496864Z 
2026-11-03T16:27:15.8497436Z TASK [Check if Jboss is Running] ***********************************************
2026-11-03T16:27:15.8497589Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-11-03T16:27:15.8603866Z Tuesday 03 November 2026  13:27:15 -0300 (0:00:00.889)       0:00:02.307 ****** 
2026-11-03T16:27:16.3675264Z 
2026-11-03T16:27:16.3675728Z TASK [Check Deployment details looking for status OK] **************************
2026-11-03T16:27:16.3675943Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-11-03T16:27:16.3714078Z Tuesday 03 November 2026  13:27:16 -0300 (0:00:00.518)       0:00:02.825 ****** 
2026-11-03T16:27:16.8121956Z 
2026-11-03T16:27:16.8122562Z TASK [Procura pacotes com falha ou undeployed] *********************************
2026-11-03T16:27:16.8122772Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-11-03T16:27:16.8158790Z Tuesday 03 November 2026  13:27:16 -0300 (0:00:00.444)       0:00:03.269 ****** 
2026-11-03T16:27:16.8749209Z 
2026-11-03T16:27:16.8749690Z TASK [Valida deployments] ******************************************************
2026-11-03T16:27:16.8749855Z fatal: [caddeapllx2557.agil.nprd.caixa.gov.br]: FAILED! => {
2026-11-03T16:27:16.8749993Z     "assertion": "files_failed.matched == 0", 
2026-11-03T16:27:16.8750125Z     "changed": false, 
2026-11-03T16:27:16.8750218Z     "evaluated_to": false, 
2026-11-03T16:27:16.8750551Z     "msg": "Deployments com problema: [u'/opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar.undeployed']"
2026-11-03T16:27:16.8750697Z }
2026-11-03T16:27:16.8755799Z 
2026-11-03T16:27:16.8755937Z PLAY RECAP *********************************************************************
2026-11-03T16:27:16.8756118Z caddeapllx2557.agil.nprd.caixa.gov.br : ok=5    changed=0    unreachable=0    failed=1    skipped=0    rescued=0    ignored=0   
2026-11-03T16:27:16.8756199Z 
2026-11-03T16:27:16.8757409Z Tuesday 03 November 2026  13:27:16 -0300 (0:00:00.059)       0:00:03.329 ****** 
2026-11-03T16:27:16.8758559Z =============================================================================== 
2026-11-03T16:27:16.8759009Z Check if Jboss is Running ----------------------------------------------- 0.89s
2026-11-03T16:27:16.8759228Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.64s
2026-11-03T16:27:16.8759460Z Check Deployment details looking for status OK -------------------------- 0.52s
2026-11-03T16:27:16.8759674Z Procura pacotes com falha ou undeployed --------------------------------- 0.44s
2026-11-03T16:27:16.8760170Z Wait for Jboss Management port ------------------------------------------ 0.44s
2026-11-03T16:27:16.8760380Z Valida deployments ------------------------------------------------------ 0.06s
2026-11-03T16:27:16.8760530Z Playbook run took 0 days, 0 hours, 0 minutes, 3 seconds
2026-11-03T16:27:16.9392943Z ##[error]Bash exited with code '2'.
2026-11-03T16:27:16.9408097Z ##[section]Finishing: Check Deployments [JBOSS]





[p585600@caddeapllx2557 ~]$ ps -ef | grep jboss
root      344857       1  0 nov03 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-boleto -c standalone-full-ha.xml
jboss     344860  344857  0 nov03 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-boleto -c standalone-full-ha.xml
jboss     345054  344860  0 nov03 ?        00:04:46 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-boleto/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigsj-boleto -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://sigsj-frontend-des.apps.nprd.caixa/ -Delastic.apm.global_labels=deployment=sigsj-boleto-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-boleto -c standalone-full-ha.xml
p585600   480617  480578  0 11:28 pts/1    00:00:00 grep --color=auto jboss
[p585600@caddeapllx2557 ~]$ ps -ef | grep java
jboss     345054  344860  0 nov03 ?        00:04:46 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-boleto/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigsj-boleto -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://sigsj-frontend-des.apps.nprd.caixa/ -Delastic.apm.global_labels=deployment=sigsj-boleto-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-boleto -c standalone-full-ha.xml
p585600   480619  480578  0 11:28 pts/1    00:00:00 grep --color=auto java
[p585600@caddeapllx2557 ~]$ ps -ef | grep sigsj
root      344857       1  0 nov03 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-boleto -c standalone-full-ha.xml
jboss     344860  344857  0 nov03 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-boleto -c standalone-full-ha.xml
jboss     345054  344860  0 nov03 ?        00:04:46 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigsj-boleto/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigsj-boleto -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://sigsj-frontend-des.apps.nprd.caixa/ -Delastic.apm.global_labels=deployment=sigsj-boleto-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigsj-boleto -c standalone-full-ha.xml
p585600   480621  480578  0 11:28 pts/1    00:00:00 grep --color=auto sigsj
[p585600@caddeapllx2557 ~]$




<?xml version='1.0' encoding='UTF-8'?>

<server xmlns="urn:jboss:domain:16.0">
    <extensions>
        <extension module="org.jboss.as.modcluster"/>
        <extension module="org.jboss.as.clustering.infinispan"/>
        <extension module="org.jboss.as.connector"/>
        <extension module="org.jboss.as.deployment-scanner"/>
        <extension module="org.jboss.as.ee"/>
        <extension module="org.jboss.as.ejb3"/>
        <extension module="org.jboss.as.jaxrs"/>
        <extension module="org.jboss.as.jdr"/>
        <extension module="org.jboss.as.jmx"/>
        <extension module="org.jboss.as.jpa"/>
        <extension module="org.jboss.as.jsf"/>
        <extension module="org.jboss.as.jsr77"/>
        <extension module="org.jboss.as.logging"/>
        <extension module="org.jboss.as.mail"/>      
        <extension module="org.jboss.as.naming"/>
        <extension module="org.jboss.as.pojo"/>
        <extension module="org.jboss.as.remoting"/>
        <extension module="org.jboss.as.sar"/>
        <extension module="org.jboss.as.transactions"/>
        <extension module="org.jboss.as.webservices"/>
        <extension module="org.jboss.as.weld"/>
        <extension module="org.wildfly.extension.batch.jberet"/>
        <extension module="org.wildfly.extension.bean-validation"/>
        <extension module="org.wildfly.extension.clustering.web"/>
        <extension module="org.wildfly.extension.core-management"/>
        <extension module="org.wildfly.extension.discovery"/>
        <extension module="org.wildfly.extension.ee-security"/>
        <extension module="org.wildfly.extension.elytron"/>
        <extension module="org.wildfly.extension.health"/>
        <extension module="org.wildfly.extension.io"/>
        <extension module="org.wildfly.extension.messaging-activemq"/>
        <extension module="org.wildfly.extension.metrics"/>
        <extension module="org.wildfly.extension.request-controller"/>
        <extension module="org.wildfly.extension.security.manager"/>
        <extension module="org.wildfly.extension.undertow"/>
        <extension module="org.wildfly.iiop-openjdk"/>
    </extensions>
    <system-properties>
        <property name="CONNECTOR-FARM-HOST" value="10.116.89.101"/>
        <property name="CONNECTOR-FARM-PORT" value="8111"/>
    </system-properties>
    <management>
        <audit-log>
            <formatters>
                <json-formatter name="json-formatter"/>
            </formatters>
            <handlers>
                <file-handler name="file" formatter="json-formatter" path="audit-log.log" relative-to="jboss.server.data.dir"/>
            </handlers>
            <logger log-boot="true" log-read-only="false" enabled="false">
                <handlers>
                    <handler name="file"/>
                </handlers>
            </logger>
        </audit-log>
        <management-interfaces>
            <http-interface http-authentication-factory="management-http-authentication">
                <http-upgrade enabled="true" sasl-authentication-factory="management-sasl-authentication"/>
                <socket-binding http="management-http"/>
            </http-interface>
        </management-interfaces>
        <access-control provider="simple">
            <role-mapping>
                <role name="SuperUser">
                    <include>
                        <user name="$local"/>
                    </include>
                </role>
            </role-mapping>
        </access-control>
    </management>
    <profile>
        <subsystem xmlns="urn:jboss:domain:logging:8.0">
            <console-handler name="CONSOLE">
                <level name="INFO"/>
                <formatter>
                    <named-formatter name="COLOR-PATTERN"/>
                </formatter>
            </console-handler>
            <periodic-rotating-file-handler name="FILE" autoflush="true">
                <formatter>
                    <named-formatter name="PATTERN"/>
                </formatter>
                <file relative-to="jboss.server.log.dir" path="server.log"/>
                <suffix value=".yyyy-MM-dd"/>
                <append value="true"/>
            </periodic-rotating-file-handler>
                <periodic-rotating-file-handler name="sirot" autoflush="true">
                <formatter>
                    <named-formatter name="PATTERN"/>
                </formatter>
                <file relative-to="jboss.server.log.dir" path="sirot.log"/>
                <suffix value=".yyyy-MM-dd"/>
                <append value="true"/>
            </periodic-rotating-file-handler>
            <periodic-rotating-file-handler name="ceflib" autoflush="true">
                <formatter>
                    <named-formatter name="PATTERN"/>
                </formatter>
                <file relative-to="jboss.server.log.dir" path="ceflib.log"/>
                <suffix value=".yyyy-MM-dd"/>
                <append value="true"/>
            </periodic-rotating-file-handler>
            <logger category="com.arjuna">
                <level name="WARN"/>
            </logger>
            <logger category="org.jboss.as.config">
                <level name="DEBUG"/>
            </logger>
            <logger category="sun.rmi">
                <level name="WARN"/>
            </logger>
            <logger category="io.prometheus">
                <level name="FATAL"/>
            </logger>
            <logger category="io.undertow">
                <level name="ERROR"/>
            </logger>
            <logger category="stdout">
                <level name="OFF"/>
            </logger>
            <root-logger>
                <level name="INFO"/>
                <handlers>
                    <handler name="CONSOLE"/>
                    <handler name="FILE"/>
                </handlers>
            </root-logger>
            <formatter name="PATTERN">
                <pattern-formatter pattern="%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n"/>
            </formatter>
            <formatter name="COLOR-PATTERN">
                <pattern-formatter pattern="%K{level}%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n"/>
            </formatter>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:batch-jberet:2.0">
            <default-job-repository name="in-memory"/>
            <default-thread-pool name="batch"/>
            <security-domain name="ApplicationDomain"/>
            <job-repository name="in-memory">
                <in-memory/>
            </job-repository>
            <thread-pool name="batch">
                <max-threads count="10"/>
                <keepalive-time time="30" unit="seconds"/>
            </thread-pool>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:bean-validation:1.0"/>
        <subsystem xmlns="urn:jboss:domain:core-management:1.0"/>
        <subsystem xmlns="urn:jboss:domain:datasources:6.0">
            <datasources>
                <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true" statistics-enabled="true">
                    <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
                    <driver>h2</driver>
                    <security>
                        <user-name>sa</user-name>
                        <password>sa</password>
                    </security>
                </datasource>
                <drivers>
                    <driver name="h2" module="com.h2database.h2">
                        <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
                    </driver>
                </drivers>
            </datasources>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:deployment-scanner:2.0">
            <deployment-scanner path="deployments" relative-to="jboss.server.base.dir" scan-interval="5000" runtime-failure-causes-rollback="${jboss.deployment.scanner.rollback.on.failure:false}"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee:6.0">
            <spec-descriptor-property-replacement>true</spec-descriptor-property-replacement>
            <concurrent>
                <context-services>
                    <context-service name="default" jndi-name="java:jboss/ee/concurrency/context/default" use-transaction-setup-provider="true"/>
                </context-services>
                <managed-thread-factories>
                    <managed-thread-factory name="default" jndi-name="java:jboss/ee/concurrency/factory/default" context-service="default"/>
                </managed-thread-factories>
                <managed-executor-services>
                    <managed-executor-service name="default" jndi-name="java:jboss/ee/concurrency/executor/default" context-service="default" hung-task-termination-period="0" hung-task-threshold="60000" keepalive-time="5000"/>
                </managed-executor-services>
                <managed-scheduled-executor-services>
                    <managed-scheduled-executor-service name="default" jndi-name="java:jboss/ee/concurrency/scheduler/default" context-service="default" hung-task-termination-period="0" hung-task-threshold="60000" keepalive-time="3000"/>
                </managed-scheduled-executor-services>
            </concurrent>
            <default-bindings context-service="java:jboss/ee/concurrency/context/default" datasource="java:jboss/datasources/ExampleDS" jms-connection-factory="java:jboss/DefaultJMSConnectionFactory" managed-executor-service="java:jboss/ee/concurrency/executor/default" managed-scheduled-executor-service="java:jboss/ee/concurrency/scheduler/default" managed-thread-factory="java:jboss/ee/concurrency/factory/default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:ee-security:1.0"/>
        <subsystem xmlns="urn:jboss:domain:ejb3:9.0">
            <session-bean>
                <stateless>
                    <bean-instance-pool-ref pool-name="slsb-strict-max-pool"/>
                </stateless>
                <stateful default-access-timeout="5000" cache-ref="simple" passivation-disabled-cache-ref="simple"/>
                <singleton default-access-timeout="5000"/>
            </session-bean>
            <mdb>
                <resource-adapter-ref resource-adapter-name="${ejb.resource-adapter-name:activemq-ra.rar}"/>
                <bean-instance-pool-ref pool-name="mdb-strict-max-pool"/>
            </mdb>
            <pools>
                <bean-instance-pools>
                    <strict-max-pool name="mdb-strict-max-pool" derive-size="from-cpu-count" instance-acquisition-timeout="5" instance-acquisition-timeout-unit="MINUTES"/>
                    <strict-max-pool name="slsb-strict-max-pool" derive-size="from-worker-pools" instance-acquisition-timeout="5" instance-acquisition-timeout-unit="MINUTES"/>
                </bean-instance-pools>
            </pools>
            <caches>
                <cache name="simple"/>
                <cache name="distributable" passivation-store-ref="infinispan" aliases="passivating clustered"/>
            </caches>
            <passivation-stores>
                <passivation-store name="infinispan" cache-container="ejb" max-size="10000"/>
            </passivation-stores>
            <async thread-pool-name="default"/>
            <timer-service thread-pool-name="default" default-data-store="default-file-store">
                <data-stores>
                    <file-data-store name="default-file-store" path="timer-service-data" relative-to="jboss.server.data.dir"/>
                </data-stores>
            </timer-service>
            <remote cluster="ejb" connectors="http-remoting-connector" thread-pool-name="default">
                <channel-creation-options>
                    <option name="MAX_OUTBOUND_MESSAGES" value="1234" type="remoting"/>
                </channel-creation-options>
            </remote>
            <thread-pools>
                <thread-pool name="default">
                    <max-threads count="48"/>
                    <keepalive-time time="60" unit="seconds"/>
                </thread-pool>
            </thread-pools>
            <iiop enable-by-default="false" use-qualified-name="false"/>
            <default-security-domain value="other"/>
            <application-security-domains>
                <application-security-domain name="other" security-domain="ApplicationDomain"/>
            </application-security-domains>
            <default-missing-method-permissions-deny-access value="true"/>
            <statistics enabled="${wildfly.ejb3.statistics-enabled:${wildfly.statistics-enabled:false}}"/>
            <log-system-exceptions value="true"/>
        </subsystem>
        <subsystem xmlns="urn:wildfly:elytron:13.0" final-providers="combined-providers" disallowed-providers="OracleUcrypto">
            <providers>
                <aggregate-providers name="combined-providers">
                    <providers name="elytron"/>
                    <providers name="openssl"/>
                </aggregate-providers>
                <provider-loader name="elytron" module="org.wildfly.security.elytron"/>
                <provider-loader name="openssl" module="org.wildfly.openssl"/>
            </providers>
            <audit-logging>
                <file-audit-log name="local-audit" path="audit.log" relative-to="jboss.server.log.dir" format="JSON"/>
            </audit-logging>
            <security-domains>
                <security-domain name="ApplicationDomain" default-realm="ApplicationRealm" permission-mapper="default-permission-mapper">
                    <realm name="ApplicationRealm" role-decoder="groups-to-roles"/>
                    <realm name="local"/>
                </security-domain>
                <security-domain name="ManagementDomain" default-realm="ManagementRealm" permission-mapper="default-permission-mapper">
                    <realm name="ManagementRealm" role-decoder="groups-to-roles"/>
                    <realm name="local" role-mapper="super-user-mapper"/>
                </security-domain>
            </security-domains>
            <security-realms>
                <identity-realm name="local" identity="$local"/>
                <properties-realm name="ApplicationRealm">
                    <users-properties path="application-users.properties" relative-to="jboss.server.config.dir" digest-realm-name="ApplicationRealm"/>
                    <groups-properties path="application-roles.properties" relative-to="jboss.server.config.dir"/>
                </properties-realm>
                <properties-realm name="ManagementRealm">
                    <users-properties path="mgmt-users.properties" relative-to="jboss.server.config.dir" digest-realm-name="ManagementRealm"/>
                    <groups-properties path="mgmt-groups.properties" relative-to="jboss.server.config.dir"/>
                </properties-realm>
            </security-realms>
            <mappers>
                <simple-permission-mapper name="default-permission-mapper" mapping-mode="first">
                    <permission-mapping>
                        <principal name="anonymous"/>
                        <permission-set name="default-permissions"/>
                    </permission-mapping>
                    <permission-mapping match-all="true">
                        <permission-set name="login-permission"/>
                        <permission-set name="default-permissions"/>
                    </permission-mapping>
                </simple-permission-mapper>
                <constant-realm-mapper name="local" realm-name="local"/>
                <simple-role-decoder name="groups-to-roles" attribute="groups"/>
                <constant-role-mapper name="super-user-mapper">
                    <role name="SuperUser"/>
                </constant-role-mapper>
            </mappers>
            <permission-sets>
                <permission-set name="login-permission">
                    <permission class-name="org.wildfly.security.auth.permission.LoginPermission"/>
                </permission-set>
                <permission-set name="default-permissions">
                    <permission class-name="org.wildfly.extension.batch.jberet.deployment.BatchPermission" module="org.wildfly.extension.batch.jberet" target-name="*"/>
                    <permission class-name="org.wildfly.transaction.client.RemoteTransactionPermission" module="org.wildfly.transaction.client"/>
                    <permission class-name="org.jboss.ejb.client.RemoteEJBPermission" module="org.jboss.ejb-client"/>
                </permission-set>
            </permission-sets>
            <http>
                <http-authentication-factory name="management-http-authentication" security-domain="ManagementDomain" http-server-mechanism-factory="global">
                    <mechanism-configuration>
                        <mechanism mechanism-name="DIGEST">
                            <mechanism-realm realm-name="ManagementRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </http-authentication-factory>
                <http-authentication-factory name="application-http-authentication" security-domain="ApplicationDomain" http-server-mechanism-factory="global">
                    <mechanism-configuration>
                        <mechanism mechanism-name="BASIC">
                            <mechanism-realm realm-name="ApplicationRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </http-authentication-factory>
                <provider-http-server-mechanism-factory name="global"/>
            </http>
            <sasl>
                <sasl-authentication-factory name="application-sasl-authentication" sasl-server-factory="configured" security-domain="ApplicationDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="ApplicationRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </sasl-authentication-factory>
                <sasl-authentication-factory name="management-sasl-authentication" sasl-server-factory="configured" security-domain="ManagementDomain">
                    <mechanism-configuration>
                        <mechanism mechanism-name="JBOSS-LOCAL-USER" realm-mapper="local"/>
                        <mechanism mechanism-name="DIGEST-MD5">
                            <mechanism-realm realm-name="ManagementRealm"/>
                        </mechanism>
                    </mechanism-configuration>
                </sasl-authentication-factory>
                <configurable-sasl-server-factory name="configured" sasl-server-factory="elytron">
                    <properties>
                        <property name="wildfly.sasl.local-user.default-user" value="$local"/>
                    </properties>
                </configurable-sasl-server-factory>
                <mechanism-provider-filtering-sasl-server-factory name="elytron" sasl-server-factory="global">
                    <filters>
                        <filter provider-name="WildFlyElytron"/>
                    </filters>
                </mechanism-provider-filtering-sasl-server-factory>
                <provider-sasl-server-factory name="global"/>
            </sasl>
            <tls>
                <key-stores>
                    <key-store name="applicationKS">
                        <credential-reference clear-text="password"/>
                        <implementation type="JKS"/>
                        <file path="application.keystore" relative-to="jboss.server.config.dir"/>
                    </key-store>
                </key-stores>
                <key-managers>
                    <key-manager name="applicationKM" key-store="applicationKS" generate-self-signed-certificate-host="localhost">
                        <credential-reference clear-text="password"/>
                    </key-manager>
                </key-managers>
                <server-ssl-contexts>
                    <server-ssl-context name="applicationSSC" key-manager="applicationKM"/>
                </server-ssl-contexts>
            </tls>
        </subsystem>
        <subsystem xmlns="urn:wildfly:health:1.0" security-enabled="false"/>
        <subsystem xmlns="urn:jboss:domain:iiop-openjdk:2.1">
            <orb socket-binding="iiop"/>
            <initializers security="elytron" transactions="spec"/>
            <security server-requires-ssl="false" client-requires-ssl="false"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:infinispan:12.0">
            <cache-container name="ejb" default-cache="passivation" aliases="sfsb" modules="org.wildfly.clustering.ejb.infinispan">
                <local-cache name="passivation">
                    <file-store passivation="true" purge="false"/>
                </local-cache>
            </cache-container>
            <cache-container name="web" default-cache="passivation" modules="org.wildfly.clustering.web.infinispan">
                <local-cache name="passivation">
                    <file-store passivation="true" purge="false"/>
                </local-cache>
                <local-cache name="sso"/>
            </cache-container>
            <cache-container name="server" default-cache="default" modules="org.wildfly.clustering.server">
                <local-cache name="default"/>
            </cache-container>
            <cache-container name="hibernate" modules="org.infinispan.hibernate-cache">
                <local-cache name="entity">
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="local-query">
                    <heap-memory size="10000"/>
                    <expiration max-idle="100000"/>
                </local-cache>
                <local-cache name="timestamps"/>
                <local-cache name="pending-puts">
                    <expiration max-idle="60000"/>
                </local-cache>
            </cache-container>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:io:3.0">
            <worker name="default"/>
            <buffer-pool name="default"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jaxrs:2.0"/>
        <subsystem xmlns="urn:jboss:domain:jca:5.0">
            <archive-validation enabled="true" fail-on-error="true" fail-on-warn="false"/>
            <bean-validation enabled="true"/>
            <default-workmanager>
                <short-running-threads>
                    <core-threads count="50"/>
                    <queue-length count="50"/>
                    <max-threads count="50"/>
                    <keepalive-time time="10" unit="seconds"/>
                </short-running-threads>
                <long-running-threads>
                    <core-threads count="50"/>
                    <queue-length count="50"/>
                    <max-threads count="50"/>
                    <keepalive-time time="10" unit="seconds"/>
                </long-running-threads>
            </default-workmanager>
            <cached-connection-manager/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jdr:1.0"/>
        <subsystem xmlns="urn:jboss:domain:jmx:1.3">
            <expose-resolved-model/>
            <expose-expression-model/>
            <remoting-connector/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jpa:1.1">
            <jpa default-extended-persistence-inheritance="DEEP"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:jsf:1.1"/>
        <subsystem xmlns="urn:jboss:domain:jsr77:1.0"/>
        <subsystem xmlns="urn:jboss:domain:mail:4.0">
            <mail-session name="default" jndi-name="java:jboss/mail/Default">
                <smtp-server outbound-socket-binding-ref="mail-smtp"/>
            </mail-session>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:messaging-activemq:13.0">
            <server name="default">
                <security elytron-domain="ApplicationDomain"/>
                <statistics enabled="${wildfly.messaging-activemq.statistics-enabled:${wildfly.statistics-enabled:false}}"/>
                <security-setting name="#">
                    <role name="guest" send="true" consume="true" create-non-durable-queue="true" delete-non-durable-queue="true"/>
                </security-setting>
                <address-setting name="#" dead-letter-address="jms.queue.DLQ" expiry-address="jms.queue.ExpiryQueue" max-size-bytes="10485760" page-size-bytes="2097152" message-counter-history-day-limit="10"/>
                <http-connector name="http-connector" socket-binding="http" endpoint="http-acceptor"/>
                <http-connector name="http-connector-throughput" socket-binding="http" endpoint="http-acceptor-throughput">
                    <param name="batch-delay" value="50"/>
                </http-connector>
                <in-vm-connector name="in-vm" server-id="0">
                    <param name="buffer-pooling" value="false"/>
                </in-vm-connector>
                <http-acceptor name="http-acceptor" http-listener="default"/>
                <http-acceptor name="http-acceptor-throughput" http-listener="default">
                    <param name="batch-delay" value="50"/>
                    <param name="direct-deliver" value="false"/>
                </http-acceptor>
                <in-vm-acceptor name="in-vm" server-id="0">
                    <param name="buffer-pooling" value="false"/>
                </in-vm-acceptor>
                <jms-queue name="ExpiryQueue" entries="java:/jms/queue/ExpiryQueue"/>
                <jms-queue name="DLQ" entries="java:/jms/queue/DLQ"/>
                <connection-factory name="InVmConnectionFactory" entries="java:/ConnectionFactory" connectors="in-vm"/>
                <connection-factory name="RemoteConnectionFactory" entries="java:jboss/exported/jms/RemoteConnectionFactory" connectors="http-connector"/>
                <pooled-connection-factory name="activemq-ra" entries="java:/JmsXA java:jboss/DefaultJMSConnectionFactory" connectors="in-vm" transaction="xa"/>
            </server>
        </subsystem>
        <subsystem xmlns="urn:wildfly:metrics:1.0" security-enabled="false" exposed-subsystems="*" prefix="${wildfly.metrics.prefix:jboss}"/>
        <subsystem xmlns="urn:jboss:domain:modcluster:5.0">
            <proxy name="default" advertise-socket="modcluster" listener="ajp">
                <dynamic-load-provider>
                    <load-metric type="cpu"/>
                </dynamic-load-provider>
            </proxy>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:naming:2.0">
            <remote-naming/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:pojo:1.0"/>
        <subsystem xmlns="urn:jboss:domain:remoting:4.0">
            <http-connector name="http-remoting-connector" connector-ref="default" sasl-authentication-factory="application-sasl-authentication"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:request-controller:1.0"/>
        <subsystem xmlns="urn:jboss:domain:resource-adapters:6.0"/>
        <subsystem xmlns="urn:jboss:domain:sar:1.0"/>
        <subsystem xmlns="urn:jboss:domain:security-manager:1.0">
            <deployment-permissions>
                <maximum-set>
                    <permission class="java.security.AllPermission"/>
                </maximum-set>
            </deployment-permissions>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:transactions:6.0">
            <core-environment node-identifier="${jboss.tx.node.id:1}">
                <process-id>
                    <uuid/>
                </process-id>
            </core-environment>
            <recovery-environment socket-binding="txn-recovery-environment" status-socket-binding="txn-status-manager"/>
            <coordinator-environment statistics-enabled="${wildfly.transactions.statistics-enabled:${wildfly.statistics-enabled:false}}"/>
            <object-store path="tx-object-store" relative-to="jboss.server.data.dir"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:undertow:12.0" default-server="default-server" default-virtual-host="default-host" default-servlet-container="default" default-security-domain="other" statistics-enabled="${wildfly.undertow.statistics-enabled:${wildfly.statistics-enabled:false}}">
            <buffer-cache name="default"/>
            <server name="default-server">
                <ajp-listener name="ajp" socket-binding="ajp" max-parameters="30000" max-post-size="52428800"/>
                <http-listener name="default" socket-binding="http" redirect-socket="https" enable-http2="true"/>
                <https-listener name="https" socket-binding="https" ssl-context="applicationSSC" enable-http2="true"/>
                <host name="default-host" alias="localhost">
                    <location name="/" handler="welcome-content"/>
                    <http-invoker http-authentication-factory="application-http-authentication"/>
                </host>
            </server>
            <servlet-container name="default">
                <jsp-config/>
                <websockets/>
            </servlet-container>
            <handlers>
                <file name="welcome-content" path="${jboss.home.dir}/welcome-content"/>
            </handlers>
            <application-security-domains>
                <application-security-domain name="other" security-domain="ApplicationDomain"/>
            </application-security-domains>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:webservices:2.0" statistics-enabled="${wildfly.webservices.statistics-enabled:${wildfly.statistics-enabled:false}}">
            <wsdl-host>${jboss.bind.address:127.0.0.1}</wsdl-host>
            <endpoint-config name="Standard-Endpoint-Config"/>
            <endpoint-config name="Recording-Endpoint-Config">
                <pre-handler-chain name="recording-handlers" protocol-bindings="##SOAP11_HTTP ##SOAP11_HTTP_MTOM ##SOAP12_HTTP ##SOAP12_HTTP_MTOM">
                    <handler name="RecordingHandler" class="org.jboss.ws.common.invocation.RecordingServerHandler"/>
                </pre-handler-chain>
            </endpoint-config>
            <client-config name="Standard-Client-Config"/>
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:weld:4.0"/>
    </profile>
    <interfaces>
        <interface name="management">
            <inet-address value="${jboss.bind.address.management:127.0.0.1}"/>
        </interface>
        <interface name="public">
            <inet-address value="${jboss.bind.address:127.0.0.1}"/>
        </interface>
        <interface name="unsecure">
            <inet-address value="${jboss.bind.address.unsecure:127.0.0.1}"/>
        </interface>
        <interface name="private">
        <inet-address value="${jboss.bind.address.private:127.0.0.1}"/>
        </interface>
    </interfaces>
    <socket-binding-group name="standard-sockets" default-interface="public" port-offset="${jboss.socket.binding.port-offset:0}">
        <socket-binding name="ajp" port="${jboss.ajp.port:8009}"/>
        <socket-binding name="http" port="${jboss.http.port:8080}"/>
        <socket-binding name="https" port="${jboss.https.port:8443}"/>
        <socket-binding name="iiop" interface="unsecure" port="3528"/>
        <socket-binding name="iiop-ssl" interface="unsecure" port="3529"/>
        <socket-binding name="management-http" interface="management" port="${jboss.management.http.port:9990}"/>
        <socket-binding name="management-https" interface="management" port="${jboss.management.https.port:9993}"/>
        <socket-binding name="jgroups-mping"
                interface="private"
                multicast-address="${jboss.default.multicast.address:230.0.0.4}"
                multicast-port="45700"/>

    <socket-binding name="jgroups-tcp"
                interface="private"
                port="7600"/>

    <socket-binding name="jgroups-tcp-fd"
                interface="private"
                port="57600"/>

    <socket-binding name="jgroups-udp"
                interface="private"
                port="55200"
                multicast-address="${jboss.default.multicast.address:230.0.0.4}"
                multicast-port="45688"/>

    <socket-binding name="jgroups-udp-fd"
                interface="private"
                port="54200"/>

    <socket-binding name="modcluster"
                multicast-address="${jboss.modcluster.multicast.address:224.0.1.105}"
                multicast-port="23364"/>
        <socket-binding name="txn-recovery-environment" port="4712"/>
        <socket-binding name="txn-status-manager" port="4713"/>
        <outbound-socket-binding name="mail-smtp">
            <remote-destination host="${jboss.mail.server.host:localhost}" port="${jboss.mail.server.port:25}"/>
        </outbound-socket-binding>
    </socket-binding-group>
</server>

