1. No DC 6.4: servidores e grupos sem filtro
sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999 --command="/host=*/server-config=*:read-attribute(name=group)" > /tmp/sc.txt 2>&1; grep -ic intranet5 /tmp/sc.txt; head -30 /tmp/sc.txt
2. Se o grep acima der 0, listar os server-groups que existem
sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999 --command=":read-children-names(child-type=server-group)"

Sobre o curl: no DC do 6.4 o seu shell passa pelo proxy proxydes.caixa (variável https_proxy do seu usuário), e foi isso que fez o teste falhar. O JBoss não necessariamente usa esse proxy, então esse teste no DC não vale. O teste que importa é no HC do sifec5. Quando chegar lá, rode o curl com --noproxy '*':

for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl --noproxy '*' -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done

Me mande a saída do passo 1 (e do 2, se precisar).
