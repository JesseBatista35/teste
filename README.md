Se aparecer 10.116.88.20:9999, rode:

sudo /opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=10.116.88.20:9999 --command="/host=*/server-config=*:read-attribute(name=group)" | grep -B8 'sifec-intranet5' | grep -E 'host|server-config'

Se a porta for outra, troque o 9999 pela que aparecer.

2. Ver por que o curl falhou no 6.4 (só para registrar)
curl -k -s -m 10 -o /dev/null -w "%{http_code}\n" https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs; curl -k -s -m 10 -v https://logindes.caixa.gov.br/auth/realms/internet/protocol/openid-connect/certs 2>&1 | grep -iE 'SSL|error|connect' | head -5

O DNS está igual nos dois: logindes.caixa.gov.br → 10.116.81.75, e nenhum dos dois tem o login no /etc/hosts. Então resolução de nome não é a diferença.

Me mande a saída do netstat, e se der, a do CLI.
