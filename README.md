Bom dia, 

Solicito por gentileza equiparar as configurações de health checks no projeto sircl-backend no OKD4 em tqs da mesma forma que foi aplicado em des. 

Atenciosamente,


DES


kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
  resourceVersion: '2096746705'
  name: sircl-backend-des
  uid: e13683aa-a8fe-4fdc-9f1a-0922d0032d8e
  creationTimestamp: '2026-04-15T17:23:37Z'
  generation: 487
  managedFields:
    - manager: kubectl-create
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-04-15T17:23:37Z'
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
                'k:{"name":"sircl-backend-des"}':
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
                    'f:timeoutSeconds': {}
                  'f:env':
                    .: {}
                    'k:{"name":"INSTANCE_IP"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:fieldRef': {}
                    'k:{"name":"TZ"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:readinessProbe':
                    .: {}
                    'f:failureThreshold': {}
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
                      'f:name': {}
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
      time: '2026-04-15T17:23:45Z'
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
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-04-25T00:44:33Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sircl-backend-des"}':
                  'f:livenessProbe':
                    'f:initialDelaySeconds': {}
                    'f:tcpSocket':
                      .: {}
                      'f:port': {}
                  'f:readinessProbe':
                    'f:initialDelaySeconds': {}
                    'f:tcpSocket':
                      .: {}
                      'f:port': {}
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                      'f:memory': {}
                    'f:requests':
                      'f:cpu': {}
                      'f:memory': {}
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-23T13:59:44Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sircl-backend-des"}':
                  'f:env':
                    'k:{"name":"FRONTEND_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"JAVA_OPTIONS_APPEND"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"JAVA_OPTS_MONITORING"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIRCL_BACKEND_CONNECTION_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIRCL_BACKEND_CONNECTION_USER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIRCL_VERSION"}':
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
                    'k:{"mountPath":"/opt/jboss/standalone/configuration"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                    'k:{"mountPath":"/sircl"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
              'f:volumes':
                .: {}
                'k:{"name":"caixa-truststore-acteste-nprd"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"serverjks"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"sircl-backend-data-des"}':
                  .: {}
                  'f:name': {}
                  'f:persistentVolumeClaim':
                    .: {}
                    'f:claimName': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-23T14:01:28Z'
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
  namespace: sircl-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sircl-backend-des
    application: sircl-backend-des
    template: springboot-caixa-release
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
    name: sircl-backend-des
  template:
    metadata:
      name: sircl-backend-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sircl-backend-des
        name: sircl-backend-des
    spec:
      volumes:
        - name: caixa-truststore-acteste-nprd
          secret:
            secretName: caixa-truststore-acteste-nprd
            defaultMode: 420
        - name: sircl-backend-data-des
          persistentVolumeClaim:
            claimName: sircl-backend-data-des
        - name: serverjks
          secret:
            secretName: serverjks
            defaultMode: 420
      containers:
        - resources:
            limits:
              cpu: '2'
              memory: 4Gi
            requests:
              cpu: '1'
              memory: 2Gi
          readinessProbe:
            tcpSocket:
              port: 8080
            initialDelaySeconds: 60
            timeoutSeconds: 3
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: sircl-backend-des
          livenessProbe:
            tcpSocket:
              port: 8080
            initialDelaySeconds: 60
            timeoutSeconds: 3
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          env:
            - name: TZ
              value: America/Sao_Paulo
            - name: INSTANCE_IP
              valueFrom:
                fieldRef:
                  apiVersion: v1
                  fieldPath: status.podIP
            - name: FRONTEND_URL
              value: 'https://sircl-frontend-des.apps.nprd.caixa'
            - name: JAVA_OPTIONS_APPEND
              value: >-
                -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
            - name: JAVA_OPTS_MONITORING
              value: >-
                -javaagent:/opt/apm_agent/elastic-apm-agent.jar
                -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties
                -Delastic.apm.service_name=sircl-backend
                -Delastic.apm.environment=des
                -Delastic.apm.application_packages=br.gov.caixa
                -Delastic.apm.server_urls=http://apm-server-devops.produtos4.caixa
                -Delastic.apm.global_labels=deployment=sircl-backend
                -Delastic.apm.verify_server_cert=false
            - name: SIRCL_BACKEND_CONNECTION_URL
              value: >-
                jdbc:oracle:thin:@cnpexdadvm01-scan11.extra.caixa.gov.br:1521/ORAT01BC
            - name: SIRCL_BACKEND_CONNECTION_USER
              value: SRCLBD01
            - name: SIRCL_VERSION
              value: 27.0.0
          ports:
            - name: web
              containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: caixa-truststore-acteste-nprd
              mountPath: /deployments/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
            - name: sircl-backend-data-des
              mountPath: /sircl
            - name: serverjks
              mountPath: /opt/jboss/standalone/configuration
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sircl-backend:1.0.0.1
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  observedGeneration: 487
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 73
  updatedReplicas: 1
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-05-12T19:50:25Z'
      lastTransitionTime: '2026-05-12T19:50:25Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-07-23T14:01:28Z'
      lastTransitionTime: '2026-07-23T14:01:23Z'
      reason: NewReplicationControllerAvailable
      message: replication controller "sircl-backend-des-73" successfully rolled out
  replicas: 1
  readyReplicas: 1








TQS


kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  name: sircl-backend-tqs
  namespace: sircl-tqs
  uid: 8d69e864-5211-4407-bfa2-86bb72f9b761
  resourceVersion: '2097587449'
  generation: 42
  creationTimestamp: '2026-07-23T14:02:27Z'
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sircl-backend-tqs
    application: sircl-backend-tqs
    template: springboot-caixa-release
  annotations:
    description: Defines how to deploy the application server
  managedFields:
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-23T23:33:28Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sircl-backend-tqs"}':
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/sircl"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
              'f:volumes':
                .: {}
                'k:{"name":"sircl-backend-data-tqs"}':
                  .: {}
                  'f:name': {}
                  'f:persistentVolumeClaim':
                    .: {}
                    'f:claimName': {}
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-23T23:40:17Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sircl-backend-tqs"}':
                  'f:livenessProbe':
                    'f:tcpSocket':
                      .: {}
                      'f:port': {}
                  'f:readinessProbe':
                    'f:tcpSocket':
                      .: {}
                      'f:port': {}
                  'f:resources':
                    'f:limits':
                      'f:cpu': {}
                      'f:memory': {}
                    'f:requests':
                      'f:cpu': {}
                      'f:memory': {}
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-23T23:41:07Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:description': {}
          'f:labels':
            .: {}
            'f:CGC_DES': {}
            'f:CGC_OPS': {}
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
                'f:CGC_DES': {}
                'f:CGC_OPS': {}
                'f:app': {}
                'f:name': {}
              'f:name': {}
            'f:spec':
              .: {}
              'f:containers':
                .: {}
                'k:{"name":"sircl-backend-tqs"}':
                  .: {}
                  'f:env':
                    .: {}
                    'k:{"name":"FRONTEND_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"INSTANCE_IP"}':
                      .: {}
                      'f:name': {}
                      'f:valueFrom':
                        .: {}
                        'f:fieldRef': {}
                    'k:{"name":"JAVA_OPTIONS_APPEND"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"JAVA_OPTS_MONITORING"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIRCL_BACKEND_CONNECTION_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIRCL_BACKEND_CONNECTION_USER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"SIRCL_VERSION"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"TZ"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                  'f:image': {}
                  'f:imagePullPolicy': {}
                  'f:livenessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:initialDelaySeconds': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                    'f:timeoutSeconds': {}
                  'f:name': {}
                  'f:ports':
                    .: {}
                    'k:{"containerPort":8080,"protocol":"TCP"}':
                      .: {}
                      'f:containerPort': {}
                      'f:name': {}
                      'f:protocol': {}
                  'f:readinessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:initialDelaySeconds': {}
                    'f:periodSeconds': {}
                    'f:successThreshold': {}
                    'f:timeoutSeconds': {}
                  'f:resources':
                    .: {}
                    'f:limits': {}
                    'f:requests': {}
                  'f:terminationMessagePath': {}
                  'f:terminationMessagePolicy': {}
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
      time: '2026-07-23T23:42:57Z'
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
    name: sircl-backend-tqs
  template:
    metadata:
      name: sircl-backend-tqs
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sircl-backend-tqs
        name: sircl-backend-tqs
    spec:
      volumes:
        - name: sircl-backend-data-tqs
          persistentVolumeClaim:
            claimName: sircl-backend-data-tqs
      containers:
        - name: sircl-backend-tqs
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sircl-backend:1.0.0.1
          ports:
            - name: web
              containerPort: 8080
              protocol: TCP
          env:
            - name: TZ
              value: America/Sao_Paulo
            - name: INSTANCE_IP
              valueFrom:
                fieldRef:
                  apiVersion: v1
                  fieldPath: status.podIP
            - name: FRONTEND_URL
              value: 'https://sircl-frontend-tqs.apps.nprd.caixa'
            - name: JAVA_OPTIONS_APPEND
              value: >-
                -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
            - name: JAVA_OPTS_MONITORING
              value: >-
                -javaagent:/opt/apm_agent/elastic-apm-agent.jar
                -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties
                -Delastic.apm.service_name=sircl-backend
                -Delastic.apm.environment=tqs
                -Delastic.apm.application_packages=br.gov.caixa
                -Delastic.apm.server_urls=
                -Delastic.apm.global_labels=deployment=sircl-backend
                -Delastic.apm.verify_server_cert=false
            - name: SIRCL_BACKEND_CONNECTION_URL
              value: >-
                jdbc:oracle:thin:@cnpexdadvm01-scan11.extra.caixa.gov.br:1521/ORAT01BC
            - name: SIRCL_BACKEND_CONNECTION_USER
              value: SRCLBD01
            - name: SIRCL_VERSION
              value: 27.0.0
          resources:
            limits:
              cpu: '2'
              memory: 4Gi
            requests:
              cpu: '1'
              memory: 2Gi
          volumeMounts:
            - name: sircl-backend-data-tqs
              mountPath: /sircl
          livenessProbe:
            tcpSocket:
              port: 8080
            initialDelaySeconds: 60
            timeoutSeconds: 3
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          readinessProbe:
            tcpSocket:
              port: 8080
            initialDelaySeconds: 60
            timeoutSeconds: 3
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
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
  latestVersion: 6
  observedGeneration: 42
  replicas: 1
  updatedReplicas: 1
  availableReplicas: 1
  unavailableReplicas: 0
  details:
    message: manual change
    causes:
      - type: Manual
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-07-23T23:40:10Z'
      lastTransitionTime: '2026-07-23T23:40:10Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-07-23T23:42:57Z'
      lastTransitionTime: '2026-07-23T23:42:52Z'
      reason: NewReplicationControllerAvailable
      message: replication controller "sircl-backend-tqs-6" successfully rolled out
  readyReplicas: 1

