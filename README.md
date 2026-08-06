
[root@sbrdeapllx114 tmp]# /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.94.221:9999 \
>   --command="/host=sbrdeapllx114_risco/server-config=sinad_node1_lx114:read-attribute(name=status)"
{
    "outcome" => "success",
    "result" => "STARTED"
}
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
