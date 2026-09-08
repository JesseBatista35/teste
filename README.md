quero ver se a aplicação tá fazendo tls direitin, aí vou montar aq no pc para testar
 
back: https://github.com/caixagithub/sigaq-api-gestao-documental
Front: https://github.com/caixagithub/sigaq-front-gestor-mfe-temporalidade
Mateus Barreto Nobrega de Lucena
e a que tá no github?
 
Adriano Vale de Oliveira
back: https://github.com/caixagithub/sigaq-api-gestao-documental Front: https://github.com/caixagithub/sigaq-front-gestor-mfe-temporalidade
Mateus Barreto
 
Adriano Vale de Oliveira
Mateus Barreto
opa, foi mal, vi agora, acredito que hoje consigo ver
 
Alexandre Priori Rech Lincoln Caetano Dias
 
vi agora aqui e estou com uma suspeita do que seja, tem algum dev com ambiente já montado? se n tiver, me passa o application.properties já preenchido que monto aqui e testo 
 
Adriano Vale de Oliveira
 
se puder ligar é até mais rápido, pq já testa logo e a gente dirime essa dúvida de uma vez
 
podemos Mateus Barreto?
 
quinta-feira 13:39 Reunião iniciada

 
Leonardo Ferreira consegue entrar?
 
{

  "Logging": {

    "LogLevel": {

      "Default": "Information",

      "Microsoft.AspNetCore": "Warning",

      "SIGAC-API-GESTAO-ARQUIVISTICA": "Debug"

    },

    "Console": {

      "IncludeScopes": false

    }

  },

  "Cors": ["http://localhost", "http://localhost:4200", "https://sigaq.des.caixa"],

  "AzureMonitor": {

    "ConnectionString": "<>"

  },

  "Auditoria": {

    "EventHubName": "eh-sipdd-des",

    "EhTrilhaAuditoriaSender": "<>",

    "NomeAplicacao": "API-Gestao-Arquivistica-DES"

  },

  "ConnectionStrings": {

    "ConnectionStringSqlite": "Data Source=banco_teste.db;",

    "ConnectionStringSqlServer": "Server=tcp:mssqlsrv-sipdd-des.database.windows.net,1433;Initial Catalog=mssqldb-01-sigaq-des;Persist Security Info=False;User ID=sigaq01des;Password=rB9A09387MK<;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;"

  },

  "BlobStorage": {

    "Container": "documentos",

    "MaxSizeBytes": 20971520,

    "AllowedExtensions": ["pdf"]

  },

  "SSO": {

    "ClientId": "cli-ser-gdd2",

    "ClientSecret": "e122d526-8d6d-4e02-8a44-d5992911ba9e",

    "GrantType": "client_credentials",

    "TokenURI": "https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token"

  },

  "SIECM": {

    "MaxSizeBytes": 20971520,

    "Url": "https://siecm.des.caixa/siecm-web/",

    "UrlMetaDados": "https://siecm-middleware-des.apps.nprd.caixa/v3/modelos/metadados",

    "localArmazenamento": "OS_SIECMTESTE",

    "localGravacao": "PADRAO",

    "ParticulaIncluir": "ECM/v1/documentos/incluir",

    "ParticulaConsultar": "ECM/v1/documentos/consultar",

    "UrlIBMRecords": "https://siecm-middleware-des.apps.nprd.caixa/file-plans"

  },

    "SIICO":{

    "URL": "https://api.des.caixa:8443/informacoes-corporativas-privadas",

    "APIKEY": "l7ee3b22da39464cea9fa42ea797deb6b2"

  },

    "SIICO-PUB":{

    "URL": "https://api.des.caixa:8443/informacoes-corporativas-publicas",

    "APIKEY": "l7ee3b22da39464cea9fa42ea797deb6b2"

  },

  "Normas":{

    "URL": "https://api.des.caixa:8443/normas/api",

    "APIKEY": "l79e4b5776a0c94301b456f92d8dccd004"

  },

  "AzureStorage": {

    "ConnectionString": ""

  },

  "ServicesConfig": {

    "UrlApim": "<>",

    "SiecmHostConsultaDocumento": "https://siecm.des.caixa/siecm-web/ECM/v1/documentos/consultar",

    "ApiKey": "fake-api-key"

  },

  "TimeoutConfig": {

    "TimeoutDocumentoMilissegundos": 3000

  },

  "AllowedHosts": "*",

  "Swagger": {

    "Title": "API-Gestao-Arquivistica",

    "Version": "v1",

    "Description": "API de projeto da GA002 - Gestão Documental",

    "Contact": {

      "Name": "BPGAR",

      "Email": "bpgar@caixa.gov.br",

      "Url": "https://github.com/caixagithub/sigaq-api-gestao-documental"

    }

  },

  "Tkn": {

    "issuers": [

      "https://loginxdes.caixa.gov.br/auth/realms/r_inter_siper",

      "https://logindes.caixa.gov.br/auth/realms/internet",

      "https://login.des.caixa/auth/realms/intranet"

    ],

    "auds": [

      "cli-mob-nbc",

      "cli-mob-nbm",

      "cli-ser-gdd2",

      "account",

      "cli-web-gaq"

    ],

    "azp": [

      "cli-mob-nbc",

      "cli-mob-nbm",

      "cli-ser-gdd2",

      "cli-web-gaq"

    ],

    "keySiper": {

      "kid": "D7vwapy4nFkJCDSLTJie32lid7Y2KxigG2aS3LDp0cY",

      "kty": "RSA",

      "alg": "RS256",

      "use": "sig",

      "n": "1MQe98fwVaE-TfZTsaqz1SLMaLVE6xaW9zy1E3cB5FoiwRBOuvtvWHGdXGdVH_KwIzjCD8B026kJwblg8ABGkKWDf3v9vrPUQ5HMyZNHuCsFMBn-bVquWTydRDZtcEIFEwhn5X87eaULcfCgxqWLTWEeXLDK5whuyRznyLXEBnEazbAiNRRLEQsBbJxzw49sXUZO9VBHBGegO4lFrWpfNYmENG_99nfO4_KHNrr5DnmM5cPgylL0AIuqSU3mQUpVw3zL9z6F4Lblq4dmpcKtNlA7jPVOLH7L8gYqqhPulFxzvMjmU-e9sxvIfA4ZNagLRT_ppHqGB_wTzkD65SdjcQ",

      "e": "AQAB"

    },

    "keyCaixaTem": {

      "kid": "olg3hbVEM3_gRt1DdpXMwOXtS-E2MQQDb0Bhw6IvZdo",

      "kty": "RSA",

      "alg": "RS256",

      "use": "sig",

      "n": "xz8PNmiUW5J1669pWY0APB4flqqDnghAv_QV5DIHyXE39fj9u1DPXbgfDUhUfK0i_B0CHJukbI44Rgo_vuhCMImTnLjS49XuTH6GI4lU_CtdzE_qACMO_GUky73m0Uszo2Bh1wNV-fvw_mMQVAGKj6_qXjSB9npRZKydoXnwGPIepcrqF6KkMJIFtZ-0w35J9SYwgLNezUbAJgs9dq3yMj4ussSfxMFcUC9UKziJJSg0UQfl0fOQGMsrsnUbS2GgXeDqdskbZq9_wfL0ikU2pWf0hKjX-PXtqZI0SVWurVyydc0efbTE7qIlrwF8lWZ8NZ8zcV2oVk7TjoIktZ4zBw",

      "e": "AQAB"

    },

    "keyServico": {

      "kid": "MFeJ65_D-xqNy3VmkMHoMVKScfP7KmYk7mV0Ih5mkAw",

      "kty": "RSA",

      "alg": "RS256",

      "use": "sig",

      "n": "zcYY_UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU-Ot-g1Pgwjze944ATUjZogEMko6jvqqUGTt_Nt64yCCIaMaTB119vOBExQim7vPHNe_o7hLxh6VBYINxFA_esxjz8j28_uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0--xfJ0jFYxQWs1jxhlfXdqr8NE5vfA_RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYw",

      "e": "AQAB"

    }

  }

}

 
 
