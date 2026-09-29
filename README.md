oc set image dc/sipar-inter-frontend-des \
  sipar-inter-frontend-des=image-registry.openshift-image-registry.svc:5000/openshift/httpd:2.4-el8

oc set probe dc/sipar-inter-frontend-des --liveness --readiness --remove

oc set probe dc/sipar-inter-frontend-des --liveness --readiness \
  --open-tcp=8080 --initial-delay-seconds=30 --timeout-seconds=5

oc get dc sipar-inter-frontend-des -o yaml | grep -E "image:|tcpSocket|port: 8080"
