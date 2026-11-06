
[root@caddeapllx2862 p585600]# grep -iE 'WSDL published|publish address' /logs/jboss/jboss-eap/standalone/sigsj-boleto/server.log | tail -5
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]# curl -s -o /dev/null -w '%{http_code}\n' "http://localhost/boletoService/<caminho-do-endpoint>?wsdl"
404
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#
[root@caddeapllx2862 p585600]#



