FICOU ASSIM: 


QUARKUS_CREDENTIALS_SECRET
bef84ba6-cc6e-435b-9b2f-2f2248a6887f
QUARKUS_HTTP_CORS_ORIGINS
https://sicbc-frontend-des.apps.nprd.caixa
QUARKUS_OIDC_AUTH_SERVER_URL
https://login.des.caixa/auth/realms/intranet
QUARKUS_OIDC_CLIENT_ID
cli-web-cbc


O ERRO CONTINUA:

exec java -Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8080 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -XX:+ExitOnOutOfMemoryError -cp . -jar /deployments/quarkus-run.jar



SEGUE YAML
kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
  resourceVersion: '2005076183'
  name: sicbc-backend-des
  uid: d3a0ffe7-9e5d-47c8-a933-dbbcda465e07
  creationTimestamp: '2026-06-02T13:58:12Z'
  generation: 71
  managedFields:
    - manager: kubectl-create
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-02T13:58:12Z'
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
                'k:{"name":"sicbc-backend-des"}':
                  .: {}
                  'f:env':
                    .: {}
                    'k:{"name":"TZ"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:imagePullPolicy': {}
                  'f:name': {}
                  'f:ports':
                    .: {}
                    'k:{"containerPort":8080,"protocol":"TCP"}':
                      .: {}
                      'f:containerPort': {}
                      'f:protocol': {}
                  'f:resources':
                    .: {}
                    'f:limits': {}
                    'f:requests':
                      .: {}
                      'f:cpu': {}
                      'f:memory': {}
                  'f:terminationMessagePath': {}
                  'f:terminationMessagePolicy': {}
              'f:dnsPolicy': {}
              'f:restartPolicy': {}
              'f:schedulerName': {}
              'f:securityContext': {}
              'f:terminationGracePeriodSeconds': {}
          'f:triggers': {}
    - manager: kubectl-patch
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-02T13:58:16Z'
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
    - manager: kubectl-label
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-05T21:03:32Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:labels':
            'f:UNIDADE': {}
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-08T13:52:17Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sicbc-backend-des"}':
                  'f:livenessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:httpGet':
                      .: {}
                      'f:path': {}
                      'f:port': {}
                      'f:scheme': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                    'f:timeoutSeconds': {}
                  'f:readinessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:httpGet':
                      .: {}
                      'f:path': {}
                      'f:port': {}
                      'f:scheme': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                    'f:timeoutSeconds': {}
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                      'f:memory': {}
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-08T14:01:46Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sicbc-backend-des"}':
                  'f:env':
                    'k:{"name":"CREDENTIALS_SECRET"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"HTTP_CORS_ORIGINS"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"OIDC_AUTH_SERVER_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"OIDC_CLIENT_ID"}':
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
      time: '2026-06-08T14:02:13Z'
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
          'f:replicas': {}
          'f:unavailableReplicas': {}
          'f:updatedReplicas': {}
      subresource: status
  namespace: sicbc-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: sicbc-backend-des
    application: sicbc-backend-des
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
    name: sicbc-backend-des
  template:
    metadata:
      name: sicbc-backend-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sicbc-backend-des
        name: sicbc-backend-des
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
              cpu: '1'
              memory: 1Gi
          readinessProbe:
            httpGet:
              path: /health/ready
              port: 8080
              scheme: HTTP
            timeoutSeconds: 60
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: sicbc-backend-des
          livenessProbe:
            httpGet:
              path: /health/ready
              port: 8080
              scheme: HTTP
            timeoutSeconds: 60
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          env:
            - name: TZ
              value: America/Sao_Paulo
            - name: CREDENTIALS_SECRET
              value: bef84ba6-cc6e-435b-9b2f-2f2248a6887f
            - name: HTTP_CORS_ORIGINS
              value: 'https://sicbc-frontend-des.apps.nprd.caixa'
            - name: OIDC_AUTH_SERVER_URL
              value: 'https://login.des.caixa/auth/realms/intranet'
            - name: OIDC_CLIENT_ID
              value: cli-web-cbc
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
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sicbc-backend:00.00.01.06
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  latestVersion: 28
  observedGeneration: 71
  replicas: 2
  updatedReplicas: 1
  availableReplicas: 0
  unavailableReplicas: 2
  details:
    message: manual change
    causes:
      - type: Manual
  conditions:
    - type: Available
      status: 'False'
      lastUpdateTime: '2026-06-08T13:58:30Z'
      lastTransitionTime: '2026-06-08T13:58:30Z'
      message: Deployment config does not have minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-06-08T14:02:13Z'
      lastTransitionTime: '2026-06-08T14:02:13Z'
      reason: ReplicationControllerUpdated
      message: replication controller "sicbc-backend-des-28" is progressing
