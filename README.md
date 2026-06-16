[root@caddeapllx1945 configuration]# sed -i '/<vault>/,/<\/vault>/{s/^[[:space:]]*<!--[[:space:]]*//; s/[[:space:]]*-->[[:space:]]*$//}' standalone-full-ha.xml
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]# grep -A 8 "<vault>" standalone-full-ha.xml
    <vault>
        <vault-option name="KEYSTORE_URL" value="${jboss.home.dir}/standalone/configuration/vault-des/vaultcaixa.keystore"/>
        <vault-option name="KEYSTORE_PASSWORD" value="MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ" />
        <vault-option name="KEYSTORE_ALIAS" value="SecurityKey" />
        <vault-option name="SALT" value="87654321" />
        <vault-option name="ITERATION_COUNT" value="44" />
        <vault-option name="ENC_FILE_DIR" value="${jboss.home.dir}/standalone/configuration/vault-des"/>
</vault>

[root@caddeapllx1945 configuration]#
