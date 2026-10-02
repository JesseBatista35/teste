<img width="992" height="577" alt="image" src="https://github.com/user-attachments/assets/dc126b65-47b6-45b8-80c1-3a55ffee8141" />

ele nao colocu o modlu mais deve ser o front

Ao acessar o ambiente de TQS do SIRSA, foi identificado o seguinte erro de certificado:

javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

Solicitamos, por gentileza, a verificação e a correção da ocorrência.

Encaminhamos, em anexo, mais detalhes sobre o erro identificado.


EXECUTANDO... ROTINA XML BACEN
 
  .   ____          _            __ _ _

/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \

( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \

\\/  ___)| |_)| | | | | || (_| |  ) ) ) )

  '  |____| .__|_| |_|_| |_\__, | / / / /

=========|_|==============|___/=/_/_/_/
 
:: Spring Boot ::               (v3.4.13)
 
2026-10-02T09:13:02.391-03:00  INFO 8115 --- [           main] b.g.c.s.s.SpringBatchApplication         : Starting SpringBatchApplication v01.18.01.22 using Java 21.0.11 with PID 8115 (/opt/batch/deploy/sirsa-batch.jar started by f517263 in /producao/rotina/RSADB001/shell)

2026-10-02T09:13:02.394-03:00  INFO 8115 --- [           main] b.g.c.s.s.SpringBatchApplication         : No active profile set, falling back to 1 default profile: "default"

2026-10-02T09:13:03.113-03:00  INFO 8115 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.

2026-10-02T09:13:03.280-03:00  INFO 8115 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 157 ms. Found 34 JPA repository interfaces.

2026-10-02T09:13:03.945-03:00  INFO 8115 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...

2026-10-02T09:13:04.639-03:00  INFO 8115 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection oracle.jdbc.driver.T4CConnection@2ee48610

2026-10-02T09:13:04.641-03:00  INFO 8115 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.

2026-10-02T09:13:04.727-03:00  INFO 8115 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]

2026-10-02T09:13:04.772-03:00  INFO 8115 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.39.Final

2026-10-02T09:13:04.814-03:00  INFO 8115 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled

2026-10-02T09:13:05.072-03:00  INFO 8115 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer

2026-10-02T09:13:07.133-03:00  INFO 8115 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)

2026-10-02T09:13:07.136-03:00  INFO 8115 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'

2026-10-02T09:13:07.384-03:00  INFO 8115 --- [           main] o.s.d.j.r.query.QueryEnhancerFactory     : Hibernate is in classpath; If applicable, HQL parser will be used.

2026-10-02T09:13:08.287-03:00  INFO 8115 --- [           main] b.g.c.s.s.config.SpringBatchConfig       : [step - Processando o arquivo] chunk-size configurado em 1000

2026-10-02T09:13:08.317-03:00  INFO 8115 --- [           main] b.g.c.s.s.config.SpringBatchConfig       : Iniciando job job...

2026-10-02T09:13:08.317-03:00  INFO 8115 --- [           main] b.g.c.s.s.config.SpringBatchConfig       : Em execução Release - 01.18.00.22

2026-10-02T09:13:08.318-03:00  INFO 8115 --- [           main] b.g.c.s.s.config.SpringBatchConfig       : Numero step = 0

2026-10-02T09:13:08.526-03:00  INFO 8115 --- [           main] b.g.c.s.s.SpringBatchApplication         : Started SpringBatchApplication in 6.737 seconds (process running for 7.298)

2026-10-02T09:13:08.529-03:00  INFO 8115 --- [           main] o.s.b.a.b.JobLauncherApplicationRunner   : Running default command line with: []

2026-10-02T09:13:08.976-03:00  INFO 8115 --- [           main] o.s.b.c.l.s.TaskExecutorJobLauncher      : Job: [SimpleJob: [name=job]] launched with the following parameters: [{'run.id':'{value=37, type=class java.lang.Long, identifying=true}','run.ts':'{value=1788441156284, type=class java.lang.Long, identifying=true}'}]

2026-10-02T09:13:09.088-03:00  INFO 8115 --- [           main] o.s.batch.core.job.SimpleStepHandler     : Executing step: [step - Iniciando Validação Ambientes Externos]

