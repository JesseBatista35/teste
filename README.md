exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-06-10 17:45:05,483 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main) 
2026-06-10 17:45:05,485 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)    _    _                     _   ____ ___    ******
2026-06-10 17:45:05,485 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   | \  / |_  __ _ __ ___     / \  |  _ \_ _|   ******
2026-06-10 17:45:05,485 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |  \/  | |/ _\ '__/ _ \   / _ \ | |_) | |     ******
2026-06-10 17:45:05,486 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |  __  | | |_  | | (_) | / ___ \|  __/| |     ******
2026-06-10 17:45:05,486 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |_|  |_|_|\__/_|  \___/ /_/   \_\_|  |___|   ******
2026-06-10 17:45:05,486 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)  ============================================ ******
2026-06-10 17:45:05,486 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)    :: CEF-SICIM-INTRANET - v1.0.0.1 [prod] ::
2026-06-10 17:45:05,487 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main) 
2026-06-10 17:45:05,549 INFO  [io.quarkus.bootstrap.runner.Timing] (main) SICIM-INTRANET 1.0.0.1 on JVM (powered by Quarkus 3.33.1.1) started in 5.397s. Listening on: http://0.0.0.0:8080
2026-06-10 17:45:05,549 INFO  [io.quarkus.bootstrap.runner.Timing] (main) Profile prod activated. 
2026-06-10 17:45:05,549 INFO  [io.quarkus.bootstrap.runner.Timing] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-oracle, mapstruct, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, vertx]
