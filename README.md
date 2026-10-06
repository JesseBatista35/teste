# Qual init container está travado e os eventos do pod
oc describe pod sicmo-internet-des-97-jhcrl -n sicmo-des

# Nomes dos init containers
oc get pod sicmo-internet-des-97-jhcrl -n sicmo-des \
  -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'

# Log do init container que está rodando/travado
oc logs sicmo-internet-des-97-jhcrl -n sicmo-des -c <nome-do-init>

oc get deploy,dc -n sicmo-des | grep sicmo
oc get dc sicmo-internet-des -n sicmo-des -o yaml > internet.yaml
oc get dc sicmo-intranet-des -n sicmo-des -o yaml > intranet.yaml   # ajuste o nome real
diff <(yq '.spec.template.spec.initContainers' intranet.yaml) <(yq '.spec.template.spec.initContainers' internet.yaml)

