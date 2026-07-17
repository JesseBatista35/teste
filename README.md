-sh-4.2$ oc get pods -n sihdg-des -l deploymentconfig=sihdg-jboss8-des -o wide
NAME                        READY     STATUS             RESTARTS          AGE       IP           NODE                       NOMINATED NODE   READINESS GATES
sihdg-jboss8-des-19-6r65j   0/1       CrashLoopBackOff   111 (3m55s ago)   7h18m     25.1.22.58   ceadecldlx049.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod <nome-do-pod-novo> -n sihdg-des | grep -i image
-sh: nome-do-pod-novo: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get is sihdg-jboss8-des -n sihdg-des -o yaml
apiVersion: image.openshift.io/v1
kind: ImageStream
metadata:
  annotations:
    description: Keeps track of changes in the application image
  creationTimestamp: 2026-07-10T16:31:06Z
  generation: 1
  labels:
    app: sihdg-jboss8-des
    application: sihdg-jboss8-des
    template: jboss-caixa-release
  managedFields:
  - apiVersion: image.openshift.io/v1
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
    manager: kubectl-create
    operation: Update
    time: 2026-07-10T16:31:06Z
  name: sihdg-jboss8-des
  namespace: sihdg-des
  resourceVersion: "2069032266"
  uid: 8460ecad-3595-4461-9674-60cb94f69f43
spec:
  lookupPolicy:
    local: false
status:
  dockerImageRepository: image-registry.openshift-image-registry.svc:5000/sihdg-des/sihdg-jboss8-des
-sh-4.2$ oc get builds -n sihdg-des
No resources found.
-sh-4.2$ oc logs build/<nome-do-build-mais-recente> -n sihdg-des | grep -i "Cloning\|commit\|branch"
-sh: nome-do-build-mais-recente: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get bc sihdg-jboss8-des -n sihdg-des -o yaml | grep -i "incremental\|forcePull\|noCache"
Error from server (NotFound): buildconfigs.build.openshift.io "sihdg-jboss8-des" not found
-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o jsonpath='{.spec.template.spec.containers[0].image}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sihdg-jboss8:3.12.0.7-sh-4.2$
-sh-4.2$
-sh-4.2$

