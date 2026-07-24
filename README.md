oc describe configmap nginx-conf-d-siavl-enviomsgativa-microfront -n siavl-des

oc get configmap nginx-conf-d-siavl-enviomsgativa-microfront -n siavl-des -o yaml

oc get pod -n siavl-des | grep siavl-enviomsgativa
oc get rs -n siavl-des | grep siavl-enviomsgativa
