1. Veja para onde o truststore aponta (CLI do 471):

/server-group=sifec-intranet/system-property=javax.net.ssl.trustStore:read-attribute(name=value)

2. No 473, veja o que o processo está usando de fato (o comando esconde a senha) e se o arquivo existe:

PID=$(pgrep -f "sifec-intranet_node1_lx473" | head -1); sudo cat /proc/$PID/cmdline | tr '\0' '\n' | grep -i "truststore" | grep -vi password

3. No 473, veja qual AC assina o certificado do login.des.caixa:

echo | openssl s_client -connect login.des.caixa:443 -showcerts 2>/dev/null | grep -E "^ *[0-9]+ s:|^ *i:"

Pode me mandar as três saídas. Com elas te passo o passo a passo para montar o truststore com as ACs da Caixa (os certificados que separamos no /tmp/certs do 473), copiar para o 472, apontar a property e reiniciar.

O erro do sed foi porque o NUM foi colado literalmente, mas não precisamos mais dele: o log já mostrou a causa.
