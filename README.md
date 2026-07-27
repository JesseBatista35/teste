keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit | grep -i sectigo


keytool -list -keystore /infra_app/config/certificados/cacerts -storepass changeit | wc -l
