root@caddeapllx2794 p585600]# /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# sleep 3; ps -ef | grep [h]ttpd
root     4148460 4147814  0 11:14 pts/4    00:00:00 vim httpd-sigec-comercial.conf
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# curl -s http://10.116.78.14:6666/mod_cluster-manager | grep -E 'Node|Balancer:' -A1
<h1> LBGroup mycluster_sigec2: <a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=ENABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Enable Nodes</a> <a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=DISABLE-APP&Range=DOMAIN&Domain=mycluster_sigec2">Disable Nodes</a> <a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=STOP-APP&Range=DOMAIN&Domain=mycluster_sigec2">Stop Nodes</a></h1>
<h1> Node sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104 (ajp://10.116.94.211:8829): </h1>
<a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=ENABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Enable Contexts</a> <a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=DISABLE-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Disable Contexts</a> <a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=STOP-APP&Range=NODE&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104">Stop Contexts</a><br/>
Balancer: mycluster_sigec2,LBGroup: mycluster_sigec2,Flushpackets: Off,Flushwait: 10000,Ping: 10000000,Smax: -1,Ttl: 60000000,Status: OK,Elected: 0,Read: 0,Transferred: 0,Connected: 0,Load: 66
<h2> Virtual Host 1:</h2><h3>Contexts:</h3><pre>/gec-api, Status: ENABLED Request: 0 <a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=DISABLE-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=default-host&Context=/gec-api">Disable</a> <a href="/mod_cluster-manager?nonce=a81e39c4-b633-48c8-aa35-da9417f1cfda&Cmd=STOP-APP&Range=CONTEXT&JVMRoute=sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104&Alias=default-host&Context=/gec-api">Stop</a>
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 503 Service Unavailable
< Server: Apache/2.4.57 (Red Hat)
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 503 Service Unavailable
< Server: Apache/2.4.57 (Red Hat)
[root@caddeapllx2794 p585600]#
