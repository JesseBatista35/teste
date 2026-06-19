kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  name: simtx-transacoes-lote-des
  namespace: simtx-des
  uid: a7cb2d84-74b1-46e7-9e56-aee3a5282297
  resourceVersion: '2027139263'
  generation: 61578
  creationTimestamp: '2024-09-15T02:10:09Z'
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: simtx-transacoes-lote-des
    application: simtx-transacoes-lote-des
    template: quarkus-caixa-release
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
spec:
  strategy:
    type: Rolling
    rollingParams:
      updatePeriodSeconds: 1
      intervalSeconds: 1
      timeoutSeconds: 600
      maxUnavailable: 25%
      maxSurge: 25%
    resources: {}
    activeDeadlineSeconds: 21600
  triggers: []
  replicas: 1
  revisionHistoryLimit: 1
  test: false
  selector:
    name: simtx-transacoes-lote-des
  template:
    metadata:
      name: simtx-transacoes-lote-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: simtx-transacoes-lote-des
        name: simtx-transacoes-lote-des
      annotations:
        openshift.io/generated-by: OpenShiftNewApp
    spec:
      restartPolicy: Always
      initContainers:
        - resources:
            limits:
              memory: 400Mi
          terminationMessagePath: /dev/termination-log
          name: secrets-agent-sidecar
          env:
            - name: SECRETS_PATH
              value: /usr/src/app/secrets_files
            - name: BT_API_URL
              value: 'https://sicsn.caixa/BeyondTrust/api/public/v3'
            - name: CLIENT_ID
              valueFrom:
                secretKeyRef:
                  name: bt-client-secret-simtx-transacoes-lote-des
                  key: BT_CLIENT_ID
            - name: CLIENT_SECRET
              valueFrom:
                secretKeyRef:
                  name: bt-client-secret-simtx-transacoes-lote-des
                  key: BT_CLIENT_SECRET
            - name: BT_API_VERSION
              value: '3.1'
            - name: SECRETS_LIST
              value: >-
                SIMTX_DES/CLISERMTX_SSO_INTER,SIMTX_DES/CLISERMTX_SSO_INTRA,SIMTX_DES/SMTXATRD_CICS,SIMTX_DES/SMTXCWD1_CICS,SIMTX_DES/SMTXDS01_ORACLE,SIMTX_DES/SIMTX_BT_APIKEY
            - name: BT_VERIFY_CA
              value: 'False'
          securityContext:
            runAsUser: 1337
          imagePullPolicy: IfNotPresent
          volumeMounts:
            - name: secrets
              mountPath: /usr/src/app/secrets_files
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
        - resources: {}
          terminationMessagePath: /dev/termination-log
          name: secrets-check
          command:
            - /bin/bash
            - /script/bt-check.sh
          env:
            - name: SECRETS_PATH
              value: /usr/src/app/secrets_files
            - name: SECRETS_LIST
              value: >-
                SIMTX_DES/CLISERMTX_SSO_INTER,SIMTX_DES/CLISERMTX_SSO_INTRA,SIMTX_DES/SMTXATRD_CICS,SIMTX_DES/SMTXCWD1_CICS,SIMTX_DES/SMTXDS01_ORACLE,SIMTX_DES/SIMTX_BT_APIKEY
          imagePullPolicy: IfNotPresent
          volumeMounts:
            - name: secrets
              mountPath: /usr/src/app/secrets_files
            - name: script-bt-volume
              mountPath: /script
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
      terminationGracePeriodSeconds: 30
      securityContext: {}
      containers:
        - resources:
            limits:
              cpu: '2'
              memory: 2Gi
            requests:
              cpu: '1'
              memory: 1Gi
          readinessProbe:
            httpGet:
              path: /q/health/ready
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 25
            timeoutSeconds: 5
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: simtx-transacoes-lote-des
          livenessProbe:
            httpGet:
              path: /q/health/live
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 15
            timeoutSeconds: 3
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          env:
            - name: TZ
              value: America/Sao_Paulo
            - name: API_APIKEY
              value: '${SIMTX_BT_APIKEY}'
            - name: APPLICATIONINSIGHTS_CONFIGURATION_CONTENT
              value: >-
                {"sampling":{"overrides":[{"telemetryType":"request","attributes":[{"key":"url.path","value":"^(\/q)?\/health\/.*","matchType":"regexp"}],"percentage":0}]}}
            - name: APPLICATIONINSIGHTS_CONNECTION_STRING
              value: >-
                InstrumentationKey=b6719bb4-47f7-48ac-8480-df5146ebd256;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
            - name: APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
              value: INFO
            - name: APPLICATIONINSIGHTS_PROXY
              value: 'http://proxydes.caixa:80'
            - name: APPLICATIONINSIGHTS_ROLE_NAME
              value: SIMTX-transacoes-lote-DES2
            - name: APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
              value: '100'
            - name: APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
              value: INFO
            - name: CACHE_CAFFEINE_MUILT_REALMS_MAX_EXPIRATION
              value: '28800'
            - name: CACHE_TIME_EXPIRE
              value: 8h
            - name: CICSWEB_SIMTX_SIATR_USER
              value: SMTXATRD
            - name: CICSWEB_SIMTX_USER
              value: SMTXCWD1
            - name: DB
              value: oracle
            - name: DB_JDBC_DRIVER
              value: oracle.jdbc.OracleDriver
            - name: DB_SCHEMA
              value: MTX
            - name: DB_URL
              value: >-
                jdbc:oracle:thin:@cnpexdadvm01-scan8.extra.caixa.gov.br:1521/orad01bc
            - name: DB_USER
              value: SMTXDS01
            - name: HTTPS_PROXY
              value: 'http://proxydes.caixa:80'
            - name: JAVA_OPTIONS_APPEND
              value: >-
                -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
                -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.7.6.jar
            - name: LOG_LEVEL
              value: INFO
            - name: NO_PROXY
              value: '.caixa,.caixa.gov.br'
            - name: PASS_CICS_WEB
              value: '${SMTXCWD1_CICS}'
            - name: PASS_CICS_WEB_ATR
              value: '${SMTXATRD_CICS}'
            - name: PASS_DB
              value: '${SMTXDS01_ORACLE}'
            - name: PASS_SSO_INTERNET
              value: '${CLISERMTX_SSO_INTER}'
            - name: PASS_SSO_INTRANET
              value: '${CLISERMTX_SSO_INTRA}'
            - name: PORTAL_API_APIKEY
              value: l759a3b922364949768a7d49a30012863c
            - name: QUARKUS_OIDC_CLIENT_REFRESH_INTERVAL
              value: 1m
            - name: QUARKUS_OIDC_CLIENT_REFRESH_TOKEN_TIME_SKEW
              value: 1m
            - name: QUARKUS_OIDC_CLIENT__INTERNET__AUTH_SERVER_URL
              value: 'https://logindes.caixa.gov.br/auth/realms/internet'
            - name: QUARKUS_OIDC_CLIENT__INTERNET__CLIENT_ID
              value: cli-ser-mtx
            - name: QUARKUS_OIDC_CLIENT__INTERNET__CREDENTIALS_SECRET
              value: '${CLISERMTX_SSO_INTER}'
            - name: QUARKUS_OIDC_CLIENT__INTERNET__REFRESH_INTERVAL
              value: 1m
            - name: QUARKUS_OIDC_CLIENT__INTERNET__REFRESH_TOKEN_TIME_SKEW
              value: 1m
            - name: QUARKUS_OIDC_CLIENT__INTRANET__AUTH_SERVER_URL
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: QUARKUS_OIDC_CLIENT__INTRANET__CLIENT_ID
              value: cli-ser-mtx
            - name: QUARKUS_OIDC_CLIENT__INTRANET__CREDENTIALS_SECRET
              value: '${CLISERMTX_SSO_INTRA}'
            - name: QUARKUS_OIDC_CLIENT__INTRANET__REFRESH_INTERVAL
              value: 1m
            - name: QUARKUS_OIDC_CLIENT__INTRANET__REFRESH_TOKEN_TIME_SKEW
              value: 1m
            - name: QUARKUS_OIDC__INTERNET__AUTH_SERVER_URL
              value: 'https://logindes.caixa.gov.br/auth/realms/internet'
            - name: QUARKUS_OIDC__INTERNET__CLIENT_ID
              value: cli-ser-mtx
            - name: QUARKUS_OIDC__INTERNET__TLS_VERIFICATION
              value: required
            - name: QUARKUS_OIDC__INTRANET__AUTH_SERVER_URL
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: QUARKUS_OIDC__INTRANET__CLIENT_ID
              value: cli-ser-mtx
            - name: QUARKUS_OIDC__INTRANET__TLS_VERIFICATION
              value: required
            - name: QUARKUS_OIDC__SIPER__AUTH_SERVER_URL
              value: 'https://loginxdes.caixa.gov.br/auth/realms/r_inter_siper'
            - name: QUARKUS_OIDC__SIPER__CLIENT_ID
              value: cli-ser-mtx
            - name: QUARKUS_OIDC__SIPER__TLS_VERIFICATION
              value: required
            - name: QUARKUS_REST_CLIENT_OIDC_FILTER_CLIENT_NAME
              value: intranet
            - name: QUARKUS_REST_CLIENT_OIDC_FILTER_REFRESH_ON_UNAUTHORIZED
              value: 'true'
            - name: RHDG_PORT
              value: '11222'
            - name: RHDG_URL
              value: 'http://rhdg.simtx-datagrid-des.svc:11222'
            - name: RHDG_URL_BASE_PORT
              value: '11222'
            - name: RHDG_URL_CONTEXT_REST
              value: /rest/v2/caches
            - name: RHDG_USER
              value: developer
            - name: SIRAN_ASSINATURA_TRANSACAO_CONTEXTO_V1_VALIDAR
              value: /v1/validar
            - name: SIRAN_ASSINATURA_TRANSACAO_CONTEXTO_V1__ASSINAR
              value: /v1/assinar
            - name: SIRAN_ASSINATURA_TRANSACAO_URL
              value: 'https://ibmspad2.caixa:5001/siran/assinatura-transacao'
            - name: SSO_AUTH_DOMAIN
              value: internet
            - name: SSO_AUTH_SERVER
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: SSO_AUTH_SERVER_TIMEOUT_CONEXAO
              value: '3000'
            - name: SSO_AUTH_SERVER_TIMEOUT_RESPOSTA
              value: '3000'
            - name: SSO_AUTH_SERVER_URLS
              value: >-
                SSO_AUTH_SERVER_URLS=https://logindes.caixa.gov.br/auth/realms/internet,https://login.des.caixa/auth/realms/intranet,https://loginxdes.caixa.gov.br/auth/realms/r_inter_siper
            - name: SSO_AUTH_SERVER_URL_INTERNET
              value: 'https://logindes.caixa.gov.br/auth/realms/internet'
            - name: SSO_AUTH_SERVER_URL_INTRANET
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: SSO_CLIENT_ID
              value: cli-ser-mtx
            - name: TAREFA_100040_VALIDA_PERMISSAO_V3_TIMEOUT_CONEXAO
              value: '3000'
            - name: TAREFA_100040_VALIDA_PERMISSAO_V3_TIMEOUT_RESPOSTA
              value: '3000'
            - name: TAREFA_100043_VALIDA_ASSINATURA_SIMPLES_V3_TIMEOUT_CONEXAO
              value: '2000'
            - name: TAREFA_100043_VALIDA_ASSINATURA_SIMPLES_V3_TIMEOUT_RESPOSTA
              value: '5000'
            - name: TAREFA_100044_VALIDA_ASSINATURA_MULTIPLA_V2_TIMEOUT
              value: '5000'
            - name: TAREFA_100070_VALIDA_BOLETO_V1_TIMEOUT_CONEXAO
              value: '2000'
            - name: TAREFA_100070_VALIDA_BOLETO_V1_TIMEOUT_RESPOSTA
              value: '2000'
            - name: TAREFA_100093_VALIDA_TEV_V2_TIMEOUT_CONEXAO
              value: '3000'
            - name: TAREFA_100093_VALIDA_TEV_V2_TIMEOUT_RESPOSTA
              value: '3000'
            - name: TAREFA_100097_EFETIVA_LIMITE_LOTE_V2_REQ_FILA
              value: SIBAR.REQ.CONTROLE_LIMITE
            - name: TAREFA_100097_EFETIVA_LIMITE_LOTE_V2_REQ_POOL_SIZE
              value: '100'
            - name: TAREFA_100097_EFETIVA_LIMITE_LOTE_V2_REQ_TIMEOUT
              value: '0'
            - name: TAREFA_100097_EFETIVA_LIMITE_LOTE_V2_RSP_FILA
              value: SIBAR.RSP.CONTROLE_LIMITE
            - name: TAREFA_100097_EFETIVA_LIMITE_LOTE_V2_RSP_POOL_SIZE
              value: '100'
            - name: TAREFA_100097_EFETIVA_LIMITE_LOTE_V2_RSP_TIMEOUT
              value: '0'
            - name: TAREFA_100116_VALIDA_TITULAR_V3_CONNECTION_TIMEOUT
              value: '1000'
            - name: TAREFA_100116_VALIDA_TITULAR_V3_READ_TIMEOUT
              value: '1000'
            - name: TAREFA_100116_VALIDA_TITULAR_V3_URL
              value: 'https://api.des.caixa:8443/conta-deposito/consultas'
            - name: TAREFA_100134_ATUALIZA_SITUACAO_ASSINATURA_MULTIPLA_V1_CONTEXTO
              value: /sibar/contas/assinaturas-eletronicas/v1/
            - name: >-
                TAREFA_100134_ATUALIZA_SITUACAO_ASSINATURA_MULTIPLA_V1_TIMEOUT_REQUISICAO
              value: '2000'
            - name: >-
                TAREFA_100134_ATUALIZA_SITUACAO_ASSINATURA_MULTIPLA_V1_TIMEOUT_RESPOSTA
              value: '2000'
            - name: TAREFA_100158_VALIDA_TED_V2_TIMEOUT_CONEXAO
              value: '3000'
            - name: TAREFA_100158_VALIDA_TED_V2_TIMEOUT_RESPOSTA
              value: '3000'
            - name: TAREFA_100158_VALIDA_TED_V2_VERSAO
              value: '2'
            - name: TAREFA_100159_VALIDA_CONCESSIONARIA_V2_CONTEXTO
              value: /lote/csn/validacsn
            - name: TAREFA_100159_VALIDA_CONCESSIONARIA_V2_TIMEOUT_CONEXAO
              value: '3000'
            - name: TAREFA_100159_VALIDA_CONCESSIONARIA_V2_TIMEOUT_RESPOSTA
              value: '3000'
            - name: TAREFA_100168_ANTIFRAUDE_BOLETO_V2_RSP_THREAD_POOL_SIZE
              value: '32'
            - name: TAREFA_100168_ANTIFRAUDE_BOLETO_V2_RSP_TIMEOUT
              value: '2000'
            - name: TAREFA_100168_ANTIFRAUDE_V2_FILA_RSP
              value: SIAAF.RSP.SIMTX.PAGAMENTOS_LOTE
            - name: TAREFA_100168_ANTIFRAUDE_V2_REQ_FILA
              value: SIAAF.REQ.SIMTX.PAGAMENTOS_LOTE
            - name: TAREFA_100168_ANTIFRAUDE_V2_REQ_POOL_SIZE
              value: '1'
            - name: TAREFA_100168_ANTIFRAUDE_V2_REQ_TIMEOUT
              value: '1000'
            - name: TAREFA_100168_ANTIFRAUDE_V2_RSP_POOL_SIZE
              value: '1'
            - name: TAREFA_100168_ANTIFRAUDE_V2_RSP_TIMEOUT
              value: '1000'
            - name: TAREFA_100196_PROCESSAR_LOTE_V1_REQ_FILA
              value: SIMTX.REQ.TRANSACOES_LOTE_PROCESSAMENTO
            - name: TAREFA_100196_PROCESSAR_LOTE_V1_REQ_POOL_SIZE
              value: '1'
            - name: TAREFA_100196_PROCESSAR_LOTE_V1_REQ_TIMEOUT
              value: '0'
            - name: TAREFA_100208_VALIDA_TRANSACAO_V1_CONTEXTO
              value: /limite/valida
            - name: TAREFA_100208_VALIDA_TRANSACAO_V1_TIMEOUT
              value: '3000'
            - name: TAREFA_100232_ANALISE_ANTIFRAUDE_V2_FILA_RSP
              value: SIAAF.RSP.SIMTX.PAGAMENTOS_LOTE
            - name: TAREFA_100232_ANALISE_ANTIFRAUDE_V2_REQ_FILA
              value: SIAAF.REQ.SIMTX.PAGAMENTOS_LOTE
            - name: TAREFA_100232_ANALISE_ANTIFRAUDE_V2_REQ_POOL_SIZE
              value: '1'
            - name: TAREFA_100232_ANALISE_ANTIFRAUDE_V2_REQ_TIMEOUT
              value: '1000'
            - name: TAREFA_100232_ANALISE_ANTIFRAUDE_V2_RSP_POOL_SIZE
              value: '1'
            - name: TAREFA_100232_ANALISE_ANTIFRAUDE_V2_RSP_TIMEOUT
              value: '1000'
            - name: TAREFA_100233_VALIDA_TRANSACOES_LOTE_BOLETO_V1_REQ_FILA
              value: SIMTX.REQ.VALIDA_TRANSACOES_LOTE_BOLETO
            - name: TAREFA_100233_VALIDA_TRANSACOES_LOTE_BOLETO_V1_REQ_POOL_SIZE
              value: '1'
            - name: TAREFA_100233_VALIDA_TRANSACOES_LOTE_BOLETO_V1_REQ_TIMEOUT
              value: '5000'
            - name: URL_APIMANAGER
              value: 'https://api.des.caixa:8443'
            - name: URL_CICSWEB_SIATR
              value: 'https://cicsweb.des.caixa:32587/siatr'
            - name: URL_CICSWEB_SID09
              value: 'https://cicsweb.des.caixa:32587/sid09'
            - name: URL_CICSWEB_SIPER
              value: 'https://cicsweb.des.caixa:32587/siper'
            - name: URL_SIBAR
              value: 'https://des.barramento.caixa:443'
            - name: URL_SICCO
              value: 'https://sicco.webservices.des.caixa'
            - name: URL_SIMTX_ASSINATURA_MULTIPLA
              value: 'https://simtx-assinatura-multipla-des.apps.nprd.caixa'
            - name: URL_SIMTX_COBRANCA_BANCARIA
              value: 'https://simtx-cobranca-bancaria-des2.apps.nprd.caixa'
            - name: URL_TRANSACOES_LOTE_BASE
              value: >-
                https://simtx-transacoes-lote-des2.apps.nprd.caixa/transacoes-lote/
            - name: VALIDACAO_INTERVALO_TRANSACAO
              value: '5'
            - name: WMQ_CHANNEL
              value: SIMTX.OKD.SVRCONN
            - name: WMQ_CHANNEL_SIMTX_SICCO
              value: SIMTX.CCO.SVRCONN
            - name: WMQ_HOSTNAME
              value: ibmspdes.caixa
            - name: WMQ_LOTE_TRANSACAO_ASSINADA_REQ_FILA
              value: SIMTX.REQ.LOTE_TRANSACAO_ASSINADA
            - name: WMQ_LOTE_TRANSACAO_ASSINADA_REQ_THREAD_POOL_SIZE
              value: '1'
            - name: WMQ_LOTE_TRANSACAO_ASSINADA_REQ_TIMEOUT
              value: '5000'
            - name: WMQ_PORT
              value: '1420'
            - name: WMQ_QUEUEMANAGER
              value: QSDA
            - name: WMQ_SICCO_RECEBE_TRANSACAO_REQ_FILA
              value: SICCO.REQ.RECEBE_TRANSACAO
            - name: WMQ_SICCO_RECEBE_TRANSACAO_REQ_POOL_SIZE
              value: '3'
            - name: WMQ_SICCO_RECEBE_TRANSACAO_REQ_TIMEOUT
              value: '0'
            - name: WMQ_SICCO_REQ_RECEBE_TRANSACAO_POOL_SIZE
              value: '100'
            - name: WMQ_SICCO_REQ_RECEBE_TRANSACAO_TIMEOUT
              value: '0'
            - name: WMQ_SITGV_FILA_REQ
              value: SITGV.REQ.OPP_RETORNO_SIMTX
            - name: WMQ_SITGV_THREAD_POOL_SIZE
              value: '1'
            - name: WMQ_SITGV_TIMEOUT
              value: '0'
            - name: WMQ_TRIGGER_USER
              value: SMTXMQD1
            - name: WMQ_USER
              value: SMTXSD01
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: DB_PASSWORD
            - name: RHDG_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: RHDG_PASSWORD
            - name: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
            - name: SSO_AUTH_PASS
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: SSO_AUTH_PASS
            - name: SSO_REALM_INTERNET_PASS
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: SSO_REALM_INTERNET_PASS
            - name: SSO_REALM_INTRANET_PASS
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: SSO_REALM_INTRANET_PASS
            - name: CICSWEB_SIMTX_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: CICSWEB_SIMTX_PASSWORD
            - name: CICSWEB_SIMTX_SIATR_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: simtx-transacoes-lote-des
                  key: CICSWEB_SIMTX_SIATR_PASSWORD
          ports:
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: secrets
              mountPath: /usr/src/app/secrets_files
            - name: caixa-truststore-acteste-nprd
              mountPath: /deployments/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtx-transacoes-lote:20260618.1741-1.0.0.1-SNAPSHOT
      volumes:
        - name: secrets
          emptyDir:
            medium: Memory
        - name: script-bt-volume
          configMap:
            name: simtx-transacoes-lote-des-script-bt-check
            defaultMode: 420
        - name: caixa-truststore-acteste-nprd
          secret:
            secretName: caixa-truststore-acteste-nprd
            defaultMode: 420
      dnsPolicy: ClusterFirst
status:
  observedGeneration: 61578
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 800
  updatedReplicas: 1
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-06-16T16:50:41Z'
      lastTransitionTime: '2026-06-16T16:50:41Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-06-19T14:39:48Z'
      lastTransitionTime: '2026-06-19T14:39:44Z'
      reason: NewReplicationControllerAvailable
      message: >-
        replication controller "simtx-transacoes-lote-des-800" successfully
        rolled out
  replicas: 1
  readyReplicas: 1
