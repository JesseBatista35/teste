find /infra_app/config/sifug -iname "*.jks" -o -iname "*.p12" -o -iname "*.pfx" 2>/dev/null
find /opt/open/jboss/7.0.0/domain/configuration -iname "*.jks" -o -iname "*keystore*" 2>/dev/null


grep -ri "keystore\|key.store\|certificate\|mtls\|dataprev" /infra_app/config/sifug/*.properties

grep -A 10 -i "security-realm" /opt/open/jboss/7.0.0/domain/configuration/domain.xml | grep -i -B2 -A8 "ssl\|keystore"

keytool -list -v -keystore <caminho_do_arquivo> -storepass changeit | grep -i "alias\|valid\|until"

