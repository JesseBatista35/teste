Skip to main content
Azure DevOps
projetos
/
Caixa
/
Pipelines
/
Library
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

Library

SICCP-BACK-DES

Variable group
Properties
Variable group name
SICCP-BACK-DES
Description
Grupo de variáveis de SICCP-BACK-DES


Variables
_ENV.DB_URL
jdbc:db2://10.192.225.76:2905/DBD0
_ENV.DB_USER
SCCPDS02
_ENV.JAVA_OPTIONS_APPEND
-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
_ENV.PASS.DB
_ENV.USER
SCCPDS02
PASS_DB
********
SONAR_HOST_UR
https://sonar-esteira.apps.produtos4.caixa/dashboard?id=SICCP-back
SONAR_PROJECT_KEY
SICCP-back
SONAR_PROJECT_NAME
SICCP-back
SONAR_TOKEN
********
SPRING_PROFILES_ACTIVE
des



Matheus Vieira da Silva Santos
 
bom dia tudo bem
 
chegou seu novo chamado aqui
 
você tem o secret?
 
Bom dia 
 
não tenho 
 
nao consegue pegar com algum gestor?
 
acho que sim, vou ver com o Luciano aqui
 
 
eu ja criei aqui
 
so falta colocar o valor. 
 
o DB_URL também vai precisar do prefixo, esquecia de por na requisição, desculpe
 
 
FEITO!
 
ok, vou tentar pegar o secret
 
pelo jwt local não dá pra pegar né? 
 
{

  "jti": "b1530d40-82d8-4606-a10d-e5f104fd8645",

  "exp": 1789132290,

  "nbf": 0,

  "iat": 1789131990,

  "iss": "https://login.des.caixa/auth/realms/intranet",

  "sub": "5424e9ed-9370-4b4e-b3b9-75e0ada72d1e",

  "typ": "Bearer",

  "azp": "cli-web-ccp",

  "nonce": "4dcf87f5-3f30-4f59-827d-a851619bf286",

  "auth_time": 1789131989,

  "session_state": "c4685f61-e1aa-4367-ab9d-25003b240144",

  "acr": "1",

  "allowed-origins": [

    "https://siccp-frontend-des.apps.nprd.caixa",

    "http://localhost:4200"

  ],

  "realm_access": {

    "roles": [

      "CCP_GESTOR1",

      "uma_authorization"

    ]

  },

  "scope": "openid email profile",

  "email_verified": false,

  "name": "USER C075689 CESOB CESOB",

  "preferred_username": "c897046",

  "locale": "pt-BR",

  "given_name": "USER C075689 CESOB",

  "family_name": "CESOB"

}
 
