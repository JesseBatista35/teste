-sh-4.2$ oc get route integra.iniciadora -o yaml
apiVersion: route.openshift.io/v1
kind: Route
metadata:
  creationTimestamp: 2024-04-03T15:18:39Z
  labels:
    app: siinp-nucleo-tqs
    application: siinp-nucleo-tqs
    template: quarkus-caixa-release
  managedFields:
  - apiVersion: route.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:status:
        f:ingress: {}
    manager: openshift-router
    operation: Update
    subresource: status
    time: 2026-06-12T23:33:37Z
  - apiVersion: route.openshift.io/v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:labels:
          .: {}
          f:app: {}
          f:application: {}
          f:template: {}
      f:spec:
        f:host: {}
        f:path: {}
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
    manager: Mozilla
    operation: Update
    time: 2026-06-12T23:37:43Z
  name: integra.iniciadora
  namespace: siinp-tqs
  resourceVersion: "2013985969"
  uid: ad0e8aea-fdd8-4cf8-8da2-67041d969e0d
spec:
  host: integra.iniciadora.caixa.gov.br
  path: /
  port:
    targetPort: web
  tls:
    insecureEdgeTerminationPolicy: Redirect
    termination: edge
  to:
    kind: Service
    name: siinp-nucleo-tqs
    weight: 100
  wildcardPolicy: None
status:
  ingress:
  - conditions:
    - lastTransitionTime: 2026-06-12T23:33:37Z
      status: "True"
      type: Admitted
    host: integra.iniciadora.caixa.gov.br
    routerCanonicalHostname: router-default.apps.nprd.caixa
    routerName: default
    wildcardPolicy: None
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get svc siinp-nucleu-tqs -o yaml
Error from server (NotFound): services "siinp-nucleu-tqs" not found
-sh-4.2$ oc get svc siinp-nucleo-tqs -o yaml
apiVersion: v1
kind: Service
metadata:
  annotations:
    description: Exposes and load balances the application pods
    openshift.io/generated-by: OpenShiftNewApp
  creationTimestamp: 2023-04-26T15:27:24Z
  labels:
    app: siinp-nucleo-tqs
    application: siinp-nucleo-tqs
    template: quarkus-caixa-release
  managedFields:
  - apiVersion: v1
    fieldsType: FieldsV1
    fieldsV1:
      f:metadata:
        f:annotations:
          .: {}
          f:description: {}
          f:openshift.io/generated-by: {}
        f:labels:
          .: {}
          f:app: {}
          f:application: {}
          f:template: {}
      f:spec:
        f:internalTrafficPolicy: {}
        f:ports:
          .: {}
          k:{"port":8080,"protocol":"TCP"}:
            .: {}
            f:name: {}
            f:port: {}
            f:protocol: {}
            f:targetPort: {}
        f:selector: {}
        f:sessionAffinity: {}
        f:type: {}
    manager: oc
    operation: Update
    time: 2023-04-26T15:27:24Z
  name: siinp-nucleo-tqs
  namespace: siinp-tqs
  resourceVersion: "107419719"
  uid: a01ea736-f934-455d-acd9-850eeb0c2daa
spec:
  clusterIP: 25.128.48.235
  clusterIPs:
  - 25.128.48.235
  internalTrafficPolicy: Cluster
  ipFamilies:
  - IPv4
  ipFamilyPolicy: SingleStack
  ports:
  - name: web
    port: 8080
    protocol: TCP
    targetPort: 8080
  selector:
    name: siinp-nucleo-tqs
  sessionAffinity: None
  type: ClusterIP
status:
  loadBalancer: {}
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc port-forward pod/siinp-nucleo-tqs-513-7hgs9 8080:8080
Forwarding from 127.0.0.1:8080 -> 8080
Forwarding from [::1]:8080 -> 8080
^C-sh-4.2$
-sh-4.2$
-sh-4.2$ curl http://localhost:8080/inic-pagto/nucleo/v1/jornada -X POST
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$
-sh-4.2$
-sh-4.2$
