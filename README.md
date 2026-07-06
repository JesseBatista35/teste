exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/sicpf-caixa-truststore-acesteste-nprd.jks -Djavax.net.ssl.keyStore=/deployments/asweb.caixa.gov.br_completa-sicpf_2026.pfx -Djavax.net.ssl.keyStorePassword=lZiABCXw6zPRu2 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/atendimento-0.0.1-SNAPSHOT.jar
Could not load Logmanager "org.jboss.logmanager.LogManager"
java.lang.ClassNotFoundException: org.jboss.logmanager.LogManager
	at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:445)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:593)
	at org.springframework.boot.loader.net.protocol.jar.JarUrlClassLoader.loadClass(JarUrlClassLoader.java:107)
	at org.springframework.boot.loader.launch.LaunchedClassLoader.loadClass(LaunchedClassLoader.java:91)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:526)
	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:239)
	at java.logging/java.util.logging.LogManager$1.run(LogManager.java:223)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:319)
	at java.logging/java.util.logging.LogManager.<clinit>(LogManager.java:222)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isJulUsingASingleConsoleHandlerAtMost(LogbackLoggingSystem.java:160)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.isBridgeJulIntoSlf4j(LogbackLoggingSystem.java:152)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.configureJdkLoggingBridgeHandler(LogbackLoggingSystem.java:141)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.beforeInitialize(LogbackLoggingSystem.java:135)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationStartingEvent(LoggingApplicationListener.java:240)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent(LoggingApplicationListener.java:222)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:180)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:173)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:151)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:133)
	at org.springframework.boot.context.event.EventPublishingRunListener.multicastInitialEvent(EventPublishingRunListener.java:137)
	at org.springframework.boot.context.event.EventPublishingRunListener.starting(EventPublishingRunListener.java:76)
	at org.springframework.boot.SpringApplicationRunListeners.lambda$starting$0(SpringApplicationRunListeners.java:56)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:123)
	at org.springframework.boot.SpringApplicationRunListeners.starting(SpringApplicationRunListeners.java:56)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:313)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1365)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354)
	at br.caixa.gov.sicpf.atendimento.AtendimentoApplication.main(AtendimentoApplication.java:11)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:106)
	at org.springframework.boot.loader.launch.Launcher.launch(Launcher.java:64)
	at org.springframework.boot.loader.launch.JarLauncher.main(JarLauncher.java:40)

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.6)

