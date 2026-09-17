Verificar Erro de acesso do módulo SICBP-TRILHA-API ao APP INSIGHTS em Ambiente DES.

MENSAGEM DE ERRO:
2026-09-09T15:53:22.2024021Z Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com/191.237.224.176:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )



Skip to main content
Azure DevOps
projetos
/
Caixa
/
Overview
/
Wiki
/
Azure Wiki
/
CONFIGURAÇÃO do Application Insights no Spring Boot
Search


Caixa

Overview
Summary
Dashboards
Wiki

Boards

Repos

Pipelines

Test Plans

Artifacts
Project settings

Caixa.wiki

app


New page
CONFIGURAÇÃO do Application Insights no Spring Boot

Follow
1

Edit

Leandro Silveira de Medeiros
23 de jun.
Guilherme Bastos Leone
1 de abr.

Introdução
Este documento descreve os pontos específicos do processo de instrumentação do Azure Application Insights aplicáveis exclusivamente a aplicações desenvolvidas com Spring Boot.
Ele deve ser utilizado como complemento ao documento principal, que detalha o processo para Quarkus. Tudo que for idêntico entre Quarkus e Spring – como tratamento de proxy, liberação de endpoints, configuração de certificados, procedimentos de REQ e aspectos de infraestrutura – permanece válido e não será repetido aqui.

A seguir estão apenas as diferenças relevantes que devem ser observadas por equipes que desenvolvem ou mantêm módulos Spring Boot.

Tutorial baseado na versão 3.7.5 do agente.

Você pode conferir o procedimento utilizando Quarkus em: Configuração do Application Insights no Quarkus - Overview
Tutorial da Microsoft: Configure Azure Monitor Application Insights for Spring Boot - Azure Monitor | Microsoft Learn

Tipo de agente utilizado no Spring Boot
Enquanto o Quarkus utiliza o agente tradicional do Application Insights, anexado por meio do parâmetro -javaagent: e incluído na imagem durante o build S2I, o Spring Boot utiliza um mecanismo alternativo chamado Application Insights Runtime Attach.
Esse modelo dispensa a inclusão manual do agente na imagem e também elimina a necessidade de ajustar o caminho do arquivo applicationinsights-agent.jar.

No Spring Boot, não é necessário trabalhar com:

inclusão do agente em /deployments/lib ou /deployments/lib/main;
configuração do parâmetro _ENV.JAVA_OPTIONS_APPEND;
verificação do caminho correto do jar no processo de build S2I.
Toda a instrumentação ocorre em tempo de execução, por meio da dependência adequada e de chamada explícita no método principal da aplicação.

Dependência obrigatória no pom.xml
Para habilitar o runtime attach, a aplicação Spring Boot deve incluir a seguinte dependência:
<dependency> <groupId>com.microsoft.azure</groupId> <artifactId>applicationinsights-runtime-attach</artifactId> <version>3.7.5</version> </dependency> A ausência dessa dependência impede que o agente seja inicializado durante a execução da aplicação.
Inicialização programática do agente
Ao contrário do que ocorre no Quarkus, onde o agente é carregado automaticamente pelo parâmetro -javaagent, no Spring Boot a inicialização do Application Insights deve ser realizada explicitamente no método main().
A chamada obrigatória é a seguinte:

@SpringBootApplication
public class SpringBootApp {
public static void main(String[] args) {
ApplicationInsights.attach(); // inicializa o agente
SpringApplication.run(SpringBootApp.class, args);
}
}
Caso essa linha não seja incluída, a aplicação iniciará normalmente, porém sem qualquer coleta de telemetria.

Variáveis de ambiente específicas para o Spring Boot
Embora grande parte das variáveis utilizadas para configurar o agente seja comum entre Quarkus e Spring, algumas diferenças precisam ser observadas.
A principal distinção está no fato de que o Spring Boot não utiliza parâmetros de inicialização Java para carregar o agente, como ocorre com _ENV.JAVA_OPTIONS_APPEND.
Assim, as variáveis utilizadas se restringem exclusivamente às configurações próprias do runtime attach e ao comportamento de telemetria.

