srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] ls /server-group
siamt  sicrf  sicrh  sicse  sigaf  siigf  siind  sipar  sirep  sitkn

[domain@srjtqapllx0056:9990 /] ls /profile
default  siamt    sicrf    sicrh    sicse    sigaf    siigf    siind    sipar    sirep    sitkn

[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server-config=srjtqapllx0056_sigaf_intra_8083:read-resource(recursive=true)
{
    "outcome" => "success",
    "result" => {
        "auto-start" => true,
        "cpu-affinity" => undefined,
        "group" => "sigaf",
        "name" => "srjtqapllx0056_sigaf_intra_8083",
        "priority" => undefined,
        "socket-binding-default-interface" => undefined,
        "socket-binding-group" => "sigaf",
        "socket-binding-port-offset" => 3,
        "update-auto-start-with-server-status" => false,
        "interface" => undefined,
        "jvm" => undefined,
        "path" => undefined,
        "ssl" => undefined,
        "system-property" => undefined
    }
}
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] ls /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/data-source
db2gaf   idmsapf

[domain@srjtqapllx0056:9990 /] ls /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=datasources/xa-data-source
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=transactions:read-attribute(name=default-timeout)
{
    "outcome" => "success",
    "result" => 300
}
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=io/worker=default:read-resource(include-runtime=true)
{
    "outcome" => "success",
    "result" => {
        "io-threads" => undefined,
        "stack-size" => 0L,
        "task-keepalive" => 60,
        "task-max-threads" => undefined
    }
}
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=undertow/server=default-server/http-listener=default:read-resource
{
    "outcome" => "success",
    "result" => {
        "allow-encoded-slash" => false,
        "allow-equals-in-cookie-value" => false,
        "always-set-keep-alive" => true,
        "buffer-pipelined-data" => false,
        "buffer-pool" => "default",
        "certificate-forwarding" => false,
        "decode-url" => true,
        "disallowed-methods" => ["TRACE"],
        "enable-http2" => false,
        "enabled" => true,
        "http2-enable-push" => true,
        "http2-header-table-size" => undefined,
        "http2-initial-window-size" => undefined,
        "http2-max-concurrent-streams" => undefined,
        "http2-max-frame-size" => undefined,
        "http2-max-header-list-size" => undefined,
        "max-buffered-request-size" => 16384,
        "max-connections" => undefined,
        "max-cookies" => 200,
        "max-header-size" => 1048576,
        "max-headers" => 200,
        "max-parameters" => 1000,
        "max-post-size" => 10485760L,
        "no-request-timeout" => 60000,
        "proxy-address-forwarding" => false,
        "read-timeout" => undefined,
        "receive-buffer" => undefined,
        "record-request-start-time" => false,
        "redirect-socket" => "https",
        "request-parse-timeout" => undefined,
        "resolve-peer-address" => false,
        "secure" => false,
        "send-buffer" => undefined,
        "socket-binding" => "http",
        "tcp-backlog" => 10000,
        "tcp-keep-alive" => undefined,
        "url-charset" => "UTF-8",
        "worker" => "default",
        "write-timeout" => undefined
    }
}
[domain@srjtqapllx0056:9990 /] /host=srjtqapllx0056/server=srjtqapllx0056_sigaf_intra_8083/subsystem=ejb3:read-resource(recursive=true)
{
    "outcome" => "success",
    "result" => {
        "default-clustered-sfsb-cache" => "simple",
        "default-distinct-name" => undefined,
        "default-entity-bean-instance-pool" => undefined,
        "default-entity-bean-optimistic-locking" => undefined,
        "default-mdb-instance-pool" => "mdb-strict-max-pool",
        "default-missing-method-permissions-deny-access" => true,
        "default-resource-adapter-name" => expression "${ejb.resource-adapter-name:activemq-ra.rar}",
        "default-security-domain" => "other",
        "default-sfsb-cache" => "simple",
        "default-sfsb-passivation-disabled-cache" => "simple",
        "default-singleton-bean-access-timeout" => 5000L,
        "default-slsb-instance-pool" => "slsb-strict-max-pool",
        "default-stateful-bean-access-timeout" => 5000L,
        "disable-default-ejb-permissions" => true,
        "enable-statistics" => undefined,
        "in-vm-remote-interface-invocation-pass-by-value" => true,
        "log-system-exceptions" => true,
        "cache" => {
            "simple" => {
                "aliases" => undefined,
                "passivation-store" => undefined
            },
            "distributable" => {
                "aliases" => [
                    "passivating",
                    "clustered"
                ],
                "passivation-store" => "infinispan"
            }
        },
        "cluster-passivation-store" => undefined,
        "file-passivation-store" => undefined,
        "mdb-delivery-group" => undefined,
        "passivation-store" => {"infinispan" => {
            "bean-cache" => undefined,
            "cache-container" => "ejb",
            "max-size" => 10000
        }},
        "remoting-profile" => undefined,
        "service" => {
            "timer-service" => {
                "default-data-store" => "default-file-store",
                "thread-pool-name" => "default",
                "database-data-store" => undefined,
                "file-data-store" => {"default-file-store" => {
                    "path" => "timer-service-data",
                    "relative-to" => "jboss.server.data.dir"
                }}
            },
            "remote" => {
                "cluster" => "ejb",
                "connector-ref" => "http-remoting-connector",
                "execute-in-worker" => true,
                "thread-pool-name" => "default",
                "channel-creation-options" => undefined
            },
            "iiop" => {
                "enable-by-default" => false,
                "use-qualified-name" => false
            },
            "async" => {"thread-pool-name" => "default"}
        },
        "strict-max-bean-instance-pool" => {
            "slsb-strict-max-pool" => {
                "derive-size" => "from-worker-pools",
                "max-pool-size" => 20,
                "timeout" => 5L,
                "timeout-unit" => "MINUTES"
            },
            "mdb-strict-max-pool" => {
                "derive-size" => "from-cpu-count",
                "max-pool-size" => 20,
                "timeout" => 5L,
                "timeout-unit" => "MINUTES"
            }
        },
        "thread-pool" => {"default" => {
            "keepalive-time" => {
                "time" => 100L,
                "unit" => "MILLISECONDS"
            },
            "max-threads" => 10,
            "name" => "default",
            "thread-factory" => undefined
        }}
    }
}
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]
[domain@srjtqapllx0056:9990 /]

