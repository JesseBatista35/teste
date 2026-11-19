


<img width="1901" height="1019" alt="image" src="https://github.com/user-attachments/assets/3f1c3515-8bd9-4a1d-b4e7-200a8bc682b9" />



[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# grep -n "SenhasSIIBC\|UnsatisfiedLink\|Autenticacao" /opt/jboss-eap/standalone/log/server.log | tail -20
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]# grep -n "ERROR" /opt/jboss-eap/standalone/log/server.log | grep "$(date +%Y-%m-%d) 11:" | tail -20
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#
[root@caddeapllx2854 ~]#


o jeferson achou isso aqui


        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:180)
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68)
        at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35)
        at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:94)
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263)
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237)
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
        at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:152)
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286)
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243)
        at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214)
        at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:179)
        at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:119)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1215)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1246)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:170)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:128)
        at java.security.AccessController.doPrivileged(Native Method)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:664)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:213)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.lang.Thread.run(Thread.java:750)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied

https://docs.oracle.com/error-help/db/ora-01017/
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715)
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:610)
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:605)
        at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1707)
        at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:936)
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:975)
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:547)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithO5Logon(T4CTTIoauthenticate.java:1746)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1493)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
        at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:2388)
        at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:2325)
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1138)
        at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1178)
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:106)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:909)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:707)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 39 more

2026-11-19 11:13:39,144 WARN  [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator] (ServerService Thread Pool -- 79) HHH000342: Could not obtain connection to query metadata : javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/SIGSJ04
2026-11-19 11:13:39,157 INFO  [org.hibernate.dialect.Dialect] (ServerService Thread Pool -- 79) HHH000400: Using dialect: org.hibernate.dialect.Oracle10gDialect
2026-11-19 11:13:39,177 INFO  [org.hibernate.engine.jdbc.env.internal.LobCreatorBuilderImpl] (ServerService Thread Pool -- 79) HHH000422: Disabling contextual LOB creation as connection was null
2026-11-19 11:13:39,189 INFO  [org.hibernate.envers.boot.internal.EnversServiceImpl] (ServerService Thread Pool -- 79) Envers integration enabled? : true
2026-11-19 11:13:39,596 ERROR [org.jboss.modcluster] (UndertowEventHandlerAdapterService - 1) MODCLUSTER000043: Failed to send INFO command to localhost/127.0.0.1:6666: Conexão recusada (Connection refused)
2026-11-19 11:13:41,247 WARN  [org.jboss.jca.core.connectionmanager.pool.strategy.OnePool] (ServerService Thread Pool -- 79) IJ000604: Throwable while attempting to get a new connection: null: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1328)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:505)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getSimpleConnection(AbstractPool.java:688)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:653)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        at org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate.internal.SessionFactoryImpl$1.obtainConnection(SessionFactoryImpl.java:460)
        at org.hibernate.hql.spi.id.IdTableHelper.executeIdTableCreationStatements(IdTableHelper.java:67)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:125)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:42)
        at org.hibernate.hql.spi.id.AbstractMultiTableBulkIdStrategyImpl.prepare(AbstractMultiTableBulkIdStrategyImpl.java:88)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:303)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1250)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:170)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:128)
        at java.security.AccessController.doPrivileged(Native Method)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:664)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:213)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.lang.Thread.run(Thread.java:750)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied

https://docs.oracle.com/error-help/db/ora-01017/
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715)
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:610)
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:605)
        at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1707)
        at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:936)
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:975)
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:547)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithO5Logon(T4CTTIoauthenticate.java:1746)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1493)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
        at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:2388)
        at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:2325)
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1138)
        at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1178)
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:106)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:909)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:707)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 32 more

