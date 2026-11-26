# Original (o que o JBoss está usando)
keytool -list -v -storepass changeit \
  -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks \
  | grep -E "^Owner:" | grep -i -E "amazon|starfield|indecx"

# Cópia com a importação
keytool -list -v -storepass changeit -keystore /tmp/teste.jks \
  | grep -E "^Owner:" | grep -i -E "amazon|starfield|indecx"

# Quantidade de entradas nos dois
keytool -list -storepass changeit -keystore /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd-sisou-20260827.jks | grep "contains"
keytool -list -storepass changeit -keystore /tmp/teste.jks | grep "contains"
