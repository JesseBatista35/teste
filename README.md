[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# journalctl -u jboss-eap-standalone --no-pager | tail -100
nov 16 12:30:09 caddeapllx2871.agil.nprd.caixa.gov.br runuser[26712]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 12:30:09 caddeapllx2871.agil.nprd.caixa.gov.br runuser[26712]: pam_unix(runuser:session): session closed for user jboss
nov 16 12:30:09 caddeapllx2871.agil.nprd.caixa.gov.br runuser[26716]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 12:30:09 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[26706]: Starting JBoss EAP:
nov 16 12:30:09 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[26977]: nov. 16, 2026 12:30:09 PM java.lang.System$LoggerFinder lambda$accessProvider$0
nov 16 12:30:09 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[26977]: WARNING: Failed to instantiate LoggerFinder provider; Using default.
nov 16 12:30:09 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[26977]: OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
nov 16 12:30:15 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[27149]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 16 12:30:15 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 16 12:30:19 caddeapllx2871.agil.nprd.caixa.gov.br runuser[26716]: pam_unix(runuser:session): session closed for user jboss
nov 16 12:30:19 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 16 12:30:19 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 16 12:30:19 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 17.266s CPU time.
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[56442]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br runuser[56444]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br runuser[56444]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br runuser[56448]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br runuser[56448]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br runuser[56452]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[56442]: Starting JBoss EAP:
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[56713]: nov. 16, 2026 3:15:38 PM java.lang.System$LoggerFinder lambda$accessProvider$0
nov 16 15:15:38 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[56713]: WARNING: Failed to instantiate LoggerFinder provider; Using default.
nov 16 15:15:39 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[56713]: OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
nov 16 15:15:44 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[57059]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 16 15:15:44 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 16 15:15:53 caddeapllx2871.agil.nprd.caixa.gov.br runuser[56452]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:15:53 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 16 15:15:53 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 16 15:15:53 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 20.659s CPU time.
nov 16 15:19:09 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 16 15:19:09 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[57932]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 16 15:19:09 caddeapllx2871.agil.nprd.caixa.gov.br runuser[57934]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:19:09 caddeapllx2871.agil.nprd.caixa.gov.br runuser[57934]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:19:10 caddeapllx2871.agil.nprd.caixa.gov.br runuser[57938]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:19:10 caddeapllx2871.agil.nprd.caixa.gov.br runuser[57938]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:19:10 caddeapllx2871.agil.nprd.caixa.gov.br runuser[57942]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:19:10 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[57932]: Starting JBoss EAP:
nov 16 15:19:10 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58203]: nov. 16, 2026 3:19:10 PM java.lang.System$LoggerFinder lambda$accessProvider$0
nov 16 15:19:10 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58203]: WARNING: Failed to instantiate LoggerFinder provider; Using default.
nov 16 15:19:10 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58203]: OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
nov 16 15:19:16 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58371]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 16 15:19:16 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 16 15:19:24 caddeapllx2871.agil.nprd.caixa.gov.br runuser[57942]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:19:24 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 16 15:19:24 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 16 15:19:24 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 20.667s CPU time.
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58577]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58579]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58579]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58583]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58583]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58587]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58577]: Starting JBoss EAP:
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58848]: nov. 16, 2026 3:27:00 PM java.lang.System$LoggerFinder lambda$accessProvider$0
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58848]: WARNING: Failed to instantiate LoggerFinder provider; Using default.
nov 16 15:27:00 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58848]: OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
nov 16 15:27:04 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58587]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:27:06 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58924]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 16 15:27:06 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58925]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 16 15:27:06 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58925]: Stopping JBoss EAP:
nov 16 15:27:06 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58927]: /opt/jboss-eap/bin/common_start.sh: linha 85: success: comando não encontrado
nov 16 15:27:06 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Deactivated successfully.
nov 16 15:27:06 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 16 15:27:06 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 5.488s CPU time.
nov 16 15:28:01 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 16 15:28:01 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58936]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 16 15:28:01 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58938]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:28:01 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58938]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:28:01 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58942]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:28:01 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58942]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:28:01 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58946]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 16 15:28:02 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[58936]: Starting JBoss EAP:
nov 16 15:28:02 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[59207]: nov. 16, 2026 3:28:02 PM java.lang.System$LoggerFinder lambda$accessProvider$0
nov 16 15:28:02 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[59207]: WARNING: Failed to instantiate LoggerFinder provider; Using default.
nov 16 15:28:02 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[59207]: OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
nov 16 15:28:07 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[59381]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 16 15:28:07 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 16 15:28:11 caddeapllx2871.agil.nprd.caixa.gov.br runuser[58946]: pam_unix(runuser:session): session closed for user jboss
nov 16 15:28:11 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 16 15:28:11 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 16 15:28:11 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 18.323s CPU time.
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Starting JBoss EAP Systemctl - STANDALONE...
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[143912]: /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh: linha 4: /etc/init.d/functions: Arquivo ou diretório inexistente
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br runuser[143914]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br runuser[143914]: pam_unix(runuser:session): session closed for user jboss
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br runuser[143918]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br runuser[143918]: pam_unix(runuser:session): session closed for user jboss
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br runuser[143922]: pam_unix(runuser:session): session opened for user jboss(uid=30000115) by (uid=0)
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[143912]: Starting JBoss EAP:
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[144183]: nov. 17, 2026 11:09:52 AM java.lang.System$LoggerFinder lambda$accessProvider$0
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[144183]: WARNING: Failed to instantiate LoggerFinder provider; Using default.
nov 17 11:09:52 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[144183]: OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
nov 17 11:09:58 caddeapllx2871.agil.nprd.caixa.gov.br jboss-eap-standalone.sh[144359]: /opt/jboss-eap/bin/common_start.sh: linha 58: success: comando não encontrado
nov 17 11:09:58 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: Started JBoss EAP Systemctl - STANDALONE.
nov 17 11:10:04 caddeapllx2871.agil.nprd.caixa.gov.br runuser[143922]: pam_unix(runuser:session): session closed for user jboss
nov 17 11:10:04 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Main process exited, code=exited, status=1/FAILURE
nov 17 11:10:04 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Failed with result 'exit-code'.
nov 17 11:10:04 caddeapllx2871.agil.nprd.caixa.gov.br systemd[1]: jboss-eap-standalone.service: Consumed 20.615s CPU time.
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# ls -lt /opt/jboss-eap/standalone/log/
total 176
-rw-r--r-- 1 jboss jboss  22832 nov 17 11:10 server.log
-rw-r--r-- 1 jboss jboss 152651 nov 16 15:28 server.log.2026-11-16
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 server.log.2024-09-30
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 gc.log.0.current
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 backupgc.log.current
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 audit.log
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# tail -300 /opt/jboss-eap/standalone/log/server.log
2026-11-17 11:09:53,551 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.3.Final-redhat-00001
2026-11-17 11:09:53,770 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.13.Final-redhat-00001
2026-11-17 11:09:53,778 INFO  [org.jboss.threads] (main) JBoss Threads version 2.4.0.Final-redhat-00001
2026-11-17 11:09:53,862 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Inicializando JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001)
2026-11-17 11:09:53,863 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Propriedades de sistema configurado:
        ElasticApm.attached = true
        [Standalone] =
        atlassian.org.osgi.framework.bootdelegation = META-INF.services,com.yourkit,com.singularity.*,com.jprofiler,com.jprofiler.*,org.apache.xerces,org.apache.xerces.*,org.apache.xalan,org.apache.xalan.*,sun.*,com.sun.jndi.*,com.icl.saxon,com.icl.saxon.*,javax.servlet,javax.servlet.*,com.sun.xml.bind.*,co.elastic.apm.agent.*
        co.elastic.apm.agent.shaded.slf4j.simpleLogger.dateTimeFormat = yyyy-MM-dd HH:mm:ss.SSS
        co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm = ERROR
        co.elastic.apm.agent.shaded.slf4j.simpleLogger.log.co.elastic.apm.agent.shaded = WARN
        co.elastic.apm.agent.shaded.slf4j.simpleLogger.logFile = System.out
        co.elastic.apm.agent.shaded.slf4j.simpleLogger.showDateTime = true
        elastic.apm.application_packages = br.gov.caixa
        elastic.apm.config_file = /opt/apm_agent/elasticapm-1.15.0.properties
        elastic.apm.environment = DES
        elastic.apm.global_labels = deployment=sigec-portabilidade-des-esteiras
        elastic.apm.server_urls = http://apm-server-devops.produtos.caixa
        elastic.apm.service_name = sigec-portabilidade
        file.encoding = UTF-8
        file.separator = /
        java.awt.headless = true
        java.class.path = /opt/jboss-eap/jboss-modules.jar
        java.class.version = 61.0
        java.home = /usr/lib/jvm/java-17-openjdk-17.0.13.0.11-4.el9.x86_64
        java.io.tmpdir = /tmp
        java.library.path = /usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
        java.net.preferIPv4Stack = true
        java.runtime.name = OpenJDK Runtime Environment
        java.runtime.version = 17.0.13+11-LTS
        java.specification.maintenance.version = 1
        java.specification.name = Java Platform API Specification
        java.specification.vendor = Oracle Corporation
        java.specification.version = 17
        java.util.logging.manager = org.jboss.logmanager.LogManager
        java.vendor = Red Hat, Inc.
        java.vendor.url = https://www.redhat.com/
        java.vendor.url.bug = https://access.redhat.com/support/cases/
        java.vendor.version = (Red_Hat-17.0.13.0.11-1)
        java.version = 17.0.13
        java.version.date = 2024-10-15
        java.vm.compressedOopsMode = 32-bit
        java.vm.info = mixed mode, sharing
        java.vm.name = OpenJDK 64-Bit Server VM
        java.vm.specification.name = Java Virtual Machine Specification
        java.vm.specification.vendor = Oracle Corporation
        java.vm.specification.version = 17
        java.vm.vendor = Red Hat, Inc.
        java.vm.version = 17.0.13+11-LTS
        javax.management.builder.initial = org.jboss.as.jmx.PluggableMBeanServerBuilder
        javax.net.ssl.trustStore = /opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks
        javax.net.ssl.trustStorePassword = <redacted>
        jboss.bind.address = 0.0.0.0
        jboss.bind.address.management = 0.0.0.0
        jboss.home.dir = /opt/jboss-eap
        jboss.host.name = caddeapllx2871
        jboss.modules.dir = /opt/jboss-eap/modules
        jboss.modules.policy-permissions = true
        jboss.modules.system.pkgs = org.jboss.byteman,org.jboss.logmanager,co.elastic.apm.agent
        jboss.node.name = caddeapllx2871
        jboss.qualified.host.name = caddeapllx2871.agil.nprd.caixa.gov.br
        jboss.server.base.dir = /opt/jboss-eap/standalone
        jboss.server.config.dir = /opt/jboss-eap/standalone/configuration
        jboss.server.data.dir = /opt/jboss-eap/standalone/data
        jboss.server.deploy.dir = /opt/jboss-eap/standalone/data/content
        jboss.server.log.dir = /logs/jboss/jboss-eap/standalone/sigec-portabilidade
        jboss.server.name = caddeapllx2871
        jboss.server.persist.config = true
        jboss.server.temp.dir = /opt/jboss-eap/standalone/tmp
        jdk.debug = release
        jdk.serialFilter = maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000
        line.separator =

        logging.configuration = file:/opt/jboss-eap/standalone/configuration/logging.properties
        module.path = /opt/jboss-eap/modules
        native.encoding = UTF-8
        org.jboss.boot.log.file = /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
        org.jboss.resolver.warning = true
        org.osgi.framework.bootdelegation = co.elastic.apm.agent.*
        os.arch = amd64
        os.name = Linux
        os.version = 5.14.0-362.8.1.el9_3.x86_64
        path.separator = :
        sun.arch.data.model = 64
        sun.boot.library.path = /usr/lib/jvm/java-17-openjdk-17.0.13.0.11-4.el9.x86_64/lib
        sun.cpu.endian = little
        sun.io.unicode.encoding = UnicodeLittle
        sun.java.command = /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-portabilidade -c standalone-full-ha.xml
        sun.java.launcher = SUN_STANDARD
        sun.jnu.encoding = UTF-8
        sun.management.compiler = HotSpot 64-Bit Tiered Compilers
        sun.util.logging.disableCallerCheck = true
        user.country = BR
        user.dir = /
        user.home = /home/jboss
        user.language = pt
        user.name = jboss
        user.timezone = America/Sao_Paulo
