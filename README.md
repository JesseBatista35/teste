
-sh-4.2$ oc get project simil-des

NAME        DISPLAY NAME   STATUS
simil-des                  Active
-sh-4.2$
-sh-4.2$ oc get events -n simil-des --sort-by=.lastTimestamp | tail -50
F0722 14:33:22.888612   84971 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$ oc describe rc simil-api-des-9 -n simil-des
Name:         simil-api-des-9
Namespace:    simil-des
Selector:     deployment=simil-api-des-9,deploymentconfig=simil-api-des,name=simil-api-des
Labels:       CGC_DES=7390
              CGC_OPS=7259
              UNIDADE=BR
              app=simil-api-des
              application=simil-api-des
              openshift.io/deployment-config.name=simil-api-des
              template=springboot-caixa-release
Annotations:  kubectl.kubernetes.io/desired-replicas=1
              kubectl.kubernetes.io/update-source-id=simil-api-des-4:ae40c6ae-a03f-41d2-b0f3-f1bfcf6ebf28
              openshift.io/deployer-pod.created-at=2026-07-22 17:23:41 +0000 UTC
              openshift.io/deployer-pod.name=simil-api-des-9-deploy
              openshift.io/deployment-config.latest-version=9
              openshift.io/deployment-config.name=simil-api-des
              openshift.io/deployment.phase=Running
              openshift.io/deployment.replicas=0
              openshift.io/deployment.status-reason=manual change
              openshift.io/encoded-deployment-config={"kind":"DeploymentConfig","apiVersion":"apps.openshift.io/v1","metadata":{"name":"simil-api-des","namespace":"simil-des","uid":"95943ea4-db01-4545-96b1-cdaa75ac...
Replicas:     0 current / 1 desired
Pods Status:  0 Running / 0 Waiting / 0 Succeeded / 0 Failed
Pod Template:
  Labels:       CGC_DES=7390
                CGC_OPS=7259
                app=simil-api-des
                deployment=simil-api-des-9
                deploymentconfig=simil-api-des
                name=simil-api-des
  Annotations:  openshift.io/deployment-config.latest-version=9
                openshift.io/deployment-config.name=simil-api-des
                openshift.io/deployment.name=simil-api-des-9
                openshift.io/generated-by=OpenShiftNewApp
  Containers:
   simil-api-des:
    Image:      default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simil-api:20260722.0924-0.0.0-SNAPSHOT
    Port:       8080/TCP
    Host Port:  0/TCP
    Limits:
      cpu:     1
      memory:  1Gi
    Requests:
      cpu:      500m
      memory:   1Gi
    Liveness:   http-get http://:8080/actuator/health/liveness delay=60s timeout=3s period=10s #success=1 #failure=3
    Readiness:  http-get http://:8080/actuator/health/readiness delay=60s timeout=3s period=10s #success=1 #failure=3
    Environment:
      TZ:                                              America/Sao_Paulo
      INSTANCE_IP:                                      (v1:status.podIP)
      APPLICATIONINSIGHTS_CONNECTION_STRING:
      JAVA_OPTIONS:                                    -Dserver.address=0.0.0.0 -Dserver.port=8080
      JAVA_OPTS_MONITORING:                            -javaagent:/opt/apm_agent/elastic-apm-agent.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm.properties -Delastic.apm.service_name=simil-api -Delastic.apm.environment=des -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=simil-api
      JWT_OAUTH2_SET_URI:                              https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/certs
      SERVER_COMPREESION_ENABLE:                       true
      SPRING_APPLICATION_NAME:                         simil-api
      SPRING_DATABASE_PLATFORM:                        org.hibernate.dialect.PostgreSQLDialect
      SPRING_DATASOURCE_DRIVERCLASSNAME:               org.postgresql.Driver
      SPRING_DATASOURCE_HIKARI_CONNECTION_TIMEOUT:     20000
      SPRING_DATASOURCE_HIKARI_IDLE_TIMEOUT:           300000
      SPRING_DATASOURCE_HIKARI_MAXIMUM_POOL_SIZE:      20
      SPRING_DATASOURCE_HIKARI_MAX_LIFETIME:           1200000
      SPRING_DATASOURCE_HIKARI_MINIMUM_IDLE:           5
      SPRING_DATASOURCE_URL:                           jdbc:postgresql://SCTDEDADLX0004.DF.CAIXA/DESENVOLVIMENTO?sslmode=disable
      SPRING_DATASOURCE_USERNAME:                      mil_prd_001
      SPRING_DEFAULT_SCHEMA:                           milsm001
      SPRINGDOC_SWAGGER_UI_PATH:                       /swagger-ui.html
      SPRING_HIBERNATE_DDL_AUTO:                       validate
      SPRING_HIBERNATE_FORMAT_SQL:                     true
      SPRING_HIBERNATE_JDBC_BATCH_SIZE:                20
      SPRING_HIBERNATE_ORDER_INSERTS:                  true
      SPRING_HIBERNATE_ORDER_UPDATES:                  true
      SPRING_JPA_DATABASE_PLATFORM:                    org.hibernate.dialect.PostgreSQLDialect
      SPRING_JPA_PROPERTIES_HIBERNATE_DEFAULT_SCHEMA:  milsm001
      SPRING_OAUTH2_CLIENT_ID:                         cli-ser-mil
      SPRING_OAUTH2_GRANT_TYPE:                        client-credentials
      SPRING_OAUTH2_SET_URI:                           https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
      SPRING_SHOW_SQL:                                 false
      SPRING_USE_SQL_COMMENTS:                         true
      SPRING_WEB_RESOURCES_ADD_MAPPINGS:               false
      SWAGGER_GENERIC_RESPONSE:                        false
      SWAGGER_PACKAGES_SCAN:                           br.gov.caixa.simil.api.controllers
      SWAGGER_PATHS_MATCH:                             /v1/**
      SWAGGER_TAG_SORTER:                              method
      SWAGGER_TRY_IT_OUT_ENABLED:                      true
      SWAGGER_UI_OPERATIONS_SORTER:                    alpha
    Mounts:                                            <none>
  Volumes:                                             <none>
Conditions:
  Type             Status  Reason
  ----             ------  ------
  ReplicaFailure   True    FailedCreate
-sh-4.2$ oc get dc simil-api-des -n simil-des -o yaml | grep -A10 -E "readinessProbe|livenessProbe|resources:"
                f:livenessProbe:
                  .: {}
                  f:failureThreshold: {}
                  f:httpGet:
                    .: {}
                    f:path: {}
                    f:port: {}
                    f:scheme: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
--
                f:readinessProbe:
                  .: {}
                  f:failureThreshold: {}
                  f:httpGet:
                    .: {}
                    f:path: {}
                    f:port: {}
                    f:scheme: {}
                  f:initialDelaySeconds: {}
                  f:periodSeconds: {}
                  f:successThreshold: {}
--
                f:resources:
                  .: {}
                  f:limits:
                    .: {}
                    f:cpu: {}
                    f:memory: {}
                  f:requests:
                    .: {}
                    f:cpu: {}
                    f:memory: {}
                f:terminationMessagePath: {}
--
    resources: {}
    rollingParams:
      intervalSeconds: 1
      maxSurge: 25%
      maxUnavailable: 25%
      timeoutSeconds: 600
      updatePeriodSeconds: 1
    type: Rolling
  template:
    metadata:
      annotations:
--
        livenessProbe:
          failureThreshold: 3
          httpGet:
            path: /actuator/health/liveness
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 3
        name: simil-api-des
--
        readinessProbe:
          failureThreshold: 3
          httpGet:
            path: /actuator/health/readiness
            port: 8080
            scheme: HTTP
          initialDelaySeconds: 60
          periodSeconds: 10
          successThreshold: 1
          timeoutSeconds: 3
        resources:
          limits:
            cpu: "1"
            memory: 1Gi
          requests:
            cpu: 500m
            memory: 1Gi
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
      dnsPolicy: ClusterFirst
      imagePullSecrets:
-sh-4.2$
