exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-silic.jks -Djdk.tls.client.protocols=TLSv1,TLSv1.1,TLSv1.2 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-31 14:40:56,942 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.multipart.max-file-size" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,950 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.jvm.args" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,951 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.pge.jdbc.schema" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,952 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.jdbc.retry-interval" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,952 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.pge.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,952 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.mailer.fromPlano" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,953 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.statistic" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,953 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.scheduler.timezone" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,953 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.multipart.max-request-size" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,954 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.jdbc.retry-attempts" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:40:56,954 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.oidc-client.read-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-31 14:41:03,533 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level DEBUG for category 'org.jboss.resteasy.reactive.client.logging' set below minimum logging level INFO, promoting it to INFO. Set the build time configuration property 'quarkus.log.category."org.jboss.resteasy.reactive.client.logging".min-level' to 'DEBUG' to avoid this warning
2026-08-31 14:41:04,108 INFO  [io.agr.pool] (JPA Startup Thread: <default>) Datasource '<default>': Initial size smaller than min. Connections will be created when necessary
2026-08-31 14:41:04,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@fb02f89)
2026-08-31 14:41:04,327 INFO  [ora.jdbc] (agroal-21) traceId=7B949C74. 
2026-08-31 14:41:04,330 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 14:41:04,331 INFO  [ora.jdbc] (agroal-21) traceId=7B949C74, anoEnabled=true. 
2026-08-31 14:41:04,334 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 14:41:04,335 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 14:41:04,338 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 14:41:04,339 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7B949C74
2026-08-31 14:41:04,341 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 14:41:04,342 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 14:41:04,343 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 14:41:04,344 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 14:41:04,348 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 14:41:04,349 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7B949C74
2026-08-31 14:41:04,350 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 14:41:04,351 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 14:41:04,352 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 14:41:04,353 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 14:41:04,354 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 14:41:04,355 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7B949C74
2026-08-31 14:41:04,356 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 14:41:04,357 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=p9Qkwh+VRrSscGRuQVWnGA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=p9Qkwh+VRrSscGRuQVWnGA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 14:41:04,358 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 14:41:04,471 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=p9Qkwh+VRrSscGRuQVWnGA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 14:41:04,473 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread: <default>) HHH000342: Could not obtain connection to query metadata: java.lang.NullPointerException
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.doTheWork(JtaIsolationDelegate.java:186)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.lambda$delegateWork$1(JtaIsolationDelegate.java:75)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.doInSuspendedTransaction(JtaIsolationDelegate.java:107)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.delegateWork(JtaIsolationDelegate.java:72)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:279)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:193)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:69)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:119)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:264)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:239)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216)
	at org.hibernate.engine.jdbc.internal.JdbcServicesImpl.configure(JdbcServicesImpl.java:52)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.configureService(StandardServiceRegistryImpl.java:125)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:248)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:216)
	at org.hibernate.boot.internal.SessionFactoryOptionsBuilder.<init>(SessionFactoryOptionsBuilder.java:273)
	at io.quarkus.hibernate.orm.runtime.recording.PrevalidatedQuarkusMetadata.buildSessionFactoryOptionsBuilder(PrevalidatedQuarkusMetadata.java:70)
	at io.quarkus.hibernate.orm.runtime.boot.FastBootEntityManagerFactoryBuilder.build(FastBootEntityManagerFactoryBuilder.java:81)
	at io.quarkus.hibernate.orm.runtime.FastBootHibernatePersistenceProvider.createEntityManagerFactory(FastBootHibernatePersistenceProvider.java:74)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:80)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:55)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$LazyPersistenceUnit.get(JPAConfig.java:156)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$1.run(JPAConfig.java:64)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-08-31 14:41:05,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@39379765)
