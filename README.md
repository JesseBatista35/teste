# containers de cada pod (procure o sidecar do BT)
oc get pod -n siacc-tqs -l name=siacc-pixautomatico-api-simulador-tqs -o jsonpath='{range .items[*]}{.metadata.name}{" -> "}{.spec.containers[*].name}{"\n"}{end}'
oc get pod -n siacc-tqs -l name=siacc-pixautomatico-api-controle-requisicoes-tqs -o jsonpath='{range .items[*]}{.metadata.name}{" -> "}{.spec.containers[*].name}{"\n"}{end}'

# volumes e mounts de cada um
oc get dc/siacc-pixautomatico-api-simulador-tqs -n siacc-tqs -o yaml | grep -A3 -iE 'secrets_files|volumeMounts|volumes:'
oc get dc/siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs -o yaml | grep -A3 -iE 'secrets_files|volumeMounts|volumes:'

# no pod que funciona, confirme o arquivo (só nome e tamanho, sem cat)
oc exec <pod-controle-requisicoes> -n siacc-tqs -c <container> -- ls -la /usr/src/app/secrets_files/siacc_tqs/
