
1835:    "WFLYCTL0412: Serviços necessários que não estão instalados:" => [
[root@caddeapllx955 deployments]# cd /opt/jboss-eap/standalone/deployments
[root@caddeapllx955 deployments]# \mv -f sirotcon-ejb.jar* /tmp/bkp_sirotcon/
[root@caddeapllx955 deployments]# ls -l
total 57992
-rw-r--r-- 1 jboss jboss  7497817 out 28 16:23 ojdbc8.jar
-rw-r--r-- 1 jboss jboss       10 out 28 16:23 ojdbc8.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 51856831 out 28 16:00 sigsj_intranet-ear.ear
-rw-r--r-- 1 jboss jboss     3466 out 28 16:47 sigsj_intranet-ear.ear.failed
-rw-r--r-- 1 jboss jboss       16 out 28 16:47 sirotcon-ejb.jar.undeployed
[root@caddeapllx955 deployments]# rm -f sigsj_intranet-ear.ear.failed
[root@caddeapllx955 deployments]# touch sigsj_intranet-ear.ear.dodeploy
[root@caddeapllx955 deployments]# sleep 40; ls -l
total 57992
-rw-r--r-- 1 jboss jboss  7497817 out 28 16:23 ojdbc8.jar
-rw-r--r-- 1 jboss jboss       10 out 28 16:23 ojdbc8.jar.deployed
-rwxrwxr-x 1 jboss jboss     8888 jun 23  2021 README.txt
-rwxrw-rw- 1 jboss jboss 51856831 out 28 16:00 sigsj_intranet-ear.ear
-rw-r--r-- 1 jboss jboss       22 out 28 16:00 sigsj_intranet-ear.ear.deployed
-rw-r--r-- 1 jboss jboss       16 out 28 16:47 sirotcon-ejb.jar.undeployed
[root@caddeapllx955 deployments]#
