
[root@caddeapllx955 deployments]#  ls -l /opt/jboss-eap/standalone/deployments/
total 58856
-rw-r--r-- 1 jboss jboss  7497817 out 28 16:23 ojdbc8.jar
-rw-r--r-- 1 jboss jboss       10 out 28 16:23 ojdbc8.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 51856831 out 28 16:00 sigsj_intranet-ear.ear
-rw-r--r-- 1 jboss jboss     3015 out 28 16:29 sigsj_intranet-ear.ear.failed
-rw-r--r-- 1 jboss jboss   884041 out 28 16:23 sirotcon-ejb.jar
-rw-r--r-- 1 jboss jboss       16 out 28 16:23 sirotcon-ejb.jar.deployed
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]#
[root@caddeapllx955 deployments]# mv /opt/jboss-eap/standalone/deployments/sirotcon-ejb.jar* /tmp/bkp_sirotcon/ 2>/dev/null

