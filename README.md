POD=$(oc get pod -n sigsj-des -l name=sigsj-alvara-des -o name --sort-by=.metadata.creationTimestamp | tail -1)

# Erros de envio do agente
oc logs $POD -n sigsj-des | grep -Ei 'c.m.applicationinsights|ingestion|telemetry.*fail|403|407|timeout'

# Teste de saída pelo proxy até a ingestão
oc exec $POD -n sigsj-des -- curl -sv -x http://proxydes.caixa:80 -o /dev/null -w '%{http_code}\n' \
  https://brazilsouth-1.in.applicationinsights.azure.com/v2.1/track
