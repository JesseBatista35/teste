
[p585600@caddeapllx2871 ~]$ sudo su
[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
Sinto muito, tente novamente.
[sudo] senha para p585600:
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]#
[root@caddeapllx2871 p585600]# cd /opt/jboss-eap/standalone/deployments
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# ls -l gec-ear.ear*
-rwxrw-rw- 1 jboss jboss 101409425 nov 18 09:53 gec-ear.ear
-rw-r--r-- 1 jboss jboss     38755 nov 18 09:53 gec-ear.ear.failed
-rw-r--r-- 1 jboss jboss        11 nov 18 09:59 gec-ear.ear.isdeploying
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# echo "=== arqref no war ==="
unzip -l gec-ear.ear | grep "gec-web.war"
unzip -p gec-ear.ear gec-web.war > /tmp/gw.war
unzip -l /tmp/gw.war | grep -i "arqref"
=== arqref no war ===
 18950092  11-18-2026 09:42   gec-web.war
  1222180  11-17-2026 10:51   WEB-INF/lib/arqref-services-3.31.0.jar
   142073  11-17-2026 10:51   WEB-INF/lib/arqref-business-2.16.1.jar
   235509  11-17-2026 10:51   WEB-INF/lib/arqref-core-3.7.2.2.jar
     5076  11-17-2026 10:51   WEB-INF/lib/arqref-web-3.1.0.1.jar
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# echo "=== arqref no war ==="
unzip -l gec-ear.ear | grep "gec-web.war"
unzip -p gec-ear.ear gec-web.war > /tmp/gw.war
unzip -l /tmp/gw.war | grep -i "arqref"
=== arqref no war ===
 18950092  11-18-2026 09:42   gec-web.war
  1222180  11-17-2026 10:51   WEB-INF/lib/arqref-services-3.31.0.jar
   142073  11-17-2026 10:51   WEB-INF/lib/arqref-business-2.16.1.jar
   235509  11-17-2026 10:51   WEB-INF/lib/arqref-core-3.7.2.2.jar
     5076  11-17-2026 10:51   WEB-INF/lib/arqref-web-3.1.0.1.jar
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
^C
[root@caddeapllx2871 deployments]# echo "=== causa no .failed ==="
head -c 3000 gec-ear.ear.failed
=== causa no .failed ===
"{\"WFLYCTL0080: Falha de serviços\" => {\"jboss.deployment.unit.\\\"gec-ear.ear\\\".WeldStartService\" => \"Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: Exception List with 17 exceptions:
Exception 0 :
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ExportaArquivoUtil with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.desenrola.rest.RelatorioFeeQuitacaoRest.exportaArquivoUtil
  at br.gov.caixa.desenrola.rest.RelatorioFeeQuitacaoRest.exportaArquivoUtil(RelatorioFeeQuitacaoRest.java:0)
WELD-001474: Class br.gov.caixa.sigec.util.ExportaArquivoUtil is on the classpath, but was ignored because a class it references was not found: org.apache.poi.xssf.usermodel.XSSFWorkbook from [Module \\\"deployment.gec-ear.ear.gec-web.war\\\" from Service Module Loader].

        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bootstrap.Validator.validateInjectionPointForDeploymentProblems(Validator.java:378)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bootstrap.Validator.validateInjectionPoint(Validator.java:290)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bootstrap.Validator.validateGeneralBean(Validator.java:143)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bootstrap.Validator.validateRIBean(Validator.java:164)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bootstrap.Validator.validateBean(Validator.java:526)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bootstrap.ConcurrentValidator$1.doWork(ConcurrentValidator.java:64)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.bootstrap.ConcurrentValidator$1.doWork(ConcurrentValidator.java:62)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:62)
        at org.jboss.weld.core@3.1.10.Final-redhat-00001//org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:55)
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
        at java.base/java.lang.Thread.run(Thread.java:840)
        at org.jboss.threads@2.4.0.Final-redhat-00001//org.jboss.threads.JBossThread.run(JBossThread.java:513)
Exception 1 :
org.jboss.weld.exceptions.DeploymentException: WELD-001408: Unsatisfied dependencies for type ExportaArquivoUtil with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject private br.gov.caixa.sigec.rest.ManterTEDRest.exportaArquivoUtil
  at br.gov.caixa.sigec.rest.ManterTEDRest.exportaArquivoUtil(ManterTEDRest.java:0)
WELD-001474: Class br.gov.caixa.sigec.util.ExportaArquivoUtil is on the classpath, but was ignored because a class it references wa[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# echo "=== log da subida das 09:53 ==="
L=/logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log
=== log da subida das 09:53 ===
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# grep -n "09:5[3-9].*\(WFLYCTL0013\|WFLYSRV0153\|Caused by\|ClassNotFound\|NoClassDef\)" $L | head -20
3954:2026-11-18 09:53:36,748 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"gec-ear.ear\".WeldStartService" => "Failed to start service
4307:2026-11-18 09:53:38,092 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 1) WFLYCTL0013: Falha na operação ("read-attribute") - endereço ([
7489:2026-11-18 09:59:44,396 ERROR [org.jboss.as.controller.management-operation] (Controller Boot Thread) WFLYCTL0013: Falha na operação ("deploy") - endereço ([("deployment" => "gec-ear.ear")]) - falha na descrição: {"WFLYCTL0080: Falha de serviços" => {"jboss.deployment.unit.\"gec-ear.ear\".WeldStartService" => "Failed to start service
7842:2026-11-18 09:59:45,520 ERROR [org.jboss.as.controller.management-operation] (ServerService Thread Pool -- 44) WFLYCTL0013: Falha na operação ("read-attribute") - endereço ([
[root@caddeapllx2871 deployments]#