2026-11-17 11:09:53,863 DEBUG [org.jboss.as.config] (MSC service thread 1-2) Argumentos da VM: -D[Standalone] -Xlog:gc*:file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/gc.log:time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter=maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000 -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigec-portabilidade -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigec-portabilidade-des-esteiras --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties
2026-11-17 11:09:54,552 INFO  [org.wildfly.security] (ServerService Thread Pool -- 23) ELY00001: WildFly Elytron version 1.15.23.Final-redhat-00001
2026-11-17 11:09:54,859 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 18) WFLYCTL0033: A extensão 'security' é obsoleta e talvez não seja suportada em versões futuras
2026-11-17 11:09:55,219 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/core-service=management/management-interface=http-interface', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-11-17 11:09:55,292 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 41) WFLYCTL0028: O atributo 'security-realm' no recurso, no endereço '/subsystem=undertow/server=default-server/https-listener=https', é obsoleto e pode ser removido em uma versão futura. Veja a descrição do atributo no resultado da operação read-resource-description para saber mais sobre a substituição.
2026-11-17 11:09:55,305 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de framework.jar falhou
2026-11-17 11:09:55,306 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de framework_sisgd.jar falhou
2026-11-17 11:09:55,306 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de wmq.jmsra.rar falhou
2026-11-17 11:09:55,306 INFO  [org.jboss.as.server.deployment.scanner] (DeploymentScanner-threads - 1) WFLYDS0015: A nova tentativa implantação de gec-ear.ear falhou
2026-11-17 11:09:55,670 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("core-service" => "management"),
    ("security-realm" => "ManagementRealm")
]) - falha na descrição: "WFLYDM0145: O recurso 'security-realm' não tem suporte desde o Java 14"
2026-11-17 11:09:55,671 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("core-service" => "management"),
    ("security-realm" => "ApplicationRealm")
]) - falha na descrição: "WFLYDM0145: O recurso 'security-realm' não tem suporte desde o Java 14"
2026-11-17 11:09:55,678 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Criando serviço de gerenciamento http usando o socket-binding (management-http)
2026-11-17 11:09:55,688 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.8.16.Final-redhat-00001
2026-11-17 11:09:55,703 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.8.16.Final-redhat-00001
2026-11-17 11:09:55,751 INFO  [org.jboss.remoting] (MSC service thread 1-2) JBoss Remoting version 5.0.29.Final-redhat-00001
2026-11-17 11:09:55,807 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 48) WFLYJCA0004: Implantação do driver compatível-JDBC class org.h2.Driver (versão 1.4)
2026-11-17 11:09:55,812 INFO  [org.wildfly.extension.health] (ServerService Thread Pool -- 56) WFLYHEALTH0001: Ativando o Subsistema Básico de integridade
2026-11-17 11:09:55,821 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 48) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("subsystem" => "datasources"),
    ("jdbc-driver" => "oracle")
]) - falha na descrição: "WFLYJCA0041: Falha ao carregar o módulo para o driver [oracle]"
2026-11-17 11:09:55,842 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 58) WFLYCLINF0001: Ativação do subsistema Infinispan.
2026-11-17 11:09:55,854 INFO  [org.wildfly.iiop.openjdk] (ServerService Thread Pool -- 57) WFLYIIOP0001: Ativação de subsistema IIOP
2026-11-17 11:09:55,857 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 59) WFLYIO001: O operador 'default' configurou automaticamente para as threads de E/S 4 com o máximo de 32 threads de tarefas com base em seus 2 processadores disponíveis.
2026-11-17 11:09:55,874 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-2) WFLYELY00023: O arquivo '/opt/jboss-eap/standalone/configuration/application.keystore' da KeyStore não existe. Usado em branco.
2026-11-17 11:09:55,878 WARN  [org.wildfly.extension.elytron] (MSC service thread 1-4) WFLYELY01084: KeyStore /opt/jboss-eap/standalone/configuration/application.keystore não encontrado; ele será gerado automaticamente na primeira utilização com um certificado autoassinado para o host localhost
2026-11-17 11:09:55,879 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 48) WFLYJCA0004: Implantação do driver compatível-JDBC class com.ibm.db2.jcc.DB2Driver (versão 4.16)
2026-11-17 11:09:55,880 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 48) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("subsystem" => "datasources"),
    ("jdbc-driver" => "sybase1")
]) - falha na descrição: "WFLYJCA0115: O módulo para o driver [sybase] ou uma das suas dependências está faltando: [sybase]"
2026-11-17 11:09:55,880 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 48) WFLYCTL0013: Falha na operação ("add") - endereço ([
    ("subsystem" => "datasources"),
    ("jdbc-driver" => "p6spy")
]) - falha na descrição: "WFLYJCA0115: O módulo para o driver [com.p6spy] ou uma das suas dependências está faltando: [com.p6spy]"
2026-11-17 11:09:55,898 INFO  [org.jboss.as.clustering.jgroups] (ServerService Thread Pool -- 63) WFLYCLJG0001: Ativação do subsistema JGroups. Versão do JGroups 4.2.23
2026-11-17 11:09:55,901 INFO  [org.jboss.as.connector] (MSC service thread 1-3) WFLYJCA0009: Inicialização do Subsistema Jakarta Connectors (WildFly/IronJacamar 1.5.17.Final-redhat-00001)
2026-11-17 11:09:55,905 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = db2
2026-11-17 11:09:55,905 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-3) WFLYJCA0018: Serviço de driver iniciado com nome-do-driver = h2
2026-11-17 11:09:55,915 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 60) WFLYRS0016: RESTEasy versão 3.15.9.Final-redhat-00001
2026-11-17 11:09:55,937 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 66) WFLYJSF0007: Ativadas as seguintes implantações do Jakarta Server Faces: [main]
2026-11-17 11:09:55,990 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 73) WFLYNAM0001: Ativação do Subsistema de Nomeação
2026-11-17 11:09:55,995 INFO  [org.wildfly.extension.metrics] (ServerService Thread Pool -- 71) WFLYMETRICS0001: Ativando o subsistema de métricas de base
2026-11-17 11:09:56,020 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 79) WFLYCTL0013: Falha na operação ("add") - endereço ([("subsystem" => "security")]) - falha na descrição: "WFLYSEC0106: O recurso 'security' não tem suporte desde o Java 14"
2026-11-17 11:09:56,052 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 84) WFLYWS0002: Ativação da Extensão WebServices
2026-11-17 11:09:56,058 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 82) WFLYTX0013: O atributo node-identifier em /subsystem=transactions está definido com o valor padrão. Isso é perigoso para ambientes executando vários servidores. Certifique-se de que o valor do atributo é exclusivo.
2026-11-17 11:09:56,101 INFO  [org.jboss.as.ejb3] (MSC service thread 1-1) WFLYEJB0481: O pool estrito slsb-strict-max-pool está utilizando um tamanho de instância máximo de 32 (por classe) que é derivado do tamanho de pool do thead de trabalho.
2026-11-17 11:09:56,106 INFO  [org.jboss.as.ejb3] (MSC service thread 1-4) WFLYEJB0482: O pool estrito mdb-strict-max-pool está utilizando um tamanho de instância máximo de 8 (por classe) que é derivado do número de CPUs neste host.
2026-11-17 11:09:56,163 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-4) WFLYUT0003: Iniciando Undertow 2.2.33.SP1-redhat-00001
2026-11-17 11:09:56,191 INFO  [org.jboss.as.naming] (MSC service thread 1-4) WFLYNAM0003: Iniciando o Serviço de Nomeação
2026-11-17 11:09:56,265 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-4) WFLYMAIL0001: Sessão de e-mail associada [java:jboss/mail/Default]
2026-11-17 11:09:56,301 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 83) WFLYUT0014: Criando identificador de arquivo para caminho de acesso '/opt/jboss-eap/welcome-content' com as opções [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
2026-11-17 11:10:03,777 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: gec-ejb.jar) em 4ms
2026-11-17 11:10:03,778 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Implantação interrompida framework_sisgd.jar (runtime-name: framework_sisgd.jar) em 4ms
2026-11-17 11:10:03,778 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0028: Implantação interrompida wmq.jmsra.rar (runtime-name: wmq.jmsra.rar) em 5ms
2026-11-17 11:10:03,777 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-2) WFLYSRV0028: Implantação interrompida framework.jar (runtime-name: framework.jar) em 4ms
2026-11-17 11:10:03,787 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: gec-api.war) em 14ms
2026-11-17 11:10:03,834 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: gec-web.war) em 60ms
2026-11-17 11:10:03,845 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida gec-ear.ear (runtime-name: gec-ear.ear) em 72ms
2026-11-17 11:10:03,848 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 86) Stopping cache manager null on caddeapllx2871
2026-11-17 11:10:03,848 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 88) Stopping cache manager null on caddeapllx2871
2026-11-17 11:10:03,856 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 87) Stopping cache manager null on caddeapllx2871
2026-11-17 11:10:03,857 INFO  [org.infinispan.manager.DefaultCacheManager] (ServerService Thread Pool -- 89) Stopping cache manager null on caddeapllx2871
2026-11-17 11:10:03,862 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 86) ISPN000080: Disconnecting JGroups channel ejb
2026-11-17 11:10:03,864 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 87) ISPN000080: Disconnecting JGroups channel ejb
2026-11-17 11:10:03,865 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 89) ISPN000080: Disconnecting JGroups channel ejb
2026-11-17 11:10:03,865 INFO  [org.infinispan.CLUSTER] (ServerService Thread Pool -- 88) ISPN000080: Disconnecting JGroups channel ejb
2026-11-17 11:10:03,898 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "gec-ear.ear" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,899 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "wmq.jmsra.rar" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,899 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "framework_sisgd.jar" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,899 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 49) WFLYSRV0021: O procedimento da implantação "framework.jar" foi revertido com mensagem de falha: undefined
2026-11-17 11:10:03,904 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0008: Undertow HTTP ouvinte default está suspendendo
2026-11-17 11:10:03,911 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0019: Interrompendo host default-host
2026-11-17 11:10:03,919 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0008: Undertow AJP ouvinte ajp está suspendendo
2026-11-17 11:10:03,920 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0007: Undertow HTTP ouvinte default interrompido, estava vinculado a 0.0.0.0:8080
2026-11-17 11:10:03,923 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-2) WFLYUT0007: Undertow AJP ouvinte ajp interrompido, estava vinculado a 0.0.0.0:8009
2026-11-17 11:10:03,925 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0002: Sessão de e-mail não associada [java:jboss/mail/Default]
2026-11-17 11:10:03,925 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Fonte de dados sem limite [java:/jdbc/DB2SifecDS]
2026-11-17 11:10:03,925 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0099: Fonte de dados não transacional desvinculada: java:/jdbc/DB2SiempDS
2026-11-17 11:10:03,925 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-2) WFLYJCA0010: Fonte de dados sem limite [java:jboss/datasources/ExampleDS]
2026-11-17 11:10:03,926 INFO  [org.jboss.modcluster] (ServerService Thread Pool -- 58) MODCLUSTER000002: Initiating mod_cluster shutdown
2026-11-17 11:10:03,925 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-1) WFLYJCA0010: Fonte de dados sem limite [java:/jdbc/DB2SigecDS]
2026-11-17 11:10:03,938 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-3) WFLYUT0004: Interrompendo Undertow 2.2.33.SP1-redhat-00001
2026-11-17 11:10:03,942 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = h2
2026-11-17 11:10:03,946 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-2) WFLYJCA0019: Serviço de driver interrompido com nome-do-driver = db2
2026-11-17 11:10:03,959 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
2026-11-17 11:10:03,986 INFO  [org.jboss.as] (MSC service thread 1-1) WFLYSRV0050: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) interrompido em 13ms
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# cat /opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh | head -60
#!/bin/bash

