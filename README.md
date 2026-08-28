Deixar em mode "debug" o log de jboss do servidor do projeto sicmu-intranet-update (DES), caddeapllx2484.agil.nprd.caixa.gov.br, para que possamos avaliar a execução da parte do módulo Jconnector.

Grato.


Jesse Mouta Pereira Batista
Jorge Milis de Almeida Junior
Bom dia, colegas CESTI,
Vocês conseguem identificar a transação correspondente ao trecho: "GlobalTransaction id =802"?      ....parece que é nela que está ocorrendo o Lock
 
 
Jesse Mouta Pereira Batista
Jorge Milis de Almeida Junior
Bom dia!
Podemos combinar deixar o servidor em modo debug, somente hoje até as 17hs, para conseguirmos averiguar se já superamos a chamada que depende do usuário JDIRSGRD  e podermos ver no log a execução do Jconnector ?
 
Marcelo Lucindo de Souza, bom dia, abre uma req, para que possamos fazer a avaliação. 
 
estou abrindo
 
Só uma pergunta, Jesse Mouta Pereira Batista
 
Essa msg abaixo, que sai no finalzinho da task de resumo da release... podemos desconsiderar??
 
 
Marcelo Lucindo de Souza
Só uma pergunta, Jesse Mouta Pereira Batista   Essa msg abaixo, que sai no finalzinho da task de resumo da release... podemos desconsiderar??   📷
pode ser algum problema com a API do infraFacil estão aparecendo em todas as releases? 
 
Jesse Mouta Pereira Batista
pode ser algum problema com a API do infraFacil estão aparecendo em todas as releases?
vou verificar
 
Jesse Mouta Pereira Batista
Marcelo Lucindo de Souza, bom dia, abre uma req, para que possamos fazer a avaliação.
REQ000145595581 aberta 
 
Jesse Mouta Pereira Batista
pode ser algum problema com a API do infraFacil estão aparecendo em todas as releases?
Sim, essa msg de ero de atualização da URL no infrafácil aparece em todas as releases dessa pipeline
 
Jesse Mouta Pereira Batista
Quando conseguir setar o log para modo debug, gentileza me avise aqui
 
beleza te aviso sim
 
Marcelo Lucindo de Souza adicionou Guilherme Carvalho Moreira ao chat e compartilhou todo o histórico de chats.

 
Marcelo Lucindo de Souza
Jesse Mouta Pereira Batista Jorge Milis de Almeida Junior Bom dia, colegas CESTI, Vocês conseguem identificar a transação correspondente ao trecho: "GlobalTransaction id =802"?      ....parece que é…
 
Erik Ferreira Nunes
Está dependendo dessa resposta para continuar análise do erro??
 
Jesse Mouta Pereira Batista
Consegue entrar em sala com o Erik Ferreira Nunes para tentarem entender o que significa esse erro?....
 
GetKeyValueCommand on Cache 'SICMU-ear.ear.SICMU-web.war', writing keys []: org.infinispan.util.concurrent.TimeoutException: ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey(QWAkLfkOwyQIf6QECK1uvackxwBN0z_cMD4Cm8YQ) and requestor GlobalTransaction{id=845, addr=local, remote=false, xid=null, internalId=-1}. Lock is held by GlobalTransaction{id=802, addr=local, remote=false, xid=null, internalId=-1}
        at org.infinispan.util.concurrent.locks.impl.DefaultLockManager$KeyAwareExtendedLockPromise.get(DefaultLockManager.java:292)
        at org.infinispan.util.concurrent.locks.impl.DefaultLockManager$KeyAwareExtendedLockPromise.get(DefaultLockManager.java:222)
        at org.infinispan.util.concurrent.locks.impl.InfinispanLock$LockPlaceHolder.checkState(InfinispanLock.java:440)
        at org.infinispan.util.concurrent.locks.impl.InfinispanLock$LockPlaceHolder.lambda$toInvocationStage$3(InfinispanLock.java:416)
        at java.util.concurrent.CompletableFuture.uniApply(CompletableFuture.java:616)
        at java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:591)
        at java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:456)
        at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
        at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        at org.jboss.as.clustering.context.ContextReferenceExecutor.execute(ContextReferenceExecutor.java:49)
        at org.jboss.as.clustering.context.ContextualExecutor$1.run(ContextualExecutor.java:70)
        at java.lang.Thread.run(Thread.java:748)
 
2026-08-27 16:00:09,080 ERROR [io.undertow.servlet.request] (default task-58) UT015005: Error invoking method requestDestroyed on listener class com.sun.faces.config.ConfigureListener: java.lang.UnsupportedOperationException
        at javax.faces.context.FacesContext.getExceptionHandler(FacesContext.java:280)
        at javax.faces.event.ExceptionQueuedEventContext.getListenersForEventClass(ExceptionQueuedEventContext.java:248)
        at com.sun.faces.application.applicationimpl.Events.invokeComponentListenersFor(Events.java:181)
        at com.sun.faces.application.applicationimpl.Events.publishEvent(Events.java:106)
        at com.sun.faces.application.ApplicationImpl.publishEvent(ApplicationImpl.java:127)
 
