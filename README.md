kind: DeploymentConfig
apiVersion: apps.openshift.io/v1
metadata:
  annotations:
    description: Defines how to deploy the application server
  resourceVersion: '1375218790'
  name: sispl-consulta-transacao-ocp4-tqs
  uid: 647e8f69-7f38-4c9e-a11c-815987faf935
  creationTimestamp: '2026-05-11T13:04:41Z'
  generation: 291
  managedFields:
    - manager: kubectl-create
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-05-11T13:04:41Z'
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
                'k:{"name":"sispl-consulta-transacao-ocp4-tqs"}':
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
      time: '2026-06-16T12:24:21Z'
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
    - manager: oc
      operation: Update
      apiVersion: apps.openshift.io/v1
      time: '2026-06-16T18:39:56Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:spec':
          'f:template':
            'f:metadata':
              'f:annotations':
                .: {}
                'f:sidecar.istio.io/inject': {}
            'f:spec':
              'f:containers':
                'k:{"name":"sispl-consulta-transacao-ocp4-tqs"}':
                  'f:env':
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_DRIVER"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_NEW_CONNECTION_SQL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_MIN_SIZE"}':
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
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_URL"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_ACQUISITION_TIMEOUT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_LOG_LEVEL"}':
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
                    'k:{"name":"QUARKUS_DATASOURCE_JDBC_INITIAL_SIZE"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_USERNAME"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_OIDC_ROLES_ROLE_CLAIM_PATH"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"QUARKUS_DATASOURCE_METRICS_ENABLED"}':
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
                    'k:{"name":"QUARKUS_OIDC_CLIENT_CONNECTION_TIMEOUT"}':
                      .: {}
                      'f:name': {}
                      'f:value': {}
                    'k:{"name":"DIAS_EXPURGO"}':
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
                    'k:{"mountPath":"/deployments/caixa-truststore-cedesbr_azurepush_atualizado2024.jks"}':
                      .: {}
                      'f:mountPath': {}
                      'f:name': {}
                      'f:subPath': {}
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
                .: {}
                'k:{"name":"caixa-truststore-acteste-nprd"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
                'k:{"name":"caixa-truststore-cedesbr-azurepush-atualizado2024"}':
                  .: {}
                  'f:name': {}
                  'f:secret':
                    .: {}
                    'f:defaultMode': {}
                    'f:secretName': {}
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
      time: '2026-06-16T18:40:57Z'
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
  namespace: sispl-tqs
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sispl-consulta-transacao-ocp4-tqs
    application: sispl-consulta-transacao-ocp4-tqs
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
    name: sispl-consulta-transacao-ocp4-tqs
  template:
    metadata:
      name: sispl-consulta-transacao-ocp4-tqs
      creationTimestamp: null
      labels:
        CGC_DES: '7390'
        CGC_OPS: '7259'
        app: sispl-consulta-transacao-ocp4-tqs
        name: sispl-consulta-transacao-ocp4-tqs
      annotations:
        sidecar.istio.io/inject: 'true'
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
                  name: bt-client-secret-sispl-consulta-transacao-ocp4-tqs
                  key: BT_CLIENT_ID
            - name: CLIENT_SECRET
              valueFrom:
                secretKeyRef:
                  name: bt-client-secret-sispl-consulta-transacao-ocp4-tqs
                  key: BT_CLIENT_SECRET
            - name: BT_API_VERSION
              value: '3.1'
            - name: SECRETS_LIST
              value: SISPL_TQS/SSPLTB01_DB2
            - name: BT_VERIFY_CA
              value: 'False'
          securityContext:
            runAsUser: 1337
          imagePullPolicy: IfNotPresent
          volumeMounts:
            - name: secrets
              mountPath: /usr/src/app/secrets_files
          terminationMessagePolicy: File
          image: 'default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2'
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
              value: SISPL_TQS/SSPLTB01_DB2
          imagePullPolicy: IfNotPresent
          volumeMounts:
            - name: secrets
              mountPath: /usr/src/app/secrets_files
            - name: script-bt-volume
              mountPath: /script
          terminationMessagePolicy: File
          image: 'default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552'
      imagePullSecrets:
        - name: registry-secret
      schedulerName: default-scheduler
      terminationGracePeriodSeconds: 30
      securityContext: {}
      containers:
        - resources:
            limits:
              cpu: '1'
              memory: 1Gi
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
          name: sispl-consulta-transacao-ocp4-tqs
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
            - name: DIAS_EXPURGO
              value: '3'
            - name: JAVA_OPTIONS_APPEND
              value: '-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks'
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
            - name: QUARKUS_DATASOURCE_JDBC_NEW_CONNECTION_SQL
              value: SELECT 1 FROM SYSIBM.SYSDUMMY1 WITH UR
            - name: QUARKUS_DATASOURCE_JDBC_URL
              value: 'jdbc:db2://10.192.224.102:5031/CSD4'
            - name: QUARKUS_DATASOURCE_METRICS_ENABLED
              value: 'true'
            - name: QUARKUS_DATASOURCE_PASSWORD
              value: '${SSPLTB01_DB2}'
            - name: QUARKUS_DATASOURCE_USERNAME
              value: SSPLTB01
            - name: QUARKUS_LOG_LEVEL
              value: DEBUG
            - name: QUARKUS_OIDC_AUTH_SERVER_URL
              value: 'https://logintqs.caixa.gov.br/auth/realms/internet'
            - name: QUARKUS_OIDC_CLIENT_CONNECTION_TIMEOUT
              value: '5000'
            - name: QUARKUS_OIDC_ROLES_ROLE_CLAIM_PATH
              value: realm_access/roles
            - name: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
              valueFrom:
                secretKeyRef:
                  name: sispl-consulta-transacao-ocp4-tqs
                  key: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
          ports:
            - containerPort: 8080
              protocol: TCP
          imagePullPolicy: Always
          volumeMounts:
            - name: secrets
              mountPath: /usr/src/app/secrets_files
            - name: caixa-truststore-cedesbr-azurepush-atualizado2024
              mountPath: /deployments/caixa-truststore-cedesbr_azurepush_atualizado2024.jks
              subPath: caixa-truststore-cedesbr_azurepush_atualizado2024.jks
            - name: caixa-truststore-acteste-nprd
              mountPath: /deployments/caixa-truststore-acteste-nprd.jks
              subPath: caixa-truststore-acteste-nprd.jks
          terminationMessagePolicy: File
          image: 'default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sispl-consulta-transacao:1.1.1.2'
      volumes:
        - name: secrets
          emptyDir:
            medium: Memory
        - name: script-bt-volume
          configMap:
            name: sispl-consulta-transacao-ocp4-tqs-script-bt-check
            defaultMode: 420
        - name: caixa-truststore-cedesbr-azurepush-atualizado2024
          secret:
            secretName: caixa-truststore-cedesbr-azurepush-atualizado2024
            defaultMode: 420
        - name: caixa-truststore-acteste-nprd
          secret:
            secretName: caixa-truststore-acteste-nprd
            defaultMode: 420
      dnsPolicy: ClusterFirst
