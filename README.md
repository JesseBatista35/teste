Para o teste do TRACE, siga esta ordem.

1. Ligar (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=TRACE)
/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=TRACE)

2. Testar: peça para abrirem o PJ (Consulta Clientes).

3. Coletar (no 473):

sudo grep -n "org.keycloak" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -vE "PreAuthActionsHandler|AuthenticatedActionsHandler|Policy enforcement" | tail -60

4. Desligar logo em seguida (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)
/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=INFO)

Se preferir esperar a resposta do Pablo sobre como o PJ lê as roles antes de ligar o TRACE, também faz sentido. Aí os passos 1 a 4 ficam para depois.
