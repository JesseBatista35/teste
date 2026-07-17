2026-07-17T18:22:13.3358054Z ##[section]Starting: Logs da Aplicação
2026-07-17T18:22:13.3361091Z ==============================================================================
2026-07-17T18:22:13.3361174Z Task         : Bash
2026-07-17T18:22:13.3361234Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-07-17T18:22:13.3361310Z Version      : 3.227.0
2026-07-17T18:22:13.3361357Z Author       : Microsoft Corporation
2026-07-17T18:22:13.3361421Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-07-17T18:22:13.3361497Z ==============================================================================
2026-07-17T18:22:14.3390208Z Generating script.
2026-07-17T18:22:14.3400296Z ========================== Starting Command Output ===========================
2026-07-17T18:22:14.3407543Z [command]/bin/bash /opt/ads-agent/_work/_temp/2c202053-d508-4cf4-b55f-49e1fd096ed7.sh
2026-07-17T18:22:14.3453701Z + shopt -s expand_aliases
2026-07-17T18:22:14.3462541Z + [[ -n okd4_nprd ]]
2026-07-17T18:22:14.3462745Z + [[ okd4_nprd =~ ocp ]]
2026-07-17T18:22:14.3462917Z + [[ -n okd4_nprd ]]
2026-07-17T18:22:14.3463036Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-07-17T18:22:14.3465515Z + app=siifx-api-aplicacao-des
2026-07-17T18:22:14.3465692Z + oc version
2026-07-17T18:22:14.4769924Z oc v3.11.0+0cbc58b
2026-07-17T18:22:14.4770689Z kubernetes v1.11.0+d4cacc0
2026-07-17T18:22:14.4771045Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-07-17T18:22:14.4863286Z 
2026-07-17T18:22:14.4863857Z Server https://api.nprd.caixa:6443
2026-07-17T18:22:14.4864236Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-07-17T18:22:14.4924048Z ++ oc get pod -l name=siifx-api-aplicacao-des -n siifx-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-07-17T18:22:14.4924279Z ++ tac
2026-07-17T18:22:14.4924418Z ++ grep -v '^$'
2026-07-17T18:22:14.4924530Z ++ head -n1
2026-07-17T18:22:14.7342650Z + last_pod=siifx-api-aplicacao-des-2656-k5z8r
2026-07-17T18:22:14.7342939Z + echo 'Logs do POD: siifx-api-aplicacao-des-2656-k5z8r'
2026-07-17T18:22:14.7343201Z + oc logs siifx-api-aplicacao-des-2656-k5z8r -c siifx-api-aplicacao-des -n siifx-des
2026-07-17T18:22:14.7343423Z Logs do POD: siifx-api-aplicacao-des-2656-k5z8r
2026-07-17T18:22:15.0067475Z Error from server (BadRequest): container "siifx-api-aplicacao-des" in pod "siifx-api-aplicacao-des-2656-k5z8r" is waiting to start: PodInitializing
2026-07-17T18:22:15.0133164Z ##[error]Bash exited with code '1'.
2026-07-17T18:22:15.0146538Z ##[section]Finishing: Logs da Aplicação






exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-16 10:29:35 [] WARN  io.qu.config - Unrecognized configuration key "quarkus.http.cors" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-16 10:29:35 [] WARN  io.qu.config - Unrecognized configuration key "quarkus.http.connect-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-16 10:29:35 [] WARN  io.qu.config - The "quarkus.hibernate-orm.database.generation" config property is deprecated and should not be used anymore.
2026-07-16 10:29:35 [] WARN  io.qu.ru.co.ConfigRecorder - Build time property cannot be changed at runtime:
 - quarkus.datasource.driver is set to 'oracle.jdbc.driver.OracleDriver' but it is build time fixed to 'null'. Did you change the property quarkus.datasource.driver after building the application?
