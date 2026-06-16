
[root@caddeapllx1945 configuration]# grep -A 2 "KEYSTORE_PASSWORD" standalone-full-ha.xml
        <vault-option name="KEYSTORE_PASSWORD" value="MASK-lHQotGsUSmQ5YQRzdtNLD361rwn0c0oJ" />
        <vault-option name="KEYSTORE_ALIAS" value="SecurityKey" />
        <vault-option name="SALT" value="87654321" />
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]#
[root@caddeapllx1945 configuration]# pkill -9 java
[root@caddeapllx1945 configuration]# cd /opt/jboss-eap/bin
[root@caddeapllx1945 bin]# nohup ./standalone.sh -c standalone-full-ha.xml > /tmp/jboss-full.log 2>&1 &
[1] 24470
[root@caddeapllx1945 bin]# tail -100 /logs/jboss/server.log | grep -i "started\|fatal\|error"
2026-06-16 14:58:21,100 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("add") - endereço ([("core-service" => "vault")]): org.jboss.as.server.services.security.VaultReaderException: WFLYSRV0076: Erro ao inicializar o cofre -- org.jboss.security.vault.SecurityVaultException: java.lang.RuntimeException: PBOX00140: Unable to get keystore (/opt/jboss-eap/standalone/configuration/vault-des/vaultcaixa.keystore)
2026-06-16 14:58:21,112 FATAL [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0056: A inicialização do servidor falhou numa maneira irrecuperável: encerrando. Consulte mensagens anteriores para maiores detalhes.
[1]+  Fim da execução com status 1      nohup ./standalone.sh -c standalone-full-ha.xml > /tmp/jboss-full.log 2>&1
[root@caddeapllx1945 bin]#
