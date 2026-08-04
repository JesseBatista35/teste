exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Xms4096m -Xmx4096m -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-08-04 17:16:08,720 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource."idaa".metrics.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-04 17:16:15,696 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-08-04 17:16:15,988 INFO  [io.quarkus] (main) silce-parametros 1.11.22 on JVM (powered by Quarkus 2.16.2.Final) started in 8.055s. Listening on: http://0.0.0.0:8080
2026-08-04 17:16:15,989 INFO  [io.quarkus] (main) Profile prod activated.
2026-08-04 17:16:15,989 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-db2, jdbc-h2, keycloak-authorization, narayana-jta, oidc, reactive-routes, rest-client, rest-client-jackson, resteasy, resteasy-jackson, scheduler, security, servlet, smallrye-context-propagation, smallrye-health, smallrye-jwt, smallrye-openapi, vertx]
