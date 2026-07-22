oc get events -n simil-des -o wide | grep -i "simil-api-des-9"


oc get events -n simil-des --sort-by='{.metadata.creationTimestamp}' | grep -i simil-api-des-9


oc get limitrange -n simil-des
oc describe limitrange -n simil-des
