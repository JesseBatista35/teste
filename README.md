oc get egressnetworkpolicy -n sispx-des
oc get egressnetworkpolicy -n sispx-des -o yaml

oc get networkpolicy -n sispx-des
oc get networkpolicy -n sispx-des -o yaml | grep -B3 -A15 -i egress

# para comparar com o sigel-tqs, que funciona
oc get egressnetworkpolicy -n sigel-tqs
oc get networkpolicy -n sigel-tqs
