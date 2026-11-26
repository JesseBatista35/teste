
Logged into "https://api.nprd.caixa:6443" as "p585600@corp.caixa.gov.br" using the token provided.

You have access to 1009 projects, the list has been suppressed. You can list all projects with 'oc projects'

Using project "default".
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc describe quota quota-resources -n sidsc-des
Name:          quota-resources
Namespace:     sidsc-des
Resource       Used   Hard
--------       ----   ----
limits.cpu     3412m  6
limits.memory  4Gi    4Gi
pods           6      10
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n sidsc-des -o custom-columns=NOME:.metadata.name,STATUS:.status.phase,LIMIT_MEM:.spec.containers[*].resources.limits.memory
NOME                                STATUS      LIMIT_MEM
sidsc-portal-des-8-fnbpr            Running     512Mi,256Mi
sidsc-portal-v16-des-50-deploy      Succeeded   256Mi
sidsc-portal-v16-des-51-deploy      Succeeded   256Mi
sidsc-portal-v16-des-51-zzgn6       Running     512Mi,256Mi
sidsc-react-des-69-deploy           Succeeded   256Mi
sidsc-react-des-70-deploy           Succeeded   256Mi
sidsc-react-des-70-w62t5            Running     512Mi,256Mi
sidsc-storybook-v19-des-78-deploy   Succeeded   256Mi
sidsc-storybook-v19-des-79-deploy   Succeeded   256Mi
sidsc-storybook-v19-des-79-hwqvt    Running     512Mi,256Mi
sidsc-storybook-v20-des-1-deploy    Running     256Mi
sidsc-storybook-v22-des-1-deploy    Succeeded   256Mi
sidsc-storybook-v22-des-1-qpbbw     Running     512Mi,256Mi
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc,deploy -n sidsc-des
NAME                                                         REVISION   DESIRED   CURRENT   TRIGGERED BY
deploymentconfig.apps.openshift.io/sidsc-portal-des          8          1         1
deploymentconfig.apps.openshift.io/sidsc-portal-v16-des      51         1         1
deploymentconfig.apps.openshift.io/sidsc-react-des           70         1         1
deploymentconfig.apps.openshift.io/sidsc-storybook-v19-des   79         1         1
deploymentconfig.apps.openshift.io/sidsc-storybook-v20-des   1          2         0
deploymentconfig.apps.openshift.io/sidsc-storybook-v22-des   1          1         1
-sh-4.2$
