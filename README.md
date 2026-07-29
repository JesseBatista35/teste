oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o yaml | grep -A 10 -E "livenessProbe|readinessProbe"


oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}'
echo
oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe}'
echo
