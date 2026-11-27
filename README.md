
-sh-4.2$ oc logs sidsc-storybook-v20-des-4-deploy -n sidsc-des
--> Scaling up sidsc-storybook-v20-des-4 from 0 to 1, scaling down sidsc-storybook-v20-des-2 from 1 to 0 (keep 1 pods available, don't exceed 2 pods)
    Scaling sidsc-storybook-v20-des-4 up to 1
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-rf2ch" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-896dh" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-cxjqg" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-6lwz9" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-2zs2z" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-pw2wr" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-lmqwg" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-skknf" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 Error creating: pods "sidsc-storybook-v20-des-4-r897f" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
-->  FailedCreate: sidsc-storybook-v20-des-4 (combined from similar events): Error creating: pods "sidsc-storybook-v20-des-4-4ztgv" is forbidden: exceeded quota: quota-resources, requested: limits.memory=768Mi, used: limits.memory=4Gi, limited: limits.memory=4Gi
error: timed out waiting for "sidsc-storybook-v20-des-4" to be synced
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc -n sidsc-des | grep v20
sidsc-storybook-v20-des-1    0         0         0         5h25m
sidsc-storybook-v20-des-2    1         1         1         5h14m
sidsc-storybook-v20-des-3    0         0         0         5h9m
sidsc-storybook-v20-des-4    0         0         0         4h50m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch dc/sidsc-storybook-v20-des -n sidsc-des -p '{"spec":{"strategy":{"type":"Recreate"}}}'
deploymentconfig.apps.openshift.io/sidsc-storybook-v20-des patched
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sidsc-storybook-v20-des -n sidsc-des -o jsonpath='{.spec.replicas} {.spec.strategy.type}{"\n"}'
1 Recreate
-sh-4.2$
