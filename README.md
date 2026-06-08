ESTAMOS COM ERRO AINDA CIRAMOS AS VAIRAIVAE S COM ENV;

FICOU ASSIM: 

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
SICBC-BACKEND-DES

Variable group
Properties
Variable group name
SICBC-BACKEND-DES
Description
Grupo de variáveis de SICBC-BACKEND-DES


Variables
_ENV.CREDENTIALS_SECRET
bef84ba6-cc6e-435b-9b2f-2f2248a6887f
_ENV.HTTP_CORS_ORIGINS
https://sicbc-frontend-des.apps.nprd.caixa
_ENV.OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.OIDC_CLIENT_ID
cli-web-cbc
QUARKUS_HTTP_CORS_ORIGINS
********
QUARKUS_OIDC_AUTH-SERVER-URL
********
QUARKUS_OIDC_CLIENT-ID
********
QUARKUS_OIDC_CREDENTIALS_SECRET
********






UMA PERGUNTA VOU DELETAR ESSAS DE QUARKUS MAIS O QUARKUS NAO DEVIERIA ESTA LA NA ENV??? 

eXEMPLO:

_ENV.QUARKUS_CREDENTIALS_SECRET

O ERRO AINDA É O MESMO:

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar

