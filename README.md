
sh-4.4$
sh-4.4$
sh-4.4$ keytool -printcert -sslserver indecx.com:443 \
>   -J-Dhttps.proxyHost=proxydes.caixa -J-Dhttps.proxyPort=80 \
>   | grep -E "^Certificate|Owner:|Issuer:|Valid from"
Certificate #0
Owner: CN=indecx.com
Issuer: CN=Amazon RSA 2048 S24, O=Amazon, C=US
Valid from: Tue Nov 24 02:53:18 BRT 2026 until: Thu Jun 10 03:53:18 BRT 2027
Certificate fingerprints:
CertificatePolicies [
Certificate #1
Owner: CN=Amazon RSA 2048 S24, O=Amazon, C=US
Issuer: CN=Amazon Root CA 1, O=Amazon, C=US
Valid from: Wed Jul 08 16:28:53 BRT 2026 until: Sat Jul 07 16:28:53 BRT 2029
Certificate fingerprints:
CertificatePolicies [
Certificate #2
Owner: CN=Amazon Root CA 1, O=Amazon, C=US
Issuer: CN=Starfield Services Root Certificate Authority - G2, O="Starfield Technologies, Inc.", L=Scottsdale, ST=Arizona, C=US
Valid from: Mon May 25 09:00:00 BRT 2015 until: Wed Dec 30 22:00:00 BRT 2037
Certificate fingerprints:
CertificatePolicies [
sh-4.4$
sh-4.4$
sh-4.4$ ps -ef | grep -o 'trustStorePassword=[^ ]*' | head -1
trustStorePassword=changeit
sh-4.4$ ]keytool -list -v -storepass 'changeit' \
>   -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
>   | grep -E "^Alias|^Owner:"
sh: ]keytool: command not found
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
