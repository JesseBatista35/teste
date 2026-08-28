Erro na pipeline do Repositório: https://devops.caixa/projetos/Caixa/_git/SIMCX-backend

Estamos tentando gerar a pipeline no repositório backend do SIMCX no ambiente TQSapresenta erro de Executando Build S2I Binary

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=521283&environmentId=2420473

E apresentou o seguinte erros?

2026-08-28T12:32:43.0701872Z ##[section]Starting: Verificando Status do Deployment
2026-08-28T12:32:43.0708143Z ==============================================================================
2026-08-28T12:32:43.0708290Z Task         : Bash
2026-08-28T12:32:43.0708352Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T12:32:43.0708490Z Version      : 3.227.0
2026-08-28T12:32:43.0708591Z Author       : Microsoft Corporation
2026-08-28T12:32:43.0709263Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T12:32:43.0709410Z ==============================================================================
2026-08-28T12:32:43.2609912Z Generating script.
2026-08-28T12:32:43.2623266Z ========================== Starting Command Output ===========================
2026-08-28T12:32:43.2631053Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5586464a-e1c8-4243-85aa-6a6db9609cce.sh
2026-08-28T12:32:43.3756958Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-28T12:32:44.3611746Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-28T12:32:44.4194992Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-28T12:38:50.5804822Z ##[error]The task has timed out.
2026-08-28T12:38:50.5806018Z ##[section]Finishing: Verificando Status do Deployment

2026-08-28T12:32:43.0701872Z ##[section]Starting: Verificando Status do Deployment
2026-08-28T12:32:43.0708143Z ==============================================================================
2026-08-28T12:32:43.0708290Z Task         : Bash
2026-08-28T12:32:43.0708352Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T12:32:43.0708490Z Version      : 3.227.0
2026-08-28T12:32:43.0708591Z Author       : Microsoft Corporation
2026-08-28T12:32:43.0709263Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T12:32:43.0709410Z ==============================================================================
2026-08-28T12:32:43.2609912Z Generating script.
2026-08-28T12:32:43.2623266Z ========================== Starting Command Output ===========================
2026-08-28T12:32:43.2631053Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/5586464a-e1c8-4243-85aa-6a6db9609cce.sh
2026-08-28T12:32:43.3756958Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-28T12:32:44.3611746Z Waiting for rollout to finish: 0 out of 1 new replicas have been updated...
2026-08-28T12:32:44.4194992Z Waiting for rollout to finish: 1 old replicas are pending termination...
2026-08-28T12:38:50.5804822Z ##[error]The task has timed out.
2026-08-28T12:38:50.5806018Z ##[section]Finishing: Verificando Status do Deployment


2026-08-28T12:38:50.5824798Z ##[section]Starting: Logs da Aplicação
2026-08-28T12:38:50.5828035Z ==============================================================================
2026-08-28T12:38:50.5828117Z Task         : Bash
2026-08-28T12:38:50.5828164Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-28T12:38:50.5828238Z Version      : 3.227.0
2026-08-28T12:38:50.5828284Z Author       : Microsoft Corporation
2026-08-28T12:38:50.5828338Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-28T12:38:50.5828420Z ==============================================================================
2026-08-28T12:38:50.7244246Z Generating script.
2026-08-28T12:38:50.7255076Z ========================== Starting Command Output ===========================
2026-08-28T12:38:50.7266181Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/60a8088b-be12-455d-a277-5245e09fdaa5.sh
2026-08-28T12:38:50.7342817Z + shopt -s expand_aliases
2026-08-28T12:38:50.7343122Z + [[ -n okd4_nprd ]]
2026-08-28T12:38:50.7343296Z + [[ okd4_nprd =~ ocp ]]
2026-08-28T12:38:50.7343448Z + [[ -n okd4_nprd ]]
2026-08-28T12:38:50.7343575Z + [[ okd4_nprd =~ (okd4|openshift) ]]
2026-08-28T12:38:50.7343737Z + app=simcx-backend-tqs
2026-08-28T12:38:50.7343842Z + oc version
2026-08-28T12:38:50.8023440Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-08-28T12:38:50.8023707Z Server Version: 4.12.0-0.okd-2023-04-16-041331
2026-08-28T12:38:50.8023890Z Kubernetes Version: v1.25.0-2824+27e744f55d2e99-dirty
2026-08-28T12:38:50.8066001Z ++ oc get pod -l name=simcx-backend-tqs -n simcx-tqs -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-08-28T12:38:50.8067062Z ++ tac
2026-08-28T12:38:50.8067404Z ++ grep -v '^$'
2026-08-28T12:38:50.8069515Z ++ head -n1
2026-08-28T12:38:50.9461210Z + last_pod=simcx-backend-tqs-35-7kcx5
2026-08-28T12:38:50.9461558Z + echo 'Logs do POD: simcx-backend-tqs-35-7kcx5'
2026-08-28T12:38:50.9461784Z + oc logs simcx-backend-tqs-35-7kcx5 -c simcx-backend-tqs -n simcx-tqs
2026-08-28T12:38:50.9461983Z Logs do POD: simcx-backend-tqs-35-7kcx5
2026-08-28T12:38:51.0483022Z Error from server (BadRequest): container "simcx-backend-tqs" in pod "simcx-backend-tqs-35-7kcx5" is waiting to start: PodInitializing
2026-08-28T12:38:51.0566428Z ##[error]Bash exited with code '1'.
2026-08-28T12:38:51.0585607Z ##[section]Finishing: Logs da Aplicação

