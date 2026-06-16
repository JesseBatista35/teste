# Testa o outro keystore
keytool -list -keystore /opt/jboss-eap/standalone/configuration/vault-des/vault.keystore -storepass "changeit" 2>&1 | head -20

# Se funcionar, muda o arquivo de configuração
sed -i 's|vaultcaixa.keystore|vault.keystore|g' /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml

# Verifica
grep "vault-option.*KEYSTORE_URL" /opt/jboss-eap/standalone/configuration/standalone-full-ha.xml
