
sh-4.4$
sh-4.4$ cp /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks teste.jks
sh-4.4$
sh-4.4$
sh-4.4$ keytool -importcert -noprompt -alias amazon-root-ca-1 -file cert-02 -keystore teste.jks -storepass changeit
Certificate was added to keystore
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$ keytool -list -v -storepass changeit \
>   -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
>   | grep -E "^Owner:" | grep -i -E "amazon|starfield|indecx"
Owner: CN=*.s3-sa-east-1.amazonaws.com
Owner: CN=Amazon RSA 2048 M04, O=Amazon, C=US
Owner: CN=hugme-ra.s3.sa-east-1.amazonaws.com
Owner: CN=indecx.com
Owner: CN=indecx.com
sh-4.4$
sh-4.4$
sh-4.4$ keytool -list -v -storepass changeit -keystore /tmp/teste.jks \
>   | grep -E "^Owner:" | grep -i -E "amazon|starfield|indecx"
Owner: CN=*.s3-sa-east-1.amazonaws.com
Owner: CN=Amazon Root CA 1, O=Amazon, C=US
Owner: CN=Amazon RSA 2048 M04, O=Amazon, C=US
Owner: CN=hugme-ra.s3.sa-east-1.amazonaws.com
Owner: CN=indecx.com
Owner: CN=indecx.com
sh-4.4$ keytool -list -storepass changeit -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks | grep "contains"
Your keystore contains 39 entries
sh-4.4$
sh-4.4$
sh-4.4$ keytool -list -storepass changeit -keystore /tmp/teste.jks | grep "contains"
Your keystore contains 40 entries
sh-4.4$
sh-4.4$
sh-4.4$
