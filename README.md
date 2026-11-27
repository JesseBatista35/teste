oc logs sidsc-storybook-v20-des-4-deploy -n sidsc-des
oc get rc -n sidsc-des | grep v20

oc patch dc/sidsc-storybook-v20-des -n sidsc-des -p '{"spec":{"strategy":{"type":"Recreate"}}}'
oc get dc sidsc-storybook-v20-des -n sidsc-des -o jsonpath='{.spec.replicas} {.spec.strategy.type}{"\n"}'
