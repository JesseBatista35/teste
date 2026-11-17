Coleta por arquivo

Shell (como root):

bash
cat > /tmp/coleta.sh <<'EOF'
nproc
free -m
ps -ef | grep -o -- '-D\[Server:[^]]*\] -Xms[0-9a-zA-Z]* -Xmx[0-9a-zA-Z]*'
cat /infra_app/config/sigaf/sigaf_jconnector.properties
EOF
bash /tmp/coleta.sh

CLI:

bash
cat > /tmp/sigaf.cli <<'EOF'
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-resource(include-runtime=true)
/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=db2gaf:read-resource
/server-group=sigaf:read-resource
/server-group=sigaf/jvm=*:read-resource
EOF
sudo -u spjbotr2 /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0056:9990 --file=/tmp/sigaf.cli | grep -v -i password

As estatísticas do pool são uma foto do momento. O que mais interessa é rodar o comando de estatísticas do idmsapf enquanto a atualização em massa estiver rodando: se ActiveCount chegar a 20 e WaitCount/TimedOut crescerem, está confirmado que o gargalo é o pool do IDMS. Dá para pedir ao Cauan ou à Karina que disparem a atualização enquanto você coleta.




[domain@srjtqapllx0056:9990 /] cat > /tmp/sigaf.cli <<'EOF'
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-resource(include-runtime=true)
{
    "outcome" => "success",
    "result" => {
        "ActiveCount" => 5,
        "AvailableCount" => 20,
        "AverageBlockingTime" => 1L,
        "AverageCreationTime" => 9L,
        "AverageGetTime" => 5L,
        "AveragePoolTime" => 9959L,
        "AverageUsageTime" => 303L,
        "BlockingFailureCount" => 0,
        "CreatedCount" => 11957,
        "DestroyedCount" => 11952,
        "IdleCount" => 5,
        "InUseCount" => 0,
        "MaxCreationTime" => 1019L,
        "MaxGetTime" => 1095L,
        "MaxPoolTime" => 121538L,
        "MaxUsageTime" => 15512L,
        "MaxUsedCount" => 11,
        "MaxWaitCount" => 0,
        "MaxWaitTime" => 2L,
        "TimedOut" => 1928,
        "TotalBlockingTime" => 33L,
        "TotalCreationTime" => 111588L,
        "TotalGetTime" => 80388L,
        "TotalPoolTime" => 233261583L,
        "TotalUsageTime" => 4586584L,
        "WaitCount" => 0,
        "XACommitAverageTime" => 0L,
        "XACommitCount" => 0L,
        "XACommitMaxTime" => 0L,
        "XACommitTotalTime" => 0L,
        "XAEndAverageTime" => 0L,
        "XAEndCount" => 0L,
        "XAEndMaxTime" => 0L,
        "XAEndTotalTime" => 0L,
        "XAForgetAverageTime" => 0L,
        "XAForgetCount" => 0L,
        "XAForgetMaxTime" => 0L,
        "XAForgetTotalTime" => 0L,
        "XAPrepareAverageTime" => 0L,
        "XAPrepareCount" => 0L,
        "XAPrepareMaxTime" => 0L,
        "XAPrepareTotalTime" => 0L,
        "XARecoverAverageTime" => 0L,
        "XARecoverCount" => 0L,
        "XARecoverMaxTime" => 0L,
        "XARecoverTotalTime" => 0L,
        "XARollbackAverageTime" => 0L,
        "XARollbackCount" => 0L,
        "XARollbackMaxTime" => 0L,
        "XARollbackTotalTime" => 0L,
        "XAStartAverageTime" => 0L,
        "XAStartCount" => 0L,
        "XAStartMaxTime" => 0L,
        "XAStartTotalTime" => 0L,
        "statistics-enabled" => true
    }
}
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=db2gaf:read-resource
{
    "outcome" => "success",
    "result" => {
        "allocation-retry" => undefined,
        "allocation-retry-wait-millis" => undefined,
        "allow-multiple-users" => false,
        "background-validation" => false,
        "background-validation-millis" => undefined,
        "blocking-timeout-wait-millis" => undefined,
        "capacity-decrementer-class" => undefined,
        "capacity-decrementer-properties" => undefined,
        "capacity-incrementer-class" => undefined,
        "capacity-incrementer-properties" => undefined,
        "check-valid-connection-sql" => undefined,
        "connectable" => false,
        "connection-listener-class" => undefined,
        "connection-listener-property" => undefined,
        "connection-url" => "jdbc:db2://10.216.80.111:446/RJKDB2DSDH",
        "datasource-class" => undefined,
        "driver-class" => "com.ibm.db2.jcc.DB2Driver",
        "driver-name" => "db2",
        "enabled" => true,
        "enlistment-trace" => true,
        "exception-sorter-class-name" => undefined,
        "exception-sorter-properties" => undefined,
        "flush-strategy" => undefined,
        "idle-timeout-minutes" => undefined,
        "initial-pool-size" => undefined,
        "jndi-name" => "java:/db2gaf",
        "jta" => false,
        "max-pool-size" => undefined,
        "mcp" => "org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool",
        "min-pool-size" => undefined,
        "new-connection-sql" => undefined,
        "password" => "pdf83exb",
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
        "use-ccm" => false,
        "use-fast-fail" => false,
        "use-java-context" => true,
        "use-try-lock" => undefined,
        "user-name" => "SGAFTR01",
        "valid-connection-checker-class-name" => undefined,
        "valid-connection-checker-properties" => undefined,
        "validate-on-match" => false,
        "connection-properties" => undefined,
        "statistics" => {
            "pool" => undefined,
            "jdbc" => undefined
        }
    }
}
[domain@srjtqapllx0056:9990 /] /server-group=sigaf:read-resource
{
    "outcome" => "success",
    "result" => {
        "management-subsystem-endpoint" => false,
        "profile" => "sigaf",
        "socket-binding-default-interface" => undefined,
        "socket-binding-group" => "sigaf",
        "socket-binding-port-offset" => 0,
        "deployment" => {
            "DBConnect.ear" => undefined,
            "sigaf-ear.ear" => undefined
        },
        "deployment-overlay" => undefined,
        "jvm" => {"sigaf" => undefined},
        "system-property" => {
            "br.gov.caixa.psc.connector.util.Config" => undefined,
            "sisgr.webservice" => undefined,
            "javax.net.ssl.trustStore" => undefined,
            "javax.net.ssl.trustStorePassword" => undefined,
            "javax.net.ssl.trustStoreType" => undefined
        }
    }
}
[domain@srjtqapllx0056:9990 /] /server-group=sigaf/jvm=*:read-resource
{
    "outcome" => "success",
    "result" => [{
        "address" => [
            ("server-group" => "sigaf"),
            ("jvm" => "sigaf")
        ],
        "outcome" => "success",
        "result" => {
            "agent-lib" => undefined,
            "agent-path" => undefined,
            "env-classpath-ignored" => undefined,
            "environment-variables" => undefined,
            "heap-size" => "1024m",
            "java-agent" => undefined,
            "java-home" => undefined,
            "jvm-options" => undefined,
            "launch-command" => undefined,
            "max-heap-size" => "1024m",
            "max-permgen-size" => undefined,
            "permgen-size" => "128m",
            "stack-size" => undefined,
            "type" => undefined
        }
    }]
}
[domain@srjtqapllx0056:9990 /] EOF
Unexpected command 'EOF'. Type 'help --commands' for the list of supported commands.
[domain@srjtqapllx0056:9990 /]



