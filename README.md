in@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICDT_URLBASE:add(value="https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=CCR_PATH_CONCESSAO_SIMULACAO:add(value="/calculo-iof/v3/concessao/simulacao")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=CCR_PATH_CONCESSAO:add(value="/calculo-iof/v3/concessao")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SICDT_URL_BASE_API:add(value="https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_CDT_CLIENT_ID:add(value="cli-ser-cdt")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_CDT_CLIENT_SECRET:add(value="f470c180-6fa5-4408-a78c-9b8a2e967c9a")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=APIM_CDT_API_KEY:add(value="l790ce8632e39048e6a73aca22e279800a")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=APIM_CDT_API_SECRET:add(value="19527ce0ec5f486293151e7ecd1af043")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=CCR_PATH_IOF_ATRASO_SIMULACAO:add(value="/calculo-iof/v2/atraso/simulacao")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined
    }}}}}}
}

[domain@localhost:9999 /] /server-group=sifec-intranet/system-property=CCR_PATH_IOF_ATRASO:add(value="/calculo-iof/v2/atraso")
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
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources:read-children-names(child-type=jdbc-driver)
{
    "outcome" => "success",
    "result" => [
        "db2",
        "h2",
        "idms",
        "oracle19",
        "sybase4"
    ]
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sifec-cdt-web.war:read-attribute(name=resource)
{
    "outcome" => "success",
    "result" => "cli-web-fec"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sicdt-orig-api-rest.war:read-attribute(name=resource)
{
    "outcome" => "success",
    "result" => "cli-web-fec"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sicdt-orig-api-rest.war:read-attribute(name=bearer-only)
{
    "outcome" => "success",
    "result" => true
}

[domain@localhost:9999 /]
