
oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.spec.template.spec.containers[0].command}{"\n"}'
oc get dc sicfd-monitoramento-des -n sicfd-des -o jsonpath='{.spec.template.spec.containers[0].args}{"\n"}'
