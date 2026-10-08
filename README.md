Verificar informações 



Boa dia, em uma REC criada ontem de manha (REQ000146465405), foi solicitado a inserção de duas libraries (SIACC-BT-VAULT-SECRET-TQS e SIACC-PIXAUTOMATICO-BT-VAULT-TQS) em variable groups de TQS de um conjunto de projeto do Pix automatico e a criação de uma task do Beyond Trust na release de TQS desses projetos. 

A inserção e a criação de fato ocorreram, no entanto, ao realizar a release de alguns desses projetos, no caso, SIACC-pixautomatico-api-controle-requisicoes, SIACC-pixautomatico-api-simulador e SIACC-pixautomatico-auditoria, obtivemos um erro na etapa "Create Secret Check Script", conforme o print em anexo. 

O que é estranho pois ja tinhamos feito o mesmo processo em um projeto anterior (SIACC-pixautomatico-api-webhook) e funcionou corretamente. Tanto a library quanto a task estao la. 

Foi criada uma outra REC para corrigir o mesmo problema so que no api-convenio (REQ000146496677). Mas agora também foi detectado o mesmo problema para esses outros projetos. Os projetos em questao juntamente com as tag que foi tentanda a realease TQS sao:

SIACC-pixautomatico-api-controle-requisicoes  -> TAG 1.1.0.4
SIACC-pixautomatico-api-simulador  -> TAG 1.3.2.2
SIACC-pixautomatico-auditoria  -> TAG 1.0.0.2


SIACC-pixautomatico-api-controle-requisicoes - OK 
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=538116&environmentId=2500377
 
SIACC-pixautomatico-api-simulador - Erro 
 
SIACC-pixautomatico-auditoria
SIACC-pixautomatico-auditoria - SIACC-pixautomatico-auditoria-1.0.1.0(7) - Pipelines - OK


 outra analista ja resolveu esse outros falta agora so esse



 2026-10-08T15:32:54.1138797Z ##[section]Starting: Logs da Aplicação
