
[p585600@caddeapllx2854 ~]$
[p585600@caddeapllx2854 ~]$ mkdir -p /tmp/intchk && cd /tmp/intchk
[p585600@caddeapllx2854 intchk]$
[p585600@caddeapllx2854 intchk]$
[p585600@caddeapllx2854 intchk]$
[p585600@caddeapllx2854 intchk]$ unzip -o -q /opt/jboss-eap/standalone/deployments/sigsj_internet-ear.ear sigsj_internet-war-2.67.war
error:  cannot create sigsj_internet-war-2.67.war
        Permission denied
[p585600@caddeapllx2854 intchk]$ sudo su
[sudo] senha para p585600:
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]# unzip -o -q /opt/jboss-eap/standalone/deployments/sigsj_internet-ear.ear sigsj_internet-war-2.67.war
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]#
[root@caddeapllx2854 intchk]# unzip -l sigsj_internet-war-2.67.war | grep -i ojdbc
  7497817  10-21-2026 14:51   WEB-INF/lib/ojdbc8-23.26.0.0.0.jar
[root@caddeapllx2854 intchk]#
