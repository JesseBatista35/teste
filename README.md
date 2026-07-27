oc get deployment sigfa-api-openfinance-des -n sigfa-des -o yaml | grep -A5 -i secret


oc get configmap -n sigfa-des | grep -i secret
oc describe configmap <nome-do-configmap> -n sigfa-des
