
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# timeout 3 bash -c '</dev/tcp/10.116.94.211/8829' && echo "8829 OK" || echo "8829 FALHA"
8829 OK
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# timeout 3 bash -c '</dev/tcp/10.116.94.211/8859' && echo "8859 OK" || echo "8859 FALHA"
bash: connect: Connection refused
bash: line 1: /dev/tcp/10.116.94.211/8859: Connection refused
8859 FALHA
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.98.52/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 302 Found
< Server: JBoss-EAP/7
< Set-Cookie: JSESSIONID="ENkNxwtsOzTIhOWbCJLRDjGRJPW7c5YCkC6y7y3R.sbrdeapllx104_credito:sigec-portabilidade2_node1_lx104"; Version=1; Path=/gec-web/por
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]#
[root@caddeapllx2794 conf.d]# curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'
< HTTP/1.1 503 Service Unavailable
< Server: Apache/2.4.57 (Red Hat)
[root@caddeapllx2794 conf.d]#


**

**
There was 1 failed login attempt since the last successful login.
Last login: Tue Nov  3 10:36:45 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ $CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'
-sh: --command=/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status): No such file or directory
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sudo su
[sudo] password for p585600:
[root@sbrdeapllx069 p585600]# CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999"
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'
{
    "outcome" => "success",
    "result" => "STARTING"
}
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade2_node1_lx104:read-attribute(name=status)'
{
    "outcome" => "success",
    "result" => "STARTED"
}
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#




**
