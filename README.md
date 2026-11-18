
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=check-valid-connection-sql,value="SELECT CURRENT DATE FROM SYSCA.SINGLETON_NULL")
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined,
        "response-headers" => {
            "operation-requires-reload" => true,
            "process-state" => "reload-required"
        }
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=validate-on-match,value=true)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined,
        "response-headers" => {
            "operation-requires-reload" => true,
            "process-state" => "reload-required"
        }
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=idle-timeout-minutes,value=1)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined,
        "response-headers" => {
            "operation-requires-reload" => true,
            "process-state" => "reload-required"
        }
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=allocation-retry,value=3)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined,
        "response-headers" => {
            "operation-requires-reload" => true,
            "process-state" => "reload-required"
        }
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":write-attribute(name=allocation-retry-wait-millis,value=500)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "success",
        "result" => undefined,
        "response-headers" => {
            "operation-requires-reload" => true,
            "process-state" => "reload-required"
        }
    }}}}}}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/IdmsSiapxDS":flush-all-connection-in-pool
{
    "outcome" => "success",
    "result" => undefined,
    "response-headers" => {"process-state" => "reload-required"}
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /server-group=sifec-intranet:reload-servers(blocking=true)

