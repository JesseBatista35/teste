    Topology
    Pods
    Deployments
    DeploymentConfigs
    StatefulSets
    Secrets
    ConfigMaps
    CronJobs
    Jobs
    DaemonSets
    ReplicaSets
    ReplicationControllers
    HorizontalPodAutoscalers
    PodDisruptionBudgets

    Pods

    Pod details

PodP sispl-captacao-mkp-des-899b87c47-dwdjg
Running

    Details
    Metrics
    YAML
    Environment
    Logs
    Events
    Terminal

Streaming events...
Showing 7 events
Older events are not stored.
PodPsispl-captacao-mkp-des-899b87c47-dwdjgNamespaceNSsispl-des
Just now
Generated from kubelet on nctvmrh001-scgft-worker-0-bg5hq
7 times in the last 0 minutes
Readiness probe failed: Get "http://25.130.7.17:8080/q/health/ready": context deadline exceeded (Client.Timeout exceeded while awaiting headers)
PodPsispl-captacao-mkp-des-899b87c47-dwdjgNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-bg5hq
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-captacao-mkp:2.5.0.3" in 2.955s (2.955s including waiting). Image size: 887562142 bytes.
PodPsispl-captacao-mkp-des-899b87c47-dwdjgNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-bg5hq
Created container: sispl-captacao-mkp-des
PodPsispl-captacao-mkp-des-899b87c47-dwdjgNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-bg5hq
Started container sispl-captacao-mkp-des
PodPsispl-captacao-mkp-des-899b87c47-dwdjgNamespaceNSsispl-des
há 1 minuto
Generated from multus
Add eth0 [25.130.7.17/23] from ovn-kubernetes
PodPsispl-captacao-mkp-des-899b87c47-dwdjgNamespaceNSsispl-des
há 1 minuto
Generated from kubelet on nctvmrh001-scgft-worker-0-bg5hq
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-captacao-mkp:2.5.0.3"
PodPsispl-captacao-mkp-des-899b87c47-dwdjgNamespaceNSsispl-des
há 1 minuto
Generated from default-scheduler
Successfully assigned sispl-des/sispl-captacao-mkp-des-899b87c47-dwdjg to nctvmrh001-scgft-worker-0-bg5hq



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-28 16:57:35,015 WARN  [org.hib.eng.jdb.env.int.JdbcEnvironmentInitiator] (JPA Startup Thread: idaa) HHH000342: Could not obtain connection to query metadata: java.sql.SQLException: Acquisition timeout while waiting for new connection
	at io.agroal.pool.ConnectionPool.handlerFromSharedCache(ConnectionPool.java:320)
	at io.agroal.pool.ConnectionPool.getConnection(ConnectionPool.java:248)
	at io.agroal.pool.DataSource.getConnection(DataSource.java:86)
	at io.quarkus.hibernate.orm.runtime.customized.QuarkusConnectionProvider.getConnection(QuarkusConnectionProvider.java:23)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:181)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68)
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:272)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:246)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:223)
	at org.hibernate.engine.jdbc.internal.JdbcServicesImpl.configure(JdbcServicesImpl.java:51)
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.configureService(StandardServiceRegistryImpl.java:107)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:255)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:223)
	at org.hibernate.boot.internal.SessionFactoryOptionsBuilder.<init>(SessionFactoryOptionsBuilder.java:272)
	at io.quarkus.hibernate.orm.runtime.recording.PrevalidatedQuarkusMetadata.buildSessionFactoryOptionsBuilder(PrevalidatedQuarkusMetadata.java:68)
	at io.quarkus.hibernate.orm.runtime.boot.FastBootEntityManagerFactoryBuilder.build(FastBootEntityManagerFactoryBuilder.java:72)
	at io.quarkus.hibernate.orm.runtime.FastBootHibernatePersistenceProvider.createEntityManagerFactory(FastBootHibernatePersistenceProvider.java:72)
	at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:80)
	at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:55)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$LazyPersistenceUnit.get(JPAConfig.java:167)
	at io.quarkus.hibernate.orm.runtime.JPAConfig$1.run(JPAConfig.java:68)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at io.agroal.pool.ConnectionPool.handlerFromSharedCache(ConnectionPool.java:296)
	... 23 more

2026-07-28 16:57:35,047 INFO  [br.gov.cai.lot.sis.MQConsumer] (main) INICIALIZANDO MQ...
2026-07-28 16:57:35,596 INFO  [br.gov.cai.lot.sis.MQConsumer] (main) START MQ
2026-07-28 16:57:36,027 INFO  [io.quarkus] (main) sispl-captacao-mkp 2.5.0.1 on JVM (powered by Quarkus 2.16.4.Final) started in 10.117s. Listening on: http://0.0.0.0:8080
2026-07-28 16:57:36,028 INFO  [io.quarkus] (main) Profile prod activated. 
2026-07-28 16:57:36,028 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-orm-rest-data-panache, hibernate-validator, jdbc-db2, loterias-api-commons, loterias-api-exceptions, narayana-jta, qpid-jms, rest-client, resteasy, resteasy-jackson, smallrye-context-propagation, smallrye-health, smallrye-openapi, vertx]
2026-07-28 16:57:36,130 INFO  [br.gov.cai.lot.sis.MQConsumer] (pool-8-thread-1) LQ.LOG.SISPL.MARKETPLACE
2026-07-28 16:57:36,130 INFO  [br.gov.cai.lot.sis.MQConsumer] (pool-8-thread-1) LQ.LOG.SISPL.MARKETPLACE.BACKOUT
2026-07-28 16:57:36,130 INFO  [br.gov.cai.lot.sis.MQConsumer] (pool-8-thread-1) MQ CONECTADO COM SUCESSO.
2026-07-28 16:58:02,043 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"UP","idaa":"Unable to execute the validation check for DataSource 'idaa': Acquisition timeout while waiting for new connection"}}]}
2026-07-28 16:58:12,028 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"UP","idaa":"Unable to execute the validation check for DataSource 'idaa': Acquisition timeout while waiting for new connection"}}]}
2026-07-28 16:58:22,027 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"UP","idaa":"Unable to execute the validation check for DataSource 'idaa': Acquisition timeout while waiting for new connection"}}]}
2026-07-28 16:58:32,027 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"UP","idaa":"Unable to execute the validation check for DataSource 'idaa': Acquisition timeout while waiting for new connection"}}]}
2026-07-28 16:58:42,026 INFO  [io.sma.health] (executor-thread-0) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"UP","idaa":"Unable to execute the validation check for DataSource 'idaa': Acquisition timeout while waiting for new connection"}}]}
2026-07-28 16:58:47,029 INFO  [io.sma.health] (executor-thread-1) SRHCK01001: Reporting health down status: {"status":"DOWN","checks":[{"name":"Database connections health check","status":"DOWN","data":{"<default>":"UP","idaa":"Unable to execute the validation check for DataSource 'idaa': Acquisition timeout while waiting for new connection"}}]}

