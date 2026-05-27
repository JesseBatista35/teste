kind: Pod
apiVersion: v1
metadata:
  generateName: sisgf-backend-des-197-
  annotations:
    k8s.v1.cni.cncf.io/network-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.3.26.211"
          ],
          "default": true,
          "dns": {}
      }]
    k8s.v1.cni.cncf.io/networks-status: |-
      [{
          "name": "openshift-sdn",
          "interface": "eth0",
          "ips": [
              "25.3.26.211"
          ],
          "default": true,
          "dns": {}
      }]
    kubernetes.io/limit-ranger: >-
      LimitRanger plugin set: cpu request for init container
      secrets-agent-sidecar; cpu limit for init container secrets-agent-sidecar;
      cpu, memory request for init container secrets-check; cpu, memory limit
      for init container secrets-check
    openshift.io/deployment-config.latest-version: '197'
    openshift.io/deployment-config.name: sisgf-backend-des
    openshift.io/deployment.name: sisgf-backend-des-197
    openshift.io/generated-by: OpenShiftNewApp
    openshift.io/scc: anyuid
  resourceVersion: '1982020368'
  name: sisgf-backend-des-197-zhs8k
  uid: 4c159e4e-b909-40ba-bac5-350390febbb9
  creationTimestamp: '2026-05-27T18:02:54Z'
  managedFields:
    - manager: kube-controller-manager
      operation: Update
      apiVersion: v1
      time: '2026-05-27T18:02:54Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            .: {}
            'f:openshift.io/deployment-config.latest-version': {}
            'f:openshift.io/deployment-config.name': {}
            'f:openshift.io/deployment.name': {}
            'f:openshift.io/generated-by': {}
          'f:generateName': {}
          'f:labels':
            .: {}
            'f:CGC_DES': {}
            'f:CGC_OPS': {}
            'f:app': {}
            'f:deployment': {}
            'f:deploymentconfig': {}
            'f:name': {}
          'f:ownerReferences':
            .: {}
            'k:{"uid":"fe905555-535a-4e3b-9213-f47dad448792"}': {}
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
            'k:{"name":"sisgf-backend-des"}':
              'f:image': {}
              'f:volumeMounts':
                .: {}
                'k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}':
                  .: {}
                  'f:mountPath': {}
                  'f:name': {}
                  'f:subPath': {}
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
                'f:tcpSocket':
                  .: {}
                  'f:port': {}
                'f:timeoutSeconds': {}
              'f:env':
                'k:{"name":"QUARKUS_HIBERNATE_ORB_DIALECT"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"QUARKUS_OIDC_CREDENTIALS_SECRET"}':
                  .: {}
                  'f:name': {}
                  'f:valueFrom':
                    .: {}
                    'f:secretKeyRef': {}
                'k:{"name":"SISGF_BATCH_UNIDADES_URL"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"QUARKUS_DATASOURCE_JDBC_DRIVER"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"DB2_SIICO_USERNAME"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"HORA_LIMITE_CONTABILIZACAO"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"TZ"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"DB2_SIICO_PASSWORD"}':
                  .: {}
                  'f:name': {}
                  'f:valueFrom':
                    .: {}
                    'f:secretKeyRef': {}
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
                  'f:valueFrom':
                    .: {}
                    'f:secretKeyRef': {}
                'k:{"name":"EMAIL_SMTP_URL"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                .: {}
                'k:{"name":"SINAF_API_EVENTO_URL"}':
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
                'k:{"name":"DB2_SIICO_SCHEMA"}':
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
                'k:{"name":"EMAIL_FROM"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"EMAIL_DESTINATARIOS"}':
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
                'k:{"name":"DB2_SIICO_URL"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"SFTP_SERVER_IP"}':
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
                  'f:valueFrom':
                    .: {}
                    'f:secretKeyRef': {}
                'k:{"name":"EMAIL_SMTP_PORT"}':
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
                'k:{"name":"QUARKUS_DATASOURCE_PASSWORD"}':
                  .: {}
                  'f:name': {}
                  'f:valueFrom':
                    .: {}
                    'f:secretKeyRef': {}
                'k:{"name":"QUARKUS_HIBERNATE_ORM_PACKAGES"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"SFTP_PATH_DIR_LIST"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
                'k:{"name":"SFTP_PATH_ENTRADA"}':
                  .: {}
                  'f:name': {}
                  'f:value': {}
              'f:readinessProbe':
                .: {}
                'f:failureThreshold': {}
                'f:initialDelaySeconds': {}
                'f:periodSeconds': {}
                'f:successThreshold': {}
                'f:tcpSocket':
                  .: {}
                  'f:port': {}
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
                'f:requests':
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
          'f:enableServiceLinks': {}
          'f:securityContext': {}
    - manager: multus
      operation: Update
      apiVersion: v1
      time: '2026-05-27T18:02:56Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:metadata':
          'f:annotations':
            'f:k8s.v1.cni.cncf.io/network-status': {}
            'f:k8s.v1.cni.cncf.io/networks-status': {}
      subresource: status
    - manager: kubelet
      operation: Update
      apiVersion: v1
      time: '2026-05-27T19:20:55Z'
      fieldsType: FieldsV1
      fieldsV1:
        'f:status':
          'f:conditions':
            'k:{"type":"ContainersReady"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:message': {}
              'f:reason': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Initialized"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:status': {}
              'f:type': {}
            'k:{"type":"Ready"}':
              .: {}
              'f:lastProbeTime': {}
              'f:lastTransitionTime': {}
              'f:message': {}
              'f:reason': {}
              'f:status': {}
              'f:type': {}
          'f:containerStatuses': {}
          'f:hostIP': {}
          'f:initContainerStatuses': {}
          'f:phase': {}
          'f:podIP': {}
          'f:podIPs':
            .: {}
            'k:{"ip":"25.3.26.211"}':
              .: {}
              'f:ip': {}
          'f:startTime': {}
      subresource: status
  namespace: sisgf-des
  ownerReferences:
    - apiVersion: v1
      kind: ReplicationController
      name: sisgf-backend-des-197
      uid: fe905555-535a-4e3b-9213-f47dad448792
      controller: true
      blockOwnerDeletion: true
  labels:
    CGC_DES: '7390'
    CGC_OPS: '7259'
    app: sisgf-backend-des
    deployment: sisgf-backend-des-197
    deploymentconfig: sisgf-backend-des
    name: sisgf-backend-des
