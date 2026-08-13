oc rsh sifpp-micro-des-35-8bfs8 sh -c "unzip -p /deployments/app/sifpp-ms-0.0.0.1.jar application.properties"


oc get pod sifpp-micro-des-35-8bfs8 -n sifpp-des -o yaml | grep -B2 -A10 "valueFrom\|configMapRef\|secretRef"
