nova demanda: 

Verificar erro de deploy no stage DES2:

namespace/sirur-des not labeled
 
error: error processing template "openshift/quarkus-caixa-release": the namespace of the provided object does not match the namespace sent on the request


log do azuredevospos. release de deploy em des


2026-06-03T17:31:57.1834146Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-06-03T17:31:57.1834607Z ##[debug]Evaluating: succeeded()
2026-06-03T17:31:57.1834765Z ##[debug]Evaluating succeeded:
2026-06-03T17:31:57.1835177Z ##[debug]=> True
2026-06-03T17:31:57.1835609Z ##[debug]Result: True
2026-06-03T17:31:57.1835821Z ##[section]Starting: Verificando Status do Deployment
2026-06-03T17:31:57.1838919Z ==============================================================================
2026-06-03T17:31:57.1838999Z Task         : Bash
2026-06-03T17:31:57.1839042Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-03T17:31:57.1839122Z Version      : 3.227.0
2026-06-03T17:31:57.1839166Z Author       : Microsoft Corporation
2026-06-03T17:31:57.1839218Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-03T17:31:57.1839300Z ==============================================================================
2026-06-03T17:31:57.2231841Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-06-03T17:31:57.2943418Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-06-03T17:31:57.2950834Z ##[debug]loading inputs and endpoints
2026-06-03T17:31:57.2954253Z ##[debug]loading INPUT_TARGETTYPE
2026-06-03T17:31:57.2961913Z ##[debug]loading INPUT_FILEPATH
2026-06-03T17:31:57.2963104Z ##[debug]loading INPUT_SCRIPT
2026-06-03T17:31:57.2963768Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-06-03T17:31:57.2964901Z ##[debug]loading INPUT_FAILONSTDERR
2026-06-03T17:31:57.2966225Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-06-03T17:31:57.2967071Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-06-03T17:31:57.2968456Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-06-03T17:31:57.2973064Z ##[debug]loading SECRET_OKD_4_TOKEN
2026-06-03T17:31:57.2974555Z ##[debug]loading SECRET_AZPAT
2026-06-03T17:31:57.2976115Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-06-03T17:31:57.2977617Z ##[debug]loading SECRET_APIKEY_SIRUR
2026-06-03T17:31:57.2979108Z ##[debug]loading SECRET_SENHA_SQLSERVER
2026-06-03T17:31:57.2980486Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-06-03T17:31:57.2981041Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-06-03T17:31:57.2981643Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-06-03T17:31:57.2982228Z ##[debug]loading SECRET_FORTIFY_PASS
2026-06-03T17:31:57.2982956Z ##[debug]loading SECRET_TOKEN_CRQ
2026-06-03T17:31:57.2983544Z ##[debug]loading SECRET_PASSWORD_CGC
2026-06-03T17:31:57.2984753Z ##[debug]loading SECRET_INTERNET_CREDENTIALS_SECRET
2026-06-03T17:31:57.2985304Z ##[debug]loading SECRET_QUARKUS_OIDC_CREDENTIALS_SECRET
2026-06-03T17:31:57.2985885Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-06-03T17:31:57.2987236Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-06-03T17:31:57.2987614Z ##[debug]loaded 23
2026-06-03T17:31:57.2991545Z ##[debug]Agent.ProxyUrl=undefined
2026-06-03T17:31:57.2992008Z ##[debug]Agent.CAInfo=undefined
2026-06-03T17:31:57.2992240Z ##[debug]Agent.ClientCert=undefined
2026-06-03T17:31:57.2992536Z ##[debug]Agent.SkipCertValidation=True
2026-06-03T17:31:57.3007024Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-06-03T17:31:57.3009018Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-06-03T17:31:57.3009299Z ##[debug]system.culture=en-US
2026-06-03T17:31:57.3017643Z ##[debug]failOnStderr=false
2026-06-03T17:31:57.3019021Z ##[debug]workingDirectory=/opt/ads-agent/_work/r18222/a
2026-06-03T17:31:57.3019277Z ##[debug]check path : /opt/ads-agent/_work/r18222/a
2026-06-03T17:31:57.3019866Z ##[debug]targetType=inline
2026-06-03T17:31:57.3020252Z ##[debug]bashEnvValue=undefined
2026-06-03T17:31:57.3020949Z ##[debug]script=if [[ -n "okd4_nprd" && ("okd4_nprd" =~ "okd4" || "okd4_nprd" =~ "ocp") ]]
then
  app="sirur-condicoes-negociais-des2-des"
else
  app="sirur-condicoes-negociais-des2-des-esteiras"
fi