2026-08-31 14:41:05,326 INFO  [ora.jdbc] (agroal-21) traceId=1DFB607F. 
2026-08-31 14:41:05,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 14:41:05,328 INFO  [ora.jdbc] (agroal-21) traceId=1DFB607F, anoEnabled=true. 
2026-08-31 14:41:05,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 14:41:05,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 14:41:05,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 14:41:05,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 1DFB607F
2026-08-31 14:41:05,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 14:41:05,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 14:41:05,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 14:41:05,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 14:41:05,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 14:41:05,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 1DFB607F
2026-08-31 14:41:05,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 14:41:05,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 14:41:05,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 14:41:05,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 14:41:05,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 14:41:05,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 1DFB607F
2026-08-31 14:41:05,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 14:41:05,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=2+AKeo8rQImuIu4f9bQohA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=2+AKeo8rQImuIu4f9bQohA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 14:41:05,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 14:41:05,613 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=2+AKeo8rQImuIu4f9bQohA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 14:41:05,614 ERROR [org.hib.que.sqm.mut.int.tem.GlobalTemporaryTableStrategy] (JPA Startup Thread: <default>) Unable obtain JDBC Connection: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=2+AKeo8rQImuIu4f9bQohA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=2+AKeo8rQImuIu4f9bQohA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 14:41:06,603 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) A aplicacao subiu!
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.profile: des
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.db-kind: oracle
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.jdbc.url: jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad02ng
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.username: SLICDB01
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) base.siclg.path: https://des.siclg.caixa/rest
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) SERVER IP: 10.116.220.182
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.mailer: smtptest.correiolivre.caixa
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.mailer.from: cepag@caixa.gov.br
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.pge.jdbc.url: jdbc:oracle:thin:@//cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB003
2026-08-31 14:41:06,606 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.pge.username: SLICPGED
2026-08-31 14:41:06,607 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) pagamentos.sipge.sap.auth.headers.username: SRFOBH01
 2026-08-31 14:41:06,703 INFO  [io.quarkus] (main) silic-backend 2.0.1-SNAPSHOT on JVM (powered by Quarkus 3.6.3) started in 10.438s. Listening on: http://0.0.0.0:8080
2026-08-31 14:41:06,704 INFO  [io.quarkus] (main) Profiles des,common activated. 
2026-08-31 14:41:06,704 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-oracle, jdbc-postgresql, logging-gelf, mailer, micrometer, narayana-jta, oidc, oidc-client, oidc-client-filter, qute, rest-client, resteasy, resteasy-jackson, resteasy-multipart, resteasy-qute, scheduler, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
2026-08-31 15:32:35,698 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Localizar cotribuinte pelo CPF 79686451404 na Receita Federal
2026-08-31 15:32:35,840 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Contribuinte localizado WALDEMIR VIEIRA DO AMARAL
2026-08-31 15:32:35,326 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@19274702)
2026-08-31 15:32:35,327 INFO  [ora.jdbc] (agroal-21) traceId=698E71B5. 
2026-08-31 15:32:35,328 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:32:35,329 INFO  [ora.jdbc] (agroal-21) traceId=698E71B5, anoEnabled=true. 
2026-08-31 15:32:35,330 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:32:35,331 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:32:35,332 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:32:35,333 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 698E71B5
2026-08-31 15:32:35,334 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:32:35,335 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:32:35,336 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:32:35,337 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:32:35,338 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:32:35,339 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 698E71B5
2026-08-31 15:32:35,340 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:32:35,341 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:32:36,325 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:32:36,326 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:32:36,327 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:32:36,328 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 698E71B5
2026-08-31 15:32:36,329 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:32:36,330 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:32:36,331 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:32:36,330 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:32:36,332 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 15:32:36,332 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:32:36,344 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/fornecedores/cpf-cnpj/79686451404?isInclusao=true failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-1: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository.findMaxId(FornecedorRepository.java:72)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository_ClientProxy.findMaxId(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FornecedorService.findByCpfCnpj(FornecedorService.java:183)
	at br.gov.caixa.sistemas.silic.service.FornecedorService_ClientProxy.findByCpfCnpj(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource.findByCpfCnpj(FornecedorResource.java:50)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/VM/PCgwQuOGmw3eTeLoPw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:42:56,808 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-19) Token expirado, solicitando novo token.
2026-08-31 15:42:56,810 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-19) Limpando token-cache
2026-08-31 15:43:31,734 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Localizar cotribuinte pelo CPF 79686451404 na Receita Federal
2026-08-31 15:43:31,818 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Contribuinte localizado WALDEMIR VIEIRA DO AMARAL
2026-08-31 15:43:31,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@2868df86)
2026-08-31 15:43:31,326 INFO  [ora.jdbc] (agroal-21) traceId=6857F453. 
2026-08-31 15:43:31,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:31,328 INFO  [ora.jdbc] (agroal-21) traceId=6857F453, anoEnabled=true. 
2026-08-31 15:43:31,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:31,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:31,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:31,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 6857F453
2026-08-31 15:43:31,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:31,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:31,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:31,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:31,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:31,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 6857F453
2026-08-31 15:43:31,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:31,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:31,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:31,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:31,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:31,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 6857F453
2026-08-31 15:43:31,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:31,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:43:31,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:43:31,858 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:43:31,858 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 15:43:31,858 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:43:31,859 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/fornecedores/cpf-cnpj/79686451404?isInclusao=true failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-2: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository.findMaxId(FornecedorRepository.java:72)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository_ClientProxy.findMaxId(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FornecedorService.findByCpfCnpj(FornecedorService.java:183)
	at br.gov.caixa.sistemas.silic.service.FornecedorService_ClientProxy.findByCpfCnpj(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource.findByCpfCnpj(FornecedorResource.java:50)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6GqYkrW+Q8+i4e2PmoMn1g==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:43:42,212 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Localizar cotribuinte pelo CPF 79686451404 na Receita Federal
2026-08-31 15:43:42,278 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Contribuinte localizado WALDEMIR VIEIRA DO AMARAL
2026-08-31 15:43:41,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@64bdc5f5)
2026-08-31 15:43:41,326 INFO  [ora.jdbc] (agroal-21) traceId=7A21C9C0. 
2026-08-31 15:43:41,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:41,328 INFO  [ora.jdbc] (agroal-21) traceId=7A21C9C0, anoEnabled=true. 
2026-08-31 15:43:41,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:41,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:41,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:41,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7A21C9C0
2026-08-31 15:43:41,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:41,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:41,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:41,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:41,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:41,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7A21C9C0
2026-08-31 15:43:41,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:41,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:41,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:41,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:41,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:41,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7A21C9C0
2026-08-31 15:43:41,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:41,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:43:41,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:43:42,307 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:43:42,307 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 15:43:42,307 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:43:42,308 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/fornecedores/cpf-cnpj/79686451404?isInclusao=true failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-3: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository.findMaxId(FornecedorRepository.java:72)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository_ClientProxy.findMaxId(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FornecedorService.findByCpfCnpj(FornecedorService.java:183)
	at br.gov.caixa.sistemas.silic.service.FornecedorService_ClientProxy.findByCpfCnpj(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource.findByCpfCnpj(FornecedorResource.java:50)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+4BbSlxrTiiP3grmFSHVbw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:43:52,209 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Localizar cotribuinte pelo CPF 79686451404 na Receita Federal
2026-08-31 15:43:52,274 INFO  [br.gov.cai.sis.sil.ser.FornecedorService] (executor-thread-19) Contribuinte localizado WALDEMIR VIEIRA DO AMARAL
2026-08-31 15:43:51,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@59fd97cb)
2026-08-31 15:43:51,326 INFO  [ora.jdbc] (agroal-21) traceId=380E093. 
2026-08-31 15:43:51,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:51,328 INFO  [ora.jdbc] (agroal-21) traceId=380E093, anoEnabled=true. 
2026-08-31 15:43:51,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:51,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:51,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:51,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 380E093
2026-08-31 15:43:51,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:51,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:51,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:51,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:51,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:51,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 380E093
2026-08-31 15:43:51,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:51,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:43:51,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:43:51,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:43:51,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:43:51,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 380E093
2026-08-31 15:43:51,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:43:51,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:43:51,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:43:52,298 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:43:52,298 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 15:43:52,299 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:43:52,299 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/fornecedores/cpf-cnpj/79686451404?isInclusao=true failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-4: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:473)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository.findMaxId(FornecedorRepository.java:72)
	at br.gov.caixa.sistemas.silic.respository.FornecedorRepository_ClientProxy.findMaxId(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FornecedorService.findByCpfCnpj(FornecedorService.java:183)
	at br.gov.caixa.sistemas.silic.service.FornecedorService_ClientProxy.findByCpfCnpj(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource.findByCpfCnpj(FornecedorResource.java:50)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.FornecedorResource_Subclass.findByCpfCnpj(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Tg3PqJ0eQy6jUIPy9WydIg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:44:37,423 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-12) USUARIO LOGADO: 891389
2026-08-31 15:44:37,424 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-12) PERFIL USUARIO: Administrador
2026-08-31 15:44:37,428 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-12) UNIDADE USUARIO: UnidadeLotacaoDTO(codigo=7111, numeroNatural=3495, nomeUnidade=null, siglaUnidade=null)
2026-08-31 15:44:37,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@26346571)
2026-08-31 15:44:37,326 INFO  [ora.jdbc] (agroal-21) traceId=EBC1C12. 
2026-08-31 15:44:37,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:44:37,328 INFO  [ora.jdbc] (agroal-21) traceId=EBC1C12, anoEnabled=true. 
2026-08-31 15:44:37,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:44:37,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:44:37,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:44:37,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = EBC1C12
2026-08-31 15:44:37,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:44:37,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:44:37,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:44:37,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:44:37,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:44:37,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = EBC1C12
2026-08-31 15:44:37,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:44:37,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:44:37,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:44:37,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:44:37,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:44:37,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = EBC1C12
2026-08-31 15:44:37,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:44:37,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:44:37,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:44:37,653 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:44:37,653 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) SQL Error: 12514, SQLState: 08006
2026-08-31 15:44:37,653 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:44:37,657 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-12) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 15:44:37,658 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-12) HTTP Request to /api/v2/notificacoes/consultar?page=0&pageSize=10&perfilusuarioLogado=LIC_ADMINISTRADOR failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-5: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.NotificacaoRepository.findByFilterPaginado(NotificacaoRepository.java:138)
	at br.gov.caixa.sistemas.silic.respository.NotificacaoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.NotificacaoService.findByFilterPaginado(NotificacaoService.java:166)
	at br.gov.caixa.sistemas.silic.service.NotificacaoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource.findByFilterPaginado(NotificacaoResource.java:47)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass$$function$$4.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=gGsT0sLEQDC1ZynMaU8pNA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:46:00,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5033f046)
