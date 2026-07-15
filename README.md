
-sh-4.2$
-sh-4.2$ oc rsh -c siabm-autenticacao-api-des $(oc get pods -n siabm-des -l deploymentconfig=siabm-autenticacao-api-des --sort-by=.metadata.creationTimestamp -o jsonpath='{.items[-1:].metadata.name}') -n siabm-des
Error from server (NotFound): pods "siabm-autenticacao-api-des-199-wrsg5" not found
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc debug dc/siabm-autenticacao-api-des -n siabm-des
Defaulting container name to siabm-autenticacao-api-des.
Use 'oc describe pod/siabm-autenticacao-api-des-debug -n siabm-des' to see all of the containers in this pod.

Debugging with pod/siabm-autenticacao-api-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
If you don't see a command prompt, try pressing enter.
sh-4.4$ ls -la /opt/jboss/bin/*Probe* 2>&1
ls: cannot access '/opt/jboss/bin/*Probe*': No such file or directory
sh-4.4$ find / -iname "readinessProbe.sh" 2>/dev/null
sh-4.4$ find / -iname "livenessProbe.sh" 2>/dev/null
sh-4.4$
sh-4.4$
sh-4.4$
sh-4.4$
