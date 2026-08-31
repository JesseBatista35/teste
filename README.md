Prezados, 

<img width="1568" height="703" alt="image" src="https://github.com/user-attachments/assets/643e3920-1e40-4006-8e0c-35d326ad67f2" />


Estamos com problemas no retorno da API do SIICO. Impossibilitando o consumo de informações sobre usuários.


2026-08-10T16:43:33.8666422Z ##[section]Starting: Maven
2026-08-10T16:43:33.8671553Z ==============================================================================
2026-08-10T16:43:33.8671644Z Task         : Maven
2026-08-10T16:43:33.8671707Z Description  : Build, test, and deploy with Apache Maven
2026-08-10T16:43:33.8671775Z Version      : 3.225.0
2026-08-10T16:43:33.8671826Z Author       : Microsoft Corporation
2026-08-10T16:43:33.8671912Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/build/maven
2026-08-10T16:43:33.8671988Z ==============================================================================
2026-08-10T16:43:34.4332390Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -version
2026-08-10T16:43:34.5658003Z Apache Maven 3.8.5 (3599d3414f046de2324203b78ddcf9b5e4388aa0)
2026-08-10T16:43:34.5658480Z Maven home: /opt/apache-maven/apache-maven-3.8.5
2026-08-10T16:43:34.5659598Z Java version: 21.0.5, vendor: Red Hat, Inc., runtime: /usr/java/open-jdk-21.0.5
2026-08-10T16:43:34.5659963Z Default locale: pt_BR, platform encoding: UTF-8
2026-08-10T16:43:34.5660564Z OS name: "linux", version: "3.10.0-1062.9.1.el7.x86_64", arch: "amd64", family: "unix"
2026-08-10T16:43:34.5872241Z [command]/opt/apache-maven/apache-maven-3.8.5/bin/mvn -f /opt/ads-agent/_work/7439/s/pom.xml clean package -U
2026-08-10T16:43:35.4535024Z [INFO] Scanning for projects...
2026-08-10T16:43:36.7422952Z [INFO] 
2026-08-10T16:43:36.7423624Z [INFO] ------------------< br.gov.caixa.silic:silic-backend >------------------
2026-08-10T16:43:36.7424027Z [INFO] Building silic-backend 2.0.1-SNAPSHOT
2026-08-10T16:43:36.7424516Z [INFO] --------------------------------[ jar ]---------------------------------
2026-08-10T16:43:38.3099852Z [INFO] 
2026-08-10T16:43:38.3100612Z [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ silic-backend ---
2026-08-10T16:43:38.3392655Z [INFO] Deleting /opt/ads-agent/_work/7439/s/target
2026-08-10T16:43:39.0540630Z [INFO] 
2026-08-10T16:43:39.0541132Z [INFO] --- jacoco-maven-plugin:0.8.7:prepare-agent (default-prepare-agent) @ silic-backend ---
2026-08-10T16:43:39.1691091Z [INFO] argLine set to -javaagent:/opt/ads-agent/.m2/repository/org/jacoco/org.jacoco.agent/0.8.7/org.jacoco.agent-0.8.7-runtime.jar=destfile=/opt/ads-agent/_work/7439/s/target/jacoco.exec,append=true,exclclassloader=*QuarkusClassLoader
2026-08-10T16:43:39.1691705Z [INFO] 
2026-08-10T16:43:39.1692129Z [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ silic-backend ---
2026-08-10T16:43:39.2168374Z [INFO] Using 'UTF-8' encoding to copy filtered resources.
2026-08-10T16:43:39.2168971Z [INFO] Copying 23 resources
2026-08-10T16:43:39.2322777Z [INFO] 
2026-08-10T16:43:39.2323436Z [INFO] --- quarkus-maven-plugin:3.6.3:generate-code (default) @ silic-backend ---
2026-08-10T16:43:41.2398118Z [INFO] 
2026-08-10T16:43:41.2398833Z [INFO] --- maven-compiler-plugin:3.11.0:compile (default-compile) @ silic-backend ---
2026-08-10T16:43:41.4329233Z [INFO] Changes detected - recompiling the module! :source
2026-08-10T16:43:41.4354612Z [INFO] Compiling 1072 source files with javac [debug release 11] to target/classes
2026-08-10T16:43:44.1967065Z [INFO] ------------------------------------------------------------------------
2026-08-10T16:43:44.1967645Z [INFO] BUILD FAILURE
2026-08-10T16:43:44.1968073Z [INFO] ------------------------------------------------------------------------
2026-08-10T16:43:44.1968683Z [INFO] Total time:  8.756 s
2026-08-10T16:43:44.1968980Z [INFO] Finished at: 2026-08-10T13:43:44-03:00
2026-08-10T16:43:44.1969243Z [INFO] ------------------------------------------------------------------------
2026-08-10T16:43:44.2058796Z [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project silic-backend: Fatal error compiling: java.lang.NoSuchFieldError: Class com.sun.tools.javac.tree.JCTree$JCImport does not have member field 'com.sun.tools.javac.tree.JCTree qualid' -> [Help 1]
2026-08-10T16:43:44.2059418Z [ERROR] 
2026-08-10T16:43:44.2060101Z [ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
2026-08-10T16:43:44.2060748Z [ERROR] Re-run Maven using the -X switch to enable full debug logging.
2026-08-10T16:43:44.2061051Z [ERROR] 
2026-08-10T16:43:44.2061906Z [ERROR] For more information about the errors and possible solutions, please read the following articles:
2026-08-10T16:43:44.2062233Z [ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
2026-08-10T16:43:44.2675673Z ##[error]Build failed.
2026-08-10T16:43:44.2681640Z The process '/opt/apache-maven/apache-maven-3.8.5/bin/mvn' failed with exit code 1
2026-08-10T16:43:44.2681894Z Could not retrieve code analysis results - Maven run failed.
2026-08-10T16:43:44.2711954Z ##[section]Finishing: Maven




3 novas atividades
5 novas notificações
Novas chamadas perdidas
Há menu de contexto
Chat




Não lido
Canais
Chats
Chats de reunião
Mensagem não lidaÚltima mensagemChats em grupoChat de reuniãoChatFuncionários mencionadosMencionar todosImportanteUrgenteRascunhoRascunhoMudo ativadoReunião em andamentoReunião agora em andamentoVocê não pode enviar mensagens porque não é membro do chat.Não é possível enviar mensagens a este botPrivadoCompartilhadoTem um menu de contextoCanal mencionadoEquipe mencionadaFuncionários mencionadosNão lidoNão lidoReunião em andamentoNão lidoCanalEquipeTem mensagens fixadasVer maisComunidadeMostrar temporariamenteTem um menu de contextoChat com emblemaChats com emblema
Tem um menu de contexto

Equipes e canais

Fernando
Leandro
Paulo


Chat

Compartilhado

Notas

Recapitular

Há menu de contexto

Reunir agora


4



Lista de Mensagens
Paulo Alberto de Oliveira Lima adicionou Jesse Mouta Pereira Batista e 2 outras ao chat.
Bom dia, Leandro e Fernando, O Jesse , est... por Paulo Alberto de Oliveira Lima
Paulo Alberto de Oliveira Lima
10:37

Bom dia, Leandro e Fernando, O Jesse, está atendendo o chamado para resolver o problema do SIICO

Todos , bom dia. precisamos localizar o ser... por Jesse Mouta Pereira Batista
10:40
Jesse Mouta Pereira Batista

Todos, bom dia. precisamos localizar o servidor correto, para que possamos dar continuidade na REQ.

Última lida
Bom dia! por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:40

Bom dia!

imagem   na esteira aqui não tem release; por Jesse Mouta Pereira Batista
10:40
Jesse Mouta Pereira Batista

imagem

 

na esteira aqui não tem release;

Pelos endpoint consegue identificar? por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:40

Pelos endpoint consegue identificar?

Início da citação, Fernando Xavier de Alenc... por Jesse Mouta Pereira Batista
10:41
Jesse Mouta Pereira Batista

Fernando Xavier de Alencar
31/08/2026 10:40
Pelos endpoint consegue identificar?
o nome da modulo é esse mesmo? 

me envia o link da aplicação por Jesse Mouta Pereira Batista
10:41
Jesse Mouta Pereira Batista

me envia o link da aplicação

imagem por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:42

imagem

Tenho o endpoint que a aplicação consome  por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:42

Tenho o endpoint que a aplicação consome 

onde que vocês fazem o deploy dessa aplicaç... por Jesse Mouta Pereira Batista
10:43
Jesse Mouta Pereira Batista

onde que vocês fazem o deploy dessa aplicação

Link http://siico2.desenvolvimento.extracai... por Jesse Mouta Pereira Batista
10:43
Jesse Mouta Pereira Batista

http://siico2.desenvolvimento.extracaixa/

 

 

tentei esse mais não é por Jesse Mouta Pereira Batista
10:43
Jesse Mouta Pereira Batista

tentei esse mais não é

Na esteira devops  por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:44

Na esteira devops 

Início da citação, Fernando Xavier de Alenc... por Jesse Mouta Pereira Batista
10:45
Jesse Mouta Pereira Batista

Fernando Xavier de Alencar
31/08/2026 10:44
Na esteira devops
tem olink ou o modulo?

Link https://devops.caixa/projetos/Caixa/_r... por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:45

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=521882&e…


👍
1 Curtir reação.

O link da release do backend por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:46

O link da release do backend

certo o erro então é nesse né: SILIC-v-back... por Jesse Mouta Pereira Batista
10:47
Jesse Mouta Pereira Batista

certo o erro então é nesse né: SILIC-v-backend?

Sim por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:47

Sim

não,  o erro é no SIICO, que impacta o SILI por Paulo Alberto de Oliveira Lima
Paulo Alberto de Oliveira Lima
10:47

não,  o erro é no SIICO, que impacta o SILIC


👍
1 Curtir reação.

Estamos acessar esse endpoint pela aplicaçã... por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:48

Estamos acessar esse endpoint pela aplicação ou postmam e estamos com erro

Fernando Xavier de Alencar
31/08/2026 10:42
📷
obrigado, vou investigar aqui, e passo um f... por Jesse Mouta Pereira Batista
10:48
Jesse Mouta Pereira Batista

obrigado, vou investigar aqui, e passo um feedback

acessando* por Fernando Xavier de Alencar
Fernando Xavier de Alencar
10:48

acessando*

tem menu de contexto








exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd-silic.jks -Djdk.tls.client.protocols=TLSv1,TLSv1.1,TLSv1.2 -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-08-28 18:35:55,467 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.multipart.max-file-size" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,475 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.jvm.args" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,475 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.pge.jdbc.schema" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,476 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.jdbc.retry-interval" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,476 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.pge.active" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,477 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.mailer.fromPlano" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,477 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.hibernate-orm.statistic" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,478 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.scheduler.timezone" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,478 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.http.multipart.max-request-size" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,479 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.datasource.jdbc.retry-attempts" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:35:55,479 WARN  [io.qua.config] (main) Unrecognized configuration key "quarkus.oidc-client.read-timeout" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-08-28 18:36:01,766 WARN  [io.qua.run.log.LoggingSetupRecorder] (main) Log level DEBUG for category 'org.jboss.resteasy.reactive.client.logging' set below minimum logging level INFO, promoting it to INFO. Set the build time configuration property 'quarkus.log.category."org.jboss.resteasy.reactive.client.logging".min-level' to 'DEBUG' to avoid this warning
2026-08-28 18:36:02,251 INFO  [io.agr.pool] (JPA Startup Thread: <default>) Datasource '<default>': Initial size smaller than min. Connections will be created when necessary
2026-08-28 18:36:04,844 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) A aplicacao subiu!
2026-08-28 18:36:04,846 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.profile: des
2026-08-28 18:36:04,846 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.db-kind: oracle
2026-08-28 18:36:04,846 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.jdbc.url: jdbc:oracle:thin:@cnpexdadvm01-scan4.extra.caixa.gov.br:1521/orad02ng
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.username: SLICDB01
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) base.siclg.path: https://des.siclg.caixa/rest
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) SERVER IP: 10.116.220.182
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.mailer: smtptest.correiolivre.caixa
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.mailer.from: cepag@caixa.gov.br
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.pge.jdbc.url: jdbc:oracle:thin:@//cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB003
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) quarkus.datasource.pge.username: SLICPGED
2026-08-28 18:36:04,847 INFO  [br.gov.cai.sis.sil.lis.StartupListener] (main) pagamentos.sipge.sap.auth.headers.username: SRFOBH01
 2026-08-28 18:36:04,921 INFO  [io.quarkus] (main) silic-backend 2.0.1-SNAPSHOT on JVM (powered by Quarkus 3.6.3) started in 10.095s. Listening on: http://0.0.0.0:8080
2026-08-28 18:36:04,921 INFO  [io.quarkus] (main) Profiles des,common activated. 
2026-08-28 18:36:04,921 INFO  [io.quarkus] (main) Installed features: [agroal, cache, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-oracle, jdbc-postgresql, logging-gelf, mailer, micrometer, narayana-jta, oidc, oidc-client, oidc-client-filter, qute, rest-client, resteasy, resteasy-jackson, resteasy-multipart, resteasy-qute, scheduler, security, smallrye-context-propagation, smallrye-fault-tolerance, smallrye-health, smallrye-jwt, smallrye-openapi, swagger-ui, vertx]
2026-08-28 18:39:59,122 INFO  [br.gov.cai.sis.sil.res.AtesteRepository] (executor-thread-20) >>>> [PERF] Tempo query.getResultList() (FETCH): 3432 ms
2026-08-28 18:39:59,128 INFO  [br.gov.cai.sis.sil.res.AtesteRepository] (executor-thread-20) >>>> [PERF] Tempo mapeamento DTO (CONVERT): 2 ms
2026-08-28 18:40:31,791 WARN  [org.jbo.res.res.i18n] (executor-thread-19) RESTEASY002160: Provider instance br.gov.caixa.sistemas.silic.integracao.client.siclg.log.RequestLoggingFilter is already registered.  2nd registration is being ignored.
2026-08-28 18:40:35,054 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 18:40:35,261 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Retornado 10 planos de aquisicao.
2026-08-28 18:40:35,654 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:40:35,665 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:40:35,680 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:40:35,689 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:40:35,698 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:40:35,707 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:40:35,716 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:40:35,733 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:40:35,742 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:40:35,750 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:40:35,751 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query count: SELECT COUNT(DISTINCT pa) FROM PlanoAquisicao pa  LEFT JOIN  pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN  pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao
2026-08-28 18:40:50,246 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.numeroPlanoAquisicao = :numeroPlanoAquisicao AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 18:40:50,271 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Retornado 1 planos de aquisicao.
2026-08-28 18:40:50,279 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:40:50,280 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query count: SELECT COUNT(DISTINCT pa) FROM PlanoAquisicao pa  LEFT JOIN  pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN  pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.numeroPlanoAquisicao = :numeroPlanoAquisicao AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao
2026-08-28 18:40:53,074 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) SELECT DISTINCT new br.gov.caixa.sistemas.silic.domain.PlanoAquisicaoPK(pa.id.numeroPlanoAquisicao, pa.id.anoPlanoAquisicao) FROM PlanoAquisicao pa  LEFT JOIN pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.numeroPlanoAquisicao = :numeroPlanoAquisicao AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 18:47:21,794 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) USUARIO LOGADO: 891389
2026-08-28 18:47:21,795 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) PERFIL USUARIO: Administrador
2026-08-28 18:47:21,801 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) UNIDADE USUARIO: UnidadeLotacaoDTO(codigo=7111, numeroNatural=3495, nomeUnidade=null, siglaUnidade=null)
2026-08-28 18:47:35,033 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) USUARIO LOGADO: 891389
2026-08-28 18:47:35,033 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) PERFIL USUARIO: Administrador
2026-08-28 18:47:35,033 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) UNIDADE USUARIO: UnidadeLotacaoDTO(codigo=7111, numeroNatural=3495, nomeUnidade=null, siglaUnidade=null)
2026-08-28 18:47:41,733 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-20) Token expirado, solicitando novo token.
2026-08-28 18:47:41,737 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-20) Limpando token-cache
2026-08-28 18:47:50,330 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) USUARIO LOGADO: 891389
2026-08-28 18:47:50,330 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) PERFIL USUARIO: Administrador
2026-08-28 18:47:50,330 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) UNIDADE USUARIO: UnidadeLotacaoDTO(codigo=7111, numeroNatural=3495, nomeUnidade=null, siglaUnidade=null)
2026-08-28 18:50:18,716 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 18:50:18,765 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Retornado 10 planos de aquisicao.
2026-08-28 18:50:18,774 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:50:18,780 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:50:18,787 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:50:18,794 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:50:18,800 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:50:18,840 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:50:18,846 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:50:18,852 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:50:18,858 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:50:18,864 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:50:18,864 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query count: SELECT COUNT(DISTINCT pa) FROM PlanoAquisicao pa  LEFT JOIN  pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN  pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao
2026-08-28 18:51:09,288 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) USUARIO LOGADO: 891389
2026-08-28 18:51:09,288 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) PERFIL USUARIO: Administrador
2026-08-28 18:51:09,288 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) UNIDADE USUARIO: UnidadeLotacaoDTO(codigo=7111, numeroNatural=3495, nomeUnidade=null, siglaUnidade=null)
2026-08-28 18:52:25,462 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-20) Token expirado, solicitando novo token.
2026-08-28 18:52:25,463 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-20) Limpando token-cache
2026-08-28 18:57:53,855 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 18:57:53,913 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Retornado 10 planos de aquisicao.
2026-08-28 18:57:53,921 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:57:53,929 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:57:53,936 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:57:53,944 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:57:53,951 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:57:53,957 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 18:57:53,964 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:57:53,971 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:57:53,977 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:57:53,983 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 18:57:53,983 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query count: SELECT COUNT(DISTINCT pa) FROM PlanoAquisicao pa  LEFT JOIN  pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN  pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao
2026-08-28 18:57:54,035 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-20) Token expirado, solicitando novo token.
2026-08-28 18:57:54,035 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-20) Limpando token-cache
2026-08-28 18:59:28,400 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) SELECT DISTINCT new br.gov.caixa.sistemas.silic.domain.PlanoAquisicaoPK(pa.id.numeroPlanoAquisicao, pa.id.anoPlanoAquisicao) FROM PlanoAquisicao pa  LEFT JOIN pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 19:15:24,036 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 19:15:24,087 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Retornado 10 planos de aquisicao.
2026-08-28 19:15:24,096 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:24,102 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:24,108 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:24,114 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:24,120 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:24,125 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:24,131 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:24,136 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:24,142 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:24,148 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:24,148 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query count: SELECT COUNT(DISTINCT pa) FROM PlanoAquisicao pa  LEFT JOIN  pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN  pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao
2026-08-28 19:15:27,464 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-28 19:15:27,648 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Retornado 50 planos de aquisicao.
2026-08-28 19:15:27,655 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,661 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,666 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,672 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,678 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,683 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,689 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,694 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,700 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,706 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,712 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,718 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,723 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,729 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,735 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,741 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,748 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,753 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,759 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,766 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,808 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,815 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,821 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,827 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,832 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,838 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,843 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,848 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,853 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,859 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,863 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,868 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,873 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,879 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,885 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,890 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,897 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,902 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,908 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,914 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,919 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,924 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,930 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,935 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,941 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,946 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,952 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,958 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,963 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=2, nome=Aprovado)
2026-08-28 19:15:27,969 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) TipoSituacaoPlanoAquisicao(id=4, nome=Excluído)
2026-08-28 19:15:27,969 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-20) Query count: SELECT COUNT(DISTINCT pa) FROM PlanoAquisicao pa  LEFT JOIN  pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN  pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.anoPlanoAquisicao = :anoPlanoAquisicao
2026-08-29 00:05:00,017 INFO  [br.gov.cai.sis.sil.sch.FasePlanoAquisicaoScheduler] (executor-thread-19) Fechamento automático da inclusão: 0 registro(s) atualizado(s).
2026-08-29 06:00:00,005 INFO  [br.gov.cai.sis.sil.sch.PlanoAquisicaoScheduler] (executor-thread-19) INICIO: expiracao-planos-aquisicao...
2026-08-29 06:00:00,005 INFO  [br.gov.cai.sis.sil.ser.PlanoAquisicaoService] (executor-thread-19) Iniciando processo de expiração dos planos de aquisição.
2026-08-29 06:00:00,032 INFO  [br.gov.cai.sis.sil.ser.PlanoAquisicaoService] (executor-thread-19) Processo de expiração finalizado. Períodos processados: 0. Planos expirados: 0.
2026-08-29 06:00:00,032 INFO  [br.gov.cai.sis.sil.sch.PlanoAquisicaoScheduler] (executor-thread-19) FIM: expiracao-planos-aquisicao...
2026-08-29 12:26:02,672 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 12:26:02,673 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 12:26:02,673 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 12:26:02,674 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 12:26:02,674 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 13:44:01,433 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@b3cce05)
2026-08-29 13:44:01,434 INFO  [ora.jdbc] (agroal-11) traceId=551BDBD9. 
2026-08-29 13:44:01,435 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:01,436 INFO  [ora.jdbc] (agroal-11) traceId=551BDBD9, anoEnabled=true. 
2026-08-29 13:44:01,437 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:01,438 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:01,439 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:01,440 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 551BDBD9
2026-08-29 13:44:01,441 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:01,442 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:01,443 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:01,444 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:01,445 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:01,446 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 551BDBD9
2026-08-29 13:44:01,447 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:01,448 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:01,449 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:01,450 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:01,451 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:01,452 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 551BDBD9
2026-08-29 13:44:01,453 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:01,454 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=z1Q6ft54TSyjzFfqRXyOpg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=z1Q6ft54TSyjzFfqRXyOpg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:01,455 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,389 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=z1Q6ft54TSyjzFfqRXyOpg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:01,456 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@a25f4de)
2026-08-29 13:44:01,457 INFO  [ora.jdbc] (agroal-11) traceId=7DB597A9. 
2026-08-29 13:44:01,458 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:01,459 INFO  [ora.jdbc] (agroal-11) traceId=7DB597A9, anoEnabled=true. 
2026-08-29 13:44:01,460 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:01,461 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:01,462 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:01,463 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7DB597A9
2026-08-29 13:44:01,464 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:01,465 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:01,466 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:01,467 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:01,468 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:01,469 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7DB597A9
2026-08-29 13:44:01,470 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:01,471 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:01,472 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:01,473 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:01,474 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:01,475 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7DB597A9
2026-08-29 13:44:01,476 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:01,477 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=PUAB0kXJQkuJrQt1Ro/qWA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=PUAB0kXJQkuJrQt1Ro/qWA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:01,478 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,427 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=PUAB0kXJQkuJrQt1Ro/qWA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6e02a26a)
2026-08-29 13:44:02,429 INFO  [ora.jdbc] (agroal-11) traceId=169B67E4. 
2026-08-29 13:44:02,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,431 INFO  [ora.jdbc] (agroal-11) traceId=169B67E4, anoEnabled=true. 
2026-08-29 13:44:02,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 169B67E4
2026-08-29 13:44:02,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 169B67E4
2026-08-29 13:44:02,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 169B67E4
2026-08-29 13:44:02,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=8+0Uimh2QCGLnrVg27aQEw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=8+0Uimh2QCGLnrVg27aQEw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,458 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=8+0Uimh2QCGLnrVg27aQEw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,451 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6d16aea)
2026-08-29 13:44:02,452 INFO  [ora.jdbc] (agroal-11) traceId=352ECFFE. 
2026-08-29 13:44:02,453 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,454 INFO  [ora.jdbc] (agroal-11) traceId=352ECFFE, anoEnabled=true. 
2026-08-29 13:44:02,455 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,456 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,457 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,458 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 352ECFFE
2026-08-29 13:44:02,459 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,460 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,461 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,462 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,463 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,464 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 352ECFFE
2026-08-29 13:44:02,465 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,466 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,467 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,468 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,469 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,470 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 352ECFFE
2026-08-29 13:44:02,471 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,472 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QUqlTI/VT9Glwul5z2XArw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QUqlTI/VT9Glwul5z2XArw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,473 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,489 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=QUqlTI/VT9Glwul5z2XArw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,474 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@1bf74c1b)
2026-08-29 13:44:02,475 INFO  [ora.jdbc] (agroal-11) traceId=2500C54C. 
2026-08-29 13:44:02,476 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,477 INFO  [ora.jdbc] (agroal-11) traceId=2500C54C, anoEnabled=true. 
2026-08-29 13:44:02,478 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,479 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,480 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,481 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2500C54C
2026-08-29 13:44:02,482 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,483 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,484 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,485 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,486 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,487 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2500C54C
2026-08-29 13:44:02,488 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,489 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,490 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,491 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,492 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,493 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 2500C54C
2026-08-29 13:44:02,494 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,495 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+ufzHbDPRGWWTI3pKu/Lfw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+ufzHbDPRGWWTI3pKu/Lfw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,496 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,521 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=+ufzHbDPRGWWTI3pKu/Lfw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,522 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 13:44:02,497 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@300593a2)
2026-08-29 13:44:02,498 INFO  [ora.jdbc] (agroal-11) traceId=ADE2453. 
2026-08-29 13:44:02,499 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,500 INFO  [ora.jdbc] (agroal-11) traceId=ADE2453, anoEnabled=true. 
2026-08-29 13:44:02,501 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,502 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,503 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,504 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = ADE2453
2026-08-29 13:44:02,505 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,506 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,507 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,508 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,509 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,510 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = ADE2453
2026-08-29 13:44:02,511 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,512 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,513 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,514 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,515 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,516 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = ADE2453
2026-08-29 13:44:02,517 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,518 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=x0kuTBwQST6kkgkMd/btzA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=x0kuTBwQST6kkgkMd/btzA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,519 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,555 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=x0kuTBwQST6kkgkMd/btzA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,520 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@597eb361)
2026-08-29 13:44:02,521 INFO  [ora.jdbc] (agroal-11) traceId=314B6553. 
2026-08-29 13:44:02,522 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,523 INFO  [ora.jdbc] (agroal-11) traceId=314B6553, anoEnabled=true. 
2026-08-29 13:44:02,524 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,525 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,526 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,527 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 314B6553
2026-08-29 13:44:02,528 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,529 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,530 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,531 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,532 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,533 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 314B6553
2026-08-29 13:44:02,534 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,535 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,536 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,537 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,538 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,539 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 314B6553
2026-08-29 13:44:02,540 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,541 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0BkwuM5MSBaS9G40lYz3rw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0BkwuM5MSBaS9G40lYz3rw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,542 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,593 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0BkwuM5MSBaS9G40lYz3rw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,543 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@aa535c3)
2026-08-29 13:44:02,544 INFO  [ora.jdbc] (agroal-11) traceId=142ECEE1. 
2026-08-29 13:44:02,545 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,546 INFO  [ora.jdbc] (agroal-11) traceId=142ECEE1, anoEnabled=true. 
2026-08-29 13:44:02,547 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,548 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,549 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,550 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 142ECEE1
2026-08-29 13:44:02,551 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,552 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,553 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,554 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,555 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,556 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 142ECEE1
2026-08-29 13:44:02,557 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,558 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,559 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,560 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,561 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,562 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 142ECEE1
2026-08-29 13:44:02,563 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,564 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0r8Z5uc0TqGg9pTLT7c4Ww==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0r8Z5uc0TqGg9pTLT7c4Ww==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,565 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,628 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0r8Z5uc0TqGg9pTLT7c4Ww==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,566 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@60f321ec)
2026-08-29 13:44:02,567 INFO  [ora.jdbc] (agroal-11) traceId=16D0465D. 
2026-08-29 13:44:02,568 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,569 INFO  [ora.jdbc] (agroal-11) traceId=16D0465D, anoEnabled=true. 
2026-08-29 13:44:02,570 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,571 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,572 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,573 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 16D0465D
2026-08-29 13:44:02,574 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,575 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,576 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,577 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,578 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,579 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 16D0465D
2026-08-29 13:44:02,580 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,581 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,582 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,583 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,584 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,585 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 16D0465D
2026-08-29 13:44:02,586 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,587 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=YLTCijMjTSW6FeRDkfOtSQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=YLTCijMjTSW6FeRDkfOtSQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,588 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,659 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=YLTCijMjTSW6FeRDkfOtSQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,589 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@519e795c)
2026-08-29 13:44:02,590 INFO  [ora.jdbc] (agroal-11) traceId=3730D078. 
2026-08-29 13:44:02,591 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,592 INFO  [ora.jdbc] (agroal-11) traceId=3730D078, anoEnabled=true. 
2026-08-29 13:44:02,593 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,594 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,595 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,596 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3730D078
2026-08-29 13:44:02,597 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,598 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,599 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,600 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,601 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,602 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3730D078
2026-08-29 13:44:02,603 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,604 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,605 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,606 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,607 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,608 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3730D078
2026-08-29 13:44:02,609 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,610 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=mbWKJ9N2R8KMn9Au8mbBiA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=mbWKJ9N2R8KMn9Au8mbBiA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,611 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,692 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=mbWKJ9N2R8KMn9Au8mbBiA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,693 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 13:44:02,612 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@4b22f8db)
2026-08-29 13:44:02,613 INFO  [ora.jdbc] (agroal-11) traceId=65A7C055. 
2026-08-29 13:44:02,614 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,615 INFO  [ora.jdbc] (agroal-11) traceId=65A7C055, anoEnabled=true. 
2026-08-29 13:44:02,616 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,617 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,618 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,619 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 65A7C055
2026-08-29 13:44:02,620 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,621 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,622 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,623 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,624 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,625 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 65A7C055
2026-08-29 13:44:02,626 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,627 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,628 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,629 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,630 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,631 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 65A7C055
2026-08-29 13:44:02,632 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,633 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=cxKbfIzpQPeQiOEVEnaCew==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=cxKbfIzpQPeQiOEVEnaCew==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,634 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,727 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=cxKbfIzpQPeQiOEVEnaCew==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,635 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@bf79b4e)
2026-08-29 13:44:02,636 INFO  [ora.jdbc] (agroal-11) traceId=34BD492B. 
2026-08-29 13:44:02,637 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,638 INFO  [ora.jdbc] (agroal-11) traceId=34BD492B, anoEnabled=true. 
2026-08-29 13:44:02,639 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,640 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,641 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,642 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 34BD492B
2026-08-29 13:44:02,643 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,644 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,645 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,646 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,647 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,648 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 34BD492B
2026-08-29 13:44:02,649 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,650 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,651 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,652 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,653 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,654 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 34BD492B
2026-08-29 13:44:02,655 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,656 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=jXAZwxD8T9KlqtA+5V3Xew==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=jXAZwxD8T9KlqtA+5V3Xew==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,657 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,758 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=jXAZwxD8T9KlqtA+5V3Xew==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,658 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5c0da89f)
2026-08-29 13:44:02,659 INFO  [ora.jdbc] (agroal-11) traceId=9E9143F. 
2026-08-29 13:44:02,660 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,661 INFO  [ora.jdbc] (agroal-11) traceId=9E9143F, anoEnabled=true. 
2026-08-29 13:44:02,662 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,663 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,664 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,665 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 9E9143F
2026-08-29 13:44:02,666 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,667 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,668 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,669 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,670 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,671 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 9E9143F
2026-08-29 13:44:02,672 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,673 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,674 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,675 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,676 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,677 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 9E9143F
2026-08-29 13:44:02,678 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,679 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Y8phOtOaT0yrieV8tsZJ2w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Y8phOtOaT0yrieV8tsZJ2w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,680 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,787 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Y8phOtOaT0yrieV8tsZJ2w==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,681 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@4c1f056d)
2026-08-29 13:44:02,682 INFO  [ora.jdbc] (agroal-11) traceId=5A37AE7B. 
2026-08-29 13:44:02,683 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,684 INFO  [ora.jdbc] (agroal-11) traceId=5A37AE7B, anoEnabled=true. 
2026-08-29 13:44:02,685 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,686 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,687 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,688 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5A37AE7B
2026-08-29 13:44:02,689 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,690 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,691 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,692 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,693 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,694 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5A37AE7B
2026-08-29 13:44:02,695 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,696 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,697 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,698 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,699 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,700 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5A37AE7B
2026-08-29 13:44:02,701 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,702 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Q5gGeK+6RcaJ5We14xrBsQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Q5gGeK+6RcaJ5We14xrBsQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,703 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,821 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=Q5gGeK+6RcaJ5We14xrBsQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,704 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@1b4fefc9)
2026-08-29 13:44:02,705 INFO  [ora.jdbc] (agroal-11) traceId=27EC9DF1. 
2026-08-29 13:44:02,706 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,707 INFO  [ora.jdbc] (agroal-11) traceId=27EC9DF1, anoEnabled=true. 
2026-08-29 13:44:02,708 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,709 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,710 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,711 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 27EC9DF1
2026-08-29 13:44:02,712 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,713 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,714 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,715 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,716 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,717 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 27EC9DF1
2026-08-29 13:44:02,718 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,719 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,720 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,721 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,722 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,723 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 27EC9DF1
2026-08-29 13:44:02,724 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,725 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fy0JqNsATQ242gkp7u89Bw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fy0JqNsATQ242gkp7u89Bw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,726 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,853 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fy0JqNsATQ242gkp7u89Bw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,853 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 13:44:02,727 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@34b4168a)
2026-08-29 13:44:02,728 INFO  [ora.jdbc] (agroal-11) traceId=492AFC14. 
2026-08-29 13:44:02,729 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,730 INFO  [ora.jdbc] (agroal-11) traceId=492AFC14, anoEnabled=true. 
2026-08-29 13:44:02,731 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,732 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,733 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,734 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 492AFC14
2026-08-29 13:44:02,735 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,736 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,737 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,738 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,739 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,740 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 492AFC14
2026-08-29 13:44:02,741 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,742 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,743 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,744 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,745 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,746 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 492AFC14
2026-08-29 13:44:02,747 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,748 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=RC4GkUTjT5Ke9CbOjym9SQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=RC4GkUTjT5Ke9CbOjym9SQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,749 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,882 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=RC4GkUTjT5Ke9CbOjym9SQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,750 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@d7b80a1)
2026-08-29 13:44:02,751 INFO  [ora.jdbc] (agroal-11) traceId=4A20494E. 
2026-08-29 13:44:02,752 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,753 INFO  [ora.jdbc] (agroal-11) traceId=4A20494E, anoEnabled=true. 
2026-08-29 13:44:02,754 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,755 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,756 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,757 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4A20494E
2026-08-29 13:44:02,758 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,759 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,760 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,761 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,762 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,763 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4A20494E
2026-08-29 13:44:02,764 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,765 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,766 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,767 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,768 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,769 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4A20494E
2026-08-29 13:44:02,770 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,771 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=B1UEH9A3SFqIwAWREgb01Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=B1UEH9A3SFqIwAWREgb01Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,772 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,915 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=B1UEH9A3SFqIwAWREgb01Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,773 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@51a0c739)
2026-08-29 13:44:02,774 INFO  [ora.jdbc] (agroal-11) traceId=78DAC1A8. 
2026-08-29 13:44:02,775 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,776 INFO  [ora.jdbc] (agroal-11) traceId=78DAC1A8, anoEnabled=true. 
2026-08-29 13:44:02,777 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,778 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,779 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,780 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 78DAC1A8
2026-08-29 13:44:02,781 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,782 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,783 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,784 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,785 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,786 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 78DAC1A8
2026-08-29 13:44:02,787 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,788 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,789 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,790 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,791 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,792 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 78DAC1A8
2026-08-29 13:44:02,793 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,794 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=pOD/zdTYT92c2r8wn3tFKA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=pOD/zdTYT92c2r8wn3tFKA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,795 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,930 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=pOD/zdTYT92c2r8wn3tFKA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,796 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@71d799ca)
2026-08-29 13:44:02,797 INFO  [ora.jdbc] (agroal-11) traceId=36C44908. 
2026-08-29 13:44:02,798 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,799 INFO  [ora.jdbc] (agroal-11) traceId=36C44908, anoEnabled=true. 
2026-08-29 13:44:02,800 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,801 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,802 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,803 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 36C44908
2026-08-29 13:44:02,804 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,805 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,806 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,807 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,808 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,809 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 36C44908
2026-08-29 13:44:02,810 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,811 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,812 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,813 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,814 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,815 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 36C44908
2026-08-29 13:44:02,816 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,817 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=sWLqyqq7Sj26NNlAnI/b9A==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=sWLqyqq7Sj26NNlAnI/b9A==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,818 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,946 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=sWLqyqq7Sj26NNlAnI/b9A==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,819 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@d038bfa)
2026-08-29 13:44:02,820 INFO  [ora.jdbc] (agroal-11) traceId=4B93F872. 
2026-08-29 13:44:02,821 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,822 INFO  [ora.jdbc] (agroal-11) traceId=4B93F872, anoEnabled=true. 
2026-08-29 13:44:02,823 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,824 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,825 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,826 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4B93F872
2026-08-29 13:44:02,827 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,828 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,829 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,830 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,831 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,832 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4B93F872
2026-08-29 13:44:02,833 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,834 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,835 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,836 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,837 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,838 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4B93F872
2026-08-29 13:44:02,839 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,840 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=RikkjOoASbeepX/8MOFm7w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=RikkjOoASbeepX/8MOFm7w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,841 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,963 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=RikkjOoASbeepX/8MOFm7w==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,963 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-29 13:44:02,842 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@4d90bc09)
2026-08-29 13:44:02,843 INFO  [ora.jdbc] (agroal-11) traceId=6A5688F5. 
2026-08-29 13:44:02,844 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,845 INFO  [ora.jdbc] (agroal-11) traceId=6A5688F5, anoEnabled=true. 
2026-08-29 13:44:02,846 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,847 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,848 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,849 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6A5688F5
2026-08-29 13:44:02,850 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,851 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,852 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,853 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,854 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,855 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6A5688F5
2026-08-29 13:44:02,856 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,857 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,858 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,859 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,860 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,861 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 6A5688F5
2026-08-29 13:44:02,862 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,863 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UeTdcAO6S1G/HkCJVMBcgw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UeTdcAO6S1G/HkCJVMBcgw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,864 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,978 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UeTdcAO6S1G/HkCJVMBcgw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,865 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@52c13ab0)
2026-08-29 13:44:02,866 INFO  [ora.jdbc] (agroal-11) traceId=3156CD5B. 
2026-08-29 13:44:02,867 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,868 INFO  [ora.jdbc] (agroal-11) traceId=3156CD5B, anoEnabled=true. 
2026-08-29 13:44:02,869 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,870 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,871 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,872 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3156CD5B
2026-08-29 13:44:02,873 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,874 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,875 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,876 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,877 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,878 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3156CD5B
2026-08-29 13:44:02,879 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,880 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,881 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,882 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,883 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,884 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3156CD5B
2026-08-29 13:44:02,885 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,886 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=KWB7uLpnRnK2NZ4cpfPocA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=KWB7uLpnRnK2NZ4cpfPocA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,887 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:02,995 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=KWB7uLpnRnK2NZ4cpfPocA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,888 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@60c69b46)
2026-08-29 13:44:02,889 INFO  [ora.jdbc] (agroal-11) traceId=73D8CA7F. 
2026-08-29 13:44:02,890 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,891 INFO  [ora.jdbc] (agroal-11) traceId=73D8CA7F, anoEnabled=true. 
2026-08-29 13:44:02,892 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,893 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,894 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,895 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 73D8CA7F
2026-08-29 13:44:02,896 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,897 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,898 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,899 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,900 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,901 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 73D8CA7F
2026-08-29 13:44:02,902 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,903 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,904 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,905 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,906 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,907 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 73D8CA7F
2026-08-29 13:44:02,908 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,909 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=sNWE3HzMSWq6UFf4FzkMig==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=sNWE3HzMSWq6UFf4FzkMig==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,910 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:03,030 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=sNWE3HzMSWq6UFf4FzkMig==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,911 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6b683e9c)
2026-08-29 13:44:02,912 INFO  [ora.jdbc] (agroal-11) traceId=EE41BDE. 
2026-08-29 13:44:02,913 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,914 INFO  [ora.jdbc] (agroal-11) traceId=EE41BDE, anoEnabled=true. 
2026-08-29 13:44:02,915 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,916 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,917 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,918 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = EE41BDE
2026-08-29 13:44:02,919 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,920 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,921 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,922 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,923 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,924 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = EE41BDE
2026-08-29 13:44:02,925 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,926 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,927 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,928 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,929 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,930 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = EE41BDE
2026-08-29 13:44:02,931 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,932 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=m06dU6w8TAGyQbuVoiB+TQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=m06dU6w8TAGyQbuVoiB+TQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,933 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:03,059 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=m06dU6w8TAGyQbuVoiB+TQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:02,934 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@22ccb93e)
2026-08-29 13:44:02,935 INFO  [ora.jdbc] (agroal-11) traceId=5BF1B2D4. 
2026-08-29 13:44:02,936 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,937 INFO  [ora.jdbc] (agroal-11) traceId=5BF1B2D4, anoEnabled=true. 
2026-08-29 13:44:02,938 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,939 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,940 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,941 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5BF1B2D4
2026-08-29 13:44:02,942 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,943 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,944 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,945 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,946 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,947 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5BF1B2D4
2026-08-29 13:44:02,948 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,949 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-29 13:44:02,950 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-29 13:44:02,951 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-29 13:44:02,952 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-29 13:44:02,953 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5BF1B2D4
2026-08-29 13:44:02,954 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-29 13:44:02,955 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/6MZpO/PSmO4VItdPJ/6aQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/6MZpO/PSmO4VItdPJ/6aQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-29 13:44:02,956 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-29 13:44:03,090 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=/6MZpO/PSmO4VItdPJ/6aQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-29 13:44:03,091 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-17002: I/O error: Broken pipe
https://docs.oracle.com/error-help/db/ora-17002/
2026-08-30 00:04:59,429 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@1bf4aa6c)
2026-08-30 00:04:59,430 INFO  [ora.jdbc] (agroal-11) traceId=45484991. 
2026-08-30 00:04:59,431 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-30 00:04:59,432 INFO  [ora.jdbc] (agroal-11) traceId=45484991, anoEnabled=true. 
2026-08-30 00:04:59,433 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-30 00:04:59,434 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-30 00:04:59,435 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-30 00:04:59,436 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 45484991
2026-08-30 00:04:59,437 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-30 00:04:59,438 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-30 00:04:59,439 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-30 00:04:59,440 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-30 00:04:59,441 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-30 00:04:59,442 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 45484991
2026-08-30 00:04:59,443 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-30 00:04:59,444 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-30 00:04:59,445 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-30 00:04:59,446 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-30 00:04:59,447 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-30 00:04:59,448 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 45484991
2026-08-30 00:04:59,449 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-30 00:04:59,450 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-30 00:04:59,451 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-30 00:05:00,029 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-30 00:05:00,032 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-30 00:05:00,032 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-30 00:05:00,043 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler#fecharInclusaoVencidaJob, cron=0 5 0 * * ?, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:477)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:267)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:97)
	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:626)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository.findPeriodosParaFecharInclusao(FasePlanoAquisicaoRepository.java:313)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository_ClientProxy.findPeriodosParaFecharInclusao(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService.fecharInclusaoVencida(FasePlanoAquisicaoService.java:309)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharInclusaoVencida$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.doIntercept(TransactionalInterceptorRequiresNew.java:39)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.intercept(TransactionalInterceptorRequiresNew.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharInclusaoVencida(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_ClientProxy.fecharInclusaoVencida(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler.fecharInclusaoVencidaJob(FasePlanoAquisicaoScheduler.java:25)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_Subclass.fecharInclusaoVencidaJob$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_Subclass.fecharInclusaoVencidaJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_ClientProxy.fecharInclusaoVencidaJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_ScheduledInvoker_fecharInclusaoVencidaJob_f6cfab1e6ab11821b6eae422c300bc548d22141d.invokeBean(Unknown Source)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=1YyF/RkPQkekxs73yKuikw==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-30 06:00:00,001 INFO  [br.gov.cai.sis.sil.sch.PlanoAquisicaoScheduler] (executor-thread-19) INICIO: expiracao-planos-aquisicao...
2026-08-30 06:00:00,001 INFO  [br.gov.cai.sis.sil.ser.PlanoAquisicaoService] (executor-thread-19) Iniciando processo de expiração dos planos de aquisição.
2026-08-30 05:59:59,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@694db9a7)
2026-08-30 05:59:59,429 INFO  [ora.jdbc] (agroal-11) traceId=303534DD. 
2026-08-30 05:59:59,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-30 05:59:59,431 INFO  [ora.jdbc] (agroal-11) traceId=303534DD, anoEnabled=true. 
2026-08-30 05:59:59,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-30 05:59:59,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-30 05:59:59,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-30 05:59:59,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 303534DD
2026-08-30 05:59:59,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-30 05:59:59,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-30 05:59:59,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-30 05:59:59,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-30 05:59:59,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-30 05:59:59,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 303534DD
2026-08-30 05:59:59,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-30 05:59:59,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-30 05:59:59,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-30 05:59:59,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-30 05:59:59,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-30 05:59:59,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 303534DD
2026-08-30 05:59:59,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-30 05:59:59,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBw+CtvfQCKsXWHYKNgrzg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBw+CtvfQCKsXWHYKNgrzg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-30 05:59:59,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-30 06:00:00,046 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBw+CtvfQCKsXWHYKNgrzg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-30 06:00:00,046 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-30 06:00:00,046 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBw+CtvfQCKsXWHYKNgrzg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-30 06:00:00,047 ERROR [br.gov.cai.sis.sil.ser.PlanoAquisicaoService] (executor-thread-19) Erro não esperado no método runExpiracaoPlanosAquisicao.: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBw+CtvfQCKsXWHYKNgrzg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:477)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:267)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:97)
	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:626)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository.findPeriodosBySituacao(FasePlanoAquisicaoRepository.java:230)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository.findBySituacao(FasePlanoAquisicaoRepository.java:183)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository_ClientProxy.findBySituacao(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService.fecharPeriodosAbertosComDatasVencidas(FasePlanoAquisicaoService.java:343)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharPeriodosAbertosComDatasVencidas$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass$$function$$3.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.doIntercept(TransactionalInterceptorRequiresNew.java:39)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.intercept(TransactionalInterceptorRequiresNew.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharPeriodosAbertosComDatasVencidas(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_ClientProxy.fecharPeriodosAbertosComDatasVencidas(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.runExpiracaoPlanosAquisicao(PlanoAquisicaoService.java:1100)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.runExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.executarExpiracaoPlanosAquisicao(PlanoAquisicaoScheduler.java:29)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInCallerTx(TransactionalInterceptorBase.java:335)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:40)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.expiracaoPlanosAquisicaoJob(PlanoAquisicaoScheduler.java:23)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ClientProxy.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ScheduledInvoker_expiracaoPlanosAquisicaoJob_6fcd3e643acb118d0c185cc8eb5d1bcbac5475de.invokeBean(Unknown Source)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBw+CtvfQCKsXWHYKNgrzg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=oBw+CtvfQCKsXWHYKNgrzg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-30 06:00:00,051 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler#expiracaoPlanosAquisicaoJob, cron=0 0 6 * * ?, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: br.gov.caixa.sistemas.silic.exceptions.BusinessException: Ocorreu um erro não esperado. Por favor, tente novamente.
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: br.gov.caixa.sistemas.silic.exceptions.BusinessException: Ocorreu um erro não esperado. Por favor, tente novamente.
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.runExpiracaoPlanosAquisicao(PlanoAquisicaoService.java:1112)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.runExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.executarExpiracaoPlanosAquisicao(PlanoAquisicaoScheduler.java:29)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInCallerTx(TransactionalInterceptorBase.java:335)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:40)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.expiracaoPlanosAquisicaoJob(PlanoAquisicaoScheduler.java:23)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ClientProxy.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ScheduledInvoker_expiracaoPlanosAquisicaoJob_6fcd3e643acb118d0c185cc8eb5d1bcbac5475de.invokeBean(Unknown Source)
	... 15 more

2026-08-31 00:05:00,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5e6a0a52)
2026-08-31 00:05:00,429 INFO  [ora.jdbc] (agroal-11) traceId=55439CB2. 
2026-08-31 00:05:00,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:05:00,431 INFO  [ora.jdbc] (agroal-11) traceId=55439CB2, anoEnabled=true. 
2026-08-31 00:05:00,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:05:00,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:05:00,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:05:00,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 55439CB2
2026-08-31 00:05:00,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:05:00,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:05:00,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:05:00,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:05:00,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:05:00,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 55439CB2
2026-08-31 00:05:00,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:05:00,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:05:00,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:05:00,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:05:00,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:05:00,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 55439CB2
2026-08-31 00:05:00,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:05:00,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:05:00,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 00:05:01,023 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:05:01,023 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 00:05:01,023 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:05:01,024 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler#fecharInclusaoVencidaJob, cron=0 5 0 * * ?, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:477)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:267)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:97)
	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:626)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository.findPeriodosParaFecharInclusao(FasePlanoAquisicaoRepository.java:313)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository_ClientProxy.findPeriodosParaFecharInclusao(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService.fecharInclusaoVencida(FasePlanoAquisicaoService.java:309)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharInclusaoVencida$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.doIntercept(TransactionalInterceptorRequiresNew.java:39)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.intercept(TransactionalInterceptorRequiresNew.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharInclusaoVencida(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_ClientProxy.fecharInclusaoVencida(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler.fecharInclusaoVencidaJob(FasePlanoAquisicaoScheduler.java:25)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_Subclass.fecharInclusaoVencidaJob$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_Subclass.fecharInclusaoVencidaJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_ClientProxy.fecharInclusaoVencidaJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.FasePlanoAquisicaoScheduler_ScheduledInvoker_fecharInclusaoVencidaJob_f6cfab1e6ab11821b6eae422c300bc548d22141d.invokeBean(Unknown Source)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=G1GQ5agxQuC1GRJPgIHTbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:10:00,009 INFO  [br.gov.cai.sis.sil.sch.AtesteScheduler] (executor-thread-19) INICIO: ateste-excluido-por-30-dias-como-devolvido...
2026-08-31 00:09:59,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@2c0ed76)
2026-08-31 00:09:59,429 INFO  [ora.jdbc] (agroal-11) traceId=3E210991. 
2026-08-31 00:09:59,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:09:59,431 INFO  [ora.jdbc] (agroal-11) traceId=3E210991, anoEnabled=true. 
2026-08-31 00:09:59,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:09:59,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:09:59,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:09:59,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3E210991
2026-08-31 00:09:59,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:09:59,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:09:59,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:09:59,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:09:59,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:09:59,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3E210991
2026-08-31 00:09:59,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:09:59,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:09:59,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:09:59,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:09:59,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:09:59,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3E210991
2026-08-31 00:09:59,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:09:59,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:09:59,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 00:10:00,159 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:10:00,159 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 00:10:00,160 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:10:00,161 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler#rotinaEnviarEmailAtesteExcluidoPor30DiasComoDevolvido, cron=0 10 0 ? * 2-6, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:178)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository.findBySituacaoAte(AtesteRepository.java:883)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository_ClientProxy.findBySituacaoAte(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.AtesteService.enviarEmailAtesteExcluidoPor30DiasComoDevolvido(AtesteService.java:1750)
	at br.gov.caixa.sistemas.silic.service.AtesteService_ClientProxy.enviarEmailAtesteExcluidoPor30DiasComoDevolvido(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler.rotinaEnviarEmailAtesteExcluidoPor30DiasComoDevolvido(AtesteScheduler.java:57)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmailAtesteExcluidoPor30DiasComoDevolvido$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass$$function$$6.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmailAtesteExcluidoPor30DiasComoDevolvido(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_ScheduledInvoker_rotinaEnviarEmailAtesteExcluidoPor30DiasComoDevolvido_fa6022679043a5af31a897f414a0922803cb8ad6.invokeBean(Unknown Source)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=hhw/i/2ZSg6Cw2WPLasbWA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:20:01,001 INFO  [br.gov.cai.sis.sil.sch.AtesteScheduler] (executor-thread-19) INICIO: enviar-email-ateste-devolvido...
2026-08-31 00:20:00,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6553df35)
2026-08-31 00:20:00,429 INFO  [ora.jdbc] (agroal-11) traceId=40D3C1DB. 
2026-08-31 00:20:00,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:20:00,431 INFO  [ora.jdbc] (agroal-11) traceId=40D3C1DB, anoEnabled=true. 
2026-08-31 00:20:00,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:20:00,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:20:00,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:20:00,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 40D3C1DB
2026-08-31 00:20:00,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:20:00,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:20:00,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:20:00,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:20:00,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:20:00,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 40D3C1DB
2026-08-31 00:20:00,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:20:00,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:20:00,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:20:00,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:20:00,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:20:00,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 40D3C1DB
2026-08-31 00:20:00,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:20:00,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:20:00,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 00:20:01,046 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:20:01,047 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 00:20:01,047 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:20:01,047 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler#rotinaEnviarEmailAtesteDevolvido, cron=0 20 0 ? * 2-6, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:178)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository.findBySituacaoAte(AtesteRepository.java:883)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository_ClientProxy.findBySituacaoAte(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.AtesteService.enviarEmailAtesteDevolvido(AtesteService.java:1678)
	at br.gov.caixa.sistemas.silic.service.AtesteService_ClientProxy.enviarEmailAtesteDevolvido(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler.rotinaEnviarEmailAtesteDevolvido(AtesteScheduler.java:72)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmailAtesteDevolvido$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass$$function$$5.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmailAtesteDevolvido(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_ScheduledInvoker_rotinaEnviarEmailAtesteDevolvido_6cbc28d6ff4d9dc2f71db264909ce33912610a9d.invokeBean(Unknown Source)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=WmqkCxnvSJWHId4GGwCgBg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:30:00,001 INFO  [br.gov.cai.sis.sil.sch.AtesteScheduler] (executor-thread-19) INICIO: enviar-email-ateste-excluido-por-30-dias-como-pendente-de-ateste...
2026-08-31 00:29:59,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@493f996d)
2026-08-31 00:30:01,428 INFO  [ora.jdbc] (agroal-11) traceId=7ACD4026. 
2026-08-31 00:30:01,429 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:30:01,430 INFO  [ora.jdbc] (agroal-11) traceId=7ACD4026, anoEnabled=true. 
2026-08-31 00:30:01,431 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:30:01,432 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:30:01,433 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:30:01,434 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7ACD4026
2026-08-31 00:30:01,435 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:30:01,436 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:30:01,437 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:30:01,438 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:30:01,439 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:30:01,440 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7ACD4026
2026-08-31 00:30:01,441 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:30:01,442 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:30:01,443 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:30:01,444 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:30:01,445 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:30:01,446 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 7ACD4026
2026-08-31 00:30:01,447 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:30:01,448 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:30:01,449 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 00:30:02,085 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:30:02,085 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 00:30:02,085 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:30:02,086 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler#rotinaEnviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste, cron=0 30 0 ? * 2-6, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:178)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository.findBySituacaoAte(AtesteRepository.java:883)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository_ClientProxy.findBySituacaoAte(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.AtesteService.enviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste(AtesteService.java:1783)
	at br.gov.caixa.sistemas.silic.service.AtesteService_Subclass.enviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.AtesteService_Subclass$$function$$17.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.doIntercept(TransactionalInterceptorRequiresNew.java:39)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.intercept(TransactionalInterceptorRequiresNew.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.AtesteService_Subclass.enviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.AtesteService_ClientProxy.enviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler.rotinaEnviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste(AtesteScheduler.java:89)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass$$function$$7.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_ScheduledInvoker_rotinaEnviarEmailAtesteExcluidoPor30DiasComoPendenteDeAteste_754880f5e55604699aa7d38c9e207e251ef573bd.invokeBean(Unknown Source)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=UpQfDWsaR/mYPaQZFrXFsA==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:40:01,002 INFO  [br.gov.cai.sis.sil.sch.AtesteScheduler] (executor-thread-19) INICIO: enviar-email-3-dias-como-pendente-de-ateste...
2026-08-31 00:40:00,429 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@731a661)
2026-08-31 00:40:00,430 INFO  [ora.jdbc] (agroal-11) traceId=52E830A. 
2026-08-31 00:40:00,431 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:40:00,432 INFO  [ora.jdbc] (agroal-11) traceId=52E830A, anoEnabled=true. 
2026-08-31 00:40:00,433 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:40:00,434 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:40:00,435 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:40:00,436 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 52E830A
2026-08-31 00:40:00,437 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:40:00,438 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:40:00,439 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:40:00,440 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:40:00,441 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:40:00,442 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 52E830A
2026-08-31 00:40:00,443 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:40:00,444 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 00:40:00,445 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 00:40:00,446 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 00:40:00,447 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 00:40:00,448 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 52E830A
2026-08-31 00:40:00,449 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 00:40:00,450 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 00:40:00,451 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 00:40:01,047 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:40:01,047 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 00:40:01,047 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 00:40:01,048 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler#rotinaEnviarEmail3DiasComoPendenteDeAteste, cron=0 40 0 ? * 2-6, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:178)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository.findBySituacaoAte(AtesteRepository.java:883)
	at br.gov.caixa.sistemas.silic.respository.AtesteRepository_ClientProxy.findBySituacaoAte(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.AtesteService.enviarEmail3DiasComoPendenteDeAteste(AtesteService.java:1837)
	at br.gov.caixa.sistemas.silic.service.AtesteService_ClientProxy.enviarEmail3DiasComoPendenteDeAteste(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler.rotinaEnviarEmail3DiasComoPendenteDeAteste(AtesteScheduler.java:106)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmail3DiasComoPendenteDeAteste$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass$$function$$4.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_Subclass.rotinaEnviarEmail3DiasComoPendenteDeAteste(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.AtesteScheduler_ScheduledInvoker_rotinaEnviarEmail3DiasComoPendenteDeAteste_bb80f1cde07cd64218039b6dfa08871d48916bad.invokeBean(Unknown Source)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=rYNzDmAcTF2duzODBkLpNg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 06:00:00,001 INFO  [br.gov.cai.sis.sil.sch.PlanoAquisicaoScheduler] (executor-thread-19) INICIO: expiracao-planos-aquisicao...
2026-08-31 06:00:00,001 INFO  [br.gov.cai.sis.sil.ser.PlanoAquisicaoService] (executor-thread-19) Iniciando processo de expiração dos planos de aquisição.
2026-08-31 05:59:59,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@41d59d90)
2026-08-31 05:59:59,429 INFO  [ora.jdbc] (agroal-11) traceId=DED7022. 
2026-08-31 05:59:59,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 05:59:59,431 INFO  [ora.jdbc] (agroal-11) traceId=DED7022, anoEnabled=true. 
2026-08-31 05:59:59,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 05:59:59,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 05:59:59,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 05:59:59,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = DED7022
2026-08-31 05:59:59,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 05:59:59,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 05:59:59,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 05:59:59,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 05:59:59,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 05:59:59,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = DED7022
2026-08-31 05:59:59,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 05:59:59,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 05:59:59,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 05:59:59,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 05:59:59,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 05:59:59,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = DED7022
2026-08-31 05:59:59,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 05:59:59,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0Zg/ZJsHQFCs8Q96zUWbjQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0Zg/ZJsHQFCs8Q96zUWbjQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 05:59:59,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 06:00:00,055 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0Zg/ZJsHQFCs8Q96zUWbjQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 06:00:00,055 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 06:00:00,055 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0Zg/ZJsHQFCs8Q96zUWbjQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 06:00:00,056 ERROR [br.gov.cai.sis.sil.ser.PlanoAquisicaoService] (executor-thread-19) Erro não esperado no método runExpiracaoPlanosAquisicao.: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0Zg/ZJsHQFCs8Q96zUWbjQ==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:477)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:267)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:97)
	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:626)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository.findPeriodosBySituacao(FasePlanoAquisicaoRepository.java:230)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository.findBySituacao(FasePlanoAquisicaoRepository.java:183)
	at br.gov.caixa.sistemas.silic.respository.FasePlanoAquisicaoRepository_ClientProxy.findBySituacao(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService.fecharPeriodosAbertosComDatasVencidas(FasePlanoAquisicaoService.java:343)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharPeriodosAbertosComDatasVencidas$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass$$function$$3.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.doIntercept(TransactionalInterceptorRequiresNew.java:39)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew.intercept(TransactionalInterceptorRequiresNew.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequiresNew_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_Subclass.fecharPeriodosAbertosComDatasVencidas(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.FasePlanoAquisicaoService_ClientProxy.fecharPeriodosAbertosComDatasVencidas(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.runExpiracaoPlanosAquisicao(PlanoAquisicaoService.java:1100)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.runExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.executarExpiracaoPlanosAquisicao(PlanoAquisicaoScheduler.java:29)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInCallerTx(TransactionalInterceptorBase.java:335)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:40)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.expiracaoPlanosAquisicaoJob(PlanoAquisicaoScheduler.java:23)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ClientProxy.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ScheduledInvoker_expiracaoPlanosAquisicaoJob_6fcd3e643acb118d0c185cc8eb5d1bcbac5475de.invokeBean(Unknown Source)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0Zg/ZJsHQFCs8Q96zUWbjQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=0Zg/ZJsHQFCs8Q96zUWbjQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 06:00:00,057 ERROR [io.qua.sch.com.run.StatusEmitterInvoker] (executor-thread-19) Error occurred while executing task for trigger CronTrigger [id=1_br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler#expiracaoPlanosAquisicaoJob, cron=0 0 6 * * ?, gracePeriod=PT1S, timeZone=null]: java.util.concurrent.CompletionException: br.gov.caixa.sistemas.silic.exceptions.BusinessException: Ocorreu um erro não esperado. Por favor, tente novamente.
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:870)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at java.base/java.util.concurrent.CompletableFuture$MinimalStage.whenComplete(CompletableFuture.java:2820)
	at io.quarkus.scheduler.common.runtime.DefaultInvoker.invoke(DefaultInvoker.java:24)
	at io.quarkus.scheduler.common.runtime.StatusEmitterInvoker.invoke(StatusEmitterInvoker.java:35)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask.doInvoke(SimpleScheduler.java:430)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:412)
	at io.quarkus.scheduler.runtime.SimpleScheduler$ScheduledTask$2.call(SimpleScheduler.java:409)
	at io.vertx.core.impl.ContextBase.lambda$executeBlocking$0(ContextBase.java:167)
	at io.vertx.core.impl.ContextInternal.dispatch(ContextInternal.java:277)
	at io.vertx.core.impl.ContextBase.lambda$internalExecuteBlocking$2(ContextBase.java:199)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:587)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: br.gov.caixa.sistemas.silic.exceptions.BusinessException: Ocorreu um erro não esperado. Por favor, tente novamente.
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.runExpiracaoPlanosAquisicao(PlanoAquisicaoService.java:1112)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.runExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.executarExpiracaoPlanosAquisicao(PlanoAquisicaoScheduler.java:29)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInCallerTx(TransactionalInterceptorBase.java:335)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:40)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.executarExpiracaoPlanosAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler.expiracaoPlanosAquisicaoJob(PlanoAquisicaoScheduler.java:23)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_Subclass.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ClientProxy.expiracaoPlanosAquisicaoJob(Unknown Source)
	at br.gov.caixa.sistemas.silic.scheduler.PlanoAquisicaoScheduler_ScheduledInvoker_expiracaoPlanosAquisicaoJob_6fcd3e643acb118d0c185cc8eb5d1bcbac5475de.invokeBean(Unknown Source)
	... 15 more

2026-08-31 08:39:53,615 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) USUARIO LOGADO: 891389
2026-08-31 08:39:53,615 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) PERFIL USUARIO: Administrador
2026-08-31 08:39:53,615 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) UNIDADE USUARIO: UnidadeLotacaoDTO(codigo=7111, numeroNatural=3495, nomeUnidade=null, siglaUnidade=null)
2026-08-31 08:39:53,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@1bdbab60)
2026-08-31 08:39:53,429 INFO  [ora.jdbc] (agroal-11) traceId=1F396C0B. 
2026-08-31 08:39:53,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:39:53,431 INFO  [ora.jdbc] (agroal-11) traceId=1F396C0B, anoEnabled=true. 
2026-08-31 08:39:53,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:39:53,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:39:53,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:39:53,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1F396C0B
2026-08-31 08:39:53,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:39:53,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:39:53,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:39:53,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:39:53,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:39:53,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1F396C0B
2026-08-31 08:39:53,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:39:53,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:39:53,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:39:53,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:39:53,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:39:53,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 1F396C0B
2026-08-31 08:39:53,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:39:53,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 08:39:53,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 08:39:53,647 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 08:39:53,647 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-20) SQL Error: 12514, SQLState: 08006
2026-08-31 08:39:53,647 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-20) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 08:39:53,648 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-20) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 08:39:53,658 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-20) HTTP Request to /api/v2/notificacoes/consultar?page=0&pageSize=10&perfilusuarioLogado=LIC_ADMINISTRADOR failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-1: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.NotificacaoRepository.findByFilterPaginado(NotificacaoRepository.java:138)
	at br.gov.caixa.sistemas.silic.respository.NotificacaoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.NotificacaoService.findByFilterPaginado(NotificacaoService.java:166)
	at br.gov.caixa.sistemas.silic.service.NotificacaoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource.findByFilterPaginado(NotificacaoResource.java:47)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass$$function$$4.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=e6NZn6YnQ/OFKtj0t2X72Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 08:40:12,429 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@5e2995f0)
