
[root@sbrdeapllx099 bin]# ps aux | grep java | grep -v grep | wc -l
2
[root@sbrdeapllx099 bin]# killall -9 java
[root@sbrdeapllx099 bin]# su - jboss -c "cd /opt/jboss/jboss-eap && nohup ./bin/domain.sh --host-config=host-slave.xml -b 10.116.94.206 -bmanagement 10.116.94.206 -Djboss.domain.base.dir=/opt/jboss/jboss-eap/hc -Djboss.domain.master.address=10.116.89.0 -Djboss.server.log.dir=/logs/jboss-eap/servers -c domain.xml > /tmp/jboss-restart.log 2>&1 &"
[root@sbrdeapllx099 bin]# sleep 40
[root@sbrdeapllx099 bin]# tail -50 /opt/jboss/jboss-eap/hc/log/servers/siosp_node1_lx099/server.log | grep -E "SUCCESS|ERROR|started|Servidor|SIOSP|implant"
2026-06-09 14:42:44,047 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 55) WFLYJSF0007: As seguintes implantações JSF foram ativadas: [main]
2026-06-09 14:42:44,642 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Iniciando a implantação do "ojdbc8.jar" (runtime-name: "ojdbc8.jar")
2026-06-09 14:42:48,336 INFO  [org.apache.activemq.artemis.ra] (MSC service thread 1-7) Resource adaptor started
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
[root@sbrdeapllx099 bin]#
