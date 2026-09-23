oc set env dc/sipnc-manutseletjudicialpj-backend-des --list -n sipnc-des
oc get secret sipnc-manutseletjudicialpj-backend-des -n sipnc-des -o jsonpath='{.data}' | tr ',' '\n' | cut -d: -f1
oc get dc sipnc-manutseletjudicialpj-backend-des -n sipnc-des -o jsonpath='{.spec.template.spec.containers[0].envFrom}'

oc debug dc/sipnc-manutseletjudicialpj-backend-tqs -n sipnc-tqs -- sh -c 'cd /tmp && unzip -l /deployments/SIPNC-manutseletjudicialpj-backend.jar | grep -i "application.*\.\(properties\|yml\)"'

oc set env dc/sipnc-manutseletjudicialpj-backend-tqs SPRING_PROFILES_ACTIVE=tqs -n sipnc-tqs

