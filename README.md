cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp
cd /opt/jboss/jboss-eap/hc/servers && rm -rf s*
cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*

systemctl start jboss-eap7_hc

sleep 90
ps -ef | grep jboss
systemctl status jboss-eap7_hc