2026-08-31 08:40:12,430 INFO  [ora.jdbc] (agroal-11) traceId=57AED5D8. 
2026-08-31 08:40:12,431 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:40:12,432 INFO  [ora.jdbc] (agroal-11) traceId=57AED5D8, anoEnabled=true. 
2026-08-31 08:40:12,433 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:40:12,434 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:40:12,435 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:40:12,436 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 57AED5D8
2026-08-31 08:40:12,437 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:40:12,438 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:40:12,439 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:40:12,440 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:40:12,441 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:40:12,442 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 57AED5D8
2026-08-31 08:40:12,443 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:40:12,444 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:40:12,445 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:40:12,446 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:40:12,447 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:40:12,448 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 57AED5D8
2026-08-31 08:40:12,449 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:40:12,450 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 08:40:12,451 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 08:40:13,194 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 08:40:13,195 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 08:40:13,195 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 08:40:13,195 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-19) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 08:40:13,196 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/lote-ateste/consultar-paginado?situacaoProcessamento=PROCESSAMENTO&tipoInclusaoLote=PLANO_AQUISICAO&pageSize=10 failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-2: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.LoteAtestePlanoRepository.findByFilterPaginado(LoteAtestePlanoRepository.java:113)
	at br.gov.caixa.sistemas.silic.respository.LoteAtestePlanoRepository_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.respository.LoteAtestePlanoRepository_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInNoTx(TransactionalInterceptorBase.java:344)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorNotSupported.doIntercept(TransactionalInterceptorNotSupported.java:34)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorNotSupported.intercept(TransactionalInterceptorNotSupported.java:26)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorNotSupported_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.respository.LoteAtestePlanoRepository_Subclass.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.respository.LoteAtestePlanoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.LoteAtestePlanoService.findByFilterPaginado(LoteAtestePlanoService.java:36)
	at br.gov.caixa.sistemas.silic.service.LoteAtestePlanoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.LoteService.findByFilterPaginado(LoteService.java:192)
	at br.gov.caixa.sistemas.silic.service.LoteService_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.LoteService_Subclass$$function$$3.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.service.LoteService_Subclass.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.LoteService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.LoteResource.findByFilterPaginado(LoteResource.java:51)
	at br.gov.caixa.sistemas.silic.resources.LoteResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.LoteResource_Subclass$$function$$2.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.LoteResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=L2aAT1cwTP6QpYWJTKiKHQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 08:40:22,848 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) USUARIO LOGADO: 891389
