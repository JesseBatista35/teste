1. Veja para onde os datasources apontam (no 471, no bash; o comando não mostra senha):

sudo awk '/<profile name="full-ha-sifec-intranet"/,/<\/profile>/' /opt/jboss/jboss-eap/domain/configuration/domain.xml | grep -oE 'jndi-name="[^"]*"|<connection-url>[^<]*|<user-name>[^<]*'

2. Pegue a SQL que o PJ executou no teste. O Hibernate já está imprimindo as queries no log (aquelas linhas [stdout] empregado0_...). Peça um novo teste e, logo depois, rode no 473:

sudo grep -nE "^14:[0-5][0-9].*\[stdout\]" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -80

Aí aparecem as tabelas que o PJ consultou na consulta de cliente e no perfil.
