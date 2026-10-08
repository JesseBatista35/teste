exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.3.jar -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-10-08 14:59:54.665-03:00 ERROR c.m.applicationinsights.agent - 
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
14:59:55 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-internet".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
14:59:55 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-intranet-web".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
14:59:55 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.oidc."servico-intranet-servico".url" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
14:59:55 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.log.category.min-level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
14:59:55 WARN [io.qu.config-1] Unrecognized configuration key "quarkus.log.category.level" was provided; it will be ignored; verify that the dependency extension for this configuration is set or that you did not make a typo
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] LaunchMode NORMAL
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES INTERNAS REFERENCIADAS -----
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 1 - quarkus.application.name = "SIACC-pixautomatico-api-simulador"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 2 - quarkus.application.version = "1.0.0-SNAPSHOT"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 3 - APPLICATION.ID = "[NAO INFORMADO]"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURA ? ?ES API-SIMULADOR -----
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 4 - mp.openapi.extensions.smallrye.info.title = "SIACC PIX AUTOM TICO- API Simulador"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 5 - SIACC.APPLICATION.ID = "siacc-pixautomatico:simulador"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 6 - SIACC.ID.TIPO-SERVICO.PIXAUTOMATICO = "1"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 7 - SIACC.ID.TIPO-SITUACAO.INCLUIDO = "1"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 8 - SIACC.ID.TIPO-SITUACAO.APROVADO = "4"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 9 - SIACC.ID.TIPO-SITUACAO.CANCELADA = "6"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 10 - SIACC.ID.TIPO-SITUACAO.PENDENTE = "2"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 11 - SIACC.ID.TIPO-SITUACAO.PREVISTA = "10"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 12 - SIACC.ID.ALCADA.AGENCIA = "1"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 13 - SIACC.ID.ALCADA.SEV = "2"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 14 - SIACC.ID.ALCADA.SR = "3"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 15 - SIACC.ID.ALCADA.MATRIZ = "4"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 16 - SIACC.ID.ALCADA.CLIENTE = "5"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 17 - SIACC.UNIDADE-SIICO.SIGLA.AGENCIA = "AG"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 18 - SIACC.UNIDADE-SIICO.SIGLA.SEV = "SEV"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 19 - SIACC.UNIDADE-SIICO.SIGLA.SR = "SR"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 20 - SIACC.UNIDADE-SIICO.SIGLA.MATRIZ = "MATRIZ"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 21 - SIACC.REPOSITORIO.DOCUMENTOS.PATH = "/siacc-pagamentos-recebimentos/PIXAUTOMATICO"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURAÇÕES DAS APIS
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ####API BUSCA CONTAS NO SICLI: ####################################
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 22 - cadastro-api.url = "http://api.des.caixa:8080/cadastro/v2"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 23 - cadastro-api.key = "l73d2c2aebb40d479083fa48d018530d92"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 24 - quarkus.rest-client.cadastro-api.url = "${cadastro-api.url}" (22)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 25 - quarkus.rest-client.cadastro-api.scope = "javax.inject.Singleton"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 26 - apim.config.apikey = "${cadastro-api.key}" (23)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ################################################################
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURA  O DO LOG - REMOVER LOG HEALTH CHECK ##
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 27 - quarkus.log.category."org.eclipse.microprofile.health".level = "ERROR"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 28 - quarkus.log.category."io.quarkus.smallrye.health".level = "ERROR"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 29 - quarkus.log.category."org.jboss.resteasy.reactive.server.handlers.RequestHandler".level = "WARN"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 30 - quarkus.log.category."io.vertx.core.http.impl.HttpServerRequestImpl".level = "WARN"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ####
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 31 - SIACC.LOG.LEVEL = "DEBUG"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 32 - quarkus.log.category."br.gov.caixa".level = "${SIACC.LOG.LEVEL}" (31,108)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 33 - quarkus.rest-client.siico-info-privadas.url = "https://api.des.caixa:8443/informacoes-corporativas-privadas"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 34 - quarkus.rest-client.siico-info-publicas.url = "https://api.des.caixa:8443/informacoes-corporativas-publicas"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 35 - SIACC.AUDITORIA.FUNCIONALIDADE = "SIMULADOR-CONVENIO"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] DEV LOCAL
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 36 - SIACC.CLIENT.IDS.CANAIS = "cli-ser-nbc,cli-ser-gcx"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ## RATE LIMITER
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 37 - SIACC.RATE.LIMITER.ENABLED = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 38 - SIACC.RATE.LIMITER.QTDE.REQ.PERMITIDAS = "60"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 39 - SIACC.RATE.LIMITER.PERIODICIDADE = "1M"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 40 - quarkus.rate-limiter.enabled = "${SIACC.RATE.LIMITER.ENABLED}" (37)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 41 - quarkus.rate-limiter.buckets."group1".limits[0].permitted-uses = "${SIACC.RATE.LIMITER.QTDE.REQ.PERMITIDAS}" (38)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 42 - quarkus.rate-limiter.buckets."group1".limits[0].period = "${SIACC.RATE.LIMITER.PERIODICIDADE}" (39)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 43 - quarkus.rate-limiter.buckets."group1".identity-resolver = "br.gov.caixa.siacc.pix.manager.UserIdentityResolver"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ##
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES API-SUPORTE -----
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 44 - app.name = "${quarkus.application.name}" (1)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 45 - app.version = "${quarkus.application.version}" (2)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 46 - app.env = "TQS"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 47 - app.swagger = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 48 - app.swagger.admin = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 49 - SIACC.APPLICATION.ID = "siacc-pixautomatico:simulador"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE API
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 50 - apim.config.apikey = "l73d2c2aebb40d479083fa48d018530d92"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 51 - client.timeout = "5000"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 52 - SIACC.FRONTEND.SERVICOS.URL = "https://siacc-servicos-frontend-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 53 - SIACC.FRONTEND.PIXAUTOMATICO.URL = "https://siacc-pixautomatico-frontend-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 54 - SIACC.FRONTEND.CENTRALIZADOR.URL = "https://siacc-servicos-frontend-centralizador-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 55 - SIACC.API.CENTRALIZADOR.URL = "https://siacc-servicos-api-centralizador-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 56 - SIACC.API.AUDITORIA.URL = "https://siacc-pixautomatico-auditoria-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 57 - SIACC.API.CONVENIO.URL = "https://siacc-pixautomatico-api-convenio-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 58 - SIACC.API.SIMULADOR.URL = "https://siacc-pixautomatico-api-simulador-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 59 - SIACC.API.PARAMETROS.URL = "https://siacc-pixautomatico-api-parametro-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 60 - SIACC.API.CONTROLE.REQUISICOES.URL = "https://siacc-pixautomatico-api-controle-requisicoes-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 61 - SIACC.API.WEBHOOK.URL = "https://siacc-pixautomatico-api-webhook-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 62 - SIACC.API.PAGAMENTO.URL = "https://siacc-pixautomatico-api-pagamento-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 63 - SIACC.API.BATIMENTO.URL = "https://siacc-pixautomatico-api-batimento-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 64 - SIACC.API.GERENCIADOR.ARQUIVOS.URL = "https://siacc-servicos-api-gerenciador-arquivos-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 65 - SIACC.BATCH.AUDITORIA.URL = "https://siacc-pixautomatico-batch-auditoria-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 66 - SIACC.BATCH.MANUTENCAO.URL = "https://siacc-pixautomatico-batch-manutencao-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 67 - SIACC.BATCH.REPASSE.URL = "https://siacc-pixautomatico-batch-repasse-tqs.apps.nprd.caixa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 68 - quarkus.tls.trust-all = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 69 - quarkus.rest-client.siacc-auditoria.url = "${SIACC.API.AUDITORIA.URL}" (56)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 70 - quarkus.rest-client.siacc-convenio.url = "${SIACC.API.CONVENIO.URL}" (57)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 71 - quarkus.rest-client.siacc-simulador.url = "${SIACC.API.SIMULADOR.URL}" (58)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 72 - quarkus.rest-client.siacc-parametros.url = "${SIACC.API.PARAMETROS.URL}" (59)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 73 - quarkus.rest-client.siacc-centralizador.url = "${SIACC.API.CENTRALIZADOR.URL}" (55)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 74 - quarkus.rest-client.siacc-gerenciador-arquivos.url = "${SIACC.API.GERENCIADOR.ARQUIVOS.URL}" (64)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 75 - quarkus.rest-client.siacc-tarifas.url = "${SIACC.BATCH.REPASSE.URL}" (67)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 76 - quarkus.rest-client.connect-timeout = "${client.timeout}" (51)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 77 - quarkus.rest-client.read-timeout = "${client.timeout}" (51)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES JWT
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 78 - SIACC.LOGIN-CLIENT.URL = "${SIACC.SSO.INTRANET.URL}" (82)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 79 - SIACC.SSO.INTERNET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxz8PNmiUW5J1669pWY0APB4flqqDnghAv/QV5DIHyXE39fj9u1DPXbgfDUhUfK0i/B0CHJukbI44R... 4zBwIDAQAB" [-1986508888]
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 80 - SIACC.SSO.INTERNET.URL = "https://logindes.caixa.gov.br/auth/realms/internet"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 81 - SIACC.SSO.INTRANET.PUBLIC-KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe... FDYwIDAQAB" [-234932412]
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 82 - SIACC.SSO.INTRANET.URL = "https://login.des.caixa/auth/realms/intranet"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 83 - quarkus.oidc."servico-internet".url = "${SIACC.SSO.INTERNET.URL}" (80)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 84 - quarkus.oidc."servico-internet".public-key = "${SIACC.SSO.INTERNET.PUBLIC-KEY}" (79)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 85 - quarkus.oidc."servico-intranet-web".url = "${SIACC.SSO.INTRANET.URL}" (82)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 86 - quarkus.oidc."servico-intranet-web".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (81)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 87 - quarkus.oidc."servico-intranet-servico".url = "${SIACC.SSO.INTRANET.URL}" (82)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 88 - quarkus.oidc."servico-intranet-servico".public-key = "${SIACC.SSO.INTRANET.PUBLIC-KEY}" (81)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE CACHE
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 89 - quarkus.cache.caffeine."cacheService".initial-capacity = "50"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 90 - quarkus.cache.caffeine."cacheService".maximum-size = "500"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 91 - quarkus.cache.caffeine."cacheService".expire-after-write = "8H"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 92 - quarkus.cache.caffeine."cacheService".expire-after-access = "8H"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE SEGURANCA DO CLIENTE
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE SEGURANCA DO CLIENTE
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 93 - quarkus.oidc-client.auth-server-url = "https://login.des.caixa/auth/realms/intranet"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 94 - quarkus.oidc-client.client-id = "cli-ser-acc-pxa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 95 - quarkus.oidc-client.credentials.secret = "[hash:4eba39da681cee1ddb62d761588688cbca1df7d9a12939befe28fcbf702393a1]"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE SEGURANCA ADMINISTRATIVA
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 96 - SIACC.ADMIN.ROLES = "SPI_PAGAMENTOS,ACC_ADMIN"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 97 - SIACC.ADMIN.PATH = "/admin/*"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 98 - quarkus.http.auth.policy.role-admin.roles-allowed = "${SIACC.ADMIN.ROLES}" (96)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 99 - quarkus.http.auth.permission.administration.paths = "${SIACC.ADMIN.PATH}" (97)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 100 - quarkus.http.auth.permission.administration.policy = "role-admin"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 101 - quarkus.http.auth.permission.permit1.paths = "/admin/swagger,/admin/authorization"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 102 - quarkus.http.auth.permission.permit1.policy = "permit"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HTTP DE LOG
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 103 - quarkus.log.console.format = "%d{HH:mm:ss} %-5p[%c{2.}-%t{id}] %s%e%n"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 104 - quarkus.log.category."org.jboss.resteasy.reactive.client".level = "ERROR"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 105 - SIACC.GENERAL.LOG.LEVEL = "DEBUG"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 106 - quarkus.log.category.level = "${SIACC.GENERAL.LOG.LEVEL}" (105)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 107 - quarkus.log.category.min-level = "${SIACC.GENERAL.LOG.LEVEL}" (105)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 108 - SIACC.LOG.LEVEL = "DEBUG"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 109 - quarkus.log.category."br.gov.caixa".level = "${SIACC.LOG.LEVEL}" (31,108)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 110 - quarkus.log.category."br.gov.caixa".min-level = "${SIACC.LOG.LEVEL}" (31,108)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DA APLICACAO
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 111 - quarkus.http.root-path = "/"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 112 - quarkus.http.cors = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 113 - quarkus.http.cors.origins = "*"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 114 - quarkus.smallrye-health.ui.enable = "false"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 115 - quarkus.smallrye-health.root-path = "//healthx"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 116 - quarkus.health.extensions.enabled = "false"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 117 - quarkus.http.ssl.protocols = "TLSv1.2"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 118 - properties.hash.seed = "167243864789133"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 119 - SIACC.PROPERTIES.FILE = "application.properties"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 120 - SIACC.PROPERTIES.SOURCE = "target/classes/"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 121 - SIACC.PROPERTIES.MAXLENGTH = "160"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 122 - SIACC.PROPERTIES.SHOWCOMPACT = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 123 - SIACC.PROPERTIES.SHOWHASH = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 124 - SIACC.PROPERTIES.SHOWORIGINAL = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 125 - SIACC.PROPERTIES.SHOWINDEX = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 126 - SIACC.PROPERTIES.CUTOFF = "10"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 127 - SIACC.PROPERTIES.PATTERN = "\$\{(.*?)\}"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 128 - SIACC.AUDITORIA.FUNCIONALIDADE = "SIMULADOR-CONVENIO"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 129 - SIACC.SWAGGER.PROXY.URL = "http://localhost:8080/swagger/{tag}"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 130 - SIACC.TAG = "{tag}"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DO SWAGGER
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 131 - quarkus.swagger-ui.always-include = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 132 - quarkus.smallrye-openapi.always-run-filter = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 133 - quarkus.smallrye-openapi.path = "/swagger"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 134 - quarkus.swagger-ui.path = "/swagger-ui"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 135 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 136 - mp.openapi.extensions.smallrye.info.title = "SIACC PIX AUTOM TICO- API Simulador"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 137 - mp.openapi.extensions.smallrye.info.name = "${APPLICATION.ID}" (3)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 138 - mp.openapi.extensions.smallrye.info.description = "Servico para SIACC-pixautomatico-api-simulador"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 139 - mp.openapi.extensions.smallrye.info.version = "${app.version}" (45)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 140 - mp.openapi.filter = "br.gov.caixa.siacc.pix.suporte.helper.OpenAPIFilter"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 141 - mp.openapi.extensions.smallrye.info.contact.email = "suporte@caixa.gov.br"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 142 - mp.openapi.extensions.smallrye.info.contact.name = "Suporte"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE DEPENDENCIAS
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 143 - SIACC.DEPENDENCY.SCHEDULE = "0/10 * * ? * * *"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 144 - SIACC.DEPENDENCY.INITIAL-DELAY = "5000"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 145 - SIACC.DEPENDENCY.AUDITORIA.MONITOR = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 146 - SIACC.DEPENDENCY.SSO.MONITOR = "false"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] RESOURCES
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 147 - SIACC.APISERVICE.AVAILABLE = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] MENSAGENS DE RESPOSTA PADRAO
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 148 - SIACC.API.UNAVAILABLE.MESSAGE = "Serviço temporariamente indisponível"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 149 - SIACC.API.UNAVAILABLE.DESCRIPTION = "Tente novamente em alguns instantes"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 150 - SIACC.API.BADREQUEST.MESSAGE = "A requisição recebida não é válida"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 151 - SIACC.API.BADREQUEST.DESCRIPTION = "verifique e tente novamente: {}"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 152 - SIACC.API.UNAUTHORIZED.MESSAGE = "Acesso não autorizado"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 153 - SIACC.API.UNAUTHORIZED.DESCRIPTION = "Verifique suas credenciais e tente novamente"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 154 - SIACC.API.FORBIDDEN.MESSAGE = "Você não possui acesso a este recurso"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 155 - SIACC.API.FORBIDDEN.DESCRIPTION = "Verifique suas credenciais e tente novamente"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 156 - SIACC.API.AUTHENTICATIONFAIL.MESSAGE = "Falha de autenticação"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 157 - SIACC.API.AUTHENTICATIONFAIL.DESCRIPTION = "Verifique suas credenciais e tente novamente"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 158 - SIACC.API.INTERNALERROR.MESSAGE = "No momento não foi possível processar sua requisição"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 159 - SIACC.API.INTERNALERROR.DESCRIPTION = "Solicitamos que tente novamente em alguns instantes"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 160 - SIACC.API.EXCEPTION.LOGALL = "false"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 161 - SIACC.EXCEPTION.ON.RESPONSE = "false"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 162 - SIACC.CONFIG.PROPERTIES."APPLICATION".source = "/application.properties"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 163 - SIACC.CONFIG.PROPERTIES."API-SUPORTE".source = "META-INF/application.api.properties"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] HEALTH CUSTOM PROPERTIES
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] DEV LOCAL
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] SWAGGER / OPENAPI
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 164 - quarkus.swagger-ui.always-include = "true"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 165 - quarkus.smallrye-openapi.store-schema-directory = "target/swagger/"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 166 - quarkus.smallrye-openapi.path = "/swagger"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 167 - quarkus.swagger-ui.path = "/swagger-ui"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 168 - quarkus.smallrye-openapi.info-title = "SIACC PIX AUTOM TICO- API Simulador"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 169 - quarkus.smallrye-openapi.info-version = "${app.version}" (45)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 170 - quarkus.smallrye-openapi.info-description = "Modelo padrão de pagamento PIX Automático."
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 171 - quarkus.smallrye-openapi.info-contact-email = "contato@caixa.gov.br"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 172 - quarkus.smallrye-openapi.info-contact-name = "contato"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 173 - quarkus.devservices.enabled = "false"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 174 - SIACC.API.CAIXA.URL = "https://api.des.caixa:8443"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 175 - SIACC.API.DES.CAIXA.URL = "${SIACC.API.CAIXA.URL}" (174)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 176 - SICLI.CLIENT.TIMEOUT = "10000"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 177 - quarkus.rest-client.sicli.url = "https://api.des.caixa:8443/cadastro"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 178 - quarkus.rest-client.sicli.connect-timeout = "${SICLI.CLIENT.TIMEOUT}" (176)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 179 - quarkus.rest-client.sicli.read-timeout = "${SICLI.CLIENT.TIMEOUT}" (176)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 180 - quarkus.rest-client.sicow.url = "https://api.des.caixa:8443/pesquisa-cadastral/v1"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 181 - quarkus.rest-client.nsgd-api.url = "https://api.des.caixa:8443/conta-deposito/consulta-conta"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 182 - quarkus.rest-client.siico-info-privadas.url = "https://api.des.caixa:8443/informacoes-corporativas-privadas"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 183 - quarkus.rest-client.dict.url = "https://api.des.caixa:8443/transacoes-financeiras/pagamentos-instantaneos/dict-estatistica/v2/estatisticas"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 184 - SIACC.LISTA.CODIGOS.VINCULOS.SOCIOS = "6,8,23,32,36,48,49,87"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 185 - SIACC.IMPEDIMENTOS.SICOW = "empregados_trabalho_escravo,informacoes_seguranca,pld,proibido_contratar_setor_publico"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DE PROXY
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 186 - PROXY.HOST = "[NAO INFORMADO]"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 187 - PROXY.PORT = "[NAO INFORMADO]"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] Definicoes de variaveis para o cache
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 188 - SIACC.CACHE.INITIAL-SIZE = "50"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 189 - SIACC.CACHE.MAXIMUM-SIZE = "500"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 190 - SIACC.CACHE.EXPIRE-AFTER-WRITE = "15m"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 191 - SIACC.CACHE.EXPIRE-AFTER-ACCESS = "2m"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] CONFIGURACOES DO QUARKUS CACHE CAFFEINE
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 192 - quarkus.cache.caffeine.initial-capacity = "${SIACC.CACHE.INITIAL-SIZE}" (188)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 193 - quarkus.cache.caffeine.maximum-size = "${SIACC.CACHE.MAXIMUM-SIZE}" (189)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 194 - quarkus.cache.caffeine.expire-after-write = "${SIACC.CACHE.EXPIRE-AFTER-WRITE}" (190)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 195 - quarkus.cache.caffeine.expire-after-access = "${SIACC.CACHE.EXPIRE-AFTER-ACCESS}" (191)
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 196 - SIACC.ADMINISTRATIVE.ENDPOINT = "/health,/healthx,/health,/q/health,/admin,/admin-ui,/config,/admin,/title"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] Define o nivel de log para a categoria org.hibernate como ERROR, exibindo apenas mensagens de erro do Hibernate nos logs.
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 197 - quarkus.log.category."org.hibernate".level = "ERROR"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] ----- CONFIGURACOES DB-SUPORTE -----
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 198 - quarkus.log.console.format = "%d{HH:mm:ss} %-5p[%c{2.}-%t{id}] %s%e%n"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] PERSISTENCIA
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 199 - quarkus.datasource.db-kind = "oracle"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 200 - quarkus.datasource.jdbc.url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=off)(ADDRESS=(PROTOCOL=TCP)(HOST=cnpexdadvm01-scan11.extra.caixa.gov.br)(PORT=... DICATED)))" [415294251]
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 201 - quarkus.datasource.jdbc.transactions = "xa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 202 - quarkus.datasource.username = "SACCTS01"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 203 - quarkus.datasource.password = "[hash:440acf077f96be9cc4e0b40804acebc81f19bdc723a2b0c27f06458e22bbd016]"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 204 - quarkus.hibernate-orm.database.default-schema = "ACC"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 205 - quarkus.hibernate-orm.database.generation = "none"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 206 - quarkus.hibernate-orm.scripts.generation = "none "
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 207 - quarkus.hibernate-orm.validate-in-dev-mode = "false"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 208 - quarkus.hibernate-orm.packages = "br.gov.caixa.siacc.pix.suporte.db.entity"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 209 - quarkus.datasource."h2".jdbc.url = "jdbc:h2:mem:default;DB_CLOSE_DELAY=-1;AUTOCOMMIT=ON"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 210 - quarkus.datasource."h2".jdbc.transactions = "xa"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 211 - quarkus.datasource."h2".db-kind = "h2"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 212 - quarkus.hibernate-orm."h2".datasource = "h2"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 213 - quarkus.hibernate-orm."h2".database.generation = "drop-and-create"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 214 - quarkus.hibernate-orm."h2".packages = "br.gov.caixa.siacc.pix.suporte.db.h2.entity"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 215 - SIACC.DATABASE.CHECKCONNECTION.SCHEDUDLE = "0 * * ? * * *"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 216 - SIACC.DEFAULT.CHECKCONNECTION = "SELECT TO_CHAR(SYSDATE) as name FROM dual"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 217 - SIACC.DEFAULT.CHECKINSTANCE = "SELECT sys_context('userenv','instance_name') as name FROM dual"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 218 - SIACC.H2.CHECKCONNECTION = "SELECT TO_CHAR(CURRENT_TIMESTAMP()) as name FROM dual"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 219 - SIACC.H2.CHECKINSTANCE = "SELECT CURRENT_CATALOG();"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 220 - SIACC.H2.SERVER.PORT = "[NAO INFORMADO]"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1] 221 - quarkus.log.category."org.reflections".level = "ERROR"
14:59:59 INFO [br.go.ca.si.pi.su.ut.InMemoryConfigSource-1]  
15:00:01 WARN [io.qu.ag.ru.DataSources-26] Datasource <default> enables XA but transaction recovery is not enabled. Please enable transaction recovery by setting quarkus.transaction-manager.enable-recovery=true, otherwise data may be lost if the application is terminated abruptly
15:00:01 WARN [io.qu.ag.ru.DataSources-26] Datasource h2 enables XA but transaction recovery is not enabled. Please enable transaction recovery by setting quarkus.transaction-manager.enable-recovery=true, otherwise data may be lost if the application is terminated abruptly
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.809071894=/campanha - API Campanha
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1673814368=GET /campanha - Listar campanhas
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.910365308=GET /simulacao/consultaAvancada - Consulta Avançada
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.322695217=POST /simulacao - Inclusão
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1719257660=DELETE /simulacao/{id} - Cancelamento
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.894542850=GET /simulacao/v2/consulta - Consulta V2 cliente/simulacao
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1147689124=GET /simulacao/pendentes - Consulta Simulações Pendentes
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.124585439=GET /simulacao/consulta - Consulta cliente/simulacao
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1555236770=GET /simulacao/download/{idArquivo}/{nomeArquivo} - Download
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1960878984=PUT /simulacao/{id} - Alteração
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1639339222=/situacao - API Situação
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.843547040=GET /situacao - Listar tarifas
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.208571188=/tarifasExcecoes - Tarifas Excecoes
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1834617111=GET /tarifasExcecoes/{nuSimulacaoNegocialConvenio} - (SEM ALIAS)
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.2124697018=POST /simulacao/alcada - Alteração
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.695623964=POST /simulacaoContraProposta - Inclusão
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.47=/ - API Principal
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.404439780=GET /redirect/{id} - Redirecionamento de Ativo de Infra
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.641741694=GET /title - Nome da Aplicação
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.703610225=OPTIONS  - Disponibilidade
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1271185085=GET /ativo/{id} - Ativo de Infra
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.2117903858=/tarifa - API Tarifa
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1316380184=GET /tarifa - Listar tarifas
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.20707231=/unidade - API Unidade
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.890669867=GET /unidade - Listar unidades
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1901380553=/parametros - API Parâmetros
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.445467949=GET /parametros - Listar parâmetros
15:00:05 INFO [br.go.ca.si.pi.su.ho.ApiHolder-1] SIACC.APISERVICE.1948243029=POST /alcada - Consultar Alçada
15:00:05 INFO [br.go.ca.si.pi.su.se.CustomTenantResolver-1] Listando Tenants OIDC
15:00:05 INFO [br.go.ca.si.pi.su.db.ReactiveDatabase-1] Verificando conexão com banco de dados
15:00:05 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
15:00:05 INFO [br.go.ca.si.pi.su.db.Orquestrador-1] Verificando instancias de inicializacao
15:00:05 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - nenhum problema identificado
15:00:05 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
15:00:05 INFO [br.go.ca.si.pi.su.db.Orquestrador-1] Verificando 69 entidades Oracle
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - nenhum problema identificado
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1] Inicializando 29 entidades Oracle
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoArquivoRemessa...
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoContaAlteracaoConvenio...
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando SituacaoContabil...
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando ItemSimulacao...
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando SituacaoLiquidacao...
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoAcaoSolicitacaoAlteracaoConvenio...
15:00:07 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoItemConvenio...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoParametro...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando SituacaoRemessa...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando SituacaoRepasse...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoTarifaLiquidacao...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoRepasse...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoOrigem...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando DocumentoSimulacaoAlcada...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoSituacaoAlteracaoConvenio...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoServico...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando Alcada...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando SituacaoItemRemessa...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoNotificacao...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoItemRemessa...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando HistoricoParametro...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoSituacao...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoOperacao...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoGrupoParametro...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando MetodoItemRemessa...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoItemSimulacao...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando Parametro...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoTarifa...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando ItemConvenio...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1] Verificando 4 entidades H2
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - nenhum problema identificado
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1] Inicializando 2 entidades H2
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando Agente...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  - iniciando TipoItemConvenio...
15:00:08 INFO [br.go.ca.si.pi.su.db.Orquestrador-1]  
15:00:08 INFO [br.go.ca.si.pi.su.Application-1] Aplicação: SIACC-pixautomatico-api-simulador
15:00:08 INFO [br.go.ca.si.pi.su.Application-1] Versão: 1.0.0-SNAPSHOT
15:00:09 INFO [br.go.ca.si.pi.su.Application-1] Host: SIACC-pixautomatico-api-suporte - 1.0.179-SNAPSHOT
15:00:09 INFO [br.go.ca.si.pi.su.Application-1] JDK: 17.0.7
15:00:09 INFO [br.go.ca.si.pi.su.Application-1] Log Handler Maven Embedder
15:00:09 INFO [br.go.ca.si.pi.su.Application-1] Log Vendor The Apache Software Foundation-3.9.6
15:00:09 INFO [br.go.ca.si.pi.su.Application-1] Inicializando...
15:00:09 INFO [br.go.ca.si.pi.su.Application-1] Default Charset: UTF-8
15:00:09 INFO [br.go.ca.si.pi.su.se.DependencyMonitorService-1] Registrando dependencia API-Auditoria
15:00:09 INFO [br.go.ca.si.pi.su.mo.DependencyMonitor-1] Iniciando monitoramento de API-Auditoria
15:00:09 INFO [br.go.ca.si.pi.su.se.DependencyMonitorService-1] Executando verificação inicial de dependência...
15:00:09 INFO [br.go.ca.si.pi.su.se.DependencyMonitorService-1] Verificando dependência API-Auditoria (null):OK
15:00:09 INFO [io.quarkus-1] SIACC-pixautomatico-api-simulador 1.0.0-SNAPSHOT on JVM (powered by Quarkus 3.8.3) started in 14.665s. Listening on: http://0.0.0.0:8080
15:00:09 INFO [io.quarkus-1] Profile prod activated. 
15:00:09 INFO [io.quarkus-1] Installed features: [agroal, bucket4j, cache, cdi, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-h2, jdbc-oracle, jdbc-postgresql, mailer, narayana-jta, oidc, oidc-client, qute, rest-client-reactive, rest-client-reactive-jackson, resteasy-reactive, resteasy-reactive-jackson, scheduler, security, smallrye-context-propagation, smallrye-health, smallrye-openapi, swagger-ui, vertx]
15:00:10 INFO [br.go.ca.si.pi.su.Application-38] APPLICATION-STATUS READY



