oc get pods -n sisgf-des | grep batch

oc delete pod sisgf-batch-des-293-ljsg2 -n sisgf-des --grace-period=0 --force

oc get pods -n sisgf-des -l app=sisgf-batch-des
oc logs -f dc/sisgf-batch-des -n sisgf-des
