1. Chaves vistas por este servidor
for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl --noproxy '*' -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done
2. Este host roda o sifec-intranet5? Onde está o log?
sudo find /opt/jboss -path '*servers*' -name server.log 2>/dev/null | grep -i intranet5

Se não aparecer nada, liste todos os servidores do host:

sudo find /opt/jboss -path '*servers*' -name server.log 2>/dev/null
3. Como o 6.4 tratou o token do Edson

Troque CAMINHO_DO_LOG pelo caminho que apareceu no passo 2:

sudo grep -nE "AdapterTokenVerifier|publicKey|kid|ccr-api|Unauthorized" CAMINHO_DO_LOG | tail -20

Se não aparecer nada, procure nos logs rotacionados de sexta (13/11):

sudo ls -lt $(dirname CAMINHO_DO_LOG) | head

O que cada resultado indica:

Aparece Didn't find publicKey for kid também no 6.4: o 6.4 também recusa esse token, e o “funciona” do Edson foi por outro caminho ou com outro token. Aí pedimos um novo teste com acompanhamento ao vivo.
Não aparece nenhum erro: o 6.4 aceitou. Vamos fazer um teste ao vivo: o Edson repete a chamada no sifec5 e no 7.4 ao mesmo tempo, enquanto acompanhamos os dois logs.

Me mande as saídas dos passos 1 e 2.
