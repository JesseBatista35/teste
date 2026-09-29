
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
-sh-4.2$
