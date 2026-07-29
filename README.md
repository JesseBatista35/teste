oc set resources deployment silce-consulta-apostas-api-des -n silce-des --limits=cpu=1,memory=2Gi --requests=cpu=1,memory=2Gi


oc rollout status deployment silce-consulta-apostas-api-des -n silce-des

oc adm top pod -n silce-des | grep silce-consulta-apostas-api

oc get events -n silce-des --field-selector involvedObject.name=$(oc get pods -n silce-des | grep silce-consulta-apostas-api | awk '{print $1}') --sort-by='.lastTimestamp'
