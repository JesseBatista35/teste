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
              value: '-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Dcom.sun.jndi.ldap.connect.pool=false'
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
            - name: ca-logintqs
              mountPath: /etc/ca-certs
              readOnly: true
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
        - name: ca-logintqs
          configMap:
            name: ca-logintqs
            defaultMode: 420
      dnsPolicy: ClusterFirst






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
