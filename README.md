oc get netnamespace sipdm-des
oc get hostsubnet ceadecldlx084.nprd.caixa


Adriano, não, o egress IP não muda ao trocar o pod de nó. Ele é configurado por namespace, não por nó: o namespace sipdm-des continua com o egress IP 10.116.221.183, hospedado no nó ceadecldlx084.

E não é um IP único para o cluster inteiro: cada namespace tem o seu (o cluster tem centenas, distribuídos entre os nós). Por isso aparecem outros IPs da faixa 10.116.220.x/221.x/222.x nas suas capturas, de outros sistemas.

O comportamento esperado é este: independentemente do nó onde o pod rode (agora o ceadecldlx052), o tráfego é encaminhado internamente até o ceadecldlx084 e sai de lá com origem 10.116.221.183. Só que, pela sua captura de ontem, saiu com 10.116.208.104 (o IP do 084).

Por isso preciso de mais uma captura com o pod no novo nó. Se a origem continuar 10.116.208.104, o problema está na configuração do egress no OpenShift e eu aciono o time responsável. Me avisa quando montar que eu rodo o teste.




exit
command terminated with exit code 127
-sh-4.2$ oc get netnamespace sipdm-des
NAME        NETID      EGRESS IPS
sipdm-des   11268449   ["10.116.221.183"]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get hostsubnet ceadecldlx084.nprd.caixa
NAME                       HOST                       HOST IP          SUBNET         EGRESS CIDRS          EGRESS IPS
ceadecldlx084.nprd.caixa   ceadecldlx084.nprd.caixa   10.116.208.104   25.3.40.0/23   ["10.116.192.0/19"]   ["10.116.222.190","10.116.222.6","10.116.209.59","10.116.221.183","10.116.222.164","10.116.222.206","10.116.220.210","10.116.222.5","10.116.220.180","10.116.221.245"]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
