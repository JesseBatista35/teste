mount -t nfs 10.116.95.13:/export/jboss_modules64 /opt/jboss/jboss-eap/modules

ls -lat $JBOSS_HOME/domain/log/
tail -n 200 $JBOSS_HOME/domain/log/host-controller.log

tail -n 200 $JBOSS_HOME/domain/servers/sicem_node1_lx0005/log/server.log
