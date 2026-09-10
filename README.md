
-sh-4.2$
-sh-4.2$ oc get pods -n openshift-ingress
NAME                              READY     STATUS    RESTARTS   AGE
router-default-556cdc9cb7-4lgb7   1/1       Running   0          408d
router-default-556cdc9cb7-bjj7f   1/1       Running   0          408d
router-default-556cdc9cb7-kr77m   1/1       Running   0          408d
router-default-556cdc9cb7-rrqln   1/1       Running   0          408d
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc logs <pod-do-router> -n openshift-ingress --tail=500 | grep -i "sigda-api-quarkus-des\|10.245.153"
-sh: pod-do-router: Arquivo ou diretório não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
