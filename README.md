
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
[root@srjtqapllx0056 p585600]#



[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf:read-resource /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_inra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-resource(include-runtime=true) /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=dbgaf:read-resource /server-group=sigaf:read-resource /server-group=sigaf/jvm=*:read-resource
'read-resource/host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-resource' is not a valid operation name.
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf:read-resource
{
    "outcome" => "success",
    "result" => {
        "allocation-retry" => undefined,
        "allocation-retry-wait-millis" => undefined,
        "allow-multiple-users" => false,
        "background-validation" => true,
        "background-validation-millis" => undefined,
        "blocking-timeout-wait-millis" => undefined,
        "capacity-decrementer-class" => undefined,
        "capacity-decrementer-properties" => undefined,
        "capacity-incrementer-class" => undefined,
        "capacity-incrementer-properties" => undefined,
        "check-valid-connection-sql" => "SELECT CURRENT DATE FROM SYSCA.SINGLETON_NULL",
        "connectable" => false,
        "connection-listener-class" => undefined,
        "connection-listener-property" => undefined,
        "connection-url" => "jdbc:idms://idms.caixa:3740/DICTSSG",
        "datasource-class" => undefined,
        "driver-class" => "ca.idms.jdbc.IdmsJdbcDriver",
        "driver-name" => "idms",
        "enabled" => true,
        "enlistment-trace" => true,
        "exception-sorter-class-name" => undefined,
        "exception-sorter-properties" => undefined,
        "flush-strategy" => "IdleConnections",
        "idle-timeout-minutes" => 1L,
        "initial-pool-size" => 5,
        "jndi-name" => "java:/idmsapf",
        "jta" => false,
        "max-pool-size" => 20,
        "mcp" => "org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool",
        "min-pool-size" => 5,
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
        "statistics-enabled" => true,
        "track-statements" => "true",
        "tracking" => false,
        "transaction-isolation" => undefined,
        "url-delimiter" => undefined,
        "url-selector-strategy-class-name" => undefined,
        "use-ccm" => true,
        "use-fast-fail" => false,
        "use-java-context" => true,
        "use-try-lock" => undefined,
        "user-name" => "SGAFTR01",
        "valid-connection-checker-class-name" => undefined,
        "valid-connection-checker-properties" => undefined,
        "validate-on-match" => true,
        "connection-properties" => undefined,
        "statistics" => {
            "pool" => undefined,
            "jdbc" => undefined
        }
    }
}
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-
'read-' is not a valid operation name.
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=idmsapf/statistics=pool:read-resource(include-runtime=true) /host=srjtqaplx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source=db2gaf:read-resource /server-group=sigaf:read-resource /server-group=sigaf/jvm=*:read-resource
Can't reset to root in the middle of the path @154
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