log pod

P
simcx-backend-tqs-36-shmxk


secrets-agent-sidecar


2026-08-28 16:39:29,088 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-08-28 16:39:29,089 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) APP VERSION: 2.1.0
2026-08-28 16:39:29,089 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Starting Execution...09dace94-a2ff-11f1-8ca5-0a5819001e9d
2026-08-28 16:39:29,089 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) You are using: <,> as List delimiter
2026-08-28 16:39:29,089 WARNING (09dace94-a2ff-11f1-8ca5-0a5819001e9d) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-08-28 16:39:29,089 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Certificate was not configured
2026-08-28 16:39:29,092 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-08-28 16:39:29,092 WARNING (09dace94-a2ff-11f1-8ca5-0a5819001e9d) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-08-28 16:39:29,161 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-08-28 16:39:29,208 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Running get_secret method in SecretsSafe class
2026-08-28 16:39:29,208 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) **************** secret path: SIMCX_TQS/CLISERMCX_SSO_INTRA *****************
2026-08-28 16:39:29,213 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMCX_TQS&separator=%2F&version=3.1&title=CLISERMCX_SSO_INTRA
2026-08-28 16:39:29,214 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMCX_TQS&separator=%2F&version=3.1&title=CLISERMCX_SSO_INTRA
2026-08-28 16:39:29,308 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Secret type: Text
2026-08-28 16:39:29,308 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Secret was successfully retrieved
2026-08-28 16:39:29,308 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Running get_secret method in SecretsSafe class
2026-08-28 16:39:29,308 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) **************** secret path: SIMCX_TQS/SIMCX_BT_APIKEY *****************
2026-08-28 16:39:29,309 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMCX_TQS&separator=%2F&version=3.1&title=SIMCX_BT_APIKEY
2026-08-28 16:39:29,309 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMCX_TQS&separator=%2F&version=3.1&title=SIMCX_BT_APIKEY
2026-08-28 16:39:29,392 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Secret type: Text
2026-08-28 16:39:29,392 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Secret was successfully retrieved
2026-08-28 16:39:29,392 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Running get_secret method in SecretsSafe class
2026-08-28 16:39:29,392 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) **************** secret path: SIMCX_TQS/SMCXTB03_ORACLE *****************
2026-08-28 16:39:29,392 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SIMCX_TQS&separator=%2F&version=3.1&title=SMCXTB03_ORACLE
2026-08-28 16:39:29,393 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SIMCX_TQS&separator=%2F&version=3.1&title=SMCXTB03_ORACLE
2026-08-28 16:39:29,456 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Secrets folder Path /usr/src/app/secrets_files
2026-08-28 16:39:29,456 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Creating files with the secrets as content, number of files 4
2026-08-28 16:39:29,456 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) File saved succesfully: /usr/src/app/secrets_files/SIMCX_TQS/CLISERMCX_SSO_INTRA_Metadata
2026-08-28 16:39:29,456 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) File saved succesfully: /usr/src/app/secrets_files/SIMCX_TQS/CLISERMCX_SSO_INTRA
2026-08-28 16:39:29,456 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) File saved succesfully: /usr/src/app/secrets_files/SIMCX_TQS/SIMCX_BT_APIKEY_Metadata
2026-08-28 16:39:29,456 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) File saved succesfully: /usr/src/app/secrets_files/SIMCX_TQS/SIMCX_BT_APIKEY
2026-08-28 16:39:29,456 DEBUG (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-08-28 16:39:29,469 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) {
    "execution_id": "09dace94-a2ff-11f1-8ca5-0a5819001e9d",
    "input": {
        "secret_list": [
            "SIMCX_TQS/CLISERMCX_SSO_INTRA",
            "SIMCX_TQS/SIMCX_BT_APIKEY",
            "SIMCX_TQS/SMCXTB03_ORACLE"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1926,
            "SID": null,
            "EmailAddress": null,
            "UserName": "SMCXTB02",
            "Name": "SMCXTB02"
        }
    },
    "output": {
        "secrets": [
            {
                "path": "SIMCX_TQS/CLISERMCX_SSO_INTRA_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"535df26a-f8f9-4bcf-ff5e-08dee692d6d1\", \"Title\": \"CLISERMCX_SSO_INTRA\", \"Description\": \"cliente do ambiente DES\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"defd0f91-ece6-444f-98b5-08dee77eb360\", \"CreatedOn\": \"2026-07-22T18:45:43.7166667Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-23T13:51:48.1604093Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIMCX_TQS\", \"FolderPath\": \"SIMCX_TQS\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1926, \"Owner\": null, \"Name\": \"SMCXTB02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIMCX_TQS/CLISERMCX_SSO_INTRA",
                "content": "***************"
            },
            {
                "path": "SIMCX_TQS/SIMCX_BT_APIKEY_Metadata",
                "content": "{\"Username\": null, \"Group\": null, \"FileName\": null, \"FileHash\": null, \"Text\": null, \"SecretType\": \"Text\", \"Id\": \"30feac41-fa7b-48b1-ff5f-08dee692d6d1\", \"Title\": \"SIMCX_BT_APIKEY\", \"Description\": \"\", \"OwnerId\": null, \"GroupId\": null, \"FolderId\": \"defd0f91-ece6-444f-98b5-08dee77eb360\", \"CreatedOn\": \"2026-07-22T18:47:03.7066667Z\", \"CreatedBy\": \"Pedro Souza\", \"ModifiedOn\": \"2026-07-22T18:47:27.255525Z\", \"ModifiedBy\": \"Pedro Souza\", \"Owner\": null, \"Folder\": \"SIMCX_TQS\", \"FolderPath\": \"SIMCX_TQS\", \"Owners\": [{\"OwnerId\": null, \"GroupId\": null, \"UserId\": 1926, \"Owner\": null, \"Name\": \"SMCXTB02\", \"Email\": null}], \"OwnerType\": null, \"Notes\": \"\", \"Urls\": []}"
            },
            {
                "path": "SIMCX_TQS/SIMCX_BT_APIKEY",
                "content": "***************"
            }
        ],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 4",
                "type": "INFO"
            }
        ],
        "errors": [
            {
                "message": "Error while calling get_secret_with_metadata: SIMCX_TQS/SMCXTB03_ORACLE, Secret was not found",
                "type": "ERROR"
            }
        ]
    }
}
2026-08-28 16:39:29,469 INFO (09dace94-a2ff-11f1-8ca5-0a5819001e9d) Ending Execution...09dace94-a2ff-11f1-8ca5-0a5819001e9d



