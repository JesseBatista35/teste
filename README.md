oc rollout latest dc/sihdg-jboss8-des


oc rollout status dc/sihdg-jboss8-des

oc get pods | grep sihdg-jboss8-des
oc rsh $(oc get pod -l deploymentconfig=sihdg-jboss8-des,deployment=sihdg-jboss8-des-90 -o jsonpath='{.items[0].metadata.name}')
ls -la /sihdg_sinaf
