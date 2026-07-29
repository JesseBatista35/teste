
-sh-4.2$ oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}' | jq
parse error: Invalid numeric literal at line 1, column 4
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get project sispl-des
NAME        DISPLAY NAME   STATUS
sispl-des                  Active
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}' | jq
parse error: Invalid numeric literal at line 1, column 4
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get deployment sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].readinessProbe}' | jq
parse error: Invalid numeric literal at line 1, column 4
-sh-4.2$
-sh-4.2$ oc get dc sispl-processamento-sumarizacao-des -n sispl-des -o jsonpath='{.spec.template.spec.containers[0].livenessProbe}' | jq
Error from server (NotFound): deploymentconfigs.apps.openshift.io "sispl-processamento-sumarizacao-des" not found
-sh-4.2$