https://sigda-api.esteiras.des.caixa/
 
 
eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiI5YzdkZjYzOC0wZmZiLTQ2OGYtYWZlMS1jMTlmOWY3NGQ0MTMiLCJleHAiOjE3ODg0NTQ1NzcsIm5iZiI6MCwiaWF0IjoxNzg4NDU0Mjc3LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsInN1YiI6ImMwZGNlMTY2LWNkOTctNDlkMi05ZjY5LWIzNGZmNzI3OTY3MSIsInR5cCI6IkJlYXJlciIsImF6cCI6ImNsaS13ZWItZ2FxIiwiYXV0aF90aW1lIjoxNzg4NDU0Mjc2LCJzZXNzaW9uX3N0YXRlIjoiN2QxM2YwZTktNjEyNi00Y2M4LWFhYjctMTdlZGUxZjlkODI2IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwczovL3NpZ2FxLmRlcy5jYWl4YSIsImh0dHA6Ly9sb2NhbGhvc3QiXSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwiY28tdW5pZGFkZSI6IjczOTAiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm51LWZ1bmNhbyI6IjIwNTciLCJuby11bmlkYWRlIjoiQ04gU09MVUNPRVMgREUgVEkgLSBOVUNMRU8gQiIsIm5hbWUiOiJBRFJJQU5PIFZBTEUgREUgT0xJVkVJUkEgT0xJVkVJUkEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJjMTQ5MTgyIiwibG9jYWxlIjoicHQtQlIiLCJnaXZlbl9uYW1lIjoiQURSSUFOTyBWQUxFIERFIE9MSVZFSVJBIiwiZmFtaWx5X25hbWUiOiJPTElWRUlSQSIsImNsaWVudEFkZHJlc3MiOiIxMC4yMTEuMTguMTU3IiwiZW1haWwiOiJhZHJpYW5vLnYub2xpdmVpcmFAY2FpeGEuZ292LmJyIiwibnUtbG90YWNhb2Zpc2ljYSI6IjczOTAifQ.h_UYJPib9gKBDmv-X8RK9dONF1WcGxMTQrEUXDp3KQxkUb-bfTv2EW24c9QHYf-qn3zLHtRH03j0hvzZXf_6z7VvYusbS9uVfhMXiXcwUWHzF3RiPa4FOgXpWLytoRUuRXx0JnAWAcaH_me0s6FCn5sftmcP5GZ8X-_L6ZO5TAnPFMKTeAHDMh3qUgeNA9JS6md41J79HaeCLwLVAT0SV0ImpTWm7_JjFaI07d1wKtjgrvaXHsZ6uExRMjpQ6jkGmHRhAAAxl_s14Gk7pcon1iUmLgriOQxBe03ToJoSSymN0Sf75_zhN1Qeq1ZZBrhCv-wEMaAcIyEv4A6mcvEsgQ
 
 
eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJmNTEwZTQ1OC03NDBjLTRkMmUtODc2Zi00NDk2YWYxZjUzZGQiLCJleHAiOjE3ODg0NTQ5MDgsIm5iZiI6MCwiaWF0IjoxNzg4NDU0NjA4LCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsInN1YiI6ImMwZGNlMTY2LWNkOTctNDlkMi05ZjY5LWIzNGZmNzI3OTY3MSIsInR5cCI6IkJlYXJlciIsImF6cCI6ImNsaS13ZWItZ2FxIiwiYXV0aF90aW1lIjoxNzg4NDU0NjA4LCJzZXNzaW9uX3N0YXRlIjoiYzE2MjJmMzctNDliYi00YTVlLThlMjUtMWFmMTI3MGFiZDY1IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwczovL3NpZ2FxLmRlcy5jYWl4YSIsImh0dHA6Ly9sb2NhbGhvc3QiXSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwiY28tdW5pZGFkZSI6IjczOTAiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm51LWZ1bmNhbyI6IjIwNTciLCJuby11bmlkYWRlIjoiQ04gU09MVUNPRVMgREUgVEkgLSBOVUNMRU8gQiIsIm5hbWUiOiJBRFJJQU5PIFZBTEUgREUgT0xJVkVJUkEgT0xJVkVJUkEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJjMTQ5MTgyIiwibG9jYWxlIjoicHQtQlIiLCJnaXZlbl9uYW1lIjoiQURSSUFOTyBWQUxFIERFIE9MSVZFSVJBIiwiZmFtaWx5X25hbWUiOiJPTElWRUlSQSIsImNsaWVudEFkZHJlc3MiOiIxMC4yMTEuMTguMTU3IiwiZW1haWwiOiJhZHJpYW5vLnYub2xpdmVpcmFAY2FpeGEuZ292LmJyIiwibnUtbG90YWNhb2Zpc2ljYSI6IjczOTAifQ.sYqXTL2w4G3a0PnlWvRANg6xyWd4zX8EmI8_mFiB-haQc89pCQYV5hJG1Xmyc0MBwr__x5l_G4uyVH54-S7M6RxZHeZtDhHIu8e6a7Hclozq_vaqM3Ll4EK5CR7bQ6A5wdbXHsLz4S5yDwGH3Pq09-RYtaQek6IpQWdujlWgvWel_hupjdqfoCMs5MpxZQHtXM3i8Da2h8wILT1527Vdk7PwrrfP3hy2IwrcCzGB8S_NtT3JFR5a5DmYuICE-lA356gwG4Isk0GjwJ7aiqVLBz_InF_DG0VK1Wkqm0ffNIkGTOPhmtJ-2hGy3871ce7LnwxSWb3KrHFwb08g5_jPkQ
 
