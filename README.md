oc get dc siavl-gestaomodelonota-des -n siavl-des -o yaml | grep -B2 -A10 -E 'livenessProbe|readinessProbe'

oc exec siavl-gestaomodelonota-des-2-856xb -n siavl-des -- curl -s -o /dev/null -w '%{http_code}\n' http://localhost:8080/actuator/health
oc exec siavl-gestaomodelonota-des-2-856xb -n siavl-des -- curl -s -o /dev/null -w '%{http_code}\n' http://localhost:8080<path-da-probe>
