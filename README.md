
-sh-4.2$ oc set image dc/sipar-inter-frontend-des \
>   sipar-inter-frontend-des=image-registry.openshift-image-registry.svc:5000/openshift/httpd:2.4-el8
deploymentconfig.apps.openshift.io/sipar-inter-frontend-des image updated
-sh-4.2$
-sh-4.2$ oc set probe dc/sipar-inter-frontend-des --liveness --readiness --remove
deploymentconfig.apps.openshift.io/sipar-inter-frontend-des probes updated
-sh-4.2$
-sh-4.2$ oc set probe dc/sipar-inter-frontend-des --liveness --readiness \
>   --open-tcp=8080 --initial-delay-seconds=30 --timeout-seconds=5
deploymentconfig.apps.openshift.io/sipar-inter-frontend-des probes updated
-sh-4.2$
-sh-4.2$ oc get dc sipar-inter-frontend-des -o yaml | grep -E "image:|tcpSocket|port: 8080"
                f:image: {}
                  f:tcpSocket:
                  f:tcpSocket:
        image: image-registry.openshift-image-registry.svc:5000/openshift/httpd:2.4-el8
          tcpSocket:
            port: 8080
          tcpSocket:
            port: 8080
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sipar-inter-frontend-des
deploymentconfig.apps.openshift.io/sipar-inter-frontend-des rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sipar-inter-frontend-des
Waiting for rollout to finish: 1 old replicas are pending termination...
^C-sh-4.2$ httpd:2.4-el8
-sh: httpd:2.4-el8: comando não encontrado
-sh-4.2$ oc get pods | grep frontend
sipar-inter-frontend-des-28-ks9fm    0/1       ImagePullBackOff   0             114m
sipar-inter-frontend-des-31-deploy   0/1       Error              0             19h
sipar-inter-frontend-des-32-deploy   1/1       Running            0             40s
sipar-inter-frontend-des-32-l46w8    0/1       Error              2 (19s ago)   37s
-sh-4.2$
-sh-4.2$
-sh-4.2$