Mateus Barreto Nobrega de Lucena
eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNRmVKNjVfRC14cU55M1Zta01Ib01WS1NjZlA3S21ZazdtVjBJaEsta0F3In0.eyJqdGkiOiJmOTA1NjU4NS1iYTg3LTQ5OGItOWQwNy1jYzMwOThmNGEzNDUiLCJleHAiOjE3ODg0NTYyMDEsIm5iZiI6MCwiaWF0IjoxNzg4NDU1OTAxLCJpc3MiOiJodHRwczovL2xvZ2luLmRlcy5jYWl4YS9hdXRoL3JlYWxtcy9pbnRyYW5ldCIsInN1YiI6ImMwZGNlMTY2LWNkOTctNDlkMi05ZjY5LWIzNGZmNzI3OTY3MSIsInR5cCI6IkJlYXJlciIsImF6cCI6ImNsaS13ZWItZ2FxIiwiYXV0aF90aW1lIjoxNzg4NDU1OTAwLCJzZXNzaW9uX3N0YXRlIjoiZDU2YTUzNGYtZThjOC00MWE5LThiODUtOGM0MWI2ZjYyOTQ3IiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyJodHRwczovL3NpZ2FxLmRlcy5jYWl4YSIsImh0dHA6Ly9sb2NhbGhvc3QiXSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwiY28tdW5pZGFkZSI6IjczOTAiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm51LWZ1bmNhbyI6IjIwNTciLCJuby11bmlkYWRlIjoiQ04gU09MVUNPRVMgREUgVEkgLSBOVUNMRU8gQiIsIm5hbWUiOiJBRFJJQU5PIFZBTEUgREUgT0xJVkVJUkEgT0xJVkVJUkEiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJjMTQ5MTgyIiwibG9jYWxlIjoicHQtQlIiLCJnaXZlbl9uYW1lIjoiQURSSUFOTyBWQUxFIERFIE9MSVZFSVJBIiwiZmFtaWx5X25hbWUiOiJPTElWRUlSQSIsImNsaWVudEFkZHJlc3MiOiIxMC4yMTEuMTguMTU3IiwiZW1haWwiOiJhZHJpYW5vLnYub2xpdmVpcmFAY2FpeGEuZ292LmJyIiwibnUtbG90YWNhb2Zpc2ljYSI6IjczOTAifQ.Qf_T-3rDQx3S8tSO3xH0wR0zysrp7kbCALQjqQ8KvFsp6xnrfDlj4uoegZIo8LAp9Rbugb1OzEyZtqgMnVCPdEqMF6JECxUJZ7AhcKdcvX05TvGYE4_Rpx_usQYIcaDvB-nmopTOYMh_4cSGdEKP_lzUawvGDOkr_1K1-ZlYYEyJwGKscs1DU7w9LIKZEo5ef2al4KIirsJYtkYhCeCOpWcmyYWUTt-LQTVKxxke-i0WTxdZLzfQPEAesyWJ360-51Y-L85NynWsviC-tL_IQwGBYxBCmzwwfEx-f28hgerZaujdjhGlM4CwgATp8SgBIwdpvAyC3JivY1I-H6ozug
 
Adriano Vale de Oliveira adicionou Deivid Barbosa dos Santos ao chat e compartilhou todo o histórico de chats.

 
Deivid Barbosa entra na chamada
 
quinta-feira 14:26 Reunião encerrada: 47min 28s 

 
Jesse Mouta Pereira Batista Adriano Vale de Oliveira, bom dia! Tudo bem? Fiz um debug aqui no ambiente de desenvolvimento e o problema real tá em fechar a conexão TLS. As regras estão realmente ok, conseguimos abrir uma conexão tcp e começar o handshake do tls.
 
Acredito que o ServerHello passa, o recebemos do servidor o hello tb, acredito que recebemos o certificado, mas no meio desse acredito que o Istio/Envoy tá matando o processo
 
 
 
 
Acredito que foi no passo em que eles negociam as chaves
 
O problema que não tenho acesso e preciso do suportes Elza Oliveira Leao pq tem que avaliar se quem tá intermediando essa comunicação (Istio/Envoy) é quem tá matando a conexão

<img width="1263" height="327" alt="image" src="https://github.com/user-attachments/assets/6e2a05e6-6e36-41bd-9507-c06b33ecfb14" />


 