2026-08-31 08:40:22,848 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) PERFIL USUARIO: Administrador
2026-08-31 08:40:22,848 INFO  [br.gov.cai.sis.sil.ser.NotificacaoService] (executor-thread-20) UNIDADE USUARIO: UnidadeLotacaoDTO(codigo=7111, numeroNatural=3495, nomeUnidade=null, siglaUnidade=null)
2026-08-31 08:40:22,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@48e712d8)
2026-08-31 08:40:22,429 INFO  [ora.jdbc] (agroal-11) traceId=127076F1. 
2026-08-31 08:40:22,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:40:22,431 INFO  [ora.jdbc] (agroal-11) traceId=127076F1, anoEnabled=true. 
2026-08-31 08:40:22,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:40:22,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:40:22,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:40:22,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 127076F1
2026-08-31 08:40:22,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:40:22,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:40:22,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:40:22,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:40:22,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:40:22,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 127076F1
2026-08-31 08:40:22,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:40:22,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 08:40:22,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 08:40:22,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 08:40:22,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 08:40:22,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 127076F1
2026-08-31 08:40:22,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 08:40:22,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 08:40:22,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 08:40:22,867 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 08:40:22,868 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-20) SQL Error: 12514, SQLState: 08006
2026-08-31 08:40:22,868 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-20) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 08:40:22,868 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-20) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 08:40:22,869 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-20) HTTP Request to /api/v2/notificacoes/consultar?page=0&pageSize=10&perfilusuarioLogado=LIC_ADMINISTRADOR failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-3: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.NotificacaoRepository.findByFilterPaginado(NotificacaoRepository.java:138)
	at br.gov.caixa.sistemas.silic.respository.NotificacaoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.NotificacaoService.findByFilterPaginado(NotificacaoService.java:166)
	at br.gov.caixa.sistemas.silic.service.NotificacaoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource.findByFilterPaginado(NotificacaoResource.java:47)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass$$function$$4.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.NotificacaoResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=fpJXBZAhQe6arT2Iu+o7yQ==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:04:59,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@796e1261)
