

[sudo] senha para p585600:
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# H=/opt/jbcs-httpd24-2.4/httpd
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# grep -RniE 'LimitRequestBody|SecRequestBodyLimit|Timeout' $H/conf $H/sites-available/*sigec-csc* 2>/dev/null
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# ls /logs/apache2/sigec-csc/
ls: não é possível acessar /logs/apache2/sigec-csc/: Arquivo ou diretório não encontrado
[root@caddeapllx756 p585600]# CFG=/opt/jboss/jboss-eap/standalone/configuration/standalone-full-ha.xml
[root@caddeapllx756 p585600]# grep -n 'ajp-listener\|node-timeout' $CFG
589:                <ajp-listener name="ajp" socket-binding="ajp"/>
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.244:9990"
[root@caddeapllx756 p585600]# $CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:write-attribute(name=max-post-size,value=209715200)'
{
    "outcome" => "success",
    "response-headers" => {
        "operation-requires-reload" => true,
        "process-state" => "reload-required"
    }
}
[root@caddeapllx756 p585600]# $CLI '/subsystem=modcluster/mod-cluster-config=configuration:write-attribute(name=node-timeout,value=600)'
{
    "outcome" => "success",
    "response-headers" => {
        "operation-requires-reload" => true,
        "process-state" => "reload-required"
    }
}
[root@caddeapllx756 p585600]# $CLI ':reload'
{
    "outcome" => "success",
    "result" => undefined
}
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]#
[root@caddeapllx756 p585600]# $CLI ':read-attribute(name=server-state)'
{
    "outcome" => "success",
    "result" => "running"
}
[root@caddeapllx756 p585600]# $CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:read-attribute(name=max-post-size)'
{
    "outcome" => "success",
    "result" => 209715200L
}
[root@caddeapllx756 p585600]#
