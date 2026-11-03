
Last login: Tue Nov  3 10:18:41 2026 from 10.116.78.14
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] password for p585600:
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999"
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/server-group=sigec-portabilidade2:read-attribute(name=profile)'
{
    "outcome" => "success",
    "result" => "full-ha-sigec-portabilidade2"
}
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/server-group=sigec-portabilidade-batch:read-attribute(name=socket-binding-group)'
{
    "outcome" => "success",
    "result" => "full-ha-sockets"
}
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/profile=full-ha-sigec-portabilidade-batch/subsystem=modcluster:read-resource(recursive=true)'
{
    "outcome" => "success",
    "result" => {"mod-cluster-config" => {"configuration" => {
        "advertise" => false,
        "advertise-security-key" => undefined,
        "advertise-socket" => "modcluster",
        "auto-enable-contexts" => true,
        "balancer" => "mycluster_sigec",
        "connector" => "ajp",
        "excluded-contexts" => "ROOT,invoker,jbossws,juddi,console",
        "flush-packets" => false,
        "flush-wait" => -1,
        "load-balancing-group" => "mycluster_sigec",
        "max-attempts" => 1,
        "node-timeout" => -1,
        "ping" => 10,
        "proxies" => [
            "sbrdeaprlx052_proxy",
            "sbrdeaprlx053_proxy",
            "caddeapllx2794_proxy"
        ],
        "proxy-list" => undefined,
        "proxy-url" => "/",
        "session-draining-strategy" => "DEFAULT",
        "simple-load-provider" => undefined,
        "smax" => -1,
        "socket-timeout" => 20,
        "ssl-context" => undefined,
        "status-interval" => 10,
        "sticky-session" => true,
        "sticky-session-force" => false,
        "sticky-session-remove" => false,
        "stop-context-timeout" => 10,
        "ttl" => -1,
        "worker-timeout" => -1,
        "dynamic-load-provider" => {"configuration" => {
            "decay" => 2,
            "history" => 9,
            "custom-load-metric" => undefined,
            "load-metric" => {"cpu" => {
                "capacity" => 1.0,
                "property" => undefined,
                "type" => "cpu",
                "weight" => 1
            }}
        }},
        "ssl" => undefined
    }}}
}
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
