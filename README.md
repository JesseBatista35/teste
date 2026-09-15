grep -n "JBOSS_HOME\|JBOSS_CONFIG\|jboss.home" /etc/init.d/jboss-700
grep -n "JBOSS_HOME\|JBOSS_CONFIG\|jboss.home" /etc/init.d/jboss-640


/etc/init.d/jboss-700 status
/etc/init.d/jboss-700 stop
ps -ef | grep jboss
/etc/init.d/jboss-700 start
tail -f /opt/jboss/jboss/standalone/log/server.log
