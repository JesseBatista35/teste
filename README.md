Skip to content
GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siplx-plataforma-geracao-relatorios
Repository navigation
Code
Issues
Pull requests
Actions
Projects
Wiki
Security and quality
Insights
Settings
CI/CD Workflow Generic
caixagithub/siplx-plataforma-geracao-relatorios_develop_39481358394.7 #7
All jobs
Run details
Annotations
1 error and 1 warning
CI_DES / BUILD / BUILD
failed 3 days ago in 1m 1s. View latest attempt.
Search logs
9s
1s
0s
1s
23s
0s
0s
0s
0s
16s
Run caixagithub/DevSecOps-Actions/.github/chaintools/dockercontainer/build@main
  with:
    buildContext: /home/runner/_work/siplx-plataforma-geracao-relatorios/siplx-plataforma-geracao-relatorios
    sigla: siplx
    modulo: plataforma-geracao-relatorios
    uses_packages: false
    uses_nexus: false
    client_id_runner: ***
    github_token_org: ***
    repository: siplx-plataforma-geracao-relatorios
    command: build
    Dockerfile: ./Dockerfile
  env:
    pythonLocation: /home/runner/_work/_tool/Python/3.11.17/x64
    PKG_CONFIG_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib/pkgconfig
    Python_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
    Python2_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
    Python3_ROOT_DIR: /home/runner/_work/_tool/Python/3.11.17/x64
    LD_LIBRARY_PATH: /home/runner/_work/_tool/Python/3.11.17/x64/lib
    REPOSITORY_ARTIFACTS_APP: NEXUS
    LANGUAGES: ["java"]
    Informe o nome da variavel usada no projeto: Informe o valor referente a esta variavel
Set up QEMU
10s
Run docker/setup-qemu-action@v3
Docker info
Pulling binfmt Docker image
Image info
Binfmt version
Installing QEMU static binaries
Extracting available platforms
Set up Docker Buildx
6s
Run docker/setup-buildx-action@v3
0s
2s
1s
0s
0s
1s
0s




app:
  name: siplx-plataforma-geracao-relatorios-des
project:
  name: des
labels:
  appName: siplx-plataforma-geracao-relatorios
  environment: des
source:
  repo: "https://github.com/caixagithub/siplx-plataforma-geracao-relatorios-infranprd"
  path: des
sourcevar:
  repo: "https://github.com/caixagithub/siplx-globalnprd"
  path: des
  values: global.yaml  
cluster:
  destination:  
    name: aks-plx-nprd
    namespace: siplx-plataforma-geracao-relatorios


    apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-env-redis-password-des
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-plx-nprd
    object:
      name: CONFIGURACAO-APP-DES--ENV-REDIS-PASSWORD
      type: secret


      apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-siplx-api-plataforma-geracao-relatorios-sql-des
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-plx-nprd
    object:
      name: SIPLX-DES--DATASOURCE-PASSWORD
      type: secret


      
apiVersion: spv.no/v2beta1
kind: AzureKeyVaultSecret
metadata:
  name: akvs-siplx-api-plataforma-geracao-relatorios
  namespace: aks-istio-ingress
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
spec:
  vault:
    name: kv-plx-nprd
    object:
      name: siplx-api-plataforma-geracao-relatorios
      type: secret
  output: 
    secret:
      name: akvs-siplx-api-plataforma-geracao-relatorios
      type: kubernetes.io/tls

apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siplx-api-plataforma-geracao-relatorios-otel-des
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
    component: otel-collector-conf
data:
  otel-collector-config: |
    receivers:
      otlp:
        protocols:
          grpc:
            endpoint: 0.0.0.0:4317
 
    extensions:
      health_check:
        endpoint: :13133
      pprof:
        endpoint: :1888
      zpages:
        endpoint: :55679
    processors:
      batch:
        send_batch_size: 10
        timeout: 10s
    exporters:
      debug:
        verbosity: detailed
      azuremonitor/system:
        connection_string: ${env:APPLICATIONINSIGHTS_CONNECTION_STRING}
        maxbatchsize: 100
        maxbatchinterval: 10s
    service:
      extensions: [pprof, zpages, health_check]
      pipelines:
        traces:
          receivers: [otlp]
          processors: [batch]
          exporters: [azuremonitor/system,debug]
        metrics:
          receivers: [otlp]
          processors: [batch]
          exporters: [azuremonitor/system]
        logs/system:
          receivers: [otlp]
          processors: [batch] # Adicionado o processador de lote
          exporters: [azuremonitor/system,debug]

          apiVersion: v1
