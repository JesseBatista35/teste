ls -la "/tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt" "/tmp/Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt"


exit

Depois:

1. Backup do cacerts

cp /infra_app/config/certificados/cacerts /infra_app/config/certificados/cacerts.bkp-$(date +%Y%m%d_%H%M%S)

2. Confirmar conteúdo dos certificados

openssl x509 -in "/tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt" -noout -subject -issuer
openssl x509 -in "/tmp/Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt" -noout -subject -issuer

3. Importar (mantendo as aspas por causa do espaço no nome)

keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36 -file "/tmp/Sectigo_Public_Server-Authentication_CA_DV_R36 1 (1).crt" -noprompt

keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46 -file "/tmp/Sectigo_Public_Server_Authentication_Root_R46 1 (1).crt" -noprompt

Manda o retorno de cada comando, principalmente do openssl (pra confirmar subject/issuer) e dos keytool imports.
