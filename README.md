
-sh-4.2$
-sh-4.2$ oc patch deployment sispl-api-mkp-des -n sispl-des --type='json' -p='[
>   {"op": "replace", "path": "/spec/template/spec/containers/0/livenessProbe/initialDelaySeconds", "value": 45},
>   {"op": "replace", "path": "/spec/template/spec/containers/0/readinessProbe/initialDelaySeconds", "value": 60}
> ]'
deployment.apps/sispl-api-mkp-des patched
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