2026-08-31 09:04:59,429 INFO  [ora.jdbc] (agroal-11) traceId=3DE81BEC. 
2026-08-31 09:04:59,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:04:59,431 INFO  [ora.jdbc] (agroal-11) traceId=3DE81BEC, anoEnabled=true. 
2026-08-31 09:04:59,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:04:59,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:04:59,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:04:59,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3DE81BEC
2026-08-31 09:04:59,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:04:59,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:04:59,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:04:59,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:04:59,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:04:59,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3DE81BEC
2026-08-31 09:04:59,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:04:59,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:04:59,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:04:59,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:04:59,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:04:59,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3DE81BEC
2026-08-31 09:04:59,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:04:59,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:04:59,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 09:05:00,235 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:00,235 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-20) SQL Error: 12514, SQLState: 08006
2026-08-31 09:05:00,235 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-20) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:00,236 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-20) HTTP Request to /api/v2/tipos-situacao-ateste failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-4: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.list(CommonPanacheQueryImpl.java:280)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.list(PanacheQueryImpl.java:149)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:24)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:10)
	at io.quarkus.hibernate.orm.panache.common.runtime.AbstractJpaOperations.listAll(AbstractJpaOperations.java:305)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository.listAll(TipoSituacaoAtesteRepository.java)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository_ClientProxy.listAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService.findAll(TipoSituacaoAtesteService.java:19)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService_ClientProxy.findAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource.findAll(TipoSituacaoAtesteResource.java:30)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=wmUQfY4GStKoVe1BBsBv1w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:05:28,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@6dc443f9)
