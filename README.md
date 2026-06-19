
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret simtx-transacoes-lote-des -n simtx-des -o yaml | \
>   sed 's/name: simtx-transacoes-lote-des/name: simtx-transacoes-lote-des2/g' | \
>   oc apply -f -
secret/simtx-transacoes-lote-des2 created
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sh-4.2$ oc project simtx-des
-sh: sh-4.2$: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's/simtx-transacoes-lote-des/simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$ sed -i 's/namespace: simtx-des/namespace: simtx-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$ sed -i 's/namespace: simtx-des/namespace: simtx-des2/g' dc-des2.yaml
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc apply -f dc-des2.yaml
Error from server (NotFound): error when creating "dc-des2.yaml": namespaces "simtx-des22" not found
-sh-4.2$ Now using project "simtx-des" on server "https://api.nprd.caixa:6443".
-sh: Now: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ oc get deploymentconfig simtx-transacoes-lote-des -n simtx-des -o yaml > dc-des2.yaml
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ sed -i 's/simtx-transacoes-lote-des/simtx-transacoes-lote-des2/g' dc-des2.yaml
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ sed -i 's/namespace: simtx-des/namespace: simtx-des2/g' dc-des2.yaml
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ sed -i 's/namespace: simtx-des/namespace: simtx-des2/g' dc-des2.yaml
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ oc apply -f dc-des2.yaml
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ Error from server (NotFound): error when creating "dc-des2.yaml": namespaces "simtx-des22" not found
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc apply -f dc-des2.yaml
error: no objects passed to apply
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get secret simtx-transacoes-lote-des -n simtx-des -o yaml | \
>   sed 's/name: simtx-transacoes-lote-des/name: simtx-transacoes-lote-des2/g' | \
>   oc apply -f -
Error from server (Conflict): error when applying patch:
{"metadata":{"creationTimestamp":"2026-06-19T14:56:44Z","managedFields":[{"apiVersion":"v1","fieldsType":"FieldsV1","fieldsV1":{"f:data":{".":{},"f:CICSWEB_SIMTX_PASSWORD":{},"f:CICSWEB_SIMTX_SIATR_PASSWORD":{},"f:DB_PASSWORD":{},"f:RHDG_PASSWORD":{},"f:SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS":{},"f:SSO_AUTH_PASS":{},"f:SSO_REALM_INTERNET_PASS":{},"f:SSO_REALM_INTRANET_PASS":{}},"f:type":{}},"manager":"kubectl-create","operation":"Update","time":"2026-06-19T14:56:44Z"}],"resourceVersion":"2027164006","uid":"6a2b529c-2a9b-4c3c-9b02-843ccffd8ffd"}}
to:
Resource: "/v1, Resource=secrets", GroupVersionKind: "/v1, Kind=Secret"
Name: "simtx-transacoes-lote-des2", Namespace: "simtx-des"
Object: &{map["data":map["CICSWEB_SIMTX_PASSWORD":"UkxMOFEzQTQ=" "CICSWEB_SIMTX_SIATR_PASSWORD":"QUtRMzNGRzc=" "DB_PASSWORD":"b0tLdGFUWUY=" "RHDG_PASSWORD":"REB0NEdyMWQtZGV2" "SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS":"L3Vzci9zcmMvYXBwL3NlY3JldHNfZmlsZXMvU0lNVFhfREVTLw==" "SSO_AUTH_PASS":"NmUzNDRkNTAtZTQyZi00ZDY0LWJmZWMtNGQ4NzE0ZDg0MmE4" "SSO_REALM_INTERNET_PASS":"MGNiNzEyY2MtMGFlMC00NTM0LTgzYjMtMzRkOGI5ODJiZjU1" "SSO_REALM_INTRANET_PASS":"NmUzNDRkNTAtZTQyZi00ZDY0LWJmZWMtNGQ4NzE0ZDg0MmE4"] "type":"Opaque" "kind":"Secret" "apiVersion":"v1" "metadata":map["annotations":map["kubectl.kubernetes.io/last-applied-configuration":"{\"apiVersion\":\"v1\",\"data\":{\"CICSWEB_SIMTX_PASSWORD\":\"UkxMOFEzQTQ=\",\"CICSWEB_SIMTX_SIATR_PASSWORD\":\"QUtRMzNGRzc=\",\"DB_PASSWORD\":\"b0tLdGFUWUY=\",\"RHDG_PASSWORD\":\"REB0NEdyMWQtZGV2\",\"SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS\":\"L3Vzci9zcmMvYXBwL3NlY3JldHNfZmlsZXMvU0lNVFhfREVTLw==\",\"SSO_AUTH_PASS\":\"NmUzNDRkNTAtZTQyZi00ZDY0LWJmZWMtNGQ4NzE0ZDg0MmE4\",\"SSO_REALM_INTERNET_PASS\":\"MGNiNzEyY2MtMGFlMC00NTM0LTgzYjMtMzRkOGI5ODJiZjU1\",\"SSO_REALM_INTRANET_PASS\":\"NmUzNDRkNTAtZTQyZi00ZDY0LWJmZWMtNGQ4NzE0ZDg0MmE4\"},\"kind\":\"Secret\",\"metadata\":{\"annotations\":{},\"creationTimestamp\":\"2026-06-19T14:56:44Z\",\"managedFields\":[{\"apiVersion\":\"v1\",\"fieldsType\":\"FieldsV1\",\"fieldsV1\":{\"f:data\":{\".\":{},\"f:CICSWEB_SIMTX_PASSWORD\":{},\"f:CICSWEB_SIMTX_SIATR_PASSWORD\":{},\"f:DB_PASSWORD\":{},\"f:RHDG_PASSWORD\":{},\"f:SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS\":{},\"f:SSO_AUTH_PASS\":{},\"f:SSO_REALM_INTERNET_PASS\":{},\"f:SSO_REALM_INTRANET_PASS\":{}},\"f:type\":{}},\"manager\":\"kubectl-create\",\"operation\":\"Update\",\"time\":\"2026-06-19T14:56:44Z\"}],\"name\":\"simtx-transacoes-lote-des2\",\"namespace\":\"simtx-des\",\"resourceVersion\":\"2027164006\",\"uid\":\"6a2b529c-2a9b-4c3c-9b02-843ccffd8ffd\"},\"type\":\"Opaque\"}\n"] "managedFields":[map["fieldsType":"FieldsV1" "fieldsV1":map["f:data":map["f:CICSWEB_SIMTX_SIATR_PASSWORD":map[] "f:DB_PASSWORD":map[] "f:SSO_REALM_INTERNET_PASS":map[] "f:SSO_REALM_INTRANET_PASS":map[] ".":map[] "f:CICSWEB_SIMTX_PASSWORD":map[] "f:SSO_AUTH_PASS":map[] "f:RHDG_PASSWORD":map[] "f:SMALLRYE_CONFIG_SOURCE_FILE_LOCATIONS":map[]] "f:metadata":map["f:annotations":map["f:kubectl.kubernetes.io/last-applied-configuration":map[] ".":map[]]] "f:type":map[]] "manager":"oc" "operation":"Update" "apiVersion":"v1" "time":"2026-06-19T15:00:21Z"]] "name":"simtx-transacoes-lote-des2" "namespace":"simtx-des" "uid":"4cab2414-a9f4-471d-ab53-d8b677538ec2" "resourceVersion":"2027169447" "creationTimestamp":"2026-06-19T15:00:21Z"]]}
for: "STDIN": Operation cannot be fulfilled on secrets "simtx-transacoes-lote-des2": the object has been modified; please apply your changes to the latest version and try again
-sh-4.2$
-sh-4.2$
-sh-4.2$

