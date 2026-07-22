oc get pods -n simil-des -o jsonpath='{range .items[*]}{.metadata.name}{"\t"}{.status.phase}{"\t"}{range .spec.containers[*]}{.name}={.resources.limits.cpu}{" "}{end}{"\n"}{end}'

