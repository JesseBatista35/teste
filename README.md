/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999

/host=*:read-children-names(child-type=host)

/host=NOME_DO_HOST/server-config=sinad_node1_lx114:reload

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999 \
  --command="/host=NOME_DO_HOST/server-config=sinad_node1_lx114:reload"
