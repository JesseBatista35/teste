
[domain@10.116.94.221:9999 /] /host=sbrdeapllx114_risco/server-config=sinad_node1_lx114:reload
{
    "outcome" => "success",
    "result" => "STARTING"
}
[domain@10.116.94.221:9999 /] exit
[root@sbrdeapllx114 tmp]# tail -100 /opt/jboss/jboss-eap/hc/servers/sinad_node1_lx114/log/server.log | grep -i -A3 "ssl|pkix|certificate|handshake|api.des.caixa"
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#
[root@sbrdeapllx114 tmp]#

