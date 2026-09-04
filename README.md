kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
  resourceVersion: '2180525533'
  name: sicvr-api-integracoes-des
  uid: 1b3dddb6-c6ef-4ec7-98d9-54b28245d5c6
  creationTimestamp: '2026-06-15T14:00:44Z'
  generation: 261
  managedFields:
    - manager: kubectl-create
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-15T14:00:44Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:description': {}
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
                'k:{"name":"sicvr-api-integracoes-des"}':
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources':
                    .: {}
                    'f:limits': {}
                    'f:requests':
                      .: {}
                      'f:cpu': {}
                      'f:memory': {}
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
      time: '2026-06-15T14:00:50Z'
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
              'f:imagePullSecrets':
                .: {}
                'k:{"name":"registry-secret"}': {}
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-03T21:38:25Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sicvr-api-integracoes-des"}':
                  'f:env':
                    'k:{"name":"BEYONDTRUST_CLIENT_SECRET"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SICVR_DATASOURCE_JDBC_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"STA_BACEN_SENHA_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SICVR_AMBIENTE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_MANAGED_SYSTEM_ID"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_MANAGED_ACCOUNT_ID"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"JAVA_OPTIONS_APPEND"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SICVR_CLIENT_ID"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_CLIENT_ID"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SICVR_DATASOURCE_USERNAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_ACCESS_POLICY_SCHEDULE_ID"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_DURATION_MINUTES"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"STA_BACEN_USUARIO"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"STA_BACEN_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SICVR_DATASOURCE_PASSWORD"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_OIDC_AUTH_SERVER_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"STA_CREDENCIAL_PROVEDOR"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"STA_BACEN_SENHA"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SICVR_STORAGE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SICVR_SSO_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_BASE_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_TIMEOUT_MS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_REASON"}':
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
                    'k:{"mountPath":"/deployments/sicvr-api-integracoes.jks"}':
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
                'k:{"name":"sicvr-api-integracoes"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-03T21:40:07Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sicvr-api-integracoes-des"}':
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                      'f:memory': {}
                  'f:volumeMounts':
                    'k:{"mountPath":"/SICVR"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
              'f:volumes':
                'k:{"name":"sicvr-data-des"}':
                  .: {}
                  'f:name': {}
                  'f:persistentVolumeClaim':
                    .: {}
                    'f:claimName': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-03T21:40:07Z'
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
  namespace: sicvr-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sicvr-api-integracoes-des
    application: sicvr-api-integracoes-des
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
    name: sicvr-api-integracoes-des
  template:
    metadata:
      name: sicvr-api-integracoes-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sicvr-api-integracoes-des
        name: sicvr-api-integracoes-des
    spec:
      volumes:
        - name: sicvr-data-des
          persistentVolumeClaim:
            claimName: sicvr-data-des
        - name: caixa-truststore-acteste-nprd
          secret:
            secretName: caixa-truststore-acteste-nprd
            defaultMode: 420
        - name: sicvr-api-integracoes
          secret:
            secretName: sicvr-api-integracoes
            defaultMode: 420
      containers:
        - resources:
            limits:
              cpu: '4'
              memory: 4Gi
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
          name: sicvr-api-integracoes-des
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
            - name: BEYONDTRUST_ACCESS_POLICY_SCHEDULE_ID
              value: '10000'
            - name: BEYONDTRUST_BASE_URL
              value: 'https://sicsn.caixa/BeyondTrust/api/public/v3'
            - name: BEYONDTRUST_CLIENT_ID
              value: 3a5a38f3-6a31-4720-b62a-186a4fa5d2a8
            - name: BEYONDTRUST_CLIENT_SECRET
              value: Esc3T7o+iLO4+p9z1YYpVK3i1ERyu7ZR4qGpoyphILs=
            - name: BEYONDTRUST_DURATION_MINUTES
              value: '10'
            - name: BEYONDTRUST_MANAGED_ACCOUNT_ID
              value: '99077'
            - name: BEYONDTRUST_MANAGED_SYSTEM_ID
              value: '5255'
            - name: BEYONDTRUST_REASON
              value: Consulta_Credencial_STA_BACEN_SICVR
            - name: BEYONDTRUST_TIMEOUT_MS
              value: '60000'
            - name: JAVA_OPTIONS_APPEND
              value: >-
                -Djavax.net.ssl.trustStore=/deployments/sicvr-api-integracoes.jks
            - name: QUARKUS_OIDC_AUTH_SERVER_URL
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: SICVR_AMBIENTE
              value: DES
            - name: SICVR_CLIENT_ID
              value: cli-ser-cvr-a
            - name: SICVR_DATASOURCE_JDBC_URL
              value: 'jdbc:oracle:thin:@oracle-nprd-1000.caixa:1521/prim_D01NGSRV'
            - name: SICVR_DATASOURCE_PASSWORD
              value: pwscvrbd01
            - name: SICVR_DATASOURCE_USERNAME
              value: SCVRBD01
            - name: SICVR_SSO_URL
              value: 'https://login.des.caixa/auth'
            - name: SICVR_STORAGE
              value: /SICVR/des
            - name: STA_BACEN_SENHA
              value: cvrhmp2026
            - name: STA_BACEN_SENHA_URL
              value: 'https://www9.bcb.gov.br/senhaws'
            - name: STA_BACEN_URL
              value: 'https://sta-h.bcb.gov.br/staws'
            - name: STA_BACEN_USUARIO
              value: 211047900.S-SICVR
            - name: STA_CREDENCIAL_PROVEDOR
              value: AMBIENTE
          ports:
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: sicvr-data-des
              mountPath: /SICVR
            - name: caixa-truststore-acteste-nprd
              mountPath: /deployments/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
            - name: sicvr-api-integracoes
              mountPath: /deployments/sicvr-api-integracoes.jks
              subPath: sicvr-api-integracoes.jks
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicvr-api-integracoes:20260903.1829-1.0.0-SNAPSHOT
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  observedGeneration: 261
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 23
  updatedReplicas: 1
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-09-02T17:25:34Z'
      lastTransitionTime: '2026-09-02T17:25:34Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-09-03T21:39:27Z'
      lastTransitionTime: '2026-09-03T21:39:23Z'
      reason: NewReplicationControllerAvailable
      message: >-
        replication controller "sicvr-api-integracoes-des-23" successfully
        rolled out
  replicas: 1
  readyReplicas: 1
