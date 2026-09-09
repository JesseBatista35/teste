oc get dc sihdg-jboss8-des -o jsonpath='{.spec.template.spec.containers[*].name}'



oc set volume dc/sihdg-jboss8-des \
  --add \
  --name=sihdg-sinaf-data-des \
  --type=persistentVolumeClaim \
  --claim-name=sihdg-sinaf-data-des \
  --mount-path=/sihdg_sinaf \
  --containers=<nome-do-container>


  oc rollout status dc/sihdg-jboss8-des

  oc rsh $(oc get pod -l deploymentconfig=sihdg-jboss8-des -o jsonpath='{.items[0].metadata.name}')
ls -la /sihdg_sinaf
df -h /sihdg_sinaf
