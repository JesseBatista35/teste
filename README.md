oc set env dc/sigfa-api-aplicacao-okd4-pos-tqs --list -n sigfa-tqs | grep -i client_id
oc get secret <nome-do-secret-bt> -n sigfa-tqs -o yaml


