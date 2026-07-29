oc get pods -n silce-des | grep silce-consulta-apostas-api


oc describe pod silce-consulta-apostas-api-des-8687f4b888-cvlzf -n silce-des | grep -A 20 "Liveness\|Readiness\|Limits\|Requests"


oc adm top pod silce-consulta-apostas-api-des-8687f4b888-cvlzf -n silce-des
