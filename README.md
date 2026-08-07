oc get sa -n siavl-des -o yaml | grep -i beyondtrust
oc get secretproviderclass -n siavl-des
oc get all -n siavl-des | grep -i secret-agent


oc delete pod siavl-atddigital-backend-des-123-wk6ct -n siavl-des

oc get secret -n siavl-des | grep bt-client-secret
oc get secret bt-client-secret-<outro-app-mesmo-padrao> -n siavl-des -o yaml
