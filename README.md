
https://api.produtos4.caixa:6443
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get build sirex-agenda-api-63 -n build-images-ads
NAME                  TYPE      FROM      STATUS                        STARTED          DURATION
sirex-agenda-api-63   Source    Binary    Failed (GenericBuildFailed)   17 minutes ago   8m20s
-sh-4.2$ oc logs build/sirex-agenda-api-63 -n build-images-ads | tail -20
Adding cluster TLS certificate authority to trust store
Receiving source from STDIN as archive ...
Adding cluster TLS certificate authority to trust store
Adding cluster TLS certificate authority to trust store
time="2026-09-30T16:58:07Z" level=info msg="Not using native diff for overlay, this may cause degraded performance for building images: kernel has CONFIG_OVERLAY_FS_REDIRECT_DIR enabled"
I0930 16:58:07.856733       1 defaults.go:102] Defaulting to storage driver "overlay" with options [mountopt=metacopy=on].
Caching blobs under "/var/cache/blobs".
Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:2b03771ef7fd14c7c6a42ec090ce15958ab7a903f43d133c938da354ed77badf...
Warning: Pull failed, retrying in 5s ...
Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:2b03771ef7fd14c7c6a42ec090ce15958ab7a903f43d133c938da354ed77badf...
Warning: Pull failed, retrying in 5s ...
Trying to pull image-registry.openshift-image-registry.svc:5000/openshift/quarkus-java-binary-s2i@sha256:2b03771ef7fd14c7c6a42ec090ce15958ab7a903f43d133c938da354ed77badf...
Warning: Pull failed, retrying in 5s ...
error: Unable to update build status: builds.build.openshift.io "sirex-agenda-api-63" is forbidden: User "system:serviceaccount:build-images-ads:builder" cannot get resource "builds" in API group "build.openshift.io" in the namespace "build-images-ads": RBAC: [clusterrole.rbac.authorization.k8s.io "system:oauth-token-deleter" not found, clusterrole.rbac.authorization.k8s.io "console-extensions-reader" not found, clusterrole.rbac.authorization.k8s.io "basic-user" not found, clusterrole.rbac.authorization.k8s.io "system:public-info-viewer" not found, clusterrole.rbac.authorization.k8s.io "system:build-strategy-source" not found, clusterrole.rbac.authorization.k8s.io "system:build-strategy-jenkinspipeline" not found, clusterrole.rbac.authorization.k8s.io "cluster-admin" not found, clusterrole.rbac.authorization.k8s.io "system:discovery" not found, clusterrole.rbac.authorization.k8s.io "helm-chartrepos-viewer" not found, clusterrole.rbac.authorization.k8s.io "system:service-account-issuer-discovery" not found, clusterrole.rbac.authorization.k8s.io "system:webhook" not found, clusterrole.rbac.authorization.k8s.io "system:build-strategy-docker" not found, clusterrole.rbac.authorization.k8s.io "self-access-reviewer" not found, clusterrole.rbac.authorization.k8s.io "system:openshift:public-info-viewer" not found, clusterrole.rbac.authorization.k8s.io "system:openshift:scc:anyuid" not found, clusterrole.rbac.authorization.k8s.io "system:openshift:discovery" not found, clusterrole.rbac.authorization.k8s.io "system:basic-user" not found, clusterrole.rbac.authorization.k8s.io "system:scope-impersonation" not found, clusterrole.rbac.authorization.k8s.io "cluster-status" not found, clusterrole.rbac.authorization.k8s.io "system:image-puller" not found, clusterrole.rbac.authorization.k8s.io "system:image-builder" not found]
error: build error: After retrying 2 times, Pull image still failed due to error: unable to retrieve auth token: invalid username/password: unauthorized: unable to validate token
-sh-4.2$
