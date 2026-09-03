kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  resourceVersion: '2176034842'
  name: sipgc-api-seguranca-des
  uid: b5171e6b-3761-4a49-8ba2-2eba9527bde4
  creationTimestamp: '2024-12-09T15:48:29Z'
  generation: 1036
  managedFields:
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2025-01-15T20:04:37Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sipgc-api-seguranca-des"}':
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                      'f:memory': {}
                    'f:requests':
                      'f:cpu': {}
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-01T16:50:40Z'
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
                'f:UNIDADE': {}
                'f:app': {}
                'f:name': {}
              'f:name': {}
            'f:spec':
              'f:volumes':
                .: {}
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
              'f:containers':
                .: {}
                'k:{"name":"sipgc-api-seguranca-des"}':
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
                    'f:limits': {}
                    'f:requests':
                      .: {}
                      'f:memory': {}
                  'f:env':
                    'k:{"name":"DB_PASSWORD_001"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"DB_PASSWORD_0010"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:secretKeyRef': {}
                    'k:{"name":"VAULT_LOCATION"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"TZ"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    .: {}
                    'k:{"name":"DB_DATABASE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"DB_USER_001"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BD_SERVER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"ASPNETCORE_ENVIRONMENT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"BEYONDTRUST_LOGGING_ENABLED"}':
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
              'f:restartPolicy': {}
              .: {}
              'f:schedulerName': {}
              'f:terminationGracePeriodSeconds': {}
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
              'f:imagePullSecrets':
                .: {}
                'k:{"name":"registry-secret"}': {}
              'f:securityContext': {}
          'f:triggers': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-09-01T16:51:20Z'
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
  namespace: sipgc-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: sipgc-api-seguranca-des
    application: sipgc-api-seguranca-des
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
    name: sipgc-api-seguranca-des
  template:
    metadata:
      name: sipgc-api-seguranca-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        UNIDADE: BR
        app: sipgc-api-seguranca-des
        name: sipgc-api-seguranca-des
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
                  name: bt-client-secret-sipgc-api-seguranca-des
                  key: BT_CLIENT_ID
            - name: CLIENT_SECRET
              valueFrom:
                secretKeyRef:
                  name: bt-client-secret-sipgc-api-seguranca-des
                  key: BT_CLIENT_SECRET
            - name: BT_API_VERSION
              value: '3.1'
            - name: SECRETS_LIST
              value: >-
                SIPGC_DES/SIPGC_BT_APIKEY,SIPGC_DES/CLISERPGC_SSO_INTRA,SIPGC_DES/SPGCDR01_SQLSERVER
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
                SIPGC_DES/SIPGC_BT_APIKEY,SIPGC_DES/CLISERPGC_SSO_INTRA,SIPGC_DES/SPGCDR01_SQLSERVER
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
              cpu: 512m
              memory: 512Mi
            requests:
              cpu: 256m
              memory: 256Mi
          terminationMessagePath: /dev/termination-log
          name: sipgc-api-seguranca-des
          env:
            - name: TZ
              value: America/Sao_Paulo
            - name: ASPNETCORE_ENVIRONMENT
              value: des
            - name: BD_SERVER
              value: '10.116.92.247,1433'
            - name: BEYONDTRUST_LOGGING_ENABLED
              value: 'true'
            - name: DB_DATABASE
              value: PGCDB001
            - name: DB_PASSWORD_001
              value: '${spgcdr01_sqlserver}'
            - name: DB_USER_001
              value: SPGCDR01
            - name: VAULT_LOCATION
              value: /usr/src/app/secrets_files/SIPGC_DES/
            - name: DB_PASSWORD_0010
              valueFrom:
                secretKeyRef:
                  name: sipgc-api-seguranca-des
                  key: DB_PASSWORD_0010
          ports:
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: secrets
              mountPath: /usr/src/app/secrets_files
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sipgc-api-seguranca:1.3.0.11-SNAPSHOT
      volumes:
        - name: secrets
          emptyDir:
            medium: Memory
        - name: script-bt-volume
          configMap:
            name: sipgc-api-seguranca-des-script-bt-check
            defaultMode: 420
      dnsPolicy: ClusterFirst
status:
  observedGeneration: 1036
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 140
  updatedReplicas: 1
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2025-10-06T12:31:42Z'
      lastTransitionTime: '2025-10-06T12:31:42Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-09-01T16:51:20Z'
      lastTransitionTime: '2026-09-01T16:51:15Z'
      reason: NewReplicationControllerAvailable
      message: >-
        replication controller "sipgc-api-seguranca-des-140" successfully rolled
        out
  replicas: 1
  readyReplicas: 1
