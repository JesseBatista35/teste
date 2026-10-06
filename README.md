
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sicmo-internet-des-94-swszw -c sicmo-internet-des -n sicmo-des --previous | tail -80
exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicmo-internet -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicmo-internet -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sicmo-backend.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.


     ____    ___    ____   __  __    ___
    / ___|  |_ _|  / ___| |  \/  |  / _ \
    \___ \   | |  | |     | |\/| | | | | |
     ___) |  | |  | |___  | |  | | | |_| |
    |____/  |___|  \____| |_|  |_|  \___/



2026-10-06 14:17:38.996  INFO 8 --- [           main] br.com.caixa.sicmo.Application           : Starting Application v2.0.0 using Java 17.0.7 on sicmo-internet-des-94-swszw with PID 8 (/deployments/sicmo-backend.jar started by 1001 in /deployments)
2026-10-06 14:17:39.003 DEBUG 8 --- [           main] br.com.caixa.sicmo.Application           : Running with Spring Boot v2.6.1, Spring v5.3.13
2026-10-06 14:17:39.003  INFO 8 --- [           main] br.com.caixa.sicmo.Application           : No active profile set, falling back to default profiles: default
2026-10-06 14:17:41.679  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-06 14:17:42.374  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 678 ms. Found 55 JPA repository interfaces.
2026-10-06 14:17:45.871  INFO 8 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2026-10-06 14:17:45.881  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-10-06 14:17:45.882  INFO 8 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.55]
2026-10-06 14:17:45.974  INFO 8 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-10-06 14:17:45.974  INFO 8 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 6787 ms
2026-10-06 14:17:46.874  WARN 8 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-06 14:17:46.996 ERROR 8 --- [           main] o.s.b.web.embedded.tomcat.TomcatStarter  : Error starting Tomcat context. Exception: org.springframework.beans.factory.UnsatisfiedDependencyException. Message: Error creating bean with name 'webSecurityConfig': Unsatisfied dependency expressed through method 'setContentNegotationStrategy' parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration': Unsatisfied dependency expressed through method 'setConfigurers' parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'openEntityManagerInViewInterceptorConfigurer' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/JpaBaseConfiguration$JpaWebConfiguration.class]: Unsatisfied dependency expressed through method 'openEntityManagerInViewInterceptorConfigurer' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'openEntityManagerInViewInterceptor' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/JpaBaseConfiguration$JpaWebConfiguration.class]: Initialization of bean failed; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'scriptDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceInitializationConfiguration$SharedCredentialsDataSourceInitializationConfiguration.class]: Unsatisfied dependency expressed through method 'scriptDataSourceInitializer' parameter 0; nested exception is org.springframework.boot.context.properties.ConfigurationPropertiesBindException: Error creating bean with name 'primarsyDs': Could not bind properties to 'DataSource' : prefix=spring.datasource.sicmo, ignoreInvalidFields=false, ignoreUnknownFields=true; nested exception is org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'spring.datasource.sicmo.password' to java.lang.String
2026-10-06 14:17:47.087  WARN 8 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-06 14:17:47.103 ERROR 8 --- [           main] k.a.t.AbstractKeycloakAuthenticatorValve : The specified resolver org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolverWrapper could NOT be loaded. Keycloak is unconfigured and will deny all requests. Reason: Error creating bean with name 'webSecurityConfig': Unsatisfied dependency expressed through method 'setContentNegotationStrategy' parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration': Unsatisfied dependency expressed through method 'setConfigurers' parameter 0; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'openEntityManagerInViewInterceptorConfigurer' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/JpaBaseConfiguration$JpaWebConfiguration.class]: Unsatisfied dependency expressed through method 'openEntityManagerInViewInterceptorConfigurer' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'openEntityManagerInViewInterceptor' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/JpaBaseConfiguration$JpaWebConfiguration.class]: Initialization of bean failed; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'scriptDataSourceInitializer' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceInitializationConfiguration$SharedCredentialsDataSourceInitializationConfiguration.class]: Unsatisfied dependency expressed through method 'scriptDataSourceInitializer' parameter 0; nested exception is org.springframework.boot.context.properties.ConfigurationPropertiesBindException: Error creating bean with name 'primarsyDs': Could not bind properties to 'DataSource' : prefix=spring.datasource.sicmo, ignoreInvalidFields=false, ignoreUnknownFields=true; nested exception is org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'spring.datasource.sicmo.password' to java.lang.String
2026-10-06 14:17:47.177  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2026-10-06 14:17:47.196  WARN 8 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start web server; nested exception is org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat
2026-10-06 14:17:47.207  INFO 8 --- [           main] ConditionEvaluationReportLoggingListener :

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2026-10-06 14:17:47.285 ERROR 8 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to bind properties under 'spring.datasource.sicmo.password' to java.lang.String:

    Property: spring.datasource.sicmo.password
    Value: ${SQL_SERVER_PASSWORD}
    Origin: class path resource [application.properties] from sicmo-backend.jar - 21:34
    Reason: java.lang.IllegalArgumentException: Could not resolve placeholder 'SCMOBD01_MSSQL' in value "${SCMOBD01_MSSQL}"

Action:

Update your application's configuration

-sh-4.2$
