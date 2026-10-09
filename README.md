2026-10-09T15:44:01.5659155Z ##[section]Starting: Logs da Aplicação
2026-10-09T15:44:01.5662316Z ==============================================================================
2026-10-09T15:44:01.5662404Z Task         : Bash
2026-10-09T15:44:01.5662449Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-09T15:44:01.5662511Z Version      : 3.227.0
2026-10-09T15:44:01.5662560Z Author       : Microsoft Corporation
2026-10-09T15:44:01.5662611Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-09T15:44:01.5662683Z ==============================================================================
2026-10-09T15:44:01.6936371Z Generating script.
2026-10-09T15:44:01.6953644Z ========================== Starting Command Output ===========================
2026-10-09T15:44:01.6964729Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/ce182505-24ec-4065-b015-4726fa3b9b4b.sh
2026-10-09T15:44:01.7039291Z + shopt -s expand_aliases
2026-10-09T15:44:01.7040758Z + [[ -n okd4_nprd ]]
2026-10-09T15:44:01.7040952Z + [[ okd4_nprd =~ ocp ]]
2026-10-09T15:44:01.7041082Z + [[ -n okd4_nprd ]]
2026-10-09T15:44:01.7041188Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-09T15:44:01.7041332Z + app=sifgd-backend-des
2026-10-09T15:44:01.7041424Z + oc version
2026-10-09T15:44:01.7697301Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-10-09T15:44:01.7697747Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-10-09T15:44:01.7698066Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-10-09T15:44:01.7730275Z ++ oc get pod -l name=sifgd-backend-des -n sifgd-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-09T15:44:01.7730653Z ++ tac
2026-10-09T15:44:01.7730861Z ++ grep -v '^$'
2026-10-09T15:44:01.7732150Z ++ head -n1
2026-10-09T15:44:01.8611569Z + last_pod=sifgd-backend-des-5-xkhrz
2026-10-09T15:44:01.8611868Z + echo 'Logs do POD: sifgd-backend-des-5-xkhrz'
2026-10-09T15:44:01.8612074Z + oc logs sifgd-backend-des-5-xkhrz -c sifgd-backend-des -n sifgd-des
2026-10-09T15:44:01.8612279Z Logs do POD: sifgd-backend-des-5-xkhrz
2026-10-09T15:44:01.9600333Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sifgd-backend -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=https://apm-server-devops.apps.produtos4.caixa/ -Delastic.apm.global_labels=deployment=sifgd-backend -Delastic.apm.verify_server_cert=false -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/sifgd-backend-0.0.1-SNAPSHOT.jar
2026-10-09T15:44:01.9601449Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-09T15:44:01.9601989Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-10-09T15:44:01.9602267Z WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
2026-10-09T15:44:01.9602588Z WARNING: sun.misc.Unsafe::arrayBaseOffset has been called by co.elastic.apm.agent.shaded.lmax.disruptor.RingBufferFields
2026-10-09T15:44:01.9602940Z WARNING: Please consider reporting this to the maintainers of class co.elastic.apm.agent.shaded.lmax.disruptor.RingBufferFields
2026-10-09T15:44:01.9603220Z WARNING: sun.misc.Unsafe::arrayBaseOffset will be removed in a future release
2026-10-09T15:44:01.9603422Z Failed to start agent
2026-10-09T15:44:01.9603606Z java.lang.reflect.InvocationTargetException
2026-10-09T15:44:01.9603896Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:119)
2026-10-09T15:44:01.9604206Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
2026-10-09T15:44:01.9604510Z 	at co.elastic.apm.agent.premain.AgentMain.loadAndInitializeAgent(AgentMain.java:155)
2026-10-09T15:44:01.9604802Z 	at co.elastic.apm.agent.premain.AgentMain.init(AgentMain.java:100)
2026-10-09T15:44:01.9605083Z 	at co.elastic.apm.agent.premain.AgentMain.premain(AgentMain.java:56)
2026-10-09T15:44:01.9605953Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
2026-10-09T15:44:01.9606243Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
2026-10-09T15:44:01.9606529Z 	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndStartAgent(InstrumentationImpl.java:544)
2026-10-09T15:44:01.9606862Z 	at java.instrument/sun.instrument.InstrumentationImpl.loadClassAndCallPremain(InstrumentationImpl.java:556)
2026-10-09T15:44:01.9607246Z Caused by: java.lang.RuntimeException: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
2026-10-09T15:44:01.9607651Z 	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:221)
2026-10-09T15:44:01.9607975Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.getTransformer(ElasticApmAgent.java:436)
2026-10-09T15:44:01.9608288Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.applyAdvice(ElasticApmAgent.java:398)
2026-10-09T15:44:01.9608569Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initAgentBuilder(ElasticApmAgent.java:321)
2026-10-09T15:44:01.9608883Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:267)
2026-10-09T15:44:01.9609195Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initInstrumentation(ElasticApmAgent.java:171)
2026-10-09T15:44:01.9609692Z 	at co.elastic.apm.agent.bci.ElasticApmAgent.initialize(ElasticApmAgent.java:157)
2026-10-09T15:44:01.9610042Z 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
2026-10-09T15:44:01.9610292Z 	... 8 more
2026-10-09T15:44:01.9610822Z Caused by: java.lang.UnsupportedOperationException: Could not access Unsafe class: sun.misc.Unsafe.defineClass(java.lang.String,[B,int,int,java.lang.ClassLoader,java.security.ProtectionDomain)
2026-10-09T15:44:01.9611312Z 	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe$Dispatcher$Unavailable.initialize(ClassInjector.java:2133)
2026-10-09T15:44:01.9611700Z 	at co.elastic.apm.agent.shaded.bytebuddy.dynamic.loading.ClassInjector$UsingUnsafe.injectRaw(ClassInjector.java:1865)
2026-10-09T15:44:01.9612010Z 	at co.elastic.apm.agent.bci.IndyBootstrap.initIndyBootstrap(IndyBootstrap.java:234)
2026-10-09T15:44:01.9612301Z 	at co.elastic.apm.agent.bci.IndyBootstrap.getIndyBootstrapMethod(IndyBootstrap.java:215)
2026-10-09T15:44:01.9612517Z 	... 15 more
2026-10-09T15:44:01.9612579Z 
2026-10-09T15:44:01.9612730Z   .   ____          _            __ _ _
2026-10-09T15:44:01.9613121Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-10-09T15:44:01.9613367Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-10-09T15:44:01.9613552Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-10-09T15:44:01.9613795Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-10-09T15:44:01.9613967Z  =========|_|==============|___/=/_/_/_/
2026-10-09T15:44:01.9614038Z 
2026-10-09T15:44:01.9614187Z  :: Spring Boot ::                (v4.0.5)
2026-10-09T15:44:01.9614264Z 
2026-10-09T15:44:01.9614866Z 2026-10-09T12:42:09.005-03:00  INFO 8 --- [sifgd-backend] [           main] b.g.caixa.sifgd.SifgdBackendApplication  : Starting SifgdBackendApplication v0.0.1-SNAPSHOT using Java 25.0.3 with PID 8 (/deployments/sifgd-backend-0.0.1-SNAPSHOT.jar started by root in /deployments)
2026-10-09T15:44:01.9615536Z 2026-10-09T12:42:09.007-03:00  INFO 8 --- [sifgd-backend] [           main] b.g.caixa.sifgd.SifgdBackendApplication  : No active profile set, falling back to 1 default profile: "default"
2026-10-09T15:44:01.9616073Z 2026-10-09T12:42:10.691-03:00  INFO 8 --- [sifgd-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-09T15:44:01.9616702Z 2026-10-09T12:42:10.708-03:00  INFO 8 --- [sifgd-backend] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 10 ms. Found 0 JPA repository interfaces.
2026-10-09T15:44:01.9617503Z 2026-10-09T12:42:11.778-03:00  INFO 8 --- [sifgd-backend] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2026-10-09T15:44:01.9618001Z 2026-10-09T12:42:11.791-03:00  INFO 8 --- [sifgd-backend] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-10-09T15:44:01.9618531Z 2026-10-09T12:42:11.792-03:00  INFO 8 --- [sifgd-backend] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.20]
2026-10-09T15:44:01.9619122Z 2026-10-09T12:42:11.901-03:00  INFO 8 --- [sifgd-backend] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 2799 ms
2026-10-09T15:44:01.9619769Z 2026-10-09T12:42:12.775-03:00  INFO 8 --- [sifgd-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-10-09T15:44:01.9620354Z 2026-10-09T12:42:13.204-03:00  INFO 8 --- [sifgd-backend] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.ibm.db2.jcc.t4.b@30e2016a
2026-10-09T15:44:01.9620875Z 2026-10-09T12:42:13.205-03:00  INFO 8 --- [sifgd-backend] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-10-09T15:44:01.9621374Z 2026-10-09T12:42:13.293-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-10-09T15:44:01.9621843Z 2026-10-09T12:42:13.407-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.2.7.Final
2026-10-09T15:44:01.9622557Z 2026-10-09T12:42:14.411-03:00  INFO 8 --- [sifgd-backend] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-10-09T15:44:01.9623228Z 2026-10-09T12:42:14.512-03:00  WARN 8 --- [sifgd-backend] [           main] org.hibernate.orm.deprecation            : HHH90000025: DB2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-10-09T15:44:01.9623799Z 2026-10-09T12:42:14.588-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
2026-10-09T15:44:01.9624137Z 	Database JDBC URL [jdbc:db2://10.216.80.110:448/RJKDB2DSD0]
2026-10-09T15:44:01.9624380Z 	Database driver: IBM Data Server Driver for JDBC and SQLJ
2026-10-09T15:44:01.9624566Z 	Database dialect: DB2Dialect
2026-10-09T15:44:01.9624721Z 	Database version: 13.1
2026-10-09T15:44:01.9624904Z 	Default catalog/schema: undefined/FUG
2026-10-09T15:44:01.9625086Z 	Autocommit mode: undefined/unknown
2026-10-09T15:44:01.9625273Z 	Isolation level: READ_COMMITTED [default READ_COMMITTED]
2026-10-09T15:44:01.9625459Z 	JDBC fetch size: none
2026-10-09T15:44:01.9625633Z 	Pool: DataSourceConnectionProvider
2026-10-09T15:44:01.9625833Z 	Minimum pool size: undefined/unknown
2026-10-09T15:44:01.9626013Z 	Maximum pool size: undefined/unknown
2026-10-09T15:44:01.9626600Z 2026-10-09T12:42:15.415-03:00  INFO 8 --- [sifgd-backend] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-10-09T15:44:01.9627236Z 2026-10-09T12:42:15.478-03:00  INFO 8 --- [sifgd-backend] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-10-09T15:44:01.9628263Z 2026-10-09T12:42:15.770-03:00  WARN 8 --- [sifgd-backend] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-09T15:44:01.9628943Z 2026-10-09T12:42:16.591-03:00  INFO 8 --- [sifgd-backend] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2026-10-09T15:44:01.9629882Z 2026-10-09T12:42:16.599-03:00  INFO 8 --- [sifgd-backend] [           main] b.g.caixa.sifgd.SifgdBackendApplication  : Started SifgdBackendApplication in 8.488 seconds (process running for 10.421)
2026-10-09T15:44:01.9630564Z 2026-10-09T12:42:16.601-03:00  WARN 8 --- [sifgd-backend] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /v3/api-docs endpoint is enabled by default. To disable it in production, set the property 'springdoc.api-docs.enabled=false'
2026-10-09T15:44:01.9631347Z 2026-10-09T12:42:16.602-03:00  WARN 8 --- [sifgd-backend] [           main] o.s.core.events.SpringDocAppInitializer  : SpringDoc /swagger-ui.html endpoint is enabled by default. To disable it in production, set the property 'springdoc.swagger-ui.enabled=false'
2026-10-09T15:44:01.9631999Z 2026-10-09T12:43:15.622-03:00  INFO 8 --- [sifgd-backend] [0.0-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-10-09T15:44:01.9632525Z 2026-10-09T12:43:15.622-03:00  INFO 8 --- [sifgd-backend] [0.0-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-10-09T15:44:01.9633012Z 2026-10-09T12:43:15.623-03:00  INFO 8 --- [sifgd-backend] [0.0-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2026-10-09T15:44:01.9701515Z ##[section]Finishing: Logs da Aplicação