2026-08-31 09:05:28,429 INFO  [ora.jdbc] (agroal-11) traceId=179B102. 
2026-08-31 09:05:28,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:28,431 INFO  [ora.jdbc] (agroal-11) traceId=179B102, anoEnabled=true. 
2026-08-31 09:05:28,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:28,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:28,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:28,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 179B102
2026-08-31 09:05:28,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:28,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:28,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:28,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:28,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:28,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 179B102
2026-08-31 09:05:28,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:28,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:28,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:28,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:28,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:28,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 179B102
2026-08-31 09:05:28,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:28,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:05:28,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 09:05:28,519 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:28,520 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 09:05:28,520 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:28,520 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/tipos-situacao-ateste failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-5: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.list(CommonPanacheQueryImpl.java:280)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.list(PanacheQueryImpl.java:149)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:24)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:10)
	at io.quarkus.hibernate.orm.panache.common.runtime.AbstractJpaOperations.listAll(AbstractJpaOperations.java:305)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository.listAll(TipoSituacaoAtesteRepository.java)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository_ClientProxy.listAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService.findAll(TipoSituacaoAtesteService.java:19)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService_ClientProxy.findAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource.findAll(TipoSituacaoAtesteResource.java:30)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dtRV8CUSQa+dQnFE9jCo6Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:05:38,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@2fddf69a)
