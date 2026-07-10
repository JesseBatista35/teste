esse é o de des:

kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  resourceVersion: '2067506044'
  name: sisam-backend-internet-des
  uid: 0c94f2a4-da11-4f76-bca1-b35e502098b9
  creationTimestamp: '2025-06-05T14:22:29Z'
  generation: 252
  managedFields:
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2025-06-05T14:22:29Z'
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
                'k:{"name":"sisam-backend-internet-des"}':
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources':
                    .: {}
                    'f:limits':
                      .: {}
                      'f:cpu': {}
                      'f:memory': {}
                    'f:requests':
                      .: {}
                      'f:cpu': {}
                      'f:memory': {}
                  'f:livenessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:initialDelaySeconds': {}
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
                    'k:{"containerPort":8778,"protocol":"TCP"}':
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
      time: '2025-06-05T14:22:32Z'
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
      time: '2026-01-27T16:55:58Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:labels':
            'f:UNIDADE': {}
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sisam-backend-internet-des"}':
                  'f:livenessProbe':
                    'f:httpGet':
                      .: {}
                      'f:path': {}
                      'f:port': {}
                      'f:scheme': {}
                  'f:readinessProbe':
                    'f:httpGet':
                      .: {}
                      'f:path': {}
                      'f:port': {}
                      'f:scheme': {}
                  'f:volumeMounts':
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
              'f:volumes':
                'k:{"name":"accaixa-v4"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-09T22:48:25Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sisam-backend-internet-des"}':
                  'f:image': {}
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/opt/jboss/bin/standalone.conf"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/VAULT.dat"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/vault-sisam-internet-des.keystore"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/tmp/standalone-okd.xml"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
              'f:volumes':
                .: {}
                'k:{"name":"java-config-sisam-backend-internet"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"jboss-config-sisam-backend-internet"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"vault-sisam-backend-internet"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"vault-sisam-internet-keystore"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-09T22:50:17Z'
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
  namespace: sisam-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: sisam-backend-internet-des
    application: sisam-backend-internet-des
    template: jboss-caixa-release
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
    name: sisam-backend-internet-des
  template:
    metadata:
      name: sisam-backend-internet-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sisam-backend-internet-des
        name: sisam-backend-internet-des
      annotations:
        openshift.io/generated-by: OpenShiftNewApp
    spec:
      volumes:
        - name: accaixa-v4
          secret:
            secretName: accaixa-v4
            defaultMode: 420
        - name: vault-sisam-backend-internet
          configMap:
            name: vault-sisam-backend-internet
            defaultMode: 420
        - name: vault-sisam-internet-keystore
          secret:
            secretName: vault-sisam-internet-keystore
            defaultMode: 420
        - name: jboss-config-sisam-backend-internet
          configMap:
            name: jboss-config-sisam-backend-internet
            defaultMode: 420
        - name: java-config-sisam-backend-internet
          configMap:
            name: java-config-sisam-backend-internet
            defaultMode: 420
      containers:
        - resources:
            limits:
              cpu: '1'
              memory: 2Gi
            requests:
              cpu: 10m
              memory: 2Gi
          readinessProbe:
            httpGet:
              path: /sisam-internet/rest/administracao/v1/health/readiness
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 60
            timeoutSeconds: 1
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: sisam-backend-internet-des
          livenessProbe:
            httpGet:
              path: /sisam-internet/rest/administracao/v1/health/liveness
              port: 8080
              scheme: HTTP
            initialDelaySeconds: 60
            timeoutSeconds: 1
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
          ports:
            - name: jmx
              containerPort: 8778
              protocol: TCP
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: accaixa-v4
              mountPath: >-
                /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
            - name: vault-sisam-backend-internet
              mountPath: /opt/jboss/standalone/configuration/VAULT.dat
              subPath: VAULT.dat
            - name: vault-sisam-internet-keystore
              mountPath: >-
                /opt/jboss/standalone/configuration/vault-sisam-internet-des.keystore
              subPath: vault-sisam-internet-des.keystore
            - name: jboss-config-sisam-backend-internet
              mountPath: /tmp/standalone-okd.xml
              subPath: standalone-okd.xml
            - name: java-config-sisam-backend-internet
              mountPath: /opt/jboss/bin/standalone.conf
              subPath: standalone.conf
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisam-backend-internet:0.0.0.1
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  observedGeneration: 252
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 51
  updatedReplicas: 1
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-07-08T09:26:06Z'
      lastTransitionTime: '2026-07-08T09:26:06Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-07-09T22:50:17Z'
      lastTransitionTime: '2026-07-09T22:50:13Z'
      reason: NewReplicationControllerAvailable
      message: >-
        replication controller "sisam-backend-internet-des-51" successfully
        rolled out
  replicas: 1
  readyReplicas: 1


Esse é o de tqs:


kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
  resourceVersion: '2069269546'
  name: sisam-backend-internet-tqs
  uid: 2a7a10db-d004-4fee-9bd3-18b06d6a1ad0
  creationTimestamp: '2026-07-09T22:51:40Z'
  generation: 30
  managedFields:
    - manager: kubectl-create
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-09T22:51:40Z'
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
                'k:{"name":"sisam-backend-internet-tqs"}':
                  'f:terminationMessagePolicy': {}
                  .: {}
                  'f:resources':
                    .: {}
                    'f:limits':
                      .: {}
                      'f:cpu': {}
                      'f:memory': {}
                    'f:requests':
                      .: {}
                      'f:cpu': {}
                      'f:memory': {}
                  'f:livenessProbe':
                    .: {}
                    'f:exec':
                      .: {}
                      'f:command': {}
                    'f:failureThreshold': {}
                    'f:initialDelaySeconds': {}
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
                    'f:exec':
                      .: {}
                      'f:command': {}
                    'f:failureThreshold': {}
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
                    'k:{"containerPort":8778,"protocol":"TCP"}':
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
      time: '2026-07-09T22:51:45Z'
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
      time: '2026-07-10T18:28:37Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"sisam-backend-internet-tqs"}':
                  'f:image': {}
                  'f:volumeMounts':
                    .: {}
                    'k:{"mountPath":"/opt/jboss/bin/standalone.conf"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/VAULT.dat"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/vault-sisam-internet-tqs.keystore"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/tmp/standalone-okd.xml"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
              'f:volumes':
                .: {}
                'k:{"name":"java-config-sisam-backend-internet"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"jboss-config-sisam-backend-internet"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"vault-sisam-backend-internet"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"vault-sisam-internet-keystore"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'f:volumes':
                'k:{"name":"accaixa-v4"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}        
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-10T18:29:03Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:status':
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
              'f:status': {}
              'f:type': {}
          'f:observedGeneration': {}
          'f:replicas': {}
          'f:unavailableReplicas': {}
          'f:updatedReplicas': {}
      subresource: status
  namespace: sisam-tqs
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sisam-backend-internet-tqs
    application: sisam-backend-internet-tqs
    template: jboss-caixa-release
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
    name: sisam-backend-internet-tqs
  template:
    metadata:
      name: sisam-backend-internet-tqs
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sisam-backend-internet-tqs
        name: sisam-backend-internet-tqs
    spec:
      volumes:
        - name: accaixa-v4
          secret:
            secretName: accaixa-v4
            defaultMode: 420
        - name: vault-sisam-backend-internet
          configMap:
            name: vault-sisam-backend-internet
            defaultMode: 420
        - name: vault-sisam-internet-keystore
          secret:
            secretName: vault-sisam-internet-keystore
            defaultMode: 420
        - name: jboss-config-sisam-backend-internet
          configMap:
            name: jboss-config-sisam-backend-internet
            defaultMode: 420
        - name: java-config-sisam-backend-internet
          configMap:
            name: java-config-sisam-backend-internet
            defaultMode: 420
      containers:
        - resources:
            limits:
              cpu: '1'
              memory: 2Gi
            requests:
              cpu: 10m
              memory: 2Gi
          readinessProbe:
            exec:
              command:
                - /bin/bash
                - '-c'
                - /opt/jboss/bin/readinessProbe.sh
            initialDelaySeconds: 60
            timeoutSeconds: 1
            periodSeconds: 10
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: sisam-backend-internet-tqs
          livenessProbe:
            exec:
              command:
                - /bin/bash
                - '-c'
                - /opt/jboss/bin/livenessProbe.sh
            initialDelaySeconds: 60
            timeoutSeconds: 1
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
          ports:
            - name: jmx
              containerPort: 8778
              protocol: TCP
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: accaixa-v4
              mountPath: >-
                /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
            - name: vault-sisam-backend-internet
              mountPath: /opt/jboss/standalone/configuration/VAULT.dat
              subPath: VAULT.dat
            - name: vault-sisam-internet-keystore
              mountPath: >-
                /opt/jboss/standalone/configuration/vault-sisam-internet-tqs.keystore
              subPath: vault-sisam-internet-tqs.keystore
            - name: jboss-config-sisam-backend-internet
              mountPath: /tmp/standalone-okd.xml
              subPath: standalone-okd.xml
            - name: java-config-sisam-backend-internet
              mountPath: /opt/jboss/bin/standalone.conf
              subPath: standalone.conf
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisam-backend-internet:0.0.0.1
      restartPolicy: Always
      terminationGracePeriodSeconds: 30
      dnsPolicy: ClusterFirst
      securityContext: {}
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
status:
  latestVersion: 5
  observedGeneration: 30
  replicas: 1
  updatedReplicas: 1
  availableReplicas: 0
  unavailableReplicas: 1
  details:
    message: manual change
    causes:
      - type: Manual
  conditions:
    - type: Available
      status: 'False'
      lastUpdateTime: '2026-07-09T22:51:40Z'
      lastTransitionTime: '2026-07-09T22:51:40Z'
      message: Deployment config does not have minimum availability.
    - type: Progressing
      status: Unknown
      lastUpdateTime: '2026-07-10T18:29:00Z'
      lastTransitionTime: '2026-07-10T18:29:00Z'
      message: >-
        replication controller "sisam-backend-internet-tqs-5" is waiting for pod
        "sisam-backend-internet-tqs-5-deploy" to run
