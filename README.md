-sh-4.2$ oc logs sispl-api-mkp-des-b45f5f9f-mk2rg -n sispl-des --previous
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-28 17:22:01,592 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.idaa.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
-sh-4.2$ oc logs -f sispl-api-mkp-des-b45f5f9f-mk2rg -n sispl-des
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-07-28 17:23:41,529 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.idaa.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo

