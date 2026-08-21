
[root@crjtqapllx003 p585600]# grep -n "ERROR\|Caused by\|Exception" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | tail -30
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# grep -n "Exception" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | wc -l
0
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# grep -n "^at \|^        at " /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | wc -l
0
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# grep -n "WFLYSRV0010\|WFLYSRV0025" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log
480:2026-08-21 03:07:16,400 INFO  [org.jboss.as.server] (Controller Boot Thread), WFLYSRV0010: Deployed "sifpp-ear.ear" (runtime-name : "sifpp-ear.ear")
481:2026-08-21 03:07:16,845 INFO  [org.jboss.as] (Controller Boot Thread), WFLYSRV0025: JBoss EAP 7.0.0.GA (WildFly Core 2.1.2.Final-redhat-1) started in 19171ms - Started 1098 of 1420 services (444 services are lazy, passive or on-demand)
919:2026-08-21 09:22:51,993 INFO  [org.jboss.as.server] (ServerService Thread Pool -- 77), WFLYSRV0010: Deployed "sifpp-ear.ear" (runtime-name : "sifpp-ear.ear")
1427:2026-08-21 10:57:43,758 INFO  [org.jboss.as.server] (Controller Boot Thread), WFLYSRV0010: Deployed "sifpp-ear.ear" (runtime-name : "sifpp-ear.ear")
1428:2026-08-21 10:57:43,812 INFO  [org.jboss.as] (Controller Boot Thread), WFLYSRV0025: JBoss EAP 7.0.0.GA (WildFly Core 2.1.2.Final-redhat-1) started in 7493ms - Started 1098 of 1420 services (444 services are lazy, passive or on-demand)
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# sed -n '1,50p' /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | grep -n "SingletonComponent\|EJBException\|CreateException\|WARN"
14:2026-08-21 03:07:00,100 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 52), WFLYTX0013: Node identifier property is set to the default value. Please make sure it is unique.
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]#
[root@crjtqapllx003 p585600]# grep -n -B 80 "AbstractEJBRequestScopeActivationInterceptor" /infra_app/logs/sifpp/server-crjtqapllx003_sifpp_intra_8080.log | head -40
217-    java:module/PropostaService
218-
219-2026-08-21 03:07:06,424 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5), WFLYEJB0473: JNDI bindings for session bean named 'ContratoService' in deployment unit 'subdeployment "sifpp-ejb.jar" of deployment "sifpp-ear.ear"' are as follows:
220-
221-    java:global/sifpp-ear/sifpp-ejb/ContratoService!br.gov.caixa.sifpp.service.ContratoService
222-    java:app/sifpp-ejb/ContratoService!br.gov.caixa.sifpp.service.ContratoService
223-    java:module/ContratoService!br.gov.caixa.sifpp.service.ContratoService
224-    java:global/sifpp-ear/sifpp-ejb/ContratoService
225-    java:app/sifpp-ejb/ContratoService
226-    java:module/ContratoService
227-
228-2026-08-21 03:07:06,424 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5), WFLYEJB0473: JNDI bindings for session bean named 'DocumentoService' in deployment unit 'subdeployment "sifpp-ejb.jar" of deployment "sifpp-ear.ear"' are as follows:
229-
230-    java:global/sifpp-ear/sifpp-ejb/DocumentoService!br.gov.caixa.sifpp.service.DocumentoService
231-    java:app/sifpp-ejb/DocumentoService!br.gov.caixa.sifpp.service.DocumentoService
232-    java:module/DocumentoService!br.gov.caixa.sifpp.service.DocumentoService
233-    java:global/sifpp-ear/sifpp-ejb/DocumentoService
234-    java:app/sifpp-ejb/DocumentoService
235-    java:module/DocumentoService
236-
237-2026-08-21 03:07:06,424 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5), WFLYEJB0473: JNDI bindings for session bean named 'CobrancaService' in deployment unit 'subdeployment "sifpp-ejb.jar" of deployment "sifpp-ear.ear"' are as follows:
238-
239-    java:global/sifpp-ear/sifpp-ejb/CobrancaService!br.gov.caixa.sifpp.service.CobrancaService
240-    java:app/sifpp-ejb/CobrancaService!br.gov.caixa.sifpp.service.CobrancaService
241-    java:module/CobrancaService!br.gov.caixa.sifpp.service.CobrancaService
242-    java:global/sifpp-ear/sifpp-ejb/CobrancaService
243-    java:app/sifpp-ejb/CobrancaService
244-    java:module/CobrancaService
245-
246-2026-08-21 03:07:06,428 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5), WFLYEJB0473: JNDI bindings for session bean named 'TipoServicoService' in deployment unit 'subdeployment "sifpp-ejb.jar" of deployment "sifpp-ear.ear"' are as follows:
247-
248-    java:global/sifpp-ear/sifpp-ejb/TipoServicoService!br.gov.caixa.sifpp.service.TipoServicoService
249-    java:app/sifpp-ejb/TipoServicoService!br.gov.caixa.sifpp.service.TipoServicoService
250-    java:module/TipoServicoService!br.gov.caixa.sifpp.service.TipoServicoService
251-    java:global/sifpp-ear/sifpp-ejb/TipoServicoService
252-    java:app/sifpp-ejb/TipoServicoService
253-    java:module/TipoServicoService
254-
255-2026-08-21 03:07:06,428 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-5), WFLYEJB0473: JNDI bindings for session bean named 'ConfiguracoesService' in deployment unit 'subdeployment "sifpp-ejb.jar" of deployment "sifpp-ear.ear"' are as follows:
256-
[root@crjtqapllx003 p585600]#
