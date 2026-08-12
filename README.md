-sh-4.2$ oc get rc siint-saquetecban-pendencia-api-des-45
NAME                                     DESIRED   CURRENT   READY     AGE
siint-saquetecban-pendencia-api-des-45   0         0         0         29m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe rc siint-saquetecban-pendencia-api-des-45
Name:         siint-saquetecban-pendencia-api-des-45
Namespace:    siint-des
Selector:     deployment=siint-saquetecban-pendencia-api-des-45,deploymentconfig=siint-saquetecban-pendencia-api-des,name=siint-saquetecban-pendencia-api-des
Labels:       CGC_DES=7390
              CGC_OPS=7259
              app=siint-saquetecban-pendencia-api-des
              application=siint-saquetecban-pendencia-api-des
              openshift.io/deployment-config.name=siint-saquetecban-pendencia-api-des
              template=quarkus-caixa-release
Annotations:  kubectl.kubernetes.io/desired-replicas=1
              kubectl.kubernetes.io/update-source-id=siint-saquetecban-pendencia-api-des-37:9d1b6ab5-4776-47e1-a0bc-926b21337609
              openshift.io/deployer-pod.completed-at=2026-08-12 13:58:43 +0000 UTC
              openshift.io/deployer-pod.created-at=2026-08-12 13:48:37 +0000 UTC
              openshift.io/deployer-pod.name=siint-saquetecban-pendencia-api-des-45-deploy
              openshift.io/deployment-config.latest-version=45
              openshift.io/deployment-config.name=siint-saquetecban-pendencia-api-des
              openshift.io/deployment.phase=Failed
              openshift.io/deployment.replicas=0
              openshift.io/deployment.status-reason=manual change
              openshift.io/encoded-deployment-config={"kind":"DeploymentConfig","apiVersion":"apps.openshift.io/v1","metadata":{"name":"siint-saquetecban-pendencia-api-des","namespace":"siint-des","uid":"7a93e943-1...
Replicas:     0 current / 0 desired
Pods Status:  0 Running / 0 Waiting / 0 Succeeded / 0 Failed
Pod Template:
  Labels:       CGC_DES=7390
                CGC_OPS=7259
                app=siint-saquetecban-pendencia-api-des
                deployment=siint-saquetecban-pendencia-api-des-45
                deploymentconfig=siint-saquetecban-pendencia-api-des
                name=siint-saquetecban-pendencia-api-des
  Annotations:  openshift.io/deployment-config.latest-version=45
                openshift.io/deployment-config.name=siint-saquetecban-pendencia-api-des
                openshift.io/deployment.name=siint-saquetecban-pendencia-api-des-45
  Init Containers:
   secrets-agent-sidecar:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
    Port:       <none>
    Host Port:  <none>
    Limits:
      memory:  400Mi
    Environment:
      SECRETS_PATH:    /usr/src/app/secrets_files
      BT_API_URL:      https://sicsn.caixa/BeyondTrust/api/public/v3
      CLIENT_ID:       <set to the key 'BT_CLIENT_ID' in secret 'bt-client-secret-siint-saquetecban-pendencia-api-des'>      Optional: false
      CLIENT_SECRET:   <set to the key 'BT_CLIENT_SECRET' in secret 'bt-client-secret-siint-saquetecban-pendencia-api-des'>  Optional: false
      BT_API_VERSION:  3.1
      SECRETS_LIST:    SIINT_DES/SINTDS03_DB2
      BT_VERIFY_CA:    False
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
      SECRETS_PATH:  /usr/src/app/secrets_files
      SECRETS_LIST:  SIINT_DES/SINTDS03_DB2
    Mounts:
      /script from script-bt-volume (rw)
      /usr/src/app/secrets_files from secrets (rw)
  Containers:
   siint-saquetecban-pendencia-api-des:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siint-saquetecban-pendencia-api:1.0.0.10
    Port:       8080/TCP
    Host Port:  0/TCP
    Limits:
      cpu:     1
      memory:  1Gi
    Requests:
      cpu:      256m
      memory:   256Mi
    Liveness:   http-get http://:8080/q/health/live delay=15s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/q/health/ready delay=25s timeout=5s period=10s #success=1 #failure=3
    Environment:
      TZ:                                     America/Sao_Paulo
      API_CLIENT_ID:                          cli-ser-int
      API_GRANT_TYPE:                         client_credentials
      JAVA_OPTIONS_APPEND:                    -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
      QUARKUS_DATASOURCE_JDBC_URL:            jdbc:db2://10.192.225.76:2905/DBD0
      QUARKUS_DATASOURCE_PASSWORD:            ${SINTDS03_DB2}
      QUARKUS_DATASOURCE_USERNAME:            SINTDS03
      SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS:  /usr/src/app/secrets_files/SIINT_DES/
    Mounts:
      /deployments/caixa-truststore-acteste-nprd.jks from caixa-truststore-acteste-nprd (rw)
      /usr/src/app/secrets_files from secrets (rw)
  Volumes:
   secrets:
    Type:    EmptyDir (a temporary directory that shares a pod's lifetime)
    Medium:  Memory
   script-bt-volume:
    Type:      ConfigMap (a volume populated by a ConfigMap)
    Name:      siint-saquetecban-pendencia-api-des-script-bt-check
    Optional:  false
   caixa-truststore-acteste-nprd:
    Type:        Secret (a volume populated by a Secret)
    SecretName:  caixa-truststore-acteste-nprd
    Optional:    false
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get events --sort-by='.lastTimestamp' | tail -30
F0812 11:18:31.054819   79162 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
