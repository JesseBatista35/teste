[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /]
[domain@10.116.89.0:9999 /] grep -nE "deploy|WFLYDC|WFLYCTL|SIGEC-PORTABILIDADE-BATCH" /opt/jboss/jboss-eap/domain/log/host-controller.log | tail -40
'40' is not a valid parameter name.
[domain@10.116.89.0:9999 /]




[root@sbrdeapllx104 p585600]# LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
[root@sbrdeapllx104 p585600]# ls -lt $(dirname $LOG) | head
total 1985704
-rw-rw-r-- 1 jboss jboss    738836 Out 22 14:26 server.log
-rw-rw-r-- 1 jboss jboss 100217582 Out 22 14:26 sigec.log
-rw-rw-r-- 1 jboss jboss  20971552 Out 22 14:23 server.log.1
-rw-rw-r-- 1 jboss jboss  21214943 Out 22 13:20 server.log.2
-rw-rw-r-- 1 jboss jboss  21103757 Out 22 12:35 server.log.3
-rw-rw-r-- 1 jboss jboss 210368054 Out 21 23:59 sigec.log.2026-10-21
-rw-rw-r-- 1 jboss jboss  96208584 Out 20 23:59 sigec.log.2026-10-20
-rw-rw-r-- 1 jboss jboss  20285276 Out 19 23:59 sigec.log.2026-10-19
-rw-rw-r-- 1 jboss jboss  20936000 Out 16 01:33 server.log.2026-10-16
[root@sbrdeapllx104 p585600]# grep -niE "stopped|WFLYSRV0028|WFLYSRV0010|WFLYCTL0013|deploy" $LOG | tail -40
770:    at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1007:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1066:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1138:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1375:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1434:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1506:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1743:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1802:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
1874:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2111:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2170:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2242:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2489:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2548:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2620:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2857:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2916:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
2988:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3226:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3286:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3355:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3586:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3646:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3715:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
3946:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4006:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4075:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4306:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4366:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4435:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4666:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4726:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
4795:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5026:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5086:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5155:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5386:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5446:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
5515:   at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
[root@sbrdeapllx104 p585600]# grep -nE "ACTC403|WFLYEJB0241|WFLYEJB0043|OutOfMemory|native thread" $LOG | tail -30
77:2026-10-22 14:24:00,847INFO (EJB default - 6)Verificando calendario envio FEBRABAN - ACTC403
78:2026-10-22 14:24:00,848INFO (EJB default - 6)Verificando existencia de portabilidades tipo ACTC403
80:2026-10-22 14:24:00,872INFO (EJB default - 6)Gerando XML ACTC403
84:2026-10-22 14:24:00,894INFO (EJB default - 6)XML ACTC403 não possui portabilidades para envio.
85:2026-10-22 14:24:00,895INFO (EJB default - 6)XML ACTC403 gerado com sucesso!
454:2026-10-22 14:25:00,650INFO (EJB default - 2)Verificando calendario envio FEBRABAN - ACTC403
455:2026-10-22 14:25:00,651INFO (EJB default - 2)Verificando existencia de portabilidades tipo ACTC403
457:2026-10-22 14:25:00,671INFO (EJB default - 2)Gerando XML ACTC403
461:2026-10-22 14:25:00,694INFO (EJB default - 2)XML ACTC403 não possui portabilidades para envio.
462:2026-10-22 14:25:00,694INFO (EJB default - 2)XML ACTC403 gerado com sucesso!
5934:2026-10-22 14:26:00,976INFO (EJB default - 9)Verificando calendario envio FEBRABAN - ACTC403
5935:2026-10-22 14:26:00,977INFO (EJB default - 9)Verificando existencia de portabilidades tipo ACTC403
5937:2026-10-22 14:26:01,045INFO (EJB default - 9)Gerando XML ACTC403
5941:2026-10-22 14:26:01,070INFO (EJB default - 9)XML ACTC403 não possui portabilidades para envio.
5942:2026-10-22 14:26:01,070INFO (EJB default - 9)XML ACTC403 gerado com sucesso!
[root@sbrdeapllx104 p585600]# ss -tnp | grep "pid=72951" | grep -cE "10.252.32.6[35]:80"
191
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
[root@sbrdeapllx104 p585600]# D=$(dirname $LOG)
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# LOG=/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# grep -h "Caused by" $LOG | sort | uniq -c | sort -rn | head -15
[root@sbrdeapllx104 p585600]# grep -E " ERROR " $LOG | cut -c24- | cut -c1-200 | sort | uniq -c | sort -rn | head -15
[root@sbrdeapllx104 p585600]# sed -n '735,775p' $LOG
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.doMethodInterception(Jsr299BindingsInterceptor.java:90)
        at org.jboss.as.weld.interceptors.Jsr299BindingsInterceptor.processInvocation(Jsr299BindingsInterceptor.java:101)
        at org.jboss.as.ee.component.interceptors.UserInterceptorFactory$1.processInvocation(UserInterceptorFactory.java:63)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.invocationmetrics.ExecutionTimeInterceptor.processInvocation(ExecutionTimeInterceptor.java:43) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.jpa.interceptor.SBInvocationInterceptor.processInvocation(SBInvocationInterceptor.java:47) [wildfly-jpa-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ee.concurrent.ConcurrentContextInterceptor.processInvocation(ConcurrentContextInterceptor.java:45) [wildfly-ee-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InitialInterceptor.processInvocation(InitialInterceptor.java:40)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.ChainedInterceptor.processInvocation(ChainedInterceptor.java:53)
        at org.jboss.as.ee.component.interceptors.ComponentDispatcherInterceptor.processInvocation(ComponentDispatcherInterceptor.java:52)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.pool.PooledInstanceInterceptor.processInvocation(PooledInstanceInterceptor.java:51) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.AdditionalSetupInterceptor.processInvocation(AdditionalSetupInterceptor.java:54) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.invokeInNoTx(CMTTxInterceptor.java:264) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.notSupported(CMTTxInterceptor.java:313) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.as.ejb3.tx.CMTTxInterceptor.processInvocation(CMTTxInterceptor.java:238) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.invocation.InterceptorContext$Invocation.proceed(InterceptorContext.java:509)
        at org.jboss.weld.ejb.AbstractEJBRequestScopeActivationInterceptor.aroundInvoke(AbstractEJBRequestScopeActivationInterceptor.java:64) [weld-core-impl-2.4.7.Final-redhat-1.jar:2.4.7.Final-redhat-1]
        at org.jboss.as.weld.ejb.EjbRequestScopeActivationInterceptor.processInvocation(EjbRequestScopeActivationInterceptor.java:89)
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.CurrentInvocationContextInterceptor.processInvocation(CurrentInvocationContextInterceptor.java:41) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.invocationmetrics.WaitTimeInterceptor.processInvocation(WaitTimeInterceptor.java:47) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.security.SecurityContextInterceptor.processInvocation(SecurityContextInterceptor.java:100) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.deployment.processors.StartupAwaitInterceptor.processInvocation(StartupAwaitInterceptor.java:22) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.ShutDownInterceptorFactory$1.processInvocation(ShutDownInterceptorFactory.java:64) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
        at org.jboss.as.ejb3.component.interceptors.LoggingInterceptor.processInvocation(LoggingInterceptor.java:67) [wildfly-ejb3-7.1.6.GA-redhat-00002.jar:7.1.6.GA-redhat-00002]
        at org.jboss.invocation.InterceptorContext.proceed(InterceptorContext.java:422)
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# grep -nE "WFLYSRV0027|WFLYSRV0028|WFLYSRV0009|WFLYSRV0010|WFLYSRV0016|WFLYSRV0013|WFLYCTL|stopped" $D/server.log.2 $D/server.log.1 | head -60
/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log.1:27179:2026-10-22 13:48:49,226INFO (MSC service thread 1-7)WFLYSRV0028: Implantação encerrada SIGEC-PORTABILIDADE-BATCH (runtime-name: gec-4.53.2batch-b1506.ear) em 1327ms
/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log.1:27181:2026-10-22 13:48:49,527INFO (ServerService Thread Pool -- 302)WFLYSRV0009: Desimplantado "SIGEC-PORTABILIDADE-BATCH" (runtime-name: "gec-4.53.2batch-b1506.ear")
/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log.1:27182:2026-10-22 13:48:53,272INFO (MSC service thread 1-8)WFLYSRV0027: Iniciando a implantação do "SIGEC-PORTABILIDADE-BATCH" (runtime-name: "gec-4.53.2batch.build.1-b1510.ear")
/opt/jboss/jboss-eap/hc/log/servers/sigec-portabilidade-batch_node1_lx104/server.log.1:28821:2026-10-22 13:49:04,073INFO (ServerService Thread Pool -- 302)WFLYSRV0010: Implantado "SIGEC-PORTABILIDADE-BATCH" (runtime-name: "gec-4.53.2batch.build.1-b1510.ear")
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# date; ss -tnp | grep "pid=72951" | grep -cE "10.252.32.6[35]:80"
Qui Out 22 14:30:16 -03 2026
234
[root@sbrdeapllx104 p585600]# ss -tnp | grep "pid=72951" | awk '{print $4}' | sort | uniq -c | sort -rn | head
      8 10.116.94.211:8859
      1 127.0.0.1:53737
      1 127.0.0.1:33093
      1 10.116.94.211:60356
      1 10.116.94.211:60354
      1 10.116.94.211:60352
      1 10.116.94.211:60350
      1 10.116.94.211:60348
      1 10.116.94.211:60346
      1 10.116.94.211:60344
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
