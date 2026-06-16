cd /opt/jboss-eap/standalone/configuration

# Substitui os valores corretos para DES
sed -i 's|vault-__SISTEMA_AMBIENTE__|vault-des|g' standalone-full-ha.xml
sed -i 's|__KEYSTORE_PASSWORD__|changeit|g' standalone-full-ha.xml
sed -i 's|__VAULT_SALT__|87654321|g' standalone-full-ha.xml
sed -i 's|value="jboss" /><!-- KEYSTORE_ALIAS -->|value="SecurityKey" />|g' standalone-full-ha.xml
sed -i 's|value="33"|value="44"|g' standalone-full-ha.xml

# Verifica
grep -A 6 "<vault>" standalone-full-ha.xml
