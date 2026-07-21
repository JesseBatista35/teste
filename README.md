
OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: sisgf-des
Pods
Pod details
Pod
P
sisgf-backend-des-298-w29dp
Init:Error

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Streaming events...
Showing 9 events
Older events are not stored.
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:21
Generated from kubelet on ceadecldlx043.nprd.caixa
5 times in the last 1 minute
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552" already present on machine
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:21
Generated from kubelet on ceadecldlx043.nprd.caixa
5 times in the last 1 minute
Created container secrets-check
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:21
Generated from kubelet on ceadecldlx043.nprd.caixa
5 times in the last 1 minute
Started container secrets-check
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:21
Generated from kubelet on ceadecldlx043.nprd.caixa
7 times in the last 1 minute
Back-off restarting failed container
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:19
Generated from kubelet on ceadecldlx043.nprd.caixa
Started container secrets-agent-sidecar
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:19
Generated from multus
Add eth0 [25.3.19.251/23] from openshift-sdn
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:19
Generated from kubelet on ceadecldlx043.nprd.caixa
Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2" already present on machine
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:19
Generated from kubelet on ceadecldlx043.nprd.caixa
Created container secrets-agent-sidecar
PodPsisgf-backend-des-298-w29dp
NamespaceNSsisgf-des
21 de jul. de 2026, 15:19
Generated from default-scheduler
Successfully assigned sisgf-des/sisgf-backend-des-298-w29dp to ceadecldlx043.nprd.caixa



