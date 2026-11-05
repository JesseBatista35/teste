Para não ficarmos em dúvida sobre o estado atual, confira os dois níveis (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:read-attribute(name=level)
/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:read-attribute(name=level)
Se os dois mostrarem TRACE: está pronto. Peça o teste (abrir o PJ) e rode no 473:
sudo grep -n "org.keycloak" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -vE "PreAuthActionsHandler|AuthenticatedActionsHandler|Policy enforcement" | tail -60
Se algum mostrar INFO ou DEBUG: rode os dois comandos de TRACE da mensagem anterior e faça o teste.

Depois de pegar a saída, volte os dois para INFO.
