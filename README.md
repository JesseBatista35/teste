oc get dc sipcs-digital-pay-provisionamento-visa-des -n sipcs-des -o yaml | grep -E -A15 "livenessProbe|readinessProbe"


oc get dc -n sipcs-des | grep visa

oc get pods -n sipcs-des -l name=sipcs-digital-pay-provisionamento-visa-des
