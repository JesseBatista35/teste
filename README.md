-sh-4.2$ oc describe dc sisgf-backend-des -n sisgf-des
Name:           sisgf-backend-des
Namespace:      sisgf-des
Created:        17 months ago
Labels:         CGC_DES=7390
                CGC_OPS=7259
                UNIDADE=BR
                app=sisgf-backend-des
                application=sisgf-backend-des
                template=quarkus-caixa-release
Description:    Defines how to deploy the application server
Annotations:    openshift.io/generated-by=OpenShiftNewApp
Latest Version: 242
Selector:       name=sisgf-backend-des
Replicas:       1
Triggers:       <none>
Strategy:       Rolling
Template:
Pod Template:
  Labels:       CGC_DES=7390
                CGC_OPS=7259
                app=sisgf-backend-des
                name=sisgf-backend-des
  Annotations:  openshift.io/generated-by=OpenShiftNewApp
  Init Containers:
   secrets-agent-sidecar:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
    Port:       <none>
    Host Port:  <none>
    Limits:
      memory:   400Mi
    Environment:
      SECRETS_PATH:     /usr/src/app/secrets_files
      BT_API_URL:       https://sicsn.caixa/BeyondTrust/api/public/v3
      CLIENT_ID:        <set to the key 'BT_CLIENT_ID' in secret 'bt-client-secret-sisgf-backend-des'>          Optional: false
      CLIENT_SECRET:    <set to the key 'BT_CLIENT_SECRET' in secret 'bt-client-secret-sisgf-backend-des'>      Optional: false
      BT_API_VERSION:   3.1
      SECRETS_LIST:     SISGF_DES/SSGFDR01_SFTP,SISGF_DES/CLISERSGF_SSO_INTRA,SISGF_DES/SISGF_APIKEY,SISGF_DES/SSGFRD01_DB2,SISGF_DES/SSGFRD02_ORA
      BT_VERIFY_CA:     False
    Mounts:
      /usr/src/app/secrets_files from secrets (rw)
   secrets-check:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
    Port:       <none>
    Host Port:  <none>
    Command:
      /bin/bash
      /script/bt-check.sh
    Environment:
      SECRETS_PATH:     /usr/src/app/secrets_files
      SECRETS_LIST:     SISGF_DES/SSGFDR01_SFTP,SISGF_DES/CLISERSGF_SSO_INTRA,SISGF_DES/SISGF_APIKEY,SISGF_DES/SSGFRD01_DB2,SISGF_DES/SSGFRD02_ORA
    Mounts:
      /script from script-bt-volume (rw)
      /usr/src/app/secrets_files from secrets (rw)
  Containers:
   sisgf-backend-des:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:20260528.1849-11.01.01.01-SNAPSHOT
    Port:       8080/TCP
    Host Port:  0/TCP
    Limits:
      cpu:      1
      memory:   1Gi
    Requests:
      cpu:      200m
      memory:   1Gi
    Liveness:   tcp-socket :8080 delay=180s timeout=10s period=10s #success=1 #failure=3
    Readiness:  tcp-socket :8080 delay=180s timeout=10s period=10s #success=1 #failure=3
    Environment:
      TZ:                                                       America/Sao_Paulo
      APPLICATIONINSIGHTS_CONNECTION_STRING:                    InstrumentationKey=99ee6c02-0bc8-4c2e-8109-b744a54e07ae;IngestionEndpoint=https://brazilsouth-1.in.applicationinsights.azure.com/;LiveEndpoint=https://brazilsouth.livediagnostics.monitor.azure.com/
      APPLICATIONINSIGHTS_INSTRUMENTATION_LOGGING_LEVEL:        INFO
      APPLICATIONINSIGHTS_ROLE_NAME:                            SISGF-backend-DES
      APPLICATIONINSIGHTS_SAMPLING_PERCENTAGE:                  3
      APPLICATIONINSIGHTS_SELF_DIAGNOSTICS_LEVEL:               INFO
      CORS_ORIGINS:                                             https://sisgf-frontend-des.apps.nprd.caixa, https://sisgf-frontend-tqs.apps.nprd.caixa, https://sisgf.caixa/, http://localhost:4200
      DB2_SIICO_SCHEMA:                                         DESICO
      DB2_SIICO_URL:                                            jdbc:db2://10.216.80.110:448/RJKDB2DSD0
      DB2_SIICO_USERNAME:                                       ssgfrd01
      EMAIL_DESTINATARIOS:                                      jose.ibiapina@caixa.gov.br;daniel.e.araujo@caixa.gov.br
      EMAIL_FROM:                                               sisgf.teste@caixa.gov.br
      EMAIL_SMTP_PORT:                                          25
      EMAIL_SMTP_URL:                                           smtptest.correiolivre.caixa
      HORA_LIMITE_CONTABILIZACAO:                               18
      HTTPS_PROXY:                                              http://proxydes.caixa:80
      JAVA_OPTIONS_APPEND:                                      -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks -javaagent:/deployments/lib/main/com.microsoft.azure.applicationinsights-agent-3.3.1.jar
      NO_PROXY:                                                 *.caixa,*.caixa.gov.br
      QUARKUS_DATASOURCE_DB_KIND:                               other
      QUARKUS_DATASOURCE_JDBC_DRIVER:                           oracle.jdbc.driver.OracleDriver
      QUARKUS_DATASOURCE_JDBC_MAX_SIZE:                         40
      QUARKUS_DATASOURCE_JDBC_URL:                              jdbc:oracle:thin:@10.116.101.7:1521/orad01sc
      QUARKUS_DATASOURCE_USERNAME:                              SSGFRD01
      QUARKUS_HIBERNATE-ORM_DATABASE_DEFAULT_SCHEMA:            SGF
      QUARKUS_HIBERNATE_ORB_DIALECT:                            org.hibernate.dialect.Oracle10gDialect
      QUARKUS_HIBERNATE_ORM_LOG_BIND_PARAMETERS:                false
      QUARKUS_HIBERNATE_ORM_LOG_SQL:                            false
      QUARKUS_HIBERNATE_ORM_PACKAGES:                           br.gov.caixa.sisgf.api.domain.model
      QUARKUS_LOG_LEVEL:                                        INFO
      QUARKUS_OIDC_AUTH_SERVER_URL:                             https://login.des.caixa/auth/realms/intranet
      SFTP_CLIENT_USER:                                         ssgfdr01
      SFTP_PATH_DIR_LIST:                                       /SINAF,/SIPAS,/sipas
      SFTP_PATH_ENTRADA:                                        /sistemas/sisgf/arquivos/entrada/relatorios
      SFTP_SERVER_IP:                                           10.116.89.226
      SFTP_SERVER_PORT:                                         22
      SIICO_API_PRIVADA_URL:                                    https://api.des.caixa:8443/informacoes-corporativas-privadas/
      SIICO_API_PUBLICA_URL:                                    https://api.des.caixa:8443/informacoes-corporativas-publicas/
      SINAF_API_EVENTO_URL:                                     https://api.des.caixa:8443/sinaf-api-evento/
      SISGF_API_URL:                                            https://sisgf-api-des.apps.nprd.caixa/financeiro-beneficios/faturamento/
      SISGF_BATCH_UNIDADES_URL:                                 https://sisgf-batch-des.apps.nprd.caixa
      QUARKUS_OIDC_CREDENTIALS_SECRET:                          <set to the key 'QUARKUS_OIDC_CREDENTIALS_SECRET' in secret 'sisgf-backend-des'>                        Optional: false
      SFTP_CLIENT_SECRET:                                       <set to the key 'SFTP_CLIENT_SECRET' in secret 'sisgf-backend-des'>                                     Optional: false
      SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS:                    <set to the key 'SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS' in secret 'sisgf-backend-des'>                  Optional: false
      API_KEY:                                                  <set to the key 'API_KEY' in secret 'sisgf-backend-des'>                                                Optional: false
      DB2_SIICO_PASSWORD:                                       <set to the key 'DB2_SIICO_PASSWORD' in secret 'sisgf-backend-des'>                                     Optional: false
      QUARKUS_DATASOURCE_PASSWORD:                              <set to the key 'QUARKUS_DATASOURCE_PASSWORD' in secret 'sisgf-backend-des'>                            Optional: false
      QUARKUS_HTTP_SSL_CERTIFICATE_KEY_STORE_PASSWORD:          <set to the key 'QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD' in secret 'sisgf-backend-des'>        Optional: false
    Mounts:
      /deployments/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /usr/src/app/secrets_files from secrets (rw)
  Volumes:
   secrets:
    Type:       EmptyDir (a temporary directory that shares a pod's lifetime)
    Medium:     Memory
   script-bt-volume:
    Type:       ConfigMap (a volume populated by a ConfigMap)
    Name:       sisgf-backend-des-script-bt-check
    Optional:   false
   caixa-truststore-acteste-nprd:
    Type:       Secret (a volume populated by a Secret)
    SecretName: caixa-truststore-acteste-nprd
    Optional:   false

Deployment #242 (latest):
        Created:        27 minutes ago
        Status:         Failed
        Replicas:       0 current / 0 desired
Deployment #241:
        Created:        45 minutes ago
        Status:         Failed
        Replicas:       0 current / 0 desired
Deployment #240:
        Created:        3 hours ago
        Status:         Failed
        Replicas:       0 current / 0 desired
-sh-4.2$ oc get dc sisgf-backend-des -n sisgf-des -o yaml | grep -A 10 "image:"
                f:image: {}
                f:imagePullPolicy: {}
                f:name: {}
                f:resources:
                  .: {}
                  f:limits:
                    .: {}
                    f:memory: {}
                f:securityContext:
                  .: {}
                  f:runAsUser: {}
--
                f:image: {}
                f:imagePullPolicy: {}
                f:name: {}
                f:resources: {}
                f:terminationMessagePath: {}
                f:terminationMessagePolicy: {}
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/script"}:
                    .: {}
                    f:mountPath: {}
--
                f:image: {}
                f:volumeMounts:
                  .: {}
                  k:{"mountPath":"/deployments/caixa-truststore-acteste-nprd.jks"}:
                    .: {}
                    f:mountPath: {}
                    f:name: {}
                    f:subPath: {}
            f:volumes:
              .: {}
              k:{"name":"caixa-truststore-acteste-nprd"}:
--
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sisgf-backend:20260528.1849-11.01.01.01-SNAPSHOT
        imagePullPolicy: Always
        livenessProbe:
          failureThreshold: 3
          initialDelaySeconds: 180
          periodSeconds: 10
          successThreshold: 1
          tcpSocket:
            port: 8080
          timeoutSeconds: 10
        name: sisgf-backend-des
--
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
        imagePullPolicy: IfNotPresent
        name: secrets-agent-sidecar
        resources:
          limits:
            memory: 400Mi
        securityContext:
          runAsUser: 1337
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
--
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
        imagePullPolicy: IfNotPresent
        name: secrets-check
        resources: {}
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /script
          name: script-bt-volume
-sh-4.2$
