exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-08 12:14:51.265-03:00 ERROR c.m.applicationinsights.agent - 
*************************
Application Insights Java Agent 3.7.3 startup failed (PID 8)
*************************

Description:
No connection string provided

Action:
Please provide connection string: https://go.microsoft.com/fwlink/?linkid=2153358

__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
12:14:52 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-internet".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
12:14:52 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-intranet-web".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
12:14:52 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-intranet-servico".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
12:14:52 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.log.category.min-level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
12:14:52 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.log.category.level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] LaunchMode NORMAL
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES INTERNAS REFERENCIADAS -----
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 1 - quarkus.application.name = "SIACC-pixautomatico-api-simulador"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 2 - quarkus.application.version = "1.0.0-SNAPSHOT"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 3 - APPLICATION.ID = "[NAO INFORMADO]"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURA ? ?ES API-SIMULADOR -----
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 4 - mp.openapi.extensions.smallrye.info.title = "SIACC PIX AUTOM TICO- API Simulador"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 5 - SIACC.APPLICATION.ID = "siacc-pixautomatico:simulador"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 6 - SIACC.ID.TIPO-SERVICO.PIXAUTOMATICO = "1"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 7 - SIACC.ID.TIPO-SITUACAO.INCLUIDO = "1"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 8 - SIACC.ID.TIPO-SITUACAO.APROVADO = "4"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 9 - SIACC.ID.TIPO-SITUACAO.CANCELADA = "6"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 10 - SIACC.ID.TIPO-SITUACAO.PENDENTE = "2"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 11 - SIACC.ID.TIPO-SITUACAO.PREVISTA = "10"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 12 - SIACC.ID.ALCADA.AGENCIA = "1"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 13 - SIACC.ID.ALCADA.SEV = "2"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 14 - SIACC.ID.ALCADA.SR = "3"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 15 - SIACC.ID.ALCADA.MATRIZ = "4"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 16 - SIACC.ID.ALCADA.CLIENTE = "5"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 17 - SIACC.UNIDADE-SIICO.SIGLA.AGENCIA = "AG"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 18 - SIACC.UNIDADE-SIICO.SIGLA.SEV = "SEV"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 19 - SIACC.UNIDADE-SIICO.SIGLA.SR = "SR"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 20 - SIACC.UNIDADE-SIICO.SIGLA.MATRIZ = "MATRIZ"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 21 - SIACC.REPOSITORIO.DOCUMENTOS.PATH = "/siacc-pagamentos-recebimentos/PIXAUTOMATICO"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURAÇÕES DAS APIS
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ####API BUSCA CONTAS NO SICLI: ####################################
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 22 - cadastro-api.url = "http://api.des.caixa:8080/cadastro/v2"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 23 - cadastro-api.key = "l73d2c2aebb40d479083fa48d018530d92"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 24 - quarkus.rest-client.cadastro-api.url = "${cadastro-api.url}" (22)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 25 - quarkus.rest-client.cadastro-api.scope = "javax.inject.Singleton"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 26 - apim.config.apikey = "${cadastro-api.key}" (23)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ################################################################
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURA  O DO LOG - REMOVER LOG HEALTH CHECK ##
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 27 - quarkus.log.category."org.eclipse.microprofile.health".level = "ERROR"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 28 - quarkus.log.category."io.quarkus.smallrye.health".level = "ERROR"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 29 - quarkus.log.category."org.jboss.resteasy.reactive.server.handlers.RequestHandler".level = "WARN"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 30 - quarkus.log.category."io.vertx.core.http.impl.HttpServerRequestImpl".level = "WARN"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ####
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 31 - SIACC.LOG.LEVEL = "DEBUG"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 32 - quarkus.log.category."br.gov.caixa".level = "${SIACC.LOG.LEVEL}" (31,108)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 33 - quarkus.rest-client.siico-info-privadas.url = "https://api.des.caixa:8443/informacoes-corporativas-privadas"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 34 - quarkus.rest-client.siico-info-publicas.url = "https://api.des.caixa:8443/informacoes-corporativas-publicas"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 35 - SIACC.AUDITORIA.FUNCIONALIDADE = "SIMULADOR-CONVENIO"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] DEV LOCAL
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 36 - SIACC.CLIENT.IDS.CANAIS = "cli-ser-nbc,cli-ser-gcx"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ## RATE LIMITER
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 37 - SIACC.RATE.LIMITER.ENABLED = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 38 - SIACC.RATE.LIMITER.QTDE.REQ.PERMITIDAS = "60"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 39 - SIACC.RATE.LIMITER.PERIODICIDADE = "1M"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 40 - quarkus.rate-limiter.enabled = "${SIACC.RATE.LIMITER.ENABLED}" (37)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 41 - quarkus.rate-limiter.buckets."group1".limits[0].permitted-uses = "${SIACC.RATE.LIMITER.QTDE.REQ.PERMITIDAS}" (38)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 42 - quarkus.rate-limiter.buckets."group1".limits[0].period = "${SIACC.RATE.LIMITER.PERIODICIDADE}" (39)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 43 - quarkus.rate-limiter.buckets."group1".identity-resolver = "br.gov.caixa.siacc.pix.manager.UserIdentityResolver"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ##
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES API-SUPORTE -----
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 44 - app.name = "${quarkus.application.name}" (1)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 45 - app.version = "${quarkus.application.version}" (2)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 46 - app.env = "TQS"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 47 - app.swagger = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 48 - app.swagger.admin = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 49 - SIACC.APPLICATION.ID = "siacc-pixautomatico:simulador"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE API
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 50 - apim.config.apikey = "l73d2c2aebb40d479083fa48d018530d92"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 51 - client.timeout = "5000"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 52 - SIACC.FRONTEND.SERVICOS.URL = "https://siacc-servicos-frontend-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 53 - SIACC.FRONTEND.PIXAUTOMATICO.URL = "https://siacc-pixautomatico-frontend-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 54 - SIACC.FRONTEND.CENTRALIZADOR.URL = "https://siacc-servicos-frontend-centralizador-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 55 - SIACC.API.CENTRALIZADOR.URL = "https://siacc-servicos-api-centralizador-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 56 - SIACC.API.AUDITORIA.URL = "https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 57 - SIACC.API.CONVENIO.URL = "https://siacc-pixautomatico-api-convenio-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 58 - SIACC.API.SIMULADOR.URL = "https://siacc-pixautomatico-api-simulador-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 59 - SIACC.API.PARAMETROS.URL = "https://siacc-pixautomatico-api-parametro-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 60 - SIACC.API.CONTROLE.REQUISICOES.URL = "https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 61 - SIACC.API.WEBHOOK.URL = "https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 62 - SIACC.API.PAGAMENTO.URL = "https://siacc-pixautomatico-api-pagamento-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 63 - SIACC.API.BATIMENTO.URL = "https://siacc-pixautomatico-api-batimento-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 64 - SIACC.API.GERENCIADOR.ARQUIVOS.URL = "https://siacc-servicos-api-gerenciador-arquivos-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 65 - SIACC.BATCH.AUDITORIA.URL = "https://siacc-pixautomatico-batch-auditoria-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 66 - SIACC.BATCH.MANUTENCAO.URL = "https://siacc-pixautomatico-batch-manutencao-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 67 - SIACC.BATCH.REPASSE.URL = "https://siacc-pixautomatico-batch-repasse-tqs.apps.nprd.caixa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 68 - quarkus.tls.trust-all = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 69 - quarkus.rest-client.siacc-auditoria.url = "${SIACC.API.AUDITORIA.URL}" (56)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 70 - quarkus.rest-client.siacc-convenio.url = "${SIACC.API.CONVENIO.URL}" (57)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 71 - quarkus.rest-client.siacc-simulador.url = "${SIACC.API.SIMULADOR.URL}" (58)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 72 - quarkus.rest-client.siacc-parametros.url = "${SIACC.API.PARAMETROS.URL}" (59)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 73 - quarkus.rest-client.siacc-centralizador.url = "${SIACC.API.CENTRALIZADOR.URL}" (55)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 74 - quarkus.rest-client.siacc-gerenciador-arquivos.url = "${SIACC.API.GERENCIADOR.ARQUIVOS.URL}" (64)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 75 - quarkus.rest-client.siacc-tarifas.url = "${SIACC.BATCH.REPASSE.URL}" (67)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 76 - quarkus.rest-client.connect-timeout = "${client.timeout}" (51)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 77 - quarkus.rest-client.read-timeout = "${client.timeout}" (51)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES JWT
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 78 - SIACC.LOGIN-CLIENT.URL = "${SIACC.SSO.INTRANET.URL}" (82)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 79 - SIACC.SSO.INTERNET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44R... 4zBwIDAQAB" [-1986508888]
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 80 - SIACC.SSO.INTERNET.URL = "https://logindes.caixa.gov.br/auth/realms/internet"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 81 - SIACC.SSO.INTRANET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe... FDYwIDAQAB" [-234932412]
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 82 - SIACC.SSO.INTRANET.URL = "https://login.des.caixa/auth/realms/intranet"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 83 - quarkus.oidc."servico-internet".url = "${SIACC.SSO.INTERNET.URL}" (80)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 84 - quarkus.oidc."servico-internet".public-key = "${SIACC.SSO.INTERNET.PUBLIC-KEY}" (79)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 85 - quarkus.oidc."servico-intranet-web".url = "${SIACC.SSO.INTRANET.URL}" (82)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 86 - quarkus.oidc."servico-intranet-web".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (81)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 87 - quarkus.oidc."servico-intranet-servico".url = "${SIACC.SSO.INTRANET.URL}" (82)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 88 - quarkus.oidc."servico-intranet-servico".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (81)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE CACHE
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 89 - quarkus.cache.caffeine."cacheService".initial-capacity = "50"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 90 - quarkus.cache.caffeine."cacheService".maximum-size = "500"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 91 - quarkus.cache.caffeine."cacheService".expire-after-write = "8H"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 92 - quarkus.cache.caffeine."cacheService".expire-after-access = "8H"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE SEGURANCA DO CLIENTE
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE SEGURANCA DO CLIENTE
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 93 - quarkus.oidc-client.auth-server-url = "https://login.des.caixa/auth/realms/intranet"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 94 - quarkus.oidc-client.client-id = "cli-ser-acc-pxa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 95 - quarkus.oidc-client.credentials.secret = "[hash:4eba39da681cee1ddb62d761588688cbca1df7d9a12939befe28fcbf702393a1]"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE SEGURANCA ADMINISTRATIVA
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 96 - SIACC.ADMIN.ROLES = "SPI_PAGAMENTOS,ACC_ADMIN"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 97 - SIACC.ADMIN.PATH = "/admin/*"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 98 - quarkus.http.auth.policy.role-admin.roles-allowed = "${SIACC.ADMIN.ROLES}" (96)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 99 - quarkus.http.auth.permission.administration.paths = "${SIACC.ADMIN.PATH}" (97)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 100 - quarkus.http.auth.permission.administration.policy = "role-admin"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 101 - quarkus.http.auth.permission.permit1.paths = "/admin/swagger,/admin/authorization"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 102 - quarkus.http.auth.permission.permit1.policy = "permit"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE LOG
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 103 - quarkus.log.console.format = "%d{HH:mm:ss} %-5p[%c{2.}-%t{id}] %s%e%n"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 104 - quarkus.log.category."org.jboss.resteasy.reactive.client".level = "ERROR"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 105 - SIACC.GENERAL.LOG.LEVEL = "DEBUG"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 106 - quarkus.log.category.level = "${SIACC.GENERAL.LOG.LEVEL}" (105)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 107 - quarkus.log.category.min-level = "${SIACC.GENERAL.LOG.LEVEL}" (105)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 108 - SIACC.LOG.LEVEL = "DEBUG"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 109 - quarkus.log.category."br.gov.caixa".level = "${SIACC.LOG.LEVEL}" (31,108)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 110 - quarkus.log.category."br.gov.caixa".min-level = "${SIACC.LOG.LEVEL}" (31,108)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DA APLICACAO
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 111 - quarkus.http.root-path = "/"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 112 - quarkus.http.cors = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 113 - quarkus.http.cors.origins = "*"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 114 - quarkus.smallrye-health.ui.enable = "false"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 115 - quarkus.smallrye-health.root-path = "//healthx"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 116 - quarkus.health.extensions.enabled = "false"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 117 - quarkus.http.ssl.protocols = "TLSv1.2"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 118 - properties.hash.seed = "167243864789133"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 119 - SIACC.PROPERTIES.FILE = "application.properties"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 120 - SIACC.PROPERTIES.SOURCE = "target/classes/"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 121 - SIACC.PROPERTIES.MAXLENGTH = "160"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 122 - SIACC.PROPERTIES.SHOWCOMPACT = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 123 - SIACC.PROPERTIES.SHOWHASH = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 124 - SIACC.PROPERTIES.SHOWORIGINAL = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 125 - SIACC.PROPERTIES.SHOWINDEX = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 126 - SIACC.PROPERTIES.CUTOFF = "10"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 127 - SIACC.PROPERTIES.PATTERN = "\$\{(.*?)\}"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 128 - SIACC.AUDITORIA.FUNCIONALIDADE = "SIMULADOR-CONVENIO"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 129 - SIACC.SWAGGER.PROXY.URL = "http://localhost:8080/swagger/{tag}"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 130 - SIACC.TAG = "{tag}"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DO SWAGGER
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 131 - quarkus.swagger-ui.always-include = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 132 - quarkus.smallrye-openapi.always-run-filter = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 133 - quarkus.smallrye-openapi.path = "/swagger"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 134 - quarkus.swagger-ui.path = "/swagger-ui"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 135 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 136 - mp.openapi.extensions.smallrye.info.title = "SIACC PIX AUTOM TICO- API Simulador"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 137 - mp.openapi.extensions.smallrye.info.name = "${APPLICATION.ID}" (3)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 138 - mp.openapi.extensions.smallrye.info.description = "Servico para SIACC-pixautomatico-api-simulador"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 139 - mp.openapi.extensions.smallrye.info.version = "${app.version}" (45)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 140 - mp.openapi.filter = "br.gov.caixa.siacc.pix.suporte.helper.OpenAPIFilter"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 141 - mp.openapi.extensions.smallrye.info.contact.email = "suporte@caixa.gov.br"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 142 - mp.openapi.extensions.smallrye.info.contact.name = "Suporte"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE DEPENDENCIAS
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 143 - SIACC.DEPENDENCY.SCHEDULE = "0/10 * * ? * * *"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 144 - SIACC.DEPENDENCY.INITIAL-DELAY = "5000"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 145 - SIACC.DEPENDENCY.AUDITORIA.MONITOR = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 146 - SIACC.DEPENDENCY.SSO.MONITOR = "false"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] RESOURCES
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 147 - SIACC.APISERVICE.AVAILABLE = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] MENSAGENS DE RESPOSTA PADRAO
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 148 - SIACC.API.UNAVAILABLE.MESSAGE = "Serviço temporariamente indisponível"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 149 - SIACC.API.UNAVAILABLE.DESCRIPTION = "Tente novamente em alguns instantes"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 150 - SIACC.API.BADREQUEST.MESSAGE = "A requisição recebida não é válida"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 151 - SIACC.API.BADREQUEST.DESCRIPTION = "verifique e tente novamente: {}"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 152 - SIACC.API.UNAUTHORIZED.MESSAGE = "Acesso não autorizado"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 153 - SIACC.API.UNAUTHORIZED.DESCRIPTION = "Verifique suas credenciais e tente novamente"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 154 - SIACC.API.FORBIDDEN.MESSAGE = "Você não possui acesso a este recurso"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 155 - SIACC.API.FORBIDDEN.DESCRIPTION = "Verifique suas credenciais e tente novamente"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 156 - SIACC.API.AUTHENTICATIONFAIL.MESSAGE = "Falha de autenticação"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 157 - SIACC.API.AUTHENTICATIONFAIL.DESCRIPTION = "Verifique suas credenciais e tente novamente"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 158 - SIACC.API.INTERNALERROR.MESSAGE = "No momento não foi possível processar sua requisição"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 159 - SIACC.API.INTERNALERROR.DESCRIPTION = "Solicitamos que tente novamente em alguns instantes"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 160 - SIACC.API.EXCEPTION.LOGALL = "false"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 161 - SIACC.EXCEPTION.ON.RESPONSE = "false"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 162 - SIACC.CONFIG.PROPERTIES."APPLICATION".source = "/application.properties"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 163 - SIACC.CONFIG.PROPERTIES."API-SUPORTE".source = "META-INF/application.api.properties"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HEALTH CUSTOM PROPERTIES
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] DEV LOCAL
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] SWAGGER / OPENAPI
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 164 - quarkus.swagger-ui.always-include = "true"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 165 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 166 - quarkus.smallrye-openapi.path = "/swagger"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 167 - quarkus.swagger-ui.path = "/swagger-ui"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 168 - quarkus.smallrye-openapi.info-title = "SIACC PIX AUTOM TICO- API Simulador"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 169 - quarkus.smallrye-openapi.info-version = "${app.version}" (45)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 170 - quarkus.smallrye-openapi.info-description = "Modelo padrão de pagamento PIX Automático."
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 171 - quarkus.smallrye-openapi.info-contact-email = "contato@caixa.gov.br"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 172 - quarkus.smallrye-openapi.info-contact-name = "contato"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 173 - quarkus.devservices.enabled = "false"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 174 - SIACC.API.CAIXA.URL = "https://api.des.caixa:8443"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 175 - SIACC.API.DES.CAIXA.URL = "${SIACC.API.CAIXA.URL}" (174)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 176 - SICLI.CLIENT.TIMEOUT = "10000"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 177 - quarkus.rest-client.sicli.url = "https://api.des.caixa:8443/cadastro"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 178 - quarkus.rest-client.sicli.connect-timeout = "${SICLI.CLIENT.TIMEOUT}" (176)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 179 - quarkus.rest-client.sicli.read-timeout = "${SICLI.CLIENT.TIMEOUT}" (176)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 180 - quarkus.rest-client.sicow.url = "https://api.des.caixa:8443/pesquisa-cadastral/v1"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 181 - quarkus.rest-client.nsgd-api.url = "https://api.des.caixa:8443/conta-deposito/consulta-conta"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 182 - quarkus.rest-client.siico-info-privadas.url = "https://api.des.caixa:8443/informacoes-corporativas-privadas"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 183 - quarkus.rest-client.dict.url = "https://api.des.caixa:8443/transacoes-financeiras/pagamentos-instantaneos/dict-estatistica/v2/estatisticas"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 184 - SIACC.LISTA.CODIGOS.VINCULOS.SOCIOS = "6,8,23,32,36,48,49,87"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 185 - SIACC.IMPEDIMENTOS.SICOW = "empregados_trabalho_escravo,informacoes_seguranca,pld,proibido_contratar_setor_publico"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE PROXY
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 186 - PROXY.HOST = "[NAO INFORMADO]"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 187 - PROXY.PORT = "[NAO INFORMADO]"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] Definicoes de variaveis para o cache
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 188 - SIACC.CACHE.INITIAL-SIZE = "50"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 189 - SIACC.CACHE.MAXIMUM-SIZE = "500"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 190 - SIACC.CACHE.EXPIRE-AFTER-WRITE = "15m"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 191 - SIACC.CACHE.EXPIRE-AFTER-ACCESS = "2m"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DO QUARKUS CACHE CAFFEINE
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 192 - quarkus.cache.caffeine.initial-capacity = "${SIACC.CACHE.INITIAL-SIZE}" (188)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 193 - quarkus.cache.caffeine.maximum-size = "${SIACC.CACHE.MAXIMUM-SIZE}" (189)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 194 - quarkus.cache.caffeine.expire-after-write = "${SIACC.CACHE.EXPIRE-AFTER-WRITE}" (190)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 195 - quarkus.cache.caffeine.expire-after-access = "${SIACC.CACHE.EXPIRE-AFTER-ACCESS}" (191)
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 196 - SIACC.ADMINISTRATIVE.ENDPOINT = "/health,/healthx,/health,/q/health,/admin,/admin-ui,/config,/admin,/title"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] Define o nivel de log para a categoria org.hibernate como ERROR, exibindo apenas mensagens de erro do Hibernate nos logs.
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 197 - quarkus.log.category."org.hibernate".level = "ERROR"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES DB-SUPORTE -----
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 198 - quarkus.log.console.format = "%d{HH:mm:ss} %-5p[%c{2.}-%t{id}] %s%e%n"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] PERSISTENCIA
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 199 - quarkus.datasource.db-kind = "oracle"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 200 - quarkus.datasource.jdbc.url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=... DICATED)))" [415294251]
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 201 - quarkus.datasource.jdbc.transactions = "xa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 202 - quarkus.datasource.username = "SACCTS01"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 203 - quarkus.datasource.password = "[NAO INFORMADO]"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 204 - quarkus.hibernate-orm.database.default-schema = "ACC"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 205 - quarkus.hibernate-orm.database.generation = "none"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 206 - quarkus.hibernate-orm.scripts.generation = "none "
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 207 - quarkus.hibernate-orm.validate-in-dev-mode = "false"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 208 - quarkus.hibernate-orm.packages = "br.gov.caixa.siacc.pix.suporte.db.entity"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 209 - quarkus.datasource."h2".jdbc.url = "jdbc:h2:mem:default;DB_CLOSE_DELAY=-1;AUTOCOMMIT=ON"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 210 - quarkus.datasource."h2".jdbc.transactions = "xa"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 211 - quarkus.datasource."h2".db-kind = "h2"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 212 - quarkus.hibernate-orm."h2".datasource = "h2"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 213 - quarkus.hibernate-orm."h2".database.generation = "drop-and-create"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 214 - quarkus.hibernate-orm."h2".packages = "br.gov.caixa.siacc.pix.suporte.db.h2.entity"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 215 - SIACC.DATABASE.CHECKCONNECTION.SCHEDUDLE = "0 * * ? * * *"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 216 - SIACC.DEFAULT.CHECKCONNECTION = "SELECT TO_CHAR(SYSDATE) as name FROM dual"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 217 - SIACC.DEFAULT.CHECKINSTANCE = "SELECT sys_context('userenv','instance_name') as name FROM dual"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 218 - SIACC.H2.CHECKCONNECTION = "SELECT TO_CHAR(CURRENT_TIMESTAMP()) as name FROM dual"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 219 - SIACC.H2.CHECKINSTANCE = "SELECT CURRENT_CATALOG();"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 220 - SIACC.H2.SERVER.PORT = "[NAO INFORMADO]"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 221 - quarkus.log.category."org.reflections".level = "ERROR"
12:14:56 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
12:14:58 WARN [io.qu.ag.ru.DataSources-27] Datasource <default> enables XA but transaction recovery is not enabled. Please enable transaction recovery by setting quarkus.transaction-manager.enable-recovery=true, otherwise data may be lost if the application is terminated abruptly
12:14:58 WARN [io.qu.ag.ru.DataSources-27] Datasource h2 enables XA but transaction recovery is not enabled. Please enable transaction recovery by setting quarkus.transaction-manager.enable-recovery=true, otherwise data may be lost if the application is terminated abruptly
12:14:59 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.809071894=/campanha - API Campanha
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1673814368=GET /campanha - Listar campanhas
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.910365308=GET /simulacao/consultaAvancada - Consulta Avançada
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.322695217=POST /simulacao - Inclusão
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1719257660=DELETE /simulacao/{id} - Cancelamento
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.894542850=GET /simulacao/v2/consulta - Consulta V2 cliente/simulacao
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1147689124=GET /simulacao/pendentes - Consulta Simulações Pendentes
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.124585439=GET /simulacao/consulta - Consulta cliente/simulacao
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1555236770=GET /simulacao/download/{idArquivo}/{nomeArquivo} - Download
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1960878984=PUT /simulacao/{id} - Alteração
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1639339222=/situacao - API Situação
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.843547040=GET /situacao - Listar tarifas
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.208571188=/tarifasExcecoes - Tarifas Excecoes
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1834617111=GET /tarifasExcecoes/{nuSimulacaoNegocialConvenio} - (SEM ALIAS)
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.2124697018=POST /simulacao/alcada - Alteração
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.695623964=POST /simulacaoContraProposta - Inclusão
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.47=/ - API Principal
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.404439780=GET /redirect/{id} - Redirecionamento de Ativo de Infra
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.641741694=GET /title - Nome da Aplicação
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.703610225=OPTIONS  - Disponibilidade
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1271185085=GET /ativo/{id} - Ativo de Infra
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.2117903858=/tarifa - API Tarifa
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1316380184=GET /tarifa - Listar tarifas
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.20707231=/unidade - API Unidade
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.890669867=GET /unidade - Listar unidades
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1901380553=/parametros - API Parâmetros
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.445467949=GET /parametros - Listar parâmetros
12:15:01 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1948243029=POST /alcada - Consultar Alçada
12:15:01 INFO [br.go.ca.si.pi.su.se.CustomTenantResolver-1] Listando Tenants OIDC
12:15:02 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
12:15:02 ERROR[or.hi.en.jd.sp.SqlExceptionHelper-1] ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
12:15:02 ERROR[br.go.ca.si.pi.su.db.ReactiveDatabase-1] Falha ao verificar conexão com banco de dados PADRÃO: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/] [n/a]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:54)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:153)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:183)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:155)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.lambda$list$0(JdbcSelectExecutor.java:85)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:231)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:167)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:325)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:115)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:83)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:76)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:65)
	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:138)
	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:621)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:427)
	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:564)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkDatabaseConnection(ReactiveDatabase.java:207)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkConnection(ReactiveDatabase.java:154)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.postConstruct(ReactiveDatabase.java:125)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.doCreate(Unknown Source)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.c95(Unknown Source)
	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.computeIfAbsent(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Observer_onStart_yg7c1rk96xiAULOjLWikDqIgD78.notify(Unknown Source)
	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:346)
	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:328)
	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:82)
	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:155)
	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:106)
	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
	at io.quarkus.runtime.Application.start(Application.java:101)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:111)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
