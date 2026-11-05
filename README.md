1. Confira o 7.4 (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=undertow:read-children-names(child-type=server)
/profile=full-ha-sifec-intranet/subsystem=undertow/server=default-server:read-children-names(child-type=host)
/profile=full-ha-sifec-intranet/subsystem=undertow/server=default-server/host=default-host/setting=single-sign-on:read-resource

O esperado é default-server, default-host, e o terceiro dar “not found”, o que confirma que falta o SSO.

2. Crie o SSO igual ao do 6.4:

/profile=full-ha-sifec-intranet/subsystem=undertow/server=default-server/host=default-host/setting=single-sign-on:add(domain="des.caixa")

3. Reinicie:

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
