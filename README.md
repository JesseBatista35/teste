
total 4
drwxr-xr-x 2 jboss jboss  32 nov 12 16:48 .
drwxr-xr-x 4 jboss jboss  48 nov 12 16:47 ..
-rw-r--r-- 1 jboss jboss 879 nov 12 16:47 sigsj_internet.xml
    <appender name="SIGSJ" class="org.apache.log4j.DailyRollingFileAppender">
        <param name="File" value="/log_jboss/sigsj_internet/sigsj_internet.log" />
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]#
[root@caddeapllx2854 p585600]# cd /opt/jboss-eap/standalone/deployments/
touch sigsj_internet-ear.ear.dodeploy
chown jboss:jboss sigsj_internet-ear.ear.dodeploy
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]# ls /opt/jboss-eap/standalone/deployments/ | grep sigsj_internet
sigsj_internet-ear.ear
sigsj_internet-ear.ear.deployed
sigsj_internet-ear.ear.dodeploy
sigsj_internet-ear.ear.isdeploying
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]# ls -la /log_jboss/sigsj_internet/
total 4
drwxr-xr-x 2 jboss jboss  32 nov 12 16:50 .
drwxr-xr-x 4 jboss jboss  48 nov 12 16:47 ..
-rw-r--r-- 1 jboss jboss 401 nov 12 16:50 sigsj_internet.log
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]# grep -E 'log4j:ERROR|WFLYSRV0010.*sigsj_internet' /logs/jboss/jboss-eap/standalone/sigsj-internet/server.log | tail -3
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
[root@caddeapllx2854 deployments]#
