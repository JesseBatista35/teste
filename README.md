find / -iname "*.jks" 2>/dev/null
find / -iname "*truststore*" 2>/dev/null


keytool -list -v -keystore /caminho/do/truststore.jks -storepass changeit | grep -i "alias\|issuer\|owner"


echo | openssl s_client -connect logindes.caixa.gov.br:443 -showcerts 2>/dev/null | grep -i "subject\|issuer"
