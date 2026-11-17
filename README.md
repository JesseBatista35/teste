
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# PID=$(pgrep -f "Server:srjtqapllx0056_sigaf_intra_8083"); echo "PID=$PID"; ls -l /proc/$PID/fd | grep -i log
PID=16582
lr-x------ 1 spjbotr2 jboss 64 Nov 17 03:06 169 -> /opt/open/jboss/7.0.0/modules/system/layers/base/org/jboss/as/logging/main/wildfly-logging-2.1.2.Final-redhat-1.jar
lr-x------ 1 spjbotr2 jboss 64 Nov 17 03:05 21 -> /opt/open/jboss/7.0.0/modules/system/layers/base/org/jboss/logging/main/jboss-logging-3.3.0.Final-redhat-1.jar
lr-x------ 1 spjbotr2 jboss 64 Nov 17 03:05 22 -> /opt/open/jboss/7.0.0/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.3.Final-redhat-1.jar
lr-x------ 1 spjbotr2 jboss 64 Nov 17 03:05 23 -> /opt/open/jboss/7.0.0/modules/system/layers/base/org/jboss/log4j/logmanager/main/log4j-jboss-logmanager-1.1.2.Final-redhat-2.jar
lr-x------ 1 spjbotr2 jboss 64 Nov 17 03:06 290 -> /opt/open/jboss/7.0.0/modules/system/layers/base/org/jboss/logging/jul-to-slf4j-stub/main/jul-to-slf4j-stub-1.0.1.Final-redhat-3.jar
lr-x------ 1 spjbotr2 jboss 64 Nov 17 03:06 292 -> /opt/open/jboss/7.0.0/modules/system/layers/base/org/slf4j/impl/main/slf4j-jboss-logmanager-1.0.3.GA-redhat-2.jar
l-wx------ 1 spjbotr2 jboss 64 Nov 17 03:05 295 -> /infra_app/logs/sigaf/srjtqapllx0056_sigaf_intra_8083.log
lr-x------ 1 spjbotr2 jboss 64 Nov 17 03:06 454 -> /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0056_sigaf_intra_8083/tmp/vfs/deployment/deployment44f28b218fdf9d2b/commons-logging-1.1.1.jar-7e1a0cb792eb3911/commons-logging-1.1.1.jar
l-wx------ 1 spjbotr2 jboss 64 Nov 17 03:06 50 -> /infra_app/logs/sigaf/server-srjtqapllx0056_sigaf_intra_8083.log
[root@srjtqapllx0056 p585600]#