2026-08-31 09:05:38,429 INFO  [ora.jdbc] (agroal-11) traceId=8D2B3CA. 
2026-08-31 09:05:38,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:38,431 INFO  [ora.jdbc] (agroal-11) traceId=8D2B3CA, anoEnabled=true. 
2026-08-31 09:05:38,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:38,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:38,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:38,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 8D2B3CA
2026-08-31 09:05:38,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:38,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:38,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:38,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:38,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:38,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 8D2B3CA
2026-08-31 09:05:38,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:38,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:38,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:38,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:38,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:38,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 8D2B3CA
2026-08-31 09:05:38,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:38,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:05:38,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 09:05:39,299 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:39,299 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 09:05:39,299 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:39,300 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/planos-aquisicao/consultar-anos-do-plano-aquisicao failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-6: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository.getAnosDoPlanoAquisicao(PlanoAquisicaoRepository.java:131)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository_ClientProxy.getAnosDoPlanoAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.getAnosDoPlanoAquisicao(PlanoAquisicaoService.java:408)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.getAnosDoPlanoAquisicao(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource.getAnosDoPlanoAquisicao(PlanoAquisicaoResource.java:62)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.getAnosDoPlanoAquisicao$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass$$function$$12.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.getAnosDoPlanoAquisicao(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=lYT4r1JfR3+VR4TIMkTZwg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:05:58,697 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-19) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-31 09:05:58,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@16d13795)
2026-08-31 09:05:58,429 INFO  [ora.jdbc] (agroal-11) traceId=5BAA22A7. 
2026-08-31 09:05:58,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:58,431 INFO  [ora.jdbc] (agroal-11) traceId=5BAA22A7, anoEnabled=true. 
2026-08-31 09:05:58,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:58,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:58,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:58,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5BAA22A7
2026-08-31 09:05:58,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:58,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:58,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:58,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:58,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:58,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5BAA22A7
2026-08-31 09:05:58,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:58,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:05:58,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:05:58,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:05:58,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:05:58,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 5BAA22A7
2026-08-31 09:05:58,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:05:58,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:05:58,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 09:05:58,718 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:58,718 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 09:05:58,719 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:05:58,719 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-19) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 09:05:58,720 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/planos-aquisicao/consultar?page=0&pageSize=10 failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-7: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository.findByFilterPaginado(PlanoAquisicaoRepository.java:184)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.findByFilterPaginado(PlanoAquisicaoService.java:412)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource.findByFilterPaginado(PlanoAquisicaoResource.java:70)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass$$function$$8.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=ACBLGgQQRxOoD53/VFKqbg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:14:48,101 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-19) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.numeroPlanoAquisicao = :numeroPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-31 09:14:47,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@2f89cf06)
2026-08-31 09:14:47,429 INFO  [ora.jdbc] (agroal-11) traceId=3856ADDE. 
2026-08-31 09:14:47,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:14:47,431 INFO  [ora.jdbc] (agroal-11) traceId=3856ADDE, anoEnabled=true. 
2026-08-31 09:14:47,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:14:47,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:14:47,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:14:47,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3856ADDE
2026-08-31 09:14:47,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:14:47,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:14:47,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:14:47,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:14:47,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:14:47,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3856ADDE
2026-08-31 09:14:47,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:14:47,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:14:47,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:14:47,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:14:47,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:14:47,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 3856ADDE
2026-08-31 09:14:47,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:14:47,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:14:47,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 09:14:48,130 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:14:48,130 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 09:14:48,130 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:14:48,130 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-19) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 09:14:48,131 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/planos-aquisicao/consultar?numeroPlanoAquisicao=325&page=0&pageSize=10 failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-8: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository.findByFilterPaginado(PlanoAquisicaoRepository.java:184)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.findByFilterPaginado(PlanoAquisicaoService.java:412)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource.findByFilterPaginado(PlanoAquisicaoResource.java:70)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass$$function$$8.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=75l6zASJRCCZxAtezfF4zg==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:14:58,772 INFO  [br.gov.cai.sis.sil.res.PlanoAquisicaoRepository] (executor-thread-19) Query principal: SELECT DISTINCT pa FROM PlanoAquisicao pa  LEFT JOIN FETCH pa.tipoSituacaoPlanoAquisicao tspa  LEFT JOIN FETCH pa.justificativaDemandaNaoSolicitada jdns  WHERE 1=1  AND pa.id.numeroPlanoAquisicao = :numeroPlanoAquisicao ORDER BY pa.id.numeroPlanoAquisicao ASC, pa.id.anoPlanoAquisicao ASC
2026-08-31 09:14:58,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@3414fbee)
2026-08-31 09:14:58,429 INFO  [ora.jdbc] (agroal-11) traceId=4E84B3C3. 
2026-08-31 09:14:58,430 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:14:58,431 INFO  [ora.jdbc] (agroal-11) traceId=4E84B3C3, anoEnabled=true. 
2026-08-31 09:14:58,432 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:14:58,433 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:14:58,434 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:14:58,435 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4E84B3C3
2026-08-31 09:14:58,436 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:14:58,437 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:14:58,438 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:14:58,439 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:14:58,440 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:14:58,441 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4E84B3C3
2026-08-31 09:14:58,442 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:14:58,443 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:14:58,444 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:14:58,445 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:14:58,446 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:14:58,447 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 4E84B3C3
2026-08-31 09:14:58,448 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:14:58,449 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:14:58,450 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 09:14:58,791 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:14:58,792 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 09:14:58,792 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:14:58,792 ERROR [br.gov.cai.sis.sil.int.CompletarValoresDeAPIsInterceptor] (executor-thread-19) Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
2026-08-31 09:14:58,793 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/planos-aquisicao/consultar?numeroPlanoAquisicao=325&page=0&pageSize=10 failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-9: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository.findByFilterPaginado(PlanoAquisicaoRepository.java:184)
	at br.gov.caixa.sistemas.silic.respository.PlanoAquisicaoRepository_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService.findByFilterPaginado(PlanoAquisicaoService.java:412)
	at br.gov.caixa.sistemas.silic.service.PlanoAquisicaoService_ClientProxy.findByFilterPaginado(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource.findByFilterPaginado(PlanoAquisicaoResource.java:70)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass$$function$$8.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor.intercept(CompletarValoresDeAPIsInterceptor.java:68)
	at br.gov.caixa.sistemas.silic.interceptors.CompletarValoresDeAPIsInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.PlanoAquisicaoResource_Subclass.findByFilterPaginado(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=6qHxg8nZRdq/jfaCtbk77w==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:15:10,276 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-19) Token expirado, solicitando novo token.
2026-08-31 09:15:10,276 INFO  [br.gov.cai.sis.sil.int.tok.ser.SSOTokenService] (executor-thread-19) Limpando token-cache
2026-08-31 09:15:11,173 ERROR [br.gov.cai.sis.sil.sec.SecurityRequestFilter] (executor-thread-19) Erro ao acessar o serviço SIICO para a matrícula: 891389: br.gov.caixa.sistemas.silic.exceptions.BadGatwayException: ## COMUNICACAO SILIC --> ERRO NA INTEGRACAO COM O SERVIÇO: 500
{"erros":[{"codigo":500,"mensagem":"A requisição está formatada corretamente, mas um problema ocorreu no servidor.","orientacao":null}]}
	at br.gov.caixa.sistemas.silic.integracao.common.exceptions.ExceptionEnum$6.throwEx(ExceptionEnum.java:56)
	at br.gov.caixa.sistemas.silic.integracao.common.exceptions.ExceptionEnum.getException(ExceptionEnum.java:79)
	at br.gov.caixa.sistemas.silic.integracao.client.exception.infocorp.ClientExceptionMapper.toThrowable(ClientExceptionMapper.java:12)
	at br.gov.caixa.sistemas.silic.integracao.client.exception.infocorp.ClientExceptionMapper.toThrowable(ClientExceptionMapper.java:8)
	at org.jboss.resteasy.microprofile.client.ExceptionMapping$HandlerException.mapException(ExceptionMapping.java:60)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.interceptorChainCompleted(QuarkusInvocationContextImpl.java:84)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:106)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.lambda$syncFlow$3(FaultToleranceInterceptor.java:253)
	at io.smallrye.faulttolerance.core.InvocationContext.call(InvocationContext.java:20)
	at io.smallrye.faulttolerance.core.Invocation.apply(Invocation.java:29)
	at io.smallrye.faulttolerance.core.timeout.Timeout.doApply(Timeout.java:55)
	at io.smallrye.faulttolerance.core.timeout.Timeout.apply(Timeout.java:30)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.inClosed(CircuitBreaker.java:90)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.doApply(CircuitBreaker.java:73)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.apply(CircuitBreaker.java:60)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:88)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:42)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:101)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:91)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:255)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:182)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl$InterceptorInvocation.invoke(QuarkusInvocationContextImpl.java:195)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.invokeNext(QuarkusInvocationContextImpl.java:68)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:104)
	at io.quarkus.restclient.runtime.QuarkusProxyInvocationHandler.invoke(QuarkusProxyInvocationHandler.java:162)
	at com.sun.proxy.$Proxy129.getEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest.findEmpregadoByMatricula(EmpregadoRest.java:37)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.cache.runtime.CacheResultInterceptor$4.apply(CacheResultInterceptor.java:143)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl.getFromCaffeine(CaffeineCacheImpl.java:171)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:93)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:90)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromCompletionStage.subscribe(UniCreateFromCompletionStage.java:24)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:36)
	at io.smallrye.mutiny.operators.uni.UniBlockingAwait.await(UniBlockingAwait.java:60)
	at io.smallrye.mutiny.groups.UniAwait.atMost(UniAwait.java:65)
	at io.smallrye.mutiny.groups.UniAwait.indefinitely(UniAwait.java:46)
	at io.quarkus.cache.runtime.CacheResultInterceptor.intercept(CacheResultInterceptor.java:153)
	at io.quarkus.cache.runtime.CacheResultInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService.findEmpregadoByMatricula(EmpregadoCaixaService.java:58)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregadoByMatriculaSIICO(SecurityRequestFilter.java:118)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregado(SecurityRequestFilter.java:113)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.getSecurityContextData(SecurityRequestFilter.java:87)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.setSecurityContext(SecurityRequestFilter.java:78)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.lambda$filter$0(SecurityRequestFilter.java:62)
	at java.base/java.util.Optional.ifPresentOrElse(Optional.java:201)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.filter(SecurityRequestFilter.java:61)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:276)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-08-31 09:15:11,173 ERROR [br.gov.cai.sis.sil.sec.SecurityRequestFilter] (executor-thread-20) Erro ao acessar o serviço SIICO para a matrícula: 891389: br.gov.caixa.sistemas.silic.exceptions.BadGatwayException: ## COMUNICACAO SILIC --> ERRO NA INTEGRACAO COM O SERVIÇO: 500
{"erros":[{"codigo":500,"mensagem":"A requisição está formatada corretamente, mas um problema ocorreu no servidor.","orientacao":null}]}
	at br.gov.caixa.sistemas.silic.integracao.common.exceptions.ExceptionEnum$6.throwEx(ExceptionEnum.java:56)
	at br.gov.caixa.sistemas.silic.integracao.common.exceptions.ExceptionEnum.getException(ExceptionEnum.java:79)
	at br.gov.caixa.sistemas.silic.integracao.client.exception.infocorp.ClientExceptionMapper.toThrowable(ClientExceptionMapper.java:12)
	at br.gov.caixa.sistemas.silic.integracao.client.exception.infocorp.ClientExceptionMapper.toThrowable(ClientExceptionMapper.java:8)
	at org.jboss.resteasy.microprofile.client.ExceptionMapping$HandlerException.mapException(ExceptionMapping.java:60)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.interceptorChainCompleted(QuarkusInvocationContextImpl.java:84)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:106)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.lambda$syncFlow$3(FaultToleranceInterceptor.java:253)
	at io.smallrye.faulttolerance.core.InvocationContext.call(InvocationContext.java:20)
	at io.smallrye.faulttolerance.core.Invocation.apply(Invocation.java:29)
	at io.smallrye.faulttolerance.core.timeout.Timeout.doApply(Timeout.java:55)
	at io.smallrye.faulttolerance.core.timeout.Timeout.apply(Timeout.java:30)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.inClosed(CircuitBreaker.java:90)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.doApply(CircuitBreaker.java:73)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.apply(CircuitBreaker.java:60)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:88)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:42)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:101)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:91)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:255)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:182)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl$InterceptorInvocation.invoke(QuarkusInvocationContextImpl.java:195)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.invokeNext(QuarkusInvocationContextImpl.java:68)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:104)
	at io.quarkus.restclient.runtime.QuarkusProxyInvocationHandler.invoke(QuarkusProxyInvocationHandler.java:162)
	at com.sun.proxy.$Proxy129.getEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest.findEmpregadoByMatricula(EmpregadoRest.java:37)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.cache.runtime.CacheResultInterceptor$4.apply(CacheResultInterceptor.java:143)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl.getFromCaffeine(CaffeineCacheImpl.java:171)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:93)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:90)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromCompletionStage.subscribe(UniCreateFromCompletionStage.java:24)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:36)
	at io.smallrye.mutiny.operators.uni.UniBlockingAwait.await(UniBlockingAwait.java:60)
	at io.smallrye.mutiny.groups.UniAwait.atMost(UniAwait.java:65)
	at io.smallrye.mutiny.groups.UniAwait.indefinitely(UniAwait.java:46)
	at io.quarkus.cache.runtime.CacheResultInterceptor.intercept(CacheResultInterceptor.java:153)
	at io.quarkus.cache.runtime.CacheResultInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService.findEmpregadoByMatricula(EmpregadoCaixaService.java:58)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregadoByMatriculaSIICO(SecurityRequestFilter.java:118)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregado(SecurityRequestFilter.java:113)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.getSecurityContextData(SecurityRequestFilter.java:87)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.setSecurityContext(SecurityRequestFilter.java:78)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.lambda$filter$0(SecurityRequestFilter.java:62)
	at java.base/java.util.Optional.ifPresentOrElse(Optional.java:201)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.filter(SecurityRequestFilter.java:61)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:276)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-08-31 09:15:30,405 ERROR [br.gov.cai.sis.sil.sec.SecurityRequestFilter] (executor-thread-19) Erro ao acessar o serviço SIICO para a matrícula: 891389: org.eclipse.microprofile.faulttolerance.exceptions.CircuitBreakerOpenException: br.gov.caixa.sistemas.silic.integracao.client.infocorp.InfoCorpPrivadasClient#getEmpregadoByMatricula circuit breaker is open
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.inOpen(CircuitBreaker.java:115)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.doApply(CircuitBreaker.java:75)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.apply(CircuitBreaker.java:60)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:88)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:42)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:101)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:91)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:255)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:182)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl$InterceptorInvocation.invoke(QuarkusInvocationContextImpl.java:195)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.invokeNext(QuarkusInvocationContextImpl.java:68)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:104)
	at io.quarkus.restclient.runtime.QuarkusProxyInvocationHandler.invoke(QuarkusProxyInvocationHandler.java:162)
	at com.sun.proxy.$Proxy129.getEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest.findEmpregadoByMatricula(EmpregadoRest.java:37)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.cache.runtime.CacheResultInterceptor$4.apply(CacheResultInterceptor.java:143)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl.getFromCaffeine(CaffeineCacheImpl.java:171)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:93)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:90)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromCompletionStage.subscribe(UniCreateFromCompletionStage.java:24)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:36)
	at io.smallrye.mutiny.operators.uni.UniBlockingAwait.await(UniBlockingAwait.java:60)
	at io.smallrye.mutiny.groups.UniAwait.atMost(UniAwait.java:65)
	at io.smallrye.mutiny.groups.UniAwait.indefinitely(UniAwait.java:46)
	at io.quarkus.cache.runtime.CacheResultInterceptor.intercept(CacheResultInterceptor.java:153)
	at io.quarkus.cache.runtime.CacheResultInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService.findEmpregadoByMatricula(EmpregadoCaixaService.java:58)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregadoByMatriculaSIICO(SecurityRequestFilter.java:118)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregado(SecurityRequestFilter.java:113)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.getSecurityContextData(SecurityRequestFilter.java:87)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.setSecurityContext(SecurityRequestFilter.java:78)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.lambda$filter$0(SecurityRequestFilter.java:62)
	at java.base/java.util.Optional.ifPresentOrElse(Optional.java:201)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.filter(SecurityRequestFilter.java:61)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:276)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-08-31 09:15:30,405 ERROR [br.gov.cai.sis.sil.sec.SecurityRequestFilter] (executor-thread-20) Erro ao acessar o serviço SIICO para a matrícula: 891389: org.eclipse.microprofile.faulttolerance.exceptions.CircuitBreakerOpenException: br.gov.caixa.sistemas.silic.integracao.client.infocorp.InfoCorpPrivadasClient#getEmpregadoByMatricula circuit breaker is open
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.inOpen(CircuitBreaker.java:115)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.doApply(CircuitBreaker.java:75)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.apply(CircuitBreaker.java:60)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:88)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:42)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:101)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:91)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:255)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:182)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl$InterceptorInvocation.invoke(QuarkusInvocationContextImpl.java:195)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.invokeNext(QuarkusInvocationContextImpl.java:68)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:104)
	at io.quarkus.restclient.runtime.QuarkusProxyInvocationHandler.invoke(QuarkusProxyInvocationHandler.java:162)
	at com.sun.proxy.$Proxy129.getEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest.findEmpregadoByMatricula(EmpregadoRest.java:37)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.cache.runtime.CacheResultInterceptor$4.apply(CacheResultInterceptor.java:143)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl.getFromCaffeine(CaffeineCacheImpl.java:171)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:93)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:90)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromCompletionStage.subscribe(UniCreateFromCompletionStage.java:24)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:36)
	at io.smallrye.mutiny.operators.uni.UniBlockingAwait.await(UniBlockingAwait.java:60)
	at io.smallrye.mutiny.groups.UniAwait.atMost(UniAwait.java:65)
	at io.smallrye.mutiny.groups.UniAwait.indefinitely(UniAwait.java:46)
	at io.quarkus.cache.runtime.CacheResultInterceptor.intercept(CacheResultInterceptor.java:153)
	at io.quarkus.cache.runtime.CacheResultInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService.findEmpregadoByMatricula(EmpregadoCaixaService.java:58)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregadoByMatriculaSIICO(SecurityRequestFilter.java:118)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregado(SecurityRequestFilter.java:113)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.getSecurityContextData(SecurityRequestFilter.java:87)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.setSecurityContext(SecurityRequestFilter.java:78)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.lambda$filter$0(SecurityRequestFilter.java:62)
	at java.base/java.util.Optional.ifPresentOrElse(Optional.java:201)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.filter(SecurityRequestFilter.java:61)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:276)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-08-31 09:16:06,768 ERROR [br.gov.cai.sis.sil.sec.SecurityRequestFilter] (executor-thread-19) Erro ao acessar o serviço SIICO para a matrícula: 891475: org.eclipse.microprofile.faulttolerance.exceptions.CircuitBreakerOpenException: br.gov.caixa.sistemas.silic.integracao.client.infocorp.InfoCorpPrivadasClient#getEmpregadoByMatricula circuit breaker is open
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.inOpen(CircuitBreaker.java:115)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.doApply(CircuitBreaker.java:75)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.apply(CircuitBreaker.java:60)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:88)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:42)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:101)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:91)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:255)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:182)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl$InterceptorInvocation.invoke(QuarkusInvocationContextImpl.java:195)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.invokeNext(QuarkusInvocationContextImpl.java:68)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:104)
	at io.quarkus.restclient.runtime.QuarkusProxyInvocationHandler.invoke(QuarkusProxyInvocationHandler.java:162)
	at com.sun.proxy.$Proxy129.getEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest.findEmpregadoByMatricula(EmpregadoRest.java:37)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.cache.runtime.CacheResultInterceptor$4.apply(CacheResultInterceptor.java:143)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl.getFromCaffeine(CaffeineCacheImpl.java:171)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:93)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:90)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromCompletionStage.subscribe(UniCreateFromCompletionStage.java:24)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:36)
	at io.smallrye.mutiny.operators.uni.UniBlockingAwait.await(UniBlockingAwait.java:60)
	at io.smallrye.mutiny.groups.UniAwait.atMost(UniAwait.java:65)
	at io.smallrye.mutiny.groups.UniAwait.indefinitely(UniAwait.java:46)
	at io.quarkus.cache.runtime.CacheResultInterceptor.intercept(CacheResultInterceptor.java:153)
	at io.quarkus.cache.runtime.CacheResultInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService.findEmpregadoByMatricula(EmpregadoCaixaService.java:58)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregadoByMatriculaSIICO(SecurityRequestFilter.java:118)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregado(SecurityRequestFilter.java:113)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.getSecurityContextData(SecurityRequestFilter.java:87)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.setSecurityContext(SecurityRequestFilter.java:78)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.lambda$filter$0(SecurityRequestFilter.java:62)
	at java.base/java.util.Optional.ifPresentOrElse(Optional.java:201)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.filter(SecurityRequestFilter.java:61)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:276)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-08-31 09:16:06,768 ERROR [br.gov.cai.sis.sil.sec.SecurityRequestFilter] (executor-thread-20) Erro ao acessar o serviço SIICO para a matrícula: 891475: org.eclipse.microprofile.faulttolerance.exceptions.CircuitBreakerOpenException: br.gov.caixa.sistemas.silic.integracao.client.infocorp.InfoCorpPrivadasClient#getEmpregadoByMatricula circuit breaker is open
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.inOpen(CircuitBreaker.java:115)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.doApply(CircuitBreaker.java:75)
	at io.smallrye.faulttolerance.core.circuit.breaker.CircuitBreaker.apply(CircuitBreaker.java:60)
	at io.smallrye.faulttolerance.core.retry.Retry.doApply(Retry.java:88)
	at io.smallrye.faulttolerance.core.retry.Retry.apply(Retry.java:42)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.doApply(MetricsCollector.java:101)
	at io.smallrye.faulttolerance.core.metrics.MetricsCollector.apply(MetricsCollector.java:91)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.syncFlow(FaultToleranceInterceptor.java:255)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor.intercept(FaultToleranceInterceptor.java:182)
	at io.smallrye.faulttolerance.FaultToleranceInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl$InterceptorInvocation.invoke(QuarkusInvocationContextImpl.java:195)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.invokeNext(QuarkusInvocationContextImpl.java:68)
	at io.quarkus.restclient.runtime.QuarkusInvocationContextImpl.proceed(QuarkusInvocationContextImpl.java:104)
	at io.quarkus.restclient.runtime.QuarkusProxyInvocationHandler.invoke(QuarkusProxyInvocationHandler.java:162)
	at com.sun.proxy.$Proxy129.getEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest.findEmpregadoByMatricula(EmpregadoRest.java:37)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.cache.runtime.CacheResultInterceptor$4.apply(CacheResultInterceptor.java:143)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl.getFromCaffeine(CaffeineCacheImpl.java:171)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:93)
	at io.quarkus.cache.runtime.caffeine.CaffeineCacheImpl$2.get(CaffeineCacheImpl.java:90)
	at io.smallrye.context.impl.wrappers.SlowContextualSupplier.get(SlowContextualSupplier.java:21)
	at io.smallrye.mutiny.operators.uni.builders.UniCreateFromCompletionStage.subscribe(UniCreateFromCompletionStage.java:24)
	at io.smallrye.mutiny.operators.AbstractUni.subscribe(AbstractUni.java:36)
	at io.smallrye.mutiny.operators.uni.UniBlockingAwait.await(UniBlockingAwait.java:60)
	at io.smallrye.mutiny.groups.UniAwait.atMost(UniAwait.java:65)
	at io.smallrye.mutiny.groups.UniAwait.indefinitely(UniAwait.java:46)
	at io.quarkus.cache.runtime.CacheResultInterceptor.intercept(CacheResultInterceptor.java:153)
	at io.quarkus.cache.runtime.CacheResultInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_Subclass.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.rest.EmpregadoRest_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService.findEmpregadoByMatricula(EmpregadoCaixaService.java:58)
	at br.gov.caixa.sistemas.silic.integracao.siico.service.EmpregadoCaixaService_ClientProxy.findEmpregadoByMatricula(Unknown Source)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregadoByMatriculaSIICO(SecurityRequestFilter.java:118)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.findEmpregado(SecurityRequestFilter.java:113)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.getSecurityContextData(SecurityRequestFilter.java:87)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.setSecurityContext(SecurityRequestFilter.java:78)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.lambda$filter$0(SecurityRequestFilter.java:62)
	at java.base/java.util.Optional.ifPresentOrElse(Optional.java:201)
	at br.gov.caixa.sistemas.silic.security.SecurityRequestFilter.filter(SecurityRequestFilter.java:61)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:276)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

