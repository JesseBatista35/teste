1. Confira o aviso no log (no 473):

sudo grep -c "UT010024" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log

2. Veja o valor atual (CLI do 471; o esperado é false):

/profile=full-ha-sifec-intranet/subsystem=undertow/servlet-container=default:read-attribute(name=allow-non-standard-wrappers)

3. Libere e reinicie:

/profile=full-ha-sifec-intranet/subsystem=undertow/servlet-container=default:write-attribute(name=allow-non-standard-wrappers,value=true)
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

4. Teste o PJ: login, abrir o PJ e consultar o CNPJ. No F12, o perfil-acesso-usuario e o cliente/cnpj devem vir com Content-Length maior que 0. Se voltar a dar erro, desfaça com value=false e restart.

Antes do restart, confira se o PJ que está no ar é um build que sobe. Ontem o -9 falhou, e o restart vai carregar o deployment que estiver registrado:

/deployment=SICCR-PJ:read-attribute(name=runtime-name)
