
[root@caddeapllx1945 opt]# systemctl stop jboss-eap 2>/dev/null || true
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]#
[root@caddeapllx1945 opt]# rm -f /opt/jboss-eap/standalone/deployments/postgresql.jar.failed
[root@caddeapllx1945 opt]# rm -f /opt/jboss-eap/standalone/deployments/postgresql.jar
[root@caddeapllx1945 opt]# rm -f /opt/jboss-eap/standalone/deployments/*.failed
[root@caddeapllx1945 opt]# systemctl start jboss-eap
Failed to start jboss-eap.service: Unit jboss-eap.service not found.
[root@caddeapllx1945 opt]#

