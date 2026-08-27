ps -ef | grep -i "java -D" | for i in `awk '{print $2}'`; do kill -9 $i;done
cd /opt/jboss/jboss-eap/hc/ && rm -rf data tmp && cd servers && rm -rf s* && cd /opt/jboss/jboss-eap/hc/log/servers/ && rm -rf s*
exit
