for s in siacc-pixautomatico-api-simulador-tqs siacc-pixautomatico-api-controle-requisicoes-tqs; do
  echo -n "$s: "
  oc get secret $s -n siacc-tqs -o jsonpath='{.data.QUARKUS_DATASOURCE_PASSWORD}' | base64 -d | sha256sum
done


oc get secret siacc-pixautomatico-api-controle-requisicoes-tqs -n siacc-tqs -o jsonpath='{.data.QUARKUS_DATASOURCE_PASSWORD}' | base64 -d; echo
