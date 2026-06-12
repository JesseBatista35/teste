3. Verificar a API de Machine Controller
bashoc get pods -n openshift-machine-api
oc logs -n openshift-machine-api deployment/machine-controller-manager
4. Verificar Machine Sets
bashoc get machinesets -n openshift-machine-api
oc get machinesets -A
5. Verificar se há problemas de sincronização
bashoc get events -n openshift-machine-api --sort-by='.lastTimestamp' | tail -20