2026-11-19 11:13:41,248 ERROR [org.hibernate.hql.spi.id.IdTableHelper] (ServerService Thread Pool -- 79) Unable obtain JDBC Connection: java.sql.SQLException: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/SIGSJ04
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:160)
        at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate.internal.SessionFactoryImpl$1.obtainConnection(SessionFactoryImpl.java:460)
        at org.hibernate.hql.spi.id.IdTableHelper.executeIdTableCreationStatements(IdTableHelper.java:67)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:125)
        at org.hibernate.hql.spi.id.global.GlobalTemporaryTableBulkIdStrategy.finishPreparation(GlobalTemporaryTableBulkIdStrategy.java:42)
        at org.hibernate.hql.spi.id.AbstractMultiTableBulkIdStrategyImpl.prepare(AbstractMultiTableBulkIdStrategyImpl.java:88)
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:303)
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:467)
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1250)
        at org.jboss.as.jpa.hibernate5.TwoPhaseBootstrapImpl.build(TwoPhaseBootstrapImpl.java:44)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:170)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1$1.run(PersistenceUnitServiceImpl.java:128)
        at java.security.AccessController.doPrivileged(Native Method)
        at org.wildfly.security.manager.WildFlySecurityManager.doChecked(WildFlySecurityManager.java:664)
        at org.jboss.as.jpa.service.PersistenceUnitServiceImpl$1.run(PersistenceUnitServiceImpl.java:213)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
        at java.lang.Thread.run(Thread.java:750)
        at org.jboss.threads.JBossThread.run(JBossThread.java:513)
Caused by: javax.resource.ResourceException: IJ000453: Unable to get managed connection for java:jboss/datasources/SIGSJ04
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:690)
        at org.jboss.jca.core.connectionmanager.tx.TxConnectionManagerImpl.getManagedConnection(TxConnectionManagerImpl.java:440)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        ... 22 more
Caused by: javax.resource.ResourceException: IJ031084: Unable to create connection
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:364)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.getLocalManagedConnection(LocalManagedConnectionFactory.java:371)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createManagedConnection(LocalManagedConnectionFactory.java:287)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.createConnectionEventListener(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:1328)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:505)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getSimpleConnection(AbstractPool.java:688)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:653)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        ... 25 more
Caused by: java.sql.SQLException: ORA-01017: invalid username/password; logon denied

https://docs.oracle.com/error-help/db/ora-01017/
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715)
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:610)
        at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:605)
        at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1707)
        at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:936)
        at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:975)
        at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:547)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithO5Logon(T4CTTIoauthenticate.java:1746)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1493)
        at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
        at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:2388)
        at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:2325)
        at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:1138)
        at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1178)
        at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:106)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:909)
        at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:707)
        at org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory.createLocalManagedConnection(LocalManagedConnectionFactory.java:335)
        ... 32 more

