cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp && cd servers && rm -rf s* && cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*

exit

sudo systemctl start jboss-eap7_hc.service
ps -ef | grep jboss
