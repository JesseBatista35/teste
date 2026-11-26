oc describe quota quota-resources -n sidsc-des
oc get pods -n sidsc-des -o custom-columns=NOME:.metadata.name,STATUS:.status.phase,LIMIT_MEM:.spec.containers[*].resources.limits.memory
oc get dc,deploy -n sidsc-des
