
-sh-4.2$ oc get events -n sibec-des --sort-by=.lastTimestamp | tail -20
F1029 14:48:08.926466  127575 sorter.go:306] Field {.lastTimestamp} in *unstructured.Unstructured is an unsortable type: interface, err: unsortable type: <nil>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sibec-arquivos-des -n sibec-des -o jsonpath='{range .spec.template.spec.volumes[*]}{.name}{" -> "}{.persistentVolumeClaim.claimName}{"\n"}{end}{"---\n"}{range .spec.template.spec.containers[*].volumeMounts[*]}{.name}{" -> "}{.mountPath}{"\n"}{end}'
secrets ->
script-bt-volume ->
sibec-arquivos-nfs-data-des -> sibec-arquivos-nfs-data-des
sibec-arquivos-data-des -> sibec-arquivos-data-des
caixa-truststore-acteste-nprd ->
---
secrets -> /usr/src/app/secrets_files
sibec-arquivos-nfs-data-des -> /sibec
sibec-arquivos-data-des -> /sibec3
caixa-truststore-acteste-nprd -> /deployments/caixa-truststore-acteste-nprd.jks
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sibec-des | grep arquivos
sibec-arquivos-des-208-deploy            0/1       Completed   0               34m
sibec-arquivos-des-209-deploy            0/1       Completed   0               23m
sibec-arquivos-des-209-r7dn8             1/1       Running     0               23m
-sh-4.2$
-sh-4.2$
-sh-4.2$ ^C
-sh-4.2$ oc get events -n sibec-des --sort-by=.metadata.creationTimestamp | tail -20
23m         23m          1         sibec-arquivos-des-209-deploy.18e31020e01abe0d            Pod                     spec.containers{deployment}                             Normal    Pulled                        kubelet, ceadecldlx068.nprd.caixa   Container image "quay.io/openshift/okd-content@sha256:0c49a1e144b537b9c69339d504287fe5c6974ffe69a3212345a5608c06db8a18" already present on machine
23m         23m          1         sibec-arquivos-des-209-deploy.18e31020ed6d836d            Pod                     spec.containers{deployment}                             Normal    Created                       kubelet, ceadecldlx068.nprd.caixa   Created container deployment
23m         23m          1         sibec-arquivos-des-209-deploy.18e31020f0770d93            Pod                     spec.containers{deployment}                             Normal    Started                       kubelet, ceadecldlx068.nprd.caixa   Started container deployment
<unknown>   <unknown>    0         sibec-arquivos-des-209-r7dn8.18e31021348aeeb0             Pod                                                                             Normal    Scheduled                                                         Successfully assigned sibec-des/sibec-arquivos-des-209-r7dn8 to ceadecldlx048.nprd.caixa
23m         23m          1         sibec-arquivos-des-209.18e31021340401fe                   ReplicationController                                                           Normal    SuccessfulCreate              replication-controller              Created pod: sibec-arquivos-des-209-r7dn8
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e31021c55568f3             Pod                     spec.initContainers{secrets-agent-sidecar}              Normal    Pulled                        kubelet, ceadecldlx048.nprd.caixa   Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/secrets-agent:v23.3.2" already present on machine
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e31021c30cafed             Pod                                                                             Normal    AddedInterface                multus                              Add eth0 [25.3.20.62/23] from openshift-sdn
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e31021d9997bfd             Pod                     spec.initContainers{secrets-agent-sidecar}              Normal    Started                       kubelet, ceadecldlx048.nprd.caixa   Started container secrets-agent-sidecar
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e31021d7d86e61             Pod                     spec.initContainers{secrets-agent-sidecar}              Normal    Created                       kubelet, ceadecldlx048.nprd.caixa   Created container secrets-agent-sidecar
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e3102230d7f8d5             Pod                     spec.initContainers{secrets-check}                      Normal    Pulled                        kubelet, ceadecldlx048.nprd.caixa   Container image "default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552" already present on machine
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e310223f802c26             Pod                     spec.initContainers{secrets-check}                      Normal    Created                       kubelet, ceadecldlx048.nprd.caixa   Created container secrets-check
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e3102240f8ac1e             Pod                     spec.initContainers{secrets-check}                      Normal    Started                       kubelet, ceadecldlx048.nprd.caixa   Started container secrets-check
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e31022709ba24e             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Pulled                        kubelet, ceadecldlx048.nprd.caixa   Successfully pulled image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sibec-arquivos:1.6.9.5" in 64.132791ms (64.138825ms including waiting)
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e310227ffda82b             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Started                       kubelet, ceadecldlx048.nprd.caixa   Started container sibec-arquivos-des
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e310227e96a15b             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Created                       kubelet, ceadecldlx048.nprd.caixa   Created container sibec-arquivos-des
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e310226cc8baa2             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Pulling                       kubelet, ceadecldlx048.nprd.caixa   Pulling image "default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/sibec-arquivos:1.6.9.5"
23m         23m          3         sibec-arquivos-des-209-r7dn8.18e31022e4ab28bd             Pod                     spec.containers{sibec-arquivos-des}                     Warning   Unhealthy                     kubelet, ceadecldlx048.nprd.caixa   Readiness probe failed: Get "http://25.3.20.62:8080/ready": dial tcp 25.3.20.62:8080: connect: connection refused
23m         23m          1         sibec-arquivos-des-209-r7dn8.18e31023a00dd06f             Pod                     spec.containers{sibec-arquivos-des}                     Warning   Unhealthy                     kubelet, ceadecldlx048.nprd.caixa   Liveness probe failed: Get "http://25.3.20.62:8080/live": dial tcp 25.3.20.62:8080: connect: connection refused
23m         23m          1         sibec-arquivos-des-208.18e310262829f994                   ReplicationController                                                           Normal    SuccessfulDelete              replication-controller              Deleted pod: sibec-arquivos-des-208-zcmrt
23m         23m          1         sibec-arquivos-des-208-zcmrt.18e310262861069f             Pod                     spec.containers{sibec-arquivos-des}                     Normal    Killing                       kubelet, ceadecldlx068.nprd.caixa   Stopping container sibec-arquivos-des
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh sibec-arquivos-des-209-r7dn8 sh -c 'cd <mount_antigo> && tar cf - . | (cd <mount_novo> && tar xf - --no-same-owner)'
sh: -c: line 0: syntax error near unexpected token `&&'
sh: -c: line 0: `cd <mount_antigo> && tar cf - . | (cd <mount_novo> && tar xf - --no-same-owner)'
command terminated with exit code 1
-sh-4.2$
