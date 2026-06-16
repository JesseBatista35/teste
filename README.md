# Procura o arquivo do vault
find /opt/jboss-eap -name "vaultcaixa.keystore" -o -name "*.keystore" 2>/dev/null

# Verifica a pasta vault-des
ls -la /opt/jboss-eap/standalone/configuration/vault-des/

# Verifica todas as pastas vault
ls -la /opt/jboss-eap/standalone/configuration/ | grep vault
