SIINT-SAQUETECBAN-PENDENCIA-API-DES (9)
Grupo de variáveis de SIINT-SAQUETECBAN-PENDENCIA-API-DES

Scopes: EC DES
_ENV.API_CLIENT_ID
cli-ser-int
_ENV.API_CLIENT_SECRET
********
_ENV.API_GRANT_TYPE
client_credentials
_ENV.API_KEY
********
_ENV.JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
_ENV.QUARKUS_DATASOURCE_JDBC_URL
jdbc:db2://10.192.225.76:2905/DBD0
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SINTDS03_DB2}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SINTDS03
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/SIINT_DES/



siint-saquetecban-pendencia-api-des-46-bk5s5   0/1       Terminating   6         6m
siint-saquetecban-pendencia-api-des-47-deploy   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-47-deploy   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-47-deploy   0/1       ContainerCreating   0         0s
siint-saquetecban-pendencia-api-des-47-deploy   0/1       ContainerCreating   0         2s
siint-saquetecban-pendencia-api-des-47-deploy   1/1       Running   0         3s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Pending   0         0s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Init:0/2   0         0s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Init:0/2   0         3s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Init:0/2   0         3s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Init:1/2   0         5s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       PodInitializing   0         6s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Running   0         9s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Error     0         11s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Running   1         12s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Error     1         14s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       CrashLoopBackOff   1         21s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Running   2         34s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       Error     2         36s
siint-saquetecban-pendencia-api-des-47-d4m25   0/1       CrashLoopBackOff   2         41s




exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__ ____ __ _____ ___ __ ____ ______
--/ __ \/ / / / _ | / _ \/ //_/ / / / __/
-/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-08-12 11:31:53,109 WARN [io.quarkus.config] (main) The "quarkus.hibernate-orm.database.generation" config property is deprecated and should not be used anymore.
Failed to load config value of type class java.lang.String for: api.confirmacao.siint-api-key
Failed to load config value of type class java.lang.String for: api.confirmacao.client-secret
