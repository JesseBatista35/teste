exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Xms1280m -Xmx1280m -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.keyStore=/deployments/caixa-keystore-mpi-mq-plexd-nprd-2.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-07-01 14:36:07,529 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.tls.key-store.p12.type" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-01 14:36:08,676 ERROR [io.qua.run.Application] (main) Failed to start application: java.lang.RuntimeException: Failed to start quarkus
	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
	at io.quarkus.runtime.Application.start(Application.java:101)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:119)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
Caused by: java.lang.IllegalStateException: Invalid P12 key store configuration for certificate '<default>'
	at io.quarkus.tls.runtime.keystores.P12KeyStores.toOptions(P12KeyStores.java:69)
	at io.quarkus.tls.runtime.keystores.P12KeyStores.verifyP12KeyStore(P12KeyStores.java:35)
	at io.quarkus.tls.runtime.CertificateRecorder.verifyKeyStore(CertificateRecorder.java:111)
	at io.quarkus.tls.runtime.CertificateRecorder.verifyCertificateConfig(CertificateRecorder.java:67)
	at io.quarkus.tls.runtime.CertificateRecorder.validateCertificates(CertificateRecorder.java:43)
	at io.quarkus.deployment.steps.CertificatesProcessor$initializeCertificate877524439.deploy_0(Unknown Source)
	at io.quarkus.deployment.steps.CertificatesProcessor$initializeCertificate877524439.deploy(Unknown Source)
	... 13 more
Caused by: java.lang.IllegalStateException: Invalid P12 key store configuration for certificate '<default>' - the key store password is not set and cannot be retrieved from the credential provider.
	at io.quarkus.tls.runtime.keystores.P12KeyStores.toOptions(P12KeyStores.java:56)
	... 19 more

