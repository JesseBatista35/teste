$CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'
$CLI --command='/profile=full-ha-sigec-portabilidade2/subsystem=modcluster:read-resource(recursive=true)' | grep -E 'balancer|load-balancing-group|proxies' -A4
$CLI --command='/socket-binding-group=full-ha-sockets:read-resource(recursive=true)' | grep -A6 -E 'sbrdeaprlx05|caddeapllx2794'




curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer|Contexts' -A1
tail -50 /logs/apache2/sigec/mod_cluster-error.log


ssh sbrdeaprlx052
httpd -S 2>/dev/null | grep -i sigec

