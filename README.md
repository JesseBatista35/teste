
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.89.0:9999"
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# $CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)
>
>
>
>

[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]# curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.98.52/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
< HTTP/1.1 302 Found
< Set-Cookie: JSESSIONID="JrZEZk0RBaH-mzBS2IbrnRo-IoA4nZS-jBAY9xpQ.sbrdeapllx104_credito:sigec-portabilidade-batch_node1_lx104"; Version=1; Path=/gec-web/por
< HTTP/1.1 503 Service Unavailable
< HTTP/1.1 503 Service Unavailable
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
[root@caddeapllx2794 p585600]#
