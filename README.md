$CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'

curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.98.52/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
curl -sv -o /dev/null -H "Host: sigec.des.caixa"     http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |JSESSIONID'
