# Verifica permissões
ls -la /opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore

# Testa o keystore com keytool
keytool -list -keystore /opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore -storepass "changeit" 2>&1 | head -20