2026-07-21 18:19:57,278 INFO Getting secrets just once, POLLING_WAIT_BETWEEN_REQUESTS_MINUTES was not configured
2026-07-21 18:19:57,278 INFO (c73d1470-8530-11f1-b107-0a58190313fb) APP VERSION: 2.1.0
2026-07-21 18:19:57,279 INFO (c73d1470-8530-11f1-b107-0a58190313fb) Starting Execution...c73d1470-8530-11f1-b107-0a58190313fb
2026-07-21 18:19:57,279 INFO (c73d1470-8530-11f1-b107-0a58190313fb) You are using: <,> as List delimiter
2026-07-21 18:19:57,279 WARNING (c73d1470-8530-11f1-b107-0a58190313fb) InsecureRequestWarning: Unverified HTTPS request is being made to host https://sicsn.caixa/BeyondTrust/api/public/v3'. Adding certificate verification isstrongly advised. See: https://urllib3.readthedocs.io/en/1.26.x/advanced-usage.html#ssl-warnings
2026-07-21 18:19:57,279 INFO (c73d1470-8530-11f1-b107-0a58190313fb) Certificate was not configured
2026-07-21 18:19:57,282 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) How long to wait for the server to connect and send data before giving up: connection timeout: 30 seconds, request timeout 30 seconds
2026-07-21 18:19:57,283 WARNING (c73d1470-8530-11f1-b107-0a58190313fb) verify_ca=false is insecure, it instructs the caller to not verify the certificate authority when making API calls.
2026-07-21 18:19:57,410 INFO (c73d1470-8530-11f1-b107-0a58190313fb) Calling sign_app_in endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
2026-07-21 18:19:57,450 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Running get_secret method in SecretsSafe class
2026-07-21 18:19:57,450 INFO (c73d1470-8530-11f1-b107-0a58190313fb) **************** secret path: SISGF_DES/SSGFDR01_SFTP *****************
2026-07-21 18:19:57,477 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFDR01_SFTP
2026-07-21 18:19:57,477 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFDR01_SFTP
2026-07-21 18:19:57,532 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Running get_secret method in SecretsSafe class
2026-07-21 18:19:57,532 INFO (c73d1470-8530-11f1-b107-0a58190313fb) **************** secret path: SISGF_DES/CLISERSGF_SSO_INTRA *****************
2026-07-21 18:19:57,533 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=CLISERSGF_SSO_INTRA
2026-07-21 18:19:57,533 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=CLISERSGF_SSO_INTRA
2026-07-21 18:19:57,580 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Running get_secret method in SecretsSafe class
2026-07-21 18:19:57,580 INFO (c73d1470-8530-11f1-b107-0a58190313fb) **************** secret path: SISGF_DES/SISGF_APIKEY *****************
2026-07-21 18:19:57,581 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SISGF_APIKEY
2026-07-21 18:19:57,581 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SISGF_APIKEY
2026-07-21 18:19:57,628 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Running get_secret method in SecretsSafe class
2026-07-21 18:19:57,628 INFO (c73d1470-8530-11f1-b107-0a58190313fb) **************** secret path: SISGF_DES/SSGFRD01_DB2 *****************
2026-07-21 18:19:57,628 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD01_DB2
2026-07-21 18:19:57,628 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD01_DB2
2026-07-21 18:19:57,674 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Running get_secret method in SecretsSafe class
2026-07-21 18:19:57,675 INFO (c73d1470-8530-11f1-b107-0a58190313fb) **************** secret path: SISGF_DES/SSGFRD02_ORA *****************
2026-07-21 18:19:57,675 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Calling get_secret_by_path endpoint: /secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD02_ORA
2026-07-21 18:19:57,675 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) GET request to URL: https://sicsn.caixa/BeyondTrust/api/public/v3/secrets-safe/secrets?path=SISGF_DES&separator=%2F&version=3.1&title=SSGFRD02_ORA
2026-07-21 18:19:57,723 INFO (c73d1470-8530-11f1-b107-0a58190313fb) Secrets folder Path /usr/src/app/secrets_files
2026-07-21 18:19:57,723 INFO (c73d1470-8530-11f1-b107-0a58190313fb) Creating files with the secrets as content, number of files 0
2026-07-21 18:19:57,723 DEBUG (c73d1470-8530-11f1-b107-0a58190313fb) Calling sign_app_out endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/Signout
2026-07-21 18:19:57,735 INFO (c73d1470-8530-11f1-b107-0a58190313fb) {
    "execution_id": "c73d1470-8530-11f1-b107-0a58190313fb",
    "input": {
        "secret_list": [
            "SISGF_DES/SSGFDR01_SFTP",
            "SISGF_DES/CLISERSGF_SSO_INTRA",
            "SISGF_DES/SISGF_APIKEY",
            "SISGF_DES/SSGFRD01_DB2",
            "SISGF_DES/SSGFRD02_ORA"
        ],
        "folder_list": [],
        "managed_account_list": [],
        "secret_safe_url": "https://sicsn.caixa/BeyondTrust/api/public/v3",
        "user": {
            "UserId": 1535,
            "SID": null,
            "EmailAddress": null,
            "UserName": "clientid_SSGFRD01",
            "Name": "clientid_SSGFRD01"
        }
    },
    "output": {
        "secrets": [],
        "messages": [
            {
                "message": "Creating files with the secrets as content, number of files 0",
                "type": "INFO"
            }
        ],
        "errors": [
            {
                "message": "Error while calling get_secret_with_metadata: SISGF_DES/SSGFDR01_SFTP, Secret was not found",
                "type": "ERROR"
            },
            {
                "message": "Error while calling get_secret_with_metadata: SISGF_DES/CLISERSGF_SSO_INTRA, Secret was not found",
                "type": "ERROR"
            },
            {
                "message": "Error while calling get_secret_with_metadata: SISGF_DES/SISGF_APIKEY, Secret was not found",
                "type": "ERROR"
            },
            {
                "message": "Error while calling get_secret_with_metadata: SISGF_DES/SSGFRD01_DB2, Secret was not found",
                "type": "ERROR"
            },
            {
                "message": "Error while calling get_secret_with_metadata: SISGF_DES/SSGFRD02_ORA, Secret was not found",
                "type": "ERROR"
            }
        ]
    }
}
2026-07-21 18:19:57,735 INFO (c73d1470-8530-11f1-b107-0a58190313fb) Ending Execution...c73d1470-8530-11f1-b107-0a58190313fb



ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.


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
SISGF-backend-okd4
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
SISGF

SISGF-backend-okd4
Predefined variables
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
Usuario-Azure-DevOps (12)
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
EGRESS_IP_OKD (74)
WO0000072264656 - Config Portal Infrafácil NO_PROXY
Scopes: Release
OKD-REGISTRY-CENTRALIZADO (7)
Credenciais para o Registry Centralizado - Produtos 4 (OKD)
Scopes: Release
OKD-4-NPRD (12)
Credenciais para o Cluster OKD4 de NPRD (DES/TQS/HMP)
Scopes: EC DES,EC TQS,EC HMP
SISGF-backend-des (48)

