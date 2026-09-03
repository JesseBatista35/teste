Build do projeto 
SIACC-pixautomatico-mq-suporte falha na etapa "Maven" por não encontrar o artefato
"br.gov.caixa.siacc.pix.suporte:SIACC-pixautomatico-api-suporte:jar:1.0.186-SNAPSHOT"

Link: https://devops.caixa/projetos/Caixa/_build/results?buildId=816567&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=a2c59c87-17bb-59ca-9eb1-609815e0f5dc

Porém,
Outros projetos que utilizam esse mesmo artefato na versão 1.0.186-SNAPSHOT conseguem encontrar

Por exemplo: 
SIACC-pixautomatico-batch-remessa

Link: https://devops.caixa/projetos/Caixa/_build/results?buildId=815849&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=a2c59c87-17bb-59ca-9eb1-609815e0f5dc

Outro exemplo:
SIACC-pixautomatico-api-relatorios-financeiros

Link: https://devops.caixa/projetos/Caixa/_build/results?buildId=813983&view=logs&j=275f1d19-1bd8-5591-b06b-07d489ea915a&t=a2c59c87-17bb-59ca-9eb1-609815e0f5dc



<img width="1875" height="915" alt="image" src="https://github.com/user-attachments/assets/6a752155-14d7-48a0-992c-618f533193ce" />


erro atual

2026-09-03T13:11:04.4575040Z ##[section]Starting: Maven
2026-09-03T13:11:04.4579548Z ==============================================================================
2026-09-03T13:11:04.4579626Z Task         : Maven
2026-09-03T13:11:04.4579683Z Description  : Build, test, and deploy with Apache Maven
2026-09-03T13:11:04.4579746Z Version      : 4.225.0
2026-09-03T13:11:04.4579791Z Author       : Microsoft Corporation
2026-09-03T13:11:04.4579862Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-09-03T13:11:04.4579931Z ==============================================================================
2026-09-03T13:11:06.9640693Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-09-03T13:11:07.0903138Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-09-03T13:11:07.0903984Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-09-03T13:11:07.0904446Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-09-03T13:11:07.0904836Z Default locale: pt_BR, platform encoding: UTF-8
2026-09-03T13:11:07.0905941Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-09-03T13:11:07.1153050Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/12733/s/pom.xml clean package -U
2026-09-03T13:11:07.8408075Z [INFO] Scanning for projects...
2026-09-03T13:11:10.0111013Z [INFO] 
2026-09-03T13:11:10.0136682Z [INFO] ---< br.gov.caixa.siacc.pix.suporte:SIACC-pixautomatico-mq-suporte >----
2026-09-03T13:11:10.0138254Z [INFO] Building SIACC-pixautomatico-mq-suporte 1.0.18-SNAPSHOT
2026-09-03T13:11:10.0138688Z [INFO] --------------------------------[ jar ]---------------------------------
2026-09-03T13:11:10.3368271Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siacc/pix/suporte/SIACC-pixautomatico-api-suporte/maven-metadata.xml
2026-09-03T13:11:13.0209454Z Progress (1): 4.1/4.6 kB
2026-09-03T13:11:14.0020638Z Progress (1): 4.6 kB    
2026-09-03T13:11:14.0022117Z                     
2026-09-03T13:11:14.0023258Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siacc/pix/suporte/SIACC-pixautomatico-api-suporte/maven-metadata.xml (4.6 kB at 1.2 kB/s)
2026-09-03T13:11:15.1762346Z [WARNING] The POM for br.gov.caixa.siacc.pix.suporte:SIACC-pixautomatico-api-suporte:jar:1.0.186-SNAPSHOT is missing, no dependency information available
2026-09-03T13:11:15.8456620Z [INFO] ------------------------------------------------------------------------
2026-09-03T13:11:15.8457124Z [INFO] BUILD FAILURE
2026-09-03T13:11:15.8457507Z [INFO] ------------------------------------------------------------------------
2026-09-03T13:11:15.8457842Z [INFO] Total time:  8.016 s
2026-09-03T13:11:15.8501863Z [INFO] Finished at: 2026-09-03T10:11:15-03:00
2026-09-03T13:11:15.8502484Z [INFO] ------------------------------------------------------------------------
2026-09-03T13:11:15.8504244Z [ERROR] Failed to execute goal on project SIACC-pixautomatico-mq-suporte: Could not resolve dependencies for project br.gov.caixa.siacc.pix.suporte:SIACC-pixautomatico-mq-suporte:jar:1.0.18-SNAPSHOT: Could not find artifact br.gov.caixa.siacc.pix.suporte:SIACC-pixautomatico-api-suporte:jar:1.0.186-SNAPSHOT -> [Help 1]
2026-09-03T13:11:15.8504812Z [ERROR] 
2026-09-03T13:11:15.8505236Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-09-03T13:11:15.8506860Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-09-03T13:11:15.8507085Z [ERROR] 
2026-09-03T13:11:15.8507420Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-09-03T13:11:15.8508890Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException
2026-09-03T13:11:15.9041153Z ##[error]Build failed.
2026-09-03T13:11:15.9048200Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-09-03T13:11:15.9048473Z Could not retrieve code analysis results - Maven run failed.
2026-09-03T13:11:15.9087328Z ##[section]Finishing: Maven


NO DIA 21 DE JULHO PASSOU


