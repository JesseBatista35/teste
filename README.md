kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  resourceVersion: '2105590287'
  name: sipgc-api-agrupamento-tqs
  uid: 2d4b9e34-e586-4813-a489-9aa6357653df
  creationTimestamp: '2025-02-13T13:27:08Z'
  generation: 222
  managedFields:
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-02T17:52:44Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sipgc-api-agrupamento-tqs"}':
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                    'f:requests':
                      'f:memory': {}
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-28T03:44:54Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:description': {}
            'f:openshift.io/generated-by': {}
          'f:labels':
            .: {}
            'f:CGC_DES': {}
            'f:CGC_OPS': {}
            'f:UNIDADE': {}
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
                'f:CGC_DES': {}
                'f:CGC_OPS': {}
                'f:app': {}
                'f:name': {}
              'f:name': {}
            'f:spec':
              .: {}
              'f:containers':
                .: {}
                'k:{"name":"sipgc-api-agrupamento-tqs"}':
                  'f:image': {}
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources':
                    .: {}
                    'f:limits':
                      .: {}
                      'f:memory': {}
                    'f:requests':
                      .: {}
                      'f:cpu': {}
                  'f:env':
                    .: {}
                    'k:{"name":"BD_SERVER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"DB_DATABASE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"DB_PASSWORD_001"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"DB_USER_001"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"TZ"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
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
              'f:imagePullSecrets':
                .: {}
                'k:{"name":"registry-secret"}': {}
              'f:restartPolicy': {}
              'f:schedulerName': {}
              'f:securityContext': {}
              'f:terminationGracePeriodSeconds': {}
          'f:triggers': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-28T03:45:30Z'
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
  namespace: sipgc-tqs
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: sipgc-api-agrupamento-tqs
    application: sipgc-api-agrupamento-tqs
    template: dotnetcore-caixa-release
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
    name: sipgc-api-agrupamento-tqs
  template:
    metadata:
      name: sipgc-api-agrupamento-tqs
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sipgc-api-agrupamento-tqs
        name: sipgc-api-agrupamento-tqs
      annotations:
        openshift.io/generated-by: OpenShiftNewApp
    spec:
      containers:
        - name: sipgc-api-agrupamento-tqs
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipgc-api-agrupamento:1.3.0.9
          ports:
            - containerPort: 8080
              protocol: TCP
          env:
            - name: TZ
              value: America/Sao_Paulo
            - name: BD_SERVER
              value: '10.116.29.228,1433'
            - name: DB_DATABASE
              value: PGCDB001
            - name: DB_USER_001
              value: SPGCTR01
            - name: DB_PASSWORD_001
              valueFrom:
                secretKeyRef:
                  name: sipgc-api-agrupamento-tqs
                  key: DB_PASSWORD_001
          resources:
            limits:
              cpu: '2'
              memory: 2Gi
            requests:
              cpu: '1'
              memory: 2Gi
          terminationMessagePath: /dev/termination-log
          terminationMessagePolicy: File
          imagePullPolicy: Always
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  observedGeneration: 222
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 39
  updatedReplicas: 1
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-03-21T03:30:33Z'
      lastTransitionTime: '2026-03-21T03:30:33Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-07-28T03:45:30Z'
      lastTransitionTime: '2026-07-28T03:45:26Z'
      reason: NewReplicationControllerAvailable
      message: >-
        replication controller "sipgc-api-agrupamento-tqs-39" successfully
        rolled out
  replicas: 1
  readyReplicas: 1
