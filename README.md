oc get netnamespace sipdm-des
oc get hostsubnet ceadecldlx084.nprd.caixa


Adriano, não, o egress IP não muda ao trocar o pod de nó. Ele é configurado por namespace, não por nó: o namespace sipdm-des continua com o egress IP 10.116.221.183, hospedado no nó ceadecldlx084.

E não é um IP único para o cluster inteiro: cada namespace tem o seu (o cluster tem centenas, distribuídos entre os nós). Por isso aparecem outros IPs da faixa 10.116.220.x/221.x/222.x nas suas capturas, de outros sistemas.

O comportamento esperado é este: independentemente do nó onde o pod rode (agora o ceadecldlx052), o tráfego é encaminhado internamente até o ceadecldlx084 e sai de lá com origem 10.116.221.183. Só que, pela sua captura de ontem, saiu com 10.116.208.104 (o IP do 084).

Por isso preciso de mais uma captura com o pod no novo nó. Se a origem continuar 10.116.208.104, o problema está na configuração do egress no OpenShift e eu aciono o time responsável. Me avisa quando montar que eu rodo o teste.
