1. Corrija o SIFEC (no 471, dentro do jboss-cli):

/server-group=sifec-intranet/deployment=SIFEC:redeploy

Depois confira no 473 se os erros pararam:

sudo tail -20 /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -c NoSuchFileException
