
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get dc sifgd-backend-des -n sifgd-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe.httpGet.path}{"\n"}{.spec.template.spec.containers[0].livenessProbe.httpGet.path}{"\n"}'
/actuator/health/readiness
/actuator/health/liveness
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
