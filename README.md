
[p585600@cbrdeapllx473 ~]$ sudo sed -n '5480,5568p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "URI=|task-3"
10:10:27,751 WARN  [org.hibernate.validator.internal.engine.ValidatorFactoryImpl] (default task-3) HV000258: Expression Language interpolation features are not explicitly enabled/disabled. Use 'ORG_HIBERNATE_VALIDATOR_EXPRESSION_LANGUAGE_ENABLED' environment variable, or 'org.hibernate.validator.expressionLanguageEnabled' system property to define the behavior. Defaulting to expression language features being disabled.
10:10:27,808 INFO  [io.undertow.request.dump] (default task-3)
               URI=/fec-web/emprest/userprofile/loadgroups
10:10:28,760 INFO  [stdout] (default task-3) Hibernate:
10:10:28,760 INFO  [stdout] (default task-3)     select
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_MATRICULA as NU_MATRI1_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.CO_CARGO_H05 as CO_CARGO2_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.DT_PRVSA_DSLGO as DT_PRVSA3_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NO_PESSOA as NO_PESSO4_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_CPF_EMPREGADO as NU_CPF_E5_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_DV_MATRICULA as NU_DV_MA6_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_FUNCAO_H03 as NU_FUNCA7_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_NATURAL_U24 as NU_NATUR8_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_NTRL_ALCCO_U24 as NU_NTRL_9_0_0_,
10:10:28,761 INFO  [stdout] (default task-3)         empregado0_.NU_UNIDADE_U24 as NU_UNID10_0_0_,
10:10:28,761 INFO  [stdout] (default task-3)         empregado0_.NU_UNDDE_ALCCO_U24 as NU_UNDD11_0_0_
10:10:28,761 INFO  [stdout] (default task-3)     from
10:10:28,761 INFO  [stdout] (default task-3)         FEC.FECVW001_EMPREGADO empregado0_
10:10:28,761 INFO  [stdout] (default task-3)     where
10:10:28,761 INFO  [stdout] (default task-3)         empregado0_.NU_MATRICULA=?
10:10:28,794 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-3) SQL Warning Code: 4223, SQLState: null
10:10:28,794 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-3) Origination unknown: [10228][11541][4.16.53] Ocorreram exceções de segurança ao carregar o driver. ERRORCODE=4223, SQLSTATE=null
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo sed -n '5400,5568p' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "URI=|task-3"
10:10:27,425 INFO  [io.undertow.request.dump] (default task-3)
               URI=/fec-web/resources/bundle/Messages_pt.properties
10:10:27,751 WARN  [org.hibernate.validator.internal.engine.ValidatorFactoryImpl] (default task-3) HV000258: Expression Language interpolation features are not explicitly enabled/disabled. Use 'ORG_HIBERNATE_VALIDATOR_EXPRESSION_LANGUAGE_ENABLED' environment variable, or 'org.hibernate.validator.expressionLanguageEnabled' system property to define the behavior. Defaulting to expression language features being disabled.
10:10:27,808 INFO  [io.undertow.request.dump] (default task-3)
               URI=/fec-web/emprest/userprofile/loadgroups
10:10:28,760 INFO  [stdout] (default task-3) Hibernate:
10:10:28,760 INFO  [stdout] (default task-3)     select
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_MATRICULA as NU_MATRI1_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.CO_CARGO_H05 as CO_CARGO2_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.DT_PRVSA_DSLGO as DT_PRVSA3_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NO_PESSOA as NO_PESSO4_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_CPF_EMPREGADO as NU_CPF_E5_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_DV_MATRICULA as NU_DV_MA6_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_FUNCAO_H03 as NU_FUNCA7_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_NATURAL_U24 as NU_NATUR8_0_0_,
10:10:28,760 INFO  [stdout] (default task-3)         empregado0_.NU_NTRL_ALCCO_U24 as NU_NTRL_9_0_0_,
10:10:28,761 INFO  [stdout] (default task-3)         empregado0_.NU_UNIDADE_U24 as NU_UNID10_0_0_,
10:10:28,761 INFO  [stdout] (default task-3)         empregado0_.NU_UNDDE_ALCCO_U24 as NU_UNDD11_0_0_
10:10:28,761 INFO  [stdout] (default task-3)     from
10:10:28,761 INFO  [stdout] (default task-3)         FEC.FECVW001_EMPREGADO empregado0_
10:10:28,761 INFO  [stdout] (default task-3)     where
10:10:28,761 INFO  [stdout] (default task-3)         empregado0_.NU_MATRICULA=?
10:10:28,794 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-3) SQL Warning Code: 4223, SQLState: null
10:10:28,794 WARN  [org.hibernate.engine.jdbc.spi.SqlExceptionHelper] (default task-3) Origination unknown: [10228][11541][4.16.53] Ocorreram exceções de segurança ao carregar o driver. ERRORCODE=4223, SQLSTATE=null
[p585600@cbrdeapllx473 ~]$



