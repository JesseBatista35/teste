oc get pods -n sispl-tqs | grep pix

oc get route -n sispl-tqs | grep -i pix

oc logs sispl-canal-webhook-pix-tqs-68c674cf68-bhsvm -c sispl-canal-webhook-pix-tqs -n sispl-tqs --since=30m | grep -i -E "POST|webhook|pix|ERROR"


curl -v -m 5 http://localhost:8080/sispl-canal-webhook-pix/
