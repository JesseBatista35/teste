
-sh-4.2$ oc get pod simtr-batch-des-42-l42zw -n simtr-des -o jsonpath='{.spec.containers[0].image}{"\n"}'
Error from server (NotFound): pods "simtr-batch-des-42-l42zw" not found
-sh-4.2$ oc get dc simtr-batch-des -n simtr-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
default-route-openshift-image-registry.apps.produtos4.caixa/build-images-ads/simtr-batch:2.6.0.5
-sh-4.2$ oc logs simtr-batch-des-42-l42zw -n simtr-des
Error from server (NotFound): pods "simtr-batch-des-42-l42zw" not found
-sh-4.2$

