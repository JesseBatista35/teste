kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
    openshift.io/generated-by: OpenShiftNewApp
  resourceVersion: '2079500997'
  name: siabm-autenticacao-api-des
  uid: bec481b3-74d0-4438-b1b5-d48afb1e9568
  creationTimestamp: '2024-08-08T17:30:55Z'
  generation: 1437
  managedFields:
    - manager: kubectl-label
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2024-08-08T17:30:56Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:labels':
            'f:UNIDADE': {}
    - manager: Mozilla
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-01-13T12:51:07Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:metadata':
              'f:labels':
                'f:UNIDADE': {}
            'f:spec':
              'f:containers':
                'k:{"name":"siabm-autenticacao-api-des"}':
                  'f:livenessProbe':
                    'f:exec':
                      .: {}
                      'f:command': {}
                    'f:initialDelaySeconds': {}
                    'f:periodSeconds': {}
                    'f:timeoutSeconds': {}
                  'f:readinessProbe':
                    'f:exec':
                      .: {}
                      'f:command': {}
                    'f:initialDelaySeconds': {}
                    'f:periodSeconds': {}
                    'f:timeoutSeconds': {}
                  'f:resources':
                    'f:requests':
                      'f:cpu': {}
    - manager: kubectl-set
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-03T13:05:19Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:spec':
              'f:containers':
                'k:{"name":"siabm-autenticacao-api-des"}':
                  'f:image': {}
                  'f:volumeMounts':
                    'k:{"mountPath":"/tmp/standalone-okd.xml"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/hsm_loadbalance-des.cfg"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/caixa-truststore-acteste-nprd.jks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    .: {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/VAULT.dat"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/jboss.keystore"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/standalone/configuration/dskeystore_siabm_des.jceks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
                    'k:{"mountPath":"/opt/jboss/bin/standalone.conf"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
              'f:volumes':
                'k:{"name":"jboss-config-siabm-autenticacao-api"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"dskeystore-siabm-des-jceks"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"hsm-config-siabm-autenticacao-api"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                .: {}
                'k:{"name":"caixa-truststore-acteste-nprd-jks"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"vault-siabm-autenticacao-api"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
                'k:{"name":"jboss-keystore"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"accaixa-v4"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"java-config-siabm-autenticacao-api"}':
                  .: {}
                  'f:configMap':
                    .: {}
                    'f:defaultMode': {}
                    'f:name': {}
                  'f:name': {}
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-15T13:19:59Z'
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
                'k:{"name":"siabm-autenticacao-api-des"}':
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
                      'f:memory': {}
                  'f:livenessProbe':
                    .: {}
                    'f:failureThreshold': {}
                    'f:successThreshold': {}
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
                    'f:successThreshold': {}
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
      time: '2026-07-15T13:57:11Z'
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
                'k:{"name":"siabm-autenticacao-api-des"}':
                  'f:volumeMounts':
                    'k:{"mountPath":"/usr/src/app/secrets_files"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
              'f:imagePullSecrets':
                .: {}
                'k:{"name":"registry-secret"}': {}
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
    - manager: openshift-controller-manager
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-07-15T14:07:46Z'
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
  namespace: siabm-des
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    UNIDADE: BR
    app: siabm-autenticacao-api-des
    application: siabm-autenticacao-api-des
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
    name: siabm-autenticacao-api-des
  template:
    metadata:
      name: siabm-autenticacao-api-des
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        UNIDADE: BR
        app: siabm-autenticacao-api-des
        name: siabm-autenticacao-api-des
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
                  name: bt-client-secret-siabm-autenticacao-api-des
                  key: BT_CLIENT_ID
            - name: CLIENT_SECRET
              valueFrom:
                secretKeyRef:
                  name: bt-client-secret-siabm-autenticacao-api-des
                  key: BT_CLIENT_SECRET
            - name: BT_API_VERSION
              value: '3.1'
            - name: SECRETS_LIST
              value: >-
                SIABM_DES/CLISERABM_SSO_ID,SIABM_DES/CLISERABM_SSO_INTRA,SIABM_DES/SABMSD01_HSM,SIABM_DES/SIABM_AZURE_ACCOUNT_KEY,SIABM_DES/SIABM_BT_APIKEY,SIABM_DES/SIABM_GBS_APP_ID,SIABM_DES/SIABM_GBS_GUID,SIABM_DES/SIABM_GBS_KEY,SIABM_DES/SIABM_T4_APIKEY,SIABM_DES/SIABM_T4_SECRET,SIABM_DES/SABMDS08_ORACLE
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
                SIABM_DES/CLISERABM_SSO_ID,SIABM_DES/CLISERABM_SSO_INTRA,SIABM_DES/SABMSD01_HSM,SIABM_DES/SIABM_AZURE_ACCOUNT_KEY,SIABM_DES/SIABM_BT_APIKEY,SIABM_DES/SIABM_GBS_APP_ID,SIABM_DES/SIABM_GBS_GUID,SIABM_DES/SIABM_GBS_KEY,SIABM_DES/SIABM_T4_APIKEY,SIABM_DES/SIABM_T4_SECRET,SIABM_DES/SABMDS08_ORACLE
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
              cpu: 200m
              memory: 2Gi
          readinessProbe:
            exec:
              command:
                - /bin/bash
                - '-c'
                - /opt/jboss/bin/readinessProbe.sh
            initialDelaySeconds: 160
            timeoutSeconds: 180
            periodSeconds: 30
            successThreshold: 1
            failureThreshold: 3
          terminationMessagePath: /dev/termination-log
          name: siabm-autenticacao-api-des
          livenessProbe:
            exec:
              command:
                - /bin/bash
                - '-c'
                - /opt/jboss/bin/livenessProbe.sh
            initialDelaySeconds: 160
            timeoutSeconds: 180
            periodSeconds: 30
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
            - name: caixa-truststore-acteste-nprd-jks
              mountPath: /caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
            - name: accaixa-v4
              mountPath: >-
                /opt/jboss/standalone/configuration/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
            - name: secrets
              mountPath: /usr/src/app/secrets_files
            - name: vault-siabm-autenticacao-api
              mountPath: /opt/jboss/standalone/configuration/VAULT.dat
              subPath: VAULT.dat
            - name: jboss-keystore
              mountPath: /opt/jboss/standalone/configuration/jboss.keystore
              subPath: jboss.keystore
            - name: dskeystore-siabm-des-jceks
              mountPath: /opt/jboss/standalone/configuration/dskeystore_siabm_des.jceks
              subPath: dskeystore_siabm_des.jceks
            - name: hsm-config-siabm-autenticacao-api
              mountPath: /opt/jboss/standalone/configuration/hsm_loadbalance-des.cfg
              subPath: hsm_loadbalance-des.cfg
            - name: jboss-config-siabm-autenticacao-api
              mountPath: /tmp/standalone-okd.xml
              subPath: standalone-okd.xml
            - name: java-config-siabm-autenticacao-api
              mountPath: /opt/jboss/bin/standalone.conf
              subPath: standalone.conf
          terminationMessagePolicy: File
          image: >-
            default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabm-autenticacao-api:7.1.2.0-SNAPSHOT
      volumes:
        - name: caixa-truststore-acteste-nprd-jks
          secret:
            secretName: caixa-truststore-acteste-nprd-jks
            defaultMode: 420
        - name: accaixa-v4
          secret:
            secretName: accaixa-v4
            defaultMode: 420
        - name: secrets
          emptyDir:
            medium: Memory
        - name: script-bt-volume
          configMap:
            name: siabm-autenticacao-api-des-script-bt-check
            defaultMode: 420
        - name: vault-siabm-autenticacao-api
          configMap:
            name: vault-siabm-autenticacao-api
            defaultMode: 420
        - name: jboss-keystore
          secret:
            secretName: jboss-keystore
            defaultMode: 420
        - name: dskeystore-siabm-des-jceks
          secret:
            secretName: dskeystore-siabm-des-jceks
            defaultMode: 420
        - name: hsm-config-siabm-autenticacao-api
          configMap:
            name: hsm-config-siabm-autenticacao-api
            defaultMode: 420
        - name: jboss-config-siabm-autenticacao-api
          configMap:
            name: jboss-config-siabm-autenticacao-api
            defaultMode: 420
        - name: java-config-siabm-autenticacao-api
          configMap:
            name: java-config-siabm-autenticacao-api
            defaultMode: 420
      dnsPolicy: ClusterFirst
status:
  latestVersion: 198
  observedGeneration: 1437
  replicas: 1
  updatedReplicas: 0
  availableReplicas: 0
  unavailableReplicas: 1
  details:
    message: manual change
    causes:
      - type: Manual
  conditions:
    - type: Available
      status: 'False'
      lastUpdateTime: '2026-07-15T14:03:13Z'
      lastTransitionTime: '2026-07-15T14:03:13Z'
      message: Deployment config does not have minimum availability.
    - type: Progressing
      status: 'False'
      lastUpdateTime: '2026-07-15T14:07:46Z'
      lastTransitionTime: '2026-07-15T14:07:46Z'
      reason: ProgressDeadlineExceeded
      message: >-
        replication controller "siabm-autenticacao-api-des-198" has failed
        progressing
