killall -9 java
sleep 10
su - jboss -c "cd /opt/jboss/jboss-eap && nohup ./bin/domain.sh --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml > /tmp/jboss-restart.log 2>&1 &"
sleep 40
tail -50 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log | grep -E "SUCCESS|ERROR|started|Servidor|SIOSP|implant"