Skip to main content
projetos
/
Caixa
/
Pipelines
/
Releases
/
SIACC-pixautomatico-api-simulador
/
SIACC-pixautomatico-api-simulador-1.3.2.2(7)
Search








SIACC-pixautomatico-api-simulador

SIACC-pixautomatico-api-simulador-1.3.2.2(7)


EC TQS

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 08/10/2026, 14:58:21
Pool:
Release-Linux
·
Agent: cadsvaprlx071.intra.caixa.gov.br

2m 35s

Initialize job
·
succeeded
1s

Pre-job: Download secure file
·
succeeded
<1s

Download Artifacts
·
succeeded
1 warning
<1s

Exportando as variáveis do arquivo Trust Store
·
succeeded
<1s

Recuperando nome do repositório
·
succeeded
1s

Convertendo Minúsculo e Definindo nome do Projeto/Repositório
·
succeeded
<1s

Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-logs
·
succeeded
1s

Cria Streams Graylog
·
succeeded
4s

Recupera VEC
·
succeeded
1s

VEC - Aferição
·
succeeded
<1s

Login OpenShift
·
succeeded
1s

Exportando Variáveis de Ambiente "_ENV."
·
succeeded
<1s

Criando novo Projeto
·
succeeded
2s

Adicionando ISTIO_INJECTION
·
skipped