spec:
  restartPolicy: Always
  initContainers:
    - resources:
        limits:
          cpu: 150m
          memory: 400Mi
        requests:
          cpu: 150m
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
              name: bt-client-secret-sisgf-backend-des
              key: BT_CLIENT_ID
        - name: CLIENT_SECRET
          valueFrom:
            secretKeyRef:
              name: bt-client-secret-sisgf-backend-des
              key: BT_CLIENT_SECRET
        - name: BT_API_VERSION
          value: '3.1'
        - name: SECRETS_LIST
          value: >-
            SISGF_DES/SSGFDR01_SFTP,SISGF_DES/CLISERSGF_SSO_INTRA,SISGF_DES/SISGF_APIKEY,SISGF_DES/SSGFRD01_DB2,SISGF_DES/SSGFRD02_ORA
        - name: BT_VERIFY_CA
          value: 'False'
      securityContext:
        capabilities:
          drop:
            - MKNOD
        runAsUser: 1337
        runAsNonRoot: true
      imagePullPolicy: IfNotPresent
      volumeMounts:
        - name: secrets
          mountPath: /usr/src/app/secrets_files
        - name: kube-api-access-l5tvv
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePolicy: File
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
    - resources:
        limits:
          cpu: 150m
          memory: 256Mi
        requests:
          cpu: 150m
          memory: 256Mi
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
      securityContext:
        capabilities:
          drop:
            - MKNOD
      imagePullPolicy: IfNotPresent
      volumeMounts:
        - name: secrets
          mountPath: /usr/src/app/secrets_files
        - name: script-bt-volume
          mountPath: /script
        - name: kube-api-access-l5tvv
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePolicy: File
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
  serviceAccountName: default
  imagePullSecrets:
    - name: registry-secret
  priority: 0
  schedulerName: default-scheduler
  enableServiceLinks: true
  terminationGracePeriodSeconds: 30
  preemptionPolicy: PreemptLowerPriority
  nodeName: ceadecldlx057.nprd.caixa
  securityContext:
    seLinuxOptions:
      level: 's0:c68,c67'
  containers:
    - resources:
        limits:
          cpu: '1'
          memory: 1Gi
        requests:
          cpu: 200m
          memory: 1Gi
      readinessProbe:
        tcpSocket:
          port: 8080
        initialDelaySeconds: 180
        timeoutSeconds: 30
        periodSeconds: 10
        successThreshold: 1
        failureThreshold: 3
      terminationMessagePath: /dev/termination-log
      name: sisgf-backend-des
      livenessProbe:
        tcpSocket:
          port: 8080
        initialDelaySeconds: 180
        timeoutSeconds: 30
        periodSeconds: 10
        successThreshold: 1
        failureThreshold: 3
      env:
        - name: TZ
          value: America/Sao_Paulo
        - name: APPLICATIONINSIGHTS_CONNECTION_STRING
          value: >-
            InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
        - name: APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL
          value: INFO
        - name: APPLICATIONINSIGHTS_ROLE_NAME
          value: SISGF-backend-DES
        - name: APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE
          value: '3'
        - name: APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL
          value: INFO
        - name: DB2_SIICO_SCHEMA
          value: DESICO
        - name: DB2_SIICO_URL
          value: 'jdbc:db2://10.216.80.110:448/RJKDB2DSD0'
        - name: DB2_SIICO_USERNAME
          value: ssgfrd01
        - name: EMAIL_DESTINATARIOS
          value: jose.ibiapina@caixa.gov.br;daniel.e.araujo@caixa.gov.br
        - name: EMAIL_FROM
          value: sisgf.teste@caixa.gov.br
        - name: EMAIL_SMTP_PORT
          value: '25'
        - name: EMAIL_SMTP_URL
          value: smtptest.correiolivre.caixa
        - name: HORA_LIMITE_CONTABILIZACAO
          value: '18'
        - name: HTTPS_PROXY
          value: 'http://proxydes.caixa:80'
        - name: JAVA_OPTIONS_APPEND
          value: >-
            -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks 
            -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.5.1.jar
        - name: NO_PROXY
          value: '*.caixa,*.caixa.gov.br'
        - name: QUARKUS_DATASOURCE_DB_KIND
          value: other
        - name: QUARKUS_DATASOURCE_JDBC_DRIVER
          value: oracle.jdbc.driver.OracleDriver
        - name: QUARKUS_DATASOURCE_JDBC_MAX_SIZE
          value: '40'
        - name: QUARKUS_DATASOURCE_JDBC_URL
          value: 'jdbc:oracle:thin:@10.116.101.7:1521/orad01sc'
        - name: QUARKUS_DATASOURCE_USERNAME
          value: SSGFRD01
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
        - name: QUARKUS_LOG_LEVEL
          value: INFO
        - name: QUARKUS_OIDC_AUTH_SERVER_URL
          value: 'https://login.des.caixa/auth/realms/intranet'
        - name: SFTP_CLIENT_USER
          value: ssgfdr01
        - name: SFTP_PATH_DIR_LIST
          value: '/SINAF,/SIPAS,/sipas'
        - name: SFTP_PATH_ENTRADA
          value: /sistemas/sisgf/arquivos/entrada/relatorios
        - name: SFTP_SERVER_IP
          value: 10.116.89.226
        - name: SFTP_SERVER_PORT
          value: '22'
        - name: SIICO_API_PRIVADA_URL
          value: 'https://api.des.caixa:8443/informacoes-corporativas-privadas/'
        - name: SIICO_API_PUBLICA_URL
          value: 'https://api.des.caixa:8443/informacoes-corporativas-publicas/'
        - name: SINAF_API_EVENTO_URL
          value: 'https://api.des.caixa:8443/sinaf-api-evento/'
        - name: SISGF_API_URL
          value: >-
            https://sisgf-api-des.apps.nprd.caixa/financeiro-beneficios/faturamento/
        - name: SISGF_BATCH_UNIDADES_URL
          value: 'https://sisgf-batch-des.apps.nprd.caixa'
        - name: QUARKUS_HTTP_SSL_CERTIFICATE_KEY_STORE_PASSWORD
          valueFrom:
            secretKeyRef:
              name: sisgf-backend-des
              key: QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD
        - name: QUARKUS_OIDC_CREDENTIALS_SECRET
          valueFrom:
            secretKeyRef:
              name: sisgf-backend-des
              key: QUARKUS_OIDC_CREDENTIALS_SECRET
        - name: SFTP_CLIENT_SECRET
          valueFrom:
            secretKeyRef:
              name: sisgf-backend-des
              key: SFTP_CLIENT_SECRET
        - name: API_KEY
          valueFrom:
            secretKeyRef:
              name: sisgf-backend-des
              key: API_KEY
        - name: DB2_SIICO_PASSWORD
          valueFrom:
            secretKeyRef:
              name: sisgf-backend-des
              key: DB2_SIICO_PASSWORD
        - name: QUARKUS_DATASOURCE_PASSWORD
          valueFrom:
            secretKeyRef:
              name: sisgf-backend-des
              key: QUARKUS_DATASOURCE_PASSWORD
      securityContext:
        capabilities:
          drop:
            - MKNOD
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
        - name: kube-api-access-l5tvv
          readOnly: true
          mountPath: /var/run/secrets/kubernetes.io/serviceaccount
      terminationMessagePolicy: File
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:14.0.0.50
  serviceAccount: default
  volumes:
    - name: secrets
      emptyDir:
        medium: Memory
    - name: script-bt-volume
      configMap:
        name: sisgf-backend-des-script-bt-check
        defaultMode: 420
    - name: caixa-truststore-acteste-nprd
      secret:
        secretName: caixa-truststore-acteste-nprd
        defaultMode: 420
    - name: kube-api-access-l5tvv
      projected:
        sources:
          - serviceAccountToken:
              expirationSeconds: 3607
              path: token
          - configMap:
              name: kube-root-ca.crt
              items:
                - key: ca.crt
                  path: ca.crt
          - downwardAPI:
              items:
                - path: namespace
                  fieldRef:
                    apiVersion: v1
                    fieldPath: metadata.namespace
          - configMap:
              name: openshift-service-ca.crt
              items:
                - key: service-ca.crt
                  path: service-ca.crt
        defaultMode: 420
  dnsPolicy: ClusterFirst
  tolerations:
    - key: node.kubernetes.io/not-ready
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/unreachable
      operator: Exists
      effect: NoExecute
      tolerationSeconds: 300
    - key: node.kubernetes.io/memory-pressure
      operator: Exists
      effect: NoSchedule
