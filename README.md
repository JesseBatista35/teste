cd /opt/jboss-eap/bin

./standalone.sh -c standalone-full-ha.xml 2>&1 | tail -100
