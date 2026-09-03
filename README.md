
-sh-4.2$ oc get pods -n sisgf-des | grep batch
sisgf-batch-des-292-deploy      0/1       Completed   0               45h
sisgf-batch-des-293-deploy      0/1       Completed   0               44h
sisgf-batch-des-293-ljsg2       1/1       Running     0               44h
sisgf-batch-des-297-deploy      0/1       Error       0               21h
sisgf-batch-des-298-deploy      0/1       Error       0               19h
sisgf-batch-des-299-deploy      0/1       Error       0               4h53m
sisgf-batch-des-300-7krld       0/1       Running     0               3m26s
sisgf-batch-des-300-deploy      1/1       Running     0               3m30s
-sh-4.2$ oc get pods -n sisgf-des | grep batch
sisgf-batch-des-299-deploy      0/1       Error       0               4h54m
sisgf-batch-des-300-7krld       1/1       Running     0               4m29s
sisgf-batch-des-300-deploy      0/1       Completed   0               4m33s
-sh-4.2$ oc get pods -n sisgf-des | grep batch
sisgf-batch-des-299-deploy      0/1       Error       0               4h54m
sisgf-batch-des-300-7krld       1/1       Running     0               4m37s
sisgf-batch-des-300-deploy      0/1       Completed   0               4m41s
-sh-4.2$ oc logs sisgf-batch-des-300-7krld -n sisgf-des
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-09-03 16:10:46,062 WARN  [io.smallrye.config] (main) SRCFG01007: Duplicate value found for name : quarkus.datasource.db-kind, config source name : PropertiesConfigSource[source=jar:file:///deployments/app/sisgf-batch-15.01.01.06.jar!/application.properties], (old value : oracle)
2026-09-03 16:10:47,556 WARN  [org.hibernate.orm.core] (main) HHH000511: The 12.2.0 version for [org.hibernate.dialect.OracleDialect] is no longer supported, hence certain features may not work properly.The minimum supported version is 19.0.0. Check the community dialects project for available legacy versions.
2026-09-03 16:10:48,584 WARN  [io.smallrye.config] (main) SRCFG01007: Duplicate value found for name : quarkus.datasource.db-kind, config source name : PropertiesConfigSource[source=jar:file:///deployments/app/sisgf-batch-15.01.01.06.jar!/application.properties], (old value : oracle)
2026-09-03 16:10:51,451 WARN  [org.hibernate.orm.jdbc] (JPA Startup Thread) HHH100123: Low default JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-09-03 16:10:52,769 INFO  [io.quarkus.scheduler.runtime.SimpleScheduler] (main) No scheduled business methods found - Simple scheduler will not be started
2026-09-03 16:10:52,775 INFO  [br.gov.caixa.sisgf.api.rotinas.RotinaExecutor] (main) Rotinas registradas: [processararquivolote, gerarArquivoSinaf]
2026-09-03 16:10:52,776 INFO  [br.gov.caixa.sisgf.api.sftp.FileTransferSecureService] (main) Subindo client ftp service br.gov.caixa.sisgf.api.sftp.FileTransferSecureService
2026-09-03 16:10:52,777 INFO  [br.gov.caixa.sisgf.api.sftp.FileTransferSecureService] (main)
***************************
**Iniciando servico SFTP
****IP => 10.116.89.226 ***
**PORT => 22 **
**CLIENT USER => ssgfdr01 **
***************************
2026-09-03 16:10:52,855 INFO  [io.quarkus] (main) sisgf-batch 15.01.01.06 on JVM (powered by Quarkus 3.37.1) started in 7.451s. Listening on: http://0.0.0.0:8080
2026-09-03 16:10:52,855 INFO  [io.quarkus] (main) Profile prod activated.
2026-09-03 16:10:52,855 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-oracle, keycloak-authorization, mailer, micrometer, narayana-jta, oidc, oidc-client, qute, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, scheduler, security, security-jpa, security-properties-file, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-jwt, smallrye-openapi, spring-data-jpa, spring-di, spring-security, spring-web, vertx]
-sh-4.2$



deu certo me ajuda
