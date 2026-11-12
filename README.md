
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# vi /tmp/custom-log4j.sh
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# bash /tmp/custom-log4j.sh
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# ls -la /log_jboss/config-log4j/ /log_jboss/sigsj_intranet/
/log_jboss/config-log4j/:
total 4
drwxr-xr-x 2 jboss jboss  32 out 23 12:55 .
drwxr-xr-x 4 jboss jboss  48 nov 12 17:00 ..
-rw-r--r-- 1 jboss jboss 879 nov 12 17:00 sigsj_intranet.xml

/log_jboss/sigsj_intranet/:
total 0
drwxr-xr-x 2 jboss jboss  6 nov 12 17:00 .
drwxr-xr-x 4 jboss jboss 48 nov 12 17:00 ..
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# grep 'File' /log_jboss/config-log4j/sigsj_intranet.xml
    <appender name="SIGSJ" class="org.apache.log4j.DailyRollingFileAppender">
        <param name="File" value="/log_jboss/sigsj_intranet/sigsj_intranet.log" />
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# cd /opt/jboss-eap/standalone/deployments/
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# touch sigsj_intranet-ear.ear.dodeploy
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# ls /opt/jboss-eap/standalone/deployments/ | grep sigsj_intranet
sigsj_intranet-ear.ear
sigsj_intranet-ear.ear.deployed
sigsj_intranet-ear.ear.dodeploy
sigsj_intranet-ear.ear.isdeploying
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# ls -la /log_jboss/sigsj_intranet/
total 4
drwxr-xr-x 2 jboss jboss  32 nov 12 17:01 .
drwxr-xr-x 4 jboss jboss  48 nov 12 17:00 ..
-rw-r--r-- 1 jboss jboss 475 nov 12 17:01 sigsj_intranet.log
[root@caddeapllx955 deployments]# ls /opt/jboss-eap/standalone/deployments/ | grep sigsj_intranet
sigsj_intranet-ear.ear
sigsj_intranet-ear.ear.deployed
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# tail -3 /log_jboss/sigsj_intranet/sigsj_intranet.log
[DEBUG] 2026/11/12 17:01:05 servlet.CaixaConfigServlet[ServerService Thread Pool -- 122] - SIGSJ INTRANET SUBIU COM SUCESSO!
[ INFO] 2026/11/12 17:01:05 extension.undertow[ServerService Thread Pool -- 122] - WFLYUT0021: Contexto web registrado: '/sigsj_intranet' para servidor 'default-server'
[ INFO] 2026/11/12 17:01:05 as.server[DeploymentScanner-threads - 1] - WFLYSRV0016: A implanta▒▒o "sigsj_intranet-ear.ear" foi substitu▒da pela implanta▒▒o "sigsj_intranet-ear.ear"
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# grep -E 'WFLYSRV0016|log4j:ERROR' /logs/jboss/jboss-eap/standalone/sigsj-intranet/server.log | tail -2
2026-11-12 17:01:05,415 INFO  [org.jboss.as.server] (DeploymentScanner-threads - 1) WFLYSRV0016: A implantação "sigsj_intranet-ear.ear" foi substituída pela implantação "sigsj_intranet-ear.ear"
[root@caddeapllx955 deployments]#




