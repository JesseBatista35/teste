LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
grep -n -A60 "sifec-ccr-pj-8.40.0.3-b5719" $LOG | grep -viE "SECRET|PASSWORD|SENHA|API_KEY|CLIENT_ID|TOKEN" > /tmp/erro_SICCR-PJ_8.40.0.3-b5719.log
chmod 644 /tmp/erro_SICCR-PJ_8.40.0.3-b5719.log
wc -l /tmp/erro_SICCR-PJ_8.40.0.3-b5719.log
