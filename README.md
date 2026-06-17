keytool -list -v -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit | grep -i "logintqs\|sectigo"

echo | openssl s_client -connect logintqs.caixa.gov.br:443 -showcerts 2>/dev/null | openssl x509 -outform PEM > /tmp/logintqs.pem

openssl x509 -in /tmp/logintqs.pem -text -noout

keytool -import -alias logintqs-caixa -file /tmp/logintqs.pem -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt

keytool -list -v -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit | grep -A5 "logintqs-caixa"

oc rollout restart deployment/sispl-consulta-transacao-ocp4-tqs -n [seu-namespace]




echo | openssl s_client -connect logintqs.caixa.gov.br:443 -showcerts 2>/dev/null | grep -A30 "BEGIN CERTIFICATE" > /tmp/chain.pem
