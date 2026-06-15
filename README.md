-sh-4.2$
-sh-4.2$ POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada
Please enter content (application/x-www-form-urlencoded) to be POSTed:

^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada
Please enter content (application/x-www-form-urlencoded) to be POSTed:

^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
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
-sh-4.2$
-sh-4.2$ oc get svc siinp-nucleo-tqs -o yaml | grep -A 5 "ports:"
        f:ports:
          .: {}
          k:{"port":8080,"protocol":"TCP"}:
            .: {}
            f:name: {}
            f:port: {}
--
  ports:
  - name: web
    port: 8080
    protocol: TCP
    targetPort: 8080
  selector:
-sh-4.2$

