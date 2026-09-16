oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.spec.template.spec.containers[*].name}{"\n"}'

oc debug dc/sicfd-monitoramento-des -n sicfd-des -c sicfd-monitoramento-des