kind: ConfigMap
metadata:
  name: cm-siplx-api-plataforma-geracao-relatorios-des
  labels:
    {{- include "caixa-base-chart.labels" . | nindent 4 }}
data:
 # Parte de autenticação #

 # Parte de Monitoração #
  APPLICATIONINSIGHTS_CONNECTION_STRING: InstrumentationKey=91a5d30a-93b6-46e7-b1e3-ed2591e8367c;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/;ApplicationId=f54c0d3b-fa9b-4360-a4ed-02f05d02ad0d
  OTEL_EXPORTER_HOST: "http://otel-siplx-api-plataforma-geracao-relatorios-des:4317"
  OTEL_EXPORTER_OTLP_PROTOCOL: "grpc"
  OTEL_LOG_LEVEL: INFO
  OTEL_SAMPLING: "1.0"
  OTEL_SERVICE_NAME: "SIPLX-API-PLATAFORMA-GESTAO-RELATORIOS-DES"
  OTEL_PROPAGATORS: tracecontext,baggage
  
  # Parte de log #
  QUARKUS_LOG_LEVEL: DEBUG
  QUARKUS_HTTP_PORT: "8080"
  QUARKUS_ANALYTICS_DISABLED: "true"
  LOG_LEVEL: DEBUG
  LOG_QUARKUS_LEVEL: DEBUG
  LOG_APPLICATION_LEVEL: DEBUG

  # Redis Cache (Azure)
  REDIS_HOST: rediss://redis-plx-nprd.redis.cache.windows.net:6380

  # #datasource SQL Server
  DATASOURCE_KIND: mssql
  DATASOURCE_DATABASE_NAME: mssqldb-01-des-plx-nprd
  DATASOURCE_DEV_ENABLED: "true"
  DATASOURCE_ENCRYPT: "true"
  DATASOURCE_HOST: mssqlsrv-plx-nprd.database.windows.net
  DATASOURCE_HOST_CERTIFICATE: '*.database.windows.net'
  DATASOURCE_LOGIN_TIMEOUT: "30"
  DATASOURCE_METRICS_ENABLE: "true"
  DATASOURCE_PORT: "1433"
  DATASOURCE_SERVER_CERTIFICATE: "false"
  DATASOURCE_USERNAME: SPLXDA01
  DATASOURCE_JDBC_MIN_SIZE: "5"
  DATASOURCE_JDBC_MAX_SIZE: "60"

  # Autenticação e Autorização (OIDC)
  # [ENTRADA] OIDC provider para validar tokens de requests recebidos
  AUTH_SERVER_URL: https://logindes.caixa.gov.br/auth/realms/internet
  AUTH_SERVER_CLIENT_ID: "cli-ser-lce"
  # [SAIDA] OIDC client para obter tokens ao chamar outros serviços
  APPLICATION_CLIENT_ID: "cli-ser-lce"
  

GitHub Enterprise
Users managed by Caixa Economica Federal
caixagithub
siplx-plataforma-geracao-relatorios-infranprd
Repository navigation
Code
Issues
Pull requests
1
 (1)
Actions
Projects
Wiki
Security and quality
Insights
Settings
Files
Go to file
t
T
des
templates
akvs-env-redis-password.yml
akvs-env-sso-secret.yml
akvs-siplx-api-plataforma-geracao-relatorios-sql.yaml
akvs-siplx-api-plataforma-geracao-relatorios.yaml
cm-siplx-api-plataforma-geracao-relatorios-otel.yaml
cm-siplx-plataforma-geracao-relatorios.yaml
deploy-siplx-api-plataforma-geracao-relatorios.yaml
service-siplx-api-plataforma-geracao-relatorios.yaml
.helmignore
Chart.yaml
README.md
ci_cd_variables.yaml
values.yaml
hmp
tqs
tst
README.md
siplx-plataforma-geracao-relatorios-infranprd/des/templates
/cm-siplx-plataforma-geracao-relatorios.yaml

  
      
