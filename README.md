oc rollout history dc/sihdg-jboss8-des -n sihdg-des


oc get dc sihdg-jboss8-des -n sihdg-des -o jsonpath='{.status.latestVersion}'
oc rollout history dc/sihdg-jboss8-des -n sihdg-des --revision=<numero_da_ultima_revisao>



-sh-4.2$ oc rollout history dc/sihdg-jboss8-des -n sihdg-des]
Error from server (NotFound): namespaces "sihdg-des]" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sihdg-jboss8-des -n sihdg-des -o jsonpath='{.status.latestVersion}'
30-sh-4.2$ oc rollout history dc/sihdg-jboss8-des -n sihdg-des --revision=<numero_da_ultima_revisao>
-sh: erro de sintaxe próximo do `token' não esperado `newline'
-sh-4.2$