Criando nova APP
·
succeeded
1s

Atualizando Variáveis de Ambiente
·
succeeded
15s

Criando Rota Customizada
·
succeeded
<1s

Aplicando Service Mesh
·
skipped


Git clone https://devops.caixa/projetos/Infraestrutura/_git/esteira-beyondtrust-check
·
succeeded
1s

Create BT Secret
·
succeeded
1s

Create BT Shared Volume
·
succeeded
<1s

Create BT Sidecar
·
succeeded
1s

Create Secret Check Script
·
succeeded
1s

Create Secret Check
·
succeeded
1s

Create BT App Mount Volume
·
succeeded
2s

Exporta Variáveis de Ambiente "_SECRET."
·
succeeded
<1s

Alterando valores placeholder no exec_secret.sh
·
succeeded
<1s

Criando Secrets
·
succeeded
1s

Vinculando Secrets
·
succeeded
1s

Adicionando Multiplas Secrets
·
succeeded
2s

Executando Tag na Imagem do ambiente de build OKD3, OKD4 e OCP
·
succeeded
22s

Concedendo Acesso OKD
·
succeeded
1s

Verificando IP de Saída
·
succeeded
1s

Configurando IP de Saída - deployment
·
skipped


Configurando IP de Saída - deploymentconfig
·
succeeded
1s

Cadastrando no Portal IIF
·
succeeded
<1s

Verificando Status do Deployment
·
succeeded
43s

Logs da Aplicação
·
succeeded
1s

Resumo da Release
·
succeeded
1s

Coletando dados da imagem
·
succeeded
25s

Atualizando versão no PortalIF
·
succeeded
<1s

Realizando Logout OKD
·
succeeded
1s

Finalize Job
·
succeeded
<1s
Showing filters 1 through 2

Showing filters 1 through 2

EC TQSDeploy release

1 pipelines found

1 pipelines found

Showing filters 1 through 2

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2

Showing 17 deployments

Expanded

Row 7

Collapsed

Row 2

EC TQSDeploy release

Expanded

Row 3

Collapsed

Row 2



me ajda a fechar a demanda com todos os modlos mencioansd na req normalizados


