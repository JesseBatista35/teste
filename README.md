exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks -Xms500m -Xmx800m -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=https://data.sandbox.directory.openbankingbrasil.org.br/participants -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-10-09 17:44:42,335 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.charset" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-09 17:44:42,337 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.index-page.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-09 17:44:42,338 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-09 17:44:42,339 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.force" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-09 17:44:44,292 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: oracle
Failed to load config value of type class java.lang.String for: SECURITY_CRYPTO_KEY
