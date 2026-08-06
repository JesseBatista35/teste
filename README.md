tail -150 /opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/log/server.log | grep -iE "ssl|pkix|certificate|handshake|api.des.caixa"

sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999 \
  --command="/host=sbrdeapllx114_risco/server-config=sinad_node1_lx114:read-attribute(name=status)"


  tail -50 /opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/log/server.log