Caused by: java.sql.SQLException: ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:702)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:603)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:598)
	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1795)
	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:866)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:1102)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:456)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:508)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutPassword(T4CTTIoauthenticate.java:2128)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1368)
	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1821)
	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1764)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:976)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.datasource.impl.OracleDataSource.getPhysicalConnection(OracleDataSource.java:707)
	at oracle.jdbc.xa.client.OracleXADataSource.getPooledConnection(OracleXADataSource.java:631)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:225)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnectionInternal(OracleXADataSource.java:268)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:166)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:138)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:231)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:545)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:526)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

12:15:02 ERROR[br.go.ca.si.pi.su.db.ReactiveDatabase-1] Falha ao verificar conexao com o banco: br.gov.caixa.siacc.pix.suporte.exception.SiaccException: Falha ao verificar conexão com banco de dados PADRÃO
	at br.gov.caixa.siacc.pix.suporte.exception.SiaccException$SiaccExceptionBuilder.build(SiaccException.java:24)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkDatabaseConnection(ReactiveDatabase.java:217)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkConnection(ReactiveDatabase.java:154)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.postConstruct(ReactiveDatabase.java:125)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.doCreate(Unknown Source)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Bean.create(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:119)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:38)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:35)
	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.c95(Unknown Source)
	at io.quarkus.arc.generator.Default_jakarta_enterprise_context_ApplicationScoped_ContextInstances.computeIfAbsent(Unknown Source)
	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:35)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase_Observer_onStart_yg7c1rk96xiAULOjLWikDqIgD78.notify(Unknown Source)
	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:346)
	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:328)
	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:82)
	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:155)
	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:106)
	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
	at io.quarkus.runtime.Application.start(Application.java:101)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:111)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/] [n/a]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.connection(StatementPreparerImpl.java:54)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$5.doPrepare(StatementPreparerImpl.java:153)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl$StatementPreparationTemplate.prepareStatement(StatementPreparerImpl.java:183)
	at org.hibernate.engine.jdbc.internal.StatementPreparerImpl.prepareQueryStatement(StatementPreparerImpl.java:155)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.lambda$list$0(JdbcSelectExecutor.java:85)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.executeQuery(DeferredResultSetAccess.java:231)
	at org.hibernate.sql.results.jdbc.internal.DeferredResultSetAccess.getResultSet(DeferredResultSetAccess.java:167)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getMetaData(AbstractResultSetAccess.java:36)
	at org.hibernate.sql.results.jdbc.internal.AbstractResultSetAccess.getColumnCount(AbstractResultSetAccess.java:52)
	at org.hibernate.query.results.ResultSetMappingImpl.resolve(ResultSetMappingImpl.java:193)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.resolveJdbcValuesSource(JdbcSelectExecutorStandardImpl.java:325)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.doExecuteQuery(JdbcSelectExecutorStandardImpl.java:115)
	at org.hibernate.sql.exec.internal.JdbcSelectExecutorStandardImpl.executeQuery(JdbcSelectExecutorStandardImpl.java:83)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:76)
	at org.hibernate.sql.exec.spi.JdbcSelectExecutor.list(JdbcSelectExecutor.java:65)
	at org.hibernate.query.sql.internal.NativeSelectQueryPlanImpl.performList(NativeSelectQueryPlanImpl.java:138)
	at org.hibernate.query.sql.internal.NativeQueryImpl.doList(NativeQueryImpl.java:621)
	at org.hibernate.query.spi.AbstractSelectionQuery.list(AbstractSelectionQuery.java:427)
	at org.hibernate.query.spi.AbstractSelectionQuery.getSingleResult(AbstractSelectionQuery.java:564)
	at br.gov.caixa.siacc.pix.suporte.db.ReactiveDatabase.checkDatabaseConnection(ReactiveDatabase.java:207)
	... 32 more
