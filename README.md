oc get deployment silce-consulta-apostas-api-des -n silce-des -o yaml | grep -A 15 readinessProbe


oc describe pod -l app=silce-consulta-apostas-api-des -n silce-des | grep -A 20 "Liveness\|Readiness\|Limits\|Requests"


oc adm top pod -l app=silce-consulta-apostas-api-des -n silce-des
