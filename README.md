
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=<DS>:test-connection-in-pool"

{
    "outcome" => "failed",
    "failure-description" => "WFLYCTL0216: O recurso de gerenciamento '[
    (\"subsystem\" => \"datasources\"),
    (\"data-source\" => \"<DS>\")
]' não foi encontrado",
    "rolled-back" => true
}
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=simkt-ds:test-connection-in-pool"
{
    "outcome" => "success",
    "result" => [true]
}
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=siico-mkt-ds:test-connection-in-pool"
{
    "outcome" => "success",
    "result" => [true]
}
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=simkt-ds:read-attribute(name=connection-url)"
{
    "outcome" => "success",
    "result" => "jdbc:postgresql://10.116.93.221:51151/MKTDB001"
}
-sh-4.2$
-sh-4.2$
-sh-4.2$ /opt/jboss-eap/bin/jboss-cli.sh -c --command="/subsystem=datasources/data-source=siico-mkt-ds:read-attribute(name=connection-url)"
{
    "outcome" => "success",
    "result" => "jdbc:postgresql://10.116.93.221:51151/posdes151"
}
-sh-4.2$
-sh-4.2$
-sh-4.2$ zgrep -iE "ERROR|WARN|privilege|siico|WFLYJCA|WFLYSRV0010|WFLYSRV0025|Started|Exception" \
>  /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-08.gz \
>   | grep -v KeycloakSecurityContext | grep -v "^\s*at " | head -80
2026-10-08 10:23:26,989 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-08 10:23:26,991 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:26,991 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-08 10:23:26,991 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:26,992 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-16) UserDetails: UserDetails(id=d48aedbb-a650-4a7f-8a58-47104de91570, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:26,992 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-16) GET "/simkt/api/v1/privilege?bi=true", parameters={masked}
2026-10-08 10:23:26,993 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-16) Mapped to br.gov.caixa.pedes.sistemas.simkt.controller.PrivilegeController#listPrivileges()
2026-10-08 10:23:26,997 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor] (default task-16) Writing [[PrivilegeDTO(name=MENSAGERIA_ADMINISTRADOR, roles=[MKT_ADMINISTRADOR, MKT_MATRIZ]), PrivilegeDTO(na (truncated)...]
2026-10-08 10:23:27,356 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,356 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,356 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-16) UserDetails: UserDetails(id=d48aedbb-a650-4a7f-8a58-47104de91570, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:27,357 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,357 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,399 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,399 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,399 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-8) UserDetails: UserDetails(id=d48aedbb-a650-4a7f-8a58-47104de91570, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:27,400 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,400 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,404 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-18) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,404 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-18) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,404 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-18) UserDetails: UserDetails(id=d48aedbb-a650-4a7f-8a58-47104de91570, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:27,408 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-19) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,408 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-19) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,408 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-19) UserDetails: UserDetails(id=d48aedbb-a650-4a7f-8a58-47104de91570, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:27,438 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,438 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,451 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:27,451 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,174 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-08 10:23:36,174 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,174 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) ServletRequestAttributes: HttpServletRequestImpl [ GET /simkt/api/v1/privilege ]
2026-10-08 10:23:36,174 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,174 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-8) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,174 DEBUG [org.springframework.web.servlet.DispatcherServlet] (default task-8) GET "/simkt/api/v1/privilege?bi=true", parameters={masked}
2026-10-08 10:23:36,174 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping] (default task-8) Mapped to br.gov.caixa.pedes.sistemas.simkt.controller.PrivilegeController#listPrivileges()
2026-10-08 10:23:36,175 DEBUG [org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor] (default task-8) Writing [[PrivilegeDTO(name=MENSAGERIA_ADMINISTRADOR, roles=[MKT_ADMINISTRADOR, MKT_MATRIZ]), PrivilegeDTO(na (truncated)...]
2026-10-08 10:23:36,281 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,281 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,281 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-8) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,282 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,282 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,286 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,286 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-16) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,287 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,307 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,307 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,391 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,392 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,392 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-16) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,392 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,393 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,417 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,418 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,423 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,423 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-16) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,423 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-16) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,424 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,424 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,424 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-8) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,431 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-18) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,431 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-18) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,431 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-18) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,434 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-19) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,434 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-19) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,434 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-19) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,502 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,502 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,502 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-8) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,510 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-19) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,510 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-19) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,510 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-19) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:36,826 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,826 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:36,826 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-8) UserDetails: UserDetails(id=d48aedbb-a650-4a7f-8a58-47104de91570, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:39,680 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:39,680 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:39,680 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.PrivilegeService] (default task-8) UserDetails: UserDetails(id=dbc624f0-e43d-4582-bc23-f5c83d7512e2, userName=C891770, email=null, firstName=USER C078608 CESOB, lastName=USER C078608 CESOB, roles=[CMB_ADMINISTRADOR, offline_access, AUD0024, CPU_ATEND_GESTOR, GOT_UNIDADES_GERAL, MKT_ADMINISTRADOR, uma_authorization], issuedFor=cli-web-mkt)
2026-10-08 10:23:39,681 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:39,681 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
2026-10-08 10:23:39,700 INFO  [br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.SSOAuthenticationService] (default task-8) RequestAttributes: errorPageFilter.FILTERED
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ for f in /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-0*.gz; do
>   echo "== $f: $(zgrep -c 'PrivilegeRepository.findByUriAndHttpMethod' $f)"
> done
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-01.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-02.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-03.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-04.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-05.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-06.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-07.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-08.gz: 0
== /logs/jboss/jboss-eap/standalone/simkt-backend-vm/server.log.2026-10-09.gz: 30
-sh-4.2$