Exemplo de variáveis comumente utilizadas no Spring Boot (ambiente de DES):

ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT = '{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(?:/actuator/health)(?😕.*)?$","matchType":"regexp"}],"percentage":0}]}}' <- Regex diferente do Quarkus

_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING = "<valor do campo "Connection String" obtido no workspace da comunidade na Azure, colocar o valor entre "aspas""

_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL = INFO
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE = 100

_ENV.APPLICATIONINSIGHTS_PROXY = http://proxydes.caixa:80 
_ENV.HTTPS_PROXY = http://proxydes.caixa:80 
_ENV.NO_PROXY = ".caixa,.caixa.gov.br"

_ENV.APPLICATIONINSIGHTS_ROLE_NAME = SIXXX-modulo-DES
O padrão de health check do Spring Boot utiliza o caminho /actuator/health, o que torna necessária a alteração do filtro em APPLICATIONINSIGHTS_CONFIGURATION_CONTENT, diferentemente do Quarkus, que usa /q/health.

Dica: caso haja mais de um projeto Spring utilizando Application Insights, recomenda-se criar uma library comum aos projetos. Por exemplo: SIXXX-spring-insights-des.

Atenção à propriedade _ENV.APPLICATIONINSIGHTS_ROLE_NAME que deve refletir o nome do módulo adequado.

Possíveis conflitos específicos do ecossistema Spring
Alguns componentes amplamente utilizados em projetos Spring Boot podem gerar conflitos com o Application Insights, o que não ocorre da mesma forma no Quarkus. Entre eles:
Spring Boot Actuator
O actuator implementa seus próprios interceptadores e pontos de telemetria. Em determinadas versões, pode gerar duplicidade de requisições ou métricas.

Micrometer e observabilidade nativa do Spring
Caso a aplicação utilize instrumentações próprias do Micrometer ou integrações com OpenTelemetry, pode haver sobreposição na geração de spans ou métricas.

Starters de tracing como Sleuth
Bibliotecas de tracing distribuído podem interferir no comportamento do agente do Application Insights, exigindo ajustes adicionais.

Esses conflitos são particularmente relevantes em aplicações mais complexas, e não se manifestam da mesma forma em Quarkus.

72 visits in last 30 days
Showing 10 filtered items.

Get started and run this pipeline for the first time!

Expanded

Expanded

Collapsed

Collapsed

Showing filters 1 through 1

956 results found

14 results found






