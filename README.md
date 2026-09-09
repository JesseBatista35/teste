oc patch resourcequota quota-resources -n sisgf-des --type='json' -p='[{"op": "replace", "path": "/spec/hard/requests.cpu", "value": "6"}]'

oc describe quota quota-resources -n sisgf-des
