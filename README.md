
-sh-4.2$
-sh-4.2$ oc get pod sismn-gecci-tqs-28-glhxs -n sismn-tqs -o yaml | grep -B2 -A6 QUARKUS_DATASOURCE
                f:name: {}
                f:value: {}
              k:{"name":"QUARKUS_DATASOURCE_JDBC_URL"}:
                .: {}
                f:name: {}
                f:value: {}
              k:{"name":"QUARKUS_DATASOURCE_PASSWORD"}:
                .: {}
                f:name: {}
                f:valueFrom:
                  .: {}
                  f:secretKeyRef: {}
              k:{"name":"QUARKUS_DATASOURCE_USERNAME"}:
                .: {}
                f:name: {}
                f:value: {}
              k:{"name":"QUARKUS_HTTP_CORS_ORIGINS"}:
                .: {}
                f:name: {}
--
        -Delastic.apm.service_name=sismn-gecci -Delastic.apm.environment=tqs -Delastic.apm.application_packages=br.gov.caixa
        -Delastic.apm.server_urls=http://apm-server-devops.apps.produtos4.caixa -Delastic.apm.global_labels=deployment=sismn-gecci
    - name: QUARKUS_DATASOURCE_JDBC_URL
      value: jdbc:sybase:Tds:bbrdedadux001.corecaixa:20113?ServiceName=SMNDB001
    - name: QUARKUS_DATASOURCE_USERNAME
      value: f710695
    - name: QUARKUS_HTTP_CORS_ORIGINS
      value: '*'
    - name: QUARKUS_LOG_LEVEL
      value: DEBUG
    - name: QUARKUS_OIDC_AUTH_SERVER_URL
      value: https://login.des.caixa/auth/realms/intranet
    - name: QUARKUS_DATASOURCE_PASSWORD
      valueFrom:
        secretKeyRef:
          key: QUARKUS_DATASOURCE_PASSWORD
          name: sismn-gecci-tqs
    image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sismn-gecci:20250925.1822-1.0.0
    imagePullPolicy: Always
    livenessProbe:
      failureThreshold: 3
      httpGet:
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sismn-gecci-tqs -n sismn-tqs -o jsonpath='{.spec.triggers}'; echo
[]
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret sismn-gecci-tqs -n sismn-tqs -o jsonpath='{.data}' | sed 's/:.*//'; echo
map[QUARKUS_DATASOURCE_PASSWORD
-sh-4.2$
