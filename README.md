for pod in $(oc get pods -n openshift-ingress -o jsonpath='{.items[*].metadata.name}'); do
  echo "=== $pod ==="
  oc logs $pod -n openshift-ingress --tail=1000 | grep -i "sigda-api-quarkus-des\|10.245.153"
done


oc get ingresscontroller default -n openshift-ingress-operator -o yaml | grep -A5 "accessLogging\|logging"
