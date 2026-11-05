sudo grep -nE "11:5[0-9]" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE "ERROR|WARN|Exception|keycloak|perfil|cliente|SSO|token" | tail -60