2026-07-06T10:11:04.866-03:00  INFO 8 --- [           main] b.c.g.s.a.AtendimentoApplication         : Starting AtendimentoApplication v0.0.1-SNAPSHOT using Java 21.0.1 with PID 8 (/deployments/atendimento-0.0.1-SNAPSHOT.jar started by 185 in /deployments)
2026-07-06T10:11:04.869-03:00  INFO 8 --- [           main] b.c.g.s.a.AtendimentoApplication         : No active profile set, falling back to 1 default profile: "default"
2026-07-06T10:11:06.784-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-07-06T10:11:06.807-03:00  INFO 8 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 13 ms. Found 0 JPA repository interfaces.
2026-07-06T10:11:08.293-03:00  INFO 8 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2026-07-06T10:11:08.303-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-07-06T10:11:08.304-03:00  INFO 8 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.21]
2026-07-06T10:11:08.516-03:00  INFO 8 --- [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 3536 ms
2026-07-06T10:11:09.505-03:00 DEBUG 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Building JPA container EntityManagerFactory for persistence unit 'default'
2026-07-06T10:11:09.566-03:00  INFO 8 --- [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-07-06T10:11:09.670-03:00  INFO 8 --- [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.2.12.Final
2026-07-06T10:11:09.688-03:00 DEBUG 8 --- [           main] o.s.o.jpa.hibernate.SpringBeanContainer  : Falling back to Hibernate's default producer after bean creation failure for interface org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider': Failed to instantiate [org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider]: Specified class is an interface
2026-07-06T10:11:10.488-03:00  INFO 8 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-07-06T10:11:10.566-03:00  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-07-06T10:11:10.988-03:00  INFO 8 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.ibm.db2.jcc.t4.b@7c59cf66
2026-07-06T10:11:10.989-03:00  INFO 8 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-07-06T10:11:11.066-03:00  WARN 8 --- [           main] org.hibernate.orm.deprecation            : HHH90000025: DB2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-07-06T10:11:11.101-03:00  INFO 8 --- [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [jdbc:db2://10.216.80.110:448/RJKDB2DSD0]
	Database driver: IBM Data Server Driver for JDBC and SQLJ
	Database dialect: DB2Dialect
	Database version: 13.1
	Default catalog/schema: undefined/CPF
	Autocommit mode: undefined/unknown
	Isolation level: READ_COMMITTED [default READ_COMMITTED]
	JDBC fetch size: none
	Pool: DataSourceConnectionProvider
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-07-06T10:11:11.703-03:00 DEBUG 8 --- [           main] o.s.o.jpa.hibernate.SpringBeanContainer  : Falling back to Hibernate's default producer after bean creation failure for interface org.hibernate.context.spi.CurrentTenantIdentifierResolver: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.hibernate.context.spi.CurrentTenantIdentifierResolver<?>' available
2026-07-06T10:11:11.703-03:00 DEBUG 8 --- [           main] o.s.o.jpa.hibernate.SpringBeanContainer  : Falling back to Hibernate's default producer after bean creation failure for interface org.hibernate.context.spi.TenantSchemaMapper: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.hibernate.context.spi.TenantSchemaMapper<?>' available
2026-07-06T10:11:13.572-03:00  INFO 8 --- [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-07-06T10:11:13.578-03:00  INFO 8 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-07-06T10:11:14.193-03:00  INFO 8 --- [           main] b.c.g.s.atendimento.config.SoapConfig    : SSL trustStore configurado: /deployments/sicpf-caixa-truststore-acesteste-nprd.jks
2026-07-06T10:11:14.273-03:00  INFO 8 --- [           main] b.c.g.s.atendimento.config.SoapConfig    : SSL keyStore configurado: /deployments/asweb.caixa.gov.br_completa-sicpf_2026.pfx
2026-07-06T10:11:14.605-03:00  INFO 8 --- [           main] o.s.ws.soap.saaj.SaajSoapMessageFactory  : Creating SAAJ 1.3 MessageFactory with SOAP 1.2 Protocol
2026-07-06T10:11:14.669-03:00  INFO 8 --- [           main] o.s.ws.soap.saaj.SaajSoapMessageFactory  : Creating SAAJ 1.3 MessageFactory with SOAP 1.1 Protocol
2026-07-06T10:11:14.975-03:00 DEBUG 8 --- [           main] swordEncoderAuthenticationManagerBuilder : No authenticationProviders and no parentAuthenticationManager defined. Returning null.
2026-07-06T10:11:15.493-03:00 DEBUG 8 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with filters: DisableEncodeUrlFilter, WebAsyncManagerIntegrationFilter, SecurityContextHolderFilter, HeaderWriterFilter, CorsFilter, LogoutFilter, OAuth2ProtectedResourceMetadataFilter, BearerTokenAuthenticationFilter, AuthenticationFilter, RequestCacheAwareFilter, SecurityContextHolderAwareRequestFilter, AnonymousAuthenticationFilter, SessionManagementFilter, ExceptionTranslationFilter, AuthorizationFilter
2026-07-06T10:11:16.605-03:00  INFO 8 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
2026-07-06T10:11:16.778-03:00  INFO 8 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2026-07-06T10:11:16.786-03:00  INFO 8 --- [           main] b.c.g.s.a.AtendimentoApplication         : Started AtendimentoApplication in 12.807 seconds (process running for 13.896)
2026-07-06T10:12:41.910-03:00  INFO 8 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-07-06T10:12:41.911-03:00  INFO 8 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-07-06T10:12:41.923-03:00  INFO 8 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 11 ms
2026-07-06T10:12:41.972-03:00 DEBUG 8 --- [nio-8080-exec-1] o.s.security.web.FilterChainProxy        : Securing OPTIONS /cpf/atendimento/concluir/2026-06-30T11:38:31.428119
2026-07-06T10:12:42.127-03:00 DEBUG 8 --- [nio-8080-exec-2] o.s.security.web.FilterChainProxy        : Securing PUT /cpf/atendimento/concluir/2026-06-30T11:38:31.428119
2026-07-06T10:12:42.133-03:00 DEBUG 8 --- [nio-8080-exec-2] o.s.s.w.a.AnonymousAuthenticationFilter  : Set SecurityContextHolder to anonymous SecurityContext
2026-07-06T10:13:00.629-03:00 DEBUG 8 --- [nio-8080-exec-4] o.s.security.web.FilterChainProxy        : Securing OPTIONS /cpf/atendimento/?pagina=0&tamanhoPagina=999
2026-07-06T10:13:00.723-03:00 DEBUG 8 --- [nio-8080-exec-5] o.s.security.web.FilterChainProxy        : Securing GET /cpf/atendimento/?pagina=0&tamanhoPagina=999
2026-07-06T10:13:00.805-03:00 DEBUG 8 --- [nio-8080-exec-5] er$RestTemplateWithNimbusDefaultTimeouts : HTTP GET https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs
2026-07-06T10:13:00.808-03:00 DEBUG 8 --- [nio-8080-exec-5] er$RestTemplateWithNimbusDefaultTimeouts : Accept=[text/plain, application/json, application/xml, text/xml, application/*+json, application/*+xml, */*]
2026-07-06T10:13:01.103-03:00 DEBUG 8 --- [nio-8080-exec-5] er$RestTemplateWithNimbusDefaultTimeouts : Response 200 OK
2026-07-06T10:13:01.104-03:00 DEBUG 8 --- [nio-8080-exec-5] er$RestTemplateWithNimbusDefaultTimeouts : Reading to [java.lang.String] as "application/json"
2026-07-06T10:13:01.178-03:00 DEBUG 8 --- [nio-8080-exec-5] o.s.s.o.s.r.a.JwtAuthenticationProvider  : Authenticated token
2026-07-06T10:13:01.179-03:00 DEBUG 8 --- [nio-8080-exec-5] .s.r.w.a.BearerTokenAuthenticationFilter : Set SecurityContextHolder to JwtAuthenticationToken [Principal=org.springframework.security.oauth2.jwt.Jwt@4b1a91b1, Credentials=[PROTECTED], Authenticated=true, Details=WebAuthenticationDetails [RemoteIpAddress=25.3.10.1, SessionId=null], Granted Authorities=[ROLE_offline_access, ROLE_uma_authorization, FactorGrantedAuthority [authority=FACTOR_BEARER, issuedAt=2026-07-06T13:13:01.177453338Z]]]
2026-07-06T10:13:01.181-03:00 DEBUG 8 --- [nio-8080-exec-5] o.s.security.web.FilterChainProxy        : Secured GET /cpf/atendimento/?pagina=0&tamanhoPagina=999
2026-07-06T10:13:01.214-03:00 DEBUG 8 --- [nio-8080-exec-5] horizationManagerBeforeMethodInterceptor : Authorizing method invocation ReflectiveMethodInvocation: public java.util.List br.caixa.gov.sicpf.atendimento.rest.AtendimentoController.obterAtendimentos(int,int); target is of class [br.caixa.gov.sicpf.atendimento.rest.AtendimentoController]
2026-07-06T10:13:01.265-03:00 DEBUG 8 --- [nio-8080-exec-5] horizationManagerBeforeMethodInterceptor : Authorized method invocation ReflectiveMethodInvocation: public java.util.List br.caixa.gov.sicpf.atendimento.rest.AtendimentoController.obterAtendimentos(int,int); target is of class [br.caixa.gov.sicpf.atendimento.rest.AtendimentoController]
2026-07-06T10:13:02.466-03:00 DEBUG 8 --- [nio-8080-exec-5] tor$SharedEntityManagerInvocationHandler : Creating new EntityManager for shared EntityManager invocation
Hibernate: 
    select
        distinct ca1_0.nu_sequencial,
        ca1_0.co_conveniado,
        ca1_0.co_matricula_opera,
        c4_0.co_erro,
        c4_0.de_erro,
        c7_0.co_conveniado,
        c7_0.co_agencia_pagamen,
        c7_0.co_matricula,
        c7_0.fk_cpfvwcad_pesfk,
        c7_0.dt_liberacao,
        c7_0.dt_pagamento,
        c7_0.ic_abertura_conta,
        c7_0.ic_alsto_eleitoral,
        c7_0.ic_conclusivo,
        c7_0.ic_estrangeiro,
        c7_0.ic_procuracao,
        c7_0.ic_situacao_tarifa,
        c7_0.ic_tp_operacao,
        c7_0.nu_campo_atualizad,
        c7_0.nu_cpf_atendente,
        c7_0.nu_cpf_procurador,
        c7_0.nu_unidade,
        c7_0.ts_operacao,
        c7_0.vr_anterior,
        c1_0.dt_hr_operacao,
        c1_0.co_agencia,
        c1_0.co_cntle_atnco,
        c1_0.co_conveniado,
        c1_0.co_e_mail,
        c1_0.co_matricula,
        c1_0.co_mtrca_cnlso_atn,
        c1_0.co_municipio,
        c1_0.co_tipo_operacao,
        c3_0.co_tp_stco_trfa,
        c3_0.de_stco_trfa,
        c2_0.co_motv_isnco_trfa,
        c2_0.de_motv_isnco_trfa,
        c1_0.de_complemento,
        c1_0.de_ocorrencia,
        c1_0.de_orientacao,
        c1_0.dt_corrente_atnto,
        c1_0.dt_emissao_ident,
        c1_0.dt_extracao,
        c1_0.dt_liberacao,
        c1_0.dt_limite_cmpro,
        c1_0.dt_nascimento,
        c1_0.dt_pagto_tarifa,
        c1_0.fk_icovwl10_nu_lo,
        c1_0.fk_icovwl22_sg_uf,
        c1_0.hh_corrente_atnto,
        c1_0.ic_abertura_conta,
        c1_0.ic_alsto_eleitoral,
        c1_0.ic_alterou_mae,
        c1_0.ic_conclusivo,
        c1_0.ic_entrega,
        c1_0.ic_estrangeiro,
        c1_0.ic_procuracao,
        c1_0.ic_sexo,
        c1_0.ic_situacao_tarifa,
        c1_0.no_bairro,
        c1_0.no_contribuinte,
        c1_0.no_logradouro,
        c1_0.no_mae,
        c1_0.nu_cep,
        c1_0.nu_cpf,
        c1_0.nu_cpf_atendente,
        c1_0.nu_cpf_cnlso_atndo,
        c1_0.nu_cpf_procurador,
        c1_0.nu_ddd,
        c1_0.nu_fax,
        c1_0.nu_identidade,
        c1_0.nu_logradouro,
        c1_0.nu_responsavel,
        c1_0.nu_telefone,
        c1_0.nu_tit_eleitor,
        c1_0.sg_org_emissor,
        c1_0.sg_uf,
        c1_0.sg_uf_ident,
        c1_0.vr_tarifa,
        c6_0.nu_remessa,
        c6_0.dt_movimento,
        c6_0.qt_registros_envia,
        c5_0.nu_remessa,
        c5_0.dt_movimento,
        c5_0.qt_registros_receb,
        ca1_0.dt_retorno,
        ca1_0.fk_cpfvwerroco_err,
        ca1_0.fk_cpfvwhist_coco,
        ca1_0.fk_cpfvwope_caddt,
        ca1_0.fk_cpfvwremessanu,
        ca1_0.fk_cpfvwretornonu,
        ca1_0.ic_conclusivo,
        ca1_0.ic_impressao 
    from
        cpf.cpftbhist_atend ca1_0 
    join
        cpf.cpftbope_cad_cpf c1_0 
            on c1_0.dt_hr_operacao=ca1_0.fk_cpfvwope_caddt 
    left join
        cpf.cpftbt02_isnco_trfa c2_0 
            on c2_0.co_motv_isnco_trfa=c1_0.co_isnc_trfa_cpft02 
    left join
        cpf.cpftbt01_tpo_stco_trfa c3_0 
            on c3_0.co_tp_stco_trfa=c1_0.co_stco_trfa_cpft01 
    left join
        cpf.cpftberro c4_0 
            on c4_0.co_erro=ca1_0.fk_cpfvwerroco_err 
    left join
        cpf.cpftbretorno c5_0 
            on c5_0.nu_remessa=ca1_0.fk_cpfvwretornonu 
    left join
        cpf.cpftbremessa_arq c6_0 
            on c6_0.nu_remessa=ca1_0.fk_cpfvwremessanu 
    left join
        cpf.cpftbhist_contribu c7_0 
            on c7_0.co_conveniado=ca1_0.fk_cpfvwhist_coco 
    where
        c1_0.co_agencia=? 
    order by
        ca1_0.dt_retorno desc,
        ca1_0.nu_sequencial desc
2026-07-06T10:13:07.566-03:00 DEBUG 8 --- [nio-8080-exec-6] o.s.security.web.FilterChainProxy        : Securing OPTIONS /cpf/atendimento/concluir/2026-06-30T11:38:31.428119
2026-07-06T10:13:07.648-03:00 DEBUG 8 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : Securing PUT /cpf/atendimento/concluir/2026-06-30T11:38:31.428119
2026-07-06T10:13:07.650-03:00 DEBUG 8 --- [nio-8080-exec-7] o.s.s.o.s.r.a.JwtAuthenticationProvider  : Authenticated token
2026-07-06T10:13:07.651-03:00 DEBUG 8 --- [nio-8080-exec-7] .s.r.w.a.BearerTokenAuthenticationFilter : Set SecurityContextHolder to JwtAuthenticationToken [Principal=org.springframework.security.oauth2.jwt.Jwt@4b1a91b1, Credentials=[PROTECTED], Authenticated=true, Details=WebAuthenticationDetails [RemoteIpAddress=25.3.10.1, SessionId=null], Granted Authorities=[ROLE_offline_access, ROLE_uma_authorization, FactorGrantedAuthority [authority=FACTOR_BEARER, issuedAt=2026-07-06T13:13:07.650907398Z]]]
2026-07-06T10:13:07.651-03:00 DEBUG 8 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : Secured PUT /cpf/atendimento/concluir/2026-06-30T11:38:31.428119
2026-07-06T10:13:07.657-03:00 DEBUG 8 --- [nio-8080-exec-7] horizationManagerBeforeMethodInterceptor : Authorizing method invocation ReflectiveMethodInvocation: public br.caixa.gov.sicpf.atendimento.entity.Atendimento br.caixa.gov.sicpf.atendimento.rest.AtendimentoController.concluirAtendimento(java.time.LocalDateTime); target is of class [br.caixa.gov.sicpf.atendimento.rest.AtendimentoController]
2026-07-06T10:13:07.658-03:00 DEBUG 8 --- [nio-8080-exec-7] horizationManagerBeforeMethodInterceptor : Authorized method invocation ReflectiveMethodInvocation: public br.caixa.gov.sicpf.atendimento.entity.Atendimento br.caixa.gov.sicpf.atendimento.rest.AtendimentoController.concluirAtendimento(java.time.LocalDateTime); target is of class [br.caixa.gov.sicpf.atendimento.rest.AtendimentoController]
2026-07-06T10:13:07.658-03:00 DEBUG 8 --- [nio-8080-exec-7] tor$SharedEntityManagerInvocationHandler : Creating new EntityManager for shared EntityManager invocation
Hibernate: 
    SELECT
        h.NU_SEQUENCIAL 
    FROM
        CPF.CPFTBHIST_ATEND h 
    INNER JOIN
        CPF.CPFTBOPE_CAD_CPF o     
            ON h.FK_CPFVWOPE_CADDT = o.DT_HR_OPERACAO 
    WHERE
        o.DT_HR_OPERACAO = ? 
    ORDER BY
        h.NU_SEQUENCIAL DESC 
    FETCH
        FIRST 1 ROWS ONLY
2026-07-06T10:13:07.714-03:00 DEBUG 8 --- [nio-8080-exec-7] tor$SharedEntityManagerInvocationHandler : Creating new EntityManager for shared EntityManager invocation
Hibernate: 
    select
        distinct ca1_0.nu_sequencial,
        ca1_0.co_conveniado,
        ca1_0.co_matricula_opera,
        c4_0.co_erro,
        c4_0.de_erro,
        c7_0.co_conveniado,
        c7_0.co_agencia_pagamen,
        c7_0.co_matricula,
        c7_0.fk_cpfvwcad_pesfk,
        c7_0.dt_liberacao,
        c7_0.dt_pagamento,
        c7_0.ic_abertura_conta,
        c7_0.ic_alsto_eleitoral,
        c7_0.ic_conclusivo,
        c7_0.ic_estrangeiro,
        c7_0.ic_procuracao,
        c7_0.ic_situacao_tarifa,
        c7_0.ic_tp_operacao,
        c7_0.nu_campo_atualizad,
        c7_0.nu_cpf_atendente,
        c7_0.nu_cpf_procurador,
        c7_0.nu_unidade,
        c7_0.ts_operacao,
        c7_0.vr_anterior,
        c1_0.dt_hr_operacao,
        c1_0.co_agencia,
        c1_0.co_cntle_atnco,
        c1_0.co_conveniado,
        c1_0.co_e_mail,
        c1_0.co_matricula,
        c1_0.co_mtrca_cnlso_atn,
        c1_0.co_municipio,
        c1_0.co_tipo_operacao,
        c3_0.co_tp_stco_trfa,
        c3_0.de_stco_trfa,
        c2_0.co_motv_isnco_trfa,
        c2_0.de_motv_isnco_trfa,
        c1_0.de_complemento,
        c1_0.de_ocorrencia,
        c1_0.de_orientacao,
        c1_0.dt_corrente_atnto,
        c1_0.dt_emissao_ident,
        c1_0.dt_extracao,
        c1_0.dt_liberacao,
        c1_0.dt_limite_cmpro,
        c1_0.dt_nascimento,
        c1_0.dt_pagto_tarifa,
        c1_0.fk_icovwl10_nu_lo,
        c1_0.fk_icovwl22_sg_uf,
        c1_0.hh_corrente_atnto,
        c1_0.ic_abertura_conta,
        c1_0.ic_alsto_eleitoral,
        c1_0.ic_alterou_mae,
        c1_0.ic_conclusivo,
        c1_0.ic_entrega,
        c1_0.ic_estrangeiro,
        c1_0.ic_procuracao,
        c1_0.ic_sexo,
        c1_0.ic_situacao_tarifa,
        c1_0.no_bairro,
        c1_0.no_contribuinte,
        c1_0.no_logradouro,
        c1_0.no_mae,
        c1_0.nu_cep,
        c1_0.nu_cpf,
        c1_0.nu_cpf_atendente,
        c1_0.nu_cpf_cnlso_atndo,
        c1_0.nu_cpf_procurador,
        c1_0.nu_ddd,
        c1_0.nu_fax,
        c1_0.nu_identidade,
        c1_0.nu_logradouro,
        c1_0.nu_responsavel,
        c1_0.nu_telefone,
        c1_0.nu_tit_eleitor,
        c1_0.sg_org_emissor,
        c1_0.sg_uf,
        c1_0.sg_uf_ident,
        c1_0.vr_tarifa,
        c6_0.nu_remessa,
        c6_0.dt_movimento,
        c6_0.qt_registros_envia,
        c5_0.nu_remessa,
        c5_0.dt_movimento,
        c5_0.qt_registros_receb,
        ca1_0.dt_retorno,
        ca1_0.fk_cpfvwerroco_err,
        ca1_0.fk_cpfvwhist_coco,
        ca1_0.fk_cpfvwope_caddt,
        ca1_0.fk_cpfvwremessanu,
        ca1_0.fk_cpfvwretornonu,
        ca1_0.ic_conclusivo,
        ca1_0.ic_impressao 
    from
        cpf.cpftbhist_atend ca1_0 
    join
        cpf.cpftbope_cad_cpf c1_0 
            on c1_0.dt_hr_operacao=ca1_0.fk_cpfvwope_caddt 
    left join
        cpf.cpftbt02_isnco_trfa c2_0 
            on c2_0.co_motv_isnco_trfa=c1_0.co_isnc_trfa_cpft02 
    left join
        cpf.cpftbt01_tpo_stco_trfa c3_0 
            on c3_0.co_tp_stco_trfa=c1_0.co_stco_trfa_cpft01 
    left join
        cpf.cpftberro c4_0 
            on c4_0.co_erro=ca1_0.fk_cpfvwerroco_err 
    left join
        cpf.cpftbretorno c5_0 
            on c5_0.nu_remessa=ca1_0.fk_cpfvwretornonu 
    left join
        cpf.cpftbremessa_arq c6_0 
            on c6_0.nu_remessa=ca1_0.fk_cpfvwremessanu 
    left join
        cpf.cpftbhist_contribu c7_0 
            on c7_0.co_conveniado=ca1_0.fk_cpfvwhist_coco 
    where
        ca1_0.nu_sequencial=?
2026-07-06T10:13:07.850-03:00  INFO 8 --- [nio-8080-exec-7] b.c.g.s.a.s.impl.ReceitaFederalService   : Enviando SOAP 1.2 request para: https://hom-acesso.infoconv.receita.fazenda.gov.br/ws/cpf_atendimento/ - EfetivacaoAtendimentoCPF
2026-07-06T10:13:07.850-03:00  INFO 8 --- [nio-8080-exec-7] b.c.g.s.a.s.impl.ReceitaFederalService   : Tipo de Operação convertido de INCLUSAO para 1
2026-07-06T10:13:07.850-03:00  INFO 8 --- [nio-8080-exec-7] b.c.g.s.a.s.impl.ReceitaFederalService   : SOAP BODY ENVIADO: <EfetivacaoAtendimentoCPF xmlns="https://hom-acesso.infoconv.receita.fazenda.gov.br/ws/cpf_atendimento/"><pTipoOperacao>1</pTipoOperacao><pCPF></pCPF><pDataNascimento>19980303</pDataNascimento><pTituloEleitor>244614440108</pTituloEleitor><pMotivoAusenciaTituloEleitor></pMotivoAusenciaTituloEleitor><pSexo>1</pSexo><pCodMunicipioNaturalidade>1</pCodMunicipioNaturalidade><pNomeMunicipioNaturalidade></pNomeMunicipioNaturalidade><pUFNaturalidade>AC</pUFNaturalidade><pCEP>88168195</pCEP><pLogradouro>A</pLogradouro><pNumeroLogradouro>22</pNumeroLogradouro><pComplemento></pComplemento><pBairro>SAO MIGUEL</pBairro><pCodMunicipioDomiciliar>8544</pCodMunicipioDomiciliar><pUFDomiciliar>SC</pUFDomiciliar><pTelefone>986200350</pTelefone><pCelular></pCelular><pDDD>21</pDDD><pAgencia>7390</pAgencia><pNomeContribuinte>teste dia trinta</pNomeContribuinte><pNomeMae>teste dia trinta</pNomeMae><pIndAlterarNomeMae></pIndAlterarNomeMae><pCPFResponsavelLegal></pCPFResponsavelLegal><pDataPreenchimento>20260630</pDataPreenchimento><pCPFResponsavelAtendimento>19539167752</pCPFResponsavelAtendimento><pUsoConveniado></pUsoConveniado><pIdConveniado_NumProtocolo></pIdConveniado_NumProtocolo><pRemessaOriginal></pRemessaOriginal><pFlagConclusao>S</pFlagConclusao></EfetivacaoAtendimentoCPF>
2026-07-06T10:13:08.208-03:00 ERROR 8 --- [nio-8080-exec-7] b.c.g.s.a.s.impl.ReceitaFederalService   : Erro na chamada para Receita Federal - EfetivacaoAtendimentoCPF: Forbidden [403]

org.springframework.ws.client.WebServiceTransportException: Forbidden [403]
	at org.springframework.ws.client.core.WebServiceTemplate.handleError(WebServiceTemplate.java:666) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.doSendAndReceive(WebServiceTemplate.java:588) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.sendAndReceive(WebServiceTemplate.java:539) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.doSendAndReceive(WebServiceTemplate.java:493) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.sendSourceAndReceiveToResult(WebServiceTemplate.java:442) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.sendSourceAndReceiveToResult(WebServiceTemplate.java:434) ~[spring-ws-core-4.0.6.jar!/:na]
	at br.caixa.gov.sicpf.atendimento.service.impl.ReceitaFederalService.efetivacaoAtendimentoCPF(ReceitaFederalService.java:159) ~[!/:0.0.1-SNAPSHOT]
	at br.caixa.gov.sicpf.atendimento.service.impl.AtendimentoService.concluirAtendimento(AtendimentoService.java:108) ~[!/:0.0.1-SNAPSHOT]
	at br.caixa.gov.sicpf.atendimento.rest.AtendimentoController.concluirAtendimento(AtendimentoController.java:70) ~[!/:0.0.1-SNAPSHOT]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:359) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:190) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:158) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.security.authorization.method.AuthorizationManagerBeforeMethodInterceptor.proceed(AuthorizationManagerBeforeMethodInterceptor.java:271) ~[spring-security-core-7.0.5.jar!/:7.0.5]
	at org.springframework.security.authorization.method.AuthorizationManagerBeforeMethodInterceptor.attemptAuthorization(AuthorizationManagerBeforeMethodInterceptor.java:266) ~[spring-security-core-7.0.5.jar!/:7.0.5]
	at org.springframework.security.authorization.method.AuthorizationManagerBeforeMethodInterceptor.invoke(AuthorizationManagerBeforeMethodInterceptor.java:197) ~[spring-security-core-7.0.5.jar!/:7.0.5]
	at org.springframework.security.config.annotation.method.configuration.DeferringMethodInterceptor.invoke(DeferringMethodInterceptor.java:44) ~[spring-security-config-7.0.5.jar!/:7.0.5]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:719) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at br.caixa.gov.sicpf.atendimento.rest.AtendimentoController$$SpringCGLIB$$0.concluirAtendimento(<generated>) ~[!/:0.0.1-SNAPSHOT]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:252) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:184) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:934) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:853) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:86) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:866) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1000) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.FrameworkServlet.doPut(FrameworkServlet.java:914) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:650) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:874) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:710) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:128) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53) ~[tomcat-embed-websocket-11.0.21.jar!/:na]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.CompositeFilter$VirtualFilterChain.doFilter(CompositeFilter.java:108) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.FilterChainProxy.lambda$doFilterInternal$3(FilterChainProxy.java:235) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$FilterObservation$SimpleFilterObservation.lambda$wrap$1(ObservationFilterChainDecorator.java:493) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$AroundFilterObservation$SimpleAroundFilterObservation.lambda$wrap$1(ObservationFilterChainDecorator.java:354) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator.lambda$wrapSecured$0(ObservationFilterChainDecorator.java:86) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:132) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.access.intercept.AuthorizationFilter.doFilter(AuthorizationFilter.java:101) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.access.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:126) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.access.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:120) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.session.SessionManagementFilter.doFilter(SessionManagementFilter.java:132) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.session.SessionManagementFilter.doFilter(SessionManagementFilter.java:86) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.AnonymousAuthenticationFilter.doFilter(AnonymousAuthenticationFilter.java:100) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter.doFilter(SecurityContextHolderAwareRequestFilter.java:181) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.savedrequest.RequestCacheAwareFilter.doFilter(RequestCacheAwareFilter.java:63) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.AuthenticationFilter.doFilterInternal(AuthenticationFilter.java:194) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.oauth2.server.resource.web.authentication.BearerTokenAuthenticationFilter.doFilterInternal(BearerTokenAuthenticationFilter.java:207) ~[spring-security-oauth2-resource-server-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.oauth2.server.resource.web.OAuth2ProtectedResourceMetadataFilter.doFilterInternal(OAuth2ProtectedResourceMetadataFilter.java:97) ~[spring-security-oauth2-resource-server-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.logout.LogoutFilter.doFilter(LogoutFilter.java:110) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.logout.LogoutFilter.doFilter(LogoutFilter.java:96) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.CorsFilter.doFilterInternal(CorsFilter.java:91) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.header.HeaderWriterFilter.doHeadersAfter(HeaderWriterFilter.java:90) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.header.HeaderWriterFilter.doFilterInternal(HeaderWriterFilter.java:75) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.context.SecurityContextHolderFilter.doFilter(SecurityContextHolderFilter.java:82) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.context.SecurityContextHolderFilter.doFilter(SecurityContextHolderFilter.java:69) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter.doFilterInternal(WebAsyncManagerIntegrationFilter.java:62) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.session.DisableEncodeUrlFilter.doFilterInternal(DisableEncodeUrlFilter.java:42) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$AroundFilterObservation$SimpleAroundFilterObservation.lambda$wrap$0(ObservationFilterChainDecorator.java:337) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:228) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.FilterChainProxy.doFilterInternal(FilterChainProxy.java:237) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.FilterChainProxy.doFilter(FilterChainProxy.java:195) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.CompositeFilter$VirtualFilterChain.doFilter(CompositeFilter.java:113) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.ServletRequestPathFilter.doFilter(ServletRequestPathFilter.java:52) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.CompositeFilter$VirtualFilterChain.doFilter(CompositeFilter.java:113) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.CompositeFilter.doFilter(CompositeFilter.java:74) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$CompositeFilterChainProxy.doFilter(WebSecurityConfiguration.java:317) ~[spring-security-config-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.DelegatingFilterProxy.invokeDelegate(DelegatingFilterProxy.java:355) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.DelegatingFilterProxy.doFilter(DelegatingFilterProxy.java:272) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.ServerHttpObservationFilter.doFilterInternal(ServerHttpObservationFilter.java:110) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:199) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:165) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:77) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:492) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:113) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:83) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:72) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.valves.RemoteIpValve.invoke(RemoteIpValve.java:685) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:341) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:397) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:903) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1801) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:946) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:480) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:57) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at java.base/java.lang.Thread.run(Thread.java:1583) ~[na:na]

