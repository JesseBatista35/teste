# AJP do Online e do Batch acessíveis a partir do Apache novo?
timeout 3 bash -c '</dev/tcp/10.116.94.211/8829' && echo "8829 OK" || echo "8829 FALHA"
timeout 3 bash -c '</dev/tcp/10.116.94.211/8859' && echo "8859 OK" || echo "8859 FALHA"

# O Online responde pelo Apache antigo? (mostra se o JBoss está saudável)
curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.98.52/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'

# Repetir no novo, após mais de 60s
curl -sv -o /dev/null -H "Host: sigecpor2.des.caixa" http://10.116.78.14/gec-web/por/ 2>&1 | grep -iE 'HTTP/1.1 |Server:|JSESSIONID'



$CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade-batch_node1_lx104:read-attribute(name=status)'
$CLI --command='/host=sbrdeapllx104_credito/server-config=sigec-portabilidade2_node1_lx104:read-attribute(name=status)'

