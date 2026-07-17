oc rollout history dc/sihdg-jboss8-des -n sihdg-des


oc get dc sihdg-jboss8-des -n sihdg-des -o jsonpath='{.status.latestVersion}'
oc rollout history dc/sihdg-jboss8-des -n sihdg-des --revision=<numero_da_ultima_revisao>


