Aqui está o comando com o valor que o Pablo mandou:

/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_SECRET:write-attribute(name=value,value=cf65ddca-84c5-4548-81f2-163d245edf04)

Conferir:

/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_SECRET:read-attribute(name=value)

Restart:

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Com o estado running, peça para testarem o PJ: logout, login e abrir o PJ.
