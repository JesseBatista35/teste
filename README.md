[root@caddeapllx1945 bin]# cd /opt/jboss-eap/standalone/configuration

# Substitui os valores corretos para DES
sed -i 's|vault-__SISTEMA_AMBIENTE__|vault-des|g' standalone-full-ha.xml
sed -i 's|__KEYSTORE_PASSWORD__|changeit|g' standalone-full-ha.xml
sed -i 's|__VAULT_SALT__|87654321|g' standalone-full-ha.xml
sed -i 's|value="jboss" /><!-- KEYSTORE_ALIAS -->|value="SecurityKey" />|g' standalone-full-ha.xml
sed -i 's|value="33"|value="44"|g' standalone-full-ha.xml

# Verifica
grep -A 6 "<vault>" standalone-full-ha.xml
    <vault>
        <vault-option name="KEYSTORE_URL" value="${jboss.home.dir}/standalone/configuration/vault-des/vaultcaixa.keystore"/>
        <vault-option name="KEYSTORE_PASSWORD" value="MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ" />
        <vault-option name="KEYSTORE_ALIAS" value="SecurityKey" />
        <vault-option name="SALT" value="87654321" />
        <vault-option name="ITERATION_COUNT" value="44" />
        <vault-option name="ENC_FILE_DIR" value="${jboss.home.dir}/standalone/configuration/vault-des"/>
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
