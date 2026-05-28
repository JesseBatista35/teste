
-sh-4.2$ oc get imagestream sisgf-backend -n sisgf-des -o yaml
Error from server (NotFound): imagestreams.image.openshift.io "sisgf-backend" not found
-sh-4.2$ oc describe imagestream sisgf-backend -n sisgf-des
Name:                   sisgf-backend-des
Namespace:              sisgf-des
Created:                17 months ago
Labels:                 app=sisgf-backend-des
                        application=sisgf-backend-des
                        template=quarkus-caixa-release
Description:            Keeps track of changes in the application image
Annotations:            openshift.io/generated-by=OpenShiftNewApp
Docker Pull Spec:       image-registry.openshift-image-registry.svc:5000/sisgf-des/sisgf-backend-des
Image Lookup:           local=false
Tags:                   <none>

-sh-4.2$ oc get imagestream -n sisgf-des
NAME                 IMAGE REPOSITORY                                                                TAGS      UPDATED
sisgf-api-des        image-registry.openshift-image-registry.svc:5000/sisgf-des/sisgf-api-des
sisgf-backend-des    image-registry.openshift-image-registry.svc:5000/sisgf-des/sisgf-backend-des
sisgf-batch-des      image-registry.openshift-image-registry.svc:5000/sisgf-des/sisgf-batch-des
sisgf-frontend-des   image-registry.openshift-image-registry.svc:5000/sisgf-des/sisgf-frontend-des
-sh-4.2$
