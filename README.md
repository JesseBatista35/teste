No 473 (um bloco por vez):

1. Descobrir o Java do servidor e preparar a pasta:

PID=$(pgrep -f "sifec-intranet_node1_lx473" | head -1)
JHOME=$(dirname $(dirname $(sudo readlink -f /proc/$PID/exe))); echo $JHOME
ls -l $JHOME/lib/security/cacerts $JHOME/bin/keytool
sudo mkdir -p /opt/jboss/truststore

Os dois arquivos do ls precisam existir. Se algum não aparecer, pare e me mande a saída.

2. Baixar a cadeia do login.des.caixa e conferir:

cd /tmp && rm -f caixa_cert*.pem
echo | openssl s_client -connect login.des.caixa:443 -showcerts 2>/dev/null | awk '/BEGIN CERTIFICATE/{n++;p=1} p{print > ("/tmp/caixa_cert" n ".pem")} /END CERTIFICATE/{p=0}'
for f in /tmp/caixa_cert*.pem; do echo "$f:"; openssl x509 -in $f -noout -subject; done

O esperado é: caixa_cert2.pem = AC Icptestes Sub e caixa_cert3.pem = AC Icptestes Raiz.

3. Montar o truststore (cópia do cacerts + as 2 ACs):

sudo cp $JHOME/lib/security/cacerts /opt/jboss/truststore/sifec-cacerts.jks
sudo $JHOME/bin/keytool -importcert -noprompt -alias ac-icptestes-raiz -file /tmp/caixa_cert3.pem -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit
sudo $JHOME/bin/keytool -importcert -noprompt -alias ac-icptestes-sub -file /tmp/caixa_cert2.pem -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit
sudo chown -R jboss:jboss /opt/jboss/truststore
sudo $JHOME/bin/keytool -list -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit | grep -i icptestes

O último comando deve listar as duas entradas ac-icptestes-raiz e ac-icptestes-sub.

No 471 (jboss-cli):

4. Apontar o truststore e a senha, e reiniciar:

/server-group=sifec-intranet/system-property=javax.net.ssl.trustStore:write-attribute(name=value,value="/opt/jboss/truststore/sifec-cacerts.jks")
/server-group=sifec-intranet/system-property=javax.net.ssl.trustStorePassword:write-attribute(name=value,value="changeit")
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

5. Validar (no 473), depois de o Inocêncio repetir a chamada da API:

sudo grep -nE "Loaded URLs|Failed to load URLs|PKIX" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -5

O esperado é Loaded URLs from https://login.des.caixa/... sem PKIX, e a API respondendo sem 500.

O 472 (node1 do sifec-intranet) está parado hoje. Quando ele for ligado, vai precisar do mesmo arquivo em /opt/jboss/truststore/. Fica anotado como pendência.
