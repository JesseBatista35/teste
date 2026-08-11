exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-11 11:02:57 [] WARN  io.qu.config - Unrecognized configuration key "quarkus.http.cors" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-11 11:02:57 [] WARN  io.qu.config - Unrecognized configuration key "quarkus.http.connect-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-11 11:02:57 [] WARN  io.qu.ru.co.ConfigRecorder - Build time property cannot be changed at runtime:
 - quarkus.datasource.driver is set to 'oracle.jdbc.driver.OracleDriver' but it is build time fixed to 'null'. Did you change the property quarkus.datasource.driver after building the application?
2026-08-11 11:02:59 [] WARN  or.hi.or.jdbc - HHH100123: Low default JDBC fetch size: 10 (consider setting 'hibernate.jdbc.fetch_size')
2026-08-11 11:02:59 [] ERROR io.qu.ru.Application - Failed to start application: java.lang.RuntimeException: Failed to start quarkus
	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
	at io.quarkus.runtime.Application.start(Application.java:112)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:127)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:79)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:50)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:143)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:86)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:37)
Caused by: java.lang.NoSuchMethodError: 'void org.yaml.snakeyaml.LoaderOptions.setCodePointLimit(int)'
	at io.smallrye.openapi.runtime.io.JacksonJsonIO.<init>(JacksonJsonIO.java:49)
	at io.smallrye.openapi.runtime.io.JacksonJsonIO.<init>(JacksonJsonIO.java:72)
	at io.smallrye.openapi.runtime.io.JsonIO.newInstance(JsonIO.java:66)
	at io.smallrye.openapi.api.SmallRyeOpenAPI$Builder$BuildContext.<init>(SmallRyeOpenAPI.java:691)
	at io.smallrye.openapi.api.SmallRyeOpenAPI$Builder.getContext(SmallRyeOpenAPI.java:138)
	at io.quarkus.smallrye.openapi.runtime.OpenAPIRuntimeBuilder.build(OpenAPIRuntimeBuilder.java:15)
	at io.smallrye.openapi.api.SmallRyeOpenAPI$Builder.build(SmallRyeOpenAPI.java:730)
	at io.quarkus.smallrye.openapi.runtime.OpenApiDocumentService.prepareDocument(OpenApiDocumentService.java:83)
	at io.quarkus.smallrye.openapi.runtime.OpenApiDocumentService_ClientProxy.prepareDocument(Unknown Source)
	at io.quarkus.smallrye.openapi.runtime.OpenApiRecorder.prepareDocument(OpenApiRecorder.java:64)
	at io.quarkus.runner.recorded.SmallRyeOpenApiProcessor$prepareDocuments252117661.deploy_0(Unknown Source)
	at io.quarkus.runner.recorded.SmallRyeOpenApiProcessor$prepareDocuments252117661.deploy(Unknown Source)
	... 9 more

