Confirmar que as aplicações voltaram depois do restart

No CLI da 471:

/server-group=sifec-intranet:read-children-resources(child-type=deployment)

Na 473, procure falhas no startup:

sudo awk 'NR>=38021' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0021|JZ00|WFLYSRV0025"

O esperado é aparecer só o WFLYSRV0025 (servidor iniciado), sem WFLYSRV0021.

Fica registrado que o jdbc/SybaseSifbnDS (FBNEM1, porta 4407) continua inacessível, mas igual ao 6.4, então não é regressão da migração.

Próximo da lista: sifec-apx e sifec-arc. Ficou pendente o grep na 471 e no 6.4.




[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo awk 'NR>=38021' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0021|JZ00|WFLYSRV0025"

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
16:46:28,469 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 33690ms - Iniciado(s) 19323 de serviços 19583 (os serviços 658 estão lentos, passivos ou sob demanda)
Caused by: java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
Caused by: java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
16:54:37,437 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 32490ms - Iniciado(s) 19323 de serviços 19583 (os serviços 658 estão lentos, passivos ou sob demanda)
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$


omain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value="adsads")
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
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-attribute(name=password)
{
    "outcome" => "success",
    "result" => "adsads"
}

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

[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool
{
    "outcome" => "success",
    "result" => [true]
}

[domain@localhost:9999 /] /server-group=sifec-intranet:read-children-resources(child-type=deployment)
{
    "outcome" => "success",
    "result" => {
        "SIBAN-MCM" => {
            "enabled" => true,
            "name" => "SIBAN-MCM",
            "runtime-name" => "mcm-1.0.1.23-b47.ear"
        },
        "SICCR-BDCAIXA" => {
            "enabled" => true,
            "name" => "SICCR-BDCAIXA",
            "runtime-name" => "sifec-bdcaixa-2.0.1-b39.ear"
        },
        "SICCR-HUB-FRONTEND2" => {
            "enabled" => true,
            "name" => "SICCR-HUB-FRONTEND2",
            "runtime-name" => "hub-web-1.10.0.1-b418.ear"
        },
        "SICCR-PARAMETROS" => {
            "enabled" => true,
            "name" => "SICCR-PARAMETROS",
            "runtime-name" => "sifec-ccr-parametros.ear"
        },
        "SICCR-PJ" => {
            "enabled" => true,
            "name" => "SICCR-PJ",
            "runtime-name" => "workflow-credito-pj-ear-8.40.1-20261105.202759-10.ear"
        },
        "SICDT-FEC" => {
            "enabled" => true,
            "name" => "SICDT-FEC",
            "runtime-name" => "sifec-cdt-3.24.3.003.ear"
        },
        "SIFEC" => {
            "enabled" => true,
            "name" => "SIFEC",
            "runtime-name" => "sifec-2.160.4.0.ear"
        },
        "SIFEC-CCR" => {
            "enabled" => true,
            "name" => "SIFEC-CCR",
            "runtime-name" => "SIFEC-CCR-6.3.0-b4587.ear"
        },
        "SIFEC-FBN4" => {
            "enabled" => true,
            "name" => "SIFEC-FBN4",
            "runtime-name" => "sifec-fbn-1.0.1.0-b84.ear"
        },
        "SIFEC-MINUTAS-FRONT" => {
            "enabled" => true,
            "name" => "SIFEC-MINUTAS-FRONT",
            "runtime-name" => "gerenciador-minutas-web-1.0.0-b14.ear"
        },
        "SQLSERVER-sqljdbc4.jar" => {
            "enabled" => true,
            "name" => "SQLSERVER-sqljdbc4.jar",
            "runtime-name" => "SQLSERVER-sqljdbc4.jar"
        },
        "framework-2.0.1-des.jar" => {
            "enabled" => true,
            "name" => "framework-2.0.1-des.jar",
            "runtime-name" => "framework.jar"
        },
        "framework_sisgd-1.0.0" => {
            "enabled" => true,
            "name" => "framework_sisgd-1.0.0",
            "runtime-name" => "framework_sisgd.jar"
        },
        "idmsjdbc-17.1.4.0.jar" => {
            "enabled" => true,
            "name" => "idmsjdbc-17.1.4.0.jar",
            "runtime-name" => "idmsjdbc-17.1.4.0.jar"
        },
        "idmsjdbc.jar" => {
            "enabled" => true,
            "name" => "idmsjdbc.jar",
            "runtime-name" => "idmsjdbc.jar"
        },
        "jconn4.jar" => {
            "enabled" => true,
            "name" => "jconn4.jar",
            "runtime-name" => "jconn4.jar"
        },
        "jconn42.jar" => {
            "enabled" => true,
            "name" => "jconn42.jar",
            "runtime-name" => "jconn42.jar"
        },
        "ojdbc6.jar" => {
            "enabled" => true,
            "name" => "ojdbc6.jar",
            "runtime-name" => "ojdbc6.jar"
        },
        "ojdbc7-12.1.0.2.jar" => {
            "enabled" => true,
            "name" => "ojdbc7-12.1.0.2.jar",
            "runtime-name" => "ojdbc7-12.1.0.2.jar"
        },
        "ojdbc8-19.19.0.0.jar" => {
            "enabled" => true,
            "name" => "ojdbc8-19.19.0.0.jar",
            "runtime-name" => "ojdbc8-19.19.0.0.jar"
        },
        "wmq.jmsra.rar" => {
            "enabled" => true,
            "name" => "wmq.jmsra.rar",
            "runtime-name" => "wmq.jmsra.rar"
        }
    }
}




me da a messenge compleiota pessoal atualizacao e tals