2026-07-16 10:29:37 [] WARN  or.hi.or.jdbc - HHH100123: Low default JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-07-16 10:29:38 [] INFO  io.quarkus - siifx-caixinhas-api-aplicacao 1.0.0 on JVM (powered by Quarkus 3.33.2.1) started in 5.639s. Listening on: http://0.0.0.0:8080
2026-07-16 10:29:38 [] INFO  io.quarkus - Profile prod activated. 
2026-07-16 10:29:38 [] INFO  io.quarkus - Installed features: [agroal, cache, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-oracle, micrometer, narayana-jta, oidc, rest, rest-client, rest-client-jackson, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-openapi, swagger-ui, vertx]
2026-07-16 10:32:48 [] WARN  or.hi.or.jd.error - HHH000247: ErrorCode: 904, SQLState: 42000
2026-07-16 10:32:48 [] WARN  or.hi.or.jd.error - ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
2026-07-16 10:32:48 [] ERROR io.qu.ve.ht.ru.QuarkusErrorHandler - HTTP Request to /v1/saldos/saldo-analitico?tipoPessoa=1&cpfCnpj=111111111&codigoOferta=1001&codigoCaixinha=2001 failed, error id: e033cb74-333a-47f8-9186-2f99585fce08-1: org.hibernate.exception.SQLGrammarException: JDBC exception executing SQL [ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/] [select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only]
	at org.hibernate.exception.internal.SQLExceptionTypeDelegate.convert(SQLExceptionTypeDelegate.java:64)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:34)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:115)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:290)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:190)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.<init>(JdbcValuesResultSetImpl.java:71)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValues(JdbcSelectExecutorStandardImpl.java:422)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:349)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:143)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:100)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.executeQuery(JdbcSelectExecutor.java:63)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:137)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$1(ConcreteSqmSelectQueryPlan.java:134)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:464)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:392)
	at org.hibernate.query.sqm.internal.SqmSelectionQueryImpl.doList(SqmSelectionQueryImpl.java:410)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:153)
	at org.hibernate.query.SelectionQuery.getResultList(SelectionQuery.java:145)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResult(CommonPanacheQueryImpl.java:365)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResultOptional(CommonPanacheQueryImpl.java:371)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.firstResultOptional(PanacheQueryImpl.java:166)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl.buscarSaldoAnalitico(SaldoRepositoryImpl.java:28)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl_ClientProxy.buscarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService.consultarSaldoAnalitico(SaldoAnaliticoService.java:23)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService_ClientProxy.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase.executar(ConsultarSaldoAnaliticoUseCase.java:53)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase_ClientProxy.executar(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource.consultarSaldoAnalitico(SaldoResource.java:130)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico$$superforward(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass$0.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:73)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor.validateMethodInvocation(ResteasyReactiveEndPointValidationInterceptor.java:21)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource$quarkusrestinvoker$consultarSaldoAnalitico_2ea96fc526fd6526e0756818ce9849ae5fc6cf67.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:677)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.sql.SQLSyntaxErrorException: ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:615)
	at oracle.jdbc.driver.T4C8Oall.processError(T4C8Oall.java:1372)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:975)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237)
	at oracle.jdbc.driver.T4C8Oall.doOALL(T4C8Oall.java:524)
	at oracle.jdbc.driver.T4CPreparedStatement.doOall8(T4CPreparedStatement.java:298)
	at oracle.jdbc.driver.T4CPreparedStatement.executeForDescribe(T4CPreparedStatement.java:1257)
	at oracle.jdbc.driver.OracleStatement.prepareDefineBufferAndExecute(OracleStatement.java:1424)
	at oracle.jdbc.driver.OracleStatement.executeMaybeDescribe(OracleStatement.java:1298)
	at oracle.jdbc.driver.OracleStatement.executeSQLSelect(OracleStatement.java:1855)
	at oracle.jdbc.driver.OracleStatement.doExecuteWithTimeout(OracleStatement.java:1631)
	at oracle.jdbc.driver.OraclePreparedStatement.executeInternal(OraclePreparedStatement.java:3973)
	at oracle.jdbc.driver.OraclePreparedStatement.executeQuery(OraclePreparedStatement.java:4160)
	at oracle.jdbc.driver.OraclePreparedStatementWrapper.executeQuery(OraclePreparedStatementWrapper.java:1120)
	at io.agroal.pool.wrapper.PreparedStatementWrapper.executeQuery(PreparedStatementWrapper.java:80)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:271)
	... 48 more
