oc get dc sidsc-storybook-v20-des -n sidsc-des -o jsonpath='{.spec.replicas} {.spec.strategy.type}{"\n"}'
