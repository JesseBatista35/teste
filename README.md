
-sh-4.2$ oc describe configmap nginx-conf-d-siavl-enviomsgativa-microfront -n siavl-des
error: selfLink was empty, can't make reference
-sh-4.2$ oc get configmap nginx-conf-d-siavl-enviomsgativa-microfront -n siavl-des -o yaml
apiVersion: v1
data:
  siavl-nginx.conf: "location /api/ {\n    client_max_body_size 10M;\n    proxy_set_header
    X-Forwarded-Host $host;\n    proxy_set_header X-Forwarded-Server $host;\n    proxy_set_header
    X-Forwarded-For $proxy_add_x_forwarded_for;\n    proxy_pass https://siavl-enviomsgativa-microfront-des.apps.nprd.caixa;
    \n    proxy_redirect off;\n    server_tokens off;\n}"
kind: ConfigMap
metadata:
  creationTimestamp: 2026-07-24T16:52:29Z
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:data:
        .: {}
        f:siavl-nginx.conf: {}
    manager: kubectl-create
    operation: Update
    time: 2026-07-24T16:52:29Z
  name: nginx-conf-d-siavl-enviomsgativa-microfront
  namespace: siavl-des
  resourceVersion: "2098985258"
  uid: 1abce282-b197-458f-8d36-2fdd2f8355b0
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod -n siavl-des | grep siavl-enviomsgativa
siavl-enviomsgativa-backend-des-14-deploy       0/1       Completed   0              2d1h
siavl-enviomsgativa-backend-des-15-deploy       0/1       Completed   0              46h
siavl-enviomsgativa-backend-des-15-zkb89        1/1       Running     0              46h
siavl-enviomsgativa-microfront-des-2-deploy     0/1       Error       0              4h46m
siavl-enviomsgativa-microfront-des-3-deploy     0/1       Error       0              15m
-sh-4.2$ oc get rs -n siavl-des | grep siavl-enviomsgativa
No resources found.
-sh-4.2$
