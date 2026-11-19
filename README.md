
[root@caddeapllx2854 ~]# cp -p /opt/jboss-eap/bin/standalone.conf /opt/jboss-eap/bin/standalone.conf.bkp_20261119
[root@caddeapllx2854 ~]# echo '' >> /opt/jboss-eap/bin/standalone.conf
echo '# SIGSJ - lib nativa SenhasSIIBC (criptografia SIPER/SIROT)' >> /opt/jboss-eap/bin/standalone.conf
echo 'JAVA_OPTS="$JAVA_OPTS -Djava.library.path=/apl/sigsj/lib"' >> /opt/jboss-eap/bin/standalone.conf
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# tail -3 /opt/jboss-eap/bin/standalone.conf
fi
# SIGSJ - lib nativa SenhasSIIBC (criptografia SIPER/SIROT)
JAVA_OPTS="$JAVA_OPTS -Djava.library.path=/apl/sigsj/lib"
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# systemctl restart jboss-eap-standalone
[root@caddeapllx2854 ~]# systemctl status jboss-eap-standalone --no-pager | head -5
● jboss-eap-standalone.service - JBoss EAP Systemctl - STANDALONE
     Loaded: loaded (/etc/systemd/system/jboss-eap-standalone.service; enabled; preset: disabled)
     Active: active (running) since Thu 2026-11-19 11:13:28 -03; 1min 41s ago
    Process: 1772973 ExecStart=/opt/jboss-eap/bin/init.d/jboss-eap-standalone.sh start (code=exited, status=0/SUCCESS)
   Main PID: 1772983 (runuser)
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"
java.library.path=/apl/sigsj/lib
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# ls -la /opt/jboss-eap/standalone/deployments/ | grep -E "deployed|failed"
-rw-r--r-- 1 jboss jboss       10 out 27 13:45 ojdbc8.jar.deployed
-rw-r--r-- 1 jboss jboss       22 nov 10 16:03 sigsj_internet-ear.ear.deployed
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