Caused by: java.sql.SQLException: ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:702)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:603)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:598)
	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1795)
	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:866)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:1102)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:456)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:508)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutPassword(T4CTTIoauthenticate.java:2128)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1368)
	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1821)
	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1764)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:976)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.datasource.impl.OracleDataSource.getPhysicalConnection(OracleDataSource.java:707)
	at oracle.jdbc.xa.client.OracleXADataSource.getPooledConnection(OracleXADataSource.java:631)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:225)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnectionInternal(OracleXADataSource.java:268)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:166)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:138)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:231)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:545)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:526)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

12:15:02 INFO [br.go.ca.si.pi.su.db.ReactiveDatabase-1] Verificando conexão com banco de dados
12:15:02 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
12:15:02 ERROR[or.hi.en.jd.sp.SqlExceptionHelper-1] ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
12:15:02 ERROR[br.go.ca.si.pi.su.db.ReactiveDatabase-1] Falha ao verificar conexão com banco de dados PADRÃO
12:15:02 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
12:15:02 INFO [br.go.ca.si.pi.su.db.Orquestrador-1] Verificando instancias de inicializacao
12:15:02 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - nenhum problema identificado
12:15:02 WARN [io.ag.pool-28] Datasource '<default>': ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
12:15:02 ERROR[or.hi.en.jd.sp.SqlExceptionHelper-1] ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
12:15:02 ERROR[io.qu.ru.Application-1] Failed to start application (with profile [prod]): java.lang.RuntimeException: Failed to start quarkus
	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
	at io.quarkus.runtime.Application.start(Application.java:101)
	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:111)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:71)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:44)
	at io.quarkus.runtime.Quarkus.run(Quarkus.java:124)
	at io.quarkus.runner.GeneratedMain.main(Unknown Source)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.doRun(QuarkusEntryPoint.java:62)
	at io.quarkus.bootstrap.runner.QuarkusEntryPoint.main(QuarkusEntryPoint.java:33)