secrets-check


Resultados da Comparacao ---
ERRO na validacao: Os seguintes arquivos obrigatorios estao FALTANDO:
SIMCX_TQS/SMCXTB03_ORACLE
ERRO: Verificacao nao foi bem-sucedida.
ERRO: Diagnostico. Arquivos vazios encontrados.
ERRO: Diagnostico. IP do POD.
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
inet 127.0.0.1/8 scope host lo
valid_lft forever preferred_lft forever
inet6 ::1/128 scope host
valid_lft forever preferred_lft forever
3: eth0@if16359: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1450 qdisc noqueue state UP group default
link/ether 0a:58:19:00:1e:9d brd ff:ff:ff:ff:ff:ff link-netnsid 0
inet 25.0.30.157/23 brd 25.0.31.255 scope global eth0
valid_lft forever preferred_lft forever
inet6 fe80::8017:bbff:fedf:2ae7/64 scope link
valid_lft forever preferred_lft forever






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
SIMCX-backend
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
simcx

SIMCX-backend
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
SIMCX-BACKEND-DES (20)
Grupo de variáveis de SIMCX-BACKEND-DES
Scopes: EC DES
VAULT_LOCATION
/usr/src/app/secrets_files/SIMCX_DES/
_ENV.API_KEY
'${SIMCX_BT_APIKEY}'
_ENV.API_KEY_URL
https://api.des.caixa:8443
_ENV.API_SIISO_URL
https://api.des.caixa:8443
_ENV.CLIENT_SECRET
'${CLISERMCX_SSO_INTRA}'
_ENV.DB_PASSWORD
'${SMCXDB03_ORACLE}'
_ENV.DB_SCHEMA
mcx
_ENV.DB_URL
jdbc:oracle:thin:@//cnpexdadvm01-scan4.extra.caixa.gov.br:1521/CDBD08NGPDB008
_ENV.DB_USERNAME
SMCXDB03
_ENV.HEALTH_URL
https://simcx-backend-des.apps.nprd.caixa
_ENV.JWT_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.JWT_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_ID
cli-ser-mcx
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERMCX_SSO_INTRA}'
_ENV.SIMCX_AMBIENTE
DES
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/SIMCX_DES/
_ENV.SSO_API_URL
https://login.des.caixa/auth/realms/intranet
_ENV.URL_ORIGINS
https://simcx-frontend-des.apps.nprd.caixa
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIMCX-BACKEND-BT-VAULT-DES (1)
WO0000081059531
Scopes: EC DES
BT_SECRETS_LIST
SIMCX_DES/CLISERMCX_SSO_INTRA,SIMCX_DES/SIMCX_BT_APIKEY,SIMCX_DES/SMCXDB03_ORACLE
SIMCX-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
d931ab20-bdba-42db-847a-ed31ab32b382
BT_CLIENT_SECRET
********
SIMCX-BACKEND-TQS (20)
Grupo de variáveis de SIMCX-BACKEND-TQS
Scopes: EC TQS
VAULT_LOCATION
/usr/src/app/secrets_files/SIMCX_TQS/
_ENV.API_KEY
'${SIMCX_BT_APIKEY}'
_ENV.API_KEY_URL
https://api.tqs.caixa:8443
_ENV.API_SIISO_URL
https://api.tqs.caixa:8443
_ENV.CLIENT_SECRET
'${CLISERMCX_SSO_INTRA}'
_ENV.DB_PASSWORD
'${SMCXTB03_ORACLE}'
_ENV.DB_SCHEMA
mcx
_ENV.DB_URL
jdbc:oracle:thin:@//cnpexdadvm01-scan5.extra.caixa.gov.br:1521/CDBT08NGPDB008
_ENV.DB_USERNAME
SMCXTB03
_ENV.HEALTH_URL
https://simcx-backend-tqs.apps.nprd.ca
_ENV.JWT_PUBLICKEY
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzcYY/UbvrEldbQRd4TgLeP9bS8YnaL67MZUsfozWRyocBF3S0L7UEbkPaPoCoBnhoRv8VJHp0grqe3mqEmkMuDlt20Vx6q04ADDyS0c8xaU+Ot+g1Pgwjze944ATUjZogEMko6jvqqUGTt/Nt64yCCIaMaTB119vOBExQim7vPHNe/o7hLxh6VBYINxFA/esxjz8j28/uJWIiK0Gvt07Yx7ycn2DJlQHjnH2GzCSUL87AAYmjyYxW2JZaPLLvRlpcHIWrlr9GNtLiq0++xfJ0jFYxQWs1jxhlfXdqr8NE5vfA/RRRjRFnWzFOhIsOnIHPO9eEwwYzCZSoW2zXkFDYwIDAQAB
_ENV.JWT_URL
https://login.tqs.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.tqs.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CLIENT_ID
cli-ser-mcx
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERMCX_SSO_INTRA}'
_ENV.SIMCX_AMBIENTE
TQS
_ENV.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
/usr/src/app/secrets_files/SIMCX_TQS/
_ENV.SSO_API_URL
https://login.tqs.caixa/auth/realms/intranet
_ENV.URL_ORIGINS
https://simcx-frontend-tqs.apps.nprd.caixa
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SIMCX-BACKEND-BT-VAULT-TQS (4)
WO0000081137118 - Criação de library
Scopes: EC TQS
BT_CLIENT_ID
82b84d03-7185-46c6-952f-8b8351fbf2e8
BT_CLIENT_SECRET
********
BT_SECRETS_LIST
SIMCX_TQS/CLISERMCX_SSO_INTRA,SIMCX_TQS/SIMCX_BT_APIKEY,SIMCX_TQS/SMCXTB03_ORACLE
SMCXTB03_PASSWORD
********
SIMCX-BACKEND-HMP (1)
Grupo de variáveis de SIMCX-BACKEND-HMP
Scopes: EC HMP
INIT
Criado via api
OKD-4-APL (12)
Scopes: EC PRD
CI_NAME
7366CLU-OKD-APL
CLIENT_ID
cli-web-ceh-sdceh
KIND_DEPLOY
deploymentconfig
OKD_4_API_APL
https://api.apl4.caixa:6443
OKD_4_TOKEN_APL
********
OKD_4_URL_SUFFIX_APL
apps.apl4.caixa
OKD_4_USER_SERVICE_APL
ads-sa
OKD_URL_SUFFIX_APL
apps.apl4.caixa
OKD_USER_SERVICE
ads-sa
TIMEOUT_DEPLOY
900
TOKEN_CRQ
********
URL_CRQ
https://infradevops-novoportal-backend-prd.apps.produtos4.caixa/api.php?acao=devopsCaixacriarMudancaPadrao
SIMCX-BACKEND-PRD (1)
Grupo de variáveis de SIMCX-BACKEND-PRD

