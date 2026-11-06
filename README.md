4. No 471 (jboss-cli), aponte o truststore e reinicie:

/server-group=sifec-intranet/system-property=javax.net.ssl.trustStore:write-attribute(name=value,value="/opt/jboss/truststore/sifec-cacerts.jks")
/server-group=sifec-intranet/system-property=javax.net.ssl.trustStorePassword:write-attribute(name=value,value="changeit")
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Espere ficar running.

5. Validar (no 473). Peça ao Inocêncio para repetir a chamada da API e rode:

sudo grep -nE "Loaded URLs|Failed to load URLs|PKIX" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5

O esperado é a linha mais recente Loaded URLs from https://login.des.caixa/..., sem PKIX, e a API sem 500.


p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ sudo grep -nE "Loaded URLs|Failed to load URLs|PKIX" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5
57091:  at sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:323) [rt.jar:1.8.0_482]
57102:  at sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:451) [rt.jar:1.8.0_482]
58008:12:25:44,862 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-33) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
58009:12:25:44,884 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-33) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
66976:12:38:20,135 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$




[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=javax.net.ssl.trustStore:write-attribute(name=value,value="/opt/jboss/truststore/sifec-cacerts.jks")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=javax.net.ssl.trustStorePassword:write-attribute(name=value,value="changeit")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet:restart-servers(blocking=true)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => undefined
}

[domain@localhost:9999 /]
[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
{
    "outcome" => "success",
    "result" => "running"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
