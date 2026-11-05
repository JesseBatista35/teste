Para o teste do TRACE, siga esta ordem.

1. Ligar (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=TRACE)
/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=TRACE)

2. Testar: peça para abrirem o PJ (Consulta Clientes).

3. Coletar (no 473):

sudo grep -n "org.keycloak" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -vE "PreAuthActionsHandler|AuthenticatedActionsHandler|Policy enforcement" | tail -60

4. Desligar logo em seguida (CLI do 471):

/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)
/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=INFO)

Se preferir esperar a resposta do Pablo sobre como o PJ lê as roles antes de ligar o TRACE, também faz sentido. Aí os passos 1 a 4 ficam para depois.




[p585600@cbrdeapllx473 ~]$ sudo grep -n "org.keycloak" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -vE "PreAuthActionsHandler|AuthenticatedActionsHandler|Policy enforcement" | tail -60
1:09:41:30,250 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
6107:10:10:33,349 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-2) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
17710:10:49:46,536 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 79) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
19484:10:56:21,874 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
24047:10:59:16,646 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-4) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
26749:11:00:36,012 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 74) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
29754:11:01:08,070 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
31849:11:02:47,233 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-2) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
101203:11:46:17,127 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 88) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
102965:11:46:44,439 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
104180:11:47:35,478 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
112107:11:50:52,604 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 89) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
113904:11:51:21,784 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
117777:11:51:33,074 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-2) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
117778:11:51:33,406 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-2) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
123060:12:04:52,898 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-2) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
160328:12:10:30,339 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 173) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
160378:12:11:25,434 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-7) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
191616:12:43:31,578 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 77) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
193367:12:44:35,675 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
194446:12:44:54,318 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-2) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
223278:14:34:32,656 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 70) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
225063:14:35:12,983 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
226144:14:35:56,228 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-2) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
234023:14:38:41,325 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 84) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
235817:14:39:04,247 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
236892:14:39:08,594 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-5) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
244866:14:46:06,914 INFO  [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 72) Using br.gov.caixa.sifec.componentes.seguranca.sso.multitenancy.MultiTenancyConfigResolver to resolve Keycloak configuration on a per-request basis.
245557:14:47:00,573 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
270207:14:53:08,940 INFO  [org.keycloak.adapters.KeycloakDeployment] (default task-1) Loaded URLs from https://login.des.caixa/auth/realms/intranet/.well-known/openid-configuration
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$
[p585600@cbrdeapllx473 ~]$ sudo grep -n "org.keycloak" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -vE "PreAuthActionsHandler|AuthenticatedActionsHandler|Policy enforcement" | tail -60
292407:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292408:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292409:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292410:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292411:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292412:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292413:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292414:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292415:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292416:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292417:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292418:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292419:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292420:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292421:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292422:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292423:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292424:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292425:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292426:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292427:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292428:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292429:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292430:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292431:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292432:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292433:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292434:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292435:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292436:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292437:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292438:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292439:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292440:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292441:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292442:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292443:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292444:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292445:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292446:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292447:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292448:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292449:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292450:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292451:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292452:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292453:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292454:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292455:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292456:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292457:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292458:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292459:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292460:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292461:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292462:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292463:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292464:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292465:15:17:09,608 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
292788:15:17:09,742 TRACE [org.keycloak.adapters.RefreshableKeycloakSecurityContext] (default task-13) checking whether to refresh.
[p585600@cbrdeapllx473 ~]$
