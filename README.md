
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ for d in cxextrux047.desenvolvimento.extracaixa:55000 bdbr12.caixa:55000 10.116.92.132:4101 10.116.92.132:4102 10.116.92.132:4407 10.192.230.120:4101; do h=${d%:*}; p=${d#*:}; if timeout 5 bash -c "</dev/tcp/$h/$p" 2>/dev/null; then echo "OK      $d"; else echo "FALHOU  $d"; fi; done
OK      cxextrux047.desenvolvimento.extracaixa:55000
OK      bdbr12.caixa:55000
OK      10.116.92.132:4101
OK      10.116.92.132:4102
FALHOU  10.116.92.132:4407
FALHOU  10.192.230.120:4101
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -nE "WFLYSRV0021|JZ006|WFLYSRV0025" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -10

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
29653:14:45:08,366 ERROR [org.jboss.as.server] (ServerService Thread Pool -- 226) WFLYSRV0021: O procedimento da implantação "hub-api-2.2.0-b809.ear" foi revertido com mensagem de falha:
29888:Caused by: java.sql.SQLException: JZ006: Caught IOException: java.net.ConnectException: Connection timed out (Connection timed out)
38021:16:46:28,469 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.23.GA (WildFly Core 15.0.43.Final-redhat-00001) iniciado em 33690ms - Iniciado(s) 19323 de serviços 19583 (os serviços 658 estão lentos, passivos ou sob demanda)
[p585600@cbrdeapllx473 ~]$




[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=connection-url,value="jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false")
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

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=user-name,value="sccd")
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

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":write-attribute(name=password,value="abacaxi")
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
[domain@localhost:9999 /] run-batch
The batch failed with the following error (you are remaining in the batch editing mode to have a chance to correct the error): Without arguments the command can be executed only in the bat
ch mode.

[domain@localhost:9999 /] /server-group=sifec-intranet:restart-servers(blocking=true)
{
    "outcome" => "success",
    "result" => undefined,
    "server-groups" => undefined
}

[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool
{
    "outcome" => "failed",
    "result" => undefined,
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /]
[domain@localhost:9999 /] /host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473/subsystem=datasources/data-source="jdbc/SybaseSibanDS":test-connection-in-pool
{
    "outcome" => "failed",
    "result" => undefined,
    "failure-description" => "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida",
    "rolled-back" => true
}

[domain@localhost:9999 /]
[domain@localhost:9999 /] exit
[root@cbrdeapllx471 p585600]# /server-group=sifec-intranet:read-children-resources(child-type=deployment)
bash: syntax error near unexpected token `child-type=deployment'
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
