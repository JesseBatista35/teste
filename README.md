

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSicdtDS":add(jndi-name="java:/jdbc/OracleSicdtDS", driver-name=oracle19, connection-url="jdbc:oracle:thin:@//oracle-nprd-1000.caixa:1521/prim_D01NGSRV", user-name=SCDTBD01, password="SENHA_AQUI", use-java-context=true, enabled=true, min-pool-size=10, max-pool-size=30, pool-prefill=true, check-valid-connection-sql="SELECT 1 FROM DUAL", background-validation=true, background-validation-millis=700000)
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
[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/OracleSicdtDS":test-connection-in-pool
{
    "outcome" => "failed",
    "result" => undefined,
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
