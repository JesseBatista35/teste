oc get deployment sispl-captacao-mkp-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].image}'

oc set image deployment/sispl-captacao-mkp-des sispl-captacao-mkp-des=<registry-nexus>/sispl-des/sispl-captacao-mkp-des:2.5.0.3 -n sispl-des

oc get sa default -n sispl-des -o yaml | grep -i pull
oc get secrets -n sispl-des | grep -i pull

