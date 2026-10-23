
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs sicow-penhor-okd-des-64-c7wx4 -n sicow-des --since=3m | grep -viE "TelemetryPipeline|applicationinsights" | tail -60
2026-10-23 11:23:36,552 WARN  [org.jboss.weld.Conversation] (default task-2) WELD-000335: Conversation context is already active, most likely it was not cleaned up properly during previous request processing: HttpServletRequestImpl [ GET /sicowpenhor/pages/home.cef/login ]
2026-10-23 11:23:36,553 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-2) false
2026-10-23 11:23:36,555 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-2) false
2026-10-23 11:23:36,557 WARN  [org.jboss.weld.Servlet] (default task-2) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@37469693 when destroying request HttpServletRequestImpl [ GET /sicowpenhor/login.cef ]
2026-10-23 11:24:33,406 WARN  [org.jboss.weld.Conversation] (default task-2) WELD-000335: Conversation context is already active, most likely it was not cleaned up properly during previous request processing: HttpServletRequestImpl [ GET /sicowpenhor/ ]
2026-10-23 11:24:33,485 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-2) false
2026-10-23 11:24:33,486 INFO  [br.gov.caixa.pr.sicow.portal.login.phaseListener.SicowLoginHttpsPhaseListener] (default task-2) false
2026-10-23 11:24:33,488 WARN  [org.jboss.weld.Servlet] (default task-2) WELD-000717: Unable to deactivate context org.jboss.weld.module.web.context.http.LazyHttpConversationContextImpl@37469693 when destroying request HttpServletRequestImpl [ GET /sicowpenhor/login.cef ]
2026-10-23 11:24:50,427 WARN  [org.jboss.weld.Conversation] (default task-2) WELD-000335: Conversation context is already active, most likely it was not cleaned up properly during previous request processing: HttpServletRequestImpl [ GET /sicowpenhor/login ]
2026-10-23 11:24:50,446 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] siusrEndPoint https://des.siusr.proinfo.caixa/siusr-service/SiusrService/SiusrWS.
2026-10-23 11:24:50,447 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] sgSistema SICOWPEN.
2026-10-23 11:24:50,447 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] secretKey null.
2026-10-23 11:24:50,447 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] cpf false.
2026-10-23 11:24:50,447 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] autenticaEndPoint https://des.siusr.proinfo.caixa/siusr-service/AutenticaService/AutenticaWS.
2026-10-23 11:24:50,931 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] Erro ao recuperar a Matriz de Acesso no SIUSR - Login ou Senha Invalido.
2026-10-23 11:24:50,932 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] Autenticacao abortada.
2026-10-23 11:24:50,937 SEVERE [br.gov.caixa.pr.sicow.portal.login.servlet.LoginServlet] (default task-2) UT010031: Login failed
2026-10-23 11:25:04,131 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] siusrEndPoint https://des.siusr.proinfo.caixa/siusr-service/SiusrService/SiusrWS.
2026-10-23 11:25:04,132 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] sgSistema SICOWPEN.
2026-10-23 11:25:04,132 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] secretKey null.
2026-10-23 11:25:04,132 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] cpf false.
2026-10-23 11:25:04,132 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] autenticaEndPoint https://des.siusr.proinfo.caixa/siusr-service/AutenticaService/AutenticaWS.
2026-10-23 11:25:04,200 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] Erro ao recuperar a Matriz de Acesso no SIUSR - Login ou Senha Invalido.
2026-10-23 11:25:04,201 INFO  [CaixaLoginModule] (default task-2) [CaixaLoginModule] Autenticacao abortada.
2026-10-23 11:25:04,201 SEVERE [br.gov.caixa.pr.sicow.portal.login.servlet.LoginServlet] (default task-2) UT010031: Login failed
2026-10-23 11:25:33,567 INFO  [stdout] (AggregatingLogger_aggregating logger-0)  * Received response code 402 (daily quota exceeded and throttled over extended time) (6 times)
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
