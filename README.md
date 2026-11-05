1. Veja para onde os datasources apontam (no 471, no bash; o comando não mostra senha):

sudo awk '/<profile name="full-ha-sifec-intranet"/,/<\/profile>/' /opt/jboss/jboss-eap/domain/configuration/domain.xml | grep -oE 'jndi-name="[^"]*"|<connection-url>[^<]*|<user-name>[^<]*'

2. Pegue a SQL que o PJ executou no teste. O Hibernate já está imprimindo as queries no log (aquelas linhas [stdout] empregado0_...). Peça um novo teste e, logo depois, rode no 473:

sudo grep -nE "^14:[0-5][0-9].*\[stdout\]" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -80

Aí aparecem as tabelas que o PJ consultou na consulta de cliente e no perfil.



471):

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999

Dentro do CLI, liste os datasources do perfil:

/profile=full-ha-sifec-intranet/subsystem=datasources:read-children-names(child-type=data-source)
/profile=full-ha-sifec-intranet/subsystem=datasources:read-children-names(child-type=xa-data-source)

Para cada nome que aparecer, rode os comandos abaixo trocando NOME pelo nome do datasource (sem < >):

/profile=full-ha-sifec-intranet/subsystem=datasources/data-source=NOME:read-attribute(name=jndi-name)
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source=NOME:read-attribute(name=connection-url)
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source=NOME:read-attribute(name=user-name)

Se o nome estiver na lista de xa-data-source, troque data-source= por xa-data-source= e use :read-children-resources(child-type=xa-datasource-properties) no lugar do connection-url.

Pode me mandar a lista de nomes primeiro, que eu monto os comandos já com os nomes certos. E fica o lembrete do passo 2 (a SQL do teste no 473), que pode rodar em paralelo.