2026-08-31 09:33:30,428 INFO  [ora.jdbc] (agroal-11) entering args (oracle.jdbc.internal.AbstractConnectionBuilder$1@79dae105)
2026-08-31 09:33:32,428 INFO  [ora.jdbc] (agroal-11) traceId=33BE0A8E. 
2026-08-31 09:33:32,429 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:33:32,430 INFO  [ora.jdbc] (agroal-11) traceId=33BE0A8E, anoEnabled=true. 
2026-08-31 09:33:32,431 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:33:32,432 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:33:32,433 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:33:32,434 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 33BE0A8E
2026-08-31 09:33:32,435 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:33:32,436 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:33:32,437 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:33:32,438 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:33:32,439 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:33:32,440 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 33BE0A8E
2026-08-31 09:33:32,441 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:33:32,442 INFO  [ora.jdbc] (agroal-11) Session Attributes: 
sdu=8192, tdu=2097152
nt: host=cnpexdadvm01-scan4.extra.caixa.gov.br, port=1521, socketOptions={0=YES, 1=NO, 2=0, 38=TLS, 40=false, 11=/deployments/caixa-truststore-acteste-nprd-silic.jks, 17=0, 18=false, 20=true, 23=40, 24=50, 25=0}
    socket=null
client profile={oracle.net.encryption_types_client=(), oracle.net.crypto_seed=, oracle.net.authentication_services=(), oracle.net.setFIPSMode=false, oracle.net.kerberos5_mutual_authentication=false, oracle.net.encryption_client=ACCEPTED, oracle.net.crypto_checksum_client=ACCEPTED, oracle.net.crypto_checksum_types_client=()}
onBreakReset=false, dataEOF=false, negotiatedOptions=0x0, connected=false
2026-08-31 09:33:32,443 FINEST [ora.jdbc] (agroal-11) 74 bytes written to the Socket.
2026-08-31 09:33:32,444 FINEST [ora.jdbc] (agroal-11) 286 bytes written to the Socket.
2026-08-31 09:33:32,445 FINEST [ora.jdbc] (agroal-11) 95 bytes
2026-08-31 09:33:32,446 INFO  [ora.jdbc] (agroal-11) Got Refused, SessionTraceId = 33BE0A8E
2026-08-31 09:33:32,447 INFO  [ora.jdbc] (agroal-11) Outbound interrupt timer cancelled null
2026-08-31 09:33:32,448 INFO  [ora.jdbc] (agroal-11) throwing: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

