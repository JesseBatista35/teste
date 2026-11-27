oc scale dc/sidsc-storybook-v19-des --replicas=1 -n sidsc-des
oc get pods -n sidsc-des | grep v19
