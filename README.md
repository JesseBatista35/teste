
oc create cm jboss-config-sihdg-jboss8 -n sihdg-des --from-file=standalone-okd.xml=~/standalone-okd.xml --dry-run=true -o yaml | oc apply -f -


oc rollout latest dc/sihdg-jboss8-des -n sihdg-des

oc rollout status dc/sihdg-jboss8-des -n sihdg-des --watch