Scopes: EC PRD
INIT
Criado via api
|Manage variable groups
Expanded

Collapsed

Row 3. Clickable

Showing 16 filtered items.

Get started and run this pipeline for the first time!

Row 4. Clickable

Row 2. Clickable

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2




ambeinte unca rodou em TQS e reaprei tmabe mque esta fora do padraço das variaves do VAULT E DO SECRT O PDARO CORRETO É IGUAL DES.




SIMCX-BACKEND-BT-VAULT-TQS



TINHA


BT_SECRETS_LIST  SIMCX_TQS/CLISERMCX_SSO_INTRA,SIMCX_TQS/SIMCX_BT_APIKEY,SIMCX_TQS/SMCXTB03_ORACLE


SMCXTB03_PASSWORD




FIZ A CORREÇÃO AQUI  E TIRE ESSA VARAIVEL ELA NÃO É AQUI:  SMCXTB03_PASSWORD


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
SIMCX-backend
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
simcx

SIMCX-backend
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
SIMCX-BACKEND-DES (20)
Grupo de variáveis de SIMCX-BACKEND-DES

Scopes: EC DES
SIMCX-BACKEND-BT-VAULT-DES (1)
WO0000081059531
Scopes: EC DES
BT_SECRETS_LIST
SIMCX_DES/CLISERMCX_SSO_INTRA,SIMCX_DES/SIMCX_BT_APIKEY,SIMCX_DES/SMCXDB03_ORACLE
SIMCX-BT-VAULT-SECRET-DES (2)
Scopes: EC DES
BT_CLIENT_ID
d931ab20-bdba-42db-847a-ed31ab32b382
BT_CLIENT_SECRET
********
SIMCX-BACKEND-TQS (20)
Grupo de variáveis de SIMCX-BACKEND-TQS
Scopes: EC TQS
SIMCX-BT-VAULT-SECRET-TQS (2)
WO0000081137118 - Criação de library

Scopes: EC TQS
BT_CLIENT_ID
82b84d03-7185-46c6-952f-8b8351fbf2e8
BT_CLIENT_SECRET
********
SIMCX-BACKEND-BT-VAULT-TQS (1)
WO0000081515552
Scopes: EC TQS
BT_SECRETS_LIST
SIMCX_TQS/CLISERMCX_SSO_INTRA,SIMCX_TQS/SIMCX_BT_APIKEY,SIMCX_TQS/SMCXTB03_ORACLE
SIMCX-BACKEND-HMP (1)
Grupo de variáveis de SIMCX-BACKEND-HMP
Scopes: EC HMP
OKD-4-APL (12)
Scopes: EC PRD
SIMCX-BACKEND-PRD (1)
Grupo de variáveis de SIMCX-BACKEND-PRD
Scopes: EC PRD
|Manage variable groups
Showing filters 1 through 2

List item selected