2026-08-31 15:46:00,326 INFO  [ora.jdbc] (agroal-21) traceId=7FB2F262. 
2026-08-31 15:46:00,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:46:00,328 INFO  [ora.jdbc] (agroal-21) traceId=7FB2F262, anoEnabled=true. 
2026-08-31 15:46:00,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:46:00,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:46:00,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:46:00,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7FB2F262
2026-08-31 15:46:00,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:46:00,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:46:00,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:46:00,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:46:00,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:46:00,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7FB2F262
2026-08-31 15:46:00,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:46:00,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:46:00,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:46:00,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:46:00,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:46:00,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 7FB2F262
2026-08-31 15:46:00,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:46:00,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:46:00,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:46:01,121 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:46:01,122 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) SQL Error: 12514, SQLState: 08006
2026-08-31 15:46:01,122 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:46:01,122 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-12) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 15:46:01,123 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-12) HTTP Request to /api/v2/contratos/sincronizar-siclg/2514/2021 failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-6: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.ContratoRepository.findLastVersao(ContratoRepository.java:26)
	at br.gov.caixa.sistemas.silic.respository.ContratoRepository_ClientProxy.findLastVersao(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.ContratoService.findLastVersion(ContratoService.java:71)
	at br.gov.caixa.sistemas.silic.service.ContratoService_Subclass.findLastVersion$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.ContratoService_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInCallerTx(TransactionalInterceptorBase.java:335)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:40)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.ContratoService_Subclass.findLastVersion(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.ContratoService.sincronizarSiclg(ContratoService.java:105)
	at br.gov.caixa.sistemas.silic.service.ContratoService_Subclass.sincronizarSiclg$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.ContratoService_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.doIntercept(TransactionalInterceptorRequiresNew.java:39)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.intercept(TransactionalInterceptorRequiresNew.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.ContratoService_Subclass.sincronizarSiclg(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.ContratoService.sincronizarSiclgWithDTO(ContratoService.java:82)
	at br.gov.caixa.sistemas.silic.service.ContratoService_ClientProxy.sincronizarSiclgWithDTO(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.ContratoResource.findById(ContratoResource.java:31)
	at br.gov.caixa.sistemas.silic.resources.ContratoResource_Subclass.findById$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.ContratoResource_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.ContratoResource_Subclass.findById(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=EGvrSrY7TSSV9DQ6M4E7AA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:48:36,352 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-12) Token expirado, solicitando novo token.
2026-08-31 15:48:36,353 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-12) Limpando token-cache
2026-08-31 15:48:36,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@e611e32)
2026-08-31 15:48:36,326 INFO  [ora.jdbc] (agroal-21) traceId=4639FCDF. 
2026-08-31 15:48:36,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:48:36,328 INFO  [ora.jdbc] (agroal-21) traceId=4639FCDF, anoEnabled=true. 
2026-08-31 15:48:36,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:48:36,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:48:36,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:48:36,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 4639FCDF
2026-08-31 15:48:36,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:48:36,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:48:36,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:48:36,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:48:36,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:48:36,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 4639FCDF
2026-08-31 15:48:36,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:48:36,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:48:36,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:48:36,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:48:36,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:48:36,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 4639FCDF
2026-08-31 15:48:36,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:48:36,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:48:36,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:48:36,439 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:48:36,439 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 15:48:36,439 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:48:36,440 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/tipos-situacao-ateste failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-7: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.list(CommonPanacheQueryImpl.java:280)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.list(PanacheQueryImpl.java:149)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:24)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:10)
	at io.quarkus.hibernate.orm.panache.common.runtime.AbstractJpaOperations.listAll(AbstractJpaOperations.java:305)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository.listAll(TipoSituacaoAtesteRepository.java)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository_ClientProxy.listAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService.findAll(TipoSituacaoAtesteService.java:19)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService_ClientProxy.findAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource.findAll(TipoSituacaoAtesteResource.java:30)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QRegcquWQo6ceKXMZeQ/jA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:51:23,132 WARN  [org.jbo.res.res.i18n] (executor-thread-12) RESTEASY002160: Provider instance br.gov.caixa.sistemas.silic.integracao.client.siclg.log.RequestLoggingFilter is already registered.  2nd registration is being ignored.
