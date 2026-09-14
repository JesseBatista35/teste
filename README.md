exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/siinp-truststore.jks -Xms500m -Xmx800m -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.proxyHost=proxydes.caixa -Dhttp.proxyPort=80 -Dhttp.nonProxyHosts=https://data.sandbox.directory.openbankingbrasil.org.br/participants -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-14 14:44:42,848 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.charset" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-14 14:44:42,850 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.index-page.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-14 14:44:42,851 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.enabled" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-14 14:44:42,851 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.encoding.force" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-09-14 14:44:44,627 WARN  [io.qua.agr.run.AgroalConnectionConfigurer] (main) Agroal does not support detecting if a connection is still usable after an exception for database kind: oracle
2026-09-14 14:44:44,894 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01005: null password given; logon denied

2026-09-14 14:44:44,976 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01005: null password given; logon denied

2026-09-14 14:44:45,069 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01005: null password given; logon denied

2026-09-14 14:44:45,144 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01005: null password given; logon denied

2026-09-14 14:44:45,232 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01005: null password given; logon denied

2026-09-14 14:44:45,313 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-01005: null password given; logon denied

2026-09-14 14:44:45,313 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread: <default>) HHH000342: Could not obtain connection to query metadata: java.sql.SQLException: ORA-01005: null password given; logon denied

	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:509)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:456)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:451)
	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1123)
	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:552)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:553)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:269)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:501)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1292)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1025)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:767)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:807)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:77)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:767)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:572)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:535)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:516)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

Failed to load config value of type class java.lang.String for: dinamo.hsm.passwordFailed to load config value of type class java.lang.String for: PROXY_USER_PASSWORDFailed to load config value of type class java.lang.String for: open-finance.mtls.password
