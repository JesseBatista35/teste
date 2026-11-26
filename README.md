
sh-4.4$  cd /tmp
sh-4.4$ ^C
sh-4.4$ ^C
sh-4.4$
sh-4.4$
sh-4.4$ cd /tmp
sh-4.4$
sh-4.4$
sh-4.4$ keytool -printcert -rfc -sslserver indecx.com:443 \
>   -J-Dhttps.proxyHost=proxydes.caixa -J-Dhttps.proxyPort=80 > cadeia.pem
sh-4.4$
sh-4.4$
sh-4.4$ csplit -z -f cert- cadeia.pem '/-----BEGIN CERTIFICATE-----/' '{*}'
2105
1585
1671
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ cp /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks teste.jks
sh-4.4$
sh-4.4$
sh-4.4$ keytool -importcert -noprompt -alias amazon-root-ca-1 -file cert-02 -keystore teste.jks -storepass changeit
Certificate was added to keystore
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
