
-sh-4.2$ oc describe imagestream sisgf-backend -n build-images-ads
Error from server (NotFound): imagestreams.image.openshift.io "sisgf-backend" not found
-sh-4.2$ oc get imagestream sisgf-backend -o yaml -n build-images-ads | grep -A 5 "docker:"
Error from server (NotFound): imagestreams.image.openshift.io "sisgf-backend" not found
-sh-4.2$