Caused by: Error : 904, Position : 629, SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=:1 and se1_0.NU_OFERTA_CAIXINHA=:2 fetch first :3 rows only, Original SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only, Error Message = ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:723)
	... 64 more

2026-07-16 10:48:03 [] WARN  or.hi.or.jd.error - HHH000247: ErrorCode: 904, SQLState: 42000
2026-07-16 10:48:03 [] WARN  or.hi.or.jd.error - ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
2026-07-16 10:48:03 [] ERROR io.qu.ve.ht.ru.QuarkusErrorHandler - HTTP Request to /v1/saldos/saldo-analitico?tipoPessoa=1&cpfCnpj=111111111&codigoOferta=1001&codigoCaixinha=2001 failed, error id: e033cb74-333a-47f8-9186-2f99585fce08-2: org.hibernate.exception.SQLGrammarException: JDBC exception executing SQL [ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/] [select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only]
	at org.hibernate.exception.internal.SQLExceptionTypeDelegate.convert(SQLExceptionTypeDelegate.java:64)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:34)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:115)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:290)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:190)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.<init>(JdbcValuesResultSetImpl.java:71)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValues(JdbcSelectExecutorStandardImpl.java:422)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:349)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:143)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:100)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.executeQuery(JdbcSelectExecutor.java:63)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:137)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$1(ConcreteSqmSelectQueryPlan.java:134)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:464)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:392)
	at org.hibernate.query.sqm.internal.SqmSelectionQueryImpl.doList(SqmSelectionQueryImpl.java:410)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:153)
	at org.hibernate.query.SelectionQuery.getResultList(SelectionQuery.java:145)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResult(CommonPanacheQueryImpl.java:365)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResultOptional(CommonPanacheQueryImpl.java:371)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.firstResultOptional(PanacheQueryImpl.java:166)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl.buscarSaldoAnalitico(SaldoRepositoryImpl.java:28)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl_ClientProxy.buscarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService.consultarSaldoAnalitico(SaldoAnaliticoService.java:23)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService_ClientProxy.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase.executar(ConsultarSaldoAnaliticoUseCase.java:53)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase_ClientProxy.executar(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource.consultarSaldoAnalitico(SaldoResource.java:130)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico$$superforward(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass$0.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:73)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor.validateMethodInvocation(ResteasyReactiveEndPointValidationInterceptor.java:21)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource$quarkusrestinvoker$consultarSaldoAnalitico_2ea96fc526fd6526e0756818ce9849ae5fc6cf67.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:677)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.sql.SQLSyntaxErrorException: ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:615)
	at oracle.jdbc.driver.T4C8Oall.processError(T4C8Oall.java:1372)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:975)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237)
	at oracle.jdbc.driver.T4C8Oall.doOALL(T4C8Oall.java:524)
	at oracle.jdbc.driver.T4CPreparedStatement.doOall8(T4CPreparedStatement.java:298)
	at oracle.jdbc.driver.T4CPreparedStatement.executeForDescribe(T4CPreparedStatement.java:1257)
	at oracle.jdbc.driver.OracleStatement.prepareDefineBufferAndExecute(OracleStatement.java:1424)
	at oracle.jdbc.driver.OracleStatement.executeMaybeDescribe(OracleStatement.java:1298)
	at oracle.jdbc.driver.OracleStatement.executeSQLSelect(OracleStatement.java:1855)
	at oracle.jdbc.driver.OracleStatement.doExecuteWithTimeout(OracleStatement.java:1631)
	at oracle.jdbc.driver.OraclePreparedStatement.executeInternal(OraclePreparedStatement.java:3973)
	at oracle.jdbc.driver.OraclePreparedStatement.executeQuery(OraclePreparedStatement.java:4160)
	at oracle.jdbc.driver.OraclePreparedStatementWrapper.executeQuery(OraclePreparedStatementWrapper.java:1120)
	at io.agroal.pool.wrapper.PreparedStatementWrapper.executeQuery(PreparedStatementWrapper.java:80)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:271)
	... 48 more
