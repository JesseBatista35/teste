oc debug dc/simtr-batch-des -n simtr-des -- java -version

oc run debug-simtr-batch --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtr-batch@sha256:d725135cd535529d5963592d77586af1b22522f6c340cc4848edc16f4e87b6de -n simtr-des --restart=Never --command -- java -version

oc run debug-simtr-batch --image=default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtr-batch@sha256:d725135cd535529d5963592d77586af1b22522f6c340cc4848edc16f4e87b6de -n simtr-des --restart=Never --command -- java -version