Marcelo Lucindo de Souza
preciso de apoio para conseguir identificar qual é essa transação que está em lock. 



-sh-4.2$ ps -ef | grep jboss
p585600   7486  7425  0 14:00 pts/0    00:00:00 grep --color=auto jboss
root     11571     1  0 Ago26 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss-eap/bin/standalone.sh                -b 0.0.0.0                -bmanagement 0.0.0.0                -Djboss.server.base.dir=/opt/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    11574 11571  0 Ago26 ?        00:00:00 /bin/sh /opt/jboss-eap/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
jboss    11710 11574  0 Ago26 ?        00:10:31 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=256m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/wildfly/common/main/wildfly-common-1.5.4.Final-redhat-00001.jar -Xbootclasspath/a:/opt/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.1.18.Final-redhat-00001.jar -Dsun.util.logging.disableCallerCheck=true -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log -Dlogging.configuration=file:/opt/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss-eap/jboss-modules.jar -mp /opt/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss-eap -Djboss.server.base.dir=/opt/jboss-eap/standalone -b 0.0.0.0 -bmanagement 0.0.0.0 -Djboss.server.base.dir=/opt/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sicmu-intranet-update -c standalone-full-ha.xml
p585600  15335     1  0 Ago26 ?        00:00:00 tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
p585600  15464     1  0 Ago26 ?        00:00:00 tail -f /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
-sh-4.2$




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
Search


Caixa

Overview

Boards

Repos

Pipelines
Pipelines
Environments
Releases
Library
Task groups
Deployment groups
Portal Infra

Test Plans

Artifacts
Project settings
All pipelines

SICMU

SICMU-intranet-update
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
ANSIBLE_JBOSS_VM_VERSION_3 (11)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
Compartilhamentos (4)
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
SICMU-INTRANET-UPDATE-DES (38)
Grupo de variáveis de SICMU-INTRANET-UPDATE-DES

Scopes: EC DES
CICSCMU_PASS
********
CICSCMU_PROGRAM
PSCPSDI3
CICSCMU_USR
SCMUDR01
CICSISO_PASS
********
CICSISO_PROGRAM
PSCPSDI1
CICSISO_USR
JDIRCICD
CICSSEM_PASS
********
CICSSEM_PROGRAM
PSCPSDI3
CICSSEM_USR
JDIRCICD
CICSSGR_PASS
********
CICSSGR_PROGRAM
PSCPSDI1
CICSSGR_USR
JDIRCICD
CICS_PORT
7000
CMU_INTRA_URL_DES
https://sicmu-intranet-update.esteiras.des.caixa
CONNECTOR
/opt/jboss-eap/standalone/configuration/sicmu_jconnector.properties
CURRENT_SCHEMA
DESCMU
DB2_CMU_PWD
********
DB2_CMU_URL
jdbc:db2://10.216.80.110:448/RJKDB2DSD0
DB2_CMU_USR
SCMUDR01
DB2_RJP4_URL
jdbc:db2://10.216.80.110:448/RJKDB2DSD0
INIT
Criado via api
JCICSDIRECT
10.216.80.110
JVM_HEAP_MAX
2048m
JVM_HEAP_MIN
1024m
JVM_METASPACE_MAX
512m
JVM_METASPACE_MIN
256m
KEYSTORE_PASSWORD
password
KEY_PASSWORD
password
MQ_HOSTNAME
10.216.80.110
PASSWORD_TRUSTSTORE
changeit
QUEUE_MANAGER
RJD1
QUEUE_PORT
1414
SGR_INTER_URL
https://servicossociais.des.corerj.caixa/internet.do?segmento=CONVENIADO01&credencial=CPF
SGR_INTRA_URL
https://servicossociais.des.corerj.caixa/intranet.do?segmento=INTRANET01
TGSGRS_PASS
********
TGSGRS_PROGRAM
PSCPSDI3
TGSGRS_USR
JDIRSGRD
URL_APM_SERVER
https://apm-server-devops.apps.produtos4.caixa/
sample-java-des (13)
WO0000081293906 - SISME
Scopes: EC DES,EC TQS
SICMU-INTRANET-UPDATE-TQS (36)
Grupo de variáveis de SICMU-INTRANET-UPDATE-TQS
Scopes: EC TQS
SICMU-INTRANET-UPDATE-HMP (1)
Grupo de variáveis de SICMU-INTRANET-UPDATE-HMP
Scopes: EC HMP
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (17)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
SICMU-INTRANET-UPDATE-PRD (1)
Grupo de variáveis de SICMU-INTRANET-UPDATE-PRD
Scopes: EC PRD CTC,EC PRD DTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
Expanded

Collapsed

Expanded

Collapsed

8 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Row 5

Showing filters 1 through 2





 
