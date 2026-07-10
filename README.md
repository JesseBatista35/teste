oc get configmap jboss-config-sisam-backend-internet -n sisam-tqs -o yaml | grep -i "SISAM-BACKEND-INTERNET"


oc get configmap jboss-config-sisam-backend-internet -n sisam-tqs -o yaml > cm-jboss-tqs.yaml
# editar cm-jboss-tqs.yaml, trocar SISAM-BACKEND-INTERNET-DES -> SISAM-BACKEND-INTERNET-TQS
oc apply -f cm-jboss-tqs.yaml -n sisam-tqs
oc rollout latest dc/sisam-backend-internet-tqs -n sisam-tqs
