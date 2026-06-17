	Solicitamos que seja verificado as configurações de certificado da Stage TQS da pipeline SISPL-consulta-transacao-OCP4. O mesmo está dando erro no servidor:

2026-06-16 09:25:02,076 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.blocking: false
2026-06-16 09:25:02,076 DEBUG [io.net.uti.Recycler] (vert.x-eventloop-thread-1) -Dio.netty.recycler.batchFastThreadLocalOnly: true
2026-06-16 09:25:02,088 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:78f2d5b2a8e8af0051b15f7e08f8304f, Subject:CN=logintqs.caixa.gov.br, Issuer:CN=Sectigo Public Server Authentication CA DV R36, O=Sectigo Limited, C=GB, Key type:RSA, Length:2048, Cert Id:-2103420402, Valid from:5/17/26, 9:00 PM, Valid until:12/2/26, 8:59 PM
2026-06-16 09:25:02,088 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA256withRSA, Serial:40000000001444ef03631, Subject:CN=AlphaSSL CA - SHA256 - G2, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:548631210, Valid from:2/20/14, 7:00 AM, Valid until:2/20/24, 7:00 AM
2026-06-16 09:25:02,089 DEBUG [jdk.eve.security] (vert.x-eventloop-thread-1) X509Certificate: Alg:SHA1withRSA, Serial:40000000001154b5ac394, Subject:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Issuer:CN=GlobalSign Root CA, OU=Root CA, O=GlobalSign nv-sa, C=BE, Key type:RSA, Length:2048, Cert Id:536948034, Valid from:9/1/98, 9:00 AM, Valid until:1/28/28, 9:00 AM
2026-06-16 09:25:02,101 WARN [io.qua.oid.com.run.OidcCommonUtils] (vert.x-eventloop-thread-1) OIDC Server is not available:: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
at java.base/sun.security.ssl.Alert.createSSLException(Alert.java:131)
at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:378)
at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:321)
at java.base/sun.security.ssl.TransportContext.fatal(TransportContext.java:316)
at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.checkServerCerts(CertificateMessage.java:654)
at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.onCertificate(CertificateMessage.java:473)
at java.base/sun.security.ssl.CertificateMessage$T12CertificateConsumer.consume(CertificateMessage.java:369)
at java.base/sun.security.ssl.SSLHandshake.consume(SSLHandshake.java:396)
at java.base/sun.security.ssl.HandshakeContext.dispatch(HandshakeContext.java:480)
at java.base/sun.security.ssl.SSLEngineImpl$DelegatedTask$DelegatedAction.run(SSLEngineImpl.java:1277)
Informar formas de contato:*:	teams


parte do log do pod:



sispl-consulta-transacao-ocp4-tqs-14-gwhnr
Running

2026-06-17 17:02:24,058 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 17:02:24,058 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 17:02:24,058 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 17:02:24,058 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 17:02:24,058 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-0) SRJWT06005: Authorization header was null
2026-06-17 17:02:24,058 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 17:02:24,058 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 17:02:24,058 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 17:02:24,058 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 17:02:24,058 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 17:02:24,058 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 17:02:24,058 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-1) Resolved OIDC tenant id: Default
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Starting a bearer access token authentication
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.OidcAuthenticationMechanism] (vert.x-eventloop-thread-0) Resolved OIDC tenant id: Default
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-1) Looking for a token in the authorization header
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Starting a bearer access token authentication
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.OidcUtils] (vert.x-eventloop-thread-0) Looking for a token in the authorization header
2026-06-17 17:02:34,058 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06000: tokenHeaderName = Authorization
2026-06-17 17:02:34,058 DEBUG [io.sma.jwt.auth] (vert.x-eventloop-thread-1) SRJWT06005: Authorization header was null
2026-06-17 17:02:34,058 DEBUG [io.qua.oid.run.BearerAuthenticationMechanism] (vert.x-eventloop-thread-0) Bearer access token is not available
2026-06-17 17:02:34,058 DEBUG [io.qua.sma.jwt.run.aut.JWTAuthMechanism] (vert.x-eventloop-thread-1) Bearer access token is not available
