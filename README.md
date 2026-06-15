INFO exec -a "java" java -Dhttps.proxyHost=${HTTPS_PROXY} -Dhttp.proxyHost=${HTTP_PROXY} -Dhttp.nonProxyHosts=${NO_PROXY} -XX:MaxRAMPercentage=80.0 -XX:+UseParallelGC -XX:MinHeapFreeRatio=10 -XX:MaxHeapFreeRatio=20 -XX:GCTimeRatio=4 -XX:AdaptiveSizePolicyWeight=90 -XX:+ExitOnOutOfMemoryError -Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -cp "." -jar /deployments/quarkus-run.jar
INFO running in /deployments
__  ____  __  _____   ___  __ ____  ______
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/
2026-06-15 17:29:50,506 WARN  [io.agr.pool] (JPA Startup Thread) Datasource '<default>': Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
2026-06-15 17:29:50,601 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
2026-06-15 17:29:50,602 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (JPA Startup Thread) SQL Error: 0, SQLState: null
2026-06-15 17:29:50,602 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (JPA Startup Thread) Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
2026-06-15 17:29:50,603 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread) HHH000342: Could not obtain connection to query metadata: org.hibernate.exception.GenericJDBCException: unable to obtain isolated JDBC connection [Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc] [n/a]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.doTheWork(JtaIsolationDelegate.java:206)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.lambda$delegateWork$3(JtaIsolationDelegate.java:91)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.doInSuspendedTransaction(JtaIsolationDelegate.java:125)
	at org.hibernate.resource.transaction.backend.jta.internal.JtaIsolationDelegate.delegateWork(JtaIsolationDelegate.java:88)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:320)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215)
	at org.hibernate.service.ServiceRegistry.requireService(ServiceRegistry.java:68)
	at org.hibernate.engine.jdbc.internal.JdbcServicesImpl.configure(JdbcServicesImpl.java:52)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.configureService(StandardServiceRegistryImpl.java:136)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:247)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215)
	at org.hibernate.service.ServiceRegistry.requireService(ServiceRegistry.java:68)
	at org.hibernate.boot.internal.SessionFactoryOptionsBuilder.<init>(SessionFactoryOptionsBuilder.java:290)
	at io.quarkus.hibernate.orm.runtime.recording.PrevalidatedQuarkusMetadata.buildSessionFactoryOptionsBuilder(PrevalidatedQuarkusMetadata.java:72)
	at io.quarkus.hibernate.orm.runtime.boot.FastBootEntityManagerFactoryBuilder.build(FastBootEntityManagerFactoryBuilder.java:84)
	at io.quarkus.hibernate.orm.runtime.FastBootHibernatePersistenceProvider.createEntityManagerFactory(FastBootHibernatePersistenceProvider.java:72)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:80)
	at jakarta.persistence.Persistence.createEntityManagerFactory(Persistence.java:55)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$LazyPersistenceUnit.get(JPAConfig.java:163)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$1.run(JPAConfig.java:63)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.sql.SQLException: Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
	at io.agroal.pool.ConnectionFactory.connectionSetup(ConnectionFactory.java:241)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:225)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:580)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:561)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	... 1 more

2026-06-15 17:29:51,477 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
2026-06-15 17:29:51,477 ERROR [org.hib.que.sqm.mut.int.tem.GlobalTemporaryTableStrategy] (JPA Startup Thread) Unable obtain JDBC Connection: java.sql.SQLException: Driver does not support the provided URL: jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
	at io.agroal.pool.ConnectionFactory.connectionSetup(ConnectionFactory.java:241)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:225)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:580)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:561)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

2026-06-15 17:29:51,686 WARN  [io.qua.hib.orm.run.ser.QuarkusRuntimeInitDialectFactory] (JPA Startup Thread) Persistence unit <default>: Could not retrieve the database version to check it is at least 2.3.230
2026-06-15 17:29:51,985 INFO  [io.quarkus] (main) motor-decisao 1.0.0 on JVM (powered by Quarkus 3.19.4) started in 4.660s. Listening on: http://0.0.0.0:8080
2026-06-15 17:29:51,987 INFO  [io.quarkus] (main) Profile prod activated.
2026-06-15 17:29:51,987 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, jdbc-h2, narayana-jta, rest, rest-jackson, smallrye-context-propagation, vertx]
