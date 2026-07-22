
-sh-4.2$ oc describe rc simil-api-des-9 -n simil-des | tail -20
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
-sh-4.2$ oc get resourcequota -n simil-des
NAME              AGE       REQUEST      LIMIT
quota-resources   359d      pods: 7/10   limits.cpu: 7/8, limits.memory: 8Gi/10Gi
-sh-4.2$ oct resourcequota -n simil-des
-sh: oct: comando não encontrado
-sh-4.2$ oc describe resourcequota -n simil-des
Name:       quota-resources
Namespace:  simil-des
Scopes:     NotBestEffort
 * Matches all pods that have at least one resource requirement set. These pods have a burstable or guaranteed quality of service.
Resource       Used  Hard
--------       ----  ----
limits.cpu     7     8
limits.memory  8Gi   10Gi
pods           7     10
-sh-4.2$
