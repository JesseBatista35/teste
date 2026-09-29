Prezados,

Solicito verificação do error nas releases dos projetos abaixo:

SINEP-arquivos -> link da release = https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=533954&environmentId=2480603


SINEP-notas-fiscais -> link da release = https://devops.caixa/projetos/Caixa/_releaseProgress?releaseId=533944&_a=release-environment-logs&environmentId=2480557


sinep-api -> link da release = https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=533979&environmentId=2480710


Todos apresentam o mesmo error na task Logs da Aplicação:

Caused by: com.ibm.mq.jmqi.JmqiException: CC=2;RC=2538;AMQ9204: Connection to host '10.192.224.100(1415)' rejected. [1=com.ibm.mq.jmqi.JmqiException[CC=2;RC=2538;AMQ9204: Connection to host '/10.192.224.100:1415' rejected. [1=java.net.ConnectException[Connection refused],3=/10.192.224.100:1415,4=TCP,5=Socket.connect]],3=10.192.224.100(1415),4=,5=RemoteTCPConnection.bindAndConnectSocket]


Duvidas estou a disposição via teams f996594


2026-09-29T14:21:19.5254877Z ##[section]Starting: Verificando Status do Deployment
2026-09-29T14:21:19.5259156Z ==============================================================================
2026-09-29T14:21:19.5259249Z Task         : Bash
2026-09-29T14:21:19.5259448Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-29T14:21:19.5259519Z Version      : 3.227.0
2026-09-29T14:21:19.5259569Z Author       : Microsoft Corporation
2026-09-29T14:21:19.5259826Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-29T14:21:19.5259908Z ==============================================================================
2026-09-29T14:21:19.7158040Z Generating script.
2026-09-29T14:21:19.7169296Z ========================== Starting Command Output ===========================
2026-09-29T14:21:19.7176554Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/b246099a-facd-4574-9a33-79d47d7202d9.sh
2026-09-29T14:21:19.8226078Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-29T14:21:21.0600555Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-09-29T14:21:21.1217001Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-09-29T14:27:27.0359133Z ##[error]The task has timed out.
2026-09-29T14:27:27.0361438Z ##[section]Finishing: Verificando Status do Deployment


