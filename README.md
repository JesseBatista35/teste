
-sh-4.2$
-sh-4.2$ oc logs siint-saquetecban-pendencia-api-des-47-d4m25 -f
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-08-12 11:32:47,053 WARN  [io.quarkus.config] (main) The "quarkus.hibernate-orm.database.generation" config property is deprecated and should not be used anymore.
Failed to load config value of type class java.lang.String for: api.confirmacao.siint-api-key
Failed to load config value of type class java.lang.String for: api.confirmacao.client-secret

-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs siint-saquetecban-pendencia-api-des-47-d4m25 --tail=-1 --timestamps
2026-08-12T14:34:11.909449004Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-08-12T14:34:14.237365913Z __  ____  __  _____   ___  __ ____  ______
2026-08-12T14:34:14.237365913Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
2026-08-12T14:34:14.237365913Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
2026-08-12T14:34:14.237365913Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-08-12T14:34:14.237365913Z 2026-08-12 11:34:14,234 WARN  [io.quarkus.config] (main) The "quarkus.hibernate-orm.database.generation" config property is deprecated and should not be used anymore.
2026-08-12T14:34:14.334388935Z Failed to load config value of type class java.lang.String for: api.confirmacao.siint-api-key
2026-08-12T14:34:14.334388935Z Failed to load config value of type class java.lang.String for: api.confirmacao.client-secret
2026-08-12T14:34:14.334388935Z
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec siint-saquetecban-pendencia-api-des-47-d4m25 -- cat /usr/src/app/secrets_files/SIINT_DES/SINTDS03_DB2
error: unable to upgrade connection: container not found ("siint-saquetecban-pendencia-api-des")
-sh-4.2$
