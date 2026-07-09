
-sh-4.2$ oc get dc simtr-batch-des -n simtr-des -o jsonpath='{.spec.template.spec.containers[0].imagePullPolicy}{"\n"}'
Always
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc patch dc simtr-batch-des -n simtr-des --type=json -p '[{"op":"replace","path":"/spec/template/spec/containers/0/imagePullPolicy","value":"Always"}]' oc rollout latest dc/simtr-batch-des -n simtr-des
error: there is no need to specify a resource type as a separate argument when passing arguments in resource/name form (e.g. 'oc get resource/<resource_name>' instead of 'oc get resource resource/<resource_name>'
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
