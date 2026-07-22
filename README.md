oc get pods -n simil-des -o custom-columns=NAME:.metadata.name,STATUS:.status.phase,CPU_LIMIT:.spec.containers[0].resources.limits.cpu

