oc get events -n sicfd-des --sort-by='.lastTimestamp' | grep -i monitoramento | tail -40

oc get pods -n sicfd-des | grep sicfd-monitoramento-des-91
oc logs sicfd-monitoramento-des-91-<sufixo> -c secrets-agent-sidecar -n sicfd-des

oc debug dc/sicfd-monitoramento-des -n sicfd-des
