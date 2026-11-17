1. Ache o diretório do servidor do intranet5:

sudo find / -type d -name "sifec-intranet5*" 2>/dev/null

2. Com o caminho que aparecer, procure o tratamento do token. Por exemplo, se aparecer /xxx/servers/sifec-intranet5_lx0067, o log fica em /xxx/servers/sifec-intranet5_lx0067/log/server.log:

sudo grep -nE "AdapterTokenVerifier|publicKey|kid|ccr-api|Unauthorized" $(sudo find / -path "*sifec-intranet5_lx0067/log/server.log" 2>/dev/null) | tail -20

3. Veja quais logs existem, para o caso de o teste de sexta (13/11) estar num arquivo já rotacionado:

sudo ls -lt $(dirname $(sudo find / -path "*sifec-intranet5_lx0067/log/server.log" 2>/dev/null)) | head

4. Rode o teste de chaves com o ; done no final:

for u in https://logindes.caixa.gov.br/auth/realms/internet https://login.des.caixa/auth/realms/intranet; do echo "== $u"; curl --noproxy '*' -k -s -m 10 $u/protocol/openid-connect/certs | grep -o '"kid":"[^"]*"'; done

Me mande as saídas.