2026-09-09T15:53:21.0536350Z ##[section]Starting: Logs da Aplicação
2026-09-09T15:53:21.0539931Z ==============================================================================
2026-09-09T15:53:21.0540025Z Task         : Bash
2026-09-09T15:53:21.0540067Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-09T15:53:21.0540142Z Version      : 3.227.0
2026-09-09T15:53:21.0540189Z Author       : Microsoft Corporation
2026-09-09T15:53:21.0540240Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-09T15:53:21.0540365Z ==============================================================================
2026-09-09T15:53:21.9219299Z Generating script.
2026-09-09T15:53:21.9229545Z ========================== Starting Command Output ===========================
2026-09-09T15:53:21.9252426Z [command]/bin/bash /opt/ads-agent/_work/_temp/a08634a9-da97-4583-97ec-f3c1864913b5.sh
2026-09-09T15:53:21.9285962Z + shopt -s expand_aliases
2026-09-09T15:53:21.9286407Z + [[ -n okd4_nprd ]]
2026-09-09T15:53:21.9288229Z + [[ okd4_nprd =~ ocp ]]
2026-09-09T15:53:21.9288692Z + [[ -n okd4_nprd ]]
2026-09-09T15:53:21.9288833Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-09-09T15:53:21.9288999Z + app=sicbp-trilha-api-des
2026-09-09T15:53:21.9289105Z + oc version
2026-09-09T15:53:22.0094649Z Client Version: v4.2.0-alpha.0-1650-g31aa3e8
2026-09-09T15:53:22.0094851Z Kustomize Version: v4.5.7
2026-09-09T15:53:22.0095027Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-09-09T15:53:22.0095206Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-09-09T15:53:22.0125731Z ++ oc get pod -l name=sicbp-trilha-api-des -n sicbp-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-09T15:53:22.0126141Z ++ tac
2026-09-09T15:53:22.0128829Z ++ grep -v '^$'
2026-09-09T15:53:22.0133664Z ++ head -n1
2026-09-09T15:53:22.1075650Z + last_pod=sicbp-trilha-api-des-54-rrrpb
2026-09-09T15:53:22.1075912Z + echo 'Logs do POD: sicbp-trilha-api-des-54-rrrpb'
2026-09-09T15:53:22.1076131Z + oc logs sicbp-trilha-api-des-54-rrrpb -c sicbp-trilha-api-des -n sicbp-des
2026-09-09T15:53:22.1076382Z Logs do POD: sicbp-trilha-api-des-54-rrrpb
2026-09-09T15:53:22.2009261Z exec java -Dserver.address=0.0.0.0 -Dserver.port=8080 -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=sicbp-trilha-api -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sicbp-trilha-api -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/api-trilha.jar
2026-09-09T15:53:22.2009953Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09T15:53:22.2010164Z WARNING: sun.reflect.Reflection.getCallerClass is not supported. This will impact performance.
2026-09-09T15:53:22.2010494Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-09-09T15:53:22.2011152Z 2026-09-09 12:52:17.002-03:00 INFO  c.m.applicationinsights.agent - Application Insights Java Agent 3.7.5 started successfully (PID 8, JVM running for 7.099 s)
2026-09-09T15:53:22.2011519Z 2026-09-09 12:52:17.006-03:00 INFO  c.m.applicationinsights.agent - Java version: 17.0.7, vendor: Red Hat, Inc., home: /usr/lib/jvm/java-17-openjdk-17.0.7.0.7-3.el8.x86_64
2026-09-09T15:53:22.2011634Z 
2026-09-09T15:53:22.2011737Z   .   ____          _            __ _ _
2026-09-09T15:53:22.2011891Z  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
2026-09-09T15:53:22.2012036Z ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
2026-09-09T15:53:22.2012149Z  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
2026-09-09T15:53:22.2012300Z   '  |____| .__|_| |_|_| |_\__, | / / / /
2026-09-09T15:53:22.2012415Z  =========|_|==============|___/=/_/_/_/
2026-09-09T15:53:22.2012535Z  :: Spring Boot ::                (v2.7.7)
2026-09-09T15:53:22.2012727Z 
2026-09-09T15:53:22.2013165Z 2026-09-09 12:52:19.406-03:00 WARN  c.m.a.a.i.t.AppIdSupplier$GetAppIdTask - Retrieving appId: exception sending request to https://brazilsoutheast-0.in.applicationinsights.azure.com/api/profiles/b0142390-50c9-495e-85b4-7b2ade8fc1cf/appId (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T15:53:22.2013450Z reactor.core.Exceptions$ReactiveException: javax.net.ssl.SSLException: failure when writing TLS control frames
2026-09-09T15:53:22.2013626Z 	at reactor.core.Exceptions.propagate(Exceptions.java:410)
2026-09-09T15:53:22.2013799Z 	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:102)
2026-09-09T15:53:22.2013980Z 	at reactor.core.publisher.Mono.block(Mono.java:1779)
2026-09-09T15:53:22.2014174Z 	at com.microsoft.applicationinsights.agent.internal.telemetry.AppIdSupplier$GetAppIdTask.run(AppIdSupplier.java:121)
2026-09-09T15:53:22.2014376Z 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Unknown Source)
2026-09-09T15:53:22.2014535Z 	at java.base/java.util.concurrent.FutureTask.run(Unknown Source)
2026-09-09T15:53:22.2014709Z 	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(Unknown Source)
2026-09-09T15:53:22.2014874Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
2026-09-09T15:53:22.2015038Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
2026-09-09T15:53:22.2015196Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T15:53:22.2015405Z 	Suppressed: java.lang.Exception: #block terminated with an error
2026-09-09T15:53:22.2015584Z 		at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:104)
2026-09-09T15:53:22.2015739Z 		... 8 common frames omitted
2026-09-09T15:53:22.2015865Z Caused by: javax.net.ssl.SSLException: failure when writing TLS control frames
2026-09-09T15:53:22.2016047Z 	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2075)
2026-09-09T15:53:22.2016240Z 	at io.netty.handler.ssl.SslHandler.access$700(SslHandler.java:170)
2026-09-09T15:53:22.2016418Z 	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1016)
2026-09-09T15:53:22.2016713Z 	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1011)
2026-09-09T15:53:22.2016980Z 	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:603)
2026-09-09T15:53:22.2017171Z 	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:570)
2026-09-09T15:53:22.2017360Z 	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:505)
2026-09-09T15:53:22.2017598Z 	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:649)
2026-09-09T15:53:22.2017788Z 	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:642)
2026-09-09T15:53:22.2017966Z 	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:131)
2026-09-09T15:53:22.2018148Z 	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
2026-09-09T15:53:22.2018395Z 	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
2026-09-09T15:53:22.2018588Z 	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
2026-09-09T15:53:22.2018766Z 	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
2026-09-09T15:53:22.2018958Z 	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
2026-09-09T15:53:22.2019138Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:269)
2026-09-09T15:53:22.2019337Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:354)
2026-09-09T15:53:22.2019586Z 	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
2026-09-09T15:53:22.2019913Z 	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:346)
2026-09-09T15:53:22.2020111Z 	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:318)
2026-09-09T15:53:22.2020324Z 	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
2026-09-09T15:53:22.2020540Z 	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:284)
2026-09-09T15:53:22.2020767Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:356)
2026-09-09T15:53:22.2020992Z 	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
2026-09-09T15:53:22.2021203Z 	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
2026-09-09T15:53:22.2021427Z 	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:793)
2026-09-09T15:53:22.2021659Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.epollRdHupReady(AbstractEpollChannel.java:519)
2026-09-09T15:53:22.2021886Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:489)
2026-09-09T15:53:22.2022100Z 	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:307)
2026-09-09T15:53:22.2022304Z 	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:489)
2026-09-09T15:53:22.2022479Z 	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:444)
2026-09-09T15:53:22.2022661Z 	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:207)
2026-09-09T15:53:22.2022842Z 	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:178)
2026-09-09T15:53:22.2023042Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1073)
2026-09-09T15:53:22.2023239Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T15:53:22.2023433Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T15:53:22.2023589Z 	... 1 common frames omitted
2026-09-09T15:53:22.2024021Z Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com/191.237.224.176:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-09-09T15:53:22.2024309Z 	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:212)
2026-09-09T15:53:22.2024485Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:260)
2026-09-09T15:53:22.2024631Z 	... 21 common frames omitted
2026-09-09T15:53:22.2024991Z 2026-09-09 12:52:19,799 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : Starting RunApplication v0.0.0.24 using Java 17.0.7 on sicbp-trilha-api-des-54-rrrpb with PID 8 (/deployments/api-trilha.jar started by 1001 in /deployments)
2026-09-09T15:53:22.2025340Z 2026-09-09 12:52:19,805 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : The following 1 profile is active: "development"
2026-09-09T15:53:22.2025739Z 2026-09-09 12:52:22,919 INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-09-09T15:53:22.2026117Z 2026-09-09 12:52:23,025 INFO  org.springframework.data.repository.config.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 98 ms. Found 2 JPA repository interfaces.
2026-09-09T15:53:22.2026513Z 2026-09-09 12:52:23,594 INFO  org.springframework.cloud.context.scope.GenericScope : BeanFactory id=dc4b8c9f-3d25-3a8d-b6e8-17c006ca5e29
2026-09-09T15:53:22.2026867Z 2026-09-09 12:52:25,008 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat initialized with port(s): 8080 (http)
2026-09-09T15:53:22.2027133Z 2026-09-09 12:52:25,027 INFO  org.apache.catalina.core.StandardService : Starting service [Tomcat]
2026-09-09T15:53:22.2027511Z 2026-09-09 12:52:25,027 INFO  org.apache.catalina.core.StandardEngine : Starting Servlet engine: [Apache Tomcat/9.0.70]
2026-09-09T15:53:22.2027884Z 2026-09-09 12:52:25,133 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring embedded WebApplicationContext
2026-09-09T15:53:22.2028252Z 2026-09-09 12:52:25,133 INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5138 ms
2026-09-09T15:53:22.2028592Z 2026-09-09 12:52:26,213 INFO  io.micrometer.core.instrument.push.PushMeterRegistry : publishing metrics for AzureMonitorMeterRegistry every 1m
2026-09-09T15:53:22.2028877Z 2026-09-09 12:52:27,915 INFO  com.zaxxer.hikari.HikariDataSource : hikari-dev-pool-api-trilha - Starting...
2026-09-09T15:53:22.2029150Z 2026-09-09 12:52:29,014 INFO  com.zaxxer.hikari.HikariDataSource : hikari-dev-pool-api-trilha - Start completed.
2026-09-09T15:53:22.2029446Z 2026-09-09 12:52:29,210 INFO  org.hibernate.jpa.internal.util.LogHelper : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-09-09T15:53:22.2029714Z 2026-09-09 12:52:29,391 INFO  org.hibernate.Version : HHH000412: Hibernate ORM core version 5.6.14.Final
2026-09-09T15:53:22.2030008Z 2026-09-09 12:52:29,805 INFO  org.hibernate.annotations.common.Version : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2026-09-09T15:53:22.2030308Z 2026-09-09 12:52:30,101 INFO  org.hibernate.dialect.Dialect : HHH000400: Using dialect: org.hibernate.dialect.Oracle12cDialect
2026-09-09T15:53:22.2030708Z 2026-09-09 12:52:31,910 INFO  org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2026-09-09T15:53:22.2031097Z 2026-09-09 12:52:31,928 INFO  org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-09-09T15:53:22.2031440Z 2026-09-09 12:52:35,691 INFO  org.springframework.boot.actuate.endpoint.web.EndpointLinksResolver : Exposing 1 endpoint(s) beneath base path '/actuator'
2026-09-09T15:53:22.2032810Z 2026-09-09 12:52:35,701 INFO  org.springframework.security.web.DefaultSecurityFilterChain : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@79c48ad5, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@39d5376c, org.springframework.security.web.context.SecurityContextPersistenceFilter@1ad28f2, org.springframework.security.web.header.HeaderWriterFilter@69dc0dd1, org.springframework.web.filter.CorsFilter@20dab85c, org.springframework.security.web.authentication.logout.LogoutFilter@2a59a8fe, br.gov.caixa.sicbp.infracomponentes.request.filter.ApiSecurityFilter@5c60c08, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@7d91e9c9, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@1d9db780, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@4fc41cba, org.springframework.security.web.session.SessionManagementFilter@4398d, org.springframework.security.web.access.ExceptionTranslationFilter@704205ef, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@52ebacbf]
2026-09-09T15:53:22.2033772Z 2026-09-09 12:52:36,329 INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer : Tomcat started on port(s): 8080 (http) with context path ''
2026-09-09T15:53:22.2034156Z 2026-09-09 12:52:36,331 INFO  br.gov.caixa.sicbp.infracomponentes.spring.listeners.SpringDefaultContextListener : SpringContextListener: Iniciando no ambiente -> [development]
2026-09-09T15:53:22.2034527Z 2026-09-09 12:52:36,397 INFO  br.gov.caixa.sicbp.apitrilha.RunApplication : Started RunApplication in 18.678 seconds (JVM running for 26.496)
2026-09-09T15:53:22.2034880Z 2026-09-09 12:52:41,738 [elastic-apm-remote-config-poller] ERROR co.elastic.apm.agent.configuration.ApmServerConfigurationSource - Connect timed out
2026-09-09T15:53:22.2035495Z 2026-09-09 12:52:44.832-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T15:53:22.2035801Z javax.net.ssl.SSLException: failure when writing TLS control frames
2026-09-09T15:53:22.2035996Z 	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2075)
2026-09-09T15:53:22.2036200Z 	at io.netty.handler.ssl.SslHandler.access$700(SslHandler.java:170)
2026-09-09T15:53:22.2036388Z 	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1016)
2026-09-09T15:53:22.2036661Z 	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1011)
2026-09-09T15:53:22.2036912Z 	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:603)
2026-09-09T15:53:22.2037114Z 	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:570)
2026-09-09T15:53:22.2037324Z 	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:505)
2026-09-09T15:53:22.2037516Z 	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:649)
2026-09-09T15:53:22.2037729Z 	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:642)
2026-09-09T15:53:22.2037922Z 	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:131)
2026-09-09T15:53:22.2038121Z 	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
2026-09-09T15:53:22.2038320Z 	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
2026-09-09T15:53:22.2038525Z 	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
2026-09-09T15:53:22.2038727Z 	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
2026-09-09T15:53:22.2038924Z 	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
2026-09-09T15:53:22.2039119Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:269)
2026-09-09T15:53:22.2039336Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:354)
2026-09-09T15:53:22.2039607Z 	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
2026-09-09T15:53:22.2039866Z 	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:346)
2026-09-09T15:53:22.2040091Z 	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:318)
2026-09-09T15:53:22.2040307Z 	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
2026-09-09T15:53:22.2040539Z 	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:284)
2026-09-09T15:53:22.2040782Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:356)
2026-09-09T15:53:22.2041078Z 	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
2026-09-09T15:53:22.2041305Z 	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
2026-09-09T15:53:22.2041545Z 	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:793)
2026-09-09T15:53:22.2041794Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:482)
2026-09-09T15:53:22.2042014Z 	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:307)
2026-09-09T15:53:22.2042223Z 	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:489)
2026-09-09T15:53:22.2042470Z 	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:444)
2026-09-09T15:53:22.2042667Z 	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:207)
2026-09-09T15:53:22.2042874Z 	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:178)
2026-09-09T15:53:22.2043083Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1073)
2026-09-09T15:53:22.2043285Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T15:53:22.2043494Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T15:53:22.2043679Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T15:53:22.2044170Z Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com/191.237.224.176:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-09-09T15:53:22.2044478Z 	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:212)
2026-09-09T15:53:22.2044680Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:260)
2026-09-09T15:53:22.2044833Z 	... 20 common frames omitted
2026-09-09T15:53:22.2045307Z 2026-09-09 12:52:56,650 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-09T15:53:22.2045813Z 2026-09-09 12:52:56,650 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-09T15:53:22.2046399Z 2026-09-09 12:53:11,668 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Error trying to connect to APM Server at http://apm-server-devops.produtos.caixa/intake/v2/events. Some details about SSL configurations corresponding the current connection are logged at INFO level.
2026-09-09T15:53:22.2046974Z 2026-09-09 12:53:11,668 [elastic-apm-server-reporter] ERROR co.elastic.apm.agent.report.IntakeV2ReportingEventHandler - Failed to handle event of type JSON_WRITER with this error: Connect timed out
2026-09-09T15:53:22.2047572Z 2026-09-09 12:53:14.648-03:00 WARN  c.a.m.o.a.i.p.TelemetryPipeline - Sending telemetry to the ingestion service (retry from disk): failure when writing TLS control frames (https://brazilsoutheast-0.in.applicationinsights.azure.com/v2.1/track) (will be retried again) (future warnings will be aggregated and logged once every 5 minutes)
2026-09-09T15:53:22.2047876Z javax.net.ssl.SSLException: failure when writing TLS control frames
2026-09-09T15:53:22.2048069Z 	at io.netty.handler.ssl.SslHandler.setHandshakeFailureTransportFailure(SslHandler.java:2075)
2026-09-09T15:53:22.2048273Z 	at io.netty.handler.ssl.SslHandler.access$700(SslHandler.java:170)
2026-09-09T15:53:22.2048460Z 	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1016)
2026-09-09T15:53:22.2048711Z 	at io.netty.handler.ssl.SslHandler$2.operationComplete(SslHandler.java:1011)
2026-09-09T15:53:22.2048897Z 	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:603)
2026-09-09T15:53:22.2049099Z 	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:570)
2026-09-09T15:53:22.2049303Z 	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:505)
2026-09-09T15:53:22.2049500Z 	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:649)
2026-09-09T15:53:22.2049697Z 	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:642)
2026-09-09T15:53:22.2049892Z 	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:131)
2026-09-09T15:53:22.2050071Z 	at io.netty.channel.PendingWriteQueue.safeFail(PendingWriteQueue.java:298)
2026-09-09T15:53:22.2050326Z 	at io.netty.channel.PendingWriteQueue.removeAndFailAll(PendingWriteQueue.java:196)
2026-09-09T15:53:22.2050528Z 	at io.netty.handler.proxy.ProxyHandler.failPendingWrites(ProxyHandler.java:437)
2026-09-09T15:53:22.2050730Z 	at io.netty.handler.proxy.ProxyHandler.failPendingWritesAndClose(ProxyHandler.java:354)
2026-09-09T15:53:22.2050934Z 	at io.netty.handler.proxy.ProxyHandler.setConnectFailure(ProxyHandler.java:349)
2026-09-09T15:53:22.2051126Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:269)
2026-09-09T15:53:22.2051333Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:354)
2026-09-09T15:53:22.2051598Z 	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:434)
2026-09-09T15:53:22.2051854Z 	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:346)
2026-09-09T15:53:22.2052076Z 	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:318)
2026-09-09T15:53:22.2052307Z 	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:249)
2026-09-09T15:53:22.2052534Z 	at io.netty.handler.proxy.HttpProxyHandler$HttpClientCodecWrapper.channelRead(HttpProxyHandler.java:284)
2026-09-09T15:53:22.2052770Z 	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:356)
2026-09-09T15:53:22.2053000Z 	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1429)
2026-09-09T15:53:22.2053223Z 	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:918)
2026-09-09T15:53:22.2053463Z 	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:793)
2026-09-09T15:53:22.2053710Z 	at io.netty.channel.epoll.AbstractEpollChannel$AbstractEpollUnsafe.handle(AbstractEpollChannel.java:482)
2026-09-09T15:53:22.2053941Z 	at io.netty.channel.epoll.EpollIoHandler$DefaultEpollIoRegistration.handle(EpollIoHandler.java:307)
2026-09-09T15:53:22.2054148Z 	at io.netty.channel.epoll.EpollIoHandler.processReady(EpollIoHandler.java:489)
2026-09-09T15:53:22.2054327Z 	at io.netty.channel.epoll.EpollIoHandler.run(EpollIoHandler.java:444)
2026-09-09T15:53:22.2054521Z 	at io.netty.channel.SingleThreadIoEventLoop.runIo(SingleThreadIoEventLoop.java:207)
2026-09-09T15:53:22.2054725Z 	at io.netty.channel.SingleThreadIoEventLoop.run(SingleThreadIoEventLoop.java:178)
2026-09-09T15:53:22.2054935Z 	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:1073)
2026-09-09T15:53:22.2055145Z 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
2026-09-09T15:53:22.2055419Z 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
2026-09-09T15:53:22.2055620Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-09-09T15:53:22.2056104Z Caused by: io.netty.handler.proxy.HttpProxyHandler$HttpProxyConnectException: http, none, proxydes.caixa/10.252.32.63:80 => brazilsoutheast-0.in.applicationinsights.azure.com/191.237.224.176:443, status: 502 Proxy Error ( Forefront TMG denied the specified Uniform Resource Locator (URL).  )
2026-09-09T15:53:22.2056522Z 	at io.netty.handler.proxy.HttpProxyHandler.handleResponse(HttpProxyHandler.java:212)
2026-09-09T15:53:22.2056735Z 	at io.netty.handler.proxy.ProxyHandler.channelRead(ProxyHandler.java:260)
2026-09-09T15:53:22.2056891Z 	... 20 common frames omitted
2026-09-09T15:53:22.2057205Z 2026-09-09 12:53:15,110 INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-09-09T15:53:22.2057542Z 2026-09-09 12:53:15,110 INFO  org.springframework.web.servlet.DispatcherServlet : Initializing Servlet 'dispatcherServlet'
2026-09-09T15:53:22.2057930Z 2026-09-09 12:53:15,111 INFO  org.springframework.web.servlet.DispatcherServlet : Completed initialization in 1 ms
2026-09-09T15:53:22.2099516Z ##[section]Finishing: Logs da Aplicação


<img width="1850" height="926" alt="image" src="https://github.com/user-attachments/assets/bdf307eb-3046-4f01-8020-6182584db974" />


acho que sol falta pedir o prox me ajuda ai a rpeceher

<img width="779" height="677" alt="image" src="https://github.com/user-attachments/assets/23bc0482-6586-4fbe-892b-1d04239c08b0" />






