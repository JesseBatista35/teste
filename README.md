[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# cd /opt/httpd/conf.d
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# cp -p mod_cluster.conf mod_cluster.conf.antes_fix_20261103
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# sed -i 's/^\(\s*\)ManagerBalancerName mycluster_sigec$/&\n\1CreateBalancers 0/' mod_cluster.conf
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# grep -n -A1 ManagerBalancerName mod_cluster.conf
12:  ManagerBalancerName mycluster_sigec
13-  CreateBalancers 0
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# httpd -t
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k stop
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# sleep 30
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
< HTTP/1.1 302 Found
< Set-Cookie: JSESSIONID="djO3x5BC0rYa6KakzbId5KvQtdyghsCcSMqSzO9G.sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104"; Version=1; Path=/gec-web/por
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
< HTTP/1.1 302 Found
< Set-Cookie: JSESSIONID="DSF6WQEuVPz9zYkv1pmkfJ0i_ddjxme1ezQFhRul.sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104"; Version=1; Path=/gec-web/por
[root@caddeapllx2794 conf.d]#




>
> ^C
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'
{
    "outcome" => "success",
    "result" => "STARTED"
}
[root@sbrdeapllx069 p585600]#

