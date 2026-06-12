🔧 Plano de Troubleshooting
1. Verificar Status das Máquinas
bash# Conectar ao cluster
oc login

# Verificar status das máquinas
oc get machines -n openshift-machine-api
oc describe machine <nome-da-machine> -n openshift-machine-api

# Verificar logs
oc logs -n openshift-machine-api -l app=machine-controller --tail=100
2. Verificar Sincronização
bash# Status dos nodes
oc get nodes
oc describe node <nome-do-node>

# Verificar eventos de erro
oc get events -n openshift-machine-api --sort-by='.lastTimestamp'
3. Validar Integração AAD
bash# Verificar status da autenticação
oc get oauths.config.openshift.io cluster -o yaml

# Verificar certificate/secrets
oc get secrets -n openshift-config | grep -i aad
4. Verificar Recursos do Cluster
bash# CPU, Memória e Disco
oc top nodes
oc top pods -n openshift-machine-api
