
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# zcat /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-07.gz | grep -n "WebXml\|NoClassDefFoundError"
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# sed -n '1,50p' /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
01:00:00,237 DEBUG [org.hibernate.SQL] (EJB default - 1) delete from argsm001.argtb18_auditoria where dh_auditoria<?
01:00:00,393 WARN  [org.jboss.jca.adapters.jdbc.local.LocalManagedConnectionFactory] (EJB default - 1) IJ030027: Destroying connection that is not valid, due to the following exception: org.postgresql.jdbc.PgConnection@45eff958: org.postgresql.util.PSQLException: An I/O error occurred while sending to the backend.
        at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:349) [postgresql-42.2.25.jar:42.2.25]
        at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:481) [postgresql-42.2.25.jar:42.2.25]
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:401) [postgresql-42.2.25.jar:42.2.25]
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:322) [postgresql-42.2.25.jar:42.2.25]
        at org.postgresql.jdbc.PgStatement.executeCachedSql(PgStatement.java:308) [postgresql-42.2.25.jar:42.2.25]
        at org.postgresql.jdbc.PgStatement.executeWithFlags(PgStatement.java:284) [postgresql-42.2.25.jar:42.2.25]
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:279) [postgresql-42.2.25.jar:42.2.25]
        at org.jboss.jca.adapters.jdbc.CheckValidConnectionSQL.isValidConnection(CheckValidConnectionSQL.java:94)
        at org.jboss.jca.adapters.jdbc.BaseWrapperManagedConnectionFactory.isValidConnection(BaseWrapperManagedConnectionFactory.java:1369)
        at org.jboss.jca.adapters.jdbc.BaseWrapperManagedConnectionFactory.getInvalidConnections(BaseWrapperManagedConnectionFactory.java:1173)
        at org.jboss.jca.core.connectionmanager.pool.mcp.SemaphoreConcurrentLinkedDequeManagedConnectionPool.getConnection(SemaphoreConcurrentLinkedDequeManagedConnectionPool.java:382)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getSimpleConnection(AbstractPool.java:688)
        at org.jboss.jca.core.connectionmanager.pool.AbstractPool.getConnection(AbstractPool.java:653)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:624)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.getManagedConnection(AbstractConnectionManager.java:597)
        at org.jboss.jca.core.connectionmanager.AbstractConnectionManager.allocateConnection(AbstractConnectionManager.java:789)
        at org.jboss.jca.adapters.jdbc.WrapperDataSource.getConnection(WrapperDataSource.java:152)
        at org.jboss.as.connector.subsystems.datasources.WildFlyDataSource.getConnection(WildFlyDataSource.java:64)
        at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122)
        at org.hibernate.internal.NonContextualJdbcConnectionAccess.obtainConnection(NonContextualJdbcConnectionAccess.java:35)
        at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:106)
        at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:136)
        at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:50)
        at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$1.doPrepare(StatementPreparerImpl.java:90)
        at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:176)
        at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareStatement(StatementPreparerImpl.java:81)
        at org.hibernate.hql.internal.ast.exec.BasicExecutor.doExecute(BasicExecutor.java:87)
        at org.hibernate.hql.internal.ast.exec.BasicExecutor.execute(BasicExecutor.java:59)
        at org.hibernate.hql.internal.ast.exec.DeleteExecutor.execute(DeleteExecutor.java:109)
        at org.hibernate.hql.internal.ast.QueryTranslatorImpl.executeUpdate(QueryTranslatorImpl.java:453)
        at org.hibernate.engine.query.spi.HQLQueryPlan.performExecuteUpdate(HQLQueryPlan.java:378)
        at org.hibernate.internal.SessionImpl.executeUpdate(SessionImpl.java:1550)
        at org.hibernate.query.internal.AbstractProducedQuery.doExecuteUpdate(AbstractProducedQuery.java:1663)
        at org.hibernate.query.internal.AbstractProducedQuery.executeUpdate(AbstractProducedQuery.java:1645)
        at br.gov.caixa.gitecsa.siarg.schedule.JobExpurgoAuditoria.expurgar(JobExpurgoAuditoria.java:31)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) [rt.jar:1.8.0_472]
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) [rt.jar:1.8.0_472]
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) [rt.jar:1.8.0_472]
        at java.lang.reflect.Method.invoke(Method.java:498) [rt.jar:1.8.0_472]
        at org.jboss.as.ee.component.ManagedReferenceMethodInterceptor.processInvocation(ManagedReferenceMethodInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.WeavedInterceptor.processInvocation(WeavedInterceptor.java:50)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:61)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.delegateInterception(Jsr299BindingsInterceptor.java:79)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:89)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:104)
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]#
[root@caddeapllx2577 tmp]# for f in /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-0*.gz; do echo "== $f =="; zgrep -c "WebXmlSingleton" "$f"; done
== /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-01.gz ==
0
== /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-02.gz ==
0
== /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-03.gz ==
0
== /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-04.gz ==
19
== /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-05.gz ==
0
== /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-06.gz ==
0
== /logs/jboss/jboss-eap/standalone/siarg-interno/server.log.2026-09-07.gz ==
0
[root@caddeapllx2577 tmp]#
