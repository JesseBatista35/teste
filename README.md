oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}' | jq
oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe}' | jq

oc get dc sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}' | jq

