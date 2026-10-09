   oc get dc sifgd-backend-des -n sifgd-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe.httpGet.path}{"\n"}{.spec.template.spec.containers[0].livenessProbe.httpGet.path}{"\n"}'
