
[root@caddeapllx763 p585600]#
[root@caddeapllx763 p585600]# CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.251:9990"
[root@caddeapllx763 p585600]# $CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:write-attribute(name=max-post-size,value=209715200)'
{
    "outcome" => "success",
    "response-headers" => {
        "operation-requires-reload" => true,
        "process-state" => "reload-required"
    }
}
[root@caddeapllx763 p585600]# $CLI '/subsystem=modcluster/mod-cluster-config=configuration:write-attribute(name=node-timeout,value=600)'
{
    "outcome" => "success",
    "response-headers" => {
        "operation-requires-reload" => true,
        "process-state" => "reload-required"
    }
}
[root@caddeapllx763 p585600]# $CLI ':reload'
{
    "outcome" => "success",
    "result" => undefined
}
[root@caddeapllx763 p585600]# CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.251:9990"
[root@caddeapllx763 p585600]# $CLI ':read-attribute(name=server-state)'
{
    "outcome" => "success",
    "result" => "running"
}
[root@caddeapllx763 p585600]# $CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:read-attribute(name=max-post-size)'
{
    "outcome" => "success",
    "result" => 209715200L
}
[root@caddeapllx763 p585600]#
