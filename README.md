
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)
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
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:read-attribute(name=level)
{
    "outcome" => "success",
    "result" => "DEBUG"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:read-attribute(name=level)
{
    "outcome" => "success",
    "result" => "INFO"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