Caused by: org.hibernate.exception.GenericJDBCException: Unable to acquire JDBC Connection [ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/] [n/a]
	at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:63)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108)
	at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.acquireConnectionIfNeeded(LogicalConnectionManagedImpl.java:116)
	at org.hibernate.resource.jdbc.internal.LogicalConnectionManagedImpl.getPhysicalConnection(LogicalConnectionManagedImpl.java:143)
	at org.hibernate.engine.jdbc.internal.JdbcCoordinatorImpl.coordinateWork(JdbcCoordinatorImpl.java:301)
	at org.hibernate.internal.AbstractSharedSessionContract.doWork(AbstractSharedSessionContract.java:1053)
	at org.hibernate.internal.AbstractSharedSessionContract.doWork(AbstractSharedSessionContract.java:1041)
	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador.validar(Orquestrador.java:74)
	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador.validarAmbiente(Orquestrador.java:63)
	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador.onStart(Orquestrador.java:52)
	at br.gov.caixa.siacc.pix.suporte.db.Orquestrador_Observer_onStart_xIb7RsBJbtZVQvvrHKpw07UiT-o.notify(Unknown Source)
	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:346)
	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:328)
	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:82)
	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:155)
	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:106)
	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
	... 13 more
Caused by: java.sql.SQLException: ORA-01005: null password given; logon denied

