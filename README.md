
foi aberto essa req:

Favor  averiguar e corrigir.

Estamos tomando erro em ambiente DES, conforme imagens anexas.

Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000080824869
Criado em	 23/06/2026 16:56:57
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Em consulta aos logs disponibilizados em sala teams: SIECO TÉCNICO (Spread/Caixa)  informados o que conseguimos verificar foi que o app está falhando no fluxo de autenticação OAuth contra a plataforma da Caixa.

Primeiro request (401): Tenta preautenticação na API
Segundo request (302): Tenta autorização e recebe redirect – mas algo falha no processamento
Resultado: Erro genérico no app: "Houve um erro desconhecido, tente novamente em alguns instantes"

um possível problema seria que o fluxo OAuth está quebrado. O servidor retorna um redirect (302) com um código de autorização, mas o app não consegue processar corretamente.

Algumas possíveis causas:

Certificado de segurança inválido ou expirado
Client ID não autorizado para esse fluxo OAuth
Redirect URI configurado incorretamente no app
Código de autorização expirado ou rejeitado
Política de segurança bloqueando a sequência de requests

Precisamos que o time de Backend/Segurança verifique.

Se o client_id está autorizado para OAuth
Se o redirect_uri está configurado corretamente
Se há restrições de segurança bloqueando esse fluxo

Solicitamos que seja aberto uma nova REQ, com resultado da informações solicitadas acima.


Lembramos que nosso SLA é de 24h após a abertura da REQ e que, conforme orientação da CESTI36, requisições que ultrapassarem esse prazo sem retorno às informações complementares serão encerradas.

Após o encerramento, será necessário registrar uma nova REQ, informando o número da WO finalizada, para fins de continuidade.

Ressaltamos ainda que reaberturas serão novamente encerradas, sendo obrigatório o registro de uma nova REQ conforme orientado acima.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000080824869
Criado em	 23/06/2026 14:50:12
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Em consulta aos logs disponibilizados em sala teams: SIECO TÉCNICO (Spread/Caixa)  informados o que conseguimos verificar foi que o app está falhando no fluxo de autenticação OAuth contra a plataforma da Caixa.

Primeiro request (401): Tenta preautenticação na API
Segundo request (302): Tenta autorização e recebe redirect – mas algo falha no processamento
Resultado: Erro genérico no app: "Houve um erro desconhecido, tente novamente em alguns instantes"

um possível problema seria que o fluxo OAuth está quebrado. O servidor retorna um redirect (302) com um código de autorização, mas o app não consegue processar corretamente.

Algumas possíveis causas:

Certificado de segurança inválido ou expirado
Client ID não autorizado para esse fluxo OAuth
Redirect URI configurado incorretamente no app
Código de autorização expirado ou rejeitado
Política de segurança bloqueando a sequência de requests

Precisamos que o time de Backend/Segurança verifique.

Se o client_id está autorizado para OAuth
Se o redirect_uri está configurado corretamente
Se há restrições de segurança bloqueando esse fluxo


Esse demanda permanecerá pendente até o retorno das verificações solicitadas.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

ID da Ordem de Trabalho	 WO0000080824869
Criado em	 23/06/2026 14:38:09
Criado por	 C125486
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Continua com erro
ID da Ordem de Trabalho	 WO0000080824869
Criado em	 23/06/2026 10:16:05
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Este atendimento segue pendente apenas da validação por parte do demandante.
Informamos que a WO referente à reciclagem  do ambiente de desenvolvimento do SIECO (DES) já foi devidamente atendida.


Dessa forma, o teste foi solicitado ao demandante (Felipe A. Barreto) desde a data 22/06/2026, porém, até o momento, não obtivemos retorno quanto à sua realização.

Permaneceremos no aguardo da execução do teste para continuidade da análise e validação do cenário, considerando que o erro identificado (retorno 401 – Unauthorized, conforme log) poderá ter sido sanado após a reciclagem do ambiente.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000080824869
Criado em	 23/06/2026 09:43:37
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A CAIXA

Conforme verificado a REQ000144610049 mencionada na nota anterior foi atendida pela equipe responsável.

Daremos continuidade ao atendimento.

Informações futuras serão adicionadas conforme evolução do atendimento.

Atte.

Esteira Devops - NPRD
ID da Ordem de Trabalho	 WO0000080824869
Criado em	 22/06/2026 07:32:45
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Esse atendimento será posicionada como pendente, ficando no aguardo do atendimento da REQ000144610049.

Conforme alinhado em reunião via Teams, a referida WO trata da reciclagem (reset) do ambiente de desenvolvimento do SIECO (DES), ação necessária para prosseguimento da análise.

Dessa forma, permaneceremos no aguardo do atendimento e execução dessa atividade, uma vez que o erro identificado (retorno 401 – Unauthorized, conforme log) poderá ser normalizado após a reciclagem do ambiente.

No cenário atual, observa-se que a autenticação é iniciada, porém não concluída com sucesso.

Informamos que o acompanhamento está sendo realizado por Felipe A. Barreto, Flávio Gagliardi e Patricia Vourakis, que também participou da reunião.

Seguiremos monitorando até a conclusão da atividade.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000080824869
Criado em	 19/06/2026 18:10:46
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Prezados,

Esse atendimento será posicionada como pendente, ficando no aguardo do atendimento da REQ000144610049.

Conforme alinhado em reunião via Teams, a referida WO trata da reciclagem (reset) do ambiente de desenvolvimento do SIECO (DES), ação necessária para prosseguimento da análise.

Dessa forma, permaneceremos no aguardo do atendimento e execução dessa atividade, uma vez que o erro identificado (retorno 401 – Unauthorized, conforme log) poderá ser normalizado após a reciclagem do ambiente.

No cenário atual, observa-se que a autenticação é iniciada, porém não concluída com sucesso.

Informamos que o acompanhamento está sendo realizado por Felipe A. Barreto, Flávio Gagliardi e Patricia Vourakis, que também participou da reunião.

Seguiremos monitorando até a conclusão da atividade.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
Impresso por P585600 em Quarta-feira, 24/06/2026 18:15:18


À CAIXA,

Prezados, 

Estamos em sala teams: REQ000144658129/WO0000080862299, aguardando  equipe de backend/segurança realizar a verificação solicitada na REQ anterior:


Precisamos que o time de Backend/Segurança verifique.
Se o client_id está autorizado para OAuth
Se o redirect_uri está configurado corretamente
Se há restrições de segurança bloqueando esse fluxo


Essa demanda permanecerá pendente aguardando a atuação das equipes.


Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

Prezados,

Conforme evidência em anexo, o certificado para dessp-pmf.mobilidade.caixa.gov.br está válido.

Atenciosamente 
HITSS/CEPRO/CN Segurança Cibernética


pessao da segurança ja descatou o certificado.


segue log: 

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


