

[root@caddeapllx1945 configuration]# cp standalone-full-ha.xml.backup standalone-full-ha.xml
cp: não foi possível obter estado de 'standalone-full-ha.xml.backup': Arquivo ou diretório inexistente
[root@caddeapllx1945 configuration]# sed -i '/<vault>/s/<!--//g; /<vault>/,/<\/vault>/s/-->//g' standalone-full-ha.xml
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]# grep -A 8 "<vault>" standalone-full-ha.xml | head -10
    <vault>
        <vault-option name="KEYSTORE_URL" value="${jboss.home.dir}/standalone/configuration/vault-des/vaultcaixa.keystore"/>
        <vault-option name="KEYSTORE_PASSWORD" value="MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ" />
        <vault-option name="KEYSTORE_ALIAS" value="SecurityKey" />
        <vault-option name="SALT" value="87654321" />
        <vault-option name="ITERATION_COUNT" value="44" />
        <vault-option name="ENC_FILE_DIR" value="${jboss.home.dir}/standalone/configuration/vault-des"/>
</vault>

[root@caddeapllx1945 configuration]#

