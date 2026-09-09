ps -ef | grep java
ls -la /opt/jboss/jboss-eap/hc/
ls -la /opt/jboss/jboss-eap/hc/tmp/ 2>&1


mkdir -p /opt/jboss/jboss-eap/hc/tmp
chown jboss:jboss /opt/jboss/jboss-eap/hc/tmp
systemctl reset-failed jboss-eap7_hc
systemctl start jboss-eap7_hc
sleep 60
ps -ef | grep jboss
systemctl status jboss-eap7_hc
