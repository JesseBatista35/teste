find /opt/jboss/jboss-eap -iname "*.xml" 2>/dev/null | grep -iE "domain|host"

grep -riE "orad01ng|cnpexdadvm01|siouv" /opt/jboss/jboss-eap/hc/ 2>/dev/null


grep -iE "domain-controller|remote" /opt/jboss/jboss-eap/hc/configuration/host-slave.xml

netstat -tlnp 2>/dev/null | grep java

ss -tlnp 2>/dev/null | grep java


/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.30:9990

/host=*/server=siouv_node1_lx0002/subsystem=datasources:read-resource(recursive=true)

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.30:9990 --command="/host=*/server=siouv_node1_lx0002/subsystem=datasources:read-resource(recursive=true)"

