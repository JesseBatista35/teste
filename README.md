Favor verificar falha ao  gerar a Release do SICIM-backend-intranet 

Analise: release do backend falhou, me parece ser o certificado, pois no log ele tenta comunicar com o SSO mas não consegue, se puder solicitar essa config, certificado do SSO de intranet
 
Pedimos que verifiquem
https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=483284&_a=release-pipeline-progress


2026-06-10T12:45:13.1435474Z ##[section]Starting: Verificando Status do Deployment
2026-06-10T12:45:13.1439079Z ==============================================================================
2026-06-10T12:45:13.1439202Z Task         : Bash
2026-06-10T12:45:13.1439245Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-10T12:45:13.1439308Z Version      : 3.227.0
2026-06-10T12:45:13.1439392Z Author       : Microsoft Corporation
2026-06-10T12:45:13.1439446Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-10T12:45:13.1439517Z ==============================================================================
2026-06-10T12:45:13.2862280Z Generating script.
2026-06-10T12:45:13.2875362Z ========================== Starting Command Output ===========================
2026-06-10T12:45:13.2882331Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/590e3d3d-ba32-49dc-99e5-378f861a33ad.sh
2026-06-10T12:45:13.3744848Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-10T12:45:14.3183808Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-06-10T12:45:14.3736213Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-06-10T12:51:20.6546416Z ##[error]The task has timed out.
2026-06-10T12:51:20.6547554Z ##[section]Finishing: Verificando Status do Deployment


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-06-10 17:14:47,288 WARN  [io.quarkus.oidc.common.runtime.OidcCommonUtils] (vert.x-eventloop-thread-1) OIDC Server is not available:: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:378)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:316)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:476)
	at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1273)
	at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1260)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:714)
	at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask.run(SSLEngineImpl.java:1205)
	at io.netty.handler.ssl.SslHandler.runDelegatedTasks(SslHandler.java:1695)
	at io.netty.handler.ssl.SslHandler.unwrap(SslHandler.java:1541)
	at io.netty.handler.ssl.SslHandler.decodeJdkCompatible(SslHandler.java:1377)
	at io.netty.handler.ssl.SslHandler.decode(SslHandler.java:1428)
	at io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:545)
	at io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:484)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:296)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:171)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
	at java.base/sun.security.validator.Validator.validate(Validator.java:256)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:284)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:144)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:625)
	... 31 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
	... 36 more

2026-06-10 17:14:48,624 WARN  [io.quarkus.oidc.common.runtime.OidcCommonUtils] (vert.x-eventloop-thread-1) OIDC Server is not available:: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:130)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:378)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
	at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:316)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:647)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:467)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:363)
	at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:393)
	at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:476)
	at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1273)
	at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1260)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:714)
	at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask.run(SSLEngineImpl.java:1205)
	at io.netty.handler.ssl.SslHandler.runDelegatedTasks(SslHandler.java:1695)
	at io.netty.handler.ssl.SslHandler.unwrap(SslHandler.java:1541)
	at io.netty.handler.ssl.SslHandler.decodeJdkCompatible(SslHandler.java:1377)
	at io.netty.handler.ssl.SslHandler.decode(SslHandler.java:1428)
	at io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:545)
	at io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:484)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:296)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:171)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:388)
	at java.base/sun.security.validator.PKIXValidator.engineValidate(PKIXValidator.java:271)
	at java.base/sun.security.validator.Validator.validate(Validator.java:256)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkTrusted(X509TrustManagerImpl.java:284)
	at java.base/sun.security.ssl.X509TrustManagerImpl.checkServerTrusted(X509TrustManagerImpl.java:144)
	at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:625)
	... 31 more
Caused by: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.build(SunCertPathBuilder.java:148)
	at java.base/sun.security.provider.certpath.SunCertPathBuilder.engineBuild(SunCertPathBuilder.java:129)
	at java.base/java.security.cert.CertPathBuilder.build(CertPathBuilder.java:297)
	at java.base/sun.security.validator.PKIXValidator.doBuild(PKIXValidator.java:383)
	... 36 more

2026-06-10 17:14:48,627 WARN  [io.quarkus.oidc.runtime.TenantContextFactory] (vert.x-eventloop-thread-1) OIDC server is not available at the 'https://login.des.caixa/auth/realms/intranet' URL. Please make sure it is correct. Note it has to end with a realm value if you work with Keycloak, for example: 'https://localhost:8180/auth/realms/quarkus'
2026-06-10 17:14:48,629 WARN  [io.quarkus.oidc.runtime.TenantContextFactory$2] (vert.x-eventloop-thread-1) Tenant 'Default': 'OIDC Server is not available'. OIDC server is not available yet, an attempt to connect will be made during the first request. Access to resources protected by this tenant may fail if OIDC server will not become available
2026-06-10 17:14:48,696 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main) 
2026-06-10 17:14:48,696 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)    _    _                     _   ____ ___    ******
2026-06-10 17:14:48,696 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   | \  / |_  __ _ __ ___     / \  |  _ \_ _|   ******
2026-06-10 17:14:48,696 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |  \/  | |/ _\ '__/ _ \   / _ \ | |_) | |     ******
2026-06-10 17:14:48,696 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |  __  | | |_  | | (_) | / ___ \|  __/| |     ******
2026-06-10 17:14:48,697 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)   |_|  |_|_|\__/_|  \___/ /_/   \_\_|  |___|   ******
2026-06-10 17:14:48,697 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)  ============================================ ******
2026-06-10 17:14:48,697 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main)    :: CEF-SICIM-INTRANET - v1.0.0.1 [prod] ::
2026-06-10 17:14:48,697 INFO  [br.gov.caixa.arquitetura.config.AppConfig] (main) 
2026-06-10 17:14:48,727 INFO  [io.quarkus.bootstrap.runner.Timing] (main) SICIM-INTRANET 1.0.0.1 on JVM (powered by Quarkus 3.33.1.1) started in 5.003s. Listening on: http://0.0.0.0:8080
2026-06-10 17:14:48,728 INFO  [io.quarkus.bootstrap.runner.Timing] (main) Profile prod activated. 
2026-06-10 17:14:48,728 INFO  [io.quarkus.bootstrap.runner.Timing] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-oracle, mapstruct, narayana-jta, oidc, oidc-client, rest, rest-client, rest-client-jackson, rest-client-oidc-filter, rest-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, vertx]
