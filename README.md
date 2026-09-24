

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get project selenium-grid -o yaml | grep -iE "requester|description|display"
    openshift.io/description: selenium-grid
    openshift.io/display-name: selenium-grid
    openshift.io/requester: p911751
          f:openshift.io/requester: {}
          f:openshift.io/description: {}
          f:openshift.io/display-name: {}
-sh-4.2$ oc get rolebindings -n selenium-grid
NAME                              ROLE                                          AGE
admin                             ClusterRole/admin                             2y195d
system:deployers                  ClusterRole/system:deployer                   2y195d
system:image-builders             ClusterRole/system:image-builder              2y195d
system:image-pullers              ClusterRole/system:image-puller               2y195d
system:openshift:scc:anyuid       ClusterRole/system:openshift:scc:anyuid       2y195d
system:openshift:scc:privileged   ClusterRole/system:openshift:scc:privileged   2y195d
-sh-4.2$ oc get dc -n selenium-grid -o custom-columns=NAME:.metadata.name,IMAGE:.spec.template.spec.containers[*].image
NAME                     IMAGE
chrome                   selenium/node-chrome@sha256:ee8402fbc6f7efbdb74a203c7eb7d4369a84641d62f8c6517ff9a0cd22deadd0
edge                     selenium/node-edge@sha256:b17f5dc3018c0a9938ef39d967341780b0cd01fc2ebdf35ef939e052b33f587c
firefox                  selenium/node-firefox@sha256:a0c2e5591a82ea4a5e0ffa49c79ccf68716fe2b46ccb712e269ba37eb2dd31db
selenium-distributor     selenium/distributor@sha256:5b3f86525d588c26dad55c84e67f63ee859fcf08d93dbca03cfffd6d186162d7
selenium-event-bus       selenium/event-bus@sha256:53718782fb5281a07a30a1cd5ec6fbeac915dc8ba8672aaffae6f9796c41cf18
selenium-router          selenium/router@sha256:5b63362ee1d95af7a0086411945e24b98cc97d27e2e8e95540b6c38f0dd9f4b0
selenium-session-queue   selenium/session-queue@sha256:c137f823380765b5bf362e8b002575aab9f8bf6d2886d1cd58f42a30d3923f19
selenium-sessions        selenium/sessions@sha256:f0a3719c03a8dd88769bd2fb1eabbd72a75883a823504b44b00dcba8085ad314
-sh-4.2$ oc rsh -n selenium-grid <pod-chrome> df -h /dev/shm
-sh: pod-chrome: Arquivo ou diretório não encontrado
-sh-4.2$ oc get dc <dc-chrome> -n selenium-grid -o yaml | grep -iA3 shm
-sh: dc-chrome: Arquivo ou diretório não encontrado
-sh-4.2$
