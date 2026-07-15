
Removing debug pod ...
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp
NAME                                   READY     STATUS    RESTARTS   AGE
siabm-autenticacao-api-des-201-vqr9x   1/1       Running   0          5m
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pod siabm-autenticacao-api-des-201-vqr9x -n siabm-des -o jsonpath='{.spec.containers[0].image}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/siabm-autenticacao-api:7.1.2.0-SNAPSHOT-sh-4.2$ echo

-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rsh -c siabm-autenticacao-api-des siabm-autenticacao-api-des-201-vqr9x -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-201-vqr9x" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ ls -la $JAVA_HOME/jre/lib/ext/
ls: não é possível acessar /jre/lib/ext/: Arquivo ou diretório não encontrado
-sh-4.2$ find / -iname "*dinamo*" 2>/dev/null