Caused by: Error : 904, Position : 629, SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=:1 and se1_0.NU_OFERTA_CAIXINHA=:2 fetch first :3 rows only, Original SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only, Error Message = ORA-00904: "SE1_0"."VR_SLDO_DISPONIVEL_RENDA_FIXA": invalid identifier

	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:723)
	... 64 more

2026-07-17 09:54:29 [] WARN  or.hi.or.jd.error - HHH000247: ErrorCode: 904, SQLState: 42000
2026-07-17 09:54:29 [] WARN  or.hi.or.jd.error - ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
2026-07-17 09:54:29 [] ERROR io.qu.ve.ht.ru.QuarkusErrorHandler - HTTP Request to /v1/saldos/saldo-analitico?tipoPessoa=1&cpfCnpj=1111111111&codigoCaixinha=1001&codigoOferta=2001 failed, error id: e033cb74-333a-47f8-9186-2f99585fce08-3: org.hibernate.exception.SQLGrammarException: JDBC exception executing SQL [ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/] [select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only]
	at org.hibernate.exception.internal.SQLExceptionTypeDelegate.convert(SQLExceptionTypeDelegate.java:64)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:34)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:115)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:290)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:190)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.<init>(JdbcValuesResultSetImpl.java:71)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValues(JdbcSelectExecutorStandardImpl.java:422)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:349)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:143)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:100)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.executeQuery(JdbcSelectExecutor.java:63)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:137)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$1(ConcreteSqmSelectQueryPlan.java:134)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:464)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:392)
	at org.hibernate.query.sqm.internal.SqmSelectionQueryImpl.doList(SqmSelectionQueryImpl.java:410)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:153)
	at org.hibernate.query.SelectionQuery.getResultList(SelectionQuery.java:145)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResult(CommonPanacheQueryImpl.java:365)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResultOptional(CommonPanacheQueryImpl.java:371)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.firstResultOptional(PanacheQueryImpl.java:166)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl.buscarSaldoAnalitico(SaldoRepositoryImpl.java:28)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl_ClientProxy.buscarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService.consultarSaldoAnalitico(SaldoAnaliticoService.java:23)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService_ClientProxy.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase.executar(ConsultarSaldoAnaliticoUseCase.java:53)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase_ClientProxy.executar(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource.consultarSaldoAnalitico(SaldoResource.java:130)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico$$superforward(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass$0.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:73)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor.validateMethodInvocation(ResteasyReactiveEndPointValidationInterceptor.java:21)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource$quarkusrestinvoker$consultarSaldoAnalitico_2ea96fc526fd6526e0756818ce9849ae5fc6cf67.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:677)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.sql.SQLSyntaxErrorException: ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:615)
	at oracle.jdbc.driver.T4C8Oall.processError(T4C8Oall.java:1372)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:975)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237)
	at oracle.jdbc.driver.T4C8Oall.doOALL(T4C8Oall.java:524)
	at oracle.jdbc.driver.T4CPreparedStatement.doOall8(T4CPreparedStatement.java:298)
	at oracle.jdbc.driver.T4CPreparedStatement.executeForDescribe(T4CPreparedStatement.java:1257)
	at oracle.jdbc.driver.OracleStatement.prepareDefineBufferAndExecute(OracleStatement.java:1424)
	at oracle.jdbc.driver.OracleStatement.executeMaybeDescribe(OracleStatement.java:1298)
	at oracle.jdbc.driver.OracleStatement.executeSQLSelect(OracleStatement.java:1855)
	at oracle.jdbc.driver.OracleStatement.doExecuteWithTimeout(OracleStatement.java:1631)
	at oracle.jdbc.driver.OraclePreparedStatement.executeInternal(OraclePreparedStatement.java:3973)
	at oracle.jdbc.driver.OraclePreparedStatement.executeQuery(OraclePreparedStatement.java:4160)
	at oracle.jdbc.driver.OraclePreparedStatementWrapper.executeQuery(OraclePreparedStatementWrapper.java:1120)
	at io.agroal.pool.wrapper.PreparedStatementWrapper.executeQuery(PreparedStatementWrapper.java:80)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:271)
	... 48 more
