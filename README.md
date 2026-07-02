
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | grep -B5 -A10 "SBECTR01_DB2"
        - name: QUARKUS_DATASOURCE_JDBC_MAX-SIZE
          value: "40"
        - name: QUARKUS_DATASOURCE_JDBC_URL
          value: jdbc:db2://10.216.80.111:446/RJKDB2DSDH:currentSchema=TQSBEC;
        - name: QUARKUS_DATASOURCE_PASSWORD
          value: ${SBECTR01_DB2}
        - name: QUARKUS_DATASOURCE_USERNAME
          value: SBECTR01
        - name: QUARKUS_HIBERNATE-ORM_DIALECT
          value: org.hibernate.dialect.db2dialect
        - name: QUARKUS_HIBERNATE-ORM_LOG_BIND-PARAMETERS
          value: "true"
        - name: QUARKUS_HIBERNATE-ORM_LOG_SQL
          value: "true"
        - name: QUARKUS_HIBERNATE-ORM_PACKAGES
          value: br.gov.caixa.sibec.api.domain.model
--
              key: BT_CLIENT_SECRET
              name: bt-client-secret-sibec-arquivos-tqs
        - name: BT_API_VERSION
          value: "3.1"
        - name: SECRETS_LIST
          value: SIBEC_TQS/SBECTR01_DB2,SIBEC_TQS/CLISERBEC_SSO_INTER,SIBEC_TQS/CLISERBEC_SSO_INTRA,SIBEC_TQS/SIBEC_APIKEY
        - name: BT_VERIFY_CA
          value: "False"
        image: default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2
        imagePullPolicy: IfNotPresent
        name: secrets-agent-sidecar
        resources:
          limits:
            memory: 400Mi
        securityContext:
          runAsUser: 1337
--
        - /script/bt-check.sh
        env:
        - name: SECRETS_PATH
          value: /usr/src/app/secrets_files
        - name: SECRETS_LIST
          value: SIBEC_TQS/SBECTR01_DB2,SIBEC_TQS/CLISERBEC_SSO_INTER,SIBEC_TQS/CLISERBEC_SSO_INTRA,SIBEC_TQS/SIBEC_APIKEY
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
-sh-4.2$ oc get secrets -n sibec-tqs | grep -i sbec
-sh-4.2$
