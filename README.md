-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | grep -n "^ name:"
-sh-4.2$ ^C
-sh-4.2$ oc get dc sibec-arquivos-tqs -n sibec-tqs -o yaml | sed -n '524,692p'
      containers:
      - env:
        - name: TZ
          value: America/Sao_Paulo
        - name: AMBIENTE
          value: tqs
        - name: API_MP_REST_SCOPE
          value: javax.inject.singleton
        - name: FILESTORE_AMBIENTE_RELATORIO
          value: BECT
        - name: FILESTORE_AMBIENTE_RELATORIOCID
          value: CIDT
        - name: FILESTORE_AMBIENTE_RELATORIO_PERFIL
          value: BEC07
        - name: FILESTORE_PATH_ENVIO
          value: /upload/envio
        - name: FILESTORE_PATH_ESTRUTURAPASTAS
          value: Judicial,Folha,Relatorio,Qualificacao,Manutencao,Habilitacao,Outros,Diversos,upload,upload/envio,upload/original,upload/retorno,upload/calendario
        - name: FILESTORE_PATH_ORIGINAL
          value: /upload/original
        - name: FILESTORE_PATH_RETORNO
          value: /upload/retorno
        - name: FILESTORE_PATH_SERVIDOR
          value: /sibec
        - name: JAVA_OPTIONS_APPEND
          value: -Djavax.net.ssl.trustStore=/deployments/caixa-truststore-acteste-nprd.jks
        - name: QUARKUS_CORS_ORIGINS
          value: https://sibec-estatico-tqs.apps.nprd.caixa, https://sibec-estatico-internet-tqs.apps.nprd.caixa
        - name: QUARKUS_DATASOURCE_DB-KIND
          value: db2
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
        - name: QUARKUS_HTTP_AUTH_PERMISSION_AUTHENTICATED_PATHS
          value: /api/*
        - name: QUARKUS_HTTP_AUTH_PERMISSION_AUTHENTICATED_POLICY
          value: authenticated
        - name: QUARKUS_HTTP_CORS
          value: "true"
        - name: QUARKUS_HTTP_CORS_EXPOSED-HEADERS
          value: content-disposition
        - name: QUARKUS_LOG_LEVEL
          value: INFO
        - name: QUARKUS_OIDC_APPLICATION-TYPE
          value: service
        - name: QUARKUS_OIDC_AUTH_SERVER_URL
          value: https://login.des.caixa/auth/realms/intranet
        - name: QUARKUS_OIDC_CLIENT_ID
          value: cli-ser-bec
        - name: QUARKUS_OIDC_CREDENTIALS_SECRET
          value: ${CLISERBEC_SSO_INTRA}
        - name: QUARKUS_OIDC_INTERNET_AUTH_SERVER_URL
          value: https://logindes.caixa.gov.br/auth/realms/internet
        - name: QUARKUS_OIDC_INTERNET_CLIENT_ID
          value: cli-ser-bec
        - name: QUARKUS_OIDC_INTERNET_CREDENTIALS_SECRET
          value: ${CLISERBEC_SSO_INTER}
        - name: QUARKUS_OIDC_ROLES_SOURCE
          value: accesstoken
        - name: QUARKUS_OIDC_TOKEN_AUTO-REFRESH-INTERVAL
          value: "18000"
        - name: QUARKUS_RESTEASY_PATH
          value: /api
        - name: QUARKUS_SMALLRYE-HEALTH_LIVENESS-PATH
          value: /live
        - name: QUARKUS_SMALLRYE-HEALTH_READINESS-PATH
          value: /ready
        - name: QUARKUS_SMALLRYE-HEALTH_ROOT-PATH
          value: /check
        - name: QUARKUS_SMALLRYE-METRICS_JAXRS_ENABLED
          value: "true"
        - name: QUARKUS_SMALLRYE-METRICS_PATH
          value: /nsgd/metrics
        - name: QUARKUS_SMALLRYE-OPENAPI_PATH
          value: /swagger
        - name: QUARKUS_TRANSACTION-MANAGER_DEFAULT-TRANSACTION-TIMEOUT
          value: pt60m
        - name: SIBEC_API_KEY
          value: l7b3130779847d474ea81fc1d64ac7e865
        - name: SIBEC_MICRO
          value: https://sibec-micro-des-esteiras.nprd2.caixa/api
        image: default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sibec-arquivos:1.6.5.8
        imagePullPolicy: Always
        name: sibec-arquivos-tqs
        ports:
        - containerPort: 8080
          protocol: TCP
        resources:
          limits:
            cpu: "1"
            memory: 1Gi
          requests:
            cpu: "1"
            memory: 1Gi
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /NFS/PARCEIROS/SIBEC
          name: sibec-arquivos-fgw-data-tqs
        - mountPath: /usr/src/app/secrets_files
          name: secrets
        - mountPath: /deployments/caixa-truststore-acteste-nprd.jks
          name: caixa-truststore-acteste-nprd
          subPath: caixa-truststore-acteste-nprd.jks
      dnsPolicy: ClusterFirst
      imagePullSecrets:
      - name: registry-secret
      initContainers:
      - env:
        - name: SECRETS_PATH
          value: /usr/src/app/secrets_files
        - name: BT_API_URL
          value: https://sicsn.caixa/BeyondTrust/api/public/v3
        - name: CLIENT_ID
          valueFrom:
            secretKeyRef:
              key: BT_CLIENT_ID
              name: bt-client-secret-sibec-arquivos-tqs
        - name: CLIENT_SECRET
          valueFrom:
            secretKeyRef:
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
        terminationMessagePath: /dev/termination-log
        terminationMessagePolicy: File
        volumeMounts:
        - mountPath: /usr/src/app/secrets_files
          name: secrets
      - command:
        - /bin/bash
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
-sh-4.2$
