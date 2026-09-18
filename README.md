oc patch dc sid01-lancamentos-financeiros-okd4-tqs -n sid01-tqs --type=json -p='[{"op": "replace", "path": "/spec/template/spec/containers/0/resources/limits/memory", "value": "2Gi"}]'

oc get pods -n sid01-tqs