https://docs.oracle.com/error-help/db/ora-01005/
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:702)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:603)
	at oracle.jdbc.driver.T4CTTIoer11.processError(T4CTTIoer11.java:598)
	at oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1795)
	at oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:866)
	at oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:1102)
	at oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:456)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:508)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTHWithoutPassword(T4CTTIoauthenticate.java:2128)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1433)
	at oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:1368)
	at oracle.jdbc.driver.T4CConnection.authenticateWithPassword(T4CConnection.java:1821)
	at oracle.jdbc.driver.T4CConnection.authenticateUserForLogon(T4CConnection.java:1764)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:976)
	at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:1157)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:104)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:825)
	at oracle.jdbc.datasource.impl.OracleDataSource.getPhysicalConnection(OracleDataSource.java:707)
	at oracle.jdbc.xa.client.OracleXADataSource.getPooledConnection(OracleXADataSource.java:631)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:225)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnectionInternal(OracleXADataSource.java:268)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:166)
	at oracle.jdbc.xa.client.OracleXADataSource.getXAConnection(OracleXADataSource.java:138)
	at io.agroal.pool.ConnectionFactory.createConnection(ConnectionFactory.java:231)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:545)
	at io.agroal.pool.ConnectionPool$CreateConnectionTask.call(ConnectionPool.java:526)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at io.agroal.pool.util.PriorityScheduledExecutor.beforeExecute(PriorityScheduledExecutor.java:75)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1134)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)




Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIACC-pixautomatico-api-simulador
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
SIACC

