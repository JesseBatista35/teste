oc get bc sample-angular -n build-images-ads -o yaml | grep -A5 sourceStrategy


oc get is nginx -n openshift -o jsonpath='{.status.tags[*].tag}'
