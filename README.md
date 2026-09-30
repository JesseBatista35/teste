oc get clusterrole cluster-admin
oc auth can-i get builds -n build-images-ads --as=system:serviceaccount:build-images-ads:builder
oc get builds -n build-images-ads --sort-by=.metadata.creationTimestamp | tail -10
