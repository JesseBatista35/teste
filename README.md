1. Onde estão os logs do sifec-intranet5
sudo find /logs/jboss-eap/hc/servers/sifec-intranet5_lx0067 /opt/jboss/jboss-eap/hc/servers/sifec-intranet5_lx0067/log -name "server.log*" 2>/dev/null | head
2. Procurar o tratamento do token em todos os logs
sudo grep -nE "AdapterTokenVerifier|publicKey|kid:|Unauthorized" $(sudo find /logs/jboss-eap/hc/servers/sifec-intranet5_lx0067 /opt/jboss/jboss-eap/hc/servers/sifec-intranet5_lx0067/log -name "server.log*" 2>/dev/null) | tail -20
3. O ccr-api do 6.4 tem a configuração do Keycloak aplicada?
sudo grep -nE "Keycloak subsystem override|ccr-api" $(sudo find /logs/jboss-eap/hc/servers/sifec-intranet5_lx0067 /opt/jboss/jboss-eap/hc/servers/sifec-intranet5_lx0067/log -name "server.log*" 2>/dev/null) | tail -10

Esse terceiro passo é importante. No 7.4 o log mostra Keycloak subsystem override for deployment ccr-api.war, ou seja, o Keycloak está protegendo o ccr-api. Se no 6.4 essa linha não aparecer para o ccr-api.war, o Keycloak não está atuando nele lá. Isso explicaria por que qualquer token passa no sifec5: o 6.4 simplesmente não valida.

Para comparar com o 7.4, rode também na 473:

sudo grep -n "Keycloak subsystem override for deployment ccr-api" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -2

Me mande as saídas.

Como o Claude está se saindo nesta sessão?
