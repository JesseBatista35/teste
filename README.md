-sh-4.2$ bashoc describe secret sisgf-backend-des -n sisgf-des
-sh: bashoc: comando não encontrado
-sh-4.2$ oc describe secret sisgf-backend-des -n sisgf-des
Name:         sisgf-backend-des
Namespace:    sisgf-des
Labels:       <none>
Annotations:  <none>

Type:  Opaque

Data
====
API_KEY:                                          0 bytes
DB2_SIICO_PASSWORD:                               0 bytes
QUARKUS_DATASOURCE_PASSWORD:                      15 bytes
QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD:  8 bytes
QUARKUS_OIDC_CREDENTIALS_SECRET:                  0 bytes
SFTP_CLIENT_SECRET:                               0 bytes
SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS:            37 bytes
-sh-4.2$ oc get secret sisgf-backend-des -n sisgf-des -o yaml
apiVersion: v1
data:
  API_KEY: ""
  DB2_SIICO_PASSWORD: ""
  QUARKUS_DATASOURCE_PASSWORD: I1NTR0ZSRDAyX09SQX0j
  QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD: Y2hhbmdlaXQ=
  QUARKUS_OIDC_CREDENTIALS_SECRET: ""
  SFTP_CLIENT_SECRET: ""
  SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS: L3Vzci9zcmMvYXBwL3NlY3JldHNfZmlsZXMvU0lTR0ZfREVTLw==
kind: Secret
metadata:
  creationTimestamp: 2026-05-28T22:10:29Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:API_KEY: {}
        f:DB2_SIICO_PASSWORD: {}
        f:QUARKUS_DATASOURCE_PASSWORD: {}
        f:QUARKUS_HTTP_SSL_CERTIFICATE_KEY-STORE-PASSWORD: {}
        f:QUARKUS_OIDC_CREDENTIALS_SECRET: {}
        f:SFTP_CLIENT_SECRET: {}
        f:SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS: {}
      f:type: {}
    manager: kubectl-create
    operation: Update
    time: 2026-05-28T22:10:29Z
  name: sisgf-backend-des
  namespace: sisgf-des
  resourceVersion: "1984263252"
  uid: cdd18320-376e-4269-a3ec-c53bc42a7207
type: Opaque
-sh-4.2$
