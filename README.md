1. Veja para onde os datasources apontam (no 471, no bash; o comando não mostra senha):

sudo awk '/<profile name="full-ha-sifec-intranet"/,/<\/profile>/' /opt/jboss/jboss-eap/domain/configuration/domain.xml | grep -oE 'jndi-name="[^"]*"|<connection-url>[^<]*|<user-name>[^<]*'

2. Pegue a SQL que o PJ executou no teste. O Hibernate já está imprimindo as queries no log (aquelas linhas [stdout] empregado0_...). Peça um novo teste e, logo depois, rode no 473:

sudo grep -nE "^14:[0-5][0-9].*\[stdout\]" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -80

Aí aparecem as tabelas que o PJ consultou na consulta de cliente e no perfil.



omain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources:read-children-names(child-type=data-source)
{
    "outcome" => "success",
    "result" => [
        "ExampleDS",
        "java:/jdbc/OracleDataguardDS_caixa",
        "java:/jdbc/OracleSiccrDS_docker",
        "java:/jdbc/OracleSiccrTributarioDS",
        "jdbc/DB2SiarcDS",
        "jdbc/DB2SiccrDS",
        "jdbc/DB2SiempDS",
        "jdbc/DB2SigecDS",
        "jdbc/Db2SiccrDS_OLD",
        "jdbc/IdmsSiapxDS",
        "jdbc/OracleBndesDS",
        "jdbc/OracleSiccrDS",
        "jdbc/OracleSifesDS",
        "jdbc/OracleSiganDS",
        "jdbc/OracleSipgeDS",
        "jdbc/OracleSirurDS",
        "jdbc/SybaseSibanDS",
        "jdbc/SybaseSibanDS_ORIGINAL",
        "jdbc/SybaseSiempDS",
        "jdbc/SybaseSifbnDS",
        "jdbc/SybaseSifbnDS_ORIGINAL",
        "jdbc/SybaseSifbnDS_ori",
        "jdbc/SybaseSiganDS",
        "jdbc/SybaseSiricDS"
    ]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources:read-children-names(child-type=xa-data-source)
{
    "outcome" => "success",
    "result" => ["jdbc/DB2SifecDS"]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source=NOME:read-attribute(name=jndi-name)
{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: Management resource '[
    (\"profile\" => \"full-ha-sifec-intranet\"),
    (\"subsystem\" => \"datasources\"),
    (\"data-source\" => \"NOME\")
]' not found",
    "rolled-back" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
