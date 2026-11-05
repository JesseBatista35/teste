
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSiccrDS":read-attribute(name=jndi-name)
{
    "outcome" => "success",
    "result" => "java:/jdbc/OracleSiccrDS"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSiccrDS":read-attribute(name=connection-url)
{
    "outcome" => "success",
    "result" => "jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSiccrDS":read-attribute(name=user-name)
{
    "outcome" => "success",
    "result" => "SCCRBD01"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/OracleSiccrDS":read-attribute(name=enabled)
{
    "outcome" => "success",
    "result" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="java:/jdbc/OracleSiccrDS_docker":read-attribute(name=jndi-name)
{
    "outcome" => "success",
    "result" => "java:/jdbc/OracleSiccrDS_docker"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="java:/jdbc/OracleSiccrDS_docker":read-attribute(name=connection-url)
{
    "outcome" => "success",
    "result" => "jdbc:oracle:thin:@localhost:1521:xe"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="java:/jdbc/OracleSiccrDS_docker":read-attribute(name=enabled)
{
    "outcome" => "success",
    "result" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="java:/jdbc/OracleDataguardDS_caixa":read-attribute(name=jndi-name)
{
    "outcome" => "success",
    "result" => "java:/jdbc/OracleDataguardDS"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="java:/jdbc/OracleDataguardDS_caixa":read-attribute(name=connection-url)
{
    "outcome" => "success",
    "result" => "jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="java:/jdbc/OracleSiccrTributarioDS":read-attribute(name=jndi-name)
{
    "outcome" => "success",
    "result" => "java:/jdbc/OracleSiccrTributarioDS"
}

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="java:/jdbc/OracleSiccrTributarioDS":read-attribute(name=connection-url)
{
    "outcome" => "success",
    "result" => "jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV"
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