2026-10-02T09:13:09.132-03:00  INFO 8115 --- [           main] b.g.c.s.s.config.SpringBatchConfig       : [step - Iniciando Validação Ambientes Externos] INICIO

2026-10-02T09:13:09.133-03:00  INFO 8115 --- [           main] b.g.c.s.s.service.ServicoCaixa           : Validando servicos externos...

2026-10-02T09:13:09.133-03:00  INFO 8115 --- [           main] b.g.c.s.s.service.ServicoCaixa           : [SICLI][startup] Config efetiva: endpoint=https://api.des.caixa:8443/cadastro/v2/clientes cliente=***0104 maxTentativas=3 apiKey=presente(len=34)

2026-10-02T09:13:09.133-03:00  INFO 8115 --- [           main] b.g.c.s.s.service.TokenSSOService        : Validando certificado/conectividade SSO. url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token

2026-10-02T09:13:09.145-03:00  WARN 8115 --- [           main] b.g.c.s.s.service.TokenSSOService        : Truststore SSO sem permissão de leitura (pulando): /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks

2026-10-02T09:13:09.145-03:00 ERROR 8115 --- [           main] b.g.c.s.s.service.TokenSSOService        : Nenhum truststore SSO carregável entre [/opt/batch/securefiles/caixa-truststore-acteste-nprd.jks]. Último erro: truststore não carregável: /opt/batch/securefiles/caixa-truststore-acteste-nprd.jks

2026-10-02T09:13:09.145-03:00  INFO 8115 --- [           main] b.g.c.s.s.service.TokenSSOService        : SSO HttpClient usando SSLContext default da JVM (javax.net.ssl.*). ssoUrl=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token

2026-10-02T09:13:09.406-03:00 ERROR 8115 --- [           main] b.g.c.s.s.service.TokenSSOService        : Erro de certificado SSL no SSO url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
 
javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:960) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133) ~[java.net.http:na]

        at br.gov.caixa.sirsa.springbatch.service.TokenSSOService.validaCertificado(TokenSSOService.java:352) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.service.ServicoCaixa.validaToken(ServicoCaixa.java:3679) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.service.ServicoCaixa.validarServicosExterno(ServicoCaixa.java:3516) ~[!/:01.18.01.22]

        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]

        at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]

        at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:360) ~[spring-aop-6.2.15.jar!/:6.2.15]

        at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:724) ~[spring-aop-6.2.15.jar!/:6.2.15]

        at br.gov.caixa.sirsa.springbatch.service.ServicoCaixa$$SpringCGLIB$$1.validarServicosExterno(<generated>) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.config.SpringBatchConfig.lambda$stepValidaAcessoExterno$0(SpringBatchConfig.java:375) ~[!/:01.18.01.22]

        at org.springframework.batch.core.step.tasklet.TaskletStep$ChunkTransactionCallback.doInTransaction(TaskletStep.java:383) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.step.tasklet.TaskletStep$ChunkTransactionCallback.doInTransaction(TaskletStep.java:307) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.transaction.support.TransactionTemplate.execute(TransactionTemplate.java:140) ~[spring-tx-6.2.15.jar!/:6.2.15]

        at org.springframework.batch.core.step.tasklet.TaskletStep$2.doInChunkContext(TaskletStep.java:250) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.scope.context.StepContextRepeatCallback.doInIteration(StepContextRepeatCallback.java:82) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.repeat.support.RepeatTemplate.getNextResult(RepeatTemplate.java:369) ~[spring-batch-infrastructure-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.repeat.support.RepeatTemplate.executeInternal(RepeatTemplate.java:206) ~[spring-batch-infrastructure-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.repeat.support.RepeatTemplate.iterate(RepeatTemplate.java:140) ~[spring-batch-infrastructure-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.step.tasklet.TaskletStep.doExecute(TaskletStep.java:235) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.step.AbstractStep.execute(AbstractStep.java:230) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.SimpleStepHandler.handleStep(SimpleStepHandler.java:153) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.AbstractJob.handleStep(AbstractJob.java:408) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.SimpleJob.doExecute(SimpleJob.java:127) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.AbstractJob.execute(AbstractJob.java:307) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.launch.support.TaskExecutorJobLauncher$1.run(TaskExecutorJobLauncher.java:155) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.core.task.SyncTaskExecutor.execute(SyncTaskExecutor.java:48) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.batch.core.launch.support.TaskExecutorJobLauncher.run(TaskExecutorJobLauncher.java:146) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.execute(JobLauncherApplicationRunner.java:210) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.executeLocalJobs(JobLauncherApplicationRunner.java:194) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.launchJobFromProperties(JobLauncherApplicationRunner.java:174) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:169) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:164) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.lambda$callRunner$4(SpringApplication.java:784) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:796) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:784) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:772) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184) ~[na:na]

        at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357) ~[na:na]

        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510) ~[na:na]

        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]

        at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151) ~[na:na]

        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174) ~[na:na]

        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]

        at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596) ~[na:na]

        at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:772) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.run(SpringApplication.java:325) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at br.gov.caixa.sirsa.springbatch.SpringBatchApplication.runAndGetExitCode(SpringBatchApplication.java:28) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.SpringBatchApplication.runAndGetExitCode(SpringBatchApplication.java:21) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.SpringBatchApplication.main(SpringBatchApplication.java:17) ~[!/:01.18.01.22]

        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]

        at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]

        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[sirsa-batch.jar:01.18.01.22]

        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[sirsa-batch.jar:01.18.01.22]

        at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[sirsa-batch.jar:01.18.01.22]

Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130) ~[na:na]

        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383) ~[na:na]

        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326) ~[na:na]

        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363) ~[na:na]

        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393) ~[na:na]

        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477) ~[na:na]

        at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1274) ~[na:na]

        at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1261) ~[na:na]

        at java.base/java.security.AccessController.doPrivileged(AccessController.java:714) ~[na:na]

        at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask.run(SSLEngineImpl.java:1206) ~[na:na]

        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596) ~[na:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate.lambda$executeTasks$3(SSLFlowDelegate.java:1156) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate.executeTasks(SSLFlowDelegate.java:1151) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate.doHandshake(SSLFlowDelegate.java:1117) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate$Reader.processData(SSLFlowDelegate.java:513) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate$Reader$ReaderDownstreamPusher.run(SSLFlowDelegate.java:283) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$TryEndDeferredCompleter.complete(SequentialScheduler.java:324) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:151) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207) ~[java.net.http:na]

        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144) ~[na:na]

        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642) ~[na:na]

        at java.base/java.lang.Thread.run(Thread.java:1583) ~[na:na]

Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388) ~[na:na]

        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271) ~[na:na]

        at java.base/sun.security.validator.Validator.validate(Validator.java:256) ~[na:na]

        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:284) ~[na:na]

        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:144) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:625) ~[na:na]

        ... 23 common frames omitted

Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148) ~[na:na]

        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129) ~[na:na]

        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297) ~[na:na]

        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383) ~[na:na]

        ... 28 common frames omitted
 
2026-10-02T09:13:09.424-03:00 ERROR 8115 --- [           main] o.s.batch.core.step.AbstractStep         : Encountered an error executing step step - Iniciando Validação Ambientes Externos in job job
 
