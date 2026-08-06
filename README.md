sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9990


/host=*/server-config=sinad_node1_lx114:reload


sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9990 \
  --command="/host=*/server-config=sinad_node1_lx114:reload"
