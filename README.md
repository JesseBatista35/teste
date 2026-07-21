oc get dc siavl-gerencial-backend-des -n siavl-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe.httpGet.path}'
oc get dc siavl-gerencial-backend-des -n siavl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe.httpGet.path}'



.requestMatchers("/actuator/health/**").permitAll()


oc rsh <pod> -n siavl-des
curl -v http://localhost:8080/actuator/health