[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[root@srjtqapllx0056 p585600]# sudo -u spjbotr2 /opt/open/jboss/7.0.0/bin/jboss-cli.sh --connect --controller=srjtqapllx0056:9990 --file=/tmp/sigaf.cli | grep -v -i password
File /tmp/sigaf.cli doesn't exist.
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#


saiu do cli


[p585600@srjtqapllx0056 ~]$
[p585600@srjtqapllx0056 ~]$ sudo su
[root@srjtqapllx0056 p585600]# bash nproc; free -m ps -ef | grep -o '-D[Server:[^]]] -Xms[0-9a-zA-Z] -Xmx[0-9a-zA-Z]*' cat /infra_app/config/sigaf/sigaf_jconnector.properties
/bin/nproc: /bin/nproc: cannot execute binary file
grep: unknown devices method
free: invalid option -- 'e'

Usage:
 free [options]

Options:
 -b, --bytes         show output in bytes
 -k, --kilo          show output in kilobytes
 -m, --mega          show output in megabytes
 -g, --giga          show output in gigabytes
     --tera          show output in terabytes
     --peta          show output in petabytes
 -h, --human         show human-readable output
     --si            use powers of 1000 not 1024
 -l, --lohi          show detailed low and high memory statistics
 -t, --total         show total for RAM + swap
 -s N, --seconds N   repeat printing every N seconds
 -c N, --count N     repeat printing N times, then exit
 -w, --wide          wide output

     --help     display this help and exit
 -V, --version  output version information and exit

For more details see free(1).
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]# cat > /tmp/coleta.sh <<'EOF'
> nproc
> free -m
> ps -ef | grep -o -- '-D\[Server:[^]]*\] -Xms[0-9a-zA-Z]* -Xmx[0-9a-zA-Z]*'
> cat /infra_app/config/sigaf/sigaf_jconnector.properties
> EOF
[root@srjtqapllx0056 p585600]# bash /tmp/coleta.sh
4
              total        used        free      shared  buff/cache   available
Mem:          31993        8369         793        1607       22830       21623
Swap:          2039          51        1988
-D[Server:srjtqapllx0056_siind_intra_8080] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_sicse_intra_8081] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_sicrh_intra_8082] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_sigaf_intra_8083] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_sirep_intra_8084] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_sipar_intra_8085] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_siamt_intra_8086] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_siigf_intra_8087] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_sicrf_intra_8088] -Xms1024m -Xmx1024m
-D[Server:srjtqapllx0056_sitkn_intra_8089] -Xms1024m -Xmx1024m
br.gov.caixa.psc.connector.client.ClientFactory=br.gov.caixa.psc.connector.client.jcicsdirect.JCICSDirectFactory

#target tggafgr1a
br.gov.caixa.psc.connector.client.jcicsdirect.prefix.tggafgr1a=gr
br.gov.caixa.psc.connector.client.jcicsdirect.transid.tggafgr1a=gr1a
br.gov.caixa.psc.connector.client.jcicsdirect.program.tggafgr1a=pscpsdi3
br.gov.caixa.psc.connector.client.jcicsdirect.usr.tggafgr1a=sgaftr01
br.gov.caixa.psc.connector.client.jcicsdirect.pwd.tggafgr1a=pdf83exb
br.gov.caixa.psc.connector.client.jcicsdirect.host.tggafgr1a=jcicsdirect.caixa
br.gov.caixa.psc.connector.client.jcicsdirect.port.tggafgr1a=7002
br.gov.caixa.psc.connector.client.jcicsdirect.mincommarea.tggafgr1a=0
br.gov.caixa.psc.connector.client.jcicsdirect.programtype.tggafgr1a=3
br.gov.caixa.psc.connector.client.jcicsdirect.reuselogin.tggafgr1a=true

[root@srjtqapllx0056 p585600]#
[root@srjtqapllx0056 p585600]#

