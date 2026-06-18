# Testa o keystore do vault
keytool -list -keystore /opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore -storepass "changeit" 2>&1

# Se aparecer:
# ✅ "Keystore type: JCEKS" = VAULT VÁLIDO!
# ❌ "Invalid keystore format" = VAULT CORROMPIDO
