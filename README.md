oc get pods -l name=sisns-backend-tqs --sort-by=.metadata.creationTimestamp

oc exec -it sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- df -h | grep -i SISNS

oc exec -it sisns-backend-tqs-119-gjln8 -c sisns-backend-tqs -- ls -la /opt/SISNS/SIB2B/GECIN/DOWNLOAD
exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-23 22:42:17,913 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.version" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-23 22:42:19,700 WARN  [org.hib.map.RootClass] (main) HHH000038: Composite-id class does not override equals(): br.gov.caixa.sisns.entity.NqvAnoMesApuracaoPK
2026-07-23 22:42:19,700 WARN  [org.hib.map.RootClass] (main) HHH000039: Composite-id class does not override hashCode(): br.gov.caixa.sisns.entity.NqvAnoMesApuracaoPK
2026-07-23 22:42:24,309 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level TRACE for category 'org.hibernate.type.descriptor.sql.BasicBinder' set below minimum logging level DEBUG, promoting it to DEBUG
2026-07-23 22:42:24,898 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege

2026-07-23 22:42:25,025 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege

2026-07-23 22:42:25,339 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege

2026-07-23 22:42:25,409 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege

2026-07-23 22:42:25,475 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege

2026-07-23 22:42:25,539 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege

2026-07-23 22:42:25,540 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) HHH000342: Could not obtain connection to query metadata: java.sql.SQLException: ORA-01035: ORACLE only available to users with RESTRICTED SESSION privilege

	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:630)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:559)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:554)
	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1377)
	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:782)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:772)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:299)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:450)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithO5Logon(T4CTTIoauthenticate.java:1553)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1302)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1256)
	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1445)
	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1394)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:677)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1089)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:90)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:733)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:649)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:535)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:516)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-07-23 22:42:26,716 INFO  [io.quarkus] (main) sisns 3.0.0.2-Release on JVM (powered by Quarkus 2.15.2.Final) started in 9.751s. Listening on: http://0.0.0.0:8080
2026-07-23 22:42:26,716 INFO  [io.quarkus] (main) Profile prod activated. 
2026-07-23 22:42:26,717 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-envers, hibernate-orm, hibernate-orm-panache, hibernate-orm-panache-kotlin, hibernate-orm-rest-data-panache, hibernate-search-elasticsearch, hibernate-validator, jdbc-h2, jdbc-oracle, jdbc-postgresql, keycloak-authorization, kotlin, narayana-jta, oidc, oidc-client, rest-client, resteasy, resteasy-jackson, resteasy-multipart, security, servlet, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