status:
  containerStatuses:
    - restartCount: 19
      started: false
      ready: false
      name: sisgf-backend-des
      state:
        waiting:
          reason: CrashLoopBackOff
          message: >-
            back-off 5m0s restarting failed container=sisgf-backend-des
            pod=sisgf-backend-des-197-zhs8k_sisgf-des(4c159e4e-b909-40ba-bac5-350390febbb9)
      imageID: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend@sha256:f1445c98891549c9232c4e6add4638374c6717b2466b12b86ab3b1b69b349bd3
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:14.0.0.50
      lastState:
        terminated:
          exitCode: 1
          reason: Error
          startedAt: '2026-05-27T19:20:32Z'
          finishedAt: '2026-05-27T19:20:47Z'
          containerID: >-
            cri-o://53eafd4839482c1646270aa5cd7890449cd92653fb9efbbef926d8199fae415b
      containerID: 'cri-o://53eafd4839482c1646270aa5cd7890449cd92653fb9efbbef926d8199fae415b'
  qosClass: Burstable
  podIPs:
    - ip: 25.3.26.211
  podIP: 25.3.26.211
  hostIP: 10.116.208.77
  startTime: '2026-05-27T18:02:54Z'
  initContainerStatuses:
    - name: secrets-agent-sidecar
      state:
        terminated:
          exitCode: 0
          reason: Completed
          startedAt: '2026-05-27T18:02:56Z'
          finishedAt: '2026-05-27T18:03:03Z'
          containerID: >-
            cri-o://2cc0cf077e9a48665b39488f4e596cba80404aed75220ad47553f6e0d56cccb1
      lastState: {}
      ready: true
      restartCount: 0
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
      imageID: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent@sha256:7b923d384a51e0055063443839ed66a11d4980a96e85285c62500c314b01c813
      containerID: 'cri-o://2cc0cf077e9a48665b39488f4e596cba80404aed75220ad47553f6e0d56cccb1'
    - name: secrets-check
      state:
        terminated:
          exitCode: 0
          reason: Completed
          startedAt: '2026-05-27T18:03:04Z'
          finishedAt: '2026-05-27T18:03:04Z'
          containerID: >-
            cri-o://d22858f5c49270eedb15668e186d05d1d9baf521d28a14c088407139d7d7dca9
      lastState: {}
      ready: true
      restartCount: 0
      image: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
      imageID: >-
        default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi@sha256:f5983f7c7878cc9b26a3962be7756e3c810e9831b0b9f9613e6f6b445f884e74
      containerID: 'cri-o://d22858f5c49270eedb15668e186d05d1d9baf521d28a14c088407139d7d7dca9'
  conditions:
    - type: Initialized
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-05-27T18:03:05Z'
    - type: Ready
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-05-27T18:02:54Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sisgf-backend-des]'
    - type: ContainersReady
      status: 'False'
      lastProbeTime: null
      lastTransitionTime: '2026-05-27T18:02:54Z'
      reason: ContainersNotReady
      message: 'containers with unready status: [sisgf-backend-des]'
    - type: PodScheduled
      status: 'True'
      lastProbeTime: null
      lastTransitionTime: '2026-05-27T18:02:54Z'
  phase: Running