SIACC-pixautomatico-api-simulador
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (81)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SIACC-PIXAUTOMATICO-API-SIMULADOR-DES (8)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-DES
Scopes: EC DES
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"/q/health/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
DEBUG
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIACC-PIXAUTOMATICO-API-SIMULADOR
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.JAVA_OPTIONS_APPEND
"-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.SIACC_RATE_LIMITER_ENABLED
true
_ENV.SIACC_RATE_LIMITER_PERIODICIDADE
1M
_ENV.SIACC_RATE_LIMITER_QTDE_REQ_PERMITIDAS
60
SIACC-PIXAUTOMATICO-SUPORTE-DES (56)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-DES
Scopes: EC DES
_ENV.APIM_CONFIG_APIKEY
'${siacc_apikey}'
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=35972efa-bef2-4613-8a3d-a577f9465fb3;IngestionEndpoint=https://brazilsoutheast-0.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsoutheast.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
DEBUG
_ENV.APPLICATIONINSIGHTS_PROXY
http://proxydes.caixa:80
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIACC-API
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
OFF
_ENV.APP_ENV
DES
_ENV.APP_SWAGGER
true
_ENV.APP_SWAGGER_ADMIN
true
_ENV.CLIENT_TIMEOUT
5000
_ENV.JAVA_OPTIONS_APPEND
"-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.NO_PROXY
".caixa,.caixa.gov.br"
_ENV.QUARKUS_OIDC_CLIENT_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_CLIENT_ID
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
'${cliseraccpxa_sso}'
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__TOKEN_REQUIRED_CLAIMS_AZP
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__TOKEN_REQUIRED_CLAIMS_AZP
cli-web-acc
_ENV.QUARKUS_REST_CLIENT_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-des.apps.nprd.caixa
_ENV.QUARKUS_REST_CLIENT_SIACC_CENTRALIZADOR_URL
https://siacc-servicos-api-centralizador-des.apps.nprd.caixa
_ENV.SIACC_API_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-des.apps.nprd.caixa
_ENV.SIACC_API_BATIMENTO_URL
https://siacc-pixautomatico-api-batimento-des.apps.nprd.caixa
_ENV.SIACC_API_CAIXA_URL
https://api.des.caixa:8443
_ENV.SIACC_API_CENTRALIZADOR_URL
https://siacc-servicos-api-centralizador-des.apps.nprd.caixa
_ENV.SIACC_API_CONTROLE_REQUISICOES_URL
https://siacc-pixautomatico-api-controle-requisicoes-des.apps.nprd.caixa
_ENV.SIACC_API_CONVENIO_URL
https://siacc-pixautomatico-api-convenio-des.apps.nprd.caixa
_ENV.SIACC_API_GERENCIADOR_ARQUIVOS_URL
https://siacc-servicos-api-gerenciador-arquivos-des.apps.nprd.caixa
_ENV.SIACC_API_PAGAMENTO_URL
https://siacc-pixautomatico-api-pagamento-des.apps.nprd.caixa
_ENV.SIACC_API_PARAMETROS_URL
https://siacc-pixautomatico-api-parametro-des.apps.nprd.caixa
_ENV.SIACC_API_SIMULADOR_URL
https://siacc-pixautomatico-api-simulador-des.apps.nprd.caixa
_ENV.SIACC_API_WEBHOOK_URL
https://siacc-pixautomatico-api-webhook-des.apps.nprd.caixa
_ENV.SIACC_BATCH_AUDITORIA_URL
https://siacc-pixautomatico-batch-auditoria-des.apps.nprd.caixa
_ENV.SIACC_BATCH_MANUTENCAO_URL
https://siacc-pixautomatico-batch-manutencao-des.apps.nprd.caixa
_ENV.SIACC_BATCH_REMESSA_URL
https://siacc-pixautomatico-batch-remessa-des.apps.nprd.caixa
_ENV.SIACC_BATCH_REPASSE_URL
https://siacc-pixautomatico-batch-repasse-des.apps.nprd.caixa
_ENV.SIACC_CACHE_EXPIRE_AFTER_ACCESS
2m
_ENV.SIACC_CACHE_EXPIRE_AFTER_WRITE
15m
_ENV.SIACC_CACHE_INITIAL_SIZE
50
_ENV.SIACC_CACHE_MAXIMUM_SIZE
500
_ENV.SIACC_FRONTEND_CENTRALIZADOR_URL
https://siacc-servicos-frontend-centralizador-des.apps.nprd.caixa
_ENV.SIACC_FRONTEND_PIXAUTOMATICO_URL
https://siacc-pixautomatico-frontend-des.apps.nprd.caixa
_ENV.SIACC_FRONTEND_SERVICOS_URL
https://siacc-servicos-frontend-des.apps.nprd.caixa
_ENV.SIACC_GENERAL_LOG_LEVEL
DEBUG
_ENV.SIACC_LISTA_CODIGOS_VINCULOS_SOCIOS
6,8,23,32,36,48,49,87
_ENV.SIACC_LOGIN_CLIENT_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SIACC_LOG_LEVEL
DEBUG
_ENV.SIACC_SISPI_WEBHOOK
https://sispi-qrcode-api-webhook-des.apps.pixnprd4.caixa
_ENV.SIACC_SSO_INTERNET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.SIACC_SSO_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SIACC_SSO_INTRANET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.SIACC_SSO_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SICLI_CLIENT_TIMEOUT
10000
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/siacc_des/
SIACC-PIXAUTOMATICO-DB-SUPORTE-DES (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-DES
Scopes: EC DES
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan8.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orad05bc)(SERVER=DEDICATED)))"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${saccds01_oracle}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SACCDS01
SIACC-PIXAUTOMATICO-BT-VAULT-DES (1)
Scopes: EC DES
SIACC-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
SIACC-PIXAUTOMATICO-API-SIMULADOR-TQS (8)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-TQS
Scopes: EC TQS
_ENV.APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
'{"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"/q/health/.*","matchType":"regexp"}],"percentage":0}]}}'
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
DEBUG
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SIACC-PIXAUTOMATICO-API-SIMULADOR-TQS
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
100
_ENV.JAVA_OPTIONS_APPEND
"-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.SIACC_RATE_LIMITER_ENABLED
true
_ENV.SIACC_RATE_LIMITER_PERIODICIDADE
1M
_ENV.SIACC_RATE_LIMITER_QTDE_REQ_PERMITIDAS
60
SIACC-PIXAUTOMATICO-SUPORTE-TQS (46)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-TQS
Scopes: EC TQS
QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
********
_ENV.APIM_CONFIG_APIKEY
l73d2c2aebb40d479083fa48d018530d92
_ENV.APP_ENV
TQS
_ENV.APP_SWAGGER
true
_ENV.APP_SWAGGER_ADMIN
true
_ENV.CLIENT_TIMEOUT
5000
_ENV.JAVA_OPTIONS_APPEND
"-javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks"
_ENV.QUARKUS_OIDC_CLIENT_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_CLIENT_ID
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_SERVICO__TOKEN_REQUIRED_CLAIMS_AZP
cli-ser-acc-pxa
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.QUARKUS_OIDC__SERVICO_INTRANET_WEB__TOKEN_REQUIRED_CLAIMS_AZP
cli-web-acc
_ENV.QUARKUS_REST_CLIENT_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_API_AUDITORIA_URL
https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_API_BATIMENTO_URL
https://siacc-pixautomatico-api-batimento-tqs.apps.nprd.caixa
_ENV.SIACC_API_CAIXA_URL
https://api.des.caixa:8443
_ENV.SIACC_API_CENTRALIZADOR_URL
https://siacc-servicos-api-centralizador-tqs.apps.nprd.caixa
_ENV.SIACC_API_CONTROLE_REQUISICOES_URL
https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa
_ENV.SIACC_API_CONVENIO_URL
https://siacc-pixautomatico-api-convenio-tqs.apps.nprd.caixa
_ENV.SIACC_API_GERENCIADOR_ARQUIVOS_URL
https://siacc-servicos-api-gerenciador-arquivos-tqs.apps.nprd.caixa
_ENV.SIACC_API_PAGAMENTO_URL
https://siacc-pixautomatico-api-pagamento-tqs.apps.nprd.caixa
_ENV.SIACC_API_PARAMETROS_URL
https://siacc-pixautomatico-api-parametro-tqs.apps.nprd.caixa
_ENV.SIACC_API_SIMULADOR_URL
https://siacc-pixautomatico-api-simulador-tqs.apps.nprd.caixa
_ENV.SIACC_API_WEBHOOK_URL
https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_AUDITORIA_URL
https://siacc-pixautomatico-batch-auditoria-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_MANUTENCAO_URL
https://siacc-pixautomatico-batch-manutencao-tqs.apps.nprd.caixa
_ENV.SIACC_BATCH_REPASSE_URL
https://siacc-pixautomatico-batch-repasse-tqs.apps.nprd.caixa
_ENV.SIACC_CACHE_EXPIRE_AFTER_ACCESS
2m
_ENV.SIACC_CACHE_EXPIRE_AFTER_WRITE
15m
_ENV.SIACC_CACHE_INITIAL_SIZE
50
_ENV.SIACC_CACHE_MAXIMUM_SIZE
500
_ENV.SIACC_FRONTEND_CENTRALIZADOR_URL
https://siacc-servicos-frontend-centralizador-tqs.apps.nprd.caixa
_ENV.SIACC_FRONTEND_PIXAUTOMATICO_URL
https://siacc-pixautomatico-frontend-tqs.apps.nprd.caixa
_ENV.SIACC_FRONTEND_SERVICOS_URL
https://siacc-servicos-frontend-tqs.apps.nprd.caixa
_ENV.SIACC_GENERAL_LOG_LEVEL
DEBUG
_ENV.SIACC_LISTA_CODIGOS_VINCULOS_SOCIOS
6,8,23,32,36,48,49,87
_ENV.SIACC_LOGIN_CLIENT_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SIACC_LOG_LEVEL
DEBUG
_ENV.SIACC_SSO_INTERNET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44Rgo/vuhCMImTnLjS49XuTH6GI4lU/CtdzE/qACMO/GUky73m0Uszo2Bh1wNV+fvw/mMQVAGKj6/qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ+0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9/wfL0ikU2pWf0hKjX+PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBwIDAQAB
_ENV.SIACC_SSO_INTERNET_URL
https://logindes.caixa.gov.br/auth/realms/internet
_ENV.SIACC_SSO_INTRANET_PUBLIC_KEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.SIACC_SSO_INTRANET_URL
https://login.des.caixa/auth/realms/intranet
_ENV.SICLI_CLIENT_TIMEOUT
10000
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/siacc_tqs/
_SECRET.QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET
#{QUARKUS_OIDC_CLIENT_CREDENTIALS_SECRET}#
SIACC-PIXAUTOMATICO-DB-SUPORTE-TQS (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-TQS
Scopes: EC TQS
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=1521))(CONNECT_DATA=(SERVICE_NAME=orat07bc)(SERVER=DEDICATED)))"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${saccts01_oracle}'
_ENV.QUARKUS_DATASOURCE_USERNAME
SACCTS01
SIACC-BT-VAULT-SECRET-TQS (2)
Scopes: EC TQS
BT_CLIENT_ID
dec2394b-0702-4d6f-983b-3d09a18ede73
BT_CLIENT_SECRET
********
SIACC-PIXAUTOMATICO-BT-VAULT-TQS (1)

