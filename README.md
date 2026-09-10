
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-des -o jsonpath='{.spec.template.spec.containers[*].name}'
sihdg-jboss8-des-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set volume dc/sihdg-jboss8-des \
>   --add \
>   --name=sihdg-sinaf-data-des \
>   --type=persistentVolumeClaim \
>   --claim-name=sihdg-sinaf-data-des \
>   --mount-path=/sihdg_sinaf \
>   --containers=<nome-do-container>
-sh: erro de sintaxe próximo do `token' não esperado `newline'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
