
-sh-4.2$ oc project sigda-des
Now using project "sigda-des" on server "https://api.nprd.caixa:6443".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get route sigda-api-quarkus-des -n sigda-des -o yaml
apiVersion: route.openshift.io/v1
kind: Route
metadata:
  annotations:
    description: Route for application http service
  creationTimestamp: 2026-08-10T15:35:31Z
  labels:
    app: sigda-api-quarkus-des
    application: sigda-api-quarkus-des
    template: quarkus-caixa-release
  managedFields:
  - apiVersion: route.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:description: {}
        f:labels:
          .: {}
          f:app: {}
          f:application: {}
          f:template: {}
      f:spec:
        f:host: {}
        f:port:
          .: {}
          f:targetPort: {}
        f:tls:
          .: {}
          f:insecureEdgeTerminationPolicy: {}
          f:termination: {}
        f:to:
          f:kind: {}
          f:name: {}
          f:weight: {}
        f:wildcardPolicy: {}
    manager: kubectl-create
    operation: Update
    time: 2026-08-10T15:35:31Z
  - apiVersion: route.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:ingress: {}
    manager: openshift-router
    operation: Update
    subresource: status
    time: 2026-08-10T15:35:31Z
  name: sigda-api-quarkus-des
  namespace: sigda-des
  resourceVersion: "2181132155"
  uid: 4c81b279-e154-48d3-84df-631b68143ea9
spec:
  host: sigda-api-quarkus-des.apps.nprd.caixa
  port:
    targetPort: web
  tls:
    insecureEdgeTerminationPolicy: Redirect
    termination: edge
  to:
    kind: Service
    name: sigda-api-quarkus-des
    weight: 100
  wildcardPolicy: None
status:
  ingress:
  - conditions:
    - lastTransitionTime: 2026-08-10T15:35:31Z
      status: "True"
      type: Admitted
    host: sigda-api-quarkus-des.apps.nprd.caixa
    routerCanonicalHostname: router-default.apps.nprd.caixa
    routerName: default
    wildcardPolicy: None
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get endpoints sigda-api-quarkus-des -n sigda-des
NAME                    ENDPOINTS          AGE
sigda-api-quarkus-des   25.3.37.121:8080   30d
-sh-4.2$
