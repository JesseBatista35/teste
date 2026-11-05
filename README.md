O prompt está sem o #, então você está fora do modo batch.

1. Conferir:

/profile=full-ha-sifec-intranet/subsystem=security/security-domain=jaas-sifec:read-resource(recursive=true)
/profile=full-ha-sifec-intranet/subsystem=security/security-domain="java:/jaas/jaas-sifec":read-resource(recursive=true)

Nos dois deve aparecer só o org.keycloak.adapters.jboss.KeycloakLoginModule.

2. Reload (avise a sala antes):

/server-group=sifec-intranet:reload-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

O estado final deve ser running.

3. Validar no 473 que tudo subiu:

bash
sudo grep -E "WFLYSRV0010|WFLYSRV0021|WFLYSRV0025" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -12

Devem aparecer "SIFEC" e "SICCR-PJ" implantados, sem WFLYSRV0021.

4. Teste: peça para o Pablo abrir o PJ e consultar a lista de clientes. Para confirmar pelo Apache (476) que as APIs passaram a devolver conteúdo:

bash
sudo grep "workflow-credito-pj-web/api/perfil-acesso-usuario" /logs/apache2/SIFEC-INTRANET/sifec1.des.caixa-access.log | tail -3

O que queremos ver: depois do 200, em vez de -, um número de bytes maior que zero.
