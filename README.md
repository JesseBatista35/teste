kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  resourceVersion: '2179893916'
  name: sisgf-batch-des
  uid: 5dce891d-7d07-423a-aab8-7e3d21b0a4ff
  creationTimestamp: '2024-08-13T17:09:16Z'
  generation: 14089
  managedFields:
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2024-08-13T17:09:44Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:description': {}
            'f:openshift.io/generated-by': {}
          'f:labels':
            .: {}
            'f:app': {}
            'f:application': {}
            'f:template': {}
        'f:spec':
          'f:replicas': {}
          'f:revisionHistoryLimit': {}
          'f:selector':
            .: {}
            'f:name': {}
          'f:strategy':
            'f:activeDeadlineSeconds': {}
            'f:rollingParams':
              .: {}
              'f:intervalSeconds': {}
              'f:maxSurge': {}
              'f:maxUnavailable': {}
              'f:timeoutSeconds': {}
              'f:updatePeriodSeconds': {}
            'f:type': {}
          'f:template':
            .: {}
            'f:metadata':
              .: {}
              'f:annotations':
                .: {}
                'f:openshift.io/generated-by': {}
              'f:creationTimestamp': {}
              'f:labels':
                .: {}
                'f:app': {}
                'f:name': {}
              'f:name': {}
            'f:spec':
              'f:volumes':
                .: {}
                'k:{"name":"caixa-truststore-acteste-nprd"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"sso-internet-intranet"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
              'f:containers':
                .: {}
                'k:{"name":"sisgf-batch-des"}':
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/deployments/sso_internet-intranet.jks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources':
                    .: {}
                    'f:limits': {}
                    'f:requests': {}
                  'f:livenessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                  'f:env':
                    .: {}
                    'k:{"name":"TZ"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:readinessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                  'f:terminationMessagePath': {}
                  'f:imagePullPolicy': {}
                  'f:ports':
                    .: {}
                    'k:{"containerPort":8080,"protocol":"TCP"}':
                      .: {}
                      'f:containerPort': {}
                      'f:protocol': {}
                  'f:name': {}
              'f:dnsPolicy': {}
              'f:restartPolicy': {}
              .: {}
              'f:schedulerName': {}
              'f:terminationGracePeriodSeconds': {}
              'f:imagePullSecrets':
                .: {}
                'k:{"name":"registry-secret"}': {}
              'f:securityContext': {}
          'f:triggers': {}
    - manager: kubectl-label
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2025-01-03T14:26:32Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:labels':
            'f:UNIDADE': {}
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-03-04T23:20:30Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sisgf-batch-des"}':
                  'f:livenessProbe':
                    'f:initialDelaySeconds': {}
                    'f:tcpSocket':
                      .: {}
                      'f:port': {}
                    'f:timeoutSeconds': {}
                  'f:readinessProbe':
                    'f:initialDelaySeconds': {}
                    'f:tcpSocket':
                      .: {}
                      'f:port': {}
                    'f:timeoutSeconds': {}
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                      'f:memory': {}
                    'f:requests':
                      'f:cpu': {}
                      'f:memory': {}
    - manager: kubectl-patch
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-03T14:20:17Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:labels':
            'f:CGC_DES': {}
            'f:CGC_OPS': {}
        'f:spec':
          'f:template':
            'f:metadata':
              'f:labels':
                'f:CGC_DES': {}
                'f:CGC_OPS': {}
            'f:spec':
              'f:containers':
                'k:{"name":"sisgf-batch-des"}':
                  'f:volumeMounts':
                    'k:{"mountPath":"/usr/src/app/secrets_files"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
              'f:initContainers':
                .: {}
                'k:{"name":"secrets-agent-sidecar"}':
                  'f:image': {}
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/usr/src/app/secrets_files"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources':
                    .: {}
                    'f:limits':
                      .: {}
                      'f:memory': {}
                  'f:env':
                    .: {}
                    'k:{"name":"BT_API_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BT_API_VERSION"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BT_VERIFY_CA"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"CLIENT_ID"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"CLIENT_SECRET"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"SECRETS_LIST"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SECRETS_PATH"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:securityContext':
                    .: {}
                    'f:runAsUser': {}
                  'f:terminationMessagePath': {}
                  'f:imagePullPolicy': {}
                  'f:name': {}
                'k:{"name":"secrets-check"}':
                  'f:image': {}
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/script"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                    'k:{"mountPath":"/usr/src/app/secrets_files"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources': {}
                  'f:command': {}
                  'f:env':
                    .: {}
                    'k:{"name":"SECRETS_LIST"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SECRETS_PATH"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:terminationMessagePath': {}
                  'f:imagePullPolicy': {}
                  'f:name': {}
              'f:volumes':
                'k:{"name":"script-bt-volume"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"secrets"}':
                  .: {}
                  'f:emptyDir':
                    .: {}
                    'f:medium': {}
                  'f:name': {}
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-03T14:20:19Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sisgf-batch-des"}':
                  'f:env':
                    'k:{"name":"SFTP_PATH_SAIDA"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HIBERNATE_ORB_DIALECT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_OIDC_CREDENTIALS_SECRET"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_DRIVER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HTTP_AUTH_PERMISSION_CORS_POLICY"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISGF_BACKEND_ENVIO_EMAIL_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"JAVA_OPTIONS_APPEND"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_DB_KIND"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_PATH_RELATORIOS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIICO_API_PRIVADA_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"HTTPS_PROXY"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"API_KEY"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"APPLICATIONINSIGHTS_CONNECTION_STRING"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_LOG_LEVEL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_SERVER_PORT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_PATH_HST"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"APPLICATIONINSIGHTS_ROLE_NAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HTTP_SSL_CERTIFICATE_KEY_STORE_PASSWORD"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"QUARKUS_HTTP_AUTH_PERMISSION_CORS_PATHS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_CLIENT_USER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_OIDC_AUTH_SERVER_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"NO_PROXY"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_MAX_SIZE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"FILE_MASK_NAF"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIICO_API_PUBLICA_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_SERVER_IP"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HTTP_AUTH_PERMISSION_CORS_METHODS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_USERNAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HIBERNATE_ORM_LOG_SQL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_CLIENT_SECRET"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SMTP_SERVER_PORT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISGF_API_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"QUARKUS_DATASOURCE_PASSWORD"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HIBERNATE_ORM_PACKAGES"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_PATH_DIR_LIST"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"CORS_ORIGINS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SMTP_SERVER_HOST"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SFTP_PATH_ENTRADA"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:image': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-03T14:30:49Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:status':
          'f:availableReplicas': {}
          'f:conditions':
            .: {}
            'k:{"type":"Available"}':
              .: {}
              'f:lastTransitionTime': {}
              'f:lastUpdateTime': {}
              'f:message': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Progressing"}':
              .: {}
              'f:lastTransitionTime': {}
              'f:lastUpdateTime': {}
              'f:message': {}
              'f:reason': {}
              'f:status': {}
              'f:type': {}
          'f:observedGeneration': {}
          'f:readyReplicas': {}
          'f:replicas': {}
          'f:unavailableReplicas': {}
          'f:updatedReplicas': {}
      subresource: status
  namespace: sisgf-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: sisgf-batch-des
    application: sisgf-batch-des
    template: quarkus-caixa-release
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
    name: sisgf-batch-des
  template:
    metadata:
      name: sisgf-batch-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sisgf-batch-des
        name: sisgf-batch-des
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
                  name: bt-client-secret-sisgf-batch-des
                  key: BT_CLIENT_ID
            - name: CLIENT_SECRET
              valueFrom:
                secretKeyRef:
                  name: bt-client-secret-sisgf-batch-des
                  key: BT_CLIENT_SECRET
            - name: BT_API_VERSION
              value: '3.1'
            - name: SECRETS_LIST
              value: >-
                SISGF_DES/SSGFDR01_SFTP,SISGF_DES/CLISERSGF_SSO_INTRA,SISGF_DES/SISGF_APIKEY,SISGF_DES/SSGFRD01_DB2,SISGF_DES/SSGFRD02_ORA
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
                SISGF_DES/SSGFDR01_SFTP,SISGF_DES/CLISERSGF_SSO_INTRA,SISGF_DES/SISGF_APIKEY,SISGF_DES/SSGFRD01_DB2,SISGF_DES/SSGFRD02_ORA
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
              cpu: '1'
              memory: 2Gi
            requests:
              cpu: 500m
              memory: 1Gi
          readinessProbe:
            tcpSocket:
              port: 8080
            initialDelaySeconds: 200
            timeoutSeconds: 20
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: sisgf-batch-des
          livenessProbe:
            tcpSocket:
              port: 8080
            initialDelaySeconds: 200
            timeoutSeconds: 30
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          env:
            - name: TZ
              value: America/Sao_Paulo
            - name: API_KEY
              value: '${SISGF_APIKEY}'
            - name: APPLICATIONINSIGHTS_CONNECTION_STRING
              value: >-
                InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
            - name: APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
              value: INFO
            - name: APPLICATIONINSIGHTS_ROLE_NAME
              value: SISGF-batch-DES
            - name: APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
              value: '3'
            - name: APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
              value: INFO
            - name: CORS_ORIGINS
              value: 'https://sisgf-frontend-des.apps.nprd.caixa'
            - name: FILE_MASK_NAF
              value: MIC.DES.SGF.
            - name: HTTPS_PROXY
              value: 'http://proxydes.caixa:80'
            - name: JAVA_OPTIONS_APPEND
              value: >-
                -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
            - name: NO_PROXY
              value: '*.caixa,*.caixa.gov.br'
            - name: QUARKUS_DATASOURCE_DB_KIND
              value: oracle
            - name: QUARKUS_DATASOURCE_JDBC_DRIVER
              value: oracle.jdbc.driver.OracleDriver
            - name: QUARKUS_DATASOURCE_JDBC_MAX_SIZE
              value: '40'
            - name: QUARKUS_DATASOURCE_JDBC_URL
              value: 'jdbc:oracle:thin:@10.116.101.7:1521/orad01sc'
            - name: QUARKUS_DATASOURCE_PASSWORD
              value: '${SSGFRD02_ORA}'
            - name: QUARKUS_DATASOURCE_USERNAME
              value: SSGFRD02
            - name: QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA
              value: SGF
            - name: QUARKUS_HIBERNATE_ORB_DIALECT
              value: org.hibernate.dialect.Oracle10gDialect
            - name: QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS
              value: 'false'
            - name: QUARKUS_HIBERNATE_ORM_LOG_SQL
              value: 'false'
            - name: QUARKUS_HIBERNATE_ORM_PACKAGES
              value: br.gov.caixa.sisgf.api.domain.model
            - name: QUARKUS_HTTP_AUTH_PERMISSION_CORS_METHODS
              value: OPTIONS
            - name: QUARKUS_HTTP_AUTH_PERMISSION_CORS_PATHS
              value: /*
            - name: QUARKUS_HTTP_AUTH_PERMISSION_CORS_POLICY
              value: permit
            - name: QUARKUS_LOG_LEVEL
              value: INFO
            - name: QUARKUS_OIDC_AUTH_SERVER_URL
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: QUARKUS_OIDC_CREDENTIALS_SECRET
              value: '${CLISERSGF_SSO_INTRA}'
            - name: SFTP_CLIENT_SECRET
              value: '${SSGFDR01_SFTP}'
            - name: SFTP_CLIENT_USER
              value: ssgfdr01
            - name: SFTP_PATH_DIR_LIST
              value: '/SINAF,/SIPAS,/sipas'
            - name: SFTP_PATH_ENTRADA
              value: /sistemas/sisgf/arquivos/entrada
            - name: SFTP_PATH_HST
              value: /historico
            - name: SFTP_PATH_RELATORIOS
              value: /SISGF/relatorios
            - name: SFTP_PATH_SAIDA
              value: /sistemas/sisgf/arquivos/saida
            - name: SFTP_SERVER_IP
              value: 10.116.89.226
            - name: SFTP_SERVER_PORT
              value: '22'
            - name: SIICO_API_PRIVADA_URL
              value: 'https://api.des.caixa:8443/informacoes-corporativas-privadas/'
            - name: SIICO_API_PUBLICA_URL
              value: 'https://api.des.caixa:8443/informacoes-corporativas-publicas/'
            - name: SISGF_API_URL
              value: >-
                http://sisgf-api-des-esteiras.sisgf-des.svc:8080/financeiro-beneficios/faturamento/
            - name: SISGF_BACKEND_ENVIO_EMAIL_URL
              value: >-
                http://sisgf-backend-des-esteiras.sisgf-des.svc:8080/api/envioEmail/
            - name: SMTP_SERVER_HOST
              value: smtptest.correiolivre.caixa
            - name: SMTP_SERVER_PORT
              value: '25'
            - name: QUARKUS_HTTP_SSL_CERTIFICATE_KEY_STORE_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: sisgf-batch-des
                  key: QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
            - name: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
              valueFrom:
                secretKeyRef:
                  name: sisgf-batch-des
                  key: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
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
            - name: sso-internet-intranet
              mountPath: /deployments/sso_internet-intranet.jks
              subPath: sso_internet-intranet.jks
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-batch:14.02.02.20
      volumes:
        - name: secrets
          emptyDir:
            medium: Memory
        - name: script-bt-volume
          configMap:
            name: sisgf-batch-des-script-bt-check
            defaultMode: 420
        - name: caixa-truststore-acteste-nprd
          secret:
            secretName: caixa-truststore-acteste-nprd
            defaultMode: 420
        - name: sso-internet-intranet
          secret:
            secretName: sso-internet-intranet
            defaultMode: 420
      dnsPolicy: ClusterFirst
status:
  observedGeneration: 14089
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 299
  updatedReplicas: 0
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-05-29T18:29:51Z'
      lastTransitionTime: '2026-05-29T18:29:51Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'False'
      lastUpdateTime: '2026-09-03T14:30:49Z'
      lastTransitionTime: '2026-09-03T14:30:49Z'
      reason: ProgressDeadlineExceeded
      message: replication controller "sisgf-batch-des-299" has failed progressing
  replicas: 1
  readyReplicas: 1
