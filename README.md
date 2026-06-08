deu certo embora eles esteja agora relcamdo de certificad,

como que faz agora para ordar uma nova releiase e ele ficar nessa mesma tela: so roda ja vai fuincinar.

Ou precisa de algura alteração aqui:


no application.yaml.


quarkus:
  http:
    cors:
      origins: ${QUARKUS_HTTP_CORS_ORIGINS}
      enabled: false
    limits:
      max-body-size: 1024M
    port: 8080
  oidc:
    devservices:
      enabled: false
    enabled: true
    discovery-enabled: true
    client-id: ${QUARKUS_OIDC_CLIENT_ID}
    auth-server-url: ${QUARKUS_OIDC_AUTH_SERVER_URL}
    tls:
      verification: none
    roles:
      role-claim-path: realm_access/roles
      source: accesstoken
    application-type: service


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-06-08 11:20:05,117 WARN  [io.qua.oid.com.run.OidcCommonUtils] (vert.x-eventloop-thread-1) OIDC Server is not available:: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
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
	at io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:530)
	at io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:469)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:290)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
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

2026-06-08 11:20:05,124 WARN  [io.qua.oid.run.OidcRecorder] (vert.x-eventloop-thread-1) OIDC server is not available at the 'https://login.des.caixa/auth/realms/intranet' URL. Please make sure it is correct. Note it has to end with a realm value if you work with Keycloak, for example: 'https://localhost:8180/auth/realms/quarkus'
2026-06-08 11:20:05,127 WARN  [io.qua.oid.run.OidcRecorder] (vert.x-eventloop-thread-1) Tenant 'Default': 'OIDC Server is not available'. OIDC server is not available yet, an attempt to connect will be made during the first request. Access to resources protected by this tenant may fail if OIDC server will not become available
2026-06-08 11:20:05,166 INFO  [io.quarkus] (main) SICBC-backend 00.00.01.06 on JVM (powered by Quarkus 3.20.2) started in 1.177s. Listening on: http://0.0.0.0:8080
2026-06-08 11:20:05,166 INFO  [io.quarkus] (main) Profile prod activated. 
2026-06-08 11:20:05,166 INFO  [io.quarkus] (main) Installed features: [cdi, config-yaml, oidc, rest, rest-client, rest-jackson, security, smallrye-context-propagation, smallrye-jwt, vertx]
