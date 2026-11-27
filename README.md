
-sh-4.2$ oc scale dc/sidsc-storybook-v19-des --replicas=1 -n sidsc-des
deploymentconfig.apps.openshift.io/sidsc-storybook-v19-des scaled
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sidsc-des | grep v19
sidsc-storybook-v19-des-78-deploy   0/1       Completed   0          14d
sidsc-storybook-v19-des-79-deploy   0/1       Completed   0          13d
sidsc-storybook-v19-des-79-mqmsr    1/2       Running     0          7s
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sidsc-des | grep v19
sidsc-storybook-v19-des-78-deploy   0/1       Completed   0          14d
sidsc-storybook-v19-des-79-deploy   0/1       Completed   0          13d
sidsc-storybook-v19-des-79-mqmsr    1/2       Running     0          16s
-sh-4.2$ oc get pods -n sidsc-des | grep v19
sidsc-storybook-v19-des-78-deploy   0/1       Completed   0          14d
sidsc-storybook-v19-des-79-deploy   0/1       Completed   0          13d
sidsc-storybook-v19-des-79-mqmsr    1/2       Running     0          26s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sidsc-des | grep v19
sidsc-storybook-v19-des-78-deploy   0/1       Completed   0          14d
sidsc-storybook-v19-des-79-deploy   0/1       Completed   0          13d
sidsc-storybook-v19-des-79-mqmsr    2/2       Running     0          31s
-sh-4.2$
