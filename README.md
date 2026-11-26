keytool -list -v -storepass 'changeit' \
  -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
  | grep -E "^Alias|^Owner:" | grep -i -B1 -E "amazon|starfield|indecx"


  cd /tmp
keytool -printcert -rfc -sslserver indecx.com:443 \
  -J-Dhttps.proxyHost=proxydes.caixa -J-Dhttps.proxyPort=80 > cadeia.pem
# separar os blocos; o 3º é a Amazon Root CA 1
csplit -z -f cert- cadeia.pem '/-----BEGIN CERTIFICATE-----/' '{*}'
cp /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks teste.jks
keytool -importcert -noprompt -alias amazon-root-ca-1 -file cert-02 -keystore teste.jks -storepass changeit
