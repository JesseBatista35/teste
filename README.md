
-sh-4.2$ oc get dc siint-saquetecban-pendencia-api-des -o yaml | grep -B2 -A2 "API_KEY\|API_CLIENT_SECRET\|name: API\|value:"
                    .: {}
                    f:name: {}
                    f:value: {}
                f:imagePullPolicy: {}
                f:livenessProbe:
--
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"API_GRANT_TYPE"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"JAVA_OPTIONS_APPEND"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"QUARKUS_DATASOURCE_JDBC_URL"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"QUARKUS_DATASOURCE_PASSWORD"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"QUARKUS_DATASOURCE_USERNAME"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                f:image: {}
                f:volumeMounts:
--
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"BT_API_VERSION"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"BT_VERIFY_CA"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"CLIENT_ID"}:
                    .: {}
--
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"SECRETS_PATH"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                f:image: {}
                f:imagePullPolicy: {}
--
                    .: {}
                    f:name: {}
                    f:value: {}
                  k:{"name":"SECRETS_PATH"}:
                    .: {}
                    f:name: {}
                    f:value: {}
                f:image: {}
                f:imagePullPolicy: {}
--
      - env:
        - name: TZ
          value: America/Sao_Paulo
        - name: API_CLIENT_ID
          value: cli-ser-int
        - name: API_GRANT_TYPE
          value: client_credentials
        - name: JAVA_OPTIONS_APPEND
          value: -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
        - name: QUARKUS_DATASOURCE_JDBC_URL
          value: jdbc:db2://10.192.225.76:2905/DBD0
        - name: QUARKUS_DATASOURCE_PASSWORD
          value: ${SINTDS03_DB2}
        - name: QUARKUS_DATASOURCE_USERNAME
          value: SINTDS03
        - name: SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS
          value: /usr/src/app/secrets_files/SIINT_DES/
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siint-saquetecban-pendencia-api:1.0.0.10
        imagePullPolicy: Always
--
      - env:
        - name: SECRETS_PATH
          value: /usr/src/app/secrets_files
        - name: BT_API_URL
          value: https://sicsn.caixa/BeyondTrust/api/public/v3
        - name: CLIENT_ID
          valueFrom:
--
              name: bt-client-secret-siint-saquetecban-pendencia-api-des
        - name: BT_API_VERSION
          value: "3.1"
        - name: SECRETS_LIST
          value: SIINT_DES/SINTDS03_DB2
        - name: BT_VERIFY_CA
          value: "False"
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
        imagePullPolicy: IfNotPresent
--
        env:
        - name: SECRETS_PATH
          value: /usr/src/app/secrets_files
        - name: SECRETS_LIST
          value: SIINT_DES/SINTDS03_DB2
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552
        imagePullPolicy: IfNotPresent
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/siint-saquetecban-pendencia-api-des --list
# deploymentconfigs/siint-saquetecban-pendencia-api-des, container siint-saquetecban-pendencia-api-des
TZ=America/Sao_Paulo
API_CLIENT_ID=cli-ser-int
API_GRANT_TYPE=client_credentials
JAVA_OPTIONS_APPEND=-Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
QUARKUS_DATASOURCE_JDBC_URL=jdbc:db2://10.192.225.76:2905/DBD0
QUARKUS_DATASOURCE_PASSWORD=${SINTDS03_DB2}
QUARKUS_DATASOURCE_USERNAME=SINTDS03
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS=/usr/src/app/secrets_files/SIINT_DES/
-sh-4.2$
