oc get events -n sihdg-tqs --field-selector involvedObject.name=teste-egress


oc get pods -n openshift-sdn sdn-4wz4s -o jsonpath='{.spec.containers[0].image}{"\n"}'

oc delete pod teste-egress -n sihdg-tqs
