oc get dc simtr-batch-des -n simtr-des -o jsonpath='{.spec.template.spec.containers[0].imagePullPolicy}{"\n"}'

oc patch dc simtr-batch-des -n simtr-des --type=json -p '[{"op":"replace","path":"/spec/template/spec/containers/0/imagePullPolicy","value":"Always"}]'
oc rollout latest dc/simtr-batch-des -n simtr-des

