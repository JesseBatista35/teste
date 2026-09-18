Ta bom, testando
 
opa.. agora veio CICS de novo


 <img width="1423" height="889" alt="image" src="https://github.com/user-attachments/assets/b4606820-93fe-498e-9262-7e9029ef2a62" />


exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.4.13.jar -Dhttps.proxyHost=proxydes.caixa -Dhttps.proxyPort=80 -Dhttp.nonProxyHosts=*.caixa|*.caixa.gov.br|10.0.0.0/8 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-18 16:34:30.573-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.4.13 started successfully (PID 8, JVM running for 9.269 s)
2026-09-18 16:34:30.663-03:00 INFO  c.m.applicationinsights.agent - Java version: 11.0.11, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-11-openjdk-11.0.11.0.9-2.el8_4.x86_64
2026-09-18 16:34:39.770-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - Sending telemetry to the ingestion service: Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (future warnings will be aggregated and logged once every 5 minutes)
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-18 16:34:40,960 INFO  [br.gov.cai.sid.uti.sec.SSOHandlerUtil] (main) 
[issuers declarados na aplicacao]
https://login2tqs.caixa.gov.br/auth/realms/internet
https://logintqs.caixa.gov.br/auth/realms/internet
https://login.tqs.caixa/auth/realms/intranet