2026-08-31 09:33:32,449 INFO  [ora.jdbc] (agroal-11) properties={LOCALE=en_US, DriverVersion=23.3.0.23.09, java.library.path: =/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib, java.class.path: =/deployments/quarkus-run.jar, java.version: =11.0.11}. 
2026-08-31 09:33:32,544 WARN  [io.agr.pool] (agroal-11) Datasource '<default>': ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:33:32,544 WARN  [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) SQL Error: 12514, SQLState: 08006
2026-08-31 09:33:32,544 ERROR [org.hib.eng.jdb.spi.SqlExceptionHelper] (executor-thread-19) ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/
2026-08-31 09:33:32,545 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-19) HTTP Request to /api/v2/tipos-situacao-ateste failed, error id: 129c24a5-204f-471c-8977-157271c0c5f6-10: org.jboss.resteasy.spi.UnhandledException: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.jboss.resteasy.core.ExceptionHandler.handleApplicationException(ExceptionHandler.java:107)
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:344)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:205)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:452)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:240)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:154)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:157)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:229)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:82)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:147)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at io.quarkus.vertx.core.runtime.VertxCoreRecorder$14.runWith(VertxCoreRecorder.java:582)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2513)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1538)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.hibernate.exception.JDBCConnectionException: Unable to acquire JDBC Connection [ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/] [n/a]
	at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:98)
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:51)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:150)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:177)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:152)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.lambda$list$0(JdbcSelectExecutorStandardImpl.java:102)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:226)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:163)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.advanceNext(JdbcValuesResultSetImpl.java:254)
	at org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl.processNext(JdbcValuesResultSetImpl.java:134)
	at org.hibernate.sql.results.jdbc.internal.AbstractJdbcValues.next(AbstractJdbcValues.java:19)
	at org.hibernate.sql.results.internal.RowProcessingStateStandardImpl.next(RowProcessingStateStandardImpl.java:66)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:198)
	at org.hibernate.sql.results.spi.ListResultsConsumer.consume(ListResultsConsumer.java:33)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:361)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:168)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.list(JdbcSelectExecutorStandardImpl.java:93)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:31)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.lambda$new$0(ConcreteSqmSelectQueryPlan.java:110)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.withCacheableSqmInterpretation(ConcreteSqmSelectQueryPlan.java:303)
	at org.hibernate.query.sqm.internal.ConcreteSqmSelectQueryPlan.performList(ConcreteSqmSelectQueryPlan.java:244)
	at org.hibernate.query.sqm.internal.QuerySqmImpl.doList(QuerySqmImpl.java:518)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:367)
	at org.hibernate.query.Query.getResultList(Query.java:119)
	at io.quarkus.hibernate.orm.panache.common.runtime.CommonPanacheQueryImpl.list(CommonPanacheQueryImpl.java:280)
	at io.quarkus.hibernate.orm.panache.runtime.PanacheQueryImpl.list(PanacheQueryImpl.java:149)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:24)
	at io.quarkus.hibernate.orm.panache.runtime.JpaOperations.list(JpaOperations.java:10)
	at io.quarkus.hibernate.orm.panache.common.runtime.AbstractJpaOperations.listAll(AbstractJpaOperations.java:305)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository.listAll(TipoSituacaoAtesteRepository.java)
	at br.gov.caixa.sistemas.silic.respository.TipoSituacaoAtesteRepository_ClientProxy.listAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService.findAll(TipoSituacaoAtesteService.java:19)
	at br.gov.caixa.sistemas.silic.service.TipoSituacaoAtesteService_ClientProxy.findAll(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource.findAll(TipoSituacaoAtesteResource.java:30)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll$$superforward(Unknown Source)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass$$function$$1.apply(Unknown Source)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:73)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext$NextAroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:97)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor.restMethodInvoke(QuarkusRestPathTemplateInterceptor.java:39)
	at io.quarkus.resteasy.runtime.QuarkusRestPathTemplateInterceptor_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:70)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:62)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:136)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.invokeInOurTx(TransactionalInterceptorBase.java:107)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.doIntercept(TransactionalInterceptorRequired.java:38)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorBase.intercept(TransactionalInterceptorBase.java:61)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired.intercept(TransactionalInterceptorRequired.java:32)
	at io.quarkus.narayana.jta.runtime.interceptor.TransactionalInterceptorRequired_Bean.intercept(Unknown Source)
	at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:42)
	at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:30)
	at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:27)
	at br.gov.caixa.sistemas.silic.resources.TipoSituacaoAtesteResource_Subclass.findAll(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:154)
	at org.jboss.resteasy.core.MethodInjectorImpl.invoke(MethodInjectorImpl.java:118)
	at org.jboss.resteasy.core.ResourceMethodInvoker.internalInvokeOnTarget(ResourceMethodInvoker.java:560)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTargetAfterFilter(ResourceMethodInvoker.java:452)
	at org.jboss.resteasy.core.ResourceMethodInvoker.lambda$invokeOnTarget$2(ResourceMethodInvoker.java:413)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:321)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invokeOnTarget(ResourceMethodInvoker.java:415)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:378)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:356)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:70)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:429)
	... 15 more
Caused by: java.sql.SQLRecoverableException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.jdbc.driver.T4CConnection.handleLogonNetException(T4CConnection.java:1398)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:991)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:651)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:226)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:536)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:517)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1126)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	... 1 more
Caused by: oracle.net.ns.NetException: ORA-12514: Cannot connect to database. Service orad02ng is not registered with the listener at host cnpexdadvm01-scan4.extra.caixa.gov.br port 1521. (CONNECTION_ID=dFErt97+S0+HMh61LN3D4Q==)
https://docs.oracle.com/error-help/db/ora-12514/
	at oracle.net.ns.NSProtocolNIO.createRefusePacketException(NSProtocolNIO.java:919)
	at oracle.net.ns.NSProtocolNIO.handleConnectPacketResponse(NSProtocolNIO.java:460)
	at oracle.net.ns.NSProtocolNIO.negotiateConnection(NSProtocolNIO.java:268)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:331)
	at oracle.jdbc.driver.T4CConnection.connectNetworkSessionProtocol(T4CConnection.java:3185)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:926)
	... 12 more

