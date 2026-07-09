-sh-4.2$ oc rsh simtr-batch-des-43-xsvr8 java -version
Error from server (NotFound): pods "simtr-batch-des-43-xsvr8" not found
-sh-4.2$ oc get pod simtr-batch-des-43-xsvr8 -n simtr-des -o jsonpath='{.status.containerStatuses[0].imageID}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtr-batch@sha256:d725135cd535529d5963592d77586af1b22522f6c340cc4848edc16f4e87b6de
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
