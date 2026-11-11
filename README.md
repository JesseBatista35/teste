1. No 6.4: configuração completa do SybaseSibanDS (sem a senha)
sudo sed -n '19236,19252p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -v -i password
2. Na 471: a mesma coisa no 7.4

Entre no CLI (o comando anterior falhou porque você já tinha saído com exit e ele rodou no bash):

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
/profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-resource

Quando me mandar a saída, apague a linha do password.

3. Na 473: o erro detalhado do Sybase depois do restart
sudo awk 'NR>=38021' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE -A4 'SibanDS|JZ0|sybase|WFLYJCA' | head -40

Com essas três saídas eu vejo se a diferença está no SQL de validação, no driver ou no usuário, e te passo o ajuste exato.



[domain@localhost:9999 /]
[domain@localhost:9999 /] /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999
Node path format is wrong around 'opt' (index=1).

[domain@localhost:9999 /] /profile=full-ha-sifec-intranet/subsystem=datasources/data-source="jdbc/SybaseSibanDS":read-resource
{
    "outcome" => "success",
    "result" => {
        "allocation-retry" => undefined,
        "allocation-retry-wait-millis" => undefined,
        "allow-multiple-users" => false,
        "authentication-context" => undefined,
        "background-validation" => undefined,
        "background-validation-millis" => undefined,
        "blocking-timeout-wait-millis" => undefined,
        "capacity-decrementer-class" => undefined,
        "capacity-decrementer-properties" => undefined,
        "capacity-incrementer-class" => undefined,
        "capacity-incrementer-properties" => undefined,
        "check-valid-connection-sql" => "SELECT 1",
        "connectable" => false,
        "connection-listener-class" => undefined,
        "connection-listener-property" => undefined,
        "connection-url" => "jdbc:sybase:Tds:10.116.92.132:4101/EMDB04?SERVER_INITIATED_TRANSACTIONS=false",
        "credential-reference" => undefined,
        "datasource-class" => undefined,
        "driver-class" => undefined,
        "driver-name" => "sybase4",
        "elytron-enabled" => false,
        "enabled" => true,
        "enlistment-trace" => false,
        "exception-sorter-class-name" => undefined,
        "exception-sorter-properties" => undefined,
        "flush-strategy" => undefined,
        "idle-timeout-minutes" => undefined,
        "initial-pool-size" => undefined,
        "jndi-name" => "java:/jdbc/SybaseSibanDS",
        "jta" => true,
        "max-pool-size" => 50,
        "mcp" => "org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool",
        "min-pool-size" => 1,
        "new-connection-sql" => undefined,
        "password" => "abacaxi",
        "pool-fair" => undefined,
        "pool-prefill" => undefined,
        "pool-use-strict-min" => undefined,
        "prepared-statements-cache-size" => undefined,
        "query-timeout" => undefined,
        "reauth-plugin-class-name" => undefined,
        "reauth-plugin-properties" => undefined,
        "security-domain" => undefined,
        "set-tx-query-timeout" => false,
        "share-prepared-statements" => false,
        "spy" => false,
        "stale-connection-checker-class-name" => undefined,
        "stale-connection-checker-properties" => undefined,
        "statistics-enabled" => false,
        "track-statements" => "NOWARN",
        "tracking" => false,
        "transaction-isolation" => undefined,
        "url-delimiter" => undefined,
        "url-selector-strategy-class-name" => undefined,
        "use-ccm" => true,
        "use-fast-fail" => false,
        "use-java-context" => true,
        "use-try-lock" => undefined,
        "user-name" => "sccd",
        "valid-connection-checker-class-name" => "org.jboss.jca.adapters.jdbc.extensions.sybase.SybaseValidConnectionChecker",
        "valid-connection-checker-properties" => undefined,
        "validate-on-match" => undefined,
        "connection-properties" => undefined
    }
}

[domain@localhost:9999 /]





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
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo awk 'NR>=38021' /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -iE -A4 'SibanDS|JZ0|sybase|WFLYJCA' | head -40
Caused by: java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
        at com.sybase.jdbc4.jdbc.ErrorMessage.raiseError(ErrorMessage.java:832)
        at com.sybase.jdbc4.tds.Tds.processLoginAckToken(Tds.java:5578)
        at com.sybase.jdbc4.tds.Tds.doLogin(Tds.java:728)
        at com.sybase.jdbc4.tds.Tds.login(Tds.java:582)
        at com.sybase.jdbc4.jdbc.SybConnection.tryLogin(SybConnection.java:529)
        at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(SybConnection.java:3861)
        at com.sybase.jdbc4.jdbc.SybConnection.<init>(SybConnection.java:382)
        at com.sybase.jdbc4.jdbc.SybConnection.<init>(SybConnection.java:282)
        at com.sybase.jdbc4.jdbc.SybDriver.connect(SybDriver.java:258)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335) [ironjacamar-jdbc-1.5.21.Final-redhat-00001.jar:1.5.21.Final-redhat-00001]
        ... 38 more

16:46:38,728 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 81) WFLYCTL0013: Falha na operação ("test-connection-in-pool") - endereço ([
--
    ("data-source" => "jdbc/SybaseSibanDS")
]) - falha na descrição: "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida"
16:46:43,394 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 81) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364) [ironjacamar-jdbc-1.5.21.Final-redhat-00001.jar:1.5.21.Final-redhat-00001]
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371) [ironjacamar-jdbc-1.5.21.Final-redhat-00001.jar:1.5.21.Final-redhat-00001]
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287) [ironjacamar-jdbc-1.5.21.Final-redhat-00001.jar:1.5.21.Final-redhat-00001]
--
Caused by: java.sql.SQLException: JZ00L: Login failed.  Examine the SQLWarnings chained to this exception for the reason(s).
        at com.sybase.jdbc4.jdbc.ErrorMessage.raiseError(ErrorMessage.java:832)
        at com.sybase.jdbc4.tds.Tds.processLoginAckToken(Tds.java:5578)
        at com.sybase.jdbc4.tds.Tds.doLogin(Tds.java:728)
        at com.sybase.jdbc4.tds.Tds.login(Tds.java:582)
        at com.sybase.jdbc4.jdbc.SybConnection.tryLogin(SybConnection.java:529)
        at com.sybase.jdbc4.jdbc.SybConnection.handleHAFailover(SybConnection.java:3861)
        at com.sybase.jdbc4.jdbc.SybConnection.<init>(SybConnection.java:382)
        at com.sybase.jdbc4.jdbc.SybConnection.<init>(SybConnection.java:282)
        at com.sybase.jdbc4.jdbc.SybDriver.connect(SybDriver.java:258)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335) [ironjacamar-jdbc-1.5.21.Final-redhat-00001.jar:1.5.21.Final-redhat-00001]
        ... 38 more

16:46:43,396 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 81) WFLYCTL0013: Falha na operação ("test-connection-in-pool") - endereço ([
--
    ("data-source" => "jdbc/SybaseSibanDS")
]) - falha na descrição: "WFLYJCA0040: falha ao invocar a operação: WFLYJCA0047: A conexão não é válida"
[p585600@cbrdeapllx473 ~]$
