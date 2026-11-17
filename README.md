D=/opt/jboss-eap/standalone/configuration
ls -l $D/standalone-full-ha.xml
grep -c "DB2SiempDS\|DB2SigecDS\|RecebimentoTedQueue\|wmq.jmsra" $D/standalone-full-ha.xml
grep -n "elytron\|security-realm" $D/standalone-full-ha.xml | head -5
ps -ef | grep -o "\-c [^ ]*\|--server-config=[^ ]*\|jboss.server.base.dir=[^ ]*" | sort -u
ls -l /opt/jboss-eap/standalone/deployments
