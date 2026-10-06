
-sh-4.2$ oc describe pod sicmo-internet-des-97-jhcrl -n sicmo-des
Error from server (NotFound): pods "sicmo-internet-des-97-jhcrl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sicmo-internet-des-97-jhcrl -n sicmo-des \
> -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'
Error from server (NotFound): pods "sicmo-internet-des-97-jhcrl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod sicmo-internet-des-97-jhcrl -n sicmo-des \
>   -o jsonpath='{range .spec.initContainers[*]}{.name}{"\n"}{end}'
Error from server (NotFound): pods "sicmo-internet-des-97-jhcrl" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deploy,dc -n sicmo-des | grep sicmo
deploymentconfig.apps.openshift.io/sicmo-api-17-des              23         1         1
deploymentconfig.apps.openshift.io/sicmo-backend-des             199        1         1
deploymentconfig.apps.openshift.io/sicmo-eap-des                 4          1         0
deploymentconfig.apps.openshift.io/sicmo-internet-des            97         1         1
deploymentconfig.apps.openshift.io/sicmo-internet-frontend-des   99         1         1
deploymentconfig.apps.openshift.io/sicmo-web-des                 211        1         1
-sh-4.2$ oc get dc sicmo-internet-des -n sicmo-des -o yaml > internet.yaml
-sh-4.2$ oc get dc sicmo-intranet-des -n sicmo-des -o yaml > intranet.yaml   # ajuste o nome real
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sicmo-intranet-des" not found
-sh-4.2$ diff <(yq '.spec.template.spec.initContainers' intranet.yaml) <(yq '.spec.template.spec.initContainers' internet.yaml)
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$
-sh-4.2$
-sh-4.2$

<img width="1667" height="697" alt="image" src="https://github.com/user-attachments/assets/689619e5-791d-4de9-8d62-50663e2e66fc" />