Caused by: Error : 904, Position : 737, SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=:1 and se1_0.NU_OFERTA_CAIXINHA=:2 fetch first :3 rows only, Original SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only, Error Message = ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:723)
	... 64 more

2026-07-17 09:54:38 [] WARN  or.hi.or.jd.error - HHH000247: ErrorCode: 904, SQLState: 42000
2026-07-17 09:54:38 [] WARN  or.hi.or.jd.error - ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
2026-07-17 09:54:38 [] ERROR io.qu.ve.ht.ru.QuarkusErrorHandler - HTTP Request to /v1/saldos/saldo-analitico?tipoPessoa=1&cpfCnpj=1111111111&codigoCaixinha=100&codigoOferta=2001 failed, error id: e033cb74-333a-47f8-9186-2f99585fce08-4: org.hibernate.exception.SQLGrammarException: JDBC exception executing SQL [ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/] [select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only]
	at org.hibernate.exception.internal.SQLExceptionTypeDelegate.convert(SQLExceptionTypeDelegate.java:64)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:34)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:115)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:290)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:190)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.<init>(JdbcValuesResultSetImpl.java:71)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValues(JdbcSelectExecutorStandardImpl.java:422)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:349)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:143)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:100)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.executeQuery(JdbcSelectExecutor.java:63)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:137)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$1(ConcreteSqmSelectQueryPlan.java:134)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:464)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:392)
	at org.hibernate.query.sqm.internal.SqmSelectionQueryImpl.doList(SqmSelectionQueryImpl.java:410)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:153)
	at org.hibernate.query.SelectionQuery.getResultList(SelectionQuery.java:145)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResult(CommonPanacheQueryImpl.java:365)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.firstResultOptional(CommonPanacheQueryImpl.java:371)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.firstResultOptional(PanacheQueryImpl.java:166)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl.buscarSaldoAnalitico(SaldoRepositoryImpl.java:28)
	at br.gov.caixa.siifx.caixinhas.infra.repository.saldo.SaldoRepositoryImpl_ClientProxy.buscarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService.consultarSaldoAnalitico(SaldoAnaliticoService.java:23)
	at br.gov.caixa.siifx.caixinhas.domain.service.saldo.SaldoAnaliticoService_ClientProxy.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase.executar(ConsultarSaldoAnaliticoUseCase.java:53)
	at br.gov.caixa.siifx.caixinhas.application.saldo.analitico.ConsultarSaldoAnaliticoUseCase_ClientProxy.executar(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource.consultarSaldoAnalitico(SaldoResource.java:130)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico$$superforward(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass$0.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:73)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor.validateMethodInvocation(ResteasyReactiveEndPointValidationInterceptor.java:21)
	at io.quarkus.hibernate.validator.runtime.jaxrs.ResteasyReactiveEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource_Subclass.consultarSaldoAnalitico(Unknown Source)
	at br.gov.caixa.siifx.caixinhas.presentation.rest.v1.saldo.SaldoResource$quarkusrestinvoker$consultarSaldoAnalitico_2ea96fc526fd6526e0756818ce9849ae5fc6cf67.invoke(Unknown Source)
	at org.jboss.resteasy.reactive.server.handlers.InvocationHandler.handle(InvocationHandler.java:29)
	at io.quarkus.resteasy.reactive.server.runtime.QuarkusResteasyReactiveRequestContext.invokeHandler(QuarkusResteasyReactiveRequestContext.java:190)
	at org.jboss.resteasy.reactive.common.core.AbstractResteasyReactiveContext.run(AbstractResteasyReactiveContext.java:147)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$15.runWith(VertxCoreRecorder.java:677)
	at org.jboss.threads.EnhancedQueueExecutor$Task.doRunWith(EnhancedQueueExecutor.java:2651)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2630)
	at org.jboss.threads.EnhancedQueueExecutor.runThreadBody(EnhancedQueueExecutor.java:1622)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1589)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:11)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:11)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.sql.SQLSyntaxErrorException: ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