Scopes: EC TQS
BT_SECRETS_LIST
SIACC_TQS/CLISERACC_SSO,SIACC_TQS/CLISERACCPXA_SSO,SIACC_TQS/SACCDB02_MQ_BAIXA,SIACC_TQS/SACCTS01_ORACLE,SIACC_TQS/SACCSD06_MQ_ALTA,SIACC_TQS/SIACC_APIKEY,SIACC_TQS/S739019_PROXY,SIACC_TQS/WEBHOOK_KEYSTORE
SIACC-PIXAUTOMATICO-API-SIMULADOR-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-HMP
Scopes: EC HMP
SIACC-PIXAUTOMATICO-SUPORTE-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-HMP
Scopes: EC HMP
SIACC-PIXAUTOMATICO-DB-SUPORTE-HMP (1)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIACC-PIXAUTOMATICO-API-SIMULADOR-PRD (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-API-SIMULADOR-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-SUPORTE-PRD (56)
Grupo de variáveis de SIACC-PIXAUTOMATICO-SUPORTE-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-DB-SUPORTE-PRD (3)
Grupo de variáveis de SIACC-PIXAUTOMATICO-DB-SUPORTE-PRD
Scopes: EC PRD
SIACC-BT-VAULT-SECRET-PRD (2)
Grupo de variáveis SIACC-BT-VAULT-SECRET-PRD
Scopes: EC PRD
SIACC-PIXAUTOMATICO-BT-VAULT-PRD (1)
Grupo de Variáveis do SIACC-PIXAUTOMATICO-BT-VAULT-PRD
Scopes: EC PRD
|Manage variable groups
Row 23

Row 20

Row 2

Row 20

Row 2

Expanded

Collapsed

26 pipelines found

Select a release pipeline to view its releases

26 pipelines found

Select a release pipeline to view its releases

26 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Select a release pipeline to view its releases

10 pipelines found

Row 10

Row 2

Showing filters 1 through 2