java.security.cert.CertificateException: O certificado SSL do SSO não pôde ser validado. url=https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token | confira ssl.truststore.path ou -Djavax.net.ssl.trustStore (+ type PKCS12).

        at br.gov.caixa.sirsa.springbatch.service.TokenSSOService.validaCertificado(TokenSSOService.java:355) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.service.ServicoCaixa.validaToken(ServicoCaixa.java:3679) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.service.ServicoCaixa.validarServicosExterno(ServicoCaixa.java:3516) ~[!/:01.18.01.22]

        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]

        at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]

        at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:360) ~[spring-aop-6.2.15.jar!/:6.2.15]

        at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:724) ~[spring-aop-6.2.15.jar!/:6.2.15]

        at br.gov.caixa.sirsa.springbatch.service.ServicoCaixa$$SpringCGLIB$$1.validarServicosExterno(<generated>) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.config.SpringBatchConfig.lambda$stepValidaAcessoExterno$0(SpringBatchConfig.java:375) ~[!/:01.18.01.22]

        at org.springframework.batch.core.step.tasklet.TaskletStep$ChunkTransactionCallback.doInTransaction(TaskletStep.java:383) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.step.tasklet.TaskletStep$ChunkTransactionCallback.doInTransaction(TaskletStep.java:307) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.transaction.support.TransactionTemplate.execute(TransactionTemplate.java:140) ~[spring-tx-6.2.15.jar!/:6.2.15]

        at org.springframework.batch.core.step.tasklet.TaskletStep$2.doInChunkContext(TaskletStep.java:250) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.scope.context.StepContextRepeatCallback.doInIteration(StepContextRepeatCallback.java:82) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.repeat.support.RepeatTemplate.getNextResult(RepeatTemplate.java:369) ~[spring-batch-infrastructure-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.repeat.support.RepeatTemplate.executeInternal(RepeatTemplate.java:206) ~[spring-batch-infrastructure-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.repeat.support.RepeatTemplate.iterate(RepeatTemplate.java:140) ~[spring-batch-infrastructure-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.step.tasklet.TaskletStep.doExecute(TaskletStep.java:235) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.step.AbstractStep.execute(AbstractStep.java:230) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.SimpleStepHandler.handleStep(SimpleStepHandler.java:153) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.AbstractJob.handleStep(AbstractJob.java:408) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.SimpleJob.doExecute(SimpleJob.java:127) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.job.AbstractJob.execute(AbstractJob.java:307) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.batch.core.launch.support.TaskExecutorJobLauncher$1.run(TaskExecutorJobLauncher.java:155) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.core.task.SyncTaskExecutor.execute(SyncTaskExecutor.java:48) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.batch.core.launch.support.TaskExecutorJobLauncher.run(TaskExecutorJobLauncher.java:146) ~[spring-batch-core-5.2.4.jar!/:5.2.4]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.execute(JobLauncherApplicationRunner.java:210) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.executeLocalJobs(JobLauncherApplicationRunner.java:194) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.launchJobFromProperties(JobLauncherApplicationRunner.java:174) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:169) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.autoconfigure.batch.JobLauncherApplicationRunner.run(JobLauncherApplicationRunner.java:164) ~[spring-boot-autoconfigure-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.lambda$callRunner$4(SpringApplication.java:784) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86) ~[spring-core-6.2.15.jar!/:6.2.15]

        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:796) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:784) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:772) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184) ~[na:na]

        at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357) ~[na:na]

        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510) ~[na:na]

        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]

        at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151) ~[na:na]

        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174) ~[na:na]

        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]

        at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596) ~[na:na]

        at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:772) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at org.springframework.boot.SpringApplication.run(SpringApplication.java:325) ~[spring-boot-3.4.13.jar!/:3.4.13]

        at br.gov.caixa.sirsa.springbatch.SpringBatchApplication.runAndGetExitCode(SpringBatchApplication.java:28) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.SpringBatchApplication.runAndGetExitCode(SpringBatchApplication.java:21) ~[!/:01.18.01.22]

        at br.gov.caixa.sirsa.springbatch.SpringBatchApplication.main(SpringBatchApplication.java:17) ~[!/:01.18.01.22]

        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]

        at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]

        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:102) ~[sirsa-batch.jar:01.18.01.22]

        at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64) ~[sirsa-batch.jar:01.18.01.22]

        at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40) ~[sirsa-batch.jar:01.18.01.22]

Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.net.http/jdk.internal.net.http.HttpClientImpl.send(HttpClientImpl.java:960) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.HttpClientFacade.send(HttpClientFacade.java:133) ~[java.net.http:na]

        at br.gov.caixa.sirsa.springbatch.service.TokenSSOService.validaCertificado(TokenSSOService.java:352) ~[!/:01.18.01.22]

        ... 55 common frames omitted

