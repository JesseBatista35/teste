# 1. Em qual cluster você está (comparar com o OKD_API_REGISTRY do variable group OKD-REGISTRY-CENTRALIZADO)
oc whoami --show-server

# 2. Todas as tags do IS
oc get is quarkus-java-binary-s2i -n openshift -o jsonpath='{.status.tags[*].tag}{"\n"}'

# 3. Em qual tag/histórico aparece o digest usado na Build
oc describe is quarkus-java-binary-s2i -n openshift | grep -B4 -E 'e2c350a5|ddff87db'


oc get pod -n build-images-ads | grep java-check
oc delete pod java-check-8-2 -n build-images-ads --ignore-not-found
