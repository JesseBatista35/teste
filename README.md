oc delete bc/sihdg-jboss8 -n build-images-ads

oc new-build \
  --name sihdg-jboss8 \
  --strategy source \
  --image-stream jboss-eap-8-openjdk21-openshift-rhel9:latest \
  -n build-images-ads



  oc new-build \
  --name sihdg-jboss8 \
  --strategy source \
  --image-stream openshift/jboss-eap-8-openjdk21-openshift-rhel9:latest \
  -n build-images-ads




  oc start-build sihdg-jboss8 \
  --from-dir=. \
  --follow \
  --wait=true \
  -n build-images-ads


  

