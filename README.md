
-sh-4.2$
-sh-4.2$ oc patch deployment sispl-processamento-sumarizacao-des -n sispl-des --type='json' -p='[
>   {"op":"replace","path":"/spec/template/spec/containers/0/livenessProbe/timeoutSeconds","value":5},
>   {"op":"replace","path":"/spec/template/spec/containers/0/readinessProbe/timeoutSeconds","value":5}
> ]'
deployment.apps/sispl-processamento-sumarizacao-des patched
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout status deployment/sispl-processamento-sumarizacao-des -n sispl-des
Waiting for deployment "sispl-processamento-sumarizacao-des" rollout to finish: 1 old replicas are pending termination...
Waiting for deployment "sispl-processamento-sumarizacao-des" rollout to finish: 1 old replicas are pending termination...
Waiting for deployment "sispl-processamento-sumarizacao-des" rollout to finish: 1 old replicas are pending termination...
Waiting for deployment "sispl-processamento-sumarizacao-des" rollout to finish: 1 old replicas are pending termination...
deployment "sispl-processamento-sumarizacao-des" successfully rolled out
-sh-4.2$ ^C
-sh-4.2$ oc exec -it sispl-processamento-sumarizacao-des-574688844-rkvrn -n sispl-des -- cat /opt/jboss/bin/livenessProbe.sh
error: Internal error occurred: error executing command in container: container is not created or running
-sh-4.2$
