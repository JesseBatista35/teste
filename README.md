oc get pods -n openshift-image-registry
oc exec -n openshift-image-registry <pod-do-registry> -- df -h /registry


oc adm prune images --confirm

oc exec -n openshift-image-registry <pod-do-registry> -- registry garbage-collect /etc/registry/config.yml