2026-07-06T10:13:08.214-03:00 ERROR 8 --- [nio-8080-exec-7] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: java.lang.RuntimeException: Erro ao efetivar atendimento CPF: Forbidden [403]] with root cause

org.springframework.ws.client.WebServiceTransportException: Forbidden [403]
	at org.springframework.ws.client.core.WebServiceTemplate.handleError(WebServiceTemplate.java:666) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.doSendAndReceive(WebServiceTemplate.java:588) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.sendAndReceive(WebServiceTemplate.java:539) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.doSendAndReceive(WebServiceTemplate.java:493) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.sendSourceAndReceiveToResult(WebServiceTemplate.java:442) ~[spring-ws-core-4.0.6.jar!/:na]
	at org.springframework.ws.client.core.WebServiceTemplate.sendSourceAndReceiveToResult(WebServiceTemplate.java:434) ~[spring-ws-core-4.0.6.jar!/:na]
	at br.caixa.gov.sicpf.atendimento.service.impl.ReceitaFederalService.efetivacaoAtendimentoCPF(ReceitaFederalService.java:159) ~[!/:0.0.1-SNAPSHOT]
	at br.caixa.gov.sicpf.atendimento.service.impl.AtendimentoService.concluirAtendimento(AtendimentoService.java:108) ~[!/:0.0.1-SNAPSHOT]
	at br.caixa.gov.sicpf.atendimento.rest.AtendimentoController.concluirAtendimento(AtendimentoController.java:70) ~[!/:0.0.1-SNAPSHOT]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:359) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:190) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:158) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.security.authorization.method.AuthorizationManagerBeforeMethodInterceptor.proceed(AuthorizationManagerBeforeMethodInterceptor.java:271) ~[spring-security-core-7.0.5.jar!/:7.0.5]
	at org.springframework.security.authorization.method.AuthorizationManagerBeforeMethodInterceptor.attemptAuthorization(AuthorizationManagerBeforeMethodInterceptor.java:266) ~[spring-security-core-7.0.5.jar!/:7.0.5]
	at org.springframework.security.authorization.method.AuthorizationManagerBeforeMethodInterceptor.invoke(AuthorizationManagerBeforeMethodInterceptor.java:197) ~[spring-security-core-7.0.5.jar!/:7.0.5]
	at org.springframework.security.config.annotation.method.configuration.DeferringMethodInterceptor.invoke(DeferringMethodInterceptor.java:44) ~[spring-security-config-7.0.5.jar!/:7.0.5]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:719) ~[spring-aop-7.0.7.jar!/:7.0.7]
	at br.caixa.gov.sicpf.atendimento.rest.AtendimentoController$$SpringCGLIB$$0.concluirAtendimento(<generated>) ~[!/:0.0.1-SNAPSHOT]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:252) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:184) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:934) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:853) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:86) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:866) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1000) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at org.springframework.web.servlet.FrameworkServlet.doPut(FrameworkServlet.java:914) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:650) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:874) ~[spring-webmvc-7.0.7.jar!/:7.0.7]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:710) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:128) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53) ~[tomcat-embed-websocket-11.0.21.jar!/:na]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.CompositeFilter$VirtualFilterChain.doFilter(CompositeFilter.java:108) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.FilterChainProxy.lambda$doFilterInternal$3(FilterChainProxy.java:235) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$FilterObservation$SimpleFilterObservation.lambda$wrap$1(ObservationFilterChainDecorator.java:493) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$AroundFilterObservation$SimpleAroundFilterObservation.lambda$wrap$1(ObservationFilterChainDecorator.java:354) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator.lambda$wrapSecured$0(ObservationFilterChainDecorator.java:86) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:132) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.access.intercept.AuthorizationFilter.doFilter(AuthorizationFilter.java:101) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.access.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:126) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.access.ExceptionTranslationFilter.doFilter(ExceptionTranslationFilter.java:120) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.session.SessionManagementFilter.doFilter(SessionManagementFilter.java:132) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.session.SessionManagementFilter.doFilter(SessionManagementFilter.java:86) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.AnonymousAuthenticationFilter.doFilter(AnonymousAuthenticationFilter.java:100) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter.doFilter(SecurityContextHolderAwareRequestFilter.java:181) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.savedrequest.RequestCacheAwareFilter.doFilter(RequestCacheAwareFilter.java:63) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.AuthenticationFilter.doFilterInternal(AuthenticationFilter.java:194) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.oauth2.server.resource.web.authentication.BearerTokenAuthenticationFilter.doFilterInternal(BearerTokenAuthenticationFilter.java:207) ~[spring-security-oauth2-resource-server-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.oauth2.server.resource.web.OAuth2ProtectedResourceMetadataFilter.doFilterInternal(OAuth2ProtectedResourceMetadataFilter.java:97) ~[spring-security-oauth2-resource-server-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.logout.LogoutFilter.doFilter(LogoutFilter.java:110) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.authentication.logout.LogoutFilter.doFilter(LogoutFilter.java:96) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.CorsFilter.doFilterInternal(CorsFilter.java:91) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.header.HeaderWriterFilter.doHeadersAfter(HeaderWriterFilter.java:90) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.header.HeaderWriterFilter.doFilterInternal(HeaderWriterFilter.java:75) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.context.SecurityContextHolderFilter.doFilter(SecurityContextHolderFilter.java:82) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.context.SecurityContextHolderFilter.doFilter(SecurityContextHolderFilter.java:69) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter.doFilterInternal(WebAsyncManagerIntegrationFilter.java:62) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:231) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.session.DisableEncodeUrlFilter.doFilterInternal(DisableEncodeUrlFilter.java:42) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.wrapFilter(ObservationFilterChainDecorator.java:244) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$AroundFilterObservation$SimpleAroundFilterObservation.lambda$wrap$0(ObservationFilterChainDecorator.java:337) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$ObservationFilter.doFilter(ObservationFilterChainDecorator.java:228) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.ObservationFilterChainDecorator$VirtualFilterChain.doFilter(ObservationFilterChainDecorator.java:141) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.FilterChainProxy.doFilterInternal(FilterChainProxy.java:237) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.security.web.FilterChainProxy.doFilter(FilterChainProxy.java:195) ~[spring-security-web-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.CompositeFilter$VirtualFilterChain.doFilter(CompositeFilter.java:113) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.ServletRequestPathFilter.doFilter(ServletRequestPathFilter.java:52) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.CompositeFilter$VirtualFilterChain.doFilter(CompositeFilter.java:113) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.CompositeFilter.doFilter(CompositeFilter.java:74) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration$CompositeFilterChainProxy.doFilter(WebSecurityConfiguration.java:317) ~[spring-security-config-7.0.5.jar!/:7.0.5]
	at org.springframework.web.filter.DelegatingFilterProxy.invokeDelegate(DelegatingFilterProxy.java:355) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.DelegatingFilterProxy.doFilter(DelegatingFilterProxy.java:272) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.ServerHttpObservationFilter.doFilterInternal(ServerHttpObservationFilter.java:110) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:199) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-7.0.7.jar!/:7.0.7]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:107) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:165) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:77) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:492) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:113) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:83) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:72) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.valves.RemoteIpValve.invoke(RemoteIpValve.java:685) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:341) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:397) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:903) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1801) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:946) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:480) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:57) ~[tomcat-embed-core-11.0.21.jar!/:na]
	at java.base/java.lang.Thread.run(Thread.java:1583) ~[na:na]

2026-07-06T10:13:08.266-03:00 DEBUG 8 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : Securing GET /error
2026-07-06T10:13:08.267-03:00 DEBUG 8 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : Secured GET /error