2026-09-29T14:27:27.0403946Z ##[section]Starting: Logs da Aplicação
2026-09-29T14:27:27.0410203Z ==============================================================================
2026-09-29T14:27:27.0410398Z Task         : Bash
2026-09-29T14:27:27.0410472Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-29T14:27:27.0410617Z Version      : 3.227.0
2026-09-29T14:27:27.0410695Z Author       : Microsoft Corporation
2026-09-29T14:27:27.0410789Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-29T14:27:27.0410954Z ==============================================================================
2026-09-29T14:27:27.1943586Z Generating script.
2026-09-29T14:27:27.1954689Z ========================== Starting Command Output ===========================
2026-09-29T14:27:27.1961738Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/9f4e5728-ad85-4a5b-b8f1-cd1f20727ae9.sh
2026-09-29T14:27:27.2027372Z + shopt -s expand_aliases
2026-09-29T14:27:27.2027630Z + [[ -n okd4_nprd ]]
2026-09-29T14:27:27.2027993Z + [[ okd4_nprd =~ ocp ]]
2026-09-29T14:27:27.2028255Z + [[ -n okd4_nprd ]]
2026-09-29T14:27:27.2028416Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-29T14:27:27.2028751Z + app=sinep-arquivos-tqs
2026-09-29T14:27:27.2028915Z + oc version
2026-09-29T14:27:27.2719850Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-29T14:27:27.2720161Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-29T14:27:27.2720400Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-29T14:27:27.2752971Z ++ oc get pod -l name=sinep-arquivos-tqs -n sinep-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-29T14:27:27.2753668Z ++ tac
2026-09-29T14:27:27.2755170Z ++ grep -v '^$'
2026-09-29T14:27:27.2756293Z ++ head -n1
2026-09-29T14:27:27.3854842Z + last_pod=sinep-arquivos-tqs-24-hqqpq
2026-09-29T14:27:27.3855172Z + echo 'Logs do POD: sinep-arquivos-tqs-24-hqqpq'
2026-09-29T14:27:27.3855440Z + oc logs sinep-arquivos-tqs-24-hqqpq -c sinep-arquivos-tqs -n sinep-tqs
2026-09-29T14:27:27.3855705Z Logs do POD: sinep-arquivos-tqs-24-hqqpq
2026-09-29T14:27:27.4663551Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-09-29T14:27:27.4664185Z __  ____  __  _____   ___  __ ____  ______ 
2026-09-29T14:27:27.4665412Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-09-29T14:27:27.4665728Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-09-29T14:27:27.4665946Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-09-29T14:27:27.4666502Z 2026-09-29 11:26:52,700 WARN  [org.hib.boo.mod.int.ToOneBinder] (main) HHH000491: 'br.gov.caixa.sinep.parceiro.model.Parceiro.agencia' uses both @NotFound and FetchType.LAZY. @ManyToOne and @OneToOne associations mapped with @NotFound are forced to EAGER fetching.
2026-09-29T14:27:27.4667108Z 2026-09-29 11:26:57,500 ERROR [io.qua.run.Application] (main) Failed to start application: java.lang.RuntimeException: Failed to start quarkus
2026-09-29T14:27:27.4668078Z 	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
2026-09-29T14:27:27.4668295Z 	at io.quarkus.runtime.Application.start(Application.java:101)
2026-09-29T14:27:27.4668535Z 	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:121)
2026-09-29T14:27:27.4668762Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:77)
2026-09-29T14:27:27.4668969Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:48)
2026-09-29T14:27:27.4669165Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:137)
2026-09-29T14:27:27.4669365Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-09-29T14:27:27.4669585Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:68)
2026-09-29T14:27:27.4669826Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:36)
2026-09-29T14:27:27.4670236Z Caused by: com.ibm.msg.client.jms.DetailedIllegalStateRuntimeException: JMSWMQ0018: Failed to connect to queue manager 'BRD3' with connection mode 'Client' and host name '10.192.224.100(1415)'.
2026-09-29T14:27:27.4670815Z Check the queue manager is started and if running in client mode, check there is a listener running. Please see the linked exception for more information.
2026-09-29T14:27:27.4671101Z 	at com.ibm.msg.client.jms.DetailedIllegalStateException.getUnchecked(DetailedIllegalStateException.java:274)
2026-09-29T14:27:27.4671359Z 	at com.ibm.msg.client.jms.internal.JmsErrorUtils.convertJMSException(JmsErrorUtils.java:173)
2026-09-29T14:27:27.4671614Z 	at com.ibm.msg.client.jms.admin.JmsConnectionFactoryImpl.createContext(JmsConnectionFactoryImpl.java:577)
2026-09-29T14:27:27.4671880Z 	at br.gov.caixa.sinep.auditoria.config.mq.ConnectionFactory.jmsContext(ConnectionFactory.java:45)
2026-09-29T14:27:27.4672152Z 	at br.gov.caixa.sinep.auditoria.config.mq.ConnectionFactory_ProducerMethod_jmsContext_tJ3ebITIUgn_w1a4YWqZkH9LJRc_Bean.doCreate(Unknown Source)
2026-09-29T14:27:27.4672420Z 	at br.gov.caixa.sinep.auditoria.config.mq.ConnectionFactory_ProducerMethod_jmsContext_tJ3ebITIUgn_w1a4YWqZkH9LJRc_Bean.create(Unknown Source)
2026-09-29T14:27:27.4672761Z 	at br.gov.caixa.sinep.auditoria.config.mq.ConnectionFactory_ProducerMethod_jmsContext_tJ3ebITIUgn_w1a4YWqZkH9LJRc_Bean.create(Unknown Source)
2026-09-29T14:27:27.4673210Z 	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
2026-09-29T14:27:27.4673461Z 	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
2026-09-29T14:27:27.4673695Z 	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
2026-09-29T14:27:27.4673933Z 	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.c72(Unknown Source)
2026-09-29T14:27:27.4674200Z 	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.computeIfAbsent(Unknown Source)
2026-09-29T14:27:27.4674446Z 	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
2026-09-29T14:27:27.4674692Z 	at io.quarkus.arc.impl.ClientProxies.getApplicationScopedDelegate(ClientProxies.java:23)
2026-09-29T14:27:27.4674948Z 	at javax.jms.ConnectionFactory_ProducerMethod_jmsContext_tJ3ebITIUgn_w1a4YWqZkH9LJRc_ClientProxy.arc$delegate(Unknown Source)
2026-09-29T14:27:27.4675218Z 	at javax.jms.ConnectionFactory_ProducerMethod_jmsContext_tJ3ebITIUgn_w1a4YWqZkH9LJRc_ClientProxy.arc_contextualInstance(Unknown Source)
2026-09-29T14:27:27.4675480Z 	at br.gov.caixa.sinep.auditoria.config.mq.ConnectionFactory_Observer_Synthetic_G0fOKqVvENWQ6oPO_RzNXdxJDMQ.notify(Unknown Source)
2026-09-29T14:27:27.4675723Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:365)
2026-09-29T14:27:27.4675944Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:347)
2026-09-29T14:27:27.4676154Z 	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:81)
2026-09-29T14:27:27.4676370Z 	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:163)
2026-09-29T14:27:27.4676657Z 	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:114)
2026-09-29T14:27:27.4676920Z 	at io.quarkus.runner.recorded.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
2026-09-29T14:27:27.4677160Z 	at io.quarkus.runner.recorded.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
2026-09-29T14:27:27.4677506Z 	... 9 more
2026-09-29T14:27:27.4677836Z Caused by: com.ibm.mq.MQException: JMSCMQ0001: IBM MQ call failed with compcode '2' ('MQCC_FAILED') reason '2538' ('MQRC_HOST_NOT_AVAILABLE').
2026-09-29T14:27:27.4678093Z 	at com.ibm.msg.client.wmq.common.internal.Reason.createException(Reason.java:203)
2026-09-29T14:27:27.4678331Z 	at com.ibm.msg.client.wmq.internal.WMQConnection.<init>(WMQConnection.java:453)
2026-09-29T14:27:27.4678652Z 	at com.ibm.msg.client.wmq.factories.WMQConnectionFactory.createV7ProviderConnection(WMQConnectionFactory.java:8476)
2026-09-29T14:27:27.4678936Z 	at com.ibm.msg.client.wmq.factories.WMQConnectionFactory.createProviderConnection(WMQConnectionFactory.java:7815)
2026-09-29T14:27:27.4679281Z 	at com.ibm.msg.client.jms.admin.JmsConnectionFactoryImpl._createConnection(JmsConnectionFactoryImpl.java:322)
2026-09-29T14:27:27.4679554Z 	at com.ibm.msg.client.jms.admin.JmsConnectionFactoryImpl.createContext(JmsConnectionFactoryImpl.java:543)
2026-09-29T14:27:27.4679789Z 	... 30 more
2026-09-29T14:27:27.4680366Z Caused by: com.ibm.mq.jmqi.JmqiException: CC=2;RC=2538;AMQ9204: Connection to host '10.192.224.100(1415)' rejected. [1=com.ibm.mq.jmqi.JmqiException[CC=2;RC=2538;AMQ9204: Connection to host '/10.192.224.100:1415' rejected. [1=java.net.ConnectException[Connection refused],3=/10.192.224.100:1415,4=TCP,5=Socket.connect]],3=10.192.224.100(1415),4=,5=RemoteTCPConnection.bindAndConnectSocket]
2026-09-29T14:27:27.4680761Z 	at com.ibm.mq.jmqi.remote.api.RemoteFAP$Connector.jmqiConnect(RemoteFAP.java:13588)
2026-09-29T14:27:27.4680995Z 	at com.ibm.mq.jmqi.remote.api.RemoteFAP$Connector.access$100(RemoteFAP.java:13125)
2026-09-29T14:27:27.4681226Z 	at com.ibm.mq.jmqi.remote.api.RemoteFAP.jmqiConnect(RemoteFAP.java:1430)
2026-09-29T14:27:27.4681446Z 	at com.ibm.mq.jmqi.remote.api.RemoteFAP.jmqiConnect(RemoteFAP.java:1389)
2026-09-29T14:27:27.4681684Z 	at com.ibm.mq.ese.jmqi.InterceptedJmqiImpl.jmqiConnect(InterceptedJmqiImpl.java:377)
2026-09-29T14:27:27.4681899Z 	at com.ibm.mq.ese.jmqi.ESEJMQI.jmqiConnect(ESEJMQI.java:562)
2026-09-29T14:27:27.4682118Z 	at com.ibm.msg.client.wmq.internal.WMQConnection.<init>(WMQConnection.java:386)
2026-09-29T14:27:27.4682296Z 	... 34 more
2026-09-29T14:27:27.4682758Z Caused by: com.ibm.mq.jmqi.JmqiException: CC=2;RC=2538;AMQ9204: Connection to host '/10.192.224.100:1415' rejected. [1=java.net.ConnectException[Connection refused],3=/10.192.224.100:1415,4=TCP,5=Socket.connect]
2026-09-29T14:27:27.4683182Z 	at com.ibm.mq.jmqi.remote.impl.RemoteTCPConnection.bindAndConnectSocket(RemoteTCPConnection.java:928)
2026-09-29T14:27:27.4683451Z 	at com.ibm.mq.jmqi.remote.impl.RemoteTCPConnection.protocolConnect(RemoteTCPConnection.java:1408)
2026-09-29T14:27:27.4683828Z 	at com.ibm.mq.jmqi.remote.impl.RemoteConnection.connect(RemoteConnection.java:992)
2026-09-29T14:27:27.4684146Z 	at com.ibm.mq.jmqi.remote.impl.RemoteConnectionSpecification.getNewConnection(RemoteConnectionSpecification.java:567)
2026-09-29T14:27:27.4684438Z 	at com.ibm.mq.jmqi.remote.impl.RemoteConnectionSpecification.getSessionFromNewConnection(RemoteConnectionSpecification.java:246)
2026-09-29T14:27:27.4684721Z 	at com.ibm.mq.jmqi.remote.impl.RemoteConnectionSpecification.getSession(RemoteConnectionSpecification.java:154)
2026-09-29T14:27:27.4684987Z 	at com.ibm.mq.jmqi.remote.impl.RemoteConnectionPool.getSession(RemoteConnectionPool.java:127)
2026-09-29T14:27:27.4685264Z 	at com.ibm.mq.jmqi.remote.api.RemoteFAP$Connector.jmqiConnect(RemoteFAP.java:13328)
2026-09-29T14:27:27.4685479Z 	... 40 more
2026-09-29T14:27:27.4685644Z Caused by: java.net.ConnectException: Connection refused
2026-09-29T14:27:27.4685858Z 	at java.base/sun.nio.ch.Net.connect0(Native Method)
2026-09-29T14:27:27.4686104Z 	at java.base/sun.nio.ch.Net.connect(Net.java:579)
2026-09-29T14:27:27.4686291Z 	at java.base/sun.nio.ch.Net.connect(Net.java:568)
2026-09-29T14:27:27.4686485Z 	at java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:588)
2026-09-29T14:27:27.4686761Z 	at java.base/java.net.SocksSocketImpl.connect(SocksSocketImpl.java:327)
2026-09-29T14:27:27.4686974Z 	at java.base/java.net.Socket.connect(Socket.java:633)
2026-09-29T14:27:27.4687177Z 	at java.base/java.net.Socket.connect(Socket.java:583)
2026-09-29T14:27:27.4687483Z 	at com.ibm.mq.jmqi.remote.impl.RemoteTCPConnection$4.run(RemoteTCPConnection.java:1049)
2026-09-29T14:27:27.4687740Z 	at com.ibm.mq.jmqi.remote.impl.RemoteTCPConnection$4.run(RemoteTCPConnection.java:1041)
2026-09-29T14:27:27.4687981Z 	at java.base/java.security.AccessController.doPrivileged(AccessController.java:318)
2026-09-29T14:27:27.4688228Z 	at com.ibm.mq.jmqi.remote.impl.RemoteTCPConnection.connectSocket(RemoteTCPConnection.java:1041)
2026-09-29T14:27:27.4688536Z 	at com.ibm.mq.jmqi.remote.impl.RemoteTCPConnection.bindAndConnectSocket(RemoteTCPConnection.java:832)
2026-09-29T14:27:27.4688738Z 	... 47 more
2026-09-29T14:27:27.4688900Z 
2026-09-29T14:27:27.4753378Z ##[section]Finishing: Logs da Aplicação

