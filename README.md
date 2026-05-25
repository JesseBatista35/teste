[p585600@sspdeapllx0041 ~]$ sed -i 's|\n <socket-bindings|\n \n \n \n \n \n <socket-bindings|' /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
sed: couldn't open temporary file /opt/jboss/jboss-eap-7.0/domain/configuration/sedmkgLrG: Permission denied
[p585600@sspdeapllx0041 ~]$ ls -la /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
-rw-rw-r-- 1 jboss7 jboss7 10194 2026-02-02 17:46 /opt/jboss/jboss-eap-7.0/domain/configuration/host.xml
[p585600@sspdeapllx0041 ~]$