Caused by: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130) ~[na:na]

        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:383) ~[na:na]

        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:326) ~[na:na]

        at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363) ~[na:na]

        at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393) ~[na:na]

        at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:477) ~[na:na]

        at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1274) ~[na:na]

        at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1261) ~[na:na]

        at java.base/java.security.AccessController.doPrivileged(AccessController.java:714) ~[na:na]

        at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask.run(SSLEngineImpl.java:1206) ~[na:na]

        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596) ~[na:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate.lambda$executeTasks$3(SSLFlowDelegate.java:1156) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.HttpClientImpl$DelegatingExecutor.execute(HttpClientImpl.java:177) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate.executeTasks(SSLFlowDelegate.java:1151) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate.doHandshake(SSLFlowDelegate.java:1117) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate$Reader.processData(SSLFlowDelegate.java:513) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SSLFlowDelegate$Reader$ReaderDownstreamPusher.run(SSLFlowDelegate.java:283) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$LockingRestartableTask.run(SequentialScheduler.java:182) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:149) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$TryEndDeferredCompleter.complete(SequentialScheduler.java:324) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$CompleteRestartableTask.run(SequentialScheduler.java:151) ~[java.net.http:na]

        at java.net.http/jdk.internal.net.http.common.SequentialScheduler$SchedulableTask.run(SequentialScheduler.java:207) ~[java.net.http:na]

        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144) ~[na:na]

        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642) ~[na:na]

        at java.base/java.lang.Thread.run(Thread.java:1583) ~[na:na]

Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388) ~[na:na]

        at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271) ~[na:na]

        at java.base/sun.security.validator.Validator.validate(Validator.java:256) ~[na:na]

        at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:284) ~[na:na]

        at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:144) ~[na:na]

        at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:625) ~[na:na]

        ... 23 common frames omitted

Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

        at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148) ~[na:na]

        at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129) ~[na:na]

        at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297) ~[na:na]

        at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383) ~[na:na]

        ... 28 common frames omitted
 
2026-10-02T09:13:09.452-03:00  INFO 8115 --- [           main] o.s.batch.core.step.AbstractStep         : Step: [step - Iniciando Validação Ambientes Externos] executed in 363ms

2026-10-02T09:13:09.452-03:00  INFO 8115 --- [           main] b.g.c.s.s.listener.StepHeatmapListener   : [PERF][heatmap] stepId=01 stepName="step - Iniciando Validação Ambientes Externos" status=FAILED durationMs=340 read=0 write=0 filter=0 commit=0 rollback=1 readSkip=0 processSkip=0 writeSkip=0

2026-10-02T09:13:09.512-03:00  INFO 8115 --- [           main] b.g.c.s.s.l.JobHeatmapSummaryListener    : [PERF][job-summary] job=job execId=460 status=FAILED totalMs=524 steps=1 read=0 write=0 commit=0 rollback=1 ranking=step - Iniciando Validação Ambientes Externos:363ms(FAILED)

2026-10-02T09:13:09.512-03:00  INFO 8115 --- [           main] b.g.c.s.s.l.JobHeatmapSummaryListener    : [PERF][job-summary-csv][header] schemaVersion;generatedAt;job;execId;status;totalMs;steps;read;write;commit;rollback;ranking

2026-10-02T09:13:09.513-03:00  INFO 8115 --- [           main] b.g.c.s.s.l.JobHeatmapSummaryListener    : [PERF][job-summary-csv][row] v1;"2026-10-02 09:13:09";"job";460;"FAILED";524;1;0;0;0;1;"step - Iniciando Validação Ambientes Externos:363ms(FAILED)"

2026-10-02T09:13:09.541-03:00  INFO 8115 --- [           main] o.s.b.c.l.s.TaskExecutorJobLauncher      : Job: [SimpleJob: [name=job]] completed with the following parameters: [{'run.id':'{value=37, type=class java.lang.Long, identifying=true}','run.ts':'{value=1788441156284, type=class java.lang.Long, identifying=true}'}] and the following status: [FAILED] in 524ms

2026-10-02T09:13:09.547-03:00  INFO 8115 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'

2026-10-02T09:13:09.555-03:00  INFO 8115 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...

2026-10-02T09:13:09.571-03:00  INFO 8115 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

ERRO na execucao do processamento. Deve ser verificado o arquivo de Log.

[f517263@caddeapllx1567 shell]$ ^C

 