2026-07-27T20:07:24.5950133Z ##[section]Starting: Maven
2026-07-27T20:07:24.5955430Z ==============================================================================
2026-07-27T20:07:24.5955519Z Task         : Maven
2026-07-27T20:07:24.5955576Z Description  : Build, test, and deploy with Apache Maven
2026-07-27T20:07:24.5955637Z Version      : 4.225.0
2026-07-27T20:07:24.5955688Z Author       : Microsoft Corporation
2026-07-27T20:07:24.5955749Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-07-27T20:07:24.5955819Z ==============================================================================
2026-07-27T20:07:25.1568951Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-07-27T20:07:25.2956315Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-07-27T20:07:25.2956804Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-07-27T20:07:25.2957094Z Java version: 17.0.8, vendor: OpenLogic, runtime: /usr/java/open-jdk-17.0.8
2026-07-27T20:07:25.2957260Z Default locale: pt_BR, platform encoding: UTF-8
2026-07-27T20:07:25.2957584Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-07-27T20:07:25.3152077Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/12305/s/pom.xml clean package -U
2026-07-27T20:07:26.0755994Z [INFO] Scanning for projects...
2026-07-27T20:07:26.9195969Z [INFO] 
2026-07-27T20:07:26.9246055Z [INFO] ---< br.gov.caixa.siacc.pix.suporte:SIACC-pixautomatico-mq-suporte >----
2026-07-27T20:07:26.9336027Z [INFO] Building SIACC-pixautomatico-mq-suporte 1.0.18-SNAPSHOT
2026-07-27T20:07:26.9446071Z [INFO] --------------------------------[ jar ]---------------------------------
2026-07-27T20:07:27.1415962Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siacc/pix/suporte/SIACC-pixautomatico-api-suporte/maven-metadata.xml
2026-07-27T20:07:27.4761382Z Progress (1): 4.1/4.6 kB
2026-07-27T20:07:27.7838543Z Progress (1): 4.6 kB    
2026-07-27T20:07:27.7838871Z                     
2026-07-27T20:07:27.7839439Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siacc/pix/suporte/SIACC-pixautomatico-api-suporte/maven-metadata.xml (4.6 kB at 6.9 kB/s)
2026-07-27T20:07:28.4738291Z [INFO] 
2026-07-27T20:07:28.4739149Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:28.5135879Z [INFO] 
2026-07-27T20:07:28.5205120Z [INFO] --- jacoco-maven-plugin:0.8.8:prepare-agent (default) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:28.5509064Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar=destfile=/opt/ads-agent/_work/12305/s/target/jacoco.exec,append=true
2026-07-27T20:07:28.5509543Z [INFO] 
2026-07-27T20:07:28.5510008Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:28.5846225Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-27T20:07:28.5880829Z [INFO] Copying 2 resources
2026-07-27T20:07:28.5961219Z [INFO] 
2026-07-27T20:07:28.5961687Z [INFO] --- quarkus-maven-plugin:3.8.3:generate-code (default) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:30.0457487Z [INFO] 
2026-07-27T20:07:30.0486243Z [INFO] --- maven-compiler-plugin:3.12.1:compile (default-compile) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:30.1389307Z [INFO] Recompiling the module because of changed source code.
2026-07-27T20:07:30.1389873Z [INFO] Compiling 9 source files with javac [debug release 17] to target/classes
2026-07-27T20:07:31.8855655Z [INFO] 
2026-07-27T20:07:31.8856404Z [INFO] --- quarkus-maven-plugin:3.8.3:generate-code-tests (default) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:32.1048987Z Downloading from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siacc/pix/suporte/SIACC-pixautomatico-api-suporte/maven-metadata.xml
2026-07-27T20:07:32.1116271Z Progress (1): maven-metadata.xml (3.9/4.6 kB)
2026-07-27T20:07:32.1197307Z Progress (1): maven-metadata.xml (4.6 kB)    
2026-07-27T20:07:32.1197958Z                                          
2026-07-27T20:07:32.1198630Z Downloaded from Nexus Caixa: http://binario.caixa:8081/repository/caixa-group-br/br/gov/caixa/siacc/pix/suporte/SIACC-pixautomatico-api-suporte/maven-metadata.xml (4.6 kB at 380 kB/s)
2026-07-27T20:07:33.2026651Z [INFO] 
2026-07-27T20:07:33.2027416Z [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:33.2027857Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-07-27T20:07:33.2028438Z [INFO] skip non existing resourceDirectory /opt/ads-agent/_work/12305/s/src/test/resources
2026-07-27T20:07:33.2028856Z [INFO] 
2026-07-27T20:07:33.2029288Z [INFO] --- maven-compiler-plugin:3.12.1:testCompile (default-testCompile) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:33.2225662Z [INFO] Recompiling the module because of changed dependency.
2026-07-27T20:07:33.2326179Z [INFO] Compiling 9 source files with javac [debug release 17] to target/test-classes
2026-07-27T20:07:34.5155726Z [INFO] 
2026-07-27T20:07:34.5275858Z [INFO] --- maven-surefire-plugin:3.2.5:test (default-test) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:34.5875612Z [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
2026-07-27T20:07:34.6118326Z [INFO] 
2026-07-27T20:07:34.6119281Z [INFO] -------------------------------------------------------
2026-07-27T20:07:34.6119752Z [INFO]  T E S T S
2026-07-27T20:07:34.6120228Z [INFO] -------------------------------------------------------
2026-07-27T20:07:36.0975205Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.ApplicationTest
2026-07-27T20:07:36.4472565Z 17:07:36 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-22] [] LaunchMode TEST
2026-07-27T20:07:36.7126635Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-07-27T20:07:37.8105892Z [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.630 s -- in br.gov.caixa.siacc.pix.suporte.mq.ApplicationTest
2026-07-27T20:07:37.8296342Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest
2026-07-27T20:07:38.5458703Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.5459323Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.5695951Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.5836148Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.5936403Z 17:07:38 WARN [br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Novo contexto identificado. Reiniciando consumer...
2026-07-27T20:07:38.5937642Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.5938684Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.6019287Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.6020232Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.6261499Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.6262222Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.6262866Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Falha em close: java.lang.RuntimeException: erro ao fechar
2026-07-27T20:07:38.6263232Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.close(AJMSConsumer.java:241)
2026-07-27T20:07:38.6263881Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.lambda$deveIgnorarExcecaoAoFechar$7(AJMSConsumerTest.java:418)
2026-07-27T20:07:38.6264497Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-27T20:07:38.6265075Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-27T20:07:38.6265897Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-27T20:07:38.6266253Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.deveIgnorarExcecaoAoFechar(AJMSConsumerTest.java:418)
2026-07-27T20:07:38.6266580Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:38.6267058Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:38.6268090Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:38.6268508Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:38.6268947Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:38.6269342Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:38.6269748Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:38.6270180Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:38.6270532Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:38.6270966Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:38.6271304Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:38.6271788Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:38.6272215Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:38.6272594Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:38.6273010Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:38.6273425Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:38.6273899Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:38.6274237Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:38.6274729Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:38.6275141Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6275841Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:38.6276218Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:38.6276490Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:38.6276746Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:38.6277000Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6277328Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.6277713Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.6277949Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.6278189Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6278469Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.6278698Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.6278921Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.6279157Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.6279443Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.6279686Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6279922Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.6280229Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.6280500Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.6280735Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6280987Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.6281220Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.6281432Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.6281642Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.6281903Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.6282136Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6282372Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.6282591Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.6282832Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.6283068Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6283296Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.6283535Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.6283783Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:38.6284053Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:38.6284298Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:38.6284532Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:38.6284853Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:38.6285087Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:38.6285369Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:38.6285630Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:38.6285876Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:38.6286097Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:38.6286306Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:38.6286493Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:38.6286742Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:38.6286965Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:38.6287197Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:38.6287430Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:38.6287699Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:38.6287911Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:38.6288112Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:38.6288310Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:38.6288386Z 
2026-07-27T20:07:38.6505815Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.6526286Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.6536770Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Falha em receiveBody: java.lang.RuntimeException: erro
2026-07-27T20:07:38.6546150Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.receiveBody(AJMSConsumer.java:264)
2026-07-27T20:07:38.6546854Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.deveRetornarNullReceiveBodyTimeoutExcecao(AJMSConsumerTest.java:447)
2026-07-27T20:07:38.6547351Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:38.6547728Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:38.6548204Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:38.6548685Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:38.6549033Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:38.6549421Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:38.6549832Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:38.6550254Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:38.6550651Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:38.6551058Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:38.6551515Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:38.6552033Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:38.6552832Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:38.6553260Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:38.6553672Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:38.6554072Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:38.6554479Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:38.6554993Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:38.6555429Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:38.6555874Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6556265Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:38.6556604Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:38.6556895Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:38.6557193Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:38.6557438Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6557805Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.6558221Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.6558600Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.6559027Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6559421Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.6559809Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.6560142Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.6560551Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.6561009Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.6561593Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6561988Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.6562387Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.6562757Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.6563148Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6563498Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.6563845Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.6564170Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.6564839Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.6565143Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.6565414Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6565647Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.6565876Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.6566096Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.6566340Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.6566618Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.6566850Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.6567272Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:38.6567608Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:38.6567885Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:38.6568205Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:38.6568494Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:38.6568799Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:38.6569057Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:38.6569388Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:38.6569643Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:38.6569927Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:38.6570170Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:38.6570390Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:38.6570735Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:38.6571107Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:38.6571498Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:38.6571900Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:38.6572274Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:38.6572590Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:38.6572940Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:38.6573282Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:38.6573453Z 
2026-07-27T20:07:38.6796290Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.6797200Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.6866434Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-25] [] Falha ao receber mensagem. Aguardando reconexao...: java.lang.RuntimeException: falha
2026-07-27T20:07:38.7235828Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.receiveNoWait(AJMSConsumer.java:209)
2026-07-27T20:07:38.7236401Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.lambda$deveRetornarNullReceiveNoWaitAposExcecaoEInterrupt$6(AJMSConsumerTest.java:403)
2026-07-27T20:07:38.7236793Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:38.7236922Z 
2026-07-27T20:07:38.7237415Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.7237780Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.7446269Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.7447315Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.7447721Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.7448959Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.7736153Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.7736815Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.7737482Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-26] [] Falha ao receber mensagem. Aguardando reconexao...: java.lang.RuntimeException: falha
2026-07-27T20:07:38.7737854Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.receive(AJMSConsumer.java:173)
2026-07-27T20:07:38.7738290Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.lambda$deveRetornarNullReceiveTimeoutAposExcecaoEInterrupt$5(AJMSConsumerTest.java:383)
2026-07-27T20:07:38.7738635Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:38.7738808Z 
2026-07-27T20:07:38.7845870Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.7846512Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.7846989Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Falha em getMessageSelector: java.lang.RuntimeException: erro
2026-07-27T20:07:38.7847395Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.getMessageSelector(AJMSConsumer.java:97)
2026-07-27T20:07:38.7847818Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.deveRetornarNullQuandoGetMessageSelectorFalha(AJMSConsumerTest.java:181)
2026-07-27T20:07:38.7848667Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:38.7849110Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:38.7849417Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:38.7849768Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:38.7850120Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:38.7850442Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:38.7850810Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:38.7851135Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:38.7851428Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:38.7851791Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:38.7852500Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:38.7852889Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:38.7853199Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:38.7853471Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:38.7853754Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:38.7854062Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:38.7854345Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:38.7854714Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:38.7855006Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:38.7855344Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.7855932Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:38.7856234Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:38.7856514Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:38.7856817Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:38.7857085Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.7857394Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.7857672Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.7857932Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.7858263Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.7858621Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.7858960Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.7859318Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.7859730Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.7860043Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.7860332Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.7860591Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.7860848Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.7861134Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.7861410Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.7861746Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.7862019Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.7862246Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.7862521Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.7862855Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.7863141Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.7863412Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.7863694Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.7863957Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.7864218Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.7864613Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.7864912Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.7865222Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:38.7865533Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:38.7865827Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:38.7866091Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:38.7866388Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:38.7866665Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:38.7866946Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:38.7867246Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:38.7867533Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:38.7867796Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:38.7868044Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:38.7868313Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:38.7868568Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:38.7868842Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:38.7869123Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:38.7869398Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:38.7869655Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:38.7869922Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:38.7870224Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:38.7870474Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:38.7870612Z 
2026-07-27T20:07:38.7927364Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.7928030Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.8041002Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.8072875Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.8080960Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Falha em receiveBody: java.lang.RuntimeException: erro
2026-07-27T20:07:38.8081442Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.receiveBody(AJMSConsumer.java:253)
2026-07-27T20:07:38.8081946Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.deveRetornarNullReceiveBodyExcecao(AJMSConsumerTest.java:440)
2026-07-27T20:07:38.8082958Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:38.8083412Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:38.8084233Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:38.8084841Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:38.8085152Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:38.8085448Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:38.8085726Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:38.8086033Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:38.8086313Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:38.8086592Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:38.8086915Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:38.8087263Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:38.8087550Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:38.8087833Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:38.8088130Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:38.8088409Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:38.8088696Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:38.8088967Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:38.8089298Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:38.8089580Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8089892Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:38.8090352Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:38.8090817Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:38.8091130Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:38.8091408Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8091686Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.8091961Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.8092263Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.8092722Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8093018Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.8093295Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.8093550Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.8093912Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.8094314Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.8094679Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8094954Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.8095226Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.8095490Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.8095794Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8096059Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.8096335Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.8096593Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.8096855Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.8097243Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.8097524Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8097805Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.8098095Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.8098344Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.8098639Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8098897Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.8099166Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.8099475Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:38.8099804Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:38.8100108Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:38.8100396Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:38.8100683Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:38.8100970Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:38.8101233Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:38.8101517Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:38.8101823Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:38.8102089Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:38.8102464Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:38.8102830Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:38.8103197Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:38.8103629Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:38.8103927Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:38.8104223Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:38.8104476Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:38.8104821Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:38.8105076Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:38.8105346Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:38.8105484Z 
2026-07-27T20:07:38.8118561Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.8119063Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.8245211Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.8245762Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.8246362Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Falha em setMessageListener: java.lang.RuntimeException: erro
2026-07-27T20:07:38.8246986Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.setMessageListener(AJMSConsumer.java:119)
2026-07-27T20:07:38.8247512Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.lambda$deveIgnorarExcecaoAoDefinirListener$8(AJMSConsumerTest.java:429)
2026-07-27T20:07:38.8247946Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:49)
2026-07-27T20:07:38.8248388Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:36)
2026-07-27T20:07:38.8248719Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3168)
2026-07-27T20:07:38.8249020Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.deveIgnorarExcecaoAoDefinirListener(AJMSConsumerTest.java:429)
2026-07-27T20:07:38.8249287Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:38.8249913Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:38.8250293Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:38.8250564Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:38.8250817Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:38.8251099Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:38.8251385Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:38.8251675Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:38.8251944Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:38.8252243Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:38.8252566Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:38.8252954Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:38.8253312Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:38.8253616Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:38.8253902Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:38.8254204Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:38.8254477Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:38.8254891Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:38.8255184Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:38.8255636Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8255934Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:38.8256246Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:38.8256547Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:38.8256825Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:38.8257117Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8257389Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.8257677Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.8258019Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.8258412Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8258805Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.8259066Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.8259408Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.8259704Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.8260018Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.8260292Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8260597Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.8260900Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.8261175Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.8261464Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8261738Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.8261997Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.8262278Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.8262577Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.8262883Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.8263169Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8263443Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.8263688Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.8263943Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.8264230Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.8264526Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.8264962Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.8265265Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:38.8265650Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:38.8265935Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:38.8266221Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:38.8266686Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:38.8267087Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:38.8267447Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:38.8267742Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:38.8268021Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:38.8268339Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:38.8268597Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:38.8268860Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:38.8269188Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:38.8269469Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:38.8269886Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:38.8270209Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:38.8270529Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:38.8270791Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:38.8271049Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:38.8271288Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:38.8271445Z 
2026-07-27T20:07:38.8301618Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.8302293Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.8440845Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.8441438Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.8441913Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSConsumer-27] [] Aguardando reconexao...
2026-07-27T20:07:38.8483325Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.8483882Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.8619527Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.8620147Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9221274Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9221906Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9282597Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9283159Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9283675Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSConsumer-30] [] Aguardando reconexao...
2026-07-27T20:07:38.9374216Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9375009Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9375616Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSConsumer-31] [] Aguardando reconexao...
2026-07-27T20:07:38.9444754Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9445377Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9542021Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9542567Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9543106Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Falha em receiveBodyNoWait: java.lang.RuntimeException: erro
2026-07-27T20:07:38.9545165Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.receiveBodyNoWait(AJMSConsumer.java:275)
2026-07-27T20:07:38.9545669Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.deveRetornarNullReceiveBodyNoWaitExcecao(AJMSConsumerTest.java:454)
2026-07-27T20:07:38.9546428Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:38.9546797Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:38.9547224Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:38.9547578Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:38.9547850Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:38.9548177Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:38.9548906Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:38.9549234Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:38.9549475Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:38.9549714Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:38.9550158Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:38.9550441Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:38.9550731Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:38.9551015Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:38.9551263Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:38.9551504Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:38.9551741Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:38.9551986Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:38.9552236Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:38.9552520Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9552772Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:38.9553032Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:38.9553363Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:38.9553691Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:38.9553935Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9554173Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.9554397Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.9554739Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.9555098Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9555510Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.9555735Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.9555973Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.9556220Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.9556530Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.9556754Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9557021Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.9557248Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.9557473Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.9557708Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9557985Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.9558207Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.9558403Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.9558634Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.9558897Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.9559131Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9559419Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.9559715Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.9560030Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.9560381Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9560674Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.9560901Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.9561157Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:38.9561464Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:38.9561703Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:38.9561945Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:38.9562217Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:38.9562452Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:38.9562685Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:38.9562928Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:38.9563231Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:38.9563456Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:38.9563667Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:38.9563877Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:38.9564093Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:38.9564316Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:38.9564629Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:38.9564887Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:38.9565118Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:38.9565328Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:38.9565527Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:38.9565759Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:38.9565862Z 
2026-07-27T20:07:38.9582293Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9582848Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9628293Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9628856Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9695811Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:38.9696173Z 17:07:38 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:38.9696457Z 17:07:38 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSConsumer-1] [] Falha em getMessageListener: java.lang.RuntimeException: erro
2026-07-27T20:07:38.9696691Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumer.getMessageListener(AJMSConsumer.java:108)
2026-07-27T20:07:38.9696928Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest.deveRetornarNullQuandoGetMessageListenerFalha(AJMSConsumerTest.java:192)
2026-07-27T20:07:38.9697143Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:38.9697336Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:38.9697605Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:38.9697907Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:38.9698180Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:38.9698492Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:38.9698851Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:38.9699218Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:38.9699575Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:38.9699919Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:38.9700325Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:38.9700834Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:38.9701079Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:38.9701312Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:38.9701534Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:38.9701755Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:38.9701977Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:38.9702198Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:38.9702429Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:38.9702654Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9702933Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:38.9703165Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:38.9703383Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:38.9703608Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:38.9703830Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9704036Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.9704238Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.9704433Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.9704772Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9704991Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.9705200Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.9705383Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.9705604Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.9705855Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.9706072Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9706376Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.9706596Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.9706866Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.9707129Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9707337Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.9707584Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.9707766Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:38.9707976Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:38.9708224Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:38.9708441Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9708650Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:38.9708850Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:38.9709047Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:38.9709266Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:38.9709479Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:38.9709685Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:38.9709949Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:38.9710198Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:38.9710426Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:38.9710638Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:38.9710855Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:38.9711065Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:38.9711282Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:38.9711509Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:38.9711729Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:38.9711926Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:38.9712155Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:38.9712345Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:38.9712528Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:38.9712729Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:38.9712945Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:38.9713156Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:38.9713357Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:38.9713546Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:38.9713723Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:38.9713897Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:38.9714007Z 
2026-07-27T20:07:38.9998873Z [INFO] Tests run: 28, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.215 s -- in br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSConsumerTest
2026-07-27T20:07:39.0036023Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContextTest
2026-07-27T20:07:39.5434279Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.5435495Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.5605838Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.5691058Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.5739715Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.5895870Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.5950641Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6005910Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6027016Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6027949Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6028889Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6029217Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6029474Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6029725Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6029974Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6030233Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6030481Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6030730Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6115879Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6119019Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6119581Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6120007Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6124460Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6125094Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6197832Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6198461Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6221314Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6221863Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6277071Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6277618Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6316563Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6317155Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6352799Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6353639Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6406807Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6407295Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6436769Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6437707Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6484918Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6506705Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6507478Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6507821Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6508076Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6508324Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6595035Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6604192Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6604917Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6605404Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6678675Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6688081Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6728327Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6760216Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6773951Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6774480Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6867490Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.6923746Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.6938439Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7045549Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7088329Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7088855Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7089352Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7089731Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7090041Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7090339Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7090631Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7090973Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7091302Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7092290Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7092598Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7092845Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7145268Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7186871Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7226239Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7317466Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7325282Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7398083Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7495216Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7574056Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7647549Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7722556Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7738040Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.7860038Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.7898667Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8005728Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8045430Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8088843Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8089372Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8089845Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8090237Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8090536Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8090869Z 17:07:39 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSContext-1] [] Falha na conexao de null: jakarta.jms.JMSException: simulated
2026-07-27T20:07:39.8091154Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContextTest.deveIgnorarExceptionListenerQuandoEnabledFalse(AJMSContextTest.java:589)
2026-07-27T20:07:39.8091430Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:39.8091678Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:39.8091945Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:39.8092283Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:39.8092640Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:39.8092951Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:39.8093227Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:39.8093501Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:39.8094069Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:39.8094339Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:39.8094736Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:39.8095066Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:39.8095361Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:39.8095641Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:39.8095919Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:39.8096197Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:39.8096464Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:39.8096794Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:39.8097157Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:39.8097463Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8097742Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:39.8098019Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:39.8098300Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:39.8098573Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:39.8098849Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8099239Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:39.8099494Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:39.8099744Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:39.8100012Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8100277Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:39.8100537Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:39.8100771Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:39.8101039Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:39.8101340Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:39.8101605Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8101875Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:39.8102129Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:39.8102378Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:39.8102701Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8102969Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:39.8103226Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:39.8103458Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:39.8103729Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:39.8104026Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:39.8104296Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8104628Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:39.8104906Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:39.8105152Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:39.8105452Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8105710Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:39.8105960Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:39.8106246Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:39.8106547Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:39.8106820Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:39.8107089Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:39.8107353Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:39.8107613Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:39.8107881Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:39.8108158Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:39.8108433Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:39.8108684Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:39.8108923Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:39.8109167Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:39.8109457Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:39.8109708Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:39.8109973Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:39.8110238Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:39.8110490Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:39.8110762Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:39.8110991Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:39.8111219Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:39.8111348Z 
2026-07-27T20:07:39.8111621Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8111928Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8112221Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8112514Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8112806Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8113104Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8113426Z 17:07:39 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSContext-1] [] Falha na conexao de null: jakarta.jms.JMSException: simulated
2026-07-27T20:07:39.8113702Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContextTest.deveAcionarExceptionListenerQuandoEnabledTrue(AJMSContextTest.java:563)
2026-07-27T20:07:39.8114029Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:39.8114345Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:39.8114771Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:39.8115083Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:39.8115313Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:39.8115560Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:39.8115829Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:39.8116100Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:39.8116361Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:39.8116629Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:39.8116923Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:39.8117230Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:39.8117522Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:39.8117803Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:39.8118073Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:39.8118344Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:39.8118611Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:39.8118878Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:39.8119161Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:39.8119493Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8119765Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:39.8120046Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:39.8120316Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:39.8120584Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:39.8120877Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8121142Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:39.8121392Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:39.8121641Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:39.8121896Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8122190Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:39.8122444Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:39.8122675Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:39.8122943Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:39.8123241Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:39.8123510Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8123776Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:39.8124028Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:39.8124284Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:39.8124603Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8124880Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:39.8125139Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:39.8125369Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:39.8125636Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:39.8125940Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:39.8126201Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8126469Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:39.8126715Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:39.8126963Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:39.8127336Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:39.8127600Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:39.8127885Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:39.8128170Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:39.8128467Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:39.8128743Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:39.8129013Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:39.8129278Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:39.8129544Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:39.8129833Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:39.8130110Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:39.8130413Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:39.8130662Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:39.8130902Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:39.8131168Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:39.8131412Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:39.8131657Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:39.8131924Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:39.8132191Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:39.8132449Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:39.8132690Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:39.8132933Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:39.8133161Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:39.8133284Z 
2026-07-27T20:07:39.8133561Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8133861Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8134158Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8134450Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8227657Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8292936Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:39.8293513Z 17:07:39 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:39.8295220Z 17:07:39 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSContext-32] [] Falha ao estabelecer conexão. Aguardando nova tentativa...: java.util.concurrent.ExecutionException: java.lang.RuntimeException: falha simulada
2026-07-27T20:07:39.8295593Z 	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
2026-07-27T20:07:39.8296924Z 	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2096)
2026-07-27T20:07:39.8297506Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContext.createContext(AJMSContext.java:92)
2026-07-27T20:07:39.8298822Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContext.<init>(AJMSContext.java:168)
2026-07-27T20:07:39.8299125Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContextTest.lambda$deveRetornarNullAoInterromperThreadNoTimeout$0(AJMSContextTest.java:613)
2026-07-27T20:07:39.8300827Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:39.8301062Z Caused by: java.lang.RuntimeException: falha simulada
2026-07-27T20:07:39.8302778Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContext.newContext(AJMSContext.java:139)
2026-07-27T20:07:39.8303043Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContext.lambda$createContext$0(AJMSContext.java:79)
2026-07-27T20:07:39.8304844Z 	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.run(CompletableFuture.java:1768)
2026-07-27T20:07:39.8305142Z 	at java.base/java.util.concurrent.CompletableFuture$AsyncSupply.exec(CompletableFuture.java:1760)
2026-07-27T20:07:39.8306847Z 	at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
2026-07-27T20:07:39.8307123Z 	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
2026-07-27T20:07:39.8308837Z 	at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
2026-07-27T20:07:39.8309084Z 	at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
2026-07-27T20:07:39.8310804Z 	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)
2026-07-27T20:07:39.8310971Z 
2026-07-27T20:07:40.0177168Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0177871Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0268310Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0268975Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0377995Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0378622Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0379129Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0379522Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0379908Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0380380Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0448204Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0448837Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0449984Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0450349Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0638431Z [INFO] Tests run: 52, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.059 s -- in br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSContextTest
2026-07-27T20:07:40.0638994Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducerTest
2026-07-27T20:07:40.0755175Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0755828Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0756370Z 17:07:40 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSProducer-33] [] Falha ao enviar mensagem. Aguardando reconexao...: java.lang.RuntimeException: falha
2026-07-27T20:07:40.0756988Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducer.send(AJMSProducer.java:111)
2026-07-27T20:07:40.0757485Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducerTest.lambda$deveAcionarExceptionListenerESendMapRetornarNull$7(AJMSProducerTest.java:599)
2026-07-27T20:07:40.0757834Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:40.0758009Z 
2026-07-27T20:07:40.0845946Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0858192Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0858702Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSProducer-34] [] Aguardando reconexao...
2026-07-27T20:07:40.0859098Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0859583Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0860099Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0860586Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.0860977Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.0861558Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1007450Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1008046Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1008564Z 17:07:40 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSProducer-35] [] Falha ao enviar mensagem. Aguardando reconexao...: java.lang.RuntimeException: falha
2026-07-27T20:07:40.1008950Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducer.send(AJMSProducer.java:182)
2026-07-27T20:07:40.1009728Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducerTest.lambda$deveAcionarExceptionListenerESendSerializableRetornarNull$9(AJMSProducerTest.java:633)
2026-07-27T20:07:40.1010061Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:40.1010143Z 
2026-07-27T20:07:40.1135454Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1292017Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1356025Z 17:07:40 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSProducer-36] [] Falha ao enviar mensagem. Aguardando reconexao...: java.lang.RuntimeException: falha
2026-07-27T20:07:40.1425353Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducer.send(AJMSProducer.java:146)
2026-07-27T20:07:40.1425685Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducerTest.lambda$deveAcionarExceptionListenerESendBytesRetornarNull$8(AJMSProducerTest.java:616)
2026-07-27T20:07:40.1431900Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:40.1432188Z 
2026-07-27T20:07:40.1432835Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1433359Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1434800Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1435284Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1435660Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1436028Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1436365Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1436742Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1437092Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1437675Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1438012Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1438340Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1438725Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1439107Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1454460Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1455086Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1484097Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1487632Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1488254Z 17:07:40 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSProducer-37] [] Falha ao enviar mensagem. Aguardando reconexao...: java.lang.RuntimeException: falha
2026-07-27T20:07:40.1489329Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducer.send(AJMSProducer.java:44)
2026-07-27T20:07:40.1490065Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducerTest.lambda$deveAcionarExceptionListenerESendMessageRetornarNull$5(AJMSProducerTest.java:566)
2026-07-27T20:07:40.1490341Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:40.1490428Z 
2026-07-27T20:07:40.1561124Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1561751Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1562175Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1562617Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1563192Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1563578Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1570756Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1571197Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1633480Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1682941Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1786027Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSProducer-38] [] Aguardando reconexao...
2026-07-27T20:07:40.1786744Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1787210Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1787609Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1787920Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1788231Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1788530Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1801409Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1801910Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1802286Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1802843Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1803197Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1803496Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1803834Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1804717Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1805038Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1805288Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1805537Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1805785Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1835043Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1835633Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1947551Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1948650Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1949127Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSProducer-39] [] Aguardando reconexao...
2026-07-27T20:07:40.1949823Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1950228Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1950568Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1950968Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.1951397Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.1951698Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2081027Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2129099Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2216803Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSProducer-40] [] Aguardando reconexao...
2026-07-27T20:07:40.2249818Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2265684Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2266185Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2266706Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2267952Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2268591Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2268958Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2269273Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2269695Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2270099Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2275895Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2276251Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2350011Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2356206Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2356760Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSProducer-41] [] Aguardando reconexao...
2026-07-27T20:07:40.2357156Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2357587Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2548523Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2549170Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2549664Z 17:07:40 ERROR[br.go.ca.si.pi.su.mq.fa.AJMSProducer-42] [] Falha ao enviar mensagem. Aguardando reconexao...: java.lang.RuntimeException: falha
2026-07-27T20:07:40.2550136Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducer.send(AJMSProducer.java:77)
2026-07-27T20:07:40.2550831Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducerTest.lambda$deveAcionarExceptionListenerESendStringRetornarNull$6(AJMSProducerTest.java:582)
2026-07-27T20:07:40.2551167Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-07-27T20:07:40.2551554Z 
2026-07-27T20:07:40.2551866Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2552192Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2552548Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2552894Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2553210Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2553527Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2553833Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2554150Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2554429Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2554866Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2637364Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2637926Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2638372Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2638768Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2639230Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2639726Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2695800Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2696543Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2835827Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2865718Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2866147Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2866419Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2866764Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2867421Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2931335Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2932145Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.2932818Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.2933405Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.3265121Z [INFO] Tests run: 59, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.241 s -- in br.gov.caixa.siacc.pix.suporte.mq.factory.AJMSProducerTest
2026-07-27T20:07:40.3265732Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.factory.AMQConnectionFactoryTest
2026-07-27T20:07:40.3676049Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.3676719Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.7388214Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.7388976Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.7490368Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.7491113Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.7491604Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.7492016Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.7492482Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.7492852Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.7493163Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.7493541Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.7493924Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Estebelecendo nova conexao...
2026-07-27T20:07:40.7494209Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.AJMSContext-22] [] Conexao estabelecida com sucesso
2026-07-27T20:07:40.7746464Z [INFO] Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.430 s -- in br.gov.caixa.siacc.pix.suporte.mq.factory.AMQConnectionFactoryTest
2026-07-27T20:07:40.7746777Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanActiveMQTest
2026-07-27T20:07:40.9485336Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando Active MQ Server
2026-07-27T20:07:40.9485939Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] localConnectorName: Optional[in-vm]
2026-07-27T20:07:40.9486446Z 17:07:40 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] localConnectoAddress: Optional[vm://0]
2026-07-27T20:07:41.1509693Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221000: primary Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=data/journal,bindingsDirectory=data/bindings,largeMessagesDirectory=data/largemessages,pagingDirectory=data/paging)
2026-07-27T20:07:41.1634273Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221045: libaio is not available, switching the configuration into NIO
2026-07-27T20:07:41.2465966Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221057: Global Max Size is being adjusted to 1/2 of the JVM max size (-Xmx). being defined as 2080374784
2026-07-27T20:07:41.2475508Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-07-27T20:07:41.2586085Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601138: User anonymous@unknown is getting notification info on target resource: null
2026-07-27T20:07:41.2693965Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601019: User anonymous@unknown is getting mbean info on target resource: org.apache.activemq.artemis.core.management.impl.ActiveMQServerControlImpl@221b9c2b
2026-07-27T20:07:41.2776766Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601138: User anonymous@unknown is getting notification info on target resource: ActiveMQServerImpl::name=localhost
2026-07-27T20:07:41.3615966Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601019: User anonymous@unknown is getting mbean info on target resource: org.apache.activemq.artemis.core.management.impl.AddressControlImpl@95237fc
2026-07-27T20:07:41.4496058Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601019: User anonymous@unknown is getting mbean info on target resource: org.apache.activemq.artemis.core.management.impl.AcceptorControlImpl@30ca1686
2026-07-27T20:07:41.4574105Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221007: Server is now active
2026-07-27T20:07:41.4680408Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.32.0 [localhost, nodeID=d26d89a9-89f6-11f1-b157-0050568e3c7c] 
2026-07-27T20:07:41.4685861Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando factory Active MQ
2026-07-27T20:07:41.4686694Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando factory Active MQ
2026-07-27T20:07:41.4687210Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando factory Active MQ
2026-07-27T20:07:41.4687605Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando factory Active MQ
2026-07-27T20:07:41.4688120Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando factory Active MQ
2026-07-27T20:07:41.4688711Z 17:07:41 ERROR[br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] Erro na criacao do FactoryBeanActiveMQ: java.lang.IllegalStateException: java.lang.RuntimeException: java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
2026-07-27T20:07:41.4689177Z 	at org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory.<init>(ActiveMQConnectionFactory.java:242)
2026-07-27T20:07:41.4689712Z 	at org.apache.activemq.artemis.jms.client.ActiveMQJMSConnectionFactory.<init>(ActiveMQJMSConnectionFactory.java:38)
2026-07-27T20:07:41.4690127Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanActiveMQ.factory(FactoryBeanActiveMQ.java:77)
2026-07-27T20:07:41.4715626Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanActiveMQTest.lambda$deveRetornarNullComEnderecoInvalido$0(FactoryBeanActiveMQTest.java:98)
2026-07-27T20:07:41.4716152Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:71)
2026-07-27T20:07:41.4716478Z 	at org.junit.jupiter.api.AssertDoesNotThrow.assertDoesNotThrow(AssertDoesNotThrow.java:58)
2026-07-27T20:07:41.4717307Z 	at org.junit.jupiter.api.Assertions.assertDoesNotThrow(Assertions.java:3228)
2026-07-27T20:07:41.4717709Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanActiveMQTest.deveRetornarNullComEnderecoInvalido(FactoryBeanActiveMQTest.java:98)
2026-07-27T20:07:41.4717938Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:41.4718627Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:41.4719087Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:41.4719470Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:41.4719795Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:41.4720101Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:41.4720516Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:41.4721049Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:41.4721455Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:41.4721891Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:41.4722272Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:41.4722638Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:41.4722988Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:41.4723334Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:41.4723677Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:41.4724014Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:41.4724445Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:41.4724772Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:41.4725009Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:41.4725249Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.4727680Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:41.4728126Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:41.4728474Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:41.4728852Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:41.4729322Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.4729865Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.4730181Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.4730526Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.4730853Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.4731177Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.4731498Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.4731811Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.4732166Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.4732518Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.4732835Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.4733129Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.4733480Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.4733765Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.4734076Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.4734409Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.4734895Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.4735597Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.4736166Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.4736820Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.4737349Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.4737813Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.4738323Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.4738741Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.4739154Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.4739554Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.4739871Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.4740233Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:41.4740597Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:41.4740926Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:41.4741255Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:41.4741591Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:41.4741915Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:41.4742291Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:41.4742624Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:41.4742981Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:41.4743304Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:41.4743577Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:41.4743905Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:41.4744261Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:41.4744616Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:41.4744980Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:41.4745386Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:41.4745776Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:41.4746102Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:41.4746427Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:41.4746773Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:41.4747149Z Caused by: java.lang.RuntimeException: java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
2026-07-27T20:07:41.4747467Z 	at org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory.setBrokerURL(ActiveMQConnectionFactory.java:263)
2026-07-27T20:07:41.4747838Z 	at org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory.<init>(ActiveMQConnectionFactory.java:240)
2026-07-27T20:07:41.4748375Z 	... 78 more
2026-07-27T20:07:41.4748695Z Caused by: java.lang.RuntimeException: java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
2026-07-27T20:07:41.4749088Z 	at org.apache.activemq.artemis.core.client.impl.ServerLocatorImpl.newLocator(ServerLocatorImpl.java:365)
2026-07-27T20:07:41.4749535Z 	at org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory.setBrokerURL(ActiveMQConnectionFactory.java:260)
2026-07-27T20:07:41.4749837Z 	... 79 more
2026-07-27T20:07:41.4750163Z Caused by: java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
2026-07-27T20:07:41.4750522Z 	at java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
2026-07-27T20:07:41.4750930Z 	at org.apache.activemq.artemis.utils.uri.URIFactory.newObject(URIFactory.java:53)
2026-07-27T20:07:41.4751322Z 	at org.apache.activemq.artemis.core.client.impl.ServerLocatorImpl.newLocator(ServerLocatorImpl.java:363)
2026-07-27T20:07:41.4751622Z 	... 80 more
2026-07-27T20:07:41.4751748Z 
2026-07-27T20:07:41.5016126Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando Active MQ Server
2026-07-27T20:07:41.5022175Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] localConnectorName: Optional[in-vm]
2026-07-27T20:07:41.5022783Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] localConnectoAddress: Optional[vm://0]
2026-07-27T20:07:41.5023451Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221000: primary Message Broker is starting with configuration Broker Configuration (clustered=false,journalDirectory=data/journal,bindingsDirectory=data/bindings,largeMessagesDirectory=data/largemessages,pagingDirectory=data/paging)
2026-07-27T20:07:41.5024108Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221045: libaio is not available, switching the configuration into NIO
2026-07-27T20:07:41.5024817Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221057: Global Max Size is being adjusted to 1/2 of the JVM max size (-Xmx). being defined as 2080374784
2026-07-27T20:07:41.5026273Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221043: Protocol module found: [artemis-server]. Adding protocol support for: CORE
2026-07-27T20:07:41.5026625Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601138: User anonymous@unknown is getting notification info on target resource: null
2026-07-27T20:07:41.5027049Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601019: User anonymous@unknown is getting mbean info on target resource: org.apache.activemq.artemis.core.management.impl.ActiveMQServerControlImpl@440e28fa
2026-07-27T20:07:41.5027479Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601138: User anonymous@unknown is getting notification info on target resource: ActiveMQServerImpl::name=localhost
2026-07-27T20:07:41.5027939Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601019: User anonymous@unknown is getting mbean info on target resource: org.apache.activemq.artemis.core.management.impl.AddressControlImpl@3610b408
2026-07-27T20:07:41.5028713Z 17:07:41 INFO [or.ap.ac.au.base-1] [] AMQ601019: User anonymous@unknown is getting mbean info on target resource: org.apache.activemq.artemis.core.management.impl.AcceptorControlImpl@61f18402
2026-07-27T20:07:41.5029162Z 17:07:41 ERROR[or.ap.ac.ar.co.server-1] [] AMQ224104: Error starting the Acceptor in-vm {serverId=0}
2026-07-27T20:07:41.5029719Z 17:07:41 ERROR[or.ap.ac.ar.co.server-1] [] AMQ224000: Failure in initialisation: java.lang.IllegalArgumentException: AMQ229062: Acceptor with id 0 already registered
2026-07-27T20:07:41.5158016Z 	at org.apache.activemq.artemis.core.remoting.impl.invm.InVMRegistry.registerAcceptor(InVMRegistry.java:32)
2026-07-27T20:07:41.5159926Z 	at org.apache.activemq.artemis.core.remoting.impl.invm.InVMAcceptor.start(InVMAcceptor.java:137)
2026-07-27T20:07:41.5160340Z 	at org.apache.activemq.artemis.core.remoting.server.impl.RemotingServiceImpl.startAcceptors(RemotingServiceImpl.java:316)
2026-07-27T20:07:41.5160733Z 	at org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl.completeActivation(ActiveMQServerImpl.java:3647)
2026-07-27T20:07:41.5161147Z 	at org.apache.activemq.artemis.core.server.impl.PrimaryOnlyActivation.run(PrimaryOnlyActivation.java:80)
2026-07-27T20:07:41.5161590Z 	at org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl.internalStart(ActiveMQServerImpl.java:727)
2026-07-27T20:07:41.5162156Z 	at org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl.start(ActiveMQServerImpl.java:617)
2026-07-27T20:07:41.5162528Z 	at org.apache.activemq.artemis.core.server.embedded.EmbeddedActiveMQ.start(EmbeddedActiveMQ.java:134)
2026-07-27T20:07:41.5162900Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanActiveMQ.factory(FactoryBeanActiveMQ.java:72)
2026-07-27T20:07:41.5163297Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanActiveMQTest.deveCriarBrokerEFactoryQuandoEmbedded(FactoryBeanActiveMQTest.java:74)
2026-07-27T20:07:41.5163620Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:41.5175844Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:41.5176274Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:41.5176573Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:41.5176918Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:41.5177500Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:41.5177847Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:41.5178168Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:41.5178537Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:41.5179551Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:41.5180121Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:41.5180494Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:41.5180851Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:41.5181175Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:41.5181487Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:41.5181828Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:41.5182297Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:41.5182731Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:41.5184307Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:41.5184715Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5185079Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:41.5185439Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:41.5185774Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:41.5186096Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:41.5186403Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5186735Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.5188176Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.5188493Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.5188795Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5189154Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.5189485Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.5189785Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.5190179Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.5190582Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.5190939Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5191284Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.5191627Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.5191980Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.5192501Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5192890Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.5193196Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.5193521Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.5193911Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.5194321Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.5194791Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5195410Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.5195929Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.5213056Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.5213384Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5213678Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.5213996Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.5214294Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:41.5214650Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:41.5214895Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:41.5215122Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:41.5215334Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:41.5215661Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:41.5215886Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:41.5216116Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:41.5216352Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:41.5216557Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:41.5216738Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:41.5216934Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:41.5217133Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:41.5217335Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:41.5217557Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:41.5217775Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:41.5217980Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:41.5218177Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:41.5218364Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:41.5218546Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:41.5218621Z 
2026-07-27T20:07:41.5219047Z 17:07:41 INFO [or.ap.ac.ar.co.server-1] [] AMQ221001: Apache ActiveMQ Artemis Message Broker version 2.32.0 [localhost, nodeID=d2ab2eee-89f6-11f1-b157-0050568e3c7c] 
2026-07-27T20:07:41.5219330Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] iniciando factory Active MQ
2026-07-27T20:07:41.5219606Z 17:07:41 ERROR[br.go.ca.si.pi.su.mq.fa.FactoryBeanActiveMQ-1] [] Servidor ActiveMQ não configurado para este ambiente
2026-07-27T20:07:41.5285921Z [INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.750 s -- in br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanActiveMQTest
2026-07-27T20:07:41.5286254Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQBaixaTest
2026-07-27T20:07:41.5608100Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQBaixa-1] [] Factory IBM MQ inicializada com sucesso.
2026-07-27T20:07:41.5609162Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQBaixa-1] [] Factory IBM MQ inicializada com sucesso.
2026-07-27T20:07:41.5609672Z 17:07:41 ERROR[br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQBaixa-1] [] Servidor MQ não configurado para este ambiente
2026-07-27T20:07:41.5666219Z 17:07:41 ERROR[br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQBaixa-1] [] Falha ao criar connection factory: java.lang.RuntimeException: erro simulado
2026-07-27T20:07:41.5667094Z 	at com.ibm.msg.client.jakarta.jms.JmsFactoryFactory.getInstance(JmsFactoryFactory.java:157)
2026-07-27T20:07:41.5667652Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQBaixa.factory(FactoryBeanIBMMQBaixa.java:77)
2026-07-27T20:07:41.5668419Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQBaixaTest.lambda$deveLancarExcecaoAoFalharNaCriacaoDoFactory$3(FactoryBeanIBMMQBaixaTest.java:105)
2026-07-27T20:07:41.5669529Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-27T20:07:41.5670038Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-27T20:07:41.5670519Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-27T20:07:41.5671237Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQBaixaTest.deveLancarExcecaoAoFalharNaCriacaoDoFactory(FactoryBeanIBMMQBaixaTest.java:105)
2026-07-27T20:07:41.5671774Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:41.5672407Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:41.5674509Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:41.5675071Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:41.5675551Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:41.5676157Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:41.5678428Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:41.5678914Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:41.5679459Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:41.5680047Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:41.5682716Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:41.5683460Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:41.5684079Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:41.5684741Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:41.5685286Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:41.5685810Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:41.5686395Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:41.5688489Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:41.5688997Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:41.5689794Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5690387Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:41.5692510Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:41.5693126Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:41.5693686Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:41.5694218Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5694849Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.5695417Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.5695861Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.5696502Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5697601Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.5697967Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.5698182Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.5698428Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.5698719Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.5698981Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5699220Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.5699445Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.5699659Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.5699893Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5700119Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.5700326Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.5700507Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.5700730Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.5700972Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.5701188Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5701402Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.5701605Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.5701801Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.5702016Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.5702369Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.5702578Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.5702846Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:41.5703212Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:41.5703537Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:41.5703869Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:41.5704220Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:41.5704678Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:41.5705062Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:41.5705408Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:41.5705740Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:41.5705943Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:41.5706135Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:41.5706324Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:41.5706507Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:41.5706716Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:41.5707022Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:41.5707242Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:41.5707472Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:41.5707666Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:41.5707843Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:41.5708019Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:41.5708095Z 
2026-07-27T20:07:41.5791807Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQBaixa-1] [] Factory IBM MQ inicializada com sucesso.
2026-07-27T20:07:41.5885890Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.064 s -- in br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQBaixaTest
2026-07-27T20:07:41.5985528Z [INFO] Running br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQTest
2026-07-27T20:07:41.5993284Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQ-1] [] Factory IBM MQ configurada com sucesso.
2026-07-27T20:07:41.6005688Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQ-1] [] Factory IBM MQ configurada com sucesso.
2026-07-27T20:07:41.6014879Z 17:07:41 ERROR[br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQ-1] [] Servidor MQ não configurado para este ambiente
2026-07-27T20:07:41.6015756Z 17:07:41 ERROR[br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQ-1] [] Falha ao criar connection factory: java.lang.RuntimeException: erro simulado
2026-07-27T20:07:41.6016249Z 	at com.ibm.msg.client.jakarta.jms.JmsFactoryFactory.getInstance(JmsFactoryFactory.java:157)
2026-07-27T20:07:41.6017973Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQ.factory(FactoryBeanIBMMQ.java:78)
2026-07-27T20:07:41.6018394Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQTest.lambda$deveLancarExcecaoAoFalharNaCriacaoDoFactory$3(FactoryBeanIBMMQTest.java:105)
2026-07-27T20:07:41.6018930Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:53)
2026-07-27T20:07:41.6019332Z 	at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
2026-07-27T20:07:41.6020952Z 	at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3115)
2026-07-27T20:07:41.6021280Z 	at br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQTest.deveLancarExcecaoAoFalharNaCriacaoDoFactory(FactoryBeanIBMMQTest.java:105)
2026-07-27T20:07:41.6021586Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-07-27T20:07:41.6021982Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-07-27T20:07:41.6022358Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-07-27T20:07:41.6022711Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-07-27T20:07:41.6023013Z 	at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:728)
2026-07-27T20:07:41.6023424Z 	at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
2026-07-27T20:07:41.6023754Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
2026-07-27T20:07:41.6024085Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
2026-07-27T20:07:41.6024410Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
2026-07-27T20:07:41.6024836Z 	at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
2026-07-27T20:07:41.6025440Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
2026-07-27T20:07:41.6025789Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
2026-07-27T20:07:41.6026069Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
2026-07-27T20:07:41.6026325Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
2026-07-27T20:07:41.6026566Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
2026-07-27T20:07:41.6026812Z 	at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
2026-07-27T20:07:41.6028685Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
2026-07-27T20:07:41.6029160Z 	at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
2026-07-27T20:07:41.6029573Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:218)
2026-07-27T20:07:41.6029961Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.6030299Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:214)
2026-07-27T20:07:41.6030662Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:139)
2026-07-27T20:07:41.6031038Z 	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:69)
2026-07-27T20:07:41.6031534Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
2026-07-27T20:07:41.6033005Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.6033402Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.6033707Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.6033993Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.6034437Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.6034877Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.6035244Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.6035566Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.6035921Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.6036273Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.6036584Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.6036964Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.6037281Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.6037592Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.6037904Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.6038223Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.6039532Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.6039858Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-07-27T20:07:41.6040243Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
2026-07-27T20:07:41.6040704Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
2026-07-27T20:07:41.6041090Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.6041441Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
2026-07-27T20:07:41.6041802Z 	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
2026-07-27T20:07:41.6042160Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
2026-07-27T20:07:41.6042491Z 	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
2026-07-27T20:07:41.6042808Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
2026-07-27T20:07:41.6043166Z 	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
2026-07-27T20:07:41.6043636Z 	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
2026-07-27T20:07:41.6044251Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
2026-07-27T20:07:41.6044969Z 	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
2026-07-27T20:07:41.6045758Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198)
2026-07-27T20:07:41.6046316Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169)
2026-07-27T20:07:41.6046745Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93)
2026-07-27T20:07:41.6047196Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58)
2026-07-27T20:07:41.6047637Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141)
2026-07-27T20:07:41.6048005Z 	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57)
2026-07-27T20:07:41.6048330Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103)
2026-07-27T20:07:41.6048605Z 	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85)
2026-07-27T20:07:41.6048909Z 	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47)
2026-07-27T20:07:41.6049280Z 	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56)
2026-07-27T20:07:41.6051062Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
2026-07-27T20:07:41.6051527Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
2026-07-27T20:07:41.6051979Z 	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
2026-07-27T20:07:41.6052631Z 	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
2026-07-27T20:07:41.6053989Z 	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
2026-07-27T20:07:41.6054489Z 	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
2026-07-27T20:07:41.6055025Z 	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
2026-07-27T20:07:41.6055354Z 
2026-07-27T20:07:41.6055933Z 17:07:41 INFO [br.go.ca.si.pi.su.mq.fa.FactoryBeanIBMMQ-1] [] Factory IBM MQ configurada com sucesso.
2026-07-27T20:07:41.6089777Z [INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.022 s -- in br.gov.caixa.siacc.pix.suporte.mq.factory.FactoryBeanIBMMQTest
2026-07-27T20:07:41.6978217Z [INFO] 
2026-07-27T20:07:41.6978654Z [INFO] Results:
2026-07-27T20:07:41.6979388Z [INFO] 
2026-07-27T20:07:41.6979640Z [INFO] Tests run: 169, Failures: 0, Errors: 0, Skipped: 0
2026-07-27T20:07:41.6979899Z [INFO] 
2026-07-27T20:07:41.6980195Z [INFO] 
2026-07-27T20:07:41.6981465Z [INFO] --- jacoco-maven-plugin:0.8.8:report (post-unit-test) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:41.6981872Z [INFO] Loading execution data file /opt/ads-agent/_work/12305/s/target/jacoco.exec
2026-07-27T20:07:41.8028099Z [INFO] Analyzed bundle 'SIACC-pixautomatico-mq-suporte' with 10 classes
2026-07-27T20:07:41.8983802Z [INFO] 
2026-07-27T20:07:41.8984642Z [INFO] --- maven-jar-plugin:3.1.0:jar (default-jar) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:42.0196049Z [INFO] Building jar: /opt/ads-agent/_work/12305/s/target/SIACC-pixautomatico-mq-suporte-1.0.18-SNAPSHOT.jar
2026-07-27T20:07:42.0568118Z [INFO] 
2026-07-27T20:07:42.0568939Z [INFO] --- quarkus-maven-plugin:3.8.3:build (default) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:42.2855758Z [INFO] LaunchMode NORMAL
2026-07-27T20:07:42.2865651Z [INFO] LaunchMode NORMAL
2026-07-27T20:07:42.4125859Z [INFO] ----- CONFIGURACOES INTERNAS REFERENCIADAS -----
2026-07-27T20:07:42.4295893Z [INFO] 1 - quarkus.application.name = "[NAO INFORMADO]"
2026-07-27T20:07:42.4296941Z [INFO] 2 - quarkus.application.version = "[NAO INFORMADO]"
2026-07-27T20:07:42.4297167Z [INFO] 3 - APPLICATION.ID = "[NAO INFORMADO]"
2026-07-27T20:07:42.4297312Z [INFO]  
2026-07-27T20:07:42.4298357Z [INFO] ----- CONFIGURACOES API-SUPORTE -----
2026-07-27T20:07:42.4299202Z [INFO] 4 - app.name = "${quarkus.application.name}" (1)
2026-07-27T20:07:42.4299466Z [INFO] 5 - app.version = "${quarkus.application.version}" (2)
2026-07-27T20:07:42.4299744Z [INFO] 6 - app.env = "PRD"
2026-07-27T20:07:42.4299956Z [INFO] 7 - app.swagger = "false"
2026-07-27T20:07:42.4300171Z [INFO] 8 - app.swagger.admin = "false"
2026-07-27T20:07:42.4300415Z [INFO] 9 - SIACC.APPLICATION.ID = "[NAO INFORMADO]"
2026-07-27T20:07:42.4300572Z [INFO]  
2026-07-27T20:07:42.4300744Z [INFO] CONFIGURACOES DE API
2026-07-27T20:07:42.4300984Z [INFO] 10 - apim.config.apikey = "l73d2c2aebb40d479083fa48d018530d92"
2026-07-27T20:07:42.4301224Z [INFO] 11 - client.timeout = "5000"
2026-07-27T20:07:42.4301489Z [INFO] 12 - SIACC.FRONTEND.SERVICOS.URL = "https://siacc-servicos-frontend-des.apps.nprd.caixa"
2026-07-27T20:07:42.4301806Z [INFO] 13 - SIACC.FRONTEND.PIXAUTOMATICO.URL = "https://siacc-pixautomatico-frontend-des.apps.nprd.caixa"
2026-07-27T20:07:42.4302142Z [INFO] 14 - SIACC.FRONTEND.CENTRALIZADOR.URL = "https://siacc-servicos-frontend-centralizador-des.apps.nprd.caixa"
2026-07-27T20:07:42.4302471Z [INFO] 15 - SIACC.API.CENTRALIZADOR.URL = "https://siacc-servicos-api-centralizador-des.apps.nprd.caixa"
2026-07-27T20:07:42.4302776Z [INFO] 16 - SIACC.API.AUDITORIA.URL = "https://siacc-pixautomatico-auditoria-des.apps.nprd.caixa"
2026-07-27T20:07:42.4303146Z [INFO] 17 - SIACC.API.CONVENIO.URL = "https://siacc-pixautomatico-api-convenio-des.apps.nprd.caixa"
2026-07-27T20:07:42.4303471Z [INFO] 18 - SIACC.API.SIMULADOR.URL = "https://siacc-pixautomatico-api-simulador-des.apps.nprd.caixa"
2026-07-27T20:07:42.4303775Z [INFO] 19 - SIACC.API.PARAMETROS.URL = "https://siacc-pixautomatico-api-parametros-des.apps.nprd.caixa"
2026-07-27T20:07:42.4304101Z [INFO] 20 - SIACC.API.CONTROLE.REQUISICOES.URL = "https://siacc-pixautomatico-api-controle-requisicoes-des.apps.nprd.caixa"
2026-07-27T20:07:42.4304412Z [INFO] 21 - SIACC.API.WEBHOOK.URL = "https://siacc-pixautomatico-api-webhook-des.apps.nprd.caixa"
2026-07-27T20:07:42.4304816Z [INFO] 22 - SIACC.API.PAGAMENTO.URL = "https://siacc-pixautomatico-api-pagamento-des.apps.nprd.caixa"
2026-07-27T20:07:42.4305440Z [INFO] 23 - SIACC.API.BATIMENTO.URL = "https://siacc-pixautomatico-api-batimento-des.apps.nprd.caixa"
2026-07-27T20:07:42.4305801Z [INFO] 24 - SIACC.API.GERENCIADOR.ARQUIVOS.URL = "https://siacc-servicos-api-gerenciador-arquivos-des.apps.nprd.caixa"
2026-07-27T20:07:42.4306107Z [INFO] 25 - SIACC.BATCH.AUDITORIA.URL = "https://siacc-pixautomatico-batch-auditoria-des.apps.nprd.caixa"
2026-07-27T20:07:42.4306396Z [INFO] 26 - SIACC.BATCH.MANUTENCAO.URL = "https://siacc-pixautomatico-batch-manutencao-des.apps.nprd.caixa"
2026-07-27T20:07:42.4306679Z [INFO] 27 - SIACC.BATCH.REPASSE.URL = "https://siacc-pixautomatico-batch-repasse-des.apps.nprd.caixa"
2026-07-27T20:07:42.4306980Z [INFO] 28 - SIACC.BATCH.REMESSA.URL = "https://siacc-pixautomatico-batch-remessa-des.apps.nprd.caixa"
2026-07-27T20:07:42.4307190Z [INFO] 29 - quarkus.tls.trust-all = "true"
2026-07-27T20:07:42.4307432Z [INFO] 30 - quarkus.rest-client.siacc-auditoria.url = "${SIACC.API.AUDITORIA.URL}" (16)
2026-07-27T20:07:42.4307682Z [INFO] 31 - quarkus.rest-client.siacc-convenio.url = "${SIACC.API.CONVENIO.URL}" (17)
2026-07-27T20:07:42.4307930Z [INFO] 32 - quarkus.rest-client.siacc-simulador.url = "${SIACC.API.SIMULADOR.URL}" (18)
2026-07-27T20:07:42.4308183Z [INFO] 33 - quarkus.rest-client.siacc-parametros.url = "${SIACC.API.PARAMETROS.URL}" (19)
2026-07-27T20:07:42.4308442Z [INFO] 34 - quarkus.rest-client.siacc-centralizador.url = "${SIACC.API.CENTRALIZADOR.URL}" (15)
2026-07-27T20:07:42.4308712Z [INFO] 35 - quarkus.rest-client.siacc-gerenciador-arquivos.url = "${SIACC.API.GERENCIADOR.ARQUIVOS.URL}" (24)
2026-07-27T20:07:42.4308972Z [INFO] 36 - quarkus.rest-client.siacc-tarifas.url = "${SIACC.BATCH.REPASSE.URL}" (27)
2026-07-27T20:07:42.4309194Z [INFO] 37 - quarkus.rest-client.connect-timeout = "${client.timeout}" (11)
2026-07-27T20:07:42.4309426Z [INFO] 38 - quarkus.rest-client.read-timeout = "${client.timeout}" (11)
2026-07-27T20:07:42.4309811Z [INFO]  
2026-07-27T20:07:42.4309940Z [INFO] CONFIGURACOES JWT
2026-07-27T20:07:42.4310151Z [INFO] 39 - SIACC.LOGIN-CLIENT.URL = "${SIACC.SSO.INTRANET.URL}" (43)
2026-07-27T20:07:42.4310514Z [INFO] 40 - SIACC.SSO.INTERNET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44R... 4zBwIDAQAB" [-1986508888]
2026-07-27T20:07:42.4310828Z [INFO] 41 - SIACC.SSO.INTERNET.URL = "https://logindes.caixa.gov.br/auth/realms/internet"
2026-07-27T20:07:42.4311238Z [INFO] 42 - SIACC.SSO.INTRANET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe... FDYwIDAQAB" [-234932412]
2026-07-27T20:07:42.4311534Z [INFO] 43 - SIACC.SSO.INTRANET.URL = "https://login.des.caixa/auth/realms/intranet"
2026-07-27T20:07:42.4311781Z [INFO] 44 - quarkus.oidc."servico-internet".url = "${SIACC.SSO.INTERNET.URL}" (41)
2026-07-27T20:07:42.4312041Z [INFO] 45 - quarkus.oidc."servico-internet".public-key = "${SIACC.SSO.INTERNET.PUBLIC-KEY}" (40)
2026-07-27T20:07:42.4312297Z [INFO] 46 - quarkus.oidc."servico-intranet-web".url = "${SIACC.SSO.INTRANET.URL}" (43)
2026-07-27T20:07:42.4312558Z [INFO] 47 - quarkus.oidc."servico-intranet-web".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (42)
2026-07-27T20:07:42.4312882Z [INFO] 48 - quarkus.oidc."servico-intranet-servico".url = "${SIACC.SSO.INTRANET.URL}" (43)
2026-07-27T20:07:42.4313142Z [INFO] 49 - quarkus.oidc."servico-intranet-servico".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (42)
2026-07-27T20:07:42.4313298Z [INFO]  
2026-07-27T20:07:42.4313429Z [INFO] CONFIGURACOES DE CACHE
2026-07-27T20:07:42.4313644Z [INFO] 50 - quarkus.cache.caffeine."cacheService".initial-capacity = "50"
2026-07-27T20:07:42.4313870Z [INFO] 51 - quarkus.cache.caffeine."cacheService".maximum-size = "500"
2026-07-27T20:07:42.4314091Z [INFO] 52 - quarkus.cache.caffeine."cacheService".expire-after-write = "8H"
2026-07-27T20:07:42.4314330Z [INFO] 53 - quarkus.cache.caffeine."cacheService".expire-after-access = "8H"
2026-07-27T20:07:42.4314473Z [INFO]  
2026-07-27T20:07:42.4314688Z [INFO] HTTP DE SEGURANCA DO CLIENTE
2026-07-27T20:07:42.4314819Z [INFO]  
2026-07-27T20:07:42.4314948Z [INFO] HTTP DE SEGURANCA DO CLIENTE
2026-07-27T20:07:42.4315191Z [INFO] 54 - quarkus.oidc-client.auth-server-url = "https://login.des.caixa/auth/realms/intranet"
2026-07-27T20:07:42.4315423Z [INFO] 55 - quarkus.oidc-client.client-id = "cli-ser-acc-pxa"
2026-07-27T20:07:42.4315751Z [INFO] 56 - quarkus.oidc-client.credentials.secret = "[hash:4eba39da681cee1ddb62d761588688cbca1df7d9a12939befe28fcbf702393a1]"
2026-07-27T20:07:42.4315937Z [INFO]  
2026-07-27T20:07:42.4316070Z [INFO] CONFIGURACOES DE SEGURANCA ADMINISTRATIVA
2026-07-27T20:07:42.4316267Z [INFO] 57 - SIACC.ADMIN.ROLES = "SPI_PAGAMENTOS,ACC_ADMIN"
2026-07-27T20:07:42.4316458Z [INFO] 58 - SIACC.ADMIN.PATH = "/admin/*"
2026-07-27T20:07:42.4316691Z [INFO] 59 - quarkus.http.auth.policy.role-admin.roles-allowed = "${SIACC.ADMIN.ROLES}" (57)
2026-07-27T20:07:42.4317026Z [INFO] 60 - quarkus.http.auth.permission.administration.paths = "${SIACC.ADMIN.PATH}" (58)
2026-07-27T20:07:42.4317270Z [INFO] 61 - quarkus.http.auth.permission.administration.policy = "role-admin"
2026-07-27T20:07:42.4317521Z [INFO] 62 - quarkus.http.auth.permission.permit1.paths = "/admin/swagger,/admin/authorization"
2026-07-27T20:07:42.4317754Z [INFO] 63 - quarkus.http.auth.permission.permit1.policy = "permit"
2026-07-27T20:07:42.4317893Z [INFO]  
2026-07-27T20:07:42.4318016Z [INFO] HTTP DE LOG
2026-07-27T20:07:42.4318263Z [INFO] 64 - quarkus.log.console.format = "%d{HH:mm:ss} %-5p[%c{2.}-%t{id}] [%X{correlationId}] %s%e%n"
2026-07-27T20:07:42.4318523Z [INFO] 65 - quarkus.log.category."org.jboss.resteasy.reactive.client".level = "ERROR"
2026-07-27T20:07:42.4318727Z [INFO] 66 - SIACC.GENERAL.LOG.LEVEL = "INFO"
2026-07-27T20:07:42.4318935Z [INFO] 67 - quarkus.log.category.level = "${SIACC.GENERAL.LOG.LEVEL}" (66)
2026-07-27T20:07:42.4319230Z [INFO] 68 - quarkus.log.category.min-level = "${SIACC.GENERAL.LOG.LEVEL}" (66)
2026-07-27T20:07:42.4319424Z [INFO] 69 - SIACC.LOG.LEVEL = "DEBUG"
2026-07-27T20:07:42.4319643Z [INFO] 70 - quarkus.log.category."br.gov.caixa".level = "${SIACC.LOG.LEVEL}" (69)
2026-07-27T20:07:42.4319888Z [INFO] 71 - quarkus.log.category."br.gov.caixa".min-level = "${SIACC.LOG.LEVEL}" (69)
2026-07-27T20:07:42.4320036Z [INFO]  
2026-07-27T20:07:42.4320163Z [INFO] CONFIGURACOES DA APLICACAO
2026-07-27T20:07:42.4320343Z [INFO] 72 - quarkus.http.root-path = "/"
2026-07-27T20:07:42.4320526Z [INFO] 73 - quarkus.http.cors = "true"
2026-07-27T20:07:42.4320711Z [INFO] 74 - quarkus.http.cors.origins = "*"
2026-07-27T20:07:42.4320909Z [INFO] 75 - quarkus.smallrye-health.ui.enable = "false"
2026-07-27T20:07:42.4321105Z [INFO] 76 - quarkus.smallrye-health.root-path = "//healthx"
2026-07-27T20:07:42.4321309Z [INFO] 77 - quarkus.health.extensions.enabled = "false"
2026-07-27T20:07:42.4321511Z [INFO] 78 - quarkus.http.ssl.protocols = "TLSv1.2"
2026-07-27T20:07:42.4321717Z [INFO] 79 - properties.hash.seed = "167243864789133"
2026-07-27T20:07:42.4321925Z [INFO] 80 - SIACC.PROPERTIES.FILE = "application.properties"
2026-07-27T20:07:42.4322133Z [INFO] 81 - SIACC.PROPERTIES.SOURCE = "target/classes/"
2026-07-27T20:07:42.4322327Z [INFO] 82 - SIACC.PROPERTIES.MAXLENGTH = "160"
2026-07-27T20:07:42.4322568Z [INFO] 83 - SIACC.PROPERTIES.SHOWCOMPACT = "true"
2026-07-27T20:07:42.4322759Z [INFO] 84 - SIACC.PROPERTIES.SHOWHASH = "true"
2026-07-27T20:07:42.4322954Z [INFO] 85 - SIACC.PROPERTIES.SHOWORIGINAL = "true"
2026-07-27T20:07:42.4323145Z [INFO] 86 - SIACC.PROPERTIES.SHOWINDEX = "true"
2026-07-27T20:07:42.4323333Z [INFO] 87 - SIACC.PROPERTIES.CUTOFF = "10"
2026-07-27T20:07:42.4323597Z [INFO] 88 - SIACC.PROPERTIES.PATTERN = "\$\{(.*?)\}"
2026-07-27T20:07:42.4323807Z [INFO] 89 - SIACC.AUDITORIA.FUNCIONALIDADE = "[NAO INFORMADO]"
2026-07-27T20:07:42.4324062Z [INFO] 90 - SIACC.SWAGGER.PROXY.URL = "http://localhost:8080/swagger/{tag}"
2026-07-27T20:07:42.4324283Z [INFO] 91 - SIACC.TAG = "{tag}"
2026-07-27T20:07:42.4324416Z [INFO]  
2026-07-27T20:07:42.4324623Z [INFO] CONFIGURACOES DO SWAGGER
2026-07-27T20:07:42.4324834Z [INFO] 92 - quarkus.swagger-ui.always-include = "true"
2026-07-27T20:07:42.4325048Z [INFO] 93 - quarkus.smallrye-openapi.always-run-filter = "true"
2026-07-27T20:07:42.4325258Z [INFO] 94 - quarkus.smallrye-openapi.path = "/swagger"
2026-07-27T20:07:42.4325472Z [INFO] 95 - quarkus.swagger-ui.path = "/swagger-ui"
2026-07-27T20:07:42.4325707Z [INFO] 96 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
2026-07-27T20:07:42.4326344Z [INFO] 97 - mp.openapi.extensions.smallrye.info.title = "SIACC - PIX Autom�tico"
2026-07-27T20:07:42.4326599Z [INFO] 98 - mp.openapi.extensions.smallrye.info.name = "${APPLICATION.ID}" (3)
2026-07-27T20:07:42.4326867Z [INFO] 99 - mp.openapi.extensions.smallrye.info.description = "Modelo padr�o de pagamento PIX Autom�tico."
2026-07-27T20:07:42.4327118Z [INFO] 100 - mp.openapi.extensions.smallrye.info.version = "${app.version}" (5)
2026-07-27T20:07:42.4327381Z [INFO] 101 - mp.openapi.filter = "br.gov.caixa.siacc.pix.suporte.helper.OpenAPIFilter"
2026-07-27T20:07:42.4327636Z [INFO] 102 - mp.openapi.extensions.smallrye.info.contact.email = "suporte@caixa.gov.br"
2026-07-27T20:07:42.4327870Z [INFO] 103 - mp.openapi.extensions.smallrye.info.contact.name = "Suporte"
2026-07-27T20:07:42.4328016Z [INFO]  
2026-07-27T20:07:42.4328145Z [INFO] CONFIGURACOES DE DEPENDENCIAS
2026-07-27T20:07:42.4328345Z [INFO] 104 - SIACC.DEPENDENCY.SCHEDULE = "0/10 * * ? * * *"
2026-07-27T20:07:42.4328538Z [INFO] 105 - SIACC.DEPENDENCY.INITIAL-DELAY = "5000"
2026-07-27T20:07:42.4328745Z [INFO] 106 - SIACC.DEPENDENCY.AUDITORIA.MONITOR = "true"
2026-07-27T20:07:42.4328948Z [INFO] 107 - SIACC.DEPENDENCY.SSO.MONITOR = "false"
2026-07-27T20:07:42.4329084Z [INFO]  
2026-07-27T20:07:42.4329203Z [INFO] RESOURCES
2026-07-27T20:07:42.4329384Z [INFO] 108 - SIACC.APISERVICE.AVAILABLE = "true"
2026-07-27T20:07:42.4329514Z [INFO]  
2026-07-27T20:07:42.4329716Z [INFO] MENSAGENS DE RESPOSTA PADRAO
2026-07-27T20:07:42.4329938Z [INFO] 109 - SIACC.API.UNAVAILABLE.MESSAGE = "Servi�o temporariamente indispon�vel"
2026-07-27T20:07:42.4330190Z [INFO] 110 - SIACC.API.UNAVAILABLE.DESCRIPTION = "Tente novamente em alguns instantes"
2026-07-27T20:07:42.4330424Z [INFO] 111 - SIACC.API.BADREQUEST.MESSAGE = "A requisi��o recebida n�o � v�lida"
2026-07-27T20:07:42.4330708Z [INFO] 112 - SIACC.API.BADREQUEST.DESCRIPTION = "verifique e tente novamente: {}"
2026-07-27T20:07:42.4384285Z [INFO] 113 - SIACC.API.UNAUTHORIZED.MESSAGE = "Acesso n�o autorizado"
2026-07-27T20:07:42.4386761Z [INFO] 114 - SIACC.API.UNAUTHORIZED.DESCRIPTION = "Verifique suas credenciais e tente novamente"
2026-07-27T20:07:42.4415324Z [INFO] 115 - SIACC.API.FORBIDDEN.MESSAGE = "Voc� n�o possui acesso a este recurso"
2026-07-27T20:07:42.4428601Z [INFO] 116 - SIACC.API.FORBIDDEN.DESCRIPTION = "Verifique suas credenciais e tente novamente"
2026-07-27T20:07:42.4429094Z [INFO] 117 - SIACC.API.AUTHENTICATIONFAIL.MESSAGE = "Falha de autentica��o"
2026-07-27T20:07:42.4429611Z [INFO] 118 - SIACC.API.AUTHENTICATIONFAIL.DESCRIPTION = "Verifique suas credenciais e tente novamente"
2026-07-27T20:07:42.4430017Z [INFO] 119 - SIACC.API.INTERNALERROR.MESSAGE = "No momento n�o foi poss�vel processar sua requisi��o"
2026-07-27T20:07:42.4430649Z [INFO] 120 - SIACC.API.INTERNALERROR.DESCRIPTION = "Solicitamos que tente novamente em alguns instantes"
2026-07-27T20:07:42.4430931Z [INFO] 121 - SIACC.API.EXCEPTION.LOGALL = "false"
2026-07-27T20:07:42.4431187Z [INFO] 122 - SIACC.EXCEPTION.ON.RESPONSE = "false"
2026-07-27T20:07:42.4431510Z [INFO] 123 - SIACC.CONFIG.PROPERTIES."APPLICATION".source = "/application.properties"
2026-07-27T20:07:42.4431832Z [INFO] 124 - SIACC.CONFIG.PROPERTIES."API-SUPORTE".source = "META-INF/application.api.properties"
2026-07-27T20:07:42.4432044Z [INFO]  
2026-07-27T20:07:42.4432222Z [INFO] HEALTH CUSTOM PROPERTIES
2026-07-27T20:07:42.4432397Z [INFO]  
2026-07-27T20:07:42.4432569Z [INFO] DEV LOCAL
2026-07-27T20:07:42.4432732Z [INFO]  
2026-07-27T20:07:42.4432883Z [INFO] SWAGGER / OPENAPI
2026-07-27T20:07:42.4433127Z [INFO] 125 - quarkus.swagger-ui.always-include = "true"
2026-07-27T20:07:42.4433408Z [INFO] 126 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
2026-07-27T20:07:42.4433675Z [INFO] 127 - quarkus.smallrye-openapi.path = "/swagger"
2026-07-27T20:07:42.4433933Z [INFO] 128 - quarkus.swagger-ui.path = "/swagger-ui"
2026-07-27T20:07:42.4434202Z [INFO] 129 - quarkus.smallrye-openapi.info-title = "${app.name}" (4)
2026-07-27T20:07:42.4434469Z [INFO] 130 - quarkus.smallrye-openapi.info-version = "${app.version}" (5)
2026-07-27T20:07:42.4434890Z [INFO] 131 - quarkus.smallrye-openapi.info-description = "Modelo padr�o de pagamento PIX Autom�tico."
2026-07-27T20:07:42.4435184Z [INFO] 132 - quarkus.smallrye-openapi.info-contact-email = "contato@caixa.gov.br"
2026-07-27T20:07:42.4435467Z [INFO] 133 - quarkus.smallrye-openapi.info-contact-name = "contato"
2026-07-27T20:07:42.4435715Z [INFO] 134 - quarkus.devservices.enabled = "false"
2026-07-27T20:07:42.4436043Z [INFO] 135 - SIACC.API.CAIXA.URL = "https://api.des.caixa:8443"
2026-07-27T20:07:42.4436309Z [INFO] 136 - SIACC.API.DES.CAIXA.URL = "${SIACC.API.CAIXA.URL}" (135)
2026-07-27T20:07:42.4436547Z [INFO] 137 - SICLI.CLIENT.TIMEOUT = "10000"
2026-07-27T20:07:42.4436847Z [INFO] 138 - quarkus.rest-client.sicli.url = "https://api.des.caixa:8443/cadastro"
2026-07-27T20:07:42.4437137Z [INFO] 139 - quarkus.rest-client.sicli.connect-timeout = "${SICLI.CLIENT.TIMEOUT}" (137)
2026-07-27T20:07:42.4437503Z [INFO] 140 - quarkus.rest-client.sicli.read-timeout = "${SICLI.CLIENT.TIMEOUT}" (137)
2026-07-27T20:07:42.4437802Z [INFO] 141 - quarkus.rest-client.sicow.url = "https://api.des.caixa:8443/pesquisa-cadastral/v1"
2026-07-27T20:07:42.4438154Z [INFO] 142 - quarkus.rest-client.nsgd-api.url = "https://api.des.caixa:8443/conta-deposito/consulta-conta"
2026-07-27T20:07:42.4438494Z [INFO] 143 - quarkus.rest-client.siico-info-privadas.url = "https://api.des.caixa:8443/informacoes-corporativas-privadas"
2026-07-27T20:07:42.4438984Z [INFO] 144 - quarkus.rest-client.dict.url = "https://api.des.caixa:8443/transacoes-financeiras/pagamentos-instantaneos/dict-estatistica/v2/estatisticas"
2026-07-27T20:07:42.4439293Z [INFO] 145 - SIACC.LISTA.CODIGOS.VINCULOS.SOCIOS = "6,8,23,32,36,48,49,87"
2026-07-27T20:07:42.4439653Z [INFO] 146 - SIACC.IMPEDIMENTOS.SICOW = "empregados_trabalho_escravo,informacoes_seguranca,pld,proibido_contratar_setor_publico"
2026-07-27T20:07:42.4439854Z [INFO]  
2026-07-27T20:07:42.4440014Z [INFO] CONFIGURACOES DE PROXY
2026-07-27T20:07:42.4440228Z [INFO] 147 - PROXY.HOST = "[NAO INFORMADO]"
2026-07-27T20:07:42.4440482Z [INFO] 148 - PROXY.PORT = "[NAO INFORMADO]"
2026-07-27T20:07:42.4440661Z [INFO] Definicoes de variaveis para o cache
2026-07-27T20:07:42.4440898Z [INFO] 149 - SIACC.CACHE.INITIAL-SIZE = "50"
2026-07-27T20:07:42.4441135Z [INFO] 150 - SIACC.CACHE.MAXIMUM-SIZE = "500"
2026-07-27T20:07:42.4441383Z [INFO] 151 - SIACC.CACHE.EXPIRE-AFTER-WRITE = "15m"
2026-07-27T20:07:42.4441629Z [INFO] 152 - SIACC.CACHE.EXPIRE-AFTER-ACCESS = "2m"
2026-07-27T20:07:42.4441799Z [INFO]  
2026-07-27T20:07:42.4441983Z [INFO] CONFIGURACOES DO QUARKUS CACHE CAFFEINE
2026-07-27T20:07:42.4442256Z [INFO] 153 - quarkus.cache.caffeine.initial-capacity = "${SIACC.CACHE.INITIAL-SIZE}" (149)
2026-07-27T20:07:42.4442602Z [INFO] 154 - quarkus.cache.caffeine.maximum-size = "${SIACC.CACHE.MAXIMUM-SIZE}" (150)
2026-07-27T20:07:42.4442899Z [INFO] 155 - quarkus.cache.caffeine.expire-after-write = "${SIACC.CACHE.EXPIRE-AFTER-WRITE}" (151)
2026-07-27T20:07:42.4443207Z [INFO] 156 - quarkus.cache.caffeine.expire-after-access = "${SIACC.CACHE.EXPIRE-AFTER-ACCESS}" (152)
2026-07-27T20:07:42.4443570Z [INFO] 157 - SIACC.ADMINISTRATIVE.ENDPOINT = "/health,/healthx,/health,/q/health,/admin,/admin-ui,/config,/admin,/title"
2026-07-27T20:07:42.4443775Z [INFO]  
2026-07-27T20:07:42.4444035Z [INFO] PATHS EXCLU�DOS DOS LOGS DE CORRELA��O (TRATADOS COMO PREFIXO)
2026-07-27T20:07:42.4444230Z [INFO]  
2026-07-27T20:07:42.4444468Z [INFO] ADICIONE OU REMOVA PATHS CONFORME NECESS�RIO, SEPARADOS POR V�RGULA
2026-07-27T20:07:42.4444858Z [INFO] 158 - correlation.filter.excluded-paths = "/q/health,/q/metrics,/q/dev,/q/openapi,/q/swagger-ui,/healthx"
2026-07-27T20:07:42.4445134Z [INFO] Define o nivel de log para a categoria org.hibernate como ERROR, exibindo apenas mensagens de erro do Hibernate nos logs.
2026-07-27T20:07:42.4445420Z [INFO] 159 - quarkus.log.category."org.hibernate".level = "ERROR"
2026-07-27T20:07:42.4445606Z [INFO]  
2026-07-27T20:07:42.4445815Z [INFO] ----- CONFIGURACOES MQ-SUPORTE -----
2026-07-27T20:07:42.4445993Z [INFO]  
2026-07-27T20:07:42.4446159Z [INFO] CONFIGURACOES DE PROCESSAMENTO DE FILA
2026-07-27T20:07:42.4446391Z [INFO] 160 - mq.local.connector.embedded = "false"
2026-07-27T20:07:42.4446637Z [INFO] 161 - mq.factory = "FactoryBeanIBMMQ"
2026-07-27T20:07:42.4446873Z [INFO] 162 - mq.factory.baixa = "FactoryBeanIBMMQBaixa"
2026-07-27T20:07:42.4447113Z [INFO] 163 - mq.local.connector.name = "remote"
2026-07-27T20:07:42.4447393Z [INFO] 164 - mq.local.connector.address = "tcp://0.0.0.0:61616"
2026-07-27T20:07:42.4447630Z [INFO] 165 - SIACC.MQ.HOST = "[NAO INFORMADO]"
2026-07-27T20:07:42.4447854Z [INFO] 166 - SIACC.MQ.PORT = "[NAO INFORMADO]"
2026-07-27T20:07:42.4448106Z [INFO] 167 - SIACC.MQ.MANAGER = "[NAO INFORMADO]"
2026-07-27T20:07:42.4448334Z [INFO] 168 - SIACC.MQ.CHANNEL = "[NAO INFORMADO]"
2026-07-27T20:07:42.4448584Z [INFO] 169 - SIACC.MQ.USER = "[NAO INFORMADO]"
2026-07-27T20:07:42.4448808Z [INFO] 170 - SIACC.MQ.PASSWORD = "[NAO INFORMADO]"
2026-07-27T20:07:42.4449054Z [INFO] 171 - SIACC.MQ.TIMEOUT = "60"
2026-07-27T20:07:42.4449266Z [INFO] 172 - SIACC.MQ.CONNECTIONS = "10"
2026-07-27T20:07:42.4449507Z [INFO] 173 - SIACC.MQ.SESSIONS = "30"
2026-07-27T20:07:42.4449734Z [INFO] 174 - SIACC.MQ.BAIXA.HOST = "[NAO INFORMADO]"
2026-07-27T20:07:42.4449999Z [INFO] 175 - SIACC.MQ.BAIXA.PORT = "[NAO INFORMADO]"
2026-07-27T20:07:42.4450235Z [INFO] 176 - SIACC.MQ.BAIXA.MANAGER = "[NAO INFORMADO]"
2026-07-27T20:07:42.4450520Z [INFO] 177 - SIACC.MQ.BAIXA.CHANNEL = "[NAO INFORMADO]"
2026-07-27T20:07:42.4450764Z [INFO] 178 - SIACC.MQ.BAIXA.USER = "[NAO INFORMADO]"
2026-07-27T20:07:42.4451016Z [INFO] 179 - SIACC.MQ.BAIXA.PASSWORD = "[NAO INFORMADO]"
2026-07-27T20:07:42.4451246Z [INFO] 180 - SIACC.MQ.BAIXA.TIMEOUT = "60"
2026-07-27T20:07:42.4451487Z [INFO] 181 - SIACC.MQ.BAIXA.CONNECTIONS = "10"
2026-07-27T20:07:42.4451716Z [INFO] 182 - SIACC.MQ.BAIXA.SESSIONS = "30"
2026-07-27T20:07:42.4451890Z [INFO]  
2026-07-27T20:07:42.4452054Z [INFO] MOCKANDO MQ LOCAL
2026-07-27T20:07:42.4452219Z [INFO]  
2026-07-27T20:07:42.4452381Z [INFO] MOCKANDO MQ BAIXA LOCAL
2026-07-27T20:07:42.4452537Z [INFO]  
2026-07-27T20:07:42.4452709Z [INFO] MOCKANDO MQ LOCAL
2026-07-27T20:07:42.4452860Z [INFO]  
2026-07-27T20:07:42.4453018Z [INFO] MOCKANDO MQ BAIXA LOCAL
2026-07-27T20:07:42.4453190Z [INFO]  
2026-07-27T20:07:43.0239347Z [WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc."servico-intranet-servico".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-27T20:07:43.0318610Z [WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc."servico-internet".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-27T20:07:43.0376136Z [WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.log.category.min-level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-27T20:07:43.0379436Z [WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.log.category.level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-27T20:07:43.0384487Z [WARNING] [io.quarkus.config] Unrecognized configuration key "quarkus.oidc."servico-intranet-web".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-07-27T20:07:44.2717577Z [INFO] [io.quarkus.arc.processor.Interceptors] The interceptor br.gov.caixa.siacc.pix.suporte.metric.ComputarMetricasInterceptor does not declare any @Priority. It will be assigned a default priority value of 0.
2026-07-27T20:07:44.3870023Z [INFO] [io.quarkus.smallrye.openapi] OpenAPI JSON saved: /opt/ads-agent/_work/12305/s/target/swagger/openapi.json
2026-07-27T20:07:44.3882554Z [INFO] [io.quarkus.smallrye.openapi] OpenAPI YAML saved: /opt/ads-agent/_work/12305/s/target/swagger/openapi.yaml
2026-07-27T20:07:45.9227983Z [INFO] [io.quarkus.deployment.QuarkusAugmentor] Quarkus augmentation completed in 3855ms
2026-07-27T20:07:45.9355730Z [INFO] 
2026-07-27T20:07:45.9455927Z [INFO] --- maven-dependency-plugin:3.6.0:copy (copy-agent) @ SIACC-pixautomatico-mq-suporte ---
2026-07-27T20:07:46.1485904Z [INFO] Configured Artifact: com.microsoft.azure:applicationinsights-agent:3.4.15:jar
2026-07-27T20:07:46.1696033Z [INFO] Copying applicationinsights-agent-3.4.15.jar to /opt/ads-agent/_work/12305/s/target/agent/applicationinsights-agent.jar
2026-07-27T20:07:46.1832278Z [INFO] ------------------------------------------------------------------------
2026-07-27T20:07:46.1832909Z [INFO] BUILD SUCCESS
2026-07-27T20:07:46.1833315Z [INFO] ------------------------------------------------------------------------
2026-07-27T20:07:46.1833541Z [INFO] Total time:  20.133 s
2026-07-27T20:07:46.1833834Z [INFO] Finished at: 2026-07-27T17:07:46-03:00
2026-07-27T20:07:46.1834129Z [INFO] ------------------------------------------------------------------------
2026-07-27T20:07:46.3458156Z ##[section]Finishing: Maven
