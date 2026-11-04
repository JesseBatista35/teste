oc rsh -n sipdm-des sipdm-api-estudante-des-266-5n6s8
while true; do date +%T; timeout 3 bash -c '</dev/tcp/10.116.100.127/1433' && echo OK || echo FALHOU; sleep 2; done

Adriano da Silva Fernandes, não, o egress IP não muda ao trocar o pod de nó. Ele é configurado por namespace, não por nó. Acabei de confirmar: o namespace sipdm-des continua com o egress IP 10.116.221.183, hospedado no nó ceadecldlx084 (10.116.208.104).

Também não é um IP único para o cluster inteiro: cada namespace tem o seu. Por isso aparecem outros IPs da faixa 10.116.220.x/221.x/222.x nas suas capturas, de outros sistemas.

O esperado é: independente do nó onde o pod rode (agora o ceadecldlx052), o tráfego é encaminhado internamente até o ceadecldlx084 e sai de lá com origem 10.116.221.183. Mas na sua captura de ontem saiu com 10.116.208.104 (IP do próprio 084).

Por isso preciso de mais uma captura (dst host 10.116.100.127 and port 1433), agora com o pod no novo nó. Me avisa quando montar que eu rodo o teste em loop a partir do pod. Se a origem continuar 10.116.208.104, o problema está no egress do OpenShift e eu aciono o time responsável.
