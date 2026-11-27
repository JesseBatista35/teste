-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod siavl-atddigital-frontend-125-build -o wide
NAME                                  READY   STATUS     RESTARTS   AGE   IP            NODE             NOMINATED NODE   READINESS GATES
siavl-atddigital-frontend-125-build   0/1     Init:0/2   0          20h   25.2.31.243   cadnpcldlx1180   <none>           <none>
-sh-4.2$ oc logs siavl-atddigital-frontend-125-build --tail=50
Error from server (BadRequest): container "sti-build" in pod "siavl-atddigital-frontend-125-build" is waiting to start: PodInitializing
-sh-4.2$ ^C
-sh-4.2$ oc logs siavl-atddigital-frontend-125-build --tail=50
Error from server (BadRequest): container "sti-build" in pod "siavl-atddigital-frontend-125-build" is waiting to start: PodInitializing
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe pod siavl-atddigital-frontend-125-build | tail -20
    Type:       EmptyDir (a temporary directory that shares a pod's lifetime)
    Medium:
    SizeLimit:  <unset>
  build-blob-cache:
    Type:       EmptyDir (a temporary directory that shares a pod's lifetime)
    Medium:
    SizeLimit:  <unset>
  kube-api-access-s8m2g:
    Type:                    Projected (a volume that contains injected data from multiple sources)
    TokenExpirationSeconds:  3607
    ConfigMapName:           kube-root-ca.crt
    ConfigMapOptional:       <nil>
    DownwardAPI:             true
    ConfigMapName:           openshift-service-ca.crt
    ConfigMapOptional:       <nil>
QoS Class:                   BestEffort
Node-Selectors:              kubernetes.io/os=linux
Tolerations:                 node.kubernetes.io/not-ready:NoExecute op=Exists for 300s
                             node.kubernetes.io/unreachable:NoExecute op=Exists for 300s
Events:                      <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc cancel-build siavl-atddigital-frontend-125
build.build.openshift.io/siavl-atddigital-frontend-125 marked for cancellation, waiting to be cancelled
error: build build-images-ads/siavl-atddigital-frontend-125 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-125" not found
error: failure during the build cancellation
-sh-4.2$ oc cancel-build $(oc get build -l buildconfig=siavl-atddigital-frontend --no-headers | awk '$4=="New"{print $1}')
build.build.openshift.io/siavl-atddigital-frontend-127 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-131 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-133 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-136 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-130 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-132 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-128 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-129 marked for cancellation, waiting to be cancelled
I1127 11:33:07.000494   12930 request.go:665] Waited for 1.181040969s due to client-side throttling, not priority and fairness, request: PUT:https://api.produtos4.caixa:6443/apis/build.openshift.io/v1/namespaces/build-images-ads/builds/siavl-atddigital-frontend-134
build.build.openshift.io/siavl-atddigital-frontend-134 marked for cancellation, waiting to be cancelled
build.build.openshift.io/siavl-atddigital-frontend-135 marked for cancellation, waiting to be cancelled
error: build build-images-ads/siavl-atddigital-frontend-127 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-127" not found
error: build build-images-ads/siavl-atddigital-frontend-131 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-131" not found
error: build build-images-ads/siavl-atddigital-frontend-133 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-133" not found
error: build build-images-ads/siavl-atddigital-frontend-136 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-136" not found
error: build build-images-ads/siavl-atddigital-frontend-130 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-130" not found
error: build build-images-ads/siavl-atddigital-frontend-132 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-132" not found
error: build build-images-ads/siavl-atddigital-frontend-128 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-128" not found
error: build build-images-ads/siavl-atddigital-frontend-129 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-129" not found
error: build build-images-ads/siavl-atddigital-frontend-134 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-134" not found
error: build build-images-ads/siavl-atddigital-frontend-135 failed to cancel: builds.build.openshift.io "siavl-atddigital-frontend-135" not found
error: failure during the build cancellation
-sh-4.2$ oc get build -l buildconfig=siavl-atddigital-frontend | grep -E 'Running|New'
siavl-atddigital-frontend-126   Source   Binary   Running    17 seconds ago
-sh-4.2$