[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=workflow-credito-pj-web.war:read-resource
{
    "outcome" => "success",
    "result" => {
        "allow-any-hostname" => false,
        "always-refresh-token" => false,
        "auth-server-url" => undefined,
        "auth-server-url-for-backend-requests" => undefined,
        "autodetect-bearer-only" => false,
        "bearer-only" => false,
        "client-key-password" => undefined,
        "client-keystore" => undefined,
        "client-keystore-password" => undefined,
        "connection-pool-size" => undefined,
        "cors-allowed-headers" => undefined,
        "cors-allowed-methods" => undefined,
        "cors-max-age" => undefined,
        "disable-trust-manager" => false,
        "enable-basic-auth" => false,
        "enable-cors" => false,
        "expose-token" => false,
        "min-time-between-jwks-requests" => undefined,
        "principal-attribute" => undefined,
        "public-client" => false,
        "realm" => "intranet",
        "realm-public-key" => undefined,
        "register-node-at-startup" => false,
        "register-node-period" => undefined,
        "resource" => "cli-web-fec",
        "ssl-required" => "external",
        "token-minimum-time-to-live" => undefined,
        "token-store" => undefined,
        "truststore" => undefined,
        "truststore-password" => undefined,
        "turn-off-change-session-id-on-login" => false,
        "use-resource-role-mappings" => false,
        "credential" => {"secret" => undefined}
    }
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source=*:read-attribute(name=connection-url)
{
    "outcome" => "success",
    "result" => [
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "ExampleDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1"
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/OracleSifesDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@localhost:1521:XE",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/DB2SiempDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:db2://10.192.224.76:5021/CSD1",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/Db2SiccrDS_OLD")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@10.1.12.9:1521:ORADES01",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/DB2SiccrDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:db2://10.192.224.76:5021/CSD1",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSiempDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:cxextrux047.desenvolvimento.extracaixa:55000/RICDB001?SERVER_INITIATED_TRANSACTIONS=false",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "java:/jdbc/OracleSiccrDS_docker")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@localhost:1521:xe",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "java:/jdbc/OracleSiccrTributarioDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/OracleSiccrDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "java:/jdbc/OracleDataguardDS_caixa")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/IdmsSiapxDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:idms://10.192.224.76:1204/DICTAPX",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/OracleSiganDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@bdbr07.caixa:1521:orades01",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSiganDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:bdbr12.caixa:55000/RICDB001?SERVER_INITIATED_TRANSACTIONS=false",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSiricDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:bdbr12.caixa:55000/RICDB001?SERVER_INITIATED_TRANSACTIONS=false",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/DB2SiarcDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:db2://10.192.224.76:5021/CSD1",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/DB2SigecDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:db2://10.1.12.11:5023/CSD2",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/OracleSipgeDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@10.1.14.57:1521:ORADES01",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/OracleBndesDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@localhost:1521:xe",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/OracleSirurDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:oracle:thin:@scan-oradesbr01.extra.caixa.gov.br:1521:ORADES01",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSifbnDS_ORIGINAL")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:10.116.92.132:4101/FBNDEM",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSifbnDS_ori")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:10.192.230.120:4101/FBNDEM?SERVER_INITIATED_TRANSACTIONS=false",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSifbnDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSibanDS_ORIGINAL")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false",
            "rolled-back" => undefined
        },
        {
            "address" => [
                ("profile" => "full-ha-sifec-intranet"),
                ("subsystem" => "datasources"),
                ("data-source" => "jdbc/SybaseSibanDS")
            ],
            "outcome" => "success",
            "result" => "jdbc:sybase:Tds:10.116.92.132:4407/FBNEM1?SERVER_INITIATED_TRANSACTIONS=false",
            "rolled-back" => undefined
        }
    ]
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/xa-data-source=*:read-attribute(name=driver-name)
{
    "outcome" => "success",
    "result" => [{
        "address" => [
            ("profile" => "full-ha-sifec-intranet"),
            ("subsystem" => "datasources"),
            ("xa-data-source" => "jdbc/DB2SifecDS")
        ],
        "outcome" => "success",
        "result" => "db2"
    }]
}

[domain@localhost:9999 /]
