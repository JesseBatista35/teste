kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  resourceVersion: '2081975760'
  name: sispl-api-mkp-des
  uid: fab7e800-ca45-486b-8c6c-964bd14f59ad
  creationTimestamp: '2025-01-06T18:39:44Z'
  generation: 2322
  managedFields:
    - manager: kubectl-label
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2025-01-06T18:39:44Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:labels':
            'f:UNIDADE': {}
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2025-01-06T18:39:44Z'
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
              .: {}
              'f:containers':
                .: {}
                'k:{"name":"sispl-api-mkp-des"}':
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources':
                    .: {}
                    'f:limits': {}
                    'f:requests': {}
                  'f:livenessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:httpGet':
                      .: {}
                      'f:path': {}
                      'f:port': {}
                      'f:scheme': {}
                    'f:initialDelaySeconds': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                    'f:timeoutSeconds': {}
                  'f:env':
                    .: {}
                    'k:{"name":"TZ"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:readinessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:httpGet':
                      .: {}
                      'f:path': {}
                      'f:port': {}
                      'f:scheme': {}
                    'f:initialDelaySeconds': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                    'f:timeoutSeconds': {}
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
              'f:schedulerName': {}
              'f:securityContext': {}
              'f:terminationGracePeriodSeconds': {}
          'f:triggers': {}
    - manager: kubectl-patch
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2025-02-24T13:57:31Z'
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
                'f:UNIDADE': {}
            'f:spec':
              'f:imagePullSecrets':
                .: {}
                'k:{"name":"registry-secret"}': {}
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2025-09-29T19:34:03Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sispl-api-mkp-des"}':
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                      'f:memory': {}
                    'f:requests':
                      'f:cpu': {}
                      'f:memory': {}
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-25T20:56:58Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sispl-api-mkp-des"}':
                  'f:env':
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_DRIVER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_OIDC_INTRANETGESTAO_AUTH_SERVER_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE__IDAA__USERNAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_REST_CLIENT_CSWCRIPTO_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HTTP_TEST_PORT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_MIN_SIZE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISPL_MQ_PORT"}':
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
                    'k:{"name":"QUARKUS_DATASOURCE__IDAA__PASSWORD"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"QUARKUS_HTTP_CORS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_ACQUISITION_TIMEOUT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISPL_MQ_QUEUE_CAPTACAO_BACKOUT"}':
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
                    'k:{"name":"APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISPL_MKP_CLIENTSECRET"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISPL_MQ_CHANNEL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"APPLICATIONINSIGHTS_ROLE_NAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_BACKGROUND_VALIDATION_INTERVAL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_OIDC_AUTH_SERVER_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_MAX_SIZE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_OIDC_INTRANET_AUTH_SERVER_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_USERNAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"CAIXA_SECURITY_CLIENTS_AUTHORIZED"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISPL_MQ_HOSTNAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_REST_CLIENT_CSWCRIPTOLOTE_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE__IDAA__JDBC_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"MOCK2"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"SISPL_MQ_MANAGER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_PASSWORD"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"SISPL_MQ_USERNAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SISPL_MKP_CLIENTID"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_REST_CLIENT_TOKENSSO_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_HTTP_PORT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:image': {}
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
              'f:volumes':
                .: {}
                'k:{"name":"caixa-truststore-acteste-nprd"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-16T17:21:23Z'
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
  namespace: sispl-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: sispl-api-mkp-des
    application: sispl-api-mkp-des
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
    name: sispl-api-mkp-des
  template:
    metadata:
      name: sispl-api-mkp-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        UNIDADE: BR
        app: sispl-api-mkp-des
        name: sispl-api-mkp-des
      annotations:
        openshift.io/generated-by: OpenShiftNewApp
    spec:
      volumes:
        - name: caixa-truststore-acteste-nprd
          secret:
            secretName: caixa-truststore-acteste-nprd
            defaultMode: 420
      containers:
        - resources:
            limits:
              cpu: '2'
              memory: 2Gi
            requests:
              cpu: 500m
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
          name: sispl-api-mkp-des
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
            - name: APPLICATIONINSIGHTS_CONNECTION_STRING
              value: verificar a InstrumentationKey de DES
            - name: APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
              value: INFO
            - name: APPLICATIONINSIGHTS_ROLE_NAME
              value: SISPL-API-MKP-DES
            - name: APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
              value: '10'
            - name: APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
              value: INFO
            - name: CAIXA_SECURITY_CLIENTS_AUTHORIZED
              value: cli-ser-spl+cli-ser-lce+cli-ser-spl_jboss
            - name: JAVA_OPTIONS_APPEND
              value: >-
                -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
            - name: QUARKUS_DATASOURCE_DB_KIND
              value: db2
            - name: QUARKUS_DATASOURCE_JDBC_ACQUISITION_TIMEOUT
              value: '5'
            - name: QUARKUS_DATASOURCE_JDBC_BACKGROUND_VALIDATION_INTERVAL
              value: 1M
            - name: QUARKUS_DATASOURCE_JDBC_DRIVER
              value: com.ibm.db2.jcc.DB2Driver
            - name: QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE
              value: '15'
            - name: QUARKUS_DATASOURCE_JDBC_MAX_SIZE
              value: '60'
            - name: QUARKUS_DATASOURCE_JDBC_MIN_SIZE
              value: '5'
            - name: QUARKUS_DATASOURCE_JDBC_URL
              value: 'jdbc:db2://10.192.224.76:5021/CSD1'
            - name: QUARKUS_DATASOURCE_USERNAME
              value: SSPLDB01
            - name: QUARKUS_DATASOURCE__IDAA__JDBC_URL
              value: 'jdbc:db2://10.192.224.76:5051/CSDA'
            - name: QUARKUS_DATASOURCE__IDAA__USERNAME
              value: SSPLTI01
            - name: QUARKUS_HTTP_CORS
              value: 'true'
            - name: QUARKUS_HTTP_PORT
              value: '8080'
            - name: QUARKUS_HTTP_TEST_PORT
              value: '8083'
            - name: QUARKUS_LOG_LEVEL
              value: INFO
            - name: QUARKUS_OIDC_AUTH_SERVER_URL
              value: 'https://logindes.caixa.gov.br/auth/realms/internet'
            - name: QUARKUS_OIDC_INTRANETGESTAO_AUTH_SERVER_URL
              value: 'https://login.hmp.caixa/auth/realms/intranet'
            - name: QUARKUS_OIDC_INTRANET_AUTH_SERVER_URL
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: QUARKUS_REST_CLIENT_CSWCRIPTOLOTE_URL
              value: 'http://cics.des.coredf.caixa:8080'
            - name: QUARKUS_REST_CLIENT_CSWCRIPTO_URL
              value: 'http://d2df.coredf.caixa:1081'
            - name: QUARKUS_REST_CLIENT_TOKENSSO_URL
              value: >-
                https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
            - name: QUARKUS_SWAGGER_UI_ALWAYS_INCLUDE
              value: 'true'
            - name: SISPL_MKP_CLIENTID
              value: cli-ser-spl
            - name: SISPL_MKP_CLIENTSECRET
              value: 14719361-0346-4cc1-b51f-fb55f197f4ed
            - name: SISPL_MQ_CHANNEL
              value: BRD6.SVRCONN.SILCE
            - name: SISPL_MQ_HOSTNAME
              value: 10.192.228.145
            - name: SISPL_MQ_MANAGER
              value: BRD6
            - name: SISPL_MQ_PORT
              value: '1418'
            - name: SISPL_MQ_QUEUE_CAPTACAO_BACKOUT
              value: LQ.LOG.SISPL.MARKETPLACE.BACKOUT
            - name: SISPL_MQ_USERNAME
              value: SSPLBD01
            - name: QUARKUS_DATASOURCE__IDAA__PASSWORD
              valueFrom:
                secretKeyRef:
                  name: sispl-api-mkp-des
                  key: QUARKUS_DATASOURCE__IDAA__PASSWORD
            - name: MOCK2
              valueFrom:
                secretKeyRef:
                  name: sispl-api-mkp-des
                  key: MOCK2
            - name: QUARKUS_DATASOURCE_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: sispl-api-mkp-des
                  key: QUARKUS_DATASOURCE_PASSWORD
          ports:
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: caixa-truststore-acteste-nprd
              mountPath: /deployments/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-api-mkp:3.9.0.0
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  observedGeneration: 2322
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 52
  updatedReplicas: 1
  conditions:
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-06-25T20:58:09Z'
      lastTransitionTime: '2026-06-25T20:58:04Z'
      reason: NewReplicationControllerAvailable
      message: replication controller "sispl-api-mkp-des-52" successfully rolled out
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-07-16T17:21:23Z'
      lastTransitionTime: '2026-07-16T17:21:23Z'
      message: Deployment config has minimum availability.
  replicas: 1
  readyReplicas: 1

