
Removing debug pod ...
siint-saquetecban-pendencia-api-des-debug   1/1       Terminating   0         4m
siint-saquetecban-pendencia-api-des-debug   1/1       Terminating   0         4m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/siint-saquetecban-pendencia-api-des --list
# deploymentconfigs/siint-saquetecban-pendencia-api-des, container siint-saquetecban-pendencia-api-des
TZ=America/Sao_Paulo
API_CLIENT_ID=cli-ser-int
API_GRANT_TYPE=client_credentials
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
QUARKUS_DATASOURCE_JDBC_URL=jdbc:db2://10.192.225.76:2905/DBD0
QUARKUS_DATASOURCE_PASSWORD=${SINTDS03_DB2}
QUARKUS_DATASOURCE_USERNAME=SINTDS03
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/SIINT_DES/
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