status:
  observedGeneration: 291
  details:
    message: manual change
    causes:
      - type: Manual
  availableReplicas: 1
  unavailableReplicas: 0
  latestVersion: 14
  updatedReplicas: 1
  conditions:
    - type: Available
      status: 'True'
      lastUpdateTime: '2026-06-16T12:22:49Z'
      lastTransitionTime: '2026-06-16T12:22:49Z'
      message: Deployment config has minimum availability.
    - type: Progressing
      status: 'True'
      lastUpdateTime: '2026-06-16T18:40:57Z'
      lastTransitionTime: '2026-06-16T18:40:54Z'
      reason: NewReplicationControllerAvailable
      message: replication controller "sispl-consulta-transacao-ocp4-tqs-14" successfully rolled out
  replicas: 1
  readyReplicas: 1






Solução via ConfigMap - Passo a Passo

PASSO 1: Criar o ConfigMap com o Certificado
bash

oc create configmap ca-logintqs --from-file=/tmp/logintqs.pem -n sispl-tqs

Verifique:
bash

oc get configmap ca-logintqs -n sispl-tqs -o yaml

PASSO 2: Editar o Deployment
bash
oc edit deployment sispl-consulta-transacao-ocp4-tqs -n sispl-tqs

Vai abrir um editor. Localize a seção spec.template.spec.containers e adicione isso:

yaml        volumeMounts:
        - name: ca-logintqs
          mountPath: /etc/ca-certs
          readOnly: true
        env:
        - name: JAVA_TOOL_OPTIONS
          value: "-Djavax.net.ssl.trustStoreType=PEM -Djavax.net.ssl.trustStore=/etc/ca-certs/logintqs.pem"

E logo após containers: (no mesmo nível), adicione volumes::
yaml      volumes:
      - name: ca-logintqs
        configMap:
          name: ca-logintqs

PASSO 3: Salvar e Sair do Editor

Se for vi: :wq + Enter
Se for nano: Ctrl+X, Y, Enter


PASSO 4: Verificar se foi Aplicado
bash
oc get deployment sispl-consulta-transacao-ocp4-tqs -n sispl-tqs -o yaml | grep -A10 "volumes:"

PASSO 5: Reiniciar o Deployment
bash

oc rollout restart deployment sispl-consulta-transacao-ocp4-tqs -n sispl-tqs

Acompanhe:
bash
oc get pods -w -n sispl-tqs | grep sispl-consulta-transacao-ocp4-tqs

PASSO 6: Verificar os Logs
Quando o pod voltar a rodar:
bash

oc logs -f deployment/sispl-consulta-transacao-ocp4-tqs -n sispl-tqs --tail=100

Procure por:

❌ NÃO deve ter: PKIX path building failed
✅ DEVE ter: Conexão bem-sucedida com OIDC


Quer que eu te mostre como fica o YAML completo antes de salvar? Pode copiar a seção exata se quiser ser mais seguro.
