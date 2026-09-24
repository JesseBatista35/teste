POD=sigsj-alvara-des-666-2zzkm; NS=sigsj-des

# Qual variável de opções da JVM chegou ao pod (o valor efetivo)
oc exec $POD -n $NS -- env | grep -Ei 'JAVA_OPT|JAVA_OPTIONS|JAVA_TOOL'

# Onde isso está definido: DC/Deployment, ConfigMap ou Secret
oc get dc sigsj-alvara-des -n $NS -o yaml | grep -B1 -A2 -Ei 'JAVA_OPT|javaagent'

# O jar do agente existe na imagem?
oc exec $POD -n $NS -- ls /deployments/lib/main | grep -i applicationinsights