https://docs.oracle.com/error-help/db/ora-00904/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:715)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:615)
	at oracle.jdbc.driver.T4C8Oall.processError(T4C8Oall.java:1372)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:975)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:237)
	at oracle.jdbc.driver.T4C8Oall.doOALL(T4C8Oall.java:524)
	at oracle.jdbc.driver.T4CPreparedStatement.doOall8(T4CPreparedStatement.java:298)
	at oracle.jdbc.driver.T4CPreparedStatement.executeForDescribe(T4CPreparedStatement.java:1257)
	at oracle.jdbc.driver.OracleStatement.prepareDefineBufferAndExecute(OracleStatement.java:1424)
	at oracle.jdbc.driver.OracleStatement.executeMaybeDescribe(OracleStatement.java:1298)
	at oracle.jdbc.driver.OracleStatement.executeSQLSelect(OracleStatement.java:1855)
	at oracle.jdbc.driver.OracleStatement.doExecuteWithTimeout(OracleStatement.java:1631)
	at oracle.jdbc.driver.OraclePreparedStatement.executeInternal(OraclePreparedStatement.java:3973)
	at oracle.jdbc.driver.OraclePreparedStatement.executeQuery(OraclePreparedStatement.java:4160)
	at oracle.jdbc.driver.OraclePreparedStatementWrapper.executeQuery(OraclePreparedStatementWrapper.java:1120)
	at io.agroal.pool.wrapper.PreparedStatementWrapper.executeQuery(PreparedStatementWrapper.java:80)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:271)
	... 48 more
Caused by: Error : 904, Position : 737, SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=:1 and se1_0.NU_OFERTA_CAIXINHA=:2 fetch first :3 rows only, Original SQL = select se1_0.NU_SALDO_CONSOLIDADO_CAIXINHA,se1_0.DT_MOVIMENTO_CAIXINHA,se1_0.IC_PERMITE_MOVIMENTAR,se1_0.NU_CAIXINHA,se1_0.NU_MODALIDADE_PRDTO_RENDA_FIXA,se1_0.NU_NOTA_CAIXINHA,se1_0.NU_NOTA_OPERACAO,se1_0.NU_OFERTA_CAIXINHA,se1_0.NU_ORIGEM_SALDO,se1_0.TS_OPERACAO_CAIXINHA,se1_0.VR_BLOQUEADO_DIA,se1_0.VR_CREDITO_CAIXINHA,se1_0.VR_DEBITO_CAIXINHA,se1_0.VR_RENDIMENTO_PERIODO,se1_0.VR_SALDO_BLOQUEADO_LIQUIDO,se1_0.VR_SALDO_BRUTO_DIA,se1_0.VR_SALDO_IOF_DIA,se1_0.VR_SALDO_IR_DIA,se1_0.VR_SALDO_LIQUIDO_CAIXINHA,se1_0.VR_SALDO_LIQUIDO_DIA,se1_0.VR_SALDO_POSICAO_DIA,se1_0.VR_SALDO_RENDIMENTO_DIA,se1_0.VR_SLDO_CARENCIA_LEGAL_NGCL,se1_0.VR_SLDO_DISPONIVEL_RENDA_FIXA from IFX.IFXTBC13_SLDO_CSLDO_CXNHA se1_0 where se1_0.NU_CAIXINHA=? and se1_0.NU_OFERTA_CAIXINHA=? fetch first ? rows only, Error Message = ORA-00904: "SE1_0"."NU_OFERTA_CAIXINHA": invalid identifier

	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:723)
	... 64 more

