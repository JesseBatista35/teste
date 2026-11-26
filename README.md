
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
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout cancel dc/sidsc-storybook-v20-des -n sidsc-des
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sidsc-storybook-v20-des -n sidsc-des -o jsonpath='{range .spec.template.spec.containers[*]}{.name}{" -> "}{.resources}{"\n"}{end}'
sidsc-storybook-v20-des -> map[limits:map[memory:512Mi cpu:500m] requests:map[cpu:500m memory:512Mi]]
sidsc-storybook-v20-des-exporter -> map[]
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc scale dc/sidsc-storybook-v20-des --replicas=1 -n sidsc-des
deploymentconfig.apps.openshift.io/sidsc-storybook-v20-des scaled
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set resources dc/sidsc-storybook-v20-des -c <container-nginx> --limits=memory=256Mi --requests=memory=128Mi -n sidsc-des
-sh: container-nginx: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc scale dc/sidsc-storybook-v19-des --replicas=0 -n sidsc-des
deploymentconfig.apps.openshift.io/sidsc-storybook-v19-des scaled
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout latest dc/sidsc-storybook-v20-des -n sidsc-des
deploymentconfig.apps.openshift.io/sidsc-storybook-v20-des rolled out
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status dc/sidsc-storybook-v20-des -n sidsc-des
Waiting for rollout to finish: 0 of 1 updated replicas are available...

