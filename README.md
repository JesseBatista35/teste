oc get netnamespace sicbp-des

oc get egressip -o wide
oc get egressip -o jsonpath='{range .items[*]}{.metadata.name}{"\t"}{.spec.namespaceSelector}{"\t"}{.status.items[*].egressIP}{"\n"}{end}'

oc get pods -n sicbp-des -o wide | grep trilha

POD=$(oc get pods -n sicbp-des -o name | grep trilha | head -1)
oc exec -n sicbp-des $POD -- curl -sv -x http://proxydes.caixa:80 https://brazilsoutheast-0.in.applicationinsights.azure.com/ -o /dev/null 2>&1 | grep -E "HTTP/|TMG"

