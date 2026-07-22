oc get events -n simil-des --sort-by=.lastTimestamp | tail -50
oc describe rc simil-api-des-9 -n simil-des
oc get dc simil-api-des -n simil-des -o yaml | grep -A10 -E "readinessProbe|livenessProbe|resources:"
