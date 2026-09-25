
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug sijur-middleware-backend-v2-des-35-bcrxs -n sijur-des
Defaulting container name to sijur-middleware-backend-v2-des.
Use 'oc describe pod/sijur-middleware-backend-v2-des-35-bcrxs-debug -n sijur-des' to see all of the containers in this pod.

Debugging with pod/sijur-middleware-backend-v2-des-35-bcrxs-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$ oc cp sijur-des/<nome-do-pod-debug>:/deployments/SIJUR-middleware-backend-v2.jar ./sijur-v2-35.jar
sh: nome-do-pod-debug: No such file or directory
sh-4.4$ unzip -l sijur-v2-35.jar | grep -i -E 'componentes|model/Log.class'
sh: unzip: command not found
sh-4.4$ unzip -p sijur-v2-35.jar 'BOOT-INF/classes/br/com/sijur/componentes/model/Log.class' | grep -a -o -E '(javax|jakarta)/persistence/Entity'
sh: unzip: command not found
sh-4.4$ unzip -p sijur-v2-35.jar 'BOOT-INF/lib/<nome-exato-da-lib>.jar' > lib.jar
sh: unzip: command not found
sh-4.4$ unzip -p lib.jar 'br/com/sijur/componentes/model/Log.class' | grep -a -o -E '(javax|jakarta)/persistence/Entity'
sh: unzip: command not found
sh-4.4$ oc get rc sijur-middleware-backend-v2-des-31 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
sh: oc: command not found
sh-4.4$ oc get rc sijur-middleware-backend-v2-des-35 -n sijur-des -o jsonpath='{.spec.template.spec.containers[0].image}{"\n"}'
sh: oc: command not found
sh-4.4$
