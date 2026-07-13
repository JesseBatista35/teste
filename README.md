sed -n '13108p' /opt/jboss/jboss-eap/dc/configuration/domain.xml


slaVE
tail -100 /logs/jboss-eap/hc/servers/siouv_node1_lx0002/server.log | grep -iE "refused|exception|error"