2026-09-18 16:34:43,572 INFO  [io.qua.sma.ope.run.OpenApiRecorder] (main) CORS filtering is disabled and cross-origin resource sharing is allowed without restriction, which is not recommended in production. Please configure the CORS filter through 'quarkus.http.cors.*' properties. For more information, see Quarkus HTTP CORS documentation
2026-09-18 16:34:44,985 INFO  [io.quarkus] (main) sid01-lancamentos-financeiros 1.5.0.2 on JVM (powered by Quarkus 2.13.8.Final) started in 14.024s. Listening on: http://0.0.0.0:8080
2026-09-18 16:34:44,985 INFO  [io.quarkus] (main) Profile prod activated. 
2026-09-18 16:34:44,985 INFO  [io.quarkus] (main) Installed features: [cdi, hibernate-validator, logging-gelf, resteasy, resteasy-jsonb, smallrye-context-propagation, smallrye-health, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-09-18 16:35:29.433-03:00 ERROR c.azure.core.http.policy.RetryPolicy - {"az.sdk.message":"Retry attempts have been exhausted.","exception":"http, none, proxydes.caixa/10.252.32.63:80 => /169.254.169.254:80, status: 502 Proxy Error ( The specified Secure Sockets Layer (SSL) port is not allowed. Forefront TMG is not configured to allow SSL requests from this port. Most Web browsers use port 443 for SSL requests.  )","tryCount":3}
2026-09-18 16:39:39.773-03:00 WARN  c.a.m.o.e.i.p.TelemetryPipeline - In the last 5 minutes, the following operation has failed 2 times (out of 18): Sending telemetry to the ingestion service:
 * Received response code 400 (103: Field 'time' on type 'Envelope' is older than the allowed min date. Expected: now - 172800000ms) (2 times)
2026-09-18 16:41:00,259 INFO  [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-0) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
2026-09-18 16:41:02,077 INFO  [org.apa.cxf.wsd.ser.fac.ReflectionServiceFactoryBean] (executor-thread-0) Creating Service {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService from WSDL: jar:file:/deployments/app/sid01-lancamentos-financeiros-1.5.0.2.jar!/wsdl/D01POSOL_N1W1.wsdl
2026-09-18 16:41:03,791 WARN  [org.apa.cxf.pha.PhaseInterceptorChain] (executor-thread-0) Interceptor for {http://caixa.gov.br/sid01/lancamentoV4}D01POSOLService#{http://caixa.gov.br/sid01/lancamentoV4}lancamentoV4 has thrown exception, unwinding now: org.apache.cxf.interceptor.Fault: Response was of unexpected text/html ContentType.  Incoming portion of HTML stream: <!doctype html public "-//IETF//DTD HTML 2.0//EN">
<html>
<head>
<title>CICS Web Interface error</title>
</head>
<body>
<h1>500 Internal Server Error</h1>
</body>
</html>
	at org.apache.cxf.interceptor.StaxInInterceptor.handleMessage(StaxInInterceptor.java:97)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.onMessage(ClientImpl.java:829)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.handleResponseInternal(HTTPConduit.java:1726)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.handleResponse(HTTPConduit.java:1592)
	at org.apache.cxf.transport.http.HTTPConduit$WrappedOutputStream.close(HTTPConduit.java:1389)
	at org.apache.cxf.transport.http.asyncclient.AsyncHTTPConduit$AsyncWrappedOutputStream.close(AsyncHTTPConduit.java:428)
	at org.apache.cxf.transport.AbstractConduit.close(AbstractConduit.java:56)
	at org.apache.cxf.transport.http.HTTPConduit.close(HTTPConduit.java:689)
	at org.apache.cxf.interceptor.MessageSenderInterceptor$MessageSenderEndingInterceptor.handleMessage(MessageSenderInterceptor.java:63)
	at org.apache.cxf.phase.PhaseInterceptorChain.doIntercept(PhaseInterceptorChain.java:307)
	at org.apache.cxf.endpoint.ClientImpl.doInvoke(ClientImpl.java:528)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:439)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:354)
	at org.apache.cxf.endpoint.ClientImpl.invoke(ClientImpl.java:312)
	at org.apache.cxf.frontend.ClientProxy.invokeSync(ClientProxy.java:96)
	at org.apache.cxf.jaxws.JaxWsClientProxy.invoke(JaxWsClientProxy.java:140)
	at com.sun.proxy.$Proxy147.lancamentoV4(Unknown Source)
	at br.gov.caixa.sid01.service.LancamentoService.debitar(LancamentoService.java:188)
	at br.gov.caixa.sid01.service.LancamentoService_ClientProxy.debitar(Unknown Source)
	at br.gov.caixa.sid01.service.ServiceRequestFacade.debitar(ServiceRequestFacade.java:95)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource.debitar(DebitoResource.java:226)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_Subclass.debitar$$superforward1(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
	at io.quarkus.hibernate.validator.runtime.interceptor.AbstractMethodValidationInterceptor.validateMethodInvocation(AbstractMethodValidationInterceptor.java:71)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor.validateMethodInvocation(JaxrsEndPointValidationInterceptor.java:35)
	at io.quarkus.hibernate.validator.runtime.jaxrs.JaxrsEndPointValidationInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedCallable(CountedInterceptor.java:85)
	at io.smallrye.metrics.interceptors.CountedInterceptor.countedMethod(CountedInterceptor.java:61)
	at io.smallrye.metrics.interceptors.CountedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.timedCallable(SimplyTimedInterceptor.java:91)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor.simplyTimedMethod(SimplyTimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.SimplyTimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedCallable(TimedInterceptor.java:92)
	at io.smallrye.metrics.interceptors.TimedInterceptor.timedMethod(TimedInterceptor.java:65)
	at io.smallrye.metrics.interceptors.TimedInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:50)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.concurrentCallable(ConcurrentGaugeInterceptor.java:91)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor.countedMethod(ConcurrentGaugeInterceptor.java:62)
	at io.smallrye.metrics.interceptors.ConcurrentGaugeInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:33)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_Subclass.debitar(Unknown Source)
	at br.gov.caixa.sid01.resource.lancamento.debito.DebitoResource_ClientProxy.debitar(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:170)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:130)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:660)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:524)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:474)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:476)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:434)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:408)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:69)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:576)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-09-18 16:41:03,818 ERROR [br.gov.cai.sid.res.lan.deb.DebitoResource] (executor-thread-0) METODO: debitar DETALHE: javax.xml.ws.soap.SOAPFaultException: Response was of unexpected text/html ContentType.  Incoming portion of HTML stream: <!doctype html public "-//IETF//DTD HTML 2.0//EN">
<html>
<head>
<title>CICS Web Interface error</title>
</head>
<body>
<h1>500 Internal Server Error</h1>
</body>
</html> 
