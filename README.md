oc get pods -n siavl-des | grep siavl-atddigital-backend-des

oc get dc siavl-atddigital-backend-des -n siavl-des -o yaml | grep -i -A5 -B5 "beyondtrust\|bt-client\|secrets-agent"

oc get deployment siavl-atddigital-backend-des -n siavl-des -o yaml | grep -i -A5 -B5 "beyondtrust\|bt-client\|secrets-agent"

oc get secret -n siavl-des
