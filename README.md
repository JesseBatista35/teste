scp Sectigo_Public_Server_Auth_CA_DV_R36.crt p585600@srjdeapllx130:/tmp/


scp Sectigo_Public_Server_Auth_Root_R46.crt p585600@srjdeapllx130:/tmp/





ssh srjdeapllx130
ls -la /tmp/*.crt


openssl x509 -in /tmp/Sectigo_Public_Server_Auth_CA_DV_R36.crt -noout -subject -issuer
openssl x509 -in /tmp/Sectigo_Public_Server_Auth_Root_R46.crt -noout -subject -issuer



cp /infra_app/config/certificados/cacerts /infra_app/config/certificados/cacerts.bkp-$(date +%Y%m%d_%H%M%S)


keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36 -file /tmp/Sectigo_Public_Server_Auth_CA_DV_R36.crt -noprompt

keytool -importcert -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46 -file /tmp/Sectigo_Public_Server_Auth_Root_R46.crt -noprompt



keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-dv-r36
keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit -alias sectigo-pubserverauth-root-r46



