[POST] 2026-06-19 15:29:39.438 (401)
 
------- URL -------
https://dessp-pmf.mobilidade.caixa.gov.br:443/mfpsp/api/preauth/v1/preauthorize
 
------- REQUEST HEADER -------
"x-wl-analytics-tracking-id" : "47906972-9006-4875-B61B-4619510A030F",
"Accept-Language" : "pt-BR;q=1, en-BR;q=0.9,pt-BR;q=1, en-BR;q=0.9,pt",
"Accept-Encoding" : "gzip, deflate",
"Accept" : "*/*",
"User-Agent" : "ECobranca/1.3.1 (iPhone; iOS 17.5; Scale/3.00),ECobranca/1.3.1 (iPhone; iOS 17.5; Scale/3.00),ECobranca/1.3.1 (iPhone; iOS 17.5; Scale/3.00)/WLNativeAPI/8.0.0.00.2016-01-24T11:48:54Z",
"X-Requested-With" : "XMLHttpRequest",
"Content-Length" : "132",
"Content-Type" : "application/json; charset=utf-8",
"x-mfp-analytics-metadata" : "{\"brand\":\"Apple\",\"osVersion\":\"17.5\",\"appVersionDisplay\":\"1.3.1\",\"os\":\"ios\",\"mfpAppName\":\"br.gov.caixa.ecobrancamobile\",\"clientID\":\"f514c1cc-08bf-4bcc-80ec-2eed1a5c2d3c\",\"mfpAppVersion\":\"1.3.1\",\"appStoreId\":\"br.gov.caixa.ecobrancamobile\",\"appVersionCode\":\"15\",\"deviceID\":\"82652C69-072A-45D2-BA85-7F4149D0DDF0\",\"model\":\"x86_64\",\"appStoreLabel\":\"ECobranca\"}"
 
------- REQUEST -------
{
  "scope" : "acesso_logado appAuthenticity RegisteredClient",
  "client_id" : "f514c1cc-08bf-4bcc-80ec-2eed1a5c2d3c",
  "challengeResponse" : {
 
  }
}
 
------- RESPONSE HEADER -------
"Content-Language" : "en-US",
"x-frame-options" : "deny",
"Content-Type" : "application/json",
"cross-origin-opener-policy" : "same-origin",
"x-azion-edge-location" : "PLU",
"x-xss-protection" : "1; mode=block",
"Www-Authenticate" : "MFP-Challenge",
"x-content-type-options" : "nosniff",
"x-azion-request-id" : "b8a77307ddb4c8dfb27718bb271c317b",
"Set-Cookie" : "__uzmc=7372311865165892; HttpOnly; path=/; Expires=Fri, 18-Dec-26 18:29:39 GMT ; Max-Age=15724800; SameSite=Lax, __uzmd=1781893779; HttpOnly; path=/; Expires=Fri, 18-Dec-26 18:29:39 GMT ; Max-Age=15724800; SameSite=Lax",
"Date" : "Fri, 19 Jun 2026 18:29:39 GMT"
 
------- RESPONSE -------
{
  "challenges" : {
    "SecurityAdapterCaixa" : {
      "expiration" : false,
      "errorMsg" : "\t",
      "appSecCheckViolation" : false
    }
  },
  "successes" : {
    "appAuthenticity" : {
 
    },
    "clockSynchronization" : {
      "serverTimeStamp" : 1781893779567
    }
  }
}
 
------- ERROR -------
Unauthorized
 
------- ERROR DESCRIPTION -------
Client Error :
Authentication is possible but has failed
 
------- RESPONSE SIZE -------
197 bytes
 
------- TOTAL TIME -------
0.115393 (s)
 
------- MIME TYPE -------
application/json


me ajuda pelo amor de DEUS NESSA DEMANDA:


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
SIECO-Android-ORIGINAL
/
SIECO-Android-ORIGINAL 1.4.8 | ID 489556 | Code 271489558
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
SIECO-Android-ORIGINAL

SIECO-Android-ORIGINAL 1.4.8 | ID 489556 | Code 271489558


DES

Succeeded


Pipeline

Tasks

Variables

Logs

Tests
Agent job
Started: 22/06/2026, 13:56:23
Pool:
Mobilidade-Linux
·
Agent: AgentMobile-015

2m 2s

Initialize job
·
succeeded
<1s

Download Artifacts
·
succeeded
2s

Validação de Integridade
·
succeeded
<1s

Log - Branch expirada
·
skipped



Verifica Versão do Pacote no Binario
·
succeeded
<1s

Verifica Versão da Tag no Repositório
·
succeeded
<1s

Build Gradle
·
succeeded
53s

Assinatura do Aplicativo - Android
·
succeeded
2s

Nexus Upload - APP
·
succeeded
1s

Criação de Tag - Version-typeApp-Build
·
succeeded
<1s

Atualiza nome da Release - Android Default
·
succeeded
<1s

Atualiza nome da Release - Android Default
·
succeeded
<1s

Definindo Version no Fortify
·
succeeded
<1s

Checagem de bypass
·
succeeded
<1s

Definindo variáveis Fortify
·
succeeded
<1s

Criando Application no Fortify
·
succeeded
<1s

Criando Version no Fortify
·
succeeded
<1s

Herdando Atributos
·
succeeded
10s

Iniciando Análise no Fortify
·
succeeded
32s

Revogando Token
·
succeeded
<1s

Download App - Nexus
·
succeeded
<1s

Android - Firebase Distribution App
·
succeeded
13s

Finalize Job
·
succeeded
<1s
Collapsed

Expanded

Collapsed

Showing 25 filtered items.

Expanded

Collapsed

Showing 25 filtered items.

Get started and run this pipeline for the first time!

Showing 50 filtered items.

Showing 25 filtered items.

Showing 50 filtered items.

Showing 50 filtered items.

Row 3. Clickable

Row 2. Clickable

10 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Row 4

Row 2

Row 2

ESSA APLICAÇÃO FAZ DEPLOY DIRETO NA LOJA DE APLICATIVOS, nesse caso entendo que an oexiste um servidor para que possamos averigua esse erro paresentado, me ajuda a como vou corrgiri isso.

eu nao tenho acesso nem a plataforma:

Persistent Mobile Foundation
Usuário
Senha
Este usuário não está autorizado a acessar o console.
Efetuar login


acho que essa deamnda na é pertinente de esteiras Devops
