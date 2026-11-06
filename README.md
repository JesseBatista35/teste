
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ cd /tmp && rm -f caixa_cert*.pem
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ echo | openssl s_client -connect login.des.caixa:443 -showcerts 2>/dev/null | awk '/BEGIN CERTIFICATE/{n++;p=1} p{print > ("/tmp/caixa_cert" n ".pem")} /END CERTIFICATE/{p=0}'
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ for f in /tmp/caixa_cert*.pem; do echo "$f:"; openssl x509 -in $f -noout -subject; done
/tmp/caixa_cert1.pem:
subject=C=BR, O=Caixa Economica Federal, CN=login.des.caixa
/tmp/caixa_cert2.pem:
subject=C=BR, O=Caixa Economica Federal, CN=AC Icptestes Sub
/tmp/caixa_cert3.pem:
subject=C=BR, O=Caixa Economica Federal, CN=AC Icptestes Raiz
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ sudo cp $JHOME/lib/security/cacerts /opt/jboss/truststore/sifec-cacerts.jks
sudo chmod 644 /opt/jboss/truststore/sifec-cacerts.jks
sudo $JHOME/bin/keytool -importcert -noprompt -alias ac-icptestes-raiz -file /tmp/caixa_cert3.pem -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit
sudo $JHOME/bin/keytool -importcert -noprompt -alias ac-icptestes-sub -file /tmp/caixa_cert2.pem -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit
sudo chown -R jboss:jboss /opt/jboss/truststore
sudo $JHOME/bin/keytool -list -keystore /opt/jboss/truststore/sifec-cacerts.jks -storepass changeit | grep -i icptestes
Certificate was added to keystore
Certificate was added to keystore
ac-icptestes-raiz, Nov 6, 2026, trustedCertEntry,
ac-icptestes-sub, Nov 6, 2026, trustedCertEntry,
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$
