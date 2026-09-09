oc get dc sihdg-jboss8-des -o yaml | grep -A 20 "volumes:"

oc get dc sihdg-jboss8-des -o yaml > sihdg-jboss8-des-dc.yaml

oc logs sihdg-jboss8-des-89-deploy