Scopes: EC DES
JKS_PASS
changeit
VAULT_LOCATION
/usr/src/app/secrets_files/SISGF_DES/
_ENV.API_KEY
'${SISGF_APIKEY}'
_ENV.APPLICATIONINSIGHTS_CONNECTION_STRING
"InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/"
_ENV.APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
INFO
_ENV.APPLICATIONINSIGHTS_ROLE_NAME
SISGF-backend-DES
_ENV.APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
3
_ENV.APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
INFO
_ENV.CORS_ORIGINS
"https://sisgf-frontend-des.apps.nprd.caixa"
_ENV.DB2_SIICO_PASSWORD
'${SSGFRD01_DB2}'
_ENV.DB2_SIICO_SCHEMA
DESICO
_ENV.DB2_SIICO_URL
"jdbc:db2://10.216.80.110:448/RJKDB2DSD0"
_ENV.DB2_SIICO_USERNAME
"ssgfrd01"
_ENV.EMAIL_DESTINATARIOS
"jose.ibiapina@caixa.gov.br;daniel.e.araujo@caixa.gov.br"
_ENV.EMAIL_FROM
"sisgf.teste@caixa.gov.br"
_ENV.EMAIL_SMTP_PORT
25
_ENV.EMAIL_SMTP_URL
"smtptest.correiolivre.caixa"
_ENV.HORA_LIMITE_CONTABILIZACAO
18
_ENV.HTTPS_PROXY
http://proxydes.caixa:80
_ENV.JAVA_OPTIONS_APPEND
"-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar"
_ENV.NO_PROXY
.caixa,.caixa.gov.br,.applicationinsights.azure.com,.livediagnostics.monitor.azure.com
_ENV.QUARKUS_DATASOURCE_DB_KIND
"other"
_ENV.QUARKUS_DATASOURCE_JDBC_DRIVER
"oracle.jdbc.driver.OracleDriver"
_ENV.QUARKUS_DATASOURCE_JDBC_MAX_SIZE
"40"
_ENV.QUARKUS_DATASOURCE_JDBC_URL
"jdbc:oracle:thin:@10.116.101.7:1521/orad01sc"
_ENV.QUARKUS_DATASOURCE_PASSWORD
'${SSGFRD02_ORA}'
_ENV.QUARKUS_DATASOURCE_USERNAME
"SSGFRD02"
_ENV.QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA
"SGF"
_ENV.QUARKUS_HIBERNATE_ORB_DIALECT
"org.hibernate.dialect.Oracle10gDialect"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS
"false"
_ENV.QUARKUS_HIBERNATE_ORM_LOG_SQL
"false"
_ENV.QUARKUS_HIBERNATE_ORM_PACKAGES
"br.gov.caixa.sisgf.api.domain.model"
_ENV.QUARKUS_LOG_LEVEL
"INFO"
_ENV.QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
_ENV.QUARKUS_OIDC_CREDENTIALS_SECRET
'${CLISERSGF_SSO_INTRA}'
_ENV.SFTP_CLIENT_SECRET
'${SSGFDR01_SFTP}'
_ENV.SFTP_CLIENT_USER
ssgfdr01
_ENV.SFTP_PATH_DIR_LIST
"/SINAF,/SIPAS,/sipas"
_ENV.SFTP_PATH_ENTRADA
/sistemas/sisgf/arquivos/entrada/relatorios
_ENV.SFTP_SERVER_IP
10.116.89.226
_ENV.SFTP_SERVER_PORT
22
_ENV.SIICO_API_PRIVADA_URL
https://api.des.caixa:8443/informacoes-corporativas-privadas/
_ENV.SIICO_API_PUBLICA_URL
https://api.des.caixa:8443/informacoes-corporativas-publicas/
_ENV.SINAF_API_EVENTO_URL
https://api.des.caixa:8443/sinaf-api-evento/
_ENV.SISGF_API_URL
https://sisgf-api-des.apps.nprd.caixa/financeiro-beneficios/faturamento/
_ENV.SISGF_BATCH_UNIDADES_URL
https://sisgf-batch-des.apps.nprd.caixa
_SECRET.QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
'${JKS_PASS}'
_SECRET.SMALLRYE.CONFIG.SOURCE.FILE.LOCATIONS
#{VAULT_LOCATION}#
SISGF-BACKEND-BT-VAULT-DES (1)
WO0000080005919
Scopes: EC DES
SISGF-BT-VAULT-SECRET-DES (2)
WO0000080990757
Scopes: EC DES
BT_CLIENT_ID
5d1e14bf-8c30-418f-bf72-5a830be8f846
BT_CLIENT_SECRET
********
SISGF-backend-tqs (37)
Scopes: EC TQS
OKD-4-APL (12)
Scopes: EC PRD
SISGF-backend-prd (35)
Scopes: EC PRD
|Manage variable groups
Row 2

Select a release pipeline to view its releases

11 pipelines found

Row 6

Row 2

477 pipelines found

Select a release pipeline to view its releases

38 pipelines found

Select a release pipeline to view its releases

9 pipelines found

Select a release pipeline to view its releases

4 pipelines found

Row 3

Row 3

Showing filters 1 through 2