2026-11-19 11:13:41,261 INFO  [org.hibernate.hql.internal.QueryTranslatorFactoryInitiator] (ServerService Thread Pool -- 79) HHH000397: Using ASTQueryTranslatorFactory
2026-11-19 11:13:42,535 INFO  [javax.enterprise.resource.webcontainer.jsf.config] (ServerService Thread Pool -- 90) Initializing Mojarra (1.2_15-20100816-SNAPSHOT) for context '/sigsj_internet'
2026-11-19 11:13:43,048 INFO  [javax.enterprise.resource.webcontainer.jsf.application] (ServerService Thread Pool -- 90) JSF1048: PostConstruct/PreDestroy annotations present.  ManagedBeans methods marked with these annotations will have said annotations processed.
2026-11-19 11:13:43,395 INFO  [br.gov.caixa.sigsj.common.sirot.IsoXmlMapeamento] (ServerService Thread Pool -- 90) Mapeando XML : GJXC
2026-11-19 11:13:43,404 DEBUG [br.gov.caixa.sigsj.internet.servlet.CaixaConfigServlet] (ServerService Thread Pool -- 90) SIGSJ INTERNET SUBIU COM SUCESSO!
2026-11-19 11:13:43,404 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 90) WFLYUT0021: Contexto web registrado: '/sigsj_internet' para servidor 'default-server'
2026-11-19 11:13:43,484 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "ojdbc8.jar" foi implantado (runtime-name: "ojdbc8.jar")
2026-11-19 11:13:43,485 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 43) WFLYSRV0010: "sigsj_internet-ear.ear" foi implantado (runtime-name: "sigsj_internet-ear.ear")
2026-11-19 11:13:43,527 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Retomando servidor
2026-11-19 11:13:43,532 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: JBoss EAP 7.4.18.GA (WildFly Core 15.0.37.Final-redhat-00001) iniciado em 18478ms - Iniciado(s) 1844 de serviços 2028 (os serviços 371 estão lentos, passivos ou sob demanda)
2026-11-19 11:13:43,533 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: A interface de gerenciamento http escutando em http://0.0.0.0:9990/management
2026-11-19 11:13:43,533 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: O console de administração escutando em http://0.0.0.0:9990
2026-11-19 11:16:34,194 INFO  [org.ajax4jsf.cache.CacheManager] (default task-1) Selected [org.ajax4jsf.cache.LRUMapCacheFactory] cache factory
2026-11-19 11:16:34,205 INFO  [org.ajax4jsf.cache.LRUMapCacheFactory] (default task-1) Creating LRUMap cache instance using parameters: {facelets.RECREATE_VALUE_EXPRESSION_ON_BUILD_BEFORE_RESTORE=false, javax.faces.DEFAULT_SUFFIX=.xhtml, com.sun.faces.numberOfLogicalViews=10, org.ajax4jsf.VIEW_HANDLERS=com.sun.facelets.FaceletViewHandler, url-verificar=/acesso-restrito/, facelets.DEVELOPMENT=false, org.ajax4jsf.PREVENT_INIT_PHASE_LISTENER=true, org.richfaces.LoadScriptStrategy=ALL, org.ajax4jsf.COMPRESS_SCRIPT=true, org.jboss.jbossfaces.WAR_BUNDLES_JSF_IMPL=true, facelets.REFRESH_PERIOD=-1, com.sun.faces.verifyObjects=false, facelets.LIBRARIES=/WEB-INF/facelet/mensagem/mensagem.taglib.xml;/WEB-INF/facelet/guias/guias.taglib.xml;/WEB-INF/facelet/saibamais/modalsaibamais.taglib.xml;/WEB-INF/facelet/confirmacao/confirm.taglib.xml, org.ajax4jsf.xmlparser.NEKO=.*\..*, javax.faces.CONFIG_FILES=/WEB-INF/managed-beans.xml,/WEB-INF/navigation-rules.xml, org.ajax4jsf.xmlparser.ORDER=NEKO, com.sun.faces.numberOfViewsInSession=3, com.sun.faces.validateXml=false, javax.faces.STATE_SAVING_METHOD=server, com.sun.faces.enableRestoreView11Compatibility=true, releaseBundle=/apl/sigsj/properties/release.properties, org.richfaces.SKIN=classic}
2026-11-19 11:16:34,205 INFO  [org.ajax4jsf.cache.LRUMapCacheFactory] (default task-1) Creating LRUMap cache instance of default capacity
2026-11-19 11:16:34,240 INFO  [org.ajax4jsf.cache.CacheManager] (default task-1) Selected [org.ajax4jsf.cache.LRUMapCacheFactory] cache factory
2026-11-19 11:16:34,242 INFO  [org.ajax4jsf.cache.LRUMapCacheFactory] (default task-1) Creating LRUMap cache instance using parameters: {facelets.RECREATE_VALUE_EXPRESSION_ON_BUILD_BEFORE_RESTORE=false, javax.faces.DEFAULT_SUFFIX=.xhtml, com.sun.faces.numberOfLogicalViews=10, org.ajax4jsf.VIEW_HANDLERS=com.sun.facelets.FaceletViewHandler, url-verificar=/acesso-restrito/, facelets.DEVELOPMENT=false, org.ajax4jsf.PREVENT_INIT_PHASE_LISTENER=true, org.richfaces.LoadScriptStrategy=ALL, org.ajax4jsf.COMPRESS_SCRIPT=true, org.jboss.jbossfaces.WAR_BUNDLES_JSF_IMPL=true, facelets.REFRESH_PERIOD=-1, com.sun.faces.verifyObjects=false, facelets.LIBRARIES=/WEB-INF/facelet/mensagem/mensagem.taglib.xml;/WEB-INF/facelet/guias/guias.taglib.xml;/WEB-INF/facelet/saibamais/modalsaibamais.taglib.xml;/WEB-INF/facelet/confirmacao/confirm.taglib.xml, org.ajax4jsf.xmlparser.NEKO=.*\..*, javax.faces.CONFIG_FILES=/WEB-INF/managed-beans.xml,/WEB-INF/navigation-rules.xml, org.ajax4jsf.xmlparser.ORDER=NEKO, com.sun.faces.numberOfViewsInSession=3, com.sun.faces.validateXml=false, javax.faces.STATE_SAVING_METHOD=server, com.sun.faces.enableRestoreView11Compatibility=true, releaseBundle=/apl/sigsj/properties/release.properties, org.richfaces.SKIN=classic}
2026-11-19 11:16:34,242 INFO  [org.ajax4jsf.cache.LRUMapCacheFactory] (default task-1) Creating LRUMap cache instance of default capacity
