oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o yaml | grep -B 2 -A 10 "livenessProbe\|readinessProbe"


oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}'

oc get deployment sispl-canal-processamento-pix-hmp -n sispl-hmp -o jsonpath='{.spec.template.spec.containers[0].readinessProbe}'


oc logs sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt -n sispl-hmp | grep -i "vault\|unable to resolve\|VAULT::"


oc logs sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt -n sispl-hmp --previous | grep -E "WFLYSRV0049|WFLYSRV0025|Resuming server"

oc get events -n sispl-hmp --field-selector involvedObject.name=sispl-canal-processamento-pix-hmp-6cf5c667dd-lvggt --sort-by='.lastTimestamp'


