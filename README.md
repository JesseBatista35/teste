2. Baixar a cadeia do login.des.caixa e conferir:

cd /tmp && rm -f caixa_cert*.pem
echo | openssl s_client -connect login.des.caixa:443 -showcerts 2>/dev/null | awk '/BEGIN CERTIFICATE/{n++;p=1} p{print > ("/tmp/caixa_cert" n ".pem")} /END CERTIFICATE/{p=0}'
for f in /tmp/caixa_cert*.pem; do echo "$f:"; openssl x509 -in $f -noout -subject; done

O esperado é caixa_cert2.pem = AC Icptestes Sub e caixa_cert3.pem = AC Icptestes Raiz. Confira antes de seguir.

3. Montar o truststore:

sudo cp $JHOME/lib/security/cacerts /opt/jboss/truststore/sifec-cacerts.jks
sudo chmod 644 /opt/jboss/truststore/sifec-cacerts.jks
sudo $JHOME/bin/keytool -importcert -noprompt -alias ac-icptestes-raiz -file /tmp/caixa_cert3.pem -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit
sudo $JHOME/bin/keytool -importcert -noprompt -alias ac-icptestes-sub -file /tmp/caixa_cert2.pem -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit
sudo chown -R jboss:jboss /opt/jboss/truststore
sudo $JHOME/bin/keytool -list -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit | grep -i icptestes

O último comando deve listar ac-icptestes-raiz e ac-icptestes-sub. O chmod é necessário porque o cacerts original é somente leitura e o keytool precisa gravar na cópia.

Me mande a saída dos dois blocos. Depois vem o passo 4 no 471 (apontar a property e restart).