oc rollout status dc/"$app"  --request-timeout=600 -n sirur-des
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-06-03T17:31:57.3029155Z Generating script.
2026-06-03T17:31:57.3031124Z ##[debug]which 'bash'
2026-06-03T17:31:57.3036229Z ##[debug]found: '/bin/bash'
2026-06-03T17:31:57.3036612Z ##[debug]Agent.Version=3.225.2
2026-06-03T17:31:57.3036991Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-06-03T17:31:57.3037400Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-06-03T17:31:57.3039246Z ========================== Starting Command Output ===========================
2026-06-03T17:31:57.3040201Z ##[debug]which '/bin/bash'
2026-06-03T17:31:57.3040996Z ##[debug]found: '/bin/bash'
2026-06-03T17:31:57.3041561Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/15167f3f-0b89-47ae-8db1-478cf5c97340.sh
2026-06-03T17:31:57.3044212Z ##[debug]exec tool: /bin/bash
2026-06-03T17:31:57.3044442Z ##[debug]arguments:
2026-06-03T17:31:57.3044706Z ##[debug]   /opt/ads-agent/_work/_temp/15167f3f-0b89-47ae-8db1-478cf5c97340.sh
2026-06-03T17:31:57.3046449Z [command]/bin/bash /opt/ads-agent/_work/_temp/15167f3f-0b89-47ae-8db1-478cf5c97340.sh
2026-06-03T17:31:58.2572913Z Waiting for rollout to finish: 0 of 1 updated replicas are available...
2026-06-03T17:37:57.1886112Z ##[debug]Started cancellation of executing script
2026-06-03T17:37:57.1903764Z ##[debug]Exit code null received from tool '/bin/bash'
2026-06-03T17:38:04.6924709Z ##[error]The task has timed out.
2026-06-03T17:38:04.6925796Z ##[section]Finishing: Verificando Status do Deployment




log do okd:



exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-06-03 15:08:51,510 INFO  [io.agr.pool] (main) Datasource '<default>': Initial size smaller than min. Connections will be created when necessary
2026-06-03 15:08:53,310 INFO  [io.quarkus] (main) sirur-condicoes-negociais 1.1.0.3 on JVM (powered by Quarkus 2.9.2.Final) started in 9.996s. Listening on: http://0.0.0.0:8080
2026-06-03 15:08:53,310 INFO  [io.quarkus] (main) Profile prod activated. 
2026-06-03 15:08:53,310 INFO  [io.quarkus] (main) Installed features: [agroal, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-mssql, keycloak-authorization, narayana-jta, oidc, reactive-routes, rest-client, resteasy, resteasy-jackson, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-jwt, smallrye-metrics, smallrye-openapi, swagger-ui, vertx]
2026-06-03 15:09:05,698 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-0) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/live
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-06-03 15:09:15,550 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-1) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/live
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1452)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-06-03 15:09:15,550 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-0) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/ready
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-06-03 15:09:25,549 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-0) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/live
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-06-03 15:09:25,549 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-1) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/ready
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-06-03 15:09:25,555 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-0) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/ready
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-06-03 15:09:35,550 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-0) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/ready
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-06-03 15:09:45,549 ERROR [br.gov.cai.sir.con.neg.exc.map.DefaultExceptionMapper] (executor-thread-0) Falha ao executar opera??o: javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://25.0.20.12:8080/api/q/health/ready
	at org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)
	at org.jboss.resteasy.core.registry.RootClassNode.match(RootClassNode.java:47)
	at org.jboss.resteasy.core.ResourceMethodRegistry.getResourceInvoker(ResourceMethodRegistry.java:480)
	at org.jboss.resteasy.core.SynchronousDispatcher.getInvoker(SynchronousDispatcher.java:332)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:253)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:151)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:91)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:550)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2449)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1478)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)




OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
OperatorHub
Installed Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: sirur-des
Pods
Pod details
Pod
P
sirur-condicoes-negociais-des2-des-3-lqt7h
Running

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 10 events
Older events are not stored.
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:10
Generated from kubelet on ceadecldlx044.nprd.caixa
2 times in the last 2 minutes
Container sirur-condicoes-negociais-des2-des failed liveness probe, will be restarted
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:10
Generated from kubelet on ceadecldlx044.nprd.caixa
9 times in the last 3 minutes
Readiness probe failed: HTTP probe failed with statuscode: 404
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:10
Generated from kubelet on ceadecldlx044.nprd.caixa
6 times in the last 3 minutes
Liveness probe failed: HTTP probe failed with statuscode: 404
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:09
Generated from kubelet on ceadecldlx044.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirur-condicoes-negociais:20260603.1238-1.1.0.3-SNAPSHOT" in 98.857125ms (98.873081ms including waiting)
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:09
Generated from kubelet on ceadecldlx044.nprd.caixa
2 times in the last 3 minutes
Created container sirur-condicoes-negociais-des2-des
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:09
Generated from kubelet on ceadecldlx044.nprd.caixa
2 times in the last 3 minutes
Started container sirur-condicoes-negociais-des2-des
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:09
Generated from kubelet on ceadecldlx044.nprd.caixa
2 times in the last 3 minutes
Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirur-condicoes-negociais:20260603.1238-1.1.0.3-SNAPSHOT"
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:08
Generated from kubelet on ceadecldlx044.nprd.caixa
Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sirur-condicoes-negociais:20260603.1238-1.1.0.3-SNAPSHOT" in 5.002926089s (5.002933508s including waiting)
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:08
Generated from multus
Add eth0 [25.0.20.12/23] from openshift-sdn
PodPsirur-condicoes-negociais-des2-des-3-lqt7h
NamespaceNSsirur-des
3 de jun. de 2026, 15:08
Generated from default-scheduler
Successfully assigned sirur-des/sirur-condicoes-negociais-des2-des-3-lqt7h to ceadecldlx044.nprd.caixa
