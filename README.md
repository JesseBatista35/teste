
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# cd /opt/jboss-eap/standalone/deployments
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# ls -l --time-style=full-iso
total 126508
-rw-r--r-- 1 jboss jboss     63527 2026-11-16 12:26:02.328892400 -0300 framework.jar
-rw-r--r-- 1 jboss jboss        13 2026-11-16 12:26:02.328000000 -0300 framework.jar.deployed
-rw-r--r-- 1 jboss jboss    129646 2026-11-16 12:26:02.977885029 -0300 framework_sisgd.jar
-rw-r--r-- 1 jboss jboss        19 2026-11-16 12:26:02.977000000 -0300 framework_sisgd.jar.deployed
-rwxrw-rw- 1 jboss jboss 117261762 2026-11-18 11:00:27.328101040 -0300 gec-ear.ear
-rw-r--r-- 1 jboss jboss       623 2026-11-18 11:07:07.391624052 -0300 gec-ear.ear.failed
-rwxrwxr-x 1 jboss jboss      8888 2021-06-23 08:26:28.000000000 -0300 README.txt
-rw-r--r-- 1 jboss jboss  12054106 2026-11-16 12:26:03.811875556 -0300 wmq.jmsra.rar
-rw-r--r-- 1 jboss jboss        13 2026-11-16 12:26:03.811000000 -0300 wmq.jmsra.rar.deployed
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# cat gec-ear.ear.failed | head -c 4000
"{\"WFLYCTL0080: Falha de serviços\" => {
    \"jboss.deployment.subunit.\\\"gec-ear.ear\\\".\\\"gec-web.war\\\".undertow-deployment.UndertowDeploymentInfoService\" => \"Failed to start service
    Caused by: java.lang.IllegalStateException: ELY01148: A SecurityDomain has already been associated with the specified ClassLoader\",
    \"jboss.deployment.subunit.\\\"gec-ear.ear\\\".\\\"gec-api.war\\\".undertow-deployment.UndertowDeploymentInfoService\" => \"Failed to start service
    Caused by: java.lang.IllegalStateException: ELY01148: A SecurityDomain has already been associated with the specified ClassLoader\"
}}"[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]#
[root@caddeapllx2871 deployments]# echo; echo ===== ERROS DO LOG =====
grep -E "WELD-|ClassNotFound|NoClassDefFound|Unsatisfied|ERROR|WFLYCTL0013|WFLYSRV0021|WFLYSRV0010" \
  /logs/jboss/jboss-eap/standalone/sigec-portabilidade/server.log | tail -n 40

