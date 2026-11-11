
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS_ORIGINAL":test-connection-in-pool
{
    "outcome" => "success",
    "result" => [true]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS_ORIGINAL":read-attribute(name=user-name)
{
    "outcome" => "success",
    "result" => "sccd"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
