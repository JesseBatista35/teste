[root@caddeapllx1945 configuration]# sed -i 's|value="MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ"|value="changeit"|g' standalone-full-ha.xml
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]# grep -A 6 "<vault>" standalone-full-ha.xml
    <vault>
        <vault-option name="KEYSTORE_URL" value="${jboss.home.dir}/standalone/configuration/vault-des/vaultcaixa.keystore"/>
        <vault-option name="KEYSTORE_PASSWORD" value="changeit" />
        <vault-option name="KEYSTORE_ALIAS" value="SecurityKey" />
        <vault-option name="SALT" value="87654321" />
        <vault-option name="ITERATION_COUNT" value="44" />
        <vault-option name="ENC_FILE_DIR" value="${jboss.home.dir}/standalone/configuration/vault-des"/>
[root@caddeapllx1945 configuration]#