2026-10-08T15:32:54.1142267Z ==============================================================================
2026-10-08T15:32:54.1142362Z Task         : Bash
2026-10-08T15:32:54.1142409Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-08T15:32:54.1142484Z Version      : 3.227.0
2026-10-08T15:32:54.1142530Z Author       : Microsoft Corporation
2026-10-08T15:32:54.1142585Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-08T15:32:54.1142671Z ==============================================================================
2026-10-08T15:32:55.1195783Z Generating script.
2026-10-08T15:32:55.1205972Z ========================== Starting Command Output ===========================
2026-10-08T15:32:55.1213026Z [command]/bin/bash /opt/ads-agent/_work/_temp/e1d7d43b-2ab2-4119-aa3a-123f60ab8d8b.sh
2026-10-08T15:32:55.1261395Z + shopt -s expand_aliases
2026-10-08T15:32:55.1261556Z + [[ -n okd4_nprd ]]
2026-10-08T15:32:55.1261708Z + [[ okd4_nprd =~ ocp ]]
2026-10-08T15:32:55.1264284Z + [[ -n okd4_nprd ]]
2026-10-08T15:32:55.1264444Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-10-08T15:32:55.1264626Z + app=siacc-pixautomatico-api-simulador-tqs
2026-10-08T15:32:55.1264747Z + oc version
2026-10-08T15:32:55.2575435Z oc v3.11.0+0cbc58b
2026-10-08T15:32:55.2575670Z kubernetes v1.11.0+d4cacc0
2026-10-08T15:32:55.2575959Z features: Basic-Auth GSSAPI Kerberos SPNEGO
2026-10-08T15:32:55.2672192Z 
2026-10-08T15:32:55.2695191Z Server https://api.nprd.caixa:6443
2026-10-08T15:32:55.2695466Z kubernetes v1.25.0-2824+27e744f55d2e99-dirty
2026-10-08T15:32:55.2710645Z ++ oc get pod -l name=siacc-pixautomatico-api-simulador-tqs -n siacc-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-10-08T15:32:55.2711053Z ++ tac
2026-10-08T15:32:55.2711263Z ++ grep -v '^$'
2026-10-08T15:32:55.2711412Z ++ head -n1
2026-10-08T15:32:55.4984398Z + last_pod=siacc-pixautomatico-api-simulador-tqs-65-wp4mw
2026-10-08T15:32:55.4984713Z + echo 'Logs do POD: siacc-pixautomatico-api-simulador-tqs-65-wp4mw'
2026-10-08T15:32:55.4984963Z + oc logs siacc-pixautomatico-api-simulador-tqs-65-wp4mw -c siacc-pixautomatico-api-simulador-tqs -n siacc-tqs
2026-10-08T15:32:55.4985204Z Logs do POD: siacc-pixautomatico-api-simulador-tqs-65-wp4mw
2026-10-08T15:32:55.7689776Z exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
2026-10-08T15:32:55.7690351Z OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-08T15:32:55.7690608Z 2026-10-08 12:31:10.284-03:00 ERROR c.m.applicationinsights.agent - 
2026-10-08T15:32:55.7690753Z *************************
2026-10-08T15:32:55.7690895Z Application Insights Java Agent 3.7.3 startup failed (PID 8)
2026-10-08T15:32:55.7691023Z *************************
2026-10-08T15:32:55.7691069Z 
2026-10-08T15:32:55.7691164Z Description:
2026-10-08T15:32:55.7691274Z No connection string provided
2026-10-08T15:32:55.7691320Z 
2026-10-08T15:32:55.7691409Z Action:
2026-10-08T15:32:55.7691541Z Please provide connection string: https://go.microsoft.com/fwlink/?linkid=2153358
2026-10-08T15:32:55.7691612Z 
2026-10-08T15:32:55.7691715Z __  ____  __  _____   ___  __ ____  ______ 
2026-10-08T15:32:55.7691876Z  --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
2026-10-08T15:32:55.7692016Z  -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
2026-10-08T15:32:55.7692171Z --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2026-10-08T15:32:55.7692533Z 12:31:11 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-internet".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-08T15:32:55.7693403Z 12:31:11 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-intranet-web".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-08T15:32:55.7693870Z 12:31:11 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-intranet-servico".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-08T15:32:55.7694301Z 12:31:11 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.log.category.min-level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-08T15:32:55.7694732Z 12:31:11 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.log.category.level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
2026-10-08T15:32:55.7695107Z 12:31:14 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] LaunchMode NORMAL
2026-10-08T15:32:55.7695364Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES INTERNAS REFERENCIADAS -----
2026-10-08T15:32:55.7695645Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 1 - quarkus.application.name = "SIACC-pixautomatico-api-simulador"
2026-10-08T15:32:55.7695929Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 2 - quarkus.application.version = "1.0.0-SNAPSHOT"
2026-10-08T15:32:55.7696189Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 3 - APPLICATION.ID = "[NAO INFORMADO]"
2026-10-08T15:32:55.7696379Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7696651Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURA�?�?ES API-SIMULADOR -----
2026-10-08T15:32:55.7696955Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 4 - mp.openapi.extensions.smallrye.info.title = "SIACC PIX AUTOM�TICO- API Simulador"
2026-10-08T15:32:55.7697274Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 5 - SIACC.APPLICATION.ID = "siacc-pixautomatico:simulador"
2026-10-08T15:32:55.7697547Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 6 - SIACC.ID.TIPO-SERVICO.PIXAUTOMATICO = "1"
2026-10-08T15:32:55.7697810Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 7 - SIACC.ID.TIPO-SITUACAO.INCLUIDO = "1"
2026-10-08T15:32:55.7698069Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 8 - SIACC.ID.TIPO-SITUACAO.APROVADO = "4"
2026-10-08T15:32:55.7698425Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 9 - SIACC.ID.TIPO-SITUACAO.CANCELADA = "6"
2026-10-08T15:32:55.7698685Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 10 - SIACC.ID.TIPO-SITUACAO.PENDENTE = "2"
2026-10-08T15:32:55.7698948Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 11 - SIACC.ID.TIPO-SITUACAO.PREVISTA = "10"
2026-10-08T15:32:55.7699202Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 12 - SIACC.ID.ALCADA.AGENCIA = "1"
2026-10-08T15:32:55.7699445Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 13 - SIACC.ID.ALCADA.SEV = "2"
2026-10-08T15:32:55.7699676Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 14 - SIACC.ID.ALCADA.SR = "3"
2026-10-08T15:32:55.7699916Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 15 - SIACC.ID.ALCADA.MATRIZ = "4"
2026-10-08T15:32:55.7700157Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 16 - SIACC.ID.ALCADA.CLIENTE = "5"
2026-10-08T15:32:55.7700410Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 17 - SIACC.UNIDADE-SIICO.SIGLA.AGENCIA = "AG"
2026-10-08T15:32:55.7700671Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 18 - SIACC.UNIDADE-SIICO.SIGLA.SEV = "SEV"
2026-10-08T15:32:55.7700926Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 19 - SIACC.UNIDADE-SIICO.SIGLA.SR = "SR"
2026-10-08T15:32:55.7701176Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 20 - SIACC.UNIDADE-SIICO.SIGLA.MATRIZ = "MATRIZ"
2026-10-08T15:32:55.7701555Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 21 - SIACC.REPOSITORIO.DOCUMENTOS.PATH = "/siacc-pagamentos-recebimentos/PIXAUTOMATICO"
2026-10-08T15:32:55.7701772Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7702003Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURAÇÕES DAS APIS
2026-10-08T15:32:55.7702186Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7702443Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ####API BUSCA CONTAS NO SICLI: ####################################
2026-10-08T15:32:55.7702811Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 22 - cadastro-api.url = "http://api.des.caixa:8080/cadastro/v2"
2026-10-08T15:32:55.7703250Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 23 - cadastro-api.key = "l73d2c2aebb40d479083fa48d018530d92"
2026-10-08T15:32:55.7703548Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 24 - quarkus.rest-client.cadastro-api.url = "${cadastro-api.url}" (22)
2026-10-08T15:32:55.7703845Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 25 - quarkus.rest-client.cadastro-api.scope = "javax.inject.Singleton"
2026-10-08T15:32:55.7704116Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 26 - apim.config.apikey = "${cadastro-api.key}" (23)
2026-10-08T15:32:55.7704306Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7704551Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ################################################################
2026-10-08T15:32:55.7704726Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7704963Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURA��O DO LOG - REMOVER LOG HEALTH CHECK ##
2026-10-08T15:32:55.7705252Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 27 - quarkus.log.category."org.eclipse.microprofile.health".level = "ERROR"
2026-10-08T15:32:55.7705551Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 28 - quarkus.log.category."io.quarkus.smallrye.health".level = "ERROR"
2026-10-08T15:32:55.7705881Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 29 - quarkus.log.category."org.jboss.resteasy.reactive.server.handlers.RequestHandler".level = "WARN"
2026-10-08T15:32:55.7706201Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 30 - quarkus.log.category."io.vertx.core.http.impl.HttpServerRequestImpl".level = "WARN"
2026-10-08T15:32:55.7706407Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7706605Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ####
2026-10-08T15:32:55.7706828Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 31 - SIACC.LOG.LEVEL = "DEBUG"
2026-10-08T15:32:55.7707112Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 32 - quarkus.log.category."br.gov.caixa".level = "${SIACC.LOG.LEVEL}" (31,108)
2026-10-08T15:32:55.7707472Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 33 - quarkus.rest-client.siico-info-privadas.url = "https://api.des.caixa:8443/informacoes-corporativas-privadas"
2026-10-08T15:32:55.7707856Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 34 - quarkus.rest-client.siico-info-publicas.url = "https://api.des.caixa:8443/informacoes-corporativas-publicas"
2026-10-08T15:32:55.7708164Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 35 - SIACC.AUDITORIA.FUNCIONALIDADE = "SIMULADOR-CONVENIO"
2026-10-08T15:32:55.7708357Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7708563Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] DEV LOCAL
2026-10-08T15:32:55.7708813Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 36 - SIACC.CLIENT.IDS.CANAIS = "cli-ser-nbc,cli-ser-gcx"
2026-10-08T15:32:55.7709007Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7709318Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ## RATE LIMITER
2026-10-08T15:32:55.7709561Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 37 - SIACC.RATE.LIMITER.ENABLED = "true"
2026-10-08T15:32:55.7709828Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 38 - SIACC.RATE.LIMITER.QTDE.REQ.PERMITIDAS = "60"
2026-10-08T15:32:55.7710087Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 39 - SIACC.RATE.LIMITER.PERIODICIDADE = "1M"
2026-10-08T15:32:55.7710373Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 40 - quarkus.rate-limiter.enabled = "${SIACC.RATE.LIMITER.ENABLED}" (37)
2026-10-08T15:32:55.7710724Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 41 - quarkus.rate-limiter.buckets."group1".limits[0].permitted-uses = "${SIACC.RATE.LIMITER.QTDE.REQ.PERMITIDAS}" (38)
2026-10-08T15:32:55.7711141Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 42 - quarkus.rate-limiter.buckets."group1".limits[0].period = "${SIACC.RATE.LIMITER.PERIODICIDADE}" (39)
2026-10-08T15:32:55.7711505Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 43 - quarkus.rate-limiter.buckets."group1".identity-resolver = "br.gov.caixa.siacc.pix.manager.UserIdentityResolver"
2026-10-08T15:32:55.7711720Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7711920Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ##
2026-10-08T15:32:55.7712094Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7712324Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES API-SUPORTE -----
2026-10-08T15:32:55.7712586Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 44 - app.name = "${quarkus.application.name}" (1)
2026-10-08T15:32:55.7712925Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 45 - app.version = "${quarkus.application.version}" (2)
2026-10-08T15:32:55.7713164Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 46 - app.env = "TQS"
2026-10-08T15:32:55.7713396Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 47 - app.swagger = "true"
2026-10-08T15:32:55.7713638Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 48 - app.swagger.admin = "true"
2026-10-08T15:32:55.7713920Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 49 - SIACC.APPLICATION.ID = "siacc-pixautomatico:simulador"
2026-10-08T15:32:55.7714130Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7714349Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE API
2026-10-08T15:32:55.7714612Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 50 - apim.config.apikey = "l73d2c2aebb40d479083fa48d018530d92"
2026-10-08T15:32:55.7714866Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 51 - client.timeout = "5000"
2026-10-08T15:32:55.7715164Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 52 - SIACC.FRONTEND.SERVICOS.URL = "https://siacc-servicos-frontend-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7715500Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 53 - SIACC.FRONTEND.PIXAUTOMATICO.URL = "https://siacc-pixautomatico-frontend-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7715851Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 54 - SIACC.FRONTEND.CENTRALIZADOR.URL = "https://siacc-servicos-frontend-centralizador-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7716194Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 55 - SIACC.API.CENTRALIZADOR.URL = "https://siacc-servicos-api-centralizador-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7716527Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 56 - SIACC.API.AUDITORIA.URL = "https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7716861Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 57 - SIACC.API.CONVENIO.URL = "https://siacc-pixautomatico-api-convenio-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7717189Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 58 - SIACC.API.SIMULADOR.URL = "https://siacc-pixautomatico-api-simulador-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7717577Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 59 - SIACC.API.PARAMETROS.URL = "https://siacc-pixautomatico-api-parametro-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7717939Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 60 - SIACC.API.CONTROLE.REQUISICOES.URL = "https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7718278Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 61 - SIACC.API.WEBHOOK.URL = "https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7718610Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 62 - SIACC.API.PAGAMENTO.URL = "https://siacc-pixautomatico-api-pagamento-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7718994Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 63 - SIACC.API.BATIMENTO.URL = "https://siacc-pixautomatico-api-batimento-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7719348Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 64 - SIACC.API.GERENCIADOR.ARQUIVOS.URL = "https://siacc-servicos-api-gerenciador-arquivos-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7719693Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 65 - SIACC.BATCH.AUDITORIA.URL = "https://siacc-pixautomatico-batch-auditoria-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7720027Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 66 - SIACC.BATCH.MANUTENCAO.URL = "https://siacc-pixautomatico-batch-manutencao-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7720353Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 67 - SIACC.BATCH.REPASSE.URL = "https://siacc-pixautomatico-batch-repasse-tqs.apps.nprd.caixa"
2026-10-08T15:32:55.7720615Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 68 - quarkus.tls.trust-all = "true"
2026-10-08T15:32:55.7720904Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 69 - quarkus.rest-client.siacc-auditoria.url = "${SIACC.API.AUDITORIA.URL}" (56)
2026-10-08T15:32:55.7721214Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 70 - quarkus.rest-client.siacc-convenio.url = "${SIACC.API.CONVENIO.URL}" (57)
2026-10-08T15:32:55.7721525Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 71 - quarkus.rest-client.siacc-simulador.url = "${SIACC.API.SIMULADOR.URL}" (58)
2026-10-08T15:32:55.7721834Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 72 - quarkus.rest-client.siacc-parametros.url = "${SIACC.API.PARAMETROS.URL}" (59)
2026-10-08T15:32:55.7722150Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 73 - quarkus.rest-client.siacc-centralizador.url = "${SIACC.API.CENTRALIZADOR.URL}" (55)
2026-10-08T15:32:55.7722489Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 74 - quarkus.rest-client.siacc-gerenciador-arquivos.url = "${SIACC.API.GERENCIADOR.ARQUIVOS.URL}" (64)
2026-10-08T15:32:55.7722875Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 75 - quarkus.rest-client.siacc-tarifas.url = "${SIACC.BATCH.REPASSE.URL}" (67)
2026-10-08T15:32:55.7723175Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 76 - quarkus.rest-client.connect-timeout = "${client.timeout}" (51)
2026-10-08T15:32:55.7723464Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 77 - quarkus.rest-client.read-timeout = "${client.timeout}" (51)
2026-10-08T15:32:55.7723665Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7723882Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES JWT
2026-10-08T15:32:55.7724152Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 78 - SIACC.LOGIN-CLIENT.URL = "${SIACC.SSO.INTRANET.URL}" (82)
2026-10-08T15:32:55.7724570Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 79 - SIACC.SSO.INTERNET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44R... 4zBwIDAQAB" [-1986508888]
2026-10-08T15:32:55.7724996Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 80 - SIACC.SSO.INTERNET.URL = "https://logindes.caixa.gov.br/auth/realms/internet"
2026-10-08T15:32:55.7725427Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 81 - SIACC.SSO.INTRANET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe... FDYwIDAQAB" [-234932412]
2026-10-08T15:32:55.7725772Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 82 - SIACC.SSO.INTRANET.URL = "https://login.des.caixa/auth/realms/intranet"
2026-10-08T15:32:55.7726081Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 83 - quarkus.oidc."servico-internet".url = "${SIACC.SSO.INTERNET.URL}" (80)
2026-10-08T15:32:55.7726453Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 84 - quarkus.oidc."servico-internet".public-key = "${SIACC.SSO.INTERNET.PUBLIC-KEY}" (79)
2026-10-08T15:32:55.7726771Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 85 - quarkus.oidc."servico-intranet-web".url = "${SIACC.SSO.INTRANET.URL}" (82)
2026-10-08T15:32:55.7727137Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 86 - quarkus.oidc."servico-intranet-web".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (81)
2026-10-08T15:32:55.7727470Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 87 - quarkus.oidc."servico-intranet-servico".url = "${SIACC.SSO.INTRANET.URL}" (82)
2026-10-08T15:32:55.7727796Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 88 - quarkus.oidc."servico-intranet-servico".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (81)
2026-10-08T15:32:55.7728008Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7728221Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE CACHE
2026-10-08T15:32:55.7728496Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 89 - quarkus.cache.caffeine."cacheService".initial-capacity = "50"
2026-10-08T15:32:55.7728789Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 90 - quarkus.cache.caffeine."cacheService".maximum-size = "500"
2026-10-08T15:32:55.7729077Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 91 - quarkus.cache.caffeine."cacheService".expire-after-write = "8H"
2026-10-08T15:32:55.7729380Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 92 - quarkus.cache.caffeine."cacheService".expire-after-access = "8H"
2026-10-08T15:32:55.7729589Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7729814Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE SEGURANCA DO CLIENTE
2026-10-08T15:32:55.7729986Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7730213Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE SEGURANCA DO CLIENTE
2026-10-08T15:32:55.7730512Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 93 - quarkus.oidc-client.auth-server-url = "https://login.des.caixa/auth/realms/intranet"
2026-10-08T15:32:55.7730800Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 94 - quarkus.oidc-client.client-id = "cli-ser-acc-pxa"
2026-10-08T15:32:55.7731161Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 95 - quarkus.oidc-client.credentials.secret = "[hash:4eba39da681cee1ddb62d761588688cbca1df7d9a12939befe28fcbf702393a1]"
2026-10-08T15:32:55.7731401Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7731637Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE SEGURANCA ADMINISTRATIVA
2026-10-08T15:32:55.7731891Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 96 - SIACC.ADMIN.ROLES = "SPI_PAGAMENTOS,ACC_ADMIN"
2026-10-08T15:32:55.7732142Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 97 - SIACC.ADMIN.PATH = "/admin/*"
2026-10-08T15:32:55.7732443Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 98 - quarkus.http.auth.policy.role-admin.roles-allowed = "${SIACC.ADMIN.ROLES}" (96)
2026-10-08T15:32:55.7732887Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 99 - quarkus.http.auth.permission.administration.paths = "${SIACC.ADMIN.PATH}" (97)
2026-10-08T15:32:55.7733207Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 100 - quarkus.http.auth.permission.administration.policy = "role-admin"
2026-10-08T15:32:55.7733526Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 101 - quarkus.http.auth.permission.permit1.paths = "/admin/swagger,/admin/authorization"
2026-10-08T15:32:55.7733824Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 102 - quarkus.http.auth.permission.permit1.policy = "permit"
2026-10-08T15:32:55.7734011Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7734369Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE LOG
2026-10-08T15:32:55.7734662Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 103 - quarkus.log.console.format = "%d{HH:mm:ss} %-5p[%c{2.}-%t{id}] %s%e%n"
2026-10-08T15:32:55.7734986Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 104 - quarkus.log.category."org.jboss.resteasy.reactive.client".level = "ERROR"
2026-10-08T15:32:55.7735245Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 105 - SIACC.GENERAL.LOG.LEVEL = "DEBUG"
2026-10-08T15:32:55.7735525Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 106 - quarkus.log.category.level = "${SIACC.GENERAL.LOG.LEVEL}" (105)
2026-10-08T15:32:55.7735822Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 107 - quarkus.log.category.min-level = "${SIACC.GENERAL.LOG.LEVEL}" (105)
2026-10-08T15:32:55.7736078Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 108 - SIACC.LOG.LEVEL = "DEBUG"
2026-10-08T15:32:55.7736364Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 109 - quarkus.log.category."br.gov.caixa".level = "${SIACC.LOG.LEVEL}" (31,108)
2026-10-08T15:32:55.7736676Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 110 - quarkus.log.category."br.gov.caixa".min-level = "${SIACC.LOG.LEVEL}" (31,108)
2026-10-08T15:32:55.7736878Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7737089Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DA APLICACAO
2026-10-08T15:32:55.7737330Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 111 - quarkus.http.root-path = "/"
2026-10-08T15:32:55.7737566Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 112 - quarkus.http.cors = "true"
2026-10-08T15:32:55.7737812Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 113 - quarkus.http.cors.origins = "*"
2026-10-08T15:32:55.7738149Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 114 - quarkus.smallrye-health.ui.enable = "false"
2026-10-08T15:32:55.7738430Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 115 - quarkus.smallrye-health.root-path = "//healthx"
2026-10-08T15:32:55.7738693Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 116 - quarkus.health.extensions.enabled = "false"
2026-10-08T15:32:55.7738947Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 117 - quarkus.http.ssl.protocols = "TLSv1.2"
2026-10-08T15:32:55.7739208Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 118 - properties.hash.seed = "167243864789133"
2026-10-08T15:32:55.7739478Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 119 - SIACC.PROPERTIES.FILE = "application.properties"
2026-10-08T15:32:55.7739747Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 120 - SIACC.PROPERTIES.SOURCE = "target/classes/"
2026-10-08T15:32:55.7740002Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 121 - SIACC.PROPERTIES.MAXLENGTH = "160"
2026-10-08T15:32:55.7740255Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 122 - SIACC.PROPERTIES.SHOWCOMPACT = "true"
2026-10-08T15:32:55.7740509Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 123 - SIACC.PROPERTIES.SHOWHASH = "true"
2026-10-08T15:32:55.7740815Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 124 - SIACC.PROPERTIES.SHOWORIGINAL = "true"
2026-10-08T15:32:55.7741075Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 125 - SIACC.PROPERTIES.SHOWINDEX = "true"
2026-10-08T15:32:55.7741323Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 126 - SIACC.PROPERTIES.CUTOFF = "10"
2026-10-08T15:32:55.7741576Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 127 - SIACC.PROPERTIES.PATTERN = "\$\{(.*?)\}"
2026-10-08T15:32:55.7741854Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 128 - SIACC.AUDITORIA.FUNCIONALIDADE = "SIMULADOR-CONVENIO"
2026-10-08T15:32:55.7742161Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 129 - SIACC.SWAGGER.PROXY.URL = "http://localhost:8080/swagger/{tag}"
2026-10-08T15:32:55.7742464Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 130 - SIACC.TAG = "{tag}"
2026-10-08T15:32:55.7742648Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7742949Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DO SWAGGER
2026-10-08T15:32:55.7743213Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 131 - quarkus.swagger-ui.always-include = "true"
2026-10-08T15:32:55.7743487Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 132 - quarkus.smallrye-openapi.always-run-filter = "true"
2026-10-08T15:32:55.7743753Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 133 - quarkus.smallrye-openapi.path = "/swagger"
2026-10-08T15:32:55.7744013Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 134 - quarkus.swagger-ui.path = "/swagger-ui"
2026-10-08T15:32:55.7744291Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 135 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
2026-10-08T15:32:55.7744613Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 136 - mp.openapi.extensions.smallrye.info.title = "SIACC PIX AUTOM�TICO- API Simulador"
2026-10-08T15:32:55.7744925Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 137 - mp.openapi.extensions.smallrye.info.name = "${APPLICATION.ID}" (3)
2026-10-08T15:32:55.7745258Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 138 - mp.openapi.extensions.smallrye.info.description = "Servico para SIACC-pixautomatico-api-simulador"
2026-10-08T15:32:55.7745566Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 139 - mp.openapi.extensions.smallrye.info.version = "${app.version}" (45)
2026-10-08T15:32:55.7745867Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 140 - mp.openapi.filter = "br.gov.caixa.siacc.pix.suporte.helper.OpenAPIFilter"
2026-10-08T15:32:55.7746172Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 141 - mp.openapi.extensions.smallrye.info.contact.email = "suporte@caixa.gov.br"
2026-10-08T15:32:55.7746468Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 142 - mp.openapi.extensions.smallrye.info.contact.name = "Suporte"
2026-10-08T15:32:55.7746656Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7746880Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE DEPENDENCIAS
2026-10-08T15:32:55.7747137Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 143 - SIACC.DEPENDENCY.SCHEDULE = "0/10 * * ? * * *"
2026-10-08T15:32:55.7747393Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 144 - SIACC.DEPENDENCY.INITIAL-DELAY = "5000"
2026-10-08T15:32:55.7747649Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 145 - SIACC.DEPENDENCY.AUDITORIA.MONITOR = "true"
2026-10-08T15:32:55.7747906Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 146 - SIACC.DEPENDENCY.SSO.MONITOR = "false"
2026-10-08T15:32:55.7748080Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7748290Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] RESOURCES
2026-10-08T15:32:55.7748526Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 147 - SIACC.APISERVICE.AVAILABLE = "true"
2026-10-08T15:32:55.7748790Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7749014Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] MENSAGENS DE RESPOSTA PADRAO
2026-10-08T15:32:55.7749300Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 148 - SIACC.API.UNAVAILABLE.MESSAGE = "Serviço temporariamente indisponível"
2026-10-08T15:32:55.7749610Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 149 - SIACC.API.UNAVAILABLE.DESCRIPTION = "Tente novamente em alguns instantes"
2026-10-08T15:32:55.7749904Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 150 - SIACC.API.BADREQUEST.MESSAGE = "A requisição recebida não é válida"
2026-10-08T15:32:55.7750201Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 151 - SIACC.API.BADREQUEST.DESCRIPTION = "verifique e tente novamente: {}"
2026-10-08T15:32:55.7750551Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 152 - SIACC.API.UNAUTHORIZED.MESSAGE = "Acesso não autorizado"
2026-10-08T15:32:55.7750870Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 153 - SIACC.API.UNAUTHORIZED.DESCRIPTION = "Verifique suas credenciais e tente novamente"
2026-10-08T15:32:55.7751535Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 154 - SIACC.API.FORBIDDEN.MESSAGE = "Você não possui acesso a este recurso"
2026-10-08T15:32:55.7751871Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 155 - SIACC.API.FORBIDDEN.DESCRIPTION = "Verifique suas credenciais e tente novamente"
2026-10-08T15:32:55.7752171Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 156 - SIACC.API.AUTHENTICATIONFAIL.MESSAGE = "Falha de autenticação"
2026-10-08T15:32:55.7752491Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 157 - SIACC.API.AUTHENTICATIONFAIL.DESCRIPTION = "Verifique suas credenciais e tente novamente"
2026-10-08T15:32:55.7752934Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 158 - SIACC.API.INTERNALERROR.MESSAGE = "No momento não foi possível processar sua requisição"
2026-10-08T15:32:55.7753283Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 159 - SIACC.API.INTERNALERROR.DESCRIPTION = "Solicitamos que tente novamente em alguns instantes"
2026-10-08T15:32:55.7753559Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 160 - SIACC.API.EXCEPTION.LOGALL = "false"
2026-10-08T15:32:55.7753814Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 161 - SIACC.EXCEPTION.ON.RESPONSE = "false"
2026-10-08T15:32:55.7754104Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 162 - SIACC.CONFIG.PROPERTIES."APPLICATION".source = "/application.properties"
2026-10-08T15:32:55.7754424Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 163 - SIACC.CONFIG.PROPERTIES."API-SUPORTE".source = "META-INF/application.api.properties"
2026-10-08T15:32:55.7754639Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7754858Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HEALTH CUSTOM PROPERTIES
2026-10-08T15:32:55.7755085Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7755288Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] DEV LOCAL
2026-10-08T15:32:55.7755460Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7755662Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] SWAGGER / OPENAPI
2026-10-08T15:32:55.7755912Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 164 - quarkus.swagger-ui.always-include = "true"
2026-10-08T15:32:55.7756202Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 165 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
2026-10-08T15:32:55.7756473Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 166 - quarkus.smallrye-openapi.path = "/swagger"
2026-10-08T15:32:55.7756732Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 167 - quarkus.swagger-ui.path = "/swagger-ui"
2026-10-08T15:32:55.7757234Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 168 - quarkus.smallrye-openapi.info-title = "SIACC PIX AUTOM�TICO- API Simulador"
2026-10-08T15:32:55.7757551Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 169 - quarkus.smallrye-openapi.info-version = "${app.version}" (45)
2026-10-08T15:32:55.7757857Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 170 - quarkus.smallrye-openapi.info-description = "Modelo padrão de pagamento PIX Automático."
2026-10-08T15:32:55.7758169Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 171 - quarkus.smallrye-openapi.info-contact-email = "contato@caixa.gov.br"
2026-10-08T15:32:55.7758455Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 172 - quarkus.smallrye-openapi.info-contact-name = "contato"
2026-10-08T15:32:55.7758800Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 173 - quarkus.devservices.enabled = "false"
2026-10-08T15:32:55.7759089Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 174 - SIACC.API.CAIXA.URL = "https://api.des.caixa:8443"
2026-10-08T15:32:55.7759384Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 175 - SIACC.API.DES.CAIXA.URL = "${SIACC.API.CAIXA.URL}" (174)
2026-10-08T15:32:55.7759643Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 176 - SICLI.CLIENT.TIMEOUT = "10000"
2026-10-08T15:32:55.7759929Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 177 - quarkus.rest-client.sicli.url = "https://api.des.caixa:8443/cadastro"
2026-10-08T15:32:55.7760248Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 178 - quarkus.rest-client.sicli.connect-timeout = "${SICLI.CLIENT.TIMEOUT}" (176)
2026-10-08T15:32:55.7760558Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 179 - quarkus.rest-client.sicli.read-timeout = "${SICLI.CLIENT.TIMEOUT}" (176)
2026-10-08T15:32:55.7760884Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 180 - quarkus.rest-client.sicow.url = "https://api.des.caixa:8443/pesquisa-cadastral/v1"
2026-10-08T15:32:55.7761240Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 181 - quarkus.rest-client.nsgd-api.url = "https://api.des.caixa:8443/conta-deposito/consulta-conta"
2026-10-08T15:32:55.7761612Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 182 - quarkus.rest-client.siico-info-privadas.url = "https://api.des.caixa:8443/informacoes-corporativas-privadas"
2026-10-08T15:32:55.7762030Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 183 - quarkus.rest-client.dict.url = "https://api.des.caixa:8443/transacoes-financeiras/pagamentos-instantaneos/dict-estatistica/v2/estatisticas"
2026-10-08T15:32:55.7762371Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 184 - SIACC.LISTA.CODIGOS.VINCULOS.SOCIOS = "6,8,23,32,36,48,49,87"
2026-10-08T15:32:55.7762777Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 185 - SIACC.IMPEDIMENTOS.SICOW = "empregados_trabalho_escravo,informacoes_seguranca,pld,proibido_contratar_setor_publico"
2026-10-08T15:32:55.7763021Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7763232Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE PROXY
2026-10-08T15:32:55.7763475Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 186 - PROXY.HOST = "[NAO INFORMADO]"
2026-10-08T15:32:55.7763722Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 187 - PROXY.PORT = "[NAO INFORMADO]"
2026-10-08T15:32:55.7763966Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] Definicoes de variaveis para o cache
2026-10-08T15:32:55.7764218Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 188 - SIACC.CACHE.INITIAL-SIZE = "50"
2026-10-08T15:32:55.7764470Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 189 - SIACC.CACHE.MAXIMUM-SIZE = "500"
2026-10-08T15:32:55.7764720Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 190 - SIACC.CACHE.EXPIRE-AFTER-WRITE = "15m"
2026-10-08T15:32:55.7764980Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 191 - SIACC.CACHE.EXPIRE-AFTER-ACCESS = "2m"
2026-10-08T15:32:55.7765226Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7765461Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DO QUARKUS CACHE CAFFEINE
2026-10-08T15:32:55.7765764Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 192 - quarkus.cache.caffeine.initial-capacity = "${SIACC.CACHE.INITIAL-SIZE}" (188)
2026-10-08T15:32:55.7766079Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 193 - quarkus.cache.caffeine.maximum-size = "${SIACC.CACHE.MAXIMUM-SIZE}" (189)
2026-10-08T15:32:55.7766407Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 194 - quarkus.cache.caffeine.expire-after-write = "${SIACC.CACHE.EXPIRE-AFTER-WRITE}" (190)
2026-10-08T15:32:55.7766781Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 195 - quarkus.cache.caffeine.expire-after-access = "${SIACC.CACHE.EXPIRE-AFTER-ACCESS}" (191)
2026-10-08T15:32:55.7767138Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 196 - SIACC.ADMINISTRATIVE.ENDPOINT = "/health,/healthx,/health,/q/health,/admin,/admin-ui,/config,/admin,/title"
2026-10-08T15:32:55.7767509Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] Define o nivel de log para a categoria org.hibernate como ERROR, exibindo apenas mensagens de erro do Hibernate nos logs.
2026-10-08T15:32:55.7767815Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 197 - quarkus.log.category."org.hibernate".level = "ERROR"
2026-10-08T15:32:55.7768010Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7768241Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES DB-SUPORTE -----
2026-10-08T15:32:55.7768540Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 198 - quarkus.log.console.format = "%d{HH:mm:ss} %-5p[%c{2.}-%t{id}] %s%e%n"
2026-10-08T15:32:55.7768757Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7768958Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] PERSISTENCIA
2026-10-08T15:32:55.7769204Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 199 - quarkus.datasource.db-kind = "oracle"
2026-10-08T15:32:55.7769628Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 200 - quarkus.datasource.jdbc.url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=... DICATED)))" [415294251]
2026-10-08T15:32:55.7769979Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 201 - quarkus.datasource.jdbc.transactions = "xa"
2026-10-08T15:32:55.7770240Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 202 - quarkus.datasource.username = "SACCTS01"
2026-10-08T15:32:55.7770505Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 203 - quarkus.datasource.password = "[NAO INFORMADO]"
2026-10-08T15:32:55.7770782Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 204 - quarkus.hibernate-orm.database.default-schema = "ACC"
2026-10-08T15:32:55.7771050Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 205 - quarkus.hibernate-orm.database.generation = "none"
2026-10-08T15:32:55.7771323Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 206 - quarkus.hibernate-orm.scripts.generation = "none "
2026-10-08T15:32:55.7771597Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 207 - quarkus.hibernate-orm.validate-in-dev-mode = "false"
2026-10-08T15:32:55.7771896Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 208 - quarkus.hibernate-orm.packages = "br.gov.caixa.siacc.pix.suporte.db.entity"
2026-10-08T15:32:55.7772235Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 209 - quarkus.datasource."h2".jdbc.url = "jdbc:h2:mem:default;DB_CLOSE_DELAY=-1;AUTOCOMMIT=ON"
2026-10-08T15:32:55.7772540Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 210 - quarkus.datasource."h2".jdbc.transactions = "xa"
2026-10-08T15:32:55.7772911Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 211 - quarkus.datasource."h2".db-kind = "h2"
2026-10-08T15:32:55.7773231Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 212 - quarkus.hibernate-orm."h2".datasource = "h2"
2026-10-08T15:32:55.7773526Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 213 - quarkus.hibernate-orm."h2".database.generation = "drop-and-create"
2026-10-08T15:32:55.7773925Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 214 - quarkus.hibernate-orm."h2".packages = "br.gov.caixa.siacc.pix.suporte.db.h2.entity"
2026-10-08T15:32:55.7774237Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 215 - SIACC.DATABASE.CHECKCONNECTION.SCHEDUDLE = "0 * * ? * * *"
2026-10-08T15:32:55.7774547Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 216 - SIACC.DEFAULT.CHECKCONNECTION = "SELECT TO_CHAR(SYSDATE) as name FROM dual"
2026-10-08T15:32:55.7774938Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 217 - SIACC.DEFAULT.CHECKINSTANCE = "SELECT sys_context('userenv','instance_name') as name FROM dual"
2026-10-08T15:32:55.7775271Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 218 - SIACC.H2.CHECKCONNECTION = "SELECT TO_CHAR(CURRENT_TIMESTAMP()) as name FROM dual"
2026-10-08T15:32:55.7775567Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 219 - SIACC.H2.CHECKINSTANCE = "SELECT CURRENT_CATALOG();"
2026-10-08T15:32:55.7775824Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 220 - SIACC.H2.SERVER.PORT = "[NAO INFORMADO]"
2026-10-08T15:32:55.7776099Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 221 - quarkus.log.category."org.reflections".level = "ERROR"
2026-10-08T15:32:55.7776293Z 12:31:15 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
2026-10-08T15:32:55.7776718Z 12:31:17 WARN [io.qu.ag.ru.DataSources-26] Datasource <default> enables XA but transaction recovery is not enabled. Please enable transaction recovery by setting quarkus.transaction-manager.enable-recovery=true, otherwise data may be lost if the application is terminated abruptly
2026-10-08T15:32:55.7777243Z 12:31:17 WARN [io.qu.ag.ru.DataSources-26] Datasource h2 enables XA but transaction recovery is not enabled. Please enable transaction recovery by setting quarkus.transaction-manager.enable-recovery=true, otherwise data may be lost if the application is terminated abruptly
2026-10-08T15:32:55.7777575Z 12:31:18 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7777653Z 
2026-10-08T15:32:55.7777807Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7778039Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.809071894=/campanha - API Campanha
2026-10-08T15:32:55.7778305Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1673814368=GET /campanha - Listar campanhas
2026-10-08T15:32:55.7778599Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.910365308=GET /simulacao/consultaAvancada - Consulta Avançada
2026-10-08T15:32:55.7778864Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.322695217=POST /simulacao - Inclusão
2026-10-08T15:32:55.7779141Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1719257660=DELETE /simulacao/{id} - Cancelamento
2026-10-08T15:32:55.7779439Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.894542850=GET /simulacao/v2/consulta - Consulta V2 cliente/simulacao
2026-10-08T15:32:55.7779745Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1147689124=GET /simulacao/pendentes - Consulta Simulações Pendentes
2026-10-08T15:32:55.7780041Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.124585439=GET /simulacao/consulta - Consulta cliente/simulacao
2026-10-08T15:32:55.7780340Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1555236770=GET /simulacao/download/{idArquivo}/{nomeArquivo} - Download
2026-10-08T15:32:55.7780619Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1960878984=PUT /simulacao/{id} - Alteração
2026-10-08T15:32:55.7780942Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1639339222=/situacao - API Situação
2026-10-08T15:32:55.7781192Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.843547040=GET /situacao - Listar tarifas
2026-10-08T15:32:55.7781467Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.208571188=/tarifasExcecoes - Tarifas Excecoes
2026-10-08T15:32:55.7781771Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1834617111=GET /tarifasExcecoes/{nuSimulacaoNegocialConvenio} - (SEM ALIAS)
2026-10-08T15:32:55.7782059Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.2124697018=POST /simulacao/alcada - Alteração
2026-10-08T15:32:55.7782336Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.695623964=POST /simulacaoContraProposta - Inclusão
2026-10-08T15:32:55.7782646Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.47=/ - API Principal
2026-10-08T15:32:55.7783013Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.404439780=GET /redirect/{id} - Redirecionamento de Ativo de Infra
2026-10-08T15:32:55.7783295Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.641741694=GET /title - Nome da Aplicação
2026-10-08T15:32:55.7783550Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.703610225=OPTIONS  - Disponibilidade
2026-10-08T15:32:55.7783814Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1271185085=GET /ativo/{id} - Ativo de Infra
2026-10-08T15:32:55.7784065Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.2117903858=/tarifa - API Tarifa
2026-10-08T15:32:55.7784323Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1316380184=GET /tarifa - Listar tarifas
2026-10-08T15:32:55.7784580Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.20707231=/unidade - API Unidade
2026-10-08T15:32:55.7784824Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.890669867=GET /unidade - Listar unidades
2026-10-08T15:32:55.7785091Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1901380553=/parametros - API Parâmetros
2026-10-08T15:32:55.7785358Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.445467949=GET /parametros - Listar parâmetros
2026-10-08T15:32:55.7785629Z 12:31:20 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1948243029=POST /alcada - Consultar Alçada
2026-10-08T15:32:55.7785865Z 12:31:20 INFO [br.go.ca.si.pi.su.se.CustomTenantResolver-1] Listando Tenants OIDC
2026-10-08T15:32:55.7786110Z 12:31:20 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7786189Z 
2026-10-08T15:32:55.7786344Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7786576Z 12:31:20 ERROR[or.hi.en.jd.sp.SqlExceptionHelper-1] ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7786650Z 
2026-10-08T15:32:55.7786806Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7787181Z 12:31:20 ERROR[br.go.ca.si.pi.su.db.ReactiveDatabase-1] Falha ao verificar conexão com banco de dados PADRÃO: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7787327Z 
2026-10-08T15:32:55.7787491Z https://docs.oracle.com/error-help/db/ora-01005/] [n/a]
2026-10-08T15:32:55.7787681Z 	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63)
2026-10-08T15:32:55.7787891Z 	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-10-08T15:32:55.7788076Z 	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-10-08T15:32:55.7788301Z 	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-10-08T15:32:55.7788559Z 	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-10-08T15:32:55.7788848Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:54)
2026-10-08T15:32:55.7789193Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:153)
2026-10-08T15:32:55.7789435Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:183)
2026-10-08T15:32:55.7789681Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:155)
2026-10-08T15:32:55.7789880Z 	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.lambda$list$0(JdbcSelectExecutor.java:85)
2026-10-08T15:32:55.7790087Z 	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:231)
2026-10-08T15:32:55.7790354Z 	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:167)
2026-10-08T15:32:55.7790573Z 	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
2026-10-08T15:32:55.7790793Z 	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
2026-10-08T15:32:55.7791006Z 	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
2026-10-08T15:32:55.7791224Z 	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:325)
2026-10-08T15:32:55.7791451Z 	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:115)
2026-10-08T15:32:55.7791676Z 	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:83)
2026-10-08T15:32:55.7791887Z 	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:76)
2026-10-08T15:32:55.7792074Z 	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:65)
2026-10-08T15:32:55.7792269Z 	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:138)
2026-10-08T15:32:55.7792467Z 	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:621)
2026-10-08T15:32:55.7792656Z 	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:427)
2026-10-08T15:32:55.7792923Z 	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:564)
2026-10-08T15:32:55.7793137Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkDatabaseConnection(ReactiveDatabase.java:207)
2026-10-08T15:32:55.7793350Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkConnection(ReactiveDatabase.java:154)
2026-10-08T15:32:55.7793548Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.postConstruct(ReactiveDatabase.java:125)
2026-10-08T15:32:55.7793740Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.doCreate(Unknown Source)
2026-10-08T15:32:55.7793901Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
2026-10-08T15:32:55.7794053Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
2026-10-08T15:32:55.7794233Z 	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
2026-10-08T15:32:55.7794431Z 	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
2026-10-08T15:32:55.7794615Z 	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
2026-10-08T15:32:55.7794804Z 	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.c95(Unknown Source)
2026-10-08T15:32:55.7795015Z 	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.computeIfAbsent(Unknown Source)
2026-10-08T15:32:55.7795207Z 	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
2026-10-08T15:32:55.7795448Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Observer_onStart_yg7c1rk96xiAULOjLWikDqIgD78.notify(Unknown Source)
2026-10-08T15:32:55.7795639Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:346)
2026-10-08T15:32:55.7795810Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:328)
2026-10-08T15:32:55.7795971Z 	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:82)
2026-10-08T15:32:55.7796140Z 	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:155)
2026-10-08T15:32:55.7796320Z 	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:106)
2026-10-08T15:32:55.7796492Z 	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
2026-10-08T15:32:55.7796727Z 	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
2026-10-08T15:32:55.7796891Z 	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
2026-10-08T15:32:55.7797090Z 	at io.quarkus.runtime.Application.start(Application.java:101)
2026-10-08T15:32:55.7797286Z 	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:111)
2026-10-08T15:32:55.7797463Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
2026-10-08T15:32:55.7797605Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
2026-10-08T15:32:55.7797753Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
2026-10-08T15:32:55.7797896Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-10-08T15:32:55.7798049Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-08T15:32:55.7798237Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-10-08T15:32:55.7798440Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-08T15:32:55.7798626Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-10-08T15:32:55.7798795Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
2026-10-08T15:32:55.7798977Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
2026-10-08T15:32:55.7799213Z Caused by: java.sql.SQLException: ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7799280Z 
2026-10-08T15:32:55.7799434Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7799587Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:702)
2026-10-08T15:32:55.7799759Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:603)
2026-10-08T15:32:55.7799921Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:598)
2026-10-08T15:32:55.7800094Z 	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1795)
2026-10-08T15:32:55.7800276Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:866)
2026-10-08T15:32:55.7800459Z 	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:1102)
2026-10-08T15:32:55.7800616Z 	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:456)
2026-10-08T15:32:55.7800789Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:508)
2026-10-08T15:32:55.7800977Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutPassword(T4CTTIoauthenticate.java:2128)
2026-10-08T15:32:55.7801177Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
2026-10-08T15:32:55.7801364Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1368)
2026-10-08T15:32:55.7801550Z 	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1821)
2026-10-08T15:32:55.7801742Z 	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1764)
2026-10-08T15:32:55.7801922Z 	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:976)
2026-10-08T15:32:55.7802089Z 	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
2026-10-08T15:32:55.7802348Z 	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
2026-10-08T15:32:55.7802525Z 	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
2026-10-08T15:32:55.7802714Z 	at oracle.jdbc.datasource.impl.OracleDataSource.getPhysicalConnection(OracleDataSource.java:707)
2026-10-08T15:32:55.7803003Z 	at oracle.jdbc.xa.client.OracleXADataSource.getPooledConnection(OracleXADataSource.java:631)
2026-10-08T15:32:55.7803199Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:225)
2026-10-08T15:32:55.7803386Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnectionInternal(OracleXADataSource.java:268)
2026-10-08T15:32:55.7803582Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:166)
2026-10-08T15:32:55.7803859Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:138)
2026-10-08T15:32:55.7804051Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:231)
2026-10-08T15:32:55.7804246Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:545)
2026-10-08T15:32:55.7804436Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:526)
2026-10-08T15:32:55.7804604Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-10-08T15:32:55.7804790Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-10-08T15:32:55.7804992Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-10-08T15:32:55.7805189Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-10-08T15:32:55.7805355Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-10-08T15:32:55.7805420Z 
2026-10-08T15:32:55.7805750Z 12:31:20 ERROR[br.go.ca.si.pi.su.db.ReactiveDatabase-1] Falha ao verificar conexao com o banco: br.gov.caixa.siacc.pix.suporte.exception.SiaccException: Falha ao verificar conexão com banco de dados PADRÃO
2026-10-08T15:32:55.7806013Z 	at br.gov.caixa.siacc.pix.suporte.exception.SiaccException$SiaccExceptionBuilder.build(SiaccException.java:24)
2026-10-08T15:32:55.7806234Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkDatabaseConnection(ReactiveDatabase.java:217)
2026-10-08T15:32:55.7806447Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkConnection(ReactiveDatabase.java:154)
2026-10-08T15:32:55.7806639Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.postConstruct(ReactiveDatabase.java:125)
2026-10-08T15:32:55.7806824Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.doCreate(Unknown Source)
2026-10-08T15:32:55.7806993Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
2026-10-08T15:32:55.7807159Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
2026-10-08T15:32:55.7807340Z 	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
2026-10-08T15:32:55.7807534Z 	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
2026-10-08T15:32:55.7807706Z 	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
2026-10-08T15:32:55.7807895Z 	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.c95(Unknown Source)
2026-10-08T15:32:55.7808097Z 	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.computeIfAbsent(Unknown Source)
2026-10-08T15:32:55.7808294Z 	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
2026-10-08T15:32:55.7808487Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Observer_onStart_yg7c1rk96xiAULOjLWikDqIgD78.notify(Unknown Source)
2026-10-08T15:32:55.7808681Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:346)
2026-10-08T15:32:55.7808842Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:328)
2026-10-08T15:32:55.7809061Z 	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:82)
2026-10-08T15:32:55.7809234Z 	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:155)
2026-10-08T15:32:55.7809413Z 	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:106)
2026-10-08T15:32:55.7809596Z 	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
2026-10-08T15:32:55.7809778Z 	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
2026-10-08T15:32:55.7809942Z 	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
2026-10-08T15:32:55.7810087Z 	at io.quarkus.runtime.Application.start(Application.java:101)
2026-10-08T15:32:55.7810329Z 	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:111)
2026-10-08T15:32:55.7810504Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
2026-10-08T15:32:55.7810653Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
2026-10-08T15:32:55.7810801Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
2026-10-08T15:32:55.7810937Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-10-08T15:32:55.7811089Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-08T15:32:55.7811275Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-10-08T15:32:55.7811489Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-08T15:32:55.7811676Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-10-08T15:32:55.7811848Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
2026-10-08T15:32:55.7812026Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
2026-10-08T15:32:55.7812324Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7812433Z 
2026-10-08T15:32:55.7812583Z https://docs.oracle.com/error-help/db/ora-01005/] [n/a]
2026-10-08T15:32:55.7812881Z 	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63)
2026-10-08T15:32:55.7813108Z 	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-10-08T15:32:55.7813303Z 	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-10-08T15:32:55.7813529Z 	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-10-08T15:32:55.7813784Z 	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-10-08T15:32:55.7814016Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:54)
2026-10-08T15:32:55.7814224Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:153)
2026-10-08T15:32:55.7814461Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:183)
2026-10-08T15:32:55.7814705Z 	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:155)
2026-10-08T15:32:55.7814914Z 	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.lambda$list$0(JdbcSelectExecutor.java:85)
2026-10-08T15:32:55.7815122Z 	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:231)
2026-10-08T15:32:55.7815342Z 	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:167)
2026-10-08T15:32:55.7815568Z 	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
2026-10-08T15:32:55.7815782Z 	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
2026-10-08T15:32:55.7816081Z 	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
2026-10-08T15:32:55.7816304Z 	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:325)
2026-10-08T15:32:55.7816544Z 	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:115)
2026-10-08T15:32:55.7816771Z 	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:83)
2026-10-08T15:32:55.7816977Z 	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:76)
2026-10-08T15:32:55.7817206Z 	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:65)
2026-10-08T15:32:55.7817391Z 	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:138)
2026-10-08T15:32:55.7817601Z 	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:621)
2026-10-08T15:32:55.7817790Z 	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:427)
2026-10-08T15:32:55.7817985Z 	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:564)
2026-10-08T15:32:55.7818197Z 	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkDatabaseConnection(ReactiveDatabase.java:207)
2026-10-08T15:32:55.7818350Z 	... 32 more
2026-10-08T15:32:55.7818538Z Caused by: java.sql.SQLException: ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7818615Z 
2026-10-08T15:32:55.7818762Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7818915Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:702)
2026-10-08T15:32:55.7819092Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:603)
2026-10-08T15:32:55.7819263Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:598)
2026-10-08T15:32:55.7819431Z 	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1795)
2026-10-08T15:32:55.7819612Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:866)
2026-10-08T15:32:55.7819783Z 	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:1102)
2026-10-08T15:32:55.7819940Z 	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:456)
2026-10-08T15:32:55.7820115Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:508)
2026-10-08T15:32:55.7820314Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutPassword(T4CTTIoauthenticate.java:2128)
2026-10-08T15:32:55.7820510Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
2026-10-08T15:32:55.7820693Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1368)
2026-10-08T15:32:55.7820872Z 	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1821)
2026-10-08T15:32:55.7821066Z 	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1764)
2026-10-08T15:32:55.7821243Z 	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:976)
2026-10-08T15:32:55.7821418Z 	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
2026-10-08T15:32:55.7821604Z 	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
2026-10-08T15:32:55.7821783Z 	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
2026-10-08T15:32:55.7821960Z 	at oracle.jdbc.datasource.impl.OracleDataSource.getPhysicalConnection(OracleDataSource.java:707)
2026-10-08T15:32:55.7822160Z 	at oracle.jdbc.xa.client.OracleXADataSource.getPooledConnection(OracleXADataSource.java:631)
2026-10-08T15:32:55.7822355Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:225)
2026-10-08T15:32:55.7822558Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnectionInternal(OracleXADataSource.java:268)
2026-10-08T15:32:55.7822895Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:166)
2026-10-08T15:32:55.7823084Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:138)
2026-10-08T15:32:55.7823262Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:231)
2026-10-08T15:32:55.7823450Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:545)
2026-10-08T15:32:55.7823636Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:526)
2026-10-08T15:32:55.7823811Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-10-08T15:32:55.7823999Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-10-08T15:32:55.7824251Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-10-08T15:32:55.7824437Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-10-08T15:32:55.7824603Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-10-08T15:32:55.7824674Z 
2026-10-08T15:32:55.7824874Z 12:31:20 INFO [br.go.ca.si.pi.su.db.ReactiveDatabase-1] Verificando conexão com banco de dados
2026-10-08T15:32:55.7825123Z 12:31:21 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7825207Z 
2026-10-08T15:32:55.7825353Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7825575Z 12:31:21 ERROR[or.hi.en.jd.sp.SqlExceptionHelper-1] ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7825661Z 
2026-10-08T15:32:55.7825805Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7826045Z 12:31:21 ERROR[br.go.ca.si.pi.su.db.ReactiveDatabase-1] Falha ao verificar conexão com banco de dados PADRÃO
2026-10-08T15:32:55.7826239Z 12:31:21 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
2026-10-08T15:32:55.7826461Z 12:31:21 INFO [br.go.ca.si.pi.su.db.Orquestrador-1] Verificando instancias de inicializacao
2026-10-08T15:32:55.7826687Z 12:31:21 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - nenhum problema identificado
2026-10-08T15:32:55.7826922Z 12:31:21 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7827043Z 
2026-10-08T15:32:55.7827215Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7827428Z 12:31:21 ERROR[or.hi.en.jd.sp.SqlExceptionHelper-1] ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7827509Z 
2026-10-08T15:32:55.7827659Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7827919Z 12:31:21 ERROR[io.qu.ru.Application-1] Failed to start application (with profile [prod]): java.lang.RuntimeException: Failed to start quarkus
2026-10-08T15:32:55.7828106Z 	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
2026-10-08T15:32:55.7828258Z 	at io.quarkus.runtime.Application.start(Application.java:101)
2026-10-08T15:32:55.7828441Z 	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:111)
2026-10-08T15:32:55.7828618Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
2026-10-08T15:32:55.7828764Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
2026-10-08T15:32:55.7828900Z 	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
2026-10-08T15:32:55.7829044Z 	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
2026-10-08T15:32:55.7829197Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
2026-10-08T15:32:55.7829399Z 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
2026-10-08T15:32:55.7829621Z 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
2026-10-08T15:32:55.7829806Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-10-08T15:32:55.7829966Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
2026-10-08T15:32:55.7830207Z 	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
2026-10-08T15:32:55.7830507Z Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7830606Z 
2026-10-08T15:32:55.7830769Z https://docs.oracle.com/error-help/db/ora-01005/] [n/a]
2026-10-08T15:32:55.7830954Z 	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63)
2026-10-08T15:32:55.7831167Z 	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
2026-10-08T15:32:55.7831363Z 	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
2026-10-08T15:32:55.7831591Z 	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
2026-10-08T15:32:55.7831892Z 	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
2026-10-08T15:32:55.7832129Z 	at org.hibernate.engine.jdbc.internal.JdbcCoordinatorImpl.coordinateWork(JdbcCoordinatorImpl.java:301)
2026-10-08T15:32:55.7832348Z 	at org.hibernate.internal.AbstractSharedSessionContract.doWork(AbstractSharedSessionContract.java:1053)
2026-10-08T15:32:55.7832562Z 	at org.hibernate.internal.AbstractSharedSessionContract.doWork(AbstractSharedSessionContract.java:1041)
2026-10-08T15:32:55.7832837Z 	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador.validar(Orquestrador.java:74)
2026-10-08T15:32:55.7833037Z 	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador.validarAmbiente(Orquestrador.java:63)
2026-10-08T15:32:55.7833226Z 	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador.onStart(Orquestrador.java:52)
2026-10-08T15:32:55.7833497Z 	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador_Observer_onStart_xIb7RsBJbtZVQvvrHKpw07UiT-o.notify(Unknown Source)
2026-10-08T15:32:55.7833687Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:346)
2026-10-08T15:32:55.7833862Z 	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:328)
2026-10-08T15:32:55.7834024Z 	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:82)
2026-10-08T15:32:55.7834194Z 	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:155)
2026-10-08T15:32:55.7834371Z 	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:106)
2026-10-08T15:32:55.7834546Z 	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
2026-10-08T15:32:55.7834725Z 	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
2026-10-08T15:32:55.7834855Z 	... 13 more
2026-10-08T15:32:55.7835046Z Caused by: java.sql.SQLException: ORA-01005: null password given; logon denied
2026-10-08T15:32:55.7835114Z 
2026-10-08T15:32:55.7835267Z https://docs.oracle.com/error-help/db/ora-01005/
2026-10-08T15:32:55.7835420Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:702)
2026-10-08T15:32:55.7835593Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:603)
2026-10-08T15:32:55.7835754Z 	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:598)
2026-10-08T15:32:55.7835922Z 	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1795)
2026-10-08T15:32:55.7836102Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:866)
2026-10-08T15:32:55.7836281Z 	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:1102)
2026-10-08T15:32:55.7836441Z 	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:456)
2026-10-08T15:32:55.7836614Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:508)
2026-10-08T15:32:55.7836800Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutPassword(T4CTTIoauthenticate.java:2128)
2026-10-08T15:32:55.7836995Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
2026-10-08T15:32:55.7837177Z 	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1368)
2026-10-08T15:32:55.7837422Z 	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1821)
2026-10-08T15:32:55.7837616Z 	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1764)
2026-10-08T15:32:55.7837793Z 	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:976)
2026-10-08T15:32:55.7837960Z 	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
2026-10-08T15:32:55.7838151Z 	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
2026-10-08T15:32:55.7838328Z 	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
2026-10-08T15:32:55.7838517Z 	at oracle.jdbc.datasource.impl.OracleDataSource.getPhysicalConnection(OracleDataSource.java:707)
2026-10-08T15:32:55.7838767Z 	at oracle.jdbc.xa.client.OracleXADataSource.getPooledConnection(OracleXADataSource.java:631)
2026-10-08T15:32:55.7838961Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:225)
2026-10-08T15:32:55.7839153Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnectionInternal(OracleXADataSource.java:268)
2026-10-08T15:32:55.7839344Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:166)
2026-10-08T15:32:55.7839539Z 	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:138)
2026-10-08T15:32:55.7839724Z 	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:231)
2026-10-08T15:32:55.7839910Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:545)
2026-10-08T15:32:55.7840100Z 	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:526)
2026-10-08T15:32:55.7840263Z 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
2026-10-08T15:32:55.7840451Z 	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
2026-10-08T15:32:55.7840649Z 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
2026-10-08T15:32:55.7840846Z 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
2026-10-08T15:32:55.7841012Z 	at java.base/java.lang.Thread.run(Thread.java:833)
2026-10-08T15:32:55.7841075Z 
2026-10-08T15:32:55.7924395Z ##[section]Finishing: Logs da Aplicação
