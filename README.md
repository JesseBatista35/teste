oc get secret bt-client-secret-sipge-webhook-des -o jsonpath='{.data.BT_CLIENT_SECRET}' | base64 -d
oc get secret bt-client-secret-sipge-backend-des -o jsonpath='{.data.BT_CLIENT_SECRET}' | base64 -d
