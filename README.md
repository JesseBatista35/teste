oc rsh $(oc get pod -l deploymentconfig=sihdg-jboss8-des --field-selector=status.phase=Running -o jsonpath='{.items[0].metadata.name}')

df -h /sihdg_sinaf /sihdg_des
