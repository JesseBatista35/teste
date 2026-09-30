# Log do agente (é aqui que deve aparecer o ConnectTimeout)
oc logs $POD -n sispl-des -c secrets-agent-sidecar

# Exit code do agente e última saída do check
oc get $POD -n sispl-des -o jsonpath='{.status.initContainerStatuses[0].state.terminated.exitCode}'; echo
oc logs $POD -n sispl-des -c secrets-check --previous | tail -20


oc run nettest -n sispl-des --rm -it --restart=Never \
  --image=default-route-openshift-image-registry.apps.produtos4.caixa/openshift/ubi:9.3-1552 \
  --overrides='{"spec":{"imagePullSecrets":[{"name":"registry-secret"}]}}' -- \
  bash -c 'timeout 10 bash -c "</dev/tcp/sicsn.caixa/443" && echo TCP_OK || echo TCP_FALHA; curl -sk -o /dev/null -w "HTTP %{http_code}\n" --connect-timeout 10 https://sicsn.caixa/BeyondTrust/api/public/v3/Auth/connect/token'
