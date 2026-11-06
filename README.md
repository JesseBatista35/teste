4. No 471 (jboss-cli), aponte o truststore e reinicie:

/server-group=sifec-intranet/system-property=javax.net.ssl.trustStore:write-attribute(name=value,value="/opt/jboss/truststore/sifec-cacerts.jks")
/server-group=sifec-intranet/system-property=javax.net.ssl.trustStorePassword:write-attribute(name=value,value="changeit")
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Espere ficar running.

5. Validar (no 473). Peça ao Inocêncio para repetir a chamada da API e rode:

sudo grep -nE "Loaded URLs|Failed to load URLs|PKIX" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5

O esperado é a linha mais recente Loaded URLs from https://login.des.caixa/..., sem PKIX, e a API sem 500.
