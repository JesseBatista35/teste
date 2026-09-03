oc set resources dc/sisgf-batch-des -c sisgf-batch-des --requests=memory=400Mi -n sisgf-des

oc rollout status dc/sisgf-batch-des -n sisgf-des

oc get pods -n sisgf-des
oc describe resourcequota -n sisgf-des

