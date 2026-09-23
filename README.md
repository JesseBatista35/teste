oc set env dc/sipnc-manutseletjudicialpj-backend-tqs --list -n sipnc-tqs
oc get dc sipnc-manutseletjudicialpj-backend-tqs -n sipnc-tqs -o jsonpath='{.spec.template.spec.containers[0].envFrom}'
oc get cm,secret -n sipnc-tqs | grep -i manutseletjudicialpj