2026-08-31 15:51:22,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@4e808ceb)
2026-08-31 15:51:22,326 INFO  [ora.jdbc] (agroal-21) traceId=1983B8FE. 
2026-08-31 15:51:22,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:51:22,328 INFO  [ora.jdbc] (agroal-21) traceId=1983B8FE, anoEnabled=true. 
2026-08-31 15:51:22,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:51:22,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:51:22,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:51:22,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 1983B8FE
2026-08-31 15:51:22,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:51:22,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:51:22,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:51:22,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:51:22,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:51:22,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 1983B8FE
2026-08-31 15:51:22,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:51:22,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:51:22,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:51:22,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:51:22,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:51:22,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 1983B8FE
2026-08-31 15:51:22,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:51:22,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:51:22,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:51:23,182 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:51:23,182 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) SQL Error: 12514, SQLState: 08006
2026-08-31 15:51:23,182 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:51:23,183 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-12) HTTP Request to /api/v2/planos-aquisicao/consultar-anos-do-plano-aquisicao failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-8: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository.getAnosDoPlanoAquisicao(PlanoAquisicaoRepository.java:131)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository_ClientProxy.getAnosDoPlanoAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.getAnosDoPlanoAquisicao(PlanoAquisicaoService.java:408)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.getAnosDoPlanoAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource.getAnosDoPlanoAquisicao(PlanoAquisicaoResource.java:62)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.getAnosDoPlanoAquisicao$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass$$function$$12.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.getAnosDoPlanoAquisicao(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=SMkktMqRS7+Uelmw9jiigA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:51:29,637 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-12) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-31 15:51:29,325 INFO  [ora.jdbc] (agroal-21) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5e80993)
2026-08-31 15:51:29,326 INFO  [ora.jdbc] (agroal-21) traceId=38C48111. 
2026-08-31 15:51:29,327 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:51:29,328 INFO  [ora.jdbc] (agroal-21) traceId=38C48111, anoEnabled=true. 
2026-08-31 15:51:29,329 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:51:29,330 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:51:29,331 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:51:29,332 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 38C48111
2026-08-31 15:51:29,333 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:51:29,334 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:51:29,335 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:51:29,336 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:51:29,337 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:51:29,338 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 38C48111
2026-08-31 15:51:29,339 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:51:29,340 INFO  [ora.jdbc] (agroal-21) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 15:51:29,341 FINEST [ora.jdbc] (agroal-21) 74 bytes written to the Socket.
2026-08-31 15:51:29,342 FINEST [ora.jdbc] (agroal-21) 286 bytes written to the Socket.
2026-08-31 15:51:29,343 FINEST [ora.jdbc] (agroal-21) 95 bytes
2026-08-31 15:51:29,344 INFO  [ora.jdbc] (agroal-21) Got Refused, SessionTraceId = 38C48111
2026-08-31 15:51:29,345 INFO  [ora.jdbc] (agroal-21) Outbound interrupt timer cancelled null
2026-08-31 15:51:29,346 INFO  [ora.jdbc] (agroal-21) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 15:51:29,347 INFO  [ora.jdbc] (agroal-21) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 15:51:29,668 WARN  [io.agr.pool] (agroal-21) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:51:29,668 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) SQL Error: 12514, SQLState: 08006
2026-08-31 15:51:29,668 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-12) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 15:51:29,669 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-12) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 15:51:29,669 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-12) HTTP Request to /api/v2/planos-aquisicao/consultar?page=0&pageSize=10 failed, error id: c3b2d833-d4aa-4df4-baa9-065506cc4b30-9: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository.findByFilterPaginado(PlanoAquisicaoRepository.java:184)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.findByFilterPaginado(PlanoAquisicaoService.java:412)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource.findByFilterPaginado(PlanoAquisicaoResource.java:70)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass$$function$$8.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ijivXDX7TPeSmj1DXBizEw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

