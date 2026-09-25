oc debug sijur-middleware-backend-v2-des-35-bcrxs -n sijur-des -- sleep 900 </dev/null >/dev/null 2>&1 &
sleep 20
oc get pod sijur-middleware-backend-v2-des-35-bcrxs-debug -n sijur-des



oc cp sijur-des/sijur-middleware-backend-v2-des-35-bcrxs-debug:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar
ls -lh sijur-v2-35.jar
unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'

oc get rc sijur-middleware-backend-v2-des-31 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
oc get rc sijur-middleware-backend-v2-des-35 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'

oc delete pod sijur-middleware-backend-v2-des-35-bcrxs-debug -n sijur-des