# Source function library.
. /etc/init.d/functions

STARTUP_WAIT=5
SHUTDOWN_WAIT=5
JBOSS_HOME=/opt/jboss-eap
JBOSS_INSTANCE=standalone
JBOSS_INSTANCE_PATH=$JBOSS_HOME/$JBOSS_INSTANCE
IP_ADDR=0.0.0.0
JBOSS_USER=jboss
JBOSS_GROUP=jboss
JBOSS_CONFIG=standalone-full-ha.xml
JBOSS_PIDFILE=$JBOSS_INSTANCE_PATH/tmp/jboss-eap-$JBOSS_INSTANCE.pid
JBOSS_LOG_DIR=/logs/jboss/jboss-eap/$JBOSS_INSTANCE/sigec-portabilidade
JBOSS_CONSOLE_LOG=$JBOSS_LOG_DIR/console-stdout.log


JBOSS_SCRIPT="$JBOSS_HOME/bin/standalone.sh\
                -b $IP_ADDR\
                -bmanagement $IP_ADDR\
                -Djboss.server.base.dir=$JBOSS_INSTANCE_PATH\
                -Djboss.server.log.dir=$JBOSS_LOG_DIR"

prog="JBoss EAP"

. /opt/jboss-eap/bin/common_start.sh
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# ls -lt /opt/jboss-eap/standalone/log/ /var/log/jboss* 2>/dev/null
/opt/jboss-eap/standalone/log/:
total 176
-rw-r--r-- 1 jboss jboss  22832 nov 17 11:10 server.log
-rw-r--r-- 1 jboss jboss 152651 nov 16 15:28 server.log.2026-11-16
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 server.log.2024-09-30
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 gc.log.0.current
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 backupgc.log.current
-rwxrwxr-x 1 jboss jboss      0 set 30  2024 audit.log
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# /opt/jboss-eap/bin/standalone.sh --version
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /opt/jboss-eap

  JAVA: java

  JAVA_OPTS:  -Xlog:gc*:file="/opt/jboss-eap/standalone/log/gc.log":time,uptimemillis:filecount=5,filesize=3M -Djdk.serialFilter="maxbytes=10485760;maxdepth=128;maxarray=100000;maxrefs=300000" -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigec-portabilidade -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigec-portabilidade-des-esteiras  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED --add-exports=java.desktop/sun.awt=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldap=ALL-UNNAMED --add-exports=java.naming/com.sun.jndi.url.ldaps=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.lang.invoke=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.security=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.management/javax.management=ALL-UNNAMED --add-opens=java.naming/javax.naming=ALL-UNNAMED

=========================================================================

nov. 17, 2026 11:17:09 AM java.lang.System$LoggerFinder lambda$accessProvider$0
WARNING: Failed to instantiate LoggerFinder provider; Using default.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
11:17:10,294 INFO  [org.jboss.modules] (main) JBoss Modules version 1.12.3.Final-redhat-00001
JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001)
[root@caddeapllx2871 p585600]# java -version
openjdk version "17.0.13" 2024-10-15 LTS
OpenJDK Runtime Environment (Red_Hat-17.0.13.0.11-1) (build 17.0.13+11-LTS)
OpenJDK 64-Bit Server VM (Red_Hat-17.0.13.0.11-1) (build 17.0.13+11-LTS, mixed mode, sharing)
[root@caddeapllx2871 p585600]#
