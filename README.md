oc logs siavl-gerencial-frontend-des-5-deploy -n siavl-des

oc get events -n build-images-ads --sort-by='.lastTimestamp' | tail -40

oc get events -n siavl-des --sort-by='.lastTimestamp' | tail -40


