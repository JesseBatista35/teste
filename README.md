sudo chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.log

sudo chown jboss7:jboss7 /opt/jboss/jboss-eap-7.0/domain/log/console.log

sudo su jboss7
cd /opt/jboss/jboss-eap-7.0
./jboss.sh host start &