===== ERROS DO LOG =====
2026-11-18 11:11:16,185 INFO  [com.azure.core.amqp.implementation.ReactorConnectionCache] (parallel-2) {"az.sdk.message":"Transient error occurred. Retrying.","exception":"Connection 'MF_fa6db7_1795011046184' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]","entityPath":"N/A","tryCount":5,"intervalMs":30000}
2026-11-18 11:11:20,016 ERROR [org.jboss.as.ejb3.invocation] (EJB default - 2) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente PreProcessadorRecebimentoBean para o método public java.util.Set br.gov.caixa.sigec.negocio.PreProcessadorRecebimentoBean.preProcessaArquivoRecebimentoARCC(): javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
2026-11-18 11:11:20,024 ERROR [org.jboss.as.ejb3.invocation] (EJB default - 6) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente PreProcessadorRecebimentoBean para o método public java.util.Set br.gov.caixa.sigec.negocio.PreProcessadorRecebimentoBean.preProcessaArquivoRecebimentoARCC(): javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
2026-11-18 11:11:23,618 INFO  [stdout] (elastic-apm-server-reporter) 2026-11-18 11:11:23.618 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type METRICS with this error: Connect timed out
2026-11-18 11:11:25,641 INFO  [com.azure.core.amqp.implementation.ReactorConnection] (parallel-1) {"az.sdk.message":"Disposing of ReactorConnection.","connectionId":"MF_8e2930_1795011055637","isTransient":false,"isInitiatedByClient":false,"shutdownMessage":"Error occurred while connection was starting. Error: com.azure.core.amqp.exception.AmqpException: Connection 'MF_8e2930_1795011055637' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]"}
2026-11-18 11:11:25,641 INFO  [com.azure.core.amqp.implementation.ReactorConnectionCache] (parallel-1) {"az.sdk.message":"Transient error occurred. Retrying.","exception":"Connection 'MF_8e2930_1795011055637' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]","entityPath":"N/A","tryCount":4,"intervalMs":20161}
2026-11-18 11:11:25,667 INFO  [com.azure.core.amqp.implementation.ReactorConnection] (parallel-2) {"az.sdk.message":"Disposing of ReactorConnection.","connectionId":"MF_98a7b8_1795011055665","isTransient":false,"isInitiatedByClient":false,"shutdownMessage":"Error occurred while connection was starting. Error: com.azure.core.amqp.exception.AmqpException: Connection 'MF_98a7b8_1795011055665' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]"}
2026-11-18 11:11:25,668 INFO  [com.azure.core.amqp.implementation.ReactorConnectionCache] (parallel-2) {"az.sdk.message":"Transient error occurred. Retrying.","exception":"Connection 'MF_98a7b8_1795011055665' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]","entityPath":"N/A","tryCount":4,"intervalMs":20161}
2026-11-18 11:11:27,014 ERROR [org.jboss.as.ejb3.invocation] (EJB default - 6) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente PreProcessadorRecebimentoBean para o método public java.util.Set br.gov.caixa.sigec.negocio.PreProcessadorRecebimentoBean.preProcessaArquivoRecebimentoACTCAPCS(): javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
2026-11-18 11:11:27,015 ERROR [org.jboss.as.ejb3.timer] (EJB default - 6) WFLYEJB0020: Erro ao invocar o tempo limite para o temporizador: [id=d2e1ce65-960d-4244-a240-d76a07b39667 timedObjectId=gec-ear.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@73b23ba2 previousRun=Wed Nov 18 11:07:27 BRT 2026 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Wed Nov 18 11:12:27 BRT 2026 timerState=IN_TIMEOUT info=Recebimentos] ScheduleExpression [second=27;minute=0-59;hour=4-23;dayOfMonth=*;month=*;dayOfWeek=Mon,Tue,Wed,Thu,Fri,Sat,Sun;year=*;timezoneID=null;start=null;end=null]: javax.ejb.EJBException: java.lang.NullPointerException: Cannot invoke "java.util.Set.stream()" because "tiposPreProcessados" is null
2026-11-18 11:11:27,027 ERROR [org.jboss.as.ejb3.invocation] (EJB default - 6) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente PreProcessadorRecebimentoBean para o método public java.util.Set br.gov.caixa.sigec.negocio.PreProcessadorRecebimentoBean.preProcessaArquivoRecebimentoACTCAPCS(): javax.ejb.EJBException: WFLYEJB0442: Erro inesperado
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
2026-11-18 11:11:27,028 ERROR [org.jboss.as.ejb3.timer] (EJB default - 6) WFLYEJB0022: Erro durante repetição do temporizador: [id=d2e1ce65-960d-4244-a240-d76a07b39667 timedObjectId=gec-ear.gec-ejb.GerenciadorTimersBean auto-timer?:false persistent?:false timerService=org.jboss.as.ejb3.timerservice.TimerServiceImpl@73b23ba2 previousRun=Wed Nov 18 11:07:27 BRT 2026 initialExpiration=null intervalDuration(in milli sec)=0 nextExpiration=Wed Nov 18 11:12:27 BRT 2026 timerState=RETRY_TIMEOUT info=Recebimentos] ScheduleExpression [second=27;minute=0-59;hour=4-23;dayOfMonth=*;month=*;dayOfWeek=Mon,Tue,Wed,Thu,Fri,Sat,Sun;year=*;timezoneID=null;start=null;end=null]: javax.ejb.EJBException: java.lang.NullPointerException: Cannot invoke "java.util.Set.stream()" because "tiposPreProcessados" is null
2026-11-18 11:11:35,015 ERROR [org.jboss.as.ejb3.invocation] (EJB default - 6) WFLYEJB0034: A invocação de Jakarta Enterprise Beans falhou no componente TransferenciaEletronicaLegacyCallNCRBean para o método public void br.gov.caixa.sigec.negocio.TransferenciaEletronicaLegacyCallNCRBean.processarRecebimentosBaseEnvioNCR(): javax.ejb.EJBException: java.lang.RuntimeException: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.RuntimeException: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
2026-11-18 11:11:35,016 SEVERE [ProcessadorLegacyCallTEDNCRBean] (EJB default - 6) Falha ao recuperar R1/R2 da base para envio ao NCR.: javax.ejb.EJBException: java.lang.RuntimeException: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.RuntimeException: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.NoClassDefFoundError: org/apache/commons/lang3/StringUtils
Caused by: java.lang.ClassNotFoundException: org.apache.commons.lang3.StringUtils from [Module "deployment.gec-ear.ear.gec-ejb.jar" from Service Module Loader]
2026-11-18 11:11:37,005 INFO  [com.azure.core.amqp.implementation.ReactorConnection] (parallel-1) {"az.sdk.message":"Disposing of ReactorConnection.","connectionId":"MF_a283d0_1795011067003","isTransient":false,"isInitiatedByClient":false,"shutdownMessage":"Error occurred while connection was starting. Error: com.azure.core.amqp.exception.AmqpException: Connection 'MF_a283d0_1795011067003' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]"}
2026-11-18 11:11:37,005 INFO  [com.azure.core.amqp.implementation.ReactorConnectionCache] (parallel-1) {"az.sdk.message":"Transient error occurred. Retrying.","exception":"Connection 'MF_a283d0_1795011067003' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]","entityPath":"N/A","tryCount":1,"intervalMs":3092}
2026-11-18 11:11:37,116 INFO  [com.azure.core.amqp.implementation.ReactorConnection] (parallel-2) {"az.sdk.message":"Disposing of ReactorConnection.","connectionId":"MF_e04ae6_1795011067115","isTransient":false,"isInitiatedByClient":false,"shutdownMessage":"Error occurred while connection was starting. Error: com.azure.core.amqp.exception.AmqpException: Connection 'MF_e04ae6_1795011067115' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]"}
2026-11-18 11:11:37,116 INFO  [com.azure.core.amqp.implementation.ReactorConnectionCache] (parallel-2) {"az.sdk.message":"Transient error occurred. Retrying.","exception":"Connection 'MF_e04ae6_1795011067115' not active within the timout: PT30S., errorContext[NAMESPACE: sb-credito-des.servicebus.windows.net. ERROR CONTEXT: N/A]","entityPath":"N/A","tryCount":1,"intervalMs":3092}
[root@caddeapllx2871 deployments]#
