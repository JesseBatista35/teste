oc debug sijur-middleware-backend-v2-des-35-bcrxs -n sijur-des

oc cp sijur-des/<nome-do-pod-debug>:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar

# A classe está no próprio app ou em alguma lib?
unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'

unzip -p sijur-v2-35.jar 'BOOT-INF/classes/br/com/sijur/componentes/model/Log.class' | grep -a -o -E '(javax|jakarta)/persistence/Entity'

unzip -p sijur-v2-35.jar 'BOOT-INF/lib/<nome-exato-da-lib>.jar' > lib.jar
unzip -p lib.jar 'br/com/sijur/componentes/model/Log.class' | grep -a -o -E '(javax|jakarta)/persistence/Entity'

oc get rc sijur-middleware-backend-v2-des-31 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
oc get rc sijur-middleware-backend-v2-des-35 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
