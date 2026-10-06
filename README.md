oc get pv sicmo-internet-data-des -o yaml | grep -A4 'nfs:'
oc get pv sicmo-backend-data-des  -o yaml | grep -A4 'nfs:'


oc get events -n sicmo-des --field-selector involvedObject.name=sicmo-internet-des-94-kn4qr
