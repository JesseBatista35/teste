Vamos fechar o 401 do CCR. A ideia é descobrir o que o servidor do 6.4 (sifec5) enxerga diferente do 7.4 na hora de validar o token.

IPs
Máquina	IP	Uso
cbrdeapllx471 (DC 7.4)	10.116.97.59	CLI do 7.4
cbrdeapllx473 (HC 7.4)	10.116.97.79	servidor que dá o 401
sbrdeapllx0001 (DC 6.4)	10.116.88.20	descobrir qual HC atende o sifec5
HC do 6.4 do sifec5	sai do passo 1	servidor onde funciona
PASSO 1: no DC 6.4 (10.116.88.20), descobrir qual host roda o sifec-intranet5
sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999 --command="/host=*/server-config=*:read-attribute(name=group)" | grep -B8 'sifec-intranet5' | grep -E 'host|server-config'

A saída mostra o nome do host (por exemplo sbrdeapllx00XX) e o servidor. Se não conectar, me mande o erro, porque a porta do CLI do 6.4 pode ser outra.

PASSO 2: na 473 (7.4), o que este servidor enxerga
grep -iE 'login|caixa.gov' /etc/hosts; nslookup logindes.caixa.gov.br | tail -3
for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done
PASSO 3: no HC do 6.4 que saiu no passo 1, os mesmos testes
grep -iE 'login|caixa.gov' /etc/hosts; nslookup logindes.caixa.gov.br | tail -3
for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done
O que procurar na comparação
Se no 6.4 o realm internet devolver o kid MFeJ65... (ou o /etc/hosts apontar o logindes.caixa.gov.br para outro IP): achamos a causa. O 6.4 resolve o servidor de login de outro jeito, e replicamos o mesmo na 472 e na 473.
Se os dois devolverem o mesmo kid (olg3hb...): a diferença não está na rede. O próximo passo é ver o log do HC do 6.4 no horário do teste do Edson, para entender como ele aceitou o token.

Comece pelo passo 1 e me mande a saída.
